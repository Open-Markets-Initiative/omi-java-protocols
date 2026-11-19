package omi.moex.spectra.optinforeplay.simba.v9_9_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.BaseContractIdIntField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.CfiCodeField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.ClearingSettlPriceField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.ContractMultiplierField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.CurrencyField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.DerivativeContractMultiplierField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.ExchangeTradingSessionIdInt32NullOptionalField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.FixedSpotDiscountField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.FlagsField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.GroupMaskIntField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.HighLimitPxField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.HighLimitPxWeekendField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.InitialMarginOnBuyField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.InitialMarginOnSellField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.InitialMarginSynteticField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.InterestRate2RiskDownField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.InterestRate2RiskUpField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.InterestRateRiskDownField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.InterestRateRiskUpField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.LowLimitPxField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.LowLimitPxWeekendField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.MarketSegmentIdField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.MinPriceIncrementAmountCurrField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.MinPriceIncrementAmountField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.MinPriceIncrementField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.NegativePricesField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.ProjectedSpotDiscountField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.RiskFreeRate2Field;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.RiskFreeRateField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.SectionIdIntField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.SecurityAltIdField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.SecurityAltIdSourceField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.SecurityIdField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.SecurityTradingStatusField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.SecurityTypeField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.SettlCurrencyField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.SettlPriceField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.SettlPriceOpenField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.StrikePriceField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.SymbolField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.TheorPriceField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.TheorPriceLimitField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.TotNumReportsField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.TradeModeIdField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.TradePeriodAccessField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.TradingSessionIdField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.UnderlyingCurrencyField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.UnderlyingQtyField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.ValuationMethodField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.fields.VolatilityField;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.structs.QuotationList;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.structs.SecurityDefinitionMessageNoEventsGroups;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.structs.SecurityDefinitionMessageNoInstrAttribGroups;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.structs.SecurityDefinitionMessageNoLegsGroups;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.structs.SecurityDefinitionMessageNoMDFeedTypesGroups;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.structs.SecurityDefinitionMessageNoUnderlyingsGroups;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.structs.SecurityDesc;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.types.Field;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.types.Message;
import omi.moex.spectra.optinforeplay.simba.v9_9_0.types.PrintOptions;

/**
 * Represents the SecurityDefinitionMessage message from the OptInfoReplay protocol.
 *
 * <p>SecurityDefinitionMessage</p>
 */
