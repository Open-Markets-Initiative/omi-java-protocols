package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.groups.PurgeRequestMessageCustomGroupIdsGroupEntry;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.groups.PurgeRequestMessageCustomGroupIdsGroupList;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.structs.CustomGroupIdsGroupEncoding;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.Field;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.GroupEntry;
import omi.iex.iexoptions.binaryorderentry.sbe.v1_02.types.PrintOptions;

/**
 * The PurgeRequestMessageCustomGroupIdsGroups record a message holds.
 *
 * <p>customGroupIds Block</p>
 */
public final class PurgeRequestMessageCustomGroupIdsGroups implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 2;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "PurgeRequestMessageCustomGroupIdsGroups";

    /**
     * customGroupIds
     */
    private final PurgeRequestMessageCustomGroupIdsGroupList purgeRequestMessageCustomGroupIdsGroup = new PurgeRequestMessageCustomGroupIdsGroupList();

    /**
     * customGroupIdsGroupEncoding
     */
    private final CustomGroupIdsGroupEncoding customGroupIdsGroupEncoding = new CustomGroupIdsGroupEncoding();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(customGroupIdsGroupEncoding.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * customGroupIds
     *
     * <p>Encode writes this list's size to the NumInGroup field.</p>
     *
     * @return the PurgeRequestMessageCustomGroupIdsGroup entries
     */
    public PurgeRequestMessageCustomGroupIdsGroupList purgeRequestMessageCustomGroupIdsGroup() {
        return purgeRequestMessageCustomGroupIdsGroup;
    }

    /**
     * customGroupIdsGroupEncoding
     *
     * @return the CustomGroupIdsGroupEncoding record
     */
    public CustomGroupIdsGroupEncoding customGroupIdsGroupEncoding() {
        return customGroupIdsGroupEncoding;
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + purgeRequestMessageCustomGroupIdsGroup.byteLength();
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
        if (!customGroupIdsGroupEncoding.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += customGroupIdsGroupEncoding.byteLength();
        if (!purgeRequestMessageCustomGroupIdsGroup.parse(data, cursor, end, customGroupIdsGroupEncoding.numInGroup().value(), customGroupIdsGroupEncoding.blockLengthShort().value())) {
            return false;
        }
        cursor += purgeRequestMessageCustomGroupIdsGroup.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (purgeRequestMessageCustomGroupIdsGroup.size() > 255) {
            throw new IllegalStateException("purgeRequestMessageCustomGroupIdsGroup holds " + purgeRequestMessageCustomGroupIdsGroup.size() + " entries, more than its count field can state");
        }
        customGroupIdsGroupEncoding.numInGroup().value((short) purgeRequestMessageCustomGroupIdsGroup.size());
        customGroupIdsGroupEncoding.blockLengthShort().value((short) purgeRequestMessageCustomGroupIdsGroup.block());
        int cursor = offset;
        cursor = customGroupIdsGroupEncoding.encode(data, cursor);
        cursor = purgeRequestMessageCustomGroupIdsGroup.encode(data, cursor);
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
        customGroupIdsGroupEncoding.clear();
        purgeRequestMessageCustomGroupIdsGroup.clear();
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
            if (field != customGroupIdsGroupEncoding.numInGroup() && field != customGroupIdsGroupEncoding.blockLengthShort() && !field.isRecognized()) {
                return false;
            }
        }
        return purgeRequestMessageCustomGroupIdsGroup.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != customGroupIdsGroupEncoding.numInGroup() && field != customGroupIdsGroupEncoding.blockLengthShort() && !field.isValid()) {
                return false;
            }
        }
        if (!purgeRequestMessageCustomGroupIdsGroup.isValid()) {
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
        if (!customGroupIdsGroupEncoding.isDecoded()) {
            return customGroupIdsGroupEncoding.failedAt();
        }
        if (!purgeRequestMessageCustomGroupIdsGroup.isDecoded()) {
            return Optional.of(purgeRequestMessageCustomGroupIdsGroup.failedEntry().flatMap(PurgeRequestMessageCustomGroupIdsGroupEntry::failedAt).orElse(customGroupIdsGroupEncoding.numInGroup()));
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
        if (!(other instanceof PurgeRequestMessageCustomGroupIdsGroups message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(purgeRequestMessageCustomGroupIdsGroup.diffFields(message.purgeRequestMessageCustomGroupIdsGroup));
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
            purgeRequestMessageCustomGroupIdsGroup.toFormattedString(builder, options);
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
        purgeRequestMessageCustomGroupIdsGroup.toFormattedString(builder, nested);
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
        if (!(other instanceof PurgeRequestMessageCustomGroupIdsGroups message)) {
            return false;
        }
        return fields.equals(message.fields) && purgeRequestMessageCustomGroupIdsGroup.equals(message.purgeRequestMessageCustomGroupIdsGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, purgeRequestMessageCustomGroupIdsGroup);
    }
}
