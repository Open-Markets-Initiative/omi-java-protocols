package omi.otcmarkets.linkats.multicast.link.v4_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.ChannelSeqNumField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.ExtendedQuoteFlagsField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.PriceField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.QapField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.QuoteFlagsField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.QuoteIdField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.QuoteReferenceIdField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.QuoteTimeMilliField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SizeField;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.Field;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.Message;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.PrintOptions;

/**
 * Represents the QuoteUpdateMessage message from the Multicast protocol.
 *
 * <p>Quote update information for the Quote Book channel and the Quote Book with Global OTC data channel.</p>
 */
public final class QuoteUpdateMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0002';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 33;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Update Message";

    /**
     * Monotonically increasing message sequence number at the channel level.
     */
    private final ChannelSeqNumField channelSeqNum = new ChannelSeqNumField();

    /**
     * Unique Quote ID.
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * Quote Information
     */
    private final QuoteFlagsField quoteFlags = new QuoteFlagsField();

    /**
     * Price with 6 decimal places assumed.
     */
    private final PriceField price = new PriceField();

    /**
     * Number of shares.
     */
    private final SizeField size = new SizeField();

    /**
     * Specifies the access fee or rebate for the bid/offer. Positive values (1 to 30) indicate a rebate, negative values (-1 to -30) indicate an access fee, and 0 indicates no rebate or access fee.
     */
    private final QapField qap = new QapField();

    /**
     * Quote timestamp in milliseconds from UTC epoch.
     */
    private final QuoteTimeMilliField quoteTimeMilli = new QuoteTimeMilliField();

    /**
     * Numeric value (0–64,999) assigned by the quote owner (FIX Tag 9670), used for correlation purposes.
     */
    private final QuoteReferenceIdField quoteReferenceId = new QuoteReferenceIdField();

    /**
     * Extended Quote Information
     */
    private final ExtendedQuoteFlagsField extendedQuoteFlags = new ExtendedQuoteFlagsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(channelSeqNum, quoteId, quoteFlags, price, size, qap, quoteTimeMilli, quoteReferenceId, extendedQuoteFlags);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Monotonically increasing message sequence number at the channel level.
     *
     * @return the ChannelSeqNum field
     */
    public ChannelSeqNumField channelSeqNum() {
        return channelSeqNum;
    }

    /**
     * Unique Quote ID.
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
    }

    /**
     * Quote Information
     *
     * @return the QuoteFlags field
     */
    public QuoteFlagsField quoteFlags() {
        return quoteFlags;
    }

    /**
     * Price with 6 decimal places assumed.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Number of shares.
     *
     * @return the Size field
     */
    public SizeField size() {
        return size;
    }

    /**
     * Specifies the access fee or rebate for the bid/offer. Positive values (1 to 30) indicate a rebate, negative values (-1 to -30) indicate an access fee, and 0 indicates no rebate or access fee.
     *
     * @return the Qap field
     */
    public QapField qap() {
        return qap;
    }

    /**
     * Quote timestamp in milliseconds from UTC epoch.
     *
     * @return the QuoteTimeMilli field
     */
    public QuoteTimeMilliField quoteTimeMilli() {
        return quoteTimeMilli;
    }

    /**
     * Numeric value (0–64,999) assigned by the quote owner (FIX Tag 9670), used for correlation purposes.
     *
     * @return the QuoteReferenceId field
     */
    public QuoteReferenceIdField quoteReferenceId() {
        return quoteReferenceId;
    }

    /**
     * Extended Quote Information
     *
     * @return the ExtendedQuoteFlags field
     */
    public ExtendedQuoteFlagsField extendedQuoteFlags() {
        return extendedQuoteFlags;
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
        if (!channelSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += ChannelSeqNumField.BYTE_LENGTH;
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!quoteFlags.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteFlagsField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!size.parse(data, cursor)) {
            return false;
        }
        cursor += SizeField.BYTE_LENGTH;
        if (!qap.parse(data, cursor)) {
            return false;
        }
        cursor += QapField.BYTE_LENGTH;
        if (!quoteTimeMilli.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteTimeMilliField.BYTE_LENGTH;
        if (!quoteReferenceId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteReferenceIdField.BYTE_LENGTH;
        return extendedQuoteFlags.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = channelSeqNum.encode(data, cursor);
        cursor = quoteId.encode(data, cursor);
        cursor = quoteFlags.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = size.encode(data, cursor);
        cursor = qap.encode(data, cursor);
        cursor = quoteTimeMilli.encode(data, cursor);
        cursor = quoteReferenceId.encode(data, cursor);
        cursor = extendedQuoteFlags.encode(data, cursor);
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
            case "ChannelSeqNum" -> Optional.of(channelSeqNum);
            case "QuoteId" -> Optional.of(quoteId);
            case "QuoteFlags" -> Optional.of(quoteFlags);
            case "Price" -> Optional.of(price);
            case "Size" -> Optional.of(size);
            case "Qap" -> Optional.of(qap);
            case "QuoteTimeMilli" -> Optional.of(quoteTimeMilli);
            case "QuoteReferenceId" -> Optional.of(quoteReferenceId);
            case "ExtendedQuoteFlags" -> Optional.of(extendedQuoteFlags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteUpdateMessage message)) {
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
        if (!(other instanceof QuoteUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
