package omi.jse.itac.enhancednativetrading.ntgi.v4_04.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.ClientOrderIdField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.OrderBookField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.OrderIdAlphaField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.OrigClientOrderIdField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.RfqIdField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.SecurityIdField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.SideField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.fields.TraderMnemonicField;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.types.Field;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.types.Message;
import omi.jse.itac.enhancednativetrading.ntgi.v4_04.types.PrintOptions;

/**
 * Represents the OrderCancelRequestMessage message from the EnhancedNativeTrading protocol.
 *
 * <p>Allows the client to cancel an Open or Parked order.</p>
 */
public final class OrderCancelRequestMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'F';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 85;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Cancel Request Message";

    /**
     * Client specified identifier of the rejected message if it is available
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * Client specified identifier of the order being cancelled
     */
    private final OrigClientOrderIdField origClientOrderId = new OrigClientOrderIdField();

    /**
     * Unique identifier of the order assigned by the matching system
     */
    private final OrderIdAlphaField orderIdAlpha = new OrderIdAlphaField();

    /**
     * Numeric Identifier of the instrument for which the order is submitted
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Concatenated identifier of the Trader Group and the JSE Trader ID
     */
    private final TraderMnemonicField traderMnemonic = new TraderMnemonicField();

    /**
     * Side of the order
     */
    private final SideField side = new SideField();

    /**
     * Order book the order belongs to
     */
    private final OrderBookField orderBook = new OrderBookField();

    /**
     * Unique system generated identifier assigned to the RFQ
     */
    private final RfqIdField rfqId = new RfqIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clientOrderId, origClientOrderId, orderIdAlpha, securityId, traderMnemonic, side, orderBook, rfqId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Client specified identifier of the rejected message if it is available
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * Client specified identifier of the order being cancelled
     *
     * @return the OrigClientOrderId field
     */
    public OrigClientOrderIdField origClientOrderId() {
        return origClientOrderId;
    }

    /**
     * Unique identifier of the order assigned by the matching system
     *
     * @return the OrderIdAlpha field
     */
    public OrderIdAlphaField orderIdAlpha() {
        return orderIdAlpha;
    }

    /**
     * Numeric Identifier of the instrument for which the order is submitted
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Concatenated identifier of the Trader Group and the JSE Trader ID
     *
     * @return the TraderMnemonic field
     */
    public TraderMnemonicField traderMnemonic() {
        return traderMnemonic;
    }

    /**
     * Side of the order
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Order book the order belongs to
     *
     * @return the OrderBook field
     */
    public OrderBookField orderBook() {
        return orderBook;
    }

    /**
     * Unique system generated identifier assigned to the RFQ
     *
     * @return the RfqId field
     */
    public RfqIdField rfqId() {
        return rfqId;
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
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!origClientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClientOrderIdField.BYTE_LENGTH;
        if (!orderIdAlpha.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdAlphaField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!traderMnemonic.parse(data, cursor)) {
            return false;
        }
        cursor += TraderMnemonicField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderBook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookField.BYTE_LENGTH;
        return rfqId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clientOrderId.encode(data, cursor);
        cursor = origClientOrderId.encode(data, cursor);
        cursor = orderIdAlpha.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = traderMnemonic.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderBook.encode(data, cursor);
        cursor = rfqId.encode(data, cursor);
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
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "OrigClientOrderId" -> Optional.of(origClientOrderId);
            case "OrderIdAlpha" -> Optional.of(orderIdAlpha);
            case "SecurityId" -> Optional.of(securityId);
            case "TraderMnemonic" -> Optional.of(traderMnemonic);
            case "Side" -> Optional.of(side);
            case "OrderBook" -> Optional.of(orderBook);
            case "RfqId" -> Optional.of(rfqId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderCancelRequestMessage message)) {
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
        if (!(other instanceof OrderCancelRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
