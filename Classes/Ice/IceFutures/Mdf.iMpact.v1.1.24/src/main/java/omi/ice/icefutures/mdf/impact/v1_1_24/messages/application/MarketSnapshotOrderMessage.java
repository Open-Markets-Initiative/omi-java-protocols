package omi.ice.icefutures.mdf.impact.v1_1_24.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.IsImpliedField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.IsRfqField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.MarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OrderEntryDateTimeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OrderIdField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OrderSequenceIdField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.PriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.QuantityField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.SequenceWithinMillisField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.SideField;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Message;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.PrintOptions;

/**
 * Represents the MarketSnapshotOrderMessage message from the Mdf protocol.
 *
 * <p>This message is for orders in snapshot only. It is different from the order message for incremental updates.</p>
 */
public final class MarketSnapshotOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'D';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 41;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Market Snapshot Order Message";

    /**
     * Market Id
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * Unique per market
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Sequence ID of the order. When an order is modified, this will be incremented while OrderID remains the same. It is for legacy reason and can be ignored.
     */
    private final OrderSequenceIdField orderSequenceId = new OrderSequenceIdField();

    /**
     * 1 = Bid, 2 = Offer
     */
    private final SideField side = new SideField();

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     */
    private final PriceField price = new PriceField();

    /**
     * Quantity
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Indicate if this is an implied order or not
     */
    private final IsImpliedField isImplied = new IsImpliedField();

    /**
     * Indicate whether it is just an RFQ or not. Client should filter the order if it doesn’t care about RFQ.
     */
    private final IsRfqField isRfq = new IsRfqField();

    /**
     * Order entry date time
     */
    private final OrderEntryDateTimeField orderEntryDateTime = new OrderEntryDateTimeField();

    /**
     * Can be used in conjunction with TransactDateTime field for sequence of deals within same milliseconds time.
     */
    private final SequenceWithinMillisField sequenceWithinMillis = new SequenceWithinMillisField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketId, orderId, orderSequenceId, side, price, quantity, isImplied, isRfq, orderEntryDateTime, sequenceWithinMillis);

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
     * Unique per market
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Sequence ID of the order. When an order is modified, this will be incremented while OrderID remains the same. It is for legacy reason and can be ignored.
     *
     * @return the OrderSequenceId field
     */
    public OrderSequenceIdField orderSequenceId() {
        return orderSequenceId;
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
     * Indicate if this is an implied order or not
     *
     * @return the IsImplied field
     */
    public IsImpliedField isImplied() {
        return isImplied;
    }

    /**
     * Indicate whether it is just an RFQ or not. Client should filter the order if it doesn’t care about RFQ.
     *
     * @return the IsRfq field
     */
    public IsRfqField isRfq() {
        return isRfq;
    }

    /**
     * Order entry date time
     *
     * @return the OrderEntryDateTime field
     */
    public OrderEntryDateTimeField orderEntryDateTime() {
        return orderEntryDateTime;
    }

    /**
     * Can be used in conjunction with TransactDateTime field for sequence of deals within same milliseconds time.
     *
     * @return the SequenceWithinMillis field
     */
    public SequenceWithinMillisField sequenceWithinMillis() {
        return sequenceWithinMillis;
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
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!orderSequenceId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderSequenceIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!isImplied.parse(data, cursor)) {
            return false;
        }
        cursor += IsImpliedField.BYTE_LENGTH;
        if (!isRfq.parse(data, cursor)) {
            return false;
        }
        cursor += IsRfqField.BYTE_LENGTH;
        if (!orderEntryDateTime.parse(data, cursor)) {
            return false;
        }
        cursor += OrderEntryDateTimeField.BYTE_LENGTH;
        return sequenceWithinMillis.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = marketId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = orderSequenceId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = isImplied.encode(data, cursor);
        cursor = isRfq.encode(data, cursor);
        cursor = orderEntryDateTime.encode(data, cursor);
        cursor = sequenceWithinMillis.encode(data, cursor);
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
            case "OrderId" -> Optional.of(orderId);
            case "OrderSequenceId" -> Optional.of(orderSequenceId);
            case "Side" -> Optional.of(side);
            case "Price" -> Optional.of(price);
            case "Quantity" -> Optional.of(quantity);
            case "IsImplied" -> Optional.of(isImplied);
            case "IsRfq" -> Optional.of(isRfq);
            case "OrderEntryDateTime" -> Optional.of(orderEntryDateTime);
            case "SequenceWithinMillis" -> Optional.of(sequenceWithinMillis);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MarketSnapshotOrderMessage message)) {
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
        if (!(other instanceof MarketSnapshotOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
