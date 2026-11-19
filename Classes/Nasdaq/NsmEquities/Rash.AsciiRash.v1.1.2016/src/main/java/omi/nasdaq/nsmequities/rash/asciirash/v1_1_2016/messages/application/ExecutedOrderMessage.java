package omi.nasdaq.nsmequities.rash.asciirash.v1_1_2016.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.rash.asciirash.v1_1_2016.fields.LiquidityField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_1_2016.fields.MatchNumberField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_1_2016.fields.OrderTokenClientOrderIdField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_1_2016.fields.PriceField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_1_2016.fields.SharesField;
import omi.nasdaq.nsmequities.rash.asciirash.v1_1_2016.types.Field;
import omi.nasdaq.nsmequities.rash.asciirash.v1_1_2016.types.Message;
import omi.nasdaq.nsmequities.rash.asciirash.v1_1_2016.types.PrintOptions;

/**
 * Represents the ExecutedOrderMessage message from the Rash protocol.
 *
 * <p>An Executed Order Message informs you that all or part of an order has been executed.</p>
 */
public final class ExecutedOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'E';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 40;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Executed Order Message";

    /**
     * Token must be day unique for each RASH port account.
     */
    private final OrderTokenClientOrderIdField orderTokenClientOrderId = new OrderTokenClientOrderIdField();

    /**
     * Specify zero to cancel the order; otherwise the new intended order size.
     */
    private final SharesField shares = new SharesField();

    /**
     * Price, 6 whole and 4 implied decimal digits.
     */
    private final PriceField price = new PriceField();

    /**
     * See Liquidity Flags.
     */
    private final LiquidityField liquidity = new LiquidityField();

    /**
     * Assigned to each match executed. Each match consists of one buy and one sell; the matching buy and sell executions share the same match number.
     */
    private final MatchNumberField matchNumber = new MatchNumberField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(orderTokenClientOrderId, shares, price, liquidity, matchNumber);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Token must be day unique for each RASH port account.
     *
     * @return the OrderTokenClientOrderId field
     */
    public OrderTokenClientOrderIdField orderTokenClientOrderId() {
        return orderTokenClientOrderId;
    }

    /**
     * Specify zero to cancel the order; otherwise the new intended order size.
     *
     * @return the Shares field
     */
    public SharesField shares() {
        return shares;
    }

    /**
     * Price, 6 whole and 4 implied decimal digits.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * See Liquidity Flags.
     *
     * @return the Liquidity field
     */
    public LiquidityField liquidity() {
        return liquidity;
    }

    /**
     * Assigned to each match executed. Each match consists of one buy and one sell; the matching buy and sell executions share the same match number.
     *
     * @return the MatchNumber field
     */
    public MatchNumberField matchNumber() {
        return matchNumber;
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
        if (!orderTokenClientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTokenClientOrderIdField.BYTE_LENGTH;
        if (!shares.parse(data, cursor)) {
            return false;
        }
        cursor += SharesField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!liquidity.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityField.BYTE_LENGTH;
        return matchNumber.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = orderTokenClientOrderId.encode(data, cursor);
        cursor = shares.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = liquidity.encode(data, cursor);
        cursor = matchNumber.encode(data, cursor);
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
            case "OrderTokenClientOrderId" -> Optional.of(orderTokenClientOrderId);
            case "Shares" -> Optional.of(shares);
            case "Price" -> Optional.of(price);
            case "Liquidity" -> Optional.of(liquidity);
            case "MatchNumber" -> Optional.of(matchNumber);
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
