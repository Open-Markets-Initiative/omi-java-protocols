package omi.gpw.wse.streambbo.wats.v1_7_6_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.InstrumentIdField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.PriceUpdateTypeField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.PriceYtmPresenceField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ValueAskField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ValueBidField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.fields.ValueField;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.Field;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.Message;
import omi.gpw.wse.streambbo.wats.v1_7_6_20.types.PrintOptions;

/**
 * Represents the PriceUpdate message from the StreamBbo protocol.
 *
 * <p>Message indicating a price or YTM update</p>
 */
public final class PriceUpdate implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 31;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Price Update";

    /**
     * ID of financial instrument
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Indicates price update message variant
     */
    private final PriceUpdateTypeField priceUpdateType = new PriceUpdateTypeField();

    /**
     * Bit flags indicating the filling of 'value', 'valueAsk', 'valueBid' attributes in the price update message
     */
    private final PriceYtmPresenceField priceYtmPresence = new PriceYtmPresenceField();

    /**
     * Indicates the updated price or YTM
     */
    private final ValueField value = new ValueField();

    /**
     * Indicates the updated bid price or bid YTM
     */
    private final ValueBidField valueBid = new ValueBidField();

    /**
     * Indicates the updated ask price or ask YTM
     */
    private final ValueAskField valueAsk = new ValueAskField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(instrumentId, priceUpdateType, priceYtmPresence, value, valueBid, valueAsk);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID of financial instrument
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Indicates price update message variant
     *
     * @return the PriceUpdateType field
     */
    public PriceUpdateTypeField priceUpdateType() {
        return priceUpdateType;
    }

    /**
     * Bit flags indicating the filling of 'value', 'valueAsk', 'valueBid' attributes in the price update message
     *
     * @return the PriceYtmPresence field
     */
    public PriceYtmPresenceField priceYtmPresence() {
        return priceYtmPresence;
    }

    /**
     * Indicates the updated price or YTM
     *
     * @return the Value field
     */
    public ValueField value() {
        return value;
    }

    /**
     * Indicates the updated bid price or bid YTM
     *
     * @return the ValueBid field
     */
    public ValueBidField valueBid() {
        return valueBid;
    }

    /**
     * Indicates the updated ask price or ask YTM
     *
     * @return the ValueAsk field
     */
    public ValueAskField valueAsk() {
        return valueAsk;
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
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!priceUpdateType.parse(data, cursor)) {
            return false;
        }
        cursor += PriceUpdateTypeField.BYTE_LENGTH;
        if (!priceYtmPresence.parse(data, cursor)) {
            return false;
        }
        cursor += PriceYtmPresenceField.BYTE_LENGTH;
        if (!value.parse(data, cursor)) {
            return false;
        }
        cursor += ValueField.BYTE_LENGTH;
        if (!valueBid.parse(data, cursor)) {
            return false;
        }
        cursor += ValueBidField.BYTE_LENGTH;
        return valueAsk.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = instrumentId.encode(data, cursor);
        cursor = priceUpdateType.encode(data, cursor);
        cursor = priceYtmPresence.encode(data, cursor);
        cursor = value.encode(data, cursor);
        cursor = valueBid.encode(data, cursor);
        cursor = valueAsk.encode(data, cursor);
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
            case "InstrumentId" -> Optional.of(instrumentId);
            case "PriceUpdateType" -> Optional.of(priceUpdateType);
            case "PriceYtmPresence" -> Optional.of(priceYtmPresence);
            case "Value" -> Optional.of(value);
            case "ValueBid" -> Optional.of(valueBid);
            case "ValueAsk" -> Optional.of(valueAsk);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PriceUpdate message)) {
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
        if (!(other instanceof PriceUpdate message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
