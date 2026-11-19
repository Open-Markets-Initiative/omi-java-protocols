package omi.ice.icefutures.bgw.sbe.v7_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.OriginatorUserIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.QuoteCancelTypeField;
import omi.ice.icefutures.bgw.sbe.v7_0.fields.QuoteIdField;
import omi.ice.icefutures.bgw.sbe.v7_0.structs.QuoteCancelRequestMessageNoQuoteEntriesGroups;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Field;
import omi.ice.icefutures.bgw.sbe.v7_0.types.Message;
import omi.ice.icefutures.bgw.sbe.v7_0.types.PrintOptions;

/**
 * Represents the QuoteCancelRequestMessage message from the Bgw protocol.
 *
 * <p>QuoteCancelRequestMessage</p>
 */
public final class QuoteCancelRequestMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 33;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Cancel Request Message";

    /**
     * quoteID
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * quoteCancelType
     */
    private final QuoteCancelTypeField quoteCancelType = new QuoteCancelTypeField();

    /**
     * originatorUserID
     */
    private final OriginatorUserIdField originatorUserId = new OriginatorUserIdField();

    /**
     * noQuoteEntries Block
     */
    private final QuoteCancelRequestMessageNoQuoteEntriesGroups quoteCancelRequestMessageNoQuoteEntriesGroups = new QuoteCancelRequestMessageNoQuoteEntriesGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(quoteId, quoteCancelType, originatorUserId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * quoteID
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
    }

    /**
     * quoteCancelType
     *
     * @return the QuoteCancelType field
     */
    public QuoteCancelTypeField quoteCancelType() {
        return quoteCancelType;
    }

    /**
     * originatorUserID
     *
     * @return the OriginatorUserId field
     */
    public OriginatorUserIdField originatorUserId() {
        return originatorUserId;
    }

    /**
     * noQuoteEntries Block
     *
     * @return the QuoteCancelRequestMessageNoQuoteEntriesGroups record
     */
    public QuoteCancelRequestMessageNoQuoteEntriesGroups quoteCancelRequestMessageNoQuoteEntriesGroups() {
        return quoteCancelRequestMessageNoQuoteEntriesGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + quoteCancelRequestMessageNoQuoteEntriesGroups.byteLength() - QuoteCancelRequestMessageNoQuoteEntriesGroups.MINIMUM_BYTE_LENGTH;
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
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!quoteCancelType.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteCancelTypeField.BYTE_LENGTH;
        if (!originatorUserId.parse(data, cursor)) {
            return false;
        }
        cursor += OriginatorUserIdField.BYTE_LENGTH;
        if (!quoteCancelRequestMessageNoQuoteEntriesGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += quoteCancelRequestMessageNoQuoteEntriesGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = quoteId.encode(data, cursor);
        cursor = quoteCancelType.encode(data, cursor);
        cursor = originatorUserId.encode(data, cursor);
        cursor = quoteCancelRequestMessageNoQuoteEntriesGroups.encode(data, cursor);
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
        quoteCancelRequestMessageNoQuoteEntriesGroups.clear();
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
        return quoteCancelRequestMessageNoQuoteEntriesGroups.isRecognized();
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
        if (!quoteCancelRequestMessageNoQuoteEntriesGroups.isValid()) {
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
        if (!quoteId.isDecoded()) {
            return Optional.of(quoteId);
        }
        if (!quoteCancelType.isDecoded()) {
            return Optional.of(quoteCancelType);
        }
        if (!originatorUserId.isDecoded()) {
            return Optional.of(originatorUserId);
        }
        if (!quoteCancelRequestMessageNoQuoteEntriesGroups.isDecoded()) {
            return quoteCancelRequestMessageNoQuoteEntriesGroups.failedAt();
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
            case "QuoteId" -> Optional.of(quoteId);
            case "QuoteCancelType" -> Optional.of(quoteCancelType);
            case "OriginatorUserId" -> Optional.of(originatorUserId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteCancelRequestMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(quoteCancelRequestMessageNoQuoteEntriesGroups.diffFields(message.quoteCancelRequestMessageNoQuoteEntriesGroups));
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
            quoteCancelRequestMessageNoQuoteEntriesGroups.toFormattedString(builder, options);
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
        quoteCancelRequestMessageNoQuoteEntriesGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof QuoteCancelRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && quoteCancelRequestMessageNoQuoteEntriesGroups.equals(message.quoteCancelRequestMessageNoQuoteEntriesGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, quoteCancelRequestMessageNoQuoteEntriesGroups);
    }
}
