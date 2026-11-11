package omi.ice.icefutures.mdf.impact.v1_1_24.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.AggBidQtyField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.AggOfferQtyField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.AuctionDateField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.DescriptionField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.EurPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.GbpPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.IsBalancedField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.IsFinalField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.MarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.MessageDateTimeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.RoundField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.UsdPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Message;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.PrintOptions;

/**
 * Represents the FixingLockdownMessage message from the Mdf protocol.
 *
 * <p>This message supports ICE Benchmark Administration’s (IBA) electronic Gold Auction and it is disseminated when there is a transition of the fixing market.</p>
 */
public final class FixingLockdownMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '4';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 78;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Fixing Lockdown Message";

    /**
     * Market Id
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * Date format
     */
    private final AuctionDateField auctionDate = new AuctionDateField();

    /**
     * Date time the trade was investigated
     */
    private final MessageDateTimeField messageDateTime = new MessageDateTimeField();

    /**
     * The auction runs twice daily at 10:30am and 3:00pm London time. The values disseminated via this field are: ‘GOLD_1030’, ‘GOLD_1500’
     */
    private final DescriptionField description = new DescriptionField();

    /**
     * Round
     */
    private final RoundField round = new RoundField();

    /**
     * Aggregate bid quantity
     */
    private final AggBidQtyField aggBidQty = new AggBidQtyField();

    /**
     * Aggregate offer quantity
     */
    private final AggOfferQtyField aggOfferQty = new AggOfferQtyField();

    /**
     * Auctioneers price for the round in USD. Use 2 decimal places for USD Price.
     */
    private final UsdPriceField usdPrice = new UsdPriceField();

    /**
     * ‘Y’/’N’
     */
    private final IsBalancedField isBalanced = new IsBalancedField();

    /**
     * ‘Y’/’N’
     */
    private final IsFinalField isFinal = new IsFinalField();

    /**
     * Auctioneers price for the round in GBP. Use 3 decimal places for GBP Price.
     */
    private final GbpPriceField gbpPrice = new GbpPriceField();

    /**
     * Auctioneers price for the round in EUR. Use 3 decimal places for EUR Price.
     */
    private final EurPriceField eurPrice = new EurPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketId, auctionDate, messageDateTime, description, round, aggBidQty, aggOfferQty, usdPrice, isBalanced, isFinal, gbpPrice, eurPrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Market Id
     *
     * @return the MarketId field
     */
    public MarketIdField marketId() {
        return marketId;
    }

    /**
     * Date format
     *
     * @return the AuctionDate field
     */
    public AuctionDateField auctionDate() {
        return auctionDate;
    }

    /**
     * Date time the trade was investigated
     *
     * @return the MessageDateTime field
     */
    public MessageDateTimeField messageDateTime() {
        return messageDateTime;
    }

    /**
     * The auction runs twice daily at 10:30am and 3:00pm London time. The values disseminated via this field are: ‘GOLD_1030’, ‘GOLD_1500’
     *
     * @return the Description field
     */
    public DescriptionField description() {
        return description;
    }

    /**
     * Round
     *
     * @return the Round field
     */
    public RoundField round() {
        return round;
    }

    /**
     * Aggregate bid quantity
     *
     * @return the AggBidQty field
     */
    public AggBidQtyField aggBidQty() {
        return aggBidQty;
    }

    /**
     * Aggregate offer quantity
     *
     * @return the AggOfferQty field
     */
    public AggOfferQtyField aggOfferQty() {
        return aggOfferQty;
    }

    /**
     * Auctioneers price for the round in USD. Use 2 decimal places for USD Price.
     *
     * @return the UsdPrice field
     */
    public UsdPriceField usdPrice() {
        return usdPrice;
    }

    /**
     * ‘Y’/’N’
     *
     * @return the IsBalanced field
     */
    public IsBalancedField isBalanced() {
        return isBalanced;
    }

    /**
     * ‘Y’/’N’
     *
     * @return the IsFinal field
     */
    public IsFinalField isFinal() {
        return isFinal;
    }

    /**
     * Auctioneers price for the round in GBP. Use 3 decimal places for GBP Price.
     *
     * @return the GbpPrice field
     */
    public GbpPriceField gbpPrice() {
        return gbpPrice;
    }

    /**
     * Auctioneers price for the round in EUR. Use 3 decimal places for EUR Price.
     *
     * @return the EurPrice field
     */
    public EurPriceField eurPrice() {
        return eurPrice;
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
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!auctionDate.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionDateField.BYTE_LENGTH;
        if (!messageDateTime.parse(data, cursor)) {
            return false;
        }
        cursor += MessageDateTimeField.BYTE_LENGTH;
        if (!description.parse(data, cursor)) {
            return false;
        }
        cursor += DescriptionField.BYTE_LENGTH;
        if (!round.parse(data, cursor)) {
            return false;
        }
        cursor += RoundField.BYTE_LENGTH;
        if (!aggBidQty.parse(data, cursor)) {
            return false;
        }
        cursor += AggBidQtyField.BYTE_LENGTH;
        if (!aggOfferQty.parse(data, cursor)) {
            return false;
        }
        cursor += AggOfferQtyField.BYTE_LENGTH;
        if (!usdPrice.parse(data, cursor)) {
            return false;
        }
        cursor += UsdPriceField.BYTE_LENGTH;
        if (!isBalanced.parse(data, cursor)) {
            return false;
        }
        cursor += IsBalancedField.BYTE_LENGTH;
        if (!isFinal.parse(data, cursor)) {
            return false;
        }
        cursor += IsFinalField.BYTE_LENGTH;
        if (!gbpPrice.parse(data, cursor)) {
            return false;
        }
        cursor += GbpPriceField.BYTE_LENGTH;
        return eurPrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = marketId.encode(data, cursor);
        cursor = auctionDate.encode(data, cursor);
        cursor = messageDateTime.encode(data, cursor);
        cursor = description.encode(data, cursor);
        cursor = round.encode(data, cursor);
        cursor = aggBidQty.encode(data, cursor);
        cursor = aggOfferQty.encode(data, cursor);
        cursor = usdPrice.encode(data, cursor);
        cursor = isBalanced.encode(data, cursor);
        cursor = isFinal.encode(data, cursor);
        cursor = gbpPrice.encode(data, cursor);
        cursor = eurPrice.encode(data, cursor);
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
            case "MarketId" -> Optional.of(marketId);
            case "AuctionDate" -> Optional.of(auctionDate);
            case "MessageDateTime" -> Optional.of(messageDateTime);
            case "Description" -> Optional.of(description);
            case "Round" -> Optional.of(round);
            case "AggBidQty" -> Optional.of(aggBidQty);
            case "AggOfferQty" -> Optional.of(aggOfferQty);
            case "UsdPrice" -> Optional.of(usdPrice);
            case "IsBalanced" -> Optional.of(isBalanced);
            case "IsFinal" -> Optional.of(isFinal);
            case "GbpPrice" -> Optional.of(gbpPrice);
            case "EurPrice" -> Optional.of(eurPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof FixingLockdownMessage message)) {
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
        if (!(other instanceof FixingLockdownMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
