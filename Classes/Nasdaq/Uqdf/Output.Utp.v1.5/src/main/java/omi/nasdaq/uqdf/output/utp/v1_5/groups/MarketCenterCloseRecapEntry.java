package omi.nasdaq.uqdf.output.utp.v1_5.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.MarketCenterAskPriceField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.MarketCenterAskSizeField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.MarketCenterBidPriceField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.MarketCenterBidSizeField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.MarketCenterIdentifierField;
import omi.nasdaq.uqdf.output.utp.v1_5.types.Field;
import omi.nasdaq.uqdf.output.utp.v1_5.types.GroupEntry;
import omi.nasdaq.uqdf.output.utp.v1_5.types.PrintOptions;

/**
 * One entry of the MarketCenterCloseRecap repeating group.
 *
 * <p>At the request of the market data community, the UTP SIP generates a Session Close Recap message that reflects the National BBO quotation information at the close of the normal market session</p>
 */
public final class MarketCenterCloseRecapEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 33;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "MarketCenterCloseRecap";

    /**
     * Market Center Identifier
     */
    private final MarketCenterIdentifierField marketCenterIdentifier = new MarketCenterIdentifierField();

    /**
     * Market Center Bid Price
     */
    private final MarketCenterBidPriceField marketCenterBidPrice = new MarketCenterBidPriceField();

    /**
     * Market Center Bid Size
     */
    private final MarketCenterBidSizeField marketCenterBidSize = new MarketCenterBidSizeField();

    /**
     * Market Center Ask Price
     */
    private final MarketCenterAskPriceField marketCenterAskPrice = new MarketCenterAskPriceField();

    /**
     * Market Center Ask Size
     */
    private final MarketCenterAskSizeField marketCenterAskSize = new MarketCenterAskSizeField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketCenterIdentifier, marketCenterBidPrice, marketCenterBidSize, marketCenterAskPrice, marketCenterAskSize);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Market Center Identifier
     *
     * @return the MarketCenterIdentifier field
     */
    public MarketCenterIdentifierField marketCenterIdentifier() {
        return marketCenterIdentifier;
    }

    /**
     * Market Center Bid Price
     *
     * @return the MarketCenterBidPrice field
     */
    public MarketCenterBidPriceField marketCenterBidPrice() {
        return marketCenterBidPrice;
    }

    /**
     * Market Center Bid Size
     *
     * @return the MarketCenterBidSize field
     */
    public MarketCenterBidSizeField marketCenterBidSize() {
        return marketCenterBidSize;
    }

    /**
     * Market Center Ask Price
     *
     * @return the MarketCenterAskPrice field
     */
    public MarketCenterAskPriceField marketCenterAskPrice() {
        return marketCenterAskPrice;
    }

    /**
     * Market Center Ask Size
     *
     * @return the MarketCenterAskSize field
     */
    public MarketCenterAskSizeField marketCenterAskSize() {
        return marketCenterAskSize;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
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
        if (!marketCenterIdentifier.parse(data, cursor)) {
            return false;
        }
        cursor += MarketCenterIdentifierField.BYTE_LENGTH;
        if (!marketCenterBidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MarketCenterBidPriceField.BYTE_LENGTH;
        if (!marketCenterBidSize.parse(data, cursor)) {
            return false;
        }
        cursor += MarketCenterBidSizeField.BYTE_LENGTH;
        if (!marketCenterAskPrice.parse(data, cursor)) {
            return false;
        }
        cursor += MarketCenterAskPriceField.BYTE_LENGTH;
        return marketCenterAskSize.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = marketCenterIdentifier.encode(data, cursor);
        cursor = marketCenterBidPrice.encode(data, cursor);
        cursor = marketCenterBidSize.encode(data, cursor);
        cursor = marketCenterAskPrice.encode(data, cursor);
        cursor = marketCenterAskSize.encode(data, cursor);
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
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
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
            case "MarketCenterIdentifier" -> Optional.of(marketCenterIdentifier);
            case "MarketCenterBidPrice" -> Optional.of(marketCenterBidPrice);
            case "MarketCenterBidSize" -> Optional.of(marketCenterBidSize);
            case "MarketCenterAskPrice" -> Optional.of(marketCenterAskPrice);
            case "MarketCenterAskSize" -> Optional.of(marketCenterAskSize);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof MarketCenterCloseRecapEntry message)) {
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
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof MarketCenterCloseRecapEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
