package omi.ice.icefutures.mdf.impact.v1_1_51.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.ice.icefutures.mdf.impact.v1_1_51.enums.SpecialFieldId;
import omi.ice.icefutures.mdf.impact.v1_1_51.fields.SpecialFieldIdField;
import omi.ice.icefutures.mdf.impact.v1_1_51.structs.AccruedDistribution;
import omi.ice.icefutures.mdf.impact.v1_1_51.structs.AccruedFunding;
import omi.ice.icefutures.mdf.impact.v1_1_51.structs.AltHighPrice;
import omi.ice.icefutures.mdf.impact.v1_1_51.structs.AltLastTradePrice;
import omi.ice.icefutures.mdf.impact.v1_1_51.structs.AltLowPrice;
import omi.ice.icefutures.mdf.impact.v1_1_51.structs.AltPrice;
import omi.ice.icefutures.mdf.impact.v1_1_51.structs.AltVwap;
import omi.ice.icefutures.mdf.impact.v1_1_51.structs.AnnualizationFactor;
import omi.ice.icefutures.mdf.impact.v1_1_51.structs.Aon;
import omi.ice.icefutures.mdf.impact.v1_1_51.structs.SecondsToEndTplHold;
import omi.ice.icefutures.mdf.impact.v1_1_51.structs.TrfDaysToMaturity;
import omi.ice.icefutures.mdf.impact.v1_1_51.types.Field;
import omi.ice.icefutures.mdf.impact.v1_1_51.types.GroupEntry;
import omi.ice.icefutures.mdf.impact.v1_1_51.types.PrintOptions;
import omi.ice.icefutures.mdf.impact.v1_1_51.types.RawRecord;

/**
 * The VariableField branch: one of 11 records, each as wide as its own fields, chosen by the SpecialFieldId its holder reads before it.
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
         * Selected when its holder's SpecialFieldId is 18.
         */
        ACCRUED_DISTRIBUTION,
        /**
         * Selected when its holder's SpecialFieldId is 19.
         */
        ACCRUED_FUNDING,
        /**
         * Selected when its holder's SpecialFieldId is 20.
         */
        ANNUALIZATION_FACTOR,
        /**
         * Selected when its holder's SpecialFieldId is 21.
         */
        TRF_DAYS_TO_MATURITY,
        /**
         * Selected when its holder's SpecialFieldId is 22.
         */
        SECONDS_TO_END_TPL_HOLD,
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
    private final AccruedDistribution accruedDistribution = new AccruedDistribution();
    private final AccruedFunding accruedFunding = new AccruedFunding();
    private final AnnualizationFactor annualizationFactor = new AnnualizationFactor();
    private final TrfDaysToMaturity trfDaysToMaturity = new TrfDaysToMaturity();
    private final SecondsToEndTplHold secondsToEndTplHold = new SecondsToEndTplHold();
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
        if (specialFieldId.value() == SpecialFieldId.ACCRUED_DISTRIBUTION) {
            return Case.ACCRUED_DISTRIBUTION;
        }
        if (specialFieldId.value() == SpecialFieldId.ACCRUED_FUNDING) {
            return Case.ACCRUED_FUNDING;
        }
        if (specialFieldId.value() == SpecialFieldId.ANNUALIZATION_FACTOR) {
            return Case.ANNUALIZATION_FACTOR;
        }
        if (specialFieldId.value() == SpecialFieldId.TRF_DAYS_TO_MATURITY) {
            return Case.TRF_DAYS_TO_MATURITY;
        }
        if (specialFieldId.value() == SpecialFieldId.SECONDS_TO_END_TPL_HOLD) {
            return Case.SECONDS_TO_END_TPL_HOLD;
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
            case ACCRUED_DISTRIBUTION -> specialFieldId.value(SpecialFieldId.ACCRUED_DISTRIBUTION);
            case ACCRUED_FUNDING -> specialFieldId.value(SpecialFieldId.ACCRUED_FUNDING);
            case ANNUALIZATION_FACTOR -> specialFieldId.value(SpecialFieldId.ANNUALIZATION_FACTOR);
            case TRF_DAYS_TO_MATURITY -> specialFieldId.value(SpecialFieldId.TRF_DAYS_TO_MATURITY);
            case SECONDS_TO_END_TPL_HOLD -> specialFieldId.value(SpecialFieldId.SECONDS_TO_END_TPL_HOLD);
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
     * Returns the AccruedDistribution case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AccruedDistribution accruedDistribution() {
        return accruedDistribution;
    }

    /**
     * Returns the AccruedFunding case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AccruedFunding accruedFunding() {
        return accruedFunding;
    }

    /**
     * Returns the AnnualizationFactor case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AnnualizationFactor annualizationFactor() {
        return annualizationFactor;
    }

    /**
     * Returns the TrfDaysToMaturity case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TrfDaysToMaturity trfDaysToMaturity() {
        return trfDaysToMaturity;
    }

    /**
     * Returns the SecondsToEndTplHold case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SecondsToEndTplHold secondsToEndTplHold() {
        return secondsToEndTplHold;
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
            case ACCRUED_DISTRIBUTION -> accruedDistribution;
            case ACCRUED_FUNDING -> accruedFunding;
            case ANNUALIZATION_FACTOR -> annualizationFactor;
            case TRF_DAYS_TO_MATURITY -> trfDaysToMaturity;
            case SECONDS_TO_END_TPL_HOLD -> secondsToEndTplHold;
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
        accruedDistribution.clear();
        accruedFunding.clear();
        annualizationFactor.clear();
        trfDaysToMaturity.clear();
        secondsToEndTplHold.clear();
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
