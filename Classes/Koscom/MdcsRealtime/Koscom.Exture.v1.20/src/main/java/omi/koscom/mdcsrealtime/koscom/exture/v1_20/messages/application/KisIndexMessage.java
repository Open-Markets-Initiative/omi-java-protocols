package omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.ComparisonField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EndKeywordField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.IndexField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.IndexIdField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.IsinField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SignField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TimeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TradingValueField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TradingVolumeLongField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Field;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Message;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.PrintOptions;

/**
 * Represents the KisIndexMessage message from the Koscom protocol.
 *
 * <p>KIS equity index real-time message. Identical field layout to the Mkf Index Message.</p>
 */
public final class KisIndexMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 72;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Kis Index Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 67, 4 };

    /**
     * MKF Bond Index identifier. Refer to the Code Table sheet.
     */
    private final IndexIdField indexId = new IndexIdField();

    /**
     * Standard Code(ISIN) ISIN ← ETN Symbol Code.
     */
    private final IsinField isin = new IsinField();

    /**
     * During market: HHMMSS (Time:min:Sec) 090000 ~ Market Closing: JUNJJJ.
     */
    private final TimeField time = new TimeField();

    /**
     * Current MKF Index value (9 ASCII digits with 2 implied decimal places).
     */
    private final IndexField index = new IndexField();

    /**
     * Sign of the index change against the previous day. '+' ascended, ' ' steadiness, '-' declined.
     */
    private final SignField sign = new SignField();

    /**
     * Magnitude of the index change against the previous day (9 ASCII digits with 2 implied decimal places).
     */
    private final ComparisonField comparison = new ComparisonField();

    /**
     * Accumulated trading volume (12 ASCII digits). Unit: 1,000 shares.
     */
    private final TradingVolumeLongField tradingVolumeLong = new TradingVolumeLongField();

    /**
     * Accumulated trading value (12 ASCII digits). Unit: 1,000,000 KRW.
     */
    private final TradingValueField tradingValue = new TradingValueField();

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     */
    private final EndKeywordField endKeyword = new EndKeywordField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(indexId, isin, time, index, sign, comparison, tradingVolumeLong, tradingValue, endKeyword);

    private byte[] buffer;

    private boolean decoded;

    /**
     * MKF Bond Index identifier. Refer to the Code Table sheet.
     *
     * @return the IndexId field
     */
    public IndexIdField indexId() {
        return indexId;
    }

    /**
     * Standard Code(ISIN) ISIN ← ETN Symbol Code.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * During market: HHMMSS (Time:min:Sec) 090000 ~ Market Closing: JUNJJJ.
     *
     * @return the Time field
     */
    public TimeField time() {
        return time;
    }

    /**
     * Current MKF Index value (9 ASCII digits with 2 implied decimal places).
     *
     * @return the Index field
     */
    public IndexField index() {
        return index;
    }

    /**
     * Sign of the index change against the previous day. '+' ascended, ' ' steadiness, '-' declined.
     *
     * @return the Sign field
     */
    public SignField sign() {
        return sign;
    }

    /**
     * Magnitude of the index change against the previous day (9 ASCII digits with 2 implied decimal places).
     *
     * @return the Comparison field
     */
    public ComparisonField comparison() {
        return comparison;
    }

    /**
     * Accumulated trading volume (12 ASCII digits). Unit: 1,000 shares.
     *
     * @return the TradingVolumeLong field
     */
    public TradingVolumeLongField tradingVolumeLong() {
        return tradingVolumeLong;
    }

    /**
     * Accumulated trading value (12 ASCII digits). Unit: 1,000,000 KRW.
     *
     * @return the TradingValue field
     */
    public TradingValueField tradingValue() {
        return tradingValue;
    }

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     *
     * @return the EndKeyword field
     */
    public EndKeywordField endKeyword() {
        return endKeyword;
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
        if (!indexId.parse(data, cursor)) {
            return false;
        }
        cursor += IndexIdField.BYTE_LENGTH;
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
        if (!time.parse(data, cursor)) {
            return false;
        }
        cursor += TimeField.BYTE_LENGTH;
        if (!index.parse(data, cursor)) {
            return false;
        }
        cursor += IndexField.BYTE_LENGTH;
        if (!sign.parse(data, cursor)) {
            return false;
        }
        cursor += SignField.BYTE_LENGTH;
        if (!comparison.parse(data, cursor)) {
            return false;
        }
        cursor += ComparisonField.BYTE_LENGTH;
        if (!tradingVolumeLong.parse(data, cursor)) {
            return false;
        }
        cursor += TradingVolumeLongField.BYTE_LENGTH;
        if (!tradingValue.parse(data, cursor)) {
            return false;
        }
        cursor += TradingValueField.BYTE_LENGTH;
        cursor += 4; // padding
        return endKeyword.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = indexId.encode(data, cursor);
        cursor = isin.encode(data, cursor);
        cursor = time.encode(data, cursor);
        cursor = index.encode(data, cursor);
        cursor = sign.encode(data, cursor);
        cursor = comparison.encode(data, cursor);
        cursor = tradingVolumeLong.encode(data, cursor);
        cursor = tradingValue.encode(data, cursor);
        if (buffer != null && buffer.length >= 71) {
            System.arraycopy(buffer, 67, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = endKeyword.encode(data, cursor);
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
            case "IndexId" -> Optional.of(indexId);
            case "Isin" -> Optional.of(isin);
            case "Time" -> Optional.of(time);
            case "Index" -> Optional.of(index);
            case "Sign" -> Optional.of(sign);
            case "Comparison" -> Optional.of(comparison);
            case "TradingVolumeLong" -> Optional.of(tradingVolumeLong);
            case "TradingValue" -> Optional.of(tradingValue);
            case "EndKeyword" -> Optional.of(endKeyword);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof KisIndexMessage message)) {
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
        if (!(other instanceof KisIndexMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
