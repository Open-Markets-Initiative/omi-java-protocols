package omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.DateField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.DisparateRatioField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.DisparateRatioSignField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.EndKeywordField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.IsinField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.fields.SeqNumberField;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Field;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Message;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.PrintOptions;

/**
 * Represents the EtnDisparateRatioMessage message from the Koscom protocol.
 *
 * <p>ETN signed disparate ratio per ETN.</p>
 */
public final class EtnDisparateRatioMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 95;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Etn Disparate Ratio Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 38, 56 };

    /**
     * Standard Code(ISIN) ISIN ← ETN Symbol Code.
     */
    private final IsinField isin = new IsinField();

    /**
     * 1~99999999 Transmission Sequence Number to check number of orders.
     */
    private final SeqNumberField seqNumber = new SeqNumberField();

    /**
     * YYYMMDD:Last business day.
     */
    private final DateField date = new DateField();

    /**
     * SPACE:0, '+':&gt;0, '-':&lt;0.
     */
    private final DisparateRatioSignField disparateRatioSign = new DisparateRatioSignField();

    /**
     * 9(7)V9(2), Unit:%.
     */
    private final DisparateRatioField disparateRatio = new DisparateRatioField();

    /**
     * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
     */
    private final EndKeywordField endKeyword = new EndKeywordField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(isin, seqNumber, date, disparateRatioSign, disparateRatio, endKeyword);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Standard Code(ISIN) ISIN ← ETN Symbol Code.
     *
     * @return the Isin field
     */
    public IsinField isin() {
        return isin;
    }

    /**
     * 1~99999999 Transmission Sequence Number to check number of orders.
     *
     * @return the SeqNumber field
     */
    public SeqNumberField seqNumber() {
        return seqNumber;
    }

    /**
     * YYYMMDD:Last business day.
     *
     * @return the Date field
     */
    public DateField date() {
        return date;
    }

    /**
     * SPACE:0, '+':&gt;0, '-':&lt;0.
     *
     * @return the DisparateRatioSign field
     */
    public DisparateRatioSignField disparateRatioSign() {
        return disparateRatioSign;
    }

    /**
     * 9(7)V9(2), Unit:%.
     *
     * @return the DisparateRatio field
     */
    public DisparateRatioField disparateRatio() {
        return disparateRatio;
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
        if (!isin.parse(data, cursor)) {
            return false;
        }
        cursor += IsinField.BYTE_LENGTH;
        if (!seqNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SeqNumberField.BYTE_LENGTH;
        if (!date.parse(data, cursor)) {
            return false;
        }
        cursor += DateField.BYTE_LENGTH;
        if (!disparateRatioSign.parse(data, cursor)) {
            return false;
        }
        cursor += DisparateRatioSignField.BYTE_LENGTH;
        if (!disparateRatio.parse(data, cursor)) {
            return false;
        }
        cursor += DisparateRatioField.BYTE_LENGTH;
        cursor += 56; // padding
        return endKeyword.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = isin.encode(data, cursor);
        cursor = seqNumber.encode(data, cursor);
        cursor = date.encode(data, cursor);
        cursor = disparateRatioSign.encode(data, cursor);
        cursor = disparateRatio.encode(data, cursor);
        if (buffer != null && buffer.length >= 94) {
            System.arraycopy(buffer, 38, data, cursor, 56); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 56, (byte) 0); // padding
        }
        cursor += 56;
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
            case "Isin" -> Optional.of(isin);
            case "SeqNumber" -> Optional.of(seqNumber);
            case "Date" -> Optional.of(date);
            case "DisparateRatioSign" -> Optional.of(disparateRatioSign);
            case "DisparateRatio" -> Optional.of(disparateRatio);
            case "EndKeyword" -> Optional.of(endKeyword);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof EtnDisparateRatioMessage message)) {
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
        if (!(other instanceof EtnDisparateRatioMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
