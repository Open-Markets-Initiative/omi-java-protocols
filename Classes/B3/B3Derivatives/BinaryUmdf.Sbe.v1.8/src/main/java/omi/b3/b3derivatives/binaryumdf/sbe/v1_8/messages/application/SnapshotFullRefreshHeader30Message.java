package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.LastMsgSeqNumProcessedField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.LastRptSeqField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.SecurityIdField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TotNumBidsField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TotNumOffersField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TotNumReportsField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.fields.TotNumStatsField;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.Field;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.PrintOptions;

/**
 * Represents the SnapshotFullRefreshHeader30Message message from the BinaryUmdf protocol.
 *
 * <p>SnapshotFullRefresh_Header_30Message</p>
 */
public final class SnapshotFullRefreshHeader30Message implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 32;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Snapshot Full Refresh Header 30 Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 26, 2 };

    /**
     * securityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * lastMsgSeqNumProcessed
     */
    private final LastMsgSeqNumProcessedField lastMsgSeqNumProcessed = new LastMsgSeqNumProcessedField();

    /**
     * totNumReports
     */
    private final TotNumReportsField totNumReports = new TotNumReportsField();

    /**
     * totNumBids
     */
    private final TotNumBidsField totNumBids = new TotNumBidsField();

    /**
     * totNumOffers
     */
    private final TotNumOffersField totNumOffers = new TotNumOffersField();

    /**
     * totNumStats
     */
    private final TotNumStatsField totNumStats = new TotNumStatsField();

    /**
     * lastRptSeq
     */
    private final LastRptSeqField lastRptSeq = new LastRptSeqField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, lastMsgSeqNumProcessed, totNumReports, totNumBids, totNumOffers, totNumStats, lastRptSeq);

    private byte[] buffer;

    private boolean decoded;

    /**
     * securityID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * lastMsgSeqNumProcessed
     *
     * @return the LastMsgSeqNumProcessed field
     */
    public LastMsgSeqNumProcessedField lastMsgSeqNumProcessed() {
        return lastMsgSeqNumProcessed;
    }

    /**
     * totNumReports
     *
     * @return the TotNumReports field
     */
    public TotNumReportsField totNumReports() {
        return totNumReports;
    }

    /**
     * totNumBids
     *
     * @return the TotNumBids field
     */
    public TotNumBidsField totNumBids() {
        return totNumBids;
    }

    /**
     * totNumOffers
     *
     * @return the TotNumOffers field
     */
    public TotNumOffersField totNumOffers() {
        return totNumOffers;
    }

    /**
     * totNumStats
     *
     * @return the TotNumStats field
     */
    public TotNumStatsField totNumStats() {
        return totNumStats;
    }

    /**
     * lastRptSeq
     *
     * @return the LastRptSeq field
     */
    public LastRptSeqField lastRptSeq() {
        return lastRptSeq;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!lastMsgSeqNumProcessed.parse(data, cursor)) {
            return false;
        }
        cursor += LastMsgSeqNumProcessedField.BYTE_LENGTH;
        if (!totNumReports.parse(data, cursor)) {
            return false;
        }
        cursor += TotNumReportsField.BYTE_LENGTH;
        if (!totNumBids.parse(data, cursor)) {
            return false;
        }
        cursor += TotNumBidsField.BYTE_LENGTH;
        if (!totNumOffers.parse(data, cursor)) {
            return false;
        }
        cursor += TotNumOffersField.BYTE_LENGTH;
        if (!totNumStats.parse(data, cursor)) {
            return false;
        }
        cursor += TotNumStatsField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!lastRptSeq.parse(data, cursor)) {
            return false;
        }
        cursor += LastRptSeqField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = lastMsgSeqNumProcessed.encode(data, cursor);
        cursor = totNumReports.encode(data, cursor);
        cursor = totNumBids.encode(data, cursor);
        cursor = totNumOffers.encode(data, cursor);
        cursor = totNumStats.encode(data, cursor);
        if (buffer != null && buffer.length >= 26 + 2) {
            System.arraycopy(buffer, 26, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = lastRptSeq.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
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
        for (Field field : fields) {
            if (!field.isDecoded()) {
                return Optional.of(field);
            }
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
            case "SecurityId" -> Optional.of(securityId);
            case "LastMsgSeqNumProcessed" -> Optional.of(lastMsgSeqNumProcessed);
            case "TotNumReports" -> Optional.of(totNumReports);
            case "TotNumBids" -> Optional.of(totNumBids);
            case "TotNumOffers" -> Optional.of(totNumOffers);
            case "TotNumStats" -> Optional.of(totNumStats);
            case "LastRptSeq" -> Optional.of(lastRptSeq);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SnapshotFullRefreshHeader30Message message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof SnapshotFullRefreshHeader30Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
