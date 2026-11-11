package omi.imperative.intelligentcross.depthofbook.aspen.v1_11.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.fields.InfoField;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.fields.ReservedField3;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.fields.StateField;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.fields.SymbolField;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.fields.SymbolIdField;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.fields.TimestampField;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.types.Field;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.types.Message;
import omi.imperative.intelligentcross.depthofbook.aspen.v1_11.types.PrintOptions;

/**
 * Represents the SymbolStateMessage message from the DepthOfBook protocol.
 *
 * <p>Symbol State</p>
 */
public final class SymbolStateMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'C';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 27;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Symbol State Message";

    /**
     * Symbol Index
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Nanoseconds Since Epoch (UTC)
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Stock Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * State Values
     */
    private final StateField state = new StateField();

    /**
     * Reserved for future use
     */
    private final ReservedField3 reserved = new ReservedField3();

    /**
     * optional text
     */
    private final InfoField info = new InfoField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(symbolId, timestampField, symbol, state, reserved, info);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Symbol Index
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
    }

    /**
     * Nanoseconds Since Epoch (UTC)
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Stock Symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * State Values
     *
     * @return the State field
     */
    public StateField state() {
        return state;
    }

    /**
     * Reserved for future use
     *
     * @return the Reserved field
     */
    public ReservedField3 reserved() {
        return reserved;
    }

    /**
     * optional text
     *
     * @return the Info field
     */
    public InfoField info() {
        return info;
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
        return Optional.ofNullable(timestampField.value());
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
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!state.parse(data, cursor)) {
            return false;
        }
        cursor += StateField.BYTE_LENGTH;
        if (!reserved.parse(data, cursor)) {
            return false;
        }
        cursor += ReservedField3.BYTE_LENGTH;
        return info.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = symbolId.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = state.encode(data, cursor);
        cursor = reserved.encode(data, cursor);
        cursor = info.encode(data, cursor);
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
            case "SymbolId" -> Optional.of(symbolId);
            case "Timestamp" -> Optional.of(timestampField);
            case "Symbol" -> Optional.of(symbol);
            case "State" -> Optional.of(state);
            case "Reserved" -> Optional.of(reserved);
            case "Info" -> Optional.of(info);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SymbolStateMessage message)) {
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
        if (!(other instanceof SymbolStateMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
