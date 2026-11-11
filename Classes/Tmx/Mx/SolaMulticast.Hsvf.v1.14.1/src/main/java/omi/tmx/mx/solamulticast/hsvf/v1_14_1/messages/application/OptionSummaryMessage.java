package omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.AskPriceSummaryFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.BidPriceSummaryFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.ClosingPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.HighPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.LastPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.LowPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.NetChangeOptionSummaryMessageFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.OpenPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.PreviousClosingPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.AskSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.BidSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.NetChangeSignField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.OpenInterestDateField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.OpenInterestField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.OptionMarkerField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.ReasonField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.TickField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.VolumeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.OptionSymbol;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * Represents the OptionSummaryMessage message from the SolaMulticast protocol.
 *
 * <p>An option summary message is sent following an option trade cancellation. An option summary message is also sent each day at the start of the day in order to provide a list of options which will be trading each day. At that point, all price fields with the exception of Last Price (closing from the previous day), will contain zero values. Any option summary sent after the Q: Beginning of Option Summary message contains the list of trading instruments for the day (sent prior to market opening) or the summaries after the close of the market for Bourse de Montréal Inc. options.</p>
 */
public final class OptionSummaryMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 128;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Option Summary Message";

    /**
     * Exchange on which the trade occurred
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Number of option contracts represented by the Bid Price. If size is greater than 99999, the 5th character becomes an exponent
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Number of option contracts represented by the Ask Price. If size is greater than 99999, the 5th character becomes an exponent
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * This field contains current outstanding number of contracts in the series Updated on a trade by trade basis Refer to Indicator Code
     */
    private final OpenInterestField openInterest = new OpenInterestField();

    /**
     * Open interest date
     */
    private final OpenInterestDateField openInterestDate = new OpenInterestDateField();

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
     * Refer to Options Markers
     */
    private final OptionMarkerField optionMarker = new OptionMarkerField();

    /**
     * Indicates the reason of the summary message
     */
    private final ReasonField reason = new ReasonField();

    /**
     * Option symbology
     */
    private final OptionSymbol optionSymbol = new OptionSymbol();

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
    private final NetChangeOptionSummaryMessageFractionPair netChangeOptionSummaryMessageFractionPair = new NetChangeOptionSummaryMessageFractionPair();

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
    private final ClosingPriceFractionPair closingPriceFractionPair = new ClosingPriceFractionPair();

    /**
     * Branch
     */
    private final PreviousClosingPriceFractionPair previousClosingPriceFractionPair = new PreviousClosingPriceFractionPair();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, bidSize, askSize, openInterest, openInterestDate, tick, volume, netChangeSign, optionMarker, reason);

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
     * Number of option contracts represented by the Bid Price. If size is greater than 99999, the 5th character becomes an exponent
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * Number of option contracts represented by the Ask Price. If size is greater than 99999, the 5th character becomes an exponent
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
    }

    /**
     * This field contains current outstanding number of contracts in the series Updated on a trade by trade basis Refer to Indicator Code
     *
     * @return the OpenInterest field
     */
    public OpenInterestField openInterest() {
        return openInterest;
    }

    /**
     * Open interest date
     *
     * @return the OpenInterestDate field
     */
    public OpenInterestDateField openInterestDate() {
        return openInterestDate;
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
     * Refer to Options Markers
     *
     * @return the OptionMarker field
     */
    public OptionMarkerField optionMarker() {
        return optionMarker;
    }

    /**
     * Indicates the reason of the summary message
     *
     * @return the Reason field
     */
    public ReasonField reason() {
        return reason;
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
     * @return the NetChangeOptionSummaryMessageFractionPair record
     */
    public NetChangeOptionSummaryMessageFractionPair netChangeOptionSummaryMessageFractionPair() {
        return netChangeOptionSummaryMessageFractionPair;
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
     * @return the ClosingPriceFractionPair record
     */
    public ClosingPriceFractionPair closingPriceFractionPair() {
        return closingPriceFractionPair;
    }

    /**
     * Branch
     *
     * @return the PreviousClosingPriceFractionPair record
     */
    public PreviousClosingPriceFractionPair previousClosingPriceFractionPair() {
        return previousClosingPriceFractionPair;
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
        if (!optionSymbol.parseFrom(data, cursor, end - 108)) {
            return false;
        }
        cursor += optionSymbol.byteLength();
        if (!bidPriceSummaryFractionPair.parseFrom(data, cursor, end - 100)) {
            return false;
        }
        cursor += bidPriceSummaryFractionPair.byteLength();
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!askPriceSummaryFractionPair.parseFrom(data, cursor, end - 87)) {
            return false;
        }
        cursor += askPriceSummaryFractionPair.byteLength();
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
        if (!lastPriceFractionPair.parseFrom(data, cursor, end - 74)) {
            return false;
        }
        cursor += lastPriceFractionPair.byteLength();
        if (!openInterest.parse(data, cursor)) {
            return false;
        }
        cursor += OpenInterestField.BYTE_LENGTH;
        if (!openInterestDate.parse(data, cursor)) {
            return false;
        }
        cursor += OpenInterestDateField.BYTE_LENGTH;
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
        if (!netChangeOptionSummaryMessageFractionPair.parseFrom(data, cursor, end - 43)) {
            return false;
        }
        cursor += netChangeOptionSummaryMessageFractionPair.byteLength();
        if (!openPriceFractionPair.parseFrom(data, cursor, end - 35)) {
            return false;
        }
        cursor += openPriceFractionPair.byteLength();
        if (!highPriceFractionPair.parseFrom(data, cursor, end - 27)) {
            return false;
        }
        cursor += highPriceFractionPair.byteLength();
        if (!lowPriceFractionPair.parseFrom(data, cursor, end - 19)) {
            return false;
        }
        cursor += lowPriceFractionPair.byteLength();
        if (!optionMarker.parse(data, cursor)) {
            return false;
        }
        cursor += OptionMarkerField.BYTE_LENGTH;
        if (!closingPriceFractionPair.parseFrom(data, cursor, end - 9)) {
            return false;
        }
        cursor += closingPriceFractionPair.byteLength();
        if (!previousClosingPriceFractionPair.parseFrom(data, cursor, end - 1)) {
            return false;
        }
        cursor += previousClosingPriceFractionPair.byteLength();
        return reason.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = optionSymbol.encode(data, cursor);
        cursor = bidPriceSummaryFractionPair.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = askPriceSummaryFractionPair.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = lastPriceFractionPair.encode(data, cursor);
        cursor = openInterest.encode(data, cursor);
        cursor = openInterestDate.encode(data, cursor);
        cursor = tick.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = netChangeSign.encode(data, cursor);
        cursor = netChangeOptionSummaryMessageFractionPair.encode(data, cursor);
        cursor = openPriceFractionPair.encode(data, cursor);
        cursor = highPriceFractionPair.encode(data, cursor);
        cursor = lowPriceFractionPair.encode(data, cursor);
        cursor = optionMarker.encode(data, cursor);
        cursor = closingPriceFractionPair.encode(data, cursor);
        cursor = previousClosingPriceFractionPair.encode(data, cursor);
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
        optionSymbol.clear();
        bidPriceSummaryFractionPair.clear();
        askPriceSummaryFractionPair.clear();
        lastPriceFractionPair.clear();
        netChangeOptionSummaryMessageFractionPair.clear();
        openPriceFractionPair.clear();
        highPriceFractionPair.clear();
        lowPriceFractionPair.clear();
        closingPriceFractionPair.clear();
        previousClosingPriceFractionPair.clear();
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
        if (!bidPriceSummaryFractionPair.isRecognized()) {
            return false;
        }
        if (!askPriceSummaryFractionPair.isRecognized()) {
            return false;
        }
        if (!lastPriceFractionPair.isRecognized()) {
            return false;
        }
        if (!netChangeOptionSummaryMessageFractionPair.isRecognized()) {
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
        if (!closingPriceFractionPair.isRecognized()) {
            return false;
        }
        return previousClosingPriceFractionPair.isRecognized();
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
        if (!bidPriceSummaryFractionPair.isValid()) {
            return false;
        }
        if (!askPriceSummaryFractionPair.isValid()) {
            return false;
        }
        if (!lastPriceFractionPair.isValid()) {
            return false;
        }
        if (!netChangeOptionSummaryMessageFractionPair.isValid()) {
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
        if (!closingPriceFractionPair.isValid()) {
            return false;
        }
        if (!previousClosingPriceFractionPair.isValid()) {
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
            case "BidSize" -> Optional.of(bidSize);
            case "AskSize" -> Optional.of(askSize);
            case "OpenInterest" -> Optional.of(openInterest);
            case "OpenInterestDate" -> Optional.of(openInterestDate);
            case "Tick" -> Optional.of(tick);
            case "Volume" -> Optional.of(volume);
            case "NetChangeSign" -> Optional.of(netChangeSign);
            case "OptionMarker" -> Optional.of(optionMarker);
            case "Reason" -> Optional.of(reason);
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
        changed.addAll(optionSymbol.diffFields(message.optionSymbol));
        changed.addAll(bidPriceSummaryFractionPair.diffFields(message.bidPriceSummaryFractionPair));
        changed.addAll(askPriceSummaryFractionPair.diffFields(message.askPriceSummaryFractionPair));
        changed.addAll(lastPriceFractionPair.diffFields(message.lastPriceFractionPair));
        changed.addAll(netChangeOptionSummaryMessageFractionPair.diffFields(message.netChangeOptionSummaryMessageFractionPair));
        changed.addAll(openPriceFractionPair.diffFields(message.openPriceFractionPair));
        changed.addAll(highPriceFractionPair.diffFields(message.highPriceFractionPair));
        changed.addAll(lowPriceFractionPair.diffFields(message.lowPriceFractionPair));
        changed.addAll(closingPriceFractionPair.diffFields(message.closingPriceFractionPair));
        changed.addAll(previousClosingPriceFractionPair.diffFields(message.previousClosingPriceFractionPair));
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
            bidPriceSummaryFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            askPriceSummaryFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            lastPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            netChangeOptionSummaryMessageFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            openPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            highPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            lowPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            closingPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            previousClosingPriceFractionPair.toFormattedString(builder, options);
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
        bidPriceSummaryFractionPair.toFormattedString(builder, nested);
        askPriceSummaryFractionPair.toFormattedString(builder, nested);
        lastPriceFractionPair.toFormattedString(builder, nested);
        netChangeOptionSummaryMessageFractionPair.toFormattedString(builder, nested);
        openPriceFractionPair.toFormattedString(builder, nested);
        highPriceFractionPair.toFormattedString(builder, nested);
        lowPriceFractionPair.toFormattedString(builder, nested);
        closingPriceFractionPair.toFormattedString(builder, nested);
        previousClosingPriceFractionPair.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && optionSymbol.equals(message.optionSymbol) && bidPriceSummaryFractionPair.equals(message.bidPriceSummaryFractionPair) && askPriceSummaryFractionPair.equals(message.askPriceSummaryFractionPair) && lastPriceFractionPair.equals(message.lastPriceFractionPair) && netChangeOptionSummaryMessageFractionPair.equals(message.netChangeOptionSummaryMessageFractionPair) && openPriceFractionPair.equals(message.openPriceFractionPair) && highPriceFractionPair.equals(message.highPriceFractionPair) && lowPriceFractionPair.equals(message.lowPriceFractionPair) && closingPriceFractionPair.equals(message.closingPriceFractionPair) && previousClosingPriceFractionPair.equals(message.previousClosingPriceFractionPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, optionSymbol, bidPriceSummaryFractionPair, askPriceSummaryFractionPair, lastPriceFractionPair, netChangeOptionSummaryMessageFractionPair, openPriceFractionPair, highPriceFractionPair, lowPriceFractionPair, closingPriceFractionPair, previousClosingPriceFractionPair);
    }
}
