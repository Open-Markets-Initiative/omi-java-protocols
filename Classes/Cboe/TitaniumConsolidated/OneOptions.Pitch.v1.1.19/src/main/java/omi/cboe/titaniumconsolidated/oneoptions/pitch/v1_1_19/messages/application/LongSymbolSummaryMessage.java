package omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.fields.CboeCumulativeExecutedVolumeLongField;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.fields.ConsolidatedBestAskPriceLongField;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.fields.ConsolidatedBestAskQuantityLongField;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.fields.ConsolidatedBestBidPriceLongField;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.fields.ConsolidatedBestBidQuantityLongField;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.fields.LastUpdateTimestampField;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.fields.SymbolField;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.types.Field;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.types.Message;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.types.PrintOptions;

/**
 * Represents the LongSymbolSummaryMessage message from the OneOptions protocol.
 *
 * <p>The Long Symbol Summary message delivers the Cboe consolidated best bid/offer and total executed volume across all applicable Cboe One Options books.</p>
 */
public final class LongSymbolSummaryMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 65;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Long Symbol Summary Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 56, 9 };

    /**
     * Timestamp of the last matching engine message that updated the quote information for this symbol in the Cboe One Options server's cache. Encoded as the number of nanoseconds since midnight.
     */
    private final LastUpdateTimestampField lastUpdateTimestamp = new LastUpdateTimestampField();

    /**
     * Symbol right padded with spaces.
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Cumulative number of shares traded today across all applicable Cboe books.
     */
    private final CboeCumulativeExecutedVolumeLongField cboeCumulativeExecutedVolumeLong = new CboeCumulativeExecutedVolumeLongField();

    /**
     * Titanium Options best bid price.
     */
    private final ConsolidatedBestBidPriceLongField consolidatedBestBidPriceLong = new ConsolidatedBestBidPriceLongField();

    /**
     * Titanium Options number of buy-side shares available for this symbol.
     */
    private final ConsolidatedBestBidQuantityLongField consolidatedBestBidQuantityLong = new ConsolidatedBestBidQuantityLongField();

    /**
     * Titanium Options best ask price.
     */
    private final ConsolidatedBestAskPriceLongField consolidatedBestAskPriceLong = new ConsolidatedBestAskPriceLongField();

    /**
     * Titanium Options number of sell-side shares available for this symbol.
     */
    private final ConsolidatedBestAskQuantityLongField consolidatedBestAskQuantityLong = new ConsolidatedBestAskQuantityLongField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(lastUpdateTimestamp, symbol, cboeCumulativeExecutedVolumeLong, consolidatedBestBidPriceLong, consolidatedBestBidQuantityLong, consolidatedBestAskPriceLong, consolidatedBestAskQuantityLong);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Timestamp of the last matching engine message that updated the quote information for this symbol in the Cboe One Options server's cache. Encoded as the number of nanoseconds since midnight.
     *
     * @return the LastUpdateTimestamp field
     */
    public LastUpdateTimestampField lastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    /**
     * Symbol right padded with spaces.
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Cumulative number of shares traded today across all applicable Cboe books.
     *
     * @return the CboeCumulativeExecutedVolumeLong field
     */
    public CboeCumulativeExecutedVolumeLongField cboeCumulativeExecutedVolumeLong() {
        return cboeCumulativeExecutedVolumeLong;
    }

    /**
     * Titanium Options best bid price.
     *
     * @return the ConsolidatedBestBidPriceLong field
     */
    public ConsolidatedBestBidPriceLongField consolidatedBestBidPriceLong() {
        return consolidatedBestBidPriceLong;
    }

    /**
     * Titanium Options number of buy-side shares available for this symbol.
     *
     * @return the ConsolidatedBestBidQuantityLong field
     */
    public ConsolidatedBestBidQuantityLongField consolidatedBestBidQuantityLong() {
        return consolidatedBestBidQuantityLong;
    }

    /**
     * Titanium Options best ask price.
     *
     * @return the ConsolidatedBestAskPriceLong field
     */
    public ConsolidatedBestAskPriceLongField consolidatedBestAskPriceLong() {
        return consolidatedBestAskPriceLong;
    }

    /**
     * Titanium Options number of sell-side shares available for this symbol.
     *
     * @return the ConsolidatedBestAskQuantityLong field
     */
    public ConsolidatedBestAskQuantityLongField consolidatedBestAskQuantityLong() {
        return consolidatedBestAskQuantityLong;
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
        if (!lastUpdateTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += LastUpdateTimestampField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!cboeCumulativeExecutedVolumeLong.parse(data, cursor)) {
            return false;
        }
        cursor += CboeCumulativeExecutedVolumeLongField.BYTE_LENGTH;
        if (!consolidatedBestBidPriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedBestBidPriceLongField.BYTE_LENGTH;
        if (!consolidatedBestBidQuantityLong.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedBestBidQuantityLongField.BYTE_LENGTH;
        if (!consolidatedBestAskPriceLong.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedBestAskPriceLongField.BYTE_LENGTH;
        if (!consolidatedBestAskQuantityLong.parse(data, cursor)) {
            return false;
        }
        cursor += ConsolidatedBestAskQuantityLongField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = lastUpdateTimestamp.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = cboeCumulativeExecutedVolumeLong.encode(data, cursor);
        cursor = consolidatedBestBidPriceLong.encode(data, cursor);
        cursor = consolidatedBestBidQuantityLong.encode(data, cursor);
        cursor = consolidatedBestAskPriceLong.encode(data, cursor);
        cursor = consolidatedBestAskQuantityLong.encode(data, cursor);
        if (buffer != null && buffer.length >= 65) {
            System.arraycopy(buffer, 56, data, cursor, 9); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 9, (byte) 0); // padding
        }
        cursor += 9;
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
            case "LastUpdateTimestamp" -> Optional.of(lastUpdateTimestamp);
            case "Symbol" -> Optional.of(symbol);
            case "CboeCumulativeExecutedVolumeLong" -> Optional.of(cboeCumulativeExecutedVolumeLong);
            case "ConsolidatedBestBidPriceLong" -> Optional.of(consolidatedBestBidPriceLong);
            case "ConsolidatedBestBidQuantityLong" -> Optional.of(consolidatedBestBidQuantityLong);
            case "ConsolidatedBestAskPriceLong" -> Optional.of(consolidatedBestAskPriceLong);
            case "ConsolidatedBestAskQuantityLong" -> Optional.of(consolidatedBestAskQuantityLong);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LongSymbolSummaryMessage message)) {
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
        if (!(other instanceof LongSymbolSummaryMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
