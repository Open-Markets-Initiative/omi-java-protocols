package omi.eurex.t7.edci.fbe.v14_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.edci.fbe.v14_0.fields.NoPartitionsField;
import omi.eurex.t7.edci.fbe.v14_0.groups.PartitionGrpCompEntry;
import omi.eurex.t7.edci.fbe.v14_0.groups.PartitionGrpCompList;
import omi.eurex.t7.edci.fbe.v14_0.structs.NotifHeaderComp;
import omi.eurex.t7.edci.fbe.v14_0.types.Field;
import omi.eurex.t7.edci.fbe.v14_0.types.Message;
import omi.eurex.t7.edci.fbe.v14_0.types.PrintOptions;

/**
 * Represents the PartitionListNotification message from the Edci protocol.
 */
public final class PartitionListNotification implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 18;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Partition List Notification";

    /**
     * No Partitions
     */
    private final NoPartitionsField noPartitions = new NoPartitionsField();

    /**
     * Partition Grp Comp
     */
    private final PartitionGrpCompList partitionGrpComp = new PartitionGrpCompList();

    /**
     * Notif Header Comp
     */
    private final NotifHeaderComp notifHeaderComp = new NotifHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(notifHeaderComp.fields(), List.<Field>of(noPartitions)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * No Partitions
     *
     * @return the NoPartitions field
     */
    public NoPartitionsField noPartitions() {
        return noPartitions;
    }

    /**
     * Partition Grp Comp
     *
     * <p>Encode writes this list's size to the NoPartitions field.</p>
     *
     * @return the PartitionGrpComp entries
     */
    public PartitionGrpCompList partitionGrpComp() {
        return partitionGrpComp;
    }

    /**
     * Notif Header Comp
     *
     * @return the NotifHeaderComp record
     */
    public NotifHeaderComp notifHeaderComp() {
        return notifHeaderComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + partitionGrpComp.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = NotifHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += NotifHeaderComp.BYTE_LENGTH;
        cursor += 1;
        runs.add(cursor).add(7);
        cursor += 7;
        cursor = partitionGrpComp.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(notifHeaderComp.sendingTime().value());
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
        cursor += 2; // padding
        if (!notifHeaderComp.parseFrom(data, cursor, end - 8)) {
            return false;
        }
        cursor += notifHeaderComp.byteLength();
        if (!noPartitions.parse(data, cursor)) {
            return false;
        }
        cursor += NoPartitionsField.BYTE_LENGTH;
        cursor += 7; // padding
        if (!partitionGrpComp.parse(data, cursor, end, noPartitions.value())) {
            return false;
        }
        cursor += partitionGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (partitionGrpComp.size() > 255) {
            throw new IllegalStateException("partitionGrpComp holds " + partitionGrpComp.size() + " entries, more than its count field can state");
        }
        noPartitions.value((short) partitionGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = notifHeaderComp.encode(data, cursor);
        cursor = noPartitions.encode(data, cursor);
        if (buffer != null && buffer.length >= 18) {
            System.arraycopy(buffer, 11, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
        cursor = partitionGrpComp.encode(data, cursor);
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
        notifHeaderComp.clear();
        partitionGrpComp.clear();
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
            if (field != noPartitions && !field.isRecognized()) {
                return false;
            }
        }
        return partitionGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noPartitions && !field.isValid()) {
                return false;
            }
        }
        if (!partitionGrpComp.isValid()) {
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
        if (!notifHeaderComp.isDecoded()) {
            return notifHeaderComp.failedAt();
        }
        if (!noPartitions.isDecoded()) {
            return Optional.of(noPartitions);
        }
        if (!partitionGrpComp.isDecoded()) {
            return Optional.of(partitionGrpComp.failedEntry().flatMap(PartitionGrpCompEntry::failedAt).orElse(noPartitions));
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return "NoPartitions".equals(name) ? Optional.of(noPartitions) : Optional.empty();
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PartitionListNotification message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(partitionGrpComp.diffFields(message.partitionGrpComp));
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
            partitionGrpComp.toFormattedString(builder, options);
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
        partitionGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof PartitionListNotification message)) {
            return false;
        }
        return fields.equals(message.fields) && partitionGrpComp.equals(message.partitionGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, partitionGrpComp);
    }
}
