package omi.eurex.t7.eti.fbe.v10_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v10_0.fields.CompressionIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.LastPxField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NetworkMsgIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoLegsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoSideAllocsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PackageIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RelatedMarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SwapClearerField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TesExecIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradePublishIndicatorField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeReportIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeReportTextField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeReportTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TransBkdTimeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TrdTypeField;
import omi.eurex.t7.eti.fbe.v10_0.groups.SideAllocGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.SideAllocGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.groups.TrdInstrmntLegGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.TrdInstrmntLegGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.structs.RequestHeaderComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the ModifyTesTradeRequest message from the Eti protocol.
 */
public final class ModifyTesTradeRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 106;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Modify Tes Trade Request";

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Trans Bkd Time
     */
    private final TransBkdTimeField transBkdTime = new TransBkdTimeField();

    /**
     * Compression Id
     */
    private final CompressionIdField compressionId = new CompressionIdField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Package Id
     */
    private final PackageIdField packageId = new PackageIdField();

    /**
     * Tes Exec Id
     */
    private final TesExecIdField tesExecId = new TesExecIdField();

    /**
     * Related Market Segment Id
     */
    private final RelatedMarketSegmentIdField relatedMarketSegmentId = new RelatedMarketSegmentIdField();

    /**
     * Trd Type
     */
    private final TrdTypeField trdType = new TrdTypeField();

    /**
     * Trade Report Type
     */
    private final TradeReportTypeField tradeReportType = new TradeReportTypeField();

    /**
     * Trade Publish Indicator
     */
    private final TradePublishIndicatorField tradePublishIndicator = new TradePublishIndicatorField();

    /**
     * No Side Allocs
     */
    private final NoSideAllocsField noSideAllocs = new NoSideAllocsField();

    /**
     * No Legs
     */
    private final NoLegsField noLegs = new NoLegsField();

    /**
     * Swap Clearer
     */
    private final SwapClearerField swapClearer = new SwapClearerField();

    /**
     * Trade Report Text
     */
    private final TradeReportTextField tradeReportText = new TradeReportTextField();

    /**
     * Trade Report Id
     */
    private final TradeReportIdField tradeReportId = new TradeReportIdField();

    /**
     * Side Alloc Grp Comp
     */
    private final SideAllocGrpCompList sideAllocGrpComp = new SideAllocGrpCompList();

    /**
     * Trd Instrmnt Leg Grp Comp
     */
    private final TrdInstrmntLegGrpCompList trdInstrmntLegGrpComp = new TrdInstrmntLegGrpCompList();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(lastPx), List.<Field>of(transBkdTime), List.<Field>of(compressionId), List.<Field>of(marketSegmentId), List.<Field>of(packageId), List.<Field>of(tesExecId), List.<Field>of(relatedMarketSegmentId), List.<Field>of(trdType), List.<Field>of(tradeReportType), List.<Field>of(tradePublishIndicator), List.<Field>of(noSideAllocs), List.<Field>of(noLegs), List.<Field>of(swapClearer), List.<Field>of(tradeReportText), List.<Field>of(tradeReportId)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Network Msg Id
     *
     * @return the NetworkMsgId field
     */
    public NetworkMsgIdField networkMsgId() {
        return networkMsgId;
    }

    /**
     * Last Px
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Trans Bkd Time
     *
     * @return the TransBkdTime field
     */
    public TransBkdTimeField transBkdTime() {
        return transBkdTime;
    }

    /**
     * Compression Id
     *
     * @return the CompressionId field
     */
    public CompressionIdField compressionId() {
        return compressionId;
    }

    /**
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Package Id
     *
     * @return the PackageId field
     */
    public PackageIdField packageId() {
        return packageId;
    }

    /**
     * Tes Exec Id
     *
     * @return the TesExecId field
     */
    public TesExecIdField tesExecId() {
        return tesExecId;
    }

    /**
     * Related Market Segment Id
     *
     * @return the RelatedMarketSegmentId field
     */
    public RelatedMarketSegmentIdField relatedMarketSegmentId() {
        return relatedMarketSegmentId;
    }

    /**
     * Trd Type
     *
     * @return the TrdType field
     */
    public TrdTypeField trdType() {
        return trdType;
    }

    /**
     * Trade Report Type
     *
     * @return the TradeReportType field
     */
    public TradeReportTypeField tradeReportType() {
        return tradeReportType;
    }

    /**
     * Trade Publish Indicator
     *
     * @return the TradePublishIndicator field
     */
    public TradePublishIndicatorField tradePublishIndicator() {
        return tradePublishIndicator;
    }

    /**
     * No Side Allocs
     *
     * @return the NoSideAllocs field
     */
    public NoSideAllocsField noSideAllocs() {
        return noSideAllocs;
    }

    /**
     * No Legs
     *
     * @return the NoLegs field
     */
    public NoLegsField noLegs() {
        return noLegs;
    }

    /**
     * Swap Clearer
     *
     * @return the SwapClearer field
     */
    public SwapClearerField swapClearer() {
        return swapClearer;
    }

    /**
     * Trade Report Text
     *
     * @return the TradeReportText field
     */
    public TradeReportTextField tradeReportText() {
        return tradeReportText;
    }

    /**
     * Trade Report Id
     *
     * @return the TradeReportId field
     */
    public TradeReportIdField tradeReportId() {
        return tradeReportId;
    }

    /**
     * Side Alloc Grp Comp
     *
     * <p>Encode writes this list's size to the NoSideAllocs field.</p>
     *
     * @return the SideAllocGrpComp entries
     */
    public SideAllocGrpCompList sideAllocGrpComp() {
        return sideAllocGrpComp;
    }

    /**
     * Trd Instrmnt Leg Grp Comp
     *
     * <p>Encode writes this list's size to the NoLegs field.</p>
     *
     * @return the TrdInstrmntLegGrpComp entries
     */
    public TrdInstrmntLegGrpCompList trdInstrmntLegGrpComp() {
        return trdInstrmntLegGrpComp;
    }

    /**
     * Request Header Comp
     *
     * @return the RequestHeaderComp record
     */
    public RequestHeaderComp requestHeaderComp() {
        return requestHeaderComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + sideAllocGrpComp.byteLength() + trdInstrmntLegGrpComp.byteLength();
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
        cursor += 8;
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = RequestHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RequestHeaderComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 20;
        cursor += 20;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor = sideAllocGrpComp.padding(runs, cursor);
        cursor += trdInstrmntLegGrpComp.byteLength();
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(transBkdTime.value());
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
        if (!networkMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += NetworkMsgIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!requestHeaderComp.parseFrom(data, cursor, end - 88)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!transBkdTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransBkdTimeField.BYTE_LENGTH;
        if (!compressionId.parse(data, cursor)) {
            return false;
        }
        cursor += CompressionIdField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!packageId.parse(data, cursor)) {
            return false;
        }
        cursor += PackageIdField.BYTE_LENGTH;
        if (!tesExecId.parse(data, cursor)) {
            return false;
        }
        cursor += TesExecIdField.BYTE_LENGTH;
        if (!relatedMarketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += RelatedMarketSegmentIdField.BYTE_LENGTH;
        if (!trdType.parse(data, cursor)) {
            return false;
        }
        cursor += TrdTypeField.BYTE_LENGTH;
        if (!tradeReportType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportTypeField.BYTE_LENGTH;
        if (!tradePublishIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += TradePublishIndicatorField.BYTE_LENGTH;
        if (!noSideAllocs.parse(data, cursor)) {
            return false;
        }
        cursor += NoSideAllocsField.BYTE_LENGTH;
        if (!noLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegsField.BYTE_LENGTH;
        if (!swapClearer.parse(data, cursor)) {
            return false;
        }
        cursor += SwapClearerField.BYTE_LENGTH;
        if (!tradeReportText.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportTextField.BYTE_LENGTH;
        if (!tradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!sideAllocGrpComp.parse(data, cursor, end, noSideAllocs.value())) {
            return false;
        }
        cursor += sideAllocGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!trdInstrmntLegGrpComp.parse(data, cursor, end, noLegs.value())) {
            return false;
        }
        cursor += trdInstrmntLegGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (sideAllocGrpComp.size() > 255) {
            throw new IllegalStateException("sideAllocGrpComp holds " + sideAllocGrpComp.size() + " entries, more than its count field can state");
        }
        if (trdInstrmntLegGrpComp.size() > 255) {
            throw new IllegalStateException("trdInstrmntLegGrpComp holds " + trdInstrmntLegGrpComp.size() + " entries, more than its count field can state");
        }
        noSideAllocs.value((short) sideAllocGrpComp.size());
        noLegs.value((short) trdInstrmntLegGrpComp.size());
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = transBkdTime.encode(data, cursor);
        cursor = compressionId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = packageId.encode(data, cursor);
        cursor = tesExecId.encode(data, cursor);
        cursor = relatedMarketSegmentId.encode(data, cursor);
        cursor = trdType.encode(data, cursor);
        cursor = tradeReportType.encode(data, cursor);
        cursor = tradePublishIndicator.encode(data, cursor);
        cursor = noSideAllocs.encode(data, cursor);
        cursor = noLegs.encode(data, cursor);
        cursor = swapClearer.encode(data, cursor);
        cursor = tradeReportText.encode(data, cursor);
        cursor = tradeReportId.encode(data, cursor);
        if (buffer != null && buffer.length >= 106) {
            System.arraycopy(buffer, 105, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = sideAllocGrpComp.encode(data, cursor);
        cursor = trdInstrmntLegGrpComp.encode(data, cursor);
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
        requestHeaderComp.clear();
        sideAllocGrpComp.clear();
        trdInstrmntLegGrpComp.clear();
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
            if (field != noSideAllocs && field != noLegs && !field.isRecognized()) {
                return false;
            }
        }
        if (!sideAllocGrpComp.isRecognized()) {
            return false;
        }
        return trdInstrmntLegGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noSideAllocs && field != noLegs && !field.isValid()) {
                return false;
            }
        }
        if (!sideAllocGrpComp.isValid()) {
            return false;
        }
        if (!trdInstrmntLegGrpComp.isValid()) {
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
        if (!networkMsgId.isDecoded()) {
            return Optional.of(networkMsgId);
        }
        if (!requestHeaderComp.isDecoded()) {
            return requestHeaderComp.failedAt();
        }
        if (!lastPx.isDecoded()) {
            return Optional.of(lastPx);
        }
        if (!transBkdTime.isDecoded()) {
            return Optional.of(transBkdTime);
        }
        if (!compressionId.isDecoded()) {
            return Optional.of(compressionId);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!packageId.isDecoded()) {
            return Optional.of(packageId);
        }
        if (!tesExecId.isDecoded()) {
            return Optional.of(tesExecId);
        }
        if (!relatedMarketSegmentId.isDecoded()) {
            return Optional.of(relatedMarketSegmentId);
        }
        if (!trdType.isDecoded()) {
            return Optional.of(trdType);
        }
        if (!tradeReportType.isDecoded()) {
            return Optional.of(tradeReportType);
        }
        if (!tradePublishIndicator.isDecoded()) {
            return Optional.of(tradePublishIndicator);
        }
        if (!noSideAllocs.isDecoded()) {
            return Optional.of(noSideAllocs);
        }
        if (!noLegs.isDecoded()) {
            return Optional.of(noLegs);
        }
        if (!swapClearer.isDecoded()) {
            return Optional.of(swapClearer);
        }
        if (!tradeReportText.isDecoded()) {
            return Optional.of(tradeReportText);
        }
        if (!tradeReportId.isDecoded()) {
            return Optional.of(tradeReportId);
        }
        if (!sideAllocGrpComp.isDecoded()) {
            return Optional.of(sideAllocGrpComp.failedEntry().flatMap(SideAllocGrpCompEntry::failedAt).orElse(noSideAllocs));
        }
        if (!trdInstrmntLegGrpComp.isDecoded()) {
            return Optional.of(trdInstrmntLegGrpComp.failedEntry().flatMap(TrdInstrmntLegGrpCompEntry::failedAt).orElse(noLegs));
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
            case "NetworkMsgId" -> Optional.of(networkMsgId);
            case "LastPx" -> Optional.of(lastPx);
            case "TransBkdTime" -> Optional.of(transBkdTime);
            case "CompressionId" -> Optional.of(compressionId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "PackageId" -> Optional.of(packageId);
            case "TesExecId" -> Optional.of(tesExecId);
            case "RelatedMarketSegmentId" -> Optional.of(relatedMarketSegmentId);
            case "TrdType" -> Optional.of(trdType);
            case "TradeReportType" -> Optional.of(tradeReportType);
            case "TradePublishIndicator" -> Optional.of(tradePublishIndicator);
            case "NoSideAllocs" -> Optional.of(noSideAllocs);
            case "NoLegs" -> Optional.of(noLegs);
            case "SwapClearer" -> Optional.of(swapClearer);
            case "TradeReportText" -> Optional.of(tradeReportText);
            case "TradeReportId" -> Optional.of(tradeReportId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ModifyTesTradeRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(sideAllocGrpComp.diffFields(message.sideAllocGrpComp));
        changed.addAll(trdInstrmntLegGrpComp.diffFields(message.trdInstrmntLegGrpComp));
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
            sideAllocGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            trdInstrmntLegGrpComp.toFormattedString(builder, options);
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
        sideAllocGrpComp.toFormattedString(builder, nested);
        trdInstrmntLegGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof ModifyTesTradeRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && sideAllocGrpComp.equals(message.sideAllocGrpComp) && trdInstrmntLegGrpComp.equals(message.trdInstrmntLegGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, sideAllocGrpComp, trdInstrmntLegGrpComp);
    }
}
