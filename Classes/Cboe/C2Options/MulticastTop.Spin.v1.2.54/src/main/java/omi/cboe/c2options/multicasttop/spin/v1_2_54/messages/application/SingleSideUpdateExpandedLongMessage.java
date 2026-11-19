package omi.cboe.c2options.multicasttop.spin.v1_2_54.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c2options.multicasttop.spin.v1_2_54.fields.BitFieldsField;
import omi.cboe.c2options.multicasttop.spin.v1_2_54.fields.CustomerQuantityLongField;
import omi.cboe.c2options.multicasttop.spin.v1_2_54.fields.PriceLongField;
import omi.cboe.c2options.multicasttop.spin.v1_2_54.fields.QuantityLongField;
import omi.cboe.c2options.multicasttop.spin.v1_2_54.fields.SideField;
import omi.cboe.c2options.multicasttop.spin.v1_2_54.fields.SymbolField;
import omi.cboe.c2options.multicasttop.spin.v1_2_54.fields.TimeOffsetField;
import omi.cboe.c2options.multicasttop.spin.v1_2_54.types.Field;
import omi.cboe.c2options.multicasttop.spin.v1_2_54.types.Message;
import omi.cboe.c2options.multicasttop.spin.v1_2_54.types.PrintOptions;

/**
 * Represents the SingleSideUpdateExpandedLongMessage message from the MulticastTop protocol.
 *
 * <p>Single Side Update Expanded (Long) message is used when the Price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer.</p>
 */
public final class SingleSideUpdateExpandedLongMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 28;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Single Side Update Expanded Long Message";

    /**
     * Nanosecond offset from last unit timestamp.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Symbol right padded with spaces.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * B = Bid Side, S = Ask Side.
     */
    private final SideField side = new SideField();

    /**
     * Bit field used in Single Side Update Expanded and Two Side Update Expanded messages. Bit 3 indicates AON (All or None) price level; Bit 4 (C1 Only) indicates the price level is specifically for firm customer quotes.
     */
    private final BitFieldsField bitFields = new BitFieldsField();

    /**
     * Price.
     */
    private final PriceLongField priceLong = new PriceLongField();

    /**
     * Total number of contracts on the inside book (customer and non-customer). If Customer bit is set, this will be zero.
     */
    private final QuantityLongField quantityLong = new QuantityLongField();

    /**
     * Number of customer contracts on the inside book. A zero value denotes that there are no customer contracts at the inside price. If Customer bit is set, this will be the number of customer contracts on the inside book considering only customer firm quotes. Will always be zero for C2.
     */
    private final CustomerQuantityLongField customerQuantityLong = new CustomerQuantityLongField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, symbol, side, bitFields, priceLong, quantityLong, customerQuantityLong);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp.
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Symbol right padded with spaces.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * B = Bid Side, S = Ask Side.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Bit field used in Single Side Update Expanded and Two Side Update Expanded messages. Bit 3 indicates AON (All or None) price level; Bit 4 (C1 Only) indicates the price level is specifically for firm customer quotes.
     *
     * @return the BitFields field
     */
    public BitFieldsField bitFields() {
        return bitFields;
    }

    /**
     * Price.
     *
     * @return the PriceLong field
     */
    public PriceLongField priceLong() {
        return priceLong;
    }

    /**
     * Total number of contracts on the inside book (customer and non-customer). If Customer bit is set, this will be zero.
     *
     * @return the QuantityLong field
     */
    public QuantityLongField quantityLong() {
        return quantityLong;
    }

    /**
     * Number of customer contracts on the inside book. A zero value denotes that there are no customer contracts at the inside price. If Customer bit is set, this will be the number of customer contracts on the inside book considering only customer firm quotes. Will always be zero for C2.
     *
     * @return the CustomerQuantityLong field
     */
    public CustomerQuantityLongField customerQuantityLong() {
        return customerQuantityLong;
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
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!bitFields.parse(data, cursor)) {
            return false;
        }
        cursor += BitFieldsField.BYTE_LENGTH;
        if (!priceLong.parse(data, cursor)) {
            return false;
        }
        cursor += PriceLongField.BYTE_LENGTH;
        if (!quantityLong.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityLongField.BYTE_LENGTH;
        return customerQuantityLong.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = bitFields.encode(data, cursor);
        cursor = priceLong.encode(data, cursor);
        cursor = quantityLong.encode(data, cursor);
        cursor = customerQuantityLong.encode(data, cursor);
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
            case "Symbol" -> Optional.of(symbol);
            case "Side" -> Optional.of(side);
            case "BitFields" -> Optional.of(bitFields);
            case "PriceLong" -> Optional.of(priceLong);
            case "QuantityLong" -> Optional.of(quantityLong);
            case "CustomerQuantityLong" -> Optional.of(customerQuantityLong);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SingleSideUpdateExpandedLongMessage message)) {
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
        if (!(other instanceof SingleSideUpdateExpandedLongMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
