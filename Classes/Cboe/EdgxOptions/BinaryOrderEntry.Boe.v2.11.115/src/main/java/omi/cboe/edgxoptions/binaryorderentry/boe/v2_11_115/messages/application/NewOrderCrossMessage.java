package omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.AttributedQuoteField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.AutoMatchField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.AutoMatchPriceField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ClientIdAttrField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.CompressionField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.CrossIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.CrossPrioritizationField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.CrossTypeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.EquityBuyClearingFirmField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.EquitySellClearingFirmField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.EquityTradePriceField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.EquityTradeSizeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.EquityTradeVenueField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.EquityTransactTimeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.ExecInstField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.GroupCntField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.LastPriorityField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.MaturityDateField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.NewOrderCrossBitfield1Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.NewOrderCrossBitfield2Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.NewOrderCrossBitfield3Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.NewOrderCrossBitfield4Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.NumberOfNewOrderCrossBitfieldsField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrderQtyBinaryField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.OrsField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.PreventMatchField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.PriceBinaryPriceField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.PutOrCallField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.RoutingFirmIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.SessionEligibilityField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.StrikePriceField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.SymbolAlphanumericField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.fields.TargetPartyIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.groups.OrderAllocationsEntry;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.groups.OrderAllocationsList;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.types.Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.types.Message;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.types.PrintOptions;

/**
 * Represents the NewOrderCrossMessage message from the BinaryOrderEntry protocol.
 *
 * <p>New Order Cross Message.</p>
 */
