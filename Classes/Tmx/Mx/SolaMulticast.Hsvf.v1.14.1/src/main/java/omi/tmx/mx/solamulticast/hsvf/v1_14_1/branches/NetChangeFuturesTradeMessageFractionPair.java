package omi.tmx.mx.solamulticast.hsvf.v1_14_1.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.enums.NetChangeFractionIndicator;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeFuturesTradeMessageNegativeHundredPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeFuturesTradeMessageNegativeHundredThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeFuturesTradeMessageNegativeMillionPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeFuturesTradeMessageNegativeTenPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeFuturesTradeMessageNegativeTenThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeFuturesTradeMessageNegativeThousandPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeFuturesTradeMessageNegativeWholePair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.structs.NetChangeFuturesTradeMessageNumericPair;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Field;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.GroupEntry;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.PrintOptions;

/**
 * The NetChangeFuturesTradeMessageFractionPair branch: one of 8 records of 8 bytes, chosen by the text each holds where its rule compares.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class NetChangeFuturesTradeMessageFractionPair implements GroupEntry {

    /**
     * This branch's fixed width on the wire, whichever case it holds.
     */
    public static final int BYTE_LENGTH = 8;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "NetChangeFuturesTradeMessageFractionPair";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when NetChangeFractionIndicator is "A".
         */
        NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_WHOLE_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "B".
         */
        NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_TEN_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "C".
         */
        NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_HUNDRED_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "D".
         */
        NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_THOUSAND_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "E".
         */
        NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "F".
         */
        NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR,
        /**
         * Selected when NetChangeFractionIndicator is "G".
         */
        NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_MILLION_PAIR,
        /**
         * Selected when no other case is.
         */
        NET_CHANGE_FUTURES_TRADE_MESSAGE_NUMERIC_PAIR
    }

    private final NetChangeFuturesTradeMessageNegativeWholePair netChangeFuturesTradeMessageNegativeWholePair = new NetChangeFuturesTradeMessageNegativeWholePair();
    private final NetChangeFuturesTradeMessageNegativeTenPair netChangeFuturesTradeMessageNegativeTenPair = new NetChangeFuturesTradeMessageNegativeTenPair();
    private final NetChangeFuturesTradeMessageNegativeHundredPair netChangeFuturesTradeMessageNegativeHundredPair = new NetChangeFuturesTradeMessageNegativeHundredPair();
    private final NetChangeFuturesTradeMessageNegativeThousandPair netChangeFuturesTradeMessageNegativeThousandPair = new NetChangeFuturesTradeMessageNegativeThousandPair();
    private final NetChangeFuturesTradeMessageNegativeTenThousandPair netChangeFuturesTradeMessageNegativeTenThousandPair = new NetChangeFuturesTradeMessageNegativeTenThousandPair();
    private final NetChangeFuturesTradeMessageNegativeHundredThousandPair netChangeFuturesTradeMessageNegativeHundredThousandPair = new NetChangeFuturesTradeMessageNegativeHundredThousandPair();
    private final NetChangeFuturesTradeMessageNegativeMillionPair netChangeFuturesTradeMessageNegativeMillionPair = new NetChangeFuturesTradeMessageNegativeMillionPair();
    private final NetChangeFuturesTradeMessageNumericPair netChangeFuturesTradeMessageNumericPair = new NetChangeFuturesTradeMessageNumericPair();
    private Case selected = Case.NET_CHANGE_FUTURES_TRADE_MESSAGE_NUMERIC_PAIR;

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
            case NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_WHOLE_PAIR -> netChangeFuturesTradeMessageNegativeWholePair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_WHOLE);
            case NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_TEN_PAIR -> netChangeFuturesTradeMessageNegativeTenPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_TEN);
            case NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_HUNDRED_PAIR -> netChangeFuturesTradeMessageNegativeHundredPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_HUNDRED);
            case NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_THOUSAND_PAIR -> netChangeFuturesTradeMessageNegativeThousandPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_THOUSAND);
            case NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR -> netChangeFuturesTradeMessageNegativeTenThousandPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_TEN_THOUSAND);
            case NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> netChangeFuturesTradeMessageNegativeHundredThousandPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_HUNDRED_THOUSAND);
            case NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_MILLION_PAIR -> netChangeFuturesTradeMessageNegativeMillionPair.netChangeFractionIndicator().value(NetChangeFractionIndicator.NEGATIVE_MILLION);
            case NET_CHANGE_FUTURES_TRADE_MESSAGE_NUMERIC_PAIR -> {
            }
        }
        selected = value;
    }

    /**
     * Returns the NetChangeFuturesTradeMessageNegativeWholePair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeFuturesTradeMessageNegativeWholePair netChangeFuturesTradeMessageNegativeWholePair() {
        return netChangeFuturesTradeMessageNegativeWholePair;
    }

    /**
     * Returns the NetChangeFuturesTradeMessageNegativeTenPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeFuturesTradeMessageNegativeTenPair netChangeFuturesTradeMessageNegativeTenPair() {
        return netChangeFuturesTradeMessageNegativeTenPair;
    }

    /**
     * Returns the NetChangeFuturesTradeMessageNegativeHundredPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeFuturesTradeMessageNegativeHundredPair netChangeFuturesTradeMessageNegativeHundredPair() {
        return netChangeFuturesTradeMessageNegativeHundredPair;
    }

    /**
     * Returns the NetChangeFuturesTradeMessageNegativeThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeFuturesTradeMessageNegativeThousandPair netChangeFuturesTradeMessageNegativeThousandPair() {
        return netChangeFuturesTradeMessageNegativeThousandPair;
    }

    /**
     * Returns the NetChangeFuturesTradeMessageNegativeTenThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeFuturesTradeMessageNegativeTenThousandPair netChangeFuturesTradeMessageNegativeTenThousandPair() {
        return netChangeFuturesTradeMessageNegativeTenThousandPair;
    }

    /**
     * Returns the NetChangeFuturesTradeMessageNegativeHundredThousandPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeFuturesTradeMessageNegativeHundredThousandPair netChangeFuturesTradeMessageNegativeHundredThousandPair() {
        return netChangeFuturesTradeMessageNegativeHundredThousandPair;
    }

    /**
     * Returns the NetChangeFuturesTradeMessageNegativeMillionPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeFuturesTradeMessageNegativeMillionPair netChangeFuturesTradeMessageNegativeMillionPair() {
        return netChangeFuturesTradeMessageNegativeMillionPair;
    }

    /**
     * Returns the NetChangeFuturesTradeMessageNumericPair case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NetChangeFuturesTradeMessageNumericPair netChangeFuturesTradeMessageNumericPair() {
        return netChangeFuturesTradeMessageNumericPair;
    }

    /**
     * Returns the record of the selected case.
     *
     * @return the selected case's record
     */
    public GroupEntry entry() {
        return switch (selected) {
            case NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_WHOLE_PAIR -> netChangeFuturesTradeMessageNegativeWholePair;
            case NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_TEN_PAIR -> netChangeFuturesTradeMessageNegativeTenPair;
            case NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_HUNDRED_PAIR -> netChangeFuturesTradeMessageNegativeHundredPair;
            case NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_THOUSAND_PAIR -> netChangeFuturesTradeMessageNegativeThousandPair;
            case NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR -> netChangeFuturesTradeMessageNegativeTenThousandPair;
            case NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR -> netChangeFuturesTradeMessageNegativeHundredThousandPair;
            case NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_MILLION_PAIR -> netChangeFuturesTradeMessageNegativeMillionPair;
            case NET_CHANGE_FUTURES_TRADE_MESSAGE_NUMERIC_PAIR -> netChangeFuturesTradeMessageNumericPair;
        };
    }

    private static Case caseFor(byte[] data, int offset) {
        if (data[offset + 7] == (byte) 'A') {
            return Case.NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_WHOLE_PAIR;
        }
        if (data[offset + 7] == (byte) 'B') {
            return Case.NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_TEN_PAIR;
        }
        if (data[offset + 7] == (byte) 'C') {
            return Case.NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_HUNDRED_PAIR;
        }
        if (data[offset + 7] == (byte) 'D') {
            return Case.NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'E') {
            return Case.NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_TEN_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'F') {
            return Case.NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_HUNDRED_THOUSAND_PAIR;
        }
        if (data[offset + 7] == (byte) 'G') {
            return Case.NET_CHANGE_FUTURES_TRADE_MESSAGE_NEGATIVE_MILLION_PAIR;
        }
        return Case.NET_CHANGE_FUTURES_TRADE_MESSAGE_NUMERIC_PAIR;
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
        netChangeFuturesTradeMessageNegativeWholePair.clear();
        netChangeFuturesTradeMessageNegativeTenPair.clear();
        netChangeFuturesTradeMessageNegativeHundredPair.clear();
        netChangeFuturesTradeMessageNegativeThousandPair.clear();
        netChangeFuturesTradeMessageNegativeTenThousandPair.clear();
        netChangeFuturesTradeMessageNegativeHundredThousandPair.clear();
        netChangeFuturesTradeMessageNegativeMillionPair.clear();
        netChangeFuturesTradeMessageNumericPair.clear();
        selected = Case.NET_CHANGE_FUTURES_TRADE_MESSAGE_NUMERIC_PAIR;
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
        return other instanceof NetChangeFuturesTradeMessageFractionPair branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof NetChangeFuturesTradeMessageFractionPair branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
