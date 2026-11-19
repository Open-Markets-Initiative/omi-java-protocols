package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.InstrumentIdField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MaxPriceField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MicField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MinPriceField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MmtAgencyCrossTradeIndicatorField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MmtAlgorithmicIndicatorField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MmtBenchmarkReferencePriceIndicatorField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MmtMarketMechanismField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MmtModificationIndicatorField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MmtNegotiationIndicatorField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MmtOffBookAutomatedIndicatorField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MmtOrdinaryTradeIndicatorField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MmtPostTradeDeferralReasonField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MmtPostTradeDeferralTypeField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MmtSpecialDividendIndicatorField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MmtTradingModeField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.MmtTransactionCategoryField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.NoTradesField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.NominalCurrencyField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.NominalValueValueField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.OpeningPriceField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.PctChangeField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.PriceCurrencyField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.PriceField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.PriceNotationField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.PublicationTimestampField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.QuantityField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.SettlementDateField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.SettlementValueValueField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.TotalValueField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.TotalVolumeField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.TradeIdField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.TradeToBeClearedField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.TradingTimestampField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.fields.VwapField;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.structs.PublicProductIdentification;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.Message;
import omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.types.PrintOptions;

/**
 * Represents the Trade message from the StreamFullDepth protocol.
 *
 * <p>Enriched trade report</p>
 */
