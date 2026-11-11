package omi.eurex.t7.eobi.fbe.v3_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eobi.fbe.v3_0.fields.AggressorSideField;
import omi.eurex.t7.eobi.fbe.v3_0.fields.AggressorTimestampField;
import omi.eurex.t7.eobi.fbe.v3_0.fields.ExecIdField;
import omi.eurex.t7.eobi.fbe.v3_0.fields.LastPxField;
import omi.eurex.t7.eobi.fbe.v3_0.fields.LastQtyField;
import omi.eurex.t7.eobi.fbe.v3_0.fields.RequestTimeField;
import omi.eurex.t7.eobi.fbe.v3_0.fields.RestingCxlQtyField;
import omi.eurex.t7.eobi.fbe.v3_0.fields.RestingHiddenQtyField;
import omi.eurex.t7.eobi.fbe.v3_0.fields.SecurityIdField;
import omi.eurex.t7.eobi.fbe.v3_0.fields.TradeConditionField;
import omi.eurex.t7.eobi.fbe.v3_0.types.Field;
import omi.eurex.t7.eobi.fbe.v3_0.types.Message;
import omi.eurex.t7.eobi.fbe.v3_0.types.PrintOptions;

/**
 * Represents the ExecutionSummary message from the Eobi protocol.
 */
public final class ExecutionSummary implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 56;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Summary";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 38, 2 };

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Aggressor Timestamp
     */
    private final AggressorTimestampField aggressorTimestamp = new AggressorTimestampField();

    /**
     * Request Time
     */
    private final RequestTimeField requestTime = new RequestTimeField();

    /**
     * Exec Id
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Last Qty
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Aggressor Side
     */
    private final AggressorSideField aggressorSide = new AggressorSideField();

    /**
     * Trade Condition
     */
    private final TradeConditionField tradeCondition = new TradeConditionField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Resting Hidden Qty
     */
    private final RestingHiddenQtyField restingHiddenQty = new RestingHiddenQtyField();

    /**
     * Resting Cxl Qty
     */
    private final RestingCxlQtyField restingCxlQty = new RestingCxlQtyField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, aggressorTimestamp, requestTime, execId, lastQty, aggressorSide, tradeCondition, lastPx, restingHiddenQty, restingCxlQty);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Aggressor Timestamp
     *
     * @return the AggressorTimestamp field
     */
    public AggressorTimestampField aggressorTimestamp() {
        return aggressorTimestamp;
    }

    /**
     * Request Time
     *
     * @return the RequestTime field
     */
    public RequestTimeField requestTime() {
        return requestTime;
    }

    /**
     * Exec Id
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * Last Qty
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
    }

    /**
     * Aggressor Side
     *
     * @return the AggressorSide field
     */
    public AggressorSideField aggressorSide() {
        return aggressorSide;
    }

    /**
     * Trade Condition
     *
     * @return the TradeCondition field
     */
    public TradeConditionField tradeCondition() {
        return tradeCondition;
    }

    /**
     * Last Px
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Resting Hidden Qty
     *
     * @return the RestingHiddenQty field
     */
    public RestingHiddenQtyField restingHiddenQty() {
        return restingHiddenQty;
    }

    /**
     * Resting Cxl Qty
     *
     * @return the RestingCxlQty field
     */
    public RestingCxlQtyField restingCxlQty() {
        return restingCxlQty;
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
        return PADDING.clone();
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(aggressorTimestamp.value());
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
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!aggressorTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += AggressorTimestampField.BYTE_LENGTH;
        if (!requestTime.parse(data, cursor)) {
            return false;
        }
        cursor += RequestTimeField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!aggressorSide.parse(data, cursor)) {
            return false;
        }
        cursor += AggressorSideField.BYTE_LENGTH;
        if (!tradeCondition.parse(data, cursor)) {
            return false;
        }
        cursor += TradeConditionField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!restingHiddenQty.parse(data, cursor)) {
            return false;
        }
        cursor += RestingHiddenQtyField.BYTE_LENGTH;
        return restingCxlQty.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = aggressorTimestamp.encode(data, cursor);
        cursor = requestTime.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = aggressorSide.encode(data, cursor);
        cursor = tradeCondition.encode(data, cursor);
        if (buffer != null && buffer.length >= 40) {
            System.arraycopy(buffer, 38, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = lastPx.encode(data, cursor);
        cursor = restingHiddenQty.encode(data, cursor);
        cursor = restingCxlQty.encode(data, cursor);
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
            case "SecurityId" -> Optional.of(securityId);
            case "AggressorTimestamp" -> Optional.of(aggressorTimestamp);
            case "RequestTime" -> Optional.of(requestTime);
            case "ExecId" -> Optional.of(execId);
            case "LastQty" -> Optional.of(lastQty);
            case "AggressorSide" -> Optional.of(aggressorSide);
            case "TradeCondition" -> Optional.of(tradeCondition);
            case "LastPx" -> Optional.of(lastPx);
            case "RestingHiddenQty" -> Optional.of(restingHiddenQty);
            case "RestingCxlQty" -> Optional.of(restingCxlQty);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionSummary message)) {
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
        if (!(other instanceof ExecutionSummary message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
