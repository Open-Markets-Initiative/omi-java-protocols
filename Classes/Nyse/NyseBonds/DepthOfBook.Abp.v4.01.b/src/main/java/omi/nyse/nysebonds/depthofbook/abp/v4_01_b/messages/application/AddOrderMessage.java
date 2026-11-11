package omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.BuySellIndicatorField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.CusipIsinField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.ExchangeCodeField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.FlatPricingField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.MinimumQuantityField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.NyseBondSymbolField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.OrderReferenceNumberField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.OrderTypeField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.PaddingAsciiField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.PriceField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.PriceScaleCodeField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.QuantityField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.QuoteIdField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.SecurityTypeField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.SequenceNumberField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.SystemCodeField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.TimeField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.TradingActionField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.types.Field;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.types.Message;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.types.PrintOptions;

/**
 * Represents the AddOrderMessage message from the DepthOfBook protocol.
 *
 * <p>Sent for a new open order. The Order Reference Number is unique per order book, while the Sequence Number is unique across all order books.</p>
 */
public final class AddOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'N';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 76;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Order Message";

    /**
     * Message creation timestamp in milliseconds since midnight.
     */
    private final TimeField time = new TimeField();

    /**
     * Message sequence number, 1 to 2147483647.
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * The unique reference number per order book (system code) assigned to this order.
     */
    private final OrderReferenceNumberField orderReferenceNumber = new OrderReferenceNumberField();

    /**
     * The size of the order.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * The limit price of the bond order. See Bond Price Types.
     */
    private final PriceField price = new PriceField();

    /**
     * The power of ten dividing the price fields in this message.
     */
    private final PriceScaleCodeField priceScaleCode = new PriceScaleCodeField();

    /**
     * Whether this is a Nyse listed bond.
     */
    private final ExchangeCodeField exchangeCode = new ExchangeCodeField();

    /**
     * Which order book this order belongs to.
     */
    private final SystemCodeField systemCode = new SystemCodeField();

    /**
     * Whether this is a buy or a sell order.
     */
    private final BuySellIndicatorField buySellIndicator = new BuySellIndicatorField();

    /**
     * Whether flat pricing or interest pricing is in effect.
     */
    private final FlatPricingField flatPricing = new FlatPricingField();

    /**
     * The current state of trading for this bond.
     */
    private final TradingActionField tradingAction = new TradingActionField();

    /**
     * The type of bond. Additional types will be supported in future releases.
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * Whether the order is All or None, Minimum Quantity, or unspecified.
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * A Nyse Bonds specific identity for this bond.
     */
    private final NyseBondSymbolField nyseBondSymbol = new NyseBondSymbolField();

    /**
     * Cusip or Isin for the bond. Null unless the client requested the data and holds a licence.
     */
    private final CusipIsinField cusipIsin = new CusipIsinField();

    /**
     * 'A' plus the Mmid when attributed, otherwise 'ARCAX'.
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * Not used.
     */
    private final PaddingAsciiField paddingAscii = new PaddingAsciiField();

    /**
     * For an All or None order the size of the order, for a Minimum Quantity order the minimum size of the order, and 0 for other order types.
     */
    private final MinimumQuantityField minimumQuantity = new MinimumQuantityField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(time, sequenceNumber, orderReferenceNumber, quantity, price, priceScaleCode, exchangeCode, systemCode, buySellIndicator, flatPricing, tradingAction, securityType, orderType, nyseBondSymbol, cusipIsin, quoteId, paddingAscii, minimumQuantity);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message creation timestamp in milliseconds since midnight.
     *
     * @return the Time field
     */
    public TimeField time() {
        return time;
    }

    /**
     * Message sequence number, 1 to 2147483647.
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * The unique reference number per order book (system code) assigned to this order.
     *
     * @return the OrderReferenceNumber field
     */
    public OrderReferenceNumberField orderReferenceNumber() {
        return orderReferenceNumber;
    }

    /**
     * The size of the order.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * The limit price of the bond order. See Bond Price Types.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The power of ten dividing the price fields in this message.
     *
     * @return the PriceScaleCode field
     */
    public PriceScaleCodeField priceScaleCode() {
        return priceScaleCode;
    }

    /**
     * Whether this is a Nyse listed bond.
     *
     * @return the ExchangeCode field
     */
    public ExchangeCodeField exchangeCode() {
        return exchangeCode;
    }

    /**
     * Which order book this order belongs to.
     *
     * @return the SystemCode field
     */
    public SystemCodeField systemCode() {
        return systemCode;
    }

    /**
     * Whether this is a buy or a sell order.
     *
     * @return the BuySellIndicator field
     */
    public BuySellIndicatorField buySellIndicator() {
        return buySellIndicator;
    }

    /**
     * Whether flat pricing or interest pricing is in effect.
     *
     * @return the FlatPricing field
     */
    public FlatPricingField flatPricing() {
        return flatPricing;
    }

    /**
     * The current state of trading for this bond.
     *
     * @return the TradingAction field
     */
    public TradingActionField tradingAction() {
        return tradingAction;
    }

    /**
     * The type of bond. Additional types will be supported in future releases.
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
    }

    /**
     * Whether the order is All or None, Minimum Quantity, or unspecified.
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * A Nyse Bonds specific identity for this bond.
     *
     * @return the NyseBondSymbol field
     */
    public NyseBondSymbolField nyseBondSymbol() {
        return nyseBondSymbol;
    }

    /**
     * Cusip or Isin for the bond. Null unless the client requested the data and holds a licence.
     *
     * @return the CusipIsin field
     */
    public CusipIsinField cusipIsin() {
        return cusipIsin;
    }

    /**
     * 'A' plus the Mmid when attributed, otherwise 'ARCAX'.
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
    }

    /**
     * Not used.
     *
     * @return the PaddingAscii field
     */
    public PaddingAsciiField paddingAscii() {
        return paddingAscii;
    }

    /**
     * For an All or None order the size of the order, for a Minimum Quantity order the minimum size of the order, and 0 for other order types.
     *
     * @return the MinimumQuantity field
     */
    public MinimumQuantityField minimumQuantity() {
        return minimumQuantity;
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
        if (!time.parse(data, cursor)) {
            return false;
        }
        cursor += TimeField.BYTE_LENGTH;
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!orderReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderReferenceNumberField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!priceScaleCode.parse(data, cursor)) {
            return false;
        }
        cursor += PriceScaleCodeField.BYTE_LENGTH;
        if (!exchangeCode.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeCodeField.BYTE_LENGTH;
        if (!systemCode.parse(data, cursor)) {
            return false;
        }
        cursor += SystemCodeField.BYTE_LENGTH;
        if (!buySellIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BuySellIndicatorField.BYTE_LENGTH;
        if (!flatPricing.parse(data, cursor)) {
            return false;
        }
        cursor += FlatPricingField.BYTE_LENGTH;
        if (!tradingAction.parse(data, cursor)) {
            return false;
        }
        cursor += TradingActionField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        if (!nyseBondSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += NyseBondSymbolField.BYTE_LENGTH;
        if (!cusipIsin.parse(data, cursor)) {
            return false;
        }
        cursor += CusipIsinField.BYTE_LENGTH;
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!paddingAscii.parse(data, cursor)) {
            return false;
        }
        cursor += PaddingAsciiField.BYTE_LENGTH;
        return minimumQuantity.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = time.encode(data, cursor);
        cursor = sequenceNumber.encode(data, cursor);
        cursor = orderReferenceNumber.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = priceScaleCode.encode(data, cursor);
        cursor = exchangeCode.encode(data, cursor);
        cursor = systemCode.encode(data, cursor);
        cursor = buySellIndicator.encode(data, cursor);
        cursor = flatPricing.encode(data, cursor);
        cursor = tradingAction.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = nyseBondSymbol.encode(data, cursor);
        cursor = cusipIsin.encode(data, cursor);
        cursor = quoteId.encode(data, cursor);
        cursor = paddingAscii.encode(data, cursor);
        cursor = minimumQuantity.encode(data, cursor);
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
            case "Time" -> Optional.of(time);
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "OrderReferenceNumber" -> Optional.of(orderReferenceNumber);
            case "Quantity" -> Optional.of(quantity);
            case "Price" -> Optional.of(price);
            case "PriceScaleCode" -> Optional.of(priceScaleCode);
            case "ExchangeCode" -> Optional.of(exchangeCode);
            case "SystemCode" -> Optional.of(systemCode);
            case "BuySellIndicator" -> Optional.of(buySellIndicator);
            case "FlatPricing" -> Optional.of(flatPricing);
            case "TradingAction" -> Optional.of(tradingAction);
            case "SecurityType" -> Optional.of(securityType);
            case "OrderType" -> Optional.of(orderType);
            case "NyseBondSymbol" -> Optional.of(nyseBondSymbol);
            case "CusipIsin" -> Optional.of(cusipIsin);
            case "QuoteId" -> Optional.of(quoteId);
            case "PaddingAscii" -> Optional.of(paddingAscii);
            case "MinimumQuantity" -> Optional.of(minimumQuantity);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddOrderMessage message)) {
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
        if (!(other instanceof AddOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
