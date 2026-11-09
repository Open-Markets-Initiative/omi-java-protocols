package omi.ice.icefutures.mdf.impact.v1_1_24.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.HasPreOpenVolumeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.MarketIdField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.MessageDateTimeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.PreOpenPriceField;
import omi.ice.icefutures.mdf.impact.v1_1_24.fields.PreOpenVolumeField;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.Message;
import omi.ice.icefutures.mdf.impact.v1_1_24.types.PrintOptions;

/**
 * Represents the PreOpenPriceIndicatorMessage message from the Mdf protocol.
 *
 * <p>This message contains the estimate of what the opening price could be, based on the orders in the market or previous settlement price.</p>
 */
public final class PreOpenPriceIndicatorMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'g';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 25;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Pre Open Price Indicator Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Market Id
     */
    private final MarketIdField marketId = new MarketIdField();

    /**
     * DealPriceDenominator for the market should be applied to get the real price.
     */
    private final PreOpenPriceField preOpenPrice = new PreOpenPriceField();

    /**
     * Date time the trade was investigated
     */
    private final MessageDateTimeField messageDateTime = new MessageDateTimeField();

    /**
     * Indicates message contains PreOpenVolume. ‘Y’ or ‘N’
     */
    private final HasPreOpenVolumeField hasPreOpenVolume = new HasPreOpenVolumeField();

    /**
     * Indicative volume that would trade at the preOpenPrice
     */
    private final PreOpenVolumeField preOpenVolume = new PreOpenVolumeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketId, preOpenPrice, messageDateTime, hasPreOpenVolume, preOpenVolume);

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
     * DealPriceDenominator for the market should be applied to get the real price.
     *
     * @return the PreOpenPrice field
     */
    public PreOpenPriceField preOpenPrice() {
        return preOpenPrice;
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
     * Indicates message contains PreOpenVolume. ‘Y’ or ‘N’
     *
     * @return the HasPreOpenVolume field
     */
    public HasPreOpenVolumeField hasPreOpenVolume() {
        return hasPreOpenVolume;
    }

    /**
     * Indicative volume that would trade at the preOpenPrice
     *
     * @return the PreOpenVolume field
     */
    public PreOpenVolumeField preOpenVolume() {
        return preOpenVolume;
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
        if (!marketId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketIdField.BYTE_LENGTH;
        if (!preOpenPrice.parse(data, cursor)) {
            return false;
        }
        cursor += PreOpenPriceField.BYTE_LENGTH;
        if (!messageDateTime.parse(data, cursor)) {
            return false;
        }
        cursor += MessageDateTimeField.BYTE_LENGTH;
        if (!hasPreOpenVolume.parse(data, cursor)) {
            return false;
        }
        cursor += HasPreOpenVolumeField.BYTE_LENGTH;
        if (!preOpenVolume.parse(data, cursor)) {
            return false;
        }
        cursor += PreOpenVolumeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = marketId.encode(data, cursor);
        cursor = preOpenPrice.encode(data, cursor);
        cursor = messageDateTime.encode(data, cursor);
        cursor = hasPreOpenVolume.encode(data, cursor);
        cursor = preOpenVolume.encode(data, cursor);
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
            case "PreOpenPrice" -> Optional.of(preOpenPrice);
            case "MessageDateTime" -> Optional.of(messageDateTime);
            case "HasPreOpenVolume" -> Optional.of(hasPreOpenVolume);
            case "PreOpenVolume" -> Optional.of(preOpenVolume);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PreOpenPriceIndicatorMessage message)) {
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
        if (!(other instanceof PreOpenPriceIndicatorMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
