package omi.ice.icefutures.mdf.impact.v1_1_33.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.LegBodyLengthField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.LegMarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.LegRatioField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.LegRatioPriceDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.LegRatioPriceNumeratorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.LegRatioQtyDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.LegRatioQtyNumeratorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.LegSideField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.LegStrategyCodeField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.LegUnderlyingMarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.GroupEntry;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.PrintOptions;

/**
 * One entry of the StrategyLegDefinition repeating group.
 *
 * <p>Strategy Leg Definition</p>
 */
public final class StrategyLegDefinitionEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 30;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "StrategyLegDefinition";

    /**
     * Message length, including this field, for a leg
     */
    private final LegBodyLengthField legBodyLength = new LegBodyLengthField();

    /**
     * Market Id of the futures leg
     */
    private final LegMarketIdField legMarketId = new LegMarketIdField();

    /**
     * Futures market id of the underlying futures market
     */
    private final LegUnderlyingMarketIdField legUnderlyingMarketId = new LegUnderlyingMarketIdField();

    /**
     * Number of futures contracts per increment quantity.
     */
    private final LegRatioField legRatio = new LegRatioField();

    /**
     * Number of futures contracts per increment quantity.
     */
    private final LegSideField legSide = new LegSideField();

    /**
     * Leg Strategy Code
     */
    private final LegStrategyCodeField legStrategyCode = new LegStrategyCodeField();

    /**
     * Leg Ratio Qty Numerator
     */
    private final LegRatioQtyNumeratorField legRatioQtyNumerator = new LegRatioQtyNumeratorField();

    /**
     * Leg Ratio Qty Denominator
     */
    private final LegRatioQtyDenominatorField legRatioQtyDenominator = new LegRatioQtyDenominatorField();

    /**
     * Leg Ratio Price Numerator
     */
    private final LegRatioPriceNumeratorField legRatioPriceNumerator = new LegRatioPriceNumeratorField();

    /**
     * Leg Ratio Price Denominator
     */
    private final LegRatioPriceDenominatorField legRatioPriceDenominator = new LegRatioPriceDenominatorField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(legBodyLength, legMarketId, legUnderlyingMarketId, legRatio, legSide, legStrategyCode, legRatioQtyNumerator, legRatioQtyDenominator, legRatioPriceNumerator, legRatioPriceDenominator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message length, including this field, for a leg
     *
     * @return the LegBodyLength field
     */
    public LegBodyLengthField legBodyLength() {
        return legBodyLength;
    }

    /**
     * Market Id of the futures leg
     *
     * @return the LegMarketId field
     */
    public LegMarketIdField legMarketId() {
        return legMarketId;
    }

    /**
     * Futures market id of the underlying futures market
     *
     * @return the LegUnderlyingMarketId field
     */
    public LegUnderlyingMarketIdField legUnderlyingMarketId() {
        return legUnderlyingMarketId;
    }

    /**
     * Number of futures contracts per increment quantity.
     *
     * @return the LegRatio field
     */
    public LegRatioField legRatio() {
        return legRatio;
    }

    /**
     * Number of futures contracts per increment quantity.
     *
     * @return the LegSide field
     */
    public LegSideField legSide() {
        return legSide;
    }

    /**
     * Leg Strategy Code
     *
     * @return the LegStrategyCode field
     */
    public LegStrategyCodeField legStrategyCode() {
        return legStrategyCode;
    }

    /**
     * Leg Ratio Qty Numerator
     *
     * @return the LegRatioQtyNumerator field
     */
    public LegRatioQtyNumeratorField legRatioQtyNumerator() {
        return legRatioQtyNumerator;
    }

    /**
     * Leg Ratio Qty Denominator
     *
     * @return the LegRatioQtyDenominator field
     */
    public LegRatioQtyDenominatorField legRatioQtyDenominator() {
        return legRatioQtyDenominator;
    }

    /**
     * Leg Ratio Price Numerator
     *
     * @return the LegRatioPriceNumerator field
     */
    public LegRatioPriceNumeratorField legRatioPriceNumerator() {
        return legRatioPriceNumerator;
    }

    /**
     * Leg Ratio Price Denominator
     *
     * @return the LegRatioPriceDenominator field
     */
    public LegRatioPriceDenominatorField legRatioPriceDenominator() {
        return legRatioPriceDenominator;
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
        if (!legBodyLength.parse(data, cursor)) {
            return false;
        }
        cursor += LegBodyLengthField.BYTE_LENGTH;
        if (!legMarketId.parse(data, cursor)) {
            return false;
        }
        cursor += LegMarketIdField.BYTE_LENGTH;
        if (!legUnderlyingMarketId.parse(data, cursor)) {
            return false;
        }
        cursor += LegUnderlyingMarketIdField.BYTE_LENGTH;
        if (!legRatio.parse(data, cursor)) {
            return false;
        }
        cursor += LegRatioField.BYTE_LENGTH;
        if (!legSide.parse(data, cursor)) {
            return false;
        }
        cursor += LegSideField.BYTE_LENGTH;
        if (!legStrategyCode.parse(data, cursor)) {
            return false;
        }
        cursor += LegStrategyCodeField.BYTE_LENGTH;
        if (!legRatioQtyNumerator.parse(data, cursor)) {
            return false;
        }
        cursor += LegRatioQtyNumeratorField.BYTE_LENGTH;
        if (!legRatioQtyDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += LegRatioQtyDenominatorField.BYTE_LENGTH;
        if (!legRatioPriceNumerator.parse(data, cursor)) {
            return false;
        }
        cursor += LegRatioPriceNumeratorField.BYTE_LENGTH;
        return legRatioPriceDenominator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = legBodyLength.encode(data, cursor);
        cursor = legMarketId.encode(data, cursor);
        cursor = legUnderlyingMarketId.encode(data, cursor);
        cursor = legRatio.encode(data, cursor);
        cursor = legSide.encode(data, cursor);
        cursor = legStrategyCode.encode(data, cursor);
        cursor = legRatioQtyNumerator.encode(data, cursor);
        cursor = legRatioQtyDenominator.encode(data, cursor);
        cursor = legRatioPriceNumerator.encode(data, cursor);
        cursor = legRatioPriceDenominator.encode(data, cursor);
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
            case "LegBodyLength" -> Optional.of(legBodyLength);
            case "LegMarketId" -> Optional.of(legMarketId);
            case "LegUnderlyingMarketId" -> Optional.of(legUnderlyingMarketId);
            case "LegRatio" -> Optional.of(legRatio);
            case "LegSide" -> Optional.of(legSide);
            case "LegStrategyCode" -> Optional.of(legStrategyCode);
            case "LegRatioQtyNumerator" -> Optional.of(legRatioQtyNumerator);
            case "LegRatioQtyDenominator" -> Optional.of(legRatioQtyDenominator);
            case "LegRatioPriceNumerator" -> Optional.of(legRatioPriceNumerator);
            case "LegRatioPriceDenominator" -> Optional.of(legRatioPriceDenominator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof StrategyLegDefinitionEntry message)) {
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
        if (!(other instanceof StrategyLegDefinitionEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
