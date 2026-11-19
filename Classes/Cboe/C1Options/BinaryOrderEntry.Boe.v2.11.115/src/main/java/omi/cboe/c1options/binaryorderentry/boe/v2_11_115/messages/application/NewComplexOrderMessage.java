package omi.cboe.c1options.binaryorderentry.boe.v2_11_115.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.AccountField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.AttributedQuoteField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.AuctionIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CapacityField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ClOrdIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ClearingAccountField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ClearingFirmField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ClearingOptionalDataField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ClientIdAttrField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CmtaNumberField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ComboOrderField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CompressionField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CrossInitiatorField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CrossOnBehalfOfIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.CustomGroupIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.DisplayRangeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.DrillThruProtectionField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.EchoTextField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.EquityExDestinationField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.EquityLegShortSellField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.EquityPartyIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ExecInstField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.ExpireTimeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.FloorDestinationField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.FloorRoutingInstField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.FrequentTraderIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.HeldField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.MaxFloorField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.MultiClassSprdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.NewComplexOrderBitfield1Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.NewComplexOrderBitfield2Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.NewComplexOrderBitfield3Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.NewComplexOrderBitfield4Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.NewComplexOrderBitfield5Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.NewComplexOrderBitfield6Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.NewComplexOrderBitfield7Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.NewComplexOrderBitfield8Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.NewComplexOrderBitfield9Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.NoLegsField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.NumberOfNewComplexOrderBitfieldsField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrdTypeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderOriginField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrderQtyBinaryField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.OrsField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PreventMatchField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PriceBinaryPriceField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.PriceTypeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.RiskResetField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.RoutingFirmIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.RoutingInstField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.SessionEligibilityField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.SideField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.StopPxField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.StopPxTypeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.StrategyIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.SymbolAlphanumericField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.TargetPartyIdField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.TiedHedgeField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.fields.TimeInForceField;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.groups.ComplexLegOrderInfoEntry;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.groups.ComplexLegOrderInfoList;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.Field;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.Message;
import omi.cboe.c1options.binaryorderentry.boe.v2_11_115.types.PrintOptions;

/**
 * Represents the NewComplexOrderMessage message from the BinaryOrderEntry protocol.
 *
 * <p>New Complex Order Message.</p>
 */
