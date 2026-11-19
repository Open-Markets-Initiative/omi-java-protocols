package omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.FixedRateFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.MaximumThresholdPriceOptionsFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.MinimumThresholdPriceOptionsFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.NotionalPrincipalAmountFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.TickIncrement;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.TickValueFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.CashFlowAlignmentDateField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ContractSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.CurrencyField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.DayCountConventionField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.DeliveryTypeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.EffectiveDateField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExpiryDayField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExpiryMonthSwapFutureField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExpiryYearField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExternalSymbolField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.FirstPaymentDateField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.FirstResetDateField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.GroupInstrumentField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.InitialEffectiveDateField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.InstrumentIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.MarketFlowField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.MaximumNumberOfContractsPerOrderField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.MinimumNumberOfContractsPerOrderField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.NextPaymentDateField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.NextResetDateField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.PaymentFrequencyField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.PreviousResetDateField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ResetFrequencyField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.RootSymbolField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.TenorField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.PrintOptions;

/**
 * Represents the SwapFutureInstrumentKeysMessage message from the SolaMulticast protocol.
 *
 * <p>Swap Future Instrument Keys message</p>
 */
public final class SwapFutureInstrumentKeysMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 172;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Swap Future Instrument Keys Message";

    /**
     * Exchange on which the trade occurred Q = Montreal
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Swap future base symbol
     */
    private final RootSymbolField rootSymbol = new RootSymbolField();

    /**
     * Expiry month code of the swap future Refer to Month Codes
     */
    private final ExpiryMonthSwapFutureField expiryMonthSwapFuture = new ExpiryMonthSwapFutureField();

    /**
     * Two last digits of the expiry year of the swap future
     */
    private final ExpiryYearField expiryYear = new ExpiryYearField();

    /**
     * Expiry day of the swap future
     */
    private final ExpiryDayField expiryDay = new ExpiryDayField();

    /**
     * The tenor of the swap future
     */
    private final TenorField tenor = new TenorField();

    /**
     * Maximum authorized number of contract per order
     */
    private final MaximumNumberOfContractsPerOrderField maximumNumberOfContractsPerOrder = new MaximumNumberOfContractsPerOrderField();

    /**
     * Minimum authorized number of contract per order
     */
    private final MinimumNumberOfContractsPerOrderField minimumNumberOfContractsPerOrder = new MinimumNumberOfContractsPerOrderField();

    /**
     * Defines the type of instruments
     */
    private final MarketFlowField marketFlow = new MarketFlowField();

    /**
     * group of the instrument
     */
    private final GroupInstrumentField groupInstrument = new GroupInstrumentField();

    /**
     * Instrument
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * External identifier used by traders when entering an order
     */
    private final ExternalSymbolField externalSymbol = new ExternalSymbolField();

    /**
     * Defines the quantity of an underlying per contract
     */
    private final ContractSizeField contractSize = new ContractSizeField();

    /**
     * Defines the currency of an underlying
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * The date when the swap contract becomes effective (YYMMDD)
     */
    private final EffectiveDateField effectiveDate = new EffectiveDateField();

    /**
     * The third Wednesday of the effective months (March, June, September, and December) (Quarterly IMM Dates (International Monetary Market Dates)). This date will be different from the Effective Date if it falls on a non-business date (YYMMDD)
     */
    private final InitialEffectiveDateField initialEffectiveDate = new InitialEffectiveDateField();

    /**
     * The date used to set up the Payment and Reset Dates of the contract (YYMMDD)
     */
    private final CashFlowAlignmentDateField cashFlowAlignmentDate = new CashFlowAlignmentDateField();

    /**
     * Frequency on which Payment Dates are defined
     */
    private final PaymentFrequencyField paymentFrequency = new PaymentFrequencyField();

    /**
     * Frequency on which Reset Dates are defined
     */
    private final ResetFrequencyField resetFrequency = new ResetFrequencyField();

    /**
     * Convention used in the swap future contract settlement price calculations:
     */
    private final DayCountConventionField dayCountConvention = new DayCountConventionField();

    /**
     * The date when the first payment is made (YYMMDD)
     */
    private final FirstPaymentDateField firstPaymentDate = new FirstPaymentDateField();

    /**
     * The date when the next payment will be made (YYMMDD)
     */
    private final NextPaymentDateField nextPaymentDate = new NextPaymentDateField();

    /**
     * The date when the floating rate is set for the first time (YYMMDD)
     */
    private final FirstResetDateField firstResetDate = new FirstResetDateField();

    /**
     * The date when the next floating rate will be set (YYMMDD)
     */
    private final NextResetDateField nextResetDate = new NextResetDateField();

    /**
     * The date when the previous floating rate was set. When the current date is a Reset Date, the previous Reset Date will be the current date (YYMMDD)
     */
    private final PreviousResetDateField previousResetDate = new PreviousResetDateField();

    /**
     * Indicates the delivery type of the instrument
     */
    private final DeliveryTypeField deliveryType = new DeliveryTypeField();

    /**
     * Branch
     */
    private final FixedRateFractionPair fixedRateFractionPair = new FixedRateFractionPair();

    /**
     * Branch
     */
    private final MaximumThresholdPriceOptionsFractionPair maximumThresholdPriceOptionsFractionPair = new MaximumThresholdPriceOptionsFractionPair();

    /**
     * Branch
     */
    private final MinimumThresholdPriceOptionsFractionPair minimumThresholdPriceOptionsFractionPair = new MinimumThresholdPriceOptionsFractionPair();

    /**
     * Contains the Tick Table Short Name if available. If so, field starts with TT=. Otherwise, indicates precision with which the price of an order limit can be expressed
     */
    private final TickIncrement tickIncrement = new TickIncrement();

    /**
     * Branch
     */
    private final TickValueFractionPair tickValueFractionPair = new TickValueFractionPair();

    /**
     * Branch
     */
    private final NotionalPrincipalAmountFractionPair notionalPrincipalAmountFractionPair = new NotionalPrincipalAmountFractionPair();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, rootSymbol, expiryMonthSwapFuture, expiryYear, expiryDay, tenor, maximumNumberOfContractsPerOrder, minimumNumberOfContractsPerOrder, marketFlow, groupInstrument, instrumentId, externalSymbol, contractSize, currency, effectiveDate, initialEffectiveDate, cashFlowAlignmentDate, paymentFrequency, resetFrequency, dayCountConvention, firstPaymentDate, nextPaymentDate, firstResetDate, nextResetDate, previousResetDate, deliveryType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange on which the trade occurred Q = Montreal
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Swap future base symbol
     *
     * @return the RootSymbol field
     */
    public RootSymbolField rootSymbol() {
        return rootSymbol;
    }

    /**
     * Expiry month code of the swap future Refer to Month Codes
     *
     * @return the ExpiryMonthSwapFuture field
     */
    public ExpiryMonthSwapFutureField expiryMonthSwapFuture() {
        return expiryMonthSwapFuture;
    }

    /**
     * Two last digits of the expiry year of the swap future
     *
     * @return the ExpiryYear field
     */
    public ExpiryYearField expiryYear() {
        return expiryYear;
    }

    /**
     * Expiry day of the swap future
     *
     * @return the ExpiryDay field
     */
    public ExpiryDayField expiryDay() {
        return expiryDay;
    }

    /**
     * The tenor of the swap future
     *
     * @return the Tenor field
     */
    public TenorField tenor() {
        return tenor;
    }

    /**
     * Maximum authorized number of contract per order
     *
     * @return the MaximumNumberOfContractsPerOrder field
     */
    public MaximumNumberOfContractsPerOrderField maximumNumberOfContractsPerOrder() {
        return maximumNumberOfContractsPerOrder;
    }

    /**
     * Minimum authorized number of contract per order
     *
     * @return the MinimumNumberOfContractsPerOrder field
     */
    public MinimumNumberOfContractsPerOrderField minimumNumberOfContractsPerOrder() {
        return minimumNumberOfContractsPerOrder;
    }

    /**
     * Defines the type of instruments
     *
     * @return the MarketFlow field
     */
    public MarketFlowField marketFlow() {
        return marketFlow;
    }

    /**
     * group of the instrument
     *
     * @return the GroupInstrument field
     */
    public GroupInstrumentField groupInstrument() {
        return groupInstrument;
    }

    /**
     * Instrument
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * External identifier used by traders when entering an order
     *
     * @return the ExternalSymbol field
     */
    public ExternalSymbolField externalSymbol() {
        return externalSymbol;
    }

    /**
     * Defines the quantity of an underlying per contract
     *
     * @return the ContractSize field
     */
    public ContractSizeField contractSize() {
        return contractSize;
    }

    /**
     * Defines the currency of an underlying
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * The date when the swap contract becomes effective (YYMMDD)
     *
     * @return the EffectiveDate field
     */
    public EffectiveDateField effectiveDate() {
        return effectiveDate;
    }

    /**
     * The third Wednesday of the effective months (March, June, September, and December) (Quarterly IMM Dates (International Monetary Market Dates)). This date will be different from the Effective Date if it falls on a non-business date (YYMMDD)
     *
     * @return the InitialEffectiveDate field
     */
    public InitialEffectiveDateField initialEffectiveDate() {
        return initialEffectiveDate;
    }

    /**
     * The date used to set up the Payment and Reset Dates of the contract (YYMMDD)
     *
     * @return the CashFlowAlignmentDate field
     */
    public CashFlowAlignmentDateField cashFlowAlignmentDate() {
        return cashFlowAlignmentDate;
    }

    /**
     * Frequency on which Payment Dates are defined
     *
     * @return the PaymentFrequency field
     */
    public PaymentFrequencyField paymentFrequency() {
        return paymentFrequency;
    }

    /**
     * Frequency on which Reset Dates are defined
     *
     * @return the ResetFrequency field
     */
    public ResetFrequencyField resetFrequency() {
        return resetFrequency;
    }

    /**
     * Convention used in the swap future contract settlement price calculations:
     *
     * @return the DayCountConvention field
     */
    public DayCountConventionField dayCountConvention() {
        return dayCountConvention;
    }

    /**
     * The date when the first payment is made (YYMMDD)
     *
     * @return the FirstPaymentDate field
     */
    public FirstPaymentDateField firstPaymentDate() {
        return firstPaymentDate;
    }

    /**
     * The date when the next payment will be made (YYMMDD)
     *
     * @return the NextPaymentDate field
     */
    public NextPaymentDateField nextPaymentDate() {
        return nextPaymentDate;
    }

    /**
     * The date when the floating rate is set for the first time (YYMMDD)
     *
     * @return the FirstResetDate field
     */
    public FirstResetDateField firstResetDate() {
        return firstResetDate;
    }

    /**
     * The date when the next floating rate will be set (YYMMDD)
     *
     * @return the NextResetDate field
     */
    public NextResetDateField nextResetDate() {
        return nextResetDate;
    }

    /**
     * The date when the previous floating rate was set. When the current date is a Reset Date, the previous Reset Date will be the current date (YYMMDD)
     *
     * @return the PreviousResetDate field
     */
    public PreviousResetDateField previousResetDate() {
        return previousResetDate;
    }

    /**
     * Indicates the delivery type of the instrument
     *
     * @return the DeliveryType field
     */
    public DeliveryTypeField deliveryType() {
        return deliveryType;
    }

    /**
     * Branch
     *
     * @return the FixedRateFractionPair record
     */
    public FixedRateFractionPair fixedRateFractionPair() {
        return fixedRateFractionPair;
    }

    /**
     * Branch
     *
     * @return the MaximumThresholdPriceOptionsFractionPair record
     */
    public MaximumThresholdPriceOptionsFractionPair maximumThresholdPriceOptionsFractionPair() {
        return maximumThresholdPriceOptionsFractionPair;
    }

    /**
     * Branch
     *
     * @return the MinimumThresholdPriceOptionsFractionPair record
     */
    public MinimumThresholdPriceOptionsFractionPair minimumThresholdPriceOptionsFractionPair() {
        return minimumThresholdPriceOptionsFractionPair;
    }

    /**
     * Contains the Tick Table Short Name if available. If so, field starts with TT=. Otherwise, indicates precision with which the price of an order limit can be expressed
     *
     * @return the TickIncrement record
     */
    public TickIncrement tickIncrement() {
        return tickIncrement;
    }

    /**
     * Branch
     *
     * @return the TickValueFractionPair record
     */
    public TickValueFractionPair tickValueFractionPair() {
        return tickValueFractionPair;
    }

    /**
     * Branch
     *
     * @return the NotionalPrincipalAmountFractionPair record
     */
    public NotionalPrincipalAmountFractionPair notionalPrincipalAmountFractionPair() {
        return notionalPrincipalAmountFractionPair;
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!rootSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += RootSymbolField.BYTE_LENGTH;
        if (!expiryMonthSwapFuture.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryMonthSwapFutureField.BYTE_LENGTH;
        if (!expiryYear.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryYearField.BYTE_LENGTH;
        if (!expiryDay.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDayField.BYTE_LENGTH;
        if (!tenor.parse(data, cursor)) {
            return false;
        }
        cursor += TenorField.BYTE_LENGTH;
        if (!fixedRateFractionPair.parseFrom(data, cursor, end - 152)) {
            return false;
        }
        cursor += fixedRateFractionPair.byteLength();
        if (!maximumNumberOfContractsPerOrder.parse(data, cursor)) {
            return false;
        }
        cursor += MaximumNumberOfContractsPerOrderField.BYTE_LENGTH;
        if (!minimumNumberOfContractsPerOrder.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumNumberOfContractsPerOrderField.BYTE_LENGTH;
        if (!maximumThresholdPriceOptionsFractionPair.parseFrom(data, cursor, end - 133)) {
            return false;
        }
        cursor += maximumThresholdPriceOptionsFractionPair.byteLength();
        if (!minimumThresholdPriceOptionsFractionPair.parseFrom(data, cursor, end - 126)) {
            return false;
        }
        cursor += minimumThresholdPriceOptionsFractionPair.byteLength();
        if (!tickIncrement.parseFrom(data, cursor, end - 119)) {
            return false;
        }
        cursor += tickIncrement.byteLength();
        if (!marketFlow.parse(data, cursor)) {
            return false;
        }
        cursor += MarketFlowField.BYTE_LENGTH;
        if (!groupInstrument.parse(data, cursor)) {
            return false;
        }
        cursor += GroupInstrumentField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!externalSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += ExternalSymbolField.BYTE_LENGTH;
        if (!contractSize.parse(data, cursor)) {
            return false;
        }
        cursor += ContractSizeField.BYTE_LENGTH;
        if (!tickValueFractionPair.parseFrom(data, cursor, end - 66)) {
            return false;
        }
        cursor += tickValueFractionPair.byteLength();
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!effectiveDate.parse(data, cursor)) {
            return false;
        }
        cursor += EffectiveDateField.BYTE_LENGTH;
        if (!initialEffectiveDate.parse(data, cursor)) {
            return false;
        }
        cursor += InitialEffectiveDateField.BYTE_LENGTH;
        if (!cashFlowAlignmentDate.parse(data, cursor)) {
            return false;
        }
        cursor += CashFlowAlignmentDateField.BYTE_LENGTH;
        if (!paymentFrequency.parse(data, cursor)) {
            return false;
        }
        cursor += PaymentFrequencyField.BYTE_LENGTH;
        if (!resetFrequency.parse(data, cursor)) {
            return false;
        }
        cursor += ResetFrequencyField.BYTE_LENGTH;
        if (!notionalPrincipalAmountFractionPair.parseFrom(data, cursor, end - 32)) {
            return false;
        }
        cursor += notionalPrincipalAmountFractionPair.byteLength();
        if (!dayCountConvention.parse(data, cursor)) {
            return false;
        }
        cursor += DayCountConventionField.BYTE_LENGTH;
        if (!firstPaymentDate.parse(data, cursor)) {
            return false;
        }
        cursor += FirstPaymentDateField.BYTE_LENGTH;
        if (!nextPaymentDate.parse(data, cursor)) {
            return false;
        }
        cursor += NextPaymentDateField.BYTE_LENGTH;
        if (!firstResetDate.parse(data, cursor)) {
            return false;
        }
        cursor += FirstResetDateField.BYTE_LENGTH;
        if (!nextResetDate.parse(data, cursor)) {
            return false;
        }
        cursor += NextResetDateField.BYTE_LENGTH;
        if (!previousResetDate.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousResetDateField.BYTE_LENGTH;
        return deliveryType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = rootSymbol.encode(data, cursor);
        cursor = expiryMonthSwapFuture.encode(data, cursor);
        cursor = expiryYear.encode(data, cursor);
        cursor = expiryDay.encode(data, cursor);
        cursor = tenor.encode(data, cursor);
        cursor = fixedRateFractionPair.encode(data, cursor);
        cursor = maximumNumberOfContractsPerOrder.encode(data, cursor);
        cursor = minimumNumberOfContractsPerOrder.encode(data, cursor);
        cursor = maximumThresholdPriceOptionsFractionPair.encode(data, cursor);
        cursor = minimumThresholdPriceOptionsFractionPair.encode(data, cursor);
        cursor = tickIncrement.encode(data, cursor);
        cursor = marketFlow.encode(data, cursor);
        cursor = groupInstrument.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = externalSymbol.encode(data, cursor);
        cursor = contractSize.encode(data, cursor);
        cursor = tickValueFractionPair.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = effectiveDate.encode(data, cursor);
        cursor = initialEffectiveDate.encode(data, cursor);
        cursor = cashFlowAlignmentDate.encode(data, cursor);
        cursor = paymentFrequency.encode(data, cursor);
        cursor = resetFrequency.encode(data, cursor);
        cursor = notionalPrincipalAmountFractionPair.encode(data, cursor);
        cursor = dayCountConvention.encode(data, cursor);
        cursor = firstPaymentDate.encode(data, cursor);
        cursor = nextPaymentDate.encode(data, cursor);
        cursor = firstResetDate.encode(data, cursor);
        cursor = nextResetDate.encode(data, cursor);
        cursor = previousResetDate.encode(data, cursor);
        cursor = deliveryType.encode(data, cursor);
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
        fixedRateFractionPair.clear();
        maximumThresholdPriceOptionsFractionPair.clear();
        minimumThresholdPriceOptionsFractionPair.clear();
        tickIncrement.clear();
        tickValueFractionPair.clear();
        notionalPrincipalAmountFractionPair.clear();
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
        if (!fixedRateFractionPair.isRecognized()) {
            return false;
        }
        if (!maximumThresholdPriceOptionsFractionPair.isRecognized()) {
            return false;
        }
        if (!minimumThresholdPriceOptionsFractionPair.isRecognized()) {
            return false;
        }
        if (!tickIncrement.isRecognized()) {
            return false;
        }
        if (!tickValueFractionPair.isRecognized()) {
            return false;
        }
        return notionalPrincipalAmountFractionPair.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!fixedRateFractionPair.isValid()) {
            return false;
        }
        if (!maximumThresholdPriceOptionsFractionPair.isValid()) {
            return false;
        }
        if (!minimumThresholdPriceOptionsFractionPair.isValid()) {
            return false;
        }
        if (!tickIncrement.isValid()) {
            return false;
        }
        if (!tickValueFractionPair.isValid()) {
            return false;
        }
        if (!notionalPrincipalAmountFractionPair.isValid()) {
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
            case "ExchangeId" -> Optional.of(exchangeId);
            case "RootSymbol" -> Optional.of(rootSymbol);
            case "ExpiryMonthSwapFuture" -> Optional.of(expiryMonthSwapFuture);
            case "ExpiryYear" -> Optional.of(expiryYear);
            case "ExpiryDay" -> Optional.of(expiryDay);
            case "Tenor" -> Optional.of(tenor);
            case "MaximumNumberOfContractsPerOrder" -> Optional.of(maximumNumberOfContractsPerOrder);
            case "MinimumNumberOfContractsPerOrder" -> Optional.of(minimumNumberOfContractsPerOrder);
            case "MarketFlow" -> Optional.of(marketFlow);
            case "GroupInstrument" -> Optional.of(groupInstrument);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "ExternalSymbol" -> Optional.of(externalSymbol);
            case "ContractSize" -> Optional.of(contractSize);
            case "Currency" -> Optional.of(currency);
            case "EffectiveDate" -> Optional.of(effectiveDate);
            case "InitialEffectiveDate" -> Optional.of(initialEffectiveDate);
            case "CashFlowAlignmentDate" -> Optional.of(cashFlowAlignmentDate);
            case "PaymentFrequency" -> Optional.of(paymentFrequency);
            case "ResetFrequency" -> Optional.of(resetFrequency);
            case "DayCountConvention" -> Optional.of(dayCountConvention);
            case "FirstPaymentDate" -> Optional.of(firstPaymentDate);
            case "NextPaymentDate" -> Optional.of(nextPaymentDate);
            case "FirstResetDate" -> Optional.of(firstResetDate);
            case "NextResetDate" -> Optional.of(nextResetDate);
            case "PreviousResetDate" -> Optional.of(previousResetDate);
            case "DeliveryType" -> Optional.of(deliveryType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SwapFutureInstrumentKeysMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(fixedRateFractionPair.diffFields(message.fixedRateFractionPair));
        changed.addAll(maximumThresholdPriceOptionsFractionPair.diffFields(message.maximumThresholdPriceOptionsFractionPair));
        changed.addAll(minimumThresholdPriceOptionsFractionPair.diffFields(message.minimumThresholdPriceOptionsFractionPair));
        changed.addAll(tickIncrement.diffFields(message.tickIncrement));
        changed.addAll(tickValueFractionPair.diffFields(message.tickValueFractionPair));
        changed.addAll(notionalPrincipalAmountFractionPair.diffFields(message.notionalPrincipalAmountFractionPair));
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
            builder.append(", ");
            fixedRateFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            maximumThresholdPriceOptionsFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            minimumThresholdPriceOptionsFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            tickIncrement.toFormattedString(builder, options);
            builder.append(", ");
            tickValueFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            notionalPrincipalAmountFractionPair.toFormattedString(builder, options);
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
        fixedRateFractionPair.toFormattedString(builder, nested);
        maximumThresholdPriceOptionsFractionPair.toFormattedString(builder, nested);
        minimumThresholdPriceOptionsFractionPair.toFormattedString(builder, nested);
        tickIncrement.toFormattedString(builder, nested);
        tickValueFractionPair.toFormattedString(builder, nested);
        notionalPrincipalAmountFractionPair.toFormattedString(builder, nested);
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
        if (!(other instanceof SwapFutureInstrumentKeysMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && fixedRateFractionPair.equals(message.fixedRateFractionPair) && maximumThresholdPriceOptionsFractionPair.equals(message.maximumThresholdPriceOptionsFractionPair) && minimumThresholdPriceOptionsFractionPair.equals(message.minimumThresholdPriceOptionsFractionPair) && tickIncrement.equals(message.tickIncrement) && tickValueFractionPair.equals(message.tickValueFractionPair) && notionalPrincipalAmountFractionPair.equals(message.notionalPrincipalAmountFractionPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, fixedRateFractionPair, maximumThresholdPriceOptionsFractionPair, minimumThresholdPriceOptionsFractionPair, tickIncrement, tickValueFractionPair, notionalPrincipalAmountFractionPair);
    }
}
