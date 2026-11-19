package omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ClearingFirmField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.CustomGroupIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.RiskResetField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.RiskRootField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.RiskStatusIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ScratchPadField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.TargetMatchingUnitField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.Field;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.Message;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.PrintOptions;

/**
 * Represents the ResetRiskMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Reset or release Firm, Risk Root, or Custom Group ID level lockout conditions resulting from risk profile trips or self-imposed lockouts issued via Cancel Order or Purge Orders messages</p>
 */
public final class ResetRiskMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 39;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Reset Risk Message";

    /**
     * User defined identifier of a Reset Risk message
     */
    private final RiskStatusIdField riskStatusId = new RiskStatusIdField();

    /**
     * For use by customers using Cboe's Risk Management tools to reset or release EFID Group, EFID, Risk Root, or Custom Group ID level lockout conditions resulting from risk profile trips or self-imposed lockouts issued via Cancel Orderor Purge Orders messages
     */
    private final RiskResetField riskReset = new RiskResetField();

    /**
     * EFID that will clear the trade
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * The underlying symbol
     */
    private final RiskRootField riskRoot = new RiskRootField();

    /**
     * Matching unit to which the message is to be directed
     */
    private final TargetMatchingUnitField targetMatchingUnit = new TargetMatchingUnitField();

    /**
     * Used to group orders for use inPurge Ordersmessages where multiple orders can be cancelled by specifying a list of CustomGroupIds
     */
    private final CustomGroupIdField customGroupId = new CustomGroupIdField();

    /**
     * Field ignored by Cboe (any value is accepted)
     */
    private final ScratchPadField scratchPad = new ScratchPadField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(riskStatusId, riskReset, clearingFirm, riskRoot, targetMatchingUnit, customGroupId, scratchPad);

    private byte[] buffer;

    private boolean decoded;

    /**
     * User defined identifier of a Reset Risk message
     *
     * @return the RiskStatusId field
     */
    public RiskStatusIdField riskStatusId() {
        return riskStatusId;
    }

    /**
     * For use by customers using Cboe's Risk Management tools to reset or release EFID Group, EFID, Risk Root, or Custom Group ID level lockout conditions resulting from risk profile trips or self-imposed lockouts issued via Cancel Orderor Purge Orders messages
     *
     * @return the RiskReset field
     */
    public RiskResetField riskReset() {
        return riskReset;
    }

    /**
     * EFID that will clear the trade
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * The underlying symbol
     *
     * @return the RiskRoot field
     */
    public RiskRootField riskRoot() {
        return riskRoot;
    }

    /**
     * Matching unit to which the message is to be directed
     *
     * @return the TargetMatchingUnit field
     */
    public TargetMatchingUnitField targetMatchingUnit() {
        return targetMatchingUnit;
    }

    /**
     * Used to group orders for use inPurge Ordersmessages where multiple orders can be cancelled by specifying a list of CustomGroupIds
     *
     * @return the CustomGroupId field
     */
    public CustomGroupIdField customGroupId() {
        return customGroupId;
    }

    /**
     * Field ignored by Cboe (any value is accepted)
     *
     * @return the ScratchPad field
     */
    public ScratchPadField scratchPad() {
        return scratchPad;
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
        if (!riskStatusId.parse(data, cursor)) {
            return false;
        }
        cursor += RiskStatusIdField.BYTE_LENGTH;
        if (!riskReset.parse(data, cursor)) {
            return false;
        }
        cursor += RiskResetField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!riskRoot.parse(data, cursor)) {
            return false;
        }
        cursor += RiskRootField.BYTE_LENGTH;
        if (!targetMatchingUnit.parse(data, cursor)) {
            return false;
        }
        cursor += TargetMatchingUnitField.BYTE_LENGTH;
        if (!customGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += CustomGroupIdField.BYTE_LENGTH;
        return scratchPad.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = riskStatusId.encode(data, cursor);
        cursor = riskReset.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = riskRoot.encode(data, cursor);
        cursor = targetMatchingUnit.encode(data, cursor);
        cursor = customGroupId.encode(data, cursor);
        cursor = scratchPad.encode(data, cursor);
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
            case "RiskStatusId" -> Optional.of(riskStatusId);
            case "RiskReset" -> Optional.of(riskReset);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "RiskRoot" -> Optional.of(riskRoot);
            case "TargetMatchingUnit" -> Optional.of(targetMatchingUnit);
            case "CustomGroupId" -> Optional.of(customGroupId);
            case "ScratchPad" -> Optional.of(scratchPad);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ResetRiskMessage message)) {
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
        if (!(other instanceof ResetRiskMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
