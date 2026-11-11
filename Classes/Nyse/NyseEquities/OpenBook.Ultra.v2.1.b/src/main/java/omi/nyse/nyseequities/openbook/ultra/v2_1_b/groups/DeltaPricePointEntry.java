package omi.nyse.nyseequities.openbook.ultra.v2_1_b.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.ChgQtyField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.LinkId1Field;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.LinkId2Field;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.LinkId3Field;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.NumOrdersField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.PriceNumeratorField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.ReasonCodeField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.SideField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.VolumeField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.Field;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.GroupEntry;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.PrintOptions;

/**
 * One entry of the DeltaPricePoint repeating group.
 *
 * <p>Delta Message Price Point</p>
 */
public final class DeltaPricePointEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 28;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "DeltaPricePoint";

    /**
     * The price (numerator) of this price point. Use the PriceScaleCode to determine the true dollar value of the price point.
     */
    private final PriceNumeratorField priceNumerator = new PriceNumeratorField();

    /**
     * The total interest quantity at this price point.
     */
    private final VolumeField volume = new VolumeField();

    /**
     * The volume of the event taking place (i.e. size of the order, cancel or execution).
     */
    private final ChgQtyField chgQty = new ChgQtyField();

    /**
     * The number of orders at this price point.
     */
    private final NumOrdersField numOrders = new NumOrdersField();

    /**
     * The side of the order, Buy vs Sell.
     */
    private final SideField side = new SideField();

    /**
     * This field identifies why the volume at the price point was modified.
     */
    private final ReasonCodeField reasonCode = new ReasonCodeField();

    /**
     * Unique ID for an execution. Correlates to the Deal ID in the gateway Execution Report msg.
     */
    private final LinkId1Field linkId1 = new LinkId1Field();

    /**
     * Unused. Ignore any content.
     */
    private final LinkId2Field linkId2 = new LinkId2Field();

    /**
     * Unused. Ignore any content.
     */
    private final LinkId3Field linkId3 = new LinkId3Field();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(priceNumerator, volume, chgQty, numOrders, side, reasonCode, linkId1, linkId2, linkId3);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The price (numerator) of this price point. Use the PriceScaleCode to determine the true dollar value of the price point.
     *
     * @return the PriceNumerator field
     */
    public PriceNumeratorField priceNumerator() {
        return priceNumerator;
    }

    /**
     * The total interest quantity at this price point.
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * The volume of the event taking place (i.e. size of the order, cancel or execution).
     *
     * @return the ChgQty field
     */
    public ChgQtyField chgQty() {
        return chgQty;
    }

    /**
     * The number of orders at this price point.
     *
     * @return the NumOrders field
     */
    public NumOrdersField numOrders() {
        return numOrders;
    }

    /**
     * The side of the order, Buy vs Sell.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * This field identifies why the volume at the price point was modified.
     *
     * @return the ReasonCode field
     */
    public ReasonCodeField reasonCode() {
        return reasonCode;
    }

    /**
     * Unique ID for an execution. Correlates to the Deal ID in the gateway Execution Report msg.
     *
     * @return the LinkId1 field
     */
    public LinkId1Field linkId1() {
        return linkId1;
    }

    /**
     * Unused. Ignore any content.
     *
     * @return the LinkId2 field
     */
    public LinkId2Field linkId2() {
        return linkId2;
    }

    /**
     * Unused. Ignore any content.
     *
     * @return the LinkId3 field
     */
    public LinkId3Field linkId3() {
        return linkId3;
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
        if (!priceNumerator.parse(data, cursor)) {
            return false;
        }
        cursor += PriceNumeratorField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!chgQty.parse(data, cursor)) {
            return false;
        }
        cursor += ChgQtyField.BYTE_LENGTH;
        if (!numOrders.parse(data, cursor)) {
            return false;
        }
        cursor += NumOrdersField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!reasonCode.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonCodeField.BYTE_LENGTH;
        if (!linkId1.parse(data, cursor)) {
            return false;
        }
        cursor += LinkId1Field.BYTE_LENGTH;
        if (!linkId2.parse(data, cursor)) {
            return false;
        }
        cursor += LinkId2Field.BYTE_LENGTH;
        return linkId3.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = priceNumerator.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = chgQty.encode(data, cursor);
        cursor = numOrders.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = reasonCode.encode(data, cursor);
        cursor = linkId1.encode(data, cursor);
        cursor = linkId2.encode(data, cursor);
        cursor = linkId3.encode(data, cursor);
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
            case "PriceNumerator" -> Optional.of(priceNumerator);
            case "Volume" -> Optional.of(volume);
            case "ChgQty" -> Optional.of(chgQty);
            case "NumOrders" -> Optional.of(numOrders);
            case "Side" -> Optional.of(side);
            case "ReasonCode" -> Optional.of(reasonCode);
            case "LinkId1" -> Optional.of(linkId1);
            case "LinkId2" -> Optional.of(linkId2);
            case "LinkId3" -> Optional.of(linkId3);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof DeltaPricePointEntry message)) {
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
        if (!(other instanceof DeltaPricePointEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
