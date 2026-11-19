package omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.fields.NanosecondsField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.fields.NumberOfReferenceNumberDeltasField;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.groups.CancelledReferenceNumberDeltaEntry;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.groups.CancelledReferenceNumberDeltaList;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.types.Field;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.types.Message;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_5.types.PrintOptions;

/**
 * Represents the BlockDeleteMessage message from the DepthOfMarket protocol.
 *
 * <p>This message contains a block of Single Side Deletes. Each reference number inside the block represents an order or a side of a quote that is being cancelled. All remaining contracts are no longer accessible so the side should be removed from the book.</p>
 */
public final class BlockDeleteMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Z';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 6;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Block Delete Message";

    /**
     * Nanoseconds portion of the timestamp.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * The number of single side deletes in this block. Max possible value = 360
     */
    private final NumberOfReferenceNumberDeltasField numberOfReferenceNumberDeltas = new NumberOfReferenceNumberDeltasField();

    /**
     * The order/quote side reference number delta associated with the cancelled order/quote. n = 0 to (Total Number – 1)
     */
    private final CancelledReferenceNumberDeltaList cancelledReferenceNumberDelta = new CancelledReferenceNumberDeltaList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, numberOfReferenceNumberDeltas);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the timestamp.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * The number of single side deletes in this block. Max possible value = 360
     *
     * @return the NumberOfReferenceNumberDeltas field
     */
    public NumberOfReferenceNumberDeltasField numberOfReferenceNumberDeltas() {
        return numberOfReferenceNumberDeltas;
    }

    /**
     * The order/quote side reference number delta associated with the cancelled order/quote. n = 0 to (Total Number – 1)
     *
     * <p>Encode writes this list's size to the NumberOfReferenceNumberDeltas field.</p>
     *
     * @return the CancelledReferenceNumberDelta entries
     */
    public CancelledReferenceNumberDeltaList cancelledReferenceNumberDelta() {
        return cancelledReferenceNumberDelta;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + cancelledReferenceNumberDelta.byteLength();
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!numberOfReferenceNumberDeltas.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReferenceNumberDeltasField.BYTE_LENGTH;
        if (!cancelledReferenceNumberDelta.parse(data, cursor, end, numberOfReferenceNumberDeltas.value())) {
            return false;
        }
        cursor += cancelledReferenceNumberDelta.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (cancelledReferenceNumberDelta.size() > 65535) {
            throw new IllegalStateException("cancelledReferenceNumberDelta holds " + cancelledReferenceNumberDelta.size() + " entries, more than its count field can state");
        }
        numberOfReferenceNumberDeltas.value(cancelledReferenceNumberDelta.size());
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = numberOfReferenceNumberDeltas.encode(data, cursor);
        cursor = cancelledReferenceNumberDelta.encode(data, cursor);
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
        cancelledReferenceNumberDelta.clear();
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
            if (field != numberOfReferenceNumberDeltas && !field.isRecognized()) {
                return false;
            }
        }
        return cancelledReferenceNumberDelta.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfReferenceNumberDeltas && !field.isValid()) {
                return false;
            }
        }
        if (!cancelledReferenceNumberDelta.isValid()) {
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
        if (!nanoseconds.isDecoded()) {
            return Optional.of(nanoseconds);
        }
        if (!numberOfReferenceNumberDeltas.isDecoded()) {
            return Optional.of(numberOfReferenceNumberDeltas);
        }
        if (!cancelledReferenceNumberDelta.isDecoded()) {
            return Optional.of(cancelledReferenceNumberDelta.failedEntry().flatMap(CancelledReferenceNumberDeltaEntry::failedAt).orElse(numberOfReferenceNumberDeltas));
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
            case "NumberOfReferenceNumberDeltas" -> Optional.of(numberOfReferenceNumberDeltas);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof BlockDeleteMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(cancelledReferenceNumberDelta.diffFields(message.cancelledReferenceNumberDelta));
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
            cancelledReferenceNumberDelta.toFormattedString(builder, options);
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
        cancelledReferenceNumberDelta.toFormattedString(builder, nested);
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
        if (!(other instanceof BlockDeleteMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && cancelledReferenceNumberDelta.equals(message.cancelledReferenceNumberDelta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, cancelledReferenceNumberDelta);
    }
}
