package omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.MidnightReferenceField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.TimeOffsetField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.TimeReferenceField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.TradeDateField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.types.Field;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.types.Message;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.types.PrintOptions;

/**
 * Represents the TimeReferenceMessage message from the MulticastDepthOfBook protocol.
 *
 * <p>The Time Reference message is used to provide a midnight reference point for recipients of the feed. It is sent whenever the system starts up and when the system crosses a midnight boundary. All subsequent Time messages for the same unit will the use the last Midnight Reference until another Time Reference message is received for that unit.</p>
 */
public final class TimeReferenceMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 16;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Time Reference Message";

    /**
     * Midnight Central Time reference time for subsequent Time messages, expressed as number of whole seconds since the Epoch (Midnight January 1, 1970 UTC).
     */
    private final MidnightReferenceField midnightReference = new MidnightReferenceField();

    /**
     * Number of whole seconds from midnight Central Time.
     */
    private final TimeReferenceField timeReference = new TimeReferenceField();

    /**
     * Nanosecond offset from last unit timestamp.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Current Trade Date
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(midnightReference, timeReference, timeOffset, tradeDate);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Midnight Central Time reference time for subsequent Time messages, expressed as number of whole seconds since the Epoch (Midnight January 1, 1970 UTC).
     *
     * @return the MidnightReference field
     */
    public MidnightReferenceField midnightReference() {
        return midnightReference;
    }

    /**
     * Number of whole seconds from midnight Central Time.
     *
     * @return the TimeReference field
     */
    public TimeReferenceField timeReference() {
        return timeReference;
    }

    /**
     * Nanosecond offset from last unit timestamp.
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Current Trade Date
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
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
        if (!midnightReference.parse(data, cursor)) {
            return false;
        }
        cursor += MidnightReferenceField.BYTE_LENGTH;
        if (!timeReference.parse(data, cursor)) {
            return false;
        }
        cursor += TimeReferenceField.BYTE_LENGTH;
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        return tradeDate.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = midnightReference.encode(data, cursor);
        cursor = timeReference.encode(data, cursor);
        cursor = timeOffset.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
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
            case "MidnightReference" -> Optional.of(midnightReference);
            case "TimeReference" -> Optional.of(timeReference);
            case "TimeOffset" -> Optional.of(timeOffset);
            case "TradeDate" -> Optional.of(tradeDate);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TimeReferenceMessage message)) {
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
        if (!(other instanceof TimeReferenceMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
