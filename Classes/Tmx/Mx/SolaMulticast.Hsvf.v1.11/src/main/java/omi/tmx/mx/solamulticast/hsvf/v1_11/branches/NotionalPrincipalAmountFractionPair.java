package omi.tmx.mx.solamulticast.hsvf.v1_11.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_11.enums.NotionalPrincipalAmountFactionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.NotionalPrincipalAmountNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.NotionalPrincipalAmountNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.NotionalPrincipalAmountNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.NotionalPrincipalAmountNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.NotionalPrincipalAmountNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.NotionalPrincipalAmountNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.NotionalPrincipalAmountNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.NotionalPrincipalAmountNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.PrintOptions;

/**
 * The NotionalPrincipalAmountFractionPair branch: one of 8 records of 9 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class NotionalPrincipalAmountFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 9;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "NotionalPrincipalAmountFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when NotionalPrincipalAmountFactionIndicator is "A".
         */
        NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when NotionalPrincipalAmountFactionIndicator is "B".
         */
        NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_TEN_PAIR,
        /**
         * Selected when NotionalPrincipalAmountFactionIndicator is "C".
         */
        NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when NotionalPrincipalAmountFactionIndicator is "D".
         */
        NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when NotionalPrincipalAmountFactionIndicator is "E".
         */
        NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when NotionalPrincipalAmountFactionIndicator is "F".
         */
        NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when NotionalPrincipalAmountFactionIndicator is "G".
         */
        NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        NOTIONAL_PRINCIPAL_AMOUNT_NUMERIC_PAIR
    }

    private final NotionalPrincipalAmountNegativeWholePair notionalPrincipalAmountNegativeWholePair = new NotionalPrincipalAmountNegativeWholePair();
    private final NotionalPrincipalAmountNegativeTenPair notionalPrincipalAmountNegativeTenPair = new NotionalPrincipalAmountNegativeTenPair();
    private final NotionalPrincipalAmountNegativeHundredPair notionalPrincipalAmountNegativeHundredPair = new NotionalPrincipalAmountNegativeHundredPair();
    private final NotionalPrincipalAmountNegativeThousandPair notionalPrincipalAmountNegativeThousandPair = new NotionalPrincipalAmountNegativeThousandPair();
    private final NotionalPrincipalAmountNegativeTenThousandPair notionalPrincipalAmountNegativeTenThousandPair = new NotionalPrincipalAmountNegativeTenThousandPair();
    private final NotionalPrincipalAmountNegativeHundredThousandPair notionalPrincipalAmountNegativeHundredThousandPair = new NotionalPrincipalAmountNegativeHundredThousandPair();
    private final NotionalPrincipalAmountNegativeMillionPair notionalPrincipalAmountNegativeMillionPair = new NotionalPrincipalAmountNegativeMillionPair();
    private final NotionalPrincipalAmountNumericPair notionalPrincipalAmountNumericPair = new NotionalPrincipalAmountNumericPair();
    private Case selected = Case.NOTIONAL_PRINCIPAL_AMOUNT_NUMERIC_PAIR;

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
            case NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_WHOLE_PAIR -> notionalPrincipalAmountNegativeWholePair.notionalPrincipalAmountFactionIndicator().value(NotionalPrincipalAmountFactionIndicator.NEGATIVE_WHOLE);
            case NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_TEN_PAIR -> notionalPrincipalAmountNegativeTenPair.notionalPrincipalAmountFactionIndicator().value(NotionalPrincipalAmountFactionIndicator.NEGATIVE_TEN);
            case NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_HUNDRED_PAIR -> notionalPrincipalAmountNegativeHundredPair.notionalPrincipalAmountFactionIndicator().value(NotionalPrincipalAmountFactionIndicator.NEGATIVE_HUNDRED);
            case NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_THOUSAND_PAIR -> notionalPrincipalAmountNegativeThousandPair.notionalPrincipalAmountFactionIndicator().value(NotionalPrincipalAmountFactionIndicator.NEGATIVE_THOUSAND);
            case NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_TEN_THOUSAND_PAIR -> notionalPrincipalAmountNegativeTenThousandPair.notionalPrincipalAmountFactionIndicator().value(NotionalPrincipalAmountFactionIndicator.NEGATIVE_TEN_THOUSAND);
            case NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_HUNDRED_THOUSAND_PAIR -> notionalPrincipalAmountNegativeHundredThousandPair.notionalPrincipalAmountFactionIndicator().value(NotionalPrincipalAmountFactionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_MILLION_PAIR -> notionalPrincipalAmountNegativeMillionPair.notionalPrincipalAmountFactionIndicator().value(NotionalPrincipalAmountFactionIndicator.NEGATIVE_MILLION);
            case NOTIONAL_PRINCIPAL_AMOUNT_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the NotionalPrincipalAmountNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NotionalPrincipalAmountNegativeWholePair notionalPrincipalAmountNegativeWholePair() {
        return notionalPrincipalAmountNegativeWholePair;
    }

    /**
     * Returns the NotionalPrincipalAmountNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NotionalPrincipalAmountNegativeTenPair notionalPrincipalAmountNegativeTenPair() {
        return notionalPrincipalAmountNegativeTenPair;
    }

    /**
     * Returns the NotionalPrincipalAmountNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NotionalPrincipalAmountNegativeHundredPair notionalPrincipalAmountNegativeHundredPair() {
        return notionalPrincipalAmountNegativeHundredPair;
    }

    /**
     * Returns the NotionalPrincipalAmountNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NotionalPrincipalAmountNegativeThousandPair notionalPrincipalAmountNegativeThousandPair() {
        return notionalPrincipalAmountNegativeThousandPair;
    }

    /**
     * Returns the NotionalPrincipalAmountNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NotionalPrincipalAmountNegativeTenThousandPair notionalPrincipalAmountNegativeTenThousandPair() {
        return notionalPrincipalAmountNegativeTenThousandPair;
    }

    /**
     * Returns the NotionalPrincipalAmountNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NotionalPrincipalAmountNegativeHundredThousandPair notionalPrincipalAmountNegativeHundredThousandPair() {
        return notionalPrincipalAmountNegativeHundredThousandPair;
    }

    /**
     * Returns the NotionalPrincipalAmountNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NotionalPrincipalAmountNegativeMillionPair notionalPrincipalAmountNegativeMillionPair() {
        return notionalPrincipalAmountNegativeMillionPair;
    }

    /**
     * Returns the NotionalPrincipalAmountNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NotionalPrincipalAmountNumericPair notionalPrincipalAmountNumericPair() {
        return notionalPrincipalAmountNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_WHOLE_PAIR -> notionalPrincipalAmountNegativeWholePair;
            case NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_TEN_PAIR -> notionalPrincipalAmountNegativeTenPair;
            case NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_HUNDRED_PAIR -> notionalPrincipalAmountNegativeHundredPair;
            case NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_THOUSAND_PAIR -> notionalPrincipalAmountNegativeThousandPair;
            case NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_TEN_THOUSAND_PAIR -> notionalPrincipalAmountNegativeTenThousandPair;
            case NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_HUNDRED_THOUSAND_PAIR -> notionalPrincipalAmountNegativeHundredThousandPair;
            case NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_MILLION_PAIR -> notionalPrincipalAmountNegativeMillionPair;
            case NOTIONAL_PRINCIPAL_AMOUNT_NUMERIC_PAIR -> notionalPrincipalAmountNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 8] == (byte) 'A') {
            return Case.NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 8] == (byte) 'B') {
            return Case.NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 8] == (byte) 'C') {
            return Case.NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 8] == (byte) 'D') {
            return Case.NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 8] == (byte) 'E') {
            return Case.NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 8] == (byte) 'F') {
            return Case.NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 8] == (byte) 'G') {
            return Case.NOTIONAL_PRINCIPAL_AMOUNT_NEGATIVE_MILLION_PAIR;
        }
        return Case.NOTIONAL_PRINCIPAL_AMOUNT_NUMERIC_PAIR;
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
        notionalPrincipalAmountNegativeWholePair.clear();
        notionalPrincipalAmountNegativeTenPair.clear();
        notionalPrincipalAmountNegativeHundredPair.clear();
        notionalPrincipalAmountNegativeThousandPair.clear();
        notionalPrincipalAmountNegativeTenThousandPair.clear();
        notionalPrincipalAmountNegativeHundredThousandPair.clear();
        notionalPrincipalAmountNegativeMillionPair.clear();
        notionalPrincipalAmountNumericPair.clear();
        selected = Case.NOTIONAL_PRINCIPAL_AMOUNT_NUMERIC_PAIR;
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
        return other instanceof NotionalPrincipalAmountFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof NotionalPrincipalAmountFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
