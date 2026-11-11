package omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.AppendageLengthField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.FirmField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.UserRefNumField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.groups.EnableOrderEntryRequestAppendageEntry;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.groups.EnableOrderEntryRequestAppendageList;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Field;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Message;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.PrintOptions;

/**
 * Represents the EnableOrderEntryRequestMessage message from the Orders protocol.
 *
 * <p>The Enable Order Entry Request allows firms the ability to unblock submission of new orders on a particular account.</p>
 */
public final class EnableOrderEntryRequestMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'E';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 10;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Enable Order Entry Request Message";

    /**
     * UserRefNum must be day-unique and strictly increasing for each OUCH account.
     */
    private final UserRefNumField userRefNum = new UserRefNumField();

    /**
     * This field should contain all caps. Firm identifier for the order entry firm. One logical OUCH account can potentially enter orders for multiple firms in a Service Bureau configuration.
     */
    private final FirmField firm = new FirmField();

    /**
     * The length of the remaining Optional Appendage field.
     */
    private final AppendageLengthField appendageLength = new AppendageLengthField();

    /**
     * Enable Order Entry Request Appendage
     */
    private final EnableOrderEntryRequestAppendageList enableOrderEntryRequestAppendage = new EnableOrderEntryRequestAppendageList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(userRefNum, firm, appendageLength);

    private byte[] buffer;

    private boolean decoded;

    /**
     * UserRefNum must be day-unique and strictly increasing for each OUCH account.
     *
     * @return the UserRefNum field
     */
    public UserRefNumField userRefNum() {
        return userRefNum;
    }

    /**
     * This field should contain all caps. Firm identifier for the order entry firm. One logical OUCH account can potentially enter orders for multiple firms in a Service Bureau configuration.
     *
     * @return the Firm field
     */
    public FirmField firm() {
        return firm;
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
     * Enable Order Entry Request Appendage
     *
     * <p>Its entries fill the bytes the AppendageLength field states: encode writes this list's byte length to it.</p>
     *
     * @return the EnableOrderEntryRequestAppendage entries
     */
    public EnableOrderEntryRequestAppendageList enableOrderEntryRequestAppendage() {
        return enableOrderEntryRequestAppendage;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + enableOrderEntryRequestAppendage.byteLength();
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
        if (!userRefNum.parse(data, cursor)) {
            return false;
        }
        cursor += UserRefNumField.BYTE_LENGTH;
        if (!firm.parse(data, cursor)) {
            return false;
        }
        cursor += FirmField.BYTE_LENGTH;
        if (!appendageLength.parse(data, cursor)) {
            return false;
        }
        cursor += AppendageLengthField.BYTE_LENGTH;
        long enableOrderEntryRequestAppendageBudget = appendageLength.value();
        if (enableOrderEntryRequestAppendageBudget < 0 || enableOrderEntryRequestAppendageBudget > (end) - cursor) {
            return false;
        }
        if (!enableOrderEntryRequestAppendage.parse(data, cursor, cursor + (int) enableOrderEntryRequestAppendageBudget)) {
            return false;
        }
        cursor += enableOrderEntryRequestAppendage.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (enableOrderEntryRequestAppendage.byteLength() > 65535) {
            throw new IllegalStateException("enableOrderEntryRequestAppendage holds " + enableOrderEntryRequestAppendage.byteLength() + " bytes, more than its length field can state");
        }
        appendageLength.value((enableOrderEntryRequestAppendage.byteLength()));
        int cursor = offset;
        cursor = userRefNum.encode(data, cursor);
        cursor = firm.encode(data, cursor);
        cursor = appendageLength.encode(data, cursor);
        cursor = enableOrderEntryRequestAppendage.encode(data, cursor);
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
        enableOrderEntryRequestAppendage.clear();
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
        return enableOrderEntryRequestAppendage.isRecognized();
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
        if (!enableOrderEntryRequestAppendage.isValid()) {
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
        if (!userRefNum.isDecoded()) {
            return Optional.of(userRefNum);
        }
        if (!firm.isDecoded()) {
            return Optional.of(firm);
        }
        if (!appendageLength.isDecoded()) {
            return Optional.of(appendageLength);
        }
        if (!enableOrderEntryRequestAppendage.isDecoded()) {
            return Optional.of(enableOrderEntryRequestAppendage.failedEntry().flatMap(EnableOrderEntryRequestAppendageEntry::failedAt).orElse(appendageLength));
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
            case "UserRefNum" -> Optional.of(userRefNum);
            case "Firm" -> Optional.of(firm);
            case "AppendageLength" -> Optional.of(appendageLength);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EnableOrderEntryRequestMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(enableOrderEntryRequestAppendage.diffFields(message.enableOrderEntryRequestAppendage));
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
            enableOrderEntryRequestAppendage.toFormattedString(builder, options);
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
        enableOrderEntryRequestAppendage.toFormattedString(builder, nested);
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
        if (!(other instanceof EnableOrderEntryRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && enableOrderEntryRequestAppendage.equals(message.enableOrderEntryRequestAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, enableOrderEntryRequestAppendage);
    }
}
