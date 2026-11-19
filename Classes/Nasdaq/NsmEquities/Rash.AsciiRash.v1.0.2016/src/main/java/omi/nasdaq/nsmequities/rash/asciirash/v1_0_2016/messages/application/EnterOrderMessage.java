package omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.CapacityRule80AIndicatorField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.CustTerminalIdSenderSubIdField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.CustomerTypeField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.DiscretionPegDifferenceField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.DiscretionPegDifferenceSignField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.DiscretionPegTypeField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.DiscretionPriceField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.DisplayField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.FirmClientIdField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.MaxFloorField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.MinQtyField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.OrderTokenClientOrderIdField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.PegDifferenceField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.PegDifferenceSignField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.PegTypeField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.PriceField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.RandomReserveField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.RouteDestExecBrokerField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.SharesOrderQtyField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.SideField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.StockSymbolField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.fields.TimeInForceField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.types.Field;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.types.Message;
import omi.nasdaq.nsmequities.rash.asciirash.v1_0_2016.types.PrintOptions;

/**
 * Represents the EnterOrderMessage message from the Rash protocol.
 *
 * <p>The Enter Order Message lets you enter a new order. Each new order must have a Token that is unique to the day and that logical RASH Port account. If you send a valid order, you should receive an Accepted Order Message.</p>
 */
