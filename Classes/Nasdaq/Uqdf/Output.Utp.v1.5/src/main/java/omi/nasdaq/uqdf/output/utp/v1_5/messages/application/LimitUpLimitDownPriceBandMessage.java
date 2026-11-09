package omi.nasdaq.uqdf.output.utp.v1_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.LimitDownPriceField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.LimitUpPriceField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.LuldPriceBandIndicatorField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.LuldTimestampField;
import omi.nasdaq.uqdf.output.utp.v1_5.fields.SymbolLongField;
import omi.nasdaq.uqdf.output.utp.v1_5.structs.MessageInfo;
import omi.nasdaq.uqdf.output.utp.v1_5.types.Field;
import omi.nasdaq.uqdf.output.utp.v1_5.types.Message;
import omi.nasdaq.uqdf.output.utp.v1_5.types.PrintOptions;

/**
 * Represents the LimitUpLimitDownPriceBandMessage message from the Output protocol.
 *
 * <p>Designed to prevent trades in individual NMS Stocks from occurring outside of specified Upper and Lower Limit Price Bands</p>
 */
public final class LimitUpLimitDownPriceBandMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'P';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 62;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Limit Up Limit Down Price Band Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Security Identifier
     */
    private final SymbolLongField symbolLong = new SymbolLongField();

    /**
     * LULD Price Band Indicator
     */
    private final LuldPriceBandIndicatorField luldPriceBandIndicator = new LuldPriceBandIndicatorField();

    /**
     * LULD Price Band Effective Time
     */
    private final LuldTimestampField luldTimestamp = new LuldTimestampField();

    /**
     * Limit Down Price
     */
    private final LimitDownPriceField limitDownPrice = new LimitDownPriceField();

    /**
     * Limit Up Price
     */
    private final LimitUpPriceField limitUpPrice = new LimitUpPriceField();

    /**
     * Message Info
     */
    private final MessageInfo messageInfo = new MessageInfo();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(messageInfo.fields(), List.<Field>of(symbolLong), List.<Field>of(luldPriceBandIndicator), List.<Field>of(luldTimestamp), List.<Field>of(limitDownPrice), List.<Field>of(limitUpPrice)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Security Identifier
     *
     * @return the SymbolLong field
     */
    public SymbolLongField symbolLong() {
        return symbolLong;
    }

    /**
     * LULD Price Band Indicator
     *
     * @return the LuldPriceBandIndicator field
     */
    public LuldPriceBandIndicatorField luldPriceBandIndicator() {
        return luldPriceBandIndicator;
    }

    /**
     * LULD Price Band Effective Time
     *
     * @return the LuldTimestamp field
     */
    public LuldTimestampField luldTimestamp() {
        return luldTimestamp;
    }

    /**
     * Limit Down Price
     *
     * @return the LimitDownPrice field
     */
    public LimitDownPriceField limitDownPrice() {
        return limitDownPrice;
    }

    /**
     * Limit Up Price
     *
     * @return the LimitUpPrice field
     */
    public LimitUpPriceField limitUpPrice() {
        return limitUpPrice;
    }

    /**
     * Message Info
     *
     * @return the MessageInfo record
     */
    public MessageInfo messageInfo() {
        return messageInfo;
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
        return Optional.ofNullable(messageInfo.sipTimestamp().value());
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
        if (!messageInfo.parseFrom(data, cursor, end - 36)) {
            return false;
        }
        cursor += messageInfo.byteLength();
        if (!symbolLong.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolLongField.BYTE_LENGTH;
        if (!luldPriceBandIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += LuldPriceBandIndicatorField.BYTE_LENGTH;
        if (!luldTimestamp.parse(data, cursor)) {
            return false;
        }
        cursor += LuldTimestampField.BYTE_LENGTH;
        if (!limitDownPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LimitDownPriceField.BYTE_LENGTH;
        if (!limitUpPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LimitUpPriceField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = messageInfo.encode(data, cursor);
        cursor = symbolLong.encode(data, cursor);
        cursor = luldPriceBandIndicator.encode(data, cursor);
        cursor = luldTimestamp.encode(data, cursor);
        cursor = limitDownPrice.encode(data, cursor);
        cursor = limitUpPrice.encode(data, cursor);
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
        messageInfo.clear();
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
            case "SymbolLong" -> Optional.of(symbolLong);
            case "LuldPriceBandIndicator" -> Optional.of(luldPriceBandIndicator);
            case "LuldTimestamp" -> Optional.of(luldTimestamp);
            case "LimitDownPrice" -> Optional.of(limitDownPrice);
            case "LimitUpPrice" -> Optional.of(limitUpPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LimitUpLimitDownPriceBandMessage message)) {
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
        if (!(other instanceof LimitUpLimitDownPriceBandMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
