package omi.nasdaq.nsmequities.qbbo.itch.v2_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.fields.IpoPriceField;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.fields.IpoQuotationReleaseQualifierField;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.fields.IpoQuotationReleaseTimeField;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.fields.StockField;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.fields.TimeStampField;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.fields.TrackingField;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.types.Field;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.types.Message;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.types.PrintOptions;

/**
 * Represents the IpoQuotingPeriodUpdateMessage message from the Qbbo protocol.
 *
 * <p>Indicates the anticipated IPO quotation release time of a security.</p>
 */
public final class IpoQuotingPeriodUpdateMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'K';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 25;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Ipo Quoting Period Update Message";

    /**
     * Nasdaq internal tracking number
     */
    private final TrackingField tracking = new TrackingField();

    /**
     * Timestamp
     */
    private final TimeStampField timeStamp = new TimeStampField();

    /**
     * Denotes the security symbol for the issue in the execution system.
     */
    private final StockField stock = new StockField();

    /**
     * Denotes the IPO release time, in seconds since midnight, for quotation to the nearest second.
     */
    private final IpoQuotationReleaseTimeField ipoQuotationReleaseTime = new IpoQuotationReleaseTimeField();

    /**
     * Denotes the IPO release qualifier
     */
    private final IpoQuotationReleaseQualifierField ipoQuotationReleaseQualifier = new IpoQuotationReleaseQualifierField();

    /**
     * Denotes the IPO price to be used for intraday net change calculations.
     */
    private final IpoPriceField ipoPrice = new IpoPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tracking, timeStamp, stock, ipoQuotationReleaseTime, ipoQuotationReleaseQualifier, ipoPrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nasdaq internal tracking number
     *
     * @return the Tracking field
     */
    public TrackingField tracking() {
        return tracking;
    }

    /**
     * Timestamp
     *
     * @return the TimeStamp field
     */
    public TimeStampField timeStamp() {
        return timeStamp;
    }

    /**
     * Denotes the security symbol for the issue in the execution system.
     *
     * @return the Stock field
     */
    public StockField stock() {
        return stock;
    }

    /**
     * Denotes the IPO release time, in seconds since midnight, for quotation to the nearest second.
     *
     * @return the IpoQuotationReleaseTime field
     */
    public IpoQuotationReleaseTimeField ipoQuotationReleaseTime() {
        return ipoQuotationReleaseTime;
    }

    /**
     * Denotes the IPO release qualifier
     *
     * @return the IpoQuotationReleaseQualifier field
     */
    public IpoQuotationReleaseQualifierField ipoQuotationReleaseQualifier() {
        return ipoQuotationReleaseQualifier;
    }

    /**
     * Denotes the IPO price to be used for intraday net change calculations.
     *
     * @return the IpoPrice field
     */
    public IpoPriceField ipoPrice() {
        return ipoPrice;
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
        if (!tracking.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingField.BYTE_LENGTH;
        if (!timeStamp.parse(data, cursor)) {
            return false;
        }
        cursor += TimeStampField.BYTE_LENGTH;
        if (!stock.parse(data, cursor)) {
            return false;
        }
        cursor += StockField.BYTE_LENGTH;
        if (!ipoQuotationReleaseTime.parse(data, cursor)) {
            return false;
        }
        cursor += IpoQuotationReleaseTimeField.BYTE_LENGTH;
        if (!ipoQuotationReleaseQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += IpoQuotationReleaseQualifierField.BYTE_LENGTH;
        return ipoPrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = tracking.encode(data, cursor);
        cursor = timeStamp.encode(data, cursor);
        cursor = stock.encode(data, cursor);
        cursor = ipoQuotationReleaseTime.encode(data, cursor);
        cursor = ipoQuotationReleaseQualifier.encode(data, cursor);
        cursor = ipoPrice.encode(data, cursor);
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
            case "Tracking" -> Optional.of(tracking);
            case "TimeStamp" -> Optional.of(timeStamp);
            case "Stock" -> Optional.of(stock);
            case "IpoQuotationReleaseTime" -> Optional.of(ipoQuotationReleaseTime);
            case "IpoQuotationReleaseQualifier" -> Optional.of(ipoQuotationReleaseQualifier);
            case "IpoPrice" -> Optional.of(ipoPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof IpoQuotingPeriodUpdateMessage message)) {
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
        if (!(other instanceof IpoQuotingPeriodUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
