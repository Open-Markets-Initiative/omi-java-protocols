package omi.nairobi.nairobiequities.replay.mitch.v1_22.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.InterestRateField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.NanosecondField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.NewPriceField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.NewQuantityField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.OrderIdField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.OrderModifiedFlagsField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.SettlementTypeField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.fields.TermField;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.types.Field;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.types.Message;
import omi.nairobi.nairobiequities.replay.mitch.v1_22.types.PrintOptions;

/**
 * Represents the OrderModifiedMessage message from the Replay protocol.
 *
 * <p>Indicates that the displayed quantity or price of a displayed order has been updated, and whether the order has retained or lost its time priority.</p>
 */
public final class OrderModifiedMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 27;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Modified Message";

    /**
     * Nanoseconds offset from the last Time message.
     */
    private final NanosecondField nanosecond = new NanosecondField();

    /**
     * Unique identifier of the order.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * New displayed quantity of the order.
     */
    private final NewQuantityField newQuantity = new NewQuantityField();

    /**
     * New limit price of the order.
     */
    private final NewPriceField newPrice = new NewPriceField();

    /**
     * Flags of the Order Modified message, which the document labels Flags.
     */
    private final OrderModifiedFlagsField orderModifiedFlags = new OrderModifiedFlagsField();

    /**
     * Type of settlement. Only valid when Order Book is Block Trade (4).
     */
    private final SettlementTypeField settlementType = new SettlementTypeField();

    /**
     * Gives the interest rate for a Repo order. Only valid when Order Book is Block Trade (4).
     */
    private final InterestRateField interestRate = new InterestRateField();

    /**
     * Gives the term of settlement of the 2nd leg of the Repo. Only valid when Order Book is Block Trade (4).
     */
    private final TermField term = new TermField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanosecond, orderId, newQuantity, newPrice, orderModifiedFlags, settlementType, interestRate, term);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds offset from the last Time message.
     *
     * @return the Nanosecond field
     */
    public NanosecondField nanosecond() {
        return nanosecond;
    }

    /**
     * Unique identifier of the order.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * New displayed quantity of the order.
     *
     * @return the NewQuantity field
     */
    public NewQuantityField newQuantity() {
        return newQuantity;
    }

    /**
     * New limit price of the order.
     *
     * @return the NewPrice field
     */
    public NewPriceField newPrice() {
        return newPrice;
    }

    /**
     * Flags of the Order Modified message, which the document labels Flags.
     *
     * @return the OrderModifiedFlags field
     */
    public OrderModifiedFlagsField orderModifiedFlags() {
        return orderModifiedFlags;
    }

    /**
     * Type of settlement. Only valid when Order Book is Block Trade (4).
     *
     * @return the SettlementType field
     */
    public SettlementTypeField settlementType() {
        return settlementType;
    }

    /**
     * Gives the interest rate for a Repo order. Only valid when Order Book is Block Trade (4).
     *
     * @return the InterestRate field
     */
    public InterestRateField interestRate() {
        return interestRate;
    }

    /**
     * Gives the term of settlement of the 2nd leg of the Repo. Only valid when Order Book is Block Trade (4).
     *
     * @return the Term field
     */
    public TermField term() {
        return term;
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
        if (!nanosecond.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!newQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += NewQuantityField.BYTE_LENGTH;
        if (!newPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NewPriceField.BYTE_LENGTH;
        if (!orderModifiedFlags.parse(data, cursor)) {
            return false;
        }
        cursor += OrderModifiedFlagsField.BYTE_LENGTH;
        if (!settlementType.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementTypeField.BYTE_LENGTH;
        if (!interestRate.parse(data, cursor)) {
            return false;
        }
        cursor += InterestRateField.BYTE_LENGTH;
        return term.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanosecond.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = newQuantity.encode(data, cursor);
        cursor = newPrice.encode(data, cursor);
        cursor = orderModifiedFlags.encode(data, cursor);
        cursor = settlementType.encode(data, cursor);
        cursor = interestRate.encode(data, cursor);
        cursor = term.encode(data, cursor);
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
            case "Nanosecond" -> Optional.of(nanosecond);
            case "OrderId" -> Optional.of(orderId);
            case "NewQuantity" -> Optional.of(newQuantity);
            case "NewPrice" -> Optional.of(newPrice);
            case "OrderModifiedFlags" -> Optional.of(orderModifiedFlags);
            case "SettlementType" -> Optional.of(settlementType);
            case "InterestRate" -> Optional.of(interestRate);
            case "Term" -> Optional.of(term);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderModifiedMessage message)) {
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
        if (!(other instanceof OrderModifiedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
