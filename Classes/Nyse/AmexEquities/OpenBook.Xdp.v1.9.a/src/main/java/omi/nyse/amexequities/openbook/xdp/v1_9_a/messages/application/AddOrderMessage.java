package omi.nyse.amexequities.openbook.xdp.v1_9_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.amexequities.openbook.xdp.v1_9_a.fields.OrderIdField;
import omi.nyse.amexequities.openbook.xdp.v1_9_a.fields.OrderIdgtcIndicatorField;
import omi.nyse.amexequities.openbook.xdp.v1_9_a.fields.PriceField;
import omi.nyse.amexequities.openbook.xdp.v1_9_a.fields.SideField;
import omi.nyse.amexequities.openbook.xdp.v1_9_a.fields.SourceTimeNsField;
import omi.nyse.amexequities.openbook.xdp.v1_9_a.fields.SymbolIndexField;
import omi.nyse.amexequities.openbook.xdp.v1_9_a.fields.SymbolSeqNumField;
import omi.nyse.amexequities.openbook.xdp.v1_9_a.fields.TradeSessionField;
import omi.nyse.amexequities.openbook.xdp.v1_9_a.fields.VolumeField;
import omi.nyse.amexequities.openbook.xdp.v1_9_a.types.Field;
import omi.nyse.amexequities.openbook.xdp.v1_9_a.types.Message;
import omi.nyse.amexequities.openbook.xdp.v1_9_a.types.PrintOptions;

/**
 * Represents the AddOrderMessage message from the OpenBook protocol.
 *
 * <p>Order Book Add Order message. Size of the message: 31 bytes (NYSE, NYSE MKT and NYSE Arca).</p>
 */
public final class AddOrderMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 27;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Order Message";

    /**
     * This field represents the nanosecond offset from the time reference second in UTC time (EPOCH)
     */
    private final SourceTimeNsField sourceTimeNs = new SourceTimeNsField();

    /**
     * This field identifies the numerical representation of the symbol.
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * This field contains the symbol sequence number
     */
    private final SymbolSeqNumField symbolSeqNum = new SymbolSeqNumField();

    /**
     * The Order ID identifies a unique order.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * This field contains the price point. Use the Price scale from the symbol-mapping index.
     */
    private final PriceField price = new PriceField();

    /**
     * This field contains the order quantity in shares.
     */
    private final VolumeField volume = new VolumeField();

    /**
     * This field indicates the side of the order Buy/Sell.
     */
    private final SideField side = new SideField();

    /**
     * This field specifies if Trade Order ID is a GTC order
     */
    private final OrderIdgtcIndicatorField orderIdgtcIndicator = new OrderIdgtcIndicatorField();

    /**
     * Trading sessions the order is eligible for. For NYSE and NYSE MKT, only 2 is applicable.
     */
    private final TradeSessionField tradeSession = new TradeSessionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTimeNs, symbolIndex, symbolSeqNum, orderId, price, volume, side, orderIdgtcIndicator, tradeSession);

    private byte[] buffer;

    private boolean decoded;

    /**
     * This field represents the nanosecond offset from the time reference second in UTC time (EPOCH)
     *
     * @return the SourceTimeNs field
     */
    public SourceTimeNsField sourceTimeNs() {
        return sourceTimeNs;
    }

    /**
     * This field identifies the numerical representation of the symbol.
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * This field contains the symbol sequence number
     *
     * @return the SymbolSeqNum field
     */
    public SymbolSeqNumField symbolSeqNum() {
        return symbolSeqNum;
    }

    /**
     * The Order ID identifies a unique order.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * This field contains the price point. Use the Price scale from the symbol-mapping index.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * This field contains the order quantity in shares.
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * This field indicates the side of the order Buy/Sell.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * This field specifies if Trade Order ID is a GTC order
     *
     * @return the OrderIdgtcIndicator field
     */
    public OrderIdgtcIndicatorField orderIdgtcIndicator() {
        return orderIdgtcIndicator;
    }

    /**
     * Trading sessions the order is eligible for. For NYSE and NYSE MKT, only 2 is applicable.
     *
     * @return the TradeSession field
     */
    public TradeSessionField tradeSession() {
        return tradeSession;
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
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderIdgtcIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdgtcIndicatorField.BYTE_LENGTH;
        return tradeSession.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sourceTimeNs.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = symbolSeqNum.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderIdgtcIndicator.encode(data, cursor);
        cursor = tradeSession.encode(data, cursor);
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
            case "Price" -> Optional.of(price);
            case "Volume" -> Optional.of(volume);
            case "Side" -> Optional.of(side);
            case "OrderIdgtcIndicator" -> Optional.of(orderIdgtcIndicator);
            case "TradeSession" -> Optional.of(tradeSession);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddOrderMessage message)) {
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
        if (!(other instanceof AddOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
