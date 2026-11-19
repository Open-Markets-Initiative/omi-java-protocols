package omi.memx.memxoptions.memoirtop.sbe.v1_6_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.fields.CapacityField;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.fields.CustQuantityField;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.fields.PriceField;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.fields.QuantityField;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.fields.SideField;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.fields.SymbolField;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.fields.TimestampField;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.fields.TradeConditionsField;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.fields.TradeIdField;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.types.Field;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.types.Message;
import omi.memx.memxoptions.memoirtop.sbe.v1_6_a.types.PrintOptions;

/**
 * Represents the TradeMessage message from the MemoirTop protocol.
 *
 * <p>TradeMessage</p>
 */
public final class TradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u000F';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 43;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Message";

    /**
     * Timestamp
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * TradeID
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * TradeConditions bit set
     */
    private final TradeConditionsField tradeConditions = new TradeConditionsField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Quantity
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * CustQuantity
     */
    private final CustQuantityField custQuantity = new CustQuantityField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, symbol, tradeId, tradeConditions, side, quantity, price, custQuantity, capacity);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Timestamp
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * TradeID
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * TradeConditions bit set
     *
     * @return the TradeConditions field
     */
    public TradeConditionsField tradeConditions() {
        return tradeConditions;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Quantity
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * CustQuantity
     *
     * @return the CustQuantity field
     */
    public CustQuantityField custQuantity() {
        return custQuantity;
    }

    /**
     * Capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
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
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!tradeConditions.parse(data, cursor)) {
            return false;
        }
        cursor += TradeConditionsField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!custQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += CustQuantityField.BYTE_LENGTH;
        return capacity.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = tradeConditions.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = custQuantity.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
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
            case "Symbol" -> Optional.of(symbol);
            case "TradeId" -> Optional.of(tradeId);
            case "TradeConditions" -> Optional.of(tradeConditions);
            case "Side" -> Optional.of(side);
            case "Quantity" -> Optional.of(quantity);
            case "Price" -> Optional.of(price);
            case "CustQuantity" -> Optional.of(custQuantity);
            case "Capacity" -> Optional.of(capacity);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeMessage message)) {
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
        if (!(other instanceof TradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
