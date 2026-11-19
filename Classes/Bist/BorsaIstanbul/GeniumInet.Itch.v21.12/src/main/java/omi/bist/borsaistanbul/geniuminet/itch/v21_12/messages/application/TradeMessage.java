package omi.bist.borsaistanbul.geniuminet.itch.v21_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.ComboGroupIdField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.MatchIdField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.NanosecondsField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.OccurredAtCrossField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.OrderBookIdField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.PrintableField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.QuantityField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.SideField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.fields.TradePriceField;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.types.Field;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.types.Message;
import omi.bist.borsaistanbul.geniuminet.itch.v21_12.types.PrintOptions;

/**
 * Represents the TradeMessage message from the GeniumInet protocol.
 *
 * <p>Designed to provide execution details for normal match events involving non-displayable order types. Also used to publish individual cross trades. Since no Add Order Message is generated when a non-displayed order is initially received, the Order Executed message cannot be used for all matches; the Trade Message reports a match for a non-displayable order in the book. Trade Messages should be included in trade tickers as well as volume and other market statistics.</p>
 */
public final class TradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'P';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 49;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 33, 14 };

    /**
     * Nanoseconds portion of the timestamp
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * Assigned by the system to each match executed
     */
    private final MatchIdField matchId = new MatchIdField();

    /**
     * Used to group combination order book executions and the trades in the constituent order books together
     */
    private final ComboGroupIdField comboGroupId = new ComboGroupIdField();

    /**
     * Buy or sell order
     */
    private final SideField side = new SideField();

    /**
     * The visible quantity of the order. Orders with an undisclosed quantity will have this field set to 0
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * Denotes the primary identifier of an order book. Expired Order book IDs may be reused for new instruments.
     */
    private final OrderBookIdField orderBookId = new OrderBookIdField();

    /**
     * Execution price
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * Indicates if the trade should be included in trade tickers and volume calculations
     */
    private final PrintableField printable = new PrintableField();

    /**
     * Whether the trade occurred at the cross
     */
    private final OccurredAtCrossField occurredAtCross = new OccurredAtCrossField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, matchId, comboGroupId, side, quantity, orderBookId, tradePrice, printable, occurredAtCross);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the timestamp
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * Assigned by the system to each match executed
     *
     * @return the MatchId field
     */
    public MatchIdField matchId() {
        return matchId;
    }

    /**
     * Used to group combination order book executions and the trades in the constituent order books together
     *
     * @return the ComboGroupId field
     */
    public ComboGroupIdField comboGroupId() {
        return comboGroupId;
    }

    /**
     * Buy or sell order
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * The visible quantity of the order. Orders with an undisclosed quantity will have this field set to 0
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
    }

    /**
     * Denotes the primary identifier of an order book. Expired Order book IDs may be reused for new instruments.
     *
     * @return the OrderBookId field
     */
    public OrderBookIdField orderBookId() {
        return orderBookId;
    }

    /**
     * Execution price
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * Indicates if the trade should be included in trade tickers and volume calculations
     *
     * @return the Printable field
     */
    public PrintableField printable() {
        return printable;
    }

    /**
     * Whether the trade occurred at the cross
     *
     * @return the OccurredAtCross field
     */
    public OccurredAtCrossField occurredAtCross() {
        return occurredAtCross;
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!matchId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchIdField.BYTE_LENGTH;
        if (!comboGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += ComboGroupIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!orderBookId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookIdField.BYTE_LENGTH;
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        cursor += 14; // padding
        if (!printable.parse(data, cursor)) {
            return false;
        }
        cursor += PrintableField.BYTE_LENGTH;
        return occurredAtCross.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = matchId.encode(data, cursor);
        cursor = comboGroupId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = orderBookId.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        if (buffer != null && buffer.length >= 47) {
            System.arraycopy(buffer, 33, data, cursor, 14); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 14, (byte) 0); // padding
        }
        cursor += 14;
        cursor = printable.encode(data, cursor);
        cursor = occurredAtCross.encode(data, cursor);
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "MatchId" -> Optional.of(matchId);
            case "ComboGroupId" -> Optional.of(comboGroupId);
            case "Side" -> Optional.of(side);
            case "Quantity" -> Optional.of(quantity);
            case "OrderBookId" -> Optional.of(orderBookId);
            case "TradePrice" -> Optional.of(tradePrice);
            case "Printable" -> Optional.of(printable);
            case "OccurredAtCross" -> Optional.of(occurredAtCross);
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
