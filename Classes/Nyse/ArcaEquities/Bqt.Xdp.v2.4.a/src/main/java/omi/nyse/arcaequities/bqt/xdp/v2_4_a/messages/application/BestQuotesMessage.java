package omi.nyse.arcaequities.bqt.xdp.v2_4_a.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.arcaequities.bqt.xdp.v2_4_a.fields.AskPriceField;
import omi.nyse.arcaequities.bqt.xdp.v2_4_a.fields.AskQuoteConditionField;
import omi.nyse.arcaequities.bqt.xdp.v2_4_a.fields.AskVolumeField;
import omi.nyse.arcaequities.bqt.xdp.v2_4_a.fields.BidPriceField;
import omi.nyse.arcaequities.bqt.xdp.v2_4_a.fields.BidQuoteConditionField;
import omi.nyse.arcaequities.bqt.xdp.v2_4_a.fields.BidVolumeField;
import omi.nyse.arcaequities.bqt.xdp.v2_4_a.fields.MarketIdOfBestAskField;
import omi.nyse.arcaequities.bqt.xdp.v2_4_a.fields.MarketIdOfBestBidField;
import omi.nyse.arcaequities.bqt.xdp.v2_4_a.fields.RetailPricingIndicatorField;
import omi.nyse.arcaequities.bqt.xdp.v2_4_a.fields.SymbolIndexField;
import omi.nyse.arcaequities.bqt.xdp.v2_4_a.fields.SymbolSeqNumberField;
import omi.nyse.arcaequities.bqt.xdp.v2_4_a.types.Field;
import omi.nyse.arcaequities.bqt.xdp.v2_4_a.types.Message;
import omi.nyse.arcaequities.bqt.xdp.v2_4_a.types.PrintOptions;

/**
 * Represents the BestQuotesMessage message from the Bqt protocol.
 *
 * <p>This message is sent when an event causes a change in one or both sides of the BBO.</p>
 */
public final class BestQuotesMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 31;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Best Quotes Message";

    /**
     * The unique ID of the symbol in the Symbol Index msg
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * The unique ID of this message in the sequence of messages published for this specific symbol.
     */
    private final SymbolSeqNumberField symbolSeqNumber = new SymbolSeqNumberField();

    /**
     * The Ask price. Use the Price scale from the symbol mapping index.
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * The Ask size.
     */
    private final AskVolumeField askVolume = new AskVolumeField();

    /**
     * The Bid price. Use the Price scale from the symbol mapping index.
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * The Bid size.
     */
    private final BidVolumeField bidVolume = new BidVolumeField();

    /**
     * Ask Quote Condition
     */
    private final AskQuoteConditionField askQuoteCondition = new AskQuoteConditionField();

    /**
     * Bid Quote Condition
     */
    private final BidQuoteConditionField bidQuoteCondition = new BidQuoteConditionField();

    /**
     * Retail Pricing Indicator
     */
    private final RetailPricingIndicatorField retailPricingIndicator = new RetailPricingIndicatorField();

    /**
     * The ID of the Originating Market for the Best Ask.
     */
    private final MarketIdOfBestAskField marketIdOfBestAsk = new MarketIdOfBestAskField();

    /**
     * The ID of the Originating Market for the Best Bid.
     */
    private final MarketIdOfBestBidField marketIdOfBestBid = new MarketIdOfBestBidField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(symbolIndex, symbolSeqNumber, askPrice, askVolume, bidPrice, bidVolume, askQuoteCondition, bidQuoteCondition, retailPricingIndicator, marketIdOfBestAsk, marketIdOfBestBid);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The unique ID of the symbol in the Symbol Index msg
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * The unique ID of this message in the sequence of messages published for this specific symbol.
     *
     * @return the SymbolSeqNumber field
     */
    public SymbolSeqNumberField symbolSeqNumber() {
        return symbolSeqNumber;
    }

    /**
     * The Ask price. Use the Price scale from the symbol mapping index.
     *
     * @return the AskPrice field
     */
    public AskPriceField askPrice() {
        return askPrice;
    }

    /**
     * The Ask size.
     *
     * @return the AskVolume field
     */
    public AskVolumeField askVolume() {
        return askVolume;
    }

    /**
     * The Bid price. Use the Price scale from the symbol mapping index.
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * The Bid size.
     *
     * @return the BidVolume field
     */
    public BidVolumeField bidVolume() {
        return bidVolume;
    }

    /**
     * Ask Quote Condition
     *
     * @return the AskQuoteCondition field
     */
    public AskQuoteConditionField askQuoteCondition() {
        return askQuoteCondition;
    }

    /**
     * Bid Quote Condition
     *
     * @return the BidQuoteCondition field
     */
    public BidQuoteConditionField bidQuoteCondition() {
        return bidQuoteCondition;
    }

    /**
     * Retail Pricing Indicator
     *
     * @return the RetailPricingIndicator field
     */
    public RetailPricingIndicatorField retailPricingIndicator() {
        return retailPricingIndicator;
    }

    /**
     * The ID of the Originating Market for the Best Ask.
     *
     * @return the MarketIdOfBestAsk field
     */
    public MarketIdOfBestAskField marketIdOfBestAsk() {
        return marketIdOfBestAsk;
    }

    /**
     * The ID of the Originating Market for the Best Bid.
     *
     * @return the MarketIdOfBestBid field
     */
    public MarketIdOfBestBidField marketIdOfBestBid() {
        return marketIdOfBestBid;
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
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!symbolSeqNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolSeqNumberField.BYTE_LENGTH;
        if (!askPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceField.BYTE_LENGTH;
        if (!askVolume.parse(data, cursor)) {
            return false;
        }
        cursor += AskVolumeField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        if (!bidVolume.parse(data, cursor)) {
            return false;
        }
        cursor += BidVolumeField.BYTE_LENGTH;
        if (!askQuoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += AskQuoteConditionField.BYTE_LENGTH;
        if (!bidQuoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += BidQuoteConditionField.BYTE_LENGTH;
        if (!retailPricingIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += RetailPricingIndicatorField.BYTE_LENGTH;
        if (!marketIdOfBestAsk.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdOfBestAskField.BYTE_LENGTH;
        return marketIdOfBestBid.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = symbolIndex.encode(data, cursor);
        cursor = symbolSeqNumber.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = askVolume.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = bidVolume.encode(data, cursor);
        cursor = askQuoteCondition.encode(data, cursor);
        cursor = bidQuoteCondition.encode(data, cursor);
        cursor = retailPricingIndicator.encode(data, cursor);
        cursor = marketIdOfBestAsk.encode(data, cursor);
        cursor = marketIdOfBestBid.encode(data, cursor);
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
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "SymbolSeqNumber" -> Optional.of(symbolSeqNumber);
            case "AskPrice" -> Optional.of(askPrice);
            case "AskVolume" -> Optional.of(askVolume);
            case "BidPrice" -> Optional.of(bidPrice);
            case "BidVolume" -> Optional.of(bidVolume);
            case "AskQuoteCondition" -> Optional.of(askQuoteCondition);
            case "BidQuoteCondition" -> Optional.of(bidQuoteCondition);
            case "RetailPricingIndicator" -> Optional.of(retailPricingIndicator);
            case "MarketIdOfBestAsk" -> Optional.of(marketIdOfBestAsk);
            case "MarketIdOfBestBid" -> Optional.of(marketIdOfBestBid);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof BestQuotesMessage message)) {
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
        if (!(other instanceof BestQuotesMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
