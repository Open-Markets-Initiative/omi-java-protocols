package omi.siac.cts.output.cta.v1_91.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.siac.cts.output.cta.v1_91.fields.Category1Field;
import omi.siac.cts.output.cta.v1_91.fields.Category2Field;
import omi.siac.cts.output.cta.v1_91.fields.Category3Field;
import omi.siac.cts.output.cta.v1_91.fields.Category4Field;
import omi.siac.cts.output.cta.v1_91.types.Field;
import omi.siac.cts.output.cta.v1_91.types.GroupEntry;
import omi.siac.cts.output.cta.v1_91.types.PrintOptions;

/**
 * The SaleConditions record a message holds.
 *
 * <p>Sale Conditions</p>
 */
public final class SaleConditions implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 4;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "SaleConditions";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Denotes the Settlement Type sale condition
     */
    private final Category1Field category1 = new Category1Field();

    /**
     * Denotes the Reason Type sale condition
     */
    private final Category2Field category2 = new Category2Field();

    /**
     * Denotes the Sequence Type sale condition
     */
    private final Category3Field category3 = new Category3Field();

    /**
     * Denotes the Trade Detail sale condition
     */
    private final Category4Field category4 = new Category4Field();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(category1, category2, category3, category4);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Denotes the Settlement Type sale condition
     *
     * @return the Category1 field
     */
    public Category1Field category1() {
        return category1;
    }

    /**
     * Denotes the Reason Type sale condition
     *
     * @return the Category2 field
     */
    public Category2Field category2() {
        return category2;
    }

    /**
     * Denotes the Sequence Type sale condition
     *
     * @return the Category3 field
     */
    public Category3Field category3() {
        return category3;
    }

    /**
     * Denotes the Trade Detail sale condition
     *
     * @return the Category4 field
     */
    public Category4Field category4() {
        return category4;
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
        return PADDING.clone();
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
        if (!category1.parse(data, cursor)) {
            return false;
        }
        cursor += Category1Field.BYTE_LENGTH;
        if (!category2.parse(data, cursor)) {
            return false;
        }
        cursor += Category2Field.BYTE_LENGTH;
        if (!category3.parse(data, cursor)) {
            return false;
        }
        cursor += Category3Field.BYTE_LENGTH;
        if (!category4.parse(data, cursor)) {
            return false;
        }
        cursor += Category4Field.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = category1.encode(data, cursor);
        cursor = category2.encode(data, cursor);
        cursor = category3.encode(data, cursor);
        cursor = category4.encode(data, cursor);
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
            case "Category1" -> Optional.of(category1);
            case "Category2" -> Optional.of(category2);
            case "Category3" -> Optional.of(category3);
            case "Category4" -> Optional.of(category4);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof SaleConditions message)) {
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
        if (!(other instanceof SaleConditions message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
