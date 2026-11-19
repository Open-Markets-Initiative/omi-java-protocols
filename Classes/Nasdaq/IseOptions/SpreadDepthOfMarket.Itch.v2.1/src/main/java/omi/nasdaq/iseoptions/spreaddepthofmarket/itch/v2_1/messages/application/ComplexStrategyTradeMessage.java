package omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.fields.AuctionIdField;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.fields.CrossNumberField;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.fields.CrossTypeField;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.fields.MatchNumberField;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.fields.PriceLongField;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.fields.StrategyIdField;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.fields.TimestampField;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.fields.TrackingNumberField;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.fields.TradeConditionField;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.fields.TradeTypeField;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.fields.VolumeLongField;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.types.Field;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.types.Message;
import omi.nasdaq.iseoptions.spreaddepthofmarket.itch.v2_1.types.PrintOptions;

/**
 * Represents the ComplexStrategyTradeMessage message from the SpreadDepthOfMarket protocol.
 *
 * <p>This Options Trade Message is designed to provide execution details for normal match events involving non-display able order types.</p>
 */
public final class ComplexStrategyTradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'q';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 58;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Strategy Trade Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 22, 4, 40, 1, 42, 16 };

    /**
     * Internal system tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Option ID assigned daily. Valid for trading day
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * Trade Group Id. Ties together all trades of a given atomic transaction in the matching engine.
     */
    private final CrossNumberField crossNumber = new CrossNumberField();

    /**
     * Execution Id. Identifies the component of an execution. Unique for a given day.
     */
    private final MatchNumberField matchNumber = new MatchNumberField();

    /**
     * Cross Type
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * The display price of the new order being added to the book.
     */
    private final PriceLongField priceLong = new PriceLongField();

    /**
     * The total quantity of the new order being added to the book
     */
    private final VolumeLongField volumeLong = new VolumeLongField();

    /**
     * The Trade Condition is the same as defined in the OPRA specification.
     */
    private final TradeConditionField tradeCondition = new TradeConditionField();

    /**
     * Uniquely identifies the Auction for the trading day.
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Trade Type Identifier
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(trackingNumber, timestampField, strategyId, crossNumber, matchNumber, crossType, priceLong, volumeLong, tradeCondition, auctionId, tradeType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Internal system tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Nanoseconds since midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Option ID assigned daily. Valid for trading day
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
    }

    /**
     * Trade Group Id. Ties together all trades of a given atomic transaction in the matching engine.
     *
     * @return the CrossNumber field
     */
    public CrossNumberField crossNumber() {
        return crossNumber;
    }

    /**
     * Execution Id. Identifies the component of an execution. Unique for a given day.
     *
     * @return the MatchNumber field
     */
    public MatchNumberField matchNumber() {
        return matchNumber;
    }

    /**
     * Cross Type
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * The display price of the new order being added to the book.
     *
     * @return the PriceLong field
     */
    public PriceLongField priceLong() {
        return priceLong;
    }

    /**
     * The total quantity of the new order being added to the book
     *
     * @return the VolumeLong field
     */
    public VolumeLongField volumeLong() {
        return volumeLong;
    }

    /**
     * The Trade Condition is the same as defined in the OPRA specification.
     *
     * @return the TradeCondition field
     */
    public TradeConditionField tradeCondition() {
        return tradeCondition;
    }

    /**
     * Uniquely identifies the Auction for the trading day.
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * Trade Type Identifier
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!strategyId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyIdField.BYTE_LENGTH;
        if (!crossNumber.parse(data, cursor)) {
            return false;
        }
        cursor += CrossNumberField.BYTE_LENGTH;
        if (!matchNumber.parse(data, cursor)) {
            return false;
        }
        cursor += MatchNumberField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!crossType.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeField.BYTE_LENGTH;
        if (!priceLong.parse(data, cursor)) {
            return false;
        }
        cursor += PriceLongField.BYTE_LENGTH;
        if (!volumeLong.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeLongField.BYTE_LENGTH;
        if (!tradeCondition.parse(data, cursor)) {
            return false;
        }
        cursor += TradeConditionField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = strategyId.encode(data, cursor);
        cursor = crossNumber.encode(data, cursor);
        cursor = matchNumber.encode(data, cursor);
        if (buffer != null && buffer.length >= 26) {
            System.arraycopy(buffer, 22, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = crossType.encode(data, cursor);
        cursor = priceLong.encode(data, cursor);
        cursor = volumeLong.encode(data, cursor);
        cursor = tradeCondition.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        if (buffer != null && buffer.length >= 41) {
            System.arraycopy(buffer, 40, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = tradeType.encode(data, cursor);
        if (buffer != null && buffer.length >= 58) {
            System.arraycopy(buffer, 42, data, cursor, 16); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 16, (byte) 0); // padding
        }
        cursor += 16;
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
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "Timestamp" -> Optional.of(timestampField);
            case "StrategyId" -> Optional.of(strategyId);
            case "CrossNumber" -> Optional.of(crossNumber);
            case "MatchNumber" -> Optional.of(matchNumber);
            case "CrossType" -> Optional.of(crossType);
            case "PriceLong" -> Optional.of(priceLong);
            case "VolumeLong" -> Optional.of(volumeLong);
            case "TradeCondition" -> Optional.of(tradeCondition);
            case "AuctionId" -> Optional.of(auctionId);
            case "TradeType" -> Optional.of(tradeType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexStrategyTradeMessage message)) {
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
        if (!(other instanceof ComplexStrategyTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
