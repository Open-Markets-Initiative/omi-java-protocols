package omi.jpx.tseequities.indexstatistics.flex.v19_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.fields.IssueClassificationCodeField;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.fields.NetChangeDistinctionField;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.fields.OutputTimeField;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.fields.ReservedField;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.groups.TopRankByNetChangeEntry;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.groups.TopRankByNetChangeList;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.types.Field;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.types.Message;
import omi.jpx.tseequities.indexstatistics.flex.v19_5.types.PrintOptions;

/**
 * Represents the RankingByNetChangeMessage message from the IndexStatistics protocol.
 *
 * <p>In this tag, information concerning top 30 issues by net change for each market (issue classification) will be set. This data appears as part of a statistics message.</p>
 */
public final class RankingByNetChangeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 1453;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Ranking By Net Change Message";

    /**
     * The number of entries that TopRankByNetChange carries on the wire.
     */
    public static final int TOP_RANK_BY_NET_CHANGE_COUNT = 30;

    /**
     * This item is reserved.
     */
    private final ReservedField reserved = new ReservedField();

    /**
     * Indicates the time of computation.
     */
    private final OutputTimeField outputTime = new OutputTimeField();

    /**
     * Indicates the issue classification code.
     */
    private final IssueClassificationCodeField issueClassificationCode = new IssueClassificationCodeField();

    /**
     * Indicates the distinction between net change.
     */
    private final NetChangeDistinctionField netChangeDistinction = new NetChangeDistinctionField();

    /**
     * Top rank by net change
     */
    private final TopRankByNetChangeList topRankByNetChange = new TopRankByNetChangeList(TOP_RANK_BY_NET_CHANGE_COUNT);

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(reserved, outputTime, issueClassificationCode, netChangeDistinction);

    private byte[] buffer;

    private boolean decoded;

    /**
     * This item is reserved.
     *
     * @return the Reserved field
     */
    public ReservedField reserved() {
        return reserved;
    }

    /**
     * Indicates the time of computation.
     *
     * @return the OutputTime field
     */
    public OutputTimeField outputTime() {
        return outputTime;
    }

    /**
     * Indicates the issue classification code.
     *
     * @return the IssueClassificationCode field
     */
    public IssueClassificationCodeField issueClassificationCode() {
        return issueClassificationCode;
    }

    /**
     * Indicates the distinction between net change.
     *
     * @return the NetChangeDistinction field
     */
    public NetChangeDistinctionField netChangeDistinction() {
        return netChangeDistinction;
    }

    /**
     * Top rank by net change
     *
     * <p>This list always holds 30 entries: replace one with {@code set}, or set the values of those it holds.</p>
     *
     * @return the TopRankByNetChange entries
     */
    public TopRankByNetChangeList topRankByNetChange() {
        return topRankByNetChange;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!reserved.parse(data, cursor)) {
            return false;
        }
        cursor += ReservedField.BYTE_LENGTH;
        if (!outputTime.parse(data, cursor)) {
            return false;
        }
        cursor += OutputTimeField.BYTE_LENGTH;
        if (!issueClassificationCode.parse(data, cursor)) {
            return false;
        }
        cursor += IssueClassificationCodeField.BYTE_LENGTH;
        if (!netChangeDistinction.parse(data, cursor)) {
            return false;
        }
        cursor += NetChangeDistinctionField.BYTE_LENGTH;
        if (!topRankByNetChange.parse(data, cursor, end, TOP_RANK_BY_NET_CHANGE_COUNT)) {
            return false;
        }
        cursor += topRankByNetChange.byteLength();

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = reserved.encode(data, cursor);
        cursor = outputTime.encode(data, cursor);
        cursor = issueClassificationCode.encode(data, cursor);
        cursor = netChangeDistinction.encode(data, cursor);
        cursor = topRankByNetChange.encode(data, cursor);
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
        topRankByNetChange.clear();
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
        return topRankByNetChange.isRecognized();
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
        if (!topRankByNetChange.isValid()) {
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
        if (!reserved.isDecoded()) {
            return Optional.of(reserved);
        }
        if (!outputTime.isDecoded()) {
            return Optional.of(outputTime);
        }
        if (!issueClassificationCode.isDecoded()) {
            return Optional.of(issueClassificationCode);
        }
        if (!netChangeDistinction.isDecoded()) {
            return Optional.of(netChangeDistinction);
        }
        if (!topRankByNetChange.isDecoded()) {
            return topRankByNetChange.failedEntry().flatMap(TopRankByNetChangeEntry::failedAt);
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
            case "Reserved" -> Optional.of(reserved);
            case "OutputTime" -> Optional.of(outputTime);
            case "IssueClassificationCode" -> Optional.of(issueClassificationCode);
            case "NetChangeDistinction" -> Optional.of(netChangeDistinction);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof RankingByNetChangeMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(topRankByNetChange.diffFields(message.topRankByNetChange));
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
            topRankByNetChange.toFormattedString(builder, options);
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
        topRankByNetChange.toFormattedString(builder, nested);
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
        if (!(other instanceof RankingByNetChangeMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && topRankByNetChange.equals(message.topRankByNetChange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, topRankByNetChange);
    }
}
