package omi.nasdaq.nsmequities.orders.ouch.v5_0.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.branches.BrokenTradeOptionalValue;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.BrokenTradeOptionalFieldField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.OptionalFieldLengthField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Field;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.GroupEntry;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.PrintOptions;

/**
 * One entry of the BrokenTradeAppendage repeating group.
 *
 * <p>Broken Trade Appendage</p>
 */
public final class BrokenTradeAppendageEntry implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 2;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "BrokenTradeAppendage";

    /**
     * Appendage Length Type
     */
    private final OptionalFieldLengthField optionalFieldLength = new OptionalFieldLengthField();

    /**
     * Appendage Id
     */
    private final BrokenTradeOptionalFieldField brokenTradeOptionalField = new BrokenTradeOptionalFieldField();

    /**
     * Branch
     */
    private final BrokenTradeOptionalValue brokenTradeOptionalValue = new BrokenTradeOptionalValue();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(optionalFieldLength, brokenTradeOptionalField);

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
     * @return the BrokenTradeOptionalField field
     */
    public BrokenTradeOptionalFieldField brokenTradeOptionalField() {
        return brokenTradeOptionalField;
    }

    /**
     * Branch
     *
     * @return the BrokenTradeOptionalValue record
     */
    public BrokenTradeOptionalValue brokenTradeOptionalValue() {
        return brokenTradeOptionalValue;
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + brokenTradeOptionalValue.byteLength() - BrokenTradeOptionalValue.MINIMUM_BYTE_LENGTH;
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
        if (!optionalFieldLength.parse(data, cursor)) {
            return false;
        }
        cursor += OptionalFieldLengthField.BYTE_LENGTH;
        long stated = optionalFieldLength.value() + 1L;
        if (stated < MINIMUM_BYTE_LENGTH || stated > end - offset) {
            return false;
        }
        end = offset + (int) stated;
        if (!brokenTradeOptionalField.parse(data, cursor)) {
            return false;
        }
        cursor += BrokenTradeOptionalFieldField.BYTE_LENGTH;
        if (!brokenTradeOptionalValue.parseFrom(brokenTradeOptionalField, data, cursor, end)) {
            return false;
        }
        cursor += brokenTradeOptionalValue.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return cursor == end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        brokenTradeOptionalValue.writeKey(brokenTradeOptionalField);
        if (byteLength() - 1 > 255) {
            throw new IllegalStateException("this entry holds " + byteLength() + " bytes, more than its length field can state");
        }
        optionalFieldLength.value((short) (byteLength() - 1));
        int cursor = offset;
        cursor = optionalFieldLength.encode(data, cursor);
        cursor = brokenTradeOptionalField.encode(data, cursor);
        cursor = brokenTradeOptionalValue.encode(data, cursor);
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
        brokenTradeOptionalValue.clear();
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
            if (field != optionalFieldLength && field != brokenTradeOptionalField && !field.isRecognized()) {
                return false;
            }
        }
        return brokenTradeOptionalValue.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != optionalFieldLength && field != brokenTradeOptionalField && !field.isValid()) {
                return false;
            }
        }
        if (!brokenTradeOptionalValue.isValid()) {
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
            case "BrokenTradeOptionalField" -> Optional.of(brokenTradeOptionalField);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof BrokenTradeAppendageEntry message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(brokenTradeOptionalValue.diffFields(message.brokenTradeOptionalValue));
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
            brokenTradeOptionalValue.toFormattedString(builder, options);
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
        brokenTradeOptionalValue.toFormattedString(builder, nested);
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
        if (!(other instanceof BrokenTradeAppendageEntry message)) {
            return false;
        }
        return fields.equals(message.fields) && brokenTradeOptionalValue.equals(message.brokenTradeOptionalValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, brokenTradeOptionalValue);
    }
}
