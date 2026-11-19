package omi.pse.pseequities.basicwithlastsale.itch.v2_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.fields.CbLimitDecimalsField;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.fields.CbLimitDownField;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.fields.CbLimitUpField;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.fields.HighCollarField;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.fields.LowCollarField;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.fields.OrderbookField;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.fields.ShortSellEligibleField;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.fields.TimestampField;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.types.Field;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.types.Message;
import omi.pse.pseequities.basicwithlastsale.itch.v2_3.types.PrintOptions;

/**
 * Represents the OrderbookRestrictionsMessage message from the BasicWithLastSale protocol.
 *
 * <p>Orderbook Restrictions Message.</p>
 */
public final class OrderbookRestrictionsMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'k';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 29;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Orderbook Restrictions Message";

    /**
     * Nanoseconds since last Time Stamp seconds message.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Used to identify if the event applies to a single orderbook within the Group.
     */
    private final OrderbookField orderbook = new OrderbookField();

    /**
     * Short Sell Eligible.
     */
    private final ShortSellEligibleField shortSellEligible = new ShortSellEligibleField();

    /**
     * Maximum allowed price via static limit.
     */
    private final HighCollarField highCollar = new HighCollarField();

    /**
     * Minimum allowed price via static limit.
     */
    private final LowCollarField lowCollar = new LowCollarField();

    /**
     * Circuit breaker maximum movement allowed up as a percentage from the Last Traded Price (dynamic limit).
     */
    private final CbLimitUpField cbLimitUp = new CbLimitUpField();

    /**
     * Circuit breaker maximum movement allowed down as a percentage from the Last Traded Price (dynamic limit).
     */
    private final CbLimitDownField cbLimitDown = new CbLimitDownField();

    /**
     * Decimals to apply to the CB Limit Up % and CB Limit Down % values.
     */
    private final CbLimitDecimalsField cbLimitDecimals = new CbLimitDecimalsField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, orderbook, shortSellEligible, highCollar, lowCollar, cbLimitUp, cbLimitDown, cbLimitDecimals);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since last Time Stamp seconds message.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Used to identify if the event applies to a single orderbook within the Group.
     *
     * @return the Orderbook field
     */
    public OrderbookField orderbook() {
        return orderbook;
    }

    /**
     * Short Sell Eligible.
     *
     * @return the ShortSellEligible field
     */
    public ShortSellEligibleField shortSellEligible() {
        return shortSellEligible;
    }

    /**
     * Maximum allowed price via static limit.
     *
     * @return the HighCollar field
     */
    public HighCollarField highCollar() {
        return highCollar;
    }

    /**
     * Minimum allowed price via static limit.
     *
     * @return the LowCollar field
     */
    public LowCollarField lowCollar() {
        return lowCollar;
    }

    /**
     * Circuit breaker maximum movement allowed up as a percentage from the Last Traded Price (dynamic limit).
     *
     * @return the CbLimitUp field
     */
    public CbLimitUpField cbLimitUp() {
        return cbLimitUp;
    }

    /**
     * Circuit breaker maximum movement allowed down as a percentage from the Last Traded Price (dynamic limit).
     *
     * @return the CbLimitDown field
     */
    public CbLimitDownField cbLimitDown() {
        return cbLimitDown;
    }

    /**
     * Decimals to apply to the CB Limit Up % and CB Limit Down % values.
     *
     * @return the CbLimitDecimals field
     */
    public CbLimitDecimalsField cbLimitDecimals() {
        return cbLimitDecimals;
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
        if (!orderbook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderbookField.BYTE_LENGTH;
        if (!shortSellEligible.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSellEligibleField.BYTE_LENGTH;
        if (!highCollar.parse(data, cursor)) {
            return false;
        }
        cursor += HighCollarField.BYTE_LENGTH;
        if (!lowCollar.parse(data, cursor)) {
            return false;
        }
        cursor += LowCollarField.BYTE_LENGTH;
        if (!cbLimitUp.parse(data, cursor)) {
            return false;
        }
        cursor += CbLimitUpField.BYTE_LENGTH;
        if (!cbLimitDown.parse(data, cursor)) {
            return false;
        }
        cursor += CbLimitDownField.BYTE_LENGTH;
        return cbLimitDecimals.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = orderbook.encode(data, cursor);
        cursor = shortSellEligible.encode(data, cursor);
        cursor = highCollar.encode(data, cursor);
        cursor = lowCollar.encode(data, cursor);
        cursor = cbLimitUp.encode(data, cursor);
        cursor = cbLimitDown.encode(data, cursor);
        cursor = cbLimitDecimals.encode(data, cursor);
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
            case "Orderbook" -> Optional.of(orderbook);
            case "ShortSellEligible" -> Optional.of(shortSellEligible);
            case "HighCollar" -> Optional.of(highCollar);
            case "LowCollar" -> Optional.of(lowCollar);
            case "CbLimitUp" -> Optional.of(cbLimitUp);
            case "CbLimitDown" -> Optional.of(cbLimitDown);
            case "CbLimitDecimals" -> Optional.of(cbLimitDecimals);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderbookRestrictionsMessage message)) {
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
        if (!(other instanceof OrderbookRestrictionsMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
