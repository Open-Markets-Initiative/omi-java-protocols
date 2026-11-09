package omi.cme.globex.mdp3.sbe.v1_8.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.mdp3.sbe.v1_8.fields.MdEntryPxOptionalField;
import omi.cme.globex.mdp3.sbe.v1_8.fields.MdEntrySizeOptionalField;
import omi.cme.globex.mdp3.sbe.v1_8.fields.MdEntryTypeField;
import omi.cme.globex.mdp3.sbe.v1_8.fields.MdPriceLevelOptionalField;
import omi.cme.globex.mdp3.sbe.v1_8.fields.NumberOfOrdersField;
import omi.cme.globex.mdp3.sbe.v1_8.fields.OpenCloseSettlFlagField;
import omi.cme.globex.mdp3.sbe.v1_8.fields.SettlPriceTypeField;
import omi.cme.globex.mdp3.sbe.v1_8.fields.TradingReferenceDateField;
import omi.cme.globex.mdp3.sbe.v1_8.types.Field;
import omi.cme.globex.mdp3.sbe.v1_8.types.GroupEntry;
import omi.cme.globex.mdp3.sbe.v1_8.types.PrintOptions;

/**
 * One entry of the SnapshotFullRefreshGroup repeating group.
 *
 * <p>Number of entries in Market Data message</p>
 */
