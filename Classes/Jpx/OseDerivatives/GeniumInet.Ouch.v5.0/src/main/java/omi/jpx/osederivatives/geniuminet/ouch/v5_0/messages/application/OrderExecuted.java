package omi.jpx.osederivatives.geniuminet.ouch.v5_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.fields.ComboGroupIdField;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.fields.DealSourceField;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.fields.MatchIdField;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.fields.OrderBookIdField;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.fields.OrderTokenField;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.fields.TimestampNanosecondsField;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.fields.TradePriceField;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.fields.TradedQuantityField;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.types.Field;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.types.Message;
import omi.jpx.osederivatives.geniuminet.ouch.v5_0.types.PrintOptions;

/**
 * Represents the OrderExecuted message from the GeniumInet protocol.
 *
 * <p>System notification indicating that an order (or order leg) has been executed.</p>
 */
public final class OrderExecuted implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'E';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 51;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Executed";

    /**
     * UNIX timestamp in nanoseconds since 1970-01-01 00:00:00 UTC.
     */
    private final TimestampNanosecondsField timestampNanoseconds = new TimestampNanosecondsField();

    /**
     * Client-generated unique order identifier.
     */
    private final OrderTokenField orderToken = new OrderTokenField();

    /**
     * Order book identifier. The Order Book ID can be obtained via ITCH.
     */
    private final OrderBookIdField orderBookId = new OrderBookIdField();

    /**
     * Quantity executed in this trade.
     */
    private final TradedQuantityField tradedQuantity = new TradedQuantityField();

    /**
     * Signed integer trade price. Number of decimals is defined by the Order Book Directory message in ITCH.
     */
    private final TradePriceField tradePrice = new TradePriceField();

    /**
     * Backend-generated match identifier. May not be unique; quantities with the same MatchID should be aggregated.
     */
    private final MatchIdField matchId = new MatchIdField();

    /**
     * Identifier for combination trading executions. Zero for trades not related to combination trading.
     */
    private final ComboGroupIdField comboGroupId = new ComboGroupIdField();

    /**
     * Deal source code equivalent to the OMNet deal_source indicating how the execution occurred.
     */
    private final DealSourceField dealSource = new DealSourceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampNanoseconds, orderToken, orderBookId, tradedQuantity, tradePrice, matchId, comboGroupId, dealSource);

    private byte[] buffer;

    private boolean decoded;

    /**
     * UNIX timestamp in nanoseconds since 1970-01-01 00:00:00 UTC.
     *
     * @return the TimestampNanoseconds field
     */
    public TimestampNanosecondsField timestampNanoseconds() {
        return timestampNanoseconds;
    }

    /**
     * Client-generated unique order identifier.
     *
     * @return the OrderToken field
     */
    public OrderTokenField orderToken() {
        return orderToken;
    }

    /**
     * Order book identifier. The Order Book ID can be obtained via ITCH.
     *
     * @return the OrderBookId field
     */
    public OrderBookIdField orderBookId() {
        return orderBookId;
    }

    /**
     * Quantity executed in this trade.
     *
     * @return the TradedQuantity field
     */
    public TradedQuantityField tradedQuantity() {
        return tradedQuantity;
    }

    /**
     * Signed integer trade price. Number of decimals is defined by the Order Book Directory message in ITCH.
     *
     * @return the TradePrice field
     */
    public TradePriceField tradePrice() {
        return tradePrice;
    }

    /**
     * Backend-generated match identifier. May not be unique; quantities with the same MatchID should be aggregated.
     *
     * @return the MatchId field
     */
    public MatchIdField matchId() {
        return matchId;
    }

    /**
     * Identifier for combination trading executions. Zero for trades not related to combination trading.
     *
     * @return the ComboGroupId field
     */
    public ComboGroupIdField comboGroupId() {
        return comboGroupId;
    }

    /**
     * Deal source code equivalent to the OMNet deal_source indicating how the execution occurred.
     *
     * @return the DealSource field
     */
    public DealSourceField dealSource() {
        return dealSource;
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
        return Optional.ofNullable(timestampNanoseconds.value());
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
        if (!timestampNanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampNanosecondsField.BYTE_LENGTH;
        if (!orderToken.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTokenField.BYTE_LENGTH;
        if (!orderBookId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookIdField.BYTE_LENGTH;
        if (!tradedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += TradedQuantityField.BYTE_LENGTH;
        if (!tradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += TradePriceField.BYTE_LENGTH;
        if (!matchId.parse(data, cursor)) {
            return false;
        }
        cursor += MatchIdField.BYTE_LENGTH;
        if (!comboGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += ComboGroupIdField.BYTE_LENGTH;
        return dealSource.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampNanoseconds.encode(data, cursor);
        cursor = orderToken.encode(data, cursor);
        cursor = orderBookId.encode(data, cursor);
        cursor = tradedQuantity.encode(data, cursor);
        cursor = tradePrice.encode(data, cursor);
        cursor = matchId.encode(data, cursor);
        cursor = comboGroupId.encode(data, cursor);
        cursor = dealSource.encode(data, cursor);
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
            case "TimestampNanoseconds" -> Optional.of(timestampNanoseconds);
            case "OrderToken" -> Optional.of(orderToken);
            case "OrderBookId" -> Optional.of(orderBookId);
            case "TradedQuantity" -> Optional.of(tradedQuantity);
            case "TradePrice" -> Optional.of(tradePrice);
            case "MatchId" -> Optional.of(matchId);
            case "ComboGroupId" -> Optional.of(comboGroupId);
            case "DealSource" -> Optional.of(dealSource);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderExecuted message)) {
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
        if (!(other instanceof OrderExecuted message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
