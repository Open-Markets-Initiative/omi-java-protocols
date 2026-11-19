package omi.tradelogiq.omegaats.tcplevel1.itch.v1_01.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tradelogiq.omegaats.tcplevel1.itch.v1_01.fields.BuyBrokerField;
import omi.tradelogiq.omegaats.tcplevel1.itch.v1_01.fields.ConditionsField;
import omi.tradelogiq.omegaats.tcplevel1.itch.v1_01.fields.SellBrokerField;
import omi.tradelogiq.omegaats.tcplevel1.itch.v1_01.fields.StockSymbolField;
import omi.tradelogiq.omegaats.tcplevel1.itch.v1_01.fields.TimestampField;
import omi.tradelogiq.omegaats.tcplevel1.itch.v1_01.fields.TradeIdField;
import omi.tradelogiq.omegaats.tcplevel1.itch.v1_01.fields.TradePriceField;
import omi.tradelogiq.omegaats.tcplevel1.itch.v1_01.fields.TradeSizeField;
import omi.tradelogiq.omegaats.tcplevel1.itch.v1_01.types.Field;
import omi.tradelogiq.omegaats.tcplevel1.itch.v1_01.types.Message;
import omi.tradelogiq.omegaats.tcplevel1.itch.v1_01.types.PrintOptions;

/**
 * Represents the TradeReportMessage message from the TcpLevel1 protocol.
 *
 * <p>Relays all transactions available from or reported by Tradelogiq's two trading books for the current business day.</p>
 */
public final class TradeReportMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'T';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 43;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Report Message";

    /**
     * Trade condition codes, W for Bypass, X for Internal Cross and E for Odd Lot. Note: Field may be blank
     */
    private final ConditionsField conditions = new ConditionsField();

    /**
     * Stock Identifier for which BBO quotation message is being generated
     */
    private final StockSymbolField stockSymbol = new StockSymbolField();

    /**
     * Nanoseconds since midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Indicates the internal number of the given trade transaction
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * The price associated with the trade transaction being reported.
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * Number of shares on the trade transaction
     */
    private final TradeSizeField tradeSize = new TradeSizeField();

    /**
     * Buy Side Broker Number or 1 for Anonymous
     */
    private final BuyBrokerField buyBroker = new BuyBrokerField();

    /**
     * Sell Side Broker Number or 1 for Anonymous
     */
    private final SellBrokerField sellBroker = new SellBrokerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(conditions, stockSymbol, timestampField, tradeId, tradePrice, tradeSize, buyBroker, sellBroker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Trade condition codes, W for Bypass, X for Internal Cross and E for Odd Lot. Note: Field may be blank
     *
     * @return the Conditions field
     */
    public ConditionsField conditions() {
        return conditions;
    }

    /**
     * Stock Identifier for which BBO quotation message is being generated
     *
     * @return the StockSymbol field
     */
    public StockSymbolField stockSymbol() {
        return stockSymbol;
    }

    /**
     * Nanoseconds since midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Indicates the internal number of the given trade transaction
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * The price associated with the trade transaction being reported.
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * Number of shares on the trade transaction
     *
     * @return the TradeSize field
     */
    public TradeSizeField tradeSize() {
        return tradeSize;
    }

    /**
     * Buy Side Broker Number or 1 for Anonymous
     *
     * @return the BuyBroker field
     */
    public BuyBrokerField buyBroker() {
        return buyBroker;
    }

    /**
     * Sell Side Broker Number or 1 for Anonymous
     *
     * @return the SellBroker field
     */
    public SellBrokerField sellBroker() {
        return sellBroker;
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
        if (!conditions.parse(data, cursor)) {
            return false;
        }
        cursor += ConditionsField.BYTE_LENGTH;
        if (!stockSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += StockSymbolField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!tradeSize.parse(data, cursor)) {
            return false;
        }
        cursor += TradeSizeField.BYTE_LENGTH;
        if (!buyBroker.parse(data, cursor)) {
            return false;
        }
        cursor += BuyBrokerField.BYTE_LENGTH;
        return sellBroker.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = conditions.encode(data, cursor);
        cursor = stockSymbol.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = tradeSize.encode(data, cursor);
        cursor = buyBroker.encode(data, cursor);
        cursor = sellBroker.encode(data, cursor);
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
            case "Conditions" -> Optional.of(conditions);
            case "StockSymbol" -> Optional.of(stockSymbol);
            case "Timestamp" -> Optional.of(timestampField);
            case "TradeId" -> Optional.of(tradeId);
            case "TradePrice" -> Optional.of(tradePrice);
            case "TradeSize" -> Optional.of(tradeSize);
            case "BuyBroker" -> Optional.of(buyBroker);
            case "SellBroker" -> Optional.of(sellBroker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeReportMessage message)) {
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
        if (!(other instanceof TradeReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
