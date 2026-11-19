package omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.InFlightField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.QuoteCntField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.QuoteUpdateIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.RequestReceivedTimeField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.fields.TransactionTimeField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.groups.QuoteAcknowledgementEntry;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.groups.QuoteAcknowledgementList;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.types.Field;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.types.Message;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_1_23.types.PrintOptions;

/**
 * Represents the QuoteUpdateAcknowledgementMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Quote Update Acknowledgment messages are sent in response to a Quote Update message</p>
 */
public final class QuoteUpdateAcknowledgementMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 35;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Update Acknowledgement Message";

    /**
     * Total number of messages "in-flight" from the port
     */
    private final InFlightField inFlight = new InFlightField();

    /**
     * The exchange timestamp of the transaction
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * ID chosen by the member
     */
    private final QuoteUpdateIdField quoteUpdateId = new QuoteUpdateIdField();

    /**
     * A hardware timestamp, populated with nanosecond precision, that
     */
    private final RequestReceivedTimeField requestReceivedTime = new RequestReceivedTimeField();

    /**
     * Number of quotes in the message
     */
    private final QuoteCntField quoteCnt = new QuoteCntField();

    /**
     * Quote Acknowledgement
     */
    private final QuoteAcknowledgementList quoteAcknowledgement = new QuoteAcknowledgementList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(inFlight, transactionTime, quoteUpdateId, requestReceivedTime, quoteCnt);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Total number of messages "in-flight" from the port
     *
     * @return the InFlight field
     */
    public InFlightField inFlight() {
        return inFlight;
    }

    /**
     * The exchange timestamp of the transaction
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * ID chosen by the member
     *
     * @return the QuoteUpdateId field
     */
    public QuoteUpdateIdField quoteUpdateId() {
        return quoteUpdateId;
    }

    /**
     * A hardware timestamp, populated with nanosecond precision, that
     *
     * @return the RequestReceivedTime field
     */
    public RequestReceivedTimeField requestReceivedTime() {
        return requestReceivedTime;
    }

    /**
     * Number of quotes in the message
     *
     * @return the QuoteCnt field
     */
    public QuoteCntField quoteCnt() {
        return quoteCnt;
    }

    /**
     * Quote Acknowledgement
     *
     * <p>Encode writes this list's size to the QuoteCnt field.</p>
     *
     * @return the QuoteAcknowledgement entries
     */
    public QuoteAcknowledgementList quoteAcknowledgement() {
        return quoteAcknowledgement;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + quoteAcknowledgement.byteLength();
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
        if (!inFlight.parse(data, cursor)) {
            return false;
        }
        cursor += InFlightField.BYTE_LENGTH;
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
        if (!quoteAcknowledgement.parse(data, cursor, end, quoteCnt.value())) {
            return false;
        }
        cursor += quoteAcknowledgement.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (quoteAcknowledgement.size() > 255) {
            throw new IllegalStateException("quoteAcknowledgement holds " + quoteAcknowledgement.size() + " entries, more than its count field can state");
        }
        quoteCnt.value((short) quoteAcknowledgement.size());
        int cursor = offset;
        cursor = inFlight.encode(data, cursor);
        cursor = transactionTime.encode(data, cursor);
        cursor = quoteUpdateId.encode(data, cursor);
        cursor = requestReceivedTime.encode(data, cursor);
        cursor = quoteCnt.encode(data, cursor);
        cursor = quoteAcknowledgement.encode(data, cursor);
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
        quoteAcknowledgement.clear();
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
        return quoteAcknowledgement.isRecognized();
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
        if (!quoteAcknowledgement.isValid()) {
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
        if (!inFlight.isDecoded()) {
            return Optional.of(inFlight);
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
        if (!quoteAcknowledgement.isDecoded()) {
            return Optional.of(quoteAcknowledgement.failedEntry().flatMap(QuoteAcknowledgementEntry::failedAt).orElse(quoteCnt));
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
            case "InFlight" -> Optional.of(inFlight);
            case "TransactionTime" -> Optional.of(transactionTime);
            case "QuoteUpdateId" -> Optional.of(quoteUpdateId);
            case "RequestReceivedTime" -> Optional.of(requestReceivedTime);
            case "QuoteCnt" -> Optional.of(quoteCnt);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteUpdateAcknowledgementMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(quoteAcknowledgement.diffFields(message.quoteAcknowledgement));
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
            quoteAcknowledgement.toFormattedString(builder, options);
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
        quoteAcknowledgement.toFormattedString(builder, nested);
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
        if (!(other instanceof QuoteUpdateAcknowledgementMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && quoteAcknowledgement.equals(message.quoteAcknowledgement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, quoteAcknowledgement);
    }
}
