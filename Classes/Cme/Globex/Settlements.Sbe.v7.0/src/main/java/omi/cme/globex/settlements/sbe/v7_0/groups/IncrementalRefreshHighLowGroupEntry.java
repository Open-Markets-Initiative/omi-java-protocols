package omi.cme.globex.settlements.sbe.v7_0.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cme.globex.settlements.sbe.v7_0.fields.ClearingProductCodeField;
import omi.cme.globex.settlements.sbe.v7_0.fields.HighPxIndField;
import omi.cme.globex.settlements.sbe.v7_0.fields.InstrumentGuidField;
import omi.cme.globex.settlements.sbe.v7_0.fields.LowPxIndField;
import omi.cme.globex.settlements.sbe.v7_0.fields.ProductGuidField;
import omi.cme.globex.settlements.sbe.v7_0.fields.PutOrCallField;
import omi.cme.globex.settlements.sbe.v7_0.fields.SecurityExchangeField;
import omi.cme.globex.settlements.sbe.v7_0.fields.SecurityIdField;
import omi.cme.globex.settlements.sbe.v7_0.fields.SecurityTypeField;
import omi.cme.globex.settlements.sbe.v7_0.fields.SymbolField;
import omi.cme.globex.settlements.sbe.v7_0.fields.TradingReferenceDateField;
import omi.cme.globex.settlements.sbe.v7_0.fields.UnderlyingClearingProductCodeField;
import omi.cme.globex.settlements.sbe.v7_0.fields.UnderlyingProductGuidField;
import omi.cme.globex.settlements.sbe.v7_0.fields.UnderlyingSecurityExchangeField;
import omi.cme.globex.settlements.sbe.v7_0.fields.UnderlyingSecurityTypeField;
import omi.cme.globex.settlements.sbe.v7_0.structs.HighPx;
import omi.cme.globex.settlements.sbe.v7_0.structs.LowPx;
import omi.cme.globex.settlements.sbe.v7_0.structs.MaturityMonthYear;
import omi.cme.globex.settlements.sbe.v7_0.structs.StrikePrice;
import omi.cme.globex.settlements.sbe.v7_0.structs.UnderlyingMaturityMonthYear;
import omi.cme.globex.settlements.sbe.v7_0.types.Field;
import omi.cme.globex.settlements.sbe.v7_0.types.GroupEntry;
import omi.cme.globex.settlements.sbe.v7_0.types.PrintOptions;

/**
 * One entry of the IncrementalRefreshHighLowGroup repeating group.
 *
 * <p>Number of data blocks</p>
 */
public final class IncrementalRefreshHighLowGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 142;

    /**
     * The width of this entry's fixed part, which its block length states on the wire.
     */
    public static final int ROOT_BYTE_LENGTH = 142;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "IncrementalRefreshHighLowGroup";

    /**
     * Product GUID
     */
    private final ProductGuidField productGuid = new ProductGuidField();

    /**
     * Clearing Product Code
     */
    private final ClearingProductCodeField clearingProductCode = new ClearingProductCodeField();

    /**
     * Security Type
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * Security Exchange
     */
    private final SecurityExchangeField securityExchange = new SecurityExchangeField();

    /**
     * Put or call indicator
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Underlying Product GUID
     */
    private final UnderlyingProductGuidField underlyingProductGuid = new UnderlyingProductGuidField();

    /**
     * Underlying Clearing Product Code
     */
    private final UnderlyingClearingProductCodeField underlyingClearingProductCode = new UnderlyingClearingProductCodeField();

    /**
     * Underlying Security Type
     */
    private final UnderlyingSecurityTypeField underlyingSecurityType = new UnderlyingSecurityTypeField();

    /**
     * Underlying Security Exchange
     */
    private final UnderlyingSecurityExchangeField underlyingSecurityExchange = new UnderlyingSecurityExchangeField();

    /**
     * Contract name, symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * External unique instrument ID
     */
    private final InstrumentGuidField instrumentGuid = new InstrumentGuidField();

    /**
     * Security ID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Low price origin indicator
     */
    private final LowPxIndField lowPxInd = new LowPxIndField();

    /**
     * High price origin indicator
     */
    private final HighPxIndField highPxInd = new HighPxIndField();

    /**
     * Business date corresponding to a statistic entry
     */
    private final TradingReferenceDateField tradingReferenceDate = new TradingReferenceDateField();

    /**
     * Number of data blocks
     */
    private final MaturityMonthYear maturityMonthYear = new MaturityMonthYear();

    /**
     * Number of data blocks
     */
    private final StrikePrice strikePrice = new StrikePrice();

    /**
     * Number of data blocks
     */
    private final UnderlyingMaturityMonthYear underlyingMaturityMonthYear = new UnderlyingMaturityMonthYear();

    /**
     * Number of data blocks
     */
    private final LowPx lowPx = new LowPx();

    /**
     * Number of data blocks
     */
    private final HighPx highPx = new HighPx();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(productGuid), List.<Field>of(clearingProductCode), List.<Field>of(securityType), List.<Field>of(securityExchange), maturityMonthYear.fields(), List.<Field>of(putOrCall), strikePrice.fields(), List.<Field>of(underlyingProductGuid), List.<Field>of(underlyingClearingProductCode), List.<Field>of(underlyingSecurityType), List.<Field>of(underlyingSecurityExchange), underlyingMaturityMonthYear.fields(), List.<Field>of(symbol), List.<Field>of(instrumentGuid), List.<Field>of(securityId), lowPx.fields(), List.<Field>of(lowPxInd), highPx.fields(), List.<Field>of(highPxInd), List.<Field>of(tradingReferenceDate)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Product GUID
     *
     * @return the ProductGuid field
     */
    public ProductGuidField productGuid() {
        return productGuid;
    }

    /**
     * Clearing Product Code
     *
     * @return the ClearingProductCode field
     */
    public ClearingProductCodeField clearingProductCode() {
        return clearingProductCode;
    }

    /**
     * Security Type
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
    }

    /**
     * Security Exchange
     *
     * @return the SecurityExchange field
     */
    public SecurityExchangeField securityExchange() {
        return securityExchange;
    }

    /**
     * Put or call indicator
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * Underlying Product GUID
     *
     * @return the UnderlyingProductGuid field
     */
    public UnderlyingProductGuidField underlyingProductGuid() {
        return underlyingProductGuid;
    }

    /**
     * Underlying Clearing Product Code
     *
     * @return the UnderlyingClearingProductCode field
     */
    public UnderlyingClearingProductCodeField underlyingClearingProductCode() {
        return underlyingClearingProductCode;
    }

    /**
     * Underlying Security Type
     *
     * @return the UnderlyingSecurityType field
     */
    public UnderlyingSecurityTypeField underlyingSecurityType() {
        return underlyingSecurityType;
    }

    /**
     * Underlying Security Exchange
     *
     * @return the UnderlyingSecurityExchange field
     */
    public UnderlyingSecurityExchangeField underlyingSecurityExchange() {
        return underlyingSecurityExchange;
    }

    /**
     * Contract name, symbol
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
     * Security ID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Low price origin indicator
     *
     * @return the LowPxInd field
     */
    public LowPxIndField lowPxInd() {
        return lowPxInd;
    }

    /**
     * High price origin indicator
     *
     * @return the HighPxInd field
     */
    public HighPxIndField highPxInd() {
        return highPxInd;
    }

    /**
     * Business date corresponding to a statistic entry
     *
     * @return the TradingReferenceDate field
     */
    public TradingReferenceDateField tradingReferenceDate() {
        return tradingReferenceDate;
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
        if (wireBlock >= 142) {
            return 142;
        }
        if (wireBlock >= 140) {
            return 140;
        }
        if (wireBlock >= 139) {
            return 139;
        }
        if (wireBlock >= 130) {
            return 130;
        }
        if (wireBlock >= 129) {
            return 129;
        }
        if (wireBlock >= 120) {
            return 120;
        }
        if (wireBlock >= 116) {
            return 116;
        }
        if (wireBlock >= 108) {
            return 108;
        }
        if (wireBlock >= 88) {
            return 88;
        }
        if (wireBlock >= 83) {
            return 83;
        }
        if (wireBlock >= 75) {
            return 75;
        }
        if (wireBlock >= 69) {
            return 69;
        }
        if (wireBlock >= 57) {
            return 57;
        }
        if (wireBlock >= 49) {
            return 49;
        }
        if (wireBlock >= 40) {
            return 40;
        }
        if (wireBlock >= 39) {
            return 39;
        }
        if (wireBlock >= 34) {
            return 34;
        }
        if (wireBlock >= 26) {
            return 26;
        }
        if (wireBlock >= 20) {
            return 20;
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

    /**
     * Number of data blocks
     *
     * @return the MaturityMonthYear record
     */
    public MaturityMonthYear maturityMonthYear() {
        return maturityMonthYear;
    }

    /**
     * Number of data blocks
     *
     * @return the StrikePrice record
     */
    public StrikePrice strikePrice() {
        return strikePrice;
    }

    /**
     * Number of data blocks
     *
     * @return the UnderlyingMaturityMonthYear record
     */
    public UnderlyingMaturityMonthYear underlyingMaturityMonthYear() {
        return underlyingMaturityMonthYear;
    }

    /**
     * Number of data blocks
     *
     * @return the LowPx record
     */
    public LowPx lowPx() {
        return lowPx;
    }

    /**
     * Number of data blocks
     *
     * @return the HighPx record
     */
    public HighPx highPx() {
        return highPx;
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
        if (known >= 8) {
            if (!productGuid.parse(data, cursor)) {
                return false;
            }
            cursor += ProductGuidField.BYTE_LENGTH;
        }
        if (known >= 20) {
            if (!clearingProductCode.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingProductCodeField.BYTE_LENGTH;
        }
        if (known >= 26) {
            if (!securityType.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityTypeField.BYTE_LENGTH;
        }
        if (known >= 34) {
            if (!securityExchange.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityExchangeField.BYTE_LENGTH;
        }
        if (known >= 39) {
            if (!maturityMonthYear.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += maturityMonthYear.byteLength();
        }
        if (known >= 40) {
            if (!putOrCall.parse(data, cursor)) {
                return false;
            }
            cursor += PutOrCallField.BYTE_LENGTH;
        }
        if (known >= 49) {
            if (!strikePrice.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += strikePrice.byteLength();
        }
        if (known >= 57) {
            if (!underlyingProductGuid.parse(data, cursor)) {
                return false;
            }
            cursor += UnderlyingProductGuidField.BYTE_LENGTH;
        }
        if (known >= 69) {
            if (!underlyingClearingProductCode.parse(data, cursor)) {
                return false;
            }
            cursor += UnderlyingClearingProductCodeField.BYTE_LENGTH;
        }
        if (known >= 75) {
            if (!underlyingSecurityType.parse(data, cursor)) {
                return false;
            }
            cursor += UnderlyingSecurityTypeField.BYTE_LENGTH;
        }
        if (known >= 83) {
            if (!underlyingSecurityExchange.parse(data, cursor)) {
                return false;
            }
            cursor += UnderlyingSecurityExchangeField.BYTE_LENGTH;
        }
        if (known >= 88) {
            if (!underlyingMaturityMonthYear.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += underlyingMaturityMonthYear.byteLength();
        }
        if (known >= 108) {
            if (!symbol.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolField.BYTE_LENGTH;
        }
        if (known >= 116) {
            if (!instrumentGuid.parse(data, cursor)) {
                return false;
            }
            cursor += InstrumentGuidField.BYTE_LENGTH;
        }
        if (known >= 120) {
            if (!securityId.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityIdField.BYTE_LENGTH;
        }
        if (known >= 129) {
            if (!lowPx.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += lowPx.byteLength();
        }
        if (known >= 130) {
            if (!lowPxInd.parse(data, cursor)) {
                return false;
            }
            cursor += LowPxIndField.BYTE_LENGTH;
        }
        if (known >= 139) {
            if (!highPx.parseFrom(data, cursor, end)) {
                return false;
            }
            cursor += highPx.byteLength();
        }
        if (known >= 140) {
            if (!highPxInd.parse(data, cursor)) {
                return false;
            }
            cursor += HighPxIndField.BYTE_LENGTH;
        }
        if (known >= 142) {
            if (!tradingReferenceDate.parse(data, cursor)) {
                return false;
            }
            cursor += TradingReferenceDateField.BYTE_LENGTH;
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
            cursor = productGuid.encode(data, cursor);
        }
        if (known >= 20) {
            cursor = clearingProductCode.encode(data, cursor);
        }
        if (known >= 26) {
            cursor = securityType.encode(data, cursor);
        }
        if (known >= 34) {
            cursor = securityExchange.encode(data, cursor);
        }
        if (known >= 39) {
            cursor = maturityMonthYear.encode(data, cursor);
        }
        if (known >= 40) {
            cursor = putOrCall.encode(data, cursor);
        }
        if (known >= 49) {
            cursor = strikePrice.encode(data, cursor);
        }
        if (known >= 57) {
            cursor = underlyingProductGuid.encode(data, cursor);
        }
        if (known >= 69) {
            cursor = underlyingClearingProductCode.encode(data, cursor);
        }
        if (known >= 75) {
            cursor = underlyingSecurityType.encode(data, cursor);
        }
        if (known >= 83) {
            cursor = underlyingSecurityExchange.encode(data, cursor);
        }
        if (known >= 88) {
            cursor = underlyingMaturityMonthYear.encode(data, cursor);
        }
        if (known >= 108) {
            cursor = symbol.encode(data, cursor);
        }
        if (known >= 116) {
            cursor = instrumentGuid.encode(data, cursor);
        }
        if (known >= 120) {
            cursor = securityId.encode(data, cursor);
        }
        if (known >= 129) {
            cursor = lowPx.encode(data, cursor);
        }
        if (known >= 130) {
            cursor = lowPxInd.encode(data, cursor);
        }
        if (known >= 139) {
            cursor = highPx.encode(data, cursor);
        }
        if (known >= 140) {
            cursor = highPxInd.encode(data, cursor);
        }
        if (known >= 142) {
            cursor = tradingReferenceDate.encode(data, cursor);
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
        maturityMonthYear.clear();
        strikePrice.clear();
        underlyingMaturityMonthYear.clear();
        lowPx.clear();
        highPx.clear();
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
            case "ProductGuid" -> Optional.of(productGuid);
            case "ClearingProductCode" -> Optional.of(clearingProductCode);
            case "SecurityType" -> Optional.of(securityType);
            case "SecurityExchange" -> Optional.of(securityExchange);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "UnderlyingProductGuid" -> Optional.of(underlyingProductGuid);
            case "UnderlyingClearingProductCode" -> Optional.of(underlyingClearingProductCode);
            case "UnderlyingSecurityType" -> Optional.of(underlyingSecurityType);
            case "UnderlyingSecurityExchange" -> Optional.of(underlyingSecurityExchange);
            case "Symbol" -> Optional.of(symbol);
            case "InstrumentGuid" -> Optional.of(instrumentGuid);
            case "SecurityId" -> Optional.of(securityId);
            case "LowPxInd" -> Optional.of(lowPxInd);
            case "HighPxInd" -> Optional.of(highPxInd);
            case "TradingReferenceDate" -> Optional.of(tradingReferenceDate);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof IncrementalRefreshHighLowGroupEntry message)) {
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
        if (!(other instanceof IncrementalRefreshHighLowGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
