package omi.ice.icefutures.mdf.impact.v1_1_24.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.CrossOrderSupportedField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.CurrencyField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.DealPriceDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.FlexAllowedField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.FuturesContractSymbolField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.GtAllowedField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.GuaranteedCrossSupportedField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.HedgeMarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.IncrementPremiumPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.IncrementQtyField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.IsBlockOnlyField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.LotSizeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.MarketDescField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.MarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.MaxOptionsPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.MinOptionsPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.MinQtyField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.NumDecimalsStrikePriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OptionTypeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OptionsExpirationDayField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OptionsExpirationMonthField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OptionsExpirationTypeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OptionsExpirationYearField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OptionsStyleField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.OrderPriceDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.SettlePriceDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.SettlementTypeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.StrikePriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.TickValueField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.TradingStatusField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.UnderlyingMarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.UnitOfMeasureField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.UnitQtyDenominatorField;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Message;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.PrintOptions;

/**
 * Represents the NewOptionsMarketDefinitionMessage message from the Mdf protocol.
 *
 * <p>New Options Market Definition messages will be sent out when new options markets are created.</p>
 */
public final class NewOptionsMarketDefinitionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'l';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 321;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Options Market Definition Message";

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
     * Unique identifier of the underlying market
     */
    private final UnderlyingMarketIdField underlyingMarketId = new UnderlyingMarketIdField();

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
     * “C” – Call, “P” – Put
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * Strike Price of the option. Used in conjunction with the NumDecimalsStrikePrice. This is often different from the premium price decimals.
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Denominator for the deal price fields in the market. For most markets, this is the same as OrderPriceDenominator. However, it could be different for some crack or spread markets.
     */
    private final DealPriceDenominatorField dealPriceDenominator = new DealPriceDenominatorField();

    /**
     * Minimum quantity for this market
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * The currency that the market is traded on.
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Denominator for the strike price field.
     */
    private final NumDecimalsStrikePriceField numDecimalsStrikePrice = new NumDecimalsStrikePriceField();

    /**
     * Minimum premium price for the option.
     */
    private final MinOptionsPriceField minOptionsPrice = new MinOptionsPriceField();

    /**
     * Maximum premium price for the option.
     */
    private final MaxOptionsPriceField maxOptionsPrice = new MaxOptionsPriceField();

    /**
     * Price increment for the option market.
     */
    private final IncrementPremiumPriceField incrementPremiumPrice = new IncrementPremiumPriceField();

    /**
     * 4 digit year
     */
    private final OptionsExpirationYearField optionsExpirationYear = new OptionsExpirationYearField();

    /**
     * Month range 1-12
     */
    private final OptionsExpirationMonthField optionsExpirationMonth = new OptionsExpirationMonthField();

    /**
     * Day of the month.
     */
    private final OptionsExpirationDayField optionsExpirationDay = new OptionsExpirationDayField();

    /**
     * OptionsStyle: ‘A’ – American, ‘E’ – European, ‘0’ – None, ‘3’ – Asian, ‘4’ – One Time
     */
    private final OptionsStyleField optionsStyle = new OptionsStyleField();

    /**
     * Options expiration type: ‘M’ – Monthly ‘D’ – Daily
     */
    private final OptionsExpirationTypeField optionsExpirationType = new OptionsExpirationTypeField();

    /**
     * Future’s market id of the hedge
     */
    private final HedgeMarketIdField hedgeMarketId = new HedgeMarketIdField();

    /**
     * Denominator for the settlement price fields in the market. For most markets, this is the same as DealPriceDenominator.
     */
    private final SettlePriceDenominatorField settlePriceDenominator = new SettlePriceDenominatorField();

    /**
     * Denominator for UnitQuantity. Clients should also apply UnitQtyDenominator when calculating LotSize. This field will be ‘0’ for most of the markets.
     */
    private final UnitQtyDenominatorField unitQtyDenominator = new UnitQtyDenominatorField();

    /**
     * OrderPriceDenominator should be applied to get the real value.
     */
    private final TickValueField tickValue = new TickValueField();

    /**
     * Indicates if flexible strikes can be created for the option market. ‘Y’ or ‘N’
     */
    private final FlexAllowedField flexAllowed = new FlexAllowedField();

    /**
     * Settlement Type: ‘0’ - financial, ‘1’ - physical
     */
    private final SettlementTypeField settlementType = new SettlementTypeField();

    /**
     * Indicates if Market is only tradable via ICE Block Trade. This also means the screen trading is not allowed for the market. ‘Y’ or ‘N’
     */
    private final IsBlockOnlyField isBlockOnly = new IsBlockOnlyField();

    /**
     * Indicates if GTC is allowed in the market. ‘Y’ or ‘N’
     */
    private final GtAllowedField gtAllowed = new GtAllowedField();

    /**
     * Indicates if Cross Order is supported in the market. ‘Y’ or ‘N’
     */
    private final CrossOrderSupportedField crossOrderSupported = new CrossOrderSupportedField();

    /**
     * Indicates if Guarantee Cross is supported in the market. ‘Y’ or ‘N’
     */
    private final GuaranteedCrossSupportedField guaranteedCrossSupported = new GuaranteedCrossSupportedField();

    /**
     * Unit Of Measure
     */
    private final UnitOfMeasureField unitOfMeasure = new UnitOfMeasureField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketId, underlyingMarketId, futuresContractSymbol, tradingStatus, orderPriceDenominator, incrementQty, lotSize, marketDesc, optionType, strikePrice, dealPriceDenominator, minQty, currency, numDecimalsStrikePrice, minOptionsPrice, maxOptionsPrice, incrementPremiumPrice, optionsExpirationYear, optionsExpirationMonth, optionsExpirationDay, optionsStyle, optionsExpirationType, hedgeMarketId, settlePriceDenominator, unitQtyDenominator, tickValue, flexAllowed, settlementType, isBlockOnly, gtAllowed, crossOrderSupported, guaranteedCrossSupported, unitOfMeasure);

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
     * Unique identifier of the underlying market
     *
     * @return the UnderlyingMarketId field
     */
    public UnderlyingMarketIdField underlyingMarketId() {
        return underlyingMarketId;
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
     * “C” – Call, “P” – Put
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
    }

    /**
     * Strike Price of the option. Used in conjunction with the NumDecimalsStrikePrice. This is often different from the premium price decimals.
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
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
     * The currency that the market is traded on.
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Denominator for the strike price field.
     *
     * @return the NumDecimalsStrikePrice field
     */
    public NumDecimalsStrikePriceField numDecimalsStrikePrice() {
        return numDecimalsStrikePrice;
    }

    /**
     * Minimum premium price for the option.
     *
     * @return the MinOptionsPrice field
     */
    public MinOptionsPriceField minOptionsPrice() {
        return minOptionsPrice;
    }

    /**
     * Maximum premium price for the option.
     *
     * @return the MaxOptionsPrice field
     */
    public MaxOptionsPriceField maxOptionsPrice() {
        return maxOptionsPrice;
    }

    /**
     * Price increment for the option market.
     *
     * @return the IncrementPremiumPrice field
     */
    public IncrementPremiumPriceField incrementPremiumPrice() {
        return incrementPremiumPrice;
    }

    /**
     * 4 digit year
     *
     * @return the OptionsExpirationYear field
     */
    public OptionsExpirationYearField optionsExpirationYear() {
        return optionsExpirationYear;
    }

    /**
     * Month range 1-12
     *
     * @return the OptionsExpirationMonth field
     */
    public OptionsExpirationMonthField optionsExpirationMonth() {
        return optionsExpirationMonth;
    }

    /**
     * Day of the month.
     *
     * @return the OptionsExpirationDay field
     */
    public OptionsExpirationDayField optionsExpirationDay() {
        return optionsExpirationDay;
    }

    /**
     * OptionsStyle: ‘A’ – American, ‘E’ – European, ‘0’ – None, ‘3’ – Asian, ‘4’ – One Time
     *
     * @return the OptionsStyle field
     */
    public OptionsStyleField optionsStyle() {
        return optionsStyle;
    }

    /**
     * Options expiration type: ‘M’ – Monthly ‘D’ – Daily
     *
     * @return the OptionsExpirationType field
     */
    public OptionsExpirationTypeField optionsExpirationType() {
        return optionsExpirationType;
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
     * Denominator for the settlement price fields in the market. For most markets, this is the same as DealPriceDenominator.
     *
     * @return the SettlePriceDenominator field
     */
    public SettlePriceDenominatorField settlePriceDenominator() {
        return settlePriceDenominator;
    }

    /**
     * Denominator for UnitQuantity. Clients should also apply UnitQtyDenominator when calculating LotSize. This field will be ‘0’ for most of the markets.
     *
     * @return the UnitQtyDenominator field
     */
    public UnitQtyDenominatorField unitQtyDenominator() {
        return unitQtyDenominator;
    }

    /**
     * OrderPriceDenominator should be applied to get the real value.
     *
     * @return the TickValue field
     */
    public TickValueField tickValue() {
        return tickValue;
    }

    /**
     * Indicates if flexible strikes can be created for the option market. ‘Y’ or ‘N’
     *
     * @return the FlexAllowed field
     */
    public FlexAllowedField flexAllowed() {
        return flexAllowed;
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
     * Indicates if Market is only tradable via ICE Block Trade. This also means the screen trading is not allowed for the market. ‘Y’ or ‘N’
     *
     * @return the IsBlockOnly field
     */
    public IsBlockOnlyField isBlockOnly() {
        return isBlockOnly;
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
     * Indicates if Guarantee Cross is supported in the market. ‘Y’ or ‘N’
     *
     * @return the GuaranteedCrossSupported field
     */
    public GuaranteedCrossSupportedField guaranteedCrossSupported() {
        return guaranteedCrossSupported;
    }

    /**
     * Unit Of Measure
     *
     * @return the UnitOfMeasure field
     */
    public UnitOfMeasureField unitOfMeasure() {
        return unitOfMeasure;
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
        if (!underlyingMarketId.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingMarketIdField.BYTE_LENGTH;
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
        if (!optionType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionTypeField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!dealPriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += DealPriceDenominatorField.BYTE_LENGTH;
        if (!minQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinQtyField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!numDecimalsStrikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += NumDecimalsStrikePriceField.BYTE_LENGTH;
        if (!minOptionsPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MinOptionsPriceField.BYTE_LENGTH;
        if (!maxOptionsPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MaxOptionsPriceField.BYTE_LENGTH;
        if (!incrementPremiumPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IncrementPremiumPriceField.BYTE_LENGTH;
        if (!optionsExpirationYear.parse(data, cursor)) {
            return false;
        }
        cursor += OptionsExpirationYearField.BYTE_LENGTH;
        if (!optionsExpirationMonth.parse(data, cursor)) {
            return false;
        }
        cursor += OptionsExpirationMonthField.BYTE_LENGTH;
        if (!optionsExpirationDay.parse(data, cursor)) {
            return false;
        }
        cursor += OptionsExpirationDayField.BYTE_LENGTH;
        if (!optionsStyle.parse(data, cursor)) {
            return false;
        }
        cursor += OptionsStyleField.BYTE_LENGTH;
        if (!optionsExpirationType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionsExpirationTypeField.BYTE_LENGTH;
        if (!hedgeMarketId.parse(data, cursor)) {
            return false;
        }
        cursor += HedgeMarketIdField.BYTE_LENGTH;
        if (!settlePriceDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += SettlePriceDenominatorField.BYTE_LENGTH;
        if (!unitQtyDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += UnitQtyDenominatorField.BYTE_LENGTH;
        if (!tickValue.parse(data, cursor)) {
            return false;
        }
        cursor += TickValueField.BYTE_LENGTH;
        if (!flexAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += FlexAllowedField.BYTE_LENGTH;
        if (!settlementType.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementTypeField.BYTE_LENGTH;
        if (!isBlockOnly.parse(data, cursor)) {
            return false;
        }
        cursor += IsBlockOnlyField.BYTE_LENGTH;
        if (!gtAllowed.parse(data, cursor)) {
            return false;
        }
        cursor += GtAllowedField.BYTE_LENGTH;
        if (!crossOrderSupported.parse(data, cursor)) {
            return false;
        }
        cursor += CrossOrderSupportedField.BYTE_LENGTH;
        if (!guaranteedCrossSupported.parse(data, cursor)) {
            return false;
        }
        cursor += GuaranteedCrossSupportedField.BYTE_LENGTH;
        if (!unitOfMeasure.parse(data, cursor)) {
            return false;
        }
        cursor += UnitOfMeasureField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = marketId.encode(data, cursor);
        cursor = underlyingMarketId.encode(data, cursor);
        cursor = futuresContractSymbol.encode(data, cursor);
        cursor = tradingStatus.encode(data, cursor);
        cursor = orderPriceDenominator.encode(data, cursor);
        cursor = incrementQty.encode(data, cursor);
        cursor = lotSize.encode(data, cursor);
        cursor = marketDesc.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = dealPriceDenominator.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = numDecimalsStrikePrice.encode(data, cursor);
        cursor = minOptionsPrice.encode(data, cursor);
        cursor = maxOptionsPrice.encode(data, cursor);
        cursor = incrementPremiumPrice.encode(data, cursor);
        cursor = optionsExpirationYear.encode(data, cursor);
        cursor = optionsExpirationMonth.encode(data, cursor);
        cursor = optionsExpirationDay.encode(data, cursor);
        cursor = optionsStyle.encode(data, cursor);
        cursor = optionsExpirationType.encode(data, cursor);
        cursor = hedgeMarketId.encode(data, cursor);
        cursor = settlePriceDenominator.encode(data, cursor);
        cursor = unitQtyDenominator.encode(data, cursor);
        cursor = tickValue.encode(data, cursor);
        cursor = flexAllowed.encode(data, cursor);
        cursor = settlementType.encode(data, cursor);
        cursor = isBlockOnly.encode(data, cursor);
        cursor = gtAllowed.encode(data, cursor);
        cursor = crossOrderSupported.encode(data, cursor);
        cursor = guaranteedCrossSupported.encode(data, cursor);
        cursor = unitOfMeasure.encode(data, cursor);
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
            case "UnderlyingMarketId" -> Optional.of(underlyingMarketId);
            case "FuturesContractSymbol" -> Optional.of(futuresContractSymbol);
            case "TradingStatus" -> Optional.of(tradingStatus);
            case "OrderPriceDenominator" -> Optional.of(orderPriceDenominator);
            case "IncrementQty" -> Optional.of(incrementQty);
            case "LotSize" -> Optional.of(lotSize);
            case "MarketDesc" -> Optional.of(marketDesc);
            case "OptionType" -> Optional.of(optionType);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "DealPriceDenominator" -> Optional.of(dealPriceDenominator);
            case "MinQty" -> Optional.of(minQty);
            case "Currency" -> Optional.of(currency);
            case "NumDecimalsStrikePrice" -> Optional.of(numDecimalsStrikePrice);
            case "MinOptionsPrice" -> Optional.of(minOptionsPrice);
            case "MaxOptionsPrice" -> Optional.of(maxOptionsPrice);
            case "IncrementPremiumPrice" -> Optional.of(incrementPremiumPrice);
            case "OptionsExpirationYear" -> Optional.of(optionsExpirationYear);
            case "OptionsExpirationMonth" -> Optional.of(optionsExpirationMonth);
            case "OptionsExpirationDay" -> Optional.of(optionsExpirationDay);
            case "OptionsStyle" -> Optional.of(optionsStyle);
            case "OptionsExpirationType" -> Optional.of(optionsExpirationType);
            case "HedgeMarketId" -> Optional.of(hedgeMarketId);
            case "SettlePriceDenominator" -> Optional.of(settlePriceDenominator);
            case "UnitQtyDenominator" -> Optional.of(unitQtyDenominator);
            case "TickValue" -> Optional.of(tickValue);
            case "FlexAllowed" -> Optional.of(flexAllowed);
            case "SettlementType" -> Optional.of(settlementType);
            case "IsBlockOnly" -> Optional.of(isBlockOnly);
            case "GtAllowed" -> Optional.of(gtAllowed);
            case "CrossOrderSupported" -> Optional.of(crossOrderSupported);
            case "GuaranteedCrossSupported" -> Optional.of(guaranteedCrossSupported);
            case "UnitOfMeasure" -> Optional.of(unitOfMeasure);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOptionsMarketDefinitionMessage message)) {
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
        if (!(other instanceof NewOptionsMarketDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
