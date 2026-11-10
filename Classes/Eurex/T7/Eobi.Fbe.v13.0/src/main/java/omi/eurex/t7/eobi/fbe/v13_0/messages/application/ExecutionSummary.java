package omi.eurex.t7.eobi.fbe.v13_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.eobi.fbe.v13_0.fields.AggressorSideField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.AggressorTimeField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.ExecIdField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.LastPxField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.LastQtyField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.RequestTimeField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.RestingCxlQtyField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.RestingHiddenQtyField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.SecurityIdField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.TradeConditionField;
import omi.eurex.t7.eobi.fbe.v13_0.fields.TradingHhiIndicatorField;
import omi.eurex.t7.eobi.fbe.v13_0.structs.RemainingOrderDetailsComp;
import omi.eurex.t7.eobi.fbe.v13_0.types.Field;
import omi.eurex.t7.eobi.fbe.v13_0.types.Message;
import omi.eurex.t7.eobi.fbe.v13_0.types.PrintOptions;

/**
 * Represents the ExecutionSummary message from the Eobi protocol.
 */
public final class ExecutionSummary implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 96;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Summary";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 33, 1, 37, 3 };

    /**
     * Unique instrument identifier
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Request Time
     */
    private final RequestTimeField requestTime = new RequestTimeField();

    /**
     * Exec Id
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Total executed matched quantity of this match event
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
     * Trading Hhi Indicator
     */
    private final TradingHhiIndicatorField tradingHhiIndicator = new TradingHhiIndicatorField();

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
     * Aggressor Time
     */
    private final AggressorTimeField aggressorTime = new AggressorTimeField();

    /**
     * Remaining Order Details Comp
     */
    private final RemainingOrderDetailsComp remainingOrderDetailsComp = new RemainingOrderDetailsComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(securityId), List.<Field>of(requestTime), List.<Field>of(execId), List.<Field>of(lastQty), List.<Field>of(aggressorSide), List.<Field>of(tradeCondition), List.<Field>of(tradingHhiIndicator), List.<Field>of(lastPx), remainingOrderDetailsComp.fields(), List.<Field>of(restingHiddenQty), List.<Field>of(restingCxlQty), List.<Field>of(aggressorTime)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unique instrument identifier
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
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
     * Total executed matched quantity of this match event
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
     * Trading Hhi Indicator
     *
     * @return the TradingHhiIndicator field
     */
    public TradingHhiIndicatorField tradingHhiIndicator() {
        return tradingHhiIndicator;
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

    /**
     * Aggressor Time
     *
     * @return the AggressorTime field
     */
    public AggressorTimeField aggressorTime() {
        return aggressorTime;
    }

    /**
     * Remaining Order Details Comp
     *
     * @return the RemainingOrderDetailsComp record
     */
    public RemainingOrderDetailsComp remainingOrderDetailsComp() {
        return remainingOrderDetailsComp;
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
        return Optional.ofNullable(requestTime.value());
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
        cursor += 1; // padding
        if (!tradeCondition.parse(data, cursor)) {
            return false;
        }
        cursor += TradeConditionField.BYTE_LENGTH;
        if (!tradingHhiIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TradingHhiIndicatorField.BYTE_LENGTH;
        cursor += 3; // padding
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!remainingOrderDetailsComp.parseFrom(data, cursor, end - 24)) {
            return false;
        }
        cursor += remainingOrderDetailsComp.byteLength();
        if (!restingHiddenQty.parse(data, cursor)) {
            return false;
        }
        cursor += RestingHiddenQtyField.BYTE_LENGTH;
        if (!restingCxlQty.parse(data, cursor)) {
            return false;
        }
        cursor += RestingCxlQtyField.BYTE_LENGTH;
        if (!aggressorTime.parse(data, cursor)) {
            return false;
        }
        cursor += AggressorTimeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = requestTime.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = aggressorSide.encode(data, cursor);
        if (buffer != null && buffer.length >= 33 + 1) {
            System.arraycopy(buffer, 33, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = tradeCondition.encode(data, cursor);
        cursor = tradingHhiIndicator.encode(data, cursor);
        if (buffer != null && buffer.length >= 37 + 3) {
            System.arraycopy(buffer, 37, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
        cursor = lastPx.encode(data, cursor);
        cursor = remainingOrderDetailsComp.encode(data, cursor);
        cursor = restingHiddenQty.encode(data, cursor);
        cursor = restingCxlQty.encode(data, cursor);
        cursor = aggressorTime.encode(data, cursor);
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
        remainingOrderDetailsComp.clear();
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
            case "RequestTime" -> Optional.of(requestTime);
            case "ExecId" -> Optional.of(execId);
            case "LastQty" -> Optional.of(lastQty);
            case "AggressorSide" -> Optional.of(aggressorSide);
            case "TradeCondition" -> Optional.of(tradeCondition);
            case "TradingHhiIndicator" -> Optional.of(tradingHhiIndicator);
            case "LastPx" -> Optional.of(lastPx);
            case "RestingHiddenQty" -> Optional.of(restingHiddenQty);
            case "RestingCxlQty" -> Optional.of(restingCxlQty);
            case "AggressorTime" -> Optional.of(aggressorTime);
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
