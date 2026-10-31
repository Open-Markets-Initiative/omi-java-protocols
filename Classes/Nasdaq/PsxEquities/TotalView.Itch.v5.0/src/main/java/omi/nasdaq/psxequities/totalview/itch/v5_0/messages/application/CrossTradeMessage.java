package omi.nasdaq.psxequities.totalview.itch.v5_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.psxequities.totalview.itch.v5_0.fields.CrossPriceField;
import omi.nasdaq.psxequities.totalview.itch.v5_0.fields.CrossSharesField;
import omi.nasdaq.psxequities.totalview.itch.v5_0.fields.CrossTypeField;
import omi.nasdaq.psxequities.totalview.itch.v5_0.fields.MatchNumberField;
import omi.nasdaq.psxequities.totalview.itch.v5_0.fields.StockField;
import omi.nasdaq.psxequities.totalview.itch.v5_0.fields.StockLocateField;
import omi.nasdaq.psxequities.totalview.itch.v5_0.fields.TimestampField;
import omi.nasdaq.psxequities.totalview.itch.v5_0.fields.TrackingNumberField;
import omi.nasdaq.psxequities.totalview.itch.v5_0.types.Field;
import omi.nasdaq.psxequities.totalview.itch.v5_0.types.Message;
import omi.nasdaq.psxequities.totalview.itch.v5_0.types.PrintOptions;

/**
 * Represents the CrossTradeMessage message from the TotalView protocol.
 *
 * <p>Cross Trade message indicates that Nasdaq PSX has completed its cross process for a specific security. Nasdaq PSX sends out a Cross Trade message for all active issues in the system following the Opening, Closing and EMC cross events. Firms may use the Cross Trade message to determine when the cross for each security has been completed. (Note: For the halted / paused securities, firms should use the Trading Action message to determine when an issue has been released for trading.)</p>
 */
public final class CrossTradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Q';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 39;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Cross Trade Message";

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
     * NASDAQ PSX internal tracking number
     */
    private final TrackingNumberField trackingNumber = new TrackingNumberField();

    /**
     * Nanoseconds since midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * The number of shares matched in the Nasdaq PSX Cross.
     */
    private final CrossSharesField crossShares = new CrossSharesField();

    /**
     * Denotes the security symbol for the issue in the NASDAQ execution system.
     */
    private final StockField stock = new StockField();

    /**
     * The price at which the cross occurred. Refer to Data Types for field processing notes.
     */
    private final CrossPriceField crossPrice = new CrossPriceField();

    /**
     * The Nasdaq PSX generated day unique Match Number of this execution
     */
    private final MatchNumberField matchNumber = new MatchNumberField();

    /**
     * The Nasdaq PSX cross session for which the message is being generated.
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(stockLocate, trackingNumber, timestampField, crossShares, stock, crossPrice, matchNumber, crossType);

    private byte[] buffer;

    private int bufferOffset;

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
     * NASDAQ PSX internal tracking number
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
     * The number of shares matched in the Nasdaq PSX Cross.
     *
     * @return the CrossShares field
     */
    public CrossSharesField crossShares() {
        return crossShares;
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
     * The price at which the cross occurred. Refer to Data Types for field processing notes.
     *
     * @return the CrossPrice field
     */
    public CrossPriceField crossPrice() {
        return crossPrice;
    }

    /**
     * The Nasdaq PSX generated day unique Match Number of this execution
     *
     * @return the MatchNumber field
     */
    public MatchNumberField matchNumber() {
        return matchNumber;
    }

    /**
     * The Nasdaq PSX cross session for which the message is being generated.
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
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
     * <p>Padding carries no value: decode advances over it and encode writes it as zero. Use this to check that a received message's padding is zero where the specification requires it, or to render a byte map of the layout.</p>
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
        clear();
        this.buffer = data;
        this.bufferOffset = offset;

        if (offset < 0 || offset + BYTE_LENGTH > data.length) {
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
        if (!crossShares.parse(data, cursor)) {
            return false;
        }
        cursor += CrossSharesField.BYTE_LENGTH;
        if (!stock.parse(data, cursor)) {
            return false;
        }
        cursor += StockField.BYTE_LENGTH;
        if (!crossPrice.parse(data, cursor)) {
            return false;
        }
        cursor += CrossPriceField.BYTE_LENGTH;
        if (!matchNumber.parse(data, cursor)) {
            return false;
        }
        cursor += MatchNumberField.BYTE_LENGTH;
        if (!crossType.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeField.BYTE_LENGTH;

        this.decoded = true;
        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = stockLocate.encode(data, cursor);
        cursor = trackingNumber.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = crossShares.encode(data, cursor);
        cursor = stock.encode(data, cursor);
        cursor = crossPrice.encode(data, cursor);
        cursor = matchNumber.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
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
        this.bufferOffset = 0;
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
        int end = Math.min(buffer.length, bufferOffset + BYTE_LENGTH);
        int start = Math.min(Math.max(bufferOffset, 0), end);
        return Optional.of(Arrays.copyOfRange(buffer, start, end));
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
            case "CrossShares" -> Optional.of(crossShares);
            case "Stock" -> Optional.of(stock);
            case "CrossPrice" -> Optional.of(crossPrice);
            case "MatchNumber" -> Optional.of(matchNumber);
            case "CrossType" -> Optional.of(crossType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CrossTradeMessage message)) {
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
        if (!(other instanceof CrossTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
