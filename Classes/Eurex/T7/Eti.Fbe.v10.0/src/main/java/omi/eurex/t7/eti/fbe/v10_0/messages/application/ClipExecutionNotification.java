package omi.eurex.t7.eti.fbe.v10_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v10_0.fields.CumQtyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.CxlQtyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExecIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExecRestatementReasonField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExecTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.LeavesQtyField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MatchTypeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoFillsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoLegExecsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrdStatusField;
import omi.eurex.t7.eti.fbe.v10_0.fields.OrderIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ProductComplexField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SecurityIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SideField;
import omi.eurex.t7.eti.fbe.v10_0.groups.FillsGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.FillsGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.groups.InstrmntLegExecGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.InstrmntLegExecGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.structs.RbcHeaderMeComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the ClipExecutionNotification message from the Eti protocol.
 */
public final class ClipExecutionNotification implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 122;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Clip Execution Notification";

    /**
     * Order Id
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Exec Id
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Cxl Qty
     */
    private final CxlQtyField cxlQty = new CxlQtyField();

    /**
     * Leaves Qty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Cum Qty
     */
    private final CumQtyField cumQty = new CumQtyField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Exec Restatement Reason
     */
    private final ExecRestatementReasonField execRestatementReason = new ExecRestatementReasonField();

    /**
     * No Leg Execs
     */
    private final NoLegExecsField noLegExecs = new NoLegExecsField();

    /**
     * Product Complex
     */
    private final ProductComplexField productComplex = new ProductComplexField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Ord Status
     */
    private final OrdStatusField ordStatus = new OrdStatusField();

    /**
     * Exec Type
     */
    private final ExecTypeField execType = new ExecTypeField();

    /**
     * Match Type
     */
    private final MatchTypeField matchType = new MatchTypeField();

    /**
     * No Fills
     */
    private final NoFillsField noFills = new NoFillsField();

    /**
     * Fills Grp Comp
     */
    private final FillsGrpCompList fillsGrpComp = new FillsGrpCompList();

    /**
     * Instrmnt Leg Exec Grp Comp
     */
    private final InstrmntLegExecGrpCompList instrmntLegExecGrpComp = new InstrmntLegExecGrpCompList();

    /**
     * Rbc Header Me Comp
     */
    private final RbcHeaderMeComp rbcHeaderMeComp = new RbcHeaderMeComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderMeComp.fields(), List.<Field>of(orderId), List.<Field>of(execId), List.<Field>of(securityId), List.<Field>of(cxlQty), List.<Field>of(leavesQty), List.<Field>of(cumQty), List.<Field>of(marketSegmentId), List.<Field>of(execRestatementReason), List.<Field>of(noLegExecs), List.<Field>of(productComplex), List.<Field>of(side), List.<Field>of(ordStatus), List.<Field>of(execType), List.<Field>of(matchType), List.<Field>of(noFills)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Order Id
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Exec Id
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Cxl Qty
     *
     * @return the CxlQty field
     */
    public CxlQtyField cxlQty() {
        return cxlQty;
    }

    /**
     * Leaves Qty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Cum Qty
     *
     * @return the CumQty field
     */
    public CumQtyField cumQty() {
        return cumQty;
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
     * Exec Restatement Reason
     *
     * @return the ExecRestatementReason field
     */
    public ExecRestatementReasonField execRestatementReason() {
        return execRestatementReason;
    }

    /**
     * No Leg Execs
     *
     * @return the NoLegExecs field
     */
    public NoLegExecsField noLegExecs() {
        return noLegExecs;
    }

    /**
     * Product Complex
     *
     * @return the ProductComplex field
     */
    public ProductComplexField productComplex() {
        return productComplex;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Ord Status
     *
     * @return the OrdStatus field
     */
    public OrdStatusField ordStatus() {
        return ordStatus;
    }

    /**
     * Exec Type
     *
     * @return the ExecType field
     */
    public ExecTypeField execType() {
        return execType;
    }

    /**
     * Match Type
     *
     * @return the MatchType field
     */
    public MatchTypeField matchType() {
        return matchType;
    }

    /**
     * No Fills
     *
     * @return the NoFills field
     */
    public NoFillsField noFills() {
        return noFills;
    }

    /**
     * Fills Grp Comp
     *
     * <p>Encode writes this list's size to the NoFills field.</p>
     *
     * @return the FillsGrpComp entries
     */
    public FillsGrpCompList fillsGrpComp() {
        return fillsGrpComp;
    }

    /**
     * Instrmnt Leg Exec Grp Comp
     *
     * <p>Encode writes this list's size to the NoLegExecs field.</p>
     *
     * @return the InstrmntLegExecGrpComp entries
     */
    public InstrmntLegExecGrpCompList instrmntLegExecGrpComp() {
        return instrmntLegExecGrpComp;
    }

    /**
     * Rbc Header Me Comp
     *
     * @return the RbcHeaderMeComp record
     */
    public RbcHeaderMeComp rbcHeaderMeComp() {
        return rbcHeaderMeComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + fillsGrpComp.byteLength() + instrmntLegExecGrpComp.byteLength();
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
        for (int[] run = RbcHeaderMeComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RbcHeaderMeComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 2;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        runs.add(cursor).add(2);
        cursor += 2;
        cursor = fillsGrpComp.padding(runs, cursor);
        cursor = instrmntLegExecGrpComp.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(rbcHeaderMeComp.trdRegTsTimeOut().value());
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
        if (!rbcHeaderMeComp.parseFrom(data, cursor, end - 64)) {
            return false;
        }
        cursor += rbcHeaderMeComp.byteLength();
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!cxlQty.parse(data, cursor)) {
            return false;
        }
        cursor += CxlQtyField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!cumQty.parse(data, cursor)) {
            return false;
        }
        cursor += CumQtyField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!execRestatementReason.parse(data, cursor)) {
            return false;
        }
        cursor += ExecRestatementReasonField.BYTE_LENGTH;
        if (!noLegExecs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegExecsField.BYTE_LENGTH;
        if (!productComplex.parse(data, cursor)) {
            return false;
        }
        cursor += ProductComplexField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!ordStatus.parse(data, cursor)) {
            return false;
        }
        cursor += OrdStatusField.BYTE_LENGTH;
        if (!execType.parse(data, cursor)) {
            return false;
        }
        cursor += ExecTypeField.BYTE_LENGTH;
        if (!matchType.parse(data, cursor)) {
            return false;
        }
        cursor += MatchTypeField.BYTE_LENGTH;
        if (!noFills.parse(data, cursor)) {
            return false;
        }
        cursor += NoFillsField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!fillsGrpComp.parse(data, cursor, end, noFills.value())) {
            return false;
        }
        cursor += fillsGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!instrmntLegExecGrpComp.parse(data, cursor, end, noLegExecs.value())) {
            return false;
        }
        cursor += instrmntLegExecGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (fillsGrpComp.size() > 255) {
            throw new IllegalStateException("fillsGrpComp holds " + fillsGrpComp.size() + " entries, more than its count field can state");
        }
        if (instrmntLegExecGrpComp.size() > 65535) {
            throw new IllegalStateException("instrmntLegExecGrpComp holds " + instrmntLegExecGrpComp.size() + " entries, more than its count field can state");
        }
        noFills.value((short) fillsGrpComp.size());
        noLegExecs.value(instrmntLegExecGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderMeComp.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = cxlQty.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = cumQty.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = execRestatementReason.encode(data, cursor);
        cursor = noLegExecs.encode(data, cursor);
        cursor = productComplex.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = ordStatus.encode(data, cursor);
        cursor = execType.encode(data, cursor);
        cursor = matchType.encode(data, cursor);
        cursor = noFills.encode(data, cursor);
        if (buffer != null && buffer.length >= 122) {
            System.arraycopy(buffer, 120, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = fillsGrpComp.encode(data, cursor);
        cursor = instrmntLegExecGrpComp.encode(data, cursor);
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
        rbcHeaderMeComp.clear();
        fillsGrpComp.clear();
        instrmntLegExecGrpComp.clear();
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
            if (field != noFills && field != noLegExecs && !field.isRecognized()) {
                return false;
            }
        }
        if (!fillsGrpComp.isRecognized()) {
            return false;
        }
        return instrmntLegExecGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noFills && field != noLegExecs && !field.isValid()) {
                return false;
            }
        }
        if (!fillsGrpComp.isValid()) {
            return false;
        }
        if (!instrmntLegExecGrpComp.isValid()) {
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
        if (!rbcHeaderMeComp.isDecoded()) {
            return rbcHeaderMeComp.failedAt();
        }
        if (!orderId.isDecoded()) {
            return Optional.of(orderId);
        }
        if (!execId.isDecoded()) {
            return Optional.of(execId);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!cxlQty.isDecoded()) {
            return Optional.of(cxlQty);
        }
        if (!leavesQty.isDecoded()) {
            return Optional.of(leavesQty);
        }
        if (!cumQty.isDecoded()) {
            return Optional.of(cumQty);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!execRestatementReason.isDecoded()) {
            return Optional.of(execRestatementReason);
        }
        if (!noLegExecs.isDecoded()) {
            return Optional.of(noLegExecs);
        }
        if (!productComplex.isDecoded()) {
            return Optional.of(productComplex);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!ordStatus.isDecoded()) {
            return Optional.of(ordStatus);
        }
        if (!execType.isDecoded()) {
            return Optional.of(execType);
        }
        if (!matchType.isDecoded()) {
            return Optional.of(matchType);
        }
        if (!noFills.isDecoded()) {
            return Optional.of(noFills);
        }
        if (!fillsGrpComp.isDecoded()) {
            return Optional.of(fillsGrpComp.failedEntry().flatMap(FillsGrpCompEntry::failedAt).orElse(noFills));
        }
        if (!instrmntLegExecGrpComp.isDecoded()) {
            return Optional.of(instrmntLegExecGrpComp.failedEntry().flatMap(InstrmntLegExecGrpCompEntry::failedAt).orElse(noLegExecs));
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
            case "OrderId" -> Optional.of(orderId);
            case "ExecId" -> Optional.of(execId);
            case "SecurityId" -> Optional.of(securityId);
            case "CxlQty" -> Optional.of(cxlQty);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "CumQty" -> Optional.of(cumQty);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "ExecRestatementReason" -> Optional.of(execRestatementReason);
            case "NoLegExecs" -> Optional.of(noLegExecs);
            case "ProductComplex" -> Optional.of(productComplex);
            case "Side" -> Optional.of(side);
            case "OrdStatus" -> Optional.of(ordStatus);
            case "ExecType" -> Optional.of(execType);
            case "MatchType" -> Optional.of(matchType);
            case "NoFills" -> Optional.of(noFills);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ClipExecutionNotification message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(fillsGrpComp.diffFields(message.fillsGrpComp));
        changed.addAll(instrmntLegExecGrpComp.diffFields(message.instrmntLegExecGrpComp));
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
            fillsGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            instrmntLegExecGrpComp.toFormattedString(builder, options);
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
        fillsGrpComp.toFormattedString(builder, nested);
        instrmntLegExecGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof ClipExecutionNotification message)) {
            return false;
        }
        return fields.equals(message.fields) && fillsGrpComp.equals(message.fillsGrpComp) && instrmntLegExecGrpComp.equals(message.instrmntLegExecGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, fillsGrpComp, instrmntLegExecGrpComp);
    }
}
