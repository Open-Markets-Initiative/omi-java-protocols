package omi.cboe.edgaequities.top.asciipitch.v1_3_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.edgaequities.top.asciipitch.v1_3_10.fields.HaltStatusField;
import omi.cboe.edgaequities.top.asciipitch.v1_3_10.fields.RegShoActionField;
import omi.cboe.edgaequities.top.asciipitch.v1_3_10.fields.Reserved1Field;
import omi.cboe.edgaequities.top.asciipitch.v1_3_10.fields.Reserved2Field;
import omi.cboe.edgaequities.top.asciipitch.v1_3_10.fields.SymbolExtendedField;
import omi.cboe.edgaequities.top.asciipitch.v1_3_10.types.Field;
import omi.cboe.edgaequities.top.asciipitch.v1_3_10.types.Message;
import omi.cboe.edgaequities.top.asciipitch.v1_3_10.types.PrintOptions;

/**
 * Represents the TradingStatusMessage message from the Top protocol.
 *
 * <p>The Trading Status Message is used to indicate the current trading status of a security.</p>
 */
public final class TradingStatusMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 't';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 12;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trading Status Message";

    /**
     * Symbol
     */
    private final SymbolExtendedField symbolExtended = new SymbolExtendedField();

    /**
     * Halt Status
     */
    private final HaltStatusField haltStatus = new HaltStatusField();

    /**
     * Reg SHO Action
     */
    private final RegShoActionField regShoAction = new RegShoActionField();

    /**
     * Reserved
     */
    private final Reserved1Field reserved1 = new Reserved1Field();

    /**
     * Reserved
     */
    private final Reserved2Field reserved2 = new Reserved2Field();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(symbolExtended, haltStatus, regShoAction, reserved1, reserved2);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Symbol
     *
     * @return the SymbolExtended field
     */
    public SymbolExtendedField symbolExtended() {
        return symbolExtended;
    }

    /**
     * Halt Status
     *
     * @return the HaltStatus field
     */
    public HaltStatusField haltStatus() {
        return haltStatus;
    }

    /**
     * Reg SHO Action
     *
     * @return the RegShoAction field
     */
    public RegShoActionField regShoAction() {
        return regShoAction;
    }

    /**
     * Reserved
     *
     * @return the Reserved1 field
     */
    public Reserved1Field reserved1() {
        return reserved1;
    }

    /**
     * Reserved
     *
     * @return the Reserved2 field
     */
    public Reserved2Field reserved2() {
        return reserved2;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!symbolExtended.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolExtendedField.BYTE_LENGTH;
        if (!haltStatus.parse(data, cursor)) {
            return false;
        }
        cursor += HaltStatusField.BYTE_LENGTH;
        if (!regShoAction.parse(data, cursor)) {
            return false;
        }
        cursor += RegShoActionField.BYTE_LENGTH;
        if (!reserved1.parse(data, cursor)) {
            return false;
        }
        cursor += Reserved1Field.BYTE_LENGTH;
        return reserved2.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = symbolExtended.encode(data, cursor);
        cursor = haltStatus.encode(data, cursor);
        cursor = regShoAction.encode(data, cursor);
        cursor = reserved1.encode(data, cursor);
        cursor = reserved2.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
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
        for (Field field : fields) {
            if (!field.isDecoded()) {
                return Optional.of(field);
            }
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
            case "SymbolExtended" -> Optional.of(symbolExtended);
            case "HaltStatus" -> Optional.of(haltStatus);
            case "RegShoAction" -> Optional.of(regShoAction);
            case "Reserved1" -> Optional.of(reserved1);
            case "Reserved2" -> Optional.of(reserved2);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradingStatusMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof TradingStatusMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
