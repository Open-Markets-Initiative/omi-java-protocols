package omi.cme.globex.ilink3.sbe.v8_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PartyDetailsListReqIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SendingTimeEpochField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SeqNumField;
import omi.cme.globex.ilink3.sbe.v8_5.structs.PartyIdsGroups;
import omi.cme.globex.ilink3.sbe.v8_5.structs.RequestingPartyIdsGroups;
import omi.cme.globex.ilink3.sbe.v8_5.types.Field;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;
import omi.cme.globex.ilink3.sbe.v8_5.types.PrintOptions;

/**
 * Represents the PartyDetailsListRequest message from the iLink3 protocol.
 *
 * <p>The Party Details List Request message is used to request all of the Party Details Definition information such as clearing instructions, order source, self-match parameters, etc. for a particular Firm ID. Only one Party Details List Request is allowed at a time.</p>
 */
public final class PartyDetailsListRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 26;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Party Details List Request";

    /**
     * Refers to the ID of the related PartyDetailsDefinitionRequest message which will logically be tied to this message
     */
    private final PartyDetailsListReqIdField partyDetailsListReqId = new PartyDetailsListReqIdField();

    /**
     * Time when the message is sent. 64-bit integer expressing the number of nano seconds since midnight January 1, 1970.
     */
    private final SendingTimeEpochField sendingTimeEpoch = new SendingTimeEpochField();

    /**
     * Sequence number as assigned to message
     */
    private final SeqNumField seqNum = new SeqNumField();

    /**
     * NoRequestingPartyIDs Block
     */
    private final RequestingPartyIdsGroups requestingPartyIdsGroups = new RequestingPartyIdsGroups();

    /**
     * NoPartyIDs Block
     */
    private final PartyIdsGroups partyIdsGroups = new PartyIdsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(partyDetailsListReqId, sendingTimeEpoch, seqNum);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Refers to the ID of the related PartyDetailsDefinitionRequest message which will logically be tied to this message
     *
     * @return the PartyDetailsListReqId field
     */
    public PartyDetailsListReqIdField partyDetailsListReqId() {
        return partyDetailsListReqId;
    }

    /**
     * Time when the message is sent. 64-bit integer expressing the number of nano seconds since midnight January 1, 1970.
     *
     * @return the SendingTimeEpoch field
     */
    public SendingTimeEpochField sendingTimeEpoch() {
        return sendingTimeEpoch;
    }

    /**
     * Sequence number as assigned to message
     *
     * @return the SeqNum field
     */
    public SeqNumField seqNum() {
        return seqNum;
    }

    /**
     * NoRequestingPartyIDs Block
     *
     * @return the RequestingPartyIdsGroups record
     */
    public RequestingPartyIdsGroups requestingPartyIdsGroups() {
        return requestingPartyIdsGroups;
    }

    /**
     * NoPartyIDs Block
     *
     * @return the PartyIdsGroups record
     */
    public PartyIdsGroups partyIdsGroups() {
        return partyIdsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + requestingPartyIdsGroups.byteLength() - RequestingPartyIdsGroups.MINIMUM_BYTE_LENGTH + partyIdsGroups.byteLength() - PartyIdsGroups.MINIMUM_BYTE_LENGTH;
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
        return Optional.ofNullable(sendingTimeEpoch.value());
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
        if (!partyDetailsListReqId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyDetailsListReqIdField.BYTE_LENGTH;
        if (!sendingTimeEpoch.parse(data, cursor)) {
            return false;
        }
        cursor += SendingTimeEpochField.BYTE_LENGTH;
        if (!seqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SeqNumField.BYTE_LENGTH;
        if (!requestingPartyIdsGroups.parseFrom(data, cursor, end - 3)) {
            return false;
        }
        cursor += requestingPartyIdsGroups.byteLength();
        if (end - cursor < 3) {
            return false;
        }
        if (!partyIdsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += partyIdsGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = partyDetailsListReqId.encode(data, cursor);
        cursor = sendingTimeEpoch.encode(data, cursor);
        cursor = seqNum.encode(data, cursor);
        cursor = requestingPartyIdsGroups.encode(data, cursor);
        cursor = partyIdsGroups.encode(data, cursor);
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
        requestingPartyIdsGroups.clear();
        partyIdsGroups.clear();
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
        if (!requestingPartyIdsGroups.isRecognized()) {
            return false;
        }
        return partyIdsGroups.isRecognized();
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
        if (!requestingPartyIdsGroups.isValid()) {
            return false;
        }
        if (!partyIdsGroups.isValid()) {
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
        if (!partyDetailsListReqId.isDecoded()) {
            return Optional.of(partyDetailsListReqId);
        }
        if (!sendingTimeEpoch.isDecoded()) {
            return Optional.of(sendingTimeEpoch);
        }
        if (!seqNum.isDecoded()) {
            return Optional.of(seqNum);
        }
        if (!requestingPartyIdsGroups.isDecoded()) {
            return requestingPartyIdsGroups.failedAt();
        }
        if (!partyIdsGroups.isDecoded()) {
            return partyIdsGroups.failedAt();
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
            case "PartyDetailsListReqId" -> Optional.of(partyDetailsListReqId);
            case "SendingTimeEpoch" -> Optional.of(sendingTimeEpoch);
            case "SeqNum" -> Optional.of(seqNum);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PartyDetailsListRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(requestingPartyIdsGroups.diffFields(message.requestingPartyIdsGroups));
        changed.addAll(partyIdsGroups.diffFields(message.partyIdsGroups));
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
            requestingPartyIdsGroups.toFormattedString(builder, options);
            builder.append(", ");
            partyIdsGroups.toFormattedString(builder, options);
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
        requestingPartyIdsGroups.toFormattedString(builder, nested);
        partyIdsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof PartyDetailsListRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && requestingPartyIdsGroups.equals(message.requestingPartyIdsGroups) && partyIdsGroups.equals(message.partyIdsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, requestingPartyIdsGroups, partyIdsGroups);
    }
}