public final class EnterOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'O';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 137;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Enter Order Message";

    /**
     * Token must be day unique for each RASH port account.
     */
    private final OrderTokenClientOrderIdField orderTokenClientOrderId = new OrderTokenClientOrderIdField();

    /**
     * B/S/T/E: Buy, Sell, Short, Short Exempt. For sell short and sell short exempt, the subscriber affirms the ability to borrow securities in good deliverable form for delivery within three business days.
     */
    private final SideField side = new SideField();

    /**
     * Total number of shares entered. Must be greater than zero.
     */
    private final SharesOrderQtyField sharesOrderQty = new SharesOrderQtyField();

    /**
     * Stock symbol.
     */
    private final StockSymbolField stockSymbol = new StockSymbolField();

    /**
     * Price, 6 whole and 4 implied decimal digits.
     */
    private final PriceField price = new PriceField();

    /**
     * The number of seconds that this order should live before being automatically canceled; special values (0 = Immediate or Cancel, 99998 = Market Day, 99999 = system day and the others the document lists) are listed in section 2.1.1.
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * MPID.
     */
    private final FirmClientIdField firmClientId = new FirmClientIdField();

    /**
     * Display instruction; see the Display values.
     */
    private final DisplayField display = new DisplayField();

    /**
     * Minimum fill amount allowed.
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * Shares to display. If zero this field will default to the order quantity. Use the display field to specify a hidden order.
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * Peg type.
     */
    private final PegTypeField pegType = new PegTypeField();

    /**
     * + or -. If peg type is set to N, specify +.
     */
    private final PegDifferenceSignField pegDifferenceSign = new PegDifferenceSignField();

    /**
     * Amount; 6.4 (implied decimal). If peg type is set to N, specify 0.
     */
    private final PegDifferenceField pegDifference = new PegDifferenceField();

    /**
     * Discretion Price for Discretionary Order. If set to 0, this order does not have discretion.
     */
    private final DiscretionPriceField discretionPrice = new DiscretionPriceField();

    /**
     * Discretion peg type.
     */
    private final DiscretionPegTypeField discretionPegType = new DiscretionPegTypeField();

    /**
     * + or -. If peg type is set to N, specify +.
     */
    private final DiscretionPegDifferenceSignField discretionPegDifferenceSign = new DiscretionPegDifferenceSignField();

    /**
     * Amount; 6.4 (implied decimal). If peg type is set to N, specify 0.
     */
    private final DiscretionPegDifferenceField discretionPegDifference = new DiscretionPegDifferenceField();

    /**
     * Capacity code.
     */
    private final CapacityRule80AIndicatorField capacityRule80AIndicator = new CapacityRule80AIndicatorField();

    /**
     * Shares to do random reserve with.
     */
    private final RandomReserveField randomReserve = new RandomReserveField();

    /**
     * Target ID: a routing strategy or a directed order destination code.
     */
    private final RouteDestExecBrokerField routeDestExecBroker = new RouteDestExecBrokerField();

    /**
     * Client initiated; pass-thru. Must be left-justified.
     */
    private final CustTerminalIdSenderSubIdField custTerminalIdSenderSubId = new CustTerminalIdSenderSubIdField();

    /**
     * Indicates if the order is a retail designated order (optional field).
     */
    private final CustomerTypeField customerType = new CustomerTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(orderTokenClientOrderId, side, sharesOrderQty, stockSymbol, price, timeInForce, firmClientId, display, minQty, maxFloor, pegType, pegDifferenceSign, pegDifference, discretionPrice, discretionPegType, discretionPegDifferenceSign, discretionPegDifference, capacityRule80AIndicator, randomReserve, routeDestExecBroker, custTerminalIdSenderSubId, customerType);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Token must be day unique for each RASH port account.
     *
     * @return the OrderTokenClientOrderId field
     */
    public OrderTokenClientOrderIdField orderTokenClientOrderId() {
        return orderTokenClientOrderId;
    }

    /**
     * B/S/T/E: Buy, Sell, Short, Short Exempt. For sell short and sell short exempt, the subscriber affirms the ability to borrow securities in good deliverable form for delivery within three business days.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Total number of shares entered. Must be greater than zero.
     *
     * @return the SharesOrderQty field
     */
    public SharesOrderQtyField sharesOrderQty() {
        return sharesOrderQty;
    }

    /**
     * Stock symbol.
     *
     * @return the StockSymbol field
     */
    public StockSymbolField stockSymbol() {
        return stockSymbol;
    }

    /**
     * Price, 6 whole and 4 implied decimal digits.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The number of seconds that this order should live before being automatically canceled; special values (0 = Immediate or Cancel, 99998 = Market Day, 99999 = system day and the others the document lists) are listed in section 2.1.1.
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * MPID.
     *
     * @return the FirmClientId field
     */
    public FirmClientIdField firmClientId() {
        return firmClientId;
    }

    /**
     * Display instruction; see the Display values.
     *
     * @return the Display field
     */
    public DisplayField display() {
        return display;
    }

    /**
     * Minimum fill amount allowed.
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
    }

    /**
     * Shares to display. If zero this field will default to the order quantity. Use the display field to specify a hidden order.
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
    }

    /**
     * Peg type.
     *
     * @return the PegType field
     */
    public PegTypeField pegType() {
        return pegType;
    }

    /**
     * + or -. If peg type is set to N, specify +.
     *
     * @return the PegDifferenceSign field
     */
    public PegDifferenceSignField pegDifferenceSign() {
        return pegDifferenceSign;
    }

    /**
     * Amount; 6.4 (implied decimal). If peg type is set to N, specify 0.
     *
     * @return the PegDifference field
     */
    public PegDifferenceField pegDifference() {
        return pegDifference;
    }

    /**
     * Discretion Price for Discretionary Order. If set to 0, this order does not have discretion.
     *
     * @return the DiscretionPrice field
     */
    public DiscretionPriceField discretionPrice() {
        return discretionPrice;
    }

    /**
     * Discretion peg type.
     *
     * @return the DiscretionPegType field
     */
    public DiscretionPegTypeField discretionPegType() {
        return discretionPegType;
    }

    /**
     * + or -. If peg type is set to N, specify +.
     *
     * @return the DiscretionPegDifferenceSign field
     */
    public DiscretionPegDifferenceSignField discretionPegDifferenceSign() {
        return discretionPegDifferenceSign;
    }

    /**
     * Amount; 6.4 (implied decimal). If peg type is set to N, specify 0.
     *
     * @return the DiscretionPegDifference field
     */
    public DiscretionPegDifferenceField discretionPegDifference() {
        return discretionPegDifference;
    }

    /**
     * Capacity code.
     *
     * @return the CapacityRule80AIndicator field
     */
    public CapacityRule80AIndicatorField capacityRule80AIndicator() {
        return capacityRule80AIndicator;
    }

    /**
     * Shares to do random reserve with.
     *
     * @return the RandomReserve field
     */
    public RandomReserveField randomReserve() {
        return randomReserve;
    }

    /**
     * Target ID: a routing strategy or a directed order destination code.
     *
     * @return the RouteDestExecBroker field
     */
    public RouteDestExecBrokerField routeDestExecBroker() {
        return routeDestExecBroker;
    }

    /**
     * Client initiated; pass-thru. Must be left-justified.
     *
     * @return the CustTerminalIdSenderSubId field
     */
    public CustTerminalIdSenderSubIdField custTerminalIdSenderSubId() {
        return custTerminalIdSenderSubId;
    }

    /**
     * Indicates if the order is a retail designated order (optional field).
     *
     * @return the CustomerType field
     */
    public CustomerTypeField customerType() {
        return customerType;
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
        if (!orderTokenClientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTokenClientOrderIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!sharesOrderQty.parse(data, cursor)) {
            return false;
        }
        cursor += SharesOrderQtyField.BYTE_LENGTH;
        if (!stockSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += StockSymbolField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!firmClientId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmClientIdField.BYTE_LENGTH;
        if (!display.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayField.BYTE_LENGTH;
        if (!minQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinQtyField.BYTE_LENGTH;
        if (!maxFloor.parse(data, cursor)) {
            return false;
        }
        cursor += MaxFloorField.BYTE_LENGTH;
        if (!pegType.parse(data, cursor)) {
            return false;
        }
        cursor += PegTypeField.BYTE_LENGTH;
        if (!pegDifferenceSign.parse(data, cursor)) {
            return false;
        }
        cursor += PegDifferenceSignField.BYTE_LENGTH;
        if (!pegDifference.parse(data, cursor)) {
            return false;
        }
        cursor += PegDifferenceField.BYTE_LENGTH;
        if (!discretionPrice.parse(data, cursor)) {
            return false;
        }
        cursor += DiscretionPriceField.BYTE_LENGTH;
        if (!discretionPegType.parse(data, cursor)) {
            return false;
        }
        cursor += DiscretionPegTypeField.BYTE_LENGTH;
        if (!discretionPegDifferenceSign.parse(data, cursor)) {
            return false;
        }
        cursor += DiscretionPegDifferenceSignField.BYTE_LENGTH;
        if (!discretionPegDifference.parse(data, cursor)) {
            return false;
        }
        cursor += DiscretionPegDifferenceField.BYTE_LENGTH;
        if (!capacityRule80AIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityRule80AIndicatorField.BYTE_LENGTH;
        if (!randomReserve.parse(data, cursor)) {
            return false;
        }
        cursor += RandomReserveField.BYTE_LENGTH;
        if (!routeDestExecBroker.parse(data, cursor)) {
            return false;
        }
        cursor += RouteDestExecBrokerField.BYTE_LENGTH;
        if (!custTerminalIdSenderSubId.parse(data, cursor)) {
            return false;
        }
        cursor += CustTerminalIdSenderSubIdField.BYTE_LENGTH;
        return customerType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = orderTokenClientOrderId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = sharesOrderQty.encode(data, cursor);
        cursor = stockSymbol.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = firmClientId.encode(data, cursor);
        cursor = display.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = maxFloor.encode(data, cursor);
        cursor = pegType.encode(data, cursor);
        cursor = pegDifferenceSign.encode(data, cursor);
        cursor = pegDifference.encode(data, cursor);
        cursor = discretionPrice.encode(data, cursor);
        cursor = discretionPegType.encode(data, cursor);
        cursor = discretionPegDifferenceSign.encode(data, cursor);
        cursor = discretionPegDifference.encode(data, cursor);
        cursor = capacityRule80AIndicator.encode(data, cursor);
        cursor = randomReserve.encode(data, cursor);
        cursor = routeDestExecBroker.encode(data, cursor);
        cursor = custTerminalIdSenderSubId.encode(data, cursor);
        cursor = customerType.encode(data, cursor);
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
            case "OrderTokenClientOrderId" -> Optional.of(orderTokenClientOrderId);
            case "Side" -> Optional.of(side);
            case "SharesOrderQty" -> Optional.of(sharesOrderQty);
            case "StockSymbol" -> Optional.of(stockSymbol);
            case "Price" -> Optional.of(price);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "FirmClientId" -> Optional.of(firmClientId);
            case "Display" -> Optional.of(display);
            case "MinQty" -> Optional.of(minQty);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "PegType" -> Optional.of(pegType);
            case "PegDifferenceSign" -> Optional.of(pegDifferenceSign);
            case "PegDifference" -> Optional.of(pegDifference);
            case "DiscretionPrice" -> Optional.of(discretionPrice);
            case "DiscretionPegType" -> Optional.of(discretionPegType);
            case "DiscretionPegDifferenceSign" -> Optional.of(discretionPegDifferenceSign);
            case "DiscretionPegDifference" -> Optional.of(discretionPegDifference);
            case "CapacityRule80AIndicator" -> Optional.of(capacityRule80AIndicator);
            case "RandomReserve" -> Optional.of(randomReserve);
            case "RouteDestExecBroker" -> Optional.of(routeDestExecBroker);
            case "CustTerminalIdSenderSubId" -> Optional.of(custTerminalIdSenderSubId);
            case "CustomerType" -> Optional.of(customerType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EnterOrderMessage message)) {
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
        if (!(other instanceof EnterOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
