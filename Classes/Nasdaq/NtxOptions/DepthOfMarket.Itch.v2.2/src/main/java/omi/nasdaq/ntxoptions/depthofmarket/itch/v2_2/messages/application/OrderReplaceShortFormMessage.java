package omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.fields.InstrumentIdField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.fields.NewReferenceNumberField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.fields.OriginalReferenceNumberField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.fields.PriceShortField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.fields.TimestampField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.fields.TrackingNumberField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.fields.VolumeShortField;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.types.Field;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.types.Message;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v2_2.types.PrintOptions;

/**
 * Represents the OrderReplaceShortFormMessage message from the DepthOfMarket protocol.
 *
 * <p>This message is sent whenever an order on the book is replaced.</p>
 */
public final class OrderReplaceShortFormMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'u';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Replace Short Form Message";

    /**
     * Internal system tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Integer ID of the option, as defined in the Derivative Directory Message.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * The original reference number associated with the order being replaced.
     */
    private final OriginalReferenceNumberField originalReferenceNumber = new OriginalReferenceNumberField();

    /**
     * The new reference number assigned to the replacement order.
     */
    private final NewReferenceNumberField newReferenceNumber = new NewReferenceNumberField();

    /**
     * The display price of the new order.
     */
    private final PriceShortField priceShort = new PriceShortField();

    /**
     * The display quantity of the new order.
     */
    private final VolumeShortField volumeShort = new VolumeShortField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(trackingNumber, timestampField, instrumentId, originalReferenceNumber, newReferenceNumber, priceShort, volumeShort);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Internal system tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Nanoseconds since midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Integer ID of the option, as defined in the Derivative Directory Message.
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * The original reference number associated with the order being replaced.
     *
     * @return the OriginalReferenceNumber field
     */
    public OriginalReferenceNumberField originalReferenceNumber() {
        return originalReferenceNumber;
    }

    /**
     * The new reference number assigned to the replacement order.
     *
     * @return the NewReferenceNumber field
     */
    public NewReferenceNumberField newReferenceNumber() {
        return newReferenceNumber;
    }

    /**
     * The display price of the new order.
     *
     * @return the PriceShort field
     */
    public PriceShortField priceShort() {
        return priceShort;
    }

    /**
     * The display quantity of the new order.
     *
     * @return the VolumeShort field
     */
    public VolumeShortField volumeShort() {
        return volumeShort;
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
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!originalReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalReferenceNumberField.BYTE_LENGTH;
        if (!newReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += NewReferenceNumberField.BYTE_LENGTH;
        if (!priceShort.parse(data, cursor)) {
            return false;
        }
        cursor += PriceShortField.BYTE_LENGTH;
        return volumeShort.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = originalReferenceNumber.encode(data, cursor);
        cursor = newReferenceNumber.encode(data, cursor);
        cursor = priceShort.encode(data, cursor);
        cursor = volumeShort.encode(data, cursor);
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
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "Timestamp" -> Optional.of(timestampField);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "OriginalReferenceNumber" -> Optional.of(originalReferenceNumber);
            case "NewReferenceNumber" -> Optional.of(newReferenceNumber);
            case "PriceShort" -> Optional.of(priceShort);
            case "VolumeShort" -> Optional.of(volumeShort);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderReplaceShortFormMessage message)) {
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
        if (!(other instanceof OrderReplaceShortFormMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
