package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.EncryptionKeyIdField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.EncryptionOffsetField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.IsEncryptedField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.OrderCountField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.PriceField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.QuantityField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.GroupEntry;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.PrintOptions;

/**
 * The PriceLevel record a message holds.
 *
 * <p>PriceLevel</p>
 */
public final class PriceLevel implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 31;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "PriceLevel";

    /**
     * A boolean value specifying whether the level is encrypted
     */
    private final IsEncryptedField isEncrypted = new IsEncryptedField();

    /**
     * Encryption byte offset
     */
    private final EncryptionOffsetField encryptionOffset = new EncryptionOffsetField();

    /**
     * Encryption Key ID - reference to a EncryptionKey message
     */
    private final EncryptionKeyIdField encryptionKeyId = new EncryptionKeyIdField();

    /**
     * Auction price (final auction price)
     */
    private final PriceField price = new PriceField();

    /**
     * Auction quantity (final auction volume)
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Number of open orders at BBO level 1
     */
    private final OrderCountField orderCount = new OrderCountField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(isEncrypted, encryptionOffset, encryptionKeyId, price, quantity, orderCount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * A boolean value specifying whether the level is encrypted
     *
     * @return the IsEncrypted field
     */
    public IsEncryptedField isEncrypted() {
        return isEncrypted;
    }

    /**
     * Encryption byte offset
     *
     * @return the EncryptionOffset field
     */
    public EncryptionOffsetField encryptionOffset() {
        return encryptionOffset;
    }

    /**
     * Encryption Key ID - reference to a EncryptionKey message
     *
     * @return the EncryptionKeyId field
     */
    public EncryptionKeyIdField encryptionKeyId() {
        return encryptionKeyId;
    }

    /**
     * Auction price (final auction price)
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Auction quantity (final auction volume)
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Number of open orders at BBO level 1
     *
     * @return the OrderCount field
     */
    public OrderCountField orderCount() {
        return orderCount;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
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
        if (!isEncrypted.parse(data, cursor)) {
            return false;
        }
        cursor += IsEncryptedField.BYTE_LENGTH;
        if (!encryptionOffset.parse(data, cursor)) {
            return false;
        }
        cursor += EncryptionOffsetField.BYTE_LENGTH;
        if (!encryptionKeyId.parse(data, cursor)) {
            return false;
        }
        cursor += EncryptionKeyIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        return orderCount.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = isEncrypted.encode(data, cursor);
        cursor = encryptionOffset.encode(data, cursor);
        cursor = encryptionKeyId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = orderCount.encode(data, cursor);
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
            case "IsEncrypted" -> Optional.of(isEncrypted);
            case "EncryptionOffset" -> Optional.of(encryptionOffset);
            case "EncryptionKeyId" -> Optional.of(encryptionKeyId);
            case "Price" -> Optional.of(price);
            case "Quantity" -> Optional.of(quantity);
            case "OrderCount" -> Optional.of(orderCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof PriceLevel message)) {
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
        if (!(other instanceof PriceLevel message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
