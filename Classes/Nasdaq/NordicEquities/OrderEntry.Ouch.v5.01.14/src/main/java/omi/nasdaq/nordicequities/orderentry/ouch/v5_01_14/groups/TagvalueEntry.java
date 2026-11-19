package omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.branches.ValuePayload;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.fields.LengthField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.fields.TagField;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.types.Field;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.types.GroupEntry;
import omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.types.PrintOptions;

/**
 * One entry of the Tagvalue repeating group.
 *
 * <p>Additional appendage tag value</p>
 */
public final class TagvalueEntry implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 2;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "Tagvalue";

    /**
     * Remaining length of this tag value element, the tag plus its value
     */
    private final LengthField length = new LengthField();

    /**
     * Identifies the appendage carried by this element
     */
    private final TagField tag = new TagField();

    /**
     * Branch
     */
    private final ValuePayload valuePayload = new ValuePayload();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(length, tag);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Remaining length of this tag value element, the tag plus its value
     *
     * @return the Length field
     */
    public LengthField length() {
        return length;
    }

    /**
     * Identifies the appendage carried by this element
     *
     * @return the Tag field
     */
    public TagField tag() {
        return tag;
    }

    /**
     * Branch
     *
     * @return the ValuePayload record
     */
    public ValuePayload valuePayload() {
        return valuePayload;
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + valuePayload.byteLength() - ValuePayload.MINIMUM_BYTE_LENGTH;
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
        if (!length.parse(data, cursor)) {
            return false;
        }
        cursor += LengthField.BYTE_LENGTH;
        long stated = length.value() + 1L;
        if (stated < MINIMUM_BYTE_LENGTH || stated > end - offset) {
            return false;
        }
        end = offset + (int) stated;
        if (!tag.parse(data, cursor)) {
            return false;
        }
        cursor += TagField.BYTE_LENGTH;
        if (!valuePayload.parseFrom(tag, data, cursor, end)) {
            return false;
        }
        cursor += valuePayload.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return cursor == end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        valuePayload.writeKey(tag);
        if (byteLength() - 1 > 255) {
            throw new IllegalStateException("this entry holds " + byteLength() + " bytes, more than its length field can state");
        }
        length.value((short) (byteLength() - 1));
        int cursor = offset;
        cursor = length.encode(data, cursor);
        cursor = tag.encode(data, cursor);
        cursor = valuePayload.encode(data, cursor);
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
        valuePayload.clear();
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
            if (field != length && field != tag && !field.isRecognized()) {
                return false;
            }
        }
        return valuePayload.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != length && field != tag && !field.isValid()) {
                return false;
            }
        }
        if (!valuePayload.isValid()) {
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
            case "Length" -> Optional.of(length);
            case "Tag" -> Optional.of(tag);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof TagvalueEntry message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(valuePayload.diffFields(message.valuePayload));
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
            valuePayload.toFormattedString(builder, options);
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
        valuePayload.toFormattedString(builder, nested);
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
        if (!(other instanceof TagvalueEntry message)) {
            return false;
        }
        return fields.equals(message.fields) && valuePayload.equals(message.valuePayload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, valuePayload);
    }
}
