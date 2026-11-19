package omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ClearingFirmField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CustomGroupIdCntField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CustomGroupIdOneField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.CustomGroupIdnField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ManualOrderIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.MassCancelIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.MassCancelInstField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.NumberOfPurgeOrdersBitfieldsField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.OeoidField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.ProductNameField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.PurgeOrdersBitfield1Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.fields.PurgeOrdersBitfield2Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.types.PrintOptions;

/**
 * Represents the PurgeOrdersMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Purge Orders Message.</p>
 */
public final class PurgeOrdersMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 7;

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
     * Number of repeating CustomGroupID included in this message.
     */
    private final CustomGroupIdCntField customGroupIdCnt = new CustomGroupIdCntField();

    /**
     * First CustomGroupID. Only present if CustomGroupIDCnt is non-zero.
     */
    private final CustomGroupIdOneField customGroupIdOne = new CustomGroupIdOneField();

    /**
     * Last CustomGroupID.
     */
    private final CustomGroupIdnField customGroupIdn = new CustomGroupIdnField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Mass Cancel Inst
     */
    private final MassCancelInstField massCancelInst = new MassCancelInstField();

    /**
     * Product Name
     */
    private final ProductNameField productName = new ProductNameField();

    /**
     * Mass Cancel Id
     */
    private final MassCancelIdField massCancelId = new MassCancelIdField();

    /**
     * Manual Order Indicator
     */
    private final ManualOrderIndicatorField manualOrderIndicator = new ManualOrderIndicatorField();

    /**
     * Oeoid
     */
    private final OeoidField oeoid = new OeoidField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(numberOfPurgeOrdersBitfields, purgeOrdersBitfield1, purgeOrdersBitfield2, customGroupIdCnt, customGroupIdOne, customGroupIdn, clearingFirm, massCancelInst, productName, massCancelId, manualOrderIndicator, oeoid);

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
     * Number of repeating CustomGroupID included in this message.
     *
     * @return the CustomGroupIdCnt field
     */
    public CustomGroupIdCntField customGroupIdCnt() {
        return customGroupIdCnt;
    }

    /**
     * First CustomGroupID. Only present if CustomGroupIDCnt is non-zero.
     *
     * @return the CustomGroupIdOne field
     */
    public CustomGroupIdOneField customGroupIdOne() {
        return customGroupIdOne;
    }

    /**
     * Last CustomGroupID.
     *
     * @return the CustomGroupIdn field
     */
    public CustomGroupIdnField customGroupIdn() {
        return customGroupIdn;
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
     * Product Name
     *
     * @return the ProductName field
     */
    public ProductNameField productName() {
        return productName;
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
     * Manual Order Indicator
     *
     * @return the ManualOrderIndicator field
     */
    public ManualOrderIndicatorField manualOrderIndicator() {
        return manualOrderIndicator;
    }

    /**
     * Oeoid
     *
     * @return the Oeoid field
     */
    public OeoidField oeoid() {
        return oeoid;
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
     * Returns whether the fields before the ProductName put it on the wire.
     *
     * <p>Decode reads the ProductName where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ProductName is on the wire
     */
    public boolean productNamePresent() {
        return (numberOfPurgeOrdersBitfields.value() >= 1L) && (purgeOrdersBitfield1Present() && purgeOrdersBitfield1.purgeOrdersBitfield1ProductName());
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
     * Returns whether the fields before the ManualOrderIndicator put it on the wire.
     *
     * <p>Decode reads the ManualOrderIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ManualOrderIndicator is on the wire
     */
    public boolean manualOrderIndicatorPresent() {
        return (numberOfPurgeOrdersBitfields.value() >= 1L) && (purgeOrdersBitfield1Present() && purgeOrdersBitfield1.purgeOrdersBitfield1ManualOrderIndicator());
    }

    /**
     * Returns whether the fields before the Oeoid put it on the wire.
     *
     * <p>Decode reads the Oeoid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Oeoid is on the wire
     */
    public boolean oeoidPresent() {
        return (numberOfPurgeOrdersBitfields.value() >= 1L) && (purgeOrdersBitfield1Present() && purgeOrdersBitfield1.purgeOrdersBitfield1Oeoid());
    }

    private boolean onWire(Field field) {
        return (field != purgeOrdersBitfield1 || purgeOrdersBitfield1Present()) && (field != purgeOrdersBitfield2 || purgeOrdersBitfield2Present()) && (field != clearingFirm || clearingFirmPresent()) && (field != massCancelInst || massCancelInstPresent()) && (field != productName || productNamePresent()) && (field != massCancelId || massCancelIdPresent()) && (field != manualOrderIndicator || manualOrderIndicatorPresent()) && (field != oeoid || oeoidPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (purgeOrdersBitfield1Present() ? PurgeOrdersBitfield1Field.BYTE_LENGTH : 0) + (purgeOrdersBitfield2Present() ? PurgeOrdersBitfield2Field.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (massCancelInstPresent() ? MassCancelInstField.BYTE_LENGTH : 0) + (productNamePresent() ? ProductNameField.BYTE_LENGTH : 0) + (massCancelIdPresent() ? MassCancelIdField.BYTE_LENGTH : 0) + (manualOrderIndicatorPresent() ? ManualOrderIndicatorField.BYTE_LENGTH : 0) + (oeoidPresent() ? OeoidField.BYTE_LENGTH : 0);
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
        cursor += 2;
        cursor += 2;
        if (clearingFirmPresent()) {
            cursor += 4;
        }
        if (massCancelInstPresent()) {
            cursor += 16;
        }
        if (productNamePresent()) {
            cursor += 6;
        }
        if (massCancelIdPresent()) {
            cursor += 20;
        }
        if (manualOrderIndicatorPresent()) {
            cursor += 1;
        }
        if (oeoidPresent()) {
            cursor += 18;
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
            if (end - 5 - cursor < PurgeOrdersBitfield1Field.BYTE_LENGTH || !purgeOrdersBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeOrdersBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 5) {
            return false;
        }
        if (purgeOrdersBitfield2Present()) {
            if (end - 5 - cursor < PurgeOrdersBitfield2Field.BYTE_LENGTH || !purgeOrdersBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeOrdersBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 5) {
            return false;
        }
        if (!customGroupIdCnt.parse(data, cursor)) {
            return false;
        }
        cursor += CustomGroupIdCntField.BYTE_LENGTH;
        if (!customGroupIdOne.parse(data, cursor)) {
            return false;
        }
        cursor += CustomGroupIdOneField.BYTE_LENGTH;
        if (!customGroupIdn.parse(data, cursor)) {
            return false;
        }
        cursor += CustomGroupIdnField.BYTE_LENGTH;
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
        if (productNamePresent()) {
            if (end - cursor < ProductNameField.BYTE_LENGTH || !productName.parse(data, cursor)) {
                return false;
            }
            cursor += ProductNameField.BYTE_LENGTH;
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
        if (manualOrderIndicatorPresent()) {
            if (end - cursor < ManualOrderIndicatorField.BYTE_LENGTH || !manualOrderIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (oeoidPresent()) {
            if (end - cursor < OeoidField.BYTE_LENGTH || !oeoid.parse(data, cursor)) {
                return false;
            }
            cursor += OeoidField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
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
        if (productNamePresent() != productName.hasValue()) {
            throw new IllegalStateException(productName.hasValue() ? "productName holds a value the fields before it leave off the wire" : "productName holds no value, though the fields before it put it on the wire");
        }
        if (massCancelIdPresent() != massCancelId.hasValue()) {
            throw new IllegalStateException(massCancelId.hasValue() ? "massCancelId holds a value the fields before it leave off the wire" : "massCancelId holds no value, though the fields before it put it on the wire");
        }
        if (manualOrderIndicatorPresent() != manualOrderIndicator.hasValue()) {
            throw new IllegalStateException(manualOrderIndicator.hasValue() ? "manualOrderIndicator holds a value the fields before it leave off the wire" : "manualOrderIndicator holds no value, though the fields before it put it on the wire");
        }
        if (oeoidPresent() != oeoid.hasValue()) {
            throw new IllegalStateException(oeoid.hasValue() ? "oeoid holds a value the fields before it leave off the wire" : "oeoid holds no value, though the fields before it put it on the wire");
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
        cursor = customGroupIdOne.encode(data, cursor);
        cursor = customGroupIdn.encode(data, cursor);
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (massCancelInstPresent()) {
            cursor = massCancelInst.encode(data, cursor);
        }
        if (productNamePresent()) {
            cursor = productName.encode(data, cursor);
        }
        if (massCancelIdPresent()) {
            cursor = massCancelId.encode(data, cursor);
        }
        if (manualOrderIndicatorPresent()) {
            cursor = manualOrderIndicator.encode(data, cursor);
        }
        if (oeoidPresent()) {
            cursor = oeoid.encode(data, cursor);
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
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields()) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields()) {
            if (!field.isValid()) {
                return false;
            }
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
        for (Field field : fields) {
            if (!field.isDecoded()) {
                return Optional.of(field);
            }
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
            case "CustomGroupIdOne" -> Optional.of(customGroupIdOne);
            case "CustomGroupIdn" -> Optional.of(customGroupIdn);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "MassCancelInst" -> Optional.of(massCancelInst);
            case "ProductName" -> Optional.of(productName);
            case "MassCancelId" -> Optional.of(massCancelId);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "Oeoid" -> Optional.of(oeoid);
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
