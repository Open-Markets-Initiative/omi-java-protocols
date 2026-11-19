package omi.cboe.cfefutures.binaryorderentry.boe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ClearingFirmField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ManualOrderIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.MassCancelIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.MassCancelInstField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.NumberOfPurgeOrderBitfieldsField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.OeoidField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ProductNameField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.PurgeOrderBitfield1Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.PurgeOrderBitfield2Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.types.PrintOptions;

/**
 * Represents the PurgeOrderMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Request to cancel a group of orders across all the firm’s sessions.</p>
 */
public final class PurgeOrderMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 2;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Purge Order Message";

    /**
     * Number of bitfields that follow; the fields they gate are appended to the message.
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
    private final List<Field> fields = List.of(numberOfPurgeOrderBitfields, purgeOrderBitfield1, purgeOrderBitfield2, clearingFirm, massCancelInst, productName, massCancelId, manualOrderIndicator, oeoid);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Number of bitfields that follow; the fields they gate are appended to the message.
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
     * Returns whether the fields before the ProductName put it on the wire.
     *
     * <p>Decode reads the ProductName where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ProductName is on the wire
     */
    public boolean productNamePresent() {
        return (numberOfPurgeOrderBitfields.value() >= 1L) && (purgeOrderBitfield1Present() && purgeOrderBitfield1.purgeOrderBitfield1ProductName());
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
     * Returns whether the fields before the ManualOrderIndicator put it on the wire.
     *
     * <p>Decode reads the ManualOrderIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ManualOrderIndicator is on the wire
     */
    public boolean manualOrderIndicatorPresent() {
        return (numberOfPurgeOrderBitfields.value() >= 1L) && (purgeOrderBitfield1Present() && purgeOrderBitfield1.purgeOrderBitfield1ManualOrderIndicator());
    }

    /**
     * Returns whether the fields before the Oeoid put it on the wire.
     *
     * <p>Decode reads the Oeoid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Oeoid is on the wire
     */
    public boolean oeoidPresent() {
        return (numberOfPurgeOrderBitfields.value() >= 1L) && (purgeOrderBitfield1Present() && purgeOrderBitfield1.purgeOrderBitfield1Oeoid());
    }

    private boolean onWire(Field field) {
        return (field != purgeOrderBitfield1 || purgeOrderBitfield1Present()) && (field != purgeOrderBitfield2 || purgeOrderBitfield2Present()) && (field != clearingFirm || clearingFirmPresent()) && (field != massCancelInst || massCancelInstPresent()) && (field != productName || productNamePresent()) && (field != massCancelId || massCancelIdPresent()) && (field != manualOrderIndicator || manualOrderIndicatorPresent()) && (field != oeoid || oeoidPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (purgeOrderBitfield1Present() ? PurgeOrderBitfield1Field.BYTE_LENGTH : 0) + (purgeOrderBitfield2Present() ? PurgeOrderBitfield2Field.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (massCancelInstPresent() ? MassCancelInstField.BYTE_LENGTH : 0) + (productNamePresent() ? ProductNameField.BYTE_LENGTH : 0) + (massCancelIdPresent() ? MassCancelIdField.BYTE_LENGTH : 0) + (manualOrderIndicatorPresent() ? ManualOrderIndicatorField.BYTE_LENGTH : 0) + (oeoidPresent() ? OeoidField.BYTE_LENGTH : 0);
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
        if (!numberOfPurgeOrderBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfPurgeOrderBitfieldsField.BYTE_LENGTH;
        if (purgeOrderBitfield1Present()) {
            if (end - cursor < PurgeOrderBitfield1Field.BYTE_LENGTH || !purgeOrderBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeOrderBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeOrderBitfield2Present()) {
            if (end - cursor < PurgeOrderBitfield2Field.BYTE_LENGTH || !purgeOrderBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeOrderBitfield2Field.BYTE_LENGTH;
        }
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
        cursor = numberOfPurgeOrderBitfields.encode(data, cursor);
        if (purgeOrderBitfield1Present()) {
            cursor = purgeOrderBitfield1.encode(data, cursor);
        }
        if (purgeOrderBitfield2Present()) {
            cursor = purgeOrderBitfield2.encode(data, cursor);
        }
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
            case "NumberOfPurgeOrderBitfields" -> Optional.of(numberOfPurgeOrderBitfields);
            case "PurgeOrderBitfield1" -> Optional.of(purgeOrderBitfield1);
            case "PurgeOrderBitfield2" -> Optional.of(purgeOrderBitfield2);
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
        if (!(other instanceof PurgeOrderMessage message)) {
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
        if (!(other instanceof PurgeOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
