package omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.AccountField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.AlgorithmicIndicatorField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.BaseLiquidityIndicatorField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.CapacityField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.CentralCounterpartyField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.ClOrdIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.ClearingAccountField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.ClearingFirmField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.ClientIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.ClientQualifiedRoleField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.ContraBrokerField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.CurrencyField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.DisplayIndicatorField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.ExecIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.ExecInstField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.ExecutorIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.ExecutorQualifiedRoleField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.ExtExecInstField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.FeeCodeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.IdSourceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.InvestorIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.InvestorQualifiedRoleField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.LastMktField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.LastPxBinaryPriceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.LastSharesField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.LeavesQtyField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.LiquidityProvisionField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.MaxFloorField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.MinQtyField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrdTypeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield10Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield11Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield12Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield13Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield14Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield15Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield16Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield17Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield18Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield1Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield2Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield3Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield4Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield5Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield6Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield7Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield8Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderExecutionV2ReturnBitfield9Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderOriginationField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.OrderQtyField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.PegDifferenceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.PreventMatchField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.PriceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.RoutingInstField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.SecondaryOrderIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.SecurityExchangeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.SecurityIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.SideField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.SubLiquidityIndicatorField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.SymbolField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.TimeInForceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.TransactionTimeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.fields.WaiverTypeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.types.Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.types.Message;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_57.types.PrintOptions;

/**
 * Represents the OrderExecutionV2Message message from the BinaryOrderEntry protocol.
 *
 * <p>Order Execution V2 Message.</p>
 */
