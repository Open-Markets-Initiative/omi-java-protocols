package omi.eurex.t7.eti.fbe.v6_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v6_1.fields.AccountField;
import omi.eurex.t7.eti.fbe.v6_1.fields.ClOrdIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.ClearingTradePriceField;
import omi.eurex.t7.eti.fbe.v6_1.fields.ClearingTradeQtyField;
import omi.eurex.t7.eti.fbe.v6_1.fields.CumQtyField;
import omi.eurex.t7.eti.fbe.v6_1.fields.CustOrderHandlingInstField;
import omi.eurex.t7.eti.fbe.v6_1.fields.FreeText1Field;
import omi.eurex.t7.eti.fbe.v6_1.fields.FreeText2Field;
import omi.eurex.t7.eti.fbe.v6_1.fields.FreeText3Field;
import omi.eurex.t7.eti.fbe.v6_1.fields.LastPxField;
import omi.eurex.t7.eti.fbe.v6_1.fields.LastQtyField;
import omi.eurex.t7.eti.fbe.v6_1.fields.LeavesQtyField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MatchDateField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MatchSubTypeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MatchTypeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MultiLegReportingTypeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.OrdTypeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.OrderCategoryField;
import omi.eurex.t7.eti.fbe.v6_1.fields.OrderIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.OrderSideField;
import omi.eurex.t7.eti.fbe.v6_1.fields.OrigTradeIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PositionEffectField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PriceField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RelatedProductComplexField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RelatedSecurityIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RelatedSymbolField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyClearingFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyClearingOrganizationField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyExecutingFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyExecutingTraderField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyIdBeneficiaryField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyIdClearingUnitField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyIdExecutingTraderField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyIdExecutingUnitField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyIdOrderOriginationFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyIdPositionAccountField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyIdSessionIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.RootPartyIdTakeUpTradingFirmField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SecurityIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SideField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SideLastPxField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SideLastQtyField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SideLiquidityIndField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SideTradeIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.StrategyLinkIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TotNumTradeReportsField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradeIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradeReportTypeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradingCapacityField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TransactTimeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TransferReasonField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TrdMatchIdField;
import omi.eurex.t7.eti.fbe.v6_1.structs.RbcHeaderComp;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.Message;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * Represents the TradeBroadcast message from the Eti protocol.
 */
