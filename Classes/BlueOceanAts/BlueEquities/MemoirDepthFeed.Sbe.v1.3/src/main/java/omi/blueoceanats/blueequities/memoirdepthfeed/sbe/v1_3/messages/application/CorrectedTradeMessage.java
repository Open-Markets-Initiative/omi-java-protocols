package omi.blueoceanats.blueequities.memoirdepthfeed.sbe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.blueoceanats.blueequities.memoirdepthfeed.sbe.v1_3.fields.CorrectedPriceField;
import omi.blueoceanats.blueequities.memoirdepthfeed.sbe.v1_3.fields.CorrectedQuantityField;
import omi.blueoceanats.blueequities.memoirdepthfeed.sbe.v1_3.fields.OriginalPriceField;
import omi.blueoceanats.blueequities.memoirdepthfeed.sbe.v1_3.fields.OriginalQuantityField;
import omi.blueoceanats.blueequities.memoirdepthfeed.sbe.v1_3.fields.SecurityIdField;
import omi.blueoceanats.blueequities.memoirdepthfeed.sbe.v1_3.fields.TimestampField;
import omi.blueoceanats.blueequities.memoirdepthfeed.sbe.v1_3.fields.TradeIdField;
import omi.blueoceanats.blueequities.memoirdepthfeed.sbe.v1_3.types.Field;
import omi.blueoceanats.blueequities.memoirdepthfeed.sbe.v1_3.types.Message;
import omi.blueoceanats.blueequities.memoirdepthfeed.sbe.v1_3.types.PrintOptions;

/**
 * Represents the CorrectedTradeMessage message from the MemoirDepthFeed protocol.
 *
 * <p>An operational or regulatory action has corrected an execution without busting it; replace the original volume and price with the corrected values</p>
 */
public final class CorrectedTradeMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = '\u0010';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 42;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Corrected Trade Message";

    /**
     * The timestamp when the event occurred, nanoseconds since the unix epoch
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * An instrument code uniquely identifying the security from the Instrument Directory
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * A trading session unique match number of the trade, assigned by the Trade or Order Executed message
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * The original quantity of the trade being broken or corrected
     */
    private final OriginalQuantityField originalQuantity = new OriginalQuantityField();

    /**
     * The original price of the trade being broken or corrected, a signed mantissa scaled by a constant exponent of -6
     */
    private final OriginalPriceField originalPrice = new OriginalPriceField();

    /**
     * The corrected quantity of the trade
     */
    private final CorrectedQuantityField correctedQuantity = new CorrectedQuantityField();

    /**
     * The new price of the trade, a signed mantissa scaled by a constant exponent of -6
     */
    private final CorrectedPriceField correctedPrice = new CorrectedPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, securityId, tradeId, originalQuantity, originalPrice, correctedQuantity, correctedPrice);

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
     * A trading session unique match number of the trade, assigned by the Trade or Order Executed message
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * The original quantity of the trade being broken or corrected
     *
     * @return the OriginalQuantity field
     */
    public OriginalQuantityField originalQuantity() {
        return originalQuantity;
    }

    /**
     * The original price of the trade being broken or corrected, a signed mantissa scaled by a constant exponent of -6
     *
     * @return the OriginalPrice field
     */
    public OriginalPriceField originalPrice() {
        return originalPrice;
    }

    /**
     * The corrected quantity of the trade
     *
     * @return the CorrectedQuantity field
     */
    public CorrectedQuantityField correctedQuantity() {
        return correctedQuantity;
    }

    /**
     * The new price of the trade, a signed mantissa scaled by a constant exponent of -6
     *
     * @return the CorrectedPrice field
     */
    public CorrectedPriceField correctedPrice() {
        return correctedPrice;
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
        if (!originalQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalQuantityField.BYTE_LENGTH;
        if (!originalPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalPriceField.BYTE_LENGTH;
        if (!correctedQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedQuantityField.BYTE_LENGTH;
        return correctedPrice.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = originalQuantity.encode(data, cursor);
        cursor = originalPrice.encode(data, cursor);
        cursor = correctedQuantity.encode(data, cursor);
        cursor = correctedPrice.encode(data, cursor);
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
            case "OriginalQuantity" -> Optional.of(originalQuantity);
            case "OriginalPrice" -> Optional.of(originalPrice);
            case "CorrectedQuantity" -> Optional.of(correctedQuantity);
            case "CorrectedPrice" -> Optional.of(correctedPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CorrectedTradeMessage message)) {
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
        if (!(other instanceof CorrectedTradeMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
