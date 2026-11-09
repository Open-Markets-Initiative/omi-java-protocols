package omi.tmx.mx.solamulticast.hsvf.v1_14_1.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.AskPriceQuoteMarketDepthLevel;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches.BidPriceQuoteMarketDepthLevel;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.AskSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.BidSizeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.LevelOfMarketDepthField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.NumberOfAskOrdersField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.NumberOfBidOrdersField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * One entry of the MarketDepthLevel repeating group.
 *
 * <p>Option Market Depth</p>
 */
public final class MarketDepthLevelEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 31;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "MarketDepthLevel";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Level of market depth. 1 to 5 and A (Implied)
     */
    private final LevelOfMarketDepthField levelOfMarketDepth = new LevelOfMarketDepthField();

    /**
     * Number of option contracts represented by the Bid Price For Implied, it represents the indicative quantity at the best (1st limit) implied bid price If size is greater than 99999, the 5th character becomes an exponent Refer to Indicator Code
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Number of bid orders, present at a given moment, in the order book. For Implied, it represents the indicative number of implied bid orders making up the implied bid size at that implied bid price. If greater than 99-&gt; the 2nd character becomes an exponent.
     */
    private final NumberOfBidOrdersField numberOfBidOrders = new NumberOfBidOrdersField();

    /**
     * Number of option contracts represented by the Ask Price For Implied, it represents the indicative quantity at the best (1st limit) implied ask price If size is greater than 99999, the 5th character becomes an exponent Refer to Indicator Code
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * Number of Ask Orders, present at a given moment, in the order book. For Implied, it represents the indicative number of implied ask orders making up the implied ask size at that implied ask price. If greater than 99, the 2nd character becomes an exponent
     */
    private final NumberOfAskOrdersField numberOfAskOrders = new NumberOfAskOrdersField();

    /**
     * Bid price for the option series For Implied, it represents the best (1st limit) indicative implied bid price
     */
    private final BidPriceQuoteMarketDepthLevel bidPriceQuoteMarketDepthLevel = new BidPriceQuoteMarketDepthLevel();

    /**
     * Ask price for the option series For Implied, it represents the best (1st limit) indicative implied ask price
     */
    private final AskPriceQuoteMarketDepthLevel askPriceQuoteMarketDepthLevel = new AskPriceQuoteMarketDepthLevel();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(levelOfMarketDepth, bidSize, numberOfBidOrders, askSize, numberOfAskOrders);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Level of market depth. 1 to 5 and A (Implied)
     *
     * @return the LevelOfMarketDepth field
     */
    public LevelOfMarketDepthField levelOfMarketDepth() {
        return levelOfMarketDepth;
    }

    /**
     * Number of option contracts represented by the Bid Price For Implied, it represents the indicative quantity at the best (1st limit) implied bid price If size is greater than 99999, the 5th character becomes an exponent Refer to Indicator Code
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * Number of bid orders, present at a given moment, in the order book. For Implied, it represents the indicative number of implied bid orders making up the implied bid size at that implied bid price. If greater than 99-&gt; the 2nd character becomes an exponent.
     *
     * @return the NumberOfBidOrders field
     */
    public NumberOfBidOrdersField numberOfBidOrders() {
        return numberOfBidOrders;
    }

    /**
     * Number of option contracts represented by the Ask Price For Implied, it represents the indicative quantity at the best (1st limit) implied ask price If size is greater than 99999, the 5th character becomes an exponent Refer to Indicator Code
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
    }

    /**
     * Number of Ask Orders, present at a given moment, in the order book. For Implied, it represents the indicative number of implied ask orders making up the implied ask size at that implied ask price. If greater than 99, the 2nd character becomes an exponent
     *
     * @return the NumberOfAskOrders field
     */
    public NumberOfAskOrdersField numberOfAskOrders() {
        return numberOfAskOrders;
    }

    /**
     * Bid price for the option series For Implied, it represents the best (1st limit) indicative implied bid price
     *
     * @return the BidPriceQuoteMarketDepthLevel record
     */
    public BidPriceQuoteMarketDepthLevel bidPriceQuoteMarketDepthLevel() {
        return bidPriceQuoteMarketDepthLevel;
    }

    /**
     * Ask price for the option series For Implied, it represents the best (1st limit) indicative implied ask price
     *
     * @return the AskPriceQuoteMarketDepthLevel record
     */
    public AskPriceQuoteMarketDepthLevel askPriceQuoteMarketDepthLevel() {
        return askPriceQuoteMarketDepthLevel;
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
        return PADDING.clone();
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
        if (!levelOfMarketDepth.parse(data, cursor)) {
            return false;
        }
        cursor += LevelOfMarketDepthField.BYTE_LENGTH;
        if (!bidPriceQuoteMarketDepthLevel.parseFrom(data, cursor, end - 22)) {
            return false;
        }
        cursor += bidPriceQuoteMarketDepthLevel.byteLength();
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!numberOfBidOrders.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfBidOrdersField.BYTE_LENGTH;
        if (!askPriceQuoteMarketDepthLevel.parseFrom(data, cursor, end - 7)) {
            return false;
        }
        cursor += askPriceQuoteMarketDepthLevel.byteLength();
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
        if (!numberOfAskOrders.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfAskOrdersField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = levelOfMarketDepth.encode(data, cursor);
        cursor = bidPriceQuoteMarketDepthLevel.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = numberOfBidOrders.encode(data, cursor);
        cursor = askPriceQuoteMarketDepthLevel.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = numberOfAskOrders.encode(data, cursor);
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
        bidPriceQuoteMarketDepthLevel.clear();
        askPriceQuoteMarketDepthLevel.clear();
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
        if (!bidPriceQuoteMarketDepthLevel.isRecognized()) {
            return false;
        }
        if (!askPriceQuoteMarketDepthLevel.isRecognized()) {
            return false;
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
        if (!bidPriceQuoteMarketDepthLevel.isValid()) {
            return false;
        }
        if (!askPriceQuoteMarketDepthLevel.isValid()) {
            return false;
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
            case "LevelOfMarketDepth" -> Optional.of(levelOfMarketDepth);
            case "BidSize" -> Optional.of(bidSize);
            case "NumberOfBidOrders" -> Optional.of(numberOfBidOrders);
            case "AskSize" -> Optional.of(askSize);
            case "NumberOfAskOrders" -> Optional.of(numberOfAskOrders);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof MarketDepthLevelEntry message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(bidPriceQuoteMarketDepthLevel.diffFields(message.bidPriceQuoteMarketDepthLevel));
        changed.addAll(askPriceQuoteMarketDepthLevel.diffFields(message.askPriceQuoteMarketDepthLevel));
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
            builder.append(", ");
            bidPriceQuoteMarketDepthLevel.toFormattedString(builder, options);
            builder.append(", ");
            askPriceQuoteMarketDepthLevel.toFormattedString(builder, options);
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
        bidPriceQuoteMarketDepthLevel.toFormattedString(builder, nested);
        askPriceQuoteMarketDepthLevel.toFormattedString(builder, nested);
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
        if (!(other instanceof MarketDepthLevelEntry message)) {
            return false;
        }
        return fields.equals(message.fields) && bidPriceQuoteMarketDepthLevel.equals(message.bidPriceQuoteMarketDepthLevel) && askPriceQuoteMarketDepthLevel.equals(message.askPriceQuoteMarketDepthLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, bidPriceQuoteMarketDepthLevel, askPriceQuoteMarketDepthLevel);
    }
}
