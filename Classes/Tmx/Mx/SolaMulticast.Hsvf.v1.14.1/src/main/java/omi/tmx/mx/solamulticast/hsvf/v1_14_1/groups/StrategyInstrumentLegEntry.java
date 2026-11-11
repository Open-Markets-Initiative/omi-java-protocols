package omi.tmx.mx.solamulticast.hsvf.v1_14_1.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.LegPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.LegRatioOrDeltaFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.LegGroupInstrumentField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.LegInstrumentField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * One entry of the StrategyInstrumentLeg repeating group.
 *
 * <p>Strategy Instrument Leg</p>
 */
public final class StrategyInstrumentLegEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 19;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "StrategyInstrumentLeg";

    /**
     * Group of the Leg Instrument
     */
    private final LegGroupInstrumentField legGroupInstrument = new LegGroupInstrumentField();

    /**
     * Leg Instrument
     */
    private final LegInstrumentField legInstrument = new LegInstrumentField();

    /**
     * Branch
     */
    private final LegRatioOrDeltaFractionPair legRatioOrDeltaFractionPair = new LegRatioOrDeltaFractionPair();

    /**
     * Branch
     */
    private final LegPriceFractionPair legPriceFractionPair = new LegPriceFractionPair();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(legGroupInstrument, legInstrument);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Group of the Leg Instrument
     *
     * @return the LegGroupInstrument field
     */
    public LegGroupInstrumentField legGroupInstrument() {
        return legGroupInstrument;
    }

    /**
     * Leg Instrument
     *
     * @return the LegInstrument field
     */
    public LegInstrumentField legInstrument() {
        return legInstrument;
    }

    /**
     * Branch
     *
     * @return the LegRatioOrDeltaFractionPair record
     */
    public LegRatioOrDeltaFractionPair legRatioOrDeltaFractionPair() {
        return legRatioOrDeltaFractionPair;
    }

    /**
     * Branch
     *
     * @return the LegPriceFractionPair record
     */
    public LegPriceFractionPair legPriceFractionPair() {
        return legPriceFractionPair;
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
        if (!legGroupInstrument.parse(data, cursor)) {
            return false;
        }
        cursor += LegGroupInstrumentField.BYTE_LENGTH;
        if (!legInstrument.parse(data, cursor)) {
            return false;
        }
        cursor += LegInstrumentField.BYTE_LENGTH;
        if (!legRatioOrDeltaFractionPair.parseFrom(data, cursor, end - 8)) {
            return false;
        }
        cursor += legRatioOrDeltaFractionPair.byteLength();
        return legPriceFractionPair.parseFrom(data, cursor, end);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = legGroupInstrument.encode(data, cursor);
        cursor = legInstrument.encode(data, cursor);
        cursor = legRatioOrDeltaFractionPair.encode(data, cursor);
        cursor = legPriceFractionPair.encode(data, cursor);
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
        legRatioOrDeltaFractionPair.clear();
        legPriceFractionPair.clear();
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
        if (!legRatioOrDeltaFractionPair.isRecognized()) {
            return false;
        }
        return legPriceFractionPair.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!legRatioOrDeltaFractionPair.isValid()) {
            return false;
        }
        if (!legPriceFractionPair.isValid()) {
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
            case "LegGroupInstrument" -> Optional.of(legGroupInstrument);
            case "LegInstrument" -> Optional.of(legInstrument);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof StrategyInstrumentLegEntry message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(legRatioOrDeltaFractionPair.diffFields(message.legRatioOrDeltaFractionPair));
        changed.addAll(legPriceFractionPair.diffFields(message.legPriceFractionPair));
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
            legRatioOrDeltaFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            legPriceFractionPair.toFormattedString(builder, options);
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
        legRatioOrDeltaFractionPair.toFormattedString(builder, nested);
        legPriceFractionPair.toFormattedString(builder, nested);
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
        if (!(other instanceof StrategyInstrumentLegEntry message)) {
            return false;
        }
        return fields.equals(message.fields) && legRatioOrDeltaFractionPair.equals(message.legRatioOrDeltaFractionPair) && legPriceFractionPair.equals(message.legPriceFractionPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, legRatioOrDeltaFractionPair, legPriceFractionPair);
    }
}
