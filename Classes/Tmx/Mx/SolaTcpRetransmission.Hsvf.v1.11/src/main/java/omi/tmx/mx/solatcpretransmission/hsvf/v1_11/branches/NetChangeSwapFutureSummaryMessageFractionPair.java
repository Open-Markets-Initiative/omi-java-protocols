package omi.tmx.mx.solatcpretransmission.hsvf.v1_11.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.enums.NetChangeFractionIndicator;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.NetChangeSwapFutureSummaryMessageNegativeHundredPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.NetChangeSwapFutureSummaryMessageNegativeHundredThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.NetChangeSwapFutureSummaryMessageNegativeMillionPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.NetChangeSwapFutureSummaryMessageNegativeTenPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.NetChangeSwapFutureSummaryMessageNegativeTenThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.NetChangeSwapFutureSummaryMessageNegativeThousandPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.NetChangeSwapFutureSummaryMessageNegativeWholePair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.structs.NetChangeSwapFutureSummaryMessageNumericPair;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.Field;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.GroupEntry;
import omi.tmx.mx.solatcpretransmission.hsvf.v1_11.types.PrintOptions;

/**
 * The NetChangeSwapFutureSummaryMessageFractionPair branch: one of 8 records of 7 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class NetChangeSwapFutureSummaryMessageFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 7;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "NetChangeSwapFutureSummaryMessageFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when NetChangeFractionIndicator is "A".
         */
        NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "B".
         */
        NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "C".
         */
        NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "D".
         */
        NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "E".
         */
        NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "F".
         */
        NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "G".
         */
        NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NUMERIC_PAIR
    }

    private final NetChangeSwapFutureSummaryMessageNegativeWholePair netChangeSwapFutureSummaryMessageNegativeWholePair = new NetChangeSwapFutureSummaryMessageNegativeWholePair();
    private final NetChangeSwapFutureSummaryMessageNegativeTenPair netChangeSwapFutureSummaryMessageNegativeTenPair = new NetChangeSwapFutureSummaryMessageNegativeTenPair();
    private final NetChangeSwapFutureSummaryMessageNegativeHundredPair netChangeSwapFutureSummaryMessageNegativeHundredPair = new NetChangeSwapFutureSummaryMessageNegativeHundredPair();
    private final NetChangeSwapFutureSummaryMessageNegativeThousandPair netChangeSwapFutureSummaryMessageNegativeThousandPair = new NetChangeSwapFutureSummaryMessageNegativeThousandPair();
    private final NetChangeSwapFutureSummaryMessageNegativeTenThousandPair netChangeSwapFutureSummaryMessageNegativeTenThousandPair = new NetChangeSwapFutureSummaryMessageNegativeTenThousandPair();
    private final NetChangeSwapFutureSummaryMessageNegativeHundredThousandPair netChangeSwapFutureSummaryMessageNegativeHundredThousandPair = new NetChangeSwapFutureSummaryMessageNegativeHundredThousandPair();
    private final NetChangeSwapFutureSummaryMessageNegativeMillionPair netChangeSwapFutureSummaryMessageNegativeMillionPair = new NetChangeSwapFutureSummaryMessageNegativeMillionPair();
    private final NetChangeSwapFutureSummaryMessageNumericPair netChangeSwapFutureSummaryMessageNumericPair = new NetChangeSwapFutureSummaryMessageNumericPair();
    private Case selected = Case.NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NUMERIC_PAIR;

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
            case NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_WHOLE_PAIR -> netChangeSwapFutureSummaryMessageNegativeWholePair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_WHOLE);
            case NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_TEN_PAIR -> netChangeSwapFutureSummaryMessageNegativeTenPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_TEN);
            case NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_PAIR -> netChangeSwapFutureSummaryMessageNegativeHundredPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_HUNDRED);
            case NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_THOUSAND_PAIR -> netChangeSwapFutureSummaryMessageNegativeThousandPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_THOUSAND);
            case NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR -> netChangeSwapFutureSummaryMessageNegativeTenThousandPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> netChangeSwapFutureSummaryMessageNegativeHundredThousandPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_MILLION_PAIR -> netChangeSwapFutureSummaryMessageNegativeMillionPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_MILLION);
            case NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the NetChangeSwapFutureSummaryMessageNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeSwapFutureSummaryMessageNegativeWholePair netChangeSwapFutureSummaryMessageNegativeWholePair() {
        return netChangeSwapFutureSummaryMessageNegativeWholePair;
    }

    /**
     * Returns the NetChangeSwapFutureSummaryMessageNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeSwapFutureSummaryMessageNegativeTenPair netChangeSwapFutureSummaryMessageNegativeTenPair() {
        return netChangeSwapFutureSummaryMessageNegativeTenPair;
    }

    /**
     * Returns the NetChangeSwapFutureSummaryMessageNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeSwapFutureSummaryMessageNegativeHundredPair netChangeSwapFutureSummaryMessageNegativeHundredPair() {
        return netChangeSwapFutureSummaryMessageNegativeHundredPair;
    }

    /**
     * Returns the NetChangeSwapFutureSummaryMessageNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeSwapFutureSummaryMessageNegativeThousandPair netChangeSwapFutureSummaryMessageNegativeThousandPair() {
        return netChangeSwapFutureSummaryMessageNegativeThousandPair;
    }

    /**
     * Returns the NetChangeSwapFutureSummaryMessageNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeSwapFutureSummaryMessageNegativeTenThousandPair netChangeSwapFutureSummaryMessageNegativeTenThousandPair() {
        return netChangeSwapFutureSummaryMessageNegativeTenThousandPair;
    }

    /**
     * Returns the NetChangeSwapFutureSummaryMessageNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeSwapFutureSummaryMessageNegativeHundredThousandPair netChangeSwapFutureSummaryMessageNegativeHundredThousandPair() {
        return netChangeSwapFutureSummaryMessageNegativeHundredThousandPair;
    }

    /**
     * Returns the NetChangeSwapFutureSummaryMessageNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeSwapFutureSummaryMessageNegativeMillionPair netChangeSwapFutureSummaryMessageNegativeMillionPair() {
        return netChangeSwapFutureSummaryMessageNegativeMillionPair;
    }

    /**
     * Returns the NetChangeSwapFutureSummaryMessageNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeSwapFutureSummaryMessageNumericPair netChangeSwapFutureSummaryMessageNumericPair() {
        return netChangeSwapFutureSummaryMessageNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_WHOLE_PAIR -> netChangeSwapFutureSummaryMessageNegativeWholePair;
            case NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_TEN_PAIR -> netChangeSwapFutureSummaryMessageNegativeTenPair;
            case NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_PAIR -> netChangeSwapFutureSummaryMessageNegativeHundredPair;
            case NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_THOUSAND_PAIR -> netChangeSwapFutureSummaryMessageNegativeThousandPair;
            case NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR -> netChangeSwapFutureSummaryMessageNegativeTenThousandPair;
            case NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> netChangeSwapFutureSummaryMessageNegativeHundredThousandPair;
            case NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_MILLION_PAIR -> netChangeSwapFutureSummaryMessageNegativeMillionPair;
            case NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NUMERIC_PAIR -> netChangeSwapFutureSummaryMessageNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 6] == (byte) 'A') {
            return Case.NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 6] == (byte) 'B') {
            return Case.NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 6] == (byte) 'C') {
            return Case.NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 6] == (byte) 'D') {
            return Case.NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'E') {
            return Case.NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'F') {
            return Case.NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 6] == (byte) 'G') {
            return Case.NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NEGATIVE_MILLION_PAIR;
        }
        return Case.NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NUMERIC_PAIR;
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
        netChangeSwapFutureSummaryMessageNegativeWholePair.clear();
        netChangeSwapFutureSummaryMessageNegativeTenPair.clear();
        netChangeSwapFutureSummaryMessageNegativeHundredPair.clear();
        netChangeSwapFutureSummaryMessageNegativeThousandPair.clear();
        netChangeSwapFutureSummaryMessageNegativeTenThousandPair.clear();
        netChangeSwapFutureSummaryMessageNegativeHundredThousandPair.clear();
        netChangeSwapFutureSummaryMessageNegativeMillionPair.clear();
        netChangeSwapFutureSummaryMessageNumericPair.clear();
        selected = Case.NET_CHANGE_SWAP_FUTURE_SUMMARY_MESSAGE_NUMERIC_PAIR;
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
        return other instanceof NetChangeSwapFutureSummaryMessageFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof NetChangeSwapFutureSummaryMessageFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
