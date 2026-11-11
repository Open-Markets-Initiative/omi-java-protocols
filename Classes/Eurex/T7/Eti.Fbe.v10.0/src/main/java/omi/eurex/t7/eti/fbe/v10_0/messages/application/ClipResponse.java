package omi.eurex.t7.eti.fbe.v10_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v10_0.fields.CrossRequestIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ExecIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MarketSegmentIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoSidesField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SecurityIdField;
import omi.eurex.t7.eti.fbe.v10_0.groups.CrossRequestAckSideGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.CrossRequestAckSideGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.structs.NrResponseHeaderMeComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the ClipResponse message from the Eti protocol.
 */
public final class ClipResponse implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 82;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Clip Response";

    /**
     * Exec Id
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Cross Request Id
     */
    private final CrossRequestIdField crossRequestId = new CrossRequestIdField();

    /**
     * No Sides
     */
    private final NoSidesField noSides = new NoSidesField();

    /**
     * Cross Request Ack Side Grp Comp
     */
    private final CrossRequestAckSideGrpCompList crossRequestAckSideGrpComp = new CrossRequestAckSideGrpCompList();

    /**
     * Nr Response Header Me Comp
     */
    private final NrResponseHeaderMeComp nrResponseHeaderMeComp = new NrResponseHeaderMeComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(nrResponseHeaderMeComp.fields(), List.<Field>of(execId), List.<Field>of(securityId), List.<Field>of(marketSegmentId), List.<Field>of(crossRequestId), List.<Field>of(noSides)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

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
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Cross Request Id
     *
     * @return the CrossRequestId field
     */
    public CrossRequestIdField crossRequestId() {
        return crossRequestId;
    }

    /**
     * No Sides
     *
     * @return the NoSides field
     */
    public NoSidesField noSides() {
        return noSides;
    }

    /**
     * Cross Request Ack Side Grp Comp
     *
     * <p>Encode writes this list's size to the NoSides field.</p>
     *
     * @return the CrossRequestAckSideGrpComp entries
     */
    public CrossRequestAckSideGrpCompList crossRequestAckSideGrpComp() {
        return crossRequestAckSideGrpComp;
    }

    /**
     * Nr Response Header Me Comp
     *
     * @return the NrResponseHeaderMeComp record
     */
    public NrResponseHeaderMeComp nrResponseHeaderMeComp() {
        return nrResponseHeaderMeComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + crossRequestAckSideGrpComp.byteLength();
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
        for (int[] run = NrResponseHeaderMeComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += NrResponseHeaderMeComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        runs.add(cursor).add(7);
        cursor += 7;
        cursor = crossRequestAckSideGrpComp.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(nrResponseHeaderMeComp.requestTime().value());
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
        if (!nrResponseHeaderMeComp.parseFrom(data, cursor, end - 32)) {
            return false;
        }
        cursor += nrResponseHeaderMeComp.byteLength();
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!crossRequestId.parse(data, cursor)) {
            return false;
        }
        cursor += CrossRequestIdField.BYTE_LENGTH;
        if (!noSides.parse(data, cursor)) {
            return false;
        }
        cursor += NoSidesField.BYTE_LENGTH;
        cursor += 7; // padding
        if (!crossRequestAckSideGrpComp.parse(data, cursor, end, noSides.value())) {
            return false;
        }
        cursor += crossRequestAckSideGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (crossRequestAckSideGrpComp.size() > 255) {
            throw new IllegalStateException("crossRequestAckSideGrpComp holds " + crossRequestAckSideGrpComp.size() + " entries, more than its count field can state");
        }
        noSides.value((short) crossRequestAckSideGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = nrResponseHeaderMeComp.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = crossRequestId.encode(data, cursor);
        cursor = noSides.encode(data, cursor);
        if (buffer != null && buffer.length >= 82) {
            System.arraycopy(buffer, 75, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
        cursor = crossRequestAckSideGrpComp.encode(data, cursor);
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
        nrResponseHeaderMeComp.clear();
        crossRequestAckSideGrpComp.clear();
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
            if (field != noSides && !field.isRecognized()) {
                return false;
            }
        }
        return crossRequestAckSideGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noSides && !field.isValid()) {
                return false;
            }
        }
        if (!crossRequestAckSideGrpComp.isValid()) {
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
        if (!nrResponseHeaderMeComp.isDecoded()) {
            return nrResponseHeaderMeComp.failedAt();
        }
        if (!execId.isDecoded()) {
            return Optional.of(execId);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!crossRequestId.isDecoded()) {
            return Optional.of(crossRequestId);
        }
        if (!noSides.isDecoded()) {
            return Optional.of(noSides);
        }
        if (!crossRequestAckSideGrpComp.isDecoded()) {
            return Optional.of(crossRequestAckSideGrpComp.failedEntry().flatMap(CrossRequestAckSideGrpCompEntry::failedAt).orElse(noSides));
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
            case "ExecId" -> Optional.of(execId);
            case "SecurityId" -> Optional.of(securityId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "CrossRequestId" -> Optional.of(crossRequestId);
            case "NoSides" -> Optional.of(noSides);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ClipResponse message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(crossRequestAckSideGrpComp.diffFields(message.crossRequestAckSideGrpComp));
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
            crossRequestAckSideGrpComp.toFormattedString(builder, options);
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
        crossRequestAckSideGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof ClipResponse message)) {
            return false;
        }
        return fields.equals(message.fields) && crossRequestAckSideGrpComp.equals(message.crossRequestAckSideGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, crossRequestAckSideGrpComp);
    }
}
