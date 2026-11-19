package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.fields.ClearingFirmField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.fields.CurrencyField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.fields.CustomGroupIdCntField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.fields.IdSourceField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.fields.MassCancelIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.fields.MassCancelInstField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.fields.NumberOfPurgeOrdersV2BitfieldsField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.fields.PurgeOrdersV2Bitfield1Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.fields.PurgeOrdersV2Bitfield2Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.fields.SecurityExchangeField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.fields.SecurityIdField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.fields.SymbolField;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.groups.CustomGroupIdsEntry;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.groups.CustomGroupIdsList;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.types.Field;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.types.Message;
import omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.types.PrintOptions;

/**
 * Represents the PurgeOrdersV2Message message from the BinaryOrderEntry protocol.
 *
 * <p>Purge Orders V2 Message.</p>
 */
public final class PurgeOrdersV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 3;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Purge Orders V 2 Message";

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfPurgeOrdersV2BitfieldsField numberOfPurgeOrdersV2Bitfields = new NumberOfPurgeOrdersV2BitfieldsField();

    /**
     * BitSet PurgeOrdersV2 byte 1.
     */
    private final PurgeOrdersV2Bitfield1Field purgeOrdersV2Bitfield1 = new PurgeOrdersV2Bitfield1Field();

    /**
     * BitSet PurgeOrdersV2 byte 2.
     */
    private final PurgeOrdersV2Bitfield2Field purgeOrdersV2Bitfield2 = new PurgeOrdersV2Bitfield2Field();

    /**
     * Number of repeating CustomGroupId included in this message.
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
     * Currency
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Id Source
     */
    private final IdSourceField idSource = new IdSourceField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Security Exchange
     */
    private final SecurityExchangeField securityExchange = new SecurityExchangeField();

    /**
     * Repeating group stated CustomGroupIdCnt times.
     */
    private final CustomGroupIdsList customGroupIds = new CustomGroupIdsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(numberOfPurgeOrdersV2Bitfields, purgeOrdersV2Bitfield1, purgeOrdersV2Bitfield2, customGroupIdCnt, clearingFirm, massCancelInst, massCancelId, symbol, currency, idSource, securityId, securityExchange);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfPurgeOrdersV2Bitfields field
     */
    public NumberOfPurgeOrdersV2BitfieldsField numberOfPurgeOrdersV2Bitfields() {
        return numberOfPurgeOrdersV2Bitfields;
    }

    /**
     * BitSet PurgeOrdersV2 byte 1.
     *
     * @return the PurgeOrdersV2Bitfield1 field
     */
    public PurgeOrdersV2Bitfield1Field purgeOrdersV2Bitfield1() {
        return purgeOrdersV2Bitfield1;
    }

    /**
     * BitSet PurgeOrdersV2 byte 2.
     *
     * @return the PurgeOrdersV2Bitfield2 field
     */
    public PurgeOrdersV2Bitfield2Field purgeOrdersV2Bitfield2() {
        return purgeOrdersV2Bitfield2;
    }

    /**
     * Number of repeating CustomGroupId included in this message.
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
     * Currency
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Id Source
     *
     * @return the IdSource field
     */
    public IdSourceField idSource() {
        return idSource;
    }

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
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
     * Repeating group stated CustomGroupIdCnt times.
     *
     * <p>Encode writes this list's size to the CustomGroupIdCnt field.</p>
     *
     * @return the CustomGroupIds entries
     */
    public CustomGroupIdsList customGroupIds() {
        return customGroupIds;
    }

    /**
     * Returns whether the fields before the PurgeOrdersV2Bitfield1 put it on the wire.
     *
     * <p>Decode reads the PurgeOrdersV2Bitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeOrdersV2Bitfield1 is on the wire
     */
    public boolean purgeOrdersV2Bitfield1Present() {
        return numberOfPurgeOrdersV2Bitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the PurgeOrdersV2Bitfield2 put it on the wire.
     *
     * <p>Decode reads the PurgeOrdersV2Bitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeOrdersV2Bitfield2 is on the wire
     */
    public boolean purgeOrdersV2Bitfield2Present() {
        return numberOfPurgeOrdersV2Bitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfPurgeOrdersV2Bitfields.value() >= 1L) && (purgeOrdersV2Bitfield1Present() && purgeOrdersV2Bitfield1.purgeOrdersV2Bitfield1ClearingFirm());
    }

    /**
     * Returns whether the fields before the MassCancelInst put it on the wire.
     *
     * <p>Decode reads the MassCancelInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelInst is on the wire
     */
    public boolean massCancelInstPresent() {
        return (numberOfPurgeOrdersV2Bitfields.value() >= 1L) && (purgeOrdersV2Bitfield1Present() && purgeOrdersV2Bitfield1.purgeOrdersV2Bitfield1MassCancelInst());
    }

    /**
     * Returns whether the fields before the MassCancelId put it on the wire.
     *
     * <p>Decode reads the MassCancelId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelId is on the wire
     */
    public boolean massCancelIdPresent() {
        return (numberOfPurgeOrdersV2Bitfields.value() >= 1L) && (purgeOrdersV2Bitfield1Present() && purgeOrdersV2Bitfield1.purgeOrdersV2Bitfield1MassCancelId());
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfPurgeOrdersV2Bitfields.value() >= 2L) && (purgeOrdersV2Bitfield2Present() && purgeOrdersV2Bitfield2.purgeOrdersV2Bitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Currency put it on the wire.
     *
     * <p>Decode reads the Currency where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Currency is on the wire
     */
    public boolean currencyPresent() {
        return (numberOfPurgeOrdersV2Bitfields.value() >= 2L) && (purgeOrdersV2Bitfield2Present() && purgeOrdersV2Bitfield2.purgeOrdersV2Bitfield2Currency());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfPurgeOrdersV2Bitfields.value() >= 2L) && (purgeOrdersV2Bitfield2Present() && purgeOrdersV2Bitfield2.purgeOrdersV2Bitfield2IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfPurgeOrdersV2Bitfields.value() >= 2L) && (purgeOrdersV2Bitfield2Present() && purgeOrdersV2Bitfield2.purgeOrdersV2Bitfield2SecurityId());
    }

    /**
     * Returns whether the fields before the SecurityExchange put it on the wire.
     *
     * <p>Decode reads the SecurityExchange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityExchange is on the wire
     */
    public boolean securityExchangePresent() {
        return (numberOfPurgeOrdersV2Bitfields.value() >= 2L) && (purgeOrdersV2Bitfield2Present() && purgeOrdersV2Bitfield2.purgeOrdersV2Bitfield2SecurityExchange());
    }

    private boolean onWire(Field field) {
        return (field != purgeOrdersV2Bitfield1 || purgeOrdersV2Bitfield1Present()) && (field != purgeOrdersV2Bitfield2 || purgeOrdersV2Bitfield2Present()) && (field != clearingFirm || clearingFirmPresent()) && (field != massCancelInst || massCancelInstPresent()) && (field != massCancelId || massCancelIdPresent()) && (field != symbol || symbolPresent()) && (field != currency || currencyPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != securityExchange || securityExchangePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (purgeOrdersV2Bitfield1Present() ? PurgeOrdersV2Bitfield1Field.BYTE_LENGTH : 0) + (purgeOrdersV2Bitfield2Present() ? PurgeOrdersV2Bitfield2Field.BYTE_LENGTH : 0) + customGroupIds.byteLength() + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (massCancelInstPresent() ? MassCancelInstField.BYTE_LENGTH : 0) + (massCancelIdPresent() ? MassCancelIdField.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (currencyPresent() ? CurrencyField.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (securityExchangePresent() ? SecurityExchangeField.BYTE_LENGTH : 0);
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
        if (purgeOrdersV2Bitfield1Present()) {
            cursor += 1;
        }
        if (purgeOrdersV2Bitfield2Present()) {
            cursor += 1;
        }
        cursor += 1;
        cursor += customGroupIds.byteLength();
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
        if (currencyPresent()) {
            cursor += 3;
        }
        if (idSourcePresent()) {
            cursor += 1;
        }
        if (securityIdPresent()) {
            cursor += 16;
        }
        if (securityExchangePresent()) {
            cursor += 4;
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
        if (!numberOfPurgeOrdersV2Bitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfPurgeOrdersV2BitfieldsField.BYTE_LENGTH;
        if (purgeOrdersV2Bitfield1Present()) {
            if (end - 1 - cursor < PurgeOrdersV2Bitfield1Field.BYTE_LENGTH || !purgeOrdersV2Bitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeOrdersV2Bitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (purgeOrdersV2Bitfield2Present()) {
            if (end - 1 - cursor < PurgeOrdersV2Bitfield2Field.BYTE_LENGTH || !purgeOrdersV2Bitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeOrdersV2Bitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (!customGroupIdCnt.parse(data, cursor)) {
            return false;
        }
        cursor += CustomGroupIdCntField.BYTE_LENGTH;
        if (!customGroupIds.parse(data, cursor, end, customGroupIdCnt.value())) {
            return false;
        }
        cursor += customGroupIds.byteLength();
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
        if (currencyPresent()) {
            if (end - cursor < CurrencyField.BYTE_LENGTH || !currency.parse(data, cursor)) {
                return false;
            }
            cursor += CurrencyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (idSourcePresent()) {
            if (end - cursor < IdSourceField.BYTE_LENGTH || !idSource.parse(data, cursor)) {
                return false;
            }
            cursor += IdSourceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (securityIdPresent()) {
            if (end - cursor < SecurityIdField.BYTE_LENGTH || !securityId.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (securityExchangePresent()) {
            if (end - cursor < SecurityExchangeField.BYTE_LENGTH || !securityExchange.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityExchangeField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (customGroupIds.size() > 255) {
            throw new IllegalStateException("customGroupIds holds " + customGroupIds.size() + " entries, more than its count field can state");
        }
        customGroupIdCnt.value((short) customGroupIds.size());
        if (purgeOrdersV2Bitfield1Present() != purgeOrdersV2Bitfield1.hasValue()) {
            throw new IllegalStateException(purgeOrdersV2Bitfield1.hasValue() ? "purgeOrdersV2Bitfield1 holds a value the fields before it leave off the wire" : "purgeOrdersV2Bitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (purgeOrdersV2Bitfield2Present() != purgeOrdersV2Bitfield2.hasValue()) {
            throw new IllegalStateException(purgeOrdersV2Bitfield2.hasValue() ? "purgeOrdersV2Bitfield2 holds a value the fields before it leave off the wire" : "purgeOrdersV2Bitfield2 holds no value, though the fields before it put it on the wire");
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
        if (currencyPresent() != currency.hasValue()) {
            throw new IllegalStateException(currency.hasValue() ? "currency holds a value the fields before it leave off the wire" : "currency holds no value, though the fields before it put it on the wire");
        }
        if (idSourcePresent() != idSource.hasValue()) {
            throw new IllegalStateException(idSource.hasValue() ? "idSource holds a value the fields before it leave off the wire" : "idSource holds no value, though the fields before it put it on the wire");
        }
        if (securityIdPresent() != securityId.hasValue()) {
            throw new IllegalStateException(securityId.hasValue() ? "securityId holds a value the fields before it leave off the wire" : "securityId holds no value, though the fields before it put it on the wire");
        }
        if (securityExchangePresent() != securityExchange.hasValue()) {
            throw new IllegalStateException(securityExchange.hasValue() ? "securityExchange holds a value the fields before it leave off the wire" : "securityExchange holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        if (buffer != null && buffer.length >= 1) {
            System.arraycopy(buffer, 0, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfPurgeOrdersV2Bitfields.encode(data, cursor);
        if (purgeOrdersV2Bitfield1Present()) {
            cursor = purgeOrdersV2Bitfield1.encode(data, cursor);
        }
        if (purgeOrdersV2Bitfield2Present()) {
            cursor = purgeOrdersV2Bitfield2.encode(data, cursor);
        }
        cursor = customGroupIdCnt.encode(data, cursor);
        cursor = customGroupIds.encode(data, cursor);
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
        if (currencyPresent()) {
            cursor = currency.encode(data, cursor);
        }
        if (idSourcePresent()) {
            cursor = idSource.encode(data, cursor);
        }
        if (securityIdPresent()) {
            cursor = securityId.encode(data, cursor);
        }
        if (securityExchangePresent()) {
            cursor = securityExchange.encode(data, cursor);
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
        customGroupIds.clear();
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
        return customGroupIds.isRecognized();
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
        if (!customGroupIds.isValid()) {
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
        if (!numberOfPurgeOrdersV2Bitfields.isDecoded()) {
            return Optional.of(numberOfPurgeOrdersV2Bitfields);
        }
        if (purgeOrdersV2Bitfield1Present() && !purgeOrdersV2Bitfield1.isDecoded()) {
            return Optional.of(purgeOrdersV2Bitfield1);
        }
        if (purgeOrdersV2Bitfield2Present() && !purgeOrdersV2Bitfield2.isDecoded()) {
            return Optional.of(purgeOrdersV2Bitfield2);
        }
        if (!customGroupIdCnt.isDecoded()) {
            return Optional.of(customGroupIdCnt);
        }
        if (!customGroupIds.isDecoded()) {
            return Optional.of(customGroupIds.failedEntry().flatMap(CustomGroupIdsEntry::failedAt).orElse(customGroupIdCnt));
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
        if (currencyPresent() && !currency.isDecoded()) {
            return Optional.of(currency);
        }
        if (idSourcePresent() && !idSource.isDecoded()) {
            return Optional.of(idSource);
        }
        if (securityIdPresent() && !securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (securityExchangePresent() && !securityExchange.isDecoded()) {
            return Optional.of(securityExchange);
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
            case "NumberOfPurgeOrdersV2Bitfields" -> Optional.of(numberOfPurgeOrdersV2Bitfields);
            case "PurgeOrdersV2Bitfield1" -> Optional.of(purgeOrdersV2Bitfield1);
            case "PurgeOrdersV2Bitfield2" -> Optional.of(purgeOrdersV2Bitfield2);
            case "CustomGroupIdCnt" -> Optional.of(customGroupIdCnt);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "MassCancelInst" -> Optional.of(massCancelInst);
            case "MassCancelId" -> Optional.of(massCancelId);
            case "Symbol" -> Optional.of(symbol);
            case "Currency" -> Optional.of(currency);
            case "IdSource" -> Optional.of(idSource);
            case "SecurityId" -> Optional.of(securityId);
            case "SecurityExchange" -> Optional.of(securityExchange);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PurgeOrdersV2Message message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(customGroupIds.diffFields(message.customGroupIds));
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
            customGroupIds.toFormattedString(builder, options);
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
        customGroupIds.toFormattedString(builder, nested);
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
        if (!(other instanceof PurgeOrdersV2Message message)) {
            return false;
        }
        return fields.equals(message.fields) && customGroupIds.equals(message.customGroupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, customGroupIds);
    }
}
