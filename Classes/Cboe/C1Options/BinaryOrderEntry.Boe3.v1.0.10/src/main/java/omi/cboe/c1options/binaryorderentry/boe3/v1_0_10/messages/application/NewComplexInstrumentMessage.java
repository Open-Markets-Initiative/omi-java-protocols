package omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.ClOrdIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.ClearingFirmField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.LegCntField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.fields.ScratchPadField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.groups.ComplexLegEntry;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.groups.ComplexLegList;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.types.Field;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.types.Message;
import omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.types.PrintOptions;

/**
 * Represents the NewComplexInstrumentMessage message from the BinaryOrderEntry protocol.
 *
 * <p>A New Complex Instrument message is used to request that the system create a complex strategy.</p>
 */
public final class NewComplexInstrumentMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 27;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Complex Instrument Message";

    /**
     * ID chosen by the client
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * EFID that will clear the trade
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Field ignored by Cboe (any value is accepted)
     */
    private final ScratchPadField scratchPad = new ScratchPadField();

    /**
     * Number of leg repeating groups in the message
     */
    private final LegCntField legCnt = new LegCntField();

    /**
     * Complex Leg
     */
    private final ComplexLegList complexLeg = new ComplexLegList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clOrdId, clearingFirm, scratchPad, legCnt);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID chosen by the client
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * EFID that will clear the trade
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Field ignored by Cboe (any value is accepted)
     *
     * @return the ScratchPad field
     */
    public ScratchPadField scratchPad() {
        return scratchPad;
    }

    /**
     * Number of leg repeating groups in the message
     *
     * @return the LegCnt field
     */
    public LegCntField legCnt() {
        return legCnt;
    }

    /**
     * Complex Leg
     *
     * <p>Encode writes this list's size to the LegCnt field.</p>
     *
     * @return the ComplexLeg entries
     */
    public ComplexLegList complexLeg() {
        return complexLeg;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + complexLeg.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.empty();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!scratchPad.parse(data, cursor)) {
            return false;
        }
        cursor += ScratchPadField.BYTE_LENGTH;
        if (!legCnt.parse(data, cursor)) {
            return false;
        }
        cursor += LegCntField.BYTE_LENGTH;
        if (!complexLeg.parse(data, cursor, end, legCnt.value())) {
            return false;
        }
        cursor += complexLeg.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (complexLeg.size() > 255) {
            throw new IllegalStateException("complexLeg holds " + complexLeg.size() + " entries, more than its count field can state");
        }
        legCnt.value((short) complexLeg.size());
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = scratchPad.encode(data, cursor);
        cursor = legCnt.encode(data, cursor);
        cursor = complexLeg.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        complexLeg.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != legCnt && !field.isRecognized()) {
                return false;
            }
        }
        return complexLeg.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != legCnt && !field.isValid()) {
                return false;
            }
        }
        if (!complexLeg.isValid()) {
            return false;
        }
        return isRecognized();
    }

    /**
     * Returns a copy of the bytes this message was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the message bytes, or empty when no decode has been attempted
     */
    @Override
    public Optional<byte[]> raw() {
        if (buffer == null) {
            return Optional.empty();
        }
        return Optional.of(buffer.clone());
    }

    @Override
    public Optional<Field> failedAt() {
        if (buffer == null || decoded) {
            return Optional.empty();
        }
        if (!clOrdId.isDecoded()) {
            return Optional.of(clOrdId);
        }
        if (!clearingFirm.isDecoded()) {
            return Optional.of(clearingFirm);
        }
        if (!scratchPad.isDecoded()) {
            return Optional.of(scratchPad);
        }
        if (!legCnt.isDecoded()) {
            return Optional.of(legCnt);
        }
        if (!complexLeg.isDecoded()) {
            return Optional.of(complexLeg.failedEntry().flatMap(ComplexLegEntry::failedAt).orElse(legCnt));
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "ClOrdId" -> Optional.of(clOrdId);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ScratchPad" -> Optional.of(scratchPad);
            case "LegCnt" -> Optional.of(legCnt);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewComplexInstrumentMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(complexLeg.diffFields(message.complexLeg));
        return changed;
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    /**
     * Appends this message's formatted representation.
     *
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
     *
     * @param builder the destination
     * @param options the display options
     */
    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.identifier()) {
            builder.append(NAME);
            return;
        }

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
            builder.append(", ");
            complexLeg.toFormattedString(builder, options);
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : fields) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
        complexLeg.toFormattedString(builder, nested);
    }

    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewComplexInstrumentMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && complexLeg.equals(message.complexLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, complexLeg);
    }
}
