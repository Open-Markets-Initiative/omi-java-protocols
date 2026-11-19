package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.AccountField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.AccountTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.AlgorithmicIndicatorField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.AllocQtyField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.CapacityField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.ClOrdIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.ClearingAccountField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.ClearingFirmField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.ClientIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.ClientQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.CustOrderHandlingInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.ExecutorIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.ExecutorQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.InvestorIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.InvestorQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.LiquidityProvisionField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.OpenCloseField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.OrderIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.OrderOriginationField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.fields.SideField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.types.GroupEntry;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_6.types.PrintOptions;

/**
 * One entry of the CrossOrderCancelledOrderAllocations repeating group.
 *
 * <p>Repeating group stated GroupCnt times.</p>
 */
public final class CrossOrderCancelledOrderAllocationsEntry implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 29;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "CrossOrderCancelledOrderAllocations";

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to OrderID (37) in Cboe FIX. Order identifier supplied by Cboe. This identi- fier corresponds to the identifiers used in Cboe market data products.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     */
    private final SideField side = new SideField();

    /**
     * Alloc Qty
     */
    private final AllocQtyField allocQty = new AllocQtyField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Open Close
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Clearing Account
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Cust Order Handling Inst
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

    /**
     * Account Type
     */
    private final AccountTypeField accountType = new AccountTypeField();

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
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(clOrdId, orderId, side, allocQty, capacity, openClose, account, clearingAccount, clearingFirm, custOrderHandlingInst, accountType, liquidityProvision, orderOrigination, algorithmicIndicator, clientId, clientQualifiedRole, investorId, investorQualifiedRole, executorId, executorQualifiedRole);

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
     * Corresponds to OrderID (37) in Cboe FIX. Order identifier supplied by Cboe. This identi- fier corresponds to the identifiers used in Cboe market data products.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
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
     * Alloc Qty
     *
     * @return the AllocQty field
     */
    public AllocQtyField allocQty() {
        return allocQty;
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
     * Open Close
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
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
     * Clearing Account
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
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
     * Returns whether the fields before the Side put it on the wire.
     *
     * <p>Decode reads the Side where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Side is on the wire
     */
    public boolean sidePresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 1L) && (crossOrderCancelledReturnBitfield1InputKnown && ((crossOrderCancelledReturnBitfield1Input >>> 0) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the AllocQty put it on the wire.
     *
     * <p>Decode reads the AllocQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AllocQty is on the wire
     */
    public boolean allocQtyPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 10L) && (crossOrderCancelledReturnBitfield10InputKnown && ((crossOrderCancelledReturnBitfield10Input >>> 1) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 2L) && (crossOrderCancelledReturnBitfield2InputKnown && ((crossOrderCancelledReturnBitfield2Input >>> 6) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 4L) && (crossOrderCancelledReturnBitfield4InputKnown && ((crossOrderCancelledReturnBitfield4Input >>> 3) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 3L) && (crossOrderCancelledReturnBitfield3InputKnown && ((crossOrderCancelledReturnBitfield3Input >>> 0) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 3L) && (crossOrderCancelledReturnBitfield3InputKnown && ((crossOrderCancelledReturnBitfield3Input >>> 2) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 3L) && (crossOrderCancelledReturnBitfield3InputKnown && ((crossOrderCancelledReturnBitfield3Input >>> 1) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the CustOrderHandlingInst put it on the wire.
     *
     * <p>Decode reads the CustOrderHandlingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CustOrderHandlingInst is on the wire
     */
    public boolean custOrderHandlingInstPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 17L) && (crossOrderCancelledReturnBitfield17InputKnown && ((crossOrderCancelledReturnBitfield17Input >>> 7) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the LiquidityProvision put it on the wire.
     *
     * <p>Decode reads the LiquidityProvision where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LiquidityProvision is on the wire
     */
    public boolean liquidityProvisionPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 9L) && (crossOrderCancelledReturnBitfield9InputKnown && ((crossOrderCancelledReturnBitfield9Input >>> 4) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the OrderOrigination put it on the wire.
     *
     * <p>Decode reads the OrderOrigination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigination is on the wire
     */
    public boolean orderOriginationPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 11L) && (crossOrderCancelledReturnBitfield11InputKnown && ((crossOrderCancelledReturnBitfield11Input >>> 3) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the AlgorithmicIndicator put it on the wire.
     *
     * <p>Decode reads the AlgorithmicIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AlgorithmicIndicator is on the wire
     */
    public boolean algorithmicIndicatorPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 11L) && (crossOrderCancelledReturnBitfield11InputKnown && ((crossOrderCancelledReturnBitfield11Input >>> 4) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ClientId put it on the wire.
     *
     * <p>Decode reads the ClientId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientId is on the wire
     */
    public boolean clientIdPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 11L) && (crossOrderCancelledReturnBitfield11InputKnown && ((crossOrderCancelledReturnBitfield11Input >>> 0) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ClientQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ClientQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientQualifiedRole is on the wire
     */
    public boolean clientQualifiedRolePresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 10L) && (crossOrderCancelledReturnBitfield10InputKnown && ((crossOrderCancelledReturnBitfield10Input >>> 7) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the InvestorId put it on the wire.
     *
     * <p>Decode reads the InvestorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorId is on the wire
     */
    public boolean investorIdPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 11L) && (crossOrderCancelledReturnBitfield11InputKnown && ((crossOrderCancelledReturnBitfield11Input >>> 1) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the InvestorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the InvestorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorQualifiedRole is on the wire
     */
    public boolean investorQualifiedRolePresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 11L) && (crossOrderCancelledReturnBitfield11InputKnown && ((crossOrderCancelledReturnBitfield11Input >>> 6) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ExecutorId put it on the wire.
     *
     * <p>Decode reads the ExecutorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorId is on the wire
     */
    public boolean executorIdPresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 11L) && (crossOrderCancelledReturnBitfield11InputKnown && ((crossOrderCancelledReturnBitfield11Input >>> 2) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ExecutorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ExecutorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorQualifiedRole is on the wire
     */
    public boolean executorQualifiedRolePresent() {
        return (numberOfReturnBitfieldsInputKnown && numberOfReturnBitfieldsInput >= 11L) && (crossOrderCancelledReturnBitfield11InputKnown && ((crossOrderCancelledReturnBitfield11Input >>> 7) & 0x1L) > 0L);
    }

    private boolean onWire(Field field) {
        return (field != side || sidePresent()) && (field != allocQty || allocQtyPresent()) && (field != capacity || capacityPresent()) && (field != openClose || openClosePresent()) && (field != account || accountPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != custOrderHandlingInst || custOrderHandlingInstPresent()) && (field != liquidityProvision || liquidityProvisionPresent()) && (field != orderOrigination || orderOriginationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent()) && (field != clientId || clientIdPresent()) && (field != clientQualifiedRole || clientQualifiedRolePresent()) && (field != investorId || investorIdPresent()) && (field != investorQualifiedRole || investorQualifiedRolePresent()) && (field != executorId || executorIdPresent()) && (field != executorQualifiedRole || executorQualifiedRolePresent());
    }

    private long numberOfReturnBitfieldsInput;

    private boolean numberOfReturnBitfieldsInputGiven;

    private boolean numberOfReturnBitfieldsInputKnown;

    /**
     * Gives this message the NumberOfReturnBitfields that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NumberOfReturnBitfields
     */
    public void numberOfReturnBitfieldsInput(long value) {
        this.numberOfReturnBitfieldsInput = value;
        this.numberOfReturnBitfieldsInputGiven = true;
        this.numberOfReturnBitfieldsInputKnown = true;
    }

    /**
     * Gives this entry the NumberOfReturnBitfields its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NumberOfReturnBitfields, or empty
     */
    public void numberOfReturnBitfieldsInput(OptionalLong value) {
        this.numberOfReturnBitfieldsInput = value.orElse(0L);
        this.numberOfReturnBitfieldsInputGiven = value.isPresent();
        this.numberOfReturnBitfieldsInputKnown = value.isPresent();
    }

    /**
     * Returns the NumberOfReturnBitfields this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NumberOfReturnBitfields, or empty when none is given or known
     */
    public OptionalLong numberOfReturnBitfieldsInput() {
        return numberOfReturnBitfieldsInputKnown ? OptionalLong.of(numberOfReturnBitfieldsInput) : OptionalLong.empty();
    }

    private long crossOrderCancelledReturnBitfield1Input;

    private boolean crossOrderCancelledReturnBitfield1InputGiven;

    private boolean crossOrderCancelledReturnBitfield1InputKnown;

    /**
     * Gives this message the CrossOrderCancelledReturnBitfield1 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield1
     */
    public void crossOrderCancelledReturnBitfield1Input(long value) {
        this.crossOrderCancelledReturnBitfield1Input = value;
        this.crossOrderCancelledReturnBitfield1InputGiven = true;
        this.crossOrderCancelledReturnBitfield1InputKnown = true;
    }

    /**
     * Gives this entry the CrossOrderCancelledReturnBitfield1 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield1, or empty
     */
    public void crossOrderCancelledReturnBitfield1Input(OptionalLong value) {
        this.crossOrderCancelledReturnBitfield1Input = value.orElse(0L);
        this.crossOrderCancelledReturnBitfield1InputGiven = value.isPresent();
        this.crossOrderCancelledReturnBitfield1InputKnown = value.isPresent();
    }

    /**
     * Returns the CrossOrderCancelledReturnBitfield1 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the CrossOrderCancelledReturnBitfield1, or empty when none is given or known
     */
    public OptionalLong crossOrderCancelledReturnBitfield1Input() {
        return crossOrderCancelledReturnBitfield1InputKnown ? OptionalLong.of(crossOrderCancelledReturnBitfield1Input) : OptionalLong.empty();
    }

    private long crossOrderCancelledReturnBitfield10Input;

    private boolean crossOrderCancelledReturnBitfield10InputGiven;

    private boolean crossOrderCancelledReturnBitfield10InputKnown;

    /**
     * Gives this message the CrossOrderCancelledReturnBitfield10 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield10
     */
    public void crossOrderCancelledReturnBitfield10Input(long value) {
        this.crossOrderCancelledReturnBitfield10Input = value;
        this.crossOrderCancelledReturnBitfield10InputGiven = true;
        this.crossOrderCancelledReturnBitfield10InputKnown = true;
    }

    /**
     * Gives this entry the CrossOrderCancelledReturnBitfield10 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield10, or empty
     */
    public void crossOrderCancelledReturnBitfield10Input(OptionalLong value) {
        this.crossOrderCancelledReturnBitfield10Input = value.orElse(0L);
        this.crossOrderCancelledReturnBitfield10InputGiven = value.isPresent();
        this.crossOrderCancelledReturnBitfield10InputKnown = value.isPresent();
    }

    /**
     * Returns the CrossOrderCancelledReturnBitfield10 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the CrossOrderCancelledReturnBitfield10, or empty when none is given or known
     */
    public OptionalLong crossOrderCancelledReturnBitfield10Input() {
        return crossOrderCancelledReturnBitfield10InputKnown ? OptionalLong.of(crossOrderCancelledReturnBitfield10Input) : OptionalLong.empty();
    }

    private long crossOrderCancelledReturnBitfield2Input;

    private boolean crossOrderCancelledReturnBitfield2InputGiven;

    private boolean crossOrderCancelledReturnBitfield2InputKnown;

    /**
     * Gives this message the CrossOrderCancelledReturnBitfield2 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield2
     */
    public void crossOrderCancelledReturnBitfield2Input(long value) {
        this.crossOrderCancelledReturnBitfield2Input = value;
        this.crossOrderCancelledReturnBitfield2InputGiven = true;
        this.crossOrderCancelledReturnBitfield2InputKnown = true;
    }

    /**
     * Gives this entry the CrossOrderCancelledReturnBitfield2 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield2, or empty
     */
    public void crossOrderCancelledReturnBitfield2Input(OptionalLong value) {
        this.crossOrderCancelledReturnBitfield2Input = value.orElse(0L);
        this.crossOrderCancelledReturnBitfield2InputGiven = value.isPresent();
        this.crossOrderCancelledReturnBitfield2InputKnown = value.isPresent();
    }

    /**
     * Returns the CrossOrderCancelledReturnBitfield2 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the CrossOrderCancelledReturnBitfield2, or empty when none is given or known
     */
    public OptionalLong crossOrderCancelledReturnBitfield2Input() {
        return crossOrderCancelledReturnBitfield2InputKnown ? OptionalLong.of(crossOrderCancelledReturnBitfield2Input) : OptionalLong.empty();
    }

    private long crossOrderCancelledReturnBitfield4Input;

    private boolean crossOrderCancelledReturnBitfield4InputGiven;

    private boolean crossOrderCancelledReturnBitfield4InputKnown;

    /**
     * Gives this message the CrossOrderCancelledReturnBitfield4 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield4
     */
    public void crossOrderCancelledReturnBitfield4Input(long value) {
        this.crossOrderCancelledReturnBitfield4Input = value;
        this.crossOrderCancelledReturnBitfield4InputGiven = true;
        this.crossOrderCancelledReturnBitfield4InputKnown = true;
    }

    /**
     * Gives this entry the CrossOrderCancelledReturnBitfield4 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield4, or empty
     */
    public void crossOrderCancelledReturnBitfield4Input(OptionalLong value) {
        this.crossOrderCancelledReturnBitfield4Input = value.orElse(0L);
        this.crossOrderCancelledReturnBitfield4InputGiven = value.isPresent();
        this.crossOrderCancelledReturnBitfield4InputKnown = value.isPresent();
    }

    /**
     * Returns the CrossOrderCancelledReturnBitfield4 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the CrossOrderCancelledReturnBitfield4, or empty when none is given or known
     */
    public OptionalLong crossOrderCancelledReturnBitfield4Input() {
        return crossOrderCancelledReturnBitfield4InputKnown ? OptionalLong.of(crossOrderCancelledReturnBitfield4Input) : OptionalLong.empty();
    }

    private long crossOrderCancelledReturnBitfield3Input;

    private boolean crossOrderCancelledReturnBitfield3InputGiven;

    private boolean crossOrderCancelledReturnBitfield3InputKnown;

    /**
     * Gives this message the CrossOrderCancelledReturnBitfield3 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield3
     */
    public void crossOrderCancelledReturnBitfield3Input(long value) {
        this.crossOrderCancelledReturnBitfield3Input = value;
        this.crossOrderCancelledReturnBitfield3InputGiven = true;
        this.crossOrderCancelledReturnBitfield3InputKnown = true;
    }

    /**
     * Gives this entry the CrossOrderCancelledReturnBitfield3 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield3, or empty
     */
    public void crossOrderCancelledReturnBitfield3Input(OptionalLong value) {
        this.crossOrderCancelledReturnBitfield3Input = value.orElse(0L);
        this.crossOrderCancelledReturnBitfield3InputGiven = value.isPresent();
        this.crossOrderCancelledReturnBitfield3InputKnown = value.isPresent();
    }

    /**
     * Returns the CrossOrderCancelledReturnBitfield3 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the CrossOrderCancelledReturnBitfield3, or empty when none is given or known
     */
    public OptionalLong crossOrderCancelledReturnBitfield3Input() {
        return crossOrderCancelledReturnBitfield3InputKnown ? OptionalLong.of(crossOrderCancelledReturnBitfield3Input) : OptionalLong.empty();
    }

    private long crossOrderCancelledReturnBitfield17Input;

    private boolean crossOrderCancelledReturnBitfield17InputGiven;

    private boolean crossOrderCancelledReturnBitfield17InputKnown;

    /**
     * Gives this message the CrossOrderCancelledReturnBitfield17 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield17
     */
    public void crossOrderCancelledReturnBitfield17Input(long value) {
        this.crossOrderCancelledReturnBitfield17Input = value;
        this.crossOrderCancelledReturnBitfield17InputGiven = true;
        this.crossOrderCancelledReturnBitfield17InputKnown = true;
    }

    /**
     * Gives this entry the CrossOrderCancelledReturnBitfield17 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield17, or empty
     */
    public void crossOrderCancelledReturnBitfield17Input(OptionalLong value) {
        this.crossOrderCancelledReturnBitfield17Input = value.orElse(0L);
        this.crossOrderCancelledReturnBitfield17InputGiven = value.isPresent();
        this.crossOrderCancelledReturnBitfield17InputKnown = value.isPresent();
    }

    /**
     * Returns the CrossOrderCancelledReturnBitfield17 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the CrossOrderCancelledReturnBitfield17, or empty when none is given or known
     */
    public OptionalLong crossOrderCancelledReturnBitfield17Input() {
        return crossOrderCancelledReturnBitfield17InputKnown ? OptionalLong.of(crossOrderCancelledReturnBitfield17Input) : OptionalLong.empty();
    }

    private long crossOrderCancelledReturnBitfield9Input;

    private boolean crossOrderCancelledReturnBitfield9InputGiven;

    private boolean crossOrderCancelledReturnBitfield9InputKnown;

    /**
     * Gives this message the CrossOrderCancelledReturnBitfield9 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield9
     */
    public void crossOrderCancelledReturnBitfield9Input(long value) {
        this.crossOrderCancelledReturnBitfield9Input = value;
        this.crossOrderCancelledReturnBitfield9InputGiven = true;
        this.crossOrderCancelledReturnBitfield9InputKnown = true;
    }

    /**
     * Gives this entry the CrossOrderCancelledReturnBitfield9 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield9, or empty
     */
    public void crossOrderCancelledReturnBitfield9Input(OptionalLong value) {
        this.crossOrderCancelledReturnBitfield9Input = value.orElse(0L);
        this.crossOrderCancelledReturnBitfield9InputGiven = value.isPresent();
        this.crossOrderCancelledReturnBitfield9InputKnown = value.isPresent();
    }

    /**
     * Returns the CrossOrderCancelledReturnBitfield9 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the CrossOrderCancelledReturnBitfield9, or empty when none is given or known
     */
    public OptionalLong crossOrderCancelledReturnBitfield9Input() {
        return crossOrderCancelledReturnBitfield9InputKnown ? OptionalLong.of(crossOrderCancelledReturnBitfield9Input) : OptionalLong.empty();
    }

    private long crossOrderCancelledReturnBitfield11Input;

    private boolean crossOrderCancelledReturnBitfield11InputGiven;

    private boolean crossOrderCancelledReturnBitfield11InputKnown;

    /**
     * Gives this message the CrossOrderCancelledReturnBitfield11 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield11
     */
    public void crossOrderCancelledReturnBitfield11Input(long value) {
        this.crossOrderCancelledReturnBitfield11Input = value;
        this.crossOrderCancelledReturnBitfield11InputGiven = true;
        this.crossOrderCancelledReturnBitfield11InputKnown = true;
    }

    /**
     * Gives this entry the CrossOrderCancelledReturnBitfield11 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the CrossOrderCancelledReturnBitfield11, or empty
     */
    public void crossOrderCancelledReturnBitfield11Input(OptionalLong value) {
        this.crossOrderCancelledReturnBitfield11Input = value.orElse(0L);
        this.crossOrderCancelledReturnBitfield11InputGiven = value.isPresent();
        this.crossOrderCancelledReturnBitfield11InputKnown = value.isPresent();
    }

    /**
     * Returns the CrossOrderCancelledReturnBitfield11 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the CrossOrderCancelledReturnBitfield11, or empty when none is given or known
     */
    public OptionalLong crossOrderCancelledReturnBitfield11Input() {
        return crossOrderCancelledReturnBitfield11InputKnown ? OptionalLong.of(crossOrderCancelledReturnBitfield11Input) : OptionalLong.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (allocQtyPresent() ? AllocQtyField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (custOrderHandlingInstPresent() ? CustOrderHandlingInstField.BYTE_LENGTH : 0) + (liquidityProvisionPresent() ? LiquidityProvisionField.BYTE_LENGTH : 0) + (orderOriginationPresent() ? OrderOriginationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0) + (clientIdPresent() ? ClientIdField.BYTE_LENGTH : 0) + (clientQualifiedRolePresent() ? ClientQualifiedRoleField.BYTE_LENGTH : 0) + (investorIdPresent() ? InvestorIdField.BYTE_LENGTH : 0) + (investorQualifiedRolePresent() ? InvestorQualifiedRoleField.BYTE_LENGTH : 0) + (executorIdPresent() ? ExecutorIdField.BYTE_LENGTH : 0) + (executorQualifiedRolePresent() ? ExecutorQualifiedRoleField.BYTE_LENGTH : 0);
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
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (sidePresent()) {
            if (end - 1 - cursor < SideField.BYTE_LENGTH || !side.parse(data, cursor)) {
                return false;
            }
            cursor += SideField.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (allocQtyPresent()) {
            if (end - 1 - cursor < AllocQtyField.BYTE_LENGTH || !allocQty.parse(data, cursor)) {
                return false;
            }
            cursor += AllocQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (capacityPresent()) {
            if (end - 1 - cursor < CapacityField.BYTE_LENGTH || !capacity.parse(data, cursor)) {
                return false;
            }
            cursor += CapacityField.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (openClosePresent()) {
            if (end - 1 - cursor < OpenCloseField.BYTE_LENGTH || !openClose.parse(data, cursor)) {
                return false;
            }
            cursor += OpenCloseField.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (accountPresent()) {
            if (end - 1 - cursor < AccountField.BYTE_LENGTH || !account.parse(data, cursor)) {
                return false;
            }
            cursor += AccountField.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (clearingAccountPresent()) {
            if (end - 1 - cursor < ClearingAccountField.BYTE_LENGTH || !clearingAccount.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingAccountField.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (clearingFirmPresent()) {
            if (end - 1 - cursor < ClearingFirmField.BYTE_LENGTH || !clearingFirm.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmField.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (custOrderHandlingInstPresent()) {
            if (end - 1 - cursor < CustOrderHandlingInstField.BYTE_LENGTH || !custOrderHandlingInst.parse(data, cursor)) {
                return false;
            }
            cursor += CustOrderHandlingInstField.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
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

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (sidePresent() != side.hasValue()) {
            throw new IllegalStateException(side.hasValue() ? "side holds a value the fields before it leave off the wire" : "side holds no value, though the fields before it put it on the wire");
        }
        if (allocQtyPresent() != allocQty.hasValue()) {
            throw new IllegalStateException(allocQty.hasValue() ? "allocQty holds a value the fields before it leave off the wire" : "allocQty holds no value, though the fields before it put it on the wire");
        }
        if (capacityPresent() != capacity.hasValue()) {
            throw new IllegalStateException(capacity.hasValue() ? "capacity holds a value the fields before it leave off the wire" : "capacity holds no value, though the fields before it put it on the wire");
        }
        if (openClosePresent() != openClose.hasValue()) {
            throw new IllegalStateException(openClose.hasValue() ? "openClose holds a value the fields before it leave off the wire" : "openClose holds no value, though the fields before it put it on the wire");
        }
        if (accountPresent() != account.hasValue()) {
            throw new IllegalStateException(account.hasValue() ? "account holds a value the fields before it leave off the wire" : "account holds no value, though the fields before it put it on the wire");
        }
        if (clearingAccountPresent() != clearingAccount.hasValue()) {
            throw new IllegalStateException(clearingAccount.hasValue() ? "clearingAccount holds a value the fields before it leave off the wire" : "clearingAccount holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (custOrderHandlingInstPresent() != custOrderHandlingInst.hasValue()) {
            throw new IllegalStateException(custOrderHandlingInst.hasValue() ? "custOrderHandlingInst holds a value the fields before it leave off the wire" : "custOrderHandlingInst holds no value, though the fields before it put it on the wire");
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
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        if (sidePresent()) {
            cursor = side.encode(data, cursor);
        }
        if (allocQtyPresent()) {
            cursor = allocQty.encode(data, cursor);
        }
        if (capacityPresent()) {
            cursor = capacity.encode(data, cursor);
        }
        if (openClosePresent()) {
            cursor = openClose.encode(data, cursor);
        }
        if (accountPresent()) {
            cursor = account.encode(data, cursor);
        }
        if (clearingAccountPresent()) {
            cursor = clearingAccount.encode(data, cursor);
        }
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (custOrderHandlingInstPresent()) {
            cursor = custOrderHandlingInst.encode(data, cursor);
        }
        cursor = accountType.encode(data, cursor);
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
        this.numberOfReturnBitfieldsInputKnown = numberOfReturnBitfieldsInputGiven;
        this.crossOrderCancelledReturnBitfield1InputKnown = crossOrderCancelledReturnBitfield1InputGiven;
        this.crossOrderCancelledReturnBitfield10InputKnown = crossOrderCancelledReturnBitfield10InputGiven;
        this.crossOrderCancelledReturnBitfield2InputKnown = crossOrderCancelledReturnBitfield2InputGiven;
        this.crossOrderCancelledReturnBitfield4InputKnown = crossOrderCancelledReturnBitfield4InputGiven;
        this.crossOrderCancelledReturnBitfield3InputKnown = crossOrderCancelledReturnBitfield3InputGiven;
        this.crossOrderCancelledReturnBitfield17InputKnown = crossOrderCancelledReturnBitfield17InputGiven;
        this.crossOrderCancelledReturnBitfield9InputKnown = crossOrderCancelledReturnBitfield9InputGiven;
        this.crossOrderCancelledReturnBitfield11InputKnown = crossOrderCancelledReturnBitfield11InputGiven;
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
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
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
            case "OrderId" -> Optional.of(orderId);
            case "Side" -> Optional.of(side);
            case "AllocQty" -> Optional.of(allocQty);
            case "Capacity" -> Optional.of(capacity);
            case "OpenClose" -> Optional.of(openClose);
            case "Account" -> Optional.of(account);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "AccountType" -> Optional.of(accountType);
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "OrderOrigination" -> Optional.of(orderOrigination);
            case "AlgorithmicIndicator" -> Optional.of(algorithmicIndicator);
            case "ClientId" -> Optional.of(clientId);
            case "ClientQualifiedRole" -> Optional.of(clientQualifiedRole);
            case "InvestorId" -> Optional.of(investorId);
            case "InvestorQualifiedRole" -> Optional.of(investorQualifiedRole);
            case "ExecutorId" -> Optional.of(executorId);
            case "ExecutorQualifiedRole" -> Optional.of(executorQualifiedRole);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof CrossOrderCancelledOrderAllocationsEntry message)) {
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
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof CrossOrderCancelledOrderAllocationsEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
