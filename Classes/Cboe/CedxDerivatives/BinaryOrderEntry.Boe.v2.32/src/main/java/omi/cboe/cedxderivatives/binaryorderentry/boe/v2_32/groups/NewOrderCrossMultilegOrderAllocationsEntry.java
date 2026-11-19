package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.AccountField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.AccountTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.AlgorithmicIndicatorField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.AllocQtyField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CapacityField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ClOrdIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ClearingAccountField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ClearingFirmField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ClientIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ClientQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CustOrderHandlingInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ExecutorIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ExecutorQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.InvestorIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.InvestorQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.LegPositionEffectsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.OrderOriginationField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.SideField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.GroupEntry;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.PrintOptions;

/**
 * One entry of the NewOrderCrossMultilegOrderAllocations repeating group.
 *
 * <p>Repeating group stated GroupCnt times.</p>
 */
public final class NewOrderCrossMultilegOrderAllocationsEntry implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 31;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "NewOrderCrossMultilegOrderAllocations";

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     */
    private final SideField side = new SideField();

    /**
     * Alloc Qty
     */
    private final AllocQtyField allocQty = new AllocQtyField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe (—). A leading tilde (˜) cannot be sent on any ClOrdID and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system-generated ClOrdID. If the ClOrdID matches a live order, the order will be rejected as a duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live or- ders. However, we strongly recommend that you keep your ClOrdID values at least day- unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Account Type
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Clearing Account
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * See List of Optional Fields (§ 6, p. 179).
     */
    private final LegPositionEffectsField legPositionEffects = new LegPositionEffectsField();

    /**
     * Cust Order Handling Inst
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

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
    private final List<Field> fields = List.of(side, allocQty, clOrdId, capacity, clearingFirm, accountType, account, clearingAccount, legPositionEffects, custOrderHandlingInst, orderOrigination, algorithmicIndicator, clientId, clientQualifiedRole, investorId, investorQualifiedRole, executorId, executorQualifiedRole);

    private byte[] buffer;

    private boolean decoded;

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
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe (—). A leading tilde (˜) cannot be sent on any ClOrdID and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system-generated ClOrdID. If the ClOrdID matches a live order, the order will be rejected as a duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live or- ders. However, we strongly recommend that you keep your ClOrdID values at least day- unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
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
     * Clearing Firm
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
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
     * See List of Optional Fields (§ 6, p. 179).
     *
     * @return the LegPositionEffects field
     */
    public LegPositionEffectsField legPositionEffects() {
        return legPositionEffects;
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
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 2L) && (newOrderCrossMultilegBitfield2InputKnown && ((newOrderCrossMultilegBitfield2Input >>> 3) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 2L) && (newOrderCrossMultilegBitfield2InputKnown && ((newOrderCrossMultilegBitfield2Input >>> 5) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the LegPositionEffects put it on the wire.
     *
     * <p>Decode reads the LegPositionEffects where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LegPositionEffects is on the wire
     */
    public boolean legPositionEffectsPresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 3L) && (newOrderCrossMultilegBitfield3InputKnown && ((newOrderCrossMultilegBitfield3Input >>> 4) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the CustOrderHandlingInst put it on the wire.
     *
     * <p>Decode reads the CustOrderHandlingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CustOrderHandlingInst is on the wire
     */
    public boolean custOrderHandlingInstPresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 1L) && (newOrderCrossMultilegBitfield1InputKnown && ((newOrderCrossMultilegBitfield1Input >>> 3) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the OrderOrigination put it on the wire.
     *
     * <p>Decode reads the OrderOrigination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigination is on the wire
     */
    public boolean orderOriginationPresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 1L) && (newOrderCrossMultilegBitfield1InputKnown && ((newOrderCrossMultilegBitfield1Input >>> 5) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the AlgorithmicIndicator put it on the wire.
     *
     * <p>Decode reads the AlgorithmicIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AlgorithmicIndicator is on the wire
     */
    public boolean algorithmicIndicatorPresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 1L) && (newOrderCrossMultilegBitfield1InputKnown && ((newOrderCrossMultilegBitfield1Input >>> 6) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ClientId put it on the wire.
     *
     * <p>Decode reads the ClientId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientId is on the wire
     */
    public boolean clientIdPresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 2L) && (newOrderCrossMultilegBitfield2InputKnown && ((newOrderCrossMultilegBitfield2Input >>> 6) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ClientQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ClientQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientQualifiedRole is on the wire
     */
    public boolean clientQualifiedRolePresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 2L) && (newOrderCrossMultilegBitfield2InputKnown && ((newOrderCrossMultilegBitfield2Input >>> 7) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the InvestorId put it on the wire.
     *
     * <p>Decode reads the InvestorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorId is on the wire
     */
    public boolean investorIdPresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 3L) && (newOrderCrossMultilegBitfield3InputKnown && ((newOrderCrossMultilegBitfield3Input >>> 0) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the InvestorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the InvestorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorQualifiedRole is on the wire
     */
    public boolean investorQualifiedRolePresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 3L) && (newOrderCrossMultilegBitfield3InputKnown && ((newOrderCrossMultilegBitfield3Input >>> 1) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ExecutorId put it on the wire.
     *
     * <p>Decode reads the ExecutorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorId is on the wire
     */
    public boolean executorIdPresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 3L) && (newOrderCrossMultilegBitfield3InputKnown && ((newOrderCrossMultilegBitfield3Input >>> 2) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ExecutorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ExecutorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorQualifiedRole is on the wire
     */
    public boolean executorQualifiedRolePresent() {
        return (numberOfNewOrderCrossMultilegBitfieldsInputKnown && numberOfNewOrderCrossMultilegBitfieldsInput >= 3L) && (newOrderCrossMultilegBitfield3InputKnown && ((newOrderCrossMultilegBitfield3Input >>> 3) & 0x1L) > 0L);
    }

    private boolean onWire(Field field) {
        return (field != account || accountPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != legPositionEffects || legPositionEffectsPresent()) && (field != custOrderHandlingInst || custOrderHandlingInstPresent()) && (field != orderOrigination || orderOriginationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent()) && (field != clientId || clientIdPresent()) && (field != clientQualifiedRole || clientQualifiedRolePresent()) && (field != investorId || investorIdPresent()) && (field != investorQualifiedRole || investorQualifiedRolePresent()) && (field != executorId || executorIdPresent()) && (field != executorQualifiedRole || executorQualifiedRolePresent());
    }

    private long numberOfNewOrderCrossMultilegBitfieldsInput;

    private boolean numberOfNewOrderCrossMultilegBitfieldsInputGiven;

    private boolean numberOfNewOrderCrossMultilegBitfieldsInputKnown;

    /**
     * Gives this message the NumberOfNewOrderCrossMultilegBitfields that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NumberOfNewOrderCrossMultilegBitfields
     */
    public void numberOfNewOrderCrossMultilegBitfieldsInput(long value) {
        this.numberOfNewOrderCrossMultilegBitfieldsInput = value;
        this.numberOfNewOrderCrossMultilegBitfieldsInputGiven = true;
        this.numberOfNewOrderCrossMultilegBitfieldsInputKnown = true;
    }

    /**
     * Gives this entry the NumberOfNewOrderCrossMultilegBitfields its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NumberOfNewOrderCrossMultilegBitfields, or empty
     */
    public void numberOfNewOrderCrossMultilegBitfieldsInput(OptionalLong value) {
        this.numberOfNewOrderCrossMultilegBitfieldsInput = value.orElse(0L);
        this.numberOfNewOrderCrossMultilegBitfieldsInputGiven = value.isPresent();
        this.numberOfNewOrderCrossMultilegBitfieldsInputKnown = value.isPresent();
    }

    /**
     * Returns the NumberOfNewOrderCrossMultilegBitfields this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NumberOfNewOrderCrossMultilegBitfields, or empty when none is given or known
     */
    public OptionalLong numberOfNewOrderCrossMultilegBitfieldsInput() {
        return numberOfNewOrderCrossMultilegBitfieldsInputKnown ? OptionalLong.of(numberOfNewOrderCrossMultilegBitfieldsInput) : OptionalLong.empty();
    }

    private long newOrderCrossMultilegBitfield2Input;

    private boolean newOrderCrossMultilegBitfield2InputGiven;

    private boolean newOrderCrossMultilegBitfield2InputKnown;

    /**
     * Gives this message the NewOrderCrossMultilegBitfield2 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NewOrderCrossMultilegBitfield2
     */
    public void newOrderCrossMultilegBitfield2Input(long value) {
        this.newOrderCrossMultilegBitfield2Input = value;
        this.newOrderCrossMultilegBitfield2InputGiven = true;
        this.newOrderCrossMultilegBitfield2InputKnown = true;
    }

    /**
     * Gives this entry the NewOrderCrossMultilegBitfield2 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NewOrderCrossMultilegBitfield2, or empty
     */
    public void newOrderCrossMultilegBitfield2Input(OptionalLong value) {
        this.newOrderCrossMultilegBitfield2Input = value.orElse(0L);
        this.newOrderCrossMultilegBitfield2InputGiven = value.isPresent();
        this.newOrderCrossMultilegBitfield2InputKnown = value.isPresent();
    }

    /**
     * Returns the NewOrderCrossMultilegBitfield2 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NewOrderCrossMultilegBitfield2, or empty when none is given or known
     */
    public OptionalLong newOrderCrossMultilegBitfield2Input() {
        return newOrderCrossMultilegBitfield2InputKnown ? OptionalLong.of(newOrderCrossMultilegBitfield2Input) : OptionalLong.empty();
    }

    private long newOrderCrossMultilegBitfield3Input;

    private boolean newOrderCrossMultilegBitfield3InputGiven;

    private boolean newOrderCrossMultilegBitfield3InputKnown;

    /**
     * Gives this message the NewOrderCrossMultilegBitfield3 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NewOrderCrossMultilegBitfield3
     */
    public void newOrderCrossMultilegBitfield3Input(long value) {
        this.newOrderCrossMultilegBitfield3Input = value;
        this.newOrderCrossMultilegBitfield3InputGiven = true;
        this.newOrderCrossMultilegBitfield3InputKnown = true;
    }

    /**
     * Gives this entry the NewOrderCrossMultilegBitfield3 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NewOrderCrossMultilegBitfield3, or empty
     */
    public void newOrderCrossMultilegBitfield3Input(OptionalLong value) {
        this.newOrderCrossMultilegBitfield3Input = value.orElse(0L);
        this.newOrderCrossMultilegBitfield3InputGiven = value.isPresent();
        this.newOrderCrossMultilegBitfield3InputKnown = value.isPresent();
    }

    /**
     * Returns the NewOrderCrossMultilegBitfield3 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NewOrderCrossMultilegBitfield3, or empty when none is given or known
     */
    public OptionalLong newOrderCrossMultilegBitfield3Input() {
        return newOrderCrossMultilegBitfield3InputKnown ? OptionalLong.of(newOrderCrossMultilegBitfield3Input) : OptionalLong.empty();
    }

    private long newOrderCrossMultilegBitfield1Input;

    private boolean newOrderCrossMultilegBitfield1InputGiven;

    private boolean newOrderCrossMultilegBitfield1InputKnown;

    /**
     * Gives this message the NewOrderCrossMultilegBitfield1 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NewOrderCrossMultilegBitfield1
     */
    public void newOrderCrossMultilegBitfield1Input(long value) {
        this.newOrderCrossMultilegBitfield1Input = value;
        this.newOrderCrossMultilegBitfield1InputGiven = true;
        this.newOrderCrossMultilegBitfield1InputKnown = true;
    }

    /**
     * Gives this entry the NewOrderCrossMultilegBitfield1 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NewOrderCrossMultilegBitfield1, or empty
     */
    public void newOrderCrossMultilegBitfield1Input(OptionalLong value) {
        this.newOrderCrossMultilegBitfield1Input = value.orElse(0L);
        this.newOrderCrossMultilegBitfield1InputGiven = value.isPresent();
        this.newOrderCrossMultilegBitfield1InputKnown = value.isPresent();
    }

    /**
     * Returns the NewOrderCrossMultilegBitfield1 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NewOrderCrossMultilegBitfield1, or empty when none is given or known
     */
    public OptionalLong newOrderCrossMultilegBitfield1Input() {
        return newOrderCrossMultilegBitfield1InputKnown ? OptionalLong.of(newOrderCrossMultilegBitfield1Input) : OptionalLong.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (legPositionEffectsPresent() ? LegPositionEffectsField.BYTE_LENGTH : 0) + (custOrderHandlingInstPresent() ? CustOrderHandlingInstField.BYTE_LENGTH : 0) + (orderOriginationPresent() ? OrderOriginationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0) + (clientIdPresent() ? ClientIdField.BYTE_LENGTH : 0) + (clientQualifiedRolePresent() ? ClientQualifiedRoleField.BYTE_LENGTH : 0) + (investorIdPresent() ? InvestorIdField.BYTE_LENGTH : 0) + (investorQualifiedRolePresent() ? InvestorQualifiedRoleField.BYTE_LENGTH : 0) + (executorIdPresent() ? ExecutorIdField.BYTE_LENGTH : 0) + (executorQualifiedRolePresent() ? ExecutorQualifiedRoleField.BYTE_LENGTH : 0);
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
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!allocQty.parse(data, cursor)) {
            return false;
        }
        cursor += AllocQtyField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (accountPresent()) {
            if (end - cursor < AccountField.BYTE_LENGTH || !account.parse(data, cursor)) {
                return false;
            }
            cursor += AccountField.BYTE_LENGTH;
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
        if (legPositionEffectsPresent()) {
            if (end - cursor < LegPositionEffectsField.BYTE_LENGTH || !legPositionEffects.parse(data, cursor)) {
                return false;
            }
            cursor += LegPositionEffectsField.BYTE_LENGTH;
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
        if (accountPresent() != account.hasValue()) {
            throw new IllegalStateException(account.hasValue() ? "account holds a value the fields before it leave off the wire" : "account holds no value, though the fields before it put it on the wire");
        }
        if (clearingAccountPresent() != clearingAccount.hasValue()) {
            throw new IllegalStateException(clearingAccount.hasValue() ? "clearingAccount holds a value the fields before it leave off the wire" : "clearingAccount holds no value, though the fields before it put it on the wire");
        }
        if (legPositionEffectsPresent() != legPositionEffects.hasValue()) {
            throw new IllegalStateException(legPositionEffects.hasValue() ? "legPositionEffects holds a value the fields before it leave off the wire" : "legPositionEffects holds no value, though the fields before it put it on the wire");
        }
        if (custOrderHandlingInstPresent() != custOrderHandlingInst.hasValue()) {
            throw new IllegalStateException(custOrderHandlingInst.hasValue() ? "custOrderHandlingInst holds a value the fields before it leave off the wire" : "custOrderHandlingInst holds no value, though the fields before it put it on the wire");
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
        cursor = side.encode(data, cursor);
        cursor = allocQty.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        if (accountPresent()) {
            cursor = account.encode(data, cursor);
        }
        if (clearingAccountPresent()) {
            cursor = clearingAccount.encode(data, cursor);
        }
        if (legPositionEffectsPresent()) {
            cursor = legPositionEffects.encode(data, cursor);
        }
        if (custOrderHandlingInstPresent()) {
            cursor = custOrderHandlingInst.encode(data, cursor);
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
        this.numberOfNewOrderCrossMultilegBitfieldsInputKnown = numberOfNewOrderCrossMultilegBitfieldsInputGiven;
        this.newOrderCrossMultilegBitfield2InputKnown = newOrderCrossMultilegBitfield2InputGiven;
        this.newOrderCrossMultilegBitfield3InputKnown = newOrderCrossMultilegBitfield3InputGiven;
        this.newOrderCrossMultilegBitfield1InputKnown = newOrderCrossMultilegBitfield1InputGiven;
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
            case "Side" -> Optional.of(side);
            case "AllocQty" -> Optional.of(allocQty);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "Capacity" -> Optional.of(capacity);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "AccountType" -> Optional.of(accountType);
            case "Account" -> Optional.of(account);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "LegPositionEffects" -> Optional.of(legPositionEffects);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
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
        if (!(other instanceof NewOrderCrossMultilegOrderAllocationsEntry message)) {
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
        if (!(other instanceof NewOrderCrossMultilegOrderAllocationsEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
