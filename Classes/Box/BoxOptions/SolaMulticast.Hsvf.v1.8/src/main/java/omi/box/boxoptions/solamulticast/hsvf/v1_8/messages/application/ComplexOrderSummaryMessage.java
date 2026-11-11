package omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.AskPriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.AskPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.AskPriceSignField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.AskSizeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.BidPriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.BidPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.BidPriceSignField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.BidSizeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ComplexOrderInstrumentSymbolField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ExchangeIdField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.HighPriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.HighPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.HighPriceSignField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.LastPriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.LastPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.LastPriceSignField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.LowPriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.LowPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.LowPriceSignField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.NetChangeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.NetChangeFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.NetChangeSignField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.OpenPriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.OpenPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.OpenPriceSignField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.VolumeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Field;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Message;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.PrintOptions;

/**
 * Represents the ComplexOrderSummaryMessage message from the SolaMulticast protocol.
 *
 * <p>Complex Order Summary</p>
 */
public final class ComplexOrderSummaryMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 105;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Order Summary Message";

    /**
     * Q by default
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Complex Order Instrument symbol. The individual legs are defined in message type JS.
     */
    private final ComplexOrderInstrumentSymbolField complexOrderInstrumentSymbol = new ComplexOrderInstrumentSymbolField();

    /**
     * For Bid Price field
     */
    private final BidPriceSignField bidPriceSign = new BidPriceSignField();

    /**
     * Bid price for the option series
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * Defines number of decimal places or fraction positions
     */
    private final BidPriceFractionIndicatorField bidPriceFractionIndicator = new BidPriceFractionIndicatorField();

    /**
     * Number of option contracts represented by the Bid Price
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * For Ask Price field
     */
    private final AskPriceSignField askPriceSign = new AskPriceSignField();

    /**
     * Ask price for the option series
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * Defines number of decimal places or fraction positions.
     */
    private final AskPriceFractionIndicatorField askPriceFractionIndicator = new AskPriceFractionIndicatorField();

    /**
     * Number of option contracts represented by the Ask Price
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * Sign the Last Price
     */
    private final LastPriceSignField lastPriceSign = new LastPriceSignField();

    /**
     * Closing or most recent trade price
     */
    private final LastPriceField lastPrice = new LastPriceField();

    /**
     * Defines number of decimal places or fraction positions
     */
    private final LastPriceFractionIndicatorField lastPriceFractionIndicator = new LastPriceFractionIndicatorField();

    /**
     * + or - sign
     */
    private final OpenPriceSignField openPriceSign = new OpenPriceSignField();

    /**
     * Price of the first trade of the day
     */
    private final OpenPriceField openPrice = new OpenPriceField();

    /**
     * Defines number of decimal places or fraction positions
     */
    private final OpenPriceFractionIndicatorField openPriceFractionIndicator = new OpenPriceFractionIndicatorField();

    /**
     * + or - sign
     */
    private final HighPriceSignField highPriceSign = new HighPriceSignField();

    /**
     * Highest trade price of the day or current high price if sent after a cancellation
     */
    private final HighPriceField highPrice = new HighPriceField();

    /**
     * Defines number of decimal places or fraction positions
     */
    private final HighPriceFractionIndicatorField highPriceFractionIndicator = new HighPriceFractionIndicatorField();

    /**
     * + or - sign
     */
    private final LowPriceSignField lowPriceSign = new LowPriceSignField();

    /**
     * Lowest trade price of the day or current low price if sent after a cancellation
     */
    private final LowPriceField lowPrice = new LowPriceField();

    /**
     * Defines number of decimal places or fraction positions
     */
    private final LowPriceFractionIndicatorField lowPriceFractionIndicator = new LowPriceFractionIndicatorField();

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
     * Number of contracts for the trade
     */
    private final VolumeField volume = new VolumeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, complexOrderInstrumentSymbol, bidPriceSign, bidPrice, bidPriceFractionIndicator, bidSize, askPriceSign, askPrice, askPriceFractionIndicator, askSize, lastPriceSign, lastPrice, lastPriceFractionIndicator, openPriceSign, openPrice, openPriceFractionIndicator, highPriceSign, highPrice, highPriceFractionIndicator, lowPriceSign, lowPrice, lowPriceFractionIndicator, netChangeSign, netChange, netChangeFractionIndicator, volume);

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
     * For Bid Price field
     *
     * @return the BidPriceSign field
     */
    public BidPriceSignField bidPriceSign() {
        return bidPriceSign;
    }

    /**
     * Bid price for the option series
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * Defines number of decimal places or fraction positions
     *
     * @return the BidPriceFractionIndicator field
     */
    public BidPriceFractionIndicatorField bidPriceFractionIndicator() {
        return bidPriceFractionIndicator;
    }

    /**
     * Number of option contracts represented by the Bid Price
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * For Ask Price field
     *
     * @return the AskPriceSign field
     */
    public AskPriceSignField askPriceSign() {
        return askPriceSign;
    }

    /**
     * Ask price for the option series
     *
     * @return the AskPrice field
     */
    public AskPriceField askPrice() {
        return askPrice;
    }

    /**
     * Defines number of decimal places or fraction positions.
     *
     * @return the AskPriceFractionIndicator field
     */
    public AskPriceFractionIndicatorField askPriceFractionIndicator() {
        return askPriceFractionIndicator;
    }

    /**
     * Number of option contracts represented by the Ask Price
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
    }

    /**
     * Sign the Last Price
     *
     * @return the LastPriceSign field
     */
    public LastPriceSignField lastPriceSign() {
        return lastPriceSign;
    }

    /**
     * Closing or most recent trade price
     *
     * @return the LastPrice field
     */
    public LastPriceField lastPrice() {
        return lastPrice;
    }

    /**
     * Defines number of decimal places or fraction positions
     *
     * @return the LastPriceFractionIndicator field
     */
    public LastPriceFractionIndicatorField lastPriceFractionIndicator() {
        return lastPriceFractionIndicator;
    }

    /**
     * + or - sign
     *
     * @return the OpenPriceSign field
     */
    public OpenPriceSignField openPriceSign() {
        return openPriceSign;
    }

    /**
     * Price of the first trade of the day
     *
     * @return the OpenPrice field
     */
    public OpenPriceField openPrice() {
        return openPrice;
    }

    /**
     * Defines number of decimal places or fraction positions
     *
     * @return the OpenPriceFractionIndicator field
     */
    public OpenPriceFractionIndicatorField openPriceFractionIndicator() {
        return openPriceFractionIndicator;
    }

    /**
     * + or - sign
     *
     * @return the HighPriceSign field
     */
    public HighPriceSignField highPriceSign() {
        return highPriceSign;
    }

    /**
     * Highest trade price of the day or current high price if sent after a cancellation
     *
     * @return the HighPrice field
     */
    public HighPriceField highPrice() {
        return highPrice;
    }

    /**
     * Defines number of decimal places or fraction positions
     *
     * @return the HighPriceFractionIndicator field
     */
    public HighPriceFractionIndicatorField highPriceFractionIndicator() {
        return highPriceFractionIndicator;
    }

    /**
     * + or - sign
     *
     * @return the LowPriceSign field
     */
    public LowPriceSignField lowPriceSign() {
        return lowPriceSign;
    }

    /**
     * Lowest trade price of the day or current low price if sent after a cancellation
     *
     * @return the LowPrice field
     */
    public LowPriceField lowPrice() {
        return lowPrice;
    }

    /**
     * Defines number of decimal places or fraction positions
     *
     * @return the LowPriceFractionIndicator field
     */
    public LowPriceFractionIndicatorField lowPriceFractionIndicator() {
        return lowPriceFractionIndicator;
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
     * Number of contracts for the trade
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
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
        if (!complexOrderInstrumentSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexOrderInstrumentSymbolField.BYTE_LENGTH;
        if (!bidPriceSign.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceSignField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        if (!bidPriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceFractionIndicatorField.BYTE_LENGTH;
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!askPriceSign.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceSignField.BYTE_LENGTH;
        if (!askPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceField.BYTE_LENGTH;
        if (!askPriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceFractionIndicatorField.BYTE_LENGTH;
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
        if (!lastPriceSign.parse(data, cursor)) {
            return false;
        }
        cursor += LastPriceSignField.BYTE_LENGTH;
        if (!lastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastPriceField.BYTE_LENGTH;
        if (!lastPriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += LastPriceFractionIndicatorField.BYTE_LENGTH;
        if (!openPriceSign.parse(data, cursor)) {
            return false;
        }
        cursor += OpenPriceSignField.BYTE_LENGTH;
        if (!openPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OpenPriceField.BYTE_LENGTH;
        if (!openPriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += OpenPriceFractionIndicatorField.BYTE_LENGTH;
        if (!highPriceSign.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceSignField.BYTE_LENGTH;
        if (!highPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceField.BYTE_LENGTH;
        if (!highPriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceFractionIndicatorField.BYTE_LENGTH;
        if (!lowPriceSign.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceSignField.BYTE_LENGTH;
        if (!lowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceField.BYTE_LENGTH;
        if (!lowPriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceFractionIndicatorField.BYTE_LENGTH;
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
        return volume.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = complexOrderInstrumentSymbol.encode(data, cursor);
        cursor = bidPriceSign.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = bidPriceFractionIndicator.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = askPriceSign.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = askPriceFractionIndicator.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = lastPriceSign.encode(data, cursor);
        cursor = lastPrice.encode(data, cursor);
        cursor = lastPriceFractionIndicator.encode(data, cursor);
        cursor = openPriceSign.encode(data, cursor);
        cursor = openPrice.encode(data, cursor);
        cursor = openPriceFractionIndicator.encode(data, cursor);
        cursor = highPriceSign.encode(data, cursor);
        cursor = highPrice.encode(data, cursor);
        cursor = highPriceFractionIndicator.encode(data, cursor);
        cursor = lowPriceSign.encode(data, cursor);
        cursor = lowPrice.encode(data, cursor);
        cursor = lowPriceFractionIndicator.encode(data, cursor);
        cursor = netChangeSign.encode(data, cursor);
        cursor = netChange.encode(data, cursor);
        cursor = netChangeFractionIndicator.encode(data, cursor);
        cursor = volume.encode(data, cursor);
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
            case "BidPriceSign" -> Optional.of(bidPriceSign);
            case "BidPrice" -> Optional.of(bidPrice);
            case "BidPriceFractionIndicator" -> Optional.of(bidPriceFractionIndicator);
            case "BidSize" -> Optional.of(bidSize);
            case "AskPriceSign" -> Optional.of(askPriceSign);
            case "AskPrice" -> Optional.of(askPrice);
            case "AskPriceFractionIndicator" -> Optional.of(askPriceFractionIndicator);
            case "AskSize" -> Optional.of(askSize);
            case "LastPriceSign" -> Optional.of(lastPriceSign);
            case "LastPrice" -> Optional.of(lastPrice);
            case "LastPriceFractionIndicator" -> Optional.of(lastPriceFractionIndicator);
            case "OpenPriceSign" -> Optional.of(openPriceSign);
            case "OpenPrice" -> Optional.of(openPrice);
            case "OpenPriceFractionIndicator" -> Optional.of(openPriceFractionIndicator);
            case "HighPriceSign" -> Optional.of(highPriceSign);
            case "HighPrice" -> Optional.of(highPrice);
            case "HighPriceFractionIndicator" -> Optional.of(highPriceFractionIndicator);
            case "LowPriceSign" -> Optional.of(lowPriceSign);
            case "LowPrice" -> Optional.of(lowPrice);
            case "LowPriceFractionIndicator" -> Optional.of(lowPriceFractionIndicator);
            case "NetChangeSign" -> Optional.of(netChangeSign);
            case "NetChange" -> Optional.of(netChange);
            case "NetChangeFractionIndicator" -> Optional.of(netChangeFractionIndicator);
            case "Volume" -> Optional.of(volume);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexOrderSummaryMessage message)) {
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
        if (!(other instanceof ComplexOrderSummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
