package omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.AppendageLengthField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.NextUserRefNumField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.TimestampField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.groups.AccountQueryResponseAppendageEntry;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.groups.AccountQueryResponseAppendageList;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Field;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Message;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.PrintOptions;

/**
 * Represents the AccountQueryResponseMessage message from the Orders protocol.
 *
 * <p>The Account Query Response message in sent in response to an Account Query Request to indicate the next available UserRefNum that can be used to identify new transactions.</p>
 */
public final class AccountQueryResponseMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Q';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 12;

    /**
     * This message takes the rest of the bytes it is given, so where those bytes end is its own end.
     */
    public static final boolean RUNS_TO_END = true;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Account Query Response Message";

    /**
     * Expressed as nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * The next available UserRefNum
     */
    private final NextUserRefNumField nextUserRefNum = new NextUserRefNumField();

    /**
     * The length of the remaining Optional Appendage field.
     */
    private final AppendageLengthField appendageLength = new AppendageLengthField();

    /**
     * Account Query Response Appendage
     */
    private final AccountQueryResponseAppendageList accountQueryResponseAppendage = new AccountQueryResponseAppendageList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, nextUserRefNum, appendageLength);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Expressed as nanoseconds since midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * The next available UserRefNum
     *
     * @return the NextUserRefNum field
     */
    public NextUserRefNumField nextUserRefNum() {
        return nextUserRefNum;
    }

    /**
     * The length of the remaining Optional Appendage field.
     *
     * @return the AppendageLength field
     */
    public AppendageLengthField appendageLength() {
        return appendageLength;
    }

    /**
     * Account Query Response Appendage
     *
     * <p>Its entries fill the bytes the AppendageLength field states: encode writes this list's byte length to it.</p>
     *
     * @return the AccountQueryResponseAppendage entries
     */
    public AccountQueryResponseAppendageList accountQueryResponseAppendage() {
        return accountQueryResponseAppendage;
    }

    /**
     * Returns whether the fields before the AppendageLength put it on the wire.
     *
     * <p>The AppendageLength is sent while its bytes remain, which only a decode can tell, so it is on the wire when it holds a value.</p>
     *
     * @return true when the AppendageLength is on the wire
     */
    public boolean appendageLengthPresent() {
        return appendageLength.hasValue() || !accountQueryResponseAppendage.isEmpty();
    }

    private boolean onWire(Field field) {
        return (field != appendageLength || appendageLengthPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (appendageLengthPresent() ? AppendageLengthField.BYTE_LENGTH : 0) + accountQueryResponseAppendage.byteLength();
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!nextUserRefNum.parse(data, cursor)) {
            return false;
        }
        cursor += NextUserRefNumField.BYTE_LENGTH;
        if (end - cursor > 0) {
            if (end - cursor < AppendageLengthField.BYTE_LENGTH || !appendageLength.parse(data, cursor)) {
                return false;
            }
            cursor += AppendageLengthField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        long accountQueryResponseAppendageBudget = appendageLengthPresent() ? appendageLength.value() : 0;
        if (accountQueryResponseAppendageBudget < 0 || accountQueryResponseAppendageBudget > (end) - cursor) {
            return false;
        }
        if (!accountQueryResponseAppendage.parse(data, cursor, cursor + (int) accountQueryResponseAppendageBudget)) {
            return false;
        }
        cursor += accountQueryResponseAppendage.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (!accountQueryResponseAppendage.isEmpty() || appendageLengthPresent()) {
            if (accountQueryResponseAppendage.byteLength() > 65535) {
                throw new IllegalStateException("accountQueryResponseAppendage holds " + accountQueryResponseAppendage.byteLength() + " bytes, more than its length field can state");
            }
            appendageLength.value((accountQueryResponseAppendage.byteLength()));
        }
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = nextUserRefNum.encode(data, cursor);
        if (appendageLengthPresent()) {
            cursor = appendageLength.encode(data, cursor);
        }
        cursor = accountQueryResponseAppendage.encode(data, cursor);
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
        accountQueryResponseAppendage.clear();
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
        for (Field field : fields()) {
            if (field != appendageLength && !field.isRecognized()) {
                return false;
            }
        }
        return accountQueryResponseAppendage.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != appendageLength && !field.isValid()) {
                return false;
            }
        }
        if (!accountQueryResponseAppendage.isValid()) {
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
        if (!timestampField.isDecoded()) {
            return Optional.of(timestampField);
        }
        if (!nextUserRefNum.isDecoded()) {
            return Optional.of(nextUserRefNum);
        }
        if (appendageLengthPresent() && !appendageLength.isDecoded()) {
            return Optional.of(appendageLength);
        }
        if (!accountQueryResponseAppendage.isDecoded()) {
            return Optional.of(accountQueryResponseAppendage.failedEntry().flatMap(AccountQueryResponseAppendageEntry::failedAt).orElse(appendageLength));
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "Timestamp" -> Optional.of(timestampField);
            case "NextUserRefNum" -> Optional.of(nextUserRefNum);
            case "AppendageLength" -> Optional.of(appendageLength);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AccountQueryResponseMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(accountQueryResponseAppendage.diffFields(message.accountQueryResponseAppendage));
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(", ");
            accountQueryResponseAppendage.toFormattedString(builder, options);
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : onWire) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
        accountQueryResponseAppendage.toFormattedString(builder, nested);
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
        if (!(other instanceof AccountQueryResponseMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && accountQueryResponseAppendage.equals(message.accountQueryResponseAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, accountQueryResponseAppendage);
    }
}
