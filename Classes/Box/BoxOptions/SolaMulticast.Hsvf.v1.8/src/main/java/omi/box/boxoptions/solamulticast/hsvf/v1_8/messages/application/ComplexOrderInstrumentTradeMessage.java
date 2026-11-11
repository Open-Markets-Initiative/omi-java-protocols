package omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ComplexOrderInstrumentSymbolField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ExchangeIdField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.NetChangeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.NetChangeFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.NetChangeSignField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.PriceIndicatorMarkerField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.TimestampField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.TradePriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.TradePriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.TradePriceSignField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.VolumeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Field;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Message;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.PrintOptions;

/**
 * Represents the ComplexOrderInstrumentTradeMessage message from the SolaMulticast protocol.
 *
 * <p>Complex Order Instrument Trade</p>
 */
public final class ComplexOrderInstrumentTradeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 68;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Order Instrument Trade Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 55, 6 };

    /**
     * Q by default
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Complex Order Instrument symbol. The individual legs are defined in message type JS.
     */
    private final ComplexOrderInstrumentSymbolField complexOrderInstrumentSymbol = new ComplexOrderInstrumentSymbolField();

    /**
     * Number of contracts for the trade
     */
    private final VolumeField volume = new VolumeField();

    /**
     * For Trade Price field (sign)
     */
    private final TradePriceSignField tradePriceSign = new TradePriceSignField();

    /**
     * Price at which the transaction took place
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * Defines number of decimal places or fraction positions
     */
    private final TradePriceFractionIndicatorField tradePriceFractionIndicator = new TradePriceFractionIndicatorField();

    /**
     * For the net change field
     */
    private final NetChangeSignField netChangeSign = new NetChangeSignField();

    /**
     * Net change equals last trade price minus previous close
     */
    private final NetChangeField netChange = new NetChangeField();

    /**
     * Fraction indicator for the net change price
     */
    private final NetChangeFractionIndicatorField netChangeFractionIndicator = new NetChangeFractionIndicatorField();

    /**
     * Time of transaction:HHMMSS
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Identifies the type of transaction
     */
    private final PriceIndicatorMarkerField priceIndicatorMarker = new PriceIndicatorMarkerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, complexOrderInstrumentSymbol, volume, tradePriceSign, tradePrice, tradePriceFractionIndicator, netChangeSign, netChange, netChangeFractionIndicator, timestampField, priceIndicatorMarker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Q by default
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Complex Order Instrument symbol. The individual legs are defined in message type JS.
     *
     * @return the ComplexOrderInstrumentSymbol field
     */
    public ComplexOrderInstrumentSymbolField complexOrderInstrumentSymbol() {
        return complexOrderInstrumentSymbol;
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
     * For Trade Price field (sign)
     *
     * @return the TradePriceSign field
     */
    public TradePriceSignField tradePriceSign() {
        return tradePriceSign;
    }

    /**
     * Price at which the transaction took place
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * Defines number of decimal places or fraction positions
     *
     * @return the TradePriceFractionIndicator field
     */
    public TradePriceFractionIndicatorField tradePriceFractionIndicator() {
        return tradePriceFractionIndicator;
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
     * Net change equals last trade price minus previous close
     *
     * @return the NetChange field
     */
    public NetChangeField netChange() {
        return netChange;
    }

    /**
     * Fraction indicator for the net change price
     *
     * @return the NetChangeFractionIndicator field
     */
    public NetChangeFractionIndicatorField netChangeFractionIndicator() {
        return netChangeFractionIndicator;
    }

    /**
     * Time of transaction:HHMMSS
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
        if (!complexOrderInstrumentSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexOrderInstrumentSymbolField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!tradePriceSign.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceSignField.BYTE_LENGTH;
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!tradePriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceFractionIndicatorField.BYTE_LENGTH;
        if (!netChangeSign.parse(data, cursor)) {
            return false;
        }
        cursor += NetChangeSignField.BYTE_LENGTH;
        if (!netChange.parse(data, cursor)) {
            return false;
        }
        cursor += NetChangeField.BYTE_LENGTH;
        if (!netChangeFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += NetChangeFractionIndicatorField.BYTE_LENGTH;
        cursor += 6; // padding
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        return priceIndicatorMarker.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = complexOrderInstrumentSymbol.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = tradePriceSign.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = tradePriceFractionIndicator.encode(data, cursor);
        cursor = netChangeSign.encode(data, cursor);
        cursor = netChange.encode(data, cursor);
        cursor = netChangeFractionIndicator.encode(data, cursor);
        if (buffer != null && buffer.length >= 61) {
            System.arraycopy(buffer, 55, data, cursor, 6); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 6, (byte) 0); // padding
        }
        cursor += 6;
        cursor = timestampField.encode(data, cursor);
        cursor = priceIndicatorMarker.encode(data, cursor);
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
            case "ExchangeId" -> Optional.of(exchangeId);
            case "ComplexOrderInstrumentSymbol" -> Optional.of(complexOrderInstrumentSymbol);
            case "Volume" -> Optional.of(volume);
            case "TradePriceSign" -> Optional.of(tradePriceSign);
            case "TradePrice" -> Optional.of(tradePrice);
            case "TradePriceFractionIndicator" -> Optional.of(tradePriceFractionIndicator);
            case "NetChangeSign" -> Optional.of(netChangeSign);
            case "NetChange" -> Optional.of(netChange);
            case "NetChangeFractionIndicator" -> Optional.of(netChangeFractionIndicator);
            case "Timestamp" -> Optional.of(timestampField);
            case "PriceIndicatorMarker" -> Optional.of(priceIndicatorMarker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexOrderInstrumentTradeMessage message)) {
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
        if (!(other instanceof ComplexOrderInstrumentTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
