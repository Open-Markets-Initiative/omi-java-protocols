package omi.nasdaq.nsmequities.nlsplus.itch.v3_0.structs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.CorrectedExtendedHoursOrSoldCodeField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.CorrectedSettlementTypeField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.CorrectedSpecialSaleConditionField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.fields.CorrectedTradeThroughExemptionField;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.types.Field;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.types.GroupEntry;
import omi.nasdaq.nsmequities.nlsplus.itch.v3_0.types.PrintOptions;

/**
 * The CorrectedSaleConditionModifier record a message holds.
 *
 * <p>The sale condition modifier reported on the corrected trade transaction</p>
 */
public final class CorrectedSaleConditionModifier implements GroupEntry {

    /**
     * This entry's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 4;

    /**
     * This entry's declared name.
     */
    public static final String NAME = "CorrectedSaleConditionModifier";

    /**
     * Used for Settlement Type information
     */
    private final CorrectedSettlementTypeField correctedSettlementType = new CorrectedSettlementTypeField();

    /**
     * Used for Sec Regulation Nms Trade Through Exemption codes
     */
    private final CorrectedTradeThroughExemptionField correctedTradeThroughExemption = new CorrectedTradeThroughExemptionField();

    /**
     * Used for Extended Hours or Sold codes
     */
    private final CorrectedExtendedHoursOrSoldCodeField correctedExtendedHoursOrSoldCode = new CorrectedExtendedHoursOrSoldCodeField();

    /**
     * Used for special sale condition codes. This field is case sensitive
     */
    private final CorrectedSpecialSaleConditionField correctedSpecialSaleCondition = new CorrectedSpecialSaleConditionField();

    /**
     * This entry's fields, in wire order.
     */
    private final List<Field> fields = List.of(correctedSettlementType, correctedTradeThroughExemption, correctedExtendedHoursOrSoldCode, correctedSpecialSaleCondition);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Used for Settlement Type information
     *
     * @return the CorrectedSettlementType field
     */
    public CorrectedSettlementTypeField correctedSettlementType() {
        return correctedSettlementType;
    }

    /**
     * Used for Sec Regulation Nms Trade Through Exemption codes
     *
     * @return the CorrectedTradeThroughExemption field
     */
    public CorrectedTradeThroughExemptionField correctedTradeThroughExemption() {
        return correctedTradeThroughExemption;
    }

    /**
     * Used for Extended Hours or Sold codes
     *
     * @return the CorrectedExtendedHoursOrSoldCode field
     */
    public CorrectedExtendedHoursOrSoldCodeField correctedExtendedHoursOrSoldCode() {
        return correctedExtendedHoursOrSoldCode;
    }

    /**
     * Used for special sale condition codes. This field is case sensitive
     *
     * @return the CorrectedSpecialSaleCondition field
     */
    public CorrectedSpecialSaleConditionField correctedSpecialSaleCondition() {
        return correctedSpecialSaleCondition;
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
        return new int[0];
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
        if (!correctedSettlementType.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedSettlementTypeField.BYTE_LENGTH;
        if (!correctedTradeThroughExemption.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedTradeThroughExemptionField.BYTE_LENGTH;
        if (!correctedExtendedHoursOrSoldCode.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedExtendedHoursOrSoldCodeField.BYTE_LENGTH;
        return correctedSpecialSaleCondition.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = correctedSettlementType.encode(data, cursor);
        cursor = correctedTradeThroughExemption.encode(data, cursor);
        cursor = correctedExtendedHoursOrSoldCode.encode(data, cursor);
        cursor = correctedSpecialSaleCondition.encode(data, cursor);
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
            case "CorrectedSettlementType" -> Optional.of(correctedSettlementType);
            case "CorrectedTradeThroughExemption" -> Optional.of(correctedTradeThroughExemption);
            case "CorrectedExtendedHoursOrSoldCode" -> Optional.of(correctedExtendedHoursOrSoldCode);
            case "CorrectedSpecialSaleCondition" -> Optional.of(correctedSpecialSaleCondition);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        if (!(other instanceof CorrectedSaleConditionModifier message)) {
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
        if (!(other instanceof CorrectedSaleConditionModifier message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
