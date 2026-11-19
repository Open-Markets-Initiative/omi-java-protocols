package omi.bme.bmeequities.replay.bmegate.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.AdmissionRequestedByIssuerField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.AdntField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.AdtField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.AutomaticExpirationField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.AverageQuarterlyTurnoverField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.Barrier2Field;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.BarrierField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.BarrierReturnField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.BaseProductField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.CfiCodeField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.CommodityDerivativeIndicatorField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.ContractMultiplierField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.CpRegTypeField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.CurrencyField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.DoubleVolumeCapReachedField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.EffectiveAmountFiltersRoutedOrdersField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.ExerciseStyleField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.FeeTypeField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.FirstTradingDateField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.FisnField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.FurtherSubProductField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.InvestmentFundCategoryField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.InvestmentFundClassField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.InvestmentFundCutOffTimeField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.InvestmentFundDepositoryField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.InvestmentFundManagementCompanyField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.InvestmentFundManagerField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.InvestmentFundMinimumMaintenanceAmountField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.InvestmentFundMinimumSubscriptionAmountField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.InvestmentFundNumberOfDecimalsField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.IssueDateField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.IssuerField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.IssuerLeiField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.LastAdmissionDateField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.LastTradingDayField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.LiSpostField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.LiSpreField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.LiquidInstrumentField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.MarketIdField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.MarketSegmentIdField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.MasterFundNameField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.MaturityDateField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.MaturityMonthYearField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.MinTradeVolField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.MinimumAuthorizedSharesField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.MinimumCapitalField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.MinimumDisplayQtyField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.ModalityMaskBField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.NavCommunicationTermField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.NetAssetValueIdentifierField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.NetAssetValueIndicatorField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.NtPositionLimitField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.NumberOfDecimalsField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.NumberOfHoldersField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.OrderNumberOfDecimalsField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.OutstandingCapitalField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.OutstandingSharesField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.PositionLimitField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.PriceTickRuleField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.PutOrCallField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.ReferenceTradingVenueField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.RetailServiceFlagField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.RoundLotField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.SecurityCodeField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.SecurityDescriptionField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.SecurityGroupField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.SecurityNameField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.SecurityStatusField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.SecuritySubTypeField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.SecurityTypeField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.SelfMatchPreventionField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.SequenceNumberField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.SettlementSystemField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.SicavCounterpartyMemberField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.SstIpostField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.SstIpreField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.StrikePriceField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.StrikeValueField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.SubProductField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.SymbolField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.SymbolIsinField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.TradingObligationField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.TradingScopeField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.TriggerBarrierField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.TriggerUpperBarrierField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.UnderlyingCurrencyField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.UnderlyingIsinField;
import omi.bme.bmeequities.replay.bmegate.v1_6.fields.UnderlyingSymbolField;
import omi.bme.bmeequities.replay.bmegate.v1_6.types.Field;
import omi.bme.bmeequities.replay.bmegate.v1_6.types.Message;
import omi.bme.bmeequities.replay.bmegate.v1_6.types.PrintOptions;

/**
 * Represents the SecurityListMessage message from the Replay protocol.
 *
 * <p>Message sent by the server to provide the definition of one security. It shares the same layout as the Security List Update Report message, but with a different Message Type</p>
 */
