package omi.eurex.t7.xti.fbe.v6_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v6_1.fields.AccountField;
import omi.eurex.t7.xti.fbe.v6_1.fields.ClOrdIdField;
import omi.eurex.t7.xti.fbe.v6_1.fields.CumQtyField;
import omi.eurex.t7.xti.fbe.v6_1.fields.CurrencyField;
import omi.eurex.t7.xti.fbe.v6_1.fields.DeliveryTypeField;
import omi.eurex.t7.xti.fbe.v6_1.fields.FreeText1Field;
import omi.eurex.t7.xti.fbe.v6_1.fields.FreeText2Field;
import omi.eurex.t7.xti.fbe.v6_1.fields.FreeText4Field;
import omi.eurex.t7.xti.fbe.v6_1.fields.LastMktField;
import omi.eurex.t7.xti.fbe.v6_1.fields.LastPxField;
import omi.eurex.t7.xti.fbe.v6_1.fields.LastQtyField;
import omi.eurex.t7.xti.fbe.v6_1.fields.LeavesQtyField;
import omi.eurex.t7.xti.fbe.v6_1.fields.MarketSegmentIdField;
import omi.eurex.t7.xti.fbe.v6_1.fields.MatchDateField;
import omi.eurex.t7.xti.fbe.v6_1.fields.MatchSubTypeField;
import omi.eurex.t7.xti.fbe.v6_1.fields.MatchTypeField;
import omi.eurex.t7.xti.fbe.v6_1.fields.OrdTypeField;
import omi.eurex.t7.xti.fbe.v6_1.fields.OrderCategoryField;
import omi.eurex.t7.xti.fbe.v6_1.fields.OrderIdField;
import omi.eurex.t7.xti.fbe.v6_1.fields.OrderIdSfxField;
import omi.eurex.t7.xti.fbe.v6_1.fields.OrigTradeIdField;
import omi.eurex.t7.xti.fbe.v6_1.fields.PriceField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartyClearingFirmField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartyContraFirmField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartyContraFirmKvNumberField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartyContraSettlementAccountField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartyContraSettlementFirmField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartyContraSettlementLocationField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartyExecutingFirmField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartyExecutingFirmKvNumberField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartyExecutingTraderField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartyIdClearingUnitField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartyIdContraSettlementUnitField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartyIdContraUnitField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartyIdExecutingTraderField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartyIdExecutingUnitField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartyIdSessionIdField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartyIdSettlementUnitField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartySettlementAccountField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartySettlementFirmField;
import omi.eurex.t7.xti.fbe.v6_1.fields.RootPartySettlementLocationField;
import omi.eurex.t7.xti.fbe.v6_1.fields.SecurityIdField;
import omi.eurex.t7.xti.fbe.v6_1.fields.SettlCurrAmtField;
import omi.eurex.t7.xti.fbe.v6_1.fields.SettlCurrFxRateField;
import omi.eurex.t7.xti.fbe.v6_1.fields.SettlCurrencyField;
import omi.eurex.t7.xti.fbe.v6_1.fields.SettlDateField;
import omi.eurex.t7.xti.fbe.v6_1.fields.SideField;
import omi.eurex.t7.xti.fbe.v6_1.fields.SideLiquidityIndField;
import omi.eurex.t7.xti.fbe.v6_1.fields.SideTradeIdField;
import omi.eurex.t7.xti.fbe.v6_1.fields.SideTradeReportIdField;
import omi.eurex.t7.xti.fbe.v6_1.fields.TradeIdField;
import omi.eurex.t7.xti.fbe.v6_1.fields.TradeNumberField;
import omi.eurex.t7.xti.fbe.v6_1.fields.TradeReportTypeField;
import omi.eurex.t7.xti.fbe.v6_1.fields.TradingCapacityField;
import omi.eurex.t7.xti.fbe.v6_1.fields.TransactTimeField;
import omi.eurex.t7.xti.fbe.v6_1.fields.TransferReasonField;
import omi.eurex.t7.xti.fbe.v6_1.fields.TrdMatchIdField;
import omi.eurex.t7.xti.fbe.v6_1.structs.RbcHeaderComp;
import omi.eurex.t7.xti.fbe.v6_1.types.Field;
import omi.eurex.t7.xti.fbe.v6_1.types.Message;
import omi.eurex.t7.xti.fbe.v6_1.types.PrintOptions;

