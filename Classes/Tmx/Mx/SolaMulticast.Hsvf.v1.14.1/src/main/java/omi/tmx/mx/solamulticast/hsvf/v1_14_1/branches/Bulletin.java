package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.BulletinType;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.fields.BulletinTypeField;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.RegularTextBulletin;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.SpecialTextBulletin;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The Bulletin branch: one of 2 records of 80 bytes, chosen by the BulletinType its holder reads before it.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class Bulletin implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 80;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "Bulletin";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when its holder's BulletinType is 1.
         */
        REGULAR_TEXT_BULLETIN,
        /**
         * Selected when its holder's BulletinType is 2.
         */
        SPECIAL_TEXT_BULLETIN
    }

    private final RegularTextBulletin regularTextBulletin = new RegularTextBulletin();
    private final SpecialTextBulletin specialTextBulletin = new SpecialTextBulletin();
    private Case selected = Case.REGULAR_TEXT_BULLETIN;

    /**
     * Returns the case this branch holds: the one its rules selected, or the one last chosen.
     *
     * @return the selected case
     */
    public Case selected() {
        return selected;
    }

    /**
     * Chooses the case to encode. Its holder writes the BulletinType that selects it, so its bytes select it again.
     *
     * @param value the case
     */
    public void select(Case value) {
        selected = Objects.requireNonNull(value, "value");
    }

    /**
     * Returns the case a BulletinType selects, rules tried in order.
     *
     * @param bulletinType the field its holder read before this branch
     * @return the selected case, or null when it selects none
     */
    public static Case caseFor(BulletinTypeField bulletinType) {
        if (bulletinType.value() == BulletinType.REGULAR_TEXT_BULLETIN) {
            return Case.REGULAR_TEXT_BULLETIN;
        }
        if (bulletinType.value() == BulletinType.SPECIAL_TEXT_BULLETIN) {
            return Case.SPECIAL_TEXT_BULLETIN;
        }
        return null;
    }

    /**
     * Writes the BulletinType that selects the case this branch holds.
     *
     * @param bulletinType the field its holder writes before this branch
     */
    public void writeKey(BulletinTypeField bulletinType) {
        switch (selected) {
            case REGULAR_TEXT_BULLETIN -> bulletinType.value(BulletinType.REGULAR_TEXT_BULLETIN);
            case SPECIAL_TEXT_BULLETIN -> bulletinType.value(BulletinType.SPECIAL_TEXT_BULLETIN);
        }
    }

    /**
     * Decodes the case a BulletinType selects.
     *
     * @param bulletinType the field its holder read before this branch
     * @param data   the buffer to decode from
     * @param offset the index of this branch's first byte
     * @param end    the index just past the last byte this branch may read
     * @return true when the key selects a case and its record decoded
     */
    public boolean parseFrom(BulletinTypeField bulletinType, byte[] data, int offset, int end) {
        clear();
        Case chosen = caseFor(bulletinType);
        if (chosen == null) {
            return false;
        }
        selected = chosen;
        return entry().parseFrom(data, offset, end);
    }

    /**
     * Returns the RegularTextBulletin case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public RegularTextBulletin regularTextBulletin() {
        return regularTextBulletin;
    }

    /**
     * Returns the SpecialTextBulletin case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SpecialTextBulletin specialTextBulletin() {
        return specialTextBulletin;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case REGULAR_TEXT_BULLETIN -> regularTextBulletin;
            case SPECIAL_TEXT_BULLETIN -> specialTextBulletin;
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
        return BYTE_LENGTH;
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
        regularTextBulletin.clear();
        specialTextBulletin.clear();
        selected = Case.REGULAR_TEXT_BULLETIN;
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
        return other instanceof Bulletin branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof Bulletin branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
