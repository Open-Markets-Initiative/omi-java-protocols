package omi.eurex.t7.eti.fbe.v10_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v10_0.fields.AccountField;
import omi.eurex.t7.eti.fbe.v10_0.fields.BasketPartyContraFirmField;
import omi.eurex.t7.eti.fbe.v10_0.fields.BasketProfileIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.BasketSideTradeReportIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.BasketTrdMatchIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ClearingTradePriceField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ClearingTradeQtyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.CompressionIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.CustOrderHandlingInstField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExecutingTraderField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExecutingTraderQualifierField;
import omi.eurex.t7.eti.fbe.v10_0.fields.FreeText1Field;
import omi.eurex.t7.eti.fbe.v10_0.fields.FreeText2Field;
import omi.eurex.t7.eti.fbe.v10_0.fields.FreeText3Field;
import omi.eurex.t7.eti.fbe.v10_0.fields.LastPxField;
import omi.eurex.t7.eti.fbe.v10_0.fields.LastQtyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MultiLegReportingTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MultilegPriceModelField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NegotiationIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoSrqsRelatedTradeIDsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrderAttributeLiquidityProvisionField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrderAttributeRiskReductionField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrderOriginationField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrigTradeIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PackageIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PositionEffectField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ProductComplexField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RegulatoryTradeIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RelatedProductComplexField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RelatedSecurityIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RelatedSymbolField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ReversalIndicatorField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyClearingFirmField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyClearingOrganizationField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyExecutingFirmField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyExecutingTraderField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyIdBeneficiaryField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyIdClearingUnitField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyIdClientIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyIdExecutingTraderField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyIdExecutingUnitField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyIdExecutionVenueField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyIdInvestmentDecisionMakerField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyIdInvestmentDecisionMakerQualifierField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyIdOrderOriginationFirmField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyIdPositionAccountField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyIdSessionIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RootPartyIdTakeUpTradingFirmField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SecurityIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SideField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SideLastPxField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SideLastQtyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SideTradeIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.StrategyLinkIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TotNumTradeReportsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeAggregationTransTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeDateField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradePublishIndicatorField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeReportTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradingCapacityField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TransactTimeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TransferReasonField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TrdTypeField;
import omi.eurex.t7.eti.fbe.v10_0.groups.SrqsRelatedTradeIdGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.SrqsRelatedTradeIdGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.structs.RbcHeaderComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the TesTradeBroadcast message from the Eti protocol.
 */
