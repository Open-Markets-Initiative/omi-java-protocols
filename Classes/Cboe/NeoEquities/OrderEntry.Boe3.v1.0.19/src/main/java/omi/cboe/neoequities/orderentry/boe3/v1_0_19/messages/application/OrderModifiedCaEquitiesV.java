package omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.AccountField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BrokerIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BrokerLeiField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ClOrdIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.CustomerLeiField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ExpireDateField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ExpireTimeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.LeavesQtyField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.LeiAlgorithmIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.LeiCustomerAccountField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.LeiOrderOriginField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.LeiRoutingArrangementIndicatorField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.MaxFloorField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.OrderIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.OrderQtyField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.OrigClOrdIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.PriceField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SecondaryOrderIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.StopPxField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.TimeInForceField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.TransactionTimeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.TrueMinQtyField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.UmirAccountTypeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.types.Field;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.types.Message;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.types.PrintOptions;

/**
 * Represents the OrderModifiedCaEquitiesV message from the OrderEntry protocol.
 *
 * <p>Order Modified message sent in response to a Modify Order indicating successful modification</p>
 */
public final class OrderModifiedCaEquitiesV implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 242;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Modified Ca Equities V";

    /**
     * Time of the transaction
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Client order identifier
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Identifies the broker
     */
    private final BrokerIdField brokerId = new BrokerIdField();

    /**
     * OrderID supplied by Cboe Canada on the order acknowledgement
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Reflected back on Execution Reports associated with this order
     */
    private final AccountField account = new AccountField();

    /**
     * Time in force for the order
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Portion of OrderQty to display, used for iceberg orders
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * Specifies the date on which a GTD order will expire
     */
    private final ExpireDateField expireDate = new ExpireDateField();

    /**
     * Identify the type of customer sending the order
     */
    private final LeiOrderOriginField leiOrderOrigin = new LeiOrderOriginField();

    /**
     * Routing arrangement is in place
     */
    private final LeiRoutingArrangementIndicatorField leiRoutingArrangementIndicator = new LeiRoutingArrangementIndicatorField();

    /**
     * The capacity for the order
     */
    private final UmirAccountTypeField umirAccountType = new UmirAccountTypeField();

    /**
     * Account number for clients not eligible to obtain an LEI
     */
    private final LeiCustomerAccountField leiCustomerAccount = new LeiCustomerAccountField();

    /**
     * Unique identifier for the end-client orders automatically generated on a predetermined basis
     */
    private final LeiAlgorithmIdField leiAlgorithmId = new LeiAlgorithmIdField();

    /**
     * LEI for clients eligible to obtain an LEI
     */
    private final CustomerLeiField customerLei = new CustomerLeiField();

    /**
     * Non-PO IIROC Dealer Member (Correspondent Broker)
     */
    private final BrokerLeiField brokerLei = new BrokerLeiField();

    /**
     * Number of shares for order
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * ClOrdID of the order being cancelled or replaced
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Quantity of shares still open for further execution
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Limit Price
     */
    private final PriceField price = new PriceField();

    /**
     * The trigger price for Stop and Stop Limit orders
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * All fills must be at least of size TrueMinQty
     */
    private final TrueMinQtyField trueMinQty = new TrueMinQtyField();

    /**
     * Populated on a Self-Trade Prevention triggered cancel/restatement
     */
    private final SecondaryOrderIdField secondaryOrderId = new SecondaryOrderIdField();

    /**
     * Specifies the UTC Date/Time timestamp that the order expires
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, brokerId, orderId, account, timeInForce, maxFloor, expireDate, leiOrderOrigin, leiRoutingArrangementIndicator, umirAccountType, leiCustomerAccount, leiAlgorithmId, customerLei, brokerLei, orderQty, origClOrdId, leavesQty, price, stopPx, trueMinQty, secondaryOrderId, expireTime);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time of the transaction
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Client order identifier
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Identifies the broker
     *
     * @return the BrokerId field
     */
    public BrokerIdField brokerId() {
        return brokerId;
    }

    /**
     * OrderID supplied by Cboe Canada on the order acknowledgement
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Reflected back on Execution Reports associated with this order
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Time in force for the order
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Portion of OrderQty to display, used for iceberg orders
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
    }

    /**
     * Specifies the date on which a GTD order will expire
     *
     * @return the ExpireDate field
     */
    public ExpireDateField expireDate() {
        return expireDate;
    }

    /**
     * Identify the type of customer sending the order
     *
     * @return the LeiOrderOrigin field
     */
    public LeiOrderOriginField leiOrderOrigin() {
        return leiOrderOrigin;
    }

    /**
     * Routing arrangement is in place
     *
     * @return the LeiRoutingArrangementIndicator field
     */
    public LeiRoutingArrangementIndicatorField leiRoutingArrangementIndicator() {
        return leiRoutingArrangementIndicator;
    }

    /**
     * The capacity for the order
     *
     * @return the UmirAccountType field
     */
    public UmirAccountTypeField umirAccountType() {
        return umirAccountType;
    }

    /**
     * Account number for clients not eligible to obtain an LEI
     *
     * @return the LeiCustomerAccount field
     */
    public LeiCustomerAccountField leiCustomerAccount() {
        return leiCustomerAccount;
    }

    /**
     * Unique identifier for the end-client orders automatically generated on a predetermined basis
     *
     * @return the LeiAlgorithmId field
     */
    public LeiAlgorithmIdField leiAlgorithmId() {
        return leiAlgorithmId;
    }

    /**
     * LEI for clients eligible to obtain an LEI
     *
     * @return the CustomerLei field
     */
    public CustomerLeiField customerLei() {
        return customerLei;
    }

    /**
     * Non-PO IIROC Dealer Member (Correspondent Broker)
     *
     * @return the BrokerLei field
     */
    public BrokerLeiField brokerLei() {
        return brokerLei;
    }

    /**
     * Number of shares for order
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * ClOrdID of the order being cancelled or replaced
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * Quantity of shares still open for further execution
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Limit Price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The trigger price for Stop and Stop Limit orders
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * All fills must be at least of size TrueMinQty
     *
     * @return the TrueMinQty field
     */
    public TrueMinQtyField trueMinQty() {
        return trueMinQty;
    }

    /**
     * Populated on a Self-Trade Prevention triggered cancel/restatement
     *
     * @return the SecondaryOrderId field
     */
    public SecondaryOrderIdField secondaryOrderId() {
        return secondaryOrderId;
    }

    /**
     * Specifies the UTC Date/Time timestamp that the order expires
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
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
        return Optional.ofNullable(transactionTime.value());
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
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!brokerId.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!maxFloor.parse(data, cursor)) {
            return false;
        }
        cursor += MaxFloorField.BYTE_LENGTH;
        if (!expireDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireDateField.BYTE_LENGTH;
        if (!leiOrderOrigin.parse(data, cursor)) {
            return false;
        }
        cursor += LeiOrderOriginField.BYTE_LENGTH;
        if (!leiRoutingArrangementIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += LeiRoutingArrangementIndicatorField.BYTE_LENGTH;
        if (!umirAccountType.parse(data, cursor)) {
            return false;
        }
        cursor += UmirAccountTypeField.BYTE_LENGTH;
        if (!leiCustomerAccount.parse(data, cursor)) {
            return false;
        }
        cursor += LeiCustomerAccountField.BYTE_LENGTH;
        if (!leiAlgorithmId.parse(data, cursor)) {
            return false;
        }
        cursor += LeiAlgorithmIdField.BYTE_LENGTH;
        if (!customerLei.parse(data, cursor)) {
            return false;
        }
        cursor += CustomerLeiField.BYTE_LENGTH;
        if (!brokerLei.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerLeiField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
        if (!trueMinQty.parse(data, cursor)) {
            return false;
        }
        cursor += TrueMinQtyField.BYTE_LENGTH;
        if (!secondaryOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryOrderIdField.BYTE_LENGTH;
        return expireTime.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = brokerId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = maxFloor.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
        cursor = leiOrderOrigin.encode(data, cursor);
        cursor = leiRoutingArrangementIndicator.encode(data, cursor);
        cursor = umirAccountType.encode(data, cursor);
        cursor = leiCustomerAccount.encode(data, cursor);
        cursor = leiAlgorithmId.encode(data, cursor);
        cursor = customerLei.encode(data, cursor);
        cursor = brokerLei.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = trueMinQty.encode(data, cursor);
        cursor = secondaryOrderId.encode(data, cursor);
        cursor = expireTime.encode(data, cursor);
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
            case "TransactionTime" -> Optional.of(transactionTime);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "BrokerId" -> Optional.of(brokerId);
            case "OrderId" -> Optional.of(orderId);
            case "Account" -> Optional.of(account);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "ExpireDate" -> Optional.of(expireDate);
            case "LeiOrderOrigin" -> Optional.of(leiOrderOrigin);
            case "LeiRoutingArrangementIndicator" -> Optional.of(leiRoutingArrangementIndicator);
            case "UmirAccountType" -> Optional.of(umirAccountType);
            case "LeiCustomerAccount" -> Optional.of(leiCustomerAccount);
            case "LeiAlgorithmId" -> Optional.of(leiAlgorithmId);
            case "CustomerLei" -> Optional.of(customerLei);
            case "BrokerLei" -> Optional.of(brokerLei);
            case "OrderQty" -> Optional.of(orderQty);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "Price" -> Optional.of(price);
            case "StopPx" -> Optional.of(stopPx);
            case "TrueMinQty" -> Optional.of(trueMinQty);
            case "SecondaryOrderId" -> Optional.of(secondaryOrderId);
            case "ExpireTime" -> Optional.of(expireTime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderModifiedCaEquitiesV message)) {
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
        if (!(other instanceof OrderModifiedCaEquitiesV message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
