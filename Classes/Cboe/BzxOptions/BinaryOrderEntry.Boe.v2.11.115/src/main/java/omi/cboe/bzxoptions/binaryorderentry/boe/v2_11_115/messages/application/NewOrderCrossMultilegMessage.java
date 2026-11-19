package omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.AttributedQuoteField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.AutoMatchField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.AutoMatchPriceField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ClientIdAttrField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.CompressionField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.CrossIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.CrossInitiatorField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.CrossOnBehalfOfIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.CrossPrioritizationField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.CrossTypeField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.DrillThruProtectionField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.EquityBuyClearingFirmField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.EquityExDestinationField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.EquitySellClearingFirmField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.EquityTradePriceField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.EquityTradeSizeField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.EquityTradeVenueField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.EquityTransactTimeField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.ExecInstField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.GroupCntField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.LastPriorityField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.NewOrderCrossMultilegBitfield1Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.NewOrderCrossMultilegBitfield2Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.NewOrderCrossMultilegBitfield3Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.NewOrderCrossMultilegBitfield4Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.NewOrderCrossMultilegBitfield5Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.NewOrderCrossMultilegBitfield6Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.NumberOfNewOrderCrossMultilegBitfieldsField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.OrderQtyBinaryField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.OrsField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.PreventMatchField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.PriceBinaryPriceField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.RoutingFirmIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.SessionEligibilityField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.SymbolAlphanumericField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.fields.TargetPartyIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.groups.NewOrderCrossMultilegOrderAllocationsEntry;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.groups.NewOrderCrossMultilegOrderAllocationsList;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.types.Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.types.Message;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_11_115.types.PrintOptions;

/**
 * Represents the NewOrderCrossMultilegMessage message from the BinaryOrderEntry protocol.
 *
 * <p>New Order Cross Multileg Message.</p>
 */
public final class NewOrderCrossMultilegMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 37;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Cross Multileg Message";

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
    private final NumberOfNewOrderCrossMultilegBitfieldsField numberOfNewOrderCrossMultilegBitfields = new NumberOfNewOrderCrossMultilegBitfieldsField();

    /**
     * BitSet NewOrderCrossMultileg byte 1.
     */
    private final NewOrderCrossMultilegBitfield1Field newOrderCrossMultilegBitfield1 = new NewOrderCrossMultilegBitfield1Field();

    /**
     * BitSet NewOrderCrossMultileg byte 2.
     */
    private final NewOrderCrossMultilegBitfield2Field newOrderCrossMultilegBitfield2 = new NewOrderCrossMultilegBitfield2Field();

    /**
     * BitSet NewOrderCrossMultileg byte 3.
     */
    private final NewOrderCrossMultilegBitfield3Field newOrderCrossMultilegBitfield3 = new NewOrderCrossMultilegBitfield3Field();

    /**
     * BitSet NewOrderCrossMultileg byte 4.
     */
    private final NewOrderCrossMultilegBitfield4Field newOrderCrossMultilegBitfield4 = new NewOrderCrossMultilegBitfield4Field();

    /**
     * BitSet NewOrderCrossMultileg byte 5.
     */
    private final NewOrderCrossMultilegBitfield5Field newOrderCrossMultilegBitfield5 = new NewOrderCrossMultilegBitfield5Field();

    /**
     * BitSet NewOrderCrossMultileg byte 6.
     */
    private final NewOrderCrossMultilegBitfield6Field newOrderCrossMultilegBitfield6 = new NewOrderCrossMultilegBitfield6Field();

    /**
     * Number of order allocations represented by re- peating groups included in this cross order. Must be at least 2 (One agency and one contra), and no more than 11.
     */
    private final GroupCntField groupCnt = new GroupCntField();

    /**
     * Symbol Alphanumeric
     */
    private final SymbolAlphanumericField symbolAlphanumeric = new SymbolAlphanumericField();

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
     * Drill Thru Protection
     */
    private final DrillThruProtectionField drillThruProtection = new DrillThruProtectionField();

    /**
     * Equity Ex Destination
     */
    private final EquityExDestinationField equityExDestination = new EquityExDestinationField();

    /**
     * Compression
     */
    private final CompressionField compression = new CompressionField();

    /**
     * Ors
     */
    private final OrsField ors = new OrsField();

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
    private final NewOrderCrossMultilegOrderAllocationsList newOrderCrossMultilegOrderAllocations = new NewOrderCrossMultilegOrderAllocationsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(crossId, crossType, crossPrioritization, priceBinaryPrice, orderQtyBinary, numberOfNewOrderCrossMultilegBitfields, newOrderCrossMultilegBitfield1, newOrderCrossMultilegBitfield2, newOrderCrossMultilegBitfield3, newOrderCrossMultilegBitfield4, newOrderCrossMultilegBitfield5, newOrderCrossMultilegBitfield6, groupCnt, symbolAlphanumeric, execInst, attributedQuote, targetPartyId, preventMatch, autoMatch, autoMatchPrice, lastPriority, routingFirmId, clientIdAttr, equityTradePrice, equityTradeSize, equityTradeVenue, equityTransactTime, equityBuyClearingFirm, equitySellClearingFirm, sessionEligibility, drillThruProtection, equityExDestination, compression, ors, crossInitiator, crossOnBehalfOfId);

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
     * @return the NumberOfNewOrderCrossMultilegBitfields field
     */
    public NumberOfNewOrderCrossMultilegBitfieldsField numberOfNewOrderCrossMultilegBitfields() {
        return numberOfNewOrderCrossMultilegBitfields;
    }

    /**
     * BitSet NewOrderCrossMultileg byte 1.
     *
     * @return the NewOrderCrossMultilegBitfield1 field
     */
    public NewOrderCrossMultilegBitfield1Field newOrderCrossMultilegBitfield1() {
        return newOrderCrossMultilegBitfield1;
    }

    /**
     * BitSet NewOrderCrossMultileg byte 2.
     *
     * @return the NewOrderCrossMultilegBitfield2 field
     */
    public NewOrderCrossMultilegBitfield2Field newOrderCrossMultilegBitfield2() {
        return newOrderCrossMultilegBitfield2;
    }

    /**
     * BitSet NewOrderCrossMultileg byte 3.
     *
     * @return the NewOrderCrossMultilegBitfield3 field
     */
    public NewOrderCrossMultilegBitfield3Field newOrderCrossMultilegBitfield3() {
        return newOrderCrossMultilegBitfield3;
    }

    /**
     * BitSet NewOrderCrossMultileg byte 4.
     *
     * @return the NewOrderCrossMultilegBitfield4 field
     */
    public NewOrderCrossMultilegBitfield4Field newOrderCrossMultilegBitfield4() {
        return newOrderCrossMultilegBitfield4;
    }

    /**
     * BitSet NewOrderCrossMultileg byte 5.
     *
     * @return the NewOrderCrossMultilegBitfield5 field
     */
    public NewOrderCrossMultilegBitfield5Field newOrderCrossMultilegBitfield5() {
        return newOrderCrossMultilegBitfield5;
    }

    /**
     * BitSet NewOrderCrossMultileg byte 6.
     *
     * @return the NewOrderCrossMultilegBitfield6 field
     */
    public NewOrderCrossMultilegBitfield6Field newOrderCrossMultilegBitfield6() {
        return newOrderCrossMultilegBitfield6;
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
     * Drill Thru Protection
     *
     * @return the DrillThruProtection field
     */
    public DrillThruProtectionField drillThruProtection() {
        return drillThruProtection;
    }

    /**
     * Equity Ex Destination
     *
     * @return the EquityExDestination field
     */
    public EquityExDestinationField equityExDestination() {
        return equityExDestination;
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
     * @return the NewOrderCrossMultilegOrderAllocations entries
     */
    public NewOrderCrossMultilegOrderAllocationsList newOrderCrossMultilegOrderAllocations() {
        return newOrderCrossMultilegOrderAllocations;
    }

    /**
     * Returns whether the fields before the NewOrderCrossMultilegBitfield1 put it on the wire.
     *
     * <p>Decode reads the NewOrderCrossMultilegBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderCrossMultilegBitfield1 is on the wire
     */
    public boolean newOrderCrossMultilegBitfield1Present() {
        return numberOfNewOrderCrossMultilegBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the NewOrderCrossMultilegBitfield2 put it on the wire.
     *
     * <p>Decode reads the NewOrderCrossMultilegBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderCrossMultilegBitfield2 is on the wire
     */
    public boolean newOrderCrossMultilegBitfield2Present() {
        return numberOfNewOrderCrossMultilegBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the NewOrderCrossMultilegBitfield3 put it on the wire.
     *
     * <p>Decode reads the NewOrderCrossMultilegBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderCrossMultilegBitfield3 is on the wire
     */
    public boolean newOrderCrossMultilegBitfield3Present() {
        return numberOfNewOrderCrossMultilegBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the NewOrderCrossMultilegBitfield4 put it on the wire.
     *
     * <p>Decode reads the NewOrderCrossMultilegBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderCrossMultilegBitfield4 is on the wire
     */
    public boolean newOrderCrossMultilegBitfield4Present() {
        return numberOfNewOrderCrossMultilegBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the NewOrderCrossMultilegBitfield5 put it on the wire.
     *
     * <p>Decode reads the NewOrderCrossMultilegBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderCrossMultilegBitfield5 is on the wire
     */
    public boolean newOrderCrossMultilegBitfield5Present() {
        return numberOfNewOrderCrossMultilegBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the NewOrderCrossMultilegBitfield6 put it on the wire.
     *
     * <p>Decode reads the NewOrderCrossMultilegBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderCrossMultilegBitfield6 is on the wire
     */
    public boolean newOrderCrossMultilegBitfield6Present() {
        return numberOfNewOrderCrossMultilegBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 1L) && (newOrderCrossMultilegBitfield1Present() && newOrderCrossMultilegBitfield1.newOrderCrossMultilegBitfield1Symbol());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 1L) && (newOrderCrossMultilegBitfield1Present() && newOrderCrossMultilegBitfield1.newOrderCrossMultilegBitfield1ExecInst());
    }

    /**
     * Returns whether the fields before the AttributedQuote put it on the wire.
     *
     * <p>Decode reads the AttributedQuote where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AttributedQuote is on the wire
     */
    public boolean attributedQuotePresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 1L) && (newOrderCrossMultilegBitfield1Present() && newOrderCrossMultilegBitfield1.newOrderCrossMultilegBitfield1AttributedQuote());
    }

    /**
     * Returns whether the fields before the TargetPartyId put it on the wire.
     *
     * <p>Decode reads the TargetPartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TargetPartyId is on the wire
     */
    public boolean targetPartyIdPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 1L) && (newOrderCrossMultilegBitfield1Present() && newOrderCrossMultilegBitfield1.newOrderCrossMultilegBitfield1TargetPartyId());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 1L) && (newOrderCrossMultilegBitfield1Present() && newOrderCrossMultilegBitfield1.newOrderCrossMultilegBitfield1PreventMatch());
    }

    /**
     * Returns whether the fields before the AutoMatch put it on the wire.
     *
     * <p>Decode reads the AutoMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AutoMatch is on the wire
     */
    public boolean autoMatchPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 2L) && (newOrderCrossMultilegBitfield2Present() && newOrderCrossMultilegBitfield2.newOrderCrossMultilegBitfield2AutoMatch());
    }

    /**
     * Returns whether the fields before the AutoMatchPrice put it on the wire.
     *
     * <p>Decode reads the AutoMatchPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AutoMatchPrice is on the wire
     */
    public boolean autoMatchPricePresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 2L) && (newOrderCrossMultilegBitfield2Present() && newOrderCrossMultilegBitfield2.newOrderCrossMultilegBitfield2AutoMatchPrice());
    }

    /**
     * Returns whether the fields before the LastPriority put it on the wire.
     *
     * <p>Decode reads the LastPriority where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastPriority is on the wire
     */
    public boolean lastPriorityPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 2L) && (newOrderCrossMultilegBitfield2Present() && newOrderCrossMultilegBitfield2.newOrderCrossMultilegBitfield2LastPriority());
    }

    /**
     * Returns whether the fields before the RoutingFirmId put it on the wire.
     *
     * <p>Decode reads the RoutingFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingFirmId is on the wire
     */
    public boolean routingFirmIdPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 2L) && (newOrderCrossMultilegBitfield2Present() && newOrderCrossMultilegBitfield2.newOrderCrossMultilegBitfield2RoutingFirmId());
    }

    /**
     * Returns whether the fields before the ClientIdAttr put it on the wire.
     *
     * <p>Decode reads the ClientIdAttr where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientIdAttr is on the wire
     */
    public boolean clientIdAttrPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 3L) && (newOrderCrossMultilegBitfield3Present() && newOrderCrossMultilegBitfield3.newOrderCrossMultilegBitfield3ClientIdAttr());
    }

    /**
     * Returns whether the fields before the EquityTradePrice put it on the wire.
     *
     * <p>Decode reads the EquityTradePrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityTradePrice is on the wire
     */
    public boolean equityTradePricePresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 3L) && (newOrderCrossMultilegBitfield3Present() && newOrderCrossMultilegBitfield3.newOrderCrossMultilegBitfield3EquityTradePrice());
    }

    /**
     * Returns whether the fields before the EquityTradeSize put it on the wire.
     *
     * <p>Decode reads the EquityTradeSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityTradeSize is on the wire
     */
    public boolean equityTradeSizePresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 3L) && (newOrderCrossMultilegBitfield3Present() && newOrderCrossMultilegBitfield3.newOrderCrossMultilegBitfield3EquityTradeSize());
    }

    /**
     * Returns whether the fields before the EquityTradeVenue put it on the wire.
     *
     * <p>Decode reads the EquityTradeVenue where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityTradeVenue is on the wire
     */
    public boolean equityTradeVenuePresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 3L) && (newOrderCrossMultilegBitfield3Present() && newOrderCrossMultilegBitfield3.newOrderCrossMultilegBitfield3EquityTradeVenue());
    }

    /**
     * Returns whether the fields before the EquityTransactTime put it on the wire.
     *
     * <p>Decode reads the EquityTransactTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityTransactTime is on the wire
     */
    public boolean equityTransactTimePresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 3L) && (newOrderCrossMultilegBitfield3Present() && newOrderCrossMultilegBitfield3.newOrderCrossMultilegBitfield3EquityTransactTime());
    }

    /**
     * Returns whether the fields before the EquityBuyClearingFirm put it on the wire.
     *
     * <p>Decode reads the EquityBuyClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityBuyClearingFirm is on the wire
     */
    public boolean equityBuyClearingFirmPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 3L) && (newOrderCrossMultilegBitfield3Present() && newOrderCrossMultilegBitfield3.newOrderCrossMultilegBitfield3EquityBuyClearingFirm());
    }

    /**
     * Returns whether the fields before the EquitySellClearingFirm put it on the wire.
     *
     * <p>Decode reads the EquitySellClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquitySellClearingFirm is on the wire
     */
    public boolean equitySellClearingFirmPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 3L) && (newOrderCrossMultilegBitfield3Present() && newOrderCrossMultilegBitfield3.newOrderCrossMultilegBitfield3EquitySellClearingFirm());
    }

    /**
     * Returns whether the fields before the SessionEligibility put it on the wire.
     *
     * <p>Decode reads the SessionEligibility where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SessionEligibility is on the wire
     */
    public boolean sessionEligibilityPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 3L) && (newOrderCrossMultilegBitfield3Present() && newOrderCrossMultilegBitfield3.newOrderCrossMultilegBitfield3SessionEligibility());
    }

    /**
     * Returns whether the fields before the DrillThruProtection put it on the wire.
     *
     * <p>Decode reads the DrillThruProtection where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DrillThruProtection is on the wire
     */
    public boolean drillThruProtectionPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 4L) && (newOrderCrossMultilegBitfield4Present() && newOrderCrossMultilegBitfield4.newOrderCrossMultilegBitfield4DrillThruProtection());
    }

    /**
     * Returns whether the fields before the EquityExDestination put it on the wire.
     *
     * <p>Decode reads the EquityExDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityExDestination is on the wire
     */
    public boolean equityExDestinationPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 4L) && (newOrderCrossMultilegBitfield4Present() && newOrderCrossMultilegBitfield4.newOrderCrossMultilegBitfield4EquityExDestination());
    }

    /**
     * Returns whether the fields before the Compression put it on the wire.
     *
     * <p>Decode reads the Compression where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Compression is on the wire
     */
    public boolean compressionPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 4L) && (newOrderCrossMultilegBitfield4Present() && newOrderCrossMultilegBitfield4.newOrderCrossMultilegBitfield4Compression());
    }

    /**
     * Returns whether the fields before the Ors put it on the wire.
     *
     * <p>Decode reads the Ors where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Ors is on the wire
     */
    public boolean orsPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 5L) && (newOrderCrossMultilegBitfield5Present() && newOrderCrossMultilegBitfield5.newOrderCrossMultilegBitfield5Ors());
    }

    /**
     * Returns whether the fields before the CrossInitiator put it on the wire.
     *
     * <p>Decode reads the CrossInitiator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossInitiator is on the wire
     */
    public boolean crossInitiatorPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 5L) && (newOrderCrossMultilegBitfield5Present() && newOrderCrossMultilegBitfield5.newOrderCrossMultilegBitfield5CrossInitiator());
    }

    /**
     * Returns whether the fields before the CrossOnBehalfOfId put it on the wire.
     *
     * <p>Decode reads the CrossOnBehalfOfId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOnBehalfOfId is on the wire
     */
    public boolean crossOnBehalfOfIdPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 5L) && (newOrderCrossMultilegBitfield5Present() && newOrderCrossMultilegBitfield5.newOrderCrossMultilegBitfield5CrossOnBehalfOfId());
    }

    private boolean onWire(Field field) {
        return (field != newOrderCrossMultilegBitfield1 || newOrderCrossMultilegBitfield1Present()) && (field != newOrderCrossMultilegBitfield2 || newOrderCrossMultilegBitfield2Present()) && (field != newOrderCrossMultilegBitfield3 || newOrderCrossMultilegBitfield3Present()) && (field != newOrderCrossMultilegBitfield4 || newOrderCrossMultilegBitfield4Present()) && (field != newOrderCrossMultilegBitfield5 || newOrderCrossMultilegBitfield5Present()) && (field != newOrderCrossMultilegBitfield6 || newOrderCrossMultilegBitfield6Present()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != execInst || execInstPresent()) && (field != attributedQuote || attributedQuotePresent()) && (field != targetPartyId || targetPartyIdPresent()) && (field != preventMatch || preventMatchPresent()) && (field != autoMatch || autoMatchPresent()) && (field != autoMatchPrice || autoMatchPricePresent()) && (field != lastPriority || lastPriorityPresent()) && (field != routingFirmId || routingFirmIdPresent()) && (field != clientIdAttr || clientIdAttrPresent()) && (field != equityTradePrice || equityTradePricePresent()) && (field != equityTradeSize || equityTradeSizePresent()) && (field != equityTradeVenue || equityTradeVenuePresent()) && (field != equityTransactTime || equityTransactTimePresent()) && (field != equityBuyClearingFirm || equityBuyClearingFirmPresent()) && (field != equitySellClearingFirm || equitySellClearingFirmPresent()) && (field != sessionEligibility || sessionEligibilityPresent()) && (field != drillThruProtection || drillThruProtectionPresent()) && (field != equityExDestination || equityExDestinationPresent()) && (field != compression || compressionPresent()) && (field != ors || orsPresent()) && (field != crossInitiator || crossInitiatorPresent()) && (field != crossOnBehalfOfId || crossOnBehalfOfIdPresent());
    }

    /**
     * Hands each list whose entries read this record's fields the values they read, none for a field off the wire.
     */
    private void giveEntryInputs() {
        newOrderCrossMultilegOrderAllocations.inputs(OptionalLong.of(numberOfNewOrderCrossMultilegBitfields.value()), newOrderCrossMultilegBitfield2Present() ? OptionalLong.of(newOrderCrossMultilegBitfield2.value()) : OptionalLong.empty(), newOrderCrossMultilegBitfield4Present() ? OptionalLong.of(newOrderCrossMultilegBitfield4.value()) : OptionalLong.empty(), newOrderCrossMultilegBitfield5Present() ? OptionalLong.of(newOrderCrossMultilegBitfield5.value()) : OptionalLong.empty());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        giveEntryInputs();
        return MINIMUM_BYTE_LENGTH + (newOrderCrossMultilegBitfield1Present() ? NewOrderCrossMultilegBitfield1Field.BYTE_LENGTH : 0) + (newOrderCrossMultilegBitfield2Present() ? NewOrderCrossMultilegBitfield2Field.BYTE_LENGTH : 0) + (newOrderCrossMultilegBitfield3Present() ? NewOrderCrossMultilegBitfield3Field.BYTE_LENGTH : 0) + (newOrderCrossMultilegBitfield4Present() ? NewOrderCrossMultilegBitfield4Field.BYTE_LENGTH : 0) + (newOrderCrossMultilegBitfield5Present() ? NewOrderCrossMultilegBitfield5Field.BYTE_LENGTH : 0) + (newOrderCrossMultilegBitfield6Present() ? NewOrderCrossMultilegBitfield6Field.BYTE_LENGTH : 0) + newOrderCrossMultilegOrderAllocations.byteLength() + (symbolAlphanumericPresent() ? SymbolAlphanumericField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (attributedQuotePresent() ? AttributedQuoteField.BYTE_LENGTH : 0) + (targetPartyIdPresent() ? TargetPartyIdField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (autoMatchPresent() ? AutoMatchField.BYTE_LENGTH : 0) + (autoMatchPricePresent() ? AutoMatchPriceField.BYTE_LENGTH : 0) + (lastPriorityPresent() ? LastPriorityField.BYTE_LENGTH : 0) + (routingFirmIdPresent() ? RoutingFirmIdField.BYTE_LENGTH : 0) + (clientIdAttrPresent() ? ClientIdAttrField.BYTE_LENGTH : 0) + (equityTradePricePresent() ? EquityTradePriceField.BYTE_LENGTH : 0) + (equityTradeSizePresent() ? EquityTradeSizeField.BYTE_LENGTH : 0) + (equityTradeVenuePresent() ? EquityTradeVenueField.BYTE_LENGTH : 0) + (equityTransactTimePresent() ? EquityTransactTimeField.BYTE_LENGTH : 0) + (equityBuyClearingFirmPresent() ? EquityBuyClearingFirmField.BYTE_LENGTH : 0) + (equitySellClearingFirmPresent() ? EquitySellClearingFirmField.BYTE_LENGTH : 0) + (sessionEligibilityPresent() ? SessionEligibilityField.BYTE_LENGTH : 0) + (drillThruProtectionPresent() ? DrillThruProtectionField.BYTE_LENGTH : 0) + (equityExDestinationPresent() ? EquityExDestinationField.BYTE_LENGTH : 0) + (compressionPresent() ? CompressionField.BYTE_LENGTH : 0) + (orsPresent() ? OrsField.BYTE_LENGTH : 0) + (crossInitiatorPresent() ? CrossInitiatorField.BYTE_LENGTH : 0) + (crossOnBehalfOfIdPresent() ? CrossOnBehalfOfIdField.BYTE_LENGTH : 0);
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
        if (!numberOfNewOrderCrossMultilegBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfNewOrderCrossMultilegBitfieldsField.BYTE_LENGTH;
        if (newOrderCrossMultilegBitfield1Present()) {
            if (end - 2 - cursor < NewOrderCrossMultilegBitfield1Field.BYTE_LENGTH || !newOrderCrossMultilegBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossMultilegBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (newOrderCrossMultilegBitfield2Present()) {
            if (end - 2 - cursor < NewOrderCrossMultilegBitfield2Field.BYTE_LENGTH || !newOrderCrossMultilegBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossMultilegBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (newOrderCrossMultilegBitfield3Present()) {
            if (end - 2 - cursor < NewOrderCrossMultilegBitfield3Field.BYTE_LENGTH || !newOrderCrossMultilegBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossMultilegBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (newOrderCrossMultilegBitfield4Present()) {
            if (end - 2 - cursor < NewOrderCrossMultilegBitfield4Field.BYTE_LENGTH || !newOrderCrossMultilegBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossMultilegBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (newOrderCrossMultilegBitfield5Present()) {
            if (end - 2 - cursor < NewOrderCrossMultilegBitfield5Field.BYTE_LENGTH || !newOrderCrossMultilegBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossMultilegBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (newOrderCrossMultilegBitfield6Present()) {
            if (end - 2 - cursor < NewOrderCrossMultilegBitfield6Field.BYTE_LENGTH || !newOrderCrossMultilegBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossMultilegBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (!groupCnt.parse(data, cursor)) {
            return false;
        }
        cursor += GroupCntField.BYTE_LENGTH;
        giveEntryInputs();
        if (!newOrderCrossMultilegOrderAllocations.parse(data, cursor, end, groupCnt.value())) {
            return false;
        }
        cursor += newOrderCrossMultilegOrderAllocations.byteLength();
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
        if (drillThruProtectionPresent()) {
            if (end - cursor < DrillThruProtectionField.BYTE_LENGTH || !drillThruProtection.parse(data, cursor)) {
                return false;
            }
            cursor += DrillThruProtectionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (equityExDestinationPresent()) {
            if (end - cursor < EquityExDestinationField.BYTE_LENGTH || !equityExDestination.parse(data, cursor)) {
                return false;
            }
            cursor += EquityExDestinationField.BYTE_LENGTH;
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
        if (newOrderCrossMultilegOrderAllocations.size() > 65535) {
            throw new IllegalStateException("newOrderCrossMultilegOrderAllocations holds " + newOrderCrossMultilegOrderAllocations.size() + " entries, more than its count field can state");
        }
        groupCnt.value(newOrderCrossMultilegOrderAllocations.size());
        if (newOrderCrossMultilegBitfield1Present() != newOrderCrossMultilegBitfield1.hasValue()) {
            throw new IllegalStateException(newOrderCrossMultilegBitfield1.hasValue() ? "newOrderCrossMultilegBitfield1 holds a value the fields before it leave off the wire" : "newOrderCrossMultilegBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderCrossMultilegBitfield2Present() != newOrderCrossMultilegBitfield2.hasValue()) {
            throw new IllegalStateException(newOrderCrossMultilegBitfield2.hasValue() ? "newOrderCrossMultilegBitfield2 holds a value the fields before it leave off the wire" : "newOrderCrossMultilegBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderCrossMultilegBitfield3Present() != newOrderCrossMultilegBitfield3.hasValue()) {
            throw new IllegalStateException(newOrderCrossMultilegBitfield3.hasValue() ? "newOrderCrossMultilegBitfield3 holds a value the fields before it leave off the wire" : "newOrderCrossMultilegBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderCrossMultilegBitfield4Present() != newOrderCrossMultilegBitfield4.hasValue()) {
            throw new IllegalStateException(newOrderCrossMultilegBitfield4.hasValue() ? "newOrderCrossMultilegBitfield4 holds a value the fields before it leave off the wire" : "newOrderCrossMultilegBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderCrossMultilegBitfield5Present() != newOrderCrossMultilegBitfield5.hasValue()) {
            throw new IllegalStateException(newOrderCrossMultilegBitfield5.hasValue() ? "newOrderCrossMultilegBitfield5 holds a value the fields before it leave off the wire" : "newOrderCrossMultilegBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderCrossMultilegBitfield6Present() != newOrderCrossMultilegBitfield6.hasValue()) {
            throw new IllegalStateException(newOrderCrossMultilegBitfield6.hasValue() ? "newOrderCrossMultilegBitfield6 holds a value the fields before it leave off the wire" : "newOrderCrossMultilegBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (symbolAlphanumericPresent() != symbolAlphanumeric.hasValue()) {
            throw new IllegalStateException(symbolAlphanumeric.hasValue() ? "symbolAlphanumeric holds a value the fields before it leave off the wire" : "symbolAlphanumeric holds no value, though the fields before it put it on the wire");
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
        if (drillThruProtectionPresent() != drillThruProtection.hasValue()) {
            throw new IllegalStateException(drillThruProtection.hasValue() ? "drillThruProtection holds a value the fields before it leave off the wire" : "drillThruProtection holds no value, though the fields before it put it on the wire");
        }
        if (equityExDestinationPresent() != equityExDestination.hasValue()) {
            throw new IllegalStateException(equityExDestination.hasValue() ? "equityExDestination holds a value the fields before it leave off the wire" : "equityExDestination holds no value, though the fields before it put it on the wire");
        }
        if (compressionPresent() != compression.hasValue()) {
            throw new IllegalStateException(compression.hasValue() ? "compression holds a value the fields before it leave off the wire" : "compression holds no value, though the fields before it put it on the wire");
        }
        if (orsPresent() != ors.hasValue()) {
            throw new IllegalStateException(ors.hasValue() ? "ors holds a value the fields before it leave off the wire" : "ors holds no value, though the fields before it put it on the wire");
        }
        if (crossInitiatorPresent() != crossInitiator.hasValue()) {
            throw new IllegalStateException(crossInitiator.hasValue() ? "crossInitiator holds a value the fields before it leave off the wire" : "crossInitiator holds no value, though the fields before it put it on the wire");
        }
        if (crossOnBehalfOfIdPresent() != crossOnBehalfOfId.hasValue()) {
            throw new IllegalStateException(crossOnBehalfOfId.hasValue() ? "crossOnBehalfOfId holds a value the fields before it leave off the wire" : "crossOnBehalfOfId holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = crossId.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = crossPrioritization.encode(data, cursor);
        cursor = priceBinaryPrice.encode(data, cursor);
        cursor = orderQtyBinary.encode(data, cursor);
        cursor = numberOfNewOrderCrossMultilegBitfields.encode(data, cursor);
        if (newOrderCrossMultilegBitfield1Present()) {
            cursor = newOrderCrossMultilegBitfield1.encode(data, cursor);
        }
        if (newOrderCrossMultilegBitfield2Present()) {
            cursor = newOrderCrossMultilegBitfield2.encode(data, cursor);
        }
        if (newOrderCrossMultilegBitfield3Present()) {
            cursor = newOrderCrossMultilegBitfield3.encode(data, cursor);
        }
        if (newOrderCrossMultilegBitfield4Present()) {
            cursor = newOrderCrossMultilegBitfield4.encode(data, cursor);
        }
        if (newOrderCrossMultilegBitfield5Present()) {
            cursor = newOrderCrossMultilegBitfield5.encode(data, cursor);
        }
        if (newOrderCrossMultilegBitfield6Present()) {
            cursor = newOrderCrossMultilegBitfield6.encode(data, cursor);
        }
        cursor = groupCnt.encode(data, cursor);
        cursor = newOrderCrossMultilegOrderAllocations.encode(data, cursor);
        if (symbolAlphanumericPresent()) {
            cursor = symbolAlphanumeric.encode(data, cursor);
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
        if (drillThruProtectionPresent()) {
            cursor = drillThruProtection.encode(data, cursor);
        }
        if (equityExDestinationPresent()) {
            cursor = equityExDestination.encode(data, cursor);
        }
        if (compressionPresent()) {
            cursor = compression.encode(data, cursor);
        }
        if (orsPresent()) {
            cursor = ors.encode(data, cursor);
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
        newOrderCrossMultilegOrderAllocations.clear();
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
        return newOrderCrossMultilegOrderAllocations.isRecognized();
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
        if (!newOrderCrossMultilegOrderAllocations.isValid()) {
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
        if (!numberOfNewOrderCrossMultilegBitfields.isDecoded()) {
            return Optional.of(numberOfNewOrderCrossMultilegBitfields);
        }
        if (newOrderCrossMultilegBitfield1Present() && !newOrderCrossMultilegBitfield1.isDecoded()) {
            return Optional.of(newOrderCrossMultilegBitfield1);
        }
        if (newOrderCrossMultilegBitfield2Present() && !newOrderCrossMultilegBitfield2.isDecoded()) {
            return Optional.of(newOrderCrossMultilegBitfield2);
        }
        if (newOrderCrossMultilegBitfield3Present() && !newOrderCrossMultilegBitfield3.isDecoded()) {
            return Optional.of(newOrderCrossMultilegBitfield3);
        }
        if (newOrderCrossMultilegBitfield4Present() && !newOrderCrossMultilegBitfield4.isDecoded()) {
            return Optional.of(newOrderCrossMultilegBitfield4);
        }
        if (newOrderCrossMultilegBitfield5Present() && !newOrderCrossMultilegBitfield5.isDecoded()) {
            return Optional.of(newOrderCrossMultilegBitfield5);
        }
        if (newOrderCrossMultilegBitfield6Present() && !newOrderCrossMultilegBitfield6.isDecoded()) {
            return Optional.of(newOrderCrossMultilegBitfield6);
        }
        if (!groupCnt.isDecoded()) {
            return Optional.of(groupCnt);
        }
        if (!newOrderCrossMultilegOrderAllocations.isDecoded()) {
            return Optional.of(newOrderCrossMultilegOrderAllocations.failedEntry().flatMap(NewOrderCrossMultilegOrderAllocationsEntry::failedAt).orElse(groupCnt));
        }
        if (symbolAlphanumericPresent() && !symbolAlphanumeric.isDecoded()) {
            return Optional.of(symbolAlphanumeric);
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
        if (drillThruProtectionPresent() && !drillThruProtection.isDecoded()) {
            return Optional.of(drillThruProtection);
        }
        if (equityExDestinationPresent() && !equityExDestination.isDecoded()) {
            return Optional.of(equityExDestination);
        }
        if (compressionPresent() && !compression.isDecoded()) {
            return Optional.of(compression);
        }
        if (orsPresent() && !ors.isDecoded()) {
            return Optional.of(ors);
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
            case "CrossId" -> Optional.of(crossId);
            case "CrossType" -> Optional.of(crossType);
            case "CrossPrioritization" -> Optional.of(crossPrioritization);
            case "PriceBinaryPrice" -> Optional.of(priceBinaryPrice);
            case "OrderQtyBinary" -> Optional.of(orderQtyBinary);
            case "NumberOfNewOrderCrossMultilegBitfields" -> Optional.of(numberOfNewOrderCrossMultilegBitfields);
            case "NewOrderCrossMultilegBitfield1" -> Optional.of(newOrderCrossMultilegBitfield1);
            case "NewOrderCrossMultilegBitfield2" -> Optional.of(newOrderCrossMultilegBitfield2);
            case "NewOrderCrossMultilegBitfield3" -> Optional.of(newOrderCrossMultilegBitfield3);
            case "NewOrderCrossMultilegBitfield4" -> Optional.of(newOrderCrossMultilegBitfield4);
            case "NewOrderCrossMultilegBitfield5" -> Optional.of(newOrderCrossMultilegBitfield5);
            case "NewOrderCrossMultilegBitfield6" -> Optional.of(newOrderCrossMultilegBitfield6);
            case "GroupCnt" -> Optional.of(groupCnt);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
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
            case "DrillThruProtection" -> Optional.of(drillThruProtection);
            case "EquityExDestination" -> Optional.of(equityExDestination);
            case "Compression" -> Optional.of(compression);
            case "Ors" -> Optional.of(ors);
            case "CrossInitiator" -> Optional.of(crossInitiator);
            case "CrossOnBehalfOfId" -> Optional.of(crossOnBehalfOfId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderCrossMultilegMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(newOrderCrossMultilegOrderAllocations.diffFields(message.newOrderCrossMultilegOrderAllocations));
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
            newOrderCrossMultilegOrderAllocations.toFormattedString(builder, options);
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
        newOrderCrossMultilegOrderAllocations.toFormattedString(builder, nested);
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
        if (!(other instanceof NewOrderCrossMultilegMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && newOrderCrossMultilegOrderAllocations.equals(message.newOrderCrossMultilegOrderAllocations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, newOrderCrossMultilegOrderAllocations);
    }
}
