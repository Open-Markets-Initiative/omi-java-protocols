package omi.asx.asxderivatives.ntp.itch.v1_05.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.BasisOfQuotationField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.BlockLotSizeField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.CfiCodeField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.CouponRateField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.CurrencyField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.ExchangeField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.ExpiryDateField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.ExpiryMonthField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.ExpiryYearField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.InstrumentField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.IsinField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.LastTradingDateField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.LongNameField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.LotSizeOrFaceValueField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.MaturityValueField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.NanosecondsField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.OptionTypeField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.PaymentsPerYearField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.PriceDisplayDecimalsField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.PriceFractionalDenominatorField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.PriceMinimumTickField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.PriorDaySettlementField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.StrikeField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.StrikePriceDecimalPositionField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.StrikePriceFractionalDenominatorField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.StrikePriceMinimumTickField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.SymbolNameField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.TradeDateField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.TradeableInstrumentIdField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.UnderlyingTradeableInstrumentIdField;
import omi.asx.asxderivatives.ntp.itch.v1_05.fields.VolatilityField;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.Field;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.Message;
import omi.asx.asxderivatives.ntp.itch.v1_05.types.PrintOptions;

/**
 * Represents the OptionsSymbolDirectoryMessage message from the Ntp protocol.
 *
 * <p>The Options Symbol Directory message describes options and warrants contracts.</p>
 */
