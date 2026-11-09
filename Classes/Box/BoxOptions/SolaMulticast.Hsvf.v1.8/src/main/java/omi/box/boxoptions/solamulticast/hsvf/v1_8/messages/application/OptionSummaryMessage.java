package omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.AskPriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.AskPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.AskSizeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.BidPriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.BidPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.BidSizeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ExchangeIdField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.HighPriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.HighPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.LastPriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.LastPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.LowPriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.LowPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.NetChangeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.NetChangeFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.NetChangeSignField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.OpenInterestField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.OpenPriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.OpenPriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ReferencePriceField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.ReferencePriceFractionIndicatorField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.TickField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.UnderlyingSymbolField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.fields.VolumeField;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.structs.InstrumentDescription;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.structs.OptionMarker;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Field;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Message;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.PrintOptions;

/**
 * Represents the OptionSummaryMessage message from the SolaMulticast protocol.
 *
 * <p>Option Summary</p>
 */
public final class OptionSummaryMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 116;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Option Summary Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 8, 1 };

    /**
     * Q by default
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

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
     * Closing or most recent trade price
     */
    private final LastPriceField lastPrice = new LastPriceField();

    /**
     * Defines number of decimal places or fraction positions
     */
    private final LastPriceFractionIndicatorField lastPriceFractionIndicator = new LastPriceFractionIndicatorField();

    /**
     * Contains the outstanding number of contracts in the series
     */
    private final OpenInterestField openInterest = new OpenInterestField();

    /**
     * Determined by the difference between last price and the previous different trade price
     */
    private final TickField tick = new TickField();

    /**
     * Number of contracts for the trade
     */
    private final VolumeField volume = new VolumeField();

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
     * Price of the first trade of the day
     */
    private final OpenPriceField openPrice = new OpenPriceField();

    /**
     * Defines number of decimal places or fraction positions
     */
    private final OpenPriceFractionIndicatorField openPriceFractionIndicator = new OpenPriceFractionIndicatorField();

    /**
     * Highest trade price of the day or current high price if sent after a cancellation
     */
    private final HighPriceField highPrice = new HighPriceField();

    /**
     * Defines number of decimal places or fraction positions
     */
    private final HighPriceFractionIndicatorField highPriceFractionIndicator = new HighPriceFractionIndicatorField();

    /**
     * Lowest trade price of the day or current low price if sent after a cancellation
     */
    private final LowPriceField lowPrice = new LowPriceField();

    /**
     * Defines number of decimal places or fraction positions
     */
    private final LowPriceFractionIndicatorField lowPriceFractionIndicator = new LowPriceFractionIndicatorField();

    /**
     * Symbol root for the underlying security
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * Reference Price of the Option
     */
    private final ReferencePriceField referencePrice = new ReferencePriceField();

    /**
     * Number of decimal places or fraction positions
     */
    private final ReferencePriceFractionIndicatorField referencePriceFractionIndicator = new ReferencePriceFractionIndicatorField();

    /**
     * Instrument Description
     */
    private final InstrumentDescription instrumentDescription = new InstrumentDescription();

    /**
     * Option Marker
     */
    private final OptionMarker optionMarker = new OptionMarker();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(exchangeId), instrumentDescription.fields(), List.<Field>of(bidPrice), List.<Field>of(bidPriceFractionIndicator), List.<Field>of(bidSize), List.<Field>of(askPrice), List.<Field>of(askPriceFractionIndicator), List.<Field>of(askSize), List.<Field>of(lastPrice), List.<Field>of(lastPriceFractionIndicator), List.<Field>of(openInterest), List.<Field>of(tick), List.<Field>of(volume), List.<Field>of(netChangeSign), List.<Field>of(netChange), List.<Field>of(netChangeFractionIndicator), List.<Field>of(openPrice), List.<Field>of(openPriceFractionIndicator), List.<Field>of(highPrice), List.<Field>of(highPriceFractionIndicator), List.<Field>of(lowPrice), List.<Field>of(lowPriceFractionIndicator), optionMarker.fields(), List.<Field>of(underlyingSymbol), List.<Field>of(referencePrice), List.<Field>of(referencePriceFractionIndicator)).flatMap(List::stream).toList();

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
     * Contains the outstanding number of contracts in the series
     *
     * @return the OpenInterest field
     */
    public OpenInterestField openInterest() {
        return openInterest;
    }

    /**
     * Determined by the difference between last price and the previous different trade price
     *
     * @return the Tick field
     */
    public TickField tick() {
        return tick;
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
     * Symbol root for the underlying security
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * Reference Price of the Option
     *
     * @return the ReferencePrice field
     */
    public ReferencePriceField referencePrice() {
        return referencePrice;
    }

    /**
     * Number of decimal places or fraction positions
     *
     * @return the ReferencePriceFractionIndicator field
     */
    public ReferencePriceFractionIndicatorField referencePriceFractionIndicator() {
        return referencePriceFractionIndicator;
    }

    /**
     * Instrument Description
     *
     * @return the InstrumentDescription record
     */
    public InstrumentDescription instrumentDescription() {
        return instrumentDescription;
    }

    /**
     * Option Marker
     *
     * @return the OptionMarker record
     */
    public OptionMarker optionMarker() {
        return optionMarker;
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
        if (!instrumentDescription.parseFrom(data, cursor, end - 95)) {
            return false;
        }
        cursor += instrumentDescription.byteLength();
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
        if (!lastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastPriceField.BYTE_LENGTH;
        if (!lastPriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += LastPriceFractionIndicatorField.BYTE_LENGTH;
        if (!openInterest.parse(data, cursor)) {
            return false;
        }
        cursor += OpenInterestField.BYTE_LENGTH;
        if (!tick.parse(data, cursor)) {
            return false;
        }
        cursor += TickField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
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
        if (!openPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OpenPriceField.BYTE_LENGTH;
        if (!openPriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += OpenPriceFractionIndicatorField.BYTE_LENGTH;
        if (!highPrice.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceField.BYTE_LENGTH;
        if (!highPriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceFractionIndicatorField.BYTE_LENGTH;
        if (!lowPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceField.BYTE_LENGTH;
        if (!lowPriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceFractionIndicatorField.BYTE_LENGTH;
        if (!optionMarker.parseFrom(data, cursor, end - 17)) {
            return false;
        }
        cursor += optionMarker.byteLength();
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
        if (!referencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ReferencePriceField.BYTE_LENGTH;
        if (!referencePriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ReferencePriceFractionIndicatorField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = instrumentDescription.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = bidPriceFractionIndicator.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = askPriceFractionIndicator.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = lastPrice.encode(data, cursor);
        cursor = lastPriceFractionIndicator.encode(data, cursor);
        cursor = openInterest.encode(data, cursor);
        cursor = tick.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = netChangeSign.encode(data, cursor);
        cursor = netChange.encode(data, cursor);
        cursor = netChangeFractionIndicator.encode(data, cursor);
        cursor = openPrice.encode(data, cursor);
        cursor = openPriceFractionIndicator.encode(data, cursor);
        cursor = highPrice.encode(data, cursor);
        cursor = highPriceFractionIndicator.encode(data, cursor);
        cursor = lowPrice.encode(data, cursor);
        cursor = lowPriceFractionIndicator.encode(data, cursor);
        cursor = optionMarker.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = referencePrice.encode(data, cursor);
        cursor = referencePriceFractionIndicator.encode(data, cursor);
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
        instrumentDescription.clear();
        optionMarker.clear();
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
            case "BidPrice" -> Optional.of(bidPrice);
            case "BidPriceFractionIndicator" -> Optional.of(bidPriceFractionIndicator);
            case "BidSize" -> Optional.of(bidSize);
            case "AskPrice" -> Optional.of(askPrice);
            case "AskPriceFractionIndicator" -> Optional.of(askPriceFractionIndicator);
            case "AskSize" -> Optional.of(askSize);
            case "LastPrice" -> Optional.of(lastPrice);
            case "LastPriceFractionIndicator" -> Optional.of(lastPriceFractionIndicator);
            case "OpenInterest" -> Optional.of(openInterest);
            case "Tick" -> Optional.of(tick);
            case "Volume" -> Optional.of(volume);
            case "NetChangeSign" -> Optional.of(netChangeSign);
            case "NetChange" -> Optional.of(netChange);
            case "NetChangeFractionIndicator" -> Optional.of(netChangeFractionIndicator);
            case "OpenPrice" -> Optional.of(openPrice);
            case "OpenPriceFractionIndicator" -> Optional.of(openPriceFractionIndicator);
            case "HighPrice" -> Optional.of(highPrice);
            case "HighPriceFractionIndicator" -> Optional.of(highPriceFractionIndicator);
            case "LowPrice" -> Optional.of(lowPrice);
            case "LowPriceFractionIndicator" -> Optional.of(lowPriceFractionIndicator);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "ReferencePrice" -> Optional.of(referencePrice);
            case "ReferencePriceFractionIndicator" -> Optional.of(referencePriceFractionIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OptionSummaryMessage message)) {
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
        if (!(other instanceof OptionSummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
