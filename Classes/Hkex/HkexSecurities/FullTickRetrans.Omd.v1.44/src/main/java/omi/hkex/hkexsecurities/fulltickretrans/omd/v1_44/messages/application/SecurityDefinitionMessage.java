package omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.AccruedInterestField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.BondMaturityDateField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.CallPriceField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.CallPutFlagField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.CasFlagField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.CcassFlagField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.ConversionRatioField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.CouponRateField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.CurrencyCodeField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.DecimalsInCallPriceField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.DecimalsInEntitlementField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.DecimalsInFaceValueField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.DelistingDateField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.DomainStmtSecurityCodeField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.DummySecurityFlagField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.EfnFlagField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.EntitlementField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.FaceValueCurrencyField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.FaceValueField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.FreeTextField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.InstrumentTypeField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.InvestorTypeField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.IsinCodeField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.ListingDateField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.LotSizeField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.MarketCodeField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.NoUnderlyingSecuritiesField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.NoWarrantsPerEntitlementField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.PosFlagField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.PosLowerLimitField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.PosUpperLimitField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.PreviousClosingPriceField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.ProductTypeField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.SecurityCodeField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.SecurityNameGbField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.SecurityNameGccsField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.SecurityShortNameField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.ShortSellFlagField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.SpreadTableCodeField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.StampDutyFlagField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.StrikePrice1Field;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.StrikePrice2Field;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.StyleField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.VcmFlagField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.WarrantMaturityDateField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.fields.WarrantTypeField;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.groups.UnderlyingSecurityEntry;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.groups.UnderlyingSecurityList;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.types.Field;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.types.Message;
import omi.hkex.hkexsecurities.fulltickretrans.omd.v1_44.types.PrintOptions;

/**
 * Represents the SecurityDefinitionMessage message from the FullTickRetrans protocol.
 *
 * <p>The Security Definition message contains all the reference data for a security. Security Definition messages may be received intraday (for example the FreeText field may be updated during the day).</p>
 */
