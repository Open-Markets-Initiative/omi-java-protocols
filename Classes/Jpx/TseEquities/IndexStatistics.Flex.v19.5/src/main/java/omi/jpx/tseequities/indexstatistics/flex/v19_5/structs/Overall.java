package omi.jpx.tseequities.indexstatistics.flex.v19_5.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.structs.OverallDirectYieldAverage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.structs.OverallDivergenceAverage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.structs.OverallParityAverage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.structs.OverallSimpleAverage;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.types.Field;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.types.GroupEntry;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.types.PrintOptions;

/**
 * The Overall record a message holds.
 *
 * <p>Overall</p>
 */
public final class Overall implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 100;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "Overall";

    /**
     * Overall Simple average
     */
    private final OverallSimpleAverage overallSimpleAverage = new OverallSimpleAverage();

    /**
     * Overall Divergence average
     */
    private final OverallDivergenceAverage overallDivergenceAverage = new OverallDivergenceAverage();

    /**
     * Overall Parity average
     */
    private final OverallParityAverage overallParityAverage = new OverallParityAverage();

    /**
     * Overall Direct yield average
     */
    private final OverallDirectYieldAverage overallDirectYieldAverage = new OverallDirectYieldAverage();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(overallSimpleAverage.fields(), overallDivergenceAverage.fields(), overallParityAverage.fields(), overallDirectYieldAverage.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Overall Simple average
     *
     * @return the OverallSimpleAverage record
     */
    public OverallSimpleAverage overallSimpleAverage() {
        return overallSimpleAverage;
    }

    /**
     * Overall Divergence average
     *
     * @return the OverallDivergenceAverage record
     */
    public OverallDivergenceAverage overallDivergenceAverage() {
        return overallDivergenceAverage;
    }

    /**
     * Overall Parity average
     *
     * @return the OverallParityAverage record
     */
    public OverallParityAverage overallParityAverage() {
        return overallParityAverage;
    }

    /**
     * Overall Direct yield average
     *
     * @return the OverallDirectYieldAverage record
     */
    public OverallDirectYieldAverage overallDirectYieldAverage() {
        return overallDirectYieldAverage;
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
        if (!overallSimpleAverage.parseFrom(data, cursor, end - 68)) {
            return false;
        }
        cursor += overallSimpleAverage.byteLength();
        if (!overallDivergenceAverage.parseFrom(data, cursor, end - 50)) {
            return false;
        }
        cursor += overallDivergenceAverage.byteLength();
        if (!overallParityAverage.parseFrom(data, cursor, end - 18)) {
            return false;
        }
        cursor += overallParityAverage.byteLength();
        return overallDirectYieldAverage.parseFrom(data, cursor, end);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = overallSimpleAverage.encode(data, cursor);
        cursor = overallDivergenceAverage.encode(data, cursor);
        cursor = overallParityAverage.encode(data, cursor);
        cursor = overallDirectYieldAverage.encode(data, cursor);
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
        overallSimpleAverage.clear();
        overallDivergenceAverage.clear();
        overallParityAverage.clear();
        overallDirectYieldAverage.clear();
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
        return Optional.empty();
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof Overall message)) {
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
        if (!(other instanceof Overall message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