public final class SnapshotFullRefreshGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 22;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 22;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "SnapshotFullRefreshGroup";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Market Data entry price
     */
    private final MdEntryPxOptionalField mdEntryPxOptional = new MdEntryPxOptionalField();

    /**
     * Market Data entry size
     */
    private final MdEntrySizeOptionalField mdEntrySizeOptional = new MdEntrySizeOptionalField();

    /**
     * In Book entry - aggregate number of orders at given price level
     */
    private final NumberOfOrdersField numberOfOrders = new NumberOfOrdersField();

    /**
     * Aggregate book position
     */
    private final MdPriceLevelOptionalField mdPriceLevelOptional = new MdPriceLevelOptionalField();

    /**
     * Indicates session date corresponding to the settlement price in tag 1150-TradingReferencePrice
     */
    private final TradingReferenceDateField tradingReferenceDate = new TradingReferenceDateField();

    /**
     * Flag describing IOP and Open Price entries
     */
    private final OpenCloseSettlFlagField openCloseSettlFlag = new OpenCloseSettlFlagField();

    /**
     * SettlPriceType bit set
     */
    private final SettlPriceTypeField settlPriceType = new SettlPriceTypeField();

    /**
     * Market Data entry type
     */
    private final MdEntryTypeField mdEntryType = new MdEntryTypeField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(mdEntryPxOptional, mdEntrySizeOptional, numberOfOrders, mdPriceLevelOptional, tradingReferenceDate, openCloseSettlFlag, settlPriceType, mdEntryType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Market Data entry price
     *
     * @return the MdEntryPxOptional field
     */
    public MdEntryPxOptionalField mdEntryPxOptional() {
        return mdEntryPxOptional;
    }

    /**
     * Market Data entry size
     *
     * @return the MdEntrySizeOptional field
     */
    public MdEntrySizeOptionalField mdEntrySizeOptional() {
        return mdEntrySizeOptional;
    }

    /**
     * In Book entry - aggregate number of orders at given price level
     *
     * @return the NumberOfOrders field
     */
    public NumberOfOrdersField numberOfOrders() {
        return numberOfOrders;
    }

    /**
     * Aggregate book position
     *
     * @return the MdPriceLevelOptional field
     */
    public MdPriceLevelOptionalField mdPriceLevelOptional() {
        return mdPriceLevelOptional;
    }

    /**
     * Indicates session date corresponding to the settlement price in tag 1150-TradingReferencePrice
     *
     * @return the TradingReferenceDate field
     */
    public TradingReferenceDateField tradingReferenceDate() {
        return tradingReferenceDate;
    }

    /**
     * Flag describing IOP and Open Price entries
     *
     * @return the OpenCloseSettlFlag field
     */
    public OpenCloseSettlFlagField openCloseSettlFlag() {
        return openCloseSettlFlag;
    }

    /**
     * SettlPriceType bit set
     *
     * @return the SettlPriceType field
     */
    public SettlPriceTypeField settlPriceType() {
        return settlPriceType;
    }

    /**
     * Market Data entry type
     *
     * @return the MdEntryType field
     */
    public MdEntryTypeField mdEntryType() {
        return mdEntryType;
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
        if (wireBlock >= 22) {
            return 22;
        }
        if (wireBlock >= 21) {
            return 21;
        }
        if (wireBlock >= 20) {
            return 20;
        }
        if (wireBlock >= 19) {
            return 19;
        }
        if (wireBlock >= 17) {
            return 17;
        }
        if (wireBlock >= 16) {
            return 16;
        }
        if (wireBlock >= 12) {
            return 12;
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
            if (!mdEntryPxOptional.parse(data, cursor)) {
                return false;
            }
            cursor += MdEntryPxOptionalField.BYTE_LENGTH;
        }
        if (known >= 12) {
            if (!mdEntrySizeOptional.parse(data, cursor)) {
                return false;
            }
            cursor += MdEntrySizeOptionalField.BYTE_LENGTH;
        }
        if (known >= 16) {
            if (!numberOfOrders.parse(data, cursor)) {
                return false;
            }
            cursor += NumberOfOrdersField.BYTE_LENGTH;
        }
        if (known >= 17) {
            if (!mdPriceLevelOptional.parse(data, cursor)) {
                return false;
            }
            cursor += MdPriceLevelOptionalField.BYTE_LENGTH;
        }
        if (known >= 19) {
            if (!tradingReferenceDate.parse(data, cursor)) {
                return false;
            }
            cursor += TradingReferenceDateField.BYTE_LENGTH;
        }
        if (known >= 20) {
            if (!openCloseSettlFlag.parse(data, cursor)) {
                return false;
            }
            cursor += OpenCloseSettlFlagField.BYTE_LENGTH;
        }
        if (known >= 21) {
            if (!settlPriceType.parse(data, cursor)) {
                return false;
            }
            cursor += SettlPriceTypeField.BYTE_LENGTH;
        }
        if (known >= 22) {
            if (!mdEntryType.parse(data, cursor)) {
                return false;
            }
            cursor += MdEntryTypeField.BYTE_LENGTH;
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
            cursor = mdEntryPxOptional.encode(data, cursor);
        }
        if (known >= 12) {
            cursor = mdEntrySizeOptional.encode(data, cursor);
        }
        if (known >= 16) {
            cursor = numberOfOrders.encode(data, cursor);
        }
        if (known >= 17) {
            cursor = mdPriceLevelOptional.encode(data, cursor);
        }
        if (known >= 19) {
            cursor = tradingReferenceDate.encode(data, cursor);
        }
        if (known >= 20) {
            cursor = openCloseSettlFlag.encode(data, cursor);
        }
        if (known >= 21) {
            cursor = settlPriceType.encode(data, cursor);
        }
        if (known >= 22) {
            cursor = mdEntryType.encode(data, cursor);
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
            case "MdEntryPxOptional" -> Optional.of(mdEntryPxOptional);
            case "MdEntrySizeOptional" -> Optional.of(mdEntrySizeOptional);
            case "NumberOfOrders" -> Optional.of(numberOfOrders);
            case "MdPriceLevelOptional" -> Optional.of(mdPriceLevelOptional);
            case "TradingReferenceDate" -> Optional.of(tradingReferenceDate);
            case "OpenCloseSettlFlag" -> Optional.of(openCloseSettlFlag);
            case "SettlPriceType" -> Optional.of(settlPriceType);
            case "MdEntryType" -> Optional.of(mdEntryType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof SnapshotFullRefreshGroupEntry message)) {
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
        if (!(other instanceof SnapshotFullRefreshGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
