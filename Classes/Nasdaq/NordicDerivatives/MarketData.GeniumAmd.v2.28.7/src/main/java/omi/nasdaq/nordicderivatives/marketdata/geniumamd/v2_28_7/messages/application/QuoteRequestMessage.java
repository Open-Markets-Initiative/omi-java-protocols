package omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.OrderBookIdField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.QuantityField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.ReservedAlpha1Field;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.ReservedAlpha5Field;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.ReservedAlpha7Field;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.SideField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.TimestampNanosecondsField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.types.Field;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.types.Message;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.types.PrintOptions;

/**
 * Represents the QuoteRequestMessage message from the MarketData protocol.
 */
public final class QuoteRequestMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'q';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 30;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Request Message";

    /**
     * Nanoseconds portion of the timestamp.
     */
    private final TimestampNanosecondsField timestampNanoseconds = new TimestampNanosecondsField();

    /**
     * Denotes the primary identifier of an order book. NOTE: Expired Order book IDs may be reused for new instruments.
     */
    private final OrderBookIdField orderBookId = new OrderBookIdField();

    /**
     * Reserved Alpha 7
     */
    private final ReservedAlpha7Field reservedAlpha7 = new ReservedAlpha7Field();

    /**
     * Reserved Alpha 5
     */
    private final ReservedAlpha5Field reservedAlpha5 = new ReservedAlpha5Field();

    /**
     * Reserved Alpha 1
     */
    private final ReservedAlpha1Field reservedAlpha1 = new ReservedAlpha1Field();

    /**
     * The side of quote being requested. Values: “B” = buy quote requested. “S” = sell quote requested. “C” = request for cross “ ” (Space) = Double-sided quote requested
     */
    private final SideField side = new SideField();

    /**
     * Requested Quote quantity. Zero means any quanti- ty.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampNanoseconds, orderBookId, reservedAlpha7, reservedAlpha5, reservedAlpha1, side, quantity);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the timestamp.
     *
     * @return the TimestampNanoseconds field
     */
    public TimestampNanosecondsField timestampNanoseconds() {
        return timestampNanoseconds;
    }

    /**
     * Denotes the primary identifier of an order book. NOTE: Expired Order book IDs may be reused for new instruments.
     *
     * @return the OrderBookId field
     */
    public OrderBookIdField orderBookId() {
        return orderBookId;
    }

    /**
     * Reserved Alpha 7
     *
     * @return the ReservedAlpha7 field
     */
    public ReservedAlpha7Field reservedAlpha7() {
        return reservedAlpha7;
    }

    /**
     * Reserved Alpha 5
     *
     * @return the ReservedAlpha5 field
     */
    public ReservedAlpha5Field reservedAlpha5() {
        return reservedAlpha5;
    }

    /**
     * Reserved Alpha 1
     *
     * @return the ReservedAlpha1 field
     */
    public ReservedAlpha1Field reservedAlpha1() {
        return reservedAlpha1;
    }

    /**
     * The side of quote being requested. Values: “B” = buy quote requested. “S” = sell quote requested. “C” = request for cross “ ” (Space) = Double-sided quote requested
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Requested Quote quantity. Zero means any quanti- ty.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
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
        if (!timestampNanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampNanosecondsField.BYTE_LENGTH;
        if (!orderBookId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookIdField.BYTE_LENGTH;
        if (!reservedAlpha7.parse(data, cursor)) {
            return false;
        }
        cursor += ReservedAlpha7Field.BYTE_LENGTH;
        if (!reservedAlpha5.parse(data, cursor)) {
            return false;
        }
        cursor += ReservedAlpha5Field.BYTE_LENGTH;
        if (!reservedAlpha1.parse(data, cursor)) {
            return false;
        }
        cursor += ReservedAlpha1Field.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        return quantity.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampNanoseconds.encode(data, cursor);
        cursor = orderBookId.encode(data, cursor);
        cursor = reservedAlpha7.encode(data, cursor);
        cursor = reservedAlpha5.encode(data, cursor);
        cursor = reservedAlpha1.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
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
            case "TimestampNanoseconds" -> Optional.of(timestampNanoseconds);
            case "OrderBookId" -> Optional.of(orderBookId);
            case "ReservedAlpha7" -> Optional.of(reservedAlpha7);
            case "ReservedAlpha5" -> Optional.of(reservedAlpha5);
            case "ReservedAlpha1" -> Optional.of(reservedAlpha1);
            case "Side" -> Optional.of(side);
            case "Quantity" -> Optional.of(quantity);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteRequestMessage message)) {
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
        if (!(other instanceof QuoteRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
