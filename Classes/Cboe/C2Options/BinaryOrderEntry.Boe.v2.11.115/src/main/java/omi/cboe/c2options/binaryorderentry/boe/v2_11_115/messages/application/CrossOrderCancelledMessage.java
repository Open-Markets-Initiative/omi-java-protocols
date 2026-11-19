package omi.cboe.c2options.binaryorderentry.boe.v2_11_115.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.AttributedQuoteField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.AuctionIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CancelReasonField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.ClearingFirmField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CompressionField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossInitiatorField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOnBehalfOfIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield10Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield11Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield12Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield13Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield14Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield15Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield16Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield17Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield18Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield19Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield1Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield20Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield21Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield2Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield3Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield4Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield5Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield6Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield7Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield8Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossOrderCancelledReturnBitfield9Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossPrioritizationField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.CrossTypeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.EquityPartyIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.ExecInstField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.FrequentTraderIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.GroupCntField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.MaturityDateField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.NumberOfReturnBitfieldsField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.OrderQtyBinaryField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.PreventMatchField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.PriceBinaryPriceField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.PutOrCallField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.RoutingFirmIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.StrikePriceField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.SymbolAlphanumericField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.TargetPartyIdField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.fields.TransactionTimeField;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.groups.CrossOrderCancelledOrderAllocationsEntry;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.groups.CrossOrderCancelledOrderAllocationsList;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.types.Field;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.types.Message;
import omi.cboe.c2options.binaryorderentry.boe.v2_11_115.types.PrintOptions;

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
     * Report send time (for audit).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to CrossID (548) in Cboe FIX. Day-unique identifier for the cross order chosen by the client. Characters in the ASCII range 33- 126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes.
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * Reason for the order cancellation. See Order Reason Codes for a list of possible reasons.
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
     * BitSet CrossOrderCancelled byte 20.
     */
    private final CrossOrderCancelledReturnBitfield20Field crossOrderCancelledReturnBitfield20 = new CrossOrderCancelledReturnBitfield20Field();

    /**
     * BitSet CrossOrderCancelled byte 21.
     */
    private final CrossOrderCancelledReturnBitfield21Field crossOrderCancelledReturnBitfield21 = new CrossOrderCancelledReturnBitfield21Field();

    /**
     * Number of order allocations represented by re- peating groups included in this cross order. Must be at least 2 (One agency and one contra), and no more than 11.
     */
    private final GroupCntField groupCnt = new GroupCntField();

    /**
     * Price Binary Price
     */
    private final PriceBinaryPriceField priceBinaryPrice = new PriceBinaryPriceField();

    /**
     * Exec Inst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Symbol Alphanumeric
     */
    private final SymbolAlphanumericField symbolAlphanumeric = new SymbolAlphanumericField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 contracts.
     */
    private final OrderQtyBinaryField orderQtyBinary = new OrderQtyBinaryField();

    /**
     * Prevent Match
     */
    private final PreventMatchField preventMatch = new PreventMatchField();

    /**
     * Maturity Date
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Strike Price
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Put Or Call
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Attributed Quote
     */
    private final AttributedQuoteField attributedQuote = new AttributedQuoteField();

    /**
     * Target Party Id
     */
    private final TargetPartyIdField targetPartyId = new TargetPartyIdField();

    /**
     * Auction Id
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Corresponds to CrossType (549) in Cboe FIX. Type of auction order being submitted. This indicates the type of auction that will be initiated upon order entry. 1 = Automated Improvement Mechanism (AIM) 2 = Qualified Contingent Cross (QCC) 3 = Solicitation Cross (SAM) 4 = Position Compression Cross (PCC) (C1 Only)
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * Corresponds to CrossPrioritization (550) in Cboe FIX. Indicates which side of the cross order will be prioritized for execution. This identifies the Agency side. 1 = Buy 2 = Sell
     */
    private final CrossPrioritizationField crossPrioritization = new CrossPrioritizationField();

    /**
     * Routing Firm Id
     */
    private final RoutingFirmIdField routingFirmId = new RoutingFirmIdField();

    /**
     * Equity Party Id
     */
    private final EquityPartyIdField equityPartyId = new EquityPartyIdField();

    /**
     * Frequent Trader Id
     */
    private final FrequentTraderIdField frequentTraderId = new FrequentTraderIdField();

    /**
     * Compression
     */
    private final CompressionField compression = new CompressionField();

    /**
     * Cross Initiator
     */
    private final CrossInitiatorField crossInitiator = new CrossInitiatorField();

    /**
     * Cross On Behalf Of Id
     */
    private final CrossOnBehalfOfIdField crossOnBehalfOfId = new CrossOnBehalfOfIdField();

    /**
     * Repeating group stated GroupCnt times.
     */
    private final CrossOrderCancelledOrderAllocationsList crossOrderCancelledOrderAllocations = new CrossOrderCancelledOrderAllocationsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, crossId, cancelReason, numberOfReturnBitfields, crossOrderCancelledReturnBitfield1, crossOrderCancelledReturnBitfield2, crossOrderCancelledReturnBitfield3, crossOrderCancelledReturnBitfield4, crossOrderCancelledReturnBitfield5, crossOrderCancelledReturnBitfield6, crossOrderCancelledReturnBitfield7, crossOrderCancelledReturnBitfield8, crossOrderCancelledReturnBitfield9, crossOrderCancelledReturnBitfield10, crossOrderCancelledReturnBitfield11, crossOrderCancelledReturnBitfield12, crossOrderCancelledReturnBitfield13, crossOrderCancelledReturnBitfield14, crossOrderCancelledReturnBitfield15, crossOrderCancelledReturnBitfield16, crossOrderCancelledReturnBitfield17, crossOrderCancelledReturnBitfield18, crossOrderCancelledReturnBitfield19, crossOrderCancelledReturnBitfield20, crossOrderCancelledReturnBitfield21, groupCnt, priceBinaryPrice, execInst, symbolAlphanumeric, clearingFirm, orderQtyBinary, preventMatch, maturityDate, strikePrice, putOrCall, attributedQuote, targetPartyId, auctionId, crossType, crossPrioritization, routingFirmId, equityPartyId, frequentTraderId, compression, crossInitiator, crossOnBehalfOfId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Report send time (for audit).
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Corresponds to CrossID (548) in Cboe FIX. Day-unique identifier for the cross order chosen by the client. Characters in the ASCII range 33- 126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes.
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
    }

    /**
     * Reason for the order cancellation. See Order Reason Codes for a list of possible reasons.
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
     * BitSet CrossOrderCancelled byte 20.
     *
     * @return the CrossOrderCancelledReturnBitfield20 field
     */
    public CrossOrderCancelledReturnBitfield20Field crossOrderCancelledReturnBitfield20() {
        return crossOrderCancelledReturnBitfield20;
    }

    /**
     * BitSet CrossOrderCancelled byte 21.
     *
     * @return the CrossOrderCancelledReturnBitfield21 field
     */
    public CrossOrderCancelledReturnBitfield21Field crossOrderCancelledReturnBitfield21() {
        return crossOrderCancelledReturnBitfield21;
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
     * Price Binary Price
     *
     * @return the PriceBinaryPrice field
     */
    public PriceBinaryPriceField priceBinaryPrice() {
        return priceBinaryPrice;
    }

    /**
     * Exec Inst
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * Symbol Alphanumeric
     *
     * @return the SymbolAlphanumeric field
     */
    public SymbolAlphanumericField symbolAlphanumeric() {
        return symbolAlphanumeric;
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
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 contracts.
     *
     * @return the OrderQtyBinary field
     */
    public OrderQtyBinaryField orderQtyBinary() {
        return orderQtyBinary;
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
     * Maturity Date
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * Strike Price
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Put Or Call
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * Attributed Quote
     *
     * @return the AttributedQuote field
     */
    public AttributedQuoteField attributedQuote() {
        return attributedQuote;
    }

    /**
     * Target Party Id
     *
     * @return the TargetPartyId field
     */
    public TargetPartyIdField targetPartyId() {
        return targetPartyId;
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
     * Corresponds to CrossType (549) in Cboe FIX. Type of auction order being submitted. This indicates the type of auction that will be initiated upon order entry. 1 = Automated Improvement Mechanism (AIM) 2 = Qualified Contingent Cross (QCC) 3 = Solicitation Cross (SAM) 4 = Position Compression Cross (PCC) (C1 Only)
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * Corresponds to CrossPrioritization (550) in Cboe FIX. Indicates which side of the cross order will be prioritized for execution. This identifies the Agency side. 1 = Buy 2 = Sell
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
     * Equity Party Id
     *
     * @return the EquityPartyId field
     */
    public EquityPartyIdField equityPartyId() {
        return equityPartyId;
    }

    /**
     * Frequent Trader Id
     *
     * @return the FrequentTraderId field
     */
    public FrequentTraderIdField frequentTraderId() {
        return frequentTraderId;
    }

    /**
     * Compression
     *
     * @return the Compression field
     */
    public CompressionField compression() {
        return compression;
    }

    /**
     * Cross Initiator
     *
     * @return the CrossInitiator field
     */
    public CrossInitiatorField crossInitiator() {
        return crossInitiator;
    }

    /**
     * Cross On Behalf Of Id
     *
     * @return the CrossOnBehalfOfId field
     */
    public CrossOnBehalfOfIdField crossOnBehalfOfId() {
        return crossOnBehalfOfId;
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
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield20 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield20 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield20 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield20Present() {
        return numberOfReturnBitfields.value() >= 20L;
    }

    /**
     * Returns whether the fields before the CrossOrderCancelledReturnBitfield21 put it on the wire.
     *
     * <p>Decode reads the CrossOrderCancelledReturnBitfield21 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOrderCancelledReturnBitfield21 is on the wire
     */
    public boolean crossOrderCancelledReturnBitfield21Present() {
        return numberOfReturnBitfields.value() >= 21L;
    }

    /**
     * Returns whether the fields before the PriceBinaryPrice put it on the wire.
     *
     * <p>Decode reads the PriceBinaryPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceBinaryPrice is on the wire
     */
    public boolean priceBinaryPricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (crossOrderCancelledReturnBitfield1Present() && crossOrderCancelledReturnBitfield1.crossOrderCancelledReturnBitfield1Price());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (crossOrderCancelledReturnBitfield1Present() && crossOrderCancelledReturnBitfield1.crossOrderCancelledReturnBitfield1ExecInst());
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
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (crossOrderCancelledReturnBitfield3Present() && crossOrderCancelledReturnBitfield3.crossOrderCancelledReturnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the OrderQtyBinary put it on the wire.
     *
     * <p>Decode reads the OrderQtyBinary where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQtyBinary is on the wire
     */
    public boolean orderQtyBinaryPresent() {
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
     * Returns whether the fields before the MaturityDate put it on the wire.
     *
     * <p>Decode reads the MaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaturityDate is on the wire
     */
    public boolean maturityDatePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (crossOrderCancelledReturnBitfield4Present() && crossOrderCancelledReturnBitfield4.crossOrderCancelledReturnBitfield4MaturityDate());
    }

    /**
     * Returns whether the fields before the StrikePrice put it on the wire.
     *
     * <p>Decode reads the StrikePrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StrikePrice is on the wire
     */
    public boolean strikePricePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (crossOrderCancelledReturnBitfield4Present() && crossOrderCancelledReturnBitfield4.crossOrderCancelledReturnBitfield4StrikePrice());
    }

    /**
     * Returns whether the fields before the PutOrCall put it on the wire.
     *
     * <p>Decode reads the PutOrCall where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PutOrCall is on the wire
     */
    public boolean putOrCallPresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (crossOrderCancelledReturnBitfield4Present() && crossOrderCancelledReturnBitfield4.crossOrderCancelledReturnBitfield4PutOrCall());
    }

    /**
     * Returns whether the fields before the AttributedQuote put it on the wire.
     *
     * <p>Decode reads the AttributedQuote where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AttributedQuote is on the wire
     */
    public boolean attributedQuotePresent() {
        return (numberOfReturnBitfields.value() >= 6L) && (crossOrderCancelledReturnBitfield6Present() && crossOrderCancelledReturnBitfield6.crossOrderCancelledReturnBitfield6AttributedQuote());
    }

    /**
     * Returns whether the fields before the TargetPartyId put it on the wire.
     *
     * <p>Decode reads the TargetPartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TargetPartyId is on the wire
     */
    public boolean targetPartyIdPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (crossOrderCancelledReturnBitfield9Present() && crossOrderCancelledReturnBitfield9.crossOrderCancelledReturnBitfield9TargetPartyId());
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

    /**
     * Returns whether the fields before the RoutingFirmId put it on the wire.
     *
     * <p>Decode reads the RoutingFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingFirmId is on the wire
     */
    public boolean routingFirmIdPresent() {
        return (numberOfReturnBitfields.value() >= 10L) && (crossOrderCancelledReturnBitfield10Present() && crossOrderCancelledReturnBitfield10.crossOrderCancelledReturnBitfield10RoutingFirmId());
    }

    /**
     * Returns whether the fields before the EquityPartyId put it on the wire.
     *
     * <p>Decode reads the EquityPartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityPartyId is on the wire
     */
    public boolean equityPartyIdPresent() {
        return (numberOfReturnBitfields.value() >= 15L) && (crossOrderCancelledReturnBitfield15Present() && crossOrderCancelledReturnBitfield15.crossOrderCancelledReturnBitfield15EquityPartyId());
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (crossOrderCancelledReturnBitfield16Present() && crossOrderCancelledReturnBitfield16.crossOrderCancelledReturnBitfield16FrequentTraderId());
    }

    /**
     * Returns whether the fields before the Compression put it on the wire.
     *
     * <p>Decode reads the Compression where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Compression is on the wire
     */
    public boolean compressionPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (crossOrderCancelledReturnBitfield16Present() && crossOrderCancelledReturnBitfield16.crossOrderCancelledReturnBitfield16Compression());
    }

    /**
     * Returns whether the fields before the CrossInitiator put it on the wire.
     *
     * <p>Decode reads the CrossInitiator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossInitiator is on the wire
     */
    public boolean crossInitiatorPresent() {
        return (numberOfReturnBitfields.value() >= 18L) && (crossOrderCancelledReturnBitfield18Present() && crossOrderCancelledReturnBitfield18.crossOrderCancelledReturnBitfield18CrossInitiator());
    }

    /**
     * Returns whether the fields before the CrossOnBehalfOfId put it on the wire.
     *
     * <p>Decode reads the CrossOnBehalfOfId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOnBehalfOfId is on the wire
     */
    public boolean crossOnBehalfOfIdPresent() {
        return (numberOfReturnBitfields.value() >= 19L) && (crossOrderCancelledReturnBitfield19Present() && crossOrderCancelledReturnBitfield19.crossOrderCancelledReturnBitfield19CrossOnBehalfOfId());
    }

    private boolean onWire(Field field) {
        return (field != crossOrderCancelledReturnBitfield1 || crossOrderCancelledReturnBitfield1Present()) && (field != crossOrderCancelledReturnBitfield2 || crossOrderCancelledReturnBitfield2Present()) && (field != crossOrderCancelledReturnBitfield3 || crossOrderCancelledReturnBitfield3Present()) && (field != crossOrderCancelledReturnBitfield4 || crossOrderCancelledReturnBitfield4Present()) && (field != crossOrderCancelledReturnBitfield5 || crossOrderCancelledReturnBitfield5Present()) && (field != crossOrderCancelledReturnBitfield6 || crossOrderCancelledReturnBitfield6Present()) && (field != crossOrderCancelledReturnBitfield7 || crossOrderCancelledReturnBitfield7Present()) && (field != crossOrderCancelledReturnBitfield8 || crossOrderCancelledReturnBitfield8Present()) && (field != crossOrderCancelledReturnBitfield9 || crossOrderCancelledReturnBitfield9Present()) && (field != crossOrderCancelledReturnBitfield10 || crossOrderCancelledReturnBitfield10Present()) && (field != crossOrderCancelledReturnBitfield11 || crossOrderCancelledReturnBitfield11Present()) && (field != crossOrderCancelledReturnBitfield12 || crossOrderCancelledReturnBitfield12Present()) && (field != crossOrderCancelledReturnBitfield13 || crossOrderCancelledReturnBitfield13Present()) && (field != crossOrderCancelledReturnBitfield14 || crossOrderCancelledReturnBitfield14Present()) && (field != crossOrderCancelledReturnBitfield15 || crossOrderCancelledReturnBitfield15Present()) && (field != crossOrderCancelledReturnBitfield16 || crossOrderCancelledReturnBitfield16Present()) && (field != crossOrderCancelledReturnBitfield17 || crossOrderCancelledReturnBitfield17Present()) && (field != crossOrderCancelledReturnBitfield18 || crossOrderCancelledReturnBitfield18Present()) && (field != crossOrderCancelledReturnBitfield19 || crossOrderCancelledReturnBitfield19Present()) && (field != crossOrderCancelledReturnBitfield20 || crossOrderCancelledReturnBitfield20Present()) && (field != crossOrderCancelledReturnBitfield21 || crossOrderCancelledReturnBitfield21Present()) && (field != priceBinaryPrice || priceBinaryPricePresent()) && (field != execInst || execInstPresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != orderQtyBinary || orderQtyBinaryPresent()) && (field != preventMatch || preventMatchPresent()) && (field != maturityDate || maturityDatePresent()) && (field != strikePrice || strikePricePresent()) && (field != putOrCall || putOrCallPresent()) && (field != attributedQuote || attributedQuotePresent()) && (field != targetPartyId || targetPartyIdPresent()) && (field != auctionId || auctionIdPresent()) && (field != crossType || crossTypePresent()) && (field != crossPrioritization || crossPrioritizationPresent()) && (field != routingFirmId || routingFirmIdPresent()) && (field != equityPartyId || equityPartyIdPresent()) && (field != frequentTraderId || frequentTraderIdPresent()) && (field != compression || compressionPresent()) && (field != crossInitiator || crossInitiatorPresent()) && (field != crossOnBehalfOfId || crossOnBehalfOfIdPresent());
    }

    /**
     * Hands each list whose entries read this record's fields the values they read, none for a field off the wire.
     */
    private void giveEntryInputs() {
        crossOrderCancelledOrderAllocations.inputs(OptionalLong.of(numberOfReturnBitfields.value()), crossOrderCancelledReturnBitfield1Present() ? OptionalLong.of(crossOrderCancelledReturnBitfield1.value()) : OptionalLong.empty(), crossOrderCancelledReturnBitfield10Present() ? OptionalLong.of(crossOrderCancelledReturnBitfield10.value()) : OptionalLong.empty(), crossOrderCancelledReturnBitfield2Present() ? OptionalLong.of(crossOrderCancelledReturnBitfield2.value()) : OptionalLong.empty(), crossOrderCancelledReturnBitfield4Present() ? OptionalLong.of(crossOrderCancelledReturnBitfield4.value()) : OptionalLong.empty(), crossOrderCancelledReturnBitfield3Present() ? OptionalLong.of(crossOrderCancelledReturnBitfield3.value()) : OptionalLong.empty(), crossOrderCancelledReturnBitfield9Present() ? OptionalLong.of(crossOrderCancelledReturnBitfield9.value()) : OptionalLong.empty());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        giveEntryInputs();
        return MINIMUM_BYTE_LENGTH + (crossOrderCancelledReturnBitfield1Present() ? CrossOrderCancelledReturnBitfield1Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield2Present() ? CrossOrderCancelledReturnBitfield2Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield3Present() ? CrossOrderCancelledReturnBitfield3Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield4Present() ? CrossOrderCancelledReturnBitfield4Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield5Present() ? CrossOrderCancelledReturnBitfield5Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield6Present() ? CrossOrderCancelledReturnBitfield6Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield7Present() ? CrossOrderCancelledReturnBitfield7Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield8Present() ? CrossOrderCancelledReturnBitfield8Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield9Present() ? CrossOrderCancelledReturnBitfield9Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield10Present() ? CrossOrderCancelledReturnBitfield10Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield11Present() ? CrossOrderCancelledReturnBitfield11Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield12Present() ? CrossOrderCancelledReturnBitfield12Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield13Present() ? CrossOrderCancelledReturnBitfield13Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield14Present() ? CrossOrderCancelledReturnBitfield14Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield15Present() ? CrossOrderCancelledReturnBitfield15Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield16Present() ? CrossOrderCancelledReturnBitfield16Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield17Present() ? CrossOrderCancelledReturnBitfield17Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield18Present() ? CrossOrderCancelledReturnBitfield18Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield19Present() ? CrossOrderCancelledReturnBitfield19Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield20Present() ? CrossOrderCancelledReturnBitfield20Field.BYTE_LENGTH : 0) + (crossOrderCancelledReturnBitfield21Present() ? CrossOrderCancelledReturnBitfield21Field.BYTE_LENGTH : 0) + crossOrderCancelledOrderAllocations.byteLength() + (priceBinaryPricePresent() ? PriceBinaryPriceField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (orderQtyBinaryPresent() ? OrderQtyBinaryField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (strikePricePresent() ? StrikePriceField.BYTE_LENGTH : 0) + (putOrCallPresent() ? PutOrCallField.BYTE_LENGTH : 0) + (attributedQuotePresent() ? AttributedQuoteField.BYTE_LENGTH : 0) + (targetPartyIdPresent() ? TargetPartyIdField.BYTE_LENGTH : 0) + (auctionIdPresent() ? AuctionIdField.BYTE_LENGTH : 0) + (crossTypePresent() ? CrossTypeField.BYTE_LENGTH : 0) + (crossPrioritizationPresent() ? CrossPrioritizationField.BYTE_LENGTH : 0) + (routingFirmIdPresent() ? RoutingFirmIdField.BYTE_LENGTH : 0) + (equityPartyIdPresent() ? EquityPartyIdField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0) + (compressionPresent() ? CompressionField.BYTE_LENGTH : 0) + (crossInitiatorPresent() ? CrossInitiatorField.BYTE_LENGTH : 0) + (crossOnBehalfOfIdPresent() ? CrossOnBehalfOfIdField.BYTE_LENGTH : 0);
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
        if (crossOrderCancelledReturnBitfield20Present()) {
            cursor += 1;
        }
        if (crossOrderCancelledReturnBitfield21Present()) {
            cursor += 1;
        }
        cursor += 2;
        cursor += crossOrderCancelledOrderAllocations.byteLength();
        if (priceBinaryPricePresent()) {
            cursor += 8;
        }
        if (execInstPresent()) {
            cursor += 1;
        }
        if (symbolAlphanumericPresent()) {
            cursor += 8;
        }
        if (clearingFirmPresent()) {
            cursor += 4;
        }
        if (orderQtyBinaryPresent()) {
            cursor += 4;
        }
        if (preventMatchPresent()) {
            cursor += 3;
        }
        if (maturityDatePresent()) {
            cursor += 4;
        }
        if (strikePricePresent()) {
            cursor += 8;
        }
        if (putOrCallPresent()) {
            cursor += 1;
        }
        if (attributedQuotePresent()) {
            cursor += 1;
        }
        if (targetPartyIdPresent()) {
            cursor += 4;
        }
        if (auctionIdPresent()) {
            cursor += 8;
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
        if (equityPartyIdPresent()) {
            cursor += 4;
        }
        if (frequentTraderIdPresent()) {
            cursor += 6;
        }
        if (compressionPresent()) {
            cursor += 1;
        }
        if (crossInitiatorPresent()) {
            cursor += 4;
        }
        if (crossOnBehalfOfIdPresent()) {
            cursor += 4;
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
        if (crossOrderCancelledReturnBitfield20Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield20Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield20.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield20Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (crossOrderCancelledReturnBitfield21Present()) {
            if (end - 2 - cursor < CrossOrderCancelledReturnBitfield21Field.BYTE_LENGTH || !crossOrderCancelledReturnBitfield21.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOrderCancelledReturnBitfield21Field.BYTE_LENGTH;
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
        if (priceBinaryPricePresent()) {
            if (end - cursor < PriceBinaryPriceField.BYTE_LENGTH || !priceBinaryPrice.parse(data, cursor)) {
                return false;
            }
            cursor += PriceBinaryPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (execInstPresent()) {
            if (end - cursor < ExecInstField.BYTE_LENGTH || !execInst.parse(data, cursor)) {
                return false;
            }
            cursor += ExecInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (symbolAlphanumericPresent()) {
            if (end - cursor < SymbolAlphanumericField.BYTE_LENGTH || !symbolAlphanumeric.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolAlphanumericField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingFirmPresent()) {
            if (end - cursor < ClearingFirmField.BYTE_LENGTH || !clearingFirm.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderQtyBinaryPresent()) {
            if (end - cursor < OrderQtyBinaryField.BYTE_LENGTH || !orderQtyBinary.parse(data, cursor)) {
                return false;
            }
            cursor += OrderQtyBinaryField.BYTE_LENGTH;
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
        if (maturityDatePresent()) {
            if (end - cursor < MaturityDateField.BYTE_LENGTH || !maturityDate.parse(data, cursor)) {
                return false;
            }
            cursor += MaturityDateField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (strikePricePresent()) {
            if (end - cursor < StrikePriceField.BYTE_LENGTH || !strikePrice.parse(data, cursor)) {
                return false;
            }
            cursor += StrikePriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (putOrCallPresent()) {
            if (end - cursor < PutOrCallField.BYTE_LENGTH || !putOrCall.parse(data, cursor)) {
                return false;
            }
            cursor += PutOrCallField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (attributedQuotePresent()) {
            if (end - cursor < AttributedQuoteField.BYTE_LENGTH || !attributedQuote.parse(data, cursor)) {
                return false;
            }
            cursor += AttributedQuoteField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (targetPartyIdPresent()) {
            if (end - cursor < TargetPartyIdField.BYTE_LENGTH || !targetPartyId.parse(data, cursor)) {
                return false;
            }
            cursor += TargetPartyIdField.BYTE_LENGTH;
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
        if (equityPartyIdPresent()) {
            if (end - cursor < EquityPartyIdField.BYTE_LENGTH || !equityPartyId.parse(data, cursor)) {
                return false;
            }
            cursor += EquityPartyIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (frequentTraderIdPresent()) {
            if (end - cursor < FrequentTraderIdField.BYTE_LENGTH || !frequentTraderId.parse(data, cursor)) {
                return false;
            }
            cursor += FrequentTraderIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (compressionPresent()) {
            if (end - cursor < CompressionField.BYTE_LENGTH || !compression.parse(data, cursor)) {
                return false;
            }
            cursor += CompressionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossInitiatorPresent()) {
            if (end - cursor < CrossInitiatorField.BYTE_LENGTH || !crossInitiator.parse(data, cursor)) {
                return false;
            }
            cursor += CrossInitiatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (crossOnBehalfOfIdPresent()) {
            if (end - cursor < CrossOnBehalfOfIdField.BYTE_LENGTH || !crossOnBehalfOfId.parse(data, cursor)) {
                return false;
            }
            cursor += CrossOnBehalfOfIdField.BYTE_LENGTH;
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
        if (crossOrderCancelledReturnBitfield20Present() != crossOrderCancelledReturnBitfield20.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield20.hasValue() ? "crossOrderCancelledReturnBitfield20 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield20 holds no value, though the fields before it put it on the wire");
        }
        if (crossOrderCancelledReturnBitfield21Present() != crossOrderCancelledReturnBitfield21.hasValue()) {
            throw new IllegalStateException(crossOrderCancelledReturnBitfield21.hasValue() ? "crossOrderCancelledReturnBitfield21 holds a value the fields before it leave off the wire" : "crossOrderCancelledReturnBitfield21 holds no value, though the fields before it put it on the wire");
        }
        if (priceBinaryPricePresent() != priceBinaryPrice.hasValue()) {
            throw new IllegalStateException(priceBinaryPrice.hasValue() ? "priceBinaryPrice holds a value the fields before it leave off the wire" : "priceBinaryPrice holds no value, though the fields before it put it on the wire");
        }
        if (execInstPresent() != execInst.hasValue()) {
            throw new IllegalStateException(execInst.hasValue() ? "execInst holds a value the fields before it leave off the wire" : "execInst holds no value, though the fields before it put it on the wire");
        }
        if (symbolAlphanumericPresent() != symbolAlphanumeric.hasValue()) {
            throw new IllegalStateException(symbolAlphanumeric.hasValue() ? "symbolAlphanumeric holds a value the fields before it leave off the wire" : "symbolAlphanumeric holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (orderQtyBinaryPresent() != orderQtyBinary.hasValue()) {
            throw new IllegalStateException(orderQtyBinary.hasValue() ? "orderQtyBinary holds a value the fields before it leave off the wire" : "orderQtyBinary holds no value, though the fields before it put it on the wire");
        }
        if (preventMatchPresent() != preventMatch.hasValue()) {
            throw new IllegalStateException(preventMatch.hasValue() ? "preventMatch holds a value the fields before it leave off the wire" : "preventMatch holds no value, though the fields before it put it on the wire");
        }
        if (maturityDatePresent() != maturityDate.hasValue()) {
            throw new IllegalStateException(maturityDate.hasValue() ? "maturityDate holds a value the fields before it leave off the wire" : "maturityDate holds no value, though the fields before it put it on the wire");
        }
        if (strikePricePresent() != strikePrice.hasValue()) {
            throw new IllegalStateException(strikePrice.hasValue() ? "strikePrice holds a value the fields before it leave off the wire" : "strikePrice holds no value, though the fields before it put it on the wire");
        }
        if (putOrCallPresent() != putOrCall.hasValue()) {
            throw new IllegalStateException(putOrCall.hasValue() ? "putOrCall holds a value the fields before it leave off the wire" : "putOrCall holds no value, though the fields before it put it on the wire");
        }
        if (attributedQuotePresent() != attributedQuote.hasValue()) {
            throw new IllegalStateException(attributedQuote.hasValue() ? "attributedQuote holds a value the fields before it leave off the wire" : "attributedQuote holds no value, though the fields before it put it on the wire");
        }
        if (targetPartyIdPresent() != targetPartyId.hasValue()) {
            throw new IllegalStateException(targetPartyId.hasValue() ? "targetPartyId holds a value the fields before it leave off the wire" : "targetPartyId holds no value, though the fields before it put it on the wire");
        }
        if (auctionIdPresent() != auctionId.hasValue()) {
            throw new IllegalStateException(auctionId.hasValue() ? "auctionId holds a value the fields before it leave off the wire" : "auctionId holds no value, though the fields before it put it on the wire");
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
        if (equityPartyIdPresent() != equityPartyId.hasValue()) {
            throw new IllegalStateException(equityPartyId.hasValue() ? "equityPartyId holds a value the fields before it leave off the wire" : "equityPartyId holds no value, though the fields before it put it on the wire");
        }
        if (frequentTraderIdPresent() != frequentTraderId.hasValue()) {
            throw new IllegalStateException(frequentTraderId.hasValue() ? "frequentTraderId holds a value the fields before it leave off the wire" : "frequentTraderId holds no value, though the fields before it put it on the wire");
        }
        if (compressionPresent() != compression.hasValue()) {
            throw new IllegalStateException(compression.hasValue() ? "compression holds a value the fields before it leave off the wire" : "compression holds no value, though the fields before it put it on the wire");
        }
        if (crossInitiatorPresent() != crossInitiator.hasValue()) {
            throw new IllegalStateException(crossInitiator.hasValue() ? "crossInitiator holds a value the fields before it leave off the wire" : "crossInitiator holds no value, though the fields before it put it on the wire");
        }
        if (crossOnBehalfOfIdPresent() != crossOnBehalfOfId.hasValue()) {
            throw new IllegalStateException(crossOnBehalfOfId.hasValue() ? "crossOnBehalfOfId holds a value the fields before it leave off the wire" : "crossOnBehalfOfId holds no value, though the fields before it put it on the wire");
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
        if (crossOrderCancelledReturnBitfield20Present()) {
            cursor = crossOrderCancelledReturnBitfield20.encode(data, cursor);
        }
        if (crossOrderCancelledReturnBitfield21Present()) {
            cursor = crossOrderCancelledReturnBitfield21.encode(data, cursor);
        }
        cursor = groupCnt.encode(data, cursor);
        cursor = crossOrderCancelledOrderAllocations.encode(data, cursor);
        if (priceBinaryPricePresent()) {
            cursor = priceBinaryPrice.encode(data, cursor);
        }
        if (execInstPresent()) {
            cursor = execInst.encode(data, cursor);
        }
        if (symbolAlphanumericPresent()) {
            cursor = symbolAlphanumeric.encode(data, cursor);
        }
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (orderQtyBinaryPresent()) {
            cursor = orderQtyBinary.encode(data, cursor);
        }
        if (preventMatchPresent()) {
            cursor = preventMatch.encode(data, cursor);
        }
        if (maturityDatePresent()) {
            cursor = maturityDate.encode(data, cursor);
        }
        if (strikePricePresent()) {
            cursor = strikePrice.encode(data, cursor);
        }
        if (putOrCallPresent()) {
            cursor = putOrCall.encode(data, cursor);
        }
        if (attributedQuotePresent()) {
            cursor = attributedQuote.encode(data, cursor);
        }
        if (targetPartyIdPresent()) {
            cursor = targetPartyId.encode(data, cursor);
        }
        if (auctionIdPresent()) {
            cursor = auctionId.encode(data, cursor);
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
        if (equityPartyIdPresent()) {
            cursor = equityPartyId.encode(data, cursor);
        }
        if (frequentTraderIdPresent()) {
            cursor = frequentTraderId.encode(data, cursor);
        }
        if (compressionPresent()) {
            cursor = compression.encode(data, cursor);
        }
        if (crossInitiatorPresent()) {
            cursor = crossInitiator.encode(data, cursor);
        }
        if (crossOnBehalfOfIdPresent()) {
            cursor = crossOnBehalfOfId.encode(data, cursor);
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
        if (crossOrderCancelledReturnBitfield20Present() && !crossOrderCancelledReturnBitfield20.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield20);
        }
        if (crossOrderCancelledReturnBitfield21Present() && !crossOrderCancelledReturnBitfield21.isDecoded()) {
            return Optional.of(crossOrderCancelledReturnBitfield21);
        }
        if (!groupCnt.isDecoded()) {
            return Optional.of(groupCnt);
        }
        if (!crossOrderCancelledOrderAllocations.isDecoded()) {
            return Optional.of(crossOrderCancelledOrderAllocations.failedEntry().flatMap(CrossOrderCancelledOrderAllocationsEntry::failedAt).orElse(groupCnt));
        }
        if (priceBinaryPricePresent() && !priceBinaryPrice.isDecoded()) {
            return Optional.of(priceBinaryPrice);
        }
        if (execInstPresent() && !execInst.isDecoded()) {
            return Optional.of(execInst);
        }
        if (symbolAlphanumericPresent() && !symbolAlphanumeric.isDecoded()) {
            return Optional.of(symbolAlphanumeric);
        }
        if (clearingFirmPresent() && !clearingFirm.isDecoded()) {
            return Optional.of(clearingFirm);
        }
        if (orderQtyBinaryPresent() && !orderQtyBinary.isDecoded()) {
            return Optional.of(orderQtyBinary);
        }
        if (preventMatchPresent() && !preventMatch.isDecoded()) {
            return Optional.of(preventMatch);
        }
        if (maturityDatePresent() && !maturityDate.isDecoded()) {
            return Optional.of(maturityDate);
        }
        if (strikePricePresent() && !strikePrice.isDecoded()) {
            return Optional.of(strikePrice);
        }
        if (putOrCallPresent() && !putOrCall.isDecoded()) {
            return Optional.of(putOrCall);
        }
        if (attributedQuotePresent() && !attributedQuote.isDecoded()) {
            return Optional.of(attributedQuote);
        }
        if (targetPartyIdPresent() && !targetPartyId.isDecoded()) {
            return Optional.of(targetPartyId);
        }
        if (auctionIdPresent() && !auctionId.isDecoded()) {
            return Optional.of(auctionId);
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
        if (equityPartyIdPresent() && !equityPartyId.isDecoded()) {
            return Optional.of(equityPartyId);
        }
        if (frequentTraderIdPresent() && !frequentTraderId.isDecoded()) {
            return Optional.of(frequentTraderId);
        }
        if (compressionPresent() && !compression.isDecoded()) {
            return Optional.of(compression);
        }
        if (crossInitiatorPresent() && !crossInitiator.isDecoded()) {
            return Optional.of(crossInitiator);
        }
        if (crossOnBehalfOfIdPresent() && !crossOnBehalfOfId.isDecoded()) {
            return Optional.of(crossOnBehalfOfId);
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
            case "CrossOrderCancelledReturnBitfield20" -> Optional.of(crossOrderCancelledReturnBitfield20);
            case "CrossOrderCancelledReturnBitfield21" -> Optional.of(crossOrderCancelledReturnBitfield21);
            case "GroupCnt" -> Optional.of(groupCnt);
            case "PriceBinaryPrice" -> Optional.of(priceBinaryPrice);
            case "ExecInst" -> Optional.of(execInst);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "OrderQtyBinary" -> Optional.of(orderQtyBinary);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "AttributedQuote" -> Optional.of(attributedQuote);
            case "TargetPartyId" -> Optional.of(targetPartyId);
            case "AuctionId" -> Optional.of(auctionId);
            case "CrossType" -> Optional.of(crossType);
            case "CrossPrioritization" -> Optional.of(crossPrioritization);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "EquityPartyId" -> Optional.of(equityPartyId);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            case "Compression" -> Optional.of(compression);
            case "CrossInitiator" -> Optional.of(crossInitiator);
            case "CrossOnBehalfOfId" -> Optional.of(crossOnBehalfOfId);
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
