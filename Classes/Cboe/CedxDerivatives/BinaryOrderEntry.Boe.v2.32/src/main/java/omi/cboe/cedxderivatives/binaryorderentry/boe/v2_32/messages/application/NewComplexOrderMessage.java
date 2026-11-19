package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.AccountField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.AccountTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.AlgorithmicIndicatorField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.AuctionIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CapacityField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ClOrdIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ClearingAccountField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ClearingFirmField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ClientIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ClientQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CustOrderHandlingInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CustomGroupIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.DisplayIndicatorField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.DrillThruProtectionField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ExecutorIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ExecutorQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ExpireTimeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ExtExecInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.InvestorIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.InvestorQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.LiquidityProvisionField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NewComplexOrderBitfield1Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NewComplexOrderBitfield2Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NewComplexOrderBitfield3Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NewComplexOrderBitfield4Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NewComplexOrderBitfield5Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NewComplexOrderBitfield6Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NewComplexOrderBitfield7Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NewComplexOrderBitfield8Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NoLegsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NumberOfNewComplexOrderBitfieldsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.OrdTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.OrderOriginationField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.OrderQtyField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.PreventMatchField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.PriceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.RiskResetField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.RoutingInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.SideField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.SymbolAlphanumericField2;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.TimeInForceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.groups.ComplexLegOrderInfoEntry;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.groups.ComplexLegOrderInfoList;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.PrintOptions;

/**
 * Represents the NewComplexOrderMessage message from the BinaryOrderEntry protocol.
 *
 * <p>New Complex Order Message.</p>
 */
