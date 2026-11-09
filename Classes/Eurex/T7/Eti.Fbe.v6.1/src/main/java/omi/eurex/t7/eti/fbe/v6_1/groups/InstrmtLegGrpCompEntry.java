package omi.eurex.t7.eti.fbe.v6_1.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eti.fbe.v6_1.fields.LegPriceField;
import omi.eurex.t7.eti.fbe.v6_1.fields.LegRatioQtyField;
import omi.eurex.t7.eti.fbe.v6_1.fields.LegSecurityIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.LegSecurityTypeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.LegSideField;
import omi.eurex.t7.eti.fbe.v6_1.fields.LegSymbolField;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.GroupEntry;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * One entry of the InstrmtLegGrpComp repeating group.
 *
 * <p>Instrmt Leg Grp Comp</p>
 */
public final class InstrmtLegGrpCompEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 32;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "InstrmtLegGrpComp";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 26, 6 };

    /**
     * Leg Security Id
     */
    private final LegSecurityIdField legSecurityId = new LegSecurityIdField();

    /**
     * Leg Price
     */
    private final LegPriceField legPrice = new LegPriceField();

    /**
     * Leg Symbol
     */
    private final LegSymbolField legSymbol = new LegSymbolField();

    /**
     * Leg Ratio Qty
     */
    private final LegRatioQtyField legRatioQty = new LegRatioQtyField();

    /**
     * Leg Side
     */
    private final LegSideField legSide = new LegSideField();

    /**
     * Leg Security Type
     */
    private final LegSecurityTypeField legSecurityType = new LegSecurityTypeField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(legSecurityId, legPrice, legSymbol, legRatioQty, legSide, legSecurityType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Leg Security Id
     *
     * @return the LegSecurityId field
     */
    public LegSecurityIdField legSecurityId() {
        return legSecurityId;
    }

    /**
     * Leg Price
     *
     * @return the LegPrice field
     */
    public LegPriceField legPrice() {
        return legPrice;
    }

    /**
     * Leg Symbol
     *
     * @return the LegSymbol field
     */
    public LegSymbolField legSymbol() {
        return legSymbol;
    }

    /**
     * Leg Ratio Qty
     *
     * @return the LegRatioQty field
     */
    public LegRatioQtyField legRatioQty() {
        return legRatioQty;
    }

    /**
     * Leg Side
     *
     * @return the LegSide field
     */
    public LegSideField legSide() {
        return legSide;
    }

    /**
     * Leg Security Type
     *
     * @return the LegSecurityType field
     */
    public LegSecurityTypeField legSecurityType() {
        return legSecurityType;
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
        if (!legSecurityId.parse(data, cursor)) {
            return false;
        }
        cursor += LegSecurityIdField.BYTE_LENGTH;
        if (!legPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LegPriceField.BYTE_LENGTH;
        if (!legSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += LegSymbolField.BYTE_LENGTH;
        if (!legRatioQty.parse(data, cursor)) {
            return false;
        }
        cursor += LegRatioQtyField.BYTE_LENGTH;
        if (!legSide.parse(data, cursor)) {
            return false;
        }
        cursor += LegSideField.BYTE_LENGTH;
        if (!legSecurityType.parse(data, cursor)) {
            return false;
        }
        cursor += LegSecurityTypeField.BYTE_LENGTH;
        cursor += 6; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = legSecurityId.encode(data, cursor);
        cursor = legPrice.encode(data, cursor);
        cursor = legSymbol.encode(data, cursor);
        cursor = legRatioQty.encode(data, cursor);
        cursor = legSide.encode(data, cursor);
        cursor = legSecurityType.encode(data, cursor);
        if (buffer != null && buffer.length >= 26 + 6) {
            System.arraycopy(buffer, 26, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
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
            case "LegSecurityId" -> Optional.of(legSecurityId);
            case "LegPrice" -> Optional.of(legPrice);
            case "LegSymbol" -> Optional.of(legSymbol);
            case "LegRatioQty" -> Optional.of(legRatioQty);
            case "LegSide" -> Optional.of(legSide);
            case "LegSecurityType" -> Optional.of(legSecurityType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof InstrmtLegGrpCompEntry message)) {
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
        if (!(other instanceof InstrmtLegGrpCompEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
