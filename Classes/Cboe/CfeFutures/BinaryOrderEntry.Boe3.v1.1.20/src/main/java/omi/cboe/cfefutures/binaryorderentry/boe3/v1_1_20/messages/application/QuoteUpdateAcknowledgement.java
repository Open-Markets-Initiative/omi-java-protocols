package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.QuoteCntField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.QuoteUpdateIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.RequestReceivedTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.TransactionTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.groups.QuoteUpdateAcknowledgementGroupEntry;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.groups.QuoteUpdateAcknowledgementGroupList;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.PrintOptions;

/**
 * Represents the QuoteUpdateAcknowledgement message from the BinaryOrderEntry protocol.
 *
 * <p>Quote Update Acknowledgment messages are sent in response to a Quote Update or Quote Update Option message</p>
 */
public final class QuoteUpdateAcknowledgement implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 33;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Update Acknowledgement";

    /**
     * The time the event occurred in the CFE Matching Engine (not the time the message was sent)
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Id chosen by the client
     */
    private final QuoteUpdateIdField quoteUpdateId = new QuoteUpdateIdField();

    /**
     * The earliest timestamp, populated with nanosecond precision, recorded by CFE of the corresponding inbound message being acknowledged
     */
    private final RequestReceivedTimeField requestReceivedTime = new RequestReceivedTimeField();

    /**
     * Number of repeating groups included in this message
     */
    private final QuoteCntField quoteCnt = new QuoteCntField();

    /**
     * Quote Update Acknowledgement Group
     */
    private final QuoteUpdateAcknowledgementGroupList quoteUpdateAcknowledgementGroup = new QuoteUpdateAcknowledgementGroupList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, quoteUpdateId, requestReceivedTime, quoteCnt);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the CFE Matching Engine (not the time the message was sent)
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Id chosen by the client
     *
     * @return the QuoteUpdateId field
     */
    public QuoteUpdateIdField quoteUpdateId() {
        return quoteUpdateId;
    }

    /**
     * The earliest timestamp, populated with nanosecond precision, recorded by CFE of the corresponding inbound message being acknowledged
     *
     * @return the RequestReceivedTime field
     */
    public RequestReceivedTimeField requestReceivedTime() {
        return requestReceivedTime;
    }

    /**
     * Number of repeating groups included in this message
     *
     * @return the QuoteCnt field
     */
    public QuoteCntField quoteCnt() {
        return quoteCnt;
    }

    /**
     * Quote Update Acknowledgement Group
     *
     * <p>Encode writes this list's size to the QuoteCnt field.</p>
     *
     * @return the QuoteUpdateAcknowledgementGroup entries
     */
    public QuoteUpdateAcknowledgementGroupList quoteUpdateAcknowledgementGroup() {
        return quoteUpdateAcknowledgementGroup;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + quoteUpdateAcknowledgementGroup.byteLength();
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
        return Optional.ofNullable(transactionTime.value());
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
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!quoteUpdateId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteUpdateIdField.BYTE_LENGTH;
        if (!requestReceivedTime.parse(data, cursor)) {
            return false;
        }
        cursor += RequestReceivedTimeField.BYTE_LENGTH;
        if (!quoteCnt.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteCntField.BYTE_LENGTH;
        if (!quoteUpdateAcknowledgementGroup.parse(data, cursor, end, quoteCnt.value())) {
            return false;
        }
        cursor += quoteUpdateAcknowledgementGroup.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (quoteUpdateAcknowledgementGroup.size() > 255) {
            throw new IllegalStateException("quoteUpdateAcknowledgementGroup holds " + quoteUpdateAcknowledgementGroup.size() + " entries, more than its count field can state");
        }
        quoteCnt.value((short) quoteUpdateAcknowledgementGroup.size());
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = quoteUpdateId.encode(data, cursor);
        cursor = requestReceivedTime.encode(data, cursor);
        cursor = quoteCnt.encode(data, cursor);
        cursor = quoteUpdateAcknowledgementGroup.encode(data, cursor);
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
        quoteUpdateAcknowledgementGroup.clear();
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
            if (field != quoteCnt && !field.isRecognized()) {
                return false;
            }
        }
        return quoteUpdateAcknowledgementGroup.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != quoteCnt && !field.isValid()) {
                return false;
            }
        }
        if (!quoteUpdateAcknowledgementGroup.isValid()) {
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
        if (!transactionTime.isDecoded()) {
            return Optional.of(transactionTime);
        }
        if (!quoteUpdateId.isDecoded()) {
            return Optional.of(quoteUpdateId);
        }
        if (!requestReceivedTime.isDecoded()) {
            return Optional.of(requestReceivedTime);
        }
        if (!quoteCnt.isDecoded()) {
            return Optional.of(quoteCnt);
        }
        if (!quoteUpdateAcknowledgementGroup.isDecoded()) {
            return Optional.of(quoteUpdateAcknowledgementGroup.failedEntry().flatMap(QuoteUpdateAcknowledgementGroupEntry::failedAt).orElse(quoteCnt));
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
            case "TransactionTime" -> Optional.of(transactionTime);
            case "QuoteUpdateId" -> Optional.of(quoteUpdateId);
            case "RequestReceivedTime" -> Optional.of(requestReceivedTime);
            case "QuoteCnt" -> Optional.of(quoteCnt);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteUpdateAcknowledgement message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(quoteUpdateAcknowledgementGroup.diffFields(message.quoteUpdateAcknowledgementGroup));
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
            quoteUpdateAcknowledgementGroup.toFormattedString(builder, options);
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
        quoteUpdateAcknowledgementGroup.toFormattedString(builder, nested);
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
        if (!(other instanceof QuoteUpdateAcknowledgement message)) {
            return false;
        }
        return fields.equals(message.fields) && quoteUpdateAcknowledgementGroup.equals(message.quoteUpdateAcknowledgementGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, quoteUpdateAcknowledgementGroup);
    }
}
