package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ClOrdIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield10Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield11Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield12Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield13Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield14Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield15Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield16Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield17Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield18Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield19Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield1Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield2Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield3Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield4Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield5Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield6Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield7Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield8Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ComplexInstrumentRejectedReturnBitfield9Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NoOfSecuritiesField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.OrderRejectReasonField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.TextField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.TransactionTimeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.PrintOptions;

/**
 * Represents the ComplexInstrumentRejectedMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Complex Instrument Rejected Message.</p>
 */
public final class ComplexInstrumentRejectedMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 95;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Instrument Rejected Message";

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent). Nanosecond precision.
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe (—). A leading tilde (˜) cannot be sent on any ClOrdID and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system-generated ClOrdID. If the ClOrdID matches a live order, the order will be rejected as a duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live or- ders. However, we strongly recommend that you keep your ClOrdID values at least day- unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Reason for an order rejection. See Reason Codes (§ 7.1, p. 196) for a list of possible reasons.
     */
    private final OrderRejectReasonField orderRejectReason = new OrderRejectReasonField();

    /**
     * Human readable text with more information about the reject reason.
     */
    private final TextField text = new TextField();

    /**
     * Corresponds to NoOfSecurities (8641) in Cboe FIX. Indicates the number of securities created by the member in this trading session.
     */
    private final NoOfSecuritiesField noOfSecurities = new NoOfSecuritiesField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet ComplexInstrumentRejected byte 1.
     */
    private final ComplexInstrumentRejectedReturnBitfield1Field complexInstrumentRejectedReturnBitfield1 = new ComplexInstrumentRejectedReturnBitfield1Field();

    /**
     * BitSet ComplexInstrumentRejected byte 2.
     */
    private final ComplexInstrumentRejectedReturnBitfield2Field complexInstrumentRejectedReturnBitfield2 = new ComplexInstrumentRejectedReturnBitfield2Field();

    /**
     * BitSet ComplexInstrumentRejected byte 3.
     */
    private final ComplexInstrumentRejectedReturnBitfield3Field complexInstrumentRejectedReturnBitfield3 = new ComplexInstrumentRejectedReturnBitfield3Field();

    /**
     * BitSet ComplexInstrumentRejected byte 4.
     */
    private final ComplexInstrumentRejectedReturnBitfield4Field complexInstrumentRejectedReturnBitfield4 = new ComplexInstrumentRejectedReturnBitfield4Field();

    /**
     * BitSet ComplexInstrumentRejected byte 5.
     */
    private final ComplexInstrumentRejectedReturnBitfield5Field complexInstrumentRejectedReturnBitfield5 = new ComplexInstrumentRejectedReturnBitfield5Field();

    /**
     * BitSet ComplexInstrumentRejected byte 6.
     */
    private final ComplexInstrumentRejectedReturnBitfield6Field complexInstrumentRejectedReturnBitfield6 = new ComplexInstrumentRejectedReturnBitfield6Field();

    /**
     * BitSet ComplexInstrumentRejected byte 7.
     */
    private final ComplexInstrumentRejectedReturnBitfield7Field complexInstrumentRejectedReturnBitfield7 = new ComplexInstrumentRejectedReturnBitfield7Field();

    /**
     * BitSet ComplexInstrumentRejected byte 8.
     */
    private final ComplexInstrumentRejectedReturnBitfield8Field complexInstrumentRejectedReturnBitfield8 = new ComplexInstrumentRejectedReturnBitfield8Field();

    /**
     * BitSet ComplexInstrumentRejected byte 9.
     */
    private final ComplexInstrumentRejectedReturnBitfield9Field complexInstrumentRejectedReturnBitfield9 = new ComplexInstrumentRejectedReturnBitfield9Field();

    /**
     * BitSet ComplexInstrumentRejected byte 10.
     */
    private final ComplexInstrumentRejectedReturnBitfield10Field complexInstrumentRejectedReturnBitfield10 = new ComplexInstrumentRejectedReturnBitfield10Field();

    /**
     * BitSet ComplexInstrumentRejected byte 11.
     */
    private final ComplexInstrumentRejectedReturnBitfield11Field complexInstrumentRejectedReturnBitfield11 = new ComplexInstrumentRejectedReturnBitfield11Field();

    /**
     * BitSet ComplexInstrumentRejected byte 12.
     */
    private final ComplexInstrumentRejectedReturnBitfield12Field complexInstrumentRejectedReturnBitfield12 = new ComplexInstrumentRejectedReturnBitfield12Field();

    /**
     * BitSet ComplexInstrumentRejected byte 13.
     */
    private final ComplexInstrumentRejectedReturnBitfield13Field complexInstrumentRejectedReturnBitfield13 = new ComplexInstrumentRejectedReturnBitfield13Field();

    /**
     * BitSet ComplexInstrumentRejected byte 14.
     */
    private final ComplexInstrumentRejectedReturnBitfield14Field complexInstrumentRejectedReturnBitfield14 = new ComplexInstrumentRejectedReturnBitfield14Field();

    /**
     * BitSet ComplexInstrumentRejected byte 15.
     */
    private final ComplexInstrumentRejectedReturnBitfield15Field complexInstrumentRejectedReturnBitfield15 = new ComplexInstrumentRejectedReturnBitfield15Field();

    /**
     * BitSet ComplexInstrumentRejected byte 16.
     */
    private final ComplexInstrumentRejectedReturnBitfield16Field complexInstrumentRejectedReturnBitfield16 = new ComplexInstrumentRejectedReturnBitfield16Field();

    /**
     * BitSet ComplexInstrumentRejected byte 17.
     */
    private final ComplexInstrumentRejectedReturnBitfield17Field complexInstrumentRejectedReturnBitfield17 = new ComplexInstrumentRejectedReturnBitfield17Field();

    /**
     * BitSet ComplexInstrumentRejected byte 18.
     */
    private final ComplexInstrumentRejectedReturnBitfield18Field complexInstrumentRejectedReturnBitfield18 = new ComplexInstrumentRejectedReturnBitfield18Field();

    /**
     * BitSet ComplexInstrumentRejected byte 19.
     */
    private final ComplexInstrumentRejectedReturnBitfield19Field complexInstrumentRejectedReturnBitfield19 = new ComplexInstrumentRejectedReturnBitfield19Field();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, orderRejectReason, text, noOfSecurities, numberOfReturnBitfields, complexInstrumentRejectedReturnBitfield1, complexInstrumentRejectedReturnBitfield2, complexInstrumentRejectedReturnBitfield3, complexInstrumentRejectedReturnBitfield4, complexInstrumentRejectedReturnBitfield5, complexInstrumentRejectedReturnBitfield6, complexInstrumentRejectedReturnBitfield7, complexInstrumentRejectedReturnBitfield8, complexInstrumentRejectedReturnBitfield9, complexInstrumentRejectedReturnBitfield10, complexInstrumentRejectedReturnBitfield11, complexInstrumentRejectedReturnBitfield12, complexInstrumentRejectedReturnBitfield13, complexInstrumentRejectedReturnBitfield14, complexInstrumentRejectedReturnBitfield15, complexInstrumentRejectedReturnBitfield16, complexInstrumentRejectedReturnBitfield17, complexInstrumentRejectedReturnBitfield18, complexInstrumentRejectedReturnBitfield19);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent). Nanosecond precision.
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
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
     * Reason for an order rejection. See Reason Codes (§ 7.1, p. 196) for a list of possible reasons.
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
     * Corresponds to NoOfSecurities (8641) in Cboe FIX. Indicates the number of securities created by the member in this trading session.
     *
     * @return the NoOfSecurities field
     */
    public NoOfSecuritiesField noOfSecurities() {
        return noOfSecurities;
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
     * BitSet ComplexInstrumentRejected byte 1.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield1 field
     */
    public ComplexInstrumentRejectedReturnBitfield1Field complexInstrumentRejectedReturnBitfield1() {
        return complexInstrumentRejectedReturnBitfield1;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 2.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield2 field
     */
    public ComplexInstrumentRejectedReturnBitfield2Field complexInstrumentRejectedReturnBitfield2() {
        return complexInstrumentRejectedReturnBitfield2;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 3.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield3 field
     */
    public ComplexInstrumentRejectedReturnBitfield3Field complexInstrumentRejectedReturnBitfield3() {
        return complexInstrumentRejectedReturnBitfield3;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 4.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield4 field
     */
    public ComplexInstrumentRejectedReturnBitfield4Field complexInstrumentRejectedReturnBitfield4() {
        return complexInstrumentRejectedReturnBitfield4;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 5.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield5 field
     */
    public ComplexInstrumentRejectedReturnBitfield5Field complexInstrumentRejectedReturnBitfield5() {
        return complexInstrumentRejectedReturnBitfield5;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 6.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield6 field
     */
    public ComplexInstrumentRejectedReturnBitfield6Field complexInstrumentRejectedReturnBitfield6() {
        return complexInstrumentRejectedReturnBitfield6;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 7.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield7 field
     */
    public ComplexInstrumentRejectedReturnBitfield7Field complexInstrumentRejectedReturnBitfield7() {
        return complexInstrumentRejectedReturnBitfield7;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 8.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield8 field
     */
    public ComplexInstrumentRejectedReturnBitfield8Field complexInstrumentRejectedReturnBitfield8() {
        return complexInstrumentRejectedReturnBitfield8;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 9.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield9 field
     */
    public ComplexInstrumentRejectedReturnBitfield9Field complexInstrumentRejectedReturnBitfield9() {
        return complexInstrumentRejectedReturnBitfield9;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 10.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield10 field
     */
    public ComplexInstrumentRejectedReturnBitfield10Field complexInstrumentRejectedReturnBitfield10() {
        return complexInstrumentRejectedReturnBitfield10;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 11.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield11 field
     */
    public ComplexInstrumentRejectedReturnBitfield11Field complexInstrumentRejectedReturnBitfield11() {
        return complexInstrumentRejectedReturnBitfield11;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 12.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield12 field
     */
    public ComplexInstrumentRejectedReturnBitfield12Field complexInstrumentRejectedReturnBitfield12() {
        return complexInstrumentRejectedReturnBitfield12;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 13.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield13 field
     */
    public ComplexInstrumentRejectedReturnBitfield13Field complexInstrumentRejectedReturnBitfield13() {
        return complexInstrumentRejectedReturnBitfield13;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 14.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield14 field
     */
    public ComplexInstrumentRejectedReturnBitfield14Field complexInstrumentRejectedReturnBitfield14() {
        return complexInstrumentRejectedReturnBitfield14;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 15.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield15 field
     */
    public ComplexInstrumentRejectedReturnBitfield15Field complexInstrumentRejectedReturnBitfield15() {
        return complexInstrumentRejectedReturnBitfield15;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 16.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield16 field
     */
    public ComplexInstrumentRejectedReturnBitfield16Field complexInstrumentRejectedReturnBitfield16() {
        return complexInstrumentRejectedReturnBitfield16;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 17.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield17 field
     */
    public ComplexInstrumentRejectedReturnBitfield17Field complexInstrumentRejectedReturnBitfield17() {
        return complexInstrumentRejectedReturnBitfield17;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 18.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield18 field
     */
    public ComplexInstrumentRejectedReturnBitfield18Field complexInstrumentRejectedReturnBitfield18() {
        return complexInstrumentRejectedReturnBitfield18;
    }

    /**
     * BitSet ComplexInstrumentRejected byte 19.
     *
     * @return the ComplexInstrumentRejectedReturnBitfield19 field
     */
    public ComplexInstrumentRejectedReturnBitfield19Field complexInstrumentRejectedReturnBitfield19() {
        return complexInstrumentRejectedReturnBitfield19;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield1 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield2 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield3 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield4 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield5 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield6 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield7 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield8 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield9 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield10 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield11 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield12 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield13 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield14 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield15 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield16 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield17 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield18 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the ComplexInstrumentRejectedReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the ComplexInstrumentRejectedReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComplexInstrumentRejectedReturnBitfield19 is on the wire
     */
    public boolean complexInstrumentRejectedReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    private boolean onWire(Field field) {
        return (field != complexInstrumentRejectedReturnBitfield1 || complexInstrumentRejectedReturnBitfield1Present()) && (field != complexInstrumentRejectedReturnBitfield2 || complexInstrumentRejectedReturnBitfield2Present()) && (field != complexInstrumentRejectedReturnBitfield3 || complexInstrumentRejectedReturnBitfield3Present()) && (field != complexInstrumentRejectedReturnBitfield4 || complexInstrumentRejectedReturnBitfield4Present()) && (field != complexInstrumentRejectedReturnBitfield5 || complexInstrumentRejectedReturnBitfield5Present()) && (field != complexInstrumentRejectedReturnBitfield6 || complexInstrumentRejectedReturnBitfield6Present()) && (field != complexInstrumentRejectedReturnBitfield7 || complexInstrumentRejectedReturnBitfield7Present()) && (field != complexInstrumentRejectedReturnBitfield8 || complexInstrumentRejectedReturnBitfield8Present()) && (field != complexInstrumentRejectedReturnBitfield9 || complexInstrumentRejectedReturnBitfield9Present()) && (field != complexInstrumentRejectedReturnBitfield10 || complexInstrumentRejectedReturnBitfield10Present()) && (field != complexInstrumentRejectedReturnBitfield11 || complexInstrumentRejectedReturnBitfield11Present()) && (field != complexInstrumentRejectedReturnBitfield12 || complexInstrumentRejectedReturnBitfield12Present()) && (field != complexInstrumentRejectedReturnBitfield13 || complexInstrumentRejectedReturnBitfield13Present()) && (field != complexInstrumentRejectedReturnBitfield14 || complexInstrumentRejectedReturnBitfield14Present()) && (field != complexInstrumentRejectedReturnBitfield15 || complexInstrumentRejectedReturnBitfield15Present()) && (field != complexInstrumentRejectedReturnBitfield16 || complexInstrumentRejectedReturnBitfield16Present()) && (field != complexInstrumentRejectedReturnBitfield17 || complexInstrumentRejectedReturnBitfield17Present()) && (field != complexInstrumentRejectedReturnBitfield18 || complexInstrumentRejectedReturnBitfield18Present()) && (field != complexInstrumentRejectedReturnBitfield19 || complexInstrumentRejectedReturnBitfield19Present());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (complexInstrumentRejectedReturnBitfield1Present() ? ComplexInstrumentRejectedReturnBitfield1Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield2Present() ? ComplexInstrumentRejectedReturnBitfield2Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield3Present() ? ComplexInstrumentRejectedReturnBitfield3Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield4Present() ? ComplexInstrumentRejectedReturnBitfield4Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield5Present() ? ComplexInstrumentRejectedReturnBitfield5Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield6Present() ? ComplexInstrumentRejectedReturnBitfield6Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield7Present() ? ComplexInstrumentRejectedReturnBitfield7Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield8Present() ? ComplexInstrumentRejectedReturnBitfield8Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield9Present() ? ComplexInstrumentRejectedReturnBitfield9Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield10Present() ? ComplexInstrumentRejectedReturnBitfield10Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield11Present() ? ComplexInstrumentRejectedReturnBitfield11Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield12Present() ? ComplexInstrumentRejectedReturnBitfield12Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield13Present() ? ComplexInstrumentRejectedReturnBitfield13Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield14Present() ? ComplexInstrumentRejectedReturnBitfield14Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield15Present() ? ComplexInstrumentRejectedReturnBitfield15Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield16Present() ? ComplexInstrumentRejectedReturnBitfield16Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield17Present() ? ComplexInstrumentRejectedReturnBitfield17Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield18Present() ? ComplexInstrumentRejectedReturnBitfield18Field.BYTE_LENGTH : 0) + (complexInstrumentRejectedReturnBitfield19Present() ? ComplexInstrumentRejectedReturnBitfield19Field.BYTE_LENGTH : 0);
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
        cursor += 4;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (complexInstrumentRejectedReturnBitfield1Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield2Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield3Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield4Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield5Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield6Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield7Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield8Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield9Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield10Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield11Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield12Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield13Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield14Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield15Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield16Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield17Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield18Present()) {
            cursor += 1;
        }
        if (complexInstrumentRejectedReturnBitfield19Present()) {
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
        if (!noOfSecurities.parse(data, cursor)) {
            return false;
        }
        cursor += NoOfSecuritiesField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (complexInstrumentRejectedReturnBitfield1Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield1Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield2Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield2Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield3Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield3Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield4Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield4Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield5Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield5Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield6Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield6Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield7Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield7Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield8Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield8Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield9Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield9Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield10Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield10Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield11Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield11Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield12Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield12Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield13Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield13Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield14Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield14Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield15Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield15Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield16Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield16Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield17Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield17Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield18Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield18Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (complexInstrumentRejectedReturnBitfield19Present()) {
            if (end - cursor < ComplexInstrumentRejectedReturnBitfield19Field.BYTE_LENGTH || !complexInstrumentRejectedReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += ComplexInstrumentRejectedReturnBitfield19Field.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (complexInstrumentRejectedReturnBitfield1Present() != complexInstrumentRejectedReturnBitfield1.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield1.hasValue() ? "complexInstrumentRejectedReturnBitfield1 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield2Present() != complexInstrumentRejectedReturnBitfield2.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield2.hasValue() ? "complexInstrumentRejectedReturnBitfield2 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield3Present() != complexInstrumentRejectedReturnBitfield3.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield3.hasValue() ? "complexInstrumentRejectedReturnBitfield3 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield4Present() != complexInstrumentRejectedReturnBitfield4.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield4.hasValue() ? "complexInstrumentRejectedReturnBitfield4 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield5Present() != complexInstrumentRejectedReturnBitfield5.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield5.hasValue() ? "complexInstrumentRejectedReturnBitfield5 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield6Present() != complexInstrumentRejectedReturnBitfield6.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield6.hasValue() ? "complexInstrumentRejectedReturnBitfield6 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield7Present() != complexInstrumentRejectedReturnBitfield7.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield7.hasValue() ? "complexInstrumentRejectedReturnBitfield7 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield8Present() != complexInstrumentRejectedReturnBitfield8.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield8.hasValue() ? "complexInstrumentRejectedReturnBitfield8 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield9Present() != complexInstrumentRejectedReturnBitfield9.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield9.hasValue() ? "complexInstrumentRejectedReturnBitfield9 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield10Present() != complexInstrumentRejectedReturnBitfield10.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield10.hasValue() ? "complexInstrumentRejectedReturnBitfield10 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield11Present() != complexInstrumentRejectedReturnBitfield11.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield11.hasValue() ? "complexInstrumentRejectedReturnBitfield11 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield12Present() != complexInstrumentRejectedReturnBitfield12.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield12.hasValue() ? "complexInstrumentRejectedReturnBitfield12 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield13Present() != complexInstrumentRejectedReturnBitfield13.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield13.hasValue() ? "complexInstrumentRejectedReturnBitfield13 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield14Present() != complexInstrumentRejectedReturnBitfield14.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield14.hasValue() ? "complexInstrumentRejectedReturnBitfield14 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield15Present() != complexInstrumentRejectedReturnBitfield15.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield15.hasValue() ? "complexInstrumentRejectedReturnBitfield15 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield16Present() != complexInstrumentRejectedReturnBitfield16.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield16.hasValue() ? "complexInstrumentRejectedReturnBitfield16 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield17Present() != complexInstrumentRejectedReturnBitfield17.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield17.hasValue() ? "complexInstrumentRejectedReturnBitfield17 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield18Present() != complexInstrumentRejectedReturnBitfield18.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield18.hasValue() ? "complexInstrumentRejectedReturnBitfield18 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (complexInstrumentRejectedReturnBitfield19Present() != complexInstrumentRejectedReturnBitfield19.hasValue()) {
            throw new IllegalStateException(complexInstrumentRejectedReturnBitfield19.hasValue() ? "complexInstrumentRejectedReturnBitfield19 holds a value the fields before it leave off the wire" : "complexInstrumentRejectedReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderRejectReason.encode(data, cursor);
        cursor = text.encode(data, cursor);
        cursor = noOfSecurities.encode(data, cursor);
        if (buffer != null && buffer.length >= 94) {
            System.arraycopy(buffer, 93, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (complexInstrumentRejectedReturnBitfield1Present()) {
            cursor = complexInstrumentRejectedReturnBitfield1.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield2Present()) {
            cursor = complexInstrumentRejectedReturnBitfield2.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield3Present()) {
            cursor = complexInstrumentRejectedReturnBitfield3.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield4Present()) {
            cursor = complexInstrumentRejectedReturnBitfield4.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield5Present()) {
            cursor = complexInstrumentRejectedReturnBitfield5.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield6Present()) {
            cursor = complexInstrumentRejectedReturnBitfield6.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield7Present()) {
            cursor = complexInstrumentRejectedReturnBitfield7.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield8Present()) {
            cursor = complexInstrumentRejectedReturnBitfield8.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield9Present()) {
            cursor = complexInstrumentRejectedReturnBitfield9.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield10Present()) {
            cursor = complexInstrumentRejectedReturnBitfield10.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield11Present()) {
            cursor = complexInstrumentRejectedReturnBitfield11.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield12Present()) {
            cursor = complexInstrumentRejectedReturnBitfield12.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield13Present()) {
            cursor = complexInstrumentRejectedReturnBitfield13.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield14Present()) {
            cursor = complexInstrumentRejectedReturnBitfield14.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield15Present()) {
            cursor = complexInstrumentRejectedReturnBitfield15.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield16Present()) {
            cursor = complexInstrumentRejectedReturnBitfield16.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield17Present()) {
            cursor = complexInstrumentRejectedReturnBitfield17.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield18Present()) {
            cursor = complexInstrumentRejectedReturnBitfield18.encode(data, cursor);
        }
        if (complexInstrumentRejectedReturnBitfield19Present()) {
            cursor = complexInstrumentRejectedReturnBitfield19.encode(data, cursor);
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
            case "NoOfSecurities" -> Optional.of(noOfSecurities);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "ComplexInstrumentRejectedReturnBitfield1" -> Optional.of(complexInstrumentRejectedReturnBitfield1);
            case "ComplexInstrumentRejectedReturnBitfield2" -> Optional.of(complexInstrumentRejectedReturnBitfield2);
            case "ComplexInstrumentRejectedReturnBitfield3" -> Optional.of(complexInstrumentRejectedReturnBitfield3);
            case "ComplexInstrumentRejectedReturnBitfield4" -> Optional.of(complexInstrumentRejectedReturnBitfield4);
            case "ComplexInstrumentRejectedReturnBitfield5" -> Optional.of(complexInstrumentRejectedReturnBitfield5);
            case "ComplexInstrumentRejectedReturnBitfield6" -> Optional.of(complexInstrumentRejectedReturnBitfield6);
            case "ComplexInstrumentRejectedReturnBitfield7" -> Optional.of(complexInstrumentRejectedReturnBitfield7);
            case "ComplexInstrumentRejectedReturnBitfield8" -> Optional.of(complexInstrumentRejectedReturnBitfield8);
            case "ComplexInstrumentRejectedReturnBitfield9" -> Optional.of(complexInstrumentRejectedReturnBitfield9);
            case "ComplexInstrumentRejectedReturnBitfield10" -> Optional.of(complexInstrumentRejectedReturnBitfield10);
            case "ComplexInstrumentRejectedReturnBitfield11" -> Optional.of(complexInstrumentRejectedReturnBitfield11);
            case "ComplexInstrumentRejectedReturnBitfield12" -> Optional.of(complexInstrumentRejectedReturnBitfield12);
            case "ComplexInstrumentRejectedReturnBitfield13" -> Optional.of(complexInstrumentRejectedReturnBitfield13);
            case "ComplexInstrumentRejectedReturnBitfield14" -> Optional.of(complexInstrumentRejectedReturnBitfield14);
            case "ComplexInstrumentRejectedReturnBitfield15" -> Optional.of(complexInstrumentRejectedReturnBitfield15);
            case "ComplexInstrumentRejectedReturnBitfield16" -> Optional.of(complexInstrumentRejectedReturnBitfield16);
            case "ComplexInstrumentRejectedReturnBitfield17" -> Optional.of(complexInstrumentRejectedReturnBitfield17);
            case "ComplexInstrumentRejectedReturnBitfield18" -> Optional.of(complexInstrumentRejectedReturnBitfield18);
            case "ComplexInstrumentRejectedReturnBitfield19" -> Optional.of(complexInstrumentRejectedReturnBitfield19);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexInstrumentRejectedMessage message)) {
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
        if (!(other instanceof ComplexInstrumentRejectedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
