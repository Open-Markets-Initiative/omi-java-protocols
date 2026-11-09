package omi.eurex.t7.eti.fbe.v6_1.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eti.fbe.v6_1.fields.FillExecIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.FillLiquidityIndField;
import omi.eurex.t7.eti.fbe.v6_1.fields.FillMatchIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.FillPxField;
import omi.eurex.t7.eti.fbe.v6_1.fields.FillQtyField;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.GroupEntry;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * One entry of the FillsGrpComp repeating group.
 *
 * <p>Fills Grp Comp</p>
 */
public final class FillsGrpCompEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 24;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "FillsGrpComp";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 21, 3 };

    /**
     * Fill Px
     */
    private final FillPxField fillPx = new FillPxField();

    /**
     * Fill Qty
     */
    private final FillQtyField fillQty = new FillQtyField();

    /**
     * Fill Match Id
     */
    private final FillMatchIdField fillMatchId = new FillMatchIdField();

    /**
     * Fill Exec Id
     */
    private final FillExecIdField fillExecId = new FillExecIdField();

    /**
     * Fill Liquidity Ind
     */
    private final FillLiquidityIndField fillLiquidityInd = new FillLiquidityIndField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(fillPx, fillQty, fillMatchId, fillExecId, fillLiquidityInd);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Fill Px
     *
     * @return the FillPx field
     */
    public FillPxField fillPx() {
        return fillPx;
    }

    /**
     * Fill Qty
     *
     * @return the FillQty field
     */
    public FillQtyField fillQty() {
        return fillQty;
    }

    /**
     * Fill Match Id
     *
     * @return the FillMatchId field
     */
    public FillMatchIdField fillMatchId() {
        return fillMatchId;
    }

    /**
     * Fill Exec Id
     *
     * @return the FillExecId field
     */
    public FillExecIdField fillExecId() {
        return fillExecId;
    }

    /**
     * Fill Liquidity Ind
     *
     * @return the FillLiquidityInd field
     */
    public FillLiquidityIndField fillLiquidityInd() {
        return fillLiquidityInd;
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
        return PADDING.clone();
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
        if (!fillPx.parse(data, cursor)) {
            return false;
        }
        cursor += FillPxField.BYTE_LENGTH;
        if (!fillQty.parse(data, cursor)) {
            return false;
        }
        cursor += FillQtyField.BYTE_LENGTH;
        if (!fillMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += FillMatchIdField.BYTE_LENGTH;
        if (!fillExecId.parse(data, cursor)) {
            return false;
        }
        cursor += FillExecIdField.BYTE_LENGTH;
        if (!fillLiquidityInd.parse(data, cursor)) {
            return false;
        }
        cursor += FillLiquidityIndField.BYTE_LENGTH;
        cursor += 3; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = fillPx.encode(data, cursor);
        cursor = fillQty.encode(data, cursor);
        cursor = fillMatchId.encode(data, cursor);
        cursor = fillExecId.encode(data, cursor);
        cursor = fillLiquidityInd.encode(data, cursor);
        if (buffer != null && buffer.length >= 21 + 3) {
            System.arraycopy(buffer, 21, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
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
            case "FillPx" -> Optional.of(fillPx);
            case "FillQty" -> Optional.of(fillQty);
            case "FillMatchId" -> Optional.of(fillMatchId);
            case "FillExecId" -> Optional.of(fillExecId);
            case "FillLiquidityInd" -> Optional.of(fillLiquidityInd);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof FillsGrpCompEntry message)) {
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
        if (!(other instanceof FillsGrpCompEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