public final class SecurityListMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 976;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security List Message";

    /**
     * Message sequence number
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Operating MIC Code
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * Segment MIC Code
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Instrument (or Book) code
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Instrument ISIN
     */
    private final SymbolIsinField symbolIsin = new SymbolIsinField();

    /**
     * FISN
     */
    private final FisnField fisn = new FisnField();

    /**
     * Issuer LEI
     */
    private final IssuerLeiField issuerLei = new IssuerLeiField();

    /**
     * Security group
     */
    private final SecurityGroupField securityGroup = new SecurityGroupField();

    /**
     * CFICode
     */
    private final CfiCodeField cfiCode = new CfiCodeField();

    /**
     * Security type
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * Expiration date
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Date security issued
     */
    private final IssueDateField issueDate = new IssueDateField();

    /**
     * Conversion factor between price units and monetary units
     */
    private final ContractMultiplierField contractMultiplier = new ContractMultiplierField();

    /**
     * LIS pretransparency threshold
     */
    private final LiSpreField liSpre = new LiSpreField();

    /**
     * SSTI pretransparency threshold
     */
    private final SstIpreField sstIpre = new SstIpreField();

    /**
     * LIS posttransparency threshold
     */
    private final LiSpostField liSpost = new LiSpostField();

    /**
     * SSTI posttransparency threshold
     */
    private final SstIpostField sstIpost = new SstIpostField();

    /**
     * Liquid Instrument
     */
    private final LiquidInstrumentField liquidInstrument = new LiquidInstrumentField();

    /**
     * Security request for admission to trading by the issuer
     */
    private final AdmissionRequestedByIssuerField admissionRequestedByIssuer = new AdmissionRequestedByIssuerField();

    /**
     * Minimum Tradeable Volume
     */
    private final MinTradeVolField minTradeVol = new MinTradeVolField();

    /**
     * Lot Size
     */
    private final RoundLotField roundLot = new RoundLotField();

    /**
     * Currency code
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Modality mask ∑ 2^(ModalityCode - 100) ModalityCode valid values are the TradingSessionID values listed in Table 25 - TradingSessionID in “BMEGate Codification Tables”
     */
    private final ModalityMaskBField modalityMaskB = new ModalityMaskBField();

    /**
     * Security Description
     */
    private final SecurityDescriptionField securityDescription = new SecurityDescriptionField();

    /**
     * Trading obligation. Indicates whether the security has to be traded in a regulated exchange
     */
    private final TradingObligationField tradingObligation = new TradingObligationField();

    /**
     * Security Name
     */
    private final SecurityNameField securityName = new SecurityNameField();

    /**
     * Net Asset Value Identifier
     */
    private final NetAssetValueIdentifierField netAssetValueIdentifier = new NetAssetValueIdentifierField();

    /**
     * Subtype
     */
    private final SecuritySubTypeField securitySubType = new SecuritySubTypeField();

    /**
     * Maturity
     */
    private final MaturityMonthYearField maturityMonthYear = new MaturityMonthYearField();

    /**
     * Security Status
     */
    private final SecurityStatusField securityStatus = new SecurityStatusField();

    /**
     * Exercise price. Only present for warrants
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Trading Unit. Number of shares for each security
     */
    private final StrikeValueField strikeValue = new StrikeValueField();

    /**
     * Exercise style
     */
    private final ExerciseStyleField exerciseStyle = new ExerciseStyleField();

    /**
     * Indicates whether the contract is a put or a call
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Capital of listed securities
     */
    private final PositionLimitField positionLimit = new PositionLimitField();

    /**
     * Volume of listed securities (Near Term Position Limit)
     */
    private final NtPositionLimitField ntPositionLimit = new NtPositionLimitField();

    /**
     * Issuer
     */
    private final IssuerField issuer = new IssuerField();

    /**
     * Indicates if it is an institutional security or not
     */
    private final CpRegTypeField cpRegType = new CpRegTypeField();

    /**
     * Barrier
     */
    private final BarrierField barrier = new BarrierField();

    /**
     * Last Trading Day
     */
    private final LastTradingDayField lastTradingDay = new LastTradingDayField();

    /**
     * Automatic Expiration
     */
    private final AutomaticExpirationField automaticExpiration = new AutomaticExpirationField();

    /**
     * Fee Type
     */
    private final FeeTypeField feeType = new FeeTypeField();

    /**
     * Second Barrier
     */
    private final Barrier2Field barrier2 = new Barrier2Field();

    /**
     * Trigger Lower Barrier
     */
    private final TriggerBarrierField triggerBarrier = new TriggerBarrierField();

    /**
     * Trigger Upper Barrier
     */
    private final TriggerUpperBarrierField triggerUpperBarrier = new TriggerUpperBarrierField();

    /**
     * Average Quarterly Turnover
     */
    private final AverageQuarterlyTurnoverField averageQuarterlyTurnover = new AverageQuarterlyTurnoverField();

    /**
     * Trading Scope
     */
    private final TradingScopeField tradingScope = new TradingScopeField();

    /**
     * SICAV/Fund Counterparty Member
     */
    private final SicavCounterpartyMemberField sicavCounterpartyMember = new SicavCounterpartyMemberField();

    /**
     * Net Asset Value Indicator
     */
    private final NetAssetValueIndicatorField netAssetValueIndicator = new NetAssetValueIndicatorField();

    /**
     * Reference Trading Venue
     */
    private final ReferenceTradingVenueField referenceTradingVenue = new ReferenceTradingVenueField();

    /**
     * Outstanding Capital
     */
    private final OutstandingCapitalField outstandingCapital = new OutstandingCapitalField();

    /**
     * First Trading Date
     */
    private final FirstTradingDateField firstTradingDate = new FirstTradingDateField();

    /**
     * Settlement System
     */
    private final SettlementSystemField settlementSystem = new SettlementSystemField();

    /**
     * Number of Decimals
     */
    private final NumberOfDecimalsField numberOfDecimals = new NumberOfDecimalsField();

    /**
     * Number of Holders
     */
    private final NumberOfHoldersField numberOfHolders = new NumberOfHoldersField();

    /**
     * Outstanding Number of Shares
     */
    private final OutstandingSharesField outstandingShares = new OutstandingSharesField();

    /**
     * Minimum Authorized Shares
     */
    private final MinimumAuthorizedSharesField minimumAuthorizedShares = new MinimumAuthorizedSharesField();

    /**
     * Minimum Capital
     */
    private final MinimumCapitalField minimumCapital = new MinimumCapitalField();

    /**
     * Last Trading Date
     */
    private final LastAdmissionDateField lastAdmissionDate = new LastAdmissionDateField();

    /**
     * Barrier Return
     */
    private final BarrierReturnField barrierReturn = new BarrierReturnField();

    /**
     * Investment Fund Manager Denomination
     */
    private final InvestmentFundManagerField investmentFundManager = new InvestmentFundManagerField();

    /**
     * Effective amount for filters for routed orders
     */
    private final EffectiveAmountFiltersRoutedOrdersField effectiveAmountFiltersRoutedOrders = new EffectiveAmountFiltersRoutedOrdersField();

    /**
     * Number of Decimals in Order Entry
     */
    private final OrderNumberOfDecimalsField orderNumberOfDecimals = new OrderNumberOfDecimalsField();

    /**
     * Investment Fund Class
     */
    private final InvestmentFundClassField investmentFundClass = new InvestmentFundClassField();

    /**
     * Master Fund Name
     */
    private final MasterFundNameField masterFundName = new MasterFundNameField();

    /**
     * Investment Fund Management Company Name
     */
    private final InvestmentFundManagementCompanyField investmentFundManagementCompany = new InvestmentFundManagementCompanyField();

    /**
     * Investment Fund Depository Entity Name
     */
    private final InvestmentFundDepositoryField investmentFundDepository = new InvestmentFundDepositoryField();

    /**
     * Investment Fund Category
     */
    private final InvestmentFundCategoryField investmentFundCategory = new InvestmentFundCategoryField();

    /**
     * Investment Fund Minimum Subscription Amount
     */
    private final InvestmentFundMinimumSubscriptionAmountField investmentFundMinimumSubscriptionAmount = new InvestmentFundMinimumSubscriptionAmountField();

    /**
     * Investment Fund Minimum Maintenance Amount
     */
    private final InvestmentFundMinimumMaintenanceAmountField investmentFundMinimumMaintenanceAmount = new InvestmentFundMinimumMaintenanceAmountField();

    /**
     * Investment Fund Cut Off Time
     */
    private final InvestmentFundCutOffTimeField investmentFundCutOffTime = new InvestmentFundCutOffTimeField();

    /**
     * Net Asset Value Communication Term
     */
    private final NavCommunicationTermField navCommunicationTerm = new NavCommunicationTermField();

    /**
     * Investment Fund Number of Decimals
     */
    private final InvestmentFundNumberOfDecimalsField investmentFundNumberOfDecimals = new InvestmentFundNumberOfDecimalsField();

    /**
     * Commodity Derivative Indicator
     */
    private final CommodityDerivativeIndicatorField commodityDerivativeIndicator = new CommodityDerivativeIndicatorField();

    /**
     * Double Volume Cap Reached
     */
    private final DoubleVolumeCapReachedField doubleVolumeCapReached = new DoubleVolumeCapReachedField();

    /**
     * Average Daily Turnover
     */
    private final AdtField adt = new AdtField();

    /**
     * Base Product
     */
    private final BaseProductField baseProduct = new BaseProductField();

    /**
     * SubProduct
     */
    private final SubProductField subProduct = new SubProductField();

    /**
     * Further SubProduct
     */
    private final FurtherSubProductField furtherSubProduct = new FurtherSubProductField();

    /**
     * Average Daily Number of Trades
     */
    private final AdntField adnt = new AdntField();

    /**
     * Price Tick rules for security
     */
    private final PriceTickRuleField priceTickRule = new PriceTickRuleField();

    /**
     * Underlying Symbol
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * Underlying ISIN Code
     */
    private final UnderlyingIsinField underlyingIsin = new UnderlyingIsinField();

    /**
     * Underlying Strike Currency
     */
    private final UnderlyingCurrencyField underlyingCurrency = new UnderlyingCurrencyField();

    /**
     * Minimum Display Volume
     */
    private final MinimumDisplayQtyField minimumDisplayQty = new MinimumDisplayQtyField();

    /**
     * Availability of Retail Service for the security
     */
    private final RetailServiceFlagField retailServiceFlag = new RetailServiceFlagField();

    /**
     * Indicates whether the security admits self- match prevention
     */
    private final SelfMatchPreventionField selfMatchPrevention = new SelfMatchPreventionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sequenceNumber, marketId, marketSegmentId, securityCode, symbol, symbolIsin, fisn, issuerLei, securityGroup, cfiCode, securityType, maturityDate, issueDate, contractMultiplier, liSpre, sstIpre, liSpost, sstIpost, liquidInstrument, admissionRequestedByIssuer, minTradeVol, roundLot, currency, modalityMaskB, securityDescription, tradingObligation, securityName, netAssetValueIdentifier, securitySubType, maturityMonthYear, securityStatus, strikePrice, strikeValue, exerciseStyle, putOrCall, positionLimit, ntPositionLimit, issuer, cpRegType, barrier, lastTradingDay, automaticExpiration, feeType, barrier2, triggerBarrier, triggerUpperBarrier, averageQuarterlyTurnover, tradingScope, sicavCounterpartyMember, netAssetValueIndicator, referenceTradingVenue, outstandingCapital, firstTradingDate, settlementSystem, numberOfDecimals, numberOfHolders, outstandingShares, minimumAuthorizedShares, minimumCapital, lastAdmissionDate, barrierReturn, investmentFundManager, effectiveAmountFiltersRoutedOrders, orderNumberOfDecimals, investmentFundClass, masterFundName, investmentFundManagementCompany, investmentFundDepository, investmentFundCategory, investmentFundMinimumSubscriptionAmount, investmentFundMinimumMaintenanceAmount, investmentFundCutOffTime, navCommunicationTerm, investmentFundNumberOfDecimals, commodityDerivativeIndicator, doubleVolumeCapReached, adt, baseProduct, subProduct, furtherSubProduct, adnt, priceTickRule, underlyingSymbol, underlyingIsin, underlyingCurrency, minimumDisplayQty, retailServiceFlag, selfMatchPrevention);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message sequence number
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Operating MIC Code
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * Segment MIC Code
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Instrument (or Book) code
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Instrument ISIN
     *
     * @return the SymbolIsin field
     */
    public SymbolIsinField symbolIsin() {
        return symbolIsin;
    }

    /**
     * FISN
     *
     * @return the Fisn field
     */
    public FisnField fisn() {
        return fisn;
    }

    /**
     * Issuer LEI
     *
     * @return the IssuerLei field
     */
    public IssuerLeiField issuerLei() {
        return issuerLei;
    }

    /**
     * Security group
     *
     * @return the SecurityGroup field
     */
    public SecurityGroupField securityGroup() {
        return securityGroup;
    }

    /**
     * CFICode
     *
     * @return the CfiCode field
     */
    public CfiCodeField cfiCode() {
        return cfiCode;
    }

    /**
     * Security type
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
    }

    /**
     * Expiration date
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * Date security issued
     *
     * @return the IssueDate field
     */
    public IssueDateField issueDate() {
        return issueDate;
    }

    /**
     * Conversion factor between price units and monetary units
     *
     * @return the ContractMultiplier field
     */
    public ContractMultiplierField contractMultiplier() {
        return contractMultiplier;
    }

    /**
     * LIS pretransparency threshold
     *
     * @return the LiSpre field
     */
    public LiSpreField liSpre() {
        return liSpre;
    }

    /**
     * SSTI pretransparency threshold
     *
     * @return the SstIpre field
     */
    public SstIpreField sstIpre() {
        return sstIpre;
    }

    /**
     * LIS posttransparency threshold
     *
     * @return the LiSpost field
     */
    public LiSpostField liSpost() {
        return liSpost;
    }

    /**
     * SSTI posttransparency threshold
     *
     * @return the SstIpost field
     */
    public SstIpostField sstIpost() {
        return sstIpost;
    }

    /**
     * Liquid Instrument
     *
     * @return the LiquidInstrument field
     */
    public LiquidInstrumentField liquidInstrument() {
        return liquidInstrument;
    }

    /**
     * Security request for admission to trading by the issuer
     *
     * @return the AdmissionRequestedByIssuer field
     */
    public AdmissionRequestedByIssuerField admissionRequestedByIssuer() {
        return admissionRequestedByIssuer;
    }

    /**
     * Minimum Tradeable Volume
     *
     * @return the MinTradeVol field
     */
    public MinTradeVolField minTradeVol() {
        return minTradeVol;
    }

    /**
     * Lot Size
     *
     * @return the RoundLot field
     */
    public RoundLotField roundLot() {
        return roundLot;
    }

    /**
     * Currency code
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Modality mask ∑ 2^(ModalityCode - 100) ModalityCode valid values are the TradingSessionID values listed in Table 25 - TradingSessionID in “BMEGate Codification Tables”
     *
     * @return the ModalityMaskB field
     */
    public ModalityMaskBField modalityMaskB() {
        return modalityMaskB;
    }

    /**
     * Security Description
     *
     * @return the SecurityDescription field
     */
    public SecurityDescriptionField securityDescription() {
        return securityDescription;
    }

    /**
     * Trading obligation. Indicates whether the security has to be traded in a regulated exchange
     *
     * @return the TradingObligation field
     */
    public TradingObligationField tradingObligation() {
        return tradingObligation;
    }

    /**
     * Security Name
     *
     * @return the SecurityName field
     */
    public SecurityNameField securityName() {
        return securityName;
    }

    /**
     * Net Asset Value Identifier
     *
     * @return the NetAssetValueIdentifier field
     */
    public NetAssetValueIdentifierField netAssetValueIdentifier() {
        return netAssetValueIdentifier;
    }

    /**
     * Subtype
     *
     * @return the SecuritySubType field
     */
    public SecuritySubTypeField securitySubType() {
        return securitySubType;
    }

    /**
     * Maturity
     *
     * @return the MaturityMonthYear field
     */
    public MaturityMonthYearField maturityMonthYear() {
        return maturityMonthYear;
    }

    /**
     * Security Status
     *
     * @return the SecurityStatus field
     */
    public SecurityStatusField securityStatus() {
        return securityStatus;
    }

    /**
     * Exercise price. Only present for warrants
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Trading Unit. Number of shares for each security
     *
     * @return the StrikeValue field
     */
    public StrikeValueField strikeValue() {
        return strikeValue;
    }

    /**
     * Exercise style
     *
     * @return the ExerciseStyle field
     */
    public ExerciseStyleField exerciseStyle() {
        return exerciseStyle;
    }

    /**
     * Indicates whether the contract is a put or a call
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * Capital of listed securities
     *
     * @return the PositionLimit field
     */
    public PositionLimitField positionLimit() {
        return positionLimit;
    }

    /**
     * Volume of listed securities (Near Term Position Limit)
     *
     * @return the NtPositionLimit field
     */
    public NtPositionLimitField ntPositionLimit() {
        return ntPositionLimit;
    }

    /**
     * Issuer
     *
     * @return the Issuer field
     */
    public IssuerField issuer() {
        return issuer;
    }

    /**
     * Indicates if it is an institutional security or not
     *
     * @return the CpRegType field
     */
    public CpRegTypeField cpRegType() {
        return cpRegType;
    }

    /**
     * Barrier
     *
     * @return the Barrier field
     */
    public BarrierField barrier() {
        return barrier;
    }

    /**
     * Last Trading Day
     *
     * @return the LastTradingDay field
     */
    public LastTradingDayField lastTradingDay() {
        return lastTradingDay;
    }

    /**
     * Automatic Expiration
     *
     * @return the AutomaticExpiration field
     */
    public AutomaticExpirationField automaticExpiration() {
        return automaticExpiration;
    }

    /**
     * Fee Type
     *
     * @return the FeeType field
     */
    public FeeTypeField feeType() {
        return feeType;
    }

    /**
     * Second Barrier
     *
     * @return the Barrier2 field
     */
    public Barrier2Field barrier2() {
        return barrier2;
    }

    /**
     * Trigger Lower Barrier
     *
     * @return the TriggerBarrier field
     */
    public TriggerBarrierField triggerBarrier() {
        return triggerBarrier;
    }

    /**
     * Trigger Upper Barrier
     *
     * @return the TriggerUpperBarrier field
     */
    public TriggerUpperBarrierField triggerUpperBarrier() {
        return triggerUpperBarrier;
    }

    /**
     * Average Quarterly Turnover
     *
     * @return the AverageQuarterlyTurnover field
     */
    public AverageQuarterlyTurnoverField averageQuarterlyTurnover() {
        return averageQuarterlyTurnover;
    }

    /**
     * Trading Scope
     *
     * @return the TradingScope field
     */
    public TradingScopeField tradingScope() {
        return tradingScope;
    }

    /**
     * SICAV/Fund Counterparty Member
     *
     * @return the SicavCounterpartyMember field
     */
    public SicavCounterpartyMemberField sicavCounterpartyMember() {
        return sicavCounterpartyMember;
    }

    /**
     * Net Asset Value Indicator
     *
     * @return the NetAssetValueIndicator field
     */
    public NetAssetValueIndicatorField netAssetValueIndicator() {
        return netAssetValueIndicator;
    }

    /**
     * Reference Trading Venue
     *
     * @return the ReferenceTradingVenue field
     */
    public ReferenceTradingVenueField referenceTradingVenue() {
        return referenceTradingVenue;
    }

    /**
     * Outstanding Capital
     *
     * @return the OutstandingCapital field
     */
    public OutstandingCapitalField outstandingCapital() {
        return outstandingCapital;
    }

    /**
     * First Trading Date
     *
     * @return the FirstTradingDate field
     */
    public FirstTradingDateField firstTradingDate() {
        return firstTradingDate;
    }

    /**
     * Settlement System
     *
     * @return the SettlementSystem field
     */
    public SettlementSystemField settlementSystem() {
        return settlementSystem;
    }

    /**
     * Number of Decimals
     *
     * @return the NumberOfDecimals field
     */
    public NumberOfDecimalsField numberOfDecimals() {
        return numberOfDecimals;
    }

    /**
     * Number of Holders
     *
     * @return the NumberOfHolders field
     */
    public NumberOfHoldersField numberOfHolders() {
        return numberOfHolders;
    }

    /**
     * Outstanding Number of Shares
     *
     * @return the OutstandingShares field
     */
    public OutstandingSharesField outstandingShares() {
        return outstandingShares;
    }

    /**
     * Minimum Authorized Shares
     *
     * @return the MinimumAuthorizedShares field
     */
    public MinimumAuthorizedSharesField minimumAuthorizedShares() {
        return minimumAuthorizedShares;
    }

    /**
     * Minimum Capital
     *
     * @return the MinimumCapital field
     */
    public MinimumCapitalField minimumCapital() {
        return minimumCapital;
    }

    /**
     * Last Trading Date
     *
     * @return the LastAdmissionDate field
     */
    public LastAdmissionDateField lastAdmissionDate() {
        return lastAdmissionDate;
    }

    /**
     * Barrier Return
     *
     * @return the BarrierReturn field
     */
    public BarrierReturnField barrierReturn() {
        return barrierReturn;
    }

    /**
     * Investment Fund Manager Denomination
     *
     * @return the InvestmentFundManager field
     */
    public InvestmentFundManagerField investmentFundManager() {
        return investmentFundManager;
    }

    /**
     * Effective amount for filters for routed orders
     *
     * @return the EffectiveAmountFiltersRoutedOrders field
     */
    public EffectiveAmountFiltersRoutedOrdersField effectiveAmountFiltersRoutedOrders() {
        return effectiveAmountFiltersRoutedOrders;
    }

    /**
     * Number of Decimals in Order Entry
     *
     * @return the OrderNumberOfDecimals field
     */
    public OrderNumberOfDecimalsField orderNumberOfDecimals() {
        return orderNumberOfDecimals;
    }

    /**
     * Investment Fund Class
     *
     * @return the InvestmentFundClass field
     */
    public InvestmentFundClassField investmentFundClass() {
        return investmentFundClass;
    }

    /**
     * Master Fund Name
     *
     * @return the MasterFundName field
     */
    public MasterFundNameField masterFundName() {
        return masterFundName;
    }

    /**
     * Investment Fund Management Company Name
     *
     * @return the InvestmentFundManagementCompany field
     */
    public InvestmentFundManagementCompanyField investmentFundManagementCompany() {
        return investmentFundManagementCompany;
    }

    /**
     * Investment Fund Depository Entity Name
     *
     * @return the InvestmentFundDepository field
     */
    public InvestmentFundDepositoryField investmentFundDepository() {
        return investmentFundDepository;
    }

    /**
     * Investment Fund Category
     *
     * @return the InvestmentFundCategory field
     */
    public InvestmentFundCategoryField investmentFundCategory() {
        return investmentFundCategory;
    }

    /**
     * Investment Fund Minimum Subscription Amount
     *
     * @return the InvestmentFundMinimumSubscriptionAmount field
     */
    public InvestmentFundMinimumSubscriptionAmountField investmentFundMinimumSubscriptionAmount() {
        return investmentFundMinimumSubscriptionAmount;
    }

    /**
     * Investment Fund Minimum Maintenance Amount
     *
     * @return the InvestmentFundMinimumMaintenanceAmount field
     */
    public InvestmentFundMinimumMaintenanceAmountField investmentFundMinimumMaintenanceAmount() {
        return investmentFundMinimumMaintenanceAmount;
    }

    /**
     * Investment Fund Cut Off Time
     *
     * @return the InvestmentFundCutOffTime field
     */
    public InvestmentFundCutOffTimeField investmentFundCutOffTime() {
        return investmentFundCutOffTime;
    }

    /**
     * Net Asset Value Communication Term
     *
     * @return the NavCommunicationTerm field
     */
    public NavCommunicationTermField navCommunicationTerm() {
        return navCommunicationTerm;
    }

    /**
     * Investment Fund Number of Decimals
     *
     * @return the InvestmentFundNumberOfDecimals field
     */
    public InvestmentFundNumberOfDecimalsField investmentFundNumberOfDecimals() {
        return investmentFundNumberOfDecimals;
    }

    /**
     * Commodity Derivative Indicator
     *
     * @return the CommodityDerivativeIndicator field
     */
    public CommodityDerivativeIndicatorField commodityDerivativeIndicator() {
        return commodityDerivativeIndicator;
    }

    /**
     * Double Volume Cap Reached
     *
     * @return the DoubleVolumeCapReached field
     */
    public DoubleVolumeCapReachedField doubleVolumeCapReached() {
        return doubleVolumeCapReached;
    }

    /**
     * Average Daily Turnover
     *
     * @return the Adt field
     */
    public AdtField adt() {
        return adt;
    }

    /**
     * Base Product
     *
     * @return the BaseProduct field
     */
    public BaseProductField baseProduct() {
        return baseProduct;
    }

    /**
     * SubProduct
     *
     * @return the SubProduct field
     */
    public SubProductField subProduct() {
        return subProduct;
    }

    /**
     * Further SubProduct
     *
     * @return the FurtherSubProduct field
     */
    public FurtherSubProductField furtherSubProduct() {
        return furtherSubProduct;
    }

    /**
     * Average Daily Number of Trades
     *
     * @return the Adnt field
     */
    public AdntField adnt() {
        return adnt;
    }

    /**
     * Price Tick rules for security
     *
     * @return the PriceTickRule field
     */
    public PriceTickRuleField priceTickRule() {
        return priceTickRule;
    }

    /**
     * Underlying Symbol
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * Underlying ISIN Code
     *
     * @return the UnderlyingIsin field
     */
    public UnderlyingIsinField underlyingIsin() {
        return underlyingIsin;
    }

    /**
     * Underlying Strike Currency
     *
     * @return the UnderlyingCurrency field
     */
    public UnderlyingCurrencyField underlyingCurrency() {
        return underlyingCurrency;
    }

    /**
     * Minimum Display Volume
     *
     * @return the MinimumDisplayQty field
     */
    public MinimumDisplayQtyField minimumDisplayQty() {
        return minimumDisplayQty;
    }

    /**
     * Availability of Retail Service for the security
     *
     * @return the RetailServiceFlag field
     */
    public RetailServiceFlagField retailServiceFlag() {
        return retailServiceFlag;
    }

    /**
     * Indicates whether the security admits self- match prevention
     *
     * @return the SelfMatchPrevention field
     */
    public SelfMatchPreventionField selfMatchPrevention() {
        return selfMatchPrevention;
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
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(investmentFundCutOffTime.value());
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
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!symbolIsin.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIsinField.BYTE_LENGTH;
        if (!fisn.parse(data, cursor)) {
            return false;
        }
        cursor += FisnField.BYTE_LENGTH;
        if (!issuerLei.parse(data, cursor)) {
            return false;
        }
        cursor += IssuerLeiField.BYTE_LENGTH;
        if (!securityGroup.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityGroupField.BYTE_LENGTH;
        if (!cfiCode.parse(data, cursor)) {
            return false;
        }
        cursor += CfiCodeField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!issueDate.parse(data, cursor)) {
            return false;
        }
        cursor += IssueDateField.BYTE_LENGTH;
        if (!contractMultiplier.parse(data, cursor)) {
            return false;
        }
        cursor += ContractMultiplierField.BYTE_LENGTH;
        if (!liSpre.parse(data, cursor)) {
            return false;
        }
        cursor += LiSpreField.BYTE_LENGTH;
        if (!sstIpre.parse(data, cursor)) {
            return false;
        }
        cursor += SstIpreField.BYTE_LENGTH;
        if (!liSpost.parse(data, cursor)) {
            return false;
        }
        cursor += LiSpostField.BYTE_LENGTH;
        if (!sstIpost.parse(data, cursor)) {
            return false;
        }
        cursor += SstIpostField.BYTE_LENGTH;
        if (!liquidInstrument.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidInstrumentField.BYTE_LENGTH;
        if (!admissionRequestedByIssuer.parse(data, cursor)) {
            return false;
        }
        cursor += AdmissionRequestedByIssuerField.BYTE_LENGTH;
        if (!minTradeVol.parse(data, cursor)) {
            return false;
        }
        cursor += MinTradeVolField.BYTE_LENGTH;
        if (!roundLot.parse(data, cursor)) {
            return false;
        }
        cursor += RoundLotField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!modalityMaskB.parse(data, cursor)) {
            return false;
        }
        cursor += ModalityMaskBField.BYTE_LENGTH;
        if (!securityDescription.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityDescriptionField.BYTE_LENGTH;
        if (!tradingObligation.parse(data, cursor)) {
            return false;
        }
        cursor += TradingObligationField.BYTE_LENGTH;
        if (!securityName.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityNameField.BYTE_LENGTH;
        if (!netAssetValueIdentifier.parse(data, cursor)) {
            return false;
        }
        cursor += NetAssetValueIdentifierField.BYTE_LENGTH;
        if (!securitySubType.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySubTypeField.BYTE_LENGTH;
        if (!maturityMonthYear.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityMonthYearField.BYTE_LENGTH;
        if (!securityStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityStatusField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!strikeValue.parse(data, cursor)) {
            return false;
        }
        cursor += StrikeValueField.BYTE_LENGTH;
        if (!exerciseStyle.parse(data, cursor)) {
            return false;
        }
        cursor += ExerciseStyleField.BYTE_LENGTH;
        if (!putOrCall.parse(data, cursor)) {
            return false;
        }
        cursor += PutOrCallField.BYTE_LENGTH;
        if (!positionLimit.parse(data, cursor)) {
            return false;
        }
        cursor += PositionLimitField.BYTE_LENGTH;
        if (!ntPositionLimit.parse(data, cursor)) {
            return false;
        }
        cursor += NtPositionLimitField.BYTE_LENGTH;
        if (!issuer.parse(data, cursor)) {
            return false;
        }
        cursor += IssuerField.BYTE_LENGTH;
        if (!cpRegType.parse(data, cursor)) {
            return false;
        }
        cursor += CpRegTypeField.BYTE_LENGTH;
        if (!barrier.parse(data, cursor)) {
            return false;
        }
        cursor += BarrierField.BYTE_LENGTH;
        if (!lastTradingDay.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradingDayField.BYTE_LENGTH;
        if (!automaticExpiration.parse(data, cursor)) {
            return false;
        }
        cursor += AutomaticExpirationField.BYTE_LENGTH;
        if (!feeType.parse(data, cursor)) {
            return false;
        }
        cursor += FeeTypeField.BYTE_LENGTH;
        if (!barrier2.parse(data, cursor)) {
            return false;
        }
        cursor += Barrier2Field.BYTE_LENGTH;
        if (!triggerBarrier.parse(data, cursor)) {
            return false;
        }
        cursor += TriggerBarrierField.BYTE_LENGTH;
        if (!triggerUpperBarrier.parse(data, cursor)) {
            return false;
        }
        cursor += TriggerUpperBarrierField.BYTE_LENGTH;
        if (!averageQuarterlyTurnover.parse(data, cursor)) {
            return false;
        }
        cursor += AverageQuarterlyTurnoverField.BYTE_LENGTH;
        if (!tradingScope.parse(data, cursor)) {
            return false;
        }
        cursor += TradingScopeField.BYTE_LENGTH;
        if (!sicavCounterpartyMember.parse(data, cursor)) {
            return false;
        }
        cursor += SicavCounterpartyMemberField.BYTE_LENGTH;
        if (!netAssetValueIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += NetAssetValueIndicatorField.BYTE_LENGTH;
        if (!referenceTradingVenue.parse(data, cursor)) {
            return false;
        }
        cursor += ReferenceTradingVenueField.BYTE_LENGTH;
        if (!outstandingCapital.parse(data, cursor)) {
            return false;
        }
        cursor += OutstandingCapitalField.BYTE_LENGTH;
        if (!firstTradingDate.parse(data, cursor)) {
            return false;
        }
        cursor += FirstTradingDateField.BYTE_LENGTH;
        if (!settlementSystem.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementSystemField.BYTE_LENGTH;
        if (!numberOfDecimals.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfDecimalsField.BYTE_LENGTH;
        if (!numberOfHolders.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfHoldersField.BYTE_LENGTH;
        if (!outstandingShares.parse(data, cursor)) {
            return false;
        }
        cursor += OutstandingSharesField.BYTE_LENGTH;
        if (!minimumAuthorizedShares.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumAuthorizedSharesField.BYTE_LENGTH;
        if (!minimumCapital.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumCapitalField.BYTE_LENGTH;
        if (!lastAdmissionDate.parse(data, cursor)) {
            return false;
        }
        cursor += LastAdmissionDateField.BYTE_LENGTH;
        if (!barrierReturn.parse(data, cursor)) {
            return false;
        }
        cursor += BarrierReturnField.BYTE_LENGTH;
        if (!investmentFundManager.parse(data, cursor)) {
            return false;
        }
        cursor += InvestmentFundManagerField.BYTE_LENGTH;
        if (!effectiveAmountFiltersRoutedOrders.parse(data, cursor)) {
            return false;
        }
        cursor += EffectiveAmountFiltersRoutedOrdersField.BYTE_LENGTH;
        if (!orderNumberOfDecimals.parse(data, cursor)) {
            return false;
        }
        cursor += OrderNumberOfDecimalsField.BYTE_LENGTH;
        if (!investmentFundClass.parse(data, cursor)) {
            return false;
        }
        cursor += InvestmentFundClassField.BYTE_LENGTH;
        if (!masterFundName.parse(data, cursor)) {
            return false;
        }
        cursor += MasterFundNameField.BYTE_LENGTH;
        if (!investmentFundManagementCompany.parse(data, cursor)) {
            return false;
        }
        cursor += InvestmentFundManagementCompanyField.BYTE_LENGTH;
        if (!investmentFundDepository.parse(data, cursor)) {
            return false;
        }
        cursor += InvestmentFundDepositoryField.BYTE_LENGTH;
        if (!investmentFundCategory.parse(data, cursor)) {
            return false;
        }
        cursor += InvestmentFundCategoryField.BYTE_LENGTH;
        if (!investmentFundMinimumSubscriptionAmount.parse(data, cursor)) {
            return false;
        }
        cursor += InvestmentFundMinimumSubscriptionAmountField.BYTE_LENGTH;
        if (!investmentFundMinimumMaintenanceAmount.parse(data, cursor)) {
            return false;
        }
        cursor += InvestmentFundMinimumMaintenanceAmountField.BYTE_LENGTH;
        if (!investmentFundCutOffTime.parse(data, cursor)) {
            return false;
        }
        cursor += InvestmentFundCutOffTimeField.BYTE_LENGTH;
        if (!navCommunicationTerm.parse(data, cursor)) {
            return false;
        }
        cursor += NavCommunicationTermField.BYTE_LENGTH;
        if (!investmentFundNumberOfDecimals.parse(data, cursor)) {
            return false;
        }
        cursor += InvestmentFundNumberOfDecimalsField.BYTE_LENGTH;
        if (!commodityDerivativeIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CommodityDerivativeIndicatorField.BYTE_LENGTH;
        if (!doubleVolumeCapReached.parse(data, cursor)) {
            return false;
        }
        cursor += DoubleVolumeCapReachedField.BYTE_LENGTH;
        if (!adt.parse(data, cursor)) {
            return false;
        }
        cursor += AdtField.BYTE_LENGTH;
        if (!baseProduct.parse(data, cursor)) {
            return false;
        }
        cursor += BaseProductField.BYTE_LENGTH;
        if (!subProduct.parse(data, cursor)) {
            return false;
        }
        cursor += SubProductField.BYTE_LENGTH;
        if (!furtherSubProduct.parse(data, cursor)) {
            return false;
        }
        cursor += FurtherSubProductField.BYTE_LENGTH;
        if (!adnt.parse(data, cursor)) {
            return false;
        }
        cursor += AdntField.BYTE_LENGTH;
        if (!priceTickRule.parse(data, cursor)) {
            return false;
        }
        cursor += PriceTickRuleField.BYTE_LENGTH;
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
        if (!underlyingIsin.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingIsinField.BYTE_LENGTH;
        if (!underlyingCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingCurrencyField.BYTE_LENGTH;
        if (!minimumDisplayQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumDisplayQtyField.BYTE_LENGTH;
        if (!retailServiceFlag.parse(data, cursor)) {
            return false;
        }
        cursor += RetailServiceFlagField.BYTE_LENGTH;
        return selfMatchPrevention.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sequenceNumber.encode(data, cursor);
        cursor = marketId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = securityCode.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = symbolIsin.encode(data, cursor);
        cursor = fisn.encode(data, cursor);
        cursor = issuerLei.encode(data, cursor);
        cursor = securityGroup.encode(data, cursor);
        cursor = cfiCode.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = issueDate.encode(data, cursor);
        cursor = contractMultiplier.encode(data, cursor);
        cursor = liSpre.encode(data, cursor);
        cursor = sstIpre.encode(data, cursor);
        cursor = liSpost.encode(data, cursor);
        cursor = sstIpost.encode(data, cursor);
        cursor = liquidInstrument.encode(data, cursor);
        cursor = admissionRequestedByIssuer.encode(data, cursor);
        cursor = minTradeVol.encode(data, cursor);
        cursor = roundLot.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = modalityMaskB.encode(data, cursor);
        cursor = securityDescription.encode(data, cursor);
        cursor = tradingObligation.encode(data, cursor);
        cursor = securityName.encode(data, cursor);
        cursor = netAssetValueIdentifier.encode(data, cursor);
        cursor = securitySubType.encode(data, cursor);
        cursor = maturityMonthYear.encode(data, cursor);
        cursor = securityStatus.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = strikeValue.encode(data, cursor);
        cursor = exerciseStyle.encode(data, cursor);
        cursor = putOrCall.encode(data, cursor);
        cursor = positionLimit.encode(data, cursor);
        cursor = ntPositionLimit.encode(data, cursor);
        cursor = issuer.encode(data, cursor);
        cursor = cpRegType.encode(data, cursor);
        cursor = barrier.encode(data, cursor);
        cursor = lastTradingDay.encode(data, cursor);
        cursor = automaticExpiration.encode(data, cursor);
        cursor = feeType.encode(data, cursor);
        cursor = barrier2.encode(data, cursor);
        cursor = triggerBarrier.encode(data, cursor);
        cursor = triggerUpperBarrier.encode(data, cursor);
        cursor = averageQuarterlyTurnover.encode(data, cursor);
        cursor = tradingScope.encode(data, cursor);
        cursor = sicavCounterpartyMember.encode(data, cursor);
        cursor = netAssetValueIndicator.encode(data, cursor);
        cursor = referenceTradingVenue.encode(data, cursor);
        cursor = outstandingCapital.encode(data, cursor);
        cursor = firstTradingDate.encode(data, cursor);
        cursor = settlementSystem.encode(data, cursor);
        cursor = numberOfDecimals.encode(data, cursor);
        cursor = numberOfHolders.encode(data, cursor);
        cursor = outstandingShares.encode(data, cursor);
        cursor = minimumAuthorizedShares.encode(data, cursor);
        cursor = minimumCapital.encode(data, cursor);
        cursor = lastAdmissionDate.encode(data, cursor);
        cursor = barrierReturn.encode(data, cursor);
        cursor = investmentFundManager.encode(data, cursor);
        cursor = effectiveAmountFiltersRoutedOrders.encode(data, cursor);
        cursor = orderNumberOfDecimals.encode(data, cursor);
        cursor = investmentFundClass.encode(data, cursor);
        cursor = masterFundName.encode(data, cursor);
        cursor = investmentFundManagementCompany.encode(data, cursor);
        cursor = investmentFundDepository.encode(data, cursor);
        cursor = investmentFundCategory.encode(data, cursor);
        cursor = investmentFundMinimumSubscriptionAmount.encode(data, cursor);
        cursor = investmentFundMinimumMaintenanceAmount.encode(data, cursor);
        cursor = investmentFundCutOffTime.encode(data, cursor);
        cursor = navCommunicationTerm.encode(data, cursor);
        cursor = investmentFundNumberOfDecimals.encode(data, cursor);
        cursor = commodityDerivativeIndicator.encode(data, cursor);
        cursor = doubleVolumeCapReached.encode(data, cursor);
        cursor = adt.encode(data, cursor);
        cursor = baseProduct.encode(data, cursor);
        cursor = subProduct.encode(data, cursor);
        cursor = furtherSubProduct.encode(data, cursor);
        cursor = adnt.encode(data, cursor);
        cursor = priceTickRule.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = underlyingIsin.encode(data, cursor);
        cursor = underlyingCurrency.encode(data, cursor);
        cursor = minimumDisplayQty.encode(data, cursor);
        cursor = retailServiceFlag.encode(data, cursor);
        cursor = selfMatchPrevention.encode(data, cursor);
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
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "MarketId" -> Optional.of(marketId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "SecurityCode" -> Optional.of(securityCode);
            case "Symbol" -> Optional.of(symbol);
            case "SymbolIsin" -> Optional.of(symbolIsin);
            case "Fisn" -> Optional.of(fisn);
            case "IssuerLei" -> Optional.of(issuerLei);
            case "SecurityGroup" -> Optional.of(securityGroup);
            case "CfiCode" -> Optional.of(cfiCode);
            case "SecurityType" -> Optional.of(securityType);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "IssueDate" -> Optional.of(issueDate);
            case "ContractMultiplier" -> Optional.of(contractMultiplier);
            case "LiSpre" -> Optional.of(liSpre);
            case "SstIpre" -> Optional.of(sstIpre);
            case "LiSpost" -> Optional.of(liSpost);
            case "SstIpost" -> Optional.of(sstIpost);
            case "LiquidInstrument" -> Optional.of(liquidInstrument);
            case "AdmissionRequestedByIssuer" -> Optional.of(admissionRequestedByIssuer);
            case "MinTradeVol" -> Optional.of(minTradeVol);
            case "RoundLot" -> Optional.of(roundLot);
            case "Currency" -> Optional.of(currency);
            case "ModalityMaskB" -> Optional.of(modalityMaskB);
            case "SecurityDescription" -> Optional.of(securityDescription);
            case "TradingObligation" -> Optional.of(tradingObligation);
            case "SecurityName" -> Optional.of(securityName);
            case "NetAssetValueIdentifier" -> Optional.of(netAssetValueIdentifier);
            case "SecuritySubType" -> Optional.of(securitySubType);
            case "MaturityMonthYear" -> Optional.of(maturityMonthYear);
            case "SecurityStatus" -> Optional.of(securityStatus);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "StrikeValue" -> Optional.of(strikeValue);
            case "ExerciseStyle" -> Optional.of(exerciseStyle);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "PositionLimit" -> Optional.of(positionLimit);
            case "NtPositionLimit" -> Optional.of(ntPositionLimit);
            case "Issuer" -> Optional.of(issuer);
            case "CpRegType" -> Optional.of(cpRegType);
            case "Barrier" -> Optional.of(barrier);
            case "LastTradingDay" -> Optional.of(lastTradingDay);
            case "AutomaticExpiration" -> Optional.of(automaticExpiration);
            case "FeeType" -> Optional.of(feeType);
            case "Barrier2" -> Optional.of(barrier2);
            case "TriggerBarrier" -> Optional.of(triggerBarrier);
            case "TriggerUpperBarrier" -> Optional.of(triggerUpperBarrier);
            case "AverageQuarterlyTurnover" -> Optional.of(averageQuarterlyTurnover);
            case "TradingScope" -> Optional.of(tradingScope);
            case "SicavCounterpartyMember" -> Optional.of(sicavCounterpartyMember);
            case "NetAssetValueIndicator" -> Optional.of(netAssetValueIndicator);
            case "ReferenceTradingVenue" -> Optional.of(referenceTradingVenue);
            case "OutstandingCapital" -> Optional.of(outstandingCapital);
            case "FirstTradingDate" -> Optional.of(firstTradingDate);
            case "SettlementSystem" -> Optional.of(settlementSystem);
            case "NumberOfDecimals" -> Optional.of(numberOfDecimals);
            case "NumberOfHolders" -> Optional.of(numberOfHolders);
            case "OutstandingShares" -> Optional.of(outstandingShares);
            case "MinimumAuthorizedShares" -> Optional.of(minimumAuthorizedShares);
            case "MinimumCapital" -> Optional.of(minimumCapital);
            case "LastAdmissionDate" -> Optional.of(lastAdmissionDate);
            case "BarrierReturn" -> Optional.of(barrierReturn);
            case "InvestmentFundManager" -> Optional.of(investmentFundManager);
            case "EffectiveAmountFiltersRoutedOrders" -> Optional.of(effectiveAmountFiltersRoutedOrders);
            case "OrderNumberOfDecimals" -> Optional.of(orderNumberOfDecimals);
            case "InvestmentFundClass" -> Optional.of(investmentFundClass);
            case "MasterFundName" -> Optional.of(masterFundName);
            case "InvestmentFundManagementCompany" -> Optional.of(investmentFundManagementCompany);
            case "InvestmentFundDepository" -> Optional.of(investmentFundDepository);
            case "InvestmentFundCategory" -> Optional.of(investmentFundCategory);
            case "InvestmentFundMinimumSubscriptionAmount" -> Optional.of(investmentFundMinimumSubscriptionAmount);
            case "InvestmentFundMinimumMaintenanceAmount" -> Optional.of(investmentFundMinimumMaintenanceAmount);
            case "InvestmentFundCutOffTime" -> Optional.of(investmentFundCutOffTime);
            case "NavCommunicationTerm" -> Optional.of(navCommunicationTerm);
            case "InvestmentFundNumberOfDecimals" -> Optional.of(investmentFundNumberOfDecimals);
            case "CommodityDerivativeIndicator" -> Optional.of(commodityDerivativeIndicator);
            case "DoubleVolumeCapReached" -> Optional.of(doubleVolumeCapReached);
            case "Adt" -> Optional.of(adt);
            case "BaseProduct" -> Optional.of(baseProduct);
            case "SubProduct" -> Optional.of(subProduct);
            case "FurtherSubProduct" -> Optional.of(furtherSubProduct);
            case "Adnt" -> Optional.of(adnt);
            case "PriceTickRule" -> Optional.of(priceTickRule);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "UnderlyingIsin" -> Optional.of(underlyingIsin);
            case "UnderlyingCurrency" -> Optional.of(underlyingCurrency);
            case "MinimumDisplayQty" -> Optional.of(minimumDisplayQty);
            case "RetailServiceFlag" -> Optional.of(retailServiceFlag);
            case "SelfMatchPrevention" -> Optional.of(selfMatchPrevention);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityListMessage message)) {
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
        if (!(other instanceof SecurityListMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