public final class SecurityDefinitionMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 540;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Definition Message";

    /**
     * Uniquely identifies a security available for trading. 5 digit security codes with possible values 1 to 99999.
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Market segment identifier.
     */
    private final MarketCodeField marketCode = new MarketCodeField();

    /**
     * ISIN code of the security.
     */
    private final IsinCodeField isinCode = new IsinCodeField();

    /**
     * Instrument type of the security.
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * Product type of the security.
     */
    private final ProductTypeField productType = new ProductTypeField();

    /**
     * Spread table code of the security.
     */
    private final SpreadTableCodeField spreadTableCode = new SpreadTableCodeField();

    /**
     * Security short name.
     */
    private final SecurityShortNameField securityShortName = new SecurityShortNameField();

    /**
     * Base currency code of the market segment.
     */
    private final CurrencyCodeField currencyCode = new CurrencyCodeField();

    /**
     * Security name in Traditional Chinese using Unicode UTF-16LE encoding.
     */
    private final SecurityNameGccsField securityNameGccs = new SecurityNameGccsField();

    /**
     * Security name in Simplified Chinese using Unicode UTF-16LE encoding.
     */
    private final SecurityNameGbField securityNameGb = new SecurityNameGbField();

    /**
     * Board lot size for the security.
     */
    private final LotSizeField lotSize = new LotSizeField();

    /**
     * Previous closing price of the security, or NAV published by issuer for ETF or L&amp;I Product on the trading day before its first day listing. 3 implied decimal places.
     */
    private final PreviousClosingPriceField previousClosingPrice = new PreviousClosingPriceField();

    /**
     * Indicates whether Volatility Control Mechanism (VCM) is applicable to the security.
     */
    private final VcmFlagField vcmFlag = new VcmFlagField();

    /**
     * Indicator for short-sell authorization.
     */
    private final ShortSellFlagField shortSellFlag = new ShortSellFlagField();

    /**
     * Indicates whether Closing Auction Session (CAS) is applicable to the security.
     */
    private final CasFlagField casFlag = new CasFlagField();

    /**
     * Indicates whether or not the security is a CCASS security.
     */
    private final CcassFlagField ccassFlag = new CcassFlagField();

    /**
     * Dummy Security Flag.
     */
    private final DummySecurityFlagField dummySecurityFlag = new DummySecurityFlagField();

    /**
     * Indicator for stamp duty requirement.
     */
    private final StampDutyFlagField stampDutyFlag = new StampDutyFlagField();

    /**
     * Date of security listing. YYYYMMDD. Value is 19000101 for unknown listing date.
     */
    private final ListingDateField listingDate = new ListingDateField();

    /**
     * Date of security delisting. YYYYMMDD. Value is 0 if no date exists.
     */
    private final DelistingDateField delistingDate = new DelistingDateField();

    /**
     * Free text associated to the security. When there is no free text, spaces are present instead.
     */
    private final FreeTextField freeText = new FreeTextField();

    /**
     * Indicates whether Pre-Opening Session (POS) is applicable to the security.
     */
    private final PosFlagField posFlag = new PosFlagField();

    /**
     * Upper price limit of all orders in POS Order Input period, and At-auction Limit sell order in POS No Cancellation and Random Matching periods. 3 implied decimal places. 0 means Not available.
     */
    private final PosUpperLimitField posUpperLimit = new PosUpperLimitField();

    /**
     * Lower price limit of all orders in POS Order Input period, and At-auction Limit buy order in POS No Cancellation and Random Matching periods. 3 implied decimal places. 0 means Not available.
     */
    private final PosLowerLimitField posLowerLimit = new PosLowerLimitField();

    /**
     * Security code of the corresponding Domain Settlement Counter. Value is 0 if the security itself is already the domain settlement counter.
     */
    private final DomainStmtSecurityCodeField domainStmtSecurityCode = new DomainStmtSecurityCodeField();

    /**
     * EFN Indicator (Bonds Specific Data).
     */
    private final EfnFlagField efnFlag = new EfnFlagField();

    /**
     * Accrued interest of the security. 3 implied decimal places.
     */
    private final AccruedInterestField accruedInterest = new AccruedInterestField();

    /**
     * Coupon rate of a bond security. 3 implied decimal places.
     */
    private final CouponRateField couponRate = new CouponRateField();

    /**
     * Face value of a bond security. See DecimalsInFaceValue for the number of decimal places. 0 means Not available.
     */
    private final FaceValueField faceValue = new FaceValueField();

    /**
     * Number of decimal places in Face Value. Not applicable if FaceValue = 0.
     */
    private final DecimalsInFaceValueField decimalsInFaceValue = new DecimalsInFaceValueField();

    /**
     * Currency code of Face Value.
     */
    private final FaceValueCurrencyField faceValueCurrency = new FaceValueCurrencyField();

    /**
     * Date of maturity of a bond security. YYYYMMDD.
     */
    private final BondMaturityDateField bondMaturityDate = new BondMaturityDateField();

    /**
     * Investor type of a bond security.
     */
    private final InvestorTypeField investorType = new InvestorTypeField();

    /**
     * Conversion ratio for Structured Product. 3 implied decimal places. 0 means Not available.
     */
    private final ConversionRatioField conversionRatio = new ConversionRatioField();

    /**
     * Strike price of the security if it has only one strike price, or Lower strike price of the security if it has lower and upper strike prices. 3 implied decimal places.
     */
    private final StrikePrice1Field strikePrice1 = new StrikePrice1Field();

    /**
     * Upper strike price of the security if it has lower and upper strike prices. 3 implied decimal places. Value is 0 if the security has only one strike price.
     */
    private final StrikePrice2Field strikePrice2 = new StrikePrice2Field();

    /**
     * Date of maturity of a bond security. YYYYMMDD.
     */
    private final WarrantMaturityDateField warrantMaturityDate = new WarrantMaturityDateField();

    /**
     * Indicator of whether the warrant or structured product is a call or put option.
     */
    private final CallPutFlagField callPutFlag = new CallPutFlagField();

    /**
     * Style of the warrant.
     */
    private final StyleField style = new StyleField();

    /**
     * Warrant type of the warrant.
     */
    private final WarrantTypeField warrantType = new WarrantTypeField();

    /**
     * Call price for CBBC. See DecimalsInCallPrice for the number of decimal places. 0 means Not available.
     */
    private final CallPriceField callPrice = new CallPriceField();

    /**
     * Number of decimal places in Call Price. Not applicable if CallPrice = 0.
     */
    private final DecimalsInCallPriceField decimalsInCallPrice = new DecimalsInCallPriceField();

    /**
     * Entitlement of the warrant. See DecimalsInEntitlement for the number of decimal places. 0 means Not available.
     */
    private final EntitlementField entitlement = new EntitlementField();

    /**
     * Number of decimal places in Entitlement. Not applicable if Entitlement = 0.
     */
    private final DecimalsInEntitlementField decimalsInEntitlement = new DecimalsInEntitlementField();

    /**
     * Number of warrants per entitlement. Not applicable if Entitlement = 0.
     */
    private final NoWarrantsPerEntitlementField noWarrantsPerEntitlement = new NoWarrantsPerEntitlementField();

    /**
     * Number of underlying securities if the underlying security is defined in Security Definition (11) message. 0 for structured product of which the underlying is not a security defined in Security Definition, 1 for structured product of which the underlying is defined.
     */
    private final NoUnderlyingSecuritiesField noUnderlyingSecurities = new NoUnderlyingSecuritiesField();

    /**
     * Repeating group of underlying security references.
     */
    private final UnderlyingSecurityList underlyingSecurity = new UnderlyingSecurityList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityCode, marketCode, isinCode, instrumentType, productType, spreadTableCode, securityShortName, currencyCode, securityNameGccs, securityNameGb, lotSize, previousClosingPrice, vcmFlag, shortSellFlag, casFlag, ccassFlag, dummySecurityFlag, stampDutyFlag, listingDate, delistingDate, freeText, posFlag, posUpperLimit, posLowerLimit, domainStmtSecurityCode, efnFlag, accruedInterest, couponRate, faceValue, decimalsInFaceValue, faceValueCurrency, bondMaturityDate, investorType, conversionRatio, strikePrice1, strikePrice2, warrantMaturityDate, callPutFlag, style, warrantType, callPrice, decimalsInCallPrice, entitlement, decimalsInEntitlement, noWarrantsPerEntitlement, noUnderlyingSecurities);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Uniquely identifies a security available for trading. 5 digit security codes with possible values 1 to 99999.
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Market segment identifier.
     *
     * @return the MarketCode field
     */
    public MarketCodeField marketCode() {
        return marketCode;
    }

    /**
     * ISIN code of the security.
     *
     * @return the IsinCode field
     */
    public IsinCodeField isinCode() {
        return isinCode;
    }

    /**
     * Instrument type of the security.
     *
     * @return the InstrumentType field
     */
    public InstrumentTypeField instrumentType() {
        return instrumentType;
    }

    /**
     * Product type of the security.
     *
     * @return the ProductType field
     */
    public ProductTypeField productType() {
        return productType;
    }

    /**
     * Spread table code of the security.
     *
     * @return the SpreadTableCode field
     */
    public SpreadTableCodeField spreadTableCode() {
        return spreadTableCode;
    }

    /**
     * Security short name.
     *
     * @return the SecurityShortName field
     */
    public SecurityShortNameField securityShortName() {
        return securityShortName;
    }

    /**
     * Base currency code of the market segment.
     *
     * @return the CurrencyCode field
     */
    public CurrencyCodeField currencyCode() {
        return currencyCode;
    }

    /**
     * Security name in Traditional Chinese using Unicode UTF-16LE encoding.
     *
     * @return the SecurityNameGccs field
     */
    public SecurityNameGccsField securityNameGccs() {
        return securityNameGccs;
    }

    /**
     * Security name in Simplified Chinese using Unicode UTF-16LE encoding.
     *
     * @return the SecurityNameGb field
     */
    public SecurityNameGbField securityNameGb() {
        return securityNameGb;
    }

    /**
     * Board lot size for the security.
     *
     * @return the LotSize field
     */
    public LotSizeField lotSize() {
        return lotSize;
    }

    /**
     * Previous closing price of the security, or NAV published by issuer for ETF or L&amp;I Product on the trading day before its first day listing. 3 implied decimal places.
     *
     * @return the PreviousClosingPrice field
     */
    public PreviousClosingPriceField previousClosingPrice() {
        return previousClosingPrice;
    }

    /**
     * Indicates whether Volatility Control Mechanism (VCM) is applicable to the security.
     *
     * @return the VcmFlag field
     */
    public VcmFlagField vcmFlag() {
        return vcmFlag;
    }

    /**
     * Indicator for short-sell authorization.
     *
     * @return the ShortSellFlag field
     */
    public ShortSellFlagField shortSellFlag() {
        return shortSellFlag;
    }

    /**
     * Indicates whether Closing Auction Session (CAS) is applicable to the security.
     *
     * @return the CasFlag field
     */
    public CasFlagField casFlag() {
        return casFlag;
    }

    /**
     * Indicates whether or not the security is a CCASS security.
     *
     * @return the CcassFlag field
     */
    public CcassFlagField ccassFlag() {
        return ccassFlag;
    }

    /**
     * Dummy Security Flag.
     *
     * @return the DummySecurityFlag field
     */
    public DummySecurityFlagField dummySecurityFlag() {
        return dummySecurityFlag;
    }

    /**
     * Indicator for stamp duty requirement.
     *
     * @return the StampDutyFlag field
     */
    public StampDutyFlagField stampDutyFlag() {
        return stampDutyFlag;
    }

    /**
     * Date of security listing. YYYYMMDD. Value is 19000101 for unknown listing date.
     *
     * @return the ListingDate field
     */
    public ListingDateField listingDate() {
        return listingDate;
    }

    /**
     * Date of security delisting. YYYYMMDD. Value is 0 if no date exists.
     *
     * @return the DelistingDate field
     */
    public DelistingDateField delistingDate() {
        return delistingDate;
    }

    /**
     * Free text associated to the security. When there is no free text, spaces are present instead.
     *
     * @return the FreeText field
     */
    public FreeTextField freeText() {
        return freeText;
    }

    /**
     * Indicates whether Pre-Opening Session (POS) is applicable to the security.
     *
     * @return the PosFlag field
     */
    public PosFlagField posFlag() {
        return posFlag;
    }

    /**
     * Upper price limit of all orders in POS Order Input period, and At-auction Limit sell order in POS No Cancellation and Random Matching periods. 3 implied decimal places. 0 means Not available.
     *
     * @return the PosUpperLimit field
     */
    public PosUpperLimitField posUpperLimit() {
        return posUpperLimit;
    }

    /**
     * Lower price limit of all orders in POS Order Input period, and At-auction Limit buy order in POS No Cancellation and Random Matching periods. 3 implied decimal places. 0 means Not available.
     *
     * @return the PosLowerLimit field
     */
    public PosLowerLimitField posLowerLimit() {
        return posLowerLimit;
    }

    /**
     * Security code of the corresponding Domain Settlement Counter. Value is 0 if the security itself is already the domain settlement counter.
     *
     * @return the DomainStmtSecurityCode field
     */
    public DomainStmtSecurityCodeField domainStmtSecurityCode() {
        return domainStmtSecurityCode;
    }

    /**
     * EFN Indicator (Bonds Specific Data).
     *
     * @return the EfnFlag field
     */
    public EfnFlagField efnFlag() {
        return efnFlag;
    }

    /**
     * Accrued interest of the security. 3 implied decimal places.
     *
     * @return the AccruedInterest field
     */
    public AccruedInterestField accruedInterest() {
        return accruedInterest;
    }

    /**
     * Coupon rate of a bond security. 3 implied decimal places.
     *
     * @return the CouponRate field
     */
    public CouponRateField couponRate() {
        return couponRate;
    }

    /**
     * Face value of a bond security. See DecimalsInFaceValue for the number of decimal places. 0 means Not available.
     *
     * @return the FaceValue field
     */
    public FaceValueField faceValue() {
        return faceValue;
    }

    /**
     * Number of decimal places in Face Value. Not applicable if FaceValue = 0.
     *
     * @return the DecimalsInFaceValue field
     */
    public DecimalsInFaceValueField decimalsInFaceValue() {
        return decimalsInFaceValue;
    }

    /**
     * Currency code of Face Value.
     *
     * @return the FaceValueCurrency field
     */
    public FaceValueCurrencyField faceValueCurrency() {
        return faceValueCurrency;
    }

    /**
     * Date of maturity of a bond security. YYYYMMDD.
     *
     * @return the BondMaturityDate field
     */
    public BondMaturityDateField bondMaturityDate() {
        return bondMaturityDate;
    }

    /**
     * Investor type of a bond security.
     *
     * @return the InvestorType field
     */
    public InvestorTypeField investorType() {
        return investorType;
    }

    /**
     * Conversion ratio for Structured Product. 3 implied decimal places. 0 means Not available.
     *
     * @return the ConversionRatio field
     */
    public ConversionRatioField conversionRatio() {
        return conversionRatio;
    }

    /**
     * Strike price of the security if it has only one strike price, or Lower strike price of the security if it has lower and upper strike prices. 3 implied decimal places.
     *
     * @return the StrikePrice1 field
     */
    public StrikePrice1Field strikePrice1() {
        return strikePrice1;
    }

    /**
     * Upper strike price of the security if it has lower and upper strike prices. 3 implied decimal places. Value is 0 if the security has only one strike price.
     *
     * @return the StrikePrice2 field
     */
    public StrikePrice2Field strikePrice2() {
        return strikePrice2;
    }

    /**
     * Date of maturity of a bond security. YYYYMMDD.
     *
     * @return the WarrantMaturityDate field
     */
    public WarrantMaturityDateField warrantMaturityDate() {
        return warrantMaturityDate;
    }

    /**
     * Indicator of whether the warrant or structured product is a call or put option.
     *
     * @return the CallPutFlag field
     */
    public CallPutFlagField callPutFlag() {
        return callPutFlag;
    }

    /**
     * Style of the warrant.
     *
     * @return the Style field
     */
    public StyleField style() {
        return style;
    }

    /**
     * Warrant type of the warrant.
     *
     * @return the WarrantType field
     */
    public WarrantTypeField warrantType() {
        return warrantType;
    }

    /**
     * Call price for CBBC. See DecimalsInCallPrice for the number of decimal places. 0 means Not available.
     *
     * @return the CallPrice field
     */
    public CallPriceField callPrice() {
        return callPrice;
    }

    /**
     * Number of decimal places in Call Price. Not applicable if CallPrice = 0.
     *
     * @return the DecimalsInCallPrice field
     */
    public DecimalsInCallPriceField decimalsInCallPrice() {
        return decimalsInCallPrice;
    }

    /**
     * Entitlement of the warrant. See DecimalsInEntitlement for the number of decimal places. 0 means Not available.
     *
     * @return the Entitlement field
     */
    public EntitlementField entitlement() {
        return entitlement;
    }

    /**
     * Number of decimal places in Entitlement. Not applicable if Entitlement = 0.
     *
     * @return the DecimalsInEntitlement field
     */
    public DecimalsInEntitlementField decimalsInEntitlement() {
        return decimalsInEntitlement;
    }

    /**
     * Number of warrants per entitlement. Not applicable if Entitlement = 0.
     *
     * @return the NoWarrantsPerEntitlement field
     */
    public NoWarrantsPerEntitlementField noWarrantsPerEntitlement() {
        return noWarrantsPerEntitlement;
    }

    /**
     * Number of underlying securities if the underlying security is defined in Security Definition (11) message. 0 for structured product of which the underlying is not a security defined in Security Definition, 1 for structured product of which the underlying is defined.
     *
     * @return the NoUnderlyingSecurities field
     */
    public NoUnderlyingSecuritiesField noUnderlyingSecurities() {
        return noUnderlyingSecurities;
    }

    /**
     * Repeating group of underlying security references.
     *
     * <p>Encode writes this list's size to the NoUnderlyingSecurities field.</p>
     *
     * @return the UnderlyingSecurity entries
     */
    public UnderlyingSecurityList underlyingSecurity() {
        return underlyingSecurity;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + underlyingSecurity.byteLength();
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
        cursor += 4;
        cursor += 4;
        cursor += 12;
        cursor += 4;
        cursor += 1;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 2;
        cursor += 40;
        cursor += 3;
        cursor += 60;
        cursor += 60;
        cursor += 4;
        runs.add(cursor).add(4);
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 4;
        cursor += 4;
        cursor += 38;
        runs.add(cursor).add(62);
        cursor += 62;
        cursor += 1;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        runs.add(cursor).add(37);
        cursor += 37;
        cursor += 1;
        cursor += 4;
        cursor += 4;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 8;
        cursor += 1;
        cursor += 3;
        cursor += 4;
        cursor += 1;
        runs.add(cursor).add(44);
        cursor += 44;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        runs.add(cursor).add(2);
        cursor += 2;
        cursor += 1;
        cursor += 4;
        cursor += 1;
        cursor += 4;
        cursor += 1;
        cursor += 4;
        runs.add(cursor).add(63);
        cursor += 63;
        cursor += 2;
        cursor = underlyingSecurity.padding(runs, cursor);
        return cursor;
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!marketCode.parse(data, cursor)) {
            return false;
        }
        cursor += MarketCodeField.BYTE_LENGTH;
        if (!isinCode.parse(data, cursor)) {
            return false;
        }
        cursor += IsinCodeField.BYTE_LENGTH;
        if (!instrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTypeField.BYTE_LENGTH;
        if (!productType.parse(data, cursor)) {
            return false;
        }
        cursor += ProductTypeField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!spreadTableCode.parse(data, cursor)) {
            return false;
        }
        cursor += SpreadTableCodeField.BYTE_LENGTH;
        if (!securityShortName.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityShortNameField.BYTE_LENGTH;
        if (!currencyCode.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyCodeField.BYTE_LENGTH;
        if (!securityNameGccs.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityNameGccsField.BYTE_LENGTH;
        if (!securityNameGb.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityNameGbField.BYTE_LENGTH;
        if (!lotSize.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!previousClosingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousClosingPriceField.BYTE_LENGTH;
        if (!vcmFlag.parse(data, cursor)) {
            return false;
        }
        cursor += VcmFlagField.BYTE_LENGTH;
        if (!shortSellFlag.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSellFlagField.BYTE_LENGTH;
        if (!casFlag.parse(data, cursor)) {
            return false;
        }
        cursor += CasFlagField.BYTE_LENGTH;
        if (!ccassFlag.parse(data, cursor)) {
            return false;
        }
        cursor += CcassFlagField.BYTE_LENGTH;
        if (!dummySecurityFlag.parse(data, cursor)) {
            return false;
        }
        cursor += DummySecurityFlagField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!stampDutyFlag.parse(data, cursor)) {
            return false;
        }
        cursor += StampDutyFlagField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!listingDate.parse(data, cursor)) {
            return false;
        }
        cursor += ListingDateField.BYTE_LENGTH;
        if (!delistingDate.parse(data, cursor)) {
            return false;
        }
        cursor += DelistingDateField.BYTE_LENGTH;
        if (!freeText.parse(data, cursor)) {
            return false;
        }
        cursor += FreeTextField.BYTE_LENGTH;
        cursor += 62; // padding
        if (!posFlag.parse(data, cursor)) {
            return false;
        }
        cursor += PosFlagField.BYTE_LENGTH;
        if (!posUpperLimit.parse(data, cursor)) {
            return false;
        }
        cursor += PosUpperLimitField.BYTE_LENGTH;
        if (!posLowerLimit.parse(data, cursor)) {
            return false;
        }
        cursor += PosLowerLimitField.BYTE_LENGTH;
        if (!domainStmtSecurityCode.parse(data, cursor)) {
            return false;
        }
        cursor += DomainStmtSecurityCodeField.BYTE_LENGTH;
        cursor += 37; // padding
        if (!efnFlag.parse(data, cursor)) {
            return false;
        }
        cursor += EfnFlagField.BYTE_LENGTH;
        if (!accruedInterest.parse(data, cursor)) {
            return false;
        }
        cursor += AccruedInterestField.BYTE_LENGTH;
        if (!couponRate.parse(data, cursor)) {
            return false;
        }
        cursor += CouponRateField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!faceValue.parse(data, cursor)) {
            return false;
        }
        cursor += FaceValueField.BYTE_LENGTH;
        if (!decimalsInFaceValue.parse(data, cursor)) {
            return false;
        }
        cursor += DecimalsInFaceValueField.BYTE_LENGTH;
        if (!faceValueCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += FaceValueCurrencyField.BYTE_LENGTH;
        if (!bondMaturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += BondMaturityDateField.BYTE_LENGTH;
        if (!investorType.parse(data, cursor)) {
            return false;
        }
        cursor += InvestorTypeField.BYTE_LENGTH;
        cursor += 44; // padding
        if (!conversionRatio.parse(data, cursor)) {
            return false;
        }
        cursor += ConversionRatioField.BYTE_LENGTH;
        if (!strikePrice1.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePrice1Field.BYTE_LENGTH;
        if (!strikePrice2.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePrice2Field.BYTE_LENGTH;
        if (!warrantMaturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += WarrantMaturityDateField.BYTE_LENGTH;
        if (!callPutFlag.parse(data, cursor)) {
            return false;
        }
        cursor += CallPutFlagField.BYTE_LENGTH;
        if (!style.parse(data, cursor)) {
            return false;
        }
        cursor += StyleField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!warrantType.parse(data, cursor)) {
            return false;
        }
        cursor += WarrantTypeField.BYTE_LENGTH;
        if (!callPrice.parse(data, cursor)) {
            return false;
        }
        cursor += CallPriceField.BYTE_LENGTH;
        if (!decimalsInCallPrice.parse(data, cursor)) {
            return false;
        }
        cursor += DecimalsInCallPriceField.BYTE_LENGTH;
        if (!entitlement.parse(data, cursor)) {
            return false;
        }
        cursor += EntitlementField.BYTE_LENGTH;
        if (!decimalsInEntitlement.parse(data, cursor)) {
            return false;
        }
        cursor += DecimalsInEntitlementField.BYTE_LENGTH;
        if (!noWarrantsPerEntitlement.parse(data, cursor)) {
            return false;
        }
        cursor += NoWarrantsPerEntitlementField.BYTE_LENGTH;
        cursor += 63; // padding
        if (!noUnderlyingSecurities.parse(data, cursor)) {
            return false;
        }
        cursor += NoUnderlyingSecuritiesField.BYTE_LENGTH;
        if (!underlyingSecurity.parse(data, cursor, end, noUnderlyingSecurities.value())) {
            return false;
        }
        cursor += underlyingSecurity.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (underlyingSecurity.size() > 65535) {
            throw new IllegalStateException("underlyingSecurity holds " + underlyingSecurity.size() + " entries, more than its count field can state");
        }
        noUnderlyingSecurities.value(underlyingSecurity.size());
        int cursor = offset;
        cursor = securityCode.encode(data, cursor);
        cursor = marketCode.encode(data, cursor);
        cursor = isinCode.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = productType.encode(data, cursor);
        if (buffer != null && buffer.length >= 26) {
            System.arraycopy(buffer, 25, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = spreadTableCode.encode(data, cursor);
        cursor = securityShortName.encode(data, cursor);
        cursor = currencyCode.encode(data, cursor);
        cursor = securityNameGccs.encode(data, cursor);
        cursor = securityNameGb.encode(data, cursor);
        cursor = lotSize.encode(data, cursor);
        if (buffer != null && buffer.length >= 199) {
            System.arraycopy(buffer, 195, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = previousClosingPrice.encode(data, cursor);
        cursor = vcmFlag.encode(data, cursor);
        cursor = shortSellFlag.encode(data, cursor);
        cursor = casFlag.encode(data, cursor);
        cursor = ccassFlag.encode(data, cursor);
        cursor = dummySecurityFlag.encode(data, cursor);
        if (buffer != null && buffer.length >= 209) {
            System.arraycopy(buffer, 208, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = stampDutyFlag.encode(data, cursor);
        if (buffer != null && buffer.length >= 211) {
            System.arraycopy(buffer, 210, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = listingDate.encode(data, cursor);
        cursor = delistingDate.encode(data, cursor);
        cursor = freeText.encode(data, cursor);
        if (buffer != null && buffer.length >= 319) {
            System.arraycopy(buffer, 257, data, cursor, 62); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 62, (byte) 0); // padding
        }
        cursor += 62;
        cursor = posFlag.encode(data, cursor);
        cursor = posUpperLimit.encode(data, cursor);
        cursor = posLowerLimit.encode(data, cursor);
        cursor = domainStmtSecurityCode.encode(data, cursor);
        if (buffer != null && buffer.length >= 369) {
            System.arraycopy(buffer, 332, data, cursor, 37); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 37, (byte) 0); // padding
        }
        cursor += 37;
        cursor = efnFlag.encode(data, cursor);
        cursor = accruedInterest.encode(data, cursor);
        cursor = couponRate.encode(data, cursor);
        if (buffer != null && buffer.length >= 379) {
            System.arraycopy(buffer, 378, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = faceValue.encode(data, cursor);
        cursor = decimalsInFaceValue.encode(data, cursor);
        cursor = faceValueCurrency.encode(data, cursor);
        cursor = bondMaturityDate.encode(data, cursor);
        cursor = investorType.encode(data, cursor);
        if (buffer != null && buffer.length >= 440) {
            System.arraycopy(buffer, 396, data, cursor, 44); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 44, (byte) 0); // padding
        }
        cursor += 44;
        cursor = conversionRatio.encode(data, cursor);
        cursor = strikePrice1.encode(data, cursor);
        cursor = strikePrice2.encode(data, cursor);
        cursor = warrantMaturityDate.encode(data, cursor);
        cursor = callPutFlag.encode(data, cursor);
        cursor = style.encode(data, cursor);
        if (buffer != null && buffer.length >= 460) {
            System.arraycopy(buffer, 458, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = warrantType.encode(data, cursor);
        cursor = callPrice.encode(data, cursor);
        cursor = decimalsInCallPrice.encode(data, cursor);
        cursor = entitlement.encode(data, cursor);
        cursor = decimalsInEntitlement.encode(data, cursor);
        cursor = noWarrantsPerEntitlement.encode(data, cursor);
        if (buffer != null && buffer.length >= 538) {
            System.arraycopy(buffer, 475, data, cursor, 63); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 63, (byte) 0); // padding
        }
        cursor += 63;
        cursor = noUnderlyingSecurities.encode(data, cursor);
        cursor = underlyingSecurity.encode(data, cursor);
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
        underlyingSecurity.clear();
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
            if (field != noUnderlyingSecurities && !field.isRecognized()) {
                return false;
            }
        }
        return underlyingSecurity.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noUnderlyingSecurities && !field.isValid()) {
                return false;
            }
        }
        if (!underlyingSecurity.isValid()) {
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
        if (!securityCode.isDecoded()) {
            return Optional.of(securityCode);
        }
        if (!marketCode.isDecoded()) {
            return Optional.of(marketCode);
        }
        if (!isinCode.isDecoded()) {
            return Optional.of(isinCode);
        }
        if (!instrumentType.isDecoded()) {
            return Optional.of(instrumentType);
        }
        if (!productType.isDecoded()) {
            return Optional.of(productType);
        }
        if (!spreadTableCode.isDecoded()) {
            return Optional.of(spreadTableCode);
        }
        if (!securityShortName.isDecoded()) {
            return Optional.of(securityShortName);
        }
        if (!currencyCode.isDecoded()) {
            return Optional.of(currencyCode);
        }
        if (!securityNameGccs.isDecoded()) {
            return Optional.of(securityNameGccs);
        }
        if (!securityNameGb.isDecoded()) {
            return Optional.of(securityNameGb);
        }
        if (!lotSize.isDecoded()) {
            return Optional.of(lotSize);
        }
        if (!previousClosingPrice.isDecoded()) {
            return Optional.of(previousClosingPrice);
        }
        if (!vcmFlag.isDecoded()) {
            return Optional.of(vcmFlag);
        }
        if (!shortSellFlag.isDecoded()) {
            return Optional.of(shortSellFlag);
        }
        if (!casFlag.isDecoded()) {
            return Optional.of(casFlag);
        }
        if (!ccassFlag.isDecoded()) {
            return Optional.of(ccassFlag);
        }
        if (!dummySecurityFlag.isDecoded()) {
            return Optional.of(dummySecurityFlag);
        }
        if (!stampDutyFlag.isDecoded()) {
            return Optional.of(stampDutyFlag);
        }
        if (!listingDate.isDecoded()) {
            return Optional.of(listingDate);
        }
        if (!delistingDate.isDecoded()) {
            return Optional.of(delistingDate);
        }
        if (!freeText.isDecoded()) {
            return Optional.of(freeText);
        }
        if (!posFlag.isDecoded()) {
            return Optional.of(posFlag);
        }
        if (!posUpperLimit.isDecoded()) {
            return Optional.of(posUpperLimit);
        }
        if (!posLowerLimit.isDecoded()) {
            return Optional.of(posLowerLimit);
        }
        if (!domainStmtSecurityCode.isDecoded()) {
            return Optional.of(domainStmtSecurityCode);
        }
        if (!efnFlag.isDecoded()) {
            return Optional.of(efnFlag);
        }
        if (!accruedInterest.isDecoded()) {
            return Optional.of(accruedInterest);
        }
        if (!couponRate.isDecoded()) {
            return Optional.of(couponRate);
        }
        if (!faceValue.isDecoded()) {
            return Optional.of(faceValue);
        }
        if (!decimalsInFaceValue.isDecoded()) {
            return Optional.of(decimalsInFaceValue);
        }
        if (!faceValueCurrency.isDecoded()) {
            return Optional.of(faceValueCurrency);
        }
        if (!bondMaturityDate.isDecoded()) {
            return Optional.of(bondMaturityDate);
        }
        if (!investorType.isDecoded()) {
            return Optional.of(investorType);
        }
        if (!conversionRatio.isDecoded()) {
            return Optional.of(conversionRatio);
        }
        if (!strikePrice1.isDecoded()) {
            return Optional.of(strikePrice1);
        }
        if (!strikePrice2.isDecoded()) {
            return Optional.of(strikePrice2);
        }
        if (!warrantMaturityDate.isDecoded()) {
            return Optional.of(warrantMaturityDate);
        }
        if (!callPutFlag.isDecoded()) {
            return Optional.of(callPutFlag);
        }
        if (!style.isDecoded()) {
            return Optional.of(style);
        }
        if (!warrantType.isDecoded()) {
            return Optional.of(warrantType);
        }
        if (!callPrice.isDecoded()) {
            return Optional.of(callPrice);
        }
        if (!decimalsInCallPrice.isDecoded()) {
            return Optional.of(decimalsInCallPrice);
        }
        if (!entitlement.isDecoded()) {
            return Optional.of(entitlement);
        }
        if (!decimalsInEntitlement.isDecoded()) {
            return Optional.of(decimalsInEntitlement);
        }
        if (!noWarrantsPerEntitlement.isDecoded()) {
            return Optional.of(noWarrantsPerEntitlement);
        }
        if (!noUnderlyingSecurities.isDecoded()) {
            return Optional.of(noUnderlyingSecurities);
        }
        if (!underlyingSecurity.isDecoded()) {
            return Optional.of(underlyingSecurity.failedEntry().flatMap(UnderlyingSecurityEntry::failedAt).orElse(noUnderlyingSecurities));
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
            case "SecurityCode" -> Optional.of(securityCode);
            case "MarketCode" -> Optional.of(marketCode);
            case "IsinCode" -> Optional.of(isinCode);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "ProductType" -> Optional.of(productType);
            case "SpreadTableCode" -> Optional.of(spreadTableCode);
            case "SecurityShortName" -> Optional.of(securityShortName);
            case "CurrencyCode" -> Optional.of(currencyCode);
            case "SecurityNameGccs" -> Optional.of(securityNameGccs);
            case "SecurityNameGb" -> Optional.of(securityNameGb);
            case "LotSize" -> Optional.of(lotSize);
            case "PreviousClosingPrice" -> Optional.of(previousClosingPrice);
            case "VcmFlag" -> Optional.of(vcmFlag);
            case "ShortSellFlag" -> Optional.of(shortSellFlag);
            case "CasFlag" -> Optional.of(casFlag);
            case "CcassFlag" -> Optional.of(ccassFlag);
            case "DummySecurityFlag" -> Optional.of(dummySecurityFlag);
            case "StampDutyFlag" -> Optional.of(stampDutyFlag);
            case "ListingDate" -> Optional.of(listingDate);
            case "DelistingDate" -> Optional.of(delistingDate);
            case "FreeText" -> Optional.of(freeText);
            case "PosFlag" -> Optional.of(posFlag);
            case "PosUpperLimit" -> Optional.of(posUpperLimit);
            case "PosLowerLimit" -> Optional.of(posLowerLimit);
            case "DomainStmtSecurityCode" -> Optional.of(domainStmtSecurityCode);
            case "EfnFlag" -> Optional.of(efnFlag);
            case "AccruedInterest" -> Optional.of(accruedInterest);
            case "CouponRate" -> Optional.of(couponRate);
            case "FaceValue" -> Optional.of(faceValue);
            case "DecimalsInFaceValue" -> Optional.of(decimalsInFaceValue);
            case "FaceValueCurrency" -> Optional.of(faceValueCurrency);
            case "BondMaturityDate" -> Optional.of(bondMaturityDate);
            case "InvestorType" -> Optional.of(investorType);
            case "ConversionRatio" -> Optional.of(conversionRatio);
            case "StrikePrice1" -> Optional.of(strikePrice1);
            case "StrikePrice2" -> Optional.of(strikePrice2);
            case "WarrantMaturityDate" -> Optional.of(warrantMaturityDate);
            case "CallPutFlag" -> Optional.of(callPutFlag);
            case "Style" -> Optional.of(style);
            case "WarrantType" -> Optional.of(warrantType);
            case "CallPrice" -> Optional.of(callPrice);
            case "DecimalsInCallPrice" -> Optional.of(decimalsInCallPrice);
            case "Entitlement" -> Optional.of(entitlement);
            case "DecimalsInEntitlement" -> Optional.of(decimalsInEntitlement);
            case "NoWarrantsPerEntitlement" -> Optional.of(noWarrantsPerEntitlement);
            case "NoUnderlyingSecurities" -> Optional.of(noUnderlyingSecurities);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(underlyingSecurity.diffFields(message.underlyingSecurity));
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
            underlyingSecurity.toFormattedString(builder, options);
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
        underlyingSecurity.toFormattedString(builder, nested);
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
        if (!(other instanceof SecurityDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && underlyingSecurity.equals(message.underlyingSecurity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, underlyingSecurity);
    }
}
