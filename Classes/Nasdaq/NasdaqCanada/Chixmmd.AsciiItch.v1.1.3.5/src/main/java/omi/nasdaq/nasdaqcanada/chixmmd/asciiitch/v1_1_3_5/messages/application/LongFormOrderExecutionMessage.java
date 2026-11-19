package omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.fields.BrokerField;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.fields.ContraBrokerField;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.fields.ContraOrderReferenceField;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.fields.LongExecutedSharesField;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.fields.OrderReferenceField;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.fields.TradeAttributeField;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.fields.TradeReferenceField;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.types.Field;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.types.Message;
import omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.types.PrintOptions;

/**
 * Represents the LongFormOrderExecutionMessage message from the Chixmmd protocol.
 *
 * <p>An Order Execution Message is sent whenever an order on the book is executed in whole or in part. Not applicable to CXD. Long form messages are used when either the price or size is larger than the standard messages can permit.</p>
 */
public final class LongFormOrderExecutionMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'e';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 44;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Long Form Order Execution Message";

    /**
     * Day unique order reference number
     */
    private final OrderReferenceField orderReference = new OrderReferenceField();

    /**
     * The number of shares executed on this trade
     */
    private final LongExecutedSharesField longExecutedShares = new LongExecutedSharesField();

    /**
     * Day unique trade reference number
     */
    private final TradeReferenceField tradeReference = new TradeReferenceField();

    /**
     * The reference key of the contra-order that was executed.
     */
    private final ContraOrderReferenceField contraOrderReference = new ContraOrderReferenceField();

    /**
     * C = Market On Close
     */
    private final TradeAttributeField tradeAttribute = new TradeAttributeField();

    /**
     * The three digit numeric TSX Broker Number or 001 for anonymous.
     */
    private final BrokerField broker = new BrokerField();

    /**
     * The three digit numeric TSX Broker Number of the contra order or 001 for anonymous.
     */
    private final ContraBrokerField contraBroker = new ContraBrokerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(orderReference, longExecutedShares, tradeReference, contraOrderReference, tradeAttribute, broker, contraBroker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Day unique order reference number
     *
     * @return the OrderReference field
     */
    public OrderReferenceField orderReference() {
        return orderReference;
    }

    /**
     * The number of shares executed on this trade
     *
     * @return the LongExecutedShares field
     */
    public LongExecutedSharesField longExecutedShares() {
        return longExecutedShares;
    }

    /**
     * Day unique trade reference number
     *
     * @return the TradeReference field
     */
    public TradeReferenceField tradeReference() {
        return tradeReference;
    }

    /**
     * The reference key of the contra-order that was executed.
     *
     * @return the ContraOrderReference field
     */
    public ContraOrderReferenceField contraOrderReference() {
        return contraOrderReference;
    }

    /**
     * C = Market On Close
     *
     * @return the TradeAttribute field
     */
    public TradeAttributeField tradeAttribute() {
        return tradeAttribute;
    }

    /**
     * The three digit numeric TSX Broker Number or 001 for anonymous.
     *
     * @return the Broker field
     */
    public BrokerField broker() {
        return broker;
    }

    /**
     * The three digit numeric TSX Broker Number of the contra order or 001 for anonymous.
     *
     * @return the ContraBroker field
     */
    public ContraBrokerField contraBroker() {
        return contraBroker;
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
        if (!orderReference.parse(data, cursor)) {
            return false;
        }
        cursor += OrderReferenceField.BYTE_LENGTH;
        if (!longExecutedShares.parse(data, cursor)) {
            return false;
        }
        cursor += LongExecutedSharesField.BYTE_LENGTH;
        if (!tradeReference.parse(data, cursor)) {
            return false;
        }
        cursor += TradeReferenceField.BYTE_LENGTH;
        if (!contraOrderReference.parse(data, cursor)) {
            return false;
        }
        cursor += ContraOrderReferenceField.BYTE_LENGTH;
        if (!tradeAttribute.parse(data, cursor)) {
            return false;
        }
        cursor += TradeAttributeField.BYTE_LENGTH;
        if (!broker.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerField.BYTE_LENGTH;
        return contraBroker.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = orderReference.encode(data, cursor);
        cursor = longExecutedShares.encode(data, cursor);
        cursor = tradeReference.encode(data, cursor);
        cursor = contraOrderReference.encode(data, cursor);
        cursor = tradeAttribute.encode(data, cursor);
        cursor = broker.encode(data, cursor);
        cursor = contraBroker.encode(data, cursor);
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
            case "OrderReference" -> Optional.of(orderReference);
            case "LongExecutedShares" -> Optional.of(longExecutedShares);
            case "TradeReference" -> Optional.of(tradeReference);
            case "ContraOrderReference" -> Optional.of(contraOrderReference);
            case "TradeAttribute" -> Optional.of(tradeAttribute);
            case "Broker" -> Optional.of(broker);
            case "ContraBroker" -> Optional.of(contraBroker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LongFormOrderExecutionMessage message)) {
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
        if (!(other instanceof LongFormOrderExecutionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