public final class NewComplexOrderMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 27;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Complex Order Message";

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe (—). A leading tilde (˜) cannot be sent on any ClOrdID and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system-generated ClOrdID. If the ClOrdID matches a live order, the order will be rejected as a duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live or- ders. However, we strongly recommend that you keep your ClOrdID values at least day- unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     */
    private final SideField side = new SideField();

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 con- tracts.
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfNewComplexOrderBitfieldsField numberOfNewComplexOrderBitfields = new NumberOfNewComplexOrderBitfieldsField();

    /**
     * BitSet NewComplexOrder byte 1.
     */
    private final NewComplexOrderBitfield1Field newComplexOrderBitfield1 = new NewComplexOrderBitfield1Field();

    /**
     * BitSet NewComplexOrder byte 2.
     */
    private final NewComplexOrderBitfield2Field newComplexOrderBitfield2 = new NewComplexOrderBitfield2Field();

    /**
     * BitSet NewComplexOrder byte 3.
     */
    private final NewComplexOrderBitfield3Field newComplexOrderBitfield3 = new NewComplexOrderBitfield3Field();

    /**
     * BitSet NewComplexOrder byte 4.
     */
    private final NewComplexOrderBitfield4Field newComplexOrderBitfield4 = new NewComplexOrderBitfield4Field();

    /**
     * BitSet NewComplexOrder byte 5.
     */
    private final NewComplexOrderBitfield5Field newComplexOrderBitfield5 = new NewComplexOrderBitfield5Field();

    /**
     * BitSet NewComplexOrder byte 6.
     */
    private final NewComplexOrderBitfield6Field newComplexOrderBitfield6 = new NewComplexOrderBitfield6Field();

    /**
     * BitSet NewComplexOrder byte 7.
     */
    private final NewComplexOrderBitfield7Field newComplexOrderBitfield7 = new NewComplexOrderBitfield7Field();

    /**
     * BitSet NewComplexOrder byte 8.
     */
    private final NewComplexOrderBitfield8Field newComplexOrderBitfield8 = new NewComplexOrderBitfield8Field();

    /**
     * Corresponds to NoLegs (555) in Cboe FIX. Indicates the number of repeating groups to fol- low. Must be a minimum of 2 and a maximum of 13. However, for orders with AccountType value of 3 (House Trader), it is possible to specify 0 here. In that case, the repeating group ComplexLe- gOrderInfo should not follow, and the LegPosi- tionEffect is defaulted to None (“N”) for each leg.
     */
    private final NoLegsField noLegs = new NoLegsField();

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
     * Ord Type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Time In Force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Symbol Alphanumeric
     */
    private final SymbolAlphanumericField2 symbolAlphanumeric = new SymbolAlphanumericField2();

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
     * Prevent Match
     */
    private final PreventMatchField preventMatch = new PreventMatchField();

    /**
     * Expire Time
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Auction Id
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Drill Thru Protection
     */
    private final DrillThruProtectionField drillThruProtection = new DrillThruProtectionField();

    /**
     * Risk Reset
     */
    private final RiskResetField riskReset = new RiskResetField();

    /**
     * Custom Group Id
     */
    private final CustomGroupIdField customGroupId = new CustomGroupIdField();

    /**
     * Liquidity Provision
     */
    private final LiquidityProvisionField liquidityProvision = new LiquidityProvisionField();

    /**
     * Order Origination
     */
    private final OrderOriginationField orderOrigination = new OrderOriginationField();

    /**
     * Algorithmic Indicator
     */
    private final AlgorithmicIndicatorField algorithmicIndicator = new AlgorithmicIndicatorField();

    /**
     * Client Id
     */
    private final ClientIdField clientId = new ClientIdField();

    /**
     * Client Qualified Role
     */
    private final ClientQualifiedRoleField clientQualifiedRole = new ClientQualifiedRoleField();

    /**
     * Investor Id
     */
    private final InvestorIdField investorId = new InvestorIdField();

    /**
     * Investor Qualified Role
     */
    private final InvestorQualifiedRoleField investorQualifiedRole = new InvestorQualifiedRoleField();

    /**
     * Executor Id
     */
    private final ExecutorIdField executorId = new ExecutorIdField();

    /**
     * Executor Qualified Role
     */
    private final ExecutorQualifiedRoleField executorQualifiedRole = new ExecutorQualifiedRoleField();

    /**
     * Cust Order Handling Inst
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

    /**
     * Account Type
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * Display Indicator
     */
    private final DisplayIndicatorField displayIndicator = new DisplayIndicatorField();

    /**
     * Ext Exec Inst
     */
    private final ExtExecInstField extExecInst = new ExtExecInstField();

    /**
     * Repeating group stated NoLegs times.
     */
    private final ComplexLegOrderInfoList complexLegOrderInfo = new ComplexLegOrderInfoList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clOrdId, side, orderQty, numberOfNewComplexOrderBitfields, newComplexOrderBitfield1, newComplexOrderBitfield2, newComplexOrderBitfield3, newComplexOrderBitfield4, newComplexOrderBitfield5, newComplexOrderBitfield6, newComplexOrderBitfield7, newComplexOrderBitfield8, noLegs, clearingFirm, clearingAccount, price, ordType, timeInForce, symbolAlphanumeric, capacity, routingInst, account, preventMatch, expireTime, auctionId, drillThruProtection, riskReset, customGroupId, liquidityProvision, orderOrigination, algorithmicIndicator, clientId, clientQualifiedRole, investorId, investorQualifiedRole, executorId, executorQualifiedRole, custOrderHandlingInst, accountType, displayIndicator, extExecInst);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe (—). A leading tilde (˜) cannot be sent on any ClOrdID and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system-generated ClOrdID. If the ClOrdID matches a live order, the order will be rejected as a duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live or- ders. However, we strongly recommend that you keep your ClOrdID values at least day- unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
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
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 con- tracts.
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfNewComplexOrderBitfields field
     */
    public NumberOfNewComplexOrderBitfieldsField numberOfNewComplexOrderBitfields() {
        return numberOfNewComplexOrderBitfields;
    }

    /**
     * BitSet NewComplexOrder byte 1.
     *
     * @return the NewComplexOrderBitfield1 field
     */
    public NewComplexOrderBitfield1Field newComplexOrderBitfield1() {
        return newComplexOrderBitfield1;
    }

    /**
     * BitSet NewComplexOrder byte 2.
     *
     * @return the NewComplexOrderBitfield2 field
     */
    public NewComplexOrderBitfield2Field newComplexOrderBitfield2() {
        return newComplexOrderBitfield2;
    }

    /**
     * BitSet NewComplexOrder byte 3.
     *
     * @return the NewComplexOrderBitfield3 field
     */
    public NewComplexOrderBitfield3Field newComplexOrderBitfield3() {
        return newComplexOrderBitfield3;
    }

    /**
     * BitSet NewComplexOrder byte 4.
     *
     * @return the NewComplexOrderBitfield4 field
     */
    public NewComplexOrderBitfield4Field newComplexOrderBitfield4() {
        return newComplexOrderBitfield4;
    }

    /**
     * BitSet NewComplexOrder byte 5.
     *
     * @return the NewComplexOrderBitfield5 field
     */
    public NewComplexOrderBitfield5Field newComplexOrderBitfield5() {
        return newComplexOrderBitfield5;
    }

    /**
     * BitSet NewComplexOrder byte 6.
     *
     * @return the NewComplexOrderBitfield6 field
     */
    public NewComplexOrderBitfield6Field newComplexOrderBitfield6() {
        return newComplexOrderBitfield6;
    }

    /**
     * BitSet NewComplexOrder byte 7.
     *
     * @return the NewComplexOrderBitfield7 field
     */
    public NewComplexOrderBitfield7Field newComplexOrderBitfield7() {
        return newComplexOrderBitfield7;
    }

    /**
     * BitSet NewComplexOrder byte 8.
     *
     * @return the NewComplexOrderBitfield8 field
     */
    public NewComplexOrderBitfield8Field newComplexOrderBitfield8() {
        return newComplexOrderBitfield8;
    }

    /**
     * Corresponds to NoLegs (555) in Cboe FIX. Indicates the number of repeating groups to fol- low. Must be a minimum of 2 and a maximum of 13. However, for orders with AccountType value of 3 (House Trader), it is possible to specify 0 here. In that case, the repeating group ComplexLe- gOrderInfo should not follow, and the LegPosi- tionEffect is defaulted to None (“N”) for each leg.
     *
     * @return the NoLegs field
     */
    public NoLegsField noLegs() {
        return noLegs;
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
     * Symbol Alphanumeric
     *
     * @return the SymbolAlphanumeric field
     */
    public SymbolAlphanumericField2 symbolAlphanumeric() {
        return symbolAlphanumeric;
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
     * Prevent Match
     *
     * @return the PreventMatch field
     */
    public PreventMatchField preventMatch() {
        return preventMatch;
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
     * Auction Id
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
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
     * Risk Reset
     *
     * @return the RiskReset field
     */
    public RiskResetField riskReset() {
        return riskReset;
    }

    /**
     * Custom Group Id
     *
     * @return the CustomGroupId field
     */
    public CustomGroupIdField customGroupId() {
        return customGroupId;
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
     * Client Id
     *
     * @return the ClientId field
     */
    public ClientIdField clientId() {
        return clientId;
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
     * Investor Id
     *
     * @return the InvestorId field
     */
    public InvestorIdField investorId() {
        return investorId;
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
     * Executor Id
     *
     * @return the ExecutorId field
     */
    public ExecutorIdField executorId() {
        return executorId;
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
     * Display Indicator
     *
     * @return the DisplayIndicator field
     */
    public DisplayIndicatorField displayIndicator() {
        return displayIndicator;
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
     * Repeating group stated NoLegs times.
     *
     * <p>Encode writes this list's size to the NoLegs field.</p>
     *
     * @return the ComplexLegOrderInfo entries
     */
    public ComplexLegOrderInfoList complexLegOrderInfo() {
        return complexLegOrderInfo;
    }

    /**
     * Returns whether the fields before the NewComplexOrderBitfield1 put it on the wire.
     *
     * <p>Decode reads the NewComplexOrderBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexOrderBitfield1 is on the wire
     */
    public boolean newComplexOrderBitfield1Present() {
        return numberOfNewComplexOrderBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the NewComplexOrderBitfield2 put it on the wire.
     *
     * <p>Decode reads the NewComplexOrderBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexOrderBitfield2 is on the wire
     */
    public boolean newComplexOrderBitfield2Present() {
        return numberOfNewComplexOrderBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the NewComplexOrderBitfield3 put it on the wire.
     *
     * <p>Decode reads the NewComplexOrderBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexOrderBitfield3 is on the wire
     */
    public boolean newComplexOrderBitfield3Present() {
        return numberOfNewComplexOrderBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the NewComplexOrderBitfield4 put it on the wire.
     *
     * <p>Decode reads the NewComplexOrderBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexOrderBitfield4 is on the wire
     */
    public boolean newComplexOrderBitfield4Present() {
        return numberOfNewComplexOrderBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the NewComplexOrderBitfield5 put it on the wire.
     *
     * <p>Decode reads the NewComplexOrderBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexOrderBitfield5 is on the wire
     */
    public boolean newComplexOrderBitfield5Present() {
        return numberOfNewComplexOrderBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the NewComplexOrderBitfield6 put it on the wire.
     *
     * <p>Decode reads the NewComplexOrderBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexOrderBitfield6 is on the wire
     */
    public boolean newComplexOrderBitfield6Present() {
        return numberOfNewComplexOrderBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the NewComplexOrderBitfield7 put it on the wire.
     *
     * <p>Decode reads the NewComplexOrderBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexOrderBitfield7 is on the wire
     */
    public boolean newComplexOrderBitfield7Present() {
        return numberOfNewComplexOrderBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the NewComplexOrderBitfield8 put it on the wire.
     *
     * <p>Decode reads the NewComplexOrderBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexOrderBitfield8 is on the wire
     */
    public boolean newComplexOrderBitfield8Present() {
        return numberOfNewComplexOrderBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 1L) && (newComplexOrderBitfield1Present() && newComplexOrderBitfield1.newComplexOrderBitfield1ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 1L) && (newComplexOrderBitfield1Present() && newComplexOrderBitfield1.newComplexOrderBitfield1ClearingAccount());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 1L) && (newComplexOrderBitfield1Present() && newComplexOrderBitfield1.newComplexOrderBitfield1Price());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 1L) && (newComplexOrderBitfield1Present() && newComplexOrderBitfield1.newComplexOrderBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 1L) && (newComplexOrderBitfield1Present() && newComplexOrderBitfield1.newComplexOrderBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 1L) && (newComplexOrderBitfield1Present() && newComplexOrderBitfield1.newComplexOrderBitfield1Symbol());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 1L) && (newComplexOrderBitfield1Present() && newComplexOrderBitfield1.newComplexOrderBitfield1Capacity());
    }

    /**
     * Returns whether the fields before the RoutingInst put it on the wire.
     *
     * <p>Decode reads the RoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingInst is on the wire
     */
    public boolean routingInstPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 1L) && (newComplexOrderBitfield1Present() && newComplexOrderBitfield1.newComplexOrderBitfield1RoutingInst());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 2L) && (newComplexOrderBitfield2Present() && newComplexOrderBitfield2.newComplexOrderBitfield2Account());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 2L) && (newComplexOrderBitfield2Present() && newComplexOrderBitfield2.newComplexOrderBitfield2PreventMatch());
    }

    /**
     * Returns whether the fields before the ExpireTime put it on the wire.
     *
     * <p>Decode reads the ExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExpireTime is on the wire
     */
    public boolean expireTimePresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 2L) && (newComplexOrderBitfield2Present() && newComplexOrderBitfield2.newComplexOrderBitfield2ExpireTime());
    }

    /**
     * Returns whether the fields before the AuctionId put it on the wire.
     *
     * <p>Decode reads the AuctionId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AuctionId is on the wire
     */
    public boolean auctionIdPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 2L) && (newComplexOrderBitfield2Present() && newComplexOrderBitfield2.newComplexOrderBitfield2AuctionId());
    }

    /**
     * Returns whether the fields before the DrillThruProtection put it on the wire.
     *
     * <p>Decode reads the DrillThruProtection where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DrillThruProtection is on the wire
     */
    public boolean drillThruProtectionPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 3L) && (newComplexOrderBitfield3Present() && newComplexOrderBitfield3.newComplexOrderBitfield3DrillThruProtection());
    }

    /**
     * Returns whether the fields before the RiskReset put it on the wire.
     *
     * <p>Decode reads the RiskReset where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RiskReset is on the wire
     */
    public boolean riskResetPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 3L) && (newComplexOrderBitfield3Present() && newComplexOrderBitfield3.newComplexOrderBitfield3RiskReset());
    }

    /**
     * Returns whether the fields before the CustomGroupId put it on the wire.
     *
     * <p>Decode reads the CustomGroupId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CustomGroupId is on the wire
     */
    public boolean customGroupIdPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 3L) && (newComplexOrderBitfield3Present() && newComplexOrderBitfield3.newComplexOrderBitfield3CustomGroupId());
    }

    /**
     * Returns whether the fields before the LiquidityProvision put it on the wire.
     *
     * <p>Decode reads the LiquidityProvision where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LiquidityProvision is on the wire
     */
    public boolean liquidityProvisionPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 6L) && (newComplexOrderBitfield6Present() && newComplexOrderBitfield6.newComplexOrderBitfield6LiquidityProvision());
    }

    /**
     * Returns whether the fields before the OrderOrigination put it on the wire.
     *
     * <p>Decode reads the OrderOrigination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigination is on the wire
     */
    public boolean orderOriginationPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 6L) && (newComplexOrderBitfield6Present() && newComplexOrderBitfield6.newComplexOrderBitfield6OrderOrigination());
    }

    /**
     * Returns whether the fields before the AlgorithmicIndicator put it on the wire.
     *
     * <p>Decode reads the AlgorithmicIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AlgorithmicIndicator is on the wire
     */
    public boolean algorithmicIndicatorPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 6L) && (newComplexOrderBitfield6Present() && newComplexOrderBitfield6.newComplexOrderBitfield6AlgorithmicIndicator());
    }

    /**
     * Returns whether the fields before the ClientId put it on the wire.
     *
     * <p>Decode reads the ClientId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientId is on the wire
     */
    public boolean clientIdPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 6L) && (newComplexOrderBitfield6Present() && newComplexOrderBitfield6.newComplexOrderBitfield6ClientId());
    }

    /**
     * Returns whether the fields before the ClientQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ClientQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientQualifiedRole is on the wire
     */
    public boolean clientQualifiedRolePresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 6L) && (newComplexOrderBitfield6Present() && newComplexOrderBitfield6.newComplexOrderBitfield6ClientQualifiedRole());
    }

    /**
     * Returns whether the fields before the InvestorId put it on the wire.
     *
     * <p>Decode reads the InvestorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorId is on the wire
     */
    public boolean investorIdPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 7L) && (newComplexOrderBitfield7Present() && newComplexOrderBitfield7.newComplexOrderBitfield7InvestorId());
    }

    /**
     * Returns whether the fields before the InvestorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the InvestorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorQualifiedRole is on the wire
     */
    public boolean investorQualifiedRolePresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 7L) && (newComplexOrderBitfield7Present() && newComplexOrderBitfield7.newComplexOrderBitfield7InvestorQualifiedRole());
    }

    /**
     * Returns whether the fields before the ExecutorId put it on the wire.
     *
     * <p>Decode reads the ExecutorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorId is on the wire
     */
    public boolean executorIdPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 7L) && (newComplexOrderBitfield7Present() && newComplexOrderBitfield7.newComplexOrderBitfield7ExecutorId());
    }

    /**
     * Returns whether the fields before the ExecutorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ExecutorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorQualifiedRole is on the wire
     */
    public boolean executorQualifiedRolePresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 7L) && (newComplexOrderBitfield7Present() && newComplexOrderBitfield7.newComplexOrderBitfield7ExecutorQualifiedRole());
    }

    /**
     * Returns whether the fields before the CustOrderHandlingInst put it on the wire.
     *
     * <p>Decode reads the CustOrderHandlingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CustOrderHandlingInst is on the wire
     */
    public boolean custOrderHandlingInstPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 7L) && (newComplexOrderBitfield7Present() && newComplexOrderBitfield7.newComplexOrderBitfield7CustOrderHandlingInst());
    }

    /**
     * Returns whether the fields before the AccountType put it on the wire.
     *
     * <p>Decode reads the AccountType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AccountType is on the wire
     */
    public boolean accountTypePresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 7L) && (newComplexOrderBitfield7Present() && newComplexOrderBitfield7.newComplexOrderBitfield7AccountType());
    }

    /**
     * Returns whether the fields before the DisplayIndicator put it on the wire.
     *
     * <p>Decode reads the DisplayIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayIndicator is on the wire
     */
    public boolean displayIndicatorPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 7L) && (newComplexOrderBitfield7Present() && newComplexOrderBitfield7.newComplexOrderBitfield7DisplayIndicator());
    }

    /**
     * Returns whether the fields before the ExtExecInst put it on the wire.
     *
     * <p>Decode reads the ExtExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExtExecInst is on the wire
     */
    public boolean extExecInstPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 8L) && (newComplexOrderBitfield8Present() && newComplexOrderBitfield8.newComplexOrderBitfield8ExtExecInst());
    }

    private boolean onWire(Field field) {
        return (field != newComplexOrderBitfield1 || newComplexOrderBitfield1Present()) && (field != newComplexOrderBitfield2 || newComplexOrderBitfield2Present()) && (field != newComplexOrderBitfield3 || newComplexOrderBitfield3Present()) && (field != newComplexOrderBitfield4 || newComplexOrderBitfield4Present()) && (field != newComplexOrderBitfield5 || newComplexOrderBitfield5Present()) && (field != newComplexOrderBitfield6 || newComplexOrderBitfield6Present()) && (field != newComplexOrderBitfield7 || newComplexOrderBitfield7Present()) && (field != newComplexOrderBitfield8 || newComplexOrderBitfield8Present()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != price || pricePresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != capacity || capacityPresent()) && (field != routingInst || routingInstPresent()) && (field != account || accountPresent()) && (field != preventMatch || preventMatchPresent()) && (field != expireTime || expireTimePresent()) && (field != auctionId || auctionIdPresent()) && (field != drillThruProtection || drillThruProtectionPresent()) && (field != riskReset || riskResetPresent()) && (field != customGroupId || customGroupIdPresent()) && (field != liquidityProvision || liquidityProvisionPresent()) && (field != orderOrigination || orderOriginationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent()) && (field != clientId || clientIdPresent()) && (field != clientQualifiedRole || clientQualifiedRolePresent()) && (field != investorId || investorIdPresent()) && (field != investorQualifiedRole || investorQualifiedRolePresent()) && (field != executorId || executorIdPresent()) && (field != executorQualifiedRole || executorQualifiedRolePresent()) && (field != custOrderHandlingInst || custOrderHandlingInstPresent()) && (field != accountType || accountTypePresent()) && (field != displayIndicator || displayIndicatorPresent()) && (field != extExecInst || extExecInstPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (newComplexOrderBitfield1Present() ? NewComplexOrderBitfield1Field.BYTE_LENGTH : 0) + (newComplexOrderBitfield2Present() ? NewComplexOrderBitfield2Field.BYTE_LENGTH : 0) + (newComplexOrderBitfield3Present() ? NewComplexOrderBitfield3Field.BYTE_LENGTH : 0) + (newComplexOrderBitfield4Present() ? NewComplexOrderBitfield4Field.BYTE_LENGTH : 0) + (newComplexOrderBitfield5Present() ? NewComplexOrderBitfield5Field.BYTE_LENGTH : 0) + (newComplexOrderBitfield6Present() ? NewComplexOrderBitfield6Field.BYTE_LENGTH : 0) + (newComplexOrderBitfield7Present() ? NewComplexOrderBitfield7Field.BYTE_LENGTH : 0) + (newComplexOrderBitfield8Present() ? NewComplexOrderBitfield8Field.BYTE_LENGTH : 0) + complexLegOrderInfo.byteLength() + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField2.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (routingInstPresent() ? RoutingInstField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (auctionIdPresent() ? AuctionIdField.BYTE_LENGTH : 0) + (drillThruProtectionPresent() ? DrillThruProtectionField.BYTE_LENGTH : 0) + (riskResetPresent() ? RiskResetField.BYTE_LENGTH : 0) + (customGroupIdPresent() ? CustomGroupIdField.BYTE_LENGTH : 0) + (liquidityProvisionPresent() ? LiquidityProvisionField.BYTE_LENGTH : 0) + (orderOriginationPresent() ? OrderOriginationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0) + (clientIdPresent() ? ClientIdField.BYTE_LENGTH : 0) + (clientQualifiedRolePresent() ? ClientQualifiedRoleField.BYTE_LENGTH : 0) + (investorIdPresent() ? InvestorIdField.BYTE_LENGTH : 0) + (investorQualifiedRolePresent() ? InvestorQualifiedRoleField.BYTE_LENGTH : 0) + (executorIdPresent() ? ExecutorIdField.BYTE_LENGTH : 0) + (executorQualifiedRolePresent() ? ExecutorQualifiedRoleField.BYTE_LENGTH : 0) + (custOrderHandlingInstPresent() ? CustOrderHandlingInstField.BYTE_LENGTH : 0) + (accountTypePresent() ? AccountTypeField.BYTE_LENGTH : 0) + (displayIndicatorPresent() ? DisplayIndicatorField.BYTE_LENGTH : 0) + (extExecInstPresent() ? ExtExecInstField.BYTE_LENGTH : 0);
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
        if (!numberOfNewComplexOrderBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfNewComplexOrderBitfieldsField.BYTE_LENGTH;
        if (newComplexOrderBitfield1Present()) {
            if (end - 1 - cursor < NewComplexOrderBitfield1Field.BYTE_LENGTH || !newComplexOrderBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexOrderBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (newComplexOrderBitfield2Present()) {
            if (end - 1 - cursor < NewComplexOrderBitfield2Field.BYTE_LENGTH || !newComplexOrderBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexOrderBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (newComplexOrderBitfield3Present()) {
            if (end - 1 - cursor < NewComplexOrderBitfield3Field.BYTE_LENGTH || !newComplexOrderBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexOrderBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (newComplexOrderBitfield4Present()) {
            if (end - 1 - cursor < NewComplexOrderBitfield4Field.BYTE_LENGTH || !newComplexOrderBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexOrderBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (newComplexOrderBitfield5Present()) {
            if (end - 1 - cursor < NewComplexOrderBitfield5Field.BYTE_LENGTH || !newComplexOrderBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexOrderBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (newComplexOrderBitfield6Present()) {
            if (end - 1 - cursor < NewComplexOrderBitfield6Field.BYTE_LENGTH || !newComplexOrderBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexOrderBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (newComplexOrderBitfield7Present()) {
            if (end - 1 - cursor < NewComplexOrderBitfield7Field.BYTE_LENGTH || !newComplexOrderBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexOrderBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (newComplexOrderBitfield8Present()) {
            if (end - 1 - cursor < NewComplexOrderBitfield8Field.BYTE_LENGTH || !newComplexOrderBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexOrderBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (!noLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegsField.BYTE_LENGTH;
        if (!complexLegOrderInfo.parse(data, cursor, end, noLegs.value())) {
            return false;
        }
        cursor += complexLegOrderInfo.byteLength();
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
        if (symbolAlphanumericPresent()) {
            if (end - cursor < SymbolAlphanumericField2.BYTE_LENGTH || !symbolAlphanumeric.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolAlphanumericField2.BYTE_LENGTH;
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
        if (preventMatchPresent()) {
            if (end - cursor < PreventMatchField.BYTE_LENGTH || !preventMatch.parse(data, cursor)) {
                return false;
            }
            cursor += PreventMatchField.BYTE_LENGTH;
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
        if (auctionIdPresent()) {
            if (end - cursor < AuctionIdField.BYTE_LENGTH || !auctionId.parse(data, cursor)) {
                return false;
            }
            cursor += AuctionIdField.BYTE_LENGTH;
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
        if (riskResetPresent()) {
            if (end - cursor < RiskResetField.BYTE_LENGTH || !riskReset.parse(data, cursor)) {
                return false;
            }
            cursor += RiskResetField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (customGroupIdPresent()) {
            if (end - cursor < CustomGroupIdField.BYTE_LENGTH || !customGroupId.parse(data, cursor)) {
                return false;
            }
            cursor += CustomGroupIdField.BYTE_LENGTH;
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
        if (clientIdPresent()) {
            if (end - cursor < ClientIdField.BYTE_LENGTH || !clientId.parse(data, cursor)) {
                return false;
            }
            cursor += ClientIdField.BYTE_LENGTH;
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
        if (investorIdPresent()) {
            if (end - cursor < InvestorIdField.BYTE_LENGTH || !investorId.parse(data, cursor)) {
                return false;
            }
            cursor += InvestorIdField.BYTE_LENGTH;
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
        if (executorIdPresent()) {
            if (end - cursor < ExecutorIdField.BYTE_LENGTH || !executorId.parse(data, cursor)) {
                return false;
            }
            cursor += ExecutorIdField.BYTE_LENGTH;
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
        if (extExecInstPresent()) {
            if (end - cursor < ExtExecInstField.BYTE_LENGTH || !extExecInst.parse(data, cursor)) {
                return false;
            }
            cursor += ExtExecInstField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (complexLegOrderInfo.size() > 255) {
            throw new IllegalStateException("complexLegOrderInfo holds " + complexLegOrderInfo.size() + " entries, more than its count field can state");
        }
        noLegs.value((short) complexLegOrderInfo.size());
        if (newComplexOrderBitfield1Present() != newComplexOrderBitfield1.hasValue()) {
            throw new IllegalStateException(newComplexOrderBitfield1.hasValue() ? "newComplexOrderBitfield1 holds a value the fields before it leave off the wire" : "newComplexOrderBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (newComplexOrderBitfield2Present() != newComplexOrderBitfield2.hasValue()) {
            throw new IllegalStateException(newComplexOrderBitfield2.hasValue() ? "newComplexOrderBitfield2 holds a value the fields before it leave off the wire" : "newComplexOrderBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (newComplexOrderBitfield3Present() != newComplexOrderBitfield3.hasValue()) {
            throw new IllegalStateException(newComplexOrderBitfield3.hasValue() ? "newComplexOrderBitfield3 holds a value the fields before it leave off the wire" : "newComplexOrderBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (newComplexOrderBitfield4Present() != newComplexOrderBitfield4.hasValue()) {
            throw new IllegalStateException(newComplexOrderBitfield4.hasValue() ? "newComplexOrderBitfield4 holds a value the fields before it leave off the wire" : "newComplexOrderBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (newComplexOrderBitfield5Present() != newComplexOrderBitfield5.hasValue()) {
            throw new IllegalStateException(newComplexOrderBitfield5.hasValue() ? "newComplexOrderBitfield5 holds a value the fields before it leave off the wire" : "newComplexOrderBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (newComplexOrderBitfield6Present() != newComplexOrderBitfield6.hasValue()) {
            throw new IllegalStateException(newComplexOrderBitfield6.hasValue() ? "newComplexOrderBitfield6 holds a value the fields before it leave off the wire" : "newComplexOrderBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (newComplexOrderBitfield7Present() != newComplexOrderBitfield7.hasValue()) {
            throw new IllegalStateException(newComplexOrderBitfield7.hasValue() ? "newComplexOrderBitfield7 holds a value the fields before it leave off the wire" : "newComplexOrderBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (newComplexOrderBitfield8Present() != newComplexOrderBitfield8.hasValue()) {
            throw new IllegalStateException(newComplexOrderBitfield8.hasValue() ? "newComplexOrderBitfield8 holds a value the fields before it leave off the wire" : "newComplexOrderBitfield8 holds no value, though the fields before it put it on the wire");
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
        if (ordTypePresent() != ordType.hasValue()) {
            throw new IllegalStateException(ordType.hasValue() ? "ordType holds a value the fields before it leave off the wire" : "ordType holds no value, though the fields before it put it on the wire");
        }
        if (timeInForcePresent() != timeInForce.hasValue()) {
            throw new IllegalStateException(timeInForce.hasValue() ? "timeInForce holds a value the fields before it leave off the wire" : "timeInForce holds no value, though the fields before it put it on the wire");
        }
        if (symbolAlphanumericPresent() != symbolAlphanumeric.hasValue()) {
            throw new IllegalStateException(symbolAlphanumeric.hasValue() ? "symbolAlphanumeric holds a value the fields before it leave off the wire" : "symbolAlphanumeric holds no value, though the fields before it put it on the wire");
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
        if (preventMatchPresent() != preventMatch.hasValue()) {
            throw new IllegalStateException(preventMatch.hasValue() ? "preventMatch holds a value the fields before it leave off the wire" : "preventMatch holds no value, though the fields before it put it on the wire");
        }
        if (expireTimePresent() != expireTime.hasValue()) {
            throw new IllegalStateException(expireTime.hasValue() ? "expireTime holds a value the fields before it leave off the wire" : "expireTime holds no value, though the fields before it put it on the wire");
        }
        if (auctionIdPresent() != auctionId.hasValue()) {
            throw new IllegalStateException(auctionId.hasValue() ? "auctionId holds a value the fields before it leave off the wire" : "auctionId holds no value, though the fields before it put it on the wire");
        }
        if (drillThruProtectionPresent() != drillThruProtection.hasValue()) {
            throw new IllegalStateException(drillThruProtection.hasValue() ? "drillThruProtection holds a value the fields before it leave off the wire" : "drillThruProtection holds no value, though the fields before it put it on the wire");
        }
        if (riskResetPresent() != riskReset.hasValue()) {
            throw new IllegalStateException(riskReset.hasValue() ? "riskReset holds a value the fields before it leave off the wire" : "riskReset holds no value, though the fields before it put it on the wire");
        }
        if (customGroupIdPresent() != customGroupId.hasValue()) {
            throw new IllegalStateException(customGroupId.hasValue() ? "customGroupId holds a value the fields before it leave off the wire" : "customGroupId holds no value, though the fields before it put it on the wire");
        }
        if (liquidityProvisionPresent() != liquidityProvision.hasValue()) {
            throw new IllegalStateException(liquidityProvision.hasValue() ? "liquidityProvision holds a value the fields before it leave off the wire" : "liquidityProvision holds no value, though the fields before it put it on the wire");
        }
        if (orderOriginationPresent() != orderOrigination.hasValue()) {
            throw new IllegalStateException(orderOrigination.hasValue() ? "orderOrigination holds a value the fields before it leave off the wire" : "orderOrigination holds no value, though the fields before it put it on the wire");
        }
        if (algorithmicIndicatorPresent() != algorithmicIndicator.hasValue()) {
            throw new IllegalStateException(algorithmicIndicator.hasValue() ? "algorithmicIndicator holds a value the fields before it leave off the wire" : "algorithmicIndicator holds no value, though the fields before it put it on the wire");
        }
        if (clientIdPresent() != clientId.hasValue()) {
            throw new IllegalStateException(clientId.hasValue() ? "clientId holds a value the fields before it leave off the wire" : "clientId holds no value, though the fields before it put it on the wire");
        }
        if (clientQualifiedRolePresent() != clientQualifiedRole.hasValue()) {
            throw new IllegalStateException(clientQualifiedRole.hasValue() ? "clientQualifiedRole holds a value the fields before it leave off the wire" : "clientQualifiedRole holds no value, though the fields before it put it on the wire");
        }
        if (investorIdPresent() != investorId.hasValue()) {
            throw new IllegalStateException(investorId.hasValue() ? "investorId holds a value the fields before it leave off the wire" : "investorId holds no value, though the fields before it put it on the wire");
        }
        if (investorQualifiedRolePresent() != investorQualifiedRole.hasValue()) {
            throw new IllegalStateException(investorQualifiedRole.hasValue() ? "investorQualifiedRole holds a value the fields before it leave off the wire" : "investorQualifiedRole holds no value, though the fields before it put it on the wire");
        }
        if (executorIdPresent() != executorId.hasValue()) {
            throw new IllegalStateException(executorId.hasValue() ? "executorId holds a value the fields before it leave off the wire" : "executorId holds no value, though the fields before it put it on the wire");
        }
        if (executorQualifiedRolePresent() != executorQualifiedRole.hasValue()) {
            throw new IllegalStateException(executorQualifiedRole.hasValue() ? "executorQualifiedRole holds a value the fields before it leave off the wire" : "executorQualifiedRole holds no value, though the fields before it put it on the wire");
        }
        if (custOrderHandlingInstPresent() != custOrderHandlingInst.hasValue()) {
            throw new IllegalStateException(custOrderHandlingInst.hasValue() ? "custOrderHandlingInst holds a value the fields before it leave off the wire" : "custOrderHandlingInst holds no value, though the fields before it put it on the wire");
        }
        if (accountTypePresent() != accountType.hasValue()) {
            throw new IllegalStateException(accountType.hasValue() ? "accountType holds a value the fields before it leave off the wire" : "accountType holds no value, though the fields before it put it on the wire");
        }
        if (displayIndicatorPresent() != displayIndicator.hasValue()) {
            throw new IllegalStateException(displayIndicator.hasValue() ? "displayIndicator holds a value the fields before it leave off the wire" : "displayIndicator holds no value, though the fields before it put it on the wire");
        }
        if (extExecInstPresent() != extExecInst.hasValue()) {
            throw new IllegalStateException(extExecInst.hasValue() ? "extExecInst holds a value the fields before it leave off the wire" : "extExecInst holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = numberOfNewComplexOrderBitfields.encode(data, cursor);
        if (newComplexOrderBitfield1Present()) {
            cursor = newComplexOrderBitfield1.encode(data, cursor);
        }
        if (newComplexOrderBitfield2Present()) {
            cursor = newComplexOrderBitfield2.encode(data, cursor);
        }
        if (newComplexOrderBitfield3Present()) {
            cursor = newComplexOrderBitfield3.encode(data, cursor);
        }
        if (newComplexOrderBitfield4Present()) {
            cursor = newComplexOrderBitfield4.encode(data, cursor);
        }
        if (newComplexOrderBitfield5Present()) {
            cursor = newComplexOrderBitfield5.encode(data, cursor);
        }
        if (newComplexOrderBitfield6Present()) {
            cursor = newComplexOrderBitfield6.encode(data, cursor);
        }
        if (newComplexOrderBitfield7Present()) {
            cursor = newComplexOrderBitfield7.encode(data, cursor);
        }
        if (newComplexOrderBitfield8Present()) {
            cursor = newComplexOrderBitfield8.encode(data, cursor);
        }
        cursor = noLegs.encode(data, cursor);
        cursor = complexLegOrderInfo.encode(data, cursor);
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (clearingAccountPresent()) {
            cursor = clearingAccount.encode(data, cursor);
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
        if (symbolAlphanumericPresent()) {
            cursor = symbolAlphanumeric.encode(data, cursor);
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
        if (preventMatchPresent()) {
            cursor = preventMatch.encode(data, cursor);
        }
        if (expireTimePresent()) {
            cursor = expireTime.encode(data, cursor);
        }
        if (auctionIdPresent()) {
            cursor = auctionId.encode(data, cursor);
        }
        if (drillThruProtectionPresent()) {
            cursor = drillThruProtection.encode(data, cursor);
        }
        if (riskResetPresent()) {
            cursor = riskReset.encode(data, cursor);
        }
        if (customGroupIdPresent()) {
            cursor = customGroupId.encode(data, cursor);
        }
        if (liquidityProvisionPresent()) {
            cursor = liquidityProvision.encode(data, cursor);
        }
        if (orderOriginationPresent()) {
            cursor = orderOrigination.encode(data, cursor);
        }
        if (algorithmicIndicatorPresent()) {
            cursor = algorithmicIndicator.encode(data, cursor);
        }
        if (clientIdPresent()) {
            cursor = clientId.encode(data, cursor);
        }
        if (clientQualifiedRolePresent()) {
            cursor = clientQualifiedRole.encode(data, cursor);
        }
        if (investorIdPresent()) {
            cursor = investorId.encode(data, cursor);
        }
        if (investorQualifiedRolePresent()) {
            cursor = investorQualifiedRole.encode(data, cursor);
        }
        if (executorIdPresent()) {
            cursor = executorId.encode(data, cursor);
        }
        if (executorQualifiedRolePresent()) {
            cursor = executorQualifiedRole.encode(data, cursor);
        }
        if (custOrderHandlingInstPresent()) {
            cursor = custOrderHandlingInst.encode(data, cursor);
        }
        if (accountTypePresent()) {
            cursor = accountType.encode(data, cursor);
        }
        if (displayIndicatorPresent()) {
            cursor = displayIndicator.encode(data, cursor);
        }
        if (extExecInstPresent()) {
            cursor = extExecInst.encode(data, cursor);
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
        complexLegOrderInfo.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != noLegs && !field.isRecognized()) {
                return false;
            }
        }
        return complexLegOrderInfo.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != noLegs && !field.isValid()) {
                return false;
            }
        }
        if (!complexLegOrderInfo.isValid()) {
            return false;
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
        if (!clOrdId.isDecoded()) {
            return Optional.of(clOrdId);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (!numberOfNewComplexOrderBitfields.isDecoded()) {
            return Optional.of(numberOfNewComplexOrderBitfields);
        }
        if (newComplexOrderBitfield1Present() && !newComplexOrderBitfield1.isDecoded()) {
            return Optional.of(newComplexOrderBitfield1);
        }
        if (newComplexOrderBitfield2Present() && !newComplexOrderBitfield2.isDecoded()) {
            return Optional.of(newComplexOrderBitfield2);
        }
        if (newComplexOrderBitfield3Present() && !newComplexOrderBitfield3.isDecoded()) {
            return Optional.of(newComplexOrderBitfield3);
        }
        if (newComplexOrderBitfield4Present() && !newComplexOrderBitfield4.isDecoded()) {
            return Optional.of(newComplexOrderBitfield4);
        }
        if (newComplexOrderBitfield5Present() && !newComplexOrderBitfield5.isDecoded()) {
            return Optional.of(newComplexOrderBitfield5);
        }
        if (newComplexOrderBitfield6Present() && !newComplexOrderBitfield6.isDecoded()) {
            return Optional.of(newComplexOrderBitfield6);
        }
        if (newComplexOrderBitfield7Present() && !newComplexOrderBitfield7.isDecoded()) {
            return Optional.of(newComplexOrderBitfield7);
        }
        if (newComplexOrderBitfield8Present() && !newComplexOrderBitfield8.isDecoded()) {
            return Optional.of(newComplexOrderBitfield8);
        }
        if (!noLegs.isDecoded()) {
            return Optional.of(noLegs);
        }
        if (!complexLegOrderInfo.isDecoded()) {
            return Optional.of(complexLegOrderInfo.failedEntry().flatMap(ComplexLegOrderInfoEntry::failedAt).orElse(noLegs));
        }
        if (clearingFirmPresent() && !clearingFirm.isDecoded()) {
            return Optional.of(clearingFirm);
        }
        if (clearingAccountPresent() && !clearingAccount.isDecoded()) {
            return Optional.of(clearingAccount);
        }
        if (pricePresent() && !price.isDecoded()) {
            return Optional.of(price);
        }
        if (ordTypePresent() && !ordType.isDecoded()) {
            return Optional.of(ordType);
        }
        if (timeInForcePresent() && !timeInForce.isDecoded()) {
            return Optional.of(timeInForce);
        }
        if (symbolAlphanumericPresent() && !symbolAlphanumeric.isDecoded()) {
            return Optional.of(symbolAlphanumeric);
        }
        if (capacityPresent() && !capacity.isDecoded()) {
            return Optional.of(capacity);
        }
        if (routingInstPresent() && !routingInst.isDecoded()) {
            return Optional.of(routingInst);
        }
        if (accountPresent() && !account.isDecoded()) {
            return Optional.of(account);
        }
        if (preventMatchPresent() && !preventMatch.isDecoded()) {
            return Optional.of(preventMatch);
        }
        if (expireTimePresent() && !expireTime.isDecoded()) {
            return Optional.of(expireTime);
        }
        if (auctionIdPresent() && !auctionId.isDecoded()) {
            return Optional.of(auctionId);
        }
        if (drillThruProtectionPresent() && !drillThruProtection.isDecoded()) {
            return Optional.of(drillThruProtection);
        }
        if (riskResetPresent() && !riskReset.isDecoded()) {
            return Optional.of(riskReset);
        }
        if (customGroupIdPresent() && !customGroupId.isDecoded()) {
            return Optional.of(customGroupId);
        }
        if (liquidityProvisionPresent() && !liquidityProvision.isDecoded()) {
            return Optional.of(liquidityProvision);
        }
        if (orderOriginationPresent() && !orderOrigination.isDecoded()) {
            return Optional.of(orderOrigination);
        }
        if (algorithmicIndicatorPresent() && !algorithmicIndicator.isDecoded()) {
            return Optional.of(algorithmicIndicator);
        }
        if (clientIdPresent() && !clientId.isDecoded()) {
            return Optional.of(clientId);
        }
        if (clientQualifiedRolePresent() && !clientQualifiedRole.isDecoded()) {
            return Optional.of(clientQualifiedRole);
        }
        if (investorIdPresent() && !investorId.isDecoded()) {
            return Optional.of(investorId);
        }
        if (investorQualifiedRolePresent() && !investorQualifiedRole.isDecoded()) {
            return Optional.of(investorQualifiedRole);
        }
        if (executorIdPresent() && !executorId.isDecoded()) {
            return Optional.of(executorId);
        }
        if (executorQualifiedRolePresent() && !executorQualifiedRole.isDecoded()) {
            return Optional.of(executorQualifiedRole);
        }
        if (custOrderHandlingInstPresent() && !custOrderHandlingInst.isDecoded()) {
            return Optional.of(custOrderHandlingInst);
        }
        if (accountTypePresent() && !accountType.isDecoded()) {
            return Optional.of(accountType);
        }
        if (displayIndicatorPresent() && !displayIndicator.isDecoded()) {
            return Optional.of(displayIndicator);
        }
        if (extExecInstPresent() && !extExecInst.isDecoded()) {
            return Optional.of(extExecInst);
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
            case "NumberOfNewComplexOrderBitfields" -> Optional.of(numberOfNewComplexOrderBitfields);
            case "NewComplexOrderBitfield1" -> Optional.of(newComplexOrderBitfield1);
            case "NewComplexOrderBitfield2" -> Optional.of(newComplexOrderBitfield2);
            case "NewComplexOrderBitfield3" -> Optional.of(newComplexOrderBitfield3);
            case "NewComplexOrderBitfield4" -> Optional.of(newComplexOrderBitfield4);
            case "NewComplexOrderBitfield5" -> Optional.of(newComplexOrderBitfield5);
            case "NewComplexOrderBitfield6" -> Optional.of(newComplexOrderBitfield6);
            case "NewComplexOrderBitfield7" -> Optional.of(newComplexOrderBitfield7);
            case "NewComplexOrderBitfield8" -> Optional.of(newComplexOrderBitfield8);
            case "NoLegs" -> Optional.of(noLegs);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "Price" -> Optional.of(price);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "Capacity" -> Optional.of(capacity);
            case "RoutingInst" -> Optional.of(routingInst);
            case "Account" -> Optional.of(account);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "ExpireTime" -> Optional.of(expireTime);
            case "AuctionId" -> Optional.of(auctionId);
            case "DrillThruProtection" -> Optional.of(drillThruProtection);
            case "RiskReset" -> Optional.of(riskReset);
            case "CustomGroupId" -> Optional.of(customGroupId);
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "OrderOrigination" -> Optional.of(orderOrigination);
            case "AlgorithmicIndicator" -> Optional.of(algorithmicIndicator);
            case "ClientId" -> Optional.of(clientId);
            case "ClientQualifiedRole" -> Optional.of(clientQualifiedRole);
            case "InvestorId" -> Optional.of(investorId);
            case "InvestorQualifiedRole" -> Optional.of(investorQualifiedRole);
            case "ExecutorId" -> Optional.of(executorId);
            case "ExecutorQualifiedRole" -> Optional.of(executorQualifiedRole);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "AccountType" -> Optional.of(accountType);
            case "DisplayIndicator" -> Optional.of(displayIndicator);
            case "ExtExecInst" -> Optional.of(extExecInst);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewComplexOrderMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(complexLegOrderInfo.diffFields(message.complexLegOrderInfo));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            complexLegOrderInfo.toFormattedString(builder, options);
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
        complexLegOrderInfo.toFormattedString(builder, nested);
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
        if (!(other instanceof NewComplexOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && complexLegOrderInfo.equals(message.complexLegOrderInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, complexLegOrderInfo);
    }
}
