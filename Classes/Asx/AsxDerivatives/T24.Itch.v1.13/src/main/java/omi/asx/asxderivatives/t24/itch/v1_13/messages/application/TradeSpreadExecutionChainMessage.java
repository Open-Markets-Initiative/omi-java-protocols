package omi.asx.asxderivatives.t24.itch.v1_13.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.BuyerField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.BuyerOrderNumberField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.BuyerQuantityRemainingField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.ExecutedQuantityField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.MatchNumberField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.NanosecondsField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.PrintableField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.SellerContractNumberField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.SellerQuantityRemainingField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.SellingOrderNumberField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.SideOfBuyerField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.SideOfSellerField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.SpreadTradePriceField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.TradeDateField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.TradePriceField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.TradeTypeField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.TradedContractNumberField;
import omi.asx.asxderivatives.t24.itch.v1_13.types.Field;
import omi.asx.asxderivatives.t24.itch.v1_13.types.Message;
import omi.asx.asxderivatives.t24.itch.v1_13.types.PrintOptions;

/**
 * Represents the TradeSpreadExecutionChainMessage message from the T24 protocol.
 *
 * <p>This message is sent whenever two resting orders of different contracts are executed in whole or in part at a price different from the initial display price(s) such as sweeping or spreading orders. Since the execution price is different than the display price of the original Add Order, a trade price field is included within the execution message.</p>
 */
public final class TradeSpreadExecutionChainMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'P';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 62;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Spread Execution Chain Message";

    /**
     * Nanoseconds portion of the timestamp.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Trade Date of event as applicable, if Event Code is “P” or “R”, applies to all active trade dates.
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Buyer Contract Number Field Element Identifier.
     */
    private final BuyerField buyer = new BuyerField();

    /**
     * Side of order: “B” – Buy Order, “S” – Sell Order.
     */
    private final SideOfBuyerField sideOfBuyer = new SideOfBuyerField();

    /**
     * Buyer’s Reference number of order.
     */
    private final BuyerOrderNumberField buyerOrderNumber = new BuyerOrderNumberField();

    /**
     * Volume remaining on Order after matching, if 0 order has traded out and should be deleted.
     */
    private final BuyerQuantityRemainingField buyerQuantityRemaining = new BuyerQuantityRemainingField();

    /**
     * Seller’s Contract Number Field Element Identifier.
     */
    private final SellerContractNumberField sellerContractNumber = new SellerContractNumberField();

    /**
     * Side of order: “B” – Buy Order, “S” – Sell Order.
     */
    private final SideOfSellerField sideOfSeller = new SideOfSellerField();

    /**
     * Seller's Reference number of order.
     */
    private final SellingOrderNumberField sellingOrderNumber = new SellingOrderNumberField();

    /**
     * Volume remaining on Order after matching, if 0 order has traded out and should be deleted.
     */
    private final SellerQuantityRemainingField sellerQuantityRemaining = new SellerQuantityRemainingField();

    /**
     * Trade Type Explanation.
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * Deal Number.
     */
    private final MatchNumberField matchNumber = new MatchNumberField();

    /**
     * Volume traded.
     */
    private final ExecutedQuantityField executedQuantity = new ExecutedQuantityField();

    /**
     * Price of Trade.
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * Contract Number Field Element Identifier of the underlying Order Book Traded.
     */
    private final TradedContractNumberField tradedContractNumber = new TradedContractNumberField();

    /**
     * If a spread-to-spread trade, this will be set to the spread price.
     */
    private final SpreadTradePriceField spreadTradePrice = new SpreadTradePriceField();

    /**
     * Indicates if the execution should be reflected on time and sale displays: “N” = non-printable or “Y” = printable.
     */
    private final PrintableField printable = new PrintableField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, tradeDate, buyer, sideOfBuyer, buyerOrderNumber, buyerQuantityRemaining, sellerContractNumber, sideOfSeller, sellingOrderNumber, sellerQuantityRemaining, tradeType, matchNumber, executedQuantity, tradePrice, tradedContractNumber, spreadTradePrice, printable);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the timestamp.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Trade Date of event as applicable, if Event Code is “P” or “R”, applies to all active trade dates.
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Buyer Contract Number Field Element Identifier.
     *
     * @return the Buyer field
     */
    public BuyerField buyer() {
        return buyer;
    }

    /**
     * Side of order: “B” – Buy Order, “S” – Sell Order.
     *
     * @return the SideOfBuyer field
     */
    public SideOfBuyerField sideOfBuyer() {
        return sideOfBuyer;
    }

    /**
     * Buyer’s Reference number of order.
     *
     * @return the BuyerOrderNumber field
     */
    public BuyerOrderNumberField buyerOrderNumber() {
        return buyerOrderNumber;
    }

    /**
     * Volume remaining on Order after matching, if 0 order has traded out and should be deleted.
     *
     * @return the BuyerQuantityRemaining field
     */
    public BuyerQuantityRemainingField buyerQuantityRemaining() {
        return buyerQuantityRemaining;
    }

    /**
     * Seller’s Contract Number Field Element Identifier.
     *
     * @return the SellerContractNumber field
     */
    public SellerContractNumberField sellerContractNumber() {
        return sellerContractNumber;
    }

    /**
     * Side of order: “B” – Buy Order, “S” – Sell Order.
     *
     * @return the SideOfSeller field
     */
    public SideOfSellerField sideOfSeller() {
        return sideOfSeller;
    }

    /**
     * Seller's Reference number of order.
     *
     * @return the SellingOrderNumber field
     */
    public SellingOrderNumberField sellingOrderNumber() {
        return sellingOrderNumber;
    }

    /**
     * Volume remaining on Order after matching, if 0 order has traded out and should be deleted.
     *
     * @return the SellerQuantityRemaining field
     */
    public SellerQuantityRemainingField sellerQuantityRemaining() {
        return sellerQuantityRemaining;
    }

    /**
     * Trade Type Explanation.
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    /**
     * Deal Number.
     *
     * @return the MatchNumber field
     */
    public MatchNumberField matchNumber() {
        return matchNumber;
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
     * Price of Trade.
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * Contract Number Field Element Identifier of the underlying Order Book Traded.
     *
     * @return the TradedContractNumber field
     */
    public TradedContractNumberField tradedContractNumber() {
        return tradedContractNumber;
    }

    /**
     * If a spread-to-spread trade, this will be set to the spread price.
     *
     * @return the SpreadTradePrice field
     */
    public SpreadTradePriceField spreadTradePrice() {
        return spreadTradePrice;
    }

    /**
     * Indicates if the execution should be reflected on time and sale displays: “N” = non-printable or “Y” = printable.
     *
     * @return the Printable field
     */
    public PrintableField printable() {
        return printable;
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!buyer.parse(data, cursor)) {
            return false;
        }
        cursor += BuyerField.BYTE_LENGTH;
        if (!sideOfBuyer.parse(data, cursor)) {
            return false;
        }
        cursor += SideOfBuyerField.BYTE_LENGTH;
        if (!buyerOrderNumber.parse(data, cursor)) {
            return false;
        }
        cursor += BuyerOrderNumberField.BYTE_LENGTH;
        if (!buyerQuantityRemaining.parse(data, cursor)) {
            return false;
        }
        cursor += BuyerQuantityRemainingField.BYTE_LENGTH;
        if (!sellerContractNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SellerContractNumberField.BYTE_LENGTH;
        if (!sideOfSeller.parse(data, cursor)) {
            return false;
        }
        cursor += SideOfSellerField.BYTE_LENGTH;
        if (!sellingOrderNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SellingOrderNumberField.BYTE_LENGTH;
        if (!sellerQuantityRemaining.parse(data, cursor)) {
            return false;
        }
        cursor += SellerQuantityRemainingField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!matchNumber.parse(data, cursor)) {
            return false;
        }
        cursor += MatchNumberField.BYTE_LENGTH;
        if (!executedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedQuantityField.BYTE_LENGTH;
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!tradedContractNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TradedContractNumberField.BYTE_LENGTH;
        if (!spreadTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += SpreadTradePriceField.BYTE_LENGTH;
        return printable.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = buyer.encode(data, cursor);
        cursor = sideOfBuyer.encode(data, cursor);
        cursor = buyerOrderNumber.encode(data, cursor);
        cursor = buyerQuantityRemaining.encode(data, cursor);
        cursor = sellerContractNumber.encode(data, cursor);
        cursor = sideOfSeller.encode(data, cursor);
        cursor = sellingOrderNumber.encode(data, cursor);
        cursor = sellerQuantityRemaining.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = matchNumber.encode(data, cursor);
        cursor = executedQuantity.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = tradedContractNumber.encode(data, cursor);
        cursor = spreadTradePrice.encode(data, cursor);
        cursor = printable.encode(data, cursor);
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
            case "Buyer" -> Optional.of(buyer);
            case "SideOfBuyer" -> Optional.of(sideOfBuyer);
            case "BuyerOrderNumber" -> Optional.of(buyerOrderNumber);
            case "BuyerQuantityRemaining" -> Optional.of(buyerQuantityRemaining);
            case "SellerContractNumber" -> Optional.of(sellerContractNumber);
            case "SideOfSeller" -> Optional.of(sideOfSeller);
            case "SellingOrderNumber" -> Optional.of(sellingOrderNumber);
            case "SellerQuantityRemaining" -> Optional.of(sellerQuantityRemaining);
            case "TradeType" -> Optional.of(tradeType);
            case "MatchNumber" -> Optional.of(matchNumber);
            case "ExecutedQuantity" -> Optional.of(executedQuantity);
            case "TradePrice" -> Optional.of(tradePrice);
            case "TradedContractNumber" -> Optional.of(tradedContractNumber);
            case "SpreadTradePrice" -> Optional.of(spreadTradePrice);
            case "Printable" -> Optional.of(printable);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeSpreadExecutionChainMessage message)) {
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
        if (!(other instanceof TradeSpreadExecutionChainMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
