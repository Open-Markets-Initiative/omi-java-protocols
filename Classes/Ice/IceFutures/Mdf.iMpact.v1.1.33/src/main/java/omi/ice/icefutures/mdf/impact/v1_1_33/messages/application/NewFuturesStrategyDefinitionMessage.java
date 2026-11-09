package omi.ice.icefutures.mdf.impact.v1_1_33.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.AllowOptionsField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.AllowsImpliedField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.ClearedAliasField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.DealPriceDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.ExchangeSiloField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.FuturesContractSymbolField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.GtAllowedField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.HedgeOnlyField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.HubAliasField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.HubIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.IncrementPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.IncrementQtyField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.IsBlockOnlyField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.IsTradableField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.LegDealSuppressedField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MarketDescField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MaturityDayField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MaturityMonthField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MaturityYearField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MaxPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MicCodeField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MifidRegulatedMarketField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MinPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MinQtyField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.NumDecimalsOptionsPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.NumberOfLegDefinitionsField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.OffExchangeIncrementOptionPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.OffExchangeIncrementPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.OffExchangeIncrementQtyDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.OffExchangeIncrementQtyField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.OrderPriceDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.ProductIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.ProductNameField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.SecuritySubTypeField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.SettlePriceDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.StrategySymbolField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.StripIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.StripNameField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.TestMarketIndicatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.TradingStatusField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.UnderlyingIsinField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.UnitQtyDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.UnitQuantityField;
import omi.ice.icefutures.mdf.impact.v1_1_33.groups.LegDefinitionEntry;
import omi.ice.icefutures.mdf.impact.v1_1_33.groups.LegDefinitionList;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.Message;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.PrintOptions;

/**
 * Represents the NewFuturesStrategyDefinitionMessage message from the Mdf protocol.
 *
 * <p>New Futures Strategy Definition messages will be sent out when new UDS markets for futures are created.</p>
 */
public final class NewFuturesStrategyDefinitionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '9';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 510;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Futures Strategy Definition Message";

    /**
     * Market Id
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * Futures Contract Symbol
     */
    private final FuturesContractSymbolField futuresContractSymbol = new FuturesContractSymbolField();

    /**
     * See Appendix A on the trading status codes
     */
    private final TradingStatusField tradingStatus = new TradingStatusField();

    /**
     * Denominator for the order price fields in this market.
     */
    private final OrderPriceDenominatorField orderPriceDenominator = new OrderPriceDenominatorField();

    /**
     * Minimum increment premium price for this market. OrderPriceDenominator should be applied to this field.
     */
    private final IncrementPriceField incrementPrice = new IncrementPriceField();

    /**
     * Minimum increment quantity for this market
     */
    private final IncrementQtyField incrementQty = new IncrementQtyField();

    /**
     * Minimum quantity for this market
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * Number of strategy leg definitions. The leg info
     */
    private final NumberOfLegDefinitionsField numberOfLegDefinitions = new NumberOfLegDefinitionsField();

    /**
     * Contains the Strategy Code for defined market where applicable. See Appendix E for list of codes.
     */
    private final SecuritySubTypeField securitySubType = new SecuritySubTypeField();

    /**
     * Indicates if Market is only tradable via ICE Block Trade. This also means the screen trading is not allowed for the market. ‘Y’ or ‘N’
     */
    private final IsBlockOnlyField isBlockOnly = new IsBlockOnlyField();

    /**
     * Strategy Symbol
     */
    private final StrategySymbolField strategySymbol = new StrategySymbolField();

    /**
     * Indicates if GTC is allowed in the market. ‘Y’ or ‘N’
     */
    private final GtAllowedField gtAllowed = new GtAllowedField();

    /**
     * Indicates MIFID-II market. ‘Y’ or ‘N’
     */
    private final MifidRegulatedMarketField mifidRegulatedMarket = new MifidRegulatedMarketField();

    /**
     * Description of the market
     */
    private final MarketDescField marketDesc = new MarketDescField();

    /**
     * 4 digit year
     */
    private final MaturityYearField maturityYear = new MaturityYearField();

    /**
     * Month range 1-12
     */
    private final MaturityMonthField maturityMonth = new MaturityMonthField();

    /**
     * Maturity Day
     */
    private final MaturityDayField maturityDay = new MaturityDayField();

    /**
     * Denominator for the deal price fields in the market. For most markets, this is the same as OrderPriceDenominator. However, it could be different for some crack or spread markets.
     */
    private final DealPriceDenominatorField dealPriceDenominator = new DealPriceDenominatorField();

    /**
     * The quantity in unit of measurement per lot. For example, it is 1000 barrels per lot for Brent.
     */
    private final UnitQuantityField unitQuantity = new UnitQuantityField();

    /**
     * Only used for OffExchangeIncrementOptionPrice.
     */
    private final NumDecimalsOptionsPriceField numDecimalsOptionsPrice = new NumDecimalsOptionsPriceField();

    /**
     * Indicate if the market supports option markets, ‘Y’ or ‘N’
     */
    private final AllowOptionsField allowOptions = new AllowOptionsField();

    /**
     * Clearing limit admin related
     */
    private final ClearedAliasField clearedAlias = new ClearedAliasField();

    /**
     * ‘Y’ indicates this is a spread market, and, implied is allowed in this market
     */
    private final AllowsImpliedField allowsImplied = new AllowsImpliedField();

    /**
     * Minimum Price. OrderPriceDenominator should be applied to this field.
     */
    private final MinPriceField minPrice = new MinPriceField();

    /**
     * Maximum Price. OrderPriceDenominator should be applied to this field.
     */
    private final MaxPriceField maxPrice = new MaxPriceField();

    /**
     * Name of the product that the contract/market is under
     */
    private final ProductNameField productName = new ProductNameField();

    /**
     * Alias of the hub for the contract/market
     */
    private final HubAliasField hubAlias = new HubAliasField();

    /**
     * Name of the strip for the contract/market
     */
    private final StripNameField stripName = new StripNameField();

    /**
     * Indicate if the contract is tradable. ‘Y’ or ‘N’.
     */
    private final IsTradableField isTradable = new IsTradableField();

    /**
     * Denominator for the settlement price fields in the market. For most markets, this is the same as DealPriceDenominator.
     */
    private final SettlePriceDenominatorField settlePriceDenominator = new SettlePriceDenominatorField();

    /**
     * Market Identifier Code for the market.
     */
    private final MicCodeField micCode = new MicCodeField();

    /**
     * Denominator for UnitQuantity. This field will be ‘0’ for most of the markets.
     */
    private final UnitQtyDenominatorField unitQtyDenominator = new UnitQtyDenominatorField();

    /**
     * Indicate if the contract is for hedge only. ‘Y’ or ‘N’.
     */
    private final HedgeOnlyField hedgeOnly = new HedgeOnlyField();

    /**
     * Exchange silo code for the market.
     */
    private final ExchangeSiloField exchangeSilo = new ExchangeSiloField();

    /**
     * Denominator for OffExchangeIncrementQty.
     */
    private final OffExchangeIncrementQtyDenominatorField offExchangeIncrementQtyDenominator = new OffExchangeIncrementQtyDenominatorField();

    /**
     * Off exchange increment qty. OffExchangeIncrementQtyDenominator should be applied to this field.
     */
    private final OffExchangeIncrementQtyField offExchangeIncrementQty = new OffExchangeIncrementQtyField();

    /**
     * Off exchange increment price.
     */
    private final OffExchangeIncrementPriceField offExchangeIncrementPrice = new OffExchangeIncrementPriceField();

    /**
     * Off exchange options increment price. NumDecimalsOptionsPrice should be applied to this field
     */
    private final OffExchangeIncrementOptionPriceField offExchangeIncrementOptionPrice = new OffExchangeIncrementOptionPriceField();

    /**
     * ID of the product that the contract/market is under.
     */
    private final ProductIdField productId = new ProductIdField();

    /**
     * ID of the hub for the contract/market
     */
    private final HubIdField hubId = new HubIdField();

    /**
     * StripID
     */
    private final StripIdField stripId = new StripIdField();

    /**
     * The ISIN of the security this market is associated with. This is currently only populated for Liffe Equity markets.
     */
    private final UnderlyingIsinField underlyingIsin = new UnderlyingIsinField();

    /**
     * Indicates Test Market. ‘Y’ or ‘N’
     */
    private final TestMarketIndicatorField testMarketIndicator = new TestMarketIndicatorField();

    /**
     * Indicates whether leg deals are suppressed. ‘Y’ or ‘N’
     */
    private final LegDealSuppressedField legDealSuppressed = new LegDealSuppressedField();

    /**
     * Leg Definition
     */
    private final LegDefinitionList legDefinition = new LegDefinitionList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketId, futuresContractSymbol, tradingStatus, orderPriceDenominator, incrementPrice, incrementQty, minQty, numberOfLegDefinitions, securitySubType, isBlockOnly, strategySymbol, gtAllowed, mifidRegulatedMarket, marketDesc, maturityYear, maturityMonth, maturityDay, dealPriceDenominator, unitQuantity, numDecimalsOptionsPrice, allowOptions, clearedAlias, allowsImplied, minPrice, maxPrice, productName, hubAlias, stripName, isTradable, settlePriceDenominator, micCode, unitQtyDenominator, hedgeOnly, exchangeSilo, offExchangeIncrementQtyDenominator, offExchangeIncrementQty, offExchangeIncrementPrice, offExchangeIncrementOptionPrice, productId, hubId, stripId, underlyingIsin, testMarketIndicator, legDealSuppressed);

    private byte[] buffer;

    private boolean decoded;

    private int gapOffset0 = -1;

    /**
     * Market Id
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * Futures Contract Symbol
     *
     * @return the FuturesContractSymbol field
     */
    public FuturesContractSymbolField futuresContractSymbol() {
        return futuresContractSymbol;
    }

    /**
     * See Appendix A on the trading status codes
     *
     * @return the TradingStatus field
     */
    public TradingStatusField tradingStatus() {
        return tradingStatus;
    }

    /**
     * Denominator for the order price fields in this market.
     *
     * @return the OrderPriceDenominator field
     */
    public OrderPriceDenominatorField orderPriceDenominator() {
        return orderPriceDenominator;
    }

    /**
     * Minimum increment premium price for this market. OrderPriceDenominator should be applied to this field.
     *
     * @return the IncrementPrice field
     */
    public IncrementPriceField incrementPrice() {
        return incrementPrice;
    }

    /**
     * Minimum increment quantity for this market
     *
     * @return the IncrementQty field
     */
    public IncrementQtyField incrementQty() {
        return incrementQty;
    }

    /**
     * Minimum quantity for this market
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
    }

    /**
     * Number of strategy leg definitions. The leg info
     *
     * @return the NumberOfLegDefinitions field
     */
    public NumberOfLegDefinitionsField numberOfLegDefinitions() {
        return numberOfLegDefinitions;
    }

    /**
     * Contains the Strategy Code for defined market where applicable. See Appendix E for list of codes.
     *
     * @return the SecuritySubType field
     */
    public SecuritySubTypeField securitySubType() {
        return securitySubType;
    }

    /**
     * Indicates if Market is only tradable via ICE Block Trade. This also means the screen trading is not allowed for the market. ‘Y’ or ‘N’
     *
     * @return the IsBlockOnly field
     */
    public IsBlockOnlyField isBlockOnly() {
        return isBlockOnly;
    }

    /**
     * Strategy Symbol
     *
     * @return the StrategySymbol field
     */
    public StrategySymbolField strategySymbol() {
        return strategySymbol;
    }

    /**
     * Indicates if GTC is allowed in the market. ‘Y’ or ‘N’
     *
     * @return the GtAllowed field
     */
    public GtAllowedField gtAllowed() {
        return gtAllowed;
    }

    /**
     * Indicates MIFID-II market. ‘Y’ or ‘N’
     *
     * @return the MifidRegulatedMarket field
     */
    public MifidRegulatedMarketField mifidRegulatedMarket() {
        return mifidRegulatedMarket;
    }

    /**
     * Description of the market
     *
     * @return the MarketDesc field
     */
    public MarketDescField marketDesc() {
        return marketDesc;
    }

    /**
     * 4 digit year
     *
     * @return the MaturityYear field
     */
    public MaturityYearField maturityYear() {
        return maturityYear;
    }

    /**
     * Month range 1-12
     *
     * @return the MaturityMonth field
     */
    public MaturityMonthField maturityMonth() {
        return maturityMonth;
    }

    /**
     * Maturity Day
     *
     * @return the MaturityDay field
     */
    public MaturityDayField maturityDay() {
        return maturityDay;
    }

    /**
     * Denominator for the deal price fields in the market. For most markets, this is the same as OrderPriceDenominator. However, it could be different for some crack or spread markets.
     *
     * @return the DealPriceDenominator field
     */
    public DealPriceDenominatorField dealPriceDenominator() {
        return dealPriceDenominator;
    }

    /**
     * The quantity in unit of measurement per lot. For example, it is 1000 barrels per lot for Brent.
     *
     * @return the UnitQuantity field
     */
    public UnitQuantityField unitQuantity() {
        return unitQuantity;
    }

    /**
     * Only used for OffExchangeIncrementOptionPrice.
     *
     * @return the NumDecimalsOptionsPrice field
     */
    public NumDecimalsOptionsPriceField numDecimalsOptionsPrice() {
        return numDecimalsOptionsPrice;
    }

    /**
     * Indicate if the market supports option markets, ‘Y’ or ‘N’
     *
     * @return the AllowOptions field
     */
    public AllowOptionsField allowOptions() {
        return allowOptions;
    }

    /**
     * Clearing limit admin related
     *
     * @return the ClearedAlias field
     */
    public ClearedAliasField clearedAlias() {
        return clearedAlias;
    }

    /**
     * ‘Y’ indicates this is a spread market, and, implied is allowed in this market
     *
     * @return the AllowsImplied field
     */
    public AllowsImpliedField allowsImplied() {
        return allowsImplied;
    }

    /**
     * Minimum Price. OrderPriceDenominator should be applied to this field.
     *
     * @return the MinPrice field
     */
    public MinPriceField minPrice() {
        return minPrice;
    }

    /**
     * Maximum Price. OrderPriceDenominator should be applied to this field.
     *
     * @return the MaxPrice field
     */
    public MaxPriceField maxPrice() {
        return maxPrice;
    }

    /**
     * Name of the product that the contract/market is under
     *
     * @return the ProductName field
     */
    public ProductNameField productName() {
        return productName;
    }

    /**
     * Alias of the hub for the contract/market
     *
     * @return the HubAlias field
     */
    public HubAliasField hubAlias() {
        return hubAlias;
    }

    /**
     * Name of the strip for the contract/market
     *
     * @return the StripName field
     */
    public StripNameField stripName() {
        return stripName;
    }

    /**
     * Indicate if the contract is tradable. ‘Y’ or ‘N’.
     *
     * @return the IsTradable field
     */
    public IsTradableField isTradable() {
        return isTradable;
    }

    /**
     * Denominator for the settlement price fields in the market. For most markets, this is the same as DealPriceDenominator.
     *
     * @return the SettlePriceDenominator field
     */
    public SettlePriceDenominatorField settlePriceDenominator() {
        return settlePriceDenominator;
    }

    /**
     * Market Identifier Code for the market.
     *
     * @return the MicCode field
     */
    public MicCodeField micCode() {
        return micCode;
    }

    /**
     * Denominator for UnitQuantity. This field will be ‘0’ for most of the markets.
     *
     * @return the UnitQtyDenominator field
     */
    public UnitQtyDenominatorField unitQtyDenominator() {
        return unitQtyDenominator;
    }

    /**
     * Indicate if the contract is for hedge only. ‘Y’ or ‘N’.
     *
     * @return the HedgeOnly field
     */
    public HedgeOnlyField hedgeOnly() {
        return hedgeOnly;
    }

    /**
     * Exchange silo code for the market.
     *
     * @return the ExchangeSilo field
     */
    public ExchangeSiloField exchangeSilo() {
        return exchangeSilo;
    }

    /**
     * Denominator for OffExchangeIncrementQty.
     *
     * @return the OffExchangeIncrementQtyDenominator field
     */
    public OffExchangeIncrementQtyDenominatorField offExchangeIncrementQtyDenominator() {
        return offExchangeIncrementQtyDenominator;
    }

    /**
     * Off exchange increment qty. OffExchangeIncrementQtyDenominator should be applied to this field.
     *
     * @return the OffExchangeIncrementQty field
     */
    public OffExchangeIncrementQtyField offExchangeIncrementQty() {
        return offExchangeIncrementQty;
    }

    /**
     * Off exchange increment price.
     *
     * @return the OffExchangeIncrementPrice field
     */
    public OffExchangeIncrementPriceField offExchangeIncrementPrice() {
        return offExchangeIncrementPrice;
    }

    /**
     * Off exchange options increment price. NumDecimalsOptionsPrice should be applied to this field
     *
     * @return the OffExchangeIncrementOptionPrice field
     */
    public OffExchangeIncrementOptionPriceField offExchangeIncrementOptionPrice() {
        return offExchangeIncrementOptionPrice;
    }

    /**
     * ID of the product that the contract/market is under.
     *
     * @return the ProductId field
     */
    public ProductIdField productId() {
        return productId;
    }

    /**
     * ID of the hub for the contract/market
     *
     * @return the HubId field
     */
    public HubIdField hubId() {
        return hubId;
    }

    /**
     * StripID
     *
     * @return the StripId field
     */
    public StripIdField stripId() {
        return stripId;
    }

    /**
     * The ISIN of the security this market is associated with. This is currently only populated for Liffe Equity markets.
     *
     * @return the UnderlyingIsin field
     */
    public UnderlyingIsinField underlyingIsin() {
        return underlyingIsin;
    }

    /**
     * Indicates Test Market. ‘Y’ or ‘N’
     *
     * @return the TestMarketIndicator field
     */
    public TestMarketIndicatorField testMarketIndicator() {
        return testMarketIndicator;
    }

    /**
     * Indicates whether leg deals are suppressed. ‘Y’ or ‘N’
     *
     * @return the LegDealSuppressed field
     */
    public LegDealSuppressedField legDealSuppressed() {
        return legDealSuppressed;
    }

    /**
     * Leg Definition
     *
     * <p>Encode writes this list's size to the NumberOfLegDefinitions field.</p>
     *
     * @return the LegDefinition entries
     */
    public LegDefinitionList legDefinition() {
        return legDefinition;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + legDefinition.byteLength();
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
        cursor += 70;
        cursor += 1;
        cursor += 1;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor = legDefinition.padding(runs, cursor);
        cursor += 2;
        cursor += 1;
        cursor += 18;
        cursor += 1;
        runs.add(cursor).add(4);
        cursor += 4;
        cursor += 1;
        cursor += 120;
        cursor += 2;
        cursor += 2;
        cursor += 2;
        cursor += 1;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 15;
        cursor += 1;
        cursor += 8;
        cursor += 8;
        cursor += 62;
        cursor += 80;
        cursor += 39;
        cursor += 1;
        cursor += 1;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 12;
        cursor += 1;
        cursor += 1;
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
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!futuresContractSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += FuturesContractSymbolField.BYTE_LENGTH;
        if (!tradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradingStatusField.BYTE_LENGTH;
        if (!orderPriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += OrderPriceDenominatorField.BYTE_LENGTH;
        if (!incrementPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IncrementPriceField.BYTE_LENGTH;
        if (!incrementQty.parse(data, cursor)) {
            return false;
        }
        cursor += IncrementQtyField.BYTE_LENGTH;
        if (!minQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinQtyField.BYTE_LENGTH;
        if (!numberOfLegDefinitions.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfLegDefinitionsField.BYTE_LENGTH;
        if (!legDefinition.parse(data, cursor, end - 421, numberOfLegDefinitions.value())) {
            return false;
        }
        cursor += legDefinition.byteLength();
        if (end - cursor < 421) {
            return false;
        }
        if (!securitySubType.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySubTypeField.BYTE_LENGTH;
        if (!isBlockOnly.parse(data, cursor)) {
            return false;
        }
        cursor += IsBlockOnlyField.BYTE_LENGTH;
        if (!strategySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += StrategySymbolField.BYTE_LENGTH;
        if (!gtAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += GtAllowedField.BYTE_LENGTH;
        this.gapOffset0 = cursor - offset;
        cursor += 4; // padding
        if (!mifidRegulatedMarket.parse(data, cursor)) {
            return false;
        }
        cursor += MifidRegulatedMarketField.BYTE_LENGTH;
        if (!marketDesc.parse(data, cursor)) {
            return false;
        }
        cursor += MarketDescField.BYTE_LENGTH;
        if (!maturityYear.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityYearField.BYTE_LENGTH;
        if (!maturityMonth.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityMonthField.BYTE_LENGTH;
        if (!maturityDay.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDayField.BYTE_LENGTH;
        if (!dealPriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += DealPriceDenominatorField.BYTE_LENGTH;
        if (!unitQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += UnitQuantityField.BYTE_LENGTH;
        if (!numDecimalsOptionsPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NumDecimalsOptionsPriceField.BYTE_LENGTH;
        if (!allowOptions.parse(data, cursor)) {
            return false;
        }
        cursor += AllowOptionsField.BYTE_LENGTH;
        if (!clearedAlias.parse(data, cursor)) {
            return false;
        }
        cursor += ClearedAliasField.BYTE_LENGTH;
        if (!allowsImplied.parse(data, cursor)) {
            return false;
        }
        cursor += AllowsImpliedField.BYTE_LENGTH;
        if (!minPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceField.BYTE_LENGTH;
        if (!maxPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MaxPriceField.BYTE_LENGTH;
        if (!productName.parse(data, cursor)) {
            return false;
        }
        cursor += ProductNameField.BYTE_LENGTH;
        if (!hubAlias.parse(data, cursor)) {
            return false;
        }
        cursor += HubAliasField.BYTE_LENGTH;
        if (!stripName.parse(data, cursor)) {
            return false;
        }
        cursor += StripNameField.BYTE_LENGTH;
        if (!isTradable.parse(data, cursor)) {
            return false;
        }
        cursor += IsTradableField.BYTE_LENGTH;
        if (!settlePriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += SettlePriceDenominatorField.BYTE_LENGTH;
        if (!micCode.parse(data, cursor)) {
            return false;
        }
        cursor += MicCodeField.BYTE_LENGTH;
        if (!unitQtyDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += UnitQtyDenominatorField.BYTE_LENGTH;
        if (!hedgeOnly.parse(data, cursor)) {
            return false;
        }
        cursor += HedgeOnlyField.BYTE_LENGTH;
        if (!exchangeSilo.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeSiloField.BYTE_LENGTH;
        if (!offExchangeIncrementQtyDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += OffExchangeIncrementQtyDenominatorField.BYTE_LENGTH;
        if (!offExchangeIncrementQty.parse(data, cursor)) {
            return false;
        }
        cursor += OffExchangeIncrementQtyField.BYTE_LENGTH;
        if (!offExchangeIncrementPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OffExchangeIncrementPriceField.BYTE_LENGTH;
        if (!offExchangeIncrementOptionPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OffExchangeIncrementOptionPriceField.BYTE_LENGTH;
        if (!productId.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdField.BYTE_LENGTH;
        if (!hubId.parse(data, cursor)) {
            return false;
        }
        cursor += HubIdField.BYTE_LENGTH;
        if (!stripId.parse(data, cursor)) {
            return false;
        }
        cursor += StripIdField.BYTE_LENGTH;
        if (!underlyingIsin.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingIsinField.BYTE_LENGTH;
        if (!testMarketIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TestMarketIndicatorField.BYTE_LENGTH;
        if (!legDealSuppressed.parse(data, cursor)) {
            return false;
        }
        cursor += LegDealSuppressedField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (legDefinition.size() > 127) {
            throw new IllegalStateException("legDefinition holds " + legDefinition.size() + " entries, more than its count field can state");
        }
        numberOfLegDefinitions.value((byte) legDefinition.size());
        int cursor = offset;
        cursor = marketId.encode(data, cursor);
        cursor = futuresContractSymbol.encode(data, cursor);
        cursor = tradingStatus.encode(data, cursor);
        cursor = orderPriceDenominator.encode(data, cursor);
        cursor = incrementPrice.encode(data, cursor);
        cursor = incrementQty.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = numberOfLegDefinitions.encode(data, cursor);
        cursor = legDefinition.encode(data, cursor);
        cursor = securitySubType.encode(data, cursor);
        cursor = isBlockOnly.encode(data, cursor);
        cursor = strategySymbol.encode(data, cursor);
        cursor = gtAllowed.encode(data, cursor);
        if (buffer != null && gapOffset0 >= 0 && buffer.length >= gapOffset0 + 4) {
            System.arraycopy(buffer, gapOffset0, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = mifidRegulatedMarket.encode(data, cursor);
        cursor = marketDesc.encode(data, cursor);
        cursor = maturityYear.encode(data, cursor);
        cursor = maturityMonth.encode(data, cursor);
        cursor = maturityDay.encode(data, cursor);
        cursor = dealPriceDenominator.encode(data, cursor);
        cursor = unitQuantity.encode(data, cursor);
        cursor = numDecimalsOptionsPrice.encode(data, cursor);
        cursor = allowOptions.encode(data, cursor);
        cursor = clearedAlias.encode(data, cursor);
        cursor = allowsImplied.encode(data, cursor);
        cursor = minPrice.encode(data, cursor);
        cursor = maxPrice.encode(data, cursor);
        cursor = productName.encode(data, cursor);
        cursor = hubAlias.encode(data, cursor);
        cursor = stripName.encode(data, cursor);
        cursor = isTradable.encode(data, cursor);
        cursor = settlePriceDenominator.encode(data, cursor);
        cursor = micCode.encode(data, cursor);
        cursor = unitQtyDenominator.encode(data, cursor);
        cursor = hedgeOnly.encode(data, cursor);
        cursor = exchangeSilo.encode(data, cursor);
        cursor = offExchangeIncrementQtyDenominator.encode(data, cursor);
        cursor = offExchangeIncrementQty.encode(data, cursor);
        cursor = offExchangeIncrementPrice.encode(data, cursor);
        cursor = offExchangeIncrementOptionPrice.encode(data, cursor);
        cursor = productId.encode(data, cursor);
        cursor = hubId.encode(data, cursor);
        cursor = stripId.encode(data, cursor);
        cursor = underlyingIsin.encode(data, cursor);
        cursor = testMarketIndicator.encode(data, cursor);
        cursor = legDealSuppressed.encode(data, cursor);
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
        legDefinition.clear();
        this.gapOffset0 = -1;
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
            if (field != numberOfLegDefinitions && !field.isRecognized()) {
                return false;
            }
        }
        if (!legDefinition.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfLegDefinitions && !field.isValid()) {
                return false;
            }
        }
        if (!legDefinition.isValid()) {
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
        if (!marketId.isDecoded()) {
            return Optional.of(marketId);
        }
        if (!futuresContractSymbol.isDecoded()) {
            return Optional.of(futuresContractSymbol);
        }
        if (!tradingStatus.isDecoded()) {
            return Optional.of(tradingStatus);
        }
        if (!orderPriceDenominator.isDecoded()) {
            return Optional.of(orderPriceDenominator);
        }
        if (!incrementPrice.isDecoded()) {
            return Optional.of(incrementPrice);
        }
        if (!incrementQty.isDecoded()) {
            return Optional.of(incrementQty);
        }
        if (!minQty.isDecoded()) {
            return Optional.of(minQty);
        }
        if (!numberOfLegDefinitions.isDecoded()) {
            return Optional.of(numberOfLegDefinitions);
        }
        if (!legDefinition.isDecoded()) {
            return Optional.of(legDefinition.failedEntry().flatMap(LegDefinitionEntry::failedAt).orElse(numberOfLegDefinitions));
        }
        if (!securitySubType.isDecoded()) {
            return Optional.of(securitySubType);
        }
        if (!isBlockOnly.isDecoded()) {
            return Optional.of(isBlockOnly);
        }
        if (!strategySymbol.isDecoded()) {
            return Optional.of(strategySymbol);
        }
        if (!gtAllowed.isDecoded()) {
            return Optional.of(gtAllowed);
        }
        if (!mifidRegulatedMarket.isDecoded()) {
            return Optional.of(mifidRegulatedMarket);
        }
        if (!marketDesc.isDecoded()) {
            return Optional.of(marketDesc);
        }
        if (!maturityYear.isDecoded()) {
            return Optional.of(maturityYear);
        }
        if (!maturityMonth.isDecoded()) {
            return Optional.of(maturityMonth);
        }
        if (!maturityDay.isDecoded()) {
            return Optional.of(maturityDay);
        }
        if (!dealPriceDenominator.isDecoded()) {
            return Optional.of(dealPriceDenominator);
        }
        if (!unitQuantity.isDecoded()) {
            return Optional.of(unitQuantity);
        }
        if (!numDecimalsOptionsPrice.isDecoded()) {
            return Optional.of(numDecimalsOptionsPrice);
        }
        if (!allowOptions.isDecoded()) {
            return Optional.of(allowOptions);
        }
        if (!clearedAlias.isDecoded()) {
            return Optional.of(clearedAlias);
        }
        if (!allowsImplied.isDecoded()) {
            return Optional.of(allowsImplied);
        }
        if (!minPrice.isDecoded()) {
            return Optional.of(minPrice);
        }
        if (!maxPrice.isDecoded()) {
            return Optional.of(maxPrice);
        }
        if (!productName.isDecoded()) {
            return Optional.of(productName);
        }
        if (!hubAlias.isDecoded()) {
            return Optional.of(hubAlias);
        }
        if (!stripName.isDecoded()) {
            return Optional.of(stripName);
        }
        if (!isTradable.isDecoded()) {
            return Optional.of(isTradable);
        }
        if (!settlePriceDenominator.isDecoded()) {
            return Optional.of(settlePriceDenominator);
        }
        if (!micCode.isDecoded()) {
            return Optional.of(micCode);
        }
        if (!unitQtyDenominator.isDecoded()) {
            return Optional.of(unitQtyDenominator);
        }
        if (!hedgeOnly.isDecoded()) {
            return Optional.of(hedgeOnly);
        }
        if (!exchangeSilo.isDecoded()) {
            return Optional.of(exchangeSilo);
        }
        if (!offExchangeIncrementQtyDenominator.isDecoded()) {
            return Optional.of(offExchangeIncrementQtyDenominator);
        }
        if (!offExchangeIncrementQty.isDecoded()) {
            return Optional.of(offExchangeIncrementQty);
        }
        if (!offExchangeIncrementPrice.isDecoded()) {
            return Optional.of(offExchangeIncrementPrice);
        }
        if (!offExchangeIncrementOptionPrice.isDecoded()) {
            return Optional.of(offExchangeIncrementOptionPrice);
        }
        if (!productId.isDecoded()) {
            return Optional.of(productId);
        }
        if (!hubId.isDecoded()) {
            return Optional.of(hubId);
        }
        if (!stripId.isDecoded()) {
            return Optional.of(stripId);
        }
        if (!underlyingIsin.isDecoded()) {
            return Optional.of(underlyingIsin);
        }
        if (!testMarketIndicator.isDecoded()) {
            return Optional.of(testMarketIndicator);
        }
        if (!legDealSuppressed.isDecoded()) {
            return Optional.of(legDealSuppressed);
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
            case "MarketId" -> Optional.of(marketId);
            case "FuturesContractSymbol" -> Optional.of(futuresContractSymbol);
            case "TradingStatus" -> Optional.of(tradingStatus);
            case "OrderPriceDenominator" -> Optional.of(orderPriceDenominator);
            case "IncrementPrice" -> Optional.of(incrementPrice);
            case "IncrementQty" -> Optional.of(incrementQty);
            case "MinQty" -> Optional.of(minQty);
            case "NumberOfLegDefinitions" -> Optional.of(numberOfLegDefinitions);
            case "SecuritySubType" -> Optional.of(securitySubType);
            case "IsBlockOnly" -> Optional.of(isBlockOnly);
            case "StrategySymbol" -> Optional.of(strategySymbol);
            case "GtAllowed" -> Optional.of(gtAllowed);
            case "MifidRegulatedMarket" -> Optional.of(mifidRegulatedMarket);
            case "MarketDesc" -> Optional.of(marketDesc);
            case "MaturityYear" -> Optional.of(maturityYear);
            case "MaturityMonth" -> Optional.of(maturityMonth);
            case "MaturityDay" -> Optional.of(maturityDay);
            case "DealPriceDenominator" -> Optional.of(dealPriceDenominator);
            case "UnitQuantity" -> Optional.of(unitQuantity);
            case "NumDecimalsOptionsPrice" -> Optional.of(numDecimalsOptionsPrice);
            case "AllowOptions" -> Optional.of(allowOptions);
            case "ClearedAlias" -> Optional.of(clearedAlias);
            case "AllowsImplied" -> Optional.of(allowsImplied);
            case "MinPrice" -> Optional.of(minPrice);
            case "MaxPrice" -> Optional.of(maxPrice);
            case "ProductName" -> Optional.of(productName);
            case "HubAlias" -> Optional.of(hubAlias);
            case "StripName" -> Optional.of(stripName);
            case "IsTradable" -> Optional.of(isTradable);
            case "SettlePriceDenominator" -> Optional.of(settlePriceDenominator);
            case "MicCode" -> Optional.of(micCode);
            case "UnitQtyDenominator" -> Optional.of(unitQtyDenominator);
            case "HedgeOnly" -> Optional.of(hedgeOnly);
            case "ExchangeSilo" -> Optional.of(exchangeSilo);
            case "OffExchangeIncrementQtyDenominator" -> Optional.of(offExchangeIncrementQtyDenominator);
            case "OffExchangeIncrementQty" -> Optional.of(offExchangeIncrementQty);
            case "OffExchangeIncrementPrice" -> Optional.of(offExchangeIncrementPrice);
            case "OffExchangeIncrementOptionPrice" -> Optional.of(offExchangeIncrementOptionPrice);
            case "ProductId" -> Optional.of(productId);
            case "HubId" -> Optional.of(hubId);
            case "StripId" -> Optional.of(stripId);
            case "UnderlyingIsin" -> Optional.of(underlyingIsin);
            case "TestMarketIndicator" -> Optional.of(testMarketIndicator);
            case "LegDealSuppressed" -> Optional.of(legDealSuppressed);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewFuturesStrategyDefinitionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(legDefinition.diffFields(message.legDefinition));
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
            legDefinition.toFormattedString(builder, options);
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
        legDefinition.toFormattedString(builder, nested);
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
        if (!(other instanceof NewFuturesStrategyDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && legDefinition.equals(message.legDefinition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, legDefinition);
    }
}
