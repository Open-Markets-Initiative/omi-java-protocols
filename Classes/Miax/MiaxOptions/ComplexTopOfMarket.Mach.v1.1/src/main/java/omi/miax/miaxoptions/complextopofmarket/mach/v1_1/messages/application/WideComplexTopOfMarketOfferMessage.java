package omi.miax.miaxoptions.complextopofmarket.mach.v1_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.NanosecondsField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.StrategyIdField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.TopOfMarketQuoteConditionField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.WidePriceField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.fields.WideSizeField;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.types.Field;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.types.Message;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.types.PrintOptions;

/**
 * Represents the WideComplexTopOfMarketOfferMessage message from the ComplexTopOfMarket protocol.
 *
 * <p>This is the message format that will be used to disseminate MIAX Complex Top of Market for strategies with high net price or large aggregate MIAX Best Offer (MBBO) size.</p>
 */
public final class WideComplexTopOfMarketOfferMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'f';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 25;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Wide Complex Top Of Market Offer Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 20, 4 };

    /**
     * Time at which this product is added/updated on MIAX system today.
     */
    private final NanosecondsField nanoseconds = new NanosecondsField();

    /**
     * MIAX Strategy ID is assigned per trading day and is valid only for that day.
     */
    private final StrategyIdField strategyId = new StrategyIdField();

    /**
     * MIAX Best price at the time stated in Timestamp and side specified in Message Type.
     */
    private final WidePriceField widePrice = new WidePriceField();

    /**
     * Aggregate size at MIAX Best Price at the time stated in Timestamp and side specified in Message Type
     */
    private final WideSizeField wideSize = new WideSizeField();

    /**
     * Top of Strategy Market Quote Conditions
     */
    private final TopOfMarketQuoteConditionField topOfMarketQuoteCondition = new TopOfMarketQuoteConditionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(nanoseconds, strategyId, widePrice, wideSize, topOfMarketQuoteCondition);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time at which this product is added/updated on MIAX system today.
     *
     * @return the Nanoseconds field
     */
    public NanosecondsField nanoseconds() {
        return nanoseconds;
    }

    /**
     * MIAX Strategy ID is assigned per trading day and is valid only for that day.
     *
     * @return the StrategyId field
     */
    public StrategyIdField strategyId() {
        return strategyId;
    }

    /**
     * MIAX Best price at the time stated in Timestamp and side specified in Message Type.
     *
     * @return the WidePrice field
     */
    public WidePriceField widePrice() {
        return widePrice;
    }

    /**
     * Aggregate size at MIAX Best Price at the time stated in Timestamp and side specified in Message Type
     *
     * @return the WideSize field
     */
    public WideSizeField wideSize() {
        return wideSize;
    }

    /**
     * Top of Strategy Market Quote Conditions
     *
     * @return the TopOfMarketQuoteCondition field
     */
    public TopOfMarketQuoteConditionField topOfMarketQuoteCondition() {
        return topOfMarketQuoteCondition;
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
        if (!nanoseconds.parse(data, cursor)) {
            return false;
        }
        cursor += NanosecondsField.BYTE_LENGTH;
        if (!strategyId.parse(data, cursor)) {
            return false;
        }
        cursor += StrategyIdField.BYTE_LENGTH;
        if (!widePrice.parse(data, cursor)) {
            return false;
        }
        cursor += WidePriceField.BYTE_LENGTH;
        if (!wideSize.parse(data, cursor)) {
            return false;
        }
        cursor += WideSizeField.BYTE_LENGTH;
        cursor += 4; // padding
        return topOfMarketQuoteCondition.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = nanoseconds.encode(data, cursor);
        cursor = strategyId.encode(data, cursor);
        cursor = widePrice.encode(data, cursor);
        cursor = wideSize.encode(data, cursor);
        if (buffer != null && buffer.length >= 24) {
            System.arraycopy(buffer, 20, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = topOfMarketQuoteCondition.encode(data, cursor);
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
            case "Nanoseconds" -> Optional.of(nanoseconds);
            case "StrategyId" -> Optional.of(strategyId);
            case "WidePrice" -> Optional.of(widePrice);
            case "WideSize" -> Optional.of(wideSize);
            case "TopOfMarketQuoteCondition" -> Optional.of(topOfMarketQuoteCondition);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof WideComplexTopOfMarketOfferMessage message)) {
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
        if (!(other instanceof WideComplexTopOfMarketOfferMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
