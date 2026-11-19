package omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.fields.BrokerField;
import omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.fields.BuySellIndicatorField;
import omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.fields.ContraBrokerField;
import omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.fields.ContraOrderReferenceField;
import omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.fields.CrossTypeField;
import omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.fields.OrderReferenceField;
import omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.fields.PriceField;
import omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.fields.SettlementTermsField;
import omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.fields.SharesField;
import omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.fields.StockField;
import omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.fields.TradeAttributeField;
import omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.fields.TradeReferenceField;
import omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.types.Field;
import omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.types.Message;
import omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.types.PrintOptions;

/**
 * Represents the TradeMessage message from the Chixmd protocol.
 *
 * <p>A Trade Message is sent when a trade occurs against order quantity not visible on the book (i.e. a fully or partially hidden order). They do not affect the book. The Order Reference is always 0 and the Buy/Sell indicator B.</p>
 */
public final class TradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'P';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 63;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Message";

    /**
     * Day unique order reference number
     */
    private final OrderReferenceField orderReference = new OrderReferenceField();

    /**
     * B = Buy Order; S = Sell Order
     */
    private final BuySellIndicatorField buySellIndicator = new BuySellIndicatorField();

    /**
     * Total number of shares being added to the book (may be less than the number of shares entered because part of the order may trade before being posted to the book).
     */
    private final SharesField shares = new SharesField();

    /**
     * Stock symbol right padded with spaces.
     */
    private final StockField stock = new StockField();

    /**
     * The display price of the order.
     */
    private final PriceField price = new PriceField();

    /**
     * Day unique trade reference number
     */
    private final TradeReferenceField tradeReference = new TradeReferenceField();

    /**
     * The reference key of the contra-order that was executed.
     */
    private final ContraOrderReferenceField contraOrderReference = new ContraOrderReferenceField();

    /**
     * The three digit numeric TSX Broker Number or 001 for anonymous.
     */
    private final BrokerField broker = new BrokerField();

    /**
     * The three digit numeric TSX Broker Number of the contra order or 001 for anonymous.
     */
    private final ContraBrokerField contraBroker = new ContraBrokerField();

    /**
     * C = Market On Close
     */
    private final TradeAttributeField tradeAttribute = new TradeAttributeField();

    /**
     * I = Internal; B = Basis; C = Contingent; V = VWAP; X = Intentional Cross; D = Derivative Related; N = Net Asset Value
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * T = Cash Today; D = Delayed Delivery
     */
    private final SettlementTermsField settlementTerms = new SettlementTermsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(orderReference, buySellIndicator, shares, stock, price, tradeReference, contraOrderReference, broker, contraBroker, tradeAttribute, crossType, settlementTerms);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Day unique order reference number
     *
     * @return the OrderReference field
     */
    public OrderReferenceField orderReference() {
        return orderReference;
    }

    /**
     * B = Buy Order; S = Sell Order
     *
     * @return the BuySellIndicator field
     */
    public BuySellIndicatorField buySellIndicator() {
        return buySellIndicator;
    }

    /**
     * Total number of shares being added to the book (may be less than the number of shares entered because part of the order may trade before being posted to the book).
     *
     * @return the Shares field
     */
    public SharesField shares() {
        return shares;
    }

    /**
     * Stock symbol right padded with spaces.
     *
     * @return the Stock field
     */
    public StockField stock() {
        return stock;
    }

    /**
     * The display price of the order.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Day unique trade reference number
     *
     * @return the TradeReference field
     */
    public TradeReferenceField tradeReference() {
        return tradeReference;
    }

    /**
     * The reference key of the contra-order that was executed.
     *
     * @return the ContraOrderReference field
     */
    public ContraOrderReferenceField contraOrderReference() {
        return contraOrderReference;
    }

    /**
     * The three digit numeric TSX Broker Number or 001 for anonymous.
     *
     * @return the Broker field
     */
    public BrokerField broker() {
        return broker;
    }

    /**
     * The three digit numeric TSX Broker Number of the contra order or 001 for anonymous.
     *
     * @return the ContraBroker field
     */
    public ContraBrokerField contraBroker() {
        return contraBroker;
    }

    /**
     * C = Market On Close
     *
     * @return the TradeAttribute field
     */
    public TradeAttributeField tradeAttribute() {
        return tradeAttribute;
    }

    /**
     * I = Internal; B = Basis; C = Contingent; V = VWAP; X = Intentional Cross; D = Derivative Related; N = Net Asset Value
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * T = Cash Today; D = Delayed Delivery
     *
     * @return the SettlementTerms field
     */
    public SettlementTermsField settlementTerms() {
        return settlementTerms;
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
        if (!orderReference.parse(data, cursor)) {
            return false;
        }
        cursor += OrderReferenceField.BYTE_LENGTH;
        if (!buySellIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BuySellIndicatorField.BYTE_LENGTH;
        if (!shares.parse(data, cursor)) {
            return false;
        }
        cursor += SharesField.BYTE_LENGTH;
        if (!stock.parse(data, cursor)) {
            return false;
        }
        cursor += StockField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!tradeReference.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReferenceField.BYTE_LENGTH;
        if (!contraOrderReference.parse(data, cursor)) {
            return false;
        }
        cursor += ContraOrderReferenceField.BYTE_LENGTH;
        if (!broker.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerField.BYTE_LENGTH;
        if (!contraBroker.parse(data, cursor)) {
            return false;
        }
        cursor += ContraBrokerField.BYTE_LENGTH;
        if (!tradeAttribute.parse(data, cursor)) {
            return false;
        }
        cursor += TradeAttributeField.BYTE_LENGTH;
        if (!crossType.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeField.BYTE_LENGTH;
        return settlementTerms.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = orderReference.encode(data, cursor);
        cursor = buySellIndicator.encode(data, cursor);
        cursor = shares.encode(data, cursor);
        cursor = stock.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = tradeReference.encode(data, cursor);
        cursor = contraOrderReference.encode(data, cursor);
        cursor = broker.encode(data, cursor);
        cursor = contraBroker.encode(data, cursor);
        cursor = tradeAttribute.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = settlementTerms.encode(data, cursor);
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
            case "OrderReference" -> Optional.of(orderReference);
            case "BuySellIndicator" -> Optional.of(buySellIndicator);
            case "Shares" -> Optional.of(shares);
            case "Stock" -> Optional.of(stock);
            case "Price" -> Optional.of(price);
            case "TradeReference" -> Optional.of(tradeReference);
            case "ContraOrderReference" -> Optional.of(contraOrderReference);
            case "Broker" -> Optional.of(broker);
            case "ContraBroker" -> Optional.of(contraBroker);
            case "TradeAttribute" -> Optional.of(tradeAttribute);
            case "CrossType" -> Optional.of(crossType);
            case "SettlementTerms" -> Optional.of(settlementTerms);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeMessage message)) {
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
        if (!(other instanceof TradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