/**
 * Represents the TradeBroadcast message from the Xti protocol.
 */
public final class TradeBroadcast implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 354;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Broadcast";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 2, 27, 7, 353, 1 };

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Settl Curr Amt
     */
    private final SettlCurrAmtField settlCurrAmt = new SettlCurrAmtField();

    /**
     * Settl Curr Fx Rate
     */
    private final SettlCurrFxRateField settlCurrFxRate = new SettlCurrFxRateField();

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
     * Root Party Id Settlement Unit
     */
    private final RootPartyIdSettlementUnitField rootPartyIdSettlementUnit = new RootPartyIdSettlementUnitField();

    /**
     * Root Party Id Clearing Unit
     */
    private final RootPartyIdClearingUnitField rootPartyIdClearingUnit = new RootPartyIdClearingUnitField();

    /**
     * Root Party Id Contra Unit
     */
    private final RootPartyIdContraUnitField rootPartyIdContraUnit = new RootPartyIdContraUnitField();

    /**
     * Root Party Id Contra Settlement Unit
     */
    private final RootPartyIdContraSettlementUnitField rootPartyIdContraSettlementUnit = new RootPartyIdContraSettlementUnitField();

    /**
     * Order Id Sfx
     */
    private final OrderIdSfxField orderIdSfx = new OrderIdSfxField();

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
     * Last Qty
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Side Trade Id
     */
    private final SideTradeIdField sideTradeId = new SideTradeIdField();

    /**
     * Side Trade Report Id
     */
    private final SideTradeReportIdField sideTradeReportId = new SideTradeReportIdField();

    /**
     * Trade Number
     */
    private final TradeNumberField tradeNumber = new TradeNumberField();

    /**
     * Match Date
     */
    private final MatchDateField matchDate = new MatchDateField();

    /**
     * Settl Date
     */
    private final SettlDateField settlDate = new SettlDateField();

    /**
     * Trd Match Id
     */
    private final TrdMatchIdField trdMatchId = new TrdMatchIdField();

    /**
     * Last Mkt
     */
    private final LastMktField lastMkt = new LastMktField();

    /**
     * Trade Report Type
     */
    private final TradeReportTypeField tradeReportType = new TradeReportTypeField();

    /**
     * Transfer Reason
     */
    private final TransferReasonField transferReason = new TransferReasonField();

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
     * Delivery Type
     */
    private final DeliveryTypeField deliveryType = new DeliveryTypeField();

    /**
     * Trading Capacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Settl Currency
     */
    private final SettlCurrencyField settlCurrency = new SettlCurrencyField();

    /**
     * Currency
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Free Text 1
     */
    private final FreeText1Field freeText1 = new FreeText1Field();

    /**
     * Free Text 2
     */
    private final FreeText2Field freeText2 = new FreeText2Field();

    /**
     * Free Text 4
     */
    private final FreeText4Field freeText4 = new FreeText4Field();

    /**
     * Order Category
     */
    private final OrderCategoryField orderCategory = new OrderCategoryField();

    /**
     * Ord Type
     */
    private final OrdTypeField ordType = new OrdTypeField();

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
     * Root Party Executing Firm Kv Number
     */
    private final RootPartyExecutingFirmKvNumberField rootPartyExecutingFirmKvNumber = new RootPartyExecutingFirmKvNumberField();

    /**
     * Root Party Settlement Account
     */
    private final RootPartySettlementAccountField rootPartySettlementAccount = new RootPartySettlementAccountField();

    /**
     * Root Party Settlement Location
     */
    private final RootPartySettlementLocationField rootPartySettlementLocation = new RootPartySettlementLocationField();

    /**
     * Root Party Settlement Firm
     */
    private final RootPartySettlementFirmField rootPartySettlementFirm = new RootPartySettlementFirmField();

    /**
     * Root Party Contra Firm
     */
    private final RootPartyContraFirmField rootPartyContraFirm = new RootPartyContraFirmField();

    /**
     * Root Party Contra Settlement Firm
     */
    private final RootPartyContraSettlementFirmField rootPartyContraSettlementFirm = new RootPartyContraSettlementFirmField();

    /**
     * Root Party Contra Firm Kv Number
     */
    private final RootPartyContraFirmKvNumberField rootPartyContraFirmKvNumber = new RootPartyContraFirmKvNumberField();

    /**
     * Root Party Contra Settlement Account
     */
    private final RootPartyContraSettlementAccountField rootPartyContraSettlementAccount = new RootPartyContraSettlementAccountField();

    /**
     * Root Party Contra Settlement Location
     */
    private final RootPartyContraSettlementLocationField rootPartyContraSettlementLocation = new RootPartyContraSettlementLocationField();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(securityId), List.<Field>of(price), List.<Field>of(lastPx), List.<Field>of(settlCurrAmt), List.<Field>of(settlCurrFxRate), List.<Field>of(transactTime), List.<Field>of(orderId), List.<Field>of(clOrdId), List.<Field>of(tradeId), List.<Field>of(origTradeId), List.<Field>of(rootPartyIdExecutingUnit), List.<Field>of(rootPartyIdSessionId), List.<Field>of(rootPartyIdExecutingTrader), List.<Field>of(rootPartyIdSettlementUnit), List.<Field>of(rootPartyIdClearingUnit), List.<Field>of(rootPartyIdContraUnit), List.<Field>of(rootPartyIdContraSettlementUnit), List.<Field>of(orderIdSfx), List.<Field>of(cumQty), List.<Field>of(leavesQty), List.<Field>of(marketSegmentId), List.<Field>of(lastQty), List.<Field>of(sideTradeId), List.<Field>of(sideTradeReportId), List.<Field>of(tradeNumber), List.<Field>of(matchDate), List.<Field>of(settlDate), List.<Field>of(trdMatchId), List.<Field>of(lastMkt), List.<Field>of(tradeReportType), List.<Field>of(transferReason), List.<Field>of(matchType), List.<Field>of(matchSubType), List.<Field>of(side), List.<Field>of(sideLiquidityInd), List.<Field>of(deliveryType), List.<Field>of(tradingCapacity), List.<Field>of(account), List.<Field>of(settlCurrency), List.<Field>of(currency), List.<Field>of(freeText1), List.<Field>of(freeText2), List.<Field>of(freeText4), List.<Field>of(orderCategory), List.<Field>of(ordType), List.<Field>of(rootPartyExecutingFirm), List.<Field>of(rootPartyExecutingTrader), List.<Field>of(rootPartyClearingFirm), List.<Field>of(rootPartyExecutingFirmKvNumber), List.<Field>of(rootPartySettlementAccount), List.<Field>of(rootPartySettlementLocation), List.<Field>of(rootPartySettlementFirm), List.<Field>of(rootPartyContraFirm), List.<Field>of(rootPartyContraSettlementFirm), List.<Field>of(rootPartyContraFirmKvNumber), List.<Field>of(rootPartyContraSettlementAccount), List.<Field>of(rootPartyContraSettlementLocation)).flatMap(List::stream).toList();

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
     * Settl Curr Amt
     *
     * @return the SettlCurrAmt field
     */
    public SettlCurrAmtField settlCurrAmt() {
        return settlCurrAmt;
    }

    /**
     * Settl Curr Fx Rate
     *
     * @return the SettlCurrFxRate field
     */
    public SettlCurrFxRateField settlCurrFxRate() {
        return settlCurrFxRate;
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
     * Root Party Id Settlement Unit
     *
     * @return the RootPartyIdSettlementUnit field
     */
    public RootPartyIdSettlementUnitField rootPartyIdSettlementUnit() {
        return rootPartyIdSettlementUnit;
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
     * Root Party Id Contra Unit
     *
     * @return the RootPartyIdContraUnit field
     */
    public RootPartyIdContraUnitField rootPartyIdContraUnit() {
        return rootPartyIdContraUnit;
    }

    /**
     * Root Party Id Contra Settlement Unit
     *
     * @return the RootPartyIdContraSettlementUnit field
     */
    public RootPartyIdContraSettlementUnitField rootPartyIdContraSettlementUnit() {
        return rootPartyIdContraSettlementUnit;
    }

    /**
     * Order Id Sfx
     *
     * @return the OrderIdSfx field
     */
    public OrderIdSfxField orderIdSfx() {
        return orderIdSfx;
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
     * Last Qty
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
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
     * Side Trade Report Id
     *
     * @return the SideTradeReportId field
     */
    public SideTradeReportIdField sideTradeReportId() {
        return sideTradeReportId;
    }

    /**
     * Trade Number
     *
     * @return the TradeNumber field
     */
    public TradeNumberField tradeNumber() {
        return tradeNumber;
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
     * Settl Date
     *
     * @return the SettlDate field
     */
    public SettlDateField settlDate() {
        return settlDate;
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
     * Last Mkt
     *
     * @return the LastMkt field
     */
    public LastMktField lastMkt() {
        return lastMkt;
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
     * Delivery Type
     *
     * @return the DeliveryType field
     */
    public DeliveryTypeField deliveryType() {
        return deliveryType;
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
     * Settl Currency
     *
     * @return the SettlCurrency field
     */
    public SettlCurrencyField settlCurrency() {
        return settlCurrency;
    }

    /**
     * Currency
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
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
     * Free Text 4
     *
     * @return the FreeText4 field
     */
    public FreeText4Field freeText4() {
        return freeText4;
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
     * Root Party Executing Firm Kv Number
     *
     * @return the RootPartyExecutingFirmKvNumber field
     */
    public RootPartyExecutingFirmKvNumberField rootPartyExecutingFirmKvNumber() {
        return rootPartyExecutingFirmKvNumber;
    }

    /**
     * Root Party Settlement Account
     *
     * @return the RootPartySettlementAccount field
     */
    public RootPartySettlementAccountField rootPartySettlementAccount() {
        return rootPartySettlementAccount;
    }

    /**
     * Root Party Settlement Location
     *
     * @return the RootPartySettlementLocation field
     */
    public RootPartySettlementLocationField rootPartySettlementLocation() {
        return rootPartySettlementLocation;
    }

    /**
     * Root Party Settlement Firm
     *
     * @return the RootPartySettlementFirm field
     */
    public RootPartySettlementFirmField rootPartySettlementFirm() {
        return rootPartySettlementFirm;
    }

    /**
     * Root Party Contra Firm
     *
     * @return the RootPartyContraFirm field
     */
    public RootPartyContraFirmField rootPartyContraFirm() {
        return rootPartyContraFirm;
    }

    /**
     * Root Party Contra Settlement Firm
     *
     * @return the RootPartyContraSettlementFirm field
     */
    public RootPartyContraSettlementFirmField rootPartyContraSettlementFirm() {
        return rootPartyContraSettlementFirm;
    }

    /**
     * Root Party Contra Firm Kv Number
     *
     * @return the RootPartyContraFirmKvNumber field
     */
    public RootPartyContraFirmKvNumberField rootPartyContraFirmKvNumber() {
        return rootPartyContraFirmKvNumber;
    }

    /**
     * Root Party Contra Settlement Account
     *
     * @return the RootPartyContraSettlementAccount field
     */
    public RootPartyContraSettlementAccountField rootPartyContraSettlementAccount() {
        return rootPartyContraSettlementAccount;
    }

    /**
     * Root Party Contra Settlement Location
     *
     * @return the RootPartyContraSettlementLocation field
     */
    public RootPartyContraSettlementLocationField rootPartyContraSettlementLocation() {
        return rootPartyContraSettlementLocation;
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 320)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!settlCurrAmt.parse(data, cursor)) {
            return false;
        }
        cursor += SettlCurrAmtField.BYTE_LENGTH;
        if (!settlCurrFxRate.parse(data, cursor)) {
            return false;
        }
        cursor += SettlCurrFxRateField.BYTE_LENGTH;
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
        if (!rootPartyIdSettlementUnit.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdSettlementUnitField.BYTE_LENGTH;
        if (!rootPartyIdClearingUnit.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdClearingUnitField.BYTE_LENGTH;
        if (!rootPartyIdContraUnit.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdContraUnitField.BYTE_LENGTH;
        if (!rootPartyIdContraSettlementUnit.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdContraSettlementUnitField.BYTE_LENGTH;
        if (!orderIdSfx.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdSfxField.BYTE_LENGTH;
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
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!sideTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += SideTradeIdField.BYTE_LENGTH;
        if (!sideTradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += SideTradeReportIdField.BYTE_LENGTH;
        if (!tradeNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TradeNumberField.BYTE_LENGTH;
        if (!matchDate.parse(data, cursor)) {
            return false;
        }
        cursor += MatchDateField.BYTE_LENGTH;
        if (!settlDate.parse(data, cursor)) {
            return false;
        }
        cursor += SettlDateField.BYTE_LENGTH;
        if (!trdMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += TrdMatchIdField.BYTE_LENGTH;
        if (!lastMkt.parse(data, cursor)) {
            return false;
        }
        cursor += LastMktField.BYTE_LENGTH;
        if (!tradeReportType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportTypeField.BYTE_LENGTH;
        if (!transferReason.parse(data, cursor)) {
            return false;
        }
        cursor += TransferReasonField.BYTE_LENGTH;
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
        if (!deliveryType.parse(data, cursor)) {
            return false;
        }
        cursor += DeliveryTypeField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!settlCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += SettlCurrencyField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!freeText1.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText1Field.BYTE_LENGTH;
        if (!freeText2.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText2Field.BYTE_LENGTH;
        if (!freeText4.parse(data, cursor)) {
            return false;
        }
        cursor += FreeText4Field.BYTE_LENGTH;
        if (!orderCategory.parse(data, cursor)) {
            return false;
        }
        cursor += OrderCategoryField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
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
        if (!rootPartyExecutingFirmKvNumber.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyExecutingFirmKvNumberField.BYTE_LENGTH;
        if (!rootPartySettlementAccount.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartySettlementAccountField.BYTE_LENGTH;
        if (!rootPartySettlementLocation.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartySettlementLocationField.BYTE_LENGTH;
        if (!rootPartySettlementFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartySettlementFirmField.BYTE_LENGTH;
        if (!rootPartyContraFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyContraFirmField.BYTE_LENGTH;
        if (!rootPartyContraSettlementFirm.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyContraSettlementFirmField.BYTE_LENGTH;
        if (!rootPartyContraFirmKvNumber.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyContraFirmKvNumberField.BYTE_LENGTH;
        if (!rootPartyContraSettlementAccount.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyContraSettlementAccountField.BYTE_LENGTH;
        if (!rootPartyContraSettlementLocation.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyContraSettlementLocationField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = settlCurrAmt.encode(data, cursor);
        cursor = settlCurrFxRate.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = origTradeId.encode(data, cursor);
        cursor = rootPartyIdExecutingUnit.encode(data, cursor);
        cursor = rootPartyIdSessionId.encode(data, cursor);
        cursor = rootPartyIdExecutingTrader.encode(data, cursor);
        cursor = rootPartyIdSettlementUnit.encode(data, cursor);
        cursor = rootPartyIdClearingUnit.encode(data, cursor);
        cursor = rootPartyIdContraUnit.encode(data, cursor);
        cursor = rootPartyIdContraSettlementUnit.encode(data, cursor);
        cursor = orderIdSfx.encode(data, cursor);
        cursor = cumQty.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = sideTradeId.encode(data, cursor);
        cursor = sideTradeReportId.encode(data, cursor);
        cursor = tradeNumber.encode(data, cursor);
        cursor = matchDate.encode(data, cursor);
        cursor = settlDate.encode(data, cursor);
        cursor = trdMatchId.encode(data, cursor);
        cursor = lastMkt.encode(data, cursor);
        cursor = tradeReportType.encode(data, cursor);
        cursor = transferReason.encode(data, cursor);
        cursor = matchType.encode(data, cursor);
        cursor = matchSubType.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = sideLiquidityInd.encode(data, cursor);
        cursor = deliveryType.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = settlCurrency.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText2.encode(data, cursor);
        cursor = freeText4.encode(data, cursor);
        cursor = orderCategory.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = rootPartyExecutingFirm.encode(data, cursor);
        cursor = rootPartyExecutingTrader.encode(data, cursor);
        cursor = rootPartyClearingFirm.encode(data, cursor);
        cursor = rootPartyExecutingFirmKvNumber.encode(data, cursor);
        cursor = rootPartySettlementAccount.encode(data, cursor);
        cursor = rootPartySettlementLocation.encode(data, cursor);
        cursor = rootPartySettlementFirm.encode(data, cursor);
        cursor = rootPartyContraFirm.encode(data, cursor);
        cursor = rootPartyContraSettlementFirm.encode(data, cursor);
        cursor = rootPartyContraFirmKvNumber.encode(data, cursor);
        cursor = rootPartyContraSettlementAccount.encode(data, cursor);
        cursor = rootPartyContraSettlementLocation.encode(data, cursor);
        if (buffer != null && buffer.length >= 354) {
            System.arraycopy(buffer, 353, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
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
            case "Price" -> Optional.of(price);
            case "LastPx" -> Optional.of(lastPx);
            case "SettlCurrAmt" -> Optional.of(settlCurrAmt);
            case "SettlCurrFxRate" -> Optional.of(settlCurrFxRate);
            case "TransactTime" -> Optional.of(transactTime);
            case "OrderId" -> Optional.of(orderId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "TradeId" -> Optional.of(tradeId);
            case "OrigTradeId" -> Optional.of(origTradeId);
            case "RootPartyIdExecutingUnit" -> Optional.of(rootPartyIdExecutingUnit);
            case "RootPartyIdSessionId" -> Optional.of(rootPartyIdSessionId);
            case "RootPartyIdExecutingTrader" -> Optional.of(rootPartyIdExecutingTrader);
            case "RootPartyIdSettlementUnit" -> Optional.of(rootPartyIdSettlementUnit);
            case "RootPartyIdClearingUnit" -> Optional.of(rootPartyIdClearingUnit);
            case "RootPartyIdContraUnit" -> Optional.of(rootPartyIdContraUnit);
            case "RootPartyIdContraSettlementUnit" -> Optional.of(rootPartyIdContraSettlementUnit);
            case "OrderIdSfx" -> Optional.of(orderIdSfx);
            case "CumQty" -> Optional.of(cumQty);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "LastQty" -> Optional.of(lastQty);
            case "SideTradeId" -> Optional.of(sideTradeId);
            case "SideTradeReportId" -> Optional.of(sideTradeReportId);
            case "TradeNumber" -> Optional.of(tradeNumber);
            case "MatchDate" -> Optional.of(matchDate);
            case "SettlDate" -> Optional.of(settlDate);
            case "TrdMatchId" -> Optional.of(trdMatchId);
            case "LastMkt" -> Optional.of(lastMkt);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "TransferReason" -> Optional.of(transferReason);
            case "MatchType" -> Optional.of(matchType);
            case "MatchSubType" -> Optional.of(matchSubType);
            case "Side" -> Optional.of(side);
            case "SideLiquidityInd" -> Optional.of(sideLiquidityInd);
            case "DeliveryType" -> Optional.of(deliveryType);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "Account" -> Optional.of(account);
            case "SettlCurrency" -> Optional.of(settlCurrency);
            case "Currency" -> Optional.of(currency);
            case "FreeText1" -> Optional.of(freeText1);
            case "FreeText2" -> Optional.of(freeText2);
            case "FreeText4" -> Optional.of(freeText4);
            case "OrderCategory" -> Optional.of(orderCategory);
            case "OrdType" -> Optional.of(ordType);
            case "RootPartyExecutingFirm" -> Optional.of(rootPartyExecutingFirm);
            case "RootPartyExecutingTrader" -> Optional.of(rootPartyExecutingTrader);
            case "RootPartyClearingFirm" -> Optional.of(rootPartyClearingFirm);
            case "RootPartyExecutingFirmKvNumber" -> Optional.of(rootPartyExecutingFirmKvNumber);
            case "RootPartySettlementAccount" -> Optional.of(rootPartySettlementAccount);
            case "RootPartySettlementLocation" -> Optional.of(rootPartySettlementLocation);
            case "RootPartySettlementFirm" -> Optional.of(rootPartySettlementFirm);
            case "RootPartyContraFirm" -> Optional.of(rootPartyContraFirm);
            case "RootPartyContraSettlementFirm" -> Optional.of(rootPartyContraSettlementFirm);
            case "RootPartyContraFirmKvNumber" -> Optional.of(rootPartyContraFirmKvNumber);
            case "RootPartyContraSettlementAccount" -> Optional.of(rootPartyContraSettlementAccount);
            case "RootPartyContraSettlementLocation" -> Optional.of(rootPartyContraSettlementLocation);
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
