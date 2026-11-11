package omi.ice.icefutures.mdf.impact.v1_1_33.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.BeginDayField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.BeginMonthField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.BeginYearField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.EndDayField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.EndMonthField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.EndYearField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.OldStripIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.StripIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.StripInfoField;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.StripTypeField;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.Message;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.PrintOptions;

/**
 * Represents the StripInfoMessage message from the Mdf protocol.
 *
 * <p>This message will be sent out if there is strip date change during the trading session. If client does not care about strip date changes, client should ignore these messages.</p>
 */
public final class StripInfoMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'i';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 88;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Strip Info Message";

    /**
     * Not used. Kept here for backward compatibility. Client should use the new 4-byte StripID field.
     */
    private final OldStripIdField oldStripId = new OldStripIdField();

    /**
     * Strip Type
     */
    private final StripTypeField stripType = new StripTypeField();

    /**
     * 4 digit year
     */
    private final BeginYearField beginYear = new BeginYearField();

    /**
     * Month range 1-12
     */
    private final BeginMonthField beginMonth = new BeginMonthField();

    /**
     * Begin Day
     */
    private final BeginDayField beginDay = new BeginDayField();

    /**
     * 4 digit year
     */
    private final EndYearField endYear = new EndYearField();

    /**
     * Month range 1-12
     */
    private final EndMonthField endMonth = new EndMonthField();

    /**
     * End Day
     */
    private final EndDayField endDay = new EndDayField();

    /**
     * Strip Info
     */
    private final StripInfoField stripInfo = new StripInfoField();

    /**
     * StripID
     */
    private final StripIdField stripId = new StripIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(oldStripId, stripType, beginYear, beginMonth, beginDay, endYear, endMonth, endDay, stripInfo, stripId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Not used. Kept here for backward compatibility. Client should use the new 4-byte StripID field.
     *
     * @return the OldStripId field
     */
    public OldStripIdField oldStripId() {
        return oldStripId;
    }

    /**
     * Strip Type
     *
     * @return the StripType field
     */
    public StripTypeField stripType() {
        return stripType;
    }

    /**
     * 4 digit year
     *
     * @return the BeginYear field
     */
    public BeginYearField beginYear() {
        return beginYear;
    }

    /**
     * Month range 1-12
     *
     * @return the BeginMonth field
     */
    public BeginMonthField beginMonth() {
        return beginMonth;
    }

    /**
     * Begin Day
     *
     * @return the BeginDay field
     */
    public BeginDayField beginDay() {
        return beginDay;
    }

    /**
     * 4 digit year
     *
     * @return the EndYear field
     */
    public EndYearField endYear() {
        return endYear;
    }

    /**
     * Month range 1-12
     *
     * @return the EndMonth field
     */
    public EndMonthField endMonth() {
        return endMonth;
    }

    /**
     * End Day
     *
     * @return the EndDay field
     */
    public EndDayField endDay() {
        return endDay;
    }

    /**
     * Strip Info
     *
     * @return the StripInfo field
     */
    public StripInfoField stripInfo() {
        return stripInfo;
    }

    /**
     * StripID
     *
     * @return the StripId field
     */
    public StripIdField stripId() {
        return stripId;
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
        if (!oldStripId.parse(data, cursor)) {
            return false;
        }
        cursor += OldStripIdField.BYTE_LENGTH;
        if (!stripType.parse(data, cursor)) {
            return false;
        }
        cursor += StripTypeField.BYTE_LENGTH;
        if (!beginYear.parse(data, cursor)) {
            return false;
        }
        cursor += BeginYearField.BYTE_LENGTH;
        if (!beginMonth.parse(data, cursor)) {
            return false;
        }
        cursor += BeginMonthField.BYTE_LENGTH;
        if (!beginDay.parse(data, cursor)) {
            return false;
        }
        cursor += BeginDayField.BYTE_LENGTH;
        if (!endYear.parse(data, cursor)) {
            return false;
        }
        cursor += EndYearField.BYTE_LENGTH;
        if (!endMonth.parse(data, cursor)) {
            return false;
        }
        cursor += EndMonthField.BYTE_LENGTH;
        if (!endDay.parse(data, cursor)) {
            return false;
        }
        cursor += EndDayField.BYTE_LENGTH;
        if (!stripInfo.parse(data, cursor)) {
            return false;
        }
        cursor += StripInfoField.BYTE_LENGTH;
        return stripId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = oldStripId.encode(data, cursor);
        cursor = stripType.encode(data, cursor);
        cursor = beginYear.encode(data, cursor);
        cursor = beginMonth.encode(data, cursor);
        cursor = beginDay.encode(data, cursor);
        cursor = endYear.encode(data, cursor);
        cursor = endMonth.encode(data, cursor);
        cursor = endDay.encode(data, cursor);
        cursor = stripInfo.encode(data, cursor);
        cursor = stripId.encode(data, cursor);
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
            case "OldStripId" -> Optional.of(oldStripId);
            case "StripType" -> Optional.of(stripType);
            case "BeginYear" -> Optional.of(beginYear);
            case "BeginMonth" -> Optional.of(beginMonth);
            case "BeginDay" -> Optional.of(beginDay);
            case "EndYear" -> Optional.of(endYear);
            case "EndMonth" -> Optional.of(endMonth);
            case "EndDay" -> Optional.of(endDay);
            case "StripInfo" -> Optional.of(stripInfo);
            case "StripId" -> Optional.of(stripId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof StripInfoMessage message)) {
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
        if (!(other instanceof StripInfoMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
