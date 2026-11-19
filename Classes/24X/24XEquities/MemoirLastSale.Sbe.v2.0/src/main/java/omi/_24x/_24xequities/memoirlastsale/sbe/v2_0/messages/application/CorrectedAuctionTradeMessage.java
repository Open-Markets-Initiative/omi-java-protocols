package omi._24x._24xequities.memoirlastsale.sbe.v2_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.fields.AuctionIdField;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.fields.CorrectedAuctionPriceField;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.fields.CorrectedAuctionQuantityField;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.fields.CorrectedSaleCondition1Field;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.fields.CorrectedSaleCondition2Field;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.fields.CorrectedSaleCondition3Field;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.fields.CorrectedSaleCondition4Field;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.fields.OriginalAuctionPriceField;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.fields.OriginalAuctionQuantityField;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.fields.OriginalSaleCondition1Field;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.fields.OriginalSaleCondition2Field;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.fields.OriginalSaleCondition3Field;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.fields.OriginalSaleCondition4Field;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.fields.SecurityIdField;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.fields.TimestampField;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.fields.TradeIdField;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.types.Field;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.types.Message;
import omi._24x._24xequities.memoirlastsale.sbe.v2_0.types.PrintOptions;

/**
 * Represents the CorrectedAuctionTradeMessage message from the MemoirLastSale protocol.
 *
 * <p>CorrectedAuctionTradeMessage</p>
 */
