package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ClearingFirmField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.MassCancelIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.MassCancelInstField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.MatchingUnitField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.NumberOfPurgeOrdersBitfieldsField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeOrdersBitfield1Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeOrdersBitfield2Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.RiskGroupIdCntField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SymbolField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SymbolSfxField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.groups.RiskGroupIDsEntry;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.groups.RiskGroupIDsList;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Message;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.PrintOptions;

/**
 * Represents the PurgeOrderMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Purge Order Message.</p>
 */
public final class PurgeOrderMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 3;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Purge Order Message";

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfPurgeOrdersBitfieldsField numberOfPurgeOrdersBitfields = new NumberOfPurgeOrdersBitfieldsField();

    /**
     * BitSet PurgeOrders byte 1.
     */
    private final PurgeOrdersBitfield1Field purgeOrdersBitfield1 = new PurgeOrdersBitfield1Field();

    /**
     * BitSet PurgeOrders byte 2.
     */
    private final PurgeOrdersBitfield2Field purgeOrdersBitfield2 = new PurgeOrdersBitfield2Field();

    /**
     * Number of repeating RiskGroupID values included in this message.
     */
    private final RiskGroupIdCntField riskGroupIdCnt = new RiskGroupIdCntField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Mass Cancel Inst
     */
    private final MassCancelInstField massCancelInst = new MassCancelInstField();

    /**
     * Mass Cancel Id
     */
    private final MassCancelIdField massCancelId = new MassCancelIdField();

    /**
     * Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Symbol Sfx
     */
    private final SymbolSfxField symbolSfx = new SymbolSfxField();

    /**
     * Matching Unit
     */
    private final MatchingUnitField matchingUnit = new MatchingUnitField();

    /**
     * Repeating group stated RiskGroupIDCnt times.
     */
    private final RiskGroupIDsList riskGroupIDs = new RiskGroupIDsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(numberOfPurgeOrdersBitfields, purgeOrdersBitfield1, purgeOrdersBitfield2, riskGroupIdCnt, clearingFirm, massCancelInst, massCancelId, symbol, symbolSfx, matchingUnit);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfPurgeOrdersBitfields field
     */
    public NumberOfPurgeOrdersBitfieldsField numberOfPurgeOrdersBitfields() {
        return numberOfPurgeOrdersBitfields;
    }

    /**
     * BitSet PurgeOrders byte 1.
     *
     * @return the PurgeOrdersBitfield1 field
     */
    public PurgeOrdersBitfield1Field purgeOrdersBitfield1() {
        return purgeOrdersBitfield1;
    }

    /**
     * BitSet PurgeOrders byte 2.
     *
     * @return the PurgeOrdersBitfield2 field
     */
    public PurgeOrdersBitfield2Field purgeOrdersBitfield2() {
        return purgeOrdersBitfield2;
    }

    /**
     * Number of repeating RiskGroupID values included in this message.
     *
     * @return the RiskGroupIdCnt field
     */
    public RiskGroupIdCntField riskGroupIdCnt() {
        return riskGroupIdCnt;
    }

    /**
     * Clearing Firm
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Mass Cancel Inst
     *
     * @return the MassCancelInst field
     */
    public MassCancelInstField massCancelInst() {
        return massCancelInst;
    }

    /**
     * Mass Cancel Id
     *
     * @return the MassCancelId field
     */
    public MassCancelIdField massCancelId() {
        return massCancelId;
    }

    /**
     * Symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Symbol Sfx
     *
     * @return the SymbolSfx field
     */
    public SymbolSfxField symbolSfx() {
        return symbolSfx;
    }

    /**
     * Matching Unit
     *
     * @return the MatchingUnit field
     */
    public MatchingUnitField matchingUnit() {
        return matchingUnit;
    }

    /**
     * Repeating group stated RiskGroupIDCnt times.
     *
     * <p>Encode writes this list's size to the RiskGroupIdCnt field.</p>
     *
     * @return the RiskGroupIDs entries
     */
    public RiskGroupIDsList riskGroupIDs() {
        return riskGroupIDs;
    }

    /**
     * Returns whether the fields before the PurgeOrdersBitfield1 put it on the wire.
     *
     * <p>Decode reads the PurgeOrdersBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeOrdersBitfield1 is on the wire
     */
    public boolean purgeOrdersBitfield1Present() {
        return numberOfPurgeOrdersBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the PurgeOrdersBitfield2 put it on the wire.
     *
     * <p>Decode reads the PurgeOrdersBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeOrdersBitfield2 is on the wire
     */
    public boolean purgeOrdersBitfield2Present() {
        return numberOfPurgeOrdersBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfPurgeOrdersBitfields.value() >= 1L) && (purgeOrdersBitfield1Present() && purgeOrdersBitfield1.purgeOrdersBitfield1ClearingFirm());
    }

    /**
     * Returns whether the fields before the MassCancelInst put it on the wire.
     *
     * <p>Decode reads the MassCancelInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelInst is on the wire
     */
    public boolean massCancelInstPresent() {
        return (numberOfPurgeOrdersBitfields.value() >= 1L) && (purgeOrdersBitfield1Present() && purgeOrdersBitfield1.purgeOrdersBitfield1MassCancelInst());
    }

    /**
     * Returns whether the fields before the MassCancelId put it on the wire.
     *
     * <p>Decode reads the MassCancelId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelId is on the wire
     */
    public boolean massCancelIdPresent() {
        return (numberOfPurgeOrdersBitfields.value() >= 1L) && (purgeOrdersBitfield1Present() && purgeOrdersBitfield1.purgeOrdersBitfield1MassCancelId());
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfPurgeOrdersBitfields.value() >= 2L) && (purgeOrdersBitfield2Present() && purgeOrdersBitfield2.purgeOrdersBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the SymbolSfx put it on the wire.
     *
     * <p>Decode reads the SymbolSfx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolSfx is on the wire
     */
    public boolean symbolSfxPresent() {
        return (numberOfPurgeOrdersBitfields.value() >= 2L) && (purgeOrdersBitfield2Present() && purgeOrdersBitfield2.purgeOrdersBitfield2SymbolSfx());
    }

    /**
     * Returns whether the fields before the MatchingUnit put it on the wire.
     *
     * <p>Decode reads the MatchingUnit where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MatchingUnit is on the wire
     */
    public boolean matchingUnitPresent() {
        return (numberOfPurgeOrdersBitfields.value() >= 2L) && (purgeOrdersBitfield2Present() && purgeOrdersBitfield2.purgeOrdersBitfield2MatchingUnit());
    }

    private boolean onWire(Field field) {
        return (field != purgeOrdersBitfield1 || purgeOrdersBitfield1Present()) && (field != purgeOrdersBitfield2 || purgeOrdersBitfield2Present()) && (field != clearingFirm || clearingFirmPresent()) && (field != massCancelInst || massCancelInstPresent()) && (field != massCancelId || massCancelIdPresent()) && (field != symbol || symbolPresent()) && (field != symbolSfx || symbolSfxPresent()) && (field != matchingUnit || matchingUnitPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (purgeOrdersBitfield1Present() ? PurgeOrdersBitfield1Field.BYTE_LENGTH : 0) + (purgeOrdersBitfield2Present() ? PurgeOrdersBitfield2Field.BYTE_LENGTH : 0) + riskGroupIDs.byteLength() + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (massCancelInstPresent() ? MassCancelInstField.BYTE_LENGTH : 0) + (massCancelIdPresent() ? MassCancelIdField.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (symbolSfxPresent() ? SymbolSfxField.BYTE_LENGTH : 0) + (matchingUnitPresent() ? MatchingUnitField.BYTE_LENGTH : 0);
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (purgeOrdersBitfield1Present()) {
            cursor += 1;
        }
        if (purgeOrdersBitfield2Present()) {
            cursor += 1;
        }
        cursor += 1;
        cursor += riskGroupIDs.byteLength();
        if (clearingFirmPresent()) {
            cursor += 4;
        }
        if (massCancelInstPresent()) {
            cursor += 16;
        }
        if (massCancelIdPresent()) {
            cursor += 20;
        }
        if (symbolPresent()) {
            cursor += 8;
        }
        if (symbolSfxPresent()) {
            cursor += 8;
        }
        if (matchingUnitPresent()) {
            cursor += 1;
        }
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.empty();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        cursor += 1; // padding
        if (!numberOfPurgeOrdersBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfPurgeOrdersBitfieldsField.BYTE_LENGTH;
        if (purgeOrdersBitfield1Present()) {
            if (end - 1 - cursor < PurgeOrdersBitfield1Field.BYTE_LENGTH || !purgeOrdersBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeOrdersBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (purgeOrdersBitfield2Present()) {
            if (end - 1 - cursor < PurgeOrdersBitfield2Field.BYTE_LENGTH || !purgeOrdersBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeOrdersBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (!riskGroupIdCnt.parse(data, cursor)) {
            return false;
        }
        cursor += RiskGroupIdCntField.BYTE_LENGTH;
        if (!riskGroupIDs.parse(data, cursor, end, riskGroupIdCnt.value())) {
            return false;
        }
        cursor += riskGroupIDs.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (clearingFirmPresent()) {
            if (end - cursor < ClearingFirmField.BYTE_LENGTH || !clearingFirm.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (massCancelInstPresent()) {
            if (end - cursor < MassCancelInstField.BYTE_LENGTH || !massCancelInst.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (massCancelIdPresent()) {
            if (end - cursor < MassCancelIdField.BYTE_LENGTH || !massCancelId.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (symbolPresent()) {
            if (end - cursor < SymbolField.BYTE_LENGTH || !symbol.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (symbolSfxPresent()) {
            if (end - cursor < SymbolSfxField.BYTE_LENGTH || !symbolSfx.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolSfxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (matchingUnitPresent()) {
            if (end - cursor < MatchingUnitField.BYTE_LENGTH || !matchingUnit.parse(data, cursor)) {
                return false;
            }
            cursor += MatchingUnitField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (riskGroupIDs.size() > 255) {
            throw new IllegalStateException("riskGroupIDs holds " + riskGroupIDs.size() + " entries, more than its count field can state");
        }
        riskGroupIdCnt.value((short) riskGroupIDs.size());
        if (purgeOrdersBitfield1Present() != purgeOrdersBitfield1.hasValue()) {
            throw new IllegalStateException(purgeOrdersBitfield1.hasValue() ? "purgeOrdersBitfield1 holds a value the fields before it leave off the wire" : "purgeOrdersBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (purgeOrdersBitfield2Present() != purgeOrdersBitfield2.hasValue()) {
            throw new IllegalStateException(purgeOrdersBitfield2.hasValue() ? "purgeOrdersBitfield2 holds a value the fields before it leave off the wire" : "purgeOrdersBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (massCancelInstPresent() != massCancelInst.hasValue()) {
            throw new IllegalStateException(massCancelInst.hasValue() ? "massCancelInst holds a value the fields before it leave off the wire" : "massCancelInst holds no value, though the fields before it put it on the wire");
        }
        if (massCancelIdPresent() != massCancelId.hasValue()) {
            throw new IllegalStateException(massCancelId.hasValue() ? "massCancelId holds a value the fields before it leave off the wire" : "massCancelId holds no value, though the fields before it put it on the wire");
        }
        if (symbolPresent() != symbol.hasValue()) {
            throw new IllegalStateException(symbol.hasValue() ? "symbol holds a value the fields before it leave off the wire" : "symbol holds no value, though the fields before it put it on the wire");
        }
        if (symbolSfxPresent() != symbolSfx.hasValue()) {
            throw new IllegalStateException(symbolSfx.hasValue() ? "symbolSfx holds a value the fields before it leave off the wire" : "symbolSfx holds no value, though the fields before it put it on the wire");
        }
        if (matchingUnitPresent() != matchingUnit.hasValue()) {
            throw new IllegalStateException(matchingUnit.hasValue() ? "matchingUnit holds a value the fields before it leave off the wire" : "matchingUnit holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        if (buffer != null && buffer.length >= 1) {
            System.arraycopy(buffer, 0, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfPurgeOrdersBitfields.encode(data, cursor);
        if (purgeOrdersBitfield1Present()) {
            cursor = purgeOrdersBitfield1.encode(data, cursor);
        }
        if (purgeOrdersBitfield2Present()) {
            cursor = purgeOrdersBitfield2.encode(data, cursor);
        }
        cursor = riskGroupIdCnt.encode(data, cursor);
        cursor = riskGroupIDs.encode(data, cursor);
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (massCancelInstPresent()) {
            cursor = massCancelInst.encode(data, cursor);
        }
        if (massCancelIdPresent()) {
            cursor = massCancelId.encode(data, cursor);
        }
        if (symbolPresent()) {
            cursor = symbol.encode(data, cursor);
        }
        if (symbolSfxPresent()) {
            cursor = symbolSfx.encode(data, cursor);
        }
        if (matchingUnitPresent()) {
            cursor = matchingUnit.encode(data, cursor);
        }
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
        riskGroupIDs.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != riskGroupIdCnt && !field.isRecognized()) {
                return false;
            }
        }
        return riskGroupIDs.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != riskGroupIdCnt && !field.isValid()) {
                return false;
            }
        }
        if (!riskGroupIDs.isValid()) {
            return false;
        }
        return isRecognized();
    }

    /**
     * Returns a copy of the bytes this message was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the message bytes, or empty when no decode has been attempted
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
        if (!numberOfPurgeOrdersBitfields.isDecoded()) {
            return Optional.of(numberOfPurgeOrdersBitfields);
        }
        if (purgeOrdersBitfield1Present() && !purgeOrdersBitfield1.isDecoded()) {
            return Optional.of(purgeOrdersBitfield1);
        }
        if (purgeOrdersBitfield2Present() && !purgeOrdersBitfield2.isDecoded()) {
            return Optional.of(purgeOrdersBitfield2);
        }
        if (!riskGroupIdCnt.isDecoded()) {
            return Optional.of(riskGroupIdCnt);
        }
        if (!riskGroupIDs.isDecoded()) {
            return Optional.of(riskGroupIDs.failedEntry().flatMap(RiskGroupIDsEntry::failedAt).orElse(riskGroupIdCnt));
        }
        if (clearingFirmPresent() && !clearingFirm.isDecoded()) {
            return Optional.of(clearingFirm);
        }
        if (massCancelInstPresent() && !massCancelInst.isDecoded()) {
            return Optional.of(massCancelInst);
        }
        if (massCancelIdPresent() && !massCancelId.isDecoded()) {
            return Optional.of(massCancelId);
        }
        if (symbolPresent() && !symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (symbolSfxPresent() && !symbolSfx.isDecoded()) {
            return Optional.of(symbolSfx);
        }
        if (matchingUnitPresent() && !matchingUnit.isDecoded()) {
            return Optional.of(matchingUnit);
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "NumberOfPurgeOrdersBitfields" -> Optional.of(numberOfPurgeOrdersBitfields);
            case "PurgeOrdersBitfield1" -> Optional.of(purgeOrdersBitfield1);
            case "PurgeOrdersBitfield2" -> Optional.of(purgeOrdersBitfield2);
            case "RiskGroupIdCnt" -> Optional.of(riskGroupIdCnt);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "MassCancelInst" -> Optional.of(massCancelInst);
            case "MassCancelId" -> Optional.of(massCancelId);
            case "Symbol" -> Optional.of(symbol);
            case "SymbolSfx" -> Optional.of(symbolSfx);
            case "MatchingUnit" -> Optional.of(matchingUnit);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PurgeOrderMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(riskGroupIDs.diffFields(message.riskGroupIDs));
        return changed;
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    /**
     * Appends this message's formatted representation.
     *
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(", ");
            riskGroupIDs.toFormattedString(builder, options);
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : onWire) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
        riskGroupIDs.toFormattedString(builder, nested);
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
        if (!(other instanceof PurgeOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && riskGroupIDs.equals(message.riskGroupIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, riskGroupIDs);
    }
}
