package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.NumberOfQuoteResultsField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.QuoteRejectReasonField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.QuoteUpdateIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.TransactionTimeField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.groups.QuoteResultGroupEntry;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.groups.QuoteResultGroupList;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.Message;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.PrintOptions;

/**
 * Represents the QuoteUpdateAcknowledgmentMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Quote Update Acknowledgment messages are sent in response to a Quote Update message.</p>
 */
public final class QuoteUpdateAcknowledgmentMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 43;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Update Acknowledgment Message";

    /**
     * The time the event occurred in the Cboe Matching Engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     */
    private final QuoteUpdateIdField quoteUpdateId = new QuoteUpdateIdField();

    /**
     * Reason for rejection of an entire Quote Update message by the matching engine. If an error is indicated, then no quotes were entered or updated. QuoteCnt will be 0.
     */
    private final QuoteRejectReasonField quoteRejectReason = new QuoteRejectReasonField();

    /**
     * Number of repeating groups included in this quote update. Allowed values are 1-20.
     */
    private final NumberOfQuoteResultsField numberOfQuoteResults = new NumberOfQuoteResultsField();

    /**
     * Quote Result Group
     */
    private final QuoteResultGroupList quoteResultGroup = new QuoteResultGroupList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, quoteUpdateId, quoteRejectReason, numberOfQuoteResults);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the Cboe Matching Engine (not the time the message was sent).
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     *
     * @return the QuoteUpdateId field
     */
    public QuoteUpdateIdField quoteUpdateId() {
        return quoteUpdateId;
    }

    /**
     * Reason for rejection of an entire Quote Update message by the matching engine. If an error is indicated, then no quotes were entered or updated. QuoteCnt will be 0.
     *
     * @return the QuoteRejectReason field
     */
    public QuoteRejectReasonField quoteRejectReason() {
        return quoteRejectReason;
    }

    /**
     * Number of repeating groups included in this quote update. Allowed values are 1-20.
     *
     * @return the NumberOfQuoteResults field
     */
    public NumberOfQuoteResultsField numberOfQuoteResults() {
        return numberOfQuoteResults;
    }

    /**
     * Quote Result Group
     *
     * <p>Encode writes this list's size to the NumberOfQuoteResults field.</p>
     *
     * @return the QuoteResultGroup entries
     */
    public QuoteResultGroupList quoteResultGroup() {
        return quoteResultGroup;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + quoteResultGroup.byteLength();
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
        cursor += 16;
        cursor += 1;
        runs.add(cursor).add(17);
        cursor += 17;
        cursor += 1;
        cursor = quoteResultGroup.padding(runs, cursor);
        return cursor;
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
        if (!quoteRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteRejectReasonField.BYTE_LENGTH;
        cursor += 17; // padding
        if (!numberOfQuoteResults.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfQuoteResultsField.BYTE_LENGTH;
        if (!quoteResultGroup.parse(data, cursor, end, numberOfQuoteResults.value())) {
            return false;
        }
        cursor += quoteResultGroup.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (quoteResultGroup.size() > 255) {
            throw new IllegalStateException("quoteResultGroup holds " + quoteResultGroup.size() + " entries, more than its count field can state");
        }
        numberOfQuoteResults.value((short) quoteResultGroup.size());
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = quoteUpdateId.encode(data, cursor);
        cursor = quoteRejectReason.encode(data, cursor);
        if (buffer != null && buffer.length >= 42) {
            System.arraycopy(buffer, 25, data, cursor, 17); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 17, (byte) 0); // padding
        }
        cursor += 17;
        cursor = numberOfQuoteResults.encode(data, cursor);
        cursor = quoteResultGroup.encode(data, cursor);
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
        quoteResultGroup.clear();
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
            if (field != numberOfQuoteResults && !field.isRecognized()) {
                return false;
            }
        }
        return quoteResultGroup.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfQuoteResults && !field.isValid()) {
                return false;
            }
        }
        if (!quoteResultGroup.isValid()) {
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
        if (!quoteRejectReason.isDecoded()) {
            return Optional.of(quoteRejectReason);
        }
        if (!numberOfQuoteResults.isDecoded()) {
            return Optional.of(numberOfQuoteResults);
        }
        if (!quoteResultGroup.isDecoded()) {
            return Optional.of(quoteResultGroup.failedEntry().flatMap(QuoteResultGroupEntry::failedAt).orElse(numberOfQuoteResults));
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
            case "QuoteRejectReason" -> Optional.of(quoteRejectReason);
            case "NumberOfQuoteResults" -> Optional.of(numberOfQuoteResults);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteUpdateAcknowledgmentMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(quoteResultGroup.diffFields(message.quoteResultGroup));
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
            quoteResultGroup.toFormattedString(builder, options);
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
        quoteResultGroup.toFormattedString(builder, nested);
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
        if (!(other instanceof QuoteUpdateAcknowledgmentMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && quoteResultGroup.equals(message.quoteResultGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, quoteResultGroup);
    }
}
