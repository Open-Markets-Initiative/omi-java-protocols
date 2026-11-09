package omi.asx.asxderivatives.ntp.itch.v1_05.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.HighestTradeField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.LastTradeField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.LastVolumeField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.LowestTradeField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.NanosecondsField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.OpeningTradeField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.TotalTradedVolumeField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.TradeDateField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.TradeableInstrumentIdField;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.Field;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.Message;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.PrintOptions;

/**
 * Represents the MarketSettlementMessage message from the Ntp protocol.
 *
 * <p>This message disseminates the final settlement price of a future or option contracts order book for the trade date it pertains to</p>
 */
public final class MarketSettlementMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Y';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 54;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Market Settlement Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Nanoseconds portion of the Nanoseconds, accurate to 1,000 nanoseconds.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Trade Date. Represented as number of days since 1 January 1970.
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Identifier of the Order Book.
     */
    private final TradeableInstrumentIdField tradeableInstrumentId = new TradeableInstrumentIdField();

    /**
     * Opening Traded Price.
     */
    private final OpeningTradeField openingTrade = new OpeningTradeField();

    /**
     * Highest Traded Price.
     */
    private final HighestTradeField highestTrade = new HighestTradeField();

    /**
     * Lowest Traded Price.
     */
    private final LowestTradeField lowestTrade = new LowestTradeField();

    /**
     * Last Traded Price.
     */
    private final LastTradeField lastTrade = new LastTradeField();

    /**
     * Last Traded Volume.
     */
    private final LastVolumeField lastVolume = new LastVolumeField();

    /**
     * Total Traded Volume.
     */
    private final TotalTradedVolumeField totalTradedVolume = new TotalTradedVolumeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, tradeDate, tradeableInstrumentId, openingTrade, highestTrade, lowestTrade, lastTrade, lastVolume, totalTradedVolume);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the Nanoseconds, accurate to 1,000 nanoseconds.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Trade Date. Represented as number of days since 1 January 1970.
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Identifier of the Order Book.
     *
     * @return the TradeableInstrumentId field
     */
    public TradeableInstrumentIdField tradeableInstrumentId() {
        return tradeableInstrumentId;
    }

    /**
     * Opening Traded Price.
     *
     * @return the OpeningTrade field
     */
    public OpeningTradeField openingTrade() {
        return openingTrade;
    }

    /**
     * Highest Traded Price.
     *
     * @return the HighestTrade field
     */
    public HighestTradeField highestTrade() {
        return highestTrade;
    }

    /**
     * Lowest Traded Price.
     *
     * @return the LowestTrade field
     */
    public LowestTradeField lowestTrade() {
        return lowestTrade;
    }

    /**
     * Last Traded Price.
     *
     * @return the LastTrade field
     */
    public LastTradeField lastTrade() {
        return lastTrade;
    }

    /**
     * Last Traded Volume.
     *
     * @return the LastVolume field
     */
    public LastVolumeField lastVolume() {
        return lastVolume;
    }

    /**
     * Total Traded Volume.
     *
     * @return the TotalTradedVolume field
     */
    public TotalTradedVolumeField totalTradedVolume() {
        return totalTradedVolume;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!tradeableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeableInstrumentIdField.BYTE_LENGTH;
        if (!openingTrade.parse(data, cursor)) {
            return false;
        }
        cursor += OpeningTradeField.BYTE_LENGTH;
        if (!highestTrade.parse(data, cursor)) {
            return false;
        }
        cursor += HighestTradeField.BYTE_LENGTH;
        if (!lowestTrade.parse(data, cursor)) {
            return false;
        }
        cursor += LowestTradeField.BYTE_LENGTH;
        if (!lastTrade.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradeField.BYTE_LENGTH;
        if (!lastVolume.parse(data, cursor)) {
            return false;
        }
        cursor += LastVolumeField.BYTE_LENGTH;
        if (!totalTradedVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalTradedVolumeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = tradeableInstrumentId.encode(data, cursor);
        cursor = openingTrade.encode(data, cursor);
        cursor = highestTrade.encode(data, cursor);
        cursor = lowestTrade.encode(data, cursor);
        cursor = lastTrade.encode(data, cursor);
        cursor = lastVolume.encode(data, cursor);
        cursor = totalTradedVolume.encode(data, cursor);
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "TradeDate" -> Optional.of(tradeDate);
            case "TradeableInstrumentId" -> Optional.of(tradeableInstrumentId);
            case "OpeningTrade" -> Optional.of(openingTrade);
            case "HighestTrade" -> Optional.of(highestTrade);
            case "LowestTrade" -> Optional.of(lowestTrade);
            case "LastTrade" -> Optional.of(lastTrade);
            case "LastVolume" -> Optional.of(lastVolume);
            case "TotalTradedVolume" -> Optional.of(totalTradedVolume);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MarketSettlementMessage message)) {
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
        if (!(other instanceof MarketSettlementMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
