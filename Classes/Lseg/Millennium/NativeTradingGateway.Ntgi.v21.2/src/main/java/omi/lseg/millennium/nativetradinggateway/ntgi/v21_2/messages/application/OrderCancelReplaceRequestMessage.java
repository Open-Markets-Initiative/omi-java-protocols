package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.AccountField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ClientOrderIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.DisplayQtyField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ExpireDateTimeField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.GroupIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.InstrumentIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.LimitPriceField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.MinimumQuantityField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OffsetField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OrderIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OrderQtyField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OriginalClientOrderIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.PassiveOnlyOrderField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.SideField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.StopPriceField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Field;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Message;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.PrintOptions;

/**
 * Represents the OrderCancelReplaceRequestMessage message from the NativeTradingGateway protocol.
 *
 * <p>Allows the client to cancel or replace a live order.</p>
 */
public final class OrderCancelReplaceRequestMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'G';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 112;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Cancel Replace Request Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 57, 1, 88, 1, 103, 5 };

    /**
     * Client specified identifier of the rejected message if it is available.
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * Client Order ID of the order being amended.
     */
    private final OriginalClientOrderIdField originalClientOrderId = new OriginalClientOrderIdField();

    /**
     * Unique identifier of the order assigned by the matching system.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Identifier of the instrument for which the order is submitted.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Specified by the user as order submission.
     */
    private final GroupIdField groupId = new GroupIdField();

    /**
     * This field will indicate the date or the time the order expires on.
     */
    private final ExpireDateTimeField expireDateTime = new ExpireDateTimeField();

    /**
     * Total order quantity.
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Maximum quantity that may be displayed.
     */
    private final DisplayQtyField displayQty = new DisplayQtyField();

    /**
     * Limit Price.
     */
    private final LimitPriceField limitPrice = new LimitPriceField();

    /**
     * Optional reference of the investor the order is submitted for
     */
    private final AccountField account = new AccountField();

    /**
     * Side of the order.
     */
    private final SideField side = new SideField();

    /**
     * Stop price.
     */
    private final StopPriceField stopPrice = new StopPriceField();

    /**
     * Order level parameter to allow clients to specify that they would like their order to rest prior to execution, with flexibility for visible orders to rest at a specified price level on the book.
     */
    private final PassiveOnlyOrderField passiveOnlyOrder = new PassiveOnlyOrderField();

    /**
     * Offset to the Dynamic Reference Price (in basis points) for ATC TIF orders.
     */
    private final OffsetField offsetField = new OffsetField();

    /**
     * Minimum Execution Size (MES) of an order.
     */
    private final MinimumQuantityField minimumQuantity = new MinimumQuantityField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clientOrderId, originalClientOrderId, orderId, instrumentId, groupId, expireDateTime, orderQty, displayQty, limitPrice, account, side, stopPrice, passiveOnlyOrder, offsetField, minimumQuantity);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Client specified identifier of the rejected message if it is available.
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * Client Order ID of the order being amended.
     *
     * @return the OriginalClientOrderId field
     */
    public OriginalClientOrderIdField originalClientOrderId() {
        return originalClientOrderId;
    }

    /**
     * Unique identifier of the order assigned by the matching system.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Identifier of the instrument for which the order is submitted.
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Specified by the user as order submission.
     *
     * @return the GroupId field
     */
    public GroupIdField groupId() {
        return groupId;
    }

    /**
     * This field will indicate the date or the time the order expires on.
     *
     * @return the ExpireDateTime field
     */
    public ExpireDateTimeField expireDateTime() {
        return expireDateTime;
    }

    /**
     * Total order quantity.
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Maximum quantity that may be displayed.
     *
     * @return the DisplayQty field
     */
    public DisplayQtyField displayQty() {
        return displayQty;
    }

    /**
     * Limit Price.
     *
     * @return the LimitPrice field
     */
    public LimitPriceField limitPrice() {
        return limitPrice;
    }

    /**
     * Optional reference of the investor the order is submitted for
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Side of the order.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Stop price.
     *
     * @return the StopPrice field
     */
    public StopPriceField stopPrice() {
        return stopPrice;
    }

    /**
     * Order level parameter to allow clients to specify that they would like their order to rest prior to execution, with flexibility for visible orders to rest at a specified price level on the book.
     *
     * @return the PassiveOnlyOrder field
     */
    public PassiveOnlyOrderField passiveOnlyOrder() {
        return passiveOnlyOrder;
    }

    /**
     * Offset to the Dynamic Reference Price (in basis points) for ATC TIF orders.
     *
     * @return the Offset field
     */
    public OffsetField offsetField() {
        return offsetField;
    }

    /**
     * Minimum Execution Size (MES) of an order.
     *
     * @return the MinimumQuantity field
     */
    public MinimumQuantityField minimumQuantity() {
        return minimumQuantity;
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
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!originalClientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalClientOrderIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!groupId.parse(data, cursor)) {
            return false;
        }
        cursor += GroupIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!expireDateTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireDateTimeField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!displayQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayQtyField.BYTE_LENGTH;
        if (!limitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LimitPriceField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!stopPrice.parse(data, cursor)) {
            return false;
        }
        cursor += StopPriceField.BYTE_LENGTH;
        if (!passiveOnlyOrder.parse(data, cursor)) {
            return false;
        }
        cursor += PassiveOnlyOrderField.BYTE_LENGTH;
        if (!offsetField.parse(data, cursor)) {
            return false;
        }
        cursor += OffsetField.BYTE_LENGTH;
        cursor += 5; // padding
        return minimumQuantity.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clientOrderId.encode(data, cursor);
        cursor = originalClientOrderId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = groupId.encode(data, cursor);
        if (buffer != null && buffer.length >= 58) {
            System.arraycopy(buffer, 57, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = expireDateTime.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = displayQty.encode(data, cursor);
        cursor = limitPrice.encode(data, cursor);
        cursor = account.encode(data, cursor);
        if (buffer != null && buffer.length >= 89) {
            System.arraycopy(buffer, 88, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = side.encode(data, cursor);
        cursor = stopPrice.encode(data, cursor);
        cursor = passiveOnlyOrder.encode(data, cursor);
        cursor = offsetField.encode(data, cursor);
        if (buffer != null && buffer.length >= 108) {
            System.arraycopy(buffer, 103, data, cursor, 5); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 5, (byte) 0); // padding
        }
        cursor += 5;
        cursor = minimumQuantity.encode(data, cursor);
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
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "OriginalClientOrderId" -> Optional.of(originalClientOrderId);
            case "OrderId" -> Optional.of(orderId);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "GroupId" -> Optional.of(groupId);
            case "ExpireDateTime" -> Optional.of(expireDateTime);
            case "OrderQty" -> Optional.of(orderQty);
            case "DisplayQty" -> Optional.of(displayQty);
            case "LimitPrice" -> Optional.of(limitPrice);
            case "Account" -> Optional.of(account);
            case "Side" -> Optional.of(side);
            case "StopPrice" -> Optional.of(stopPrice);
            case "PassiveOnlyOrder" -> Optional.of(passiveOnlyOrder);
            case "Offset" -> Optional.of(offsetField);
            case "MinimumQuantity" -> Optional.of(minimumQuantity);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderCancelReplaceRequestMessage message)) {
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
        if (!(other instanceof OrderCancelReplaceRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
