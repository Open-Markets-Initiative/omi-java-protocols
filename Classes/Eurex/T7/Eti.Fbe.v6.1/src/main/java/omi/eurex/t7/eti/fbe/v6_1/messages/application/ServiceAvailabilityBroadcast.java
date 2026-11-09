package omi.eurex.t7.eti.fbe.v6_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v6_1.fields.ApplSeqStatusField;
import omi.eurex.t7.eti.fbe.v6_1.fields.ApplSeqTradeDateField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MatchingEngineStatusField;
import omi.eurex.t7.eti.fbe.v6_1.fields.MatchingEngineTradeDateField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartitionIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.T7EntryServiceRtmStatusField;
import omi.eurex.t7.eti.fbe.v6_1.fields.T7EntryServiceRtmTradeDateField;
import omi.eurex.t7.eti.fbe.v6_1.fields.T7EntryServiceStatusField;
import omi.eurex.t7.eti.fbe.v6_1.fields.T7EntryServiceTradeDateField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradeManagerStatusField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TradeManagerTradeDateField;
import omi.eurex.t7.eti.fbe.v6_1.structs.NrbcHeaderComp;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.Message;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * Represents the ServiceAvailabilityBroadcast message from the Eti protocol.
 */
public final class ServiceAvailabilityBroadcast implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 50;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Service Availability Broadcast";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 2, 16, 2, 45, 5 };

    /**
     * Matching Engine Trade Date
     */
    private final MatchingEngineTradeDateField matchingEngineTradeDate = new MatchingEngineTradeDateField();

    /**
     * Trade Manager Trade Date
     */
    private final TradeManagerTradeDateField tradeManagerTradeDate = new TradeManagerTradeDateField();

    /**
     * Appl Seq Trade Date
     */
    private final ApplSeqTradeDateField applSeqTradeDate = new ApplSeqTradeDateField();

    /**
     * T 7 Entry Service Trade Date
     */
    private final T7EntryServiceTradeDateField t7EntryServiceTradeDate = new T7EntryServiceTradeDateField();

    /**
     * T 7 Entry Service Rtm Trade Date
     */
    private final T7EntryServiceRtmTradeDateField t7EntryServiceRtmTradeDate = new T7EntryServiceRtmTradeDateField();

    /**
     * Partition Id
     */
    private final PartitionIdField partitionId = new PartitionIdField();

    /**
     * Matching Engine Status
     */
    private final MatchingEngineStatusField matchingEngineStatus = new MatchingEngineStatusField();

    /**
     * Trade Manager Status
     */
    private final TradeManagerStatusField tradeManagerStatus = new TradeManagerStatusField();

    /**
     * Appl Seq Status
     */
    private final ApplSeqStatusField applSeqStatus = new ApplSeqStatusField();

    /**
     * T 7 Entry Service Status
     */
    private final T7EntryServiceStatusField t7EntryServiceStatus = new T7EntryServiceStatusField();

    /**
     * T 7 Entry Service Rtm Status
     */
    private final T7EntryServiceRtmStatusField t7EntryServiceRtmStatus = new T7EntryServiceRtmStatusField();

    /**
     * Nrbc Header Comp
     */
    private final NrbcHeaderComp nrbcHeaderComp = new NrbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(nrbcHeaderComp.fields(), List.<Field>of(matchingEngineTradeDate), List.<Field>of(tradeManagerTradeDate), List.<Field>of(applSeqTradeDate), List.<Field>of(t7EntryServiceTradeDate), List.<Field>of(t7EntryServiceRtmTradeDate), List.<Field>of(partitionId), List.<Field>of(matchingEngineStatus), List.<Field>of(tradeManagerStatus), List.<Field>of(applSeqStatus), List.<Field>of(t7EntryServiceStatus), List.<Field>of(t7EntryServiceRtmStatus)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Matching Engine Trade Date
     *
     * @return the MatchingEngineTradeDate field
     */
    public MatchingEngineTradeDateField matchingEngineTradeDate() {
        return matchingEngineTradeDate;
    }

    /**
     * Trade Manager Trade Date
     *
     * @return the TradeManagerTradeDate field
     */
    public TradeManagerTradeDateField tradeManagerTradeDate() {
        return tradeManagerTradeDate;
    }

    /**
     * Appl Seq Trade Date
     *
     * @return the ApplSeqTradeDate field
     */
    public ApplSeqTradeDateField applSeqTradeDate() {
        return applSeqTradeDate;
    }

    /**
     * T 7 Entry Service Trade Date
     *
     * @return the T7EntryServiceTradeDate field
     */
    public T7EntryServiceTradeDateField t7EntryServiceTradeDate() {
        return t7EntryServiceTradeDate;
    }

    /**
     * T 7 Entry Service Rtm Trade Date
     *
     * @return the T7EntryServiceRtmTradeDate field
     */
    public T7EntryServiceRtmTradeDateField t7EntryServiceRtmTradeDate() {
        return t7EntryServiceRtmTradeDate;
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
     * Matching Engine Status
     *
     * @return the MatchingEngineStatus field
     */
    public MatchingEngineStatusField matchingEngineStatus() {
        return matchingEngineStatus;
    }

    /**
     * Trade Manager Status
     *
     * @return the TradeManagerStatus field
     */
    public TradeManagerStatusField tradeManagerStatus() {
        return tradeManagerStatus;
    }

    /**
     * Appl Seq Status
     *
     * @return the ApplSeqStatus field
     */
    public ApplSeqStatusField applSeqStatus() {
        return applSeqStatus;
    }

    /**
     * T 7 Entry Service Status
     *
     * @return the T7EntryServiceStatus field
     */
    public T7EntryServiceStatusField t7EntryServiceStatus() {
        return t7EntryServiceStatus;
    }

    /**
     * T 7 Entry Service Rtm Status
     *
     * @return the T7EntryServiceRtmStatus field
     */
    public T7EntryServiceRtmStatusField t7EntryServiceRtmStatus() {
        return t7EntryServiceRtmStatus;
    }

    /**
     * Nrbc Header Comp
     *
     * @return the NrbcHeaderComp record
     */
    public NrbcHeaderComp nrbcHeaderComp() {
        return nrbcHeaderComp;
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
        return Optional.ofNullable(nrbcHeaderComp.sendingTime().value());
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
        cursor += 2; // padding
        if (!nrbcHeaderComp.parseFrom(data, cursor, end - 32)) {
            return false;
        }
        cursor += nrbcHeaderComp.byteLength();
        if (!matchingEngineTradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += MatchingEngineTradeDateField.BYTE_LENGTH;
        if (!tradeManagerTradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeManagerTradeDateField.BYTE_LENGTH;
        if (!applSeqTradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += ApplSeqTradeDateField.BYTE_LENGTH;
        if (!t7EntryServiceTradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += T7EntryServiceTradeDateField.BYTE_LENGTH;
        if (!t7EntryServiceRtmTradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += T7EntryServiceRtmTradeDateField.BYTE_LENGTH;
        if (!partitionId.parse(data, cursor)) {
            return false;
        }
        cursor += PartitionIdField.BYTE_LENGTH;
        if (!matchingEngineStatus.parse(data, cursor)) {
            return false;
        }
        cursor += MatchingEngineStatusField.BYTE_LENGTH;
        if (!tradeManagerStatus.parse(data, cursor)) {
            return false;
        }
        cursor += TradeManagerStatusField.BYTE_LENGTH;
        if (!applSeqStatus.parse(data, cursor)) {
            return false;
        }
        cursor += ApplSeqStatusField.BYTE_LENGTH;
        if (!t7EntryServiceStatus.parse(data, cursor)) {
            return false;
        }
        cursor += T7EntryServiceStatusField.BYTE_LENGTH;
        if (!t7EntryServiceRtmStatus.parse(data, cursor)) {
            return false;
        }
        cursor += T7EntryServiceRtmStatusField.BYTE_LENGTH;
        cursor += 5; // padding

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 0 + 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = nrbcHeaderComp.encode(data, cursor);
        cursor = matchingEngineTradeDate.encode(data, cursor);
        cursor = tradeManagerTradeDate.encode(data, cursor);
        cursor = applSeqTradeDate.encode(data, cursor);
        cursor = t7EntryServiceTradeDate.encode(data, cursor);
        cursor = t7EntryServiceRtmTradeDate.encode(data, cursor);
        cursor = partitionId.encode(data, cursor);
        cursor = matchingEngineStatus.encode(data, cursor);
        cursor = tradeManagerStatus.encode(data, cursor);
        cursor = applSeqStatus.encode(data, cursor);
        cursor = t7EntryServiceStatus.encode(data, cursor);
        cursor = t7EntryServiceRtmStatus.encode(data, cursor);
        if (buffer != null && buffer.length >= 45 + 5) {
            System.arraycopy(buffer, 45, data, cursor, 5); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 5, (byte) 0); // padding
        }
        cursor += 5;
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
        nrbcHeaderComp.clear();
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
            case "MatchingEngineTradeDate" -> Optional.of(matchingEngineTradeDate);
            case "TradeManagerTradeDate" -> Optional.of(tradeManagerTradeDate);
            case "ApplSeqTradeDate" -> Optional.of(applSeqTradeDate);
            case "T7EntryServiceTradeDate" -> Optional.of(t7EntryServiceTradeDate);
            case "T7EntryServiceRtmTradeDate" -> Optional.of(t7EntryServiceRtmTradeDate);
            case "PartitionId" -> Optional.of(partitionId);
            case "MatchingEngineStatus" -> Optional.of(matchingEngineStatus);
            case "TradeManagerStatus" -> Optional.of(tradeManagerStatus);
            case "ApplSeqStatus" -> Optional.of(applSeqStatus);
            case "T7EntryServiceStatus" -> Optional.of(t7EntryServiceStatus);
            case "T7EntryServiceRtmStatus" -> Optional.of(t7EntryServiceRtmStatus);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ServiceAvailabilityBroadcast message)) {
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
        if (!(other instanceof ServiceAvailabilityBroadcast message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
