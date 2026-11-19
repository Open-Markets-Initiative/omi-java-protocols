package omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.branches.AskPriceSummaryFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.branches.BidPriceSummaryFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.branches.HighPriceFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.branches.LastPriceFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.branches.LowPriceFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.branches.NetChangeFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.branches.OpenPriceFractionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.AskPriceSignField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.AskSizeField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.BidPriceSignField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.BidSizeField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.ExchangeIdField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.HighPriceSignField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.LastPriceSignField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.LowPriceSignField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.NetChangeSignField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.OpenPriceSignField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.ReasonField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.StrategySymbolField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.fields.VolumeField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.structs.LongMessageHeader;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.types.Message;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_12_2.types.PrintOptions;

/**
 * Represents the StrategySummaryMessage message from the SolaTcpRetransmission protocol.
 *
 * <p>A Strategy Summary is sent following a Strategy Trade Cancellation. A Strategy Summary is also sent each day at the start of the day in order to provide a list of Strategies which will be trading each day. At that point, all price fields will contain zero values. Any Strategy Summary sent after the QS: Beginning of Strategy Summary message contains the list of trading instruments for the day (sent prior to market opening) or the summaries after the close of the market for Bourse de Montréal Inc. Strategies.</p>
 */
public final class StrategySummaryMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 125;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Strategy Summary Message";

    /**
     * Exchange Id
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Strategy Symbol
     */
    private final StrategySymbolField strategySymbol = new StrategySymbolField();

    /**
     * Bid Price Sign
     */
    private final BidPriceSignField bidPriceSign = new BidPriceSignField();

    /**
     * Bid Size
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Ask Price Sign
     */
    private final AskPriceSignField askPriceSign = new AskPriceSignField();

    /**
     * Ask Size
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * Last Price Sign
     */
    private final LastPriceSignField lastPriceSign = new LastPriceSignField();

    /**
     * Open Price Sign
     */
    private final OpenPriceSignField openPriceSign = new OpenPriceSignField();

    /**
     * High Price Sign
     */
    private final HighPriceSignField highPriceSign = new HighPriceSignField();

    /**
     * Low Price Sign
     */
    private final LowPriceSignField lowPriceSign = new LowPriceSignField();

    /**
     * Net Change Sign
     */
    private final NetChangeSignField netChangeSign = new NetChangeSignField();

    /**
     * Volume
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Reason
     */
    private final ReasonField reason = new ReasonField();

    /**
     * The guide states these fields once, as Table 3: Long Message Header, for every message the eight Table 2 frames do not. Sequence Number and Message Type are read by the packet, so they are not repeated here.
     */
    private final LongMessageHeader longMessageHeader = new LongMessageHeader();

    /**
     * Branch
     */
    private final BidPriceSummaryFractionPair bidPriceSummaryFractionPair = new BidPriceSummaryFractionPair();

    /**
     * Branch
     */
    private final AskPriceSummaryFractionPair askPriceSummaryFractionPair = new AskPriceSummaryFractionPair();

    /**
     * Branch
     */
    private final LastPriceFractionPair lastPriceFractionPair = new LastPriceFractionPair();

    /**
     * Branch
     */
    private final OpenPriceFractionPair openPriceFractionPair = new OpenPriceFractionPair();

    /**
     * Branch
     */
    private final HighPriceFractionPair highPriceFractionPair = new HighPriceFractionPair();

    /**
     * Branch
     */
    private final LowPriceFractionPair lowPriceFractionPair = new LowPriceFractionPair();

    /**
     * Branch
     */
    private final NetChangeFractionPair netChangeFractionPair = new NetChangeFractionPair();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(longMessageHeader.fields(), List.<Field>of(exchangeId), List.<Field>of(strategySymbol), List.<Field>of(bidPriceSign), List.<Field>of(bidSize), List.<Field>of(askPriceSign), List.<Field>of(askSize), List.<Field>of(lastPriceSign), List.<Field>of(openPriceSign), List.<Field>of(highPriceSign), List.<Field>of(lowPriceSign), List.<Field>of(netChangeSign), List.<Field>of(volume), List.<Field>of(reason)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange Id
     *
     * @return the ExchangeId field
     */
    public ExchangeIdField exchangeId() {
        return exchangeId;
    }

    /**
     * Strategy Symbol
     *
     * @return the StrategySymbol field
     */
    public StrategySymbolField strategySymbol() {
        return strategySymbol;
    }

    /**
     * Bid Price Sign
     *
     * @return the BidPriceSign field
     */
    public BidPriceSignField bidPriceSign() {
        return bidPriceSign;
    }

    /**
     * Bid Size
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * Ask Price Sign
     *
     * @return the AskPriceSign field
     */
    public AskPriceSignField askPriceSign() {
        return askPriceSign;
    }

    /**
     * Ask Size
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
    }

    /**
     * Last Price Sign
     *
     * @return the LastPriceSign field
     */
    public LastPriceSignField lastPriceSign() {
        return lastPriceSign;
    }

    /**
     * Open Price Sign
     *
     * @return the OpenPriceSign field
     */
    public OpenPriceSignField openPriceSign() {
        return openPriceSign;
    }

    /**
     * High Price Sign
     *
     * @return the HighPriceSign field
     */
    public HighPriceSignField highPriceSign() {
        return highPriceSign;
    }

    /**
     * Low Price Sign
     *
     * @return the LowPriceSign field
     */
    public LowPriceSignField lowPriceSign() {
        return lowPriceSign;
    }

    /**
     * Net Change Sign
     *
     * @return the NetChangeSign field
     */
    public NetChangeSignField netChangeSign() {
        return netChangeSign;
    }

    /**
     * Volume
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * Reason
     *
     * @return the Reason field
     */
    public ReasonField reason() {
        return reason;
    }

    /**
     * The guide states these fields once, as Table 3: Long Message Header, for every message the eight Table 2 frames do not. Sequence Number and Message Type are read by the packet, so they are not repeated here.
     *
     * @return the LongMessageHeader record
     */
    public LongMessageHeader longMessageHeader() {
        return longMessageHeader;
    }

    /**
     * Branch
     *
     * @return the BidPriceSummaryFractionPair record
     */
    public BidPriceSummaryFractionPair bidPriceSummaryFractionPair() {
        return bidPriceSummaryFractionPair;
    }

    /**
     * Branch
     *
     * @return the AskPriceSummaryFractionPair record
     */
    public AskPriceSummaryFractionPair askPriceSummaryFractionPair() {
        return askPriceSummaryFractionPair;
    }

    /**
     * Branch
     *
     * @return the LastPriceFractionPair record
     */
    public LastPriceFractionPair lastPriceFractionPair() {
        return lastPriceFractionPair;
    }

    /**
     * Branch
     *
     * @return the OpenPriceFractionPair record
     */
    public OpenPriceFractionPair openPriceFractionPair() {
        return openPriceFractionPair;
    }

    /**
     * Branch
     *
     * @return the HighPriceFractionPair record
     */
    public HighPriceFractionPair highPriceFractionPair() {
        return highPriceFractionPair;
    }

    /**
     * Branch
     *
     * @return the LowPriceFractionPair record
     */
    public LowPriceFractionPair lowPriceFractionPair() {
        return lowPriceFractionPair;
    }

    /**
     * Branch
     *
     * @return the NetChangeFractionPair record
     */
    public NetChangeFractionPair netChangeFractionPair() {
        return netChangeFractionPair;
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
        if (!longMessageHeader.parseFrom(data, cursor, end - 113)) {
            return false;
        }
        cursor += longMessageHeader.byteLength();
        if (!exchangeId.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeIdField.BYTE_LENGTH;
        if (!strategySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += StrategySymbolField.BYTE_LENGTH;
        if (!bidPriceSign.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceSignField.BYTE_LENGTH;
        if (!bidPriceSummaryFractionPair.parseFrom(data, cursor, end - 73)) {
            return false;
        }
        cursor += bidPriceSummaryFractionPair.byteLength();
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!askPriceSign.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceSignField.BYTE_LENGTH;
        if (!askPriceSummaryFractionPair.parseFrom(data, cursor, end - 59)) {
            return false;
        }
        cursor += askPriceSummaryFractionPair.byteLength();
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
        if (!lastPriceSign.parse(data, cursor)) {
            return false;
        }
        cursor += LastPriceSignField.BYTE_LENGTH;
        if (!lastPriceFractionPair.parseFrom(data, cursor, end - 45)) {
            return false;
        }
        cursor += lastPriceFractionPair.byteLength();
        if (!openPriceSign.parse(data, cursor)) {
            return false;
        }
        cursor += OpenPriceSignField.BYTE_LENGTH;
        if (!openPriceFractionPair.parseFrom(data, cursor, end - 36)) {
            return false;
        }
        cursor += openPriceFractionPair.byteLength();
        if (!highPriceSign.parse(data, cursor)) {
            return false;
        }
        cursor += HighPriceSignField.BYTE_LENGTH;
        if (!highPriceFractionPair.parseFrom(data, cursor, end - 27)) {
            return false;
        }
        cursor += highPriceFractionPair.byteLength();
        if (!lowPriceSign.parse(data, cursor)) {
            return false;
        }
        cursor += LowPriceSignField.BYTE_LENGTH;
        if (!lowPriceFractionPair.parseFrom(data, cursor, end - 18)) {
            return false;
        }
        cursor += lowPriceFractionPair.byteLength();
        if (!netChangeSign.parse(data, cursor)) {
            return false;
        }
        cursor += NetChangeSignField.BYTE_LENGTH;
        if (!netChangeFractionPair.parseFrom(data, cursor, end - 9)) {
            return false;
        }
        cursor += netChangeFractionPair.byteLength();
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        return reason.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = longMessageHeader.encode(data, cursor);
        cursor = exchangeId.encode(data, cursor);
        cursor = strategySymbol.encode(data, cursor);
        cursor = bidPriceSign.encode(data, cursor);
        cursor = bidPriceSummaryFractionPair.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = askPriceSign.encode(data, cursor);
        cursor = askPriceSummaryFractionPair.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = lastPriceSign.encode(data, cursor);
        cursor = lastPriceFractionPair.encode(data, cursor);
        cursor = openPriceSign.encode(data, cursor);
        cursor = openPriceFractionPair.encode(data, cursor);
        cursor = highPriceSign.encode(data, cursor);
        cursor = highPriceFractionPair.encode(data, cursor);
        cursor = lowPriceSign.encode(data, cursor);
        cursor = lowPriceFractionPair.encode(data, cursor);
        cursor = netChangeSign.encode(data, cursor);
        cursor = netChangeFractionPair.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = reason.encode(data, cursor);
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
        longMessageHeader.clear();
        bidPriceSummaryFractionPair.clear();
        askPriceSummaryFractionPair.clear();
        lastPriceFractionPair.clear();
        openPriceFractionPair.clear();
        highPriceFractionPair.clear();
        lowPriceFractionPair.clear();
        netChangeFractionPair.clear();
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
        if (!bidPriceSummaryFractionPair.isRecognized()) {
            return false;
        }
        if (!askPriceSummaryFractionPair.isRecognized()) {
            return false;
        }
        if (!lastPriceFractionPair.isRecognized()) {
            return false;
        }
        if (!openPriceFractionPair.isRecognized()) {
            return false;
        }
        if (!highPriceFractionPair.isRecognized()) {
            return false;
        }
        if (!lowPriceFractionPair.isRecognized()) {
            return false;
        }
        return netChangeFractionPair.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!bidPriceSummaryFractionPair.isValid()) {
            return false;
        }
        if (!askPriceSummaryFractionPair.isValid()) {
            return false;
        }
        if (!lastPriceFractionPair.isValid()) {
            return false;
        }
        if (!openPriceFractionPair.isValid()) {
            return false;
        }
        if (!highPriceFractionPair.isValid()) {
            return false;
        }
        if (!lowPriceFractionPair.isValid()) {
            return false;
        }
        if (!netChangeFractionPair.isValid()) {
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
            case "StrategySymbol" -> Optional.of(strategySymbol);
            case "BidPriceSign" -> Optional.of(bidPriceSign);
            case "BidSize" -> Optional.of(bidSize);
            case "AskPriceSign" -> Optional.of(askPriceSign);
            case "AskSize" -> Optional.of(askSize);
            case "LastPriceSign" -> Optional.of(lastPriceSign);
            case "OpenPriceSign" -> Optional.of(openPriceSign);
            case "HighPriceSign" -> Optional.of(highPriceSign);
            case "LowPriceSign" -> Optional.of(lowPriceSign);
            case "NetChangeSign" -> Optional.of(netChangeSign);
            case "Volume" -> Optional.of(volume);
            case "Reason" -> Optional.of(reason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StrategySummaryMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(bidPriceSummaryFractionPair.diffFields(message.bidPriceSummaryFractionPair));
        changed.addAll(askPriceSummaryFractionPair.diffFields(message.askPriceSummaryFractionPair));
        changed.addAll(lastPriceFractionPair.diffFields(message.lastPriceFractionPair));
        changed.addAll(openPriceFractionPair.diffFields(message.openPriceFractionPair));
        changed.addAll(highPriceFractionPair.diffFields(message.highPriceFractionPair));
        changed.addAll(lowPriceFractionPair.diffFields(message.lowPriceFractionPair));
        changed.addAll(netChangeFractionPair.diffFields(message.netChangeFractionPair));
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
            bidPriceSummaryFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            askPriceSummaryFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            lastPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            openPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            highPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            lowPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            netChangeFractionPair.toFormattedString(builder, options);
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
        bidPriceSummaryFractionPair.toFormattedString(builder, nested);
        askPriceSummaryFractionPair.toFormattedString(builder, nested);
        lastPriceFractionPair.toFormattedString(builder, nested);
        openPriceFractionPair.toFormattedString(builder, nested);
        highPriceFractionPair.toFormattedString(builder, nested);
        lowPriceFractionPair.toFormattedString(builder, nested);
        netChangeFractionPair.toFormattedString(builder, nested);
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
        if (!(other instanceof StrategySummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && bidPriceSummaryFractionPair.equals(message.bidPriceSummaryFractionPair) && askPriceSummaryFractionPair.equals(message.askPriceSummaryFractionPair) && lastPriceFractionPair.equals(message.lastPriceFractionPair) && openPriceFractionPair.equals(message.openPriceFractionPair) && highPriceFractionPair.equals(message.highPriceFractionPair) && lowPriceFractionPair.equals(message.lowPriceFractionPair) && netChangeFractionPair.equals(message.netChangeFractionPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, bidPriceSummaryFractionPair, askPriceSummaryFractionPair, lastPriceFractionPair, openPriceFractionPair, highPriceFractionPair, lowPriceFractionPair, netChangeFractionPair);
    }
}
