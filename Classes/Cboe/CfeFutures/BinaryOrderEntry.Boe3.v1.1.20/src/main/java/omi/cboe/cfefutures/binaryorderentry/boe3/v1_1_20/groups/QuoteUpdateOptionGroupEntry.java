package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.OpenCloseField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.OrderQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.PriceField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.QuoteSymbolField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.SideField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.GroupEntry;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.PrintOptions;

/**
 * One entry of the QuoteUpdateOptionGroup repeating group.
 *
 * <p>Quote Update Option Group</p>
 */
public final class QuoteUpdateOptionGroupEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 20;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "QuoteUpdateOptionGroup";

    /**
     * CFE native identifier of the instrument being quoted
     */
    private final QuoteSymbolField quoteSymbol = new QuoteSymbolField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Indicates status of client position in a trade resulting from the order
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Limit price
     */
    private final PriceField price = new PriceField();

    /**
     * Order quantity
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(quoteSymbol, side, openClose, price, orderQty);

    private byte[] buffer;

    private boolean decoded;

    /**
     * CFE native identifier of the instrument being quoted
     *
     * @return the QuoteSymbol field
     */
    public QuoteSymbolField quoteSymbol() {
        return quoteSymbol;
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
     * Indicates status of client position in a trade resulting from the order
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
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
     * Order quantity
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
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
        if (!quoteSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteSymbolField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        return orderQty.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = quoteSymbol.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
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
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
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
            case "QuoteSymbol" -> Optional.of(quoteSymbol);
            case "Side" -> Optional.of(side);
            case "OpenClose" -> Optional.of(openClose);
            case "Price" -> Optional.of(price);
            case "OrderQty" -> Optional.of(orderQty);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof QuoteUpdateOptionGroupEntry message)) {
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
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof QuoteUpdateOptionGroupEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
