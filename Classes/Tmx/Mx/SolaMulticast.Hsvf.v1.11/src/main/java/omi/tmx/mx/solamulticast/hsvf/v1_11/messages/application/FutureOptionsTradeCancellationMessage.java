package omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.PriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.StrikePriceInstrumentFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.CallPutCodeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ContractMonthCodeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExpiryDayField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExpiryYearField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.OpenInterestField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.PriceIndicatorMarkerField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.RootSymbolField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.TimestampField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.TradeNumberField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.VolumeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.PrintOptions;

/**
 * Represents the FutureOptionsTradeCancellationMessage message from the SolaMulticast protocol.
 *
 * <p>Future Options Trade Cancellation message</p>
 */
public final class FutureOptionsTradeCancellationMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 69;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Future Options Trade Cancellation Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 37, 6, 59, 2 };

    /**
     * Exchange on which the trade occurred Q = Montreal
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Option base symbol (symbol of the underlying)
     */
    private final RootSymbolField rootSymbol = new RootSymbolField();

    /**
     * Option month code
     */
    private final ContractMonthCodeField contractMonthCode = new ContractMonthCodeField();

    /**
     * Last two digits of the option expiry year
     */
    private final ExpiryYearField expiryYear = new ExpiryYearField();

    /**
     * Expiry day of the option
     */
    private final ExpiryDayField expiryDay = new ExpiryDayField();

    /**
     * C = Call, P = Put
     */
    private final CallPutCodeField callPutCode = new CallPutCodeField();

    /**
     * Number of contracts for the trade
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Identifies the type of transaction
     */
    private final PriceIndicatorMarkerField priceIndicatorMarker = new PriceIndicatorMarkerField();

    /**
     * Time of cancellation transaction HHMMSSmmm
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Outstanding number of contracts in the series as of the previous day Refer to Indicator Code
     */
    private final OpenInterestField openInterest = new OpenInterestField();

    /**
     * Unique Trade Number for this instrument
     */
    private final TradeNumberField tradeNumber = new TradeNumberField();

    /**
     * Branch
     */
    private final StrikePriceInstrumentFractionPair strikePriceInstrumentFractionPair = new StrikePriceInstrumentFractionPair();

    /**
     * Branch
     */
    private final PriceFractionPair priceFractionPair = new PriceFractionPair();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, rootSymbol, contractMonthCode, expiryYear, expiryDay, callPutCode, volume, priceIndicatorMarker, timestampField, openInterest, tradeNumber);

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
     * Option base symbol (symbol of the underlying)
     *
     * @return the RootSymbol field
     */
    public RootSymbolField rootSymbol() {
        return rootSymbol;
    }

    /**
     * Option month code
     *
     * @return the ContractMonthCode field
     */
    public ContractMonthCodeField contractMonthCode() {
        return contractMonthCode;
    }

    /**
     * Last two digits of the option expiry year
     *
     * @return the ExpiryYear field
     */
    public ExpiryYearField expiryYear() {
        return expiryYear;
    }

    /**
     * Expiry day of the option
     *
     * @return the ExpiryDay field
     */
    public ExpiryDayField expiryDay() {
        return expiryDay;
    }

    /**
     * C = Call, P = Put
     *
     * @return the CallPutCode field
     */
    public CallPutCodeField callPutCode() {
        return callPutCode;
    }

    /**
     * Number of contracts for the trade
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * Identifies the type of transaction
     *
     * @return the PriceIndicatorMarker field
     */
    public PriceIndicatorMarkerField priceIndicatorMarker() {
        return priceIndicatorMarker;
    }

    /**
     * Time of cancellation transaction HHMMSSmmm
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Outstanding number of contracts in the series as of the previous day Refer to Indicator Code
     *
     * @return the OpenInterest field
     */
    public OpenInterestField openInterest() {
        return openInterest;
    }

    /**
     * Unique Trade Number for this instrument
     *
     * @return the TradeNumber field
     */
    public TradeNumberField tradeNumber() {
        return tradeNumber;
    }

    /**
     * Branch
     *
     * @return the StrikePriceInstrumentFractionPair record
     */
    public StrikePriceInstrumentFractionPair strikePriceInstrumentFractionPair() {
        return strikePriceInstrumentFractionPair;
    }

    /**
     * Branch
     *
     * @return the PriceFractionPair record
     */
    public PriceFractionPair priceFractionPair() {
        return priceFractionPair;
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
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!rootSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += RootSymbolField.BYTE_LENGTH;
        if (!contractMonthCode.parse(data, cursor)) {
            return false;
        }
        cursor += ContractMonthCodeField.BYTE_LENGTH;
        if (!expiryYear.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryYearField.BYTE_LENGTH;
        if (!expiryDay.parse(data, cursor)) {
            return false;
        }
        cursor += ExpiryDayField.BYTE_LENGTH;
        if (!callPutCode.parse(data, cursor)) {
            return false;
        }
        cursor += CallPutCodeField.BYTE_LENGTH;
        if (!strikePriceInstrumentFractionPair.parseFrom(data, cursor, end - 48)) {
            return false;
        }
        cursor += strikePriceInstrumentFractionPair.byteLength();
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!priceFractionPair.parseFrom(data, cursor, end - 33)) {
            return false;
        }
        cursor += priceFractionPair.byteLength();
        if (!priceIndicatorMarker.parse(data, cursor)) {
            return false;
        }
        cursor += PriceIndicatorMarkerField.BYTE_LENGTH;
        cursor += 6; // padding
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!openInterest.parse(data, cursor)) {
            return false;
        }
        cursor += OpenInterestField.BYTE_LENGTH;
        cursor += 2; // padding
        return tradeNumber.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = rootSymbol.encode(data, cursor);
        cursor = contractMonthCode.encode(data, cursor);
        cursor = expiryYear.encode(data, cursor);
        cursor = expiryDay.encode(data, cursor);
        cursor = callPutCode.encode(data, cursor);
        cursor = strikePriceInstrumentFractionPair.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = priceFractionPair.encode(data, cursor);
        cursor = priceIndicatorMarker.encode(data, cursor);
        if (buffer != null && buffer.length >= 43) {
            System.arraycopy(buffer, 37, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
        cursor = timestampField.encode(data, cursor);
        cursor = openInterest.encode(data, cursor);
        if (buffer != null && buffer.length >= 61) {
            System.arraycopy(buffer, 59, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = tradeNumber.encode(data, cursor);
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
        strikePriceInstrumentFractionPair.clear();
        priceFractionPair.clear();
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
        if (!strikePriceInstrumentFractionPair.isRecognized()) {
            return false;
        }
        return priceFractionPair.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!strikePriceInstrumentFractionPair.isValid()) {
            return false;
        }
        if (!priceFractionPair.isValid()) {
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
            case "ContractMonthCode" -> Optional.of(contractMonthCode);
            case "ExpiryYear" -> Optional.of(expiryYear);
            case "ExpiryDay" -> Optional.of(expiryDay);
            case "CallPutCode" -> Optional.of(callPutCode);
            case "Volume" -> Optional.of(volume);
            case "PriceIndicatorMarker" -> Optional.of(priceIndicatorMarker);
            case "Timestamp" -> Optional.of(timestampField);
            case "OpenInterest" -> Optional.of(openInterest);
            case "TradeNumber" -> Optional.of(tradeNumber);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FutureOptionsTradeCancellationMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(strikePriceInstrumentFractionPair.diffFields(message.strikePriceInstrumentFractionPair));
        changed.addAll(priceFractionPair.diffFields(message.priceFractionPair));
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
            strikePriceInstrumentFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            priceFractionPair.toFormattedString(builder, options);
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
        strikePriceInstrumentFractionPair.toFormattedString(builder, nested);
        priceFractionPair.toFormattedString(builder, nested);
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
        if (!(other instanceof FutureOptionsTradeCancellationMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && strikePriceInstrumentFractionPair.equals(message.strikePriceInstrumentFractionPair) && priceFractionPair.equals(message.priceFractionPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, strikePriceInstrumentFractionPair, priceFractionPair);
    }
}
