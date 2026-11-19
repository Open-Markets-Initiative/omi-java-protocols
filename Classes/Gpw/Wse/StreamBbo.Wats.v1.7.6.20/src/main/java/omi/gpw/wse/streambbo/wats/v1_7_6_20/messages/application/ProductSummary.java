package omi.gpw.wse.streambbo.wats.v1_7_6_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.AccumulatedInterestField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.CurrencyField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.DeltaField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.DividendField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.DividendRateField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.GammaField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.InterestRateField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.InterimDividendRightField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.LiquiditySupportPgeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.LowerLiquidityField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.MarkerPriceChangeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.MarketField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.MicField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.MultiplierNumberField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.OptionsStrikePriceField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ProductIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ProductIdentificationProductIdentificationField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ProductIdentificationTypeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.QuotationSystemField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.RhoField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.SectorField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.SessionDateField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.SplitField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.StatusField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.SubscriptionRightField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ThetaField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.TradingValueCurrencyField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.VegaField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.VolatilityField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.structs.BlockInstrument;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.structs.ClobInstrument;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.structs.CrossInstrument;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.structs.HybridInstrument;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.Message;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.PrintOptions;

/**
 * Represents the ProductSummary message from the StreamBbo protocol.
 *
 * <p>Session day product summary</p>
 */
public final class ProductSummary implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 629;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Product Summary";

    /**
     * Product identification type
     */
    private final ProductIdentificationTypeField productIdentificationType = new ProductIdentificationTypeField();

    /**
     * Product identification
     */
    private final ProductIdentificationProductIdentificationField productIdentificationProductIdentification = new ProductIdentificationProductIdentificationField();

    /**
     * Reference to financial product definition
     */
    private final ProductIdField productId = new ProductIdField();

    /**
     * Market structure's Market Identifier Code (MIC) as specified in ISO 10383
     */
    private final MicField mic = new MicField();

    /**
     * Accumulated interest on the bonds or for mortgage-backed bonds on the day of settling the transaction
     */
    private final AccumulatedInterestField accumulatedInterest = new AccumulatedInterestField();

    /**
     * Interest rate is determined on the basis of WIBOR/WIBID/WIRON rates for each expiration date of options and futures
     */
    private final InterestRateField interestRate = new InterestRateField();

    /**
     * Trading currency (e.g
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Stock Exchange session date
     */
    private final SessionDateField sessionDate = new SessionDateField();

    /**
     * The field comprises the trading value expressed in trading currency
     */
    private final TradingValueCurrencyField tradingValueCurrency = new TradingValueCurrencyField();

    /**
     * Instrument status
     */
    private final StatusField status = new StatusField();

    /**
     * Defines the sector of the economy that the company belongs to
     */
    private final SectorField sector = new SectorField();

    /**
     * Defines the market the instrument belongs to
     */
    private final MarketField market = new MarketField();

    /**
     * The field contains the direction of the percentage change in the instrument closing price from the current session in relation to the reference price
     */
    private final MarkerPriceChangeField markerPriceChange = new MarkerPriceChangeField();

    /**
     * The positive field value (true) informs if the company was qualified to Lower Liquidity Space
     */
    private final LowerLiquidityField lowerLiquidity = new LowerLiquidityField();

    /**
     * Instrument multiplier
     */
    private final MultiplierNumberField multiplierNumber = new MultiplierNumberField();

    /**
     * Dividend rate for the company is given on the basis of dividends paid by companies being the base instrument for futures and options
     */
    private final DividendRateField dividendRate = new DividendRateField();

    /**
     * Value of Delta indicator from the current session
     */
    private final DeltaField delta = new DeltaField();

    /**
     * Value of Gamma indicator from the current session
     */
    private final GammaField gamma = new GammaField();

    /**
     * Value of Rho indicator from the current session
     */
    private final RhoField rho = new RhoField();

    /**
     * Value of Theta indicator from the current session
     */
    private final ThetaField theta = new ThetaField();

    /**
     * Value of Vega indicator from the current session
     */
    private final VegaField vega = new VegaField();

    /**
     * Volatility is calculated according to algorithm worked out by the WSE
     */
    private final VolatilityField volatility = new VolatilityField();

    /**
     * Option product strike price
     */
    private final OptionsStrikePriceField optionsStrikePrice = new OptionsStrikePriceField();

    /**
     * The positive field value (true) informs that the instruments are traded the first time after determining the right to dividend
     */
    private final DividendField dividend = new DividendField();

    /**
     * The positive field value (true) informs that the instruments are traded the first time after determining the subscription right
     */
    private final SubscriptionRightField subscriptionRight = new SubscriptionRightField();

    /**
     * The positive field value (true) informs that the instruments are traded the first time after determining the interim dividend right
     */
    private final InterimDividendRightField interimDividendRight = new InterimDividendRightField();

    /**
     * The positive field value (true) informs that the instruments are traded the first time after the change of the nominal value of shares
     */
    private final SplitField split = new SplitField();

    /**
     * The field informing about the system of listing the instrument
     */
    private final QuotationSystemField quotationSystem = new QuotationSystemField();

    /**
     * The field informs if the company entered to Liquidity Support Programme
     */
    private final LiquiditySupportPgeField liquiditySupportPge = new LiquiditySupportPgeField();

    /**
     * SingleInstrumentSummary
     */
    private final ClobInstrument clobInstrument = new ClobInstrument();

    /**
     * SingleInstrumentSummary
     */
    private final CrossInstrument crossInstrument = new CrossInstrument();

    /**
     * SingleInstrumentSummary
     */
    private final BlockInstrument blockInstrument = new BlockInstrument();

    /**
     * SingleInstrumentSummary
     */
    private final HybridInstrument hybridInstrument = new HybridInstrument();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(clobInstrument.fields(), crossInstrument.fields(), blockInstrument.fields(), hybridInstrument.fields(), List.<Field>of(productIdentificationType), List.<Field>of(productIdentificationProductIdentification), List.<Field>of(productId), List.<Field>of(mic), List.<Field>of(accumulatedInterest), List.<Field>of(interestRate), List.<Field>of(currency), List.<Field>of(sessionDate), List.<Field>of(tradingValueCurrency), List.<Field>of(status), List.<Field>of(sector), List.<Field>of(market), List.<Field>of(markerPriceChange), List.<Field>of(lowerLiquidity), List.<Field>of(multiplierNumber), List.<Field>of(dividendRate), List.<Field>of(delta), List.<Field>of(gamma), List.<Field>of(rho), List.<Field>of(theta), List.<Field>of(vega), List.<Field>of(volatility), List.<Field>of(optionsStrikePrice), List.<Field>of(dividend), List.<Field>of(subscriptionRight), List.<Field>of(interimDividendRight), List.<Field>of(split), List.<Field>of(quotationSystem), List.<Field>of(liquiditySupportPge)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Product identification type
     *
     * @return the ProductIdentificationType field
     */
    public ProductIdentificationTypeField productIdentificationType() {
        return productIdentificationType;
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
     * Reference to financial product definition
     *
     * @return the ProductId field
     */
    public ProductIdField productId() {
        return productId;
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
     * Accumulated interest on the bonds or for mortgage-backed bonds on the day of settling the transaction
     *
     * @return the AccumulatedInterest field
     */
    public AccumulatedInterestField accumulatedInterest() {
        return accumulatedInterest;
    }

    /**
     * Interest rate is determined on the basis of WIBOR/WIBID/WIRON rates for each expiration date of options and futures
     *
     * @return the InterestRate field
     */
    public InterestRateField interestRate() {
        return interestRate;
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
     * Stock Exchange session date
     *
     * @return the SessionDate field
     */
    public SessionDateField sessionDate() {
        return sessionDate;
    }

    /**
     * The field comprises the trading value expressed in trading currency
     *
     * @return the TradingValueCurrency field
     */
    public TradingValueCurrencyField tradingValueCurrency() {
        return tradingValueCurrency;
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
     * Defines the sector of the economy that the company belongs to
     *
     * @return the Sector field
     */
    public SectorField sector() {
        return sector;
    }

    /**
     * Defines the market the instrument belongs to
     *
     * @return the Market field
     */
    public MarketField market() {
        return market;
    }

    /**
     * The field contains the direction of the percentage change in the instrument closing price from the current session in relation to the reference price
     *
     * @return the MarkerPriceChange field
     */
    public MarkerPriceChangeField markerPriceChange() {
        return markerPriceChange;
    }

    /**
     * The positive field value (true) informs if the company was qualified to Lower Liquidity Space
     *
     * @return the LowerLiquidity field
     */
    public LowerLiquidityField lowerLiquidity() {
        return lowerLiquidity;
    }

    /**
     * Instrument multiplier
     *
     * @return the MultiplierNumber field
     */
    public MultiplierNumberField multiplierNumber() {
        return multiplierNumber;
    }

    /**
     * Dividend rate for the company is given on the basis of dividends paid by companies being the base instrument for futures and options
     *
     * @return the DividendRate field
     */
    public DividendRateField dividendRate() {
        return dividendRate;
    }

    /**
     * Value of Delta indicator from the current session
     *
     * @return the Delta field
     */
    public DeltaField delta() {
        return delta;
    }

    /**
     * Value of Gamma indicator from the current session
     *
     * @return the Gamma field
     */
    public GammaField gamma() {
        return gamma;
    }

    /**
     * Value of Rho indicator from the current session
     *
     * @return the Rho field
     */
    public RhoField rho() {
        return rho;
    }

    /**
     * Value of Theta indicator from the current session
     *
     * @return the Theta field
     */
    public ThetaField theta() {
        return theta;
    }

    /**
     * Value of Vega indicator from the current session
     *
     * @return the Vega field
     */
    public VegaField vega() {
        return vega;
    }

    /**
     * Volatility is calculated according to algorithm worked out by the WSE
     *
     * @return the Volatility field
     */
    public VolatilityField volatility() {
        return volatility;
    }

    /**
     * Option product strike price
     *
     * @return the OptionsStrikePrice field
     */
    public OptionsStrikePriceField optionsStrikePrice() {
        return optionsStrikePrice;
    }

    /**
     * The positive field value (true) informs that the instruments are traded the first time after determining the right to dividend
     *
     * @return the Dividend field
     */
    public DividendField dividend() {
        return dividend;
    }

    /**
     * The positive field value (true) informs that the instruments are traded the first time after determining the subscription right
     *
     * @return the SubscriptionRight field
     */
    public SubscriptionRightField subscriptionRight() {
        return subscriptionRight;
    }

    /**
     * The positive field value (true) informs that the instruments are traded the first time after determining the interim dividend right
     *
     * @return the InterimDividendRight field
     */
    public InterimDividendRightField interimDividendRight() {
        return interimDividendRight;
    }

    /**
     * The positive field value (true) informs that the instruments are traded the first time after the change of the nominal value of shares
     *
     * @return the Split field
     */
    public SplitField split() {
        return split;
    }

    /**
     * The field informing about the system of listing the instrument
     *
     * @return the QuotationSystem field
     */
    public QuotationSystemField quotationSystem() {
        return quotationSystem;
    }

    /**
     * The field informs if the company entered to Liquidity Support Programme
     *
     * @return the LiquiditySupportPge field
     */
    public LiquiditySupportPgeField liquiditySupportPge() {
        return liquiditySupportPge;
    }

    /**
     * SingleInstrumentSummary
     *
     * @return the ClobInstrument record
     */
    public ClobInstrument clobInstrument() {
        return clobInstrument;
    }

    /**
     * SingleInstrumentSummary
     *
     * @return the CrossInstrument record
     */
    public CrossInstrument crossInstrument() {
        return crossInstrument;
    }

    /**
     * SingleInstrumentSummary
     *
     * @return the BlockInstrument record
     */
    public BlockInstrument blockInstrument() {
        return blockInstrument;
    }

    /**
     * SingleInstrumentSummary
     *
     * @return the HybridInstrument record
     */
    public HybridInstrument hybridInstrument() {
        return hybridInstrument;
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
        if (!clobInstrument.parseFrom(data, cursor, end - 510)) {
            return false;
        }
        cursor += clobInstrument.byteLength();
        if (!crossInstrument.parseFrom(data, cursor, end - 391)) {
            return false;
        }
        cursor += crossInstrument.byteLength();
        if (!blockInstrument.parseFrom(data, cursor, end - 272)) {
            return false;
        }
        cursor += blockInstrument.byteLength();
        if (!hybridInstrument.parseFrom(data, cursor, end - 153)) {
            return false;
        }
        cursor += hybridInstrument.byteLength();
        if (!productIdentificationType.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdentificationTypeField.BYTE_LENGTH;
        if (!productIdentificationProductIdentification.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdentificationProductIdentificationField.BYTE_LENGTH;
        if (!productId.parse(data, cursor)) {
            return false;
        }
        cursor += ProductIdField.BYTE_LENGTH;
        if (!mic.parse(data, cursor)) {
            return false;
        }
        cursor += MicField.BYTE_LENGTH;
        if (!accumulatedInterest.parse(data, cursor)) {
            return false;
        }
        cursor += AccumulatedInterestField.BYTE_LENGTH;
        if (!interestRate.parse(data, cursor)) {
            return false;
        }
        cursor += InterestRateField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!sessionDate.parse(data, cursor)) {
            return false;
        }
        cursor += SessionDateField.BYTE_LENGTH;
        if (!tradingValueCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += TradingValueCurrencyField.BYTE_LENGTH;
        if (!status.parse(data, cursor)) {
            return false;
        }
        cursor += StatusField.BYTE_LENGTH;
        if (!sector.parse(data, cursor)) {
            return false;
        }
        cursor += SectorField.BYTE_LENGTH;
        if (!market.parse(data, cursor)) {
            return false;
        }
        cursor += MarketField.BYTE_LENGTH;
        if (!markerPriceChange.parse(data, cursor)) {
            return false;
        }
        cursor += MarkerPriceChangeField.BYTE_LENGTH;
        if (!lowerLiquidity.parse(data, cursor)) {
            return false;
        }
        cursor += LowerLiquidityField.BYTE_LENGTH;
        if (!multiplierNumber.parse(data, cursor)) {
            return false;
        }
        cursor += MultiplierNumberField.BYTE_LENGTH;
        if (!dividendRate.parse(data, cursor)) {
            return false;
        }
        cursor += DividendRateField.BYTE_LENGTH;
        if (!delta.parse(data, cursor)) {
            return false;
        }
        cursor += DeltaField.BYTE_LENGTH;
        if (!gamma.parse(data, cursor)) {
            return false;
        }
        cursor += GammaField.BYTE_LENGTH;
        if (!rho.parse(data, cursor)) {
            return false;
        }
        cursor += RhoField.BYTE_LENGTH;
        if (!theta.parse(data, cursor)) {
            return false;
        }
        cursor += ThetaField.BYTE_LENGTH;
        if (!vega.parse(data, cursor)) {
            return false;
        }
        cursor += VegaField.BYTE_LENGTH;
        if (!volatility.parse(data, cursor)) {
            return false;
        }
        cursor += VolatilityField.BYTE_LENGTH;
        if (!optionsStrikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += OptionsStrikePriceField.BYTE_LENGTH;
        if (!dividend.parse(data, cursor)) {
            return false;
        }
        cursor += DividendField.BYTE_LENGTH;
        if (!subscriptionRight.parse(data, cursor)) {
            return false;
        }
        cursor += SubscriptionRightField.BYTE_LENGTH;
        if (!interimDividendRight.parse(data, cursor)) {
            return false;
        }
        cursor += InterimDividendRightField.BYTE_LENGTH;
        if (!split.parse(data, cursor)) {
            return false;
        }
        cursor += SplitField.BYTE_LENGTH;
        if (!quotationSystem.parse(data, cursor)) {
            return false;
        }
        cursor += QuotationSystemField.BYTE_LENGTH;
        return liquiditySupportPge.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clobInstrument.encode(data, cursor);
        cursor = crossInstrument.encode(data, cursor);
        cursor = blockInstrument.encode(data, cursor);
        cursor = hybridInstrument.encode(data, cursor);
        cursor = productIdentificationType.encode(data, cursor);
        cursor = productIdentificationProductIdentification.encode(data, cursor);
        cursor = productId.encode(data, cursor);
        cursor = mic.encode(data, cursor);
        cursor = accumulatedInterest.encode(data, cursor);
        cursor = interestRate.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = sessionDate.encode(data, cursor);
        cursor = tradingValueCurrency.encode(data, cursor);
        cursor = status.encode(data, cursor);
        cursor = sector.encode(data, cursor);
        cursor = market.encode(data, cursor);
        cursor = markerPriceChange.encode(data, cursor);
        cursor = lowerLiquidity.encode(data, cursor);
        cursor = multiplierNumber.encode(data, cursor);
        cursor = dividendRate.encode(data, cursor);
        cursor = delta.encode(data, cursor);
        cursor = gamma.encode(data, cursor);
        cursor = rho.encode(data, cursor);
        cursor = theta.encode(data, cursor);
        cursor = vega.encode(data, cursor);
        cursor = volatility.encode(data, cursor);
        cursor = optionsStrikePrice.encode(data, cursor);
        cursor = dividend.encode(data, cursor);
        cursor = subscriptionRight.encode(data, cursor);
        cursor = interimDividendRight.encode(data, cursor);
        cursor = split.encode(data, cursor);
        cursor = quotationSystem.encode(data, cursor);
        cursor = liquiditySupportPge.encode(data, cursor);
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
        clobInstrument.clear();
        crossInstrument.clear();
        blockInstrument.clear();
        hybridInstrument.clear();
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
            case "ProductIdentificationType" -> Optional.of(productIdentificationType);
            case "ProductIdentificationProductIdentification" -> Optional.of(productIdentificationProductIdentification);
            case "ProductId" -> Optional.of(productId);
            case "Mic" -> Optional.of(mic);
            case "AccumulatedInterest" -> Optional.of(accumulatedInterest);
            case "InterestRate" -> Optional.of(interestRate);
            case "Currency" -> Optional.of(currency);
            case "SessionDate" -> Optional.of(sessionDate);
            case "TradingValueCurrency" -> Optional.of(tradingValueCurrency);
            case "Status" -> Optional.of(status);
            case "Sector" -> Optional.of(sector);
            case "Market" -> Optional.of(market);
            case "MarkerPriceChange" -> Optional.of(markerPriceChange);
            case "LowerLiquidity" -> Optional.of(lowerLiquidity);
            case "MultiplierNumber" -> Optional.of(multiplierNumber);
            case "DividendRate" -> Optional.of(dividendRate);
            case "Delta" -> Optional.of(delta);
            case "Gamma" -> Optional.of(gamma);
            case "Rho" -> Optional.of(rho);
            case "Theta" -> Optional.of(theta);
            case "Vega" -> Optional.of(vega);
            case "Volatility" -> Optional.of(volatility);
            case "OptionsStrikePrice" -> Optional.of(optionsStrikePrice);
            case "Dividend" -> Optional.of(dividend);
            case "SubscriptionRight" -> Optional.of(subscriptionRight);
            case "InterimDividendRight" -> Optional.of(interimDividendRight);
            case "Split" -> Optional.of(split);
            case "QuotationSystem" -> Optional.of(quotationSystem);
            case "LiquiditySupportPge" -> Optional.of(liquiditySupportPge);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ProductSummary message)) {
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
        if (!(other instanceof ProductSummary message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
