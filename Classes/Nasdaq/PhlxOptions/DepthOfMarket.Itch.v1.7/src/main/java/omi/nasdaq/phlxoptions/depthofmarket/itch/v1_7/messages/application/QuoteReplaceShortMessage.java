package omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.fields.AskReferenceNumberDeltaField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.fields.BidReferenceNumberDeltaField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.fields.NanosecondsField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.fields.OriginalAskReferenceNumberDeltaField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.fields.OriginalBidReferenceNumberDeltaField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.fields.ShortAskPriceField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.fields.ShortAskSizeField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.fields.ShortBidPriceField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.fields.ShortBidSizeField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.types.Field;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.types.Message;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_7.types.PrintOptions;

/**
 * Represents the QuoteReplaceShortMessage message from the DepthOfMarket protocol.
 *
 * <p>This message is sent whenever a quote on the book is replaced. The replaced quote has new reference numbers on both sides.</p>
 */
public final class QuoteReplaceShortMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'k';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 28;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Replace Short Message";

    /**
     * Nanoseconds portion of the timestamp.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * The original bid reference number delta associated with the order being replaced.
     */
    private final OriginalBidReferenceNumberDeltaField originalBidReferenceNumberDelta = new OriginalBidReferenceNumberDeltaField();

    /**
     * The bid reference number delta associated with the new quote.
     */
    private final BidReferenceNumberDeltaField bidReferenceNumberDelta = new BidReferenceNumberDeltaField();

    /**
     * The original ask reference number delta associated with the order being replaced.
     */
    private final OriginalAskReferenceNumberDeltaField originalAskReferenceNumberDelta = new OriginalAskReferenceNumberDeltaField();

    /**
     * The ask reference number delta associated with the new quote
     */
    private final AskReferenceNumberDeltaField askReferenceNumberDelta = new AskReferenceNumberDeltaField();

    /**
     * NOTE: When converted to a decimal format, this price is in fixed point format with 3 whole number places followed by 2 decimal digits. The display bid price of the new quote.
     */
    private final ShortBidPriceField shortBidPrice = new ShortBidPriceField();

    /**
     * The bid contracts of the new quote.
     */
    private final ShortBidSizeField shortBidSize = new ShortBidSizeField();

    /**
     * The display ask price of the new quote.
     */
    private final ShortAskPriceField shortAskPrice = new ShortAskPriceField();

    /**
     * The ask contracts of the new quote.
     */
    private final ShortAskSizeField shortAskSize = new ShortAskSizeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, originalBidReferenceNumberDelta, bidReferenceNumberDelta, originalAskReferenceNumberDelta, askReferenceNumberDelta, shortBidPrice, shortBidSize, shortAskPrice, shortAskSize);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the timestamp.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * The original bid reference number delta associated with the order being replaced.
     *
     * @return the OriginalBidReferenceNumberDelta field
     */
    public OriginalBidReferenceNumberDeltaField originalBidReferenceNumberDelta() {
        return originalBidReferenceNumberDelta;
    }

    /**
     * The bid reference number delta associated with the new quote.
     *
     * @return the BidReferenceNumberDelta field
     */
    public BidReferenceNumberDeltaField bidReferenceNumberDelta() {
        return bidReferenceNumberDelta;
    }

    /**
     * The original ask reference number delta associated with the order being replaced.
     *
     * @return the OriginalAskReferenceNumberDelta field
     */
    public OriginalAskReferenceNumberDeltaField originalAskReferenceNumberDelta() {
        return originalAskReferenceNumberDelta;
    }

    /**
     * The ask reference number delta associated with the new quote
     *
     * @return the AskReferenceNumberDelta field
     */
    public AskReferenceNumberDeltaField askReferenceNumberDelta() {
        return askReferenceNumberDelta;
    }

    /**
     * NOTE: When converted to a decimal format, this price is in fixed point format with 3 whole number places followed by 2 decimal digits. The display bid price of the new quote.
     *
     * @return the ShortBidPrice field
     */
    public ShortBidPriceField shortBidPrice() {
        return shortBidPrice;
    }

    /**
     * The bid contracts of the new quote.
     *
     * @return the ShortBidSize field
     */
    public ShortBidSizeField shortBidSize() {
        return shortBidSize;
    }

    /**
     * The display ask price of the new quote.
     *
     * @return the ShortAskPrice field
     */
    public ShortAskPriceField shortAskPrice() {
        return shortAskPrice;
    }

    /**
     * The ask contracts of the new quote.
     *
     * @return the ShortAskSize field
     */
    public ShortAskSizeField shortAskSize() {
        return shortAskSize;
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
        if (!originalBidReferenceNumberDelta.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalBidReferenceNumberDeltaField.BYTE_LENGTH;
        if (!bidReferenceNumberDelta.parse(data, cursor)) {
            return false;
        }
        cursor += BidReferenceNumberDeltaField.BYTE_LENGTH;
        if (!originalAskReferenceNumberDelta.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalAskReferenceNumberDeltaField.BYTE_LENGTH;
        if (!askReferenceNumberDelta.parse(data, cursor)) {
            return false;
        }
        cursor += AskReferenceNumberDeltaField.BYTE_LENGTH;
        if (!shortBidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ShortBidPriceField.BYTE_LENGTH;
        if (!shortBidSize.parse(data, cursor)) {
            return false;
        }
        cursor += ShortBidSizeField.BYTE_LENGTH;
        if (!shortAskPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ShortAskPriceField.BYTE_LENGTH;
        return shortAskSize.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = originalBidReferenceNumberDelta.encode(data, cursor);
        cursor = bidReferenceNumberDelta.encode(data, cursor);
        cursor = originalAskReferenceNumberDelta.encode(data, cursor);
        cursor = askReferenceNumberDelta.encode(data, cursor);
        cursor = shortBidPrice.encode(data, cursor);
        cursor = shortBidSize.encode(data, cursor);
        cursor = shortAskPrice.encode(data, cursor);
        cursor = shortAskSize.encode(data, cursor);
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
            case "OriginalBidReferenceNumberDelta" -> Optional.of(originalBidReferenceNumberDelta);
            case "BidReferenceNumberDelta" -> Optional.of(bidReferenceNumberDelta);
            case "OriginalAskReferenceNumberDelta" -> Optional.of(originalAskReferenceNumberDelta);
            case "AskReferenceNumberDelta" -> Optional.of(askReferenceNumberDelta);
            case "ShortBidPrice" -> Optional.of(shortBidPrice);
            case "ShortBidSize" -> Optional.of(shortBidSize);
            case "ShortAskPrice" -> Optional.of(shortAskPrice);
            case "ShortAskSize" -> Optional.of(shortAskSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteReplaceShortMessage message)) {
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
        if (!(other instanceof QuoteReplaceShortMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
