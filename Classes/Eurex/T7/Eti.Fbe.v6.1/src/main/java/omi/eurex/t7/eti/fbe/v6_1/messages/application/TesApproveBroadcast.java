package omi.eurex.t7.eti.fbe.v6_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v6_1.fields.AccountField;
import omi.eurex.t7.eti.fbe.v6_1.fields.AllocIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.AllocQtyField;
import omi.eurex.t7.eti.fbe.v6_1.fields.ComplianceTextField;
import omi.eurex.t7.eti.fbe.v6_1.fields.CustOrderHandlingInstField;
import omi.eurex.t7.eti.fbe.v6_1.fields.FreeText1Field;
import omi.eurex.t7.eti.fbe.v6_1.fields.FreeText2Field;
import omi.eurex.t7.eti.fbe.v6_1.fields.FreeText3Field;
import omi.eurex.t7.eti.fbe.v6_1.fields.HedgeTypeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.LastPxField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MessageEventSourceField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NegotiationIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NoEventsField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NoInstrAttribField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NoLegsField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NoUnderlyingStipsField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PackageIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyEnteringTraderField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyExecutingFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyExecutingTraderField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyIdBeneficiaryField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyIdEnteringFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyIdLocationIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyIdOrderOriginationFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyIdPositionAccountField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyIdSettlementLocationField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartyIdTakeUpTradingFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PositionEffectField;
import omi.eurex.t7.eti.fbe.v6_1.fields.ProductComplexField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RelatedClosePriceField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RelatedMarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RelatedTradeIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RelatedTradeQuantityField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyExecutingFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyExecutingTraderField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SecurityIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SideField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SrqsRelatedTradeIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TesExecIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradeAllocStatusField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradePublishIndicatorField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradeReportIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradeReportTypeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradingCapacityField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TransBkdTimeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TransactTimeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TrdTypeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.UnderlyingCurrencyField;
import omi.eurex.t7.eti.fbe.v6_1.fields.UnderlyingIssuerField;
import omi.eurex.t7.eti.fbe.v6_1.fields.UnderlyingMaturityDateField;
import omi.eurex.t7.eti.fbe.v6_1.fields.UnderlyingPxField;
import omi.eurex.t7.eti.fbe.v6_1.fields.UnderlyingQtyField;
import omi.eurex.t7.eti.fbe.v6_1.fields.UnderlyingSecurityDescField;
import omi.eurex.t7.eti.fbe.v6_1.fields.UnderlyingSecurityIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.UnderlyingSettlementDateField;
import omi.eurex.t7.eti.fbe.v6_1.groups.InstrumentAttributeGrpCompEntry;
import omi.eurex.t7.eti.fbe.v6_1.groups.InstrumentAttributeGrpCompList;
import omi.eurex.t7.eti.fbe.v6_1.groups.InstrumentEventGrpCompEntry;
import omi.eurex.t7.eti.fbe.v6_1.groups.InstrumentEventGrpCompList;
import omi.eurex.t7.eti.fbe.v6_1.groups.TrdInstrmntLegGrpCompEntry;
import omi.eurex.t7.eti.fbe.v6_1.groups.TrdInstrmntLegGrpCompList;
import omi.eurex.t7.eti.fbe.v6_1.groups.UnderlyingStipGrpCompEntry;
import omi.eurex.t7.eti.fbe.v6_1.groups.UnderlyingStipGrpCompList;
import omi.eurex.t7.eti.fbe.v6_1.structs.RbcHeaderComp;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.Message;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * Represents the TesApproveBroadcast message from the Eti protocol.
 */
