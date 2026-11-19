package omi.cboe.c1options.flex.spin.v1_1_30.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.BitFieldsField;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.CallPutIndicatorField;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.CreationDayField;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.DayField;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.DecimalStrikeField;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.DollarStrikeField;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.ExerciseStyleField;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.FeedSymbolField;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.MonthField;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.ObservationDayField;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.OsiRootField;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.PercentageField;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.ReturnCapPercentageField;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.SettlementTypeField;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.SymbolConditionField;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.TimeOffsetField;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.UnderlyingField;
import omi.cboe.c1options.flex.spin.v1_1_30.fields.YearField;
import omi.cboe.c1options.flex.spin.v1_1_30.types.Field;
import omi.cboe.c1options.flex.spin.v1_1_30.types.Message;
import omi.cboe.c1options.flex.spin.v1_1_30.types.PrintOptions;

/**
 * Represents the FlexInstrumentDefinitionMessage message from the Flex protocol.
 *
 * <p>A FLEX Instrument Definition message represents an instrument that is available to place orders.</p>
 */
public final class FlexInstrumentDefinitionMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 55;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Flex Instrument Definition Message";

    /**
     * Nanosecond offset from last unit timestamp.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Symbol right padded with spaces.
     */
    private final FeedSymbolField feedSymbol = new FeedSymbolField();

    /**
     * OSI Root right padded with spaces.
     */
    private final OsiRootField osiRoot = new OsiRootField();

    /**
     * Two digit year
     */
    private final YearField year = new YearField();

    /**
     * Two digit month
     */
    private final MonthField month = new MonthField();

    /**
     * Two digit day
     */
    private final DayField day = new DayField();

    /**
     * Call/Put indicator
     */
    private final CallPutIndicatorField callPutIndicator = new CallPutIndicatorField();

    /**
     * Dollar strike (if not percentage) left padded with zero. If percentage, field is space padded.
     */
    private final DollarStrikeField dollarStrike = new DollarStrikeField();

    /**
     * Decimal strike (if not percentage) left padded with zero. If percentage, field is space padded.
     */
    private final DecimalStrikeField decimalStrike = new DecimalStrikeField();

    /**
     * Symbol condition indicator
     */
    private final SymbolConditionField symbolCondition = new SymbolConditionField();

    /**
     * Symbol of underlying equity right padded with spaces. All spaces if not available or not applicable.
     */
    private final UnderlyingField underlying = new UnderlyingField();

    /**
     * Exercise style indicator
     */
    private final ExerciseStyleField exerciseStyle = new ExerciseStyleField();

    /**
     * Settlement type indicator
     */
    private final SettlementTypeField settlementType = new SettlementTypeField();

    /**
     * Percentage when strike and price is percentage based (implied 4 decimal places). Otherwise zero.
     */
    private final PercentageField percentage = new PercentageField();

    /**
     * Two digit observation day of month. Valid only for Asian and Cliquet options, otherwise space padded.
     */
    private final ObservationDayField observationDay = new ObservationDayField();

    /**
     * Return cap percentage (implied 2 decimal places). Valid only for Cliquet, otherwise zero.
     */
    private final ReturnCapPercentageField returnCapPercentage = new ReturnCapPercentageField();

    /**
     * Two digit creation day of the month. Valid only for Cliquet, otherwise space padded.
     */
    private final CreationDayField creationDay = new CreationDayField();

    /**
     * Bit Fields
     */
    private final BitFieldsField bitFields = new BitFieldsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, feedSymbol, osiRoot, year, month, day, callPutIndicator, dollarStrike, decimalStrike, symbolCondition, underlying, exerciseStyle, settlementType, percentage, observationDay, returnCapPercentage, creationDay, bitFields);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp.
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Symbol right padded with spaces.
     *
     * @return the FeedSymbol field
     */
    public FeedSymbolField feedSymbol() {
        return feedSymbol;
    }

    /**
     * OSI Root right padded with spaces.
     *
     * @return the OsiRoot field
     */
    public OsiRootField osiRoot() {
        return osiRoot;
    }

    /**
     * Two digit year
     *
     * @return the Year field
     */
    public YearField year() {
        return year;
    }

    /**
     * Two digit month
     *
     * @return the Month field
     */
    public MonthField month() {
        return month;
    }

    /**
     * Two digit day
     *
     * @return the Day field
     */
    public DayField day() {
        return day;
    }

    /**
     * Call/Put indicator
     *
     * @return the CallPutIndicator field
     */
    public CallPutIndicatorField callPutIndicator() {
        return callPutIndicator;
    }

    /**
     * Dollar strike (if not percentage) left padded with zero. If percentage, field is space padded.
     *
     * @return the DollarStrike field
     */
    public DollarStrikeField dollarStrike() {
        return dollarStrike;
    }

    /**
     * Decimal strike (if not percentage) left padded with zero. If percentage, field is space padded.
     *
     * @return the DecimalStrike field
     */
    public DecimalStrikeField decimalStrike() {
        return decimalStrike;
    }

    /**
     * Symbol condition indicator
     *
     * @return the SymbolCondition field
     */
    public SymbolConditionField symbolCondition() {
        return symbolCondition;
    }

    /**
     * Symbol of underlying equity right padded with spaces. All spaces if not available or not applicable.
     *
     * @return the Underlying field
     */
    public UnderlyingField underlying() {
        return underlying;
    }

    /**
     * Exercise style indicator
     *
     * @return the ExerciseStyle field
     */
    public ExerciseStyleField exerciseStyle() {
        return exerciseStyle;
    }

    /**
     * Settlement type indicator
     *
     * @return the SettlementType field
     */
    public SettlementTypeField settlementType() {
        return settlementType;
    }

    /**
     * Percentage when strike and price is percentage based (implied 4 decimal places). Otherwise zero.
     *
     * @return the Percentage field
     */
    public PercentageField percentage() {
        return percentage;
    }

    /**
     * Two digit observation day of month. Valid only for Asian and Cliquet options, otherwise space padded.
     *
     * @return the ObservationDay field
     */
    public ObservationDayField observationDay() {
        return observationDay;
    }

    /**
     * Return cap percentage (implied 2 decimal places). Valid only for Cliquet, otherwise zero.
     *
     * @return the ReturnCapPercentage field
     */
    public ReturnCapPercentageField returnCapPercentage() {
        return returnCapPercentage;
    }

    /**
     * Two digit creation day of the month. Valid only for Cliquet, otherwise space padded.
     *
     * @return the CreationDay field
     */
    public CreationDayField creationDay() {
        return creationDay;
    }

    /**
     * Bit Fields
     *
     * @return the BitFields field
     */
    public BitFieldsField bitFields() {
        return bitFields;
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
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        if (!feedSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += FeedSymbolField.BYTE_LENGTH;
        if (!osiRoot.parse(data, cursor)) {
            return false;
        }
        cursor += OsiRootField.BYTE_LENGTH;
        if (!year.parse(data, cursor)) {
            return false;
        }
        cursor += YearField.BYTE_LENGTH;
        if (!month.parse(data, cursor)) {
            return false;
        }
        cursor += MonthField.BYTE_LENGTH;
        if (!day.parse(data, cursor)) {
            return false;
        }
        cursor += DayField.BYTE_LENGTH;
        if (!callPutIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CallPutIndicatorField.BYTE_LENGTH;
        if (!dollarStrike.parse(data, cursor)) {
            return false;
        }
        cursor += DollarStrikeField.BYTE_LENGTH;
        if (!decimalStrike.parse(data, cursor)) {
            return false;
        }
        cursor += DecimalStrikeField.BYTE_LENGTH;
        if (!symbolCondition.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolConditionField.BYTE_LENGTH;
        if (!underlying.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingField.BYTE_LENGTH;
        if (!exerciseStyle.parse(data, cursor)) {
            return false;
        }
        cursor += ExerciseStyleField.BYTE_LENGTH;
        if (!settlementType.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementTypeField.BYTE_LENGTH;
        if (!percentage.parse(data, cursor)) {
            return false;
        }
        cursor += PercentageField.BYTE_LENGTH;
        if (!observationDay.parse(data, cursor)) {
            return false;
        }
        cursor += ObservationDayField.BYTE_LENGTH;
        if (!returnCapPercentage.parse(data, cursor)) {
            return false;
        }
        cursor += ReturnCapPercentageField.BYTE_LENGTH;
        if (!creationDay.parse(data, cursor)) {
            return false;
        }
        cursor += CreationDayField.BYTE_LENGTH;
        return bitFields.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = feedSymbol.encode(data, cursor);
        cursor = osiRoot.encode(data, cursor);
        cursor = year.encode(data, cursor);
        cursor = month.encode(data, cursor);
        cursor = day.encode(data, cursor);
        cursor = callPutIndicator.encode(data, cursor);
        cursor = dollarStrike.encode(data, cursor);
        cursor = decimalStrike.encode(data, cursor);
        cursor = symbolCondition.encode(data, cursor);
        cursor = underlying.encode(data, cursor);
        cursor = exerciseStyle.encode(data, cursor);
        cursor = settlementType.encode(data, cursor);
        cursor = percentage.encode(data, cursor);
        cursor = observationDay.encode(data, cursor);
        cursor = returnCapPercentage.encode(data, cursor);
        cursor = creationDay.encode(data, cursor);
        cursor = bitFields.encode(data, cursor);
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
            case "TimeOffset" -> Optional.of(timeOffset);
            case "FeedSymbol" -> Optional.of(feedSymbol);
            case "OsiRoot" -> Optional.of(osiRoot);
            case "Year" -> Optional.of(year);
            case "Month" -> Optional.of(month);
            case "Day" -> Optional.of(day);
            case "CallPutIndicator" -> Optional.of(callPutIndicator);
            case "DollarStrike" -> Optional.of(dollarStrike);
            case "DecimalStrike" -> Optional.of(decimalStrike);
            case "SymbolCondition" -> Optional.of(symbolCondition);
            case "Underlying" -> Optional.of(underlying);
            case "ExerciseStyle" -> Optional.of(exerciseStyle);
            case "SettlementType" -> Optional.of(settlementType);
            case "Percentage" -> Optional.of(percentage);
            case "ObservationDay" -> Optional.of(observationDay);
            case "ReturnCapPercentage" -> Optional.of(returnCapPercentage);
            case "CreationDay" -> Optional.of(creationDay);
            case "BitFields" -> Optional.of(bitFields);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FlexInstrumentDefinitionMessage message)) {
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
        if (!(other instanceof FlexInstrumentDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
