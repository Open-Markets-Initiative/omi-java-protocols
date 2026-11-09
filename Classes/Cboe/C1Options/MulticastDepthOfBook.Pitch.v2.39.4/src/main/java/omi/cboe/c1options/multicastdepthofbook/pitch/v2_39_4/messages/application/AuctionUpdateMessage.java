package omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.AuctionOnlyPriceField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.AuctionTypeField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.BuySharesField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.IndicativePriceField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.ReferencePriceField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.SellSharesField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.StockSymbolField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.fields.TimeOffsetField;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.types.Field;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.types.Message;
import omi.cboe.c1options.multicastdepthofbook.pitch.v2_39_4.types.PrintOptions;

/**
 * Represents the AuctionUpdateMessage message from the MulticastDepthOfBook protocol.
 *
 * <p>Auction Update messages are used to disseminate Cboe price and size information during auctions for Cboe listed securities and for Cboe Market Close (CMC) crosses.</p>
 */
public final class AuctionUpdateMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 45;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Auction Update Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Nanosecond offset from last unit timestamp
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Stock Symbol right padded with spaces.
     */
    private final StockSymbolField stockSymbol = new StockSymbolField();

    /**
     * Auction type value
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * BBO Collared auction price
     */
    private final ReferencePriceField referencePrice = new ReferencePriceField();

    /**
     * Number of shares on buy side at the Reference Price.
     */
    private final BuySharesField buyShares = new BuySharesField();

    /**
     * Number of shares on sell side at the Reference Price.
     */
    private final SellSharesField sellShares = new SellSharesField();

    /**
     * Price at which the auction book and the continuous book would match.
     */
    private final IndicativePriceField indicativePrice = new IndicativePriceField();

    /**
     * Price at which the auction book would match using only Eligible Auction Orders
     */
    private final AuctionOnlyPriceField auctionOnlyPrice = new AuctionOnlyPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, stockSymbol, auctionType, referencePrice, buyShares, sellShares, indicativePrice, auctionOnlyPrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanosecond offset from last unit timestamp
     *
     * @return the TimeOffset field
     */
    public TimeOffsetField timeOffset() {
        return timeOffset;
    }

    /**
     * Stock Symbol right padded with spaces.
     *
     * @return the StockSymbol field
     */
    public StockSymbolField stockSymbol() {
        return stockSymbol;
    }

    /**
     * Auction type value
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * BBO Collared auction price
     *
     * @return the ReferencePrice field
     */
    public ReferencePriceField referencePrice() {
        return referencePrice;
    }

    /**
     * Number of shares on buy side at the Reference Price.
     *
     * @return the BuyShares field
     */
    public BuySharesField buyShares() {
        return buyShares;
    }

    /**
     * Number of shares on sell side at the Reference Price.
     *
     * @return the SellShares field
     */
    public SellSharesField sellShares() {
        return sellShares;
    }

    /**
     * Price at which the auction book and the continuous book would match.
     *
     * @return the IndicativePrice field
     */
    public IndicativePriceField indicativePrice() {
        return indicativePrice;
    }

    /**
     * Price at which the auction book would match using only Eligible Auction Orders
     *
     * @return the AuctionOnlyPrice field
     */
    public AuctionOnlyPriceField auctionOnlyPrice() {
        return auctionOnlyPrice;
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
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        if (!stockSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += StockSymbolField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!referencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ReferencePriceField.BYTE_LENGTH;
        if (!buyShares.parse(data, cursor)) {
            return false;
        }
        cursor += BuySharesField.BYTE_LENGTH;
        if (!sellShares.parse(data, cursor)) {
            return false;
        }
        cursor += SellSharesField.BYTE_LENGTH;
        if (!indicativePrice.parse(data, cursor)) {
            return false;
        }
        cursor += IndicativePriceField.BYTE_LENGTH;
        if (!auctionOnlyPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionOnlyPriceField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = stockSymbol.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = referencePrice.encode(data, cursor);
        cursor = buyShares.encode(data, cursor);
        cursor = sellShares.encode(data, cursor);
        cursor = indicativePrice.encode(data, cursor);
        cursor = auctionOnlyPrice.encode(data, cursor);
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
            case "TimeOffset" -> Optional.of(timeOffset);
            case "StockSymbol" -> Optional.of(stockSymbol);
            case "AuctionType" -> Optional.of(auctionType);
            case "ReferencePrice" -> Optional.of(referencePrice);
            case "BuyShares" -> Optional.of(buyShares);
            case "SellShares" -> Optional.of(sellShares);
            case "IndicativePrice" -> Optional.of(indicativePrice);
            case "AuctionOnlyPrice" -> Optional.of(auctionOnlyPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AuctionUpdateMessage message)) {
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
        if (!(other instanceof AuctionUpdateMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
