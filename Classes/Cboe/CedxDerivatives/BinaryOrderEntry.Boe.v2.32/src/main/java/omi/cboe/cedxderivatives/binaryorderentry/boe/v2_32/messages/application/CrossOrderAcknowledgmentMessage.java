package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.AuctionIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield10Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield11Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield12Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield13Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield14Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield15Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield16Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield17Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield18Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield19Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield1Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield2Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield3Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield4Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield5Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield6Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield7Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield8Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossOrderAcknowledgmentReturnBitfield9Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossPrioritizationField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.DrillThruProtectionField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ExtExecInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.GroupCntField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.IdSourceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.LiquidityProvisionField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.OrderQtyField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.PreventMatchField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.PriceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.RoutingFirmIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.SecurityIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.SymbolAlphanumericField2;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.TransactionTimeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.groups.CrossOrderAcknowledgmentOrderAllocationsEntry;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.groups.CrossOrderAcknowledgmentOrderAllocationsList;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.PrintOptions;

/**
 * Represents the CrossOrderAcknowledgmentMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Cross Order Acknowledgment Message.</p>
 */
public final class CrossOrderAcknowledgmentMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 40;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Cross Order Acknowledgment Message";

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent). Nanosecond precision.
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to CrossID (548) in Cboe FIX. Day-unique identifier for the cross order chosen by the client. Characters in the ASCII range 33– 126 are allowed, except for comma, semicolon, and pipe.
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * Auction Id
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet CrossOrderAcknowledgment byte 1.
     */
    private final CrossOrderAcknowledgmentReturnBitfield1Field crossOrderAcknowledgmentReturnBitfield1 = new CrossOrderAcknowledgmentReturnBitfield1Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 2.
     */
    private final CrossOrderAcknowledgmentReturnBitfield2Field crossOrderAcknowledgmentReturnBitfield2 = new CrossOrderAcknowledgmentReturnBitfield2Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 3.
     */
    private final CrossOrderAcknowledgmentReturnBitfield3Field crossOrderAcknowledgmentReturnBitfield3 = new CrossOrderAcknowledgmentReturnBitfield3Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 4.
     */
    private final CrossOrderAcknowledgmentReturnBitfield4Field crossOrderAcknowledgmentReturnBitfield4 = new CrossOrderAcknowledgmentReturnBitfield4Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 5.
     */
    private final CrossOrderAcknowledgmentReturnBitfield5Field crossOrderAcknowledgmentReturnBitfield5 = new CrossOrderAcknowledgmentReturnBitfield5Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 6.
     */
    private final CrossOrderAcknowledgmentReturnBitfield6Field crossOrderAcknowledgmentReturnBitfield6 = new CrossOrderAcknowledgmentReturnBitfield6Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 7.
     */
    private final CrossOrderAcknowledgmentReturnBitfield7Field crossOrderAcknowledgmentReturnBitfield7 = new CrossOrderAcknowledgmentReturnBitfield7Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 8.
     */
    private final CrossOrderAcknowledgmentReturnBitfield8Field crossOrderAcknowledgmentReturnBitfield8 = new CrossOrderAcknowledgmentReturnBitfield8Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 9.
     */
    private final CrossOrderAcknowledgmentReturnBitfield9Field crossOrderAcknowledgmentReturnBitfield9 = new CrossOrderAcknowledgmentReturnBitfield9Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 10.
     */
    private final CrossOrderAcknowledgmentReturnBitfield10Field crossOrderAcknowledgmentReturnBitfield10 = new CrossOrderAcknowledgmentReturnBitfield10Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 11.
     */
    private final CrossOrderAcknowledgmentReturnBitfield11Field crossOrderAcknowledgmentReturnBitfield11 = new CrossOrderAcknowledgmentReturnBitfield11Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 12.
     */
    private final CrossOrderAcknowledgmentReturnBitfield12Field crossOrderAcknowledgmentReturnBitfield12 = new CrossOrderAcknowledgmentReturnBitfield12Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 13.
     */
    private final CrossOrderAcknowledgmentReturnBitfield13Field crossOrderAcknowledgmentReturnBitfield13 = new CrossOrderAcknowledgmentReturnBitfield13Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 14.
     */
    private final CrossOrderAcknowledgmentReturnBitfield14Field crossOrderAcknowledgmentReturnBitfield14 = new CrossOrderAcknowledgmentReturnBitfield14Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 15.
     */
    private final CrossOrderAcknowledgmentReturnBitfield15Field crossOrderAcknowledgmentReturnBitfield15 = new CrossOrderAcknowledgmentReturnBitfield15Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 16.
     */
    private final CrossOrderAcknowledgmentReturnBitfield16Field crossOrderAcknowledgmentReturnBitfield16 = new CrossOrderAcknowledgmentReturnBitfield16Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 17.
     */
    private final CrossOrderAcknowledgmentReturnBitfield17Field crossOrderAcknowledgmentReturnBitfield17 = new CrossOrderAcknowledgmentReturnBitfield17Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 18.
     */
    private final CrossOrderAcknowledgmentReturnBitfield18Field crossOrderAcknowledgmentReturnBitfield18 = new CrossOrderAcknowledgmentReturnBitfield18Field();

    /**
     * BitSet CrossOrderAcknowledgment byte 19.
     */
    private final CrossOrderAcknowledgmentReturnBitfield19Field crossOrderAcknowledgmentReturnBitfield19 = new CrossOrderAcknowledgmentReturnBitfield19Field();

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
     * Routing Firm Id
     */
    private final RoutingFirmIdField routingFirmId = new RoutingFirmIdField();

    /**
     * Drill Thru Protection
     */
    private final DrillThruProtectionField drillThruProtection = new DrillThruProtectionField();

    /**
     * Repeating group stated GroupCnt times.
     */
    private final CrossOrderAcknowledgmentOrderAllocationsList crossOrderAcknowledgmentOrderAllocations = new CrossOrderAcknowledgmentOrderAllocationsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, crossId, auctionId, numberOfReturnBitfields, crossOrderAcknowledgmentReturnBitfield1, crossOrderAcknowledgmentReturnBitfield2, crossOrderAcknowledgmentReturnBitfield3, crossOrderAcknowledgmentReturnBitfield4, crossOrderAcknowledgmentReturnBitfield5, crossOrderAcknowledgmentReturnBitfield6, crossOrderAcknowledgmentReturnBitfield7, crossOrderAcknowledgmentReturnBitfield8, crossOrderAcknowledgmentReturnBitfield9, crossOrderAcknowledgmentReturnBitfield10, crossOrderAcknowledgmentReturnBitfield11, crossOrderAcknowledgmentReturnBitfield12, crossOrderAcknowledgmentReturnBitfield13, crossOrderAcknowledgmentReturnBitfield14, crossOrderAcknowledgmentReturnBitfield15, crossOrderAcknowledgmentReturnBitfield16, crossOrderAcknowledgmentReturnBitfield17, crossOrderAcknowledgmentReturnBitfield18, crossOrderAcknowledgmentReturnBitfield19, groupCnt, price, symbolAlphanumeric, idSource, securityId, orderQty, preventMatch, extExecInst, liquidityProvision, crossType, crossPrioritization, routingFirmId, drillThruProtection);

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
     * Corresponds to CrossID (548) in Cboe FIX. Day-unique identifier for the cross order chosen by the client. Characters in the ASCII range 33– 126 are allowed, except for comma, semicolon, and pipe.
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
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
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfReturnBitfields field
     */
    public NumberOfReturnBitfieldsField numberOfReturnBitfields() {
        return numberOfReturnBitfields;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 1.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield1 field
     */
    public CrossOrderAcknowledgmentReturnBitfield1Field crossOrderAcknowledgmentReturnBitfield1() {
        return crossOrderAcknowledgmentReturnBitfield1;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 2.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield2 field
     */
    public CrossOrderAcknowledgmentReturnBitfield2Field crossOrderAcknowledgmentReturnBitfield2() {
        return crossOrderAcknowledgmentReturnBitfield2;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 3.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield3 field
     */
    public CrossOrderAcknowledgmentReturnBitfield3Field crossOrderAcknowledgmentReturnBitfield3() {
        return crossOrderAcknowledgmentReturnBitfield3;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 4.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield4 field
     */
    public CrossOrderAcknowledgmentReturnBitfield4Field crossOrderAcknowledgmentReturnBitfield4() {
        return crossOrderAcknowledgmentReturnBitfield4;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 5.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield5 field
     */
    public CrossOrderAcknowledgmentReturnBitfield5Field crossOrderAcknowledgmentReturnBitfield5() {
        return crossOrderAcknowledgmentReturnBitfield5;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 6.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield6 field
     */
    public CrossOrderAcknowledgmentReturnBitfield6Field crossOrderAcknowledgmentReturnBitfield6() {
        return crossOrderAcknowledgmentReturnBitfield6;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 7.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield7 field
     */
    public CrossOrderAcknowledgmentReturnBitfield7Field crossOrderAcknowledgmentReturnBitfield7() {
        return crossOrderAcknowledgmentReturnBitfield7;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 8.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield8 field
     */
    public CrossOrderAcknowledgmentReturnBitfield8Field crossOrderAcknowledgmentReturnBitfield8() {
        return crossOrderAcknowledgmentReturnBitfield8;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 9.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield9 field
     */
    public CrossOrderAcknowledgmentReturnBitfield9Field crossOrderAcknowledgmentReturnBitfield9() {
        return crossOrderAcknowledgmentReturnBitfield9;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 10.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield10 field
     */
    public CrossOrderAcknowledgmentReturnBitfield10Field crossOrderAcknowledgmentReturnBitfield10() {
        return crossOrderAcknowledgmentReturnBitfield10;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 11.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield11 field
     */
    public CrossOrderAcknowledgmentReturnBitfield11Field crossOrderAcknowledgmentReturnBitfield11() {
        return crossOrderAcknowledgmentReturnBitfield11;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 12.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield12 field
     */
    public CrossOrderAcknowledgmentReturnBitfield12Field crossOrderAcknowledgmentReturnBitfield12() {
        return crossOrderAcknowledgmentReturnBitfield12;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 13.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield13 field
     */
    public CrossOrderAcknowledgmentReturnBitfield13Field crossOrderAcknowledgmentReturnBitfield13() {
        return crossOrderAcknowledgmentReturnBitfield13;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 14.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield14 field
     */
    public CrossOrderAcknowledgmentReturnBitfield14Field crossOrderAcknowledgmentReturnBitfield14() {
        return crossOrderAcknowledgmentReturnBitfield14;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 15.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield15 field
     */
    public CrossOrderAcknowledgmentReturnBitfield15Field crossOrderAcknowledgmentReturnBitfield15() {
        return crossOrderAcknowledgmentReturnBitfield15;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 16.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield16 field
     */
    public CrossOrderAcknowledgmentReturnBitfield16Field crossOrderAcknowledgmentReturnBitfield16() {
        return crossOrderAcknowledgmentReturnBitfield16;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 17.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield17 field
     */
    public CrossOrderAcknowledgmentReturnBitfield17Field crossOrderAcknowledgmentReturnBitfield17() {
        return crossOrderAcknowledgmentReturnBitfield17;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 18.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield18 field
     */
    public CrossOrderAcknowledgmentReturnBitfield18Field crossOrderAcknowledgmentReturnBitfield18() {
        return crossOrderAcknowledgmentReturnBitfield18;
    }

    /**
     * BitSet CrossOrderAcknowledgment byte 19.
     *
     * @return the CrossOrderAcknowledgmentReturnBitfield19 field
     */
    public CrossOrderAcknowledgmentReturnBitfield19Field crossOrderAcknowledgmentReturnBitfield19() {
        return crossOrderAcknowledgmentReturnBitfield19;
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
     * Routing Firm Id
     *
     * @return the RoutingFirmId field
     */
    public RoutingFirmIdField routingFirmId() {
        return routingFirmId;
    }

    /**
     * Drill Thru Protection
     *
     * @return the DrillThruProtection field
     */
    public DrillThruProtectionField drillThruProtection() {
        return drillThruProtection;
    }

    /**
     * Repeating group stated GroupCnt times.
     *
     * <p>Encode writes this list's size to the GroupCnt field.</p>
     *
     * @return the CrossOrderAcknowledgmentOrderAllocations entries
     */
    public CrossOrderAcknowledgmentOrderAllocationsList crossOrderAcknowledgmentOrderAllocations() {
        return crossOrderAcknowledgmentOrderAllocations;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield1 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield2 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield3 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield4 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield5 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield6 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield7 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield8 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield9 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield10 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield11 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield12 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield13 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield14 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield15 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield16 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield17 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield18 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the CrossOrderAcknowledgmentReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the CrossOrderAcknowledgmentReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderAcknowledgmentReturnBitfield19 is on the wire
     */
    public boolean crossOrderAcknowledgmentReturnBitfield19Present() {
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
        return (numberOfReturnBitfields.value() >= 1L) && (crossOrderAcknowledgmentReturnBitfield1Present() && crossOrderAcknowledgmentReturnBitfield1.crossOrderAcknowledgmentReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (crossOrderAcknowledgmentReturnBitfield2Present() && crossOrderAcknowledgmentReturnBitfield2.crossOrderAcknowledgmentReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (crossOrderAcknowledgmentReturnBitfield2Present() && crossOrderAcknowledgmentReturnBitfield2.crossOrderAcknowledgmentReturnBitfield2IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (crossOrderAcknowledgmentReturnBitfield2Present() && crossOrderAcknowledgmentReturnBitfield2.crossOrderAcknowledgmentReturnBitfield2SecurityId());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (crossOrderAcknowledgmentReturnBitfield3Present() && crossOrderAcknowledgmentReturnBitfield3.crossOrderAcknowledgmentReturnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (crossOrderAcknowledgmentReturnBitfield3Present() && crossOrderAcknowledgmentReturnBitfield3.crossOrderAcknowledgmentReturnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the ExtExecInst put it on the wire.
     *
     * <p>Decode reads the ExtExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExtExecInst is on the wire
     */
    public boolean extExecInstPresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (crossOrderAcknowledgmentReturnBitfield6Present() && crossOrderAcknowledgmentReturnBitfield6.crossOrderAcknowledgmentReturnBitfield6ExtExecInst());
    }

    /**
     * Returns whether the fields before the LiquidityProvision put it on the wire.
     *
     * <p>Decode reads the LiquidityProvision where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LiquidityProvision is on the wire
     */
    public boolean liquidityProvisionPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (crossOrderAcknowledgmentReturnBitfield9Present() && crossOrderAcknowledgmentReturnBitfield9.crossOrderAcknowledgmentReturnBitfield9LiquidityProvision());
    }

    /**
     * Returns whether the fields before the CrossType put it on the wire.
     *
     * <p>Decode reads the CrossType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossType is on the wire
     */
    public boolean crossTypePresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (crossOrderAcknowledgmentReturnBitfield9Present() && crossOrderAcknowledgmentReturnBitfield9.crossOrderAcknowledgmentReturnBitfield9CrossType());
    }

    /**
     * Returns whether the fields before the CrossPrioritization put it on the wire.
     *
     * <p>Decode reads the CrossPrioritization where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossPrioritization is on the wire
     */
    public boolean crossPrioritizationPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (crossOrderAcknowledgmentReturnBitfield9Present() && crossOrderAcknowledgmentReturnBitfield9.crossOrderAcknowledgmentReturnBitfield9CrossPrioritization());
    }

    /**
     * Returns whether the fields before the RoutingFirmId put it on the wire.
     *
     * <p>Decode reads the RoutingFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingFirmId is on the wire
     */
    public boolean routingFirmIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (crossOrderAcknowledgmentReturnBitfield10Present() && crossOrderAcknowledgmentReturnBitfield10.crossOrderAcknowledgmentReturnBitfield10RoutingFirmId());
    }

    /**
     * Returns whether the fields before the DrillThruProtection put it on the wire.
     *
     * <p>Decode reads the DrillThruProtection where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DrillThruProtection is on the wire
     */
    public boolean drillThruProtectionPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (crossOrderAcknowledgmentReturnBitfield13Present() && crossOrderAcknowledgmentReturnBitfield13.crossOrderAcknowledgmentReturnBitfield13DrillThruProtection());
    }

    private boolean onWire(Field field) {
        return (field != crossOrderAcknowledgmentReturnBitfield1 || crossOrderAcknowledgmentReturnBitfield1Present()) && (field != crossOrderAcknowledgmentReturnBitfield2 || crossOrderAcknowledgmentReturnBitfield2Present()) && (field != crossOrderAcknowledgmentReturnBitfield3 || crossOrderAcknowledgmentReturnBitfield3Present()) && (field != crossOrderAcknowledgmentReturnBitfield4 || crossOrderAcknowledgmentReturnBitfield4Present()) && (field != crossOrderAcknowledgmentReturnBitfield5 || crossOrderAcknowledgmentReturnBitfield5Present()) && (field != crossOrderAcknowledgmentReturnBitfield6 || crossOrderAcknowledgmentReturnBitfield6Present()) && (field != crossOrderAcknowledgmentReturnBitfield7 || crossOrderAcknowledgmentReturnBitfield7Present()) && (field != crossOrderAcknowledgmentReturnBitfield8 || crossOrderAcknowledgmentReturnBitfield8Present()) && (field != crossOrderAcknowledgmentReturnBitfield9 || crossOrderAcknowledgmentReturnBitfield9Present()) && (field != crossOrderAcknowledgmentReturnBitfield10 || crossOrderAcknowledgmentReturnBitfield10Present()) && (field != crossOrderAcknowledgmentReturnBitfield11 || crossOrderAcknowledgmentReturnBitfield11Present()) && (field != crossOrderAcknowledgmentReturnBitfield12 || crossOrderAcknowledgmentReturnBitfield12Present()) && (field != crossOrderAcknowledgmentReturnBitfield13 || crossOrderAcknowledgmentReturnBitfield13Present()) && (field != crossOrderAcknowledgmentReturnBitfield14 || crossOrderAcknowledgmentReturnBitfield14Present()) && (field != crossOrderAcknowledgmentReturnBitfield15 || crossOrderAcknowledgmentReturnBitfield15Present()) && (field != crossOrderAcknowledgmentReturnBitfield16 || crossOrderAcknowledgmentReturnBitfield16Present()) && (field != crossOrderAcknowledgmentReturnBitfield17 || crossOrderAcknowledgmentReturnBitfield17Present()) && (field != crossOrderAcknowledgmentReturnBitfield18 || crossOrderAcknowledgmentReturnBitfield18Present()) && (field != crossOrderAcknowledgmentReturnBitfield19 || crossOrderAcknowledgmentReturnBitfield19Present()) && (field != price || pricePresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != extExecInst || extExecInstPresent()) && (field != liquidityProvision || liquidityProvisionPresent()) && (field != crossType || crossTypePresent()) && (field != crossPrioritization || crossPrioritizationPresent()) && (field != routingFirmId || routingFirmIdPresent()) && (field != drillThruProtection || drillThruProtectionPresent());
    }

    /**
     * Hands each list whose entries read this record's fields the values they read, none for a field off the wire.
     */
    private void giveEntryInputs() {
        crossOrderAcknowledgmentOrderAllocations.inputs(OptionalLong.of(numberOfReturnBitfields.value()), crossOrderAcknowledgmentReturnBitfield1Present() ? OptionalLong.of(crossOrderAcknowledgmentReturnBitfield1.value()) : OptionalLong.empty(), crossOrderAcknowledgmentReturnBitfield10Present() ? OptionalLong.of(crossOrderAcknowledgmentReturnBitfield10.value()) : OptionalLong.empty(), crossOrderAcknowledgmentReturnBitfield2Present() ? OptionalLong.of(crossOrderAcknowledgmentReturnBitfield2.value()) : OptionalLong.empty(), crossOrderAcknowledgmentReturnBitfield4Present() ? OptionalLong.of(crossOrderAcknowledgmentReturnBitfield4.value()) : OptionalLong.empty(), crossOrderAcknowledgmentReturnBitfield3Present() ? OptionalLong.of(crossOrderAcknowledgmentReturnBitfield3.value()) : OptionalLong.empty(), crossOrderAcknowledgmentReturnBitfield17Present() ? OptionalLong.of(crossOrderAcknowledgmentReturnBitfield17.value()) : OptionalLong.empty(), crossOrderAcknowledgmentReturnBitfield18Present() ? OptionalLong.of(crossOrderAcknowledgmentReturnBitfield18.value()) : OptionalLong.empty(), crossOrderAcknowledgmentReturnBitfield11Present() ? OptionalLong.of(crossOrderAcknowledgmentReturnBitfield11.value()) : OptionalLong.empty());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        giveEntryInputs();
        return MINIMUM_BYTE_LENGTH + (crossOrderAcknowledgmentReturnBitfield1Present() ? CrossOrderAcknowledgmentReturnBitfield1Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield2Present() ? CrossOrderAcknowledgmentReturnBitfield2Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield3Present() ? CrossOrderAcknowledgmentReturnBitfield3Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield4Present() ? CrossOrderAcknowledgmentReturnBitfield4Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield5Present() ? CrossOrderAcknowledgmentReturnBitfield5Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield6Present() ? CrossOrderAcknowledgmentReturnBitfield6Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield7Present() ? CrossOrderAcknowledgmentReturnBitfield7Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield8Present() ? CrossOrderAcknowledgmentReturnBitfield8Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield9Present() ? CrossOrderAcknowledgmentReturnBitfield9Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield10Present() ? CrossOrderAcknowledgmentReturnBitfield10Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield11Present() ? CrossOrderAcknowledgmentReturnBitfield11Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield12Present() ? CrossOrderAcknowledgmentReturnBitfield12Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield13Present() ? CrossOrderAcknowledgmentReturnBitfield13Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield14Present() ? CrossOrderAcknowledgmentReturnBitfield14Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield15Present() ? CrossOrderAcknowledgmentReturnBitfield15Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield16Present() ? CrossOrderAcknowledgmentReturnBitfield16Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield17Present() ? CrossOrderAcknowledgmentReturnBitfield17Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield18Present() ? CrossOrderAcknowledgmentReturnBitfield18Field.BYTE_LENGTH : 0) + (crossOrderAcknowledgmentReturnBitfield19Present() ? CrossOrderAcknowledgmentReturnBitfield19Field.BYTE_LENGTH : 0) + crossOrderAcknowledgmentOrderAllocations.byteLength() + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField2.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (extExecInstPresent() ? ExtExecInstField.BYTE_LENGTH : 0) + (liquidityProvisionPresent() ? LiquidityProvisionField.BYTE_LENGTH : 0) + (crossTypePresent() ? CrossTypeField.BYTE_LENGTH : 0) + (crossPrioritizationPresent() ? CrossPrioritizationField.BYTE_LENGTH : 0) + (routingFirmIdPresent() ? RoutingFirmIdField.BYTE_LENGTH : 0) + (drillThruProtectionPresent() ? DrillThruProtectionField.BYTE_LENGTH : 0);
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
        cursor += 8;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (crossOrderAcknowledgmentReturnBitfield1Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield2Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield3Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield4Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield5Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield6Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield7Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield8Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield9Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield10Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield11Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield12Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield13Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield14Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield15Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield16Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield17Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield18Present()) {
            cursor += 1;
        }
        if (crossOrderAcknowledgmentReturnBitfield19Present()) {
            cursor += 1;
        }
        cursor += 2;
        cursor += crossOrderAcknowledgmentOrderAllocations.byteLength();
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
        if (liquidityProvisionPresent()) {
            cursor += 1;
        }
        if (crossTypePresent()) {
            cursor += 1;
        }
        if (crossPrioritizationPresent()) {
            cursor += 1;
        }
        if (routingFirmIdPresent()) {
            cursor += 4;
        }
        if (drillThruProtectionPresent()) {
            cursor += 8;
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
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (crossOrderAcknowledgmentReturnBitfield1Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield1Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield2Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield2Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield3Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield3Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield4Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield4Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield5Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield5Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield6Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield6Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield7Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield7Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield8Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield8Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield9Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield9Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield10Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield10Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield11Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield11Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield12Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield12Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield13Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield13Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield14Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield14Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield15Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield15Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield16Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield16Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield17Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield17Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield18Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield18Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderAcknowledgmentReturnBitfield19Present()) {
            if (end - 2 - cursor < CrossOrderAcknowledgmentReturnBitfield19Field.BYTE_LENGTH || !crossOrderAcknowledgmentReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderAcknowledgmentReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (!groupCnt.parse(data, cursor)) {
            return false;
        }
        cursor += GroupCntField.BYTE_LENGTH;
        giveEntryInputs();
        if (!crossOrderAcknowledgmentOrderAllocations.parse(data, cursor, end, groupCnt.value())) {
            return false;
        }
        cursor += crossOrderAcknowledgmentOrderAllocations.byteLength();
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
        if (end - cursor < 0) {
            return false;
        }
        if (routingFirmIdPresent()) {
            if (end - cursor < RoutingFirmIdField.BYTE_LENGTH || !routingFirmId.parse(data, cursor)) {
                return false;
            }
            cursor += RoutingFirmIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (drillThruProtectionPresent()) {
            if (end - cursor < DrillThruProtectionField.BYTE_LENGTH || !drillThruProtection.parse(data, cursor)) {
                return false;
            }
            cursor += DrillThruProtectionField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (crossOrderAcknowledgmentOrderAllocations.size() > 65535) {
            throw new IllegalStateException("crossOrderAcknowledgmentOrderAllocations holds " + crossOrderAcknowledgmentOrderAllocations.size() + " entries, more than its count field can state");
        }
        groupCnt.value(crossOrderAcknowledgmentOrderAllocations.size());
        if (crossOrderAcknowledgmentReturnBitfield1Present() != crossOrderAcknowledgmentReturnBitfield1.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield1.hasValue() ? "crossOrderAcknowledgmentReturnBitfield1 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield2Present() != crossOrderAcknowledgmentReturnBitfield2.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield2.hasValue() ? "crossOrderAcknowledgmentReturnBitfield2 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield3Present() != crossOrderAcknowledgmentReturnBitfield3.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield3.hasValue() ? "crossOrderAcknowledgmentReturnBitfield3 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield4Present() != crossOrderAcknowledgmentReturnBitfield4.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield4.hasValue() ? "crossOrderAcknowledgmentReturnBitfield4 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield5Present() != crossOrderAcknowledgmentReturnBitfield5.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield5.hasValue() ? "crossOrderAcknowledgmentReturnBitfield5 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield6Present() != crossOrderAcknowledgmentReturnBitfield6.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield6.hasValue() ? "crossOrderAcknowledgmentReturnBitfield6 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield7Present() != crossOrderAcknowledgmentReturnBitfield7.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield7.hasValue() ? "crossOrderAcknowledgmentReturnBitfield7 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield8Present() != crossOrderAcknowledgmentReturnBitfield8.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield8.hasValue() ? "crossOrderAcknowledgmentReturnBitfield8 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield9Present() != crossOrderAcknowledgmentReturnBitfield9.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield9.hasValue() ? "crossOrderAcknowledgmentReturnBitfield9 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield10Present() != crossOrderAcknowledgmentReturnBitfield10.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield10.hasValue() ? "crossOrderAcknowledgmentReturnBitfield10 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield11Present() != crossOrderAcknowledgmentReturnBitfield11.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield11.hasValue() ? "crossOrderAcknowledgmentReturnBitfield11 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield12Present() != crossOrderAcknowledgmentReturnBitfield12.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield12.hasValue() ? "crossOrderAcknowledgmentReturnBitfield12 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield13Present() != crossOrderAcknowledgmentReturnBitfield13.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield13.hasValue() ? "crossOrderAcknowledgmentReturnBitfield13 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield14Present() != crossOrderAcknowledgmentReturnBitfield14.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield14.hasValue() ? "crossOrderAcknowledgmentReturnBitfield14 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield15Present() != crossOrderAcknowledgmentReturnBitfield15.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield15.hasValue() ? "crossOrderAcknowledgmentReturnBitfield15 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield16Present() != crossOrderAcknowledgmentReturnBitfield16.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield16.hasValue() ? "crossOrderAcknowledgmentReturnBitfield16 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield17Present() != crossOrderAcknowledgmentReturnBitfield17.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield17.hasValue() ? "crossOrderAcknowledgmentReturnBitfield17 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield18Present() != crossOrderAcknowledgmentReturnBitfield18.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield18.hasValue() ? "crossOrderAcknowledgmentReturnBitfield18 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderAcknowledgmentReturnBitfield19Present() != crossOrderAcknowledgmentReturnBitfield19.hasValue()) {
            throw new IllegalStateException(crossOrderAcknowledgmentReturnBitfield19.hasValue() ? "crossOrderAcknowledgmentReturnBitfield19 holds a value the fields before it leave off the wire" : "crossOrderAcknowledgmentReturnBitfield19 holds no value, though the fields before it put it on the wire");
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
        if (liquidityProvisionPresent() != liquidityProvision.hasValue()) {
            throw new IllegalStateException(liquidityProvision.hasValue() ? "liquidityProvision holds a value the fields before it leave off the wire" : "liquidityProvision holds no value, though the fields before it put it on the wire");
        }
        if (crossTypePresent() != crossType.hasValue()) {
            throw new IllegalStateException(crossType.hasValue() ? "crossType holds a value the fields before it leave off the wire" : "crossType holds no value, though the fields before it put it on the wire");
        }
        if (crossPrioritizationPresent() != crossPrioritization.hasValue()) {
            throw new IllegalStateException(crossPrioritization.hasValue() ? "crossPrioritization holds a value the fields before it leave off the wire" : "crossPrioritization holds no value, though the fields before it put it on the wire");
        }
        if (routingFirmIdPresent() != routingFirmId.hasValue()) {
            throw new IllegalStateException(routingFirmId.hasValue() ? "routingFirmId holds a value the fields before it leave off the wire" : "routingFirmId holds no value, though the fields before it put it on the wire");
        }
        if (drillThruProtectionPresent() != drillThruProtection.hasValue()) {
            throw new IllegalStateException(drillThruProtection.hasValue() ? "drillThruProtection holds a value the fields before it leave off the wire" : "drillThruProtection holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = crossId.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        if (buffer != null && buffer.length >= 37) {
            System.arraycopy(buffer, 36, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (crossOrderAcknowledgmentReturnBitfield1Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield1.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield2Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield2.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield3Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield3.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield4Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield4.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield5Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield5.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield6Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield6.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield7Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield7.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield8Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield8.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield9Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield9.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield10Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield10.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield11Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield11.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield12Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield12.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield13Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield13.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield14Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield14.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield15Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield15.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield16Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield16.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield17Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield17.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield18Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield18.encode(data, cursor);
        }
        if (crossOrderAcknowledgmentReturnBitfield19Present()) {
            cursor = crossOrderAcknowledgmentReturnBitfield19.encode(data, cursor);
        }
        cursor = groupCnt.encode(data, cursor);
        cursor = crossOrderAcknowledgmentOrderAllocations.encode(data, cursor);
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
        if (liquidityProvisionPresent()) {
            cursor = liquidityProvision.encode(data, cursor);
        }
        if (crossTypePresent()) {
            cursor = crossType.encode(data, cursor);
        }
        if (crossPrioritizationPresent()) {
            cursor = crossPrioritization.encode(data, cursor);
        }
        if (routingFirmIdPresent()) {
            cursor = routingFirmId.encode(data, cursor);
        }
        if (drillThruProtectionPresent()) {
            cursor = drillThruProtection.encode(data, cursor);
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
        crossOrderAcknowledgmentOrderAllocations.clear();
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
        return crossOrderAcknowledgmentOrderAllocations.isRecognized();
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
        if (!crossOrderAcknowledgmentOrderAllocations.isValid()) {
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
        if (!auctionId.isDecoded()) {
            return Optional.of(auctionId);
        }
        if (!numberOfReturnBitfields.isDecoded()) {
            return Optional.of(numberOfReturnBitfields);
        }
        if (crossOrderAcknowledgmentReturnBitfield1Present() && !crossOrderAcknowledgmentReturnBitfield1.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield1);
        }
        if (crossOrderAcknowledgmentReturnBitfield2Present() && !crossOrderAcknowledgmentReturnBitfield2.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield2);
        }
        if (crossOrderAcknowledgmentReturnBitfield3Present() && !crossOrderAcknowledgmentReturnBitfield3.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield3);
        }
        if (crossOrderAcknowledgmentReturnBitfield4Present() && !crossOrderAcknowledgmentReturnBitfield4.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield4);
        }
        if (crossOrderAcknowledgmentReturnBitfield5Present() && !crossOrderAcknowledgmentReturnBitfield5.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield5);
        }
        if (crossOrderAcknowledgmentReturnBitfield6Present() && !crossOrderAcknowledgmentReturnBitfield6.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield6);
        }
        if (crossOrderAcknowledgmentReturnBitfield7Present() && !crossOrderAcknowledgmentReturnBitfield7.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield7);
        }
        if (crossOrderAcknowledgmentReturnBitfield8Present() && !crossOrderAcknowledgmentReturnBitfield8.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield8);
        }
        if (crossOrderAcknowledgmentReturnBitfield9Present() && !crossOrderAcknowledgmentReturnBitfield9.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield9);
        }
        if (crossOrderAcknowledgmentReturnBitfield10Present() && !crossOrderAcknowledgmentReturnBitfield10.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield10);
        }
        if (crossOrderAcknowledgmentReturnBitfield11Present() && !crossOrderAcknowledgmentReturnBitfield11.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield11);
        }
        if (crossOrderAcknowledgmentReturnBitfield12Present() && !crossOrderAcknowledgmentReturnBitfield12.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield12);
        }
        if (crossOrderAcknowledgmentReturnBitfield13Present() && !crossOrderAcknowledgmentReturnBitfield13.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield13);
        }
        if (crossOrderAcknowledgmentReturnBitfield14Present() && !crossOrderAcknowledgmentReturnBitfield14.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield14);
        }
        if (crossOrderAcknowledgmentReturnBitfield15Present() && !crossOrderAcknowledgmentReturnBitfield15.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield15);
        }
        if (crossOrderAcknowledgmentReturnBitfield16Present() && !crossOrderAcknowledgmentReturnBitfield16.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield16);
        }
        if (crossOrderAcknowledgmentReturnBitfield17Present() && !crossOrderAcknowledgmentReturnBitfield17.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield17);
        }
        if (crossOrderAcknowledgmentReturnBitfield18Present() && !crossOrderAcknowledgmentReturnBitfield18.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield18);
        }
        if (crossOrderAcknowledgmentReturnBitfield19Present() && !crossOrderAcknowledgmentReturnBitfield19.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentReturnBitfield19);
        }
        if (!groupCnt.isDecoded()) {
            return Optional.of(groupCnt);
        }
        if (!crossOrderAcknowledgmentOrderAllocations.isDecoded()) {
            return Optional.of(crossOrderAcknowledgmentOrderAllocations.failedEntry().flatMap(CrossOrderAcknowledgmentOrderAllocationsEntry::failedAt).orElse(groupCnt));
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
        if (liquidityProvisionPresent() && !liquidityProvision.isDecoded()) {
            return Optional.of(liquidityProvision);
        }
        if (crossTypePresent() && !crossType.isDecoded()) {
            return Optional.of(crossType);
        }
        if (crossPrioritizationPresent() && !crossPrioritization.isDecoded()) {
            return Optional.of(crossPrioritization);
        }
        if (routingFirmIdPresent() && !routingFirmId.isDecoded()) {
            return Optional.of(routingFirmId);
        }
        if (drillThruProtectionPresent() && !drillThruProtection.isDecoded()) {
            return Optional.of(drillThruProtection);
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
            case "AuctionId" -> Optional.of(auctionId);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "CrossOrderAcknowledgmentReturnBitfield1" -> Optional.of(crossOrderAcknowledgmentReturnBitfield1);
            case "CrossOrderAcknowledgmentReturnBitfield2" -> Optional.of(crossOrderAcknowledgmentReturnBitfield2);
            case "CrossOrderAcknowledgmentReturnBitfield3" -> Optional.of(crossOrderAcknowledgmentReturnBitfield3);
            case "CrossOrderAcknowledgmentReturnBitfield4" -> Optional.of(crossOrderAcknowledgmentReturnBitfield4);
            case "CrossOrderAcknowledgmentReturnBitfield5" -> Optional.of(crossOrderAcknowledgmentReturnBitfield5);
            case "CrossOrderAcknowledgmentReturnBitfield6" -> Optional.of(crossOrderAcknowledgmentReturnBitfield6);
            case "CrossOrderAcknowledgmentReturnBitfield7" -> Optional.of(crossOrderAcknowledgmentReturnBitfield7);
            case "CrossOrderAcknowledgmentReturnBitfield8" -> Optional.of(crossOrderAcknowledgmentReturnBitfield8);
            case "CrossOrderAcknowledgmentReturnBitfield9" -> Optional.of(crossOrderAcknowledgmentReturnBitfield9);
            case "CrossOrderAcknowledgmentReturnBitfield10" -> Optional.of(crossOrderAcknowledgmentReturnBitfield10);
            case "CrossOrderAcknowledgmentReturnBitfield11" -> Optional.of(crossOrderAcknowledgmentReturnBitfield11);
            case "CrossOrderAcknowledgmentReturnBitfield12" -> Optional.of(crossOrderAcknowledgmentReturnBitfield12);
            case "CrossOrderAcknowledgmentReturnBitfield13" -> Optional.of(crossOrderAcknowledgmentReturnBitfield13);
            case "CrossOrderAcknowledgmentReturnBitfield14" -> Optional.of(crossOrderAcknowledgmentReturnBitfield14);
            case "CrossOrderAcknowledgmentReturnBitfield15" -> Optional.of(crossOrderAcknowledgmentReturnBitfield15);
            case "CrossOrderAcknowledgmentReturnBitfield16" -> Optional.of(crossOrderAcknowledgmentReturnBitfield16);
            case "CrossOrderAcknowledgmentReturnBitfield17" -> Optional.of(crossOrderAcknowledgmentReturnBitfield17);
            case "CrossOrderAcknowledgmentReturnBitfield18" -> Optional.of(crossOrderAcknowledgmentReturnBitfield18);
            case "CrossOrderAcknowledgmentReturnBitfield19" -> Optional.of(crossOrderAcknowledgmentReturnBitfield19);
            case "GroupCnt" -> Optional.of(groupCnt);
            case "Price" -> Optional.of(price);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "IdSource" -> Optional.of(idSource);
            case "SecurityId" -> Optional.of(securityId);
            case "OrderQty" -> Optional.of(orderQty);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "ExtExecInst" -> Optional.of(extExecInst);
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "CrossType" -> Optional.of(crossType);
            case "CrossPrioritization" -> Optional.of(crossPrioritization);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "DrillThruProtection" -> Optional.of(drillThruProtection);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CrossOrderAcknowledgmentMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(crossOrderAcknowledgmentOrderAllocations.diffFields(message.crossOrderAcknowledgmentOrderAllocations));
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
            crossOrderAcknowledgmentOrderAllocations.toFormattedString(builder, options);
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
        crossOrderAcknowledgmentOrderAllocations.toFormattedString(builder, nested);
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
        if (!(other instanceof CrossOrderAcknowledgmentMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && crossOrderAcknowledgmentOrderAllocations.equals(message.crossOrderAcknowledgmentOrderAllocations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, crossOrderAcknowledgmentOrderAllocations);
    }
}
