package omi.ice.icefutures.mdf.impact.v1_1_24.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.NumberOfSpecialFieldsField;
import omi.ice.icefutures.mdf.impact.v1_1_24.groups.SpecialFieldEntry;
import omi.ice.icefutures.mdf.impact.v1_1_24.groups.SpecialFieldList;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Message;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.PrintOptions;

/**
 * Represents the SpecialFieldMessage message from the Mdf protocol.
 *
 * <p>The Special Field Message is used to send extra information on existing messages.</p>
 */
public final class SpecialFieldMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'b';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 1;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Special Field Message";

    /**
     * Number of Fields present on this message
     */
    private final NumberOfSpecialFieldsField numberOfSpecialFields = new NumberOfSpecialFieldsField();

    /**
     * Special Field
     */
    private final SpecialFieldList specialField = new SpecialFieldList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(numberOfSpecialFields);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Number of Fields present on this message
     *
     * @return the NumberOfSpecialFields field
     */
    public NumberOfSpecialFieldsField numberOfSpecialFields() {
        return numberOfSpecialFields;
    }

    /**
     * Special Field
     *
     * <p>Encode writes this list's size to the NumberOfSpecialFields field.</p>
     *
     * @return the SpecialField entries
     */
    public SpecialFieldList specialField() {
        return specialField;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + specialField.byteLength();
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
        cursor += 1;
        cursor = specialField.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.empty();
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
        if (!numberOfSpecialFields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfSpecialFieldsField.BYTE_LENGTH;
        if (!specialField.parse(data, cursor, end, numberOfSpecialFields.value())) {
            return false;
        }
        cursor += specialField.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (specialField.size() > 127) {
            throw new IllegalStateException("specialField holds " + specialField.size() + " entries, more than its count field can state");
        }
        numberOfSpecialFields.value((byte) specialField.size());
        int cursor = offset;
        cursor = numberOfSpecialFields.encode(data, cursor);
        cursor = specialField.encode(data, cursor);
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
        specialField.clear();
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
            if (field != numberOfSpecialFields && !field.isRecognized()) {
                return false;
            }
        }
        if (!specialField.isRecognized()) {
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
            if (field != numberOfSpecialFields && !field.isValid()) {
                return false;
            }
        }
        if (!specialField.isValid()) {
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
        if (!numberOfSpecialFields.isDecoded()) {
            return Optional.of(numberOfSpecialFields);
        }
        if (!specialField.isDecoded()) {
            return Optional.of(specialField.failedEntry().flatMap(SpecialFieldEntry::failedAt).orElse(numberOfSpecialFields));
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
            case "NumberOfSpecialFields" -> Optional.of(numberOfSpecialFields);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SpecialFieldMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(specialField.diffFields(message.specialField));
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
            specialField.toFormattedString(builder, options);
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
        specialField.toFormattedString(builder, nested);
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
        if (!(other instanceof SpecialFieldMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && specialField.equals(message.specialField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, specialField);
    }
}
