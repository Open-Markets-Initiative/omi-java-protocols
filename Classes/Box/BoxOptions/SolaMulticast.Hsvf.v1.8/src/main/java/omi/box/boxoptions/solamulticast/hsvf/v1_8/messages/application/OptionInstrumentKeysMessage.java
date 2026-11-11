package omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ExchangeIdField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.GroupInstrumentField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.InstrumentExternalCodeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.InstrumentField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.MaximumNumberOfContractsPerOrderField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.MaximumThresholdPriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.MaximumThresholdPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.MinimumNumberOfContractsPerOrderField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.MinimumThresholdPriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.MinimumThresholdPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.OptionTypeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.StrikePriceCurrencyField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.TickIncrementField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.TickIncrementFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.UnderlyingSymbolRootField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.structs.InstrumentDescription;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.structs.MarketFlowIndicator;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.structs.OptionMarker;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Field;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Message;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.PrintOptions;

/**
 * Represents the OptionInstrumentKeysMessage message from the SolaMulticast protocol.
 *
 * <p>Option Instrument Keys</p>
 */
public final class OptionInstrumentKeysMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 108;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Option Instrument Keys Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 8, 1 };

    /**
     * Q by default
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

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
     * Maximum threshold price authorized for an option contract
     */
    private final MaximumThresholdPriceField maximumThresholdPrice = new MaximumThresholdPriceField();

    /**
     * Defines number of decimal places or fraction positions
     */
    private final MaximumThresholdPriceFractionIndicatorField maximumThresholdPriceFractionIndicator = new MaximumThresholdPriceFractionIndicatorField();

    /**
     * Minimum threshold price authorized for an option contract
     */
    private final MinimumThresholdPriceField minimumThresholdPrice = new MinimumThresholdPriceField();

    /**
     * Defines number of decimal places or fraction positions
     */
    private final MinimumThresholdPriceFractionIndicatorField minimumThresholdPriceFractionIndicator = new MinimumThresholdPriceFractionIndicatorField();

    /**
     * Precision with which the price of an order limit can be expressed
     */
    private final TickIncrementField tickIncrement = new TickIncrementField();

    /**
     * Defines number of decimal places or fraction positions
     */
    private final TickIncrementFractionIndicatorField tickIncrementFractionIndicator = new TickIncrementFractionIndicatorField();

    /**
     * Type of option
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * Group of the instrument
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
     * Symbol root for the underlying security
     */
    private final UnderlyingSymbolRootField underlyingSymbolRoot = new UnderlyingSymbolRootField();

    /**
     * Instrument Description
     */
    private final InstrumentDescription instrumentDescription = new InstrumentDescription();

    /**
     * Market Flow Indicator
     */
    private final MarketFlowIndicator marketFlowIndicator = new MarketFlowIndicator();

    /**
     * Option Marker
     */
    private final OptionMarker optionMarker = new OptionMarker();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(exchangeId), instrumentDescription.fields(), List.<Field>of(strikePriceCurrency), List.<Field>of(maximumNumberOfContractsPerOrder), List.<Field>of(minimumNumberOfContractsPerOrder), List.<Field>of(maximumThresholdPrice), List.<Field>of(maximumThresholdPriceFractionIndicator), List.<Field>of(minimumThresholdPrice), List.<Field>of(minimumThresholdPriceFractionIndicator), List.<Field>of(tickIncrement), List.<Field>of(tickIncrementFractionIndicator), List.<Field>of(optionType), marketFlowIndicator.fields(), List.<Field>of(groupInstrument), List.<Field>of(instrument), List.<Field>of(instrumentExternalCode), optionMarker.fields(), List.<Field>of(underlyingSymbolRoot)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Q by default
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
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
     * Maximum threshold price authorized for an option contract
     *
     * @return the MaximumThresholdPrice field
     */
    public MaximumThresholdPriceField maximumThresholdPrice() {
        return maximumThresholdPrice;
    }

    /**
     * Defines number of decimal places or fraction positions
     *
     * @return the MaximumThresholdPriceFractionIndicator field
     */
    public MaximumThresholdPriceFractionIndicatorField maximumThresholdPriceFractionIndicator() {
        return maximumThresholdPriceFractionIndicator;
    }

    /**
     * Minimum threshold price authorized for an option contract
     *
     * @return the MinimumThresholdPrice field
     */
    public MinimumThresholdPriceField minimumThresholdPrice() {
        return minimumThresholdPrice;
    }

    /**
     * Defines number of decimal places or fraction positions
     *
     * @return the MinimumThresholdPriceFractionIndicator field
     */
    public MinimumThresholdPriceFractionIndicatorField minimumThresholdPriceFractionIndicator() {
        return minimumThresholdPriceFractionIndicator;
    }

    /**
     * Precision with which the price of an order limit can be expressed
     *
     * @return the TickIncrement field
     */
    public TickIncrementField tickIncrement() {
        return tickIncrement;
    }

    /**
     * Defines number of decimal places or fraction positions
     *
     * @return the TickIncrementFractionIndicator field
     */
    public TickIncrementFractionIndicatorField tickIncrementFractionIndicator() {
        return tickIncrementFractionIndicator;
    }

    /**
     * Type of option
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
    }

    /**
     * Group of the instrument
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
     * Symbol root for the underlying security
     *
     * @return the UnderlyingSymbolRoot field
     */
    public UnderlyingSymbolRootField underlyingSymbolRoot() {
        return underlyingSymbolRoot;
    }

    /**
     * Instrument Description
     *
     * @return the InstrumentDescription record
     */
    public InstrumentDescription instrumentDescription() {
        return instrumentDescription;
    }

    /**
     * Market Flow Indicator
     *
     * @return the MarketFlowIndicator record
     */
    public MarketFlowIndicator marketFlowIndicator() {
        return marketFlowIndicator;
    }

    /**
     * Option Marker
     *
     * @return the OptionMarker record
     */
    public OptionMarker optionMarker() {
        return optionMarker;
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
        if (!instrumentDescription.parseFrom(data, cursor, end - 87)) {
            return false;
        }
        cursor += instrumentDescription.byteLength();
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
        if (!maximumThresholdPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MaximumThresholdPriceField.BYTE_LENGTH;
        if (!maximumThresholdPriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MaximumThresholdPriceFractionIndicatorField.BYTE_LENGTH;
        if (!minimumThresholdPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumThresholdPriceField.BYTE_LENGTH;
        if (!minimumThresholdPriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumThresholdPriceFractionIndicatorField.BYTE_LENGTH;
        if (!tickIncrement.parse(data, cursor)) {
            return false;
        }
        cursor += TickIncrementField.BYTE_LENGTH;
        if (!tickIncrementFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TickIncrementFractionIndicatorField.BYTE_LENGTH;
        if (!optionType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionTypeField.BYTE_LENGTH;
        if (!marketFlowIndicator.parseFrom(data, cursor, end - 48)) {
            return false;
        }
        cursor += marketFlowIndicator.byteLength();
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
        if (!optionMarker.parseFrom(data, cursor, end - 10)) {
            return false;
        }
        cursor += optionMarker.byteLength();
        return underlyingSymbolRoot.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = instrumentDescription.encode(data, cursor);
        cursor = strikePriceCurrency.encode(data, cursor);
        cursor = maximumNumberOfContractsPerOrder.encode(data, cursor);
        cursor = minimumNumberOfContractsPerOrder.encode(data, cursor);
        cursor = maximumThresholdPrice.encode(data, cursor);
        cursor = maximumThresholdPriceFractionIndicator.encode(data, cursor);
        cursor = minimumThresholdPrice.encode(data, cursor);
        cursor = minimumThresholdPriceFractionIndicator.encode(data, cursor);
        cursor = tickIncrement.encode(data, cursor);
        cursor = tickIncrementFractionIndicator.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = marketFlowIndicator.encode(data, cursor);
        cursor = groupInstrument.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = instrumentExternalCode.encode(data, cursor);
        cursor = optionMarker.encode(data, cursor);
        cursor = underlyingSymbolRoot.encode(data, cursor);
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
        instrumentDescription.clear();
        marketFlowIndicator.clear();
        optionMarker.clear();
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
            case "ExchangeId" -> Optional.of(exchangeId);
            case "StrikePriceCurrency" -> Optional.of(strikePriceCurrency);
            case "MaximumNumberOfContractsPerOrder" -> Optional.of(maximumNumberOfContractsPerOrder);
            case "MinimumNumberOfContractsPerOrder" -> Optional.of(minimumNumberOfContractsPerOrder);
            case "MaximumThresholdPrice" -> Optional.of(maximumThresholdPrice);
            case "MaximumThresholdPriceFractionIndicator" -> Optional.of(maximumThresholdPriceFractionIndicator);
            case "MinimumThresholdPrice" -> Optional.of(minimumThresholdPrice);
            case "MinimumThresholdPriceFractionIndicator" -> Optional.of(minimumThresholdPriceFractionIndicator);
            case "TickIncrement" -> Optional.of(tickIncrement);
            case "TickIncrementFractionIndicator" -> Optional.of(tickIncrementFractionIndicator);
            case "OptionType" -> Optional.of(optionType);
            case "GroupInstrument" -> Optional.of(groupInstrument);
            case "Instrument" -> Optional.of(instrument);
            case "InstrumentExternalCode" -> Optional.of(instrumentExternalCode);
            case "UnderlyingSymbolRoot" -> Optional.of(underlyingSymbolRoot);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OptionInstrumentKeysMessage message)) {
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
        if (!(other instanceof OptionInstrumentKeysMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
