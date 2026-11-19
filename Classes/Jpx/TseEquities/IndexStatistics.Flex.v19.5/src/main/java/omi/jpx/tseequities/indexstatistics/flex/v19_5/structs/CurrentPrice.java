package omi.jpx.tseequities.indexstatistics.flex.v19_5.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.fields.FlagField;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.fields.IndexValueField;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.fields.SignField;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.fields.TimeC6HhmmssField;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.fields.UnitFlagField;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.types.Field;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.types.GroupEntry;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.types.PrintOptions;

/**
 * The CurrentPrice record a message holds.
 *
 * <p>Current price</p>
 */
public final class CurrentPrice implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 23;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "CurrentPrice";

    /**
     * Indicates that this is the unit flag.
     */
    private final UnitFlagField unitFlag = new UnitFlagField();

    /**
     * Indicates the opening price of the index. Unit used for computation: 1/100 (the second decimal places will be set)
     */
    private final IndexValueField indexValue = new IndexValueField();

    /**
     * Indicates the sign of Day-on-day comparison.
     */
    private final SignField sign = new SignField();

    /**
     * Indicates the time at which the opening price was computed.
     */
    private final TimeC6HhmmssField timeC6Hhmmss = new TimeC6HhmmssField();

    /**
     * Indicates the flag of the opening price.
     */
    private final FlagField flag = new FlagField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(unitFlag, indexValue, sign, timeC6Hhmmss, flag);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Indicates that this is the unit flag.
     *
     * @return the UnitFlag field
     */
    public UnitFlagField unitFlag() {
        return unitFlag;
    }

    /**
     * Indicates the opening price of the index. Unit used for computation: 1/100 (the second decimal places will be set)
     *
     * @return the IndexValue field
     */
    public IndexValueField indexValue() {
        return indexValue;
    }

    /**
     * Indicates the sign of Day-on-day comparison.
     *
     * @return the Sign field
     */
    public SignField sign() {
        return sign;
    }

    /**
     * Indicates the time at which the opening price was computed.
     *
     * @return the TimeC6Hhmmss field
     */
    public TimeC6HhmmssField timeC6Hhmmss() {
        return timeC6Hhmmss;
    }

    /**
     * Indicates the flag of the opening price.
     *
     * @return the Flag field
     */
    public FlagField flag() {
        return flag;
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
        if (!unitFlag.parse(data, cursor)) {
            return false;
        }
        cursor += UnitFlagField.BYTE_LENGTH;
        if (!indexValue.parse(data, cursor)) {
            return false;
        }
        cursor += IndexValueField.BYTE_LENGTH;
        if (!sign.parse(data, cursor)) {
            return false;
        }
        cursor += SignField.BYTE_LENGTH;
        if (!timeC6Hhmmss.parse(data, cursor)) {
            return false;
        }
        cursor += TimeC6HhmmssField.BYTE_LENGTH;
        return flag.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = unitFlag.encode(data, cursor);
        cursor = indexValue.encode(data, cursor);
        cursor = sign.encode(data, cursor);
        cursor = timeC6Hhmmss.encode(data, cursor);
        cursor = flag.encode(data, cursor);
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
            case "UnitFlag" -> Optional.of(unitFlag);
            case "IndexValue" -> Optional.of(indexValue);
            case "Sign" -> Optional.of(sign);
            case "TimeC6Hhmmss" -> Optional.of(timeC6Hhmmss);
            case "Flag" -> Optional.of(flag);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof CurrentPrice message)) {
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
        if (!(other instanceof CurrentPrice message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
