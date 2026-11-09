package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ParamGroupTypeField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.structs.ReturnBitfieldsParamGroup;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.structs.UnitSequencesParamGroup;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.GroupEntry;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.PrintOptions;

/**
 * The Paramgrouppayload branch: one of 2 records, each as wide as its own fields, chosen by the ParamGroupType its holder reads before it.
 *
 * <p>Raw parameter group bytes, read as the group its ParamGroupType names</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class Paramgrouppayload implements GroupEntry {

    /**
     * The width of this branch's narrowest case: the least it occupies on the wire.
     */
    public static final int MINIMUM_BYTE_LENGTH = 2;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "Paramgrouppayload";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when its holder's ParamGroupType is 0x80.
         */
        UNIT_SEQUENCES_PARAM_GROUP,
        /**
         * Selected when its holder's ParamGroupType is 0x81.
         */
        RETURN_BITFIELDS_PARAM_GROUP
    }

    private final UnitSequencesParamGroup unitSequencesParamGroup = new UnitSequencesParamGroup();
    private final ReturnBitfieldsParamGroup returnBitfieldsParamGroup = new ReturnBitfieldsParamGroup();
    private Case selected = Case.UNIT_SEQUENCES_PARAM_GROUP;

    /**
     * Returns the case this branch holds: the one its rules selected, or the one last chosen.
     *
     * @return the selected case
     */
    public Case selected() {
        return selected;
    }

    /**
     * Chooses the case to encode. Its holder writes the ParamGroupType that selects it, so its bytes select it again.
     *
     * @param value the case
     */
    public void select(Case value) {
        selected = Objects.requireNonNull(value, "value");
    }

    /**
     * Returns the case a ParamGroupType selects, rules tried in order.
     *
     * @param paramGroupType the field its holder read before this branch
     * @return the selected case, or null when it selects none
     */
    public static Case caseFor(ParamGroupTypeField paramGroupType) {
        if (paramGroupType.value() == 128L) {
            return Case.UNIT_SEQUENCES_PARAM_GROUP;
        }
        if (paramGroupType.value() == 129L) {
            return Case.RETURN_BITFIELDS_PARAM_GROUP;
        }
        return null;
    }

    /**
     * Writes the ParamGroupType that selects the case this branch holds.
     *
     * @param paramGroupType the field its holder writes before this branch
     */
    public void writeKey(ParamGroupTypeField paramGroupType) {
        switch (selected) {
            case UNIT_SEQUENCES_PARAM_GROUP -> paramGroupType.value((short) 128);
            case RETURN_BITFIELDS_PARAM_GROUP -> paramGroupType.value((short) 129);
        }
    }

    /**
     * Decodes the case a ParamGroupType selects.
     *
     * @param paramGroupType the field its holder read before this branch
     * @param data   the buffer to decode from
     * @param offset the index of this branch's first byte
     * @param end    the index just past the last byte this branch may read
     * @return true when the key selects a case and its record decoded
     */
    public boolean parseFrom(ParamGroupTypeField paramGroupType, byte[] data, int offset, int end) {
        clear();
        Case chosen = caseFor(paramGroupType);
        if (chosen == null) {
            return false;
        }
        selected = chosen;
        return entry().parseFrom(data, offset, end);
    }

    /**
     * Returns the UnitSequencesParamGroup case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public UnitSequencesParamGroup unitSequencesParamGroup() {
        return unitSequencesParamGroup;
    }

    /**
     * Returns the ReturnBitfieldsParamGroup case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ReturnBitfieldsParamGroup returnBitfieldsParamGroup() {
        return returnBitfieldsParamGroup;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case UNIT_SEQUENCES_PARAM_GROUP -> unitSequencesParamGroup;
            case RETURN_BITFIELDS_PARAM_GROUP -> returnBitfieldsParamGroup;
        };
    }

    /**
     * Returns the declared padding runs: none, as no case of a branch holds padding.
     *
     * @return an empty array
     */
    public static int[] padding() {
        return new int[0];
    }

    @Override
    public int byteLength() {
        return entry().byteLength();
    }

    @Override
    public Optional<byte[]> raw() {
        return entry().raw();
    }

    @Override
    public boolean isDecoded() {
        return entry().isDecoded();
    }

    @Override
    public boolean isRecognized() {
        return entry().isRecognized();
    }

    @Override
    public boolean isValid() {
        return entry().isValid();
    }

    @Override
    public Optional<Field> failedAt() {
        return entry().failedAt();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        Case chosen = selected;
        clear();
        selected = chosen;
        return entry().parseFrom(data, offset, end);
    }

    @Override
    public int encode(byte[] data, int offset) {
        return entry().encode(data, offset);
    }

    @Override
    public byte[] toBytes() {
        return entry().toBytes();
    }

    @Override
    public void clear() {
        unitSequencesParamGroup.clear();
        returnBitfieldsParamGroup.clear();
        selected = Case.UNIT_SEQUENCES_PARAM_GROUP;
    }

    @Override
    public List<Field> fields() {
        return entry().fields();
    }

    @Override
    public Optional<Field> field(String name) {
        return entry().field(name);
    }

    @Override
    public List<Field> diffFields(GroupEntry other) {
        return other instanceof Paramgrouppayload branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.identifier()) {
            builder.append(NAME);
            return;
        }
        entry().toFormattedString(builder, options);
    }

    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }

    @Override
    public boolean equals(Object other) {
        return this == other || other instanceof Paramgrouppayload branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
