package omi.lseg.tradeecho.mifid2posttradereplay.gtp.v24_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.tradeecho.mifid2posttradereplay.gtp.v24_4.fields.InstrumentField;
import omi.lseg.tradeecho.mifid2posttradereplay.gtp.v24_4.fields.NumberOfTradesField;
import omi.lseg.tradeecho.mifid2posttradereplay.gtp.v24_4.fields.NumberOfTradesOnBookOnlyField;
import omi.lseg.tradeecho.mifid2posttradereplay.gtp.v24_4.fields.SourceVenueField;
import omi.lseg.tradeecho.mifid2posttradereplay.gtp.v24_4.fields.TimestampField;
import omi.lseg.tradeecho.mifid2posttradereplay.gtp.v24_4.fields.TurnoverField;
import omi.lseg.tradeecho.mifid2posttradereplay.gtp.v24_4.fields.TurnoverOnBookOnlyField;
import omi.lseg.tradeecho.mifid2posttradereplay.gtp.v24_4.fields.VolumeField;
import omi.lseg.tradeecho.mifid2posttradereplay.gtp.v24_4.fields.VolumeOnBookOnlyField;
import omi.lseg.tradeecho.mifid2posttradereplay.gtp.v24_4.fields.VwapField;
import omi.lseg.tradeecho.mifid2posttradereplay.gtp.v24_4.fields.VwapOnBookOnlyField;
import omi.lseg.tradeecho.mifid2posttradereplay.gtp.v24_4.types.Field;
import omi.lseg.tradeecho.mifid2posttradereplay.gtp.v24_4.types.Message;
import omi.lseg.tradeecho.mifid2posttradereplay.gtp.v24_4.types.PrintOptions;

/**
 * Represents the StatisticsMessage message from the Mifid2PostTradeReplay protocol.
 *
 * <p>Contains a set of statistics that are updated frequently, usually as a result of executions</p>
 */
public final class StatisticsMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 74;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Statistics Message";

    /**
     * Time the message was generated
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * GTP Instrument identifier.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * Venue from which market data is received for the instrument
     */
    private final SourceVenueField sourceVenue = new SourceVenueField();

    /**
     * Cumulative volume of all trades for the trading day.
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Cumulative volume for the trading day excluding off-book trades.
     */
    private final VolumeOnBookOnlyField volumeOnBookOnly = new VolumeOnBookOnlyField();

    /**
     * Not Applicable to TRADEcho
     */
    private final VwapField vwap = new VwapField();

    /**
     * Not Applicable to TRADEcho
     */
    private final VwapOnBookOnlyField vwapOnBookOnly = new VwapOnBookOnlyField();

    /**
     * Count of all trades for the day.
     */
    private final NumberOfTradesField numberOfTrades = new NumberOfTradesField();

    /**
     * Count of trades for the day excluding off-book trades.
     */
    private final NumberOfTradesOnBookOnlyField numberOfTradesOnBookOnly = new NumberOfTradesOnBookOnlyField();

    /**
     * Not Applicable to TRADEcho
     */
    private final TurnoverField turnover = new TurnoverField();

    /**
     * Not Applicable to TRADEcho
     */
    private final TurnoverOnBookOnlyField turnoverOnBookOnly = new TurnoverOnBookOnlyField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrument, sourceVenue, volume, volumeOnBookOnly, vwap, vwapOnBookOnly, numberOfTrades, numberOfTradesOnBookOnly, turnover, turnoverOnBookOnly);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time the message was generated
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
     * Venue from which market data is received for the instrument
     *
     * @return the SourceVenue field
     */
    public SourceVenueField sourceVenue() {
        return sourceVenue;
    }

    /**
     * Cumulative volume of all trades for the trading day.
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * Cumulative volume for the trading day excluding off-book trades.
     *
     * @return the VolumeOnBookOnly field
     */
    public VolumeOnBookOnlyField volumeOnBookOnly() {
        return volumeOnBookOnly;
    }

    /**
     * Not Applicable to TRADEcho
     *
     * @return the Vwap field
     */
    public VwapField vwap() {
        return vwap;
    }

    /**
     * Not Applicable to TRADEcho
     *
     * @return the VwapOnBookOnly field
     */
    public VwapOnBookOnlyField vwapOnBookOnly() {
        return vwapOnBookOnly;
    }

    /**
     * Count of all trades for the day.
     *
     * @return the NumberOfTrades field
     */
    public NumberOfTradesField numberOfTrades() {
        return numberOfTrades;
    }

    /**
     * Count of trades for the day excluding off-book trades.
     *
     * @return the NumberOfTradesOnBookOnly field
     */
    public NumberOfTradesOnBookOnlyField numberOfTradesOnBookOnly() {
        return numberOfTradesOnBookOnly;
    }

    /**
     * Not Applicable to TRADEcho
     *
     * @return the Turnover field
     */
    public TurnoverField turnover() {
        return turnover;
    }

    /**
     * Not Applicable to TRADEcho
     *
     * @return the TurnoverOnBookOnly field
     */
    public TurnoverOnBookOnlyField turnoverOnBookOnly() {
        return turnoverOnBookOnly;
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
        if (!sourceVenue.parse(data, cursor)) {
            return false;
        }
        cursor += SourceVenueField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!volumeOnBookOnly.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeOnBookOnlyField.BYTE_LENGTH;
        if (!vwap.parse(data, cursor)) {
            return false;
        }
        cursor += VwapField.BYTE_LENGTH;
        if (!vwapOnBookOnly.parse(data, cursor)) {
            return false;
        }
        cursor += VwapOnBookOnlyField.BYTE_LENGTH;
        if (!numberOfTrades.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfTradesField.BYTE_LENGTH;
        if (!numberOfTradesOnBookOnly.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfTradesOnBookOnlyField.BYTE_LENGTH;
        if (!turnover.parse(data, cursor)) {
            return false;
        }
        cursor += TurnoverField.BYTE_LENGTH;
        return turnoverOnBookOnly.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = sourceVenue.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = volumeOnBookOnly.encode(data, cursor);
        cursor = vwap.encode(data, cursor);
        cursor = vwapOnBookOnly.encode(data, cursor);
        cursor = numberOfTrades.encode(data, cursor);
        cursor = numberOfTradesOnBookOnly.encode(data, cursor);
        cursor = turnover.encode(data, cursor);
        cursor = turnoverOnBookOnly.encode(data, cursor);
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
            case "SourceVenue" -> Optional.of(sourceVenue);
            case "Volume" -> Optional.of(volume);
            case "VolumeOnBookOnly" -> Optional.of(volumeOnBookOnly);
            case "Vwap" -> Optional.of(vwap);
            case "VwapOnBookOnly" -> Optional.of(vwapOnBookOnly);
            case "NumberOfTrades" -> Optional.of(numberOfTrades);
            case "NumberOfTradesOnBookOnly" -> Optional.of(numberOfTradesOnBookOnly);
            case "Turnover" -> Optional.of(turnover);
            case "TurnoverOnBookOnly" -> Optional.of(turnoverOnBookOnly);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StatisticsMessage message)) {
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
        if (!(other instanceof StatisticsMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
