package omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.AccountField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.AlgorithmicIndicatorField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.CapacityField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.ClOrdIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.ClearingAccountField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.ClearingFirmField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.ClientIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.ClientQualifiedRoleField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.CurrencyField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.DisplayIndicatorField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.ExecInstField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.ExecutorIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.ExecutorQualifiedRoleField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.ExpireTimeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.IdSourceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.InvestorIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.InvestorQualifiedRoleField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.LiquidityProvisionField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.MaxFloorField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.MinQtyField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.NewOrderV2Bitfield1Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.NewOrderV2Bitfield2Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.NewOrderV2Bitfield3Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.NewOrderV2Bitfield4Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.NewOrderV2Bitfield5Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.NewOrderV2Bitfield6Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.NewOrderV2Bitfield7Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.NewOrderV2Bitfield8Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.NumberOfNewOrderV2BitfieldsField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.OrdTypeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.OrderOriginationField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.OrderQtyField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.PegDifferenceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.PreventParticipantMatchField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.PriceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.RoutingInstField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.SecurityExchangeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.SecurityIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.SideField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.SymbolField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.fields.TimeInForceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.types.Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.types.Message;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_41.types.PrintOptions;

/**
 * Represents the NewOrderV2Message message from the BinaryOrderEntry protocol.
 *
 * <p>New Order V2 Message.</p>
 */
