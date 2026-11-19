package omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.BasisPriceAfterActionField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.BasisPriceBeforeActionField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.ChangeDateField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.ChangeTimeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.DataTypeField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EndKeywordField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.IsinNullableField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.LowerLimitPriceAfterActionField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.LowerLimitPriceBeforeActionField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.UpperLimitPriceAfterActionField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.UpperLimitPriceBeforeActionField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Field;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Message;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.PrintOptions;

/**
 * Represents the KOtcMarketActionMessage message from the Koscom protocol.
 *
 * <p>K-OTC Market Action. Basis price and upper/lower limit price changes.</p>
 */
public final class KOtcMarketActionMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 95;

    /**
     * This message's declared name.
     */
    public static final String NAME = "K Otc Market Action Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 84, 10 };

    /**
     * Standard Code(ISIN) ISIN ← Issue code (in case that data type is not 01, then "0").
     */
    private final IsinNullableField isinNullable = new IsinNullableField();

    /**
     * 01: change of basis price and upper/lower limit price 02: temporary halt, 03: resumption after temporary halt.
     */
    private final DataTypeField dataType = new DataTypeField();

    /**
     * YYYYMMDD(in case that data type is not 01, then "0").
     */
    private final ChangeDateField changeDate = new ChangeDateField();

    /**
     * HHMMSSMM(in case that data type is not 01, then "0").
     */
    private final ChangeTimeField changeTime = new ChangeTimeField();

    /**
     * Unit: KRW (in case that data type is not 01, then "0").
     */
    private final BasisPriceBeforeActionField basisPriceBeforeAction = new BasisPriceBeforeActionField();

    /**
     * Unit: KRW (in case that data type is not 01, then "0").
     */
    private final UpperLimitPriceBeforeActionField upperLimitPriceBeforeAction = new UpperLimitPriceBeforeActionField();

    /**
     * Unit: KRW (in case that data type is not 01, then "0").
     */
    private final LowerLimitPriceBeforeActionField lowerLimitPriceBeforeAction = new LowerLimitPriceBeforeActionField();

    /**
     * Unit: KRW (in case that data type is not 01, then "0").
     */
    private final BasisPriceAfterActionField basisPriceAfterAction = new BasisPriceAfterActionField();

    /**
     * Unit: KRW (in case that data type is not 01, then "0").
     */
    private final UpperLimitPriceAfterActionField upperLimitPriceAfterAction = new UpperLimitPriceAfterActionField();

    /**
     * Unit: KRW (in case that data type is not 01, then "0").
     */
    private final LowerLimitPriceAfterActionField lowerLimitPriceAfterAction = new LowerLimitPriceAfterActionField();

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     */
    private final EndKeywordField endKeyword = new EndKeywordField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(isinNullable, dataType, changeDate, changeTime, basisPriceBeforeAction, upperLimitPriceBeforeAction, lowerLimitPriceBeforeAction, basisPriceAfterAction, upperLimitPriceAfterAction, lowerLimitPriceAfterAction, endKeyword);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Standard Code(ISIN) ISIN ← Issue code (in case that data type is not 01, then "0").
     *
     * @return the IsinNullable field
     */
    public IsinNullableField isinNullable() {
        return isinNullable;
    }

    /**
     * 01: change of basis price and upper/lower limit price 02: temporary halt, 03: resumption after temporary halt.
     *
     * @return the DataType field
     */
    public DataTypeField dataType() {
        return dataType;
    }

    /**
     * YYYYMMDD(in case that data type is not 01, then "0").
     *
     * @return the ChangeDate field
     */
    public ChangeDateField changeDate() {
        return changeDate;
    }

    /**
     * HHMMSSMM(in case that data type is not 01, then "0").
     *
     * @return the ChangeTime field
     */
    public ChangeTimeField changeTime() {
        return changeTime;
    }

    /**
     * Unit: KRW (in case that data type is not 01, then "0").
     *
     * @return the BasisPriceBeforeAction field
     */
    public BasisPriceBeforeActionField basisPriceBeforeAction() {
        return basisPriceBeforeAction;
    }

    /**
     * Unit: KRW (in case that data type is not 01, then "0").
     *
     * @return the UpperLimitPriceBeforeAction field
     */
    public UpperLimitPriceBeforeActionField upperLimitPriceBeforeAction() {
        return upperLimitPriceBeforeAction;
    }

    /**
     * Unit: KRW (in case that data type is not 01, then "0").
     *
     * @return the LowerLimitPriceBeforeAction field
     */
    public LowerLimitPriceBeforeActionField lowerLimitPriceBeforeAction() {
        return lowerLimitPriceBeforeAction;
    }

    /**
     * Unit: KRW (in case that data type is not 01, then "0").
     *
     * @return the BasisPriceAfterAction field
     */
    public BasisPriceAfterActionField basisPriceAfterAction() {
        return basisPriceAfterAction;
    }

    /**
     * Unit: KRW (in case that data type is not 01, then "0").
     *
     * @return the UpperLimitPriceAfterAction field
     */
    public UpperLimitPriceAfterActionField upperLimitPriceAfterAction() {
        return upperLimitPriceAfterAction;
    }

    /**
     * Unit: KRW (in case that data type is not 01, then "0").
     *
     * @return the LowerLimitPriceAfterAction field
     */
    public LowerLimitPriceAfterActionField lowerLimitPriceAfterAction() {
        return lowerLimitPriceAfterAction;
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
        if (!isinNullable.parse(data, cursor)) {
            return false;
        }
        cursor += IsinNullableField.BYTE_LENGTH;
        if (!dataType.parse(data, cursor)) {
            return false;
        }
        cursor += DataTypeField.BYTE_LENGTH;
        if (!changeDate.parse(data, cursor)) {
            return false;
        }
        cursor += ChangeDateField.BYTE_LENGTH;
        if (!changeTime.parse(data, cursor)) {
            return false;
        }
        cursor += ChangeTimeField.BYTE_LENGTH;
        if (!basisPriceBeforeAction.parse(data, cursor)) {
            return false;
        }
        cursor += BasisPriceBeforeActionField.BYTE_LENGTH;
        if (!upperLimitPriceBeforeAction.parse(data, cursor)) {
            return false;
        }
        cursor += UpperLimitPriceBeforeActionField.BYTE_LENGTH;
        if (!lowerLimitPriceBeforeAction.parse(data, cursor)) {
            return false;
        }
        cursor += LowerLimitPriceBeforeActionField.BYTE_LENGTH;
        if (!basisPriceAfterAction.parse(data, cursor)) {
            return false;
        }
        cursor += BasisPriceAfterActionField.BYTE_LENGTH;
        if (!upperLimitPriceAfterAction.parse(data, cursor)) {
            return false;
        }
        cursor += UpperLimitPriceAfterActionField.BYTE_LENGTH;
        if (!lowerLimitPriceAfterAction.parse(data, cursor)) {
            return false;
        }
        cursor += LowerLimitPriceAfterActionField.BYTE_LENGTH;
        cursor += 10; // padding
        return endKeyword.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = isinNullable.encode(data, cursor);
        cursor = dataType.encode(data, cursor);
        cursor = changeDate.encode(data, cursor);
        cursor = changeTime.encode(data, cursor);
        cursor = basisPriceBeforeAction.encode(data, cursor);
        cursor = upperLimitPriceBeforeAction.encode(data, cursor);
        cursor = lowerLimitPriceBeforeAction.encode(data, cursor);
        cursor = basisPriceAfterAction.encode(data, cursor);
        cursor = upperLimitPriceAfterAction.encode(data, cursor);
        cursor = lowerLimitPriceAfterAction.encode(data, cursor);
        if (buffer != null && buffer.length >= 94) {
            System.arraycopy(buffer, 84, data, cursor, 10); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 10, (byte) 0); // padding
        }
        cursor += 10;
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
            case "IsinNullable" -> Optional.of(isinNullable);
            case "DataType" -> Optional.of(dataType);
            case "ChangeDate" -> Optional.of(changeDate);
            case "ChangeTime" -> Optional.of(changeTime);
            case "BasisPriceBeforeAction" -> Optional.of(basisPriceBeforeAction);
            case "UpperLimitPriceBeforeAction" -> Optional.of(upperLimitPriceBeforeAction);
            case "LowerLimitPriceBeforeAction" -> Optional.of(lowerLimitPriceBeforeAction);
            case "BasisPriceAfterAction" -> Optional.of(basisPriceAfterAction);
            case "UpperLimitPriceAfterAction" -> Optional.of(upperLimitPriceAfterAction);
            case "LowerLimitPriceAfterAction" -> Optional.of(lowerLimitPriceAfterAction);
            case "EndKeyword" -> Optional.of(endKeyword);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof KOtcMarketActionMessage message)) {
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
        if (!(other instanceof KOtcMarketActionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
