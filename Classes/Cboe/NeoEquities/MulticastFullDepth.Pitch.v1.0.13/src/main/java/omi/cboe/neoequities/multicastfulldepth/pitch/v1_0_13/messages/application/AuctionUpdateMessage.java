package omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.fields.AuctionOnlyPriceField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.fields.AuctionTypeField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.fields.ImbalanceQuantityField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.fields.ImbalanceSideIndicatorField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.fields.IndicativePriceField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.fields.MatchedSharesField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.fields.OrderBookTypeField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.fields.ReferencePriceField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.fields.ReservedField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.fields.SymbolField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.fields.TimestampField;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.types.Field;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.types.Message;
import omi.cboe.neoequities.multicastfulldepth.pitch.v1_0_13.types.PrintOptions;

/**
 * Represents the AuctionUpdateMessage message from the MulticastFullDepth protocol.
 *
 * <p>Disseminates price and size information and Composite Market bid and offer prices during Opening Call, Closing Call, and reopening call (halt). Auction Update messages are sent during an auction period, unless in a delayed closing.</p>
 */
public final class AuctionUpdateMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 58;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Auction Update Message";

    /**
     * Time the message was generated.
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Order book to which the trading status applies.
     */
    private final OrderBookTypeField orderBookType = new OrderBookTypeField();

    /**
     * Symbol (right padded with spaces).
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Type of auction.
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Midpoint of the BBO, or NLSP if entering a delayed closing (trading status 'M'). Not used ($0.00) for Opening Call and reopening call.
     */
    private final ReferencePriceField referencePrice = new ReferencePriceField();

    /**
     * The size of the auction unmatched shares at the Reference Price (for the Closing Call). The size of the auction unmatched shares at the Indicative Price (for the Opening Call and reopening call).
     */
    private final ImbalanceQuantityField imbalanceQuantity = new ImbalanceQuantityField();

    /**
     * The side of the auction imbalance at the Reference Price (for the Closing Call). The side of the auction imbalance at the Indicative Price (for the Opening Call and reopening call).
     */
    private final ImbalanceSideIndicatorField imbalanceSideIndicator = new ImbalanceSideIndicatorField();

    /**
     * The matched shares at the Reference Price (for the Closing Call). The matched shares at the Indicative Price (for the Opening Call and reopening).
     */
    private final MatchedSharesField matchedShares = new MatchedSharesField();

    /**
     * Price at which the auction book and the continuous book would match.
     */
    private final IndicativePriceField indicativePrice = new IndicativePriceField();

    /**
     * For the Closing Call: Price at which the Closing Call Book would match using only eligible auction orders. Not used for the Opening Call and reopening call.
     */
    private final AuctionOnlyPriceField auctionOnlyPrice = new AuctionOnlyPriceField();

    /**
     * Reserved (undefined).
     */
    private final ReservedField reserved = new ReservedField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, orderBookType, symbol, auctionType, referencePrice, imbalanceQuantity, imbalanceSideIndicator, matchedShares, indicativePrice, auctionOnlyPrice, reserved);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time the message was generated.
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Order book to which the trading status applies.
     *
     * @return the OrderBookType field
     */
    public OrderBookTypeField orderBookType() {
        return orderBookType;
    }

    /**
     * Symbol (right padded with spaces).
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Type of auction.
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * Midpoint of the BBO, or NLSP if entering a delayed closing (trading status 'M'). Not used ($0.00) for Opening Call and reopening call.
     *
     * @return the ReferencePrice field
     */
    public ReferencePriceField referencePrice() {
        return referencePrice;
    }

    /**
     * The size of the auction unmatched shares at the Reference Price (for the Closing Call). The size of the auction unmatched shares at the Indicative Price (for the Opening Call and reopening call).
     *
     * @return the ImbalanceQuantity field
     */
    public ImbalanceQuantityField imbalanceQuantity() {
        return imbalanceQuantity;
    }

    /**
     * The side of the auction imbalance at the Reference Price (for the Closing Call). The side of the auction imbalance at the Indicative Price (for the Opening Call and reopening call).
     *
     * @return the ImbalanceSideIndicator field
     */
    public ImbalanceSideIndicatorField imbalanceSideIndicator() {
        return imbalanceSideIndicator;
    }

    /**
     * The matched shares at the Reference Price (for the Closing Call). The matched shares at the Indicative Price (for the Opening Call and reopening).
     *
     * @return the MatchedShares field
     */
    public MatchedSharesField matchedShares() {
        return matchedShares;
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
     * For the Closing Call: Price at which the Closing Call Book would match using only eligible auction orders. Not used for the Opening Call and reopening call.
     *
     * @return the AuctionOnlyPrice field
     */
    public AuctionOnlyPriceField auctionOnlyPrice() {
        return auctionOnlyPrice;
    }

    /**
     * Reserved (undefined).
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
        if (!orderBookType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookTypeField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!referencePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ReferencePriceField.BYTE_LENGTH;
        if (!imbalanceQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceQuantityField.BYTE_LENGTH;
        if (!imbalanceSideIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ImbalanceSideIndicatorField.BYTE_LENGTH;
        if (!matchedShares.parse(data, cursor)) {
            return false;
        }
        cursor += MatchedSharesField.BYTE_LENGTH;
        if (!indicativePrice.parse(data, cursor)) {
            return false;
        }
        cursor += IndicativePriceField.BYTE_LENGTH;
        if (!auctionOnlyPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionOnlyPriceField.BYTE_LENGTH;
        return reserved.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = orderBookType.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = referencePrice.encode(data, cursor);
        cursor = imbalanceQuantity.encode(data, cursor);
        cursor = imbalanceSideIndicator.encode(data, cursor);
        cursor = matchedShares.encode(data, cursor);
        cursor = indicativePrice.encode(data, cursor);
        cursor = auctionOnlyPrice.encode(data, cursor);
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
            case "Timestamp" -> Optional.of(timestampField);
            case "OrderBookType" -> Optional.of(orderBookType);
            case "Symbol" -> Optional.of(symbol);
            case "AuctionType" -> Optional.of(auctionType);
            case "ReferencePrice" -> Optional.of(referencePrice);
            case "ImbalanceQuantity" -> Optional.of(imbalanceQuantity);
            case "ImbalanceSideIndicator" -> Optional.of(imbalanceSideIndicator);
            case "MatchedShares" -> Optional.of(matchedShares);
            case "IndicativePrice" -> Optional.of(indicativePrice);
            case "AuctionOnlyPrice" -> Optional.of(auctionOnlyPrice);
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
