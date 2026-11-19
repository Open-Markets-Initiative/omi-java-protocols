package omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.AskCustSizeField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.AskDnttMarketSizeField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.AskDnttSizeField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.AskMarketSizeField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.AskPriceField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.AskProCustSizeField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.AskSizeField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.BidCustSizeField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.BidDnttMarketSizeField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.BidDnttSizeField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.BidMarketSizeField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.BidPriceField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.BidProCustSizeField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.BidSizeField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.QuoteConditionField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.StrategyIdField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.TimestampField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.fields.TrackingNumberField;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.types.Field;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.types.Message;
import omi.nasdaq.iseoptions.spreadtopofmarket.glimpse.v2_02.types.PrintOptions;

/**
 * Represents the StrategyBestBidAndAskUpdateMessage message from the SpreadTopOfMarket protocol.
 *
 * <p>Whenever the best bid and ask position changes on both sides, the options system will send its best bid and ask update via the data feed for the affected strategy.</p>
 */
public final class StrategyBestBidAndAskUpdateMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'E';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 71;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Strategy Best Bid And Ask Update Message";

    /**
     * Internal system tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Option ID assigned daily. Valid for trading day
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * Quote Condition
     */
    private final QuoteConditionField quoteCondition = new QuoteConditionField();

    /**
     * The aggregate market size on Bid side.
     */
    private final BidMarketSizeField bidMarketSize = new BidMarketSizeField();

    /**
     * Best bid price in fixed point format with 6 whole number places followed by 4 decimal digits
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * Aggregated number of contracts on the bid side being displayed in the options market at the current time. Does not include the market size.
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Customer quantity on the bid side.
     */
    private final BidCustSizeField bidCustSize = new BidCustSizeField();

    /**
     * Customer professional quantity on the bid side.
     */
    private final BidProCustSizeField bidProCustSize = new BidProCustSizeField();

    /**
     * Aggregated Bid DNTT (Do not Trade Through) Limit Size
     */
    private final BidDnttSizeField bidDnttSize = new BidDnttSizeField();

    /**
     * The aggregated DNTT (Do Not Trade Through) Market Size on Bid Size.
     */
    private final BidDnttMarketSizeField bidDnttMarketSize = new BidDnttMarketSizeField();

    /**
     * The aggregate market size on Ask side.
     */
    private final AskMarketSizeField askMarketSize = new AskMarketSizeField();

    /**
     * Best ask price in fixed point format with 6 whole number places followed by 4 decimal digits
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * Aggregated number of contracts on the ask side being displayed in the options market at the current time. Does not include the market size.
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * Customer quantity on the ask side.
     */
    private final AskCustSizeField askCustSize = new AskCustSizeField();

    /**
     * Customer professional quantity on the ask side.
     */
    private final AskProCustSizeField askProCustSize = new AskProCustSizeField();

    /**
     * Aggregated Ask DNTT (Do not Trade Through) Limit Size
     */
    private final AskDnttSizeField askDnttSize = new AskDnttSizeField();

    /**
     * The aggregated DNTT (Do Not Trade Through) Market Size on Ask Size.
     */
    private final AskDnttMarketSizeField askDnttMarketSize = new AskDnttMarketSizeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(trackingNumber, timestampField, strategyId, quoteCondition, bidMarketSize, bidPrice, bidSize, bidCustSize, bidProCustSize, bidDnttSize, bidDnttMarketSize, askMarketSize, askPrice, askSize, askCustSize, askProCustSize, askDnttSize, askDnttMarketSize);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Internal system tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Nanoseconds since midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Option ID assigned daily. Valid for trading day
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
    }

    /**
     * Quote Condition
     *
     * @return the QuoteCondition field
     */
    public QuoteConditionField quoteCondition() {
        return quoteCondition;
    }

    /**
     * The aggregate market size on Bid side.
     *
     * @return the BidMarketSize field
     */
    public BidMarketSizeField bidMarketSize() {
        return bidMarketSize;
    }

    /**
     * Best bid price in fixed point format with 6 whole number places followed by 4 decimal digits
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * Aggregated number of contracts on the bid side being displayed in the options market at the current time. Does not include the market size.
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * Customer quantity on the bid side.
     *
     * @return the BidCustSize field
     */
    public BidCustSizeField bidCustSize() {
        return bidCustSize;
    }

    /**
     * Customer professional quantity on the bid side.
     *
     * @return the BidProCustSize field
     */
    public BidProCustSizeField bidProCustSize() {
        return bidProCustSize;
    }

    /**
     * Aggregated Bid DNTT (Do not Trade Through) Limit Size
     *
     * @return the BidDnttSize field
     */
    public BidDnttSizeField bidDnttSize() {
        return bidDnttSize;
    }

    /**
     * The aggregated DNTT (Do Not Trade Through) Market Size on Bid Size.
     *
     * @return the BidDnttMarketSize field
     */
    public BidDnttMarketSizeField bidDnttMarketSize() {
        return bidDnttMarketSize;
    }

    /**
     * The aggregate market size on Ask side.
     *
     * @return the AskMarketSize field
     */
    public AskMarketSizeField askMarketSize() {
        return askMarketSize;
    }

    /**
     * Best ask price in fixed point format with 6 whole number places followed by 4 decimal digits
     *
     * @return the AskPrice field
     */
    public AskPriceField askPrice() {
        return askPrice;
    }

    /**
     * Aggregated number of contracts on the ask side being displayed in the options market at the current time. Does not include the market size.
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
    }

    /**
     * Customer quantity on the ask side.
     *
     * @return the AskCustSize field
     */
    public AskCustSizeField askCustSize() {
        return askCustSize;
    }

    /**
     * Customer professional quantity on the ask side.
     *
     * @return the AskProCustSize field
     */
    public AskProCustSizeField askProCustSize() {
        return askProCustSize;
    }

    /**
     * Aggregated Ask DNTT (Do not Trade Through) Limit Size
     *
     * @return the AskDnttSize field
     */
    public AskDnttSizeField askDnttSize() {
        return askDnttSize;
    }

    /**
     * The aggregated DNTT (Do Not Trade Through) Market Size on Ask Size.
     *
     * @return the AskDnttMarketSize field
     */
    public AskDnttMarketSizeField askDnttMarketSize() {
        return askDnttMarketSize;
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
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!strategyId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyIdField.BYTE_LENGTH;
        if (!quoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteConditionField.BYTE_LENGTH;
        if (!bidMarketSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidMarketSizeField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!bidCustSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidCustSizeField.BYTE_LENGTH;
        if (!bidProCustSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidProCustSizeField.BYTE_LENGTH;
        if (!bidDnttSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidDnttSizeField.BYTE_LENGTH;
        if (!bidDnttMarketSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidDnttMarketSizeField.BYTE_LENGTH;
        if (!askMarketSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskMarketSizeField.BYTE_LENGTH;
        if (!askPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceField.BYTE_LENGTH;
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
        if (!askCustSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskCustSizeField.BYTE_LENGTH;
        if (!askProCustSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskProCustSizeField.BYTE_LENGTH;
        if (!askDnttSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskDnttSizeField.BYTE_LENGTH;
        return askDnttMarketSize.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = strategyId.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        cursor = bidMarketSize.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = bidCustSize.encode(data, cursor);
        cursor = bidProCustSize.encode(data, cursor);
        cursor = bidDnttSize.encode(data, cursor);
        cursor = bidDnttMarketSize.encode(data, cursor);
        cursor = askMarketSize.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = askCustSize.encode(data, cursor);
        cursor = askProCustSize.encode(data, cursor);
        cursor = askDnttSize.encode(data, cursor);
        cursor = askDnttMarketSize.encode(data, cursor);
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
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "Timestamp" -> Optional.of(timestampField);
            case "StrategyId" -> Optional.of(strategyId);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "BidMarketSize" -> Optional.of(bidMarketSize);
            case "BidPrice" -> Optional.of(bidPrice);
            case "BidSize" -> Optional.of(bidSize);
            case "BidCustSize" -> Optional.of(bidCustSize);
            case "BidProCustSize" -> Optional.of(bidProCustSize);
            case "BidDnttSize" -> Optional.of(bidDnttSize);
            case "BidDnttMarketSize" -> Optional.of(bidDnttMarketSize);
            case "AskMarketSize" -> Optional.of(askMarketSize);
            case "AskPrice" -> Optional.of(askPrice);
            case "AskSize" -> Optional.of(askSize);
            case "AskCustSize" -> Optional.of(askCustSize);
            case "AskProCustSize" -> Optional.of(askProCustSize);
            case "AskDnttSize" -> Optional.of(askDnttSize);
            case "AskDnttMarketSize" -> Optional.of(askDnttMarketSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StrategyBestBidAndAskUpdateMessage message)) {
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
        if (!(other instanceof StrategyBestBidAndAskUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
