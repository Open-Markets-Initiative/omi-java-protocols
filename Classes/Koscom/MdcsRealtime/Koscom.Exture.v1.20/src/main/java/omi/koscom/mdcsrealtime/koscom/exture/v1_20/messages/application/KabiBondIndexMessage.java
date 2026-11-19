package omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.AverageConvexityField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.AverageDurationField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.AverageForwardYtmNullableField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.AverageYtmField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.CallReInvestmentIndexField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.CleanPriceIndexField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EndKeywordField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.FuturesBasisPriceNullableField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.IndexIdField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.MarketPriceIndexField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.StandardDateField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.StandardTimeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.TotalProfitIndexField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.ZeroReInvestmentIndexField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Field;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Message;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.PrintOptions;

/**
 * Represents the KabiBondIndexMessage message from the Koscom protocol.
 *
 * <p>KABI Bond Index real-time message. Same field layout as the Mkf Bond Index Message; KABI uses standard 100 rather than 10,000 for the various indices.</p>
 */
public final class KabiBondIndexMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 109;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Kabi Bond Index Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 4, 107, 1 };

    /**
     * MKF Bond Index identifier. Refer to the Code Table sheet.
     */
    private final IndexIdField indexId = new IndexIdField();

    /**
     * Standard date for the index calculation in YYYYMMDD format.
     */
    private final StandardDateField standardDate = new StandardDateField();

    /**
     * Standard time in HHMMSS. Range 09:00:00 to ~15:30. Cycle: 1 min.
     */
    private final StandardTimeField standardTime = new StandardTimeField();

    /**
     * Total profit index (10 ASCII digits with 4 implied decimal places). Standard 10,000.
     */
    private final TotalProfitIndexField totalProfitIndex = new TotalProfitIndexField();

    /**
     * Clean price index (10 ASCII digits with 4 implied decimal places). Standard 10,000.
     */
    private final CleanPriceIndexField cleanPriceIndex = new CleanPriceIndexField();

    /**
     * Market price index (10 ASCII digits with 4 implied decimal places). Standard 10,000.
     */
    private final MarketPriceIndexField marketPriceIndex = new MarketPriceIndexField();

    /**
     * Call re-investment index (10 ASCII digits with 4 implied decimal places).
     */
    private final CallReInvestmentIndexField callReInvestmentIndex = new CallReInvestmentIndexField();

    /**
     * Zero re-investment index (10 ASCII digits with 4 implied decimal places).
     */
    private final ZeroReInvestmentIndexField zeroReInvestmentIndex = new ZeroReInvestmentIndexField();

    /**
     * Futures basis price. Not calculated; set to '0'.
     */
    private final FuturesBasisPriceNullableField futuresBasisPriceNullable = new FuturesBasisPriceNullableField();

    /**
     * Average duration.
     */
    private final AverageDurationField averageDuration = new AverageDurationField();

    /**
     * Average convexity (6 ASCII digits with 3 implied decimal places).
     */
    private final AverageConvexityField averageConvexity = new AverageConvexityField();

    /**
     * Average yield to maturity (6 ASCII digits with 3 implied decimal places). Unit: percent.
     */
    private final AverageYtmField averageYtm = new AverageYtmField();

    /**
     * Average forward YTM. Unit: percent. Not calculated; set to '0'.
     */
    private final AverageForwardYtmNullableField averageForwardYtmNullable = new AverageForwardYtmNullableField();

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     */
    private final EndKeywordField endKeyword = new EndKeywordField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(indexId, standardDate, standardTime, totalProfitIndex, cleanPriceIndex, marketPriceIndex, callReInvestmentIndex, zeroReInvestmentIndex, futuresBasisPriceNullable, averageDuration, averageConvexity, averageYtm, averageForwardYtmNullable, endKeyword);

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
     * Standard date for the index calculation in YYYYMMDD format.
     *
     * @return the StandardDate field
     */
    public StandardDateField standardDate() {
        return standardDate;
    }

    /**
     * Standard time in HHMMSS. Range 09:00:00 to ~15:30. Cycle: 1 min.
     *
     * @return the StandardTime field
     */
    public StandardTimeField standardTime() {
        return standardTime;
    }

    /**
     * Total profit index (10 ASCII digits with 4 implied decimal places). Standard 10,000.
     *
     * @return the TotalProfitIndex field
     */
    public TotalProfitIndexField totalProfitIndex() {
        return totalProfitIndex;
    }

    /**
     * Clean price index (10 ASCII digits with 4 implied decimal places). Standard 10,000.
     *
     * @return the CleanPriceIndex field
     */
    public CleanPriceIndexField cleanPriceIndex() {
        return cleanPriceIndex;
    }

    /**
     * Market price index (10 ASCII digits with 4 implied decimal places). Standard 10,000.
     *
     * @return the MarketPriceIndex field
     */
    public MarketPriceIndexField marketPriceIndex() {
        return marketPriceIndex;
    }

    /**
     * Call re-investment index (10 ASCII digits with 4 implied decimal places).
     *
     * @return the CallReInvestmentIndex field
     */
    public CallReInvestmentIndexField callReInvestmentIndex() {
        return callReInvestmentIndex;
    }

    /**
     * Zero re-investment index (10 ASCII digits with 4 implied decimal places).
     *
     * @return the ZeroReInvestmentIndex field
     */
    public ZeroReInvestmentIndexField zeroReInvestmentIndex() {
        return zeroReInvestmentIndex;
    }

    /**
     * Futures basis price. Not calculated; set to '0'.
     *
     * @return the FuturesBasisPriceNullable field
     */
    public FuturesBasisPriceNullableField futuresBasisPriceNullable() {
        return futuresBasisPriceNullable;
    }

    /**
     * Average duration.
     *
     * @return the AverageDuration field
     */
    public AverageDurationField averageDuration() {
        return averageDuration;
    }

    /**
     * Average convexity (6 ASCII digits with 3 implied decimal places).
     *
     * @return the AverageConvexity field
     */
    public AverageConvexityField averageConvexity() {
        return averageConvexity;
    }

    /**
     * Average yield to maturity (6 ASCII digits with 3 implied decimal places). Unit: percent.
     *
     * @return the AverageYtm field
     */
    public AverageYtmField averageYtm() {
        return averageYtm;
    }

    /**
     * Average forward YTM. Unit: percent. Not calculated; set to '0'.
     *
     * @return the AverageForwardYtmNullable field
     */
    public AverageForwardYtmNullableField averageForwardYtmNullable() {
        return averageForwardYtmNullable;
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
        cursor += 4; // padding
        if (!indexId.parse(data, cursor)) {
            return false;
        }
        cursor += IndexIdField.BYTE_LENGTH;
        if (!standardDate.parse(data, cursor)) {
            return false;
        }
        cursor += StandardDateField.BYTE_LENGTH;
        if (!standardTime.parse(data, cursor)) {
            return false;
        }
        cursor += StandardTimeField.BYTE_LENGTH;
        if (!totalProfitIndex.parse(data, cursor)) {
            return false;
        }
        cursor += TotalProfitIndexField.BYTE_LENGTH;
        if (!cleanPriceIndex.parse(data, cursor)) {
            return false;
        }
        cursor += CleanPriceIndexField.BYTE_LENGTH;
        if (!marketPriceIndex.parse(data, cursor)) {
            return false;
        }
        cursor += MarketPriceIndexField.BYTE_LENGTH;
        if (!callReInvestmentIndex.parse(data, cursor)) {
            return false;
        }
        cursor += CallReInvestmentIndexField.BYTE_LENGTH;
        if (!zeroReInvestmentIndex.parse(data, cursor)) {
            return false;
        }
        cursor += ZeroReInvestmentIndexField.BYTE_LENGTH;
        if (!futuresBasisPriceNullable.parse(data, cursor)) {
            return false;
        }
        cursor += FuturesBasisPriceNullableField.BYTE_LENGTH;
        if (!averageDuration.parse(data, cursor)) {
            return false;
        }
        cursor += AverageDurationField.BYTE_LENGTH;
        if (!averageConvexity.parse(data, cursor)) {
            return false;
        }
        cursor += AverageConvexityField.BYTE_LENGTH;
        if (!averageYtm.parse(data, cursor)) {
            return false;
        }
        cursor += AverageYtmField.BYTE_LENGTH;
        if (!averageForwardYtmNullable.parse(data, cursor)) {
            return false;
        }
        cursor += AverageForwardYtmNullableField.BYTE_LENGTH;
        cursor += 1; // padding
        return endKeyword.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 4) {
            System.arraycopy(buffer, 0, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = indexId.encode(data, cursor);
        cursor = standardDate.encode(data, cursor);
        cursor = standardTime.encode(data, cursor);
        cursor = totalProfitIndex.encode(data, cursor);
        cursor = cleanPriceIndex.encode(data, cursor);
        cursor = marketPriceIndex.encode(data, cursor);
        cursor = callReInvestmentIndex.encode(data, cursor);
        cursor = zeroReInvestmentIndex.encode(data, cursor);
        cursor = futuresBasisPriceNullable.encode(data, cursor);
        cursor = averageDuration.encode(data, cursor);
        cursor = averageConvexity.encode(data, cursor);
        cursor = averageYtm.encode(data, cursor);
        cursor = averageForwardYtmNullable.encode(data, cursor);
        if (buffer != null && buffer.length >= 108) {
            System.arraycopy(buffer, 107, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
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
            case "StandardDate" -> Optional.of(standardDate);
            case "StandardTime" -> Optional.of(standardTime);
            case "TotalProfitIndex" -> Optional.of(totalProfitIndex);
            case "CleanPriceIndex" -> Optional.of(cleanPriceIndex);
            case "MarketPriceIndex" -> Optional.of(marketPriceIndex);
            case "CallReInvestmentIndex" -> Optional.of(callReInvestmentIndex);
            case "ZeroReInvestmentIndex" -> Optional.of(zeroReInvestmentIndex);
            case "FuturesBasisPriceNullable" -> Optional.of(futuresBasisPriceNullable);
            case "AverageDuration" -> Optional.of(averageDuration);
            case "AverageConvexity" -> Optional.of(averageConvexity);
            case "AverageYtm" -> Optional.of(averageYtm);
            case "AverageForwardYtmNullable" -> Optional.of(averageForwardYtmNullable);
            case "EndKeyword" -> Optional.of(endKeyword);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof KabiBondIndexMessage message)) {
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
        if (!(other instanceof KabiBondIndexMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
