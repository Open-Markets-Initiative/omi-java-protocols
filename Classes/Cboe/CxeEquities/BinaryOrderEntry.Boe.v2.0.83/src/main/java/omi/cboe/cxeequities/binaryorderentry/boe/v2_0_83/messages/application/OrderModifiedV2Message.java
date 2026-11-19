package omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.AccountField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.AlgorithmicIndicatorField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.BaseLiquidityIndicatorField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.ClOrdIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.ClearingAccountField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.ClearingFirmField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.ClientIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.ClientQualifiedRoleField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.DisplayIndicatorField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.DisplayPriceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.ExecInstField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.ExecutorIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.ExecutorQualifiedRoleField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.ExpireTimeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.ExtExecInstField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.InvestorIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.InvestorQualifiedRoleField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.LastPxBinaryPriceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.LastSharesField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.LeavesQtyField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.LiquidityProvisionField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.MaxFloorField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.MinQtyField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrdTypeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield10Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield11Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield12Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield13Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield14Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield15Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield16Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield17Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield18Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield19Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield1Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield2Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield3Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield4Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield5Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield6Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield7Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield8Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderModifiedV2ReturnBitfield9Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderOriginationField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderQtyField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrigClOrdIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.PegDifferenceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.PreventMatchField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.PriceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.SecondaryOrderIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.SideField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TimeInForceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TransactionTimeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.WaiverTypeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.WorkingPriceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.types.Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.types.Message;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.types.PrintOptions;

/**
 * Represents the OrderModifiedV2Message message from the BinaryOrderEntry protocol.
 *
 * <p>Order Modified V2 Message.</p>
 */
