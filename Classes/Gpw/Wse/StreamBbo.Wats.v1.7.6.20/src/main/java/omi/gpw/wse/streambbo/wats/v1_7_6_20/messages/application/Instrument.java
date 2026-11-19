package omi.gpw.wse.streambbo.wats.v1_7_6_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.AccruedInterestValueField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.BondCouponTypeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.CalendarIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.CfiField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.CollarGroupIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.CurrencyField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.DescriptionField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ExerciseTypeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ExpiryDateField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ExternalUnderlyingIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.FirstTradingDateField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.FisnField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.IcebergMinValueField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.InitialPhaseIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.InstrumentIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.IsLeverageField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.IssueSizeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.IssuerField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.IssuerRegCountryField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.KidField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.KidIssueDateField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.LastTradingDateField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.LiquidityField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.LotSizeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.MarketModelTypeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.MarketStructureIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.MicField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.MultiplierMultiplierField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.NominalCurrencyField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.NominalValuePriceField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.NominalValueTypeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.OptionTypeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.PreTradeCheckMaxPriceField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.PreTradeCheckMaxQuantityField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.PreTradeCheckMaxValueField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.PreTradeCheckMinPriceField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.PreTradeCheckMinQuantityField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.PreTradeCheckMinValueField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.PriceExpressionTypeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ProductCodeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ProductIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ProductIdentificationProductIdentificationField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ProductIdentificationTypeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ProductNameField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ProductSubtypeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ProductTypeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ReferenceInstrumentIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ReferencePriceField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.SettlementCalendarIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.SettlementTypeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.StatusField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.StrikePriceCurrencyField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.StrikePriceField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ThresholdMaxField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ThresholdMinField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.TickTableIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.TradingScheduleIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.UnderlyingInstrumentIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.UsIndicatorField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ValueAtRiskField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.VersionNumberField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.Message;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.PrintOptions;

/**
 * Represents the Instrument message from the StreamBbo protocol.
 *
 * <p>Definition of a financial instrument</p>
 */
