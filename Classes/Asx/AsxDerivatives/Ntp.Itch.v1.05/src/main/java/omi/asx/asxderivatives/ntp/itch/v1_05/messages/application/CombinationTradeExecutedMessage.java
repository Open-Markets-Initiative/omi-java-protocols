package omi.asx.asxderivatives.ntp.itch.v1_05.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.BuyerCombinationTradeIdField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.BuyerOrderIdField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.BuyerParticipantIdField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.BuyerSideField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.BuyerTradeableInstrumentIdField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.ExecutedQuantityField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.NanosecondsField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.SellerCombinationTradeIdField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.SellerOrderIdField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.SellerParticipantIdField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.SellerSideField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.SellerTradeableInstrumentIdField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.TradeDateField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.TradeIdField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.TradePriceField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.TradeTypeField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.TradeableInstrumentIdField;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.Field;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.Message;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.PrintOptions;

/**
 * Represents the CombinationTradeExecutedMessage message from the Ntp protocol.
 *
 * <p>The Combination Trade Executed Message is designed to provide details for executions where one or both orders are resting from a different order book id from the order book id of the trade</p>
 */
public final class CombinationTradeExecutedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'p';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 79;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Combination Trade Executed Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Nanoseconds portion of the Nanoseconds, accurate to 1,000 nanoseconds.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Trade Date. Represented as number of days since 1 January 1970.
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Identifier of the Order Book.
     */
    private final TradeableInstrumentIdField tradeableInstrumentId = new TradeableInstrumentIdField();

    /**
     * Nature of the match
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * Public trade id of the trade.
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Volume traded.
     */
    private final ExecutedQuantityField executedQuantity = new ExecutedQuantityField();

    /**
     * Price of trade (may be negative for combination trades).
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * Identifier of the Buyers Order Book.
     */
    private final BuyerTradeableInstrumentIdField buyerTradeableInstrumentId = new BuyerTradeableInstrumentIdField();

    /**
     * Type of order
     */
    private final BuyerSideField buyerSide = new BuyerSideField();

    /**
     * Reference number of the Buyer’s order – 0 if order is aggressive.
     */
    private final BuyerOrderIdField buyerOrderId = new BuyerOrderIdField();

    /**
     * A non-zero value indicates that this trade is part of an execution cycle for a combination trade from the E or P message.
     */
    private final BuyerCombinationTradeIdField buyerCombinationTradeId = new BuyerCombinationTradeIdField();

    /**
     * Buying participant identifier of the owner of the aggressive order.
     */
    private final BuyerParticipantIdField buyerParticipantId = new BuyerParticipantIdField();

    /**
     * Identifier of the Seller’s Order Book.
     */
    private final SellerTradeableInstrumentIdField sellerTradeableInstrumentId = new SellerTradeableInstrumentIdField();

    /**
     * Type of order
     */
    private final SellerSideField sellerSide = new SellerSideField();

    /**
     * Reference number of the Seller’s order – 0 if order is aggressive.
     */
    private final SellerOrderIdField sellerOrderId = new SellerOrderIdField();

    /**
     * A non-zero value indicates that this trade is part of an execution cycle for a combination trade from the E or P message.
     */
    private final SellerCombinationTradeIdField sellerCombinationTradeId = new SellerCombinationTradeIdField();

    /**
     * Selling participant identifier of the owner of the aggressive order.
     */
    private final SellerParticipantIdField sellerParticipantId = new SellerParticipantIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, tradeDate, tradeableInstrumentId, tradeType, tradeId, executedQuantity, tradePrice, buyerTradeableInstrumentId, buyerSide, buyerOrderId, buyerCombinationTradeId, buyerParticipantId, sellerTradeableInstrumentId, sellerSide, sellerOrderId, sellerCombinationTradeId, sellerParticipantId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the Nanoseconds, accurate to 1,000 nanoseconds.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Trade Date. Represented as number of days since 1 January 1970.
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Identifier of the Order Book.
     *
     * @return the TradeableInstrumentId field
     */
    public TradeableInstrumentIdField tradeableInstrumentId() {
        return tradeableInstrumentId;
    }

    /**
     * Nature of the match
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    /**
     * Public trade id of the trade.
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Volume traded.
     *
     * @return the ExecutedQuantity field
     */
    public ExecutedQuantityField executedQuantity() {
        return executedQuantity;
    }

    /**
     * Price of trade (may be negative for combination trades).
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * Identifier of the Buyers Order Book.
     *
     * @return the BuyerTradeableInstrumentId field
     */
    public BuyerTradeableInstrumentIdField buyerTradeableInstrumentId() {
        return buyerTradeableInstrumentId;
    }

    /**
     * Type of order
     *
     * @return the BuyerSide field
     */
    public BuyerSideField buyerSide() {
        return buyerSide;
    }

    /**
     * Reference number of the Buyer’s order – 0 if order is aggressive.
     *
     * @return the BuyerOrderId field
     */
    public BuyerOrderIdField buyerOrderId() {
        return buyerOrderId;
    }

    /**
     * A non-zero value indicates that this trade is part of an execution cycle for a combination trade from the E or P message.
     *
     * @return the BuyerCombinationTradeId field
     */
    public BuyerCombinationTradeIdField buyerCombinationTradeId() {
        return buyerCombinationTradeId;
    }

    /**
     * Buying participant identifier of the owner of the aggressive order.
     *
     * @return the BuyerParticipantId field
     */
    public BuyerParticipantIdField buyerParticipantId() {
        return buyerParticipantId;
    }

    /**
     * Identifier of the Seller’s Order Book.
     *
     * @return the SellerTradeableInstrumentId field
     */
    public SellerTradeableInstrumentIdField sellerTradeableInstrumentId() {
        return sellerTradeableInstrumentId;
    }

    /**
     * Type of order
     *
     * @return the SellerSide field
     */
    public SellerSideField sellerSide() {
        return sellerSide;
    }

    /**
     * Reference number of the Seller’s order – 0 if order is aggressive.
     *
     * @return the SellerOrderId field
     */
    public SellerOrderIdField sellerOrderId() {
        return sellerOrderId;
    }

    /**
     * A non-zero value indicates that this trade is part of an execution cycle for a combination trade from the E or P message.
     *
     * @return the SellerCombinationTradeId field
     */
    public SellerCombinationTradeIdField sellerCombinationTradeId() {
        return sellerCombinationTradeId;
    }

    /**
     * Selling participant identifier of the owner of the aggressive order.
     *
     * @return the SellerParticipantId field
     */
    public SellerParticipantIdField sellerParticipantId() {
        return sellerParticipantId;
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!tradeableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeableInstrumentIdField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!executedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedQuantityField.BYTE_LENGTH;
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!buyerTradeableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += BuyerTradeableInstrumentIdField.BYTE_LENGTH;
        if (!buyerSide.parse(data, cursor)) {
            return false;
        }
        cursor += BuyerSideField.BYTE_LENGTH;
        if (!buyerOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += BuyerOrderIdField.BYTE_LENGTH;
        if (!buyerCombinationTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += BuyerCombinationTradeIdField.BYTE_LENGTH;
        if (!buyerParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += BuyerParticipantIdField.BYTE_LENGTH;
        if (!sellerTradeableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += SellerTradeableInstrumentIdField.BYTE_LENGTH;
        if (!sellerSide.parse(data, cursor)) {
            return false;
        }
        cursor += SellerSideField.BYTE_LENGTH;
        if (!sellerOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += SellerOrderIdField.BYTE_LENGTH;
        if (!sellerCombinationTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += SellerCombinationTradeIdField.BYTE_LENGTH;
        if (!sellerParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += SellerParticipantIdField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = tradeableInstrumentId.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = executedQuantity.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = buyerTradeableInstrumentId.encode(data, cursor);
        cursor = buyerSide.encode(data, cursor);
        cursor = buyerOrderId.encode(data, cursor);
        cursor = buyerCombinationTradeId.encode(data, cursor);
        cursor = buyerParticipantId.encode(data, cursor);
        cursor = sellerTradeableInstrumentId.encode(data, cursor);
        cursor = sellerSide.encode(data, cursor);
        cursor = sellerOrderId.encode(data, cursor);
        cursor = sellerCombinationTradeId.encode(data, cursor);
        cursor = sellerParticipantId.encode(data, cursor);
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "TradeDate" -> Optional.of(tradeDate);
            case "TradeableInstrumentId" -> Optional.of(tradeableInstrumentId);
            case "TradeType" -> Optional.of(tradeType);
            case "TradeId" -> Optional.of(tradeId);
            case "ExecutedQuantity" -> Optional.of(executedQuantity);
            case "TradePrice" -> Optional.of(tradePrice);
            case "BuyerTradeableInstrumentId" -> Optional.of(buyerTradeableInstrumentId);
            case "BuyerSide" -> Optional.of(buyerSide);
            case "BuyerOrderId" -> Optional.of(buyerOrderId);
            case "BuyerCombinationTradeId" -> Optional.of(buyerCombinationTradeId);
            case "BuyerParticipantId" -> Optional.of(buyerParticipantId);
            case "SellerTradeableInstrumentId" -> Optional.of(sellerTradeableInstrumentId);
            case "SellerSide" -> Optional.of(sellerSide);
            case "SellerOrderId" -> Optional.of(sellerOrderId);
            case "SellerCombinationTradeId" -> Optional.of(sellerCombinationTradeId);
            case "SellerParticipantId" -> Optional.of(sellerParticipantId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CombinationTradeExecutedMessage message)) {
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
        if (!(other instanceof CombinationTradeExecutedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
