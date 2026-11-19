package omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.branches.AskPriceQuoteFutureOptionsMarketDepthTradingInstrument;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.branches.BidPriceQuoteFutureOptionsMarketDepthTradingInstrument;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.fields.AskSizeField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.fields.BidSizeField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.fields.LevelOfMarketDepthField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.fields.NumberOfAskOrdersField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.fields.NumberOfBidOrdersField;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.types.GroupEntry;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_13_3.types.PrintOptions;

/**
 * One entry of the FutureOptionsMarketDepthTradingInstrument repeating group.
 *
 * <p>Future Options Market Depth Trading instrument</p>
 */
public final class FutureOptionsMarketDepthTradingInstrumentEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 31;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "FutureOptionsMarketDepthTradingInstrument";

    /**
     * Level of market depth. 1 to 5 and A (Implied)
     */
    private final LevelOfMarketDepthField levelOfMarketDepth = new LevelOfMarketDepthField();

    /**
     * Total number of contracts being bid at this price For Implied, it represents the indicative quantity at the best (1st limit) implied bid price If size is greater than 99999, the 5th character becomes an exponent Refer to Indicator Code
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Number of bid orders, present at a given moment, in the order book. For Implied, it represents the indicative number of implied bid orders making up the implied bid size at that implied bid price. If greater than 99-&gt; the 2nd character becomes an exponent.
     */
    private final NumberOfBidOrdersField numberOfBidOrders = new NumberOfBidOrdersField();

    /**
     * Total number of contracts being offered at this price For Implied, it represents the indicative quantity at the best (1st limit) implied ask price If size is greater than 99999, the 5th character becomes an exponent Refer to Indicator Code
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * Number of Ask Orders, present at a given moment, in the order book. For Implied, it represents the indicative number of implied ask orders making up the implied ask size at that implied ask price. If greater than 99, the 2nd character becomes an exponent
     */
    private final NumberOfAskOrdersField numberOfAskOrders = new NumberOfAskOrdersField();

    /**
     * Bid Price for the series. For Implied, it represents the best (1st limit) indicative implied bid price
     */
    private final BidPriceQuoteFutureOptionsMarketDepthTradingInstrument bidPriceQuoteFutureOptionsMarketDepthTradingInstrument = new BidPriceQuoteFutureOptionsMarketDepthTradingInstrument();

    /**
     * Ask price for the series For Implied, it represents the best (1st limit) indicative implied ask price
     */
    private final AskPriceQuoteFutureOptionsMarketDepthTradingInstrument askPriceQuoteFutureOptionsMarketDepthTradingInstrument = new AskPriceQuoteFutureOptionsMarketDepthTradingInstrument();

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
     * Total number of contracts being bid at this price For Implied, it represents the indicative quantity at the best (1st limit) implied bid price If size is greater than 99999, the 5th character becomes an exponent Refer to Indicator Code
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
     * Total number of contracts being offered at this price For Implied, it represents the indicative quantity at the best (1st limit) implied ask price If size is greater than 99999, the 5th character becomes an exponent Refer to Indicator Code
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
     * Bid Price for the series. For Implied, it represents the best (1st limit) indicative implied bid price
     *
     * @return the BidPriceQuoteFutureOptionsMarketDepthTradingInstrument record
     */
    public BidPriceQuoteFutureOptionsMarketDepthTradingInstrument bidPriceQuoteFutureOptionsMarketDepthTradingInstrument() {
        return bidPriceQuoteFutureOptionsMarketDepthTradingInstrument;
    }

    /**
     * Ask price for the series For Implied, it represents the best (1st limit) indicative implied ask price
     *
     * @return the AskPriceQuoteFutureOptionsMarketDepthTradingInstrument record
     */
    public AskPriceQuoteFutureOptionsMarketDepthTradingInstrument askPriceQuoteFutureOptionsMarketDepthTradingInstrument() {
        return askPriceQuoteFutureOptionsMarketDepthTradingInstrument;
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
        if (!levelOfMarketDepth.parse(data, cursor)) {
            return false;
        }
        cursor += LevelOfMarketDepthField.BYTE_LENGTH;
        if (!bidPriceQuoteFutureOptionsMarketDepthTradingInstrument.parseFrom(data, cursor, end - 22)) {
            return false;
        }
        cursor += bidPriceQuoteFutureOptionsMarketDepthTradingInstrument.byteLength();
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!numberOfBidOrders.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfBidOrdersField.BYTE_LENGTH;
        if (!askPriceQuoteFutureOptionsMarketDepthTradingInstrument.parseFrom(data, cursor, end - 7)) {
            return false;
        }
        cursor += askPriceQuoteFutureOptionsMarketDepthTradingInstrument.byteLength();
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
        return numberOfAskOrders.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = levelOfMarketDepth.encode(data, cursor);
        cursor = bidPriceQuoteFutureOptionsMarketDepthTradingInstrument.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = numberOfBidOrders.encode(data, cursor);
        cursor = askPriceQuoteFutureOptionsMarketDepthTradingInstrument.encode(data, cursor);
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
        bidPriceQuoteFutureOptionsMarketDepthTradingInstrument.clear();
        askPriceQuoteFutureOptionsMarketDepthTradingInstrument.clear();
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
        if (!bidPriceQuoteFutureOptionsMarketDepthTradingInstrument.isRecognized()) {
            return false;
        }
        return askPriceQuoteFutureOptionsMarketDepthTradingInstrument.isRecognized();
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!bidPriceQuoteFutureOptionsMarketDepthTradingInstrument.isValid()) {
            return false;
        }
        if (!askPriceQuoteFutureOptionsMarketDepthTradingInstrument.isValid()) {
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
        if (!(other instanceof FutureOptionsMarketDepthTradingInstrumentEntry message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(bidPriceQuoteFutureOptionsMarketDepthTradingInstrument.diffFields(message.bidPriceQuoteFutureOptionsMarketDepthTradingInstrument));
        changed.addAll(askPriceQuoteFutureOptionsMarketDepthTradingInstrument.diffFields(message.askPriceQuoteFutureOptionsMarketDepthTradingInstrument));
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
            bidPriceQuoteFutureOptionsMarketDepthTradingInstrument.toFormattedString(builder, options);
            builder.append(", ");
            askPriceQuoteFutureOptionsMarketDepthTradingInstrument.toFormattedString(builder, options);
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
        bidPriceQuoteFutureOptionsMarketDepthTradingInstrument.toFormattedString(builder, nested);
        askPriceQuoteFutureOptionsMarketDepthTradingInstrument.toFormattedString(builder, nested);
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
        if (!(other instanceof FutureOptionsMarketDepthTradingInstrumentEntry message)) {
            return false;
        }
        return fields.equals(message.fields) && bidPriceQuoteFutureOptionsMarketDepthTradingInstrument.equals(message.bidPriceQuoteFutureOptionsMarketDepthTradingInstrument) && askPriceQuoteFutureOptionsMarketDepthTradingInstrument.equals(message.askPriceQuoteFutureOptionsMarketDepthTradingInstrument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, bidPriceQuoteFutureOptionsMarketDepthTradingInstrument, askPriceQuoteFutureOptionsMarketDepthTradingInstrument);
    }
}
