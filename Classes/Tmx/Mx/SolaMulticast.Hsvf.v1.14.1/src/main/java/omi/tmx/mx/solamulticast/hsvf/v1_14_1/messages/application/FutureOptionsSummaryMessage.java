package omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.AskPriceSummaryFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.BidPriceSummaryFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.HighPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.LastPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.LowPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.NetChangeFutureOptionsSummaryMessageFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.OpeningPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.PreviousSettlementPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.SettlementPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.AskSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.BidSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.NetChangeSignField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.OpenInterestDateField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.OpenInterestField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.ReasonField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.TickField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.VolumeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.FutureOptionSymbol;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * Represents the FutureOptionsSummaryMessage message from the SolaMulticast protocol.
 *
 * <p>A Future Options Summary is sent following a future option trade cancellation. A Future options summary is also sent each day at the start of the day in order to provide a list of Future options which will be trading each day. At that point, all price fields with the exception of Previous Settlement Price (closing from previous day) will contain zero values. Any Future Options Summary sent after the QB: Beginning of Future Options Summary message contains the list of trading instruments for the day (sent prior to market opening) or the summaries after the close of the market for Bourse de Montréal Inc. Future options.</p>
 */
public final class FutureOptionsSummaryMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 127;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Future Options Summary Message";

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
     * Outstanding number of contracts in the series as of the previous day
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
     * Indicates the reason of the summary message
     */
    private final ReasonField reason = new ReasonField();

    /**
     * Option on future symbology
     */
    private final FutureOptionSymbol futureOptionSymbol = new FutureOptionSymbol();

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
    private final NetChangeFutureOptionsSummaryMessageFractionPair netChangeFutureOptionsSummaryMessageFractionPair = new NetChangeFutureOptionsSummaryMessageFractionPair();

    /**
     * Branch
     */
    private final OpeningPriceFractionPair openingPriceFractionPair = new OpeningPriceFractionPair();

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
    private final SettlementPriceFractionPair settlementPriceFractionPair = new SettlementPriceFractionPair();

    /**
     * Branch
     */
    private final PreviousSettlementPriceFractionPair previousSettlementPriceFractionPair = new PreviousSettlementPriceFractionPair();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, bidSize, askSize, openInterest, openInterestDate, tick, volume, netChangeSign, reason);

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
     * Outstanding number of contracts in the series as of the previous day
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
     * Indicates the reason of the summary message
     *
     * @return the Reason field
     */
    public ReasonField reason() {
        return reason;
    }

    /**
     * Option on future symbology
     *
     * @return the FutureOptionSymbol record
     */
    public FutureOptionSymbol futureOptionSymbol() {
        return futureOptionSymbol;
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
     * @return the NetChangeFutureOptionsSummaryMessageFractionPair record
     */
    public NetChangeFutureOptionsSummaryMessageFractionPair netChangeFutureOptionsSummaryMessageFractionPair() {
        return netChangeFutureOptionsSummaryMessageFractionPair;
    }

    /**
     * Branch
     *
     * @return the OpeningPriceFractionPair record
     */
    public OpeningPriceFractionPair openingPriceFractionPair() {
        return openingPriceFractionPair;
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
     * @return the SettlementPriceFractionPair record
     */
    public SettlementPriceFractionPair settlementPriceFractionPair() {
        return settlementPriceFractionPair;
    }

    /**
     * Branch
     *
     * @return the PreviousSettlementPriceFractionPair record
     */
    public PreviousSettlementPriceFractionPair previousSettlementPriceFractionPair() {
        return previousSettlementPriceFractionPair;
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
        if (!futureOptionSymbol.parseFrom(data, cursor, end - 106)) {
            return false;
        }
        cursor += futureOptionSymbol.byteLength();
        if (!bidPriceSummaryFractionPair.parseFrom(data, cursor, end - 98)) {
            return false;
        }
        cursor += bidPriceSummaryFractionPair.byteLength();
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!askPriceSummaryFractionPair.parseFrom(data, cursor, end - 85)) {
            return false;
        }
        cursor += askPriceSummaryFractionPair.byteLength();
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
        if (!lastPriceFractionPair.parseFrom(data, cursor, end - 72)) {
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
        if (!netChangeFutureOptionsSummaryMessageFractionPair.parseFrom(data, cursor, end - 41)) {
            return false;
        }
        cursor += netChangeFutureOptionsSummaryMessageFractionPair.byteLength();
        if (!openingPriceFractionPair.parseFrom(data, cursor, end - 33)) {
            return false;
        }
        cursor += openingPriceFractionPair.byteLength();
        if (!highPriceFractionPair.parseFrom(data, cursor, end - 25)) {
            return false;
        }
        cursor += highPriceFractionPair.byteLength();
        if (!lowPriceFractionPair.parseFrom(data, cursor, end - 17)) {
            return false;
        }
        cursor += lowPriceFractionPair.byteLength();
        if (!settlementPriceFractionPair.parseFrom(data, cursor, end - 9)) {
            return false;
        }
        cursor += settlementPriceFractionPair.byteLength();
        if (!previousSettlementPriceFractionPair.parseFrom(data, cursor, end - 1)) {
            return false;
        }
        cursor += previousSettlementPriceFractionPair.byteLength();
        return reason.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = exchangeId.encode(data, cursor);
        cursor = futureOptionSymbol.encode(data, cursor);
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
        cursor = netChangeFutureOptionsSummaryMessageFractionPair.encode(data, cursor);
        cursor = openingPriceFractionPair.encode(data, cursor);
        cursor = highPriceFractionPair.encode(data, cursor);
        cursor = lowPriceFractionPair.encode(data, cursor);
        cursor = settlementPriceFractionPair.encode(data, cursor);
        cursor = previousSettlementPriceFractionPair.encode(data, cursor);
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
        futureOptionSymbol.clear();
        bidPriceSummaryFractionPair.clear();
        askPriceSummaryFractionPair.clear();
        lastPriceFractionPair.clear();
        netChangeFutureOptionsSummaryMessageFractionPair.clear();
        openingPriceFractionPair.clear();
        highPriceFractionPair.clear();
        lowPriceFractionPair.clear();
        settlementPriceFractionPair.clear();
        previousSettlementPriceFractionPair.clear();
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
        if (!futureOptionSymbol.isRecognized()) {
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
        if (!netChangeFutureOptionsSummaryMessageFractionPair.isRecognized()) {
            return false;
        }
        if (!openingPriceFractionPair.isRecognized()) {
            return false;
        }
        if (!highPriceFractionPair.isRecognized()) {
            return false;
        }
        if (!lowPriceFractionPair.isRecognized()) {
            return false;
        }
        if (!settlementPriceFractionPair.isRecognized()) {
            return false;
        }
        return previousSettlementPriceFractionPair.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!futureOptionSymbol.isValid()) {
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
        if (!netChangeFutureOptionsSummaryMessageFractionPair.isValid()) {
            return false;
        }
        if (!openingPriceFractionPair.isValid()) {
            return false;
        }
        if (!highPriceFractionPair.isValid()) {
            return false;
        }
        if (!lowPriceFractionPair.isValid()) {
            return false;
        }
        if (!settlementPriceFractionPair.isValid()) {
            return false;
        }
        if (!previousSettlementPriceFractionPair.isValid()) {
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
            case "Reason" -> Optional.of(reason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FutureOptionsSummaryMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(futureOptionSymbol.diffFields(message.futureOptionSymbol));
        changed.addAll(bidPriceSummaryFractionPair.diffFields(message.bidPriceSummaryFractionPair));
        changed.addAll(askPriceSummaryFractionPair.diffFields(message.askPriceSummaryFractionPair));
        changed.addAll(lastPriceFractionPair.diffFields(message.lastPriceFractionPair));
        changed.addAll(netChangeFutureOptionsSummaryMessageFractionPair.diffFields(message.netChangeFutureOptionsSummaryMessageFractionPair));
        changed.addAll(openingPriceFractionPair.diffFields(message.openingPriceFractionPair));
        changed.addAll(highPriceFractionPair.diffFields(message.highPriceFractionPair));
        changed.addAll(lowPriceFractionPair.diffFields(message.lowPriceFractionPair));
        changed.addAll(settlementPriceFractionPair.diffFields(message.settlementPriceFractionPair));
        changed.addAll(previousSettlementPriceFractionPair.diffFields(message.previousSettlementPriceFractionPair));
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
            futureOptionSymbol.toFormattedString(builder, options);
            builder.append(", ");
            bidPriceSummaryFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            askPriceSummaryFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            lastPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            netChangeFutureOptionsSummaryMessageFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            openingPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            highPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            lowPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            settlementPriceFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            previousSettlementPriceFractionPair.toFormattedString(builder, options);
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
        futureOptionSymbol.toFormattedString(builder, nested);
        bidPriceSummaryFractionPair.toFormattedString(builder, nested);
        askPriceSummaryFractionPair.toFormattedString(builder, nested);
        lastPriceFractionPair.toFormattedString(builder, nested);
        netChangeFutureOptionsSummaryMessageFractionPair.toFormattedString(builder, nested);
        openingPriceFractionPair.toFormattedString(builder, nested);
        highPriceFractionPair.toFormattedString(builder, nested);
        lowPriceFractionPair.toFormattedString(builder, nested);
        settlementPriceFractionPair.toFormattedString(builder, nested);
        previousSettlementPriceFractionPair.toFormattedString(builder, nested);
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
        if (!(other instanceof FutureOptionsSummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && futureOptionSymbol.equals(message.futureOptionSymbol) && bidPriceSummaryFractionPair.equals(message.bidPriceSummaryFractionPair) && askPriceSummaryFractionPair.equals(message.askPriceSummaryFractionPair) && lastPriceFractionPair.equals(message.lastPriceFractionPair) && netChangeFutureOptionsSummaryMessageFractionPair.equals(message.netChangeFutureOptionsSummaryMessageFractionPair) && openingPriceFractionPair.equals(message.openingPriceFractionPair) && highPriceFractionPair.equals(message.highPriceFractionPair) && lowPriceFractionPair.equals(message.lowPriceFractionPair) && settlementPriceFractionPair.equals(message.settlementPriceFractionPair) && previousSettlementPriceFractionPair.equals(message.previousSettlementPriceFractionPair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, futureOptionSymbol, bidPriceSummaryFractionPair, askPriceSummaryFractionPair, lastPriceFractionPair, netChangeFutureOptionsSummaryMessageFractionPair, openingPriceFractionPair, highPriceFractionPair, lowPriceFractionPair, settlementPriceFractionPair, previousSettlementPriceFractionPair);
    }
}
