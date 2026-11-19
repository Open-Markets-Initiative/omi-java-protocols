package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.AccountField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.AccountTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.AlgorithmicIndicatorField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.AllocQtyField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.CapacityField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ClOrdIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ClearingAccountField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ClearingFirmField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ClientIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ClientQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.CustOrderHandlingInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ExecutorIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.ExecutorQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.InvestorIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.InvestorQualifiedRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.OpenCloseField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.OrderOriginationField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.fields.SideField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.types.GroupEntry;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.types.PrintOptions;

/**
 * One entry of the OrderAllocations repeating group.
 *
 * <p>Repeating group stated GroupCnt times.</p>
 */
public final class OrderAllocationsEntry implements GroupEntry {

    /**
     * This entry's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 31;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "OrderAllocations";

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     */
    private final SideField side = new SideField();

    /**
     * Alloc Qty
     */
    private final AllocQtyField allocQty = new AllocQtyField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. A leading tilde (˜) cannot be sent on any ClOrdId and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system generated ClOrdId. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
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
     * Open Close
     */
    private final OpenCloseField openClose = new OpenCloseField();

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
    private final List<Field> fields = List.of(side, allocQty, clOrdId, capacity, clearingFirm, accountType, account, clearingAccount, openClose, custOrderHandlingInst, orderOrigination, algorithmicIndicator, clientId, clientQualifiedRole, investorId, investorQualifiedRole, executorId, executorQualifiedRole);

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
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. A leading tilde (˜) cannot be sent on any ClOrdId and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system generated ClOrdId. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
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
     * Open Close
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
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
        return (numberOfNewOrderCrossBitfieldsInputKnown && numberOfNewOrderCrossBitfieldsInput >= 2L) && (newOrderCrossBitfield2InputKnown && ((newOrderCrossBitfield2Input >>> 3) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfNewOrderCrossBitfieldsInputKnown && numberOfNewOrderCrossBitfieldsInput >= 2L) && (newOrderCrossBitfield2InputKnown && ((newOrderCrossBitfield2Input >>> 5) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfNewOrderCrossBitfieldsInputKnown && numberOfNewOrderCrossBitfieldsInput >= 3L) && (newOrderCrossBitfield3InputKnown && ((newOrderCrossBitfield3Input >>> 4) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the CustOrderHandlingInst put it on the wire.
     *
     * <p>Decode reads the CustOrderHandlingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CustOrderHandlingInst is on the wire
     */
    public boolean custOrderHandlingInstPresent() {
        return (numberOfNewOrderCrossBitfieldsInputKnown && numberOfNewOrderCrossBitfieldsInput >= 1L) && (newOrderCrossBitfield1InputKnown && ((newOrderCrossBitfield1Input >>> 3) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the OrderOrigination put it on the wire.
     *
     * <p>Decode reads the OrderOrigination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigination is on the wire
     */
    public boolean orderOriginationPresent() {
        return (numberOfNewOrderCrossBitfieldsInputKnown && numberOfNewOrderCrossBitfieldsInput >= 1L) && (newOrderCrossBitfield1InputKnown && ((newOrderCrossBitfield1Input >>> 5) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the AlgorithmicIndicator put it on the wire.
     *
     * <p>Decode reads the AlgorithmicIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AlgorithmicIndicator is on the wire
     */
    public boolean algorithmicIndicatorPresent() {
        return (numberOfNewOrderCrossBitfieldsInputKnown && numberOfNewOrderCrossBitfieldsInput >= 1L) && (newOrderCrossBitfield1InputKnown && ((newOrderCrossBitfield1Input >>> 6) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ClientId put it on the wire.
     *
     * <p>Decode reads the ClientId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientId is on the wire
     */
    public boolean clientIdPresent() {
        return (numberOfNewOrderCrossBitfieldsInputKnown && numberOfNewOrderCrossBitfieldsInput >= 2L) && (newOrderCrossBitfield2InputKnown && ((newOrderCrossBitfield2Input >>> 6) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ClientQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ClientQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientQualifiedRole is on the wire
     */
    public boolean clientQualifiedRolePresent() {
        return (numberOfNewOrderCrossBitfieldsInputKnown && numberOfNewOrderCrossBitfieldsInput >= 2L) && (newOrderCrossBitfield2InputKnown && ((newOrderCrossBitfield2Input >>> 7) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the InvestorId put it on the wire.
     *
     * <p>Decode reads the InvestorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorId is on the wire
     */
    public boolean investorIdPresent() {
        return (numberOfNewOrderCrossBitfieldsInputKnown && numberOfNewOrderCrossBitfieldsInput >= 3L) && (newOrderCrossBitfield3InputKnown && ((newOrderCrossBitfield3Input >>> 0) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the InvestorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the InvestorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorQualifiedRole is on the wire
     */
    public boolean investorQualifiedRolePresent() {
        return (numberOfNewOrderCrossBitfieldsInputKnown && numberOfNewOrderCrossBitfieldsInput >= 3L) && (newOrderCrossBitfield3InputKnown && ((newOrderCrossBitfield3Input >>> 1) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ExecutorId put it on the wire.
     *
     * <p>Decode reads the ExecutorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorId is on the wire
     */
    public boolean executorIdPresent() {
        return (numberOfNewOrderCrossBitfieldsInputKnown && numberOfNewOrderCrossBitfieldsInput >= 3L) && (newOrderCrossBitfield3InputKnown && ((newOrderCrossBitfield3Input >>> 2) & 0x1L) > 0L);
    }

    /**
     * Returns whether the fields before the ExecutorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ExecutorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorQualifiedRole is on the wire
     */
    public boolean executorQualifiedRolePresent() {
        return (numberOfNewOrderCrossBitfieldsInputKnown && numberOfNewOrderCrossBitfieldsInput >= 3L) && (newOrderCrossBitfield3InputKnown && ((newOrderCrossBitfield3Input >>> 3) & 0x1L) > 0L);
    }

    private boolean onWire(Field field) {
        return (field != account || accountPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != openClose || openClosePresent()) && (field != custOrderHandlingInst || custOrderHandlingInstPresent()) && (field != orderOrigination || orderOriginationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent()) && (field != clientId || clientIdPresent()) && (field != clientQualifiedRole || clientQualifiedRolePresent()) && (field != investorId || investorIdPresent()) && (field != investorQualifiedRole || investorQualifiedRolePresent()) && (field != executorId || executorIdPresent()) && (field != executorQualifiedRole || executorQualifiedRolePresent());
    }

    private long numberOfNewOrderCrossBitfieldsInput;

    private boolean numberOfNewOrderCrossBitfieldsInputGiven;

    private boolean numberOfNewOrderCrossBitfieldsInputKnown;

    /**
     * Gives this message the NumberOfNewOrderCrossBitfields that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NumberOfNewOrderCrossBitfields
     */
    public void numberOfNewOrderCrossBitfieldsInput(long value) {
        this.numberOfNewOrderCrossBitfieldsInput = value;
        this.numberOfNewOrderCrossBitfieldsInputGiven = true;
        this.numberOfNewOrderCrossBitfieldsInputKnown = true;
    }

    /**
     * Gives this entry the NumberOfNewOrderCrossBitfields its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NumberOfNewOrderCrossBitfields, or empty
     */
    public void numberOfNewOrderCrossBitfieldsInput(OptionalLong value) {
        this.numberOfNewOrderCrossBitfieldsInput = value.orElse(0L);
        this.numberOfNewOrderCrossBitfieldsInputGiven = value.isPresent();
        this.numberOfNewOrderCrossBitfieldsInputKnown = value.isPresent();
    }

    /**
     * Returns the NumberOfNewOrderCrossBitfields this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NumberOfNewOrderCrossBitfields, or empty when none is given or known
     */
    public OptionalLong numberOfNewOrderCrossBitfieldsInput() {
        return numberOfNewOrderCrossBitfieldsInputKnown ? OptionalLong.of(numberOfNewOrderCrossBitfieldsInput) : OptionalLong.empty();
    }

    private long newOrderCrossBitfield2Input;

    private boolean newOrderCrossBitfield2InputGiven;

    private boolean newOrderCrossBitfield2InputKnown;

    /**
     * Gives this message the NewOrderCrossBitfield2 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NewOrderCrossBitfield2
     */
    public void newOrderCrossBitfield2Input(long value) {
        this.newOrderCrossBitfield2Input = value;
        this.newOrderCrossBitfield2InputGiven = true;
        this.newOrderCrossBitfield2InputKnown = true;
    }

    /**
     * Gives this entry the NewOrderCrossBitfield2 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NewOrderCrossBitfield2, or empty
     */
    public void newOrderCrossBitfield2Input(OptionalLong value) {
        this.newOrderCrossBitfield2Input = value.orElse(0L);
        this.newOrderCrossBitfield2InputGiven = value.isPresent();
        this.newOrderCrossBitfield2InputKnown = value.isPresent();
    }

    /**
     * Returns the NewOrderCrossBitfield2 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NewOrderCrossBitfield2, or empty when none is given or known
     */
    public OptionalLong newOrderCrossBitfield2Input() {
        return newOrderCrossBitfield2InputKnown ? OptionalLong.of(newOrderCrossBitfield2Input) : OptionalLong.empty();
    }

    private long newOrderCrossBitfield3Input;

    private boolean newOrderCrossBitfield3InputGiven;

    private boolean newOrderCrossBitfield3InputKnown;

    /**
     * Gives this message the NewOrderCrossBitfield3 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NewOrderCrossBitfield3
     */
    public void newOrderCrossBitfield3Input(long value) {
        this.newOrderCrossBitfield3Input = value;
        this.newOrderCrossBitfield3InputGiven = true;
        this.newOrderCrossBitfield3InputKnown = true;
    }

    /**
     * Gives this entry the NewOrderCrossBitfield3 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NewOrderCrossBitfield3, or empty
     */
    public void newOrderCrossBitfield3Input(OptionalLong value) {
        this.newOrderCrossBitfield3Input = value.orElse(0L);
        this.newOrderCrossBitfield3InputGiven = value.isPresent();
        this.newOrderCrossBitfield3InputKnown = value.isPresent();
    }

    /**
     * Returns the NewOrderCrossBitfield3 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NewOrderCrossBitfield3, or empty when none is given or known
     */
    public OptionalLong newOrderCrossBitfield3Input() {
        return newOrderCrossBitfield3InputKnown ? OptionalLong.of(newOrderCrossBitfield3Input) : OptionalLong.empty();
    }

    private long newOrderCrossBitfield1Input;

    private boolean newOrderCrossBitfield1InputGiven;

    private boolean newOrderCrossBitfield1InputKnown;

    /**
     * Gives this message the NewOrderCrossBitfield1 that the bytes around it state, which its rules read.
     *
     * <p>Its holder gives it as it parses and measures itself; where none is given, what it governs is absent. A given value is kept until another is given.</p>
     *
     * @param value the NewOrderCrossBitfield1
     */
    public void newOrderCrossBitfield1Input(long value) {
        this.newOrderCrossBitfield1Input = value;
        this.newOrderCrossBitfield1InputGiven = true;
        this.newOrderCrossBitfield1InputKnown = true;
    }

    /**
     * Gives this entry the NewOrderCrossBitfield1 its holder read before the list, or none while that field is off the holder's wire.
     *
     * <p>A rule reading none holds for nothing, so what it governs is then absent.</p>
     *
     * @param value the NewOrderCrossBitfield1, or empty
     */
    public void newOrderCrossBitfield1Input(OptionalLong value) {
        this.newOrderCrossBitfield1Input = value.orElse(0L);
        this.newOrderCrossBitfield1InputGiven = value.isPresent();
        this.newOrderCrossBitfield1InputKnown = value.isPresent();
    }

    /**
     * Returns the NewOrderCrossBitfield1 this message's rules read: as given, or as its width stated it at its last decode.
     *
     * @return the NewOrderCrossBitfield1, or empty when none is given or known
     */
    public OptionalLong newOrderCrossBitfield1Input() {
        return newOrderCrossBitfield1InputKnown ? OptionalLong.of(newOrderCrossBitfield1Input) : OptionalLong.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (custOrderHandlingInstPresent() ? CustOrderHandlingInstField.BYTE_LENGTH : 0) + (orderOriginationPresent() ? OrderOriginationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0) + (clientIdPresent() ? ClientIdField.BYTE_LENGTH : 0) + (clientQualifiedRolePresent() ? ClientQualifiedRoleField.BYTE_LENGTH : 0) + (investorIdPresent() ? InvestorIdField.BYTE_LENGTH : 0) + (investorQualifiedRolePresent() ? InvestorQualifiedRoleField.BYTE_LENGTH : 0) + (executorIdPresent() ? ExecutorIdField.BYTE_LENGTH : 0) + (executorQualifiedRolePresent() ? ExecutorQualifiedRoleField.BYTE_LENGTH : 0);
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
        if (openClosePresent()) {
            if (end - cursor < OpenCloseField.BYTE_LENGTH || !openClose.parse(data, cursor)) {
                return false;
            }
            cursor += OpenCloseField.BYTE_LENGTH;
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
        if (openClosePresent() != openClose.hasValue()) {
            throw new IllegalStateException(openClose.hasValue() ? "openClose holds a value the fields before it leave off the wire" : "openClose holds no value, though the fields before it put it on the wire");
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
        if (openClosePresent()) {
            cursor = openClose.encode(data, cursor);
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
        this.numberOfNewOrderCrossBitfieldsInputKnown = numberOfNewOrderCrossBitfieldsInputGiven;
        this.newOrderCrossBitfield2InputKnown = newOrderCrossBitfield2InputGiven;
        this.newOrderCrossBitfield3InputKnown = newOrderCrossBitfield3InputGiven;
        this.newOrderCrossBitfield1InputKnown = newOrderCrossBitfield1InputGiven;
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
            case "OpenClose" -> Optional.of(openClose);
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
        if (!(other instanceof OrderAllocationsEntry message)) {
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
        if (!(other instanceof OrderAllocationsEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
