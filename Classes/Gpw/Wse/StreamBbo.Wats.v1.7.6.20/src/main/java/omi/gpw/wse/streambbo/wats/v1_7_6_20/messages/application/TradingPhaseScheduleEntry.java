package omi.gpw.wse.streambbo.wats.v1_7_6_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ClatIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.DynamicCollarVolatilityAuctionIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ExtDynamicCollarVolatilityAuctionIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ExtStaticCollarVolatilityAuctionIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.StaticCollarVolatilityAuctionIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.TradingPhaseIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.TradingPhaseMaxBlockSettlementCycleField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.TradingPhaseSettlementCycleField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.TradingPhaseStartTimeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.TradingPhaseTypeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.TradingScheduleIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.UncrossingField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.Message;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.PrintOptions;

/**
 * Represents the TradingPhaseScheduleEntry message from the StreamBbo protocol.
 *
 * <p>Trading phase definition</p>
 */
public final class TradingPhaseScheduleEntry implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 40;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trading Phase Schedule Entry";

    /**
     * Trading schedule ID
     */
    private final TradingScheduleIdField tradingScheduleId = new TradingScheduleIdField();

    /**
     * Trading phase ID
     */
    private final TradingPhaseIdField tradingPhaseId = new TradingPhaseIdField();

    /**
     * Settlement cycle for transactions made during a continuous phase
     */
    private final TradingPhaseSettlementCycleField tradingPhaseSettlementCycle = new TradingPhaseSettlementCycleField();

    /**
     * Max settlement cycle for block transactions
     */
    private final TradingPhaseMaxBlockSettlementCycleField tradingPhaseMaxBlockSettlementCycle = new TradingPhaseMaxBlockSettlementCycleField();

    /**
     * Static collar volatility auction ID
     */
    private final StaticCollarVolatilityAuctionIdField staticCollarVolatilityAuctionId = new StaticCollarVolatilityAuctionIdField();

    /**
     * Dynamic collar volatility auction ID
     */
    private final DynamicCollarVolatilityAuctionIdField dynamicCollarVolatilityAuctionId = new DynamicCollarVolatilityAuctionIdField();

    /**
     * Trading phase start time
     */
    private final TradingPhaseStartTimeField tradingPhaseStartTime = new TradingPhaseStartTimeField();

    /**
     * Type of matching algorithm
     */
    private final TradingPhaseTypeField tradingPhaseType = new TradingPhaseTypeField();

    /**
     * True if the phase includes an uncrossing
     */
    private final UncrossingField uncrossing = new UncrossingField();

    /**
     * ID of Static Collar Volatility Auction
     */
    private final ExtStaticCollarVolatilityAuctionIdField extStaticCollarVolatilityAuctionId = new ExtStaticCollarVolatilityAuctionIdField();

    /**
     * ID of Dynamic Collar Volatility Auction
     */
    private final ExtDynamicCollarVolatilityAuctionIdField extDynamicCollarVolatilityAuctionId = new ExtDynamicCollarVolatilityAuctionIdField();

    /**
     * ID of last auction phase
     */
    private final ClatIdField clatId = new ClatIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tradingScheduleId, tradingPhaseId, tradingPhaseSettlementCycle, tradingPhaseMaxBlockSettlementCycle, staticCollarVolatilityAuctionId, dynamicCollarVolatilityAuctionId, tradingPhaseStartTime, tradingPhaseType, uncrossing, extStaticCollarVolatilityAuctionId, extDynamicCollarVolatilityAuctionId, clatId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Trading schedule ID
     *
     * @return the TradingScheduleId field
     */
    public TradingScheduleIdField tradingScheduleId() {
        return tradingScheduleId;
    }

    /**
     * Trading phase ID
     *
     * @return the TradingPhaseId field
     */
    public TradingPhaseIdField tradingPhaseId() {
        return tradingPhaseId;
    }

    /**
     * Settlement cycle for transactions made during a continuous phase
     *
     * @return the TradingPhaseSettlementCycle field
     */
    public TradingPhaseSettlementCycleField tradingPhaseSettlementCycle() {
        return tradingPhaseSettlementCycle;
    }

    /**
     * Max settlement cycle for block transactions
     *
     * @return the TradingPhaseMaxBlockSettlementCycle field
     */
    public TradingPhaseMaxBlockSettlementCycleField tradingPhaseMaxBlockSettlementCycle() {
        return tradingPhaseMaxBlockSettlementCycle;
    }

    /**
     * Static collar volatility auction ID
     *
     * @return the StaticCollarVolatilityAuctionId field
     */
    public StaticCollarVolatilityAuctionIdField staticCollarVolatilityAuctionId() {
        return staticCollarVolatilityAuctionId;
    }

    /**
     * Dynamic collar volatility auction ID
     *
     * @return the DynamicCollarVolatilityAuctionId field
     */
    public DynamicCollarVolatilityAuctionIdField dynamicCollarVolatilityAuctionId() {
        return dynamicCollarVolatilityAuctionId;
    }

    /**
     * Trading phase start time
     *
     * @return the TradingPhaseStartTime field
     */
    public TradingPhaseStartTimeField tradingPhaseStartTime() {
        return tradingPhaseStartTime;
    }

    /**
     * Type of matching algorithm
     *
     * @return the TradingPhaseType field
     */
    public TradingPhaseTypeField tradingPhaseType() {
        return tradingPhaseType;
    }

    /**
     * True if the phase includes an uncrossing
     *
     * @return the Uncrossing field
     */
    public UncrossingField uncrossing() {
        return uncrossing;
    }

    /**
     * ID of Static Collar Volatility Auction
     *
     * @return the ExtStaticCollarVolatilityAuctionId field
     */
    public ExtStaticCollarVolatilityAuctionIdField extStaticCollarVolatilityAuctionId() {
        return extStaticCollarVolatilityAuctionId;
    }

    /**
     * ID of Dynamic Collar Volatility Auction
     *
     * @return the ExtDynamicCollarVolatilityAuctionId field
     */
    public ExtDynamicCollarVolatilityAuctionIdField extDynamicCollarVolatilityAuctionId() {
        return extDynamicCollarVolatilityAuctionId;
    }

    /**
     * ID of last auction phase
     *
     * @return the ClatId field
     */
    public ClatIdField clatId() {
        return clatId;
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
        return Optional.ofNullable(tradingPhaseStartTime.value());
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
        if (!tradingScheduleId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingScheduleIdField.BYTE_LENGTH;
        if (!tradingPhaseId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingPhaseIdField.BYTE_LENGTH;
        if (!tradingPhaseSettlementCycle.parse(data, cursor)) {
            return false;
        }
        cursor += TradingPhaseSettlementCycleField.BYTE_LENGTH;
        if (!tradingPhaseMaxBlockSettlementCycle.parse(data, cursor)) {
            return false;
        }
        cursor += TradingPhaseMaxBlockSettlementCycleField.BYTE_LENGTH;
        if (!staticCollarVolatilityAuctionId.parse(data, cursor)) {
            return false;
        }
        cursor += StaticCollarVolatilityAuctionIdField.BYTE_LENGTH;
        if (!dynamicCollarVolatilityAuctionId.parse(data, cursor)) {
            return false;
        }
        cursor += DynamicCollarVolatilityAuctionIdField.BYTE_LENGTH;
        if (!tradingPhaseStartTime.parse(data, cursor)) {
            return false;
        }
        cursor += TradingPhaseStartTimeField.BYTE_LENGTH;
        if (!tradingPhaseType.parse(data, cursor)) {
            return false;
        }
        cursor += TradingPhaseTypeField.BYTE_LENGTH;
        if (!uncrossing.parse(data, cursor)) {
            return false;
        }
        cursor += UncrossingField.BYTE_LENGTH;
        if (!extStaticCollarVolatilityAuctionId.parse(data, cursor)) {
            return false;
        }
        cursor += ExtStaticCollarVolatilityAuctionIdField.BYTE_LENGTH;
        if (!extDynamicCollarVolatilityAuctionId.parse(data, cursor)) {
            return false;
        }
        cursor += ExtDynamicCollarVolatilityAuctionIdField.BYTE_LENGTH;
        return clatId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = tradingScheduleId.encode(data, cursor);
        cursor = tradingPhaseId.encode(data, cursor);
        cursor = tradingPhaseSettlementCycle.encode(data, cursor);
        cursor = tradingPhaseMaxBlockSettlementCycle.encode(data, cursor);
        cursor = staticCollarVolatilityAuctionId.encode(data, cursor);
        cursor = dynamicCollarVolatilityAuctionId.encode(data, cursor);
        cursor = tradingPhaseStartTime.encode(data, cursor);
        cursor = tradingPhaseType.encode(data, cursor);
        cursor = uncrossing.encode(data, cursor);
        cursor = extStaticCollarVolatilityAuctionId.encode(data, cursor);
        cursor = extDynamicCollarVolatilityAuctionId.encode(data, cursor);
        cursor = clatId.encode(data, cursor);
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
            case "TradingScheduleId" -> Optional.of(tradingScheduleId);
            case "TradingPhaseId" -> Optional.of(tradingPhaseId);
            case "TradingPhaseSettlementCycle" -> Optional.of(tradingPhaseSettlementCycle);
            case "TradingPhaseMaxBlockSettlementCycle" -> Optional.of(tradingPhaseMaxBlockSettlementCycle);
            case "StaticCollarVolatilityAuctionId" -> Optional.of(staticCollarVolatilityAuctionId);
            case "DynamicCollarVolatilityAuctionId" -> Optional.of(dynamicCollarVolatilityAuctionId);
            case "TradingPhaseStartTime" -> Optional.of(tradingPhaseStartTime);
            case "TradingPhaseType" -> Optional.of(tradingPhaseType);
            case "Uncrossing" -> Optional.of(uncrossing);
            case "ExtStaticCollarVolatilityAuctionId" -> Optional.of(extStaticCollarVolatilityAuctionId);
            case "ExtDynamicCollarVolatilityAuctionId" -> Optional.of(extDynamicCollarVolatilityAuctionId);
            case "ClatId" -> Optional.of(clatId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradingPhaseScheduleEntry message)) {
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
        if (!(other instanceof TradingPhaseScheduleEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
