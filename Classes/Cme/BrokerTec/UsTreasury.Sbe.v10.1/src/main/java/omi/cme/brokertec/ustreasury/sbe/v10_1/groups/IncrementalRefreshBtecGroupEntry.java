package omi.cme.brokertec.ustreasury.sbe.v10_1.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cme.brokertec.ustreasury.sbe.v10_1.fields.MaturityDateField;
import omi.cme.brokertec.ustreasury.sbe.v10_1.fields.MdEntrySizeField;
import omi.cme.brokertec.ustreasury.sbe.v10_1.fields.MdEntryTypeField;
import omi.cme.brokertec.ustreasury.sbe.v10_1.fields.MdPriceLevelField;
import omi.cme.brokertec.ustreasury.sbe.v10_1.fields.MdUpdateActionField;
import omi.cme.brokertec.ustreasury.sbe.v10_1.fields.PriceTypeField;
import omi.cme.brokertec.ustreasury.sbe.v10_1.fields.SecurityAltIdField;
import omi.cme.brokertec.ustreasury.sbe.v10_1.fields.SecurityAltIdSourceField;
import omi.cme.brokertec.ustreasury.sbe.v10_1.fields.SymbolField;
import omi.cme.brokertec.ustreasury.sbe.v10_1.fields.TradeConditionField;
import omi.cme.brokertec.ustreasury.sbe.v10_1.fields.TradeVolumeField;
import omi.cme.brokertec.ustreasury.sbe.v10_1.structs.CouponRate;
import omi.cme.brokertec.ustreasury.sbe.v10_1.structs.MdEntryPx;
import omi.cme.brokertec.ustreasury.sbe.v10_1.types.Field;
import omi.cme.brokertec.ustreasury.sbe.v10_1.types.GroupEntry;
import omi.cme.brokertec.ustreasury.sbe.v10_1.types.PrintOptions;

/**
 * One entry of the IncrementalRefreshBtecGroup repeating group.
 *
 * <p>Number of data blocks</p>
 */
public final class IncrementalRefreshBtecGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 62;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 62;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "IncrementalRefreshBtecGroup";

    /**
     * Indicates the type of Market Data update action
     */
    private final MdUpdateActionField mdUpdateAction = new MdUpdateActionField();

    /**
     * Indicates the type of Market Data entry
     */
    private final MdEntryTypeField mdEntryType = new MdEntryTypeField();

    /**
     * Quantity or volume represented by the Market Data Entry
     */
    private final MdEntrySizeField mdEntrySize = new MdEntrySizeField();

    /**
     * Price level in the book
     */
    private final MdPriceLevelField mdPriceLevel = new MdPriceLevelField();

    /**
     * Total traded volume since the beginning of the session. If this tag is not present, then there is no volume
     */
    private final TradeVolumeField tradeVolume = new TradeVolumeField();

    /**
     * Contract symbol, name
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Instrument Maturity Date
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * CUSIP
     */
    private final SecurityAltIdField securityAltId = new SecurityAltIdField();

    /**
     * Identifies class or source of the SecurityAltID (455) value
     */
    private final SecurityAltIdSourceField securityAltIdSource = new SecurityAltIdSourceField();

    /**
     * List of conditions describing a trade. H= Hit, T=Take
     */
    private final TradeConditionField tradeCondition = new TradeConditionField();

    /**
     * Price type condition. 9=Yield
     */
    private final PriceTypeField priceType = new PriceTypeField();

    /**
     * Number of data blocks
     */
    private final MdEntryPx mdEntryPx = new MdEntryPx();

    /**
     * Number of data blocks
     */
    private final CouponRate couponRate = new CouponRate();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(mdUpdateAction), List.<Field>of(mdEntryType), mdEntryPx.fields(), List.<Field>of(mdEntrySize), List.<Field>of(mdPriceLevel), List.<Field>of(tradeVolume), List.<Field>of(symbol), List.<Field>of(maturityDate), List.<Field>of(securityAltId), List.<Field>of(securityAltIdSource), couponRate.fields(), List.<Field>of(tradeCondition), List.<Field>of(priceType)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Indicates the type of Market Data update action
     *
     * @return the MdUpdateAction field
     */
    public MdUpdateActionField mdUpdateAction() {
        return mdUpdateAction;
    }

    /**
     * Indicates the type of Market Data entry
     *
     * @return the MdEntryType field
     */
    public MdEntryTypeField mdEntryType() {
        return mdEntryType;
    }

    /**
     * Quantity or volume represented by the Market Data Entry
     *
     * @return the MdEntrySize field
     */
    public MdEntrySizeField mdEntrySize() {
        return mdEntrySize;
    }

    /**
     * Price level in the book
     *
     * @return the MdPriceLevel field
     */
    public MdPriceLevelField mdPriceLevel() {
        return mdPriceLevel;
    }

    /**
     * Total traded volume since the beginning of the session. If this tag is not present, then there is no volume
     *
     * @return the TradeVolume field
     */
    public TradeVolumeField tradeVolume() {
        return tradeVolume;
    }

    /**
     * Contract symbol, name
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Instrument Maturity Date
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * CUSIP
     *
     * @return the SecurityAltId field
     */
    public SecurityAltIdField securityAltId() {
        return securityAltId;
    }

    /**
     * Identifies class or source of the SecurityAltID (455) value
     *
     * @return the SecurityAltIdSource field
     */
    public SecurityAltIdSourceField securityAltIdSource() {
        return securityAltIdSource;
    }

    /**
     * List of conditions describing a trade. H= Hit, T=Take
     *
     * @return the TradeCondition field
     */
    public TradeConditionField tradeCondition() {
        return tradeCondition;
    }

    /**
     * Price type condition. 9=Yield
     *
     * @return the PriceType field
     */
    public PriceTypeField priceType() {
        return priceType;
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
        if (wireBlock >= 62) {
            return 62;
        }
        if (wireBlock >= 61) {
            return 61;
        }
        if (wireBlock >= 60) {
            return 60;
        }
        if (wireBlock >= 55) {
            return 55;
        }
        if (wireBlock >= 54) {
            return 54;
        }
        if (wireBlock >= 42) {
            return 42;
        }
        if (wireBlock >= 40) {
            return 40;
        }
        if (wireBlock >= 20) {
            return 20;
        }
        if (wireBlock >= 16) {
            return 16;
        }
        if (wireBlock >= 15) {
            return 15;
        }
        if (wireBlock >= 11) {
            return 11;
        }
        if (wireBlock >= 2) {
            return 2;
        }
        if (wireBlock >= 1) {
            return 1;
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

    /**
     * Number of data blocks
     *
     * @return the MdEntryPx record
     */
    public MdEntryPx mdEntryPx() {
        return mdEntryPx;
    }

    /**
     * Number of data blocks
     *
     * @return the CouponRate record
     */
    public CouponRate couponRate() {
        return couponRate;
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
        if (known >= 1) {
            if (!mdUpdateAction.parse(data, cursor)) {
                return false;
            }
            cursor += MdUpdateActionField.BYTE_LENGTH;
        }
        if (known >= 2) {
            if (!mdEntryType.parse(data, cursor)) {
                return false;
            }
            cursor += MdEntryTypeField.BYTE_LENGTH;
        }
        if (known >= 11) {
            if (!mdEntryPx.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += mdEntryPx.byteLength();
        }
        if (known >= 15) {
            if (!mdEntrySize.parse(data, cursor)) {
                return false;
            }
            cursor += MdEntrySizeField.BYTE_LENGTH;
        }
        if (known >= 16) {
            if (!mdPriceLevel.parse(data, cursor)) {
                return false;
            }
            cursor += MdPriceLevelField.BYTE_LENGTH;
        }
        if (known >= 20) {
            if (!tradeVolume.parse(data, cursor)) {
                return false;
            }
            cursor += TradeVolumeField.BYTE_LENGTH;
        }
        if (known >= 40) {
            if (!symbol.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolField.BYTE_LENGTH;
        }
        if (known >= 42) {
            if (!maturityDate.parse(data, cursor)) {
                return false;
            }
            cursor += MaturityDateField.BYTE_LENGTH;
        }
        if (known >= 54) {
            if (!securityAltId.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityAltIdField.BYTE_LENGTH;
        }
        if (known >= 55) {
            if (!securityAltIdSource.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityAltIdSourceField.BYTE_LENGTH;
        }
        if (known >= 60) {
            if (!couponRate.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += couponRate.byteLength();
        }
        if (known >= 61) {
            if (!tradeCondition.parse(data, cursor)) {
                return false;
            }
            cursor += TradeConditionField.BYTE_LENGTH;
        }
        if (known >= 62) {
            if (!priceType.parse(data, cursor)) {
                return false;
            }
            cursor += PriceTypeField.BYTE_LENGTH;
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
        if (known >= 1) {
            cursor = mdUpdateAction.encode(data, cursor);
        }
        if (known >= 2) {
            cursor = mdEntryType.encode(data, cursor);
        }
        if (known >= 11) {
            cursor = mdEntryPx.encode(data, cursor);
        }
        if (known >= 15) {
            cursor = mdEntrySize.encode(data, cursor);
        }
        if (known >= 16) {
            cursor = mdPriceLevel.encode(data, cursor);
        }
        if (known >= 20) {
            cursor = tradeVolume.encode(data, cursor);
        }
        if (known >= 40) {
            cursor = symbol.encode(data, cursor);
        }
        if (known >= 42) {
            cursor = maturityDate.encode(data, cursor);
        }
        if (known >= 54) {
            cursor = securityAltId.encode(data, cursor);
        }
        if (known >= 55) {
            cursor = securityAltIdSource.encode(data, cursor);
        }
        if (known >= 60) {
            cursor = couponRate.encode(data, cursor);
        }
        if (known >= 61) {
            cursor = tradeCondition.encode(data, cursor);
        }
        if (known >= 62) {
            cursor = priceType.encode(data, cursor);
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
        mdEntryPx.clear();
        couponRate.clear();
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
            case "MdUpdateAction" -> Optional.of(mdUpdateAction);
            case "MdEntryType" -> Optional.of(mdEntryType);
            case "MdEntrySize" -> Optional.of(mdEntrySize);
            case "MdPriceLevel" -> Optional.of(mdPriceLevel);
            case "TradeVolume" -> Optional.of(tradeVolume);
            case "Symbol" -> Optional.of(symbol);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "SecurityAltId" -> Optional.of(securityAltId);
            case "SecurityAltIdSource" -> Optional.of(securityAltIdSource);
            case "TradeCondition" -> Optional.of(tradeCondition);
            case "PriceType" -> Optional.of(priceType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof IncrementalRefreshBtecGroupEntry message)) {
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
        if (!(other instanceof IncrementalRefreshBtecGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
