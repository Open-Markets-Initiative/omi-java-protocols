package omi.gpw.wse.streambbo.wats.v1_7_6_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.CorrectionCoefficientField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.CurrencyField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.DateValidityField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.DaysSinceLastPublicationField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.IndexBaseCapitalisationField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.IndexBaseDateField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.IndexBaseValueField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.IndexPublicationScheduleField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.IndexTypeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.InstrumentIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.NumOfComponentsField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.NumberOfDividendsField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.PresenceFlagsIndexParamsPresenceFlagsField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.PublicationOrderField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.structs.IndexUnderlyings;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.Message;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.PrintOptions;

/**
 * Represents the IndexParams message from the StreamBbo protocol.
 *
 * <p>The metadata message for the given index</p>
 */
public final class IndexParams implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 145;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Index Params";

    /**
     * ID of financial instrument
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Index base value
     */
    private final IndexBaseValueField indexBaseValue = new IndexBaseValueField();

    /**
     * Index base capitalisation
     */
    private final IndexBaseCapitalisationField indexBaseCapitalisation = new IndexBaseCapitalisationField();

    /**
     * Index base date
     */
    private final IndexBaseDateField indexBaseDate = new IndexBaseDateField();

    /**
     * Index adjustment coefficient K(t)
     */
    private final CorrectionCoefficientField correctionCoefficient = new CorrectionCoefficientField();

    /**
     * Total number of instruments in the portfolio
     */
    private final NumOfComponentsField numOfComponents = new NumOfComponentsField();

    /**
     * Mode of index dissemination
     */
    private final IndexPublicationScheduleField indexPublicationSchedule = new IndexPublicationScheduleField();

    /**
     * Index product classification
     */
    private final IndexTypeField indexType = new IndexTypeField();

    /**
     * Indicates presence of values within IndexParams fields
     */
    private final PresenceFlagsIndexParamsPresenceFlagsField presenceFlagsIndexParamsPresenceFlags = new PresenceFlagsIndexParamsPresenceFlagsField();

    /**
     * Number of calendar days between current session and the previous session day
     */
    private final DaysSinceLastPublicationField daysSinceLastPublication = new DaysSinceLastPublicationField();

    /**
     * Number of dividends included in the index calculation
     */
    private final NumberOfDividendsField numberOfDividends = new NumberOfDividendsField();

    /**
     * Index publication presentation order
     */
    private final PublicationOrderField publicationOrder = new PublicationOrderField();

    /**
     * Trading currency (e.g
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Date of validity of index portfolio
     */
    private final DateValidityField dateValidity = new DateValidityField();

    /**
     * IndexUnderlyings
     */
    private final IndexUnderlyings indexUnderlyings = new IndexUnderlyings();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, indexBaseValue, indexBaseCapitalisation, indexBaseDate, correctionCoefficient, numOfComponents, indexPublicationSchedule, indexType, presenceFlagsIndexParamsPresenceFlags, daysSinceLastPublication, numberOfDividends, publicationOrder, currency, dateValidity);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID of financial instrument
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Index base value
     *
     * @return the IndexBaseValue field
     */
    public IndexBaseValueField indexBaseValue() {
        return indexBaseValue;
    }

    /**
     * Index base capitalisation
     *
     * @return the IndexBaseCapitalisation field
     */
    public IndexBaseCapitalisationField indexBaseCapitalisation() {
        return indexBaseCapitalisation;
    }

    /**
     * Index base date
     *
     * @return the IndexBaseDate field
     */
    public IndexBaseDateField indexBaseDate() {
        return indexBaseDate;
    }

    /**
     * Index adjustment coefficient K(t)
     *
     * @return the CorrectionCoefficient field
     */
    public CorrectionCoefficientField correctionCoefficient() {
        return correctionCoefficient;
    }

    /**
     * Total number of instruments in the portfolio
     *
     * @return the NumOfComponents field
     */
    public NumOfComponentsField numOfComponents() {
        return numOfComponents;
    }

    /**
     * Mode of index dissemination
     *
     * @return the IndexPublicationSchedule field
     */
    public IndexPublicationScheduleField indexPublicationSchedule() {
        return indexPublicationSchedule;
    }

    /**
     * Index product classification
     *
     * @return the IndexType field
     */
    public IndexTypeField indexType() {
        return indexType;
    }

    /**
     * Indicates presence of values within IndexParams fields
     *
     * @return the PresenceFlagsIndexParamsPresenceFlags field
     */
    public PresenceFlagsIndexParamsPresenceFlagsField presenceFlagsIndexParamsPresenceFlags() {
        return presenceFlagsIndexParamsPresenceFlags;
    }

    /**
     * Number of calendar days between current session and the previous session day
     *
     * @return the DaysSinceLastPublication field
     */
    public DaysSinceLastPublicationField daysSinceLastPublication() {
        return daysSinceLastPublication;
    }

    /**
     * Number of dividends included in the index calculation
     *
     * @return the NumberOfDividends field
     */
    public NumberOfDividendsField numberOfDividends() {
        return numberOfDividends;
    }

    /**
     * Index publication presentation order
     *
     * @return the PublicationOrder field
     */
    public PublicationOrderField publicationOrder() {
        return publicationOrder;
    }

    /**
     * Trading currency (e.g
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Date of validity of index portfolio
     *
     * @return the DateValidity field
     */
    public DateValidityField dateValidity() {
        return dateValidity;
    }

    /**
     * IndexUnderlyings
     *
     * @return the IndexUnderlyings record
     */
    public IndexUnderlyings indexUnderlyings() {
        return indexUnderlyings;
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
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!indexBaseValue.parse(data, cursor)) {
            return false;
        }
        cursor += IndexBaseValueField.BYTE_LENGTH;
        if (!indexBaseCapitalisation.parse(data, cursor)) {
            return false;
        }
        cursor += IndexBaseCapitalisationField.BYTE_LENGTH;
        if (!indexBaseDate.parse(data, cursor)) {
            return false;
        }
        cursor += IndexBaseDateField.BYTE_LENGTH;
        if (!correctionCoefficient.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectionCoefficientField.BYTE_LENGTH;
        if (!numOfComponents.parse(data, cursor)) {
            return false;
        }
        cursor += NumOfComponentsField.BYTE_LENGTH;
        if (!indexPublicationSchedule.parse(data, cursor)) {
            return false;
        }
        cursor += IndexPublicationScheduleField.BYTE_LENGTH;
        if (!indexType.parse(data, cursor)) {
            return false;
        }
        cursor += IndexTypeField.BYTE_LENGTH;
        if (!presenceFlagsIndexParamsPresenceFlags.parse(data, cursor)) {
            return false;
        }
        cursor += PresenceFlagsIndexParamsPresenceFlagsField.BYTE_LENGTH;
        if (!daysSinceLastPublication.parse(data, cursor)) {
            return false;
        }
        cursor += DaysSinceLastPublicationField.BYTE_LENGTH;
        if (!numberOfDividends.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfDividendsField.BYTE_LENGTH;
        if (!indexUnderlyings.parseFrom(data, cursor, end - 8)) {
            return false;
        }
        cursor += indexUnderlyings.byteLength();
        if (!publicationOrder.parse(data, cursor)) {
            return false;
        }
        cursor += PublicationOrderField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        return dateValidity.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = indexBaseValue.encode(data, cursor);
        cursor = indexBaseCapitalisation.encode(data, cursor);
        cursor = indexBaseDate.encode(data, cursor);
        cursor = correctionCoefficient.encode(data, cursor);
        cursor = numOfComponents.encode(data, cursor);
        cursor = indexPublicationSchedule.encode(data, cursor);
        cursor = indexType.encode(data, cursor);
        cursor = presenceFlagsIndexParamsPresenceFlags.encode(data, cursor);
        cursor = daysSinceLastPublication.encode(data, cursor);
        cursor = numberOfDividends.encode(data, cursor);
        cursor = indexUnderlyings.encode(data, cursor);
        cursor = publicationOrder.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = dateValidity.encode(data, cursor);
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
        indexUnderlyings.clear();
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
            if (!field.isRecognized()) {
                return false;
            }
        }
        return indexUnderlyings.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!indexUnderlyings.isValid()) {
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
        if (!instrumentId.isDecoded()) {
            return Optional.of(instrumentId);
        }
        if (!indexBaseValue.isDecoded()) {
            return Optional.of(indexBaseValue);
        }
        if (!indexBaseCapitalisation.isDecoded()) {
            return Optional.of(indexBaseCapitalisation);
        }
        if (!indexBaseDate.isDecoded()) {
            return Optional.of(indexBaseDate);
        }
        if (!correctionCoefficient.isDecoded()) {
            return Optional.of(correctionCoefficient);
        }
        if (!numOfComponents.isDecoded()) {
            return Optional.of(numOfComponents);
        }
        if (!indexPublicationSchedule.isDecoded()) {
            return Optional.of(indexPublicationSchedule);
        }
        if (!indexType.isDecoded()) {
            return Optional.of(indexType);
        }
        if (!presenceFlagsIndexParamsPresenceFlags.isDecoded()) {
            return Optional.of(presenceFlagsIndexParamsPresenceFlags);
        }
        if (!daysSinceLastPublication.isDecoded()) {
            return Optional.of(daysSinceLastPublication);
        }
        if (!numberOfDividends.isDecoded()) {
            return Optional.of(numberOfDividends);
        }
        if (!indexUnderlyings.isDecoded()) {
            return indexUnderlyings.failedAt();
        }
        if (!publicationOrder.isDecoded()) {
            return Optional.of(publicationOrder);
        }
        if (!currency.isDecoded()) {
            return Optional.of(currency);
        }
        if (!dateValidity.isDecoded()) {
            return Optional.of(dateValidity);
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "IndexBaseValue" -> Optional.of(indexBaseValue);
            case "IndexBaseCapitalisation" -> Optional.of(indexBaseCapitalisation);
            case "IndexBaseDate" -> Optional.of(indexBaseDate);
            case "CorrectionCoefficient" -> Optional.of(correctionCoefficient);
            case "NumOfComponents" -> Optional.of(numOfComponents);
            case "IndexPublicationSchedule" -> Optional.of(indexPublicationSchedule);
            case "IndexType" -> Optional.of(indexType);
            case "PresenceFlagsIndexParamsPresenceFlags" -> Optional.of(presenceFlagsIndexParamsPresenceFlags);
            case "DaysSinceLastPublication" -> Optional.of(daysSinceLastPublication);
            case "NumberOfDividends" -> Optional.of(numberOfDividends);
            case "PublicationOrder" -> Optional.of(publicationOrder);
            case "Currency" -> Optional.of(currency);
            case "DateValidity" -> Optional.of(dateValidity);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof IndexParams message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(indexUnderlyings.diffFields(message.indexUnderlyings));
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
            indexUnderlyings.toFormattedString(builder, options);
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
        indexUnderlyings.toFormattedString(builder, nested);
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
        if (!(other instanceof IndexParams message)) {
            return false;
        }
        return fields.equals(message.fields) && indexUnderlyings.equals(message.indexUnderlyings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, indexUnderlyings);
    }
}
