package omi.lme.lmeselect.level2.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.FillerStringField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.IndicativeOpeningMidPriceField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.IndicativeOpeningPriceField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.IndicativeOpeningVolumeField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.TimeOfEventField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.TradableInstrumentIdField;
import omi.lme.lmeselect.level2.lmesource.v4_18.fields.TradingVenueField;
import omi.lme.lmeselect.level2.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.level2.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.level2.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the IndicativeOpeningPriceMessage message from the Level2 protocol.
 *
 * <p>Carries the price at which a tradable instrument would open, computed by the uncrossing algorithm during Pre-Open. If there are no crossed prices no IOP is calculated or disseminated; where the book is not crossed but has both a bid and an offer, a mid price is calculated and published instead. At the transition from Pre-Open to Open an IOP message is published for every tradable instrument with both prices null and the volume zero, to indicate the prices are no longer valid.</p>
 */
public final class IndicativeOpeningPriceMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 40;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Indicative Opening Price Message";

    /**
     * Trading venue.
     */
    private final TradingVenueField tradingVenue = new TradingVenueField();

    /**
     * Time of event.
     */
    private final TimeOfEventField timeOfEvent = new TimeOfEventField();

    /**
     * Tradable Instrument ID.
     */
    private final TradableInstrumentIdField tradableInstrumentId = new TradableInstrumentIdField();

    /**
     * Indicative Opening Price, in implicit six decimal place format. Defaults to null.
     */
    private final IndicativeOpeningPriceField indicativeOpeningPrice = new IndicativeOpeningPriceField();

    /**
     * Indicative Opening Volume. Defaults to zero.
     */
    private final IndicativeOpeningVolumeField indicativeOpeningVolume = new IndicativeOpeningVolumeField();

    /**
     * Indicative Opening Mid Price, in implicit six decimal place format. Defaults to null.
     */
    private final IndicativeOpeningMidPriceField indicativeOpeningMidPrice = new IndicativeOpeningMidPriceField();

    /**
     * Filler.
     */
    private final FillerStringField fillerString = new FillerStringField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tradingVenue, timeOfEvent, tradableInstrumentId, indicativeOpeningPrice, indicativeOpeningVolume, indicativeOpeningMidPrice, fillerString);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Trading venue.
     *
     * @return the TradingVenue field
     */
    public TradingVenueField tradingVenue() {
        return tradingVenue;
    }

    /**
     * Time of event.
     *
     * @return the TimeOfEvent field
     */
    public TimeOfEventField timeOfEvent() {
        return timeOfEvent;
    }

    /**
     * Tradable Instrument ID.
     *
     * @return the TradableInstrumentId field
     */
    public TradableInstrumentIdField tradableInstrumentId() {
        return tradableInstrumentId;
    }

    /**
     * Indicative Opening Price, in implicit six decimal place format. Defaults to null.
     *
     * @return the IndicativeOpeningPrice field
     */
    public IndicativeOpeningPriceField indicativeOpeningPrice() {
        return indicativeOpeningPrice;
    }

    /**
     * Indicative Opening Volume. Defaults to zero.
     *
     * @return the IndicativeOpeningVolume field
     */
    public IndicativeOpeningVolumeField indicativeOpeningVolume() {
        return indicativeOpeningVolume;
    }

    /**
     * Indicative Opening Mid Price, in implicit six decimal place format. Defaults to null.
     *
     * @return the IndicativeOpeningMidPrice field
     */
    public IndicativeOpeningMidPriceField indicativeOpeningMidPrice() {
        return indicativeOpeningMidPrice;
    }

    /**
     * Filler.
     *
     * @return the FillerString field
     */
    public FillerStringField fillerString() {
        return fillerString;
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
        return Optional.ofNullable(timeOfEvent.value());
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
        if (!tradingVenue.parse(data, cursor)) {
            return false;
        }
        cursor += TradingVenueField.BYTE_LENGTH;
        if (!timeOfEvent.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOfEventField.BYTE_LENGTH;
        if (!tradableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += TradableInstrumentIdField.BYTE_LENGTH;
        if (!indicativeOpeningPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IndicativeOpeningPriceField.BYTE_LENGTH;
        if (!indicativeOpeningVolume.parse(data, cursor)) {
            return false;
        }
        cursor += IndicativeOpeningVolumeField.BYTE_LENGTH;
        if (!indicativeOpeningMidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IndicativeOpeningMidPriceField.BYTE_LENGTH;
        return fillerString.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = tradingVenue.encode(data, cursor);
        cursor = timeOfEvent.encode(data, cursor);
        cursor = tradableInstrumentId.encode(data, cursor);
        cursor = indicativeOpeningPrice.encode(data, cursor);
        cursor = indicativeOpeningVolume.encode(data, cursor);
        cursor = indicativeOpeningMidPrice.encode(data, cursor);
        cursor = fillerString.encode(data, cursor);
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
            case "TradingVenue" -> Optional.of(tradingVenue);
            case "TimeOfEvent" -> Optional.of(timeOfEvent);
            case "TradableInstrumentId" -> Optional.of(tradableInstrumentId);
            case "IndicativeOpeningPrice" -> Optional.of(indicativeOpeningPrice);
            case "IndicativeOpeningVolume" -> Optional.of(indicativeOpeningVolume);
            case "IndicativeOpeningMidPrice" -> Optional.of(indicativeOpeningMidPrice);
            case "FillerString" -> Optional.of(fillerString);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof IndicativeOpeningPriceMessage message)) {
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
        if (!(other instanceof IndicativeOpeningPriceMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
