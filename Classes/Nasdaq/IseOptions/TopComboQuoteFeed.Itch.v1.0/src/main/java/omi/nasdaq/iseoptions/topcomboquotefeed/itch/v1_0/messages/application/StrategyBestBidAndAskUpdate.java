package omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.AskCustSizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.AskMarketSizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.AskNttMarketSizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.AskNttSizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.AskPriceField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.AskProCustSizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.AskSizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.BidCustSizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.BidMarketSizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.BidNttMarketSizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.BidNttSizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.BidPriceField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.BidProCustSizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.BidSizeField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.QuoteConditionField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.StrategyIdField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.fields.TimestampField;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.types.Field;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.types.Message;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.types.PrintOptions;

/**
 * Represents the StrategyBestBidAndAskUpdate message from the TopComboQuoteFeed protocol.
 *
 * <p>The options system uses this administrative message to indicate when an strategy has completed the opening process and is now available for auto execution or when the option has closed and is no longer available for auto execution.</p>
 */
public final class StrategyBestBidAndAskUpdate implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'C';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 67;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Strategy Best Bid And Ask Update";

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * ISE’s Strategy ID assigned daily, valid while there are any open complex orders for the day
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * &lt;space&gt; = regular quote/autox eligible “X” = Pre-Open/Halted
     */
    private final QuoteConditionField quoteCondition = new QuoteConditionField();

    /**
     * Best bid price in fixed point format with 6 whole number places followed by 4 decimal digits.
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * Aggregated number of contracts on the bid side being displayed in the options market at the current time.
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
     * Limit Bid size that can’t be traded through.
     */
    private final BidNttSizeField bidNttSize = new BidNttSizeField();

    /**
     * The aggregate market size on Bid side.
     */
    private final BidMarketSizeField bidMarketSize = new BidMarketSizeField();

    /**
     * The aggregated NTT Market Size on Bid Size.
     */
    private final BidNttMarketSizeField bidNttMarketSize = new BidNttMarketSizeField();

    /**
     * Best ask price in fixed point format with 6 whole number places followed by 4 decimal digits.
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * Aggregated number of contracts on the ask side being displayed in the options market at the current time.
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
     * Limit Ask size that can’t be traded through.
     */
    private final AskNttSizeField askNttSize = new AskNttSizeField();

    /**
     * Aggregate market quantity on Ask side.
     */
    private final AskMarketSizeField askMarketSize = new AskMarketSizeField();

    /**
     * The aggregated NTT Market Size on Ask Size.
     */
    private final AskNttMarketSizeField askNttMarketSize = new AskNttMarketSizeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, strategyId, quoteCondition, bidPrice, bidSize, bidCustSize, bidProCustSize, bidNttSize, bidMarketSize, bidNttMarketSize, askPrice, askSize, askCustSize, askProCustSize, askNttSize, askMarketSize, askNttMarketSize);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time, expressed as the number of nanoseconds after midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * ISE’s Strategy ID assigned daily, valid while there are any open complex orders for the day
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
    }

    /**
     * &lt;space&gt; = regular quote/autox eligible “X” = Pre-Open/Halted
     *
     * @return the QuoteCondition field
     */
    public QuoteConditionField quoteCondition() {
        return quoteCondition;
    }

    /**
     * Best bid price in fixed point format with 6 whole number places followed by 4 decimal digits.
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * Aggregated number of contracts on the bid side being displayed in the options market at the current time.
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
     * Limit Bid size that can’t be traded through.
     *
     * @return the BidNttSize field
     */
    public BidNttSizeField bidNttSize() {
        return bidNttSize;
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
     * The aggregated NTT Market Size on Bid Size.
     *
     * @return the BidNttMarketSize field
     */
    public BidNttMarketSizeField bidNttMarketSize() {
        return bidNttMarketSize;
    }

    /**
     * Best ask price in fixed point format with 6 whole number places followed by 4 decimal digits.
     *
     * @return the AskPrice field
     */
    public AskPriceField askPrice() {
        return askPrice;
    }

    /**
     * Aggregated number of contracts on the ask side being displayed in the options market at the current time.
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
     * Limit Ask size that can’t be traded through.
     *
     * @return the AskNttSize field
     */
    public AskNttSizeField askNttSize() {
        return askNttSize;
    }

    /**
     * Aggregate market quantity on Ask side.
     *
     * @return the AskMarketSize field
     */
    public AskMarketSizeField askMarketSize() {
        return askMarketSize;
    }

    /**
     * The aggregated NTT Market Size on Ask Size.
     *
     * @return the AskNttMarketSize field
     */
    public AskNttMarketSizeField askNttMarketSize() {
        return askNttMarketSize;
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
        if (!bidNttSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidNttSizeField.BYTE_LENGTH;
        if (!bidMarketSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidMarketSizeField.BYTE_LENGTH;
        if (!bidNttMarketSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidNttMarketSizeField.BYTE_LENGTH;
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
        if (!askNttSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskNttSizeField.BYTE_LENGTH;
        if (!askMarketSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskMarketSizeField.BYTE_LENGTH;
        return askNttMarketSize.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = strategyId.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = bidCustSize.encode(data, cursor);
        cursor = bidProCustSize.encode(data, cursor);
        cursor = bidNttSize.encode(data, cursor);
        cursor = bidMarketSize.encode(data, cursor);
        cursor = bidNttMarketSize.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = askCustSize.encode(data, cursor);
        cursor = askProCustSize.encode(data, cursor);
        cursor = askNttSize.encode(data, cursor);
        cursor = askMarketSize.encode(data, cursor);
        cursor = askNttMarketSize.encode(data, cursor);
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
            case "StrategyId" -> Optional.of(strategyId);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "BidPrice" -> Optional.of(bidPrice);
            case "BidSize" -> Optional.of(bidSize);
            case "BidCustSize" -> Optional.of(bidCustSize);
            case "BidProCustSize" -> Optional.of(bidProCustSize);
            case "BidNttSize" -> Optional.of(bidNttSize);
            case "BidMarketSize" -> Optional.of(bidMarketSize);
            case "BidNttMarketSize" -> Optional.of(bidNttMarketSize);
            case "AskPrice" -> Optional.of(askPrice);
            case "AskSize" -> Optional.of(askSize);
            case "AskCustSize" -> Optional.of(askCustSize);
            case "AskProCustSize" -> Optional.of(askProCustSize);
            case "AskNttSize" -> Optional.of(askNttSize);
            case "AskMarketSize" -> Optional.of(askMarketSize);
            case "AskNttMarketSize" -> Optional.of(askNttMarketSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StrategyBestBidAndAskUpdate message)) {
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
        if (!(other instanceof StrategyBestBidAndAskUpdate message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
