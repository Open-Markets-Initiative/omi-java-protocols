package omi.eurex.t7.xti.fbe.v11_0.groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.eurex.t7.xti.fbe.v11_0.fields.RiskLimitAmountField;
import omi.eurex.t7.xti.fbe.v11_0.fields.RiskLimitGroupField;
import omi.eurex.t7.xti.fbe.v11_0.fields.RiskLimitNetPositionAmountField;
import omi.eurex.t7.xti.fbe.v11_0.fields.RiskLimitOpenAmountField;
import omi.eurex.t7.xti.fbe.v11_0.fields.RiskLimitRequestingPartyRoleField;
import omi.eurex.t7.xti.fbe.v11_0.fields.RiskLimitTypeField;
import omi.eurex.t7.xti.fbe.v11_0.fields.RiskLimitViolationIndicatorField;
import omi.eurex.t7.xti.fbe.v11_0.types.Field;
import omi.eurex.t7.xti.fbe.v11_0.types.GroupEntry;
import omi.eurex.t7.xti.fbe.v11_0.types.PrintOptions;

/**
 * One entry of the RiskLimitsRptGrpComp repeating group.
 *
 * <p>Risk Limits Rpt Grp Comp</p>
 */
public final class RiskLimitsRptGrpCompEntry implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 32;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "RiskLimitsRptGrpComp";

    /**
     * This entry's declared padding runs, as {@code offset, length} pairs relative to the start of the entry.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 30, 2 };

    /**
     * Risk Limit Amount
     */
    private final RiskLimitAmountField riskLimitAmount = new RiskLimitAmountField();

    /**
     * Risk Limit Open Amount
     */
    private final RiskLimitOpenAmountField riskLimitOpenAmount = new RiskLimitOpenAmountField();

    /**
     * Risk Limit Net Position Amount
     */
    private final RiskLimitNetPositionAmountField riskLimitNetPositionAmount = new RiskLimitNetPositionAmountField();

    /**
     * Risk Limit Type
     */
    private final RiskLimitTypeField riskLimitType = new RiskLimitTypeField();

    /**
     * Risk Limit Requesting Party Role
     */
    private final RiskLimitRequestingPartyRoleField riskLimitRequestingPartyRole = new RiskLimitRequestingPartyRoleField();

    /**
     * Risk Limit Violation Indicator
     */
    private final RiskLimitViolationIndicatorField riskLimitViolationIndicator = new RiskLimitViolationIndicatorField();

    /**
     * Risk Limit Group
     */
    private final RiskLimitGroupField riskLimitGroup = new RiskLimitGroupField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(riskLimitAmount, riskLimitOpenAmount, riskLimitNetPositionAmount, riskLimitType, riskLimitRequestingPartyRole, riskLimitViolationIndicator, riskLimitGroup);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Risk Limit Amount
     *
     * @return the RiskLimitAmount field
     */
    public RiskLimitAmountField riskLimitAmount() {
        return riskLimitAmount;
    }

    /**
     * Risk Limit Open Amount
     *
     * @return the RiskLimitOpenAmount field
     */
    public RiskLimitOpenAmountField riskLimitOpenAmount() {
        return riskLimitOpenAmount;
    }

    /**
     * Risk Limit Net Position Amount
     *
     * @return the RiskLimitNetPositionAmount field
     */
    public RiskLimitNetPositionAmountField riskLimitNetPositionAmount() {
        return riskLimitNetPositionAmount;
    }

    /**
     * Risk Limit Type
     *
     * @return the RiskLimitType field
     */
    public RiskLimitTypeField riskLimitType() {
        return riskLimitType;
    }

    /**
     * Risk Limit Requesting Party Role
     *
     * @return the RiskLimitRequestingPartyRole field
     */
    public RiskLimitRequestingPartyRoleField riskLimitRequestingPartyRole() {
        return riskLimitRequestingPartyRole;
    }

    /**
     * Risk Limit Violation Indicator
     *
     * @return the RiskLimitViolationIndicator field
     */
    public RiskLimitViolationIndicatorField riskLimitViolationIndicator() {
        return riskLimitViolationIndicator;
    }

    /**
     * Risk Limit Group
     *
     * @return the RiskLimitGroup field
     */
    public RiskLimitGroupField riskLimitGroup() {
        return riskLimitGroup;
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
        if (!riskLimitAmount.parse(data, cursor)) {
            return false;
        }
        cursor += RiskLimitAmountField.BYTE_LENGTH;
        if (!riskLimitOpenAmount.parse(data, cursor)) {
            return false;
        }
        cursor += RiskLimitOpenAmountField.BYTE_LENGTH;
        if (!riskLimitNetPositionAmount.parse(data, cursor)) {
            return false;
        }
        cursor += RiskLimitNetPositionAmountField.BYTE_LENGTH;
        if (!riskLimitType.parse(data, cursor)) {
            return false;
        }
        cursor += RiskLimitTypeField.BYTE_LENGTH;
        if (!riskLimitRequestingPartyRole.parse(data, cursor)) {
            return false;
        }
        cursor += RiskLimitRequestingPartyRoleField.BYTE_LENGTH;
        if (!riskLimitViolationIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += RiskLimitViolationIndicatorField.BYTE_LENGTH;
        if (!riskLimitGroup.parse(data, cursor)) {
            return false;
        }
        cursor += RiskLimitGroupField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = riskLimitAmount.encode(data, cursor);
        cursor = riskLimitOpenAmount.encode(data, cursor);
        cursor = riskLimitNetPositionAmount.encode(data, cursor);
        cursor = riskLimitType.encode(data, cursor);
        cursor = riskLimitRequestingPartyRole.encode(data, cursor);
        cursor = riskLimitViolationIndicator.encode(data, cursor);
        cursor = riskLimitGroup.encode(data, cursor);
        if (buffer != null && buffer.length >= 32) {
            System.arraycopy(buffer, 30, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
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
            case "RiskLimitAmount" -> Optional.of(riskLimitAmount);
            case "RiskLimitOpenAmount" -> Optional.of(riskLimitOpenAmount);
            case "RiskLimitNetPositionAmount" -> Optional.of(riskLimitNetPositionAmount);
            case "RiskLimitType" -> Optional.of(riskLimitType);
            case "RiskLimitRequestingPartyRole" -> Optional.of(riskLimitRequestingPartyRole);
            case "RiskLimitViolationIndicator" -> Optional.of(riskLimitViolationIndicator);
            case "RiskLimitGroup" -> Optional.of(riskLimitGroup);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof RiskLimitsRptGrpCompEntry message)) {
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
        if (!(other instanceof RiskLimitsRptGrpCompEntry message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
