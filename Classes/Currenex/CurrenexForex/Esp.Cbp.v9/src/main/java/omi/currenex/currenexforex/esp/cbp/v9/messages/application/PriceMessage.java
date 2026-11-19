package omi.currenex.currenexforex.esp.cbp.v9.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.currenex.currenexforex.esp.cbp.v9.fields.AttributedField;
import omi.currenex.currenexforex.esp.cbp.v9.fields.InstrumentIndexField;
import omi.currenex.currenexforex.esp.cbp.v9.fields.MaxAmountField;
import omi.currenex.currenexforex.esp.cbp.v9.fields.MinAmountField;
import omi.currenex.currenexforex.esp.cbp.v9.fields.PriceField;
import omi.currenex.currenexforex.esp.cbp.v9.fields.PriceIdField;
import omi.currenex.currenexforex.esp.cbp.v9.fields.PriceProviderField;
import omi.currenex.currenexforex.esp.cbp.v9.fields.SideField;
import omi.currenex.currenexforex.esp.cbp.v9.types.Field;
import omi.currenex.currenexforex.esp.cbp.v9.types.Message;
import omi.currenex.currenexforex.esp.cbp.v9.types.PrintOptions;

/**
 * Represents the PriceMessage message from the Esp protocol.
 *
 * <p>Price Message</p>
 */
public final class PriceMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'H';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 29;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Price Message";

    /**
     * Numeric identifier for currency pair identified by the instrument id
     */
    private final InstrumentIndexField instrumentIndex = new InstrumentIndexField();

    /**
     * Id assigned to the price, unique across all currency pairs for the scope of the session
     */
    private final PriceIdField priceId = new PriceIdField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * The maximum amount being offered at this Price
     */
    private final MaxAmountField maxAmount = new MaxAmountField();

    /**
     * The minimum amount being offered at this Price
     */
    private final MinAmountField minAmount = new MinAmountField();

    /**
     * Price rate
     */
    private final PriceField price = new PriceField();

    /**
     * Price rate
     */
    private final AttributedField attributed = new AttributedField();

    /**
     * Market maker id
     */
    private final PriceProviderField priceProvider = new PriceProviderField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentIndex, priceId, side, maxAmount, minAmount, price, attributed, priceProvider);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Numeric identifier for currency pair identified by the instrument id
     *
     * @return the InstrumentIndex field
     */
    public InstrumentIndexField instrumentIndex() {
        return instrumentIndex;
    }

    /**
     * Id assigned to the price, unique across all currency pairs for the scope of the session
     *
     * @return the PriceId field
     */
    public PriceIdField priceId() {
        return priceId;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * The maximum amount being offered at this Price
     *
     * @return the MaxAmount field
     */
    public MaxAmountField maxAmount() {
        return maxAmount;
    }

    /**
     * The minimum amount being offered at this Price
     *
     * @return the MinAmount field
     */
    public MinAmountField minAmount() {
        return minAmount;
    }

    /**
     * Price rate
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Price rate
     *
     * @return the Attributed field
     */
    public AttributedField attributed() {
        return attributed;
    }

    /**
     * Market maker id
     *
     * @return the PriceProvider field
     */
    public PriceProviderField priceProvider() {
        return priceProvider;
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
        if (!instrumentIndex.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIndexField.BYTE_LENGTH;
        if (!priceId.parse(data, cursor)) {
            return false;
        }
        cursor += PriceIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!maxAmount.parse(data, cursor)) {
            return false;
        }
        cursor += MaxAmountField.BYTE_LENGTH;
        if (!minAmount.parse(data, cursor)) {
            return false;
        }
        cursor += MinAmountField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!attributed.parse(data, cursor)) {
            return false;
        }
        cursor += AttributedField.BYTE_LENGTH;
        return priceProvider.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentIndex.encode(data, cursor);
        cursor = priceId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = maxAmount.encode(data, cursor);
        cursor = minAmount.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = attributed.encode(data, cursor);
        cursor = priceProvider.encode(data, cursor);
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
            case "InstrumentIndex" -> Optional.of(instrumentIndex);
            case "PriceId" -> Optional.of(priceId);
            case "Side" -> Optional.of(side);
            case "MaxAmount" -> Optional.of(maxAmount);
            case "MinAmount" -> Optional.of(minAmount);
            case "Price" -> Optional.of(price);
            case "Attributed" -> Optional.of(attributed);
            case "PriceProvider" -> Optional.of(priceProvider);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PriceMessage message)) {
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
        if (!(other instanceof PriceMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
