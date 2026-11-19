package omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.AskPriceLongField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.AskReferenceDeltaNumberField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.AskSizeLongField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.BidPriceLongField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.BidReferenceNumberDeltaField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.BidSizeLongField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.NanosecondsField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.OriginalAskReferenceNumberDeltaField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.fields.OriginalBidReferenceNumberDeltaField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.types.Field;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.types.Message;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.types.PrintOptions;

/**
 * Represents the QuoteReplaceMessageLongForm message from the DepthOfMarket protocol.
 *
 * <p>This message is sent whenever a quote on the book is replaced. The replaced quote has new sequence numbers on both sides. These new sequence numbers replace the prior sequence numbers on the quote.</p>
 */
public final class QuoteReplaceMessageLongForm implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'K';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Replace Message Long Form";

    /**
     * Nanoseconds portion of timestamp
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * The original bid reference number delta that is replaced
     */
    private final OriginalBidReferenceNumberDeltaField originalBidReferenceNumberDelta = new OriginalBidReferenceNumberDeltaField();

    /**
     * The bid reference number delta associated with the new quote.
     */
    private final BidReferenceNumberDeltaField bidReferenceNumberDelta = new BidReferenceNumberDeltaField();

    /**
     * The original ask reference number delta that is replaced
     */
    private final OriginalAskReferenceNumberDeltaField originalAskReferenceNumberDelta = new OriginalAskReferenceNumberDeltaField();

    /**
     * The ask reference number delta associated with the replaced quote
     */
    private final AskReferenceDeltaNumberField askReferenceDeltaNumber = new AskReferenceDeltaNumberField();

    /**
     * The display bid price of the replaced quote.
     */
    private final BidPriceLongField bidPriceLong = new BidPriceLongField();

    /**
     * The bid contracts of the new quote.
     */
    private final BidSizeLongField bidSizeLong = new BidSizeLongField();

    /**
     * The display ask price of the replaced quote.
     */
    private final AskPriceLongField askPriceLong = new AskPriceLongField();

    /**
     * The ask contracts of the new quote.
     */
    private final AskSizeLongField askSizeLong = new AskSizeLongField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, originalBidReferenceNumberDelta, bidReferenceNumberDelta, originalAskReferenceNumberDelta, askReferenceDeltaNumber, bidPriceLong, bidSizeLong, askPriceLong, askSizeLong);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of timestamp
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * The original bid reference number delta that is replaced
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
     * The original ask reference number delta that is replaced
     *
     * @return the OriginalAskReferenceNumberDelta field
     */
    public OriginalAskReferenceNumberDeltaField originalAskReferenceNumberDelta() {
        return originalAskReferenceNumberDelta;
    }

    /**
     * The ask reference number delta associated with the replaced quote
     *
     * @return the AskReferenceDeltaNumber field
     */
    public AskReferenceDeltaNumberField askReferenceDeltaNumber() {
        return askReferenceDeltaNumber;
    }

    /**
     * The display bid price of the replaced quote.
     *
     * @return the BidPriceLong field
     */
    public BidPriceLongField bidPriceLong() {
        return bidPriceLong;
    }

    /**
     * The bid contracts of the new quote.
     *
     * @return the BidSizeLong field
     */
    public BidSizeLongField bidSizeLong() {
        return bidSizeLong;
    }

    /**
     * The display ask price of the replaced quote.
     *
     * @return the AskPriceLong field
     */
    public AskPriceLongField askPriceLong() {
        return askPriceLong;
    }

    /**
     * The ask contracts of the new quote.
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
        if (!askReferenceDeltaNumber.parse(data, cursor)) {
            return false;
        }
        cursor += AskReferenceDeltaNumberField.BYTE_LENGTH;
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
        cursor = originalBidReferenceNumberDelta.encode(data, cursor);
        cursor = bidReferenceNumberDelta.encode(data, cursor);
        cursor = originalAskReferenceNumberDelta.encode(data, cursor);
        cursor = askReferenceDeltaNumber.encode(data, cursor);
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
            case "OriginalBidReferenceNumberDelta" -> Optional.of(originalBidReferenceNumberDelta);
            case "BidReferenceNumberDelta" -> Optional.of(bidReferenceNumberDelta);
            case "OriginalAskReferenceNumberDelta" -> Optional.of(originalAskReferenceNumberDelta);
            case "AskReferenceDeltaNumber" -> Optional.of(askReferenceDeltaNumber);
            case "BidPriceLong" -> Optional.of(bidPriceLong);
            case "BidSizeLong" -> Optional.of(bidSizeLong);
            case "AskPriceLong" -> Optional.of(askPriceLong);
            case "AskSizeLong" -> Optional.of(askSizeLong);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteReplaceMessageLongForm message)) {
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
        if (!(other instanceof QuoteReplaceMessageLongForm message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
