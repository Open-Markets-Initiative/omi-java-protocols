package omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.AccountField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.AttributedQuoteField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.AutoMatchField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.AutoMatchPriceField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.ClearingAccountField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.ClearingOptionalDataField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.ClientIdAttrField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.CmtaNumberField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.CrossIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.CrossPrioritizationField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.CrossTypeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.EquityBuyClearingFirmField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.EquitySellClearingFirmField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.EquityTradePriceField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.EquityTradeSizeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.EquityTradeVenueField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.EquityTransactTimeField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.ExecInstField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.LastPriorityField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.MaturityDateField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.NewOrderCrossBitfield1Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.NewOrderCrossBitfield2Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.NewOrderCrossBitfield3Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.NewOrderCrossBitfield4Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.NumberOfNewOrderCrossBitfieldsField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.OrderQtyLongField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.PreventMatchField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.PriceLongField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.PutOrCallField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.RoutingFirmIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.SessionEligibilityField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.StrikePriceField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.SymbolLongField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.fields.TargetPartyIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.types.Field;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.types.Message;
import omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.types.PrintOptions;

/**
 * Represents the NewOrderCrossMessage message from the BinaryOrderEntry protocol.
 *
 * <p>A New Order Cross message contains the details for both the agency (initiating) and contra side(s) of a cross order (such as an AIM order).</p>
 */
