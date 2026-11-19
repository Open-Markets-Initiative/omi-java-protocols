package omi.moex.spectra.optinfoincremental.simba.v9_12_0.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.groups.SecurityMassStatusMessageNoRelatedSymGroupEntry;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.groups.SecurityMassStatusMessageNoRelatedSymGroupList;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.structs.GroupSize;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.types.Field;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.types.GroupEntry;
import omi.moex.spectra.optinfoincremental.simba.v9_12_0.types.PrintOptions;

/**
 * The SecurityMassStatusMessageNoRelatedSymGroups record a message holds.
 *
 * <p>NoRelatedSym Block</p>
 */
public final class SecurityMassStatusMessageNoRelatedSymGroups implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 4;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "SecurityMassStatusMessageNoRelatedSymGroups";

    /**
     * NoRelatedSym
     */
    private final SecurityMassStatusMessageNoRelatedSymGroupList securityMassStatusMessageNoRelatedSymGroup = new SecurityMassStatusMessageNoRelatedSymGroupList();

    /**
     * groupSize2
     */
    private final GroupSize groupSize = new GroupSize();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(groupSize.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * NoRelatedSym
     *
     * <p>Encode writes this list's size to the NumInGroupUint field.</p>
     *
     * @return the SecurityMassStatusMessageNoRelatedSymGroup entries
     */
    public SecurityMassStatusMessageNoRelatedSymGroupList securityMassStatusMessageNoRelatedSymGroup() {
        return securityMassStatusMessageNoRelatedSymGroup;
    }

    /**
     * groupSize2
     *
     * @return the GroupSize record
     */
    public GroupSize groupSize() {
        return groupSize;
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + securityMassStatusMessageNoRelatedSymGroup.byteLength();
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
        if (!groupSize.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += groupSize.byteLength();
        if (!securityMassStatusMessageNoRelatedSymGroup.parse(data, cursor, end, groupSize.numInGroupUint().value(), groupSize.blockLength().value())) {
            return false;
        }
        cursor += securityMassStatusMessageNoRelatedSymGroup.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (securityMassStatusMessageNoRelatedSymGroup.size() > 65535) {
            throw new IllegalStateException("securityMassStatusMessageNoRelatedSymGroup holds " + securityMassStatusMessageNoRelatedSymGroup.size() + " entries, more than its count field can state");
        }
        groupSize.numInGroupUint().value(securityMassStatusMessageNoRelatedSymGroup.size());
        groupSize.blockLength().value(securityMassStatusMessageNoRelatedSymGroup.block());
        int cursor = offset;
        cursor = groupSize.encode(data, cursor);
        cursor = securityMassStatusMessageNoRelatedSymGroup.encode(data, cursor);
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
        groupSize.clear();
        securityMassStatusMessageNoRelatedSymGroup.clear();
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
            if (field != groupSize.numInGroupUint() && field != groupSize.blockLength() && !field.isRecognized()) {
                return false;
            }
        }
        return securityMassStatusMessageNoRelatedSymGroup.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != groupSize.numInGroupUint() && field != groupSize.blockLength() && !field.isValid()) {
                return false;
            }
        }
        if (!securityMassStatusMessageNoRelatedSymGroup.isValid()) {
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
        if (!groupSize.isDecoded()) {
            return groupSize.failedAt();
        }
        if (!securityMassStatusMessageNoRelatedSymGroup.isDecoded()) {
            return Optional.of(securityMassStatusMessageNoRelatedSymGroup.failedEntry().flatMap(SecurityMassStatusMessageNoRelatedSymGroupEntry::failedAt).orElse(groupSize.numInGroupUint()));
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
        if (!(other instanceof SecurityMassStatusMessageNoRelatedSymGroups message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(securityMassStatusMessageNoRelatedSymGroup.diffFields(message.securityMassStatusMessageNoRelatedSymGroup));
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
            securityMassStatusMessageNoRelatedSymGroup.toFormattedString(builder, options);
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
        securityMassStatusMessageNoRelatedSymGroup.toFormattedString(builder, nested);
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
        if (!(other instanceof SecurityMassStatusMessageNoRelatedSymGroups message)) {
            return false;
        }
        return fields.equals(message.fields) && securityMassStatusMessageNoRelatedSymGroup.equals(message.securityMassStatusMessageNoRelatedSymGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, securityMassStatusMessageNoRelatedSymGroup);
    }
}
