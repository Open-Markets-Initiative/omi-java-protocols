package omi.ice.icefutures.bgw.sbe.v7_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.BaseNumLotsField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.BlockOnlyField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.BlockTickValueField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.DenominatorField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ExchangeSiloField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.FlexAllowedField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.GtAllowedField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.HubIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ImpliedTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.IncrementPriceField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.IncrementQtyField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LegDealsSuppressedField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ListSeqNoField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.LotSizeMultiplierDecimal9NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MarketTypeIDIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MaturityDateField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MaxPriceField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MifidRegulatedMarketBooleanEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.MinPriceField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.NoRptsField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.NumOfCyclesInt16NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.NumOfDecimalPriceField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.NumOfDecimalQtyField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.NumOfDecimalStrikePriceField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OffExchangeIncrementPriceDecimal9NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OffExchangeIncrementQtyDecimal9NullField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OverrideBlockMinField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ProductIDIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.ScreenTickValueField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecurityReqIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecurityResponseIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecurityResponseTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecuritySubTypeIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SecurityTradingStatusField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.StripTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.SymbolIntField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TestMarketIndicatorBooleanEnumField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.TransactTimeUtcTimestampField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.UnderlyingStrategySymbolField;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.ClearedAlias;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.HubAlias;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.HubName;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.PhysicalCode;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.PriceDenomination;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.PriceUnit;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.SecurityDefinitionReportStrategyMessageNoBlockDetailsGroups;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.SecurityDefinitionReportStrategyMessageNoLegsGroups;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.SecurityDefinitionReportStrategyMessageNoSecurityAltIDGroups;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.SecurityDesc;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.SecurityExchange;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.SecurityId;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.StrategySecurityId;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.StripName;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.UnitOfMeasure;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Field;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;
import omi.ice.icefutures.bgw.sbe.v7_0.types.PrintOptions;

/**
 * Represents the SecurityDefinitionReportStrategyMessage message from the Bgw protocol.
 *
 * <p>SecurityDefinitionReport_StrategyMessage</p>
 */
public final class SecurityDefinitionReportStrategyMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 182;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Definition Report Strategy Message";

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
     * noRpts
     */
    private final NoRptsField noRpts = new NoRptsField();

    /**
     * listSeqNo
     */
    private final ListSeqNoField listSeqNo = new ListSeqNoField();

    /**
     * symbol
     */
    private final SymbolIntField symbolInt = new SymbolIntField();

    /**
     * underlyingStrategySymbol
     */
    private final UnderlyingStrategySymbolField underlyingStrategySymbol = new UnderlyingStrategySymbolField();

    /**
     * maturityDate
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * securityTradingStatus
     */
    private final SecurityTradingStatusField securityTradingStatus = new SecurityTradingStatusField();

    /**
     * securitySubType
     */
    private final SecuritySubTypeIntField securitySubTypeInt = new SecuritySubTypeIntField();

    /**
     * exchangeSilo
     */
    private final ExchangeSiloField exchangeSilo = new ExchangeSiloField();

    /**
     * transactTime
     */
    private final TransactTimeUtcTimestampField transactTimeUtcTimestamp = new TransactTimeUtcTimestampField();

    /**
     * legDealsSuppressed
     */
    private final LegDealsSuppressedField legDealsSuppressed = new LegDealsSuppressedField();

    /**
     * incrementPrice
     */
    private final IncrementPriceField incrementPrice = new IncrementPriceField();

    /**
     * incrementQty
     */
    private final IncrementQtyField incrementQty = new IncrementQtyField();

    /**
     * minPrice
     */
    private final MinPriceField minPrice = new MinPriceField();

    /**
     * maxPrice
     */
    private final MaxPriceField maxPrice = new MaxPriceField();

    /**
     * numOfDecimalPrice
     */
    private final NumOfDecimalPriceField numOfDecimalPrice = new NumOfDecimalPriceField();

    /**
     * numOfDecimalQty
     */
    private final NumOfDecimalQtyField numOfDecimalQty = new NumOfDecimalQtyField();

    /**
     * productID
     */
    private final ProductIDIntField productIDInt = new ProductIDIntField();

    /**
     * baseNumLots
     */
    private final BaseNumLotsField baseNumLots = new BaseNumLotsField();

    /**
     * denominator
     */
    private final DenominatorField denominator = new DenominatorField();

    /**
     * impliedType
     */
    private final ImpliedTypeField impliedType = new ImpliedTypeField();

    /**
     * offExchangeIncrementPrice
     */
    private final OffExchangeIncrementPriceDecimal9NullField offExchangeIncrementPriceDecimal9Null = new OffExchangeIncrementPriceDecimal9NullField();

    /**
     * offExchangeIncrementQty
     */
    private final OffExchangeIncrementQtyDecimal9NullField offExchangeIncrementQtyDecimal9Null = new OffExchangeIncrementQtyDecimal9NullField();

    /**
     * numOfDecimalStrikePrice
     */
    private final NumOfDecimalStrikePriceField numOfDecimalStrikePrice = new NumOfDecimalStrikePriceField();

    /**
     * numOfCycles
     */
    private final NumOfCyclesInt16NullField numOfCyclesInt16Null = new NumOfCyclesInt16NullField();

    /**
     * lotSizeMultiplier
     */
    private final LotSizeMultiplierDecimal9NullField lotSizeMultiplierDecimal9Null = new LotSizeMultiplierDecimal9NullField();

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
     * mifidRegulatedMarket
     */
    private final MifidRegulatedMarketBooleanEnumField mifidRegulatedMarketBooleanEnum = new MifidRegulatedMarketBooleanEnumField();

    /**
     * stripType
     */
    private final StripTypeField stripType = new StripTypeField();

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
    private final TestMarketIndicatorBooleanEnumField testMarketIndicatorBooleanEnum = new TestMarketIndicatorBooleanEnumField();

    /**
     * screenTickValue
     */
    private final ScreenTickValueField screenTickValue = new ScreenTickValueField();

    /**
     * blockTickValue
     */
    private final BlockTickValueField blockTickValue = new BlockTickValueField();

    /**
     * noBlockDetails Block
     */
    private final SecurityDefinitionReportStrategyMessageNoBlockDetailsGroups securityDefinitionReportStrategyMessageNoBlockDetailsGroups = new SecurityDefinitionReportStrategyMessageNoBlockDetailsGroups();

    /**
     * noSecurityAltID Block
     */
    private final SecurityDefinitionReportStrategyMessageNoSecurityAltIDGroups securityDefinitionReportStrategyMessageNoSecurityAltIDGroups = new SecurityDefinitionReportStrategyMessageNoSecurityAltIDGroups();

    /**
     * noLegs Block
     */
    private final SecurityDefinitionReportStrategyMessageNoLegsGroups securityDefinitionReportStrategyMessageNoLegsGroups = new SecurityDefinitionReportStrategyMessageNoLegsGroups();

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
     * strategySecurityID data struct
     */
    private final StrategySecurityId strategySecurityId = new StrategySecurityId();

    /**
     * physicalCode data struct
     */
    private final PhysicalCode physicalCode = new PhysicalCode();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(securityReqId), List.<Field>of(securityResponseType), List.<Field>of(securityResponseId), List.<Field>of(marketTypeIDInt), List.<Field>of(noRpts), List.<Field>of(listSeqNo), List.<Field>of(symbolInt), List.<Field>of(underlyingStrategySymbol), List.<Field>of(maturityDate), List.<Field>of(securityTradingStatus), List.<Field>of(securitySubTypeInt), List.<Field>of(exchangeSilo), List.<Field>of(transactTimeUtcTimestamp), List.<Field>of(legDealsSuppressed), List.<Field>of(incrementPrice), List.<Field>of(incrementQty), List.<Field>of(minPrice), List.<Field>of(maxPrice), List.<Field>of(numOfDecimalPrice), List.<Field>of(numOfDecimalQty), List.<Field>of(productIDInt), List.<Field>of(baseNumLots), List.<Field>of(denominator), List.<Field>of(impliedType), List.<Field>of(offExchangeIncrementPriceDecimal9Null), List.<Field>of(offExchangeIncrementQtyDecimal9Null), List.<Field>of(numOfDecimalStrikePrice), List.<Field>of(numOfCyclesInt16Null), List.<Field>of(lotSizeMultiplierDecimal9Null), List.<Field>of(blockOnly), List.<Field>of(flexAllowed), List.<Field>of(gtAllowed), List.<Field>of(mifidRegulatedMarketBooleanEnum), List.<Field>of(stripType), List.<Field>of(hubId), List.<Field>of(overrideBlockMin), List.<Field>of(testMarketIndicatorBooleanEnum), List.<Field>of(screenTickValue), List.<Field>of(blockTickValue), securityId.fields(), unitOfMeasure.fields(), priceDenomination.fields(), clearedAlias.fields(), securityDesc.fields(), priceUnit.fields(), stripName.fields(), hubName.fields(), hubAlias.fields(), securityExchange.fields(), strategySecurityId.fields(), physicalCode.fields()).flatMap(List::stream).toList();

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
     * symbol
     *
     * @return the SymbolInt field
     */
    public SymbolIntField symbolInt() {
        return symbolInt;
    }

    /**
     * underlyingStrategySymbol
     *
     * @return the UnderlyingStrategySymbol field
     */
    public UnderlyingStrategySymbolField underlyingStrategySymbol() {
        return underlyingStrategySymbol;
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
     * securityTradingStatus
     *
     * @return the SecurityTradingStatus field
     */
    public SecurityTradingStatusField securityTradingStatus() {
        return securityTradingStatus;
    }

    /**
     * securitySubType
     *
     * @return the SecuritySubTypeInt field
     */
    public SecuritySubTypeIntField securitySubTypeInt() {
        return securitySubTypeInt;
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
     * transactTime
     *
     * @return the TransactTimeUtcTimestamp field
     */
    public TransactTimeUtcTimestampField transactTimeUtcTimestamp() {
        return transactTimeUtcTimestamp;
    }

    /**
     * legDealsSuppressed
     *
     * @return the LegDealsSuppressed field
     */
    public LegDealsSuppressedField legDealsSuppressed() {
        return legDealsSuppressed;
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
     * incrementQty
     *
     * @return the IncrementQty field
     */
    public IncrementQtyField incrementQty() {
        return incrementQty;
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
     * productID
     *
     * @return the ProductIDInt field
     */
    public ProductIDIntField productIDInt() {
        return productIDInt;
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
     * denominator
     *
     * @return the Denominator field
     */
    public DenominatorField denominator() {
        return denominator;
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
     * offExchangeIncrementPrice
     *
     * @return the OffExchangeIncrementPriceDecimal9Null field
     */
    public OffExchangeIncrementPriceDecimal9NullField offExchangeIncrementPriceDecimal9Null() {
        return offExchangeIncrementPriceDecimal9Null;
    }

    /**
     * offExchangeIncrementQty
     *
     * @return the OffExchangeIncrementQtyDecimal9Null field
     */
    public OffExchangeIncrementQtyDecimal9NullField offExchangeIncrementQtyDecimal9Null() {
        return offExchangeIncrementQtyDecimal9Null;
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
     * @return the NumOfCyclesInt16Null field
     */
    public NumOfCyclesInt16NullField numOfCyclesInt16Null() {
        return numOfCyclesInt16Null;
    }

    /**
     * lotSizeMultiplier
     *
     * @return the LotSizeMultiplierDecimal9Null field
     */
    public LotSizeMultiplierDecimal9NullField lotSizeMultiplierDecimal9Null() {
        return lotSizeMultiplierDecimal9Null;
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
     * mifidRegulatedMarket
     *
     * @return the MifidRegulatedMarketBooleanEnum field
     */
    public MifidRegulatedMarketBooleanEnumField mifidRegulatedMarketBooleanEnum() {
        return mifidRegulatedMarketBooleanEnum;
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
     * @return the TestMarketIndicatorBooleanEnum field
     */
    public TestMarketIndicatorBooleanEnumField testMarketIndicatorBooleanEnum() {
        return testMarketIndicatorBooleanEnum;
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
     * noBlockDetails Block
     *
     * @return the SecurityDefinitionReportStrategyMessageNoBlockDetailsGroups record
     */
    public SecurityDefinitionReportStrategyMessageNoBlockDetailsGroups securityDefinitionReportStrategyMessageNoBlockDetailsGroups() {
        return securityDefinitionReportStrategyMessageNoBlockDetailsGroups;
    }

    /**
     * noSecurityAltID Block
     *
     * @return the SecurityDefinitionReportStrategyMessageNoSecurityAltIDGroups record
     */
    public SecurityDefinitionReportStrategyMessageNoSecurityAltIDGroups securityDefinitionReportStrategyMessageNoSecurityAltIDGroups() {
        return securityDefinitionReportStrategyMessageNoSecurityAltIDGroups;
    }

    /**
     * noLegs Block
     *
     * @return the SecurityDefinitionReportStrategyMessageNoLegsGroups record
     */
    public SecurityDefinitionReportStrategyMessageNoLegsGroups securityDefinitionReportStrategyMessageNoLegsGroups() {
        return securityDefinitionReportStrategyMessageNoLegsGroups;
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
     * strategySecurityID data struct
     *
     * @return the StrategySecurityId record
     */
    public StrategySecurityId strategySecurityId() {
        return strategySecurityId;
    }

    /**
     * physicalCode data struct
     *
     * @return the PhysicalCode record
     */
    public PhysicalCode physicalCode() {
        return physicalCode;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + securityDefinitionReportStrategyMessageNoBlockDetailsGroups.byteLength() - SecurityDefinitionReportStrategyMessageNoBlockDetailsGroups.MINIMUM_BYTE_LENGTH + securityDefinitionReportStrategyMessageNoSecurityAltIDGroups.byteLength() - SecurityDefinitionReportStrategyMessageNoSecurityAltIDGroups.MINIMUM_BYTE_LENGTH + securityDefinitionReportStrategyMessageNoLegsGroups.byteLength() - SecurityDefinitionReportStrategyMessageNoLegsGroups.MINIMUM_BYTE_LENGTH + securityId.byteLength() - SecurityId.MINIMUM_BYTE_LENGTH + unitOfMeasure.byteLength() - UnitOfMeasure.MINIMUM_BYTE_LENGTH + priceDenomination.byteLength() - PriceDenomination.MINIMUM_BYTE_LENGTH + clearedAlias.byteLength() - ClearedAlias.MINIMUM_BYTE_LENGTH + securityDesc.byteLength() - SecurityDesc.MINIMUM_BYTE_LENGTH + priceUnit.byteLength() - PriceUnit.MINIMUM_BYTE_LENGTH + stripName.byteLength() - StripName.MINIMUM_BYTE_LENGTH + hubName.byteLength() - HubName.MINIMUM_BYTE_LENGTH + hubAlias.byteLength() - HubAlias.MINIMUM_BYTE_LENGTH + securityExchange.byteLength() - SecurityExchange.MINIMUM_BYTE_LENGTH + strategySecurityId.byteLength() - StrategySecurityId.MINIMUM_BYTE_LENGTH + physicalCode.byteLength() - PhysicalCode.MINIMUM_BYTE_LENGTH;
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
        if (!noRpts.parse(data, cursor)) {
            return false;
        }
        cursor += NoRptsField.BYTE_LENGTH;
        if (!listSeqNo.parse(data, cursor)) {
            return false;
        }
        cursor += ListSeqNoField.BYTE_LENGTH;
        if (!symbolInt.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIntField.BYTE_LENGTH;
        if (!underlyingStrategySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingStrategySymbolField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!securityTradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTradingStatusField.BYTE_LENGTH;
        if (!securitySubTypeInt.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySubTypeIntField.BYTE_LENGTH;
        if (!exchangeSilo.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeSiloField.BYTE_LENGTH;
        if (!transactTimeUtcTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeUtcTimestampField.BYTE_LENGTH;
        if (!legDealsSuppressed.parse(data, cursor)) {
            return false;
        }
        cursor += LegDealsSuppressedField.BYTE_LENGTH;
        if (!incrementPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IncrementPriceField.BYTE_LENGTH;
        if (!incrementQty.parse(data, cursor)) {
            return false;
        }
        cursor += IncrementQtyField.BYTE_LENGTH;
        if (!minPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceField.BYTE_LENGTH;
        if (!maxPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MaxPriceField.BYTE_LENGTH;
        if (!numOfDecimalPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NumOfDecimalPriceField.BYTE_LENGTH;
        if (!numOfDecimalQty.parse(data, cursor)) {
            return false;
        }
        cursor += NumOfDecimalQtyField.BYTE_LENGTH;
        if (!productIDInt.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIDIntField.BYTE_LENGTH;
        if (!baseNumLots.parse(data, cursor)) {
            return false;
        }
        cursor += BaseNumLotsField.BYTE_LENGTH;
        if (!denominator.parse(data, cursor)) {
            return false;
        }
        cursor += DenominatorField.BYTE_LENGTH;
        if (!impliedType.parse(data, cursor)) {
            return false;
        }
        cursor += ImpliedTypeField.BYTE_LENGTH;
        if (!offExchangeIncrementPriceDecimal9Null.parse(data, cursor)) {
            return false;
        }
        cursor += OffExchangeIncrementPriceDecimal9NullField.BYTE_LENGTH;
        if (!offExchangeIncrementQtyDecimal9Null.parse(data, cursor)) {
            return false;
        }
        cursor += OffExchangeIncrementQtyDecimal9NullField.BYTE_LENGTH;
        if (!numOfDecimalStrikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += NumOfDecimalStrikePriceField.BYTE_LENGTH;
        if (!numOfCyclesInt16Null.parse(data, cursor)) {
            return false;
        }
        cursor += NumOfCyclesInt16NullField.BYTE_LENGTH;
        if (!lotSizeMultiplierDecimal9Null.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeMultiplierDecimal9NullField.BYTE_LENGTH;
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
        if (!mifidRegulatedMarketBooleanEnum.parse(data, cursor)) {
            return false;
        }
        cursor += MifidRegulatedMarketBooleanEnumField.BYTE_LENGTH;
        if (!stripType.parse(data, cursor)) {
            return false;
        }
        cursor += StripTypeField.BYTE_LENGTH;
        if (!hubId.parse(data, cursor)) {
            return false;
        }
        cursor += HubIdField.BYTE_LENGTH;
        if (!overrideBlockMin.parse(data, cursor)) {
            return false;
        }
        cursor += OverrideBlockMinField.BYTE_LENGTH;
        if (!testMarketIndicatorBooleanEnum.parse(data, cursor)) {
            return false;
        }
        cursor += TestMarketIndicatorBooleanEnumField.BYTE_LENGTH;
        if (!screenTickValue.parse(data, cursor)) {
            return false;
        }
        cursor += ScreenTickValueField.BYTE_LENGTH;
        if (!blockTickValue.parse(data, cursor)) {
            return false;
        }
        cursor += BlockTickValueField.BYTE_LENGTH;
        if (!securityDefinitionReportStrategyMessageNoBlockDetailsGroups.parseFrom(data, cursor, end - 32)) {
            return false;
        }
        cursor += securityDefinitionReportStrategyMessageNoBlockDetailsGroups.byteLength();
        if (end - cursor < 32) {
            return false;
        }
        if (!securityDefinitionReportStrategyMessageNoSecurityAltIDGroups.parseFrom(data, cursor, end - 28)) {
            return false;
        }
        cursor += securityDefinitionReportStrategyMessageNoSecurityAltIDGroups.byteLength();
        if (end - cursor < 28) {
            return false;
        }
        if (!securityDefinitionReportStrategyMessageNoLegsGroups.parseFrom(data, cursor, end - 24)) {
            return false;
        }
        cursor += securityDefinitionReportStrategyMessageNoLegsGroups.byteLength();
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
        if (!strategySecurityId.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += strategySecurityId.byteLength();
        if (end - cursor < 2) {
            return false;
        }
        if (!physicalCode.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += physicalCode.byteLength();

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
        cursor = noRpts.encode(data, cursor);
        cursor = listSeqNo.encode(data, cursor);
        cursor = symbolInt.encode(data, cursor);
        cursor = underlyingStrategySymbol.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = securityTradingStatus.encode(data, cursor);
        cursor = securitySubTypeInt.encode(data, cursor);
        cursor = exchangeSilo.encode(data, cursor);
        cursor = transactTimeUtcTimestamp.encode(data, cursor);
        cursor = legDealsSuppressed.encode(data, cursor);
        cursor = incrementPrice.encode(data, cursor);
        cursor = incrementQty.encode(data, cursor);
        cursor = minPrice.encode(data, cursor);
        cursor = maxPrice.encode(data, cursor);
        cursor = numOfDecimalPrice.encode(data, cursor);
        cursor = numOfDecimalQty.encode(data, cursor);
        cursor = productIDInt.encode(data, cursor);
        cursor = baseNumLots.encode(data, cursor);
        cursor = denominator.encode(data, cursor);
        cursor = impliedType.encode(data, cursor);
        cursor = offExchangeIncrementPriceDecimal9Null.encode(data, cursor);
        cursor = offExchangeIncrementQtyDecimal9Null.encode(data, cursor);
        cursor = numOfDecimalStrikePrice.encode(data, cursor);
        cursor = numOfCyclesInt16Null.encode(data, cursor);
        cursor = lotSizeMultiplierDecimal9Null.encode(data, cursor);
        cursor = blockOnly.encode(data, cursor);
        cursor = flexAllowed.encode(data, cursor);
        cursor = gtAllowed.encode(data, cursor);
        cursor = mifidRegulatedMarketBooleanEnum.encode(data, cursor);
        cursor = stripType.encode(data, cursor);
        cursor = hubId.encode(data, cursor);
        cursor = overrideBlockMin.encode(data, cursor);
        cursor = testMarketIndicatorBooleanEnum.encode(data, cursor);
        cursor = screenTickValue.encode(data, cursor);
        cursor = blockTickValue.encode(data, cursor);
        cursor = securityDefinitionReportStrategyMessageNoBlockDetailsGroups.encode(data, cursor);
        cursor = securityDefinitionReportStrategyMessageNoSecurityAltIDGroups.encode(data, cursor);
        cursor = securityDefinitionReportStrategyMessageNoLegsGroups.encode(data, cursor);
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
        cursor = strategySecurityId.encode(data, cursor);
        cursor = physicalCode.encode(data, cursor);
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
        securityDefinitionReportStrategyMessageNoBlockDetailsGroups.clear();
        securityDefinitionReportStrategyMessageNoSecurityAltIDGroups.clear();
        securityDefinitionReportStrategyMessageNoLegsGroups.clear();
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
        strategySecurityId.clear();
        physicalCode.clear();
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
            if (field != securityId.securityIdLength() && field != unitOfMeasure.unitOfMeasureLength() && field != priceDenomination.priceDenominationLength() && field != clearedAlias.clearedAliasLength() && field != securityDesc.securityDescLength() && field != priceUnit.priceUnitLength() && field != stripName.stripNameLength() && field != hubName.hubNameLength() && field != hubAlias.hubAliasLength() && field != securityExchange.securityExchangeLength() && field != strategySecurityId.strategySecurityIdLength() && field != physicalCode.physicalCodeLength() && !field.isRecognized()) {
                return false;
            }
        }
        if (!securityDefinitionReportStrategyMessageNoBlockDetailsGroups.isRecognized()) {
            return false;
        }
        if (!securityDefinitionReportStrategyMessageNoSecurityAltIDGroups.isRecognized()) {
            return false;
        }
        return securityDefinitionReportStrategyMessageNoLegsGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != securityId.securityIdLength() && field != unitOfMeasure.unitOfMeasureLength() && field != priceDenomination.priceDenominationLength() && field != clearedAlias.clearedAliasLength() && field != securityDesc.securityDescLength() && field != priceUnit.priceUnitLength() && field != stripName.stripNameLength() && field != hubName.hubNameLength() && field != hubAlias.hubAliasLength() && field != securityExchange.securityExchangeLength() && field != strategySecurityId.strategySecurityIdLength() && field != physicalCode.physicalCodeLength() && !field.isValid()) {
                return false;
            }
        }
        if (!securityDefinitionReportStrategyMessageNoBlockDetailsGroups.isValid()) {
            return false;
        }
        if (!securityDefinitionReportStrategyMessageNoSecurityAltIDGroups.isValid()) {
            return false;
        }
        if (!securityDefinitionReportStrategyMessageNoLegsGroups.isValid()) {
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
        if (!noRpts.isDecoded()) {
            return Optional.of(noRpts);
        }
        if (!listSeqNo.isDecoded()) {
            return Optional.of(listSeqNo);
        }
        if (!symbolInt.isDecoded()) {
            return Optional.of(symbolInt);
        }
        if (!underlyingStrategySymbol.isDecoded()) {
            return Optional.of(underlyingStrategySymbol);
        }
        if (!maturityDate.isDecoded()) {
            return Optional.of(maturityDate);
        }
        if (!securityTradingStatus.isDecoded()) {
            return Optional.of(securityTradingStatus);
        }
        if (!securitySubTypeInt.isDecoded()) {
            return Optional.of(securitySubTypeInt);
        }
        if (!exchangeSilo.isDecoded()) {
            return Optional.of(exchangeSilo);
        }
        if (!transactTimeUtcTimestamp.isDecoded()) {
            return Optional.of(transactTimeUtcTimestamp);
        }
        if (!legDealsSuppressed.isDecoded()) {
            return Optional.of(legDealsSuppressed);
        }
        if (!incrementPrice.isDecoded()) {
            return Optional.of(incrementPrice);
        }
        if (!incrementQty.isDecoded()) {
            return Optional.of(incrementQty);
        }
        if (!minPrice.isDecoded()) {
            return Optional.of(minPrice);
        }
        if (!maxPrice.isDecoded()) {
            return Optional.of(maxPrice);
        }
        if (!numOfDecimalPrice.isDecoded()) {
            return Optional.of(numOfDecimalPrice);
        }
        if (!numOfDecimalQty.isDecoded()) {
            return Optional.of(numOfDecimalQty);
        }
        if (!productIDInt.isDecoded()) {
            return Optional.of(productIDInt);
        }
        if (!baseNumLots.isDecoded()) {
            return Optional.of(baseNumLots);
        }
        if (!denominator.isDecoded()) {
            return Optional.of(denominator);
        }
        if (!impliedType.isDecoded()) {
            return Optional.of(impliedType);
        }
        if (!offExchangeIncrementPriceDecimal9Null.isDecoded()) {
            return Optional.of(offExchangeIncrementPriceDecimal9Null);
        }
        if (!offExchangeIncrementQtyDecimal9Null.isDecoded()) {
            return Optional.of(offExchangeIncrementQtyDecimal9Null);
        }
        if (!numOfDecimalStrikePrice.isDecoded()) {
            return Optional.of(numOfDecimalStrikePrice);
        }
        if (!numOfCyclesInt16Null.isDecoded()) {
            return Optional.of(numOfCyclesInt16Null);
        }
        if (!lotSizeMultiplierDecimal9Null.isDecoded()) {
            return Optional.of(lotSizeMultiplierDecimal9Null);
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
        if (!mifidRegulatedMarketBooleanEnum.isDecoded()) {
            return Optional.of(mifidRegulatedMarketBooleanEnum);
        }
        if (!stripType.isDecoded()) {
            return Optional.of(stripType);
        }
        if (!hubId.isDecoded()) {
            return Optional.of(hubId);
        }
        if (!overrideBlockMin.isDecoded()) {
            return Optional.of(overrideBlockMin);
        }
        if (!testMarketIndicatorBooleanEnum.isDecoded()) {
            return Optional.of(testMarketIndicatorBooleanEnum);
        }
        if (!screenTickValue.isDecoded()) {
            return Optional.of(screenTickValue);
        }
        if (!blockTickValue.isDecoded()) {
            return Optional.of(blockTickValue);
        }
        if (!securityDefinitionReportStrategyMessageNoBlockDetailsGroups.isDecoded()) {
            return securityDefinitionReportStrategyMessageNoBlockDetailsGroups.failedAt();
        }
        if (!securityDefinitionReportStrategyMessageNoSecurityAltIDGroups.isDecoded()) {
            return securityDefinitionReportStrategyMessageNoSecurityAltIDGroups.failedAt();
        }
        if (!securityDefinitionReportStrategyMessageNoLegsGroups.isDecoded()) {
            return securityDefinitionReportStrategyMessageNoLegsGroups.failedAt();
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
        if (!strategySecurityId.isDecoded()) {
            return strategySecurityId.failedAt();
        }
        if (!physicalCode.isDecoded()) {
            return physicalCode.failedAt();
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
            case "NoRpts" -> Optional.of(noRpts);
            case "ListSeqNo" -> Optional.of(listSeqNo);
            case "SymbolInt" -> Optional.of(symbolInt);
            case "UnderlyingStrategySymbol" -> Optional.of(underlyingStrategySymbol);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "SecurityTradingStatus" -> Optional.of(securityTradingStatus);
            case "SecuritySubTypeInt" -> Optional.of(securitySubTypeInt);
            case "ExchangeSilo" -> Optional.of(exchangeSilo);
            case "TransactTimeUtcTimestamp" -> Optional.of(transactTimeUtcTimestamp);
            case "LegDealsSuppressed" -> Optional.of(legDealsSuppressed);
            case "IncrementPrice" -> Optional.of(incrementPrice);
            case "IncrementQty" -> Optional.of(incrementQty);
            case "MinPrice" -> Optional.of(minPrice);
            case "MaxPrice" -> Optional.of(maxPrice);
            case "NumOfDecimalPrice" -> Optional.of(numOfDecimalPrice);
            case "NumOfDecimalQty" -> Optional.of(numOfDecimalQty);
            case "ProductIDInt" -> Optional.of(productIDInt);
            case "BaseNumLots" -> Optional.of(baseNumLots);
            case "Denominator" -> Optional.of(denominator);
            case "ImpliedType" -> Optional.of(impliedType);
            case "OffExchangeIncrementPriceDecimal9Null" -> Optional.of(offExchangeIncrementPriceDecimal9Null);
            case "OffExchangeIncrementQtyDecimal9Null" -> Optional.of(offExchangeIncrementQtyDecimal9Null);
            case "NumOfDecimalStrikePrice" -> Optional.of(numOfDecimalStrikePrice);
            case "NumOfCyclesInt16Null" -> Optional.of(numOfCyclesInt16Null);
            case "LotSizeMultiplierDecimal9Null" -> Optional.of(lotSizeMultiplierDecimal9Null);
            case "BlockOnly" -> Optional.of(blockOnly);
            case "FlexAllowed" -> Optional.of(flexAllowed);
            case "GtAllowed" -> Optional.of(gtAllowed);
            case "MifidRegulatedMarketBooleanEnum" -> Optional.of(mifidRegulatedMarketBooleanEnum);
            case "StripType" -> Optional.of(stripType);
            case "HubId" -> Optional.of(hubId);
            case "OverrideBlockMin" -> Optional.of(overrideBlockMin);
            case "TestMarketIndicatorBooleanEnum" -> Optional.of(testMarketIndicatorBooleanEnum);
            case "ScreenTickValue" -> Optional.of(screenTickValue);
            case "BlockTickValue" -> Optional.of(blockTickValue);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityDefinitionReportStrategyMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(securityDefinitionReportStrategyMessageNoBlockDetailsGroups.diffFields(message.securityDefinitionReportStrategyMessageNoBlockDetailsGroups));
        changed.addAll(securityDefinitionReportStrategyMessageNoSecurityAltIDGroups.diffFields(message.securityDefinitionReportStrategyMessageNoSecurityAltIDGroups));
        changed.addAll(securityDefinitionReportStrategyMessageNoLegsGroups.diffFields(message.securityDefinitionReportStrategyMessageNoLegsGroups));
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
            securityDefinitionReportStrategyMessageNoBlockDetailsGroups.toFormattedString(builder, options);
            builder.append(", ");
            securityDefinitionReportStrategyMessageNoSecurityAltIDGroups.toFormattedString(builder, options);
            builder.append(", ");
            securityDefinitionReportStrategyMessageNoLegsGroups.toFormattedString(builder, options);
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
        securityDefinitionReportStrategyMessageNoBlockDetailsGroups.toFormattedString(builder, nested);
        securityDefinitionReportStrategyMessageNoSecurityAltIDGroups.toFormattedString(builder, nested);
        securityDefinitionReportStrategyMessageNoLegsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof SecurityDefinitionReportStrategyMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && securityDefinitionReportStrategyMessageNoBlockDetailsGroups.equals(message.securityDefinitionReportStrategyMessageNoBlockDetailsGroups) && securityDefinitionReportStrategyMessageNoSecurityAltIDGroups.equals(message.securityDefinitionReportStrategyMessageNoSecurityAltIDGroups) && securityDefinitionReportStrategyMessageNoLegsGroups.equals(message.securityDefinitionReportStrategyMessageNoLegsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, securityDefinitionReportStrategyMessageNoBlockDetailsGroups, securityDefinitionReportStrategyMessageNoSecurityAltIDGroups, securityDefinitionReportStrategyMessageNoLegsGroups);
    }
}
