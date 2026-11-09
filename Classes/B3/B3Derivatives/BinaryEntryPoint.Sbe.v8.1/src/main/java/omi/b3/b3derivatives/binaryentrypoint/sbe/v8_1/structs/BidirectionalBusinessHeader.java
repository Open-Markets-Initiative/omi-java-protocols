package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.MarketSegmentIdOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.MsgSeqNumField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.PaddingCharField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.PossResendField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SendingTimeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SessionIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.GroupEntry;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.PrintOptions;

/**
 * The BidirectionalBusinessHeader record a message holds.
 *
 * <p>BidirectionalBusinessHeader</p>
 */
public final class BidirectionalBusinessHeader implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 20;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "BidirectionalBusinessHeader";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * sessionID
     */
    private final SessionIdField sessionId = new SessionIdField();

    /**
     * msgSeqNum
     */
    private final MsgSeqNumField msgSeqNum = new MsgSeqNumField();

    /**
     * sendingTime
     */
    private final SendingTimeField sendingTime = new SendingTimeField();

    /**
     * possResend
     */
    private final PossResendField possResend = new PossResendField();

    /**
     * marketSegmentID
     */
    private final MarketSegmentIdOptionalField marketSegmentIdOptional = new MarketSegmentIdOptionalField();

    /**
     * padding
     */
    private final PaddingCharField paddingChar = new PaddingCharField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(sessionId, msgSeqNum, sendingTime, possResend, marketSegmentIdOptional, paddingChar);

    private byte[] buffer;

    private boolean decoded;

    /**
     * sessionID
     *
     * @return the SessionId field
     */
    public SessionIdField sessionId() {
        return sessionId;
    }

    /**
     * msgSeqNum
     *
     * @return the MsgSeqNum field
     */
    public MsgSeqNumField msgSeqNum() {
        return msgSeqNum;
    }

    /**
     * sendingTime
     *
     * @return the SendingTime field
     */
    public SendingTimeField sendingTime() {
        return sendingTime;
    }

    /**
     * possResend
     *
     * @return the PossResend field
     */
    public PossResendField possResend() {
        return possResend;
    }

    /**
     * marketSegmentID
     *
     * @return the MarketSegmentIdOptional field
     */
    public MarketSegmentIdOptionalField marketSegmentIdOptional() {
        return marketSegmentIdOptional;
    }

    /**
     * padding
     *
     * @return the PaddingChar field
     */
    public PaddingCharField paddingChar() {
        return paddingChar;
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
        if (!sessionId.parse(data, cursor)) {
            return false;
        }
        cursor += SessionIdField.BYTE_LENGTH;
        if (!msgSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += MsgSeqNumField.BYTE_LENGTH;
        if (!sendingTime.parse(data, cursor)) {
            return false;
        }
        cursor += SendingTimeField.BYTE_LENGTH;
        if (!possResend.parse(data, cursor)) {
            return false;
        }
        cursor += PossResendField.BYTE_LENGTH;
        if (!marketSegmentIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdOptionalField.BYTE_LENGTH;
        if (!paddingChar.parse(data, cursor)) {
            return false;
        }
        cursor += PaddingCharField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sessionId.encode(data, cursor);
        cursor = msgSeqNum.encode(data, cursor);
        cursor = sendingTime.encode(data, cursor);
        cursor = possResend.encode(data, cursor);
        cursor = marketSegmentIdOptional.encode(data, cursor);
        cursor = paddingChar.encode(data, cursor);
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
            case "SessionId" -> Optional.of(sessionId);
            case "MsgSeqNum" -> Optional.of(msgSeqNum);
            case "SendingTime" -> Optional.of(sendingTime);
            case "PossResend" -> Optional.of(possResend);
            case "MarketSegmentIdOptional" -> Optional.of(marketSegmentIdOptional);
            case "PaddingChar" -> Optional.of(paddingChar);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof BidirectionalBusinessHeader message)) {
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
        if (!(other instanceof BidirectionalBusinessHeader message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
