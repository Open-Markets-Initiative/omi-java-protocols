package omi.ice.icefutures.bgw.sbe.v7_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.AonAllowedField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.BaseNumLotsField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.BlockOnlyField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.BlockTickValueField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.CfiCodeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ClearableField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ContractMultiplierField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ContractSizeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.CurrencyField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.DenominatorField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.EndDateField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ExchangeSiloField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.FlexAllowedField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.FlexStrikeAllowedField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.GranularityField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.GtAllowedField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.HedgeMarketIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.HedgeOnlyField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.HedgeProductIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.HubIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ImpliedTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.IncrementPriceField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.IncrementQtyField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.InitialMarginField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.IsDividendAdjustedField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ListSeqNoField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LotSizeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LotSizeMultiplierDecimalField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MarketTransparencyTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MarketTypeIDIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MaturityDateField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MaxPriceField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MifidRegulatedMarketBooleanEnumNullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MinPriceField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.NoRptsField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.NonCommoditizedMarketField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.NumOfCyclesIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.NumOfDecimalPriceField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.NumOfDecimalQtyField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.NumOfDecimalStrikePriceField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OffExchangeIncrementPriceDecimalField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OffExchangeIncrementQtyDecimalField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OverrideBlockMinField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ProductIDIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.PutOrCallField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.RefSprdProductIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ScreenLastTradeDateField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ScreenTickValueField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecurityReqIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecurityResponseIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecurityResponseTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecuritySubTypeInt16NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecurityTradingStatusField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SettlMethodField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.StartDateField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.StrikeExerciseStyleField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.StrikePriceField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.StripIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.StripTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SymbolIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TestMarketIndicatorBooleanEnumNullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TickValueField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.UnderlyingSymbolIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.ClearedAlias;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.HomeExchange;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.HubAlias;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.HubName;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.PhysicalCode;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.PriceDenomination;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.PriceUnit;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.SecurityDefinitionReportMessageNoBlockDetailsGroups;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.SecurityDefinitionReportMessageNoSecurityAltIDGroups;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.SecurityDesc;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.SecurityExchange;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.SecurityId;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.StripName;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.UnitOfMeasure;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Field;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;
import omi.ice.icefutures.bgw.sbe.v7_0.types.PrintOptions;

/**
 * Represents the SecurityDefinitionReportMessage message from the Bgw protocol.
 *
 * <p>SecurityDefinitionReportMessage</p>
 */
