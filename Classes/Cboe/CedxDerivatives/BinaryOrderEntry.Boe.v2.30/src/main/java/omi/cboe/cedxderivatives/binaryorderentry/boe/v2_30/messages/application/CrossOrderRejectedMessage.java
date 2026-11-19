package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield10Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield11Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield12Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield13Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield14Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield15Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield16Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield17Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield18Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield19Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield1Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield2Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield3Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield4Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield5Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield6Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield7Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield8Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderRejectedReturnBitfield9Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossPrioritizationField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ExtExecInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.IdSourceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderQtyField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderRejectReasonField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.PreventMatchField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.PriceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.SecurityIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.SubreasonField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.SymbolAlphanumericField2;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TextField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TransactionTimeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.PrintOptions;

/**
 * Represents the CrossOrderRejectedMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Cross Order Rejected Message.</p>
 */
public final class CrossOrderRejectedMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 91;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Cross Order Rejected Message";

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to CrossID (548) in Cboe FIX. Day-unique identifier for the cross order chosen by the client. Characters in the ASCII range 33– 126 are allowed, except for comma, semicolon, and pipe.
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * Reason for an order rejection. See Reason Codes (§ 7.1, p. 196) for a list of possible reasons.
     */
    private final OrderRejectReasonField orderRejectReason = new OrderRejectReasonField();

    /**
     * Human readable text with more information about the reject reason.
     */
    private final TextField text = new TextField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet CrossOrderRejected byte 1.
     */
    private final CrossOrderRejectedReturnBitfield1Field crossOrderRejectedReturnBitfield1 = new CrossOrderRejectedReturnBitfield1Field();

    /**
     * BitSet CrossOrderRejected byte 2.
     */
    private final CrossOrderRejectedReturnBitfield2Field crossOrderRejectedReturnBitfield2 = new CrossOrderRejectedReturnBitfield2Field();

    /**
     * BitSet CrossOrderRejected byte 3.
     */
    private final CrossOrderRejectedReturnBitfield3Field crossOrderRejectedReturnBitfield3 = new CrossOrderRejectedReturnBitfield3Field();

    /**
     * BitSet CrossOrderRejected byte 4.
     */
    private final CrossOrderRejectedReturnBitfield4Field crossOrderRejectedReturnBitfield4 = new CrossOrderRejectedReturnBitfield4Field();

    /**
     * BitSet CrossOrderRejected byte 5.
     */
    private final CrossOrderRejectedReturnBitfield5Field crossOrderRejectedReturnBitfield5 = new CrossOrderRejectedReturnBitfield5Field();

    /**
     * BitSet CrossOrderRejected byte 6.
     */
    private final CrossOrderRejectedReturnBitfield6Field crossOrderRejectedReturnBitfield6 = new CrossOrderRejectedReturnBitfield6Field();

    /**
     * BitSet CrossOrderRejected byte 7.
     */
    private final CrossOrderRejectedReturnBitfield7Field crossOrderRejectedReturnBitfield7 = new CrossOrderRejectedReturnBitfield7Field();

    /**
     * BitSet CrossOrderRejected byte 8.
     */
    private final CrossOrderRejectedReturnBitfield8Field crossOrderRejectedReturnBitfield8 = new CrossOrderRejectedReturnBitfield8Field();

    /**
     * BitSet CrossOrderRejected byte 9.
     */
    private final CrossOrderRejectedReturnBitfield9Field crossOrderRejectedReturnBitfield9 = new CrossOrderRejectedReturnBitfield9Field();

    /**
     * BitSet CrossOrderRejected byte 10.
     */
    private final CrossOrderRejectedReturnBitfield10Field crossOrderRejectedReturnBitfield10 = new CrossOrderRejectedReturnBitfield10Field();

    /**
     * BitSet CrossOrderRejected byte 11.
     */
    private final CrossOrderRejectedReturnBitfield11Field crossOrderRejectedReturnBitfield11 = new CrossOrderRejectedReturnBitfield11Field();

    /**
     * BitSet CrossOrderRejected byte 12.
     */
    private final CrossOrderRejectedReturnBitfield12Field crossOrderRejectedReturnBitfield12 = new CrossOrderRejectedReturnBitfield12Field();

    /**
     * BitSet CrossOrderRejected byte 13.
     */
    private final CrossOrderRejectedReturnBitfield13Field crossOrderRejectedReturnBitfield13 = new CrossOrderRejectedReturnBitfield13Field();

    /**
     * BitSet CrossOrderRejected byte 14.
     */
    private final CrossOrderRejectedReturnBitfield14Field crossOrderRejectedReturnBitfield14 = new CrossOrderRejectedReturnBitfield14Field();

    /**
     * BitSet CrossOrderRejected byte 15.
     */
    private final CrossOrderRejectedReturnBitfield15Field crossOrderRejectedReturnBitfield15 = new CrossOrderRejectedReturnBitfield15Field();

    /**
     * BitSet CrossOrderRejected byte 16.
     */
    private final CrossOrderRejectedReturnBitfield16Field crossOrderRejectedReturnBitfield16 = new CrossOrderRejectedReturnBitfield16Field();

    /**
     * BitSet CrossOrderRejected byte 17.
     */
    private final CrossOrderRejectedReturnBitfield17Field crossOrderRejectedReturnBitfield17 = new CrossOrderRejectedReturnBitfield17Field();

    /**
     * BitSet CrossOrderRejected byte 18.
     */
    private final CrossOrderRejectedReturnBitfield18Field crossOrderRejectedReturnBitfield18 = new CrossOrderRejectedReturnBitfield18Field();

    /**
     * BitSet CrossOrderRejected byte 19.
     */
    private final CrossOrderRejectedReturnBitfield19Field crossOrderRejectedReturnBitfield19 = new CrossOrderRejectedReturnBitfield19Field();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Symbol Alphanumeric
     */
    private final SymbolAlphanumericField2 symbolAlphanumeric = new SymbolAlphanumericField2();

    /**
     * Id Source
     */
    private final IdSourceField idSource = new IdSourceField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 con- tracts.
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Prevent Match
     */
    private final PreventMatchField preventMatch = new PreventMatchField();

    /**
     * Ext Exec Inst
     */
    private final ExtExecInstField extExecInst = new ExtExecInstField();

    /**
     * Corresponds to CrossType (549) in Cboe FIX. Type of auction order being submitted. This indicates the type of auction that will be initiated upon order entry. 1 = Automated Improvement Mechanism (AIM)
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * Corresponds to CrossPrioritization (550) in Cboe FIX. Indicates which side of the cross order will be pri- oritized for execution. This identifies the Agency side. 1 = Buy 2 = Sell
     */
    private final CrossPrioritizationField crossPrioritization = new CrossPrioritizationField();

    /**
     * Subreason
     */
    private final SubreasonField subreason = new SubreasonField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, crossId, orderRejectReason, text, numberOfReturnBitfields, crossOrderRejectedReturnBitfield1, crossOrderRejectedReturnBitfield2, crossOrderRejectedReturnBitfield3, crossOrderRejectedReturnBitfield4, crossOrderRejectedReturnBitfield5, crossOrderRejectedReturnBitfield6, crossOrderRejectedReturnBitfield7, crossOrderRejectedReturnBitfield8, crossOrderRejectedReturnBitfield9, crossOrderRejectedReturnBitfield10, crossOrderRejectedReturnBitfield11, crossOrderRejectedReturnBitfield12, crossOrderRejectedReturnBitfield13, crossOrderRejectedReturnBitfield14, crossOrderRejectedReturnBitfield15, crossOrderRejectedReturnBitfield16, crossOrderRejectedReturnBitfield17, crossOrderRejectedReturnBitfield18, crossOrderRejectedReturnBitfield19, price, symbolAlphanumeric, idSource, securityId, orderQty, preventMatch, extExecInst, crossType, crossPrioritization, subreason);

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
     * Corresponds to CrossID (548) in Cboe FIX. Day-unique identifier for the cross order chosen by the client. Characters in the ASCII range 33– 126 are allowed, except for comma, semicolon, and pipe.
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
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
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfReturnBitfields field
     */
    public NumberOfReturnBitfieldsField numberOfReturnBitfields() {
        return numberOfReturnBitfields;
    }

    /**
     * BitSet CrossOrderRejected byte 1.
     *
     * @return the CrossOrderRejectedReturnBitfield1 field
     */
    public CrossOrderRejectedReturnBitfield1Field crossOrderRejectedReturnBitfield1() {
        return crossOrderRejectedReturnBitfield1;
    }

    /**
     * BitSet CrossOrderRejected byte 2.
     *
     * @return the CrossOrderRejectedReturnBitfield2 field
     */
    public CrossOrderRejectedReturnBitfield2Field crossOrderRejectedReturnBitfield2() {
        return crossOrderRejectedReturnBitfield2;
    }

    /**
     * BitSet CrossOrderRejected byte 3.
     *
     * @return the CrossOrderRejectedReturnBitfield3 field
     */
    public CrossOrderRejectedReturnBitfield3Field crossOrderRejectedReturnBitfield3() {
        return crossOrderRejectedReturnBitfield3;
    }

    /**
     * BitSet CrossOrderRejected byte 4.
     *
     * @return the CrossOrderRejectedReturnBitfield4 field
     */
    public CrossOrderRejectedReturnBitfield4Field crossOrderRejectedReturnBitfield4() {
        return crossOrderRejectedReturnBitfield4;
    }

    /**
     * BitSet CrossOrderRejected byte 5.
     *
     * @return the CrossOrderRejectedReturnBitfield5 field
     */
    public CrossOrderRejectedReturnBitfield5Field crossOrderRejectedReturnBitfield5() {
        return crossOrderRejectedReturnBitfield5;
    }

    /**
     * BitSet CrossOrderRejected byte 6.
     *
     * @return the CrossOrderRejectedReturnBitfield6 field
     */
    public CrossOrderRejectedReturnBitfield6Field crossOrderRejectedReturnBitfield6() {
        return crossOrderRejectedReturnBitfield6;
    }

    /**
     * BitSet CrossOrderRejected byte 7.
     *
     * @return the CrossOrderRejectedReturnBitfield7 field
     */
    public CrossOrderRejectedReturnBitfield7Field crossOrderRejectedReturnBitfield7() {
        return crossOrderRejectedReturnBitfield7;
    }

    /**
     * BitSet CrossOrderRejected byte 8.
     *
     * @return the CrossOrderRejectedReturnBitfield8 field
     */
    public CrossOrderRejectedReturnBitfield8Field crossOrderRejectedReturnBitfield8() {
        return crossOrderRejectedReturnBitfield8;
    }

    /**
     * BitSet CrossOrderRejected byte 9.
     *
     * @return the CrossOrderRejectedReturnBitfield9 field
     */
    public CrossOrderRejectedReturnBitfield9Field crossOrderRejectedReturnBitfield9() {
        return crossOrderRejectedReturnBitfield9;
    }

    /**
     * BitSet CrossOrderRejected byte 10.
     *
     * @return the CrossOrderRejectedReturnBitfield10 field
     */
    public CrossOrderRejectedReturnBitfield10Field crossOrderRejectedReturnBitfield10() {
        return crossOrderRejectedReturnBitfield10;
    }

    /**
     * BitSet CrossOrderRejected byte 11.
     *
     * @return the CrossOrderRejectedReturnBitfield11 field
     */
    public CrossOrderRejectedReturnBitfield11Field crossOrderRejectedReturnBitfield11() {
        return crossOrderRejectedReturnBitfield11;
    }

    /**
     * BitSet CrossOrderRejected byte 12.
     *
     * @return the CrossOrderRejectedReturnBitfield12 field
     */
    public CrossOrderRejectedReturnBitfield12Field crossOrderRejectedReturnBitfield12() {
        return crossOrderRejectedReturnBitfield12;
    }

    /**
     * BitSet CrossOrderRejected byte 13.
     *
     * @return the CrossOrderRejectedReturnBitfield13 field
     */
    public CrossOrderRejectedReturnBitfield13Field crossOrderRejectedReturnBitfield13() {
        return crossOrderRejectedReturnBitfield13;
    }

    /**
     * BitSet CrossOrderRejected byte 14.
     *
     * @return the CrossOrderRejectedReturnBitfield14 field
     */
    public CrossOrderRejectedReturnBitfield14Field crossOrderRejectedReturnBitfield14() {
        return crossOrderRejectedReturnBitfield14;
    }

    /**
     * BitSet CrossOrderRejected byte 15.
     *
     * @return the CrossOrderRejectedReturnBitfield15 field
     */
    public CrossOrderRejectedReturnBitfield15Field crossOrderRejectedReturnBitfield15() {
        return crossOrderRejectedReturnBitfield15;
    }

    /**
     * BitSet CrossOrderRejected byte 16.
     *
     * @return the CrossOrderRejectedReturnBitfield16 field
     */
    public CrossOrderRejectedReturnBitfield16Field crossOrderRejectedReturnBitfield16() {
        return crossOrderRejectedReturnBitfield16;
    }

    /**
     * BitSet CrossOrderRejected byte 17.
     *
     * @return the CrossOrderRejectedReturnBitfield17 field
     */
    public CrossOrderRejectedReturnBitfield17Field crossOrderRejectedReturnBitfield17() {
        return crossOrderRejectedReturnBitfield17;
    }

    /**
     * BitSet CrossOrderRejected byte 18.
     *
     * @return the CrossOrderRejectedReturnBitfield18 field
     */
    public CrossOrderRejectedReturnBitfield18Field crossOrderRejectedReturnBitfield18() {
        return crossOrderRejectedReturnBitfield18;
    }

    /**
     * BitSet CrossOrderRejected byte 19.
     *
     * @return the CrossOrderRejectedReturnBitfield19 field
     */
    public CrossOrderRejectedReturnBitfield19Field crossOrderRejectedReturnBitfield19() {
        return crossOrderRejectedReturnBitfield19;
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
     * Symbol Alphanumeric
     *
     * @return the SymbolAlphanumeric field
     */
    public SymbolAlphanumericField2 symbolAlphanumeric() {
        return symbolAlphanumeric;
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
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 con- tracts.
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
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
     * Ext Exec Inst
     *
     * @return the ExtExecInst field
     */
    public ExtExecInstField extExecInst() {
        return extExecInst;
    }

    /**
     * Corresponds to CrossType (549) in Cboe FIX. Type of auction order being submitted. This indicates the type of auction that will be initiated upon order entry. 1 = Automated Improvement Mechanism (AIM)
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * Corresponds to CrossPrioritization (550) in Cboe FIX. Indicates which side of the cross order will be pri- oritized for execution. This identifies the Agency side. 1 = Buy 2 = Sell
     *
     * @return the CrossPrioritization field
     */
    public CrossPrioritizationField crossPrioritization() {
        return crossPrioritization;
    }

    /**
     * Subreason
     *
     * @return the Subreason field
     */
    public SubreasonField subreason() {
        return subreason;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield1 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield2 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield3 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield4 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield5 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield6 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield7 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield8 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield9 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield10 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield11 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield12 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield13 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield14 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield15 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield16 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield17 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield18 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the CrossOrderRejectedReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the CrossOrderRejectedReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderRejectedReturnBitfield19 is on the wire
     */
    public boolean crossOrderRejectedReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (crossOrderRejectedReturnBitfield1Present() && crossOrderRejectedReturnBitfield1.crossOrderRejectedReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (crossOrderRejectedReturnBitfield2Present() && crossOrderRejectedReturnBitfield2.crossOrderRejectedReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (crossOrderRejectedReturnBitfield2Present() && crossOrderRejectedReturnBitfield2.crossOrderRejectedReturnBitfield2IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (crossOrderRejectedReturnBitfield2Present() && crossOrderRejectedReturnBitfield2.crossOrderRejectedReturnBitfield2SecurityId());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (crossOrderRejectedReturnBitfield3Present() && crossOrderRejectedReturnBitfield3.crossOrderRejectedReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (crossOrderRejectedReturnBitfield3Present() && crossOrderRejectedReturnBitfield3.crossOrderRejectedReturnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the ExtExecInst put it on the wire.
     *
     * <p>Decode reads the ExtExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExtExecInst is on the wire
     */
    public boolean extExecInstPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (crossOrderRejectedReturnBitfield6Present() && crossOrderRejectedReturnBitfield6.crossOrderRejectedReturnBitfield6ExtExecInst());
    }

    /**
     * Returns whether the fields before the CrossType put it on the wire.
     *
     * <p>Decode reads the CrossType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossType is on the wire
     */
    public boolean crossTypePresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (crossOrderRejectedReturnBitfield9Present() && crossOrderRejectedReturnBitfield9.crossOrderRejectedReturnBitfield9CrossType());
    }

    /**
     * Returns whether the fields before the CrossPrioritization put it on the wire.
     *
     * <p>Decode reads the CrossPrioritization where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossPrioritization is on the wire
     */
    public boolean crossPrioritizationPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (crossOrderRejectedReturnBitfield9Present() && crossOrderRejectedReturnBitfield9.crossOrderRejectedReturnBitfield9CrossPrioritization());
    }

    /**
     * Returns whether the fields before the Subreason put it on the wire.
     *
     * <p>Decode reads the Subreason where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Subreason is on the wire
     */
    public boolean subreasonPresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (crossOrderRejectedReturnBitfield18Present() && crossOrderRejectedReturnBitfield18.crossOrderRejectedReturnBitfield18Subreason());
    }

    private boolean onWire(Field field) {
        return (field != crossOrderRejectedReturnBitfield1 || crossOrderRejectedReturnBitfield1Present()) && (field != crossOrderRejectedReturnBitfield2 || crossOrderRejectedReturnBitfield2Present()) && (field != crossOrderRejectedReturnBitfield3 || crossOrderRejectedReturnBitfield3Present()) && (field != crossOrderRejectedReturnBitfield4 || crossOrderRejectedReturnBitfield4Present()) && (field != crossOrderRejectedReturnBitfield5 || crossOrderRejectedReturnBitfield5Present()) && (field != crossOrderRejectedReturnBitfield6 || crossOrderRejectedReturnBitfield6Present()) && (field != crossOrderRejectedReturnBitfield7 || crossOrderRejectedReturnBitfield7Present()) && (field != crossOrderRejectedReturnBitfield8 || crossOrderRejectedReturnBitfield8Present()) && (field != crossOrderRejectedReturnBitfield9 || crossOrderRejectedReturnBitfield9Present()) && (field != crossOrderRejectedReturnBitfield10 || crossOrderRejectedReturnBitfield10Present()) && (field != crossOrderRejectedReturnBitfield11 || crossOrderRejectedReturnBitfield11Present()) && (field != crossOrderRejectedReturnBitfield12 || crossOrderRejectedReturnBitfield12Present()) && (field != crossOrderRejectedReturnBitfield13 || crossOrderRejectedReturnBitfield13Present()) && (field != crossOrderRejectedReturnBitfield14 || crossOrderRejectedReturnBitfield14Present()) && (field != crossOrderRejectedReturnBitfield15 || crossOrderRejectedReturnBitfield15Present()) && (field != crossOrderRejectedReturnBitfield16 || crossOrderRejectedReturnBitfield16Present()) && (field != crossOrderRejectedReturnBitfield17 || crossOrderRejectedReturnBitfield17Present()) && (field != crossOrderRejectedReturnBitfield18 || crossOrderRejectedReturnBitfield18Present()) && (field != crossOrderRejectedReturnBitfield19 || crossOrderRejectedReturnBitfield19Present()) && (field != price || pricePresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != extExecInst || extExecInstPresent()) && (field != crossType || crossTypePresent()) && (field != crossPrioritization || crossPrioritizationPresent()) && (field != subreason || subreasonPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (crossOrderRejectedReturnBitfield1Present() ? CrossOrderRejectedReturnBitfield1Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield2Present() ? CrossOrderRejectedReturnBitfield2Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield3Present() ? CrossOrderRejectedReturnBitfield3Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield4Present() ? CrossOrderRejectedReturnBitfield4Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield5Present() ? CrossOrderRejectedReturnBitfield5Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield6Present() ? CrossOrderRejectedReturnBitfield6Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield7Present() ? CrossOrderRejectedReturnBitfield7Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield8Present() ? CrossOrderRejectedReturnBitfield8Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield9Present() ? CrossOrderRejectedReturnBitfield9Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield10Present() ? CrossOrderRejectedReturnBitfield10Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield11Present() ? CrossOrderRejectedReturnBitfield11Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield12Present() ? CrossOrderRejectedReturnBitfield12Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield13Present() ? CrossOrderRejectedReturnBitfield13Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield14Present() ? CrossOrderRejectedReturnBitfield14Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield15Present() ? CrossOrderRejectedReturnBitfield15Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield16Present() ? CrossOrderRejectedReturnBitfield16Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield17Present() ? CrossOrderRejectedReturnBitfield17Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield18Present() ? CrossOrderRejectedReturnBitfield18Field.BYTE_LENGTH : 0) + (crossOrderRejectedReturnBitfield19Present() ? CrossOrderRejectedReturnBitfield19Field.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField2.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (extExecInstPresent() ? ExtExecInstField.BYTE_LENGTH : 0) + (crossTypePresent() ? CrossTypeField.BYTE_LENGTH : 0) + (crossPrioritizationPresent() ? CrossPrioritizationField.BYTE_LENGTH : 0) + (subreasonPresent() ? SubreasonField.BYTE_LENGTH : 0);
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
        if (crossOrderRejectedReturnBitfield1Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield2Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield3Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield4Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield5Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield6Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield7Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield8Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield9Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield10Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield11Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield12Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield13Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield14Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield15Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield16Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield17Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield18Present()) {
            cursor += 1;
        }
        if (crossOrderRejectedReturnBitfield19Present()) {
            cursor += 1;
        }
        if (pricePresent()) {
            cursor += 8;
        }
        if (symbolAlphanumericPresent()) {
            cursor += 8;
        }
        if (idSourcePresent()) {
            cursor += 1;
        }
        if (securityIdPresent()) {
            cursor += 16;
        }
        if (orderQtyPresent()) {
            cursor += 4;
        }
        if (preventMatchPresent()) {
            cursor += 3;
        }
        if (extExecInstPresent()) {
            cursor += 1;
        }
        if (crossTypePresent()) {
            cursor += 1;
        }
        if (crossPrioritizationPresent()) {
            cursor += 1;
        }
        if (subreasonPresent()) {
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
        if (!crossId.parse(data, cursor)) {
            return false;
        }
        cursor += CrossIdField.BYTE_LENGTH;
        if (!orderRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += OrderRejectReasonField.BYTE_LENGTH;
        if (!text.parse(data, cursor)) {
            return false;
        }
        cursor += TextField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (crossOrderRejectedReturnBitfield1Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield1Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield2Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield2Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield3Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield3Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield4Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield4Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield5Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield5Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield6Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield6Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield7Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield7Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield8Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield8Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield9Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield9Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield10Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield10Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield11Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield11Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield12Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield12Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield13Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield13Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield14Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield14Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield15Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield15Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield16Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield16Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield17Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield17Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield18Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield18Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOrderRejectedReturnBitfield19Present()) {
            if (end - cursor < CrossOrderRejectedReturnBitfield19Field.BYTE_LENGTH || !crossOrderRejectedReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderRejectedReturnBitfield19Field.BYTE_LENGTH;
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
        if (symbolAlphanumericPresent()) {
            if (end - cursor < SymbolAlphanumericField2.BYTE_LENGTH || !symbolAlphanumeric.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolAlphanumericField2.BYTE_LENGTH;
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
        if (orderQtyPresent()) {
            if (end - cursor < OrderQtyField.BYTE_LENGTH || !orderQty.parse(data, cursor)) {
                return false;
            }
            cursor += OrderQtyField.BYTE_LENGTH;
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
        if (extExecInstPresent()) {
            if (end - cursor < ExtExecInstField.BYTE_LENGTH || !extExecInst.parse(data, cursor)) {
                return false;
            }
            cursor += ExtExecInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossTypePresent()) {
            if (end - cursor < CrossTypeField.BYTE_LENGTH || !crossType.parse(data, cursor)) {
                return false;
            }
            cursor += CrossTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossPrioritizationPresent()) {
            if (end - cursor < CrossPrioritizationField.BYTE_LENGTH || !crossPrioritization.parse(data, cursor)) {
                return false;
            }
            cursor += CrossPrioritizationField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (subreasonPresent()) {
            if (end - cursor < SubreasonField.BYTE_LENGTH || !subreason.parse(data, cursor)) {
                return false;
            }
            cursor += SubreasonField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (crossOrderRejectedReturnBitfield1Present() != crossOrderRejectedReturnBitfield1.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield1.hasValue() ? "crossOrderRejectedReturnBitfield1 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield2Present() != crossOrderRejectedReturnBitfield2.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield2.hasValue() ? "crossOrderRejectedReturnBitfield2 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield3Present() != crossOrderRejectedReturnBitfield3.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield3.hasValue() ? "crossOrderRejectedReturnBitfield3 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield4Present() != crossOrderRejectedReturnBitfield4.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield4.hasValue() ? "crossOrderRejectedReturnBitfield4 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield5Present() != crossOrderRejectedReturnBitfield5.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield5.hasValue() ? "crossOrderRejectedReturnBitfield5 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield6Present() != crossOrderRejectedReturnBitfield6.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield6.hasValue() ? "crossOrderRejectedReturnBitfield6 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield7Present() != crossOrderRejectedReturnBitfield7.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield7.hasValue() ? "crossOrderRejectedReturnBitfield7 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield8Present() != crossOrderRejectedReturnBitfield8.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield8.hasValue() ? "crossOrderRejectedReturnBitfield8 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield9Present() != crossOrderRejectedReturnBitfield9.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield9.hasValue() ? "crossOrderRejectedReturnBitfield9 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield10Present() != crossOrderRejectedReturnBitfield10.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield10.hasValue() ? "crossOrderRejectedReturnBitfield10 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield11Present() != crossOrderRejectedReturnBitfield11.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield11.hasValue() ? "crossOrderRejectedReturnBitfield11 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield12Present() != crossOrderRejectedReturnBitfield12.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield12.hasValue() ? "crossOrderRejectedReturnBitfield12 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield13Present() != crossOrderRejectedReturnBitfield13.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield13.hasValue() ? "crossOrderRejectedReturnBitfield13 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield14Present() != crossOrderRejectedReturnBitfield14.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield14.hasValue() ? "crossOrderRejectedReturnBitfield14 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield15Present() != crossOrderRejectedReturnBitfield15.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield15.hasValue() ? "crossOrderRejectedReturnBitfield15 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield16Present() != crossOrderRejectedReturnBitfield16.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield16.hasValue() ? "crossOrderRejectedReturnBitfield16 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield17Present() != crossOrderRejectedReturnBitfield17.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield17.hasValue() ? "crossOrderRejectedReturnBitfield17 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield18Present() != crossOrderRejectedReturnBitfield18.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield18.hasValue() ? "crossOrderRejectedReturnBitfield18 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderRejectedReturnBitfield19Present() != crossOrderRejectedReturnBitfield19.hasValue()) {
            throw new IllegalStateException(crossOrderRejectedReturnBitfield19.hasValue() ? "crossOrderRejectedReturnBitfield19 holds a value the fields before it leave off the wire" : "crossOrderRejectedReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (pricePresent() != price.hasValue()) {
            throw new IllegalStateException(price.hasValue() ? "price holds a value the fields before it leave off the wire" : "price holds no value, though the fields before it put it on the wire");
        }
        if (symbolAlphanumericPresent() != symbolAlphanumeric.hasValue()) {
            throw new IllegalStateException(symbolAlphanumeric.hasValue() ? "symbolAlphanumeric holds a value the fields before it leave off the wire" : "symbolAlphanumeric holds no value, though the fields before it put it on the wire");
        }
        if (idSourcePresent() != idSource.hasValue()) {
            throw new IllegalStateException(idSource.hasValue() ? "idSource holds a value the fields before it leave off the wire" : "idSource holds no value, though the fields before it put it on the wire");
        }
        if (securityIdPresent() != securityId.hasValue()) {
            throw new IllegalStateException(securityId.hasValue() ? "securityId holds a value the fields before it leave off the wire" : "securityId holds no value, though the fields before it put it on the wire");
        }
        if (orderQtyPresent() != orderQty.hasValue()) {
            throw new IllegalStateException(orderQty.hasValue() ? "orderQty holds a value the fields before it leave off the wire" : "orderQty holds no value, though the fields before it put it on the wire");
        }
        if (preventMatchPresent() != preventMatch.hasValue()) {
            throw new IllegalStateException(preventMatch.hasValue() ? "preventMatch holds a value the fields before it leave off the wire" : "preventMatch holds no value, though the fields before it put it on the wire");
        }
        if (extExecInstPresent() != extExecInst.hasValue()) {
            throw new IllegalStateException(extExecInst.hasValue() ? "extExecInst holds a value the fields before it leave off the wire" : "extExecInst holds no value, though the fields before it put it on the wire");
        }
        if (crossTypePresent() != crossType.hasValue()) {
            throw new IllegalStateException(crossType.hasValue() ? "crossType holds a value the fields before it leave off the wire" : "crossType holds no value, though the fields before it put it on the wire");
        }
        if (crossPrioritizationPresent() != crossPrioritization.hasValue()) {
            throw new IllegalStateException(crossPrioritization.hasValue() ? "crossPrioritization holds a value the fields before it leave off the wire" : "crossPrioritization holds no value, though the fields before it put it on the wire");
        }
        if (subreasonPresent() != subreason.hasValue()) {
            throw new IllegalStateException(subreason.hasValue() ? "subreason holds a value the fields before it leave off the wire" : "subreason holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = crossId.encode(data, cursor);
        cursor = orderRejectReason.encode(data, cursor);
        cursor = text.encode(data, cursor);
        if (buffer != null && buffer.length >= 90) {
            System.arraycopy(buffer, 89, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (crossOrderRejectedReturnBitfield1Present()) {
            cursor = crossOrderRejectedReturnBitfield1.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield2Present()) {
            cursor = crossOrderRejectedReturnBitfield2.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield3Present()) {
            cursor = crossOrderRejectedReturnBitfield3.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield4Present()) {
            cursor = crossOrderRejectedReturnBitfield4.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield5Present()) {
            cursor = crossOrderRejectedReturnBitfield5.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield6Present()) {
            cursor = crossOrderRejectedReturnBitfield6.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield7Present()) {
            cursor = crossOrderRejectedReturnBitfield7.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield8Present()) {
            cursor = crossOrderRejectedReturnBitfield8.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield9Present()) {
            cursor = crossOrderRejectedReturnBitfield9.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield10Present()) {
            cursor = crossOrderRejectedReturnBitfield10.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield11Present()) {
            cursor = crossOrderRejectedReturnBitfield11.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield12Present()) {
            cursor = crossOrderRejectedReturnBitfield12.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield13Present()) {
            cursor = crossOrderRejectedReturnBitfield13.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield14Present()) {
            cursor = crossOrderRejectedReturnBitfield14.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield15Present()) {
            cursor = crossOrderRejectedReturnBitfield15.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield16Present()) {
            cursor = crossOrderRejectedReturnBitfield16.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield17Present()) {
            cursor = crossOrderRejectedReturnBitfield17.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield18Present()) {
            cursor = crossOrderRejectedReturnBitfield18.encode(data, cursor);
        }
        if (crossOrderRejectedReturnBitfield19Present()) {
            cursor = crossOrderRejectedReturnBitfield19.encode(data, cursor);
        }
        if (pricePresent()) {
            cursor = price.encode(data, cursor);
        }
        if (symbolAlphanumericPresent()) {
            cursor = symbolAlphanumeric.encode(data, cursor);
        }
        if (idSourcePresent()) {
            cursor = idSource.encode(data, cursor);
        }
        if (securityIdPresent()) {
            cursor = securityId.encode(data, cursor);
        }
        if (orderQtyPresent()) {
            cursor = orderQty.encode(data, cursor);
        }
        if (preventMatchPresent()) {
            cursor = preventMatch.encode(data, cursor);
        }
        if (extExecInstPresent()) {
            cursor = extExecInst.encode(data, cursor);
        }
        if (crossTypePresent()) {
            cursor = crossType.encode(data, cursor);
        }
        if (crossPrioritizationPresent()) {
            cursor = crossPrioritization.encode(data, cursor);
        }
        if (subreasonPresent()) {
            cursor = subreason.encode(data, cursor);
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
            case "CrossId" -> Optional.of(crossId);
            case "OrderRejectReason" -> Optional.of(orderRejectReason);
            case "Text" -> Optional.of(text);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "CrossOrderRejectedReturnBitfield1" -> Optional.of(crossOrderRejectedReturnBitfield1);
            case "CrossOrderRejectedReturnBitfield2" -> Optional.of(crossOrderRejectedReturnBitfield2);
            case "CrossOrderRejectedReturnBitfield3" -> Optional.of(crossOrderRejectedReturnBitfield3);
            case "CrossOrderRejectedReturnBitfield4" -> Optional.of(crossOrderRejectedReturnBitfield4);
            case "CrossOrderRejectedReturnBitfield5" -> Optional.of(crossOrderRejectedReturnBitfield5);
            case "CrossOrderRejectedReturnBitfield6" -> Optional.of(crossOrderRejectedReturnBitfield6);
            case "CrossOrderRejectedReturnBitfield7" -> Optional.of(crossOrderRejectedReturnBitfield7);
            case "CrossOrderRejectedReturnBitfield8" -> Optional.of(crossOrderRejectedReturnBitfield8);
            case "CrossOrderRejectedReturnBitfield9" -> Optional.of(crossOrderRejectedReturnBitfield9);
            case "CrossOrderRejectedReturnBitfield10" -> Optional.of(crossOrderRejectedReturnBitfield10);
            case "CrossOrderRejectedReturnBitfield11" -> Optional.of(crossOrderRejectedReturnBitfield11);
            case "CrossOrderRejectedReturnBitfield12" -> Optional.of(crossOrderRejectedReturnBitfield12);
            case "CrossOrderRejectedReturnBitfield13" -> Optional.of(crossOrderRejectedReturnBitfield13);
            case "CrossOrderRejectedReturnBitfield14" -> Optional.of(crossOrderRejectedReturnBitfield14);
            case "CrossOrderRejectedReturnBitfield15" -> Optional.of(crossOrderRejectedReturnBitfield15);
            case "CrossOrderRejectedReturnBitfield16" -> Optional.of(crossOrderRejectedReturnBitfield16);
            case "CrossOrderRejectedReturnBitfield17" -> Optional.of(crossOrderRejectedReturnBitfield17);
            case "CrossOrderRejectedReturnBitfield18" -> Optional.of(crossOrderRejectedReturnBitfield18);
            case "CrossOrderRejectedReturnBitfield19" -> Optional.of(crossOrderRejectedReturnBitfield19);
            case "Price" -> Optional.of(price);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "IdSource" -> Optional.of(idSource);
            case "SecurityId" -> Optional.of(securityId);
            case "OrderQty" -> Optional.of(orderQty);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "ExtExecInst" -> Optional.of(extExecInst);
            case "CrossType" -> Optional.of(crossType);
            case "CrossPrioritization" -> Optional.of(crossPrioritization);
            case "Subreason" -> Optional.of(subreason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CrossOrderRejectedMessage message)) {
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
        if (!(other instanceof CrossOrderRejectedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
