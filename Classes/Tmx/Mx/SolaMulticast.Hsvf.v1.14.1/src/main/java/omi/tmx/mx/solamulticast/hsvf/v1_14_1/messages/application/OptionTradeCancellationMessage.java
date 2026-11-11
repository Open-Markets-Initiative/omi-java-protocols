package omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.TradePriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.AuctionIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.PriceIndicatorMarkerField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.TradeNumberField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.VolumeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OptionSymbol;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * Represents the OptionTradeCancellationMessage message from the SolaMulticast protocol.
 *
 * <p>A cancellation will reduce the total volume, value and transactions by the amount of the cancelled trade. A cancellation message is followed by a N: Option Summary which will reflect the corrected market.</p>
 */
public final class OptionTradeCancellationMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 51;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Option Trade Cancellation Message";

    /**
     * Exchange on which the trade occurred
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Number of contracts for the trade
     */
    private final VolumeField volume = new VolumeField();

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
     * Option symbology
     */
    private final OptionSymbol optionSymbol = new OptionSymbol();

    /**
     * Branch
     */
    private final TradePriceFractionPair tradePriceFractionPair = new TradePriceFractionPair();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, volume, priceIndicatorMarker, tradeNumber, auctionId);

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
     * Option symbology
     *
     * @return the OptionSymbol record
     */
    public OptionSymbol optionSymbol() {
        return optionSymbol;
    }

    /**
     * Branch
     *
     * @return the TradePriceFractionPair record
     */
    public TradePriceFractionPair tradePriceFractionPair() {
        return tradePriceFractionPair;
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
        if (!optionSymbol.parseFrom(data, cursor, end - 31)) {
            return false;
        }
        cursor += optionSymbol.byteLength();
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!tradePriceFractionPair.parseFrom(data, cursor, end - 15)) {
            return false;
        }
        cursor += tradePriceFractionPair.byteLength();
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
        cursor = optionSymbol.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = tradePriceFractionPair.encode(data, cursor);
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
        optionSymbol.clear();
        tradePriceFractionPair.clear();
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
        if (!optionSymbol.isRecognized()) {
            return false;
        }
        return tradePriceFractionPair.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!optionSymbol.isValid()) {
            return false;
        }
        if (!tradePriceFractionPair.isValid()) {
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
            case "PriceIndicatorMarker" -> Optional.of(priceIndicatorMarker);
            case "TradeNumber" -> Optional.of(tradeNumber);
            case "AuctionId" -> Optional.of(auctionId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OptionTradeCancellationMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(optionSymbol.diffFields(message.optionSymbol));
        changed.addAll(tradePriceFractionPair.diffFields(message.tradePriceFractionPair));
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
            optionSymbol.toFormattedString(builder, options);
            builder.append(", ");
            tradePriceFractionPair.toFormattedString(builder, options);
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
        optionSymbol.toFormattedString(builder, nested);
        tradePriceFractionPair.toFormattedString(builder, nested);
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
        if (!(other instanceof OptionTradeCancellationMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && optionSymbol.equals(message.optionSymbol) && tradePriceFractionPair.equals(message.tradePriceFractionPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, optionSymbol, tradePriceFractionPair);
    }
}
