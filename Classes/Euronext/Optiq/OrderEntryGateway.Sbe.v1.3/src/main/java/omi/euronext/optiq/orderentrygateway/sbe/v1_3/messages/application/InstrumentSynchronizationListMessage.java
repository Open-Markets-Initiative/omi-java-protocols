package omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.MsgSeqNumField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OegOutToMemberOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ResynchronizationIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.structs.InstrumentSynchronizationGroups;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Field;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Message;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.PrintOptions;

/**
 * Represents the InstrumentSynchronizationListMessage message from the OrderEntryGateway protocol.
 *
 * <p>InstrumentSynchronizationListMessage</p>
 */
public final class InstrumentSynchronizationListMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 16;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Instrument Synchronization List Message";

    /**
     * msgSeqNum
     */
    private final MsgSeqNumField msgSeqNum = new MsgSeqNumField();

    /**
     * oEGOUTToMember
     */
    private final OegOutToMemberOptionalField oegOutToMemberOptional = new OegOutToMemberOptionalField();

    /**
     * resynchronizationID
     */
    private final ResynchronizationIdField resynchronizationId = new ResynchronizationIdField();

    /**
     * InstrumentSynchronizationSection Block
     */
    private final InstrumentSynchronizationGroups instrumentSynchronizationGroups = new InstrumentSynchronizationGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, oegOutToMemberOptional, resynchronizationId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * msgSeqNum
     *
     * @return the MsgSeqNum field
     */
    public MsgSeqNumField msgSeqNum() {
        return msgSeqNum;
    }

    /**
     * oEGOUTToMember
     *
     * @return the OegOutToMemberOptional field
     */
    public OegOutToMemberOptionalField oegOutToMemberOptional() {
        return oegOutToMemberOptional;
    }

    /**
     * resynchronizationID
     *
     * @return the ResynchronizationId field
     */
    public ResynchronizationIdField resynchronizationId() {
        return resynchronizationId;
    }

    /**
     * InstrumentSynchronizationSection Block
     *
     * @return the InstrumentSynchronizationGroups record
     */
    public InstrumentSynchronizationGroups instrumentSynchronizationGroups() {
        return instrumentSynchronizationGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + instrumentSynchronizationGroups.byteLength() - InstrumentSynchronizationGroups.MINIMUM_BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!msgSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += MsgSeqNumField.BYTE_LENGTH;
        if (!oegOutToMemberOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OegOutToMemberOptionalField.BYTE_LENGTH;
        if (!resynchronizationId.parse(data, cursor)) {
            return false;
        }
        cursor += ResynchronizationIdField.BYTE_LENGTH;
        if (!instrumentSynchronizationGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += instrumentSynchronizationGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = msgSeqNum.encode(data, cursor);
        cursor = oegOutToMemberOptional.encode(data, cursor);
        cursor = resynchronizationId.encode(data, cursor);
        cursor = instrumentSynchronizationGroups.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        instrumentSynchronizationGroups.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return instrumentSynchronizationGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!instrumentSynchronizationGroups.isValid()) {
            return false;
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
        if (!msgSeqNum.isDecoded()) {
            return Optional.of(msgSeqNum);
        }
        if (!oegOutToMemberOptional.isDecoded()) {
            return Optional.of(oegOutToMemberOptional);
        }
        if (!resynchronizationId.isDecoded()) {
            return Optional.of(resynchronizationId);
        }
        if (!instrumentSynchronizationGroups.isDecoded()) {
            return instrumentSynchronizationGroups.failedAt();
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
            case "MsgSeqNum" -> Optional.of(msgSeqNum);
            case "OegOutToMemberOptional" -> Optional.of(oegOutToMemberOptional);
            case "ResynchronizationId" -> Optional.of(resynchronizationId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof InstrumentSynchronizationListMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(instrumentSynchronizationGroups.diffFields(message.instrumentSynchronizationGroups));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            instrumentSynchronizationGroups.toFormattedString(builder, options);
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
        instrumentSynchronizationGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof InstrumentSynchronizationListMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && instrumentSynchronizationGroups.equals(message.instrumentSynchronizationGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, instrumentSynchronizationGroups);
    }
}