public final class NewComplexOrderMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 27;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Complex Order Message";

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol (@) and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived, persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     */
    private final SideField side = new SideField();

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 contracts.
     */
    private final OrderQtyBinaryField orderQtyBinary = new OrderQtyBinaryField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfNewComplexOrderBitfieldsField numberOfNewComplexOrderBitfields = new NumberOfNewComplexOrderBitfieldsField();

    /**
     * BitSet NewComplexOrder byte 1.
     */
    private final NewComplexOrderBitfield1Field newComplexOrderBitfield1 = new NewComplexOrderBitfield1Field();

    /**
     * BitSet NewComplexOrder byte 2.
     */
    private final NewComplexOrderBitfield2Field newComplexOrderBitfield2 = new NewComplexOrderBitfield2Field();

    /**
     * BitSet NewComplexOrder byte 3.
     */
    private final NewComplexOrderBitfield3Field newComplexOrderBitfield3 = new NewComplexOrderBitfield3Field();

    /**
     * BitSet NewComplexOrder byte 4.
     */
    private final NewComplexOrderBitfield4Field newComplexOrderBitfield4 = new NewComplexOrderBitfield4Field();

    /**
     * BitSet NewComplexOrder byte 5.
     */
    private final NewComplexOrderBitfield5Field newComplexOrderBitfield5 = new NewComplexOrderBitfield5Field();

    /**
     * BitSet NewComplexOrder byte 6.
     */
    private final NewComplexOrderBitfield6Field newComplexOrderBitfield6 = new NewComplexOrderBitfield6Field();

    /**
     * BitSet NewComplexOrder byte 7.
     */
    private final NewComplexOrderBitfield7Field newComplexOrderBitfield7 = new NewComplexOrderBitfield7Field();

    /**
     * BitSet NewComplexOrder byte 8.
     */
    private final NewComplexOrderBitfield8Field newComplexOrderBitfield8 = new NewComplexOrderBitfield8Field();

    /**
     * BitSet NewComplexOrder byte 9.
     */
    private final NewComplexOrderBitfield9Field newComplexOrderBitfield9 = new NewComplexOrderBitfield9Field();

    /**
     * Corresponds to NoLegs (555) in Cboe FIX. Indicates the number of repeating groups to fol- low. Must be a minimum of 2 and a maximum of 16.
     */
    private final NoLegsField noLegs = new NoLegsField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Clearing Account
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Price Binary Price
     */
    private final PriceBinaryPriceField priceBinaryPrice = new PriceBinaryPriceField();

    /**
     * Ord Type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Time In Force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Symbol Alphanumeric
     */
    private final SymbolAlphanumericField symbolAlphanumeric = new SymbolAlphanumericField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Routing Inst
     */
    private final RoutingInstField routingInst = new RoutingInstField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Prevent Match
     */
    private final PreventMatchField preventMatch = new PreventMatchField();

    /**
     * Expire Time
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Cmta Number
     */
    private final CmtaNumberField cmtaNumber = new CmtaNumberField();

    /**
     * Target Party Id
     */
    private final TargetPartyIdField targetPartyId = new TargetPartyIdField();

    /**
     * Attributed Quote
     */
    private final AttributedQuoteField attributedQuote = new AttributedQuoteField();

    /**
     * Echo Text
     */
    private final EchoTextField echoText = new EchoTextField();

    /**
     * Auction Id
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Routing Firm Id
     */
    private final RoutingFirmIdField routingFirmId = new RoutingFirmIdField();

    /**
     * Drill Thru Protection
     */
    private final DrillThruProtectionField drillThruProtection = new DrillThruProtectionField();

    /**
     * Risk Reset
     */
    private final RiskResetField riskReset = new RiskResetField();

    /**
     * Custom Group Id
     */
    private final CustomGroupIdField customGroupId = new CustomGroupIdField();

    /**
     * Equity Party Id
     */
    private final EquityPartyIdField equityPartyId = new EquityPartyIdField();

    /**
     * Clearing Optional Data
     */
    private final ClearingOptionalDataField clearingOptionalData = new ClearingOptionalDataField();

    /**
     * Client Id Attr
     */
    private final ClientIdAttrField clientIdAttr = new ClientIdAttrField();

    /**
     * Frequent Trader Id
     */
    private final FrequentTraderIdField frequentTraderId = new FrequentTraderIdField();

    /**
     * Session Eligibility
     */
    private final SessionEligibilityField sessionEligibility = new SessionEligibilityField();

    /**
     * Max Floor
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * Display Range
     */
    private final DisplayRangeField displayRange = new DisplayRangeField();

    /**
     * Combo Order
     */
    private final ComboOrderField comboOrder = new ComboOrderField();

    /**
     * Compression
     */
    private final CompressionField compression = new CompressionField();

    /**
     * Equity Ex Destination
     */
    private final EquityExDestinationField equityExDestination = new EquityExDestinationField();

    /**
     * Equity Leg Short Sell
     */
    private final EquityLegShortSellField equityLegShortSell = new EquityLegShortSellField();

    /**
     * Floor Destination
     */
    private final FloorDestinationField floorDestination = new FloorDestinationField();

    /**
     * Floor Routing Inst
     */
    private final FloorRoutingInstField floorRoutingInst = new FloorRoutingInstField();

    /**
     * Multi Class Sprd
     */
    private final MultiClassSprdField multiClassSprd = new MultiClassSprdField();

    /**
     * Order Origin
     */
    private final OrderOriginField orderOrigin = new OrderOriginField();

    /**
     * Ors
     */
    private final OrsField ors = new OrsField();

    /**
     * Price Type
     */
    private final PriceTypeField priceType = new PriceTypeField();

    /**
     * Strategy Id
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * Exec Inst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Tied Hedge
     */
    private final TiedHedgeField tiedHedge = new TiedHedgeField();

    /**
     * Held
     */
    private final HeldField held = new HeldField();

    /**
     * Cross Initiator
     */
    private final CrossInitiatorField crossInitiator = new CrossInitiatorField();

    /**
     * Cross On Behalf Of Id
     */
    private final CrossOnBehalfOfIdField crossOnBehalfOfId = new CrossOnBehalfOfIdField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Stop Px Type
     */
    private final StopPxTypeField stopPxType = new StopPxTypeField();

    /**
     * Repeating group stated NoLegs times.
     */
    private final ComplexLegOrderInfoList complexLegOrderInfo = new ComplexLegOrderInfoList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clOrdId, side, orderQtyBinary, numberOfNewComplexOrderBitfields, newComplexOrderBitfield1, newComplexOrderBitfield2, newComplexOrderBitfield3, newComplexOrderBitfield4, newComplexOrderBitfield5, newComplexOrderBitfield6, newComplexOrderBitfield7, newComplexOrderBitfield8, newComplexOrderBitfield9, noLegs, clearingFirm, clearingAccount, priceBinaryPrice, ordType, timeInForce, symbolAlphanumeric, capacity, routingInst, account, preventMatch, expireTime, cmtaNumber, targetPartyId, attributedQuote, echoText, auctionId, routingFirmId, drillThruProtection, riskReset, customGroupId, equityPartyId, clearingOptionalData, clientIdAttr, frequentTraderId, sessionEligibility, maxFloor, displayRange, comboOrder, compression, equityExDestination, equityLegShortSell, floorDestination, floorRoutingInst, multiClassSprd, orderOrigin, ors, priceType, strategyId, execInst, tiedHedge, held, crossInitiator, crossOnBehalfOfId, stopPx, stopPxType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol (@) and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders, which includes long-lived, persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID values unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
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
     * @return the NumberOfNewComplexOrderBitfields field
     */
    public NumberOfNewComplexOrderBitfieldsField numberOfNewComplexOrderBitfields() {
        return numberOfNewComplexOrderBitfields;
    }

    /**
     * BitSet NewComplexOrder byte 1.
     *
     * @return the NewComplexOrderBitfield1 field
     */
    public NewComplexOrderBitfield1Field newComplexOrderBitfield1() {
        return newComplexOrderBitfield1;
    }

    /**
     * BitSet NewComplexOrder byte 2.
     *
     * @return the NewComplexOrderBitfield2 field
     */
    public NewComplexOrderBitfield2Field newComplexOrderBitfield2() {
        return newComplexOrderBitfield2;
    }

    /**
     * BitSet NewComplexOrder byte 3.
     *
     * @return the NewComplexOrderBitfield3 field
     */
    public NewComplexOrderBitfield3Field newComplexOrderBitfield3() {
        return newComplexOrderBitfield3;
    }

    /**
     * BitSet NewComplexOrder byte 4.
     *
     * @return the NewComplexOrderBitfield4 field
     */
    public NewComplexOrderBitfield4Field newComplexOrderBitfield4() {
        return newComplexOrderBitfield4;
    }

    /**
     * BitSet NewComplexOrder byte 5.
     *
     * @return the NewComplexOrderBitfield5 field
     */
    public NewComplexOrderBitfield5Field newComplexOrderBitfield5() {
        return newComplexOrderBitfield5;
    }

    /**
     * BitSet NewComplexOrder byte 6.
     *
     * @return the NewComplexOrderBitfield6 field
     */
    public NewComplexOrderBitfield6Field newComplexOrderBitfield6() {
        return newComplexOrderBitfield6;
    }

    /**
     * BitSet NewComplexOrder byte 7.
     *
     * @return the NewComplexOrderBitfield7 field
     */
    public NewComplexOrderBitfield7Field newComplexOrderBitfield7() {
        return newComplexOrderBitfield7;
    }

    /**
     * BitSet NewComplexOrder byte 8.
     *
     * @return the NewComplexOrderBitfield8 field
     */
    public NewComplexOrderBitfield8Field newComplexOrderBitfield8() {
        return newComplexOrderBitfield8;
    }

    /**
     * BitSet NewComplexOrder byte 9.
     *
     * @return the NewComplexOrderBitfield9 field
     */
    public NewComplexOrderBitfield9Field newComplexOrderBitfield9() {
        return newComplexOrderBitfield9;
    }

    /**
     * Corresponds to NoLegs (555) in Cboe FIX. Indicates the number of repeating groups to fol- low. Must be a minimum of 2 and a maximum of 16.
     *
     * @return the NoLegs field
     */
    public NoLegsField noLegs() {
        return noLegs;
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
     * Clearing Account
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
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
     * Ord Type
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * Time In Force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
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
     * Capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Routing Inst
     *
     * @return the RoutingInst field
     */
    public RoutingInstField routingInst() {
        return routingInst;
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
     * Prevent Match
     *
     * @return the PreventMatch field
     */
    public PreventMatchField preventMatch() {
        return preventMatch;
    }

    /**
     * Expire Time
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
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
     * Target Party Id
     *
     * @return the TargetPartyId field
     */
    public TargetPartyIdField targetPartyId() {
        return targetPartyId;
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
     * Echo Text
     *
     * @return the EchoText field
     */
    public EchoTextField echoText() {
        return echoText;
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
     * Risk Reset
     *
     * @return the RiskReset field
     */
    public RiskResetField riskReset() {
        return riskReset;
    }

    /**
     * Custom Group Id
     *
     * @return the CustomGroupId field
     */
    public CustomGroupIdField customGroupId() {
        return customGroupId;
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
     * Frequent Trader Id
     *
     * @return the FrequentTraderId field
     */
    public FrequentTraderIdField frequentTraderId() {
        return frequentTraderId;
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
     * Max Floor
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
    }

    /**
     * Display Range
     *
     * @return the DisplayRange field
     */
    public DisplayRangeField displayRange() {
        return displayRange;
    }

    /**
     * Combo Order
     *
     * @return the ComboOrder field
     */
    public ComboOrderField comboOrder() {
        return comboOrder;
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
     * Equity Ex Destination
     *
     * @return the EquityExDestination field
     */
    public EquityExDestinationField equityExDestination() {
        return equityExDestination;
    }

    /**
     * Equity Leg Short Sell
     *
     * @return the EquityLegShortSell field
     */
    public EquityLegShortSellField equityLegShortSell() {
        return equityLegShortSell;
    }

    /**
     * Floor Destination
     *
     * @return the FloorDestination field
     */
    public FloorDestinationField floorDestination() {
        return floorDestination;
    }

    /**
     * Floor Routing Inst
     *
     * @return the FloorRoutingInst field
     */
    public FloorRoutingInstField floorRoutingInst() {
        return floorRoutingInst;
    }

    /**
     * Multi Class Sprd
     *
     * @return the MultiClassSprd field
     */
    public MultiClassSprdField multiClassSprd() {
        return multiClassSprd;
    }

    /**
     * Order Origin
     *
     * @return the OrderOrigin field
     */
    public OrderOriginField orderOrigin() {
        return orderOrigin;
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
     * Price Type
     *
     * @return the PriceType field
     */
    public PriceTypeField priceType() {
        return priceType;
    }

    /**
     * Strategy Id
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
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
     * Tied Hedge
     *
     * @return the TiedHedge field
     */
    public TiedHedgeField tiedHedge() {
        return tiedHedge;
    }

    /**
     * Held
     *
     * @return the Held field
     */
    public HeldField held() {
        return held;
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
     * Stop Px
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * Stop Px Type
     *
     * @return the StopPxType field
     */
    public StopPxTypeField stopPxType() {
        return stopPxType;
    }

    /**
     * Repeating group stated NoLegs times.
     *
     * <p>Encode writes this list's size to the NoLegs field.</p>
     *
     * @return the ComplexLegOrderInfo entries
     */
    public ComplexLegOrderInfoList complexLegOrderInfo() {
        return complexLegOrderInfo;
    }

    /**
     * Returns whether the fields before the NewComplexOrderBitfield1 put it on the wire.
     *
     * <p>Decode reads the NewComplexOrderBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexOrderBitfield1 is on the wire
     */
    public boolean newComplexOrderBitfield1Present() {
        return numberOfNewComplexOrderBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the NewComplexOrderBitfield2 put it on the wire.
     *
     * <p>Decode reads the NewComplexOrderBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexOrderBitfield2 is on the wire
     */
    public boolean newComplexOrderBitfield2Present() {
        return numberOfNewComplexOrderBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the NewComplexOrderBitfield3 put it on the wire.
     *
     * <p>Decode reads the NewComplexOrderBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexOrderBitfield3 is on the wire
     */
    public boolean newComplexOrderBitfield3Present() {
        return numberOfNewComplexOrderBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the NewComplexOrderBitfield4 put it on the wire.
     *
     * <p>Decode reads the NewComplexOrderBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexOrderBitfield4 is on the wire
     */
    public boolean newComplexOrderBitfield4Present() {
        return numberOfNewComplexOrderBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the NewComplexOrderBitfield5 put it on the wire.
     *
     * <p>Decode reads the NewComplexOrderBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexOrderBitfield5 is on the wire
     */
    public boolean newComplexOrderBitfield5Present() {
        return numberOfNewComplexOrderBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the NewComplexOrderBitfield6 put it on the wire.
     *
     * <p>Decode reads the NewComplexOrderBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexOrderBitfield6 is on the wire
     */
    public boolean newComplexOrderBitfield6Present() {
        return numberOfNewComplexOrderBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the NewComplexOrderBitfield7 put it on the wire.
     *
     * <p>Decode reads the NewComplexOrderBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexOrderBitfield7 is on the wire
     */
    public boolean newComplexOrderBitfield7Present() {
        return numberOfNewComplexOrderBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the NewComplexOrderBitfield8 put it on the wire.
     *
     * <p>Decode reads the NewComplexOrderBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexOrderBitfield8 is on the wire
     */
    public boolean newComplexOrderBitfield8Present() {
        return numberOfNewComplexOrderBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the NewComplexOrderBitfield9 put it on the wire.
     *
     * <p>Decode reads the NewComplexOrderBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewComplexOrderBitfield9 is on the wire
     */
    public boolean newComplexOrderBitfield9Present() {
        return numberOfNewComplexOrderBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 1L) && (newComplexOrderBitfield1Present() && newComplexOrderBitfield1.newComplexOrderBitfield1ClearingFIrm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 1L) && (newComplexOrderBitfield1Present() && newComplexOrderBitfield1.newComplexOrderBitfield1ClearingAccount());
    }

    /**
     * Returns whether the fields before the PriceBinaryPrice put it on the wire.
     *
     * <p>Decode reads the PriceBinaryPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceBinaryPrice is on the wire
     */
    public boolean priceBinaryPricePresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 1L) && (newComplexOrderBitfield1Present() && newComplexOrderBitfield1.newComplexOrderBitfield1Price());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 1L) && (newComplexOrderBitfield1Present() && newComplexOrderBitfield1.newComplexOrderBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 1L) && (newComplexOrderBitfield1Present() && newComplexOrderBitfield1.newComplexOrderBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 1L) && (newComplexOrderBitfield1Present() && newComplexOrderBitfield1.newComplexOrderBitfield1Symbol());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 1L) && (newComplexOrderBitfield1Present() && newComplexOrderBitfield1.newComplexOrderBitfield1Capacity());
    }

    /**
     * Returns whether the fields before the RoutingInst put it on the wire.
     *
     * <p>Decode reads the RoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingInst is on the wire
     */
    public boolean routingInstPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 1L) && (newComplexOrderBitfield1Present() && newComplexOrderBitfield1.newComplexOrderBitfield1RoutingInst());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 2L) && (newComplexOrderBitfield2Present() && newComplexOrderBitfield2.newComplexOrderBitfield2Account());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 2L) && (newComplexOrderBitfield2Present() && newComplexOrderBitfield2.newComplexOrderBitfield2PreventMatch());
    }

    /**
     * Returns whether the fields before the ExpireTime put it on the wire.
     *
     * <p>Decode reads the ExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExpireTime is on the wire
     */
    public boolean expireTimePresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 2L) && (newComplexOrderBitfield2Present() && newComplexOrderBitfield2.newComplexOrderBitfield2ExpireTime());
    }

    /**
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 2L) && (newComplexOrderBitfield2Present() && newComplexOrderBitfield2.newComplexOrderBitfield2CmtaNumber());
    }

    /**
     * Returns whether the fields before the TargetPartyId put it on the wire.
     *
     * <p>Decode reads the TargetPartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TargetPartyId is on the wire
     */
    public boolean targetPartyIdPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 2L) && (newComplexOrderBitfield2Present() && newComplexOrderBitfield2.newComplexOrderBitfield2TargetPartyId());
    }

    /**
     * Returns whether the fields before the AttributedQuote put it on the wire.
     *
     * <p>Decode reads the AttributedQuote where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AttributedQuote is on the wire
     */
    public boolean attributedQuotePresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 2L) && (newComplexOrderBitfield2Present() && newComplexOrderBitfield2.newComplexOrderBitfield2AttributedQuote());
    }

    /**
     * Returns whether the fields before the EchoText put it on the wire.
     *
     * <p>Decode reads the EchoText where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EchoText is on the wire
     */
    public boolean echoTextPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 2L) && (newComplexOrderBitfield2Present() && newComplexOrderBitfield2.newComplexOrderBitfield2EchoText());
    }

    /**
     * Returns whether the fields before the AuctionId put it on the wire.
     *
     * <p>Decode reads the AuctionId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AuctionId is on the wire
     */
    public boolean auctionIdPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 2L) && (newComplexOrderBitfield2Present() && newComplexOrderBitfield2.newComplexOrderBitfield2AuctionId());
    }

    /**
     * Returns whether the fields before the RoutingFirmId put it on the wire.
     *
     * <p>Decode reads the RoutingFirmId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RoutingFirmId is on the wire
     */
    public boolean routingFirmIdPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 3L) && (newComplexOrderBitfield3Present() && newComplexOrderBitfield3.newComplexOrderBitfield3RoutingFirmId());
    }

    /**
     * Returns whether the fields before the DrillThruProtection put it on the wire.
     *
     * <p>Decode reads the DrillThruProtection where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DrillThruProtection is on the wire
     */
    public boolean drillThruProtectionPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 3L) && (newComplexOrderBitfield3Present() && newComplexOrderBitfield3.newComplexOrderBitfield3DrillThruProtection());
    }

    /**
     * Returns whether the fields before the RiskReset put it on the wire.
     *
     * <p>Decode reads the RiskReset where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RiskReset is on the wire
     */
    public boolean riskResetPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 3L) && (newComplexOrderBitfield3Present() && newComplexOrderBitfield3.newComplexOrderBitfield3RiskReset());
    }

    /**
     * Returns whether the fields before the CustomGroupId put it on the wire.
     *
     * <p>Decode reads the CustomGroupId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CustomGroupId is on the wire
     */
    public boolean customGroupIdPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 3L) && (newComplexOrderBitfield3Present() && newComplexOrderBitfield3.newComplexOrderBitfield3CustomGroupId());
    }

    /**
     * Returns whether the fields before the EquityPartyId put it on the wire.
     *
     * <p>Decode reads the EquityPartyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityPartyId is on the wire
     */
    public boolean equityPartyIdPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 3L) && (newComplexOrderBitfield3Present() && newComplexOrderBitfield3.newComplexOrderBitfield3EquityPartyId());
    }

    /**
     * Returns whether the fields before the ClearingOptionalData put it on the wire.
     *
     * <p>Decode reads the ClearingOptionalData where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingOptionalData is on the wire
     */
    public boolean clearingOptionalDataPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 3L) && (newComplexOrderBitfield3Present() && newComplexOrderBitfield3.newComplexOrderBitfield3ClearingOptionalData());
    }

    /**
     * Returns whether the fields before the ClientIdAttr put it on the wire.
     *
     * <p>Decode reads the ClientIdAttr where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClientIdAttr is on the wire
     */
    public boolean clientIdAttrPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 4L) && (newComplexOrderBitfield4Present() && newComplexOrderBitfield4.newComplexOrderBitfield4ClientIdAttr());
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 4L) && (newComplexOrderBitfield4Present() && newComplexOrderBitfield4.newComplexOrderBitfield4FrequentTraderId());
    }

    /**
     * Returns whether the fields before the SessionEligibility put it on the wire.
     *
     * <p>Decode reads the SessionEligibility where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SessionEligibility is on the wire
     */
    public boolean sessionEligibilityPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 4L) && (newComplexOrderBitfield4Present() && newComplexOrderBitfield4.newComplexOrderBitfield4SessionEligibility());
    }

    /**
     * Returns whether the fields before the MaxFloor put it on the wire.
     *
     * <p>Decode reads the MaxFloor where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaxFloor is on the wire
     */
    public boolean maxFloorPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 4L) && (newComplexOrderBitfield4Present() && newComplexOrderBitfield4.newComplexOrderBitfield4MaxFloor());
    }

    /**
     * Returns whether the fields before the DisplayRange put it on the wire.
     *
     * <p>Decode reads the DisplayRange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DisplayRange is on the wire
     */
    public boolean displayRangePresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 4L) && (newComplexOrderBitfield4Present() && newComplexOrderBitfield4.newComplexOrderBitfield4DisplayRange());
    }

    /**
     * Returns whether the fields before the ComboOrder put it on the wire.
     *
     * <p>Decode reads the ComboOrder where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ComboOrder is on the wire
     */
    public boolean comboOrderPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 4L) && (newComplexOrderBitfield4Present() && newComplexOrderBitfield4.newComplexOrderBitfield4ComboOrder());
    }

    /**
     * Returns whether the fields before the Compression put it on the wire.
     *
     * <p>Decode reads the Compression where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Compression is on the wire
     */
    public boolean compressionPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 4L) && (newComplexOrderBitfield4Present() && newComplexOrderBitfield4.newComplexOrderBitfield4Compression());
    }

    /**
     * Returns whether the fields before the EquityExDestination put it on the wire.
     *
     * <p>Decode reads the EquityExDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityExDestination is on the wire
     */
    public boolean equityExDestinationPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 4L) && (newComplexOrderBitfield4Present() && newComplexOrderBitfield4.newComplexOrderBitfield4EquityExDestination());
    }

    /**
     * Returns whether the fields before the EquityLegShortSell put it on the wire.
     *
     * <p>Decode reads the EquityLegShortSell where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the EquityLegShortSell is on the wire
     */
    public boolean equityLegShortSellPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 5L) && (newComplexOrderBitfield5Present() && newComplexOrderBitfield5.newComplexOrderBitfield5EquityLegShortSell());
    }

    /**
     * Returns whether the fields before the FloorDestination put it on the wire.
     *
     * <p>Decode reads the FloorDestination where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FloorDestination is on the wire
     */
    public boolean floorDestinationPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 5L) && (newComplexOrderBitfield5Present() && newComplexOrderBitfield5.newComplexOrderBitfield5FloorDestination());
    }

    /**
     * Returns whether the fields before the FloorRoutingInst put it on the wire.
     *
     * <p>Decode reads the FloorRoutingInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FloorRoutingInst is on the wire
     */
    public boolean floorRoutingInstPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 5L) && (newComplexOrderBitfield5Present() && newComplexOrderBitfield5.newComplexOrderBitfield5FloorRoutingInst());
    }

    /**
     * Returns whether the fields before the MultiClassSprd put it on the wire.
     *
     * <p>Decode reads the MultiClassSprd where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MultiClassSprd is on the wire
     */
    public boolean multiClassSprdPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 5L) && (newComplexOrderBitfield5Present() && newComplexOrderBitfield5.newComplexOrderBitfield5MultiClassSprd());
    }

    /**
     * Returns whether the fields before the OrderOrigin put it on the wire.
     *
     * <p>Decode reads the OrderOrigin where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderOrigin is on the wire
     */
    public boolean orderOriginPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 5L) && (newComplexOrderBitfield5Present() && newComplexOrderBitfield5.newComplexOrderBitfield5OrderOrigin());
    }

    /**
     * Returns whether the fields before the Ors put it on the wire.
     *
     * <p>Decode reads the Ors where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Ors is on the wire
     */
    public boolean orsPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 5L) && (newComplexOrderBitfield5Present() && newComplexOrderBitfield5.newComplexOrderBitfield5Ors());
    }

    /**
     * Returns whether the fields before the PriceType put it on the wire.
     *
     * <p>Decode reads the PriceType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PriceType is on the wire
     */
    public boolean priceTypePresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 5L) && (newComplexOrderBitfield5Present() && newComplexOrderBitfield5.newComplexOrderBitfield5PriceType());
    }

    /**
     * Returns whether the fields before the StrategyId put it on the wire.
     *
     * <p>Decode reads the StrategyId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StrategyId is on the wire
     */
    public boolean strategyIdPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 5L) && (newComplexOrderBitfield5Present() && newComplexOrderBitfield5.newComplexOrderBitfield5StrategyId());
    }

    /**
     * Returns whether the fields before the ExecInst put it on the wire.
     *
     * <p>Decode reads the ExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExecInst is on the wire
     */
    public boolean execInstPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 6L) && (newComplexOrderBitfield6Present() && newComplexOrderBitfield6.newComplexOrderBitfield6ExecInst());
    }

    /**
     * Returns whether the fields before the TiedHedge put it on the wire.
     *
     * <p>Decode reads the TiedHedge where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TiedHedge is on the wire
     */
    public boolean tiedHedgePresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 6L) && (newComplexOrderBitfield6Present() && newComplexOrderBitfield6.newComplexOrderBitfield6TiedHedge());
    }

    /**
     * Returns whether the fields before the Held put it on the wire.
     *
     * <p>Decode reads the Held where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Held is on the wire
     */
    public boolean heldPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 7L) && (newComplexOrderBitfield7Present() && newComplexOrderBitfield7.newComplexOrderBitfield7Held());
    }

    /**
     * Returns whether the fields before the CrossInitiator put it on the wire.
     *
     * <p>Decode reads the CrossInitiator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossInitiator is on the wire
     */
    public boolean crossInitiatorPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 8L) && (newComplexOrderBitfield8Present() && newComplexOrderBitfield8.newComplexOrderBitfield8CrossInitiator());
    }

    /**
     * Returns whether the fields before the CrossOnBehalfOfId put it on the wire.
     *
     * <p>Decode reads the CrossOnBehalfOfId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CrossOnBehalfOfId is on the wire
     */
    public boolean crossOnBehalfOfIdPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 8L) && (newComplexOrderBitfield8Present() && newComplexOrderBitfield8.newComplexOrderBitfield8CrossOnBehalfOfId());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 8L) && (newComplexOrderBitfield8Present() && newComplexOrderBitfield8.newComplexOrderBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the StopPxType put it on the wire.
     *
     * <p>Decode reads the StopPxType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPxType is on the wire
     */
    public boolean stopPxTypePresent() {
        return (numberOfNewComplexOrderBitfields.value() >= 8L) && (newComplexOrderBitfield8Present() && newComplexOrderBitfield8.newComplexOrderBitfield8StopPxType());
    }

    private boolean onWire(Field field) {
        return (field != newComplexOrderBitfield1 || newComplexOrderBitfield1Present()) && (field != newComplexOrderBitfield2 || newComplexOrderBitfield2Present()) && (field != newComplexOrderBitfield3 || newComplexOrderBitfield3Present()) && (field != newComplexOrderBitfield4 || newComplexOrderBitfield4Present()) && (field != newComplexOrderBitfield5 || newComplexOrderBitfield5Present()) && (field != newComplexOrderBitfield6 || newComplexOrderBitfield6Present()) && (field != newComplexOrderBitfield7 || newComplexOrderBitfield7Present()) && (field != newComplexOrderBitfield8 || newComplexOrderBitfield8Present()) && (field != newComplexOrderBitfield9 || newComplexOrderBitfield9Present()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != priceBinaryPrice || priceBinaryPricePresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != capacity || capacityPresent()) && (field != routingInst || routingInstPresent()) && (field != account || accountPresent()) && (field != preventMatch || preventMatchPresent()) && (field != expireTime || expireTimePresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != targetPartyId || targetPartyIdPresent()) && (field != attributedQuote || attributedQuotePresent()) && (field != echoText || echoTextPresent()) && (field != auctionId || auctionIdPresent()) && (field != routingFirmId || routingFirmIdPresent()) && (field != drillThruProtection || drillThruProtectionPresent()) && (field != riskReset || riskResetPresent()) && (field != customGroupId || customGroupIdPresent()) && (field != equityPartyId || equityPartyIdPresent()) && (field != clearingOptionalData || clearingOptionalDataPresent()) && (field != clientIdAttr || clientIdAttrPresent()) && (field != frequentTraderId || frequentTraderIdPresent()) && (field != sessionEligibility || sessionEligibilityPresent()) && (field != maxFloor || maxFloorPresent()) && (field != displayRange || displayRangePresent()) && (field != comboOrder || comboOrderPresent()) && (field != compression || compressionPresent()) && (field != equityExDestination || equityExDestinationPresent()) && (field != equityLegShortSell || equityLegShortSellPresent()) && (field != floorDestination || floorDestinationPresent()) && (field != floorRoutingInst || floorRoutingInstPresent()) && (field != multiClassSprd || multiClassSprdPresent()) && (field != orderOrigin || orderOriginPresent()) && (field != ors || orsPresent()) && (field != priceType || priceTypePresent()) && (field != strategyId || strategyIdPresent()) && (field != execInst || execInstPresent()) && (field != tiedHedge || tiedHedgePresent()) && (field != held || heldPresent()) && (field != crossInitiator || crossInitiatorPresent()) && (field != crossOnBehalfOfId || crossOnBehalfOfIdPresent()) && (field != stopPx || stopPxPresent()) && (field != stopPxType || stopPxTypePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (newComplexOrderBitfield1Present() ? NewComplexOrderBitfield1Field.BYTE_LENGTH : 0) + (newComplexOrderBitfield2Present() ? NewComplexOrderBitfield2Field.BYTE_LENGTH : 0) + (newComplexOrderBitfield3Present() ? NewComplexOrderBitfield3Field.BYTE_LENGTH : 0) + (newComplexOrderBitfield4Present() ? NewComplexOrderBitfield4Field.BYTE_LENGTH : 0) + (newComplexOrderBitfield5Present() ? NewComplexOrderBitfield5Field.BYTE_LENGTH : 0) + (newComplexOrderBitfield6Present() ? NewComplexOrderBitfield6Field.BYTE_LENGTH : 0) + (newComplexOrderBitfield7Present() ? NewComplexOrderBitfield7Field.BYTE_LENGTH : 0) + (newComplexOrderBitfield8Present() ? NewComplexOrderBitfield8Field.BYTE_LENGTH : 0) + (newComplexOrderBitfield9Present() ? NewComplexOrderBitfield9Field.BYTE_LENGTH : 0) + complexLegOrderInfo.byteLength() + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (priceBinaryPricePresent() ? PriceBinaryPriceField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (symbolAlphanumericPresent() ? SymbolAlphanumericField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (routingInstPresent() ? RoutingInstField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (targetPartyIdPresent() ? TargetPartyIdField.BYTE_LENGTH : 0) + (attributedQuotePresent() ? AttributedQuoteField.BYTE_LENGTH : 0) + (echoTextPresent() ? EchoTextField.BYTE_LENGTH : 0) + (auctionIdPresent() ? AuctionIdField.BYTE_LENGTH : 0) + (routingFirmIdPresent() ? RoutingFirmIdField.BYTE_LENGTH : 0) + (drillThruProtectionPresent() ? DrillThruProtectionField.BYTE_LENGTH : 0) + (riskResetPresent() ? RiskResetField.BYTE_LENGTH : 0) + (customGroupIdPresent() ? CustomGroupIdField.BYTE_LENGTH : 0) + (equityPartyIdPresent() ? EquityPartyIdField.BYTE_LENGTH : 0) + (clearingOptionalDataPresent() ? ClearingOptionalDataField.BYTE_LENGTH : 0) + (clientIdAttrPresent() ? ClientIdAttrField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0) + (sessionEligibilityPresent() ? SessionEligibilityField.BYTE_LENGTH : 0) + (maxFloorPresent() ? MaxFloorField.BYTE_LENGTH : 0) + (displayRangePresent() ? DisplayRangeField.BYTE_LENGTH : 0) + (comboOrderPresent() ? ComboOrderField.BYTE_LENGTH : 0) + (compressionPresent() ? CompressionField.BYTE_LENGTH : 0) + (equityExDestinationPresent() ? EquityExDestinationField.BYTE_LENGTH : 0) + (equityLegShortSellPresent() ? EquityLegShortSellField.BYTE_LENGTH : 0) + (floorDestinationPresent() ? FloorDestinationField.BYTE_LENGTH : 0) + (floorRoutingInstPresent() ? FloorRoutingInstField.BYTE_LENGTH : 0) + (multiClassSprdPresent() ? MultiClassSprdField.BYTE_LENGTH : 0) + (orderOriginPresent() ? OrderOriginField.BYTE_LENGTH : 0) + (orsPresent() ? OrsField.BYTE_LENGTH : 0) + (priceTypePresent() ? PriceTypeField.BYTE_LENGTH : 0) + (strategyIdPresent() ? StrategyIdField.BYTE_LENGTH : 0) + (execInstPresent() ? ExecInstField.BYTE_LENGTH : 0) + (tiedHedgePresent() ? TiedHedgeField.BYTE_LENGTH : 0) + (heldPresent() ? HeldField.BYTE_LENGTH : 0) + (crossInitiatorPresent() ? CrossInitiatorField.BYTE_LENGTH : 0) + (crossOnBehalfOfIdPresent() ? CrossOnBehalfOfIdField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (stopPxTypePresent() ? StopPxTypeField.BYTE_LENGTH : 0);
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
        return Optional.ofNullable(expireTime.value());
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
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderQtyBinary.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyBinaryField.BYTE_LENGTH;
        if (!numberOfNewComplexOrderBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfNewComplexOrderBitfieldsField.BYTE_LENGTH;
        if (newComplexOrderBitfield1Present()) {
            if (end - 1 - cursor < NewComplexOrderBitfield1Field.BYTE_LENGTH || !newComplexOrderBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexOrderBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (newComplexOrderBitfield2Present()) {
            if (end - 1 - cursor < NewComplexOrderBitfield2Field.BYTE_LENGTH || !newComplexOrderBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexOrderBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (newComplexOrderBitfield3Present()) {
            if (end - 1 - cursor < NewComplexOrderBitfield3Field.BYTE_LENGTH || !newComplexOrderBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexOrderBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (newComplexOrderBitfield4Present()) {
            if (end - 1 - cursor < NewComplexOrderBitfield4Field.BYTE_LENGTH || !newComplexOrderBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexOrderBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (newComplexOrderBitfield5Present()) {
            if (end - 1 - cursor < NewComplexOrderBitfield5Field.BYTE_LENGTH || !newComplexOrderBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexOrderBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (newComplexOrderBitfield6Present()) {
            if (end - 1 - cursor < NewComplexOrderBitfield6Field.BYTE_LENGTH || !newComplexOrderBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexOrderBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (newComplexOrderBitfield7Present()) {
            if (end - 1 - cursor < NewComplexOrderBitfield7Field.BYTE_LENGTH || !newComplexOrderBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexOrderBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (newComplexOrderBitfield8Present()) {
            if (end - 1 - cursor < NewComplexOrderBitfield8Field.BYTE_LENGTH || !newComplexOrderBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexOrderBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (newComplexOrderBitfield9Present()) {
            if (end - 1 - cursor < NewComplexOrderBitfield9Field.BYTE_LENGTH || !newComplexOrderBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += NewComplexOrderBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 1) {
            return false;
        }
        if (!noLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegsField.BYTE_LENGTH;
        if (!complexLegOrderInfo.parse(data, cursor, end, noLegs.value())) {
            return false;
        }
        cursor += complexLegOrderInfo.byteLength();
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
        if (clearingAccountPresent()) {
            if (end - cursor < ClearingAccountField.BYTE_LENGTH || !clearingAccount.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingAccountField.BYTE_LENGTH;
        }
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
        if (ordTypePresent()) {
            if (end - cursor < OrdTypeField.BYTE_LENGTH || !ordType.parse(data, cursor)) {
                return false;
            }
            cursor += OrdTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (timeInForcePresent()) {
            if (end - cursor < TimeInForceField.BYTE_LENGTH || !timeInForce.parse(data, cursor)) {
                return false;
            }
            cursor += TimeInForceField.BYTE_LENGTH;
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
        if (capacityPresent()) {
            if (end - cursor < CapacityField.BYTE_LENGTH || !capacity.parse(data, cursor)) {
                return false;
            }
            cursor += CapacityField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (routingInstPresent()) {
            if (end - cursor < RoutingInstField.BYTE_LENGTH || !routingInst.parse(data, cursor)) {
                return false;
            }
            cursor += RoutingInstField.BYTE_LENGTH;
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
        if (preventMatchPresent()) {
            if (end - cursor < PreventMatchField.BYTE_LENGTH || !preventMatch.parse(data, cursor)) {
                return false;
            }
            cursor += PreventMatchField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (expireTimePresent()) {
            if (end - cursor < ExpireTimeField.BYTE_LENGTH || !expireTime.parse(data, cursor)) {
                return false;
            }
            cursor += ExpireTimeField.BYTE_LENGTH;
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
        if (targetPartyIdPresent()) {
            if (end - cursor < TargetPartyIdField.BYTE_LENGTH || !targetPartyId.parse(data, cursor)) {
                return false;
            }
            cursor += TargetPartyIdField.BYTE_LENGTH;
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
        if (echoTextPresent()) {
            if (end - cursor < EchoTextField.BYTE_LENGTH || !echoText.parse(data, cursor)) {
                return false;
            }
            cursor += EchoTextField.BYTE_LENGTH;
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
        if (end - cursor < 0) {
            return false;
        }
        if (riskResetPresent()) {
            if (end - cursor < RiskResetField.BYTE_LENGTH || !riskReset.parse(data, cursor)) {
                return false;
            }
            cursor += RiskResetField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (customGroupIdPresent()) {
            if (end - cursor < CustomGroupIdField.BYTE_LENGTH || !customGroupId.parse(data, cursor)) {
                return false;
            }
            cursor += CustomGroupIdField.BYTE_LENGTH;
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
        if (frequentTraderIdPresent()) {
            if (end - cursor < FrequentTraderIdField.BYTE_LENGTH || !frequentTraderId.parse(data, cursor)) {
                return false;
            }
            cursor += FrequentTraderIdField.BYTE_LENGTH;
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
        if (maxFloorPresent()) {
            if (end - cursor < MaxFloorField.BYTE_LENGTH || !maxFloor.parse(data, cursor)) {
                return false;
            }
            cursor += MaxFloorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (displayRangePresent()) {
            if (end - cursor < DisplayRangeField.BYTE_LENGTH || !displayRange.parse(data, cursor)) {
                return false;
            }
            cursor += DisplayRangeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (comboOrderPresent()) {
            if (end - cursor < ComboOrderField.BYTE_LENGTH || !comboOrder.parse(data, cursor)) {
                return false;
            }
            cursor += ComboOrderField.BYTE_LENGTH;
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
        if (equityExDestinationPresent()) {
            if (end - cursor < EquityExDestinationField.BYTE_LENGTH || !equityExDestination.parse(data, cursor)) {
                return false;
            }
            cursor += EquityExDestinationField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (equityLegShortSellPresent()) {
            if (end - cursor < EquityLegShortSellField.BYTE_LENGTH || !equityLegShortSell.parse(data, cursor)) {
                return false;
            }
            cursor += EquityLegShortSellField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (floorDestinationPresent()) {
            if (end - cursor < FloorDestinationField.BYTE_LENGTH || !floorDestination.parse(data, cursor)) {
                return false;
            }
            cursor += FloorDestinationField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (floorRoutingInstPresent()) {
            if (end - cursor < FloorRoutingInstField.BYTE_LENGTH || !floorRoutingInst.parse(data, cursor)) {
                return false;
            }
            cursor += FloorRoutingInstField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (multiClassSprdPresent()) {
            if (end - cursor < MultiClassSprdField.BYTE_LENGTH || !multiClassSprd.parse(data, cursor)) {
                return false;
            }
            cursor += MultiClassSprdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderOriginPresent()) {
            if (end - cursor < OrderOriginField.BYTE_LENGTH || !orderOrigin.parse(data, cursor)) {
                return false;
            }
            cursor += OrderOriginField.BYTE_LENGTH;
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
        if (priceTypePresent()) {
            if (end - cursor < PriceTypeField.BYTE_LENGTH || !priceType.parse(data, cursor)) {
                return false;
            }
            cursor += PriceTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (strategyIdPresent()) {
            if (end - cursor < StrategyIdField.BYTE_LENGTH || !strategyId.parse(data, cursor)) {
                return false;
            }
            cursor += StrategyIdField.BYTE_LENGTH;
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
        if (tiedHedgePresent()) {
            if (end - cursor < TiedHedgeField.BYTE_LENGTH || !tiedHedge.parse(data, cursor)) {
                return false;
            }
            cursor += TiedHedgeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (heldPresent()) {
            if (end - cursor < HeldField.BYTE_LENGTH || !held.parse(data, cursor)) {
                return false;
            }
            cursor += HeldField.BYTE_LENGTH;
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
        if (end - cursor < 0) {
            return false;
        }
        if (stopPxPresent()) {
            if (end - cursor < StopPxField.BYTE_LENGTH || !stopPx.parse(data, cursor)) {
                return false;
            }
            cursor += StopPxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (stopPxTypePresent()) {
            if (end - cursor < StopPxTypeField.BYTE_LENGTH || !stopPxType.parse(data, cursor)) {
                return false;
            }
            cursor += StopPxTypeField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (complexLegOrderInfo.size() > 255) {
            throw new IllegalStateException("complexLegOrderInfo holds " + complexLegOrderInfo.size() + " entries, more than its count field can state");
        }
        noLegs.value((short) complexLegOrderInfo.size());
        if (newComplexOrderBitfield1Present() != newComplexOrderBitfield1.hasValue()) {
            throw new IllegalStateException(newComplexOrderBitfield1.hasValue() ? "newComplexOrderBitfield1 holds a value the fields before it leave off the wire" : "newComplexOrderBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (newComplexOrderBitfield2Present() != newComplexOrderBitfield2.hasValue()) {
            throw new IllegalStateException(newComplexOrderBitfield2.hasValue() ? "newComplexOrderBitfield2 holds a value the fields before it leave off the wire" : "newComplexOrderBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (newComplexOrderBitfield3Present() != newComplexOrderBitfield3.hasValue()) {
            throw new IllegalStateException(newComplexOrderBitfield3.hasValue() ? "newComplexOrderBitfield3 holds a value the fields before it leave off the wire" : "newComplexOrderBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (newComplexOrderBitfield4Present() != newComplexOrderBitfield4.hasValue()) {
            throw new IllegalStateException(newComplexOrderBitfield4.hasValue() ? "newComplexOrderBitfield4 holds a value the fields before it leave off the wire" : "newComplexOrderBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (newComplexOrderBitfield5Present() != newComplexOrderBitfield5.hasValue()) {
            throw new IllegalStateException(newComplexOrderBitfield5.hasValue() ? "newComplexOrderBitfield5 holds a value the fields before it leave off the wire" : "newComplexOrderBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (newComplexOrderBitfield6Present() != newComplexOrderBitfield6.hasValue()) {
            throw new IllegalStateException(newComplexOrderBitfield6.hasValue() ? "newComplexOrderBitfield6 holds a value the fields before it leave off the wire" : "newComplexOrderBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (newComplexOrderBitfield7Present() != newComplexOrderBitfield7.hasValue()) {
            throw new IllegalStateException(newComplexOrderBitfield7.hasValue() ? "newComplexOrderBitfield7 holds a value the fields before it leave off the wire" : "newComplexOrderBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (newComplexOrderBitfield8Present() != newComplexOrderBitfield8.hasValue()) {
            throw new IllegalStateException(newComplexOrderBitfield8.hasValue() ? "newComplexOrderBitfield8 holds a value the fields before it leave off the wire" : "newComplexOrderBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (newComplexOrderBitfield9Present() != newComplexOrderBitfield9.hasValue()) {
            throw new IllegalStateException(newComplexOrderBitfield9.hasValue() ? "newComplexOrderBitfield9 holds a value the fields before it leave off the wire" : "newComplexOrderBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (clearingAccountPresent() != clearingAccount.hasValue()) {
            throw new IllegalStateException(clearingAccount.hasValue() ? "clearingAccount holds a value the fields before it leave off the wire" : "clearingAccount holds no value, though the fields before it put it on the wire");
        }
        if (priceBinaryPricePresent() != priceBinaryPrice.hasValue()) {
            throw new IllegalStateException(priceBinaryPrice.hasValue() ? "priceBinaryPrice holds a value the fields before it leave off the wire" : "priceBinaryPrice holds no value, though the fields before it put it on the wire");
        }
        if (ordTypePresent() != ordType.hasValue()) {
            throw new IllegalStateException(ordType.hasValue() ? "ordType holds a value the fields before it leave off the wire" : "ordType holds no value, though the fields before it put it on the wire");
        }
        if (timeInForcePresent() != timeInForce.hasValue()) {
            throw new IllegalStateException(timeInForce.hasValue() ? "timeInForce holds a value the fields before it leave off the wire" : "timeInForce holds no value, though the fields before it put it on the wire");
        }
        if (symbolAlphanumericPresent() != symbolAlphanumeric.hasValue()) {
            throw new IllegalStateException(symbolAlphanumeric.hasValue() ? "symbolAlphanumeric holds a value the fields before it leave off the wire" : "symbolAlphanumeric holds no value, though the fields before it put it on the wire");
        }
        if (capacityPresent() != capacity.hasValue()) {
            throw new IllegalStateException(capacity.hasValue() ? "capacity holds a value the fields before it leave off the wire" : "capacity holds no value, though the fields before it put it on the wire");
        }
        if (routingInstPresent() != routingInst.hasValue()) {
            throw new IllegalStateException(routingInst.hasValue() ? "routingInst holds a value the fields before it leave off the wire" : "routingInst holds no value, though the fields before it put it on the wire");
        }
        if (accountPresent() != account.hasValue()) {
            throw new IllegalStateException(account.hasValue() ? "account holds a value the fields before it leave off the wire" : "account holds no value, though the fields before it put it on the wire");
        }
        if (preventMatchPresent() != preventMatch.hasValue()) {
            throw new IllegalStateException(preventMatch.hasValue() ? "preventMatch holds a value the fields before it leave off the wire" : "preventMatch holds no value, though the fields before it put it on the wire");
        }
        if (expireTimePresent() != expireTime.hasValue()) {
            throw new IllegalStateException(expireTime.hasValue() ? "expireTime holds a value the fields before it leave off the wire" : "expireTime holds no value, though the fields before it put it on the wire");
        }
        if (cmtaNumberPresent() != cmtaNumber.hasValue()) {
            throw new IllegalStateException(cmtaNumber.hasValue() ? "cmtaNumber holds a value the fields before it leave off the wire" : "cmtaNumber holds no value, though the fields before it put it on the wire");
        }
        if (targetPartyIdPresent() != targetPartyId.hasValue()) {
            throw new IllegalStateException(targetPartyId.hasValue() ? "targetPartyId holds a value the fields before it leave off the wire" : "targetPartyId holds no value, though the fields before it put it on the wire");
        }
        if (attributedQuotePresent() != attributedQuote.hasValue()) {
            throw new IllegalStateException(attributedQuote.hasValue() ? "attributedQuote holds a value the fields before it leave off the wire" : "attributedQuote holds no value, though the fields before it put it on the wire");
        }
        if (echoTextPresent() != echoText.hasValue()) {
            throw new IllegalStateException(echoText.hasValue() ? "echoText holds a value the fields before it leave off the wire" : "echoText holds no value, though the fields before it put it on the wire");
        }
        if (auctionIdPresent() != auctionId.hasValue()) {
            throw new IllegalStateException(auctionId.hasValue() ? "auctionId holds a value the fields before it leave off the wire" : "auctionId holds no value, though the fields before it put it on the wire");
        }
        if (routingFirmIdPresent() != routingFirmId.hasValue()) {
            throw new IllegalStateException(routingFirmId.hasValue() ? "routingFirmId holds a value the fields before it leave off the wire" : "routingFirmId holds no value, though the fields before it put it on the wire");
        }
        if (drillThruProtectionPresent() != drillThruProtection.hasValue()) {
            throw new IllegalStateException(drillThruProtection.hasValue() ? "drillThruProtection holds a value the fields before it leave off the wire" : "drillThruProtection holds no value, though the fields before it put it on the wire");
        }
        if (riskResetPresent() != riskReset.hasValue()) {
            throw new IllegalStateException(riskReset.hasValue() ? "riskReset holds a value the fields before it leave off the wire" : "riskReset holds no value, though the fields before it put it on the wire");
        }
        if (customGroupIdPresent() != customGroupId.hasValue()) {
            throw new IllegalStateException(customGroupId.hasValue() ? "customGroupId holds a value the fields before it leave off the wire" : "customGroupId holds no value, though the fields before it put it on the wire");
        }
        if (equityPartyIdPresent() != equityPartyId.hasValue()) {
            throw new IllegalStateException(equityPartyId.hasValue() ? "equityPartyId holds a value the fields before it leave off the wire" : "equityPartyId holds no value, though the fields before it put it on the wire");
        }
        if (clearingOptionalDataPresent() != clearingOptionalData.hasValue()) {
            throw new IllegalStateException(clearingOptionalData.hasValue() ? "clearingOptionalData holds a value the fields before it leave off the wire" : "clearingOptionalData holds no value, though the fields before it put it on the wire");
        }
        if (clientIdAttrPresent() != clientIdAttr.hasValue()) {
            throw new IllegalStateException(clientIdAttr.hasValue() ? "clientIdAttr holds a value the fields before it leave off the wire" : "clientIdAttr holds no value, though the fields before it put it on the wire");
        }
        if (frequentTraderIdPresent() != frequentTraderId.hasValue()) {
            throw new IllegalStateException(frequentTraderId.hasValue() ? "frequentTraderId holds a value the fields before it leave off the wire" : "frequentTraderId holds no value, though the fields before it put it on the wire");
        }
        if (sessionEligibilityPresent() != sessionEligibility.hasValue()) {
            throw new IllegalStateException(sessionEligibility.hasValue() ? "sessionEligibility holds a value the fields before it leave off the wire" : "sessionEligibility holds no value, though the fields before it put it on the wire");
        }
        if (maxFloorPresent() != maxFloor.hasValue()) {
            throw new IllegalStateException(maxFloor.hasValue() ? "maxFloor holds a value the fields before it leave off the wire" : "maxFloor holds no value, though the fields before it put it on the wire");
        }
        if (displayRangePresent() != displayRange.hasValue()) {
            throw new IllegalStateException(displayRange.hasValue() ? "displayRange holds a value the fields before it leave off the wire" : "displayRange holds no value, though the fields before it put it on the wire");
        }
        if (comboOrderPresent() != comboOrder.hasValue()) {
            throw new IllegalStateException(comboOrder.hasValue() ? "comboOrder holds a value the fields before it leave off the wire" : "comboOrder holds no value, though the fields before it put it on the wire");
        }
        if (compressionPresent() != compression.hasValue()) {
            throw new IllegalStateException(compression.hasValue() ? "compression holds a value the fields before it leave off the wire" : "compression holds no value, though the fields before it put it on the wire");
        }
        if (equityExDestinationPresent() != equityExDestination.hasValue()) {
            throw new IllegalStateException(equityExDestination.hasValue() ? "equityExDestination holds a value the fields before it leave off the wire" : "equityExDestination holds no value, though the fields before it put it on the wire");
        }
        if (equityLegShortSellPresent() != equityLegShortSell.hasValue()) {
            throw new IllegalStateException(equityLegShortSell.hasValue() ? "equityLegShortSell holds a value the fields before it leave off the wire" : "equityLegShortSell holds no value, though the fields before it put it on the wire");
        }
        if (floorDestinationPresent() != floorDestination.hasValue()) {
            throw new IllegalStateException(floorDestination.hasValue() ? "floorDestination holds a value the fields before it leave off the wire" : "floorDestination holds no value, though the fields before it put it on the wire");
        }
        if (floorRoutingInstPresent() != floorRoutingInst.hasValue()) {
            throw new IllegalStateException(floorRoutingInst.hasValue() ? "floorRoutingInst holds a value the fields before it leave off the wire" : "floorRoutingInst holds no value, though the fields before it put it on the wire");
        }
        if (multiClassSprdPresent() != multiClassSprd.hasValue()) {
            throw new IllegalStateException(multiClassSprd.hasValue() ? "multiClassSprd holds a value the fields before it leave off the wire" : "multiClassSprd holds no value, though the fields before it put it on the wire");
        }
        if (orderOriginPresent() != orderOrigin.hasValue()) {
            throw new IllegalStateException(orderOrigin.hasValue() ? "orderOrigin holds a value the fields before it leave off the wire" : "orderOrigin holds no value, though the fields before it put it on the wire");
        }
        if (orsPresent() != ors.hasValue()) {
            throw new IllegalStateException(ors.hasValue() ? "ors holds a value the fields before it leave off the wire" : "ors holds no value, though the fields before it put it on the wire");
        }
        if (priceTypePresent() != priceType.hasValue()) {
            throw new IllegalStateException(priceType.hasValue() ? "priceType holds a value the fields before it leave off the wire" : "priceType holds no value, though the fields before it put it on the wire");
        }
        if (strategyIdPresent() != strategyId.hasValue()) {
            throw new IllegalStateException(strategyId.hasValue() ? "strategyId holds a value the fields before it leave off the wire" : "strategyId holds no value, though the fields before it put it on the wire");
        }
        if (execInstPresent() != execInst.hasValue()) {
            throw new IllegalStateException(execInst.hasValue() ? "execInst holds a value the fields before it leave off the wire" : "execInst holds no value, though the fields before it put it on the wire");
        }
        if (tiedHedgePresent() != tiedHedge.hasValue()) {
            throw new IllegalStateException(tiedHedge.hasValue() ? "tiedHedge holds a value the fields before it leave off the wire" : "tiedHedge holds no value, though the fields before it put it on the wire");
        }
        if (heldPresent() != held.hasValue()) {
            throw new IllegalStateException(held.hasValue() ? "held holds a value the fields before it leave off the wire" : "held holds no value, though the fields before it put it on the wire");
        }
        if (crossInitiatorPresent() != crossInitiator.hasValue()) {
            throw new IllegalStateException(crossInitiator.hasValue() ? "crossInitiator holds a value the fields before it leave off the wire" : "crossInitiator holds no value, though the fields before it put it on the wire");
        }
        if (crossOnBehalfOfIdPresent() != crossOnBehalfOfId.hasValue()) {
            throw new IllegalStateException(crossOnBehalfOfId.hasValue() ? "crossOnBehalfOfId holds a value the fields before it leave off the wire" : "crossOnBehalfOfId holds no value, though the fields before it put it on the wire");
        }
        if (stopPxPresent() != stopPx.hasValue()) {
            throw new IllegalStateException(stopPx.hasValue() ? "stopPx holds a value the fields before it leave off the wire" : "stopPx holds no value, though the fields before it put it on the wire");
        }
        if (stopPxTypePresent() != stopPxType.hasValue()) {
            throw new IllegalStateException(stopPxType.hasValue() ? "stopPxType holds a value the fields before it leave off the wire" : "stopPxType holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderQtyBinary.encode(data, cursor);
        cursor = numberOfNewComplexOrderBitfields.encode(data, cursor);
        if (newComplexOrderBitfield1Present()) {
            cursor = newComplexOrderBitfield1.encode(data, cursor);
        }
        if (newComplexOrderBitfield2Present()) {
            cursor = newComplexOrderBitfield2.encode(data, cursor);
        }
        if (newComplexOrderBitfield3Present()) {
            cursor = newComplexOrderBitfield3.encode(data, cursor);
        }
        if (newComplexOrderBitfield4Present()) {
            cursor = newComplexOrderBitfield4.encode(data, cursor);
        }
        if (newComplexOrderBitfield5Present()) {
            cursor = newComplexOrderBitfield5.encode(data, cursor);
        }
        if (newComplexOrderBitfield6Present()) {
            cursor = newComplexOrderBitfield6.encode(data, cursor);
        }
        if (newComplexOrderBitfield7Present()) {
            cursor = newComplexOrderBitfield7.encode(data, cursor);
        }
        if (newComplexOrderBitfield8Present()) {
            cursor = newComplexOrderBitfield8.encode(data, cursor);
        }
        if (newComplexOrderBitfield9Present()) {
            cursor = newComplexOrderBitfield9.encode(data, cursor);
        }
        cursor = noLegs.encode(data, cursor);
        cursor = complexLegOrderInfo.encode(data, cursor);
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (clearingAccountPresent()) {
            cursor = clearingAccount.encode(data, cursor);
        }
        if (priceBinaryPricePresent()) {
            cursor = priceBinaryPrice.encode(data, cursor);
        }
        if (ordTypePresent()) {
            cursor = ordType.encode(data, cursor);
        }
        if (timeInForcePresent()) {
            cursor = timeInForce.encode(data, cursor);
        }
        if (symbolAlphanumericPresent()) {
            cursor = symbolAlphanumeric.encode(data, cursor);
        }
        if (capacityPresent()) {
            cursor = capacity.encode(data, cursor);
        }
        if (routingInstPresent()) {
            cursor = routingInst.encode(data, cursor);
        }
        if (accountPresent()) {
            cursor = account.encode(data, cursor);
        }
        if (preventMatchPresent()) {
            cursor = preventMatch.encode(data, cursor);
        }
        if (expireTimePresent()) {
            cursor = expireTime.encode(data, cursor);
        }
        if (cmtaNumberPresent()) {
            cursor = cmtaNumber.encode(data, cursor);
        }
        if (targetPartyIdPresent()) {
            cursor = targetPartyId.encode(data, cursor);
        }
        if (attributedQuotePresent()) {
            cursor = attributedQuote.encode(data, cursor);
        }
        if (echoTextPresent()) {
            cursor = echoText.encode(data, cursor);
        }
        if (auctionIdPresent()) {
            cursor = auctionId.encode(data, cursor);
        }
        if (routingFirmIdPresent()) {
            cursor = routingFirmId.encode(data, cursor);
        }
        if (drillThruProtectionPresent()) {
            cursor = drillThruProtection.encode(data, cursor);
        }
        if (riskResetPresent()) {
            cursor = riskReset.encode(data, cursor);
        }
        if (customGroupIdPresent()) {
            cursor = customGroupId.encode(data, cursor);
        }
        if (equityPartyIdPresent()) {
            cursor = equityPartyId.encode(data, cursor);
        }
        if (clearingOptionalDataPresent()) {
            cursor = clearingOptionalData.encode(data, cursor);
        }
        if (clientIdAttrPresent()) {
            cursor = clientIdAttr.encode(data, cursor);
        }
        if (frequentTraderIdPresent()) {
            cursor = frequentTraderId.encode(data, cursor);
        }
        if (sessionEligibilityPresent()) {
            cursor = sessionEligibility.encode(data, cursor);
        }
        if (maxFloorPresent()) {
            cursor = maxFloor.encode(data, cursor);
        }
        if (displayRangePresent()) {
            cursor = displayRange.encode(data, cursor);
        }
        if (comboOrderPresent()) {
            cursor = comboOrder.encode(data, cursor);
        }
        if (compressionPresent()) {
            cursor = compression.encode(data, cursor);
        }
        if (equityExDestinationPresent()) {
            cursor = equityExDestination.encode(data, cursor);
        }
        if (equityLegShortSellPresent()) {
            cursor = equityLegShortSell.encode(data, cursor);
        }
        if (floorDestinationPresent()) {
            cursor = floorDestination.encode(data, cursor);
        }
        if (floorRoutingInstPresent()) {
            cursor = floorRoutingInst.encode(data, cursor);
        }
        if (multiClassSprdPresent()) {
            cursor = multiClassSprd.encode(data, cursor);
        }
        if (orderOriginPresent()) {
            cursor = orderOrigin.encode(data, cursor);
        }
        if (orsPresent()) {
            cursor = ors.encode(data, cursor);
        }
        if (priceTypePresent()) {
            cursor = priceType.encode(data, cursor);
        }
        if (strategyIdPresent()) {
            cursor = strategyId.encode(data, cursor);
        }
        if (execInstPresent()) {
            cursor = execInst.encode(data, cursor);
        }
        if (tiedHedgePresent()) {
            cursor = tiedHedge.encode(data, cursor);
        }
        if (heldPresent()) {
            cursor = held.encode(data, cursor);
        }
        if (crossInitiatorPresent()) {
            cursor = crossInitiator.encode(data, cursor);
        }
        if (crossOnBehalfOfIdPresent()) {
            cursor = crossOnBehalfOfId.encode(data, cursor);
        }
        if (stopPxPresent()) {
            cursor = stopPx.encode(data, cursor);
        }
        if (stopPxTypePresent()) {
            cursor = stopPxType.encode(data, cursor);
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
        complexLegOrderInfo.clear();
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
            if (field != noLegs && !field.isRecognized()) {
                return false;
            }
        }
        return complexLegOrderInfo.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != noLegs && !field.isValid()) {
                return false;
            }
        }
        if (!complexLegOrderInfo.isValid()) {
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
        if (!clOrdId.isDecoded()) {
            return Optional.of(clOrdId);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!orderQtyBinary.isDecoded()) {
            return Optional.of(orderQtyBinary);
        }
        if (!numberOfNewComplexOrderBitfields.isDecoded()) {
            return Optional.of(numberOfNewComplexOrderBitfields);
        }
        if (newComplexOrderBitfield1Present() && !newComplexOrderBitfield1.isDecoded()) {
            return Optional.of(newComplexOrderBitfield1);
        }
        if (newComplexOrderBitfield2Present() && !newComplexOrderBitfield2.isDecoded()) {
            return Optional.of(newComplexOrderBitfield2);
        }
        if (newComplexOrderBitfield3Present() && !newComplexOrderBitfield3.isDecoded()) {
            return Optional.of(newComplexOrderBitfield3);
        }
        if (newComplexOrderBitfield4Present() && !newComplexOrderBitfield4.isDecoded()) {
            return Optional.of(newComplexOrderBitfield4);
        }
        if (newComplexOrderBitfield5Present() && !newComplexOrderBitfield5.isDecoded()) {
            return Optional.of(newComplexOrderBitfield5);
        }
        if (newComplexOrderBitfield6Present() && !newComplexOrderBitfield6.isDecoded()) {
            return Optional.of(newComplexOrderBitfield6);
        }
        if (newComplexOrderBitfield7Present() && !newComplexOrderBitfield7.isDecoded()) {
            return Optional.of(newComplexOrderBitfield7);
        }
        if (newComplexOrderBitfield8Present() && !newComplexOrderBitfield8.isDecoded()) {
            return Optional.of(newComplexOrderBitfield8);
        }
        if (newComplexOrderBitfield9Present() && !newComplexOrderBitfield9.isDecoded()) {
            return Optional.of(newComplexOrderBitfield9);
        }
        if (!noLegs.isDecoded()) {
            return Optional.of(noLegs);
        }
        if (!complexLegOrderInfo.isDecoded()) {
            return Optional.of(complexLegOrderInfo.failedEntry().flatMap(ComplexLegOrderInfoEntry::failedAt).orElse(noLegs));
        }
        if (clearingFirmPresent() && !clearingFirm.isDecoded()) {
            return Optional.of(clearingFirm);
        }
        if (clearingAccountPresent() && !clearingAccount.isDecoded()) {
            return Optional.of(clearingAccount);
        }
        if (priceBinaryPricePresent() && !priceBinaryPrice.isDecoded()) {
            return Optional.of(priceBinaryPrice);
        }
        if (ordTypePresent() && !ordType.isDecoded()) {
            return Optional.of(ordType);
        }
        if (timeInForcePresent() && !timeInForce.isDecoded()) {
            return Optional.of(timeInForce);
        }
        if (symbolAlphanumericPresent() && !symbolAlphanumeric.isDecoded()) {
            return Optional.of(symbolAlphanumeric);
        }
        if (capacityPresent() && !capacity.isDecoded()) {
            return Optional.of(capacity);
        }
        if (routingInstPresent() && !routingInst.isDecoded()) {
            return Optional.of(routingInst);
        }
        if (accountPresent() && !account.isDecoded()) {
            return Optional.of(account);
        }
        if (preventMatchPresent() && !preventMatch.isDecoded()) {
            return Optional.of(preventMatch);
        }
        if (expireTimePresent() && !expireTime.isDecoded()) {
            return Optional.of(expireTime);
        }
        if (cmtaNumberPresent() && !cmtaNumber.isDecoded()) {
            return Optional.of(cmtaNumber);
        }
        if (targetPartyIdPresent() && !targetPartyId.isDecoded()) {
            return Optional.of(targetPartyId);
        }
        if (attributedQuotePresent() && !attributedQuote.isDecoded()) {
            return Optional.of(attributedQuote);
        }
        if (echoTextPresent() && !echoText.isDecoded()) {
            return Optional.of(echoText);
        }
        if (auctionIdPresent() && !auctionId.isDecoded()) {
            return Optional.of(auctionId);
        }
        if (routingFirmIdPresent() && !routingFirmId.isDecoded()) {
            return Optional.of(routingFirmId);
        }
        if (drillThruProtectionPresent() && !drillThruProtection.isDecoded()) {
            return Optional.of(drillThruProtection);
        }
        if (riskResetPresent() && !riskReset.isDecoded()) {
            return Optional.of(riskReset);
        }
        if (customGroupIdPresent() && !customGroupId.isDecoded()) {
            return Optional.of(customGroupId);
        }
        if (equityPartyIdPresent() && !equityPartyId.isDecoded()) {
            return Optional.of(equityPartyId);
        }
        if (clearingOptionalDataPresent() && !clearingOptionalData.isDecoded()) {
            return Optional.of(clearingOptionalData);
        }
        if (clientIdAttrPresent() && !clientIdAttr.isDecoded()) {
            return Optional.of(clientIdAttr);
        }
        if (frequentTraderIdPresent() && !frequentTraderId.isDecoded()) {
            return Optional.of(frequentTraderId);
        }
        if (sessionEligibilityPresent() && !sessionEligibility.isDecoded()) {
            return Optional.of(sessionEligibility);
        }
        if (maxFloorPresent() && !maxFloor.isDecoded()) {
            return Optional.of(maxFloor);
        }
        if (displayRangePresent() && !displayRange.isDecoded()) {
            return Optional.of(displayRange);
        }
        if (comboOrderPresent() && !comboOrder.isDecoded()) {
            return Optional.of(comboOrder);
        }
        if (compressionPresent() && !compression.isDecoded()) {
            return Optional.of(compression);
        }
        if (equityExDestinationPresent() && !equityExDestination.isDecoded()) {
            return Optional.of(equityExDestination);
        }
        if (equityLegShortSellPresent() && !equityLegShortSell.isDecoded()) {
            return Optional.of(equityLegShortSell);
        }
        if (floorDestinationPresent() && !floorDestination.isDecoded()) {
            return Optional.of(floorDestination);
        }
        if (floorRoutingInstPresent() && !floorRoutingInst.isDecoded()) {
            return Optional.of(floorRoutingInst);
        }
        if (multiClassSprdPresent() && !multiClassSprd.isDecoded()) {
            return Optional.of(multiClassSprd);
        }
        if (orderOriginPresent() && !orderOrigin.isDecoded()) {
            return Optional.of(orderOrigin);
        }
        if (orsPresent() && !ors.isDecoded()) {
            return Optional.of(ors);
        }
        if (priceTypePresent() && !priceType.isDecoded()) {
            return Optional.of(priceType);
        }
        if (strategyIdPresent() && !strategyId.isDecoded()) {
            return Optional.of(strategyId);
        }
        if (execInstPresent() && !execInst.isDecoded()) {
            return Optional.of(execInst);
        }
        if (tiedHedgePresent() && !tiedHedge.isDecoded()) {
            return Optional.of(tiedHedge);
        }
        if (heldPresent() && !held.isDecoded()) {
            return Optional.of(held);
        }
        if (crossInitiatorPresent() && !crossInitiator.isDecoded()) {
            return Optional.of(crossInitiator);
        }
        if (crossOnBehalfOfIdPresent() && !crossOnBehalfOfId.isDecoded()) {
            return Optional.of(crossOnBehalfOfId);
        }
        if (stopPxPresent() && !stopPx.isDecoded()) {
            return Optional.of(stopPx);
        }
        if (stopPxTypePresent() && !stopPxType.isDecoded()) {
            return Optional.of(stopPxType);
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
            case "ClOrdId" -> Optional.of(clOrdId);
            case "Side" -> Optional.of(side);
            case "OrderQtyBinary" -> Optional.of(orderQtyBinary);
            case "NumberOfNewComplexOrderBitfields" -> Optional.of(numberOfNewComplexOrderBitfields);
            case "NewComplexOrderBitfield1" -> Optional.of(newComplexOrderBitfield1);
            case "NewComplexOrderBitfield2" -> Optional.of(newComplexOrderBitfield2);
            case "NewComplexOrderBitfield3" -> Optional.of(newComplexOrderBitfield3);
            case "NewComplexOrderBitfield4" -> Optional.of(newComplexOrderBitfield4);
            case "NewComplexOrderBitfield5" -> Optional.of(newComplexOrderBitfield5);
            case "NewComplexOrderBitfield6" -> Optional.of(newComplexOrderBitfield6);
            case "NewComplexOrderBitfield7" -> Optional.of(newComplexOrderBitfield7);
            case "NewComplexOrderBitfield8" -> Optional.of(newComplexOrderBitfield8);
            case "NewComplexOrderBitfield9" -> Optional.of(newComplexOrderBitfield9);
            case "NoLegs" -> Optional.of(noLegs);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "PriceBinaryPrice" -> Optional.of(priceBinaryPrice);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "Capacity" -> Optional.of(capacity);
            case "RoutingInst" -> Optional.of(routingInst);
            case "Account" -> Optional.of(account);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "ExpireTime" -> Optional.of(expireTime);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "TargetPartyId" -> Optional.of(targetPartyId);
            case "AttributedQuote" -> Optional.of(attributedQuote);
            case "EchoText" -> Optional.of(echoText);
            case "AuctionId" -> Optional.of(auctionId);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "DrillThruProtection" -> Optional.of(drillThruProtection);
            case "RiskReset" -> Optional.of(riskReset);
            case "CustomGroupId" -> Optional.of(customGroupId);
            case "EquityPartyId" -> Optional.of(equityPartyId);
            case "ClearingOptionalData" -> Optional.of(clearingOptionalData);
            case "ClientIdAttr" -> Optional.of(clientIdAttr);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            case "SessionEligibility" -> Optional.of(sessionEligibility);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "DisplayRange" -> Optional.of(displayRange);
            case "ComboOrder" -> Optional.of(comboOrder);
            case "Compression" -> Optional.of(compression);
            case "EquityExDestination" -> Optional.of(equityExDestination);
            case "EquityLegShortSell" -> Optional.of(equityLegShortSell);
            case "FloorDestination" -> Optional.of(floorDestination);
            case "FloorRoutingInst" -> Optional.of(floorRoutingInst);
            case "MultiClassSprd" -> Optional.of(multiClassSprd);
            case "OrderOrigin" -> Optional.of(orderOrigin);
            case "Ors" -> Optional.of(ors);
            case "PriceType" -> Optional.of(priceType);
            case "StrategyId" -> Optional.of(strategyId);
            case "ExecInst" -> Optional.of(execInst);
            case "TiedHedge" -> Optional.of(tiedHedge);
            case "Held" -> Optional.of(held);
            case "CrossInitiator" -> Optional.of(crossInitiator);
            case "CrossOnBehalfOfId" -> Optional.of(crossOnBehalfOfId);
            case "StopPx" -> Optional.of(stopPx);
            case "StopPxType" -> Optional.of(stopPxType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewComplexOrderMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(complexLegOrderInfo.diffFields(message.complexLegOrderInfo));
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
            complexLegOrderInfo.toFormattedString(builder, options);
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
        complexLegOrderInfo.toFormattedString(builder, nested);
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
        if (!(other instanceof NewComplexOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && complexLegOrderInfo.equals(message.complexLegOrderInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, complexLegOrderInfo);
    }
}
