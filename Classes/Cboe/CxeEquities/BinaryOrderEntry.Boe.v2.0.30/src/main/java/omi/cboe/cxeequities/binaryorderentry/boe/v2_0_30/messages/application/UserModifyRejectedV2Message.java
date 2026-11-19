package omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.AlgorithmicIndicatorField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.ClOrdIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.ClientIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.ClientQualifiedRoleField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.DeferralReasonField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.ExecutorIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.ExecutorQualifiedRoleField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.InvestorIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.InvestorQualifiedRoleField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.ModifyRejectReasonField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.OrderOriginationField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.PriceFormationField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.TextField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.TransactionTimeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.UserModifyRejectedV2ReturnBitfield10Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.UserModifyRejectedV2ReturnBitfield11Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.UserModifyRejectedV2ReturnBitfield12Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.UserModifyRejectedV2ReturnBitfield13Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.UserModifyRejectedV2ReturnBitfield14Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.UserModifyRejectedV2ReturnBitfield1Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.UserModifyRejectedV2ReturnBitfield2Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.UserModifyRejectedV2ReturnBitfield3Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.UserModifyRejectedV2ReturnBitfield4Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.UserModifyRejectedV2ReturnBitfield5Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.UserModifyRejectedV2ReturnBitfield6Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.UserModifyRejectedV2ReturnBitfield7Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.UserModifyRejectedV2ReturnBitfield8Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.UserModifyRejectedV2ReturnBitfield9Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.fields.WaiverTypeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.types.Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.types.Message;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_30.types.PrintOptions;

/**
 * Represents the UserModifyRejectedV2Message message from the BinaryOrderEntry protocol.
 *
 * <p>User Modify Rejected V2 Message.</p>
 */
