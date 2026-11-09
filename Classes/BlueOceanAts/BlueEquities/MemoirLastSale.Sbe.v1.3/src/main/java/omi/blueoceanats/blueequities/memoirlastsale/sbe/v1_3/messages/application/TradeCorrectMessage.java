package omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.CorrectedSaleCondition1Field;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.CorrectedSaleCondition2Field;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.CorrectedSaleCondition3Field;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.CorrectedSaleCondition4Field;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.CorrectedTradePriceField;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.CorrectedTradeQtyField;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.OriginalSaleCondition1Field;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.OriginalSaleCondition2Field;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.OriginalSaleCondition3Field;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.OriginalSaleCondition4Field;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.OriginalTradePriceField;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.OriginalTradeQtyField;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.SecurityIdField;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.TimestampField;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.TradeIdField;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.types.Field;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.types.Message;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.types.PrintOptions;

/**
 * Represents the TradeCorrectMessage message from the MemoirLastSale protocol.
 *
 * <p>Trade cancellation or correction policy has altered the details of an existing trade, carrying both the original and the corrected values</p>
 */
public final class TradeCorrectMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\f';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 50;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Correct Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * The timestamp when the event occurred, nanoseconds since the unix epoch
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * An instrument code uniquely identifying the security from the Instrument Directory
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * The unique identifier of the execution message
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * The original quantity of the trade being corrected
     */
    private final OriginalTradeQtyField originalTradeQty = new OriginalTradeQtyField();

    /**
     * The original price of the trade being corrected, a signed mantissa scaled by a constant exponent of -6
     */
    private final OriginalTradePriceField originalTradePrice = new OriginalTradePriceField();

    /**
     * The original sale condition code level 1, Settlement Type
     */
    private final OriginalSaleCondition1Field originalSaleCondition1 = new OriginalSaleCondition1Field();

    /**
     * The original sale condition code level 2, Trade Through Exemption Type
     */
    private final OriginalSaleCondition2Field originalSaleCondition2 = new OriginalSaleCondition2Field();

    /**
     * The original sale condition code level 3, Extended Hours Type
     */
    private final OriginalSaleCondition3Field originalSaleCondition3 = new OriginalSaleCondition3Field();

    /**
     * The original sale condition code level 4, Sro Trade Detail Type
     */
    private final OriginalSaleCondition4Field originalSaleCondition4 = new OriginalSaleCondition4Field();

    /**
     * The corrected trade quantity
     */
    private final CorrectedTradeQtyField correctedTradeQty = new CorrectedTradeQtyField();

    /**
     * The corrected trade price, a signed mantissa scaled by a constant exponent of -6
     */
    private final CorrectedTradePriceField correctedTradePrice = new CorrectedTradePriceField();

    /**
     * The corrected sale condition code level 1, Settlement Type
     */
    private final CorrectedSaleCondition1Field correctedSaleCondition1 = new CorrectedSaleCondition1Field();

    /**
     * The corrected sale condition code level 2, Trade Through Exemption Type
     */
    private final CorrectedSaleCondition2Field correctedSaleCondition2 = new CorrectedSaleCondition2Field();

    /**
     * The corrected sale condition code level 3, Extended Hours Type
     */
    private final CorrectedSaleCondition3Field correctedSaleCondition3 = new CorrectedSaleCondition3Field();

    /**
     * The corrected sale condition code level 4, Sro Trade Detail Type
     */
    private final CorrectedSaleCondition4Field correctedSaleCondition4 = new CorrectedSaleCondition4Field();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, securityId, tradeId, originalTradeQty, originalTradePrice, originalSaleCondition1, originalSaleCondition2, originalSaleCondition3, originalSaleCondition4, correctedTradeQty, correctedTradePrice, correctedSaleCondition1, correctedSaleCondition2, correctedSaleCondition3, correctedSaleCondition4);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The timestamp when the event occurred, nanoseconds since the unix epoch
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * An instrument code uniquely identifying the security from the Instrument Directory
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * The unique identifier of the execution message
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * The original quantity of the trade being corrected
     *
     * @return the OriginalTradeQty field
     */
    public OriginalTradeQtyField originalTradeQty() {
        return originalTradeQty;
    }

    /**
     * The original price of the trade being corrected, a signed mantissa scaled by a constant exponent of -6
     *
     * @return the OriginalTradePrice field
     */
    public OriginalTradePriceField originalTradePrice() {
        return originalTradePrice;
    }

    /**
     * The original sale condition code level 1, Settlement Type
     *
     * @return the OriginalSaleCondition1 field
     */
    public OriginalSaleCondition1Field originalSaleCondition1() {
        return originalSaleCondition1;
    }

    /**
     * The original sale condition code level 2, Trade Through Exemption Type
     *
     * @return the OriginalSaleCondition2 field
     */
    public OriginalSaleCondition2Field originalSaleCondition2() {
        return originalSaleCondition2;
    }

    /**
     * The original sale condition code level 3, Extended Hours Type
     *
     * @return the OriginalSaleCondition3 field
     */
    public OriginalSaleCondition3Field originalSaleCondition3() {
        return originalSaleCondition3;
    }

    /**
     * The original sale condition code level 4, Sro Trade Detail Type
     *
     * @return the OriginalSaleCondition4 field
     */
    public OriginalSaleCondition4Field originalSaleCondition4() {
        return originalSaleCondition4;
    }

    /**
     * The corrected trade quantity
     *
     * @return the CorrectedTradeQty field
     */
    public CorrectedTradeQtyField correctedTradeQty() {
        return correctedTradeQty;
    }

    /**
     * The corrected trade price, a signed mantissa scaled by a constant exponent of -6
     *
     * @return the CorrectedTradePrice field
     */
    public CorrectedTradePriceField correctedTradePrice() {
        return correctedTradePrice;
    }

    /**
     * The corrected sale condition code level 1, Settlement Type
     *
     * @return the CorrectedSaleCondition1 field
     */
    public CorrectedSaleCondition1Field correctedSaleCondition1() {
        return correctedSaleCondition1;
    }

    /**
     * The corrected sale condition code level 2, Trade Through Exemption Type
     *
     * @return the CorrectedSaleCondition2 field
     */
    public CorrectedSaleCondition2Field correctedSaleCondition2() {
        return correctedSaleCondition2;
    }

    /**
     * The corrected sale condition code level 3, Extended Hours Type
     *
     * @return the CorrectedSaleCondition3 field
     */
    public CorrectedSaleCondition3Field correctedSaleCondition3() {
        return correctedSaleCondition3;
    }

    /**
     * The corrected sale condition code level 4, Sro Trade Detail Type
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!originalTradeQty.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradeQtyField.BYTE_LENGTH;
        if (!originalTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalTradePriceField.BYTE_LENGTH;
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
        if (!correctedTradeQty.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedTradeQtyField.BYTE_LENGTH;
        if (!correctedTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedTradePriceField.BYTE_LENGTH;
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
        if (!correctedSaleCondition4.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedSaleCondition4Field.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = originalTradeQty.encode(data, cursor);
        cursor = originalTradePrice.encode(data, cursor);
        cursor = originalSaleCondition1.encode(data, cursor);
        cursor = originalSaleCondition2.encode(data, cursor);
        cursor = originalSaleCondition3.encode(data, cursor);
        cursor = originalSaleCondition4.encode(data, cursor);
        cursor = correctedTradeQty.encode(data, cursor);
        cursor = correctedTradePrice.encode(data, cursor);
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
            case "TradeId" -> Optional.of(tradeId);
            case "OriginalTradeQty" -> Optional.of(originalTradeQty);
            case "OriginalTradePrice" -> Optional.of(originalTradePrice);
            case "OriginalSaleCondition1" -> Optional.of(originalSaleCondition1);
            case "OriginalSaleCondition2" -> Optional.of(originalSaleCondition2);
            case "OriginalSaleCondition3" -> Optional.of(originalSaleCondition3);
            case "OriginalSaleCondition4" -> Optional.of(originalSaleCondition4);
            case "CorrectedTradeQty" -> Optional.of(correctedTradeQty);
            case "CorrectedTradePrice" -> Optional.of(correctedTradePrice);
            case "CorrectedSaleCondition1" -> Optional.of(correctedSaleCondition1);
            case "CorrectedSaleCondition2" -> Optional.of(correctedSaleCondition2);
            case "CorrectedSaleCondition3" -> Optional.of(correctedSaleCondition3);
            case "CorrectedSaleCondition4" -> Optional.of(correctedSaleCondition4);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCorrectMessage message)) {
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
        if (!(other instanceof TradeCorrectMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
