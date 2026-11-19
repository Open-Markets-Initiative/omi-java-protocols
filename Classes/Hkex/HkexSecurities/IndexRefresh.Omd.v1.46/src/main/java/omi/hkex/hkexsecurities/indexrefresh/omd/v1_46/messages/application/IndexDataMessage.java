package omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.fields.ClosingValueField;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.fields.EasValueField;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.fields.ExceptionField;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.fields.HighValueField;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.fields.IndexCodeField;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.fields.IndexStatusField;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.fields.IndexTimeField;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.fields.IndexTurnoverField;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.fields.IndexValueField;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.fields.IndexVolumeField;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.fields.LowValueField;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.fields.NetChgPrevDayField;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.fields.NetChgPrevDayPctField;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.fields.OpeningValueField;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.fields.PreviousSesCloseField;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.types.Field;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.types.Message;
import omi.hkex.hkexsecurities.indexrefresh.omd.v1_46.types.PrintOptions;

/**
 * Represents the IndexDataMessage message from the IndexRefresh protocol.
 *
 * <p>The Index Data message contains all the real-time data for a given index. Fields may be populated with null values to indicate when an update is not provided.</p>
 */
public final class IndexDataMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 108;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Index Data Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 105, 3 };

    /**
     * Upstream source's index code or market information identifier.
     */
    private final IndexCodeField indexCode = new IndexCodeField();

    /**
     * Index status. Can be blank if not defined by third party index compilers.
     */
    private final IndexStatusField indexStatus = new IndexStatusField();

    /**
     * Publisher timestamp. Nanoseconds since Unix epoch UTC, precision to the nearest second.
     */
    private final IndexTimeField indexTime = new IndexTimeField();

    /**
     * Current value of the index. 4 implied decimal places.
     */
    private final IndexValueField indexValue = new IndexValueField();

    /**
     * Net change of IndexValue from the previous close, as provided in index source. 4 implied decimal places.
     */
    private final NetChgPrevDayField netChgPrevDay = new NetChgPrevDayField();

    /**
     * Highest value for an index. 4 implied decimal places.
     */
    private final HighValueField highValue = new HighValueField();

    /**
     * Lowest value for an index. 4 implied decimal places.
     */
    private final LowValueField lowValue = new LowValueField();

    /**
     * Estimated Average Settlement Value. 2 implied decimal places.
     */
    private final EasValueField easValue = new EasValueField();

    /**
     * Current turnover of underlying constituents. 4 implied decimal places.
     */
    private final IndexTurnoverField indexTurnover = new IndexTurnoverField();

    /**
     * First value for an index. 4 implied decimal places.
     */
    private final OpeningValueField openingValue = new OpeningValueField();

    /**
     * Last value for an index. 4 implied decimal places.
     */
    private final ClosingValueField closingValue = new ClosingValueField();

    /**
     * Previous session closing value (previous day for CSI, CES, S&amp;P; previous session for HSI and TR). 4 implied decimal places.
     */
    private final PreviousSesCloseField previousSesClose = new PreviousSesCloseField();

    /**
     * Index volume of underlying constituents. Only applicable for CSI and CES.
     */
    private final IndexVolumeField indexVolume = new IndexVolumeField();

    /**
     * Percentage change of IndexValue from the previous close. 4 implied decimal places.
     */
    private final NetChgPrevDayPctField netChgPrevDayPct = new NetChgPrevDayPctField();

    /**
     * Exception indicator.
     */
    private final ExceptionField exception = new ExceptionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(indexCode, indexStatus, indexTime, indexValue, netChgPrevDay, highValue, lowValue, easValue, indexTurnover, openingValue, closingValue, previousSesClose, indexVolume, netChgPrevDayPct, exception);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Upstream source's index code or market information identifier.
     *
     * @return the IndexCode field
     */
    public IndexCodeField indexCode() {
        return indexCode;
    }

    /**
     * Index status. Can be blank if not defined by third party index compilers.
     *
     * @return the IndexStatus field
     */
    public IndexStatusField indexStatus() {
        return indexStatus;
    }

    /**
     * Publisher timestamp. Nanoseconds since Unix epoch UTC, precision to the nearest second.
     *
     * @return the IndexTime field
     */
    public IndexTimeField indexTime() {
        return indexTime;
    }

    /**
     * Current value of the index. 4 implied decimal places.
     *
     * @return the IndexValue field
     */
    public IndexValueField indexValue() {
        return indexValue;
    }

    /**
     * Net change of IndexValue from the previous close, as provided in index source. 4 implied decimal places.
     *
     * @return the NetChgPrevDay field
     */
    public NetChgPrevDayField netChgPrevDay() {
        return netChgPrevDay;
    }

    /**
     * Highest value for an index. 4 implied decimal places.
     *
     * @return the HighValue field
     */
    public HighValueField highValue() {
        return highValue;
    }

    /**
     * Lowest value for an index. 4 implied decimal places.
     *
     * @return the LowValue field
     */
    public LowValueField lowValue() {
        return lowValue;
    }

    /**
     * Estimated Average Settlement Value. 2 implied decimal places.
     *
     * @return the EasValue field
     */
    public EasValueField easValue() {
        return easValue;
    }

    /**
     * Current turnover of underlying constituents. 4 implied decimal places.
     *
     * @return the IndexTurnover field
     */
    public IndexTurnoverField indexTurnover() {
        return indexTurnover;
    }

    /**
     * First value for an index. 4 implied decimal places.
     *
     * @return the OpeningValue field
     */
    public OpeningValueField openingValue() {
        return openingValue;
    }

    /**
     * Last value for an index. 4 implied decimal places.
     *
     * @return the ClosingValue field
     */
    public ClosingValueField closingValue() {
        return closingValue;
    }

    /**
     * Previous session closing value (previous day for CSI, CES, S&amp;P; previous session for HSI and TR). 4 implied decimal places.
     *
     * @return the PreviousSesClose field
     */
    public PreviousSesCloseField previousSesClose() {
        return previousSesClose;
    }

    /**
     * Index volume of underlying constituents. Only applicable for CSI and CES.
     *
     * @return the IndexVolume field
     */
    public IndexVolumeField indexVolume() {
        return indexVolume;
    }

    /**
     * Percentage change of IndexValue from the previous close. 4 implied decimal places.
     *
     * @return the NetChgPrevDayPct field
     */
    public NetChgPrevDayPctField netChgPrevDayPct() {
        return netChgPrevDayPct;
    }

    /**
     * Exception indicator.
     *
     * @return the Exception field
     */
    public ExceptionField exception() {
        return exception;
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
        if (!indexCode.parse(data, cursor)) {
            return false;
        }
        cursor += IndexCodeField.BYTE_LENGTH;
        if (!indexStatus.parse(data, cursor)) {
            return false;
        }
        cursor += IndexStatusField.BYTE_LENGTH;
        if (!indexTime.parse(data, cursor)) {
            return false;
        }
        cursor += IndexTimeField.BYTE_LENGTH;
        if (!indexValue.parse(data, cursor)) {
            return false;
        }
        cursor += IndexValueField.BYTE_LENGTH;
        if (!netChgPrevDay.parse(data, cursor)) {
            return false;
        }
        cursor += NetChgPrevDayField.BYTE_LENGTH;
        if (!highValue.parse(data, cursor)) {
            return false;
        }
        cursor += HighValueField.BYTE_LENGTH;
        if (!lowValue.parse(data, cursor)) {
            return false;
        }
        cursor += LowValueField.BYTE_LENGTH;
        if (!easValue.parse(data, cursor)) {
            return false;
        }
        cursor += EasValueField.BYTE_LENGTH;
        if (!indexTurnover.parse(data, cursor)) {
            return false;
        }
        cursor += IndexTurnoverField.BYTE_LENGTH;
        if (!openingValue.parse(data, cursor)) {
            return false;
        }
        cursor += OpeningValueField.BYTE_LENGTH;
        if (!closingValue.parse(data, cursor)) {
            return false;
        }
        cursor += ClosingValueField.BYTE_LENGTH;
        if (!previousSesClose.parse(data, cursor)) {
            return false;
        }
        cursor += PreviousSesCloseField.BYTE_LENGTH;
        if (!indexVolume.parse(data, cursor)) {
            return false;
        }
        cursor += IndexVolumeField.BYTE_LENGTH;
        if (!netChgPrevDayPct.parse(data, cursor)) {
            return false;
        }
        cursor += NetChgPrevDayPctField.BYTE_LENGTH;
        if (!exception.parse(data, cursor)) {
            return false;
        }
        cursor += ExceptionField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = indexCode.encode(data, cursor);
        cursor = indexStatus.encode(data, cursor);
        cursor = indexTime.encode(data, cursor);
        cursor = indexValue.encode(data, cursor);
        cursor = netChgPrevDay.encode(data, cursor);
        cursor = highValue.encode(data, cursor);
        cursor = lowValue.encode(data, cursor);
        cursor = easValue.encode(data, cursor);
        cursor = indexTurnover.encode(data, cursor);
        cursor = openingValue.encode(data, cursor);
        cursor = closingValue.encode(data, cursor);
        cursor = previousSesClose.encode(data, cursor);
        cursor = indexVolume.encode(data, cursor);
        cursor = netChgPrevDayPct.encode(data, cursor);
        cursor = exception.encode(data, cursor);
        if (buffer != null && buffer.length >= 108) {
            System.arraycopy(buffer, 105, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
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
            case "IndexCode" -> Optional.of(indexCode);
            case "IndexStatus" -> Optional.of(indexStatus);
            case "IndexTime" -> Optional.of(indexTime);
            case "IndexValue" -> Optional.of(indexValue);
            case "NetChgPrevDay" -> Optional.of(netChgPrevDay);
            case "HighValue" -> Optional.of(highValue);
            case "LowValue" -> Optional.of(lowValue);
            case "EasValue" -> Optional.of(easValue);
            case "IndexTurnover" -> Optional.of(indexTurnover);
            case "OpeningValue" -> Optional.of(openingValue);
            case "ClosingValue" -> Optional.of(closingValue);
            case "PreviousSesClose" -> Optional.of(previousSesClose);
            case "IndexVolume" -> Optional.of(indexVolume);
            case "NetChgPrevDayPct" -> Optional.of(netChgPrevDayPct);
            case "Exception" -> Optional.of(exception);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof IndexDataMessage message)) {
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
        if (!(other instanceof IndexDataMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
