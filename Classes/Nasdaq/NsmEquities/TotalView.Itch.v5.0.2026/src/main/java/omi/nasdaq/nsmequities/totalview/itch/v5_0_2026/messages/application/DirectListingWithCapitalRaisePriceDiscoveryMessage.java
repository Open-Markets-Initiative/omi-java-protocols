package omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.LowerPriceRangeCollarField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.MaximumAllowablePriceField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.MinimumAllowablePriceField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.NearExecutionPriceField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.NearExecutionTimeField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.OpenEligibilityStatusField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.StockField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.StockLocateField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.TimestampField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.TrackingNumberField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.fields.UpperPriceRangeCollarField;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.types.Field;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.types.Message;
import omi.nasdaq.nsmequities.totalview.itch.v5_0_2026.types.PrintOptions;

/**
 * Represents the DirectListingWithCapitalRaisePriceDiscoveryMessage message from the TotalView protocol.
 *
 * <p>This message is disseminated only for Direct Listing with Capital Raise (DLCR) securities</p>
 */
public final class DirectListingWithCapitalRaisePriceDiscoveryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'O';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 47;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Direct Listing With Capital Raise Price Discovery Message";

    /**
     * Locate Code uniquely assigned to the security symbol for the day
     */
    private final StockLocateField stockLocate = new StockLocateField();

    /**
     * Nasdaq internal tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Denotes the security symbol for the issue in the NASDAQ execution system.
     */
    private final StockField stock = new StockField();

    /**
     * Indicates if the security is eligible to be released for trading
     */
    private final OpenEligibilityStatusField openEligibilityStatus = new OpenEligibilityStatusField();

    /**
     * 20% below Registration Statement Lower Price
     */
    private final MinimumAllowablePriceField minimumAllowablePrice = new MinimumAllowablePriceField();

    /**
     * 80% above Registration Statement Highest Price
     */
    private final MaximumAllowablePriceField maximumAllowablePrice = new MaximumAllowablePriceField();

    /**
     * The current reference price when the DLCR volatility test has successfully passed
     */
    private final NearExecutionPriceField nearExecutionPrice = new NearExecutionPriceField();

    /**
     * The time at which the Near Execution Price was determined
     */
    private final NearExecutionTimeField nearExecutionTime = new NearExecutionTimeField();

    /**
     * Indicates the price of the Lower Auction Collar Threshold
     */
    private final LowerPriceRangeCollarField lowerPriceRangeCollar = new LowerPriceRangeCollarField();

    /**
     * Indicates the price of the Upper Auction Collar Threshold
     */
    private final UpperPriceRangeCollarField upperPriceRangeCollar = new UpperPriceRangeCollarField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(stockLocate, trackingNumber, timestampField, stock, openEligibilityStatus, minimumAllowablePrice, maximumAllowablePrice, nearExecutionPrice, nearExecutionTime, lowerPriceRangeCollar, upperPriceRangeCollar);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Locate Code uniquely assigned to the security symbol for the day
     *
     * @return the StockLocate field
     */
    public StockLocateField stockLocate() {
        return stockLocate;
    }

    /**
     * Nasdaq internal tracking number
     *
     * @return the TrackingNumber field
     */
    public TrackingNumberField trackingNumber() {
        return trackingNumber;
    }

    /**
     * Nanoseconds since midnight
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
     * Indicates if the security is eligible to be released for trading
     *
     * @return the OpenEligibilityStatus field
     */
    public OpenEligibilityStatusField openEligibilityStatus() {
        return openEligibilityStatus;
    }

    /**
     * 20% below Registration Statement Lower Price
     *
     * @return the MinimumAllowablePrice field
     */
    public MinimumAllowablePriceField minimumAllowablePrice() {
        return minimumAllowablePrice;
    }

    /**
     * 80% above Registration Statement Highest Price
     *
     * @return the MaximumAllowablePrice field
     */
    public MaximumAllowablePriceField maximumAllowablePrice() {
        return maximumAllowablePrice;
    }

    /**
     * The current reference price when the DLCR volatility test has successfully passed
     *
     * @return the NearExecutionPrice field
     */
    public NearExecutionPriceField nearExecutionPrice() {
        return nearExecutionPrice;
    }

    /**
     * The time at which the Near Execution Price was determined
     *
     * @return the NearExecutionTime field
     */
    public NearExecutionTimeField nearExecutionTime() {
        return nearExecutionTime;
    }

    /**
     * Indicates the price of the Lower Auction Collar Threshold
     *
     * @return the LowerPriceRangeCollar field
     */
    public LowerPriceRangeCollarField lowerPriceRangeCollar() {
        return lowerPriceRangeCollar;
    }

    /**
     * Indicates the price of the Upper Auction Collar Threshold
     *
     * @return the UpperPriceRangeCollar field
     */
    public UpperPriceRangeCollarField upperPriceRangeCollar() {
        return upperPriceRangeCollar;
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
        if (!openEligibilityStatus.parse(data, cursor)) {
            return false;
        }
        cursor += OpenEligibilityStatusField.BYTE_LENGTH;
        if (!minimumAllowablePrice.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumAllowablePriceField.BYTE_LENGTH;
        if (!maximumAllowablePrice.parse(data, cursor)) {
            return false;
        }
        cursor += MaximumAllowablePriceField.BYTE_LENGTH;
        if (!nearExecutionPrice.parse(data, cursor)) {
            return false;
        }
        cursor += NearExecutionPriceField.BYTE_LENGTH;
        if (!nearExecutionTime.parse(data, cursor)) {
            return false;
        }
        cursor += NearExecutionTimeField.BYTE_LENGTH;
        if (!lowerPriceRangeCollar.parse(data, cursor)) {
            return false;
        }
        cursor += LowerPriceRangeCollarField.BYTE_LENGTH;
        return upperPriceRangeCollar.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = stockLocate.encode(data, cursor);
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = stock.encode(data, cursor);
        cursor = openEligibilityStatus.encode(data, cursor);
        cursor = minimumAllowablePrice.encode(data, cursor);
        cursor = maximumAllowablePrice.encode(data, cursor);
        cursor = nearExecutionPrice.encode(data, cursor);
        cursor = nearExecutionTime.encode(data, cursor);
        cursor = lowerPriceRangeCollar.encode(data, cursor);
        cursor = upperPriceRangeCollar.encode(data, cursor);
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
            case "OpenEligibilityStatus" -> Optional.of(openEligibilityStatus);
            case "MinimumAllowablePrice" -> Optional.of(minimumAllowablePrice);
            case "MaximumAllowablePrice" -> Optional.of(maximumAllowablePrice);
            case "NearExecutionPrice" -> Optional.of(nearExecutionPrice);
            case "NearExecutionTime" -> Optional.of(nearExecutionTime);
            case "LowerPriceRangeCollar" -> Optional.of(lowerPriceRangeCollar);
            case "UpperPriceRangeCollar" -> Optional.of(upperPriceRangeCollar);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DirectListingWithCapitalRaisePriceDiscoveryMessage message)) {
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
        if (!(other instanceof DirectListingWithCapitalRaisePriceDiscoveryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
