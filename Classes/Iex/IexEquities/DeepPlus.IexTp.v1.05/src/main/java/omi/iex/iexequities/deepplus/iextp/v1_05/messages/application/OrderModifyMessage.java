package omi.iex.iexequities.deepplus.iextp.v1_05.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.iex.iexequities.deepplus.iextp.v1_05.fields.ModifyFlagsField;
import omi.iex.iexequities.deepplus.iextp.v1_05.fields.OrderIdReferenceField;
import omi.iex.iexequities.deepplus.iextp.v1_05.fields.PriceField;
import omi.iex.iexequities.deepplus.iextp.v1_05.fields.SizeField;
import omi.iex.iexequities.deepplus.iextp.v1_05.fields.SymbolField;
import omi.iex.iexequities.deepplus.iextp.v1_05.fields.TimestampField;
import omi.iex.iexequities.deepplus.iextp.v1_05.types.Field;
import omi.iex.iexequities.deepplus.iextp.v1_05.types.Message;
import omi.iex.iexequities.deepplus.iextp.v1_05.types.PrintOptions;

/**
 * Represents the OrderModifyMessage message from the DeepPlus protocol.
 *
 * <p>A displayed order that had its Price, Size, or Priority component changed as a result of user or system action</p>
 */
public final class OrderModifyMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'M';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 37;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Modify Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Modify Flags
     */
    private final ModifyFlagsField modifyFlags = new ModifyFlagsField();

    /**
     * Time stamp of the system event
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Security identifier
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Order ID of the referenced order
     */
    private final OrderIdReferenceField orderIdReference = new OrderIdReferenceField();

    /**
     * Quoted size
     */
    private final SizeField size = new SizeField();

    /**
     * Booking price on the IEX Order Book
     */
    private final PriceField price = new PriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(modifyFlags, timestampField, symbol, orderIdReference, size, price);

    private byte[] buffer;

    private int bufferOffset;

    private boolean decoded;

    /**
     * Modify Flags
     *
     * @return the ModifyFlags field
     */
    public ModifyFlagsField modifyFlags() {
        return modifyFlags;
    }

    /**
     * Time stamp of the system event
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Security identifier
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Order ID of the referenced order
     *
     * @return the OrderIdReference field
     */
    public OrderIdReferenceField orderIdReference() {
        return orderIdReference;
    }

    /**
     * Quoted size
     *
     * @return the Size field
     */
    public SizeField size() {
        return size;
    }

    /**
     * Booking price on the IEX Order Book
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
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
     * <p>Padding carries no value: decode advances over it and encode writes it as zero. Use this to check that a received message's padding is zero where the specification requires it, or to render a byte map of the layout.</p>
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
        clear();
        this.buffer = data;
        this.bufferOffset = offset;

        if (offset < 0 || offset + BYTE_LENGTH > data.length) {
            return false;
        }

        int cursor = offset;
        if (!modifyFlags.parse(data, cursor)) {
            return false;
        }
        cursor += ModifyFlagsField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!orderIdReference.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdReferenceField.BYTE_LENGTH;
        if (!size.parse(data, cursor)) {
            return false;
        }
        cursor += SizeField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;

        this.decoded = true;
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = modifyFlags.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = orderIdReference.encode(data, cursor);
        cursor = size.encode(data, cursor);
        cursor = price.encode(data, cursor);
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
        this.bufferOffset = 0;
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
        int end = Math.min(buffer.length, bufferOffset + BYTE_LENGTH);
        int start = Math.min(Math.max(bufferOffset, 0), end);
        return Optional.of(Arrays.copyOfRange(buffer, start, end));
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
            case "ModifyFlags" -> Optional.of(modifyFlags);
            case "Timestamp" -> Optional.of(timestampField);
            case "Symbol" -> Optional.of(symbol);
            case "OrderIdReference" -> Optional.of(orderIdReference);
            case "Size" -> Optional.of(size);
            case "Price" -> Optional.of(price);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderModifyMessage message)) {
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
        if (!(other instanceof OrderModifyMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
