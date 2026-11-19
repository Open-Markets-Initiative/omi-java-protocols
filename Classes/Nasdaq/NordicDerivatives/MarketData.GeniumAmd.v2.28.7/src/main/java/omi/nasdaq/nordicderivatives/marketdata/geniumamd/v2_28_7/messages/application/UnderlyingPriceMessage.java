package omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.AskPriceField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.BestAskVolumeField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.BestBidVolumeField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.BidPriceField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.ClosingPriceField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.HighPriceField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.LastPriceField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.LowPriceField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.OpeningPriceField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.TimestampNanosecondsField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.TurnoverField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.UnderlyingOrderBookIdField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.types.Field;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.types.Message;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.types.PrintOptions;

/**
 * Represents the UnderlyingPriceMessage message from the MarketData protocol.
 */
public final class UnderlyingPriceMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'U';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 60;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Underlying Price Message";

    /**
     * Nanoseconds portion of the timestamp.
     */
    private final TimestampNanosecondsField timestampNanoseconds = new TimestampNanosecondsField();

    /**
     * Order book ID of underlying instrument. NOTE: Only applicable for underlying instruments.
     */
    private final UnderlyingOrderBookIdField underlyingOrderBookId = new UnderlyingOrderBookIdField();

    /**
     * Bid Price
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * Ask Price
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * Closing Price
     */
    private final ClosingPriceField closingPrice = new ClosingPriceField();

    /**
     * Opening Price
     */
    private final OpeningPriceField openingPrice = new OpeningPriceField();

    /**
     * High Price
     */
    private final HighPriceField highPrice = new HighPriceField();

    /**
     * Low Price
     */
    private final LowPriceField lowPrice = new LowPriceField();

    /**
     * Last Price
     */
    private final LastPriceField lastPrice = new LastPriceField();

    /**
     * The number of traded contracts
     */
    private final TurnoverField turnover = new TurnoverField();

    /**
     * Total volume of orders in the market on best bid
     */
    private final BestBidVolumeField bestBidVolume = new BestBidVolumeField();

    /**
     * Total volume of orders in the market on ask bid
     */
    private final BestAskVolumeField bestAskVolume = new BestAskVolumeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampNanoseconds, underlyingOrderBookId, bidPrice, askPrice, closingPrice, openingPrice, highPrice, lowPrice, lastPrice, turnover, bestBidVolume, bestAskVolume);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the timestamp.
     *
     * @return the TimestampNanoseconds field
     */
    public TimestampNanosecondsField timestampNanoseconds() {
        return timestampNanoseconds;
    }

    /**
     * Order book ID of underlying instrument. NOTE: Only applicable for underlying instruments.
     *
     * @return the UnderlyingOrderBookId field
     */
    public UnderlyingOrderBookIdField underlyingOrderBookId() {
        return underlyingOrderBookId;
    }

    /**
     * Bid Price
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * Ask Price
     *
     * @return the AskPrice field
     */
    public AskPriceField askPrice() {
        return askPrice;
    }

    /**
     * Closing Price
     *
     * @return the ClosingPrice field
     */
    public ClosingPriceField closingPrice() {
        return closingPrice;
    }

    /**
     * Opening Price
     *
     * @return the OpeningPrice field
     */
    public OpeningPriceField openingPrice() {
        return openingPrice;
    }

    /**
     * High Price
     *
     * @return the HighPrice field
     */
    public HighPriceField highPrice() {
        return highPrice;
    }

    /**
     * Low Price
     *
     * @return the LowPrice field
     */
    public LowPriceField lowPrice() {
        return lowPrice;
    }

    /**
     * Last Price
     *
     * @return the LastPrice field
     */
    public LastPriceField lastPrice() {
        return lastPrice;
    }

    /**
     * The number of traded contracts
     *
     * @return the Turnover field
     */
    public TurnoverField turnover() {
        return turnover;
    }

    /**
     * Total volume of orders in the market on best bid
     *
     * @return the BestBidVolume field
     */
    public BestBidVolumeField bestBidVolume() {
        return bestBidVolume;
    }

    /**
     * Total volume of orders in the market on ask bid
     *
     * @return the BestAskVolume field
     */
    public BestAskVolumeField bestAskVolume() {
        return bestAskVolume;
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
        if (!timestampNanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampNanosecondsField.BYTE_LENGTH;
        if (!underlyingOrderBookId.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingOrderBookIdField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        if (!askPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceField.BYTE_LENGTH;
        if (!closingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingPriceField.BYTE_LENGTH;
        if (!openingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OpeningPriceField.BYTE_LENGTH;
        if (!highPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceField.BYTE_LENGTH;
        if (!lowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceField.BYTE_LENGTH;
        if (!lastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastPriceField.BYTE_LENGTH;
        if (!turnover.parse(data, cursor)) {
            return false;
        }
        cursor += TurnoverField.BYTE_LENGTH;
        if (!bestBidVolume.parse(data, cursor)) {
            return false;
        }
        cursor += BestBidVolumeField.BYTE_LENGTH;
        return bestAskVolume.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampNanoseconds.encode(data, cursor);
        cursor = underlyingOrderBookId.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = closingPrice.encode(data, cursor);
        cursor = openingPrice.encode(data, cursor);
        cursor = highPrice.encode(data, cursor);
        cursor = lowPrice.encode(data, cursor);
        cursor = lastPrice.encode(data, cursor);
        cursor = turnover.encode(data, cursor);
        cursor = bestBidVolume.encode(data, cursor);
        cursor = bestAskVolume.encode(data, cursor);
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
            case "TimestampNanoseconds" -> Optional.of(timestampNanoseconds);
            case "UnderlyingOrderBookId" -> Optional.of(underlyingOrderBookId);
            case "BidPrice" -> Optional.of(bidPrice);
            case "AskPrice" -> Optional.of(askPrice);
            case "ClosingPrice" -> Optional.of(closingPrice);
            case "OpeningPrice" -> Optional.of(openingPrice);
            case "HighPrice" -> Optional.of(highPrice);
            case "LowPrice" -> Optional.of(lowPrice);
            case "LastPrice" -> Optional.of(lastPrice);
            case "Turnover" -> Optional.of(turnover);
            case "BestBidVolume" -> Optional.of(bestBidVolume);
            case "BestAskVolume" -> Optional.of(bestAskVolume);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof UnderlyingPriceMessage message)) {
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
        if (!(other instanceof UnderlyingPriceMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
