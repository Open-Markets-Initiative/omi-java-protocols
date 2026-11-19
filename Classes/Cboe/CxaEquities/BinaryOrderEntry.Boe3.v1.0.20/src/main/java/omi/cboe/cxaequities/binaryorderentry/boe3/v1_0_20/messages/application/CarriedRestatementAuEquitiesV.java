package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.AccountField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.BrokerPreferencingField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.CapacityField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ClOrdIdField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ClearingAccountField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ClearingParticipantIdField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ClientCrossRefField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.DirectedWholesaleIndicatorField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.DisplayIndicatorField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ExecInstField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ExpireDateField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ExpireTimeField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.IntermediaryIdField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.MaxFloorField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.MeqseField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.MinQtyField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.NoTradeFeatField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.NoTradeKeyField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.OrdTypeField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.OrderIdField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.OrderQtyField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.OriginOfTransField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.PriceField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.RemoveCrossingFromClearingField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.RiskGroupIdField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.RoutingInstField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ShortSellCoveredQtyField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ShortSellLongQtyField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ShortSellNakedQtyField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.SideField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.SymbolField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.TimeInForceField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.TradingParticipantIdField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.TransactionTimeField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.UndisclosedField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.types.Field;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.types.Message;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.types.PrintOptions;

/**
 * Represents the CarriedRestatementAuEquitiesV message from the BinaryOrderEntry protocol.
 *
 * <p>The Carried Restatement message is used to indicate the restoration of a multi-day GTC or GTD orders at the start of a new business day</p>
 */
