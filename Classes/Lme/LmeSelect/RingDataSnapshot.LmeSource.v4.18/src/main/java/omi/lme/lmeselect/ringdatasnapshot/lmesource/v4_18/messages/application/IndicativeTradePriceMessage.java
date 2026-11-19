package omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.IndicativePriceTypeField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.IndicativeTradePriceField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.RingSessionField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.TimeofEventField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.TradableInstrumentIdField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.fields.TradingVenueField;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.ringdatasnapshot.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the IndicativeTradePriceMessage message from the RingDataSnapshot protocol.
 *
 * <p>Generated each time there is a trade price and when a price has been deleted.</p>
 */
public final class IndicativeTradePriceMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 29;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Indicative Trade Price Message";

    /**
     * Time of event. The specification spells this field TimeofEvent, where every other message spells it TimeOfEvent; the name is carried as the specification gives it.
     */
    private final TimeofEventField timeofEvent = new TimeofEventField();

    /**
     * Tradable Instrument ID.
     */
    private final TradableInstrumentIdField tradableInstrumentId = new TradableInstrumentIdField();

    /**
     * Trading venue.
     */
    private final TradingVenueField tradingVenue = new TradingVenueField();

    /**
     * This identifies the ring trading session.
     */
    private final RingSessionField ringSession = new RingSessionField();

    /**
     * Indicative trade price type.
     */
    private final IndicativePriceTypeField indicativePriceType = new IndicativePriceTypeField();

    /**
     * The price of the trade, in implicit six decimal place format.
     */
    private final IndicativeTradePriceField indicativeTradePrice = new IndicativeTradePriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeofEvent, tradableInstrumentId, tradingVenue, ringSession, indicativePriceType, indicativeTradePrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time of event. The specification spells this field TimeofEvent, where every other message spells it TimeOfEvent; the name is carried as the specification gives it.
     *
     * @return the TimeofEvent field
     */
    public TimeofEventField timeofEvent() {
        return timeofEvent;
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
     * Trading venue.
     *
     * @return the TradingVenue field
     */
    public TradingVenueField tradingVenue() {
        return tradingVenue;
    }

    /**
     * This identifies the ring trading session.
     *
     * @return the RingSession field
     */
    public RingSessionField ringSession() {
        return ringSession;
    }

    /**
     * Indicative trade price type.
     *
     * @return the IndicativePriceType field
     */
    public IndicativePriceTypeField indicativePriceType() {
        return indicativePriceType;
    }

    /**
     * The price of the trade, in implicit six decimal place format.
     *
     * @return the IndicativeTradePrice field
     */
    public IndicativeTradePriceField indicativeTradePrice() {
        return indicativeTradePrice;
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
        return Optional.ofNullable(timeofEvent.value());
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
        if (!timeofEvent.parse(data, cursor)) {
            return false;
        }
        cursor += TimeofEventField.BYTE_LENGTH;
        if (!tradableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += TradableInstrumentIdField.BYTE_LENGTH;
        if (!tradingVenue.parse(data, cursor)) {
            return false;
        }
        cursor += TradingVenueField.BYTE_LENGTH;
        if (!ringSession.parse(data, cursor)) {
            return false;
        }
        cursor += RingSessionField.BYTE_LENGTH;
        if (!indicativePriceType.parse(data, cursor)) {
            return false;
        }
        cursor += IndicativePriceTypeField.BYTE_LENGTH;
        return indicativeTradePrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeofEvent.encode(data, cursor);
        cursor = tradableInstrumentId.encode(data, cursor);
        cursor = tradingVenue.encode(data, cursor);
        cursor = ringSession.encode(data, cursor);
        cursor = indicativePriceType.encode(data, cursor);
        cursor = indicativeTradePrice.encode(data, cursor);
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
            case "TimeofEvent" -> Optional.of(timeofEvent);
            case "TradableInstrumentId" -> Optional.of(tradableInstrumentId);
            case "TradingVenue" -> Optional.of(tradingVenue);
            case "RingSession" -> Optional.of(ringSession);
            case "IndicativePriceType" -> Optional.of(indicativePriceType);
            case "IndicativeTradePrice" -> Optional.of(indicativeTradePrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof IndicativeTradePriceMessage message)) {
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
        if (!(other instanceof IndicativeTradePriceMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
