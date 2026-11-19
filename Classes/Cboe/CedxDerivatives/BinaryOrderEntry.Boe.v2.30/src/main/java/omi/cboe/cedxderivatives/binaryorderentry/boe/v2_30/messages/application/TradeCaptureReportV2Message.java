package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.AccountField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.AccountTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.AlgorithmicIndicatorField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CapacityField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.CustOrderHandlingInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.GrossTradeAmtField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.IdSourceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.LastPxTradePriceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.LastSharesField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.MatchTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.NoSidesField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.NumberOfTradeCaptureReportV2BitfieldsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OpenCloseField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.OrderCategoryField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.PartyRoleField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.PriceFormationField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.SecurityIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.SymbolAlphanumericField2;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.ToleranceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportV2Bitfield1Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportV2Bitfield2Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportV2Bitfield3Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportV2Bitfield4Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportV2Bitfield5Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeCaptureReportV2Bitfield6Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeHandlingInstructionField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeLinkIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradePublishIndicatorField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeReportIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeReportTransTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeReportTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TradeTimeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TransactionCategoryField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.TrdSubTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.fields.VenueTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_30.types.PrintOptions;

/**
 * Represents the TradeCaptureReportV2Message message from the BinaryOrderEntry protocol.
 *
 * <p>Trade Capture Report V2 Message.</p>
 */
