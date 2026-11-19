package omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.AgreementDateField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.AgreementTimeField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.InstrumentIdentificationCodeField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.InstrumentIdentificationCodeTypeField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.MmtTradeFlagsField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.NotationOfTheQuantityInMeasurementUnitField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.NotionalAmountField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.NotionalAmountFractionField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.NotionalCurrencyField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.PriceCurrencyField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.PriceFractionField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.PriceNotationField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.PriceOtcField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.QuantityField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.QuantityFractionField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.QuantityInMeasurementUnitField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.QuantityInMeasurementUnitFractionField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.ThirdCountryTradingVenueOfExecutionField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.TimestampField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.TrackingNumberField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.TradeTypeField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.TransactionIdentifierCodeField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.TransactionToBeClearedField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.TypeField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.fields.VenueOfExecutionField;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.types.Field;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.types.Message;
import omi.nasdaq.nordicequities.lastsale.itch.v1_2_11.types.PrintOptions;

/**
 * Represents the OtcTradeMessage message from the LastSale protocol.
 *
 * <p>Relays over the counter and systematic internaliser trade transactions</p>
 */
public final class OtcTradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Z';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 147;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Otc Trade Message";

    /**
     * Nanoseconds since midnight, the publication time
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Nasdaq Nordic internal tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Type of instrument identifier
     */
    private final InstrumentIdentificationCodeTypeField instrumentIdentificationCodeType = new InstrumentIdentificationCodeTypeField();

    /**
     * Isin code identifying the instrument
     */
    private final InstrumentIdentificationCodeField instrumentIdentificationCode = new InstrumentIdentificationCodeField();

    /**
     * Date of agreement
     */
    private final AgreementDateField agreementDate = new AgreementDateField();

    /**
     * Time of agreement
     */
    private final AgreementTimeField agreementTime = new AgreementTimeField();

    /**
     * Execution price with runtime decimal places
     */
    private final PriceOtcField priceOtc = new PriceOtcField();

    /**
     * Number of fractional digits in Price
     */
    private final PriceFractionField priceFraction = new PriceFractionField();

    /**
     * How the price is expressed
     */
    private final PriceNotationField priceNotation = new PriceNotationField();

    /**
     * Iso currency code of the price
     */
    private final PriceCurrencyField priceCurrency = new PriceCurrencyField();

    /**
     * Execution quantity with runtime decimal places
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Number of fractional digits in Quantity
     */
    private final QuantityFractionField quantityFraction = new QuantityFractionField();

    /**
     * Measurement units the quantity is expressed in
     */
    private final NotationOfTheQuantityInMeasurementUnitField notationOfTheQuantityInMeasurementUnit = new NotationOfTheQuantityInMeasurementUnitField();

    /**
     * Quantity expressed in measurement units
     */
    private final QuantityInMeasurementUnitField quantityInMeasurementUnit = new QuantityInMeasurementUnitField();

    /**
     * Number of fractional digits in Quantity in measurement unit
     */
    private final QuantityInMeasurementUnitFractionField quantityInMeasurementUnitFraction = new QuantityInMeasurementUnitFractionField();

    /**
     * Mic code of the execution venue
     */
    private final VenueOfExecutionField venueOfExecution = new VenueOfExecutionField();

    /**
     * Notional amount with runtime decimal places
     */
    private final NotionalAmountField notionalAmount = new NotionalAmountField();

    /**
     * Number of fractional digits in Notional amount
     */
    private final NotionalAmountFractionField notionalAmountFraction = new NotionalAmountFractionField();

    /**
     * Iso currency code of the notional amount
     */
    private final NotionalCurrencyField notionalCurrency = new NotionalCurrencyField();

    /**
     * Emission allowance type, for emission allowance derivatives only
     */
    private final TypeField typeField = new TypeField();

    /**
     * Trade match id assigned to each trade
     */
    private final TransactionIdentifierCodeField transactionIdentifierCode = new TransactionIdentifierCodeField();

    /**
     * Market model typology trade flags
     */
    private final MmtTradeFlagsField mmtTradeFlags = new MmtTradeFlagsField();

    /**
     * Whether the transaction is to be cleared
     */
    private final TransactionToBeClearedField transactionToBeCleared = new TransactionToBeClearedField();

    /**
     * Type of negotiated trade
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * Mic code of a third country execution venue
     */
    private final ThirdCountryTradingVenueOfExecutionField thirdCountryTradingVenueOfExecution = new ThirdCountryTradingVenueOfExecutionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, trackingNumber, instrumentIdentificationCodeType, instrumentIdentificationCode, agreementDate, agreementTime, priceOtc, priceFraction, priceNotation, priceCurrency, quantity, quantityFraction, notationOfTheQuantityInMeasurementUnit, quantityInMeasurementUnit, quantityInMeasurementUnitFraction, venueOfExecution, notionalAmount, notionalAmountFraction, notionalCurrency, typeField, transactionIdentifierCode, mmtTradeFlags, transactionToBeCleared, tradeType, thirdCountryTradingVenueOfExecution);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since midnight, the publication time
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Nasdaq Nordic internal tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Type of instrument identifier
     *
     * @return the InstrumentIdentificationCodeType field
     */
    public InstrumentIdentificationCodeTypeField instrumentIdentificationCodeType() {
        return instrumentIdentificationCodeType;
    }

    /**
     * Isin code identifying the instrument
     *
     * @return the InstrumentIdentificationCode field
     */
    public InstrumentIdentificationCodeField instrumentIdentificationCode() {
        return instrumentIdentificationCode;
    }

    /**
     * Date of agreement
     *
     * @return the AgreementDate field
     */
    public AgreementDateField agreementDate() {
        return agreementDate;
    }

    /**
     * Time of agreement
     *
     * @return the AgreementTime field
     */
    public AgreementTimeField agreementTime() {
        return agreementTime;
    }

    /**
     * Execution price with runtime decimal places
     *
     * @return the PriceOtc field
     */
    public PriceOtcField priceOtc() {
        return priceOtc;
    }

    /**
     * Number of fractional digits in Price
     *
     * @return the PriceFraction field
     */
    public PriceFractionField priceFraction() {
        return priceFraction;
    }

    /**
     * How the price is expressed
     *
     * @return the PriceNotation field
     */
    public PriceNotationField priceNotation() {
        return priceNotation;
    }

    /**
     * Iso currency code of the price
     *
     * @return the PriceCurrency field
     */
    public PriceCurrencyField priceCurrency() {
        return priceCurrency;
    }

    /**
     * Execution quantity with runtime decimal places
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Number of fractional digits in Quantity
     *
     * @return the QuantityFraction field
     */
    public QuantityFractionField quantityFraction() {
        return quantityFraction;
    }

    /**
     * Measurement units the quantity is expressed in
     *
     * @return the NotationOfTheQuantityInMeasurementUnit field
     */
    public NotationOfTheQuantityInMeasurementUnitField notationOfTheQuantityInMeasurementUnit() {
        return notationOfTheQuantityInMeasurementUnit;
    }

    /**
     * Quantity expressed in measurement units
     *
     * @return the QuantityInMeasurementUnit field
     */
    public QuantityInMeasurementUnitField quantityInMeasurementUnit() {
        return quantityInMeasurementUnit;
    }

    /**
     * Number of fractional digits in Quantity in measurement unit
     *
     * @return the QuantityInMeasurementUnitFraction field
     */
    public QuantityInMeasurementUnitFractionField quantityInMeasurementUnitFraction() {
        return quantityInMeasurementUnitFraction;
    }

    /**
     * Mic code of the execution venue
     *
     * @return the VenueOfExecution field
     */
    public VenueOfExecutionField venueOfExecution() {
        return venueOfExecution;
    }

    /**
     * Notional amount with runtime decimal places
     *
     * @return the NotionalAmount field
     */
    public NotionalAmountField notionalAmount() {
        return notionalAmount;
    }

    /**
     * Number of fractional digits in Notional amount
     *
     * @return the NotionalAmountFraction field
     */
    public NotionalAmountFractionField notionalAmountFraction() {
        return notionalAmountFraction;
    }

    /**
     * Iso currency code of the notional amount
     *
     * @return the NotionalCurrency field
     */
    public NotionalCurrencyField notionalCurrency() {
        return notionalCurrency;
    }

    /**
     * Emission allowance type, for emission allowance derivatives only
     *
     * @return the Type field
     */
    public TypeField typeField() {
        return typeField;
    }

    /**
     * Trade match id assigned to each trade
     *
     * @return the TransactionIdentifierCode field
     */
    public TransactionIdentifierCodeField transactionIdentifierCode() {
        return transactionIdentifierCode;
    }

    /**
     * Market model typology trade flags
     *
     * @return the MmtTradeFlags field
     */
    public MmtTradeFlagsField mmtTradeFlags() {
        return mmtTradeFlags;
    }

    /**
     * Whether the transaction is to be cleared
     *
     * @return the TransactionToBeCleared field
     */
    public TransactionToBeClearedField transactionToBeCleared() {
        return transactionToBeCleared;
    }

    /**
     * Type of negotiated trade
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    /**
     * Mic code of a third country execution venue
     *
     * @return the ThirdCountryTradingVenueOfExecution field
     */
    public ThirdCountryTradingVenueOfExecutionField thirdCountryTradingVenueOfExecution() {
        return thirdCountryTradingVenueOfExecution;
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!instrumentIdentificationCodeType.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdentificationCodeTypeField.BYTE_LENGTH;
        if (!instrumentIdentificationCode.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdentificationCodeField.BYTE_LENGTH;
        if (!agreementDate.parse(data, cursor)) {
            return false;
        }
        cursor += AgreementDateField.BYTE_LENGTH;
        if (!agreementTime.parse(data, cursor)) {
            return false;
        }
        cursor += AgreementTimeField.BYTE_LENGTH;
        if (!priceOtc.parse(data, cursor)) {
            return false;
        }
        cursor += PriceOtcField.BYTE_LENGTH;
        if (!priceFraction.parse(data, cursor)) {
            return false;
        }
        cursor += PriceFractionField.BYTE_LENGTH;
        if (!priceNotation.parse(data, cursor)) {
            return false;
        }
        cursor += PriceNotationField.BYTE_LENGTH;
        if (!priceCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += PriceCurrencyField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!quantityFraction.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityFractionField.BYTE_LENGTH;
        if (!notationOfTheQuantityInMeasurementUnit.parse(data, cursor)) {
            return false;
        }
        cursor += NotationOfTheQuantityInMeasurementUnitField.BYTE_LENGTH;
        if (!quantityInMeasurementUnit.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityInMeasurementUnitField.BYTE_LENGTH;
        if (!quantityInMeasurementUnitFraction.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityInMeasurementUnitFractionField.BYTE_LENGTH;
        if (!venueOfExecution.parse(data, cursor)) {
            return false;
        }
        cursor += VenueOfExecutionField.BYTE_LENGTH;
        if (!notionalAmount.parse(data, cursor)) {
            return false;
        }
        cursor += NotionalAmountField.BYTE_LENGTH;
        if (!notionalAmountFraction.parse(data, cursor)) {
            return false;
        }
        cursor += NotionalAmountFractionField.BYTE_LENGTH;
        if (!notionalCurrency.parse(data, cursor)) {
            return false;
        }
        cursor += NotionalCurrencyField.BYTE_LENGTH;
        if (!typeField.parse(data, cursor)) {
            return false;
        }
        cursor += TypeField.BYTE_LENGTH;
        if (!transactionIdentifierCode.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionIdentifierCodeField.BYTE_LENGTH;
        if (!mmtTradeFlags.parse(data, cursor)) {
            return false;
        }
        cursor += MmtTradeFlagsField.BYTE_LENGTH;
        if (!transactionToBeCleared.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionToBeClearedField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        return thirdCountryTradingVenueOfExecution.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = trackingNumber.encode(data, cursor);
        cursor = instrumentIdentificationCodeType.encode(data, cursor);
        cursor = instrumentIdentificationCode.encode(data, cursor);
        cursor = agreementDate.encode(data, cursor);
        cursor = agreementTime.encode(data, cursor);
        cursor = priceOtc.encode(data, cursor);
        cursor = priceFraction.encode(data, cursor);
        cursor = priceNotation.encode(data, cursor);
        cursor = priceCurrency.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = quantityFraction.encode(data, cursor);
        cursor = notationOfTheQuantityInMeasurementUnit.encode(data, cursor);
        cursor = quantityInMeasurementUnit.encode(data, cursor);
        cursor = quantityInMeasurementUnitFraction.encode(data, cursor);
        cursor = venueOfExecution.encode(data, cursor);
        cursor = notionalAmount.encode(data, cursor);
        cursor = notionalAmountFraction.encode(data, cursor);
        cursor = notionalCurrency.encode(data, cursor);
        cursor = typeField.encode(data, cursor);
        cursor = transactionIdentifierCode.encode(data, cursor);
        cursor = mmtTradeFlags.encode(data, cursor);
        cursor = transactionToBeCleared.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = thirdCountryTradingVenueOfExecution.encode(data, cursor);
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
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "InstrumentIdentificationCodeType" -> Optional.of(instrumentIdentificationCodeType);
            case "InstrumentIdentificationCode" -> Optional.of(instrumentIdentificationCode);
            case "AgreementDate" -> Optional.of(agreementDate);
            case "AgreementTime" -> Optional.of(agreementTime);
            case "PriceOtc" -> Optional.of(priceOtc);
            case "PriceFraction" -> Optional.of(priceFraction);
            case "PriceNotation" -> Optional.of(priceNotation);
            case "PriceCurrency" -> Optional.of(priceCurrency);
            case "Quantity" -> Optional.of(quantity);
            case "QuantityFraction" -> Optional.of(quantityFraction);
            case "NotationOfTheQuantityInMeasurementUnit" -> Optional.of(notationOfTheQuantityInMeasurementUnit);
            case "QuantityInMeasurementUnit" -> Optional.of(quantityInMeasurementUnit);
            case "QuantityInMeasurementUnitFraction" -> Optional.of(quantityInMeasurementUnitFraction);
            case "VenueOfExecution" -> Optional.of(venueOfExecution);
            case "NotionalAmount" -> Optional.of(notionalAmount);
            case "NotionalAmountFraction" -> Optional.of(notionalAmountFraction);
            case "NotionalCurrency" -> Optional.of(notionalCurrency);
            case "Type" -> Optional.of(typeField);
            case "TransactionIdentifierCode" -> Optional.of(transactionIdentifierCode);
            case "MmtTradeFlags" -> Optional.of(mmtTradeFlags);
            case "TransactionToBeCleared" -> Optional.of(transactionToBeCleared);
            case "TradeType" -> Optional.of(tradeType);
            case "ThirdCountryTradingVenueOfExecution" -> Optional.of(thirdCountryTradingVenueOfExecution);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OtcTradeMessage message)) {
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
        if (!(other instanceof OtcTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
