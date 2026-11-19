package omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.AskPriceSummaryFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.BidPriceSummaryFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.HighPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.LastPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.LowPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.NetChangeStrategySummaryMessageFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.branches.OpenPriceFractionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.AskPriceSignField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.AskSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.BidPriceSignField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.BidSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ExchangeIdField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.HighPriceSignField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.LastPriceSignField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.LowPriceSignField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.NetChangeSignField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.NumberOfLegsField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.OpenPriceSignField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.ReasonField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.StrategySymbolField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.fields.VolumeField;
import omi.tmx.mx.solamulticast.hsvf.v1_11.groups.StrategySummaryStrategyLegEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_11.groups.StrategySummaryStrategyLegList;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Message;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.PrintOptions;

/**
 * Represents the StrategySummaryMessage message from the SolaMulticast protocol.
 *
 * <p>Strategy Summary message</p>
 */
public final class StrategySummaryMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 108;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Strategy Summary Message";

    /**
     * Exchange on which the trade occurred Q = Montreal
     */
    private final ExchangeIdField exchangeId = new ExchangeIdField();

    /**
     * Identification of the strategy. The legs (underlying) are defined in message type NS
     */
    private final StrategySymbolField strategySymbol = new StrategySymbolField();

    /**
     * For Bid Price field
     */
    private final BidPriceSignField bidPriceSign = new BidPriceSignField();

    /**
     * Number of option contracts represented by the Bid Price. If size is greater than 99999, the 5th character becomes an exponent
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * For Ask Price field
     */
    private final AskPriceSignField askPriceSign = new AskPriceSignField();

    /**
     * Number of option contracts represented by the Ask Price. If size is greater than 99999, the 5th character becomes an exponent
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * For the Last Price field
     */
    private final LastPriceSignField lastPriceSign = new LastPriceSignField();

    /**
     * For the Open Price field
     */
    private final OpenPriceSignField openPriceSign = new OpenPriceSignField();

    /**
     * For the High Price field
     */
    private final HighPriceSignField highPriceSign = new HighPriceSignField();

    /**
     * For the Low Price field
     */
    private final LowPriceSignField lowPriceSign = new LowPriceSignField();

    /**
     * For the net change field
     */
    private final NetChangeSignField netChangeSign = new NetChangeSignField();

    /**
     * Number of contracts for the trade
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Indicates the reason of the summary message
     */
    private final ReasonField reason = new ReasonField();

    /**
     * Number of legs in the strategy. 2 to 20
     */
    private final NumberOfLegsField numberOfLegs = new NumberOfLegsField();

    /**
     * Strategy Summary Strategy Leg
     */
    private final StrategySummaryStrategyLegList strategySummaryStrategyLeg = new StrategySummaryStrategyLegList();

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
    private final NetChangeStrategySummaryMessageFractionPair netChangeStrategySummaryMessageFractionPair = new NetChangeStrategySummaryMessageFractionPair();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(exchangeId, strategySymbol, bidPriceSign, bidSize, askPriceSign, askSize, lastPriceSign, openPriceSign, highPriceSign, lowPriceSign, netChangeSign, volume, reason, numberOfLegs);

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
     * Identification of the strategy. The legs (underlying) are defined in message type NS
     *
     * @return the StrategySymbol field
     */
    public StrategySymbolField strategySymbol() {
        return strategySymbol;
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
     * Number of option contracts represented by the Bid Price. If size is greater than 99999, the 5th character becomes an exponent
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
     * Number of option contracts represented by the Ask Price. If size is greater than 99999, the 5th character becomes an exponent
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
    }

    /**
     * For the Last Price field
     *
     * @return the LastPriceSign field
     */
    public LastPriceSignField lastPriceSign() {
        return lastPriceSign;
    }

    /**
     * For the Open Price field
     *
     * @return the OpenPriceSign field
     */
    public OpenPriceSignField openPriceSign() {
        return openPriceSign;
    }

    /**
     * For the High Price field
     *
     * @return the HighPriceSign field
     */
    public HighPriceSignField highPriceSign() {
        return highPriceSign;
    }

    /**
     * For the Low Price field
     *
     * @return the LowPriceSign field
     */
    public LowPriceSignField lowPriceSign() {
        return lowPriceSign;
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
     * Number of contracts for the trade
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
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
     * Number of legs in the strategy. 2 to 20
     *
     * @return the NumberOfLegs field
     */
    public NumberOfLegsField numberOfLegs() {
        return numberOfLegs;
    }

    /**
     * Strategy Summary Strategy Leg
     *
     * <p>Encode writes this list's size to the NumberOfLegs field.</p>
     *
     * @return the StrategySummaryStrategyLeg entries
     */
    public StrategySummaryStrategyLegList strategySummaryStrategyLeg() {
        return strategySummaryStrategyLeg;
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
     * @return the NetChangeStrategySummaryMessageFractionPair record
     */
    public NetChangeStrategySummaryMessageFractionPair netChangeStrategySummaryMessageFractionPair() {
        return netChangeStrategySummaryMessageFractionPair;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + strategySummaryStrategyLeg.byteLength();
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
        if (!strategySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += StrategySymbolField.BYTE_LENGTH;
        if (!bidPriceSign.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceSignField.BYTE_LENGTH;
        if (!bidPriceSummaryFractionPair.parseFrom(data, cursor, end - 69)) {
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
        if (!askPriceSummaryFractionPair.parseFrom(data, cursor, end - 56)) {
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
        if (!lastPriceFractionPair.parseFrom(data, cursor, end - 43)) {
            return false;
        }
        cursor += lastPriceFractionPair.byteLength();
        if (!openPriceSign.parse(data, cursor)) {
            return false;
        }
        cursor += OpenPriceSignField.BYTE_LENGTH;
        if (!openPriceFractionPair.parseFrom(data, cursor, end - 35)) {
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
        if (!lowPriceFractionPair.parseFrom(data, cursor, end - 19)) {
            return false;
        }
        cursor += lowPriceFractionPair.byteLength();
        if (!netChangeSign.parse(data, cursor)) {
            return false;
        }
        cursor += NetChangeSignField.BYTE_LENGTH;
        if (!netChangeStrategySummaryMessageFractionPair.parseFrom(data, cursor, end - 11)) {
            return false;
        }
        cursor += netChangeStrategySummaryMessageFractionPair.byteLength();
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!reason.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonField.BYTE_LENGTH;
        if (!numberOfLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfLegsField.BYTE_LENGTH;
        if (numberOfLegs.value() == null) {
            return false;
        }
        if (!strategySummaryStrategyLeg.parse(data, cursor, end, numberOfLegs.value())) {
            return false;
        }
        cursor += strategySummaryStrategyLeg.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (strategySummaryStrategyLeg.size() > 99) {
            throw new IllegalStateException("strategySummaryStrategyLeg holds " + strategySummaryStrategyLeg.size() + " entries, more than its count field can state");
        }
        numberOfLegs.value((long) strategySummaryStrategyLeg.size());
        int cursor = offset;
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
        cursor = netChangeStrategySummaryMessageFractionPair.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = reason.encode(data, cursor);
        cursor = numberOfLegs.encode(data, cursor);
        cursor = strategySummaryStrategyLeg.encode(data, cursor);
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
        bidPriceSummaryFractionPair.clear();
        askPriceSummaryFractionPair.clear();
        lastPriceFractionPair.clear();
        openPriceFractionPair.clear();
        highPriceFractionPair.clear();
        lowPriceFractionPair.clear();
        netChangeStrategySummaryMessageFractionPair.clear();
        strategySummaryStrategyLeg.clear();
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
            if (field != numberOfLegs && !field.isRecognized()) {
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
        if (!netChangeStrategySummaryMessageFractionPair.isRecognized()) {
            return false;
        }
        return strategySummaryStrategyLeg.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfLegs && !field.isValid()) {
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
        if (!netChangeStrategySummaryMessageFractionPair.isValid()) {
            return false;
        }
        if (!strategySummaryStrategyLeg.isValid()) {
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
        if (!strategySymbol.isDecoded()) {
            return Optional.of(strategySymbol);
        }
        if (!bidPriceSign.isDecoded()) {
            return Optional.of(bidPriceSign);
        }
        if (!bidPriceSummaryFractionPair.isDecoded()) {
            return bidPriceSummaryFractionPair.failedAt();
        }
        if (!bidSize.isDecoded()) {
            return Optional.of(bidSize);
        }
        if (!askPriceSign.isDecoded()) {
            return Optional.of(askPriceSign);
        }
        if (!askPriceSummaryFractionPair.isDecoded()) {
            return askPriceSummaryFractionPair.failedAt();
        }
        if (!askSize.isDecoded()) {
            return Optional.of(askSize);
        }
        if (!lastPriceSign.isDecoded()) {
            return Optional.of(lastPriceSign);
        }
        if (!lastPriceFractionPair.isDecoded()) {
            return lastPriceFractionPair.failedAt();
        }
        if (!openPriceSign.isDecoded()) {
            return Optional.of(openPriceSign);
        }
        if (!openPriceFractionPair.isDecoded()) {
            return openPriceFractionPair.failedAt();
        }
        if (!highPriceSign.isDecoded()) {
            return Optional.of(highPriceSign);
        }
        if (!highPriceFractionPair.isDecoded()) {
            return highPriceFractionPair.failedAt();
        }
        if (!lowPriceSign.isDecoded()) {
            return Optional.of(lowPriceSign);
        }
        if (!lowPriceFractionPair.isDecoded()) {
            return lowPriceFractionPair.failedAt();
        }
        if (!netChangeSign.isDecoded()) {
            return Optional.of(netChangeSign);
        }
        if (!netChangeStrategySummaryMessageFractionPair.isDecoded()) {
            return netChangeStrategySummaryMessageFractionPair.failedAt();
        }
        if (!volume.isDecoded()) {
            return Optional.of(volume);
        }
        if (!reason.isDecoded()) {
            return Optional.of(reason);
        }
        if (!numberOfLegs.isDecoded()) {
            return Optional.of(numberOfLegs);
        }
        if (!strategySummaryStrategyLeg.isDecoded()) {
            return Optional.of(strategySummaryStrategyLeg.failedEntry().flatMap(StrategySummaryStrategyLegEntry::failedAt).orElse(numberOfLegs));
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
            case "NumberOfLegs" -> Optional.of(numberOfLegs);
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
        changed.addAll(netChangeStrategySummaryMessageFractionPair.diffFields(message.netChangeStrategySummaryMessageFractionPair));
        changed.addAll(strategySummaryStrategyLeg.diffFields(message.strategySummaryStrategyLeg));
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
            netChangeStrategySummaryMessageFractionPair.toFormattedString(builder, options);
            builder.append(", ");
            strategySummaryStrategyLeg.toFormattedString(builder, options);
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
        netChangeStrategySummaryMessageFractionPair.toFormattedString(builder, nested);
        strategySummaryStrategyLeg.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && bidPriceSummaryFractionPair.equals(message.bidPriceSummaryFractionPair) && askPriceSummaryFractionPair.equals(message.askPriceSummaryFractionPair) && lastPriceFractionPair.equals(message.lastPriceFractionPair) && openPriceFractionPair.equals(message.openPriceFractionPair) && highPriceFractionPair.equals(message.highPriceFractionPair) && lowPriceFractionPair.equals(message.lowPriceFractionPair) && netChangeStrategySummaryMessageFractionPair.equals(message.netChangeStrategySummaryMessageFractionPair) && strategySummaryStrategyLeg.equals(message.strategySummaryStrategyLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, bidPriceSummaryFractionPair, askPriceSummaryFractionPair, lastPriceFractionPair, openPriceFractionPair, highPriceFractionPair, lowPriceFractionPair, netChangeStrategySummaryMessageFractionPair, strategySummaryStrategyLeg);
    }
}