public final class NewOrderCrossMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 35;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Cross Message";

    /**
     * Corresponds to CrossID (548) in Cboe FIX.
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * Corresponds to CrossType (549) in Cboe FIX. Type of auction order being submitted. This indicates the type of auction that will be initiated upon order entry.
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * Corresponds to CrossPrioritization (550) in Cboe Fix. Indicates which side of the cross order will be pri-oritized for execution. This identifies the Agency
     */
    private final CrossPrioritizationField crossPrioritization = new CrossPrioritizationField();

    /**
     * Price Long
     */
    private final PriceLongField priceLong = new PriceLongField();

    /**
     * Order quantity. System limit is 999,999 shares.
     */
    private final OrderQtyLongField orderQtyLong = new OrderQtyLongField();

    /**
     * Number of bitfields that follow; the fields they gate are appended to the message.
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
     * Symbol Long
     */
    private final SymbolLongField symbolLong = new SymbolLongField();

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
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Cmta Number
     */
    private final CmtaNumberField cmtaNumber = new CmtaNumberField();

    /**
     * Clearing Account
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Routing Firm Id
     */
    private final RoutingFirmIdField routingFirmId = new RoutingFirmIdField();

    /**
     * Clearing Optional Data
     */
    private final ClearingOptionalDataField clearingOptionalData = new ClearingOptionalDataField();

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
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(crossId, crossType, crossPrioritization, priceLong, orderQtyLong, numberOfNewOrderCrossBitfields, newOrderCrossBitfield1, newOrderCrossBitfield2, newOrderCrossBitfield3, newOrderCrossBitfield4, symbolLong, maturityDate, strikePrice, putOrCall, execInst, attributedQuote, targetPartyId, preventMatch, autoMatch, autoMatchPrice, lastPriority, account, cmtaNumber, clearingAccount, routingFirmId, clearingOptionalData, clientIdAttr, equityTradePrice, equityTradeSize, equityTradeVenue, equityTransactTime, equityBuyClearingFirm, equitySellClearingFirm, sessionEligibility);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to CrossID (548) in Cboe FIX.
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
    }

    /**
     * Corresponds to CrossType (549) in Cboe FIX. Type of auction order being submitted. This indicates the type of auction that will be initiated upon order entry.
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * Corresponds to CrossPrioritization (550) in Cboe Fix. Indicates which side of the cross order will be pri-oritized for execution. This identifies the Agency
     *
     * @return the CrossPrioritization field
     */
    public CrossPrioritizationField crossPrioritization() {
        return crossPrioritization;
    }

    /**
     * Price Long
     *
     * @return the PriceLong field
     */
    public PriceLongField priceLong() {
        return priceLong;
    }

    /**
     * Order quantity. System limit is 999,999 shares.
     *
     * @return the OrderQtyLong field
     */
    public OrderQtyLongField orderQtyLong() {
        return orderQtyLong;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended to the message.
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
     * Symbol Long
     *
     * @return the SymbolLong field
     */
    public SymbolLongField symbolLong() {
        return symbolLong;
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
     * Account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Cmta Number
     *
     * @return the CmtaNumber field
     */
    public CmtaNumberField cmtaNumber() {
        return cmtaNumber;
    }

    /**
     * Clearing Account
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
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
     * Clearing Optional Data
     *
     * @return the ClearingOptionalData field
     */
    public ClearingOptionalDataField clearingOptionalData() {
        return clearingOptionalData;
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
     * Returns whether the fields before the SymbolLong put it on the wire.
     *
     * <p>Decode reads the SymbolLong where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolLong is on the wire
     */
    public boolean symbolLongPresent() {
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
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 2L) && (newOrderCrossBitfield2Present() && newOrderCrossBitfield2.newOrderCrossBitfield2Account());
    }

    /**
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 2L) && (newOrderCrossBitfield2Present() && newOrderCrossBitfield2.newOrderCrossBitfield2CmtaNumber());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 2L) && (newOrderCrossBitfield2Present() && newOrderCrossBitfield2.newOrderCrossBitfield2ClearingAccount());
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
     * Returns whether the fields before the ClearingOptionalData put it on the wire.
     *
     * <p>Decode reads the ClearingOptionalData where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingOptionalData is on the wire
     */
    public boolean clearingOptionalDataPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 2L) && (newOrderCrossBitfield2Present() && newOrderCrossBitfield2.newOrderCrossBitfield2ClearingOptionalData());
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

    private boolean onWire(Field field) {
        return (field != newOrderCrossBitfield1 || newOrderCrossBitfield1Present()) && (field != newOrderCrossBitfield2 || newOrderCrossBitfield2Present()) && (field != newOrderCrossBitfield3 || newOrderCrossBitfield3Present()) && (field != newOrderCrossBitfield4 || newOrderCrossBitfield4Present()) && (field != symbolLong || symbolLongPresent()) && (field != maturityDate || maturityDatePresent()) && (field != strikePrice || strikePricePresent()) && (field != putOrCall || putOrCallPresent()) && (field != execInst || execInstPresent()) && (field != attributedQuote || attributedQuotePresent()) && (field != targetPartyId || targetPartyIdPresent()) && (field != preventMatch || preventMatchPresent()) && (field != autoMatch || autoMatchPresent()) && (field != autoMatchPrice || autoMatchPricePresent()) && (field != lastPriority || lastPriorityPresent()) && (field != account || accountPresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != routingFirmId || routingFirmIdPresent()) && (field != clearingOptionalData || clearingOptionalDataPresent()) && (field != clientIdAttr || clientIdAttrPresent()) && (field != equityTradePrice || equityTradePricePresent()) && (field != equityTradeSize || equityTradeSizePresent()) && (field != equityTradeVenue || equityTradeVenuePresent()) && (field != equityTransactTime || equityTransactTimePresent()) && (field != equityBuyClearingFirm || equityBuyClearingFirmPresent()) && (field != equitySellClearingFirm || equitySellClearingFirmPresent()) && (field != sessionEligibility || sessionEligibilityPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (newOrderCrossBitfield1Present() ? NewOrderCrossBitfield1Field.BYTE_LENGTH : 0) + (newOrderCrossBitfield2Present() ? NewOrderCrossBitfield2Field.BYTE_LENGTH : 0) + (newOrderCrossBitfield3Present() ? NewOrderCrossBitfield3Field.BYTE_LENGTH : 0) + (newOrderCrossBitfield4Present() ? NewOrderCrossBitfield4Field.BYTE_LENGTH : 0) + (symbolLongPresent() ? SymbolLongField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (strikePricePresent() ? StrikePriceField.BYTE_LENGTH : 0) + (putOrCallPresent() ? PutOrCallField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (attributedQuotePresent() ? AttributedQuoteField.BYTE_LENGTH : 0) + (targetPartyIdPresent() ? TargetPartyIdField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (autoMatchPresent() ? AutoMatchField.BYTE_LENGTH : 0) + (autoMatchPricePresent() ? AutoMatchPriceField.BYTE_LENGTH : 0) + (lastPriorityPresent() ? LastPriorityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (routingFirmIdPresent() ? RoutingFirmIdField.BYTE_LENGTH : 0) + (clearingOptionalDataPresent() ? ClearingOptionalDataField.BYTE_LENGTH : 0) + (clientIdAttrPresent() ? ClientIdAttrField.BYTE_LENGTH : 0) + (equityTradePricePresent() ? EquityTradePriceField.BYTE_LENGTH : 0) + (equityTradeSizePresent() ? EquityTradeSizeField.BYTE_LENGTH : 0) + (equityTradeVenuePresent() ? EquityTradeVenueField.BYTE_LENGTH : 0) + (equityTransactTimePresent() ? EquityTransactTimeField.BYTE_LENGTH : 0) + (equityBuyClearingFirmPresent() ? EquityBuyClearingFirmField.BYTE_LENGTH : 0) + (equitySellClearingFirmPresent() ? EquitySellClearingFirmField.BYTE_LENGTH : 0) + (sessionEligibilityPresent() ? SessionEligibilityField.BYTE_LENGTH : 0);
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
        if (!priceLong.parse(data, cursor)) {
            return false;
        }
        cursor += PriceLongField.BYTE_LENGTH;
        if (!orderQtyLong.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyLongField.BYTE_LENGTH;
        if (!numberOfNewOrderCrossBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfNewOrderCrossBitfieldsField.BYTE_LENGTH;
        if (newOrderCrossBitfield1Present()) {
            if (end - cursor < NewOrderCrossBitfield1Field.BYTE_LENGTH || !newOrderCrossBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (newOrderCrossBitfield2Present()) {
            if (end - cursor < NewOrderCrossBitfield2Field.BYTE_LENGTH || !newOrderCrossBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (newOrderCrossBitfield3Present()) {
            if (end - cursor < NewOrderCrossBitfield3Field.BYTE_LENGTH || !newOrderCrossBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (newOrderCrossBitfield4Present()) {
            if (end - cursor < NewOrderCrossBitfield4Field.BYTE_LENGTH || !newOrderCrossBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (symbolLongPresent()) {
            if (end - cursor < SymbolLongField.BYTE_LENGTH || !symbolLong.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolLongField.BYTE_LENGTH;
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
        if (accountPresent()) {
            if (end - cursor < AccountField.BYTE_LENGTH || !account.parse(data, cursor)) {
                return false;
            }
            cursor += AccountField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cmtaNumberPresent()) {
            if (end - cursor < CmtaNumberField.BYTE_LENGTH || !cmtaNumber.parse(data, cursor)) {
                return false;
            }
            cursor += CmtaNumberField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingAccountPresent()) {
            if (end - cursor < ClearingAccountField.BYTE_LENGTH || !clearingAccount.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingAccountField.BYTE_LENGTH;
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
        if (clearingOptionalDataPresent()) {
            if (end - cursor < ClearingOptionalDataField.BYTE_LENGTH || !clearingOptionalData.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingOptionalDataField.BYTE_LENGTH;
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

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
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
        if (symbolLongPresent() != symbolLong.hasValue()) {
            throw new IllegalStateException(symbolLong.hasValue() ? "symbolLong holds a value the fields before it leave off the wire" : "symbolLong holds no value, though the fields before it put it on the wire");
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
        if (accountPresent() != account.hasValue()) {
            throw new IllegalStateException(account.hasValue() ? "account holds a value the fields before it leave off the wire" : "account holds no value, though the fields before it put it on the wire");
        }
        if (cmtaNumberPresent() != cmtaNumber.hasValue()) {
            throw new IllegalStateException(cmtaNumber.hasValue() ? "cmtaNumber holds a value the fields before it leave off the wire" : "cmtaNumber holds no value, though the fields before it put it on the wire");
        }
        if (clearingAccountPresent() != clearingAccount.hasValue()) {
            throw new IllegalStateException(clearingAccount.hasValue() ? "clearingAccount holds a value the fields before it leave off the wire" : "clearingAccount holds no value, though the fields before it put it on the wire");
        }
        if (routingFirmIdPresent() != routingFirmId.hasValue()) {
            throw new IllegalStateException(routingFirmId.hasValue() ? "routingFirmId holds a value the fields before it leave off the wire" : "routingFirmId holds no value, though the fields before it put it on the wire");
        }
        if (clearingOptionalDataPresent() != clearingOptionalData.hasValue()) {
            throw new IllegalStateException(clearingOptionalData.hasValue() ? "clearingOptionalData holds a value the fields before it leave off the wire" : "clearingOptionalData holds no value, though the fields before it put it on the wire");
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
        int cursor = offset;
        cursor = crossId.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = crossPrioritization.encode(data, cursor);
        cursor = priceLong.encode(data, cursor);
        cursor = orderQtyLong.encode(data, cursor);
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
        if (symbolLongPresent()) {
            cursor = symbolLong.encode(data, cursor);
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
        if (accountPresent()) {
            cursor = account.encode(data, cursor);
        }
        if (cmtaNumberPresent()) {
            cursor = cmtaNumber.encode(data, cursor);
        }
        if (clearingAccountPresent()) {
            cursor = clearingAccount.encode(data, cursor);
        }
        if (routingFirmIdPresent()) {
            cursor = routingFirmId.encode(data, cursor);
        }
        if (clearingOptionalDataPresent()) {
            cursor = clearingOptionalData.encode(data, cursor);
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
            case "CrossId" -> Optional.of(crossId);
            case "CrossType" -> Optional.of(crossType);
            case "CrossPrioritization" -> Optional.of(crossPrioritization);
            case "PriceLong" -> Optional.of(priceLong);
            case "OrderQtyLong" -> Optional.of(orderQtyLong);
            case "NumberOfNewOrderCrossBitfields" -> Optional.of(numberOfNewOrderCrossBitfields);
            case "NewOrderCrossBitfield1" -> Optional.of(newOrderCrossBitfield1);
            case "NewOrderCrossBitfield2" -> Optional.of(newOrderCrossBitfield2);
            case "NewOrderCrossBitfield3" -> Optional.of(newOrderCrossBitfield3);
            case "NewOrderCrossBitfield4" -> Optional.of(newOrderCrossBitfield4);
            case "SymbolLong" -> Optional.of(symbolLong);
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
            case "Account" -> Optional.of(account);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "ClearingOptionalData" -> Optional.of(clearingOptionalData);
            case "ClientIdAttr" -> Optional.of(clientIdAttr);
            case "EquityTradePrice" -> Optional.of(equityTradePrice);
            case "EquityTradeSize" -> Optional.of(equityTradeSize);
            case "EquityTradeVenue" -> Optional.of(equityTradeVenue);
            case "EquityTransactTime" -> Optional.of(equityTransactTime);
            case "EquityBuyClearingFirm" -> Optional.of(equityBuyClearingFirm);
            case "EquitySellClearingFirm" -> Optional.of(equitySellClearingFirm);
            case "SessionEligibility" -> Optional.of(sessionEligibility);
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
        if (!(other instanceof NewOrderCrossMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
