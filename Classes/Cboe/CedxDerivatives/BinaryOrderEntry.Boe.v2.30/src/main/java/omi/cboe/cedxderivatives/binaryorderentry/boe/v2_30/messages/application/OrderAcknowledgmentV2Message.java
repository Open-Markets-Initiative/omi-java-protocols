package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.AccountField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.AccountTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.AlgorithmicIndicatorField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.AuctionIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.BaseLiquidityIndicatorField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CapacityField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ClOrdIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ClearingAccountField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ClearingFirmField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ClientIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ClientQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CustOrderHandlingInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.DisplayIndicatorField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.DisplayPriceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.DrillThruProtectionField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ExecutorIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ExecutorQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ExpireTimeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ExtExecInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.IdSourceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.InvestorIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.InvestorQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.LastPxBinaryPriceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.LastSharesField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.LeavesQtyField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.LiquidityProvisionField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.MinQtyField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OpenCloseField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrdTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield10Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield11Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield12Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield13Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield14Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield15Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield16Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield17Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield18Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield19Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield1Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield2Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield3Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield4Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield5Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield6Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield7Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield8Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderAcknowledgmentV2ReturnBitfield9Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderOriginationField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderQtyField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrigClOrdIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.PreventMatchField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.PriceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.RoutingInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.SecondaryOrderIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.SecurityIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.SideField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.StopPxField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.SubLiquidityIndicatorField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.SymbolAlphanumericField2;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TimeInForceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TransactionTimeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.WorkingPriceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.PrintOptions;

/**
 * Represents the OrderAcknowledgmentV2Message message from the BinaryOrderEntry protocol.
 *
 * <p>Order Acknowledgment V2 Message.</p>
 */
