package omi.cnsx.cse2.multicast.mmd.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.ExchangeTimestampField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.FirmIdField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.OddLotFlagField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.OrderNumberField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.OrderVerbField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.PriceField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.PriorityTimestampField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.QuantityField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.SettlementTermField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.SymbolField;
import omi.cnsx.cse2.multicast.mmd.v1_6.fields.TimeOffsetField;
import omi.cnsx.cse2.multicast.mmd.v1_6.types.Field;
import omi.cnsx.cse2.multicast.mmd.v1_6.types.Message;
import omi.cnsx.cse2.multicast.mmd.v1_6.types.PrintOptions;

/**
 * Represents the AddOrderMessage message from the Multicast protocol.
 *
 * <p>A new order added to the displayed book.</p>
 */
public final class AddOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'A';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 71;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Add Order Message";

    /**
     * Nanoseconds since last Timestamp-Seconds message.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Unique reference number assigned to the new order.
     */
    private final OrderNumberField orderNumber = new OrderNumberField();

    /**
     * "B" Buy, "S" Sell.
     */
    private final OrderVerbField orderVerb = new OrderVerbField();

    /**
     * Total quantity of the order being added to the book.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Symbol.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Price of the new order.
     */
    private final PriceField price = new PriceField();

    /**
     * 3 digit integer FirmId. "001" means anonymous.
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * Override Settlement Term. "T" = Cash Today (T+0), "N" = Non-Net, "R" = Non-Resident, or a Special Settlement Date in YYYYMMDD format. Left blank " " if default settlement.
     */
    private final SettlementTermField settlementTerm = new SettlementTermField();

    /**
     * "Y" = Odd lot order, "N" = Not an odd lot.
     */
    private final OddLotFlagField oddLotFlag = new OddLotFlagField();

    /**
     * Official exchange time. Milliseconds since EPOCH (Jan 1, 0:0:0, 1970).
     */
    private final ExchangeTimestampField exchangeTimestamp = new ExchangeTimestampField();

    /**
     * Priority timestamp. Milliseconds since EPOCH (Jan 1, 0:0:0, 1970).
     */
    private final PriorityTimestampField priorityTimestamp = new PriorityTimestampField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, orderNumber, orderVerb, quantity, symbol, price, firmId, settlementTerm, oddLotFlag, exchangeTimestamp, priorityTimestamp);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since last Timestamp-Seconds message.
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Unique reference number assigned to the new order.
     *
     * @return the OrderNumber field
     */
    public OrderNumberField orderNumber() {
        return orderNumber;
    }

    /**
     * "B" Buy, "S" Sell.
     *
     * @return the OrderVerb field
     */
    public OrderVerbField orderVerb() {
        return orderVerb;
    }

    /**
     * Total quantity of the order being added to the book.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Symbol.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Price of the new order.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * 3 digit integer FirmId. "001" means anonymous.
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * Override Settlement Term. "T" = Cash Today (T+0), "N" = Non-Net, "R" = Non-Resident, or a Special Settlement Date in YYYYMMDD format. Left blank " " if default settlement.
     *
     * @return the SettlementTerm field
     */
    public SettlementTermField settlementTerm() {
        return settlementTerm;
    }

    /**
     * "Y" = Odd lot order, "N" = Not an odd lot.
     *
     * @return the OddLotFlag field
     */
    public OddLotFlagField oddLotFlag() {
        return oddLotFlag;
    }

    /**
     * Official exchange time. Milliseconds since EPOCH (Jan 1, 0:0:0, 1970).
     *
     * @return the ExchangeTimestamp field
     */
    public ExchangeTimestampField exchangeTimestamp() {
        return exchangeTimestamp;
    }

    /**
     * Priority timestamp. Milliseconds since EPOCH (Jan 1, 0:0:0, 1970).
     *
     * @return the PriorityTimestamp field
     */
    public PriorityTimestampField priorityTimestamp() {
        return priorityTimestamp;
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
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        if (!orderNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderNumberField.BYTE_LENGTH;
        if (!orderVerb.parse(data, cursor)) {
            return false;
        }
        cursor += OrderVerbField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!settlementTerm.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementTermField.BYTE_LENGTH;
        if (!oddLotFlag.parse(data, cursor)) {
            return false;
        }
        cursor += OddLotFlagField.BYTE_LENGTH;
        if (!exchangeTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += ExchangeTimestampField.BYTE_LENGTH;
        return priorityTimestamp.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = orderNumber.encode(data, cursor);
        cursor = orderVerb.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = settlementTerm.encode(data, cursor);
        cursor = oddLotFlag.encode(data, cursor);
        cursor = exchangeTimestamp.encode(data, cursor);
        cursor = priorityTimestamp.encode(data, cursor);
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
            case "TimeOffset" -> Optional.of(timeOffset);
            case "OrderNumber" -> Optional.of(orderNumber);
            case "OrderVerb" -> Optional.of(orderVerb);
            case "Quantity" -> Optional.of(quantity);
            case "Symbol" -> Optional.of(symbol);
            case "Price" -> Optional.of(price);
            case "FirmId" -> Optional.of(firmId);
            case "SettlementTerm" -> Optional.of(settlementTerm);
            case "OddLotFlag" -> Optional.of(oddLotFlag);
            case "ExchangeTimestamp" -> Optional.of(exchangeTimestamp);
            case "PriorityTimestamp" -> Optional.of(priorityTimestamp);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AddOrderMessage message)) {
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
        if (!(other instanceof AddOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
