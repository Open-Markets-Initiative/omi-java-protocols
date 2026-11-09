package omi.ice.icefutures.mdf.impact.v1_1_33.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_33.enums.SpecialFieldId;
import omi.ice.icefutures.mdf.impact.v1_1_33.fields.SpecialFieldIdField;
import omi.ice.icefutures.mdf.impact.v1_1_33.structs.AltHighPrice;
import omi.ice.icefutures.mdf.impact.v1_1_33.structs.AltLastTradePrice;
import omi.ice.icefutures.mdf.impact.v1_1_33.structs.AltLowPrice;
import omi.ice.icefutures.mdf.impact.v1_1_33.structs.AltPrice;
import omi.ice.icefutures.mdf.impact.v1_1_33.structs.AltVwap;
import omi.ice.icefutures.mdf.impact.v1_1_33.structs.Aon;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.GroupEntry;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.PrintOptions;
import omi.ice.icefutures.mdf.impact.v1_1_33.types.RawRecord;

/**
 * The VariableField branch: one of 6 records, each as wide as its own fields, chosen by the SpecialFieldId its holder reads before it.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class VariableField implements GroupEntry {

    /**
     * The width of this branch's narrowest case: the least it occupies on the wire.
     */
    public static final int MINIMUM_BYTE_LENGTH = 0;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "VariableField";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when its holder's SpecialFieldId is 1.
         */
        ALT_PRICE,
        /**
         * Selected when its holder's SpecialFieldId is 2.
         */
        ALT_HIGH_PRICE,
        /**
         * Selected when its holder's SpecialFieldId is 3.
         */
        ALT_LOW_PRICE,
        /**
         * Selected when its holder's SpecialFieldId is 4.
         */
        ALT_VWAP,
        /**
         * Selected when its holder's SpecialFieldId is 5.
         */
        ALT_LAST_TRADE_PRICE,
        /**
         * Selected when its holder's SpecialFieldId is 6.
         */
        AON,
        /**
         * Selected when its holder's SpecialFieldId names no case above: the bytes the wire states for it, kept whole.
         */
        UNKNOWN
    }

    private final AltPrice altPrice = new AltPrice();
    private final AltHighPrice altHighPrice = new AltHighPrice();
    private final AltLowPrice altLowPrice = new AltLowPrice();
    private final AltVwap altVwap = new AltVwap();
    private final AltLastTradePrice altLastTradePrice = new AltLastTradePrice();
    private final Aon aon = new Aon();
    private final RawRecord unknown = new RawRecord();
    private Case selected = Case.ALT_PRICE;

    /**
     * Returns the case this branch holds: the one its rules selected, or the one last chosen.
     *
     * @return the selected case
     */
    public Case selected() {
        return selected;
    }

    /**
     * Chooses the case to encode. Its holder writes the SpecialFieldId that selects it, so its bytes select it again.
     *
     * @param value the case
     */
    public void select(Case value) {
        selected = Objects.requireNonNull(value, "value");
    }

    /**
     * Returns the case a SpecialFieldId selects, rules tried in order.
     *
     * @param specialFieldId the field its holder read before this branch
     * @return the selected case, or null when it selects none
     */
    public static Case caseFor(SpecialFieldIdField specialFieldId) {
        if (specialFieldId.value() == SpecialFieldId.ALT_PRICE) {
            return Case.ALT_PRICE;
        }
        if (specialFieldId.value() == SpecialFieldId.ALT_HIGH_PRICE) {
            return Case.ALT_HIGH_PRICE;
        }
        if (specialFieldId.value() == SpecialFieldId.ALT_LOW_PRICE) {
            return Case.ALT_LOW_PRICE;
        }
        if (specialFieldId.value() == SpecialFieldId.ALT_VWAP) {
            return Case.ALT_VWAP;
        }
        if (specialFieldId.value() == SpecialFieldId.ALT_LAST_TRADE_PRICE) {
            return Case.ALT_LAST_TRADE_PRICE;
        }
        if (specialFieldId.value() == SpecialFieldId.AON) {
            return Case.AON;
        }
        return null;
    }

    /**
     * Writes the SpecialFieldId that selects the case this branch holds.
     *
     * @param specialFieldId the field its holder writes before this branch
     */
    public void writeKey(SpecialFieldIdField specialFieldId) {
        switch (selected) {
            case ALT_PRICE -> specialFieldId.value(SpecialFieldId.ALT_PRICE);
            case ALT_HIGH_PRICE -> specialFieldId.value(SpecialFieldId.ALT_HIGH_PRICE);
            case ALT_LOW_PRICE -> specialFieldId.value(SpecialFieldId.ALT_LOW_PRICE);
            case ALT_VWAP -> specialFieldId.value(SpecialFieldId.ALT_VWAP);
            case ALT_LAST_TRADE_PRICE -> specialFieldId.value(SpecialFieldId.ALT_LAST_TRADE_PRICE);
            case AON -> specialFieldId.value(SpecialFieldId.AON);
            case UNKNOWN -> { }
        }
    }

    /**
     * Decodes the case a SpecialFieldId selects.
     *
     * @param specialFieldId the field its holder read before this branch
     * @param data   the buffer to decode from
     * @param offset the index of this branch's first byte
     * @param end    the index just past the last byte this branch may read
     * @return true when its record decoded; a key naming no declared case keeps the bytes the wire states
     */
    public boolean parseFrom(SpecialFieldIdField specialFieldId, byte[] data, int offset, int end) {
        clear();
        Case chosen = caseFor(specialFieldId);
        if (chosen == null) {
            chosen = Case.UNKNOWN;
        }
        selected = chosen;
        return entry().parseFrom(data, offset, end);
    }

    /**
     * Returns the AltPrice case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AltPrice altPrice() {
        return altPrice;
    }

    /**
     * Returns the AltHighPrice case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AltHighPrice altHighPrice() {
        return altHighPrice;
    }

    /**
     * Returns the AltLowPrice case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AltLowPrice altLowPrice() {
        return altLowPrice;
    }

    /**
     * Returns the AltVwap case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AltVwap altVwap() {
        return altVwap;
    }

    /**
     * Returns the AltLastTradePrice case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AltLastTradePrice altLastTradePrice() {
        return altLastTradePrice;
    }

    /**
     * Returns the Aon case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public Aon aon() {
        return aon;
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
            case ALT_PRICE -> altPrice;
            case ALT_HIGH_PRICE -> altHighPrice;
            case ALT_LOW_PRICE -> altLowPrice;
            case ALT_VWAP -> altVwap;
            case ALT_LAST_TRADE_PRICE -> altLastTradePrice;
            case AON -> aon;
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
        altPrice.clear();
        altHighPrice.clear();
        altLowPrice.clear();
        altVwap.clear();
        altLastTradePrice.clear();
        aon.clear();
        unknown.clear();
        selected = Case.ALT_PRICE;
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
        return other instanceof VariableField branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof VariableField branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
