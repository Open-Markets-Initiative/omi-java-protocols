package omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.NewOrderIdField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.NewPriceParitySplitsField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.OrderIdField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.PrevPriceParitySplitsField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.PriceField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.SourceTimeNsField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.SymbolIndexField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.SymbolSeqNumField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.fields.VolumeField;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.types.Field;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.types.Message;
import omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.types.PrintOptions;

/**
 * Represents the ReplaceOrderMessage message from the IntegratedFeed protocol.
 *
 * <p>A Replace Order message is published when a cancel/replace order is received and executed. The sitting order is replaced with a new one containing the same symbol, side and attribution, a new Order ID, and the price and size specified. The sitting order must be removed from the book and replaced with the new order.</p>
 */
public final class ReplaceOrderMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 38;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Replace Order Message";

    /**
     * The nanosecond offset from the SourceTime
     */
    private final SourceTimeNsField sourceTimeNs = new SourceTimeNsField();

    /**
     * The unique ID of this symbol for all products within this market. This ID cannot be used to cross reference a security between markets.
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * Reserved for future use. Ignore any content. This usage will become standard across all products in future releases.
     */
    private final SymbolSeqNumField symbolSeqNum = new SymbolSeqNumField();

    /**
     * The unique ID assigned by the matching engine to this order . Can be used to match this message to the gateway Order Report.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * The new Order ID of the replacement order
     */
    private final NewOrderIdField newOrderId = new NewOrderIdField();

    /**
     * The order price. Use with the Price Scale from the symbol-mapping index.
     */
    private final PriceField price = new PriceField();

    /**
     * The order quantity in shares
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Resulting number of splits at the previous price Defaulted to 0. Future use by NYSE only.
     */
    private final PrevPriceParitySplitsField prevPriceParitySplits = new PrevPriceParitySplitsField();

    /**
     * Resulting number of splits at the new price. Defaulted to 0. Future use by NYSE only.
     */
    private final NewPriceParitySplitsField newPriceParitySplits = new NewPriceParitySplitsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTimeNs, symbolIndex, symbolSeqNum, orderId, newOrderId, price, volume, prevPriceParitySplits, newPriceParitySplits);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The nanosecond offset from the SourceTime
     *
     * @return the SourceTimeNs field
     */
    public SourceTimeNsField sourceTimeNs() {
        return sourceTimeNs;
    }

    /**
     * The unique ID of this symbol for all products within this market. This ID cannot be used to cross reference a security between markets.
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * Reserved for future use. Ignore any content. This usage will become standard across all products in future releases.
     *
     * @return the SymbolSeqNum field
     */
    public SymbolSeqNumField symbolSeqNum() {
        return symbolSeqNum;
    }

    /**
     * The unique ID assigned by the matching engine to this order . Can be used to match this message to the gateway Order Report.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * The new Order ID of the replacement order
     *
     * @return the NewOrderId field
     */
    public NewOrderIdField newOrderId() {
        return newOrderId;
    }

    /**
     * The order price. Use with the Price Scale from the symbol-mapping index.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The order quantity in shares
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * Resulting number of splits at the previous price Defaulted to 0. Future use by NYSE only.
     *
     * @return the PrevPriceParitySplits field
     */
    public PrevPriceParitySplitsField prevPriceParitySplits() {
        return prevPriceParitySplits;
    }

    /**
     * Resulting number of splits at the new price. Defaulted to 0. Future use by NYSE only.
     *
     * @return the NewPriceParitySplits field
     */
    public NewPriceParitySplitsField newPriceParitySplits() {
        return newPriceParitySplits;
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
        if (!sourceTimeNs.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimeNsField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!symbolSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolSeqNumField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!newOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += NewOrderIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!prevPriceParitySplits.parse(data, cursor)) {
            return false;
        }
        cursor += PrevPriceParitySplitsField.BYTE_LENGTH;
        return newPriceParitySplits.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sourceTimeNs.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = symbolSeqNum.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = newOrderId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = prevPriceParitySplits.encode(data, cursor);
        cursor = newPriceParitySplits.encode(data, cursor);
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
            case "SourceTimeNs" -> Optional.of(sourceTimeNs);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "SymbolSeqNum" -> Optional.of(symbolSeqNum);
            case "OrderId" -> Optional.of(orderId);
            case "NewOrderId" -> Optional.of(newOrderId);
            case "Price" -> Optional.of(price);
            case "Volume" -> Optional.of(volume);
            case "PrevPriceParitySplits" -> Optional.of(prevPriceParitySplits);
            case "NewPriceParitySplits" -> Optional.of(newPriceParitySplits);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ReplaceOrderMessage message)) {
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
        if (!(other instanceof ReplaceOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
