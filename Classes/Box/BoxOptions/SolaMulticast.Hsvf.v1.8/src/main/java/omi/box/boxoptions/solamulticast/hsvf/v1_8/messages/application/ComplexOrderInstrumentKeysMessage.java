package omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ComplexOrderInstrumentAllowImpliedField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ComplexOrderInstrumentSymbolField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.DeliveryMonthField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ExchangeIdField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ExpiryDayField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ExpiryYearField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.GroupField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.InstrumentExternalCodeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.InstrumentField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.MaxNumberOfContractsPerOrderField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.MaxThresholdPriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.MaxThresholdPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.MaxThresholdPriceSignField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.MinNumberOfContractsPerOrderField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.MinThresholdPriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.MinThresholdPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.MinThresholdPriceSignField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.NumberOfLegsField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.TickIncrementField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.TickIncrementFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.groups.InstrumentLegEntry;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.groups.InstrumentLegList;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Field;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Message;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.PrintOptions;

/**
 * Represents the ComplexOrderInstrumentKeysMessage message from the SolaMulticast protocol.
 *
 * <p>Complex Order Instrument Keys</p>
 */
public final class ComplexOrderInstrumentKeysMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 112;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Order Instrument Keys Message";

    /**
     * Q by default
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Complex Order Instrument symbol. The individual legs are defined in message type JS.
     */
    private final ComplexOrderInstrumentSymbolField complexOrderInstrumentSymbol = new ComplexOrderInstrumentSymbolField();

    /**
     * Expiration year of the leg of the Complex Order Instrument expiring first. Format is YY.
     */
    private final ExpiryYearField expiryYear = new ExpiryYearField();

    /**
     * Delivery month code of the leg of the Complex Order Instrument expiring first
     */
    private final DeliveryMonthField deliveryMonth = new DeliveryMonthField();

    /**
     * Expiry day of the leg of the Complex Order Instrument expiring first
     */
    private final ExpiryDayField expiryDay = new ExpiryDayField();

    /**
     * Maximum authorized number of contract per order
     */
    private final MaxNumberOfContractsPerOrderField maxNumberOfContractsPerOrder = new MaxNumberOfContractsPerOrderField();

    /**
     * Minimum authorized number of contract per order
     */
    private final MinNumberOfContractsPerOrderField minNumberOfContractsPerOrder = new MinNumberOfContractsPerOrderField();

    /**
     * + or - sign
     */
    private final MaxThresholdPriceSignField maxThresholdPriceSign = new MaxThresholdPriceSignField();

    /**
     * Maximum threshold price authorized for an option contract
     */
    private final MaxThresholdPriceField maxThresholdPrice = new MaxThresholdPriceField();

    /**
     * Number of decimal places or fraction positions
     */
    private final MaxThresholdPriceFractionIndicatorField maxThresholdPriceFractionIndicator = new MaxThresholdPriceFractionIndicatorField();

    /**
     * + or - sign
     */
    private final MinThresholdPriceSignField minThresholdPriceSign = new MinThresholdPriceSignField();

    /**
     * Minimum threshold price authorized for an option contract
     */
    private final MinThresholdPriceField minThresholdPrice = new MinThresholdPriceField();

    /**
     * Number of decimal places or fraction positions
     */
    private final MinThresholdPriceFractionIndicatorField minThresholdPriceFractionIndicator = new MinThresholdPriceFractionIndicatorField();

    /**
     * Precision with which the price of an order limit can be expressed
     */
    private final TickIncrementField tickIncrement = new TickIncrementField();

    /**
     * Defines number of decimal places or fraction positions
     */
    private final TickIncrementFractionIndicatorField tickIncrementFractionIndicator = new TickIncrementFractionIndicatorField();

    /**
     * Group of the instrument
     */
    private final GroupField group = new GroupField();

    /**
     * Instrument
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * External identifier used by traders when entering an order
     */
    private final InstrumentExternalCodeField instrumentExternalCode = new InstrumentExternalCodeField();

    /**
     * Complex Order Instrument support of Implied Price
     */
    private final ComplexOrderInstrumentAllowImpliedField complexOrderInstrumentAllowImplied = new ComplexOrderInstrumentAllowImpliedField();

    /**
     * Number of legs in the Complex Order Instrument
     */
    private final NumberOfLegsField numberOfLegs = new NumberOfLegsField();

    /**
     * Instrument Leg Repeating Group
     */
    private final InstrumentLegList instrumentLeg = new InstrumentLegList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, complexOrderInstrumentSymbol, expiryYear, deliveryMonth, expiryDay, maxNumberOfContractsPerOrder, minNumberOfContractsPerOrder, maxThresholdPriceSign, maxThresholdPrice, maxThresholdPriceFractionIndicator, minThresholdPriceSign, minThresholdPrice, minThresholdPriceFractionIndicator, tickIncrement, tickIncrementFractionIndicator, group, instrument, instrumentExternalCode, complexOrderInstrumentAllowImplied, numberOfLegs);

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
     * Complex Order Instrument symbol. The individual legs are defined in message type JS.
     *
     * @return the ComplexOrderInstrumentSymbol field
     */
    public ComplexOrderInstrumentSymbolField complexOrderInstrumentSymbol() {
        return complexOrderInstrumentSymbol;
    }

    /**
     * Expiration year of the leg of the Complex Order Instrument expiring first. Format is YY.
     *
     * @return the ExpiryYear field
     */
    public ExpiryYearField expiryYear() {
        return expiryYear;
    }

    /**
     * Delivery month code of the leg of the Complex Order Instrument expiring first
     *
     * @return the DeliveryMonth field
     */
    public DeliveryMonthField deliveryMonth() {
        return deliveryMonth;
    }

    /**
     * Expiry day of the leg of the Complex Order Instrument expiring first
     *
     * @return the ExpiryDay field
     */
    public ExpiryDayField expiryDay() {
        return expiryDay;
    }

    /**
     * Maximum authorized number of contract per order
     *
     * @return the MaxNumberOfContractsPerOrder field
     */
    public MaxNumberOfContractsPerOrderField maxNumberOfContractsPerOrder() {
        return maxNumberOfContractsPerOrder;
    }

    /**
     * Minimum authorized number of contract per order
     *
     * @return the MinNumberOfContractsPerOrder field
     */
    public MinNumberOfContractsPerOrderField minNumberOfContractsPerOrder() {
        return minNumberOfContractsPerOrder;
    }

    /**
     * + or - sign
     *
     * @return the MaxThresholdPriceSign field
     */
    public MaxThresholdPriceSignField maxThresholdPriceSign() {
        return maxThresholdPriceSign;
    }

    /**
     * Maximum threshold price authorized for an option contract
     *
     * @return the MaxThresholdPrice field
     */
    public MaxThresholdPriceField maxThresholdPrice() {
        return maxThresholdPrice;
    }

    /**
     * Number of decimal places or fraction positions
     *
     * @return the MaxThresholdPriceFractionIndicator field
     */
    public MaxThresholdPriceFractionIndicatorField maxThresholdPriceFractionIndicator() {
        return maxThresholdPriceFractionIndicator;
    }

    /**
     * + or - sign
     *
     * @return the MinThresholdPriceSign field
     */
    public MinThresholdPriceSignField minThresholdPriceSign() {
        return minThresholdPriceSign;
    }

    /**
     * Minimum threshold price authorized for an option contract
     *
     * @return the MinThresholdPrice field
     */
    public MinThresholdPriceField minThresholdPrice() {
        return minThresholdPrice;
    }

    /**
     * Number of decimal places or fraction positions
     *
     * @return the MinThresholdPriceFractionIndicator field
     */
    public MinThresholdPriceFractionIndicatorField minThresholdPriceFractionIndicator() {
        return minThresholdPriceFractionIndicator;
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
     * Group of the instrument
     *
     * @return the Group field
     */
    public GroupField group() {
        return group;
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
     * Complex Order Instrument support of Implied Price
     *
     * @return the ComplexOrderInstrumentAllowImplied field
     */
    public ComplexOrderInstrumentAllowImpliedField complexOrderInstrumentAllowImplied() {
        return complexOrderInstrumentAllowImplied;
    }

    /**
     * Number of legs in the Complex Order Instrument
     *
     * @return the NumberOfLegs field
     */
    public NumberOfLegsField numberOfLegs() {
        return numberOfLegs;
    }

    /**
     * Instrument Leg Repeating Group
     *
     * <p>Encode writes this list's size to the NumberOfLegs field.</p>
     *
     * @return the InstrumentLeg entries
     */
    public InstrumentLegList instrumentLeg() {
        return instrumentLeg;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + instrumentLeg.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 1;
        cursor += 30;
        cursor += 2;
        cursor += 1;
        cursor += 2;
        cursor += 6;
        cursor += 6;
        cursor += 1;
        cursor += 6;
        cursor += 1;
        cursor += 1;
        cursor += 6;
        cursor += 1;
        cursor += 6;
        cursor += 1;
        runs.add(cursor).add(2);
        cursor += 2;
        cursor += 2;
        cursor += 4;
        cursor += 30;
        cursor += 1;
        cursor += 2;
        cursor += instrumentLeg.byteLength();
        return cursor;
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!complexOrderInstrumentSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexOrderInstrumentSymbolField.BYTE_LENGTH;
        if (!expiryYear.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryYearField.BYTE_LENGTH;
        if (!deliveryMonth.parse(data, cursor)) {
            return false;
        }
        cursor += DeliveryMonthField.BYTE_LENGTH;
        if (!expiryDay.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDayField.BYTE_LENGTH;
        if (!maxNumberOfContractsPerOrder.parse(data, cursor)) {
            return false;
        }
        cursor += MaxNumberOfContractsPerOrderField.BYTE_LENGTH;
        if (!minNumberOfContractsPerOrder.parse(data, cursor)) {
            return false;
        }
        cursor += MinNumberOfContractsPerOrderField.BYTE_LENGTH;
        if (!maxThresholdPriceSign.parse(data, cursor)) {
            return false;
        }
        cursor += MaxThresholdPriceSignField.BYTE_LENGTH;
        if (!maxThresholdPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MaxThresholdPriceField.BYTE_LENGTH;
        if (!maxThresholdPriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MaxThresholdPriceFractionIndicatorField.BYTE_LENGTH;
        if (!minThresholdPriceSign.parse(data, cursor)) {
            return false;
        }
        cursor += MinThresholdPriceSignField.BYTE_LENGTH;
        if (!minThresholdPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MinThresholdPriceField.BYTE_LENGTH;
        if (!minThresholdPriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MinThresholdPriceFractionIndicatorField.BYTE_LENGTH;
        if (!tickIncrement.parse(data, cursor)) {
            return false;
        }
        cursor += TickIncrementField.BYTE_LENGTH;
        if (!tickIncrementFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TickIncrementFractionIndicatorField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!group.parse(data, cursor)) {
            return false;
        }
        cursor += GroupField.BYTE_LENGTH;
        if (!instrument.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentField.BYTE_LENGTH;
        if (!instrumentExternalCode.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentExternalCodeField.BYTE_LENGTH;
        if (!complexOrderInstrumentAllowImplied.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexOrderInstrumentAllowImpliedField.BYTE_LENGTH;
        if (!numberOfLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfLegsField.BYTE_LENGTH;
        if (numberOfLegs.value() == null) {
            return false;
        }
        if (!instrumentLeg.parse(data, cursor, end, numberOfLegs.value())) {
            return false;
        }
        cursor += instrumentLeg.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (instrumentLeg.size() > 99) {
            throw new IllegalStateException("instrumentLeg holds " + instrumentLeg.size() + " entries, more than its count field can state");
        }
        numberOfLegs.value((long) instrumentLeg.size());
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = complexOrderInstrumentSymbol.encode(data, cursor);
        cursor = expiryYear.encode(data, cursor);
        cursor = deliveryMonth.encode(data, cursor);
        cursor = expiryDay.encode(data, cursor);
        cursor = maxNumberOfContractsPerOrder.encode(data, cursor);
        cursor = minNumberOfContractsPerOrder.encode(data, cursor);
        cursor = maxThresholdPriceSign.encode(data, cursor);
        cursor = maxThresholdPrice.encode(data, cursor);
        cursor = maxThresholdPriceFractionIndicator.encode(data, cursor);
        cursor = minThresholdPriceSign.encode(data, cursor);
        cursor = minThresholdPrice.encode(data, cursor);
        cursor = minThresholdPriceFractionIndicator.encode(data, cursor);
        cursor = tickIncrement.encode(data, cursor);
        cursor = tickIncrementFractionIndicator.encode(data, cursor);
        if (buffer != null && buffer.length >= 73) {
            System.arraycopy(buffer, 71, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = group.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = instrumentExternalCode.encode(data, cursor);
        cursor = complexOrderInstrumentAllowImplied.encode(data, cursor);
        cursor = numberOfLegs.encode(data, cursor);
        cursor = instrumentLeg.encode(data, cursor);
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
        instrumentLeg.clear();
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
        return instrumentLeg.isRecognized();
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
        if (!instrumentLeg.isValid()) {
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
        if (!exchangeId.isDecoded()) {
            return Optional.of(exchangeId);
        }
        if (!complexOrderInstrumentSymbol.isDecoded()) {
            return Optional.of(complexOrderInstrumentSymbol);
        }
        if (!expiryYear.isDecoded()) {
            return Optional.of(expiryYear);
        }
        if (!deliveryMonth.isDecoded()) {
            return Optional.of(deliveryMonth);
        }
        if (!expiryDay.isDecoded()) {
            return Optional.of(expiryDay);
        }
        if (!maxNumberOfContractsPerOrder.isDecoded()) {
            return Optional.of(maxNumberOfContractsPerOrder);
        }
        if (!minNumberOfContractsPerOrder.isDecoded()) {
            return Optional.of(minNumberOfContractsPerOrder);
        }
        if (!maxThresholdPriceSign.isDecoded()) {
            return Optional.of(maxThresholdPriceSign);
        }
        if (!maxThresholdPrice.isDecoded()) {
            return Optional.of(maxThresholdPrice);
        }
        if (!maxThresholdPriceFractionIndicator.isDecoded()) {
            return Optional.of(maxThresholdPriceFractionIndicator);
        }
        if (!minThresholdPriceSign.isDecoded()) {
            return Optional.of(minThresholdPriceSign);
        }
        if (!minThresholdPrice.isDecoded()) {
            return Optional.of(minThresholdPrice);
        }
        if (!minThresholdPriceFractionIndicator.isDecoded()) {
            return Optional.of(minThresholdPriceFractionIndicator);
        }
        if (!tickIncrement.isDecoded()) {
            return Optional.of(tickIncrement);
        }
        if (!tickIncrementFractionIndicator.isDecoded()) {
            return Optional.of(tickIncrementFractionIndicator);
        }
        if (!group.isDecoded()) {
            return Optional.of(group);
        }
        if (!instrument.isDecoded()) {
            return Optional.of(instrument);
        }
        if (!instrumentExternalCode.isDecoded()) {
            return Optional.of(instrumentExternalCode);
        }
        if (!complexOrderInstrumentAllowImplied.isDecoded()) {
            return Optional.of(complexOrderInstrumentAllowImplied);
        }
        if (!numberOfLegs.isDecoded()) {
            return Optional.of(numberOfLegs);
        }
        if (!instrumentLeg.isDecoded()) {
            return Optional.of(instrumentLeg.failedEntry().flatMap(InstrumentLegEntry::failedAt).orElse(numberOfLegs));
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
            case "ComplexOrderInstrumentSymbol" -> Optional.of(complexOrderInstrumentSymbol);
            case "ExpiryYear" -> Optional.of(expiryYear);
            case "DeliveryMonth" -> Optional.of(deliveryMonth);
            case "ExpiryDay" -> Optional.of(expiryDay);
            case "MaxNumberOfContractsPerOrder" -> Optional.of(maxNumberOfContractsPerOrder);
            case "MinNumberOfContractsPerOrder" -> Optional.of(minNumberOfContractsPerOrder);
            case "MaxThresholdPriceSign" -> Optional.of(maxThresholdPriceSign);
            case "MaxThresholdPrice" -> Optional.of(maxThresholdPrice);
            case "MaxThresholdPriceFractionIndicator" -> Optional.of(maxThresholdPriceFractionIndicator);
            case "MinThresholdPriceSign" -> Optional.of(minThresholdPriceSign);
            case "MinThresholdPrice" -> Optional.of(minThresholdPrice);
            case "MinThresholdPriceFractionIndicator" -> Optional.of(minThresholdPriceFractionIndicator);
            case "TickIncrement" -> Optional.of(tickIncrement);
            case "TickIncrementFractionIndicator" -> Optional.of(tickIncrementFractionIndicator);
            case "Group" -> Optional.of(group);
            case "Instrument" -> Optional.of(instrument);
            case "InstrumentExternalCode" -> Optional.of(instrumentExternalCode);
            case "ComplexOrderInstrumentAllowImplied" -> Optional.of(complexOrderInstrumentAllowImplied);
            case "NumberOfLegs" -> Optional.of(numberOfLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexOrderInstrumentKeysMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(instrumentLeg.diffFields(message.instrumentLeg));
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
            instrumentLeg.toFormattedString(builder, options);
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
        instrumentLeg.toFormattedString(builder, nested);
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
        if (!(other instanceof ComplexOrderInstrumentKeysMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && instrumentLeg.equals(message.instrumentLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, instrumentLeg);
    }
}
