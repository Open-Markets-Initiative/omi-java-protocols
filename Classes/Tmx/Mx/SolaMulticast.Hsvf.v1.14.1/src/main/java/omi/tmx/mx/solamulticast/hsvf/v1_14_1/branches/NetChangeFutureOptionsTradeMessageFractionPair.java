package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.NetChangeFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeFutureOptionsTradeMessageNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeFutureOptionsTradeMessageNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeFutureOptionsTradeMessageNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeFutureOptionsTradeMessageNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeFutureOptionsTradeMessageNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeFutureOptionsTradeMessageNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeFutureOptionsTradeMessageNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeFutureOptionsTradeMessageNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The NetChangeFutureOptionsTradeMessageFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class NetChangeFutureOptionsTradeMessageFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "NetChangeFutureOptionsTradeMessageFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when NetChangeFractionIndicator is "A".
         */
        NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "B".
         */
        NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "C".
         */
        NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "D".
         */
        NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "E".
         */
        NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "F".
         */
        NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "G".
         */
        NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NUMERIC_PAIR
    }

    private final NetChangeFutureOptionsTradeMessageNegativeWholePair netChangeFutureOptionsTradeMessageNegativeWholePair = new NetChangeFutureOptionsTradeMessageNegativeWholePair();
    private final NetChangeFutureOptionsTradeMessageNegativeTenPair netChangeFutureOptionsTradeMessageNegativeTenPair = new NetChangeFutureOptionsTradeMessageNegativeTenPair();
    private final NetChangeFutureOptionsTradeMessageNegativeHundredPair netChangeFutureOptionsTradeMessageNegativeHundredPair = new NetChangeFutureOptionsTradeMessageNegativeHundredPair();
    private final NetChangeFutureOptionsTradeMessageNegativeThousandPair netChangeFutureOptionsTradeMessageNegativeThousandPair = new NetChangeFutureOptionsTradeMessageNegativeThousandPair();
    private final NetChangeFutureOptionsTradeMessageNegativeTenThousandPair netChangeFutureOptionsTradeMessageNegativeTenThousandPair = new NetChangeFutureOptionsTradeMessageNegativeTenThousandPair();
    private final NetChangeFutureOptionsTradeMessageNegativeHundredThousandPair netChangeFutureOptionsTradeMessageNegativeHundredThousandPair = new NetChangeFutureOptionsTradeMessageNegativeHundredThousandPair();
    private final NetChangeFutureOptionsTradeMessageNegativeMillionPair netChangeFutureOptionsTradeMessageNegativeMillionPair = new NetChangeFutureOptionsTradeMessageNegativeMillionPair();
    private final NetChangeFutureOptionsTradeMessageNumericPair netChangeFutureOptionsTradeMessageNumericPair = new NetChangeFutureOptionsTradeMessageNumericPair();
    private Case selected = Case.NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NUMERIC_PAIR;

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
            case NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_WHOLE_PAIR -> netChangeFutureOptionsTradeMessageNegativeWholePair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_WHOLE);
            case NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_TEN_PAIR -> netChangeFutureOptionsTradeMessageNegativeTenPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_TEN);
            case NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_HUNDRED_PAIR -> netChangeFutureOptionsTradeMessageNegativeHundredPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_HUNDRED);
            case NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_THOUSAND_PAIR -> netChangeFutureOptionsTradeMessageNegativeThousandPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_THOUSAND);
            case NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR -> netChangeFutureOptionsTradeMessageNegativeTenThousandPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> netChangeFutureOptionsTradeMessageNegativeHundredThousandPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_MILLION_PAIR -> netChangeFutureOptionsTradeMessageNegativeMillionPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_MILLION);
            case NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the NetChangeFutureOptionsTradeMessageNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeFutureOptionsTradeMessageNegativeWholePair netChangeFutureOptionsTradeMessageNegativeWholePair() {
        return netChangeFutureOptionsTradeMessageNegativeWholePair;
    }

    /**
     * Returns the NetChangeFutureOptionsTradeMessageNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeFutureOptionsTradeMessageNegativeTenPair netChangeFutureOptionsTradeMessageNegativeTenPair() {
        return netChangeFutureOptionsTradeMessageNegativeTenPair;
    }

    /**
     * Returns the NetChangeFutureOptionsTradeMessageNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeFutureOptionsTradeMessageNegativeHundredPair netChangeFutureOptionsTradeMessageNegativeHundredPair() {
        return netChangeFutureOptionsTradeMessageNegativeHundredPair;
    }

    /**
     * Returns the NetChangeFutureOptionsTradeMessageNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeFutureOptionsTradeMessageNegativeThousandPair netChangeFutureOptionsTradeMessageNegativeThousandPair() {
        return netChangeFutureOptionsTradeMessageNegativeThousandPair;
    }

    /**
     * Returns the NetChangeFutureOptionsTradeMessageNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeFutureOptionsTradeMessageNegativeTenThousandPair netChangeFutureOptionsTradeMessageNegativeTenThousandPair() {
        return netChangeFutureOptionsTradeMessageNegativeTenThousandPair;
    }

    /**
     * Returns the NetChangeFutureOptionsTradeMessageNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeFutureOptionsTradeMessageNegativeHundredThousandPair netChangeFutureOptionsTradeMessageNegativeHundredThousandPair() {
        return netChangeFutureOptionsTradeMessageNegativeHundredThousandPair;
    }

    /**
     * Returns the NetChangeFutureOptionsTradeMessageNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeFutureOptionsTradeMessageNegativeMillionPair netChangeFutureOptionsTradeMessageNegativeMillionPair() {
        return netChangeFutureOptionsTradeMessageNegativeMillionPair;
    }

    /**
     * Returns the NetChangeFutureOptionsTradeMessageNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeFutureOptionsTradeMessageNumericPair netChangeFutureOptionsTradeMessageNumericPair() {
        return netChangeFutureOptionsTradeMessageNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_WHOLE_PAIR -> netChangeFutureOptionsTradeMessageNegativeWholePair;
            case NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_TEN_PAIR -> netChangeFutureOptionsTradeMessageNegativeTenPair;
            case NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_HUNDRED_PAIR -> netChangeFutureOptionsTradeMessageNegativeHundredPair;
            case NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_THOUSAND_PAIR -> netChangeFutureOptionsTradeMessageNegativeThousandPair;
            case NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR -> netChangeFutureOptionsTradeMessageNegativeTenThousandPair;
            case NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> netChangeFutureOptionsTradeMessageNegativeHundredThousandPair;
            case NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_MILLION_PAIR -> netChangeFutureOptionsTradeMessageNegativeMillionPair;
            case NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NUMERIC_PAIR -> netChangeFutureOptionsTradeMessageNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NEGATIVE_MILLION_PAIR;
        }
        return Case.NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NUMERIC_PAIR;
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
        netChangeFutureOptionsTradeMessageNegativeWholePair.clear();
        netChangeFutureOptionsTradeMessageNegativeTenPair.clear();
        netChangeFutureOptionsTradeMessageNegativeHundredPair.clear();
        netChangeFutureOptionsTradeMessageNegativeThousandPair.clear();
        netChangeFutureOptionsTradeMessageNegativeTenThousandPair.clear();
        netChangeFutureOptionsTradeMessageNegativeHundredThousandPair.clear();
        netChangeFutureOptionsTradeMessageNegativeMillionPair.clear();
        netChangeFutureOptionsTradeMessageNumericPair.clear();
        selected = Case.NET_CHANGE_FUTURE_OPTIONS_TRADE_MESSAGE_NUMERIC_PAIR;
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
        return other instanceof NetChangeFutureOptionsTradeMessageFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof NetChangeFutureOptionsTradeMessageFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