public final class UserModifyRejectedV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 91;

    /**
     * This message's declared name.
     */
    public static final String NAME = "User Modify Rejected V 2 Message";

    /**
     * The time the event occurred in the Bats match- ing engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Bats FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Bats only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Reason for a modify rejection. See Reason Codes (§ 8, p. 102) for a list of possible reasons.
     */
    private final ModifyRejectReasonField modifyRejectReason = new ModifyRejectReasonField();

    /**
     * Human readable text with more information about the reject reason.
     */
    private final TextField text = new TextField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet UserModifyRejectedV2 byte 1.
     */
    private final UserModifyRejectedV2ReturnBitfield1Field userModifyRejectedV2ReturnBitfield1 = new UserModifyRejectedV2ReturnBitfield1Field();

    /**
     * BitSet UserModifyRejectedV2 byte 2.
     */
    private final UserModifyRejectedV2ReturnBitfield2Field userModifyRejectedV2ReturnBitfield2 = new UserModifyRejectedV2ReturnBitfield2Field();

    /**
     * BitSet UserModifyRejectedV2 byte 3.
     */
    private final UserModifyRejectedV2ReturnBitfield3Field userModifyRejectedV2ReturnBitfield3 = new UserModifyRejectedV2ReturnBitfield3Field();

    /**
     * BitSet UserModifyRejectedV2 byte 4.
     */
    private final UserModifyRejectedV2ReturnBitfield4Field userModifyRejectedV2ReturnBitfield4 = new UserModifyRejectedV2ReturnBitfield4Field();

    /**
     * BitSet UserModifyRejectedV2 byte 5.
     */
    private final UserModifyRejectedV2ReturnBitfield5Field userModifyRejectedV2ReturnBitfield5 = new UserModifyRejectedV2ReturnBitfield5Field();

    /**
     * BitSet UserModifyRejectedV2 byte 6.
     */
    private final UserModifyRejectedV2ReturnBitfield6Field userModifyRejectedV2ReturnBitfield6 = new UserModifyRejectedV2ReturnBitfield6Field();

    /**
     * BitSet UserModifyRejectedV2 byte 7.
     */
    private final UserModifyRejectedV2ReturnBitfield7Field userModifyRejectedV2ReturnBitfield7 = new UserModifyRejectedV2ReturnBitfield7Field();

    /**
     * BitSet UserModifyRejectedV2 byte 8.
     */
    private final UserModifyRejectedV2ReturnBitfield8Field userModifyRejectedV2ReturnBitfield8 = new UserModifyRejectedV2ReturnBitfield8Field();

    /**
     * BitSet UserModifyRejectedV2 byte 9.
     */
    private final UserModifyRejectedV2ReturnBitfield9Field userModifyRejectedV2ReturnBitfield9 = new UserModifyRejectedV2ReturnBitfield9Field();

    /**
     * BitSet UserModifyRejectedV2 byte 10.
     */
    private final UserModifyRejectedV2ReturnBitfield10Field userModifyRejectedV2ReturnBitfield10 = new UserModifyRejectedV2ReturnBitfield10Field();

    /**
     * BitSet UserModifyRejectedV2 byte 11.
     */
    private final UserModifyRejectedV2ReturnBitfield11Field userModifyRejectedV2ReturnBitfield11 = new UserModifyRejectedV2ReturnBitfield11Field();

    /**
     * BitSet UserModifyRejectedV2 byte 12.
     */
    private final UserModifyRejectedV2ReturnBitfield12Field userModifyRejectedV2ReturnBitfield12 = new UserModifyRejectedV2ReturnBitfield12Field();

    /**
     * BitSet UserModifyRejectedV2 byte 13.
     */
    private final UserModifyRejectedV2ReturnBitfield13Field userModifyRejectedV2ReturnBitfield13 = new UserModifyRejectedV2ReturnBitfield13Field();

    /**
     * BitSet UserModifyRejectedV2 byte 14.
     */
    private final UserModifyRejectedV2ReturnBitfield14Field userModifyRejectedV2ReturnBitfield14 = new UserModifyRejectedV2ReturnBitfield14Field();

    /**
     * Waiver Type
     */
    private final WaiverTypeField waiverType = new WaiverTypeField();

    /**
     * Price Formation
     */
    private final PriceFormationField priceFormation = new PriceFormationField();

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
     * Deferral Reason
     */
    private final DeferralReasonField deferralReason = new DeferralReasonField();

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
    private final List<Field> fields = List.of(transactionTime, clOrdId, modifyRejectReason, text, numberOfReturnBitfields, userModifyRejectedV2ReturnBitfield1, userModifyRejectedV2ReturnBitfield2, userModifyRejectedV2ReturnBitfield3, userModifyRejectedV2ReturnBitfield4, userModifyRejectedV2ReturnBitfield5, userModifyRejectedV2ReturnBitfield6, userModifyRejectedV2ReturnBitfield7, userModifyRejectedV2ReturnBitfield8, userModifyRejectedV2ReturnBitfield9, userModifyRejectedV2ReturnBitfield10, userModifyRejectedV2ReturnBitfield11, userModifyRejectedV2ReturnBitfield12, userModifyRejectedV2ReturnBitfield13, userModifyRejectedV2ReturnBitfield14, waiverType, priceFormation, clientQualifiedRole, clientId, investorId, executorId, orderOrigination, algorithmicIndicator, deferralReason, investorQualifiedRole, executorQualifiedRole);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the Bats match- ing engine (not the time the message was sent).
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Corresponds to ClOrdID (11) in Bats FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Bats only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Reason for a modify rejection. See Reason Codes (§ 8, p. 102) for a list of possible reasons.
     *
     * @return the ModifyRejectReason field
     */
    public ModifyRejectReasonField modifyRejectReason() {
        return modifyRejectReason;
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
     * BitSet UserModifyRejectedV2 byte 1.
     *
     * @return the UserModifyRejectedV2ReturnBitfield1 field
     */
    public UserModifyRejectedV2ReturnBitfield1Field userModifyRejectedV2ReturnBitfield1() {
        return userModifyRejectedV2ReturnBitfield1;
    }

    /**
     * BitSet UserModifyRejectedV2 byte 2.
     *
     * @return the UserModifyRejectedV2ReturnBitfield2 field
     */
    public UserModifyRejectedV2ReturnBitfield2Field userModifyRejectedV2ReturnBitfield2() {
        return userModifyRejectedV2ReturnBitfield2;
    }

    /**
     * BitSet UserModifyRejectedV2 byte 3.
     *
     * @return the UserModifyRejectedV2ReturnBitfield3 field
     */
    public UserModifyRejectedV2ReturnBitfield3Field userModifyRejectedV2ReturnBitfield3() {
        return userModifyRejectedV2ReturnBitfield3;
    }

    /**
     * BitSet UserModifyRejectedV2 byte 4.
     *
     * @return the UserModifyRejectedV2ReturnBitfield4 field
     */
    public UserModifyRejectedV2ReturnBitfield4Field userModifyRejectedV2ReturnBitfield4() {
        return userModifyRejectedV2ReturnBitfield4;
    }

    /**
     * BitSet UserModifyRejectedV2 byte 5.
     *
     * @return the UserModifyRejectedV2ReturnBitfield5 field
     */
    public UserModifyRejectedV2ReturnBitfield5Field userModifyRejectedV2ReturnBitfield5() {
        return userModifyRejectedV2ReturnBitfield5;
    }

    /**
     * BitSet UserModifyRejectedV2 byte 6.
     *
     * @return the UserModifyRejectedV2ReturnBitfield6 field
     */
    public UserModifyRejectedV2ReturnBitfield6Field userModifyRejectedV2ReturnBitfield6() {
        return userModifyRejectedV2ReturnBitfield6;
    }

    /**
     * BitSet UserModifyRejectedV2 byte 7.
     *
     * @return the UserModifyRejectedV2ReturnBitfield7 field
     */
    public UserModifyRejectedV2ReturnBitfield7Field userModifyRejectedV2ReturnBitfield7() {
        return userModifyRejectedV2ReturnBitfield7;
    }

    /**
     * BitSet UserModifyRejectedV2 byte 8.
     *
     * @return the UserModifyRejectedV2ReturnBitfield8 field
     */
    public UserModifyRejectedV2ReturnBitfield8Field userModifyRejectedV2ReturnBitfield8() {
        return userModifyRejectedV2ReturnBitfield8;
    }

    /**
     * BitSet UserModifyRejectedV2 byte 9.
     *
     * @return the UserModifyRejectedV2ReturnBitfield9 field
     */
    public UserModifyRejectedV2ReturnBitfield9Field userModifyRejectedV2ReturnBitfield9() {
        return userModifyRejectedV2ReturnBitfield9;
    }

    /**
     * BitSet UserModifyRejectedV2 byte 10.
     *
     * @return the UserModifyRejectedV2ReturnBitfield10 field
     */
    public UserModifyRejectedV2ReturnBitfield10Field userModifyRejectedV2ReturnBitfield10() {
        return userModifyRejectedV2ReturnBitfield10;
    }

    /**
     * BitSet UserModifyRejectedV2 byte 11.
     *
     * @return the UserModifyRejectedV2ReturnBitfield11 field
     */
    public UserModifyRejectedV2ReturnBitfield11Field userModifyRejectedV2ReturnBitfield11() {
        return userModifyRejectedV2ReturnBitfield11;
    }

    /**
     * BitSet UserModifyRejectedV2 byte 12.
     *
     * @return the UserModifyRejectedV2ReturnBitfield12 field
     */
    public UserModifyRejectedV2ReturnBitfield12Field userModifyRejectedV2ReturnBitfield12() {
        return userModifyRejectedV2ReturnBitfield12;
    }

    /**
     * BitSet UserModifyRejectedV2 byte 13.
     *
     * @return the UserModifyRejectedV2ReturnBitfield13 field
     */
    public UserModifyRejectedV2ReturnBitfield13Field userModifyRejectedV2ReturnBitfield13() {
        return userModifyRejectedV2ReturnBitfield13;
    }

    /**
     * BitSet UserModifyRejectedV2 byte 14.
     *
     * @return the UserModifyRejectedV2ReturnBitfield14 field
     */
    public UserModifyRejectedV2ReturnBitfield14Field userModifyRejectedV2ReturnBitfield14() {
        return userModifyRejectedV2ReturnBitfield14;
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
     * Price Formation
     *
     * @return the PriceFormation field
     */
    public PriceFormationField priceFormation() {
        return priceFormation;
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
     * Deferral Reason
     *
     * @return the DeferralReason field
     */
    public DeferralReasonField deferralReason() {
        return deferralReason;
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
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield1 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield2 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield3 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield4 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield5 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield6 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield7 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield8 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield9 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield10 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield11 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield12 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield13 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield14 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the WaiverType put it on the wire.
     *
     * <p>Decode reads the WaiverType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the WaiverType is on the wire
     */
    public boolean waiverTypePresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (userModifyRejectedV2ReturnBitfield10Present() && userModifyRejectedV2ReturnBitfield10.userModifyRejectedV2ReturnBitfield10WaiverType());
    }

    /**
     * Returns whether the fields before the PriceFormation put it on the wire.
     *
     * <p>Decode reads the PriceFormation where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceFormation is on the wire
     */
    public boolean priceFormationPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (userModifyRejectedV2ReturnBitfield10Present() && userModifyRejectedV2ReturnBitfield10.userModifyRejectedV2ReturnBitfield10PriceFormation());
    }

    /**
     * Returns whether the fields before the ClientQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ClientQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientQualifiedRole is on the wire
     */
    public boolean clientQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (userModifyRejectedV2ReturnBitfield10Present() && userModifyRejectedV2ReturnBitfield10.userModifyRejectedV2ReturnBitfield10ClientQualifiedRole());
    }

    /**
     * Returns whether the fields before the ClientId put it on the wire.
     *
     * <p>Decode reads the ClientId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientId is on the wire
     */
    public boolean clientIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (userModifyRejectedV2ReturnBitfield11Present() && userModifyRejectedV2ReturnBitfield11.userModifyRejectedV2ReturnBitfield11ClientId());
    }

    /**
     * Returns whether the fields before the InvestorId put it on the wire.
     *
     * <p>Decode reads the InvestorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorId is on the wire
     */
    public boolean investorIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (userModifyRejectedV2ReturnBitfield11Present() && userModifyRejectedV2ReturnBitfield11.userModifyRejectedV2ReturnBitfield11InvestorId());
    }

    /**
     * Returns whether the fields before the ExecutorId put it on the wire.
     *
     * <p>Decode reads the ExecutorId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorId is on the wire
     */
    public boolean executorIdPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (userModifyRejectedV2ReturnBitfield11Present() && userModifyRejectedV2ReturnBitfield11.userModifyRejectedV2ReturnBitfield11ExecutorId());
    }

    /**
     * Returns whether the fields before the OrderOrigination put it on the wire.
     *
     * <p>Decode reads the OrderOrigination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigination is on the wire
     */
    public boolean orderOriginationPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (userModifyRejectedV2ReturnBitfield11Present() && userModifyRejectedV2ReturnBitfield11.userModifyRejectedV2ReturnBitfield11OrderOrigination());
    }

    /**
     * Returns whether the fields before the AlgorithmicIndicator put it on the wire.
     *
     * <p>Decode reads the AlgorithmicIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AlgorithmicIndicator is on the wire
     */
    public boolean algorithmicIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (userModifyRejectedV2ReturnBitfield11Present() && userModifyRejectedV2ReturnBitfield11.userModifyRejectedV2ReturnBitfield11AlgorithmicIndicator());
    }

    /**
     * Returns whether the fields before the DeferralReason put it on the wire.
     *
     * <p>Decode reads the DeferralReason where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DeferralReason is on the wire
     */
    public boolean deferralReasonPresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (userModifyRejectedV2ReturnBitfield11Present() && userModifyRejectedV2ReturnBitfield11.userModifyRejectedV2ReturnBitfield11DeferralReason());
    }

    /**
     * Returns whether the fields before the InvestorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the InvestorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the InvestorQualifiedRole is on the wire
     */
    public boolean investorQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (userModifyRejectedV2ReturnBitfield11Present() && userModifyRejectedV2ReturnBitfield11.userModifyRejectedV2ReturnBitfield11InvestorQualifiedRole());
    }

    /**
     * Returns whether the fields before the ExecutorQualifiedRole put it on the wire.
     *
     * <p>Decode reads the ExecutorQualifiedRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecutorQualifiedRole is on the wire
     */
    public boolean executorQualifiedRolePresent() {
        return (numberOfReturnBitfields.value() >= 11L) && (userModifyRejectedV2ReturnBitfield11Present() && userModifyRejectedV2ReturnBitfield11.userModifyRejectedV2ReturnBitfield11ExecutorQualifiedRole());
    }

    private boolean onWire(Field field) {
        return (field != userModifyRejectedV2ReturnBitfield1 || userModifyRejectedV2ReturnBitfield1Present()) && (field != userModifyRejectedV2ReturnBitfield2 || userModifyRejectedV2ReturnBitfield2Present()) && (field != userModifyRejectedV2ReturnBitfield3 || userModifyRejectedV2ReturnBitfield3Present()) && (field != userModifyRejectedV2ReturnBitfield4 || userModifyRejectedV2ReturnBitfield4Present()) && (field != userModifyRejectedV2ReturnBitfield5 || userModifyRejectedV2ReturnBitfield5Present()) && (field != userModifyRejectedV2ReturnBitfield6 || userModifyRejectedV2ReturnBitfield6Present()) && (field != userModifyRejectedV2ReturnBitfield7 || userModifyRejectedV2ReturnBitfield7Present()) && (field != userModifyRejectedV2ReturnBitfield8 || userModifyRejectedV2ReturnBitfield8Present()) && (field != userModifyRejectedV2ReturnBitfield9 || userModifyRejectedV2ReturnBitfield9Present()) && (field != userModifyRejectedV2ReturnBitfield10 || userModifyRejectedV2ReturnBitfield10Present()) && (field != userModifyRejectedV2ReturnBitfield11 || userModifyRejectedV2ReturnBitfield11Present()) && (field != userModifyRejectedV2ReturnBitfield12 || userModifyRejectedV2ReturnBitfield12Present()) && (field != userModifyRejectedV2ReturnBitfield13 || userModifyRejectedV2ReturnBitfield13Present()) && (field != userModifyRejectedV2ReturnBitfield14 || userModifyRejectedV2ReturnBitfield14Present()) && (field != waiverType || waiverTypePresent()) && (field != priceFormation || priceFormationPresent()) && (field != clientQualifiedRole || clientQualifiedRolePresent()) && (field != clientId || clientIdPresent()) && (field != investorId || investorIdPresent()) && (field != executorId || executorIdPresent()) && (field != orderOrigination || orderOriginationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent()) && (field != deferralReason || deferralReasonPresent()) && (field != investorQualifiedRole || investorQualifiedRolePresent()) && (field != executorQualifiedRole || executorQualifiedRolePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (userModifyRejectedV2ReturnBitfield1Present() ? UserModifyRejectedV2ReturnBitfield1Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield2Present() ? UserModifyRejectedV2ReturnBitfield2Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield3Present() ? UserModifyRejectedV2ReturnBitfield3Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield4Present() ? UserModifyRejectedV2ReturnBitfield4Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield5Present() ? UserModifyRejectedV2ReturnBitfield5Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield6Present() ? UserModifyRejectedV2ReturnBitfield6Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield7Present() ? UserModifyRejectedV2ReturnBitfield7Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield8Present() ? UserModifyRejectedV2ReturnBitfield8Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield9Present() ? UserModifyRejectedV2ReturnBitfield9Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield10Present() ? UserModifyRejectedV2ReturnBitfield10Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield11Present() ? UserModifyRejectedV2ReturnBitfield11Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield12Present() ? UserModifyRejectedV2ReturnBitfield12Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield13Present() ? UserModifyRejectedV2ReturnBitfield13Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield14Present() ? UserModifyRejectedV2ReturnBitfield14Field.BYTE_LENGTH : 0) + (waiverTypePresent() ? WaiverTypeField.BYTE_LENGTH : 0) + (priceFormationPresent() ? PriceFormationField.BYTE_LENGTH : 0) + (clientQualifiedRolePresent() ? ClientQualifiedRoleField.BYTE_LENGTH : 0) + (clientIdPresent() ? ClientIdField.BYTE_LENGTH : 0) + (investorIdPresent() ? InvestorIdField.BYTE_LENGTH : 0) + (executorIdPresent() ? ExecutorIdField.BYTE_LENGTH : 0) + (orderOriginationPresent() ? OrderOriginationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0) + (deferralReasonPresent() ? DeferralReasonField.BYTE_LENGTH : 0) + (investorQualifiedRolePresent() ? InvestorQualifiedRoleField.BYTE_LENGTH : 0) + (executorQualifiedRolePresent() ? ExecutorQualifiedRoleField.BYTE_LENGTH : 0);
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
        if (userModifyRejectedV2ReturnBitfield1Present()) {
            cursor += 1;
        }
        if (userModifyRejectedV2ReturnBitfield2Present()) {
            cursor += 1;
        }
        if (userModifyRejectedV2ReturnBitfield3Present()) {
            cursor += 1;
        }
        if (userModifyRejectedV2ReturnBitfield4Present()) {
            cursor += 1;
        }
        if (userModifyRejectedV2ReturnBitfield5Present()) {
            cursor += 1;
        }
        if (userModifyRejectedV2ReturnBitfield6Present()) {
            cursor += 1;
        }
        if (userModifyRejectedV2ReturnBitfield7Present()) {
            cursor += 1;
        }
        if (userModifyRejectedV2ReturnBitfield8Present()) {
            cursor += 1;
        }
        if (userModifyRejectedV2ReturnBitfield9Present()) {
            cursor += 1;
        }
        if (userModifyRejectedV2ReturnBitfield10Present()) {
            cursor += 1;
        }
        if (userModifyRejectedV2ReturnBitfield11Present()) {
            cursor += 1;
        }
        if (userModifyRejectedV2ReturnBitfield12Present()) {
            cursor += 1;
        }
        if (userModifyRejectedV2ReturnBitfield13Present()) {
            cursor += 1;
        }
        if (userModifyRejectedV2ReturnBitfield14Present()) {
            cursor += 1;
        }
        if (waiverTypePresent()) {
            cursor += 1;
        }
        if (priceFormationPresent()) {
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
        if (deferralReasonPresent()) {
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
        if (!modifyRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += ModifyRejectReasonField.BYTE_LENGTH;
        if (!text.parse(data, cursor)) {
            return false;
        }
        cursor += TextField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (userModifyRejectedV2ReturnBitfield1Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield1Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedV2ReturnBitfield2Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield2Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedV2ReturnBitfield3Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield3Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedV2ReturnBitfield4Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield4Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedV2ReturnBitfield5Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield5Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedV2ReturnBitfield6Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield6Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedV2ReturnBitfield7Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield7Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedV2ReturnBitfield8Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield8Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedV2ReturnBitfield9Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield9Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedV2ReturnBitfield10Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield10Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedV2ReturnBitfield11Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield11Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedV2ReturnBitfield12Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield12Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedV2ReturnBitfield13Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield13Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedV2ReturnBitfield14Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield14Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield14Field.BYTE_LENGTH;
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
        if (priceFormationPresent()) {
            if (end - cursor < PriceFormationField.BYTE_LENGTH || !priceFormation.parse(data, cursor)) {
                return false;
            }
            cursor += PriceFormationField.BYTE_LENGTH;
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
        if (deferralReasonPresent()) {
            if (end - cursor < DeferralReasonField.BYTE_LENGTH || !deferralReason.parse(data, cursor)) {
                return false;
            }
            cursor += DeferralReasonField.BYTE_LENGTH;
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
        if (userModifyRejectedV2ReturnBitfield1Present() != userModifyRejectedV2ReturnBitfield1.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield1.hasValue() ? "userModifyRejectedV2ReturnBitfield1 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedV2ReturnBitfield2Present() != userModifyRejectedV2ReturnBitfield2.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield2.hasValue() ? "userModifyRejectedV2ReturnBitfield2 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedV2ReturnBitfield3Present() != userModifyRejectedV2ReturnBitfield3.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield3.hasValue() ? "userModifyRejectedV2ReturnBitfield3 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedV2ReturnBitfield4Present() != userModifyRejectedV2ReturnBitfield4.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield4.hasValue() ? "userModifyRejectedV2ReturnBitfield4 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedV2ReturnBitfield5Present() != userModifyRejectedV2ReturnBitfield5.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield5.hasValue() ? "userModifyRejectedV2ReturnBitfield5 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedV2ReturnBitfield6Present() != userModifyRejectedV2ReturnBitfield6.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield6.hasValue() ? "userModifyRejectedV2ReturnBitfield6 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedV2ReturnBitfield7Present() != userModifyRejectedV2ReturnBitfield7.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield7.hasValue() ? "userModifyRejectedV2ReturnBitfield7 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedV2ReturnBitfield8Present() != userModifyRejectedV2ReturnBitfield8.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield8.hasValue() ? "userModifyRejectedV2ReturnBitfield8 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedV2ReturnBitfield9Present() != userModifyRejectedV2ReturnBitfield9.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield9.hasValue() ? "userModifyRejectedV2ReturnBitfield9 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedV2ReturnBitfield10Present() != userModifyRejectedV2ReturnBitfield10.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield10.hasValue() ? "userModifyRejectedV2ReturnBitfield10 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedV2ReturnBitfield11Present() != userModifyRejectedV2ReturnBitfield11.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield11.hasValue() ? "userModifyRejectedV2ReturnBitfield11 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedV2ReturnBitfield12Present() != userModifyRejectedV2ReturnBitfield12.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield12.hasValue() ? "userModifyRejectedV2ReturnBitfield12 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedV2ReturnBitfield13Present() != userModifyRejectedV2ReturnBitfield13.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield13.hasValue() ? "userModifyRejectedV2ReturnBitfield13 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedV2ReturnBitfield14Present() != userModifyRejectedV2ReturnBitfield14.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield14.hasValue() ? "userModifyRejectedV2ReturnBitfield14 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (waiverTypePresent() != waiverType.hasValue()) {
            throw new IllegalStateException(waiverType.hasValue() ? "waiverType holds a value the fields before it leave off the wire" : "waiverType holds no value, though the fields before it put it on the wire");
        }
        if (priceFormationPresent() != priceFormation.hasValue()) {
            throw new IllegalStateException(priceFormation.hasValue() ? "priceFormation holds a value the fields before it leave off the wire" : "priceFormation holds no value, though the fields before it put it on the wire");
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
        if (deferralReasonPresent() != deferralReason.hasValue()) {
            throw new IllegalStateException(deferralReason.hasValue() ? "deferralReason holds a value the fields before it leave off the wire" : "deferralReason holds no value, though the fields before it put it on the wire");
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
        cursor = modifyRejectReason.encode(data, cursor);
        cursor = text.encode(data, cursor);
        if (buffer != null && buffer.length >= 90) {
            System.arraycopy(buffer, 89, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (userModifyRejectedV2ReturnBitfield1Present()) {
            cursor = userModifyRejectedV2ReturnBitfield1.encode(data, cursor);
        }
        if (userModifyRejectedV2ReturnBitfield2Present()) {
            cursor = userModifyRejectedV2ReturnBitfield2.encode(data, cursor);
        }
        if (userModifyRejectedV2ReturnBitfield3Present()) {
            cursor = userModifyRejectedV2ReturnBitfield3.encode(data, cursor);
        }
        if (userModifyRejectedV2ReturnBitfield4Present()) {
            cursor = userModifyRejectedV2ReturnBitfield4.encode(data, cursor);
        }
        if (userModifyRejectedV2ReturnBitfield5Present()) {
            cursor = userModifyRejectedV2ReturnBitfield5.encode(data, cursor);
        }
        if (userModifyRejectedV2ReturnBitfield6Present()) {
            cursor = userModifyRejectedV2ReturnBitfield6.encode(data, cursor);
        }
        if (userModifyRejectedV2ReturnBitfield7Present()) {
            cursor = userModifyRejectedV2ReturnBitfield7.encode(data, cursor);
        }
        if (userModifyRejectedV2ReturnBitfield8Present()) {
            cursor = userModifyRejectedV2ReturnBitfield8.encode(data, cursor);
        }
        if (userModifyRejectedV2ReturnBitfield9Present()) {
            cursor = userModifyRejectedV2ReturnBitfield9.encode(data, cursor);
        }
        if (userModifyRejectedV2ReturnBitfield10Present()) {
            cursor = userModifyRejectedV2ReturnBitfield10.encode(data, cursor);
        }
        if (userModifyRejectedV2ReturnBitfield11Present()) {
            cursor = userModifyRejectedV2ReturnBitfield11.encode(data, cursor);
        }
        if (userModifyRejectedV2ReturnBitfield12Present()) {
            cursor = userModifyRejectedV2ReturnBitfield12.encode(data, cursor);
        }
        if (userModifyRejectedV2ReturnBitfield13Present()) {
            cursor = userModifyRejectedV2ReturnBitfield13.encode(data, cursor);
        }
        if (userModifyRejectedV2ReturnBitfield14Present()) {
            cursor = userModifyRejectedV2ReturnBitfield14.encode(data, cursor);
        }
        if (waiverTypePresent()) {
            cursor = waiverType.encode(data, cursor);
        }
        if (priceFormationPresent()) {
            cursor = priceFormation.encode(data, cursor);
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
        if (deferralReasonPresent()) {
            cursor = deferralReason.encode(data, cursor);
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
            case "ModifyRejectReason" -> Optional.of(modifyRejectReason);
            case "Text" -> Optional.of(text);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "UserModifyRejectedV2ReturnBitfield1" -> Optional.of(userModifyRejectedV2ReturnBitfield1);
            case "UserModifyRejectedV2ReturnBitfield2" -> Optional.of(userModifyRejectedV2ReturnBitfield2);
            case "UserModifyRejectedV2ReturnBitfield3" -> Optional.of(userModifyRejectedV2ReturnBitfield3);
            case "UserModifyRejectedV2ReturnBitfield4" -> Optional.of(userModifyRejectedV2ReturnBitfield4);
            case "UserModifyRejectedV2ReturnBitfield5" -> Optional.of(userModifyRejectedV2ReturnBitfield5);
            case "UserModifyRejectedV2ReturnBitfield6" -> Optional.of(userModifyRejectedV2ReturnBitfield6);
            case "UserModifyRejectedV2ReturnBitfield7" -> Optional.of(userModifyRejectedV2ReturnBitfield7);
            case "UserModifyRejectedV2ReturnBitfield8" -> Optional.of(userModifyRejectedV2ReturnBitfield8);
            case "UserModifyRejectedV2ReturnBitfield9" -> Optional.of(userModifyRejectedV2ReturnBitfield9);
            case "UserModifyRejectedV2ReturnBitfield10" -> Optional.of(userModifyRejectedV2ReturnBitfield10);
            case "UserModifyRejectedV2ReturnBitfield11" -> Optional.of(userModifyRejectedV2ReturnBitfield11);
            case "UserModifyRejectedV2ReturnBitfield12" -> Optional.of(userModifyRejectedV2ReturnBitfield12);
            case "UserModifyRejectedV2ReturnBitfield13" -> Optional.of(userModifyRejectedV2ReturnBitfield13);
            case "UserModifyRejectedV2ReturnBitfield14" -> Optional.of(userModifyRejectedV2ReturnBitfield14);
            case "WaiverType" -> Optional.of(waiverType);
            case "PriceFormation" -> Optional.of(priceFormation);
            case "ClientQualifiedRole" -> Optional.of(clientQualifiedRole);
            case "ClientId" -> Optional.of(clientId);
            case "InvestorId" -> Optional.of(investorId);
            case "ExecutorId" -> Optional.of(executorId);
            case "OrderOrigination" -> Optional.of(orderOrigination);
            case "AlgorithmicIndicator" -> Optional.of(algorithmicIndicator);
            case "DeferralReason" -> Optional.of(deferralReason);
            case "InvestorQualifiedRole" -> Optional.of(investorQualifiedRole);
            case "ExecutorQualifiedRole" -> Optional.of(executorQualifiedRole);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof UserModifyRejectedV2Message message)) {
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
        if (!(other instanceof UserModifyRejectedV2Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
