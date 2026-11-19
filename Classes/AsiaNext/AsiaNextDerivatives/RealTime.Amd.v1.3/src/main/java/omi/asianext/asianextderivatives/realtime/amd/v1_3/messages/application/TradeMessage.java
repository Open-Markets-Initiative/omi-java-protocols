package omi.asianext.asianextderivatives.realtime.amd.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.fields.BinaryMmtField;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.fields.OrderRefField;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.fields.PriceField;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.fields.QuantityField;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.fields.SecurityIdField;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.fields.TimestampField;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.fields.TradeRefField;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.fields.TradeTypeField;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.types.Field;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.types.Message;
import omi.asianext.asianextderivatives.realtime.amd.v1_3.types.PrintOptions;

/**
 * Represents the TradeMessage message from the RealTime protocol.
 *
 * <p>Whenever an order trades, partially or fully, a Trade message is published.</p>
 */
public final class TradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0005';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 49;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Message";

    /**
     * Numeric identifier of the relevant security
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * 1 = a trade against visible order quantity in the continuous trading order book
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * Number of contracts being added to the book
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * The price of the order
     */
    private final PriceField price = new PriceField();

    /**
     * Unique order reference number for the session
     */
    private final OrderRefField orderRef = new OrderRefField();

    /**
     * Trade reference number
     */
    private final TradeRefField tradeRef = new TradeRefField();

    /**
     * Timestamp of this market data event
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * MMT flags
     */
    private final BinaryMmtField binaryMmt = new BinaryMmtField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityId, tradeType, quantity, price, orderRef, tradeRef, timestampField, binaryMmt);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Numeric identifier of the relevant security
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * 1 = a trade against visible order quantity in the continuous trading order book
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    /**
     * Number of contracts being added to the book
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * The price of the order
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Unique order reference number for the session
     *
     * @return the OrderRef field
     */
    public OrderRefField orderRef() {
        return orderRef;
    }

    /**
     * Trade reference number
     *
     * @return the TradeRef field
     */
    public TradeRefField tradeRef() {
        return tradeRef;
    }

    /**
     * Timestamp of this market data event
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * MMT flags
     *
     * @return the BinaryMmt field
     */
    public BinaryMmtField binaryMmt() {
        return binaryMmt;
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
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!orderRef.parse(data, cursor)) {
            return false;
        }
        cursor += OrderRefField.BYTE_LENGTH;
        if (!tradeRef.parse(data, cursor)) {
            return false;
        }
        cursor += TradeRefField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        return binaryMmt.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityId.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = orderRef.encode(data, cursor);
        cursor = tradeRef.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = binaryMmt.encode(data, cursor);
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
            case "SecurityId" -> Optional.of(securityId);
            case "TradeType" -> Optional.of(tradeType);
            case "Quantity" -> Optional.of(quantity);
            case "Price" -> Optional.of(price);
            case "OrderRef" -> Optional.of(orderRef);
            case "TradeRef" -> Optional.of(tradeRef);
            case "Timestamp" -> Optional.of(timestampField);
            case "BinaryMmt" -> Optional.of(binaryMmt);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeMessage message)) {
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
        if (!(other instanceof TradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
