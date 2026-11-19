package omi.nairobi.nairobiequities.realtime.mitch.v1_22.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.BuyFirmField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.NanosecondField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.PriceField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.QuantityField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.SellFirmField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.SubBookField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.SymbolField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.fields.TradeIdField;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.types.Field;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.types.Message;
import omi.nairobi.nairobiequities.realtime.mitch.v1_22.types.PrintOptions;

/**
 * Represents the TradeCorrectionMessage message from the RealTime protocol.
 *
 * <p>Sent to report the correction of the executed quantity of a trade.</p>
 */
public final class TradeCorrectionMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 45;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Correction Message";

    /**
     * Nanoseconds offset from the last Time message.
     */
    private final NanosecondField nanosecond = new NanosecondField();

    /**
     * Unique identifier of the trade.
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Instrument's symbol.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Limit price of the order.
     */
    private final PriceField price = new PriceField();

    /**
     * Displayed quantity of the order.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Order book the status relates to.
     */
    private final SubBookField subBook = new SubBookField();

    /**
     * Identifier of the firm which submitted the buy order. Required only if the 'Publish Firms' is enabled for the order book in which the execution occurred.
     */
    private final BuyFirmField buyFirm = new BuyFirmField();

    /**
     * Identifier of the firm which submitted the sell order. Required only if the 'Publish Firms' is enabled for the order book in which the execution occurred.
     */
    private final SellFirmField sellFirm = new SellFirmField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanosecond, tradeId, symbol, price, quantity, subBook, buyFirm, sellFirm);

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
     * Unique identifier of the trade.
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
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
     * Order book the status relates to.
     *
     * @return the SubBook field
     */
    public SubBookField subBook() {
        return subBook;
    }

    /**
     * Identifier of the firm which submitted the buy order. Required only if the 'Publish Firms' is enabled for the order book in which the execution occurred.
     *
     * @return the BuyFirm field
     */
    public BuyFirmField buyFirm() {
        return buyFirm;
    }

    /**
     * Identifier of the firm which submitted the sell order. Required only if the 'Publish Firms' is enabled for the order book in which the execution occurred.
     *
     * @return the SellFirm field
     */
    public SellFirmField sellFirm() {
        return sellFirm;
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
        if (!nanosecond.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!subBook.parse(data, cursor)) {
            return false;
        }
        cursor += SubBookField.BYTE_LENGTH;
        if (!buyFirm.parse(data, cursor)) {
            return false;
        }
        cursor += BuyFirmField.BYTE_LENGTH;
        return sellFirm.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanosecond.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = subBook.encode(data, cursor);
        cursor = buyFirm.encode(data, cursor);
        cursor = sellFirm.encode(data, cursor);
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
            case "TradeId" -> Optional.of(tradeId);
            case "Symbol" -> Optional.of(symbol);
            case "Price" -> Optional.of(price);
            case "Quantity" -> Optional.of(quantity);
            case "SubBook" -> Optional.of(subBook);
            case "BuyFirm" -> Optional.of(buyFirm);
            case "SellFirm" -> Optional.of(sellFirm);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCorrectionMessage message)) {
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
        if (!(other instanceof TradeCorrectionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
