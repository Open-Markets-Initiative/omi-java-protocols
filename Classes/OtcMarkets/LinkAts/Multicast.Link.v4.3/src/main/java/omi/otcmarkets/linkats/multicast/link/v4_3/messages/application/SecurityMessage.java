package omi.otcmarkets.linkats.multicast.link.v4_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.AssetClassField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.ChannelSeqNumField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.LastUpdateMilliField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.ReportingStatusField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SecurityActionField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SecurityFlagsField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SecurityIdField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SecurityStatusField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.SymbolField;
import omi.otcmarkets.linkats.multicast.link.v4_3.fields.TierField;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.Field;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.Message;
import omi.otcmarkets.linkats.multicast.link.v4_3.types.PrintOptions;

/**
 * Represents the SecurityMessage message from the Multicast protocol.
 *
 * <p>The Security Message is included in all the quote channels and provides basic security attribute information.</p>
 */
public final class SecurityMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\t';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 32;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Message";

    /**
     * Monotonically increasing message sequence number at the channel level.
     */
    private final ChannelSeqNumField channelSeqNum = new ChannelSeqNumField();

    /**
     * Ticker symbol. Fixed income symbols may not have a symbol. For these securities, the security ID or CUSIP (Reference Data Security Message) must be used as an identifier.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Milliseconds from UTC epoch.
     */
    private final LastUpdateMilliField lastUpdateMilli = new LastUpdateMilliField();

    /**
     * Security action indicator.
     */
    private final SecurityActionField securityAction = new SecurityActionField();

    /**
     * Asset class indicator.
     */
    private final AssetClassField assetClass = new AssetClassField();

    /**
     * Unique security ID issued by OTC Markets.
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Notes security level attributes
     */
    private final SecurityFlagsField securityFlags = new SecurityFlagsField();

    /**
     * The market tier assigned by OTC Markets Group.
     */
    private final TierField tier = new TierField();

    /**
     * Reporting status.
     */
    private final ReportingStatusField reportingStatus = new ReportingStatusField();

    /**
     * Security status.
     */
    private final SecurityStatusField securityStatus = new SecurityStatusField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(channelSeqNum, symbol, lastUpdateMilli, securityAction, assetClass, securityId, securityFlags, tier, reportingStatus, securityStatus);

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
     * Ticker symbol. Fixed income symbols may not have a symbol. For these securities, the security ID or CUSIP (Reference Data Security Message) must be used as an identifier.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Milliseconds from UTC epoch.
     *
     * @return the LastUpdateMilli field
     */
    public LastUpdateMilliField lastUpdateMilli() {
        return lastUpdateMilli;
    }

    /**
     * Security action indicator.
     *
     * @return the SecurityAction field
     */
    public SecurityActionField securityAction() {
        return securityAction;
    }

    /**
     * Asset class indicator.
     *
     * @return the AssetClass field
     */
    public AssetClassField assetClass() {
        return assetClass;
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
     * Notes security level attributes
     *
     * @return the SecurityFlags field
     */
    public SecurityFlagsField securityFlags() {
        return securityFlags;
    }

    /**
     * The market tier assigned by OTC Markets Group.
     *
     * @return the Tier field
     */
    public TierField tier() {
        return tier;
    }

    /**
     * Reporting status.
     *
     * @return the ReportingStatus field
     */
    public ReportingStatusField reportingStatus() {
        return reportingStatus;
    }

    /**
     * Security status.
     *
     * @return the SecurityStatus field
     */
    public SecurityStatusField securityStatus() {
        return securityStatus;
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
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!lastUpdateMilli.parse(data, cursor)) {
            return false;
        }
        cursor += LastUpdateMilliField.BYTE_LENGTH;
        if (!securityAction.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityActionField.BYTE_LENGTH;
        if (!assetClass.parse(data, cursor)) {
            return false;
        }
        cursor += AssetClassField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!securityFlags.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityFlagsField.BYTE_LENGTH;
        if (!tier.parse(data, cursor)) {
            return false;
        }
        cursor += TierField.BYTE_LENGTH;
        if (!reportingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += ReportingStatusField.BYTE_LENGTH;
        return securityStatus.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = channelSeqNum.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = lastUpdateMilli.encode(data, cursor);
        cursor = securityAction.encode(data, cursor);
        cursor = assetClass.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = securityFlags.encode(data, cursor);
        cursor = tier.encode(data, cursor);
        cursor = reportingStatus.encode(data, cursor);
        cursor = securityStatus.encode(data, cursor);
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
            case "Symbol" -> Optional.of(symbol);
            case "LastUpdateMilli" -> Optional.of(lastUpdateMilli);
            case "SecurityAction" -> Optional.of(securityAction);
            case "AssetClass" -> Optional.of(assetClass);
            case "SecurityId" -> Optional.of(securityId);
            case "SecurityFlags" -> Optional.of(securityFlags);
            case "Tier" -> Optional.of(tier);
            case "ReportingStatus" -> Optional.of(reportingStatus);
            case "SecurityStatus" -> Optional.of(securityStatus);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityMessage message)) {
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
        if (!(other instanceof SecurityMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
