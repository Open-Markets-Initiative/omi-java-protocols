package omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.MaximumThresholdPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.MinimumThresholdPriceInstrumentFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.TickIncrement;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.TickValueFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.ContractSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.CurrencyField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.DeliveryTypeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.ExpiryDateField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.GroupInstrumentField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.InstrumentExternalCodeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.InstrumentField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.LastTradingDatetimeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.MarketFlowIndicatorField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.MaximumNumberOfContractsPerOrderField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.MinimumNumberOfContractsPerOrderField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.StrikePriceCurrencyField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.UnderlyingRootSymbolField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.UnderlyingSymbolMonthField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.UnderlyingSymbolYearField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.FutureOptionSymbol;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * Represents the FutureOptionsInstrumentKeysMessage message from the SolaMulticast protocol.
 *
 * <p>Future Options Instrument Keys message</p>
 */
public final class FutureOptionsInstrumentKeysMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 147;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Future Options Instrument Keys Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Exchange on which the trade occurred
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Expiry date
     */
    private final ExpiryDateField expiryDate = new ExpiryDateField();

    /**
     * Currency used for the option Strike Price
     */
    private final StrikePriceCurrencyField strikePriceCurrency = new StrikePriceCurrencyField();

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
     * Indicates the delivery type of the instrument
     */
    private final DeliveryTypeField deliveryType = new DeliveryTypeField();

    /**
     * Root symbol of the underlying future
     */
    private final UnderlyingRootSymbolField underlyingRootSymbol = new UnderlyingRootSymbolField();

    /**
     * Symbol month of the underlying futures contract
     */
    private final UnderlyingSymbolMonthField underlyingSymbolMonth = new UnderlyingSymbolMonthField();

    /**
     * Last 2 digits of the symbol yearof the underlying futures contract
     */
    private final UnderlyingSymbolYearField underlyingSymbolYear = new UnderlyingSymbolYearField();

    /**
     * Indicates when the instrument stops trading
     */
    private final LastTradingDatetimeField lastTradingDatetime = new LastTradingDatetimeField();

    /**
     * Option on future symbology
     */
    private final FutureOptionSymbol futureOptionSymbol = new FutureOptionSymbol();

    /**
     * Branch
     */
    private final MaximumThresholdPriceFractionPair maximumThresholdPriceFractionPair = new MaximumThresholdPriceFractionPair();

    /**
     * Branch
     */
    private final MinimumThresholdPriceInstrumentFractionPair minimumThresholdPriceInstrumentFractionPair = new MinimumThresholdPriceInstrumentFractionPair();

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
    private final List<Field> fields = List.of(exchangeId, expiryDate, strikePriceCurrency, maximumNumberOfContractsPerOrder, minimumNumberOfContractsPerOrder, marketFlowIndicator, groupInstrument, instrument, instrumentExternalCode, contractSize, currency, deliveryType, underlyingRootSymbol, underlyingSymbolMonth, underlyingSymbolYear, lastTradingDatetime);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange on which the trade occurred
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Expiry date
     *
     * @return the ExpiryDate field
     */
    public ExpiryDateField expiryDate() {
        return expiryDate;
    }

    /**
     * Currency used for the option Strike Price
     *
     * @return the StrikePriceCurrency field
     */
    public StrikePriceCurrencyField strikePriceCurrency() {
        return strikePriceCurrency;
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
     * Indicates the delivery type of the instrument
     *
     * @return the DeliveryType field
     */
    public DeliveryTypeField deliveryType() {
        return deliveryType;
    }

    /**
     * Root symbol of the underlying future
     *
     * @return the UnderlyingRootSymbol field
     */
    public UnderlyingRootSymbolField underlyingRootSymbol() {
        return underlyingRootSymbol;
    }

    /**
     * Symbol month of the underlying futures contract
     *
     * @return the UnderlyingSymbolMonth field
     */
    public UnderlyingSymbolMonthField underlyingSymbolMonth() {
        return underlyingSymbolMonth;
    }

    /**
     * Last 2 digits of the symbol yearof the underlying futures contract
     *
     * @return the UnderlyingSymbolYear field
     */
    public UnderlyingSymbolYearField underlyingSymbolYear() {
        return underlyingSymbolYear;
    }

    /**
     * Indicates when the instrument stops trading
     *
     * @return the LastTradingDatetime field
     */
    public LastTradingDatetimeField lastTradingDatetime() {
        return lastTradingDatetime;
    }

    /**
     * Option on future symbology
     *
     * @return the FutureOptionSymbol record
     */
    public FutureOptionSymbol futureOptionSymbol() {
        return futureOptionSymbol;
    }

    /**
     * Branch
     *
     * @return the MaximumThresholdPriceFractionPair record
     */
    public MaximumThresholdPriceFractionPair maximumThresholdPriceFractionPair() {
        return maximumThresholdPriceFractionPair;
    }

    /**
     * Branch
     *
     * @return the MinimumThresholdPriceInstrumentFractionPair record
     */
    public MinimumThresholdPriceInstrumentFractionPair minimumThresholdPriceInstrumentFractionPair() {
        return minimumThresholdPriceInstrumentFractionPair;
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!futureOptionSymbol.parseFrom(data, cursor, end - 126)) {
            return false;
        }
        cursor += futureOptionSymbol.byteLength();
        if (!expiryDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDateField.BYTE_LENGTH;
        if (!strikePriceCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceCurrencyField.BYTE_LENGTH;
        if (!maximumNumberOfContractsPerOrder.parse(data, cursor)) {
            return false;
        }
        cursor += MaximumNumberOfContractsPerOrderField.BYTE_LENGTH;
        if (!minimumNumberOfContractsPerOrder.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumNumberOfContractsPerOrderField.BYTE_LENGTH;
        if (!maximumThresholdPriceFractionPair.parseFrom(data, cursor, end - 97)) {
            return false;
        }
        cursor += maximumThresholdPriceFractionPair.byteLength();
        if (!minimumThresholdPriceInstrumentFractionPair.parseFrom(data, cursor, end - 89)) {
            return false;
        }
        cursor += minimumThresholdPriceInstrumentFractionPair.byteLength();
        if (!tickIncrement.parseFrom(data, cursor, end - 81)) {
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
        if (!tickValueFractionPair.parseFrom(data, cursor, end - 27)) {
            return false;
        }
        cursor += tickValueFractionPair.byteLength();
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!deliveryType.parse(data, cursor)) {
            return false;
        }
        cursor += DeliveryTypeField.BYTE_LENGTH;
        if (!underlyingRootSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingRootSymbolField.BYTE_LENGTH;
        if (!underlyingSymbolMonth.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolMonthField.BYTE_LENGTH;
        if (!underlyingSymbolYear.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolYearField.BYTE_LENGTH;
        if (!lastTradingDatetime.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradingDatetimeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = futureOptionSymbol.encode(data, cursor);
        cursor = expiryDate.encode(data, cursor);
        cursor = strikePriceCurrency.encode(data, cursor);
        cursor = maximumNumberOfContractsPerOrder.encode(data, cursor);
        cursor = minimumNumberOfContractsPerOrder.encode(data, cursor);
        cursor = maximumThresholdPriceFractionPair.encode(data, cursor);
        cursor = minimumThresholdPriceInstrumentFractionPair.encode(data, cursor);
        cursor = tickIncrement.encode(data, cursor);
        cursor = marketFlowIndicator.encode(data, cursor);
        cursor = groupInstrument.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = instrumentExternalCode.encode(data, cursor);
        cursor = contractSize.encode(data, cursor);
        cursor = tickValueFractionPair.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = deliveryType.encode(data, cursor);
        cursor = underlyingRootSymbol.encode(data, cursor);
        cursor = underlyingSymbolMonth.encode(data, cursor);
        cursor = underlyingSymbolYear.encode(data, cursor);
        cursor = lastTradingDatetime.encode(data, cursor);
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
        futureOptionSymbol.clear();
        maximumThresholdPriceFractionPair.clear();
        minimumThresholdPriceInstrumentFractionPair.clear();
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
        if (!futureOptionSymbol.isRecognized()) {
            return false;
        }
        if (!maximumThresholdPriceFractionPair.isRecognized()) {
            return false;
        }
        if (!minimumThresholdPriceInstrumentFractionPair.isRecognized()) {
            return false;
        }
        if (!tickIncrement.isRecognized()) {
            return false;
        }
        if (!tickValueFractionPair.isRecognized()) {
            return false;
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
        if (!futureOptionSymbol.isValid()) {
            return false;
        }
        if (!maximumThresholdPriceFractionPair.isValid()) {
            return false;
        }
        if (!minimumThresholdPriceInstrumentFractionPair.isValid()) {
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
            case "ExpiryDate" -> Optional.of(expiryDate);
            case "StrikePriceCurrency" -> Optional.of(strikePriceCurrency);
            case "MaximumNumberOfContractsPerOrder" -> Optional.of(maximumNumberOfContractsPerOrder);
            case "MinimumNumberOfContractsPerOrder" -> Optional.of(minimumNumberOfContractsPerOrder);
            case "MarketFlowIndicator" -> Optional.of(marketFlowIndicator);
            case "GroupInstrument" -> Optional.of(groupInstrument);
            case "Instrument" -> Optional.of(instrument);
            case "InstrumentExternalCode" -> Optional.of(instrumentExternalCode);
            case "ContractSize" -> Optional.of(contractSize);
            case "Currency" -> Optional.of(currency);
            case "DeliveryType" -> Optional.of(deliveryType);
            case "UnderlyingRootSymbol" -> Optional.of(underlyingRootSymbol);
            case "UnderlyingSymbolMonth" -> Optional.of(underlyingSymbolMonth);
            case "UnderlyingSymbolYear" -> Optional.of(underlyingSymbolYear);
            case "LastTradingDatetime" -> Optional.of(lastTradingDatetime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FutureOptionsInstrumentKeysMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(futureOptionSymbol.diffFields(message.futureOptionSymbol));
        changed.addAll(maximumThresholdPriceFractionPair.diffFields(message.maximumThresholdPriceFractionPair));
        changed.addAll(minimumThresholdPriceInstrumentFractionPair.diffFields(message.minimumThresholdPriceInstrumentFractionPair));
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
            futureOptionSymbol.toFormattedString(builder, options);
            builder.append(", ");
            maximumThresholdPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            minimumThresholdPriceInstrumentFractionPair.toFormattedString(builder, options);
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
        futureOptionSymbol.toFormattedString(builder, nested);
        maximumThresholdPriceFractionPair.toFormattedString(builder, nested);
        minimumThresholdPriceInstrumentFractionPair.toFormattedString(builder, nested);
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
        if (!(other instanceof FutureOptionsInstrumentKeysMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && futureOptionSymbol.equals(message.futureOptionSymbol) && maximumThresholdPriceFractionPair.equals(message.maximumThresholdPriceFractionPair) && minimumThresholdPriceInstrumentFractionPair.equals(message.minimumThresholdPriceInstrumentFractionPair) && tickIncrement.equals(message.tickIncrement) && tickValueFractionPair.equals(message.tickValueFractionPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, futureOptionSymbol, maximumThresholdPriceFractionPair, minimumThresholdPriceInstrumentFractionPair, tickIncrement, tickValueFractionPair);
    }
}