public final class TesApproveBroadcast implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 394;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Tes Approve Broadcast";

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Transact Time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Underlying Px
     */
    private final UnderlyingPxField underlyingPx = new UnderlyingPxField();

    /**
     * Trans Bkd Time
     */
    private final TransBkdTimeField transBkdTime = new TransBkdTimeField();

    /**
     * Related Close Price
     */
    private final RelatedClosePriceField relatedClosePrice = new RelatedClosePriceField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Package Id
     */
    private final PackageIdField packageId = new PackageIdField();

    /**
     * Tes Exec Id
     */
    private final TesExecIdField tesExecId = new TesExecIdField();

    /**
     * Alloc Qty
     */
    private final AllocQtyField allocQty = new AllocQtyField();

    /**
     * Alloc Id
     */
    private final AllocIdField allocId = new AllocIdField();

    /**
     * Underlying Settlement Date
     */
    private final UnderlyingSettlementDateField underlyingSettlementDate = new UnderlyingSettlementDateField();

    /**
     * Underlying Maturity Date
     */
    private final UnderlyingMaturityDateField underlyingMaturityDate = new UnderlyingMaturityDateField();

    /**
     * Related Trade Id
     */
    private final RelatedTradeIdField relatedTradeId = new RelatedTradeIdField();

    /**
     * Related Market Segment Id
     */
    private final RelatedMarketSegmentIdField relatedMarketSegmentId = new RelatedMarketSegmentIdField();

    /**
     * Related Trade Quantity
     */
    private final RelatedTradeQuantityField relatedTradeQuantity = new RelatedTradeQuantityField();

    /**
     * Underlying Qty
     */
    private final UnderlyingQtyField underlyingQty = new UnderlyingQtyField();

    /**
     * Negotiation Id
     */
    private final NegotiationIdField negotiationId = new NegotiationIdField();

    /**
     * Srqs Related Trade Id
     */
    private final SrqsRelatedTradeIdField srqsRelatedTradeId = new SrqsRelatedTradeIdField();

    /**
     * Trd Type
     */
    private final TrdTypeField trdType = new TrdTypeField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Trade Publish Indicator
     */
    private final TradePublishIndicatorField tradePublishIndicator = new TradePublishIndicatorField();

    /**
     * Product Complex
     */
    private final ProductComplexField productComplex = new ProductComplexField();

    /**
     * Trade Report Type
     */
    private final TradeReportTypeField tradeReportType = new TradeReportTypeField();

    /**
     * Trading Capacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * Party Id Settlement Location
     */
    private final PartyIdSettlementLocationField partyIdSettlementLocation = new PartyIdSettlementLocationField();

    /**
     * Trade Alloc Status
     */
    private final TradeAllocStatusField tradeAllocStatus = new TradeAllocStatusField();

    /**
     * Hedge Type
     */
    private final HedgeTypeField hedgeType = new HedgeTypeField();

    /**
     * No Legs
     */
    private final NoLegsField noLegs = new NoLegsField();

    /**
     * No Events
     */
    private final NoEventsField noEvents = new NoEventsField();

    /**
     * No Instr Attrib
     */
    private final NoInstrAttribField noInstrAttrib = new NoInstrAttribField();

    /**
     * No Underlying Stips
     */
    private final NoUnderlyingStipsField noUnderlyingStips = new NoUnderlyingStipsField();

    /**
     * Message Event Source
     */
    private final MessageEventSourceField messageEventSource = new MessageEventSourceField();

    /**
     * Trade Report Id
     */
    private final TradeReportIdField tradeReportId = new TradeReportIdField();

    /**
     * Party Executing Firm
     */
    private final PartyExecutingFirmField partyExecutingFirm = new PartyExecutingFirmField();

    /**
     * Party Executing Trader
     */
    private final PartyExecutingTraderField partyExecutingTrader = new PartyExecutingTraderField();

    /**
     * Party Id Entering Firm
     */
    private final PartyIdEnteringFirmField partyIdEnteringFirm = new PartyIdEnteringFirmField();

    /**
     * Party Entering Trader
     */
    private final PartyEnteringTraderField partyEnteringTrader = new PartyEnteringTraderField();

    /**
     * Position Effect
     */
    private final PositionEffectField positionEffect = new PositionEffectField();

    /**
     * Root Party Executing Firm
     */
    private final RootPartyExecutingFirmField rootPartyExecutingFirm = new RootPartyExecutingFirmField();

    /**
     * Root Party Executing Trader
     */
    private final RootPartyExecutingTraderField rootPartyExecutingTrader = new RootPartyExecutingTraderField();

    /**
     * Free Text 1
     */
    private final FreeText1Field freeText1 = new FreeText1Field();

    /**
     * Free Text 2
     */
    private final FreeText2Field freeText2 = new FreeText2Field();

    /**
     * Free Text 3
     */
    private final FreeText3Field freeText3 = new FreeText3Field();

    /**
     * Party Id Take Up Trading Firm
     */
    private final PartyIdTakeUpTradingFirmField partyIdTakeUpTradingFirm = new PartyIdTakeUpTradingFirmField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Party Id Position Account
     */
    private final PartyIdPositionAccountField partyIdPositionAccount = new PartyIdPositionAccountField();

    /**
     * Party Id Order Origination Firm
     */
    private final PartyIdOrderOriginationFirmField partyIdOrderOriginationFirm = new PartyIdOrderOriginationFirmField();

    /**
     * Party Id Beneficiary
     */
    private final PartyIdBeneficiaryField partyIdBeneficiary = new PartyIdBeneficiaryField();

    /**
     * Party Id Location Id
     */
    private final PartyIdLocationIdField partyIdLocationId = new PartyIdLocationIdField();

    /**
     * Cust Order Handling Inst
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

    /**
     * Compliance Text
     */
    private final ComplianceTextField complianceText = new ComplianceTextField();

    /**
     * Underlying Security Id
     */
    private final UnderlyingSecurityIdField underlyingSecurityId = new UnderlyingSecurityIdField();

    /**
     * Underlying Security Desc
     */
    private final UnderlyingSecurityDescField underlyingSecurityDesc = new UnderlyingSecurityDescField();

    /**
     * Underlying Currency
     */
    private final UnderlyingCurrencyField underlyingCurrency = new UnderlyingCurrencyField();

    /**
     * Underlying Issuer
     */
    private final UnderlyingIssuerField underlyingIssuer = new UnderlyingIssuerField();

    /**
     * Trd Instrmnt Leg Grp Comp
     */
    private final TrdInstrmntLegGrpCompList trdInstrmntLegGrpComp = new TrdInstrmntLegGrpCompList();

    /**
     * Instrument Event Grp Comp
     */
    private final InstrumentEventGrpCompList instrumentEventGrpComp = new InstrumentEventGrpCompList();

    /**
     * Instrument Attribute Grp Comp
     */
    private final InstrumentAttributeGrpCompList instrumentAttributeGrpComp = new InstrumentAttributeGrpCompList();

    /**
     * Underlying Stip Grp Comp
     */
    private final UnderlyingStipGrpCompList underlyingStipGrpComp = new UnderlyingStipGrpCompList();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(securityId), List.<Field>of(lastPx), List.<Field>of(transactTime), List.<Field>of(underlyingPx), List.<Field>of(transBkdTime), List.<Field>of(relatedClosePrice), List.<Field>of(marketSegmentId), List.<Field>of(packageId), List.<Field>of(tesExecId), List.<Field>of(allocQty), List.<Field>of(allocId), List.<Field>of(underlyingSettlementDate), List.<Field>of(underlyingMaturityDate), List.<Field>of(relatedTradeId), List.<Field>of(relatedMarketSegmentId), List.<Field>of(relatedTradeQuantity), List.<Field>of(underlyingQty), List.<Field>of(negotiationId), List.<Field>of(srqsRelatedTradeId), List.<Field>of(trdType), List.<Field>of(side), List.<Field>of(tradePublishIndicator), List.<Field>of(productComplex), List.<Field>of(tradeReportType), List.<Field>of(tradingCapacity), List.<Field>of(partyIdSettlementLocation), List.<Field>of(tradeAllocStatus), List.<Field>of(hedgeType), List.<Field>of(noLegs), List.<Field>of(noEvents), List.<Field>of(noInstrAttrib), List.<Field>of(noUnderlyingStips), List.<Field>of(messageEventSource), List.<Field>of(tradeReportId), List.<Field>of(partyExecutingFirm), List.<Field>of(partyExecutingTrader), List.<Field>of(partyIdEnteringFirm), List.<Field>of(partyEnteringTrader), List.<Field>of(positionEffect), List.<Field>of(rootPartyExecutingFirm), List.<Field>of(rootPartyExecutingTrader), List.<Field>of(freeText1), List.<Field>of(freeText2), List.<Field>of(freeText3), List.<Field>of(partyIdTakeUpTradingFirm), List.<Field>of(account), List.<Field>of(partyIdPositionAccount), List.<Field>of(partyIdOrderOriginationFirm), List.<Field>of(partyIdBeneficiary), List.<Field>of(partyIdLocationId), List.<Field>of(custOrderHandlingInst), List.<Field>of(complianceText), List.<Field>of(underlyingSecurityId), List.<Field>of(underlyingSecurityDesc), List.<Field>of(underlyingCurrency), List.<Field>of(underlyingIssuer)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Last Px
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Transact Time
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Underlying Px
     *
     * @return the UnderlyingPx field
     */
    public UnderlyingPxField underlyingPx() {
        return underlyingPx;
    }

    /**
     * Trans Bkd Time
     *
     * @return the TransBkdTime field
     */
    public TransBkdTimeField transBkdTime() {
        return transBkdTime;
    }

    /**
     * Related Close Price
     *
     * @return the RelatedClosePrice field
     */
    public RelatedClosePriceField relatedClosePrice() {
        return relatedClosePrice;
    }

    /**
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Package Id
     *
     * @return the PackageId field
     */
    public PackageIdField packageId() {
        return packageId;
    }

    /**
     * Tes Exec Id
     *
     * @return the TesExecId field
     */
    public TesExecIdField tesExecId() {
        return tesExecId;
    }

    /**
     * Alloc Qty
     *
     * @return the AllocQty field
     */
    public AllocQtyField allocQty() {
        return allocQty;
    }

    /**
     * Alloc Id
     *
     * @return the AllocId field
     */
    public AllocIdField allocId() {
        return allocId;
    }

    /**
     * Underlying Settlement Date
     *
     * @return the UnderlyingSettlementDate field
     */
    public UnderlyingSettlementDateField underlyingSettlementDate() {
        return underlyingSettlementDate;
    }

    /**
     * Underlying Maturity Date
     *
     * @return the UnderlyingMaturityDate field
     */
    public UnderlyingMaturityDateField underlyingMaturityDate() {
        return underlyingMaturityDate;
    }

    /**
     * Related Trade Id
     *
     * @return the RelatedTradeId field
     */
    public RelatedTradeIdField relatedTradeId() {
        return relatedTradeId;
    }

    /**
     * Related Market Segment Id
     *
     * @return the RelatedMarketSegmentId field
     */
    public RelatedMarketSegmentIdField relatedMarketSegmentId() {
        return relatedMarketSegmentId;
    }

    /**
     * Related Trade Quantity
     *
     * @return the RelatedTradeQuantity field
     */
    public RelatedTradeQuantityField relatedTradeQuantity() {
        return relatedTradeQuantity;
    }

    /**
     * Underlying Qty
     *
     * @return the UnderlyingQty field
     */
    public UnderlyingQtyField underlyingQty() {
        return underlyingQty;
    }

    /**
     * Negotiation Id
     *
     * @return the NegotiationId field
     */
    public NegotiationIdField negotiationId() {
        return negotiationId;
    }

    /**
     * Srqs Related Trade Id
     *
     * @return the SrqsRelatedTradeId field
     */
    public SrqsRelatedTradeIdField srqsRelatedTradeId() {
        return srqsRelatedTradeId;
    }

    /**
     * Trd Type
     *
     * @return the TrdType field
     */
    public TrdTypeField trdType() {
        return trdType;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
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
     * Product Complex
     *
     * @return the ProductComplex field
     */
    public ProductComplexField productComplex() {
        return productComplex;
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
     * Trading Capacity
     *
     * @return the TradingCapacity field
     */
    public TradingCapacityField tradingCapacity() {
        return tradingCapacity;
    }

    /**
     * Party Id Settlement Location
     *
     * @return the PartyIdSettlementLocation field
     */
    public PartyIdSettlementLocationField partyIdSettlementLocation() {
        return partyIdSettlementLocation;
    }

    /**
     * Trade Alloc Status
     *
     * @return the TradeAllocStatus field
     */
    public TradeAllocStatusField tradeAllocStatus() {
        return tradeAllocStatus;
    }

    /**
     * Hedge Type
     *
     * @return the HedgeType field
     */
    public HedgeTypeField hedgeType() {
        return hedgeType;
    }

    /**
     * No Legs
     *
     * @return the NoLegs field
     */
    public NoLegsField noLegs() {
        return noLegs;
    }

    /**
     * No Events
     *
     * @return the NoEvents field
     */
    public NoEventsField noEvents() {
        return noEvents;
    }

    /**
     * No Instr Attrib
     *
     * @return the NoInstrAttrib field
     */
    public NoInstrAttribField noInstrAttrib() {
        return noInstrAttrib;
    }

    /**
     * No Underlying Stips
     *
     * @return the NoUnderlyingStips field
     */
    public NoUnderlyingStipsField noUnderlyingStips() {
        return noUnderlyingStips;
    }

    /**
     * Message Event Source
     *
     * @return the MessageEventSource field
     */
    public MessageEventSourceField messageEventSource() {
        return messageEventSource;
    }

    /**
     * Trade Report Id
     *
     * @return the TradeReportId field
     */
    public TradeReportIdField tradeReportId() {
        return tradeReportId;
    }

    /**
     * Party Executing Firm
     *
     * @return the PartyExecutingFirm field
     */
    public PartyExecutingFirmField partyExecutingFirm() {
        return partyExecutingFirm;
    }

    /**
     * Party Executing Trader
     *
     * @return the PartyExecutingTrader field
     */
    public PartyExecutingTraderField partyExecutingTrader() {
        return partyExecutingTrader;
    }

    /**
     * Party Id Entering Firm
     *
     * @return the PartyIdEnteringFirm field
     */
    public PartyIdEnteringFirmField partyIdEnteringFirm() {
        return partyIdEnteringFirm;
    }

    /**
     * Party Entering Trader
     *
     * @return the PartyEnteringTrader field
     */
    public PartyEnteringTraderField partyEnteringTrader() {
        return partyEnteringTrader;
    }

    /**
     * Position Effect
     *
     * @return the PositionEffect field
     */
    public PositionEffectField positionEffect() {
        return positionEffect;
    }

    /**
     * Root Party Executing Firm
     *
     * @return the RootPartyExecutingFirm field
     */
    public RootPartyExecutingFirmField rootPartyExecutingFirm() {
        return rootPartyExecutingFirm;
    }

    /**
     * Root Party Executing Trader
     *
     * @return the RootPartyExecutingTrader field
     */
    public RootPartyExecutingTraderField rootPartyExecutingTrader() {
        return rootPartyExecutingTrader;
    }

    /**
     * Free Text 1
     *
     * @return the FreeText1 field
     */
    public FreeText1Field freeText1() {
        return freeText1;
    }

    /**
     * Free Text 2
     *
     * @return the FreeText2 field
     */
    public FreeText2Field freeText2() {
        return freeText2;
    }

    /**
     * Free Text 3
     *
     * @return the FreeText3 field
     */
    public FreeText3Field freeText3() {
        return freeText3;
    }

    /**
     * Party Id Take Up Trading Firm
     *
     * @return the PartyIdTakeUpTradingFirm field
     */
    public PartyIdTakeUpTradingFirmField partyIdTakeUpTradingFirm() {
        return partyIdTakeUpTradingFirm;
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
     * Party Id Position Account
     *
     * @return the PartyIdPositionAccount field
     */
    public PartyIdPositionAccountField partyIdPositionAccount() {
        return partyIdPositionAccount;
    }

    /**
     * Party Id Order Origination Firm
     *
     * @return the PartyIdOrderOriginationFirm field
     */
    public PartyIdOrderOriginationFirmField partyIdOrderOriginationFirm() {
        return partyIdOrderOriginationFirm;
    }

    /**
     * Party Id Beneficiary
     *
     * @return the PartyIdBeneficiary field
     */
    public PartyIdBeneficiaryField partyIdBeneficiary() {
        return partyIdBeneficiary;
    }

    /**
     * Party Id Location Id
     *
     * @return the PartyIdLocationId field
     */
    public PartyIdLocationIdField partyIdLocationId() {
        return partyIdLocationId;
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
     * Compliance Text
     *
     * @return the ComplianceText field
     */
    public ComplianceTextField complianceText() {
        return complianceText;
    }

    /**
     * Underlying Security Id
     *
     * @return the UnderlyingSecurityId field
     */
    public UnderlyingSecurityIdField underlyingSecurityId() {
        return underlyingSecurityId;
    }

    /**
     * Underlying Security Desc
     *
     * @return the UnderlyingSecurityDesc field
     */
    public UnderlyingSecurityDescField underlyingSecurityDesc() {
        return underlyingSecurityDesc;
    }

    /**
     * Underlying Currency
     *
     * @return the UnderlyingCurrency field
     */
    public UnderlyingCurrencyField underlyingCurrency() {
        return underlyingCurrency;
    }

    /**
     * Underlying Issuer
     *
     * @return the UnderlyingIssuer field
     */
    public UnderlyingIssuerField underlyingIssuer() {
        return underlyingIssuer;
    }

    /**
     * Trd Instrmnt Leg Grp Comp
     *
     * <p>Encode writes this list's size to the NoLegs field.</p>
     *
     * @return the TrdInstrmntLegGrpComp entries
     */
    public TrdInstrmntLegGrpCompList trdInstrmntLegGrpComp() {
        return trdInstrmntLegGrpComp;
    }

    /**
     * Instrument Event Grp Comp
     *
     * <p>Encode writes this list's size to the NoEvents field.</p>
     *
     * @return the InstrumentEventGrpComp entries
     */
    public InstrumentEventGrpCompList instrumentEventGrpComp() {
        return instrumentEventGrpComp;
    }

    /**
     * Instrument Attribute Grp Comp
     *
     * <p>Encode writes this list's size to the NoInstrAttrib field.</p>
     *
     * @return the InstrumentAttributeGrpComp entries
     */
    public InstrumentAttributeGrpCompList instrumentAttributeGrpComp() {
        return instrumentAttributeGrpComp;
    }

    /**
     * Underlying Stip Grp Comp
     *
     * <p>Encode writes this list's size to the NoUnderlyingStips field.</p>
     *
     * @return the UnderlyingStipGrpComp entries
     */
    public UnderlyingStipGrpCompList underlyingStipGrpComp() {
        return underlyingStipGrpComp;
    }

    /**
     * Rbc Header Comp
     *
     * @return the RbcHeaderComp record
     */
    public RbcHeaderComp rbcHeaderComp() {
        return rbcHeaderComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + trdInstrmntLegGrpComp.byteLength() + instrumentEventGrpComp.byteLength() + instrumentAttributeGrpComp.byteLength() + underlyingStipGrpComp.byteLength();
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
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = RbcHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RbcHeaderComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 20;
        cursor += 5;
        cursor += 6;
        cursor += 1;
        cursor += 6;
        cursor += 1;
        cursor += 5;
        cursor += 6;
        cursor += 12;
        cursor += 12;
        cursor += 12;
        cursor += 5;
        cursor += 2;
        cursor += 32;
        cursor += 7;
        cursor += 9;
        cursor += 2;
        cursor += 1;
        cursor += 20;
        cursor += 12;
        cursor += 30;
        cursor += 3;
        cursor += 30;
        runs.add(cursor).add(2);
        cursor += 2;
        cursor = trdInstrmntLegGrpComp.padding(runs, cursor);
        cursor = instrumentEventGrpComp.padding(runs, cursor);
        cursor = instrumentAttributeGrpComp.padding(runs, cursor);
        cursor = underlyingStipGrpComp.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(rbcHeaderComp.sendingTime().value());
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
        cursor += 2; // padding
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 360)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!underlyingPx.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingPxField.BYTE_LENGTH;
        if (!transBkdTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransBkdTimeField.BYTE_LENGTH;
        if (!relatedClosePrice.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedClosePriceField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!packageId.parse(data, cursor)) {
            return false;
        }
        cursor += PackageIdField.BYTE_LENGTH;
        if (!tesExecId.parse(data, cursor)) {
            return false;
        }
        cursor += TesExecIdField.BYTE_LENGTH;
        if (!allocQty.parse(data, cursor)) {
            return false;
        }
        cursor += AllocQtyField.BYTE_LENGTH;
        if (!allocId.parse(data, cursor)) {
            return false;
        }
        cursor += AllocIdField.BYTE_LENGTH;
        if (!underlyingSettlementDate.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSettlementDateField.BYTE_LENGTH;
        if (!underlyingMaturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingMaturityDateField.BYTE_LENGTH;
        if (!relatedTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedTradeIdField.BYTE_LENGTH;
        if (!relatedMarketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedMarketSegmentIdField.BYTE_LENGTH;
        if (!relatedTradeQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedTradeQuantityField.BYTE_LENGTH;
        if (!underlyingQty.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingQtyField.BYTE_LENGTH;
        if (!negotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiationIdField.BYTE_LENGTH;
        if (!srqsRelatedTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += SrqsRelatedTradeIdField.BYTE_LENGTH;
        if (!trdType.parse(data, cursor)) {
            return false;
        }
        cursor += TrdTypeField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!tradePublishIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TradePublishIndicatorField.BYTE_LENGTH;
        if (!productComplex.parse(data, cursor)) {
            return false;
        }
        cursor += ProductComplexField.BYTE_LENGTH;
        if (!tradeReportType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportTypeField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!partyIdSettlementLocation.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdSettlementLocationField.BYTE_LENGTH;
        if (!tradeAllocStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradeAllocStatusField.BYTE_LENGTH;
        if (!hedgeType.parse(data, cursor)) {
            return false;
        }
        cursor += HedgeTypeField.BYTE_LENGTH;
        if (!noLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegsField.BYTE_LENGTH;
        if (!noEvents.parse(data, cursor)) {
            return false;
        }
        cursor += NoEventsField.BYTE_LENGTH;
        if (!noInstrAttrib.parse(data, cursor)) {
            return false;
        }
        cursor += NoInstrAttribField.BYTE_LENGTH;
        if (!noUnderlyingStips.parse(data, cursor)) {
            return false;
        }
        cursor += NoUnderlyingStipsField.BYTE_LENGTH;
        if (!messageEventSource.parse(data, cursor)) {
            return false;
        }
        cursor += MessageEventSourceField.BYTE_LENGTH;
        if (!tradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportIdField.BYTE_LENGTH;
        if (!partyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingFirmField.BYTE_LENGTH;
        if (!partyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyExecutingTraderField.BYTE_LENGTH;
        if (!partyIdEnteringFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdEnteringFirmField.BYTE_LENGTH;
        if (!partyEnteringTrader.parse(data, cursor)) {
            return false;
        }
        cursor += PartyEnteringTraderField.BYTE_LENGTH;
        if (!positionEffect.parse(data, cursor)) {
            return false;
        }
        cursor += PositionEffectField.BYTE_LENGTH;
        if (!rootPartyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyExecutingFirmField.BYTE_LENGTH;
        if (!rootPartyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyExecutingTraderField.BYTE_LENGTH;
        if (!freeText1.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText1Field.BYTE_LENGTH;
        if (!freeText2.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText2Field.BYTE_LENGTH;
        if (!freeText3.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText3Field.BYTE_LENGTH;
        if (!partyIdTakeUpTradingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdTakeUpTradingFirmField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!partyIdPositionAccount.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdPositionAccountField.BYTE_LENGTH;
        if (!partyIdOrderOriginationFirm.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdOrderOriginationFirmField.BYTE_LENGTH;
        if (!partyIdBeneficiary.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdBeneficiaryField.BYTE_LENGTH;
        if (!partyIdLocationId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyIdLocationIdField.BYTE_LENGTH;
        if (!custOrderHandlingInst.parse(data, cursor)) {
            return false;
        }
        cursor += CustOrderHandlingInstField.BYTE_LENGTH;
        if (!complianceText.parse(data, cursor)) {
            return false;
        }
        cursor += ComplianceTextField.BYTE_LENGTH;
        if (!underlyingSecurityId.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSecurityIdField.BYTE_LENGTH;
        if (!underlyingSecurityDesc.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSecurityDescField.BYTE_LENGTH;
        if (!underlyingCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingCurrencyField.BYTE_LENGTH;
        if (!underlyingIssuer.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingIssuerField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!trdInstrmntLegGrpComp.parse(data, cursor, end, noLegs.value())) {
            return false;
        }
        cursor += trdInstrmntLegGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!instrumentEventGrpComp.parse(data, cursor, end, noEvents.value())) {
            return false;
        }
        cursor += instrumentEventGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!instrumentAttributeGrpComp.parse(data, cursor, end, noInstrAttrib.value())) {
            return false;
        }
        cursor += instrumentAttributeGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!underlyingStipGrpComp.parse(data, cursor, end, noUnderlyingStips.value())) {
            return false;
        }
        cursor += underlyingStipGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (trdInstrmntLegGrpComp.size() > 255) {
            throw new IllegalStateException("trdInstrmntLegGrpComp holds " + trdInstrmntLegGrpComp.size() + " entries, more than its count field can state");
        }
        if (instrumentEventGrpComp.size() > 255) {
            throw new IllegalStateException("instrumentEventGrpComp holds " + instrumentEventGrpComp.size() + " entries, more than its count field can state");
        }
        if (instrumentAttributeGrpComp.size() > 255) {
            throw new IllegalStateException("instrumentAttributeGrpComp holds " + instrumentAttributeGrpComp.size() + " entries, more than its count field can state");
        }
        if (underlyingStipGrpComp.size() > 255) {
            throw new IllegalStateException("underlyingStipGrpComp holds " + underlyingStipGrpComp.size() + " entries, more than its count field can state");
        }
        noLegs.value((short) trdInstrmntLegGrpComp.size());
        noEvents.value((short) instrumentEventGrpComp.size());
        noInstrAttrib.value((short) instrumentAttributeGrpComp.size());
        noUnderlyingStips.value((short) underlyingStipGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 0 + 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = underlyingPx.encode(data, cursor);
        cursor = transBkdTime.encode(data, cursor);
        cursor = relatedClosePrice.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = packageId.encode(data, cursor);
        cursor = tesExecId.encode(data, cursor);
        cursor = allocQty.encode(data, cursor);
        cursor = allocId.encode(data, cursor);
        cursor = underlyingSettlementDate.encode(data, cursor);
        cursor = underlyingMaturityDate.encode(data, cursor);
        cursor = relatedTradeId.encode(data, cursor);
        cursor = relatedMarketSegmentId.encode(data, cursor);
        cursor = relatedTradeQuantity.encode(data, cursor);
        cursor = underlyingQty.encode(data, cursor);
        cursor = negotiationId.encode(data, cursor);
        cursor = srqsRelatedTradeId.encode(data, cursor);
        cursor = trdType.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = tradePublishIndicator.encode(data, cursor);
        cursor = productComplex.encode(data, cursor);
        cursor = tradeReportType.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = partyIdSettlementLocation.encode(data, cursor);
        cursor = tradeAllocStatus.encode(data, cursor);
        cursor = hedgeType.encode(data, cursor);
        cursor = noLegs.encode(data, cursor);
        cursor = noEvents.encode(data, cursor);
        cursor = noInstrAttrib.encode(data, cursor);
        cursor = noUnderlyingStips.encode(data, cursor);
        cursor = messageEventSource.encode(data, cursor);
        cursor = tradeReportId.encode(data, cursor);
        cursor = partyExecutingFirm.encode(data, cursor);
        cursor = partyExecutingTrader.encode(data, cursor);
        cursor = partyIdEnteringFirm.encode(data, cursor);
        cursor = partyEnteringTrader.encode(data, cursor);
        cursor = positionEffect.encode(data, cursor);
        cursor = rootPartyExecutingFirm.encode(data, cursor);
        cursor = rootPartyExecutingTrader.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText2.encode(data, cursor);
        cursor = freeText3.encode(data, cursor);
        cursor = partyIdTakeUpTradingFirm.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = partyIdPositionAccount.encode(data, cursor);
        cursor = partyIdOrderOriginationFirm.encode(data, cursor);
        cursor = partyIdBeneficiary.encode(data, cursor);
        cursor = partyIdLocationId.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = complianceText.encode(data, cursor);
        cursor = underlyingSecurityId.encode(data, cursor);
        cursor = underlyingSecurityDesc.encode(data, cursor);
        cursor = underlyingCurrency.encode(data, cursor);
        cursor = underlyingIssuer.encode(data, cursor);
        if (buffer != null && buffer.length >= 392 + 2) {
            System.arraycopy(buffer, 392, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = trdInstrmntLegGrpComp.encode(data, cursor);
        cursor = instrumentEventGrpComp.encode(data, cursor);
        cursor = instrumentAttributeGrpComp.encode(data, cursor);
        cursor = underlyingStipGrpComp.encode(data, cursor);
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
        rbcHeaderComp.clear();
        trdInstrmntLegGrpComp.clear();
        instrumentEventGrpComp.clear();
        instrumentAttributeGrpComp.clear();
        underlyingStipGrpComp.clear();
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
        for (Field field : fields) {
            if (field != noLegs && field != noEvents && field != noInstrAttrib && field != noUnderlyingStips && !field.isRecognized()) {
                return false;
            }
        }
        if (!trdInstrmntLegGrpComp.isRecognized()) {
            return false;
        }
        if (!instrumentEventGrpComp.isRecognized()) {
            return false;
        }
        if (!instrumentAttributeGrpComp.isRecognized()) {
            return false;
        }
        if (!underlyingStipGrpComp.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noLegs && field != noEvents && field != noInstrAttrib && field != noUnderlyingStips && !field.isValid()) {
                return false;
            }
        }
        if (!trdInstrmntLegGrpComp.isValid()) {
            return false;
        }
        if (!instrumentEventGrpComp.isValid()) {
            return false;
        }
        if (!instrumentAttributeGrpComp.isValid()) {
            return false;
        }
        if (!underlyingStipGrpComp.isValid()) {
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
        if (!rbcHeaderComp.isDecoded()) {
            return rbcHeaderComp.failedAt();
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!lastPx.isDecoded()) {
            return Optional.of(lastPx);
        }
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!underlyingPx.isDecoded()) {
            return Optional.of(underlyingPx);
        }
        if (!transBkdTime.isDecoded()) {
            return Optional.of(transBkdTime);
        }
        if (!relatedClosePrice.isDecoded()) {
            return Optional.of(relatedClosePrice);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!packageId.isDecoded()) {
            return Optional.of(packageId);
        }
        if (!tesExecId.isDecoded()) {
            return Optional.of(tesExecId);
        }
        if (!allocQty.isDecoded()) {
            return Optional.of(allocQty);
        }
        if (!allocId.isDecoded()) {
            return Optional.of(allocId);
        }
        if (!underlyingSettlementDate.isDecoded()) {
            return Optional.of(underlyingSettlementDate);
        }
        if (!underlyingMaturityDate.isDecoded()) {
            return Optional.of(underlyingMaturityDate);
        }
        if (!relatedTradeId.isDecoded()) {
            return Optional.of(relatedTradeId);
        }
        if (!relatedMarketSegmentId.isDecoded()) {
            return Optional.of(relatedMarketSegmentId);
        }
        if (!relatedTradeQuantity.isDecoded()) {
            return Optional.of(relatedTradeQuantity);
        }
        if (!underlyingQty.isDecoded()) {
            return Optional.of(underlyingQty);
        }
        if (!negotiationId.isDecoded()) {
            return Optional.of(negotiationId);
        }
        if (!srqsRelatedTradeId.isDecoded()) {
            return Optional.of(srqsRelatedTradeId);
        }
        if (!trdType.isDecoded()) {
            return Optional.of(trdType);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!tradePublishIndicator.isDecoded()) {
            return Optional.of(tradePublishIndicator);
        }
        if (!productComplex.isDecoded()) {
            return Optional.of(productComplex);
        }
        if (!tradeReportType.isDecoded()) {
            return Optional.of(tradeReportType);
        }
        if (!tradingCapacity.isDecoded()) {
            return Optional.of(tradingCapacity);
        }
        if (!partyIdSettlementLocation.isDecoded()) {
            return Optional.of(partyIdSettlementLocation);
        }
        if (!tradeAllocStatus.isDecoded()) {
            return Optional.of(tradeAllocStatus);
        }
        if (!hedgeType.isDecoded()) {
            return Optional.of(hedgeType);
        }
        if (!noLegs.isDecoded()) {
            return Optional.of(noLegs);
        }
        if (!noEvents.isDecoded()) {
            return Optional.of(noEvents);
        }
        if (!noInstrAttrib.isDecoded()) {
            return Optional.of(noInstrAttrib);
        }
        if (!noUnderlyingStips.isDecoded()) {
            return Optional.of(noUnderlyingStips);
        }
        if (!messageEventSource.isDecoded()) {
            return Optional.of(messageEventSource);
        }
        if (!tradeReportId.isDecoded()) {
            return Optional.of(tradeReportId);
        }
        if (!partyExecutingFirm.isDecoded()) {
            return Optional.of(partyExecutingFirm);
        }
        if (!partyExecutingTrader.isDecoded()) {
            return Optional.of(partyExecutingTrader);
        }
        if (!partyIdEnteringFirm.isDecoded()) {
            return Optional.of(partyIdEnteringFirm);
        }
        if (!partyEnteringTrader.isDecoded()) {
            return Optional.of(partyEnteringTrader);
        }
        if (!positionEffect.isDecoded()) {
            return Optional.of(positionEffect);
        }
        if (!rootPartyExecutingFirm.isDecoded()) {
            return Optional.of(rootPartyExecutingFirm);
        }
        if (!rootPartyExecutingTrader.isDecoded()) {
            return Optional.of(rootPartyExecutingTrader);
        }
        if (!freeText1.isDecoded()) {
            return Optional.of(freeText1);
        }
        if (!freeText2.isDecoded()) {
            return Optional.of(freeText2);
        }
        if (!freeText3.isDecoded()) {
            return Optional.of(freeText3);
        }
        if (!partyIdTakeUpTradingFirm.isDecoded()) {
            return Optional.of(partyIdTakeUpTradingFirm);
        }
        if (!account.isDecoded()) {
            return Optional.of(account);
        }
        if (!partyIdPositionAccount.isDecoded()) {
            return Optional.of(partyIdPositionAccount);
        }
        if (!partyIdOrderOriginationFirm.isDecoded()) {
            return Optional.of(partyIdOrderOriginationFirm);
        }
        if (!partyIdBeneficiary.isDecoded()) {
            return Optional.of(partyIdBeneficiary);
        }
        if (!partyIdLocationId.isDecoded()) {
            return Optional.of(partyIdLocationId);
        }
        if (!custOrderHandlingInst.isDecoded()) {
            return Optional.of(custOrderHandlingInst);
        }
        if (!complianceText.isDecoded()) {
            return Optional.of(complianceText);
        }
        if (!underlyingSecurityId.isDecoded()) {
            return Optional.of(underlyingSecurityId);
        }
        if (!underlyingSecurityDesc.isDecoded()) {
            return Optional.of(underlyingSecurityDesc);
        }
        if (!underlyingCurrency.isDecoded()) {
            return Optional.of(underlyingCurrency);
        }
        if (!underlyingIssuer.isDecoded()) {
            return Optional.of(underlyingIssuer);
        }
        if (!trdInstrmntLegGrpComp.isDecoded()) {
            return Optional.of(trdInstrmntLegGrpComp.failedEntry().flatMap(TrdInstrmntLegGrpCompEntry::failedAt).orElse(noLegs));
        }
        if (!instrumentEventGrpComp.isDecoded()) {
            return Optional.of(instrumentEventGrpComp.failedEntry().flatMap(InstrumentEventGrpCompEntry::failedAt).orElse(noEvents));
        }
        if (!instrumentAttributeGrpComp.isDecoded()) {
            return Optional.of(instrumentAttributeGrpComp.failedEntry().flatMap(InstrumentAttributeGrpCompEntry::failedAt).orElse(noInstrAttrib));
        }
        if (!underlyingStipGrpComp.isDecoded()) {
            return Optional.of(underlyingStipGrpComp.failedEntry().flatMap(UnderlyingStipGrpCompEntry::failedAt).orElse(noUnderlyingStips));
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "SecurityId" -> Optional.of(securityId);
            case "LastPx" -> Optional.of(lastPx);
            case "TransactTime" -> Optional.of(transactTime);
            case "UnderlyingPx" -> Optional.of(underlyingPx);
            case "TransBkdTime" -> Optional.of(transBkdTime);
            case "RelatedClosePrice" -> Optional.of(relatedClosePrice);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "PackageId" -> Optional.of(packageId);
            case "TesExecId" -> Optional.of(tesExecId);
            case "AllocQty" -> Optional.of(allocQty);
            case "AllocId" -> Optional.of(allocId);
            case "UnderlyingSettlementDate" -> Optional.of(underlyingSettlementDate);
            case "UnderlyingMaturityDate" -> Optional.of(underlyingMaturityDate);
            case "RelatedTradeId" -> Optional.of(relatedTradeId);
            case "RelatedMarketSegmentId" -> Optional.of(relatedMarketSegmentId);
            case "RelatedTradeQuantity" -> Optional.of(relatedTradeQuantity);
            case "UnderlyingQty" -> Optional.of(underlyingQty);
            case "NegotiationId" -> Optional.of(negotiationId);
            case "SrqsRelatedTradeId" -> Optional.of(srqsRelatedTradeId);
            case "TrdType" -> Optional.of(trdType);
            case "Side" -> Optional.of(side);
            case "TradePublishIndicator" -> Optional.of(tradePublishIndicator);
            case "ProductComplex" -> Optional.of(productComplex);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "PartyIdSettlementLocation" -> Optional.of(partyIdSettlementLocation);
            case "TradeAllocStatus" -> Optional.of(tradeAllocStatus);
            case "HedgeType" -> Optional.of(hedgeType);
            case "NoLegs" -> Optional.of(noLegs);
            case "NoEvents" -> Optional.of(noEvents);
            case "NoInstrAttrib" -> Optional.of(noInstrAttrib);
            case "NoUnderlyingStips" -> Optional.of(noUnderlyingStips);
            case "MessageEventSource" -> Optional.of(messageEventSource);
            case "TradeReportId" -> Optional.of(tradeReportId);
            case "PartyExecutingFirm" -> Optional.of(partyExecutingFirm);
            case "PartyExecutingTrader" -> Optional.of(partyExecutingTrader);
            case "PartyIdEnteringFirm" -> Optional.of(partyIdEnteringFirm);
            case "PartyEnteringTrader" -> Optional.of(partyEnteringTrader);
            case "PositionEffect" -> Optional.of(positionEffect);
            case "RootPartyExecutingFirm" -> Optional.of(rootPartyExecutingFirm);
            case "RootPartyExecutingTrader" -> Optional.of(rootPartyExecutingTrader);
            case "FreeText1" -> Optional.of(freeText1);
            case "FreeText2" -> Optional.of(freeText2);
            case "FreeText3" -> Optional.of(freeText3);
            case "PartyIdTakeUpTradingFirm" -> Optional.of(partyIdTakeUpTradingFirm);
            case "Account" -> Optional.of(account);
            case "PartyIdPositionAccount" -> Optional.of(partyIdPositionAccount);
            case "PartyIdOrderOriginationFirm" -> Optional.of(partyIdOrderOriginationFirm);
            case "PartyIdBeneficiary" -> Optional.of(partyIdBeneficiary);
            case "PartyIdLocationId" -> Optional.of(partyIdLocationId);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "ComplianceText" -> Optional.of(complianceText);
            case "UnderlyingSecurityId" -> Optional.of(underlyingSecurityId);
            case "UnderlyingSecurityDesc" -> Optional.of(underlyingSecurityDesc);
            case "UnderlyingCurrency" -> Optional.of(underlyingCurrency);
            case "UnderlyingIssuer" -> Optional.of(underlyingIssuer);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TesApproveBroadcast message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(trdInstrmntLegGrpComp.diffFields(message.trdInstrmntLegGrpComp));
        changed.addAll(instrumentEventGrpComp.diffFields(message.instrumentEventGrpComp));
        changed.addAll(instrumentAttributeGrpComp.diffFields(message.instrumentAttributeGrpComp));
        changed.addAll(underlyingStipGrpComp.diffFields(message.underlyingStipGrpComp));
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

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
            builder.append(", ");
            trdInstrmntLegGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            instrumentEventGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            instrumentAttributeGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            underlyingStipGrpComp.toFormattedString(builder, options);
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : fields) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
        trdInstrmntLegGrpComp.toFormattedString(builder, nested);
        instrumentEventGrpComp.toFormattedString(builder, nested);
        instrumentAttributeGrpComp.toFormattedString(builder, nested);
        underlyingStipGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof TesApproveBroadcast message)) {
            return false;
        }
        return fields.equals(message.fields) && trdInstrmntLegGrpComp.equals(message.trdInstrmntLegGrpComp) && instrumentEventGrpComp.equals(message.instrumentEventGrpComp) && instrumentAttributeGrpComp.equals(message.instrumentAttributeGrpComp) && underlyingStipGrpComp.equals(message.underlyingStipGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, trdInstrmntLegGrpComp, instrumentEventGrpComp, instrumentAttributeGrpComp, underlyingStipGrpComp);
    }
}
