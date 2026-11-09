package omi.cme.globex.ilink3.sbe.v8_5.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LegExecIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LegLastPxField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LegLastQtyField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LegSecurityIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LegSideField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LegTradeIdField;
import omi.cme.globex.ilink3.sbe.v8_5.types.Field;
import omi.cme.globex.ilink3.sbe.v8_5.types.GroupEntry;
import omi.cme.globex.ilink3.sbe.v8_5.types.PrintOptions;

/**
 * One entry of the TradeLegsGroup repeating group.
 *
 * <p>Number of Leg executions; Will currently be set to 0 and in future will contain the leg fills for the spread when spread leg fills are consolidated with the spread fill as a single message</p>
 */
public final class TradeLegsGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 29;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 29;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "TradeLegsGroup";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * The ExecID (17) value corresponding to a trade leg.
     */
    private final LegExecIdField legExecId = new LegExecIdField();

    /**
     * Execution price assigned to a leg of a multileg instrument
     */
    private final LegLastPxField legLastPx = new LegLastPxField();

    /**
     * Multileg instrument's individual security's SecurityID
     */
    private final LegSecurityIdField legSecurityId = new LegSecurityIdField();

    /**
     * The TradeID value corresponding to a trade leg
     */
    private final LegTradeIdField legTradeId = new LegTradeIdField();

    /**
     * Fill quantity for the leg instrument
     */
    private final LegLastQtyField legLastQty = new LegLastQtyField();

    /**
     * The side of this individual leg of a multileg security
     */
    private final LegSideField legSide = new LegSideField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(legExecId, legLastPx, legSecurityId, legTradeId, legLastQty, legSide);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The ExecID (17) value corresponding to a trade leg.
     *
     * @return the LegExecId field
     */
    public LegExecIdField legExecId() {
        return legExecId;
    }

    /**
     * Execution price assigned to a leg of a multileg instrument
     *
     * @return the LegLastPx field
     */
    public LegLastPxField legLastPx() {
        return legLastPx;
    }

    /**
     * Multileg instrument's individual security's SecurityID
     *
     * @return the LegSecurityId field
     */
    public LegSecurityIdField legSecurityId() {
        return legSecurityId;
    }

    /**
     * The TradeID value corresponding to a trade leg
     *
     * @return the LegTradeId field
     */
    public LegTradeIdField legTradeId() {
        return legTradeId;
    }

    /**
     * Fill quantity for the leg instrument
     *
     * @return the LegLastQty field
     */
    public LegLastQtyField legLastQty() {
        return legLastQty;
    }

    /**
     * The side of this individual leg of a multileg security
     *
     * @return the LegSide field
     */
    public LegSideField legSide() {
        return legSide;
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
        if (wireBlock >= 29) {
            return 29;
        }
        if (wireBlock >= 28) {
            return 28;
        }
        if (wireBlock >= 24) {
            return 24;
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
        if (known >= 8) {
            if (!legExecId.parse(data, cursor)) {
                return false;
            }
            cursor += LegExecIdField.BYTE_LENGTH;
        }
        if (known >= 16) {
            if (!legLastPx.parse(data, cursor)) {
                return false;
            }
            cursor += LegLastPxField.BYTE_LENGTH;
        }
        if (known >= 20) {
            if (!legSecurityId.parse(data, cursor)) {
                return false;
            }
            cursor += LegSecurityIdField.BYTE_LENGTH;
        }
        if (known >= 24) {
            if (!legTradeId.parse(data, cursor)) {
                return false;
            }
            cursor += LegTradeIdField.BYTE_LENGTH;
        }
        if (known >= 28) {
            if (!legLastQty.parse(data, cursor)) {
                return false;
            }
            cursor += LegLastQtyField.BYTE_LENGTH;
        }
        if (known >= 29) {
            if (!legSide.parse(data, cursor)) {
                return false;
            }
            cursor += LegSideField.BYTE_LENGTH;
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
        if (known >= 8) {
            cursor = legExecId.encode(data, cursor);
        }
        if (known >= 16) {
            cursor = legLastPx.encode(data, cursor);
        }
        if (known >= 20) {
            cursor = legSecurityId.encode(data, cursor);
        }
        if (known >= 24) {
            cursor = legTradeId.encode(data, cursor);
        }
        if (known >= 28) {
            cursor = legLastQty.encode(data, cursor);
        }
        if (known >= 29) {
            cursor = legSide.encode(data, cursor);
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
            case "LegExecId" -> Optional.of(legExecId);
            case "LegLastPx" -> Optional.of(legLastPx);
            case "LegSecurityId" -> Optional.of(legSecurityId);
            case "LegTradeId" -> Optional.of(legTradeId);
            case "LegLastQty" -> Optional.of(legLastQty);
            case "LegSide" -> Optional.of(legSide);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof TradeLegsGroupEntry message)) {
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
        if (!(other instanceof TradeLegsGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
