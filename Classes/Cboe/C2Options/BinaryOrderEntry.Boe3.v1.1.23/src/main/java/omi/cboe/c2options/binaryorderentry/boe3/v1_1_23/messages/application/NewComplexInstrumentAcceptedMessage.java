package omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.fields.ClOrdIdField;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.fields.InFlightField;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.fields.LegCntField;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.fields.NoOfSecuritiesField;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.fields.SymbolField;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.fields.TransactionTimeField;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.groups.ComplexLegEntry;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.groups.ComplexLegList;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.types.Field;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.types.Message;
import omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.types.PrintOptions;

/**
 * Represents the NewComplexInstrumentAcceptedMessage message from the BinaryOrderEntry protocol.
 *
 * <p>The New Complex Instrument Accepted message is used to indicate acceptance of a complex strategy</p>
 */
public final class NewComplexInstrumentAcceptedMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 43;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Complex Instrument Accepted Message";

    /**
     * Total number of messages "in-flight" from the port
     */
    private final InFlightField inFlight = new InFlightField();

    /**
     * The exchange timestamp of the transaction
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * ID chosen by the client
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Entire Cboe format symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Indicates the number of securities created by the member in this trading session
     */
    private final NoOfSecuritiesField noOfSecurities = new NoOfSecuritiesField();

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
    private final List<Field> fields = List.of(inFlight, transactionTime, clOrdId, symbol, noOfSecurities, legCnt);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Total number of messages "in-flight" from the port
     *
     * @return the InFlight field
     */
    public InFlightField inFlight() {
        return inFlight;
    }

    /**
     * The exchange timestamp of the transaction
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * ID chosen by the client
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Entire Cboe format symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Indicates the number of securities created by the member in this trading session
     *
     * @return the NoOfSecurities field
     */
    public NoOfSecuritiesField noOfSecurities() {
        return noOfSecurities;
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
        return Optional.ofNullable(transactionTime.value());
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
        if (!inFlight.parse(data, cursor)) {
            return false;
        }
        cursor += InFlightField.BYTE_LENGTH;
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!noOfSecurities.parse(data, cursor)) {
            return false;
        }
        cursor += NoOfSecuritiesField.BYTE_LENGTH;
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
        cursor = inFlight.encode(data, cursor);
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = noOfSecurities.encode(data, cursor);
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
        if (!inFlight.isDecoded()) {
            return Optional.of(inFlight);
        }
        if (!transactionTime.isDecoded()) {
            return Optional.of(transactionTime);
        }
        if (!clOrdId.isDecoded()) {
            return Optional.of(clOrdId);
        }
        if (!symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (!noOfSecurities.isDecoded()) {
            return Optional.of(noOfSecurities);
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
            case "InFlight" -> Optional.of(inFlight);
            case "TransactionTime" -> Optional.of(transactionTime);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "Symbol" -> Optional.of(symbol);
            case "NoOfSecurities" -> Optional.of(noOfSecurities);
            case "LegCnt" -> Optional.of(legCnt);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewComplexInstrumentAcceptedMessage message)) {
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
        if (!(other instanceof NewComplexInstrumentAcceptedMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && complexLeg.equals(message.complexLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, complexLeg);
    }
}
