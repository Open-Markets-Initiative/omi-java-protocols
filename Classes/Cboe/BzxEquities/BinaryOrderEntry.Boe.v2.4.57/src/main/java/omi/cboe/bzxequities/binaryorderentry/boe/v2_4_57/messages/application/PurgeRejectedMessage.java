package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.MassCancelIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.NumberOfReturnBitfieldsField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectReasonField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield10Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield11Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield12Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield13Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield14Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield15Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield16Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield17Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield18Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield19Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield1Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield20Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield2Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield3Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield4Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield5Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield6Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield7Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield8Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.PurgeRejectedReturnBitfield9Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TextField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TransactionTimeField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Message;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.PrintOptions;

/**
 * Represents the PurgeRejectedMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Purge Rejected Message.</p>
 */
public final class PurgeRejectedMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 71;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Purge Rejected Message";

    /**
     * The time the event occurred in the Cboe Matching Engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Reason for a purge rejection. See Reason Codes for a list of possible reasons.
     */
    private final PurgeRejectReasonField purgeRejectReason = new PurgeRejectReasonField();

    /**
     * Human readable text with more information about the reject reason.
     */
    private final TextField text = new TextField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet PurgeRejected byte 1.
     */
    private final PurgeRejectedReturnBitfield1Field purgeRejectedReturnBitfield1 = new PurgeRejectedReturnBitfield1Field();

    /**
     * BitSet PurgeRejected byte 2.
     */
    private final PurgeRejectedReturnBitfield2Field purgeRejectedReturnBitfield2 = new PurgeRejectedReturnBitfield2Field();

    /**
     * BitSet PurgeRejected byte 3.
     */
    private final PurgeRejectedReturnBitfield3Field purgeRejectedReturnBitfield3 = new PurgeRejectedReturnBitfield3Field();

    /**
     * BitSet PurgeRejected byte 4.
     */
    private final PurgeRejectedReturnBitfield4Field purgeRejectedReturnBitfield4 = new PurgeRejectedReturnBitfield4Field();

    /**
     * BitSet PurgeRejected byte 5.
     */
    private final PurgeRejectedReturnBitfield5Field purgeRejectedReturnBitfield5 = new PurgeRejectedReturnBitfield5Field();

    /**
     * BitSet PurgeRejected byte 6.
     */
    private final PurgeRejectedReturnBitfield6Field purgeRejectedReturnBitfield6 = new PurgeRejectedReturnBitfield6Field();

    /**
     * BitSet PurgeRejected byte 7.
     */
    private final PurgeRejectedReturnBitfield7Field purgeRejectedReturnBitfield7 = new PurgeRejectedReturnBitfield7Field();

    /**
     * BitSet PurgeRejected byte 8.
     */
    private final PurgeRejectedReturnBitfield8Field purgeRejectedReturnBitfield8 = new PurgeRejectedReturnBitfield8Field();

    /**
     * BitSet PurgeRejected byte 9.
     */
    private final PurgeRejectedReturnBitfield9Field purgeRejectedReturnBitfield9 = new PurgeRejectedReturnBitfield9Field();

    /**
     * BitSet PurgeRejected byte 10.
     */
    private final PurgeRejectedReturnBitfield10Field purgeRejectedReturnBitfield10 = new PurgeRejectedReturnBitfield10Field();

    /**
     * BitSet PurgeRejected byte 11.
     */
    private final PurgeRejectedReturnBitfield11Field purgeRejectedReturnBitfield11 = new PurgeRejectedReturnBitfield11Field();

    /**
     * BitSet PurgeRejected byte 12.
     */
    private final PurgeRejectedReturnBitfield12Field purgeRejectedReturnBitfield12 = new PurgeRejectedReturnBitfield12Field();

    /**
     * BitSet PurgeRejected byte 13.
     */
    private final PurgeRejectedReturnBitfield13Field purgeRejectedReturnBitfield13 = new PurgeRejectedReturnBitfield13Field();

    /**
     * BitSet PurgeRejected byte 14.
     */
    private final PurgeRejectedReturnBitfield14Field purgeRejectedReturnBitfield14 = new PurgeRejectedReturnBitfield14Field();

    /**
     * BitSet PurgeRejected byte 15.
     */
    private final PurgeRejectedReturnBitfield15Field purgeRejectedReturnBitfield15 = new PurgeRejectedReturnBitfield15Field();

    /**
     * BitSet PurgeRejected byte 16.
     */
    private final PurgeRejectedReturnBitfield16Field purgeRejectedReturnBitfield16 = new PurgeRejectedReturnBitfield16Field();

    /**
     * BitSet PurgeRejected byte 17.
     */
    private final PurgeRejectedReturnBitfield17Field purgeRejectedReturnBitfield17 = new PurgeRejectedReturnBitfield17Field();

    /**
     * BitSet PurgeRejected byte 18.
     */
    private final PurgeRejectedReturnBitfield18Field purgeRejectedReturnBitfield18 = new PurgeRejectedReturnBitfield18Field();

    /**
     * BitSet PurgeRejected byte 19.
     */
    private final PurgeRejectedReturnBitfield19Field purgeRejectedReturnBitfield19 = new PurgeRejectedReturnBitfield19Field();

    /**
     * BitSet PurgeRejected byte 20.
     */
    private final PurgeRejectedReturnBitfield20Field purgeRejectedReturnBitfield20 = new PurgeRejectedReturnBitfield20Field();

    /**
     * Mass Cancel Id
     */
    private final MassCancelIdField massCancelId = new MassCancelIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, purgeRejectReason, text, numberOfReturnBitfields, purgeRejectedReturnBitfield1, purgeRejectedReturnBitfield2, purgeRejectedReturnBitfield3, purgeRejectedReturnBitfield4, purgeRejectedReturnBitfield5, purgeRejectedReturnBitfield6, purgeRejectedReturnBitfield7, purgeRejectedReturnBitfield8, purgeRejectedReturnBitfield9, purgeRejectedReturnBitfield10, purgeRejectedReturnBitfield11, purgeRejectedReturnBitfield12, purgeRejectedReturnBitfield13, purgeRejectedReturnBitfield14, purgeRejectedReturnBitfield15, purgeRejectedReturnBitfield16, purgeRejectedReturnBitfield17, purgeRejectedReturnBitfield18, purgeRejectedReturnBitfield19, purgeRejectedReturnBitfield20, massCancelId);

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
     * Reason for a purge rejection. See Reason Codes for a list of possible reasons.
     *
     * @return the PurgeRejectReason field
     */
    public PurgeRejectReasonField purgeRejectReason() {
        return purgeRejectReason;
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
     * BitSet PurgeRejected byte 1.
     *
     * @return the PurgeRejectedReturnBitfield1 field
     */
    public PurgeRejectedReturnBitfield1Field purgeRejectedReturnBitfield1() {
        return purgeRejectedReturnBitfield1;
    }

    /**
     * BitSet PurgeRejected byte 2.
     *
     * @return the PurgeRejectedReturnBitfield2 field
     */
    public PurgeRejectedReturnBitfield2Field purgeRejectedReturnBitfield2() {
        return purgeRejectedReturnBitfield2;
    }

    /**
     * BitSet PurgeRejected byte 3.
     *
     * @return the PurgeRejectedReturnBitfield3 field
     */
    public PurgeRejectedReturnBitfield3Field purgeRejectedReturnBitfield3() {
        return purgeRejectedReturnBitfield3;
    }

    /**
     * BitSet PurgeRejected byte 4.
     *
     * @return the PurgeRejectedReturnBitfield4 field
     */
    public PurgeRejectedReturnBitfield4Field purgeRejectedReturnBitfield4() {
        return purgeRejectedReturnBitfield4;
    }

    /**
     * BitSet PurgeRejected byte 5.
     *
     * @return the PurgeRejectedReturnBitfield5 field
     */
    public PurgeRejectedReturnBitfield5Field purgeRejectedReturnBitfield5() {
        return purgeRejectedReturnBitfield5;
    }

    /**
     * BitSet PurgeRejected byte 6.
     *
     * @return the PurgeRejectedReturnBitfield6 field
     */
    public PurgeRejectedReturnBitfield6Field purgeRejectedReturnBitfield6() {
        return purgeRejectedReturnBitfield6;
    }

    /**
     * BitSet PurgeRejected byte 7.
     *
     * @return the PurgeRejectedReturnBitfield7 field
     */
    public PurgeRejectedReturnBitfield7Field purgeRejectedReturnBitfield7() {
        return purgeRejectedReturnBitfield7;
    }

    /**
     * BitSet PurgeRejected byte 8.
     *
     * @return the PurgeRejectedReturnBitfield8 field
     */
    public PurgeRejectedReturnBitfield8Field purgeRejectedReturnBitfield8() {
        return purgeRejectedReturnBitfield8;
    }

    /**
     * BitSet PurgeRejected byte 9.
     *
     * @return the PurgeRejectedReturnBitfield9 field
     */
    public PurgeRejectedReturnBitfield9Field purgeRejectedReturnBitfield9() {
        return purgeRejectedReturnBitfield9;
    }

    /**
     * BitSet PurgeRejected byte 10.
     *
     * @return the PurgeRejectedReturnBitfield10 field
     */
    public PurgeRejectedReturnBitfield10Field purgeRejectedReturnBitfield10() {
        return purgeRejectedReturnBitfield10;
    }

    /**
     * BitSet PurgeRejected byte 11.
     *
     * @return the PurgeRejectedReturnBitfield11 field
     */
    public PurgeRejectedReturnBitfield11Field purgeRejectedReturnBitfield11() {
        return purgeRejectedReturnBitfield11;
    }

    /**
     * BitSet PurgeRejected byte 12.
     *
     * @return the PurgeRejectedReturnBitfield12 field
     */
    public PurgeRejectedReturnBitfield12Field purgeRejectedReturnBitfield12() {
        return purgeRejectedReturnBitfield12;
    }

    /**
     * BitSet PurgeRejected byte 13.
     *
     * @return the PurgeRejectedReturnBitfield13 field
     */
    public PurgeRejectedReturnBitfield13Field purgeRejectedReturnBitfield13() {
        return purgeRejectedReturnBitfield13;
    }

    /**
     * BitSet PurgeRejected byte 14.
     *
     * @return the PurgeRejectedReturnBitfield14 field
     */
    public PurgeRejectedReturnBitfield14Field purgeRejectedReturnBitfield14() {
        return purgeRejectedReturnBitfield14;
    }

    /**
     * BitSet PurgeRejected byte 15.
     *
     * @return the PurgeRejectedReturnBitfield15 field
     */
    public PurgeRejectedReturnBitfield15Field purgeRejectedReturnBitfield15() {
        return purgeRejectedReturnBitfield15;
    }

    /**
     * BitSet PurgeRejected byte 16.
     *
     * @return the PurgeRejectedReturnBitfield16 field
     */
    public PurgeRejectedReturnBitfield16Field purgeRejectedReturnBitfield16() {
        return purgeRejectedReturnBitfield16;
    }

    /**
     * BitSet PurgeRejected byte 17.
     *
     * @return the PurgeRejectedReturnBitfield17 field
     */
    public PurgeRejectedReturnBitfield17Field purgeRejectedReturnBitfield17() {
        return purgeRejectedReturnBitfield17;
    }

    /**
     * BitSet PurgeRejected byte 18.
     *
     * @return the PurgeRejectedReturnBitfield18 field
     */
    public PurgeRejectedReturnBitfield18Field purgeRejectedReturnBitfield18() {
        return purgeRejectedReturnBitfield18;
    }

    /**
     * BitSet PurgeRejected byte 19.
     *
     * @return the PurgeRejectedReturnBitfield19 field
     */
    public PurgeRejectedReturnBitfield19Field purgeRejectedReturnBitfield19() {
        return purgeRejectedReturnBitfield19;
    }

    /**
     * BitSet PurgeRejected byte 20.
     *
     * @return the PurgeRejectedReturnBitfield20 field
     */
    public PurgeRejectedReturnBitfield20Field purgeRejectedReturnBitfield20() {
        return purgeRejectedReturnBitfield20;
    }

    /**
     * Mass Cancel Id
     *
     * @return the MassCancelId field
     */
    public MassCancelIdField massCancelId() {
        return massCancelId;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield1 is on the wire
     */
    public boolean purgeRejectedReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield2 is on the wire
     */
    public boolean purgeRejectedReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield3 is on the wire
     */
    public boolean purgeRejectedReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield4 is on the wire
     */
    public boolean purgeRejectedReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield5 is on the wire
     */
    public boolean purgeRejectedReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield6 is on the wire
     */
    public boolean purgeRejectedReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield7 is on the wire
     */
    public boolean purgeRejectedReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield8 is on the wire
     */
    public boolean purgeRejectedReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield9 is on the wire
     */
    public boolean purgeRejectedReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield10 is on the wire
     */
    public boolean purgeRejectedReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield11 is on the wire
     */
    public boolean purgeRejectedReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield12 is on the wire
     */
    public boolean purgeRejectedReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield13 is on the wire
     */
    public boolean purgeRejectedReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield14 is on the wire
     */
    public boolean purgeRejectedReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield15 is on the wire
     */
    public boolean purgeRejectedReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield16 is on the wire
     */
    public boolean purgeRejectedReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield17 is on the wire
     */
    public boolean purgeRejectedReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield18 is on the wire
     */
    public boolean purgeRejectedReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield19 is on the wire
     */
    public boolean purgeRejectedReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the PurgeRejectedReturnBitfield20 put it on the wire.
     *
     * <p>Decode reads the PurgeRejectedReturnBitfield20 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PurgeRejectedReturnBitfield20 is on the wire
     */
    public boolean purgeRejectedReturnBitfield20Present() {
        return numberOfReturnBitfields.value() >= 20L;
    }

    /**
     * Returns whether the fields before the MassCancelId put it on the wire.
     *
     * <p>Decode reads the MassCancelId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MassCancelId is on the wire
     */
    public boolean massCancelIdPresent() {
        return (numberOfReturnBitfields.value() >= 15L) && (purgeRejectedReturnBitfield15Present() && purgeRejectedReturnBitfield15.purgeRejectedReturnBitfield15MassCancelId());
    }

    private boolean onWire(Field field) {
        return (field != purgeRejectedReturnBitfield1 || purgeRejectedReturnBitfield1Present()) && (field != purgeRejectedReturnBitfield2 || purgeRejectedReturnBitfield2Present()) && (field != purgeRejectedReturnBitfield3 || purgeRejectedReturnBitfield3Present()) && (field != purgeRejectedReturnBitfield4 || purgeRejectedReturnBitfield4Present()) && (field != purgeRejectedReturnBitfield5 || purgeRejectedReturnBitfield5Present()) && (field != purgeRejectedReturnBitfield6 || purgeRejectedReturnBitfield6Present()) && (field != purgeRejectedReturnBitfield7 || purgeRejectedReturnBitfield7Present()) && (field != purgeRejectedReturnBitfield8 || purgeRejectedReturnBitfield8Present()) && (field != purgeRejectedReturnBitfield9 || purgeRejectedReturnBitfield9Present()) && (field != purgeRejectedReturnBitfield10 || purgeRejectedReturnBitfield10Present()) && (field != purgeRejectedReturnBitfield11 || purgeRejectedReturnBitfield11Present()) && (field != purgeRejectedReturnBitfield12 || purgeRejectedReturnBitfield12Present()) && (field != purgeRejectedReturnBitfield13 || purgeRejectedReturnBitfield13Present()) && (field != purgeRejectedReturnBitfield14 || purgeRejectedReturnBitfield14Present()) && (field != purgeRejectedReturnBitfield15 || purgeRejectedReturnBitfield15Present()) && (field != purgeRejectedReturnBitfield16 || purgeRejectedReturnBitfield16Present()) && (field != purgeRejectedReturnBitfield17 || purgeRejectedReturnBitfield17Present()) && (field != purgeRejectedReturnBitfield18 || purgeRejectedReturnBitfield18Present()) && (field != purgeRejectedReturnBitfield19 || purgeRejectedReturnBitfield19Present()) && (field != purgeRejectedReturnBitfield20 || purgeRejectedReturnBitfield20Present()) && (field != massCancelId || massCancelIdPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (purgeRejectedReturnBitfield1Present() ? PurgeRejectedReturnBitfield1Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield2Present() ? PurgeRejectedReturnBitfield2Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield3Present() ? PurgeRejectedReturnBitfield3Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield4Present() ? PurgeRejectedReturnBitfield4Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield5Present() ? PurgeRejectedReturnBitfield5Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield6Present() ? PurgeRejectedReturnBitfield6Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield7Present() ? PurgeRejectedReturnBitfield7Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield8Present() ? PurgeRejectedReturnBitfield8Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield9Present() ? PurgeRejectedReturnBitfield9Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield10Present() ? PurgeRejectedReturnBitfield10Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield11Present() ? PurgeRejectedReturnBitfield11Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield12Present() ? PurgeRejectedReturnBitfield12Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield13Present() ? PurgeRejectedReturnBitfield13Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield14Present() ? PurgeRejectedReturnBitfield14Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield15Present() ? PurgeRejectedReturnBitfield15Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield16Present() ? PurgeRejectedReturnBitfield16Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield17Present() ? PurgeRejectedReturnBitfield17Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield18Present() ? PurgeRejectedReturnBitfield18Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield19Present() ? PurgeRejectedReturnBitfield19Field.BYTE_LENGTH : 0) + (purgeRejectedReturnBitfield20Present() ? PurgeRejectedReturnBitfield20Field.BYTE_LENGTH : 0) + (massCancelIdPresent() ? MassCancelIdField.BYTE_LENGTH : 0);
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
        cursor += 1;
        cursor += 60;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (purgeRejectedReturnBitfield1Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield2Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield3Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield4Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield5Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield6Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield7Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield8Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield9Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield10Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield11Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield12Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield13Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield14Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield15Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield16Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield17Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield18Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield19Present()) {
            cursor += 1;
        }
        if (purgeRejectedReturnBitfield20Present()) {
            cursor += 1;
        }
        if (massCancelIdPresent()) {
            cursor += 20;
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
        if (!purgeRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += PurgeRejectReasonField.BYTE_LENGTH;
        if (!text.parse(data, cursor)) {
            return false;
        }
        cursor += TextField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (purgeRejectedReturnBitfield1Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield1Field.BYTE_LENGTH || !purgeRejectedReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield2Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield2Field.BYTE_LENGTH || !purgeRejectedReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield3Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield3Field.BYTE_LENGTH || !purgeRejectedReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield4Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield4Field.BYTE_LENGTH || !purgeRejectedReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield5Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield5Field.BYTE_LENGTH || !purgeRejectedReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield6Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield6Field.BYTE_LENGTH || !purgeRejectedReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield7Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield7Field.BYTE_LENGTH || !purgeRejectedReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield8Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield8Field.BYTE_LENGTH || !purgeRejectedReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield9Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield9Field.BYTE_LENGTH || !purgeRejectedReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield10Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield10Field.BYTE_LENGTH || !purgeRejectedReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield11Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield11Field.BYTE_LENGTH || !purgeRejectedReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield12Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield12Field.BYTE_LENGTH || !purgeRejectedReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield13Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield13Field.BYTE_LENGTH || !purgeRejectedReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield14Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield14Field.BYTE_LENGTH || !purgeRejectedReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield15Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield15Field.BYTE_LENGTH || !purgeRejectedReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield16Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield16Field.BYTE_LENGTH || !purgeRejectedReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield17Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield17Field.BYTE_LENGTH || !purgeRejectedReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield18Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield18Field.BYTE_LENGTH || !purgeRejectedReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield19Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield19Field.BYTE_LENGTH || !purgeRejectedReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (purgeRejectedReturnBitfield20Present()) {
            if (end - cursor < PurgeRejectedReturnBitfield20Field.BYTE_LENGTH || !purgeRejectedReturnBitfield20.parse(data, cursor)) {
                return false;
            }
            cursor += PurgeRejectedReturnBitfield20Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (massCancelIdPresent()) {
            if (end - cursor < MassCancelIdField.BYTE_LENGTH || !massCancelId.parse(data, cursor)) {
                return false;
            }
            cursor += MassCancelIdField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (purgeRejectedReturnBitfield1Present() != purgeRejectedReturnBitfield1.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield1.hasValue() ? "purgeRejectedReturnBitfield1 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield2Present() != purgeRejectedReturnBitfield2.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield2.hasValue() ? "purgeRejectedReturnBitfield2 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield3Present() != purgeRejectedReturnBitfield3.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield3.hasValue() ? "purgeRejectedReturnBitfield3 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield4Present() != purgeRejectedReturnBitfield4.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield4.hasValue() ? "purgeRejectedReturnBitfield4 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield5Present() != purgeRejectedReturnBitfield5.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield5.hasValue() ? "purgeRejectedReturnBitfield5 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield6Present() != purgeRejectedReturnBitfield6.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield6.hasValue() ? "purgeRejectedReturnBitfield6 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield7Present() != purgeRejectedReturnBitfield7.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield7.hasValue() ? "purgeRejectedReturnBitfield7 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield8Present() != purgeRejectedReturnBitfield8.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield8.hasValue() ? "purgeRejectedReturnBitfield8 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield9Present() != purgeRejectedReturnBitfield9.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield9.hasValue() ? "purgeRejectedReturnBitfield9 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield10Present() != purgeRejectedReturnBitfield10.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield10.hasValue() ? "purgeRejectedReturnBitfield10 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield11Present() != purgeRejectedReturnBitfield11.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield11.hasValue() ? "purgeRejectedReturnBitfield11 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield12Present() != purgeRejectedReturnBitfield12.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield12.hasValue() ? "purgeRejectedReturnBitfield12 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield13Present() != purgeRejectedReturnBitfield13.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield13.hasValue() ? "purgeRejectedReturnBitfield13 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield14Present() != purgeRejectedReturnBitfield14.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield14.hasValue() ? "purgeRejectedReturnBitfield14 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield15Present() != purgeRejectedReturnBitfield15.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield15.hasValue() ? "purgeRejectedReturnBitfield15 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield16Present() != purgeRejectedReturnBitfield16.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield16.hasValue() ? "purgeRejectedReturnBitfield16 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield17Present() != purgeRejectedReturnBitfield17.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield17.hasValue() ? "purgeRejectedReturnBitfield17 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield18Present() != purgeRejectedReturnBitfield18.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield18.hasValue() ? "purgeRejectedReturnBitfield18 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield19Present() != purgeRejectedReturnBitfield19.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield19.hasValue() ? "purgeRejectedReturnBitfield19 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (purgeRejectedReturnBitfield20Present() != purgeRejectedReturnBitfield20.hasValue()) {
            throw new IllegalStateException(purgeRejectedReturnBitfield20.hasValue() ? "purgeRejectedReturnBitfield20 holds a value the fields before it leave off the wire" : "purgeRejectedReturnBitfield20 holds no value, though the fields before it put it on the wire");
        }
        if (massCancelIdPresent() != massCancelId.hasValue()) {
            throw new IllegalStateException(massCancelId.hasValue() ? "massCancelId holds a value the fields before it leave off the wire" : "massCancelId holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = purgeRejectReason.encode(data, cursor);
        cursor = text.encode(data, cursor);
        if (buffer != null && buffer.length >= 70) {
            System.arraycopy(buffer, 69, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (purgeRejectedReturnBitfield1Present()) {
            cursor = purgeRejectedReturnBitfield1.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield2Present()) {
            cursor = purgeRejectedReturnBitfield2.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield3Present()) {
            cursor = purgeRejectedReturnBitfield3.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield4Present()) {
            cursor = purgeRejectedReturnBitfield4.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield5Present()) {
            cursor = purgeRejectedReturnBitfield5.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield6Present()) {
            cursor = purgeRejectedReturnBitfield6.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield7Present()) {
            cursor = purgeRejectedReturnBitfield7.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield8Present()) {
            cursor = purgeRejectedReturnBitfield8.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield9Present()) {
            cursor = purgeRejectedReturnBitfield9.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield10Present()) {
            cursor = purgeRejectedReturnBitfield10.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield11Present()) {
            cursor = purgeRejectedReturnBitfield11.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield12Present()) {
            cursor = purgeRejectedReturnBitfield12.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield13Present()) {
            cursor = purgeRejectedReturnBitfield13.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield14Present()) {
            cursor = purgeRejectedReturnBitfield14.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield15Present()) {
            cursor = purgeRejectedReturnBitfield15.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield16Present()) {
            cursor = purgeRejectedReturnBitfield16.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield17Present()) {
            cursor = purgeRejectedReturnBitfield17.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield18Present()) {
            cursor = purgeRejectedReturnBitfield18.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield19Present()) {
            cursor = purgeRejectedReturnBitfield19.encode(data, cursor);
        }
        if (purgeRejectedReturnBitfield20Present()) {
            cursor = purgeRejectedReturnBitfield20.encode(data, cursor);
        }
        if (massCancelIdPresent()) {
            cursor = massCancelId.encode(data, cursor);
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
            case "PurgeRejectReason" -> Optional.of(purgeRejectReason);
            case "Text" -> Optional.of(text);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "PurgeRejectedReturnBitfield1" -> Optional.of(purgeRejectedReturnBitfield1);
            case "PurgeRejectedReturnBitfield2" -> Optional.of(purgeRejectedReturnBitfield2);
            case "PurgeRejectedReturnBitfield3" -> Optional.of(purgeRejectedReturnBitfield3);
            case "PurgeRejectedReturnBitfield4" -> Optional.of(purgeRejectedReturnBitfield4);
            case "PurgeRejectedReturnBitfield5" -> Optional.of(purgeRejectedReturnBitfield5);
            case "PurgeRejectedReturnBitfield6" -> Optional.of(purgeRejectedReturnBitfield6);
            case "PurgeRejectedReturnBitfield7" -> Optional.of(purgeRejectedReturnBitfield7);
            case "PurgeRejectedReturnBitfield8" -> Optional.of(purgeRejectedReturnBitfield8);
            case "PurgeRejectedReturnBitfield9" -> Optional.of(purgeRejectedReturnBitfield9);
            case "PurgeRejectedReturnBitfield10" -> Optional.of(purgeRejectedReturnBitfield10);
            case "PurgeRejectedReturnBitfield11" -> Optional.of(purgeRejectedReturnBitfield11);
            case "PurgeRejectedReturnBitfield12" -> Optional.of(purgeRejectedReturnBitfield12);
            case "PurgeRejectedReturnBitfield13" -> Optional.of(purgeRejectedReturnBitfield13);
            case "PurgeRejectedReturnBitfield14" -> Optional.of(purgeRejectedReturnBitfield14);
            case "PurgeRejectedReturnBitfield15" -> Optional.of(purgeRejectedReturnBitfield15);
            case "PurgeRejectedReturnBitfield16" -> Optional.of(purgeRejectedReturnBitfield16);
            case "PurgeRejectedReturnBitfield17" -> Optional.of(purgeRejectedReturnBitfield17);
            case "PurgeRejectedReturnBitfield18" -> Optional.of(purgeRejectedReturnBitfield18);
            case "PurgeRejectedReturnBitfield19" -> Optional.of(purgeRejectedReturnBitfield19);
            case "PurgeRejectedReturnBitfield20" -> Optional.of(purgeRejectedReturnBitfield20);
            case "MassCancelId" -> Optional.of(massCancelId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PurgeRejectedMessage message)) {
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
        if (!(other instanceof PurgeRejectedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
