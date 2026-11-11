package omi.eurex.t7.eti.fbe.v6_1.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eti.fbe.v6_1.fields.ApplIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.ApplMsgIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.ApplResendFlagField;
import omi.eurex.t7.eti.fbe.v6_1.fields.ApplSubIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.LastFragmentField;
import omi.eurex.t7.eti.fbe.v6_1.fields.NotificationInField;
import omi.eurex.t7.eti.fbe.v6_1.fields.PartitionIdField;
import omi.eurex.t7.eti.fbe.v6_1.fields.SendingTimeField;
import omi.eurex.t7.eti.fbe.v6_1.fields.TrdRegTsTimeOutField;
import omi.eurex.t7.eti.fbe.v6_1.types.Field;
import omi.eurex.t7.eti.fbe.v6_1.types.GroupEntry;
import omi.eurex.t7.eti.fbe.v6_1.types.PrintOptions;

/**
 * The RbcHeaderMeComp record a message holds.
 *
 * <p>Rbc Header Me Comp</p>
 */
public final class RbcHeaderMeComp implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 56;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "RbcHeaderMeComp";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 49, 7 };

    /**
     * Trd Reg Ts Time Out
     */
    private final TrdRegTsTimeOutField trdRegTsTimeOut = new TrdRegTsTimeOutField();

    /**
     * Notification In
     */
    private final NotificationInField notificationIn = new NotificationInField();

    /**
     * Sending Time
     */
    private final SendingTimeField sendingTime = new SendingTimeField();

    /**
     * Appl Sub Id
     */
    private final ApplSubIdField applSubId = new ApplSubIdField();

    /**
     * Partition Id
     */
    private final PartitionIdField partitionId = new PartitionIdField();

    /**
     * Appl Msg Id
     */
    private final ApplMsgIdField applMsgId = new ApplMsgIdField();

    /**
     * Appl Id
     */
    private final ApplIdField applId = new ApplIdField();

    /**
     * Appl Resend Flag
     */
    private final ApplResendFlagField applResendFlag = new ApplResendFlagField();

    /**
     * Last Fragment
     */
    private final LastFragmentField lastFragment = new LastFragmentField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(trdRegTsTimeOut, notificationIn, sendingTime, applSubId, partitionId, applMsgId, applId, applResendFlag, lastFragment);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Trd Reg Ts Time Out
     *
     * @return the TrdRegTsTimeOut field
     */
    public TrdRegTsTimeOutField trdRegTsTimeOut() {
        return trdRegTsTimeOut;
    }

    /**
     * Notification In
     *
     * @return the NotificationIn field
     */
    public NotificationInField notificationIn() {
        return notificationIn;
    }

    /**
     * Sending Time
     *
     * @return the SendingTime field
     */
    public SendingTimeField sendingTime() {
        return sendingTime;
    }

    /**
     * Appl Sub Id
     *
     * @return the ApplSubId field
     */
    public ApplSubIdField applSubId() {
        return applSubId;
    }

    /**
     * Partition Id
     *
     * @return the PartitionId field
     */
    public PartitionIdField partitionId() {
        return partitionId;
    }

    /**
     * Appl Msg Id
     *
     * @return the ApplMsgId field
     */
    public ApplMsgIdField applMsgId() {
        return applMsgId;
    }

    /**
     * Appl Id
     *
     * @return the ApplId field
     */
    public ApplIdField applId() {
        return applId;
    }

    /**
     * Appl Resend Flag
     *
     * @return the ApplResendFlag field
     */
    public ApplResendFlagField applResendFlag() {
        return applResendFlag;
    }

    /**
     * Last Fragment
     *
     * @return the LastFragment field
     */
    public LastFragmentField lastFragment() {
        return lastFragment;
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this entry's declared padding runs, as consecutive offset and length pairs relative to the start of the entry.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a entry assembled from values. Use this to check a received entry's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return PADDING.clone();
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
        if (!trdRegTsTimeOut.parse(data, cursor)) {
            return false;
        }
        cursor += TrdRegTsTimeOutField.BYTE_LENGTH;
        if (!notificationIn.parse(data, cursor)) {
            return false;
        }
        cursor += NotificationInField.BYTE_LENGTH;
        if (!sendingTime.parse(data, cursor)) {
            return false;
        }
        cursor += SendingTimeField.BYTE_LENGTH;
        if (!applSubId.parse(data, cursor)) {
            return false;
        }
        cursor += ApplSubIdField.BYTE_LENGTH;
        if (!partitionId.parse(data, cursor)) {
            return false;
        }
        cursor += PartitionIdField.BYTE_LENGTH;
        if (!applMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += ApplMsgIdField.BYTE_LENGTH;
        if (!applId.parse(data, cursor)) {
            return false;
        }
        cursor += ApplIdField.BYTE_LENGTH;
        if (!applResendFlag.parse(data, cursor)) {
            return false;
        }
        cursor += ApplResendFlagField.BYTE_LENGTH;
        if (!lastFragment.parse(data, cursor)) {
            return false;
        }
        cursor += LastFragmentField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = trdRegTsTimeOut.encode(data, cursor);
        cursor = notificationIn.encode(data, cursor);
        cursor = sendingTime.encode(data, cursor);
        cursor = applSubId.encode(data, cursor);
        cursor = partitionId.encode(data, cursor);
        cursor = applMsgId.encode(data, cursor);
        cursor = applId.encode(data, cursor);
        cursor = applResendFlag.encode(data, cursor);
        cursor = lastFragment.encode(data, cursor);
        if (buffer != null && buffer.length >= 56) {
            System.arraycopy(buffer, 49, data, cursor, 7); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 7, (byte) 0); // padding
        }
        cursor += 7;
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
     * Returns a copy of the bytes this entry was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the entry bytes, or empty when no decode has been attempted
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
            case "TrdRegTsTimeOut" -> Optional.of(trdRegTsTimeOut);
            case "NotificationIn" -> Optional.of(notificationIn);
            case "SendingTime" -> Optional.of(sendingTime);
            case "ApplSubId" -> Optional.of(applSubId);
            case "PartitionId" -> Optional.of(partitionId);
            case "ApplMsgId" -> Optional.of(applMsgId);
            case "ApplId" -> Optional.of(applId);
            case "ApplResendFlag" -> Optional.of(applResendFlag);
            case "LastFragment" -> Optional.of(lastFragment);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof RbcHeaderMeComp message)) {
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
     * Appends this entry's formatted representation.
     *
     * <p>The identifier form renders the entry name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
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
        if (!(other instanceof RbcHeaderMeComp message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