public final class OrderModifiedV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 38;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Modified V 2 Message";

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent). Nanosecond precision.
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe (—). A leading tilde (˜) cannot be sent on any ClOrdID and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system-generated ClOrdID. If the ClOrdID matches a live order, the order will be rejected as a duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live or- ders, which includes long-lived persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID val- ues at least day-unique.
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
     * BitSet OrderModifiedV2 byte 1.
     */
    private final OrderModifiedV2ReturnBitfield1Field orderModifiedV2ReturnBitfield1 = new OrderModifiedV2ReturnBitfield1Field();

    /**
     * BitSet OrderModifiedV2 byte 2.
     */
    private final OrderModifiedV2ReturnBitfield2Field orderModifiedV2ReturnBitfield2 = new OrderModifiedV2ReturnBitfield2Field();

    /**
     * BitSet OrderModifiedV2 byte 3.
     */
    private final OrderModifiedV2ReturnBitfield3Field orderModifiedV2ReturnBitfield3 = new OrderModifiedV2ReturnBitfield3Field();

    /**
     * BitSet OrderModifiedV2 byte 4.
     */
    private final OrderModifiedV2ReturnBitfield4Field orderModifiedV2ReturnBitfield4 = new OrderModifiedV2ReturnBitfield4Field();

    /**
     * BitSet OrderModifiedV2 byte 5.
     */
    private final OrderModifiedV2ReturnBitfield5Field orderModifiedV2ReturnBitfield5 = new OrderModifiedV2ReturnBitfield5Field();

    /**
     * BitSet OrderModifiedV2 byte 6.
     */
    private final OrderModifiedV2ReturnBitfield6Field orderModifiedV2ReturnBitfield6 = new OrderModifiedV2ReturnBitfield6Field();

    /**
     * BitSet OrderModifiedV2 byte 7.
     */
    private final OrderModifiedV2ReturnBitfield7Field orderModifiedV2ReturnBitfield7 = new OrderModifiedV2ReturnBitfield7Field();

    /**
     * BitSet OrderModifiedV2 byte 8.
     */
    private final OrderModifiedV2ReturnBitfield8Field orderModifiedV2ReturnBitfield8 = new OrderModifiedV2ReturnBitfield8Field();

    /**
     * BitSet OrderModifiedV2 byte 9.
     */
    private final OrderModifiedV2ReturnBitfield9Field orderModifiedV2ReturnBitfield9 = new OrderModifiedV2ReturnBitfield9Field();

    /**
     * BitSet OrderModifiedV2 byte 10.
     */
    private final OrderModifiedV2ReturnBitfield10Field orderModifiedV2ReturnBitfield10 = new OrderModifiedV2ReturnBitfield10Field();

    /**
     * BitSet OrderModifiedV2 byte 11.
     */
    private final OrderModifiedV2ReturnBitfield11Field orderModifiedV2ReturnBitfield11 = new OrderModifiedV2ReturnBitfield11Field();

    /**
     * BitSet OrderModifiedV2 byte 12.
     */
    private final OrderModifiedV2ReturnBitfield12Field orderModifiedV2ReturnBitfield12 = new OrderModifiedV2ReturnBitfield12Field();

    /**
     * BitSet OrderModifiedV2 byte 13.
     */
    private final OrderModifiedV2ReturnBitfield13Field orderModifiedV2ReturnBitfield13 = new OrderModifiedV2ReturnBitfield13Field();

    /**
     * BitSet OrderModifiedV2 byte 14.
     */
    private final OrderModifiedV2ReturnBitfield14Field orderModifiedV2ReturnBitfield14 = new OrderModifiedV2ReturnBitfield14Field();

    /**
     * BitSet OrderModifiedV2 byte 15.
     */
    private final OrderModifiedV2ReturnBitfield15Field orderModifiedV2ReturnBitfield15 = new OrderModifiedV2ReturnBitfield15Field();

    /**
     * BitSet OrderModifiedV2 byte 16.
     */
    private final OrderModifiedV2ReturnBitfield16Field orderModifiedV2ReturnBitfield16 = new OrderModifiedV2ReturnBitfield16Field();

    /**
     * BitSet OrderModifiedV2 byte 17.
     */
    private final OrderModifiedV2ReturnBitfield17Field orderModifiedV2ReturnBitfield17 = new OrderModifiedV2ReturnBitfield17Field();

    /**
     * BitSet OrderModifiedV2 byte 18.
     */
    private final OrderModifiedV2ReturnBitfield18Field orderModifiedV2ReturnBitfield18 = new OrderModifiedV2ReturnBitfield18Field();

    /**
     * BitSet OrderModifiedV2 byte 19.
     */
    private final OrderModifiedV2ReturnBitfield19Field orderModifiedV2ReturnBitfield19 = new OrderModifiedV2ReturnBitfield19Field();

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell 5 = Sell Short 6 = Sell Short Exempt H = Sell Undisclosed
     */
    private final SideField side = new SideField();

    /**
     * Peg Difference
     */
    private final PegDifferenceField pegDifference = new PegDifferenceField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Exec Inst
     */
    private final ExecInstField execInst = new ExecInstField();

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
     * Max Floor
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 99,999,999 shares.
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Prevent Match
     */
    private final PreventMatchField preventMatch = new PreventMatchField();

    /**
     * Corresponds to OrigClOrdID (41) in Cboe FIX. ClOrdID of the order to cancel.
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Leaves Qty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Corresponds to LastShares (32) in Cboe FIX. Executed share quantity. If the LargeSize op- tional field is specified, that value holds pre- cedance over this field.
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
     * Liquidity Provision
     */
    private final LiquidityProvisionField liquidityProvision = new LiquidityProvisionField();

    /**
     * Waiver Type
     */
    private final WaiverTypeField waiverType = new WaiverTypeField();

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
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, orderId, numberOfReturnBitfields, orderModifiedV2ReturnBitfield1, orderModifiedV2ReturnBitfield2, orderModifiedV2ReturnBitfield3, orderModifiedV2ReturnBitfield4, orderModifiedV2ReturnBitfield5, orderModifiedV2ReturnBitfield6, orderModifiedV2ReturnBitfield7, orderModifiedV2ReturnBitfield8, orderModifiedV2ReturnBitfield9, orderModifiedV2ReturnBitfield10, orderModifiedV2ReturnBitfield11, orderModifiedV2ReturnBitfield12, orderModifiedV2ReturnBitfield13, orderModifiedV2ReturnBitfield14, orderModifiedV2ReturnBitfield15, orderModifiedV2ReturnBitfield16, orderModifiedV2ReturnBitfield17, orderModifiedV2ReturnBitfield18, orderModifiedV2ReturnBitfield19, side, pegDifference, price, execInst, ordType, timeInForce, minQty, account, clearingFirm, clearingAccount, displayIndicator, maxFloor, orderQty, preventMatch, origClOrdId, leavesQty, lastShares, lastPxBinaryPrice, displayPrice, workingPrice, baseLiquidityIndicator, expireTime, secondaryOrderId, extExecInst, liquidityProvision, waiverType, clientQualifiedRole, clientId, investorId, executorId, orderOrigination, algorithmicIndicator, investorQualifiedRole, executorQualifiedRole);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent). Nanosecond precision.
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe (—). A leading tilde (˜) cannot be sent on any ClOrdID and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system-generated ClOrdID. If the ClOrdID matches a live order, the order will be rejected as a duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live or- ders, which includes long-lived persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID val- ues at least day-unique.
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
     * BitSet OrderModifiedV2 byte 1.
     *
     * @return the OrderModifiedV2ReturnBitfield1 field
     */
    public OrderModifiedV2ReturnBitfield1Field orderModifiedV2ReturnBitfield1() {
        return orderModifiedV2ReturnBitfield1;
    }

    /**
     * BitSet OrderModifiedV2 byte 2.
     *
     * @return the OrderModifiedV2ReturnBitfield2 field
     */
    public OrderModifiedV2ReturnBitfield2Field orderModifiedV2ReturnBitfield2() {
        return orderModifiedV2ReturnBitfield2;
    }

    /**
     * BitSet OrderModifiedV2 byte 3.
     *
     * @return the OrderModifiedV2ReturnBitfield3 field
     */
    public OrderModifiedV2ReturnBitfield3Field orderModifiedV2ReturnBitfield3() {
        return orderModifiedV2ReturnBitfield3;
    }

    /**
     * BitSet OrderModifiedV2 byte 4.
     *
     * @return the OrderModifiedV2ReturnBitfield4 field
     */
    public OrderModifiedV2ReturnBitfield4Field orderModifiedV2ReturnBitfield4() {
        return orderModifiedV2ReturnBitfield4;
    }

    /**
     * BitSet OrderModifiedV2 byte 5.
     *
     * @return the OrderModifiedV2ReturnBitfield5 field
     */
    public OrderModifiedV2ReturnBitfield5Field orderModifiedV2ReturnBitfield5() {
        return orderModifiedV2ReturnBitfield5;
    }

    /**
     * BitSet OrderModifiedV2 byte 6.
     *
     * @return the OrderModifiedV2ReturnBitfield6 field
     */
    public OrderModifiedV2ReturnBitfield6Field orderModifiedV2ReturnBitfield6() {
        return orderModifiedV2ReturnBitfield6;
    }

    /**
     * BitSet OrderModifiedV2 byte 7.
     *
     * @return the OrderModifiedV2ReturnBitfield7 field
     */
    public OrderModifiedV2ReturnBitfield7Field orderModifiedV2ReturnBitfield7() {
        return orderModifiedV2ReturnBitfield7;
    }

    /**
     * BitSet OrderModifiedV2 byte 8.
     *
     * @return the OrderModifiedV2ReturnBitfield8 field
     */
    public OrderModifiedV2ReturnBitfield8Field orderModifiedV2ReturnBitfield8() {
        return orderModifiedV2ReturnBitfield8;
    }

    /**
     * BitSet OrderModifiedV2 byte 9.
     *
     * @return the OrderModifiedV2ReturnBitfield9 field
     */
    public OrderModifiedV2ReturnBitfield9Field orderModifiedV2ReturnBitfield9() {
        return orderModifiedV2ReturnBitfield9;
    }

    /**
     * BitSet OrderModifiedV2 byte 10.
     *
     * @return the OrderModifiedV2ReturnBitfield10 field
     */
    public OrderModifiedV2ReturnBitfield10Field orderModifiedV2ReturnBitfield10() {
        return orderModifiedV2ReturnBitfield10;
    }

    /**
     * BitSet OrderModifiedV2 byte 11.
     *
     * @return the OrderModifiedV2ReturnBitfield11 field
     */
    public OrderModifiedV2ReturnBitfield11Field orderModifiedV2ReturnBitfield11() {
        return orderModifiedV2ReturnBitfield11;
    }

    /**
     * BitSet OrderModifiedV2 byte 12.
     *
     * @return the OrderModifiedV2ReturnBitfield12 field
     */
    public OrderModifiedV2ReturnBitfield12Field orderModifiedV2ReturnBitfield12() {
        return orderModifiedV2ReturnBitfield12;
    }

    /**
     * BitSet OrderModifiedV2 byte 13.
     *
     * @return the OrderModifiedV2ReturnBitfield13 field
     */
    public OrderModifiedV2ReturnBitfield13Field orderModifiedV2ReturnBitfield13() {
        return orderModifiedV2ReturnBitfield13;
    }

    /**
     * BitSet OrderModifiedV2 byte 14.
     *
     * @return the OrderModifiedV2ReturnBitfield14 field
     */
    public OrderModifiedV2ReturnBitfield14Field orderModifiedV2ReturnBitfield14() {
        return orderModifiedV2ReturnBitfield14;
    }

    /**
     * BitSet OrderModifiedV2 byte 15.
     *
     * @return the OrderModifiedV2ReturnBitfield15 field
     */
    public OrderModifiedV2ReturnBitfield15Field orderModifiedV2ReturnBitfield15() {
        return orderModifiedV2ReturnBitfield15;
    }

    /**
     * BitSet OrderModifiedV2 byte 16.
     *
     * @return the OrderModifiedV2ReturnBitfield16 field
     */
    public OrderModifiedV2ReturnBitfield16Field orderModifiedV2ReturnBitfield16() {
        return orderModifiedV2ReturnBitfield16;
    }

    /**
     * BitSet OrderModifiedV2 byte 17.
     *
     * @return the OrderModifiedV2ReturnBitfield17 field
     */
    public OrderModifiedV2ReturnBitfield17Field orderModifiedV2ReturnBitfield17() {
        return orderModifiedV2ReturnBitfield17;
    }

    /**
     * BitSet OrderModifiedV2 byte 18.
     *
     * @return the OrderModifiedV2ReturnBitfield18 field
     */
    public OrderModifiedV2ReturnBitfield18Field orderModifiedV2ReturnBitfield18() {
        return orderModifiedV2ReturnBitfield18;
    }

    /**
     * BitSet OrderModifiedV2 byte 19.
     *
     * @return the OrderModifiedV2ReturnBitfield19 field
     */
    public OrderModifiedV2ReturnBitfield19Field orderModifiedV2ReturnBitfield19() {
        return orderModifiedV2ReturnBitfield19;
    }

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell 5 = Sell Short 6 = Sell Short Exempt H = Sell Undisclosed
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Peg Difference
     *
     * @return the PegDifference field
     */
    public PegDifferenceField pegDifference() {
        return pegDifference;
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
     * Exec Inst
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
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
     * Max Floor
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
    }

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 99,999,999 shares.
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
     * Corresponds to LastShares (32) in Cboe FIX. Executed share quantity. If the LargeSize op- tional field is specified, that value holds pre- cedance over this field.
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
     * Liquidity Provision
     *
     * @return the LiquidityProvision field
     */
    public LiquidityProvisionField liquidityProvision() {
        return liquidityProvision;
    }

    /**
     * Waiver Type
     *
     * @return the WaiverType field
     */
    public WaiverTypeField waiverType() {
        return waiverType;
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
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield1 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield2 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield3 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield4 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield5 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield6 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield7 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield8 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield9 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield10 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield11 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield12 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield13 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield14 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield15 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield16 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield17 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield18 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the OrderModifiedV2ReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the OrderModifiedV2ReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderModifiedV2ReturnBitfield19 is on the wire
     */
    public boolean orderModifiedV2ReturnBitfield19Present() {
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
        return (numberOfReturnBitfields.value() >= 1L) && (orderModifiedV2ReturnBitfield1Present() && orderModifiedV2ReturnBitfield1.orderModifiedV2ReturnBitfield1Side());
    }

    /**
     * Returns whether the fields before the PegDifference put it on the wire.
     *
     * <p>Decode reads the PegDifference where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PegDifference is on the wire
     */
    public boolean pegDifferencePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderModifiedV2ReturnBitfield1Present() && orderModifiedV2ReturnBitfield1.orderModifiedV2ReturnBitfield1PegDifference());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderModifiedV2ReturnBitfield1Present() && orderModifiedV2ReturnBitfield1.orderModifiedV2ReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderModifiedV2ReturnBitfield1Present() && orderModifiedV2ReturnBitfield1.orderModifiedV2ReturnBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderModifiedV2ReturnBitfield1Present() && orderModifiedV2ReturnBitfield1.orderModifiedV2ReturnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderModifiedV2ReturnBitfield1Present() && orderModifiedV2ReturnBitfield1.orderModifiedV2ReturnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderModifiedV2ReturnBitfield1Present() && orderModifiedV2ReturnBitfield1.orderModifiedV2ReturnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderModifiedV2ReturnBitfield3Present() && orderModifiedV2ReturnBitfield3.orderModifiedV2ReturnBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderModifiedV2ReturnBitfield3Present() && orderModifiedV2ReturnBitfield3.orderModifiedV2ReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderModifiedV2ReturnBitfield3Present() && orderModifiedV2ReturnBitfield3.orderModifiedV2ReturnBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the DisplayIndicator put it on the wire.
     *
     * <p>Decode reads the DisplayIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayIndicator is on the wire
     */
    public boolean displayIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderModifiedV2ReturnBitfield3Present() && orderModifiedV2ReturnBitfield3.orderModifiedV2ReturnBitfield3DisplayIndicator());
    }

    /**
     * Returns whether the fields before the MaxFloor put it on the wire.
     *
     * <p>Decode reads the MaxFloor where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaxFloor is on the wire
     */
    public boolean maxFloorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderModifiedV2ReturnBitfield3Present() && orderModifiedV2ReturnBitfield3.orderModifiedV2ReturnBitfield3MaxFloor());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderModifiedV2ReturnBitfield3Present() && orderModifiedV2ReturnBitfield3.orderModifiedV2ReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderModifiedV2ReturnBitfield3Present() && orderModifiedV2ReturnBitfield3.orderModifiedV2ReturnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the OrigClOrdId put it on the wire.
     *
     * <p>Decode reads the OrigClOrdId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrigClOrdId is on the wire
     */
    public boolean origClOrdIdPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderModifiedV2ReturnBitfield5Present() && orderModifiedV2ReturnBitfield5.orderModifiedV2ReturnBitfield5OrigClOrdId());
    }

    /**
     * Returns whether the fields before the LeavesQty put it on the wire.
     *
     * <p>Decode reads the LeavesQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LeavesQty is on the wire
     */
    public boolean leavesQtyPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderModifiedV2ReturnBitfield5Present() && orderModifiedV2ReturnBitfield5.orderModifiedV2ReturnBitfield5LeavesQty());
    }

    /**
     * Returns whether the fields before the LastShares put it on the wire.
     *
     * <p>Decode reads the LastShares where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastShares is on the wire
     */
    public boolean lastSharesPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderModifiedV2ReturnBitfield5Present() && orderModifiedV2ReturnBitfield5.orderModifiedV2ReturnBitfield5LastShares());
    }

    /**
     * Returns whether the fields before the LastPxBinaryPrice put it on the wire.
     *
     * <p>Decode reads the LastPxBinaryPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastPxBinaryPrice is on the wire
     */
    public boolean lastPxBinaryPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderModifiedV2ReturnBitfield5Present() && orderModifiedV2ReturnBitfield5.orderModifiedV2ReturnBitfield5LastPx());
    }

    /**
     * Returns whether the fields before the DisplayPrice put it on the wire.
     *
     * <p>Decode reads the DisplayPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayPrice is on the wire
     */
    public boolean displayPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderModifiedV2ReturnBitfield5Present() && orderModifiedV2ReturnBitfield5.orderModifiedV2ReturnBitfield5DisplayPrice());
    }

    /**
     * Returns whether the fields before the WorkingPrice put it on the wire.
     *
     * <p>Decode reads the WorkingPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the WorkingPrice is on the wire
     */
    public boolean workingPricePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderModifiedV2ReturnBitfield5Present() && orderModifiedV2ReturnBitfield5.orderModifiedV2ReturnBitfield5WorkingPrice());
    }

    /**
     * Returns whether the fields before the BaseLiquidityIndicator put it on the wire.
     *
     * <p>Decode reads the BaseLiquidityIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the BaseLiquidityIndicator is on the wire
     */
    public boolean baseLiquidityIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderModifiedV2ReturnBitfield5Present() && orderModifiedV2ReturnBitfield5.orderModifiedV2ReturnBitfield5BaseLiquidityIndicator());
    }

    /**
     * Returns whether the fields before the ExpireTime put it on the wire.
     *
     * <p>Decode reads the ExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExpireTime is on the wire
     */
    public boolean expireTimePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (orderModifiedV2ReturnBitfield5Present() && orderModifiedV2ReturnBitfield5.orderModifiedV2ReturnBitfield5ExpireTime());
    }

    /**
     * Returns whether the fields before the SecondaryOrderId put it on the wire.
     *
     * <p>Decode reads the SecondaryOrderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecondaryOrderId is on the wire
     */
    public boolean secondaryOrderIdPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderModifiedV2ReturnBitfield6Present() && orderModifiedV2ReturnBitfield6.orderModifiedV2ReturnBitfield6SecondaryOrderId());
    }

    /**
     * Returns whether the fields before the ExtExecInst put it on the wire.
     *
     * <p>Decode reads the ExtExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExtExecInst is on the wire
     */
    public boolean extExecInstPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderModifiedV2ReturnBitfield6Present() && orderModifiedV2ReturnBitfield6.orderModifiedV2ReturnBitfield6ExtExecInst());
    }

    /**
     * Returns whether the fields before the LiquidityProvision put it on the wire.
     *
     * <p>Decode reads the LiquidityProvision where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LiquidityProvision is on the wire
     */
    public boolean liquidityProvisionPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderModifiedV2ReturnBitfield9Present() && orderModifiedV2ReturnBitfield9.orderModifiedV2ReturnBitfield9LiquidityProvision());
    }

    /**
     * Returns whether the fields before the WaiverType put it on the wire.
     *
     * <p>Decode reads the WaiverType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the WaiverType is on the wire
     */
    public boolean waiverTypePresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderModifiedV2ReturnBitfield10Present() && orderModifiedV2ReturnBitfield10.orderModifiedV2ReturnBitfield10WaiverType());
    }

    /**
     * Returns whether the fields before the ClientQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ClientQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientQualifiedRole is on the wire
     */
    public boolean clientQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderModifiedV2ReturnBitfield10Present() && orderModifiedV2ReturnBitfield10.orderModifiedV2ReturnBitfield10ClientQualifiedRole());
    }

    /**
     * Returns whether the fields before the ClientId put it on the wire.
     *
     * <p>Decode reads the ClientId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientId is on the wire
     */
    public boolean clientIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderModifiedV2ReturnBitfield11Present() && orderModifiedV2ReturnBitfield11.orderModifiedV2ReturnBitfield11ClientId());
    }

    /**
     * Returns whether the fields before the InvestorId put it on the wire.
     *
     * <p>Decode reads the InvestorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorId is on the wire
     */
    public boolean investorIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderModifiedV2ReturnBitfield11Present() && orderModifiedV2ReturnBitfield11.orderModifiedV2ReturnBitfield11InvestorId());
    }

    /**
     * Returns whether the fields before the ExecutorId put it on the wire.
     *
     * <p>Decode reads the ExecutorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorId is on the wire
     */
    public boolean executorIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderModifiedV2ReturnBitfield11Present() && orderModifiedV2ReturnBitfield11.orderModifiedV2ReturnBitfield11ExecutorId());
    }

    /**
     * Returns whether the fields before the OrderOrigination put it on the wire.
     *
     * <p>Decode reads the OrderOrigination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigination is on the wire
     */
    public boolean orderOriginationPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderModifiedV2ReturnBitfield11Present() && orderModifiedV2ReturnBitfield11.orderModifiedV2ReturnBitfield11OrderOrigination());
    }

    /**
     * Returns whether the fields before the AlgorithmicIndicator put it on the wire.
     *
     * <p>Decode reads the AlgorithmicIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AlgorithmicIndicator is on the wire
     */
    public boolean algorithmicIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderModifiedV2ReturnBitfield11Present() && orderModifiedV2ReturnBitfield11.orderModifiedV2ReturnBitfield11AlgorithmicIndicator());
    }

    /**
     * Returns whether the fields before the InvestorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the InvestorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorQualifiedRole is on the wire
     */
    public boolean investorQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderModifiedV2ReturnBitfield11Present() && orderModifiedV2ReturnBitfield11.orderModifiedV2ReturnBitfield11InvestorQualifiedRole());
    }

    /**
     * Returns whether the fields before the ExecutorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ExecutorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorQualifiedRole is on the wire
     */
    public boolean executorQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderModifiedV2ReturnBitfield11Present() && orderModifiedV2ReturnBitfield11.orderModifiedV2ReturnBitfield11ExecutorQualifiedRole());
    }

    private boolean onWire(Field field) {
        return (field != orderModifiedV2ReturnBitfield1 || orderModifiedV2ReturnBitfield1Present()) && (field != orderModifiedV2ReturnBitfield2 || orderModifiedV2ReturnBitfield2Present()) && (field != orderModifiedV2ReturnBitfield3 || orderModifiedV2ReturnBitfield3Present()) && (field != orderModifiedV2ReturnBitfield4 || orderModifiedV2ReturnBitfield4Present()) && (field != orderModifiedV2ReturnBitfield5 || orderModifiedV2ReturnBitfield5Present()) && (field != orderModifiedV2ReturnBitfield6 || orderModifiedV2ReturnBitfield6Present()) && (field != orderModifiedV2ReturnBitfield7 || orderModifiedV2ReturnBitfield7Present()) && (field != orderModifiedV2ReturnBitfield8 || orderModifiedV2ReturnBitfield8Present()) && (field != orderModifiedV2ReturnBitfield9 || orderModifiedV2ReturnBitfield9Present()) && (field != orderModifiedV2ReturnBitfield10 || orderModifiedV2ReturnBitfield10Present()) && (field != orderModifiedV2ReturnBitfield11 || orderModifiedV2ReturnBitfield11Present()) && (field != orderModifiedV2ReturnBitfield12 || orderModifiedV2ReturnBitfield12Present()) && (field != orderModifiedV2ReturnBitfield13 || orderModifiedV2ReturnBitfield13Present()) && (field != orderModifiedV2ReturnBitfield14 || orderModifiedV2ReturnBitfield14Present()) && (field != orderModifiedV2ReturnBitfield15 || orderModifiedV2ReturnBitfield15Present()) && (field != orderModifiedV2ReturnBitfield16 || orderModifiedV2ReturnBitfield16Present()) && (field != orderModifiedV2ReturnBitfield17 || orderModifiedV2ReturnBitfield17Present()) && (field != orderModifiedV2ReturnBitfield18 || orderModifiedV2ReturnBitfield18Present()) && (field != orderModifiedV2ReturnBitfield19 || orderModifiedV2ReturnBitfield19Present()) && (field != side || sidePresent()) && (field != pegDifference || pegDifferencePresent()) && (field != price || pricePresent()) && (field != execInst || execInstPresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != displayIndicator || displayIndicatorPresent()) && (field != maxFloor || maxFloorPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != origClOrdId || origClOrdIdPresent()) && (field != leavesQty || leavesQtyPresent()) && (field != lastShares || lastSharesPresent()) && (field != lastPxBinaryPrice || lastPxBinaryPricePresent()) && (field != displayPrice || displayPricePresent()) && (field != workingPrice || workingPricePresent()) && (field != baseLiquidityIndicator || baseLiquidityIndicatorPresent()) && (field != expireTime || expireTimePresent()) && (field != secondaryOrderId || secondaryOrderIdPresent()) && (field != extExecInst || extExecInstPresent()) && (field != liquidityProvision || liquidityProvisionPresent()) && (field != waiverType || waiverTypePresent()) && (field != clientQualifiedRole || clientQualifiedRolePresent()) && (field != clientId || clientIdPresent()) && (field != investorId || investorIdPresent()) && (field != executorId || executorIdPresent()) && (field != orderOrigination || orderOriginationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent()) && (field != investorQualifiedRole || investorQualifiedRolePresent()) && (field != executorQualifiedRole || executorQualifiedRolePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderModifiedV2ReturnBitfield1Present() ? OrderModifiedV2ReturnBitfield1Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield2Present() ? OrderModifiedV2ReturnBitfield2Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield3Present() ? OrderModifiedV2ReturnBitfield3Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield4Present() ? OrderModifiedV2ReturnBitfield4Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield5Present() ? OrderModifiedV2ReturnBitfield5Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield6Present() ? OrderModifiedV2ReturnBitfield6Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield7Present() ? OrderModifiedV2ReturnBitfield7Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield8Present() ? OrderModifiedV2ReturnBitfield8Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield9Present() ? OrderModifiedV2ReturnBitfield9Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield10Present() ? OrderModifiedV2ReturnBitfield10Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield11Present() ? OrderModifiedV2ReturnBitfield11Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield12Present() ? OrderModifiedV2ReturnBitfield12Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield13Present() ? OrderModifiedV2ReturnBitfield13Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield14Present() ? OrderModifiedV2ReturnBitfield14Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield15Present() ? OrderModifiedV2ReturnBitfield15Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield16Present() ? OrderModifiedV2ReturnBitfield16Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield17Present() ? OrderModifiedV2ReturnBitfield17Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield18Present() ? OrderModifiedV2ReturnBitfield18Field.BYTE_LENGTH : 0) + (orderModifiedV2ReturnBitfield19Present() ? OrderModifiedV2ReturnBitfield19Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pegDifferencePresent() ? PegDifferenceField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (displayIndicatorPresent() ? DisplayIndicatorField.BYTE_LENGTH : 0) + (maxFloorPresent() ? MaxFloorField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (origClOrdIdPresent() ? OrigClOrdIdField.BYTE_LENGTH : 0) + (leavesQtyPresent() ? LeavesQtyField.BYTE_LENGTH : 0) + (lastSharesPresent() ? LastSharesField.BYTE_LENGTH : 0) + (lastPxBinaryPricePresent() ? LastPxBinaryPriceField.BYTE_LENGTH : 0) + (displayPricePresent() ? DisplayPriceField.BYTE_LENGTH : 0) + (workingPricePresent() ? WorkingPriceField.BYTE_LENGTH : 0) + (baseLiquidityIndicatorPresent() ? BaseLiquidityIndicatorField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (secondaryOrderIdPresent() ? SecondaryOrderIdField.BYTE_LENGTH : 0) + (extExecInstPresent() ? ExtExecInstField.BYTE_LENGTH : 0) + (liquidityProvisionPresent() ? LiquidityProvisionField.BYTE_LENGTH : 0) + (waiverTypePresent() ? WaiverTypeField.BYTE_LENGTH : 0) + (clientQualifiedRolePresent() ? ClientQualifiedRoleField.BYTE_LENGTH : 0) + (clientIdPresent() ? ClientIdField.BYTE_LENGTH : 0) + (investorIdPresent() ? InvestorIdField.BYTE_LENGTH : 0) + (executorIdPresent() ? ExecutorIdField.BYTE_LENGTH : 0) + (orderOriginationPresent() ? OrderOriginationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0) + (investorQualifiedRolePresent() ? InvestorQualifiedRoleField.BYTE_LENGTH : 0) + (executorQualifiedRolePresent() ? ExecutorQualifiedRoleField.BYTE_LENGTH : 0);
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
        if (orderModifiedV2ReturnBitfield1Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield2Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield3Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield4Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield5Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield6Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield7Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield8Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield9Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield10Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield11Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield12Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield13Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield14Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield15Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield16Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield17Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield18Present()) {
            cursor += 1;
        }
        if (orderModifiedV2ReturnBitfield19Present()) {
            cursor += 1;
        }
        if (sidePresent()) {
            cursor += 1;
        }
        if (pegDifferencePresent()) {
            cursor += 8;
        }
        if (pricePresent()) {
            cursor += 8;
        }
        if (execInstPresent()) {
            cursor += 1;
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
        if (maxFloorPresent()) {
            cursor += 4;
        }
        if (orderQtyPresent()) {
            cursor += 4;
        }
        if (preventMatchPresent()) {
            cursor += 3;
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
        if (liquidityProvisionPresent()) {
            cursor += 1;
        }
        if (waiverTypePresent()) {
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
        if (orderModifiedV2ReturnBitfield1Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield1Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield2Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield2Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield3Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield3Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield4Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield4Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield5Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield5Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield6Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield6Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield7Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield7Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield8Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield8Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield9Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield9Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield10Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield10Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield11Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield11Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield12Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield12Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield13Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield13Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield14Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield14Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield15Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield15Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield16Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield16Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield17Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield17Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield18Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield18Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderModifiedV2ReturnBitfield19Present()) {
            if (end - cursor < OrderModifiedV2ReturnBitfield19Field.BYTE_LENGTH || !orderModifiedV2ReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += OrderModifiedV2ReturnBitfield19Field.BYTE_LENGTH;
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
        if (pegDifferencePresent()) {
            if (end - cursor < PegDifferenceField.BYTE_LENGTH || !pegDifference.parse(data, cursor)) {
                return false;
            }
            cursor += PegDifferenceField.BYTE_LENGTH;
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
        if (execInstPresent()) {
            if (end - cursor < ExecInstField.BYTE_LENGTH || !execInst.parse(data, cursor)) {
                return false;
            }
            cursor += ExecInstField.BYTE_LENGTH;
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
        if (maxFloorPresent()) {
            if (end - cursor < MaxFloorField.BYTE_LENGTH || !maxFloor.parse(data, cursor)) {
                return false;
            }
            cursor += MaxFloorField.BYTE_LENGTH;
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
        if (liquidityProvisionPresent()) {
            if (end - cursor < LiquidityProvisionField.BYTE_LENGTH || !liquidityProvision.parse(data, cursor)) {
                return false;
            }
            cursor += LiquidityProvisionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (waiverTypePresent()) {
            if (end - cursor < WaiverTypeField.BYTE_LENGTH || !waiverType.parse(data, cursor)) {
                return false;
            }
            cursor += WaiverTypeField.BYTE_LENGTH;
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

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (orderModifiedV2ReturnBitfield1Present() != orderModifiedV2ReturnBitfield1.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield1.hasValue() ? "orderModifiedV2ReturnBitfield1 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield2Present() != orderModifiedV2ReturnBitfield2.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield2.hasValue() ? "orderModifiedV2ReturnBitfield2 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield3Present() != orderModifiedV2ReturnBitfield3.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield3.hasValue() ? "orderModifiedV2ReturnBitfield3 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield4Present() != orderModifiedV2ReturnBitfield4.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield4.hasValue() ? "orderModifiedV2ReturnBitfield4 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield5Present() != orderModifiedV2ReturnBitfield5.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield5.hasValue() ? "orderModifiedV2ReturnBitfield5 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield6Present() != orderModifiedV2ReturnBitfield6.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield6.hasValue() ? "orderModifiedV2ReturnBitfield6 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield7Present() != orderModifiedV2ReturnBitfield7.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield7.hasValue() ? "orderModifiedV2ReturnBitfield7 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield8Present() != orderModifiedV2ReturnBitfield8.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield8.hasValue() ? "orderModifiedV2ReturnBitfield8 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield9Present() != orderModifiedV2ReturnBitfield9.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield9.hasValue() ? "orderModifiedV2ReturnBitfield9 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield10Present() != orderModifiedV2ReturnBitfield10.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield10.hasValue() ? "orderModifiedV2ReturnBitfield10 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield11Present() != orderModifiedV2ReturnBitfield11.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield11.hasValue() ? "orderModifiedV2ReturnBitfield11 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield12Present() != orderModifiedV2ReturnBitfield12.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield12.hasValue() ? "orderModifiedV2ReturnBitfield12 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield13Present() != orderModifiedV2ReturnBitfield13.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield13.hasValue() ? "orderModifiedV2ReturnBitfield13 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield14Present() != orderModifiedV2ReturnBitfield14.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield14.hasValue() ? "orderModifiedV2ReturnBitfield14 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield15Present() != orderModifiedV2ReturnBitfield15.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield15.hasValue() ? "orderModifiedV2ReturnBitfield15 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield16Present() != orderModifiedV2ReturnBitfield16.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield16.hasValue() ? "orderModifiedV2ReturnBitfield16 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield17Present() != orderModifiedV2ReturnBitfield17.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield17.hasValue() ? "orderModifiedV2ReturnBitfield17 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield18Present() != orderModifiedV2ReturnBitfield18.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield18.hasValue() ? "orderModifiedV2ReturnBitfield18 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (orderModifiedV2ReturnBitfield19Present() != orderModifiedV2ReturnBitfield19.hasValue()) {
            throw new IllegalStateException(orderModifiedV2ReturnBitfield19.hasValue() ? "orderModifiedV2ReturnBitfield19 holds a value the fields before it leave off the wire" : "orderModifiedV2ReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (sidePresent() != side.hasValue()) {
            throw new IllegalStateException(side.hasValue() ? "side holds a value the fields before it leave off the wire" : "side holds no value, though the fields before it put it on the wire");
        }
        if (pegDifferencePresent() != pegDifference.hasValue()) {
            throw new IllegalStateException(pegDifference.hasValue() ? "pegDifference holds a value the fields before it leave off the wire" : "pegDifference holds no value, though the fields before it put it on the wire");
        }
        if (pricePresent() != price.hasValue()) {
            throw new IllegalStateException(price.hasValue() ? "price holds a value the fields before it leave off the wire" : "price holds no value, though the fields before it put it on the wire");
        }
        if (execInstPresent() != execInst.hasValue()) {
            throw new IllegalStateException(execInst.hasValue() ? "execInst holds a value the fields before it leave off the wire" : "execInst holds no value, though the fields before it put it on the wire");
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
        if (maxFloorPresent() != maxFloor.hasValue()) {
            throw new IllegalStateException(maxFloor.hasValue() ? "maxFloor holds a value the fields before it leave off the wire" : "maxFloor holds no value, though the fields before it put it on the wire");
        }
        if (orderQtyPresent() != orderQty.hasValue()) {
            throw new IllegalStateException(orderQty.hasValue() ? "orderQty holds a value the fields before it leave off the wire" : "orderQty holds no value, though the fields before it put it on the wire");
        }
        if (preventMatchPresent() != preventMatch.hasValue()) {
            throw new IllegalStateException(preventMatch.hasValue() ? "preventMatch holds a value the fields before it leave off the wire" : "preventMatch holds no value, though the fields before it put it on the wire");
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
        if (liquidityProvisionPresent() != liquidityProvision.hasValue()) {
            throw new IllegalStateException(liquidityProvision.hasValue() ? "liquidityProvision holds a value the fields before it leave off the wire" : "liquidityProvision holds no value, though the fields before it put it on the wire");
        }
        if (waiverTypePresent() != waiverType.hasValue()) {
            throw new IllegalStateException(waiverType.hasValue() ? "waiverType holds a value the fields before it leave off the wire" : "waiverType holds no value, though the fields before it put it on the wire");
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
        if (orderModifiedV2ReturnBitfield1Present()) {
            cursor = orderModifiedV2ReturnBitfield1.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield2Present()) {
            cursor = orderModifiedV2ReturnBitfield2.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield3Present()) {
            cursor = orderModifiedV2ReturnBitfield3.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield4Present()) {
            cursor = orderModifiedV2ReturnBitfield4.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield5Present()) {
            cursor = orderModifiedV2ReturnBitfield5.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield6Present()) {
            cursor = orderModifiedV2ReturnBitfield6.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield7Present()) {
            cursor = orderModifiedV2ReturnBitfield7.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield8Present()) {
            cursor = orderModifiedV2ReturnBitfield8.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield9Present()) {
            cursor = orderModifiedV2ReturnBitfield9.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield10Present()) {
            cursor = orderModifiedV2ReturnBitfield10.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield11Present()) {
            cursor = orderModifiedV2ReturnBitfield11.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield12Present()) {
            cursor = orderModifiedV2ReturnBitfield12.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield13Present()) {
            cursor = orderModifiedV2ReturnBitfield13.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield14Present()) {
            cursor = orderModifiedV2ReturnBitfield14.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield15Present()) {
            cursor = orderModifiedV2ReturnBitfield15.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield16Present()) {
            cursor = orderModifiedV2ReturnBitfield16.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield17Present()) {
            cursor = orderModifiedV2ReturnBitfield17.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield18Present()) {
            cursor = orderModifiedV2ReturnBitfield18.encode(data, cursor);
        }
        if (orderModifiedV2ReturnBitfield19Present()) {
            cursor = orderModifiedV2ReturnBitfield19.encode(data, cursor);
        }
        if (sidePresent()) {
            cursor = side.encode(data, cursor);
        }
        if (pegDifferencePresent()) {
            cursor = pegDifference.encode(data, cursor);
        }
        if (pricePresent()) {
            cursor = price.encode(data, cursor);
        }
        if (execInstPresent()) {
            cursor = execInst.encode(data, cursor);
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
        if (maxFloorPresent()) {
            cursor = maxFloor.encode(data, cursor);
        }
        if (orderQtyPresent()) {
            cursor = orderQty.encode(data, cursor);
        }
        if (preventMatchPresent()) {
            cursor = preventMatch.encode(data, cursor);
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
        if (liquidityProvisionPresent()) {
            cursor = liquidityProvision.encode(data, cursor);
        }
        if (waiverTypePresent()) {
            cursor = waiverType.encode(data, cursor);
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
            case "OrderModifiedV2ReturnBitfield1" -> Optional.of(orderModifiedV2ReturnBitfield1);
            case "OrderModifiedV2ReturnBitfield2" -> Optional.of(orderModifiedV2ReturnBitfield2);
            case "OrderModifiedV2ReturnBitfield3" -> Optional.of(orderModifiedV2ReturnBitfield3);
            case "OrderModifiedV2ReturnBitfield4" -> Optional.of(orderModifiedV2ReturnBitfield4);
            case "OrderModifiedV2ReturnBitfield5" -> Optional.of(orderModifiedV2ReturnBitfield5);
            case "OrderModifiedV2ReturnBitfield6" -> Optional.of(orderModifiedV2ReturnBitfield6);
            case "OrderModifiedV2ReturnBitfield7" -> Optional.of(orderModifiedV2ReturnBitfield7);
            case "OrderModifiedV2ReturnBitfield8" -> Optional.of(orderModifiedV2ReturnBitfield8);
            case "OrderModifiedV2ReturnBitfield9" -> Optional.of(orderModifiedV2ReturnBitfield9);
            case "OrderModifiedV2ReturnBitfield10" -> Optional.of(orderModifiedV2ReturnBitfield10);
            case "OrderModifiedV2ReturnBitfield11" -> Optional.of(orderModifiedV2ReturnBitfield11);
            case "OrderModifiedV2ReturnBitfield12" -> Optional.of(orderModifiedV2ReturnBitfield12);
            case "OrderModifiedV2ReturnBitfield13" -> Optional.of(orderModifiedV2ReturnBitfield13);
            case "OrderModifiedV2ReturnBitfield14" -> Optional.of(orderModifiedV2ReturnBitfield14);
            case "OrderModifiedV2ReturnBitfield15" -> Optional.of(orderModifiedV2ReturnBitfield15);
            case "OrderModifiedV2ReturnBitfield16" -> Optional.of(orderModifiedV2ReturnBitfield16);
            case "OrderModifiedV2ReturnBitfield17" -> Optional.of(orderModifiedV2ReturnBitfield17);
            case "OrderModifiedV2ReturnBitfield18" -> Optional.of(orderModifiedV2ReturnBitfield18);
            case "OrderModifiedV2ReturnBitfield19" -> Optional.of(orderModifiedV2ReturnBitfield19);
            case "Side" -> Optional.of(side);
            case "PegDifference" -> Optional.of(pegDifference);
            case "Price" -> Optional.of(price);
            case "ExecInst" -> Optional.of(execInst);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "Account" -> Optional.of(account);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "DisplayIndicator" -> Optional.of(displayIndicator);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "OrderQty" -> Optional.of(orderQty);
            case "PreventMatch" -> Optional.of(preventMatch);
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
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "WaiverType" -> Optional.of(waiverType);
            case "ClientQualifiedRole" -> Optional.of(clientQualifiedRole);
            case "ClientId" -> Optional.of(clientId);
            case "InvestorId" -> Optional.of(investorId);
            case "ExecutorId" -> Optional.of(executorId);
            case "OrderOrigination" -> Optional.of(orderOrigination);
            case "AlgorithmicIndicator" -> Optional.of(algorithmicIndicator);
            case "InvestorQualifiedRole" -> Optional.of(investorQualifiedRole);
            case "ExecutorQualifiedRole" -> Optional.of(executorQualifiedRole);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderModifiedV2Message message)) {
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
        if (!(other instanceof OrderModifiedV2Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
