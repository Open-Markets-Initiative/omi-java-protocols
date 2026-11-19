package omi.tmx.mx.solatcpretransmission.hsvf.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches.NetChangeFuturesTradeMessageFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches.TradePriceFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.DeliveryDayField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.DeliveryMonthField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.DeliveryYearFuturesField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.ExchangeIdField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.NetChangeSignField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.PriceIndicatorMarkerField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.RootSymbolField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.TimestampField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.TradeNumberField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.fields.VolumeField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Message;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.PrintOptions;

/**
 * Represents the FuturesTradeCorrectionMessage message from the SolaTcpRetransmission protocol.
 *
 * <p>Futures Trade Correction message</p>
 */
public final class FuturesTradeCorrectionMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 59;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Futures Trade Correction Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 35, 6 };

    /**
     * Exchange on which the trade occurred Q = Montreal
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Futures series symbol
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
     * Number of contracts for the trade
     */
    private final VolumeField volume = new VolumeField();

    /**
     * For the net change field
     */
    private final NetChangeSignField netChangeSign = new NetChangeSignField();

    /**
     * Time of transaction (HHMMSSmmm)
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Identifies the type of transaction
     */
    private final PriceIndicatorMarkerField priceIndicatorMarker = new PriceIndicatorMarkerField();

    /**
     * Unique Trade Number for this instrument
     */
    private final TradeNumberField tradeNumber = new TradeNumberField();

    /**
     * Branch
     */
    private final TradePriceFractionPair tradePriceFractionPair = new TradePriceFractionPair();

    /**
     * Branch
     */
    private final NetChangeFuturesTradeMessageFractionPair netChangeFuturesTradeMessageFractionPair = new NetChangeFuturesTradeMessageFractionPair();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, rootSymbol, deliveryMonth, deliveryYearFutures, deliveryDay, volume, netChangeSign, timestampField, priceIndicatorMarker, tradeNumber);

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
     * Futures series symbol
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
     * Number of contracts for the trade
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * For the net change field
     *
     * @return the NetChangeSign field
     */
    public NetChangeSignField netChangeSign() {
        return netChangeSign;
    }

    /**
     * Time of transaction (HHMMSSmmm)
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
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
     * @return the TradePriceFractionPair record
     */
    public TradePriceFractionPair tradePriceFractionPair() {
        return tradePriceFractionPair;
    }

    /**
     * Branch
     *
     * @return the NetChangeFuturesTradeMessageFractionPair record
     */
    public NetChangeFuturesTradeMessageFractionPair netChangeFuturesTradeMessageFractionPair() {
        return netChangeFuturesTradeMessageFractionPair;
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
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!tradePriceFractionPair.parseFrom(data, cursor, end - 32)) {
            return false;
        }
        cursor += tradePriceFractionPair.byteLength();
        if (!netChangeSign.parse(data, cursor)) {
            return false;
        }
        cursor += NetChangeSignField.BYTE_LENGTH;
        if (!netChangeFuturesTradeMessageFractionPair.parseFrom(data, cursor, end - 24)) {
            return false;
        }
        cursor += netChangeFuturesTradeMessageFractionPair.byteLength();
        cursor += 6; // padding
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!priceIndicatorMarker.parse(data, cursor)) {
            return false;
        }
        cursor += PriceIndicatorMarkerField.BYTE_LENGTH;
        return tradeNumber.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = rootSymbol.encode(data, cursor);
        cursor = deliveryMonth.encode(data, cursor);
        cursor = deliveryYearFutures.encode(data, cursor);
        cursor = deliveryDay.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = tradePriceFractionPair.encode(data, cursor);
        cursor = netChangeSign.encode(data, cursor);
        cursor = netChangeFuturesTradeMessageFractionPair.encode(data, cursor);
        if (buffer != null && buffer.length >= 41) {
            System.arraycopy(buffer, 35, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
        cursor = timestampField.encode(data, cursor);
        cursor = priceIndicatorMarker.encode(data, cursor);
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
        tradePriceFractionPair.clear();
        netChangeFuturesTradeMessageFractionPair.clear();
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
        if (!tradePriceFractionPair.isRecognized()) {
            return false;
        }
        return netChangeFuturesTradeMessageFractionPair.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!tradePriceFractionPair.isValid()) {
            return false;
        }
        if (!netChangeFuturesTradeMessageFractionPair.isValid()) {
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
            case "DeliveryMonth" -> Optional.of(deliveryMonth);
            case "DeliveryYearFutures" -> Optional.of(deliveryYearFutures);
            case "DeliveryDay" -> Optional.of(deliveryDay);
            case "Volume" -> Optional.of(volume);
            case "NetChangeSign" -> Optional.of(netChangeSign);
            case "Timestamp" -> Optional.of(timestampField);
            case "PriceIndicatorMarker" -> Optional.of(priceIndicatorMarker);
            case "TradeNumber" -> Optional.of(tradeNumber);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FuturesTradeCorrectionMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(tradePriceFractionPair.diffFields(message.tradePriceFractionPair));
        changed.addAll(netChangeFuturesTradeMessageFractionPair.diffFields(message.netChangeFuturesTradeMessageFractionPair));
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
            tradePriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            netChangeFuturesTradeMessageFractionPair.toFormattedString(builder, options);
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
        tradePriceFractionPair.toFormattedString(builder, nested);
        netChangeFuturesTradeMessageFractionPair.toFormattedString(builder, nested);
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
        if (!(other instanceof FuturesTradeCorrectionMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && tradePriceFractionPair.equals(message.tradePriceFractionPair) && netChangeFuturesTradeMessageFractionPair.equals(message.netChangeFuturesTradeMessageFractionPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, tradePriceFractionPair, netChangeFuturesTradeMessageFractionPair);
    }
}
