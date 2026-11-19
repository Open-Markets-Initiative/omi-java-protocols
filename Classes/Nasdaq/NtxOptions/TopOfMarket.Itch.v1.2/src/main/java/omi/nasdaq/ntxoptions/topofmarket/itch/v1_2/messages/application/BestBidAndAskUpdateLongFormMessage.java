package omi.nasdaq.ntxoptions.topofmarket.itch.v1_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.ntxoptions.topofmarket.itch.v1_2.fields.AskPriceLongField;
import omi.nasdaq.ntxoptions.topofmarket.itch.v1_2.fields.AskSizeLongField;
import omi.nasdaq.ntxoptions.topofmarket.itch.v1_2.fields.BidPriceLongField;
import omi.nasdaq.ntxoptions.topofmarket.itch.v1_2.fields.BidSizeLongField;
import omi.nasdaq.ntxoptions.topofmarket.itch.v1_2.fields.NanosecondsField;
import omi.nasdaq.ntxoptions.topofmarket.itch.v1_2.fields.OptionIdField;
import omi.nasdaq.ntxoptions.topofmarket.itch.v1_2.fields.QuoteConditionField;
import omi.nasdaq.ntxoptions.topofmarket.itch.v1_2.types.Field;
import omi.nasdaq.ntxoptions.topofmarket.itch.v1_2.types.Message;
import omi.nasdaq.ntxoptions.topofmarket.itch.v1_2.types.PrintOptions;

/**
 * Represents the BestBidAndAskUpdateLongFormMessage message from the TopOfMarket protocol.
 *
 * <p>This message is the same as the Best Bid AND Ask Update Message – Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places.</p>
 */
public final class BestBidAndAskUpdateLongFormMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Q';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 25;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Best Bid And Ask Update Long Form Message";

    /**
     * The sub-second portion of the time, in nanoseconds (0-999999999). The second portion of the time is obtained from the most recent timestamp message.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Option ID for this option, assigned daily, valid for trading day.
     */
    private final OptionIdField optionId = new OptionIdField();

    /**
     * Quote Condition
     */
    private final QuoteConditionField quoteCondition = new QuoteConditionField();

    /**
     * Best bid price.
     */
    private final BidPriceLongField bidPriceLong = new BidPriceLongField();

    /**
     * Aggregated number of contracts on the bid side being displayed in the options market at the current time.
     */
    private final BidSizeLongField bidSizeLong = new BidSizeLongField();

    /**
     * Best ask price.
     */
    private final AskPriceLongField askPriceLong = new AskPriceLongField();

    /**
     * Aggregated number of contracts on the ask side being displayed in the options market at the current time.
     */
    private final AskSizeLongField askSizeLong = new AskSizeLongField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, optionId, quoteCondition, bidPriceLong, bidSizeLong, askPriceLong, askSizeLong);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The sub-second portion of the time, in nanoseconds (0-999999999). The second portion of the time is obtained from the most recent timestamp message.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Option ID for this option, assigned daily, valid for trading day.
     *
     * @return the OptionId field
     */
    public OptionIdField optionId() {
        return optionId;
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
     * Best bid price.
     *
     * @return the BidPriceLong field
     */
    public BidPriceLongField bidPriceLong() {
        return bidPriceLong;
    }

    /**
     * Aggregated number of contracts on the bid side being displayed in the options market at the current time.
     *
     * @return the BidSizeLong field
     */
    public BidSizeLongField bidSizeLong() {
        return bidSizeLong;
    }

    /**
     * Best ask price.
     *
     * @return the AskPriceLong field
     */
    public AskPriceLongField askPriceLong() {
        return askPriceLong;
    }

    /**
     * Aggregated number of contracts on the ask side being displayed in the options market at the current time.
     *
     * @return the AskSizeLong field
     */
    public AskSizeLongField askSizeLong() {
        return askSizeLong;
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!optionId.parse(data, cursor)) {
            return false;
        }
        cursor += OptionIdField.BYTE_LENGTH;
        if (!quoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteConditionField.BYTE_LENGTH;
        if (!bidPriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceLongField.BYTE_LENGTH;
        if (!bidSizeLong.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeLongField.BYTE_LENGTH;
        if (!askPriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceLongField.BYTE_LENGTH;
        return askSizeLong.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = optionId.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        cursor = bidPriceLong.encode(data, cursor);
        cursor = bidSizeLong.encode(data, cursor);
        cursor = askPriceLong.encode(data, cursor);
        cursor = askSizeLong.encode(data, cursor);
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
            case "OptionId" -> Optional.of(optionId);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "BidPriceLong" -> Optional.of(bidPriceLong);
            case "BidSizeLong" -> Optional.of(bidSizeLong);
            case "AskPriceLong" -> Optional.of(askPriceLong);
            case "AskSizeLong" -> Optional.of(askSizeLong);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof BestBidAndAskUpdateLongFormMessage message)) {
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
        if (!(other instanceof BestBidAndAskUpdateLongFormMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
