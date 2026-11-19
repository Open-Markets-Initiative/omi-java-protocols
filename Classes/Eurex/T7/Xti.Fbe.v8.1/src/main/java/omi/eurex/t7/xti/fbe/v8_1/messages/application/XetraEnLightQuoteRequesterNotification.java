package omi.eurex.t7.xti.fbe.v8_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v8_1.fields.NegotiationIdField;
import omi.eurex.t7.xti.fbe.v8_1.fields.NoQuoteEntriesField;
import omi.eurex.t7.xti.fbe.v8_1.fields.QuoteReqIdField;
import omi.eurex.t7.xti.fbe.v8_1.fields.TradeIdField;
import omi.eurex.t7.xti.fbe.v8_1.fields.TransactTimeField;
import omi.eurex.t7.xti.fbe.v8_1.groups.SrqsQuoteEntryGrpCompEntry;
import omi.eurex.t7.xti.fbe.v8_1.groups.SrqsQuoteEntryGrpCompList;
import omi.eurex.t7.xti.fbe.v8_1.structs.RbcHeaderComp;
import omi.eurex.t7.xti.fbe.v8_1.types.Field;
import omi.eurex.t7.xti.fbe.v8_1.types.Message;
import omi.eurex.t7.xti.fbe.v8_1.types.PrintOptions;

/**
 * Represents the XetraEnLightQuoteRequesterNotification message from the Xti protocol.
 */
public final class XetraEnLightQuoteRequesterNotification implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 74;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Xetra En Light Quote Requester Notification";

    /**
     * Transact Time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Negotiation Id
     */
    private final NegotiationIdField negotiationId = new NegotiationIdField();

    /**
     * Trade Id
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Quote Req Id
     */
    private final QuoteReqIdField quoteReqId = new QuoteReqIdField();

    /**
     * No Quote Entries
     */
    private final NoQuoteEntriesField noQuoteEntries = new NoQuoteEntriesField();

    /**
     * Srqs Quote Entry Grp Comp
     */
    private final SrqsQuoteEntryGrpCompList srqsQuoteEntryGrpComp = new SrqsQuoteEntryGrpCompList();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(transactTime), List.<Field>of(negotiationId), List.<Field>of(tradeId), List.<Field>of(quoteReqId), List.<Field>of(noQuoteEntries)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Transact Time
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Negotiation Id
     *
     * @return the NegotiationId field
     */
    public NegotiationIdField negotiationId() {
        return negotiationId;
    }

    /**
     * Trade Id
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Quote Req Id
     *
     * @return the QuoteReqId field
     */
    public QuoteReqIdField quoteReqId() {
        return quoteReqId;
    }

    /**
     * No Quote Entries
     *
     * @return the NoQuoteEntries field
     */
    public NoQuoteEntriesField noQuoteEntries() {
        return noQuoteEntries;
    }

    /**
     * Srqs Quote Entry Grp Comp
     *
     * <p>Encode writes this list's size to the NoQuoteEntries field.</p>
     *
     * @return the SrqsQuoteEntryGrpComp entries
     */
    public SrqsQuoteEntryGrpCompList srqsQuoteEntryGrpComp() {
        return srqsQuoteEntryGrpComp;
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
        return MINIMUM_BYTE_LENGTH + srqsQuoteEntryGrpComp.byteLength();
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
        cursor += 20;
        cursor += 1;
        runs.add(cursor).add(3);
        cursor += 3;
        cursor = srqsQuoteEntryGrpComp.padding(runs, cursor);
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 40)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!negotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiationIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!quoteReqId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteReqIdField.BYTE_LENGTH;
        if (!noQuoteEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NoQuoteEntriesField.BYTE_LENGTH;
        cursor += 3; // padding
        if (!srqsQuoteEntryGrpComp.parse(data, cursor, end, noQuoteEntries.value())) {
            return false;
        }
        cursor += srqsQuoteEntryGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (srqsQuoteEntryGrpComp.size() > 255) {
            throw new IllegalStateException("srqsQuoteEntryGrpComp holds " + srqsQuoteEntryGrpComp.size() + " entries, more than its count field can state");
        }
        noQuoteEntries.value((short) srqsQuoteEntryGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = negotiationId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = quoteReqId.encode(data, cursor);
        cursor = noQuoteEntries.encode(data, cursor);
        if (buffer != null && buffer.length >= 74) {
            System.arraycopy(buffer, 71, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
        cursor = srqsQuoteEntryGrpComp.encode(data, cursor);
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
        srqsQuoteEntryGrpComp.clear();
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
            if (field != noQuoteEntries && !field.isRecognized()) {
                return false;
            }
        }
        return srqsQuoteEntryGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noQuoteEntries && !field.isValid()) {
                return false;
            }
        }
        if (!srqsQuoteEntryGrpComp.isValid()) {
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
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!negotiationId.isDecoded()) {
            return Optional.of(negotiationId);
        }
        if (!tradeId.isDecoded()) {
            return Optional.of(tradeId);
        }
        if (!quoteReqId.isDecoded()) {
            return Optional.of(quoteReqId);
        }
        if (!noQuoteEntries.isDecoded()) {
            return Optional.of(noQuoteEntries);
        }
        if (!srqsQuoteEntryGrpComp.isDecoded()) {
            return Optional.of(srqsQuoteEntryGrpComp.failedEntry().flatMap(SrqsQuoteEntryGrpCompEntry::failedAt).orElse(noQuoteEntries));
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
            case "TransactTime" -> Optional.of(transactTime);
            case "NegotiationId" -> Optional.of(negotiationId);
            case "TradeId" -> Optional.of(tradeId);
            case "QuoteReqId" -> Optional.of(quoteReqId);
            case "NoQuoteEntries" -> Optional.of(noQuoteEntries);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof XetraEnLightQuoteRequesterNotification message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(srqsQuoteEntryGrpComp.diffFields(message.srqsQuoteEntryGrpComp));
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
            srqsQuoteEntryGrpComp.toFormattedString(builder, options);
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
        srqsQuoteEntryGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof XetraEnLightQuoteRequesterNotification message)) {
            return false;
        }
        return fields.equals(message.fields) && srqsQuoteEntryGrpComp.equals(message.srqsQuoteEntryGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, srqsQuoteEntryGrpComp);
    }
}
