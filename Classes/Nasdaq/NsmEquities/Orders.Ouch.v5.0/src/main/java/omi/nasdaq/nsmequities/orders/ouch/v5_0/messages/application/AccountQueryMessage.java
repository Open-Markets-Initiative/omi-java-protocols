package omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.AppendageLengthField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.groups.AccountQueryAppendageEntry;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.groups.AccountQueryAppendageList;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Field;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Message;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.PrintOptions;

/**
 * Represents the AccountQueryMessage message from the Orders protocol.
 *
 * <p>The Account Query Request message can be used when recovering state to request the next available UserRefNum that can be used for identifying new transactions.</p>
 */
public final class AccountQueryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Q';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 0;

    /**
     * This message takes the rest of the bytes it is given, so where those bytes end is its own end.
     */
    public static final boolean RUNS_TO_END = true;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Account Query Message";

    /**
     * The length of the remaining Optional Appendage field.
     */
    private final AppendageLengthField appendageLength = new AppendageLengthField();

    /**
     * Account Query Appendage
     */
    private final AccountQueryAppendageList accountQueryAppendage = new AccountQueryAppendageList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(appendageLength);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The length of the remaining Optional Appendage field.
     *
     * @return the AppendageLength field
     */
    public AppendageLengthField appendageLength() {
        return appendageLength;
    }

    /**
     * Account Query Appendage
     *
     * <p>Its entries fill the bytes the AppendageLength field states: encode writes this list's byte length to it.</p>
     *
     * @return the AccountQueryAppendage entries
     */
    public AccountQueryAppendageList accountQueryAppendage() {
        return accountQueryAppendage;
    }

    /**
     * Returns whether the fields before the AppendageLength put it on the wire.
     *
     * <p>The AppendageLength is sent while its bytes remain, which only a decode can tell, so it is on the wire when it holds a value.</p>
     *
     * @return true when the AppendageLength is on the wire
     */
    public boolean appendageLengthPresent() {
        return appendageLength.hasValue() || !accountQueryAppendage.isEmpty();
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
        return MINIMUM_BYTE_LENGTH + (appendageLengthPresent() ? AppendageLengthField.BYTE_LENGTH : 0) + accountQueryAppendage.byteLength();
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
        if (end - cursor > 0) {
            if (end - cursor < AppendageLengthField.BYTE_LENGTH || !appendageLength.parse(data, cursor)) {
                return false;
            }
            cursor += AppendageLengthField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        long accountQueryAppendageBudget = appendageLengthPresent() ? appendageLength.value() : 0;
        if (accountQueryAppendageBudget < 0 || accountQueryAppendageBudget > (end) - cursor) {
            return false;
        }
        if (!accountQueryAppendage.parse(data, cursor, cursor + (int) accountQueryAppendageBudget)) {
            return false;
        }
        cursor += accountQueryAppendage.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (!accountQueryAppendage.isEmpty() || appendageLengthPresent()) {
            if (accountQueryAppendage.byteLength() > 65535) {
                throw new IllegalStateException("accountQueryAppendage holds " + accountQueryAppendage.byteLength() + " bytes, more than its length field can state");
            }
            appendageLength.value((accountQueryAppendage.byteLength()));
        }
        int cursor = offset;
        if (appendageLengthPresent()) {
            cursor = appendageLength.encode(data, cursor);
        }
        cursor = accountQueryAppendage.encode(data, cursor);
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
        accountQueryAppendage.clear();
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
        return accountQueryAppendage.isRecognized();
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
        if (!accountQueryAppendage.isValid()) {
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
        if (appendageLengthPresent() && !appendageLength.isDecoded()) {
            return Optional.of(appendageLength);
        }
        if (!accountQueryAppendage.isDecoded()) {
            return Optional.of(accountQueryAppendage.failedEntry().flatMap(AccountQueryAppendageEntry::failedAt).orElse(appendageLength));
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return "AppendageLength".equals(name) ? Optional.of(appendageLength) : Optional.empty();
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AccountQueryMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(accountQueryAppendage.diffFields(message.accountQueryAppendage));
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
            accountQueryAppendage.toFormattedString(builder, options);
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
        accountQueryAppendage.toFormattedString(builder, nested);
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
        if (!(other instanceof AccountQueryMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && accountQueryAppendage.equals(message.accountQueryAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, accountQueryAppendage);
    }
}
