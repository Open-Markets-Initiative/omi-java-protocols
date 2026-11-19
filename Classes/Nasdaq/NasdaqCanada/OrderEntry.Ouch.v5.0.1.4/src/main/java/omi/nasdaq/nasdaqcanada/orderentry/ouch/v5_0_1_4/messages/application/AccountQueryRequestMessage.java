package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.AppendageLengthField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.groups.AccountQueryRequestAppendageEntry;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.groups.AccountQueryRequestAppendageList;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.Field;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.Message;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.PrintOptions;

/**
 * Represents the AccountQueryRequestMessage message from the OrderEntry protocol.
 *
 * <p>The Account Query Request message can be used when recovering state to request the next available UserRefNum that can be used for identifying new transactions.</p>
 */
public final class AccountQueryRequestMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Q';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 2;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Account Query Request Message";

    /**
     * The length of the remaining Optional Appendage Field. Required. If no optional appendage, length=0
     */
    private final AppendageLengthField appendageLength = new AppendageLengthField();

    /**
     * Account Query Request Appendage
     */
    private final AccountQueryRequestAppendageList accountQueryRequestAppendage = new AccountQueryRequestAppendageList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(appendageLength);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The length of the remaining Optional Appendage Field. Required. If no optional appendage, length=0
     *
     * @return the AppendageLength field
     */
    public AppendageLengthField appendageLength() {
        return appendageLength;
    }

    /**
     * Account Query Request Appendage
     *
     * <p>Its entries fill the bytes the AppendageLength field states: encode writes this list's byte length to it.</p>
     *
     * @return the AccountQueryRequestAppendage entries
     */
    public AccountQueryRequestAppendageList accountQueryRequestAppendage() {
        return accountQueryRequestAppendage;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + accountQueryRequestAppendage.byteLength();
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
        if (!appendageLength.parse(data, cursor)) {
            return false;
        }
        cursor += AppendageLengthField.BYTE_LENGTH;
        long accountQueryRequestAppendageBudget = appendageLength.value();
        if (accountQueryRequestAppendageBudget < 0 || accountQueryRequestAppendageBudget > (end) - cursor) {
            return false;
        }
        if (!accountQueryRequestAppendage.parse(data, cursor, cursor + (int) accountQueryRequestAppendageBudget)) {
            return false;
        }
        cursor += accountQueryRequestAppendage.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (accountQueryRequestAppendage.byteLength() > 65535) {
            throw new IllegalStateException("accountQueryRequestAppendage holds " + accountQueryRequestAppendage.byteLength() + " bytes, more than its length field can state");
        }
        appendageLength.value((accountQueryRequestAppendage.byteLength()));
        int cursor = offset;
        cursor = appendageLength.encode(data, cursor);
        cursor = accountQueryRequestAppendage.encode(data, cursor);
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
        accountQueryRequestAppendage.clear();
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
            if (field != appendageLength && !field.isRecognized()) {
                return false;
            }
        }
        return accountQueryRequestAppendage.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != appendageLength && !field.isValid()) {
                return false;
            }
        }
        if (!accountQueryRequestAppendage.isValid()) {
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
        if (!appendageLength.isDecoded()) {
            return Optional.of(appendageLength);
        }
        if (!accountQueryRequestAppendage.isDecoded()) {
            return Optional.of(accountQueryRequestAppendage.failedEntry().flatMap(AccountQueryRequestAppendageEntry::failedAt).orElse(appendageLength));
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return "AppendageLength".equals(name) ? Optional.of(appendageLength) : Optional.empty();
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AccountQueryRequestMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(accountQueryRequestAppendage.diffFields(message.accountQueryRequestAppendage));
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
            accountQueryRequestAppendage.toFormattedString(builder, options);
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
        accountQueryRequestAppendage.toFormattedString(builder, nested);
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
        if (!(other instanceof AccountQueryRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && accountQueryRequestAppendage.equals(message.accountQueryRequestAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, accountQueryRequestAppendage);
    }
}