public final class TradeCaptureReportV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Capture Report V 2 Message";

    /**
     * Corresponds to TradeReportID (571) in Cboe FIX. Day-unique ID chosen by client. Cboe will en- force port level day-uniqueness. 20 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. If the TradeReportID matches a live trade report (one that has been acked, but not confirmed or declined), it will be rejected as duplicate.
     */
    private final TradeReportIdField tradeReportId = new TradeReportIdField();

    /**
     * Corresponds to LastShares (32) in Cboe FIX. Executed contract quantity. System limit is 999,999 contracts.
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Corresponds to LastPx (31) in Cboe FIX. Price of this fill. Note the use of Binary Price to represent positive and negative prices, which can occur with complex/spread instruments.
     */
    private final LastPxTradePriceField lastPxTradePrice = new LastPxTradePriceField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfTradeCaptureReportV2BitfieldsField numberOfTradeCaptureReportV2Bitfields = new NumberOfTradeCaptureReportV2BitfieldsField();

    /**
     * BitSet TradeCaptureReportV2 byte 1.
     */
    private final TradeCaptureReportV2Bitfield1Field tradeCaptureReportV2Bitfield1 = new TradeCaptureReportV2Bitfield1Field();

    /**
     * BitSet TradeCaptureReportV2 byte 2.
     */
    private final TradeCaptureReportV2Bitfield2Field tradeCaptureReportV2Bitfield2 = new TradeCaptureReportV2Bitfield2Field();

    /**
     * BitSet TradeCaptureReportV2 byte 3.
     */
    private final TradeCaptureReportV2Bitfield3Field tradeCaptureReportV2Bitfield3 = new TradeCaptureReportV2Bitfield3Field();

    /**
     * BitSet TradeCaptureReportV2 byte 4.
     */
    private final TradeCaptureReportV2Bitfield4Field tradeCaptureReportV2Bitfield4 = new TradeCaptureReportV2Bitfield4Field();

    /**
     * BitSet TradeCaptureReportV2 byte 5.
     */
    private final TradeCaptureReportV2Bitfield5Field tradeCaptureReportV2Bitfield5 = new TradeCaptureReportV2Bitfield5Field();

    /**
     * BitSet TradeCaptureReportV2 byte 6.
     */
    private final TradeCaptureReportV2Bitfield6Field tradeCaptureReportV2Bitfield6 = new TradeCaptureReportV2Bitfield6Field();

    /**
     * Corresponds to NoSides (552) in Cboe FIX. Indicates the number of repeating groups to fol- low. Must be 2.
     */
    private final NoSidesField noSides = new NoSidesField();

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
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Transaction Category
     */
    private final TransactionCategoryField transactionCategory = new TransactionCategoryField();

    /**
     * Trade Time
     */
    private final TradeTimeField tradeTime = new TradeTimeField();

    /**
     * Party Role
     */
    private final PartyRoleField partyRole = new PartyRoleField();

    /**
     * Trade Report Trans Type
     */
    private final TradeReportTransTypeField tradeReportTransType = new TradeReportTransTypeField();

    /**
     * Trade Id
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Venue Type
     */
    private final VenueTypeField venueType = new VenueTypeField();

    /**
     * Match Type
     */
    private final MatchTypeField matchType = new MatchTypeField();

    /**
     * Trd Sub Type
     */
    private final TrdSubTypeField trdSubType = new TrdSubTypeField();

    /**
     * Trade Publish Indicator
     */
    private final TradePublishIndicatorField tradePublishIndicator = new TradePublishIndicatorField();

    /**
     * Trade Report Type
     */
    private final TradeReportTypeField tradeReportType = new TradeReportTypeField();

    /**
     * Trade Handling Instruction
     */
    private final TradeHandlingInstructionField tradeHandlingInstruction = new TradeHandlingInstructionField();

    /**
     * Trade Link Id
     */
    private final TradeLinkIdField tradeLinkId = new TradeLinkIdField();

    /**
     * Gross Trade Amt
     */
    private final GrossTradeAmtField grossTradeAmt = new GrossTradeAmtField();

    /**
     * Tolerance
     */
    private final ToleranceField tolerance = new ToleranceField();

    /**
     * Order Category
     */
    private final OrderCategoryField orderCategory = new OrderCategoryField();

    /**
     * Price Formation
     */
    private final PriceFormationField priceFormation = new PriceFormationField();

    /**
     * Algorithmic Indicator
     */
    private final AlgorithmicIndicatorField algorithmicIndicator = new AlgorithmicIndicatorField();

    /**
     * Cust Order Handling Inst
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

    /**
     * Open Close
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Account Type
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tradeReportId, lastShares, lastPxTradePrice, numberOfTradeCaptureReportV2Bitfields, tradeCaptureReportV2Bitfield1, tradeCaptureReportV2Bitfield2, tradeCaptureReportV2Bitfield3, tradeCaptureReportV2Bitfield4, tradeCaptureReportV2Bitfield5, tradeCaptureReportV2Bitfield6, noSides, symbolAlphanumeric, idSource, securityId, capacity, account, transactionCategory, tradeTime, partyRole, tradeReportTransType, tradeId, venueType, matchType, trdSubType, tradePublishIndicator, tradeReportType, tradeHandlingInstruction, tradeLinkId, grossTradeAmt, tolerance, orderCategory, priceFormation, algorithmicIndicator, custOrderHandlingInst, openClose, accountType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to TradeReportID (571) in Cboe FIX. Day-unique ID chosen by client. Cboe will en- force port level day-uniqueness. 20 characters or less. Characters in ASCII range 33–126 are allowed, except for comma, semi- colon, and pipe. If the TradeReportID matches a live trade report (one that has been acked, but not confirmed or declined), it will be rejected as duplicate.
     *
     * @return the TradeReportId field
     */
    public TradeReportIdField tradeReportId() {
        return tradeReportId;
    }

    /**
     * Corresponds to LastShares (32) in Cboe FIX. Executed contract quantity. System limit is 999,999 contracts.
     *
     * @return the LastShares field
     */
    public LastSharesField lastShares() {
        return lastShares;
    }

    /**
     * Corresponds to LastPx (31) in Cboe FIX. Price of this fill. Note the use of Binary Price to represent positive and negative prices, which can occur with complex/spread instruments.
     *
     * @return the LastPxTradePrice field
     */
    public LastPxTradePriceField lastPxTradePrice() {
        return lastPxTradePrice;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfTradeCaptureReportV2Bitfields field
     */
    public NumberOfTradeCaptureReportV2BitfieldsField numberOfTradeCaptureReportV2Bitfields() {
        return numberOfTradeCaptureReportV2Bitfields;
    }

    /**
     * BitSet TradeCaptureReportV2 byte 1.
     *
     * @return the TradeCaptureReportV2Bitfield1 field
     */
    public TradeCaptureReportV2Bitfield1Field tradeCaptureReportV2Bitfield1() {
        return tradeCaptureReportV2Bitfield1;
    }

    /**
     * BitSet TradeCaptureReportV2 byte 2.
     *
     * @return the TradeCaptureReportV2Bitfield2 field
     */
    public TradeCaptureReportV2Bitfield2Field tradeCaptureReportV2Bitfield2() {
        return tradeCaptureReportV2Bitfield2;
    }

    /**
     * BitSet TradeCaptureReportV2 byte 3.
     *
     * @return the TradeCaptureReportV2Bitfield3 field
     */
    public TradeCaptureReportV2Bitfield3Field tradeCaptureReportV2Bitfield3() {
        return tradeCaptureReportV2Bitfield3;
    }

    /**
     * BitSet TradeCaptureReportV2 byte 4.
     *
     * @return the TradeCaptureReportV2Bitfield4 field
     */
    public TradeCaptureReportV2Bitfield4Field tradeCaptureReportV2Bitfield4() {
        return tradeCaptureReportV2Bitfield4;
    }

    /**
     * BitSet TradeCaptureReportV2 byte 5.
     *
     * @return the TradeCaptureReportV2Bitfield5 field
     */
    public TradeCaptureReportV2Bitfield5Field tradeCaptureReportV2Bitfield5() {
        return tradeCaptureReportV2Bitfield5;
    }

    /**
     * BitSet TradeCaptureReportV2 byte 6.
     *
     * @return the TradeCaptureReportV2Bitfield6 field
     */
    public TradeCaptureReportV2Bitfield6Field tradeCaptureReportV2Bitfield6() {
        return tradeCaptureReportV2Bitfield6;
    }

    /**
     * Corresponds to NoSides (552) in Cboe FIX. Indicates the number of repeating groups to fol- low. Must be 2.
     *
     * @return the NoSides field
     */
    public NoSidesField noSides() {
        return noSides;
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
     * Capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
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
     * Transaction Category
     *
     * @return the TransactionCategory field
     */
    public TransactionCategoryField transactionCategory() {
        return transactionCategory;
    }

    /**
     * Trade Time
     *
     * @return the TradeTime field
     */
    public TradeTimeField tradeTime() {
        return tradeTime;
    }

    /**
     * Party Role
     *
     * @return the PartyRole field
     */
    public PartyRoleField partyRole() {
        return partyRole;
    }

    /**
     * Trade Report Trans Type
     *
     * @return the TradeReportTransType field
     */
    public TradeReportTransTypeField tradeReportTransType() {
        return tradeReportTransType;
    }

    /**
     * Trade Id
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Venue Type
     *
     * @return the VenueType field
     */
    public VenueTypeField venueType() {
        return venueType;
    }

    /**
     * Match Type
     *
     * @return the MatchType field
     */
    public MatchTypeField matchType() {
        return matchType;
    }

    /**
     * Trd Sub Type
     *
     * @return the TrdSubType field
     */
    public TrdSubTypeField trdSubType() {
        return trdSubType;
    }

    /**
     * Trade Publish Indicator
     *
     * @return the TradePublishIndicator field
     */
    public TradePublishIndicatorField tradePublishIndicator() {
        return tradePublishIndicator;
    }

    /**
     * Trade Report Type
     *
     * @return the TradeReportType field
     */
    public TradeReportTypeField tradeReportType() {
        return tradeReportType;
    }

    /**
     * Trade Handling Instruction
     *
     * @return the TradeHandlingInstruction field
     */
    public TradeHandlingInstructionField tradeHandlingInstruction() {
        return tradeHandlingInstruction;
    }

    /**
     * Trade Link Id
     *
     * @return the TradeLinkId field
     */
    public TradeLinkIdField tradeLinkId() {
        return tradeLinkId;
    }

    /**
     * Gross Trade Amt
     *
     * @return the GrossTradeAmt field
     */
    public GrossTradeAmtField grossTradeAmt() {
        return grossTradeAmt;
    }

    /**
     * Tolerance
     *
     * @return the Tolerance field
     */
    public ToleranceField tolerance() {
        return tolerance;
    }

    /**
     * Order Category
     *
     * @return the OrderCategory field
     */
    public OrderCategoryField orderCategory() {
        return orderCategory;
    }

    /**
     * Price Formation
     *
     * @return the PriceFormation field
     */
    public PriceFormationField priceFormation() {
        return priceFormation;
    }

    /**
     * Algorithmic Indicator
     *
     * @return the AlgorithmicIndicator field
     */
    public AlgorithmicIndicatorField algorithmicIndicator() {
        return algorithmicIndicator;
    }

    /**
     * Cust Order Handling Inst
     *
     * @return the CustOrderHandlingInst field
     */
    public CustOrderHandlingInstField custOrderHandlingInst() {
        return custOrderHandlingInst;
    }

    /**
     * Open Close
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * Account Type
     *
     * @return the AccountType field
     */
    public AccountTypeField accountType() {
        return accountType;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportV2Bitfield1 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportV2Bitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportV2Bitfield1 is on the wire
     */
    public boolean tradeCaptureReportV2Bitfield1Present() {
        return numberOfTradeCaptureReportV2Bitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportV2Bitfield2 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportV2Bitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportV2Bitfield2 is on the wire
     */
    public boolean tradeCaptureReportV2Bitfield2Present() {
        return numberOfTradeCaptureReportV2Bitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportV2Bitfield3 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportV2Bitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportV2Bitfield3 is on the wire
     */
    public boolean tradeCaptureReportV2Bitfield3Present() {
        return numberOfTradeCaptureReportV2Bitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportV2Bitfield4 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportV2Bitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportV2Bitfield4 is on the wire
     */
    public boolean tradeCaptureReportV2Bitfield4Present() {
        return numberOfTradeCaptureReportV2Bitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportV2Bitfield5 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportV2Bitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportV2Bitfield5 is on the wire
     */
    public boolean tradeCaptureReportV2Bitfield5Present() {
        return numberOfTradeCaptureReportV2Bitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the TradeCaptureReportV2Bitfield6 put it on the wire.
     *
     * <p>Decode reads the TradeCaptureReportV2Bitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCaptureReportV2Bitfield6 is on the wire
     */
    public boolean tradeCaptureReportV2Bitfield6Present() {
        return numberOfTradeCaptureReportV2Bitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 1L) && (tradeCaptureReportV2Bitfield1Present() && tradeCaptureReportV2Bitfield1.tradeCaptureReportV2Bitfield1Symbol());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 1L) && (tradeCaptureReportV2Bitfield1Present() && tradeCaptureReportV2Bitfield1.tradeCaptureReportV2Bitfield1IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 1L) && (tradeCaptureReportV2Bitfield1Present() && tradeCaptureReportV2Bitfield1.tradeCaptureReportV2Bitfield1SecurityId());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 2L) && (tradeCaptureReportV2Bitfield2Present() && tradeCaptureReportV2Bitfield2.tradeCaptureReportV2Bitfield2Capacity());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 2L) && (tradeCaptureReportV2Bitfield2Present() && tradeCaptureReportV2Bitfield2.tradeCaptureReportV2Bitfield2Account());
    }

    /**
     * Returns whether the fields before the TransactionCategory put it on the wire.
     *
     * <p>Decode reads the TransactionCategory where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TransactionCategory is on the wire
     */
    public boolean transactionCategoryPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 2L) && (tradeCaptureReportV2Bitfield2Present() && tradeCaptureReportV2Bitfield2.tradeCaptureReportV2Bitfield2TransactionCategory());
    }

    /**
     * Returns whether the fields before the TradeTime put it on the wire.
     *
     * <p>Decode reads the TradeTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeTime is on the wire
     */
    public boolean tradeTimePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 2L) && (tradeCaptureReportV2Bitfield2Present() && tradeCaptureReportV2Bitfield2.tradeCaptureReportV2Bitfield2TradeTime());
    }

    /**
     * Returns whether the fields before the PartyRole put it on the wire.
     *
     * <p>Decode reads the PartyRole where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PartyRole is on the wire
     */
    public boolean partyRolePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 2L) && (tradeCaptureReportV2Bitfield2Present() && tradeCaptureReportV2Bitfield2.tradeCaptureReportV2Bitfield2PartyRole());
    }

    /**
     * Returns whether the fields before the TradeReportTransType put it on the wire.
     *
     * <p>Decode reads the TradeReportTransType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeReportTransType is on the wire
     */
    public boolean tradeReportTransTypePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 2L) && (tradeCaptureReportV2Bitfield2Present() && tradeCaptureReportV2Bitfield2.tradeCaptureReportV2Bitfield2TradeReportTransType());
    }

    /**
     * Returns whether the fields before the TradeId put it on the wire.
     *
     * <p>Decode reads the TradeId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeId is on the wire
     */
    public boolean tradeIdPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 2L) && (tradeCaptureReportV2Bitfield2Present() && tradeCaptureReportV2Bitfield2.tradeCaptureReportV2Bitfield2TradeId());
    }

    /**
     * Returns whether the fields before the VenueType put it on the wire.
     *
     * <p>Decode reads the VenueType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the VenueType is on the wire
     */
    public boolean venueTypePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 2L) && (tradeCaptureReportV2Bitfield2Present() && tradeCaptureReportV2Bitfield2.tradeCaptureReportV2Bitfield2VenueType());
    }

    /**
     * Returns whether the fields before the MatchType put it on the wire.
     *
     * <p>Decode reads the MatchType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MatchType is on the wire
     */
    public boolean matchTypePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 3L) && (tradeCaptureReportV2Bitfield3Present() && tradeCaptureReportV2Bitfield3.tradeCaptureReportV2Bitfield3MatchType());
    }

    /**
     * Returns whether the fields before the TrdSubType put it on the wire.
     *
     * <p>Decode reads the TrdSubType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TrdSubType is on the wire
     */
    public boolean trdSubTypePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 3L) && (tradeCaptureReportV2Bitfield3Present() && tradeCaptureReportV2Bitfield3.tradeCaptureReportV2Bitfield3TrdSubType());
    }

    /**
     * Returns whether the fields before the TradePublishIndicator put it on the wire.
     *
     * <p>Decode reads the TradePublishIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradePublishIndicator is on the wire
     */
    public boolean tradePublishIndicatorPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 3L) && (tradeCaptureReportV2Bitfield3Present() && tradeCaptureReportV2Bitfield3.tradeCaptureReportV2Bitfield3TradePublishIndicator());
    }

    /**
     * Returns whether the fields before the TradeReportType put it on the wire.
     *
     * <p>Decode reads the TradeReportType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeReportType is on the wire
     */
    public boolean tradeReportTypePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 4L) && (tradeCaptureReportV2Bitfield4Present() && tradeCaptureReportV2Bitfield4.tradeCaptureReportV2Bitfield4TradeReportType());
    }

    /**
     * Returns whether the fields before the TradeHandlingInstruction put it on the wire.
     *
     * <p>Decode reads the TradeHandlingInstruction where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeHandlingInstruction is on the wire
     */
    public boolean tradeHandlingInstructionPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 4L) && (tradeCaptureReportV2Bitfield4Present() && tradeCaptureReportV2Bitfield4.tradeCaptureReportV2Bitfield4TradeHandlingInstruction());
    }

    /**
     * Returns whether the fields before the TradeLinkId put it on the wire.
     *
     * <p>Decode reads the TradeLinkId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeLinkId is on the wire
     */
    public boolean tradeLinkIdPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 4L) && (tradeCaptureReportV2Bitfield4Present() && tradeCaptureReportV2Bitfield4.tradeCaptureReportV2Bitfield4TradeLinkId());
    }

    /**
     * Returns whether the fields before the GrossTradeAmt put it on the wire.
     *
     * <p>Decode reads the GrossTradeAmt where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the GrossTradeAmt is on the wire
     */
    public boolean grossTradeAmtPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 4L) && (tradeCaptureReportV2Bitfield4Present() && tradeCaptureReportV2Bitfield4.tradeCaptureReportV2Bitfield4GrossTradeAmt());
    }

    /**
     * Returns whether the fields before the Tolerance put it on the wire.
     *
     * <p>Decode reads the Tolerance where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Tolerance is on the wire
     */
    public boolean tolerancePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 4L) && (tradeCaptureReportV2Bitfield4Present() && tradeCaptureReportV2Bitfield4.tradeCaptureReportV2Bitfield4Tolerance());
    }

    /**
     * Returns whether the fields before the OrderCategory put it on the wire.
     *
     * <p>Decode reads the OrderCategory where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderCategory is on the wire
     */
    public boolean orderCategoryPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 4L) && (tradeCaptureReportV2Bitfield4Present() && tradeCaptureReportV2Bitfield4.tradeCaptureReportV2Bitfield4OrderCategory());
    }

    /**
     * Returns whether the fields before the PriceFormation put it on the wire.
     *
     * <p>Decode reads the PriceFormation where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceFormation is on the wire
     */
    public boolean priceFormationPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 5L) && (tradeCaptureReportV2Bitfield5Present() && tradeCaptureReportV2Bitfield5.tradeCaptureReportV2Bitfield5PriceFormation());
    }

    /**
     * Returns whether the fields before the AlgorithmicIndicator put it on the wire.
     *
     * <p>Decode reads the AlgorithmicIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AlgorithmicIndicator is on the wire
     */
    public boolean algorithmicIndicatorPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 5L) && (tradeCaptureReportV2Bitfield5Present() && tradeCaptureReportV2Bitfield5.tradeCaptureReportV2Bitfield5AlgorithmicIndicator());
    }

    /**
     * Returns whether the fields before the CustOrderHandlingInst put it on the wire.
     *
     * <p>Decode reads the CustOrderHandlingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CustOrderHandlingInst is on the wire
     */
    public boolean custOrderHandlingInstPresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 6L) && (tradeCaptureReportV2Bitfield6Present() && tradeCaptureReportV2Bitfield6.tradeCaptureReportV2Bitfield6CustOrderHandlingInst());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 6L) && (tradeCaptureReportV2Bitfield6Present() && tradeCaptureReportV2Bitfield6.tradeCaptureReportV2Bitfield6OpenClose());
    }

    /**
     * Returns whether the fields before the AccountType put it on the wire.
     *
     * <p>Decode reads the AccountType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AccountType is on the wire
     */
    public boolean accountTypePresent() {
        return (numberOfTradeCaptureReportV2Bitfields.value() >= 6L) && (tradeCaptureReportV2Bitfield6Present() && tradeCaptureReportV2Bitfield6.tradeCaptureReportV2Bitfield6AccountType());
    }

    private boolean onWire(Field field) {
        return (field != tradeCaptureReportV2Bitfield1 || tradeCaptureReportV2Bitfield1Present()) && (field != tradeCaptureReportV2Bitfield2 || tradeCaptureReportV2Bitfield2Present()) && (field != tradeCaptureReportV2Bitfield3 || tradeCaptureReportV2Bitfield3Present()) && (field != tradeCaptureReportV2Bitfield4 || tradeCaptureReportV2Bitfield4Present()) && (field != tradeCaptureReportV2Bitfield5 || tradeCaptureReportV2Bitfield5Present()) && (field != tradeCaptureReportV2Bitfield6 || tradeCaptureReportV2Bitfield6Present()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != transactionCategory || transactionCategoryPresent()) && (field != tradeTime || tradeTimePresent()) && (field != partyRole || partyRolePresent()) && (field != tradeReportTransType || tradeReportTransTypePresent()) && (field != tradeId || tradeIdPresent()) && (field != venueType || venueTypePresent()) && (field != matchType || matchTypePresent()) && (field != trdSubType || trdSubTypePresent()) && (field != tradePublishIndicator || tradePublishIndicatorPresent()) && (field != tradeReportType || tradeReportTypePresent()) && (field != tradeHandlingInstruction || tradeHandlingInstructionPresent()) && (field != tradeLinkId || tradeLinkIdPresent()) && (field != grossTradeAmt || grossTradeAmtPresent()) && (field != tolerance || tolerancePresent()) && (field != orderCategory || orderCategoryPresent()) && (field != priceFormation || priceFormationPresent()) && (field != algorithmicIndicator || algorithmicIndicatorPresent()) && (field != custOrderHandlingInst || custOrderHandlingInstPresent()) && (field != openClose || openClosePresent()) && (field != accountType || accountTypePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (tradeCaptureReportV2Bitfield1Present() ? TradeCaptureReportV2Bitfield1Field.BYTE_LENGTH : 0) + (tradeCaptureReportV2Bitfield2Present() ? TradeCaptureReportV2Bitfield2Field.BYTE_LENGTH : 0) + (tradeCaptureReportV2Bitfield3Present() ? TradeCaptureReportV2Bitfield3Field.BYTE_LENGTH : 0) + (tradeCaptureReportV2Bitfield4Present() ? TradeCaptureReportV2Bitfield4Field.BYTE_LENGTH : 0) + (tradeCaptureReportV2Bitfield5Present() ? TradeCaptureReportV2Bitfield5Field.BYTE_LENGTH : 0) + (tradeCaptureReportV2Bitfield6Present() ? TradeCaptureReportV2Bitfield6Field.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField2.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (transactionCategoryPresent() ? TransactionCategoryField.BYTE_LENGTH : 0) + (tradeTimePresent() ? TradeTimeField.BYTE_LENGTH : 0) + (partyRolePresent() ? PartyRoleField.BYTE_LENGTH : 0) + (tradeReportTransTypePresent() ? TradeReportTransTypeField.BYTE_LENGTH : 0) + (tradeIdPresent() ? TradeIdField.BYTE_LENGTH : 0) + (venueTypePresent() ? VenueTypeField.BYTE_LENGTH : 0) + (matchTypePresent() ? MatchTypeField.BYTE_LENGTH : 0) + (trdSubTypePresent() ? TrdSubTypeField.BYTE_LENGTH : 0) + (tradePublishIndicatorPresent() ? TradePublishIndicatorField.BYTE_LENGTH : 0) + (tradeReportTypePresent() ? TradeReportTypeField.BYTE_LENGTH : 0) + (tradeHandlingInstructionPresent() ? TradeHandlingInstructionField.BYTE_LENGTH : 0) + (tradeLinkIdPresent() ? TradeLinkIdField.BYTE_LENGTH : 0) + (grossTradeAmtPresent() ? GrossTradeAmtField.BYTE_LENGTH : 0) + (tolerancePresent() ? ToleranceField.BYTE_LENGTH : 0) + (orderCategoryPresent() ? OrderCategoryField.BYTE_LENGTH : 0) + (priceFormationPresent() ? PriceFormationField.BYTE_LENGTH : 0) + (algorithmicIndicatorPresent() ? AlgorithmicIndicatorField.BYTE_LENGTH : 0) + (custOrderHandlingInstPresent() ? CustOrderHandlingInstField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (accountTypePresent() ? AccountTypeField.BYTE_LENGTH : 0);
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
        return Optional.ofNullable(tradeTime.value());
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
        if (!tradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportIdField.BYTE_LENGTH;
        if (!lastShares.parse(data, cursor)) {
            return false;
        }
        cursor += LastSharesField.BYTE_LENGTH;
        if (!lastPxTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxTradePriceField.BYTE_LENGTH;
        if (!numberOfTradeCaptureReportV2Bitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfTradeCaptureReportV2BitfieldsField.BYTE_LENGTH;
        if (tradeCaptureReportV2Bitfield1Present()) {
            if (end - 1 - cursor < TradeCaptureReportV2Bitfield1Field.BYTE_LENGTH || !tradeCaptureReportV2Bitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportV2Bitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportV2Bitfield2Present()) {
            if (end - 1 - cursor < TradeCaptureReportV2Bitfield2Field.BYTE_LENGTH || !tradeCaptureReportV2Bitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportV2Bitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportV2Bitfield3Present()) {
            if (end - 1 - cursor < TradeCaptureReportV2Bitfield3Field.BYTE_LENGTH || !tradeCaptureReportV2Bitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportV2Bitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportV2Bitfield4Present()) {
            if (end - 1 - cursor < TradeCaptureReportV2Bitfield4Field.BYTE_LENGTH || !tradeCaptureReportV2Bitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportV2Bitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportV2Bitfield5Present()) {
            if (end - 1 - cursor < TradeCaptureReportV2Bitfield5Field.BYTE_LENGTH || !tradeCaptureReportV2Bitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportV2Bitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (tradeCaptureReportV2Bitfield6Present()) {
            if (end - 1 - cursor < TradeCaptureReportV2Bitfield6Field.BYTE_LENGTH || !tradeCaptureReportV2Bitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCaptureReportV2Bitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (!noSides.parse(data, cursor)) {
            return false;
        }
        cursor += NoSidesField.BYTE_LENGTH;
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
        if (capacityPresent()) {
            if (end - cursor < CapacityField.BYTE_LENGTH || !capacity.parse(data, cursor)) {
                return false;
            }
            cursor += CapacityField.BYTE_LENGTH;
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
        if (transactionCategoryPresent()) {
            if (end - cursor < TransactionCategoryField.BYTE_LENGTH || !transactionCategory.parse(data, cursor)) {
                return false;
            }
            cursor += TransactionCategoryField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeTimePresent()) {
            if (end - cursor < TradeTimeField.BYTE_LENGTH || !tradeTime.parse(data, cursor)) {
                return false;
            }
            cursor += TradeTimeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (partyRolePresent()) {
            if (end - cursor < PartyRoleField.BYTE_LENGTH || !partyRole.parse(data, cursor)) {
                return false;
            }
            cursor += PartyRoleField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeReportTransTypePresent()) {
            if (end - cursor < TradeReportTransTypeField.BYTE_LENGTH || !tradeReportTransType.parse(data, cursor)) {
                return false;
            }
            cursor += TradeReportTransTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeIdPresent()) {
            if (end - cursor < TradeIdField.BYTE_LENGTH || !tradeId.parse(data, cursor)) {
                return false;
            }
            cursor += TradeIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (venueTypePresent()) {
            if (end - cursor < VenueTypeField.BYTE_LENGTH || !venueType.parse(data, cursor)) {
                return false;
            }
            cursor += VenueTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (matchTypePresent()) {
            if (end - cursor < MatchTypeField.BYTE_LENGTH || !matchType.parse(data, cursor)) {
                return false;
            }
            cursor += MatchTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (trdSubTypePresent()) {
            if (end - cursor < TrdSubTypeField.BYTE_LENGTH || !trdSubType.parse(data, cursor)) {
                return false;
            }
            cursor += TrdSubTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradePublishIndicatorPresent()) {
            if (end - cursor < TradePublishIndicatorField.BYTE_LENGTH || !tradePublishIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += TradePublishIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeReportTypePresent()) {
            if (end - cursor < TradeReportTypeField.BYTE_LENGTH || !tradeReportType.parse(data, cursor)) {
                return false;
            }
            cursor += TradeReportTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeHandlingInstructionPresent()) {
            if (end - cursor < TradeHandlingInstructionField.BYTE_LENGTH || !tradeHandlingInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += TradeHandlingInstructionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeLinkIdPresent()) {
            if (end - cursor < TradeLinkIdField.BYTE_LENGTH || !tradeLinkId.parse(data, cursor)) {
                return false;
            }
            cursor += TradeLinkIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (grossTradeAmtPresent()) {
            if (end - cursor < GrossTradeAmtField.BYTE_LENGTH || !grossTradeAmt.parse(data, cursor)) {
                return false;
            }
            cursor += GrossTradeAmtField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tolerancePresent()) {
            if (end - cursor < ToleranceField.BYTE_LENGTH || !tolerance.parse(data, cursor)) {
                return false;
            }
            cursor += ToleranceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderCategoryPresent()) {
            if (end - cursor < OrderCategoryField.BYTE_LENGTH || !orderCategory.parse(data, cursor)) {
                return false;
            }
            cursor += OrderCategoryField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (priceFormationPresent()) {
            if (end - cursor < PriceFormationField.BYTE_LENGTH || !priceFormation.parse(data, cursor)) {
                return false;
            }
            cursor += PriceFormationField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (algorithmicIndicatorPresent()) {
            if (end - cursor < AlgorithmicIndicatorField.BYTE_LENGTH || !algorithmicIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += AlgorithmicIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (custOrderHandlingInstPresent()) {
            if (end - cursor < CustOrderHandlingInstField.BYTE_LENGTH || !custOrderHandlingInst.parse(data, cursor)) {
                return false;
            }
            cursor += CustOrderHandlingInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (openClosePresent()) {
            if (end - cursor < OpenCloseField.BYTE_LENGTH || !openClose.parse(data, cursor)) {
                return false;
            }
            cursor += OpenCloseField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (accountTypePresent()) {
            if (end - cursor < AccountTypeField.BYTE_LENGTH || !accountType.parse(data, cursor)) {
                return false;
            }
            cursor += AccountTypeField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (tradeCaptureReportV2Bitfield1Present() != tradeCaptureReportV2Bitfield1.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportV2Bitfield1.hasValue() ? "tradeCaptureReportV2Bitfield1 holds a value the fields before it leave off the wire" : "tradeCaptureReportV2Bitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportV2Bitfield2Present() != tradeCaptureReportV2Bitfield2.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportV2Bitfield2.hasValue() ? "tradeCaptureReportV2Bitfield2 holds a value the fields before it leave off the wire" : "tradeCaptureReportV2Bitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportV2Bitfield3Present() != tradeCaptureReportV2Bitfield3.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportV2Bitfield3.hasValue() ? "tradeCaptureReportV2Bitfield3 holds a value the fields before it leave off the wire" : "tradeCaptureReportV2Bitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportV2Bitfield4Present() != tradeCaptureReportV2Bitfield4.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportV2Bitfield4.hasValue() ? "tradeCaptureReportV2Bitfield4 holds a value the fields before it leave off the wire" : "tradeCaptureReportV2Bitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportV2Bitfield5Present() != tradeCaptureReportV2Bitfield5.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportV2Bitfield5.hasValue() ? "tradeCaptureReportV2Bitfield5 holds a value the fields before it leave off the wire" : "tradeCaptureReportV2Bitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCaptureReportV2Bitfield6Present() != tradeCaptureReportV2Bitfield6.hasValue()) {
            throw new IllegalStateException(tradeCaptureReportV2Bitfield6.hasValue() ? "tradeCaptureReportV2Bitfield6 holds a value the fields before it leave off the wire" : "tradeCaptureReportV2Bitfield6 holds no value, though the fields before it put it on the wire");
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
        if (capacityPresent() != capacity.hasValue()) {
            throw new IllegalStateException(capacity.hasValue() ? "capacity holds a value the fields before it leave off the wire" : "capacity holds no value, though the fields before it put it on the wire");
        }
        if (accountPresent() != account.hasValue()) {
            throw new IllegalStateException(account.hasValue() ? "account holds a value the fields before it leave off the wire" : "account holds no value, though the fields before it put it on the wire");
        }
        if (transactionCategoryPresent() != transactionCategory.hasValue()) {
            throw new IllegalStateException(transactionCategory.hasValue() ? "transactionCategory holds a value the fields before it leave off the wire" : "transactionCategory holds no value, though the fields before it put it on the wire");
        }
        if (tradeTimePresent() != tradeTime.hasValue()) {
            throw new IllegalStateException(tradeTime.hasValue() ? "tradeTime holds a value the fields before it leave off the wire" : "tradeTime holds no value, though the fields before it put it on the wire");
        }
        if (partyRolePresent() != partyRole.hasValue()) {
            throw new IllegalStateException(partyRole.hasValue() ? "partyRole holds a value the fields before it leave off the wire" : "partyRole holds no value, though the fields before it put it on the wire");
        }
        if (tradeReportTransTypePresent() != tradeReportTransType.hasValue()) {
            throw new IllegalStateException(tradeReportTransType.hasValue() ? "tradeReportTransType holds a value the fields before it leave off the wire" : "tradeReportTransType holds no value, though the fields before it put it on the wire");
        }
        if (tradeIdPresent() != tradeId.hasValue()) {
            throw new IllegalStateException(tradeId.hasValue() ? "tradeId holds a value the fields before it leave off the wire" : "tradeId holds no value, though the fields before it put it on the wire");
        }
        if (venueTypePresent() != venueType.hasValue()) {
            throw new IllegalStateException(venueType.hasValue() ? "venueType holds a value the fields before it leave off the wire" : "venueType holds no value, though the fields before it put it on the wire");
        }
        if (matchTypePresent() != matchType.hasValue()) {
            throw new IllegalStateException(matchType.hasValue() ? "matchType holds a value the fields before it leave off the wire" : "matchType holds no value, though the fields before it put it on the wire");
        }
        if (trdSubTypePresent() != trdSubType.hasValue()) {
            throw new IllegalStateException(trdSubType.hasValue() ? "trdSubType holds a value the fields before it leave off the wire" : "trdSubType holds no value, though the fields before it put it on the wire");
        }
        if (tradePublishIndicatorPresent() != tradePublishIndicator.hasValue()) {
            throw new IllegalStateException(tradePublishIndicator.hasValue() ? "tradePublishIndicator holds a value the fields before it leave off the wire" : "tradePublishIndicator holds no value, though the fields before it put it on the wire");
        }
        if (tradeReportTypePresent() != tradeReportType.hasValue()) {
            throw new IllegalStateException(tradeReportType.hasValue() ? "tradeReportType holds a value the fields before it leave off the wire" : "tradeReportType holds no value, though the fields before it put it on the wire");
        }
        if (tradeHandlingInstructionPresent() != tradeHandlingInstruction.hasValue()) {
            throw new IllegalStateException(tradeHandlingInstruction.hasValue() ? "tradeHandlingInstruction holds a value the fields before it leave off the wire" : "tradeHandlingInstruction holds no value, though the fields before it put it on the wire");
        }
        if (tradeLinkIdPresent() != tradeLinkId.hasValue()) {
            throw new IllegalStateException(tradeLinkId.hasValue() ? "tradeLinkId holds a value the fields before it leave off the wire" : "tradeLinkId holds no value, though the fields before it put it on the wire");
        }
        if (grossTradeAmtPresent() != grossTradeAmt.hasValue()) {
            throw new IllegalStateException(grossTradeAmt.hasValue() ? "grossTradeAmt holds a value the fields before it leave off the wire" : "grossTradeAmt holds no value, though the fields before it put it on the wire");
        }
        if (tolerancePresent() != tolerance.hasValue()) {
            throw new IllegalStateException(tolerance.hasValue() ? "tolerance holds a value the fields before it leave off the wire" : "tolerance holds no value, though the fields before it put it on the wire");
        }
        if (orderCategoryPresent() != orderCategory.hasValue()) {
            throw new IllegalStateException(orderCategory.hasValue() ? "orderCategory holds a value the fields before it leave off the wire" : "orderCategory holds no value, though the fields before it put it on the wire");
        }
        if (priceFormationPresent() != priceFormation.hasValue()) {
            throw new IllegalStateException(priceFormation.hasValue() ? "priceFormation holds a value the fields before it leave off the wire" : "priceFormation holds no value, though the fields before it put it on the wire");
        }
        if (algorithmicIndicatorPresent() != algorithmicIndicator.hasValue()) {
            throw new IllegalStateException(algorithmicIndicator.hasValue() ? "algorithmicIndicator holds a value the fields before it leave off the wire" : "algorithmicIndicator holds no value, though the fields before it put it on the wire");
        }
        if (custOrderHandlingInstPresent() != custOrderHandlingInst.hasValue()) {
            throw new IllegalStateException(custOrderHandlingInst.hasValue() ? "custOrderHandlingInst holds a value the fields before it leave off the wire" : "custOrderHandlingInst holds no value, though the fields before it put it on the wire");
        }
        if (openClosePresent() != openClose.hasValue()) {
            throw new IllegalStateException(openClose.hasValue() ? "openClose holds a value the fields before it leave off the wire" : "openClose holds no value, though the fields before it put it on the wire");
        }
        if (accountTypePresent() != accountType.hasValue()) {
            throw new IllegalStateException(accountType.hasValue() ? "accountType holds a value the fields before it leave off the wire" : "accountType holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = tradeReportId.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = lastPxTradePrice.encode(data, cursor);
        cursor = numberOfTradeCaptureReportV2Bitfields.encode(data, cursor);
        if (tradeCaptureReportV2Bitfield1Present()) {
            cursor = tradeCaptureReportV2Bitfield1.encode(data, cursor);
        }
        if (tradeCaptureReportV2Bitfield2Present()) {
            cursor = tradeCaptureReportV2Bitfield2.encode(data, cursor);
        }
        if (tradeCaptureReportV2Bitfield3Present()) {
            cursor = tradeCaptureReportV2Bitfield3.encode(data, cursor);
        }
        if (tradeCaptureReportV2Bitfield4Present()) {
            cursor = tradeCaptureReportV2Bitfield4.encode(data, cursor);
        }
        if (tradeCaptureReportV2Bitfield5Present()) {
            cursor = tradeCaptureReportV2Bitfield5.encode(data, cursor);
        }
        if (tradeCaptureReportV2Bitfield6Present()) {
            cursor = tradeCaptureReportV2Bitfield6.encode(data, cursor);
        }
        cursor = noSides.encode(data, cursor);
        if (symbolAlphanumericPresent()) {
            cursor = symbolAlphanumeric.encode(data, cursor);
        }
        if (idSourcePresent()) {
            cursor = idSource.encode(data, cursor);
        }
        if (securityIdPresent()) {
            cursor = securityId.encode(data, cursor);
        }
        if (capacityPresent()) {
            cursor = capacity.encode(data, cursor);
        }
        if (accountPresent()) {
            cursor = account.encode(data, cursor);
        }
        if (transactionCategoryPresent()) {
            cursor = transactionCategory.encode(data, cursor);
        }
        if (tradeTimePresent()) {
            cursor = tradeTime.encode(data, cursor);
        }
        if (partyRolePresent()) {
            cursor = partyRole.encode(data, cursor);
        }
        if (tradeReportTransTypePresent()) {
            cursor = tradeReportTransType.encode(data, cursor);
        }
        if (tradeIdPresent()) {
            cursor = tradeId.encode(data, cursor);
        }
        if (venueTypePresent()) {
            cursor = venueType.encode(data, cursor);
        }
        if (matchTypePresent()) {
            cursor = matchType.encode(data, cursor);
        }
        if (trdSubTypePresent()) {
            cursor = trdSubType.encode(data, cursor);
        }
        if (tradePublishIndicatorPresent()) {
            cursor = tradePublishIndicator.encode(data, cursor);
        }
        if (tradeReportTypePresent()) {
            cursor = tradeReportType.encode(data, cursor);
        }
        if (tradeHandlingInstructionPresent()) {
            cursor = tradeHandlingInstruction.encode(data, cursor);
        }
        if (tradeLinkIdPresent()) {
            cursor = tradeLinkId.encode(data, cursor);
        }
        if (grossTradeAmtPresent()) {
            cursor = grossTradeAmt.encode(data, cursor);
        }
        if (tolerancePresent()) {
            cursor = tolerance.encode(data, cursor);
        }
        if (orderCategoryPresent()) {
            cursor = orderCategory.encode(data, cursor);
        }
        if (priceFormationPresent()) {
            cursor = priceFormation.encode(data, cursor);
        }
        if (algorithmicIndicatorPresent()) {
            cursor = algorithmicIndicator.encode(data, cursor);
        }
        if (custOrderHandlingInstPresent()) {
            cursor = custOrderHandlingInst.encode(data, cursor);
        }
        if (openClosePresent()) {
            cursor = openClose.encode(data, cursor);
        }
        if (accountTypePresent()) {
            cursor = accountType.encode(data, cursor);
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
            case "TradeReportId" -> Optional.of(tradeReportId);
            case "LastShares" -> Optional.of(lastShares);
            case "LastPxTradePrice" -> Optional.of(lastPxTradePrice);
            case "NumberOfTradeCaptureReportV2Bitfields" -> Optional.of(numberOfTradeCaptureReportV2Bitfields);
            case "TradeCaptureReportV2Bitfield1" -> Optional.of(tradeCaptureReportV2Bitfield1);
            case "TradeCaptureReportV2Bitfield2" -> Optional.of(tradeCaptureReportV2Bitfield2);
            case "TradeCaptureReportV2Bitfield3" -> Optional.of(tradeCaptureReportV2Bitfield3);
            case "TradeCaptureReportV2Bitfield4" -> Optional.of(tradeCaptureReportV2Bitfield4);
            case "TradeCaptureReportV2Bitfield5" -> Optional.of(tradeCaptureReportV2Bitfield5);
            case "TradeCaptureReportV2Bitfield6" -> Optional.of(tradeCaptureReportV2Bitfield6);
            case "NoSides" -> Optional.of(noSides);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "IdSource" -> Optional.of(idSource);
            case "SecurityId" -> Optional.of(securityId);
            case "Capacity" -> Optional.of(capacity);
            case "Account" -> Optional.of(account);
            case "TransactionCategory" -> Optional.of(transactionCategory);
            case "TradeTime" -> Optional.of(tradeTime);
            case "PartyRole" -> Optional.of(partyRole);
            case "TradeReportTransType" -> Optional.of(tradeReportTransType);
            case "TradeId" -> Optional.of(tradeId);
            case "VenueType" -> Optional.of(venueType);
            case "MatchType" -> Optional.of(matchType);
            case "TrdSubType" -> Optional.of(trdSubType);
            case "TradePublishIndicator" -> Optional.of(tradePublishIndicator);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "TradeHandlingInstruction" -> Optional.of(tradeHandlingInstruction);
            case "TradeLinkId" -> Optional.of(tradeLinkId);
            case "GrossTradeAmt" -> Optional.of(grossTradeAmt);
            case "Tolerance" -> Optional.of(tolerance);
            case "OrderCategory" -> Optional.of(orderCategory);
            case "PriceFormation" -> Optional.of(priceFormation);
            case "AlgorithmicIndicator" -> Optional.of(algorithmicIndicator);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "OpenClose" -> Optional.of(openClose);
            case "AccountType" -> Optional.of(accountType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCaptureReportV2Message message)) {
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
        if (!(other instanceof TradeCaptureReportV2Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
