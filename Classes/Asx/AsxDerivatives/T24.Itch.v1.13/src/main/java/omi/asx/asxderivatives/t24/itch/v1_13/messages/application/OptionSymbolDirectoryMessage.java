package omi.asx.asxderivatives.t24.itch.v1_13.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.ActivatedField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.ContractNumberField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.ContractTypeField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.CouponRateField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.CurrencyField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.ExchangeField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.ExpiryMonthField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.ExpiryYearField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.FinancialTypeField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.InstrumentField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.LastTradingDateField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.LotSizeOrFaceValueField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.MaturityValueField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.NanosecondsField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.OptionTypeField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.PaymentsPerYearField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.PriceDecimalPositionField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.PriceFractionalDenominatorField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.PriceMinimumTickField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.PriorDaySettlementField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.StrikeField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.StrikePriceDecimalPositionField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.StrikePriceFractionalDenominatorField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.StrikePriceMinimumTickField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.TradeDateField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.UnderlyingContractNumberField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.VolatilityField;
import omi.asx.asxderivatives.t24.itch.v1_13.types.Field;
import omi.asx.asxderivatives.t24.itch.v1_13.types.Message;
import omi.asx.asxderivatives.t24.itch.v1_13.types.PrintOptions;

/**
 * Represents the OptionSymbolDirectoryMessage message from the T24 protocol.
 *
 * <p>As each product moves to the new Trade Date, ASX Trade24 will disseminate the option symbol messages defining all the available options contracts. For Single Session Options only, the exchange can activate or de-activate option symbols during the course of trading by issuing Order Book State messages for affected option contracts. If an option symbol is not active (Activated field is ‘N’) or is de-activated (Trading Status is “I”), reference to that option contract should be removed from the list of actively traded contracts. If an option symbol is active (Activated field is ‘Y’) or is activated (Trading Status is “A”), reference to that option contract should be added to the list of actively traded contracts.</p>
 */
