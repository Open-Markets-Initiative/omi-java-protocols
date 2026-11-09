package omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.OrderPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.AuctionIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.OrderIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.OrderQuantityField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.OrderSideField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.OrderTypeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.PreviousOrderIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.StrategySymbolField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * Represents the StrategyInitialAndImprovementOrderMessage message from the SolaMulticast protocol.
 *
 * <p>Strategy initial and improvement order</p>
 */
public final class StrategyInitialAndImprovementOrderMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 71;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Strategy Initial And Improvement Order Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Exchange on which the trade occurred
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Identification of the strategy. The legs (underlying) are defined in message type NS
     */
    private final StrategySymbolField strategySymbol = new StrategySymbolField();

    /**
     * Identifier of an auction
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Indicates the side of the initial order
     */
    private final OrderSideField orderSide = new OrderSideField();

    /**
     * Indicates the quantity of an improvement order
     */
    private final OrderQuantityField orderQuantity = new OrderQuantityField();

    /**
     * Order Type
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * Allocated by the trading engine at each valid order entry
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Order Id of the order modified
     */
    private final PreviousOrderIdField previousOrderId = new PreviousOrderIdField();

    /**
     * Branch
     */
    private final OrderPriceFractionPair orderPriceFractionPair = new OrderPriceFractionPair();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, strategySymbol, auctionId, orderSide, orderQuantity, orderType, orderId, previousOrderId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange on which the trade occurred
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Identification of the strategy. The legs (underlying) are defined in message type NS
     *
     * @return the StrategySymbol field
     */
    public StrategySymbolField strategySymbol() {
        return strategySymbol;
    }

    /**
     * Identifier of an auction
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * Indicates the side of the initial order
     *
     * @return the OrderSide field
     */
    public OrderSideField orderSide() {
        return orderSide;
    }

    /**
     * Indicates the quantity of an improvement order
     *
     * @return the OrderQuantity field
     */
    public OrderQuantityField orderQuantity() {
        return orderQuantity;
    }

    /**
     * Order Type
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * Allocated by the trading engine at each valid order entry
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Order Id of the order modified
     *
     * @return the PreviousOrderId field
     */
    public PreviousOrderIdField previousOrderId() {
        return previousOrderId;
    }

    /**
     * Branch
     *
     * @return the OrderPriceFractionPair record
     */
    public OrderPriceFractionPair orderPriceFractionPair() {
        return orderPriceFractionPair;
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
        return PADDING.clone();
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!strategySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += StrategySymbolField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!orderSide.parse(data, cursor)) {
            return false;
        }
        cursor += OrderSideField.BYTE_LENGTH;
        if (!orderQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQuantityField.BYTE_LENGTH;
        if (!orderPriceFractionPair.parseFrom(data, cursor, end - 17)) {
            return false;
        }
        cursor += orderPriceFractionPair.byteLength();
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!previousOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousOrderIdField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = strategySymbol.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = orderSide.encode(data, cursor);
        cursor = orderQuantity.encode(data, cursor);
        cursor = orderPriceFractionPair.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = previousOrderId.encode(data, cursor);
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
        orderPriceFractionPair.clear();
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
        if (!orderPriceFractionPair.isRecognized()) {
            return false;
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
        if (!orderPriceFractionPair.isValid()) {
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
            case "ExchangeId" -> Optional.of(exchangeId);
            case "StrategySymbol" -> Optional.of(strategySymbol);
            case "AuctionId" -> Optional.of(auctionId);
            case "OrderSide" -> Optional.of(orderSide);
            case "OrderQuantity" -> Optional.of(orderQuantity);
            case "OrderType" -> Optional.of(orderType);
            case "OrderId" -> Optional.of(orderId);
            case "PreviousOrderId" -> Optional.of(previousOrderId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StrategyInitialAndImprovementOrderMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(orderPriceFractionPair.diffFields(message.orderPriceFractionPair));
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
            builder.append(", ");
            orderPriceFractionPair.toFormattedString(builder, options);
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
        orderPriceFractionPair.toFormattedString(builder, nested);
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
        if (!(other instanceof StrategyInitialAndImprovementOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && orderPriceFractionPair.equals(message.orderPriceFractionPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, orderPriceFractionPair);
    }
}
