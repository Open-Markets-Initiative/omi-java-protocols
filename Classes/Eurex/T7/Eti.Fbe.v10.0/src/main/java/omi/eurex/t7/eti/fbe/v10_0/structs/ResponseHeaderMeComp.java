package omi.eurex.t7.eti.fbe.v10_0.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.eti.fbe.v10_0.fields.ApplIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ApplMsgIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.LastFragmentField;
import omi.eurex.t7.eti.fbe.v10_0.fields.MsgSeqNumField;
import omi.eurex.t7.eti.fbe.v10_0.fields.PartitionIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.RequestTimeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.ResponseInField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SendingTimeField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TrdRegTsTimeInField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TrdRegTsTimeOutField;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.GroupEntry;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * The ResponseHeaderMeComp record a message holds.
 *
 * <p>Response Header Me Comp</p>
 */
public final class ResponseHeaderMeComp implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 64;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "ResponseHeaderMeComp";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Request Time
     */
    private final RequestTimeField requestTime = new RequestTimeField();

    /**
     * Trd Reg Ts Time In
     */
    private final TrdRegTsTimeInField trdRegTsTimeIn = new TrdRegTsTimeInField();

    /**
     * Trd Reg Ts Time Out
     */
    private final TrdRegTsTimeOutField trdRegTsTimeOut = new TrdRegTsTimeOutField();

    /**
     * Response In
     */
    private final ResponseInField responseIn = new ResponseInField();

    /**
     * Sending Time
     */
    private final SendingTimeField sendingTime = new SendingTimeField();

    /**
     * Msg Seq Num
     */
    private final MsgSeqNumField msgSeqNum = new MsgSeqNumField();

    /**
     * Partition Id
     */
    private final PartitionIdField partitionId = new PartitionIdField();

    /**
     * Appl Id
     */
    private final ApplIdField applId = new ApplIdField();

    /**
     * Appl Msg Id
     */
    private final ApplMsgIdField applMsgId = new ApplMsgIdField();

    /**
     * Last Fragment
     */
    private final LastFragmentField lastFragment = new LastFragmentField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(requestTime, trdRegTsTimeIn, trdRegTsTimeOut, responseIn, sendingTime, msgSeqNum, partitionId, applId, applMsgId, lastFragment);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Request Time
     *
     * @return the RequestTime field
     */
    public RequestTimeField requestTime() {
        return requestTime;
    }

    /**
     * Trd Reg Ts Time In
     *
     * @return the TrdRegTsTimeIn field
     */
    public TrdRegTsTimeInField trdRegTsTimeIn() {
        return trdRegTsTimeIn;
    }

    /**
     * Trd Reg Ts Time Out
     *
     * @return the TrdRegTsTimeOut field
     */
    public TrdRegTsTimeOutField trdRegTsTimeOut() {
        return trdRegTsTimeOut;
    }

    /**
     * Response In
     *
     * @return the ResponseIn field
     */
    public ResponseInField responseIn() {
        return responseIn;
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
     * Msg Seq Num
     *
     * @return the MsgSeqNum field
     */
    public MsgSeqNumField msgSeqNum() {
        return msgSeqNum;
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
     * Appl Id
     *
     * @return the ApplId field
     */
    public ApplIdField applId() {
        return applId;
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
        if (!requestTime.parse(data, cursor)) {
            return false;
        }
        cursor += RequestTimeField.BYTE_LENGTH;
        if (!trdRegTsTimeIn.parse(data, cursor)) {
            return false;
        }
        cursor += TrdRegTsTimeInField.BYTE_LENGTH;
        if (!trdRegTsTimeOut.parse(data, cursor)) {
            return false;
        }
        cursor += TrdRegTsTimeOutField.BYTE_LENGTH;
        if (!responseIn.parse(data, cursor)) {
            return false;
        }
        cursor += ResponseInField.BYTE_LENGTH;
        if (!sendingTime.parse(data, cursor)) {
            return false;
        }
        cursor += SendingTimeField.BYTE_LENGTH;
        if (!msgSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += MsgSeqNumField.BYTE_LENGTH;
        if (!partitionId.parse(data, cursor)) {
            return false;
        }
        cursor += PartitionIdField.BYTE_LENGTH;
        if (!applId.parse(data, cursor)) {
            return false;
        }
        cursor += ApplIdField.BYTE_LENGTH;
        if (!applMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += ApplMsgIdField.BYTE_LENGTH;
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
        cursor = requestTime.encode(data, cursor);
        cursor = trdRegTsTimeIn.encode(data, cursor);
        cursor = trdRegTsTimeOut.encode(data, cursor);
        cursor = responseIn.encode(data, cursor);
        cursor = sendingTime.encode(data, cursor);
        cursor = msgSeqNum.encode(data, cursor);
        cursor = partitionId.encode(data, cursor);
        cursor = applId.encode(data, cursor);
        cursor = applMsgId.encode(data, cursor);
        cursor = lastFragment.encode(data, cursor);
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
            case "RequestTime" -> Optional.of(requestTime);
            case "TrdRegTsTimeIn" -> Optional.of(trdRegTsTimeIn);
            case "TrdRegTsTimeOut" -> Optional.of(trdRegTsTimeOut);
            case "ResponseIn" -> Optional.of(responseIn);
            case "SendingTime" -> Optional.of(sendingTime);
            case "MsgSeqNum" -> Optional.of(msgSeqNum);
            case "PartitionId" -> Optional.of(partitionId);
            case "ApplId" -> Optional.of(applId);
            case "ApplMsgId" -> Optional.of(applMsgId);
            case "LastFragment" -> Optional.of(lastFragment);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof ResponseHeaderMeComp message)) {
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
        if (!(other instanceof ResponseHeaderMeComp message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
