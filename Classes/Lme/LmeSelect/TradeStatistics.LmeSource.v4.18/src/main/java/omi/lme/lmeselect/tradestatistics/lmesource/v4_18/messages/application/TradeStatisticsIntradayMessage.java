package omi.lme.lmeselect.tradestatistics.lmesource.v4_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.tradestatistics.lmesource.v4_18.fields.OpenPriceField;
import omi.lme.lmeselect.tradestatistics.lmesource.v4_18.fields.TimeOfEventField;
import omi.lme.lmeselect.tradestatistics.lmesource.v4_18.fields.TradableInstrumentIdField;
import omi.lme.lmeselect.tradestatistics.lmesource.v4_18.fields.TradeHighField;
import omi.lme.lmeselect.tradestatistics.lmesource.v4_18.fields.TradeLowField;
import omi.lme.lmeselect.tradestatistics.lmesource.v4_18.fields.TradingVenueField;
import omi.lme.lmeselect.tradestatistics.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.tradestatistics.lmesource.v4_18.types.Message;
import omi.lme.lmeselect.tradestatistics.lmesource.v4_18.types.PrintOptions;

/**
 * Represents the TradeStatisticsIntradayMessage message from the TradeStatistics protocol.
 *
 * <p>Contains trade information for completed trades, provided on a snapshot basis. Off book trades resulting from Cross Order execution are not used in the calculation.</p>
 */
public final class TradeStatisticsIntradayMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 42;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Statistics Intraday Message";

    /**
     * Trading venue.
     */
    private final TradingVenueField tradingVenue = new TradingVenueField();

    /**
     * The time LMEselect computed or derived the designated price.
     */
    private final TimeOfEventField timeOfEvent = new TimeOfEventField();

    /**
     * Tradable Instrument ID.
     */
    private final TradableInstrumentIdField tradableInstrumentId = new TradableInstrumentIdField();

    /**
     * Opening trade price for the current day, in implicit six decimal place format.
     */
    private final OpenPriceField openPrice = new OpenPriceField();

    /**
     * Highest trade price for the current day, in implicit six decimal place format.
     */
    private final TradeHighField tradeHigh = new TradeHighField();

    /**
     * Lowest trade price for the current day, in implicit six decimal place format.
     */
    private final TradeLowField tradeLow = new TradeLowField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tradingVenue, timeOfEvent, tradableInstrumentId, openPrice, tradeHigh, tradeLow);

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
     * The time LMEselect computed or derived the designated price.
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
     * Opening trade price for the current day, in implicit six decimal place format.
     *
     * @return the OpenPrice field
     */
    public OpenPriceField openPrice() {
        return openPrice;
    }

    /**
     * Highest trade price for the current day, in implicit six decimal place format.
     *
     * @return the TradeHigh field
     */
    public TradeHighField tradeHigh() {
        return tradeHigh;
    }

    /**
     * Lowest trade price for the current day, in implicit six decimal place format.
     *
     * @return the TradeLow field
     */
    public TradeLowField tradeLow() {
        return tradeLow;
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
        if (!openPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OpenPriceField.BYTE_LENGTH;
        if (!tradeHigh.parse(data, cursor)) {
            return false;
        }
        cursor += TradeHighField.BYTE_LENGTH;
        return tradeLow.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = tradingVenue.encode(data, cursor);
        cursor = timeOfEvent.encode(data, cursor);
        cursor = tradableInstrumentId.encode(data, cursor);
        cursor = openPrice.encode(data, cursor);
        cursor = tradeHigh.encode(data, cursor);
        cursor = tradeLow.encode(data, cursor);
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
            case "OpenPrice" -> Optional.of(openPrice);
            case "TradeHigh" -> Optional.of(tradeHigh);
            case "TradeLow" -> Optional.of(tradeLow);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeStatisticsIntradayMessage message)) {
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
        if (!(other instanceof TradeStatisticsIntradayMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
