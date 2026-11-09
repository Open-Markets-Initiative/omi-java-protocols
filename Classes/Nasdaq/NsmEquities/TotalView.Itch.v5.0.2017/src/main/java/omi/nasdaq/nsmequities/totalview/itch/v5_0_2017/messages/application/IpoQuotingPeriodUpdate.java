package omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.fields.IpoPriceField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.fields.IpoQuotationReleaseQualifierField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.fields.IpoQuotationReleaseTimeField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.fields.StockField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.fields.StockLocateField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.fields.TimestampField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.fields.TrackingNumberField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.types.Field;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.types.Message;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.types.PrintOptions;

/**
 * Represents the IpoQuotingPeriodUpdate message from the TotalView protocol.
 *
 * <p>Indicates the anticipated IPO quotation release time of a security.</p>
 */
public final class IpoQuotingPeriodUpdate implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'K';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 27;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Ipo Quoting Period Update";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Always 0
     */
    private final StockLocateField stockLocate = new StockLocateField();

    /**
     * NASDAQ OMX internal tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Denotes the security symbol for the issue in the NASDAQ execution system.
     */
    private final StockField stock = new StockField();

    /**
     * Denotes the IPO release time, in seconds since midnight, for quotation to the nearest second.
     */
    private final IpoQuotationReleaseTimeField ipoQuotationReleaseTime = new IpoQuotationReleaseTimeField();

    /**
     * Anticipated quotation release time. This value would be used when NASDAQ Market Operations initially enters the IPO instrument for release.IPO release canceled/postponed.This value would be used when NASDAQ Market Operations cancels or postpones the release of the IPO instrument.
     */
    private final IpoQuotationReleaseQualifierField ipoQuotationReleaseQualifier = new IpoQuotationReleaseQualifierField();

    /**
     * Denotes the IPO price to be used for intraday net change calculations. Prices are given in decimal format with 6 whole number places followed by 4 decimal digits.
     */
    private final IpoPriceField ipoPrice = new IpoPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(stockLocate, trackingNumber, timestampField, stock, ipoQuotationReleaseTime, ipoQuotationReleaseQualifier, ipoPrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Always 0
     *
     * @return the StockLocate field
     */
    public StockLocateField stockLocate() {
        return stockLocate;
    }

    /**
     * NASDAQ OMX internal tracking number
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
     * Denotes the security symbol for the issue in the NASDAQ execution system.
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
     * Anticipated quotation release time. This value would be used when NASDAQ Market Operations initially enters the IPO instrument for release.IPO release canceled/postponed.This value would be used when NASDAQ Market Operations cancels or postpones the release of the IPO instrument.
     *
     * @return the IpoQuotationReleaseQualifier field
     */
    public IpoQuotationReleaseQualifierField ipoQuotationReleaseQualifier() {
        return ipoQuotationReleaseQualifier;
    }

    /**
     * Denotes the IPO price to be used for intraday net change calculations. Prices are given in decimal format with 6 whole number places followed by 4 decimal digits.
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
        return PADDING.clone();
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
        if (!stockLocate.parse(data, cursor)) {
            return false;
        }
        cursor += StockLocateField.BYTE_LENGTH;
        if (!trackingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TrackingNumberField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
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
        if (!ipoPrice.parse(data, cursor)) {
            return false;
        }
        cursor += IpoPriceField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = stockLocate.encode(data, cursor);
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
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
            case "StockLocate" -> Optional.of(stockLocate);
            case "TrackingNumber" -> Optional.of(trackingNumber);
            case "Timestamp" -> Optional.of(timestampField);
            case "Stock" -> Optional.of(stock);
            case "IpoQuotationReleaseTime" -> Optional.of(ipoQuotationReleaseTime);
            case "IpoQuotationReleaseQualifier" -> Optional.of(ipoQuotationReleaseQualifier);
            case "IpoPrice" -> Optional.of(ipoPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof IpoQuotingPeriodUpdate message)) {
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
        if (!(other instanceof IpoQuotingPeriodUpdate message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
