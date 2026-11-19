package omi.bse.bseindia.eti.fbe.v1_6_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.AlgoIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ClOrdIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ExecIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.NoLegExecsField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.NoOfMultiLegExecsField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.NoOfMultiLegField;
import omi.bse.bseindia.eti.fbe.v1_6_14.groups.InstrmntLegExecGrpCompEntry;
import omi.bse.bseindia.eti.fbe.v1_6_14.groups.InstrmntLegExecGrpCompList;
import omi.bse.bseindia.eti.fbe.v1_6_14.groups.MultiLegExecGrpCompEntry;
import omi.bse.bseindia.eti.fbe.v1_6_14.groups.MultiLegExecGrpCompList;
import omi.bse.bseindia.eti.fbe.v1_6_14.groups.MultiLegFillGrpCompEntry;
import omi.bse.bseindia.eti.fbe.v1_6_14.groups.MultiLegFillGrpCompList;
import omi.bse.bseindia.eti.fbe.v1_6_14.structs.ResponseHeaderMeComp;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Field;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Message;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.PrintOptions;

/**
 * Represents the MultiLegExecResponse message from the Eti protocol.
 */
public final class MultiLegExecResponse implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 114;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Multi Leg Exec Response";

    /**
     * Cl Ord Id
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Exec Id
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * No Leg Execs
     */
    private final NoLegExecsField noLegExecs = new NoLegExecsField();

    /**
     * No Of Multi Leg
     */
    private final NoOfMultiLegField noOfMultiLeg = new NoOfMultiLegField();

    /**
     * No Of Multi Leg Execs
     */
    private final NoOfMultiLegExecsField noOfMultiLegExecs = new NoOfMultiLegExecsField();

    /**
     * Algo Id
     */
    private final AlgoIdField algoId = new AlgoIdField();

    /**
     * Multi Leg Exec Grp Comp
     */
    private final MultiLegExecGrpCompList multiLegExecGrpComp = new MultiLegExecGrpCompList();

    /**
     * Multi Leg Fill Grp Comp
     */
    private final MultiLegFillGrpCompList multiLegFillGrpComp = new MultiLegFillGrpCompList();

    /**
     * Instrmnt Leg Exec Grp Comp
     */
    private final InstrmntLegExecGrpCompList instrmntLegExecGrpComp = new InstrmntLegExecGrpCompList();

    /**
     * Response Header Me Comp
     */
    private final ResponseHeaderMeComp responseHeaderMeComp = new ResponseHeaderMeComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(responseHeaderMeComp.fields(), List.<Field>of(clOrdId), List.<Field>of(execId), List.<Field>of(noLegExecs), List.<Field>of(noOfMultiLeg), List.<Field>of(noOfMultiLegExecs), List.<Field>of(algoId)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Cl Ord Id
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
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
     * No Leg Execs
     *
     * @return the NoLegExecs field
     */
    public NoLegExecsField noLegExecs() {
        return noLegExecs;
    }

    /**
     * No Of Multi Leg
     *
     * @return the NoOfMultiLeg field
     */
    public NoOfMultiLegField noOfMultiLeg() {
        return noOfMultiLeg;
    }

    /**
     * No Of Multi Leg Execs
     *
     * @return the NoOfMultiLegExecs field
     */
    public NoOfMultiLegExecsField noOfMultiLegExecs() {
        return noOfMultiLegExecs;
    }

    /**
     * Algo Id
     *
     * @return the AlgoId field
     */
    public AlgoIdField algoId() {
        return algoId;
    }

    /**
     * Multi Leg Exec Grp Comp
     *
     * <p>Encode writes this list's size to the NoOfMultiLeg field.</p>
     *
     * @return the MultiLegExecGrpComp entries
     */
    public MultiLegExecGrpCompList multiLegExecGrpComp() {
        return multiLegExecGrpComp;
    }

    /**
     * Multi Leg Fill Grp Comp
     *
     * <p>Encode writes this list's size to the NoOfMultiLegExecs field.</p>
     *
     * @return the MultiLegFillGrpComp entries
     */
    public MultiLegFillGrpCompList multiLegFillGrpComp() {
        return multiLegFillGrpComp;
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
     * Response Header Me Comp
     *
     * @return the ResponseHeaderMeComp record
     */
    public ResponseHeaderMeComp responseHeaderMeComp() {
        return responseHeaderMeComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + multiLegExecGrpComp.byteLength() + multiLegFillGrpComp.byteLength() + instrmntLegExecGrpComp.byteLength();
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
        for (int[] run = ResponseHeaderMeComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += ResponseHeaderMeComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 16;
        runs.add(cursor).add(4);
        cursor += 4;
        cursor = multiLegExecGrpComp.padding(runs, cursor);
        cursor = multiLegFillGrpComp.padding(runs, cursor);
        cursor = instrmntLegExecGrpComp.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(responseHeaderMeComp.requestTime().value());
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
        if (!responseHeaderMeComp.parseFrom(data, cursor, end - 40)) {
            return false;
        }
        cursor += responseHeaderMeComp.byteLength();
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!noLegExecs.parse(data, cursor)) {
            return false;
        }
        cursor += NoLegExecsField.BYTE_LENGTH;
        if (!noOfMultiLeg.parse(data, cursor)) {
            return false;
        }
        cursor += NoOfMultiLegField.BYTE_LENGTH;
        if (!noOfMultiLegExecs.parse(data, cursor)) {
            return false;
        }
        cursor += NoOfMultiLegExecsField.BYTE_LENGTH;
        if (!algoId.parse(data, cursor)) {
            return false;
        }
        cursor += AlgoIdField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!multiLegExecGrpComp.parse(data, cursor, end, noOfMultiLeg.value())) {
            return false;
        }
        cursor += multiLegExecGrpComp.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (!multiLegFillGrpComp.parse(data, cursor, end, noOfMultiLegExecs.value())) {
            return false;
        }
        cursor += multiLegFillGrpComp.byteLength();
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
        if (multiLegExecGrpComp.size() > 255) {
            throw new IllegalStateException("multiLegExecGrpComp holds " + multiLegExecGrpComp.size() + " entries, more than its count field can state");
        }
        if (multiLegFillGrpComp.size() > 255) {
            throw new IllegalStateException("multiLegFillGrpComp holds " + multiLegFillGrpComp.size() + " entries, more than its count field can state");
        }
        if (instrmntLegExecGrpComp.size() > 65535) {
            throw new IllegalStateException("instrmntLegExecGrpComp holds " + instrmntLegExecGrpComp.size() + " entries, more than its count field can state");
        }
        noOfMultiLeg.value((short) multiLegExecGrpComp.size());
        noOfMultiLegExecs.value((short) multiLegFillGrpComp.size());
        noLegExecs.value(instrmntLegExecGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = responseHeaderMeComp.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = noLegExecs.encode(data, cursor);
        cursor = noOfMultiLeg.encode(data, cursor);
        cursor = noOfMultiLegExecs.encode(data, cursor);
        cursor = algoId.encode(data, cursor);
        if (buffer != null && buffer.length >= 114) {
            System.arraycopy(buffer, 110, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = multiLegExecGrpComp.encode(data, cursor);
        cursor = multiLegFillGrpComp.encode(data, cursor);
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
        responseHeaderMeComp.clear();
        multiLegExecGrpComp.clear();
        multiLegFillGrpComp.clear();
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
            if (field != noOfMultiLeg && field != noOfMultiLegExecs && field != noLegExecs && !field.isRecognized()) {
                return false;
            }
        }
        if (!multiLegExecGrpComp.isRecognized()) {
            return false;
        }
        if (!multiLegFillGrpComp.isRecognized()) {
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
            if (field != noOfMultiLeg && field != noOfMultiLegExecs && field != noLegExecs && !field.isValid()) {
                return false;
            }
        }
        if (!multiLegExecGrpComp.isValid()) {
            return false;
        }
        if (!multiLegFillGrpComp.isValid()) {
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
        if (!responseHeaderMeComp.isDecoded()) {
            return responseHeaderMeComp.failedAt();
        }
        if (!clOrdId.isDecoded()) {
            return Optional.of(clOrdId);
        }
        if (!execId.isDecoded()) {
            return Optional.of(execId);
        }
        if (!noLegExecs.isDecoded()) {
            return Optional.of(noLegExecs);
        }
        if (!noOfMultiLeg.isDecoded()) {
            return Optional.of(noOfMultiLeg);
        }
        if (!noOfMultiLegExecs.isDecoded()) {
            return Optional.of(noOfMultiLegExecs);
        }
        if (!algoId.isDecoded()) {
            return Optional.of(algoId);
        }
        if (!multiLegExecGrpComp.isDecoded()) {
            return Optional.of(multiLegExecGrpComp.failedEntry().flatMap(MultiLegExecGrpCompEntry::failedAt).orElse(noOfMultiLeg));
        }
        if (!multiLegFillGrpComp.isDecoded()) {
            return Optional.of(multiLegFillGrpComp.failedEntry().flatMap(MultiLegFillGrpCompEntry::failedAt).orElse(noOfMultiLegExecs));
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
            case "ClOrdId" -> Optional.of(clOrdId);
            case "ExecId" -> Optional.of(execId);
            case "NoLegExecs" -> Optional.of(noLegExecs);
            case "NoOfMultiLeg" -> Optional.of(noOfMultiLeg);
            case "NoOfMultiLegExecs" -> Optional.of(noOfMultiLegExecs);
            case "AlgoId" -> Optional.of(algoId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MultiLegExecResponse message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(multiLegExecGrpComp.diffFields(message.multiLegExecGrpComp));
        changed.addAll(multiLegFillGrpComp.diffFields(message.multiLegFillGrpComp));
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
            multiLegExecGrpComp.toFormattedString(builder, options);
            builder.append(", ");
            multiLegFillGrpComp.toFormattedString(builder, options);
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
        multiLegExecGrpComp.toFormattedString(builder, nested);
        multiLegFillGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof MultiLegExecResponse message)) {
            return false;
        }
        return fields.equals(message.fields) && multiLegExecGrpComp.equals(message.multiLegExecGrpComp) && multiLegFillGrpComp.equals(message.multiLegFillGrpComp) && instrmntLegExecGrpComp.equals(message.instrmntLegExecGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, multiLegExecGrpComp, multiLegFillGrpComp, instrmntLegExecGrpComp);
    }
}