public final class OrderExecutionV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 60;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Execution V 2 Message";

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. A leading tilde (˜) cannot be sent on any ClOrdId and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system generated ClOrdId. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to ExecID (17) in Cboe FIX. Execution ID. Unique across all matching units on a given day. Note: ExecIDs will be rep- resented on ODROP, FIXDROP and standard DROP ports as base 36 ASCII. Example conversion: Decimal Base 36 28294005440239 A1234B567 76335905726621 R248BC23H 728557228187 09AP05V2Z
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Corresponds to LastShares (32) in Cboe FIX. Executed share quantity. If the LargeSize op- tional field is specified, that value holds pre- cedance over this field.
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Last Px Binary Price
     */
    private final LastPxBinaryPriceField lastPxBinaryPrice = new LastPxBinaryPriceField();

    /**
     * Leaves Qty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Base Liquidity Indicator
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Additional information about an execution. Cboe may add additional values without no- tice. Participants must gracefully ignore un- known values. ASCII NUL (0x00) = No Additional Information D = Cboe Dark Pool Execution T = Removed liquidity from the Cboe Dark Pool by IOC order H = Trade added hidden liquidity (not EU equi- ties) I = Trade added hidden liquidity that was price improved (not EU equities) K = Add liquidity from Hidden Reserve (Iceberg) order P = Periodic Auction C = Cboe Closing Cross S = Liquidity A-LPS BBO
     */
    private final SubLiquidityIndicatorField subLiquidityIndicator = new SubLiquidityIndicatorField();

    /**
     * Corresponds to ContraBroker (375) in Cboe FIX. Indicates the market of execution. Markets are identified by their ISO Market Identification Code (MIC)12
     */
    private final ContraBrokerField contraBroker = new ContraBrokerField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet OrderExecutionV2 byte 1.
     */
    private final OrderExecutionV2ReturnBitfield1Field orderExecutionV2ReturnBitfield1 = new OrderExecutionV2ReturnBitfield1Field();

    /**
     * BitSet OrderExecutionV2 byte 2.
     */
    private final OrderExecutionV2ReturnBitfield2Field orderExecutionV2ReturnBitfield2 = new OrderExecutionV2ReturnBitfield2Field();

    /**
     * BitSet OrderExecutionV2 byte 3.
     */
    private final OrderExecutionV2ReturnBitfield3Field orderExecutionV2ReturnBitfield3 = new OrderExecutionV2ReturnBitfield3Field();

    /**
     * BitSet OrderExecutionV2 byte 4.
     */
    private final OrderExecutionV2ReturnBitfield4Field orderExecutionV2ReturnBitfield4 = new OrderExecutionV2ReturnBitfield4Field();

    /**
     * BitSet OrderExecutionV2 byte 5.
     */
    private final OrderExecutionV2ReturnBitfield5Field orderExecutionV2ReturnBitfield5 = new OrderExecutionV2ReturnBitfield5Field();

    /**
     * BitSet OrderExecutionV2 byte 6.
     */
    private final OrderExecutionV2ReturnBitfield6Field orderExecutionV2ReturnBitfield6 = new OrderExecutionV2ReturnBitfield6Field();

    /**
     * BitSet OrderExecutionV2 byte 7.
     */
    private final OrderExecutionV2ReturnBitfield7Field orderExecutionV2ReturnBitfield7 = new OrderExecutionV2ReturnBitfield7Field();

    /**
     * BitSet OrderExecutionV2 byte 8.
     */
    private final OrderExecutionV2ReturnBitfield8Field orderExecutionV2ReturnBitfield8 = new OrderExecutionV2ReturnBitfield8Field();

    /**
     * BitSet OrderExecutionV2 byte 9.
     */
    private final OrderExecutionV2ReturnBitfield9Field orderExecutionV2ReturnBitfield9 = new OrderExecutionV2ReturnBitfield9Field();

    /**
     * BitSet OrderExecutionV2 byte 10.
     */
    private final OrderExecutionV2ReturnBitfield10Field orderExecutionV2ReturnBitfield10 = new OrderExecutionV2ReturnBitfield10Field();

    /**
     * BitSet OrderExecutionV2 byte 11.
     */
    private final OrderExecutionV2ReturnBitfield11Field orderExecutionV2ReturnBitfield11 = new OrderExecutionV2ReturnBitfield11Field();

    /**
     * BitSet OrderExecutionV2 byte 12.
     */
    private final OrderExecutionV2ReturnBitfield12Field orderExecutionV2ReturnBitfield12 = new OrderExecutionV2ReturnBitfield12Field();

    /**
     * BitSet OrderExecutionV2 byte 13.
     */
    private final OrderExecutionV2ReturnBitfield13Field orderExecutionV2ReturnBitfield13 = new OrderExecutionV2ReturnBitfield13Field();

    /**
     * BitSet OrderExecutionV2 byte 14.
     */
    private final OrderExecutionV2ReturnBitfield14Field orderExecutionV2ReturnBitfield14 = new OrderExecutionV2ReturnBitfield14Field();

    /**
     * BitSet OrderExecutionV2 byte 15.
     */
    private final OrderExecutionV2ReturnBitfield15Field orderExecutionV2ReturnBitfield15 = new OrderExecutionV2ReturnBitfield15Field();

    /**
     * BitSet OrderExecutionV2 byte 16.
     */
    private final OrderExecutionV2ReturnBitfield16Field orderExecutionV2ReturnBitfield16 = new OrderExecutionV2ReturnBitfield16Field();

    /**
     * BitSet OrderExecutionV2 byte 17.
     */
    private final OrderExecutionV2ReturnBitfield17Field orderExecutionV2ReturnBitfield17 = new OrderExecutionV2ReturnBitfield17Field();

    /**
     * BitSet OrderExecutionV2 byte 18.
     */
    private final OrderExecutionV2ReturnBitfield18Field orderExecutionV2ReturnBitfield18 = new OrderExecutionV2ReturnBitfield18Field();

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
     * Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Currency
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Id Source
     */
    private final IdSourceField idSource = new IdSourceField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Security Exchange
     */
    private final SecurityExchangeField securityExchange = new SecurityExchangeField();

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
     * Secondary Order Id
     */
    private final SecondaryOrderIdField secondaryOrderId = new SecondaryOrderIdField();

    /**
     * Central Counterparty
     */
    private final CentralCounterpartyField centralCounterparty = new CentralCounterpartyField();

    /**
     * Ext Exec Inst
     */
    private final ExtExecInstField extExecInst = new ExtExecInstField();

    /**
     * Last Mkt
     */
    private final LastMktField lastMkt = new LastMktField();

    /**
     * Fee Code
     */
    private final FeeCodeField feeCode = new FeeCodeField();

    /**
     * Routing Inst
     */
    private final RoutingInstField routingInst = new RoutingInstField();

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
    private final List<Field> fields = List.of(transactionTime, clOrdId, execId, lastShares, lastPxBinaryPrice, leavesQty, baseLiquidityIndicator, subLiquidityIndicator, contraBroker, numberOfReturnBitfields, orderExecutionV2ReturnBitfield1, orderExecutionV2ReturnBitfield2, orderExecutionV2ReturnBitfield3, orderExecutionV2ReturnBitfield4, orderExecutionV2ReturnBitfield5, orderExecutionV2ReturnBitfield6, orderExecutionV2ReturnBitfield7, orderExecutionV2ReturnBitfield8, orderExecutionV2ReturnBitfield9, orderExecutionV2ReturnBitfield10, orderExecutionV2ReturnBitfield11, orderExecutionV2ReturnBitfield12, orderExecutionV2ReturnBitfield13, orderExecutionV2ReturnBitfield14, orderExecutionV2ReturnBitfield15, orderExecutionV2ReturnBitfield16, orderExecutionV2ReturnBitfield17, orderExecutionV2ReturnBitfield18, side, pegDifference, price, execInst, ordType, timeInForce, minQty, symbol, currency, idSource, securityId, securityExchange, capacity, account, clearingFirm, clearingAccount, displayIndicator, maxFloor, orderQty, preventMatch, secondaryOrderId, centralCounterparty, extExecInst, lastMkt, feeCode, routingInst, liquidityProvision, waiverType, clientQualifiedRole, clientId, investorId, executorId, orderOrigination, algorithmicIndicator, investorQualifiedRole, executorQualifiedRole);

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
     * Corresponds to ExecID (17) in Cboe FIX. Execution ID. Unique across all matching units on a given day. Note: ExecIDs will be rep- resented on ODROP, FIXDROP and standard DROP ports as base 36 ASCII. Example conversion: Decimal Base 36 28294005440239 A1234B567 76335905726621 R248BC23H 728557228187 09AP05V2Z
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
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
     * Leaves Qty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
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
     * Additional information about an execution. Cboe may add additional values without no- tice. Participants must gracefully ignore un- known values. ASCII NUL (0x00) = No Additional Information D = Cboe Dark Pool Execution T = Removed liquidity from the Cboe Dark Pool by IOC order H = Trade added hidden liquidity (not EU equi- ties) I = Trade added hidden liquidity that was price improved (not EU equities) K = Add liquidity from Hidden Reserve (Iceberg) order P = Periodic Auction C = Cboe Closing Cross S = Liquidity A-LPS BBO
     *
     * @return the SubLiquidityIndicator field
     */
    public SubLiquidityIndicatorField subLiquidityIndicator() {
        return subLiquidityIndicator;
    }

    /**
     * Corresponds to ContraBroker (375) in Cboe FIX. Indicates the market of execution. Markets are identified by their ISO Market Identification Code (MIC)12
     *
     * @return the ContraBroker field
     */
    public ContraBrokerField contraBroker() {
        return contraBroker;
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
     * BitSet OrderExecutionV2 byte 1.
     *
     * @return the OrderExecutionV2ReturnBitfield1 field
     */
    public OrderExecutionV2ReturnBitfield1Field orderExecutionV2ReturnBitfield1() {
        return orderExecutionV2ReturnBitfield1;
    }

    /**
     * BitSet OrderExecutionV2 byte 2.
     *
     * @return the OrderExecutionV2ReturnBitfield2 field
     */
    public OrderExecutionV2ReturnBitfield2Field orderExecutionV2ReturnBitfield2() {
        return orderExecutionV2ReturnBitfield2;
    }

    /**
     * BitSet OrderExecutionV2 byte 3.
     *
     * @return the OrderExecutionV2ReturnBitfield3 field
     */
    public OrderExecutionV2ReturnBitfield3Field orderExecutionV2ReturnBitfield3() {
        return orderExecutionV2ReturnBitfield3;
    }

    /**
     * BitSet OrderExecutionV2 byte 4.
     *
     * @return the OrderExecutionV2ReturnBitfield4 field
     */
    public OrderExecutionV2ReturnBitfield4Field orderExecutionV2ReturnBitfield4() {
        return orderExecutionV2ReturnBitfield4;
    }

    /**
     * BitSet OrderExecutionV2 byte 5.
     *
     * @return the OrderExecutionV2ReturnBitfield5 field
     */
    public OrderExecutionV2ReturnBitfield5Field orderExecutionV2ReturnBitfield5() {
        return orderExecutionV2ReturnBitfield5;
    }

    /**
     * BitSet OrderExecutionV2 byte 6.
     *
     * @return the OrderExecutionV2ReturnBitfield6 field
     */
    public OrderExecutionV2ReturnBitfield6Field orderExecutionV2ReturnBitfield6() {
        return orderExecutionV2ReturnBitfield6;
    }

    /**
     * BitSet OrderExecutionV2 byte 7.
     *
     * @return the OrderExecutionV2ReturnBitfield7 field
     */
    public OrderExecutionV2ReturnBitfield7Field orderExecutionV2ReturnBitfield7() {
        return orderExecutionV2ReturnBitfield7;
    }

    /**
     * BitSet OrderExecutionV2 byte 8.
     *
     * @return the OrderExecutionV2ReturnBitfield8 field
     */
    public OrderExecutionV2ReturnBitfield8Field orderExecutionV2ReturnBitfield8() {
        return orderExecutionV2ReturnBitfield8;
    }

    /**
     * BitSet OrderExecutionV2 byte 9.
     *
     * @return the OrderExecutionV2ReturnBitfield9 field
     */
    public OrderExecutionV2ReturnBitfield9Field orderExecutionV2ReturnBitfield9() {
        return orderExecutionV2ReturnBitfield9;
    }

    /**
     * BitSet OrderExecutionV2 byte 10.
     *
     * @return the OrderExecutionV2ReturnBitfield10 field
     */
    public OrderExecutionV2ReturnBitfield10Field orderExecutionV2ReturnBitfield10() {
        return orderExecutionV2ReturnBitfield10;
    }

    /**
     * BitSet OrderExecutionV2 byte 11.
     *
     * @return the OrderExecutionV2ReturnBitfield11 field
     */
    public OrderExecutionV2ReturnBitfield11Field orderExecutionV2ReturnBitfield11() {
        return orderExecutionV2ReturnBitfield11;
    }

    /**
     * BitSet OrderExecutionV2 byte 12.
     *
     * @return the OrderExecutionV2ReturnBitfield12 field
     */
    public OrderExecutionV2ReturnBitfield12Field orderExecutionV2ReturnBitfield12() {
        return orderExecutionV2ReturnBitfield12;
    }

    /**
     * BitSet OrderExecutionV2 byte 13.
     *
     * @return the OrderExecutionV2ReturnBitfield13 field
     */
    public OrderExecutionV2ReturnBitfield13Field orderExecutionV2ReturnBitfield13() {
        return orderExecutionV2ReturnBitfield13;
    }

    /**
     * BitSet OrderExecutionV2 byte 14.
     *
     * @return the OrderExecutionV2ReturnBitfield14 field
     */
    public OrderExecutionV2ReturnBitfield14Field orderExecutionV2ReturnBitfield14() {
        return orderExecutionV2ReturnBitfield14;
    }

    /**
     * BitSet OrderExecutionV2 byte 15.
     *
     * @return the OrderExecutionV2ReturnBitfield15 field
     */
    public OrderExecutionV2ReturnBitfield15Field orderExecutionV2ReturnBitfield15() {
        return orderExecutionV2ReturnBitfield15;
    }

    /**
     * BitSet OrderExecutionV2 byte 16.
     *
     * @return the OrderExecutionV2ReturnBitfield16 field
     */
    public OrderExecutionV2ReturnBitfield16Field orderExecutionV2ReturnBitfield16() {
        return orderExecutionV2ReturnBitfield16;
    }

    /**
     * BitSet OrderExecutionV2 byte 17.
     *
     * @return the OrderExecutionV2ReturnBitfield17 field
     */
    public OrderExecutionV2ReturnBitfield17Field orderExecutionV2ReturnBitfield17() {
        return orderExecutionV2ReturnBitfield17;
    }

    /**
     * BitSet OrderExecutionV2 byte 18.
     *
     * @return the OrderExecutionV2ReturnBitfield18 field
     */
    public OrderExecutionV2ReturnBitfield18Field orderExecutionV2ReturnBitfield18() {
        return orderExecutionV2ReturnBitfield18;
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
     * Symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Currency
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
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
     * Security Exchange
     *
     * @return the SecurityExchange field
     */
    public SecurityExchangeField securityExchange() {
        return securityExchange;
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
     * Secondary Order Id
     *
     * @return the SecondaryOrderId field
     */
    public SecondaryOrderIdField secondaryOrderId() {
        return secondaryOrderId;
    }

    /**
     * Central Counterparty
     *
     * @return the CentralCounterparty field
     */
    public CentralCounterpartyField centralCounterparty() {
        return centralCounterparty;
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
     * Last Mkt
     *
     * @return the LastMkt field
     */
    public LastMktField lastMkt() {
        return lastMkt;
    }

    /**
     * Fee Code
     *
     * @return the FeeCode field
     */
    public FeeCodeField feeCode() {
        return feeCode;
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
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield1 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield2 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield3 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield4 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield5 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield6 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield7 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield8 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield9 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield10 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield11 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield12 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield13 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield14 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield15 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield16 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield17 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the OrderExecutionV2ReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the OrderExecutionV2ReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderExecutionV2ReturnBitfield18 is on the wire
     */
    public boolean orderExecutionV2ReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the Side put it on the wire.
     *
     * <p>Decode reads the Side where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Side is on the wire
     */
    public boolean sidePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionV2ReturnBitfield1Present() && orderExecutionV2ReturnBitfield1.orderExecutionV2ReturnBitfield1Side());
    }

    /**
     * Returns whether the fields before the PegDifference put it on the wire.
     *
     * <p>Decode reads the PegDifference where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PegDifference is on the wire
     */
    public boolean pegDifferencePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionV2ReturnBitfield1Present() && orderExecutionV2ReturnBitfield1.orderExecutionV2ReturnBitfield1PegDifference());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionV2ReturnBitfield1Present() && orderExecutionV2ReturnBitfield1.orderExecutionV2ReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionV2ReturnBitfield1Present() && orderExecutionV2ReturnBitfield1.orderExecutionV2ReturnBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionV2ReturnBitfield1Present() && orderExecutionV2ReturnBitfield1.orderExecutionV2ReturnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionV2ReturnBitfield1Present() && orderExecutionV2ReturnBitfield1.orderExecutionV2ReturnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderExecutionV2ReturnBitfield1Present() && orderExecutionV2ReturnBitfield1.orderExecutionV2ReturnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderExecutionV2ReturnBitfield2Present() && orderExecutionV2ReturnBitfield2.orderExecutionV2ReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Currency put it on the wire.
     *
     * <p>Decode reads the Currency where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Currency is on the wire
     */
    public boolean currencyPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderExecutionV2ReturnBitfield2Present() && orderExecutionV2ReturnBitfield2.orderExecutionV2ReturnBitfield2Currency());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderExecutionV2ReturnBitfield2Present() && orderExecutionV2ReturnBitfield2.orderExecutionV2ReturnBitfield2IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderExecutionV2ReturnBitfield2Present() && orderExecutionV2ReturnBitfield2.orderExecutionV2ReturnBitfield2SecurityId());
    }

    /**
     * Returns whether the fields before the SecurityExchange put it on the wire.
     *
     * <p>Decode reads the SecurityExchange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityExchange is on the wire
     */
    public boolean securityExchangePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderExecutionV2ReturnBitfield2Present() && orderExecutionV2ReturnBitfield2.orderExecutionV2ReturnBitfield2SecurityExchange());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderExecutionV2ReturnBitfield2Present() && orderExecutionV2ReturnBitfield2.orderExecutionV2ReturnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionV2ReturnBitfield3Present() && orderExecutionV2ReturnBitfield3.orderExecutionV2ReturnBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionV2ReturnBitfield3Present() && orderExecutionV2ReturnBitfield3.orderExecutionV2ReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionV2ReturnBitfield3Present() && orderExecutionV2ReturnBitfield3.orderExecutionV2ReturnBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the DisplayIndicator put it on the wire.
     *
     * <p>Decode reads the DisplayIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayIndicator is on the wire
     */
    public boolean displayIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionV2ReturnBitfield3Present() && orderExecutionV2ReturnBitfield3.orderExecutionV2ReturnBitfield3DisplayIndicator());
    }

    /**
     * Returns whether the fields before the MaxFloor put it on the wire.
     *
     * <p>Decode reads the MaxFloor where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaxFloor is on the wire
     */
    public boolean maxFloorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionV2ReturnBitfield3Present() && orderExecutionV2ReturnBitfield3.orderExecutionV2ReturnBitfield3MaxFloor());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionV2ReturnBitfield3Present() && orderExecutionV2ReturnBitfield3.orderExecutionV2ReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderExecutionV2ReturnBitfield3Present() && orderExecutionV2ReturnBitfield3.orderExecutionV2ReturnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the SecondaryOrderId put it on the wire.
     *
     * <p>Decode reads the SecondaryOrderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecondaryOrderId is on the wire
     */
    public boolean secondaryOrderIdPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderExecutionV2ReturnBitfield6Present() && orderExecutionV2ReturnBitfield6.orderExecutionV2ReturnBitfield6SecondaryOrderId());
    }

    /**
     * Returns whether the fields before the CentralCounterparty put it on the wire.
     *
     * <p>Decode reads the CentralCounterparty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CentralCounterparty is on the wire
     */
    public boolean centralCounterpartyPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderExecutionV2ReturnBitfield6Present() && orderExecutionV2ReturnBitfield6.orderExecutionV2ReturnBitfield6CentralCounterparty());
    }

    /**
     * Returns whether the fields before the ExtExecInst put it on the wire.
     *
     * <p>Decode reads the ExtExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExtExecInst is on the wire
     */
    public boolean extExecInstPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderExecutionV2ReturnBitfield6Present() && orderExecutionV2ReturnBitfield6.orderExecutionV2ReturnBitfield6ExtExecInst());
    }

    /**
     * Returns whether the fields before the LastMkt put it on the wire.
     *
     * <p>Decode reads the LastMkt where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastMkt is on the wire
     */
    public boolean lastMktPresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (orderExecutionV2ReturnBitfield7Present() && orderExecutionV2ReturnBitfield7.orderExecutionV2ReturnBitfield7LastMkt());
    }

    /**
     * Returns whether the fields before the FeeCode put it on the wire.
     *
     * <p>Decode reads the FeeCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FeeCode is on the wire
     */
    public boolean feeCodePresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderExecutionV2ReturnBitfield8Present() && orderExecutionV2ReturnBitfield8.orderExecutionV2ReturnBitfield8FeeCode());
    }

    /**
     * Returns whether the fields before the RoutingInst put it on the wire.
     *
     * <p>Decode reads the RoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingInst is on the wire
     */
    public boolean routingInstPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (orderExecutionV2ReturnBitfield8Present() && orderExecutionV2ReturnBitfield8.orderExecutionV2ReturnBitfield8RoutingInst());
    }

    /**
     * Returns whether the fields before the LiquidityProvision put it on the wire.
     *
     * <p>Decode reads the LiquidityProvision where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LiquidityProvision is on the wire
     */
    public boolean liquidityProvisionPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderExecutionV2ReturnBitfield9Present() && orderExecutionV2ReturnBitfield9.orderExecutionV2ReturnBitfield9LiquidityProvision());
    }

    /**
     * Returns whether the fields before the WaiverType put it on the wire.
     *
     * <p>Decode reads the WaiverType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the WaiverType is on the wire
     */
    public boolean waiverTypePresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderExecutionV2ReturnBitfield10Present() && orderExecutionV2ReturnBitfield10.orderExecutionV2ReturnBitfield10WaiverType());
    }

    /**
     * Returns whether the fields before the ClientQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ClientQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientQualifiedRole is on the wire
     */
    public boolean clientQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderExecutionV2ReturnBitfield10Present() && orderExecutionV2ReturnBitfield10.orderExecutionV2ReturnBitfield10ClientQualifiedRole());
    }

    /**
     * Returns whether the fields before the ClientId put it on the wire.
     *
     * <p>Decode reads the ClientId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientId is on the wire
     */
    public boolean clientIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderExecutionV2ReturnBitfield11Present() && orderExecutionV2ReturnBitfield11.orderExecutionV2ReturnBitfield11ClientId());
    }

    /**
     * Returns whether the fields before the InvestorId put it on the wire.
     *
     * <p>Decode reads the InvestorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorId is on the wire
     */
    public boolean investorIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderExecutionV2ReturnBitfield11Present() && orderExecutionV2ReturnBitfield11.orderExecutionV2ReturnBitfield11InvestorId());
    }

    /**
     * Returns whether the fields before the ExecutorId put it on the wire.
     *
     * <p>Decode reads the ExecutorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorId is on the wire
     */
    public boolean executorIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderExecutionV2ReturnBitfield11Present() && orderExecutionV2ReturnBitfield11.orderExecutionV2ReturnBitfield11ExecutorId());
    }

    /**
     * Returns whether the fields before the OrderOrigination put it on the wire.
     *
     * <p>Decode reads the OrderOrigination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigination is on the wire
     */
    public boolean orderOriginationPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderExecutionV2ReturnBitfield11Present() && orderExecutionV2ReturnBitfield11.orderExecutionV2ReturnBitfield11OrderOrigination());
    }

    /**
     * Returns whether the fields before the AlgorithmicIndicator put it on the wire.
     *
     * <p>Decode reads the AlgorithmicIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AlgorithmicIndicator is on the wire
     */
    public boolean algorithmicIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderExecutionV2ReturnBitfield11Present() && orderExecutionV2ReturnBitfield11.orderExecutionV2ReturnBitfield11AlgorithmicIndicator());
    }

    /**
     * Returns whether the fields before the InvestorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the InvestorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorQualifiedRole is on the wire
     */
    public boolean investorQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderExecutionV2ReturnBitfield11Present() && orderExecutionV2ReturnBitfield11.orderExecutionV2ReturnBitfield11InvestorQualifiedRole());
    }

    /**
     * Returns whether the fields before the ExecutorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ExecutorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorQualifiedRole is on the wire
     */
    public boolean executorQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderExecutionV2ReturnBitfield11Present() && orderExecutionV2ReturnBitfield11.orderExecutionV2ReturnBitfield11ExecutorQualifiedRole());
    }

    private boolean onWire(Field field) {
        return (field != orderExecutionV2ReturnBitfield1 || orderExecutionV2ReturnBitfield1Present()) && (field != orderExecutionV2ReturnBitfield2 || orderExecutionV2ReturnBitfield2Present()) && (field != orderExecutionV2ReturnBitfield3 || orderExecutionV2ReturnBitfield3Present()) && (field != orderExecutionV2ReturnBitfield4 || orderExecutionV2ReturnBitfield4Present()) && (field != orderExecutionV2ReturnBitfield5 || orderExecutionV2ReturnBitfield5Present()) && (field != orderExecutionV2ReturnBitfield6 || orderExecutionV2ReturnBitfield6Present()) && (field != orderExecutionV2ReturnBitfield7 || orderExecutionV2ReturnBitfield7Present()) && (field != orderExecutionV2ReturnBitfield8 || orderExecutionV2ReturnBitfield8Present()) && (field != orderExecutionV2ReturnBitfield9 || orderExecutionV2ReturnBitfield9Present()) && (field != orderExecutionV2ReturnBitfield10 || orderExecutionV2ReturnBitfield10Present()) && (field != orderExecutionV2ReturnBitfield11 || orderExecutionV2ReturnBitfield11Present()) && (field != orderExecutionV2ReturnBitfield12 || orderExecutionV2ReturnBitfield12Present()) && (field != orderExecutionV2ReturnBitfield13 || orderExecutionV2ReturnBitfield13Present()) && (field != orderExecutionV2ReturnBitfield14 || orderExecutionV2ReturnBitfield14Present()) && (field != orderExecutionV2ReturnBitfield15 || orderExecutionV2ReturnBitfield15Present()) && (field != orderExecutionV2ReturnBitfield16 || orderExecutionV2ReturnBitfield16Present()) && (field != orderExecutionV2ReturnBitfield17 || orderExecutionV2ReturnBitfield17Present()) && (field != orderExecutionV2ReturnBitfield18 || orderExecutionV2ReturnBitfield18Present()) && (field != side || sidePresent()) && (field != pegDifference || pegDifferencePresent()) && (field != price || pricePresent()) && (field != execInst || execInstPresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbol || symbolPresent()) && (field != currency || currencyPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != securityExchange || securityExchangePresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != displayIndicator || displayIndicatorPresent()) && (field != maxFloor || maxFloorPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != secondaryOrderId || secondaryOrderIdPresent()) && (field != centralCounterparty || centralCounterpartyPresent()) && (field != extExecInst || extExecInstPresent()) && (field != lastMkt || lastMktPresent()) && (field != feeCode || feeCodePresent()) && (field != routingInst || routingInstPresent()) && (field != liquidityProvision || liquidityProvisionPresent()) && (field != waiverType || waiverTypePresent()) && (field != clientQualifiedRole || clientQualifiedRolePresent()) && (field != clientId || clientIdPresent()) && (field != investorId || investorIdPresent()) && (field != executorId || executorIdPresent()) && (field != orderOrigination || orderOriginationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent()) && (field != investorQualifiedRole || investorQualifiedRolePresent()) && (field != executorQualifiedRole || executorQualifiedRolePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderExecutionV2ReturnBitfield1Present() ? OrderExecutionV2ReturnBitfield1Field.BYTE_LENGTH : 0) + (orderExecutionV2ReturnBitfield2Present() ? OrderExecutionV2ReturnBitfield2Field.BYTE_LENGTH : 0) + (orderExecutionV2ReturnBitfield3Present() ? OrderExecutionV2ReturnBitfield3Field.BYTE_LENGTH : 0) + (orderExecutionV2ReturnBitfield4Present() ? OrderExecutionV2ReturnBitfield4Field.BYTE_LENGTH : 0) + (orderExecutionV2ReturnBitfield5Present() ? OrderExecutionV2ReturnBitfield5Field.BYTE_LENGTH : 0) + (orderExecutionV2ReturnBitfield6Present() ? OrderExecutionV2ReturnBitfield6Field.BYTE_LENGTH : 0) + (orderExecutionV2ReturnBitfield7Present() ? OrderExecutionV2ReturnBitfield7Field.BYTE_LENGTH : 0) + (orderExecutionV2ReturnBitfield8Present() ? OrderExecutionV2ReturnBitfield8Field.BYTE_LENGTH : 0) + (orderExecutionV2ReturnBitfield9Present() ? OrderExecutionV2ReturnBitfield9Field.BYTE_LENGTH : 0) + (orderExecutionV2ReturnBitfield10Present() ? OrderExecutionV2ReturnBitfield10Field.BYTE_LENGTH : 0) + (orderExecutionV2ReturnBitfield11Present() ? OrderExecutionV2ReturnBitfield11Field.BYTE_LENGTH : 0) + (orderExecutionV2ReturnBitfield12Present() ? OrderExecutionV2ReturnBitfield12Field.BYTE_LENGTH : 0) + (orderExecutionV2ReturnBitfield13Present() ? OrderExecutionV2ReturnBitfield13Field.BYTE_LENGTH : 0) + (orderExecutionV2ReturnBitfield14Present() ? OrderExecutionV2ReturnBitfield14Field.BYTE_LENGTH : 0) + (orderExecutionV2ReturnBitfield15Present() ? OrderExecutionV2ReturnBitfield15Field.BYTE_LENGTH : 0) + (orderExecutionV2ReturnBitfield16Present() ? OrderExecutionV2ReturnBitfield16Field.BYTE_LENGTH : 0) + (orderExecutionV2ReturnBitfield17Present() ? OrderExecutionV2ReturnBitfield17Field.BYTE_LENGTH : 0) + (orderExecutionV2ReturnBitfield18Present() ? OrderExecutionV2ReturnBitfield18Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pegDifferencePresent() ? PegDifferenceField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (currencyPresent() ? CurrencyField.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (securityExchangePresent() ? SecurityExchangeField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (displayIndicatorPresent() ? DisplayIndicatorField.BYTE_LENGTH : 0) + (maxFloorPresent() ? MaxFloorField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (secondaryOrderIdPresent() ? SecondaryOrderIdField.BYTE_LENGTH : 0) + (centralCounterpartyPresent() ? CentralCounterpartyField.BYTE_LENGTH : 0) + (extExecInstPresent() ? ExtExecInstField.BYTE_LENGTH : 0) + (lastMktPresent() ? LastMktField.BYTE_LENGTH : 0) + (feeCodePresent() ? FeeCodeField.BYTE_LENGTH : 0) + (routingInstPresent() ? RoutingInstField.BYTE_LENGTH : 0) + (liquidityProvisionPresent() ? LiquidityProvisionField.BYTE_LENGTH : 0) + (waiverTypePresent() ? WaiverTypeField.BYTE_LENGTH : 0) + (clientQualifiedRolePresent() ? ClientQualifiedRoleField.BYTE_LENGTH : 0) + (clientIdPresent() ? ClientIdField.BYTE_LENGTH : 0) + (investorIdPresent() ? InvestorIdField.BYTE_LENGTH : 0) + (executorIdPresent() ? ExecutorIdField.BYTE_LENGTH : 0) + (orderOriginationPresent() ? OrderOriginationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0) + (investorQualifiedRolePresent() ? InvestorQualifiedRoleField.BYTE_LENGTH : 0) + (executorQualifiedRolePresent() ? ExecutorQualifiedRoleField.BYTE_LENGTH : 0);
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
        cursor += 4;
        cursor += 8;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 4;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (orderExecutionV2ReturnBitfield1Present()) {
            cursor += 1;
        }
        if (orderExecutionV2ReturnBitfield2Present()) {
            cursor += 1;
        }
        if (orderExecutionV2ReturnBitfield3Present()) {
            cursor += 1;
        }
        if (orderExecutionV2ReturnBitfield4Present()) {
            cursor += 1;
        }
        if (orderExecutionV2ReturnBitfield5Present()) {
            cursor += 1;
        }
        if (orderExecutionV2ReturnBitfield6Present()) {
            cursor += 1;
        }
        if (orderExecutionV2ReturnBitfield7Present()) {
            cursor += 1;
        }
        if (orderExecutionV2ReturnBitfield8Present()) {
            cursor += 1;
        }
        if (orderExecutionV2ReturnBitfield9Present()) {
            cursor += 1;
        }
        if (orderExecutionV2ReturnBitfield10Present()) {
            cursor += 1;
        }
        if (orderExecutionV2ReturnBitfield11Present()) {
            cursor += 1;
        }
        if (orderExecutionV2ReturnBitfield12Present()) {
            cursor += 1;
        }
        if (orderExecutionV2ReturnBitfield13Present()) {
            cursor += 1;
        }
        if (orderExecutionV2ReturnBitfield14Present()) {
            cursor += 1;
        }
        if (orderExecutionV2ReturnBitfield15Present()) {
            cursor += 1;
        }
        if (orderExecutionV2ReturnBitfield16Present()) {
            cursor += 1;
        }
        if (orderExecutionV2ReturnBitfield17Present()) {
            cursor += 1;
        }
        if (orderExecutionV2ReturnBitfield18Present()) {
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
        if (symbolPresent()) {
            cursor += 8;
        }
        if (currencyPresent()) {
            cursor += 3;
        }
        if (idSourcePresent()) {
            cursor += 1;
        }
        if (securityIdPresent()) {
            cursor += 16;
        }
        if (securityExchangePresent()) {
            cursor += 4;
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
        if (maxFloorPresent()) {
            cursor += 4;
        }
        if (orderQtyPresent()) {
            cursor += 4;
        }
        if (preventMatchPresent()) {
            cursor += 3;
        }
        if (secondaryOrderIdPresent()) {
            cursor += 8;
        }
        if (centralCounterpartyPresent()) {
            cursor += 1;
        }
        if (extExecInstPresent()) {
            cursor += 1;
        }
        if (lastMktPresent()) {
            cursor += 4;
        }
        if (feeCodePresent()) {
            cursor += 2;
        }
        if (routingInstPresent()) {
            cursor += 4;
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
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!lastShares.parse(data, cursor)) {
            return false;
        }
        cursor += LastSharesField.BYTE_LENGTH;
        if (!lastPxBinaryPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxBinaryPriceField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!baseLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
        if (!subLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SubLiquidityIndicatorField.BYTE_LENGTH;
        if (!contraBroker.parse(data, cursor)) {
            return false;
        }
        cursor += ContraBrokerField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (orderExecutionV2ReturnBitfield1Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield1Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionV2ReturnBitfield2Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield2Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionV2ReturnBitfield3Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield3Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionV2ReturnBitfield4Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield4Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionV2ReturnBitfield5Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield5Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionV2ReturnBitfield6Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield6Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionV2ReturnBitfield7Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield7Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionV2ReturnBitfield8Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield8Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionV2ReturnBitfield9Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield9Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionV2ReturnBitfield10Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield10Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionV2ReturnBitfield11Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield11Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionV2ReturnBitfield12Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield12Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionV2ReturnBitfield13Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield13Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionV2ReturnBitfield14Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield14Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionV2ReturnBitfield15Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield15Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionV2ReturnBitfield16Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield16Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionV2ReturnBitfield17Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield17Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderExecutionV2ReturnBitfield18Present()) {
            if (end - cursor < OrderExecutionV2ReturnBitfield18Field.BYTE_LENGTH || !orderExecutionV2ReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += OrderExecutionV2ReturnBitfield18Field.BYTE_LENGTH;
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
        if (symbolPresent()) {
            if (end - cursor < SymbolField.BYTE_LENGTH || !symbol.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (currencyPresent()) {
            if (end - cursor < CurrencyField.BYTE_LENGTH || !currency.parse(data, cursor)) {
                return false;
            }
            cursor += CurrencyField.BYTE_LENGTH;
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
        if (securityExchangePresent()) {
            if (end - cursor < SecurityExchangeField.BYTE_LENGTH || !securityExchange.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityExchangeField.BYTE_LENGTH;
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
        if (secondaryOrderIdPresent()) {
            if (end - cursor < SecondaryOrderIdField.BYTE_LENGTH || !secondaryOrderId.parse(data, cursor)) {
                return false;
            }
            cursor += SecondaryOrderIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (centralCounterpartyPresent()) {
            if (end - cursor < CentralCounterpartyField.BYTE_LENGTH || !centralCounterparty.parse(data, cursor)) {
                return false;
            }
            cursor += CentralCounterpartyField.BYTE_LENGTH;
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
        if (lastMktPresent()) {
            if (end - cursor < LastMktField.BYTE_LENGTH || !lastMkt.parse(data, cursor)) {
                return false;
            }
            cursor += LastMktField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (feeCodePresent()) {
            if (end - cursor < FeeCodeField.BYTE_LENGTH || !feeCode.parse(data, cursor)) {
                return false;
            }
            cursor += FeeCodeField.BYTE_LENGTH;
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
        if (orderExecutionV2ReturnBitfield1Present() != orderExecutionV2ReturnBitfield1.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield1.hasValue() ? "orderExecutionV2ReturnBitfield1 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionV2ReturnBitfield2Present() != orderExecutionV2ReturnBitfield2.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield2.hasValue() ? "orderExecutionV2ReturnBitfield2 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionV2ReturnBitfield3Present() != orderExecutionV2ReturnBitfield3.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield3.hasValue() ? "orderExecutionV2ReturnBitfield3 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionV2ReturnBitfield4Present() != orderExecutionV2ReturnBitfield4.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield4.hasValue() ? "orderExecutionV2ReturnBitfield4 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionV2ReturnBitfield5Present() != orderExecutionV2ReturnBitfield5.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield5.hasValue() ? "orderExecutionV2ReturnBitfield5 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionV2ReturnBitfield6Present() != orderExecutionV2ReturnBitfield6.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield6.hasValue() ? "orderExecutionV2ReturnBitfield6 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionV2ReturnBitfield7Present() != orderExecutionV2ReturnBitfield7.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield7.hasValue() ? "orderExecutionV2ReturnBitfield7 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionV2ReturnBitfield8Present() != orderExecutionV2ReturnBitfield8.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield8.hasValue() ? "orderExecutionV2ReturnBitfield8 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionV2ReturnBitfield9Present() != orderExecutionV2ReturnBitfield9.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield9.hasValue() ? "orderExecutionV2ReturnBitfield9 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionV2ReturnBitfield10Present() != orderExecutionV2ReturnBitfield10.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield10.hasValue() ? "orderExecutionV2ReturnBitfield10 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionV2ReturnBitfield11Present() != orderExecutionV2ReturnBitfield11.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield11.hasValue() ? "orderExecutionV2ReturnBitfield11 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionV2ReturnBitfield12Present() != orderExecutionV2ReturnBitfield12.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield12.hasValue() ? "orderExecutionV2ReturnBitfield12 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionV2ReturnBitfield13Present() != orderExecutionV2ReturnBitfield13.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield13.hasValue() ? "orderExecutionV2ReturnBitfield13 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionV2ReturnBitfield14Present() != orderExecutionV2ReturnBitfield14.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield14.hasValue() ? "orderExecutionV2ReturnBitfield14 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionV2ReturnBitfield15Present() != orderExecutionV2ReturnBitfield15.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield15.hasValue() ? "orderExecutionV2ReturnBitfield15 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionV2ReturnBitfield16Present() != orderExecutionV2ReturnBitfield16.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield16.hasValue() ? "orderExecutionV2ReturnBitfield16 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionV2ReturnBitfield17Present() != orderExecutionV2ReturnBitfield17.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield17.hasValue() ? "orderExecutionV2ReturnBitfield17 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (orderExecutionV2ReturnBitfield18Present() != orderExecutionV2ReturnBitfield18.hasValue()) {
            throw new IllegalStateException(orderExecutionV2ReturnBitfield18.hasValue() ? "orderExecutionV2ReturnBitfield18 holds a value the fields before it leave off the wire" : "orderExecutionV2ReturnBitfield18 holds no value, though the fields before it put it on the wire");
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
        if (symbolPresent() != symbol.hasValue()) {
            throw new IllegalStateException(symbol.hasValue() ? "symbol holds a value the fields before it leave off the wire" : "symbol holds no value, though the fields before it put it on the wire");
        }
        if (currencyPresent() != currency.hasValue()) {
            throw new IllegalStateException(currency.hasValue() ? "currency holds a value the fields before it leave off the wire" : "currency holds no value, though the fields before it put it on the wire");
        }
        if (idSourcePresent() != idSource.hasValue()) {
            throw new IllegalStateException(idSource.hasValue() ? "idSource holds a value the fields before it leave off the wire" : "idSource holds no value, though the fields before it put it on the wire");
        }
        if (securityIdPresent() != securityId.hasValue()) {
            throw new IllegalStateException(securityId.hasValue() ? "securityId holds a value the fields before it leave off the wire" : "securityId holds no value, though the fields before it put it on the wire");
        }
        if (securityExchangePresent() != securityExchange.hasValue()) {
            throw new IllegalStateException(securityExchange.hasValue() ? "securityExchange holds a value the fields before it leave off the wire" : "securityExchange holds no value, though the fields before it put it on the wire");
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
        if (maxFloorPresent() != maxFloor.hasValue()) {
            throw new IllegalStateException(maxFloor.hasValue() ? "maxFloor holds a value the fields before it leave off the wire" : "maxFloor holds no value, though the fields before it put it on the wire");
        }
        if (orderQtyPresent() != orderQty.hasValue()) {
            throw new IllegalStateException(orderQty.hasValue() ? "orderQty holds a value the fields before it leave off the wire" : "orderQty holds no value, though the fields before it put it on the wire");
        }
        if (preventMatchPresent() != preventMatch.hasValue()) {
            throw new IllegalStateException(preventMatch.hasValue() ? "preventMatch holds a value the fields before it leave off the wire" : "preventMatch holds no value, though the fields before it put it on the wire");
        }
        if (secondaryOrderIdPresent() != secondaryOrderId.hasValue()) {
            throw new IllegalStateException(secondaryOrderId.hasValue() ? "secondaryOrderId holds a value the fields before it leave off the wire" : "secondaryOrderId holds no value, though the fields before it put it on the wire");
        }
        if (centralCounterpartyPresent() != centralCounterparty.hasValue()) {
            throw new IllegalStateException(centralCounterparty.hasValue() ? "centralCounterparty holds a value the fields before it leave off the wire" : "centralCounterparty holds no value, though the fields before it put it on the wire");
        }
        if (extExecInstPresent() != extExecInst.hasValue()) {
            throw new IllegalStateException(extExecInst.hasValue() ? "extExecInst holds a value the fields before it leave off the wire" : "extExecInst holds no value, though the fields before it put it on the wire");
        }
        if (lastMktPresent() != lastMkt.hasValue()) {
            throw new IllegalStateException(lastMkt.hasValue() ? "lastMkt holds a value the fields before it leave off the wire" : "lastMkt holds no value, though the fields before it put it on the wire");
        }
        if (feeCodePresent() != feeCode.hasValue()) {
            throw new IllegalStateException(feeCode.hasValue() ? "feeCode holds a value the fields before it leave off the wire" : "feeCode holds no value, though the fields before it put it on the wire");
        }
        if (routingInstPresent() != routingInst.hasValue()) {
            throw new IllegalStateException(routingInst.hasValue() ? "routingInst holds a value the fields before it leave off the wire" : "routingInst holds no value, though the fields before it put it on the wire");
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
        cursor = execId.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = lastPxBinaryPrice.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = baseLiquidityIndicator.encode(data, cursor);
        cursor = subLiquidityIndicator.encode(data, cursor);
        cursor = contraBroker.encode(data, cursor);
        if (buffer != null && buffer.length >= 59) {
            System.arraycopy(buffer, 58, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (orderExecutionV2ReturnBitfield1Present()) {
            cursor = orderExecutionV2ReturnBitfield1.encode(data, cursor);
        }
        if (orderExecutionV2ReturnBitfield2Present()) {
            cursor = orderExecutionV2ReturnBitfield2.encode(data, cursor);
        }
        if (orderExecutionV2ReturnBitfield3Present()) {
            cursor = orderExecutionV2ReturnBitfield3.encode(data, cursor);
        }
        if (orderExecutionV2ReturnBitfield4Present()) {
            cursor = orderExecutionV2ReturnBitfield4.encode(data, cursor);
        }
        if (orderExecutionV2ReturnBitfield5Present()) {
            cursor = orderExecutionV2ReturnBitfield5.encode(data, cursor);
        }
        if (orderExecutionV2ReturnBitfield6Present()) {
            cursor = orderExecutionV2ReturnBitfield6.encode(data, cursor);
        }
        if (orderExecutionV2ReturnBitfield7Present()) {
            cursor = orderExecutionV2ReturnBitfield7.encode(data, cursor);
        }
        if (orderExecutionV2ReturnBitfield8Present()) {
            cursor = orderExecutionV2ReturnBitfield8.encode(data, cursor);
        }
        if (orderExecutionV2ReturnBitfield9Present()) {
            cursor = orderExecutionV2ReturnBitfield9.encode(data, cursor);
        }
        if (orderExecutionV2ReturnBitfield10Present()) {
            cursor = orderExecutionV2ReturnBitfield10.encode(data, cursor);
        }
        if (orderExecutionV2ReturnBitfield11Present()) {
            cursor = orderExecutionV2ReturnBitfield11.encode(data, cursor);
        }
        if (orderExecutionV2ReturnBitfield12Present()) {
            cursor = orderExecutionV2ReturnBitfield12.encode(data, cursor);
        }
        if (orderExecutionV2ReturnBitfield13Present()) {
            cursor = orderExecutionV2ReturnBitfield13.encode(data, cursor);
        }
        if (orderExecutionV2ReturnBitfield14Present()) {
            cursor = orderExecutionV2ReturnBitfield14.encode(data, cursor);
        }
        if (orderExecutionV2ReturnBitfield15Present()) {
            cursor = orderExecutionV2ReturnBitfield15.encode(data, cursor);
        }
        if (orderExecutionV2ReturnBitfield16Present()) {
            cursor = orderExecutionV2ReturnBitfield16.encode(data, cursor);
        }
        if (orderExecutionV2ReturnBitfield17Present()) {
            cursor = orderExecutionV2ReturnBitfield17.encode(data, cursor);
        }
        if (orderExecutionV2ReturnBitfield18Present()) {
            cursor = orderExecutionV2ReturnBitfield18.encode(data, cursor);
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
        if (symbolPresent()) {
            cursor = symbol.encode(data, cursor);
        }
        if (currencyPresent()) {
            cursor = currency.encode(data, cursor);
        }
        if (idSourcePresent()) {
            cursor = idSource.encode(data, cursor);
        }
        if (securityIdPresent()) {
            cursor = securityId.encode(data, cursor);
        }
        if (securityExchangePresent()) {
            cursor = securityExchange.encode(data, cursor);
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
        if (maxFloorPresent()) {
            cursor = maxFloor.encode(data, cursor);
        }
        if (orderQtyPresent()) {
            cursor = orderQty.encode(data, cursor);
        }
        if (preventMatchPresent()) {
            cursor = preventMatch.encode(data, cursor);
        }
        if (secondaryOrderIdPresent()) {
            cursor = secondaryOrderId.encode(data, cursor);
        }
        if (centralCounterpartyPresent()) {
            cursor = centralCounterparty.encode(data, cursor);
        }
        if (extExecInstPresent()) {
            cursor = extExecInst.encode(data, cursor);
        }
        if (lastMktPresent()) {
            cursor = lastMkt.encode(data, cursor);
        }
        if (feeCodePresent()) {
            cursor = feeCode.encode(data, cursor);
        }
        if (routingInstPresent()) {
            cursor = routingInst.encode(data, cursor);
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
            case "ExecId" -> Optional.of(execId);
            case "LastShares" -> Optional.of(lastShares);
            case "LastPxBinaryPrice" -> Optional.of(lastPxBinaryPrice);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "SubLiquidityIndicator" -> Optional.of(subLiquidityIndicator);
            case "ContraBroker" -> Optional.of(contraBroker);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "OrderExecutionV2ReturnBitfield1" -> Optional.of(orderExecutionV2ReturnBitfield1);
            case "OrderExecutionV2ReturnBitfield2" -> Optional.of(orderExecutionV2ReturnBitfield2);
            case "OrderExecutionV2ReturnBitfield3" -> Optional.of(orderExecutionV2ReturnBitfield3);
            case "OrderExecutionV2ReturnBitfield4" -> Optional.of(orderExecutionV2ReturnBitfield4);
            case "OrderExecutionV2ReturnBitfield5" -> Optional.of(orderExecutionV2ReturnBitfield5);
            case "OrderExecutionV2ReturnBitfield6" -> Optional.of(orderExecutionV2ReturnBitfield6);
            case "OrderExecutionV2ReturnBitfield7" -> Optional.of(orderExecutionV2ReturnBitfield7);
            case "OrderExecutionV2ReturnBitfield8" -> Optional.of(orderExecutionV2ReturnBitfield8);
            case "OrderExecutionV2ReturnBitfield9" -> Optional.of(orderExecutionV2ReturnBitfield9);
            case "OrderExecutionV2ReturnBitfield10" -> Optional.of(orderExecutionV2ReturnBitfield10);
            case "OrderExecutionV2ReturnBitfield11" -> Optional.of(orderExecutionV2ReturnBitfield11);
            case "OrderExecutionV2ReturnBitfield12" -> Optional.of(orderExecutionV2ReturnBitfield12);
            case "OrderExecutionV2ReturnBitfield13" -> Optional.of(orderExecutionV2ReturnBitfield13);
            case "OrderExecutionV2ReturnBitfield14" -> Optional.of(orderExecutionV2ReturnBitfield14);
            case "OrderExecutionV2ReturnBitfield15" -> Optional.of(orderExecutionV2ReturnBitfield15);
            case "OrderExecutionV2ReturnBitfield16" -> Optional.of(orderExecutionV2ReturnBitfield16);
            case "OrderExecutionV2ReturnBitfield17" -> Optional.of(orderExecutionV2ReturnBitfield17);
            case "OrderExecutionV2ReturnBitfield18" -> Optional.of(orderExecutionV2ReturnBitfield18);
            case "Side" -> Optional.of(side);
            case "PegDifference" -> Optional.of(pegDifference);
            case "Price" -> Optional.of(price);
            case "ExecInst" -> Optional.of(execInst);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "Symbol" -> Optional.of(symbol);
            case "Currency" -> Optional.of(currency);
            case "IdSource" -> Optional.of(idSource);
            case "SecurityId" -> Optional.of(securityId);
            case "SecurityExchange" -> Optional.of(securityExchange);
            case "Capacity" -> Optional.of(capacity);
            case "Account" -> Optional.of(account);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "DisplayIndicator" -> Optional.of(displayIndicator);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "OrderQty" -> Optional.of(orderQty);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "SecondaryOrderId" -> Optional.of(secondaryOrderId);
            case "CentralCounterparty" -> Optional.of(centralCounterparty);
            case "ExtExecInst" -> Optional.of(extExecInst);
            case "LastMkt" -> Optional.of(lastMkt);
            case "FeeCode" -> Optional.of(feeCode);
            case "RoutingInst" -> Optional.of(routingInst);
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
        if (!(other instanceof OrderExecutionV2Message message)) {
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
        if (!(other instanceof OrderExecutionV2Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