public final class TradeBroadcast implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 306;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Broadcast";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 2, 27, 7, 303, 3 };

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Related Security Id
     */
    private final RelatedSecurityIdField relatedSecurityId = new RelatedSecurityIdField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Side Last Px
     */
    private final SideLastPxField sideLastPx = new SideLastPxField();

    /**
     * Clearing Trade Price
     */
    private final ClearingTradePriceField clearingTradePrice = new ClearingTradePriceField();

    /**
     * Transact Time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Order Id
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Cl Ord Id
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Trade Id
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Orig Trade Id
     */
    private final OrigTradeIdField origTradeId = new OrigTradeIdField();

    /**
     * Root Party Id Executing Unit
     */
    private final RootPartyIdExecutingUnitField rootPartyIdExecutingUnit = new RootPartyIdExecutingUnitField();

    /**
     * Root Party Id Session Id
     */
    private final RootPartyIdSessionIdField rootPartyIdSessionId = new RootPartyIdSessionIdField();

    /**
     * Root Party Id Executing Trader
     */
    private final RootPartyIdExecutingTraderField rootPartyIdExecutingTrader = new RootPartyIdExecutingTraderField();

    /**
     * Root Party Id Clearing Unit
     */
    private final RootPartyIdClearingUnitField rootPartyIdClearingUnit = new RootPartyIdClearingUnitField();

    /**
     * Cum Qty
     */
    private final CumQtyField cumQty = new CumQtyField();

    /**
     * Leaves Qty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Related Symbol
     */
    private final RelatedSymbolField relatedSymbol = new RelatedSymbolField();

    /**
     * Last Qty
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Side Last Qty
     */
    private final SideLastQtyField sideLastQty = new SideLastQtyField();

    /**
     * Clearing Trade Qty
     */
    private final ClearingTradeQtyField clearingTradeQty = new ClearingTradeQtyField();

    /**
     * Side Trade Id
     */
    private final SideTradeIdField sideTradeId = new SideTradeIdField();

    /**
     * Match Date
     */
    private final MatchDateField matchDate = new MatchDateField();

    /**
     * Trd Match Id
     */
    private final TrdMatchIdField trdMatchId = new TrdMatchIdField();

    /**
     * Strategy Link Id
     */
    private final StrategyLinkIdField strategyLinkId = new StrategyLinkIdField();

    /**
     * Tot Num Trade Reports
     */
    private final TotNumTradeReportsField totNumTradeReports = new TotNumTradeReportsField();

    /**
     * Multi Leg Reporting Type
     */
    private final MultiLegReportingTypeField multiLegReportingType = new MultiLegReportingTypeField();

    /**
     * Trade Report Type
     */
    private final TradeReportTypeField tradeReportType = new TradeReportTypeField();

    /**
     * Transfer Reason
     */
    private final TransferReasonField transferReason = new TransferReasonField();

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
     * Match Type
     */
    private final MatchTypeField matchType = new MatchTypeField();

    /**
     * Match Sub Type
     */
    private final MatchSubTypeField matchSubType = new MatchSubTypeField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Side Liquidity Ind
     */
    private final SideLiquidityIndField sideLiquidityInd = new SideLiquidityIndField();

    /**
     * Trading Capacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Root Party Id Position Account
     */
    private final RootPartyIdPositionAccountField rootPartyIdPositionAccount = new RootPartyIdPositionAccountField();

    /**
     * Position Effect
     */
    private final PositionEffectField positionEffect = new PositionEffectField();

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
     * Order Category
     */
    private final OrderCategoryField orderCategory = new OrderCategoryField();

    /**
     * Ord Type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Related Product Complex
     */
    private final RelatedProductComplexField relatedProductComplex = new RelatedProductComplexField();

    /**
     * Order Side
     */
    private final OrderSideField orderSide = new OrderSideField();

    /**
     * Root Party Clearing Organization
     */
    private final RootPartyClearingOrganizationField rootPartyClearingOrganization = new RootPartyClearingOrganizationField();

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
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(securityId), List.<Field>of(relatedSecurityId), List.<Field>of(price), List.<Field>of(lastPx), List.<Field>of(sideLastPx), List.<Field>of(clearingTradePrice), List.<Field>of(transactTime), List.<Field>of(orderId), List.<Field>of(clOrdId), List.<Field>of(tradeId), List.<Field>of(origTradeId), List.<Field>of(rootPartyIdExecutingUnit), List.<Field>of(rootPartyIdSessionId), List.<Field>of(rootPartyIdExecutingTrader), List.<Field>of(rootPartyIdClearingUnit), List.<Field>of(cumQty), List.<Field>of(leavesQty), List.<Field>of(marketSegmentId), List.<Field>of(relatedSymbol), List.<Field>of(lastQty), List.<Field>of(sideLastQty), List.<Field>of(clearingTradeQty), List.<Field>of(sideTradeId), List.<Field>of(matchDate), List.<Field>of(trdMatchId), List.<Field>of(strategyLinkId), List.<Field>of(totNumTradeReports), List.<Field>of(multiLegReportingType), List.<Field>of(tradeReportType), List.<Field>of(transferReason), List.<Field>of(rootPartyIdBeneficiary), List.<Field>of(rootPartyIdTakeUpTradingFirm), List.<Field>of(rootPartyIdOrderOriginationFirm), List.<Field>of(matchType), List.<Field>of(matchSubType), List.<Field>of(side), List.<Field>of(sideLiquidityInd), List.<Field>of(tradingCapacity), List.<Field>of(account), List.<Field>of(rootPartyIdPositionAccount), List.<Field>of(positionEffect), List.<Field>of(custOrderHandlingInst), List.<Field>of(freeText1), List.<Field>of(freeText2), List.<Field>of(freeText3), List.<Field>of(orderCategory), List.<Field>of(ordType), List.<Field>of(relatedProductComplex), List.<Field>of(orderSide), List.<Field>of(rootPartyClearingOrganization), List.<Field>of(rootPartyExecutingFirm), List.<Field>of(rootPartyExecutingTrader), List.<Field>of(rootPartyClearingFirm)).flatMap(List::stream).toList();

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
     * Related Security Id
     *
     * @return the RelatedSecurityId field
     */
    public RelatedSecurityIdField relatedSecurityId() {
        return relatedSecurityId;
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
     * Last Px
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
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
     * Clearing Trade Price
     *
     * @return the ClearingTradePrice field
     */
    public ClearingTradePriceField clearingTradePrice() {
        return clearingTradePrice;
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
     * Order Id
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Cl Ord Id
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
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
     * Root Party Id Session Id
     *
     * @return the RootPartyIdSessionId field
     */
    public RootPartyIdSessionIdField rootPartyIdSessionId() {
        return rootPartyIdSessionId;
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
     * Cum Qty
     *
     * @return the CumQty field
     */
    public CumQtyField cumQty() {
        return cumQty;
    }

    /**
     * Leaves Qty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
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
     * Related Symbol
     *
     * @return the RelatedSymbol field
     */
    public RelatedSymbolField relatedSymbol() {
        return relatedSymbol;
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
     * Side Last Qty
     *
     * @return the SideLastQty field
     */
    public SideLastQtyField sideLastQty() {
        return sideLastQty;
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
     * Side Trade Id
     *
     * @return the SideTradeId field
     */
    public SideTradeIdField sideTradeId() {
        return sideTradeId;
    }

    /**
     * Match Date
     *
     * @return the MatchDate field
     */
    public MatchDateField matchDate() {
        return matchDate;
    }

    /**
     * Trd Match Id
     *
     * @return the TrdMatchId field
     */
    public TrdMatchIdField trdMatchId() {
        return trdMatchId;
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
     * Tot Num Trade Reports
     *
     * @return the TotNumTradeReports field
     */
    public TotNumTradeReportsField totNumTradeReports() {
        return totNumTradeReports;
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
     * Match Type
     *
     * @return the MatchType field
     */
    public MatchTypeField matchType() {
        return matchType;
    }

    /**
     * Match Sub Type
     *
     * @return the MatchSubType field
     */
    public MatchSubTypeField matchSubType() {
        return matchSubType;
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
     * Side Liquidity Ind
     *
     * @return the SideLiquidityInd field
     */
    public SideLiquidityIndField sideLiquidityInd() {
        return sideLiquidityInd;
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
     * Position Effect
     *
     * @return the PositionEffect field
     */
    public PositionEffectField positionEffect() {
        return positionEffect;
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
     * Order Category
     *
     * @return the OrderCategory field
     */
    public OrderCategoryField orderCategory() {
        return orderCategory;
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
     * Related Product Complex
     *
     * @return the RelatedProductComplex field
     */
    public RelatedProductComplexField relatedProductComplex() {
        return relatedProductComplex;
    }

    /**
     * Order Side
     *
     * @return the OrderSide field
     */
    public OrderSideField orderSide() {
        return orderSide;
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
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        cursor += 2; // padding
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 272)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!relatedSecurityId.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedSecurityIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!sideLastPx.parse(data, cursor)) {
            return false;
        }
        cursor += SideLastPxField.BYTE_LENGTH;
        if (!clearingTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingTradePriceField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!origTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigTradeIdField.BYTE_LENGTH;
        if (!rootPartyIdExecutingUnit.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdExecutingUnitField.BYTE_LENGTH;
        if (!rootPartyIdSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdSessionIdField.BYTE_LENGTH;
        if (!rootPartyIdExecutingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdExecutingTraderField.BYTE_LENGTH;
        if (!rootPartyIdClearingUnit.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdClearingUnitField.BYTE_LENGTH;
        if (!cumQty.parse(data, cursor)) {
            return false;
        }
        cursor += CumQtyField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!relatedSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedSymbolField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!sideLastQty.parse(data, cursor)) {
            return false;
        }
        cursor += SideLastQtyField.BYTE_LENGTH;
        if (!clearingTradeQty.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingTradeQtyField.BYTE_LENGTH;
        if (!sideTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += SideTradeIdField.BYTE_LENGTH;
        if (!matchDate.parse(data, cursor)) {
            return false;
        }
        cursor += MatchDateField.BYTE_LENGTH;
        if (!trdMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += TrdMatchIdField.BYTE_LENGTH;
        if (!strategyLinkId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyLinkIdField.BYTE_LENGTH;
        if (!totNumTradeReports.parse(data, cursor)) {
            return false;
        }
        cursor += TotNumTradeReportsField.BYTE_LENGTH;
        if (!multiLegReportingType.parse(data, cursor)) {
            return false;
        }
        cursor += MultiLegReportingTypeField.BYTE_LENGTH;
        if (!tradeReportType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportTypeField.BYTE_LENGTH;
        if (!transferReason.parse(data, cursor)) {
            return false;
        }
        cursor += TransferReasonField.BYTE_LENGTH;
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
        if (!matchType.parse(data, cursor)) {
            return false;
        }
        cursor += MatchTypeField.BYTE_LENGTH;
        if (!matchSubType.parse(data, cursor)) {
            return false;
        }
        cursor += MatchSubTypeField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!sideLiquidityInd.parse(data, cursor)) {
            return false;
        }
        cursor += SideLiquidityIndField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!rootPartyIdPositionAccount.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdPositionAccountField.BYTE_LENGTH;
        if (!positionEffect.parse(data, cursor)) {
            return false;
        }
        cursor += PositionEffectField.BYTE_LENGTH;
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
        if (!orderCategory.parse(data, cursor)) {
            return false;
        }
        cursor += OrderCategoryField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
        if (!relatedProductComplex.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedProductComplexField.BYTE_LENGTH;
        if (!orderSide.parse(data, cursor)) {
            return false;
        }
        cursor += OrderSideField.BYTE_LENGTH;
        if (!rootPartyClearingOrganization.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyClearingOrganizationField.BYTE_LENGTH;
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
        cursor += 3; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 0 + 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = relatedSecurityId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = sideLastPx.encode(data, cursor);
        cursor = clearingTradePrice.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = origTradeId.encode(data, cursor);
        cursor = rootPartyIdExecutingUnit.encode(data, cursor);
        cursor = rootPartyIdSessionId.encode(data, cursor);
        cursor = rootPartyIdExecutingTrader.encode(data, cursor);
        cursor = rootPartyIdClearingUnit.encode(data, cursor);
        cursor = cumQty.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = relatedSymbol.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = sideLastQty.encode(data, cursor);
        cursor = clearingTradeQty.encode(data, cursor);
        cursor = sideTradeId.encode(data, cursor);
        cursor = matchDate.encode(data, cursor);
        cursor = trdMatchId.encode(data, cursor);
        cursor = strategyLinkId.encode(data, cursor);
        cursor = totNumTradeReports.encode(data, cursor);
        cursor = multiLegReportingType.encode(data, cursor);
        cursor = tradeReportType.encode(data, cursor);
        cursor = transferReason.encode(data, cursor);
        cursor = rootPartyIdBeneficiary.encode(data, cursor);
        cursor = rootPartyIdTakeUpTradingFirm.encode(data, cursor);
        cursor = rootPartyIdOrderOriginationFirm.encode(data, cursor);
        cursor = matchType.encode(data, cursor);
        cursor = matchSubType.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = sideLiquidityInd.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = rootPartyIdPositionAccount.encode(data, cursor);
        cursor = positionEffect.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText2.encode(data, cursor);
        cursor = freeText3.encode(data, cursor);
        cursor = orderCategory.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = relatedProductComplex.encode(data, cursor);
        cursor = orderSide.encode(data, cursor);
        cursor = rootPartyClearingOrganization.encode(data, cursor);
        cursor = rootPartyExecutingFirm.encode(data, cursor);
        cursor = rootPartyExecutingTrader.encode(data, cursor);
        cursor = rootPartyClearingFirm.encode(data, cursor);
        if (buffer != null && buffer.length >= 303 + 3) {
            System.arraycopy(buffer, 303, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        rbcHeaderComp.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
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
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "SecurityId" -> Optional.of(securityId);
            case "RelatedSecurityId" -> Optional.of(relatedSecurityId);
            case "Price" -> Optional.of(price);
            case "LastPx" -> Optional.of(lastPx);
            case "SideLastPx" -> Optional.of(sideLastPx);
            case "ClearingTradePrice" -> Optional.of(clearingTradePrice);
            case "TransactTime" -> Optional.of(transactTime);
            case "OrderId" -> Optional.of(orderId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "TradeId" -> Optional.of(tradeId);
            case "OrigTradeId" -> Optional.of(origTradeId);
            case "RootPartyIdExecutingUnit" -> Optional.of(rootPartyIdExecutingUnit);
            case "RootPartyIdSessionId" -> Optional.of(rootPartyIdSessionId);
            case "RootPartyIdExecutingTrader" -> Optional.of(rootPartyIdExecutingTrader);
            case "RootPartyIdClearingUnit" -> Optional.of(rootPartyIdClearingUnit);
            case "CumQty" -> Optional.of(cumQty);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "RelatedSymbol" -> Optional.of(relatedSymbol);
            case "LastQty" -> Optional.of(lastQty);
            case "SideLastQty" -> Optional.of(sideLastQty);
            case "ClearingTradeQty" -> Optional.of(clearingTradeQty);
            case "SideTradeId" -> Optional.of(sideTradeId);
            case "MatchDate" -> Optional.of(matchDate);
            case "TrdMatchId" -> Optional.of(trdMatchId);
            case "StrategyLinkId" -> Optional.of(strategyLinkId);
            case "TotNumTradeReports" -> Optional.of(totNumTradeReports);
            case "MultiLegReportingType" -> Optional.of(multiLegReportingType);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "TransferReason" -> Optional.of(transferReason);
            case "RootPartyIdBeneficiary" -> Optional.of(rootPartyIdBeneficiary);
            case "RootPartyIdTakeUpTradingFirm" -> Optional.of(rootPartyIdTakeUpTradingFirm);
            case "RootPartyIdOrderOriginationFirm" -> Optional.of(rootPartyIdOrderOriginationFirm);
            case "MatchType" -> Optional.of(matchType);
            case "MatchSubType" -> Optional.of(matchSubType);
            case "Side" -> Optional.of(side);
            case "SideLiquidityInd" -> Optional.of(sideLiquidityInd);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "Account" -> Optional.of(account);
            case "RootPartyIdPositionAccount" -> Optional.of(rootPartyIdPositionAccount);
            case "PositionEffect" -> Optional.of(positionEffect);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "FreeText1" -> Optional.of(freeText1);
            case "FreeText2" -> Optional.of(freeText2);
            case "FreeText3" -> Optional.of(freeText3);
            case "OrderCategory" -> Optional.of(orderCategory);
            case "OrdType" -> Optional.of(ordType);
            case "RelatedProductComplex" -> Optional.of(relatedProductComplex);
            case "OrderSide" -> Optional.of(orderSide);
            case "RootPartyClearingOrganization" -> Optional.of(rootPartyClearingOrganization);
            case "RootPartyExecutingFirm" -> Optional.of(rootPartyExecutingFirm);
            case "RootPartyExecutingTrader" -> Optional.of(rootPartyExecutingTrader);
            case "RootPartyClearingFirm" -> Optional.of(rootPartyClearingFirm);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeBroadcast message)) {
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

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
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
        if (!(other instanceof TradeBroadcast message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
