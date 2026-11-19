package omi.eurex.t7.eti.fbe.v14_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v14_1.fields.NetworkMsgIdField;
import omi.eurex.t7.eti.fbe.v14_1.fields.NoPartyRiskLimitsField;
import omi.eurex.t7.eti.fbe.v14_1.fields.PartitionIdField;
import omi.eurex.t7.eti.fbe.v14_1.groups.RraUpdateBasePartyGrpCompEntry;
import omi.eurex.t7.eti.fbe.v14_1.groups.RraUpdateBasePartyGrpCompList;
import omi.eurex.t7.eti.fbe.v14_1.structs.RequestHeaderComp;
import omi.eurex.t7.eti.fbe.v14_1.types.Field;
import omi.eurex.t7.eti.fbe.v14_1.types.Message;
import omi.eurex.t7.eti.fbe.v14_1.types.PrintOptions;

/**
 * Represents the UpdateRemainingRiskAllowanceBaseRequest message from the Eti protocol.
 */
public final class UpdateRemainingRiskAllowanceBaseRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 26;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Update Remaining Risk Allowance Base Request";

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Partition Id
     */
    private final PartitionIdField partitionId = new PartitionIdField();

    /**
     * No Party Risk Limits
     */
    private final NoPartyRiskLimitsField noPartyRiskLimits = new NoPartyRiskLimitsField();

    /**
     * Rra Update Base Party Grp Comp
     */
    private final RraUpdateBasePartyGrpCompList rraUpdateBasePartyGrpComp = new RraUpdateBasePartyGrpCompList();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(partitionId), List.<Field>of(noPartyRiskLimits)).flatMap(List::stream).toList();

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
     * Partition Id
     *
     * @return the PartitionId field
     */
    public PartitionIdField partitionId() {
        return partitionId;
    }

    /**
     * No Party Risk Limits
     *
     * @return the NoPartyRiskLimits field
     */
    public NoPartyRiskLimitsField noPartyRiskLimits() {
        return noPartyRiskLimits;
    }

    /**
     * Rra Update Base Party Grp Comp
     *
     * <p>Encode writes this list's size to the NoPartyRiskLimits field.</p>
     *
     * @return the RraUpdateBasePartyGrpComp entries
     */
    public RraUpdateBasePartyGrpCompList rraUpdateBasePartyGrpComp() {
        return rraUpdateBasePartyGrpComp;
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
        return MINIMUM_BYTE_LENGTH + rraUpdateBasePartyGrpComp.byteLength();
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
        cursor += 2;
        cursor += 2;
        runs.add(cursor).add(4);
        cursor += 4;
        cursor = rraUpdateBasePartyGrpComp.padding(runs, cursor);
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
        if (!networkMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += NetworkMsgIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!requestHeaderComp.parseFrom(data, cursor, end - 8)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!partitionId.parse(data, cursor)) {
            return false;
        }
        cursor += PartitionIdField.BYTE_LENGTH;
        if (!noPartyRiskLimits.parse(data, cursor)) {
            return false;
        }
        cursor += NoPartyRiskLimitsField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!rraUpdateBasePartyGrpComp.parse(data, cursor, end, noPartyRiskLimits.value())) {
            return false;
        }
        cursor += rraUpdateBasePartyGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (rraUpdateBasePartyGrpComp.size() > 65535) {
            throw new IllegalStateException("rraUpdateBasePartyGrpComp holds " + rraUpdateBasePartyGrpComp.size() + " entries, more than its count field can state");
        }
        noPartyRiskLimits.value(rraUpdateBasePartyGrpComp.size());
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = partitionId.encode(data, cursor);
        cursor = noPartyRiskLimits.encode(data, cursor);
        if (buffer != null && buffer.length >= 26) {
            System.arraycopy(buffer, 22, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = rraUpdateBasePartyGrpComp.encode(data, cursor);
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
        rraUpdateBasePartyGrpComp.clear();
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
            if (field != noPartyRiskLimits && !field.isRecognized()) {
                return false;
            }
        }
        return rraUpdateBasePartyGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noPartyRiskLimits && !field.isValid()) {
                return false;
            }
        }
        if (!rraUpdateBasePartyGrpComp.isValid()) {
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
        if (!partitionId.isDecoded()) {
            return Optional.of(partitionId);
        }
        if (!noPartyRiskLimits.isDecoded()) {
            return Optional.of(noPartyRiskLimits);
        }
        if (!rraUpdateBasePartyGrpComp.isDecoded()) {
            return Optional.of(rraUpdateBasePartyGrpComp.failedEntry().flatMap(RraUpdateBasePartyGrpCompEntry::failedAt).orElse(noPartyRiskLimits));
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
            case "PartitionId" -> Optional.of(partitionId);
            case "NoPartyRiskLimits" -> Optional.of(noPartyRiskLimits);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof UpdateRemainingRiskAllowanceBaseRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(rraUpdateBasePartyGrpComp.diffFields(message.rraUpdateBasePartyGrpComp));
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
            rraUpdateBasePartyGrpComp.toFormattedString(builder, options);
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
        rraUpdateBasePartyGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof UpdateRemainingRiskAllowanceBaseRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && rraUpdateBasePartyGrpComp.equals(message.rraUpdateBasePartyGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, rraUpdateBasePartyGrpComp);
    }
}
