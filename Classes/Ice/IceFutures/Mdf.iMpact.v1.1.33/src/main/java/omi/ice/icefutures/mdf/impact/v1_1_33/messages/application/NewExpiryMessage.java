package omi.ice.icefutures.mdf.impact.v1_1_33.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.ClearedAliasField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.ContractSymbolField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.CrossOrderSupportedField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.CurrencyField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.DealPriceDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.GtAllowedField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.HedgeMarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.HubAliasField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.HubIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.IncrementPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.IncrementQtyField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.IsinField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.LotSizeField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MarketDescField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MarketTypeIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MaturityDayField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MaturityMonthField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MaturityYearField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MaxPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MicCodeField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MifidRegulatedMarketField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MinPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.MinQtyField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.NumDecimalsOptionsPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.OffExchangeIncrementOptionPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.OffExchangeIncrementPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.OffExchangeIncrementQtyDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.OffExchangeIncrementQtyField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.OrderPriceDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.ProductIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.ProductNameField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.SettlePriceDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.SettlementTypeField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.StripIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.StripNameField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.UnitOfMeasureField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.UnitQtyDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.UnitQuantityField;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.Message;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.PrintOptions;

/**
 * Represents the NewExpiryMessage message from the Mdf protocol.
 *
 * <p>New Expiry message will be sent out when a new equity market is created during the day.</p>
 */
