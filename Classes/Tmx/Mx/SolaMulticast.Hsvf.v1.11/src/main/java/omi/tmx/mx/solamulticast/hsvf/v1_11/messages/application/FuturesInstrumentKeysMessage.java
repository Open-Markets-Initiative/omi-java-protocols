package omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.MaximumThresholdPriceFuturesFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.MinimumThresholdPriceFuturesFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.TickIncrement;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.TickValueFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.AssociatedProductDeliveryMonthField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.AssociatedProductDeliveryYearField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.AssociatedProductExpiryDayField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.AssociatedProductRootSymbolField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ContractSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.CurrencyField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.DeliveryMonthField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.DeliveryTypeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.DeliveryYearFuturesField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExpiryDayField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.GroupInstrumentField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.InstrumentExternalCodeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.InstrumentField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.MarketFlowIndicatorField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.MaximumNumberOfContractsPerOrderField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.MinimumNumberOfContractsPerOrderField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.RootSymbolField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.UnderlyingSymbolField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.PrintOptions;

/**
 * Represents the FuturesInstrumentKeysMessage message from the SolaMulticast protocol.
 *
 * <p>Futures Instrument Keys message</p>
 */
public final class FuturesInstrumentKeysMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 123;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Futures Instrument Keys Message";

    /**
     * Exchange on which the trade occurred Q = Montreal
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Futures series symbol
     */
    private final RootSymbolField rootSymbol = new RootSymbolField();

    /**
     * Delivery month for the contract
     */
    private final DeliveryMonthField deliveryMonth = new DeliveryMonthField();

    /**
     * Two last digits of the delivery year of the future series
     */
    private final DeliveryYearFuturesField deliveryYearFutures = new DeliveryYearFuturesField();

    /**
     * Expiry day of the contract The Expiry Day for the S&amp;P/TSX futures contracts (SXA/SXB/SXH/SXF &amp; SXY) is set up as the third Friday of the month in our system. But the real last trading day for these instruments is the day before the 3rd Friday of the month (the 3rd Thursday).
     */
    private final ExpiryDayField expiryDay = new ExpiryDayField();

    /**
     * Maximum authorized number of contract per order
     */
    private final MaximumNumberOfContractsPerOrderField maximumNumberOfContractsPerOrder = new MaximumNumberOfContractsPerOrderField();

    /**
     * Minimum authorized number of contract per order
     */
    private final MinimumNumberOfContractsPerOrderField minimumNumberOfContractsPerOrder = new MinimumNumberOfContractsPerOrderField();

    /**
     * Defines the type of instruments
     */
    private final MarketFlowIndicatorField marketFlowIndicator = new MarketFlowIndicatorField();

    /**
     * group of the instrument
     */
    private final GroupInstrumentField groupInstrument = new GroupInstrumentField();

    /**
     * Instrument
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * External identifier used by traders when entering an order
     */
    private final InstrumentExternalCodeField instrumentExternalCode = new InstrumentExternalCodeField();

    /**
     * Defines the quantity of an underlying per contract
     */
    private final ContractSizeField contractSize = new ContractSizeField();

    /**
     * Defines the currency of an underlying
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Symbol root for the underlying security
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * Indicates the delivery type of the instrument
     */
    private final DeliveryTypeField deliveryType = new DeliveryTypeField();

    /**
     * Associated product’s class symbol
     */
    private final AssociatedProductRootSymbolField associatedProductRootSymbol = new AssociatedProductRootSymbolField();

    /**
     * Delivery month for the contract
     */
    private final AssociatedProductDeliveryMonthField associatedProductDeliveryMonth = new AssociatedProductDeliveryMonthField();

    /**
     * Two last digits of the delivery year of the future series
     */
    private final AssociatedProductDeliveryYearField associatedProductDeliveryYear = new AssociatedProductDeliveryYearField();

    /**
     * Expiry day of the option
     */
    private final AssociatedProductExpiryDayField associatedProductExpiryDay = new AssociatedProductExpiryDayField();

    /**
     * Branch
     */
    private final MaximumThresholdPriceFuturesFractionPair maximumThresholdPriceFuturesFractionPair = new MaximumThresholdPriceFuturesFractionPair();

    /**
     * Branch
     */
    private final MinimumThresholdPriceFuturesFractionPair minimumThresholdPriceFuturesFractionPair = new MinimumThresholdPriceFuturesFractionPair();

    /**
     * Contains the Tick Table Short Name if available. If so, field starts with TT=. Otherwise, indicates precision with which the price of an order limit can be expressed
     */
    private final TickIncrement tickIncrement = new TickIncrement();

    /**
     * Branch
     */
    private final TickValueFractionPair tickValueFractionPair = new TickValueFractionPair();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, rootSymbol, deliveryMonth, deliveryYearFutures, expiryDay, maximumNumberOfContractsPerOrder, minimumNumberOfContractsPerOrder, marketFlowIndicator, groupInstrument, instrument, instrumentExternalCode, contractSize, currency, underlyingSymbol, deliveryType, associatedProductRootSymbol, associatedProductDeliveryMonth, associatedProductDeliveryYear, associatedProductExpiryDay);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange on which the trade occurred Q = Montreal
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Futures series symbol
     *
     * @return the RootSymbol field
     */
    public RootSymbolField rootSymbol() {
        return rootSymbol;
    }

    /**
     * Delivery month for the contract
     *
     * @return the DeliveryMonth field
     */
    public DeliveryMonthField deliveryMonth() {
        return deliveryMonth;
    }

    /**
     * Two last digits of the delivery year of the future series
     *
     * @return the DeliveryYearFutures field
     */
    public DeliveryYearFuturesField deliveryYearFutures() {
        return deliveryYearFutures;
    }

    /**
     * Expiry day of the contract The Expiry Day for the S&amp;P/TSX futures contracts (SXA/SXB/SXH/SXF &amp; SXY) is set up as the third Friday of the month in our system. But the real last trading day for these instruments is the day before the 3rd Friday of the month (the 3rd Thursday).
     *
     * @return the ExpiryDay field
     */
    public ExpiryDayField expiryDay() {
        return expiryDay;
    }

    /**
     * Maximum authorized number of contract per order
     *
     * @return the MaximumNumberOfContractsPerOrder field
     */
    public MaximumNumberOfContractsPerOrderField maximumNumberOfContractsPerOrder() {
        return maximumNumberOfContractsPerOrder;
    }

    /**
     * Minimum authorized number of contract per order
     *
     * @return the MinimumNumberOfContractsPerOrder field
     */
    public MinimumNumberOfContractsPerOrderField minimumNumberOfContractsPerOrder() {
        return minimumNumberOfContractsPerOrder;
    }

    /**
     * Defines the type of instruments
     *
     * @return the MarketFlowIndicator field
     */
    public MarketFlowIndicatorField marketFlowIndicator() {
        return marketFlowIndicator;
    }

    /**
     * group of the instrument
     *
     * @return the GroupInstrument field
     */
    public GroupInstrumentField groupInstrument() {
        return groupInstrument;
    }

    /**
     * Instrument
     *
     * @return the Instrument field
     */
    public InstrumentField instrument() {
        return instrument;
    }

    /**
     * External identifier used by traders when entering an order
     *
     * @return the InstrumentExternalCode field
     */
    public InstrumentExternalCodeField instrumentExternalCode() {
        return instrumentExternalCode;
    }

    /**
     * Defines the quantity of an underlying per contract
     *
     * @return the ContractSize field
     */
    public ContractSizeField contractSize() {
        return contractSize;
    }

    /**
     * Defines the currency of an underlying
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Symbol root for the underlying security
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * Indicates the delivery type of the instrument
     *
     * @return the DeliveryType field
     */
    public DeliveryTypeField deliveryType() {
        return deliveryType;
    }

    /**
     * Associated product’s class symbol
     *
     * @return the AssociatedProductRootSymbol field
     */
    public AssociatedProductRootSymbolField associatedProductRootSymbol() {
        return associatedProductRootSymbol;
    }

    /**
     * Delivery month for the contract
     *
     * @return the AssociatedProductDeliveryMonth field
     */
    public AssociatedProductDeliveryMonthField associatedProductDeliveryMonth() {
        return associatedProductDeliveryMonth;
    }

    /**
     * Two last digits of the delivery year of the future series
     *
     * @return the AssociatedProductDeliveryYear field
     */
    public AssociatedProductDeliveryYearField associatedProductDeliveryYear() {
        return associatedProductDeliveryYear;
    }

    /**
     * Expiry day of the option
     *
     * @return the AssociatedProductExpiryDay field
     */
    public AssociatedProductExpiryDayField associatedProductExpiryDay() {
        return associatedProductExpiryDay;
    }

    /**
     * Branch
     *
     * @return the MaximumThresholdPriceFuturesFractionPair record
     */
    public MaximumThresholdPriceFuturesFractionPair maximumThresholdPriceFuturesFractionPair() {
        return maximumThresholdPriceFuturesFractionPair;
    }

    /**
     * Branch
     *
     * @return the MinimumThresholdPriceFuturesFractionPair record
     */
    public MinimumThresholdPriceFuturesFractionPair minimumThresholdPriceFuturesFractionPair() {
        return minimumThresholdPriceFuturesFractionPair;
    }

    /**
     * Contains the Tick Table Short Name if available. If so, field starts with TT=. Otherwise, indicates precision with which the price of an order limit can be expressed
     *
     * @return the TickIncrement record
     */
    public TickIncrement tickIncrement() {
        return tickIncrement;
    }

    /**
     * Branch
     *
     * @return the TickValueFractionPair record
     */
    public TickValueFractionPair tickValueFractionPair() {
        return tickValueFractionPair;
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!rootSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += RootSymbolField.BYTE_LENGTH;
        if (!deliveryMonth.parse(data, cursor)) {
            return false;
        }
        cursor += DeliveryMonthField.BYTE_LENGTH;
        if (!deliveryYearFutures.parse(data, cursor)) {
            return false;
        }
        cursor += DeliveryYearFuturesField.BYTE_LENGTH;
        if (!expiryDay.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDayField.BYTE_LENGTH;
        if (!maximumNumberOfContractsPerOrder.parse(data, cursor)) {
            return false;
        }
        cursor += MaximumNumberOfContractsPerOrderField.BYTE_LENGTH;
        if (!minimumNumberOfContractsPerOrder.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumNumberOfContractsPerOrderField.BYTE_LENGTH;
        if (!maximumThresholdPriceFuturesFractionPair.parseFrom(data, cursor, end - 92)) {
            return false;
        }
        cursor += maximumThresholdPriceFuturesFractionPair.byteLength();
        if (!minimumThresholdPriceFuturesFractionPair.parseFrom(data, cursor, end - 85)) {
            return false;
        }
        cursor += minimumThresholdPriceFuturesFractionPair.byteLength();
        if (!tickIncrement.parseFrom(data, cursor, end - 78)) {
            return false;
        }
        cursor += tickIncrement.byteLength();
        if (!marketFlowIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MarketFlowIndicatorField.BYTE_LENGTH;
        if (!groupInstrument.parse(data, cursor)) {
            return false;
        }
        cursor += GroupInstrumentField.BYTE_LENGTH;
        if (!instrument.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentField.BYTE_LENGTH;
        if (!instrumentExternalCode.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentExternalCodeField.BYTE_LENGTH;
        if (!contractSize.parse(data, cursor)) {
            return false;
        }
        cursor += ContractSizeField.BYTE_LENGTH;
        if (!tickValueFractionPair.parseFrom(data, cursor, end - 25)) {
            return false;
        }
        cursor += tickValueFractionPair.byteLength();
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
        if (!deliveryType.parse(data, cursor)) {
            return false;
        }
        cursor += DeliveryTypeField.BYTE_LENGTH;
        if (!associatedProductRootSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += AssociatedProductRootSymbolField.BYTE_LENGTH;
        if (!associatedProductDeliveryMonth.parse(data, cursor)) {
            return false;
        }
        cursor += AssociatedProductDeliveryMonthField.BYTE_LENGTH;
        if (!associatedProductDeliveryYear.parse(data, cursor)) {
            return false;
        }
        cursor += AssociatedProductDeliveryYearField.BYTE_LENGTH;
        return associatedProductExpiryDay.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = rootSymbol.encode(data, cursor);
        cursor = deliveryMonth.encode(data, cursor);
        cursor = deliveryYearFutures.encode(data, cursor);
        cursor = expiryDay.encode(data, cursor);
        cursor = maximumNumberOfContractsPerOrder.encode(data, cursor);
        cursor = minimumNumberOfContractsPerOrder.encode(data, cursor);
        cursor = maximumThresholdPriceFuturesFractionPair.encode(data, cursor);
        cursor = minimumThresholdPriceFuturesFractionPair.encode(data, cursor);
        cursor = tickIncrement.encode(data, cursor);
        cursor = marketFlowIndicator.encode(data, cursor);
        cursor = groupInstrument.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = instrumentExternalCode.encode(data, cursor);
        cursor = contractSize.encode(data, cursor);
        cursor = tickValueFractionPair.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = deliveryType.encode(data, cursor);
        cursor = associatedProductRootSymbol.encode(data, cursor);
        cursor = associatedProductDeliveryMonth.encode(data, cursor);
        cursor = associatedProductDeliveryYear.encode(data, cursor);
        cursor = associatedProductExpiryDay.encode(data, cursor);
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
        maximumThresholdPriceFuturesFractionPair.clear();
        minimumThresholdPriceFuturesFractionPair.clear();
        tickIncrement.clear();
        tickValueFractionPair.clear();
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
        if (!maximumThresholdPriceFuturesFractionPair.isRecognized()) {
            return false;
        }
        if (!minimumThresholdPriceFuturesFractionPair.isRecognized()) {
            return false;
        }
        if (!tickIncrement.isRecognized()) {
            return false;
        }
        return tickValueFractionPair.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!maximumThresholdPriceFuturesFractionPair.isValid()) {
            return false;
        }
        if (!minimumThresholdPriceFuturesFractionPair.isValid()) {
            return false;
        }
        if (!tickIncrement.isValid()) {
            return false;
        }
        if (!tickValueFractionPair.isValid()) {
            return false;
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
            case "ExchangeId" -> Optional.of(exchangeId);
            case "RootSymbol" -> Optional.of(rootSymbol);
            case "DeliveryMonth" -> Optional.of(deliveryMonth);
            case "DeliveryYearFutures" -> Optional.of(deliveryYearFutures);
            case "ExpiryDay" -> Optional.of(expiryDay);
            case "MaximumNumberOfContractsPerOrder" -> Optional.of(maximumNumberOfContractsPerOrder);
            case "MinimumNumberOfContractsPerOrder" -> Optional.of(minimumNumberOfContractsPerOrder);
            case "MarketFlowIndicator" -> Optional.of(marketFlowIndicator);
            case "GroupInstrument" -> Optional.of(groupInstrument);
            case "Instrument" -> Optional.of(instrument);
            case "InstrumentExternalCode" -> Optional.of(instrumentExternalCode);
            case "ContractSize" -> Optional.of(contractSize);
            case "Currency" -> Optional.of(currency);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "DeliveryType" -> Optional.of(deliveryType);
            case "AssociatedProductRootSymbol" -> Optional.of(associatedProductRootSymbol);
            case "AssociatedProductDeliveryMonth" -> Optional.of(associatedProductDeliveryMonth);
            case "AssociatedProductDeliveryYear" -> Optional.of(associatedProductDeliveryYear);
            case "AssociatedProductExpiryDay" -> Optional.of(associatedProductExpiryDay);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FuturesInstrumentKeysMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(maximumThresholdPriceFuturesFractionPair.diffFields(message.maximumThresholdPriceFuturesFractionPair));
        changed.addAll(minimumThresholdPriceFuturesFractionPair.diffFields(message.minimumThresholdPriceFuturesFractionPair));
        changed.addAll(tickIncrement.diffFields(message.tickIncrement));
        changed.addAll(tickValueFractionPair.diffFields(message.tickValueFractionPair));
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
            builder.append(", ");
            maximumThresholdPriceFuturesFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            minimumThresholdPriceFuturesFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            tickIncrement.toFormattedString(builder, options);
            builder.append(", ");
            tickValueFractionPair.toFormattedString(builder, options);
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
        maximumThresholdPriceFuturesFractionPair.toFormattedString(builder, nested);
        minimumThresholdPriceFuturesFractionPair.toFormattedString(builder, nested);
        tickIncrement.toFormattedString(builder, nested);
        tickValueFractionPair.toFormattedString(builder, nested);
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
        if (!(other instanceof FuturesInstrumentKeysMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && maximumThresholdPriceFuturesFractionPair.equals(message.maximumThresholdPriceFuturesFractionPair) && minimumThresholdPriceFuturesFractionPair.equals(message.minimumThresholdPriceFuturesFractionPair) && tickIncrement.equals(message.tickIncrement) && tickValueFractionPair.equals(message.tickValueFractionPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, maximumThresholdPriceFuturesFractionPair, minimumThresholdPriceFuturesFractionPair, tickIncrement, tickValueFractionPair);
    }
}
