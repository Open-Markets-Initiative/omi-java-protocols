package omi.jnx.jnxequities.pts.itch.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.jnx.jnxequities.pts.itch.v1_6.fields.NanosecondsField;
import omi.jnx.jnxequities.pts.itch.v1_6.fields.PriceStartField;
import omi.jnx.jnxequities.pts.itch.v1_6.fields.PriceTickSizeField;
import omi.jnx.jnxequities.pts.itch.v1_6.fields.PriceTickSizeTableIdField;
import omi.jnx.jnxequities.pts.itch.v1_6.types.Field;
import omi.jnx.jnxequities.pts.itch.v1_6.types.Message;
import omi.jnx.jnxequities.pts.itch.v1_6.types.PrintOptions;

/**
 * Represents the PriceTickSizeMessage message from the Pts protocol.
 *
 * <p>Price Tick Size Messages define a set of price tick size tables.</p>
 */
public final class PriceTickSizeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'L';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 16;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Price Tick Size Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Number of nanoseconds since last Timestamp Seconds Message.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Price tick size table identifier.
     */
    private final PriceTickSizeTableIdField priceTickSizeTableId = new PriceTickSizeTableIdField();

    /**
     * Price tick size.
     */
    private final PriceTickSizeField priceTickSize = new PriceTickSizeField();

    /**
     * Start of price range for this price tick size.
     */
    private final PriceStartField priceStart = new PriceStartField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, priceTickSizeTableId, priceTickSize, priceStart);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Number of nanoseconds since last Timestamp Seconds Message.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Price tick size table identifier.
     *
     * @return the PriceTickSizeTableId field
     */
    public PriceTickSizeTableIdField priceTickSizeTableId() {
        return priceTickSizeTableId;
    }

    /**
     * Price tick size.
     *
     * @return the PriceTickSize field
     */
    public PriceTickSizeField priceTickSize() {
        return priceTickSize;
    }

    /**
     * Start of price range for this price tick size.
     *
     * @return the PriceStart field
     */
    public PriceStartField priceStart() {
        return priceStart;
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
        return PADDING.clone();
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!priceTickSizeTableId.parse(data, cursor)) {
            return false;
        }
        cursor += PriceTickSizeTableIdField.BYTE_LENGTH;
        if (!priceTickSize.parse(data, cursor)) {
            return false;
        }
        cursor += PriceTickSizeField.BYTE_LENGTH;
        if (!priceStart.parse(data, cursor)) {
            return false;
        }
        cursor += PriceStartField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = priceTickSizeTableId.encode(data, cursor);
        cursor = priceTickSize.encode(data, cursor);
        cursor = priceStart.encode(data, cursor);
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "PriceTickSizeTableId" -> Optional.of(priceTickSizeTableId);
            case "PriceTickSize" -> Optional.of(priceTickSize);
            case "PriceStart" -> Optional.of(priceStart);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PriceTickSizeMessage message)) {
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
        if (!(other instanceof PriceTickSizeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
