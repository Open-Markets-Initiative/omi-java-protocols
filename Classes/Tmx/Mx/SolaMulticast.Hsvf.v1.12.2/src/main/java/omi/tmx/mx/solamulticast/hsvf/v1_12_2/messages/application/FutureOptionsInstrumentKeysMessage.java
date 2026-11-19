package omi.tmx.mx.solamulticast.hsvf.v1_12_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.branches.MaximumThresholdPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.branches.MinimumThresholdPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.branches.TickIncrement;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.branches.TickValueFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.ContractSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.CurrencyField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.DeliveryTypeField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.ExpiryDateField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.GroupInstrumentField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.InstrumentExternalCodeField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.InstrumentField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.MarketFlowIndicatorField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.MaximumNumberOfContractsPerOrderField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.MinimumNumberOfContractsPerOrderField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.StrikePriceCurrencyField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.UnderlyingRootSymbolField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.UnderlyingSymbolMonthField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.UnderlyingSymbolYearField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.FutureOptionSymbol;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.LongMessageHeader;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.types.PrintOptions;

/**
 * Represents the FutureOptionsInstrumentKeysMessage message from the SolaMulticast protocol.
 *
 * <p>Future Options Instrument Keys message</p>
 */
public final class FutureOptionsInstrumentKeysMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 145;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Future Options Instrument Keys Message";

    /**
     * Exchange Id
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Expiry Date
     */
    private final ExpiryDateField expiryDate = new ExpiryDateField();

    /**
     * Strike Price Currency
     */
    private final StrikePriceCurrencyField strikePriceCurrency = new StrikePriceCurrencyField();

    /**
     * Maximum Number Of Contracts Per Order
     */
    private final MaximumNumberOfContractsPerOrderField maximumNumberOfContractsPerOrder = new MaximumNumberOfContractsPerOrderField();

    /**
     * Minimum Number Of Contracts Per Order
     */
    private final MinimumNumberOfContractsPerOrderField minimumNumberOfContractsPerOrder = new MinimumNumberOfContractsPerOrderField();

    /**
     * Market Flow Indicator
     */
    private final MarketFlowIndicatorField marketFlowIndicator = new MarketFlowIndicatorField();

    /**
     * Group Instrument
     */
    private final GroupInstrumentField groupInstrument = new GroupInstrumentField();

    /**
     * Instrument
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * Instrument External Code
     */
    private final InstrumentExternalCodeField instrumentExternalCode = new InstrumentExternalCodeField();

    /**
     * Contract Size
     */
    private final ContractSizeField contractSize = new ContractSizeField();

    /**
     * Currency
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Delivery Type
     */
    private final DeliveryTypeField deliveryType = new DeliveryTypeField();

    /**
     * Underlying Root Symbol
     */
    private final UnderlyingRootSymbolField underlyingRootSymbol = new UnderlyingRootSymbolField();

    /**
     * Underlying Symbol Month
     */
    private final UnderlyingSymbolMonthField underlyingSymbolMonth = new UnderlyingSymbolMonthField();

    /**
     * Underlying Symbol Year
     */
    private final UnderlyingSymbolYearField underlyingSymbolYear = new UnderlyingSymbolYearField();

    /**
     * The guide states these fields once, as Table 3: Long Message Header, for every message the eight Table 2 frames do not. Sequence Number and Message Type are read by the packet, so they are not repeated here.
     */
    private final LongMessageHeader longMessageHeader = new LongMessageHeader();

    /**
     * The guide states the future option symbol once and every future options message carries it.
     */
    private final FutureOptionSymbol futureOptionSymbol = new FutureOptionSymbol();

    /**
     * Branch
     */
    private final MaximumThresholdPriceFractionPair maximumThresholdPriceFractionPair = new MaximumThresholdPriceFractionPair();

    /**
     * Branch
     */
    private final MinimumThresholdPriceFractionPair minimumThresholdPriceFractionPair = new MinimumThresholdPriceFractionPair();

    /**
     * Branch
     */
    private final TickIncrement tickIncrement = new TickIncrement();

    /**
     * Branch
     */
    private final TickValueFractionPair tickValueFractionPair = new TickValueFractionPair();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(longMessageHeader.fields(), List.<Field>of(exchangeId), List.<Field>of(expiryDate), List.<Field>of(strikePriceCurrency), List.<Field>of(maximumNumberOfContractsPerOrder), List.<Field>of(minimumNumberOfContractsPerOrder), List.<Field>of(marketFlowIndicator), List.<Field>of(groupInstrument), List.<Field>of(instrument), List.<Field>of(instrumentExternalCode), List.<Field>of(contractSize), List.<Field>of(currency), List.<Field>of(deliveryType), List.<Field>of(underlyingRootSymbol), List.<Field>of(underlyingSymbolMonth), List.<Field>of(underlyingSymbolYear)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange Id
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Expiry Date
     *
     * @return the ExpiryDate field
     */
    public ExpiryDateField expiryDate() {
        return expiryDate;
    }

    /**
     * Strike Price Currency
     *
     * @return the StrikePriceCurrency field
     */
    public StrikePriceCurrencyField strikePriceCurrency() {
        return strikePriceCurrency;
    }

    /**
     * Maximum Number Of Contracts Per Order
     *
     * @return the MaximumNumberOfContractsPerOrder field
     */
    public MaximumNumberOfContractsPerOrderField maximumNumberOfContractsPerOrder() {
        return maximumNumberOfContractsPerOrder;
    }

    /**
     * Minimum Number Of Contracts Per Order
     *
     * @return the MinimumNumberOfContractsPerOrder field
     */
    public MinimumNumberOfContractsPerOrderField minimumNumberOfContractsPerOrder() {
        return minimumNumberOfContractsPerOrder;
    }

    /**
     * Market Flow Indicator
     *
     * @return the MarketFlowIndicator field
     */
    public MarketFlowIndicatorField marketFlowIndicator() {
        return marketFlowIndicator;
    }

    /**
     * Group Instrument
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
     * Instrument External Code
     *
     * @return the InstrumentExternalCode field
     */
    public InstrumentExternalCodeField instrumentExternalCode() {
        return instrumentExternalCode;
    }

    /**
     * Contract Size
     *
     * @return the ContractSize field
     */
    public ContractSizeField contractSize() {
        return contractSize;
    }

    /**
     * Currency
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Delivery Type
     *
     * @return the DeliveryType field
     */
    public DeliveryTypeField deliveryType() {
        return deliveryType;
    }

    /**
     * Underlying Root Symbol
     *
     * @return the UnderlyingRootSymbol field
     */
    public UnderlyingRootSymbolField underlyingRootSymbol() {
        return underlyingRootSymbol;
    }

    /**
     * Underlying Symbol Month
     *
     * @return the UnderlyingSymbolMonth field
     */
    public UnderlyingSymbolMonthField underlyingSymbolMonth() {
        return underlyingSymbolMonth;
    }

    /**
     * Underlying Symbol Year
     *
     * @return the UnderlyingSymbolYear field
     */
    public UnderlyingSymbolYearField underlyingSymbolYear() {
        return underlyingSymbolYear;
    }

    /**
     * The guide states these fields once, as Table 3: Long Message Header, for every message the eight Table 2 frames do not. Sequence Number and Message Type are read by the packet, so they are not repeated here.
     *
     * @return the LongMessageHeader record
     */
    public LongMessageHeader longMessageHeader() {
        return longMessageHeader;
    }

    /**
     * The guide states the future option symbol once and every future options message carries it.
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
     * @return the MinimumThresholdPriceFractionPair record
     */
    public MinimumThresholdPriceFractionPair minimumThresholdPriceFractionPair() {
        return minimumThresholdPriceFractionPair;
    }

    /**
     * Branch
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
        if (!longMessageHeader.parseFrom(data, cursor, end - 133)) {
            return false;
        }
        cursor += longMessageHeader.byteLength();
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!futureOptionSymbol.parseFrom(data, cursor, end - 112)) {
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
        if (!maximumThresholdPriceFractionPair.parseFrom(data, cursor, end - 83)) {
            return false;
        }
        cursor += maximumThresholdPriceFractionPair.byteLength();
        if (!minimumThresholdPriceFractionPair.parseFrom(data, cursor, end - 75)) {
            return false;
        }
        cursor += minimumThresholdPriceFractionPair.byteLength();
        if (!tickIncrement.parseFrom(data, cursor, end - 67)) {
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
        if (!tickValueFractionPair.parseFrom(data, cursor, end - 13)) {
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
        return underlyingSymbolYear.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = longMessageHeader.encode(data, cursor);
        cursor = exchangeId.encode(data, cursor);
        cursor = futureOptionSymbol.encode(data, cursor);
        cursor = expiryDate.encode(data, cursor);
        cursor = strikePriceCurrency.encode(data, cursor);
        cursor = maximumNumberOfContractsPerOrder.encode(data, cursor);
        cursor = minimumNumberOfContractsPerOrder.encode(data, cursor);
        cursor = maximumThresholdPriceFractionPair.encode(data, cursor);
        cursor = minimumThresholdPriceFractionPair.encode(data, cursor);
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
        longMessageHeader.clear();
        futureOptionSymbol.clear();
        maximumThresholdPriceFractionPair.clear();
        minimumThresholdPriceFractionPair.clear();
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
        if (!minimumThresholdPriceFractionPair.isRecognized()) {
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
        if (!futureOptionSymbol.isValid()) {
            return false;
        }
        if (!maximumThresholdPriceFractionPair.isValid()) {
            return false;
        }
        if (!minimumThresholdPriceFractionPair.isValid()) {
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
        changed.addAll(minimumThresholdPriceFractionPair.diffFields(message.minimumThresholdPriceFractionPair));
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
            minimumThresholdPriceFractionPair.toFormattedString(builder, options);
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
        minimumThresholdPriceFractionPair.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && futureOptionSymbol.equals(message.futureOptionSymbol) && maximumThresholdPriceFractionPair.equals(message.maximumThresholdPriceFractionPair) && minimumThresholdPriceFractionPair.equals(message.minimumThresholdPriceFractionPair) && tickIncrement.equals(message.tickIncrement) && tickValueFractionPair.equals(message.tickValueFractionPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, futureOptionSymbol, maximumThresholdPriceFractionPair, minimumThresholdPriceFractionPair, tickIncrement, tickValueFractionPair);
    }
}
