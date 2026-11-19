package omi.tmx.mx.solatcpretransmission.hsvf.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.DeliveryDayField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.DeliveryMonthField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.DeliveryYearFuturesField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.ExchangeIdField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.InstrumentStatusMarkerField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.NumberOfLevelField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.RootSymbolField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.groups.FuturesMarketDepthTradingInstrumentEntry;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.groups.FuturesMarketDepthTradingInstrumentList;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Message;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.PrintOptions;

/**
 * Represents the FuturesMarketDepthMessage message from the SolaTcpRetransmission protocol.
 *
 * <p>Futures Market Depth message</p>
 */
public final class FuturesMarketDepthMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 14;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Futures Market Depth Message";

    /**
     * Exchange on which the quote occurred Q = Montreal
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Symbol for the Future series
     */
    private final RootSymbolField rootSymbol = new RootSymbolField();

    /**
     * Delivery month for the contract
     */
    private final DeliveryMonthField deliveryMonth = new DeliveryMonthField();

    /**
     * Two last digits of the delivery year of the future series
     */
    private final DeliveryYearFuturesField deliveryYearFutures = new DeliveryYearFuturesField();

    /**
     * Delivery day of the future series
     */
    private final DeliveryDayField deliveryDay = new DeliveryDayField();

    /**
     * Indicates instrument status
     */
    private final InstrumentStatusMarkerField instrumentStatusMarker = new InstrumentStatusMarkerField();

    /**
     * Number of level for the trading instrument. 1 to 5
     */
    private final NumberOfLevelField numberOfLevel = new NumberOfLevelField();

    /**
     * Futures Market Depth Trading instrument
     */
    private final FuturesMarketDepthTradingInstrumentList futuresMarketDepthTradingInstrument = new FuturesMarketDepthTradingInstrumentList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, rootSymbol, deliveryMonth, deliveryYearFutures, deliveryDay, instrumentStatusMarker, numberOfLevel);

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
     * Symbol for the Future series
     *
     * @return the RootSymbol field
     */
    public RootSymbolField rootSymbol() {
        return rootSymbol;
    }

    /**
     * Delivery month for the contract
     *
     * @return the DeliveryMonth field
     */
    public DeliveryMonthField deliveryMonth() {
        return deliveryMonth;
    }

    /**
     * Two last digits of the delivery year of the future series
     *
     * @return the DeliveryYearFutures field
     */
    public DeliveryYearFuturesField deliveryYearFutures() {
        return deliveryYearFutures;
    }

    /**
     * Delivery day of the future series
     *
     * @return the DeliveryDay field
     */
    public DeliveryDayField deliveryDay() {
        return deliveryDay;
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
     * Futures Market Depth Trading instrument
     *
     * <p>Encode writes this list's size to the NumberOfLevel field.</p>
     *
     * @return the FuturesMarketDepthTradingInstrument entries
     */
    public FuturesMarketDepthTradingInstrumentList futuresMarketDepthTradingInstrument() {
        return futuresMarketDepthTradingInstrument;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + futuresMarketDepthTradingInstrument.byteLength();
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
        if (!deliveryMonth.parse(data, cursor)) {
            return false;
        }
        cursor += DeliveryMonthField.BYTE_LENGTH;
        if (!deliveryYearFutures.parse(data, cursor)) {
            return false;
        }
        cursor += DeliveryYearFuturesField.BYTE_LENGTH;
        if (!deliveryDay.parse(data, cursor)) {
            return false;
        }
        cursor += DeliveryDayField.BYTE_LENGTH;
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
        if (!futuresMarketDepthTradingInstrument.parse(data, cursor, end, numberOfLevel.value())) {
            return false;
        }
        cursor += futuresMarketDepthTradingInstrument.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (futuresMarketDepthTradingInstrument.size() > 9) {
            throw new IllegalStateException("futuresMarketDepthTradingInstrument holds " + futuresMarketDepthTradingInstrument.size() + " entries, more than its count field can state");
        }
        numberOfLevel.value((long) futuresMarketDepthTradingInstrument.size());
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = rootSymbol.encode(data, cursor);
        cursor = deliveryMonth.encode(data, cursor);
        cursor = deliveryYearFutures.encode(data, cursor);
        cursor = deliveryDay.encode(data, cursor);
        cursor = instrumentStatusMarker.encode(data, cursor);
        cursor = numberOfLevel.encode(data, cursor);
        cursor = futuresMarketDepthTradingInstrument.encode(data, cursor);
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
        futuresMarketDepthTradingInstrument.clear();
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
        return futuresMarketDepthTradingInstrument.isRecognized();
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
        if (!futuresMarketDepthTradingInstrument.isValid()) {
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
        if (!deliveryMonth.isDecoded()) {
            return Optional.of(deliveryMonth);
        }
        if (!deliveryYearFutures.isDecoded()) {
            return Optional.of(deliveryYearFutures);
        }
        if (!deliveryDay.isDecoded()) {
            return Optional.of(deliveryDay);
        }
        if (!instrumentStatusMarker.isDecoded()) {
            return Optional.of(instrumentStatusMarker);
        }
        if (!numberOfLevel.isDecoded()) {
            return Optional.of(numberOfLevel);
        }
        if (!futuresMarketDepthTradingInstrument.isDecoded()) {
            return Optional.of(futuresMarketDepthTradingInstrument.failedEntry().flatMap(FuturesMarketDepthTradingInstrumentEntry::failedAt).orElse(numberOfLevel));
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
            case "DeliveryMonth" -> Optional.of(deliveryMonth);
            case "DeliveryYearFutures" -> Optional.of(deliveryYearFutures);
            case "DeliveryDay" -> Optional.of(deliveryDay);
            case "InstrumentStatusMarker" -> Optional.of(instrumentStatusMarker);
            case "NumberOfLevel" -> Optional.of(numberOfLevel);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FuturesMarketDepthMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(futuresMarketDepthTradingInstrument.diffFields(message.futuresMarketDepthTradingInstrument));
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
            futuresMarketDepthTradingInstrument.toFormattedString(builder, options);
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
        futuresMarketDepthTradingInstrument.toFormattedString(builder, nested);
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
        if (!(other instanceof FuturesMarketDepthMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && futuresMarketDepthTradingInstrument.equals(message.futuresMarketDepthTradingInstrument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, futuresMarketDepthTradingInstrument);
    }
}
