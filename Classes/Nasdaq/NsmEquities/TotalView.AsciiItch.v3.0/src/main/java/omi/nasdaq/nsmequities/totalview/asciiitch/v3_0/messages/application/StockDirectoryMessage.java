package omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.FinancialStatusIndicatorField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.MarketCategoryField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.RoundLotSizeField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.RoundLotsOnlyField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.fields.StockAlphabeticField;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.types.Field;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.types.Message;
import omi.nasdaq.nsmequities.totalview.asciiitch.v3_0.types.PrintOptions;

/**
 * Represents the StockDirectoryMessage message from the TotalView protocol.
 *
 * <p>At the start of each trading day, NASDAQ disseminates stock directory messages for all active symbols in Single Book.</p>
 */
public final class StockDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 15;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Stock Directory Message";

    /**
     * Denotes the security symbol for the issue in NASDAQ Single Book.
     */
    private final StockAlphabeticField stockAlphabetic = new StockAlphabeticField();

    /**
     * Indicates listing market center or listing market tier for the issue.
     */
    private final MarketCategoryField marketCategory = new MarketCategoryField();

    /**
     * For NASDAQ-listed issues, this field indicates when a firm is not in compliance with NASDAQ continued listing requirements.
     */
    private final FinancialStatusIndicatorField financialStatusIndicator = new FinancialStatusIndicatorField();

    /**
     * Indicates the number of shares that represent a round lot for the issue.
     */
    private final RoundLotSizeField roundLotSize = new RoundLotSizeField();

    /**
     * Indicates if NASDAQ system limits order entry for issue.
     */
    private final RoundLotsOnlyField roundLotsOnly = new RoundLotsOnlyField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(stockAlphabetic, marketCategory, financialStatusIndicator, roundLotSize, roundLotsOnly);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Denotes the security symbol for the issue in NASDAQ Single Book.
     *
     * @return the StockAlphabetic field
     */
    public StockAlphabeticField stockAlphabetic() {
        return stockAlphabetic;
    }

    /**
     * Indicates listing market center or listing market tier for the issue.
     *
     * @return the MarketCategory field
     */
    public MarketCategoryField marketCategory() {
        return marketCategory;
    }

    /**
     * For NASDAQ-listed issues, this field indicates when a firm is not in compliance with NASDAQ continued listing requirements.
     *
     * @return the FinancialStatusIndicator field
     */
    public FinancialStatusIndicatorField financialStatusIndicator() {
        return financialStatusIndicator;
    }

    /**
     * Indicates the number of shares that represent a round lot for the issue.
     *
     * @return the RoundLotSize field
     */
    public RoundLotSizeField roundLotSize() {
        return roundLotSize;
    }

    /**
     * Indicates if NASDAQ system limits order entry for issue.
     *
     * @return the RoundLotsOnly field
     */
    public RoundLotsOnlyField roundLotsOnly() {
        return roundLotsOnly;
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
        if (!stockAlphabetic.parse(data, cursor)) {
            return false;
        }
        cursor += StockAlphabeticField.BYTE_LENGTH;
        if (!marketCategory.parse(data, cursor)) {
            return false;
        }
        cursor += MarketCategoryField.BYTE_LENGTH;
        if (!financialStatusIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += FinancialStatusIndicatorField.BYTE_LENGTH;
        if (!roundLotSize.parse(data, cursor)) {
            return false;
        }
        cursor += RoundLotSizeField.BYTE_LENGTH;
        return roundLotsOnly.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = stockAlphabetic.encode(data, cursor);
        cursor = marketCategory.encode(data, cursor);
        cursor = financialStatusIndicator.encode(data, cursor);
        cursor = roundLotSize.encode(data, cursor);
        cursor = roundLotsOnly.encode(data, cursor);
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
            case "StockAlphabetic" -> Optional.of(stockAlphabetic);
            case "MarketCategory" -> Optional.of(marketCategory);
            case "FinancialStatusIndicator" -> Optional.of(financialStatusIndicator);
            case "RoundLotSize" -> Optional.of(roundLotSize);
            case "RoundLotsOnly" -> Optional.of(roundLotsOnly);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StockDirectoryMessage message)) {
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
        if (!(other instanceof StockDirectoryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
