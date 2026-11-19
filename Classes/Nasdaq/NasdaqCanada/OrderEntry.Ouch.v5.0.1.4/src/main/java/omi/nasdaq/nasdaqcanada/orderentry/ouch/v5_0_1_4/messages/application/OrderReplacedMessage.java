package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.AppendageLengthField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.OrderQtyField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.OrderReferenceNumberField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.OrderStateField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.OrigUserRefNumField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.PriceField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.SideField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.TimeInForceField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.TimestampField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.UserRefNumField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.groups.OrderReplacedAppendageEntry;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.groups.OrderReplacedAppendageList;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.Field;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.Message;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.PrintOptions;

/**
 * Represents the OrderReplacedMessage message from the OrderEntry protocol.
 *
 * <p>This message acknowledges the receipt and acceptance of a valid Replace Order Message. The data fields from the Replace Order Message are echoed back in this message. The OrderQty indicates how many shares were left exposed when the replacement completed.</p>
 */
public final class OrderReplacedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'U';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 41;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Replaced Message";

    /**
     * Expressed as nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * This must be filled out with the Order UserRefNum sent on the Enter Order Message or last Replace Order Message
     */
    private final OrigUserRefNumField origUserRefNum = new OrigUserRefNumField();

    /**
     * As described above in Data Types. UserRefNum must be day-unique and strictly increasing for each OUCH account
     */
    private final UserRefNumField userRefNum = new UserRefNumField();

    /**
     * Total number of shares
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Maximum 999,999. A price of 0 will be treated as a market order. Implied 8 decimal places
     */
    private final PriceField price = new PriceField();

    /**
     * 1 = Buy; 2 = Sell; 5 = Sell Short
     */
    private final SideField side = new SideField();

    /**
     * 0 = Day; 3 = Immediate or Cancel; 6 = Good Till Date (GTD), must be used with ExpireTime; 8 = Stream Or Kill (SOK), CXD PureStream only; P = Post-Only Order
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * The day-unique Order Reference Number assigned by Nasdaq Canada to this order
     */
    private final OrderReferenceNumberField orderReferenceNumber = new OrderReferenceNumberField();

    /**
     * L = Order Live; D = Order Dead
     */
    private final OrderStateField orderState = new OrderStateField();

    /**
     * The length of the remaining Optional Appendage Field. Required. If no optional appendage, length=0
     */
    private final AppendageLengthField appendageLength = new AppendageLengthField();

    /**
     * Order Replaced Appendage
     */
    private final OrderReplacedAppendageList orderReplacedAppendage = new OrderReplacedAppendageList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, origUserRefNum, userRefNum, orderQty, price, side, timeInForce, orderReferenceNumber, orderState, appendageLength);

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
     * This must be filled out with the Order UserRefNum sent on the Enter Order Message or last Replace Order Message
     *
     * @return the OrigUserRefNum field
     */
    public OrigUserRefNumField origUserRefNum() {
        return origUserRefNum;
    }

    /**
     * As described above in Data Types. UserRefNum must be day-unique and strictly increasing for each OUCH account
     *
     * @return the UserRefNum field
     */
    public UserRefNumField userRefNum() {
        return userRefNum;
    }

    /**
     * Total number of shares
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Maximum 999,999. A price of 0 will be treated as a market order. Implied 8 decimal places
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * 1 = Buy; 2 = Sell; 5 = Sell Short
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * 0 = Day; 3 = Immediate or Cancel; 6 = Good Till Date (GTD), must be used with ExpireTime; 8 = Stream Or Kill (SOK), CXD PureStream only; P = Post-Only Order
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * The day-unique Order Reference Number assigned by Nasdaq Canada to this order
     *
     * @return the OrderReferenceNumber field
     */
    public OrderReferenceNumberField orderReferenceNumber() {
        return orderReferenceNumber;
    }

    /**
     * L = Order Live; D = Order Dead
     *
     * @return the OrderState field
     */
    public OrderStateField orderState() {
        return orderState;
    }

    /**
     * The length of the remaining Optional Appendage Field. Required. If no optional appendage, length=0
     *
     * @return the AppendageLength field
     */
    public AppendageLengthField appendageLength() {
        return appendageLength;
    }

    /**
     * Order Replaced Appendage
     *
     * <p>Its entries fill the bytes the AppendageLength field states: encode writes this list's byte length to it.</p>
     *
     * @return the OrderReplacedAppendage entries
     */
    public OrderReplacedAppendageList orderReplacedAppendage() {
        return orderReplacedAppendage;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + orderReplacedAppendage.byteLength();
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
        if (!origUserRefNum.parse(data, cursor)) {
            return false;
        }
        cursor += OrigUserRefNumField.BYTE_LENGTH;
        if (!userRefNum.parse(data, cursor)) {
            return false;
        }
        cursor += UserRefNumField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!orderReferenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderReferenceNumberField.BYTE_LENGTH;
        if (!orderState.parse(data, cursor)) {
            return false;
        }
        cursor += OrderStateField.BYTE_LENGTH;
        if (!appendageLength.parse(data, cursor)) {
            return false;
        }
        cursor += AppendageLengthField.BYTE_LENGTH;
        long orderReplacedAppendageBudget = appendageLength.value();
        if (orderReplacedAppendageBudget < 0 || orderReplacedAppendageBudget > (end) - cursor) {
            return false;
        }
        if (!orderReplacedAppendage.parse(data, cursor, cursor + (int) orderReplacedAppendageBudget)) {
            return false;
        }
        cursor += orderReplacedAppendage.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (orderReplacedAppendage.byteLength() > 65535) {
            throw new IllegalStateException("orderReplacedAppendage holds " + orderReplacedAppendage.byteLength() + " bytes, more than its length field can state");
        }
        appendageLength.value((orderReplacedAppendage.byteLength()));
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = origUserRefNum.encode(data, cursor);
        cursor = userRefNum.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = orderReferenceNumber.encode(data, cursor);
        cursor = orderState.encode(data, cursor);
        cursor = appendageLength.encode(data, cursor);
        cursor = orderReplacedAppendage.encode(data, cursor);
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
        orderReplacedAppendage.clear();
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
        return orderReplacedAppendage.isRecognized();
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
        if (!orderReplacedAppendage.isValid()) {
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
        if (!origUserRefNum.isDecoded()) {
            return Optional.of(origUserRefNum);
        }
        if (!userRefNum.isDecoded()) {
            return Optional.of(userRefNum);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!timeInForce.isDecoded()) {
            return Optional.of(timeInForce);
        }
        if (!orderReferenceNumber.isDecoded()) {
            return Optional.of(orderReferenceNumber);
        }
        if (!orderState.isDecoded()) {
            return Optional.of(orderState);
        }
        if (!appendageLength.isDecoded()) {
            return Optional.of(appendageLength);
        }
        if (!orderReplacedAppendage.isDecoded()) {
            return Optional.of(orderReplacedAppendage.failedEntry().flatMap(OrderReplacedAppendageEntry::failedAt).orElse(appendageLength));
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
            case "OrigUserRefNum" -> Optional.of(origUserRefNum);
            case "UserRefNum" -> Optional.of(userRefNum);
            case "OrderQty" -> Optional.of(orderQty);
            case "Price" -> Optional.of(price);
            case "Side" -> Optional.of(side);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "OrderReferenceNumber" -> Optional.of(orderReferenceNumber);
            case "OrderState" -> Optional.of(orderState);
            case "AppendageLength" -> Optional.of(appendageLength);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderReplacedMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(orderReplacedAppendage.diffFields(message.orderReplacedAppendage));
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
            orderReplacedAppendage.toFormattedString(builder, options);
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
        orderReplacedAppendage.toFormattedString(builder, nested);
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
        if (!(other instanceof OrderReplacedMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && orderReplacedAppendage.equals(message.orderReplacedAppendage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, orderReplacedAppendage);
    }
}
