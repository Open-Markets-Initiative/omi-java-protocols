package omi.lseg.turquoise.level1incremental.gtp.v26_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.turquoise.level1incremental.gtp.v26_3.fields.AuctionInfoField;
import omi.lseg.turquoise.level1incremental.gtp.v26_3.fields.AuctionTypeField;
import omi.lseg.turquoise.level1incremental.gtp.v26_3.fields.ImbalanceQuantityField;
import omi.lseg.turquoise.level1incremental.gtp.v26_3.fields.InstrumentField;
import omi.lseg.turquoise.level1incremental.gtp.v26_3.fields.OpeningClosingPriceIndicatorField;
import omi.lseg.turquoise.level1incremental.gtp.v26_3.fields.SourceVenueField;
import omi.lseg.turquoise.level1incremental.gtp.v26_3.fields.StatisticPriceField;
import omi.lseg.turquoise.level1incremental.gtp.v26_3.fields.StatisticSizeField;
import omi.lseg.turquoise.level1incremental.gtp.v26_3.fields.StatisticTypeField;
import omi.lseg.turquoise.level1incremental.gtp.v26_3.fields.TimestampField;
import omi.lseg.turquoise.level1incremental.gtp.v26_3.types.Field;
import omi.lseg.turquoise.level1incremental.gtp.v26_3.types.Message;
import omi.lseg.turquoise.level1incremental.gtp.v26_3.types.PrintOptions;

/**
 * Represents the StatisticsUpdateMessage message from the Level1Incremental protocol.
 *
 * <p>Contains a set of statistics that are not updated frequently</p>
 */
public final class StatisticsUpdateMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 47;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Statistics Update Message";

    /**
     * Time the message was generated.
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
     * The statistic that is disseminated with this message instance:
     */
    private final StatisticTypeField statisticType = new StatisticTypeField();

    /**
     * The value of price type statistics
     */
    private final StatisticPriceField statisticPrice = new StatisticPriceField();

    /**
     * The value of size type statistics.
     */
    private final StatisticSizeField statisticSize = new StatisticSizeField();

    /**
     * Not Applicable to Turquoise
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Not Applicable to Turquoise
     */
    private final ImbalanceQuantityField imbalanceQuantity = new ImbalanceQuantityField();

    /**
     * Populated if the Statistic Type is 1:
     */
    private final AuctionInfoField auctionInfo = new AuctionInfoField();

    /**
     * Not Applicable to Turquoise
     */
    private final OpeningClosingPriceIndicatorField openingClosingPriceIndicator = new OpeningClosingPriceIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrument, sourceVenue, statisticType, statisticPrice, statisticSize, auctionType, imbalanceQuantity, auctionInfo, openingClosingPriceIndicator);

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
     * Venue from which market data is received for the instrument
     *
     * @return the SourceVenue field
     */
    public SourceVenueField sourceVenue() {
        return sourceVenue;
    }

    /**
     * The statistic that is disseminated with this message instance:
     *
     * @return the StatisticType field
     */
    public StatisticTypeField statisticType() {
        return statisticType;
    }

    /**
     * The value of price type statistics
     *
     * @return the StatisticPrice field
     */
    public StatisticPriceField statisticPrice() {
        return statisticPrice;
    }

    /**
     * The value of size type statistics.
     *
     * @return the StatisticSize field
     */
    public StatisticSizeField statisticSize() {
        return statisticSize;
    }

    /**
     * Not Applicable to Turquoise
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * Not Applicable to Turquoise
     *
     * @return the ImbalanceQuantity field
     */
    public ImbalanceQuantityField imbalanceQuantity() {
        return imbalanceQuantity;
    }

    /**
     * Populated if the Statistic Type is 1:
     *
     * @return the AuctionInfo field
     */
    public AuctionInfoField auctionInfo() {
        return auctionInfo;
    }

    /**
     * Not Applicable to Turquoise
     *
     * @return the OpeningClosingPriceIndicator field
     */
    public OpeningClosingPriceIndicatorField openingClosingPriceIndicator() {
        return openingClosingPriceIndicator;
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
        if (!statisticType.parse(data, cursor)) {
            return false;
        }
        cursor += StatisticTypeField.BYTE_LENGTH;
        if (!statisticPrice.parse(data, cursor)) {
            return false;
        }
        cursor += StatisticPriceField.BYTE_LENGTH;
        if (!statisticSize.parse(data, cursor)) {
            return false;
        }
        cursor += StatisticSizeField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!imbalanceQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceQuantityField.BYTE_LENGTH;
        if (!auctionInfo.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionInfoField.BYTE_LENGTH;
        return openingClosingPriceIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = sourceVenue.encode(data, cursor);
        cursor = statisticType.encode(data, cursor);
        cursor = statisticPrice.encode(data, cursor);
        cursor = statisticSize.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = imbalanceQuantity.encode(data, cursor);
        cursor = auctionInfo.encode(data, cursor);
        cursor = openingClosingPriceIndicator.encode(data, cursor);
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
            case "StatisticType" -> Optional.of(statisticType);
            case "StatisticPrice" -> Optional.of(statisticPrice);
            case "StatisticSize" -> Optional.of(statisticSize);
            case "AuctionType" -> Optional.of(auctionType);
            case "ImbalanceQuantity" -> Optional.of(imbalanceQuantity);
            case "AuctionInfo" -> Optional.of(auctionInfo);
            case "OpeningClosingPriceIndicator" -> Optional.of(openingClosingPriceIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StatisticsUpdateMessage message)) {
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
        if (!(other instanceof StatisticsUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
