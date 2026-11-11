package omi.ice.icefutures.mdf.impact.v1_1_33.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_33.branches.VariableField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.SpecialFieldIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.SpecialFieldLengthField;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.GroupEntry;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.PrintOptions;

/**
 * One entry of the SpecialField repeating group.
 *
 * <p>Special Field</p>
 */
public final class SpecialFieldEntry implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 3;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "SpecialField";

    /**
     * Special field type
     */
    private final SpecialFieldIdField specialFieldId = new SpecialFieldIdField();

    /**
     * Length of this field
     */
    private final SpecialFieldLengthField specialFieldLength = new SpecialFieldLengthField();

    /**
     * Branch
     */
    private final VariableField variableField = new VariableField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(specialFieldId, specialFieldLength);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Special field type
     *
     * @return the SpecialFieldId field
     */
    public SpecialFieldIdField specialFieldId() {
        return specialFieldId;
    }

    /**
     * Length of this field
     *
     * @return the SpecialFieldLength field
     */
    public SpecialFieldLengthField specialFieldLength() {
        return specialFieldLength;
    }

    /**
     * Branch
     *
     * @return the VariableField record
     */
    public VariableField variableField() {
        return variableField;
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + variableField.byteLength() - VariableField.MINIMUM_BYTE_LENGTH;
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
        if (!specialFieldId.parse(data, cursor)) {
            return false;
        }
        cursor += SpecialFieldIdField.BYTE_LENGTH;
        if (!specialFieldLength.parse(data, cursor)) {
            return false;
        }
        cursor += SpecialFieldLengthField.BYTE_LENGTH;
        long variableFieldWidth = specialFieldLength.value();
        if (variableFieldWidth < 0 || variableFieldWidth > (end) - cursor) {
            return false;
        }
        if (!variableField.parseFrom(specialFieldId, data, cursor, cursor + (int) variableFieldWidth) || variableField.byteLength() != variableFieldWidth) {
            return false;
        }
        cursor += variableField.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        variableField.writeKey(specialFieldId);
        specialFieldLength.value((short) (variableField.byteLength()));
        int cursor = offset;
        cursor = specialFieldId.encode(data, cursor);
        cursor = specialFieldLength.encode(data, cursor);
        cursor = variableField.encode(data, cursor);
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
        variableField.clear();
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
            if (field != specialFieldId && field != specialFieldLength && !field.isRecognized()) {
                return false;
            }
        }
        return variableField.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != specialFieldId && field != specialFieldLength && !field.isValid()) {
                return false;
            }
        }
        if (!variableField.isValid()) {
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
            case "SpecialFieldId" -> Optional.of(specialFieldId);
            case "SpecialFieldLength" -> Optional.of(specialFieldLength);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof SpecialFieldEntry message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(variableField.diffFields(message.variableField));
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
            builder.append(", ");
            variableField.toFormattedString(builder, options);
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
        variableField.toFormattedString(builder, nested);
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
        if (!(other instanceof SpecialFieldEntry message)) {
            return false;
        }
        return fields.equals(message.fields) && variableField.equals(message.variableField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, variableField);
    }
}