public final class NewOrderCrossMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 37;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Cross Message";

    /**
     * Corresponds to CrossID (548) in Cboe FIX. Day-unique identifier for the cross order chosen by the client. Characters in the ASCII range 33- 126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes.
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * Corresponds to CrossType (549) in Cboe FIX. Type of auction order being submitted. This indicates the type of auction that will be initiated upon order entry. 1 = Automated Improvement Mechanism (AIM) 2 = Qualified Contingent Cross (QCC) 3 = Solicitation Cross (SAM) 4 = Position Compression Cross (PCC) (C1 Only)
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * Corresponds to CrossPrioritization (550) in Cboe FIX. Indicates which side of the cross order will be prioritized for execution. This identifies the Agency side. 1 = Buy 2 = Sell
     */
    private final CrossPrioritizationField crossPrioritization = new CrossPrioritizationField();

    /**
     * Price Binary Price
     */
    private final PriceBinaryPriceField priceBinaryPrice = new PriceBinaryPriceField();

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 contracts.
     */
    private final OrderQtyBinaryField orderQtyBinary = new OrderQtyBinaryField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfNewOrderCrossBitfieldsField numberOfNewOrderCrossBitfields = new NumberOfNewOrderCrossBitfieldsField();

    /**
     * BitSet NewOrderCross byte 1.
     */
    private final NewOrderCrossBitfield1Field newOrderCrossBitfield1 = new NewOrderCrossBitfield1Field();

    /**
     * BitSet NewOrderCross byte 2.
     */
    private final NewOrderCrossBitfield2Field newOrderCrossBitfield2 = new NewOrderCrossBitfield2Field();

    /**
     * BitSet NewOrderCross byte 3.
     */
    private final NewOrderCrossBitfield3Field newOrderCrossBitfield3 = new NewOrderCrossBitfield3Field();

    /**
     * BitSet NewOrderCross byte 4.
     */
    private final NewOrderCrossBitfield4Field newOrderCrossBitfield4 = new NewOrderCrossBitfield4Field();

    /**
     * Number of order allocations represented by re- peating groups included in this cross order. Must be at least 2 (One agency and one contra), and no more than 11.
     */
    private final GroupCntField groupCnt = new GroupCntField();

    /**
     * Symbol Alphanumeric
     */
    private final SymbolAlphanumericField symbolAlphanumeric = new SymbolAlphanumericField();

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
     * Exec Inst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Attributed Quote
     */
    private final AttributedQuoteField attributedQuote = new AttributedQuoteField();

    /**
     * Target Party Id
     */
    private final TargetPartyIdField targetPartyId = new TargetPartyIdField();

    /**
     * Prevent Match
     */
    private final PreventMatchField preventMatch = new PreventMatchField();

    /**
     * Auto Match
     */
    private final AutoMatchField autoMatch = new AutoMatchField();

    /**
     * Auto Match Price
     */
    private final AutoMatchPriceField autoMatchPrice = new AutoMatchPriceField();

    /**
     * Last Priority
     */
    private final LastPriorityField lastPriority = new LastPriorityField();

    /**
     * Routing Firm Id
     */
    private final RoutingFirmIdField routingFirmId = new RoutingFirmIdField();

    /**
     * Client Id Attr
     */
    private final ClientIdAttrField clientIdAttr = new ClientIdAttrField();

    /**
     * Equity Trade Price
     */
    private final EquityTradePriceField equityTradePrice = new EquityTradePriceField();

    /**
     * Equity Trade Size
     */
    private final EquityTradeSizeField equityTradeSize = new EquityTradeSizeField();

    /**
     * Equity Trade Venue
     */
    private final EquityTradeVenueField equityTradeVenue = new EquityTradeVenueField();

    /**
     * Equity Transact Time
     */
    private final EquityTransactTimeField equityTransactTime = new EquityTransactTimeField();

    /**
     * Equity Buy Clearing Firm
     */
    private final EquityBuyClearingFirmField equityBuyClearingFirm = new EquityBuyClearingFirmField();

    /**
     * Equity Sell Clearing Firm
     */
    private final EquitySellClearingFirmField equitySellClearingFirm = new EquitySellClearingFirmField();

    /**
     * Session Eligibility
     */
    private final SessionEligibilityField sessionEligibility = new SessionEligibilityField();

    /**
     * Compression
     */
    private final CompressionField compression = new CompressionField();

    /**
     * Ors
     */
    private final OrsField ors = new OrsField();

    /**
     * Repeating group stated GroupCnt times.
     */
    private final OrderAllocationsList orderAllocations = new OrderAllocationsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(crossId, crossType, crossPrioritization, priceBinaryPrice, orderQtyBinary, numberOfNewOrderCrossBitfields, newOrderCrossBitfield1, newOrderCrossBitfield2, newOrderCrossBitfield3, newOrderCrossBitfield4, groupCnt, symbolAlphanumeric, maturityDate, strikePrice, putOrCall, execInst, attributedQuote, targetPartyId, preventMatch, autoMatch, autoMatchPrice, lastPriority, routingFirmId, clientIdAttr, equityTradePrice, equityTradeSize, equityTradeVenue, equityTransactTime, equityBuyClearingFirm, equitySellClearingFirm, sessionEligibility, compression, ors);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to CrossID (548) in Cboe FIX. Day-unique identifier for the cross order chosen by the client. Characters in the ASCII range 33- 126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes.
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
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
     * Price Binary Price
     *
     * @return the PriceBinaryPrice field
     */
    public PriceBinaryPriceField priceBinaryPrice() {
        return priceBinaryPrice;
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
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfNewOrderCrossBitfields field
     */
    public NumberOfNewOrderCrossBitfieldsField numberOfNewOrderCrossBitfields() {
        return numberOfNewOrderCrossBitfields;
    }

    /**
     * BitSet NewOrderCross byte 1.
     *
     * @return the NewOrderCrossBitfield1 field
     */
    public NewOrderCrossBitfield1Field newOrderCrossBitfield1() {
        return newOrderCrossBitfield1;
    }

    /**
     * BitSet NewOrderCross byte 2.
     *
     * @return the NewOrderCrossBitfield2 field
     */
    public NewOrderCrossBitfield2Field newOrderCrossBitfield2() {
        return newOrderCrossBitfield2;
    }

    /**
     * BitSet NewOrderCross byte 3.
     *
     * @return the NewOrderCrossBitfield3 field
     */
    public NewOrderCrossBitfield3Field newOrderCrossBitfield3() {
        return newOrderCrossBitfield3;
    }

    /**
     * BitSet NewOrderCross byte 4.
     *
     * @return the NewOrderCrossBitfield4 field
     */
    public NewOrderCrossBitfield4Field newOrderCrossBitfield4() {
        return newOrderCrossBitfield4;
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
     * Symbol Alphanumeric
     *
     * @return the SymbolAlphanumeric field
     */
    public SymbolAlphanumericField symbolAlphanumeric() {
        return symbolAlphanumeric;
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
     * Exec Inst
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
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
     * Prevent Match
     *
     * @return the PreventMatch field
     */
    public PreventMatchField preventMatch() {
        return preventMatch;
    }

    /**
     * Auto Match
     *
     * @return the AutoMatch field
     */
    public AutoMatchField autoMatch() {
        return autoMatch;
    }

    /**
     * Auto Match Price
     *
     * @return the AutoMatchPrice field
     */
    public AutoMatchPriceField autoMatchPrice() {
        return autoMatchPrice;
    }

    /**
     * Last Priority
     *
     * @return the LastPriority field
     */
    public LastPriorityField lastPriority() {
        return lastPriority;
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
     * Client Id Attr
     *
     * @return the ClientIdAttr field
     */
    public ClientIdAttrField clientIdAttr() {
        return clientIdAttr;
    }

    /**
     * Equity Trade Price
     *
     * @return the EquityTradePrice field
     */
    public EquityTradePriceField equityTradePrice() {
        return equityTradePrice;
    }

    /**
     * Equity Trade Size
     *
     * @return the EquityTradeSize field
     */
    public EquityTradeSizeField equityTradeSize() {
        return equityTradeSize;
    }

    /**
     * Equity Trade Venue
     *
     * @return the EquityTradeVenue field
     */
    public EquityTradeVenueField equityTradeVenue() {
        return equityTradeVenue;
    }

    /**
     * Equity Transact Time
     *
     * @return the EquityTransactTime field
     */
    public EquityTransactTimeField equityTransactTime() {
        return equityTransactTime;
    }

    /**
     * Equity Buy Clearing Firm
     *
     * @return the EquityBuyClearingFirm field
     */
    public EquityBuyClearingFirmField equityBuyClearingFirm() {
        return equityBuyClearingFirm;
    }

    /**
     * Equity Sell Clearing Firm
     *
     * @return the EquitySellClearingFirm field
     */
    public EquitySellClearingFirmField equitySellClearingFirm() {
        return equitySellClearingFirm;
    }

    /**
     * Session Eligibility
     *
     * @return the SessionEligibility field
     */
    public SessionEligibilityField sessionEligibility() {
        return sessionEligibility;
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
     * Ors
     *
     * @return the Ors field
     */
    public OrsField ors() {
        return ors;
    }

    /**
     * Repeating group stated GroupCnt times.
     *
     * <p>Encode writes this list's size to the GroupCnt field.</p>
     *
     * @return the OrderAllocations entries
     */
    public OrderAllocationsList orderAllocations() {
        return orderAllocations;
    }

    /**
     * Returns whether the fields before the NewOrderCrossBitfield1 put it on the wire.
     *
     * <p>Decode reads the NewOrderCrossBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderCrossBitfield1 is on the wire
     */
    public boolean newOrderCrossBitfield1Present() {
        return numberOfNewOrderCrossBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the NewOrderCrossBitfield2 put it on the wire.
     *
     * <p>Decode reads the NewOrderCrossBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderCrossBitfield2 is on the wire
     */
    public boolean newOrderCrossBitfield2Present() {
        return numberOfNewOrderCrossBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the NewOrderCrossBitfield3 put it on the wire.
     *
     * <p>Decode reads the NewOrderCrossBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderCrossBitfield3 is on the wire
     */
    public boolean newOrderCrossBitfield3Present() {
        return numberOfNewOrderCrossBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the NewOrderCrossBitfield4 put it on the wire.
     *
     * <p>Decode reads the NewOrderCrossBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderCrossBitfield4 is on the wire
     */
    public boolean newOrderCrossBitfield4Present() {
        return numberOfNewOrderCrossBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 1L) && (newOrderCrossBitfield1Present() && newOrderCrossBitfield1.newOrderCrossBitfield1Symbol());
    }

    /**
     * Returns whether the fields before the MaturityDate put it on the wire.
     *
     * <p>Decode reads the MaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaturityDate is on the wire
     */
    public boolean maturityDatePresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 1L) && (newOrderCrossBitfield1Present() && newOrderCrossBitfield1.newOrderCrossBitfield1MaturityDate());
    }

    /**
     * Returns whether the fields before the StrikePrice put it on the wire.
     *
     * <p>Decode reads the StrikePrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StrikePrice is on the wire
     */
    public boolean strikePricePresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 1L) && (newOrderCrossBitfield1Present() && newOrderCrossBitfield1.newOrderCrossBitfield1StrikePrice());
    }

    /**
     * Returns whether the fields before the PutOrCall put it on the wire.
     *
     * <p>Decode reads the PutOrCall where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PutOrCall is on the wire
     */
    public boolean putOrCallPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 1L) && (newOrderCrossBitfield1Present() && newOrderCrossBitfield1.newOrderCrossBitfield1PutOrCall());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 1L) && (newOrderCrossBitfield1Present() && newOrderCrossBitfield1.newOrderCrossBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the AttributedQuote put it on the wire.
     *
     * <p>Decode reads the AttributedQuote where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AttributedQuote is on the wire
     */
    public boolean attributedQuotePresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 1L) && (newOrderCrossBitfield1Present() && newOrderCrossBitfield1.newOrderCrossBitfield1AttributedQuote());
    }

    /**
     * Returns whether the fields before the TargetPartyId put it on the wire.
     *
     * <p>Decode reads the TargetPartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TargetPartyId is on the wire
     */
    public boolean targetPartyIdPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 1L) && (newOrderCrossBitfield1Present() && newOrderCrossBitfield1.newOrderCrossBitfield1TargetPartyId());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 1L) && (newOrderCrossBitfield1Present() && newOrderCrossBitfield1.newOrderCrossBitfield1PreventMatch());
    }

    /**
     * Returns whether the fields before the AutoMatch put it on the wire.
     *
     * <p>Decode reads the AutoMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AutoMatch is on the wire
     */
    public boolean autoMatchPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 2L) && (newOrderCrossBitfield2Present() && newOrderCrossBitfield2.newOrderCrossBitfield2AutoMatch());
    }

    /**
     * Returns whether the fields before the AutoMatchPrice put it on the wire.
     *
     * <p>Decode reads the AutoMatchPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AutoMatchPrice is on the wire
     */
    public boolean autoMatchPricePresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 2L) && (newOrderCrossBitfield2Present() && newOrderCrossBitfield2.newOrderCrossBitfield2AutoMatchPrice());
    }

    /**
     * Returns whether the fields before the LastPriority put it on the wire.
     *
     * <p>Decode reads the LastPriority where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastPriority is on the wire
     */
    public boolean lastPriorityPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 2L) && (newOrderCrossBitfield2Present() && newOrderCrossBitfield2.newOrderCrossBitfield2LastPriority());
    }

    /**
     * Returns whether the fields before the RoutingFirmId put it on the wire.
     *
     * <p>Decode reads the RoutingFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingFirmId is on the wire
     */
    public boolean routingFirmIdPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 2L) && (newOrderCrossBitfield2Present() && newOrderCrossBitfield2.newOrderCrossBitfield2RoutingFirmId());
    }

    /**
     * Returns whether the fields before the ClientIdAttr put it on the wire.
     *
     * <p>Decode reads the ClientIdAttr where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientIdAttr is on the wire
     */
    public boolean clientIdAttrPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 3L) && (newOrderCrossBitfield3Present() && newOrderCrossBitfield3.newOrderCrossBitfield3ClientIdAttr());
    }

    /**
     * Returns whether the fields before the EquityTradePrice put it on the wire.
     *
     * <p>Decode reads the EquityTradePrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityTradePrice is on the wire
     */
    public boolean equityTradePricePresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 3L) && (newOrderCrossBitfield3Present() && newOrderCrossBitfield3.newOrderCrossBitfield3EquityTradePrice());
    }

    /**
     * Returns whether the fields before the EquityTradeSize put it on the wire.
     *
     * <p>Decode reads the EquityTradeSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityTradeSize is on the wire
     */
    public boolean equityTradeSizePresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 3L) && (newOrderCrossBitfield3Present() && newOrderCrossBitfield3.newOrderCrossBitfield3EquityTradeSize());
    }

    /**
     * Returns whether the fields before the EquityTradeVenue put it on the wire.
     *
     * <p>Decode reads the EquityTradeVenue where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityTradeVenue is on the wire
     */
    public boolean equityTradeVenuePresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 3L) && (newOrderCrossBitfield3Present() && newOrderCrossBitfield3.newOrderCrossBitfield3EquityTradeVenue());
    }

    /**
     * Returns whether the fields before the EquityTransactTime put it on the wire.
     *
     * <p>Decode reads the EquityTransactTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityTransactTime is on the wire
     */
    public boolean equityTransactTimePresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 3L) && (newOrderCrossBitfield3Present() && newOrderCrossBitfield3.newOrderCrossBitfield3EquityTransactTime());
    }

    /**
     * Returns whether the fields before the EquityBuyClearingFirm put it on the wire.
     *
     * <p>Decode reads the EquityBuyClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityBuyClearingFirm is on the wire
     */
    public boolean equityBuyClearingFirmPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 3L) && (newOrderCrossBitfield3Present() && newOrderCrossBitfield3.newOrderCrossBitfield3EquityBuyClearingFirm());
    }

    /**
     * Returns whether the fields before the EquitySellClearingFirm put it on the wire.
     *
     * <p>Decode reads the EquitySellClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquitySellClearingFirm is on the wire
     */
    public boolean equitySellClearingFirmPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 3L) && (newOrderCrossBitfield3Present() && newOrderCrossBitfield3.newOrderCrossBitfield3EquitySellClearingFirm());
    }

    /**
     * Returns whether the fields before the SessionEligibility put it on the wire.
     *
     * <p>Decode reads the SessionEligibility where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SessionEligibility is on the wire
     */
    public boolean sessionEligibilityPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 3L) && (newOrderCrossBitfield3Present() && newOrderCrossBitfield3.newOrderCrossBitfield3SessionEligibility());
    }

    /**
     * Returns whether the fields before the Compression put it on the wire.
     *
     * <p>Decode reads the Compression where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Compression is on the wire
     */
    public boolean compressionPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 4L) && (newOrderCrossBitfield4Present() && newOrderCrossBitfield4.newOrderCrossBitfield4Compression());
    }

    /**
     * Returns whether the fields before the Ors put it on the wire.
     *
     * <p>Decode reads the Ors where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Ors is on the wire
     */
    public boolean orsPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 4L) && (newOrderCrossBitfield4Present() && newOrderCrossBitfield4.newOrderCrossBitfield4Ors());
    }

    private boolean onWire(Field field) {
        return (field != newOrderCrossBitfield1 || newOrderCrossBitfield1Present()) && (field != newOrderCrossBitfield2 || newOrderCrossBitfield2Present()) && (field != newOrderCrossBitfield3 || newOrderCrossBitfield3Present()) && (field != newOrderCrossBitfield4 || newOrderCrossBitfield4Present()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != maturityDate || maturityDatePresent()) && (field != strikePrice || strikePricePresent()) && (field != putOrCall || putOrCallPresent()) && (field != execInst || execInstPresent()) && (field != attributedQuote || attributedQuotePresent()) && (field != targetPartyId || targetPartyIdPresent()) && (field != preventMatch || preventMatchPresent()) && (field != autoMatch || autoMatchPresent()) && (field != autoMatchPrice || autoMatchPricePresent()) && (field != lastPriority || lastPriorityPresent()) && (field != routingFirmId || routingFirmIdPresent()) && (field != clientIdAttr || clientIdAttrPresent()) && (field != equityTradePrice || equityTradePricePresent()) && (field != equityTradeSize || equityTradeSizePresent()) && (field != equityTradeVenue || equityTradeVenuePresent()) && (field != equityTransactTime || equityTransactTimePresent()) && (field != equityBuyClearingFirm || equityBuyClearingFirmPresent()) && (field != equitySellClearingFirm || equitySellClearingFirmPresent()) && (field != sessionEligibility || sessionEligibilityPresent()) && (field != compression || compressionPresent()) && (field != ors || orsPresent());
    }

    /**
     * Hands each list whose entries read this record's fields the values they read, none for a field off the wire.
     */
    private void giveEntryInputs() {
        orderAllocations.inputs(OptionalLong.of(numberOfNewOrderCrossBitfields.value()), newOrderCrossBitfield2Present() ? OptionalLong.of(newOrderCrossBitfield2.value()) : OptionalLong.empty(), newOrderCrossBitfield4Present() ? OptionalLong.of(newOrderCrossBitfield4.value()) : OptionalLong.empty());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        giveEntryInputs();
        return MINIMUM_BYTE_LENGTH + (newOrderCrossBitfield1Present() ? NewOrderCrossBitfield1Field.BYTE_LENGTH : 0) + (newOrderCrossBitfield2Present() ? NewOrderCrossBitfield2Field.BYTE_LENGTH : 0) + (newOrderCrossBitfield3Present() ? NewOrderCrossBitfield3Field.BYTE_LENGTH : 0) + (newOrderCrossBitfield4Present() ? NewOrderCrossBitfield4Field.BYTE_LENGTH : 0) + orderAllocations.byteLength() + (symbolAlphanumericPresent() ? SymbolAlphanumericField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (strikePricePresent() ? StrikePriceField.BYTE_LENGTH : 0) + (putOrCallPresent() ? PutOrCallField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (attributedQuotePresent() ? AttributedQuoteField.BYTE_LENGTH : 0) + (targetPartyIdPresent() ? TargetPartyIdField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (autoMatchPresent() ? AutoMatchField.BYTE_LENGTH : 0) + (autoMatchPricePresent() ? AutoMatchPriceField.BYTE_LENGTH : 0) + (lastPriorityPresent() ? LastPriorityField.BYTE_LENGTH : 0) + (routingFirmIdPresent() ? RoutingFirmIdField.BYTE_LENGTH : 0) + (clientIdAttrPresent() ? ClientIdAttrField.BYTE_LENGTH : 0) + (equityTradePricePresent() ? EquityTradePriceField.BYTE_LENGTH : 0) + (equityTradeSizePresent() ? EquityTradeSizeField.BYTE_LENGTH : 0) + (equityTradeVenuePresent() ? EquityTradeVenueField.BYTE_LENGTH : 0) + (equityTransactTimePresent() ? EquityTransactTimeField.BYTE_LENGTH : 0) + (equityBuyClearingFirmPresent() ? EquityBuyClearingFirmField.BYTE_LENGTH : 0) + (equitySellClearingFirmPresent() ? EquitySellClearingFirmField.BYTE_LENGTH : 0) + (sessionEligibilityPresent() ? SessionEligibilityField.BYTE_LENGTH : 0) + (compressionPresent() ? CompressionField.BYTE_LENGTH : 0) + (orsPresent() ? OrsField.BYTE_LENGTH : 0);
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
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(equityTransactTime.value());
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
        if (!crossId.parse(data, cursor)) {
            return false;
        }
        cursor += CrossIdField.BYTE_LENGTH;
        if (!crossType.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeField.BYTE_LENGTH;
        if (!crossPrioritization.parse(data, cursor)) {
            return false;
        }
        cursor += CrossPrioritizationField.BYTE_LENGTH;
        if (!priceBinaryPrice.parse(data, cursor)) {
            return false;
        }
        cursor += PriceBinaryPriceField.BYTE_LENGTH;
        if (!orderQtyBinary.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyBinaryField.BYTE_LENGTH;
        if (!numberOfNewOrderCrossBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfNewOrderCrossBitfieldsField.BYTE_LENGTH;
        if (newOrderCrossBitfield1Present()) {
            if (end - 2 - cursor < NewOrderCrossBitfield1Field.BYTE_LENGTH || !newOrderCrossBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (newOrderCrossBitfield2Present()) {
            if (end - 2 - cursor < NewOrderCrossBitfield2Field.BYTE_LENGTH || !newOrderCrossBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (newOrderCrossBitfield3Present()) {
            if (end - 2 - cursor < NewOrderCrossBitfield3Field.BYTE_LENGTH || !newOrderCrossBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (newOrderCrossBitfield4Present()) {
            if (end - 2 - cursor < NewOrderCrossBitfield4Field.BYTE_LENGTH || !newOrderCrossBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (!groupCnt.parse(data, cursor)) {
            return false;
        }
        cursor += GroupCntField.BYTE_LENGTH;
        giveEntryInputs();
        if (!orderAllocations.parse(data, cursor, end, groupCnt.value())) {
            return false;
        }
        cursor += orderAllocations.byteLength();
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
        if (execInstPresent()) {
            if (end - cursor < ExecInstField.BYTE_LENGTH || !execInst.parse(data, cursor)) {
                return false;
            }
            cursor += ExecInstField.BYTE_LENGTH;
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
        if (preventMatchPresent()) {
            if (end - cursor < PreventMatchField.BYTE_LENGTH || !preventMatch.parse(data, cursor)) {
                return false;
            }
            cursor += PreventMatchField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (autoMatchPresent()) {
            if (end - cursor < AutoMatchField.BYTE_LENGTH || !autoMatch.parse(data, cursor)) {
                return false;
            }
            cursor += AutoMatchField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (autoMatchPricePresent()) {
            if (end - cursor < AutoMatchPriceField.BYTE_LENGTH || !autoMatchPrice.parse(data, cursor)) {
                return false;
            }
            cursor += AutoMatchPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (lastPriorityPresent()) {
            if (end - cursor < LastPriorityField.BYTE_LENGTH || !lastPriority.parse(data, cursor)) {
                return false;
            }
            cursor += LastPriorityField.BYTE_LENGTH;
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
        if (clientIdAttrPresent()) {
            if (end - cursor < ClientIdAttrField.BYTE_LENGTH || !clientIdAttr.parse(data, cursor)) {
                return false;
            }
            cursor += ClientIdAttrField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (equityTradePricePresent()) {
            if (end - cursor < EquityTradePriceField.BYTE_LENGTH || !equityTradePrice.parse(data, cursor)) {
                return false;
            }
            cursor += EquityTradePriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (equityTradeSizePresent()) {
            if (end - cursor < EquityTradeSizeField.BYTE_LENGTH || !equityTradeSize.parse(data, cursor)) {
                return false;
            }
            cursor += EquityTradeSizeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (equityTradeVenuePresent()) {
            if (end - cursor < EquityTradeVenueField.BYTE_LENGTH || !equityTradeVenue.parse(data, cursor)) {
                return false;
            }
            cursor += EquityTradeVenueField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (equityTransactTimePresent()) {
            if (end - cursor < EquityTransactTimeField.BYTE_LENGTH || !equityTransactTime.parse(data, cursor)) {
                return false;
            }
            cursor += EquityTransactTimeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (equityBuyClearingFirmPresent()) {
            if (end - cursor < EquityBuyClearingFirmField.BYTE_LENGTH || !equityBuyClearingFirm.parse(data, cursor)) {
                return false;
            }
            cursor += EquityBuyClearingFirmField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (equitySellClearingFirmPresent()) {
            if (end - cursor < EquitySellClearingFirmField.BYTE_LENGTH || !equitySellClearingFirm.parse(data, cursor)) {
                return false;
            }
            cursor += EquitySellClearingFirmField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (sessionEligibilityPresent()) {
            if (end - cursor < SessionEligibilityField.BYTE_LENGTH || !sessionEligibility.parse(data, cursor)) {
                return false;
            }
            cursor += SessionEligibilityField.BYTE_LENGTH;
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
        if (orsPresent()) {
            if (end - cursor < OrsField.BYTE_LENGTH || !ors.parse(data, cursor)) {
                return false;
            }
            cursor += OrsField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (orderAllocations.size() > 65535) {
            throw new IllegalStateException("orderAllocations holds " + orderAllocations.size() + " entries, more than its count field can state");
        }
        groupCnt.value(orderAllocations.size());
        if (newOrderCrossBitfield1Present() != newOrderCrossBitfield1.hasValue()) {
            throw new IllegalStateException(newOrderCrossBitfield1.hasValue() ? "newOrderCrossBitfield1 holds a value the fields before it leave off the wire" : "newOrderCrossBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderCrossBitfield2Present() != newOrderCrossBitfield2.hasValue()) {
            throw new IllegalStateException(newOrderCrossBitfield2.hasValue() ? "newOrderCrossBitfield2 holds a value the fields before it leave off the wire" : "newOrderCrossBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderCrossBitfield3Present() != newOrderCrossBitfield3.hasValue()) {
            throw new IllegalStateException(newOrderCrossBitfield3.hasValue() ? "newOrderCrossBitfield3 holds a value the fields before it leave off the wire" : "newOrderCrossBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderCrossBitfield4Present() != newOrderCrossBitfield4.hasValue()) {
            throw new IllegalStateException(newOrderCrossBitfield4.hasValue() ? "newOrderCrossBitfield4 holds a value the fields before it leave off the wire" : "newOrderCrossBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (symbolAlphanumericPresent() != symbolAlphanumeric.hasValue()) {
            throw new IllegalStateException(symbolAlphanumeric.hasValue() ? "symbolAlphanumeric holds a value the fields before it leave off the wire" : "symbolAlphanumeric holds no value, though the fields before it put it on the wire");
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
        if (execInstPresent() != execInst.hasValue()) {
            throw new IllegalStateException(execInst.hasValue() ? "execInst holds a value the fields before it leave off the wire" : "execInst holds no value, though the fields before it put it on the wire");
        }
        if (attributedQuotePresent() != attributedQuote.hasValue()) {
            throw new IllegalStateException(attributedQuote.hasValue() ? "attributedQuote holds a value the fields before it leave off the wire" : "attributedQuote holds no value, though the fields before it put it on the wire");
        }
        if (targetPartyIdPresent() != targetPartyId.hasValue()) {
            throw new IllegalStateException(targetPartyId.hasValue() ? "targetPartyId holds a value the fields before it leave off the wire" : "targetPartyId holds no value, though the fields before it put it on the wire");
        }
        if (preventMatchPresent() != preventMatch.hasValue()) {
            throw new IllegalStateException(preventMatch.hasValue() ? "preventMatch holds a value the fields before it leave off the wire" : "preventMatch holds no value, though the fields before it put it on the wire");
        }
        if (autoMatchPresent() != autoMatch.hasValue()) {
            throw new IllegalStateException(autoMatch.hasValue() ? "autoMatch holds a value the fields before it leave off the wire" : "autoMatch holds no value, though the fields before it put it on the wire");
        }
        if (autoMatchPricePresent() != autoMatchPrice.hasValue()) {
            throw new IllegalStateException(autoMatchPrice.hasValue() ? "autoMatchPrice holds a value the fields before it leave off the wire" : "autoMatchPrice holds no value, though the fields before it put it on the wire");
        }
        if (lastPriorityPresent() != lastPriority.hasValue()) {
            throw new IllegalStateException(lastPriority.hasValue() ? "lastPriority holds a value the fields before it leave off the wire" : "lastPriority holds no value, though the fields before it put it on the wire");
        }
        if (routingFirmIdPresent() != routingFirmId.hasValue()) {
            throw new IllegalStateException(routingFirmId.hasValue() ? "routingFirmId holds a value the fields before it leave off the wire" : "routingFirmId holds no value, though the fields before it put it on the wire");
        }
        if (clientIdAttrPresent() != clientIdAttr.hasValue()) {
            throw new IllegalStateException(clientIdAttr.hasValue() ? "clientIdAttr holds a value the fields before it leave off the wire" : "clientIdAttr holds no value, though the fields before it put it on the wire");
        }
        if (equityTradePricePresent() != equityTradePrice.hasValue()) {
            throw new IllegalStateException(equityTradePrice.hasValue() ? "equityTradePrice holds a value the fields before it leave off the wire" : "equityTradePrice holds no value, though the fields before it put it on the wire");
        }
        if (equityTradeSizePresent() != equityTradeSize.hasValue()) {
            throw new IllegalStateException(equityTradeSize.hasValue() ? "equityTradeSize holds a value the fields before it leave off the wire" : "equityTradeSize holds no value, though the fields before it put it on the wire");
        }
        if (equityTradeVenuePresent() != equityTradeVenue.hasValue()) {
            throw new IllegalStateException(equityTradeVenue.hasValue() ? "equityTradeVenue holds a value the fields before it leave off the wire" : "equityTradeVenue holds no value, though the fields before it put it on the wire");
        }
        if (equityTransactTimePresent() != equityTransactTime.hasValue()) {
            throw new IllegalStateException(equityTransactTime.hasValue() ? "equityTransactTime holds a value the fields before it leave off the wire" : "equityTransactTime holds no value, though the fields before it put it on the wire");
        }
        if (equityBuyClearingFirmPresent() != equityBuyClearingFirm.hasValue()) {
            throw new IllegalStateException(equityBuyClearingFirm.hasValue() ? "equityBuyClearingFirm holds a value the fields before it leave off the wire" : "equityBuyClearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (equitySellClearingFirmPresent() != equitySellClearingFirm.hasValue()) {
            throw new IllegalStateException(equitySellClearingFirm.hasValue() ? "equitySellClearingFirm holds a value the fields before it leave off the wire" : "equitySellClearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (sessionEligibilityPresent() != sessionEligibility.hasValue()) {
            throw new IllegalStateException(sessionEligibility.hasValue() ? "sessionEligibility holds a value the fields before it leave off the wire" : "sessionEligibility holds no value, though the fields before it put it on the wire");
        }
        if (compressionPresent() != compression.hasValue()) {
            throw new IllegalStateException(compression.hasValue() ? "compression holds a value the fields before it leave off the wire" : "compression holds no value, though the fields before it put it on the wire");
        }
        if (orsPresent() != ors.hasValue()) {
            throw new IllegalStateException(ors.hasValue() ? "ors holds a value the fields before it leave off the wire" : "ors holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = crossId.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = crossPrioritization.encode(data, cursor);
        cursor = priceBinaryPrice.encode(data, cursor);
        cursor = orderQtyBinary.encode(data, cursor);
        cursor = numberOfNewOrderCrossBitfields.encode(data, cursor);
        if (newOrderCrossBitfield1Present()) {
            cursor = newOrderCrossBitfield1.encode(data, cursor);
        }
        if (newOrderCrossBitfield2Present()) {
            cursor = newOrderCrossBitfield2.encode(data, cursor);
        }
        if (newOrderCrossBitfield3Present()) {
            cursor = newOrderCrossBitfield3.encode(data, cursor);
        }
        if (newOrderCrossBitfield4Present()) {
            cursor = newOrderCrossBitfield4.encode(data, cursor);
        }
        cursor = groupCnt.encode(data, cursor);
        cursor = orderAllocations.encode(data, cursor);
        if (symbolAlphanumericPresent()) {
            cursor = symbolAlphanumeric.encode(data, cursor);
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
        if (execInstPresent()) {
            cursor = execInst.encode(data, cursor);
        }
        if (attributedQuotePresent()) {
            cursor = attributedQuote.encode(data, cursor);
        }
        if (targetPartyIdPresent()) {
            cursor = targetPartyId.encode(data, cursor);
        }
        if (preventMatchPresent()) {
            cursor = preventMatch.encode(data, cursor);
        }
        if (autoMatchPresent()) {
            cursor = autoMatch.encode(data, cursor);
        }
        if (autoMatchPricePresent()) {
            cursor = autoMatchPrice.encode(data, cursor);
        }
        if (lastPriorityPresent()) {
            cursor = lastPriority.encode(data, cursor);
        }
        if (routingFirmIdPresent()) {
            cursor = routingFirmId.encode(data, cursor);
        }
        if (clientIdAttrPresent()) {
            cursor = clientIdAttr.encode(data, cursor);
        }
        if (equityTradePricePresent()) {
            cursor = equityTradePrice.encode(data, cursor);
        }
        if (equityTradeSizePresent()) {
            cursor = equityTradeSize.encode(data, cursor);
        }
        if (equityTradeVenuePresent()) {
            cursor = equityTradeVenue.encode(data, cursor);
        }
        if (equityTransactTimePresent()) {
            cursor = equityTransactTime.encode(data, cursor);
        }
        if (equityBuyClearingFirmPresent()) {
            cursor = equityBuyClearingFirm.encode(data, cursor);
        }
        if (equitySellClearingFirmPresent()) {
            cursor = equitySellClearingFirm.encode(data, cursor);
        }
        if (sessionEligibilityPresent()) {
            cursor = sessionEligibility.encode(data, cursor);
        }
        if (compressionPresent()) {
            cursor = compression.encode(data, cursor);
        }
        if (orsPresent()) {
            cursor = ors.encode(data, cursor);
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
        orderAllocations.clear();
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
        return orderAllocations.isRecognized();
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
        if (!orderAllocations.isValid()) {
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
        if (!crossId.isDecoded()) {
            return Optional.of(crossId);
        }
        if (!crossType.isDecoded()) {
            return Optional.of(crossType);
        }
        if (!crossPrioritization.isDecoded()) {
            return Optional.of(crossPrioritization);
        }
        if (!priceBinaryPrice.isDecoded()) {
            return Optional.of(priceBinaryPrice);
        }
        if (!orderQtyBinary.isDecoded()) {
            return Optional.of(orderQtyBinary);
        }
        if (!numberOfNewOrderCrossBitfields.isDecoded()) {
            return Optional.of(numberOfNewOrderCrossBitfields);
        }
        if (newOrderCrossBitfield1Present() && !newOrderCrossBitfield1.isDecoded()) {
            return Optional.of(newOrderCrossBitfield1);
        }
        if (newOrderCrossBitfield2Present() && !newOrderCrossBitfield2.isDecoded()) {
            return Optional.of(newOrderCrossBitfield2);
        }
        if (newOrderCrossBitfield3Present() && !newOrderCrossBitfield3.isDecoded()) {
            return Optional.of(newOrderCrossBitfield3);
        }
        if (newOrderCrossBitfield4Present() && !newOrderCrossBitfield4.isDecoded()) {
            return Optional.of(newOrderCrossBitfield4);
        }
        if (!groupCnt.isDecoded()) {
            return Optional.of(groupCnt);
        }
        if (!orderAllocations.isDecoded()) {
            return Optional.of(orderAllocations.failedEntry().flatMap(OrderAllocationsEntry::failedAt).orElse(groupCnt));
        }
        if (symbolAlphanumericPresent() && !symbolAlphanumeric.isDecoded()) {
            return Optional.of(symbolAlphanumeric);
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
        if (execInstPresent() && !execInst.isDecoded()) {
            return Optional.of(execInst);
        }
        if (attributedQuotePresent() && !attributedQuote.isDecoded()) {
            return Optional.of(attributedQuote);
        }
        if (targetPartyIdPresent() && !targetPartyId.isDecoded()) {
            return Optional.of(targetPartyId);
        }
        if (preventMatchPresent() && !preventMatch.isDecoded()) {
            return Optional.of(preventMatch);
        }
        if (autoMatchPresent() && !autoMatch.isDecoded()) {
            return Optional.of(autoMatch);
        }
        if (autoMatchPricePresent() && !autoMatchPrice.isDecoded()) {
            return Optional.of(autoMatchPrice);
        }
        if (lastPriorityPresent() && !lastPriority.isDecoded()) {
            return Optional.of(lastPriority);
        }
        if (routingFirmIdPresent() && !routingFirmId.isDecoded()) {
            return Optional.of(routingFirmId);
        }
        if (clientIdAttrPresent() && !clientIdAttr.isDecoded()) {
            return Optional.of(clientIdAttr);
        }
        if (equityTradePricePresent() && !equityTradePrice.isDecoded()) {
            return Optional.of(equityTradePrice);
        }
        if (equityTradeSizePresent() && !equityTradeSize.isDecoded()) {
            return Optional.of(equityTradeSize);
        }
        if (equityTradeVenuePresent() && !equityTradeVenue.isDecoded()) {
            return Optional.of(equityTradeVenue);
        }
        if (equityTransactTimePresent() && !equityTransactTime.isDecoded()) {
            return Optional.of(equityTransactTime);
        }
        if (equityBuyClearingFirmPresent() && !equityBuyClearingFirm.isDecoded()) {
            return Optional.of(equityBuyClearingFirm);
        }
        if (equitySellClearingFirmPresent() && !equitySellClearingFirm.isDecoded()) {
            return Optional.of(equitySellClearingFirm);
        }
        if (sessionEligibilityPresent() && !sessionEligibility.isDecoded()) {
            return Optional.of(sessionEligibility);
        }
        if (compressionPresent() && !compression.isDecoded()) {
            return Optional.of(compression);
        }
        if (orsPresent() && !ors.isDecoded()) {
            return Optional.of(ors);
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
            case "CrossId" -> Optional.of(crossId);
            case "CrossType" -> Optional.of(crossType);
            case "CrossPrioritization" -> Optional.of(crossPrioritization);
            case "PriceBinaryPrice" -> Optional.of(priceBinaryPrice);
            case "OrderQtyBinary" -> Optional.of(orderQtyBinary);
            case "NumberOfNewOrderCrossBitfields" -> Optional.of(numberOfNewOrderCrossBitfields);
            case "NewOrderCrossBitfield1" -> Optional.of(newOrderCrossBitfield1);
            case "NewOrderCrossBitfield2" -> Optional.of(newOrderCrossBitfield2);
            case "NewOrderCrossBitfield3" -> Optional.of(newOrderCrossBitfield3);
            case "NewOrderCrossBitfield4" -> Optional.of(newOrderCrossBitfield4);
            case "GroupCnt" -> Optional.of(groupCnt);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "ExecInst" -> Optional.of(execInst);
            case "AttributedQuote" -> Optional.of(attributedQuote);
            case "TargetPartyId" -> Optional.of(targetPartyId);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "AutoMatch" -> Optional.of(autoMatch);
            case "AutoMatchPrice" -> Optional.of(autoMatchPrice);
            case "LastPriority" -> Optional.of(lastPriority);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "ClientIdAttr" -> Optional.of(clientIdAttr);
            case "EquityTradePrice" -> Optional.of(equityTradePrice);
            case "EquityTradeSize" -> Optional.of(equityTradeSize);
            case "EquityTradeVenue" -> Optional.of(equityTradeVenue);
            case "EquityTransactTime" -> Optional.of(equityTransactTime);
            case "EquityBuyClearingFirm" -> Optional.of(equityBuyClearingFirm);
            case "EquitySellClearingFirm" -> Optional.of(equitySellClearingFirm);
            case "SessionEligibility" -> Optional.of(sessionEligibility);
            case "Compression" -> Optional.of(compression);
            case "Ors" -> Optional.of(ors);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderCrossMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(orderAllocations.diffFields(message.orderAllocations));
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
            orderAllocations.toFormattedString(builder, options);
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
        orderAllocations.toFormattedString(builder, nested);
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
        if (!(other instanceof NewOrderCrossMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && orderAllocations.equals(message.orderAllocations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, orderAllocations);
    }
}
