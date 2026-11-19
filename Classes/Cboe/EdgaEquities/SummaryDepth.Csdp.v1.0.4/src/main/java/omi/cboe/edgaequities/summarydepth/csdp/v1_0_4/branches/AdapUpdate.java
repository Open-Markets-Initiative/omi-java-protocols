package omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.fields.AdapBlockSizeField;
import omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.structs.LongUpdateAdapBlock;
import omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.structs.ShortUpdateAdapBlock;
import omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.types.Field;
import omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.types.GroupEntry;
import omi.cboe.edgaequities.summarydepth.csdp.v1_0_4.types.PrintOptions;

/**
 * The AdapUpdate branch: one of 2 records, each as wide as its own fields, chosen by the AdapBlockSize its holder reads before it.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class AdapUpdate implements GroupEntry {

    /**
     * The width of this branch's narrowest case: the least it occupies on the wire.
     */
    public static final int MINIMUM_BYTE_LENGTH = 9;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "AdapUpdate";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when its holder's AdapBlockSize is 10.
         */
        SHORT_UPDATE_ADAP_BLOCK,
        /**
         * Selected when its holder's AdapBlockSize is 18.
         */
        LONG_UPDATE_ADAP_BLOCK
    }

    private final ShortUpdateAdapBlock shortUpdateAdapBlock = new ShortUpdateAdapBlock();
    private final LongUpdateAdapBlock longUpdateAdapBlock = new LongUpdateAdapBlock();
    private Case selected = Case.SHORT_UPDATE_ADAP_BLOCK;

    /**
     * Returns the case this branch holds: the one its rules selected, or the one last chosen.
     *
     * @return the selected case
     */
    public Case selected() {
        return selected;
    }

    /**
     * Chooses the case to encode. Its holder writes the AdapBlockSize that selects it, so its bytes select it again.
     *
     * @param value the case
     */
    public void select(Case value) {
        selected = Objects.requireNonNull(value, "value");
    }

    /**
     * Returns the case a AdapBlockSize selects, rules tried in order.
     *
     * @param adapBlockSize the field its holder read before this branch
     * @return the selected case, or null when it selects none
     */
    public static Case caseFor(AdapBlockSizeField adapBlockSize) {
        if (adapBlockSize.value() == 10L) {
            return Case.SHORT_UPDATE_ADAP_BLOCK;
        }
        if (adapBlockSize.value() == 18L) {
            return Case.LONG_UPDATE_ADAP_BLOCK;
        }
        return null;
    }

    /**
     * Writes the AdapBlockSize that selects the case this branch holds.
     *
     * @param adapBlockSize the field its holder writes before this branch
     */
    public void writeKey(AdapBlockSizeField adapBlockSize) {
        switch (selected) {
            case SHORT_UPDATE_ADAP_BLOCK -> adapBlockSize.value((short) 10);
            case LONG_UPDATE_ADAP_BLOCK -> adapBlockSize.value((short) 18);
        }
    }

    /**
     * Decodes the case a AdapBlockSize selects.
     *
     * @param adapBlockSize the field its holder read before this branch
     * @param data   the buffer to decode from
     * @param offset the index of this branch's first byte
     * @param end    the index just past the last byte this branch may read
     * @return true when the key selects a case and its record decoded
     */
    public boolean parseFrom(AdapBlockSizeField adapBlockSize, byte[] data, int offset, int end) {
        clear();
        Case chosen = caseFor(adapBlockSize);
        if (chosen == null) {
            return false;
        }
        selected = chosen;
        return entry().parseFrom(data, offset, end);
    }

    /**
     * Returns the ShortUpdateAdapBlock case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ShortUpdateAdapBlock shortUpdateAdapBlock() {
        return shortUpdateAdapBlock;
    }

    /**
     * Returns the LongUpdateAdapBlock case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LongUpdateAdapBlock longUpdateAdapBlock() {
        return longUpdateAdapBlock;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case SHORT_UPDATE_ADAP_BLOCK -> shortUpdateAdapBlock;
            case LONG_UPDATE_ADAP_BLOCK -> longUpdateAdapBlock;
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
        shortUpdateAdapBlock.clear();
        longUpdateAdapBlock.clear();
        selected = Case.SHORT_UPDATE_ADAP_BLOCK;
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
        return other instanceof AdapUpdate branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof AdapUpdate branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
