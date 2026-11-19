package omi.otcmarkets.linkats.multicast.link.v4_10_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.otcmarkets.linkats.multicast.link.v4_10_4.fields.ChannelSeqNumField;
import omi.otcmarkets.linkats.multicast.link.v4_10_4.fields.DeprecatedUtfField;
import omi.otcmarkets.linkats.multicast.link.v4_10_4.fields.ExtendedTradePriceField;
import omi.otcmarkets.linkats.multicast.link.v4_10_4.fields.SecurityIdField;
import omi.otcmarkets.linkats.multicast.link.v4_10_4.fields.TradeActionField;
import omi.otcmarkets.linkats.multicast.link.v4_10_4.fields.TradeFlagsField;
import omi.otcmarkets.linkats.multicast.link.v4_10_4.fields.TradeIdUnsignedIntegerField;
import omi.otcmarkets.linkats.multicast.link.v4_10_4.fields.TradeSizeUnsignedIntegerField;
import omi.otcmarkets.linkats.multicast.link.v4_10_4.fields.TradeStatusField;
import omi.otcmarkets.linkats.multicast.link.v4_10_4.fields.TradeTimeMilliField;
import omi.otcmarkets.linkats.multicast.link.v4_10_4.fields.VenueField;
import omi.otcmarkets.linkats.multicast.link.v4_10_4.types.Field;
import omi.otcmarkets.linkats.multicast.link.v4_10_4.types.Message;
import omi.otcmarkets.linkats.multicast.link.v4_10_4.types.PrintOptions;

/**
 * Represents the ExtendedTradeMessage message from the Multicast protocol.
 *
 * <p>Extended Trade Channel message. Created for every trade that occurs on OTC Markets OTC Link ATS, OTC Link ECN, and OTC Link NQB platforms. Differs from Trade in that TradeID is 8 bytes, and TradeSize and TradePrice are 8 bytes with 8 decimal places assumed for fractional shares.</p>
 */
public final class ExtendedTradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0012';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 51;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Extended Trade Message";

    /**
     * Monotonically increasing message sequence number at the channel level.
     */
    private final ChannelSeqNumField channelSeqNum = new ChannelSeqNumField();

    /**
     * Unique Trade ID.
     */
    private final TradeIdUnsignedIntegerField tradeIdUnsignedInteger = new TradeIdUnsignedIntegerField();

    /**
     * Trade action indicator.
     */
    private final TradeActionField tradeAction = new TradeActionField();

    /**
     * Trade flags. See TradeFlag definition.
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
     * Executing venue. For the Trade Channel this is always ATS.
     */
    private final VenueField venue = new VenueField();

    /**
     * Deprecated field. Spaces will be sent in message.
     */
    private final DeprecatedUtfField deprecatedUtf = new DeprecatedUtfField();

    /**
     * Trade price. Eight decimal places assumed.
     */
    private final ExtendedTradePriceField extendedTradePrice = new ExtendedTradePriceField();

    /**
     * Number of shares. Eight decimal places assumed for fractional shares.
     */
    private final TradeSizeUnsignedIntegerField tradeSizeUnsignedInteger = new TradeSizeUnsignedIntegerField();

    /**
     * Milliseconds from UTC epoch.
     */
    private final TradeTimeMilliField tradeTimeMilli = new TradeTimeMilliField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(channelSeqNum, tradeIdUnsignedInteger, tradeAction, tradeFlags, securityId, tradeStatus, venue, deprecatedUtf, extendedTradePrice, tradeSizeUnsignedInteger, tradeTimeMilli);

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
     * @return the TradeIdUnsignedInteger field
     */
    public TradeIdUnsignedIntegerField tradeIdUnsignedInteger() {
        return tradeIdUnsignedInteger;
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
     * Trade flags. See TradeFlag definition.
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
     * Executing venue. For the Trade Channel this is always ATS.
     *
     * @return the Venue field
     */
    public VenueField venue() {
        return venue;
    }

    /**
     * Deprecated field. Spaces will be sent in message.
     *
     * @return the DeprecatedUtf field
     */
    public DeprecatedUtfField deprecatedUtf() {
        return deprecatedUtf;
    }

    /**
     * Trade price. Eight decimal places assumed.
     *
     * @return the ExtendedTradePrice field
     */
    public ExtendedTradePriceField extendedTradePrice() {
        return extendedTradePrice;
    }

    /**
     * Number of shares. Eight decimal places assumed for fractional shares.
     *
     * @return the TradeSizeUnsignedInteger field
     */
    public TradeSizeUnsignedIntegerField tradeSizeUnsignedInteger() {
        return tradeSizeUnsignedInteger;
    }

    /**
     * Milliseconds from UTC epoch.
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
        if (!tradeIdUnsignedInteger.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdUnsignedIntegerField.BYTE_LENGTH;
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
        if (!venue.parse(data, cursor)) {
            return false;
        }
        cursor += VenueField.BYTE_LENGTH;
        if (!deprecatedUtf.parse(data, cursor)) {
            return false;
        }
        cursor += DeprecatedUtfField.BYTE_LENGTH;
        if (!extendedTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ExtendedTradePriceField.BYTE_LENGTH;
        if (!tradeSizeUnsignedInteger.parse(data, cursor)) {
            return false;
        }
        cursor += TradeSizeUnsignedIntegerField.BYTE_LENGTH;
        return tradeTimeMilli.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = channelSeqNum.encode(data, cursor);
        cursor = tradeIdUnsignedInteger.encode(data, cursor);
        cursor = tradeAction.encode(data, cursor);
        cursor = tradeFlags.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = tradeStatus.encode(data, cursor);
        cursor = venue.encode(data, cursor);
        cursor = deprecatedUtf.encode(data, cursor);
        cursor = extendedTradePrice.encode(data, cursor);
        cursor = tradeSizeUnsignedInteger.encode(data, cursor);
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
            case "TradeIdUnsignedInteger" -> Optional.of(tradeIdUnsignedInteger);
            case "TradeAction" -> Optional.of(tradeAction);
            case "TradeFlags" -> Optional.of(tradeFlags);
            case "SecurityId" -> Optional.of(securityId);
            case "TradeStatus" -> Optional.of(tradeStatus);
            case "Venue" -> Optional.of(venue);
            case "DeprecatedUtf" -> Optional.of(deprecatedUtf);
            case "ExtendedTradePrice" -> Optional.of(extendedTradePrice);
            case "TradeSizeUnsignedInteger" -> Optional.of(tradeSizeUnsignedInteger);
            case "TradeTimeMilli" -> Optional.of(tradeTimeMilli);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExtendedTradeMessage message)) {
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
        if (!(other instanceof ExtendedTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
