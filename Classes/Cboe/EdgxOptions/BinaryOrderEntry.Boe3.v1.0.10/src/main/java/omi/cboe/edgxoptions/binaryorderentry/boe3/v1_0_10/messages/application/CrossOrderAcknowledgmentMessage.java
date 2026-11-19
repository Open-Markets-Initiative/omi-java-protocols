package omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.AllocCntField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.AuctionIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.CrossIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.InFlightField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.OrderQtyField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.PriceField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.RequestReceivedTimeField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.RoutingFirmIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.SymbolField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.fields.TransactionTimeField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.groups.AcknowledgementAllocationEntry;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.groups.AcknowledgementAllocationList;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.types.Field;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.types.Message;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_0_10.types.PrintOptions;

/**
 * Represents the CrossOrderAcknowledgmentMessage message from the BinaryOrderEntry protocol.
 *
 * <p>OrderAcknowledgementMessage</p>
 */
public final class CrossOrderAcknowledgmentMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 71;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Cross Order Acknowledgment Message";

    /**
     * Total number of messages "in-flight" from the port
     */
    private final InFlightField inFlight = new InFlightField();

    /**
     * The exchange timestamp of the transaction
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Day-unique identifier for the cross order chosen by the member
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * Auction order identifier supplied by Cboe
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Limit price
     */
    private final PriceField price = new PriceField();

    /**
     * Entire Cboe format symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Order quantity
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Used to optionally convey the routing firm of the order
     */
    private final RoutingFirmIdField routingFirmId = new RoutingFirmIdField();

    /**
     * A hardware timestamp, populated with nanosecond precision, that
     */
    private final RequestReceivedTimeField requestReceivedTime = new RequestReceivedTimeField();

    /**
     * Number of allocation party repeating groups in the message
     */
    private final AllocCntField allocCnt = new AllocCntField();

    /**
     * Acknowledgement Allocation
     */
    private final AcknowledgementAllocationList acknowledgementAllocation = new AcknowledgementAllocationList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(inFlight, transactionTime, crossId, auctionId, price, symbol, orderQty, routingFirmId, requestReceivedTime, allocCnt);

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
     * Day-unique identifier for the cross order chosen by the member
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
    }

    /**
     * Auction order identifier supplied by Cboe
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
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
     * Used to optionally convey the routing firm of the order
     *
     * @return the RoutingFirmId field
     */
    public RoutingFirmIdField routingFirmId() {
        return routingFirmId;
    }

    /**
     * A hardware timestamp, populated with nanosecond precision, that
     *
     * @return the RequestReceivedTime field
     */
    public RequestReceivedTimeField requestReceivedTime() {
        return requestReceivedTime;
    }

    /**
     * Number of allocation party repeating groups in the message
     *
     * @return the AllocCnt field
     */
    public AllocCntField allocCnt() {
        return allocCnt;
    }

    /**
     * Acknowledgement Allocation
     *
     * <p>Encode writes this list's size to the AllocCnt field.</p>
     *
     * @return the AcknowledgementAllocation entries
     */
    public AcknowledgementAllocationList acknowledgementAllocation() {
        return acknowledgementAllocation;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + acknowledgementAllocation.byteLength();
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
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
        if (!crossId.parse(data, cursor)) {
            return false;
        }
        cursor += CrossIdField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!routingFirmId.parse(data, cursor)) {
            return false;
        }
        cursor += RoutingFirmIdField.BYTE_LENGTH;
        if (!requestReceivedTime.parse(data, cursor)) {
            return false;
        }
        cursor += RequestReceivedTimeField.BYTE_LENGTH;
        if (!allocCnt.parse(data, cursor)) {
            return false;
        }
        cursor += AllocCntField.BYTE_LENGTH;
        if (!acknowledgementAllocation.parse(data, cursor, end, allocCnt.value())) {
            return false;
        }
        cursor += acknowledgementAllocation.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (acknowledgementAllocation.size() > 255) {
            throw new IllegalStateException("acknowledgementAllocation holds " + acknowledgementAllocation.size() + " entries, more than its count field can state");
        }
        allocCnt.value((short) acknowledgementAllocation.size());
        int cursor = offset;
        cursor = inFlight.encode(data, cursor);
        cursor = transactionTime.encode(data, cursor);
        cursor = crossId.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = routingFirmId.encode(data, cursor);
        cursor = requestReceivedTime.encode(data, cursor);
        cursor = allocCnt.encode(data, cursor);
        cursor = acknowledgementAllocation.encode(data, cursor);
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
        acknowledgementAllocation.clear();
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
            if (field != allocCnt && !field.isRecognized()) {
                return false;
            }
        }
        return acknowledgementAllocation.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != allocCnt && !field.isValid()) {
                return false;
            }
        }
        if (!acknowledgementAllocation.isValid()) {
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
        if (!inFlight.isDecoded()) {
            return Optional.of(inFlight);
        }
        if (!transactionTime.isDecoded()) {
            return Optional.of(transactionTime);
        }
        if (!crossId.isDecoded()) {
            return Optional.of(crossId);
        }
        if (!auctionId.isDecoded()) {
            return Optional.of(auctionId);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (!routingFirmId.isDecoded()) {
            return Optional.of(routingFirmId);
        }
        if (!requestReceivedTime.isDecoded()) {
            return Optional.of(requestReceivedTime);
        }
        if (!allocCnt.isDecoded()) {
            return Optional.of(allocCnt);
        }
        if (!acknowledgementAllocation.isDecoded()) {
            return Optional.of(acknowledgementAllocation.failedEntry().flatMap(AcknowledgementAllocationEntry::failedAt).orElse(allocCnt));
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
            case "CrossId" -> Optional.of(crossId);
            case "AuctionId" -> Optional.of(auctionId);
            case "Price" -> Optional.of(price);
            case "Symbol" -> Optional.of(symbol);
            case "OrderQty" -> Optional.of(orderQty);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "RequestReceivedTime" -> Optional.of(requestReceivedTime);
            case "AllocCnt" -> Optional.of(allocCnt);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CrossOrderAcknowledgmentMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(acknowledgementAllocation.diffFields(message.acknowledgementAllocation));
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
            acknowledgementAllocation.toFormattedString(builder, options);
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
        acknowledgementAllocation.toFormattedString(builder, nested);
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
        if (!(other instanceof CrossOrderAcknowledgmentMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && acknowledgementAllocation.equals(message.acknowledgementAllocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, acknowledgementAllocation);
    }
}
