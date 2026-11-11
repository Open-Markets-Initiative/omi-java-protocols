package omi.nyse.nyseequities.bbo.pillar.v2_5_b.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.bbo.pillar.v2_5_b.fields.AskPriceField;
import omi.nyse.nyseequities.bbo.pillar.v2_5_b.fields.AskVolumeField;
import omi.nyse.nyseequities.bbo.pillar.v2_5_b.fields.BidPriceField;
import omi.nyse.nyseequities.bbo.pillar.v2_5_b.fields.BidVolumeField;
import omi.nyse.nyseequities.bbo.pillar.v2_5_b.fields.QuoteConditionField;
import omi.nyse.nyseequities.bbo.pillar.v2_5_b.fields.RpiIndicatorField;
import omi.nyse.nyseequities.bbo.pillar.v2_5_b.fields.SourceTimeNsField;
import omi.nyse.nyseequities.bbo.pillar.v2_5_b.fields.SymbolIndexField;
import omi.nyse.nyseequities.bbo.pillar.v2_5_b.fields.SymbolSeqNumField;
import omi.nyse.nyseequities.bbo.pillar.v2_5_b.types.Field;
import omi.nyse.nyseequities.bbo.pillar.v2_5_b.types.Message;
import omi.nyse.nyseequities.bbo.pillar.v2_5_b.types.PrintOptions;

/**
 * Represents the QuoteMessage message from the Bbo protocol.
 *
 * <p>A quote message is sent when any event results in a new top of book value on either side of the market.</p>
 */
public final class QuoteMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 30;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Message";

    /**
     * The nanosecond offset from the SourceTime
     */
    private final SourceTimeNsField sourceTimeNs = new SourceTimeNsField();

    /**
     * The unique ID of this symbol for all products within this market. This ID cannot be used to cross reference a security between markets.
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * Reserved for future use. Ignore any content. This usage will become standard across all products in future releases.
     */
    private final SymbolSeqNumField symbolSeqNum = new SymbolSeqNumField();

    /**
     * The Ask price. Use the Price scale from the Symbol Index message.
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * The aggregate round lot size at the ask price, in shares.
     */
    private final AskVolumeField askVolume = new AskVolumeField();

    /**
     * The Bid price. Use the Price scale from the Symbol Index message.
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * The aggregate round lot size at the bid price, in shares.
     */
    private final BidVolumeField bidVolume = new BidVolumeField();

    /**
     * Quote condition values. For markets other than NYSE, only condition R is applicable.
     */
    private final QuoteConditionField quoteCondition = new QuoteConditionField();

    /**
     * The side(s) where Retail Price Indication orders (RPI orders) exist.
     */
    private final RpiIndicatorField rpiIndicator = new RpiIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sourceTimeNs, symbolIndex, symbolSeqNum, askPrice, askVolume, bidPrice, bidVolume, quoteCondition, rpiIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The nanosecond offset from the SourceTime
     *
     * @return the SourceTimeNs field
     */
    public SourceTimeNsField sourceTimeNs() {
        return sourceTimeNs;
    }

    /**
     * The unique ID of this symbol for all products within this market. This ID cannot be used to cross reference a security between markets.
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * Reserved for future use. Ignore any content. This usage will become standard across all products in future releases.
     *
     * @return the SymbolSeqNum field
     */
    public SymbolSeqNumField symbolSeqNum() {
        return symbolSeqNum;
    }

    /**
     * The Ask price. Use the Price scale from the Symbol Index message.
     *
     * @return the AskPrice field
     */
    public AskPriceField askPrice() {
        return askPrice;
    }

    /**
     * The aggregate round lot size at the ask price, in shares.
     *
     * @return the AskVolume field
     */
    public AskVolumeField askVolume() {
        return askVolume;
    }

    /**
     * The Bid price. Use the Price scale from the Symbol Index message.
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * The aggregate round lot size at the bid price, in shares.
     *
     * @return the BidVolume field
     */
    public BidVolumeField bidVolume() {
        return bidVolume;
    }

    /**
     * Quote condition values. For markets other than NYSE, only condition R is applicable.
     *
     * @return the QuoteCondition field
     */
    public QuoteConditionField quoteCondition() {
        return quoteCondition;
    }

    /**
     * The side(s) where Retail Price Indication orders (RPI orders) exist.
     *
     * @return the RpiIndicator field
     */
    public RpiIndicatorField rpiIndicator() {
        return rpiIndicator;
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
        if (!sourceTimeNs.parse(data, cursor)) {
            return false;
        }
        cursor += SourceTimeNsField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!symbolSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolSeqNumField.BYTE_LENGTH;
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
        if (!quoteCondition.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteConditionField.BYTE_LENGTH;
        return rpiIndicator.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sourceTimeNs.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = symbolSeqNum.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = askVolume.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = bidVolume.encode(data, cursor);
        cursor = quoteCondition.encode(data, cursor);
        cursor = rpiIndicator.encode(data, cursor);
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
            case "SourceTimeNs" -> Optional.of(sourceTimeNs);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "SymbolSeqNum" -> Optional.of(symbolSeqNum);
            case "AskPrice" -> Optional.of(askPrice);
            case "AskVolume" -> Optional.of(askVolume);
            case "BidPrice" -> Optional.of(bidPrice);
            case "BidVolume" -> Optional.of(bidVolume);
            case "QuoteCondition" -> Optional.of(quoteCondition);
            case "RpiIndicator" -> Optional.of(rpiIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteMessage message)) {
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
        if (!(other instanceof QuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
