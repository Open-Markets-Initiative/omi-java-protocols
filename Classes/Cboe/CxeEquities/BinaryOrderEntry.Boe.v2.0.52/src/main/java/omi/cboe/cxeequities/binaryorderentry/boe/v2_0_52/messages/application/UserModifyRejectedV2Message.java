package omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.ClOrdIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.ModifyRejectReasonField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.TextField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.TransactionTimeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield10Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield11Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield12Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield13Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield14Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield15Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield16Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield17Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield18Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield1Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield2Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield3Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield4Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield5Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield6Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield7Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield8Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.fields.UserModifyRejectedV2ReturnBitfield9Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.types.Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.types.Message;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_52.types.PrintOptions;

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
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values day-unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Reason for a modify rejection. See Reason Codes (§ 8, p. 110) for a list of possible reasons.
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
     * BitSet UserModifyRejectedV2 byte 15.
     */
    private final UserModifyRejectedV2ReturnBitfield15Field userModifyRejectedV2ReturnBitfield15 = new UserModifyRejectedV2ReturnBitfield15Field();

    /**
     * BitSet UserModifyRejectedV2 byte 16.
     */
    private final UserModifyRejectedV2ReturnBitfield16Field userModifyRejectedV2ReturnBitfield16 = new UserModifyRejectedV2ReturnBitfield16Field();

    /**
     * BitSet UserModifyRejectedV2 byte 17.
     */
    private final UserModifyRejectedV2ReturnBitfield17Field userModifyRejectedV2ReturnBitfield17 = new UserModifyRejectedV2ReturnBitfield17Field();

    /**
     * BitSet UserModifyRejectedV2 byte 18.
     */
    private final UserModifyRejectedV2ReturnBitfield18Field userModifyRejectedV2ReturnBitfield18 = new UserModifyRejectedV2ReturnBitfield18Field();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, modifyRejectReason, text, numberOfReturnBitfields, userModifyRejectedV2ReturnBitfield1, userModifyRejectedV2ReturnBitfield2, userModifyRejectedV2ReturnBitfield3, userModifyRejectedV2ReturnBitfield4, userModifyRejectedV2ReturnBitfield5, userModifyRejectedV2ReturnBitfield6, userModifyRejectedV2ReturnBitfield7, userModifyRejectedV2ReturnBitfield8, userModifyRejectedV2ReturnBitfield9, userModifyRejectedV2ReturnBitfield10, userModifyRejectedV2ReturnBitfield11, userModifyRejectedV2ReturnBitfield12, userModifyRejectedV2ReturnBitfield13, userModifyRejectedV2ReturnBitfield14, userModifyRejectedV2ReturnBitfield15, userModifyRejectedV2ReturnBitfield16, userModifyRejectedV2ReturnBitfield17, userModifyRejectedV2ReturnBitfield18);

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
     * Reason for a modify rejection. See Reason Codes (§ 8, p. 110) for a list of possible reasons.
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
     * BitSet UserModifyRejectedV2 byte 15.
     *
     * @return the UserModifyRejectedV2ReturnBitfield15 field
     */
    public UserModifyRejectedV2ReturnBitfield15Field userModifyRejectedV2ReturnBitfield15() {
        return userModifyRejectedV2ReturnBitfield15;
    }

    /**
     * BitSet UserModifyRejectedV2 byte 16.
     *
     * @return the UserModifyRejectedV2ReturnBitfield16 field
     */
    public UserModifyRejectedV2ReturnBitfield16Field userModifyRejectedV2ReturnBitfield16() {
        return userModifyRejectedV2ReturnBitfield16;
    }

    /**
     * BitSet UserModifyRejectedV2 byte 17.
     *
     * @return the UserModifyRejectedV2ReturnBitfield17 field
     */
    public UserModifyRejectedV2ReturnBitfield17Field userModifyRejectedV2ReturnBitfield17() {
        return userModifyRejectedV2ReturnBitfield17;
    }

    /**
     * BitSet UserModifyRejectedV2 byte 18.
     *
     * @return the UserModifyRejectedV2ReturnBitfield18 field
     */
    public UserModifyRejectedV2ReturnBitfield18Field userModifyRejectedV2ReturnBitfield18() {
        return userModifyRejectedV2ReturnBitfield18;
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
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield15 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield16 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield17 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedV2ReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedV2ReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedV2ReturnBitfield18 is on the wire
     */
    public boolean userModifyRejectedV2ReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    private boolean onWire(Field field) {
        return (field != userModifyRejectedV2ReturnBitfield1 || userModifyRejectedV2ReturnBitfield1Present()) && (field != userModifyRejectedV2ReturnBitfield2 || userModifyRejectedV2ReturnBitfield2Present()) && (field != userModifyRejectedV2ReturnBitfield3 || userModifyRejectedV2ReturnBitfield3Present()) && (field != userModifyRejectedV2ReturnBitfield4 || userModifyRejectedV2ReturnBitfield4Present()) && (field != userModifyRejectedV2ReturnBitfield5 || userModifyRejectedV2ReturnBitfield5Present()) && (field != userModifyRejectedV2ReturnBitfield6 || userModifyRejectedV2ReturnBitfield6Present()) && (field != userModifyRejectedV2ReturnBitfield7 || userModifyRejectedV2ReturnBitfield7Present()) && (field != userModifyRejectedV2ReturnBitfield8 || userModifyRejectedV2ReturnBitfield8Present()) && (field != userModifyRejectedV2ReturnBitfield9 || userModifyRejectedV2ReturnBitfield9Present()) && (field != userModifyRejectedV2ReturnBitfield10 || userModifyRejectedV2ReturnBitfield10Present()) && (field != userModifyRejectedV2ReturnBitfield11 || userModifyRejectedV2ReturnBitfield11Present()) && (field != userModifyRejectedV2ReturnBitfield12 || userModifyRejectedV2ReturnBitfield12Present()) && (field != userModifyRejectedV2ReturnBitfield13 || userModifyRejectedV2ReturnBitfield13Present()) && (field != userModifyRejectedV2ReturnBitfield14 || userModifyRejectedV2ReturnBitfield14Present()) && (field != userModifyRejectedV2ReturnBitfield15 || userModifyRejectedV2ReturnBitfield15Present()) && (field != userModifyRejectedV2ReturnBitfield16 || userModifyRejectedV2ReturnBitfield16Present()) && (field != userModifyRejectedV2ReturnBitfield17 || userModifyRejectedV2ReturnBitfield17Present()) && (field != userModifyRejectedV2ReturnBitfield18 || userModifyRejectedV2ReturnBitfield18Present());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (userModifyRejectedV2ReturnBitfield1Present() ? UserModifyRejectedV2ReturnBitfield1Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield2Present() ? UserModifyRejectedV2ReturnBitfield2Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield3Present() ? UserModifyRejectedV2ReturnBitfield3Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield4Present() ? UserModifyRejectedV2ReturnBitfield4Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield5Present() ? UserModifyRejectedV2ReturnBitfield5Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield6Present() ? UserModifyRejectedV2ReturnBitfield6Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield7Present() ? UserModifyRejectedV2ReturnBitfield7Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield8Present() ? UserModifyRejectedV2ReturnBitfield8Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield9Present() ? UserModifyRejectedV2ReturnBitfield9Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield10Present() ? UserModifyRejectedV2ReturnBitfield10Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield11Present() ? UserModifyRejectedV2ReturnBitfield11Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield12Present() ? UserModifyRejectedV2ReturnBitfield12Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield13Present() ? UserModifyRejectedV2ReturnBitfield13Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield14Present() ? UserModifyRejectedV2ReturnBitfield14Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield15Present() ? UserModifyRejectedV2ReturnBitfield15Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield16Present() ? UserModifyRejectedV2ReturnBitfield16Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield17Present() ? UserModifyRejectedV2ReturnBitfield17Field.BYTE_LENGTH : 0) + (userModifyRejectedV2ReturnBitfield18Present() ? UserModifyRejectedV2ReturnBitfield18Field.BYTE_LENGTH : 0);
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
        if (userModifyRejectedV2ReturnBitfield15Present()) {
            cursor += 1;
        }
        if (userModifyRejectedV2ReturnBitfield16Present()) {
            cursor += 1;
        }
        if (userModifyRejectedV2ReturnBitfield17Present()) {
            cursor += 1;
        }
        if (userModifyRejectedV2ReturnBitfield18Present()) {
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
        if (userModifyRejectedV2ReturnBitfield15Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield15Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedV2ReturnBitfield16Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield16Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedV2ReturnBitfield17Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield17Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedV2ReturnBitfield18Present()) {
            if (end - cursor < UserModifyRejectedV2ReturnBitfield18Field.BYTE_LENGTH || !userModifyRejectedV2ReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedV2ReturnBitfield18Field.BYTE_LENGTH;
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
        if (userModifyRejectedV2ReturnBitfield15Present() != userModifyRejectedV2ReturnBitfield15.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield15.hasValue() ? "userModifyRejectedV2ReturnBitfield15 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedV2ReturnBitfield16Present() != userModifyRejectedV2ReturnBitfield16.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield16.hasValue() ? "userModifyRejectedV2ReturnBitfield16 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedV2ReturnBitfield17Present() != userModifyRejectedV2ReturnBitfield17.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield17.hasValue() ? "userModifyRejectedV2ReturnBitfield17 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedV2ReturnBitfield18Present() != userModifyRejectedV2ReturnBitfield18.hasValue()) {
            throw new IllegalStateException(userModifyRejectedV2ReturnBitfield18.hasValue() ? "userModifyRejectedV2ReturnBitfield18 holds a value the fields before it leave off the wire" : "userModifyRejectedV2ReturnBitfield18 holds no value, though the fields before it put it on the wire");
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
        if (userModifyRejectedV2ReturnBitfield15Present()) {
            cursor = userModifyRejectedV2ReturnBitfield15.encode(data, cursor);
        }
        if (userModifyRejectedV2ReturnBitfield16Present()) {
            cursor = userModifyRejectedV2ReturnBitfield16.encode(data, cursor);
        }
        if (userModifyRejectedV2ReturnBitfield17Present()) {
            cursor = userModifyRejectedV2ReturnBitfield17.encode(data, cursor);
        }
        if (userModifyRejectedV2ReturnBitfield18Present()) {
            cursor = userModifyRejectedV2ReturnBitfield18.encode(data, cursor);
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
            case "UserModifyRejectedV2ReturnBitfield15" -> Optional.of(userModifyRejectedV2ReturnBitfield15);
            case "UserModifyRejectedV2ReturnBitfield16" -> Optional.of(userModifyRejectedV2ReturnBitfield16);
            case "UserModifyRejectedV2ReturnBitfield17" -> Optional.of(userModifyRejectedV2ReturnBitfield17);
            case "UserModifyRejectedV2ReturnBitfield18" -> Optional.of(userModifyRejectedV2ReturnBitfield18);
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
