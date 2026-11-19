package omi.bme.meff.topofbook.bmegate.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.AdjustmentsRuleField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.AdmissionRequestedByIssuerField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.BaseCurrencyField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.BaseProductField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.CfiCodeField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.CommodityDerivativeIndicatorField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.ContractMultiplierField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.CurrencyField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.EndMaturityMonthYearField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.ExerciseStyleField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.FamilyCodeField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.FisnField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.FlexibleIndicatorField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.FurtherSubProductField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.IssueDateField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.IssuerLeiField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LastTradingDayField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegPrice1Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegPrice2Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegPrice3Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegPrice4Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegPrice5Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegRatioQty1Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegRatioQty2Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegRatioQty3Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegRatioQty4Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegRatioQty5Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegSide1Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegSide2Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegSide3Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegSide4Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegSide5Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegSymbol1Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegSymbol2Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegSymbol3Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegSymbol4Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LegSymbol5Field;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LiSpostField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LiSpreField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.LiquidInstrumentField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.MarketIdField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.MarketSegmentIdField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.MaturityDateField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.MaturityMonthYearField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.MaturityMonthYearIncrementField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.MaturityMonthYearIncrementUnitsField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.MaximumOrderSizeField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.MinPriceIncrementField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.MinTradeVolField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.ModalityMaskBField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.NumberOfDecimalsField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.OptAttributeField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.OrderNumberOfDecimalsField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.PutOrCallField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.QuotedCurrencyField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.RoundLotField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.SecDescriptionField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.SecurityCodeField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.SecurityDescriptionField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.SecurityGroupField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.SecuritySubTypeField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.SecurityTypeField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.SelfMatchPreventionField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.SequenceNumberField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.SettlMethodField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.SstIpostField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.SstIpreField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.StartMaturityMonthYearField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.StockWhenUnderlyingIsDividendField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.StrikePriceField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.StrikeValueField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.SubProductField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.SymbolField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.SymbolIsinField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.TradingObligationField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.UnderlyingAssetField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.UnderlyingCurrencyField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.UnderlyingIsinField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.UnderlyingSecurityIssuerLeiField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.UnderlyingSymbolField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.UnitOfMeasureField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.XRollingBuyerMarkupField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.XRollingClosingTypeField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.XRollingDividendPayDateDiffField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.XRollingDividendPercentageField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.XRollingReferenceBuyerRateField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.XRollingReferenceSellerRateField;
import omi.bme.meff.topofbook.bmegate.v1_6.fields.XRollingSellerMarkupField;
import omi.bme.meff.topofbook.bmegate.v1_6.types.Field;
import omi.bme.meff.topofbook.bmegate.v1_6.types.Message;
import omi.bme.meff.topofbook.bmegate.v1_6.types.PrintOptions;

/**
 * Represents the SecurityListMessage message from the TopOfBook protocol.
 *
 * <p>Message sent by the server to provide the definition of one security. It shares the same layout as the Security List Update Report message, but with a different Message Type</p>
 */
