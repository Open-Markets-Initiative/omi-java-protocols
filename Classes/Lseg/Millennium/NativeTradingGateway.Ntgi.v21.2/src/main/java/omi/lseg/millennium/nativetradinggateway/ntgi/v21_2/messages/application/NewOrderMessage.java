package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.AccountField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.AnonymityField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.AutoCancelField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.CapacityField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ClearingAccountField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ClientIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ClientOrderIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.DisplayQtyField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ExecutingTraderField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ExpireDateTimeField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.GroupIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.InstrumentIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.InvestmentDecisionMakerField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.LimitPriceField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.MiFidFlagsField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.MinimumQuantityField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.NewOrderOrderSubTypeField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.NewOrderPeggedExecInstField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OffsetField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OrderQtyField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OrderTypeField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OwnerTypeField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.PartyRoleQualifiersField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.PassiveOnlyOrderField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.SideField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.StopPriceField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.TifField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.TraderIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Field;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Message;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.PrintOptions;

/**
 * Represents the NewOrderMessage message from the NativeTradingGateway protocol.
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
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 107, 14 };

    /**
     * Client specified identifier of the rejected message if it is available.
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * Optional Trader ID that clients may submit
     */
    private final TraderIdField traderId = new TraderIdField();

    /**
     * Optional reference of the investor the order is submitted for
     */
    private final AccountField account = new AccountField();

    /**
     * Clearing Account Type.
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Identifier of the instrument for which the order is submitted.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Flags identifying Dea involvement, Algo and liquidity provision activity
     */
    private final MiFidFlagsField miFidFlags = new MiFidFlagsField();

    /**
     * Further qualification for the Client Id, Investment Decision Maker and Executing Trader identifiers
     */
    private final PartyRoleQualifiersField partyRoleQualifiers = new PartyRoleQualifiersField();

    /**
     * Type of order.
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * Time qualifier of the order.
     */
    private final TifField tif = new TifField();

    /**
     * This field will indicate the date or the time the order expires on.
     */
    private final ExpireDateTimeField expireDateTime = new ExpireDateTimeField();

    /**
     * Side of the order.
     */
    private final SideField side = new SideField();

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
     * Capacity of the order.
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Cancel orders on logout/disconnection of session
     */
    private final AutoCancelField autoCancel = new AutoCancelField();

    /**
     * Whether the order is a pegged order.
     */
    private final NewOrderOrderSubTypeField newOrderOrderSubType = new NewOrderOrderSubTypeField();

    /**
     * Whether the order is a named or anonymous order
     */
    private final AnonymityField anonymity = new AnonymityField();

    /**
     * Stop price.
     */
    private final StopPriceField stopPrice = new StopPriceField();

    /**
     * Order level parameter to allow clients to specify that they would like their order to rest prior to execution, with flexibility for visible orders to rest at a specified price level on the book.
     */
    private final PassiveOnlyOrderField passiveOnlyOrder = new PassiveOnlyOrderField();

    /**
     * Identifier of the client.
     */
    private final ClientIdField clientId = new ClientIdField();

    /**
     * Identifier of the trading member/participant who made investment decision.
     */
    private final InvestmentDecisionMakerField investmentDecisionMaker = new InvestmentDecisionMakerField();

    /**
     * Specified by the user as order submission.
     */
    private final GroupIdField groupId = new GroupIdField();

    /**
     * Minimum Execution Size (MES) of an order.
     */
    private final MinimumQuantityField minimumQuantity = new MinimumQuantityField();

    /**
     * Identifier of the trading member/participant who made the execution decision.
     */
    private final ExecutingTraderField executingTrader = new ExecutingTraderField();

    /**
     * Offset to the Dynamic Reference Price (in basis points) for ATC TIF orders.
     */
    private final OffsetField offsetField = new OffsetField();

    /**
     * The instruction for permissioning to trade against mid-priced pegged orders.
     */
    private final NewOrderPeggedExecInstField newOrderPeggedExecInst = new NewOrderPeggedExecInstField();

    /**
     * Optional identification (non-public).
     */
    private final OwnerTypeField ownerType = new OwnerTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clientOrderId, traderId, account, clearingAccount, instrumentId, miFidFlags, partyRoleQualifiers, orderType, tif, expireDateTime, side, orderQty, displayQty, limitPrice, capacity, autoCancel, newOrderOrderSubType, anonymity, stopPrice, passiveOnlyOrder, clientId, investmentDecisionMaker, groupId, minimumQuantity, executingTrader, offsetField, newOrderPeggedExecInst, ownerType);

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
     * Optional Trader ID that clients may submit
     *
     * @return the TraderId field
     */
    public TraderIdField traderId() {
        return traderId;
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
     * Clearing Account Type.
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
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
     * Flags identifying Dea involvement, Algo and liquidity provision activity
     *
     * @return the MiFidFlags field
     */
    public MiFidFlagsField miFidFlags() {
        return miFidFlags;
    }

    /**
     * Further qualification for the Client Id, Investment Decision Maker and Executing Trader identifiers
     *
     * @return the PartyRoleQualifiers field
     */
    public PartyRoleQualifiersField partyRoleQualifiers() {
        return partyRoleQualifiers;
    }

    /**
     * Type of order.
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * Time qualifier of the order.
     *
     * @return the Tif field
     */
    public TifField tif() {
        return tif;
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
     * Side of the order.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
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
     * Capacity of the order.
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Cancel orders on logout/disconnection of session
     *
     * @return the AutoCancel field
     */
    public AutoCancelField autoCancel() {
        return autoCancel;
    }

    /**
     * Whether the order is a pegged order.
     *
     * @return the NewOrderOrderSubType field
     */
    public NewOrderOrderSubTypeField newOrderOrderSubType() {
        return newOrderOrderSubType;
    }

    /**
     * Whether the order is a named or anonymous order
     *
     * @return the Anonymity field
     */
    public AnonymityField anonymity() {
        return anonymity;
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
     * Identifier of the client.
     *
     * @return the ClientId field
     */
    public ClientIdField clientId() {
        return clientId;
    }

    /**
     * Identifier of the trading member/participant who made investment decision.
     *
     * @return the InvestmentDecisionMaker field
     */
    public InvestmentDecisionMakerField investmentDecisionMaker() {
        return investmentDecisionMaker;
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
     * Minimum Execution Size (MES) of an order.
     *
     * @return the MinimumQuantity field
     */
    public MinimumQuantityField minimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Identifier of the trading member/participant who made the execution decision.
     *
     * @return the ExecutingTrader field
     */
    public ExecutingTraderField executingTrader() {
        return executingTrader;
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
     * The instruction for permissioning to trade against mid-priced pegged orders.
     *
     * @return the NewOrderPeggedExecInst field
     */
    public NewOrderPeggedExecInstField newOrderPeggedExecInst() {
        return newOrderPeggedExecInst;
    }

    /**
     * Optional identification (non-public).
     *
     * @return the OwnerType field
     */
    public OwnerTypeField ownerType() {
        return ownerType;
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
        if (!traderId.parse(data, cursor)) {
            return false;
        }
        cursor += TraderIdField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!miFidFlags.parse(data, cursor)) {
            return false;
        }
        cursor += MiFidFlagsField.BYTE_LENGTH;
        if (!partyRoleQualifiers.parse(data, cursor)) {
            return false;
        }
        cursor += PartyRoleQualifiersField.BYTE_LENGTH;
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        if (!tif.parse(data, cursor)) {
            return false;
        }
        cursor += TifField.BYTE_LENGTH;
        if (!expireDateTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireDateTimeField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
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
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!autoCancel.parse(data, cursor)) {
            return false;
        }
        cursor += AutoCancelField.BYTE_LENGTH;
        if (!newOrderOrderSubType.parse(data, cursor)) {
            return false;
        }
        cursor += NewOrderOrderSubTypeField.BYTE_LENGTH;
        if (!anonymity.parse(data, cursor)) {
            return false;
        }
        cursor += AnonymityField.BYTE_LENGTH;
        if (!stopPrice.parse(data, cursor)) {
            return false;
        }
        cursor += StopPriceField.BYTE_LENGTH;
        if (!passiveOnlyOrder.parse(data, cursor)) {
            return false;
        }
        cursor += PassiveOnlyOrderField.BYTE_LENGTH;
        if (!clientId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientIdField.BYTE_LENGTH;
        if (!investmentDecisionMaker.parse(data, cursor)) {
            return false;
        }
        cursor += InvestmentDecisionMakerField.BYTE_LENGTH;
        if (!groupId.parse(data, cursor)) {
            return false;
        }
        cursor += GroupIdField.BYTE_LENGTH;
        if (!minimumQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumQuantityField.BYTE_LENGTH;
        if (!executingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderField.BYTE_LENGTH;
        if (!offsetField.parse(data, cursor)) {
            return false;
        }
        cursor += OffsetField.BYTE_LENGTH;
        if (!newOrderPeggedExecInst.parse(data, cursor)) {
            return false;
        }
        cursor += NewOrderPeggedExecInstField.BYTE_LENGTH;
        if (!ownerType.parse(data, cursor)) {
            return false;
        }
        cursor += OwnerTypeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clientOrderId.encode(data, cursor);
        cursor = traderId.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = miFidFlags.encode(data, cursor);
        cursor = partyRoleQualifiers.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = tif.encode(data, cursor);
        cursor = expireDateTime.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = displayQty.encode(data, cursor);
        cursor = limitPrice.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = autoCancel.encode(data, cursor);
        cursor = newOrderOrderSubType.encode(data, cursor);
        cursor = anonymity.encode(data, cursor);
        cursor = stopPrice.encode(data, cursor);
        cursor = passiveOnlyOrder.encode(data, cursor);
        cursor = clientId.encode(data, cursor);
        cursor = investmentDecisionMaker.encode(data, cursor);
        cursor = groupId.encode(data, cursor);
        cursor = minimumQuantity.encode(data, cursor);
        cursor = executingTrader.encode(data, cursor);
        cursor = offsetField.encode(data, cursor);
        cursor = newOrderPeggedExecInst.encode(data, cursor);
        cursor = ownerType.encode(data, cursor);
        if (buffer != null && buffer.length >= 121) {
            System.arraycopy(buffer, 107, data, cursor, 14); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 14, (byte) 0); // padding
        }
        cursor += 14;
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
            case "TraderId" -> Optional.of(traderId);
            case "Account" -> Optional.of(account);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "MiFidFlags" -> Optional.of(miFidFlags);
            case "PartyRoleQualifiers" -> Optional.of(partyRoleQualifiers);
            case "OrderType" -> Optional.of(orderType);
            case "Tif" -> Optional.of(tif);
            case "ExpireDateTime" -> Optional.of(expireDateTime);
            case "Side" -> Optional.of(side);
            case "OrderQty" -> Optional.of(orderQty);
            case "DisplayQty" -> Optional.of(displayQty);
            case "LimitPrice" -> Optional.of(limitPrice);
            case "Capacity" -> Optional.of(capacity);
            case "AutoCancel" -> Optional.of(autoCancel);
            case "NewOrderOrderSubType" -> Optional.of(newOrderOrderSubType);
            case "Anonymity" -> Optional.of(anonymity);
            case "StopPrice" -> Optional.of(stopPrice);
            case "PassiveOnlyOrder" -> Optional.of(passiveOnlyOrder);
            case "ClientId" -> Optional.of(clientId);
            case "InvestmentDecisionMaker" -> Optional.of(investmentDecisionMaker);
            case "GroupId" -> Optional.of(groupId);
            case "MinimumQuantity" -> Optional.of(minimumQuantity);
            case "ExecutingTrader" -> Optional.of(executingTrader);
            case "Offset" -> Optional.of(offsetField);
            case "NewOrderPeggedExecInst" -> Optional.of(newOrderPeggedExecInst);
            case "OwnerType" -> Optional.of(ownerType);
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
