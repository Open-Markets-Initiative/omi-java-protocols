package omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.LegInstrumentIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.LegRatioField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.LegSideField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.LegTypeField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Field;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.GroupEntry;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.PrintOptions;

/**
 * One entry of the ComplexInstrumentLegs repeating group.
 *
 * <p>Leg Definitions (2-10) of Add Complex Instrument</p>
 */
public final class ComplexInstrumentLegsEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "ComplexInstrumentLegs";

    /**
     * O=Option, S=Stock
     */
    private final LegTypeField legType = new LegTypeField();

    /**
     * Leg Instrument ID. Only populated for OrdExecType=C. Zero otherwise.
     */
    private final LegInstrumentIdField legInstrumentId = new LegInstrumentIdField();

    /**
     * B=Buy, S=Sell
     */
    private final LegSideField legSide = new LegSideField();

    /**
     * 1 &lt;= n &lt;= 9,999
     */
    private final LegRatioField legRatio = new LegRatioField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(legType, legInstrumentId, legSide, legRatio);

    private byte[] buffer;

    private boolean decoded;

    /**
     * O=Option, S=Stock
     *
     * @return the LegType field
     */
    public LegTypeField legType() {
        return legType;
    }

    /**
     * Leg Instrument ID. Only populated for OrdExecType=C. Zero otherwise.
     *
     * @return the LegInstrumentId field
     */
    public LegInstrumentIdField legInstrumentId() {
        return legInstrumentId;
    }

    /**
     * B=Buy, S=Sell
     *
     * @return the LegSide field
     */
    public LegSideField legSide() {
        return legSide;
    }

    /**
     * 1 &lt;= n &lt;= 9,999
     *
     * @return the LegRatio field
     */
    public LegRatioField legRatio() {
        return legRatio;
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
        if (!legType.parse(data, cursor)) {
            return false;
        }
        cursor += LegTypeField.BYTE_LENGTH;
        if (!legInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += LegInstrumentIdField.BYTE_LENGTH;
        if (!legSide.parse(data, cursor)) {
            return false;
        }
        cursor += LegSideField.BYTE_LENGTH;
        return legRatio.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = legType.encode(data, cursor);
        cursor = legInstrumentId.encode(data, cursor);
        cursor = legSide.encode(data, cursor);
        cursor = legRatio.encode(data, cursor);
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
            case "LegType" -> Optional.of(legType);
            case "LegInstrumentId" -> Optional.of(legInstrumentId);
            case "LegSide" -> Optional.of(legSide);
            case "LegRatio" -> Optional.of(legRatio);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof ComplexInstrumentLegsEntry message)) {
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
        if (!(other instanceof ComplexInstrumentLegsEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
