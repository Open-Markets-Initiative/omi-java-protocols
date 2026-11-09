package omi.cme.globex.mdp3.sbe.v1_8.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.mdp3.sbe.v1_8.fields.LegOptionDeltaField;
import omi.cme.globex.mdp3.sbe.v1_8.fields.LegPriceField;
import omi.cme.globex.mdp3.sbe.v1_8.fields.LegRatioQtyField;
import omi.cme.globex.mdp3.sbe.v1_8.fields.LegSecurityIdField;
import omi.cme.globex.mdp3.sbe.v1_8.fields.LegSideField;
import omi.cme.globex.mdp3.sbe.v1_8.types.Field;
import omi.cme.globex.mdp3.sbe.v1_8.types.GroupEntry;
import omi.cme.globex.mdp3.sbe.v1_8.types.PrintOptions;

/**
 * One entry of the LegacyLegsGroup repeating group.
 *
 * <p>Number of Leg entries</p>
 */
public final class LegacyLegsGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 18;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 18;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "LegacyLegsGroup";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Leg Security ID
     */
    private final LegSecurityIdField legSecurityId = new LegSecurityIdField();

    /**
     * Leg side
     */
    private final LegSideField legSide = new LegSideField();

    /**
     * Leg ratio of quantity for this individual leg relative to the entire multi-leg instrument
     */
    private final LegRatioQtyField legRatioQty = new LegRatioQtyField();

    /**
     * Price for the future leg of a UDS Covered instrument
     */
    private final LegPriceField legPrice = new LegPriceField();

    /**
     * Delta used to calculate the quantity of futures used to cover the option or option strategy
     */
    private final LegOptionDeltaField legOptionDelta = new LegOptionDeltaField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(legSecurityId, legSide, legRatioQty, legPrice, legOptionDelta);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Leg Security ID
     *
     * @return the LegSecurityId field
     */
    public LegSecurityIdField legSecurityId() {
        return legSecurityId;
    }

    /**
     * Leg side
     *
     * @return the LegSide field
     */
    public LegSideField legSide() {
        return legSide;
    }

    /**
     * Leg ratio of quantity for this individual leg relative to the entire multi-leg instrument
     *
     * @return the LegRatioQty field
     */
    public LegRatioQtyField legRatioQty() {
        return legRatioQty;
    }

    /**
     * Price for the future leg of a UDS Covered instrument
     *
     * @return the LegPrice field
     */
    public LegPriceField legPrice() {
        return legPrice;
    }

    /**
     * Delta used to calculate the quantity of futures used to cover the option or option strategy
     *
     * @return the LegOptionDelta field
     */
    public LegOptionDeltaField legOptionDelta() {
        return legOptionDelta;
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
        if (wireBlock >= 18) {
            return 18;
        }
        if (wireBlock >= 14) {
            return 14;
        }
        if (wireBlock >= 6) {
            return 6;
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
        return PADDING.clone();
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
            if (!legSecurityId.parse(data, cursor)) {
                return false;
            }
            cursor += LegSecurityIdField.BYTE_LENGTH;
        }
        if (known >= 5) {
            if (!legSide.parse(data, cursor)) {
                return false;
            }
            cursor += LegSideField.BYTE_LENGTH;
        }
        if (known >= 6) {
            if (!legRatioQty.parse(data, cursor)) {
                return false;
            }
            cursor += LegRatioQtyField.BYTE_LENGTH;
        }
        if (known >= 14) {
            if (!legPrice.parse(data, cursor)) {
                return false;
            }
            cursor += LegPriceField.BYTE_LENGTH;
        }
        if (known >= 18) {
            if (!legOptionDelta.parse(data, cursor)) {
                return false;
            }
            cursor += LegOptionDeltaField.BYTE_LENGTH;
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
            cursor = legSecurityId.encode(data, cursor);
        }
        if (known >= 5) {
            cursor = legSide.encode(data, cursor);
        }
        if (known >= 6) {
            cursor = legRatioQty.encode(data, cursor);
        }
        if (known >= 14) {
            cursor = legPrice.encode(data, cursor);
        }
        if (known >= 18) {
            cursor = legOptionDelta.encode(data, cursor);
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
            case "LegSecurityId" -> Optional.of(legSecurityId);
            case "LegSide" -> Optional.of(legSide);
            case "LegRatioQty" -> Optional.of(legRatioQty);
            case "LegPrice" -> Optional.of(legPrice);
            case "LegOptionDelta" -> Optional.of(legOptionDelta);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof LegacyLegsGroupEntry message)) {
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
        if (!(other instanceof LegacyLegsGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
