package omi.nyse.amexequities.openbookaggregated.xdp.v2_1_d.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.amexequities.openbookaggregated.xdp.v2_1_d.fields.MpvField;
import omi.nyse.amexequities.openbookaggregated.xdp.v2_1_d.fields.PriceScaleCodeField;
import omi.nyse.amexequities.openbookaggregated.xdp.v2_1_d.fields.RemainingCountField;
import omi.nyse.amexequities.openbookaggregated.xdp.v2_1_d.fields.SourceTimeField;
import omi.nyse.amexequities.openbookaggregated.xdp.v2_1_d.fields.SourceTimeNsField;
import omi.nyse.amexequities.openbookaggregated.xdp.v2_1_d.fields.SymbolField;
import omi.nyse.amexequities.openbookaggregated.xdp.v2_1_d.fields.SymbolIndexField;
import omi.nyse.amexequities.openbookaggregated.xdp.v2_1_d.fields.TradingStatusField;
import omi.nyse.amexequities.openbookaggregated.xdp.v2_1_d.fields.UltraLastSeqNumField;
import omi.nyse.amexequities.openbookaggregated.xdp.v2_1_d.fields.UpdateCountField;
import omi.nyse.amexequities.openbookaggregated.xdp.v2_1_d.groups.SnapshotPricePointEntry;
import omi.nyse.amexequities.openbookaggregated.xdp.v2_1_d.groups.SnapshotPricePointList;
import omi.nyse.amexequities.openbookaggregated.xdp.v2_1_d.types.Field;
import omi.nyse.amexequities.openbookaggregated.xdp.v2_1_d.types.Message;
import omi.nyse.amexequities.openbookaggregated.xdp.v2_1_d.types.PrintOptions;

/**
 * Represents the OrderbookSnapshotMessage message from the OpenBook.Aggregated protocol.
 *
 * <p>A Snapshot Update message provides the full depth of book for the symbol.</p>
 */
