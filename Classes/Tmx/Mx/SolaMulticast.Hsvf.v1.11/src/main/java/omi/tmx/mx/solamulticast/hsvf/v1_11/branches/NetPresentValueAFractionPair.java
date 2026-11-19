package omi.tmx.mx.solamulticast.hsvf.v1_11.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_11.enums.NetPresentValueFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.NetPresentValueANegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.NetPresentValueANegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.NetPresentValueANegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.NetPresentValueANegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.NetPresentValueANegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.NetPresentValueANegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.NetPresentValueANegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.structs.NetPresentValueANumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.PrintOptions;

/**
 * The NetPresentValueAFractionPair branch: one of 8 records of 12 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class NetPresentValueAFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 12;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "NetPresentValueAFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when NetPresentValueFractionIndicator is "A".
         */
        NET_PRESENT_VALUE_A_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when NetPresentValueFractionIndicator is "B".
         */
        NET_PRESENT_VALUE_A_NEGATIVE_TEN_PAIR,
        /**
         * Selected when NetPresentValueFractionIndicator is "C".
         */
        NET_PRESENT_VALUE_A_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when NetPresentValueFractionIndicator is "D".
         */
        NET_PRESENT_VALUE_A_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when NetPresentValueFractionIndicator is "E".
         */
        NET_PRESENT_VALUE_A_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when NetPresentValueFractionIndicator is "F".
         */
        NET_PRESENT_VALUE_A_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when NetPresentValueFractionIndicator is "G".
         */
        NET_PRESENT_VALUE_A_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        NET_PRESENT_VALUE_A_NUMERIC_PAIR
    }

    private final NetPresentValueANegativeWholePair netPresentValueANegativeWholePair = new NetPresentValueANegativeWholePair();
    private final NetPresentValueANegativeTenPair netPresentValueANegativeTenPair = new NetPresentValueANegativeTenPair();
    private final NetPresentValueANegativeHundredPair netPresentValueANegativeHundredPair = new NetPresentValueANegativeHundredPair();
    private final NetPresentValueANegativeThousandPair netPresentValueANegativeThousandPair = new NetPresentValueANegativeThousandPair();
    private final NetPresentValueANegativeTenThousandPair netPresentValueANegativeTenThousandPair = new NetPresentValueANegativeTenThousandPair();
    private final NetPresentValueANegativeHundredThousandPair netPresentValueANegativeHundredThousandPair = new NetPresentValueANegativeHundredThousandPair();
    private final NetPresentValueANegativeMillionPair netPresentValueANegativeMillionPair = new NetPresentValueANegativeMillionPair();
    private final NetPresentValueANumericPair netPresentValueANumericPair = new NetPresentValueANumericPair();
    private Case selected = Case.NET_PRESENT_VALUE_A_NUMERIC_PAIR;

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
            case NET_PRESENT_VALUE_A_NEGATIVE_WHOLE_PAIR -> netPresentValueANegativeWholePair.netPresentValueFractionIndicator().value(NetPresentValueFractionIndicator.NEGATIVE_WHOLE);
            case NET_PRESENT_VALUE_A_NEGATIVE_TEN_PAIR -> netPresentValueANegativeTenPair.netPresentValueFractionIndicator().value(NetPresentValueFractionIndicator.NEGATIVE_TEN);
            case NET_PRESENT_VALUE_A_NEGATIVE_HUNDRED_PAIR -> netPresentValueANegativeHundredPair.netPresentValueFractionIndicator().value(NetPresentValueFractionIndicator.NEGATIVE_HUNDRED);
            case NET_PRESENT_VALUE_A_NEGATIVE_THOUSAND_PAIR -> netPresentValueANegativeThousandPair.netPresentValueFractionIndicator().value(NetPresentValueFractionIndicator.NEGATIVE_THOUSAND);
            case NET_PRESENT_VALUE_A_NEGATIVE_TEN_THOUSAND_PAIR -> netPresentValueANegativeTenThousandPair.netPresentValueFractionIndicator().value(NetPresentValueFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case NET_PRESENT_VALUE_A_NEGATIVE_HUNDRED_THOUSAND_PAIR -> netPresentValueANegativeHundredThousandPair.netPresentValueFractionIndicator().value(NetPresentValueFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case NET_PRESENT_VALUE_A_NEGATIVE_MILLION_PAIR -> netPresentValueANegativeMillionPair.netPresentValueFractionIndicator().value(NetPresentValueFractionIndicator.NEGATIVE_MILLION);
            case NET_PRESENT_VALUE_A_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the NetPresentValueANegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetPresentValueANegativeWholePair netPresentValueANegativeWholePair() {
        return netPresentValueANegativeWholePair;
    }

    /**
     * Returns the NetPresentValueANegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetPresentValueANegativeTenPair netPresentValueANegativeTenPair() {
        return netPresentValueANegativeTenPair;
    }

    /**
     * Returns the NetPresentValueANegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetPresentValueANegativeHundredPair netPresentValueANegativeHundredPair() {
        return netPresentValueANegativeHundredPair;
    }

    /**
     * Returns the NetPresentValueANegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetPresentValueANegativeThousandPair netPresentValueANegativeThousandPair() {
        return netPresentValueANegativeThousandPair;
    }

    /**
     * Returns the NetPresentValueANegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetPresentValueANegativeTenThousandPair netPresentValueANegativeTenThousandPair() {
        return netPresentValueANegativeTenThousandPair;
    }

    /**
     * Returns the NetPresentValueANegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetPresentValueANegativeHundredThousandPair netPresentValueANegativeHundredThousandPair() {
        return netPresentValueANegativeHundredThousandPair;
    }

    /**
     * Returns the NetPresentValueANegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetPresentValueANegativeMillionPair netPresentValueANegativeMillionPair() {
        return netPresentValueANegativeMillionPair;
    }

    /**
     * Returns the NetPresentValueANumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetPresentValueANumericPair netPresentValueANumericPair() {
        return netPresentValueANumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case NET_PRESENT_VALUE_A_NEGATIVE_WHOLE_PAIR -> netPresentValueANegativeWholePair;
            case NET_PRESENT_VALUE_A_NEGATIVE_TEN_PAIR -> netPresentValueANegativeTenPair;
            case NET_PRESENT_VALUE_A_NEGATIVE_HUNDRED_PAIR -> netPresentValueANegativeHundredPair;
            case NET_PRESENT_VALUE_A_NEGATIVE_THOUSAND_PAIR -> netPresentValueANegativeThousandPair;
            case NET_PRESENT_VALUE_A_NEGATIVE_TEN_THOUSAND_PAIR -> netPresentValueANegativeTenThousandPair;
            case NET_PRESENT_VALUE_A_NEGATIVE_HUNDRED_THOUSAND_PAIR -> netPresentValueANegativeHundredThousandPair;
            case NET_PRESENT_VALUE_A_NEGATIVE_MILLION_PAIR -> netPresentValueANegativeMillionPair;
            case NET_PRESENT_VALUE_A_NUMERIC_PAIR -> netPresentValueANumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 11] == (byte) 'A') {
            return Case.NET_PRESENT_VALUE_A_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 11] == (byte) 'B') {
            return Case.NET_PRESENT_VALUE_A_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 11] == (byte) 'C') {
            return Case.NET_PRESENT_VALUE_A_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 11] == (byte) 'D') {
            return Case.NET_PRESENT_VALUE_A_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 11] == (byte) 'E') {
            return Case.NET_PRESENT_VALUE_A_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 11] == (byte) 'F') {
            return Case.NET_PRESENT_VALUE_A_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 11] == (byte) 'G') {
            return Case.NET_PRESENT_VALUE_A_NEGATIVE_MILLION_PAIR;
        }
        return Case.NET_PRESENT_VALUE_A_NUMERIC_PAIR;
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
        netPresentValueANegativeWholePair.clear();
        netPresentValueANegativeTenPair.clear();
        netPresentValueANegativeHundredPair.clear();
        netPresentValueANegativeThousandPair.clear();
        netPresentValueANegativeTenThousandPair.clear();
        netPresentValueANegativeHundredThousandPair.clear();
        netPresentValueANegativeMillionPair.clear();
        netPresentValueANumericPair.clear();
        selected = Case.NET_PRESENT_VALUE_A_NUMERIC_PAIR;
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
        return other instanceof NetPresentValueAFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof NetPresentValueAFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
