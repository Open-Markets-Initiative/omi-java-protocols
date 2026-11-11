package omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.fields.CanceledCountField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.fields.CorrelationIdField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.fields.ExecIdField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.fields.OnlyCurrentSessionField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.fields.TimestampField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.fields.TradingLockAppliedField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.types.Field;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.types.Message;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.types.PrintOptions;

/**
 * Represents the MassCancelOrderAckMessage message from the OrdersApi protocol.
 *
 * <p>MassCancelOrderAckMessage</p>
 */
public final class MassCancelOrderAckMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 30;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mass Cancel Order Ack Message";

    /**
     * Nanoseconds since epoch
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * execId
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * correlationId
     */
    private final CorrelationIdField correlationId = new CorrelationIdField();

    /**
     * canceledCount
     */
    private final CanceledCountField canceledCount = new CanceledCountField();

    /**
     * onlyCurrentSession
     */
    private final OnlyCurrentSessionField onlyCurrentSession = new OnlyCurrentSessionField();

    /**
     * tradingLockApplied
     */
    private final TradingLockAppliedField tradingLockApplied = new TradingLockAppliedField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, execId, correlationId, canceledCount, onlyCurrentSession, tradingLockApplied);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since epoch
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
     * correlationId
     *
     * @return the CorrelationId field
     */
    public CorrelationIdField correlationId() {
        return correlationId;
    }

    /**
     * canceledCount
     *
     * @return the CanceledCount field
     */
    public CanceledCountField canceledCount() {
        return canceledCount;
    }

    /**
     * onlyCurrentSession
     *
     * @return the OnlyCurrentSession field
     */
    public OnlyCurrentSessionField onlyCurrentSession() {
        return onlyCurrentSession;
    }

    /**
     * tradingLockApplied
     *
     * @return the TradingLockApplied field
     */
    public TradingLockAppliedField tradingLockApplied() {
        return tradingLockApplied;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
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
        if (!correlationId.parse(data, cursor)) {
            return false;
        }
        cursor += CorrelationIdField.BYTE_LENGTH;
        if (!canceledCount.parse(data, cursor)) {
            return false;
        }
        cursor += CanceledCountField.BYTE_LENGTH;
        if (!onlyCurrentSession.parse(data, cursor)) {
            return false;
        }
        cursor += OnlyCurrentSessionField.BYTE_LENGTH;
        return tradingLockApplied.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = correlationId.encode(data, cursor);
        cursor = canceledCount.encode(data, cursor);
        cursor = onlyCurrentSession.encode(data, cursor);
        cursor = tradingLockApplied.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "ExecId" -> Optional.of(execId);
            case "CorrelationId" -> Optional.of(correlationId);
            case "CanceledCount" -> Optional.of(canceledCount);
            case "OnlyCurrentSession" -> Optional.of(onlyCurrentSession);
            case "TradingLockApplied" -> Optional.of(tradingLockApplied);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MassCancelOrderAckMessage message)) {
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
        if (!(other instanceof MassCancelOrderAckMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
