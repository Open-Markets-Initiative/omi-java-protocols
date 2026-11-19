package omi.nairobi.nairobiequities.snapshot.mitch.v1_22.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.NanosecondField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.PriceField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.PriceLevelField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.PricePointActionField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.PricePointSubBookFlagsField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.QuantityField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.SideField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.SplitsField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.SymbolField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.UpdatePricePointFlagsField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.types.Field;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.types.Message;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.types.PrintOptions;

/**
 * Represents the UpdatePricePointMessage message from the Snapshot protocol.
 *
 * <p>Communicates the addition of a new price point or a size update to an already published price point.</p>
 */
public final class UpdatePricePointMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Update Price Point Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 33, 1 };

    /**
     * Nanoseconds offset from the last Time message.
     */
    private final NanosecondField nanosecond = new NanosecondField();

    /**
     * Instrument's symbol.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Order books of an Update Price Point, Delete Price Point or Top of Book message, one bit per book. The document labels this field Sub book or Sub Book; it defines no bit 1 or bit 7, and its bit 6 is Default Auction.
     */
    private final PricePointSubBookFlagsField pricePointSubBookFlags = new PricePointSubBookFlagsField();

    /**
     * Action on the price point. The document names this field Action.
     */
    private final PricePointActionField pricePointAction = new PricePointActionField();

    /**
     * Side of the order.
     */
    private final SideField side = new SideField();

    /**
     * Price Level of the order. A smaller number will denote a more marketable price point. A Price Level of 0 will denote market orders.
     */
    private final PriceLevelField priceLevel = new PriceLevelField();

    /**
     * Limit price of the order.
     */
    private final PriceField price = new PriceField();

    /**
     * Displayed quantity of the order.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Number of orders that contribute to this price point. Only the orders with a visible portion will be considered.
     */
    private final SplitsField splits = new SplitsField();

    /**
     * Flags of the Update Price Point message, which the document labels Flags.
     */
    private final UpdatePricePointFlagsField updatePricePointFlags = new UpdatePricePointFlagsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanosecond, symbol, pricePointSubBookFlags, pricePointAction, side, priceLevel, price, quantity, splits, updatePricePointFlags);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds offset from the last Time message.
     *
     * @return the Nanosecond field
     */
    public NanosecondField nanosecond() {
        return nanosecond;
    }

    /**
     * Instrument's symbol.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Order books of an Update Price Point, Delete Price Point or Top of Book message, one bit per book. The document labels this field Sub book or Sub Book; it defines no bit 1 or bit 7, and its bit 6 is Default Auction.
     *
     * @return the PricePointSubBookFlags field
     */
    public PricePointSubBookFlagsField pricePointSubBookFlags() {
        return pricePointSubBookFlags;
    }

    /**
     * Action on the price point. The document names this field Action.
     *
     * @return the PricePointAction field
     */
    public PricePointActionField pricePointAction() {
        return pricePointAction;
    }

    /**
     * Side of the order.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Price Level of the order. A smaller number will denote a more marketable price point. A Price Level of 0 will denote market orders.
     *
     * @return the PriceLevel field
     */
    public PriceLevelField priceLevel() {
        return priceLevel;
    }

    /**
     * Limit price of the order.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Displayed quantity of the order.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Number of orders that contribute to this price point. Only the orders with a visible portion will be considered.
     *
     * @return the Splits field
     */
    public SplitsField splits() {
        return splits;
    }

    /**
     * Flags of the Update Price Point message, which the document labels Flags.
     *
     * @return the UpdatePricePointFlags field
     */
    public UpdatePricePointFlagsField updatePricePointFlags() {
        return updatePricePointFlags;
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
        if (!nanosecond.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!pricePointSubBookFlags.parse(data, cursor)) {
            return false;
        }
        cursor += PricePointSubBookFlagsField.BYTE_LENGTH;
        if (!pricePointAction.parse(data, cursor)) {
            return false;
        }
        cursor += PricePointActionField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!priceLevel.parse(data, cursor)) {
            return false;
        }
        cursor += PriceLevelField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!splits.parse(data, cursor)) {
            return false;
        }
        cursor += SplitsField.BYTE_LENGTH;
        if (!updatePricePointFlags.parse(data, cursor)) {
            return false;
        }
        cursor += UpdatePricePointFlagsField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanosecond.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = pricePointSubBookFlags.encode(data, cursor);
        cursor = pricePointAction.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = priceLevel.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = splits.encode(data, cursor);
        cursor = updatePricePointFlags.encode(data, cursor);
        if (buffer != null && buffer.length >= 34) {
            System.arraycopy(buffer, 33, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
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
            case "Nanosecond" -> Optional.of(nanosecond);
            case "Symbol" -> Optional.of(symbol);
            case "PricePointSubBookFlags" -> Optional.of(pricePointSubBookFlags);
            case "PricePointAction" -> Optional.of(pricePointAction);
            case "Side" -> Optional.of(side);
            case "PriceLevel" -> Optional.of(priceLevel);
            case "Price" -> Optional.of(price);
            case "Quantity" -> Optional.of(quantity);
            case "Splits" -> Optional.of(splits);
            case "UpdatePricePointFlags" -> Optional.of(updatePricePointFlags);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof UpdatePricePointMessage message)) {
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
        if (!(other instanceof UpdatePricePointMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