public final class NewOrderV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 26;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order V 2 Message";

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell 5 = Sell Short 6 = Sell Short Exempt H = Sell Undisclosed
     */
    private final SideField side = new SideField();

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 99,999,999 shares.
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfNewOrderV2BitfieldsField numberOfNewOrderV2Bitfields = new NumberOfNewOrderV2BitfieldsField();

    /**
     * BitSet NewOrderV2 byte 1.
     */
    private final NewOrderV2Bitfield1Field newOrderV2Bitfield1 = new NewOrderV2Bitfield1Field();

    /**
     * BitSet NewOrderV2 byte 2.
     */
    private final NewOrderV2Bitfield2Field newOrderV2Bitfield2 = new NewOrderV2Bitfield2Field();

    /**
     * BitSet NewOrderV2 byte 3.
     */
    private final NewOrderV2Bitfield3Field newOrderV2Bitfield3 = new NewOrderV2Bitfield3Field();

    /**
     * BitSet NewOrderV2 byte 4.
     */
    private final NewOrderV2Bitfield4Field newOrderV2Bitfield4 = new NewOrderV2Bitfield4Field();

    /**
     * BitSet NewOrderV2 byte 5.
     */
    private final NewOrderV2Bitfield5Field newOrderV2Bitfield5 = new NewOrderV2Bitfield5Field();

    /**
     * BitSet NewOrderV2 byte 6.
     */
    private final NewOrderV2Bitfield6Field newOrderV2Bitfield6 = new NewOrderV2Bitfield6Field();

    /**
     * BitSet NewOrderV2 byte 7.
     */
    private final NewOrderV2Bitfield7Field newOrderV2Bitfield7 = new NewOrderV2Bitfield7Field();

    /**
     * BitSet NewOrderV2 byte 8.
     */
    private final NewOrderV2Bitfield8Field newOrderV2Bitfield8 = new NewOrderV2Bitfield8Field();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Clearing Account
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

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
     * Max Floor
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

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
     * Routing Inst
     */
    private final RoutingInstField routingInst = new RoutingInstField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Display Indicator
     */
    private final DisplayIndicatorField displayIndicator = new DisplayIndicatorField();

    /**
     * Peg Difference
     */
    private final PegDifferenceField pegDifference = new PegDifferenceField();

    /**
     * Prevent Participant Match
     */
    private final PreventParticipantMatchField preventParticipantMatch = new PreventParticipantMatchField();

    /**
     * Expire Time
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Liquidity Provision
     */
    private final LiquidityProvisionField liquidityProvision = new LiquidityProvisionField();

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
     * Client Qualified Role
     */
    private final ClientQualifiedRoleField clientQualifiedRole = new ClientQualifiedRoleField();

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
    private final List<Field> fields = List.of(clOrdId, side, orderQty, numberOfNewOrderV2Bitfields, newOrderV2Bitfield1, newOrderV2Bitfield2, newOrderV2Bitfield3, newOrderV2Bitfield4, newOrderV2Bitfield5, newOrderV2Bitfield6, newOrderV2Bitfield7, newOrderV2Bitfield8, clearingFirm, clearingAccount, price, execInst, ordType, timeInForce, minQty, maxFloor, symbol, currency, idSource, securityId, securityExchange, capacity, routingInst, account, displayIndicator, pegDifference, preventParticipantMatch, expireTime, liquidityProvision, clientId, investorId, executorId, orderOrigination, algorithmicIndicator, clientQualifiedRole, investorQualifiedRole, executorQualifiedRole);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
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
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 99,999,999 shares.
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfNewOrderV2Bitfields field
     */
    public NumberOfNewOrderV2BitfieldsField numberOfNewOrderV2Bitfields() {
        return numberOfNewOrderV2Bitfields;
    }

    /**
     * BitSet NewOrderV2 byte 1.
     *
     * @return the NewOrderV2Bitfield1 field
     */
    public NewOrderV2Bitfield1Field newOrderV2Bitfield1() {
        return newOrderV2Bitfield1;
    }

    /**
     * BitSet NewOrderV2 byte 2.
     *
     * @return the NewOrderV2Bitfield2 field
     */
    public NewOrderV2Bitfield2Field newOrderV2Bitfield2() {
        return newOrderV2Bitfield2;
    }

    /**
     * BitSet NewOrderV2 byte 3.
     *
     * @return the NewOrderV2Bitfield3 field
     */
    public NewOrderV2Bitfield3Field newOrderV2Bitfield3() {
        return newOrderV2Bitfield3;
    }

    /**
     * BitSet NewOrderV2 byte 4.
     *
     * @return the NewOrderV2Bitfield4 field
     */
    public NewOrderV2Bitfield4Field newOrderV2Bitfield4() {
        return newOrderV2Bitfield4;
    }

    /**
     * BitSet NewOrderV2 byte 5.
     *
     * @return the NewOrderV2Bitfield5 field
     */
    public NewOrderV2Bitfield5Field newOrderV2Bitfield5() {
        return newOrderV2Bitfield5;
    }

    /**
     * BitSet NewOrderV2 byte 6.
     *
     * @return the NewOrderV2Bitfield6 field
     */
    public NewOrderV2Bitfield6Field newOrderV2Bitfield6() {
        return newOrderV2Bitfield6;
    }

    /**
     * BitSet NewOrderV2 byte 7.
     *
     * @return the NewOrderV2Bitfield7 field
     */
    public NewOrderV2Bitfield7Field newOrderV2Bitfield7() {
        return newOrderV2Bitfield7;
    }

    /**
     * BitSet NewOrderV2 byte 8.
     *
     * @return the NewOrderV2Bitfield8 field
     */
    public NewOrderV2Bitfield8Field newOrderV2Bitfield8() {
        return newOrderV2Bitfield8;
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
     * Max Floor
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
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
     * Routing Inst
     *
     * @return the RoutingInst field
     */
    public RoutingInstField routingInst() {
        return routingInst;
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
     * Display Indicator
     *
     * @return the DisplayIndicator field
     */
    public DisplayIndicatorField displayIndicator() {
        return displayIndicator;
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
     * Prevent Participant Match
     *
     * @return the PreventParticipantMatch field
     */
    public PreventParticipantMatchField preventParticipantMatch() {
        return preventParticipantMatch;
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
     * Liquidity Provision
     *
     * @return the LiquidityProvision field
     */
    public LiquidityProvisionField liquidityProvision() {
        return liquidityProvision;
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
     * Client Qualified Role
     *
     * @return the ClientQualifiedRole field
     */
    public ClientQualifiedRoleField clientQualifiedRole() {
        return clientQualifiedRole;
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
     * Returns whether the fields before the NewOrderV2Bitfield1 put it on the wire.
     *
     * <p>Decode reads the NewOrderV2Bitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderV2Bitfield1 is on the wire
     */
    public boolean newOrderV2Bitfield1Present() {
        return numberOfNewOrderV2Bitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the NewOrderV2Bitfield2 put it on the wire.
     *
     * <p>Decode reads the NewOrderV2Bitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderV2Bitfield2 is on the wire
     */
    public boolean newOrderV2Bitfield2Present() {
        return numberOfNewOrderV2Bitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the NewOrderV2Bitfield3 put it on the wire.
     *
     * <p>Decode reads the NewOrderV2Bitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderV2Bitfield3 is on the wire
     */
    public boolean newOrderV2Bitfield3Present() {
        return numberOfNewOrderV2Bitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the NewOrderV2Bitfield4 put it on the wire.
     *
     * <p>Decode reads the NewOrderV2Bitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderV2Bitfield4 is on the wire
     */
    public boolean newOrderV2Bitfield4Present() {
        return numberOfNewOrderV2Bitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the NewOrderV2Bitfield5 put it on the wire.
     *
     * <p>Decode reads the NewOrderV2Bitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderV2Bitfield5 is on the wire
     */
    public boolean newOrderV2Bitfield5Present() {
        return numberOfNewOrderV2Bitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the NewOrderV2Bitfield6 put it on the wire.
     *
     * <p>Decode reads the NewOrderV2Bitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderV2Bitfield6 is on the wire
     */
    public boolean newOrderV2Bitfield6Present() {
        return numberOfNewOrderV2Bitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the NewOrderV2Bitfield7 put it on the wire.
     *
     * <p>Decode reads the NewOrderV2Bitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderV2Bitfield7 is on the wire
     */
    public boolean newOrderV2Bitfield7Present() {
        return numberOfNewOrderV2Bitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the NewOrderV2Bitfield8 put it on the wire.
     *
     * <p>Decode reads the NewOrderV2Bitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderV2Bitfield8 is on the wire
     */
    public boolean newOrderV2Bitfield8Present() {
        return numberOfNewOrderV2Bitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 1L) && (newOrderV2Bitfield1Present() && newOrderV2Bitfield1.newOrderV2Bitfield1ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 1L) && (newOrderV2Bitfield1Present() && newOrderV2Bitfield1.newOrderV2Bitfield1ClearingAccount());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 1L) && (newOrderV2Bitfield1Present() && newOrderV2Bitfield1.newOrderV2Bitfield1Price());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 1L) && (newOrderV2Bitfield1Present() && newOrderV2Bitfield1.newOrderV2Bitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 1L) && (newOrderV2Bitfield1Present() && newOrderV2Bitfield1.newOrderV2Bitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 1L) && (newOrderV2Bitfield1Present() && newOrderV2Bitfield1.newOrderV2Bitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 1L) && (newOrderV2Bitfield1Present() && newOrderV2Bitfield1.newOrderV2Bitfield1MinQty());
    }

    /**
     * Returns whether the fields before the MaxFloor put it on the wire.
     *
     * <p>Decode reads the MaxFloor where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaxFloor is on the wire
     */
    public boolean maxFloorPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 1L) && (newOrderV2Bitfield1Present() && newOrderV2Bitfield1.newOrderV2Bitfield1MaxFloor());
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 2L) && (newOrderV2Bitfield2Present() && newOrderV2Bitfield2.newOrderV2Bitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Currency put it on the wire.
     *
     * <p>Decode reads the Currency where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Currency is on the wire
     */
    public boolean currencyPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 2L) && (newOrderV2Bitfield2Present() && newOrderV2Bitfield2.newOrderV2Bitfield2Currency());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 2L) && (newOrderV2Bitfield2Present() && newOrderV2Bitfield2.newOrderV2Bitfield2IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 2L) && (newOrderV2Bitfield2Present() && newOrderV2Bitfield2.newOrderV2Bitfield2SecurityId());
    }

    /**
     * Returns whether the fields before the SecurityExchange put it on the wire.
     *
     * <p>Decode reads the SecurityExchange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityExchange is on the wire
     */
    public boolean securityExchangePresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 2L) && (newOrderV2Bitfield2Present() && newOrderV2Bitfield2.newOrderV2Bitfield2SecurityExchange());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 2L) && (newOrderV2Bitfield2Present() && newOrderV2Bitfield2.newOrderV2Bitfield2Capacity());
    }

    /**
     * Returns whether the fields before the RoutingInst put it on the wire.
     *
     * <p>Decode reads the RoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingInst is on the wire
     */
    public boolean routingInstPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 2L) && (newOrderV2Bitfield2Present() && newOrderV2Bitfield2.newOrderV2Bitfield2RoutingInst());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 3L) && (newOrderV2Bitfield3Present() && newOrderV2Bitfield3.newOrderV2Bitfield3Account());
    }

    /**
     * Returns whether the fields before the DisplayIndicator put it on the wire.
     *
     * <p>Decode reads the DisplayIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayIndicator is on the wire
     */
    public boolean displayIndicatorPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 3L) && (newOrderV2Bitfield3Present() && newOrderV2Bitfield3.newOrderV2Bitfield3DisplayIndicator());
    }

    /**
     * Returns whether the fields before the PegDifference put it on the wire.
     *
     * <p>Decode reads the PegDifference where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PegDifference is on the wire
     */
    public boolean pegDifferencePresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 3L) && (newOrderV2Bitfield3Present() && newOrderV2Bitfield3.newOrderV2Bitfield3PegDifference());
    }

    /**
     * Returns whether the fields before the PreventParticipantMatch put it on the wire.
     *
     * <p>Decode reads the PreventParticipantMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventParticipantMatch is on the wire
     */
    public boolean preventParticipantMatchPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 3L) && (newOrderV2Bitfield3Present() && newOrderV2Bitfield3.newOrderV2Bitfield3PreventParticipantMatch());
    }

    /**
     * Returns whether the fields before the ExpireTime put it on the wire.
     *
     * <p>Decode reads the ExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExpireTime is on the wire
     */
    public boolean expireTimePresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 3L) && (newOrderV2Bitfield3Present() && newOrderV2Bitfield3.newOrderV2Bitfield3ExpireTime());
    }

    /**
     * Returns whether the fields before the LiquidityProvision put it on the wire.
     *
     * <p>Decode reads the LiquidityProvision where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LiquidityProvision is on the wire
     */
    public boolean liquidityProvisionPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 4L) && (newOrderV2Bitfield4Present() && newOrderV2Bitfield4.newOrderV2Bitfield4LiquidityProvision());
    }

    /**
     * Returns whether the fields before the ClientId put it on the wire.
     *
     * <p>Decode reads the ClientId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientId is on the wire
     */
    public boolean clientIdPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 5L) && (newOrderV2Bitfield5Present() && newOrderV2Bitfield5.newOrderV2Bitfield5ClientId());
    }

    /**
     * Returns whether the fields before the InvestorId put it on the wire.
     *
     * <p>Decode reads the InvestorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorId is on the wire
     */
    public boolean investorIdPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 5L) && (newOrderV2Bitfield5Present() && newOrderV2Bitfield5.newOrderV2Bitfield5InvestorId());
    }

    /**
     * Returns whether the fields before the ExecutorId put it on the wire.
     *
     * <p>Decode reads the ExecutorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorId is on the wire
     */
    public boolean executorIdPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 5L) && (newOrderV2Bitfield5Present() && newOrderV2Bitfield5.newOrderV2Bitfield5ExecutorId());
    }

    /**
     * Returns whether the fields before the OrderOrigination put it on the wire.
     *
     * <p>Decode reads the OrderOrigination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigination is on the wire
     */
    public boolean orderOriginationPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 5L) && (newOrderV2Bitfield5Present() && newOrderV2Bitfield5.newOrderV2Bitfield5OrderOrigination());
    }

    /**
     * Returns whether the fields before the AlgorithmicIndicator put it on the wire.
     *
     * <p>Decode reads the AlgorithmicIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AlgorithmicIndicator is on the wire
     */
    public boolean algorithmicIndicatorPresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 7L) && (newOrderV2Bitfield7Present() && newOrderV2Bitfield7.newOrderV2Bitfield7AlgorithmicIndicator());
    }

    /**
     * Returns whether the fields before the ClientQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ClientQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientQualifiedRole is on the wire
     */
    public boolean clientQualifiedRolePresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 7L) && (newOrderV2Bitfield7Present() && newOrderV2Bitfield7.newOrderV2Bitfield7ClientQualifiedRole());
    }

    /**
     * Returns whether the fields before the InvestorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the InvestorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorQualifiedRole is on the wire
     */
    public boolean investorQualifiedRolePresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 7L) && (newOrderV2Bitfield7Present() && newOrderV2Bitfield7.newOrderV2Bitfield7InvestorQualifiedRole());
    }

    /**
     * Returns whether the fields before the ExecutorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ExecutorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorQualifiedRole is on the wire
     */
    public boolean executorQualifiedRolePresent() {
        return (numberOfNewOrderV2Bitfields.value() >= 7L) && (newOrderV2Bitfield7Present() && newOrderV2Bitfield7.newOrderV2Bitfield7ExecutorQualifiedRole());
    }

    private boolean onWire(Field field) {
        return (field != newOrderV2Bitfield1 || newOrderV2Bitfield1Present()) && (field != newOrderV2Bitfield2 || newOrderV2Bitfield2Present()) && (field != newOrderV2Bitfield3 || newOrderV2Bitfield3Present()) && (field != newOrderV2Bitfield4 || newOrderV2Bitfield4Present()) && (field != newOrderV2Bitfield5 || newOrderV2Bitfield5Present()) && (field != newOrderV2Bitfield6 || newOrderV2Bitfield6Present()) && (field != newOrderV2Bitfield7 || newOrderV2Bitfield7Present()) && (field != newOrderV2Bitfield8 || newOrderV2Bitfield8Present()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != price || pricePresent()) && (field != execInst || execInstPresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != maxFloor || maxFloorPresent()) && (field != symbol || symbolPresent()) && (field != currency || currencyPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != securityExchange || securityExchangePresent()) && (field != capacity || capacityPresent()) && (field != routingInst || routingInstPresent()) && (field != account || accountPresent()) && (field != displayIndicator || displayIndicatorPresent()) && (field != pegDifference || pegDifferencePresent()) && (field != preventParticipantMatch || preventParticipantMatchPresent()) && (field != expireTime || expireTimePresent()) && (field != liquidityProvision || liquidityProvisionPresent()) && (field != clientId || clientIdPresent()) && (field != investorId || investorIdPresent()) && (field != executorId || executorIdPresent()) && (field != orderOrigination || orderOriginationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent()) && (field != clientQualifiedRole || clientQualifiedRolePresent()) && (field != investorQualifiedRole || investorQualifiedRolePresent()) && (field != executorQualifiedRole || executorQualifiedRolePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (newOrderV2Bitfield1Present() ? NewOrderV2Bitfield1Field.BYTE_LENGTH : 0) + (newOrderV2Bitfield2Present() ? NewOrderV2Bitfield2Field.BYTE_LENGTH : 0) + (newOrderV2Bitfield3Present() ? NewOrderV2Bitfield3Field.BYTE_LENGTH : 0) + (newOrderV2Bitfield4Present() ? NewOrderV2Bitfield4Field.BYTE_LENGTH : 0) + (newOrderV2Bitfield5Present() ? NewOrderV2Bitfield5Field.BYTE_LENGTH : 0) + (newOrderV2Bitfield6Present() ? NewOrderV2Bitfield6Field.BYTE_LENGTH : 0) + (newOrderV2Bitfield7Present() ? NewOrderV2Bitfield7Field.BYTE_LENGTH : 0) + (newOrderV2Bitfield8Present() ? NewOrderV2Bitfield8Field.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (maxFloorPresent() ? MaxFloorField.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (currencyPresent() ? CurrencyField.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (securityExchangePresent() ? SecurityExchangeField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (routingInstPresent() ? RoutingInstField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (displayIndicatorPresent() ? DisplayIndicatorField.BYTE_LENGTH : 0) + (pegDifferencePresent() ? PegDifferenceField.BYTE_LENGTH : 0) + (preventParticipantMatchPresent() ? PreventParticipantMatchField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (liquidityProvisionPresent() ? LiquidityProvisionField.BYTE_LENGTH : 0) + (clientIdPresent() ? ClientIdField.BYTE_LENGTH : 0) + (investorIdPresent() ? InvestorIdField.BYTE_LENGTH : 0) + (executorIdPresent() ? ExecutorIdField.BYTE_LENGTH : 0) + (orderOriginationPresent() ? OrderOriginationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0) + (clientQualifiedRolePresent() ? ClientQualifiedRoleField.BYTE_LENGTH : 0) + (investorQualifiedRolePresent() ? InvestorQualifiedRoleField.BYTE_LENGTH : 0) + (executorQualifiedRolePresent() ? ExecutorQualifiedRoleField.BYTE_LENGTH : 0);
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(expireTime.value());
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
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!numberOfNewOrderV2Bitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfNewOrderV2BitfieldsField.BYTE_LENGTH;
        if (newOrderV2Bitfield1Present()) {
            if (end - cursor < NewOrderV2Bitfield1Field.BYTE_LENGTH || !newOrderV2Bitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderV2Bitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (newOrderV2Bitfield2Present()) {
            if (end - cursor < NewOrderV2Bitfield2Field.BYTE_LENGTH || !newOrderV2Bitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderV2Bitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (newOrderV2Bitfield3Present()) {
            if (end - cursor < NewOrderV2Bitfield3Field.BYTE_LENGTH || !newOrderV2Bitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderV2Bitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (newOrderV2Bitfield4Present()) {
            if (end - cursor < NewOrderV2Bitfield4Field.BYTE_LENGTH || !newOrderV2Bitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderV2Bitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (newOrderV2Bitfield5Present()) {
            if (end - cursor < NewOrderV2Bitfield5Field.BYTE_LENGTH || !newOrderV2Bitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderV2Bitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (newOrderV2Bitfield6Present()) {
            if (end - cursor < NewOrderV2Bitfield6Field.BYTE_LENGTH || !newOrderV2Bitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderV2Bitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (newOrderV2Bitfield7Present()) {
            if (end - cursor < NewOrderV2Bitfield7Field.BYTE_LENGTH || !newOrderV2Bitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderV2Bitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (newOrderV2Bitfield8Present()) {
            if (end - cursor < NewOrderV2Bitfield8Field.BYTE_LENGTH || !newOrderV2Bitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderV2Bitfield8Field.BYTE_LENGTH;
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
        if (maxFloorPresent()) {
            if (end - cursor < MaxFloorField.BYTE_LENGTH || !maxFloor.parse(data, cursor)) {
                return false;
            }
            cursor += MaxFloorField.BYTE_LENGTH;
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
        if (routingInstPresent()) {
            if (end - cursor < RoutingInstField.BYTE_LENGTH || !routingInst.parse(data, cursor)) {
                return false;
            }
            cursor += RoutingInstField.BYTE_LENGTH;
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
        if (displayIndicatorPresent()) {
            if (end - cursor < DisplayIndicatorField.BYTE_LENGTH || !displayIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += DisplayIndicatorField.BYTE_LENGTH;
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
        if (preventParticipantMatchPresent()) {
            if (end - cursor < PreventParticipantMatchField.BYTE_LENGTH || !preventParticipantMatch.parse(data, cursor)) {
                return false;
            }
            cursor += PreventParticipantMatchField.BYTE_LENGTH;
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
        if (liquidityProvisionPresent()) {
            if (end - cursor < LiquidityProvisionField.BYTE_LENGTH || !liquidityProvision.parse(data, cursor)) {
                return false;
            }
            cursor += LiquidityProvisionField.BYTE_LENGTH;
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
        if (clientQualifiedRolePresent()) {
            if (end - cursor < ClientQualifiedRoleField.BYTE_LENGTH || !clientQualifiedRole.parse(data, cursor)) {
                return false;
            }
            cursor += ClientQualifiedRoleField.BYTE_LENGTH;
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
        if (newOrderV2Bitfield1Present() != newOrderV2Bitfield1.hasValue()) {
            throw new IllegalStateException(newOrderV2Bitfield1.hasValue() ? "newOrderV2Bitfield1 holds a value the fields before it leave off the wire" : "newOrderV2Bitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderV2Bitfield2Present() != newOrderV2Bitfield2.hasValue()) {
            throw new IllegalStateException(newOrderV2Bitfield2.hasValue() ? "newOrderV2Bitfield2 holds a value the fields before it leave off the wire" : "newOrderV2Bitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderV2Bitfield3Present() != newOrderV2Bitfield3.hasValue()) {
            throw new IllegalStateException(newOrderV2Bitfield3.hasValue() ? "newOrderV2Bitfield3 holds a value the fields before it leave off the wire" : "newOrderV2Bitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderV2Bitfield4Present() != newOrderV2Bitfield4.hasValue()) {
            throw new IllegalStateException(newOrderV2Bitfield4.hasValue() ? "newOrderV2Bitfield4 holds a value the fields before it leave off the wire" : "newOrderV2Bitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderV2Bitfield5Present() != newOrderV2Bitfield5.hasValue()) {
            throw new IllegalStateException(newOrderV2Bitfield5.hasValue() ? "newOrderV2Bitfield5 holds a value the fields before it leave off the wire" : "newOrderV2Bitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderV2Bitfield6Present() != newOrderV2Bitfield6.hasValue()) {
            throw new IllegalStateException(newOrderV2Bitfield6.hasValue() ? "newOrderV2Bitfield6 holds a value the fields before it leave off the wire" : "newOrderV2Bitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderV2Bitfield7Present() != newOrderV2Bitfield7.hasValue()) {
            throw new IllegalStateException(newOrderV2Bitfield7.hasValue() ? "newOrderV2Bitfield7 holds a value the fields before it leave off the wire" : "newOrderV2Bitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderV2Bitfield8Present() != newOrderV2Bitfield8.hasValue()) {
            throw new IllegalStateException(newOrderV2Bitfield8.hasValue() ? "newOrderV2Bitfield8 holds a value the fields before it leave off the wire" : "newOrderV2Bitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (clearingAccountPresent() != clearingAccount.hasValue()) {
            throw new IllegalStateException(clearingAccount.hasValue() ? "clearingAccount holds a value the fields before it leave off the wire" : "clearingAccount holds no value, though the fields before it put it on the wire");
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
        if (maxFloorPresent() != maxFloor.hasValue()) {
            throw new IllegalStateException(maxFloor.hasValue() ? "maxFloor holds a value the fields before it leave off the wire" : "maxFloor holds no value, though the fields before it put it on the wire");
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
        if (routingInstPresent() != routingInst.hasValue()) {
            throw new IllegalStateException(routingInst.hasValue() ? "routingInst holds a value the fields before it leave off the wire" : "routingInst holds no value, though the fields before it put it on the wire");
        }
        if (accountPresent() != account.hasValue()) {
            throw new IllegalStateException(account.hasValue() ? "account holds a value the fields before it leave off the wire" : "account holds no value, though the fields before it put it on the wire");
        }
        if (displayIndicatorPresent() != displayIndicator.hasValue()) {
            throw new IllegalStateException(displayIndicator.hasValue() ? "displayIndicator holds a value the fields before it leave off the wire" : "displayIndicator holds no value, though the fields before it put it on the wire");
        }
        if (pegDifferencePresent() != pegDifference.hasValue()) {
            throw new IllegalStateException(pegDifference.hasValue() ? "pegDifference holds a value the fields before it leave off the wire" : "pegDifference holds no value, though the fields before it put it on the wire");
        }
        if (preventParticipantMatchPresent() != preventParticipantMatch.hasValue()) {
            throw new IllegalStateException(preventParticipantMatch.hasValue() ? "preventParticipantMatch holds a value the fields before it leave off the wire" : "preventParticipantMatch holds no value, though the fields before it put it on the wire");
        }
        if (expireTimePresent() != expireTime.hasValue()) {
            throw new IllegalStateException(expireTime.hasValue() ? "expireTime holds a value the fields before it leave off the wire" : "expireTime holds no value, though the fields before it put it on the wire");
        }
        if (liquidityProvisionPresent() != liquidityProvision.hasValue()) {
            throw new IllegalStateException(liquidityProvision.hasValue() ? "liquidityProvision holds a value the fields before it leave off the wire" : "liquidityProvision holds no value, though the fields before it put it on the wire");
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
        if (clientQualifiedRolePresent() != clientQualifiedRole.hasValue()) {
            throw new IllegalStateException(clientQualifiedRole.hasValue() ? "clientQualifiedRole holds a value the fields before it leave off the wire" : "clientQualifiedRole holds no value, though the fields before it put it on the wire");
        }
        if (investorQualifiedRolePresent() != investorQualifiedRole.hasValue()) {
            throw new IllegalStateException(investorQualifiedRole.hasValue() ? "investorQualifiedRole holds a value the fields before it leave off the wire" : "investorQualifiedRole holds no value, though the fields before it put it on the wire");
        }
        if (executorQualifiedRolePresent() != executorQualifiedRole.hasValue()) {
            throw new IllegalStateException(executorQualifiedRole.hasValue() ? "executorQualifiedRole holds a value the fields before it leave off the wire" : "executorQualifiedRole holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = numberOfNewOrderV2Bitfields.encode(data, cursor);
        if (newOrderV2Bitfield1Present()) {
            cursor = newOrderV2Bitfield1.encode(data, cursor);
        }
        if (newOrderV2Bitfield2Present()) {
            cursor = newOrderV2Bitfield2.encode(data, cursor);
        }
        if (newOrderV2Bitfield3Present()) {
            cursor = newOrderV2Bitfield3.encode(data, cursor);
        }
        if (newOrderV2Bitfield4Present()) {
            cursor = newOrderV2Bitfield4.encode(data, cursor);
        }
        if (newOrderV2Bitfield5Present()) {
            cursor = newOrderV2Bitfield5.encode(data, cursor);
        }
        if (newOrderV2Bitfield6Present()) {
            cursor = newOrderV2Bitfield6.encode(data, cursor);
        }
        if (newOrderV2Bitfield7Present()) {
            cursor = newOrderV2Bitfield7.encode(data, cursor);
        }
        if (newOrderV2Bitfield8Present()) {
            cursor = newOrderV2Bitfield8.encode(data, cursor);
        }
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (clearingAccountPresent()) {
            cursor = clearingAccount.encode(data, cursor);
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
        if (maxFloorPresent()) {
            cursor = maxFloor.encode(data, cursor);
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
        if (routingInstPresent()) {
            cursor = routingInst.encode(data, cursor);
        }
        if (accountPresent()) {
            cursor = account.encode(data, cursor);
        }
        if (displayIndicatorPresent()) {
            cursor = displayIndicator.encode(data, cursor);
        }
        if (pegDifferencePresent()) {
            cursor = pegDifference.encode(data, cursor);
        }
        if (preventParticipantMatchPresent()) {
            cursor = preventParticipantMatch.encode(data, cursor);
        }
        if (expireTimePresent()) {
            cursor = expireTime.encode(data, cursor);
        }
        if (liquidityProvisionPresent()) {
            cursor = liquidityProvision.encode(data, cursor);
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
        if (clientQualifiedRolePresent()) {
            cursor = clientQualifiedRole.encode(data, cursor);
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
            case "ClOrdId" -> Optional.of(clOrdId);
            case "Side" -> Optional.of(side);
            case "OrderQty" -> Optional.of(orderQty);
            case "NumberOfNewOrderV2Bitfields" -> Optional.of(numberOfNewOrderV2Bitfields);
            case "NewOrderV2Bitfield1" -> Optional.of(newOrderV2Bitfield1);
            case "NewOrderV2Bitfield2" -> Optional.of(newOrderV2Bitfield2);
            case "NewOrderV2Bitfield3" -> Optional.of(newOrderV2Bitfield3);
            case "NewOrderV2Bitfield4" -> Optional.of(newOrderV2Bitfield4);
            case "NewOrderV2Bitfield5" -> Optional.of(newOrderV2Bitfield5);
            case "NewOrderV2Bitfield6" -> Optional.of(newOrderV2Bitfield6);
            case "NewOrderV2Bitfield7" -> Optional.of(newOrderV2Bitfield7);
            case "NewOrderV2Bitfield8" -> Optional.of(newOrderV2Bitfield8);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "Price" -> Optional.of(price);
            case "ExecInst" -> Optional.of(execInst);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "Symbol" -> Optional.of(symbol);
            case "Currency" -> Optional.of(currency);
            case "IdSource" -> Optional.of(idSource);
            case "SecurityId" -> Optional.of(securityId);
            case "SecurityExchange" -> Optional.of(securityExchange);
            case "Capacity" -> Optional.of(capacity);
            case "RoutingInst" -> Optional.of(routingInst);
            case "Account" -> Optional.of(account);
            case "DisplayIndicator" -> Optional.of(displayIndicator);
            case "PegDifference" -> Optional.of(pegDifference);
            case "PreventParticipantMatch" -> Optional.of(preventParticipantMatch);
            case "ExpireTime" -> Optional.of(expireTime);
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "ClientId" -> Optional.of(clientId);
            case "InvestorId" -> Optional.of(investorId);
            case "ExecutorId" -> Optional.of(executorId);
            case "OrderOrigination" -> Optional.of(orderOrigination);
            case "AlgorithmicIndicator" -> Optional.of(algorithmicIndicator);
            case "ClientQualifiedRole" -> Optional.of(clientQualifiedRole);
            case "InvestorQualifiedRole" -> Optional.of(investorQualifiedRole);
            case "ExecutorQualifiedRole" -> Optional.of(executorQualifiedRole);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderV2Message message)) {
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
        if (!(other instanceof NewOrderV2Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
