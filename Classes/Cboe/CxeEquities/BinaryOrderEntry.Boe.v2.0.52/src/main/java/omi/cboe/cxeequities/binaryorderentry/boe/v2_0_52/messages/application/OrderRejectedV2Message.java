package omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.AccountField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.AlgorithmicIndicatorField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.CapacityField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.ClOrdIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.ClearingAccountField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.ClearingFirmField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.ClientIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.ClientQualifiedRoleField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.CurrencyField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.DisplayIndicatorField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.ExecInstField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.ExecutorIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.ExecutorQualifiedRoleField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.IdSourceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.InvestorIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.InvestorQualifiedRoleField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.LiquidityProvisionField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.MaxFloorField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.MinQtyField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrdTypeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderOriginationField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderQtyField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectReasonField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield10Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield11Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield12Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield13Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield14Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield15Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield16Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield17Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield18Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield1Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield2Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield3Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield4Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield5Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield6Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield7Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield8Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.OrderRejectedV2ReturnBitfield9Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.PegDifferenceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.PreventMatchField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.PriceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.SecondaryOrderIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.SecurityExchangeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.SecurityIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.SideField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.SymbolField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.TextField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.TimeInForceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.TransactionTimeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.types.Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.types.Message;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.types.PrintOptions;

/**
 * Represents the OrderRejectedV2Message message from the BinaryOrderEntry protocol.
 *
 * <p>Order Rejected V2 Message.</p>
 */