public final class CorrectedAuctionTradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u000F';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 66;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Corrected Auction Trade Message";

    /**
     * Timestamp
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * SecurityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * AuctionID
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * TradeID
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * OriginalAuctionQuantity
     */
    private final OriginalAuctionQuantityField originalAuctionQuantity = new OriginalAuctionQuantityField();

    /**
     * OriginalAuctionPrice
     */
    private final OriginalAuctionPriceField originalAuctionPrice = new OriginalAuctionPriceField();

    /**
     * OriginalSaleCondition1
     */
    private final OriginalSaleCondition1Field originalSaleCondition1 = new OriginalSaleCondition1Field();

    /**
     * OriginalSaleCondition2
     */
    private final OriginalSaleCondition2Field originalSaleCondition2 = new OriginalSaleCondition2Field();

    /**
     * OriginalSaleCondition3
     */
    private final OriginalSaleCondition3Field originalSaleCondition3 = new OriginalSaleCondition3Field();

    /**
     * OriginalSaleCondition4
     */
    private final OriginalSaleCondition4Field originalSaleCondition4 = new OriginalSaleCondition4Field();

    /**
     * CorrectedAuctionQuantity
     */
    private final CorrectedAuctionQuantityField correctedAuctionQuantity = new CorrectedAuctionQuantityField();

    /**
     * CorrectedAuctionPrice
     */
    private final CorrectedAuctionPriceField correctedAuctionPrice = new CorrectedAuctionPriceField();

    /**
     * CorrectedSaleCondition1
     */
    private final CorrectedSaleCondition1Field correctedSaleCondition1 = new CorrectedSaleCondition1Field();

    /**
     * CorrectedSaleCondition2
     */
    private final CorrectedSaleCondition2Field correctedSaleCondition2 = new CorrectedSaleCondition2Field();

    /**
     * CorrectedSaleCondition3
     */
    private final CorrectedSaleCondition3Field correctedSaleCondition3 = new CorrectedSaleCondition3Field();

    /**
     * CorrectedSaleCondition4
     */
    private final CorrectedSaleCondition4Field correctedSaleCondition4 = new CorrectedSaleCondition4Field();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, securityId, auctionId, tradeId, originalAuctionQuantity, originalAuctionPrice, originalSaleCondition1, originalSaleCondition2, originalSaleCondition3, originalSaleCondition4, correctedAuctionQuantity, correctedAuctionPrice, correctedSaleCondition1, correctedSaleCondition2, correctedSaleCondition3, correctedSaleCondition4);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Timestamp
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * SecurityID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * AuctionID
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * TradeID
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * OriginalAuctionQuantity
     *
     * @return the OriginalAuctionQuantity field
     */
    public OriginalAuctionQuantityField originalAuctionQuantity() {
        return originalAuctionQuantity;
    }

    /**
     * OriginalAuctionPrice
     *
     * @return the OriginalAuctionPrice field
     */
    public OriginalAuctionPriceField originalAuctionPrice() {
        return originalAuctionPrice;
    }

    /**
     * OriginalSaleCondition1
     *
     * @return the OriginalSaleCondition1 field
     */
    public OriginalSaleCondition1Field originalSaleCondition1() {
        return originalSaleCondition1;
    }

    /**
     * OriginalSaleCondition2
     *
     * @return the OriginalSaleCondition2 field
     */
    public OriginalSaleCondition2Field originalSaleCondition2() {
        return originalSaleCondition2;
    }

    /**
     * OriginalSaleCondition3
     *
     * @return the OriginalSaleCondition3 field
     */
    public OriginalSaleCondition3Field originalSaleCondition3() {
        return originalSaleCondition3;
    }

    /**
     * OriginalSaleCondition4
     *
     * @return the OriginalSaleCondition4 field
     */
    public OriginalSaleCondition4Field originalSaleCondition4() {
        return originalSaleCondition4;
    }

    /**
     * CorrectedAuctionQuantity
     *
     * @return the CorrectedAuctionQuantity field
     */
    public CorrectedAuctionQuantityField correctedAuctionQuantity() {
        return correctedAuctionQuantity;
    }

    /**
     * CorrectedAuctionPrice
     *
     * @return the CorrectedAuctionPrice field
     */
    public CorrectedAuctionPriceField correctedAuctionPrice() {
        return correctedAuctionPrice;
    }

    /**
     * CorrectedSaleCondition1
     *
     * @return the CorrectedSaleCondition1 field
     */
    public CorrectedSaleCondition1Field correctedSaleCondition1() {
        return correctedSaleCondition1;
    }

    /**
     * CorrectedSaleCondition2
     *
     * @return the CorrectedSaleCondition2 field
     */
    public CorrectedSaleCondition2Field correctedSaleCondition2() {
        return correctedSaleCondition2;
    }

    /**
     * CorrectedSaleCondition3
     *
     * @return the CorrectedSaleCondition3 field
     */
    public CorrectedSaleCondition3Field correctedSaleCondition3() {
        return correctedSaleCondition3;
    }

    /**
     * CorrectedSaleCondition4
     *
     * @return the CorrectedSaleCondition4 field
     */
    public CorrectedSaleCondition4Field correctedSaleCondition4() {
        return correctedSaleCondition4;
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
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!originalAuctionQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalAuctionQuantityField.BYTE_LENGTH;
        if (!originalAuctionPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalAuctionPriceField.BYTE_LENGTH;
        if (!originalSaleCondition1.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalSaleCondition1Field.BYTE_LENGTH;
        if (!originalSaleCondition2.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalSaleCondition2Field.BYTE_LENGTH;
        if (!originalSaleCondition3.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalSaleCondition3Field.BYTE_LENGTH;
        if (!originalSaleCondition4.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalSaleCondition4Field.BYTE_LENGTH;
        if (!correctedAuctionQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedAuctionQuantityField.BYTE_LENGTH;
        if (!correctedAuctionPrice.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedAuctionPriceField.BYTE_LENGTH;
        if (!correctedSaleCondition1.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedSaleCondition1Field.BYTE_LENGTH;
        if (!correctedSaleCondition2.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedSaleCondition2Field.BYTE_LENGTH;
        if (!correctedSaleCondition3.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedSaleCondition3Field.BYTE_LENGTH;
        return correctedSaleCondition4.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = originalAuctionQuantity.encode(data, cursor);
        cursor = originalAuctionPrice.encode(data, cursor);
        cursor = originalSaleCondition1.encode(data, cursor);
        cursor = originalSaleCondition2.encode(data, cursor);
        cursor = originalSaleCondition3.encode(data, cursor);
        cursor = originalSaleCondition4.encode(data, cursor);
        cursor = correctedAuctionQuantity.encode(data, cursor);
        cursor = correctedAuctionPrice.encode(data, cursor);
        cursor = correctedSaleCondition1.encode(data, cursor);
        cursor = correctedSaleCondition2.encode(data, cursor);
        cursor = correctedSaleCondition3.encode(data, cursor);
        cursor = correctedSaleCondition4.encode(data, cursor);
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
            case "SecurityId" -> Optional.of(securityId);
            case "AuctionId" -> Optional.of(auctionId);
            case "TradeId" -> Optional.of(tradeId);
            case "OriginalAuctionQuantity" -> Optional.of(originalAuctionQuantity);
            case "OriginalAuctionPrice" -> Optional.of(originalAuctionPrice);
            case "OriginalSaleCondition1" -> Optional.of(originalSaleCondition1);
            case "OriginalSaleCondition2" -> Optional.of(originalSaleCondition2);
            case "OriginalSaleCondition3" -> Optional.of(originalSaleCondition3);
            case "OriginalSaleCondition4" -> Optional.of(originalSaleCondition4);
            case "CorrectedAuctionQuantity" -> Optional.of(correctedAuctionQuantity);
            case "CorrectedAuctionPrice" -> Optional.of(correctedAuctionPrice);
            case "CorrectedSaleCondition1" -> Optional.of(correctedSaleCondition1);
            case "CorrectedSaleCondition2" -> Optional.of(correctedSaleCondition2);
            case "CorrectedSaleCondition3" -> Optional.of(correctedSaleCondition3);
            case "CorrectedSaleCondition4" -> Optional.of(correctedSaleCondition4);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CorrectedAuctionTradeMessage message)) {
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
        if (!(other instanceof CorrectedAuctionTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
