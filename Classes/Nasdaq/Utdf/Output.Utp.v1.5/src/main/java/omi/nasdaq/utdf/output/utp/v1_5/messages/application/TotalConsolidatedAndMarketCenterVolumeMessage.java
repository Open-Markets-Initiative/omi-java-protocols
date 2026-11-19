package omi.nasdaq.utdf.output.utp.v1_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nasdaq.utdf.output.utp.v1_5.fields.NumberOfMarketCenterVolumesField;
import omi.nasdaq.utdf.output.utp.v1_5.fields.TotalConsolidatedVolumeField;
import omi.nasdaq.utdf.output.utp.v1_5.groups.MarketCenterVolumeAttachmentEntry;
import omi.nasdaq.utdf.output.utp.v1_5.groups.MarketCenterVolumeAttachmentList;
import omi.nasdaq.utdf.output.utp.v1_5.structs.MessageInfo;
import omi.nasdaq.utdf.output.utp.v1_5.types.Field;
import omi.nasdaq.utdf.output.utp.v1_5.types.Message;
import omi.nasdaq.utdf.output.utp.v1_5.types.PrintOptions;

/**
 * Represents the TotalConsolidatedAndMarketCenterVolumeMessage message from the Output protocol.
 *
 * <p>The Total Consolidated Market Center Volume message will be used to relay intraday values for the current total cumulative consolidated share volume and each active market center current cumulative volume activity as reported by all UTP participants in all NASDAQ issues</p>
 */
public final class TotalConsolidatedAndMarketCenterVolumeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'M';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 36;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Total Consolidated And Market Center Volume Message";

    /**
     * Total Consolidated Volume
     */
    private final TotalConsolidatedVolumeField totalConsolidatedVolume = new TotalConsolidatedVolumeField();

    /**
     * Number of Market Center Volumes
     */
    private final NumberOfMarketCenterVolumesField numberOfMarketCenterVolumes = new NumberOfMarketCenterVolumesField();

    /**
     * Market Center Volume Attachment
     */
    private final MarketCenterVolumeAttachmentList marketCenterVolumeAttachment = new MarketCenterVolumeAttachmentList();

    /**
     * Message Info
     */
    private final MessageInfo messageInfo = new MessageInfo();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(messageInfo.fields(), List.<Field>of(totalConsolidatedVolume), List.<Field>of(numberOfMarketCenterVolumes)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Total Consolidated Volume
     *
     * @return the TotalConsolidatedVolume field
     */
    public TotalConsolidatedVolumeField totalConsolidatedVolume() {
        return totalConsolidatedVolume;
    }

    /**
     * Number of Market Center Volumes
     *
     * @return the NumberOfMarketCenterVolumes field
     */
    public NumberOfMarketCenterVolumesField numberOfMarketCenterVolumes() {
        return numberOfMarketCenterVolumes;
    }

    /**
     * Market Center Volume Attachment
     *
     * <p>Encode writes this list's size to the NumberOfMarketCenterVolumes field.</p>
     *
     * @return the MarketCenterVolumeAttachment entries
     */
    public MarketCenterVolumeAttachmentList marketCenterVolumeAttachment() {
        return marketCenterVolumeAttachment;
    }

    /**
     * Message Info
     *
     * @return the MessageInfo record
     */
    public MessageInfo messageInfo() {
        return messageInfo;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + marketCenterVolumeAttachment.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(messageInfo.sipTimestamp().value());
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!messageInfo.parseFrom(data, cursor, end - 10)) {
            return false;
        }
        cursor += messageInfo.byteLength();
        if (!totalConsolidatedVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalConsolidatedVolumeField.BYTE_LENGTH;
        if (!numberOfMarketCenterVolumes.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfMarketCenterVolumesField.BYTE_LENGTH;
        if (!marketCenterVolumeAttachment.parse(data, cursor, end, numberOfMarketCenterVolumes.value())) {
            return false;
        }
        cursor += marketCenterVolumeAttachment.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (marketCenterVolumeAttachment.size() > 65535) {
            throw new IllegalStateException("marketCenterVolumeAttachment holds " + marketCenterVolumeAttachment.size() + " entries, more than its count field can state");
        }
        numberOfMarketCenterVolumes.value(marketCenterVolumeAttachment.size());
        int cursor = offset;
        cursor = messageInfo.encode(data, cursor);
        cursor = totalConsolidatedVolume.encode(data, cursor);
        cursor = numberOfMarketCenterVolumes.encode(data, cursor);
        cursor = marketCenterVolumeAttachment.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        messageInfo.clear();
        marketCenterVolumeAttachment.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfMarketCenterVolumes && !field.isRecognized()) {
                return false;
            }
        }
        return marketCenterVolumeAttachment.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfMarketCenterVolumes && !field.isValid()) {
                return false;
            }
        }
        if (!marketCenterVolumeAttachment.isValid()) {
            return false;
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
        if (!messageInfo.isDecoded()) {
            return messageInfo.failedAt();
        }
        if (!totalConsolidatedVolume.isDecoded()) {
            return Optional.of(totalConsolidatedVolume);
        }
        if (!numberOfMarketCenterVolumes.isDecoded()) {
            return Optional.of(numberOfMarketCenterVolumes);
        }
        if (!marketCenterVolumeAttachment.isDecoded()) {
            return Optional.of(marketCenterVolumeAttachment.failedEntry().flatMap(MarketCenterVolumeAttachmentEntry::failedAt).orElse(numberOfMarketCenterVolumes));
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
            case "TotalConsolidatedVolume" -> Optional.of(totalConsolidatedVolume);
            case "NumberOfMarketCenterVolumes" -> Optional.of(numberOfMarketCenterVolumes);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TotalConsolidatedAndMarketCenterVolumeMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(marketCenterVolumeAttachment.diffFields(message.marketCenterVolumeAttachment));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            marketCenterVolumeAttachment.toFormattedString(builder, options);
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
        marketCenterVolumeAttachment.toFormattedString(builder, nested);
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
        if (!(other instanceof TotalConsolidatedAndMarketCenterVolumeMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && marketCenterVolumeAttachment.equals(message.marketCenterVolumeAttachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, marketCenterVolumeAttachment);
    }
}
