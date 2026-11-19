package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums.OrderRestatedOptionalField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.OrderRestatedOptionalFieldField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.FirmUpId;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.UserRefIdx;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.Field;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.GroupEntry;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.PrintOptions;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.RawRecord;

/**
 * The OrderRestatedOptionalValue branch: one of 2 records, each as wide as its own fields, chosen by the OrderRestatedOptionalField its holder reads before it.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class OrderRestatedOptionalValue implements GroupEntry {

    /**
     * The width of this branch's narrowest case: the least it occupies on the wire.
     */
    public static final int MINIMUM_BYTE_LENGTH = 0;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "OrderRestatedOptionalValue";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when its holder's OrderRestatedOptionalField is 37.
         */
        USER_REF_IDX,
        /**
         * Selected when its holder's OrderRestatedOptionalField is 31.
         */
        FIRM_UP_ID,
        /**
         * Selected when its holder's OrderRestatedOptionalField names no case above: the bytes the wire states for it, kept whole.
         */
        UNKNOWN
    }

    private final UserRefIdx userRefIdx = new UserRefIdx();
    private final FirmUpId firmUpId = new FirmUpId();
    private final RawRecord unknown = new RawRecord();
    private Case selected = Case.USER_REF_IDX;

    /**
     * Returns the case this branch holds: the one its rules selected, or the one last chosen.
     *
     * @return the selected case
     */
    public Case selected() {
        return selected;
    }

    /**
     * Chooses the case to encode. Its holder writes the OrderRestatedOptionalField that selects it, so its bytes select it again.
     *
     * @param value the case
     */
    public void select(Case value) {
        selected = Objects.requireNonNull(value, "value");
    }

    /**
     * Returns the case a OrderRestatedOptionalField selects, rules tried in order.
     *
     * @param orderRestatedOptionalField the field its holder read before this branch
     * @return the selected case, or null when it selects none
     */
    public static Case caseFor(OrderRestatedOptionalFieldField orderRestatedOptionalField) {
        if (orderRestatedOptionalField.value() == OrderRestatedOptionalField.USERREFIDX) {
            return Case.USER_REF_IDX;
        }
        if (orderRestatedOptionalField.value() == OrderRestatedOptionalField.FIRMUPID) {
            return Case.FIRM_UP_ID;
        }
        return null;
    }

    /**
     * Writes the OrderRestatedOptionalField that selects the case this branch holds.
     *
     * @param orderRestatedOptionalField the field its holder writes before this branch
     */
    public void writeKey(OrderRestatedOptionalFieldField orderRestatedOptionalField) {
        switch (selected) {
            case USER_REF_IDX -> orderRestatedOptionalField.value(OrderRestatedOptionalField.USERREFIDX);
            case FIRM_UP_ID -> orderRestatedOptionalField.value(OrderRestatedOptionalField.FIRMUPID);
            case UNKNOWN -> { }
        }
    }

    /**
     * Decodes the case a OrderRestatedOptionalField selects.
     *
     * @param orderRestatedOptionalField the field its holder read before this branch
     * @param data   the buffer to decode from
     * @param offset the index of this branch's first byte
     * @param end    the index just past the last byte this branch may read
     * @return true when its record decoded; a key naming no declared case keeps the bytes the wire states
     */
    public boolean parseFrom(OrderRestatedOptionalFieldField orderRestatedOptionalField, byte[] data, int offset, int end) {
        clear();
        Case chosen = caseFor(orderRestatedOptionalField);
        if (chosen == null) {
            chosen = Case.UNKNOWN;
        }
        selected = chosen;
        return entry().parseFrom(data, offset, end);
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
     * Returns the FirmUpId case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public FirmUpId firmUpId() {
        return firmUpId;
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
            case USER_REF_IDX -> userRefIdx;
            case FIRM_UP_ID -> firmUpId;
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
        userRefIdx.clear();
        firmUpId.clear();
        unknown.clear();
        selected = Case.USER_REF_IDX;
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
        return other instanceof OrderRestatedOptionalValue branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof OrderRestatedOptionalValue branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