public final class OptionsSymbolDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'h';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 219;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Options Symbol Directory Message";

    /**
     * Nanoseconds portion of the Nanoseconds, accurate to 1,000 nanoseconds.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Trade Date. Represented as number of days since 1 January 1970.
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Identifier of the Order Book.
     */
    private final TradeableInstrumentIdField tradeableInstrumentId = new TradeableInstrumentIdField();

    /**
     * The unique tradable instrument name.
     */
    private final SymbolNameField symbolName = new SymbolNameField();

    /**
     * Additional instrument series information.
     */
    private final LongNameField longName = new LongNameField();

    /**
     * Reserved for future use.
     */
    private final IsinField isin = new IsinField();

    /**
     * Denotes the exchange identifier of the contract
     */
    private final ExchangeField exchange = new ExchangeField();

    /**
     * Denotes the instrument identifier of the contract.
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * Indicates the type of security using ISO 10962 standard, CFI code values.
     */
    private final CfiCodeField cfiCode = new CfiCodeField();

    /**
     * Year of expiry (YYYY) for futures contract types, zero otherwise.
     */
    private final ExpiryYearField expiryYear = new ExpiryYearField();

    /**
     * Month of expiry for futures contract types, zero otherwise.
     */
    private final ExpiryMonthField expiryMonth = new ExpiryMonthField();

    /**
     * Indicates the type of option
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * Strike price of contract. Divide by the Strike Price Fractional Denominator to determine the floating point value.
     */
    private final StrikeField strike = new StrikeField();

    /**
     * Identifier of the Underlying Tradeable Instrument (can be zero if underlying not defined).
     */
    private final UnderlyingTradeableInstrumentIdField underlyingTradeableInstrumentId = new UnderlyingTradeableInstrumentIdField();

    /**
     * Suggested number of decimals to display the price at.
     */
    private final PriceDisplayDecimalsField priceDisplayDecimals = new PriceDisplayDecimalsField();

    /**
     * Denominator of the price to yield the floating point price.
     */
    private final PriceFractionalDenominatorField priceFractionalDenominator = new PriceFractionalDenominatorField();

    /**
     * Minimum tick size. Divide by the Price Fractional Denominator to determine the floating point value.
     */
    private final PriceMinimumTickField priceMinimumTick = new PriceMinimumTickField();

    /**
     * Number of decimals to display the strike price.
     */
    private final StrikePriceDecimalPositionField strikePriceDecimalPosition = new StrikePriceDecimalPositionField();

    /**
     * Denominator of the Strike Price to yield the floating point strike price.
     */
    private final StrikePriceFractionalDenominatorField strikePriceFractionalDenominator = new StrikePriceFractionalDenominatorField();

    /**
     * Minimum tick size for the Strike Price. Divide by the Strike Price Fractional Denominator to determine the floating point value.
     */
    private final StrikePriceMinimumTickField strikePriceMinimumTick = new StrikePriceMinimumTickField();

    /**
     * The Last Trading Day as specified in the ASX 24 Contract Specifications. Reported in Unix Time (number of seconds since 00:00 1 January 1970 GMT). Convert to AEST/ADST as appropriate to determine the date.
     */
    private final LastTradingDateField lastTradingDate = new LastTradingDateField();

    /**
     * Prior Day Settlement price. Divide by the Price Fractional Denominator to determine the floating point value.
     */
    private final PriorDaySettlementField priorDaySettlement = new PriorDaySettlementField();

    /**
     * Volatility for an option contract.
     */
    private final VolatilityField volatility = new VolatilityField();

    /**
     * Currency of contract.
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * The Contract Unit as specified in the ASX 24 Contract Specifications.
     */
    private final LotSizeOrFaceValueField lotSizeOrFaceValue = new LotSizeOrFaceValueField();

    /**
     * The number of days or years to maturity for bills or bonds as specified in the ASX 24 Contract Specifications.
     */
    private final MaturityValueField maturityValue = new MaturityValueField();

    /**
     * The coupon percentage rate for bonds.
     */
    private final CouponRateField couponRate = new CouponRateField();

    /**
     * Number of payments per year for bonds.
     */
    private final PaymentsPerYearField paymentsPerYear = new PaymentsPerYearField();

    /**
     * Indicates the number of lots that represent a block lot for the order book.
     */
    private final BlockLotSizeField blockLotSize = new BlockLotSizeField();

    /**
     * The Settlement Date as specified in the ASX 24 Contract Specifications. Reported in Unix Time (number of seconds since 00:00 1 January 1970 GMT). Convert to AEST/ADST as appropriate to determine the date.
     */
    private final ExpiryDateField expiryDate = new ExpiryDateField();

    /**
     * Blank filled. Not available for ASX 24 products.
     */
    private final BasisOfQuotationField basisOfQuotation = new BasisOfQuotationField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, tradeDate, tradeableInstrumentId, symbolName, longName, isin, exchange, instrument, cfiCode, expiryYear, expiryMonth, optionType, strike, underlyingTradeableInstrumentId, priceDisplayDecimals, priceFractionalDenominator, priceMinimumTick, strikePriceDecimalPosition, strikePriceFractionalDenominator, strikePriceMinimumTick, lastTradingDate, priorDaySettlement, volatility, currency, lotSizeOrFaceValue, maturityValue, couponRate, paymentsPerYear, blockLotSize, expiryDate, basisOfQuotation);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the Nanoseconds, accurate to 1,000 nanoseconds.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Trade Date. Represented as number of days since 1 January 1970.
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Identifier of the Order Book.
     *
     * @return the TradeableInstrumentId field
     */
    public TradeableInstrumentIdField tradeableInstrumentId() {
        return tradeableInstrumentId;
    }

    /**
     * The unique tradable instrument name.
     *
     * @return the SymbolName field
     */
    public SymbolNameField symbolName() {
        return symbolName;
    }

    /**
     * Additional instrument series information.
     *
     * @return the LongName field
     */
    public LongNameField longName() {
        return longName;
    }

    /**
     * Reserved for future use.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * Denotes the exchange identifier of the contract
     *
     * @return the Exchange field
     */
    public ExchangeField exchange() {
        return exchange;
    }

    /**
     * Denotes the instrument identifier of the contract.
     *
     * @return the Instrument field
     */
    public InstrumentField instrument() {
        return instrument;
    }

    /**
     * Indicates the type of security using ISO 10962 standard, CFI code values.
     *
     * @return the CfiCode field
     */
    public CfiCodeField cfiCode() {
        return cfiCode;
    }

    /**
     * Year of expiry (YYYY) for futures contract types, zero otherwise.
     *
     * @return the ExpiryYear field
     */
    public ExpiryYearField expiryYear() {
        return expiryYear;
    }

    /**
     * Month of expiry for futures contract types, zero otherwise.
     *
     * @return the ExpiryMonth field
     */
    public ExpiryMonthField expiryMonth() {
        return expiryMonth;
    }

    /**
     * Indicates the type of option
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
    }

    /**
     * Strike price of contract. Divide by the Strike Price Fractional Denominator to determine the floating point value.
     *
     * @return the Strike field
     */
    public StrikeField strike() {
        return strike;
    }

    /**
     * Identifier of the Underlying Tradeable Instrument (can be zero if underlying not defined).
     *
     * @return the UnderlyingTradeableInstrumentId field
     */
    public UnderlyingTradeableInstrumentIdField underlyingTradeableInstrumentId() {
        return underlyingTradeableInstrumentId;
    }

    /**
     * Suggested number of decimals to display the price at.
     *
     * @return the PriceDisplayDecimals field
     */
    public PriceDisplayDecimalsField priceDisplayDecimals() {
        return priceDisplayDecimals;
    }

    /**
     * Denominator of the price to yield the floating point price.
     *
     * @return the PriceFractionalDenominator field
     */
    public PriceFractionalDenominatorField priceFractionalDenominator() {
        return priceFractionalDenominator;
    }

    /**
     * Minimum tick size. Divide by the Price Fractional Denominator to determine the floating point value.
     *
     * @return the PriceMinimumTick field
     */
    public PriceMinimumTickField priceMinimumTick() {
        return priceMinimumTick;
    }

    /**
     * Number of decimals to display the strike price.
     *
     * @return the StrikePriceDecimalPosition field
     */
    public StrikePriceDecimalPositionField strikePriceDecimalPosition() {
        return strikePriceDecimalPosition;
    }

    /**
     * Denominator of the Strike Price to yield the floating point strike price.
     *
     * @return the StrikePriceFractionalDenominator field
     */
    public StrikePriceFractionalDenominatorField strikePriceFractionalDenominator() {
        return strikePriceFractionalDenominator;
    }

    /**
     * Minimum tick size for the Strike Price. Divide by the Strike Price Fractional Denominator to determine the floating point value.
     *
     * @return the StrikePriceMinimumTick field
     */
    public StrikePriceMinimumTickField strikePriceMinimumTick() {
        return strikePriceMinimumTick;
    }

    /**
     * The Last Trading Day as specified in the ASX 24 Contract Specifications. Reported in Unix Time (number of seconds since 00:00 1 January 1970 GMT). Convert to AEST/ADST as appropriate to determine the date.
     *
     * @return the LastTradingDate field
     */
    public LastTradingDateField lastTradingDate() {
        return lastTradingDate;
    }

    /**
     * Prior Day Settlement price. Divide by the Price Fractional Denominator to determine the floating point value.
     *
     * @return the PriorDaySettlement field
     */
    public PriorDaySettlementField priorDaySettlement() {
        return priorDaySettlement;
    }

    /**
     * Volatility for an option contract.
     *
     * @return the Volatility field
     */
    public VolatilityField volatility() {
        return volatility;
    }

    /**
     * Currency of contract.
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * The Contract Unit as specified in the ASX 24 Contract Specifications.
     *
     * @return the LotSizeOrFaceValue field
     */
    public LotSizeOrFaceValueField lotSizeOrFaceValue() {
        return lotSizeOrFaceValue;
    }

    /**
     * The number of days or years to maturity for bills or bonds as specified in the ASX 24 Contract Specifications.
     *
     * @return the MaturityValue field
     */
    public MaturityValueField maturityValue() {
        return maturityValue;
    }

    /**
     * The coupon percentage rate for bonds.
     *
     * @return the CouponRate field
     */
    public CouponRateField couponRate() {
        return couponRate;
    }

    /**
     * Number of payments per year for bonds.
     *
     * @return the PaymentsPerYear field
     */
    public PaymentsPerYearField paymentsPerYear() {
        return paymentsPerYear;
    }

    /**
     * Indicates the number of lots that represent a block lot for the order book.
     *
     * @return the BlockLotSize field
     */
    public BlockLotSizeField blockLotSize() {
        return blockLotSize;
    }

    /**
     * The Settlement Date as specified in the ASX 24 Contract Specifications. Reported in Unix Time (number of seconds since 00:00 1 January 1970 GMT). Convert to AEST/ADST as appropriate to determine the date.
     *
     * @return the ExpiryDate field
     */
    public ExpiryDateField expiryDate() {
        return expiryDate;
    }

    /**
     * Blank filled. Not available for ASX 24 products.
     *
     * @return the BasisOfQuotation field
     */
    public BasisOfQuotationField basisOfQuotation() {
        return basisOfQuotation;
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!tradeableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeableInstrumentIdField.BYTE_LENGTH;
        if (!symbolName.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolNameField.BYTE_LENGTH;
        if (!longName.parse(data, cursor)) {
            return false;
        }
        cursor += LongNameField.BYTE_LENGTH;
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
        if (!exchange.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeField.BYTE_LENGTH;
        if (!instrument.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentField.BYTE_LENGTH;
        if (!cfiCode.parse(data, cursor)) {
            return false;
        }
        cursor += CfiCodeField.BYTE_LENGTH;
        if (!expiryYear.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryYearField.BYTE_LENGTH;
        if (!expiryMonth.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryMonthField.BYTE_LENGTH;
        if (!optionType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionTypeField.BYTE_LENGTH;
        if (!strike.parse(data, cursor)) {
            return false;
        }
        cursor += StrikeField.BYTE_LENGTH;
        if (!underlyingTradeableInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingTradeableInstrumentIdField.BYTE_LENGTH;
        if (!priceDisplayDecimals.parse(data, cursor)) {
            return false;
        }
        cursor += PriceDisplayDecimalsField.BYTE_LENGTH;
        if (!priceFractionalDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += PriceFractionalDenominatorField.BYTE_LENGTH;
        if (!priceMinimumTick.parse(data, cursor)) {
            return false;
        }
        cursor += PriceMinimumTickField.BYTE_LENGTH;
        if (!strikePriceDecimalPosition.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceDecimalPositionField.BYTE_LENGTH;
        if (!strikePriceFractionalDenominator.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceFractionalDenominatorField.BYTE_LENGTH;
        if (!strikePriceMinimumTick.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceMinimumTickField.BYTE_LENGTH;
        if (!lastTradingDate.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradingDateField.BYTE_LENGTH;
        if (!priorDaySettlement.parse(data, cursor)) {
            return false;
        }
        cursor += PriorDaySettlementField.BYTE_LENGTH;
        if (!volatility.parse(data, cursor)) {
            return false;
        }
        cursor += VolatilityField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!lotSizeOrFaceValue.parse(data, cursor)) {
            return false;
        }
        cursor += LotSizeOrFaceValueField.BYTE_LENGTH;
        if (!maturityValue.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityValueField.BYTE_LENGTH;
        if (!couponRate.parse(data, cursor)) {
            return false;
        }
        cursor += CouponRateField.BYTE_LENGTH;
        if (!paymentsPerYear.parse(data, cursor)) {
            return false;
        }
        cursor += PaymentsPerYearField.BYTE_LENGTH;
        if (!blockLotSize.parse(data, cursor)) {
            return false;
        }
        cursor += BlockLotSizeField.BYTE_LENGTH;
        if (!expiryDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDateField.BYTE_LENGTH;
        return basisOfQuotation.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = tradeableInstrumentId.encode(data, cursor);
        cursor = symbolName.encode(data, cursor);
        cursor = longName.encode(data, cursor);
        cursor = isin.encode(data, cursor);
        cursor = exchange.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = cfiCode.encode(data, cursor);
        cursor = expiryYear.encode(data, cursor);
        cursor = expiryMonth.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = strike.encode(data, cursor);
        cursor = underlyingTradeableInstrumentId.encode(data, cursor);
        cursor = priceDisplayDecimals.encode(data, cursor);
        cursor = priceFractionalDenominator.encode(data, cursor);
        cursor = priceMinimumTick.encode(data, cursor);
        cursor = strikePriceDecimalPosition.encode(data, cursor);
        cursor = strikePriceFractionalDenominator.encode(data, cursor);
        cursor = strikePriceMinimumTick.encode(data, cursor);
        cursor = lastTradingDate.encode(data, cursor);
        cursor = priorDaySettlement.encode(data, cursor);
        cursor = volatility.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = lotSizeOrFaceValue.encode(data, cursor);
        cursor = maturityValue.encode(data, cursor);
        cursor = couponRate.encode(data, cursor);
        cursor = paymentsPerYear.encode(data, cursor);
        cursor = blockLotSize.encode(data, cursor);
        cursor = expiryDate.encode(data, cursor);
        cursor = basisOfQuotation.encode(data, cursor);
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "TradeDate" -> Optional.of(tradeDate);
            case "TradeableInstrumentId" -> Optional.of(tradeableInstrumentId);
            case "SymbolName" -> Optional.of(symbolName);
            case "LongName" -> Optional.of(longName);
            case "Isin" -> Optional.of(isin);
            case "Exchange" -> Optional.of(exchange);
            case "Instrument" -> Optional.of(instrument);
            case "CfiCode" -> Optional.of(cfiCode);
            case "ExpiryYear" -> Optional.of(expiryYear);
            case "ExpiryMonth" -> Optional.of(expiryMonth);
            case "OptionType" -> Optional.of(optionType);
            case "Strike" -> Optional.of(strike);
            case "UnderlyingTradeableInstrumentId" -> Optional.of(underlyingTradeableInstrumentId);
            case "PriceDisplayDecimals" -> Optional.of(priceDisplayDecimals);
            case "PriceFractionalDenominator" -> Optional.of(priceFractionalDenominator);
            case "PriceMinimumTick" -> Optional.of(priceMinimumTick);
            case "StrikePriceDecimalPosition" -> Optional.of(strikePriceDecimalPosition);
            case "StrikePriceFractionalDenominator" -> Optional.of(strikePriceFractionalDenominator);
            case "StrikePriceMinimumTick" -> Optional.of(strikePriceMinimumTick);
            case "LastTradingDate" -> Optional.of(lastTradingDate);
            case "PriorDaySettlement" -> Optional.of(priorDaySettlement);
            case "Volatility" -> Optional.of(volatility);
            case "Currency" -> Optional.of(currency);
            case "LotSizeOrFaceValue" -> Optional.of(lotSizeOrFaceValue);
            case "MaturityValue" -> Optional.of(maturityValue);
            case "CouponRate" -> Optional.of(couponRate);
            case "PaymentsPerYear" -> Optional.of(paymentsPerYear);
            case "BlockLotSize" -> Optional.of(blockLotSize);
            case "ExpiryDate" -> Optional.of(expiryDate);
            case "BasisOfQuotation" -> Optional.of(basisOfQuotation);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OptionsSymbolDirectoryMessage message)) {
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
        if (!(other instanceof OptionsSymbolDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
