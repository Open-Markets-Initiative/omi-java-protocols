package omi.nasdaq.ntxequities.orders.ouch.v4_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.DisplayField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.ExistingOrderTokenField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.IntermarketSweepEligibilityField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.MinimumQuantityField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.PriceField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.ReplacementOrderTokenField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.SharesField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.fields.TimeInForceField;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.types.Field;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.types.Message;
import omi.nasdaq.ntxequities.orders.ouch.v4_2.types.PrintOptions;

/**
 * Represents the ReplaceOrderMessage message from the Orders protocol.
 */
public final class ReplaceOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'U';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 46;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Replace Order Message";

    /**
     * This must be filled out with the exact Order Token sent on the Enter Order Message or last Replace Order Message.
     */
    private final ExistingOrderTokenField existingOrderToken = new ExistingOrderTokenField();

    /**
     * The Replacement Order Token field as entered
     */
    private final ReplacementOrderTokenField replacementOrderToken = new ReplacementOrderTokenField();

    /**
     * Total number of shares. Must be greater than zero and less than 1,000,000
     */
    private final SharesField shares = new SharesField();

    /**
     * The price of the order. Please refer to the section in Data Types for more clarification.
     */
    private final PriceField price = new PriceField();

    /**
     * The number of seconds that this order should live before being automatically canceled. Special values for Time in Force are listed in Data Types above.
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Display
     */
    private final DisplayField display = new DisplayField();

    /**
     * Intermarket Sweep Eligibility
     */
    private final IntermarketSweepEligibilityField intermarketSweepEligibility = new IntermarketSweepEligibilityField();

    /**
     * Specifies the minimum acceptable quantity to execute
     */
    private final MinimumQuantityField minimumQuantity = new MinimumQuantityField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(existingOrderToken, replacementOrderToken, shares, price, timeInForce, display, intermarketSweepEligibility, minimumQuantity);

    private byte[] buffer;

    private boolean decoded;

    /**
     * This must be filled out with the exact Order Token sent on the Enter Order Message or last Replace Order Message.
     *
     * @return the ExistingOrderToken field
     */
    public ExistingOrderTokenField existingOrderToken() {
        return existingOrderToken;
    }

    /**
     * The Replacement Order Token field as entered
     *
     * @return the ReplacementOrderToken field
     */
    public ReplacementOrderTokenField replacementOrderToken() {
        return replacementOrderToken;
    }

    /**
     * Total number of shares. Must be greater than zero and less than 1,000,000
     *
     * @return the Shares field
     */
    public SharesField shares() {
        return shares;
    }

    /**
     * The price of the order. Please refer to the section in Data Types for more clarification.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The number of seconds that this order should live before being automatically canceled. Special values for Time in Force are listed in Data Types above.
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Display
     *
     * @return the Display field
     */
    public DisplayField display() {
        return display;
    }

    /**
     * Intermarket Sweep Eligibility
     *
     * @return the IntermarketSweepEligibility field
     */
    public IntermarketSweepEligibilityField intermarketSweepEligibility() {
        return intermarketSweepEligibility;
    }

    /**
     * Specifies the minimum acceptable quantity to execute
     *
     * @return the MinimumQuantity field
     */
    public MinimumQuantityField minimumQuantity() {
        return minimumQuantity;
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
        if (!existingOrderToken.parse(data, cursor)) {
            return false;
        }
        cursor += ExistingOrderTokenField.BYTE_LENGTH;
        if (!replacementOrderToken.parse(data, cursor)) {
            return false;
        }
        cursor += ReplacementOrderTokenField.BYTE_LENGTH;
        if (!shares.parse(data, cursor)) {
            return false;
        }
        cursor += SharesField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!display.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayField.BYTE_LENGTH;
        if (!intermarketSweepEligibility.parse(data, cursor)) {
            return false;
        }
        cursor += IntermarketSweepEligibilityField.BYTE_LENGTH;
        return minimumQuantity.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = existingOrderToken.encode(data, cursor);
        cursor = replacementOrderToken.encode(data, cursor);
        cursor = shares.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = display.encode(data, cursor);
        cursor = intermarketSweepEligibility.encode(data, cursor);
        cursor = minimumQuantity.encode(data, cursor);
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
            case "ExistingOrderToken" -> Optional.of(existingOrderToken);
            case "ReplacementOrderToken" -> Optional.of(replacementOrderToken);
            case "Shares" -> Optional.of(shares);
            case "Price" -> Optional.of(price);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "Display" -> Optional.of(display);
            case "IntermarketSweepEligibility" -> Optional.of(intermarketSweepEligibility);
            case "MinimumQuantity" -> Optional.of(minimumQuantity);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ReplaceOrderMessage message)) {
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
        if (!(other instanceof ReplaceOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
