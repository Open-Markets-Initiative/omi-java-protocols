package omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.fields.LowerValueField;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.fields.ParticipantCountField;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.fields.UpperValueField;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.types.Field;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.types.GroupEntry;
import omi.lme.lmeselect.dailysummariessnapshot.lmesource.v4_18.types.PrintOptions;

/**
 * One entry of the WarrantBands repeating group.
 *
 * <p>One warrant band, giving the percentage range and the number of participants whose warrant concentration falls within it</p>
 */
public final class WarrantBandsEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 20;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "WarrantBands";

    /**
     * Lower band percentage value, in implicit six decimal place format.
     */
    private final LowerValueField lowerValue = new LowerValueField();

    /**
     * Upper band percentage value, in implicit six decimal place format. Null for Type WC or WT if one hundred.
     */
    private final UpperValueField upperValue = new UpperValueField();

    /**
     * Number of market participants holding long positions in the given band and prompt.
     */
    private final ParticipantCountField participantCount = new ParticipantCountField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(lowerValue, upperValue, participantCount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Lower band percentage value, in implicit six decimal place format.
     *
     * @return the LowerValue field
     */
    public LowerValueField lowerValue() {
        return lowerValue;
    }

    /**
     * Upper band percentage value, in implicit six decimal place format. Null for Type WC or WT if one hundred.
     *
     * @return the UpperValue field
     */
    public UpperValueField upperValue() {
        return upperValue;
    }

    /**
     * Number of market participants holding long positions in the given band and prompt.
     *
     * @return the ParticipantCount field
     */
    public ParticipantCountField participantCount() {
        return participantCount;
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
        if (!lowerValue.parse(data, cursor)) {
            return false;
        }
        cursor += LowerValueField.BYTE_LENGTH;
        if (!upperValue.parse(data, cursor)) {
            return false;
        }
        cursor += UpperValueField.BYTE_LENGTH;
        return participantCount.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = lowerValue.encode(data, cursor);
        cursor = upperValue.encode(data, cursor);
        cursor = participantCount.encode(data, cursor);
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
            case "LowerValue" -> Optional.of(lowerValue);
            case "UpperValue" -> Optional.of(upperValue);
            case "ParticipantCount" -> Optional.of(participantCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof WarrantBandsEntry message)) {
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
        if (!(other instanceof WarrantBandsEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