public final class TesTradeBroadcast implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 426;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Tes Trade Broadcast";

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Last Qty
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Clearing Trade Price
     */
    private final ClearingTradePriceField clearingTradePrice = new ClearingTradePriceField();

    /**
     * Clearing Trade Qty
     */
    private final ClearingTradeQtyField clearingTradeQty = new ClearingTradeQtyField();

    /**
     * Transact Time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Related Security Id
     */
    private final RelatedSecurityIdField relatedSecurityId = new RelatedSecurityIdField();

    /**
     * Compression Id
     */
    private final CompressionIdField compressionId = new CompressionIdField();

    /**
     * Root Party Id Client Id
     */
    private final RootPartyIdClientIdField rootPartyIdClientId = new RootPartyIdClientIdField();

    /**
     * Executing Trader
     */
    private final ExecutingTraderField executingTrader = new ExecutingTraderField();

    /**
     * Root Party Id Investment Decision Maker
     */
    private final RootPartyIdInvestmentDecisionMakerField rootPartyIdInvestmentDecisionMaker = new RootPartyIdInvestmentDecisionMakerField();

    /**
     * Basket Trd Match Id
     */
    private final BasketTrdMatchIdField basketTrdMatchId = new BasketTrdMatchIdField();

    /**
     * Side Last Px
     */
    private final SideLastPxField sideLastPx = new SideLastPxField();

    /**
     * Side Last Qty
     */
    private final SideLastQtyField sideLastQty = new SideLastQtyField();

    /**
     * Package Id
     */
    private final PackageIdField packageId = new PackageIdField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Trade Id
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Trade Date
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Side Trade Id
     */
    private final SideTradeIdField sideTradeId = new SideTradeIdField();

    /**
     * Root Party Id Session Id
     */
    private final RootPartyIdSessionIdField rootPartyIdSessionId = new RootPartyIdSessionIdField();

    /**
     * Orig Trade Id
     */
    private final OrigTradeIdField origTradeId = new OrigTradeIdField();

    /**
     * Root Party Id Executing Unit
     */
    private final RootPartyIdExecutingUnitField rootPartyIdExecutingUnit = new RootPartyIdExecutingUnitField();

    /**
     * Root Party Id Executing Trader
     */
    private final RootPartyIdExecutingTraderField rootPartyIdExecutingTrader = new RootPartyIdExecutingTraderField();

    /**
     * Root Party Id Clearing Unit
     */
    private final RootPartyIdClearingUnitField rootPartyIdClearingUnit = new RootPartyIdClearingUnitField();

    /**
     * Strategy Link Id
     */
    private final StrategyLinkIdField strategyLinkId = new StrategyLinkIdField();

    /**
     * Related Symbol
     */
    private final RelatedSymbolField relatedSymbol = new RelatedSymbolField();

    /**
     * Tot Num Trade Reports
     */
    private final TotNumTradeReportsField totNumTradeReports = new TotNumTradeReportsField();

    /**
     * Negotiation Id
     */
    private final NegotiationIdField negotiationId = new NegotiationIdField();

    /**
     * No Srqs Related Trade I Ds
     */
    private final NoSrqsRelatedTradeIDsField noSrqsRelatedTradeIDs = new NoSrqsRelatedTradeIDsField();

    /**
     * Basket Profile Id
     */
    private final BasketProfileIdField basketProfileId = new BasketProfileIdField();

    /**
     * Trd Type
     */
    private final TrdTypeField trdType = new TrdTypeField();

    /**
     * Product Complex
     */
    private final ProductComplexField productComplex = new ProductComplexField();

    /**
     * Related Product Complex
     */
    private final RelatedProductComplexField relatedProductComplex = new RelatedProductComplexField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Trading Capacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * Trade Report Type
     */
    private final TradeReportTypeField tradeReportType = new TradeReportTypeField();

    /**
     * Transfer Reason
     */
    private final TransferReasonField transferReason = new TransferReasonField();

    /**
     * Trade Publish Indicator
     */
    private final TradePublishIndicatorField tradePublishIndicator = new TradePublishIndicatorField();

    /**
     * Multi Leg Reporting Type
     */
    private final MultiLegReportingTypeField multiLegReportingType = new MultiLegReportingTypeField();

    /**
     * Position Effect
     */
    private final PositionEffectField positionEffect = new PositionEffectField();

    /**
     * Multileg Price Model
     */
    private final MultilegPriceModelField multilegPriceModel = new MultilegPriceModelField();

    /**
     * Order Attribute Liquidity Provision
     */
    private final OrderAttributeLiquidityProvisionField orderAttributeLiquidityProvision = new OrderAttributeLiquidityProvisionField();

    /**
     * Order Attribute Risk Reduction
     */
    private final OrderAttributeRiskReductionField orderAttributeRiskReduction = new OrderAttributeRiskReductionField();

    /**
     * Executing Trader Qualifier
     */
    private final ExecutingTraderQualifierField executingTraderQualifier = new ExecutingTraderQualifierField();

    /**
     * Root Party Id Investment Decision Maker Qualifier
     */
    private final RootPartyIdInvestmentDecisionMakerQualifierField rootPartyIdInvestmentDecisionMakerQualifier = new RootPartyIdInvestmentDecisionMakerQualifierField();

    /**
     * Order Origination
     */
    private final OrderOriginationField orderOrigination = new OrderOriginationField();

    /**
     * Reversal Indicator
     */
    private final ReversalIndicatorField reversalIndicator = new ReversalIndicatorField();

    /**
     * Trade Aggregation Trans Type
     */
    private final TradeAggregationTransTypeField tradeAggregationTransType = new TradeAggregationTransTypeField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Root Party Id Position Account
     */
    private final RootPartyIdPositionAccountField rootPartyIdPositionAccount = new RootPartyIdPositionAccountField();

    /**
     * Cust Order Handling Inst
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

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
     * Root Party Executing Firm
     */
    private final RootPartyExecutingFirmField rootPartyExecutingFirm = new RootPartyExecutingFirmField();

    /**
     * Root Party Executing Trader
     */
    private final RootPartyExecutingTraderField rootPartyExecutingTrader = new RootPartyExecutingTraderField();

    /**
     * Root Party Clearing Firm
     */
    private final RootPartyClearingFirmField rootPartyClearingFirm = new RootPartyClearingFirmField();

    /**
     * Root Party Clearing Organization
     */
    private final RootPartyClearingOrganizationField rootPartyClearingOrganization = new RootPartyClearingOrganizationField();

    /**
     * Root Party Id Beneficiary
     */
    private final RootPartyIdBeneficiaryField rootPartyIdBeneficiary = new RootPartyIdBeneficiaryField();

    /**
     * Root Party Id Take Up Trading Firm
     */
    private final RootPartyIdTakeUpTradingFirmField rootPartyIdTakeUpTradingFirm = new RootPartyIdTakeUpTradingFirmField();

    /**
     * Root Party Id Order Origination Firm
     */
    private final RootPartyIdOrderOriginationFirmField rootPartyIdOrderOriginationFirm = new RootPartyIdOrderOriginationFirmField();

    /**
     * Root Party Id Execution Venue
     */
    private final RootPartyIdExecutionVenueField rootPartyIdExecutionVenue = new RootPartyIdExecutionVenueField();

    /**
     * Regulatory Trade Id
     */
    private final RegulatoryTradeIdField regulatoryTradeId = new RegulatoryTradeIdField();

    /**
     * Basket Party Contra Firm
     */
    private final BasketPartyContraFirmField basketPartyContraFirm = new BasketPartyContraFirmField();

    /**
     * Basket Side Trade Report Id
     */
    private final BasketSideTradeReportIdField basketSideTradeReportId = new BasketSideTradeReportIdField();

    /**
     * Srqs Related Trade Id Grp Comp
     */
    private final SrqsRelatedTradeIdGrpCompList srqsRelatedTradeIdGrpComp = new SrqsRelatedTradeIdGrpCompList();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(securityId), List.<Field>of(lastPx), List.<Field>of(lastQty), List.<Field>of(clearingTradePrice), List.<Field>of(clearingTradeQty), List.<Field>of(transactTime), List.<Field>of(relatedSecurityId), List.<Field>of(compressionId), List.<Field>of(rootPartyIdClientId), List.<Field>of(executingTrader), List.<Field>of(rootPartyIdInvestmentDecisionMaker), List.<Field>of(basketTrdMatchId), List.<Field>of(sideLastPx), List.<Field>of(sideLastQty), List.<Field>of(packageId), List.<Field>of(marketSegmentId), List.<Field>of(tradeId), List.<Field>of(tradeDate), List.<Field>of(sideTradeId), List.<Field>of(rootPartyIdSessionId), List.<Field>of(origTradeId), List.<Field>of(rootPartyIdExecutingUnit), List.<Field>of(rootPartyIdExecutingTrader), List.<Field>of(rootPartyIdClearingUnit), List.<Field>of(strategyLinkId), List.<Field>of(relatedSymbol), List.<Field>of(totNumTradeReports), List.<Field>of(negotiationId), List.<Field>of(noSrqsRelatedTradeIDs), List.<Field>of(basketProfileId), List.<Field>of(trdType), List.<Field>of(productComplex), List.<Field>of(relatedProductComplex), List.<Field>of(side), List.<Field>of(tradingCapacity), List.<Field>of(tradeReportType), List.<Field>of(transferReason), List.<Field>of(tradePublishIndicator), List.<Field>of(multiLegReportingType), List.<Field>of(positionEffect), List.<Field>of(multilegPriceModel), List.<Field>of(orderAttributeLiquidityProvision), List.<Field>of(orderAttributeRiskReduction), List.<Field>of(executingTraderQualifier), List.<Field>of(rootPartyIdInvestmentDecisionMakerQualifier), List.<Field>of(orderOrigination), List.<Field>of(reversalIndicator), List.<Field>of(tradeAggregationTransType), List.<Field>of(account), List.<Field>of(rootPartyIdPositionAccount), List.<Field>of(custOrderHandlingInst), List.<Field>of(freeText1), List.<Field>of(freeText2), List.<Field>of(freeText3), List.<Field>of(rootPartyExecutingFirm), List.<Field>of(rootPartyExecutingTrader), List.<Field>of(rootPartyClearingFirm), List.<Field>of(rootPartyClearingOrganization), List.<Field>of(rootPartyIdBeneficiary), List.<Field>of(rootPartyIdTakeUpTradingFirm), List.<Field>of(rootPartyIdOrderOriginationFirm), List.<Field>of(rootPartyIdExecutionVenue), List.<Field>of(regulatoryTradeId), List.<Field>of(basketPartyContraFirm), List.<Field>of(basketSideTradeReportId)).flatMap(List::stream).toList();

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
     * Last Qty
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
    }

    /**
     * Clearing Trade Price
     *
     * @return the ClearingTradePrice field
     */
    public ClearingTradePriceField clearingTradePrice() {
        return clearingTradePrice;
    }

    /**
     * Clearing Trade Qty
     *
     * @return the ClearingTradeQty field
     */
    public ClearingTradeQtyField clearingTradeQty() {
        return clearingTradeQty;
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
     * Related Security Id
     *
     * @return the RelatedSecurityId field
     */
    public RelatedSecurityIdField relatedSecurityId() {
        return relatedSecurityId;
    }

    /**
     * Compression Id
     *
     * @return the CompressionId field
     */
    public CompressionIdField compressionId() {
        return compressionId;
    }

    /**
     * Root Party Id Client Id
     *
     * @return the RootPartyIdClientId field
     */
    public RootPartyIdClientIdField rootPartyIdClientId() {
        return rootPartyIdClientId;
    }

    /**
     * Executing Trader
     *
     * @return the ExecutingTrader field
     */
    public ExecutingTraderField executingTrader() {
        return executingTrader;
    }

    /**
     * Root Party Id Investment Decision Maker
     *
     * @return the RootPartyIdInvestmentDecisionMaker field
     */
    public RootPartyIdInvestmentDecisionMakerField rootPartyIdInvestmentDecisionMaker() {
        return rootPartyIdInvestmentDecisionMaker;
    }

    /**
     * Basket Trd Match Id
     *
     * @return the BasketTrdMatchId field
     */
    public BasketTrdMatchIdField basketTrdMatchId() {
        return basketTrdMatchId;
    }

    /**
     * Side Last Px
     *
     * @return the SideLastPx field
     */
    public SideLastPxField sideLastPx() {
        return sideLastPx;
    }

    /**
     * Side Last Qty
     *
     * @return the SideLastQty field
     */
    public SideLastQtyField sideLastQty() {
        return sideLastQty;
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
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
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
     * Trade Date
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Side Trade Id
     *
     * @return the SideTradeId field
     */
    public SideTradeIdField sideTradeId() {
        return sideTradeId;
    }

    /**
     * Root Party Id Session Id
     *
     * @return the RootPartyIdSessionId field
     */
    public RootPartyIdSessionIdField rootPartyIdSessionId() {
        return rootPartyIdSessionId;
    }

    /**
     * Orig Trade Id
     *
     * @return the OrigTradeId field
     */
    public OrigTradeIdField origTradeId() {
        return origTradeId;
    }

    /**
     * Root Party Id Executing Unit
     *
     * @return the RootPartyIdExecutingUnit field
     */
    public RootPartyIdExecutingUnitField rootPartyIdExecutingUnit() {
        return rootPartyIdExecutingUnit;
    }

    /**
     * Root Party Id Executing Trader
     *
     * @return the RootPartyIdExecutingTrader field
     */
    public RootPartyIdExecutingTraderField rootPartyIdExecutingTrader() {
        return rootPartyIdExecutingTrader;
    }

    /**
     * Root Party Id Clearing Unit
     *
     * @return the RootPartyIdClearingUnit field
     */
    public RootPartyIdClearingUnitField rootPartyIdClearingUnit() {
        return rootPartyIdClearingUnit;
    }

    /**
     * Strategy Link Id
     *
     * @return the StrategyLinkId field
     */
    public StrategyLinkIdField strategyLinkId() {
        return strategyLinkId;
    }

    /**
     * Related Symbol
     *
     * @return the RelatedSymbol field
     */
    public RelatedSymbolField relatedSymbol() {
        return relatedSymbol;
    }

    /**
     * Tot Num Trade Reports
     *
     * @return the TotNumTradeReports field
     */
    public TotNumTradeReportsField totNumTradeReports() {
        return totNumTradeReports;
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
     * No Srqs Related Trade I Ds
     *
     * @return the NoSrqsRelatedTradeIDs field
     */
    public NoSrqsRelatedTradeIDsField noSrqsRelatedTradeIDs() {
        return noSrqsRelatedTradeIDs;
    }

    /**
     * Basket Profile Id
     *
     * @return the BasketProfileId field
     */
    public BasketProfileIdField basketProfileId() {
        return basketProfileId;
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
     * Product Complex
     *
     * @return the ProductComplex field
     */
    public ProductComplexField productComplex() {
        return productComplex;
    }

    /**
     * Related Product Complex
     *
     * @return the RelatedProductComplex field
     */
    public RelatedProductComplexField relatedProductComplex() {
        return relatedProductComplex;
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
     * Trading Capacity
     *
     * @return the TradingCapacity field
     */
    public TradingCapacityField tradingCapacity() {
        return tradingCapacity;
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
     * Transfer Reason
     *
     * @return the TransferReason field
     */
    public TransferReasonField transferReason() {
        return transferReason;
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
     * Multi Leg Reporting Type
     *
     * @return the MultiLegReportingType field
     */
    public MultiLegReportingTypeField multiLegReportingType() {
        return multiLegReportingType;
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
     * Multileg Price Model
     *
     * @return the MultilegPriceModel field
     */
    public MultilegPriceModelField multilegPriceModel() {
        return multilegPriceModel;
    }

    /**
     * Order Attribute Liquidity Provision
     *
     * @return the OrderAttributeLiquidityProvision field
     */
    public OrderAttributeLiquidityProvisionField orderAttributeLiquidityProvision() {
        return orderAttributeLiquidityProvision;
    }

    /**
     * Order Attribute Risk Reduction
     *
     * @return the OrderAttributeRiskReduction field
     */
    public OrderAttributeRiskReductionField orderAttributeRiskReduction() {
        return orderAttributeRiskReduction;
    }

    /**
     * Executing Trader Qualifier
     *
     * @return the ExecutingTraderQualifier field
     */
    public ExecutingTraderQualifierField executingTraderQualifier() {
        return executingTraderQualifier;
    }

    /**
     * Root Party Id Investment Decision Maker Qualifier
     *
     * @return the RootPartyIdInvestmentDecisionMakerQualifier field
     */
    public RootPartyIdInvestmentDecisionMakerQualifierField rootPartyIdInvestmentDecisionMakerQualifier() {
        return rootPartyIdInvestmentDecisionMakerQualifier;
    }

    /**
     * Order Origination
     *
     * @return the OrderOrigination field
     */
    public OrderOriginationField orderOrigination() {
        return orderOrigination;
    }

    /**
     * Reversal Indicator
     *
     * @return the ReversalIndicator field
     */
    public ReversalIndicatorField reversalIndicator() {
        return reversalIndicator;
    }

    /**
     * Trade Aggregation Trans Type
     *
     * @return the TradeAggregationTransType field
     */
    public TradeAggregationTransTypeField tradeAggregationTransType() {
        return tradeAggregationTransType;
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
     * Root Party Id Position Account
     *
     * @return the RootPartyIdPositionAccount field
     */
    public RootPartyIdPositionAccountField rootPartyIdPositionAccount() {
        return rootPartyIdPositionAccount;
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
     * Root Party Clearing Firm
     *
     * @return the RootPartyClearingFirm field
     */
    public RootPartyClearingFirmField rootPartyClearingFirm() {
        return rootPartyClearingFirm;
    }

    /**
     * Root Party Clearing Organization
     *
     * @return the RootPartyClearingOrganization field
     */
    public RootPartyClearingOrganizationField rootPartyClearingOrganization() {
        return rootPartyClearingOrganization;
    }

    /**
     * Root Party Id Beneficiary
     *
     * @return the RootPartyIdBeneficiary field
     */
    public RootPartyIdBeneficiaryField rootPartyIdBeneficiary() {
        return rootPartyIdBeneficiary;
    }

    /**
     * Root Party Id Take Up Trading Firm
     *
     * @return the RootPartyIdTakeUpTradingFirm field
     */
    public RootPartyIdTakeUpTradingFirmField rootPartyIdTakeUpTradingFirm() {
        return rootPartyIdTakeUpTradingFirm;
    }

    /**
     * Root Party Id Order Origination Firm
     *
     * @return the RootPartyIdOrderOriginationFirm field
     */
    public RootPartyIdOrderOriginationFirmField rootPartyIdOrderOriginationFirm() {
        return rootPartyIdOrderOriginationFirm;
    }

    /**
     * Root Party Id Execution Venue
     *
     * @return the RootPartyIdExecutionVenue field
     */
    public RootPartyIdExecutionVenueField rootPartyIdExecutionVenue() {
        return rootPartyIdExecutionVenue;
    }

    /**
     * Regulatory Trade Id
     *
     * @return the RegulatoryTradeId field
     */
    public RegulatoryTradeIdField regulatoryTradeId() {
        return regulatoryTradeId;
    }

    /**
     * Basket Party Contra Firm
     *
     * @return the BasketPartyContraFirm field
     */
    public BasketPartyContraFirmField basketPartyContraFirm() {
        return basketPartyContraFirm;
    }

    /**
     * Basket Side Trade Report Id
     *
     * @return the BasketSideTradeReportId field
     */
    public BasketSideTradeReportIdField basketSideTradeReportId() {
        return basketSideTradeReportId;
    }

    /**
     * Srqs Related Trade Id Grp Comp
     *
     * <p>Encode writes this list's size to the NoSrqsRelatedTradeIDs field.</p>
     *
     * @return the SrqsRelatedTradeIdGrpComp entries
     */
    public SrqsRelatedTradeIdGrpCompList srqsRelatedTradeIdGrpComp() {
        return srqsRelatedTradeIdGrpComp;
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
        return MINIMUM_BYTE_LENGTH + srqsRelatedTradeIdGrpComp.byteLength();
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
        cursor += 8;
        cursor += 8;
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
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        runs.add(cursor).add(3);
        cursor += 3;
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
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 2;
        cursor += 32;
        cursor += 1;
        cursor += 12;
        cursor += 12;
        cursor += 12;
        cursor += 5;
        cursor += 6;
        cursor += 5;
        cursor += 4;
        cursor += 9;
        cursor += 5;
        cursor += 7;
        cursor += 4;
        cursor += 52;
        cursor += 5;
        cursor += 20;
        runs.add(cursor).add(4);
        cursor += 4;
        cursor = srqsRelatedTradeIdGrpComp.padding(runs, cursor);
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 392)) {
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
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!clearingTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingTradePriceField.BYTE_LENGTH;
        if (!clearingTradeQty.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingTradeQtyField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!relatedSecurityId.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedSecurityIdField.BYTE_LENGTH;
        if (!compressionId.parse(data, cursor)) {
            return false;
        }
        cursor += CompressionIdField.BYTE_LENGTH;
        if (!rootPartyIdClientId.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdClientIdField.BYTE_LENGTH;
        if (!executingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderField.BYTE_LENGTH;
        if (!rootPartyIdInvestmentDecisionMaker.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdInvestmentDecisionMakerField.BYTE_LENGTH;
        if (!basketTrdMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += BasketTrdMatchIdField.BYTE_LENGTH;
        if (!sideLastPx.parse(data, cursor)) {
            return false;
        }
        cursor += SideLastPxField.BYTE_LENGTH;
        if (!sideLastQty.parse(data, cursor)) {
            return false;
        }
        cursor += SideLastQtyField.BYTE_LENGTH;
        if (!packageId.parse(data, cursor)) {
            return false;
        }
        cursor += PackageIdField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!sideTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += SideTradeIdField.BYTE_LENGTH;
        if (!rootPartyIdSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdSessionIdField.BYTE_LENGTH;
        if (!origTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigTradeIdField.BYTE_LENGTH;
        if (!rootPartyIdExecutingUnit.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdExecutingUnitField.BYTE_LENGTH;
        if (!rootPartyIdExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdExecutingTraderField.BYTE_LENGTH;
        if (!rootPartyIdClearingUnit.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdClearingUnitField.BYTE_LENGTH;
        if (!strategyLinkId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyLinkIdField.BYTE_LENGTH;
        if (!relatedSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedSymbolField.BYTE_LENGTH;
        if (!totNumTradeReports.parse(data, cursor)) {
            return false;
        }
        cursor += TotNumTradeReportsField.BYTE_LENGTH;
        if (!negotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiationIdField.BYTE_LENGTH;
        if (!noSrqsRelatedTradeIDs.parse(data, cursor)) {
            return false;
        }
        cursor += NoSrqsRelatedTradeIDsField.BYTE_LENGTH;
        cursor += 3; // padding
        if (!basketProfileId.parse(data, cursor)) {
            return false;
        }
        cursor += BasketProfileIdField.BYTE_LENGTH;
        if (!trdType.parse(data, cursor)) {
            return false;
        }
        cursor += TrdTypeField.BYTE_LENGTH;
        if (!productComplex.parse(data, cursor)) {
            return false;
        }
        cursor += ProductComplexField.BYTE_LENGTH;
        if (!relatedProductComplex.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedProductComplexField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!tradeReportType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportTypeField.BYTE_LENGTH;
        if (!transferReason.parse(data, cursor)) {
            return false;
        }
        cursor += TransferReasonField.BYTE_LENGTH;
        if (!tradePublishIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TradePublishIndicatorField.BYTE_LENGTH;
        if (!multiLegReportingType.parse(data, cursor)) {
            return false;
        }
        cursor += MultiLegReportingTypeField.BYTE_LENGTH;
        if (!positionEffect.parse(data, cursor)) {
            return false;
        }
        cursor += PositionEffectField.BYTE_LENGTH;
        if (!multilegPriceModel.parse(data, cursor)) {
            return false;
        }
        cursor += MultilegPriceModelField.BYTE_LENGTH;
        if (!orderAttributeLiquidityProvision.parse(data, cursor)) {
            return false;
        }
        cursor += OrderAttributeLiquidityProvisionField.BYTE_LENGTH;
        if (!orderAttributeRiskReduction.parse(data, cursor)) {
            return false;
        }
        cursor += OrderAttributeRiskReductionField.BYTE_LENGTH;
        if (!executingTraderQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderQualifierField.BYTE_LENGTH;
        if (!rootPartyIdInvestmentDecisionMakerQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdInvestmentDecisionMakerQualifierField.BYTE_LENGTH;
        if (!orderOrigination.parse(data, cursor)) {
            return false;
        }
        cursor += OrderOriginationField.BYTE_LENGTH;
        if (!reversalIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ReversalIndicatorField.BYTE_LENGTH;
        if (!tradeAggregationTransType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeAggregationTransTypeField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!rootPartyIdPositionAccount.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdPositionAccountField.BYTE_LENGTH;
        if (!custOrderHandlingInst.parse(data, cursor)) {
            return false;
        }
        cursor += CustOrderHandlingInstField.BYTE_LENGTH;
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
        if (!rootPartyExecutingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyExecutingFirmField.BYTE_LENGTH;
        if (!rootPartyExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyExecutingTraderField.BYTE_LENGTH;
        if (!rootPartyClearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyClearingFirmField.BYTE_LENGTH;
        if (!rootPartyClearingOrganization.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyClearingOrganizationField.BYTE_LENGTH;
        if (!rootPartyIdBeneficiary.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdBeneficiaryField.BYTE_LENGTH;
        if (!rootPartyIdTakeUpTradingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdTakeUpTradingFirmField.BYTE_LENGTH;
        if (!rootPartyIdOrderOriginationFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdOrderOriginationFirmField.BYTE_LENGTH;
        if (!rootPartyIdExecutionVenue.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdExecutionVenueField.BYTE_LENGTH;
        if (!regulatoryTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += RegulatoryTradeIdField.BYTE_LENGTH;
        if (!basketPartyContraFirm.parse(data, cursor)) {
            return false;
        }
        cursor += BasketPartyContraFirmField.BYTE_LENGTH;
        if (!basketSideTradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += BasketSideTradeReportIdField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!srqsRelatedTradeIdGrpComp.parse(data, cursor, end, noSrqsRelatedTradeIDs.value())) {
            return false;
        }
        cursor += srqsRelatedTradeIdGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (srqsRelatedTradeIdGrpComp.size() > 255) {
            throw new IllegalStateException("srqsRelatedTradeIdGrpComp holds " + srqsRelatedTradeIdGrpComp.size() + " entries, more than its count field can state");
        }
        noSrqsRelatedTradeIDs.value((short) srqsRelatedTradeIdGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = clearingTradePrice.encode(data, cursor);
        cursor = clearingTradeQty.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = relatedSecurityId.encode(data, cursor);
        cursor = compressionId.encode(data, cursor);
        cursor = rootPartyIdClientId.encode(data, cursor);
        cursor = executingTrader.encode(data, cursor);
        cursor = rootPartyIdInvestmentDecisionMaker.encode(data, cursor);
        cursor = basketTrdMatchId.encode(data, cursor);
        cursor = sideLastPx.encode(data, cursor);
        cursor = sideLastQty.encode(data, cursor);
        cursor = packageId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = sideTradeId.encode(data, cursor);
        cursor = rootPartyIdSessionId.encode(data, cursor);
        cursor = origTradeId.encode(data, cursor);
        cursor = rootPartyIdExecutingUnit.encode(data, cursor);
        cursor = rootPartyIdExecutingTrader.encode(data, cursor);
        cursor = rootPartyIdClearingUnit.encode(data, cursor);
        cursor = strategyLinkId.encode(data, cursor);
        cursor = relatedSymbol.encode(data, cursor);
        cursor = totNumTradeReports.encode(data, cursor);
        cursor = negotiationId.encode(data, cursor);
        cursor = noSrqsRelatedTradeIDs.encode(data, cursor);
        if (buffer != null && buffer.length >= 206) {
            System.arraycopy(buffer, 203, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
        cursor = basketProfileId.encode(data, cursor);
        cursor = trdType.encode(data, cursor);
        cursor = productComplex.encode(data, cursor);
        cursor = relatedProductComplex.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = tradeReportType.encode(data, cursor);
        cursor = transferReason.encode(data, cursor);
        cursor = tradePublishIndicator.encode(data, cursor);
        cursor = multiLegReportingType.encode(data, cursor);
        cursor = positionEffect.encode(data, cursor);
        cursor = multilegPriceModel.encode(data, cursor);
        cursor = orderAttributeLiquidityProvision.encode(data, cursor);
        cursor = orderAttributeRiskReduction.encode(data, cursor);
        cursor = executingTraderQualifier.encode(data, cursor);
        cursor = rootPartyIdInvestmentDecisionMakerQualifier.encode(data, cursor);
        cursor = orderOrigination.encode(data, cursor);
        cursor = reversalIndicator.encode(data, cursor);
        cursor = tradeAggregationTransType.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = rootPartyIdPositionAccount.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText2.encode(data, cursor);
        cursor = freeText3.encode(data, cursor);
        cursor = rootPartyExecutingFirm.encode(data, cursor);
        cursor = rootPartyExecutingTrader.encode(data, cursor);
        cursor = rootPartyClearingFirm.encode(data, cursor);
        cursor = rootPartyClearingOrganization.encode(data, cursor);
        cursor = rootPartyIdBeneficiary.encode(data, cursor);
        cursor = rootPartyIdTakeUpTradingFirm.encode(data, cursor);
        cursor = rootPartyIdOrderOriginationFirm.encode(data, cursor);
        cursor = rootPartyIdExecutionVenue.encode(data, cursor);
        cursor = regulatoryTradeId.encode(data, cursor);
        cursor = basketPartyContraFirm.encode(data, cursor);
        cursor = basketSideTradeReportId.encode(data, cursor);
        if (buffer != null && buffer.length >= 426) {
            System.arraycopy(buffer, 422, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = srqsRelatedTradeIdGrpComp.encode(data, cursor);
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
        srqsRelatedTradeIdGrpComp.clear();
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
            if (field != noSrqsRelatedTradeIDs && !field.isRecognized()) {
                return false;
            }
        }
        return srqsRelatedTradeIdGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noSrqsRelatedTradeIDs && !field.isValid()) {
                return false;
            }
        }
        if (!srqsRelatedTradeIdGrpComp.isValid()) {
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
        if (!lastQty.isDecoded()) {
            return Optional.of(lastQty);
        }
        if (!clearingTradePrice.isDecoded()) {
            return Optional.of(clearingTradePrice);
        }
        if (!clearingTradeQty.isDecoded()) {
            return Optional.of(clearingTradeQty);
        }
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!relatedSecurityId.isDecoded()) {
            return Optional.of(relatedSecurityId);
        }
        if (!compressionId.isDecoded()) {
            return Optional.of(compressionId);
        }
        if (!rootPartyIdClientId.isDecoded()) {
            return Optional.of(rootPartyIdClientId);
        }
        if (!executingTrader.isDecoded()) {
            return Optional.of(executingTrader);
        }
        if (!rootPartyIdInvestmentDecisionMaker.isDecoded()) {
            return Optional.of(rootPartyIdInvestmentDecisionMaker);
        }
        if (!basketTrdMatchId.isDecoded()) {
            return Optional.of(basketTrdMatchId);
        }
        if (!sideLastPx.isDecoded()) {
            return Optional.of(sideLastPx);
        }
        if (!sideLastQty.isDecoded()) {
            return Optional.of(sideLastQty);
        }
        if (!packageId.isDecoded()) {
            return Optional.of(packageId);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!tradeId.isDecoded()) {
            return Optional.of(tradeId);
        }
        if (!tradeDate.isDecoded()) {
            return Optional.of(tradeDate);
        }
        if (!sideTradeId.isDecoded()) {
            return Optional.of(sideTradeId);
        }
        if (!rootPartyIdSessionId.isDecoded()) {
            return Optional.of(rootPartyIdSessionId);
        }
        if (!origTradeId.isDecoded()) {
            return Optional.of(origTradeId);
        }
        if (!rootPartyIdExecutingUnit.isDecoded()) {
            return Optional.of(rootPartyIdExecutingUnit);
        }
        if (!rootPartyIdExecutingTrader.isDecoded()) {
            return Optional.of(rootPartyIdExecutingTrader);
        }
        if (!rootPartyIdClearingUnit.isDecoded()) {
            return Optional.of(rootPartyIdClearingUnit);
        }
        if (!strategyLinkId.isDecoded()) {
            return Optional.of(strategyLinkId);
        }
        if (!relatedSymbol.isDecoded()) {
            return Optional.of(relatedSymbol);
        }
        if (!totNumTradeReports.isDecoded()) {
            return Optional.of(totNumTradeReports);
        }
        if (!negotiationId.isDecoded()) {
            return Optional.of(negotiationId);
        }
        if (!noSrqsRelatedTradeIDs.isDecoded()) {
            return Optional.of(noSrqsRelatedTradeIDs);
        }
        if (!basketProfileId.isDecoded()) {
            return Optional.of(basketProfileId);
        }
        if (!trdType.isDecoded()) {
            return Optional.of(trdType);
        }
        if (!productComplex.isDecoded()) {
            return Optional.of(productComplex);
        }
        if (!relatedProductComplex.isDecoded()) {
            return Optional.of(relatedProductComplex);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!tradingCapacity.isDecoded()) {
            return Optional.of(tradingCapacity);
        }
        if (!tradeReportType.isDecoded()) {
            return Optional.of(tradeReportType);
        }
        if (!transferReason.isDecoded()) {
            return Optional.of(transferReason);
        }
        if (!tradePublishIndicator.isDecoded()) {
            return Optional.of(tradePublishIndicator);
        }
        if (!multiLegReportingType.isDecoded()) {
            return Optional.of(multiLegReportingType);
        }
        if (!positionEffect.isDecoded()) {
            return Optional.of(positionEffect);
        }
        if (!multilegPriceModel.isDecoded()) {
            return Optional.of(multilegPriceModel);
        }
        if (!orderAttributeLiquidityProvision.isDecoded()) {
            return Optional.of(orderAttributeLiquidityProvision);
        }
        if (!orderAttributeRiskReduction.isDecoded()) {
            return Optional.of(orderAttributeRiskReduction);
        }
        if (!executingTraderQualifier.isDecoded()) {
            return Optional.of(executingTraderQualifier);
        }
        if (!rootPartyIdInvestmentDecisionMakerQualifier.isDecoded()) {
            return Optional.of(rootPartyIdInvestmentDecisionMakerQualifier);
        }
        if (!orderOrigination.isDecoded()) {
            return Optional.of(orderOrigination);
        }
        if (!reversalIndicator.isDecoded()) {
            return Optional.of(reversalIndicator);
        }
        if (!tradeAggregationTransType.isDecoded()) {
            return Optional.of(tradeAggregationTransType);
        }
        if (!account.isDecoded()) {
            return Optional.of(account);
        }
        if (!rootPartyIdPositionAccount.isDecoded()) {
            return Optional.of(rootPartyIdPositionAccount);
        }
        if (!custOrderHandlingInst.isDecoded()) {
            return Optional.of(custOrderHandlingInst);
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
        if (!rootPartyExecutingFirm.isDecoded()) {
            return Optional.of(rootPartyExecutingFirm);
        }
        if (!rootPartyExecutingTrader.isDecoded()) {
            return Optional.of(rootPartyExecutingTrader);
        }
        if (!rootPartyClearingFirm.isDecoded()) {
            return Optional.of(rootPartyClearingFirm);
        }
        if (!rootPartyClearingOrganization.isDecoded()) {
            return Optional.of(rootPartyClearingOrganization);
        }
        if (!rootPartyIdBeneficiary.isDecoded()) {
            return Optional.of(rootPartyIdBeneficiary);
        }
        if (!rootPartyIdTakeUpTradingFirm.isDecoded()) {
            return Optional.of(rootPartyIdTakeUpTradingFirm);
        }
        if (!rootPartyIdOrderOriginationFirm.isDecoded()) {
            return Optional.of(rootPartyIdOrderOriginationFirm);
        }
        if (!rootPartyIdExecutionVenue.isDecoded()) {
            return Optional.of(rootPartyIdExecutionVenue);
        }
        if (!regulatoryTradeId.isDecoded()) {
            return Optional.of(regulatoryTradeId);
        }
        if (!basketPartyContraFirm.isDecoded()) {
            return Optional.of(basketPartyContraFirm);
        }
        if (!basketSideTradeReportId.isDecoded()) {
            return Optional.of(basketSideTradeReportId);
        }
        if (!srqsRelatedTradeIdGrpComp.isDecoded()) {
            return Optional.of(srqsRelatedTradeIdGrpComp.failedEntry().flatMap(SrqsRelatedTradeIdGrpCompEntry::failedAt).orElse(noSrqsRelatedTradeIDs));
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
            case "LastQty" -> Optional.of(lastQty);
            case "ClearingTradePrice" -> Optional.of(clearingTradePrice);
            case "ClearingTradeQty" -> Optional.of(clearingTradeQty);
            case "TransactTime" -> Optional.of(transactTime);
            case "RelatedSecurityId" -> Optional.of(relatedSecurityId);
            case "CompressionId" -> Optional.of(compressionId);
            case "RootPartyIdClientId" -> Optional.of(rootPartyIdClientId);
            case "ExecutingTrader" -> Optional.of(executingTrader);
            case "RootPartyIdInvestmentDecisionMaker" -> Optional.of(rootPartyIdInvestmentDecisionMaker);
            case "BasketTrdMatchId" -> Optional.of(basketTrdMatchId);
            case "SideLastPx" -> Optional.of(sideLastPx);
            case "SideLastQty" -> Optional.of(sideLastQty);
            case "PackageId" -> Optional.of(packageId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "TradeId" -> Optional.of(tradeId);
            case "TradeDate" -> Optional.of(tradeDate);
            case "SideTradeId" -> Optional.of(sideTradeId);
            case "RootPartyIdSessionId" -> Optional.of(rootPartyIdSessionId);
            case "OrigTradeId" -> Optional.of(origTradeId);
            case "RootPartyIdExecutingUnit" -> Optional.of(rootPartyIdExecutingUnit);
            case "RootPartyIdExecutingTrader" -> Optional.of(rootPartyIdExecutingTrader);
            case "RootPartyIdClearingUnit" -> Optional.of(rootPartyIdClearingUnit);
            case "StrategyLinkId" -> Optional.of(strategyLinkId);
            case "RelatedSymbol" -> Optional.of(relatedSymbol);
            case "TotNumTradeReports" -> Optional.of(totNumTradeReports);
            case "NegotiationId" -> Optional.of(negotiationId);
            case "NoSrqsRelatedTradeIDs" -> Optional.of(noSrqsRelatedTradeIDs);
            case "BasketProfileId" -> Optional.of(basketProfileId);
            case "TrdType" -> Optional.of(trdType);
            case "ProductComplex" -> Optional.of(productComplex);
            case "RelatedProductComplex" -> Optional.of(relatedProductComplex);
            case "Side" -> Optional.of(side);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "TransferReason" -> Optional.of(transferReason);
            case "TradePublishIndicator" -> Optional.of(tradePublishIndicator);
            case "MultiLegReportingType" -> Optional.of(multiLegReportingType);
            case "PositionEffect" -> Optional.of(positionEffect);
            case "MultilegPriceModel" -> Optional.of(multilegPriceModel);
            case "OrderAttributeLiquidityProvision" -> Optional.of(orderAttributeLiquidityProvision);
            case "OrderAttributeRiskReduction" -> Optional.of(orderAttributeRiskReduction);
            case "ExecutingTraderQualifier" -> Optional.of(executingTraderQualifier);
            case "RootPartyIdInvestmentDecisionMakerQualifier" -> Optional.of(rootPartyIdInvestmentDecisionMakerQualifier);
            case "OrderOrigination" -> Optional.of(orderOrigination);
            case "ReversalIndicator" -> Optional.of(reversalIndicator);
            case "TradeAggregationTransType" -> Optional.of(tradeAggregationTransType);
            case "Account" -> Optional.of(account);
            case "RootPartyIdPositionAccount" -> Optional.of(rootPartyIdPositionAccount);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "FreeText1" -> Optional.of(freeText1);
            case "FreeText2" -> Optional.of(freeText2);
            case "FreeText3" -> Optional.of(freeText3);
            case "RootPartyExecutingFirm" -> Optional.of(rootPartyExecutingFirm);
            case "RootPartyExecutingTrader" -> Optional.of(rootPartyExecutingTrader);
            case "RootPartyClearingFirm" -> Optional.of(rootPartyClearingFirm);
            case "RootPartyClearingOrganization" -> Optional.of(rootPartyClearingOrganization);
            case "RootPartyIdBeneficiary" -> Optional.of(rootPartyIdBeneficiary);
            case "RootPartyIdTakeUpTradingFirm" -> Optional.of(rootPartyIdTakeUpTradingFirm);
            case "RootPartyIdOrderOriginationFirm" -> Optional.of(rootPartyIdOrderOriginationFirm);
            case "RootPartyIdExecutionVenue" -> Optional.of(rootPartyIdExecutionVenue);
            case "RegulatoryTradeId" -> Optional.of(regulatoryTradeId);
            case "BasketPartyContraFirm" -> Optional.of(basketPartyContraFirm);
            case "BasketSideTradeReportId" -> Optional.of(basketSideTradeReportId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TesTradeBroadcast message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(srqsRelatedTradeIdGrpComp.diffFields(message.srqsRelatedTradeIdGrpComp));
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
            srqsRelatedTradeIdGrpComp.toFormattedString(builder, options);
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
        srqsRelatedTradeIdGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof TesTradeBroadcast message)) {
            return false;
        }
        return fields.equals(message.fields) && srqsRelatedTradeIdGrpComp.equals(message.srqsRelatedTradeIdGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, srqsRelatedTradeIdGrpComp);
    }
}
