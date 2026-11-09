package omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.CancelReasonField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.ClientOrderIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.CorrelationIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.ExecIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.InstrumentIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.OrderIdField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.PriceField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.ReceiveTimeField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.SideField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.StatusField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.fields.TimestampField;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.NewOrderResponseMessageFillsGroups;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.NewOrderResponseMessageLegsGroups;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.Quantity;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.TotalFilled;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.structs.VisibleQty;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.Field;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.Message;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.PrintOptions;

/**
 * Represents the NewOrderResponseMessage message from the OrdersApi protocol.
 *
 * <p>NewOrderResponseMessage</p>
 */
public final class NewOrderResponseMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 102;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Response Message";

    /**
     * timestamp
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * execId
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * clientOrderId
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * correlationId
     */
    private final CorrelationIdField correlationId = new CorrelationIdField();

    /**
     * orderId
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * price
     */
    private final PriceField price = new PriceField();

    /**
     * receiveTime
     */
    private final ReceiveTimeField receiveTime = new ReceiveTimeField();

    /**
     * side
     */
    private final SideField side = new SideField();

    /**
     * status
     */
    private final StatusField status = new StatusField();

    /**
     * cancelReason
     */
    private final CancelReasonField cancelReason = new CancelReasonField();

    /**
     * NewOrderRequestMessage
     */
    private final Quantity quantity = new Quantity();

    /**
     * NewOrderResponseMessage
     */
    private final TotalFilled totalFilled = new TotalFilled();

    /**
     * NewOrderResponseMessage
     */
    private final VisibleQty visibleQty = new VisibleQty();

    /**
     * fills Block
     */
    private final NewOrderResponseMessageFillsGroups newOrderResponseMessageFillsGroups = new NewOrderResponseMessageFillsGroups();

    /**
     * legs Block
     */
    private final NewOrderResponseMessageLegsGroups newOrderResponseMessageLegsGroups = new NewOrderResponseMessageLegsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(timestampField), List.<Field>of(execId), List.<Field>of(clientOrderId), List.<Field>of(correlationId), List.<Field>of(orderId), List.<Field>of(instrumentId), List.<Field>of(price), quantity.fields(), totalFilled.fields(), visibleQty.fields(), List.<Field>of(receiveTime), List.<Field>of(side), List.<Field>of(status), List.<Field>of(cancelReason)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * timestamp
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * execId
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * clientOrderId
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * correlationId
     *
     * @return the CorrelationId field
     */
    public CorrelationIdField correlationId() {
        return correlationId;
    }

    /**
     * orderId
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * instrumentId
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * receiveTime
     *
     * @return the ReceiveTime field
     */
    public ReceiveTimeField receiveTime() {
        return receiveTime;
    }

    /**
     * side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * status
     *
     * @return the Status field
     */
    public StatusField status() {
        return status;
    }

    /**
     * cancelReason
     *
     * @return the CancelReason field
     */
    public CancelReasonField cancelReason() {
        return cancelReason;
    }

    /**
     * NewOrderRequestMessage
     *
     * @return the Quantity record
     */
    public Quantity quantity() {
        return quantity;
    }

    /**
     * NewOrderResponseMessage
     *
     * @return the TotalFilled record
     */
    public TotalFilled totalFilled() {
        return totalFilled;
    }

    /**
     * NewOrderResponseMessage
     *
     * @return the VisibleQty record
     */
    public VisibleQty visibleQty() {
        return visibleQty;
    }

    /**
     * fills Block
     *
     * @return the NewOrderResponseMessageFillsGroups record
     */
    public NewOrderResponseMessageFillsGroups newOrderResponseMessageFillsGroups() {
        return newOrderResponseMessageFillsGroups;
    }

    /**
     * legs Block
     *
     * @return the NewOrderResponseMessageLegsGroups record
     */
    public NewOrderResponseMessageLegsGroups newOrderResponseMessageLegsGroups() {
        return newOrderResponseMessageLegsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + newOrderResponseMessageFillsGroups.byteLength() - NewOrderResponseMessageFillsGroups.MINIMUM_BYTE_LENGTH + newOrderResponseMessageLegsGroups.byteLength() - NewOrderResponseMessageLegsGroups.MINIMUM_BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        for (int[] run = Quantity.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += Quantity.BYTE_LENGTH;
        for (int[] run = TotalFilled.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += TotalFilled.BYTE_LENGTH;
        for (int[] run = VisibleQty.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += VisibleQty.BYTE_LENGTH;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor = newOrderResponseMessageFillsGroups.padding(runs, cursor);
        cursor = newOrderResponseMessageLegsGroups.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(timestampField.value());
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
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!correlationId.parse(data, cursor)) {
            return false;
        }
        cursor += CorrelationIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!quantity.parseFrom(data, cursor, end - 37)) {
            return false;
        }
        cursor += quantity.byteLength();
        if (!totalFilled.parseFrom(data, cursor, end - 28)) {
            return false;
        }
        cursor += totalFilled.byteLength();
        if (!visibleQty.parseFrom(data, cursor, end - 19)) {
            return false;
        }
        cursor += visibleQty.byteLength();
        if (!receiveTime.parse(data, cursor)) {
            return false;
        }
        cursor += ReceiveTimeField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!status.parse(data, cursor)) {
            return false;
        }
        cursor += StatusField.BYTE_LENGTH;
        if (!cancelReason.parse(data, cursor)) {
            return false;
        }
        cursor += CancelReasonField.BYTE_LENGTH;
        if (!newOrderResponseMessageFillsGroups.parseFrom(data, cursor, end - 4)) {
            return false;
        }
        cursor += newOrderResponseMessageFillsGroups.byteLength();
        if (end - cursor < 4) {
            return false;
        }
        if (!newOrderResponseMessageLegsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += newOrderResponseMessageLegsGroups.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = correlationId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = totalFilled.encode(data, cursor);
        cursor = visibleQty.encode(data, cursor);
        cursor = receiveTime.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = status.encode(data, cursor);
        cursor = cancelReason.encode(data, cursor);
        cursor = newOrderResponseMessageFillsGroups.encode(data, cursor);
        cursor = newOrderResponseMessageLegsGroups.encode(data, cursor);
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
        quantity.clear();
        totalFilled.clear();
        visibleQty.clear();
        newOrderResponseMessageFillsGroups.clear();
        newOrderResponseMessageLegsGroups.clear();
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
            if (!field.isRecognized()) {
                return false;
            }
        }
        if (!newOrderResponseMessageFillsGroups.isRecognized()) {
            return false;
        }
        if (!newOrderResponseMessageLegsGroups.isRecognized()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!newOrderResponseMessageFillsGroups.isValid()) {
            return false;
        }
        if (!newOrderResponseMessageLegsGroups.isValid()) {
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
        if (!execId.isDecoded()) {
            return Optional.of(execId);
        }
        if (!clientOrderId.isDecoded()) {
            return Optional.of(clientOrderId);
        }
        if (!correlationId.isDecoded()) {
            return Optional.of(correlationId);
        }
        if (!orderId.isDecoded()) {
            return Optional.of(orderId);
        }
        if (!instrumentId.isDecoded()) {
            return Optional.of(instrumentId);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!quantity.isDecoded()) {
            return quantity.failedAt();
        }
        if (!totalFilled.isDecoded()) {
            return totalFilled.failedAt();
        }
        if (!visibleQty.isDecoded()) {
            return visibleQty.failedAt();
        }
        if (!receiveTime.isDecoded()) {
            return Optional.of(receiveTime);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!status.isDecoded()) {
            return Optional.of(status);
        }
        if (!cancelReason.isDecoded()) {
            return Optional.of(cancelReason);
        }
        if (!newOrderResponseMessageFillsGroups.isDecoded()) {
            return newOrderResponseMessageFillsGroups.failedAt();
        }
        if (!newOrderResponseMessageLegsGroups.isDecoded()) {
            return newOrderResponseMessageLegsGroups.failedAt();
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
            case "ExecId" -> Optional.of(execId);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "CorrelationId" -> Optional.of(correlationId);
            case "OrderId" -> Optional.of(orderId);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "Price" -> Optional.of(price);
            case "ReceiveTime" -> Optional.of(receiveTime);
            case "Side" -> Optional.of(side);
            case "Status" -> Optional.of(status);
            case "CancelReason" -> Optional.of(cancelReason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderResponseMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(newOrderResponseMessageFillsGroups.diffFields(message.newOrderResponseMessageFillsGroups));
        changed.addAll(newOrderResponseMessageLegsGroups.diffFields(message.newOrderResponseMessageLegsGroups));
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
            newOrderResponseMessageFillsGroups.toFormattedString(builder, options);
            builder.append(", ");
            newOrderResponseMessageLegsGroups.toFormattedString(builder, options);
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
        newOrderResponseMessageFillsGroups.toFormattedString(builder, nested);
        newOrderResponseMessageLegsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof NewOrderResponseMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && newOrderResponseMessageFillsGroups.equals(message.newOrderResponseMessageFillsGroups) && newOrderResponseMessageLegsGroups.equals(message.newOrderResponseMessageLegsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, newOrderResponseMessageFillsGroups, newOrderResponseMessageLegsGroups);
    }
}
