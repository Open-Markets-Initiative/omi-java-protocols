package omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.MaximumThresholdPriceOptionsFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.MinimumThresholdPriceOptionsFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.StrikePriceInstrumentFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.TickIncrement;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.TickValueFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.CallPutCodeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ContractMonthCodeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ContractSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.CurrencyField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.DeliveryTypeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExpiryDayField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExpiryYearField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.GroupInstrumentField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.InstrumentExternalCodeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.InstrumentField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.MarketFlowIndicatorField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.MaximumNumberOfContractsPerOrderField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.MinimumNumberOfContractsPerOrderField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.RootSymbolField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.StrikePriceCurrencyField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.PrintOptions;

/**
 * Represents the FutureOptionsInstrumentKeysMessage message from the SolaMulticast protocol.
 *
 * <p>Future Options Instrument Keys message</p>
 */
public final class FutureOptionsInstrumentKeysMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 114;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Future Options Instrument Keys Message";

    /**
     * Exchange on which the trade occurred Q = Montreal
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Option base symbol (symbol of the underlying)
     */
    private final RootSymbolField rootSymbol = new RootSymbolField();

    /**
     * Option month code
     */
    private final ContractMonthCodeField contractMonthCode = new ContractMonthCodeField();

    /**
     * Last two digits of the option expiry year
     */
    private final ExpiryYearField expiryYear = new ExpiryYearField();

    /**
     * Expiry day of the option
     */
    private final ExpiryDayField expiryDay = new ExpiryDayField();

    /**
     * C = Call, P = Put
     */
    private final CallPutCodeField callPutCode = new CallPutCodeField();

    /**
     * Currency used for the Option Strike Price
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
     * Branch
     */
    private final StrikePriceInstrumentFractionPair strikePriceInstrumentFractionPair = new StrikePriceInstrumentFractionPair();

    /**
     * Branch
     */
    private final MaximumThresholdPriceOptionsFractionPair maximumThresholdPriceOptionsFractionPair = new MaximumThresholdPriceOptionsFractionPair();

    /**
     * Branch
     */
    private final MinimumThresholdPriceOptionsFractionPair minimumThresholdPriceOptionsFractionPair = new MinimumThresholdPriceOptionsFractionPair();

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
    private final List<Field> fields = List.of(exchangeId, rootSymbol, contractMonthCode, expiryYear, expiryDay, callPutCode, strikePriceCurrency, maximumNumberOfContractsPerOrder, minimumNumberOfContractsPerOrder, marketFlowIndicator, groupInstrument, instrument, instrumentExternalCode, contractSize, currency, deliveryType);

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
     * Option base symbol (symbol of the underlying)
     *
     * @return the RootSymbol field
     */
    public RootSymbolField rootSymbol() {
        return rootSymbol;
    }

    /**
     * Option month code
     *
     * @return the ContractMonthCode field
     */
    public ContractMonthCodeField contractMonthCode() {
        return contractMonthCode;
    }

    /**
     * Last two digits of the option expiry year
     *
     * @return the ExpiryYear field
     */
    public ExpiryYearField expiryYear() {
        return expiryYear;
    }

    /**
     * Expiry day of the option
     *
     * @return the ExpiryDay field
     */
    public ExpiryDayField expiryDay() {
        return expiryDay;
    }

    /**
     * C = Call, P = Put
     *
     * @return the CallPutCode field
     */
    public CallPutCodeField callPutCode() {
        return callPutCode;
    }

    /**
     * Currency used for the Option Strike Price
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
     * Branch
     *
     * @return the StrikePriceInstrumentFractionPair record
     */
    public StrikePriceInstrumentFractionPair strikePriceInstrumentFractionPair() {
        return strikePriceInstrumentFractionPair;
    }

    /**
     * Branch
     *
     * @return the MaximumThresholdPriceOptionsFractionPair record
     */
    public MaximumThresholdPriceOptionsFractionPair maximumThresholdPriceOptionsFractionPair() {
        return maximumThresholdPriceOptionsFractionPair;
    }

    /**
     * Branch
     *
     * @return the MinimumThresholdPriceOptionsFractionPair record
     */
    public MinimumThresholdPriceOptionsFractionPair minimumThresholdPriceOptionsFractionPair() {
        return minimumThresholdPriceOptionsFractionPair;
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
        if (!contractMonthCode.parse(data, cursor)) {
            return false;
        }
        cursor += ContractMonthCodeField.BYTE_LENGTH;
        if (!expiryYear.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryYearField.BYTE_LENGTH;
        if (!expiryDay.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDayField.BYTE_LENGTH;
        if (!callPutCode.parse(data, cursor)) {
            return false;
        }
        cursor += CallPutCodeField.BYTE_LENGTH;
        if (!strikePriceInstrumentFractionPair.parseFrom(data, cursor, end - 93)) {
            return false;
        }
        cursor += strikePriceInstrumentFractionPair.byteLength();
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
        if (!maximumThresholdPriceOptionsFractionPair.parseFrom(data, cursor, end - 71)) {
            return false;
        }
        cursor += maximumThresholdPriceOptionsFractionPair.byteLength();
        if (!minimumThresholdPriceOptionsFractionPair.parseFrom(data, cursor, end - 64)) {
            return false;
        }
        cursor += minimumThresholdPriceOptionsFractionPair.byteLength();
        if (!tickIncrement.parseFrom(data, cursor, end - 57)) {
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
        if (!tickValueFractionPair.parseFrom(data, cursor, end - 4)) {
            return false;
        }
        cursor += tickValueFractionPair.byteLength();
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        return deliveryType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = rootSymbol.encode(data, cursor);
        cursor = contractMonthCode.encode(data, cursor);
        cursor = expiryYear.encode(data, cursor);
        cursor = expiryDay.encode(data, cursor);
        cursor = callPutCode.encode(data, cursor);
        cursor = strikePriceInstrumentFractionPair.encode(data, cursor);
        cursor = strikePriceCurrency.encode(data, cursor);
        cursor = maximumNumberOfContractsPerOrder.encode(data, cursor);
        cursor = minimumNumberOfContractsPerOrder.encode(data, cursor);
        cursor = maximumThresholdPriceOptionsFractionPair.encode(data, cursor);
        cursor = minimumThresholdPriceOptionsFractionPair.encode(data, cursor);
        cursor = tickIncrement.encode(data, cursor);
        cursor = marketFlowIndicator.encode(data, cursor);
        cursor = groupInstrument.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = instrumentExternalCode.encode(data, cursor);
        cursor = contractSize.encode(data, cursor);
        cursor = tickValueFractionPair.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = deliveryType.encode(data, cursor);
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
        strikePriceInstrumentFractionPair.clear();
        maximumThresholdPriceOptionsFractionPair.clear();
        minimumThresholdPriceOptionsFractionPair.clear();
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
        if (!strikePriceInstrumentFractionPair.isRecognized()) {
            return false;
        }
        if (!maximumThresholdPriceOptionsFractionPair.isRecognized()) {
            return false;
        }
        if (!minimumThresholdPriceOptionsFractionPair.isRecognized()) {
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
        if (!strikePriceInstrumentFractionPair.isValid()) {
            return false;
        }
        if (!maximumThresholdPriceOptionsFractionPair.isValid()) {
            return false;
        }
        if (!minimumThresholdPriceOptionsFractionPair.isValid()) {
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
            case "ContractMonthCode" -> Optional.of(contractMonthCode);
            case "ExpiryYear" -> Optional.of(expiryYear);
            case "ExpiryDay" -> Optional.of(expiryDay);
            case "CallPutCode" -> Optional.of(callPutCode);
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
        changed.addAll(strikePriceInstrumentFractionPair.diffFields(message.strikePriceInstrumentFractionPair));
        changed.addAll(maximumThresholdPriceOptionsFractionPair.diffFields(message.maximumThresholdPriceOptionsFractionPair));
        changed.addAll(minimumThresholdPriceOptionsFractionPair.diffFields(message.minimumThresholdPriceOptionsFractionPair));
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
            strikePriceInstrumentFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            maximumThresholdPriceOptionsFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            minimumThresholdPriceOptionsFractionPair.toFormattedString(builder, options);
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
        strikePriceInstrumentFractionPair.toFormattedString(builder, nested);
        maximumThresholdPriceOptionsFractionPair.toFormattedString(builder, nested);
        minimumThresholdPriceOptionsFractionPair.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && strikePriceInstrumentFractionPair.equals(message.strikePriceInstrumentFractionPair) && maximumThresholdPriceOptionsFractionPair.equals(message.maximumThresholdPriceOptionsFractionPair) && minimumThresholdPriceOptionsFractionPair.equals(message.minimumThresholdPriceOptionsFractionPair) && tickIncrement.equals(message.tickIncrement) && tickValueFractionPair.equals(message.tickValueFractionPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, strikePriceInstrumentFractionPair, maximumThresholdPriceOptionsFractionPair, minimumThresholdPriceOptionsFractionPair, tickIncrement, tickValueFractionPair);
    }
}
