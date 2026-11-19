package omi.nairobi.nairobiequities.snapshot.mitch.v1_22.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.ExecutedQuantityField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.LastOptPxField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.NanosecondField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.OffBookTradeTypeField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.PriceField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.SymbolField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.TradeDateField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.TradeIdField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.TradeTimeField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.UnderlyingReferencePriceField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.fields.VolatilityField;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.types.Field;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.types.Message;
import omi.nairobi.nairobiequities.snapshot.mitch.v1_22.types.PrintOptions;

/**
 * Represents the OffBookTradeMessage message from the Snapshot protocol.
 *
 * <p>Sent to report the details of an off-book trade.</p>
 */
public final class OffBookTradeMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 76;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Off Book Trade Message";

    /**
     * Nanoseconds offset from the last Time message.
     */
    private final NanosecondField nanosecond = new NanosecondField();

    /**
     * Quantity executed.
     */
    private final ExecutedQuantityField executedQuantity = new ExecutedQuantityField();

    /**
     * Instrument's symbol.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Limit price of the order.
     */
    private final PriceField price = new PriceField();

    /**
     * Unique identifier of the trade.
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Type of off-book trade.
     */
    private final OffBookTradeTypeField offBookTradeType = new OffBookTradeTypeField();

    /**
     * Time off-book trade was executed. The time is specified in terms of the local time for the server (i.e. not UTC).
     */
    private final TradeTimeField tradeTime = new TradeTimeField();

    /**
     * Date off-book trade was executed.
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Converted price of the executed volatility of the options instrument.
     */
    private final LastOptPxField lastOptPx = new LastOptPxField();

    /**
     * Converted volatility of the executed price of the options instrument.
     */
    private final VolatilityField volatility = new VolatilityField();

    /**
     * Underlying Reference Price related to converted value calculated upon an options instrument trade execution.
     */
    private final UnderlyingReferencePriceField underlyingReferencePrice = new UnderlyingReferencePriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanosecond, executedQuantity, symbol, price, tradeId, offBookTradeType, tradeTime, tradeDate, lastOptPx, volatility, underlyingReferencePrice);

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
     * Quantity executed.
     *
     * @return the ExecutedQuantity field
     */
    public ExecutedQuantityField executedQuantity() {
        return executedQuantity;
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
     * Unique identifier of the trade.
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Type of off-book trade.
     *
     * @return the OffBookTradeType field
     */
    public OffBookTradeTypeField offBookTradeType() {
        return offBookTradeType;
    }

    /**
     * Time off-book trade was executed. The time is specified in terms of the local time for the server (i.e. not UTC).
     *
     * @return the TradeTime field
     */
    public TradeTimeField tradeTime() {
        return tradeTime;
    }

    /**
     * Date off-book trade was executed.
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Converted price of the executed volatility of the options instrument.
     *
     * @return the LastOptPx field
     */
    public LastOptPxField lastOptPx() {
        return lastOptPx;
    }

    /**
     * Converted volatility of the executed price of the options instrument.
     *
     * @return the Volatility field
     */
    public VolatilityField volatility() {
        return volatility;
    }

    /**
     * Underlying Reference Price related to converted value calculated upon an options instrument trade execution.
     *
     * @return the UnderlyingReferencePrice field
     */
    public UnderlyingReferencePriceField underlyingReferencePrice() {
        return underlyingReferencePrice;
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
        if (!executedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedQuantityField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!offBookTradeType.parse(data, cursor)) {
            return false;
        }
        cursor += OffBookTradeTypeField.BYTE_LENGTH;
        if (!tradeTime.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTimeField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!lastOptPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastOptPxField.BYTE_LENGTH;
        if (!volatility.parse(data, cursor)) {
            return false;
        }
        cursor += VolatilityField.BYTE_LENGTH;
        return underlyingReferencePrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanosecond.encode(data, cursor);
        cursor = executedQuantity.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = offBookTradeType.encode(data, cursor);
        cursor = tradeTime.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = lastOptPx.encode(data, cursor);
        cursor = volatility.encode(data, cursor);
        cursor = underlyingReferencePrice.encode(data, cursor);
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
            case "ExecutedQuantity" -> Optional.of(executedQuantity);
            case "Symbol" -> Optional.of(symbol);
            case "Price" -> Optional.of(price);
            case "TradeId" -> Optional.of(tradeId);
            case "OffBookTradeType" -> Optional.of(offBookTradeType);
            case "TradeTime" -> Optional.of(tradeTime);
            case "TradeDate" -> Optional.of(tradeDate);
            case "LastOptPx" -> Optional.of(lastOptPx);
            case "Volatility" -> Optional.of(volatility);
            case "UnderlyingReferencePrice" -> Optional.of(underlyingReferencePrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OffBookTradeMessage message)) {
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
        if (!(other instanceof OffBookTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
