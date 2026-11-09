package omi.otcmarkets.linkats.multicast.link.v4_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.AskPriceField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.AskQapField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.AskSizeField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.AskTimeMilliField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.BidPriceField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.BidQapField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.BidSizeField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.BidTimeMilliField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.ChannelSeqNumField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.ExtendedQuoteFlagsField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.MpidField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.QuoteActionField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.QuoteFlagsField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.QuoteIdField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.QuoteReferenceIdField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SecurityIdField;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.Field;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.Message;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.PrintOptions;

/**
 * Represents the QuoteMessage message from the Multicast protocol.
 *
 * <p>This message is sent on the Quote Book channel and the Quote Book with Global OTC data channel.</p>
 */
public final class QuoteMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0001';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 63;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Monotonically increasing message sequence number at the channel level.
     */
    private final ChannelSeqNumField channelSeqNum = new ChannelSeqNumField();

    /**
     * Unique Quote ID.
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * Quote action indicator.
     */
    private final QuoteActionField quoteAction = new QuoteActionField();

    /**
     * Quote Information
     */
    private final QuoteFlagsField quoteFlags = new QuoteFlagsField();

    /**
     * Unique security ID issued by OTC Markets.
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Market Participant ID owning the quote (always 4 characters).
     */
    private final MpidField mpid = new MpidField();

    /**
     * Ask price, with 6 decimal places assumed.
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * Number of shares on the ask.
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * Specifies the access fee or rebate for the ask. Positive values (1 to 30) indicate a rebate, negative values (-1 to -30) indicate an access fee, and 0 indicates no rebate or access fee.
     */
    private final AskQapField askQap = new AskQapField();

    /**
     * Ask timestamp in milliseconds from UTC epoch.
     */
    private final AskTimeMilliField askTimeMilli = new AskTimeMilliField();

    /**
     * Bid price, with 6 decimal places assumed.
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * Number of shares on the bid.
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Specifies the access fee or rebate for the bid. Positive values (1 to 30) indicate a rebate, negative values (-1 to -30) indicate an access fee, and 0 indicates no rebate or access fee.
     */
    private final BidQapField bidQap = new BidQapField();

    /**
     * Bid timestamp in milliseconds from UTC epoch.
     */
    private final BidTimeMilliField bidTimeMilli = new BidTimeMilliField();

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
    private final List<Field> fields = List.of(channelSeqNum, quoteId, quoteAction, quoteFlags, securityId, mpid, askPrice, askSize, askQap, askTimeMilli, bidPrice, bidSize, bidQap, bidTimeMilli, quoteReferenceId, extendedQuoteFlags);

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
     * Quote action indicator.
     *
     * @return the QuoteAction field
     */
    public QuoteActionField quoteAction() {
        return quoteAction;
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
     * Unique security ID issued by OTC Markets.
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Market Participant ID owning the quote (always 4 characters).
     *
     * @return the Mpid field
     */
    public MpidField mpid() {
        return mpid;
    }

    /**
     * Ask price, with 6 decimal places assumed.
     *
     * @return the AskPrice field
     */
    public AskPriceField askPrice() {
        return askPrice;
    }

    /**
     * Number of shares on the ask.
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
    }

    /**
     * Specifies the access fee or rebate for the ask. Positive values (1 to 30) indicate a rebate, negative values (-1 to -30) indicate an access fee, and 0 indicates no rebate or access fee.
     *
     * @return the AskQap field
     */
    public AskQapField askQap() {
        return askQap;
    }

    /**
     * Ask timestamp in milliseconds from UTC epoch.
     *
     * @return the AskTimeMilli field
     */
    public AskTimeMilliField askTimeMilli() {
        return askTimeMilli;
    }

    /**
     * Bid price, with 6 decimal places assumed.
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * Number of shares on the bid.
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * Specifies the access fee or rebate for the bid. Positive values (1 to 30) indicate a rebate, negative values (-1 to -30) indicate an access fee, and 0 indicates no rebate or access fee.
     *
     * @return the BidQap field
     */
    public BidQapField bidQap() {
        return bidQap;
    }

    /**
     * Bid timestamp in milliseconds from UTC epoch.
     *
     * @return the BidTimeMilli field
     */
    public BidTimeMilliField bidTimeMilli() {
        return bidTimeMilli;
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
        if (!channelSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += ChannelSeqNumField.BYTE_LENGTH;
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!quoteAction.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteActionField.BYTE_LENGTH;
        if (!quoteFlags.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteFlagsField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!mpid.parse(data, cursor)) {
            return false;
        }
        cursor += MpidField.BYTE_LENGTH;
        if (!askPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceField.BYTE_LENGTH;
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
        if (!askQap.parse(data, cursor)) {
            return false;
        }
        cursor += AskQapField.BYTE_LENGTH;
        if (!askTimeMilli.parse(data, cursor)) {
            return false;
        }
        cursor += AskTimeMilliField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!bidQap.parse(data, cursor)) {
            return false;
        }
        cursor += BidQapField.BYTE_LENGTH;
        if (!bidTimeMilli.parse(data, cursor)) {
            return false;
        }
        cursor += BidTimeMilliField.BYTE_LENGTH;
        if (!quoteReferenceId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteReferenceIdField.BYTE_LENGTH;
        if (!extendedQuoteFlags.parse(data, cursor)) {
            return false;
        }
        cursor += ExtendedQuoteFlagsField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = channelSeqNum.encode(data, cursor);
        cursor = quoteId.encode(data, cursor);
        cursor = quoteAction.encode(data, cursor);
        cursor = quoteFlags.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = mpid.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = askQap.encode(data, cursor);
        cursor = askTimeMilli.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = bidQap.encode(data, cursor);
        cursor = bidTimeMilli.encode(data, cursor);
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
            case "QuoteAction" -> Optional.of(quoteAction);
            case "QuoteFlags" -> Optional.of(quoteFlags);
            case "SecurityId" -> Optional.of(securityId);
            case "Mpid" -> Optional.of(mpid);
            case "AskPrice" -> Optional.of(askPrice);
            case "AskSize" -> Optional.of(askSize);
            case "AskQap" -> Optional.of(askQap);
            case "AskTimeMilli" -> Optional.of(askTimeMilli);
            case "BidPrice" -> Optional.of(bidPrice);
            case "BidSize" -> Optional.of(bidSize);
            case "BidQap" -> Optional.of(bidQap);
            case "BidTimeMilli" -> Optional.of(bidTimeMilli);
            case "QuoteReferenceId" -> Optional.of(quoteReferenceId);
            case "ExtendedQuoteFlags" -> Optional.of(extendedQuoteFlags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteMessage message)) {
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
        if (!(other instanceof QuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
