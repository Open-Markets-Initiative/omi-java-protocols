package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.groups.SidesGroupEntry;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.groups.SidesGroupList;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.GroupSizeEncoding;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.GroupEntry;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.PrintOptions;

/**
 * The SidesGroups record a message holds.
 *
 * <p>noSides Block</p>
 */
public final class SidesGroups implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 3;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "SidesGroups";

    /**
     * noSides
     */
    private final SidesGroupList sidesGroup = new SidesGroupList();

    /**
     * GroupSizeEncoding
     */
    private final GroupSizeEncoding groupSizeEncoding = new GroupSizeEncoding();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(groupSizeEncoding.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * noSides
     *
     * <p>Encode writes this list's size to the NumInGroup field.</p>
     *
     * @return the SidesGroup entries
     */
    public SidesGroupList sidesGroup() {
        return sidesGroup;
    }

    /**
     * GroupSizeEncoding
     *
     * @return the GroupSizeEncoding record
     */
    public GroupSizeEncoding groupSizeEncoding() {
        return groupSizeEncoding;
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + sidesGroup.byteLength();
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
        for (int[] run = GroupSizeEncoding.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += GroupSizeEncoding.BYTE_LENGTH;
        cursor = sidesGroup.padding(runs, cursor);
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
        if (!groupSizeEncoding.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += groupSizeEncoding.byteLength();
        if (!sidesGroup.parse(data, cursor, end, groupSizeEncoding.numInGroup().value(), groupSizeEncoding.blockLength().value())) {
            return false;
        }
        cursor += sidesGroup.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (sidesGroup.size() > 255) {
            throw new IllegalStateException("sidesGroup holds " + sidesGroup.size() + " entries, more than its count field can state");
        }
        groupSizeEncoding.numInGroup().value((short) sidesGroup.size());
        groupSizeEncoding.blockLength().value(sidesGroup.block());
        int cursor = offset;
        cursor = groupSizeEncoding.encode(data, cursor);
        cursor = sidesGroup.encode(data, cursor);
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
        groupSizeEncoding.clear();
        sidesGroup.clear();
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
            if (field != groupSizeEncoding.numInGroup() && field != groupSizeEncoding.blockLength() && !field.isRecognized()) {
                return false;
            }
        }
        if (!sidesGroup.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != groupSizeEncoding.numInGroup() && field != groupSizeEncoding.blockLength() && !field.isValid()) {
                return false;
            }
        }
        if (!sidesGroup.isValid()) {
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
        if (!groupSizeEncoding.isDecoded()) {
            return groupSizeEncoding.failedAt();
        }
        if (!sidesGroup.isDecoded()) {
            return Optional.of(sidesGroup.failedEntry().flatMap(SidesGroupEntry::failedAt).orElse(groupSizeEncoding.numInGroup()));
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
        if (!(other instanceof SidesGroups message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(sidesGroup.diffFields(message.sidesGroup));
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
            sidesGroup.toFormattedString(builder, options);
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
        sidesGroup.toFormattedString(builder, nested);
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
        if (!(other instanceof SidesGroups message)) {
            return false;
        }
        return fields.equals(message.fields) && sidesGroup.equals(message.sidesGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, sidesGroup);
    }
}
