package omi.ice.icefutures.mdf.impact.v1_1_24.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.HedgeBodyLengthField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.HedgeDeltaField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.HedgeMarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.HedgePriceDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.HedgePriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.HedgeSecurityTypeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.HedgeSideField;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.GroupEntry;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.PrintOptions;

/**
 * One entry of the HedgeDefinition repeating group.
 *
 * <p>Hedge Definition</p>
 */
public final class HedgeDefinitionEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 18;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "HedgeDefinition";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Message length, including this field, for a hedge
     */
    private final HedgeBodyLengthField hedgeBodyLength = new HedgeBodyLengthField();

    /**
     * Future’s market id of the hedge
     */
    private final HedgeMarketIdField hedgeMarketId = new HedgeMarketIdField();

    /**
     * Hedge security Type
     */
    private final HedgeSecurityTypeField hedgeSecurityType = new HedgeSecurityTypeField();

    /**
     * Hedge Side
     */
    private final HedgeSideField hedgeSide = new HedgeSideField();

    /**
     * Hedge Price
     */
    private final HedgePriceField hedgePrice = new HedgePriceField();

    /**
     * Hedge Price Denominator
     */
    private final HedgePriceDenominatorField hedgePriceDenominator = new HedgePriceDenominatorField();

    /**
     * Hedge Delta
     */
    private final HedgeDeltaField hedgeDelta = new HedgeDeltaField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(hedgeBodyLength, hedgeMarketId, hedgeSecurityType, hedgeSide, hedgePrice, hedgePriceDenominator, hedgeDelta);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message length, including this field, for a hedge
     *
     * @return the HedgeBodyLength field
     */
    public HedgeBodyLengthField hedgeBodyLength() {
        return hedgeBodyLength;
    }

    /**
     * Future’s market id of the hedge
     *
     * @return the HedgeMarketId field
     */
    public HedgeMarketIdField hedgeMarketId() {
        return hedgeMarketId;
    }

    /**
     * Hedge security Type
     *
     * @return the HedgeSecurityType field
     */
    public HedgeSecurityTypeField hedgeSecurityType() {
        return hedgeSecurityType;
    }

    /**
     * Hedge Side
     *
     * @return the HedgeSide field
     */
    public HedgeSideField hedgeSide() {
        return hedgeSide;
    }

    /**
     * Hedge Price
     *
     * @return the HedgePrice field
     */
    public HedgePriceField hedgePrice() {
        return hedgePrice;
    }

    /**
     * Hedge Price Denominator
     *
     * @return the HedgePriceDenominator field
     */
    public HedgePriceDenominatorField hedgePriceDenominator() {
        return hedgePriceDenominator;
    }

    /**
     * Hedge Delta
     *
     * @return the HedgeDelta field
     */
    public HedgeDeltaField hedgeDelta() {
        return hedgeDelta;
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
        if (!hedgeBodyLength.parse(data, cursor)) {
            return false;
        }
        cursor += HedgeBodyLengthField.BYTE_LENGTH;
        if (!hedgeMarketId.parse(data, cursor)) {
            return false;
        }
        cursor += HedgeMarketIdField.BYTE_LENGTH;
        if (!hedgeSecurityType.parse(data, cursor)) {
            return false;
        }
        cursor += HedgeSecurityTypeField.BYTE_LENGTH;
        if (!hedgeSide.parse(data, cursor)) {
            return false;
        }
        cursor += HedgeSideField.BYTE_LENGTH;
        if (!hedgePrice.parse(data, cursor)) {
            return false;
        }
        cursor += HedgePriceField.BYTE_LENGTH;
        if (!hedgePriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += HedgePriceDenominatorField.BYTE_LENGTH;
        if (!hedgeDelta.parse(data, cursor)) {
            return false;
        }
        cursor += HedgeDeltaField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = hedgeBodyLength.encode(data, cursor);
        cursor = hedgeMarketId.encode(data, cursor);
        cursor = hedgeSecurityType.encode(data, cursor);
        cursor = hedgeSide.encode(data, cursor);
        cursor = hedgePrice.encode(data, cursor);
        cursor = hedgePriceDenominator.encode(data, cursor);
        cursor = hedgeDelta.encode(data, cursor);
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
            case "HedgeBodyLength" -> Optional.of(hedgeBodyLength);
            case "HedgeMarketId" -> Optional.of(hedgeMarketId);
            case "HedgeSecurityType" -> Optional.of(hedgeSecurityType);
            case "HedgeSide" -> Optional.of(hedgeSide);
            case "HedgePrice" -> Optional.of(hedgePrice);
            case "HedgePriceDenominator" -> Optional.of(hedgePriceDenominator);
            case "HedgeDelta" -> Optional.of(hedgeDelta);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof HedgeDefinitionEntry message)) {
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
        if (!(other instanceof HedgeDefinitionEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
