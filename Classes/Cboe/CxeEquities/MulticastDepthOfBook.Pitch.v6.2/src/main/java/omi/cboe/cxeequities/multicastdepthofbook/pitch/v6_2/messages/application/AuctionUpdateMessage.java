package omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_2.fields.AuctionTypeField;
import omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_2.fields.BuySharesField;
import omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_2.fields.IndicativePriceField;
import omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_2.fields.ReferencePriceField;
import omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_2.fields.ReservedField;
import omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_2.fields.SellSharesField;
import omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_2.fields.SymbolShortField;
import omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_2.fields.TimeOffsetField;
import omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_2.types.Field;
import omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_2.types.Message;
import omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_2.types.PrintOptions;

/**
 * Represents the AuctionUpdateMessage message from the MulticastDepthOfBook protocol.
 *
 * <p>Auction Update Message</p>
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
     * Nanosecond offset from last unit timestamp
     */
    private final TimeOffsetField timeOffset = new TimeOffsetField();

    /**
     * Symbol right padded with spaces
     */
    private final SymbolShortField symbolShort = new SymbolShortField();

    /**
     * O = Opening Auction C = Closing Auction H = Halt Auction V = Volatility Auction
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Reference Price
     */
    private final ReferencePriceField referencePrice = new ReferencePriceField();

    /**
     * Number of shares on the buy side at the Indicative Price
     */
    private final BuySharesField buyShares = new BuySharesField();

    /**
     * Number of shares on the sell side at the Indicative Price
     */
    private final SellSharesField sellShares = new SellSharesField();

    /**
     * Price at which the auction would match if executed at the time of the message
     */
    private final IndicativePriceField indicativePrice = new IndicativePriceField();

    /**
     * Reserved
     */
    private final ReservedField reserved = new ReservedField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timeOffset, symbolShort, auctionType, referencePrice, buyShares, sellShares, indicativePrice, reserved);

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
     * Symbol right padded with spaces
     *
     * @return the SymbolShort field
     */
    public SymbolShortField symbolShort() {
        return symbolShort;
    }

    /**
     * O = Opening Auction C = Closing Auction H = Halt Auction V = Volatility Auction
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * Reference Price
     *
     * @return the ReferencePrice field
     */
    public ReferencePriceField referencePrice() {
        return referencePrice;
    }

    /**
     * Number of shares on the buy side at the Indicative Price
     *
     * @return the BuyShares field
     */
    public BuySharesField buyShares() {
        return buyShares;
    }

    /**
     * Number of shares on the sell side at the Indicative Price
     *
     * @return the SellShares field
     */
    public SellSharesField sellShares() {
        return sellShares;
    }

    /**
     * Price at which the auction would match if executed at the time of the message
     *
     * @return the IndicativePrice field
     */
    public IndicativePriceField indicativePrice() {
        return indicativePrice;
    }

    /**
     * Reserved
     *
     * @return the Reserved field
     */
    public ReservedField reserved() {
        return reserved;
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
        if (!timeOffset.parse(data, cursor)) {
            return false;
        }
        cursor += TimeOffsetField.BYTE_LENGTH;
        if (!symbolShort.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolShortField.BYTE_LENGTH;
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
        return reserved.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timeOffset.encode(data, cursor);
        cursor = symbolShort.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = referencePrice.encode(data, cursor);
        cursor = buyShares.encode(data, cursor);
        cursor = sellShares.encode(data, cursor);
        cursor = indicativePrice.encode(data, cursor);
        cursor = reserved.encode(data, cursor);
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
            case "SymbolShort" -> Optional.of(symbolShort);
            case "AuctionType" -> Optional.of(auctionType);
            case "ReferencePrice" -> Optional.of(referencePrice);
            case "BuyShares" -> Optional.of(buyShares);
            case "SellShares" -> Optional.of(sellShares);
            case "IndicativePrice" -> Optional.of(indicativePrice);
            case "Reserved" -> Optional.of(reserved);
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
