package omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.fields.ExchangeOrderTypeField;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.fields.LotTypeField;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.fields.NanosecondsField;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.fields.OrderBookIdField;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.fields.OrderBookPositionField;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.fields.OrderIdField;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.fields.ParticipantIdField;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.fields.PriceField;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.fields.QuantityField;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.fields.SideField;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.types.Field;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.types.Message;
import omi.nasdaq.nordicderivatives.depthofbook.glimpse.v2_22_4.types.PrintOptions;

/**
 * Represents the AddOrderMpidAttribution message from the DepthOfBook protocol.
 *
 * <p>Add Order Message. Indicates that a new order has been accepted by the Genium INET Trading system and was added to the displayable book. Generated for attributed orders and quotations</p>
 */
public final class AddOrderMpidAttribution implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'F';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 43;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Order Mpid Attribution";

    /**
     * Timestamp - Nanoseconds. Nanoseconds portion of the timestamp
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * The identifier assigned to the new order. NOTE: The number is only unique per Order book and side
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Denotes the primary identifier of an order book. NOTE: Expired Order book IDs may be reused for new instruments
     */
    private final OrderBookIdField orderBookId = new OrderBookIdField();

    /**
     * The type of order. Values: B = buy order, S = sell order
     */
    private final SideField side = new SideField();

    /**
     * Rank within order book. See Appendix A, How to Build an Order Book View
     */
    private final OrderBookPositionField orderBookPosition = new OrderBookPositionField();

    /**
     * The visible quantity of the order. NOTE: Orders with an undisclosed quantity will have this field set to 0
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * The display price of the new order. See Data Types for field processing notes
     */
    private final PriceField price = new PriceField();

    /**
     * Additional order attributes. Applicable types may be defined by the marketplace. The field is a bit map, multiple values may be set simultaneously; 0 = Not applicable
     */
    private final ExchangeOrderTypeField exchangeOrderType = new ExchangeOrderTypeField();

    /**
     * Lot Type. Values: 0 = Undefined, 1 = Odd Lot, 2 = Round Lot, 3 = Block Lot, 4 = All or None Lot
     */
    private final LotTypeField lotType = new LotTypeField();

    /**
     * Market participant identifier associated with the entered order
     */
    private final ParticipantIdField participantId = new ParticipantIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, orderId, orderBookId, side, orderBookPosition, quantity, price, exchangeOrderType, lotType, participantId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Timestamp - Nanoseconds. Nanoseconds portion of the timestamp
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * The identifier assigned to the new order. NOTE: The number is only unique per Order book and side
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Denotes the primary identifier of an order book. NOTE: Expired Order book IDs may be reused for new instruments
     *
     * @return the OrderBookId field
     */
    public OrderBookIdField orderBookId() {
        return orderBookId;
    }

    /**
     * The type of order. Values: B = buy order, S = sell order
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Rank within order book. See Appendix A, How to Build an Order Book View
     *
     * @return the OrderBookPosition field
     */
    public OrderBookPositionField orderBookPosition() {
        return orderBookPosition;
    }

    /**
     * The visible quantity of the order. NOTE: Orders with an undisclosed quantity will have this field set to 0
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * The display price of the new order. See Data Types for field processing notes
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Additional order attributes. Applicable types may be defined by the marketplace. The field is a bit map, multiple values may be set simultaneously; 0 = Not applicable
     *
     * @return the ExchangeOrderType field
     */
    public ExchangeOrderTypeField exchangeOrderType() {
        return exchangeOrderType;
    }

    /**
     * Lot Type. Values: 0 = Undefined, 1 = Odd Lot, 2 = Round Lot, 3 = Block Lot, 4 = All or None Lot
     *
     * @return the LotType field
     */
    public LotTypeField lotType() {
        return lotType;
    }

    /**
     * Market participant identifier associated with the entered order
     *
     * @return the ParticipantId field
     */
    public ParticipantIdField participantId() {
        return participantId;
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!orderBookId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderBookPosition.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookPositionField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!exchangeOrderType.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeOrderTypeField.BYTE_LENGTH;
        if (!lotType.parse(data, cursor)) {
            return false;
        }
        cursor += LotTypeField.BYTE_LENGTH;
        return participantId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = orderBookId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderBookPosition.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = exchangeOrderType.encode(data, cursor);
        cursor = lotType.encode(data, cursor);
        cursor = participantId.encode(data, cursor);
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "OrderId" -> Optional.of(orderId);
            case "OrderBookId" -> Optional.of(orderBookId);
            case "Side" -> Optional.of(side);
            case "OrderBookPosition" -> Optional.of(orderBookPosition);
            case "Quantity" -> Optional.of(quantity);
            case "Price" -> Optional.of(price);
            case "ExchangeOrderType" -> Optional.of(exchangeOrderType);
            case "LotType" -> Optional.of(lotType);
            case "ParticipantId" -> Optional.of(participantId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddOrderMpidAttribution message)) {
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
        if (!(other instanceof AddOrderMpidAttribution message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
