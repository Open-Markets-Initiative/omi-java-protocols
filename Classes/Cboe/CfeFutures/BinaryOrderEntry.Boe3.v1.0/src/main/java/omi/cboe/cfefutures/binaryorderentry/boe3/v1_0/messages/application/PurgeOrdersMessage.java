package omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.fields.ClearingFirmField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.fields.CustomGroupIdCntField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.fields.ManualOrderIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.fields.MassCancelIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.fields.OeoIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.fields.ProductNameField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.groups.CustomGroupIdEntry;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.groups.CustomGroupIdList;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.structs.MassCancelInst;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.types.PrintOptions;

/**
 * Represents the PurgeOrdersMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Request to cancel a group of orders or quotes across all the TPH's sessions for that port’s matching unit</p>
 */
public final class PurgeOrdersMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 66;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Purge Orders Message";

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
     * Number of repeating CustomGroupId’s included in this message
     */
    private final CustomGroupIdCntField customGroupIdCnt = new CustomGroupIdCntField();

    /**
     * Used to group orders for use in mass cancels where multiple orders can be cancelled by specifying a list of CustomGroupIds
     */
    private final CustomGroupIdList customGroupId = new CustomGroupIdList();

    /**
     * Mass Cancel Inst
     */
    private final MassCancelInst massCancelInst = new MassCancelInst();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(massCancelId), List.<Field>of(clearingFirm), List.<Field>of(productName), massCancelInst.fields(), List.<Field>of(manualOrderIndicator), List.<Field>of(oeoId), List.<Field>of(customGroupIdCnt)).flatMap(List::stream).toList();

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
     * Number of repeating CustomGroupId’s included in this message
     *
     * @return the CustomGroupIdCnt field
     */
    public CustomGroupIdCntField customGroupIdCnt() {
        return customGroupIdCnt;
    }

    /**
     * Used to group orders for use in mass cancels where multiple orders can be cancelled by specifying a list of CustomGroupIds
     *
     * <p>Encode writes this list's size to the CustomGroupIdCnt field.</p>
     *
     * @return the CustomGroupId entries
     */
    public CustomGroupIdList customGroupId() {
        return customGroupId;
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
        return MINIMUM_BYTE_LENGTH + customGroupId.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
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
        if (!massCancelInst.parseFrom(data, cursor, end - 20)) {
            return false;
        }
        cursor += massCancelInst.byteLength();
        if (!manualOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        if (!oeoId.parse(data, cursor)) {
            return false;
        }
        cursor += OeoIdField.BYTE_LENGTH;
        if (!customGroupIdCnt.parse(data, cursor)) {
            return false;
        }
        cursor += CustomGroupIdCntField.BYTE_LENGTH;
        if (!customGroupId.parse(data, cursor, end, customGroupIdCnt.value())) {
            return false;
        }
        cursor += customGroupId.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (customGroupId.size() > 255) {
            throw new IllegalStateException("customGroupId holds " + customGroupId.size() + " entries, more than its count field can state");
        }
        customGroupIdCnt.value((short) customGroupId.size());
        int cursor = offset;
        cursor = massCancelId.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = productName.encode(data, cursor);
        cursor = massCancelInst.encode(data, cursor);
        cursor = manualOrderIndicator.encode(data, cursor);
        cursor = oeoId.encode(data, cursor);
        cursor = customGroupIdCnt.encode(data, cursor);
        cursor = customGroupId.encode(data, cursor);
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
        massCancelInst.clear();
        customGroupId.clear();
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
        for (Field field : fields) {
            if (field != customGroupIdCnt && !field.isRecognized()) {
                return false;
            }
        }
        return customGroupId.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != customGroupIdCnt && !field.isValid()) {
                return false;
            }
        }
        if (!customGroupId.isValid()) {
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
        if (!massCancelId.isDecoded()) {
            return Optional.of(massCancelId);
        }
        if (!clearingFirm.isDecoded()) {
            return Optional.of(clearingFirm);
        }
        if (!productName.isDecoded()) {
            return Optional.of(productName);
        }
        if (!massCancelInst.isDecoded()) {
            return massCancelInst.failedAt();
        }
        if (!manualOrderIndicator.isDecoded()) {
            return Optional.of(manualOrderIndicator);
        }
        if (!oeoId.isDecoded()) {
            return Optional.of(oeoId);
        }
        if (!customGroupIdCnt.isDecoded()) {
            return Optional.of(customGroupIdCnt);
        }
        if (!customGroupId.isDecoded()) {
            return Optional.of(customGroupId.failedEntry().flatMap(CustomGroupIdEntry::failedAt).orElse(customGroupIdCnt));
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
            case "CustomGroupIdCnt" -> Optional.of(customGroupIdCnt);
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
        changed.addAll(customGroupId.diffFields(message.customGroupId));
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

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
            builder.append(", ");
            customGroupId.toFormattedString(builder, options);
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
        customGroupId.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && customGroupId.equals(message.customGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, customGroupId);
    }
}
