package omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClientIdentificationShortcodeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ExecutionWithinFirmShortCodeOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.FamilyIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.FirmIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.MsgSeqNumField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SymbolIndexOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.UserStatusField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Field;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Message;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.PrintOptions;

/**
 * Represents the UserNotificationMessage message from the OrderEntryGateway protocol.
 *
 * <p>UserNotificationMessage</p>
 */
public final class UserNotificationMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 33;

    /**
     * This message's declared name.
     */
    public static final String NAME = "User Notification Message";

    /**
     * msgSeqNum
     */
    private final MsgSeqNumField msgSeqNum = new MsgSeqNumField();

    /**
     * firmID
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * executionWithinFirmShortCode
     */
    private final ExecutionWithinFirmShortCodeOptionalField executionWithinFirmShortCodeOptional = new ExecutionWithinFirmShortCodeOptionalField();

    /**
     * clientIdentificationShortcode
     */
    private final ClientIdentificationShortcodeField clientIdentificationShortcode = new ClientIdentificationShortcodeField();

    /**
     * familyID
     */
    private final FamilyIdField familyId = new FamilyIdField();

    /**
     * symbolIndex
     */
    private final SymbolIndexOptionalField symbolIndexOptional = new SymbolIndexOptionalField();

    /**
     * userStatus
     */
    private final UserStatusField userStatus = new UserStatusField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, firmId, executionWithinFirmShortCodeOptional, clientIdentificationShortcode, familyId, symbolIndexOptional, userStatus);

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
     * firmID
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * executionWithinFirmShortCode
     *
     * @return the ExecutionWithinFirmShortCodeOptional field
     */
    public ExecutionWithinFirmShortCodeOptionalField executionWithinFirmShortCodeOptional() {
        return executionWithinFirmShortCodeOptional;
    }

    /**
     * clientIdentificationShortcode
     *
     * @return the ClientIdentificationShortcode field
     */
    public ClientIdentificationShortcodeField clientIdentificationShortcode() {
        return clientIdentificationShortcode;
    }

    /**
     * familyID
     *
     * @return the FamilyId field
     */
    public FamilyIdField familyId() {
        return familyId;
    }

    /**
     * symbolIndex
     *
     * @return the SymbolIndexOptional field
     */
    public SymbolIndexOptionalField symbolIndexOptional() {
        return symbolIndexOptional;
    }

    /**
     * userStatus
     *
     * @return the UserStatus field
     */
    public UserStatusField userStatus() {
        return userStatus;
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
        if (!msgSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += MsgSeqNumField.BYTE_LENGTH;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!executionWithinFirmShortCodeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionWithinFirmShortCodeOptionalField.BYTE_LENGTH;
        if (!clientIdentificationShortcode.parse(data, cursor)) {
            return false;
        }
        cursor += ClientIdentificationShortcodeField.BYTE_LENGTH;
        if (!familyId.parse(data, cursor)) {
            return false;
        }
        cursor += FamilyIdField.BYTE_LENGTH;
        if (!symbolIndexOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexOptionalField.BYTE_LENGTH;
        return userStatus.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = msgSeqNum.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = executionWithinFirmShortCodeOptional.encode(data, cursor);
        cursor = clientIdentificationShortcode.encode(data, cursor);
        cursor = familyId.encode(data, cursor);
        cursor = symbolIndexOptional.encode(data, cursor);
        cursor = userStatus.encode(data, cursor);
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
            case "MsgSeqNum" -> Optional.of(msgSeqNum);
            case "FirmId" -> Optional.of(firmId);
            case "ExecutionWithinFirmShortCodeOptional" -> Optional.of(executionWithinFirmShortCodeOptional);
            case "ClientIdentificationShortcode" -> Optional.of(clientIdentificationShortcode);
            case "FamilyId" -> Optional.of(familyId);
            case "SymbolIndexOptional" -> Optional.of(symbolIndexOptional);
            case "UserStatus" -> Optional.of(userStatus);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof UserNotificationMessage message)) {
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
        if (!(other instanceof UserNotificationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
