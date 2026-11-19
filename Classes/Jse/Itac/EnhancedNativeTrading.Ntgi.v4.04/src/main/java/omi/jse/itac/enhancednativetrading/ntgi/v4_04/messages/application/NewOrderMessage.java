package omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.AccountField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.AnonymityField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.CancelOnDisconnectField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.CapacityField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.ClientOrderIdField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.DisplayQuantityField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.ExpireTimeField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.LimitPriceField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.MinimumQuantityField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.OrderBookField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.OrderQuantityField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.OrderTypeField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.SecondaryTradeReportIdField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.SecurityIdField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.SideField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.StopPriceField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.TimeInForceField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.TraderMnemonicField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.TrailingOffsetField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.types.Field;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.types.Message;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.types.PrintOptions;

/**
 * Represents the NewOrderMessage message from the EnhancedNativeTrading protocol.
 *
 * <p>Allows the client to submit a new order.</p>
 */
public final class NewOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'D';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 121;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Message";

    /**
     * Client specified identifier of the rejected message if it is available
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * Numeric Identifier of the instrument for which the order is submitted
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Concatenated identifier of the Trader Group and the JSE Trader ID
     */
    private final TraderMnemonicField traderMnemonic = new TraderMnemonicField();

    /**
     * Client Account information
     */
    private final AccountField account = new AccountField();

    /**
     * Type of the order
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * How long the order remains in effect
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Date and time the order expires on
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Side of the order
     */
    private final SideField side = new SideField();

    /**
     * Total order quantity
     */
    private final OrderQuantityField orderQuantity = new OrderQuantityField();

    /**
     * Maximum quantity that may be displayed
     */
    private final DisplayQuantityField displayQuantity = new DisplayQuantityField();

    /**
     * Minimum Execution Size that needs to be specified for a Hidden Limit Order
     */
    private final MinimumQuantityField minimumQuantity = new MinimumQuantityField();

    /**
     * Limit price
     */
    private final LimitPriceField limitPrice = new LimitPriceField();

    /**
     * Stop price or Trigger Price
     */
    private final StopPriceField stopPrice = new StopPriceField();

    /**
     * Capacity in which the order is submitted
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Whether the order is cancelled on disconnect
     */
    private final CancelOnDisconnectField cancelOnDisconnect = new CancelOnDisconnectField();

    /**
     * Order book the order belongs to
     */
    private final OrderBookField orderBook = new OrderBookField();

    /**
     * Whether the order is anonymous or named
     */
    private final AnonymityField anonymity = new AnonymityField();

    /**
     * Trailing offset for trailing stop or stop limit orders
     */
    private final TrailingOffsetField trailingOffset = new TrailingOffsetField();

    /**
     * Additional order identifier used to submit special instructions to the clearing members
     */
    private final SecondaryTradeReportIdField secondaryTradeReportId = new SecondaryTradeReportIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clientOrderId, securityId, traderMnemonic, account, orderType, timeInForce, expireTime, side, orderQuantity, displayQuantity, minimumQuantity, limitPrice, stopPrice, capacity, cancelOnDisconnect, orderBook, anonymity, trailingOffset, secondaryTradeReportId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Client specified identifier of the rejected message if it is available
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * Numeric Identifier of the instrument for which the order is submitted
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Concatenated identifier of the Trader Group and the JSE Trader ID
     *
     * @return the TraderMnemonic field
     */
    public TraderMnemonicField traderMnemonic() {
        return traderMnemonic;
    }

    /**
     * Client Account information
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Type of the order
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * How long the order remains in effect
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Date and time the order expires on
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
    }

    /**
     * Side of the order
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Total order quantity
     *
     * @return the OrderQuantity field
     */
    public OrderQuantityField orderQuantity() {
        return orderQuantity;
    }

    /**
     * Maximum quantity that may be displayed
     *
     * @return the DisplayQuantity field
     */
    public DisplayQuantityField displayQuantity() {
        return displayQuantity;
    }

    /**
     * Minimum Execution Size that needs to be specified for a Hidden Limit Order
     *
     * @return the MinimumQuantity field
     */
    public MinimumQuantityField minimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Limit price
     *
     * @return the LimitPrice field
     */
    public LimitPriceField limitPrice() {
        return limitPrice;
    }

    /**
     * Stop price or Trigger Price
     *
     * @return the StopPrice field
     */
    public StopPriceField stopPrice() {
        return stopPrice;
    }

    /**
     * Capacity in which the order is submitted
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Whether the order is cancelled on disconnect
     *
     * @return the CancelOnDisconnect field
     */
    public CancelOnDisconnectField cancelOnDisconnect() {
        return cancelOnDisconnect;
    }

    /**
     * Order book the order belongs to
     *
     * @return the OrderBook field
     */
    public OrderBookField orderBook() {
        return orderBook;
    }

    /**
     * Whether the order is anonymous or named
     *
     * @return the Anonymity field
     */
    public AnonymityField anonymity() {
        return anonymity;
    }

    /**
     * Trailing offset for trailing stop or stop limit orders
     *
     * @return the TrailingOffset field
     */
    public TrailingOffsetField trailingOffset() {
        return trailingOffset;
    }

    /**
     * Additional order identifier used to submit special instructions to the clearing members
     *
     * @return the SecondaryTradeReportId field
     */
    public SecondaryTradeReportIdField secondaryTradeReportId() {
        return secondaryTradeReportId;
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
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!traderMnemonic.parse(data, cursor)) {
            return false;
        }
        cursor += TraderMnemonicField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!expireTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireTimeField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQuantityField.BYTE_LENGTH;
        if (!displayQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayQuantityField.BYTE_LENGTH;
        if (!minimumQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumQuantityField.BYTE_LENGTH;
        if (!limitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LimitPriceField.BYTE_LENGTH;
        if (!stopPrice.parse(data, cursor)) {
            return false;
        }
        cursor += StopPriceField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!cancelOnDisconnect.parse(data, cursor)) {
            return false;
        }
        cursor += CancelOnDisconnectField.BYTE_LENGTH;
        if (!orderBook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookField.BYTE_LENGTH;
        if (!anonymity.parse(data, cursor)) {
            return false;
        }
        cursor += AnonymityField.BYTE_LENGTH;
        if (!trailingOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TrailingOffsetField.BYTE_LENGTH;
        return secondaryTradeReportId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clientOrderId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = traderMnemonic.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = expireTime.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderQuantity.encode(data, cursor);
        cursor = displayQuantity.encode(data, cursor);
        cursor = minimumQuantity.encode(data, cursor);
        cursor = limitPrice.encode(data, cursor);
        cursor = stopPrice.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = cancelOnDisconnect.encode(data, cursor);
        cursor = orderBook.encode(data, cursor);
        cursor = anonymity.encode(data, cursor);
        cursor = trailingOffset.encode(data, cursor);
        cursor = secondaryTradeReportId.encode(data, cursor);
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
            case "SecurityId" -> Optional.of(securityId);
            case "TraderMnemonic" -> Optional.of(traderMnemonic);
            case "Account" -> Optional.of(account);
            case "OrderType" -> Optional.of(orderType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "ExpireTime" -> Optional.of(expireTime);
            case "Side" -> Optional.of(side);
            case "OrderQuantity" -> Optional.of(orderQuantity);
            case "DisplayQuantity" -> Optional.of(displayQuantity);
            case "MinimumQuantity" -> Optional.of(minimumQuantity);
            case "LimitPrice" -> Optional.of(limitPrice);
            case "StopPrice" -> Optional.of(stopPrice);
            case "Capacity" -> Optional.of(capacity);
            case "CancelOnDisconnect" -> Optional.of(cancelOnDisconnect);
            case "OrderBook" -> Optional.of(orderBook);
            case "Anonymity" -> Optional.of(anonymity);
            case "TrailingOffset" -> Optional.of(trailingOffset);
            case "SecondaryTradeReportId" -> Optional.of(secondaryTradeReportId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderMessage message)) {
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
        if (!(other instanceof NewOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
