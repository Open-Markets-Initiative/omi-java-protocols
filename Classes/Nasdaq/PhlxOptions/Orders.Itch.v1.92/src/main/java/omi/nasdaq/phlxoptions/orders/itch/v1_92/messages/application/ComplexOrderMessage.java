package omi.nasdaq.phlxoptions.orders.itch.v1_92.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.AllOrNoneField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.CustomerFirmIndicatorField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.DebitOrCreditField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.ExecutableOrderVolumeField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.LimitPriceField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.NumberOfLegsField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.OrderIdField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.OrderStatusField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.OrderTypeField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.OriginalOrderVolumeField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.SideField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.StrategyIdField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.TimeInForceField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.fields.UnderlyingSymbolField;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.groups.ComplexOrderLegEntry;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.groups.ComplexOrderLegList;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.structs.Timestamp;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.types.Field;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.types.Message;
import omi.nasdaq.phlxoptions.orders.itch.v1_92.types.PrintOptions;

/**
 * Represents the ComplexOrderMessage message from the Orders protocol.
 *
 * <p>When a Complex Order is received or any change is made to a complex order for an underlying, a Complex Order Message containing the order information will be sent.</p>
 */
public final class ComplexOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'X';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 49;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Complex Order Message";

    /**
     * PHLX Strategy ID assigned daily, valid while there are any open complex orders for the day
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * PHLX assigned order id
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Indicates the side of the order
     */
    private final SideField side = new SideField();

    /**
     * Original Order Volume for this order
     */
    private final OriginalOrderVolumeField originalOrderVolume = new OriginalOrderVolumeField();

    /**
     * Volume available for execution at PHLX.
     */
    private final ExecutableOrderVolumeField executableOrderVolume = new ExecutableOrderVolumeField();

    /**
     * Indicates the current status of the order
     */
    private final OrderStatusField orderStatus = new OrderStatusField();

    /**
     * Indicates the type of order
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * Limit Price of Limit or Stop Order. Otherwise field is zero.
     */
    private final LimitPriceField limitPrice = new LimitPriceField();

    /**
     * Price Debit or Credit value
     */
    private final DebitOrCreditField debitOrCredit = new DebitOrCreditField();

    /**
     * Indicates if order is All or None Order:
     */
    private final AllOrNoneField allOrNone = new AllOrNoneField();

    /**
     * Indicates duration of the order
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Indicates whether this is a Customer/Firm
     */
    private final CustomerFirmIndicatorField customerFirmIndicator = new CustomerFirmIndicatorField();

    /**
     * Underlying Symbol for the strategy. All legs in this strategy belong to this Underlying
     */
    private final UnderlyingSymbolField underlyingSymbol = new UnderlyingSymbolField();

    /**
     * Number of legs in the strategy
     */
    private final NumberOfLegsField numberOfLegs = new NumberOfLegsField();

    /**
     * Complex Order Leg Information
     */
    private final ComplexOrderLegList complexOrderLeg = new ComplexOrderLegList();

    /**
     * Time the message was sent: seconds after midnight and the nanosecond portion, U.S. Eastern Time
     */
    private final Timestamp timestampField = new Timestamp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(timestampField.fields(), List.<Field>of(strategyId), List.<Field>of(orderId), List.<Field>of(side), List.<Field>of(originalOrderVolume), List.<Field>of(executableOrderVolume), List.<Field>of(orderStatus), List.<Field>of(orderType), List.<Field>of(limitPrice), List.<Field>of(debitOrCredit), List.<Field>of(allOrNone), List.<Field>of(timeInForce), List.<Field>of(customerFirmIndicator), List.<Field>of(underlyingSymbol), List.<Field>of(numberOfLegs)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * PHLX Strategy ID assigned daily, valid while there are any open complex orders for the day
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
    }

    /**
     * PHLX assigned order id
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Indicates the side of the order
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Original Order Volume for this order
     *
     * @return the OriginalOrderVolume field
     */
    public OriginalOrderVolumeField originalOrderVolume() {
        return originalOrderVolume;
    }

    /**
     * Volume available for execution at PHLX.
     *
     * @return the ExecutableOrderVolume field
     */
    public ExecutableOrderVolumeField executableOrderVolume() {
        return executableOrderVolume;
    }

    /**
     * Indicates the current status of the order
     *
     * @return the OrderStatus field
     */
    public OrderStatusField orderStatus() {
        return orderStatus;
    }

    /**
     * Indicates the type of order
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * Limit Price of Limit or Stop Order. Otherwise field is zero.
     *
     * @return the LimitPrice field
     */
    public LimitPriceField limitPrice() {
        return limitPrice;
    }

    /**
     * Price Debit or Credit value
     *
     * @return the DebitOrCredit field
     */
    public DebitOrCreditField debitOrCredit() {
        return debitOrCredit;
    }

    /**
     * Indicates if order is All or None Order:
     *
     * @return the AllOrNone field
     */
    public AllOrNoneField allOrNone() {
        return allOrNone;
    }

    /**
     * Indicates duration of the order
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Indicates whether this is a Customer/Firm
     *
     * @return the CustomerFirmIndicator field
     */
    public CustomerFirmIndicatorField customerFirmIndicator() {
        return customerFirmIndicator;
    }

    /**
     * Underlying Symbol for the strategy. All legs in this strategy belong to this Underlying
     *
     * @return the UnderlyingSymbol field
     */
    public UnderlyingSymbolField underlyingSymbol() {
        return underlyingSymbol;
    }

    /**
     * Number of legs in the strategy
     *
     * @return the NumberOfLegs field
     */
    public NumberOfLegsField numberOfLegs() {
        return numberOfLegs;
    }

    /**
     * Complex Order Leg Information
     *
     * <p>Encode writes this list's size to the NumberOfLegs field.</p>
     *
     * @return the ComplexOrderLeg entries
     */
    public ComplexOrderLegList complexOrderLeg() {
        return complexOrderLeg;
    }

    /**
     * Time the message was sent: seconds after midnight and the nanosecond portion, U.S. Eastern Time
     *
     * @return the Timestamp record
     */
    public Timestamp timestampField() {
        return timestampField;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + complexOrderLeg.byteLength();
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
        if (!timestampField.parseFrom(data, cursor, end - 41)) {
            return false;
        }
        cursor += timestampField.byteLength();
        if (!strategyId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!originalOrderVolume.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalOrderVolumeField.BYTE_LENGTH;
        if (!executableOrderVolume.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutableOrderVolumeField.BYTE_LENGTH;
        if (!orderStatus.parse(data, cursor)) {
            return false;
        }
        cursor += OrderStatusField.BYTE_LENGTH;
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        if (!limitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LimitPriceField.BYTE_LENGTH;
        if (!debitOrCredit.parse(data, cursor)) {
            return false;
        }
        cursor += DebitOrCreditField.BYTE_LENGTH;
        if (!allOrNone.parse(data, cursor)) {
            return false;
        }
        cursor += AllOrNoneField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!customerFirmIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CustomerFirmIndicatorField.BYTE_LENGTH;
        if (!underlyingSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingSymbolField.BYTE_LENGTH;
        if (!numberOfLegs.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfLegsField.BYTE_LENGTH;
        if (!complexOrderLeg.parse(data, cursor, end, numberOfLegs.value())) {
            return false;
        }
        cursor += complexOrderLeg.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (complexOrderLeg.size() > 255) {
            throw new IllegalStateException("complexOrderLeg holds " + complexOrderLeg.size() + " entries, more than its count field can state");
        }
        numberOfLegs.value((short) complexOrderLeg.size());
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = strategyId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = originalOrderVolume.encode(data, cursor);
        cursor = executableOrderVolume.encode(data, cursor);
        cursor = orderStatus.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = limitPrice.encode(data, cursor);
        cursor = debitOrCredit.encode(data, cursor);
        cursor = allOrNone.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = customerFirmIndicator.encode(data, cursor);
        cursor = underlyingSymbol.encode(data, cursor);
        cursor = numberOfLegs.encode(data, cursor);
        cursor = complexOrderLeg.encode(data, cursor);
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
        timestampField.clear();
        complexOrderLeg.clear();
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
            if (field != numberOfLegs && !field.isRecognized()) {
                return false;
            }
        }
        return complexOrderLeg.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != numberOfLegs && !field.isValid()) {
                return false;
            }
        }
        if (!complexOrderLeg.isValid()) {
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
            return timestampField.failedAt();
        }
        if (!strategyId.isDecoded()) {
            return Optional.of(strategyId);
        }
        if (!orderId.isDecoded()) {
            return Optional.of(orderId);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!originalOrderVolume.isDecoded()) {
            return Optional.of(originalOrderVolume);
        }
        if (!executableOrderVolume.isDecoded()) {
            return Optional.of(executableOrderVolume);
        }
        if (!orderStatus.isDecoded()) {
            return Optional.of(orderStatus);
        }
        if (!orderType.isDecoded()) {
            return Optional.of(orderType);
        }
        if (!limitPrice.isDecoded()) {
            return Optional.of(limitPrice);
        }
        if (!debitOrCredit.isDecoded()) {
            return Optional.of(debitOrCredit);
        }
        if (!allOrNone.isDecoded()) {
            return Optional.of(allOrNone);
        }
        if (!timeInForce.isDecoded()) {
            return Optional.of(timeInForce);
        }
        if (!customerFirmIndicator.isDecoded()) {
            return Optional.of(customerFirmIndicator);
        }
        if (!underlyingSymbol.isDecoded()) {
            return Optional.of(underlyingSymbol);
        }
        if (!numberOfLegs.isDecoded()) {
            return Optional.of(numberOfLegs);
        }
        if (!complexOrderLeg.isDecoded()) {
            return Optional.of(complexOrderLeg.failedEntry().flatMap(ComplexOrderLegEntry::failedAt).orElse(numberOfLegs));
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
            case "StrategyId" -> Optional.of(strategyId);
            case "OrderId" -> Optional.of(orderId);
            case "Side" -> Optional.of(side);
            case "OriginalOrderVolume" -> Optional.of(originalOrderVolume);
            case "ExecutableOrderVolume" -> Optional.of(executableOrderVolume);
            case "OrderStatus" -> Optional.of(orderStatus);
            case "OrderType" -> Optional.of(orderType);
            case "LimitPrice" -> Optional.of(limitPrice);
            case "DebitOrCredit" -> Optional.of(debitOrCredit);
            case "AllOrNone" -> Optional.of(allOrNone);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "CustomerFirmIndicator" -> Optional.of(customerFirmIndicator);
            case "UnderlyingSymbol" -> Optional.of(underlyingSymbol);
            case "NumberOfLegs" -> Optional.of(numberOfLegs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ComplexOrderMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(complexOrderLeg.diffFields(message.complexOrderLeg));
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
            complexOrderLeg.toFormattedString(builder, options);
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
        complexOrderLeg.toFormattedString(builder, nested);
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
        if (!(other instanceof ComplexOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && complexOrderLeg.equals(message.complexOrderLeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, complexOrderLeg);
    }
}
