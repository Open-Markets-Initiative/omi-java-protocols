package omi.cboe.c1options.complextop.spin.v1_1_54.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c1options.complextop.spin.v1_1_54.fields.AskCustomerQuantityLongField;
import omi.cboe.c1options.complextop.spin.v1_1_54.fields.AskPriceLongField;
import omi.cboe.c1options.complextop.spin.v1_1_54.fields.AskQuantityLongField;
import omi.cboe.c1options.complextop.spin.v1_1_54.fields.BidCustomerQuantityLongField;
import omi.cboe.c1options.complextop.spin.v1_1_54.fields.BidPriceLongField;
import omi.cboe.c1options.complextop.spin.v1_1_54.fields.BidQuantityLongField;
import omi.cboe.c1options.complextop.spin.v1_1_54.fields.BitFieldsField;
import omi.cboe.c1options.complextop.spin.v1_1_54.fields.ComplexInstrumentIdField;
import omi.cboe.c1options.complextop.spin.v1_1_54.fields.TimeOffsetField;
import omi.cboe.c1options.complextop.spin.v1_1_54.types.Field;
import omi.cboe.c1options.complextop.spin.v1_1_54.types.Message;
import omi.cboe.c1options.complextop.spin.v1_1_54.types.PrintOptions;

/**
 * Represents the TwoSideUpdateExpandedLongMessage message from the ComplexTop protocol.
 *
 * <p>Two Side Update messages provide an updated price and size for both sides of a Complex Instrument ID. The Two Side Update Expanded (Long) message is used when the Price cannot be represented by a Binary Short Price or the Quantity cannot be represented by an unsigned 16-bit integer.</p>
 */
public final class TwoSideUpdateExpandedLongMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 43;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Two Side Update Expanded Long Message";

    /**
     * Nanosecond offset from last unit timestamp.
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Complex Instrument Id right padded with spaces.
     */
    private final ComplexInstrumentIdField complexInstrumentId = new ComplexInstrumentIdField();

    /**
     * Reserved bit field used in Single Side Update and Two Side Update messages. All 8 bits are reserved for Complex Multicast TOP.
     */
    private final BitFieldsField bitFields = new BitFieldsField();

    /**
     * Bid Price (may be a zero or negative price for some instruments).
     */
    private final BidPriceLongField bidPriceLong = new BidPriceLongField();

    /**
     * Total number of contracts on the inside bid (customer and non-customer). A zero value denotes there is no bid.
     */
    private final BidQuantityLongField bidQuantityLong = new BidQuantityLongField();

    /**
     * Number of customer contracts on the inside bid. A zero value denotes that there are no customer contracts at the inside price.
     */
    private final BidCustomerQuantityLongField bidCustomerQuantityLong = new BidCustomerQuantityLongField();

    /**
     * Ask Price (may be a zero or negative price for some instruments).
     */
    private final AskPriceLongField askPriceLong = new AskPriceLongField();

    /**
     * Total number of contracts on the inside ask (customer and non-customer). A zero value denotes there is no ask.
     */
    private final AskQuantityLongField askQuantityLong = new AskQuantityLongField();

    /**
     * Number of customer contracts on the inside ask. A zero value denotes that there are no customer contracts at the inside price.
     */
    private final AskCustomerQuantityLongField askCustomerQuantityLong = new AskCustomerQuantityLongField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, complexInstrumentId, bitFields, bidPriceLong, bidQuantityLong, bidCustomerQuantityLong, askPriceLong, askQuantityLong, askCustomerQuantityLong);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp.
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Complex Instrument Id right padded with spaces.
     *
     * @return the ComplexInstrumentId field
     */
    public ComplexInstrumentIdField complexInstrumentId() {
        return complexInstrumentId;
    }

    /**
     * Reserved bit field used in Single Side Update and Two Side Update messages. All 8 bits are reserved for Complex Multicast TOP.
     *
     * @return the BitFields field
     */
    public BitFieldsField bitFields() {
        return bitFields;
    }

    /**
     * Bid Price (may be a zero or negative price for some instruments).
     *
     * @return the BidPriceLong field
     */
    public BidPriceLongField bidPriceLong() {
        return bidPriceLong;
    }

    /**
     * Total number of contracts on the inside bid (customer and non-customer). A zero value denotes there is no bid.
     *
     * @return the BidQuantityLong field
     */
    public BidQuantityLongField bidQuantityLong() {
        return bidQuantityLong;
    }

    /**
     * Number of customer contracts on the inside bid. A zero value denotes that there are no customer contracts at the inside price.
     *
     * @return the BidCustomerQuantityLong field
     */
    public BidCustomerQuantityLongField bidCustomerQuantityLong() {
        return bidCustomerQuantityLong;
    }

    /**
     * Ask Price (may be a zero or negative price for some instruments).
     *
     * @return the AskPriceLong field
     */
    public AskPriceLongField askPriceLong() {
        return askPriceLong;
    }

    /**
     * Total number of contracts on the inside ask (customer and non-customer). A zero value denotes there is no ask.
     *
     * @return the AskQuantityLong field
     */
    public AskQuantityLongField askQuantityLong() {
        return askQuantityLong;
    }

    /**
     * Number of customer contracts on the inside ask. A zero value denotes that there are no customer contracts at the inside price.
     *
     * @return the AskCustomerQuantityLong field
     */
    public AskCustomerQuantityLongField askCustomerQuantityLong() {
        return askCustomerQuantityLong;
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
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        if (!complexInstrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += ComplexInstrumentIdField.BYTE_LENGTH;
        if (!bitFields.parse(data, cursor)) {
            return false;
        }
        cursor += BitFieldsField.BYTE_LENGTH;
        if (!bidPriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceLongField.BYTE_LENGTH;
        if (!bidQuantityLong.parse(data, cursor)) {
            return false;
        }
        cursor += BidQuantityLongField.BYTE_LENGTH;
        if (!bidCustomerQuantityLong.parse(data, cursor)) {
            return false;
        }
        cursor += BidCustomerQuantityLongField.BYTE_LENGTH;
        if (!askPriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceLongField.BYTE_LENGTH;
        if (!askQuantityLong.parse(data, cursor)) {
            return false;
        }
        cursor += AskQuantityLongField.BYTE_LENGTH;
        return askCustomerQuantityLong.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = complexInstrumentId.encode(data, cursor);
        cursor = bitFields.encode(data, cursor);
        cursor = bidPriceLong.encode(data, cursor);
        cursor = bidQuantityLong.encode(data, cursor);
        cursor = bidCustomerQuantityLong.encode(data, cursor);
        cursor = askPriceLong.encode(data, cursor);
        cursor = askQuantityLong.encode(data, cursor);
        cursor = askCustomerQuantityLong.encode(data, cursor);
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
            case "TimeOffset" -> Optional.of(timeOffset);
            case "ComplexInstrumentId" -> Optional.of(complexInstrumentId);
            case "BitFields" -> Optional.of(bitFields);
            case "BidPriceLong" -> Optional.of(bidPriceLong);
            case "BidQuantityLong" -> Optional.of(bidQuantityLong);
            case "BidCustomerQuantityLong" -> Optional.of(bidCustomerQuantityLong);
            case "AskPriceLong" -> Optional.of(askPriceLong);
            case "AskQuantityLong" -> Optional.of(askQuantityLong);
            case "AskCustomerQuantityLong" -> Optional.of(askCustomerQuantityLong);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TwoSideUpdateExpandedLongMessage message)) {
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
        if (!(other instanceof TwoSideUpdateExpandedLongMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
