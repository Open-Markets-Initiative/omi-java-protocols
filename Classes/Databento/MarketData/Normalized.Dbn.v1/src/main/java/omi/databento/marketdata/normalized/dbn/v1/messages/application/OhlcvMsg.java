package omi.databento.marketdata.normalized.dbn.v1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.databento.marketdata.normalized.dbn.v1.fields.CloseField;
import omi.databento.marketdata.normalized.dbn.v1.fields.HighField;
import omi.databento.marketdata.normalized.dbn.v1.fields.LowField;
import omi.databento.marketdata.normalized.dbn.v1.fields.OpenField;
import omi.databento.marketdata.normalized.dbn.v1.fields.VolumeField;
import omi.databento.marketdata.normalized.dbn.v1.types.Field;
import omi.databento.marketdata.normalized.dbn.v1.types.Message;
import omi.databento.marketdata.normalized.dbn.v1.types.PrintOptions;

/**
 * Represents the OhlcvMsg message from the Normalized protocol.
 *
 * <p>Open, high, low, close, and volume; the record of the ohlcv schemas</p>
 */
public final class OhlcvMsg implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0011';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 40;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Ohlcv Msg";

    /**
     * The open price for the bar
     */
    private final OpenField open = new OpenField();

    /**
     * The high price for the bar
     */
    private final HighField high = new HighField();

    /**
     * The low price for the bar
     */
    private final LowField low = new LowField();

    /**
     * The close price for the bar
     */
    private final CloseField close = new CloseField();

    /**
     * The total volume traded during the aggregation period
     */
    private final VolumeField volume = new VolumeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(open, high, low, close, volume);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The open price for the bar
     *
     * @return the Open field
     */
    public OpenField open() {
        return open;
    }

    /**
     * The high price for the bar
     *
     * @return the High field
     */
    public HighField high() {
        return high;
    }

    /**
     * The low price for the bar
     *
     * @return the Low field
     */
    public LowField low() {
        return low;
    }

    /**
     * The close price for the bar
     *
     * @return the Close field
     */
    public CloseField close() {
        return close;
    }

    /**
     * The total volume traded during the aggregation period
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
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
        if (!open.parse(data, cursor)) {
            return false;
        }
        cursor += OpenField.BYTE_LENGTH;
        if (!high.parse(data, cursor)) {
            return false;
        }
        cursor += HighField.BYTE_LENGTH;
        if (!low.parse(data, cursor)) {
            return false;
        }
        cursor += LowField.BYTE_LENGTH;
        if (!close.parse(data, cursor)) {
            return false;
        }
        cursor += CloseField.BYTE_LENGTH;
        return volume.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = open.encode(data, cursor);
        cursor = high.encode(data, cursor);
        cursor = low.encode(data, cursor);
        cursor = close.encode(data, cursor);
        cursor = volume.encode(data, cursor);
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
            case "Open" -> Optional.of(open);
            case "High" -> Optional.of(high);
            case "Low" -> Optional.of(low);
            case "Close" -> Optional.of(close);
            case "Volume" -> Optional.of(volume);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OhlcvMsg message)) {
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
        if (!(other instanceof OhlcvMsg message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
