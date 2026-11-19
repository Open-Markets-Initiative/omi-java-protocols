package omi.moex.spectra.orderslogreplay.simba.v9_9_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.moex.spectra.orderslogreplay.simba.v9_9_0.fields.MdEntryIdIntField;
import omi.moex.spectra.orderslogreplay.simba.v9_9_0.fields.MdEntryPxDecimalField;
import omi.moex.spectra.orderslogreplay.simba.v9_9_0.fields.MdEntrySizeIntField;
import omi.moex.spectra.orderslogreplay.simba.v9_9_0.fields.MdEntryTypeField;
import omi.moex.spectra.orderslogreplay.simba.v9_9_0.fields.MdFlags2Field;
import omi.moex.spectra.orderslogreplay.simba.v9_9_0.fields.MdFlagsField;
import omi.moex.spectra.orderslogreplay.simba.v9_9_0.fields.MdUpdateActionField;
import omi.moex.spectra.orderslogreplay.simba.v9_9_0.fields.RptSeqField;
import omi.moex.spectra.orderslogreplay.simba.v9_9_0.fields.SecurityIdField;
import omi.moex.spectra.orderslogreplay.simba.v9_9_0.types.Field;
import omi.moex.spectra.orderslogreplay.simba.v9_9_0.types.Message;
import omi.moex.spectra.orderslogreplay.simba.v9_9_0.types.PrintOptions;

/**
 * Represents the OrderUpdateMessage message from the OrdersLogReplay protocol.
 *
 * <p>OrderUpdateMessage</p>
 */
public final class OrderUpdateMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 50;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Update Message";

    /**
     * MDEntryID
     */
    private final MdEntryIdIntField mdEntryIdInt = new MdEntryIdIntField();

    /**
     * MDEntryPx
     */
    private final MdEntryPxDecimalField mdEntryPxDecimal = new MdEntryPxDecimalField();

    /**
     * MDEntrySize
     */
    private final MdEntrySizeIntField mdEntrySizeInt = new MdEntrySizeIntField();

    /**
     * MDFlagsSet bit set
     */
    private final MdFlagsField mdFlags = new MdFlagsField();

    /**
     * MDFlags2Set bit set
     */
    private final MdFlags2Field mdFlags2 = new MdFlags2Field();

    /**
     * SecurityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * RptSeq
     */
    private final RptSeqField rptSeq = new RptSeqField();

    /**
     * MDUpdateAction
     */
    private final MdUpdateActionField mdUpdateAction = new MdUpdateActionField();

    /**
     * MDEntryType
     */
    private final MdEntryTypeField mdEntryType = new MdEntryTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(mdEntryIdInt, mdEntryPxDecimal, mdEntrySizeInt, mdFlags, mdFlags2, securityId, rptSeq, mdUpdateAction, mdEntryType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * MDEntryID
     *
     * @return the MdEntryIdInt field
     */
    public MdEntryIdIntField mdEntryIdInt() {
        return mdEntryIdInt;
    }

    /**
     * MDEntryPx
     *
     * @return the MdEntryPxDecimal field
     */
    public MdEntryPxDecimalField mdEntryPxDecimal() {
        return mdEntryPxDecimal;
    }

    /**
     * MDEntrySize
     *
     * @return the MdEntrySizeInt field
     */
    public MdEntrySizeIntField mdEntrySizeInt() {
        return mdEntrySizeInt;
    }

    /**
     * MDFlagsSet bit set
     *
     * @return the MdFlags field
     */
    public MdFlagsField mdFlags() {
        return mdFlags;
    }

    /**
     * MDFlags2Set bit set
     *
     * @return the MdFlags2 field
     */
    public MdFlags2Field mdFlags2() {
        return mdFlags2;
    }

    /**
     * SecurityID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * RptSeq
     *
     * @return the RptSeq field
     */
    public RptSeqField rptSeq() {
        return rptSeq;
    }

    /**
     * MDUpdateAction
     *
     * @return the MdUpdateAction field
     */
    public MdUpdateActionField mdUpdateAction() {
        return mdUpdateAction;
    }

    /**
     * MDEntryType
     *
     * @return the MdEntryType field
     */
    public MdEntryTypeField mdEntryType() {
        return mdEntryType;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!mdEntryIdInt.parse(data, cursor)) {
            return false;
        }
        cursor += MdEntryIdIntField.BYTE_LENGTH;
        if (!mdEntryPxDecimal.parse(data, cursor)) {
            return false;
        }
        cursor += MdEntryPxDecimalField.BYTE_LENGTH;
        if (!mdEntrySizeInt.parse(data, cursor)) {
            return false;
        }
        cursor += MdEntrySizeIntField.BYTE_LENGTH;
        if (!mdFlags.parse(data, cursor)) {
            return false;
        }
        cursor += MdFlagsField.BYTE_LENGTH;
        if (!mdFlags2.parse(data, cursor)) {
            return false;
        }
        cursor += MdFlags2Field.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!rptSeq.parse(data, cursor)) {
            return false;
        }
        cursor += RptSeqField.BYTE_LENGTH;
        if (!mdUpdateAction.parse(data, cursor)) {
            return false;
        }
        cursor += MdUpdateActionField.BYTE_LENGTH;
        return mdEntryType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = mdEntryIdInt.encode(data, cursor);
        cursor = mdEntryPxDecimal.encode(data, cursor);
        cursor = mdEntrySizeInt.encode(data, cursor);
        cursor = mdFlags.encode(data, cursor);
        cursor = mdFlags2.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = rptSeq.encode(data, cursor);
        cursor = mdUpdateAction.encode(data, cursor);
        cursor = mdEntryType.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
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
        for (Field field : fields) {
            if (!field.isDecoded()) {
                return Optional.of(field);
            }
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
            case "MdEntryIdInt" -> Optional.of(mdEntryIdInt);
            case "MdEntryPxDecimal" -> Optional.of(mdEntryPxDecimal);
            case "MdEntrySizeInt" -> Optional.of(mdEntrySizeInt);
            case "MdFlags" -> Optional.of(mdFlags);
            case "MdFlags2" -> Optional.of(mdFlags2);
            case "SecurityId" -> Optional.of(securityId);
            case "RptSeq" -> Optional.of(rptSeq);
            case "MdUpdateAction" -> Optional.of(mdUpdateAction);
            case "MdEntryType" -> Optional.of(mdEntryType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderUpdateMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof OrderUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
