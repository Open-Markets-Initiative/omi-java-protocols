package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ClearingFirmField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.CustomGroupIdCntField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.MassCancelIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.NumberOfPurgeOrdersBitfieldsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ProductCodeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.PurgeOrdersBitfield1Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.PurgeOrdersBitfield2Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.groups.CustomGroupIdsEntry;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.groups.CustomGroupIdsList;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.types.Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.types.PrintOptions;

/**
 * Represents the PurgeOrdersMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Purge Orders Message.</p>
 */
public final class PurgeOrdersMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 3;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Purge Orders Message";

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
     * Number of repeating CustomGroupId included in this message.
     */
    private final CustomGroupIdCntField customGroupIdCnt = new CustomGroupIdCntField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Product Code
     */
    private final ProductCodeField productCode = new ProductCodeField();

    /**
     * Mass Cancel Id
     */
    private final MassCancelIdField massCancelId = new MassCancelIdField();

    /**
     * Repeating group stated CustomGroupIdCnt times.
     */
    private final CustomGroupIdsList customGroupIds = new CustomGroupIdsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(numberOfPurgeOrdersBitfields, purgeOrdersBitfield1, purgeOrdersBitfield2, customGroupIdCnt, clearingFirm, productCode, massCancelId);

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
     * Product Code
     *
     * @return the ProductCode field
     */
    public ProductCodeField productCode() {
        return productCode;
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
     * Returns whether the fields before the ProductCode put it on the wire.
     *
     * <p>Decode reads the ProductCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ProductCode is on the wire
     */
    public boolean productCodePresent() {
        return (numberOfPurgeOrdersBitfields.value() >= 1L) && (purgeOrdersBitfield1Present() && purgeOrdersBitfield1.purgeOrdersBitfield1ProductCode());
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

    private boolean onWire(Field field) {
        return (field != purgeOrdersBitfield1 || purgeOrdersBitfield1Present()) && (field != purgeOrdersBitfield2 || purgeOrdersBitfield2Present()) && (field != clearingFirm || clearingFirmPresent()) && (field != productCode || productCodePresent()) && (field != massCancelId || massCancelIdPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (purgeOrdersBitfield1Present() ? PurgeOrdersBitfield1Field.BYTE_LENGTH : 0) + (purgeOrdersBitfield2Present() ? PurgeOrdersBitfield2Field.BYTE_LENGTH : 0) + customGroupIds.byteLength() + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (productCodePresent() ? ProductCodeField.BYTE_LENGTH : 0) + (massCancelIdPresent() ? MassCancelIdField.BYTE_LENGTH : 0);
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
        cursor += customGroupIds.byteLength();
        if (clearingFirmPresent()) {
            cursor += 4;
        }
        if (productCodePresent()) {
            cursor += 6;
        }
        if (massCancelIdPresent()) {
            cursor += 20;
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
        if (productCodePresent()) {
            if (end - cursor < ProductCodeField.BYTE_LENGTH || !productCode.parse(data, cursor)) {
                return false;
            }
            cursor += ProductCodeField.BYTE_LENGTH;
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

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (customGroupIds.size() > 255) {
            throw new IllegalStateException("customGroupIds holds " + customGroupIds.size() + " entries, more than its count field can state");
        }
        customGroupIdCnt.value((short) customGroupIds.size());
        if (purgeOrdersBitfield1Present() != purgeOrdersBitfield1.hasValue()) {
            throw new IllegalStateException(purgeOrdersBitfield1.hasValue() ? "purgeOrdersBitfield1 holds a value the fields before it leave off the wire" : "purgeOrdersBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (purgeOrdersBitfield2Present() != purgeOrdersBitfield2.hasValue()) {
            throw new IllegalStateException(purgeOrdersBitfield2.hasValue() ? "purgeOrdersBitfield2 holds a value the fields before it leave off the wire" : "purgeOrdersBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (productCodePresent() != productCode.hasValue()) {
            throw new IllegalStateException(productCode.hasValue() ? "productCode holds a value the fields before it leave off the wire" : "productCode holds no value, though the fields before it put it on the wire");
        }
        if (massCancelIdPresent() != massCancelId.hasValue()) {
            throw new IllegalStateException(massCancelId.hasValue() ? "massCancelId holds a value the fields before it leave off the wire" : "massCancelId holds no value, though the fields before it put it on the wire");
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
        cursor = customGroupIdCnt.encode(data, cursor);
        cursor = customGroupIds.encode(data, cursor);
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (productCodePresent()) {
            cursor = productCode.encode(data, cursor);
        }
        if (massCancelIdPresent()) {
            cursor = massCancelId.encode(data, cursor);
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
        if (!numberOfPurgeOrdersBitfields.isDecoded()) {
            return Optional.of(numberOfPurgeOrdersBitfields);
        }
        if (purgeOrdersBitfield1Present() && !purgeOrdersBitfield1.isDecoded()) {
            return Optional.of(purgeOrdersBitfield1);
        }
        if (purgeOrdersBitfield2Present() && !purgeOrdersBitfield2.isDecoded()) {
            return Optional.of(purgeOrdersBitfield2);
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
        if (productCodePresent() && !productCode.isDecoded()) {
            return Optional.of(productCode);
        }
        if (massCancelIdPresent() && !massCancelId.isDecoded()) {
            return Optional.of(massCancelId);
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
            case "CustomGroupIdCnt" -> Optional.of(customGroupIdCnt);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ProductCode" -> Optional.of(productCode);
            case "MassCancelId" -> Optional.of(massCancelId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PurgeOrdersMessage message)) {
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
        if (!(other instanceof PurgeOrdersMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && customGroupIds.equals(message.customGroupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, customGroupIds);
    }
}
