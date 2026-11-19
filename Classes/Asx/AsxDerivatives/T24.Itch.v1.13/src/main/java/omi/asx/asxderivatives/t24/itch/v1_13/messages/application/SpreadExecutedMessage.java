package omi.asx.asxderivatives.t24.itch.v1_13.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.ContractNumberField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.ExecutedQuantityField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.MatchNumberField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.NanosecondsField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.OrderNumberField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.PrintableField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.QuantityRemainingField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.SideField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.SpreadTradePriceField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.TradeDateField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.TradePriceField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.TradeSideOfLegField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.TradeTypeField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.TradedContractNumberField;
import omi.asx.asxderivatives.t24.itch.v1_13.types.Field;
import omi.asx.asxderivatives.t24.itch.v1_13.types.Message;
import omi.asx.asxderivatives.t24.itch.v1_13.types.PrintOptions;

/**
 * Represents the SpreadExecutedMessage message from the T24 protocol.
 *
 * <p>This message is sent whenever the open leg of a resting spread order is traded in whole or in part where the price and the contract number will be different than the traded contract number. It is possible to receive several Spread Executed messages for the same order number if that order is executed in several parts.</p>
 */
public final class SpreadExecutedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'e';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 46;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Spread Executed Message";

    /**
     * Nanoseconds portion of the timestamp.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Trade Date of event as applicable, if Event Code is “P” or “R”, applies to all active trade dates.
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Contract Number Field Element Identifier
     */
    private final ContractNumberField contractNumber = new ContractNumberField();

    /**
     * Type of order: “B” – Buy Order, “S” – Sell Order.
     */
    private final SideField side = new SideField();

    /**
     * Order number assigned by Matching Engine.
     */
    private final OrderNumberField orderNumber = new OrderNumberField();

    /**
     * Volume remaining on Order after matching, if 0, order has traded out and should be deleted.
     */
    private final QuantityRemainingField quantityRemaining = new QuantityRemainingField();

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
     * ‘B’ – Order Leg is Buyer, ‘S’ – Order Leg is Seller.
     */
    private final TradeSideOfLegField tradeSideOfLeg = new TradeSideOfLegField();

    /**
     * Indicates if the execution should be reflected on time and sale displays: “N” = non-printable or “Y” = printable.
     */
    private final PrintableField printable = new PrintableField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, tradeDate, contractNumber, side, orderNumber, quantityRemaining, tradeType, matchNumber, executedQuantity, tradePrice, tradedContractNumber, spreadTradePrice, tradeSideOfLeg, printable);

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
     * Contract Number Field Element Identifier
     *
     * @return the ContractNumber field
     */
    public ContractNumberField contractNumber() {
        return contractNumber;
    }

    /**
     * Type of order: “B” – Buy Order, “S” – Sell Order.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Order number assigned by Matching Engine.
     *
     * @return the OrderNumber field
     */
    public OrderNumberField orderNumber() {
        return orderNumber;
    }

    /**
     * Volume remaining on Order after matching, if 0, order has traded out and should be deleted.
     *
     * @return the QuantityRemaining field
     */
    public QuantityRemainingField quantityRemaining() {
        return quantityRemaining;
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
     * ‘B’ – Order Leg is Buyer, ‘S’ – Order Leg is Seller.
     *
     * @return the TradeSideOfLeg field
     */
    public TradeSideOfLegField tradeSideOfLeg() {
        return tradeSideOfLeg;
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
        if (!contractNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ContractNumberField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderNumberField.BYTE_LENGTH;
        if (!quantityRemaining.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityRemainingField.BYTE_LENGTH;
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
        if (!tradeSideOfLeg.parse(data, cursor)) {
            return false;
        }
        cursor += TradeSideOfLegField.BYTE_LENGTH;
        return printable.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = contractNumber.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderNumber.encode(data, cursor);
        cursor = quantityRemaining.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = matchNumber.encode(data, cursor);
        cursor = executedQuantity.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = tradedContractNumber.encode(data, cursor);
        cursor = spreadTradePrice.encode(data, cursor);
        cursor = tradeSideOfLeg.encode(data, cursor);
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
            case "ContractNumber" -> Optional.of(contractNumber);
            case "Side" -> Optional.of(side);
            case "OrderNumber" -> Optional.of(orderNumber);
            case "QuantityRemaining" -> Optional.of(quantityRemaining);
            case "TradeType" -> Optional.of(tradeType);
            case "MatchNumber" -> Optional.of(matchNumber);
            case "ExecutedQuantity" -> Optional.of(executedQuantity);
            case "TradePrice" -> Optional.of(tradePrice);
            case "TradedContractNumber" -> Optional.of(tradedContractNumber);
            case "SpreadTradePrice" -> Optional.of(spreadTradePrice);
            case "TradeSideOfLeg" -> Optional.of(tradeSideOfLeg);
            case "Printable" -> Optional.of(printable);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SpreadExecutedMessage message)) {
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
        if (!(other instanceof SpreadExecutedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
