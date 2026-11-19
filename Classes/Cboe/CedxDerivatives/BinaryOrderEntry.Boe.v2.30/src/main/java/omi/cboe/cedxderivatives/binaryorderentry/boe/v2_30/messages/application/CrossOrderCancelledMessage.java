package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.AuctionIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CancelReasonField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield10Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield11Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield12Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield13Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield14Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield15Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield16Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield17Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield18Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield19Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield1Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield2Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield3Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield4Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield5Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield6Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield7Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield8Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossOrderCancelledReturnBitfield9Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossPrioritizationField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CrossTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ExtExecInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.GroupCntField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.IdSourceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.LiquidityProvisionField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderQtyField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.PreventMatchField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.PriceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.SecurityIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.SymbolAlphanumericField2;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TransactionTimeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.groups.CrossOrderCancelledOrderAllocationsEntry;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.groups.CrossOrderCancelledOrderAllocationsList;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.PrintOptions;

/**
 * Represents the CrossOrderCancelledMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Cross Order Cancelled Message.</p>
 */
public final class CrossOrderCancelledMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 33;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Cross Order Cancelled Message";

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to CrossID (548) in Cboe FIX. Day-unique identifier for the cross order chosen by the client. Characters in the ASCII range 33– 126 are allowed, except for comma, semicolon, and pipe.
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * Reason for the order cancellation. See Reason Codes (§ 7.1, p. 196) for a list of possible reasons.
     */
    private final CancelReasonField cancelReason = new CancelReasonField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet CrossOrderCancelled byte 1.
     */
    private final CrossOrderCancelledReturnBitfield1Field crossOrderCancelledReturnBitfield1 = new CrossOrderCancelledReturnBitfield1Field();

    /**
     * BitSet CrossOrderCancelled byte 2.
     */
    private final CrossOrderCancelledReturnBitfield2Field crossOrderCancelledReturnBitfield2 = new CrossOrderCancelledReturnBitfield2Field();

    /**
     * BitSet CrossOrderCancelled byte 3.
     */
    private final CrossOrderCancelledReturnBitfield3Field crossOrderCancelledReturnBitfield3 = new CrossOrderCancelledReturnBitfield3Field();

    /**
     * BitSet CrossOrderCancelled byte 4.
     */
    private final CrossOrderCancelledReturnBitfield4Field crossOrderCancelledReturnBitfield4 = new CrossOrderCancelledReturnBitfield4Field();

    /**
     * BitSet CrossOrderCancelled byte 5.
     */
    private final CrossOrderCancelledReturnBitfield5Field crossOrderCancelledReturnBitfield5 = new CrossOrderCancelledReturnBitfield5Field();

    /**
     * BitSet CrossOrderCancelled byte 6.
     */
    private final CrossOrderCancelledReturnBitfield6Field crossOrderCancelledReturnBitfield6 = new CrossOrderCancelledReturnBitfield6Field();

    /**
     * BitSet CrossOrderCancelled byte 7.
     */
    private final CrossOrderCancelledReturnBitfield7Field crossOrderCancelledReturnBitfield7 = new CrossOrderCancelledReturnBitfield7Field();

    /**
     * BitSet CrossOrderCancelled byte 8.
     */
    private final CrossOrderCancelledReturnBitfield8Field crossOrderCancelledReturnBitfield8 = new CrossOrderCancelledReturnBitfield8Field();

    /**
     * BitSet CrossOrderCancelled byte 9.
     */
    private final CrossOrderCancelledReturnBitfield9Field crossOrderCancelledReturnBitfield9 = new CrossOrderCancelledReturnBitfield9Field();

    /**
     * BitSet CrossOrderCancelled byte 10.
     */
    private final CrossOrderCancelledReturnBitfield10Field crossOrderCancelledReturnBitfield10 = new CrossOrderCancelledReturnBitfield10Field();

    /**
     * BitSet CrossOrderCancelled byte 11.
     */
    private final CrossOrderCancelledReturnBitfield11Field crossOrderCancelledReturnBitfield11 = new CrossOrderCancelledReturnBitfield11Field();

    /**
     * BitSet CrossOrderCancelled byte 12.
     */
    private final CrossOrderCancelledReturnBitfield12Field crossOrderCancelledReturnBitfield12 = new CrossOrderCancelledReturnBitfield12Field();

    /**
     * BitSet CrossOrderCancelled byte 13.
     */
    private final CrossOrderCancelledReturnBitfield13Field crossOrderCancelledReturnBitfield13 = new CrossOrderCancelledReturnBitfield13Field();

    /**
     * BitSet CrossOrderCancelled byte 14.
     */
    private final CrossOrderCancelledReturnBitfield14Field crossOrderCancelledReturnBitfield14 = new CrossOrderCancelledReturnBitfield14Field();

    /**
     * BitSet CrossOrderCancelled byte 15.
     */
    private final CrossOrderCancelledReturnBitfield15Field crossOrderCancelledReturnBitfield15 = new CrossOrderCancelledReturnBitfield15Field();

    /**
     * BitSet CrossOrderCancelled byte 16.
     */
    private final CrossOrderCancelledReturnBitfield16Field crossOrderCancelledReturnBitfield16 = new CrossOrderCancelledReturnBitfield16Field();

    /**
     * BitSet CrossOrderCancelled byte 17.
     */
    private final CrossOrderCancelledReturnBitfield17Field crossOrderCancelledReturnBitfield17 = new CrossOrderCancelledReturnBitfield17Field();

    /**
     * BitSet CrossOrderCancelled byte 18.
     */
    private final CrossOrderCancelledReturnBitfield18Field crossOrderCancelledReturnBitfield18 = new CrossOrderCancelledReturnBitfield18Field();

    /**
     * BitSet CrossOrderCancelled byte 19.
     */
    private final CrossOrderCancelledReturnBitfield19Field crossOrderCancelledReturnBitfield19 = new CrossOrderCancelledReturnBitfield19Field();

    /**
     * Number of order allocations represented by re- peating groups included in this cross order. Must be at least 2 (One agency and one contra), and no more than 11.
     */
    private final GroupCntField groupCnt = new GroupCntField();

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
     * Auction Id
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Liquidity Provision
     */
    private final LiquidityProvisionField liquidityProvision = new LiquidityProvisionField();

    /**
     * Corresponds to CrossType (549) in Cboe FIX. Type of auction order being submitted. This indicates the type of auction that will be initiated upon order entry. 1 = Automated Improvement Mechanism (AIM)
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * Corresponds to CrossPrioritization (550) in Cboe FIX. Indicates which side of the cross order will be pri- oritized for execution. This identifies the Agency side. 1 = Buy 2 = Sell
     */
    private final CrossPrioritizationField crossPrioritization = new CrossPrioritizationField();

    /**
     * Repeating group stated GroupCnt times.
     */
    private final CrossOrderCancelledOrderAllocationsList crossOrderCancelledOrderAllocations = new CrossOrderCancelledOrderAllocationsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, crossId, cancelReason, numberOfReturnBitfields, crossOrderCancelledReturnBitfield1, crossOrderCancelledReturnBitfield2, crossOrderCancelledReturnBitfield3, crossOrderCancelledReturnBitfield4, crossOrderCancelledReturnBitfield5, crossOrderCancelledReturnBitfield6, crossOrderCancelledReturnBitfield7, crossOrderCancelledReturnBitfield8, crossOrderCancelledReturnBitfield9, crossOrderCancelledReturnBitfield10, crossOrderCancelledReturnBitfield11, crossOrderCancelledReturnBitfield12, crossOrderCancelledReturnBitfield13, crossOrderCancelledReturnBitfield14, crossOrderCancelledReturnBitfield15, crossOrderCancelledReturnBitfield16, crossOrderCancelledReturnBitfield17, crossOrderCancelledReturnBitfield18, crossOrderCancelledReturnBitfield19, groupCnt, price, symbolAlphanumeric, idSource, securityId, orderQty, preventMatch, extExecInst, auctionId, liquidityProvision, crossType, crossPrioritization);

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
     * Reason for the order cancellation. See Reason Codes (§ 7.1, p. 196) for a list of possible reasons.
     *
     * @return the CancelReason field
     */
    public CancelReasonField cancelReason() {
        return cancelReason;
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
     * BitSet CrossOrderCancelled byte 1.
     *
     * @return the CrossOrderCancelledReturnBitfield1 field
     */
    public CrossOrderCancelledReturnBitfield1Field crossOrderCancelledReturnBitfield1() {
        return crossOrderCancelledReturnBitfield1;
    }

    /**
     * BitSet CrossOrderCancelled byte 2.
     *
     * @return the CrossOrderCancelledReturnBitfield2 field
     */
    public CrossOrderCancelledReturnBitfield2Field crossOrderCancelledReturnBitfield2() {
        return crossOrderCancelledReturnBitfield2;
    }

    /**
     * BitSet CrossOrderCancelled byte 3.
     *
     * @return the CrossOrderCancelledReturnBitfield3 field
     */
    public CrossOrderCancelledReturnBitfield3Field crossOrderCancelledReturnBitfield3() {
        return crossOrderCancelledReturnBitfield3;
    }

    /**
     * BitSet CrossOrderCancelled byte 4.
     *
     * @return the CrossOrderCancelledReturnBitfield4 field
     */
    public CrossOrderCancelledReturnBitfield4Field crossOrderCancelledReturnBitfield4() {
        return crossOrderCancelledReturnBitfield4;
    }

    /**
     * BitSet CrossOrderCancelled byte 5.
     *
     * @return the CrossOrderCancelledReturnBitfield5 field
     */
    public CrossOrderCancelledReturnBitfield5Field crossOrderCancelledReturnBitfield5() {
        return crossOrderCancelledReturnBitfield5;
    }

    /**
     * BitSet CrossOrderCancelled byte 6.
     *
     * @return the CrossOrderCancelledReturnBitfield6 field
     */
    public CrossOrderCancelledReturnBitfield6Field crossOrderCancelledReturnBitfield6() {
        return crossOrderCancelledReturnBitfield6;
    }

    /**
     * BitSet CrossOrderCancelled byte 7.
     *
     * @return the CrossOrderCancelledReturnBitfield7 field
     */
    public CrossOrderCancelledReturnBitfield7Field crossOrderCancelledReturnBitfield7() {
        return crossOrderCancelledReturnBitfield7;
    }

    /**
     * BitSet CrossOrderCancelled byte 8.
     *
     * @return the CrossOrderCancelledReturnBitfield8 field
     */
    public CrossOrderCancelledReturnBitfield8Field crossOrderCancelledReturnBitfield8() {
        return crossOrderCancelledReturnBitfield8;
    }

    /**
     * BitSet CrossOrderCancelled byte 9.
     *
     * @return the CrossOrderCancelledReturnBitfield9 field
     */
    public CrossOrderCancelledReturnBitfield9Field crossOrderCancelledReturnBitfield9() {
        return crossOrderCancelledReturnBitfield9;
    }

    /**
     * BitSet CrossOrderCancelled byte 10.
     *
     * @return the CrossOrderCancelledReturnBitfield10 field
     */
    public CrossOrderCancelledReturnBitfield10Field crossOrderCancelledReturnBitfield10() {
        return crossOrderCancelledReturnBitfield10;
    }

    /**
     * BitSet CrossOrderCancelled byte 11.
     *
     * @return the CrossOrderCancelledReturnBitfield11 field
     */
    public CrossOrderCancelledReturnBitfield11Field crossOrderCancelledReturnBitfield11() {
        return crossOrderCancelledReturnBitfield11;
    }

    /**
     * BitSet CrossOrderCancelled byte 12.
     *
     * @return the CrossOrderCancelledReturnBitfield12 field
     */
    public CrossOrderCancelledReturnBitfield12Field crossOrderCancelledReturnBitfield12() {
        return crossOrderCancelledReturnBitfield12;
    }

    /**
     * BitSet CrossOrderCancelled byte 13.
     *
     * @return the CrossOrderCancelledReturnBitfield13 field
     */
    public CrossOrderCancelledReturnBitfield13Field crossOrderCancelledReturnBitfield13() {
        return crossOrderCancelledReturnBitfield13;
    }

    /**
     * BitSet CrossOrderCancelled byte 14.
     *
     * @return the CrossOrderCancelledReturnBitfield14 field
     */
    public CrossOrderCancelledReturnBitfield14Field crossOrderCancelledReturnBitfield14() {
        return crossOrderCancelledReturnBitfield14;
    }

    /**
     * BitSet CrossOrderCancelled byte 15.
     *
     * @return the CrossOrderCancelledReturnBitfield15 field
     */
    public CrossOrderCancelledReturnBitfield15Field crossOrderCancelledReturnBitfield15() {
        return crossOrderCancelledReturnBitfield15;
    }

    /**
     * BitSet CrossOrderCancelled byte 16.
     *
     * @return the CrossOrderCancelledReturnBitfield16 field
     */
    public CrossOrderCancelledReturnBitfield16Field crossOrderCancelledReturnBitfield16() {
        return crossOrderCancelledReturnBitfield16;
    }

    /**
     * BitSet CrossOrderCancelled byte 17.
     *
     * @return the CrossOrderCancelledReturnBitfield17 field
     */
    public CrossOrderCancelledReturnBitfield17Field crossOrderCancelledReturnBitfield17() {
        return crossOrderCancelledReturnBitfield17;
    }

    /**
     * BitSet CrossOrderCancelled byte 18.
     *
     * @return the CrossOrderCancelledReturnBitfield18 field
     */
    public CrossOrderCancelledReturnBitfield18Field crossOrderCancelledReturnBitfield18() {
        return crossOrderCancelledReturnBitfield18;
    }

    /**
     * BitSet CrossOrderCancelled byte 19.
     *
     * @return the CrossOrderCancelledReturnBitfield19 field
     */
    public CrossOrderCancelledReturnBitfield19Field crossOrderCancelledReturnBitfield19() {
        return crossOrderCancelledReturnBitfield19;
    }

    /**
     * Number of order allocations represented by re- peating groups included in this cross order. Must be at least 2 (One agency and one contra), and no more than 11.
     *
     * @return the GroupCnt field
     */
    public GroupCntField groupCnt() {
        return groupCnt;
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
     * Auction Id
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
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
     * Repeating group stated GroupCnt times.
     *
     * <p>Encode writes this list's size to the GroupCnt field.</p>
     *
     * @return the CrossOrderCancelledOrderAllocations entries
     */
    public CrossOrderCancelledOrderAllocationsList crossOrderCancelledOrderAllocations() {
        return crossOrderCancelledOrderAllocations;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield1 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield2 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield3 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield4 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield5 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield6 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield7 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield8 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield9 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield10 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield11 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield12 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield13 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield14 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield15 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield16 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield17 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield18 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield19 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield19Present() {
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
        return (numberOfReturnBitfields.value() >= 1L) && (crossOrderCancelledReturnBitfield1Present() && crossOrderCancelledReturnBitfield1.crossOrderCancelledReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (crossOrderCancelledReturnBitfield2Present() && crossOrderCancelledReturnBitfield2.crossOrderCancelledReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (crossOrderCancelledReturnBitfield2Present() && crossOrderCancelledReturnBitfield2.crossOrderCancelledReturnBitfield2IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (crossOrderCancelledReturnBitfield2Present() && crossOrderCancelledReturnBitfield2.crossOrderCancelledReturnBitfield2SecurityId());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (crossOrderCancelledReturnBitfield3Present() && crossOrderCancelledReturnBitfield3.crossOrderCancelledReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (crossOrderCancelledReturnBitfield3Present() && crossOrderCancelledReturnBitfield3.crossOrderCancelledReturnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the ExtExecInst put it on the wire.
     *
     * <p>Decode reads the ExtExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExtExecInst is on the wire
     */
    public boolean extExecInstPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (crossOrderCancelledReturnBitfield6Present() && crossOrderCancelledReturnBitfield6.crossOrderCancelledReturnBitfield6ExtExecInst());
    }

    /**
     * Returns whether the fields before the AuctionId put it on the wire.
     *
     * <p>Decode reads the AuctionId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AuctionId is on the wire
     */
    public boolean auctionIdPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (crossOrderCancelledReturnBitfield9Present() && crossOrderCancelledReturnBitfield9.crossOrderCancelledReturnBitfield9AuctionId());
    }

    /**
     * Returns whether the fields before the LiquidityProvision put it on the wire.
     *
     * <p>Decode reads the LiquidityProvision where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LiquidityProvision is on the wire
     */
    public boolean liquidityProvisionPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (crossOrderCancelledReturnBitfield9Present() && crossOrderCancelledReturnBitfield9.crossOrderCancelledReturnBitfield9LiquidityProvision());
    }

    /**
     * Returns whether the fields before the CrossType put it on the wire.
     *
     * <p>Decode reads the CrossType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossType is on the wire
     */
    public boolean crossTypePresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (crossOrderCancelledReturnBitfield9Present() && crossOrderCancelledReturnBitfield9.crossOrderCancelledReturnBitfield9CrossType());
    }

    /**
     * Returns whether the fields before the CrossPrioritization put it on the wire.
     *
     * <p>Decode reads the CrossPrioritization where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossPrioritization is on the wire
     */
    public boolean crossPrioritizationPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (crossOrderCancelledReturnBitfield9Present() && crossOrderCancelledReturnBitfield9.crossOrderCancelledReturnBitfield9CrossPrioritization());
    }

    private boolean onWire(Field field) {
        return (field != crossOrderCancelledReturnBitfield1 || crossOrderCancelledReturnBitfield1Present()) && (field != crossOrderCancelledReturnBitfield2 || crossOrderCancelledReturnBitfield2Present()) && (field != crossOrderCancelledReturnBitfield3 || crossOrderCancelledReturnBitfield3Present()) && (field != crossOrderCancelledReturnBitfield4 || crossOrderCancelledReturnBitfield4Present()) && (field != crossOrderCancelledReturnBitfield5 || crossOrderCancelledReturnBitfield5Present()) && (field != crossOrderCancelledReturnBitfield6 || crossOrderCancelledReturnBitfield6Present()) && (field != crossOrderCancelledReturnBitfield7 || crossOrderCancelledReturnBitfield7Present()) && (field != crossOrderCancelledReturnBitfield8 || crossOrderCancelledReturnBitfield8Present()) && (field != crossOrderCancelledReturnBitfield9 || crossOrderCancelledReturnBitfield9Present()) && (field != crossOrderCancelledReturnBitfield10 || crossOrderCancelledReturnBitfield10Present()) && (field != crossOrderCancelledReturnBitfield11 || crossOrderCancelledReturnBitfield11Present()) && (field != crossOrderCancelledReturnBitfield12 || crossOrderCancelledReturnBitfield12Present()) && (field != crossOrderCancelledReturnBitfield13 || crossOrderCancelledReturnBitfield13Present()) && (field != crossOrderCancelledReturnBitfield14 || crossOrderCancelledReturnBitfield14Present()) && (field != crossOrderCancelledReturnBitfield15 || crossOrderCancelledReturnBitfield15Present()) && (field != crossOrderCancelledReturnBitfield16 || crossOrderCancelledReturnBitfield16Present()) && (field != crossOrderCancelledReturnBitfield17 || crossOrderCancelledReturnBitfield17Present()) && (field != crossOrderCancelledReturnBitfield18 || crossOrderCancelledReturnBitfield18Present()) && (field != crossOrderCancelledReturnBitfield19 || crossOrderCancelledReturnBitfield19Present()) && (field != price || pricePresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != extExecInst || extExecInstPresent()) && (field != auctionId || auctionIdPresent()) && (field != liquidityProvision || liquidityProvisionPresent()) && (field != crossType || crossTypePresent()) && (field != crossPrioritization || crossPrioritizationPresent());
    }

    /**
     * Hands each list whose entries read this record's fields the values they read, none for a field off the wire.
     */
    private void giveEntryInputs() {
        crossOrderCancelledOrderAllocations.inputs(OptionalLong.of(numberOfReturnBitfields.value()), crossOrderCancelledReturnBitfield1Present() ? OptionalLong.of(crossOrderCancelledReturnBitfield1.value()) : OptionalLong.empty(), crossOrderCancelledReturnBitfield10Present() ? OptionalLong.of(crossOrderCancelledReturnBitfield10.value()) : OptionalLong.empty(), crossOrderCancelledReturnBitfield2Present() ? OptionalLong.of(crossOrderCancelledReturnBitfield2.value()) : OptionalLong.empty(), crossOrderCancelledReturnBitfield4Present() ? OptionalLong.of(crossOrderCancelledReturnBitfield4.value()) : OptionalLong.empty(), crossOrderCancelledReturnBitfield3Present() ? OptionalLong.of(crossOrderCancelledReturnBitfield3.value()) : OptionalLong.empty(), crossOrderCancelledReturnBitfield17Present() ? OptionalLong.of(crossOrderCancelledReturnBitfield17.value()) : OptionalLong.empty(), crossOrderCancelledReturnBitfield18Present() ? OptionalLong.of(crossOrderCancelledReturnBitfield18.value()) : OptionalLong.empty(), crossOrderCancelledReturnBitfield11Present() ? OptionalLong.of(crossOrderCancelledReturnBitfield11.value()) : OptionalLong.empty());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        giveEntryInputs();
        return MINIMUM_BYTE_LENGTH + (crossOrderCancelledReturnBitfield1Present() ? CrossOrderCancelledReturnBitfield1Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield2Present() ? CrossOrderCancelledReturnBitfield2Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield3Present() ? CrossOrderCancelledReturnBitfield3Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield4Present() ? CrossOrderCancelledReturnBitfield4Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield5Present() ? CrossOrderCancelledReturnBitfield5Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield6Present() ? CrossOrderCancelledReturnBitfield6Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield7Present() ? CrossOrderCancelledReturnBitfield7Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield8Present() ? CrossOrderCancelledReturnBitfield8Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield9Present() ? CrossOrderCancelledReturnBitfield9Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield10Present() ? CrossOrderCancelledReturnBitfield10Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield11Present() ? CrossOrderCancelledReturnBitfield11Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield12Present() ? CrossOrderCancelledReturnBitfield12Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield13Present() ? CrossOrderCancelledReturnBitfield13Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield14Present() ? CrossOrderCancelledReturnBitfield14Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield15Present() ? CrossOrderCancelledReturnBitfield15Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield16Present() ? CrossOrderCancelledReturnBitfield16Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield17Present() ? CrossOrderCancelledReturnBitfield17Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield18Present() ? CrossOrderCancelledReturnBitfield18Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield19Present() ? CrossOrderCancelledReturnBitfield19Field.BYTE_LENGTH : 0) + crossOrderCancelledOrderAllocations.byteLength() + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField2.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (extExecInstPresent() ? ExtExecInstField.BYTE_LENGTH : 0) + (auctionIdPresent() ? AuctionIdField.BYTE_LENGTH : 0) + (liquidityProvisionPresent() ? LiquidityProvisionField.BYTE_LENGTH : 0) + (crossTypePresent() ? CrossTypeField.BYTE_LENGTH : 0) + (crossPrioritizationPresent() ? CrossPrioritizationField.BYTE_LENGTH : 0);
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
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (crossOrderCancelledReturnBitfield1Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield2Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield3Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield4Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield5Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield6Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield7Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield8Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield9Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield10Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield11Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield12Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield13Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield14Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield15Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield16Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield17Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield18Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield19Present()) {
            cursor += 1;
        }
        cursor += 2;
        cursor += crossOrderCancelledOrderAllocations.byteLength();
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
        if (auctionIdPresent()) {
            cursor += 8;
        }
        if (liquidityProvisionPresent()) {
            cursor += 1;
        }
        if (crossTypePresent()) {
            cursor += 1;
        }
        if (crossPrioritizationPresent()) {
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
        if (!cancelReason.parse(data, cursor)) {
            return false;
        }
        cursor += CancelReasonField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (crossOrderCancelledReturnBitfield1Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield1Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield2Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield2Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield3Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield3Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield4Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield4Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield5Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield5Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield6Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield6Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield7Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield7Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield8Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield8Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield9Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield9Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield10Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield10Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield11Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield11Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield12Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield12Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield13Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield13Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield14Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield14Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield15Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield15Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield16Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield16Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield17Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield17Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield18Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield18Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield19Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield19Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (!groupCnt.parse(data, cursor)) {
            return false;
        }
        cursor += GroupCntField.BYTE_LENGTH;
        giveEntryInputs();
        if (!crossOrderCancelledOrderAllocations.parse(data, cursor, end, groupCnt.value())) {
            return false;
        }
        cursor += crossOrderCancelledOrderAllocations.byteLength();
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
        if (auctionIdPresent()) {
            if (end - cursor < AuctionIdField.BYTE_LENGTH || !auctionId.parse(data, cursor)) {
                return false;
            }
            cursor += AuctionIdField.BYTE_LENGTH;
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

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (crossOrderCancelledOrderAllocations.size() > 65535) {
            throw new IllegalStateException("crossOrderCancelledOrderAllocations holds " + crossOrderCancelledOrderAllocations.size() + " entries, more than its count field can state");
        }
        groupCnt.value(crossOrderCancelledOrderAllocations.size());
        if (crossOrderCancelledReturnBitfield1Present() != crossOrderCancelledReturnBitfield1.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield1.hasValue() ? "crossOrderCancelledReturnBitfield1 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield2Present() != crossOrderCancelledReturnBitfield2.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield2.hasValue() ? "crossOrderCancelledReturnBitfield2 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield3Present() != crossOrderCancelledReturnBitfield3.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield3.hasValue() ? "crossOrderCancelledReturnBitfield3 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield4Present() != crossOrderCancelledReturnBitfield4.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield4.hasValue() ? "crossOrderCancelledReturnBitfield4 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield5Present() != crossOrderCancelledReturnBitfield5.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield5.hasValue() ? "crossOrderCancelledReturnBitfield5 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield6Present() != crossOrderCancelledReturnBitfield6.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield6.hasValue() ? "crossOrderCancelledReturnBitfield6 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield7Present() != crossOrderCancelledReturnBitfield7.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield7.hasValue() ? "crossOrderCancelledReturnBitfield7 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield8Present() != crossOrderCancelledReturnBitfield8.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield8.hasValue() ? "crossOrderCancelledReturnBitfield8 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield9Present() != crossOrderCancelledReturnBitfield9.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield9.hasValue() ? "crossOrderCancelledReturnBitfield9 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield10Present() != crossOrderCancelledReturnBitfield10.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield10.hasValue() ? "crossOrderCancelledReturnBitfield10 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield11Present() != crossOrderCancelledReturnBitfield11.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield11.hasValue() ? "crossOrderCancelledReturnBitfield11 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield12Present() != crossOrderCancelledReturnBitfield12.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield12.hasValue() ? "crossOrderCancelledReturnBitfield12 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield13Present() != crossOrderCancelledReturnBitfield13.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield13.hasValue() ? "crossOrderCancelledReturnBitfield13 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield14Present() != crossOrderCancelledReturnBitfield14.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield14.hasValue() ? "crossOrderCancelledReturnBitfield14 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield15Present() != crossOrderCancelledReturnBitfield15.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield15.hasValue() ? "crossOrderCancelledReturnBitfield15 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield16Present() != crossOrderCancelledReturnBitfield16.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield16.hasValue() ? "crossOrderCancelledReturnBitfield16 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield17Present() != crossOrderCancelledReturnBitfield17.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield17.hasValue() ? "crossOrderCancelledReturnBitfield17 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield18Present() != crossOrderCancelledReturnBitfield18.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield18.hasValue() ? "crossOrderCancelledReturnBitfield18 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield19Present() != crossOrderCancelledReturnBitfield19.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield19.hasValue() ? "crossOrderCancelledReturnBitfield19 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield19 holds no value, though the fields before it put it on the wire");
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
        if (auctionIdPresent() != auctionId.hasValue()) {
            throw new IllegalStateException(auctionId.hasValue() ? "auctionId holds a value the fields before it leave off the wire" : "auctionId holds no value, though the fields before it put it on the wire");
        }
        if (liquidityProvisionPresent() != liquidityProvision.hasValue()) {
            throw new IllegalStateException(liquidityProvision.hasValue() ? "liquidityProvision holds a value the fields before it leave off the wire" : "liquidityProvision holds no value, though the fields before it put it on the wire");
        }
        if (crossTypePresent() != crossType.hasValue()) {
            throw new IllegalStateException(crossType.hasValue() ? "crossType holds a value the fields before it leave off the wire" : "crossType holds no value, though the fields before it put it on the wire");
        }
        if (crossPrioritizationPresent() != crossPrioritization.hasValue()) {
            throw new IllegalStateException(crossPrioritization.hasValue() ? "crossPrioritization holds a value the fields before it leave off the wire" : "crossPrioritization holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = crossId.encode(data, cursor);
        cursor = cancelReason.encode(data, cursor);
        if (buffer != null && buffer.length >= 30) {
            System.arraycopy(buffer, 29, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (crossOrderCancelledReturnBitfield1Present()) {
            cursor = crossOrderCancelledReturnBitfield1.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield2Present()) {
            cursor = crossOrderCancelledReturnBitfield2.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield3Present()) {
            cursor = crossOrderCancelledReturnBitfield3.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield4Present()) {
            cursor = crossOrderCancelledReturnBitfield4.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield5Present()) {
            cursor = crossOrderCancelledReturnBitfield5.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield6Present()) {
            cursor = crossOrderCancelledReturnBitfield6.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield7Present()) {
            cursor = crossOrderCancelledReturnBitfield7.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield8Present()) {
            cursor = crossOrderCancelledReturnBitfield8.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield9Present()) {
            cursor = crossOrderCancelledReturnBitfield9.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield10Present()) {
            cursor = crossOrderCancelledReturnBitfield10.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield11Present()) {
            cursor = crossOrderCancelledReturnBitfield11.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield12Present()) {
            cursor = crossOrderCancelledReturnBitfield12.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield13Present()) {
            cursor = crossOrderCancelledReturnBitfield13.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield14Present()) {
            cursor = crossOrderCancelledReturnBitfield14.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield15Present()) {
            cursor = crossOrderCancelledReturnBitfield15.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield16Present()) {
            cursor = crossOrderCancelledReturnBitfield16.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield17Present()) {
            cursor = crossOrderCancelledReturnBitfield17.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield18Present()) {
            cursor = crossOrderCancelledReturnBitfield18.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield19Present()) {
            cursor = crossOrderCancelledReturnBitfield19.encode(data, cursor);
        }
        cursor = groupCnt.encode(data, cursor);
        cursor = crossOrderCancelledOrderAllocations.encode(data, cursor);
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
        if (auctionIdPresent()) {
            cursor = auctionId.encode(data, cursor);
        }
        if (liquidityProvisionPresent()) {
            cursor = liquidityProvision.encode(data, cursor);
        }
        if (crossTypePresent()) {
            cursor = crossType.encode(data, cursor);
        }
        if (crossPrioritizationPresent()) {
            cursor = crossPrioritization.encode(data, cursor);
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
        crossOrderCancelledOrderAllocations.clear();
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
            if (field != groupCnt && !field.isRecognized()) {
                return false;
            }
        }
        return crossOrderCancelledOrderAllocations.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != groupCnt && !field.isValid()) {
                return false;
            }
        }
        if (!crossOrderCancelledOrderAllocations.isValid()) {
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
        if (!transactionTime.isDecoded()) {
            return Optional.of(transactionTime);
        }
        if (!crossId.isDecoded()) {
            return Optional.of(crossId);
        }
        if (!cancelReason.isDecoded()) {
            return Optional.of(cancelReason);
        }
        if (!numberOfReturnBitfields.isDecoded()) {
            return Optional.of(numberOfReturnBitfields);
        }
        if (crossOrderCancelledReturnBitfield1Present() && !crossOrderCancelledReturnBitfield1.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield1);
        }
        if (crossOrderCancelledReturnBitfield2Present() && !crossOrderCancelledReturnBitfield2.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield2);
        }
        if (crossOrderCancelledReturnBitfield3Present() && !crossOrderCancelledReturnBitfield3.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield3);
        }
        if (crossOrderCancelledReturnBitfield4Present() && !crossOrderCancelledReturnBitfield4.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield4);
        }
        if (crossOrderCancelledReturnBitfield5Present() && !crossOrderCancelledReturnBitfield5.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield5);
        }
        if (crossOrderCancelledReturnBitfield6Present() && !crossOrderCancelledReturnBitfield6.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield6);
        }
        if (crossOrderCancelledReturnBitfield7Present() && !crossOrderCancelledReturnBitfield7.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield7);
        }
        if (crossOrderCancelledReturnBitfield8Present() && !crossOrderCancelledReturnBitfield8.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield8);
        }
        if (crossOrderCancelledReturnBitfield9Present() && !crossOrderCancelledReturnBitfield9.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield9);
        }
        if (crossOrderCancelledReturnBitfield10Present() && !crossOrderCancelledReturnBitfield10.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield10);
        }
        if (crossOrderCancelledReturnBitfield11Present() && !crossOrderCancelledReturnBitfield11.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield11);
        }
        if (crossOrderCancelledReturnBitfield12Present() && !crossOrderCancelledReturnBitfield12.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield12);
        }
        if (crossOrderCancelledReturnBitfield13Present() && !crossOrderCancelledReturnBitfield13.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield13);
        }
        if (crossOrderCancelledReturnBitfield14Present() && !crossOrderCancelledReturnBitfield14.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield14);
        }
        if (crossOrderCancelledReturnBitfield15Present() && !crossOrderCancelledReturnBitfield15.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield15);
        }
        if (crossOrderCancelledReturnBitfield16Present() && !crossOrderCancelledReturnBitfield16.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield16);
        }
        if (crossOrderCancelledReturnBitfield17Present() && !crossOrderCancelledReturnBitfield17.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield17);
        }
        if (crossOrderCancelledReturnBitfield18Present() && !crossOrderCancelledReturnBitfield18.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield18);
        }
        if (crossOrderCancelledReturnBitfield19Present() && !crossOrderCancelledReturnBitfield19.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield19);
        }
        if (!groupCnt.isDecoded()) {
            return Optional.of(groupCnt);
        }
        if (!crossOrderCancelledOrderAllocations.isDecoded()) {
            return Optional.of(crossOrderCancelledOrderAllocations.failedEntry().flatMap(CrossOrderCancelledOrderAllocationsEntry::failedAt).orElse(groupCnt));
        }
        if (pricePresent() && !price.isDecoded()) {
            return Optional.of(price);
        }
        if (symbolAlphanumericPresent() && !symbolAlphanumeric.isDecoded()) {
            return Optional.of(symbolAlphanumeric);
        }
        if (idSourcePresent() && !idSource.isDecoded()) {
            return Optional.of(idSource);
        }
        if (securityIdPresent() && !securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (orderQtyPresent() && !orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (preventMatchPresent() && !preventMatch.isDecoded()) {
            return Optional.of(preventMatch);
        }
        if (extExecInstPresent() && !extExecInst.isDecoded()) {
            return Optional.of(extExecInst);
        }
        if (auctionIdPresent() && !auctionId.isDecoded()) {
            return Optional.of(auctionId);
        }
        if (liquidityProvisionPresent() && !liquidityProvision.isDecoded()) {
            return Optional.of(liquidityProvision);
        }
        if (crossTypePresent() && !crossType.isDecoded()) {
            return Optional.of(crossType);
        }
        if (crossPrioritizationPresent() && !crossPrioritization.isDecoded()) {
            return Optional.of(crossPrioritization);
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
            case "CancelReason" -> Optional.of(cancelReason);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "CrossOrderCancelledReturnBitfield1" -> Optional.of(crossOrderCancelledReturnBitfield1);
            case "CrossOrderCancelledReturnBitfield2" -> Optional.of(crossOrderCancelledReturnBitfield2);
            case "CrossOrderCancelledReturnBitfield3" -> Optional.of(crossOrderCancelledReturnBitfield3);
            case "CrossOrderCancelledReturnBitfield4" -> Optional.of(crossOrderCancelledReturnBitfield4);
            case "CrossOrderCancelledReturnBitfield5" -> Optional.of(crossOrderCancelledReturnBitfield5);
            case "CrossOrderCancelledReturnBitfield6" -> Optional.of(crossOrderCancelledReturnBitfield6);
            case "CrossOrderCancelledReturnBitfield7" -> Optional.of(crossOrderCancelledReturnBitfield7);
            case "CrossOrderCancelledReturnBitfield8" -> Optional.of(crossOrderCancelledReturnBitfield8);
            case "CrossOrderCancelledReturnBitfield9" -> Optional.of(crossOrderCancelledReturnBitfield9);
            case "CrossOrderCancelledReturnBitfield10" -> Optional.of(crossOrderCancelledReturnBitfield10);
            case "CrossOrderCancelledReturnBitfield11" -> Optional.of(crossOrderCancelledReturnBitfield11);
            case "CrossOrderCancelledReturnBitfield12" -> Optional.of(crossOrderCancelledReturnBitfield12);
            case "CrossOrderCancelledReturnBitfield13" -> Optional.of(crossOrderCancelledReturnBitfield13);
            case "CrossOrderCancelledReturnBitfield14" -> Optional.of(crossOrderCancelledReturnBitfield14);
            case "CrossOrderCancelledReturnBitfield15" -> Optional.of(crossOrderCancelledReturnBitfield15);
            case "CrossOrderCancelledReturnBitfield16" -> Optional.of(crossOrderCancelledReturnBitfield16);
            case "CrossOrderCancelledReturnBitfield17" -> Optional.of(crossOrderCancelledReturnBitfield17);
            case "CrossOrderCancelledReturnBitfield18" -> Optional.of(crossOrderCancelledReturnBitfield18);
            case "CrossOrderCancelledReturnBitfield19" -> Optional.of(crossOrderCancelledReturnBitfield19);
            case "GroupCnt" -> Optional.of(groupCnt);
            case "Price" -> Optional.of(price);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "IdSource" -> Optional.of(idSource);
            case "SecurityId" -> Optional.of(securityId);
            case "OrderQty" -> Optional.of(orderQty);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "ExtExecInst" -> Optional.of(extExecInst);
            case "AuctionId" -> Optional.of(auctionId);
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "CrossType" -> Optional.of(crossType);
            case "CrossPrioritization" -> Optional.of(crossPrioritization);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CrossOrderCancelledMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(crossOrderCancelledOrderAllocations.diffFields(message.crossOrderCancelledOrderAllocations));
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
            crossOrderCancelledOrderAllocations.toFormattedString(builder, options);
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
        crossOrderCancelledOrderAllocations.toFormattedString(builder, nested);
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
        if (!(other instanceof CrossOrderCancelledMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && crossOrderCancelledOrderAllocations.equals(message.crossOrderCancelledOrderAllocations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, crossOrderCancelledOrderAllocations);
    }
}
