package omi.euronext.optiq.dropcopygateway.sbe.v5_36.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.groups.DCShortOrderRejectMessageModifiableShortCodesGroupEntry;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.groups.DCShortOrderRejectMessageModifiableShortCodesGroupList;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.structs.GroupSizeEncoding;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.types.GroupEntry;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.types.PrintOptions;

/**
 * The DCShortOrderRejectMessageModifiableShortCodesGroups record a message holds.
 *
 * <p>ModifiableShortCodes Block</p>
 */
public final class DCShortOrderRejectMessageModifiableShortCodesGroups implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 2;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "DCShortOrderRejectMessageModifiableShortCodesGroups";

    /**
     * ModifiableShortCodes
     */
    private final DCShortOrderRejectMessageModifiableShortCodesGroupList dCShortOrderRejectMessageModifiableShortCodesGroup = new DCShortOrderRejectMessageModifiableShortCodesGroupList();

    /**
     * groupSizeEncoding
     */
    private final GroupSizeEncoding groupSizeEncoding = new GroupSizeEncoding();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(groupSizeEncoding.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * ModifiableShortCodes
     *
     * <p>Encode writes this list's size to the NumInGroup field.</p>
     *
     * @return the DCShortOrderRejectMessageModifiableShortCodesGroup entries
     */
    public DCShortOrderRejectMessageModifiableShortCodesGroupList dCShortOrderRejectMessageModifiableShortCodesGroup() {
        return dCShortOrderRejectMessageModifiableShortCodesGroup;
    }

    /**
     * groupSizeEncoding
     *
     * @return the GroupSizeEncoding record
     */
    public GroupSizeEncoding groupSizeEncoding() {
        return groupSizeEncoding;
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + dCShortOrderRejectMessageModifiableShortCodesGroup.byteLength();
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
        if (!groupSizeEncoding.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += groupSizeEncoding.byteLength();
        if (!dCShortOrderRejectMessageModifiableShortCodesGroup.parse(data, cursor, end, groupSizeEncoding.numInGroup().value(), groupSizeEncoding.blockLengthShort().value())) {
            return false;
        }
        cursor += dCShortOrderRejectMessageModifiableShortCodesGroup.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (dCShortOrderRejectMessageModifiableShortCodesGroup.size() > 255) {
            throw new IllegalStateException("dCShortOrderRejectMessageModifiableShortCodesGroup holds " + dCShortOrderRejectMessageModifiableShortCodesGroup.size() + " entries, more than its count field can state");
        }
        groupSizeEncoding.numInGroup().value((short) dCShortOrderRejectMessageModifiableShortCodesGroup.size());
        groupSizeEncoding.blockLengthShort().value((short) dCShortOrderRejectMessageModifiableShortCodesGroup.block());
        int cursor = offset;
        cursor = groupSizeEncoding.encode(data, cursor);
        cursor = dCShortOrderRejectMessageModifiableShortCodesGroup.encode(data, cursor);
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
        dCShortOrderRejectMessageModifiableShortCodesGroup.clear();
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
            if (field != groupSizeEncoding.numInGroup() && field != groupSizeEncoding.blockLengthShort() && !field.isRecognized()) {
                return false;
            }
        }
        return dCShortOrderRejectMessageModifiableShortCodesGroup.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != groupSizeEncoding.numInGroup() && field != groupSizeEncoding.blockLengthShort() && !field.isValid()) {
                return false;
            }
        }
        if (!dCShortOrderRejectMessageModifiableShortCodesGroup.isValid()) {
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
        if (!dCShortOrderRejectMessageModifiableShortCodesGroup.isDecoded()) {
            return Optional.of(dCShortOrderRejectMessageModifiableShortCodesGroup.failedEntry().flatMap(DCShortOrderRejectMessageModifiableShortCodesGroupEntry::failedAt).orElse(groupSizeEncoding.numInGroup()));
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
        if (!(other instanceof DCShortOrderRejectMessageModifiableShortCodesGroups message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(dCShortOrderRejectMessageModifiableShortCodesGroup.diffFields(message.dCShortOrderRejectMessageModifiableShortCodesGroup));
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
            dCShortOrderRejectMessageModifiableShortCodesGroup.toFormattedString(builder, options);
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
        dCShortOrderRejectMessageModifiableShortCodesGroup.toFormattedString(builder, nested);
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
        if (!(other instanceof DCShortOrderRejectMessageModifiableShortCodesGroups message)) {
            return false;
        }
        return fields.equals(message.fields) && dCShortOrderRejectMessageModifiableShortCodesGroup.equals(message.dCShortOrderRejectMessageModifiableShortCodesGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, dCShortOrderRejectMessageModifiableShortCodesGroup);
    }
}
