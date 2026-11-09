package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.NetChangeFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeStrategySummaryMessageNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeStrategySummaryMessageNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeStrategySummaryMessageNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeStrategySummaryMessageNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeStrategySummaryMessageNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeStrategySummaryMessageNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeStrategySummaryMessageNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeStrategySummaryMessageNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The NetChangeStrategySummaryMessageFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class NetChangeStrategySummaryMessageFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "NetChangeStrategySummaryMessageFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when NetChangeFractionIndicator is "A".
         */
        NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "B".
         */
        NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "C".
         */
        NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "D".
         */
        NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "E".
         */
        NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "F".
         */
        NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "G".
         */
        NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NUMERIC_PAIR
    }

    private final NetChangeStrategySummaryMessageNegativeWholePair netChangeStrategySummaryMessageNegativeWholePair = new NetChangeStrategySummaryMessageNegativeWholePair();
    private final NetChangeStrategySummaryMessageNegativeTenPair netChangeStrategySummaryMessageNegativeTenPair = new NetChangeStrategySummaryMessageNegativeTenPair();
    private final NetChangeStrategySummaryMessageNegativeHundredPair netChangeStrategySummaryMessageNegativeHundredPair = new NetChangeStrategySummaryMessageNegativeHundredPair();
    private final NetChangeStrategySummaryMessageNegativeThousandPair netChangeStrategySummaryMessageNegativeThousandPair = new NetChangeStrategySummaryMessageNegativeThousandPair();
    private final NetChangeStrategySummaryMessageNegativeTenThousandPair netChangeStrategySummaryMessageNegativeTenThousandPair = new NetChangeStrategySummaryMessageNegativeTenThousandPair();
    private final NetChangeStrategySummaryMessageNegativeHundredThousandPair netChangeStrategySummaryMessageNegativeHundredThousandPair = new NetChangeStrategySummaryMessageNegativeHundredThousandPair();
    private final NetChangeStrategySummaryMessageNegativeMillionPair netChangeStrategySummaryMessageNegativeMillionPair = new NetChangeStrategySummaryMessageNegativeMillionPair();
    private final NetChangeStrategySummaryMessageNumericPair netChangeStrategySummaryMessageNumericPair = new NetChangeStrategySummaryMessageNumericPair();
    private Case selected = Case.NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NUMERIC_PAIR;

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
            case NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_WHOLE_PAIR -> netChangeStrategySummaryMessageNegativeWholePair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_WHOLE);
            case NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_TEN_PAIR -> netChangeStrategySummaryMessageNegativeTenPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_TEN);
            case NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_PAIR -> netChangeStrategySummaryMessageNegativeHundredPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_HUNDRED);
            case NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_THOUSAND_PAIR -> netChangeStrategySummaryMessageNegativeThousandPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_THOUSAND);
            case NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR -> netChangeStrategySummaryMessageNegativeTenThousandPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> netChangeStrategySummaryMessageNegativeHundredThousandPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_MILLION_PAIR -> netChangeStrategySummaryMessageNegativeMillionPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_MILLION);
            case NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the NetChangeStrategySummaryMessageNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeStrategySummaryMessageNegativeWholePair netChangeStrategySummaryMessageNegativeWholePair() {
        return netChangeStrategySummaryMessageNegativeWholePair;
    }

    /**
     * Returns the NetChangeStrategySummaryMessageNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeStrategySummaryMessageNegativeTenPair netChangeStrategySummaryMessageNegativeTenPair() {
        return netChangeStrategySummaryMessageNegativeTenPair;
    }

    /**
     * Returns the NetChangeStrategySummaryMessageNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeStrategySummaryMessageNegativeHundredPair netChangeStrategySummaryMessageNegativeHundredPair() {
        return netChangeStrategySummaryMessageNegativeHundredPair;
    }

    /**
     * Returns the NetChangeStrategySummaryMessageNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeStrategySummaryMessageNegativeThousandPair netChangeStrategySummaryMessageNegativeThousandPair() {
        return netChangeStrategySummaryMessageNegativeThousandPair;
    }

    /**
     * Returns the NetChangeStrategySummaryMessageNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeStrategySummaryMessageNegativeTenThousandPair netChangeStrategySummaryMessageNegativeTenThousandPair() {
        return netChangeStrategySummaryMessageNegativeTenThousandPair;
    }

    /**
     * Returns the NetChangeStrategySummaryMessageNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeStrategySummaryMessageNegativeHundredThousandPair netChangeStrategySummaryMessageNegativeHundredThousandPair() {
        return netChangeStrategySummaryMessageNegativeHundredThousandPair;
    }

    /**
     * Returns the NetChangeStrategySummaryMessageNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeStrategySummaryMessageNegativeMillionPair netChangeStrategySummaryMessageNegativeMillionPair() {
        return netChangeStrategySummaryMessageNegativeMillionPair;
    }

    /**
     * Returns the NetChangeStrategySummaryMessageNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeStrategySummaryMessageNumericPair netChangeStrategySummaryMessageNumericPair() {
        return netChangeStrategySummaryMessageNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_WHOLE_PAIR -> netChangeStrategySummaryMessageNegativeWholePair;
            case NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_TEN_PAIR -> netChangeStrategySummaryMessageNegativeTenPair;
            case NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_PAIR -> netChangeStrategySummaryMessageNegativeHundredPair;
            case NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_THOUSAND_PAIR -> netChangeStrategySummaryMessageNegativeThousandPair;
            case NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR -> netChangeStrategySummaryMessageNegativeTenThousandPair;
            case NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> netChangeStrategySummaryMessageNegativeHundredThousandPair;
            case NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_MILLION_PAIR -> netChangeStrategySummaryMessageNegativeMillionPair;
            case NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NUMERIC_PAIR -> netChangeStrategySummaryMessageNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NEGATIVE_MILLION_PAIR;
        }
        return Case.NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NUMERIC_PAIR;
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
        netChangeStrategySummaryMessageNegativeWholePair.clear();
        netChangeStrategySummaryMessageNegativeTenPair.clear();
        netChangeStrategySummaryMessageNegativeHundredPair.clear();
        netChangeStrategySummaryMessageNegativeThousandPair.clear();
        netChangeStrategySummaryMessageNegativeTenThousandPair.clear();
        netChangeStrategySummaryMessageNegativeHundredThousandPair.clear();
        netChangeStrategySummaryMessageNegativeMillionPair.clear();
        netChangeStrategySummaryMessageNumericPair.clear();
        selected = Case.NET_CHANGE_STRATEGY_SUMMARY_MESSAGE_NUMERIC_PAIR;
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
        return other instanceof NetChangeStrategySummaryMessageFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof NetChangeStrategySummaryMessageFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
