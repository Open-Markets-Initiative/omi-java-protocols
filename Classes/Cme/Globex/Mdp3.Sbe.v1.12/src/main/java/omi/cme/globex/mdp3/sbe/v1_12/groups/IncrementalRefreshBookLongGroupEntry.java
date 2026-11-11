package omi.cme.globex.mdp3.sbe.v1_12.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MdEntryPxOptionalExField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MdEntrySizeOptionalField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MdEntryTypeBookField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MdPriceLevelField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.MdUpdateActionField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.NumberOfOrdersOptionalField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.RptSeqField;
import omi.cme.globex.mdp3.sbe.v1_12.fields.SecurityIdField;
import omi.cme.globex.mdp3.sbe.v1_12.types.Field;
import omi.cme.globex.mdp3.sbe.v1_12.types.GroupEntry;
import omi.cme.globex.mdp3.sbe.v1_12.types.PrintOptions;

/**
 * One entry of the IncrementalRefreshBookLongGroup repeating group.
 *
 * <p>Number of entries in Market Data message.</p>
 */
public final class IncrementalRefreshBookLongGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 32;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 32;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "IncrementalRefreshBookLongGroup";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 31, 1 };

    /**
     * Workup price
     */
    private final MdEntryPxOptionalExField mdEntryPxOptionalEx = new MdEntryPxOptionalExField();

    /**
     * Aggregate booked qty at price level, notional
     */
    private final MdEntrySizeOptionalField mdEntrySizeOptional = new MdEntrySizeOptionalField();

    /**
     * Security ID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Sequence number of the last Market Data entry processed for the instrument
     */
    private final RptSeqField rptSeq = new RptSeqField();

    /**
     * In Book entry - aggregate number of orders at given price level
     */
    private final NumberOfOrdersOptionalField numberOfOrdersOptional = new NumberOfOrdersOptionalField();

    /**
     * Aggregate book level
     */
    private final MdPriceLevelField mdPriceLevel = new MdPriceLevelField();

    /**
     * Market Data update action
     */
    private final MdUpdateActionField mdUpdateAction = new MdUpdateActionField();

    /**
     * Market Data entry type
     */
    private final MdEntryTypeBookField mdEntryTypeBook = new MdEntryTypeBookField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(mdEntryPxOptionalEx, mdEntrySizeOptional, securityId, rptSeq, numberOfOrdersOptional, mdPriceLevel, mdUpdateAction, mdEntryTypeBook);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Workup price
     *
     * @return the MdEntryPxOptionalEx field
     */
    public MdEntryPxOptionalExField mdEntryPxOptionalEx() {
        return mdEntryPxOptionalEx;
    }

    /**
     * Aggregate booked qty at price level, notional
     *
     * @return the MdEntrySizeOptional field
     */
    public MdEntrySizeOptionalField mdEntrySizeOptional() {
        return mdEntrySizeOptional;
    }

    /**
     * Security ID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Sequence number of the last Market Data entry processed for the instrument
     *
     * @return the RptSeq field
     */
    public RptSeqField rptSeq() {
        return rptSeq;
    }

    /**
     * In Book entry - aggregate number of orders at given price level
     *
     * @return the NumberOfOrdersOptional field
     */
    public NumberOfOrdersOptionalField numberOfOrdersOptional() {
        return numberOfOrdersOptional;
    }

    /**
     * Aggregate book level
     *
     * @return the MdPriceLevel field
     */
    public MdPriceLevelField mdPriceLevel() {
        return mdPriceLevel;
    }

    /**
     * Market Data update action
     *
     * @return the MdUpdateAction field
     */
    public MdUpdateActionField mdUpdateAction() {
        return mdUpdateAction;
    }

    /**
     * Market Data entry type
     *
     * @return the MdEntryTypeBook field
     */
    public MdEntryTypeBookField mdEntryTypeBook() {
        return mdEntryTypeBook;
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
        if (wireBlock >= 32) {
            return 32;
        }
        if (wireBlock >= 31) {
            return 31;
        }
        if (wireBlock >= 30) {
            return 30;
        }
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
            if (!mdEntryPxOptionalEx.parse(data, cursor)) {
                return false;
            }
            cursor += MdEntryPxOptionalExField.BYTE_LENGTH;
        }
        if (known >= 16) {
            if (!mdEntrySizeOptional.parse(data, cursor)) {
                return false;
            }
            cursor += MdEntrySizeOptionalField.BYTE_LENGTH;
        }
        if (known >= 20) {
            if (!securityId.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityIdField.BYTE_LENGTH;
        }
        if (known >= 24) {
            if (!rptSeq.parse(data, cursor)) {
                return false;
            }
            cursor += RptSeqField.BYTE_LENGTH;
        }
        if (known >= 28) {
            if (!numberOfOrdersOptional.parse(data, cursor)) {
                return false;
            }
            cursor += NumberOfOrdersOptionalField.BYTE_LENGTH;
        }
        if (known >= 29) {
            if (!mdPriceLevel.parse(data, cursor)) {
                return false;
            }
            cursor += MdPriceLevelField.BYTE_LENGTH;
        }
        if (known >= 30) {
            if (!mdUpdateAction.parse(data, cursor)) {
                return false;
            }
            cursor += MdUpdateActionField.BYTE_LENGTH;
        }
        if (known >= 31) {
            if (!mdEntryTypeBook.parse(data, cursor)) {
                return false;
            }
            cursor += MdEntryTypeBookField.BYTE_LENGTH;
        }
        if (known >= 32) {
            cursor += 1; // padding
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
            cursor = mdEntryPxOptionalEx.encode(data, cursor);
        }
        if (known >= 16) {
            cursor = mdEntrySizeOptional.encode(data, cursor);
        }
        if (known >= 20) {
            cursor = securityId.encode(data, cursor);
        }
        if (known >= 24) {
            cursor = rptSeq.encode(data, cursor);
        }
        if (known >= 28) {
            cursor = numberOfOrdersOptional.encode(data, cursor);
        }
        if (known >= 29) {
            cursor = mdPriceLevel.encode(data, cursor);
        }
        if (known >= 30) {
            cursor = mdUpdateAction.encode(data, cursor);
        }
        if (known >= 31) {
            cursor = mdEntryTypeBook.encode(data, cursor);
        }
        if (known >= 32) {
            if (buffer != null && buffer.length >= 32) {
                System.arraycopy(buffer, 31, data, cursor, 1); // padding
            } else {
                Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
            }
            cursor += 1;
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
            case "MdEntryPxOptionalEx" -> Optional.of(mdEntryPxOptionalEx);
            case "MdEntrySizeOptional" -> Optional.of(mdEntrySizeOptional);
            case "SecurityId" -> Optional.of(securityId);
            case "RptSeq" -> Optional.of(rptSeq);
            case "NumberOfOrdersOptional" -> Optional.of(numberOfOrdersOptional);
            case "MdPriceLevel" -> Optional.of(mdPriceLevel);
            case "MdUpdateAction" -> Optional.of(mdUpdateAction);
            case "MdEntryTypeBook" -> Optional.of(mdEntryTypeBook);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof IncrementalRefreshBookLongGroupEntry message)) {
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
        if (!(other instanceof IncrementalRefreshBookLongGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
