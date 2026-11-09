package omi.nasdaq.nsmequities.orders.ouch.v5_0.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.enums.MassCancelResponseOptionalField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.MassCancelResponseOptionalFieldField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.GroupId;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.Side;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.UserRefIdx;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Field;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.GroupEntry;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.PrintOptions;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.RawRecord;

/**
 * The MassCancelResponseOptionalValue branch: one of 3 records, each as wide as its own fields, chosen by the MassCancelResponseOptionalField its holder reads before it.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class MassCancelResponseOptionalValue implements GroupEntry {

    /**
     * The width of this branch's narrowest case: the least it occupies on the wire.
     */
    public static final int MINIMUM_BYTE_LENGTH = 0;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "MassCancelResponseOptionalValue";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when its holder's MassCancelResponseOptionalField is 27.
         */
        SIDE,
        /**
         * Selected when its holder's MassCancelResponseOptionalField is 24.
         */
        GROUP_ID,
        /**
         * Selected when its holder's MassCancelResponseOptionalField is 28.
         */
        USER_REF_IDX,
        /**
         * Selected when its holder's MassCancelResponseOptionalField names no case above: the bytes the wire states for it, kept whole.
         */
        UNKNOWN
    }

    private final Side side = new Side();
    private final GroupId groupId = new GroupId();
    private final UserRefIdx userRefIdx = new UserRefIdx();
    private final RawRecord unknown = new RawRecord();
    private Case selected = Case.SIDE;

    /**
     * Returns the case this branch holds: the one its rules selected, or the one last chosen.
     *
     * @return the selected case
     */
    public Case selected() {
        return selected;
    }

    /**
     * Chooses the case to encode. Its holder writes the MassCancelResponseOptionalField that selects it, so its bytes select it again.
     *
     * @param value the case
     */
    public void select(Case value) {
        selected = Objects.requireNonNull(value, "value");
    }

    /**
     * Returns the case a MassCancelResponseOptionalField selects, rules tried in order.
     *
     * @param massCancelResponseOptionalField the field its holder read before this branch
     * @return the selected case, or null when it selects none
     */
    public static Case caseFor(MassCancelResponseOptionalFieldField massCancelResponseOptionalField) {
        if (massCancelResponseOptionalField.value() == MassCancelResponseOptionalField.SIDE) {
            return Case.SIDE;
        }
        if (massCancelResponseOptionalField.value() == MassCancelResponseOptionalField.GROUP_ID) {
            return Case.GROUP_ID;
        }
        if (massCancelResponseOptionalField.value() == MassCancelResponseOptionalField.USERREFIDX) {
            return Case.USER_REF_IDX;
        }
        return null;
    }

    /**
     * Writes the MassCancelResponseOptionalField that selects the case this branch holds.
     *
     * @param massCancelResponseOptionalField the field its holder writes before this branch
     */
    public void writeKey(MassCancelResponseOptionalFieldField massCancelResponseOptionalField) {
        switch (selected) {
            case SIDE -> massCancelResponseOptionalField.value(MassCancelResponseOptionalField.SIDE);
            case GROUP_ID -> massCancelResponseOptionalField.value(MassCancelResponseOptionalField.GROUP_ID);
            case USER_REF_IDX -> massCancelResponseOptionalField.value(MassCancelResponseOptionalField.USERREFIDX);
            case UNKNOWN -> { }
        }
    }

    /**
     * Decodes the case a MassCancelResponseOptionalField selects.
     *
     * @param massCancelResponseOptionalField the field its holder read before this branch
     * @param data   the buffer to decode from
     * @param offset the index of this branch's first byte
     * @param end    the index just past the last byte this branch may read
     * @return true when its record decoded; a key naming no declared case keeps the bytes the wire states
     */
    public boolean parseFrom(MassCancelResponseOptionalFieldField massCancelResponseOptionalField, byte[] data, int offset, int end) {
        clear();
        Case chosen = caseFor(massCancelResponseOptionalField);
        if (chosen == null) {
            chosen = Case.UNKNOWN;
        }
        selected = chosen;
        return entry().parseFrom(data, offset, end);
    }

    /**
     * Returns the Side case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public Side side() {
        return side;
    }

    /**
     * Returns the GroupId case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public GroupId groupId() {
        return groupId;
    }

    /**
     * Returns the UserRefIdx case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public UserRefIdx userRefIdx() {
        return userRefIdx;
    }

    /**
     * Returns the bytes of an undeclared case, which holds them when it is selected.
     *
     * @return the undeclared case's record
     */
    public RawRecord unknown() {
        return unknown;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case SIDE -> side;
            case GROUP_ID -> groupId;
            case USER_REF_IDX -> userRefIdx;
            case UNKNOWN -> unknown;
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
        side.clear();
        groupId.clear();
        userRefIdx.clear();
        unknown.clear();
        selected = Case.SIDE;
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
        return other instanceof MassCancelResponseOptionalValue branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof MassCancelResponseOptionalValue branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
