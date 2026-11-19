package omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.fields.CustSizeLongField;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.fields.InstrumentIdField;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.fields.MarketOrderSizeLongField;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.fields.PriceLongField;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.fields.ProcustSizeLongField;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.fields.QuoteConditionField;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.fields.SizeLongField;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.fields.TimestampField;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.fields.TrackingNumberField;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.types.Field;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.types.Message;
import omi.nasdaq.mrxoptions.topofmarket.itch.v2_1.types.PrintOptions;

/**
 * Represents the BestBidUpdateLongFormMessage message from the TopOfMarket protocol.
 *
 * <p>This message is the same as the Best Bid OR Ask Update Message - Short Form described above except that Prices and Sizes are 4 byte Integers, the price having 4 implied decimal places.</p>
 */
public final class BestBidUpdateLongFormMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'B';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 35;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Best Bid Update Long Form Message";

    /**
     * Internal system tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Integer ID of the option, as defined in the Options Directory Message.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Quote condition
     */
    private final QuoteConditionField quoteCondition = new QuoteConditionField();

    /**
     * Number of market order contracts on the bid or ask side
     */
    private final MarketOrderSizeLongField marketOrderSizeLong = new MarketOrderSizeLongField();

    /**
     * Best bid or ask price in fixed point format with 6 whole number places followed by 4 decimal digits, the side determined by Message Type.
     */
    private final PriceLongField priceLong = new PriceLongField();

    /**
     * Aggregated number of contracts on the bid or ask side being displayed in the options market at the current time.
     */
    private final SizeLongField sizeLong = new SizeLongField();

    /**
     * Customer quantity on the bid and ask side.
     */
    private final CustSizeLongField custSizeLong = new CustSizeLongField();

    /**
     * Customer professional quantity on the bid or ask side.
     */
    private final ProcustSizeLongField procustSizeLong = new ProcustSizeLongField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(trackingNumber, timestampField, instrumentId, quoteCondition, marketOrderSizeLong, priceLong, sizeLong, custSizeLong, procustSizeLong);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Internal system tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Nanoseconds since midnight.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Integer ID of the option, as defined in the Options Directory Message.
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Quote condition
     *
     * @return the QuoteCondition field
     */
    public QuoteConditionField quoteCondition() {
        return quoteCondition;
    }

    /**
     * Number of market order contracts on the bid or ask side
     *
     * @return the MarketOrderSizeLong field
     */
    public MarketOrderSizeLongField marketOrderSizeLong() {
        return marketOrderSizeLong;
    }

    /**
     * Best bid or ask price in fixed point format with 6 whole number places followed by 4 decimal digits, the side determined by Message Type.
     *
     * @return the PriceLong field
     */
    public PriceLongField priceLong() {
        return priceLong;
    }

    /**
     * Aggregated number of contracts on the bid or ask side being displayed in the options market at the current time.
     *
     * @return the SizeLong field
     */
    public SizeLongField sizeLong() {
        return sizeLong;
    }

    /**
     * Customer quantity on the bid and ask side.
     *
     * @return the CustSizeLong field
     */
    public CustSizeLongField custSizeLong() {
        return custSizeLong;
    }

    /**
     * Customer professional quantity on the bid or ask side.
     *
     * @return the ProcustSizeLong field
     */
    public ProcustSizeLongField procustSizeLong() {
        return procustSizeLong;
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
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!quoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteConditionField.BYTE_LENGTH;
        if (!marketOrderSizeLong.parse(data, cursor)) {
            return false;
        }
        cursor += MarketOrderSizeLongField.BYTE_LENGTH;
        if (!priceLong.parse(data, cursor)) {
            return false;
        }
        cursor += PriceLongField.BYTE_LENGTH;
        if (!sizeLong.parse(data, cursor)) {
            return false;
        }
        cursor += SizeLongField.BYTE_LENGTH;
        if (!custSizeLong.parse(data, cursor)) {
            return false;
        }
        cursor += CustSizeLongField.BYTE_LENGTH;
        return procustSizeLong.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        cursor = marketOrderSizeLong.encode(data, cursor);
        cursor = priceLong.encode(data, cursor);
        cursor = sizeLong.encode(data, cursor);
        cursor = custSizeLong.encode(data, cursor);
        cursor = procustSizeLong.encode(data, cursor);
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
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "Timestamp" -> Optional.of(timestampField);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "MarketOrderSizeLong" -> Optional.of(marketOrderSizeLong);
            case "PriceLong" -> Optional.of(priceLong);
            case "SizeLong" -> Optional.of(sizeLong);
            case "CustSizeLong" -> Optional.of(custSizeLong);
            case "ProcustSizeLong" -> Optional.of(procustSizeLong);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof BestBidUpdateLongFormMessage message)) {
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
        if (!(other instanceof BestBidUpdateLongFormMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
