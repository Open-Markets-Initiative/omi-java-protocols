package omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.enums.FuturesFlags;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.fields.FuturesFlagsField;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.structs.Standard;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.structs.Variance;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.types.Field;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.types.GroupEntry;
import omi.cboe.cfefutures.multicastdepthofbook.pitch.v1_1_6.types.PrintOptions;

/**
 * The FutureBlock branch: one of 2 records, each as wide as its own fields, chosen by the FuturesFlags its holder reads before it.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class FutureBlock implements GroupEntry {

    /**
     * The width of this branch's narrowest case: the least it occupies on the wire.
     */
    public static final int MINIMUM_BYTE_LENGTH = 0;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "FutureBlock";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when its holder's FuturesFlags is 0.
         */
        STANDARD,
        /**
         * Selected when its holder's FuturesFlags is 1.
         */
        VARIANCE
    }

    private final Standard standard = new Standard();
    private final Variance variance = new Variance();
    private Case selected = Case.STANDARD;

    /**
     * Returns the case this branch holds: the one its rules selected, or the one last chosen.
     *
     * @return the selected case
     */
    public Case selected() {
        return selected;
    }

    /**
     * Chooses the case to encode. Its holder writes the FuturesFlags that selects it, so its bytes select it again.
     *
     * @param value the case
     */
    public void select(Case value) {
        selected = Objects.requireNonNull(value, "value");
    }

    /**
     * Returns the case a FuturesFlags selects, rules tried in order.
     *
     * @param futuresFlags the field its holder read before this branch
     * @return the selected case, or null when it selects none
     */
    public static Case caseFor(FuturesFlagsField futuresFlags) {
        if (futuresFlags.value() == FuturesFlags.STANDARD) {
            return Case.STANDARD;
        }
        if (futuresFlags.value() == FuturesFlags.VARIANCE) {
            return Case.VARIANCE;
        }
        return null;
    }

    /**
     * Writes the FuturesFlags that selects the case this branch holds.
     *
     * @param futuresFlags the field its holder writes before this branch
     */
    public void writeKey(FuturesFlagsField futuresFlags) {
        switch (selected) {
            case STANDARD -> futuresFlags.value(FuturesFlags.STANDARD);
            case VARIANCE -> futuresFlags.value(FuturesFlags.VARIANCE);
        }
    }

    /**
     * Decodes the case a FuturesFlags selects.
     *
     * @param futuresFlags the field its holder read before this branch
     * @param legCountInput the LegCount its holder read, which its cases read
     * @param data   the buffer to decode from
     * @param offset the index of this branch's first byte
     * @param end    the index just past the last byte this branch may read
     * @return true when the key selects a case and its record decoded
     */
    public boolean parseFrom(FuturesFlagsField futuresFlags, long legCountInput, byte[] data, int offset, int end) {
        clear();
        standard.legCountInput(legCountInput);
        variance.legCountInput(legCountInput);
        Case chosen = caseFor(futuresFlags);
        if (chosen == null) {
            return false;
        }
        selected = chosen;
        return entry().parseFrom(data, offset, end);
    }

    /**
     * Returns the LegCount its holder writes for the case this branch holds: the size of the list it counts.
     *
     * @return the value, or empty when the case held reads none
     */
    public OptionalLong legCountInputWritten() {
        return switch (selected) {
            case STANDARD -> OptionalLong.of(standard.futureLeg().size());
            case VARIANCE -> OptionalLong.of(variance.futureLeg().size());
        };
    }

    /**
     * Returns the Standard case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public Standard standard() {
        return standard;
    }

    /**
     * Returns the Variance case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public Variance variance() {
        return variance;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case STANDARD -> standard;
            case VARIANCE -> variance;
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
        standard.clear();
        variance.clear();
        selected = Case.STANDARD;
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
        return other instanceof FutureBlock branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof FutureBlock branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
