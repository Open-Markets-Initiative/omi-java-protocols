package omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.BaseLiquidityIndicatorField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.ClOrdIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.ClearingFirmField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.DisplayPriceField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.InFlightField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.LeavesQtyField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.MaxFloorField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.OrdTypeField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.OrderIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.OrderQtyField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.OrigClOrdIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.PriceField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.RequestReceivedTimeField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.RoutingFirmIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.SecondaryOrderIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.StopPxField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.SymbolField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.TransactionTimeField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.fields.WorkingPriceField;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.types.Field;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.types.Message;
import omi.cboe.bzxoptions.binaryorderentry.boe3.v1_0_10.types.PrintOptions;

/**
 * Represents the OrderModifiedMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Order Modified messages are sent in response to a Modify Request message to indicate that the order has been successfully modified</p>
 */
public final class OrderModifiedMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 136;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Modified Message";

    /**
     * Total number of messages "in-flight" from the port
     */
    private final InFlightField inFlight = new InFlightField();

    /**
     * The exchange timestamp of the transaction
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * ID chosen by the client
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * OrigClOrdID
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Order identifier supplied by Cboe
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * EFID that will clear the trade
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Used to optionally convey the routing firm of the order
     */
    private final RoutingFirmIdField routingFirmId = new RoutingFirmIdField();

    /**
     * Entire Cboe format symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Order quantity
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Limit price
     */
    private final PriceField price = new PriceField();

    /**
     * OrdType
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Portion of OrderQty to display
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * Stop price
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Quantity still open for further execution
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Only present when order is fully or partially booked
     */
    private final DisplayPriceField displayPrice = new DisplayPriceField();

    /**
     * If price had to be adjusted to a less aggressive value for some reason, the adjusted price will be reported here, otherwise equals price
     */
    private final WorkingPriceField workingPrice = new WorkingPriceField();

    /**
     * Indicates whether the trade added or removed liquidity
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Denotes an alternative OrderID which is present on Cboe market data
     */
    private final SecondaryOrderIdField secondaryOrderId = new SecondaryOrderIdField();

    /**
     * A hardware timestamp, populated with nanosecond precision, that
     */
    private final RequestReceivedTimeField requestReceivedTime = new RequestReceivedTimeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(inFlight, transactionTime, clOrdId, origClOrdId, orderId, clearingFirm, routingFirmId, symbol, orderQty, price, ordType, maxFloor, stopPx, leavesQty, displayPrice, workingPrice, baseLiquidityIndicator, secondaryOrderId, requestReceivedTime);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Total number of messages "in-flight" from the port
     *
     * @return the InFlight field
     */
    public InFlightField inFlight() {
        return inFlight;
    }

    /**
     * The exchange timestamp of the transaction
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * ID chosen by the client
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * OrigClOrdID
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * Order identifier supplied by Cboe
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * EFID that will clear the trade
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Used to optionally convey the routing firm of the order
     *
     * @return the RoutingFirmId field
     */
    public RoutingFirmIdField routingFirmId() {
        return routingFirmId;
    }

    /**
     * Entire Cboe format symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Order quantity
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Limit price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * OrdType
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * Portion of OrderQty to display
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
    }

    /**
     * Stop price
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * Quantity still open for further execution
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Only present when order is fully or partially booked
     *
     * @return the DisplayPrice field
     */
    public DisplayPriceField displayPrice() {
        return displayPrice;
    }

    /**
     * If price had to be adjusted to a less aggressive value for some reason, the adjusted price will be reported here, otherwise equals price
     *
     * @return the WorkingPrice field
     */
    public WorkingPriceField workingPrice() {
        return workingPrice;
    }

    /**
     * Indicates whether the trade added or removed liquidity
     *
     * @return the BaseLiquidityIndicator field
     */
    public BaseLiquidityIndicatorField baseLiquidityIndicator() {
        return baseLiquidityIndicator;
    }

    /**
     * Denotes an alternative OrderID which is present on Cboe market data
     *
     * @return the SecondaryOrderId field
     */
    public SecondaryOrderIdField secondaryOrderId() {
        return secondaryOrderId;
    }

    /**
     * A hardware timestamp, populated with nanosecond precision, that
     *
     * @return the RequestReceivedTime field
     */
    public RequestReceivedTimeField requestReceivedTime() {
        return requestReceivedTime;
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
        return Optional.ofNullable(transactionTime.value());
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
        if (!inFlight.parse(data, cursor)) {
            return false;
        }
        cursor += InFlightField.BYTE_LENGTH;
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!routingFirmId.parse(data, cursor)) {
            return false;
        }
        cursor += RoutingFirmIdField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
        if (!maxFloor.parse(data, cursor)) {
            return false;
        }
        cursor += MaxFloorField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!displayPrice.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayPriceField.BYTE_LENGTH;
        if (!workingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += WorkingPriceField.BYTE_LENGTH;
        if (!baseLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
        if (!secondaryOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryOrderIdField.BYTE_LENGTH;
        return requestReceivedTime.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = inFlight.encode(data, cursor);
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = routingFirmId.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = maxFloor.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = displayPrice.encode(data, cursor);
        cursor = workingPrice.encode(data, cursor);
        cursor = baseLiquidityIndicator.encode(data, cursor);
        cursor = secondaryOrderId.encode(data, cursor);
        cursor = requestReceivedTime.encode(data, cursor);
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
            case "InFlight" -> Optional.of(inFlight);
            case "TransactionTime" -> Optional.of(transactionTime);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "OrderId" -> Optional.of(orderId);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "Symbol" -> Optional.of(symbol);
            case "OrderQty" -> Optional.of(orderQty);
            case "Price" -> Optional.of(price);
            case "OrdType" -> Optional.of(ordType);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "StopPx" -> Optional.of(stopPx);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "DisplayPrice" -> Optional.of(displayPrice);
            case "WorkingPrice" -> Optional.of(workingPrice);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "SecondaryOrderId" -> Optional.of(secondaryOrderId);
            case "RequestReceivedTime" -> Optional.of(requestReceivedTime);
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