public final class CarriedRestatementAuEquitiesV implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 182;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Carried Restatement Au Equities V";

    /**
     * The time the event occurred in the Matching Engine (not the time the message was sent)
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Used by a trading participant to provide a broker cross reference
     */
    private final AccountField account = new AccountField();

    /**
     * The (4 digit) trading participant identifier
     */
    private final TradingParticipantIdField tradingParticipantId = new TradingParticipantIdField();

    /**
     * Unique Id chosen by the participant
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * All values not defined below are rejected. Ignored if blank (0x00)
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Order identifier supplied by Cboe Australia
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Order quantity. System limit is 999,999,999
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Order type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Price of the order
     */
    private final PriceField price = new PriceField();

    /**
     * The capacity for the order. Required on all orders
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Side of the order
     */
    private final SideField side = new SideField();

    /**
     * Instrument symbol (upper case alphanumeric)
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Time in force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Minimum fill quantity for orders
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * Portion of OrderQty to display. Used for iceberg orders and hidden orders
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * Required for GTD order (TimeInForce = 6), ExpireTime specifies the date-time (in UTC) when the order expires
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * The CHESS clearing participant identifier. Must be a valid 5-digit CHESS PID
     */
    private final ClearingParticipantIdField clearingParticipantId = new ClearingParticipantIdField();

    /**
     * Supplemental identifier
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * If true, indicates an undisclosed order
     */
    private final UndisclosedField undisclosed = new UndisclosedField();

    /**
     * Can be used to provide additional participant-side cross reference information
     */
    private final ClientCrossRefField clientCrossRef = new ClientCrossRefField();

    /**
     * Defines the portion of OrderQty (38) that is naked
     */
    private final ShortSellNakedQtyField shortSellNakedQty = new ShortSellNakedQtyField();

    /**
     * Defines the portion of OrderQty (38) that is covered
     */
    private final ShortSellCoveredQtyField shortSellCoveredQty = new ShortSellCoveredQtyField();

    /**
     * Defines the portion of OrderQty (38) that is owned by the participant who placed the order
     */
    private final ShortSellLongQtyField shortSellLongQty = new ShortSellLongQtyField();

    /**
     * Used to group orders for use in order purges where multiple orders can be cancelled by specifying a list of RiskGroupIDs
     */
    private final RiskGroupIdField riskGroupId = new RiskGroupIdField();

    /**
     * Ignored if NoTradeKey is not set. Declares the handling of self-trading
     */
    private final NoTradeFeatField noTradeFeat = new NoTradeFeatField();

    /**
     * Interactions of orders from the same participant with the same NoTradeKey value will be managed by the newer order's NoTradeFeat instruction
     */
    private final NoTradeKeyField noTradeKey = new NoTradeKeyField();

    /**
     * If true, then any single fill will be for at least MinQty shares
     */
    private final MeqseField meqse = new MeqseField();

    /**
     * Market Integrity Rule defined field for Origin of Order (ex. ACN, ABN, CHESS HIN)
     */
    private final OriginOfTransField originOfTrans = new OriginOfTransField();

    /**
     * Market Integrity Rule defined field for Intermediary Identifier
     */
    private final IntermediaryIdField intermediaryId = new IntermediaryIdField();

    /**
     * Market Integrity Rule defined field to identify wholesale participant
     */
    private final DirectedWholesaleIndicatorField directedWholesaleIndicator = new DirectedWholesaleIndicatorField();

    /**
     * If Y, instructs Cboe Australia on how to process crossed trades with CHESS
     */
    private final RemoveCrossingFromClearingField removeCrossingFromClearing = new RemoveCrossingFromClearingField();

    /**
     * Broker preferencing instruction
     */
    private final BrokerPreferencingField brokerPreferencing = new BrokerPreferencingField();

    /**
     * Indicates the order is a Post Only order
     */
    private final RoutingInstField routingInst = new RoutingInstField();

    /**
     * Treatment of Post Only orders on entry if creating a locked NBBO
     */
    private final DisplayIndicatorField displayIndicator = new DisplayIndicatorField();

    /**
     * Only applicable for TimeInForce (59) = 6 (GTD) orders. Specifies the date on which a GTD order will expire
     */
    private final ExpireDateField expireDate = new ExpireDateField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, account, tradingParticipantId, clOrdId, execInst, orderId, orderQty, ordType, price, capacity, side, symbol, timeInForce, minQty, maxFloor, expireTime, clearingParticipantId, clearingAccount, undisclosed, clientCrossRef, shortSellNakedQty, shortSellCoveredQty, shortSellLongQty, riskGroupId, noTradeFeat, noTradeKey, meqse, originOfTrans, intermediaryId, directedWholesaleIndicator, removeCrossingFromClearing, brokerPreferencing, routingInst, displayIndicator, expireDate);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the Matching Engine (not the time the message was sent)
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Used by a trading participant to provide a broker cross reference
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * The (4 digit) trading participant identifier
     *
     * @return the TradingParticipantId field
     */
    public TradingParticipantIdField tradingParticipantId() {
        return tradingParticipantId;
    }

    /**
     * Unique Id chosen by the participant
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * All values not defined below are rejected. Ignored if blank (0x00)
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * Order identifier supplied by Cboe Australia
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Order quantity. System limit is 999,999,999
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Order type
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * Price of the order
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The capacity for the order. Required on all orders
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
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
     * Instrument symbol (upper case alphanumeric)
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Time in force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Minimum fill quantity for orders
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
    }

    /**
     * Portion of OrderQty to display. Used for iceberg orders and hidden orders
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
    }

    /**
     * Required for GTD order (TimeInForce = 6), ExpireTime specifies the date-time (in UTC) when the order expires
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
    }

    /**
     * The CHESS clearing participant identifier. Must be a valid 5-digit CHESS PID
     *
     * @return the ClearingParticipantId field
     */
    public ClearingParticipantIdField clearingParticipantId() {
        return clearingParticipantId;
    }

    /**
     * Supplemental identifier
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * If true, indicates an undisclosed order
     *
     * @return the Undisclosed field
     */
    public UndisclosedField undisclosed() {
        return undisclosed;
    }

    /**
     * Can be used to provide additional participant-side cross reference information
     *
     * @return the ClientCrossRef field
     */
    public ClientCrossRefField clientCrossRef() {
        return clientCrossRef;
    }

    /**
     * Defines the portion of OrderQty (38) that is naked
     *
     * @return the ShortSellNakedQty field
     */
    public ShortSellNakedQtyField shortSellNakedQty() {
        return shortSellNakedQty;
    }

    /**
     * Defines the portion of OrderQty (38) that is covered
     *
     * @return the ShortSellCoveredQty field
     */
    public ShortSellCoveredQtyField shortSellCoveredQty() {
        return shortSellCoveredQty;
    }

    /**
     * Defines the portion of OrderQty (38) that is owned by the participant who placed the order
     *
     * @return the ShortSellLongQty field
     */
    public ShortSellLongQtyField shortSellLongQty() {
        return shortSellLongQty;
    }

    /**
     * Used to group orders for use in order purges where multiple orders can be cancelled by specifying a list of RiskGroupIDs
     *
     * @return the RiskGroupId field
     */
    public RiskGroupIdField riskGroupId() {
        return riskGroupId;
    }

    /**
     * Ignored if NoTradeKey is not set. Declares the handling of self-trading
     *
     * @return the NoTradeFeat field
     */
    public NoTradeFeatField noTradeFeat() {
        return noTradeFeat;
    }

    /**
     * Interactions of orders from the same participant with the same NoTradeKey value will be managed by the newer order's NoTradeFeat instruction
     *
     * @return the NoTradeKey field
     */
    public NoTradeKeyField noTradeKey() {
        return noTradeKey;
    }

    /**
     * If true, then any single fill will be for at least MinQty shares
     *
     * @return the Meqse field
     */
    public MeqseField meqse() {
        return meqse;
    }

    /**
     * Market Integrity Rule defined field for Origin of Order (ex. ACN, ABN, CHESS HIN)
     *
     * @return the OriginOfTrans field
     */
    public OriginOfTransField originOfTrans() {
        return originOfTrans;
    }

    /**
     * Market Integrity Rule defined field for Intermediary Identifier
     *
     * @return the IntermediaryId field
     */
    public IntermediaryIdField intermediaryId() {
        return intermediaryId;
    }

    /**
     * Market Integrity Rule defined field to identify wholesale participant
     *
     * @return the DirectedWholesaleIndicator field
     */
    public DirectedWholesaleIndicatorField directedWholesaleIndicator() {
        return directedWholesaleIndicator;
    }

    /**
     * If Y, instructs Cboe Australia on how to process crossed trades with CHESS
     *
     * @return the RemoveCrossingFromClearing field
     */
    public RemoveCrossingFromClearingField removeCrossingFromClearing() {
        return removeCrossingFromClearing;
    }

    /**
     * Broker preferencing instruction
     *
     * @return the BrokerPreferencing field
     */
    public BrokerPreferencingField brokerPreferencing() {
        return brokerPreferencing;
    }

    /**
     * Indicates the order is a Post Only order
     *
     * @return the RoutingInst field
     */
    public RoutingInstField routingInst() {
        return routingInst;
    }

    /**
     * Treatment of Post Only orders on entry if creating a locked NBBO
     *
     * @return the DisplayIndicator field
     */
    public DisplayIndicatorField displayIndicator() {
        return displayIndicator;
    }

    /**
     * Only applicable for TimeInForce (59) = 6 (GTD) orders. Specifies the date on which a GTD order will expire
     *
     * @return the ExpireDate field
     */
    public ExpireDateField expireDate() {
        return expireDate;
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
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!tradingParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingParticipantIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!minQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinQtyField.BYTE_LENGTH;
        if (!maxFloor.parse(data, cursor)) {
            return false;
        }
        cursor += MaxFloorField.BYTE_LENGTH;
        if (!expireTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireTimeField.BYTE_LENGTH;
        if (!clearingParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingParticipantIdField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!undisclosed.parse(data, cursor)) {
            return false;
        }
        cursor += UndisclosedField.BYTE_LENGTH;
        if (!clientCrossRef.parse(data, cursor)) {
            return false;
        }
        cursor += ClientCrossRefField.BYTE_LENGTH;
        if (!shortSellNakedQty.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSellNakedQtyField.BYTE_LENGTH;
        if (!shortSellCoveredQty.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSellCoveredQtyField.BYTE_LENGTH;
        if (!shortSellLongQty.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSellLongQtyField.BYTE_LENGTH;
        if (!riskGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += RiskGroupIdField.BYTE_LENGTH;
        if (!noTradeFeat.parse(data, cursor)) {
            return false;
        }
        cursor += NoTradeFeatField.BYTE_LENGTH;
        if (!noTradeKey.parse(data, cursor)) {
            return false;
        }
        cursor += NoTradeKeyField.BYTE_LENGTH;
        if (!meqse.parse(data, cursor)) {
            return false;
        }
        cursor += MeqseField.BYTE_LENGTH;
        if (!originOfTrans.parse(data, cursor)) {
            return false;
        }
        cursor += OriginOfTransField.BYTE_LENGTH;
        if (!intermediaryId.parse(data, cursor)) {
            return false;
        }
        cursor += IntermediaryIdField.BYTE_LENGTH;
        if (!directedWholesaleIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += DirectedWholesaleIndicatorField.BYTE_LENGTH;
        if (!removeCrossingFromClearing.parse(data, cursor)) {
            return false;
        }
        cursor += RemoveCrossingFromClearingField.BYTE_LENGTH;
        if (!brokerPreferencing.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerPreferencingField.BYTE_LENGTH;
        if (!routingInst.parse(data, cursor)) {
            return false;
        }
        cursor += RoutingInstField.BYTE_LENGTH;
        if (!displayIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayIndicatorField.BYTE_LENGTH;
        return expireDate.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = tradingParticipantId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = maxFloor.encode(data, cursor);
        cursor = expireTime.encode(data, cursor);
        cursor = clearingParticipantId.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = undisclosed.encode(data, cursor);
        cursor = clientCrossRef.encode(data, cursor);
        cursor = shortSellNakedQty.encode(data, cursor);
        cursor = shortSellCoveredQty.encode(data, cursor);
        cursor = shortSellLongQty.encode(data, cursor);
        cursor = riskGroupId.encode(data, cursor);
        cursor = noTradeFeat.encode(data, cursor);
        cursor = noTradeKey.encode(data, cursor);
        cursor = meqse.encode(data, cursor);
        cursor = originOfTrans.encode(data, cursor);
        cursor = intermediaryId.encode(data, cursor);
        cursor = directedWholesaleIndicator.encode(data, cursor);
        cursor = removeCrossingFromClearing.encode(data, cursor);
        cursor = brokerPreferencing.encode(data, cursor);
        cursor = routingInst.encode(data, cursor);
        cursor = displayIndicator.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
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
            case "Account" -> Optional.of(account);
            case "TradingParticipantId" -> Optional.of(tradingParticipantId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "ExecInst" -> Optional.of(execInst);
            case "OrderId" -> Optional.of(orderId);
            case "OrderQty" -> Optional.of(orderQty);
            case "OrdType" -> Optional.of(ordType);
            case "Price" -> Optional.of(price);
            case "Capacity" -> Optional.of(capacity);
            case "Side" -> Optional.of(side);
            case "Symbol" -> Optional.of(symbol);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "ExpireTime" -> Optional.of(expireTime);
            case "ClearingParticipantId" -> Optional.of(clearingParticipantId);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "Undisclosed" -> Optional.of(undisclosed);
            case "ClientCrossRef" -> Optional.of(clientCrossRef);
            case "ShortSellNakedQty" -> Optional.of(shortSellNakedQty);
            case "ShortSellCoveredQty" -> Optional.of(shortSellCoveredQty);
            case "ShortSellLongQty" -> Optional.of(shortSellLongQty);
            case "RiskGroupId" -> Optional.of(riskGroupId);
            case "NoTradeFeat" -> Optional.of(noTradeFeat);
            case "NoTradeKey" -> Optional.of(noTradeKey);
            case "Meqse" -> Optional.of(meqse);
            case "OriginOfTrans" -> Optional.of(originOfTrans);
            case "IntermediaryId" -> Optional.of(intermediaryId);
            case "DirectedWholesaleIndicator" -> Optional.of(directedWholesaleIndicator);
            case "RemoveCrossingFromClearing" -> Optional.of(removeCrossingFromClearing);
            case "BrokerPreferencing" -> Optional.of(brokerPreferencing);
            case "RoutingInst" -> Optional.of(routingInst);
            case "DisplayIndicator" -> Optional.of(displayIndicator);
            case "ExpireDate" -> Optional.of(expireDate);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CarriedRestatementAuEquitiesV message)) {
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
        if (!(other instanceof CarriedRestatementAuEquitiesV message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
