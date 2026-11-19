package omi.biva.bivaequities.orderentry.ouch.v1_05.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.biva.bivaequities.orderentry.ouch.v1_05.fields.CounterPartyIdField;
import omi.biva.bivaequities.orderentry.ouch.v1_05.fields.ExecutedPriceField;
import omi.biva.bivaequities.orderentry.ouch.v1_05.fields.ExecutedQuantityField;
import omi.biva.bivaequities.orderentry.ouch.v1_05.fields.LiquidityFlagField;
import omi.biva.bivaequities.orderentry.ouch.v1_05.fields.MatchNumberField;
import omi.biva.bivaequities.orderentry.ouch.v1_05.fields.OrderTokenField;
import omi.biva.bivaequities.orderentry.ouch.v1_05.fields.TimestampField;
import omi.biva.bivaequities.orderentry.ouch.v1_05.types.Field;
import omi.biva.bivaequities.orderentry.ouch.v1_05.types.Message;
import omi.biva.bivaequities.orderentry.ouch.v1_05.types.PrintOptions;

/**
 * Represents the ExecutedOrderMessage message from the OrderEntry protocol.
 *
 * <p>Order executed message</p>
 */
public final class ExecutedOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'E';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 37;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Executed Order Message";

    /**
     * Number of nanoseconds past midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Token must be unique for each Ouch user per trading cycle
     */
    private final OrderTokenField orderToken = new OrderTokenField();

    /**
     * Incremental quantity executed for this execution only
     */
    private final ExecutedQuantityField executedQuantity = new ExecutedQuantityField();

    /**
     * The executed price for executed quantity
     */
    private final ExecutedPriceField executedPrice = new ExecutedPriceField();

    /**
     * Liquidity indicator for this execution
     */
    private final LiquidityFlagField liquidityFlag = new LiquidityFlagField();

    /**
     * Match identifier for each trade, the same for buy and sell sides
     */
    private final MatchNumberField matchNumber = new MatchNumberField();

    /**
     * Counterparty identifier, may contain a masking Ccp or a trading counterparty
     */
    private final CounterPartyIdField counterPartyId = new CounterPartyIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, orderToken, executedQuantity, executedPrice, liquidityFlag, matchNumber, counterPartyId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Number of nanoseconds past midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Token must be unique for each Ouch user per trading cycle
     *
     * @return the OrderToken field
     */
    public OrderTokenField orderToken() {
        return orderToken;
    }

    /**
     * Incremental quantity executed for this execution only
     *
     * @return the ExecutedQuantity field
     */
    public ExecutedQuantityField executedQuantity() {
        return executedQuantity;
    }

    /**
     * The executed price for executed quantity
     *
     * @return the ExecutedPrice field
     */
    public ExecutedPriceField executedPrice() {
        return executedPrice;
    }

    /**
     * Liquidity indicator for this execution
     *
     * @return the LiquidityFlag field
     */
    public LiquidityFlagField liquidityFlag() {
        return liquidityFlag;
    }

    /**
     * Match identifier for each trade, the same for buy and sell sides
     *
     * @return the MatchNumber field
     */
    public MatchNumberField matchNumber() {
        return matchNumber;
    }

    /**
     * Counterparty identifier, may contain a masking Ccp or a trading counterparty
     *
     * @return the CounterPartyId field
     */
    public CounterPartyIdField counterPartyId() {
        return counterPartyId;
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!orderToken.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTokenField.BYTE_LENGTH;
        if (!executedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedQuantityField.BYTE_LENGTH;
        if (!executedPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutedPriceField.BYTE_LENGTH;
        if (!liquidityFlag.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityFlagField.BYTE_LENGTH;
        if (!matchNumber.parse(data, cursor)) {
            return false;
        }
        cursor += MatchNumberField.BYTE_LENGTH;
        return counterPartyId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = orderToken.encode(data, cursor);
        cursor = executedQuantity.encode(data, cursor);
        cursor = executedPrice.encode(data, cursor);
        cursor = liquidityFlag.encode(data, cursor);
        cursor = matchNumber.encode(data, cursor);
        cursor = counterPartyId.encode(data, cursor);
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
            case "OrderToken" -> Optional.of(orderToken);
            case "ExecutedQuantity" -> Optional.of(executedQuantity);
            case "ExecutedPrice" -> Optional.of(executedPrice);
            case "LiquidityFlag" -> Optional.of(liquidityFlag);
            case "MatchNumber" -> Optional.of(matchNumber);
            case "CounterPartyId" -> Optional.of(counterPartyId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutedOrderMessage message)) {
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
        if (!(other instanceof ExecutedOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
