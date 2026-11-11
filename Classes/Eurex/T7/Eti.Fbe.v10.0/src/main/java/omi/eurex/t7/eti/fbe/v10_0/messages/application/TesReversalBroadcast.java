package omi.eurex.t7.eti.fbe.v10_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v10_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoSideAllocsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PackageIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RelatedMarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ReversalCancellationReasonField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ReversalInitiationTimeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ReversalReasonTextField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TesExecIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeReportIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TrdRptStatusField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TrdTypeField;
import omi.eurex.t7.eti.fbe.v10_0.groups.SideAllocGrpBcCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.SideAllocGrpBcCompList;
import omi.eurex.t7.eti.fbe.v10_0.structs.RbcHeaderComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the TesReversalBroadcast message from the Eti protocol.
 */
public final class TesReversalBroadcast implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 218;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Tes Reversal Broadcast";

    /**
     * Reversal Initiation Time
     */
    private final ReversalInitiationTimeField reversalInitiationTime = new ReversalInitiationTimeField();

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
     * Trd Rpt Status
     */
    private final TrdRptStatusField trdRptStatus = new TrdRptStatusField();

    /**
     * Reversal Cancellation Reason
     */
    private final ReversalCancellationReasonField reversalCancellationReason = new ReversalCancellationReasonField();

    /**
     * No Side Allocs
     */
    private final NoSideAllocsField noSideAllocs = new NoSideAllocsField();

    /**
     * Trade Report Id
     */
    private final TradeReportIdField tradeReportId = new TradeReportIdField();

    /**
     * Reversal Reason Text
     */
    private final ReversalReasonTextField reversalReasonText = new ReversalReasonTextField();

    /**
     * Side Alloc Grp Bc Comp
     */
    private final SideAllocGrpBcCompList sideAllocGrpBcComp = new SideAllocGrpBcCompList();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(reversalInitiationTime), List.<Field>of(marketSegmentId), List.<Field>of(packageId), List.<Field>of(tesExecId), List.<Field>of(relatedMarketSegmentId), List.<Field>of(trdType), List.<Field>of(trdRptStatus), List.<Field>of(reversalCancellationReason), List.<Field>of(noSideAllocs), List.<Field>of(tradeReportId), List.<Field>of(reversalReasonText)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Reversal Initiation Time
     *
     * @return the ReversalInitiationTime field
     */
    public ReversalInitiationTimeField reversalInitiationTime() {
        return reversalInitiationTime;
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
     * Trd Rpt Status
     *
     * @return the TrdRptStatus field
     */
    public TrdRptStatusField trdRptStatus() {
        return trdRptStatus;
    }

    /**
     * Reversal Cancellation Reason
     *
     * @return the ReversalCancellationReason field
     */
    public ReversalCancellationReasonField reversalCancellationReason() {
        return reversalCancellationReason;
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
     * Trade Report Id
     *
     * @return the TradeReportId field
     */
    public TradeReportIdField tradeReportId() {
        return tradeReportId;
    }

    /**
     * Reversal Reason Text
     *
     * @return the ReversalReasonText field
     */
    public ReversalReasonTextField reversalReasonText() {
        return reversalReasonText;
    }

    /**
     * Side Alloc Grp Bc Comp
     *
     * <p>Encode writes this list's size to the NoSideAllocs field.</p>
     *
     * @return the SideAllocGrpBcComp entries
     */
    public SideAllocGrpBcCompList sideAllocGrpBcComp() {
        return sideAllocGrpBcComp;
    }

    /**
     * Rbc Header Comp
     *
     * @return the RbcHeaderComp record
     */
    public RbcHeaderComp rbcHeaderComp() {
        return rbcHeaderComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + sideAllocGrpBcComp.byteLength();
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
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = RbcHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RbcHeaderComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 20;
        cursor += 132;
        runs.add(cursor).add(3);
        cursor += 3;
        cursor = sideAllocGrpBcComp.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(rbcHeaderComp.sendingTime().value());
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
        cursor += 2; // padding
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 184)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!reversalInitiationTime.parse(data, cursor)) {
            return false;
        }
        cursor += ReversalInitiationTimeField.BYTE_LENGTH;
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
        if (!trdRptStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TrdRptStatusField.BYTE_LENGTH;
        if (!reversalCancellationReason.parse(data, cursor)) {
            return false;
        }
        cursor += ReversalCancellationReasonField.BYTE_LENGTH;
        if (!noSideAllocs.parse(data, cursor)) {
            return false;
        }
        cursor += NoSideAllocsField.BYTE_LENGTH;
        if (!tradeReportId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReportIdField.BYTE_LENGTH;
        if (!reversalReasonText.parse(data, cursor)) {
            return false;
        }
        cursor += ReversalReasonTextField.BYTE_LENGTH;
        cursor += 3; // padding
        if (!sideAllocGrpBcComp.parse(data, cursor, end, noSideAllocs.value())) {
            return false;
        }
        cursor += sideAllocGrpBcComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (sideAllocGrpBcComp.size() > 255) {
            throw new IllegalStateException("sideAllocGrpBcComp holds " + sideAllocGrpBcComp.size() + " entries, more than its count field can state");
        }
        noSideAllocs.value((short) sideAllocGrpBcComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = reversalInitiationTime.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = packageId.encode(data, cursor);
        cursor = tesExecId.encode(data, cursor);
        cursor = relatedMarketSegmentId.encode(data, cursor);
        cursor = trdType.encode(data, cursor);
        cursor = trdRptStatus.encode(data, cursor);
        cursor = reversalCancellationReason.encode(data, cursor);
        cursor = noSideAllocs.encode(data, cursor);
        cursor = tradeReportId.encode(data, cursor);
        cursor = reversalReasonText.encode(data, cursor);
        if (buffer != null && buffer.length >= 218) {
            System.arraycopy(buffer, 215, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
        cursor = sideAllocGrpBcComp.encode(data, cursor);
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
        rbcHeaderComp.clear();
        sideAllocGrpBcComp.clear();
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
            if (field != noSideAllocs && !field.isRecognized()) {
                return false;
            }
        }
        return sideAllocGrpBcComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noSideAllocs && !field.isValid()) {
                return false;
            }
        }
        if (!sideAllocGrpBcComp.isValid()) {
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
        if (!rbcHeaderComp.isDecoded()) {
            return rbcHeaderComp.failedAt();
        }
        if (!reversalInitiationTime.isDecoded()) {
            return Optional.of(reversalInitiationTime);
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
        if (!trdRptStatus.isDecoded()) {
            return Optional.of(trdRptStatus);
        }
        if (!reversalCancellationReason.isDecoded()) {
            return Optional.of(reversalCancellationReason);
        }
        if (!noSideAllocs.isDecoded()) {
            return Optional.of(noSideAllocs);
        }
        if (!tradeReportId.isDecoded()) {
            return Optional.of(tradeReportId);
        }
        if (!reversalReasonText.isDecoded()) {
            return Optional.of(reversalReasonText);
        }
        if (!sideAllocGrpBcComp.isDecoded()) {
            return Optional.of(sideAllocGrpBcComp.failedEntry().flatMap(SideAllocGrpBcCompEntry::failedAt).orElse(noSideAllocs));
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
            case "ReversalInitiationTime" -> Optional.of(reversalInitiationTime);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "PackageId" -> Optional.of(packageId);
            case "TesExecId" -> Optional.of(tesExecId);
            case "RelatedMarketSegmentId" -> Optional.of(relatedMarketSegmentId);
            case "TrdType" -> Optional.of(trdType);
            case "TrdRptStatus" -> Optional.of(trdRptStatus);
            case "ReversalCancellationReason" -> Optional.of(reversalCancellationReason);
            case "NoSideAllocs" -> Optional.of(noSideAllocs);
            case "TradeReportId" -> Optional.of(tradeReportId);
            case "ReversalReasonText" -> Optional.of(reversalReasonText);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TesReversalBroadcast message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(sideAllocGrpBcComp.diffFields(message.sideAllocGrpBcComp));
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
            sideAllocGrpBcComp.toFormattedString(builder, options);
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
        sideAllocGrpBcComp.toFormattedString(builder, nested);
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
        if (!(other instanceof TesReversalBroadcast message)) {
            return false;
        }
        return fields.equals(message.fields) && sideAllocGrpBcComp.equals(message.sideAllocGrpBcComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, sideAllocGrpBcComp);
    }
}
