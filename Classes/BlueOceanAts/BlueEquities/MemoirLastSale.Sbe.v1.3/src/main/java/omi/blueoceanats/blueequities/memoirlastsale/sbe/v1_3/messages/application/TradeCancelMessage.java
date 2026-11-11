package omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.LastPriceField;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.SaleCondition1Field;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.SaleCondition2Field;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.SaleCondition3Field;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.SaleCondition4Field;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.SecurityIdField;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.TimestampField;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.TradeIdField;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.fields.TradeQtyField;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.types.Field;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.types.Message;
import omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.types.PrintOptions;

/**
 * Represents the TradeCancelMessage message from the MemoirLastSale protocol.
 *
 * <p>The exchange busted an execution found to be clearly erroneous; a broken trade cannot be reinstated</p>
 */
public final class TradeCancelMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u000B';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Cancel Message";

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
     * The quantity of the trade
     */
    private final TradeQtyField tradeQty = new TradeQtyField();

    /**
     * The price of the trade being cancelled, a signed mantissa scaled by a constant exponent of -6
     */
    private final LastPriceField lastPrice = new LastPriceField();

    /**
     * The sale condition code level 1, Settlement Type, as transmitted by the Utp and Cts
     */
    private final SaleCondition1Field saleCondition1 = new SaleCondition1Field();

    /**
     * The sale condition code level 2, Trade Through Exemption Type, the exemption rule that allowed a trade through
     */
    private final SaleCondition2Field saleCondition2 = new SaleCondition2Field();

    /**
     * The sale condition code level 3, Extended Hours Type, the extended trading hour sale condition from the Cts
     */
    private final SaleCondition3Field saleCondition3 = new SaleCondition3Field();

    /**
     * The sale condition code level 4, Sro Trade Detail Type, the self regulatory organization trade reporting category
     */
    private final SaleCondition4Field saleCondition4 = new SaleCondition4Field();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, securityId, tradeId, tradeQty, lastPrice, saleCondition1, saleCondition2, saleCondition3, saleCondition4);

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
     * The quantity of the trade
     *
     * @return the TradeQty field
     */
    public TradeQtyField tradeQty() {
        return tradeQty;
    }

    /**
     * The price of the trade being cancelled, a signed mantissa scaled by a constant exponent of -6
     *
     * @return the LastPrice field
     */
    public LastPriceField lastPrice() {
        return lastPrice;
    }

    /**
     * The sale condition code level 1, Settlement Type, as transmitted by the Utp and Cts
     *
     * @return the SaleCondition1 field
     */
    public SaleCondition1Field saleCondition1() {
        return saleCondition1;
    }

    /**
     * The sale condition code level 2, Trade Through Exemption Type, the exemption rule that allowed a trade through
     *
     * @return the SaleCondition2 field
     */
    public SaleCondition2Field saleCondition2() {
        return saleCondition2;
    }

    /**
     * The sale condition code level 3, Extended Hours Type, the extended trading hour sale condition from the Cts
     *
     * @return the SaleCondition3 field
     */
    public SaleCondition3Field saleCondition3() {
        return saleCondition3;
    }

    /**
     * The sale condition code level 4, Sro Trade Detail Type, the self regulatory organization trade reporting category
     *
     * @return the SaleCondition4 field
     */
    public SaleCondition4Field saleCondition4() {
        return saleCondition4;
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
        if (!tradeQty.parse(data, cursor)) {
            return false;
        }
        cursor += TradeQtyField.BYTE_LENGTH;
        if (!lastPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastPriceField.BYTE_LENGTH;
        if (!saleCondition1.parse(data, cursor)) {
            return false;
        }
        cursor += SaleCondition1Field.BYTE_LENGTH;
        if (!saleCondition2.parse(data, cursor)) {
            return false;
        }
        cursor += SaleCondition2Field.BYTE_LENGTH;
        if (!saleCondition3.parse(data, cursor)) {
            return false;
        }
        cursor += SaleCondition3Field.BYTE_LENGTH;
        return saleCondition4.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = tradeQty.encode(data, cursor);
        cursor = lastPrice.encode(data, cursor);
        cursor = saleCondition1.encode(data, cursor);
        cursor = saleCondition2.encode(data, cursor);
        cursor = saleCondition3.encode(data, cursor);
        cursor = saleCondition4.encode(data, cursor);
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
            case "TradeQty" -> Optional.of(tradeQty);
            case "LastPrice" -> Optional.of(lastPrice);
            case "SaleCondition1" -> Optional.of(saleCondition1);
            case "SaleCondition2" -> Optional.of(saleCondition2);
            case "SaleCondition3" -> Optional.of(saleCondition3);
            case "SaleCondition4" -> Optional.of(saleCondition4);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCancelMessage message)) {
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
        if (!(other instanceof TradeCancelMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
