package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.CapacityField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ClearingAccountField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ClearingFirmField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.CustomGroupIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.NumberOfShortQuoteUpdatesField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.PostingInstructionField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.QuoteUpdateIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.SendTimeField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.SessionEligibilityField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.groups.ShortQuoteUpdateEntry;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.groups.ShortQuoteUpdateList;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.Message;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.PrintOptions;

/**
 * Represents the ShortQuoteUpdateMessage message from the BinaryOrderEntry protocol.
 *
 * <p>A shorter version of Quote Update which restricts the information which can be presented.</p>
 */
public final class ShortQuoteUpdateMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 41;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Short Quote Update Message";

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     */
    private final QuoteUpdateIdField quoteUpdateId = new QuoteUpdateIdField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Clearing Account
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Custom Group Id
     */
    private final CustomGroupIdField customGroupId = new CustomGroupIdField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Optional, may be filled with binary zero (0x00).
     */
    private final SendTimeField sendTime = new SendTimeField();

    /**
     * Posting Instruction
     */
    private final PostingInstructionField postingInstruction = new PostingInstructionField();

    /**
     * Session Eligibility
     */
    private final SessionEligibilityField sessionEligibility = new SessionEligibilityField();

    /**
     * Number of repeating groups included in this quote update. Allowed values are 1-20.
     */
    private final NumberOfShortQuoteUpdatesField numberOfShortQuoteUpdates = new NumberOfShortQuoteUpdatesField();

    /**
     * Short Quote Update
     */
    private final ShortQuoteUpdateList shortQuoteUpdate = new ShortQuoteUpdateList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(quoteUpdateId, clearingFirm, clearingAccount, customGroupId, capacity, sendTime, postingInstruction, sessionEligibility, numberOfShortQuoteUpdates);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     *
     * @return the QuoteUpdateId field
     */
    public QuoteUpdateIdField quoteUpdateId() {
        return quoteUpdateId;
    }

    /**
     * Clearing Firm
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Clearing Account
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * Custom Group Id
     *
     * @return the CustomGroupId field
     */
    public CustomGroupIdField customGroupId() {
        return customGroupId;
    }

    /**
     * Capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Optional, may be filled with binary zero (0x00).
     *
     * @return the SendTime field
     */
    public SendTimeField sendTime() {
        return sendTime;
    }

    /**
     * Posting Instruction
     *
     * @return the PostingInstruction field
     */
    public PostingInstructionField postingInstruction() {
        return postingInstruction;
    }

    /**
     * Session Eligibility
     *
     * @return the SessionEligibility field
     */
    public SessionEligibilityField sessionEligibility() {
        return sessionEligibility;
    }

    /**
     * Number of repeating groups included in this quote update. Allowed values are 1-20.
     *
     * @return the NumberOfShortQuoteUpdates field
     */
    public NumberOfShortQuoteUpdatesField numberOfShortQuoteUpdates() {
        return numberOfShortQuoteUpdates;
    }

    /**
     * Short Quote Update
     *
     * <p>Encode writes this list's size to the NumberOfShortQuoteUpdates field.</p>
     *
     * @return the ShortQuoteUpdate entries
     */
    public ShortQuoteUpdateList shortQuoteUpdate() {
        return shortQuoteUpdate;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + shortQuoteUpdate.byteLength();
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
        cursor += 16;
        cursor += 4;
        cursor += 4;
        cursor += 2;
        cursor += 1;
        runs.add(cursor).add(3);
        cursor += 3;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor = shortQuoteUpdate.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(sendTime.value());
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
        if (!quoteUpdateId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteUpdateIdField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!customGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += CustomGroupIdField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        cursor += 3; // padding
        if (!sendTime.parse(data, cursor)) {
            return false;
        }
        cursor += SendTimeField.BYTE_LENGTH;
        if (!postingInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += PostingInstructionField.BYTE_LENGTH;
        if (!sessionEligibility.parse(data, cursor)) {
            return false;
        }
        cursor += SessionEligibilityField.BYTE_LENGTH;
        if (!numberOfShortQuoteUpdates.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfShortQuoteUpdatesField.BYTE_LENGTH;
        if (!shortQuoteUpdate.parse(data, cursor, end, numberOfShortQuoteUpdates.value())) {
            return false;
        }
        cursor += shortQuoteUpdate.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (shortQuoteUpdate.size() > 255) {
            throw new IllegalStateException("shortQuoteUpdate holds " + shortQuoteUpdate.size() + " entries, more than its count field can state");
        }
        numberOfShortQuoteUpdates.value((short) shortQuoteUpdate.size());
        int cursor = offset;
        cursor = quoteUpdateId.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = customGroupId.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        if (buffer != null && buffer.length >= 30) {
            System.arraycopy(buffer, 27, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
        cursor = sendTime.encode(data, cursor);
        cursor = postingInstruction.encode(data, cursor);
        cursor = sessionEligibility.encode(data, cursor);
        cursor = numberOfShortQuoteUpdates.encode(data, cursor);
        cursor = shortQuoteUpdate.encode(data, cursor);
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
        shortQuoteUpdate.clear();
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
            if (field != numberOfShortQuoteUpdates && !field.isRecognized()) {
                return false;
            }
        }
        return shortQuoteUpdate.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfShortQuoteUpdates && !field.isValid()) {
                return false;
            }
        }
        if (!shortQuoteUpdate.isValid()) {
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
        if (!quoteUpdateId.isDecoded()) {
            return Optional.of(quoteUpdateId);
        }
        if (!clearingFirm.isDecoded()) {
            return Optional.of(clearingFirm);
        }
        if (!clearingAccount.isDecoded()) {
            return Optional.of(clearingAccount);
        }
        if (!customGroupId.isDecoded()) {
            return Optional.of(customGroupId);
        }
        if (!capacity.isDecoded()) {
            return Optional.of(capacity);
        }
        if (!sendTime.isDecoded()) {
            return Optional.of(sendTime);
        }
        if (!postingInstruction.isDecoded()) {
            return Optional.of(postingInstruction);
        }
        if (!sessionEligibility.isDecoded()) {
            return Optional.of(sessionEligibility);
        }
        if (!numberOfShortQuoteUpdates.isDecoded()) {
            return Optional.of(numberOfShortQuoteUpdates);
        }
        if (!shortQuoteUpdate.isDecoded()) {
            return Optional.of(shortQuoteUpdate.failedEntry().flatMap(ShortQuoteUpdateEntry::failedAt).orElse(numberOfShortQuoteUpdates));
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
            case "QuoteUpdateId" -> Optional.of(quoteUpdateId);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "CustomGroupId" -> Optional.of(customGroupId);
            case "Capacity" -> Optional.of(capacity);
            case "SendTime" -> Optional.of(sendTime);
            case "PostingInstruction" -> Optional.of(postingInstruction);
            case "SessionEligibility" -> Optional.of(sessionEligibility);
            case "NumberOfShortQuoteUpdates" -> Optional.of(numberOfShortQuoteUpdates);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ShortQuoteUpdateMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(shortQuoteUpdate.diffFields(message.shortQuoteUpdate));
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
            shortQuoteUpdate.toFormattedString(builder, options);
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
        shortQuoteUpdate.toFormattedString(builder, nested);
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
        if (!(other instanceof ShortQuoteUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && shortQuoteUpdate.equals(message.shortQuoteUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, shortQuoteUpdate);
    }
}
