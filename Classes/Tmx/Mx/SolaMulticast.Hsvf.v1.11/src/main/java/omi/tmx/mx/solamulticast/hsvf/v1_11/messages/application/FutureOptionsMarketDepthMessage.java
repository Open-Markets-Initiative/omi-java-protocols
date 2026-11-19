package omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.StrikePriceInstrumentFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.CallPutCodeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ContractMonthCodeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExpiryDayField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExpiryYearField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.InstrumentStatusMarkerField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.NumberOfLevelField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.RootSymbolField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.groups.FutureOptionsMarketDepthTradingInstrumentEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_11.groups.FutureOptionsMarketDepthTradingInstrumentList;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.PrintOptions;

/**
 * Represents the FutureOptionsMarketDepthMessage message from the SolaMulticast protocol.
 *
 * <p>Future Options Market Depth message</p>
 */
public final class FutureOptionsMarketDepthMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 23;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Future Options Market Depth Message";

    /**
     * Exchange on which the quote occurred Q = Montreal
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
     * Indicates instrument status
     */
    private final InstrumentStatusMarkerField instrumentStatusMarker = new InstrumentStatusMarkerField();

    /**
     * Number of level for the trading instrument. 1 to 5
     */
    private final NumberOfLevelField numberOfLevel = new NumberOfLevelField();

    /**
     * Future Options Market Depth Trading instrument
     */
    private final FutureOptionsMarketDepthTradingInstrumentList futureOptionsMarketDepthTradingInstrument = new FutureOptionsMarketDepthTradingInstrumentList();

    /**
     * Branch
     */
    private final StrikePriceInstrumentFractionPair strikePriceInstrumentFractionPair = new StrikePriceInstrumentFractionPair();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, rootSymbol, contractMonthCode, expiryYear, expiryDay, callPutCode, instrumentStatusMarker, numberOfLevel);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange on which the quote occurred Q = Montreal
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
     * Indicates instrument status
     *
     * @return the InstrumentStatusMarker field
     */
    public InstrumentStatusMarkerField instrumentStatusMarker() {
        return instrumentStatusMarker;
    }

    /**
     * Number of level for the trading instrument. 1 to 5
     *
     * @return the NumberOfLevel field
     */
    public NumberOfLevelField numberOfLevel() {
        return numberOfLevel;
    }

    /**
     * Future Options Market Depth Trading instrument
     *
     * <p>Encode writes this list's size to the NumberOfLevel field.</p>
     *
     * @return the FutureOptionsMarketDepthTradingInstrument entries
     */
    public FutureOptionsMarketDepthTradingInstrumentList futureOptionsMarketDepthTradingInstrument() {
        return futureOptionsMarketDepthTradingInstrument;
    }

    /**
     * Branch
     *
     * @return the StrikePriceInstrumentFractionPair record
     */
    public StrikePriceInstrumentFractionPair strikePriceInstrumentFractionPair() {
        return strikePriceInstrumentFractionPair;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + futureOptionsMarketDepthTradingInstrument.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
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
        if (!strikePriceInstrumentFractionPair.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += strikePriceInstrumentFractionPair.byteLength();
        if (!instrumentStatusMarker.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentStatusMarkerField.BYTE_LENGTH;
        if (!numberOfLevel.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfLevelField.BYTE_LENGTH;
        if (numberOfLevel.value() == null) {
            return false;
        }
        if (!futureOptionsMarketDepthTradingInstrument.parse(data, cursor, end, numberOfLevel.value())) {
            return false;
        }
        cursor += futureOptionsMarketDepthTradingInstrument.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (futureOptionsMarketDepthTradingInstrument.size() > 9) {
            throw new IllegalStateException("futureOptionsMarketDepthTradingInstrument holds " + futureOptionsMarketDepthTradingInstrument.size() + " entries, more than its count field can state");
        }
        numberOfLevel.value((long) futureOptionsMarketDepthTradingInstrument.size());
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = rootSymbol.encode(data, cursor);
        cursor = contractMonthCode.encode(data, cursor);
        cursor = expiryYear.encode(data, cursor);
        cursor = expiryDay.encode(data, cursor);
        cursor = callPutCode.encode(data, cursor);
        cursor = strikePriceInstrumentFractionPair.encode(data, cursor);
        cursor = instrumentStatusMarker.encode(data, cursor);
        cursor = numberOfLevel.encode(data, cursor);
        cursor = futureOptionsMarketDepthTradingInstrument.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        strikePriceInstrumentFractionPair.clear();
        futureOptionsMarketDepthTradingInstrument.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfLevel && !field.isRecognized()) {
                return false;
            }
        }
        if (!strikePriceInstrumentFractionPair.isRecognized()) {
            return false;
        }
        return futureOptionsMarketDepthTradingInstrument.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfLevel && !field.isValid()) {
                return false;
            }
        }
        if (!strikePriceInstrumentFractionPair.isValid()) {
            return false;
        }
        if (!futureOptionsMarketDepthTradingInstrument.isValid()) {
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
        if (!exchangeId.isDecoded()) {
            return Optional.of(exchangeId);
        }
        if (!rootSymbol.isDecoded()) {
            return Optional.of(rootSymbol);
        }
        if (!contractMonthCode.isDecoded()) {
            return Optional.of(contractMonthCode);
        }
        if (!expiryYear.isDecoded()) {
            return Optional.of(expiryYear);
        }
        if (!expiryDay.isDecoded()) {
            return Optional.of(expiryDay);
        }
        if (!callPutCode.isDecoded()) {
            return Optional.of(callPutCode);
        }
        if (!strikePriceInstrumentFractionPair.isDecoded()) {
            return strikePriceInstrumentFractionPair.failedAt();
        }
        if (!instrumentStatusMarker.isDecoded()) {
            return Optional.of(instrumentStatusMarker);
        }
        if (!numberOfLevel.isDecoded()) {
            return Optional.of(numberOfLevel);
        }
        if (!futureOptionsMarketDepthTradingInstrument.isDecoded()) {
            return Optional.of(futureOptionsMarketDepthTradingInstrument.failedEntry().flatMap(FutureOptionsMarketDepthTradingInstrumentEntry::failedAt).orElse(numberOfLevel));
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
            case "InstrumentStatusMarker" -> Optional.of(instrumentStatusMarker);
            case "NumberOfLevel" -> Optional.of(numberOfLevel);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FutureOptionsMarketDepthMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(strikePriceInstrumentFractionPair.diffFields(message.strikePriceInstrumentFractionPair));
        changed.addAll(futureOptionsMarketDepthTradingInstrument.diffFields(message.futureOptionsMarketDepthTradingInstrument));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            futureOptionsMarketDepthTradingInstrument.toFormattedString(builder, options);
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
        futureOptionsMarketDepthTradingInstrument.toFormattedString(builder, nested);
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
        if (!(other instanceof FutureOptionsMarketDepthMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && strikePriceInstrumentFractionPair.equals(message.strikePriceInstrumentFractionPair) && futureOptionsMarketDepthTradingInstrument.equals(message.futureOptionsMarketDepthTradingInstrument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, strikePriceInstrumentFractionPair, futureOptionsMarketDepthTradingInstrument);
    }
}
