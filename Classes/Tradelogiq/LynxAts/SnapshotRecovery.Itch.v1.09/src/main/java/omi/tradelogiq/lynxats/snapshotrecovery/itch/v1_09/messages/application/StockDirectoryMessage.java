package omi.tradelogiq.lynxats.snapshotrecovery.itch.v1_09.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tradelogiq.lynxats.snapshotrecovery.itch.v1_09.fields.BoardLotSizeField;
import omi.tradelogiq.lynxats.snapshotrecovery.itch.v1_09.fields.CurrencyField;
import omi.tradelogiq.lynxats.snapshotrecovery.itch.v1_09.fields.DividendIndicatorField;
import omi.tradelogiq.lynxats.snapshotrecovery.itch.v1_09.fields.InstrumentIdField;
import omi.tradelogiq.lynxats.snapshotrecovery.itch.v1_09.fields.MarketField;
import omi.tradelogiq.lynxats.snapshotrecovery.itch.v1_09.fields.ShortableField;
import omi.tradelogiq.lynxats.snapshotrecovery.itch.v1_09.fields.StockField;
import omi.tradelogiq.lynxats.snapshotrecovery.itch.v1_09.fields.TimestampField;
import omi.tradelogiq.lynxats.snapshotrecovery.itch.v1_09.types.Field;
import omi.tradelogiq.lynxats.snapshotrecovery.itch.v1_09.types.Message;
import omi.tradelogiq.lynxats.snapshotrecovery.itch.v1_09.types.PrintOptions;

/**
 * Represents the StockDirectoryMessage message from the SnapshotRecovery protocol.
 *
 * <p>A Requested Sequence Number of 1 returns the symbol spin, the Instrument Directory messages distributed early in the Tradelogiq start of day.</p>
 */
public final class StockDirectoryMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 39;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Stock Directory Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 27, 9 };

    /**
     * Indicates the listing market of security
     */
    private final MarketField market = new MarketField();

    /**
     * Denotes the security symbol on Omega ATS and Lynx ATS
     */
    private final StockField stock = new StockField();

    /**
     * Nanoseconds since midnight.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Indicates a board lot size
     */
    private final BoardLotSizeField boardLotSize = new BoardLotSizeField();

    /**
     * Internal instrument identifier for Omega ATS and Lynx ATS
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Indicates the short status of a security
     */
    private final ShortableField shortable = new ShortableField();

    /**
     * Dividend frequency of the security
     */
    private final DividendIndicatorField dividendIndicator = new DividendIndicatorField();

    /**
     * Indicates currency for the symbol
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(market, stock, timestampField, boardLotSize, instrumentId, shortable, dividendIndicator, currency);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Indicates the listing market of security
     *
     * @return the Market field
     */
    public MarketField market() {
        return market;
    }

    /**
     * Denotes the security symbol on Omega ATS and Lynx ATS
     *
     * @return the Stock field
     */
    public StockField stock() {
        return stock;
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
     * Indicates a board lot size
     *
     * @return the BoardLotSize field
     */
    public BoardLotSizeField boardLotSize() {
        return boardLotSize;
    }

    /**
     * Internal instrument identifier for Omega ATS and Lynx ATS
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Indicates the short status of a security
     *
     * @return the Shortable field
     */
    public ShortableField shortable() {
        return shortable;
    }

    /**
     * Dividend frequency of the security
     *
     * @return the DividendIndicator field
     */
    public DividendIndicatorField dividendIndicator() {
        return dividendIndicator;
    }

    /**
     * Indicates currency for the symbol
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
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
        if (!market.parse(data, cursor)) {
            return false;
        }
        cursor += MarketField.BYTE_LENGTH;
        if (!stock.parse(data, cursor)) {
            return false;
        }
        cursor += StockField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!boardLotSize.parse(data, cursor)) {
            return false;
        }
        cursor += BoardLotSizeField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!shortable.parse(data, cursor)) {
            return false;
        }
        cursor += ShortableField.BYTE_LENGTH;
        if (!dividendIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += DividendIndicatorField.BYTE_LENGTH;
        cursor += 9; // padding
        return currency.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = market.encode(data, cursor);
        cursor = stock.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = boardLotSize.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = shortable.encode(data, cursor);
        cursor = dividendIndicator.encode(data, cursor);
        if (buffer != null && buffer.length >= 36) {
            System.arraycopy(buffer, 27, data, cursor, 9); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 9, (byte) 0); // padding
        }
        cursor += 9;
        cursor = currency.encode(data, cursor);
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
            case "Market" -> Optional.of(market);
            case "Stock" -> Optional.of(stock);
            case "Timestamp" -> Optional.of(timestampField);
            case "BoardLotSize" -> Optional.of(boardLotSize);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "Shortable" -> Optional.of(shortable);
            case "DividendIndicator" -> Optional.of(dividendIndicator);
            case "Currency" -> Optional.of(currency);
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
