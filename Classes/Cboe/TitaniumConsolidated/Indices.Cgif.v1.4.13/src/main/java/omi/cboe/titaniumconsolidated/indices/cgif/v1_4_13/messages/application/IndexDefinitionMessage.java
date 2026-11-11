package omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.fields.AgentClassificationField;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.fields.CurrentRecordNumberField;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.fields.DescriptionLengthField;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.fields.NoChannelsField;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.fields.StatusField;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.fields.TotalNumberOfRecordsField;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.groups.ChannelsEntry;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.groups.ChannelsList;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.structs.Date;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.structs.Symbol;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.types.Field;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.types.Message;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.types.PrintOptions;
import omi.cboe.titaniumconsolidated.indices.cgif.v1_4_13.types.SizedField;

/**
 * Represents the IndexDefinitionMessage message from the Indices protocol.
 *
 * <p>Index Definition message published for every index within each cycle. Contains index information including current status, channel name, current trading date, data source, and description. Published on the Cboe Global Indices Definition Feed (CGIDF).</p>
 */
public final class IndexDefinitionMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 25;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Index Definition Message";

    /**
     * Clients should begin capturing data beginning at 1.
     */
    private final CurrentRecordNumberField currentRecordNumber = new CurrentRecordNumberField();

    /**
     * Total number of updates within loop.
     */
    private final TotalNumberOfRecordsField totalNumberOfRecords = new TotalNumberOfRecordsField();

    /**
     * Length in bytes of the Description that follows.
     */
    private final DescriptionLengthField descriptionLength = new DescriptionLengthField();

    /**
     * Description of the index. Variable length.
     */
    private final SizedField description = new SizedField("Description", true);

    /**
     * Status of index. 1 = Active (loaded and a business day), 2 = Inactive (loaded and not a business day), 3 = Deleted (no longer distributed; removed from the feed after 30 days).
     */
    private final StatusField status = new StatusField();

    /**
     * Originating source of the index. blank = Not Specified, CO = Cboe, CC = Cboe Custom, MS = Morningstar, TP = Third-party, MC = Morningstar Customer.
     */
    private final AgentClassificationField agentClassification = new AgentClassificationField();

    /**
     * Number of Channels in this message.
     */
    private final NoChannelsField noChannels = new NoChannelsField();

    /**
     * One entry in a repeating Channels group. Repeats NoChannels times within the containing message.
     */
    private final ChannelsList channels = new ChannelsList();

    /**
     * Symbol
     */
    private final Symbol symbol = new Symbol();

    /**
     * Date
     */
    private final Date date = new Date();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(currentRecordNumber), List.<Field>of(totalNumberOfRecords), symbol.fields(), List.<Field>of(descriptionLength), List.<Field>of(description), date.fields(), List.<Field>of(status), List.<Field>of(agentClassification), List.<Field>of(noChannels)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Clients should begin capturing data beginning at 1.
     *
     * @return the CurrentRecordNumber field
     */
    public CurrentRecordNumberField currentRecordNumber() {
        return currentRecordNumber;
    }

    /**
     * Total number of updates within loop.
     *
     * @return the TotalNumberOfRecords field
     */
    public TotalNumberOfRecordsField totalNumberOfRecords() {
        return totalNumberOfRecords;
    }

    /**
     * Length in bytes of the Description that follows.
     *
     * @return the DescriptionLength field
     */
    public DescriptionLengthField descriptionLength() {
        return descriptionLength;
    }

    /**
     * Description of the index. Variable length.
     *
     * @return the Description field
     */
    public SizedField description() {
        return description;
    }

    /**
     * Status of index. 1 = Active (loaded and a business day), 2 = Inactive (loaded and not a business day), 3 = Deleted (no longer distributed; removed from the feed after 30 days).
     *
     * @return the Status field
     */
    public StatusField status() {
        return status;
    }

    /**
     * Originating source of the index. blank = Not Specified, CO = Cboe, CC = Cboe Custom, MS = Morningstar, TP = Third-party, MC = Morningstar Customer.
     *
     * @return the AgentClassification field
     */
    public AgentClassificationField agentClassification() {
        return agentClassification;
    }

    /**
     * Number of Channels in this message.
     *
     * @return the NoChannels field
     */
    public NoChannelsField noChannels() {
        return noChannels;
    }

    /**
     * One entry in a repeating Channels group. Repeats NoChannels times within the containing message.
     *
     * <p>Encode writes this list's size to the NoChannels field.</p>
     *
     * @return the Channels entries
     */
    public ChannelsList channels() {
        return channels;
    }

    /**
     * Symbol
     *
     * @return the Symbol record
     */
    public Symbol symbol() {
        return symbol;
    }

    /**
     * Date
     *
     * @return the Date record
     */
    public Date date() {
        return date;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + symbol.byteLength() - Symbol.MINIMUM_BYTE_LENGTH + description.byteLength() + channels.byteLength();
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!currentRecordNumber.parse(data, cursor)) {
            return false;
        }
        cursor += CurrentRecordNumberField.BYTE_LENGTH;
        if (!totalNumberOfRecords.parse(data, cursor)) {
            return false;
        }
        cursor += TotalNumberOfRecordsField.BYTE_LENGTH;
        if (!symbol.parseFrom(data, cursor, end - 16)) {
            return false;
        }
        cursor += symbol.byteLength();
        if (end - cursor < 16) {
            return false;
        }
        if (!descriptionLength.parse(data, cursor)) {
            return false;
        }
        cursor += DescriptionLengthField.BYTE_LENGTH;
        if (!description.parse(data, cursor, descriptionLength.value(), end - 15)) {
            return false;
        }
        cursor += description.byteLength();
        if (end - cursor < 15) {
            return false;
        }
        if (!date.parseFrom(data, cursor, end - 4)) {
            return false;
        }
        cursor += date.byteLength();
        if (!status.parse(data, cursor)) {
            return false;
        }
        cursor += StatusField.BYTE_LENGTH;
        if (!agentClassification.parse(data, cursor)) {
            return false;
        }
        cursor += AgentClassificationField.BYTE_LENGTH;
        if (!noChannels.parse(data, cursor)) {
            return false;
        }
        cursor += NoChannelsField.BYTE_LENGTH;
        if (!channels.parse(data, cursor, end, noChannels.value())) {
            return false;
        }
        cursor += channels.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (channels.size() > 255) {
            throw new IllegalStateException("channels holds " + channels.size() + " entries, more than its count field can state");
        }
        noChannels.value((short) channels.size());
        if (description.byteLength() > 255) {
            throw new IllegalStateException("description holds " + description.byteLength() + " bytes, more than its length field can state");
        }
        descriptionLength.value((short) (description.byteLength()));
        int cursor = offset;
        cursor = currentRecordNumber.encode(data, cursor);
        cursor = totalNumberOfRecords.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = descriptionLength.encode(data, cursor);
        cursor = description.encode(data, cursor);
        cursor = date.encode(data, cursor);
        cursor = status.encode(data, cursor);
        cursor = agentClassification.encode(data, cursor);
        cursor = noChannels.encode(data, cursor);
        cursor = channels.encode(data, cursor);
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
        symbol.clear();
        date.clear();
        channels.clear();
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
            if (field != symbol.symbolLength() && field != descriptionLength && field != noChannels && !field.isRecognized()) {
                return false;
            }
        }
        return channels.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != symbol.symbolLength() && field != descriptionLength && field != noChannels && !field.isValid()) {
                return false;
            }
        }
        if (!channels.isValid()) {
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
        if (!currentRecordNumber.isDecoded()) {
            return Optional.of(currentRecordNumber);
        }
        if (!totalNumberOfRecords.isDecoded()) {
            return Optional.of(totalNumberOfRecords);
        }
        if (!symbol.isDecoded()) {
            return symbol.failedAt();
        }
        if (!descriptionLength.isDecoded()) {
            return Optional.of(descriptionLength);
        }
        if (!date.isDecoded()) {
            return date.failedAt();
        }
        if (!status.isDecoded()) {
            return Optional.of(status);
        }
        if (!agentClassification.isDecoded()) {
            return Optional.of(agentClassification);
        }
        if (!noChannels.isDecoded()) {
            return Optional.of(noChannels);
        }
        if (!channels.isDecoded()) {
            return Optional.of(channels.failedEntry().flatMap(ChannelsEntry::failedAt).orElse(noChannels));
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
            case "CurrentRecordNumber" -> Optional.of(currentRecordNumber);
            case "TotalNumberOfRecords" -> Optional.of(totalNumberOfRecords);
            case "DescriptionLength" -> Optional.of(descriptionLength);
            case "Description" -> Optional.of(description);
            case "Status" -> Optional.of(status);
            case "AgentClassification" -> Optional.of(agentClassification);
            case "NoChannels" -> Optional.of(noChannels);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof IndexDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(channels.diffFields(message.channels));
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
            channels.toFormattedString(builder, options);
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
        channels.toFormattedString(builder, nested);
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
        if (!(other instanceof IndexDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && channels.equals(message.channels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, channels);
    }
}
