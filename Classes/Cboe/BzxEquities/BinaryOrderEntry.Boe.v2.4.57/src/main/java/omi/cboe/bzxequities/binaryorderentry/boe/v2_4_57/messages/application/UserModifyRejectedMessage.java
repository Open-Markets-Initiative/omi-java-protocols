package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ClOrdIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ModifyRejectReasonField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.NumberOfReturnBitfieldsField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TextField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TransactionTimeField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield10Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield11Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield12Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield13Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield14Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield15Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield16Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield17Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield18Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield19Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield1Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield20Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield21Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield22Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield2Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield3Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield4Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield5Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield6Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield7Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield8Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.UserModifyRejectedReturnBitfield9Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Message;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.PrintOptions;

/**
 * Represents the UserModifyRejectedMessage message from the BinaryOrderEntry protocol.
 *
 * <p>User Modify Rejected Message.</p>
 */
public final class UserModifyRejectedMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 91;

    /**
     * This message's declared name.
     */
    public static final String NAME = "User Modify Rejected Message";

    /**
     * The time the event occurred in the Cboe Matching Engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Reason for a modify rejection. See Reason Codes for a list of possible reasons.
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
     * BitSet UserModifyRejected byte 1.
     */
    private final UserModifyRejectedReturnBitfield1Field userModifyRejectedReturnBitfield1 = new UserModifyRejectedReturnBitfield1Field();

    /**
     * BitSet UserModifyRejected byte 2.
     */
    private final UserModifyRejectedReturnBitfield2Field userModifyRejectedReturnBitfield2 = new UserModifyRejectedReturnBitfield2Field();

    /**
     * BitSet UserModifyRejected byte 3.
     */
    private final UserModifyRejectedReturnBitfield3Field userModifyRejectedReturnBitfield3 = new UserModifyRejectedReturnBitfield3Field();

    /**
     * BitSet UserModifyRejected byte 4.
     */
    private final UserModifyRejectedReturnBitfield4Field userModifyRejectedReturnBitfield4 = new UserModifyRejectedReturnBitfield4Field();

    /**
     * BitSet UserModifyRejected byte 5.
     */
    private final UserModifyRejectedReturnBitfield5Field userModifyRejectedReturnBitfield5 = new UserModifyRejectedReturnBitfield5Field();

    /**
     * BitSet UserModifyRejected byte 6.
     */
    private final UserModifyRejectedReturnBitfield6Field userModifyRejectedReturnBitfield6 = new UserModifyRejectedReturnBitfield6Field();

    /**
     * BitSet UserModifyRejected byte 7.
     */
    private final UserModifyRejectedReturnBitfield7Field userModifyRejectedReturnBitfield7 = new UserModifyRejectedReturnBitfield7Field();

    /**
     * BitSet UserModifyRejected byte 8.
     */
    private final UserModifyRejectedReturnBitfield8Field userModifyRejectedReturnBitfield8 = new UserModifyRejectedReturnBitfield8Field();

    /**
     * BitSet UserModifyRejected byte 9.
     */
    private final UserModifyRejectedReturnBitfield9Field userModifyRejectedReturnBitfield9 = new UserModifyRejectedReturnBitfield9Field();

    /**
     * BitSet UserModifyRejected byte 10.
     */
    private final UserModifyRejectedReturnBitfield10Field userModifyRejectedReturnBitfield10 = new UserModifyRejectedReturnBitfield10Field();

    /**
     * BitSet UserModifyRejected byte 11.
     */
    private final UserModifyRejectedReturnBitfield11Field userModifyRejectedReturnBitfield11 = new UserModifyRejectedReturnBitfield11Field();

    /**
     * BitSet UserModifyRejected byte 12.
     */
    private final UserModifyRejectedReturnBitfield12Field userModifyRejectedReturnBitfield12 = new UserModifyRejectedReturnBitfield12Field();

    /**
     * BitSet UserModifyRejected byte 13.
     */
    private final UserModifyRejectedReturnBitfield13Field userModifyRejectedReturnBitfield13 = new UserModifyRejectedReturnBitfield13Field();

    /**
     * BitSet UserModifyRejected byte 14.
     */
    private final UserModifyRejectedReturnBitfield14Field userModifyRejectedReturnBitfield14 = new UserModifyRejectedReturnBitfield14Field();

    /**
     * BitSet UserModifyRejected byte 15.
     */
    private final UserModifyRejectedReturnBitfield15Field userModifyRejectedReturnBitfield15 = new UserModifyRejectedReturnBitfield15Field();

    /**
     * BitSet UserModifyRejected byte 16.
     */
    private final UserModifyRejectedReturnBitfield16Field userModifyRejectedReturnBitfield16 = new UserModifyRejectedReturnBitfield16Field();

    /**
     * BitSet UserModifyRejected byte 17.
     */
    private final UserModifyRejectedReturnBitfield17Field userModifyRejectedReturnBitfield17 = new UserModifyRejectedReturnBitfield17Field();

    /**
     * BitSet UserModifyRejected byte 18.
     */
    private final UserModifyRejectedReturnBitfield18Field userModifyRejectedReturnBitfield18 = new UserModifyRejectedReturnBitfield18Field();

    /**
     * BitSet UserModifyRejected byte 19.
     */
    private final UserModifyRejectedReturnBitfield19Field userModifyRejectedReturnBitfield19 = new UserModifyRejectedReturnBitfield19Field();

    /**
     * BitSet UserModifyRejected byte 20.
     */
    private final UserModifyRejectedReturnBitfield20Field userModifyRejectedReturnBitfield20 = new UserModifyRejectedReturnBitfield20Field();

    /**
     * BitSet UserModifyRejected byte 21.
     */
    private final UserModifyRejectedReturnBitfield21Field userModifyRejectedReturnBitfield21 = new UserModifyRejectedReturnBitfield21Field();

    /**
     * BitSet UserModifyRejected byte 22.
     */
    private final UserModifyRejectedReturnBitfield22Field userModifyRejectedReturnBitfield22 = new UserModifyRejectedReturnBitfield22Field();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, modifyRejectReason, text, numberOfReturnBitfields, userModifyRejectedReturnBitfield1, userModifyRejectedReturnBitfield2, userModifyRejectedReturnBitfield3, userModifyRejectedReturnBitfield4, userModifyRejectedReturnBitfield5, userModifyRejectedReturnBitfield6, userModifyRejectedReturnBitfield7, userModifyRejectedReturnBitfield8, userModifyRejectedReturnBitfield9, userModifyRejectedReturnBitfield10, userModifyRejectedReturnBitfield11, userModifyRejectedReturnBitfield12, userModifyRejectedReturnBitfield13, userModifyRejectedReturnBitfield14, userModifyRejectedReturnBitfield15, userModifyRejectedReturnBitfield16, userModifyRejectedReturnBitfield17, userModifyRejectedReturnBitfield18, userModifyRejectedReturnBitfield19, userModifyRejectedReturnBitfield20, userModifyRejectedReturnBitfield21, userModifyRejectedReturnBitfield22);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the Cboe Matching Engine (not the time the message was sent).
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Reason for a modify rejection. See Reason Codes for a list of possible reasons.
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
     * BitSet UserModifyRejected byte 1.
     *
     * @return the UserModifyRejectedReturnBitfield1 field
     */
    public UserModifyRejectedReturnBitfield1Field userModifyRejectedReturnBitfield1() {
        return userModifyRejectedReturnBitfield1;
    }

    /**
     * BitSet UserModifyRejected byte 2.
     *
     * @return the UserModifyRejectedReturnBitfield2 field
     */
    public UserModifyRejectedReturnBitfield2Field userModifyRejectedReturnBitfield2() {
        return userModifyRejectedReturnBitfield2;
    }

    /**
     * BitSet UserModifyRejected byte 3.
     *
     * @return the UserModifyRejectedReturnBitfield3 field
     */
    public UserModifyRejectedReturnBitfield3Field userModifyRejectedReturnBitfield3() {
        return userModifyRejectedReturnBitfield3;
    }

    /**
     * BitSet UserModifyRejected byte 4.
     *
     * @return the UserModifyRejectedReturnBitfield4 field
     */
    public UserModifyRejectedReturnBitfield4Field userModifyRejectedReturnBitfield4() {
        return userModifyRejectedReturnBitfield4;
    }

    /**
     * BitSet UserModifyRejected byte 5.
     *
     * @return the UserModifyRejectedReturnBitfield5 field
     */
    public UserModifyRejectedReturnBitfield5Field userModifyRejectedReturnBitfield5() {
        return userModifyRejectedReturnBitfield5;
    }

    /**
     * BitSet UserModifyRejected byte 6.
     *
     * @return the UserModifyRejectedReturnBitfield6 field
     */
    public UserModifyRejectedReturnBitfield6Field userModifyRejectedReturnBitfield6() {
        return userModifyRejectedReturnBitfield6;
    }

    /**
     * BitSet UserModifyRejected byte 7.
     *
     * @return the UserModifyRejectedReturnBitfield7 field
     */
    public UserModifyRejectedReturnBitfield7Field userModifyRejectedReturnBitfield7() {
        return userModifyRejectedReturnBitfield7;
    }

    /**
     * BitSet UserModifyRejected byte 8.
     *
     * @return the UserModifyRejectedReturnBitfield8 field
     */
    public UserModifyRejectedReturnBitfield8Field userModifyRejectedReturnBitfield8() {
        return userModifyRejectedReturnBitfield8;
    }

    /**
     * BitSet UserModifyRejected byte 9.
     *
     * @return the UserModifyRejectedReturnBitfield9 field
     */
    public UserModifyRejectedReturnBitfield9Field userModifyRejectedReturnBitfield9() {
        return userModifyRejectedReturnBitfield9;
    }

    /**
     * BitSet UserModifyRejected byte 10.
     *
     * @return the UserModifyRejectedReturnBitfield10 field
     */
    public UserModifyRejectedReturnBitfield10Field userModifyRejectedReturnBitfield10() {
        return userModifyRejectedReturnBitfield10;
    }

    /**
     * BitSet UserModifyRejected byte 11.
     *
     * @return the UserModifyRejectedReturnBitfield11 field
     */
    public UserModifyRejectedReturnBitfield11Field userModifyRejectedReturnBitfield11() {
        return userModifyRejectedReturnBitfield11;
    }

    /**
     * BitSet UserModifyRejected byte 12.
     *
     * @return the UserModifyRejectedReturnBitfield12 field
     */
    public UserModifyRejectedReturnBitfield12Field userModifyRejectedReturnBitfield12() {
        return userModifyRejectedReturnBitfield12;
    }

    /**
     * BitSet UserModifyRejected byte 13.
     *
     * @return the UserModifyRejectedReturnBitfield13 field
     */
    public UserModifyRejectedReturnBitfield13Field userModifyRejectedReturnBitfield13() {
        return userModifyRejectedReturnBitfield13;
    }

    /**
     * BitSet UserModifyRejected byte 14.
     *
     * @return the UserModifyRejectedReturnBitfield14 field
     */
    public UserModifyRejectedReturnBitfield14Field userModifyRejectedReturnBitfield14() {
        return userModifyRejectedReturnBitfield14;
    }

    /**
     * BitSet UserModifyRejected byte 15.
     *
     * @return the UserModifyRejectedReturnBitfield15 field
     */
    public UserModifyRejectedReturnBitfield15Field userModifyRejectedReturnBitfield15() {
        return userModifyRejectedReturnBitfield15;
    }

    /**
     * BitSet UserModifyRejected byte 16.
     *
     * @return the UserModifyRejectedReturnBitfield16 field
     */
    public UserModifyRejectedReturnBitfield16Field userModifyRejectedReturnBitfield16() {
        return userModifyRejectedReturnBitfield16;
    }

    /**
     * BitSet UserModifyRejected byte 17.
     *
     * @return the UserModifyRejectedReturnBitfield17 field
     */
    public UserModifyRejectedReturnBitfield17Field userModifyRejectedReturnBitfield17() {
        return userModifyRejectedReturnBitfield17;
    }

    /**
     * BitSet UserModifyRejected byte 18.
     *
     * @return the UserModifyRejectedReturnBitfield18 field
     */
    public UserModifyRejectedReturnBitfield18Field userModifyRejectedReturnBitfield18() {
        return userModifyRejectedReturnBitfield18;
    }

    /**
     * BitSet UserModifyRejected byte 19.
     *
     * @return the UserModifyRejectedReturnBitfield19 field
     */
    public UserModifyRejectedReturnBitfield19Field userModifyRejectedReturnBitfield19() {
        return userModifyRejectedReturnBitfield19;
    }

    /**
     * BitSet UserModifyRejected byte 20.
     *
     * @return the UserModifyRejectedReturnBitfield20 field
     */
    public UserModifyRejectedReturnBitfield20Field userModifyRejectedReturnBitfield20() {
        return userModifyRejectedReturnBitfield20;
    }

    /**
     * BitSet UserModifyRejected byte 21.
     *
     * @return the UserModifyRejectedReturnBitfield21 field
     */
    public UserModifyRejectedReturnBitfield21Field userModifyRejectedReturnBitfield21() {
        return userModifyRejectedReturnBitfield21;
    }

    /**
     * BitSet UserModifyRejected byte 22.
     *
     * @return the UserModifyRejectedReturnBitfield22 field
     */
    public UserModifyRejectedReturnBitfield22Field userModifyRejectedReturnBitfield22() {
        return userModifyRejectedReturnBitfield22;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield1 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield2 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield3 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield4 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield5 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield6 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield7 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield8 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield9 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield10 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield11 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield12 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield13 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield14 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield15 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield16 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield17 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield18 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield19 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield20 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield20 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield20 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield20Present() {
        return numberOfReturnBitfields.value() >= 20L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield21 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield21 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield21 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield21Present() {
        return numberOfReturnBitfields.value() >= 21L;
    }

    /**
     * Returns whether the fields before the UserModifyRejectedReturnBitfield22 put it on the wire.
     *
     * <p>Decode reads the UserModifyRejectedReturnBitfield22 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the UserModifyRejectedReturnBitfield22 is on the wire
     */
    public boolean userModifyRejectedReturnBitfield22Present() {
        return numberOfReturnBitfields.value() >= 22L;
    }

    private boolean onWire(Field field) {
        return (field != userModifyRejectedReturnBitfield1 || userModifyRejectedReturnBitfield1Present()) && (field != userModifyRejectedReturnBitfield2 || userModifyRejectedReturnBitfield2Present()) && (field != userModifyRejectedReturnBitfield3 || userModifyRejectedReturnBitfield3Present()) && (field != userModifyRejectedReturnBitfield4 || userModifyRejectedReturnBitfield4Present()) && (field != userModifyRejectedReturnBitfield5 || userModifyRejectedReturnBitfield5Present()) && (field != userModifyRejectedReturnBitfield6 || userModifyRejectedReturnBitfield6Present()) && (field != userModifyRejectedReturnBitfield7 || userModifyRejectedReturnBitfield7Present()) && (field != userModifyRejectedReturnBitfield8 || userModifyRejectedReturnBitfield8Present()) && (field != userModifyRejectedReturnBitfield9 || userModifyRejectedReturnBitfield9Present()) && (field != userModifyRejectedReturnBitfield10 || userModifyRejectedReturnBitfield10Present()) && (field != userModifyRejectedReturnBitfield11 || userModifyRejectedReturnBitfield11Present()) && (field != userModifyRejectedReturnBitfield12 || userModifyRejectedReturnBitfield12Present()) && (field != userModifyRejectedReturnBitfield13 || userModifyRejectedReturnBitfield13Present()) && (field != userModifyRejectedReturnBitfield14 || userModifyRejectedReturnBitfield14Present()) && (field != userModifyRejectedReturnBitfield15 || userModifyRejectedReturnBitfield15Present()) && (field != userModifyRejectedReturnBitfield16 || userModifyRejectedReturnBitfield16Present()) && (field != userModifyRejectedReturnBitfield17 || userModifyRejectedReturnBitfield17Present()) && (field != userModifyRejectedReturnBitfield18 || userModifyRejectedReturnBitfield18Present()) && (field != userModifyRejectedReturnBitfield19 || userModifyRejectedReturnBitfield19Present()) && (field != userModifyRejectedReturnBitfield20 || userModifyRejectedReturnBitfield20Present()) && (field != userModifyRejectedReturnBitfield21 || userModifyRejectedReturnBitfield21Present()) && (field != userModifyRejectedReturnBitfield22 || userModifyRejectedReturnBitfield22Present());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (userModifyRejectedReturnBitfield1Present() ? UserModifyRejectedReturnBitfield1Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield2Present() ? UserModifyRejectedReturnBitfield2Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield3Present() ? UserModifyRejectedReturnBitfield3Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield4Present() ? UserModifyRejectedReturnBitfield4Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield5Present() ? UserModifyRejectedReturnBitfield5Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield6Present() ? UserModifyRejectedReturnBitfield6Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield7Present() ? UserModifyRejectedReturnBitfield7Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield8Present() ? UserModifyRejectedReturnBitfield8Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield9Present() ? UserModifyRejectedReturnBitfield9Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield10Present() ? UserModifyRejectedReturnBitfield10Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield11Present() ? UserModifyRejectedReturnBitfield11Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield12Present() ? UserModifyRejectedReturnBitfield12Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield13Present() ? UserModifyRejectedReturnBitfield13Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield14Present() ? UserModifyRejectedReturnBitfield14Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield15Present() ? UserModifyRejectedReturnBitfield15Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield16Present() ? UserModifyRejectedReturnBitfield16Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield17Present() ? UserModifyRejectedReturnBitfield17Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield18Present() ? UserModifyRejectedReturnBitfield18Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield19Present() ? UserModifyRejectedReturnBitfield19Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield20Present() ? UserModifyRejectedReturnBitfield20Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield21Present() ? UserModifyRejectedReturnBitfield21Field.BYTE_LENGTH : 0) + (userModifyRejectedReturnBitfield22Present() ? UserModifyRejectedReturnBitfield22Field.BYTE_LENGTH : 0);
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
        if (userModifyRejectedReturnBitfield1Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield2Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield3Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield4Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield5Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield6Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield7Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield8Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield9Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield10Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield11Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield12Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield13Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield14Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield15Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield16Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield17Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield18Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield19Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield20Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield21Present()) {
            cursor += 1;
        }
        if (userModifyRejectedReturnBitfield22Present()) {
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
        if (userModifyRejectedReturnBitfield1Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield1Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield2Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield2Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield3Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield3Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield4Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield4Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield5Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield5Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield6Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield6Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield7Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield7Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield8Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield8Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield9Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield9Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield10Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield10Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield11Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield11Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield12Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield12Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield13Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield13Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield14Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield14Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield15Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield15Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield16Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield16Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield17Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield17Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield18Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield18Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield19Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield19Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield20Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield20Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield20.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield20Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield21Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield21Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield21.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield21Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (userModifyRejectedReturnBitfield22Present()) {
            if (end - cursor < UserModifyRejectedReturnBitfield22Field.BYTE_LENGTH || !userModifyRejectedReturnBitfield22.parse(data, cursor)) {
                return false;
            }
            cursor += UserModifyRejectedReturnBitfield22Field.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (userModifyRejectedReturnBitfield1Present() != userModifyRejectedReturnBitfield1.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield1.hasValue() ? "userModifyRejectedReturnBitfield1 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield2Present() != userModifyRejectedReturnBitfield2.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield2.hasValue() ? "userModifyRejectedReturnBitfield2 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield3Present() != userModifyRejectedReturnBitfield3.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield3.hasValue() ? "userModifyRejectedReturnBitfield3 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield4Present() != userModifyRejectedReturnBitfield4.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield4.hasValue() ? "userModifyRejectedReturnBitfield4 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield5Present() != userModifyRejectedReturnBitfield5.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield5.hasValue() ? "userModifyRejectedReturnBitfield5 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield6Present() != userModifyRejectedReturnBitfield6.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield6.hasValue() ? "userModifyRejectedReturnBitfield6 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield7Present() != userModifyRejectedReturnBitfield7.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield7.hasValue() ? "userModifyRejectedReturnBitfield7 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield8Present() != userModifyRejectedReturnBitfield8.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield8.hasValue() ? "userModifyRejectedReturnBitfield8 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield9Present() != userModifyRejectedReturnBitfield9.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield9.hasValue() ? "userModifyRejectedReturnBitfield9 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield10Present() != userModifyRejectedReturnBitfield10.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield10.hasValue() ? "userModifyRejectedReturnBitfield10 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield11Present() != userModifyRejectedReturnBitfield11.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield11.hasValue() ? "userModifyRejectedReturnBitfield11 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield12Present() != userModifyRejectedReturnBitfield12.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield12.hasValue() ? "userModifyRejectedReturnBitfield12 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield13Present() != userModifyRejectedReturnBitfield13.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield13.hasValue() ? "userModifyRejectedReturnBitfield13 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield14Present() != userModifyRejectedReturnBitfield14.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield14.hasValue() ? "userModifyRejectedReturnBitfield14 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield15Present() != userModifyRejectedReturnBitfield15.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield15.hasValue() ? "userModifyRejectedReturnBitfield15 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield16Present() != userModifyRejectedReturnBitfield16.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield16.hasValue() ? "userModifyRejectedReturnBitfield16 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield17Present() != userModifyRejectedReturnBitfield17.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield17.hasValue() ? "userModifyRejectedReturnBitfield17 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield18Present() != userModifyRejectedReturnBitfield18.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield18.hasValue() ? "userModifyRejectedReturnBitfield18 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield19Present() != userModifyRejectedReturnBitfield19.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield19.hasValue() ? "userModifyRejectedReturnBitfield19 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield20Present() != userModifyRejectedReturnBitfield20.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield20.hasValue() ? "userModifyRejectedReturnBitfield20 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield20 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield21Present() != userModifyRejectedReturnBitfield21.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield21.hasValue() ? "userModifyRejectedReturnBitfield21 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield21 holds no value, though the fields before it put it on the wire");
        }
        if (userModifyRejectedReturnBitfield22Present() != userModifyRejectedReturnBitfield22.hasValue()) {
            throw new IllegalStateException(userModifyRejectedReturnBitfield22.hasValue() ? "userModifyRejectedReturnBitfield22 holds a value the fields before it leave off the wire" : "userModifyRejectedReturnBitfield22 holds no value, though the fields before it put it on the wire");
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
        if (userModifyRejectedReturnBitfield1Present()) {
            cursor = userModifyRejectedReturnBitfield1.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield2Present()) {
            cursor = userModifyRejectedReturnBitfield2.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield3Present()) {
            cursor = userModifyRejectedReturnBitfield3.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield4Present()) {
            cursor = userModifyRejectedReturnBitfield4.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield5Present()) {
            cursor = userModifyRejectedReturnBitfield5.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield6Present()) {
            cursor = userModifyRejectedReturnBitfield6.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield7Present()) {
            cursor = userModifyRejectedReturnBitfield7.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield8Present()) {
            cursor = userModifyRejectedReturnBitfield8.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield9Present()) {
            cursor = userModifyRejectedReturnBitfield9.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield10Present()) {
            cursor = userModifyRejectedReturnBitfield10.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield11Present()) {
            cursor = userModifyRejectedReturnBitfield11.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield12Present()) {
            cursor = userModifyRejectedReturnBitfield12.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield13Present()) {
            cursor = userModifyRejectedReturnBitfield13.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield14Present()) {
            cursor = userModifyRejectedReturnBitfield14.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield15Present()) {
            cursor = userModifyRejectedReturnBitfield15.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield16Present()) {
            cursor = userModifyRejectedReturnBitfield16.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield17Present()) {
            cursor = userModifyRejectedReturnBitfield17.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield18Present()) {
            cursor = userModifyRejectedReturnBitfield18.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield19Present()) {
            cursor = userModifyRejectedReturnBitfield19.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield20Present()) {
            cursor = userModifyRejectedReturnBitfield20.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield21Present()) {
            cursor = userModifyRejectedReturnBitfield21.encode(data, cursor);
        }
        if (userModifyRejectedReturnBitfield22Present()) {
            cursor = userModifyRejectedReturnBitfield22.encode(data, cursor);
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
            case "UserModifyRejectedReturnBitfield1" -> Optional.of(userModifyRejectedReturnBitfield1);
            case "UserModifyRejectedReturnBitfield2" -> Optional.of(userModifyRejectedReturnBitfield2);
            case "UserModifyRejectedReturnBitfield3" -> Optional.of(userModifyRejectedReturnBitfield3);
            case "UserModifyRejectedReturnBitfield4" -> Optional.of(userModifyRejectedReturnBitfield4);
            case "UserModifyRejectedReturnBitfield5" -> Optional.of(userModifyRejectedReturnBitfield5);
            case "UserModifyRejectedReturnBitfield6" -> Optional.of(userModifyRejectedReturnBitfield6);
            case "UserModifyRejectedReturnBitfield7" -> Optional.of(userModifyRejectedReturnBitfield7);
            case "UserModifyRejectedReturnBitfield8" -> Optional.of(userModifyRejectedReturnBitfield8);
            case "UserModifyRejectedReturnBitfield9" -> Optional.of(userModifyRejectedReturnBitfield9);
            case "UserModifyRejectedReturnBitfield10" -> Optional.of(userModifyRejectedReturnBitfield10);
            case "UserModifyRejectedReturnBitfield11" -> Optional.of(userModifyRejectedReturnBitfield11);
            case "UserModifyRejectedReturnBitfield12" -> Optional.of(userModifyRejectedReturnBitfield12);
            case "UserModifyRejectedReturnBitfield13" -> Optional.of(userModifyRejectedReturnBitfield13);
            case "UserModifyRejectedReturnBitfield14" -> Optional.of(userModifyRejectedReturnBitfield14);
            case "UserModifyRejectedReturnBitfield15" -> Optional.of(userModifyRejectedReturnBitfield15);
            case "UserModifyRejectedReturnBitfield16" -> Optional.of(userModifyRejectedReturnBitfield16);
            case "UserModifyRejectedReturnBitfield17" -> Optional.of(userModifyRejectedReturnBitfield17);
            case "UserModifyRejectedReturnBitfield18" -> Optional.of(userModifyRejectedReturnBitfield18);
            case "UserModifyRejectedReturnBitfield19" -> Optional.of(userModifyRejectedReturnBitfield19);
            case "UserModifyRejectedReturnBitfield20" -> Optional.of(userModifyRejectedReturnBitfield20);
            case "UserModifyRejectedReturnBitfield21" -> Optional.of(userModifyRejectedReturnBitfield21);
            case "UserModifyRejectedReturnBitfield22" -> Optional.of(userModifyRejectedReturnBitfield22);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof UserModifyRejectedMessage message)) {
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
        if (!(other instanceof UserModifyRejectedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