public final class OptionSymbolDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'h';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 74;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Option Symbol Directory Message";

    /**
     * Nanoseconds portion of the timestamp.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Trade Date of event as applicable, if Event Code is “P” or “R”, applies to all active trade dates.
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Contract Number Field Element Identifier
     */
    private final ContractNumberField contractNumber = new ContractNumberField();

    /**
     * Denotes the exchange identifier of the contract
     */
    private final ExchangeField exchange = new ExchangeField();

    /**
     * Denotes the instrument identifier of the contract
     */
    private final InstrumentField instrument = new InstrumentField();

    /**
     * Indicates the type of contract.
     */
    private final ContractTypeField contractType = new ContractTypeField();

    /**
     * Year of expiry (YYYY) for Contract Type “F”, zero otherwise
     */
    private final ExpiryYearField expiryYear = new ExpiryYearField();

    /**
     * Month of expiry for Contract Types, zero otherwise
     */
    private final ExpiryMonthField expiryMonth = new ExpiryMonthField();

    /**
     * Indicates the type of option “P” – Put Option or “C” – Call Option.
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * Strike price of contract.
     */
    private final StrikeField strike = new StrikeField();

    /**
     * Underlying Future Contract Number (zero if Contract Type “E”).
     */
    private final UnderlyingContractNumberField underlyingContractNumber = new UnderlyingContractNumberField();

    /**
     * Position of the decimal point in the price
     */
    private final PriceDecimalPositionField priceDecimalPosition = new PriceDecimalPositionField();

    /**
     * Denominator of the fractional part
     */
    private final PriceFractionalDenominatorField priceFractionalDenominator = new PriceFractionalDenominatorField();

    /**
     * Minimum tick size
     */
    private final PriceMinimumTickField priceMinimumTick = new PriceMinimumTickField();

    /**
     * Position of the decimal point in the price.
     */
    private final StrikePriceDecimalPositionField strikePriceDecimalPosition = new StrikePriceDecimalPositionField();

    /**
     * Denominator of the fractional part.
     */
    private final StrikePriceFractionalDenominatorField strikePriceFractionalDenominator = new StrikePriceFractionalDenominatorField();

    /**
     * Minimum tick size for the Strike Price.
     */
    private final StrikePriceMinimumTickField strikePriceMinimumTick = new StrikePriceMinimumTickField();

    /**
     * Last Trading Date and Time. Applicable to Contract Types “F” only, zero otherwise. Note where the time is defined, it is local time AEST or ADST depending if the expiry date is during AEST or ADST.
     */
    private final LastTradingDateField lastTradingDate = new LastTradingDateField();

    /**
     * Prior Day Settlement price
     */
    private final PriorDaySettlementField priorDaySettlement = new PriorDaySettlementField();

    /**
     * Implied 3 decimal volatility for an option, i.e. 12345 is 12.345%.
     */
    private final VolatilityField volatility = new VolatilityField();

    /**
     * Indicates the how to valuate a contract.
     */
    private final FinancialTypeField financialType = new FinancialTypeField();

    /**
     * Currency of contract
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Size of each lot or face value of each lot
     */
    private final LotSizeOrFaceValueField lotSizeOrFaceValue = new LotSizeOrFaceValueField();

    /**
     * Number of days or years to maturity for bills or bonds, Financial Type is “X” or “B”
     */
    private final MaturityValueField maturityValue = new MaturityValueField();

    /**
     * Implied 2 decimal value indicating the coupon rate for bonds, e.g. 1234=12.34%, Financial Type is “X” only
     */
    private final CouponRateField couponRate = new CouponRateField();

    /**
     * Number payments per year for bonds, Financial Type is “X” only
     */
    private final PaymentsPerYearField paymentsPerYear = new PaymentsPerYearField();

    /**
     * For single session options only, “Y” indicates strike is active or is activated, “N” indicates strike is inactive or is deactivated.
     */
    private final ActivatedField activated = new ActivatedField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, tradeDate, contractNumber, exchange, instrument, contractType, expiryYear, expiryMonth, optionType, strike, underlyingContractNumber, priceDecimalPosition, priceFractionalDenominator, priceMinimumTick, strikePriceDecimalPosition, strikePriceFractionalDenominator, strikePriceMinimumTick, lastTradingDate, priorDaySettlement, volatility, financialType, currency, lotSizeOrFaceValue, maturityValue, couponRate, paymentsPerYear, activated);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the timestamp.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Trade Date of event as applicable, if Event Code is “P” or “R”, applies to all active trade dates.
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Contract Number Field Element Identifier
     *
     * @return the ContractNumber field
     */
    public ContractNumberField contractNumber() {
        return contractNumber;
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
     * Denotes the instrument identifier of the contract
     *
     * @return the Instrument field
     */
    public InstrumentField instrument() {
        return instrument;
    }

    /**
     * Indicates the type of contract.
     *
     * @return the ContractType field
     */
    public ContractTypeField contractType() {
        return contractType;
    }

    /**
     * Year of expiry (YYYY) for Contract Type “F”, zero otherwise
     *
     * @return the ExpiryYear field
     */
    public ExpiryYearField expiryYear() {
        return expiryYear;
    }

    /**
     * Month of expiry for Contract Types, zero otherwise
     *
     * @return the ExpiryMonth field
     */
    public ExpiryMonthField expiryMonth() {
        return expiryMonth;
    }

    /**
     * Indicates the type of option “P” – Put Option or “C” – Call Option.
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
    }

    /**
     * Strike price of contract.
     *
     * @return the Strike field
     */
    public StrikeField strike() {
        return strike;
    }

    /**
     * Underlying Future Contract Number (zero if Contract Type “E”).
     *
     * @return the UnderlyingContractNumber field
     */
    public UnderlyingContractNumberField underlyingContractNumber() {
        return underlyingContractNumber;
    }

    /**
     * Position of the decimal point in the price
     *
     * @return the PriceDecimalPosition field
     */
    public PriceDecimalPositionField priceDecimalPosition() {
        return priceDecimalPosition;
    }

    /**
     * Denominator of the fractional part
     *
     * @return the PriceFractionalDenominator field
     */
    public PriceFractionalDenominatorField priceFractionalDenominator() {
        return priceFractionalDenominator;
    }

    /**
     * Minimum tick size
     *
     * @return the PriceMinimumTick field
     */
    public PriceMinimumTickField priceMinimumTick() {
        return priceMinimumTick;
    }

    /**
     * Position of the decimal point in the price.
     *
     * @return the StrikePriceDecimalPosition field
     */
    public StrikePriceDecimalPositionField strikePriceDecimalPosition() {
        return strikePriceDecimalPosition;
    }

    /**
     * Denominator of the fractional part.
     *
     * @return the StrikePriceFractionalDenominator field
     */
    public StrikePriceFractionalDenominatorField strikePriceFractionalDenominator() {
        return strikePriceFractionalDenominator;
    }

    /**
     * Minimum tick size for the Strike Price.
     *
     * @return the StrikePriceMinimumTick field
     */
    public StrikePriceMinimumTickField strikePriceMinimumTick() {
        return strikePriceMinimumTick;
    }

    /**
     * Last Trading Date and Time. Applicable to Contract Types “F” only, zero otherwise. Note where the time is defined, it is local time AEST or ADST depending if the expiry date is during AEST or ADST.
     *
     * @return the LastTradingDate field
     */
    public LastTradingDateField lastTradingDate() {
        return lastTradingDate;
    }

    /**
     * Prior Day Settlement price
     *
     * @return the PriorDaySettlement field
     */
    public PriorDaySettlementField priorDaySettlement() {
        return priorDaySettlement;
    }

    /**
     * Implied 3 decimal volatility for an option, i.e. 12345 is 12.345%.
     *
     * @return the Volatility field
     */
    public VolatilityField volatility() {
        return volatility;
    }

    /**
     * Indicates the how to valuate a contract.
     *
     * @return the FinancialType field
     */
    public FinancialTypeField financialType() {
        return financialType;
    }

    /**
     * Currency of contract
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Size of each lot or face value of each lot
     *
     * @return the LotSizeOrFaceValue field
     */
    public LotSizeOrFaceValueField lotSizeOrFaceValue() {
        return lotSizeOrFaceValue;
    }

    /**
     * Number of days or years to maturity for bills or bonds, Financial Type is “X” or “B”
     *
     * @return the MaturityValue field
     */
    public MaturityValueField maturityValue() {
        return maturityValue;
    }

    /**
     * Implied 2 decimal value indicating the coupon rate for bonds, e.g. 1234=12.34%, Financial Type is “X” only
     *
     * @return the CouponRate field
     */
    public CouponRateField couponRate() {
        return couponRate;
    }

    /**
     * Number payments per year for bonds, Financial Type is “X” only
     *
     * @return the PaymentsPerYear field
     */
    public PaymentsPerYearField paymentsPerYear() {
        return paymentsPerYear;
    }

    /**
     * For single session options only, “Y” indicates strike is active or is activated, “N” indicates strike is inactive or is deactivated.
     *
     * @return the Activated field
     */
    public ActivatedField activated() {
        return activated;
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
        if (!contractNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ContractNumberField.BYTE_LENGTH;
        if (!exchange.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeField.BYTE_LENGTH;
        if (!instrument.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentField.BYTE_LENGTH;
        if (!contractType.parse(data, cursor)) {
            return false;
        }
        cursor += ContractTypeField.BYTE_LENGTH;
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
        if (!underlyingContractNumber.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingContractNumberField.BYTE_LENGTH;
        if (!priceDecimalPosition.parse(data, cursor)) {
            return false;
        }
        cursor += PriceDecimalPositionField.BYTE_LENGTH;
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
        if (!financialType.parse(data, cursor)) {
            return false;
        }
        cursor += FinancialTypeField.BYTE_LENGTH;
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
        return activated.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = contractNumber.encode(data, cursor);
        cursor = exchange.encode(data, cursor);
        cursor = instrument.encode(data, cursor);
        cursor = contractType.encode(data, cursor);
        cursor = expiryYear.encode(data, cursor);
        cursor = expiryMonth.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = strike.encode(data, cursor);
        cursor = underlyingContractNumber.encode(data, cursor);
        cursor = priceDecimalPosition.encode(data, cursor);
        cursor = priceFractionalDenominator.encode(data, cursor);
        cursor = priceMinimumTick.encode(data, cursor);
        cursor = strikePriceDecimalPosition.encode(data, cursor);
        cursor = strikePriceFractionalDenominator.encode(data, cursor);
        cursor = strikePriceMinimumTick.encode(data, cursor);
        cursor = lastTradingDate.encode(data, cursor);
        cursor = priorDaySettlement.encode(data, cursor);
        cursor = volatility.encode(data, cursor);
        cursor = financialType.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = lotSizeOrFaceValue.encode(data, cursor);
        cursor = maturityValue.encode(data, cursor);
        cursor = couponRate.encode(data, cursor);
        cursor = paymentsPerYear.encode(data, cursor);
        cursor = activated.encode(data, cursor);
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
            case "ContractNumber" -> Optional.of(contractNumber);
            case "Exchange" -> Optional.of(exchange);
            case "Instrument" -> Optional.of(instrument);
            case "ContractType" -> Optional.of(contractType);
            case "ExpiryYear" -> Optional.of(expiryYear);
            case "ExpiryMonth" -> Optional.of(expiryMonth);
            case "OptionType" -> Optional.of(optionType);
            case "Strike" -> Optional.of(strike);
            case "UnderlyingContractNumber" -> Optional.of(underlyingContractNumber);
            case "PriceDecimalPosition" -> Optional.of(priceDecimalPosition);
            case "PriceFractionalDenominator" -> Optional.of(priceFractionalDenominator);
            case "PriceMinimumTick" -> Optional.of(priceMinimumTick);
            case "StrikePriceDecimalPosition" -> Optional.of(strikePriceDecimalPosition);
            case "StrikePriceFractionalDenominator" -> Optional.of(strikePriceFractionalDenominator);
            case "StrikePriceMinimumTick" -> Optional.of(strikePriceMinimumTick);
            case "LastTradingDate" -> Optional.of(lastTradingDate);
            case "PriorDaySettlement" -> Optional.of(priorDaySettlement);
            case "Volatility" -> Optional.of(volatility);
            case "FinancialType" -> Optional.of(financialType);
            case "Currency" -> Optional.of(currency);
            case "LotSizeOrFaceValue" -> Optional.of(lotSizeOrFaceValue);
            case "MaturityValue" -> Optional.of(maturityValue);
            case "CouponRate" -> Optional.of(couponRate);
            case "PaymentsPerYear" -> Optional.of(paymentsPerYear);
            case "Activated" -> Optional.of(activated);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OptionSymbolDirectoryMessage message)) {
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
        if (!(other instanceof OptionSymbolDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
