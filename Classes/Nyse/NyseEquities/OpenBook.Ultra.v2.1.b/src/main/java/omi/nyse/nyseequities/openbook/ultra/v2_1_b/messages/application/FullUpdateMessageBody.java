package omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.MpvField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.PriceScaleCodeField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.QuoteConditionField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.SourceSessionIdField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.SourceTimeField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.SourceTimeMicroSecsField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.SymbolField2;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.SymbolIndexField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.SymbolSeqNumField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.TradingStatusField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.groups.FullPricePointEntry;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.groups.FullPricePointList;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.Field;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.Message;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.PrintOptions;

/**
 * Represents the FullUpdateMessageBody message from the OpenBook protocol.
 *
 * <p>This message contains the complete order book for a single symbol, with all price points, an aggregated quantity at each price point and symbol mapping information.</p>
 */
public final class FullUpdateMessageBody implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 32;

    /**
     * This message takes the rest of the bytes it is given, so where those bytes end is its own end.
     */
    public static final boolean RUNS_TO_END = true;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Full Update Message Body";

    /**
     * The ID (from the last Full Refresh Update) of the symbol for which information is requested. 0 = Requesting all symbols in this channel.
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * The time the event occurred in the matching engine, in milliseconds since midnight.
     */
    private final SourceTimeField sourceTime = new SourceTimeField();

    /**
     * The number of microseconds that have elapsed within the millisecond published in the SourceTime field. If the ME event occurred at 13:12:56, 170 millisecs and 30 microsecs, this field will contain 30.
     */
    private final SourceTimeMicroSecsField sourceTimeMicroSecs = new SourceTimeMicroSecsField();

    /**
     * The sequence number of this message in the set of all messages for this symbol.
     */
    private final SymbolSeqNumField symbolSeqNum = new SymbolSeqNumField();

    /**
     * Unused. Ignore any content.
     */
    private final SourceSessionIdField sourceSessionId = new SourceSessionIdField();

    /**
     * The stock symbol in NYSE Symbology (the root, optionally followed by a space and a suffix), right-padded with NULLs.
     */
    private final SymbolField2 symbol = new SymbolField2();

    /**
     * The number of digits after the decimal place in all prices for this symbol.
     */
    private final PriceScaleCodeField priceScaleCode = new PriceScaleCodeField();

    /**
     * The current quote condition for the symbol.
     */
    private final QuoteConditionField quoteCondition = new QuoteConditionField();

    /**
     * The current trading status of the equity.
     */
    private final TradingStatusField tradingStatus = new TradingStatusField();

    /**
     * The minimum price variation, also known as Tick, the minimum amount by which prices can differ.
     */
    private final MpvField mpv = new MpvField();

    /**
     * Full Message Price Point
     */
    private final FullPricePointList fullPricePoint = new FullPricePointList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(symbolIndex, sourceTime, sourceTimeMicroSecs, symbolSeqNum, sourceSessionId, symbol, priceScaleCode, quoteCondition, tradingStatus, mpv);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The ID (from the last Full Refresh Update) of the symbol for which information is requested. 0 = Requesting all symbols in this channel.
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * The time the event occurred in the matching engine, in milliseconds since midnight.
     *
     * @return the SourceTime field
     */
    public SourceTimeField sourceTime() {
        return sourceTime;
    }

    /**
     * The number of microseconds that have elapsed within the millisecond published in the SourceTime field. If the ME event occurred at 13:12:56, 170 millisecs and 30 microsecs, this field will contain 30.
     *
     * @return the SourceTimeMicroSecs field
     */
    public SourceTimeMicroSecsField sourceTimeMicroSecs() {
        return sourceTimeMicroSecs;
    }

    /**
     * The sequence number of this message in the set of all messages for this symbol.
     *
     * @return the SymbolSeqNum field
     */
    public SymbolSeqNumField symbolSeqNum() {
        return symbolSeqNum;
    }

    /**
     * Unused. Ignore any content.
     *
     * @return the SourceSessionId field
     */
    public SourceSessionIdField sourceSessionId() {
        return sourceSessionId;
    }

    /**
     * The stock symbol in NYSE Symbology (the root, optionally followed by a space and a suffix), right-padded with NULLs.
     *
     * @return the Symbol field
     */
    public SymbolField2 symbol() {
        return symbol;
    }

    /**
     * The number of digits after the decimal place in all prices for this symbol.
     *
     * @return the PriceScaleCode field
     */
    public PriceScaleCodeField priceScaleCode() {
        return priceScaleCode;
    }

    /**
     * The current quote condition for the symbol.
     *
     * @return the QuoteCondition field
     */
    public QuoteConditionField quoteCondition() {
        return quoteCondition;
    }

    /**
     * The current trading status of the equity.
     *
     * @return the TradingStatus field
     */
    public TradingStatusField tradingStatus() {
        return tradingStatus;
    }

    /**
     * The minimum price variation, also known as Tick, the minimum amount by which prices can differ.
     *
     * @return the Mpv field
     */
    public MpvField mpv() {
        return mpv;
    }

    /**
     * Full Message Price Point
     *
     * <p>This list takes the rest of the bytes its record was given.</p>
     *
     * @return the FullPricePoint entries
     */
    public FullPricePointList fullPricePoint() {
        return fullPricePoint;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + fullPricePoint.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 4;
        cursor += 4;
        cursor += 2;
        cursor += 4;
        cursor += 1;
        cursor += 11;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 2;
        cursor = fullPricePoint.padding(runs, cursor);
        return cursor;
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
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!sourceTime.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimeField.BYTE_LENGTH;
        if (!sourceTimeMicroSecs.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimeMicroSecsField.BYTE_LENGTH;
        if (!symbolSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolSeqNumField.BYTE_LENGTH;
        if (!sourceSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += SourceSessionIdField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField2.BYTE_LENGTH;
        if (!priceScaleCode.parse(data, cursor)) {
            return false;
        }
        cursor += PriceScaleCodeField.BYTE_LENGTH;
        if (!quoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteConditionField.BYTE_LENGTH;
        if (!tradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradingStatusField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!mpv.parse(data, cursor)) {
            return false;
        }
        cursor += MpvField.BYTE_LENGTH;
        if (!fullPricePoint.parse(data, cursor, end)) {
            return false;
        }
        cursor += fullPricePoint.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = symbolIndex.encode(data, cursor);
        cursor = sourceTime.encode(data, cursor);
        cursor = sourceTimeMicroSecs.encode(data, cursor);
        cursor = symbolSeqNum.encode(data, cursor);
        cursor = sourceSessionId.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = priceScaleCode.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        cursor = tradingStatus.encode(data, cursor);
        if (buffer != null && buffer.length >= 29 + 1) {
            System.arraycopy(buffer, 29, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = mpv.encode(data, cursor);
        cursor = fullPricePoint.encode(data, cursor);
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
        fullPricePoint.clear();
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
            if (!field.isRecognized()) {
                return false;
            }
        }
        if (!fullPricePoint.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!fullPricePoint.isValid()) {
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
        if (!symbolIndex.isDecoded()) {
            return Optional.of(symbolIndex);
        }
        if (!sourceTime.isDecoded()) {
            return Optional.of(sourceTime);
        }
        if (!sourceTimeMicroSecs.isDecoded()) {
            return Optional.of(sourceTimeMicroSecs);
        }
        if (!symbolSeqNum.isDecoded()) {
            return Optional.of(symbolSeqNum);
        }
        if (!sourceSessionId.isDecoded()) {
            return Optional.of(sourceSessionId);
        }
        if (!symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (!priceScaleCode.isDecoded()) {
            return Optional.of(priceScaleCode);
        }
        if (!quoteCondition.isDecoded()) {
            return Optional.of(quoteCondition);
        }
        if (!tradingStatus.isDecoded()) {
            return Optional.of(tradingStatus);
        }
        if (!mpv.isDecoded()) {
            return Optional.of(mpv);
        }
        if (!fullPricePoint.isDecoded()) {
            return fullPricePoint.failedEntry().flatMap(FullPricePointEntry::failedAt);
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
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "SourceTime" -> Optional.of(sourceTime);
            case "SourceTimeMicroSecs" -> Optional.of(sourceTimeMicroSecs);
            case "SymbolSeqNum" -> Optional.of(symbolSeqNum);
            case "SourceSessionId" -> Optional.of(sourceSessionId);
            case "Symbol" -> Optional.of(symbol);
            case "PriceScaleCode" -> Optional.of(priceScaleCode);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "TradingStatus" -> Optional.of(tradingStatus);
            case "Mpv" -> Optional.of(mpv);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FullUpdateMessageBody message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(fullPricePoint.diffFields(message.fullPricePoint));
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
            fullPricePoint.toFormattedString(builder, options);
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
        fullPricePoint.toFormattedString(builder, nested);
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
        if (!(other instanceof FullUpdateMessageBody message)) {
            return false;
        }
        return fields.equals(message.fields) && fullPricePoint.equals(message.fullPricePoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, fullPricePoint);
    }
}
