package omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.fields.ShortPositionLowerValueField;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.fields.ShortPositionPromptDateCountField;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.fields.ShortPositionUpperValueField;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.groups.ShortPromptDatesEntry;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.groups.ShortPromptDatesList;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.types.GroupEntry;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.types.PrintOptions;

/**
 * One entry of the ShortPositionBands repeating group.
 *
 * <p>One short position band, giving the percentage range of Market Open Interest and the prompt dates participants hold short positions in</p>
 */
public final class ShortPositionBandsEntry implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 20;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "ShortPositionBands";

    /**
     * Short position lower band percentage value, in implicit six decimal place format.
     */
    private final ShortPositionLowerValueField shortPositionLowerValue = new ShortPositionLowerValueField();

    /**
     * Short position upper band percentage value, in implicit six decimal place format. The specification describes this field as the long position upper band percentage value, repeating the wording of the long band; the field is the short band's upper value.
     */
    private final ShortPositionUpperValueField shortPositionUpperValue = new ShortPositionUpperValueField();

    /**
     * Number of prompt dates.
     */
    private final ShortPositionPromptDateCountField shortPositionPromptDateCount = new ShortPositionPromptDateCountField();

    /**
     * One prompt date of a short position band and the number of participants holding short positions in it
     */
    private final ShortPromptDatesList shortPromptDates = new ShortPromptDatesList();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(shortPositionLowerValue, shortPositionUpperValue, shortPositionPromptDateCount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Short position lower band percentage value, in implicit six decimal place format.
     *
     * @return the ShortPositionLowerValue field
     */
    public ShortPositionLowerValueField shortPositionLowerValue() {
        return shortPositionLowerValue;
    }

    /**
     * Short position upper band percentage value, in implicit six decimal place format. The specification describes this field as the long position upper band percentage value, repeating the wording of the long band; the field is the short band's upper value.
     *
     * @return the ShortPositionUpperValue field
     */
    public ShortPositionUpperValueField shortPositionUpperValue() {
        return shortPositionUpperValue;
    }

    /**
     * Number of prompt dates.
     *
     * @return the ShortPositionPromptDateCount field
     */
    public ShortPositionPromptDateCountField shortPositionPromptDateCount() {
        return shortPositionPromptDateCount;
    }

    /**
     * One prompt date of a short position band and the number of participants holding short positions in it
     *
     * <p>Encode writes this list's size to the ShortPositionPromptDateCount field.</p>
     *
     * @return the ShortPromptDates entries
     */
    public ShortPromptDatesList shortPromptDates() {
        return shortPromptDates;
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + shortPromptDates.byteLength();
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
        if (!shortPositionLowerValue.parse(data, cursor)) {
            return false;
        }
        cursor += ShortPositionLowerValueField.BYTE_LENGTH;
        if (!shortPositionUpperValue.parse(data, cursor)) {
            return false;
        }
        cursor += ShortPositionUpperValueField.BYTE_LENGTH;
        if (!shortPositionPromptDateCount.parse(data, cursor)) {
            return false;
        }
        cursor += ShortPositionPromptDateCountField.BYTE_LENGTH;
        if (!shortPromptDates.parse(data, cursor, end, shortPositionPromptDateCount.value())) {
            return false;
        }
        cursor += shortPromptDates.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        shortPositionPromptDateCount.value(shortPromptDates.size());
        int cursor = offset;
        cursor = shortPositionLowerValue.encode(data, cursor);
        cursor = shortPositionUpperValue.encode(data, cursor);
        cursor = shortPositionPromptDateCount.encode(data, cursor);
        cursor = shortPromptDates.encode(data, cursor);
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
        shortPromptDates.clear();
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
            if (field != shortPositionPromptDateCount && !field.isRecognized()) {
                return false;
            }
        }
        return shortPromptDates.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != shortPositionPromptDateCount && !field.isValid()) {
                return false;
            }
        }
        if (!shortPromptDates.isValid()) {
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
        if (!shortPositionLowerValue.isDecoded()) {
            return Optional.of(shortPositionLowerValue);
        }
        if (!shortPositionUpperValue.isDecoded()) {
            return Optional.of(shortPositionUpperValue);
        }
        if (!shortPositionPromptDateCount.isDecoded()) {
            return Optional.of(shortPositionPromptDateCount);
        }
        if (!shortPromptDates.isDecoded()) {
            return Optional.of(shortPromptDates.failedEntry().flatMap(ShortPromptDatesEntry::failedAt).orElse(shortPositionPromptDateCount));
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
            case "ShortPositionLowerValue" -> Optional.of(shortPositionLowerValue);
            case "ShortPositionUpperValue" -> Optional.of(shortPositionUpperValue);
            case "ShortPositionPromptDateCount" -> Optional.of(shortPositionPromptDateCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof ShortPositionBandsEntry message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(shortPromptDates.diffFields(message.shortPromptDates));
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
            shortPromptDates.toFormattedString(builder, options);
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
        shortPromptDates.toFormattedString(builder, nested);
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
        if (!(other instanceof ShortPositionBandsEntry message)) {
            return false;
        }
        return fields.equals(message.fields) && shortPromptDates.equals(message.shortPromptDates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, shortPromptDates);
    }
}
