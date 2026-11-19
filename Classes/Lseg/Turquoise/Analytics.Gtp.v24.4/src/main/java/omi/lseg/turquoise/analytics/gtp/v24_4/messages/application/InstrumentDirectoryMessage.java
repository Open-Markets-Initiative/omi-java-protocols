package omi.lseg.turquoise.analytics.gtp.v24_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.AllowedBookTypesField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.AverageDailyTurnoverAdtField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.CurrencyField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.DynamicCircuitBreakerTolerancesField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.InstrumentField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.IsinField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.PriceBandTolerancesField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.SegmentField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.SourceVenueField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.StaticCircuitBreakerTolerancesField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.TickIdField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.TimestampField;
import omi.lseg.turquoise.analytics.gtp.v24_4.fields.VenueInstrumentIdField;
import omi.lseg.turquoise.analytics.gtp.v24_4.types.Field;
import omi.lseg.turquoise.analytics.gtp.v24_4.types.Message;
import omi.lseg.turquoise.analytics.gtp.v24_4.types.PrintOptions;

/**
 * Represents the InstrumentDirectoryMessage message from the Analytics protocol.
 *
 * <p>Used to disseminate a common and limited set of data for all configured instrument types, except strategy instruments, on the real-time channels</p>
 */
public final class InstrumentDirectoryMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 138;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Instrument Directory Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 74, 12, 86, 11, 100, 1, 101, 4, 113, 8, 121, 1, 122, 8, 130, 8 };

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * GTP Instrument identifier.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * ISIN Code of an instrument.
     */
    private final IsinField isin = new IsinField();

    /**
     * Allowed Book Types Flags
     */
    private final AllowedBookTypesField allowedBookTypes = new AllowedBookTypesField();

    /**
     * Venue from which market data is received for the instrument
     */
    private final SourceVenueField sourceVenue = new SourceVenueField();

    /**
     * MTF symbol used by the source venue. It will contain the suffixes as specified in the table below:
     */
    private final VenueInstrumentIdField venueInstrumentId = new VenueInstrumentIdField();

    /**
     * The tick structure applicable for the instrument.
     */
    private final TickIdField tickId = new TickIdField();

    /**
     * Price Band Tolerance (%) of the instrument.
     */
    private final PriceBandTolerancesField priceBandTolerances = new PriceBandTolerancesField();

    /**
     * Dynamic Circuit Breaker Tolerance (%) of the instrument.
     */
    private final DynamicCircuitBreakerTolerancesField dynamicCircuitBreakerTolerances = new DynamicCircuitBreakerTolerancesField();

    /**
     * Static Circuit Breaker Tolerance (%) of the instrument.
     */
    private final StaticCircuitBreakerTolerancesField staticCircuitBreakerTolerances = new StaticCircuitBreakerTolerancesField();

    /**
     * Segment the instrument is assigned to.
     */
    private final SegmentField segment = new SegmentField();

    /**
     * Currency Code as per ISO 4217.
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Not Applicable to Turquoise.
     */
    private final AverageDailyTurnoverAdtField averageDailyTurnoverAdt = new AverageDailyTurnoverAdtField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrument, isin, allowedBookTypes, sourceVenue, venueInstrumentId, tickId, priceBandTolerances, dynamicCircuitBreakerTolerances, staticCircuitBreakerTolerances, segment, currency, averageDailyTurnoverAdt);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time the message was generated.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * GTP Instrument identifier.
     *
     * @return the Instrument field
     */
    public InstrumentField instrument() {
        return instrument;
    }

    /**
     * ISIN Code of an instrument.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * Allowed Book Types Flags
     *
     * @return the AllowedBookTypes field
     */
    public AllowedBookTypesField allowedBookTypes() {
        return allowedBookTypes;
    }

    /**
     * Venue from which market data is received for the instrument
     *
     * @return the SourceVenue field
     */
    public SourceVenueField sourceVenue() {
        return sourceVenue;
    }

    /**
     * MTF symbol used by the source venue. It will contain the suffixes as specified in the table below:
     *
     * @return the VenueInstrumentId field
     */
    public VenueInstrumentIdField venueInstrumentId() {
        return venueInstrumentId;
    }

    /**
     * The tick structure applicable for the instrument.
     *
     * @return the TickId field
     */
    public TickIdField tickId() {
        return tickId;
    }

    /**
     * Price Band Tolerance (%) of the instrument.
     *
     * @return the PriceBandTolerances field
     */
    public PriceBandTolerancesField priceBandTolerances() {
        return priceBandTolerances;
    }

    /**
     * Dynamic Circuit Breaker Tolerance (%) of the instrument.
     *
     * @return the DynamicCircuitBreakerTolerances field
     */
    public DynamicCircuitBreakerTolerancesField dynamicCircuitBreakerTolerances() {
        return dynamicCircuitBreakerTolerances;
    }

    /**
     * Static Circuit Breaker Tolerance (%) of the instrument.
     *
     * @return the StaticCircuitBreakerTolerances field
     */
    public StaticCircuitBreakerTolerancesField staticCircuitBreakerTolerances() {
        return staticCircuitBreakerTolerances;
    }

    /**
     * Segment the instrument is assigned to.
     *
     * @return the Segment field
     */
    public SegmentField segment() {
        return segment;
    }

    /**
     * Currency Code as per ISO 4217.
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Not Applicable to Turquoise.
     *
     * @return the AverageDailyTurnoverAdt field
     */
    public AverageDailyTurnoverAdtField averageDailyTurnoverAdt() {
        return averageDailyTurnoverAdt;
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
        return Optional.ofNullable(timestampField.value());
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!instrument.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentField.BYTE_LENGTH;
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
        if (!allowedBookTypes.parse(data, cursor)) {
            return false;
        }
        cursor += AllowedBookTypesField.BYTE_LENGTH;
        if (!sourceVenue.parse(data, cursor)) {
            return false;
        }
        cursor += SourceVenueField.BYTE_LENGTH;
        if (!venueInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += VenueInstrumentIdField.BYTE_LENGTH;
        if (!tickId.parse(data, cursor)) {
            return false;
        }
        cursor += TickIdField.BYTE_LENGTH;
        if (!priceBandTolerances.parse(data, cursor)) {
            return false;
        }
        cursor += PriceBandTolerancesField.BYTE_LENGTH;
        if (!dynamicCircuitBreakerTolerances.parse(data, cursor)) {
            return false;
        }
        cursor += DynamicCircuitBreakerTolerancesField.BYTE_LENGTH;
        if (!staticCircuitBreakerTolerances.parse(data, cursor)) {
            return false;
        }
        cursor += StaticCircuitBreakerTolerancesField.BYTE_LENGTH;
        if (!segment.parse(data, cursor)) {
            return false;
        }
        cursor += SegmentField.BYTE_LENGTH;
        cursor += 23; // padding
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        cursor += 5; // padding
        if (!averageDailyTurnoverAdt.parse(data, cursor)) {
            return false;
        }
        cursor += AverageDailyTurnoverAdtField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = isin.encode(data, cursor);
        cursor = allowedBookTypes.encode(data, cursor);
        cursor = sourceVenue.encode(data, cursor);
        cursor = venueInstrumentId.encode(data, cursor);
        cursor = tickId.encode(data, cursor);
        cursor = priceBandTolerances.encode(data, cursor);
        cursor = dynamicCircuitBreakerTolerances.encode(data, cursor);
        cursor = staticCircuitBreakerTolerances.encode(data, cursor);
        cursor = segment.encode(data, cursor);
        if (buffer != null && buffer.length >= 97) {
            System.arraycopy(buffer, 74, data, cursor, 23); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 23, (byte) 0); // padding
        }
        cursor += 23;
        cursor = currency.encode(data, cursor);
        if (buffer != null && buffer.length >= 105) {
            System.arraycopy(buffer, 100, data, cursor, 5); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 5, (byte) 0); // padding
        }
        cursor += 5;
        cursor = averageDailyTurnoverAdt.encode(data, cursor);
        if (buffer != null && buffer.length >= 138) {
            System.arraycopy(buffer, 113, data, cursor, 25); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 25, (byte) 0); // padding
        }
        cursor += 25;
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
            case "Timestamp" -> Optional.of(timestampField);
            case "Instrument" -> Optional.of(instrument);
            case "Isin" -> Optional.of(isin);
            case "AllowedBookTypes" -> Optional.of(allowedBookTypes);
            case "SourceVenue" -> Optional.of(sourceVenue);
            case "VenueInstrumentId" -> Optional.of(venueInstrumentId);
            case "TickId" -> Optional.of(tickId);
            case "PriceBandTolerances" -> Optional.of(priceBandTolerances);
            case "DynamicCircuitBreakerTolerances" -> Optional.of(dynamicCircuitBreakerTolerances);
            case "StaticCircuitBreakerTolerances" -> Optional.of(staticCircuitBreakerTolerances);
            case "Segment" -> Optional.of(segment);
            case "Currency" -> Optional.of(currency);
            case "AverageDailyTurnoverAdt" -> Optional.of(averageDailyTurnoverAdt);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof InstrumentDirectoryMessage message)) {
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
        if (!(other instanceof InstrumentDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