public final class SecurityDefinitionMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 361;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Definition Message";

    /**
     * TotNumReports
     */
    private final TotNumReportsField totNumReports = new TotNumReportsField();

    /**
     * Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * SecurityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * SecurityAltID
     */
    private final SecurityAltIdField securityAltId = new SecurityAltIdField();

    /**
     * SecurityAltIDSource
     */
    private final SecurityAltIdSourceField securityAltIdSource = new SecurityAltIdSourceField();

    /**
     * SecurityType
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * CFICode
     */
    private final CfiCodeField cfiCode = new CfiCodeField();

    /**
     * StrikePrice
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * ContractMultiplier
     */
    private final ContractMultiplierField contractMultiplier = new ContractMultiplierField();

    /**
     * SecurityTradingStatus
     */
    private final SecurityTradingStatusField securityTradingStatus = new SecurityTradingStatusField();

    /**
     * Currency
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * MarketSegmentID
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * TradingSessionID
     */
    private final TradingSessionIdField tradingSessionId = new TradingSessionIdField();

    /**
     * ExchangeTradingSessionID
     */
    private final ExchangeTradingSessionIdInt32NullOptionalField exchangeTradingSessionIdInt32NullOptional = new ExchangeTradingSessionIdInt32NullOptionalField();

    /**
     * Volatility
     */
    private final VolatilityField volatility = new VolatilityField();

    /**
     * HighLimitPx
     */
    private final HighLimitPxField highLimitPx = new HighLimitPxField();

    /**
     * LowLimitPx
     */
    private final LowLimitPxField lowLimitPx = new LowLimitPxField();

    /**
     * MinPriceIncrement
     */
    private final MinPriceIncrementField minPriceIncrement = new MinPriceIncrementField();

    /**
     * MinPriceIncrementAmount
     */
    private final MinPriceIncrementAmountField minPriceIncrementAmount = new MinPriceIncrementAmountField();

    /**
     * InitialMarginOnBuy
     */
    private final InitialMarginOnBuyField initialMarginOnBuy = new InitialMarginOnBuyField();

    /**
     * InitialMarginOnSell
     */
    private final InitialMarginOnSellField initialMarginOnSell = new InitialMarginOnSellField();

    /**
     * InitialMarginSyntetic
     */
    private final InitialMarginSynteticField initialMarginSyntetic = new InitialMarginSynteticField();

    /**
     * TheorPrice
     */
    private final TheorPriceField theorPrice = new TheorPriceField();

    /**
     * TheorPriceLimit
     */
    private final TheorPriceLimitField theorPriceLimit = new TheorPriceLimitField();

    /**
     * UnderlyingQty
     */
    private final UnderlyingQtyField underlyingQty = new UnderlyingQtyField();

    /**
     * UnderlyingCurrency
     */
    private final UnderlyingCurrencyField underlyingCurrency = new UnderlyingCurrencyField();

    /**
     * FlagsSet bit set
     */
    private final FlagsField flags = new FlagsField();

    /**
     * MinPriceIncrementAmountCurr
     */
    private final MinPriceIncrementAmountCurrField minPriceIncrementAmountCurr = new MinPriceIncrementAmountCurrField();

    /**
     * SettlPriceOpen
     */
    private final SettlPriceOpenField settlPriceOpen = new SettlPriceOpenField();

    /**
     * ValuationMethod
     */
    private final ValuationMethodField valuationMethod = new ValuationMethodField();

    /**
     * RiskFreeRate
     */
    private final RiskFreeRateField riskFreeRate = new RiskFreeRateField();

    /**
     * FixedSpotDiscount
     */
    private final FixedSpotDiscountField fixedSpotDiscount = new FixedSpotDiscountField();

    /**
     * ProjectedSpotDiscount
     */
    private final ProjectedSpotDiscountField projectedSpotDiscount = new ProjectedSpotDiscountField();

    /**
     * SettlCurrency
     */
    private final SettlCurrencyField settlCurrency = new SettlCurrencyField();

    /**
     * NegativePrices
     */
    private final NegativePricesField negativePrices = new NegativePricesField();

    /**
     * DerivativeContractMultiplier
     */
    private final DerivativeContractMultiplierField derivativeContractMultiplier = new DerivativeContractMultiplierField();

    /**
     * InterestRateRiskUp
     */
    private final InterestRateRiskUpField interestRateRiskUp = new InterestRateRiskUpField();

    /**
     * InterestRateRiskDown
     */
    private final InterestRateRiskDownField interestRateRiskDown = new InterestRateRiskDownField();

    /**
     * RiskFreeRate2
     */
    private final RiskFreeRate2Field riskFreeRate2 = new RiskFreeRate2Field();

    /**
     * InterestRate2RiskUp
     */
    private final InterestRate2RiskUpField interestRate2RiskUp = new InterestRate2RiskUpField();

    /**
     * InterestRate2RiskDown
     */
    private final InterestRate2RiskDownField interestRate2RiskDown = new InterestRate2RiskDownField();

    /**
     * SettlPrice
     */
    private final SettlPriceField settlPrice = new SettlPriceField();

    /**
     * TradeModeID
     */
    private final TradeModeIdField tradeModeId = new TradeModeIdField();

    /**
     * GroupMask
     */
    private final GroupMaskIntField groupMaskInt = new GroupMaskIntField();

    /**
     * SectionID
     */
    private final SectionIdIntField sectionIdInt = new SectionIdIntField();

    /**
     * BaseContractID
     */
    private final BaseContractIdIntField baseContractIdInt = new BaseContractIdIntField();

    /**
     * TradePeriodAccessSet bit set
     */
    private final TradePeriodAccessField tradePeriodAccess = new TradePeriodAccessField();

    /**
     * HighLimitPxWeekend
     */
    private final HighLimitPxWeekendField highLimitPxWeekend = new HighLimitPxWeekendField();

    /**
     * LowLimitPxWeekend
     */
    private final LowLimitPxWeekendField lowLimitPxWeekend = new LowLimitPxWeekendField();

    /**
     * ClearingSettlPrice
     */
    private final ClearingSettlPriceField clearingSettlPrice = new ClearingSettlPriceField();

    /**
     * NoMDFeedTypes Block
     */
    private final SecurityDefinitionMessageNoMDFeedTypesGroups securityDefinitionMessageNoMDFeedTypesGroups = new SecurityDefinitionMessageNoMDFeedTypesGroups();

    /**
     * NoUnderlyings Block
     */
    private final SecurityDefinitionMessageNoUnderlyingsGroups securityDefinitionMessageNoUnderlyingsGroups = new SecurityDefinitionMessageNoUnderlyingsGroups();

    /**
     * NoLegs Block
     */
    private final SecurityDefinitionMessageNoLegsGroups securityDefinitionMessageNoLegsGroups = new SecurityDefinitionMessageNoLegsGroups();

    /**
     * NoInstrAttrib Block
     */
    private final SecurityDefinitionMessageNoInstrAttribGroups securityDefinitionMessageNoInstrAttribGroups = new SecurityDefinitionMessageNoInstrAttribGroups();

    /**
     * NoEvents Block
     */
    private final SecurityDefinitionMessageNoEventsGroups securityDefinitionMessageNoEventsGroups = new SecurityDefinitionMessageNoEventsGroups();

    /**
     * SecurityDesc data struct
     */
    private final SecurityDesc securityDesc = new SecurityDesc();

    /**
     * QuotationList data struct
     */
    private final QuotationList quotationList = new QuotationList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(totNumReports), List.<Field>of(symbol), List.<Field>of(securityId), List.<Field>of(securityAltId), List.<Field>of(securityAltIdSource), List.<Field>of(securityType), List.<Field>of(cfiCode), List.<Field>of(strikePrice), List.<Field>of(contractMultiplier), List.<Field>of(securityTradingStatus), List.<Field>of(currency), List.<Field>of(marketSegmentId), List.<Field>of(tradingSessionId), List.<Field>of(exchangeTradingSessionIdInt32NullOptional), List.<Field>of(volatility), List.<Field>of(highLimitPx), List.<Field>of(lowLimitPx), List.<Field>of(minPriceIncrement), List.<Field>of(minPriceIncrementAmount), List.<Field>of(initialMarginOnBuy), List.<Field>of(initialMarginOnSell), List.<Field>of(initialMarginSyntetic), List.<Field>of(theorPrice), List.<Field>of(theorPriceLimit), List.<Field>of(underlyingQty), List.<Field>of(underlyingCurrency), List.<Field>of(flags), List.<Field>of(minPriceIncrementAmountCurr), List.<Field>of(settlPriceOpen), List.<Field>of(valuationMethod), List.<Field>of(riskFreeRate), List.<Field>of(fixedSpotDiscount), List.<Field>of(projectedSpotDiscount), List.<Field>of(settlCurrency), List.<Field>of(negativePrices), List.<Field>of(derivativeContractMultiplier), List.<Field>of(interestRateRiskUp), List.<Field>of(interestRateRiskDown), List.<Field>of(riskFreeRate2), List.<Field>of(interestRate2RiskUp), List.<Field>of(interestRate2RiskDown), List.<Field>of(settlPrice), List.<Field>of(tradeModeId), List.<Field>of(groupMaskInt), List.<Field>of(sectionIdInt), List.<Field>of(baseContractIdInt), List.<Field>of(tradePeriodAccess), List.<Field>of(highLimitPxWeekend), List.<Field>of(lowLimitPxWeekend), List.<Field>of(clearingSettlPrice), securityDesc.fields(), quotationList.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * TotNumReports
     *
     * @return the TotNumReports field
     */
    public TotNumReportsField totNumReports() {
        return totNumReports;
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
     * SecurityID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * SecurityAltID
     *
     * @return the SecurityAltId field
     */
    public SecurityAltIdField securityAltId() {
        return securityAltId;
    }

    /**
     * SecurityAltIDSource
     *
     * @return the SecurityAltIdSource field
     */
    public SecurityAltIdSourceField securityAltIdSource() {
        return securityAltIdSource;
    }

    /**
     * SecurityType
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
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
     * StrikePrice
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * ContractMultiplier
     *
     * @return the ContractMultiplier field
     */
    public ContractMultiplierField contractMultiplier() {
        return contractMultiplier;
    }

    /**
     * SecurityTradingStatus
     *
     * @return the SecurityTradingStatus field
     */
    public SecurityTradingStatusField securityTradingStatus() {
        return securityTradingStatus;
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
     * MarketSegmentID
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * TradingSessionID
     *
     * @return the TradingSessionId field
     */
    public TradingSessionIdField tradingSessionId() {
        return tradingSessionId;
    }

    /**
     * ExchangeTradingSessionID
     *
     * @return the ExchangeTradingSessionIdInt32NullOptional field
     */
    public ExchangeTradingSessionIdInt32NullOptionalField exchangeTradingSessionIdInt32NullOptional() {
        return exchangeTradingSessionIdInt32NullOptional;
    }

    /**
     * Volatility
     *
     * @return the Volatility field
     */
    public VolatilityField volatility() {
        return volatility;
    }

    /**
     * HighLimitPx
     *
     * @return the HighLimitPx field
     */
    public HighLimitPxField highLimitPx() {
        return highLimitPx;
    }

    /**
     * LowLimitPx
     *
     * @return the LowLimitPx field
     */
    public LowLimitPxField lowLimitPx() {
        return lowLimitPx;
    }

    /**
     * MinPriceIncrement
     *
     * @return the MinPriceIncrement field
     */
    public MinPriceIncrementField minPriceIncrement() {
        return minPriceIncrement;
    }

    /**
     * MinPriceIncrementAmount
     *
     * @return the MinPriceIncrementAmount field
     */
    public MinPriceIncrementAmountField minPriceIncrementAmount() {
        return minPriceIncrementAmount;
    }

    /**
     * InitialMarginOnBuy
     *
     * @return the InitialMarginOnBuy field
     */
    public InitialMarginOnBuyField initialMarginOnBuy() {
        return initialMarginOnBuy;
    }

    /**
     * InitialMarginOnSell
     *
     * @return the InitialMarginOnSell field
     */
    public InitialMarginOnSellField initialMarginOnSell() {
        return initialMarginOnSell;
    }

    /**
     * InitialMarginSyntetic
     *
     * @return the InitialMarginSyntetic field
     */
    public InitialMarginSynteticField initialMarginSyntetic() {
        return initialMarginSyntetic;
    }

    /**
     * TheorPrice
     *
     * @return the TheorPrice field
     */
    public TheorPriceField theorPrice() {
        return theorPrice;
    }

    /**
     * TheorPriceLimit
     *
     * @return the TheorPriceLimit field
     */
    public TheorPriceLimitField theorPriceLimit() {
        return theorPriceLimit;
    }

    /**
     * UnderlyingQty
     *
     * @return the UnderlyingQty field
     */
    public UnderlyingQtyField underlyingQty() {
        return underlyingQty;
    }

    /**
     * UnderlyingCurrency
     *
     * @return the UnderlyingCurrency field
     */
    public UnderlyingCurrencyField underlyingCurrency() {
        return underlyingCurrency;
    }

    /**
     * FlagsSet bit set
     *
     * @return the Flags field
     */
    public FlagsField flags() {
        return flags;
    }

    /**
     * MinPriceIncrementAmountCurr
     *
     * @return the MinPriceIncrementAmountCurr field
     */
    public MinPriceIncrementAmountCurrField minPriceIncrementAmountCurr() {
        return minPriceIncrementAmountCurr;
    }

    /**
     * SettlPriceOpen
     *
     * @return the SettlPriceOpen field
     */
    public SettlPriceOpenField settlPriceOpen() {
        return settlPriceOpen;
    }

    /**
     * ValuationMethod
     *
     * @return the ValuationMethod field
     */
    public ValuationMethodField valuationMethod() {
        return valuationMethod;
    }

    /**
     * RiskFreeRate
     *
     * @return the RiskFreeRate field
     */
    public RiskFreeRateField riskFreeRate() {
        return riskFreeRate;
    }

    /**
     * FixedSpotDiscount
     *
     * @return the FixedSpotDiscount field
     */
    public FixedSpotDiscountField fixedSpotDiscount() {
        return fixedSpotDiscount;
    }

    /**
     * ProjectedSpotDiscount
     *
     * @return the ProjectedSpotDiscount field
     */
    public ProjectedSpotDiscountField projectedSpotDiscount() {
        return projectedSpotDiscount;
    }

    /**
     * SettlCurrency
     *
     * @return the SettlCurrency field
     */
    public SettlCurrencyField settlCurrency() {
        return settlCurrency;
    }

    /**
     * NegativePrices
     *
     * @return the NegativePrices field
     */
    public NegativePricesField negativePrices() {
        return negativePrices;
    }

    /**
     * DerivativeContractMultiplier
     *
     * @return the DerivativeContractMultiplier field
     */
    public DerivativeContractMultiplierField derivativeContractMultiplier() {
        return derivativeContractMultiplier;
    }

    /**
     * InterestRateRiskUp
     *
     * @return the InterestRateRiskUp field
     */
    public InterestRateRiskUpField interestRateRiskUp() {
        return interestRateRiskUp;
    }

    /**
     * InterestRateRiskDown
     *
     * @return the InterestRateRiskDown field
     */
    public InterestRateRiskDownField interestRateRiskDown() {
        return interestRateRiskDown;
    }

    /**
     * RiskFreeRate2
     *
     * @return the RiskFreeRate2 field
     */
    public RiskFreeRate2Field riskFreeRate2() {
        return riskFreeRate2;
    }

    /**
     * InterestRate2RiskUp
     *
     * @return the InterestRate2RiskUp field
     */
    public InterestRate2RiskUpField interestRate2RiskUp() {
        return interestRate2RiskUp;
    }

    /**
     * InterestRate2RiskDown
     *
     * @return the InterestRate2RiskDown field
     */
    public InterestRate2RiskDownField interestRate2RiskDown() {
        return interestRate2RiskDown;
    }

    /**
     * SettlPrice
     *
     * @return the SettlPrice field
     */
    public SettlPriceField settlPrice() {
        return settlPrice;
    }

    /**
     * TradeModeID
     *
     * @return the TradeModeId field
     */
    public TradeModeIdField tradeModeId() {
        return tradeModeId;
    }

    /**
     * GroupMask
     *
     * @return the GroupMaskInt field
     */
    public GroupMaskIntField groupMaskInt() {
        return groupMaskInt;
    }

    /**
     * SectionID
     *
     * @return the SectionIdInt field
     */
    public SectionIdIntField sectionIdInt() {
        return sectionIdInt;
    }

    /**
     * BaseContractID
     *
     * @return the BaseContractIdInt field
     */
    public BaseContractIdIntField baseContractIdInt() {
        return baseContractIdInt;
    }

    /**
     * TradePeriodAccessSet bit set
     *
     * @return the TradePeriodAccess field
     */
    public TradePeriodAccessField tradePeriodAccess() {
        return tradePeriodAccess;
    }

    /**
     * HighLimitPxWeekend
     *
     * @return the HighLimitPxWeekend field
     */
    public HighLimitPxWeekendField highLimitPxWeekend() {
        return highLimitPxWeekend;
    }

    /**
     * LowLimitPxWeekend
     *
     * @return the LowLimitPxWeekend field
     */
    public LowLimitPxWeekendField lowLimitPxWeekend() {
        return lowLimitPxWeekend;
    }

    /**
     * ClearingSettlPrice
     *
     * @return the ClearingSettlPrice field
     */
    public ClearingSettlPriceField clearingSettlPrice() {
        return clearingSettlPrice;
    }

    /**
     * NoMDFeedTypes Block
     *
     * @return the SecurityDefinitionMessageNoMDFeedTypesGroups record
     */
    public SecurityDefinitionMessageNoMDFeedTypesGroups securityDefinitionMessageNoMDFeedTypesGroups() {
        return securityDefinitionMessageNoMDFeedTypesGroups;
    }

    /**
     * NoUnderlyings Block
     *
     * @return the SecurityDefinitionMessageNoUnderlyingsGroups record
     */
    public SecurityDefinitionMessageNoUnderlyingsGroups securityDefinitionMessageNoUnderlyingsGroups() {
        return securityDefinitionMessageNoUnderlyingsGroups;
    }

    /**
     * NoLegs Block
     *
     * @return the SecurityDefinitionMessageNoLegsGroups record
     */
    public SecurityDefinitionMessageNoLegsGroups securityDefinitionMessageNoLegsGroups() {
        return securityDefinitionMessageNoLegsGroups;
    }

    /**
     * NoInstrAttrib Block
     *
     * @return the SecurityDefinitionMessageNoInstrAttribGroups record
     */
    public SecurityDefinitionMessageNoInstrAttribGroups securityDefinitionMessageNoInstrAttribGroups() {
        return securityDefinitionMessageNoInstrAttribGroups;
    }

    /**
     * NoEvents Block
     *
     * @return the SecurityDefinitionMessageNoEventsGroups record
     */
    public SecurityDefinitionMessageNoEventsGroups securityDefinitionMessageNoEventsGroups() {
        return securityDefinitionMessageNoEventsGroups;
    }

    /**
     * SecurityDesc data struct
     *
     * @return the SecurityDesc record
     */
    public SecurityDesc securityDesc() {
        return securityDesc;
    }

    /**
     * QuotationList data struct
     *
     * @return the QuotationList record
     */
    public QuotationList quotationList() {
        return quotationList;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + securityDefinitionMessageNoMDFeedTypesGroups.byteLength() - SecurityDefinitionMessageNoMDFeedTypesGroups.MINIMUM_BYTE_LENGTH + securityDefinitionMessageNoUnderlyingsGroups.byteLength() - SecurityDefinitionMessageNoUnderlyingsGroups.MINIMUM_BYTE_LENGTH + securityDefinitionMessageNoLegsGroups.byteLength() - SecurityDefinitionMessageNoLegsGroups.MINIMUM_BYTE_LENGTH + securityDefinitionMessageNoInstrAttribGroups.byteLength() - SecurityDefinitionMessageNoInstrAttribGroups.MINIMUM_BYTE_LENGTH + securityDefinitionMessageNoEventsGroups.byteLength() - SecurityDefinitionMessageNoEventsGroups.MINIMUM_BYTE_LENGTH + securityDesc.byteLength() - SecurityDesc.MINIMUM_BYTE_LENGTH + quotationList.byteLength() - QuotationList.MINIMUM_BYTE_LENGTH;
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
        if (!totNumReports.parse(data, cursor)) {
            return false;
        }
        cursor += TotNumReportsField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!securityAltId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityAltIdField.BYTE_LENGTH;
        if (!securityAltIdSource.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityAltIdSourceField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!cfiCode.parse(data, cursor)) {
            return false;
        }
        cursor += CfiCodeField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!contractMultiplier.parse(data, cursor)) {
            return false;
        }
        cursor += ContractMultiplierField.BYTE_LENGTH;
        if (!securityTradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTradingStatusField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!tradingSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionIdField.BYTE_LENGTH;
        if (!exchangeTradingSessionIdInt32NullOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeTradingSessionIdInt32NullOptionalField.BYTE_LENGTH;
        if (!volatility.parse(data, cursor)) {
            return false;
        }
        cursor += VolatilityField.BYTE_LENGTH;
        if (!highLimitPx.parse(data, cursor)) {
            return false;
        }
        cursor += HighLimitPxField.BYTE_LENGTH;
        if (!lowLimitPx.parse(data, cursor)) {
            return false;
        }
        cursor += LowLimitPxField.BYTE_LENGTH;
        if (!minPriceIncrement.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceIncrementField.BYTE_LENGTH;
        if (!minPriceIncrementAmount.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceIncrementAmountField.BYTE_LENGTH;
        if (!initialMarginOnBuy.parse(data, cursor)) {
            return false;
        }
        cursor += InitialMarginOnBuyField.BYTE_LENGTH;
        if (!initialMarginOnSell.parse(data, cursor)) {
            return false;
        }
        cursor += InitialMarginOnSellField.BYTE_LENGTH;
        if (!initialMarginSyntetic.parse(data, cursor)) {
            return false;
        }
        cursor += InitialMarginSynteticField.BYTE_LENGTH;
        if (!theorPrice.parse(data, cursor)) {
            return false;
        }
        cursor += TheorPriceField.BYTE_LENGTH;
        if (!theorPriceLimit.parse(data, cursor)) {
            return false;
        }
        cursor += TheorPriceLimitField.BYTE_LENGTH;
        if (!underlyingQty.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingQtyField.BYTE_LENGTH;
        if (!underlyingCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingCurrencyField.BYTE_LENGTH;
        if (!flags.parse(data, cursor)) {
            return false;
        }
        cursor += FlagsField.BYTE_LENGTH;
        if (!minPriceIncrementAmountCurr.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceIncrementAmountCurrField.BYTE_LENGTH;
        if (!settlPriceOpen.parse(data, cursor)) {
            return false;
        }
        cursor += SettlPriceOpenField.BYTE_LENGTH;
        if (!valuationMethod.parse(data, cursor)) {
            return false;
        }
        cursor += ValuationMethodField.BYTE_LENGTH;
        if (!riskFreeRate.parse(data, cursor)) {
            return false;
        }
        cursor += RiskFreeRateField.BYTE_LENGTH;
        if (!fixedSpotDiscount.parse(data, cursor)) {
            return false;
        }
        cursor += FixedSpotDiscountField.BYTE_LENGTH;
        if (!projectedSpotDiscount.parse(data, cursor)) {
            return false;
        }
        cursor += ProjectedSpotDiscountField.BYTE_LENGTH;
        if (!settlCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += SettlCurrencyField.BYTE_LENGTH;
        if (!negativePrices.parse(data, cursor)) {
            return false;
        }
        cursor += NegativePricesField.BYTE_LENGTH;
        if (!derivativeContractMultiplier.parse(data, cursor)) {
            return false;
        }
        cursor += DerivativeContractMultiplierField.BYTE_LENGTH;
        if (!interestRateRiskUp.parse(data, cursor)) {
            return false;
        }
        cursor += InterestRateRiskUpField.BYTE_LENGTH;
        if (!interestRateRiskDown.parse(data, cursor)) {
            return false;
        }
        cursor += InterestRateRiskDownField.BYTE_LENGTH;
        if (!riskFreeRate2.parse(data, cursor)) {
            return false;
        }
        cursor += RiskFreeRate2Field.BYTE_LENGTH;
        if (!interestRate2RiskUp.parse(data, cursor)) {
            return false;
        }
        cursor += InterestRate2RiskUpField.BYTE_LENGTH;
        if (!interestRate2RiskDown.parse(data, cursor)) {
            return false;
        }
        cursor += InterestRate2RiskDownField.BYTE_LENGTH;
        if (!settlPrice.parse(data, cursor)) {
            return false;
        }
        cursor += SettlPriceField.BYTE_LENGTH;
        if (!tradeModeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeModeIdField.BYTE_LENGTH;
        if (!groupMaskInt.parse(data, cursor)) {
            return false;
        }
        cursor += GroupMaskIntField.BYTE_LENGTH;
        if (!sectionIdInt.parse(data, cursor)) {
            return false;
        }
        cursor += SectionIdIntField.BYTE_LENGTH;
        if (!baseContractIdInt.parse(data, cursor)) {
            return false;
        }
        cursor += BaseContractIdIntField.BYTE_LENGTH;
        if (!tradePeriodAccess.parse(data, cursor)) {
            return false;
        }
        cursor += TradePeriodAccessField.BYTE_LENGTH;
        if (!highLimitPxWeekend.parse(data, cursor)) {
            return false;
        }
        cursor += HighLimitPxWeekendField.BYTE_LENGTH;
        if (!lowLimitPxWeekend.parse(data, cursor)) {
            return false;
        }
        cursor += LowLimitPxWeekendField.BYTE_LENGTH;
        if (!clearingSettlPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingSettlPriceField.BYTE_LENGTH;
        if (!securityDefinitionMessageNoMDFeedTypesGroups.parseFrom(data, cursor, end - 16)) {
            return false;
        }
        cursor += securityDefinitionMessageNoMDFeedTypesGroups.byteLength();
        if (end - cursor < 16) {
            return false;
        }
        if (!securityDefinitionMessageNoUnderlyingsGroups.parseFrom(data, cursor, end - 13)) {
            return false;
        }
        cursor += securityDefinitionMessageNoUnderlyingsGroups.byteLength();
        if (end - cursor < 13) {
            return false;
        }
        if (!securityDefinitionMessageNoLegsGroups.parseFrom(data, cursor, end - 10)) {
            return false;
        }
        cursor += securityDefinitionMessageNoLegsGroups.byteLength();
        if (end - cursor < 10) {
            return false;
        }
        if (!securityDefinitionMessageNoInstrAttribGroups.parseFrom(data, cursor, end - 7)) {
            return false;
        }
        cursor += securityDefinitionMessageNoInstrAttribGroups.byteLength();
        if (end - cursor < 7) {
            return false;
        }
        if (!securityDefinitionMessageNoEventsGroups.parseFrom(data, cursor, end - 4)) {
            return false;
        }
        cursor += securityDefinitionMessageNoEventsGroups.byteLength();
        if (end - cursor < 4) {
            return false;
        }
        if (!securityDesc.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += securityDesc.byteLength();
        if (end - cursor < 2) {
            return false;
        }
        if (!quotationList.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += quotationList.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = totNumReports.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = securityAltId.encode(data, cursor);
        cursor = securityAltIdSource.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = cfiCode.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = contractMultiplier.encode(data, cursor);
        cursor = securityTradingStatus.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = tradingSessionId.encode(data, cursor);
        cursor = exchangeTradingSessionIdInt32NullOptional.encode(data, cursor);
        cursor = volatility.encode(data, cursor);
        cursor = highLimitPx.encode(data, cursor);
        cursor = lowLimitPx.encode(data, cursor);
        cursor = minPriceIncrement.encode(data, cursor);
        cursor = minPriceIncrementAmount.encode(data, cursor);
        cursor = initialMarginOnBuy.encode(data, cursor);
        cursor = initialMarginOnSell.encode(data, cursor);
        cursor = initialMarginSyntetic.encode(data, cursor);
        cursor = theorPrice.encode(data, cursor);
        cursor = theorPriceLimit.encode(data, cursor);
        cursor = underlyingQty.encode(data, cursor);
        cursor = underlyingCurrency.encode(data, cursor);
        cursor = flags.encode(data, cursor);
        cursor = minPriceIncrementAmountCurr.encode(data, cursor);
        cursor = settlPriceOpen.encode(data, cursor);
        cursor = valuationMethod.encode(data, cursor);
        cursor = riskFreeRate.encode(data, cursor);
        cursor = fixedSpotDiscount.encode(data, cursor);
        cursor = projectedSpotDiscount.encode(data, cursor);
        cursor = settlCurrency.encode(data, cursor);
        cursor = negativePrices.encode(data, cursor);
        cursor = derivativeContractMultiplier.encode(data, cursor);
        cursor = interestRateRiskUp.encode(data, cursor);
        cursor = interestRateRiskDown.encode(data, cursor);
        cursor = riskFreeRate2.encode(data, cursor);
        cursor = interestRate2RiskUp.encode(data, cursor);
        cursor = interestRate2RiskDown.encode(data, cursor);
        cursor = settlPrice.encode(data, cursor);
        cursor = tradeModeId.encode(data, cursor);
        cursor = groupMaskInt.encode(data, cursor);
        cursor = sectionIdInt.encode(data, cursor);
        cursor = baseContractIdInt.encode(data, cursor);
        cursor = tradePeriodAccess.encode(data, cursor);
        cursor = highLimitPxWeekend.encode(data, cursor);
        cursor = lowLimitPxWeekend.encode(data, cursor);
        cursor = clearingSettlPrice.encode(data, cursor);
        cursor = securityDefinitionMessageNoMDFeedTypesGroups.encode(data, cursor);
        cursor = securityDefinitionMessageNoUnderlyingsGroups.encode(data, cursor);
        cursor = securityDefinitionMessageNoLegsGroups.encode(data, cursor);
        cursor = securityDefinitionMessageNoInstrAttribGroups.encode(data, cursor);
        cursor = securityDefinitionMessageNoEventsGroups.encode(data, cursor);
        cursor = securityDesc.encode(data, cursor);
        cursor = quotationList.encode(data, cursor);
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
        securityDefinitionMessageNoMDFeedTypesGroups.clear();
        securityDefinitionMessageNoUnderlyingsGroups.clear();
        securityDefinitionMessageNoLegsGroups.clear();
        securityDefinitionMessageNoInstrAttribGroups.clear();
        securityDefinitionMessageNoEventsGroups.clear();
        securityDesc.clear();
        quotationList.clear();
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
            if (field != securityDesc.securityDescLength() && field != quotationList.quotationListLength() && !field.isRecognized()) {
                return false;
            }
        }
        if (!securityDefinitionMessageNoMDFeedTypesGroups.isRecognized()) {
            return false;
        }
        if (!securityDefinitionMessageNoUnderlyingsGroups.isRecognized()) {
            return false;
        }
        if (!securityDefinitionMessageNoLegsGroups.isRecognized()) {
            return false;
        }
        if (!securityDefinitionMessageNoInstrAttribGroups.isRecognized()) {
            return false;
        }
        return securityDefinitionMessageNoEventsGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != securityDesc.securityDescLength() && field != quotationList.quotationListLength() && !field.isValid()) {
                return false;
            }
        }
        if (!securityDefinitionMessageNoMDFeedTypesGroups.isValid()) {
            return false;
        }
        if (!securityDefinitionMessageNoUnderlyingsGroups.isValid()) {
            return false;
        }
        if (!securityDefinitionMessageNoLegsGroups.isValid()) {
            return false;
        }
        if (!securityDefinitionMessageNoInstrAttribGroups.isValid()) {
            return false;
        }
        if (!securityDefinitionMessageNoEventsGroups.isValid()) {
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
        if (!totNumReports.isDecoded()) {
            return Optional.of(totNumReports);
        }
        if (!symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!securityAltId.isDecoded()) {
            return Optional.of(securityAltId);
        }
        if (!securityAltIdSource.isDecoded()) {
            return Optional.of(securityAltIdSource);
        }
        if (!securityType.isDecoded()) {
            return Optional.of(securityType);
        }
        if (!cfiCode.isDecoded()) {
            return Optional.of(cfiCode);
        }
        if (!strikePrice.isDecoded()) {
            return Optional.of(strikePrice);
        }
        if (!contractMultiplier.isDecoded()) {
            return Optional.of(contractMultiplier);
        }
        if (!securityTradingStatus.isDecoded()) {
            return Optional.of(securityTradingStatus);
        }
        if (!currency.isDecoded()) {
            return Optional.of(currency);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!tradingSessionId.isDecoded()) {
            return Optional.of(tradingSessionId);
        }
        if (!exchangeTradingSessionIdInt32NullOptional.isDecoded()) {
            return Optional.of(exchangeTradingSessionIdInt32NullOptional);
        }
        if (!volatility.isDecoded()) {
            return Optional.of(volatility);
        }
        if (!highLimitPx.isDecoded()) {
            return Optional.of(highLimitPx);
        }
        if (!lowLimitPx.isDecoded()) {
            return Optional.of(lowLimitPx);
        }
        if (!minPriceIncrement.isDecoded()) {
            return Optional.of(minPriceIncrement);
        }
        if (!minPriceIncrementAmount.isDecoded()) {
            return Optional.of(minPriceIncrementAmount);
        }
        if (!initialMarginOnBuy.isDecoded()) {
            return Optional.of(initialMarginOnBuy);
        }
        if (!initialMarginOnSell.isDecoded()) {
            return Optional.of(initialMarginOnSell);
        }
        if (!initialMarginSyntetic.isDecoded()) {
            return Optional.of(initialMarginSyntetic);
        }
        if (!theorPrice.isDecoded()) {
            return Optional.of(theorPrice);
        }
        if (!theorPriceLimit.isDecoded()) {
            return Optional.of(theorPriceLimit);
        }
        if (!underlyingQty.isDecoded()) {
            return Optional.of(underlyingQty);
        }
        if (!underlyingCurrency.isDecoded()) {
            return Optional.of(underlyingCurrency);
        }
        if (!flags.isDecoded()) {
            return Optional.of(flags);
        }
        if (!minPriceIncrementAmountCurr.isDecoded()) {
            return Optional.of(minPriceIncrementAmountCurr);
        }
        if (!settlPriceOpen.isDecoded()) {
            return Optional.of(settlPriceOpen);
        }
        if (!valuationMethod.isDecoded()) {
            return Optional.of(valuationMethod);
        }
        if (!riskFreeRate.isDecoded()) {
            return Optional.of(riskFreeRate);
        }
        if (!fixedSpotDiscount.isDecoded()) {
            return Optional.of(fixedSpotDiscount);
        }
        if (!projectedSpotDiscount.isDecoded()) {
            return Optional.of(projectedSpotDiscount);
        }
        if (!settlCurrency.isDecoded()) {
            return Optional.of(settlCurrency);
        }
        if (!negativePrices.isDecoded()) {
            return Optional.of(negativePrices);
        }
        if (!derivativeContractMultiplier.isDecoded()) {
            return Optional.of(derivativeContractMultiplier);
        }
        if (!interestRateRiskUp.isDecoded()) {
            return Optional.of(interestRateRiskUp);
        }
        if (!interestRateRiskDown.isDecoded()) {
            return Optional.of(interestRateRiskDown);
        }
        if (!riskFreeRate2.isDecoded()) {
            return Optional.of(riskFreeRate2);
        }
        if (!interestRate2RiskUp.isDecoded()) {
            return Optional.of(interestRate2RiskUp);
        }
        if (!interestRate2RiskDown.isDecoded()) {
            return Optional.of(interestRate2RiskDown);
        }
        if (!settlPrice.isDecoded()) {
            return Optional.of(settlPrice);
        }
        if (!tradeModeId.isDecoded()) {
            return Optional.of(tradeModeId);
        }
        if (!groupMaskInt.isDecoded()) {
            return Optional.of(groupMaskInt);
        }
        if (!sectionIdInt.isDecoded()) {
            return Optional.of(sectionIdInt);
        }
        if (!baseContractIdInt.isDecoded()) {
            return Optional.of(baseContractIdInt);
        }
        if (!tradePeriodAccess.isDecoded()) {
            return Optional.of(tradePeriodAccess);
        }
        if (!highLimitPxWeekend.isDecoded()) {
            return Optional.of(highLimitPxWeekend);
        }
        if (!lowLimitPxWeekend.isDecoded()) {
            return Optional.of(lowLimitPxWeekend);
        }
        if (!clearingSettlPrice.isDecoded()) {
            return Optional.of(clearingSettlPrice);
        }
        if (!securityDefinitionMessageNoMDFeedTypesGroups.isDecoded()) {
            return securityDefinitionMessageNoMDFeedTypesGroups.failedAt();
        }
        if (!securityDefinitionMessageNoUnderlyingsGroups.isDecoded()) {
            return securityDefinitionMessageNoUnderlyingsGroups.failedAt();
        }
        if (!securityDefinitionMessageNoLegsGroups.isDecoded()) {
            return securityDefinitionMessageNoLegsGroups.failedAt();
        }
        if (!securityDefinitionMessageNoInstrAttribGroups.isDecoded()) {
            return securityDefinitionMessageNoInstrAttribGroups.failedAt();
        }
        if (!securityDefinitionMessageNoEventsGroups.isDecoded()) {
            return securityDefinitionMessageNoEventsGroups.failedAt();
        }
        if (!securityDesc.isDecoded()) {
            return securityDesc.failedAt();
        }
        if (!quotationList.isDecoded()) {
            return quotationList.failedAt();
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
            case "TotNumReports" -> Optional.of(totNumReports);
            case "Symbol" -> Optional.of(symbol);
            case "SecurityId" -> Optional.of(securityId);
            case "SecurityAltId" -> Optional.of(securityAltId);
            case "SecurityAltIdSource" -> Optional.of(securityAltIdSource);
            case "SecurityType" -> Optional.of(securityType);
            case "CfiCode" -> Optional.of(cfiCode);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "ContractMultiplier" -> Optional.of(contractMultiplier);
            case "SecurityTradingStatus" -> Optional.of(securityTradingStatus);
            case "Currency" -> Optional.of(currency);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "TradingSessionId" -> Optional.of(tradingSessionId);
            case "ExchangeTradingSessionIdInt32NullOptional" -> Optional.of(exchangeTradingSessionIdInt32NullOptional);
            case "Volatility" -> Optional.of(volatility);
            case "HighLimitPx" -> Optional.of(highLimitPx);
            case "LowLimitPx" -> Optional.of(lowLimitPx);
            case "MinPriceIncrement" -> Optional.of(minPriceIncrement);
            case "MinPriceIncrementAmount" -> Optional.of(minPriceIncrementAmount);
            case "InitialMarginOnBuy" -> Optional.of(initialMarginOnBuy);
            case "InitialMarginOnSell" -> Optional.of(initialMarginOnSell);
            case "InitialMarginSyntetic" -> Optional.of(initialMarginSyntetic);
            case "TheorPrice" -> Optional.of(theorPrice);
            case "TheorPriceLimit" -> Optional.of(theorPriceLimit);
            case "UnderlyingQty" -> Optional.of(underlyingQty);
            case "UnderlyingCurrency" -> Optional.of(underlyingCurrency);
            case "Flags" -> Optional.of(flags);
            case "MinPriceIncrementAmountCurr" -> Optional.of(minPriceIncrementAmountCurr);
            case "SettlPriceOpen" -> Optional.of(settlPriceOpen);
            case "ValuationMethod" -> Optional.of(valuationMethod);
            case "RiskFreeRate" -> Optional.of(riskFreeRate);
            case "FixedSpotDiscount" -> Optional.of(fixedSpotDiscount);
            case "ProjectedSpotDiscount" -> Optional.of(projectedSpotDiscount);
            case "SettlCurrency" -> Optional.of(settlCurrency);
            case "NegativePrices" -> Optional.of(negativePrices);
            case "DerivativeContractMultiplier" -> Optional.of(derivativeContractMultiplier);
            case "InterestRateRiskUp" -> Optional.of(interestRateRiskUp);
            case "InterestRateRiskDown" -> Optional.of(interestRateRiskDown);
            case "RiskFreeRate2" -> Optional.of(riskFreeRate2);
            case "InterestRate2RiskUp" -> Optional.of(interestRate2RiskUp);
            case "InterestRate2RiskDown" -> Optional.of(interestRate2RiskDown);
            case "SettlPrice" -> Optional.of(settlPrice);
            case "TradeModeId" -> Optional.of(tradeModeId);
            case "GroupMaskInt" -> Optional.of(groupMaskInt);
            case "SectionIdInt" -> Optional.of(sectionIdInt);
            case "BaseContractIdInt" -> Optional.of(baseContractIdInt);
            case "TradePeriodAccess" -> Optional.of(tradePeriodAccess);
            case "HighLimitPxWeekend" -> Optional.of(highLimitPxWeekend);
            case "LowLimitPxWeekend" -> Optional.of(lowLimitPxWeekend);
            case "ClearingSettlPrice" -> Optional.of(clearingSettlPrice);
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
        changed.addAll(securityDefinitionMessageNoMDFeedTypesGroups.diffFields(message.securityDefinitionMessageNoMDFeedTypesGroups));
        changed.addAll(securityDefinitionMessageNoUnderlyingsGroups.diffFields(message.securityDefinitionMessageNoUnderlyingsGroups));
        changed.addAll(securityDefinitionMessageNoLegsGroups.diffFields(message.securityDefinitionMessageNoLegsGroups));
        changed.addAll(securityDefinitionMessageNoInstrAttribGroups.diffFields(message.securityDefinitionMessageNoInstrAttribGroups));
        changed.addAll(securityDefinitionMessageNoEventsGroups.diffFields(message.securityDefinitionMessageNoEventsGroups));
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
            securityDefinitionMessageNoMDFeedTypesGroups.toFormattedString(builder, options);
            builder.append(", ");
            securityDefinitionMessageNoUnderlyingsGroups.toFormattedString(builder, options);
            builder.append(", ");
            securityDefinitionMessageNoLegsGroups.toFormattedString(builder, options);
            builder.append(", ");
            securityDefinitionMessageNoInstrAttribGroups.toFormattedString(builder, options);
            builder.append(", ");
            securityDefinitionMessageNoEventsGroups.toFormattedString(builder, options);
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
        securityDefinitionMessageNoMDFeedTypesGroups.toFormattedString(builder, nested);
        securityDefinitionMessageNoUnderlyingsGroups.toFormattedString(builder, nested);
        securityDefinitionMessageNoLegsGroups.toFormattedString(builder, nested);
        securityDefinitionMessageNoInstrAttribGroups.toFormattedString(builder, nested);
        securityDefinitionMessageNoEventsGroups.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && securityDefinitionMessageNoMDFeedTypesGroups.equals(message.securityDefinitionMessageNoMDFeedTypesGroups) && securityDefinitionMessageNoUnderlyingsGroups.equals(message.securityDefinitionMessageNoUnderlyingsGroups) && securityDefinitionMessageNoLegsGroups.equals(message.securityDefinitionMessageNoLegsGroups) && securityDefinitionMessageNoInstrAttribGroups.equals(message.securityDefinitionMessageNoInstrAttribGroups) && securityDefinitionMessageNoEventsGroups.equals(message.securityDefinitionMessageNoEventsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, securityDefinitionMessageNoMDFeedTypesGroups, securityDefinitionMessageNoUnderlyingsGroups, securityDefinitionMessageNoLegsGroups, securityDefinitionMessageNoInstrAttribGroups, securityDefinitionMessageNoEventsGroups);
    }
}
