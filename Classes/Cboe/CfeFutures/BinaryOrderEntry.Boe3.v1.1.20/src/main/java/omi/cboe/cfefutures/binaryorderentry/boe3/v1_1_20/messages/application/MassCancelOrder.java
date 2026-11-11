package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ClearingFirmField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ManualOrderIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.MassCancelIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.OeoIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ProductNameField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.structs.MassCancelInst;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.PrintOptions;

/**
 * Represents the MassCancelOrder message from the BinaryOrderEntry protocol.
 *
 * <p>A Mass Cancel Order message is a request to cancel a group of orders or quotes</p>
 */
public final class MassCancelOrder implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 65;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mass Cancel Order";

    /**
     * User-defined identifier of the mass cancel or purge request
     */
    private final MassCancelIdField massCancelId = new MassCancelIdField();

    /**
     * EFID that will clear the trade
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Used to specify product class (e
     */
    private final ProductNameField productName = new ProductNameField();

    /**
     * Y=Manual order entry N =Automated order entry
     */
    private final ManualOrderIndicatorField manualOrderIndicator = new ManualOrderIndicatorField();

    /**
     * Identifies the Order Entry Operator responsible for this message
     */
    private final OeoIdField oeoId = new OeoIdField();

    /**
     * Mass Cancel Inst
     */
    private final MassCancelInst massCancelInst = new MassCancelInst();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(massCancelId), List.<Field>of(clearingFirm), List.<Field>of(productName), massCancelInst.fields(), List.<Field>of(manualOrderIndicator), List.<Field>of(oeoId)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * User-defined identifier of the mass cancel or purge request
     *
     * @return the MassCancelId field
     */
    public MassCancelIdField massCancelId() {
        return massCancelId;
    }

    /**
     * EFID that will clear the trade
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Used to specify product class (e
     *
     * @return the ProductName field
     */
    public ProductNameField productName() {
        return productName;
    }

    /**
     * Y=Manual order entry N =Automated order entry
     *
     * @return the ManualOrderIndicator field
     */
    public ManualOrderIndicatorField manualOrderIndicator() {
        return manualOrderIndicator;
    }

    /**
     * Identifies the Order Entry Operator responsible for this message
     *
     * @return the OeoId field
     */
    public OeoIdField oeoId() {
        return oeoId;
    }

    /**
     * Mass Cancel Inst
     *
     * @return the MassCancelInst record
     */
    public MassCancelInst massCancelInst() {
        return massCancelInst;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!massCancelId.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelIdField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!productName.parse(data, cursor)) {
            return false;
        }
        cursor += ProductNameField.BYTE_LENGTH;
        if (!massCancelInst.parseFrom(data, cursor, end - 19)) {
            return false;
        }
        cursor += massCancelInst.byteLength();
        if (!manualOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        return oeoId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = massCancelId.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = productName.encode(data, cursor);
        cursor = massCancelInst.encode(data, cursor);
        cursor = manualOrderIndicator.encode(data, cursor);
        cursor = oeoId.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        massCancelInst.clear();
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
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
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
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "MassCancelId" -> Optional.of(massCancelId);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ProductName" -> Optional.of(productName);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "OeoId" -> Optional.of(oeoId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MassCancelOrder message)) {
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
        if (!(other instanceof MassCancelOrder message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
