package omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.BoardLotSizeField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.ListingMarketField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.SymbolField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.SymbolIdField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.fields.TimestampField;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.types.Field;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.types.Message;
import omi.cixats.cixaspen.marketdatafeed.aspen.v1_4.types.PrintOptions;

/**
 * Represents the SymbolInformationMessage message from the MarketDataFeed protocol.
 *
 * <p>Reference data for each symbol that may be traded</p>
 */
public final class SymbolInformationMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'B';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 26;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Symbol Information Message";

    /**
     * Nanoseconds Since Epoch (UTC)
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Symbol Index
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Stock Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Code identifying the primary listing market
     */
    private final ListingMarketField listingMarket = new ListingMarketField();

    /**
     * Board Lot Size in Shares
     */
    private final BoardLotSizeField boardLotSize = new BoardLotSizeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, symbolId, symbol, listingMarket, boardLotSize);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds Since Epoch (UTC)
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Symbol Index
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
    }

    /**
     * Stock Symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Code identifying the primary listing market
     *
     * @return the ListingMarket field
     */
    public ListingMarketField listingMarket() {
        return listingMarket;
    }

    /**
     * Board Lot Size in Shares
     *
     * @return the BoardLotSize field
     */
    public BoardLotSizeField boardLotSize() {
        return boardLotSize;
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
        return Optional.ofNullable(timestampField.value());
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!listingMarket.parse(data, cursor)) {
            return false;
        }
        cursor += ListingMarketField.BYTE_LENGTH;
        return boardLotSize.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = listingMarket.encode(data, cursor);
        cursor = boardLotSize.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "SymbolId" -> Optional.of(symbolId);
            case "Symbol" -> Optional.of(symbol);
            case "ListingMarket" -> Optional.of(listingMarket);
            case "BoardLotSize" -> Optional.of(boardLotSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SymbolInformationMessage message)) {
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
        if (!(other instanceof SymbolInformationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
