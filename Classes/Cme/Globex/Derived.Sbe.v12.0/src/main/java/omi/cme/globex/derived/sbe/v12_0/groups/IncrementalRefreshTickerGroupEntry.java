package omi.cme.globex.derived.sbe.v12_0.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.derived.sbe.v12_0.fields.AggressorSideField;
import omi.cme.globex.derived.sbe.v12_0.fields.FinancialInstrumentFullNameField;
import omi.cme.globex.derived.sbe.v12_0.fields.InstrumentGuidField;
import omi.cme.globex.derived.sbe.v12_0.fields.MdEntryPxField;
import omi.cme.globex.derived.sbe.v12_0.fields.MdEntrySizeField;
import omi.cme.globex.derived.sbe.v12_0.fields.MdEntryTimeField;
import omi.cme.globex.derived.sbe.v12_0.fields.MdEntryTypeTickerEntryTypeField;
import omi.cme.globex.derived.sbe.v12_0.fields.OpenCloseSettlFlagField;
import omi.cme.globex.derived.sbe.v12_0.fields.SecurityIdField;
import omi.cme.globex.derived.sbe.v12_0.fields.SymbolField;
import omi.cme.globex.derived.sbe.v12_0.fields.TradingSessionIdField;
import omi.cme.globex.derived.sbe.v12_0.types.Field;
import omi.cme.globex.derived.sbe.v12_0.types.GroupEntry;
import omi.cme.globex.derived.sbe.v12_0.types.PrintOptions;

/**
 * One entry of the IncrementalRefreshTickerGroup repeating group.
 *
 * <p>Number of entries in Market Data message</p>
 */
public final class IncrementalRefreshTickerGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 95;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 95;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "IncrementalRefreshTickerGroup";

    /**
     * Market Data entry type, identifies the element
     */
    private final MdEntryTypeTickerEntryTypeField mdEntryTypeTickerEntryType = new MdEntryTypeTickerEntryTypeField();

    /**
     * SecurityID as referenced in MDP3 and Ilink3 protocols
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Unique instrument symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * External unique instrument ID
     */
    private final InstrumentGuidField instrumentGuid = new InstrumentGuidField();

    /**
     * Financial instrument long name
     */
    private final FinancialInstrumentFullNameField financialInstrumentFullName = new FinancialInstrumentFullNameField();

    /**
     * Market Data entry price
     */
    private final MdEntryPxField mdEntryPx = new MdEntryPxField();

    /**
     * Market Data entry size
     */
    private final MdEntrySizeField mdEntrySize = new MdEntrySizeField();

    /**
     * Time of the last market event that contributed to element calculation or publication
     */
    private final MdEntryTimeField mdEntryTime = new MdEntryTimeField();

    /**
     * Previous day elements, Global or Regional, will contain the value 4 - entry from previous business date
     */
    private final OpenCloseSettlFlagField openCloseSettlFlag = new OpenCloseSettlFlagField();

    /**
     * The associated region market hours considered for the calculation of the element. The element is calculated from market events occurring during the region's open-close hours
     */
    private final TradingSessionIdField tradingSessionId = new TradingSessionIdField();

    /**
     * Indicates which side is aggressor of the trade
     */
    private final AggressorSideField aggressorSide = new AggressorSideField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(mdEntryTypeTickerEntryType, securityId, symbol, instrumentGuid, financialInstrumentFullName, mdEntryPx, mdEntrySize, mdEntryTime, openCloseSettlFlag, tradingSessionId, aggressorSide);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Market Data entry type, identifies the element
     *
     * @return the MdEntryTypeTickerEntryType field
     */
    public MdEntryTypeTickerEntryTypeField mdEntryTypeTickerEntryType() {
        return mdEntryTypeTickerEntryType;
    }

    /**
     * SecurityID as referenced in MDP3 and Ilink3 protocols
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Unique instrument symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * External unique instrument ID
     *
     * @return the InstrumentGuid field
     */
    public InstrumentGuidField instrumentGuid() {
        return instrumentGuid;
    }

    /**
     * Financial instrument long name
     *
     * @return the FinancialInstrumentFullName field
     */
    public FinancialInstrumentFullNameField financialInstrumentFullName() {
        return financialInstrumentFullName;
    }

    /**
     * Market Data entry price
     *
     * @return the MdEntryPx field
     */
    public MdEntryPxField mdEntryPx() {
        return mdEntryPx;
    }

    /**
     * Market Data entry size
     *
     * @return the MdEntrySize field
     */
    public MdEntrySizeField mdEntrySize() {
        return mdEntrySize;
    }

    /**
     * Time of the last market event that contributed to element calculation or publication
     *
     * @return the MdEntryTime field
     */
    public MdEntryTimeField mdEntryTime() {
        return mdEntryTime;
    }

    /**
     * Previous day elements, Global or Regional, will contain the value 4 - entry from previous business date
     *
     * @return the OpenCloseSettlFlag field
     */
    public OpenCloseSettlFlagField openCloseSettlFlag() {
        return openCloseSettlFlag;
    }

    /**
     * The associated region market hours considered for the calculation of the element. The element is calculated from market events occurring during the region's open-close hours
     *
     * @return the TradingSessionId field
     */
    public TradingSessionIdField tradingSessionId() {
        return tradingSessionId;
    }

    /**
     * Indicates which side is aggressor of the trade
     *
     * @return the AggressorSide field
     */
    public AggressorSideField aggressorSide() {
        return aggressorSide;
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
        if (wireBlock >= 95) {
            return 95;
        }
        if (wireBlock >= 94) {
            return 94;
        }
        if (wireBlock >= 93) {
            return 93;
        }
        if (wireBlock >= 92) {
            return 92;
        }
        if (wireBlock >= 84) {
            return 84;
        }
        if (wireBlock >= 76) {
            return 76;
        }
        if (wireBlock >= 68) {
            return 68;
        }
        if (wireBlock >= 33) {
            return 33;
        }
        if (wireBlock >= 25) {
            return 25;
        }
        if (wireBlock >= 5) {
            return 5;
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
            if (!mdEntryTypeTickerEntryType.parse(data, cursor)) {
                return false;
            }
            cursor += MdEntryTypeTickerEntryTypeField.BYTE_LENGTH;
        }
        if (known >= 5) {
            if (!securityId.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityIdField.BYTE_LENGTH;
        }
        if (known >= 25) {
            if (!symbol.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolField.BYTE_LENGTH;
        }
        if (known >= 33) {
            if (!instrumentGuid.parse(data, cursor)) {
                return false;
            }
            cursor += InstrumentGuidField.BYTE_LENGTH;
        }
        if (known >= 68) {
            if (!financialInstrumentFullName.parse(data, cursor)) {
                return false;
            }
            cursor += FinancialInstrumentFullNameField.BYTE_LENGTH;
        }
        if (known >= 76) {
            if (!mdEntryPx.parse(data, cursor)) {
                return false;
            }
            cursor += MdEntryPxField.BYTE_LENGTH;
        }
        if (known >= 84) {
            if (!mdEntrySize.parse(data, cursor)) {
                return false;
            }
            cursor += MdEntrySizeField.BYTE_LENGTH;
        }
        if (known >= 92) {
            if (!mdEntryTime.parse(data, cursor)) {
                return false;
            }
            cursor += MdEntryTimeField.BYTE_LENGTH;
        }
        if (known >= 93) {
            if (!openCloseSettlFlag.parse(data, cursor)) {
                return false;
            }
            cursor += OpenCloseSettlFlagField.BYTE_LENGTH;
        }
        if (known >= 94) {
            if (!tradingSessionId.parse(data, cursor)) {
                return false;
            }
            cursor += TradingSessionIdField.BYTE_LENGTH;
        }
        if (known >= 95) {
            if (!aggressorSide.parse(data, cursor)) {
                return false;
            }
            cursor += AggressorSideField.BYTE_LENGTH;
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
            cursor = mdEntryTypeTickerEntryType.encode(data, cursor);
        }
        if (known >= 5) {
            cursor = securityId.encode(data, cursor);
        }
        if (known >= 25) {
            cursor = symbol.encode(data, cursor);
        }
        if (known >= 33) {
            cursor = instrumentGuid.encode(data, cursor);
        }
        if (known >= 68) {
            cursor = financialInstrumentFullName.encode(data, cursor);
        }
        if (known >= 76) {
            cursor = mdEntryPx.encode(data, cursor);
        }
        if (known >= 84) {
            cursor = mdEntrySize.encode(data, cursor);
        }
        if (known >= 92) {
            cursor = mdEntryTime.encode(data, cursor);
        }
        if (known >= 93) {
            cursor = openCloseSettlFlag.encode(data, cursor);
        }
        if (known >= 94) {
            cursor = tradingSessionId.encode(data, cursor);
        }
        if (known >= 95) {
            cursor = aggressorSide.encode(data, cursor);
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
            case "MdEntryTypeTickerEntryType" -> Optional.of(mdEntryTypeTickerEntryType);
            case "SecurityId" -> Optional.of(securityId);
            case "Symbol" -> Optional.of(symbol);
            case "InstrumentGuid" -> Optional.of(instrumentGuid);
            case "FinancialInstrumentFullName" -> Optional.of(financialInstrumentFullName);
            case "MdEntryPx" -> Optional.of(mdEntryPx);
            case "MdEntrySize" -> Optional.of(mdEntrySize);
            case "MdEntryTime" -> Optional.of(mdEntryTime);
            case "OpenCloseSettlFlag" -> Optional.of(openCloseSettlFlag);
            case "TradingSessionId" -> Optional.of(tradingSessionId);
            case "AggressorSide" -> Optional.of(aggressorSide);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof IncrementalRefreshTickerGroupEntry message)) {
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
        if (!(other instanceof IncrementalRefreshTickerGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
