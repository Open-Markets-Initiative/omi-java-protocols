package omi.cboe.cxaequities.multicasttopofbook.spin.v1_0_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cxaequities.multicasttopofbook.spin.v1_0_10.fields.AskPriceField;
import omi.cboe.cxaequities.multicasttopofbook.spin.v1_0_10.fields.AskQuantityField;
import omi.cboe.cxaequities.multicasttopofbook.spin.v1_0_10.fields.BidPriceField;
import omi.cboe.cxaequities.multicasttopofbook.spin.v1_0_10.fields.BidQuantityField;
import omi.cboe.cxaequities.multicasttopofbook.spin.v1_0_10.fields.ReservedField;
import omi.cboe.cxaequities.multicasttopofbook.spin.v1_0_10.fields.SecondReservedField;
import omi.cboe.cxaequities.multicasttopofbook.spin.v1_0_10.fields.SymbolField;
import omi.cboe.cxaequities.multicasttopofbook.spin.v1_0_10.fields.TimestampField;
import omi.cboe.cxaequities.multicasttopofbook.spin.v1_0_10.types.Field;
import omi.cboe.cxaequities.multicasttopofbook.spin.v1_0_10.types.Message;
import omi.cboe.cxaequities.multicasttopofbook.spin.v1_0_10.types.PrintOptions;

/**
 * Represents the TwoSideUpdateMessage message from the MulticastTopOfBook protocol.
 *
 * <p>Carries the current inside prices and quantities for both sides of a symbol. Included in a spin response so the client can populate the top-of-book state.</p>
 */
public final class TwoSideUpdateMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 40;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Two Side Update Message";

    /**
     * Nanoseconds since epoch.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Symbol (right padded with spaces).
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Bid price.
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * Number of shares on the bid side of the inside book. May be zero if only undisclosed orders exist on the inside book.
     */
    private final BidQuantityField bidQuantity = new BidQuantityField();

    /**
     * Reserved (undefined).
     */
    private final ReservedField reserved = new ReservedField();

    /**
     * Ask price.
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * Number of shares on the ask side of the inside book. May be zero if only undisclosed orders exist on the inside book.
     */
    private final AskQuantityField askQuantity = new AskQuantityField();

    /**
     * Reserved (undefined).
     */
    private final SecondReservedField secondReserved = new SecondReservedField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, symbol, bidPrice, bidQuantity, reserved, askPrice, askQuantity, secondReserved);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since epoch.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Symbol (right padded with spaces).
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Bid price.
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * Number of shares on the bid side of the inside book. May be zero if only undisclosed orders exist on the inside book.
     *
     * @return the BidQuantity field
     */
    public BidQuantityField bidQuantity() {
        return bidQuantity;
    }

    /**
     * Reserved (undefined).
     *
     * @return the Reserved field
     */
    public ReservedField reserved() {
        return reserved;
    }

    /**
     * Ask price.
     *
     * @return the AskPrice field
     */
    public AskPriceField askPrice() {
        return askPrice;
    }

    /**
     * Number of shares on the ask side of the inside book. May be zero if only undisclosed orders exist on the inside book.
     *
     * @return the AskQuantity field
     */
    public AskQuantityField askQuantity() {
        return askQuantity;
    }

    /**
     * Reserved (undefined).
     *
     * @return the SecondReserved field
     */
    public SecondReservedField secondReserved() {
        return secondReserved;
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        if (!bidQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += BidQuantityField.BYTE_LENGTH;
        if (!reserved.parse(data, cursor)) {
            return false;
        }
        cursor += ReservedField.BYTE_LENGTH;
        if (!askPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceField.BYTE_LENGTH;
        if (!askQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += AskQuantityField.BYTE_LENGTH;
        return secondReserved.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = bidQuantity.encode(data, cursor);
        cursor = reserved.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = askQuantity.encode(data, cursor);
        cursor = secondReserved.encode(data, cursor);
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
            case "BidPrice" -> Optional.of(bidPrice);
            case "BidQuantity" -> Optional.of(bidQuantity);
            case "Reserved" -> Optional.of(reserved);
            case "AskPrice" -> Optional.of(askPrice);
            case "AskQuantity" -> Optional.of(askQuantity);
            case "SecondReserved" -> Optional.of(secondReserved);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TwoSideUpdateMessage message)) {
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
        if (!(other instanceof TwoSideUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
