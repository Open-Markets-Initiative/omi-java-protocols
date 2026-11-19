package omi.asx.asxderivatives.t24.itch.v1_13.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.LegsField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.NanosecondsField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.OrderBookPriorityField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.OrderNumberField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.QuantityField;
import omi.asx.asxderivatives.t24.itch.v1_13.fields.TradeDateField;
import omi.asx.asxderivatives.t24.itch.v1_13.groups.ContractLegsEntry;
import omi.asx.asxderivatives.t24.itch.v1_13.groups.ContractLegsList;
import omi.asx.asxderivatives.t24.itch.v1_13.types.Field;
import omi.asx.asxderivatives.t24.itch.v1_13.types.Message;
import omi.asx.asxderivatives.t24.itch.v1_13.types.PrintOptions;

/**
 * Represents the CustomMarketOrderAddedMessage message from the T24 protocol.
 *
 * <p>Any resting Custom Market Order that trades will be reported using the Custom Market Executed or Custom Market Trade message.</p>
 */
public final class CustomMarketOrderAddedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'm';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 89;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Custom Market Order Added Message";

    /**
     * The number of entries that ContractLegs carries on the wire.
     */
    public static final int CONTRACT_LEGS_COUNT = 6;

    /**
     * Nanoseconds portion of the timestamp.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Trade Date of event as applicable, if Event Code is “P” or “R”, applies to all active trade dates.
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Order number assigned by Matching Engine.
     */
    private final OrderNumberField orderNumber = new OrderNumberField();

    /**
     * Time priority within the order book.
     */
    private final OrderBookPriorityField orderBookPriority = new OrderBookPriorityField();

    /**
     * Number of lots added to the book (all volume is visible).
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Number of legs.
     */
    private final LegsField legs = new LegsField();

    /**
     * Contract Legs
     */
    private final ContractLegsList contractLegs = new ContractLegsList(CONTRACT_LEGS_COUNT);

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, tradeDate, orderNumber, orderBookPriority, quantity, legs);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the timestamp.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Trade Date of event as applicable, if Event Code is “P” or “R”, applies to all active trade dates.
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Order number assigned by Matching Engine.
     *
     * @return the OrderNumber field
     */
    public OrderNumberField orderNumber() {
        return orderNumber;
    }

    /**
     * Time priority within the order book.
     *
     * @return the OrderBookPriority field
     */
    public OrderBookPriorityField orderBookPriority() {
        return orderBookPriority;
    }

    /**
     * Number of lots added to the book (all volume is visible).
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Number of legs.
     *
     * @return the Legs field
     */
    public LegsField legs() {
        return legs;
    }

    /**
     * Contract Legs
     *
     * <p>This list always holds 6 entries: replace one with {@code set}, or set the values of those it holds.</p>
     *
     * @return the ContractLegs entries
     */
    public ContractLegsList contractLegs() {
        return contractLegs;
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!orderNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderNumberField.BYTE_LENGTH;
        if (!orderBookPriority.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookPriorityField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!legs.parse(data, cursor)) {
            return false;
        }
        cursor += LegsField.BYTE_LENGTH;
        if (!contractLegs.parse(data, cursor, end, CONTRACT_LEGS_COUNT)) {
            return false;
        }
        cursor += contractLegs.byteLength();

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = orderNumber.encode(data, cursor);
        cursor = orderBookPriority.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = legs.encode(data, cursor);
        cursor = contractLegs.encode(data, cursor);
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
        contractLegs.clear();
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
        return contractLegs.isRecognized();
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
        if (!contractLegs.isValid()) {
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
        if (!nanoseconds.isDecoded()) {
            return Optional.of(nanoseconds);
        }
        if (!tradeDate.isDecoded()) {
            return Optional.of(tradeDate);
        }
        if (!orderNumber.isDecoded()) {
            return Optional.of(orderNumber);
        }
        if (!orderBookPriority.isDecoded()) {
            return Optional.of(orderBookPriority);
        }
        if (!quantity.isDecoded()) {
            return Optional.of(quantity);
        }
        if (!legs.isDecoded()) {
            return Optional.of(legs);
        }
        if (!contractLegs.isDecoded()) {
            return contractLegs.failedEntry().flatMap(ContractLegsEntry::failedAt);
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "TradeDate" -> Optional.of(tradeDate);
            case "OrderNumber" -> Optional.of(orderNumber);
            case "OrderBookPriority" -> Optional.of(orderBookPriority);
            case "Quantity" -> Optional.of(quantity);
            case "Legs" -> Optional.of(legs);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CustomMarketOrderAddedMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(contractLegs.diffFields(message.contractLegs));
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
            contractLegs.toFormattedString(builder, options);
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
        contractLegs.toFormattedString(builder, nested);
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
        if (!(other instanceof CustomMarketOrderAddedMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && contractLegs.equals(message.contractLegs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, contractLegs);
    }
}
