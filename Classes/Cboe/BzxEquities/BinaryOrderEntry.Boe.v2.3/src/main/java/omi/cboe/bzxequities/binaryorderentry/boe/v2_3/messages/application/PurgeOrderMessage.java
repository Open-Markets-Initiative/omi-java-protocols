package omi.cboe.bzxequities.binaryorderentry.boe.v2_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.fields.ClearingFirmField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.fields.CustomGroupIdCntField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.fields.MassCancelIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.fields.MassCancelInstField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.fields.NumberOfPurgeOrderBitfieldsField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.fields.PurgeOrderBitfield1Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.fields.PurgeOrderBitfield2Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.fields.SymbolField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.fields.SymbolSfxField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.groups.CustomGroupIDsEntry;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.groups.CustomGroupIDsList;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.types.Message;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_3.types.PrintOptions;

/**
 * Represents the PurgeOrderMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Request to cancel a group of orders across all the firm’s sessions.</p>
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
     * Bitfield identifying which bitfields are set. Field values must be appended to the end of the message.
     */
    private final NumberOfPurgeOrderBitfieldsField numberOfPurgeOrderBitfields = new NumberOfPurgeOrderBitfieldsField();

    /**
     * BitSet PurgeOrder byte 1.
     */
    private final PurgeOrderBitfield1Field purgeOrderBitfield1 = new PurgeOrderBitfield1Field();

    /**
     * BitSet PurgeOrder byte 2.
     */
    private final PurgeOrderBitfield2Field purgeOrderBitfield2 = new PurgeOrderBitfield2Field();

    /**
     * Number of repeating CustomGroupID values included in this message. May be 0.
     */
    private final CustomGroupIdCntField customGroupIdCnt = new CustomGroupIdCntField();

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
     * Repeating CustomGroupID value appended after CustomGroupIDCnt in the Purge Orders message. CustomGroupIDCnt instances follow (count may be 0). Each names a custom group whose orders are to be cancelled; the filter cannot be combined with the symbol filter.
     */
    private final CustomGroupIDsList customGroupIDs = new CustomGroupIDsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(numberOfPurgeOrderBitfields, purgeOrderBitfield1, purgeOrderBitfield2, customGroupIdCnt, clearingFirm, massCancelInst, massCancelId, symbol, symbolSfx);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Bitfield identifying which bitfields are set. Field values must be appended to the end of the message.
     *
     * @return the NumberOfPurgeOrderBitfields field
     */
    public NumberOfPurgeOrderBitfieldsField numberOfPurgeOrderBitfields() {
        return numberOfPurgeOrderBitfields;
    }

    /**
     * BitSet PurgeOrder byte 1.
     *
     * @return the PurgeOrderBitfield1 field
     */
    public PurgeOrderBitfield1Field purgeOrderBitfield1() {
        return purgeOrderBitfield1;
    }

    /**
     * BitSet PurgeOrder byte 2.
     *
     * @return the PurgeOrderBitfield2 field
     */
    public PurgeOrderBitfield2Field purgeOrderBitfield2() {
        return purgeOrderBitfield2;
    }

    /**
     * Number of repeating CustomGroupID values included in this message. May be 0.
     *
     * @return the CustomGroupIdCnt field
     */
    public CustomGroupIdCntField customGroupIdCnt() {
        return customGroupIdCnt;
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
     * Repeating CustomGroupID value appended after CustomGroupIDCnt in the Purge Orders message. CustomGroupIDCnt instances follow (count may be 0). Each names a custom group whose orders are to be cancelled; the filter cannot be combined with the symbol filter.
     *
     * <p>Encode writes this list's size to the CustomGroupIdCnt field.</p>
     *
     * @return the CustomGroupIDs entries
     */
    public CustomGroupIDsList customGroupIDs() {
        return customGroupIDs;
    }

    /**
     * Returns whether the fields before the PurgeOrderBitfield1 put it on the wire.
     *
     * <p>Decode reads the PurgeOrderBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeOrderBitfield1 is on the wire
     */
    public boolean purgeOrderBitfield1Present() {
        return numberOfPurgeOrderBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the PurgeOrderBitfield2 put it on the wire.
     *
     * <p>Decode reads the PurgeOrderBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeOrderBitfield2 is on the wire
     */
    public boolean purgeOrderBitfield2Present() {
        return numberOfPurgeOrderBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfPurgeOrderBitfields.value() >= 1L) && (purgeOrderBitfield1Present() && purgeOrderBitfield1.purgeOrderBitfield1ClearingFirm());
    }

    /**
     * Returns whether the fields before the MassCancelInst put it on the wire.
     *
     * <p>Decode reads the MassCancelInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelInst is on the wire
     */
    public boolean massCancelInstPresent() {
        return (numberOfPurgeOrderBitfields.value() >= 1L) && (purgeOrderBitfield1Present() && purgeOrderBitfield1.purgeOrderBitfield1MassCancelInst());
    }

    /**
     * Returns whether the fields before the MassCancelId put it on the wire.
     *
     * <p>Decode reads the MassCancelId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelId is on the wire
     */
    public boolean massCancelIdPresent() {
        return (numberOfPurgeOrderBitfields.value() >= 1L) && (purgeOrderBitfield1Present() && purgeOrderBitfield1.purgeOrderBitfield1MassCancelId());
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfPurgeOrderBitfields.value() >= 2L) && (purgeOrderBitfield2Present() && purgeOrderBitfield2.purgeOrderBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the SymbolSfx put it on the wire.
     *
     * <p>Decode reads the SymbolSfx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolSfx is on the wire
     */
    public boolean symbolSfxPresent() {
        return (numberOfPurgeOrderBitfields.value() >= 2L) && (purgeOrderBitfield2Present() && purgeOrderBitfield2.purgeOrderBitfield2SymbolSfx());
    }

    private boolean onWire(Field field) {
        return (field != purgeOrderBitfield1 || purgeOrderBitfield1Present()) && (field != purgeOrderBitfield2 || purgeOrderBitfield2Present()) && (field != clearingFirm || clearingFirmPresent()) && (field != massCancelInst || massCancelInstPresent()) && (field != massCancelId || massCancelIdPresent()) && (field != symbol || symbolPresent()) && (field != symbolSfx || symbolSfxPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (purgeOrderBitfield1Present() ? PurgeOrderBitfield1Field.BYTE_LENGTH : 0) + (purgeOrderBitfield2Present() ? PurgeOrderBitfield2Field.BYTE_LENGTH : 0) + customGroupIDs.byteLength() + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (massCancelInstPresent() ? MassCancelInstField.BYTE_LENGTH : 0) + (massCancelIdPresent() ? MassCancelIdField.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (symbolSfxPresent() ? SymbolSfxField.BYTE_LENGTH : 0);
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
        if (purgeOrderBitfield1Present()) {
            cursor += 1;
        }
        if (purgeOrderBitfield2Present()) {
            cursor += 1;
        }
        cursor += 1;
        cursor = customGroupIDs.padding(runs, cursor);
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
        if (!numberOfPurgeOrderBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfPurgeOrderBitfieldsField.BYTE_LENGTH;
        if (purgeOrderBitfield1Present()) {
            if (end - 1 - cursor < PurgeOrderBitfield1Field.BYTE_LENGTH || !purgeOrderBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeOrderBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (purgeOrderBitfield2Present()) {
            if (end - 1 - cursor < PurgeOrderBitfield2Field.BYTE_LENGTH || !purgeOrderBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeOrderBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (!customGroupIdCnt.parse(data, cursor)) {
            return false;
        }
        cursor += CustomGroupIdCntField.BYTE_LENGTH;
        if (!customGroupIDs.parse(data, cursor, end, customGroupIdCnt.value())) {
            return false;
        }
        cursor += customGroupIDs.byteLength();
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

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (customGroupIDs.size() > 255) {
            throw new IllegalStateException("customGroupIDs holds " + customGroupIDs.size() + " entries, more than its count field can state");
        }
        customGroupIdCnt.value((short) customGroupIDs.size());
        if (purgeOrderBitfield1Present() != purgeOrderBitfield1.hasValue()) {
            throw new IllegalStateException(purgeOrderBitfield1.hasValue() ? "purgeOrderBitfield1 holds a value the fields before it leave off the wire" : "purgeOrderBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (purgeOrderBitfield2Present() != purgeOrderBitfield2.hasValue()) {
            throw new IllegalStateException(purgeOrderBitfield2.hasValue() ? "purgeOrderBitfield2 holds a value the fields before it leave off the wire" : "purgeOrderBitfield2 holds no value, though the fields before it put it on the wire");
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
        int cursor = offset;
        if (buffer != null && buffer.length >= 0 + 1) {
            System.arraycopy(buffer, 0, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfPurgeOrderBitfields.encode(data, cursor);
        if (purgeOrderBitfield1Present()) {
            cursor = purgeOrderBitfield1.encode(data, cursor);
        }
        if (purgeOrderBitfield2Present()) {
            cursor = purgeOrderBitfield2.encode(data, cursor);
        }
        cursor = customGroupIdCnt.encode(data, cursor);
        cursor = customGroupIDs.encode(data, cursor);
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
        customGroupIDs.clear();
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
            if (field != customGroupIdCnt && !field.isRecognized()) {
                return false;
            }
        }
        if (!customGroupIDs.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != customGroupIdCnt && !field.isValid()) {
                return false;
            }
        }
        if (!customGroupIDs.isValid()) {
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
        if (!numberOfPurgeOrderBitfields.isDecoded()) {
            return Optional.of(numberOfPurgeOrderBitfields);
        }
        if (purgeOrderBitfield1Present() && !purgeOrderBitfield1.isDecoded()) {
            return Optional.of(purgeOrderBitfield1);
        }
        if (purgeOrderBitfield2Present() && !purgeOrderBitfield2.isDecoded()) {
            return Optional.of(purgeOrderBitfield2);
        }
        if (!customGroupIdCnt.isDecoded()) {
            return Optional.of(customGroupIdCnt);
        }
        if (!customGroupIDs.isDecoded()) {
            return Optional.of(customGroupIDs.failedEntry().flatMap(CustomGroupIDsEntry::failedAt).orElse(customGroupIdCnt));
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
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "NumberOfPurgeOrderBitfields" -> Optional.of(numberOfPurgeOrderBitfields);
            case "PurgeOrderBitfield1" -> Optional.of(purgeOrderBitfield1);
            case "PurgeOrderBitfield2" -> Optional.of(purgeOrderBitfield2);
            case "CustomGroupIdCnt" -> Optional.of(customGroupIdCnt);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "MassCancelInst" -> Optional.of(massCancelInst);
            case "MassCancelId" -> Optional.of(massCancelId);
            case "Symbol" -> Optional.of(symbol);
            case "SymbolSfx" -> Optional.of(symbolSfx);
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
        changed.addAll(customGroupIDs.diffFields(message.customGroupIDs));
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
            customGroupIDs.toFormattedString(builder, options);
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
        customGroupIDs.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && customGroupIDs.equals(message.customGroupIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, customGroupIDs);
    }
}
