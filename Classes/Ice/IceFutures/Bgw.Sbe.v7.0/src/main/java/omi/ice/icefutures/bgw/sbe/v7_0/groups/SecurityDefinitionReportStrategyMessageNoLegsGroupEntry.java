package omi.ice.icefutures.bgw.sbe.v7_0.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LegOptionDeltaField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LegPriceField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LegRatioPriceDenominatorField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LegRatioPriceNumeratorField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LegRatioQtyDenominatorIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LegRatioQtyNumeratorIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LegSecuritySubTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LegSecurityTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LegSideField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LegSymbolIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Field;
import omi.ice.icefutures.bgw.sbe.v7_0.types.GroupEntry;
import omi.ice.icefutures.bgw.sbe.v7_0.types.PrintOptions;

/**
 * One entry of the SecurityDefinitionReportStrategyMessageNoLegsGroup repeating group.
 *
 * <p>noLegs</p>
 */
public final class SecurityDefinitionReportStrategyMessageNoLegsGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 28;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 28;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "SecurityDefinitionReportStrategyMessageNoLegsGroup";

    /**
     * legSymbol
     */
    private final LegSymbolIntField legSymbolInt = new LegSymbolIntField();

    /**
     * legSecurityType
     */
    private final LegSecurityTypeField legSecurityType = new LegSecurityTypeField();

    /**
     * legSecuritySubType
     */
    private final LegSecuritySubTypeField legSecuritySubType = new LegSecuritySubTypeField();

    /**
     * legSide
     */
    private final LegSideField legSide = new LegSideField();

    /**
     * Required if legSecurityType is FUT
     */
    private final LegPriceField legPrice = new LegPriceField();

    /**
     * Required if legSecurityType is FUT or CS
     */
    private final LegOptionDeltaField legOptionDelta = new LegOptionDeltaField();

    /**
     * legRatioQtyDenominator
     */
    private final LegRatioQtyDenominatorIntField legRatioQtyDenominatorInt = new LegRatioQtyDenominatorIntField();

    /**
     * legRatioQtyNumerator
     */
    private final LegRatioQtyNumeratorIntField legRatioQtyNumeratorInt = new LegRatioQtyNumeratorIntField();

    /**
     * legRatioPriceDenominator
     */
    private final LegRatioPriceDenominatorField legRatioPriceDenominator = new LegRatioPriceDenominatorField();

    /**
     * legRatioPriceNumerator
     */
    private final LegRatioPriceNumeratorField legRatioPriceNumerator = new LegRatioPriceNumeratorField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(legSymbolInt, legSecurityType, legSecuritySubType, legSide, legPrice, legOptionDelta, legRatioQtyDenominatorInt, legRatioQtyNumeratorInt, legRatioPriceDenominator, legRatioPriceNumerator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * legSymbol
     *
     * @return the LegSymbolInt field
     */
    public LegSymbolIntField legSymbolInt() {
        return legSymbolInt;
    }

    /**
     * legSecurityType
     *
     * @return the LegSecurityType field
     */
    public LegSecurityTypeField legSecurityType() {
        return legSecurityType;
    }

    /**
     * legSecuritySubType
     *
     * @return the LegSecuritySubType field
     */
    public LegSecuritySubTypeField legSecuritySubType() {
        return legSecuritySubType;
    }

    /**
     * legSide
     *
     * @return the LegSide field
     */
    public LegSideField legSide() {
        return legSide;
    }

    /**
     * Required if legSecurityType is FUT
     *
     * @return the LegPrice field
     */
    public LegPriceField legPrice() {
        return legPrice;
    }

    /**
     * Required if legSecurityType is FUT or CS
     *
     * @return the LegOptionDelta field
     */
    public LegOptionDeltaField legOptionDelta() {
        return legOptionDelta;
    }

    /**
     * legRatioQtyDenominator
     *
     * @return the LegRatioQtyDenominatorInt field
     */
    public LegRatioQtyDenominatorIntField legRatioQtyDenominatorInt() {
        return legRatioQtyDenominatorInt;
    }

    /**
     * legRatioQtyNumerator
     *
     * @return the LegRatioQtyNumeratorInt field
     */
    public LegRatioQtyNumeratorIntField legRatioQtyNumeratorInt() {
        return legRatioQtyNumeratorInt;
    }

    /**
     * legRatioPriceDenominator
     *
     * @return the LegRatioPriceDenominator field
     */
    public LegRatioPriceDenominatorField legRatioPriceDenominator() {
        return legRatioPriceDenominator;
    }

    /**
     * legRatioPriceNumerator
     *
     * @return the LegRatioPriceNumerator field
     */
    public LegRatioPriceNumeratorField legRatioPriceNumerator() {
        return legRatioPriceNumerator;
    }

    private int wireBlock = ROOT_BYTE_LENGTH;

    private byte[] blockTrailer = new byte[0];

    /**
     * Sets the width the wire gives this entry's fixed part, as the list holding it states.
     *
     * @param wireBlock the width in bytes
     */
    public void wireBlock(int wireBlock) {
        this.wireBlock = wireBlock;
    }

    /**
     * Returns the bytes of this entry's known fields that lie wholly inside its block.
     *
     * @return the width in bytes; a field past it is absent
     */
    public int knownBytes() {
        if (wireBlock >= 28) {
            return 28;
        }
        if (wireBlock >= 26) {
            return 26;
        }
        if (wireBlock >= 24) {
            return 24;
        }
        if (wireBlock >= 22) {
            return 22;
        }
        if (wireBlock >= 20) {
            return 20;
        }
        if (wireBlock >= 16) {
            return 16;
        }
        if (wireBlock >= 8) {
            return 8;
        }
        if (wireBlock >= 7) {
            return 7;
        }
        if (wireBlock >= 5) {
            return 5;
        }
        if (wireBlock >= 4) {
            return 4;
        }
        return 0;
    }

    /**
     * Returns what this entry's block held past the fields this class knows.
     *
     * @return a copy of those bytes, empty when the block held no more
     */
    public byte[] blockTrailer() {
        return blockTrailer.clone();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH - ROOT_BYTE_LENGTH + wireBlock;
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
        return parseBlock(data, offset, end, ROOT_BYTE_LENGTH);
    }

    /**
     * Decodes this entry given the width the wire states for its fixed part.
     *
     * @param data   the buffer to decode from
     * @param offset the index of this entry's first byte
     * @param end    the index just past the last byte this entry may read
     * @param block  the width of the fixed part
     * @return true when every field inside the block, and what follows it, decoded
     */
    public boolean parseBlock(byte[] data, int offset, int end, int block) {
        clear();
        this.wireBlock = block;
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH - ROOT_BYTE_LENGTH + wireBlock) {
            return false;
        }

        int cursor = offset;
        int known = knownBytes();
        if (known >= 4) {
            if (!legSymbolInt.parse(data, cursor)) {
                return false;
            }
            cursor += LegSymbolIntField.BYTE_LENGTH;
        }
        if (known >= 5) {
            if (!legSecurityType.parse(data, cursor)) {
                return false;
            }
            cursor += LegSecurityTypeField.BYTE_LENGTH;
        }
        if (known >= 7) {
            if (!legSecuritySubType.parse(data, cursor)) {
                return false;
            }
            cursor += LegSecuritySubTypeField.BYTE_LENGTH;
        }
        if (known >= 8) {
            if (!legSide.parse(data, cursor)) {
                return false;
            }
            cursor += LegSideField.BYTE_LENGTH;
        }
        if (known >= 16) {
            if (!legPrice.parse(data, cursor)) {
                return false;
            }
            cursor += LegPriceField.BYTE_LENGTH;
        }
        if (known >= 20) {
            if (!legOptionDelta.parse(data, cursor)) {
                return false;
            }
            cursor += LegOptionDeltaField.BYTE_LENGTH;
        }
        if (known >= 22) {
            if (!legRatioQtyDenominatorInt.parse(data, cursor)) {
                return false;
            }
            cursor += LegRatioQtyDenominatorIntField.BYTE_LENGTH;
        }
        if (known >= 24) {
            if (!legRatioQtyNumeratorInt.parse(data, cursor)) {
                return false;
            }
            cursor += LegRatioQtyNumeratorIntField.BYTE_LENGTH;
        }
        if (known >= 26) {
            if (!legRatioPriceDenominator.parse(data, cursor)) {
                return false;
            }
            cursor += LegRatioPriceDenominatorField.BYTE_LENGTH;
        }
        if (known >= 28) {
            if (!legRatioPriceNumerator.parse(data, cursor)) {
                return false;
            }
            cursor += LegRatioPriceNumeratorField.BYTE_LENGTH;
        }
        if (wireBlock > known) {
            this.blockTrailer = Arrays.copyOfRange(data, offset + known, offset + wireBlock);
        }
        cursor = offset + wireBlock;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        int known = knownBytes();
        if (known >= 4) {
            cursor = legSymbolInt.encode(data, cursor);
        }
        if (known >= 5) {
            cursor = legSecurityType.encode(data, cursor);
        }
        if (known >= 7) {
            cursor = legSecuritySubType.encode(data, cursor);
        }
        if (known >= 8) {
            cursor = legSide.encode(data, cursor);
        }
        if (known >= 16) {
            cursor = legPrice.encode(data, cursor);
        }
        if (known >= 20) {
            cursor = legOptionDelta.encode(data, cursor);
        }
        if (known >= 22) {
            cursor = legRatioQtyDenominatorInt.encode(data, cursor);
        }
        if (known >= 24) {
            cursor = legRatioQtyNumeratorInt.encode(data, cursor);
        }
        if (known >= 26) {
            cursor = legRatioPriceDenominator.encode(data, cursor);
        }
        if (known >= 28) {
            cursor = legRatioPriceNumerator.encode(data, cursor);
        }
        int kept = Math.min(blockTrailer.length, wireBlock - known);
        System.arraycopy(blockTrailer, 0, data, offset + known, kept);
        Arrays.fill(data, offset + known + kept, offset + wireBlock, (byte) 0);
        cursor = offset + wireBlock;
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
        this.blockTrailer = new byte[0];
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
            if ((!decoded || field.hasValue()) && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if ((!decoded || field.hasValue()) && !field.isValid()) {
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
            case "LegSymbolInt" -> Optional.of(legSymbolInt);
            case "LegSecurityType" -> Optional.of(legSecurityType);
            case "LegSecuritySubType" -> Optional.of(legSecuritySubType);
            case "LegSide" -> Optional.of(legSide);
            case "LegPrice" -> Optional.of(legPrice);
            case "LegOptionDelta" -> Optional.of(legOptionDelta);
            case "LegRatioQtyDenominatorInt" -> Optional.of(legRatioQtyDenominatorInt);
            case "LegRatioQtyNumeratorInt" -> Optional.of(legRatioQtyNumeratorInt);
            case "LegRatioPriceDenominator" -> Optional.of(legRatioPriceDenominator);
            case "LegRatioPriceNumerator" -> Optional.of(legRatioPriceNumerator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof SecurityDefinitionReportStrategyMessageNoLegsGroupEntry message)) {
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
        if (!(other instanceof SecurityDefinitionReportStrategyMessageNoLegsGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
