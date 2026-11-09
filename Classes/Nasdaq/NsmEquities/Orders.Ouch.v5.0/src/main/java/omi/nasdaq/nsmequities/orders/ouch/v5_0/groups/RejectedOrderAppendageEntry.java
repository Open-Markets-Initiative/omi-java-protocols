package omi.nasdaq.nsmequities.orders.ouch.v5_0.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.branches.RejectedOrderOptionalValue;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.OptionalFieldLengthField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.RejectedOrderOptionalFieldField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Field;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.GroupEntry;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.PrintOptions;

/**
 * One entry of the RejectedOrderAppendage repeating group.
 *
 * <p>Rejected Order Appendage</p>
 */
public final class RejectedOrderAppendageEntry implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 2;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "RejectedOrderAppendage";

    /**
     * Appendage Length Type
     */
    private final OptionalFieldLengthField optionalFieldLength = new OptionalFieldLengthField();

    /**
     * Appendage Id
     */
    private final RejectedOrderOptionalFieldField rejectedOrderOptionalField = new RejectedOrderOptionalFieldField();

    /**
     * Branch
     */
    private final RejectedOrderOptionalValue rejectedOrderOptionalValue = new RejectedOrderOptionalValue();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(optionalFieldLength, rejectedOrderOptionalField);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Appendage Length Type
     *
     * @return the OptionalFieldLength field
     */
    public OptionalFieldLengthField optionalFieldLength() {
        return optionalFieldLength;
    }

    /**
     * Appendage Id
     *
     * @return the RejectedOrderOptionalField field
     */
    public RejectedOrderOptionalFieldField rejectedOrderOptionalField() {
        return rejectedOrderOptionalField;
    }

    /**
     * Branch
     *
     * @return the RejectedOrderOptionalValue record
     */
    public RejectedOrderOptionalValue rejectedOrderOptionalValue() {
        return rejectedOrderOptionalValue;
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + rejectedOrderOptionalValue.byteLength() - RejectedOrderOptionalValue.MINIMUM_BYTE_LENGTH;
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
        cursor += 1;
        cursor += rejectedOrderOptionalValue.byteLength();
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
        if (!optionalFieldLength.parse(data, cursor)) {
            return false;
        }
        cursor += OptionalFieldLengthField.BYTE_LENGTH;
        long stated = optionalFieldLength.value() + 1L;
        if (stated < MINIMUM_BYTE_LENGTH || stated > end - offset) {
            return false;
        }
        end = offset + (int) stated;
        if (!rejectedOrderOptionalField.parse(data, cursor)) {
            return false;
        }
        cursor += RejectedOrderOptionalFieldField.BYTE_LENGTH;
        if (!rejectedOrderOptionalValue.parseFrom(rejectedOrderOptionalField, data, cursor, end)) {
            return false;
        }
        cursor += rejectedOrderOptionalValue.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return cursor == end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        rejectedOrderOptionalValue.writeKey(rejectedOrderOptionalField);
        if (byteLength() - 1 > 255) {
            throw new IllegalStateException("this entry holds " + byteLength() + " bytes, more than its length field can state");
        }
        optionalFieldLength.value((short) (byteLength() - 1));
        int cursor = offset;
        cursor = optionalFieldLength.encode(data, cursor);
        cursor = rejectedOrderOptionalField.encode(data, cursor);
        cursor = rejectedOrderOptionalValue.encode(data, cursor);
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
        rejectedOrderOptionalValue.clear();
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
            if (field != optionalFieldLength && field != rejectedOrderOptionalField && !field.isRecognized()) {
                return false;
            }
        }
        if (!rejectedOrderOptionalValue.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != optionalFieldLength && field != rejectedOrderOptionalField && !field.isValid()) {
                return false;
            }
        }
        if (!rejectedOrderOptionalValue.isValid()) {
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
            case "OptionalFieldLength" -> Optional.of(optionalFieldLength);
            case "RejectedOrderOptionalField" -> Optional.of(rejectedOrderOptionalField);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof RejectedOrderAppendageEntry message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(rejectedOrderOptionalValue.diffFields(message.rejectedOrderOptionalValue));
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
            rejectedOrderOptionalValue.toFormattedString(builder, options);
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
        rejectedOrderOptionalValue.toFormattedString(builder, nested);
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
        if (!(other instanceof RejectedOrderAppendageEntry message)) {
            return false;
        }
        return fields.equals(message.fields) && rejectedOrderOptionalValue.equals(message.rejectedOrderOptionalValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, rejectedOrderOptionalValue);
    }
}
