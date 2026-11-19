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
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.ExpiryDayField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.ExpiryMonthStrategyField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.ExpiryYearField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.GroupInstrumentField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.InstrumentExternalCodeField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.InstrumentField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.MarketFlowIndicatorField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.MaximumNumberOfContractsPerOrderField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.MinimumNumberOfContractsPerOrderField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.NumberOfLegsField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.StrategyAllowImpliedField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.StrategyCodeField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.fields.StrategySymbolField;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.groups.StrategyInstrumentLegEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.groups.StrategyInstrumentLegList;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.structs.LongMessageHeader;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_12_2.types.PrintOptions;

/**
 * Represents the StrategyInstrumentKeysMessage message from the SolaMulticast protocol.
 *
 * <p>Strategy Instrument Keys message</p>
 */
public final class StrategyInstrumentKeysMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 127;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Strategy Instrument Keys Message";

    /**
     * Exchange Id
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Strategy Symbol
     */
    private final StrategySymbolField strategySymbol = new StrategySymbolField();

    /**
     * Last two digits of the contract expiry year from the first expiring leg
     */
    private final ExpiryYearField expiryYear = new ExpiryYearField();

    /**
     * Contract expiry month from the first expiring leg Refer to Month Codes
     */
    private final ExpiryMonthStrategyField expiryMonthStrategy = new ExpiryMonthStrategyField();

    /**
     * Contract expiry day from the first expiring leg
     */
    private final ExpiryDayField expiryDay = new ExpiryDayField();

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
     * Strategy Allow Implied
     */
    private final StrategyAllowImpliedField strategyAllowImplied = new StrategyAllowImpliedField();

    /**
     * Strategy Code
     */
    private final StrategyCodeField strategyCode = new StrategyCodeField();

    /**
     * Number Of Legs
     */
    private final NumberOfLegsField numberOfLegs = new NumberOfLegsField();

    /**
     * One leg of a strategy instrument.
     */
    private final StrategyInstrumentLegList strategyInstrumentLeg = new StrategyInstrumentLegList();

    /**
     * The guide states these fields once, as Table 3: Long Message Header, for every message the eight Table 2 frames do not. Sequence Number and Message Type are read by the packet, so they are not repeated here.
     */
    private final LongMessageHeader longMessageHeader = new LongMessageHeader();

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
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(longMessageHeader.fields(), List.<Field>of(exchangeId), List.<Field>of(strategySymbol), List.<Field>of(expiryYear), List.<Field>of(expiryMonthStrategy), List.<Field>of(expiryDay), List.<Field>of(maximumNumberOfContractsPerOrder), List.<Field>of(minimumNumberOfContractsPerOrder), List.<Field>of(marketFlowIndicator), List.<Field>of(groupInstrument), List.<Field>of(instrument), List.<Field>of(instrumentExternalCode), List.<Field>of(strategyAllowImplied), List.<Field>of(strategyCode), List.<Field>of(numberOfLegs)).flatMap(List::stream).toList();

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
     * Strategy Symbol
     *
     * @return the StrategySymbol field
     */
    public StrategySymbolField strategySymbol() {
        return strategySymbol;
    }

    /**
     * Last two digits of the contract expiry year from the first expiring leg
     *
     * @return the ExpiryYear field
     */
    public ExpiryYearField expiryYear() {
        return expiryYear;
    }

    /**
     * Contract expiry month from the first expiring leg Refer to Month Codes
     *
     * @return the ExpiryMonthStrategy field
     */
    public ExpiryMonthStrategyField expiryMonthStrategy() {
        return expiryMonthStrategy;
    }

    /**
     * Contract expiry day from the first expiring leg
     *
     * @return the ExpiryDay field
     */
    public ExpiryDayField expiryDay() {
        return expiryDay;
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
     * Strategy Allow Implied
     *
     * @return the StrategyAllowImplied field
     */
    public StrategyAllowImpliedField strategyAllowImplied() {
        return strategyAllowImplied;
    }

    /**
     * Strategy Code
     *
     * @return the StrategyCode field
     */
    public StrategyCodeField strategyCode() {
        return strategyCode;
    }

    /**
     * Number Of Legs
     *
     * @return the NumberOfLegs field
     */
    public NumberOfLegsField numberOfLegs() {
        return numberOfLegs;
    }

    /**
     * One leg of a strategy instrument.
     *
     * <p>Encode writes this list's size to the NumberOfLegs field.</p>
     *
     * @return the StrategyInstrumentLeg entries
     */
    public StrategyInstrumentLegList strategyInstrumentLeg() {
        return strategyInstrumentLeg;
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

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + strategyInstrumentLeg.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!longMessageHeader.parseFrom(data, cursor, end - 115)) {
            return false;
        }
        cursor += longMessageHeader.byteLength();
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!strategySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += StrategySymbolField.BYTE_LENGTH;
        if (!expiryYear.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryYearField.BYTE_LENGTH;
        if (!expiryMonthStrategy.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryMonthStrategyField.BYTE_LENGTH;
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
        if (!maximumThresholdPriceFractionPair.parseFrom(data, cursor, end - 59)) {
            return false;
        }
        cursor += maximumThresholdPriceFractionPair.byteLength();
        if (!minimumThresholdPriceFractionPair.parseFrom(data, cursor, end - 51)) {
            return false;
        }
        cursor += minimumThresholdPriceFractionPair.byteLength();
        if (!tickIncrement.parseFrom(data, cursor, end - 43)) {
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
        if (!strategyAllowImplied.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyAllowImpliedField.BYTE_LENGTH;
        if (!strategyCode.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyCodeField.BYTE_LENGTH;
        if (!numberOfLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfLegsField.BYTE_LENGTH;
        if (numberOfLegs.value() == null) {
            return false;
        }
        if (!strategyInstrumentLeg.parse(data, cursor, end, numberOfLegs.value())) {
            return false;
        }
        cursor += strategyInstrumentLeg.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (strategyInstrumentLeg.size() > 99) {
            throw new IllegalStateException("strategyInstrumentLeg holds " + strategyInstrumentLeg.size() + " entries, more than its count field can state");
        }
        numberOfLegs.value((long) strategyInstrumentLeg.size());
        int cursor = offset;
        cursor = longMessageHeader.encode(data, cursor);
        cursor = exchangeId.encode(data, cursor);
        cursor = strategySymbol.encode(data, cursor);
        cursor = expiryYear.encode(data, cursor);
        cursor = expiryMonthStrategy.encode(data, cursor);
        cursor = expiryDay.encode(data, cursor);
        cursor = maximumNumberOfContractsPerOrder.encode(data, cursor);
        cursor = minimumNumberOfContractsPerOrder.encode(data, cursor);
        cursor = maximumThresholdPriceFractionPair.encode(data, cursor);
        cursor = minimumThresholdPriceFractionPair.encode(data, cursor);
        cursor = tickIncrement.encode(data, cursor);
        cursor = marketFlowIndicator.encode(data, cursor);
        cursor = groupInstrument.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = instrumentExternalCode.encode(data, cursor);
        cursor = strategyAllowImplied.encode(data, cursor);
        cursor = strategyCode.encode(data, cursor);
        cursor = numberOfLegs.encode(data, cursor);
        cursor = strategyInstrumentLeg.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        longMessageHeader.clear();
        maximumThresholdPriceFractionPair.clear();
        minimumThresholdPriceFractionPair.clear();
        tickIncrement.clear();
        strategyInstrumentLeg.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfLegs && !field.isRecognized()) {
                return false;
            }
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
        return strategyInstrumentLeg.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfLegs && !field.isValid()) {
                return false;
            }
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
        if (!strategyInstrumentLeg.isValid()) {
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
        if (!longMessageHeader.isDecoded()) {
            return longMessageHeader.failedAt();
        }
        if (!exchangeId.isDecoded()) {
            return Optional.of(exchangeId);
        }
        if (!strategySymbol.isDecoded()) {
            return Optional.of(strategySymbol);
        }
        if (!expiryYear.isDecoded()) {
            return Optional.of(expiryYear);
        }
        if (!expiryMonthStrategy.isDecoded()) {
            return Optional.of(expiryMonthStrategy);
        }
        if (!expiryDay.isDecoded()) {
            return Optional.of(expiryDay);
        }
        if (!maximumNumberOfContractsPerOrder.isDecoded()) {
            return Optional.of(maximumNumberOfContractsPerOrder);
        }
        if (!minimumNumberOfContractsPerOrder.isDecoded()) {
            return Optional.of(minimumNumberOfContractsPerOrder);
        }
        if (!maximumThresholdPriceFractionPair.isDecoded()) {
            return maximumThresholdPriceFractionPair.failedAt();
        }
        if (!minimumThresholdPriceFractionPair.isDecoded()) {
            return minimumThresholdPriceFractionPair.failedAt();
        }
        if (!tickIncrement.isDecoded()) {
            return tickIncrement.failedAt();
        }
        if (!marketFlowIndicator.isDecoded()) {
            return Optional.of(marketFlowIndicator);
        }
        if (!groupInstrument.isDecoded()) {
            return Optional.of(groupInstrument);
        }
        if (!instrument.isDecoded()) {
            return Optional.of(instrument);
        }
        if (!instrumentExternalCode.isDecoded()) {
            return Optional.of(instrumentExternalCode);
        }
        if (!strategyAllowImplied.isDecoded()) {
            return Optional.of(strategyAllowImplied);
        }
        if (!strategyCode.isDecoded()) {
            return Optional.of(strategyCode);
        }
        if (!numberOfLegs.isDecoded()) {
            return Optional.of(numberOfLegs);
        }
        if (!strategyInstrumentLeg.isDecoded()) {
            return Optional.of(strategyInstrumentLeg.failedEntry().flatMap(StrategyInstrumentLegEntry::failedAt).orElse(numberOfLegs));
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
            case "StrategySymbol" -> Optional.of(strategySymbol);
            case "ExpiryYear" -> Optional.of(expiryYear);
            case "ExpiryMonthStrategy" -> Optional.of(expiryMonthStrategy);
            case "ExpiryDay" -> Optional.of(expiryDay);
            case "MaximumNumberOfContractsPerOrder" -> Optional.of(maximumNumberOfContractsPerOrder);
            case "MinimumNumberOfContractsPerOrder" -> Optional.of(minimumNumberOfContractsPerOrder);
            case "MarketFlowIndicator" -> Optional.of(marketFlowIndicator);
            case "GroupInstrument" -> Optional.of(groupInstrument);
            case "Instrument" -> Optional.of(instrument);
            case "InstrumentExternalCode" -> Optional.of(instrumentExternalCode);
            case "StrategyAllowImplied" -> Optional.of(strategyAllowImplied);
            case "StrategyCode" -> Optional.of(strategyCode);
            case "NumberOfLegs" -> Optional.of(numberOfLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StrategyInstrumentKeysMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(maximumThresholdPriceFractionPair.diffFields(message.maximumThresholdPriceFractionPair));
        changed.addAll(minimumThresholdPriceFractionPair.diffFields(message.minimumThresholdPriceFractionPair));
        changed.addAll(tickIncrement.diffFields(message.tickIncrement));
        changed.addAll(strategyInstrumentLeg.diffFields(message.strategyInstrumentLeg));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            maximumThresholdPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            minimumThresholdPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            tickIncrement.toFormattedString(builder, options);
            builder.append(", ");
            strategyInstrumentLeg.toFormattedString(builder, options);
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
        maximumThresholdPriceFractionPair.toFormattedString(builder, nested);
        minimumThresholdPriceFractionPair.toFormattedString(builder, nested);
        tickIncrement.toFormattedString(builder, nested);
        strategyInstrumentLeg.toFormattedString(builder, nested);
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
        if (!(other instanceof StrategyInstrumentKeysMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && maximumThresholdPriceFractionPair.equals(message.maximumThresholdPriceFractionPair) && minimumThresholdPriceFractionPair.equals(message.minimumThresholdPriceFractionPair) && tickIncrement.equals(message.tickIncrement) && strategyInstrumentLeg.equals(message.strategyInstrumentLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, maximumThresholdPriceFractionPair, minimumThresholdPriceFractionPair, tickIncrement, strategyInstrumentLeg);
    }
}
