package omi.cme.globex.mdp3.sbe.v1_9.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.mdp3.sbe.v1_9.fields.CurrentChunkField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.LastMsgSeqNumProcessedField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.NoChunksField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.SecurityIdField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.TotNumReportsField;
import omi.cme.globex.mdp3.sbe.v1_9.fields.TransactTimeField;
import omi.cme.globex.mdp3.sbe.v1_9.structs.SnapshotFullRefreshOrderBookGroups;
import omi.cme.globex.mdp3.sbe.v1_9.types.Field;
import omi.cme.globex.mdp3.sbe.v1_9.types.Message;
import omi.cme.globex.mdp3.sbe.v1_9.types.PrintOptions;

/**
 * Represents the SnapshotFullRefreshOrderBook message from the Mdp3 protocol.
 *
 * <p>SnapshotFullRefreshOrderBook</p>
 */
public final class SnapshotFullRefreshOrderBook implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 31;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Snapshot Full Refresh Order Book";

    /**
     * Sequence number of the last Incremental feed packet processed. This value is used to synchronize the snapshot loop with the real-time feed
     */
    private final LastMsgSeqNumProcessedField lastMsgSeqNumProcessed = new LastMsgSeqNumProcessedField();

    /**
     * Total number of messages replayed in the loop
     */
    private final TotNumReportsField totNumReports = new TotNumReportsField();

    /**
     * Unique instrument ID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Total number of packets that constitutes a single instrument order book
     */
    private final NoChunksField noChunks = new NoChunksField();

    /**
     * Chunk sequence
     */
    private final CurrentChunkField currentChunk = new CurrentChunkField();

    /**
     * Start of event processing time in number of nanoseconds since Unix epoch
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * NoMDEntries Block
     */
    private final SnapshotFullRefreshOrderBookGroups snapshotFullRefreshOrderBookGroups = new SnapshotFullRefreshOrderBookGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(lastMsgSeqNumProcessed, totNumReports, securityId, noChunks, currentChunk, transactTime);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Sequence number of the last Incremental feed packet processed. This value is used to synchronize the snapshot loop with the real-time feed
     *
     * @return the LastMsgSeqNumProcessed field
     */
    public LastMsgSeqNumProcessedField lastMsgSeqNumProcessed() {
        return lastMsgSeqNumProcessed;
    }

    /**
     * Total number of messages replayed in the loop
     *
     * @return the TotNumReports field
     */
    public TotNumReportsField totNumReports() {
        return totNumReports;
    }

    /**
     * Unique instrument ID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Total number of packets that constitutes a single instrument order book
     *
     * @return the NoChunks field
     */
    public NoChunksField noChunks() {
        return noChunks;
    }

    /**
     * Chunk sequence
     *
     * @return the CurrentChunk field
     */
    public CurrentChunkField currentChunk() {
        return currentChunk;
    }

    /**
     * Start of event processing time in number of nanoseconds since Unix epoch
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * NoMDEntries Block
     *
     * @return the SnapshotFullRefreshOrderBookGroups record
     */
    public SnapshotFullRefreshOrderBookGroups snapshotFullRefreshOrderBookGroups() {
        return snapshotFullRefreshOrderBookGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + snapshotFullRefreshOrderBookGroups.byteLength() - SnapshotFullRefreshOrderBookGroups.MINIMUM_BYTE_LENGTH;
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
        return Optional.ofNullable(transactTime.value());
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
        if (!lastMsgSeqNumProcessed.parse(data, cursor)) {
            return false;
        }
        cursor += LastMsgSeqNumProcessedField.BYTE_LENGTH;
        if (!totNumReports.parse(data, cursor)) {
            return false;
        }
        cursor += TotNumReportsField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!noChunks.parse(data, cursor)) {
            return false;
        }
        cursor += NoChunksField.BYTE_LENGTH;
        if (!currentChunk.parse(data, cursor)) {
            return false;
        }
        cursor += CurrentChunkField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!snapshotFullRefreshOrderBookGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += snapshotFullRefreshOrderBookGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = lastMsgSeqNumProcessed.encode(data, cursor);
        cursor = totNumReports.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = noChunks.encode(data, cursor);
        cursor = currentChunk.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = snapshotFullRefreshOrderBookGroups.encode(data, cursor);
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
        snapshotFullRefreshOrderBookGroups.clear();
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
        return snapshotFullRefreshOrderBookGroups.isRecognized();
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
        if (!snapshotFullRefreshOrderBookGroups.isValid()) {
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
        if (!lastMsgSeqNumProcessed.isDecoded()) {
            return Optional.of(lastMsgSeqNumProcessed);
        }
        if (!totNumReports.isDecoded()) {
            return Optional.of(totNumReports);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!noChunks.isDecoded()) {
            return Optional.of(noChunks);
        }
        if (!currentChunk.isDecoded()) {
            return Optional.of(currentChunk);
        }
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!snapshotFullRefreshOrderBookGroups.isDecoded()) {
            return snapshotFullRefreshOrderBookGroups.failedAt();
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
            case "LastMsgSeqNumProcessed" -> Optional.of(lastMsgSeqNumProcessed);
            case "TotNumReports" -> Optional.of(totNumReports);
            case "SecurityId" -> Optional.of(securityId);
            case "NoChunks" -> Optional.of(noChunks);
            case "CurrentChunk" -> Optional.of(currentChunk);
            case "TransactTime" -> Optional.of(transactTime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SnapshotFullRefreshOrderBook message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(snapshotFullRefreshOrderBookGroups.diffFields(message.snapshotFullRefreshOrderBookGroups));
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
            snapshotFullRefreshOrderBookGroups.toFormattedString(builder, options);
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
        snapshotFullRefreshOrderBookGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof SnapshotFullRefreshOrderBook message)) {
            return false;
        }
        return fields.equals(message.fields) && snapshotFullRefreshOrderBookGroups.equals(message.snapshotFullRefreshOrderBookGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, snapshotFullRefreshOrderBookGroups);
    }
}
