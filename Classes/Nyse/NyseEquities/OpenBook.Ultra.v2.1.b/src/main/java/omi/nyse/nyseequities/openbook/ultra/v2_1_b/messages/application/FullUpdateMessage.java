package omi.nyse.nyseequities.openbook.ultra.v2_1_b.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.fields.UpdateSizeField;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.structs.FullUpdateMessageBodyStruct;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.Field;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.Message;
import omi.nyse.nyseequities.openbook.ultra.v2_1_b.types.PrintOptions;

/**
 * Represents the FullUpdateMessage message from the OpenBook protocol.
 *
 * <p>This message contains the complete order book for a single symbol, with all price points, an aggregated quantity at each price point and symbol mapping information.</p>
 */
public final class FullUpdateMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Full Update Message";

    /**
     * The number of bytes in this message including this field.
     */
    private final UpdateSizeField updateSize = new UpdateSizeField();

    /**
     * This message contains the complete order book for a single symbol, with all price points, an aggregated quantity at each price point and symbol mapping information.
     */
    private final FullUpdateMessageBodyStruct fullUpdateMessageBody = new FullUpdateMessageBodyStruct();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(updateSize);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The number of bytes in this message including this field.
     *
     * @return the UpdateSize field
     */
    public UpdateSizeField updateSize() {
        return updateSize;
    }

    /**
     * This message contains the complete order book for a single symbol, with all price points, an aggregated quantity at each price point and symbol mapping information.
     *
     * @return the FullUpdateMessageBody record
     */
    public FullUpdateMessageBodyStruct fullUpdateMessageBody() {
        return fullUpdateMessageBody;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + fullUpdateMessageBody.byteLength() - FullUpdateMessageBodyStruct.MINIMUM_BYTE_LENGTH;
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
        cursor += 2;
        cursor = fullUpdateMessageBody.padding(runs, cursor);
        return cursor;
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
        if (!updateSize.parse(data, cursor)) {
            return false;
        }
        cursor += UpdateSizeField.BYTE_LENGTH;
        long fullUpdateMessageBodyWidth = updateSize.value() - 2L;
        if (fullUpdateMessageBodyWidth < 0 || fullUpdateMessageBodyWidth > (end) - cursor) {
            return false;
        }
        if (!fullUpdateMessageBody.parseFrom(data, cursor, cursor + (int) fullUpdateMessageBodyWidth) || fullUpdateMessageBody.byteLength() != fullUpdateMessageBodyWidth) {
            return false;
        }
        cursor += fullUpdateMessageBody.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (fullUpdateMessageBody.byteLength() + 2 > 32767) {
            throw new IllegalStateException("fullUpdateMessageBody holds " + fullUpdateMessageBody.byteLength() + " bytes, more than its length field can state");
        }
        updateSize.value((short) (fullUpdateMessageBody.byteLength() + 2));
        int cursor = offset;
        cursor = updateSize.encode(data, cursor);
        cursor = fullUpdateMessageBody.encode(data, cursor);
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
        fullUpdateMessageBody.clear();
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
            if (field != updateSize && !field.isRecognized()) {
                return false;
            }
        }
        if (!fullUpdateMessageBody.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != updateSize && !field.isValid()) {
                return false;
            }
        }
        if (!fullUpdateMessageBody.isValid()) {
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
        if (!updateSize.isDecoded()) {
            return Optional.of(updateSize);
        }
        if (!fullUpdateMessageBody.isDecoded()) {
            return fullUpdateMessageBody.failedAt();
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
            case "UpdateSize" -> Optional.of(updateSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FullUpdateMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(fullUpdateMessageBody.diffFields(message.fullUpdateMessageBody));
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
            fullUpdateMessageBody.toFormattedString(builder, options);
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
        fullUpdateMessageBody.toFormattedString(builder, nested);
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
        if (!(other instanceof FullUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && fullUpdateMessageBody.equals(message.fullUpdateMessageBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, fullUpdateMessageBody);
    }
}