public final class OrderbookSnapshotMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Orderbook Snapshot Message";

    /**
     * This field specifies the time when the msg was generated in the order book. The number represents the number of seconds in UTC time (EPOCH)
     */
    private final SourceTimeField sourceTime = new SourceTimeField();

    /**
     * This field represents the nanosecond portion within the second in UTC time (EPOCH)
     */
    private final SourceTimeNsField sourceTimeNs = new SourceTimeNsField();

    /**
     * This field identifies the numerical representation of the symbol.
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * To ease recovery of OpenBook Ultra customers, This field contains the last sequence number of the last message sent out of the OpenBook Ultra feed.
     */
    private final UltraLastSeqNumField ultraLastSeqNum = new UltraLastSeqNumField();

    /**
     * This field contains the full symbol in NYSE Symbology. A sequence of characters representing the symbol, padded with NULLs.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Price scale for price conversion of the symbol.
     */
    private final PriceScaleCodeField priceScaleCode = new PriceScaleCodeField();

    /**
     * This field indicates the market condition of the security.
     */
    private final TradingStatusField tradingStatus = new TradingStatusField();

    /**
     * Number of updates remaining in the event.
     */
    private final RemainingCountField remainingCount = new RemainingCountField();

    /**
     * This field contains the minimum price variation
     */
    private final MpvField mpv = new MpvField();

    /**
     * Number of updates. Indicates number of times the following group of fields (Price, Volume, Side, NumOrders) will be repeated in the message. Default value is 1
     */
    private final UpdateCountField updateCount = new UpdateCountField();

    /**
     * Snapshot Message Price Point
     */
    private final SnapshotPricePointList snapshotPricePoint = new SnapshotPricePointList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTime, sourceTimeNs, symbolIndex, ultraLastSeqNum, symbol, priceScaleCode, tradingStatus, remainingCount, mpv, updateCount);

    private byte[] buffer;

    private boolean decoded;

    /**
     * This field specifies the time when the msg was generated in the order book. The number represents the number of seconds in UTC time (EPOCH)
     *
     * @return the SourceTime field
     */
    public SourceTimeField sourceTime() {
        return sourceTime;
    }

    /**
     * This field represents the nanosecond portion within the second in UTC time (EPOCH)
     *
     * @return the SourceTimeNs field
     */
    public SourceTimeNsField sourceTimeNs() {
        return sourceTimeNs;
    }

    /**
     * This field identifies the numerical representation of the symbol.
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * To ease recovery of OpenBook Ultra customers, This field contains the last sequence number of the last message sent out of the OpenBook Ultra feed.
     *
     * @return the UltraLastSeqNum field
     */
    public UltraLastSeqNumField ultraLastSeqNum() {
        return ultraLastSeqNum;
    }

    /**
     * This field contains the full symbol in NYSE Symbology. A sequence of characters representing the symbol, padded with NULLs.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Price scale for price conversion of the symbol.
     *
     * @return the PriceScaleCode field
     */
    public PriceScaleCodeField priceScaleCode() {
        return priceScaleCode;
    }

    /**
     * This field indicates the market condition of the security.
     *
     * @return the TradingStatus field
     */
    public TradingStatusField tradingStatus() {
        return tradingStatus;
    }

    /**
     * Number of updates remaining in the event.
     *
     * @return the RemainingCount field
     */
    public RemainingCountField remainingCount() {
        return remainingCount;
    }

    /**
     * This field contains the minimum price variation
     *
     * @return the Mpv field
     */
    public MpvField mpv() {
        return mpv;
    }

    /**
     * Number of updates. Indicates number of times the following group of fields (Price, Volume, Side, NumOrders) will be repeated in the message. Default value is 1
     *
     * @return the UpdateCount field
     */
    public UpdateCountField updateCount() {
        return updateCount;
    }

    /**
     * Snapshot Message Price Point
     *
     * <p>Encode writes this list's size to the UpdateCount field.</p>
     *
     * @return the SnapshotPricePoint entries
     */
    public SnapshotPricePointList snapshotPricePoint() {
        return snapshotPricePoint;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + snapshotPricePoint.byteLength();
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
        if (!sourceTime.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimeField.BYTE_LENGTH;
        if (!sourceTimeNs.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimeNsField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!ultraLastSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += UltraLastSeqNumField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!priceScaleCode.parse(data, cursor)) {
            return false;
        }
        cursor += PriceScaleCodeField.BYTE_LENGTH;
        if (!tradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradingStatusField.BYTE_LENGTH;
        if (!remainingCount.parse(data, cursor)) {
            return false;
        }
        cursor += RemainingCountField.BYTE_LENGTH;
        if (!mpv.parse(data, cursor)) {
            return false;
        }
        cursor += MpvField.BYTE_LENGTH;
        if (!updateCount.parse(data, cursor)) {
            return false;
        }
        cursor += UpdateCountField.BYTE_LENGTH;
        if (!snapshotPricePoint.parse(data, cursor, end, updateCount.value())) {
            return false;
        }
        cursor += snapshotPricePoint.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (snapshotPricePoint.size() > 255) {
            throw new IllegalStateException("snapshotPricePoint holds " + snapshotPricePoint.size() + " entries, more than its count field can state");
        }
        updateCount.value((short) snapshotPricePoint.size());
        int cursor = offset;
        cursor = sourceTime.encode(data, cursor);
        cursor = sourceTimeNs.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = ultraLastSeqNum.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = priceScaleCode.encode(data, cursor);
        cursor = tradingStatus.encode(data, cursor);
        cursor = remainingCount.encode(data, cursor);
        cursor = mpv.encode(data, cursor);
        cursor = updateCount.encode(data, cursor);
        cursor = snapshotPricePoint.encode(data, cursor);
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
        snapshotPricePoint.clear();
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
            if (field != updateCount && !field.isRecognized()) {
                return false;
            }
        }
        return snapshotPricePoint.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != updateCount && !field.isValid()) {
                return false;
            }
        }
        if (!snapshotPricePoint.isValid()) {
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
        if (!sourceTime.isDecoded()) {
            return Optional.of(sourceTime);
        }
        if (!sourceTimeNs.isDecoded()) {
            return Optional.of(sourceTimeNs);
        }
        if (!symbolIndex.isDecoded()) {
            return Optional.of(symbolIndex);
        }
        if (!ultraLastSeqNum.isDecoded()) {
            return Optional.of(ultraLastSeqNum);
        }
        if (!symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (!priceScaleCode.isDecoded()) {
            return Optional.of(priceScaleCode);
        }
        if (!tradingStatus.isDecoded()) {
            return Optional.of(tradingStatus);
        }
        if (!remainingCount.isDecoded()) {
            return Optional.of(remainingCount);
        }
        if (!mpv.isDecoded()) {
            return Optional.of(mpv);
        }
        if (!updateCount.isDecoded()) {
            return Optional.of(updateCount);
        }
        if (!snapshotPricePoint.isDecoded()) {
            return Optional.of(snapshotPricePoint.failedEntry().flatMap(SnapshotPricePointEntry::failedAt).orElse(updateCount));
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
            case "SourceTime" -> Optional.of(sourceTime);
            case "SourceTimeNs" -> Optional.of(sourceTimeNs);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "UltraLastSeqNum" -> Optional.of(ultraLastSeqNum);
            case "Symbol" -> Optional.of(symbol);
            case "PriceScaleCode" -> Optional.of(priceScaleCode);
            case "TradingStatus" -> Optional.of(tradingStatus);
            case "RemainingCount" -> Optional.of(remainingCount);
            case "Mpv" -> Optional.of(mpv);
            case "UpdateCount" -> Optional.of(updateCount);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderbookSnapshotMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(snapshotPricePoint.diffFields(message.snapshotPricePoint));
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
            snapshotPricePoint.toFormattedString(builder, options);
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
        snapshotPricePoint.toFormattedString(builder, nested);
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
        if (!(other instanceof OrderbookSnapshotMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && snapshotPricePoint.equals(message.snapshotPricePoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, snapshotPricePoint);
    }
}