public final class NewExpiryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 503;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Expiry Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Market Id
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * List of market types and IDs.
     */
    private final MarketTypeIdField marketTypeId = new MarketTypeIdField();

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
     * The lot size is minimum size of contracts in lots. It is multiplier to determine the total lots.
     */
    private final LotSizeField lotSize = new LotSizeField();

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
     * Minimum quantity for this market
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * The quantity in unit of measurement per lot. For example, it is 1000 barrels per lot for Brent.
     */
    private final UnitQuantityField unitQuantity = new UnitQuantityField();

    /**
     * The currency that the market is traded on.
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Clearing limit admin related
     */
    private final ClearedAliasField clearedAlias = new ClearedAliasField();

    /**
     * Minimum Price. OrderPriceDenominator should be applied to this field.
     */
    private final MinPriceField minPrice = new MinPriceField();

    /**
     * Maximum Price. OrderPriceDenominator should be applied to this field.
     */
    private final MaxPriceField maxPrice = new MaxPriceField();

    /**
     * ID of the product that the contract/market is under.
     */
    private final ProductIdField productId = new ProductIdField();

    /**
     * Name of the product that the contract/market is under
     */
    private final ProductNameField productName = new ProductNameField();

    /**
     * ID of the hub for the contract/market
     */
    private final HubIdField hubId = new HubIdField();

    /**
     * Alias of the hub for the contract/market
     */
    private final HubAliasField hubAlias = new HubAliasField();

    /**
     * StripID
     */
    private final StripIdField stripId = new StripIdField();

    /**
     * Name of the strip for the contract/market
     */
    private final StripNameField stripName = new StripNameField();

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
     * Contract Symbol
     */
    private final ContractSymbolField contractSymbol = new ContractSymbolField();

    /**
     * The ISIN of the security this market is associated with. This is currently only populated for Liffe Equity markets.
     */
    private final IsinField isin = new IsinField();

    /**
     * Only used for OffExchangeIncrementOptionPrice.
     */
    private final NumDecimalsOptionsPriceField numDecimalsOptionsPrice = new NumDecimalsOptionsPriceField();

    /**
     * Future’s market id of the hedge
     */
    private final HedgeMarketIdField hedgeMarketId = new HedgeMarketIdField();

    /**
     * Settlement Type: ‘0’ - financial, ‘1’ - physical
     */
    private final SettlementTypeField settlementType = new SettlementTypeField();

    /**
     * Indicates if GTC is allowed in the market. ‘Y’ or ‘N’
     */
    private final GtAllowedField gtAllowed = new GtAllowedField();

    /**
     * Indicates if Cross Order is supported in the market. ‘Y’ or ‘N’
     */
    private final CrossOrderSupportedField crossOrderSupported = new CrossOrderSupportedField();

    /**
     * Unit Of Measure
     */
    private final UnitOfMeasureField unitOfMeasure = new UnitOfMeasureField();

    /**
     * Indicates MIFID-II market. ‘Y’ or ‘N’
     */
    private final MifidRegulatedMarketField mifidRegulatedMarket = new MifidRegulatedMarketField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketId, marketTypeId, orderPriceDenominator, incrementPrice, incrementQty, lotSize, marketDesc, maturityYear, maturityMonth, maturityDay, dealPriceDenominator, minQty, unitQuantity, currency, clearedAlias, minPrice, maxPrice, productId, productName, hubId, hubAlias, stripId, stripName, settlePriceDenominator, micCode, unitQtyDenominator, offExchangeIncrementQtyDenominator, offExchangeIncrementQty, offExchangeIncrementPrice, offExchangeIncrementOptionPrice, contractSymbol, isin, numDecimalsOptionsPrice, hedgeMarketId, settlementType, gtAllowed, crossOrderSupported, unitOfMeasure, mifidRegulatedMarket);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Market Id
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * List of market types and IDs.
     *
     * @return the MarketTypeId field
     */
    public MarketTypeIdField marketTypeId() {
        return marketTypeId;
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
     * The lot size is minimum size of contracts in lots. It is multiplier to determine the total lots.
     *
     * @return the LotSize field
     */
    public LotSizeField lotSize() {
        return lotSize;
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
     * Minimum quantity for this market
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
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
     * The currency that the market is traded on.
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
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
     * ID of the product that the contract/market is under.
     *
     * @return the ProductId field
     */
    public ProductIdField productId() {
        return productId;
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
     * ID of the hub for the contract/market
     *
     * @return the HubId field
     */
    public HubIdField hubId() {
        return hubId;
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
     * StripID
     *
     * @return the StripId field
     */
    public StripIdField stripId() {
        return stripId;
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
     * Contract Symbol
     *
     * @return the ContractSymbol field
     */
    public ContractSymbolField contractSymbol() {
        return contractSymbol;
    }

    /**
     * The ISIN of the security this market is associated with. This is currently only populated for Liffe Equity markets.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
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
     * Future’s market id of the hedge
     *
     * @return the HedgeMarketId field
     */
    public HedgeMarketIdField hedgeMarketId() {
        return hedgeMarketId;
    }

    /**
     * Settlement Type: ‘0’ - financial, ‘1’ - physical
     *
     * @return the SettlementType field
     */
    public SettlementTypeField settlementType() {
        return settlementType;
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
     * Indicates if Cross Order is supported in the market. ‘Y’ or ‘N’
     *
     * @return the CrossOrderSupported field
     */
    public CrossOrderSupportedField crossOrderSupported() {
        return crossOrderSupported;
    }

    /**
     * Unit Of Measure
     *
     * @return the UnitOfMeasure field
     */
    public UnitOfMeasureField unitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Indicates MIFID-II market. ‘Y’ or ‘N’
     *
     * @return the MifidRegulatedMarket field
     */
    public MifidRegulatedMarketField mifidRegulatedMarket() {
        return mifidRegulatedMarket;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!marketTypeId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketTypeIdField.BYTE_LENGTH;
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
        if (!lotSize.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeField.BYTE_LENGTH;
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
        if (!minQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinQtyField.BYTE_LENGTH;
        if (!unitQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += UnitQuantityField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!clearedAlias.parse(data, cursor)) {
            return false;
        }
        cursor += ClearedAliasField.BYTE_LENGTH;
        if (!minPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceField.BYTE_LENGTH;
        if (!maxPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MaxPriceField.BYTE_LENGTH;
        if (!productId.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdField.BYTE_LENGTH;
        if (!productName.parse(data, cursor)) {
            return false;
        }
        cursor += ProductNameField.BYTE_LENGTH;
        if (!hubId.parse(data, cursor)) {
            return false;
        }
        cursor += HubIdField.BYTE_LENGTH;
        if (!hubAlias.parse(data, cursor)) {
            return false;
        }
        cursor += HubAliasField.BYTE_LENGTH;
        if (!stripId.parse(data, cursor)) {
            return false;
        }
        cursor += StripIdField.BYTE_LENGTH;
        if (!stripName.parse(data, cursor)) {
            return false;
        }
        cursor += StripNameField.BYTE_LENGTH;
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
        if (!contractSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += ContractSymbolField.BYTE_LENGTH;
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
        if (!numDecimalsOptionsPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NumDecimalsOptionsPriceField.BYTE_LENGTH;
        if (!hedgeMarketId.parse(data, cursor)) {
            return false;
        }
        cursor += HedgeMarketIdField.BYTE_LENGTH;
        if (!settlementType.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementTypeField.BYTE_LENGTH;
        if (!gtAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += GtAllowedField.BYTE_LENGTH;
        if (!crossOrderSupported.parse(data, cursor)) {
            return false;
        }
        cursor += CrossOrderSupportedField.BYTE_LENGTH;
        if (!unitOfMeasure.parse(data, cursor)) {
            return false;
        }
        cursor += UnitOfMeasureField.BYTE_LENGTH;
        if (!mifidRegulatedMarket.parse(data, cursor)) {
            return false;
        }
        cursor += MifidRegulatedMarketField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = marketId.encode(data, cursor);
        cursor = marketTypeId.encode(data, cursor);
        cursor = orderPriceDenominator.encode(data, cursor);
        cursor = incrementPrice.encode(data, cursor);
        cursor = incrementQty.encode(data, cursor);
        cursor = lotSize.encode(data, cursor);
        cursor = marketDesc.encode(data, cursor);
        cursor = maturityYear.encode(data, cursor);
        cursor = maturityMonth.encode(data, cursor);
        cursor = maturityDay.encode(data, cursor);
        cursor = dealPriceDenominator.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = unitQuantity.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = clearedAlias.encode(data, cursor);
        cursor = minPrice.encode(data, cursor);
        cursor = maxPrice.encode(data, cursor);
        cursor = productId.encode(data, cursor);
        cursor = productName.encode(data, cursor);
        cursor = hubId.encode(data, cursor);
        cursor = hubAlias.encode(data, cursor);
        cursor = stripId.encode(data, cursor);
        cursor = stripName.encode(data, cursor);
        cursor = settlePriceDenominator.encode(data, cursor);
        cursor = micCode.encode(data, cursor);
        cursor = unitQtyDenominator.encode(data, cursor);
        cursor = offExchangeIncrementQtyDenominator.encode(data, cursor);
        cursor = offExchangeIncrementQty.encode(data, cursor);
        cursor = offExchangeIncrementPrice.encode(data, cursor);
        cursor = offExchangeIncrementOptionPrice.encode(data, cursor);
        cursor = contractSymbol.encode(data, cursor);
        cursor = isin.encode(data, cursor);
        cursor = numDecimalsOptionsPrice.encode(data, cursor);
        cursor = hedgeMarketId.encode(data, cursor);
        cursor = settlementType.encode(data, cursor);
        cursor = gtAllowed.encode(data, cursor);
        cursor = crossOrderSupported.encode(data, cursor);
        cursor = unitOfMeasure.encode(data, cursor);
        cursor = mifidRegulatedMarket.encode(data, cursor);
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
            case "MarketId" -> Optional.of(marketId);
            case "MarketTypeId" -> Optional.of(marketTypeId);
            case "OrderPriceDenominator" -> Optional.of(orderPriceDenominator);
            case "IncrementPrice" -> Optional.of(incrementPrice);
            case "IncrementQty" -> Optional.of(incrementQty);
            case "LotSize" -> Optional.of(lotSize);
            case "MarketDesc" -> Optional.of(marketDesc);
            case "MaturityYear" -> Optional.of(maturityYear);
            case "MaturityMonth" -> Optional.of(maturityMonth);
            case "MaturityDay" -> Optional.of(maturityDay);
            case "DealPriceDenominator" -> Optional.of(dealPriceDenominator);
            case "MinQty" -> Optional.of(minQty);
            case "UnitQuantity" -> Optional.of(unitQuantity);
            case "Currency" -> Optional.of(currency);
            case "ClearedAlias" -> Optional.of(clearedAlias);
            case "MinPrice" -> Optional.of(minPrice);
            case "MaxPrice" -> Optional.of(maxPrice);
            case "ProductId" -> Optional.of(productId);
            case "ProductName" -> Optional.of(productName);
            case "HubId" -> Optional.of(hubId);
            case "HubAlias" -> Optional.of(hubAlias);
            case "StripId" -> Optional.of(stripId);
            case "StripName" -> Optional.of(stripName);
            case "SettlePriceDenominator" -> Optional.of(settlePriceDenominator);
            case "MicCode" -> Optional.of(micCode);
            case "UnitQtyDenominator" -> Optional.of(unitQtyDenominator);
            case "OffExchangeIncrementQtyDenominator" -> Optional.of(offExchangeIncrementQtyDenominator);
            case "OffExchangeIncrementQty" -> Optional.of(offExchangeIncrementQty);
            case "OffExchangeIncrementPrice" -> Optional.of(offExchangeIncrementPrice);
            case "OffExchangeIncrementOptionPrice" -> Optional.of(offExchangeIncrementOptionPrice);
            case "ContractSymbol" -> Optional.of(contractSymbol);
            case "Isin" -> Optional.of(isin);
            case "NumDecimalsOptionsPrice" -> Optional.of(numDecimalsOptionsPrice);
            case "HedgeMarketId" -> Optional.of(hedgeMarketId);
            case "SettlementType" -> Optional.of(settlementType);
            case "GtAllowed" -> Optional.of(gtAllowed);
            case "CrossOrderSupported" -> Optional.of(crossOrderSupported);
            case "UnitOfMeasure" -> Optional.of(unitOfMeasure);
            case "MifidRegulatedMarket" -> Optional.of(mifidRegulatedMarket);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewExpiryMessage message)) {
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
        if (!(other instanceof NewExpiryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
