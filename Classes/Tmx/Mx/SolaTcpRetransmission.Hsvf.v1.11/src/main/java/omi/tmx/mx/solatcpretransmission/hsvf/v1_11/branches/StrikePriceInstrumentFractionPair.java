package omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.enums.StrikePriceFractionIndicator;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.StrikePriceInstrumentNegativeHundredPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.StrikePriceInstrumentNegativeHundredThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.StrikePriceInstrumentNegativeMillionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.StrikePriceInstrumentNegativeTenPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.StrikePriceInstrumentNegativeTenThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.StrikePriceInstrumentNegativeThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.StrikePriceInstrumentNegativeWholePair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.StrikePriceInstrumentNumericPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.GroupEntry;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.PrintOptions;

/**
 * The StrikePriceInstrumentFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class StrikePriceInstrumentFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "StrikePriceInstrumentFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when StrikePriceFractionIndicator is "A".
         */
        STRIKE_PRICE_INSTRUMENT_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when StrikePriceFractionIndicator is "B".
         */
        STRIKE_PRICE_INSTRUMENT_NEGATIVE_TEN_PAIR,
        /**
         * Selected when StrikePriceFractionIndicator is "C".
         */
        STRIKE_PRICE_INSTRUMENT_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when StrikePriceFractionIndicator is "D".
         */
        STRIKE_PRICE_INSTRUMENT_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when StrikePriceFractionIndicator is "E".
         */
        STRIKE_PRICE_INSTRUMENT_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when StrikePriceFractionIndicator is "F".
         */
        STRIKE_PRICE_INSTRUMENT_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when StrikePriceFractionIndicator is "G".
         */
        STRIKE_PRICE_INSTRUMENT_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        STRIKE_PRICE_INSTRUMENT_NUMERIC_PAIR
    }

    private final StrikePriceInstrumentNegativeWholePair strikePriceInstrumentNegativeWholePair = new StrikePriceInstrumentNegativeWholePair();
    private final StrikePriceInstrumentNegativeTenPair strikePriceInstrumentNegativeTenPair = new StrikePriceInstrumentNegativeTenPair();
    private final StrikePriceInstrumentNegativeHundredPair strikePriceInstrumentNegativeHundredPair = new StrikePriceInstrumentNegativeHundredPair();
    private final StrikePriceInstrumentNegativeThousandPair strikePriceInstrumentNegativeThousandPair = new StrikePriceInstrumentNegativeThousandPair();
    private final StrikePriceInstrumentNegativeTenThousandPair strikePriceInstrumentNegativeTenThousandPair = new StrikePriceInstrumentNegativeTenThousandPair();
    private final StrikePriceInstrumentNegativeHundredThousandPair strikePriceInstrumentNegativeHundredThousandPair = new StrikePriceInstrumentNegativeHundredThousandPair();
    private final StrikePriceInstrumentNegativeMillionPair strikePriceInstrumentNegativeMillionPair = new StrikePriceInstrumentNegativeMillionPair();
    private final StrikePriceInstrumentNumericPair strikePriceInstrumentNumericPair = new StrikePriceInstrumentNumericPair();
    private Case selected = Case.STRIKE_PRICE_INSTRUMENT_NUMERIC_PAIR;

    /**
     * Returns the case this branch holds: the one its rules selected, or the one last chosen.
     *
     * @return the selected case
     */
    public Case selected() {
        return selected;
    }

    /**
     * Chooses the case to encode, writing what its rule compares into that case's fields, so its bytes select it again.
     *
     * <p>The default case has no rule of its own, so its fields are left as they are.</p>
     *
     * @param value the case
     */
    public void select(Case value) {
        Objects.requireNonNull(value, "value");
        switch (value) {
            case STRIKE_PRICE_INSTRUMENT_NEGATIVE_WHOLE_PAIR -> strikePriceInstrumentNegativeWholePair.strikePriceFractionIndicator().value(StrikePriceFractionIndicator.NEGATIVE_WHOLE);
            case STRIKE_PRICE_INSTRUMENT_NEGATIVE_TEN_PAIR -> strikePriceInstrumentNegativeTenPair.strikePriceFractionIndicator().value(StrikePriceFractionIndicator.NEGATIVE_TEN);
            case STRIKE_PRICE_INSTRUMENT_NEGATIVE_HUNDRED_PAIR -> strikePriceInstrumentNegativeHundredPair.strikePriceFractionIndicator().value(StrikePriceFractionIndicator.NEGATIVE_HUNDRED);
            case STRIKE_PRICE_INSTRUMENT_NEGATIVE_THOUSAND_PAIR -> strikePriceInstrumentNegativeThousandPair.strikePriceFractionIndicator().value(StrikePriceFractionIndicator.NEGATIVE_THOUSAND);
            case STRIKE_PRICE_INSTRUMENT_NEGATIVE_TEN_THOUSAND_PAIR -> strikePriceInstrumentNegativeTenThousandPair.strikePriceFractionIndicator().value(StrikePriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case STRIKE_PRICE_INSTRUMENT_NEGATIVE_HUNDRED_THOUSAND_PAIR -> strikePriceInstrumentNegativeHundredThousandPair.strikePriceFractionIndicator().value(StrikePriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case STRIKE_PRICE_INSTRUMENT_NEGATIVE_MILLION_PAIR -> strikePriceInstrumentNegativeMillionPair.strikePriceFractionIndicator().value(StrikePriceFractionIndicator.NEGATIVE_MILLION);
            case STRIKE_PRICE_INSTRUMENT_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the StrikePriceInstrumentNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StrikePriceInstrumentNegativeWholePair strikePriceInstrumentNegativeWholePair() {
        return strikePriceInstrumentNegativeWholePair;
    }

    /**
     * Returns the StrikePriceInstrumentNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StrikePriceInstrumentNegativeTenPair strikePriceInstrumentNegativeTenPair() {
        return strikePriceInstrumentNegativeTenPair;
    }

    /**
     * Returns the StrikePriceInstrumentNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StrikePriceInstrumentNegativeHundredPair strikePriceInstrumentNegativeHundredPair() {
        return strikePriceInstrumentNegativeHundredPair;
    }

    /**
     * Returns the StrikePriceInstrumentNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StrikePriceInstrumentNegativeThousandPair strikePriceInstrumentNegativeThousandPair() {
        return strikePriceInstrumentNegativeThousandPair;
    }

    /**
     * Returns the StrikePriceInstrumentNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StrikePriceInstrumentNegativeTenThousandPair strikePriceInstrumentNegativeTenThousandPair() {
        return strikePriceInstrumentNegativeTenThousandPair;
    }

    /**
     * Returns the StrikePriceInstrumentNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StrikePriceInstrumentNegativeHundredThousandPair strikePriceInstrumentNegativeHundredThousandPair() {
        return strikePriceInstrumentNegativeHundredThousandPair;
    }

    /**
     * Returns the StrikePriceInstrumentNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StrikePriceInstrumentNegativeMillionPair strikePriceInstrumentNegativeMillionPair() {
        return strikePriceInstrumentNegativeMillionPair;
    }

    /**
     * Returns the StrikePriceInstrumentNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public StrikePriceInstrumentNumericPair strikePriceInstrumentNumericPair() {
        return strikePriceInstrumentNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case STRIKE_PRICE_INSTRUMENT_NEGATIVE_WHOLE_PAIR -> strikePriceInstrumentNegativeWholePair;
            case STRIKE_PRICE_INSTRUMENT_NEGATIVE_TEN_PAIR -> strikePriceInstrumentNegativeTenPair;
            case STRIKE_PRICE_INSTRUMENT_NEGATIVE_HUNDRED_PAIR -> strikePriceInstrumentNegativeHundredPair;
            case STRIKE_PRICE_INSTRUMENT_NEGATIVE_THOUSAND_PAIR -> strikePriceInstrumentNegativeThousandPair;
            case STRIKE_PRICE_INSTRUMENT_NEGATIVE_TEN_THOUSAND_PAIR -> strikePriceInstrumentNegativeTenThousandPair;
            case STRIKE_PRICE_INSTRUMENT_NEGATIVE_HUNDRED_THOUSAND_PAIR -> strikePriceInstrumentNegativeHundredThousandPair;
            case STRIKE_PRICE_INSTRUMENT_NEGATIVE_MILLION_PAIR -> strikePriceInstrumentNegativeMillionPair;
            case STRIKE_PRICE_INSTRUMENT_NUMERIC_PAIR -> strikePriceInstrumentNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.STRIKE_PRICE_INSTRUMENT_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.STRIKE_PRICE_INSTRUMENT_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.STRIKE_PRICE_INSTRUMENT_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.STRIKE_PRICE_INSTRUMENT_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.STRIKE_PRICE_INSTRUMENT_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.STRIKE_PRICE_INSTRUMENT_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.STRIKE_PRICE_INSTRUMENT_NEGATIVE_MILLION_PAIR;
        }
        return Case.STRIKE_PRICE_INSTRUMENT_NUMERIC_PAIR;
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
        clear();
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return entry().parseFrom(data, offset, end);
        }
        Case chosen = caseFor(data, offset);
        if (chosen == null) {
            return false;
        }
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
        strikePriceInstrumentNegativeWholePair.clear();
        strikePriceInstrumentNegativeTenPair.clear();
        strikePriceInstrumentNegativeHundredPair.clear();
        strikePriceInstrumentNegativeThousandPair.clear();
        strikePriceInstrumentNegativeTenThousandPair.clear();
        strikePriceInstrumentNegativeHundredThousandPair.clear();
        strikePriceInstrumentNegativeMillionPair.clear();
        strikePriceInstrumentNumericPair.clear();
        selected = Case.STRIKE_PRICE_INSTRUMENT_NUMERIC_PAIR;
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
        return other instanceof StrikePriceInstrumentFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof StrikePriceInstrumentFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
