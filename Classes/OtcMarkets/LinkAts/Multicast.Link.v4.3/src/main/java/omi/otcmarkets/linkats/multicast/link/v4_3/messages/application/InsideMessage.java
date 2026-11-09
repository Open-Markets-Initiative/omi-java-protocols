package omi.otcmarkets.linkats.multicast.link.v4_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.AskNumPricedMpField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.AskPriceField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.AskSizeField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.AskTimeMilliField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.BidNumPricedMpField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.BidPriceField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.BidSizeField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.BidTimeMilliField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.ChannelSeqNumField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.InsideActionField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.InsideIdField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.QuoteFlagsField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SecurityIdField;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.Field;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.Message;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.PrintOptions;

/**
 * Represents the InsideMessage message from the Multicast protocol.
 *
 * <p>This message is sent on the Quote Inside Channel and the Quote Inside with Global OTC data channel.</p>
 */
public final class InsideMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0003';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 56;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Inside Message";

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
     * Unique Inside ID.
     */
    private final InsideIdField insideId = new InsideIdField();

    /**
     * Inside action indicator.
     */
    private final InsideActionField insideAction = new InsideActionField();

    /**
     * Quote Information
     */
    private final QuoteFlagsField quoteFlags = new QuoteFlagsField();

    /**
     * Unique security ID issued by OTC Markets.
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Ask price, with 6 decimal places assumed.
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * Number of shares on the ask.
     */
    private final AskSizeField askSize = new AskSizeField();

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
     * Bid timestamp in milliseconds from UTC epoch.
     */
    private final BidTimeMilliField bidTimeMilli = new BidTimeMilliField();

    /**
     * Number of market participants at the inside ask price level.
     */
    private final AskNumPricedMpField askNumPricedMp = new AskNumPricedMpField();

    /**
     * Number of market participants at the inside bid price level.
     */
    private final BidNumPricedMpField bidNumPricedMp = new BidNumPricedMpField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(channelSeqNum, insideId, insideAction, quoteFlags, securityId, askPrice, askSize, askTimeMilli, bidPrice, bidSize, bidTimeMilli, askNumPricedMp, bidNumPricedMp);

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
     * Unique Inside ID.
     *
     * @return the InsideId field
     */
    public InsideIdField insideId() {
        return insideId;
    }

    /**
     * Inside action indicator.
     *
     * @return the InsideAction field
     */
    public InsideActionField insideAction() {
        return insideAction;
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
     * Bid timestamp in milliseconds from UTC epoch.
     *
     * @return the BidTimeMilli field
     */
    public BidTimeMilliField bidTimeMilli() {
        return bidTimeMilli;
    }

    /**
     * Number of market participants at the inside ask price level.
     *
     * @return the AskNumPricedMp field
     */
    public AskNumPricedMpField askNumPricedMp() {
        return askNumPricedMp;
    }

    /**
     * Number of market participants at the inside bid price level.
     *
     * @return the BidNumPricedMp field
     */
    public BidNumPricedMpField bidNumPricedMp() {
        return bidNumPricedMp;
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
        if (!insideId.parse(data, cursor)) {
            return false;
        }
        cursor += InsideIdField.BYTE_LENGTH;
        if (!insideAction.parse(data, cursor)) {
            return false;
        }
        cursor += InsideActionField.BYTE_LENGTH;
        if (!quoteFlags.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteFlagsField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!askPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceField.BYTE_LENGTH;
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
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
        if (!bidTimeMilli.parse(data, cursor)) {
            return false;
        }
        cursor += BidTimeMilliField.BYTE_LENGTH;
        if (!askNumPricedMp.parse(data, cursor)) {
            return false;
        }
        cursor += AskNumPricedMpField.BYTE_LENGTH;
        if (!bidNumPricedMp.parse(data, cursor)) {
            return false;
        }
        cursor += BidNumPricedMpField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = channelSeqNum.encode(data, cursor);
        cursor = insideId.encode(data, cursor);
        cursor = insideAction.encode(data, cursor);
        cursor = quoteFlags.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = askTimeMilli.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = bidTimeMilli.encode(data, cursor);
        cursor = askNumPricedMp.encode(data, cursor);
        cursor = bidNumPricedMp.encode(data, cursor);
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
            case "InsideId" -> Optional.of(insideId);
            case "InsideAction" -> Optional.of(insideAction);
            case "QuoteFlags" -> Optional.of(quoteFlags);
            case "SecurityId" -> Optional.of(securityId);
            case "AskPrice" -> Optional.of(askPrice);
            case "AskSize" -> Optional.of(askSize);
            case "AskTimeMilli" -> Optional.of(askTimeMilli);
            case "BidPrice" -> Optional.of(bidPrice);
            case "BidSize" -> Optional.of(bidSize);
            case "BidTimeMilli" -> Optional.of(bidTimeMilli);
            case "AskNumPricedMp" -> Optional.of(askNumPricedMp);
            case "BidNumPricedMp" -> Optional.of(bidNumPricedMp);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof InsideMessage message)) {
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
        if (!(other instanceof InsideMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