public final class SecurityDefinitionReportMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 269;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Definition Report Message";

    /**
     * securityReqID
     */
    private final SecurityReqIdField securityReqId = new SecurityReqIdField();

    /**
     * securityResponseType
     */
    private final SecurityResponseTypeField securityResponseType = new SecurityResponseTypeField();

    /**
     * securityResponseID
     */
    private final SecurityResponseIdField securityResponseId = new SecurityResponseIdField();

    /**
     * marketTypeID
     */
    private final MarketTypeIDIntField marketTypeIDInt = new MarketTypeIDIntField();

    /**
     * symbol
     */
    private final SymbolIntField symbolInt = new SymbolIntField();

    /**
     * exchangeSilo
     */
    private final ExchangeSiloField exchangeSilo = new ExchangeSiloField();

    /**
     * noRpts
     */
    private final NoRptsField noRpts = new NoRptsField();

    /**
     * listSeqNo
     */
    private final ListSeqNoField listSeqNo = new ListSeqNoField();

    /**
     * underlyingSymbol
     */
    private final UnderlyingSymbolIntField underlyingSymbolInt = new UnderlyingSymbolIntField();

    /**
     * cfiCode
     */
    private final CfiCodeField cfiCode = new CfiCodeField();

    /**
     * securitySubType
     */
    private final SecuritySubTypeInt16NullField securitySubTypeInt16Null = new SecuritySubTypeInt16NullField();

    /**
     * maturityDate
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * screenLastTradeDate
     */
    private final ScreenLastTradeDateField screenLastTradeDate = new ScreenLastTradeDateField();

    /**
     * contractMultiplier
     */
    private final ContractMultiplierField contractMultiplier = new ContractMultiplierField();

    /**
     * startDate
     */
    private final StartDateField startDate = new StartDateField();

    /**
     * endDate
     */
    private final EndDateField endDate = new EndDateField();

    /**
     * putOrCall
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * strikePrice
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * securityTradingStatus
     */
    private final SecurityTradingStatusField securityTradingStatus = new SecurityTradingStatusField();

    /**
     * currency
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * settlMethod
     */
    private final SettlMethodField settlMethod = new SettlMethodField();

    /**
     * strikeExerciseStyle
     */
    private final StrikeExerciseStyleField strikeExerciseStyle = new StrikeExerciseStyleField();

    /**
     * incrementQty
     */
    private final IncrementQtyField incrementQty = new IncrementQtyField();

    /**
     * incrementPrice
     */
    private final IncrementPriceField incrementPrice = new IncrementPriceField();

    /**
     * minPrice
     */
    private final MinPriceField minPrice = new MinPriceField();

    /**
     * maxPrice
     */
    private final MaxPriceField maxPrice = new MaxPriceField();

    /**
     * offExchangeIncrementPrice
     */
    private final OffExchangeIncrementPriceDecimalField offExchangeIncrementPriceDecimal = new OffExchangeIncrementPriceDecimalField();

    /**
     * offExchangeIncrementQty
     */
    private final OffExchangeIncrementQtyDecimalField offExchangeIncrementQtyDecimal = new OffExchangeIncrementQtyDecimalField();

    /**
     * screenTickValue
     */
    private final ScreenTickValueField screenTickValue = new ScreenTickValueField();

    /**
     * blockTickValue
     */
    private final BlockTickValueField blockTickValue = new BlockTickValueField();

    /**
     * lotSize
     */
    private final LotSizeField lotSize = new LotSizeField();

    /**
     * contractSize
     */
    private final ContractSizeField contractSize = new ContractSizeField();

    /**
     * numOfDecimalPrice
     */
    private final NumOfDecimalPriceField numOfDecimalPrice = new NumOfDecimalPriceField();

    /**
     * numOfDecimalQty
     */
    private final NumOfDecimalQtyField numOfDecimalQty = new NumOfDecimalQtyField();

    /**
     * granularity
     */
    private final GranularityField granularity = new GranularityField();

    /**
     * baseNumLots
     */
    private final BaseNumLotsField baseNumLots = new BaseNumLotsField();

    /**
     * tickValue
     */
    private final TickValueField tickValue = new TickValueField();

    /**
     * productID
     */
    private final ProductIDIntField productIDInt = new ProductIDIntField();

    /**
     * clearable
     */
    private final ClearableField clearable = new ClearableField();

    /**
     * hedgeProductID
     */
    private final HedgeProductIdField hedgeProductId = new HedgeProductIdField();

    /**
     * hedgeMarketID
     */
    private final HedgeMarketIdField hedgeMarketId = new HedgeMarketIdField();

    /**
     * hedgeOnly
     */
    private final HedgeOnlyField hedgeOnly = new HedgeOnlyField();

    /**
     * isDividendAdjusted
     */
    private final IsDividendAdjustedField isDividendAdjusted = new IsDividendAdjustedField();

    /**
     * denominator
     */
    private final DenominatorField denominator = new DenominatorField();

    /**
     * initialMargin
     */
    private final InitialMarginField initialMargin = new InitialMarginField();

    /**
     * impliedType
     */
    private final ImpliedTypeField impliedType = new ImpliedTypeField();

    /**
     * numOfDecimalStrikePrice
     */
    private final NumOfDecimalStrikePriceField numOfDecimalStrikePrice = new NumOfDecimalStrikePriceField();

    /**
     * numOfCycles
     */
    private final NumOfCyclesIntField numOfCyclesInt = new NumOfCyclesIntField();

    /**
     * lotSizeMultiplier
     */
    private final LotSizeMultiplierDecimalField lotSizeMultiplierDecimal = new LotSizeMultiplierDecimalField();

    /**
     * stripType
     */
    private final StripTypeField stripType = new StripTypeField();

    /**
     * stripID
     */
    private final StripIdField stripId = new StripIdField();

    /**
     * blockOnly
     */
    private final BlockOnlyField blockOnly = new BlockOnlyField();

    /**
     * flexAllowed
     */
    private final FlexAllowedField flexAllowed = new FlexAllowedField();

    /**
     * gtAllowed
     */
    private final GtAllowedField gtAllowed = new GtAllowedField();

    /**
     * aonAllowed
     */
    private final AonAllowedField aonAllowed = new AonAllowedField();

    /**
     * mifidRegulatedMarket
     */
    private final MifidRegulatedMarketBooleanEnumNullField mifidRegulatedMarketBooleanEnumNull = new MifidRegulatedMarketBooleanEnumNullField();

    /**
     * flexStrikeAllowed
     */
    private final FlexStrikeAllowedField flexStrikeAllowed = new FlexStrikeAllowedField();

    /**
     * hubID
     */
    private final HubIdField hubId = new HubIdField();

    /**
     * overrideBlockMin
     */
    private final OverrideBlockMinField overrideBlockMin = new OverrideBlockMinField();

    /**
     * testMarketIndicator
     */
    private final TestMarketIndicatorBooleanEnumNullField testMarketIndicatorBooleanEnumNull = new TestMarketIndicatorBooleanEnumNullField();

    /**
     * refSprdProductID
     */
    private final RefSprdProductIdField refSprdProductId = new RefSprdProductIdField();

    /**
     * marketTransparencyType
     */
    private final MarketTransparencyTypeField marketTransparencyType = new MarketTransparencyTypeField();

    /**
     * nonCommoditizedMarket
     */
    private final NonCommoditizedMarketField nonCommoditizedMarket = new NonCommoditizedMarketField();

    /**
     * noBlockDetails Block
     */
    private final SecurityDefinitionReportMessageNoBlockDetailsGroups securityDefinitionReportMessageNoBlockDetailsGroups = new SecurityDefinitionReportMessageNoBlockDetailsGroups();

    /**
     * noSecurityAltID Block
     */
    private final SecurityDefinitionReportMessageNoSecurityAltIDGroups securityDefinitionReportMessageNoSecurityAltIDGroups = new SecurityDefinitionReportMessageNoSecurityAltIDGroups();

    /**
     * securityID data struct
     */
    private final SecurityId securityId = new SecurityId();

    /**
     * unitOfMeasure data struct
     */
    private final UnitOfMeasure unitOfMeasure = new UnitOfMeasure();

    /**
     * priceDenomination data struct
     */
    private final PriceDenomination priceDenomination = new PriceDenomination();

    /**
     * clearedAlias data struct
     */
    private final ClearedAlias clearedAlias = new ClearedAlias();

    /**
     * securityDesc data struct
     */
    private final SecurityDesc securityDesc = new SecurityDesc();

    /**
     * priceUnit data struct
     */
    private final PriceUnit priceUnit = new PriceUnit();

    /**
     * stripName data struct
     */
    private final StripName stripName = new StripName();

    /**
     * hubName data struct
     */
    private final HubName hubName = new HubName();

    /**
     * hubAlias data struct
     */
    private final HubAlias hubAlias = new HubAlias();

    /**
     * securityExchange data struct
     */
    private final SecurityExchange securityExchange = new SecurityExchange();

    /**
     * physicalCode data struct
     */
    private final PhysicalCode physicalCode = new PhysicalCode();

    /**
     * homeExchange data struct
     */
    private final HomeExchange homeExchange = new HomeExchange();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(securityReqId), List.<Field>of(securityResponseType), List.<Field>of(securityResponseId), List.<Field>of(marketTypeIDInt), List.<Field>of(symbolInt), List.<Field>of(exchangeSilo), List.<Field>of(noRpts), List.<Field>of(listSeqNo), List.<Field>of(underlyingSymbolInt), List.<Field>of(cfiCode), List.<Field>of(securitySubTypeInt16Null), List.<Field>of(maturityDate), List.<Field>of(screenLastTradeDate), List.<Field>of(contractMultiplier), List.<Field>of(startDate), List.<Field>of(endDate), List.<Field>of(putOrCall), List.<Field>of(strikePrice), List.<Field>of(securityTradingStatus), List.<Field>of(currency), List.<Field>of(settlMethod), List.<Field>of(strikeExerciseStyle), List.<Field>of(incrementQty), List.<Field>of(incrementPrice), List.<Field>of(minPrice), List.<Field>of(maxPrice), List.<Field>of(offExchangeIncrementPriceDecimal), List.<Field>of(offExchangeIncrementQtyDecimal), List.<Field>of(screenTickValue), List.<Field>of(blockTickValue), List.<Field>of(lotSize), List.<Field>of(contractSize), List.<Field>of(numOfDecimalPrice), List.<Field>of(numOfDecimalQty), List.<Field>of(granularity), List.<Field>of(baseNumLots), List.<Field>of(tickValue), List.<Field>of(productIDInt), List.<Field>of(clearable), List.<Field>of(hedgeProductId), List.<Field>of(hedgeMarketId), List.<Field>of(hedgeOnly), List.<Field>of(isDividendAdjusted), List.<Field>of(denominator), List.<Field>of(initialMargin), List.<Field>of(impliedType), List.<Field>of(numOfDecimalStrikePrice), List.<Field>of(numOfCyclesInt), List.<Field>of(lotSizeMultiplierDecimal), List.<Field>of(stripType), List.<Field>of(stripId), List.<Field>of(blockOnly), List.<Field>of(flexAllowed), List.<Field>of(gtAllowed), List.<Field>of(aonAllowed), List.<Field>of(mifidRegulatedMarketBooleanEnumNull), List.<Field>of(flexStrikeAllowed), List.<Field>of(hubId), List.<Field>of(overrideBlockMin), List.<Field>of(testMarketIndicatorBooleanEnumNull), List.<Field>of(refSprdProductId), List.<Field>of(marketTransparencyType), List.<Field>of(nonCommoditizedMarket), securityId.fields(), unitOfMeasure.fields(), priceDenomination.fields(), clearedAlias.fields(), securityDesc.fields(), priceUnit.fields(), stripName.fields(), hubName.fields(), hubAlias.fields(), securityExchange.fields(), physicalCode.fields(), homeExchange.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * securityReqID
     *
     * @return the SecurityReqId field
     */
    public SecurityReqIdField securityReqId() {
        return securityReqId;
    }

    /**
     * securityResponseType
     *
     * @return the SecurityResponseType field
     */
    public SecurityResponseTypeField securityResponseType() {
        return securityResponseType;
    }

    /**
     * securityResponseID
     *
     * @return the SecurityResponseId field
     */
    public SecurityResponseIdField securityResponseId() {
        return securityResponseId;
    }

    /**
     * marketTypeID
     *
     * @return the MarketTypeIDInt field
     */
    public MarketTypeIDIntField marketTypeIDInt() {
        return marketTypeIDInt;
    }

    /**
     * symbol
     *
     * @return the SymbolInt field
     */
    public SymbolIntField symbolInt() {
        return symbolInt;
    }

    /**
     * exchangeSilo
     *
     * @return the ExchangeSilo field
     */
    public ExchangeSiloField exchangeSilo() {
        return exchangeSilo;
    }

    /**
     * noRpts
     *
     * @return the NoRpts field
     */
    public NoRptsField noRpts() {
        return noRpts;
    }

    /**
     * listSeqNo
     *
     * @return the ListSeqNo field
     */
    public ListSeqNoField listSeqNo() {
        return listSeqNo;
    }

    /**
     * underlyingSymbol
     *
     * @return the UnderlyingSymbolInt field
     */
    public UnderlyingSymbolIntField underlyingSymbolInt() {
        return underlyingSymbolInt;
    }

    /**
     * cfiCode
     *
     * @return the CfiCode field
     */
    public CfiCodeField cfiCode() {
        return cfiCode;
    }

    /**
     * securitySubType
     *
     * @return the SecuritySubTypeInt16Null field
     */
    public SecuritySubTypeInt16NullField securitySubTypeInt16Null() {
        return securitySubTypeInt16Null;
    }

    /**
     * maturityDate
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * screenLastTradeDate
     *
     * @return the ScreenLastTradeDate field
     */
    public ScreenLastTradeDateField screenLastTradeDate() {
        return screenLastTradeDate;
    }

    /**
     * contractMultiplier
     *
     * @return the ContractMultiplier field
     */
    public ContractMultiplierField contractMultiplier() {
        return contractMultiplier;
    }

    /**
     * startDate
     *
     * @return the StartDate field
     */
    public StartDateField startDate() {
        return startDate;
    }

    /**
     * endDate
     *
     * @return the EndDate field
     */
    public EndDateField endDate() {
        return endDate;
    }

    /**
     * putOrCall
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * strikePrice
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * securityTradingStatus
     *
     * @return the SecurityTradingStatus field
     */
    public SecurityTradingStatusField securityTradingStatus() {
        return securityTradingStatus;
    }

    /**
     * currency
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * settlMethod
     *
     * @return the SettlMethod field
     */
    public SettlMethodField settlMethod() {
        return settlMethod;
    }

    /**
     * strikeExerciseStyle
     *
     * @return the StrikeExerciseStyle field
     */
    public StrikeExerciseStyleField strikeExerciseStyle() {
        return strikeExerciseStyle;
    }

    /**
     * incrementQty
     *
     * @return the IncrementQty field
     */
    public IncrementQtyField incrementQty() {
        return incrementQty;
    }

    /**
     * incrementPrice
     *
     * @return the IncrementPrice field
     */
    public IncrementPriceField incrementPrice() {
        return incrementPrice;
    }

    /**
     * minPrice
     *
     * @return the MinPrice field
     */
    public MinPriceField minPrice() {
        return minPrice;
    }

    /**
     * maxPrice
     *
     * @return the MaxPrice field
     */
    public MaxPriceField maxPrice() {
        return maxPrice;
    }

    /**
     * offExchangeIncrementPrice
     *
     * @return the OffExchangeIncrementPriceDecimal field
     */
    public OffExchangeIncrementPriceDecimalField offExchangeIncrementPriceDecimal() {
        return offExchangeIncrementPriceDecimal;
    }

    /**
     * offExchangeIncrementQty
     *
     * @return the OffExchangeIncrementQtyDecimal field
     */
    public OffExchangeIncrementQtyDecimalField offExchangeIncrementQtyDecimal() {
        return offExchangeIncrementQtyDecimal;
    }

    /**
     * screenTickValue
     *
     * @return the ScreenTickValue field
     */
    public ScreenTickValueField screenTickValue() {
        return screenTickValue;
    }

    /**
     * blockTickValue
     *
     * @return the BlockTickValue field
     */
    public BlockTickValueField blockTickValue() {
        return blockTickValue;
    }

    /**
     * lotSize
     *
     * @return the LotSize field
     */
    public LotSizeField lotSize() {
        return lotSize;
    }

    /**
     * contractSize
     *
     * @return the ContractSize field
     */
    public ContractSizeField contractSize() {
        return contractSize;
    }

    /**
     * numOfDecimalPrice
     *
     * @return the NumOfDecimalPrice field
     */
    public NumOfDecimalPriceField numOfDecimalPrice() {
        return numOfDecimalPrice;
    }

    /**
     * numOfDecimalQty
     *
     * @return the NumOfDecimalQty field
     */
    public NumOfDecimalQtyField numOfDecimalQty() {
        return numOfDecimalQty;
    }

    /**
     * granularity
     *
     * @return the Granularity field
     */
    public GranularityField granularity() {
        return granularity;
    }

    /**
     * baseNumLots
     *
     * @return the BaseNumLots field
     */
    public BaseNumLotsField baseNumLots() {
        return baseNumLots;
    }

    /**
     * tickValue
     *
     * @return the TickValue field
     */
    public TickValueField tickValue() {
        return tickValue;
    }

    /**
     * productID
     *
     * @return the ProductIDInt field
     */
    public ProductIDIntField productIDInt() {
        return productIDInt;
    }

    /**
     * clearable
     *
     * @return the Clearable field
     */
    public ClearableField clearable() {
        return clearable;
    }

    /**
     * hedgeProductID
     *
     * @return the HedgeProductId field
     */
    public HedgeProductIdField hedgeProductId() {
        return hedgeProductId;
    }

    /**
     * hedgeMarketID
     *
     * @return the HedgeMarketId field
     */
    public HedgeMarketIdField hedgeMarketId() {
        return hedgeMarketId;
    }

    /**
     * hedgeOnly
     *
     * @return the HedgeOnly field
     */
    public HedgeOnlyField hedgeOnly() {
        return hedgeOnly;
    }

    /**
     * isDividendAdjusted
     *
     * @return the IsDividendAdjusted field
     */
    public IsDividendAdjustedField isDividendAdjusted() {
        return isDividendAdjusted;
    }

    /**
     * denominator
     *
     * @return the Denominator field
     */
    public DenominatorField denominator() {
        return denominator;
    }

    /**
     * initialMargin
     *
     * @return the InitialMargin field
     */
    public InitialMarginField initialMargin() {
        return initialMargin;
    }

    /**
     * impliedType
     *
     * @return the ImpliedType field
     */
    public ImpliedTypeField impliedType() {
        return impliedType;
    }

    /**
     * numOfDecimalStrikePrice
     *
     * @return the NumOfDecimalStrikePrice field
     */
    public NumOfDecimalStrikePriceField numOfDecimalStrikePrice() {
        return numOfDecimalStrikePrice;
    }

    /**
     * numOfCycles
     *
     * @return the NumOfCyclesInt field
     */
    public NumOfCyclesIntField numOfCyclesInt() {
        return numOfCyclesInt;
    }

    /**
     * lotSizeMultiplier
     *
     * @return the LotSizeMultiplierDecimal field
     */
    public LotSizeMultiplierDecimalField lotSizeMultiplierDecimal() {
        return lotSizeMultiplierDecimal;
    }

    /**
     * stripType
     *
     * @return the StripType field
     */
    public StripTypeField stripType() {
        return stripType;
    }

    /**
     * stripID
     *
     * @return the StripId field
     */
    public StripIdField stripId() {
        return stripId;
    }

    /**
     * blockOnly
     *
     * @return the BlockOnly field
     */
    public BlockOnlyField blockOnly() {
        return blockOnly;
    }

    /**
     * flexAllowed
     *
     * @return the FlexAllowed field
     */
    public FlexAllowedField flexAllowed() {
        return flexAllowed;
    }

    /**
     * gtAllowed
     *
     * @return the GtAllowed field
     */
    public GtAllowedField gtAllowed() {
        return gtAllowed;
    }

    /**
     * aonAllowed
     *
     * @return the AonAllowed field
     */
    public AonAllowedField aonAllowed() {
        return aonAllowed;
    }

    /**
     * mifidRegulatedMarket
     *
     * @return the MifidRegulatedMarketBooleanEnumNull field
     */
    public MifidRegulatedMarketBooleanEnumNullField mifidRegulatedMarketBooleanEnumNull() {
        return mifidRegulatedMarketBooleanEnumNull;
    }

    /**
     * flexStrikeAllowed
     *
     * @return the FlexStrikeAllowed field
     */
    public FlexStrikeAllowedField flexStrikeAllowed() {
        return flexStrikeAllowed;
    }

    /**
     * hubID
     *
     * @return the HubId field
     */
    public HubIdField hubId() {
        return hubId;
    }

    /**
     * overrideBlockMin
     *
     * @return the OverrideBlockMin field
     */
    public OverrideBlockMinField overrideBlockMin() {
        return overrideBlockMin;
    }

    /**
     * testMarketIndicator
     *
     * @return the TestMarketIndicatorBooleanEnumNull field
     */
    public TestMarketIndicatorBooleanEnumNullField testMarketIndicatorBooleanEnumNull() {
        return testMarketIndicatorBooleanEnumNull;
    }

    /**
     * refSprdProductID
     *
     * @return the RefSprdProductId field
     */
    public RefSprdProductIdField refSprdProductId() {
        return refSprdProductId;
    }

    /**
     * marketTransparencyType
     *
     * @return the MarketTransparencyType field
     */
    public MarketTransparencyTypeField marketTransparencyType() {
        return marketTransparencyType;
    }

    /**
     * nonCommoditizedMarket
     *
     * @return the NonCommoditizedMarket field
     */
    public NonCommoditizedMarketField nonCommoditizedMarket() {
        return nonCommoditizedMarket;
    }

    /**
     * noBlockDetails Block
     *
     * @return the SecurityDefinitionReportMessageNoBlockDetailsGroups record
     */
    public SecurityDefinitionReportMessageNoBlockDetailsGroups securityDefinitionReportMessageNoBlockDetailsGroups() {
        return securityDefinitionReportMessageNoBlockDetailsGroups;
    }

    /**
     * noSecurityAltID Block
     *
     * @return the SecurityDefinitionReportMessageNoSecurityAltIDGroups record
     */
    public SecurityDefinitionReportMessageNoSecurityAltIDGroups securityDefinitionReportMessageNoSecurityAltIDGroups() {
        return securityDefinitionReportMessageNoSecurityAltIDGroups;
    }

    /**
     * securityID data struct
     *
     * @return the SecurityId record
     */
    public SecurityId securityId() {
        return securityId;
    }

    /**
     * unitOfMeasure data struct
     *
     * @return the UnitOfMeasure record
     */
    public UnitOfMeasure unitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * priceDenomination data struct
     *
     * @return the PriceDenomination record
     */
    public PriceDenomination priceDenomination() {
        return priceDenomination;
    }

    /**
     * clearedAlias data struct
     *
     * @return the ClearedAlias record
     */
    public ClearedAlias clearedAlias() {
        return clearedAlias;
    }

    /**
     * securityDesc data struct
     *
     * @return the SecurityDesc record
     */
    public SecurityDesc securityDesc() {
        return securityDesc;
    }

    /**
     * priceUnit data struct
     *
     * @return the PriceUnit record
     */
    public PriceUnit priceUnit() {
        return priceUnit;
    }

    /**
     * stripName data struct
     *
     * @return the StripName record
     */
    public StripName stripName() {
        return stripName;
    }

    /**
     * hubName data struct
     *
     * @return the HubName record
     */
    public HubName hubName() {
        return hubName;
    }

    /**
     * hubAlias data struct
     *
     * @return the HubAlias record
     */
    public HubAlias hubAlias() {
        return hubAlias;
    }

    /**
     * securityExchange data struct
     *
     * @return the SecurityExchange record
     */
    public SecurityExchange securityExchange() {
        return securityExchange;
    }

    /**
     * physicalCode data struct
     *
     * @return the PhysicalCode record
     */
    public PhysicalCode physicalCode() {
        return physicalCode;
    }

    /**
     * homeExchange data struct
     *
     * @return the HomeExchange record
     */
    public HomeExchange homeExchange() {
        return homeExchange;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + securityDefinitionReportMessageNoBlockDetailsGroups.byteLength() - SecurityDefinitionReportMessageNoBlockDetailsGroups.MINIMUM_BYTE_LENGTH + securityDefinitionReportMessageNoSecurityAltIDGroups.byteLength() - SecurityDefinitionReportMessageNoSecurityAltIDGroups.MINIMUM_BYTE_LENGTH + securityId.byteLength() - SecurityId.MINIMUM_BYTE_LENGTH + unitOfMeasure.byteLength() - UnitOfMeasure.MINIMUM_BYTE_LENGTH + priceDenomination.byteLength() - PriceDenomination.MINIMUM_BYTE_LENGTH + clearedAlias.byteLength() - ClearedAlias.MINIMUM_BYTE_LENGTH + securityDesc.byteLength() - SecurityDesc.MINIMUM_BYTE_LENGTH + priceUnit.byteLength() - PriceUnit.MINIMUM_BYTE_LENGTH + stripName.byteLength() - StripName.MINIMUM_BYTE_LENGTH + hubName.byteLength() - HubName.MINIMUM_BYTE_LENGTH + hubAlias.byteLength() - HubAlias.MINIMUM_BYTE_LENGTH + securityExchange.byteLength() - SecurityExchange.MINIMUM_BYTE_LENGTH + physicalCode.byteLength() - PhysicalCode.MINIMUM_BYTE_LENGTH + homeExchange.byteLength() - HomeExchange.MINIMUM_BYTE_LENGTH;
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
        if (!securityReqId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityReqIdField.BYTE_LENGTH;
        if (!securityResponseType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityResponseTypeField.BYTE_LENGTH;
        if (!securityResponseId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityResponseIdField.BYTE_LENGTH;
        if (!marketTypeIDInt.parse(data, cursor)) {
            return false;
        }
        cursor += MarketTypeIDIntField.BYTE_LENGTH;
        if (!symbolInt.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIntField.BYTE_LENGTH;
        if (!exchangeSilo.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeSiloField.BYTE_LENGTH;
        if (!noRpts.parse(data, cursor)) {
            return false;
        }
        cursor += NoRptsField.BYTE_LENGTH;
        if (!listSeqNo.parse(data, cursor)) {
            return false;
        }
        cursor += ListSeqNoField.BYTE_LENGTH;
        if (!underlyingSymbolInt.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolIntField.BYTE_LENGTH;
        if (!cfiCode.parse(data, cursor)) {
            return false;
        }
        cursor += CfiCodeField.BYTE_LENGTH;
        if (!securitySubTypeInt16Null.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySubTypeInt16NullField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!screenLastTradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += ScreenLastTradeDateField.BYTE_LENGTH;
        if (!contractMultiplier.parse(data, cursor)) {
            return false;
        }
        cursor += ContractMultiplierField.BYTE_LENGTH;
        if (!startDate.parse(data, cursor)) {
            return false;
        }
        cursor += StartDateField.BYTE_LENGTH;
        if (!endDate.parse(data, cursor)) {
            return false;
        }
        cursor += EndDateField.BYTE_LENGTH;
        if (!putOrCall.parse(data, cursor)) {
            return false;
        }
        cursor += PutOrCallField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!securityTradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTradingStatusField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!settlMethod.parse(data, cursor)) {
            return false;
        }
        cursor += SettlMethodField.BYTE_LENGTH;
        if (!strikeExerciseStyle.parse(data, cursor)) {
            return false;
        }
        cursor += StrikeExerciseStyleField.BYTE_LENGTH;
        if (!incrementQty.parse(data, cursor)) {
            return false;
        }
        cursor += IncrementQtyField.BYTE_LENGTH;
        if (!incrementPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IncrementPriceField.BYTE_LENGTH;
        if (!minPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceField.BYTE_LENGTH;
        if (!maxPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MaxPriceField.BYTE_LENGTH;
        if (!offExchangeIncrementPriceDecimal.parse(data, cursor)) {
            return false;
        }
        cursor += OffExchangeIncrementPriceDecimalField.BYTE_LENGTH;
        if (!offExchangeIncrementQtyDecimal.parse(data, cursor)) {
            return false;
        }
        cursor += OffExchangeIncrementQtyDecimalField.BYTE_LENGTH;
        if (!screenTickValue.parse(data, cursor)) {
            return false;
        }
        cursor += ScreenTickValueField.BYTE_LENGTH;
        if (!blockTickValue.parse(data, cursor)) {
            return false;
        }
        cursor += BlockTickValueField.BYTE_LENGTH;
        if (!lotSize.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeField.BYTE_LENGTH;
        if (!contractSize.parse(data, cursor)) {
            return false;
        }
        cursor += ContractSizeField.BYTE_LENGTH;
        if (!numOfDecimalPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NumOfDecimalPriceField.BYTE_LENGTH;
        if (!numOfDecimalQty.parse(data, cursor)) {
            return false;
        }
        cursor += NumOfDecimalQtyField.BYTE_LENGTH;
        if (!granularity.parse(data, cursor)) {
            return false;
        }
        cursor += GranularityField.BYTE_LENGTH;
        if (!baseNumLots.parse(data, cursor)) {
            return false;
        }
        cursor += BaseNumLotsField.BYTE_LENGTH;
        if (!tickValue.parse(data, cursor)) {
            return false;
        }
        cursor += TickValueField.BYTE_LENGTH;
        if (!productIDInt.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIDIntField.BYTE_LENGTH;
        if (!clearable.parse(data, cursor)) {
            return false;
        }
        cursor += ClearableField.BYTE_LENGTH;
        if (!hedgeProductId.parse(data, cursor)) {
            return false;
        }
        cursor += HedgeProductIdField.BYTE_LENGTH;
        if (!hedgeMarketId.parse(data, cursor)) {
            return false;
        }
        cursor += HedgeMarketIdField.BYTE_LENGTH;
        if (!hedgeOnly.parse(data, cursor)) {
            return false;
        }
        cursor += HedgeOnlyField.BYTE_LENGTH;
        if (!isDividendAdjusted.parse(data, cursor)) {
            return false;
        }
        cursor += IsDividendAdjustedField.BYTE_LENGTH;
        if (!denominator.parse(data, cursor)) {
            return false;
        }
        cursor += DenominatorField.BYTE_LENGTH;
        if (!initialMargin.parse(data, cursor)) {
            return false;
        }
        cursor += InitialMarginField.BYTE_LENGTH;
        if (!impliedType.parse(data, cursor)) {
            return false;
        }
        cursor += ImpliedTypeField.BYTE_LENGTH;
        if (!numOfDecimalStrikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += NumOfDecimalStrikePriceField.BYTE_LENGTH;
        if (!numOfCyclesInt.parse(data, cursor)) {
            return false;
        }
        cursor += NumOfCyclesIntField.BYTE_LENGTH;
        if (!lotSizeMultiplierDecimal.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeMultiplierDecimalField.BYTE_LENGTH;
        if (!stripType.parse(data, cursor)) {
            return false;
        }
        cursor += StripTypeField.BYTE_LENGTH;
        if (!stripId.parse(data, cursor)) {
            return false;
        }
        cursor += StripIdField.BYTE_LENGTH;
        if (!blockOnly.parse(data, cursor)) {
            return false;
        }
        cursor += BlockOnlyField.BYTE_LENGTH;
        if (!flexAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += FlexAllowedField.BYTE_LENGTH;
        if (!gtAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += GtAllowedField.BYTE_LENGTH;
        if (!aonAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += AonAllowedField.BYTE_LENGTH;
        if (!mifidRegulatedMarketBooleanEnumNull.parse(data, cursor)) {
            return false;
        }
        cursor += MifidRegulatedMarketBooleanEnumNullField.BYTE_LENGTH;
        if (!flexStrikeAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += FlexStrikeAllowedField.BYTE_LENGTH;
        if (!hubId.parse(data, cursor)) {
            return false;
        }
        cursor += HubIdField.BYTE_LENGTH;
        if (!overrideBlockMin.parse(data, cursor)) {
            return false;
        }
        cursor += OverrideBlockMinField.BYTE_LENGTH;
        if (!testMarketIndicatorBooleanEnumNull.parse(data, cursor)) {
            return false;
        }
        cursor += TestMarketIndicatorBooleanEnumNullField.BYTE_LENGTH;
        if (!refSprdProductId.parse(data, cursor)) {
            return false;
        }
        cursor += RefSprdProductIdField.BYTE_LENGTH;
        if (!marketTransparencyType.parse(data, cursor)) {
            return false;
        }
        cursor += MarketTransparencyTypeField.BYTE_LENGTH;
        if (!nonCommoditizedMarket.parse(data, cursor)) {
            return false;
        }
        cursor += NonCommoditizedMarketField.BYTE_LENGTH;
        if (!securityDefinitionReportMessageNoBlockDetailsGroups.parseFrom(data, cursor, end - 28)) {
            return false;
        }
        cursor += securityDefinitionReportMessageNoBlockDetailsGroups.byteLength();
        if (end - cursor < 28) {
            return false;
        }
        if (!securityDefinitionReportMessageNoSecurityAltIDGroups.parseFrom(data, cursor, end - 24)) {
            return false;
        }
        cursor += securityDefinitionReportMessageNoSecurityAltIDGroups.byteLength();
        if (end - cursor < 24) {
            return false;
        }
        if (!securityId.parseFrom(data, cursor, end - 22)) {
            return false;
        }
        cursor += securityId.byteLength();
        if (end - cursor < 22) {
            return false;
        }
        if (!unitOfMeasure.parseFrom(data, cursor, end - 20)) {
            return false;
        }
        cursor += unitOfMeasure.byteLength();
        if (end - cursor < 20) {
            return false;
        }
        if (!priceDenomination.parseFrom(data, cursor, end - 18)) {
            return false;
        }
        cursor += priceDenomination.byteLength();
        if (end - cursor < 18) {
            return false;
        }
        if (!clearedAlias.parseFrom(data, cursor, end - 16)) {
            return false;
        }
        cursor += clearedAlias.byteLength();
        if (end - cursor < 16) {
            return false;
        }
        if (!securityDesc.parseFrom(data, cursor, end - 14)) {
            return false;
        }
        cursor += securityDesc.byteLength();
        if (end - cursor < 14) {
            return false;
        }
        if (!priceUnit.parseFrom(data, cursor, end - 12)) {
            return false;
        }
        cursor += priceUnit.byteLength();
        if (end - cursor < 12) {
            return false;
        }
        if (!stripName.parseFrom(data, cursor, end - 10)) {
            return false;
        }
        cursor += stripName.byteLength();
        if (end - cursor < 10) {
            return false;
        }
        if (!hubName.parseFrom(data, cursor, end - 8)) {
            return false;
        }
        cursor += hubName.byteLength();
        if (end - cursor < 8) {
            return false;
        }
        if (!hubAlias.parseFrom(data, cursor, end - 6)) {
            return false;
        }
        cursor += hubAlias.byteLength();
        if (end - cursor < 6) {
            return false;
        }
        if (!securityExchange.parseFrom(data, cursor, end - 4)) {
            return false;
        }
        cursor += securityExchange.byteLength();
        if (end - cursor < 4) {
            return false;
        }
        if (!physicalCode.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += physicalCode.byteLength();
        if (end - cursor < 2) {
            return false;
        }
        if (!homeExchange.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += homeExchange.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = securityReqId.encode(data, cursor);
        cursor = securityResponseType.encode(data, cursor);
        cursor = securityResponseId.encode(data, cursor);
        cursor = marketTypeIDInt.encode(data, cursor);
        cursor = symbolInt.encode(data, cursor);
        cursor = exchangeSilo.encode(data, cursor);
        cursor = noRpts.encode(data, cursor);
        cursor = listSeqNo.encode(data, cursor);
        cursor = underlyingSymbolInt.encode(data, cursor);
        cursor = cfiCode.encode(data, cursor);
        cursor = securitySubTypeInt16Null.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = screenLastTradeDate.encode(data, cursor);
        cursor = contractMultiplier.encode(data, cursor);
        cursor = startDate.encode(data, cursor);
        cursor = endDate.encode(data, cursor);
        cursor = putOrCall.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = securityTradingStatus.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = settlMethod.encode(data, cursor);
        cursor = strikeExerciseStyle.encode(data, cursor);
        cursor = incrementQty.encode(data, cursor);
        cursor = incrementPrice.encode(data, cursor);
        cursor = minPrice.encode(data, cursor);
        cursor = maxPrice.encode(data, cursor);
        cursor = offExchangeIncrementPriceDecimal.encode(data, cursor);
        cursor = offExchangeIncrementQtyDecimal.encode(data, cursor);
        cursor = screenTickValue.encode(data, cursor);
        cursor = blockTickValue.encode(data, cursor);
        cursor = lotSize.encode(data, cursor);
        cursor = contractSize.encode(data, cursor);
        cursor = numOfDecimalPrice.encode(data, cursor);
        cursor = numOfDecimalQty.encode(data, cursor);
        cursor = granularity.encode(data, cursor);
        cursor = baseNumLots.encode(data, cursor);
        cursor = tickValue.encode(data, cursor);
        cursor = productIDInt.encode(data, cursor);
        cursor = clearable.encode(data, cursor);
        cursor = hedgeProductId.encode(data, cursor);
        cursor = hedgeMarketId.encode(data, cursor);
        cursor = hedgeOnly.encode(data, cursor);
        cursor = isDividendAdjusted.encode(data, cursor);
        cursor = denominator.encode(data, cursor);
        cursor = initialMargin.encode(data, cursor);
        cursor = impliedType.encode(data, cursor);
        cursor = numOfDecimalStrikePrice.encode(data, cursor);
        cursor = numOfCyclesInt.encode(data, cursor);
        cursor = lotSizeMultiplierDecimal.encode(data, cursor);
        cursor = stripType.encode(data, cursor);
        cursor = stripId.encode(data, cursor);
        cursor = blockOnly.encode(data, cursor);
        cursor = flexAllowed.encode(data, cursor);
        cursor = gtAllowed.encode(data, cursor);
        cursor = aonAllowed.encode(data, cursor);
        cursor = mifidRegulatedMarketBooleanEnumNull.encode(data, cursor);
        cursor = flexStrikeAllowed.encode(data, cursor);
        cursor = hubId.encode(data, cursor);
        cursor = overrideBlockMin.encode(data, cursor);
        cursor = testMarketIndicatorBooleanEnumNull.encode(data, cursor);
        cursor = refSprdProductId.encode(data, cursor);
        cursor = marketTransparencyType.encode(data, cursor);
        cursor = nonCommoditizedMarket.encode(data, cursor);
        cursor = securityDefinitionReportMessageNoBlockDetailsGroups.encode(data, cursor);
        cursor = securityDefinitionReportMessageNoSecurityAltIDGroups.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = unitOfMeasure.encode(data, cursor);
        cursor = priceDenomination.encode(data, cursor);
        cursor = clearedAlias.encode(data, cursor);
        cursor = securityDesc.encode(data, cursor);
        cursor = priceUnit.encode(data, cursor);
        cursor = stripName.encode(data, cursor);
        cursor = hubName.encode(data, cursor);
        cursor = hubAlias.encode(data, cursor);
        cursor = securityExchange.encode(data, cursor);
        cursor = physicalCode.encode(data, cursor);
        cursor = homeExchange.encode(data, cursor);
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
        securityDefinitionReportMessageNoBlockDetailsGroups.clear();
        securityDefinitionReportMessageNoSecurityAltIDGroups.clear();
        securityId.clear();
        unitOfMeasure.clear();
        priceDenomination.clear();
        clearedAlias.clear();
        securityDesc.clear();
        priceUnit.clear();
        stripName.clear();
        hubName.clear();
        hubAlias.clear();
        securityExchange.clear();
        physicalCode.clear();
        homeExchange.clear();
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
            if (field != securityId.securityIdLength() && field != unitOfMeasure.unitOfMeasureLength() && field != priceDenomination.priceDenominationLength() && field != clearedAlias.clearedAliasLength() && field != securityDesc.securityDescLength() && field != priceUnit.priceUnitLength() && field != stripName.stripNameLength() && field != hubName.hubNameLength() && field != hubAlias.hubAliasLength() && field != securityExchange.securityExchangeLength() && field != physicalCode.physicalCodeLength() && field != homeExchange.homeExchangeLength() && !field.isRecognized()) {
                return false;
            }
        }
        if (!securityDefinitionReportMessageNoBlockDetailsGroups.isRecognized()) {
            return false;
        }
        return securityDefinitionReportMessageNoSecurityAltIDGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != securityId.securityIdLength() && field != unitOfMeasure.unitOfMeasureLength() && field != priceDenomination.priceDenominationLength() && field != clearedAlias.clearedAliasLength() && field != securityDesc.securityDescLength() && field != priceUnit.priceUnitLength() && field != stripName.stripNameLength() && field != hubName.hubNameLength() && field != hubAlias.hubAliasLength() && field != securityExchange.securityExchangeLength() && field != physicalCode.physicalCodeLength() && field != homeExchange.homeExchangeLength() && !field.isValid()) {
                return false;
            }
        }
        if (!securityDefinitionReportMessageNoBlockDetailsGroups.isValid()) {
            return false;
        }
        if (!securityDefinitionReportMessageNoSecurityAltIDGroups.isValid()) {
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
        if (!securityReqId.isDecoded()) {
            return Optional.of(securityReqId);
        }
        if (!securityResponseType.isDecoded()) {
            return Optional.of(securityResponseType);
        }
        if (!securityResponseId.isDecoded()) {
            return Optional.of(securityResponseId);
        }
        if (!marketTypeIDInt.isDecoded()) {
            return Optional.of(marketTypeIDInt);
        }
        if (!symbolInt.isDecoded()) {
            return Optional.of(symbolInt);
        }
        if (!exchangeSilo.isDecoded()) {
            return Optional.of(exchangeSilo);
        }
        if (!noRpts.isDecoded()) {
            return Optional.of(noRpts);
        }
        if (!listSeqNo.isDecoded()) {
            return Optional.of(listSeqNo);
        }
        if (!underlyingSymbolInt.isDecoded()) {
            return Optional.of(underlyingSymbolInt);
        }
        if (!cfiCode.isDecoded()) {
            return Optional.of(cfiCode);
        }
        if (!securitySubTypeInt16Null.isDecoded()) {
            return Optional.of(securitySubTypeInt16Null);
        }
        if (!maturityDate.isDecoded()) {
            return Optional.of(maturityDate);
        }
        if (!screenLastTradeDate.isDecoded()) {
            return Optional.of(screenLastTradeDate);
        }
        if (!contractMultiplier.isDecoded()) {
            return Optional.of(contractMultiplier);
        }
        if (!startDate.isDecoded()) {
            return Optional.of(startDate);
        }
        if (!endDate.isDecoded()) {
            return Optional.of(endDate);
        }
        if (!putOrCall.isDecoded()) {
            return Optional.of(putOrCall);
        }
        if (!strikePrice.isDecoded()) {
            return Optional.of(strikePrice);
        }
        if (!securityTradingStatus.isDecoded()) {
            return Optional.of(securityTradingStatus);
        }
        if (!currency.isDecoded()) {
            return Optional.of(currency);
        }
        if (!settlMethod.isDecoded()) {
            return Optional.of(settlMethod);
        }
        if (!strikeExerciseStyle.isDecoded()) {
            return Optional.of(strikeExerciseStyle);
        }
        if (!incrementQty.isDecoded()) {
            return Optional.of(incrementQty);
        }
        if (!incrementPrice.isDecoded()) {
            return Optional.of(incrementPrice);
        }
        if (!minPrice.isDecoded()) {
            return Optional.of(minPrice);
        }
        if (!maxPrice.isDecoded()) {
            return Optional.of(maxPrice);
        }
        if (!offExchangeIncrementPriceDecimal.isDecoded()) {
            return Optional.of(offExchangeIncrementPriceDecimal);
        }
        if (!offExchangeIncrementQtyDecimal.isDecoded()) {
            return Optional.of(offExchangeIncrementQtyDecimal);
        }
        if (!screenTickValue.isDecoded()) {
            return Optional.of(screenTickValue);
        }
        if (!blockTickValue.isDecoded()) {
            return Optional.of(blockTickValue);
        }
        if (!lotSize.isDecoded()) {
            return Optional.of(lotSize);
        }
        if (!contractSize.isDecoded()) {
            return Optional.of(contractSize);
        }
        if (!numOfDecimalPrice.isDecoded()) {
            return Optional.of(numOfDecimalPrice);
        }
        if (!numOfDecimalQty.isDecoded()) {
            return Optional.of(numOfDecimalQty);
        }
        if (!granularity.isDecoded()) {
            return Optional.of(granularity);
        }
        if (!baseNumLots.isDecoded()) {
            return Optional.of(baseNumLots);
        }
        if (!tickValue.isDecoded()) {
            return Optional.of(tickValue);
        }
        if (!productIDInt.isDecoded()) {
            return Optional.of(productIDInt);
        }
        if (!clearable.isDecoded()) {
            return Optional.of(clearable);
        }
        if (!hedgeProductId.isDecoded()) {
            return Optional.of(hedgeProductId);
        }
        if (!hedgeMarketId.isDecoded()) {
            return Optional.of(hedgeMarketId);
        }
        if (!hedgeOnly.isDecoded()) {
            return Optional.of(hedgeOnly);
        }
        if (!isDividendAdjusted.isDecoded()) {
            return Optional.of(isDividendAdjusted);
        }
        if (!denominator.isDecoded()) {
            return Optional.of(denominator);
        }
        if (!initialMargin.isDecoded()) {
            return Optional.of(initialMargin);
        }
        if (!impliedType.isDecoded()) {
            return Optional.of(impliedType);
        }
        if (!numOfDecimalStrikePrice.isDecoded()) {
            return Optional.of(numOfDecimalStrikePrice);
        }
        if (!numOfCyclesInt.isDecoded()) {
            return Optional.of(numOfCyclesInt);
        }
        if (!lotSizeMultiplierDecimal.isDecoded()) {
            return Optional.of(lotSizeMultiplierDecimal);
        }
        if (!stripType.isDecoded()) {
            return Optional.of(stripType);
        }
        if (!stripId.isDecoded()) {
            return Optional.of(stripId);
        }
        if (!blockOnly.isDecoded()) {
            return Optional.of(blockOnly);
        }
        if (!flexAllowed.isDecoded()) {
            return Optional.of(flexAllowed);
        }
        if (!gtAllowed.isDecoded()) {
            return Optional.of(gtAllowed);
        }
        if (!aonAllowed.isDecoded()) {
            return Optional.of(aonAllowed);
        }
        if (!mifidRegulatedMarketBooleanEnumNull.isDecoded()) {
            return Optional.of(mifidRegulatedMarketBooleanEnumNull);
        }
        if (!flexStrikeAllowed.isDecoded()) {
            return Optional.of(flexStrikeAllowed);
        }
        if (!hubId.isDecoded()) {
            return Optional.of(hubId);
        }
        if (!overrideBlockMin.isDecoded()) {
            return Optional.of(overrideBlockMin);
        }
        if (!testMarketIndicatorBooleanEnumNull.isDecoded()) {
            return Optional.of(testMarketIndicatorBooleanEnumNull);
        }
        if (!refSprdProductId.isDecoded()) {
            return Optional.of(refSprdProductId);
        }
        if (!marketTransparencyType.isDecoded()) {
            return Optional.of(marketTransparencyType);
        }
        if (!nonCommoditizedMarket.isDecoded()) {
            return Optional.of(nonCommoditizedMarket);
        }
        if (!securityDefinitionReportMessageNoBlockDetailsGroups.isDecoded()) {
            return securityDefinitionReportMessageNoBlockDetailsGroups.failedAt();
        }
        if (!securityDefinitionReportMessageNoSecurityAltIDGroups.isDecoded()) {
            return securityDefinitionReportMessageNoSecurityAltIDGroups.failedAt();
        }
        if (!securityId.isDecoded()) {
            return securityId.failedAt();
        }
        if (!unitOfMeasure.isDecoded()) {
            return unitOfMeasure.failedAt();
        }
        if (!priceDenomination.isDecoded()) {
            return priceDenomination.failedAt();
        }
        if (!clearedAlias.isDecoded()) {
            return clearedAlias.failedAt();
        }
        if (!securityDesc.isDecoded()) {
            return securityDesc.failedAt();
        }
        if (!priceUnit.isDecoded()) {
            return priceUnit.failedAt();
        }
        if (!stripName.isDecoded()) {
            return stripName.failedAt();
        }
        if (!hubName.isDecoded()) {
            return hubName.failedAt();
        }
        if (!hubAlias.isDecoded()) {
            return hubAlias.failedAt();
        }
        if (!securityExchange.isDecoded()) {
            return securityExchange.failedAt();
        }
        if (!physicalCode.isDecoded()) {
            return physicalCode.failedAt();
        }
        if (!homeExchange.isDecoded()) {
            return homeExchange.failedAt();
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
            case "SecurityReqId" -> Optional.of(securityReqId);
            case "SecurityResponseType" -> Optional.of(securityResponseType);
            case "SecurityResponseId" -> Optional.of(securityResponseId);
            case "MarketTypeIDInt" -> Optional.of(marketTypeIDInt);
            case "SymbolInt" -> Optional.of(symbolInt);
            case "ExchangeSilo" -> Optional.of(exchangeSilo);
            case "NoRpts" -> Optional.of(noRpts);
            case "ListSeqNo" -> Optional.of(listSeqNo);
            case "UnderlyingSymbolInt" -> Optional.of(underlyingSymbolInt);
            case "CfiCode" -> Optional.of(cfiCode);
            case "SecuritySubTypeInt16Null" -> Optional.of(securitySubTypeInt16Null);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "ScreenLastTradeDate" -> Optional.of(screenLastTradeDate);
            case "ContractMultiplier" -> Optional.of(contractMultiplier);
            case "StartDate" -> Optional.of(startDate);
            case "EndDate" -> Optional.of(endDate);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "SecurityTradingStatus" -> Optional.of(securityTradingStatus);
            case "Currency" -> Optional.of(currency);
            case "SettlMethod" -> Optional.of(settlMethod);
            case "StrikeExerciseStyle" -> Optional.of(strikeExerciseStyle);
            case "IncrementQty" -> Optional.of(incrementQty);
            case "IncrementPrice" -> Optional.of(incrementPrice);
            case "MinPrice" -> Optional.of(minPrice);
            case "MaxPrice" -> Optional.of(maxPrice);
            case "OffExchangeIncrementPriceDecimal" -> Optional.of(offExchangeIncrementPriceDecimal);
            case "OffExchangeIncrementQtyDecimal" -> Optional.of(offExchangeIncrementQtyDecimal);
            case "ScreenTickValue" -> Optional.of(screenTickValue);
            case "BlockTickValue" -> Optional.of(blockTickValue);
            case "LotSize" -> Optional.of(lotSize);
            case "ContractSize" -> Optional.of(contractSize);
            case "NumOfDecimalPrice" -> Optional.of(numOfDecimalPrice);
            case "NumOfDecimalQty" -> Optional.of(numOfDecimalQty);
            case "Granularity" -> Optional.of(granularity);
            case "BaseNumLots" -> Optional.of(baseNumLots);
            case "TickValue" -> Optional.of(tickValue);
            case "ProductIDInt" -> Optional.of(productIDInt);
            case "Clearable" -> Optional.of(clearable);
            case "HedgeProductId" -> Optional.of(hedgeProductId);
            case "HedgeMarketId" -> Optional.of(hedgeMarketId);
            case "HedgeOnly" -> Optional.of(hedgeOnly);
            case "IsDividendAdjusted" -> Optional.of(isDividendAdjusted);
            case "Denominator" -> Optional.of(denominator);
            case "InitialMargin" -> Optional.of(initialMargin);
            case "ImpliedType" -> Optional.of(impliedType);
            case "NumOfDecimalStrikePrice" -> Optional.of(numOfDecimalStrikePrice);
            case "NumOfCyclesInt" -> Optional.of(numOfCyclesInt);
            case "LotSizeMultiplierDecimal" -> Optional.of(lotSizeMultiplierDecimal);
            case "StripType" -> Optional.of(stripType);
            case "StripId" -> Optional.of(stripId);
            case "BlockOnly" -> Optional.of(blockOnly);
            case "FlexAllowed" -> Optional.of(flexAllowed);
            case "GtAllowed" -> Optional.of(gtAllowed);
            case "AonAllowed" -> Optional.of(aonAllowed);
            case "MifidRegulatedMarketBooleanEnumNull" -> Optional.of(mifidRegulatedMarketBooleanEnumNull);
            case "FlexStrikeAllowed" -> Optional.of(flexStrikeAllowed);
            case "HubId" -> Optional.of(hubId);
            case "OverrideBlockMin" -> Optional.of(overrideBlockMin);
            case "TestMarketIndicatorBooleanEnumNull" -> Optional.of(testMarketIndicatorBooleanEnumNull);
            case "RefSprdProductId" -> Optional.of(refSprdProductId);
            case "MarketTransparencyType" -> Optional.of(marketTransparencyType);
            case "NonCommoditizedMarket" -> Optional.of(nonCommoditizedMarket);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityDefinitionReportMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(securityDefinitionReportMessageNoBlockDetailsGroups.diffFields(message.securityDefinitionReportMessageNoBlockDetailsGroups));
        changed.addAll(securityDefinitionReportMessageNoSecurityAltIDGroups.diffFields(message.securityDefinitionReportMessageNoSecurityAltIDGroups));
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
            securityDefinitionReportMessageNoBlockDetailsGroups.toFormattedString(builder, options);
            builder.append(", ");
            securityDefinitionReportMessageNoSecurityAltIDGroups.toFormattedString(builder, options);
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
        securityDefinitionReportMessageNoBlockDetailsGroups.toFormattedString(builder, nested);
        securityDefinitionReportMessageNoSecurityAltIDGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof SecurityDefinitionReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && securityDefinitionReportMessageNoBlockDetailsGroups.equals(message.securityDefinitionReportMessageNoBlockDetailsGroups) && securityDefinitionReportMessageNoSecurityAltIDGroups.equals(message.securityDefinitionReportMessageNoSecurityAltIDGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, securityDefinitionReportMessageNoBlockDetailsGroups, securityDefinitionReportMessageNoSecurityAltIDGroups);
    }
}