public final class SecurityListMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 713;

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
     * Underlying code
     */
    private final SecurityGroupField securityGroup = new SecurityGroupField();

    /**
     * Family of instruments code
     */
    private final FamilyCodeField familyCode = new FamilyCodeField();

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
     * Underlying security description
     */
    private final SecDescriptionField secDescription = new SecDescriptionField();

    /**
     * Underlying Asset
     */
    private final UnderlyingAssetField underlyingAsset = new UnderlyingAssetField();

    /**
     * Strategy type
     */
    private final SecuritySubTypeField securitySubType = new SecuritySubTypeField();

    /**
     * Maturity
     */
    private final MaturityMonthYearField maturityMonthYear = new MaturityMonthYearField();

    /**
     * Exercise price. Only present for warrants
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Trading Unit. Number of shares for each security
     */
    private final StrikeValueField strikeValue = new StrikeValueField();

    /**
     * Security version number, provided to support versioning of securities as a result of corporate actions or events
     */
    private final OptAttributeField optAttribute = new OptAttributeField();

    /**
     * Minimum Price Increment
     */
    private final MinPriceIncrementField minPriceIncrement = new MinPriceIncrementField();

    /**
     * Unif of Measure
     */
    private final UnitOfMeasureField unitOfMeasure = new UnitOfMeasureField();

    /**
     * Settlement Method
     */
    private final SettlMethodField settlMethod = new SettlMethodField();

    /**
     * Exercise Style (Options)
     */
    private final ExerciseStyleField exerciseStyle = new ExerciseStyleField();

    /**
     * Indicates whether the contract is a put or a call
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * Flexible Expiry Indicator
     */
    private final FlexibleIndicatorField flexibleIndicator = new FlexibleIndicatorField();

    /**
     * Last Trading Day
     */
    private final LastTradingDayField lastTradingDay = new LastTradingDayField();

    /**
     * Number of Decimals
     */
    private final NumberOfDecimalsField numberOfDecimals = new NumberOfDecimalsField();

    /**
     * Number of Decimals in Order Entry
     */
    private final OrderNumberOfDecimalsField orderNumberOfDecimals = new OrderNumberOfDecimalsField();

    /**
     * Adjustments rule
     */
    private final AdjustmentsRuleField adjustmentsRule = new AdjustmentsRuleField();

    /**
     * Nominal limit cap above which orders are not permitted
     */
    private final MaximumOrderSizeField maximumOrderSize = new MaximumOrderSizeField();

    /**
     * Indicates whether the security admits self- match prevention
     */
    private final SelfMatchPreventionField selfMatchPrevention = new SelfMatchPreventionField();

    /**
     * Commodity Derivative Indicator
     */
    private final CommodityDerivativeIndicatorField commodityDerivativeIndicator = new CommodityDerivativeIndicatorField();

    /**
     * Stock when Underlying is a Dividend
     */
    private final StockWhenUnderlyingIsDividendField stockWhenUnderlyingIsDividend = new StockWhenUnderlyingIsDividendField();

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
     * Base currency
     */
    private final BaseCurrencyField baseCurrency = new BaseCurrencyField();

    /**
     * Quoted currency
     */
    private final QuotedCurrencyField quotedCurrency = new QuotedCurrencyField();

    /**
     * MaturityMonthYear Increment Units
     */
    private final MaturityMonthYearIncrementUnitsField maturityMonthYearIncrementUnits = new MaturityMonthYearIncrementUnitsField();

    /**
     * Maturity Interval Initial Date
     */
    private final StartMaturityMonthYearField startMaturityMonthYear = new StartMaturityMonthYearField();

    /**
     * Maturity Interval End Date
     */
    private final EndMaturityMonthYearField endMaturityMonthYear = new EndMaturityMonthYearField();

    /**
     * Number of MaturityMonthYear Increment Units
     */
    private final MaturityMonthYearIncrementField maturityMonthYearIncrement = new MaturityMonthYearIncrementField();

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
     * Underlying Security Issuer LEI
     */
    private final UnderlyingSecurityIssuerLeiField underlyingSecurityIssuerLei = new UnderlyingSecurityIssuerLeiField();

    /**
     * xRolling Closing Type
     */
    private final XRollingClosingTypeField xRollingClosingType = new XRollingClosingTypeField();

    /**
     * xRolling reference financing buyer rate
     */
    private final XRollingReferenceBuyerRateField xRollingReferenceBuyerRate = new XRollingReferenceBuyerRateField();

    /**
     * xRolling buyer rate markup
     */
    private final XRollingBuyerMarkupField xRollingBuyerMarkup = new XRollingBuyerMarkupField();

    /**
     * xRolling reference financing seller rate
     */
    private final XRollingReferenceSellerRateField xRollingReferenceSellerRate = new XRollingReferenceSellerRateField();

    /**
     * xRolling reference financing seller rate
     */
    private final XRollingSellerMarkupField xRollingSellerMarkup = new XRollingSellerMarkupField();

    /**
     * xRolling Dividend payment percentage
     */
    private final XRollingDividendPercentageField xRollingDividendPercentage = new XRollingDividendPercentageField();

    /**
     * xRolling Dividend Payment Date difference
     */
    private final XRollingDividendPayDateDiffField xRollingDividendPayDateDiff = new XRollingDividendPayDateDiffField();

    /**
     * Symbol in strategy or time spread
     */
    private final LegSymbol1Field legSymbol1 = new LegSymbol1Field();

    /**
     * Ratio in strategy or time spread
     */
    private final LegRatioQty1Field legRatioQty1 = new LegRatioQty1Field();

    /**
     * Side in strategy or time spread
     */
    private final LegSide1Field legSide1 = new LegSide1Field();

    /**
     * Price in strategy or time spread
     */
    private final LegPrice1Field legPrice1 = new LegPrice1Field();

    /**
     * Symbol in strategy or time spread
     */
    private final LegSymbol2Field legSymbol2 = new LegSymbol2Field();

    /**
     * Ratio in strategy or time spread
     */
    private final LegRatioQty2Field legRatioQty2 = new LegRatioQty2Field();

    /**
     * Side in strategy or time spread
     */
    private final LegSide2Field legSide2 = new LegSide2Field();

    /**
     * Price in strategy or time spread
     */
    private final LegPrice2Field legPrice2 = new LegPrice2Field();

    /**
     * Symbol in strategy or time spread
     */
    private final LegSymbol3Field legSymbol3 = new LegSymbol3Field();

    /**
     * Ratio in strategy or time spread
     */
    private final LegRatioQty3Field legRatioQty3 = new LegRatioQty3Field();

    /**
     * Side in strategy or time spread
     */
    private final LegSide3Field legSide3 = new LegSide3Field();

    /**
     * Price in strategy or time spread
     */
    private final LegPrice3Field legPrice3 = new LegPrice3Field();

    /**
     * Symbol in strategy or time spread
     */
    private final LegSymbol4Field legSymbol4 = new LegSymbol4Field();

    /**
     * Ratio in strategy or time spread
     */
    private final LegRatioQty4Field legRatioQty4 = new LegRatioQty4Field();

    /**
     * Side in strategy or time spread
     */
    private final LegSide4Field legSide4 = new LegSide4Field();

    /**
     * Price in strategy or time spread
     */
    private final LegPrice4Field legPrice4 = new LegPrice4Field();

    /**
     * Symbol in strategy or time spread
     */
    private final LegSymbol5Field legSymbol5 = new LegSymbol5Field();

    /**
     * Ratio in strategy or time spread
     */
    private final LegRatioQty5Field legRatioQty5 = new LegRatioQty5Field();

    /**
     * Side in strategy or time spread
     */
    private final LegSide5Field legSide5 = new LegSide5Field();

    /**
     * Price in strategy or time spread
     */
    private final LegPrice5Field legPrice5 = new LegPrice5Field();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sequenceNumber, marketId, marketSegmentId, securityCode, symbol, symbolIsin, fisn, issuerLei, securityGroup, familyCode, cfiCode, securityType, maturityDate, issueDate, contractMultiplier, liSpre, sstIpre, liSpost, sstIpost, liquidInstrument, admissionRequestedByIssuer, minTradeVol, roundLot, currency, modalityMaskB, securityDescription, tradingObligation, secDescription, underlyingAsset, securitySubType, maturityMonthYear, strikePrice, strikeValue, optAttribute, minPriceIncrement, unitOfMeasure, settlMethod, exerciseStyle, putOrCall, flexibleIndicator, lastTradingDay, numberOfDecimals, orderNumberOfDecimals, adjustmentsRule, maximumOrderSize, selfMatchPrevention, commodityDerivativeIndicator, stockWhenUnderlyingIsDividend, baseProduct, subProduct, furtherSubProduct, baseCurrency, quotedCurrency, maturityMonthYearIncrementUnits, startMaturityMonthYear, endMaturityMonthYear, maturityMonthYearIncrement, underlyingSymbol, underlyingIsin, underlyingCurrency, underlyingSecurityIssuerLei, xRollingClosingType, xRollingReferenceBuyerRate, xRollingBuyerMarkup, xRollingReferenceSellerRate, xRollingSellerMarkup, xRollingDividendPercentage, xRollingDividendPayDateDiff, legSymbol1, legRatioQty1, legSide1, legPrice1, legSymbol2, legRatioQty2, legSide2, legPrice2, legSymbol3, legRatioQty3, legSide3, legPrice3, legSymbol4, legRatioQty4, legSide4, legPrice4, legSymbol5, legRatioQty5, legSide5, legPrice5);

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
     * Underlying code
     *
     * @return the SecurityGroup field
     */
    public SecurityGroupField securityGroup() {
        return securityGroup;
    }

    /**
     * Family of instruments code
     *
     * @return the FamilyCode field
     */
    public FamilyCodeField familyCode() {
        return familyCode;
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
     * Underlying security description
     *
     * @return the SecDescription field
     */
    public SecDescriptionField secDescription() {
        return secDescription;
    }

    /**
     * Underlying Asset
     *
     * @return the UnderlyingAsset field
     */
    public UnderlyingAssetField underlyingAsset() {
        return underlyingAsset;
    }

    /**
     * Strategy type
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
     * Security version number, provided to support versioning of securities as a result of corporate actions or events
     *
     * @return the OptAttribute field
     */
    public OptAttributeField optAttribute() {
        return optAttribute;
    }

    /**
     * Minimum Price Increment
     *
     * @return the MinPriceIncrement field
     */
    public MinPriceIncrementField minPriceIncrement() {
        return minPriceIncrement;
    }

    /**
     * Unif of Measure
     *
     * @return the UnitOfMeasure field
     */
    public UnitOfMeasureField unitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Settlement Method
     *
     * @return the SettlMethod field
     */
    public SettlMethodField settlMethod() {
        return settlMethod;
    }

    /**
     * Exercise Style (Options)
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
     * Flexible Expiry Indicator
     *
     * @return the FlexibleIndicator field
     */
    public FlexibleIndicatorField flexibleIndicator() {
        return flexibleIndicator;
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
     * Number of Decimals
     *
     * @return the NumberOfDecimals field
     */
    public NumberOfDecimalsField numberOfDecimals() {
        return numberOfDecimals;
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
     * Adjustments rule
     *
     * @return the AdjustmentsRule field
     */
    public AdjustmentsRuleField adjustmentsRule() {
        return adjustmentsRule;
    }

    /**
     * Nominal limit cap above which orders are not permitted
     *
     * @return the MaximumOrderSize field
     */
    public MaximumOrderSizeField maximumOrderSize() {
        return maximumOrderSize;
    }

    /**
     * Indicates whether the security admits self- match prevention
     *
     * @return the SelfMatchPrevention field
     */
    public SelfMatchPreventionField selfMatchPrevention() {
        return selfMatchPrevention;
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
     * Stock when Underlying is a Dividend
     *
     * @return the StockWhenUnderlyingIsDividend field
     */
    public StockWhenUnderlyingIsDividendField stockWhenUnderlyingIsDividend() {
        return stockWhenUnderlyingIsDividend;
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
     * Base currency
     *
     * @return the BaseCurrency field
     */
    public BaseCurrencyField baseCurrency() {
        return baseCurrency;
    }

    /**
     * Quoted currency
     *
     * @return the QuotedCurrency field
     */
    public QuotedCurrencyField quotedCurrency() {
        return quotedCurrency;
    }

    /**
     * MaturityMonthYear Increment Units
     *
     * @return the MaturityMonthYearIncrementUnits field
     */
    public MaturityMonthYearIncrementUnitsField maturityMonthYearIncrementUnits() {
        return maturityMonthYearIncrementUnits;
    }

    /**
     * Maturity Interval Initial Date
     *
     * @return the StartMaturityMonthYear field
     */
    public StartMaturityMonthYearField startMaturityMonthYear() {
        return startMaturityMonthYear;
    }

    /**
     * Maturity Interval End Date
     *
     * @return the EndMaturityMonthYear field
     */
    public EndMaturityMonthYearField endMaturityMonthYear() {
        return endMaturityMonthYear;
    }

    /**
     * Number of MaturityMonthYear Increment Units
     *
     * @return the MaturityMonthYearIncrement field
     */
    public MaturityMonthYearIncrementField maturityMonthYearIncrement() {
        return maturityMonthYearIncrement;
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
     * Underlying Security Issuer LEI
     *
     * @return the UnderlyingSecurityIssuerLei field
     */
    public UnderlyingSecurityIssuerLeiField underlyingSecurityIssuerLei() {
        return underlyingSecurityIssuerLei;
    }

    /**
     * xRolling Closing Type
     *
     * @return the XRollingClosingType field
     */
    public XRollingClosingTypeField xRollingClosingType() {
        return xRollingClosingType;
    }

    /**
     * xRolling reference financing buyer rate
     *
     * @return the XRollingReferenceBuyerRate field
     */
    public XRollingReferenceBuyerRateField xRollingReferenceBuyerRate() {
        return xRollingReferenceBuyerRate;
    }

    /**
     * xRolling buyer rate markup
     *
     * @return the XRollingBuyerMarkup field
     */
    public XRollingBuyerMarkupField xRollingBuyerMarkup() {
        return xRollingBuyerMarkup;
    }

    /**
     * xRolling reference financing seller rate
     *
     * @return the XRollingReferenceSellerRate field
     */
    public XRollingReferenceSellerRateField xRollingReferenceSellerRate() {
        return xRollingReferenceSellerRate;
    }

    /**
     * xRolling reference financing seller rate
     *
     * @return the XRollingSellerMarkup field
     */
    public XRollingSellerMarkupField xRollingSellerMarkup() {
        return xRollingSellerMarkup;
    }

    /**
     * xRolling Dividend payment percentage
     *
     * @return the XRollingDividendPercentage field
     */
    public XRollingDividendPercentageField xRollingDividendPercentage() {
        return xRollingDividendPercentage;
    }

    /**
     * xRolling Dividend Payment Date difference
     *
     * @return the XRollingDividendPayDateDiff field
     */
    public XRollingDividendPayDateDiffField xRollingDividendPayDateDiff() {
        return xRollingDividendPayDateDiff;
    }

    /**
     * Symbol in strategy or time spread
     *
     * @return the LegSymbol1 field
     */
    public LegSymbol1Field legSymbol1() {
        return legSymbol1;
    }

    /**
     * Ratio in strategy or time spread
     *
     * @return the LegRatioQty1 field
     */
    public LegRatioQty1Field legRatioQty1() {
        return legRatioQty1;
    }

    /**
     * Side in strategy or time spread
     *
     * @return the LegSide1 field
     */
    public LegSide1Field legSide1() {
        return legSide1;
    }

    /**
     * Price in strategy or time spread
     *
     * @return the LegPrice1 field
     */
    public LegPrice1Field legPrice1() {
        return legPrice1;
    }

    /**
     * Symbol in strategy or time spread
     *
     * @return the LegSymbol2 field
     */
    public LegSymbol2Field legSymbol2() {
        return legSymbol2;
    }

    /**
     * Ratio in strategy or time spread
     *
     * @return the LegRatioQty2 field
     */
    public LegRatioQty2Field legRatioQty2() {
        return legRatioQty2;
    }

    /**
     * Side in strategy or time spread
     *
     * @return the LegSide2 field
     */
    public LegSide2Field legSide2() {
        return legSide2;
    }

    /**
     * Price in strategy or time spread
     *
     * @return the LegPrice2 field
     */
    public LegPrice2Field legPrice2() {
        return legPrice2;
    }

    /**
     * Symbol in strategy or time spread
     *
     * @return the LegSymbol3 field
     */
    public LegSymbol3Field legSymbol3() {
        return legSymbol3;
    }

    /**
     * Ratio in strategy or time spread
     *
     * @return the LegRatioQty3 field
     */
    public LegRatioQty3Field legRatioQty3() {
        return legRatioQty3;
    }

    /**
     * Side in strategy or time spread
     *
     * @return the LegSide3 field
     */
    public LegSide3Field legSide3() {
        return legSide3;
    }

    /**
     * Price in strategy or time spread
     *
     * @return the LegPrice3 field
     */
    public LegPrice3Field legPrice3() {
        return legPrice3;
    }

    /**
     * Symbol in strategy or time spread
     *
     * @return the LegSymbol4 field
     */
    public LegSymbol4Field legSymbol4() {
        return legSymbol4;
    }

    /**
     * Ratio in strategy or time spread
     *
     * @return the LegRatioQty4 field
     */
    public LegRatioQty4Field legRatioQty4() {
        return legRatioQty4;
    }

    /**
     * Side in strategy or time spread
     *
     * @return the LegSide4 field
     */
    public LegSide4Field legSide4() {
        return legSide4;
    }

    /**
     * Price in strategy or time spread
     *
     * @return the LegPrice4 field
     */
    public LegPrice4Field legPrice4() {
        return legPrice4;
    }

    /**
     * Symbol in strategy or time spread
     *
     * @return the LegSymbol5 field
     */
    public LegSymbol5Field legSymbol5() {
        return legSymbol5;
    }

    /**
     * Ratio in strategy or time spread
     *
     * @return the LegRatioQty5 field
     */
    public LegRatioQty5Field legRatioQty5() {
        return legRatioQty5;
    }

    /**
     * Side in strategy or time spread
     *
     * @return the LegSide5 field
     */
    public LegSide5Field legSide5() {
        return legSide5;
    }

    /**
     * Price in strategy or time spread
     *
     * @return the LegPrice5 field
     */
    public LegPrice5Field legPrice5() {
        return legPrice5;
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
        return Optional.empty();
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
        if (!familyCode.parse(data, cursor)) {
            return false;
        }
        cursor += FamilyCodeField.BYTE_LENGTH;
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
        if (!secDescription.parse(data, cursor)) {
            return false;
        }
        cursor += SecDescriptionField.BYTE_LENGTH;
        if (!underlyingAsset.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingAssetField.BYTE_LENGTH;
        if (!securitySubType.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySubTypeField.BYTE_LENGTH;
        if (!maturityMonthYear.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityMonthYearField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!strikeValue.parse(data, cursor)) {
            return false;
        }
        cursor += StrikeValueField.BYTE_LENGTH;
        if (!optAttribute.parse(data, cursor)) {
            return false;
        }
        cursor += OptAttributeField.BYTE_LENGTH;
        if (!minPriceIncrement.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceIncrementField.BYTE_LENGTH;
        if (!unitOfMeasure.parse(data, cursor)) {
            return false;
        }
        cursor += UnitOfMeasureField.BYTE_LENGTH;
        if (!settlMethod.parse(data, cursor)) {
            return false;
        }
        cursor += SettlMethodField.BYTE_LENGTH;
        if (!exerciseStyle.parse(data, cursor)) {
            return false;
        }
        cursor += ExerciseStyleField.BYTE_LENGTH;
        if (!putOrCall.parse(data, cursor)) {
            return false;
        }
        cursor += PutOrCallField.BYTE_LENGTH;
        if (!flexibleIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += FlexibleIndicatorField.BYTE_LENGTH;
        if (!lastTradingDay.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradingDayField.BYTE_LENGTH;
        if (!numberOfDecimals.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfDecimalsField.BYTE_LENGTH;
        if (!orderNumberOfDecimals.parse(data, cursor)) {
            return false;
        }
        cursor += OrderNumberOfDecimalsField.BYTE_LENGTH;
        if (!adjustmentsRule.parse(data, cursor)) {
            return false;
        }
        cursor += AdjustmentsRuleField.BYTE_LENGTH;
        if (!maximumOrderSize.parse(data, cursor)) {
            return false;
        }
        cursor += MaximumOrderSizeField.BYTE_LENGTH;
        if (!selfMatchPrevention.parse(data, cursor)) {
            return false;
        }
        cursor += SelfMatchPreventionField.BYTE_LENGTH;
        if (!commodityDerivativeIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CommodityDerivativeIndicatorField.BYTE_LENGTH;
        if (!stockWhenUnderlyingIsDividend.parse(data, cursor)) {
            return false;
        }
        cursor += StockWhenUnderlyingIsDividendField.BYTE_LENGTH;
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
        if (!baseCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += BaseCurrencyField.BYTE_LENGTH;
        if (!quotedCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += QuotedCurrencyField.BYTE_LENGTH;
        if (!maturityMonthYearIncrementUnits.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityMonthYearIncrementUnitsField.BYTE_LENGTH;
        if (!startMaturityMonthYear.parse(data, cursor)) {
            return false;
        }
        cursor += StartMaturityMonthYearField.BYTE_LENGTH;
        if (!endMaturityMonthYear.parse(data, cursor)) {
            return false;
        }
        cursor += EndMaturityMonthYearField.BYTE_LENGTH;
        if (!maturityMonthYearIncrement.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityMonthYearIncrementField.BYTE_LENGTH;
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
        if (!underlyingSecurityIssuerLei.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSecurityIssuerLeiField.BYTE_LENGTH;
        if (!xRollingClosingType.parse(data, cursor)) {
            return false;
        }
        cursor += XRollingClosingTypeField.BYTE_LENGTH;
        if (!xRollingReferenceBuyerRate.parse(data, cursor)) {
            return false;
        }
        cursor += XRollingReferenceBuyerRateField.BYTE_LENGTH;
        if (!xRollingBuyerMarkup.parse(data, cursor)) {
            return false;
        }
        cursor += XRollingBuyerMarkupField.BYTE_LENGTH;
        if (!xRollingReferenceSellerRate.parse(data, cursor)) {
            return false;
        }
        cursor += XRollingReferenceSellerRateField.BYTE_LENGTH;
        if (!xRollingSellerMarkup.parse(data, cursor)) {
            return false;
        }
        cursor += XRollingSellerMarkupField.BYTE_LENGTH;
        if (!xRollingDividendPercentage.parse(data, cursor)) {
            return false;
        }
        cursor += XRollingDividendPercentageField.BYTE_LENGTH;
        if (!xRollingDividendPayDateDiff.parse(data, cursor)) {
            return false;
        }
        cursor += XRollingDividendPayDateDiffField.BYTE_LENGTH;
        if (!legSymbol1.parse(data, cursor)) {
            return false;
        }
        cursor += LegSymbol1Field.BYTE_LENGTH;
        if (!legRatioQty1.parse(data, cursor)) {
            return false;
        }
        cursor += LegRatioQty1Field.BYTE_LENGTH;
        if (!legSide1.parse(data, cursor)) {
            return false;
        }
        cursor += LegSide1Field.BYTE_LENGTH;
        if (!legPrice1.parse(data, cursor)) {
            return false;
        }
        cursor += LegPrice1Field.BYTE_LENGTH;
        if (!legSymbol2.parse(data, cursor)) {
            return false;
        }
        cursor += LegSymbol2Field.BYTE_LENGTH;
        if (!legRatioQty2.parse(data, cursor)) {
            return false;
        }
        cursor += LegRatioQty2Field.BYTE_LENGTH;
        if (!legSide2.parse(data, cursor)) {
            return false;
        }
        cursor += LegSide2Field.BYTE_LENGTH;
        if (!legPrice2.parse(data, cursor)) {
            return false;
        }
        cursor += LegPrice2Field.BYTE_LENGTH;
        if (!legSymbol3.parse(data, cursor)) {
            return false;
        }
        cursor += LegSymbol3Field.BYTE_LENGTH;
        if (!legRatioQty3.parse(data, cursor)) {
            return false;
        }
        cursor += LegRatioQty3Field.BYTE_LENGTH;
        if (!legSide3.parse(data, cursor)) {
            return false;
        }
        cursor += LegSide3Field.BYTE_LENGTH;
        if (!legPrice3.parse(data, cursor)) {
            return false;
        }
        cursor += LegPrice3Field.BYTE_LENGTH;
        if (!legSymbol4.parse(data, cursor)) {
            return false;
        }
        cursor += LegSymbol4Field.BYTE_LENGTH;
        if (!legRatioQty4.parse(data, cursor)) {
            return false;
        }
        cursor += LegRatioQty4Field.BYTE_LENGTH;
        if (!legSide4.parse(data, cursor)) {
            return false;
        }
        cursor += LegSide4Field.BYTE_LENGTH;
        if (!legPrice4.parse(data, cursor)) {
            return false;
        }
        cursor += LegPrice4Field.BYTE_LENGTH;
        if (!legSymbol5.parse(data, cursor)) {
            return false;
        }
        cursor += LegSymbol5Field.BYTE_LENGTH;
        if (!legRatioQty5.parse(data, cursor)) {
            return false;
        }
        cursor += LegRatioQty5Field.BYTE_LENGTH;
        if (!legSide5.parse(data, cursor)) {
            return false;
        }
        cursor += LegSide5Field.BYTE_LENGTH;
        return legPrice5.parse(data, cursor);
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
        cursor = familyCode.encode(data, cursor);
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
        cursor = secDescription.encode(data, cursor);
        cursor = underlyingAsset.encode(data, cursor);
        cursor = securitySubType.encode(data, cursor);
        cursor = maturityMonthYear.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = strikeValue.encode(data, cursor);
        cursor = optAttribute.encode(data, cursor);
        cursor = minPriceIncrement.encode(data, cursor);
        cursor = unitOfMeasure.encode(data, cursor);
        cursor = settlMethod.encode(data, cursor);
        cursor = exerciseStyle.encode(data, cursor);
        cursor = putOrCall.encode(data, cursor);
        cursor = flexibleIndicator.encode(data, cursor);
        cursor = lastTradingDay.encode(data, cursor);
        cursor = numberOfDecimals.encode(data, cursor);
        cursor = orderNumberOfDecimals.encode(data, cursor);
        cursor = adjustmentsRule.encode(data, cursor);
        cursor = maximumOrderSize.encode(data, cursor);
        cursor = selfMatchPrevention.encode(data, cursor);
        cursor = commodityDerivativeIndicator.encode(data, cursor);
        cursor = stockWhenUnderlyingIsDividend.encode(data, cursor);
        cursor = baseProduct.encode(data, cursor);
        cursor = subProduct.encode(data, cursor);
        cursor = furtherSubProduct.encode(data, cursor);
        cursor = baseCurrency.encode(data, cursor);
        cursor = quotedCurrency.encode(data, cursor);
        cursor = maturityMonthYearIncrementUnits.encode(data, cursor);
        cursor = startMaturityMonthYear.encode(data, cursor);
        cursor = endMaturityMonthYear.encode(data, cursor);
        cursor = maturityMonthYearIncrement.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = underlyingIsin.encode(data, cursor);
        cursor = underlyingCurrency.encode(data, cursor);
        cursor = underlyingSecurityIssuerLei.encode(data, cursor);
        cursor = xRollingClosingType.encode(data, cursor);
        cursor = xRollingReferenceBuyerRate.encode(data, cursor);
        cursor = xRollingBuyerMarkup.encode(data, cursor);
        cursor = xRollingReferenceSellerRate.encode(data, cursor);
        cursor = xRollingSellerMarkup.encode(data, cursor);
        cursor = xRollingDividendPercentage.encode(data, cursor);
        cursor = xRollingDividendPayDateDiff.encode(data, cursor);
        cursor = legSymbol1.encode(data, cursor);
        cursor = legRatioQty1.encode(data, cursor);
        cursor = legSide1.encode(data, cursor);
        cursor = legPrice1.encode(data, cursor);
        cursor = legSymbol2.encode(data, cursor);
        cursor = legRatioQty2.encode(data, cursor);
        cursor = legSide2.encode(data, cursor);
        cursor = legPrice2.encode(data, cursor);
        cursor = legSymbol3.encode(data, cursor);
        cursor = legRatioQty3.encode(data, cursor);
        cursor = legSide3.encode(data, cursor);
        cursor = legPrice3.encode(data, cursor);
        cursor = legSymbol4.encode(data, cursor);
        cursor = legRatioQty4.encode(data, cursor);
        cursor = legSide4.encode(data, cursor);
        cursor = legPrice4.encode(data, cursor);
        cursor = legSymbol5.encode(data, cursor);
        cursor = legRatioQty5.encode(data, cursor);
        cursor = legSide5.encode(data, cursor);
        cursor = legPrice5.encode(data, cursor);
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
            case "FamilyCode" -> Optional.of(familyCode);
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
            case "SecDescription" -> Optional.of(secDescription);
            case "UnderlyingAsset" -> Optional.of(underlyingAsset);
            case "SecuritySubType" -> Optional.of(securitySubType);
            case "MaturityMonthYear" -> Optional.of(maturityMonthYear);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "StrikeValue" -> Optional.of(strikeValue);
            case "OptAttribute" -> Optional.of(optAttribute);
            case "MinPriceIncrement" -> Optional.of(minPriceIncrement);
            case "UnitOfMeasure" -> Optional.of(unitOfMeasure);
            case "SettlMethod" -> Optional.of(settlMethod);
            case "ExerciseStyle" -> Optional.of(exerciseStyle);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "FlexibleIndicator" -> Optional.of(flexibleIndicator);
            case "LastTradingDay" -> Optional.of(lastTradingDay);
            case "NumberOfDecimals" -> Optional.of(numberOfDecimals);
            case "OrderNumberOfDecimals" -> Optional.of(orderNumberOfDecimals);
            case "AdjustmentsRule" -> Optional.of(adjustmentsRule);
            case "MaximumOrderSize" -> Optional.of(maximumOrderSize);
            case "SelfMatchPrevention" -> Optional.of(selfMatchPrevention);
            case "CommodityDerivativeIndicator" -> Optional.of(commodityDerivativeIndicator);
            case "StockWhenUnderlyingIsDividend" -> Optional.of(stockWhenUnderlyingIsDividend);
            case "BaseProduct" -> Optional.of(baseProduct);
            case "SubProduct" -> Optional.of(subProduct);
            case "FurtherSubProduct" -> Optional.of(furtherSubProduct);
            case "BaseCurrency" -> Optional.of(baseCurrency);
            case "QuotedCurrency" -> Optional.of(quotedCurrency);
            case "MaturityMonthYearIncrementUnits" -> Optional.of(maturityMonthYearIncrementUnits);
            case "StartMaturityMonthYear" -> Optional.of(startMaturityMonthYear);
            case "EndMaturityMonthYear" -> Optional.of(endMaturityMonthYear);
            case "MaturityMonthYearIncrement" -> Optional.of(maturityMonthYearIncrement);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "UnderlyingIsin" -> Optional.of(underlyingIsin);
            case "UnderlyingCurrency" -> Optional.of(underlyingCurrency);
            case "UnderlyingSecurityIssuerLei" -> Optional.of(underlyingSecurityIssuerLei);
            case "XRollingClosingType" -> Optional.of(xRollingClosingType);
            case "XRollingReferenceBuyerRate" -> Optional.of(xRollingReferenceBuyerRate);
            case "XRollingBuyerMarkup" -> Optional.of(xRollingBuyerMarkup);
            case "XRollingReferenceSellerRate" -> Optional.of(xRollingReferenceSellerRate);
            case "XRollingSellerMarkup" -> Optional.of(xRollingSellerMarkup);
            case "XRollingDividendPercentage" -> Optional.of(xRollingDividendPercentage);
            case "XRollingDividendPayDateDiff" -> Optional.of(xRollingDividendPayDateDiff);
            case "LegSymbol1" -> Optional.of(legSymbol1);
            case "LegRatioQty1" -> Optional.of(legRatioQty1);
            case "LegSide1" -> Optional.of(legSide1);
            case "LegPrice1" -> Optional.of(legPrice1);
            case "LegSymbol2" -> Optional.of(legSymbol2);
            case "LegRatioQty2" -> Optional.of(legRatioQty2);
            case "LegSide2" -> Optional.of(legSide2);
            case "LegPrice2" -> Optional.of(legPrice2);
            case "LegSymbol3" -> Optional.of(legSymbol3);
            case "LegRatioQty3" -> Optional.of(legRatioQty3);
            case "LegSide3" -> Optional.of(legSide3);
            case "LegPrice3" -> Optional.of(legPrice3);
            case "LegSymbol4" -> Optional.of(legSymbol4);
            case "LegRatioQty4" -> Optional.of(legRatioQty4);
            case "LegSide4" -> Optional.of(legSide4);
            case "LegPrice4" -> Optional.of(legPrice4);
            case "LegSymbol5" -> Optional.of(legSymbol5);
            case "LegRatioQty5" -> Optional.of(legRatioQty5);
            case "LegSide5" -> Optional.of(legSide5);
            case "LegPrice5" -> Optional.of(legPrice5);
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
