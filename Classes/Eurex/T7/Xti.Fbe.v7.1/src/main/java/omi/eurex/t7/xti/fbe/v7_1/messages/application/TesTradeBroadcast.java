package omi.eurex.t7.xti.fbe.v7_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v7_1.fields.AccountField;
import omi.eurex.t7.xti.fbe.v7_1.fields.AccruedInteresAmtField;
import omi.eurex.t7.xti.fbe.v7_1.fields.CouponRateField;
import omi.eurex.t7.xti.fbe.v7_1.fields.ExecutingTraderField;
import omi.eurex.t7.xti.fbe.v7_1.fields.ExecutingTraderQualifierField;
import omi.eurex.t7.xti.fbe.v7_1.fields.FreeText1Field;
import omi.eurex.t7.xti.fbe.v7_1.fields.FreeText2Field;
import omi.eurex.t7.xti.fbe.v7_1.fields.FreeText4Field;
import omi.eurex.t7.xti.fbe.v7_1.fields.LastCouponDeviationIndicatorField;
import omi.eurex.t7.xti.fbe.v7_1.fields.LastMktField;
import omi.eurex.t7.xti.fbe.v7_1.fields.LastPxField;
import omi.eurex.t7.xti.fbe.v7_1.fields.LastQtyField;
import omi.eurex.t7.xti.fbe.v7_1.fields.MarketSegmentIdField;
import omi.eurex.t7.xti.fbe.v7_1.fields.NegotiationIdField;
import omi.eurex.t7.xti.fbe.v7_1.fields.NumDaysInterestField;
import omi.eurex.t7.xti.fbe.v7_1.fields.OrderAttributeLiquidityProvisionField;
import omi.eurex.t7.xti.fbe.v7_1.fields.OrigTradeIdField;
import omi.eurex.t7.xti.fbe.v7_1.fields.PackageIdField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RefinancingEligibilityIndicatorField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RegulatoryTradeIdField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyClearingFirmField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyClearingOrganizationField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyContraFirmField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyContraFirmKvNumberField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyContraSettlementAccountField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyContraSettlementFirmField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyContraSettlementLocationField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyExecutingFirmField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyExecutingFirmKvNumberField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyExecutingTraderField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyIdClearingUnitField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyIdClientIdField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyIdContraSettlementUnitField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyIdContraUnitField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyIdExecutingTraderField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyIdExecutingUnitField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyIdExecutionVenueField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyIdInvestmentDecisionMakerField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyIdInvestmentDecisionMakerQualifierField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyIdSessionIdField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartyIdSettlementUnitField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartySettlementAccountField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartySettlementFirmField;
import omi.eurex.t7.xti.fbe.v7_1.fields.RootPartySettlementLocationField;
import omi.eurex.t7.xti.fbe.v7_1.fields.SecurityIdField;
import omi.eurex.t7.xti.fbe.v7_1.fields.SettlCurrAmtField;
import omi.eurex.t7.xti.fbe.v7_1.fields.SettlCurrFxRateField;
import omi.eurex.t7.xti.fbe.v7_1.fields.SettlCurrencyField;
import omi.eurex.t7.xti.fbe.v7_1.fields.SettlDateField;
import omi.eurex.t7.xti.fbe.v7_1.fields.SideField;
import omi.eurex.t7.xti.fbe.v7_1.fields.SideGrossTradeAmtField;
import omi.eurex.t7.xti.fbe.v7_1.fields.SideTradeIdField;
import omi.eurex.t7.xti.fbe.v7_1.fields.SrqsRelatedTradeIdField;
import omi.eurex.t7.xti.fbe.v7_1.fields.TradeDateField;
import omi.eurex.t7.xti.fbe.v7_1.fields.TradeIdField;
import omi.eurex.t7.xti.fbe.v7_1.fields.TradePublishIndicatorField;
import omi.eurex.t7.xti.fbe.v7_1.fields.TradeReportTypeField;
import omi.eurex.t7.xti.fbe.v7_1.fields.TradingCapacityField;
import omi.eurex.t7.xti.fbe.v7_1.fields.TransactTimeField;
import omi.eurex.t7.xti.fbe.v7_1.fields.TransferReasonField;
import omi.eurex.t7.xti.fbe.v7_1.fields.TrdTypeField;
import omi.eurex.t7.xti.fbe.v7_1.structs.RbcHeaderComp;
import omi.eurex.t7.xti.fbe.v7_1.types.Field;
import omi.eurex.t7.xti.fbe.v7_1.types.Message;
import omi.eurex.t7.xti.fbe.v7_1.types.PrintOptions;

