package omi.nasdaq.phlxoptions.orders.itch.v1_9.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.fields.AllOrNoneField;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.fields.CustomerFirmIndicatorField;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.fields.ExecutableOrderVolumeField;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.fields.ExpirationField;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.fields.ExplicitStrikePriceField;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.fields.LimitPriceField;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.fields.MarketQualifierField;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.fields.OpenCloseIndicatorField;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.fields.OptionIdField;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.fields.OptionTypeField;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.fields.OrderIdField;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.fields.OrderStatusField;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.fields.OrderTypeField;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.fields.OriginalOrderVolumeField;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.fields.SecuritySymbolField;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.fields.SideField;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.fields.TimeInForceField;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.structs.Timestamp;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.types.Field;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.types.Message;
import omi.nasdaq.phlxoptions.orders.itch.v1_9.types.PrintOptions;

/**
 * Represents the SimpleOrderMessage message from the Orders protocol.
 *
 * <p>When a Single Order is received or any change is made to an order, an Order message containing the current order status will be sent.</p>
 */
public final class SimpleOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'O';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 48;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Simple Order Message";

    /**
     * PHLX Option ID assigned daily, valid for the trading day
     */
    private final OptionIdField optionId = new OptionIdField();

    /**
     * Denotes the option symbol (security symbol) post-symbology rollout. Denotes the root portion of the OPRA symbol pre-symbology rollout
     */
    private final SecuritySymbolField securitySymbol = new SecuritySymbolField();

    /**
     * Expiration Year, Month and Day Bitfield
     */
    private final ExpirationField expiration = new ExpirationField();

    /**
     * Denotes the explicit strike price of the option. Refer to Data Types for field processing notes.
     */
    private final ExplicitStrikePriceField explicitStrikePrice = new ExplicitStrikePriceField();

    /**
     * Option Type
     */
    private final OptionTypeField optionType = new OptionTypeField();

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
     * Market Qualifier value
     */
    private final MarketQualifierField marketQualifier = new MarketQualifierField();

    /**
     * Limit Price of Limit or Stop Order. Otherwise field is zero.
     */
    private final LimitPriceField limitPrice = new LimitPriceField();

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
     * Indicates whether this Order opens or closes a position
     */
    private final OpenCloseIndicatorField openCloseIndicator = new OpenCloseIndicatorField();

    /**
     * Time the message was sent: seconds after midnight and the nanosecond portion, U.S. Eastern Time
     */
    private final Timestamp timestampField = new Timestamp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(timestampField.fields(), List.<Field>of(optionId), List.<Field>of(securitySymbol), List.<Field>of(expiration), List.<Field>of(explicitStrikePrice), List.<Field>of(optionType), List.<Field>of(orderId), List.<Field>of(side), List.<Field>of(originalOrderVolume), List.<Field>of(executableOrderVolume), List.<Field>of(orderStatus), List.<Field>of(orderType), List.<Field>of(marketQualifier), List.<Field>of(limitPrice), List.<Field>of(allOrNone), List.<Field>of(timeInForce), List.<Field>of(customerFirmIndicator), List.<Field>of(openCloseIndicator)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * PHLX Option ID assigned daily, valid for the trading day
     *
     * @return the OptionId field
     */
    public OptionIdField optionId() {
        return optionId;
    }

    /**
     * Denotes the option symbol (security symbol) post-symbology rollout. Denotes the root portion of the OPRA symbol pre-symbology rollout
     *
     * @return the SecuritySymbol field
     */
    public SecuritySymbolField securitySymbol() {
        return securitySymbol;
    }

    /**
     * Expiration Year, Month and Day Bitfield
     *
     * @return the Expiration field
     */
    public ExpirationField expiration() {
        return expiration;
    }

    /**
     * Denotes the explicit strike price of the option. Refer to Data Types for field processing notes.
     *
     * @return the ExplicitStrikePrice field
     */
    public ExplicitStrikePriceField explicitStrikePrice() {
        return explicitStrikePrice;
    }

    /**
     * Option Type
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
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
     * Market Qualifier value
     *
     * @return the MarketQualifier field
     */
    public MarketQualifierField marketQualifier() {
        return marketQualifier;
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
     * Indicates whether this Order opens or closes a position
     *
     * @return the OpenCloseIndicator field
     */
    public OpenCloseIndicatorField openCloseIndicator() {
        return openCloseIndicator;
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
        if (!timestampField.parseFrom(data, cursor, end - 40)) {
            return false;
        }
        cursor += timestampField.byteLength();
        if (!optionId.parse(data, cursor)) {
            return false;
        }
        cursor += OptionIdField.BYTE_LENGTH;
        if (!securitySymbol.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySymbolField.BYTE_LENGTH;
        if (!expiration.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationField.BYTE_LENGTH;
        if (!explicitStrikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ExplicitStrikePriceField.BYTE_LENGTH;
        if (!optionType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionTypeField.BYTE_LENGTH;
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
        if (!marketQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += MarketQualifierField.BYTE_LENGTH;
        if (!limitPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LimitPriceField.BYTE_LENGTH;
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
        return openCloseIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = optionId.encode(data, cursor);
        cursor = securitySymbol.encode(data, cursor);
        cursor = expiration.encode(data, cursor);
        cursor = explicitStrikePrice.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = originalOrderVolume.encode(data, cursor);
        cursor = executableOrderVolume.encode(data, cursor);
        cursor = orderStatus.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = marketQualifier.encode(data, cursor);
        cursor = limitPrice.encode(data, cursor);
        cursor = allOrNone.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = customerFirmIndicator.encode(data, cursor);
        cursor = openCloseIndicator.encode(data, cursor);
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
        timestampField.clear();
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
            case "OptionId" -> Optional.of(optionId);
            case "SecuritySymbol" -> Optional.of(securitySymbol);
            case "Expiration" -> Optional.of(expiration);
            case "ExplicitStrikePrice" -> Optional.of(explicitStrikePrice);
            case "OptionType" -> Optional.of(optionType);
            case "OrderId" -> Optional.of(orderId);
            case "Side" -> Optional.of(side);
            case "OriginalOrderVolume" -> Optional.of(originalOrderVolume);
            case "ExecutableOrderVolume" -> Optional.of(executableOrderVolume);
            case "OrderStatus" -> Optional.of(orderStatus);
            case "OrderType" -> Optional.of(orderType);
            case "MarketQualifier" -> Optional.of(marketQualifier);
            case "LimitPrice" -> Optional.of(limitPrice);
            case "AllOrNone" -> Optional.of(allOrNone);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "CustomerFirmIndicator" -> Optional.of(customerFirmIndicator);
            case "OpenCloseIndicator" -> Optional.of(openCloseIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SimpleOrderMessage message)) {
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
        if (!(other instanceof SimpleOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
