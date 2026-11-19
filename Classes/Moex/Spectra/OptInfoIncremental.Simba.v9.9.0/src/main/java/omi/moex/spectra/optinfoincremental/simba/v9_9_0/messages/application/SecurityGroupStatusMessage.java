package omi.moex.spectra.optinfoincremental.simba.v9_9_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.BaseContractIdInt32NullOptionalField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.GroupMaskInt64NullOptionalField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.HaltTypeField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.SectionIdInt32NullOptionalField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.SecurityGroupIdField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.SecurityTradingStatusField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.StatusChangeTimeField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.fields.TradeModeMaskField;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.types.Field;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.types.Message;
import omi.moex.spectra.optinfoincremental.simba.v9_9_0.types.PrintOptions;

/**
 * Represents the SecurityGroupStatusMessage message from the OptInfoIncremental protocol.
 *
 * <p>SecurityGroupStatusMessage</p>
 */
public final class SecurityGroupStatusMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 38;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Group Status Message";

    /**
     * SecurityGroupID
     */
    private final SecurityGroupIdField securityGroupId = new SecurityGroupIdField();

    /**
     * HaltType
     */
    private final HaltTypeField haltType = new HaltTypeField();

    /**
     * TradeModeMask
     */
    private final TradeModeMaskField tradeModeMask = new TradeModeMaskField();

    /**
     * GroupMask
     */
    private final GroupMaskInt64NullOptionalField groupMaskInt64NullOptional = new GroupMaskInt64NullOptionalField();

    /**
     * SectionID
     */
    private final SectionIdInt32NullOptionalField sectionIdInt32NullOptional = new SectionIdInt32NullOptionalField();

    /**
     * BaseContractID
     */
    private final BaseContractIdInt32NullOptionalField baseContractIdInt32NullOptional = new BaseContractIdInt32NullOptionalField();

    /**
     * SecurityTradingStatus
     */
    private final SecurityTradingStatusField securityTradingStatus = new SecurityTradingStatusField();

    /**
     * TransactTime
     */
    private final StatusChangeTimeField statusChangeTime = new StatusChangeTimeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(securityGroupId, haltType, tradeModeMask, groupMaskInt64NullOptional, sectionIdInt32NullOptional, baseContractIdInt32NullOptional, securityTradingStatus, statusChangeTime);

    private byte[] buffer;

    private boolean decoded;

    /**
     * SecurityGroupID
     *
     * @return the SecurityGroupId field
     */
    public SecurityGroupIdField securityGroupId() {
        return securityGroupId;
    }

    /**
     * HaltType
     *
     * @return the HaltType field
     */
    public HaltTypeField haltType() {
        return haltType;
    }

    /**
     * TradeModeMask
     *
     * @return the TradeModeMask field
     */
    public TradeModeMaskField tradeModeMask() {
        return tradeModeMask;
    }

    /**
     * GroupMask
     *
     * @return the GroupMaskInt64NullOptional field
     */
    public GroupMaskInt64NullOptionalField groupMaskInt64NullOptional() {
        return groupMaskInt64NullOptional;
    }

    /**
     * SectionID
     *
     * @return the SectionIdInt32NullOptional field
     */
    public SectionIdInt32NullOptionalField sectionIdInt32NullOptional() {
        return sectionIdInt32NullOptional;
    }

    /**
     * BaseContractID
     *
     * @return the BaseContractIdInt32NullOptional field
     */
    public BaseContractIdInt32NullOptionalField baseContractIdInt32NullOptional() {
        return baseContractIdInt32NullOptional;
    }

    /**
     * SecurityTradingStatus
     *
     * @return the SecurityTradingStatus field
     */
    public SecurityTradingStatusField securityTradingStatus() {
        return securityTradingStatus;
    }

    /**
     * TransactTime
     *
     * @return the StatusChangeTime field
     */
    public StatusChangeTimeField statusChangeTime() {
        return statusChangeTime;
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
        if (!securityGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityGroupIdField.BYTE_LENGTH;
        if (!haltType.parse(data, cursor)) {
            return false;
        }
        cursor += HaltTypeField.BYTE_LENGTH;
        if (!tradeModeMask.parse(data, cursor)) {
            return false;
        }
        cursor += TradeModeMaskField.BYTE_LENGTH;
        if (!groupMaskInt64NullOptional.parse(data, cursor)) {
            return false;
        }
        cursor += GroupMaskInt64NullOptionalField.BYTE_LENGTH;
        if (!sectionIdInt32NullOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SectionIdInt32NullOptionalField.BYTE_LENGTH;
        if (!baseContractIdInt32NullOptional.parse(data, cursor)) {
            return false;
        }
        cursor += BaseContractIdInt32NullOptionalField.BYTE_LENGTH;
        if (!securityTradingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTradingStatusField.BYTE_LENGTH;
        return statusChangeTime.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = securityGroupId.encode(data, cursor);
        cursor = haltType.encode(data, cursor);
        cursor = tradeModeMask.encode(data, cursor);
        cursor = groupMaskInt64NullOptional.encode(data, cursor);
        cursor = sectionIdInt32NullOptional.encode(data, cursor);
        cursor = baseContractIdInt32NullOptional.encode(data, cursor);
        cursor = securityTradingStatus.encode(data, cursor);
        cursor = statusChangeTime.encode(data, cursor);
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
            case "SecurityGroupId" -> Optional.of(securityGroupId);
            case "HaltType" -> Optional.of(haltType);
            case "TradeModeMask" -> Optional.of(tradeModeMask);
            case "GroupMaskInt64NullOptional" -> Optional.of(groupMaskInt64NullOptional);
            case "SectionIdInt32NullOptional" -> Optional.of(sectionIdInt32NullOptional);
            case "BaseContractIdInt32NullOptional" -> Optional.of(baseContractIdInt32NullOptional);
            case "SecurityTradingStatus" -> Optional.of(securityTradingStatus);
            case "StatusChangeTime" -> Optional.of(statusChangeTime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityGroupStatusMessage message)) {
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
        if (!(other instanceof SecurityGroupStatusMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