/**
 * Represents the TesTradeBroadcast message from the Xti protocol.
 */
public final class TesTradeBroadcast implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 434;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Tes Trade Broadcast";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 2, 27, 7, 432, 2 };

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
     * Transact Time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Settl Curr Amt
     */
    private final SettlCurrAmtField settlCurrAmt = new SettlCurrAmtField();

    /**
     * Side Gross Trade Amt
     */
    private final SideGrossTradeAmtField sideGrossTradeAmt = new SideGrossTradeAmtField();

    /**
     * Settl Curr Fx Rate
     */
    private final SettlCurrFxRateField settlCurrFxRate = new SettlCurrFxRateField();

    /**
     * Accrued Interes Amt
     */
    private final AccruedInteresAmtField accruedInteresAmt = new AccruedInteresAmtField();

    /**
     * Coupon Rate
     */
    private final CouponRateField couponRate = new CouponRateField();

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
     * Root Party Id Settlement Unit
     */
    private final RootPartyIdSettlementUnitField rootPartyIdSettlementUnit = new RootPartyIdSettlementUnitField();

    /**
     * Root Party Id Contra Unit
     */
    private final RootPartyIdContraUnitField rootPartyIdContraUnit = new RootPartyIdContraUnitField();

    /**
     * Root Party Id Contra Settlement Unit
     */
    private final RootPartyIdContraSettlementUnitField rootPartyIdContraSettlementUnit = new RootPartyIdContraSettlementUnitField();

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
     * Settl Date
     */
    private final SettlDateField settlDate = new SettlDateField();

    /**
     * Num Days Interest
     */
    private final NumDaysInterestField numDaysInterest = new NumDaysInterestField();

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
     * Last Mkt
     */
    private final LastMktField lastMkt = new LastMktField();

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
     * Last Coupon Deviation Indicator
     */
    private final LastCouponDeviationIndicatorField lastCouponDeviationIndicator = new LastCouponDeviationIndicatorField();

    /**
     * Refinancing Eligibility Indicator
     */
    private final RefinancingEligibilityIndicatorField refinancingEligibilityIndicator = new RefinancingEligibilityIndicatorField();

    /**
     * Order Attribute Liquidity Provision
     */
    private final OrderAttributeLiquidityProvisionField orderAttributeLiquidityProvision = new OrderAttributeLiquidityProvisionField();

    /**
     * Executing Trader Qualifier
     */
    private final ExecutingTraderQualifierField executingTraderQualifier = new ExecutingTraderQualifierField();

    /**
     * Root Party Id Investment Decision Maker Qualifier
     */
    private final RootPartyIdInvestmentDecisionMakerQualifierField rootPartyIdInvestmentDecisionMakerQualifier = new RootPartyIdInvestmentDecisionMakerQualifierField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

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
     * Settl Currency
     */
    private final SettlCurrencyField settlCurrency = new SettlCurrencyField();

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
     * Root Party Id Execution Venue
     */
    private final RootPartyIdExecutionVenueField rootPartyIdExecutionVenue = new RootPartyIdExecutionVenueField();

    /**
     * Regulatory Trade Id
     */
    private final RegulatoryTradeIdField regulatoryTradeId = new RegulatoryTradeIdField();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(securityId), List.<Field>of(lastPx), List.<Field>of(lastQty), List.<Field>of(transactTime), List.<Field>of(settlCurrAmt), List.<Field>of(sideGrossTradeAmt), List.<Field>of(settlCurrFxRate), List.<Field>of(accruedInteresAmt), List.<Field>of(couponRate), List.<Field>of(rootPartyIdClientId), List.<Field>of(executingTrader), List.<Field>of(rootPartyIdInvestmentDecisionMaker), List.<Field>of(packageId), List.<Field>of(marketSegmentId), List.<Field>of(tradeId), List.<Field>of(tradeDate), List.<Field>of(sideTradeId), List.<Field>of(rootPartyIdSessionId), List.<Field>of(rootPartyIdSettlementUnit), List.<Field>of(rootPartyIdContraUnit), List.<Field>of(rootPartyIdContraSettlementUnit), List.<Field>of(origTradeId), List.<Field>of(rootPartyIdExecutingUnit), List.<Field>of(rootPartyIdExecutingTrader), List.<Field>of(rootPartyIdClearingUnit), List.<Field>of(settlDate), List.<Field>of(numDaysInterest), List.<Field>of(negotiationId), List.<Field>of(srqsRelatedTradeId), List.<Field>of(trdType), List.<Field>of(lastMkt), List.<Field>of(side), List.<Field>of(tradingCapacity), List.<Field>of(tradeReportType), List.<Field>of(transferReason), List.<Field>of(tradePublishIndicator), List.<Field>of(lastCouponDeviationIndicator), List.<Field>of(refinancingEligibilityIndicator), List.<Field>of(orderAttributeLiquidityProvision), List.<Field>of(executingTraderQualifier), List.<Field>of(rootPartyIdInvestmentDecisionMakerQualifier), List.<Field>of(account), List.<Field>of(freeText1), List.<Field>of(freeText2), List.<Field>of(freeText4), List.<Field>of(settlCurrency), List.<Field>of(rootPartyExecutingFirm), List.<Field>of(rootPartyExecutingTrader), List.<Field>of(rootPartyClearingFirm), List.<Field>of(rootPartyClearingOrganization), List.<Field>of(rootPartyExecutingFirmKvNumber), List.<Field>of(rootPartySettlementAccount), List.<Field>of(rootPartySettlementLocation), List.<Field>of(rootPartySettlementFirm), List.<Field>of(rootPartyContraFirm), List.<Field>of(rootPartyContraSettlementFirm), List.<Field>of(rootPartyContraFirmKvNumber), List.<Field>of(rootPartyContraSettlementAccount), List.<Field>of(rootPartyContraSettlementLocation), List.<Field>of(rootPartyIdExecutionVenue), List.<Field>of(regulatoryTradeId)).flatMap(List::stream).toList();

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
     * Transact Time
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
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
     * Side Gross Trade Amt
     *
     * @return the SideGrossTradeAmt field
     */
    public SideGrossTradeAmtField sideGrossTradeAmt() {
        return sideGrossTradeAmt;
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
     * Accrued Interes Amt
     *
     * @return the AccruedInteresAmt field
     */
    public AccruedInteresAmtField accruedInteresAmt() {
        return accruedInteresAmt;
    }

    /**
     * Coupon Rate
     *
     * @return the CouponRate field
     */
    public CouponRateField couponRate() {
        return couponRate;
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
     * Root Party Id Settlement Unit
     *
     * @return the RootPartyIdSettlementUnit field
     */
    public RootPartyIdSettlementUnitField rootPartyIdSettlementUnit() {
        return rootPartyIdSettlementUnit;
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
     * Settl Date
     *
     * @return the SettlDate field
     */
    public SettlDateField settlDate() {
        return settlDate;
    }

    /**
     * Num Days Interest
     *
     * @return the NumDaysInterest field
     */
    public NumDaysInterestField numDaysInterest() {
        return numDaysInterest;
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
     * Last Mkt
     *
     * @return the LastMkt field
     */
    public LastMktField lastMkt() {
        return lastMkt;
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
     * Last Coupon Deviation Indicator
     *
     * @return the LastCouponDeviationIndicator field
     */
    public LastCouponDeviationIndicatorField lastCouponDeviationIndicator() {
        return lastCouponDeviationIndicator;
    }

    /**
     * Refinancing Eligibility Indicator
     *
     * @return the RefinancingEligibilityIndicator field
     */
    public RefinancingEligibilityIndicatorField refinancingEligibilityIndicator() {
        return refinancingEligibilityIndicator;
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
     * Account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
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
     * Settl Currency
     *
     * @return the SettlCurrency field
     */
    public SettlCurrencyField settlCurrency() {
        return settlCurrency;
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 400)) {
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
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!settlCurrAmt.parse(data, cursor)) {
            return false;
        }
        cursor += SettlCurrAmtField.BYTE_LENGTH;
        if (!sideGrossTradeAmt.parse(data, cursor)) {
            return false;
        }
        cursor += SideGrossTradeAmtField.BYTE_LENGTH;
        if (!settlCurrFxRate.parse(data, cursor)) {
            return false;
        }
        cursor += SettlCurrFxRateField.BYTE_LENGTH;
        if (!accruedInteresAmt.parse(data, cursor)) {
            return false;
        }
        cursor += AccruedInteresAmtField.BYTE_LENGTH;
        if (!couponRate.parse(data, cursor)) {
            return false;
        }
        cursor += CouponRateField.BYTE_LENGTH;
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
        if (!rootPartyIdSettlementUnit.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdSettlementUnitField.BYTE_LENGTH;
        if (!rootPartyIdContraUnit.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdContraUnitField.BYTE_LENGTH;
        if (!rootPartyIdContraSettlementUnit.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdContraSettlementUnitField.BYTE_LENGTH;
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
        if (!settlDate.parse(data, cursor)) {
            return false;
        }
        cursor += SettlDateField.BYTE_LENGTH;
        if (!numDaysInterest.parse(data, cursor)) {
            return false;
        }
        cursor += NumDaysInterestField.BYTE_LENGTH;
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
        if (!lastMkt.parse(data, cursor)) {
            return false;
        }
        cursor += LastMktField.BYTE_LENGTH;
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
        if (!lastCouponDeviationIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += LastCouponDeviationIndicatorField.BYTE_LENGTH;
        if (!refinancingEligibilityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += RefinancingEligibilityIndicatorField.BYTE_LENGTH;
        if (!orderAttributeLiquidityProvision.parse(data, cursor)) {
            return false;
        }
        cursor += OrderAttributeLiquidityProvisionField.BYTE_LENGTH;
        if (!executingTraderQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderQualifierField.BYTE_LENGTH;
        if (!rootPartyIdInvestmentDecisionMakerQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdInvestmentDecisionMakerQualifierField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
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
        if (!settlCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += SettlCurrencyField.BYTE_LENGTH;
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
        if (!rootPartyIdExecutionVenue.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdExecutionVenueField.BYTE_LENGTH;
        if (!regulatoryTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += RegulatoryTradeIdField.BYTE_LENGTH;

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
        cursor = lastPx.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = settlCurrAmt.encode(data, cursor);
        cursor = sideGrossTradeAmt.encode(data, cursor);
        cursor = settlCurrFxRate.encode(data, cursor);
        cursor = accruedInteresAmt.encode(data, cursor);
        cursor = couponRate.encode(data, cursor);
        cursor = rootPartyIdClientId.encode(data, cursor);
        cursor = executingTrader.encode(data, cursor);
        cursor = rootPartyIdInvestmentDecisionMaker.encode(data, cursor);
        cursor = packageId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = sideTradeId.encode(data, cursor);
        cursor = rootPartyIdSessionId.encode(data, cursor);
        cursor = rootPartyIdSettlementUnit.encode(data, cursor);
        cursor = rootPartyIdContraUnit.encode(data, cursor);
        cursor = rootPartyIdContraSettlementUnit.encode(data, cursor);
        cursor = origTradeId.encode(data, cursor);
        cursor = rootPartyIdExecutingUnit.encode(data, cursor);
        cursor = rootPartyIdExecutingTrader.encode(data, cursor);
        cursor = rootPartyIdClearingUnit.encode(data, cursor);
        cursor = settlDate.encode(data, cursor);
        cursor = numDaysInterest.encode(data, cursor);
        cursor = negotiationId.encode(data, cursor);
        cursor = srqsRelatedTradeId.encode(data, cursor);
        cursor = trdType.encode(data, cursor);
        cursor = lastMkt.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = tradeReportType.encode(data, cursor);
        cursor = transferReason.encode(data, cursor);
        cursor = tradePublishIndicator.encode(data, cursor);
        cursor = lastCouponDeviationIndicator.encode(data, cursor);
        cursor = refinancingEligibilityIndicator.encode(data, cursor);
        cursor = orderAttributeLiquidityProvision.encode(data, cursor);
        cursor = executingTraderQualifier.encode(data, cursor);
        cursor = rootPartyIdInvestmentDecisionMakerQualifier.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = freeText1.encode(data, cursor);
        cursor = freeText2.encode(data, cursor);
        cursor = freeText4.encode(data, cursor);
        cursor = settlCurrency.encode(data, cursor);
        cursor = rootPartyExecutingFirm.encode(data, cursor);
        cursor = rootPartyExecutingTrader.encode(data, cursor);
        cursor = rootPartyClearingFirm.encode(data, cursor);
        cursor = rootPartyClearingOrganization.encode(data, cursor);
        cursor = rootPartyExecutingFirmKvNumber.encode(data, cursor);
        cursor = rootPartySettlementAccount.encode(data, cursor);
        cursor = rootPartySettlementLocation.encode(data, cursor);
        cursor = rootPartySettlementFirm.encode(data, cursor);
        cursor = rootPartyContraFirm.encode(data, cursor);
        cursor = rootPartyContraSettlementFirm.encode(data, cursor);
        cursor = rootPartyContraFirmKvNumber.encode(data, cursor);
        cursor = rootPartyContraSettlementAccount.encode(data, cursor);
        cursor = rootPartyContraSettlementLocation.encode(data, cursor);
        cursor = rootPartyIdExecutionVenue.encode(data, cursor);
        cursor = regulatoryTradeId.encode(data, cursor);
        if (buffer != null && buffer.length >= 434) {
            System.arraycopy(buffer, 432, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
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
            case "LastPx" -> Optional.of(lastPx);
            case "LastQty" -> Optional.of(lastQty);
            case "TransactTime" -> Optional.of(transactTime);
            case "SettlCurrAmt" -> Optional.of(settlCurrAmt);
            case "SideGrossTradeAmt" -> Optional.of(sideGrossTradeAmt);
            case "SettlCurrFxRate" -> Optional.of(settlCurrFxRate);
            case "AccruedInteresAmt" -> Optional.of(accruedInteresAmt);
            case "CouponRate" -> Optional.of(couponRate);
            case "RootPartyIdClientId" -> Optional.of(rootPartyIdClientId);
            case "ExecutingTrader" -> Optional.of(executingTrader);
            case "RootPartyIdInvestmentDecisionMaker" -> Optional.of(rootPartyIdInvestmentDecisionMaker);
            case "PackageId" -> Optional.of(packageId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "TradeId" -> Optional.of(tradeId);
            case "TradeDate" -> Optional.of(tradeDate);
            case "SideTradeId" -> Optional.of(sideTradeId);
            case "RootPartyIdSessionId" -> Optional.of(rootPartyIdSessionId);
            case "RootPartyIdSettlementUnit" -> Optional.of(rootPartyIdSettlementUnit);
            case "RootPartyIdContraUnit" -> Optional.of(rootPartyIdContraUnit);
            case "RootPartyIdContraSettlementUnit" -> Optional.of(rootPartyIdContraSettlementUnit);
            case "OrigTradeId" -> Optional.of(origTradeId);
            case "RootPartyIdExecutingUnit" -> Optional.of(rootPartyIdExecutingUnit);
            case "RootPartyIdExecutingTrader" -> Optional.of(rootPartyIdExecutingTrader);
            case "RootPartyIdClearingUnit" -> Optional.of(rootPartyIdClearingUnit);
            case "SettlDate" -> Optional.of(settlDate);
            case "NumDaysInterest" -> Optional.of(numDaysInterest);
            case "NegotiationId" -> Optional.of(negotiationId);
            case "SrqsRelatedTradeId" -> Optional.of(srqsRelatedTradeId);
            case "TrdType" -> Optional.of(trdType);
            case "LastMkt" -> Optional.of(lastMkt);
            case "Side" -> Optional.of(side);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "TransferReason" -> Optional.of(transferReason);
            case "TradePublishIndicator" -> Optional.of(tradePublishIndicator);
            case "LastCouponDeviationIndicator" -> Optional.of(lastCouponDeviationIndicator);
            case "RefinancingEligibilityIndicator" -> Optional.of(refinancingEligibilityIndicator);
            case "OrderAttributeLiquidityProvision" -> Optional.of(orderAttributeLiquidityProvision);
            case "ExecutingTraderQualifier" -> Optional.of(executingTraderQualifier);
            case "RootPartyIdInvestmentDecisionMakerQualifier" -> Optional.of(rootPartyIdInvestmentDecisionMakerQualifier);
            case "Account" -> Optional.of(account);
            case "FreeText1" -> Optional.of(freeText1);
            case "FreeText2" -> Optional.of(freeText2);
            case "FreeText4" -> Optional.of(freeText4);
            case "SettlCurrency" -> Optional.of(settlCurrency);
            case "RootPartyExecutingFirm" -> Optional.of(rootPartyExecutingFirm);
            case "RootPartyExecutingTrader" -> Optional.of(rootPartyExecutingTrader);
            case "RootPartyClearingFirm" -> Optional.of(rootPartyClearingFirm);
            case "RootPartyClearingOrganization" -> Optional.of(rootPartyClearingOrganization);
            case "RootPartyExecutingFirmKvNumber" -> Optional.of(rootPartyExecutingFirmKvNumber);
            case "RootPartySettlementAccount" -> Optional.of(rootPartySettlementAccount);
            case "RootPartySettlementLocation" -> Optional.of(rootPartySettlementLocation);
            case "RootPartySettlementFirm" -> Optional.of(rootPartySettlementFirm);
            case "RootPartyContraFirm" -> Optional.of(rootPartyContraFirm);
            case "RootPartyContraSettlementFirm" -> Optional.of(rootPartyContraSettlementFirm);
            case "RootPartyContraFirmKvNumber" -> Optional.of(rootPartyContraFirmKvNumber);
            case "RootPartyContraSettlementAccount" -> Optional.of(rootPartyContraSettlementAccount);
            case "RootPartyContraSettlementLocation" -> Optional.of(rootPartyContraSettlementLocation);
            case "RootPartyIdExecutionVenue" -> Optional.of(rootPartyIdExecutionVenue);
            case "RegulatoryTradeId" -> Optional.of(regulatoryTradeId);
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
        if (!(other instanceof TesTradeBroadcast message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
