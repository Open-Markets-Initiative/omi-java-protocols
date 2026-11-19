package omi.jpx.tseequities.issuebasicinformation.flex.v19_5.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Arbitrary11Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Arbitrary12ToField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Arbitrary16Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Arbitrary17ToField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Arbitrary1Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Arbitrary20Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Arbitrary2Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Arbitrary3Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Arbitrary4Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Arbitrary5Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Arbitrary6Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Arbitrary7Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.fields.Arbitrary8ToField;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.types.Field;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.types.GroupEntry;
import omi.jpx.tseequities.issuebasicinformation.flex.v19_5.types.PrintOptions;

/**
 * The IndexConstituentIssue record a message holds.
 *
 * <p>Index constituent issue</p>
 */
public final class IndexConstituentIssue implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 20;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "IndexConstituentIssue";

    /**
     * Indicates whether this is a constituent issue of TOPIX Core30.
     */
    private final Arbitrary1Field arbitrary1 = new Arbitrary1Field();

    /**
     * Indicates whether this is a constituent issue of TOPIX Large70.
     */
    private final Arbitrary2Field arbitrary2 = new Arbitrary2Field();

    /**
     * Indicates whether this is a constituent issue of TOPIX 100.
     */
    private final Arbitrary3Field arbitrary3 = new Arbitrary3Field();

    /**
     * Indicates whether this is a constituent issue of Mid400.
     */
    private final Arbitrary4Field arbitrary4 = new Arbitrary4Field();

    /**
     * Indicates whether this is a constituent issue of TOPIX 500.
     */
    private final Arbitrary5Field arbitrary5 = new Arbitrary5Field();

    /**
     * Indicates whether this is a constituent issue of TOPIX Small.
     */
    private final Arbitrary6Field arbitrary6 = new Arbitrary6Field();

    /**
     * Indicates whether this is a constituent issue of TOPIX 1000.
     */
    private final Arbitrary7Field arbitrary7 = new Arbitrary7Field();

    /**
     * Unused. Space is set.
     */
    private final Arbitrary8ToField arbitrary8To = new Arbitrary8ToField();

    /**
     * Indicates whether this is a constituent issue of TSE Growth Market 250 Index.
     */
    private final Arbitrary11Field arbitrary11 = new Arbitrary11Field();

    /**
     * Unused. Space is set.
     */
    private final Arbitrary12ToField arbitrary12To = new Arbitrary12ToField();

    /**
     * Indicates whether this is a constituent issue of REIT, general.
     */
    private final Arbitrary16Field arbitrary16 = new Arbitrary16Field();

    /**
     * Unused. Space is set.
     */
    private final Arbitrary17ToField arbitrary17To = new Arbitrary17ToField();

    /**
     * Unused. Space is set.
     */
    private final Arbitrary20Field arbitrary20 = new Arbitrary20Field();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(arbitrary1, arbitrary2, arbitrary3, arbitrary4, arbitrary5, arbitrary6, arbitrary7, arbitrary8To, arbitrary11, arbitrary12To, arbitrary16, arbitrary17To, arbitrary20);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Indicates whether this is a constituent issue of TOPIX Core30.
     *
     * @return the Arbitrary1 field
     */
    public Arbitrary1Field arbitrary1() {
        return arbitrary1;
    }

    /**
     * Indicates whether this is a constituent issue of TOPIX Large70.
     *
     * @return the Arbitrary2 field
     */
    public Arbitrary2Field arbitrary2() {
        return arbitrary2;
    }

    /**
     * Indicates whether this is a constituent issue of TOPIX 100.
     *
     * @return the Arbitrary3 field
     */
    public Arbitrary3Field arbitrary3() {
        return arbitrary3;
    }

    /**
     * Indicates whether this is a constituent issue of Mid400.
     *
     * @return the Arbitrary4 field
     */
    public Arbitrary4Field arbitrary4() {
        return arbitrary4;
    }

    /**
     * Indicates whether this is a constituent issue of TOPIX 500.
     *
     * @return the Arbitrary5 field
     */
    public Arbitrary5Field arbitrary5() {
        return arbitrary5;
    }

    /**
     * Indicates whether this is a constituent issue of TOPIX Small.
     *
     * @return the Arbitrary6 field
     */
    public Arbitrary6Field arbitrary6() {
        return arbitrary6;
    }

    /**
     * Indicates whether this is a constituent issue of TOPIX 1000.
     *
     * @return the Arbitrary7 field
     */
    public Arbitrary7Field arbitrary7() {
        return arbitrary7;
    }

    /**
     * Unused. Space is set.
     *
     * @return the Arbitrary8To field
     */
    public Arbitrary8ToField arbitrary8To() {
        return arbitrary8To;
    }

    /**
     * Indicates whether this is a constituent issue of TSE Growth Market 250 Index.
     *
     * @return the Arbitrary11 field
     */
    public Arbitrary11Field arbitrary11() {
        return arbitrary11;
    }

    /**
     * Unused. Space is set.
     *
     * @return the Arbitrary12To field
     */
    public Arbitrary12ToField arbitrary12To() {
        return arbitrary12To;
    }

    /**
     * Indicates whether this is a constituent issue of REIT, general.
     *
     * @return the Arbitrary16 field
     */
    public Arbitrary16Field arbitrary16() {
        return arbitrary16;
    }

    /**
     * Unused. Space is set.
     *
     * @return the Arbitrary17To field
     */
    public Arbitrary17ToField arbitrary17To() {
        return arbitrary17To;
    }

    /**
     * Unused. Space is set.
     *
     * @return the Arbitrary20 field
     */
    public Arbitrary20Field arbitrary20() {
        return arbitrary20;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!arbitrary1.parse(data, cursor)) {
            return false;
        }
        cursor += Arbitrary1Field.BYTE_LENGTH;
        if (!arbitrary2.parse(data, cursor)) {
            return false;
        }
        cursor += Arbitrary2Field.BYTE_LENGTH;
        if (!arbitrary3.parse(data, cursor)) {
            return false;
        }
        cursor += Arbitrary3Field.BYTE_LENGTH;
        if (!arbitrary4.parse(data, cursor)) {
            return false;
        }
        cursor += Arbitrary4Field.BYTE_LENGTH;
        if (!arbitrary5.parse(data, cursor)) {
            return false;
        }
        cursor += Arbitrary5Field.BYTE_LENGTH;
        if (!arbitrary6.parse(data, cursor)) {
            return false;
        }
        cursor += Arbitrary6Field.BYTE_LENGTH;
        if (!arbitrary7.parse(data, cursor)) {
            return false;
        }
        cursor += Arbitrary7Field.BYTE_LENGTH;
        if (!arbitrary8To.parse(data, cursor)) {
            return false;
        }
        cursor += Arbitrary8ToField.BYTE_LENGTH;
        if (!arbitrary11.parse(data, cursor)) {
            return false;
        }
        cursor += Arbitrary11Field.BYTE_LENGTH;
        if (!arbitrary12To.parse(data, cursor)) {
            return false;
        }
        cursor += Arbitrary12ToField.BYTE_LENGTH;
        if (!arbitrary16.parse(data, cursor)) {
            return false;
        }
        cursor += Arbitrary16Field.BYTE_LENGTH;
        if (!arbitrary17To.parse(data, cursor)) {
            return false;
        }
        cursor += Arbitrary17ToField.BYTE_LENGTH;
        return arbitrary20.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = arbitrary1.encode(data, cursor);
        cursor = arbitrary2.encode(data, cursor);
        cursor = arbitrary3.encode(data, cursor);
        cursor = arbitrary4.encode(data, cursor);
        cursor = arbitrary5.encode(data, cursor);
        cursor = arbitrary6.encode(data, cursor);
        cursor = arbitrary7.encode(data, cursor);
        cursor = arbitrary8To.encode(data, cursor);
        cursor = arbitrary11.encode(data, cursor);
        cursor = arbitrary12To.encode(data, cursor);
        cursor = arbitrary16.encode(data, cursor);
        cursor = arbitrary17To.encode(data, cursor);
        cursor = arbitrary20.encode(data, cursor);
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
            case "Arbitrary1" -> Optional.of(arbitrary1);
            case "Arbitrary2" -> Optional.of(arbitrary2);
            case "Arbitrary3" -> Optional.of(arbitrary3);
            case "Arbitrary4" -> Optional.of(arbitrary4);
            case "Arbitrary5" -> Optional.of(arbitrary5);
            case "Arbitrary6" -> Optional.of(arbitrary6);
            case "Arbitrary7" -> Optional.of(arbitrary7);
            case "Arbitrary8To" -> Optional.of(arbitrary8To);
            case "Arbitrary11" -> Optional.of(arbitrary11);
            case "Arbitrary12To" -> Optional.of(arbitrary12To);
            case "Arbitrary16" -> Optional.of(arbitrary16);
            case "Arbitrary17To" -> Optional.of(arbitrary17To);
            case "Arbitrary20" -> Optional.of(arbitrary20);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof IndexConstituentIssue message)) {
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
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof IndexConstituentIssue message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