public final class OrderRejectedV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 91;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Rejected V 2 Message";

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Reason for an order rejection. See Reason Codes (§ 8, p. 110) for a list of possible reasons.
     */
    private final OrderRejectReasonField orderRejectReason = new OrderRejectReasonField();

    /**
     * Human readable text with more information about the reject reason.
     */
    private final TextField text = new TextField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet OrderRejectedV2 byte 1.
     */
    private final OrderRejectedV2ReturnBitfield1Field orderRejectedV2ReturnBitfield1 = new OrderRejectedV2ReturnBitfield1Field();

    /**
     * BitSet OrderRejectedV2 byte 2.
     */
    private final OrderRejectedV2ReturnBitfield2Field orderRejectedV2ReturnBitfield2 = new OrderRejectedV2ReturnBitfield2Field();

    /**
     * BitSet OrderRejectedV2 byte 3.
     */
    private final OrderRejectedV2ReturnBitfield3Field orderRejectedV2ReturnBitfield3 = new OrderRejectedV2ReturnBitfield3Field();

    /**
     * BitSet OrderRejectedV2 byte 4.
     */
    private final OrderRejectedV2ReturnBitfield4Field orderRejectedV2ReturnBitfield4 = new OrderRejectedV2ReturnBitfield4Field();

    /**
     * BitSet OrderRejectedV2 byte 5.
     */
    private final OrderRejectedV2ReturnBitfield5Field orderRejectedV2ReturnBitfield5 = new OrderRejectedV2ReturnBitfield5Field();

    /**
     * BitSet OrderRejectedV2 byte 6.
     */
    private final OrderRejectedV2ReturnBitfield6Field orderRejectedV2ReturnBitfield6 = new OrderRejectedV2ReturnBitfield6Field();

    /**
     * BitSet OrderRejectedV2 byte 7.
     */
    private final OrderRejectedV2ReturnBitfield7Field orderRejectedV2ReturnBitfield7 = new OrderRejectedV2ReturnBitfield7Field();

    /**
     * BitSet OrderRejectedV2 byte 8.
     */
    private final OrderRejectedV2ReturnBitfield8Field orderRejectedV2ReturnBitfield8 = new OrderRejectedV2ReturnBitfield8Field();

    /**
     * BitSet OrderRejectedV2 byte 9.
     */
    private final OrderRejectedV2ReturnBitfield9Field orderRejectedV2ReturnBitfield9 = new OrderRejectedV2ReturnBitfield9Field();

    /**
     * BitSet OrderRejectedV2 byte 10.
     */
    private final OrderRejectedV2ReturnBitfield10Field orderRejectedV2ReturnBitfield10 = new OrderRejectedV2ReturnBitfield10Field();

    /**
     * BitSet OrderRejectedV2 byte 11.
     */
    private final OrderRejectedV2ReturnBitfield11Field orderRejectedV2ReturnBitfield11 = new OrderRejectedV2ReturnBitfield11Field();

    /**
     * BitSet OrderRejectedV2 byte 12.
     */
    private final OrderRejectedV2ReturnBitfield12Field orderRejectedV2ReturnBitfield12 = new OrderRejectedV2ReturnBitfield12Field();

    /**
     * BitSet OrderRejectedV2 byte 13.
     */
    private final OrderRejectedV2ReturnBitfield13Field orderRejectedV2ReturnBitfield13 = new OrderRejectedV2ReturnBitfield13Field();

    /**
     * BitSet OrderRejectedV2 byte 14.
     */
    private final OrderRejectedV2ReturnBitfield14Field orderRejectedV2ReturnBitfield14 = new OrderRejectedV2ReturnBitfield14Field();

    /**
     * BitSet OrderRejectedV2 byte 15.
     */
    private final OrderRejectedV2ReturnBitfield15Field orderRejectedV2ReturnBitfield15 = new OrderRejectedV2ReturnBitfield15Field();

    /**
     * BitSet OrderRejectedV2 byte 16.
     */
    private final OrderRejectedV2ReturnBitfield16Field orderRejectedV2ReturnBitfield16 = new OrderRejectedV2ReturnBitfield16Field();

    /**
     * BitSet OrderRejectedV2 byte 17.
     */
    private final OrderRejectedV2ReturnBitfield17Field orderRejectedV2ReturnBitfield17 = new OrderRejectedV2ReturnBitfield17Field();

    /**
     * BitSet OrderRejectedV2 byte 18.
     */
    private final OrderRejectedV2ReturnBitfield18Field orderRejectedV2ReturnBitfield18 = new OrderRejectedV2ReturnBitfield18Field();

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
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, orderRejectReason, text, numberOfReturnBitfields, orderRejectedV2ReturnBitfield1, orderRejectedV2ReturnBitfield2, orderRejectedV2ReturnBitfield3, orderRejectedV2ReturnBitfield4, orderRejectedV2ReturnBitfield5, orderRejectedV2ReturnBitfield6, orderRejectedV2ReturnBitfield7, orderRejectedV2ReturnBitfield8, orderRejectedV2ReturnBitfield9, orderRejectedV2ReturnBitfield10, orderRejectedV2ReturnBitfield11, orderRejectedV2ReturnBitfield12, orderRejectedV2ReturnBitfield13, orderRejectedV2ReturnBitfield14, orderRejectedV2ReturnBitfield15, orderRejectedV2ReturnBitfield16, orderRejectedV2ReturnBitfield17, orderRejectedV2ReturnBitfield18, side, pegDifference, price, execInst, ordType, timeInForce, minQty, symbol, currency, idSource, securityId, securityExchange, capacity, account, clearingFirm, clearingAccount, displayIndicator, maxFloor, orderQty, preventMatch, secondaryOrderId, liquidityProvision, clientQualifiedRole, clientId, investorId, executorId, orderOrigination, algorithmicIndicator, investorQualifiedRole, executorQualifiedRole);

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
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Reason for an order rejection. See Reason Codes (§ 8, p. 110) for a list of possible reasons.
     *
     * @return the OrderRejectReason field
     */
    public OrderRejectReasonField orderRejectReason() {
        return orderRejectReason;
    }

    /**
     * Human readable text with more information about the reject reason.
     *
     * @return the Text field
     */
    public TextField text() {
        return text;
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
     * BitSet OrderRejectedV2 byte 1.
     *
     * @return the OrderRejectedV2ReturnBitfield1 field
     */
    public OrderRejectedV2ReturnBitfield1Field orderRejectedV2ReturnBitfield1() {
        return orderRejectedV2ReturnBitfield1;
    }

    /**
     * BitSet OrderRejectedV2 byte 2.
     *
     * @return the OrderRejectedV2ReturnBitfield2 field
     */
    public OrderRejectedV2ReturnBitfield2Field orderRejectedV2ReturnBitfield2() {
        return orderRejectedV2ReturnBitfield2;
    }

    /**
     * BitSet OrderRejectedV2 byte 3.
     *
     * @return the OrderRejectedV2ReturnBitfield3 field
     */
    public OrderRejectedV2ReturnBitfield3Field orderRejectedV2ReturnBitfield3() {
        return orderRejectedV2ReturnBitfield3;
    }

    /**
     * BitSet OrderRejectedV2 byte 4.
     *
     * @return the OrderRejectedV2ReturnBitfield4 field
     */
    public OrderRejectedV2ReturnBitfield4Field orderRejectedV2ReturnBitfield4() {
        return orderRejectedV2ReturnBitfield4;
    }

    /**
     * BitSet OrderRejectedV2 byte 5.
     *
     * @return the OrderRejectedV2ReturnBitfield5 field
     */
    public OrderRejectedV2ReturnBitfield5Field orderRejectedV2ReturnBitfield5() {
        return orderRejectedV2ReturnBitfield5;
    }

    /**
     * BitSet OrderRejectedV2 byte 6.
     *
     * @return the OrderRejectedV2ReturnBitfield6 field
     */
    public OrderRejectedV2ReturnBitfield6Field orderRejectedV2ReturnBitfield6() {
        return orderRejectedV2ReturnBitfield6;
    }

    /**
     * BitSet OrderRejectedV2 byte 7.
     *
     * @return the OrderRejectedV2ReturnBitfield7 field
     */
    public OrderRejectedV2ReturnBitfield7Field orderRejectedV2ReturnBitfield7() {
        return orderRejectedV2ReturnBitfield7;
    }

    /**
     * BitSet OrderRejectedV2 byte 8.
     *
     * @return the OrderRejectedV2ReturnBitfield8 field
     */
    public OrderRejectedV2ReturnBitfield8Field orderRejectedV2ReturnBitfield8() {
        return orderRejectedV2ReturnBitfield8;
    }

    /**
     * BitSet OrderRejectedV2 byte 9.
     *
     * @return the OrderRejectedV2ReturnBitfield9 field
     */
    public OrderRejectedV2ReturnBitfield9Field orderRejectedV2ReturnBitfield9() {
        return orderRejectedV2ReturnBitfield9;
    }

    /**
     * BitSet OrderRejectedV2 byte 10.
     *
     * @return the OrderRejectedV2ReturnBitfield10 field
     */
    public OrderRejectedV2ReturnBitfield10Field orderRejectedV2ReturnBitfield10() {
        return orderRejectedV2ReturnBitfield10;
    }

    /**
     * BitSet OrderRejectedV2 byte 11.
     *
     * @return the OrderRejectedV2ReturnBitfield11 field
     */
    public OrderRejectedV2ReturnBitfield11Field orderRejectedV2ReturnBitfield11() {
        return orderRejectedV2ReturnBitfield11;
    }

    /**
     * BitSet OrderRejectedV2 byte 12.
     *
     * @return the OrderRejectedV2ReturnBitfield12 field
     */
    public OrderRejectedV2ReturnBitfield12Field orderRejectedV2ReturnBitfield12() {
        return orderRejectedV2ReturnBitfield12;
    }

    /**
     * BitSet OrderRejectedV2 byte 13.
     *
     * @return the OrderRejectedV2ReturnBitfield13 field
     */
    public OrderRejectedV2ReturnBitfield13Field orderRejectedV2ReturnBitfield13() {
        return orderRejectedV2ReturnBitfield13;
    }

    /**
     * BitSet OrderRejectedV2 byte 14.
     *
     * @return the OrderRejectedV2ReturnBitfield14 field
     */
    public OrderRejectedV2ReturnBitfield14Field orderRejectedV2ReturnBitfield14() {
        return orderRejectedV2ReturnBitfield14;
    }

    /**
     * BitSet OrderRejectedV2 byte 15.
     *
     * @return the OrderRejectedV2ReturnBitfield15 field
     */
    public OrderRejectedV2ReturnBitfield15Field orderRejectedV2ReturnBitfield15() {
        return orderRejectedV2ReturnBitfield15;
    }

    /**
     * BitSet OrderRejectedV2 byte 16.
     *
     * @return the OrderRejectedV2ReturnBitfield16 field
     */
    public OrderRejectedV2ReturnBitfield16Field orderRejectedV2ReturnBitfield16() {
        return orderRejectedV2ReturnBitfield16;
    }

    /**
     * BitSet OrderRejectedV2 byte 17.
     *
     * @return the OrderRejectedV2ReturnBitfield17 field
     */
    public OrderRejectedV2ReturnBitfield17Field orderRejectedV2ReturnBitfield17() {
        return orderRejectedV2ReturnBitfield17;
    }

    /**
     * BitSet OrderRejectedV2 byte 18.
     *
     * @return the OrderRejectedV2ReturnBitfield18 field
     */
    public OrderRejectedV2ReturnBitfield18Field orderRejectedV2ReturnBitfield18() {
        return orderRejectedV2ReturnBitfield18;
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
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield1 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield2 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield3 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield4 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield5 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield6 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield7 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield8 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield9 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield10 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield11 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield12 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield13 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield14 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield15 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield16 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield17 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the OrderRejectedV2ReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the OrderRejectedV2ReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderRejectedV2ReturnBitfield18 is on the wire
     */
    public boolean orderRejectedV2ReturnBitfield18Present() {
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
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedV2ReturnBitfield1Present() && orderRejectedV2ReturnBitfield1.orderRejectedV2ReturnBitfield1Side());
    }

    /**
     * Returns whether the fields before the PegDifference put it on the wire.
     *
     * <p>Decode reads the PegDifference where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PegDifference is on the wire
     */
    public boolean pegDifferencePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedV2ReturnBitfield1Present() && orderRejectedV2ReturnBitfield1.orderRejectedV2ReturnBitfield1PegDifference());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedV2ReturnBitfield1Present() && orderRejectedV2ReturnBitfield1.orderRejectedV2ReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedV2ReturnBitfield1Present() && orderRejectedV2ReturnBitfield1.orderRejectedV2ReturnBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedV2ReturnBitfield1Present() && orderRejectedV2ReturnBitfield1.orderRejectedV2ReturnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedV2ReturnBitfield1Present() && orderRejectedV2ReturnBitfield1.orderRejectedV2ReturnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (orderRejectedV2ReturnBitfield1Present() && orderRejectedV2ReturnBitfield1.orderRejectedV2ReturnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderRejectedV2ReturnBitfield2Present() && orderRejectedV2ReturnBitfield2.orderRejectedV2ReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Currency put it on the wire.
     *
     * <p>Decode reads the Currency where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Currency is on the wire
     */
    public boolean currencyPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderRejectedV2ReturnBitfield2Present() && orderRejectedV2ReturnBitfield2.orderRejectedV2ReturnBitfield2Currency());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderRejectedV2ReturnBitfield2Present() && orderRejectedV2ReturnBitfield2.orderRejectedV2ReturnBitfield2IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderRejectedV2ReturnBitfield2Present() && orderRejectedV2ReturnBitfield2.orderRejectedV2ReturnBitfield2SecurityId());
    }

    /**
     * Returns whether the fields before the SecurityExchange put it on the wire.
     *
     * <p>Decode reads the SecurityExchange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityExchange is on the wire
     */
    public boolean securityExchangePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderRejectedV2ReturnBitfield2Present() && orderRejectedV2ReturnBitfield2.orderRejectedV2ReturnBitfield2SecurityExchange());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (orderRejectedV2ReturnBitfield2Present() && orderRejectedV2ReturnBitfield2.orderRejectedV2ReturnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedV2ReturnBitfield3Present() && orderRejectedV2ReturnBitfield3.orderRejectedV2ReturnBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedV2ReturnBitfield3Present() && orderRejectedV2ReturnBitfield3.orderRejectedV2ReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedV2ReturnBitfield3Present() && orderRejectedV2ReturnBitfield3.orderRejectedV2ReturnBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the DisplayIndicator put it on the wire.
     *
     * <p>Decode reads the DisplayIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayIndicator is on the wire
     */
    public boolean displayIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedV2ReturnBitfield3Present() && orderRejectedV2ReturnBitfield3.orderRejectedV2ReturnBitfield3DisplayIndicator());
    }

    /**
     * Returns whether the fields before the MaxFloor put it on the wire.
     *
     * <p>Decode reads the MaxFloor where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaxFloor is on the wire
     */
    public boolean maxFloorPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedV2ReturnBitfield3Present() && orderRejectedV2ReturnBitfield3.orderRejectedV2ReturnBitfield3MaxFloor());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedV2ReturnBitfield3Present() && orderRejectedV2ReturnBitfield3.orderRejectedV2ReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (orderRejectedV2ReturnBitfield3Present() && orderRejectedV2ReturnBitfield3.orderRejectedV2ReturnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the SecondaryOrderId put it on the wire.
     *
     * <p>Decode reads the SecondaryOrderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecondaryOrderId is on the wire
     */
    public boolean secondaryOrderIdPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (orderRejectedV2ReturnBitfield6Present() && orderRejectedV2ReturnBitfield6.orderRejectedV2ReturnBitfield6SecondaryOrderId());
    }

    /**
     * Returns whether the fields before the LiquidityProvision put it on the wire.
     *
     * <p>Decode reads the LiquidityProvision where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LiquidityProvision is on the wire
     */
    public boolean liquidityProvisionPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (orderRejectedV2ReturnBitfield9Present() && orderRejectedV2ReturnBitfield9.orderRejectedV2ReturnBitfield9LiquidityProvision());
    }

    /**
     * Returns whether the fields before the ClientQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ClientQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientQualifiedRole is on the wire
     */
    public boolean clientQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (orderRejectedV2ReturnBitfield10Present() && orderRejectedV2ReturnBitfield10.orderRejectedV2ReturnBitfield10ClientQualifiedRole());
    }

    /**
     * Returns whether the fields before the ClientId put it on the wire.
     *
     * <p>Decode reads the ClientId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientId is on the wire
     */
    public boolean clientIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderRejectedV2ReturnBitfield11Present() && orderRejectedV2ReturnBitfield11.orderRejectedV2ReturnBitfield11ClientId());
    }

    /**
     * Returns whether the fields before the InvestorId put it on the wire.
     *
     * <p>Decode reads the InvestorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorId is on the wire
     */
    public boolean investorIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderRejectedV2ReturnBitfield11Present() && orderRejectedV2ReturnBitfield11.orderRejectedV2ReturnBitfield11InvestorId());
    }

    /**
     * Returns whether the fields before the ExecutorId put it on the wire.
     *
     * <p>Decode reads the ExecutorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorId is on the wire
     */
    public boolean executorIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderRejectedV2ReturnBitfield11Present() && orderRejectedV2ReturnBitfield11.orderRejectedV2ReturnBitfield11ExecutorId());
    }

    /**
     * Returns whether the fields before the OrderOrigination put it on the wire.
     *
     * <p>Decode reads the OrderOrigination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigination is on the wire
     */
    public boolean orderOriginationPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderRejectedV2ReturnBitfield11Present() && orderRejectedV2ReturnBitfield11.orderRejectedV2ReturnBitfield11OrderOrigination());
    }

    /**
     * Returns whether the fields before the AlgorithmicIndicator put it on the wire.
     *
     * <p>Decode reads the AlgorithmicIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AlgorithmicIndicator is on the wire
     */
    public boolean algorithmicIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderRejectedV2ReturnBitfield11Present() && orderRejectedV2ReturnBitfield11.orderRejectedV2ReturnBitfield11AlgorithmicIndicator());
    }

    /**
     * Returns whether the fields before the InvestorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the InvestorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorQualifiedRole is on the wire
     */
    public boolean investorQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderRejectedV2ReturnBitfield11Present() && orderRejectedV2ReturnBitfield11.orderRejectedV2ReturnBitfield11InvestorQualifiedRole());
    }

    /**
     * Returns whether the fields before the ExecutorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ExecutorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorQualifiedRole is on the wire
     */
    public boolean executorQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (orderRejectedV2ReturnBitfield11Present() && orderRejectedV2ReturnBitfield11.orderRejectedV2ReturnBitfield11ExecutorQualifiedRole());
    }

    private boolean onWire(Field field) {
        return (field != orderRejectedV2ReturnBitfield1 || orderRejectedV2ReturnBitfield1Present()) && (field != orderRejectedV2ReturnBitfield2 || orderRejectedV2ReturnBitfield2Present()) && (field != orderRejectedV2ReturnBitfield3 || orderRejectedV2ReturnBitfield3Present()) && (field != orderRejectedV2ReturnBitfield4 || orderRejectedV2ReturnBitfield4Present()) && (field != orderRejectedV2ReturnBitfield5 || orderRejectedV2ReturnBitfield5Present()) && (field != orderRejectedV2ReturnBitfield6 || orderRejectedV2ReturnBitfield6Present()) && (field != orderRejectedV2ReturnBitfield7 || orderRejectedV2ReturnBitfield7Present()) && (field != orderRejectedV2ReturnBitfield8 || orderRejectedV2ReturnBitfield8Present()) && (field != orderRejectedV2ReturnBitfield9 || orderRejectedV2ReturnBitfield9Present()) && (field != orderRejectedV2ReturnBitfield10 || orderRejectedV2ReturnBitfield10Present()) && (field != orderRejectedV2ReturnBitfield11 || orderRejectedV2ReturnBitfield11Present()) && (field != orderRejectedV2ReturnBitfield12 || orderRejectedV2ReturnBitfield12Present()) && (field != orderRejectedV2ReturnBitfield13 || orderRejectedV2ReturnBitfield13Present()) && (field != orderRejectedV2ReturnBitfield14 || orderRejectedV2ReturnBitfield14Present()) && (field != orderRejectedV2ReturnBitfield15 || orderRejectedV2ReturnBitfield15Present()) && (field != orderRejectedV2ReturnBitfield16 || orderRejectedV2ReturnBitfield16Present()) && (field != orderRejectedV2ReturnBitfield17 || orderRejectedV2ReturnBitfield17Present()) && (field != orderRejectedV2ReturnBitfield18 || orderRejectedV2ReturnBitfield18Present()) && (field != side || sidePresent()) && (field != pegDifference || pegDifferencePresent()) && (field != price || pricePresent()) && (field != execInst || execInstPresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbol || symbolPresent()) && (field != currency || currencyPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != securityExchange || securityExchangePresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != displayIndicator || displayIndicatorPresent()) && (field != maxFloor || maxFloorPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != secondaryOrderId || secondaryOrderIdPresent()) && (field != liquidityProvision || liquidityProvisionPresent()) && (field != clientQualifiedRole || clientQualifiedRolePresent()) && (field != clientId || clientIdPresent()) && (field != investorId || investorIdPresent()) && (field != executorId || executorIdPresent()) && (field != orderOrigination || orderOriginationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent()) && (field != investorQualifiedRole || investorQualifiedRolePresent()) && (field != executorQualifiedRole || executorQualifiedRolePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderRejectedV2ReturnBitfield1Present() ? OrderRejectedV2ReturnBitfield1Field.BYTE_LENGTH : 0) + (orderRejectedV2ReturnBitfield2Present() ? OrderRejectedV2ReturnBitfield2Field.BYTE_LENGTH : 0) + (orderRejectedV2ReturnBitfield3Present() ? OrderRejectedV2ReturnBitfield3Field.BYTE_LENGTH : 0) + (orderRejectedV2ReturnBitfield4Present() ? OrderRejectedV2ReturnBitfield4Field.BYTE_LENGTH : 0) + (orderRejectedV2ReturnBitfield5Present() ? OrderRejectedV2ReturnBitfield5Field.BYTE_LENGTH : 0) + (orderRejectedV2ReturnBitfield6Present() ? OrderRejectedV2ReturnBitfield6Field.BYTE_LENGTH : 0) + (orderRejectedV2ReturnBitfield7Present() ? OrderRejectedV2ReturnBitfield7Field.BYTE_LENGTH : 0) + (orderRejectedV2ReturnBitfield8Present() ? OrderRejectedV2ReturnBitfield8Field.BYTE_LENGTH : 0) + (orderRejectedV2ReturnBitfield9Present() ? OrderRejectedV2ReturnBitfield9Field.BYTE_LENGTH : 0) + (orderRejectedV2ReturnBitfield10Present() ? OrderRejectedV2ReturnBitfield10Field.BYTE_LENGTH : 0) + (orderRejectedV2ReturnBitfield11Present() ? OrderRejectedV2ReturnBitfield11Field.BYTE_LENGTH : 0) + (orderRejectedV2ReturnBitfield12Present() ? OrderRejectedV2ReturnBitfield12Field.BYTE_LENGTH : 0) + (orderRejectedV2ReturnBitfield13Present() ? OrderRejectedV2ReturnBitfield13Field.BYTE_LENGTH : 0) + (orderRejectedV2ReturnBitfield14Present() ? OrderRejectedV2ReturnBitfield14Field.BYTE_LENGTH : 0) + (orderRejectedV2ReturnBitfield15Present() ? OrderRejectedV2ReturnBitfield15Field.BYTE_LENGTH : 0) + (orderRejectedV2ReturnBitfield16Present() ? OrderRejectedV2ReturnBitfield16Field.BYTE_LENGTH : 0) + (orderRejectedV2ReturnBitfield17Present() ? OrderRejectedV2ReturnBitfield17Field.BYTE_LENGTH : 0) + (orderRejectedV2ReturnBitfield18Present() ? OrderRejectedV2ReturnBitfield18Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pegDifferencePresent() ? PegDifferenceField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (currencyPresent() ? CurrencyField.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (securityExchangePresent() ? SecurityExchangeField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (displayIndicatorPresent() ? DisplayIndicatorField.BYTE_LENGTH : 0) + (maxFloorPresent() ? MaxFloorField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (secondaryOrderIdPresent() ? SecondaryOrderIdField.BYTE_LENGTH : 0) + (liquidityProvisionPresent() ? LiquidityProvisionField.BYTE_LENGTH : 0) + (clientQualifiedRolePresent() ? ClientQualifiedRoleField.BYTE_LENGTH : 0) + (clientIdPresent() ? ClientIdField.BYTE_LENGTH : 0) + (investorIdPresent() ? InvestorIdField.BYTE_LENGTH : 0) + (executorIdPresent() ? ExecutorIdField.BYTE_LENGTH : 0) + (orderOriginationPresent() ? OrderOriginationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0) + (investorQualifiedRolePresent() ? InvestorQualifiedRoleField.BYTE_LENGTH : 0) + (executorQualifiedRolePresent() ? ExecutorQualifiedRoleField.BYTE_LENGTH : 0);
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
        cursor += 1;
        cursor += 60;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (orderRejectedV2ReturnBitfield1Present()) {
            cursor += 1;
        }
        if (orderRejectedV2ReturnBitfield2Present()) {
            cursor += 1;
        }
        if (orderRejectedV2ReturnBitfield3Present()) {
            cursor += 1;
        }
        if (orderRejectedV2ReturnBitfield4Present()) {
            cursor += 1;
        }
        if (orderRejectedV2ReturnBitfield5Present()) {
            cursor += 1;
        }
        if (orderRejectedV2ReturnBitfield6Present()) {
            cursor += 1;
        }
        if (orderRejectedV2ReturnBitfield7Present()) {
            cursor += 1;
        }
        if (orderRejectedV2ReturnBitfield8Present()) {
            cursor += 1;
        }
        if (orderRejectedV2ReturnBitfield9Present()) {
            cursor += 1;
        }
        if (orderRejectedV2ReturnBitfield10Present()) {
            cursor += 1;
        }
        if (orderRejectedV2ReturnBitfield11Present()) {
            cursor += 1;
        }
        if (orderRejectedV2ReturnBitfield12Present()) {
            cursor += 1;
        }
        if (orderRejectedV2ReturnBitfield13Present()) {
            cursor += 1;
        }
        if (orderRejectedV2ReturnBitfield14Present()) {
            cursor += 1;
        }
        if (orderRejectedV2ReturnBitfield15Present()) {
            cursor += 1;
        }
        if (orderRejectedV2ReturnBitfield16Present()) {
            cursor += 1;
        }
        if (orderRejectedV2ReturnBitfield17Present()) {
            cursor += 1;
        }
        if (orderRejectedV2ReturnBitfield18Present()) {
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
        if (!orderRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += OrderRejectReasonField.BYTE_LENGTH;
        if (!text.parse(data, cursor)) {
            return false;
        }
        cursor += TextField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (orderRejectedV2ReturnBitfield1Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield1Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedV2ReturnBitfield2Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield2Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedV2ReturnBitfield3Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield3Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedV2ReturnBitfield4Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield4Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedV2ReturnBitfield5Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield5Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedV2ReturnBitfield6Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield6Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedV2ReturnBitfield7Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield7Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedV2ReturnBitfield8Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield8Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedV2ReturnBitfield9Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield9Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedV2ReturnBitfield10Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield10Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedV2ReturnBitfield11Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield11Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedV2ReturnBitfield12Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield12Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedV2ReturnBitfield13Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield13Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedV2ReturnBitfield14Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield14Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedV2ReturnBitfield15Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield15Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedV2ReturnBitfield16Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield16Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedV2ReturnBitfield17Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield17Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderRejectedV2ReturnBitfield18Present()) {
            if (end - cursor < OrderRejectedV2ReturnBitfield18Field.BYTE_LENGTH || !orderRejectedV2ReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += OrderRejectedV2ReturnBitfield18Field.BYTE_LENGTH;
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

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (orderRejectedV2ReturnBitfield1Present() != orderRejectedV2ReturnBitfield1.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield1.hasValue() ? "orderRejectedV2ReturnBitfield1 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedV2ReturnBitfield2Present() != orderRejectedV2ReturnBitfield2.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield2.hasValue() ? "orderRejectedV2ReturnBitfield2 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedV2ReturnBitfield3Present() != orderRejectedV2ReturnBitfield3.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield3.hasValue() ? "orderRejectedV2ReturnBitfield3 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedV2ReturnBitfield4Present() != orderRejectedV2ReturnBitfield4.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield4.hasValue() ? "orderRejectedV2ReturnBitfield4 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedV2ReturnBitfield5Present() != orderRejectedV2ReturnBitfield5.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield5.hasValue() ? "orderRejectedV2ReturnBitfield5 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedV2ReturnBitfield6Present() != orderRejectedV2ReturnBitfield6.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield6.hasValue() ? "orderRejectedV2ReturnBitfield6 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedV2ReturnBitfield7Present() != orderRejectedV2ReturnBitfield7.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield7.hasValue() ? "orderRejectedV2ReturnBitfield7 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedV2ReturnBitfield8Present() != orderRejectedV2ReturnBitfield8.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield8.hasValue() ? "orderRejectedV2ReturnBitfield8 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedV2ReturnBitfield9Present() != orderRejectedV2ReturnBitfield9.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield9.hasValue() ? "orderRejectedV2ReturnBitfield9 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedV2ReturnBitfield10Present() != orderRejectedV2ReturnBitfield10.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield10.hasValue() ? "orderRejectedV2ReturnBitfield10 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedV2ReturnBitfield11Present() != orderRejectedV2ReturnBitfield11.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield11.hasValue() ? "orderRejectedV2ReturnBitfield11 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedV2ReturnBitfield12Present() != orderRejectedV2ReturnBitfield12.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield12.hasValue() ? "orderRejectedV2ReturnBitfield12 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedV2ReturnBitfield13Present() != orderRejectedV2ReturnBitfield13.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield13.hasValue() ? "orderRejectedV2ReturnBitfield13 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedV2ReturnBitfield14Present() != orderRejectedV2ReturnBitfield14.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield14.hasValue() ? "orderRejectedV2ReturnBitfield14 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedV2ReturnBitfield15Present() != orderRejectedV2ReturnBitfield15.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield15.hasValue() ? "orderRejectedV2ReturnBitfield15 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedV2ReturnBitfield16Present() != orderRejectedV2ReturnBitfield16.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield16.hasValue() ? "orderRejectedV2ReturnBitfield16 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedV2ReturnBitfield17Present() != orderRejectedV2ReturnBitfield17.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield17.hasValue() ? "orderRejectedV2ReturnBitfield17 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (orderRejectedV2ReturnBitfield18Present() != orderRejectedV2ReturnBitfield18.hasValue()) {
            throw new IllegalStateException(orderRejectedV2ReturnBitfield18.hasValue() ? "orderRejectedV2ReturnBitfield18 holds a value the fields before it leave off the wire" : "orderRejectedV2ReturnBitfield18 holds no value, though the fields before it put it on the wire");
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
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderRejectReason.encode(data, cursor);
        cursor = text.encode(data, cursor);
        if (buffer != null && buffer.length >= 90) {
            System.arraycopy(buffer, 89, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (orderRejectedV2ReturnBitfield1Present()) {
            cursor = orderRejectedV2ReturnBitfield1.encode(data, cursor);
        }
        if (orderRejectedV2ReturnBitfield2Present()) {
            cursor = orderRejectedV2ReturnBitfield2.encode(data, cursor);
        }
        if (orderRejectedV2ReturnBitfield3Present()) {
            cursor = orderRejectedV2ReturnBitfield3.encode(data, cursor);
        }
        if (orderRejectedV2ReturnBitfield4Present()) {
            cursor = orderRejectedV2ReturnBitfield4.encode(data, cursor);
        }
        if (orderRejectedV2ReturnBitfield5Present()) {
            cursor = orderRejectedV2ReturnBitfield5.encode(data, cursor);
        }
        if (orderRejectedV2ReturnBitfield6Present()) {
            cursor = orderRejectedV2ReturnBitfield6.encode(data, cursor);
        }
        if (orderRejectedV2ReturnBitfield7Present()) {
            cursor = orderRejectedV2ReturnBitfield7.encode(data, cursor);
        }
        if (orderRejectedV2ReturnBitfield8Present()) {
            cursor = orderRejectedV2ReturnBitfield8.encode(data, cursor);
        }
        if (orderRejectedV2ReturnBitfield9Present()) {
            cursor = orderRejectedV2ReturnBitfield9.encode(data, cursor);
        }
        if (orderRejectedV2ReturnBitfield10Present()) {
            cursor = orderRejectedV2ReturnBitfield10.encode(data, cursor);
        }
        if (orderRejectedV2ReturnBitfield11Present()) {
            cursor = orderRejectedV2ReturnBitfield11.encode(data, cursor);
        }
        if (orderRejectedV2ReturnBitfield12Present()) {
            cursor = orderRejectedV2ReturnBitfield12.encode(data, cursor);
        }
        if (orderRejectedV2ReturnBitfield13Present()) {
            cursor = orderRejectedV2ReturnBitfield13.encode(data, cursor);
        }
        if (orderRejectedV2ReturnBitfield14Present()) {
            cursor = orderRejectedV2ReturnBitfield14.encode(data, cursor);
        }
        if (orderRejectedV2ReturnBitfield15Present()) {
            cursor = orderRejectedV2ReturnBitfield15.encode(data, cursor);
        }
        if (orderRejectedV2ReturnBitfield16Present()) {
            cursor = orderRejectedV2ReturnBitfield16.encode(data, cursor);
        }
        if (orderRejectedV2ReturnBitfield17Present()) {
            cursor = orderRejectedV2ReturnBitfield17.encode(data, cursor);
        }
        if (orderRejectedV2ReturnBitfield18Present()) {
            cursor = orderRejectedV2ReturnBitfield18.encode(data, cursor);
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
            case "OrderRejectReason" -> Optional.of(orderRejectReason);
            case "Text" -> Optional.of(text);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "OrderRejectedV2ReturnBitfield1" -> Optional.of(orderRejectedV2ReturnBitfield1);
            case "OrderRejectedV2ReturnBitfield2" -> Optional.of(orderRejectedV2ReturnBitfield2);
            case "OrderRejectedV2ReturnBitfield3" -> Optional.of(orderRejectedV2ReturnBitfield3);
            case "OrderRejectedV2ReturnBitfield4" -> Optional.of(orderRejectedV2ReturnBitfield4);
            case "OrderRejectedV2ReturnBitfield5" -> Optional.of(orderRejectedV2ReturnBitfield5);
            case "OrderRejectedV2ReturnBitfield6" -> Optional.of(orderRejectedV2ReturnBitfield6);
            case "OrderRejectedV2ReturnBitfield7" -> Optional.of(orderRejectedV2ReturnBitfield7);
            case "OrderRejectedV2ReturnBitfield8" -> Optional.of(orderRejectedV2ReturnBitfield8);
            case "OrderRejectedV2ReturnBitfield9" -> Optional.of(orderRejectedV2ReturnBitfield9);
            case "OrderRejectedV2ReturnBitfield10" -> Optional.of(orderRejectedV2ReturnBitfield10);
            case "OrderRejectedV2ReturnBitfield11" -> Optional.of(orderRejectedV2ReturnBitfield11);
            case "OrderRejectedV2ReturnBitfield12" -> Optional.of(orderRejectedV2ReturnBitfield12);
            case "OrderRejectedV2ReturnBitfield13" -> Optional.of(orderRejectedV2ReturnBitfield13);
            case "OrderRejectedV2ReturnBitfield14" -> Optional.of(orderRejectedV2ReturnBitfield14);
            case "OrderRejectedV2ReturnBitfield15" -> Optional.of(orderRejectedV2ReturnBitfield15);
            case "OrderRejectedV2ReturnBitfield16" -> Optional.of(orderRejectedV2ReturnBitfield16);
            case "OrderRejectedV2ReturnBitfield17" -> Optional.of(orderRejectedV2ReturnBitfield17);
            case "OrderRejectedV2ReturnBitfield18" -> Optional.of(orderRejectedV2ReturnBitfield18);
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
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
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
        if (!(other instanceof OrderRejectedV2Message message)) {
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
        if (!(other instanceof OrderRejectedV2Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
