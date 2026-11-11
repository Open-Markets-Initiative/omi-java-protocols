package omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.CorrelationIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.ExecIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.MmpGroupIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.QuoteIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.ReceiveTimeField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.TimestampField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.MassQuoteResponseMessageAskFillsGroups;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.MassQuoteResponseMessageBidFillsGroups;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.MassQuoteResponseMessageLegsGroups;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.MassQuoteResponseMessageQuotesGroups;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.Field;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.Message;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.PrintOptions;

/**
 * Represents the MassQuoteResponseMessage message from the OrdersApi protocol.
 *
 * <p>MassQuoteResponseMessage</p>
 */
public final class MassQuoteResponseMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 64;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mass Quote Response Message";

    /**
     * timestamp
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * execId
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * quoteId
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * correlationId
     */
    private final CorrelationIdField correlationId = new CorrelationIdField();

    /**
     * mmpGroupId
     */
    private final MmpGroupIdField mmpGroupId = new MmpGroupIdField();

    /**
     * receiveTime
     */
    private final ReceiveTimeField receiveTime = new ReceiveTimeField();

    /**
     * quotes Block
     */
    private final MassQuoteResponseMessageQuotesGroups massQuoteResponseMessageQuotesGroups = new MassQuoteResponseMessageQuotesGroups();

    /**
     * bidFills Block
     */
    private final MassQuoteResponseMessageBidFillsGroups massQuoteResponseMessageBidFillsGroups = new MassQuoteResponseMessageBidFillsGroups();

    /**
     * askFills Block
     */
    private final MassQuoteResponseMessageAskFillsGroups massQuoteResponseMessageAskFillsGroups = new MassQuoteResponseMessageAskFillsGroups();

    /**
     * legs Block
     */
    private final MassQuoteResponseMessageLegsGroups massQuoteResponseMessageLegsGroups = new MassQuoteResponseMessageLegsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, execId, quoteId, correlationId, mmpGroupId, receiveTime);

    private byte[] buffer;

    private boolean decoded;

    /**
     * timestamp
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * execId
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * quoteId
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
    }

    /**
     * correlationId
     *
     * @return the CorrelationId field
     */
    public CorrelationIdField correlationId() {
        return correlationId;
    }

    /**
     * mmpGroupId
     *
     * @return the MmpGroupId field
     */
    public MmpGroupIdField mmpGroupId() {
        return mmpGroupId;
    }

    /**
     * receiveTime
     *
     * @return the ReceiveTime field
     */
    public ReceiveTimeField receiveTime() {
        return receiveTime;
    }

    /**
     * quotes Block
     *
     * @return the MassQuoteResponseMessageQuotesGroups record
     */
    public MassQuoteResponseMessageQuotesGroups massQuoteResponseMessageQuotesGroups() {
        return massQuoteResponseMessageQuotesGroups;
    }

    /**
     * bidFills Block
     *
     * @return the MassQuoteResponseMessageBidFillsGroups record
     */
    public MassQuoteResponseMessageBidFillsGroups massQuoteResponseMessageBidFillsGroups() {
        return massQuoteResponseMessageBidFillsGroups;
    }

    /**
     * askFills Block
     *
     * @return the MassQuoteResponseMessageAskFillsGroups record
     */
    public MassQuoteResponseMessageAskFillsGroups massQuoteResponseMessageAskFillsGroups() {
        return massQuoteResponseMessageAskFillsGroups;
    }

    /**
     * legs Block
     *
     * @return the MassQuoteResponseMessageLegsGroups record
     */
    public MassQuoteResponseMessageLegsGroups massQuoteResponseMessageLegsGroups() {
        return massQuoteResponseMessageLegsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + massQuoteResponseMessageQuotesGroups.byteLength() - MassQuoteResponseMessageQuotesGroups.MINIMUM_BYTE_LENGTH + massQuoteResponseMessageBidFillsGroups.byteLength() - MassQuoteResponseMessageBidFillsGroups.MINIMUM_BYTE_LENGTH + massQuoteResponseMessageAskFillsGroups.byteLength() - MassQuoteResponseMessageAskFillsGroups.MINIMUM_BYTE_LENGTH + massQuoteResponseMessageLegsGroups.byteLength() - MassQuoteResponseMessageLegsGroups.MINIMUM_BYTE_LENGTH;
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
        return Optional.ofNullable(timestampField.value());
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!correlationId.parse(data, cursor)) {
            return false;
        }
        cursor += CorrelationIdField.BYTE_LENGTH;
        if (!mmpGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += MmpGroupIdField.BYTE_LENGTH;
        if (!receiveTime.parse(data, cursor)) {
            return false;
        }
        cursor += ReceiveTimeField.BYTE_LENGTH;
        if (!massQuoteResponseMessageQuotesGroups.parseFrom(data, cursor, end - 12)) {
            return false;
        }
        cursor += massQuoteResponseMessageQuotesGroups.byteLength();
        if (end - cursor < 12) {
            return false;
        }
        if (!massQuoteResponseMessageBidFillsGroups.parseFrom(data, cursor, end - 8)) {
            return false;
        }
        cursor += massQuoteResponseMessageBidFillsGroups.byteLength();
        if (end - cursor < 8) {
            return false;
        }
        if (!massQuoteResponseMessageAskFillsGroups.parseFrom(data, cursor, end - 4)) {
            return false;
        }
        cursor += massQuoteResponseMessageAskFillsGroups.byteLength();
        if (end - cursor < 4) {
            return false;
        }
        if (!massQuoteResponseMessageLegsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += massQuoteResponseMessageLegsGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = quoteId.encode(data, cursor);
        cursor = correlationId.encode(data, cursor);
        cursor = mmpGroupId.encode(data, cursor);
        cursor = receiveTime.encode(data, cursor);
        cursor = massQuoteResponseMessageQuotesGroups.encode(data, cursor);
        cursor = massQuoteResponseMessageBidFillsGroups.encode(data, cursor);
        cursor = massQuoteResponseMessageAskFillsGroups.encode(data, cursor);
        cursor = massQuoteResponseMessageLegsGroups.encode(data, cursor);
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
        massQuoteResponseMessageQuotesGroups.clear();
        massQuoteResponseMessageBidFillsGroups.clear();
        massQuoteResponseMessageAskFillsGroups.clear();
        massQuoteResponseMessageLegsGroups.clear();
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
            if (!field.isRecognized()) {
                return false;
            }
        }
        if (!massQuoteResponseMessageQuotesGroups.isRecognized()) {
            return false;
        }
        if (!massQuoteResponseMessageBidFillsGroups.isRecognized()) {
            return false;
        }
        if (!massQuoteResponseMessageAskFillsGroups.isRecognized()) {
            return false;
        }
        return massQuoteResponseMessageLegsGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!massQuoteResponseMessageQuotesGroups.isValid()) {
            return false;
        }
        if (!massQuoteResponseMessageBidFillsGroups.isValid()) {
            return false;
        }
        if (!massQuoteResponseMessageAskFillsGroups.isValid()) {
            return false;
        }
        if (!massQuoteResponseMessageLegsGroups.isValid()) {
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
        if (!timestampField.isDecoded()) {
            return Optional.of(timestampField);
        }
        if (!execId.isDecoded()) {
            return Optional.of(execId);
        }
        if (!quoteId.isDecoded()) {
            return Optional.of(quoteId);
        }
        if (!correlationId.isDecoded()) {
            return Optional.of(correlationId);
        }
        if (!mmpGroupId.isDecoded()) {
            return Optional.of(mmpGroupId);
        }
        if (!receiveTime.isDecoded()) {
            return Optional.of(receiveTime);
        }
        if (!massQuoteResponseMessageQuotesGroups.isDecoded()) {
            return massQuoteResponseMessageQuotesGroups.failedAt();
        }
        if (!massQuoteResponseMessageBidFillsGroups.isDecoded()) {
            return massQuoteResponseMessageBidFillsGroups.failedAt();
        }
        if (!massQuoteResponseMessageAskFillsGroups.isDecoded()) {
            return massQuoteResponseMessageAskFillsGroups.failedAt();
        }
        if (!massQuoteResponseMessageLegsGroups.isDecoded()) {
            return massQuoteResponseMessageLegsGroups.failedAt();
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
            case "Timestamp" -> Optional.of(timestampField);
            case "ExecId" -> Optional.of(execId);
            case "QuoteId" -> Optional.of(quoteId);
            case "CorrelationId" -> Optional.of(correlationId);
            case "MmpGroupId" -> Optional.of(mmpGroupId);
            case "ReceiveTime" -> Optional.of(receiveTime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MassQuoteResponseMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(massQuoteResponseMessageQuotesGroups.diffFields(message.massQuoteResponseMessageQuotesGroups));
        changed.addAll(massQuoteResponseMessageBidFillsGroups.diffFields(message.massQuoteResponseMessageBidFillsGroups));
        changed.addAll(massQuoteResponseMessageAskFillsGroups.diffFields(message.massQuoteResponseMessageAskFillsGroups));
        changed.addAll(massQuoteResponseMessageLegsGroups.diffFields(message.massQuoteResponseMessageLegsGroups));
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
            massQuoteResponseMessageQuotesGroups.toFormattedString(builder, options);
            builder.append(", ");
            massQuoteResponseMessageBidFillsGroups.toFormattedString(builder, options);
            builder.append(", ");
            massQuoteResponseMessageAskFillsGroups.toFormattedString(builder, options);
            builder.append(", ");
            massQuoteResponseMessageLegsGroups.toFormattedString(builder, options);
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
        massQuoteResponseMessageQuotesGroups.toFormattedString(builder, nested);
        massQuoteResponseMessageBidFillsGroups.toFormattedString(builder, nested);
        massQuoteResponseMessageAskFillsGroups.toFormattedString(builder, nested);
        massQuoteResponseMessageLegsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof MassQuoteResponseMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && massQuoteResponseMessageQuotesGroups.equals(message.massQuoteResponseMessageQuotesGroups) && massQuoteResponseMessageBidFillsGroups.equals(message.massQuoteResponseMessageBidFillsGroups) && massQuoteResponseMessageAskFillsGroups.equals(message.massQuoteResponseMessageAskFillsGroups) && massQuoteResponseMessageLegsGroups.equals(message.massQuoteResponseMessageLegsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, massQuoteResponseMessageQuotesGroups, massQuoteResponseMessageBidFillsGroups, massQuoteResponseMessageAskFillsGroups, massQuoteResponseMessageLegsGroups);
    }
}