public final class OrderAcknowledgmentV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 38;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Acknowledgment V 2 Message";

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. A leading tilde (˜) cannot be sent on any ClOrdId and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system generated ClOrdId. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to OrderID (37) in Cboe FIX. Order identifier supplied by Cboe. This identi- fier corresponds to the identifiers used in Cboe market data products.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet OrderAcknowledgmentV2 byte 1.
     */
    private final OrderAcknowledgmentV2ReturnBitfield1Field orderAcknowledgmentV2ReturnBitfield1 = new OrderAcknowledgmentV2ReturnBitfield1Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 2.
     */
    private final OrderAcknowledgmentV2ReturnBitfield2Field orderAcknowledgmentV2ReturnBitfield2 = new OrderAcknowledgmentV2ReturnBitfield2Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 3.
     */
    private final OrderAcknowledgmentV2ReturnBitfield3Field orderAcknowledgmentV2ReturnBitfield3 = new OrderAcknowledgmentV2ReturnBitfield3Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 4.
     */
    private final OrderAcknowledgmentV2ReturnBitfield4Field orderAcknowledgmentV2ReturnBitfield4 = new OrderAcknowledgmentV2ReturnBitfield4Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 5.
     */
    private final OrderAcknowledgmentV2ReturnBitfield5Field orderAcknowledgmentV2ReturnBitfield5 = new OrderAcknowledgmentV2ReturnBitfield5Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 6.
     */
    private final OrderAcknowledgmentV2ReturnBitfield6Field orderAcknowledgmentV2ReturnBitfield6 = new OrderAcknowledgmentV2ReturnBitfield6Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 7.
     */
    private final OrderAcknowledgmentV2ReturnBitfield7Field orderAcknowledgmentV2ReturnBitfield7 = new OrderAcknowledgmentV2ReturnBitfield7Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 8.
     */
    private final OrderAcknowledgmentV2ReturnBitfield8Field orderAcknowledgmentV2ReturnBitfield8 = new OrderAcknowledgmentV2ReturnBitfield8Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 9.
     */
    private final OrderAcknowledgmentV2ReturnBitfield9Field orderAcknowledgmentV2ReturnBitfield9 = new OrderAcknowledgmentV2ReturnBitfield9Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 10.
     */
    private final OrderAcknowledgmentV2ReturnBitfield10Field orderAcknowledgmentV2ReturnBitfield10 = new OrderAcknowledgmentV2ReturnBitfield10Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 11.
     */
    private final OrderAcknowledgmentV2ReturnBitfield11Field orderAcknowledgmentV2ReturnBitfield11 = new OrderAcknowledgmentV2ReturnBitfield11Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 12.
     */
    private final OrderAcknowledgmentV2ReturnBitfield12Field orderAcknowledgmentV2ReturnBitfield12 = new OrderAcknowledgmentV2ReturnBitfield12Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 13.
     */
    private final OrderAcknowledgmentV2ReturnBitfield13Field orderAcknowledgmentV2ReturnBitfield13 = new OrderAcknowledgmentV2ReturnBitfield13Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 14.
     */
    private final OrderAcknowledgmentV2ReturnBitfield14Field orderAcknowledgmentV2ReturnBitfield14 = new OrderAcknowledgmentV2ReturnBitfield14Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 15.
     */
    private final OrderAcknowledgmentV2ReturnBitfield15Field orderAcknowledgmentV2ReturnBitfield15 = new OrderAcknowledgmentV2ReturnBitfield15Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 16.
     */
    private final OrderAcknowledgmentV2ReturnBitfield16Field orderAcknowledgmentV2ReturnBitfield16 = new OrderAcknowledgmentV2ReturnBitfield16Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 17.
     */
    private final OrderAcknowledgmentV2ReturnBitfield17Field orderAcknowledgmentV2ReturnBitfield17 = new OrderAcknowledgmentV2ReturnBitfield17Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 18.
     */
    private final OrderAcknowledgmentV2ReturnBitfield18Field orderAcknowledgmentV2ReturnBitfield18 = new OrderAcknowledgmentV2ReturnBitfield18Field();

    /**
     * BitSet OrderAcknowledgmentV2 byte 19.
     */
    private final OrderAcknowledgmentV2ReturnBitfield19Field orderAcknowledgmentV2ReturnBitfield19 = new OrderAcknowledgmentV2ReturnBitfield19Field();

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     */
    private final SideField side = new SideField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Ord Type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Time In Force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Min Qty
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * Symbol Alphanumeric
     */
    private final SymbolAlphanumericField2 symbolAlphanumeric = new SymbolAlphanumericField2();

    /**
     * Id Source
     */
    private final IdSourceField idSource = new IdSourceField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Clearing Account
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Display Indicator
     */
    private final DisplayIndicatorField displayIndicator = new DisplayIndicatorField();

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 con- tracts.
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Prevent Match
     */
    private final PreventMatchField preventMatch = new PreventMatchField();

    /**
     * Open Close
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Corresponds to OrigClOrdID (41) in Cboe FIX. ClOrdID of the order to cancel.
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Leaves Qty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Corresponds to LastShares (32) in Cboe FIX. Executed contract quantity. System limit is 999,999 contracts.
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Last Px Binary Price
     */
    private final LastPxBinaryPriceField lastPxBinaryPrice = new LastPxBinaryPriceField();

    /**
     * Display Price
     */
    private final DisplayPriceField displayPrice = new DisplayPriceField();

    /**
     * Working Price
     */
    private final WorkingPriceField workingPrice = new WorkingPriceField();

    /**
     * Base Liquidity Indicator
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Expire Time
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Secondary Order Id
     */
    private final SecondaryOrderIdField secondaryOrderId = new SecondaryOrderIdField();

    /**
     * Ext Exec Inst
     */
    private final ExtExecInstField extExecInst = new ExtExecInstField();

    /**
     * Sub Liquidity Indicator
     */
    private final SubLiquidityIndicatorField subLiquidityIndicator = new SubLiquidityIndicatorField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Routing Inst
     */
    private final RoutingInstField routingInst = new RoutingInstField();

    /**
     * Auction Id
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Liquidity Provision
     */
    private final LiquidityProvisionField liquidityProvision = new LiquidityProvisionField();

    /**
     * Client Qualified Role
     */
    private final ClientQualifiedRoleField clientQualifiedRole = new ClientQualifiedRoleField();

    /**
     * Client Id
     */
    private final ClientIdField clientId = new ClientIdField();

    /**
     * Investor Id
     */
    private final InvestorIdField investorId = new InvestorIdField();

    /**
     * Executor Id
     */
    private final ExecutorIdField executorId = new ExecutorIdField();

    /**
     * Order Origination
     */
    private final OrderOriginationField orderOrigination = new OrderOriginationField();

    /**
     * Algorithmic Indicator
     */
    private final AlgorithmicIndicatorField algorithmicIndicator = new AlgorithmicIndicatorField();

    /**
     * Investor Qualified Role
     */
    private final InvestorQualifiedRoleField investorQualifiedRole = new InvestorQualifiedRoleField();

    /**
     * Executor Qualified Role
     */
    private final ExecutorQualifiedRoleField executorQualifiedRole = new ExecutorQualifiedRoleField();

    /**
     * Drill Thru Protection
     */
    private final DrillThruProtectionField drillThruProtection = new DrillThruProtectionField();

    /**
     * Cust Order Handling Inst
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

    /**
     * Account Type
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, orderId, numberOfReturnBitfields, orderAcknowledgmentV2ReturnBitfield1, orderAcknowledgmentV2ReturnBitfield2, orderAcknowledgmentV2ReturnBitfield3, orderAcknowledgmentV2ReturnBitfield4, orderAcknowledgmentV2ReturnBitfield5, orderAcknowledgmentV2ReturnBitfield6, orderAcknowledgmentV2ReturnBitfield7, orderAcknowledgmentV2ReturnBitfield8, orderAcknowledgmentV2ReturnBitfield9, orderAcknowledgmentV2ReturnBitfield10, orderAcknowledgmentV2ReturnBitfield11, orderAcknowledgmentV2ReturnBitfield12, orderAcknowledgmentV2ReturnBitfield13, orderAcknowledgmentV2ReturnBitfield14, orderAcknowledgmentV2ReturnBitfield15, orderAcknowledgmentV2ReturnBitfield16, orderAcknowledgmentV2ReturnBitfield17, orderAcknowledgmentV2ReturnBitfield18, orderAcknowledgmentV2ReturnBitfield19, side, price, ordType, timeInForce, minQty, symbolAlphanumeric, idSource, securityId, capacity, account, clearingFirm, clearingAccount, displayIndicator, orderQty, preventMatch, openClose, origClOrdId, leavesQty, lastShares, lastPxBinaryPrice, displayPrice, workingPrice, baseLiquidityIndicator, expireTime, secondaryOrderId, extExecInst, subLiquidityIndicator, stopPx, routingInst, auctionId, liquidityProvision, clientQualifiedRole, clientId, investorId, executorId, orderOrigination, algorithmicIndicator, investorQualifiedRole, executorQualifiedRole, drillThruProtection, custOrderHandlingInst, accountType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent).
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. A leading tilde (˜) cannot be sent on any ClOrdId and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system generated ClOrdId. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Corresponds to OrderID (37) in Cboe FIX. Order identifier supplied by Cboe. This identi- fier corresponds to the identifiers used in Cboe market data products.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfReturnBitfields field
     */
    public NumberOfReturnBitfieldsField numberOfReturnBitfields() {
        return numberOfReturnBitfields;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 1.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield1 field
     */
    public OrderAcknowledgmentV2ReturnBitfield1Field orderAcknowledgmentV2ReturnBitfield1() {
        return orderAcknowledgmentV2ReturnBitfield1;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 2.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield2 field
     */
    public OrderAcknowledgmentV2ReturnBitfield2Field orderAcknowledgmentV2ReturnBitfield2() {
        return orderAcknowledgmentV2ReturnBitfield2;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 3.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield3 field
     */
    public OrderAcknowledgmentV2ReturnBitfield3Field orderAcknowledgmentV2ReturnBitfield3() {
        return orderAcknowledgmentV2ReturnBitfield3;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 4.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield4 field
     */
    public OrderAcknowledgmentV2ReturnBitfield4Field orderAcknowledgmentV2ReturnBitfield4() {
        return orderAcknowledgmentV2ReturnBitfield4;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 5.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield5 field
     */
    public OrderAcknowledgmentV2ReturnBitfield5Field orderAcknowledgmentV2ReturnBitfield5() {
        return orderAcknowledgmentV2ReturnBitfield5;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 6.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield6 field
     */
    public OrderAcknowledgmentV2ReturnBitfield6Field orderAcknowledgmentV2ReturnBitfield6() {
        return orderAcknowledgmentV2ReturnBitfield6;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 7.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield7 field
     */
    public OrderAcknowledgmentV2ReturnBitfield7Field orderAcknowledgmentV2ReturnBitfield7() {
        return orderAcknowledgmentV2ReturnBitfield7;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 8.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield8 field
     */
    public OrderAcknowledgmentV2ReturnBitfield8Field orderAcknowledgmentV2ReturnBitfield8() {
        return orderAcknowledgmentV2ReturnBitfield8;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 9.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield9 field
     */
    public OrderAcknowledgmentV2ReturnBitfield9Field orderAcknowledgmentV2ReturnBitfield9() {
        return orderAcknowledgmentV2ReturnBitfield9;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 10.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield10 field
     */
    public OrderAcknowledgmentV2ReturnBitfield10Field orderAcknowledgmentV2ReturnBitfield10() {
        return orderAcknowledgmentV2ReturnBitfield10;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 11.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield11 field
     */
    public OrderAcknowledgmentV2ReturnBitfield11Field orderAcknowledgmentV2ReturnBitfield11() {
        return orderAcknowledgmentV2ReturnBitfield11;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 12.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield12 field
     */
    public OrderAcknowledgmentV2ReturnBitfield12Field orderAcknowledgmentV2ReturnBitfield12() {
        return orderAcknowledgmentV2ReturnBitfield12;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 13.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield13 field
     */
    public OrderAcknowledgmentV2ReturnBitfield13Field orderAcknowledgmentV2ReturnBitfield13() {
        return orderAcknowledgmentV2ReturnBitfield13;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 14.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield14 field
     */
    public OrderAcknowledgmentV2ReturnBitfield14Field orderAcknowledgmentV2ReturnBitfield14() {
        return orderAcknowledgmentV2ReturnBitfield14;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 15.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield15 field
     */
    public OrderAcknowledgmentV2ReturnBitfield15Field orderAcknowledgmentV2ReturnBitfield15() {
        return orderAcknowledgmentV2ReturnBitfield15;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 16.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield16 field
     */
    public OrderAcknowledgmentV2ReturnBitfield16Field orderAcknowledgmentV2ReturnBitfield16() {
        return orderAcknowledgmentV2ReturnBitfield16;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 17.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield17 field
     */
    public OrderAcknowledgmentV2ReturnBitfield17Field orderAcknowledgmentV2ReturnBitfield17() {
        return orderAcknowledgmentV2ReturnBitfield17;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 18.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield18 field
     */
    public OrderAcknowledgmentV2ReturnBitfield18Field orderAcknowledgmentV2ReturnBitfield18() {
        return orderAcknowledgmentV2ReturnBitfield18;
    }

    /**
     * BitSet OrderAcknowledgmentV2 byte 19.
     *
     * @return the OrderAcknowledgmentV2ReturnBitfield19 field
     */
    public OrderAcknowledgmentV2ReturnBitfield19Field orderAcknowledgmentV2ReturnBitfield19() {
        return orderAcknowledgmentV2ReturnBitfield19;
    }

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Ord Type
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * Time In Force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Min Qty
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
    }

    /**
     * Symbol Alphanumeric
     *
     * @return the SymbolAlphanumeric field
     */
    public SymbolAlphanumericField2 symbolAlphanumeric() {
        return symbolAlphanumeric;
    }

    /**
     * Id Source
     *
     * @return the IdSource field
     */
    public IdSourceField idSource() {
        return idSource;
    }

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Clearing Firm
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Clearing Account
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * Display Indicator
     *
     * @return the DisplayIndicator field
     */
    public DisplayIndicatorField displayIndicator() {
        return displayIndicator;
    }

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 con- tracts.
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Prevent Match
     *
     * @return the PreventMatch field
     */
    public PreventMatchField preventMatch() {
        return preventMatch;
    }

    /**
     * Open Close
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * Corresponds to OrigClOrdID (41) in Cboe FIX. ClOrdID of the order to cancel.
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * Leaves Qty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Corresponds to LastShares (32) in Cboe FIX. Executed contract quantity. System limit is 999,999 contracts.
     *
     * @return the LastShares field
     */
    public LastSharesField lastShares() {
        return lastShares;
    }

    /**
     * Last Px Binary Price
     *
     * @return the LastPxBinaryPrice field
     */
    public LastPxBinaryPriceField lastPxBinaryPrice() {
        return lastPxBinaryPrice;
    }

    /**
     * Display Price
     *
     * @return the DisplayPrice field
     */
    public DisplayPriceField displayPrice() {
        return displayPrice;
    }

    /**
     * Working Price
     *
     * @return the WorkingPrice field
     */
    public WorkingPriceField workingPrice() {
        return workingPrice;
    }

    /**
     * Base Liquidity Indicator
     *
     * @return the BaseLiquidityIndicator field
     */
    public BaseLiquidityIndicatorField baseLiquidityIndicator() {
        return baseLiquidityIndicator;
    }

    /**
     * Expire Time
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
    }

    /**
     * Secondary Order Id
     *
     * @return the SecondaryOrderId field
     */
    public SecondaryOrderIdField secondaryOrderId() {
        return secondaryOrderId;
    }

    /**
     * Ext Exec Inst
     *
     * @return the ExtExecInst field
     */
    public ExtExecInstField extExecInst() {
        return extExecInst;
    }

    /**
     * Sub Liquidity Indicator
     *
     * @return the SubLiquidityIndicator field
     */
    public SubLiquidityIndicatorField subLiquidityIndicator() {
        return subLiquidityIndicator;
    }

    /**
     * Stop Px
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * Routing Inst
     *
     * @return the RoutingInst field
     */
    public RoutingInstField routingInst() {
        return routingInst;
    }

    /**
     * Auction Id
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * Liquidity Provision
     *
     * @return the LiquidityProvision field
     */
    public LiquidityProvisionField liquidityProvision() {
        return liquidityProvision;
    }

    /**
     * Client Qualified Role
     *
     * @return the ClientQualifiedRole field
     */
    public ClientQualifiedRoleField clientQualifiedRole() {
        return clientQualifiedRole;
    }

    /**
     * Client Id
     *
     * @return the ClientId field
     */
    public ClientIdField clientId() {
        return clientId;
    }

    /**
     * Investor Id
     *
     * @return the InvestorId field
     */
    public InvestorIdField investorId() {
        return investorId;
    }

    /**
     * Executor Id
     *
     * @return the ExecutorId field
     */
    public ExecutorIdField executorId() {
        return executorId;
    }

    /**
     * Order Origination
     *
     * @return the OrderOrigination field
     */
    public OrderOriginationField orderOrigination() {
        return orderOrigination;
    }

    /**
     * Algorithmic Indicator
     *
     * @return the AlgorithmicIndicator field
     */
    public AlgorithmicIndicatorField algorithmicIndicator() {
        return algorithmicIndicator;
    }

    /**
     * Investor Qualified Role
     *
     * @return the InvestorQualifiedRole field
     */
    public InvestorQualifiedRoleField investorQualifiedRole() {
        return investorQualifiedRole;
    }

    /**
     * Executor Qualified Role
     *
     * @return the ExecutorQualifiedRole field
     */
    public ExecutorQualifiedRoleField executorQualifiedRole() {
        return executorQualifiedRole;
    }

    /**
     * Drill Thru Protection
     *
     * @return the DrillThruProtection field
     */
    public DrillThruProtectionField drillThruProtection() {
        return drillThruProtection;
    }

    /**
     * Cust Order Handling Inst
     *
     * @return the CustOrderHandlingInst field
     */
    public CustOrderHandlingInstField custOrderHandlingInst() {
        return custOrderHandlingInst;
    }

    /**
     * Account Type
     *
     * @return the AccountType field
     */
    public AccountTypeField accountType() {
        return accountType;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield1 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield2 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield3 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield4 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield5 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield6 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield7 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield8 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield9 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield10 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield11 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield12 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield13 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield14 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield15 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield16 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield17 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield18 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the OrderAcknowledgmentV2ReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the OrderAcknowledgmentV2ReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderAcknowledgmentV2ReturnBitfield19 is on the wire
     */
    public boolean orderAcknowledgmentV2ReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the Side put it on the wire.
     *
     * <p>Decode reads the Side where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Side is on the wire
     */
    public boolean sidePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentV2ReturnBitfield1Present() && orderAcknowledgmentV2ReturnBitfield1.orderAcknowledgmentV2ReturnBitfield1Side());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentV2ReturnBitfield1Present() && orderAcknowledgmentV2ReturnBitfield1.orderAcknowledgmentV2ReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentV2ReturnBitfield1Present() && orderAcknowledgmentV2ReturnBitfield1.orderAcknowledgmentV2ReturnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentV2ReturnBitfield1Present() && orderAcknowledgmentV2ReturnBitfield1.orderAcknowledgmentV2ReturnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderAcknowledgmentV2ReturnBitfield1Present() && orderAcknowledgmentV2ReturnBitfield1.orderAcknowledgmentV2ReturnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderAcknowledgmentV2ReturnBitfield2Present() && orderAcknowledgmentV2ReturnBitfield2.orderAcknowledgmentV2ReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderAcknowledgmentV2ReturnBitfield2Present() && orderAcknowledgmentV2ReturnBitfield2.orderAcknowledgmentV2ReturnBitfield2IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderAcknowledgmentV2ReturnBitfield2Present() && orderAcknowledgmentV2ReturnBitfield2.orderAcknowledgmentV2ReturnBitfield2SecurityId());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderAcknowledgmentV2ReturnBitfield2Present() && orderAcknowledgmentV2ReturnBitfield2.orderAcknowledgmentV2ReturnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentV2ReturnBitfield3Present() && orderAcknowledgmentV2ReturnBitfield3.orderAcknowledgmentV2ReturnBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentV2ReturnBitfield3Present() && orderAcknowledgmentV2ReturnBitfield3.orderAcknowledgmentV2ReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentV2ReturnBitfield3Present() && orderAcknowledgmentV2ReturnBitfield3.orderAcknowledgmentV2ReturnBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the DisplayIndicator put it on the wire.
     *
     * <p>Decode reads the DisplayIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayIndicator is on the wire
     */
    public boolean displayIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentV2ReturnBitfield3Present() && orderAcknowledgmentV2ReturnBitfield3.orderAcknowledgmentV2ReturnBitfield3DisplayIndicator());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentV2ReturnBitfield3Present() && orderAcknowledgmentV2ReturnBitfield3.orderAcknowledgmentV2ReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderAcknowledgmentV2ReturnBitfield3Present() && orderAcknowledgmentV2ReturnBitfield3.orderAcknowledgmentV2ReturnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (orderAcknowledgmentV2ReturnBitfield4Present() && orderAcknowledgmentV2ReturnBitfield4.orderAcknowledgmentV2ReturnBitfield4OpenClose());
    }

    /**
     * Returns whether the fields before the OrigClOrdId put it on the wire.
     *
     * <p>Decode reads the OrigClOrdId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrigClOrdId is on the wire
     */
    public boolean origClOrdIdPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentV2ReturnBitfield5Present() && orderAcknowledgmentV2ReturnBitfield5.orderAcknowledgmentV2ReturnBitfield5OrigClOrdId());
    }

    /**
     * Returns whether the fields before the LeavesQty put it on the wire.
     *
     * <p>Decode reads the LeavesQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LeavesQty is on the wire
     */
    public boolean leavesQtyPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentV2ReturnBitfield5Present() && orderAcknowledgmentV2ReturnBitfield5.orderAcknowledgmentV2ReturnBitfield5LeavesQty());
    }

    /**
     * Returns whether the fields before the LastShares put it on the wire.
     *
     * <p>Decode reads the LastShares where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastShares is on the wire
     */
    public boolean lastSharesPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentV2ReturnBitfield5Present() && orderAcknowledgmentV2ReturnBitfield5.orderAcknowledgmentV2ReturnBitfield5LastShares());
    }

    /**
     * Returns whether the fields before the LastPxBinaryPrice put it on the wire.
     *
     * <p>Decode reads the LastPxBinaryPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastPxBinaryPrice is on the wire
     */
    public boolean lastPxBinaryPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentV2ReturnBitfield5Present() && orderAcknowledgmentV2ReturnBitfield5.orderAcknowledgmentV2ReturnBitfield5LastPx());
    }

    /**
     * Returns whether the fields before the DisplayPrice put it on the wire.
     *
     * <p>Decode reads the DisplayPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayPrice is on the wire
     */
    public boolean displayPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentV2ReturnBitfield5Present() && orderAcknowledgmentV2ReturnBitfield5.orderAcknowledgmentV2ReturnBitfield5DisplayPrice());
    }

    /**
     * Returns whether the fields before the WorkingPrice put it on the wire.
     *
     * <p>Decode reads the WorkingPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the WorkingPrice is on the wire
     */
    public boolean workingPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentV2ReturnBitfield5Present() && orderAcknowledgmentV2ReturnBitfield5.orderAcknowledgmentV2ReturnBitfield5WorkingPrice());
    }

    /**
     * Returns whether the fields before the BaseLiquidityIndicator put it on the wire.
     *
     * <p>Decode reads the BaseLiquidityIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the BaseLiquidityIndicator is on the wire
     */
    public boolean baseLiquidityIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentV2ReturnBitfield5Present() && orderAcknowledgmentV2ReturnBitfield5.orderAcknowledgmentV2ReturnBitfield5BaseLiquidityIndicator());
    }

    /**
     * Returns whether the fields before the ExpireTime put it on the wire.
     *
     * <p>Decode reads the ExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExpireTime is on the wire
     */
    public boolean expireTimePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderAcknowledgmentV2ReturnBitfield5Present() && orderAcknowledgmentV2ReturnBitfield5.orderAcknowledgmentV2ReturnBitfield5ExpireTime());
    }

    /**
     * Returns whether the fields before the SecondaryOrderId put it on the wire.
     *
     * <p>Decode reads the SecondaryOrderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecondaryOrderId is on the wire
     */
    public boolean secondaryOrderIdPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderAcknowledgmentV2ReturnBitfield6Present() && orderAcknowledgmentV2ReturnBitfield6.orderAcknowledgmentV2ReturnBitfield6SecondaryOrderId());
    }

    /**
     * Returns whether the fields before the ExtExecInst put it on the wire.
     *
     * <p>Decode reads the ExtExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExtExecInst is on the wire
     */
    public boolean extExecInstPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderAcknowledgmentV2ReturnBitfield6Present() && orderAcknowledgmentV2ReturnBitfield6.orderAcknowledgmentV2ReturnBitfield6ExtExecInst());
    }

    /**
     * Returns whether the fields before the SubLiquidityIndicator put it on the wire.
     *
     * <p>Decode reads the SubLiquidityIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SubLiquidityIndicator is on the wire
     */
    public boolean subLiquidityIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (orderAcknowledgmentV2ReturnBitfield7Present() && orderAcknowledgmentV2ReturnBitfield7.orderAcknowledgmentV2ReturnBitfield7SubLiquidityIndicator());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderAcknowledgmentV2ReturnBitfield8Present() && orderAcknowledgmentV2ReturnBitfield8.orderAcknowledgmentV2ReturnBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the RoutingInst put it on the wire.
     *
     * <p>Decode reads the RoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingInst is on the wire
     */
    public boolean routingInstPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderAcknowledgmentV2ReturnBitfield8Present() && orderAcknowledgmentV2ReturnBitfield8.orderAcknowledgmentV2ReturnBitfield8RoutingInst());
    }

    /**
     * Returns whether the fields before the AuctionId put it on the wire.
     *
     * <p>Decode reads the AuctionId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AuctionId is on the wire
     */
    public boolean auctionIdPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderAcknowledgmentV2ReturnBitfield9Present() && orderAcknowledgmentV2ReturnBitfield9.orderAcknowledgmentV2ReturnBitfield9AuctionId());
    }

    /**
     * Returns whether the fields before the LiquidityProvision put it on the wire.
     *
     * <p>Decode reads the LiquidityProvision where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LiquidityProvision is on the wire
     */
    public boolean liquidityProvisionPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderAcknowledgmentV2ReturnBitfield9Present() && orderAcknowledgmentV2ReturnBitfield9.orderAcknowledgmentV2ReturnBitfield9LiquidityProvision());
    }

    /**
     * Returns whether the fields before the ClientQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ClientQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientQualifiedRole is on the wire
     */
    public boolean clientQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderAcknowledgmentV2ReturnBitfield10Present() && orderAcknowledgmentV2ReturnBitfield10.orderAcknowledgmentV2ReturnBitfield10ClientQualifiedRole());
    }

    /**
     * Returns whether the fields before the ClientId put it on the wire.
     *
     * <p>Decode reads the ClientId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientId is on the wire
     */
    public boolean clientIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderAcknowledgmentV2ReturnBitfield11Present() && orderAcknowledgmentV2ReturnBitfield11.orderAcknowledgmentV2ReturnBitfield11ClientId());
    }

    /**
     * Returns whether the fields before the InvestorId put it on the wire.
     *
     * <p>Decode reads the InvestorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorId is on the wire
     */
    public boolean investorIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderAcknowledgmentV2ReturnBitfield11Present() && orderAcknowledgmentV2ReturnBitfield11.orderAcknowledgmentV2ReturnBitfield11InvestorId());
    }

    /**
     * Returns whether the fields before the ExecutorId put it on the wire.
     *
     * <p>Decode reads the ExecutorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorId is on the wire
     */
    public boolean executorIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderAcknowledgmentV2ReturnBitfield11Present() && orderAcknowledgmentV2ReturnBitfield11.orderAcknowledgmentV2ReturnBitfield11ExecutorId());
    }

    /**
     * Returns whether the fields before the OrderOrigination put it on the wire.
     *
     * <p>Decode reads the OrderOrigination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigination is on the wire
     */
    public boolean orderOriginationPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderAcknowledgmentV2ReturnBitfield11Present() && orderAcknowledgmentV2ReturnBitfield11.orderAcknowledgmentV2ReturnBitfield11OrderOrigination());
    }

    /**
     * Returns whether the fields before the AlgorithmicIndicator put it on the wire.
     *
     * <p>Decode reads the AlgorithmicIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AlgorithmicIndicator is on the wire
     */
    public boolean algorithmicIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderAcknowledgmentV2ReturnBitfield11Present() && orderAcknowledgmentV2ReturnBitfield11.orderAcknowledgmentV2ReturnBitfield11AlgorithmicIndicator());
    }

    /**
     * Returns whether the fields before the InvestorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the InvestorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorQualifiedRole is on the wire
     */
    public boolean investorQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderAcknowledgmentV2ReturnBitfield11Present() && orderAcknowledgmentV2ReturnBitfield11.orderAcknowledgmentV2ReturnBitfield11InvestorQualifiedRole());
    }

    /**
     * Returns whether the fields before the ExecutorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ExecutorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorQualifiedRole is on the wire
     */
    public boolean executorQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderAcknowledgmentV2ReturnBitfield11Present() && orderAcknowledgmentV2ReturnBitfield11.orderAcknowledgmentV2ReturnBitfield11ExecutorQualifiedRole());
    }

    /**
     * Returns whether the fields before the DrillThruProtection put it on the wire.
     *
     * <p>Decode reads the DrillThruProtection where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DrillThruProtection is on the wire
     */
    public boolean drillThruProtectionPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (orderAcknowledgmentV2ReturnBitfield13Present() && orderAcknowledgmentV2ReturnBitfield13.orderAcknowledgmentV2ReturnBitfield13DrillThruProtection());
    }

    /**
     * Returns whether the fields before the CustOrderHandlingInst put it on the wire.
     *
     * <p>Decode reads the CustOrderHandlingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CustOrderHandlingInst is on the wire
     */
    public boolean custOrderHandlingInstPresent() {
        return (numberOfReturnBitfields.value() >= 17L) && (orderAcknowledgmentV2ReturnBitfield17Present() && orderAcknowledgmentV2ReturnBitfield17.orderAcknowledgmentV2ReturnBitfield17CustOrderHandlingInst());
    }

    /**
     * Returns whether the fields before the AccountType put it on the wire.
     *
     * <p>Decode reads the AccountType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AccountType is on the wire
     */
    public boolean accountTypePresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (orderAcknowledgmentV2ReturnBitfield18Present() && orderAcknowledgmentV2ReturnBitfield18.orderAcknowledgmentV2ReturnBitfield18AccountType());
    }

    private boolean onWire(Field field) {
        return (field != orderAcknowledgmentV2ReturnBitfield1 || orderAcknowledgmentV2ReturnBitfield1Present()) && (field != orderAcknowledgmentV2ReturnBitfield2 || orderAcknowledgmentV2ReturnBitfield2Present()) && (field != orderAcknowledgmentV2ReturnBitfield3 || orderAcknowledgmentV2ReturnBitfield3Present()) && (field != orderAcknowledgmentV2ReturnBitfield4 || orderAcknowledgmentV2ReturnBitfield4Present()) && (field != orderAcknowledgmentV2ReturnBitfield5 || orderAcknowledgmentV2ReturnBitfield5Present()) && (field != orderAcknowledgmentV2ReturnBitfield6 || orderAcknowledgmentV2ReturnBitfield6Present()) && (field != orderAcknowledgmentV2ReturnBitfield7 || orderAcknowledgmentV2ReturnBitfield7Present()) && (field != orderAcknowledgmentV2ReturnBitfield8 || orderAcknowledgmentV2ReturnBitfield8Present()) && (field != orderAcknowledgmentV2ReturnBitfield9 || orderAcknowledgmentV2ReturnBitfield9Present()) && (field != orderAcknowledgmentV2ReturnBitfield10 || orderAcknowledgmentV2ReturnBitfield10Present()) && (field != orderAcknowledgmentV2ReturnBitfield11 || orderAcknowledgmentV2ReturnBitfield11Present()) && (field != orderAcknowledgmentV2ReturnBitfield12 || orderAcknowledgmentV2ReturnBitfield12Present()) && (field != orderAcknowledgmentV2ReturnBitfield13 || orderAcknowledgmentV2ReturnBitfield13Present()) && (field != orderAcknowledgmentV2ReturnBitfield14 || orderAcknowledgmentV2ReturnBitfield14Present()) && (field != orderAcknowledgmentV2ReturnBitfield15 || orderAcknowledgmentV2ReturnBitfield15Present()) && (field != orderAcknowledgmentV2ReturnBitfield16 || orderAcknowledgmentV2ReturnBitfield16Present()) && (field != orderAcknowledgmentV2ReturnBitfield17 || orderAcknowledgmentV2ReturnBitfield17Present()) && (field != orderAcknowledgmentV2ReturnBitfield18 || orderAcknowledgmentV2ReturnBitfield18Present()) && (field != orderAcknowledgmentV2ReturnBitfield19 || orderAcknowledgmentV2ReturnBitfield19Present()) && (field != side || sidePresent()) && (field != price || pricePresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != displayIndicator || displayIndicatorPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != openClose || openClosePresent()) && (field != origClOrdId || origClOrdIdPresent()) && (field != leavesQty || leavesQtyPresent()) && (field != lastShares || lastSharesPresent()) && (field != lastPxBinaryPrice || lastPxBinaryPricePresent()) && (field != displayPrice || displayPricePresent()) && (field != workingPrice || workingPricePresent()) && (field != baseLiquidityIndicator || baseLiquidityIndicatorPresent()) && (field != expireTime || expireTimePresent()) && (field != secondaryOrderId || secondaryOrderIdPresent()) && (field != extExecInst || extExecInstPresent()) && (field != subLiquidityIndicator || subLiquidityIndicatorPresent()) && (field != stopPx || stopPxPresent()) && (field != routingInst || routingInstPresent()) && (field != auctionId || auctionIdPresent()) && (field != liquidityProvision || liquidityProvisionPresent()) && (field != clientQualifiedRole || clientQualifiedRolePresent()) && (field != clientId || clientIdPresent()) && (field != investorId || investorIdPresent()) && (field != executorId || executorIdPresent()) && (field != orderOrigination || orderOriginationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent()) && (field != investorQualifiedRole || investorQualifiedRolePresent()) && (field != executorQualifiedRole || executorQualifiedRolePresent()) && (field != drillThruProtection || drillThruProtectionPresent()) && (field != custOrderHandlingInst || custOrderHandlingInstPresent()) && (field != accountType || accountTypePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderAcknowledgmentV2ReturnBitfield1Present() ? OrderAcknowledgmentV2ReturnBitfield1Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield2Present() ? OrderAcknowledgmentV2ReturnBitfield2Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield3Present() ? OrderAcknowledgmentV2ReturnBitfield3Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield4Present() ? OrderAcknowledgmentV2ReturnBitfield4Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield5Present() ? OrderAcknowledgmentV2ReturnBitfield5Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield6Present() ? OrderAcknowledgmentV2ReturnBitfield6Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield7Present() ? OrderAcknowledgmentV2ReturnBitfield7Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield8Present() ? OrderAcknowledgmentV2ReturnBitfield8Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield9Present() ? OrderAcknowledgmentV2ReturnBitfield9Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield10Present() ? OrderAcknowledgmentV2ReturnBitfield10Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield11Present() ? OrderAcknowledgmentV2ReturnBitfield11Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield12Present() ? OrderAcknowledgmentV2ReturnBitfield12Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield13Present() ? OrderAcknowledgmentV2ReturnBitfield13Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield14Present() ? OrderAcknowledgmentV2ReturnBitfield14Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield15Present() ? OrderAcknowledgmentV2ReturnBitfield15Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield16Present() ? OrderAcknowledgmentV2ReturnBitfield16Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield17Present() ? OrderAcknowledgmentV2ReturnBitfield17Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield18Present() ? OrderAcknowledgmentV2ReturnBitfield18Field.BYTE_LENGTH : 0) + (orderAcknowledgmentV2ReturnBitfield19Present() ? OrderAcknowledgmentV2ReturnBitfield19Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField2.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (displayIndicatorPresent() ? DisplayIndicatorField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (origClOrdIdPresent() ? OrigClOrdIdField.BYTE_LENGTH : 0) + (leavesQtyPresent() ? LeavesQtyField.BYTE_LENGTH : 0) + (lastSharesPresent() ? LastSharesField.BYTE_LENGTH : 0) + (lastPxBinaryPricePresent() ? LastPxBinaryPriceField.BYTE_LENGTH : 0) + (displayPricePresent() ? DisplayPriceField.BYTE_LENGTH : 0) + (workingPricePresent() ? WorkingPriceField.BYTE_LENGTH : 0) + (baseLiquidityIndicatorPresent() ? BaseLiquidityIndicatorField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (secondaryOrderIdPresent() ? SecondaryOrderIdField.BYTE_LENGTH : 0) + (extExecInstPresent() ? ExtExecInstField.BYTE_LENGTH : 0) + (subLiquidityIndicatorPresent() ? SubLiquidityIndicatorField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (routingInstPresent() ? RoutingInstField.BYTE_LENGTH : 0) + (auctionIdPresent() ? AuctionIdField.BYTE_LENGTH : 0) + (liquidityProvisionPresent() ? LiquidityProvisionField.BYTE_LENGTH : 0) + (clientQualifiedRolePresent() ? ClientQualifiedRoleField.BYTE_LENGTH : 0) + (clientIdPresent() ? ClientIdField.BYTE_LENGTH : 0) + (investorIdPresent() ? InvestorIdField.BYTE_LENGTH : 0) + (executorIdPresent() ? ExecutorIdField.BYTE_LENGTH : 0) + (orderOriginationPresent() ? OrderOriginationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0) + (investorQualifiedRolePresent() ? InvestorQualifiedRoleField.BYTE_LENGTH : 0) + (executorQualifiedRolePresent() ? ExecutorQualifiedRoleField.BYTE_LENGTH : 0) + (drillThruProtectionPresent() ? DrillThruProtectionField.BYTE_LENGTH : 0) + (custOrderHandlingInstPresent() ? CustOrderHandlingInstField.BYTE_LENGTH : 0) + (accountTypePresent() ? AccountTypeField.BYTE_LENGTH : 0);
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 8;
        cursor += 20;
        cursor += 8;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (orderAcknowledgmentV2ReturnBitfield1Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield2Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield3Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield4Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield5Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield6Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield7Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield8Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield9Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield10Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield11Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield12Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield13Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield14Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield15Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield16Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield17Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield18Present()) {
            cursor += 1;
        }
        if (orderAcknowledgmentV2ReturnBitfield19Present()) {
            cursor += 1;
        }
        if (sidePresent()) {
            cursor += 1;
        }
        if (pricePresent()) {
            cursor += 8;
        }
        if (ordTypePresent()) {
            cursor += 1;
        }
        if (timeInForcePresent()) {
            cursor += 1;
        }
        if (minQtyPresent()) {
            cursor += 4;
        }
        if (symbolAlphanumericPresent()) {
            cursor += 8;
        }
        if (idSourcePresent()) {
            cursor += 1;
        }
        if (securityIdPresent()) {
            cursor += 16;
        }
        if (capacityPresent()) {
            cursor += 1;
        }
        if (accountPresent()) {
            cursor += 16;
        }
        if (clearingFirmPresent()) {
            cursor += 4;
        }
        if (clearingAccountPresent()) {
            cursor += 4;
        }
        if (displayIndicatorPresent()) {
            cursor += 1;
        }
        if (orderQtyPresent()) {
            cursor += 4;
        }
        if (preventMatchPresent()) {
            cursor += 3;
        }
        if (openClosePresent()) {
            cursor += 1;
        }
        if (origClOrdIdPresent()) {
            cursor += 20;
        }
        if (leavesQtyPresent()) {
            cursor += 4;
        }
        if (lastSharesPresent()) {
            cursor += 4;
        }
        if (lastPxBinaryPricePresent()) {
            cursor += 8;
        }
        if (displayPricePresent()) {
            cursor += 8;
        }
        if (workingPricePresent()) {
            cursor += 8;
        }
        if (baseLiquidityIndicatorPresent()) {
            cursor += 1;
        }
        if (expireTimePresent()) {
            cursor += 8;
        }
        if (secondaryOrderIdPresent()) {
            cursor += 8;
        }
        if (extExecInstPresent()) {
            cursor += 1;
        }
        if (subLiquidityIndicatorPresent()) {
            cursor += 1;
        }
        if (stopPxPresent()) {
            cursor += 8;
        }
        if (routingInstPresent()) {
            cursor += 4;
        }
        if (auctionIdPresent()) {
            cursor += 8;
        }
        if (liquidityProvisionPresent()) {
            cursor += 1;
        }
        if (clientQualifiedRolePresent()) {
            cursor += 1;
        }
        if (clientIdPresent()) {
            cursor += 4;
        }
        if (investorIdPresent()) {
            cursor += 4;
        }
        if (executorIdPresent()) {
            cursor += 4;
        }
        if (orderOriginationPresent()) {
            cursor += 1;
        }
        if (algorithmicIndicatorPresent()) {
            cursor += 1;
        }
        if (investorQualifiedRolePresent()) {
            cursor += 1;
        }
        if (executorQualifiedRolePresent()) {
            cursor += 1;
        }
        if (drillThruProtectionPresent()) {
            cursor += 8;
        }
        if (custOrderHandlingInstPresent()) {
            cursor += 1;
        }
        if (accountTypePresent()) {
            cursor += 1;
        }
        return cursor;
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
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
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (orderAcknowledgmentV2ReturnBitfield1Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield1Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield2Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield2Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield3Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield3Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield4Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield4Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield5Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield5Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield6Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield6Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield7Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield7Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield8Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield8Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield9Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield9Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield10Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield10Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield11Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield11Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield12Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield12Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield13Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield13Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield14Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield14Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield15Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield15Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield16Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield16Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield17Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield17Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield18Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield18Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderAcknowledgmentV2ReturnBitfield19Present()) {
            if (end - cursor < OrderAcknowledgmentV2ReturnBitfield19Field.BYTE_LENGTH || !orderAcknowledgmentV2ReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += OrderAcknowledgmentV2ReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (sidePresent()) {
            if (end - cursor < SideField.BYTE_LENGTH || !side.parse(data, cursor)) {
                return false;
            }
            cursor += SideField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (pricePresent()) {
            if (end - cursor < PriceField.BYTE_LENGTH || !price.parse(data, cursor)) {
                return false;
            }
            cursor += PriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (ordTypePresent()) {
            if (end - cursor < OrdTypeField.BYTE_LENGTH || !ordType.parse(data, cursor)) {
                return false;
            }
            cursor += OrdTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (timeInForcePresent()) {
            if (end - cursor < TimeInForceField.BYTE_LENGTH || !timeInForce.parse(data, cursor)) {
                return false;
            }
            cursor += TimeInForceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (minQtyPresent()) {
            if (end - cursor < MinQtyField.BYTE_LENGTH || !minQty.parse(data, cursor)) {
                return false;
            }
            cursor += MinQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (symbolAlphanumericPresent()) {
            if (end - cursor < SymbolAlphanumericField2.BYTE_LENGTH || !symbolAlphanumeric.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolAlphanumericField2.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (idSourcePresent()) {
            if (end - cursor < IdSourceField.BYTE_LENGTH || !idSource.parse(data, cursor)) {
                return false;
            }
            cursor += IdSourceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (securityIdPresent()) {
            if (end - cursor < SecurityIdField.BYTE_LENGTH || !securityId.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (capacityPresent()) {
            if (end - cursor < CapacityField.BYTE_LENGTH || !capacity.parse(data, cursor)) {
                return false;
            }
            cursor += CapacityField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (accountPresent()) {
            if (end - cursor < AccountField.BYTE_LENGTH || !account.parse(data, cursor)) {
                return false;
            }
            cursor += AccountField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingFirmPresent()) {
            if (end - cursor < ClearingFirmField.BYTE_LENGTH || !clearingFirm.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingAccountPresent()) {
            if (end - cursor < ClearingAccountField.BYTE_LENGTH || !clearingAccount.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingAccountField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (displayIndicatorPresent()) {
            if (end - cursor < DisplayIndicatorField.BYTE_LENGTH || !displayIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += DisplayIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderQtyPresent()) {
            if (end - cursor < OrderQtyField.BYTE_LENGTH || !orderQty.parse(data, cursor)) {
                return false;
            }
            cursor += OrderQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (preventMatchPresent()) {
            if (end - cursor < PreventMatchField.BYTE_LENGTH || !preventMatch.parse(data, cursor)) {
                return false;
            }
            cursor += PreventMatchField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (openClosePresent()) {
            if (end - cursor < OpenCloseField.BYTE_LENGTH || !openClose.parse(data, cursor)) {
                return false;
            }
            cursor += OpenCloseField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (origClOrdIdPresent()) {
            if (end - cursor < OrigClOrdIdField.BYTE_LENGTH || !origClOrdId.parse(data, cursor)) {
                return false;
            }
            cursor += OrigClOrdIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (leavesQtyPresent()) {
            if (end - cursor < LeavesQtyField.BYTE_LENGTH || !leavesQty.parse(data, cursor)) {
                return false;
            }
            cursor += LeavesQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (lastSharesPresent()) {
            if (end - cursor < LastSharesField.BYTE_LENGTH || !lastShares.parse(data, cursor)) {
                return false;
            }
            cursor += LastSharesField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (lastPxBinaryPricePresent()) {
            if (end - cursor < LastPxBinaryPriceField.BYTE_LENGTH || !lastPxBinaryPrice.parse(data, cursor)) {
                return false;
            }
            cursor += LastPxBinaryPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (displayPricePresent()) {
            if (end - cursor < DisplayPriceField.BYTE_LENGTH || !displayPrice.parse(data, cursor)) {
                return false;
            }
            cursor += DisplayPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (workingPricePresent()) {
            if (end - cursor < WorkingPriceField.BYTE_LENGTH || !workingPrice.parse(data, cursor)) {
                return false;
            }
            cursor += WorkingPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (baseLiquidityIndicatorPresent()) {
            if (end - cursor < BaseLiquidityIndicatorField.BYTE_LENGTH || !baseLiquidityIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (expireTimePresent()) {
            if (end - cursor < ExpireTimeField.BYTE_LENGTH || !expireTime.parse(data, cursor)) {
                return false;
            }
            cursor += ExpireTimeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (secondaryOrderIdPresent()) {
            if (end - cursor < SecondaryOrderIdField.BYTE_LENGTH || !secondaryOrderId.parse(data, cursor)) {
                return false;
            }
            cursor += SecondaryOrderIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (extExecInstPresent()) {
            if (end - cursor < ExtExecInstField.BYTE_LENGTH || !extExecInst.parse(data, cursor)) {
                return false;
            }
            cursor += ExtExecInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (subLiquidityIndicatorPresent()) {
            if (end - cursor < SubLiquidityIndicatorField.BYTE_LENGTH || !subLiquidityIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += SubLiquidityIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (stopPxPresent()) {
            if (end - cursor < StopPxField.BYTE_LENGTH || !stopPx.parse(data, cursor)) {
                return false;
            }
            cursor += StopPxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (routingInstPresent()) {
            if (end - cursor < RoutingInstField.BYTE_LENGTH || !routingInst.parse(data, cursor)) {
                return false;
            }
            cursor += RoutingInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (auctionIdPresent()) {
            if (end - cursor < AuctionIdField.BYTE_LENGTH || !auctionId.parse(data, cursor)) {
                return false;
            }
            cursor += AuctionIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (liquidityProvisionPresent()) {
            if (end - cursor < LiquidityProvisionField.BYTE_LENGTH || !liquidityProvision.parse(data, cursor)) {
                return false;
            }
            cursor += LiquidityProvisionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clientQualifiedRolePresent()) {
            if (end - cursor < ClientQualifiedRoleField.BYTE_LENGTH || !clientQualifiedRole.parse(data, cursor)) {
                return false;
            }
            cursor += ClientQualifiedRoleField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clientIdPresent()) {
            if (end - cursor < ClientIdField.BYTE_LENGTH || !clientId.parse(data, cursor)) {
                return false;
            }
            cursor += ClientIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (investorIdPresent()) {
            if (end - cursor < InvestorIdField.BYTE_LENGTH || !investorId.parse(data, cursor)) {
                return false;
            }
            cursor += InvestorIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (executorIdPresent()) {
            if (end - cursor < ExecutorIdField.BYTE_LENGTH || !executorId.parse(data, cursor)) {
                return false;
            }
            cursor += ExecutorIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderOriginationPresent()) {
            if (end - cursor < OrderOriginationField.BYTE_LENGTH || !orderOrigination.parse(data, cursor)) {
                return false;
            }
            cursor += OrderOriginationField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (algorithmicIndicatorPresent()) {
            if (end - cursor < AlgorithmicIndicatorField.BYTE_LENGTH || !algorithmicIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += AlgorithmicIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (investorQualifiedRolePresent()) {
            if (end - cursor < InvestorQualifiedRoleField.BYTE_LENGTH || !investorQualifiedRole.parse(data, cursor)) {
                return false;
            }
            cursor += InvestorQualifiedRoleField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (executorQualifiedRolePresent()) {
            if (end - cursor < ExecutorQualifiedRoleField.BYTE_LENGTH || !executorQualifiedRole.parse(data, cursor)) {
                return false;
            }
            cursor += ExecutorQualifiedRoleField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (drillThruProtectionPresent()) {
            if (end - cursor < DrillThruProtectionField.BYTE_LENGTH || !drillThruProtection.parse(data, cursor)) {
                return false;
            }
            cursor += DrillThruProtectionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (custOrderHandlingInstPresent()) {
            if (end - cursor < CustOrderHandlingInstField.BYTE_LENGTH || !custOrderHandlingInst.parse(data, cursor)) {
                return false;
            }
            cursor += CustOrderHandlingInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (accountTypePresent()) {
            if (end - cursor < AccountTypeField.BYTE_LENGTH || !accountType.parse(data, cursor)) {
                return false;
            }
            cursor += AccountTypeField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (orderAcknowledgmentV2ReturnBitfield1Present() != orderAcknowledgmentV2ReturnBitfield1.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield1.hasValue() ? "orderAcknowledgmentV2ReturnBitfield1 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield2Present() != orderAcknowledgmentV2ReturnBitfield2.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield2.hasValue() ? "orderAcknowledgmentV2ReturnBitfield2 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield3Present() != orderAcknowledgmentV2ReturnBitfield3.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield3.hasValue() ? "orderAcknowledgmentV2ReturnBitfield3 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield4Present() != orderAcknowledgmentV2ReturnBitfield4.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield4.hasValue() ? "orderAcknowledgmentV2ReturnBitfield4 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield5Present() != orderAcknowledgmentV2ReturnBitfield5.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield5.hasValue() ? "orderAcknowledgmentV2ReturnBitfield5 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield6Present() != orderAcknowledgmentV2ReturnBitfield6.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield6.hasValue() ? "orderAcknowledgmentV2ReturnBitfield6 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield7Present() != orderAcknowledgmentV2ReturnBitfield7.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield7.hasValue() ? "orderAcknowledgmentV2ReturnBitfield7 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield8Present() != orderAcknowledgmentV2ReturnBitfield8.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield8.hasValue() ? "orderAcknowledgmentV2ReturnBitfield8 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield9Present() != orderAcknowledgmentV2ReturnBitfield9.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield9.hasValue() ? "orderAcknowledgmentV2ReturnBitfield9 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield10Present() != orderAcknowledgmentV2ReturnBitfield10.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield10.hasValue() ? "orderAcknowledgmentV2ReturnBitfield10 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield11Present() != orderAcknowledgmentV2ReturnBitfield11.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield11.hasValue() ? "orderAcknowledgmentV2ReturnBitfield11 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield12Present() != orderAcknowledgmentV2ReturnBitfield12.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield12.hasValue() ? "orderAcknowledgmentV2ReturnBitfield12 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield13Present() != orderAcknowledgmentV2ReturnBitfield13.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield13.hasValue() ? "orderAcknowledgmentV2ReturnBitfield13 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield14Present() != orderAcknowledgmentV2ReturnBitfield14.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield14.hasValue() ? "orderAcknowledgmentV2ReturnBitfield14 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield15Present() != orderAcknowledgmentV2ReturnBitfield15.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield15.hasValue() ? "orderAcknowledgmentV2ReturnBitfield15 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield16Present() != orderAcknowledgmentV2ReturnBitfield16.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield16.hasValue() ? "orderAcknowledgmentV2ReturnBitfield16 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield17Present() != orderAcknowledgmentV2ReturnBitfield17.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield17.hasValue() ? "orderAcknowledgmentV2ReturnBitfield17 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield18Present() != orderAcknowledgmentV2ReturnBitfield18.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield18.hasValue() ? "orderAcknowledgmentV2ReturnBitfield18 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (orderAcknowledgmentV2ReturnBitfield19Present() != orderAcknowledgmentV2ReturnBitfield19.hasValue()) {
            throw new IllegalStateException(orderAcknowledgmentV2ReturnBitfield19.hasValue() ? "orderAcknowledgmentV2ReturnBitfield19 holds a value the fields before it leave off the wire" : "orderAcknowledgmentV2ReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (sidePresent() != side.hasValue()) {
            throw new IllegalStateException(side.hasValue() ? "side holds a value the fields before it leave off the wire" : "side holds no value, though the fields before it put it on the wire");
        }
        if (pricePresent() != price.hasValue()) {
            throw new IllegalStateException(price.hasValue() ? "price holds a value the fields before it leave off the wire" : "price holds no value, though the fields before it put it on the wire");
        }
        if (ordTypePresent() != ordType.hasValue()) {
            throw new IllegalStateException(ordType.hasValue() ? "ordType holds a value the fields before it leave off the wire" : "ordType holds no value, though the fields before it put it on the wire");
        }
        if (timeInForcePresent() != timeInForce.hasValue()) {
            throw new IllegalStateException(timeInForce.hasValue() ? "timeInForce holds a value the fields before it leave off the wire" : "timeInForce holds no value, though the fields before it put it on the wire");
        }
        if (minQtyPresent() != minQty.hasValue()) {
            throw new IllegalStateException(minQty.hasValue() ? "minQty holds a value the fields before it leave off the wire" : "minQty holds no value, though the fields before it put it on the wire");
        }
        if (symbolAlphanumericPresent() != symbolAlphanumeric.hasValue()) {
            throw new IllegalStateException(symbolAlphanumeric.hasValue() ? "symbolAlphanumeric holds a value the fields before it leave off the wire" : "symbolAlphanumeric holds no value, though the fields before it put it on the wire");
        }
        if (idSourcePresent() != idSource.hasValue()) {
            throw new IllegalStateException(idSource.hasValue() ? "idSource holds a value the fields before it leave off the wire" : "idSource holds no value, though the fields before it put it on the wire");
        }
        if (securityIdPresent() != securityId.hasValue()) {
            throw new IllegalStateException(securityId.hasValue() ? "securityId holds a value the fields before it leave off the wire" : "securityId holds no value, though the fields before it put it on the wire");
        }
        if (capacityPresent() != capacity.hasValue()) {
            throw new IllegalStateException(capacity.hasValue() ? "capacity holds a value the fields before it leave off the wire" : "capacity holds no value, though the fields before it put it on the wire");
        }
        if (accountPresent() != account.hasValue()) {
            throw new IllegalStateException(account.hasValue() ? "account holds a value the fields before it leave off the wire" : "account holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (clearingAccountPresent() != clearingAccount.hasValue()) {
            throw new IllegalStateException(clearingAccount.hasValue() ? "clearingAccount holds a value the fields before it leave off the wire" : "clearingAccount holds no value, though the fields before it put it on the wire");
        }
        if (displayIndicatorPresent() != displayIndicator.hasValue()) {
            throw new IllegalStateException(displayIndicator.hasValue() ? "displayIndicator holds a value the fields before it leave off the wire" : "displayIndicator holds no value, though the fields before it put it on the wire");
        }
        if (orderQtyPresent() != orderQty.hasValue()) {
            throw new IllegalStateException(orderQty.hasValue() ? "orderQty holds a value the fields before it leave off the wire" : "orderQty holds no value, though the fields before it put it on the wire");
        }
        if (preventMatchPresent() != preventMatch.hasValue()) {
            throw new IllegalStateException(preventMatch.hasValue() ? "preventMatch holds a value the fields before it leave off the wire" : "preventMatch holds no value, though the fields before it put it on the wire");
        }
        if (openClosePresent() != openClose.hasValue()) {
            throw new IllegalStateException(openClose.hasValue() ? "openClose holds a value the fields before it leave off the wire" : "openClose holds no value, though the fields before it put it on the wire");
        }
        if (origClOrdIdPresent() != origClOrdId.hasValue()) {
            throw new IllegalStateException(origClOrdId.hasValue() ? "origClOrdId holds a value the fields before it leave off the wire" : "origClOrdId holds no value, though the fields before it put it on the wire");
        }
        if (leavesQtyPresent() != leavesQty.hasValue()) {
            throw new IllegalStateException(leavesQty.hasValue() ? "leavesQty holds a value the fields before it leave off the wire" : "leavesQty holds no value, though the fields before it put it on the wire");
        }
        if (lastSharesPresent() != lastShares.hasValue()) {
            throw new IllegalStateException(lastShares.hasValue() ? "lastShares holds a value the fields before it leave off the wire" : "lastShares holds no value, though the fields before it put it on the wire");
        }
        if (lastPxBinaryPricePresent() != lastPxBinaryPrice.hasValue()) {
            throw new IllegalStateException(lastPxBinaryPrice.hasValue() ? "lastPxBinaryPrice holds a value the fields before it leave off the wire" : "lastPxBinaryPrice holds no value, though the fields before it put it on the wire");
        }
        if (displayPricePresent() != displayPrice.hasValue()) {
            throw new IllegalStateException(displayPrice.hasValue() ? "displayPrice holds a value the fields before it leave off the wire" : "displayPrice holds no value, though the fields before it put it on the wire");
        }
        if (workingPricePresent() != workingPrice.hasValue()) {
            throw new IllegalStateException(workingPrice.hasValue() ? "workingPrice holds a value the fields before it leave off the wire" : "workingPrice holds no value, though the fields before it put it on the wire");
        }
        if (baseLiquidityIndicatorPresent() != baseLiquidityIndicator.hasValue()) {
            throw new IllegalStateException(baseLiquidityIndicator.hasValue() ? "baseLiquidityIndicator holds a value the fields before it leave off the wire" : "baseLiquidityIndicator holds no value, though the fields before it put it on the wire");
        }
        if (expireTimePresent() != expireTime.hasValue()) {
            throw new IllegalStateException(expireTime.hasValue() ? "expireTime holds a value the fields before it leave off the wire" : "expireTime holds no value, though the fields before it put it on the wire");
        }
        if (secondaryOrderIdPresent() != secondaryOrderId.hasValue()) {
            throw new IllegalStateException(secondaryOrderId.hasValue() ? "secondaryOrderId holds a value the fields before it leave off the wire" : "secondaryOrderId holds no value, though the fields before it put it on the wire");
        }
        if (extExecInstPresent() != extExecInst.hasValue()) {
            throw new IllegalStateException(extExecInst.hasValue() ? "extExecInst holds a value the fields before it leave off the wire" : "extExecInst holds no value, though the fields before it put it on the wire");
        }
        if (subLiquidityIndicatorPresent() != subLiquidityIndicator.hasValue()) {
            throw new IllegalStateException(subLiquidityIndicator.hasValue() ? "subLiquidityIndicator holds a value the fields before it leave off the wire" : "subLiquidityIndicator holds no value, though the fields before it put it on the wire");
        }
        if (stopPxPresent() != stopPx.hasValue()) {
            throw new IllegalStateException(stopPx.hasValue() ? "stopPx holds a value the fields before it leave off the wire" : "stopPx holds no value, though the fields before it put it on the wire");
        }
        if (routingInstPresent() != routingInst.hasValue()) {
            throw new IllegalStateException(routingInst.hasValue() ? "routingInst holds a value the fields before it leave off the wire" : "routingInst holds no value, though the fields before it put it on the wire");
        }
        if (auctionIdPresent() != auctionId.hasValue()) {
            throw new IllegalStateException(auctionId.hasValue() ? "auctionId holds a value the fields before it leave off the wire" : "auctionId holds no value, though the fields before it put it on the wire");
        }
        if (liquidityProvisionPresent() != liquidityProvision.hasValue()) {
            throw new IllegalStateException(liquidityProvision.hasValue() ? "liquidityProvision holds a value the fields before it leave off the wire" : "liquidityProvision holds no value, though the fields before it put it on the wire");
        }
        if (clientQualifiedRolePresent() != clientQualifiedRole.hasValue()) {
            throw new IllegalStateException(clientQualifiedRole.hasValue() ? "clientQualifiedRole holds a value the fields before it leave off the wire" : "clientQualifiedRole holds no value, though the fields before it put it on the wire");
        }
        if (clientIdPresent() != clientId.hasValue()) {
            throw new IllegalStateException(clientId.hasValue() ? "clientId holds a value the fields before it leave off the wire" : "clientId holds no value, though the fields before it put it on the wire");
        }
        if (investorIdPresent() != investorId.hasValue()) {
            throw new IllegalStateException(investorId.hasValue() ? "investorId holds a value the fields before it leave off the wire" : "investorId holds no value, though the fields before it put it on the wire");
        }
        if (executorIdPresent() != executorId.hasValue()) {
            throw new IllegalStateException(executorId.hasValue() ? "executorId holds a value the fields before it leave off the wire" : "executorId holds no value, though the fields before it put it on the wire");
        }
        if (orderOriginationPresent() != orderOrigination.hasValue()) {
            throw new IllegalStateException(orderOrigination.hasValue() ? "orderOrigination holds a value the fields before it leave off the wire" : "orderOrigination holds no value, though the fields before it put it on the wire");
        }
        if (algorithmicIndicatorPresent() != algorithmicIndicator.hasValue()) {
            throw new IllegalStateException(algorithmicIndicator.hasValue() ? "algorithmicIndicator holds a value the fields before it leave off the wire" : "algorithmicIndicator holds no value, though the fields before it put it on the wire");
        }
        if (investorQualifiedRolePresent() != investorQualifiedRole.hasValue()) {
            throw new IllegalStateException(investorQualifiedRole.hasValue() ? "investorQualifiedRole holds a value the fields before it leave off the wire" : "investorQualifiedRole holds no value, though the fields before it put it on the wire");
        }
        if (executorQualifiedRolePresent() != executorQualifiedRole.hasValue()) {
            throw new IllegalStateException(executorQualifiedRole.hasValue() ? "executorQualifiedRole holds a value the fields before it leave off the wire" : "executorQualifiedRole holds no value, though the fields before it put it on the wire");
        }
        if (drillThruProtectionPresent() != drillThruProtection.hasValue()) {
            throw new IllegalStateException(drillThruProtection.hasValue() ? "drillThruProtection holds a value the fields before it leave off the wire" : "drillThruProtection holds no value, though the fields before it put it on the wire");
        }
        if (custOrderHandlingInstPresent() != custOrderHandlingInst.hasValue()) {
            throw new IllegalStateException(custOrderHandlingInst.hasValue() ? "custOrderHandlingInst holds a value the fields before it leave off the wire" : "custOrderHandlingInst holds no value, though the fields before it put it on the wire");
        }
        if (accountTypePresent() != accountType.hasValue()) {
            throw new IllegalStateException(accountType.hasValue() ? "accountType holds a value the fields before it leave off the wire" : "accountType holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        if (buffer != null && buffer.length >= 37) {
            System.arraycopy(buffer, 36, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (orderAcknowledgmentV2ReturnBitfield1Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield1.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield2Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield2.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield3Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield3.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield4Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield4.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield5Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield5.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield6Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield6.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield7Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield7.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield8Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield8.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield9Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield9.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield10Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield10.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield11Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield11.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield12Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield12.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield13Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield13.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield14Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield14.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield15Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield15.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield16Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield16.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield17Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield17.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield18Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield18.encode(data, cursor);
        }
        if (orderAcknowledgmentV2ReturnBitfield19Present()) {
            cursor = orderAcknowledgmentV2ReturnBitfield19.encode(data, cursor);
        }
        if (sidePresent()) {
            cursor = side.encode(data, cursor);
        }
        if (pricePresent()) {
            cursor = price.encode(data, cursor);
        }
        if (ordTypePresent()) {
            cursor = ordType.encode(data, cursor);
        }
        if (timeInForcePresent()) {
            cursor = timeInForce.encode(data, cursor);
        }
        if (minQtyPresent()) {
            cursor = minQty.encode(data, cursor);
        }
        if (symbolAlphanumericPresent()) {
            cursor = symbolAlphanumeric.encode(data, cursor);
        }
        if (idSourcePresent()) {
            cursor = idSource.encode(data, cursor);
        }
        if (securityIdPresent()) {
            cursor = securityId.encode(data, cursor);
        }
        if (capacityPresent()) {
            cursor = capacity.encode(data, cursor);
        }
        if (accountPresent()) {
            cursor = account.encode(data, cursor);
        }
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (clearingAccountPresent()) {
            cursor = clearingAccount.encode(data, cursor);
        }
        if (displayIndicatorPresent()) {
            cursor = displayIndicator.encode(data, cursor);
        }
        if (orderQtyPresent()) {
            cursor = orderQty.encode(data, cursor);
        }
        if (preventMatchPresent()) {
            cursor = preventMatch.encode(data, cursor);
        }
        if (openClosePresent()) {
            cursor = openClose.encode(data, cursor);
        }
        if (origClOrdIdPresent()) {
            cursor = origClOrdId.encode(data, cursor);
        }
        if (leavesQtyPresent()) {
            cursor = leavesQty.encode(data, cursor);
        }
        if (lastSharesPresent()) {
            cursor = lastShares.encode(data, cursor);
        }
        if (lastPxBinaryPricePresent()) {
            cursor = lastPxBinaryPrice.encode(data, cursor);
        }
        if (displayPricePresent()) {
            cursor = displayPrice.encode(data, cursor);
        }
        if (workingPricePresent()) {
            cursor = workingPrice.encode(data, cursor);
        }
        if (baseLiquidityIndicatorPresent()) {
            cursor = baseLiquidityIndicator.encode(data, cursor);
        }
        if (expireTimePresent()) {
            cursor = expireTime.encode(data, cursor);
        }
        if (secondaryOrderIdPresent()) {
            cursor = secondaryOrderId.encode(data, cursor);
        }
        if (extExecInstPresent()) {
            cursor = extExecInst.encode(data, cursor);
        }
        if (subLiquidityIndicatorPresent()) {
            cursor = subLiquidityIndicator.encode(data, cursor);
        }
        if (stopPxPresent()) {
            cursor = stopPx.encode(data, cursor);
        }
        if (routingInstPresent()) {
            cursor = routingInst.encode(data, cursor);
        }
        if (auctionIdPresent()) {
            cursor = auctionId.encode(data, cursor);
        }
        if (liquidityProvisionPresent()) {
            cursor = liquidityProvision.encode(data, cursor);
        }
        if (clientQualifiedRolePresent()) {
            cursor = clientQualifiedRole.encode(data, cursor);
        }
        if (clientIdPresent()) {
            cursor = clientId.encode(data, cursor);
        }
        if (investorIdPresent()) {
            cursor = investorId.encode(data, cursor);
        }
        if (executorIdPresent()) {
            cursor = executorId.encode(data, cursor);
        }
        if (orderOriginationPresent()) {
            cursor = orderOrigination.encode(data, cursor);
        }
        if (algorithmicIndicatorPresent()) {
            cursor = algorithmicIndicator.encode(data, cursor);
        }
        if (investorQualifiedRolePresent()) {
            cursor = investorQualifiedRole.encode(data, cursor);
        }
        if (executorQualifiedRolePresent()) {
            cursor = executorQualifiedRole.encode(data, cursor);
        }
        if (drillThruProtectionPresent()) {
            cursor = drillThruProtection.encode(data, cursor);
        }
        if (custOrderHandlingInstPresent()) {
            cursor = custOrderHandlingInst.encode(data, cursor);
        }
        if (accountTypePresent()) {
            cursor = accountType.encode(data, cursor);
        }
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
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
        for (Field field : fields()) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields()) {
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
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "TransactionTime" -> Optional.of(transactionTime);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrderId" -> Optional.of(orderId);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "OrderAcknowledgmentV2ReturnBitfield1" -> Optional.of(orderAcknowledgmentV2ReturnBitfield1);
            case "OrderAcknowledgmentV2ReturnBitfield2" -> Optional.of(orderAcknowledgmentV2ReturnBitfield2);
            case "OrderAcknowledgmentV2ReturnBitfield3" -> Optional.of(orderAcknowledgmentV2ReturnBitfield3);
            case "OrderAcknowledgmentV2ReturnBitfield4" -> Optional.of(orderAcknowledgmentV2ReturnBitfield4);
            case "OrderAcknowledgmentV2ReturnBitfield5" -> Optional.of(orderAcknowledgmentV2ReturnBitfield5);
            case "OrderAcknowledgmentV2ReturnBitfield6" -> Optional.of(orderAcknowledgmentV2ReturnBitfield6);
            case "OrderAcknowledgmentV2ReturnBitfield7" -> Optional.of(orderAcknowledgmentV2ReturnBitfield7);
            case "OrderAcknowledgmentV2ReturnBitfield8" -> Optional.of(orderAcknowledgmentV2ReturnBitfield8);
            case "OrderAcknowledgmentV2ReturnBitfield9" -> Optional.of(orderAcknowledgmentV2ReturnBitfield9);
            case "OrderAcknowledgmentV2ReturnBitfield10" -> Optional.of(orderAcknowledgmentV2ReturnBitfield10);
            case "OrderAcknowledgmentV2ReturnBitfield11" -> Optional.of(orderAcknowledgmentV2ReturnBitfield11);
            case "OrderAcknowledgmentV2ReturnBitfield12" -> Optional.of(orderAcknowledgmentV2ReturnBitfield12);
            case "OrderAcknowledgmentV2ReturnBitfield13" -> Optional.of(orderAcknowledgmentV2ReturnBitfield13);
            case "OrderAcknowledgmentV2ReturnBitfield14" -> Optional.of(orderAcknowledgmentV2ReturnBitfield14);
            case "OrderAcknowledgmentV2ReturnBitfield15" -> Optional.of(orderAcknowledgmentV2ReturnBitfield15);
            case "OrderAcknowledgmentV2ReturnBitfield16" -> Optional.of(orderAcknowledgmentV2ReturnBitfield16);
            case "OrderAcknowledgmentV2ReturnBitfield17" -> Optional.of(orderAcknowledgmentV2ReturnBitfield17);
            case "OrderAcknowledgmentV2ReturnBitfield18" -> Optional.of(orderAcknowledgmentV2ReturnBitfield18);
            case "OrderAcknowledgmentV2ReturnBitfield19" -> Optional.of(orderAcknowledgmentV2ReturnBitfield19);
            case "Side" -> Optional.of(side);
            case "Price" -> Optional.of(price);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "IdSource" -> Optional.of(idSource);
            case "SecurityId" -> Optional.of(securityId);
            case "Capacity" -> Optional.of(capacity);
            case "Account" -> Optional.of(account);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "DisplayIndicator" -> Optional.of(displayIndicator);
            case "OrderQty" -> Optional.of(orderQty);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "OpenClose" -> Optional.of(openClose);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "LastShares" -> Optional.of(lastShares);
            case "LastPxBinaryPrice" -> Optional.of(lastPxBinaryPrice);
            case "DisplayPrice" -> Optional.of(displayPrice);
            case "WorkingPrice" -> Optional.of(workingPrice);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "ExpireTime" -> Optional.of(expireTime);
            case "SecondaryOrderId" -> Optional.of(secondaryOrderId);
            case "ExtExecInst" -> Optional.of(extExecInst);
            case "SubLiquidityIndicator" -> Optional.of(subLiquidityIndicator);
            case "StopPx" -> Optional.of(stopPx);
            case "RoutingInst" -> Optional.of(routingInst);
            case "AuctionId" -> Optional.of(auctionId);
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "ClientQualifiedRole" -> Optional.of(clientQualifiedRole);
            case "ClientId" -> Optional.of(clientId);
            case "InvestorId" -> Optional.of(investorId);
            case "ExecutorId" -> Optional.of(executorId);
            case "OrderOrigination" -> Optional.of(orderOrigination);
            case "AlgorithmicIndicator" -> Optional.of(algorithmicIndicator);
            case "InvestorQualifiedRole" -> Optional.of(investorQualifiedRole);
            case "ExecutorQualifiedRole" -> Optional.of(executorQualifiedRole);
            case "DrillThruProtection" -> Optional.of(drillThruProtection);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "AccountType" -> Optional.of(accountType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderAcknowledgmentV2Message message)) {
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : onWire) {
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
        if (!(other instanceof OrderAcknowledgmentV2Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