public final class Instrument implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 699;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Instrument";

    /**
     * ID of financial instrument
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Type of the product
     */
    private final ProductTypeField productType = new ProductTypeField();

    /**
     * Subtype of the product
     */
    private final ProductSubtypeField productSubtype = new ProductSubtypeField();

    /**
     * First trading day of the financial instrument
     */
    private final FirstTradingDateField firstTradingDate = new FirstTradingDateField();

    /**
     * Last trading day of the financial instrument
     */
    private final LastTradingDateField lastTradingDate = new LastTradingDateField();

    /**
     * Reference to financial product definition
     */
    private final ProductIdField productId = new ProductIdField();

    /**
     * Trading currency (e.g
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Minimum iceberg order value
     */
    private final IcebergMinValueField icebergMinValue = new IcebergMinValueField();

    /**
     * Lot size for the instrument
     */
    private final LotSizeField lotSize = new LotSizeField();

    /**
     * Price expression type for the financial instrument
     */
    private final PriceExpressionTypeField priceExpressionType = new PriceExpressionTypeField();

    /**
     * Calendar ID
     */
    private final CalendarIdField calendarId = new CalendarIdField();

    /**
     * ID of the financial instrument’s market segment
     */
    private final MarketStructureIdField marketStructureId = new MarketStructureIdField();

    /**
     * Tick table ID
     */
    private final TickTableIdField tickTableId = new TickTableIdField();

    /**
     * Identifier of reference instrument
     */
    private final ReferenceInstrumentIdField referenceInstrumentId = new ReferenceInstrumentIdField();

    /**
     * Collar group ID
     */
    private final CollarGroupIdField collarGroupId = new CollarGroupIdField();

    /**
     * Trading schedule ID
     */
    private final TradingScheduleIdField tradingScheduleId = new TradingScheduleIdField();

    /**
     * Financial instrument code
     */
    private final DescriptionField description = new DescriptionField();

    /**
     * Market structure's Market Identifier Code (MIC) as specified in ISO 10383
     */
    private final MicField mic = new MicField();

    /**
     * Nominal value of the financial instrument
     */
    private final NominalValuePriceField nominalValuePrice = new NominalValuePriceField();

    /**
     * Type of the product's nominal value (no nominal, constant or unknown)
     */
    private final NominalValueTypeField nominalValueType = new NominalValueTypeField();

    /**
     * Product value multiplier
     */
    private final MultiplierMultiplierField multiplierMultiplier = new MultiplierMultiplierField();

    /**
     * Product strike price
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Strike Price Currency
     */
    private final StrikePriceCurrencyField strikePriceCurrency = new StrikePriceCurrencyField();

    /**
     * Product identification
     */
    private final ProductIdentificationProductIdentificationField productIdentificationProductIdentification = new ProductIdentificationProductIdentificationField();

    /**
     * Product identification type
     */
    private final ProductIdentificationTypeField productIdentificationType = new ProductIdentificationTypeField();

    /**
     * Settlement calendar ID
     */
    private final SettlementCalendarIdField settlementCalendarId = new SettlementCalendarIdField();

    /**
     * Coupon type for a bond
     */
    private final BondCouponTypeField bondCouponType = new BondCouponTypeField();

    /**
     * Minimum order price for pre-trade check
     */
    private final PreTradeCheckMinPriceField preTradeCheckMinPrice = new PreTradeCheckMinPriceField();

    /**
     * Maximum order price for pre-trade check
     */
    private final PreTradeCheckMaxPriceField preTradeCheckMaxPrice = new PreTradeCheckMaxPriceField();

    /**
     * Minimum volume for pre-trade check
     */
    private final PreTradeCheckMinQuantityField preTradeCheckMinQuantity = new PreTradeCheckMinQuantityField();

    /**
     * Maximum volume for pre-trade check
     */
    private final PreTradeCheckMaxQuantityField preTradeCheckMaxQuantity = new PreTradeCheckMaxQuantityField();

    /**
     * Maximum value for pre-trade check
     */
    private final PreTradeCheckMaxValueField preTradeCheckMaxValue = new PreTradeCheckMaxValueField();

    /**
     * Minimum value for pre-trade check
     */
    private final PreTradeCheckMinValueField preTradeCheckMinValue = new PreTradeCheckMinValueField();

    /**
     * Liquidity flag, true - liquid, false - Illiquid
     */
    private final LiquidityField liquidity = new LiquidityField();

    /**
     * Market model type
     */
    private final MarketModelTypeField marketModelType = new MarketModelTypeField();

    /**
     * Name of the issuer
     */
    private final IssuerField issuer = new IssuerField();

    /**
     * Identifier of the country of the registration
     */
    private final IssuerRegCountryField issuerRegCountry = new IssuerRegCountryField();

    /**
     * Identifier of the underlying instrument
     */
    private final UnderlyingInstrumentIdField underlyingInstrumentId = new UnderlyingInstrumentIdField();

    /**
     * Product code
     */
    private final ProductCodeField productCode = new ProductCodeField();

    /**
     * CFI (Classification of Financial Instrument) code
     */
    private final CfiField cfi = new CfiField();

    /**
     * Product FISN (Financial Instrument Short Name) code
     */
    private final FisnField fisn = new FisnField();

    /**
     * Size of the issue (depends on the issue size type)
     */
    private final IssueSizeField issueSize = new IssueSizeField();

    /**
     * Nominal currency
     */
    private final NominalCurrencyField nominalCurrency = new NominalCurrencyField();

    /**
     * Identifier of the us indicator
     */
    private final UsIndicatorField usIndicator = new UsIndicatorField();

    /**
     * Expiration date
     */
    private final ExpiryDateField expiryDate = new ExpiryDateField();

    /**
     * Version of the derivative
     */
    private final VersionNumberField versionNumber = new VersionNumberField();

    /**
     * Identifier of settlement type
     */
    private final SettlementTypeField settlementType = new SettlementTypeField();

    /**
     * Identifier of option type
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * Identifier of exercise style
     */
    private final ExerciseTypeField exerciseType = new ExerciseTypeField();

    /**
     * Product name
     */
    private final ProductNameField productName = new ProductNameField();

    /**
     * Reference price
     */
    private final ReferencePriceField referencePrice = new ReferencePriceField();

    /**
     * Instrument status
     */
    private final StatusField status = new StatusField();

    /**
     * Id of starting phase for the instrument
     */
    private final InitialPhaseIdField initialPhaseId = new InitialPhaseIdField();

    /**
     * upper threshold for leveraged instruments
     */
    private final ThresholdMaxField thresholdMax = new ThresholdMaxField();

    /**
     * lower threshold for leveraged instruments
     */
    private final ThresholdMinField thresholdMin = new ThresholdMinField();

    /**
     * Identifier of leverage instruments
     */
    private final IsLeverageField isLeverage = new IsLeverageField();

    /**
     * Accrued iterest value of the instrument
     */
    private final AccruedInterestValueField accruedInterestValue = new AccruedInterestValueField();

    /**
     * KID
     */
    private final KidField kid = new KidField();

    /**
     * KID issue date
     */
    private final KidIssueDateField kidIssueDate = new KidIssueDateField();

    /**
     * Value at risk
     */
    private final ValueAtRiskField valueAtRisk = new ValueAtRiskField();

    /**
     * External underlying ID
     */
    private final ExternalUnderlyingIdField externalUnderlyingId = new ExternalUnderlyingIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, productType, productSubtype, firstTradingDate, lastTradingDate, productId, currency, icebergMinValue, lotSize, priceExpressionType, calendarId, marketStructureId, tickTableId, referenceInstrumentId, collarGroupId, tradingScheduleId, description, mic, nominalValuePrice, nominalValueType, multiplierMultiplier, strikePrice, strikePriceCurrency, productIdentificationProductIdentification, productIdentificationType, settlementCalendarId, bondCouponType, preTradeCheckMinPrice, preTradeCheckMaxPrice, preTradeCheckMinQuantity, preTradeCheckMaxQuantity, preTradeCheckMaxValue, preTradeCheckMinValue, liquidity, marketModelType, issuer, issuerRegCountry, underlyingInstrumentId, productCode, cfi, fisn, issueSize, nominalCurrency, usIndicator, expiryDate, versionNumber, settlementType, optionType, exerciseType, productName, referencePrice, status, initialPhaseId, thresholdMax, thresholdMin, isLeverage, accruedInterestValue, kid, kidIssueDate, valueAtRisk, externalUnderlyingId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID of financial instrument
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Type of the product
     *
     * @return the ProductType field
     */
    public ProductTypeField productType() {
        return productType;
    }

    /**
     * Subtype of the product
     *
     * @return the ProductSubtype field
     */
    public ProductSubtypeField productSubtype() {
        return productSubtype;
    }

    /**
     * First trading day of the financial instrument
     *
     * @return the FirstTradingDate field
     */
    public FirstTradingDateField firstTradingDate() {
        return firstTradingDate;
    }

    /**
     * Last trading day of the financial instrument
     *
     * @return the LastTradingDate field
     */
    public LastTradingDateField lastTradingDate() {
        return lastTradingDate;
    }

    /**
     * Reference to financial product definition
     *
     * @return the ProductId field
     */
    public ProductIdField productId() {
        return productId;
    }

    /**
     * Trading currency (e.g
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Minimum iceberg order value
     *
     * @return the IcebergMinValue field
     */
    public IcebergMinValueField icebergMinValue() {
        return icebergMinValue;
    }

    /**
     * Lot size for the instrument
     *
     * @return the LotSize field
     */
    public LotSizeField lotSize() {
        return lotSize;
    }

    /**
     * Price expression type for the financial instrument
     *
     * @return the PriceExpressionType field
     */
    public PriceExpressionTypeField priceExpressionType() {
        return priceExpressionType;
    }

    /**
     * Calendar ID
     *
     * @return the CalendarId field
     */
    public CalendarIdField calendarId() {
        return calendarId;
    }

    /**
     * ID of the financial instrument’s market segment
     *
     * @return the MarketStructureId field
     */
    public MarketStructureIdField marketStructureId() {
        return marketStructureId;
    }

    /**
     * Tick table ID
     *
     * @return the TickTableId field
     */
    public TickTableIdField tickTableId() {
        return tickTableId;
    }

    /**
     * Identifier of reference instrument
     *
     * @return the ReferenceInstrumentId field
     */
    public ReferenceInstrumentIdField referenceInstrumentId() {
        return referenceInstrumentId;
    }

    /**
     * Collar group ID
     *
     * @return the CollarGroupId field
     */
    public CollarGroupIdField collarGroupId() {
        return collarGroupId;
    }

    /**
     * Trading schedule ID
     *
     * @return the TradingScheduleId field
     */
    public TradingScheduleIdField tradingScheduleId() {
        return tradingScheduleId;
    }

    /**
     * Financial instrument code
     *
     * @return the Description field
     */
    public DescriptionField description() {
        return description;
    }

    /**
     * Market structure's Market Identifier Code (MIC) as specified in ISO 10383
     *
     * @return the Mic field
     */
    public MicField mic() {
        return mic;
    }

    /**
     * Nominal value of the financial instrument
     *
     * @return the NominalValuePrice field
     */
    public NominalValuePriceField nominalValuePrice() {
        return nominalValuePrice;
    }

    /**
     * Type of the product's nominal value (no nominal, constant or unknown)
     *
     * @return the NominalValueType field
     */
    public NominalValueTypeField nominalValueType() {
        return nominalValueType;
    }

    /**
     * Product value multiplier
     *
     * @return the MultiplierMultiplier field
     */
    public MultiplierMultiplierField multiplierMultiplier() {
        return multiplierMultiplier;
    }

    /**
     * Product strike price
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Strike Price Currency
     *
     * @return the StrikePriceCurrency field
     */
    public StrikePriceCurrencyField strikePriceCurrency() {
        return strikePriceCurrency;
    }

    /**
     * Product identification
     *
     * @return the ProductIdentificationProductIdentification field
     */
    public ProductIdentificationProductIdentificationField productIdentificationProductIdentification() {
        return productIdentificationProductIdentification;
    }

    /**
     * Product identification type
     *
     * @return the ProductIdentificationType field
     */
    public ProductIdentificationTypeField productIdentificationType() {
        return productIdentificationType;
    }

    /**
     * Settlement calendar ID
     *
     * @return the SettlementCalendarId field
     */
    public SettlementCalendarIdField settlementCalendarId() {
        return settlementCalendarId;
    }

    /**
     * Coupon type for a bond
     *
     * @return the BondCouponType field
     */
    public BondCouponTypeField bondCouponType() {
        return bondCouponType;
    }

    /**
     * Minimum order price for pre-trade check
     *
     * @return the PreTradeCheckMinPrice field
     */
    public PreTradeCheckMinPriceField preTradeCheckMinPrice() {
        return preTradeCheckMinPrice;
    }

    /**
     * Maximum order price for pre-trade check
     *
     * @return the PreTradeCheckMaxPrice field
     */
    public PreTradeCheckMaxPriceField preTradeCheckMaxPrice() {
        return preTradeCheckMaxPrice;
    }

    /**
     * Minimum volume for pre-trade check
     *
     * @return the PreTradeCheckMinQuantity field
     */
    public PreTradeCheckMinQuantityField preTradeCheckMinQuantity() {
        return preTradeCheckMinQuantity;
    }

    /**
     * Maximum volume for pre-trade check
     *
     * @return the PreTradeCheckMaxQuantity field
     */
    public PreTradeCheckMaxQuantityField preTradeCheckMaxQuantity() {
        return preTradeCheckMaxQuantity;
    }

    /**
     * Maximum value for pre-trade check
     *
     * @return the PreTradeCheckMaxValue field
     */
    public PreTradeCheckMaxValueField preTradeCheckMaxValue() {
        return preTradeCheckMaxValue;
    }

    /**
     * Minimum value for pre-trade check
     *
     * @return the PreTradeCheckMinValue field
     */
    public PreTradeCheckMinValueField preTradeCheckMinValue() {
        return preTradeCheckMinValue;
    }

    /**
     * Liquidity flag, true - liquid, false - Illiquid
     *
     * @return the Liquidity field
     */
    public LiquidityField liquidity() {
        return liquidity;
    }

    /**
     * Market model type
     *
     * @return the MarketModelType field
     */
    public MarketModelTypeField marketModelType() {
        return marketModelType;
    }

    /**
     * Name of the issuer
     *
     * @return the Issuer field
     */
    public IssuerField issuer() {
        return issuer;
    }

    /**
     * Identifier of the country of the registration
     *
     * @return the IssuerRegCountry field
     */
    public IssuerRegCountryField issuerRegCountry() {
        return issuerRegCountry;
    }

    /**
     * Identifier of the underlying instrument
     *
     * @return the UnderlyingInstrumentId field
     */
    public UnderlyingInstrumentIdField underlyingInstrumentId() {
        return underlyingInstrumentId;
    }

    /**
     * Product code
     *
     * @return the ProductCode field
     */
    public ProductCodeField productCode() {
        return productCode;
    }

    /**
     * CFI (Classification of Financial Instrument) code
     *
     * @return the Cfi field
     */
    public CfiField cfi() {
        return cfi;
    }

    /**
     * Product FISN (Financial Instrument Short Name) code
     *
     * @return the Fisn field
     */
    public FisnField fisn() {
        return fisn;
    }

    /**
     * Size of the issue (depends on the issue size type)
     *
     * @return the IssueSize field
     */
    public IssueSizeField issueSize() {
        return issueSize;
    }

    /**
     * Nominal currency
     *
     * @return the NominalCurrency field
     */
    public NominalCurrencyField nominalCurrency() {
        return nominalCurrency;
    }

    /**
     * Identifier of the us indicator
     *
     * @return the UsIndicator field
     */
    public UsIndicatorField usIndicator() {
        return usIndicator;
    }

    /**
     * Expiration date
     *
     * @return the ExpiryDate field
     */
    public ExpiryDateField expiryDate() {
        return expiryDate;
    }

    /**
     * Version of the derivative
     *
     * @return the VersionNumber field
     */
    public VersionNumberField versionNumber() {
        return versionNumber;
    }

    /**
     * Identifier of settlement type
     *
     * @return the SettlementType field
     */
    public SettlementTypeField settlementType() {
        return settlementType;
    }

    /**
     * Identifier of option type
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
    }

    /**
     * Identifier of exercise style
     *
     * @return the ExerciseType field
     */
    public ExerciseTypeField exerciseType() {
        return exerciseType;
    }

    /**
     * Product name
     *
     * @return the ProductName field
     */
    public ProductNameField productName() {
        return productName;
    }

    /**
     * Reference price
     *
     * @return the ReferencePrice field
     */
    public ReferencePriceField referencePrice() {
        return referencePrice;
    }

    /**
     * Instrument status
     *
     * @return the Status field
     */
    public StatusField status() {
        return status;
    }

    /**
     * Id of starting phase for the instrument
     *
     * @return the InitialPhaseId field
     */
    public InitialPhaseIdField initialPhaseId() {
        return initialPhaseId;
    }

    /**
     * upper threshold for leveraged instruments
     *
     * @return the ThresholdMax field
     */
    public ThresholdMaxField thresholdMax() {
        return thresholdMax;
    }

    /**
     * lower threshold for leveraged instruments
     *
     * @return the ThresholdMin field
     */
    public ThresholdMinField thresholdMin() {
        return thresholdMin;
    }

    /**
     * Identifier of leverage instruments
     *
     * @return the IsLeverage field
     */
    public IsLeverageField isLeverage() {
        return isLeverage;
    }

    /**
     * Accrued iterest value of the instrument
     *
     * @return the AccruedInterestValue field
     */
    public AccruedInterestValueField accruedInterestValue() {
        return accruedInterestValue;
    }

    /**
     * KID
     *
     * @return the Kid field
     */
    public KidField kid() {
        return kid;
    }

    /**
     * KID issue date
     *
     * @return the KidIssueDate field
     */
    public KidIssueDateField kidIssueDate() {
        return kidIssueDate;
    }

    /**
     * Value at risk
     *
     * @return the ValueAtRisk field
     */
    public ValueAtRiskField valueAtRisk() {
        return valueAtRisk;
    }

    /**
     * External underlying ID
     *
     * @return the ExternalUnderlyingId field
     */
    public ExternalUnderlyingIdField externalUnderlyingId() {
        return externalUnderlyingId;
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
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!productType.parse(data, cursor)) {
            return false;
        }
        cursor += ProductTypeField.BYTE_LENGTH;
        if (!productSubtype.parse(data, cursor)) {
            return false;
        }
        cursor += ProductSubtypeField.BYTE_LENGTH;
        if (!firstTradingDate.parse(data, cursor)) {
            return false;
        }
        cursor += FirstTradingDateField.BYTE_LENGTH;
        if (!lastTradingDate.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradingDateField.BYTE_LENGTH;
        if (!productId.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!icebergMinValue.parse(data, cursor)) {
            return false;
        }
        cursor += IcebergMinValueField.BYTE_LENGTH;
        if (!lotSize.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeField.BYTE_LENGTH;
        if (!priceExpressionType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceExpressionTypeField.BYTE_LENGTH;
        if (!calendarId.parse(data, cursor)) {
            return false;
        }
        cursor += CalendarIdField.BYTE_LENGTH;
        if (!marketStructureId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketStructureIdField.BYTE_LENGTH;
        if (!tickTableId.parse(data, cursor)) {
            return false;
        }
        cursor += TickTableIdField.BYTE_LENGTH;
        if (!referenceInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += ReferenceInstrumentIdField.BYTE_LENGTH;
        if (!collarGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += CollarGroupIdField.BYTE_LENGTH;
        if (!tradingScheduleId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingScheduleIdField.BYTE_LENGTH;
        if (!description.parse(data, cursor)) {
            return false;
        }
        cursor += DescriptionField.BYTE_LENGTH;
        if (!mic.parse(data, cursor)) {
            return false;
        }
        cursor += MicField.BYTE_LENGTH;
        if (!nominalValuePrice.parse(data, cursor)) {
            return false;
        }
        cursor += NominalValuePriceField.BYTE_LENGTH;
        if (!nominalValueType.parse(data, cursor)) {
            return false;
        }
        cursor += NominalValueTypeField.BYTE_LENGTH;
        if (!multiplierMultiplier.parse(data, cursor)) {
            return false;
        }
        cursor += MultiplierMultiplierField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!strikePriceCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceCurrencyField.BYTE_LENGTH;
        if (!productIdentificationProductIdentification.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdentificationProductIdentificationField.BYTE_LENGTH;
        if (!productIdentificationType.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdentificationTypeField.BYTE_LENGTH;
        if (!settlementCalendarId.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementCalendarIdField.BYTE_LENGTH;
        if (!bondCouponType.parse(data, cursor)) {
            return false;
        }
        cursor += BondCouponTypeField.BYTE_LENGTH;
        if (!preTradeCheckMinPrice.parse(data, cursor)) {
            return false;
        }
        cursor += PreTradeCheckMinPriceField.BYTE_LENGTH;
        if (!preTradeCheckMaxPrice.parse(data, cursor)) {
            return false;
        }
        cursor += PreTradeCheckMaxPriceField.BYTE_LENGTH;
        if (!preTradeCheckMinQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += PreTradeCheckMinQuantityField.BYTE_LENGTH;
        if (!preTradeCheckMaxQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += PreTradeCheckMaxQuantityField.BYTE_LENGTH;
        if (!preTradeCheckMaxValue.parse(data, cursor)) {
            return false;
        }
        cursor += PreTradeCheckMaxValueField.BYTE_LENGTH;
        if (!preTradeCheckMinValue.parse(data, cursor)) {
            return false;
        }
        cursor += PreTradeCheckMinValueField.BYTE_LENGTH;
        if (!liquidity.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityField.BYTE_LENGTH;
        if (!marketModelType.parse(data, cursor)) {
            return false;
        }
        cursor += MarketModelTypeField.BYTE_LENGTH;
        if (!issuer.parse(data, cursor)) {
            return false;
        }
        cursor += IssuerField.BYTE_LENGTH;
        if (!issuerRegCountry.parse(data, cursor)) {
            return false;
        }
        cursor += IssuerRegCountryField.BYTE_LENGTH;
        if (!underlyingInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingInstrumentIdField.BYTE_LENGTH;
        if (!productCode.parse(data, cursor)) {
            return false;
        }
        cursor += ProductCodeField.BYTE_LENGTH;
        if (!cfi.parse(data, cursor)) {
            return false;
        }
        cursor += CfiField.BYTE_LENGTH;
        if (!fisn.parse(data, cursor)) {
            return false;
        }
        cursor += FisnField.BYTE_LENGTH;
        if (!issueSize.parse(data, cursor)) {
            return false;
        }
        cursor += IssueSizeField.BYTE_LENGTH;
        if (!nominalCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += NominalCurrencyField.BYTE_LENGTH;
        if (!usIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += UsIndicatorField.BYTE_LENGTH;
        if (!expiryDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDateField.BYTE_LENGTH;
        if (!versionNumber.parse(data, cursor)) {
            return false;
        }
        cursor += VersionNumberField.BYTE_LENGTH;
        if (!settlementType.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementTypeField.BYTE_LENGTH;
        if (!optionType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionTypeField.BYTE_LENGTH;
        if (!exerciseType.parse(data, cursor)) {
            return false;
        }
        cursor += ExerciseTypeField.BYTE_LENGTH;
        if (!productName.parse(data, cursor)) {
            return false;
        }
        cursor += ProductNameField.BYTE_LENGTH;
        if (!referencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ReferencePriceField.BYTE_LENGTH;
        if (!status.parse(data, cursor)) {
            return false;
        }
        cursor += StatusField.BYTE_LENGTH;
        if (!initialPhaseId.parse(data, cursor)) {
            return false;
        }
        cursor += InitialPhaseIdField.BYTE_LENGTH;
        if (!thresholdMax.parse(data, cursor)) {
            return false;
        }
        cursor += ThresholdMaxField.BYTE_LENGTH;
        if (!thresholdMin.parse(data, cursor)) {
            return false;
        }
        cursor += ThresholdMinField.BYTE_LENGTH;
        if (!isLeverage.parse(data, cursor)) {
            return false;
        }
        cursor += IsLeverageField.BYTE_LENGTH;
        if (!accruedInterestValue.parse(data, cursor)) {
            return false;
        }
        cursor += AccruedInterestValueField.BYTE_LENGTH;
        if (!kid.parse(data, cursor)) {
            return false;
        }
        cursor += KidField.BYTE_LENGTH;
        if (!kidIssueDate.parse(data, cursor)) {
            return false;
        }
        cursor += KidIssueDateField.BYTE_LENGTH;
        if (!valueAtRisk.parse(data, cursor)) {
            return false;
        }
        cursor += ValueAtRiskField.BYTE_LENGTH;
        return externalUnderlyingId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = productType.encode(data, cursor);
        cursor = productSubtype.encode(data, cursor);
        cursor = firstTradingDate.encode(data, cursor);
        cursor = lastTradingDate.encode(data, cursor);
        cursor = productId.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = icebergMinValue.encode(data, cursor);
        cursor = lotSize.encode(data, cursor);
        cursor = priceExpressionType.encode(data, cursor);
        cursor = calendarId.encode(data, cursor);
        cursor = marketStructureId.encode(data, cursor);
        cursor = tickTableId.encode(data, cursor);
        cursor = referenceInstrumentId.encode(data, cursor);
        cursor = collarGroupId.encode(data, cursor);
        cursor = tradingScheduleId.encode(data, cursor);
        cursor = description.encode(data, cursor);
        cursor = mic.encode(data, cursor);
        cursor = nominalValuePrice.encode(data, cursor);
        cursor = nominalValueType.encode(data, cursor);
        cursor = multiplierMultiplier.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = strikePriceCurrency.encode(data, cursor);
        cursor = productIdentificationProductIdentification.encode(data, cursor);
        cursor = productIdentificationType.encode(data, cursor);
        cursor = settlementCalendarId.encode(data, cursor);
        cursor = bondCouponType.encode(data, cursor);
        cursor = preTradeCheckMinPrice.encode(data, cursor);
        cursor = preTradeCheckMaxPrice.encode(data, cursor);
        cursor = preTradeCheckMinQuantity.encode(data, cursor);
        cursor = preTradeCheckMaxQuantity.encode(data, cursor);
        cursor = preTradeCheckMaxValue.encode(data, cursor);
        cursor = preTradeCheckMinValue.encode(data, cursor);
        cursor = liquidity.encode(data, cursor);
        cursor = marketModelType.encode(data, cursor);
        cursor = issuer.encode(data, cursor);
        cursor = issuerRegCountry.encode(data, cursor);
        cursor = underlyingInstrumentId.encode(data, cursor);
        cursor = productCode.encode(data, cursor);
        cursor = cfi.encode(data, cursor);
        cursor = fisn.encode(data, cursor);
        cursor = issueSize.encode(data, cursor);
        cursor = nominalCurrency.encode(data, cursor);
        cursor = usIndicator.encode(data, cursor);
        cursor = expiryDate.encode(data, cursor);
        cursor = versionNumber.encode(data, cursor);
        cursor = settlementType.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = exerciseType.encode(data, cursor);
        cursor = productName.encode(data, cursor);
        cursor = referencePrice.encode(data, cursor);
        cursor = status.encode(data, cursor);
        cursor = initialPhaseId.encode(data, cursor);
        cursor = thresholdMax.encode(data, cursor);
        cursor = thresholdMin.encode(data, cursor);
        cursor = isLeverage.encode(data, cursor);
        cursor = accruedInterestValue.encode(data, cursor);
        cursor = kid.encode(data, cursor);
        cursor = kidIssueDate.encode(data, cursor);
        cursor = valueAtRisk.encode(data, cursor);
        cursor = externalUnderlyingId.encode(data, cursor);
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "ProductType" -> Optional.of(productType);
            case "ProductSubtype" -> Optional.of(productSubtype);
            case "FirstTradingDate" -> Optional.of(firstTradingDate);
            case "LastTradingDate" -> Optional.of(lastTradingDate);
            case "ProductId" -> Optional.of(productId);
            case "Currency" -> Optional.of(currency);
            case "IcebergMinValue" -> Optional.of(icebergMinValue);
            case "LotSize" -> Optional.of(lotSize);
            case "PriceExpressionType" -> Optional.of(priceExpressionType);
            case "CalendarId" -> Optional.of(calendarId);
            case "MarketStructureId" -> Optional.of(marketStructureId);
            case "TickTableId" -> Optional.of(tickTableId);
            case "ReferenceInstrumentId" -> Optional.of(referenceInstrumentId);
            case "CollarGroupId" -> Optional.of(collarGroupId);
            case "TradingScheduleId" -> Optional.of(tradingScheduleId);
            case "Description" -> Optional.of(description);
            case "Mic" -> Optional.of(mic);
            case "NominalValuePrice" -> Optional.of(nominalValuePrice);
            case "NominalValueType" -> Optional.of(nominalValueType);
            case "MultiplierMultiplier" -> Optional.of(multiplierMultiplier);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "StrikePriceCurrency" -> Optional.of(strikePriceCurrency);
            case "ProductIdentificationProductIdentification" -> Optional.of(productIdentificationProductIdentification);
            case "ProductIdentificationType" -> Optional.of(productIdentificationType);
            case "SettlementCalendarId" -> Optional.of(settlementCalendarId);
            case "BondCouponType" -> Optional.of(bondCouponType);
            case "PreTradeCheckMinPrice" -> Optional.of(preTradeCheckMinPrice);
            case "PreTradeCheckMaxPrice" -> Optional.of(preTradeCheckMaxPrice);
            case "PreTradeCheckMinQuantity" -> Optional.of(preTradeCheckMinQuantity);
            case "PreTradeCheckMaxQuantity" -> Optional.of(preTradeCheckMaxQuantity);
            case "PreTradeCheckMaxValue" -> Optional.of(preTradeCheckMaxValue);
            case "PreTradeCheckMinValue" -> Optional.of(preTradeCheckMinValue);
            case "Liquidity" -> Optional.of(liquidity);
            case "MarketModelType" -> Optional.of(marketModelType);
            case "Issuer" -> Optional.of(issuer);
            case "IssuerRegCountry" -> Optional.of(issuerRegCountry);
            case "UnderlyingInstrumentId" -> Optional.of(underlyingInstrumentId);
            case "ProductCode" -> Optional.of(productCode);
            case "Cfi" -> Optional.of(cfi);
            case "Fisn" -> Optional.of(fisn);
            case "IssueSize" -> Optional.of(issueSize);
            case "NominalCurrency" -> Optional.of(nominalCurrency);
            case "UsIndicator" -> Optional.of(usIndicator);
            case "ExpiryDate" -> Optional.of(expiryDate);
            case "VersionNumber" -> Optional.of(versionNumber);
            case "SettlementType" -> Optional.of(settlementType);
            case "OptionType" -> Optional.of(optionType);
            case "ExerciseType" -> Optional.of(exerciseType);
            case "ProductName" -> Optional.of(productName);
            case "ReferencePrice" -> Optional.of(referencePrice);
            case "Status" -> Optional.of(status);
            case "InitialPhaseId" -> Optional.of(initialPhaseId);
            case "ThresholdMax" -> Optional.of(thresholdMax);
            case "ThresholdMin" -> Optional.of(thresholdMin);
            case "IsLeverage" -> Optional.of(isLeverage);
            case "AccruedInterestValue" -> Optional.of(accruedInterestValue);
            case "Kid" -> Optional.of(kid);
            case "KidIssueDate" -> Optional.of(kidIssueDate);
            case "ValueAtRisk" -> Optional.of(valueAtRisk);
            case "ExternalUnderlyingId" -> Optional.of(externalUnderlyingId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof Instrument message)) {
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
        if (!(other instanceof Instrument message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
