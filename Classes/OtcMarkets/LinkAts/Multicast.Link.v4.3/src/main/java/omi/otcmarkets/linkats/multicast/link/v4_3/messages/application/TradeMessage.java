package omi.otcmarkets.linkats.multicast.link.v4_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.ChannelSeqNumField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.DeprecatedField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SecurityIdField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.TradeActionField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.TradeFlagsField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.TradeIdField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.TradePriceField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.TradeSizeField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.TradeStatusField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.TradeTimeMilliField;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.Field;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.Message;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.PrintOptions;

/**
 * Represents the TradeMessage message from the Multicast protocol.
 *
 * <p>A Trade Message is created for every trade that occurs on OTC Markets OTC Link ATS.</p>
 */
public final class TradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0011';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 43;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Message";

    /**
     * Monotonically increasing message sequence number at the channel level.
     */
    private final ChannelSeqNumField channelSeqNum = new ChannelSeqNumField();

    /**
     * Unique Trade ID.
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Trade action indicator.
     */
    private final TradeActionField tradeAction = new TradeActionField();

    /**
     * Trade flags bitmap.
     */
    private final TradeFlagsField tradeFlags = new TradeFlagsField();

    /**
     * Unique security ID issued by OTC Markets.
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Trade Status Information
     */
    private final TradeStatusField tradeStatus = new TradeStatusField();

    /**
     * Deprecated field. Spaces will be sent in the message.
     */
    private final DeprecatedField deprecated = new DeprecatedField();

    /**
     * Trade price with 6 decimal places assumed.
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * Number of shares traded.
     */
    private final TradeSizeField tradeSize = new TradeSizeField();

    /**
     * Trade timestamp in milliseconds from UTC epoch.
     */
    private final TradeTimeMilliField tradeTimeMilli = new TradeTimeMilliField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(channelSeqNum, tradeId, tradeAction, tradeFlags, securityId, tradeStatus, deprecated, tradePrice, tradeSize, tradeTimeMilli);

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
     * Unique Trade ID.
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Trade action indicator.
     *
     * @return the TradeAction field
     */
    public TradeActionField tradeAction() {
        return tradeAction;
    }

    /**
     * Trade flags bitmap.
     *
     * @return the TradeFlags field
     */
    public TradeFlagsField tradeFlags() {
        return tradeFlags;
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
     * Trade Status Information
     *
     * @return the TradeStatus field
     */
    public TradeStatusField tradeStatus() {
        return tradeStatus;
    }

    /**
     * Deprecated field. Spaces will be sent in the message.
     *
     * @return the Deprecated field
     */
    public DeprecatedField deprecated() {
        return deprecated;
    }

    /**
     * Trade price with 6 decimal places assumed.
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * Number of shares traded.
     *
     * @return the TradeSize field
     */
    public TradeSizeField tradeSize() {
        return tradeSize;
    }

    /**
     * Trade timestamp in milliseconds from UTC epoch.
     *
     * @return the TradeTimeMilli field
     */
    public TradeTimeMilliField tradeTimeMilli() {
        return tradeTimeMilli;
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
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!tradeAction.parse(data, cursor)) {
            return false;
        }
        cursor += TradeActionField.BYTE_LENGTH;
        if (!tradeFlags.parse(data, cursor)) {
            return false;
        }
        cursor += TradeFlagsField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!tradeStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradeStatusField.BYTE_LENGTH;
        if (!deprecated.parse(data, cursor)) {
            return false;
        }
        cursor += DeprecatedField.BYTE_LENGTH;
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!tradeSize.parse(data, cursor)) {
            return false;
        }
        cursor += TradeSizeField.BYTE_LENGTH;
        return tradeTimeMilli.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = channelSeqNum.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = tradeAction.encode(data, cursor);
        cursor = tradeFlags.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = tradeStatus.encode(data, cursor);
        cursor = deprecated.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = tradeSize.encode(data, cursor);
        cursor = tradeTimeMilli.encode(data, cursor);
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
            case "TradeId" -> Optional.of(tradeId);
            case "TradeAction" -> Optional.of(tradeAction);
            case "TradeFlags" -> Optional.of(tradeFlags);
            case "SecurityId" -> Optional.of(securityId);
            case "TradeStatus" -> Optional.of(tradeStatus);
            case "Deprecated" -> Optional.of(deprecated);
            case "TradePrice" -> Optional.of(tradePrice);
            case "TradeSize" -> Optional.of(tradeSize);
            case "TradeTimeMilli" -> Optional.of(tradeTimeMilli);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeMessage message)) {
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
        if (!(other instanceof TradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
