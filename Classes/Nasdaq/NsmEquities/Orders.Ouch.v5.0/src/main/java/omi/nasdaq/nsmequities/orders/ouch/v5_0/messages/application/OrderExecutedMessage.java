package omi.nasdaq.nsmequities.orders.ouch.v5_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.AppendageLengthField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.LiquidityFlagField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.MatchNumberField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.PriceField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.QuantityField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.TimestampField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.UserRefNumField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.groups.OrderExecutedAppendageEntry;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.groups.OrderExecutedAppendageList;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Field;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Message;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.PrintOptions;

/**
 * Represents the OrderExecutedMessage message from the Orders protocol.
 *
 * <p>An Executed Order Message informs you that all or part of an order has been executed.</p>
 */
public final class OrderExecutedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'E';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 35;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Executed Message";

    /**
     * Expressed as nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * UserRefNum must be day-unique and strictly increasing for each OUCH account.
     */
    private final UserRefNumField userRefNum = new UserRefNumField();

    /**
     * Total number of shares. Must be greater than zero and less than 1,000,000.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * The price of the order.
     */
    private final PriceField price = new PriceField();

    /**
     * Liquidity flag the order would have received.
     */
    private final LiquidityFlagField liquidityFlag = new LiquidityFlagField();

    /**
     * Assigned by the exchange to identify the trade. Both the buy and the sell executions participating in the trade will share the same match number.
     */
    private final MatchNumberField matchNumber = new MatchNumberField();

    /**
     * The length of the remaining Optional Appendage field.
     */
    private final AppendageLengthField appendageLength = new AppendageLengthField();

    /**
     * Order Executed Appendage
     */
    private final OrderExecutedAppendageList orderExecutedAppendage = new OrderExecutedAppendageList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, userRefNum, quantity, price, liquidityFlag, matchNumber, appendageLength);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Expressed as nanoseconds since midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * UserRefNum must be day-unique and strictly increasing for each OUCH account.
     *
     * @return the UserRefNum field
     */
    public UserRefNumField userRefNum() {
        return userRefNum;
    }

    /**
     * Total number of shares. Must be greater than zero and less than 1,000,000.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * The price of the order.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Liquidity flag the order would have received.
     *
     * @return the LiquidityFlag field
     */
    public LiquidityFlagField liquidityFlag() {
        return liquidityFlag;
    }

    /**
     * Assigned by the exchange to identify the trade. Both the buy and the sell executions participating in the trade will share the same match number.
     *
     * @return the MatchNumber field
     */
    public MatchNumberField matchNumber() {
        return matchNumber;
    }

    /**
     * The length of the remaining Optional Appendage field.
     *
     * @return the AppendageLength field
     */
    public AppendageLengthField appendageLength() {
        return appendageLength;
    }

    /**
     * Order Executed Appendage
     *
     * <p>Its entries fill the bytes the AppendageLength field states: encode writes this list's byte length to it.</p>
     *
     * @return the OrderExecutedAppendage entries
     */
    public OrderExecutedAppendageList orderExecutedAppendage() {
        return orderExecutedAppendage;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + orderExecutedAppendage.byteLength();
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!userRefNum.parse(data, cursor)) {
            return false;
        }
        cursor += UserRefNumField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!liquidityFlag.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityFlagField.BYTE_LENGTH;
        if (!matchNumber.parse(data, cursor)) {
            return false;
        }
        cursor += MatchNumberField.BYTE_LENGTH;
        if (!appendageLength.parse(data, cursor)) {
            return false;
        }
        cursor += AppendageLengthField.BYTE_LENGTH;
        long orderExecutedAppendageBudget = appendageLength.value();
        if (orderExecutedAppendageBudget < 0 || orderExecutedAppendageBudget > (end) - cursor) {
            return false;
        }
        if (!orderExecutedAppendage.parse(data, cursor, cursor + (int) orderExecutedAppendageBudget)) {
            return false;
        }
        cursor += orderExecutedAppendage.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (orderExecutedAppendage.byteLength() > 65535) {
            throw new IllegalStateException("orderExecutedAppendage holds " + orderExecutedAppendage.byteLength() + " bytes, more than its length field can state");
        }
        appendageLength.value((orderExecutedAppendage.byteLength()));
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = userRefNum.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = liquidityFlag.encode(data, cursor);
        cursor = matchNumber.encode(data, cursor);
        cursor = appendageLength.encode(data, cursor);
        cursor = orderExecutedAppendage.encode(data, cursor);
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
        orderExecutedAppendage.clear();
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
            if (field != appendageLength && !field.isRecognized()) {
                return false;
            }
        }
        return orderExecutedAppendage.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != appendageLength && !field.isValid()) {
                return false;
            }
        }
        if (!orderExecutedAppendage.isValid()) {
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
        if (!timestampField.isDecoded()) {
            return Optional.of(timestampField);
        }
        if (!userRefNum.isDecoded()) {
            return Optional.of(userRefNum);
        }
        if (!quantity.isDecoded()) {
            return Optional.of(quantity);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!liquidityFlag.isDecoded()) {
            return Optional.of(liquidityFlag);
        }
        if (!matchNumber.isDecoded()) {
            return Optional.of(matchNumber);
        }
        if (!appendageLength.isDecoded()) {
            return Optional.of(appendageLength);
        }
        if (!orderExecutedAppendage.isDecoded()) {
            return Optional.of(orderExecutedAppendage.failedEntry().flatMap(OrderExecutedAppendageEntry::failedAt).orElse(appendageLength));
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
            case "Timestamp" -> Optional.of(timestampField);
            case "UserRefNum" -> Optional.of(userRefNum);
            case "Quantity" -> Optional.of(quantity);
            case "Price" -> Optional.of(price);
            case "LiquidityFlag" -> Optional.of(liquidityFlag);
            case "MatchNumber" -> Optional.of(matchNumber);
            case "AppendageLength" -> Optional.of(appendageLength);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderExecutedMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(orderExecutedAppendage.diffFields(message.orderExecutedAppendage));
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
            orderExecutedAppendage.toFormattedString(builder, options);
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
        orderExecutedAppendage.toFormattedString(builder, nested);
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
        if (!(other instanceof OrderExecutedMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && orderExecutedAppendage.equals(message.orderExecutedAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, orderExecutedAppendage);
    }
}
