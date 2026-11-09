package omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.fields.AvailableQtyField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.fields.ClientOrderIdField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.fields.CorrelationIdField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.fields.ExecIdField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.fields.FillPriceField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.fields.FillQtyField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.fields.FilledVwapField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.fields.InstrumentIdField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.fields.IsAggressorField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.fields.MatchIdField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.fields.OrderIdField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.fields.TimestampField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.fields.TotalFilledField;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.types.Field;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.types.Message;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_3.types.PrintOptions;

/**
 * Represents the OrderFilledMessage message from the OrdersApi protocol.
 *
 * <p>OrderFilledMessage</p>
 */
public final class OrderFilledMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 81;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Filled Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Nanoseconds since epoch
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * execId
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * matchId
     */
    private final MatchIdField matchId = new MatchIdField();

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
     * filledVwap
     */
    private final FilledVwapField filledVwap = new FilledVwapField();

    /**
     * totalFilled
     */
    private final TotalFilledField totalFilled = new TotalFilledField();

    /**
     * availableQty
     */
    private final AvailableQtyField availableQty = new AvailableQtyField();

    /**
     * fillPrice
     */
    private final FillPriceField fillPrice = new FillPriceField();

    /**
     * fillQty
     */
    private final FillQtyField fillQty = new FillQtyField();

    /**
     * instrumentId
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * isAggressor
     */
    private final IsAggressorField isAggressor = new IsAggressorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, execId, matchId, clientOrderId, correlationId, orderId, filledVwap, totalFilled, availableQty, fillPrice, fillQty, instrumentId, isAggressor);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since epoch
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
     * matchId
     *
     * @return the MatchId field
     */
    public MatchIdField matchId() {
        return matchId;
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
     * filledVwap
     *
     * @return the FilledVwap field
     */
    public FilledVwapField filledVwap() {
        return filledVwap;
    }

    /**
     * totalFilled
     *
     * @return the TotalFilled field
     */
    public TotalFilledField totalFilled() {
        return totalFilled;
    }

    /**
     * availableQty
     *
     * @return the AvailableQty field
     */
    public AvailableQtyField availableQty() {
        return availableQty;
    }

    /**
     * fillPrice
     *
     * @return the FillPrice field
     */
    public FillPriceField fillPrice() {
        return fillPrice;
    }

    /**
     * fillQty
     *
     * @return the FillQty field
     */
    public FillQtyField fillQty() {
        return fillQty;
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
     * isAggressor
     *
     * @return the IsAggressor field
     */
    public IsAggressorField isAggressor() {
        return isAggressor;
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
        return PADDING.clone();
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
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
        if (!matchId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchIdField.BYTE_LENGTH;
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
        if (!filledVwap.parse(data, cursor)) {
            return false;
        }
        cursor += FilledVwapField.BYTE_LENGTH;
        if (!totalFilled.parse(data, cursor)) {
            return false;
        }
        cursor += TotalFilledField.BYTE_LENGTH;
        if (!availableQty.parse(data, cursor)) {
            return false;
        }
        cursor += AvailableQtyField.BYTE_LENGTH;
        if (!fillPrice.parse(data, cursor)) {
            return false;
        }
        cursor += FillPriceField.BYTE_LENGTH;
        if (!fillQty.parse(data, cursor)) {
            return false;
        }
        cursor += FillQtyField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!isAggressor.parse(data, cursor)) {
            return false;
        }
        cursor += IsAggressorField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = matchId.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = correlationId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = filledVwap.encode(data, cursor);
        cursor = totalFilled.encode(data, cursor);
        cursor = availableQty.encode(data, cursor);
        cursor = fillPrice.encode(data, cursor);
        cursor = fillQty.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = isAggressor.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "ExecId" -> Optional.of(execId);
            case "MatchId" -> Optional.of(matchId);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "CorrelationId" -> Optional.of(correlationId);
            case "OrderId" -> Optional.of(orderId);
            case "FilledVwap" -> Optional.of(filledVwap);
            case "TotalFilled" -> Optional.of(totalFilled);
            case "AvailableQty" -> Optional.of(availableQty);
            case "FillPrice" -> Optional.of(fillPrice);
            case "FillQty" -> Optional.of(fillQty);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "IsAggressor" -> Optional.of(isAggressor);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderFilledMessage message)) {
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
        if (!(other instanceof OrderFilledMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
