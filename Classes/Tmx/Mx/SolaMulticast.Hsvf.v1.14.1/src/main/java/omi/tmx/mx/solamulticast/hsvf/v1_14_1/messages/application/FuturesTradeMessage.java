package omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.NetChangeFuturesTradeMessageFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.TradePriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.AuctionIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.NetChangeSignField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.PriceIndicatorMarkerField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.TradeNumberField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.VolumeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.FutureProduct;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * Represents the FuturesTradeMessage message from the SolaMulticast protocol.
 *
 * <p>Before the closing settlement prices are determined and transmitted for all CGB (10-Year Canadian Government Bond Futures) and BAX (3-Month Canadian Bankers' Acceptance Futures) products, most fields for each series will be blank/zero filled except for the Price field, which will contain the closing settlement price.</p>
 */
public final class FuturesTradeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 52;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Futures Trade Message";

    /**
     * Exchange on which the trade occurred
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Number of contracts for the trade
     */
    private final VolumeField volume = new VolumeField();

    /**
     * For the net change field
     */
    private final NetChangeSignField netChangeSign = new NetChangeSignField();

    /**
     * Identifies the type of transaction
     */
    private final PriceIndicatorMarkerField priceIndicatorMarker = new PriceIndicatorMarkerField();

    /**
     * Unique Trade Number for this instrument
     */
    private final TradeNumberField tradeNumber = new TradeNumberField();

    /**
     * Identifier of an auction
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Future product symbology
     */
    private final FutureProduct futureProduct = new FutureProduct();

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
    private final List<Field> fields = Stream.of(List.<Field>of(exchangeId), futureProduct.fields(), List.<Field>of(volume), List.<Field>of(netChangeSign), List.<Field>of(priceIndicatorMarker), List.<Field>of(tradeNumber), List.<Field>of(auctionId)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange on which the trade occurred
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
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
     * Identifier of an auction
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * Future product symbology
     *
     * @return the FutureProduct record
     */
    public FutureProduct futureProduct() {
        return futureProduct;
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
        if (!futureProduct.parseFrom(data, cursor, end - 40)) {
            return false;
        }
        cursor += futureProduct.byteLength();
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!tradePriceFractionPair.parseFrom(data, cursor, end - 24)) {
            return false;
        }
        cursor += tradePriceFractionPair.byteLength();
        if (!netChangeSign.parse(data, cursor)) {
            return false;
        }
        cursor += NetChangeSignField.BYTE_LENGTH;
        if (!netChangeFuturesTradeMessageFractionPair.parseFrom(data, cursor, end - 15)) {
            return false;
        }
        cursor += netChangeFuturesTradeMessageFractionPair.byteLength();
        if (!priceIndicatorMarker.parse(data, cursor)) {
            return false;
        }
        cursor += PriceIndicatorMarkerField.BYTE_LENGTH;
        if (!tradeNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TradeNumberField.BYTE_LENGTH;
        return auctionId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = futureProduct.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = tradePriceFractionPair.encode(data, cursor);
        cursor = netChangeSign.encode(data, cursor);
        cursor = netChangeFuturesTradeMessageFractionPair.encode(data, cursor);
        cursor = priceIndicatorMarker.encode(data, cursor);
        cursor = tradeNumber.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
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
        futureProduct.clear();
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
            case "Volume" -> Optional.of(volume);
            case "NetChangeSign" -> Optional.of(netChangeSign);
            case "PriceIndicatorMarker" -> Optional.of(priceIndicatorMarker);
            case "TradeNumber" -> Optional.of(tradeNumber);
            case "AuctionId" -> Optional.of(auctionId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FuturesTradeMessage message)) {
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
        if (!(other instanceof FuturesTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && tradePriceFractionPair.equals(message.tradePriceFractionPair) && netChangeFuturesTradeMessageFractionPair.equals(message.netChangeFuturesTradeMessageFractionPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, tradePriceFractionPair, netChangeFuturesTradeMessageFractionPair);
    }
}
