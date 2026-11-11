package omi.cme.globex.mdp3.sbe.v1_12.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.cme.globex.mdp3.sbe.v1_12.groups.IncrementalRefreshTradeSummaryLongOrderIdGroupEntry;
import omi.cme.globex.mdp3.sbe.v1_12.groups.IncrementalRefreshTradeSummaryLongOrderIdGroupList;
import omi.cme.globex.mdp3.sbe.v1_12.structs.GroupSize8Byte;
import omi.cme.globex.mdp3.sbe.v1_12.types.Field;
import omi.cme.globex.mdp3.sbe.v1_12.types.GroupEntry;
import omi.cme.globex.mdp3.sbe.v1_12.types.PrintOptions;

/**
 * The IncrementalRefreshTradeSummaryLongOrderIdGroups record a message holds.
 *
 * <p>NoOrderIDEntries Block</p>
 */
public final class IncrementalRefreshTradeSummaryLongOrderIdGroups implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 8;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "IncrementalRefreshTradeSummaryLongOrderIdGroups";

    /**
     * Number of OrderID and LastQty entries in Trade Summary message
     */
    private final IncrementalRefreshTradeSummaryLongOrderIdGroupList incrementalRefreshTradeSummaryLongOrderIdGroup = new IncrementalRefreshTradeSummaryLongOrderIdGroupList();

    /**
     * 8 Byte aligned repeating group dimensions
     */
    private final GroupSize8Byte groupSize8Byte = new GroupSize8Byte();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(groupSize8Byte.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Number of OrderID and LastQty entries in Trade Summary message
     *
     * <p>Encode writes this list's size to the NumInGroup field.</p>
     *
     * @return the IncrementalRefreshTradeSummaryLongOrderIdGroup entries
     */
    public IncrementalRefreshTradeSummaryLongOrderIdGroupList incrementalRefreshTradeSummaryLongOrderIdGroup() {
        return incrementalRefreshTradeSummaryLongOrderIdGroup;
    }

    /**
     * 8 Byte aligned repeating group dimensions
     *
     * @return the GroupSize8Byte record
     */
    public GroupSize8Byte groupSize8Byte() {
        return groupSize8Byte;
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + incrementalRefreshTradeSummaryLongOrderIdGroup.byteLength();
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
        for (int[] run = GroupSize8Byte.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += GroupSize8Byte.BYTE_LENGTH;
        cursor = incrementalRefreshTradeSummaryLongOrderIdGroup.padding(runs, cursor);
        return cursor;
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
        if (!groupSize8Byte.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += groupSize8Byte.byteLength();
        if (!incrementalRefreshTradeSummaryLongOrderIdGroup.parse(data, cursor, end, groupSize8Byte.numInGroup().value(), groupSize8Byte.blockLength().value())) {
            return false;
        }
        cursor += incrementalRefreshTradeSummaryLongOrderIdGroup.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (incrementalRefreshTradeSummaryLongOrderIdGroup.size() > 255) {
            throw new IllegalStateException("incrementalRefreshTradeSummaryLongOrderIdGroup holds " + incrementalRefreshTradeSummaryLongOrderIdGroup.size() + " entries, more than its count field can state");
        }
        groupSize8Byte.numInGroup().value((short) incrementalRefreshTradeSummaryLongOrderIdGroup.size());
        groupSize8Byte.blockLength().value(incrementalRefreshTradeSummaryLongOrderIdGroup.block());
        int cursor = offset;
        cursor = groupSize8Byte.encode(data, cursor);
        cursor = incrementalRefreshTradeSummaryLongOrderIdGroup.encode(data, cursor);
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
        groupSize8Byte.clear();
        incrementalRefreshTradeSummaryLongOrderIdGroup.clear();
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
            if (field != groupSize8Byte.numInGroup() && field != groupSize8Byte.blockLength() && !field.isRecognized()) {
                return false;
            }
        }
        return incrementalRefreshTradeSummaryLongOrderIdGroup.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != groupSize8Byte.numInGroup() && field != groupSize8Byte.blockLength() && !field.isValid()) {
                return false;
            }
        }
        if (!incrementalRefreshTradeSummaryLongOrderIdGroup.isValid()) {
            return false;
        }
        return isRecognized();
    }

    /**
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
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
        if (!groupSize8Byte.isDecoded()) {
            return groupSize8Byte.failedAt();
        }
        if (!incrementalRefreshTradeSummaryLongOrderIdGroup.isDecoded()) {
            return Optional.of(incrementalRefreshTradeSummaryLongOrderIdGroup.failedEntry().flatMap(IncrementalRefreshTradeSummaryLongOrderIdGroupEntry::failedAt).orElse(groupSize8Byte.numInGroup()));
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return Optional.empty();
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof IncrementalRefreshTradeSummaryLongOrderIdGroups message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(incrementalRefreshTradeSummaryLongOrderIdGroup.diffFields(message.incrementalRefreshTradeSummaryLongOrderIdGroup));
        return changed;
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    /**
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            incrementalRefreshTradeSummaryLongOrderIdGroup.toFormattedString(builder, options);
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
        incrementalRefreshTradeSummaryLongOrderIdGroup.toFormattedString(builder, nested);
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
        if (!(other instanceof IncrementalRefreshTradeSummaryLongOrderIdGroups message)) {
            return false;
        }
        return fields.equals(message.fields) && incrementalRefreshTradeSummaryLongOrderIdGroup.equals(message.incrementalRefreshTradeSummaryLongOrderIdGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, incrementalRefreshTradeSummaryLongOrderIdGroup);
    }
}
