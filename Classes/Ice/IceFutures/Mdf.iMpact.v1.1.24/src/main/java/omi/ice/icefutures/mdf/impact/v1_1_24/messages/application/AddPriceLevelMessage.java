package omi.ice.icefutures.mdf.impact.v1_1_24.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.ImpliedOrderCountField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.ImpliedQuantityField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.MarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OrderCountField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.PriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.PriceLevelPositionField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.QuantityField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.SideField;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Message;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.PrintOptions;

/**
 * Represents the AddPriceLevelMessage message from the Mdf protocol.
 *
 * <p>Upon receipt of this message, client should add/insert a price level at the specified position in the book for the given market, and push down the price levels that were previously at or below that position.</p>
 */
public final class AddPriceLevelMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 't';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 26;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Price Level Message";

    /**
     * Market Id
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * 1 = Bid, 2 = Offer
     */
    private final SideField side = new SideField();

    /**
     * Position of the price level
     */
    private final PriceLevelPositionField priceLevelPosition = new PriceLevelPositionField();

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     */
    private final PriceField price = new PriceField();

    /**
     * Quantity
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Number of all orders at the price level
     */
    private final OrderCountField orderCount = new OrderCountField();

    /**
     * Quantity that were implied
     */
    private final ImpliedQuantityField impliedQuantity = new ImpliedQuantityField();

    /**
     * Number of implied orders at the price level
     */
    private final ImpliedOrderCountField impliedOrderCount = new ImpliedOrderCountField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketId, side, priceLevelPosition, price, quantity, orderCount, impliedQuantity, impliedOrderCount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Market Id
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * 1 = Bid, 2 = Offer
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Position of the price level
     *
     * @return the PriceLevelPosition field
     */
    public PriceLevelPositionField priceLevelPosition() {
        return priceLevelPosition;
    }

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Quantity
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Number of all orders at the price level
     *
     * @return the OrderCount field
     */
    public OrderCountField orderCount() {
        return orderCount;
    }

    /**
     * Quantity that were implied
     *
     * @return the ImpliedQuantity field
     */
    public ImpliedQuantityField impliedQuantity() {
        return impliedQuantity;
    }

    /**
     * Number of implied orders at the price level
     *
     * @return the ImpliedOrderCount field
     */
    public ImpliedOrderCountField impliedOrderCount() {
        return impliedOrderCount;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!priceLevelPosition.parse(data, cursor)) {
            return false;
        }
        cursor += PriceLevelPositionField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!orderCount.parse(data, cursor)) {
            return false;
        }
        cursor += OrderCountField.BYTE_LENGTH;
        if (!impliedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ImpliedQuantityField.BYTE_LENGTH;
        return impliedOrderCount.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = marketId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = priceLevelPosition.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = orderCount.encode(data, cursor);
        cursor = impliedQuantity.encode(data, cursor);
        cursor = impliedOrderCount.encode(data, cursor);
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
            case "MarketId" -> Optional.of(marketId);
            case "Side" -> Optional.of(side);
            case "PriceLevelPosition" -> Optional.of(priceLevelPosition);
            case "Price" -> Optional.of(price);
            case "Quantity" -> Optional.of(quantity);
            case "OrderCount" -> Optional.of(orderCount);
            case "ImpliedQuantity" -> Optional.of(impliedQuantity);
            case "ImpliedOrderCount" -> Optional.of(impliedOrderCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddPriceLevelMessage message)) {
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
        if (!(other instanceof AddPriceLevelMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
