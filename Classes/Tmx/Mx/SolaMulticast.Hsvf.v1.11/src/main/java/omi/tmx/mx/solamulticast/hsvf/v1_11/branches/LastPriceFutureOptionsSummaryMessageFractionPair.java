package omi.tmx.mx.solamulticast.hsvf.v1_11.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_11.enums.LastPriceFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.LastPriceFutureOptionsSummaryMessageNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.LastPriceFutureOptionsSummaryMessageNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.LastPriceFutureOptionsSummaryMessageNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.LastPriceFutureOptionsSummaryMessageNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.LastPriceFutureOptionsSummaryMessageNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.LastPriceFutureOptionsSummaryMessageNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.LastPriceFutureOptionsSummaryMessageNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.LastPriceFutureOptionsSummaryMessageNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.PrintOptions;

/**
 * The LastPriceFutureOptionsSummaryMessageFractionPair branch: one of 8 records of 7 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class LastPriceFutureOptionsSummaryMessageFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 7;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "LastPriceFutureOptionsSummaryMessageFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when LastPriceFractionIndicator is "A".
         */
        LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when LastPriceFractionIndicator is "B".
         */
        LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when LastPriceFractionIndicator is "C".
         */
        LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when LastPriceFractionIndicator is "D".
         */
        LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when LastPriceFractionIndicator is "E".
         */
        LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when LastPriceFractionIndicator is "F".
         */
        LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when LastPriceFractionIndicator is "G".
         */
        LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NUMERIC_PAIR
    }

    private final LastPriceFutureOptionsSummaryMessageNegativeWholePair lastPriceFutureOptionsSummaryMessageNegativeWholePair = new LastPriceFutureOptionsSummaryMessageNegativeWholePair();
    private final LastPriceFutureOptionsSummaryMessageNegativeTenPair lastPriceFutureOptionsSummaryMessageNegativeTenPair = new LastPriceFutureOptionsSummaryMessageNegativeTenPair();
    private final LastPriceFutureOptionsSummaryMessageNegativeHundredPair lastPriceFutureOptionsSummaryMessageNegativeHundredPair = new LastPriceFutureOptionsSummaryMessageNegativeHundredPair();
    private final LastPriceFutureOptionsSummaryMessageNegativeThousandPair lastPriceFutureOptionsSummaryMessageNegativeThousandPair = new LastPriceFutureOptionsSummaryMessageNegativeThousandPair();
    private final LastPriceFutureOptionsSummaryMessageNegativeTenThousandPair lastPriceFutureOptionsSummaryMessageNegativeTenThousandPair = new LastPriceFutureOptionsSummaryMessageNegativeTenThousandPair();
    private final LastPriceFutureOptionsSummaryMessageNegativeHundredThousandPair lastPriceFutureOptionsSummaryMessageNegativeHundredThousandPair = new LastPriceFutureOptionsSummaryMessageNegativeHundredThousandPair();
    private final LastPriceFutureOptionsSummaryMessageNegativeMillionPair lastPriceFutureOptionsSummaryMessageNegativeMillionPair = new LastPriceFutureOptionsSummaryMessageNegativeMillionPair();
    private final LastPriceFutureOptionsSummaryMessageNumericPair lastPriceFutureOptionsSummaryMessageNumericPair = new LastPriceFutureOptionsSummaryMessageNumericPair();
    private Case selected = Case.LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NUMERIC_PAIR;

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
            case LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_WHOLE_PAIR -> lastPriceFutureOptionsSummaryMessageNegativeWholePair.lastPriceFractionIndicator().value(LastPriceFractionIndicator.NEGATIVE_WHOLE);
            case LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_TEN_PAIR -> lastPriceFutureOptionsSummaryMessageNegativeTenPair.lastPriceFractionIndicator().value(LastPriceFractionIndicator.NEGATIVE_TEN);
            case LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_PAIR -> lastPriceFutureOptionsSummaryMessageNegativeHundredPair.lastPriceFractionIndicator().value(LastPriceFractionIndicator.NEGATIVE_HUNDRED);
            case LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_THOUSAND_PAIR -> lastPriceFutureOptionsSummaryMessageNegativeThousandPair.lastPriceFractionIndicator().value(LastPriceFractionIndicator.NEGATIVE_THOUSAND);
            case LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR -> lastPriceFutureOptionsSummaryMessageNegativeTenThousandPair.lastPriceFractionIndicator().value(LastPriceFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> lastPriceFutureOptionsSummaryMessageNegativeHundredThousandPair.lastPriceFractionIndicator().value(LastPriceFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_MILLION_PAIR -> lastPriceFutureOptionsSummaryMessageNegativeMillionPair.lastPriceFractionIndicator().value(LastPriceFractionIndicator.NEGATIVE_MILLION);
            case LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the LastPriceFutureOptionsSummaryMessageNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LastPriceFutureOptionsSummaryMessageNegativeWholePair lastPriceFutureOptionsSummaryMessageNegativeWholePair() {
        return lastPriceFutureOptionsSummaryMessageNegativeWholePair;
    }

    /**
     * Returns the LastPriceFutureOptionsSummaryMessageNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LastPriceFutureOptionsSummaryMessageNegativeTenPair lastPriceFutureOptionsSummaryMessageNegativeTenPair() {
        return lastPriceFutureOptionsSummaryMessageNegativeTenPair;
    }

    /**
     * Returns the LastPriceFutureOptionsSummaryMessageNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LastPriceFutureOptionsSummaryMessageNegativeHundredPair lastPriceFutureOptionsSummaryMessageNegativeHundredPair() {
        return lastPriceFutureOptionsSummaryMessageNegativeHundredPair;
    }

    /**
     * Returns the LastPriceFutureOptionsSummaryMessageNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LastPriceFutureOptionsSummaryMessageNegativeThousandPair lastPriceFutureOptionsSummaryMessageNegativeThousandPair() {
        return lastPriceFutureOptionsSummaryMessageNegativeThousandPair;
    }

    /**
     * Returns the LastPriceFutureOptionsSummaryMessageNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LastPriceFutureOptionsSummaryMessageNegativeTenThousandPair lastPriceFutureOptionsSummaryMessageNegativeTenThousandPair() {
        return lastPriceFutureOptionsSummaryMessageNegativeTenThousandPair;
    }

    /**
     * Returns the LastPriceFutureOptionsSummaryMessageNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LastPriceFutureOptionsSummaryMessageNegativeHundredThousandPair lastPriceFutureOptionsSummaryMessageNegativeHundredThousandPair() {
        return lastPriceFutureOptionsSummaryMessageNegativeHundredThousandPair;
    }

    /**
     * Returns the LastPriceFutureOptionsSummaryMessageNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LastPriceFutureOptionsSummaryMessageNegativeMillionPair lastPriceFutureOptionsSummaryMessageNegativeMillionPair() {
        return lastPriceFutureOptionsSummaryMessageNegativeMillionPair;
    }

    /**
     * Returns the LastPriceFutureOptionsSummaryMessageNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LastPriceFutureOptionsSummaryMessageNumericPair lastPriceFutureOptionsSummaryMessageNumericPair() {
        return lastPriceFutureOptionsSummaryMessageNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_WHOLE_PAIR -> lastPriceFutureOptionsSummaryMessageNegativeWholePair;
            case LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_TEN_PAIR -> lastPriceFutureOptionsSummaryMessageNegativeTenPair;
            case LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_PAIR -> lastPriceFutureOptionsSummaryMessageNegativeHundredPair;
            case LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_THOUSAND_PAIR -> lastPriceFutureOptionsSummaryMessageNegativeThousandPair;
            case LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR -> lastPriceFutureOptionsSummaryMessageNegativeTenThousandPair;
            case LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> lastPriceFutureOptionsSummaryMessageNegativeHundredThousandPair;
            case LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_MILLION_PAIR -> lastPriceFutureOptionsSummaryMessageNegativeMillionPair;
            case LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NUMERIC_PAIR -> lastPriceFutureOptionsSummaryMessageNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 6] == (byte) 'A') {
            return Case.LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 6] == (byte) 'B') {
            return Case.LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 6] == (byte) 'C') {
            return Case.LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 6] == (byte) 'D') {
            return Case.LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'E') {
            return Case.LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'F') {
            return Case.LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'G') {
            return Case.LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NEGATIVE_MILLION_PAIR;
        }
        return Case.LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NUMERIC_PAIR;
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
        lastPriceFutureOptionsSummaryMessageNegativeWholePair.clear();
        lastPriceFutureOptionsSummaryMessageNegativeTenPair.clear();
        lastPriceFutureOptionsSummaryMessageNegativeHundredPair.clear();
        lastPriceFutureOptionsSummaryMessageNegativeThousandPair.clear();
        lastPriceFutureOptionsSummaryMessageNegativeTenThousandPair.clear();
        lastPriceFutureOptionsSummaryMessageNegativeHundredThousandPair.clear();
        lastPriceFutureOptionsSummaryMessageNegativeMillionPair.clear();
        lastPriceFutureOptionsSummaryMessageNumericPair.clear();
        selected = Case.LAST_PRICE_FUTURE_OPTIONS_SUMMARY_MESSAGE_NUMERIC_PAIR;
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
        return other instanceof LastPriceFutureOptionsSummaryMessageFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof LastPriceFutureOptionsSummaryMessageFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
