package omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.EntryTypeField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.LastMessageField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.LevelUpdateActionField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.LevelUpdateField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.MarketByLevelPriceField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.MaxDepthField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.OrderBookIdField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.QuantityField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.fields.TimestampNanosecondsField;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.types.Field;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.types.Message;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.types.PrintOptions;

/**
 * Represents the MarketByLevelMessage message from the MarketData protocol.
 */
public final class MarketByLevelMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'W';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 27;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Market By Level Message";

    /**
     * Nanoseconds portion of the timestamp.
     */
    private final TimestampNanosecondsField timestampNanoseconds = new TimestampNanosecondsField();

    /**
     * Denotes the primary identifier of an order book. NOTE: Expired Order book IDs may be reused for new instruments.
     */
    private final OrderBookIdField orderBookId = new OrderBookIdField();

    /**
     * Indicates if the message is the final message in a Market by Level update 0 = Not Last Message 1 = Last Message Where Last Message = 0, there will be more mes- sages to follow to complete the Market by Level update. When Last Message = 1, the full Market by Level update will have been received.
     */
    private final LastMessageField lastMessage = new LastMessageField();

    /**
     * Type of market update action. 0 = New 1 = Change 2 = Delete 3 = Max Depth Where Level Update Action = 3 (Max Depth), the following fields will have a zero (0) value: • Level Update • Entry Type • Price • Quantity.
     */
    private final LevelUpdateActionField levelUpdateAction = new LevelUpdateActionField();

    /**
     * Maximum number of available price levels.
     */
    private final MaxDepthField maxDepth = new MaxDepthField();

    /**
     * Integer to convey the price level of the bid or offer. 1 is the highest level.
     */
    private final LevelUpdateField levelUpdate = new LevelUpdateField();

    /**
     * Valid values: B = Buy S = Sell
     */
    private final EntryTypeField entryType = new EntryTypeField();

    /**
     * Market by Level Price
     */
    private final MarketByLevelPriceField marketByLevelPrice = new MarketByLevelPriceField();

    /**
     * Requested Quote quantity. Zero means any quanti- ty.
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampNanoseconds, orderBookId, lastMessage, levelUpdateAction, maxDepth, levelUpdate, entryType, marketByLevelPrice, quantity);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds portion of the timestamp.
     *
     * @return the TimestampNanoseconds field
     */
    public TimestampNanosecondsField timestampNanoseconds() {
        return timestampNanoseconds;
    }

    /**
     * Denotes the primary identifier of an order book. NOTE: Expired Order book IDs may be reused for new instruments.
     *
     * @return the OrderBookId field
     */
    public OrderBookIdField orderBookId() {
        return orderBookId;
    }

    /**
     * Indicates if the message is the final message in a Market by Level update 0 = Not Last Message 1 = Last Message Where Last Message = 0, there will be more mes- sages to follow to complete the Market by Level update. When Last Message = 1, the full Market by Level update will have been received.
     *
     * @return the LastMessage field
     */
    public LastMessageField lastMessage() {
        return lastMessage;
    }

    /**
     * Type of market update action. 0 = New 1 = Change 2 = Delete 3 = Max Depth Where Level Update Action = 3 (Max Depth), the following fields will have a zero (0) value: • Level Update • Entry Type • Price • Quantity.
     *
     * @return the LevelUpdateAction field
     */
    public LevelUpdateActionField levelUpdateAction() {
        return levelUpdateAction;
    }

    /**
     * Maximum number of available price levels.
     *
     * @return the MaxDepth field
     */
    public MaxDepthField maxDepth() {
        return maxDepth;
    }

    /**
     * Integer to convey the price level of the bid or offer. 1 is the highest level.
     *
     * @return the LevelUpdate field
     */
    public LevelUpdateField levelUpdate() {
        return levelUpdate;
    }

    /**
     * Valid values: B = Buy S = Sell
     *
     * @return the EntryType field
     */
    public EntryTypeField entryType() {
        return entryType;
    }

    /**
     * Market by Level Price
     *
     * @return the MarketByLevelPrice field
     */
    public MarketByLevelPriceField marketByLevelPrice() {
        return marketByLevelPrice;
    }

    /**
     * Requested Quote quantity. Zero means any quanti- ty.
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
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
        if (!timestampNanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampNanosecondsField.BYTE_LENGTH;
        if (!orderBookId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookIdField.BYTE_LENGTH;
        if (!lastMessage.parse(data, cursor)) {
            return false;
        }
        cursor += LastMessageField.BYTE_LENGTH;
        if (!levelUpdateAction.parse(data, cursor)) {
            return false;
        }
        cursor += LevelUpdateActionField.BYTE_LENGTH;
        if (!maxDepth.parse(data, cursor)) {
            return false;
        }
        cursor += MaxDepthField.BYTE_LENGTH;
        if (!levelUpdate.parse(data, cursor)) {
            return false;
        }
        cursor += LevelUpdateField.BYTE_LENGTH;
        if (!entryType.parse(data, cursor)) {
            return false;
        }
        cursor += EntryTypeField.BYTE_LENGTH;
        if (!marketByLevelPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MarketByLevelPriceField.BYTE_LENGTH;
        return quantity.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampNanoseconds.encode(data, cursor);
        cursor = orderBookId.encode(data, cursor);
        cursor = lastMessage.encode(data, cursor);
        cursor = levelUpdateAction.encode(data, cursor);
        cursor = maxDepth.encode(data, cursor);
        cursor = levelUpdate.encode(data, cursor);
        cursor = entryType.encode(data, cursor);
        cursor = marketByLevelPrice.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
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
            case "OrderBookId" -> Optional.of(orderBookId);
            case "LastMessage" -> Optional.of(lastMessage);
            case "LevelUpdateAction" -> Optional.of(levelUpdateAction);
            case "MaxDepth" -> Optional.of(maxDepth);
            case "LevelUpdate" -> Optional.of(levelUpdate);
            case "EntryType" -> Optional.of(entryType);
            case "MarketByLevelPrice" -> Optional.of(marketByLevelPrice);
            case "Quantity" -> Optional.of(quantity);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MarketByLevelMessage message)) {
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
        if (!(other instanceof MarketByLevelMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
