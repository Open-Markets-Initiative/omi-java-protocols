package omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.MsgTypeField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.SourceIdField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.SymbolIndexField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.Field;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.Message;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.PrintOptions;

/**
 * Represents the ExtendedBookRefreshRequestMessage message from the OpenBook protocol.
 *
 * <p>The Extended Book Refresh Request message allows the client to request a refresh by symbol index as opposed to symbol, and to request a refresh of all symbols in a channel.</p>
 */
public final class ExtendedBookRefreshRequestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 26;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Extended Book Refresh Request Message";

    /**
     * The ID of the client that sent the request, left justified and null padded.
     */
    private final SourceIdField sourceId = new SourceIdField();

    /**
     * The ID (from the last Full Refresh Update) of the symbol for which information is requested. 0 = Requesting all symbols in this channel.
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * Unused. Any content will be ignored.
     */
    private final MsgTypeField msgType = new MsgTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceId, symbolIndex, msgType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The ID of the client that sent the request, left justified and null padded.
     *
     * @return the SourceId field
     */
    public SourceIdField sourceId() {
        return sourceId;
    }

    /**
     * The ID (from the last Full Refresh Update) of the symbol for which information is requested. 0 = Requesting all symbols in this channel.
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * Unused. Any content will be ignored.
     *
     * @return the MsgType field
     */
    public MsgTypeField msgType() {
        return msgType;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
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
        if (!sourceId.parse(data, cursor)) {
            return false;
        }
        cursor += SourceIdField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        return msgType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sourceId.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = msgType.encode(data, cursor);
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
            case "SourceId" -> Optional.of(sourceId);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "MsgType" -> Optional.of(msgType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExtendedBookRefreshRequestMessage message)) {
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
        if (!(other instanceof ExtendedBookRefreshRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
