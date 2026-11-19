package omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.ContractDateField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.CurrencyField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.ExchangeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.FirstDeliveryDateField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.FirstNoticeDateField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.FirstTradeDateField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.HighLimitPriceField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.InstrumentIdField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.InstrumentIdSourceField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.InstrumentListingStatusField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.InstrumentTypeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.LastDeliveryDateField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.LastNoticeDateField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.LastTradeDateField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.LowLimitPriceField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.MatchAlgorithmField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.MaturityDateField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.MaximumSizeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.MinimumSizeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.OpenInterestQuantityField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.OptionExpirationTypeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.OptionStrikeCurrencyField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.OptionStrikePriceField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.OptionTypeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.ProductGroupCodeAlphanumericField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.SettlementCurrencyField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.SettlementPriceField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.SettlementPriceTypeCalcMethodField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.TickField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.TimestampField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.TotalVolumeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.TradingCollarVariationField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.TradingCollarVariationTypeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.UnderlyingAssetAlphanumericField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.UnderlyingAssetTypeField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.UnderlyingFutureInstrumentIdField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.UnitOfMeasureField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.UnitOfMeasureQuantityField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.fields.ValuationDateField;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.types.Field;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.types.Message;
import omi.miax.onyxfutures.depthofmarket.mach.v1_3_a.types.PrintOptions;

/**
 * Represents the SimpleInstrumentDefinitionMessage message from the DepthOfMarket protocol.
 *
 * <p>Simple Instrument Definition</p>
 */
public final class SimpleInstrumentDefinitionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0001';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 138;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Simple Instrument Definition Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 30, 3 };

    /**
     * Matching Engine time
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Unique numeric ID assigned by MIAX Futures Onyx for a Simple instrument and is permanent for the life of a Simple instrument
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Underlying Asset Type of this instrument:
     */
    private final UnderlyingAssetTypeField underlyingAssetType = new UnderlyingAssetTypeField();

    /**
     * Underlying Asset Code
     */
    private final UnderlyingAssetAlphanumericField underlyingAssetAlphanumeric = new UnderlyingAssetAlphanumericField();

    /**
     * Product Group Code: e.g.: MWE for Hard Red Spring Wheat Standard Deliverable (5000 Bushels)
     */
    private final ProductGroupCodeAlphanumericField productGroupCodeAlphanumeric = new ProductGroupCodeAlphanumericField();

    /**
     * Exchange
     */
    private final ExchangeField exchange = new ExchangeField();

    /**
     * Indicates whether the Instrument ID has been assigned by the exchange or from an external industry source
     */
    private final InstrumentIdSourceField instrumentIdSource = new InstrumentIdSourceField();

    /**
     * Instrument Type
     */
    private final InstrumentTypeField instrumentType = new InstrumentTypeField();

    /**
     * Instrument Listing Status
     */
    private final InstrumentListingStatusField instrumentListingStatus = new InstrumentListingStatusField();

    /**
     * The currency in which all Futures Instruments of the Futures Product will trade
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * The Currency in which the Product settles
     */
    private final SettlementCurrencyField settlementCurrency = new SettlementCurrencyField();

    /**
     * The allocation model used by the MIAX Futures Onyx Trading Platform for the Product
     */
    private final MatchAlgorithmField matchAlgorithm = new MatchAlgorithmField();

    /**
     * Minimum Order Size
     */
    private final MinimumSizeField minimumSize = new MinimumSizeField();

    /**
     * Maximum Order Size
     */
    private final MaximumSizeField maximumSize = new MaximumSizeField();

    /**
     * Order Entry Price Tick of the Product
     */
    private final TickField tick = new TickField();

    /**
     * Individual unit of the Deliverable of the Underlying Asset associated with the Futures Contract
     */
    private final UnitOfMeasureField unitOfMeasure = new UnitOfMeasureField();

    /**
     * The quantity of the Underlying Asset that is required for the Deliverable associated with the Futures Contract
     */
    private final UnitOfMeasureQuantityField unitOfMeasureQuantity = new UnitOfMeasureQuantityField();

    /**
     * The previous day
     */
    private final SettlementPriceField settlementPrice = new SettlementPriceField();

    /**
     * Actual or Theoretical Settlement Price Indicator
     */
    private final SettlementPriceTypeCalcMethodField settlementPriceTypeCalcMethod = new SettlementPriceTypeCalcMethodField();

    /**
     * The aggregate amount of volume that has traded from the prior Trading Day
     */
    private final TotalVolumeField totalVolume = new TotalVolumeField();

    /**
     * The amount of aggregate open contracts in a Simple Instrument
     */
    private final OpenInterestQuantityField openInterestQuantity = new OpenInterestQuantityField();

    /**
     * The Upper Band of the Daily Trading Limit of a Futures Product
     */
    private final HighLimitPriceField highLimitPrice = new HighLimitPriceField();

    /**
     * The Lower Band of the Daily Trading Limit of a Futures Product
     */
    private final LowLimitPriceField lowLimitPrice = new LowLimitPriceField();

    /**
     * Trading Collar Variation Type
     */
    private final TradingCollarVariationTypeField tradingCollarVariationType = new TradingCollarVariationTypeField();

    /**
     * The Dollar Value or Percentage Value used in the calculation of the Trading Collar
     */
    private final TradingCollarVariationField tradingCollarVariation = new TradingCollarVariationField();

    /**
     * The Contract Date will be assigned to each Simple Instrument
     */
    private final ContractDateField contractDate = new ContractDateField();

    /**
     * Maturity Date is the expiration date of a Simple Instrument
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * The date that the Final Settlement Price will be calculated for purposes of Simple Instrument expiration
     */
    private final ValuationDateField valuationDate = new ValuationDateField();

    /**
     * First Trade Date will be the Trading Date that the Simple Instrument is initially made available for Trading on MIAX Futures Onyx
     */
    private final FirstTradeDateField firstTradeDate = new FirstTradeDateField();

    /**
     * Last Trade Date will be the Maturity Date of the Simple Instrument
     */
    private final LastTradeDateField lastTradeDate = new LastTradeDateField();

    /**
     * Last business date of the month preceding the month of the Maturity Date of the Simple Instrument
     */
    private final FirstNoticeDateField firstNoticeDate = new FirstNoticeDateField();

    /**
     * Last Notice Date will be the business day preceding the Last Delivery Date of the Simple Instrument
     */
    private final LastNoticeDateField lastNoticeDate = new LastNoticeDateField();

    /**
     * First Delivery Date will be the first business day of the month of the Maturity Date of the Simple Instrument
     */
    private final FirstDeliveryDateField firstDeliveryDate = new FirstDeliveryDateField();

    /**
     * Last Delivery Date will be the seventh business day following the Last Trading Date of the Simple Instrument
     */
    private final LastDeliveryDateField lastDeliveryDate = new LastDeliveryDateField();

    /**
     * NULL when Instrument Type not equal to
     */
    private final OptionStrikePriceField optionStrikePrice = new OptionStrikePriceField();

    /**
     * Option Strike Currency
     */
    private final OptionStrikeCurrencyField optionStrikeCurrency = new OptionStrikeCurrencyField();

    /**
     * Option Type
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * Option Expiration Type
     */
    private final OptionExpirationTypeField optionExpirationType = new OptionExpirationTypeField();

    /**
     * The Instrument ID of the Futures Instrument that is the Underlying Asset of the Options on Futures , TAS, or BTIC, Instrument Value of 0 when Instrument Type is
     */
    private final UnderlyingFutureInstrumentIdField underlyingFutureInstrumentId = new UnderlyingFutureInstrumentIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, instrumentId, underlyingAssetType, underlyingAssetAlphanumeric, productGroupCodeAlphanumeric, exchange, instrumentIdSource, instrumentType, instrumentListingStatus, currency, settlementCurrency, matchAlgorithm, minimumSize, maximumSize, tick, unitOfMeasure, unitOfMeasureQuantity, settlementPrice, settlementPriceTypeCalcMethod, totalVolume, openInterestQuantity, highLimitPrice, lowLimitPrice, tradingCollarVariationType, tradingCollarVariation, contractDate, maturityDate, valuationDate, firstTradeDate, lastTradeDate, firstNoticeDate, lastNoticeDate, firstDeliveryDate, lastDeliveryDate, optionStrikePrice, optionStrikeCurrency, optionType, optionExpirationType, underlyingFutureInstrumentId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Matching Engine time
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Unique numeric ID assigned by MIAX Futures Onyx for a Simple instrument and is permanent for the life of a Simple instrument
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Underlying Asset Type of this instrument:
     *
     * @return the UnderlyingAssetType field
     */
    public UnderlyingAssetTypeField underlyingAssetType() {
        return underlyingAssetType;
    }

    /**
     * Underlying Asset Code
     *
     * @return the UnderlyingAssetAlphanumeric field
     */
    public UnderlyingAssetAlphanumericField underlyingAssetAlphanumeric() {
        return underlyingAssetAlphanumeric;
    }

    /**
     * Product Group Code: e.g.: MWE for Hard Red Spring Wheat Standard Deliverable (5000 Bushels)
     *
     * @return the ProductGroupCodeAlphanumeric field
     */
    public ProductGroupCodeAlphanumericField productGroupCodeAlphanumeric() {
        return productGroupCodeAlphanumeric;
    }

    /**
     * Exchange
     *
     * @return the Exchange field
     */
    public ExchangeField exchange() {
        return exchange;
    }

    /**
     * Indicates whether the Instrument ID has been assigned by the exchange or from an external industry source
     *
     * @return the InstrumentIdSource field
     */
    public InstrumentIdSourceField instrumentIdSource() {
        return instrumentIdSource;
    }

    /**
     * Instrument Type
     *
     * @return the InstrumentType field
     */
    public InstrumentTypeField instrumentType() {
        return instrumentType;
    }

    /**
     * Instrument Listing Status
     *
     * @return the InstrumentListingStatus field
     */
    public InstrumentListingStatusField instrumentListingStatus() {
        return instrumentListingStatus;
    }

    /**
     * The currency in which all Futures Instruments of the Futures Product will trade
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * The Currency in which the Product settles
     *
     * @return the SettlementCurrency field
     */
    public SettlementCurrencyField settlementCurrency() {
        return settlementCurrency;
    }

    /**
     * The allocation model used by the MIAX Futures Onyx Trading Platform for the Product
     *
     * @return the MatchAlgorithm field
     */
    public MatchAlgorithmField matchAlgorithm() {
        return matchAlgorithm;
    }

    /**
     * Minimum Order Size
     *
     * @return the MinimumSize field
     */
    public MinimumSizeField minimumSize() {
        return minimumSize;
    }

    /**
     * Maximum Order Size
     *
     * @return the MaximumSize field
     */
    public MaximumSizeField maximumSize() {
        return maximumSize;
    }

    /**
     * Order Entry Price Tick of the Product
     *
     * @return the Tick field
     */
    public TickField tick() {
        return tick;
    }

    /**
     * Individual unit of the Deliverable of the Underlying Asset associated with the Futures Contract
     *
     * @return the UnitOfMeasure field
     */
    public UnitOfMeasureField unitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * The quantity of the Underlying Asset that is required for the Deliverable associated with the Futures Contract
     *
     * @return the UnitOfMeasureQuantity field
     */
    public UnitOfMeasureQuantityField unitOfMeasureQuantity() {
        return unitOfMeasureQuantity;
    }

    /**
     * The previous day
     *
     * @return the SettlementPrice field
     */
    public SettlementPriceField settlementPrice() {
        return settlementPrice;
    }

    /**
     * Actual or Theoretical Settlement Price Indicator
     *
     * @return the SettlementPriceTypeCalcMethod field
     */
    public SettlementPriceTypeCalcMethodField settlementPriceTypeCalcMethod() {
        return settlementPriceTypeCalcMethod;
    }

    /**
     * The aggregate amount of volume that has traded from the prior Trading Day
     *
     * @return the TotalVolume field
     */
    public TotalVolumeField totalVolume() {
        return totalVolume;
    }

    /**
     * The amount of aggregate open contracts in a Simple Instrument
     *
     * @return the OpenInterestQuantity field
     */
    public OpenInterestQuantityField openInterestQuantity() {
        return openInterestQuantity;
    }

    /**
     * The Upper Band of the Daily Trading Limit of a Futures Product
     *
     * @return the HighLimitPrice field
     */
    public HighLimitPriceField highLimitPrice() {
        return highLimitPrice;
    }

    /**
     * The Lower Band of the Daily Trading Limit of a Futures Product
     *
     * @return the LowLimitPrice field
     */
    public LowLimitPriceField lowLimitPrice() {
        return lowLimitPrice;
    }

    /**
     * Trading Collar Variation Type
     *
     * @return the TradingCollarVariationType field
     */
    public TradingCollarVariationTypeField tradingCollarVariationType() {
        return tradingCollarVariationType;
    }

    /**
     * The Dollar Value or Percentage Value used in the calculation of the Trading Collar
     *
     * @return the TradingCollarVariation field
     */
    public TradingCollarVariationField tradingCollarVariation() {
        return tradingCollarVariation;
    }

    /**
     * The Contract Date will be assigned to each Simple Instrument
     *
     * @return the ContractDate field
     */
    public ContractDateField contractDate() {
        return contractDate;
    }

    /**
     * Maturity Date is the expiration date of a Simple Instrument
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * The date that the Final Settlement Price will be calculated for purposes of Simple Instrument expiration
     *
     * @return the ValuationDate field
     */
    public ValuationDateField valuationDate() {
        return valuationDate;
    }

    /**
     * First Trade Date will be the Trading Date that the Simple Instrument is initially made available for Trading on MIAX Futures Onyx
     *
     * @return the FirstTradeDate field
     */
    public FirstTradeDateField firstTradeDate() {
        return firstTradeDate;
    }

    /**
     * Last Trade Date will be the Maturity Date of the Simple Instrument
     *
     * @return the LastTradeDate field
     */
    public LastTradeDateField lastTradeDate() {
        return lastTradeDate;
    }

    /**
     * Last business date of the month preceding the month of the Maturity Date of the Simple Instrument
     *
     * @return the FirstNoticeDate field
     */
    public FirstNoticeDateField firstNoticeDate() {
        return firstNoticeDate;
    }

    /**
     * Last Notice Date will be the business day preceding the Last Delivery Date of the Simple Instrument
     *
     * @return the LastNoticeDate field
     */
    public LastNoticeDateField lastNoticeDate() {
        return lastNoticeDate;
    }

    /**
     * First Delivery Date will be the first business day of the month of the Maturity Date of the Simple Instrument
     *
     * @return the FirstDeliveryDate field
     */
    public FirstDeliveryDateField firstDeliveryDate() {
        return firstDeliveryDate;
    }

    /**
     * Last Delivery Date will be the seventh business day following the Last Trading Date of the Simple Instrument
     *
     * @return the LastDeliveryDate field
     */
    public LastDeliveryDateField lastDeliveryDate() {
        return lastDeliveryDate;
    }

    /**
     * NULL when Instrument Type not equal to
     *
     * @return the OptionStrikePrice field
     */
    public OptionStrikePriceField optionStrikePrice() {
        return optionStrikePrice;
    }

    /**
     * Option Strike Currency
     *
     * @return the OptionStrikeCurrency field
     */
    public OptionStrikeCurrencyField optionStrikeCurrency() {
        return optionStrikeCurrency;
    }

    /**
     * Option Type
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
    }

    /**
     * Option Expiration Type
     *
     * @return the OptionExpirationType field
     */
    public OptionExpirationTypeField optionExpirationType() {
        return optionExpirationType;
    }

    /**
     * The Instrument ID of the Futures Instrument that is the Underlying Asset of the Options on Futures , TAS, or BTIC, Instrument Value of 0 when Instrument Type is
     *
     * @return the UnderlyingFutureInstrumentId field
     */
    public UnderlyingFutureInstrumentIdField underlyingFutureInstrumentId() {
        return underlyingFutureInstrumentId;
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
        return Optional.ofNullable(timestampField.value());
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!underlyingAssetType.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingAssetTypeField.BYTE_LENGTH;
        if (!underlyingAssetAlphanumeric.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingAssetAlphanumericField.BYTE_LENGTH;
        if (!productGroupCodeAlphanumeric.parse(data, cursor)) {
            return false;
        }
        cursor += ProductGroupCodeAlphanumericField.BYTE_LENGTH;
        if (!exchange.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeField.BYTE_LENGTH;
        if (!instrumentIdSource.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdSourceField.BYTE_LENGTH;
        if (!instrumentType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentTypeField.BYTE_LENGTH;
        if (!instrumentListingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentListingStatusField.BYTE_LENGTH;
        cursor += 3; // padding
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!settlementCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementCurrencyField.BYTE_LENGTH;
        if (!matchAlgorithm.parse(data, cursor)) {
            return false;
        }
        cursor += MatchAlgorithmField.BYTE_LENGTH;
        if (!minimumSize.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumSizeField.BYTE_LENGTH;
        if (!maximumSize.parse(data, cursor)) {
            return false;
        }
        cursor += MaximumSizeField.BYTE_LENGTH;
        if (!tick.parse(data, cursor)) {
            return false;
        }
        cursor += TickField.BYTE_LENGTH;
        if (!unitOfMeasure.parse(data, cursor)) {
            return false;
        }
        cursor += UnitOfMeasureField.BYTE_LENGTH;
        if (!unitOfMeasureQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += UnitOfMeasureQuantityField.BYTE_LENGTH;
        if (!settlementPrice.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPriceField.BYTE_LENGTH;
        if (!settlementPriceTypeCalcMethod.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPriceTypeCalcMethodField.BYTE_LENGTH;
        if (!totalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolumeField.BYTE_LENGTH;
        if (!openInterestQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += OpenInterestQuantityField.BYTE_LENGTH;
        if (!highLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighLimitPriceField.BYTE_LENGTH;
        if (!lowLimitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowLimitPriceField.BYTE_LENGTH;
        if (!tradingCollarVariationType.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCollarVariationTypeField.BYTE_LENGTH;
        if (!tradingCollarVariation.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCollarVariationField.BYTE_LENGTH;
        if (!contractDate.parse(data, cursor)) {
            return false;
        }
        cursor += ContractDateField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!valuationDate.parse(data, cursor)) {
            return false;
        }
        cursor += ValuationDateField.BYTE_LENGTH;
        if (!firstTradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += FirstTradeDateField.BYTE_LENGTH;
        if (!lastTradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradeDateField.BYTE_LENGTH;
        if (!firstNoticeDate.parse(data, cursor)) {
            return false;
        }
        cursor += FirstNoticeDateField.BYTE_LENGTH;
        if (!lastNoticeDate.parse(data, cursor)) {
            return false;
        }
        cursor += LastNoticeDateField.BYTE_LENGTH;
        if (!firstDeliveryDate.parse(data, cursor)) {
            return false;
        }
        cursor += FirstDeliveryDateField.BYTE_LENGTH;
        if (!lastDeliveryDate.parse(data, cursor)) {
            return false;
        }
        cursor += LastDeliveryDateField.BYTE_LENGTH;
        if (!optionStrikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += OptionStrikePriceField.BYTE_LENGTH;
        if (!optionStrikeCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += OptionStrikeCurrencyField.BYTE_LENGTH;
        if (!optionType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionTypeField.BYTE_LENGTH;
        if (!optionExpirationType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionExpirationTypeField.BYTE_LENGTH;
        return underlyingFutureInstrumentId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = underlyingAssetType.encode(data, cursor);
        cursor = underlyingAssetAlphanumeric.encode(data, cursor);
        cursor = productGroupCodeAlphanumeric.encode(data, cursor);
        cursor = exchange.encode(data, cursor);
        cursor = instrumentIdSource.encode(data, cursor);
        cursor = instrumentType.encode(data, cursor);
        cursor = instrumentListingStatus.encode(data, cursor);
        if (buffer != null && buffer.length >= 33) {
            System.arraycopy(buffer, 30, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
        cursor = currency.encode(data, cursor);
        cursor = settlementCurrency.encode(data, cursor);
        cursor = matchAlgorithm.encode(data, cursor);
        cursor = minimumSize.encode(data, cursor);
        cursor = maximumSize.encode(data, cursor);
        cursor = tick.encode(data, cursor);
        cursor = unitOfMeasure.encode(data, cursor);
        cursor = unitOfMeasureQuantity.encode(data, cursor);
        cursor = settlementPrice.encode(data, cursor);
        cursor = settlementPriceTypeCalcMethod.encode(data, cursor);
        cursor = totalVolume.encode(data, cursor);
        cursor = openInterestQuantity.encode(data, cursor);
        cursor = highLimitPrice.encode(data, cursor);
        cursor = lowLimitPrice.encode(data, cursor);
        cursor = tradingCollarVariationType.encode(data, cursor);
        cursor = tradingCollarVariation.encode(data, cursor);
        cursor = contractDate.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = valuationDate.encode(data, cursor);
        cursor = firstTradeDate.encode(data, cursor);
        cursor = lastTradeDate.encode(data, cursor);
        cursor = firstNoticeDate.encode(data, cursor);
        cursor = lastNoticeDate.encode(data, cursor);
        cursor = firstDeliveryDate.encode(data, cursor);
        cursor = lastDeliveryDate.encode(data, cursor);
        cursor = optionStrikePrice.encode(data, cursor);
        cursor = optionStrikeCurrency.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = optionExpirationType.encode(data, cursor);
        cursor = underlyingFutureInstrumentId.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "UnderlyingAssetType" -> Optional.of(underlyingAssetType);
            case "UnderlyingAssetAlphanumeric" -> Optional.of(underlyingAssetAlphanumeric);
            case "ProductGroupCodeAlphanumeric" -> Optional.of(productGroupCodeAlphanumeric);
            case "Exchange" -> Optional.of(exchange);
            case "InstrumentIdSource" -> Optional.of(instrumentIdSource);
            case "InstrumentType" -> Optional.of(instrumentType);
            case "InstrumentListingStatus" -> Optional.of(instrumentListingStatus);
            case "Currency" -> Optional.of(currency);
            case "SettlementCurrency" -> Optional.of(settlementCurrency);
            case "MatchAlgorithm" -> Optional.of(matchAlgorithm);
            case "MinimumSize" -> Optional.of(minimumSize);
            case "MaximumSize" -> Optional.of(maximumSize);
            case "Tick" -> Optional.of(tick);
            case "UnitOfMeasure" -> Optional.of(unitOfMeasure);
            case "UnitOfMeasureQuantity" -> Optional.of(unitOfMeasureQuantity);
            case "SettlementPrice" -> Optional.of(settlementPrice);
            case "SettlementPriceTypeCalcMethod" -> Optional.of(settlementPriceTypeCalcMethod);
            case "TotalVolume" -> Optional.of(totalVolume);
            case "OpenInterestQuantity" -> Optional.of(openInterestQuantity);
            case "HighLimitPrice" -> Optional.of(highLimitPrice);
            case "LowLimitPrice" -> Optional.of(lowLimitPrice);
            case "TradingCollarVariationType" -> Optional.of(tradingCollarVariationType);
            case "TradingCollarVariation" -> Optional.of(tradingCollarVariation);
            case "ContractDate" -> Optional.of(contractDate);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "ValuationDate" -> Optional.of(valuationDate);
            case "FirstTradeDate" -> Optional.of(firstTradeDate);
            case "LastTradeDate" -> Optional.of(lastTradeDate);
            case "FirstNoticeDate" -> Optional.of(firstNoticeDate);
            case "LastNoticeDate" -> Optional.of(lastNoticeDate);
            case "FirstDeliveryDate" -> Optional.of(firstDeliveryDate);
            case "LastDeliveryDate" -> Optional.of(lastDeliveryDate);
            case "OptionStrikePrice" -> Optional.of(optionStrikePrice);
            case "OptionStrikeCurrency" -> Optional.of(optionStrikeCurrency);
            case "OptionType" -> Optional.of(optionType);
            case "OptionExpirationType" -> Optional.of(optionExpirationType);
            case "UnderlyingFutureInstrumentId" -> Optional.of(underlyingFutureInstrumentId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SimpleInstrumentDefinitionMessage message)) {
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
        if (!(other instanceof SimpleInstrumentDefinitionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