public final class Trade implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 178;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade";

    /**
     * ID of financial instrument
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Settlement value
     */
    private final SettlementValueValueField settlementValueValue = new SettlementValueValueField();

    /**
     * Settlement date
     */
    private final SettlementDateField settlementDate = new SettlementDateField();

    /**
     * Date and time when the transaction was executed
     */
    private final TradingTimestampField tradingTimestamp = new TradingTimestampField();

    /**
     * Auction price (final auction price)
     */
    private final PriceField price = new PriceField();

    /**
     * Currency in which the price is expressed (applicable if the price is expressed as monetary value)
     */
    private final PriceCurrencyField priceCurrency = new PriceCurrencyField();

    /**
     * Indication as to whether the price is expressed in monetary value, in percentage or in yield
     */
    private final PriceNotationField priceNotation = new PriceNotationField();

    /**
     * Auction quantity (final auction volume)
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Nominal value
     */
    private final NominalValueValueField nominalValueValue = new NominalValueValueField();

    /**
     * Nominal currency
     */
    private final NominalCurrencyField nominalCurrency = new NominalCurrencyField();

    /**
     * Market structure's Market Identifier Code (MIC) as specified in ISO 10383
     */
    private final MicField mic = new MicField();

    /**
     * Date and time when the transaction was published by a trading venue
     */
    private final PublicationTimestampField publicationTimestamp = new PublicationTimestampField();

    /**
     * ID of the trade
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Code to identify whether the transaction will be cleared
     */
    private final TradeToBeClearedField tradeToBeCleared = new TradeToBeClearedField();

    /**
     * Percentage change
     */
    private final PctChangeField pctChange = new PctChangeField();

    /**
     * Volume-weighted average price
     */
    private final VwapField vwap = new VwapField();

    /**
     * Total number of transactions
     */
    private final NoTradesField noTrades = new NoTradesField();

    /**
     * Total transaction volume
     */
    private final TotalVolumeField totalVolume = new TotalVolumeField();

    /**
     * Total transaction value
     */
    private final TotalValueField totalValue = new TotalValueField();

    /**
     * The price of the first trade on the current trading day
     */
    private final OpeningPriceField openingPrice = new OpeningPriceField();

    /**
     * Highest price of the instrument on the current trading day
     */
    private final MaxPriceField maxPrice = new MaxPriceField();

    /**
     * Lowest price of the instrument on the current trading day
     */
    private final MinPriceField minPrice = new MinPriceField();

    /**
     * MMT Market Mechanism
     */
    private final MmtMarketMechanismField mmtMarketMechanism = new MmtMarketMechanismField();

    /**
     * MMT Trading Mode
     */
    private final MmtTradingModeField mmtTradingMode = new MmtTradingModeField();

    /**
     * MMT Transaction Category
     */
    private final MmtTransactionCategoryField mmtTransactionCategory = new MmtTransactionCategoryField();

    /**
     * MMT Negotiation Indicator
     */
    private final MmtNegotiationIndicatorField mmtNegotiationIndicator = new MmtNegotiationIndicatorField();

    /**
     * MMT Agency Cross Trade Indicator
     */
    private final MmtAgencyCrossTradeIndicatorField mmtAgencyCrossTradeIndicator = new MmtAgencyCrossTradeIndicatorField();

    /**
     * MMT Modification Indicator
     */
    private final MmtModificationIndicatorField mmtModificationIndicator = new MmtModificationIndicatorField();

    /**
     * MMT Benchmark / Reference Price Indicator
     */
    private final MmtBenchmarkReferencePriceIndicatorField mmtBenchmarkReferencePriceIndicator = new MmtBenchmarkReferencePriceIndicatorField();

    /**
     * MMT Special Dividend Indicator
     */
    private final MmtSpecialDividendIndicatorField mmtSpecialDividendIndicator = new MmtSpecialDividendIndicatorField();

    /**
     * MMT Off Book Automated Indicator
     */
    private final MmtOffBookAutomatedIndicatorField mmtOffBookAutomatedIndicator = new MmtOffBookAutomatedIndicatorField();

    /**
     * MMT Ordinary Trade Indicator
     */
    private final MmtOrdinaryTradeIndicatorField mmtOrdinaryTradeIndicator = new MmtOrdinaryTradeIndicatorField();

    /**
     * MMT Algorithmic Indicator
     */
    private final MmtAlgorithmicIndicatorField mmtAlgorithmicIndicator = new MmtAlgorithmicIndicatorField();

    /**
     * MMT Post-Trade Deferral Reason
     */
    private final MmtPostTradeDeferralReasonField mmtPostTradeDeferralReason = new MmtPostTradeDeferralReasonField();

    /**
     * MMT Post-Trade Deferral Type
     */
    private final MmtPostTradeDeferralTypeField mmtPostTradeDeferralType = new MmtPostTradeDeferralTypeField();

    /**
     * PublicProductIdentification
     */
    private final PublicProductIdentification publicProductIdentification = new PublicProductIdentification();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(instrumentId), List.<Field>of(settlementValueValue), List.<Field>of(settlementDate), List.<Field>of(tradingTimestamp), publicProductIdentification.fields(), List.<Field>of(price), List.<Field>of(priceCurrency), List.<Field>of(priceNotation), List.<Field>of(quantity), List.<Field>of(nominalValueValue), List.<Field>of(nominalCurrency), List.<Field>of(mic), List.<Field>of(publicationTimestamp), List.<Field>of(tradeId), List.<Field>of(tradeToBeCleared), List.<Field>of(pctChange), List.<Field>of(vwap), List.<Field>of(noTrades), List.<Field>of(totalVolume), List.<Field>of(totalValue), List.<Field>of(openingPrice), List.<Field>of(maxPrice), List.<Field>of(minPrice), List.<Field>of(mmtMarketMechanism), List.<Field>of(mmtTradingMode), List.<Field>of(mmtTransactionCategory), List.<Field>of(mmtNegotiationIndicator), List.<Field>of(mmtAgencyCrossTradeIndicator), List.<Field>of(mmtModificationIndicator), List.<Field>of(mmtBenchmarkReferencePriceIndicator), List.<Field>of(mmtSpecialDividendIndicator), List.<Field>of(mmtOffBookAutomatedIndicator), List.<Field>of(mmtOrdinaryTradeIndicator), List.<Field>of(mmtAlgorithmicIndicator), List.<Field>of(mmtPostTradeDeferralReason), List.<Field>of(mmtPostTradeDeferralType)).flatMap(List::stream).toList();

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
     * Settlement value
     *
     * @return the SettlementValueValue field
     */
    public SettlementValueValueField settlementValueValue() {
        return settlementValueValue;
    }

    /**
     * Settlement date
     *
     * @return the SettlementDate field
     */
    public SettlementDateField settlementDate() {
        return settlementDate;
    }

    /**
     * Date and time when the transaction was executed
     *
     * @return the TradingTimestamp field
     */
    public TradingTimestampField tradingTimestamp() {
        return tradingTimestamp;
    }

    /**
     * Auction price (final auction price)
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Currency in which the price is expressed (applicable if the price is expressed as monetary value)
     *
     * @return the PriceCurrency field
     */
    public PriceCurrencyField priceCurrency() {
        return priceCurrency;
    }

    /**
     * Indication as to whether the price is expressed in monetary value, in percentage or in yield
     *
     * @return the PriceNotation field
     */
    public PriceNotationField priceNotation() {
        return priceNotation;
    }

    /**
     * Auction quantity (final auction volume)
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Nominal value
     *
     * @return the NominalValueValue field
     */
    public NominalValueValueField nominalValueValue() {
        return nominalValueValue;
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
     * Market structure's Market Identifier Code (MIC) as specified in ISO 10383
     *
     * @return the Mic field
     */
    public MicField mic() {
        return mic;
    }

    /**
     * Date and time when the transaction was published by a trading venue
     *
     * @return the PublicationTimestamp field
     */
    public PublicationTimestampField publicationTimestamp() {
        return publicationTimestamp;
    }

    /**
     * ID of the trade
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Code to identify whether the transaction will be cleared
     *
     * @return the TradeToBeCleared field
     */
    public TradeToBeClearedField tradeToBeCleared() {
        return tradeToBeCleared;
    }

    /**
     * Percentage change
     *
     * @return the PctChange field
     */
    public PctChangeField pctChange() {
        return pctChange;
    }

    /**
     * Volume-weighted average price
     *
     * @return the Vwap field
     */
    public VwapField vwap() {
        return vwap;
    }

    /**
     * Total number of transactions
     *
     * @return the NoTrades field
     */
    public NoTradesField noTrades() {
        return noTrades;
    }

    /**
     * Total transaction volume
     *
     * @return the TotalVolume field
     */
    public TotalVolumeField totalVolume() {
        return totalVolume;
    }

    /**
     * Total transaction value
     *
     * @return the TotalValue field
     */
    public TotalValueField totalValue() {
        return totalValue;
    }

    /**
     * The price of the first trade on the current trading day
     *
     * @return the OpeningPrice field
     */
    public OpeningPriceField openingPrice() {
        return openingPrice;
    }

    /**
     * Highest price of the instrument on the current trading day
     *
     * @return the MaxPrice field
     */
    public MaxPriceField maxPrice() {
        return maxPrice;
    }

    /**
     * Lowest price of the instrument on the current trading day
     *
     * @return the MinPrice field
     */
    public MinPriceField minPrice() {
        return minPrice;
    }

    /**
     * MMT Market Mechanism
     *
     * @return the MmtMarketMechanism field
     */
    public MmtMarketMechanismField mmtMarketMechanism() {
        return mmtMarketMechanism;
    }

    /**
     * MMT Trading Mode
     *
     * @return the MmtTradingMode field
     */
    public MmtTradingModeField mmtTradingMode() {
        return mmtTradingMode;
    }

    /**
     * MMT Transaction Category
     *
     * @return the MmtTransactionCategory field
     */
    public MmtTransactionCategoryField mmtTransactionCategory() {
        return mmtTransactionCategory;
    }

    /**
     * MMT Negotiation Indicator
     *
     * @return the MmtNegotiationIndicator field
     */
    public MmtNegotiationIndicatorField mmtNegotiationIndicator() {
        return mmtNegotiationIndicator;
    }

    /**
     * MMT Agency Cross Trade Indicator
     *
     * @return the MmtAgencyCrossTradeIndicator field
     */
    public MmtAgencyCrossTradeIndicatorField mmtAgencyCrossTradeIndicator() {
        return mmtAgencyCrossTradeIndicator;
    }

    /**
     * MMT Modification Indicator
     *
     * @return the MmtModificationIndicator field
     */
    public MmtModificationIndicatorField mmtModificationIndicator() {
        return mmtModificationIndicator;
    }

    /**
     * MMT Benchmark / Reference Price Indicator
     *
     * @return the MmtBenchmarkReferencePriceIndicator field
     */
    public MmtBenchmarkReferencePriceIndicatorField mmtBenchmarkReferencePriceIndicator() {
        return mmtBenchmarkReferencePriceIndicator;
    }

    /**
     * MMT Special Dividend Indicator
     *
     * @return the MmtSpecialDividendIndicator field
     */
    public MmtSpecialDividendIndicatorField mmtSpecialDividendIndicator() {
        return mmtSpecialDividendIndicator;
    }

    /**
     * MMT Off Book Automated Indicator
     *
     * @return the MmtOffBookAutomatedIndicator field
     */
    public MmtOffBookAutomatedIndicatorField mmtOffBookAutomatedIndicator() {
        return mmtOffBookAutomatedIndicator;
    }

    /**
     * MMT Ordinary Trade Indicator
     *
     * @return the MmtOrdinaryTradeIndicator field
     */
    public MmtOrdinaryTradeIndicatorField mmtOrdinaryTradeIndicator() {
        return mmtOrdinaryTradeIndicator;
    }

    /**
     * MMT Algorithmic Indicator
     *
     * @return the MmtAlgorithmicIndicator field
     */
    public MmtAlgorithmicIndicatorField mmtAlgorithmicIndicator() {
        return mmtAlgorithmicIndicator;
    }

    /**
     * MMT Post-Trade Deferral Reason
     *
     * @return the MmtPostTradeDeferralReason field
     */
    public MmtPostTradeDeferralReasonField mmtPostTradeDeferralReason() {
        return mmtPostTradeDeferralReason;
    }

    /**
     * MMT Post-Trade Deferral Type
     *
     * @return the MmtPostTradeDeferralType field
     */
    public MmtPostTradeDeferralTypeField mmtPostTradeDeferralType() {
        return mmtPostTradeDeferralType;
    }

    /**
     * PublicProductIdentification
     *
     * @return the PublicProductIdentification record
     */
    public PublicProductIdentification publicProductIdentification() {
        return publicProductIdentification;
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
        return Optional.ofNullable(tradingTimestamp.value());
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
        if (!settlementValueValue.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementValueValueField.BYTE_LENGTH;
        if (!settlementDate.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementDateField.BYTE_LENGTH;
        if (!tradingTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += TradingTimestampField.BYTE_LENGTH;
        if (!publicProductIdentification.parseFrom(data, cursor, end - 123)) {
            return false;
        }
        cursor += publicProductIdentification.byteLength();
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!priceCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += PriceCurrencyField.BYTE_LENGTH;
        if (!priceNotation.parse(data, cursor)) {
            return false;
        }
        cursor += PriceNotationField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!nominalValueValue.parse(data, cursor)) {
            return false;
        }
        cursor += NominalValueValueField.BYTE_LENGTH;
        if (!nominalCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += NominalCurrencyField.BYTE_LENGTH;
        if (!mic.parse(data, cursor)) {
            return false;
        }
        cursor += MicField.BYTE_LENGTH;
        if (!publicationTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += PublicationTimestampField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!tradeToBeCleared.parse(data, cursor)) {
            return false;
        }
        cursor += TradeToBeClearedField.BYTE_LENGTH;
        if (!pctChange.parse(data, cursor)) {
            return false;
        }
        cursor += PctChangeField.BYTE_LENGTH;
        if (!vwap.parse(data, cursor)) {
            return false;
        }
        cursor += VwapField.BYTE_LENGTH;
        if (!noTrades.parse(data, cursor)) {
            return false;
        }
        cursor += NoTradesField.BYTE_LENGTH;
        if (!totalVolume.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolumeField.BYTE_LENGTH;
        if (!totalValue.parse(data, cursor)) {
            return false;
        }
        cursor += TotalValueField.BYTE_LENGTH;
        if (!openingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OpeningPriceField.BYTE_LENGTH;
        if (!maxPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MaxPriceField.BYTE_LENGTH;
        if (!minPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MinPriceField.BYTE_LENGTH;
        if (!mmtMarketMechanism.parse(data, cursor)) {
            return false;
        }
        cursor += MmtMarketMechanismField.BYTE_LENGTH;
        if (!mmtTradingMode.parse(data, cursor)) {
            return false;
        }
        cursor += MmtTradingModeField.BYTE_LENGTH;
        if (!mmtTransactionCategory.parse(data, cursor)) {
            return false;
        }
        cursor += MmtTransactionCategoryField.BYTE_LENGTH;
        if (!mmtNegotiationIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MmtNegotiationIndicatorField.BYTE_LENGTH;
        if (!mmtAgencyCrossTradeIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MmtAgencyCrossTradeIndicatorField.BYTE_LENGTH;
        if (!mmtModificationIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MmtModificationIndicatorField.BYTE_LENGTH;
        if (!mmtBenchmarkReferencePriceIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MmtBenchmarkReferencePriceIndicatorField.BYTE_LENGTH;
        if (!mmtSpecialDividendIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MmtSpecialDividendIndicatorField.BYTE_LENGTH;
        if (!mmtOffBookAutomatedIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MmtOffBookAutomatedIndicatorField.BYTE_LENGTH;
        if (!mmtOrdinaryTradeIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MmtOrdinaryTradeIndicatorField.BYTE_LENGTH;
        if (!mmtAlgorithmicIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += MmtAlgorithmicIndicatorField.BYTE_LENGTH;
        if (!mmtPostTradeDeferralReason.parse(data, cursor)) {
            return false;
        }
        cursor += MmtPostTradeDeferralReasonField.BYTE_LENGTH;
        return mmtPostTradeDeferralType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = settlementValueValue.encode(data, cursor);
        cursor = settlementDate.encode(data, cursor);
        cursor = tradingTimestamp.encode(data, cursor);
        cursor = publicProductIdentification.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = priceCurrency.encode(data, cursor);
        cursor = priceNotation.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = nominalValueValue.encode(data, cursor);
        cursor = nominalCurrency.encode(data, cursor);
        cursor = mic.encode(data, cursor);
        cursor = publicationTimestamp.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = tradeToBeCleared.encode(data, cursor);
        cursor = pctChange.encode(data, cursor);
        cursor = vwap.encode(data, cursor);
        cursor = noTrades.encode(data, cursor);
        cursor = totalVolume.encode(data, cursor);
        cursor = totalValue.encode(data, cursor);
        cursor = openingPrice.encode(data, cursor);
        cursor = maxPrice.encode(data, cursor);
        cursor = minPrice.encode(data, cursor);
        cursor = mmtMarketMechanism.encode(data, cursor);
        cursor = mmtTradingMode.encode(data, cursor);
        cursor = mmtTransactionCategory.encode(data, cursor);
        cursor = mmtNegotiationIndicator.encode(data, cursor);
        cursor = mmtAgencyCrossTradeIndicator.encode(data, cursor);
        cursor = mmtModificationIndicator.encode(data, cursor);
        cursor = mmtBenchmarkReferencePriceIndicator.encode(data, cursor);
        cursor = mmtSpecialDividendIndicator.encode(data, cursor);
        cursor = mmtOffBookAutomatedIndicator.encode(data, cursor);
        cursor = mmtOrdinaryTradeIndicator.encode(data, cursor);
        cursor = mmtAlgorithmicIndicator.encode(data, cursor);
        cursor = mmtPostTradeDeferralReason.encode(data, cursor);
        cursor = mmtPostTradeDeferralType.encode(data, cursor);
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
        publicProductIdentification.clear();
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
            case "SettlementValueValue" -> Optional.of(settlementValueValue);
            case "SettlementDate" -> Optional.of(settlementDate);
            case "TradingTimestamp" -> Optional.of(tradingTimestamp);
            case "Price" -> Optional.of(price);
            case "PriceCurrency" -> Optional.of(priceCurrency);
            case "PriceNotation" -> Optional.of(priceNotation);
            case "Quantity" -> Optional.of(quantity);
            case "NominalValueValue" -> Optional.of(nominalValueValue);
            case "NominalCurrency" -> Optional.of(nominalCurrency);
            case "Mic" -> Optional.of(mic);
            case "PublicationTimestamp" -> Optional.of(publicationTimestamp);
            case "TradeId" -> Optional.of(tradeId);
            case "TradeToBeCleared" -> Optional.of(tradeToBeCleared);
            case "PctChange" -> Optional.of(pctChange);
            case "Vwap" -> Optional.of(vwap);
            case "NoTrades" -> Optional.of(noTrades);
            case "TotalVolume" -> Optional.of(totalVolume);
            case "TotalValue" -> Optional.of(totalValue);
            case "OpeningPrice" -> Optional.of(openingPrice);
            case "MaxPrice" -> Optional.of(maxPrice);
            case "MinPrice" -> Optional.of(minPrice);
            case "MmtMarketMechanism" -> Optional.of(mmtMarketMechanism);
            case "MmtTradingMode" -> Optional.of(mmtTradingMode);
            case "MmtTransactionCategory" -> Optional.of(mmtTransactionCategory);
            case "MmtNegotiationIndicator" -> Optional.of(mmtNegotiationIndicator);
            case "MmtAgencyCrossTradeIndicator" -> Optional.of(mmtAgencyCrossTradeIndicator);
            case "MmtModificationIndicator" -> Optional.of(mmtModificationIndicator);
            case "MmtBenchmarkReferencePriceIndicator" -> Optional.of(mmtBenchmarkReferencePriceIndicator);
            case "MmtSpecialDividendIndicator" -> Optional.of(mmtSpecialDividendIndicator);
            case "MmtOffBookAutomatedIndicator" -> Optional.of(mmtOffBookAutomatedIndicator);
            case "MmtOrdinaryTradeIndicator" -> Optional.of(mmtOrdinaryTradeIndicator);
            case "MmtAlgorithmicIndicator" -> Optional.of(mmtAlgorithmicIndicator);
            case "MmtPostTradeDeferralReason" -> Optional.of(mmtPostTradeDeferralReason);
            case "MmtPostTradeDeferralType" -> Optional.of(mmtPostTradeDeferralType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof Trade message)) {
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
        if (!(other instanceof Trade message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
