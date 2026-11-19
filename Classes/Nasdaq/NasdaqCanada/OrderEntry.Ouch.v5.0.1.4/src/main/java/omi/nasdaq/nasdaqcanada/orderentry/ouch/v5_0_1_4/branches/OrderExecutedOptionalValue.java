package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums.OrderExecutedOptionalField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.OrderExecutedOptionalFieldField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.BrokerPref;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.CumRate;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.ExecuteMatch;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.PrincipalTrade;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.SecondaryOrderId;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.UserRefIdx;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.WashTrade;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.Field;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.GroupEntry;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.PrintOptions;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.RawRecord;

/**
 * The OrderExecutedOptionalValue branch: one of 7 records, each as wide as its own fields, chosen by the OrderExecutedOptionalField its holder reads before it.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class OrderExecutedOptionalValue implements GroupEntry {

    /**
     * The width of this branch's narrowest case: the least it occupies on the wire.
     */
    public static final int MINIMUM_BYTE_LENGTH = 0;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "OrderExecutedOptionalValue";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when its holder's OrderExecutedOptionalField is 37.
         */
        USER_REF_IDX,
        /**
         * Selected when its holder's OrderExecutedOptionalField is 38.
         */
        EXECUTE_MATCH,
        /**
         * Selected when its holder's OrderExecutedOptionalField is 40.
         */
        SECONDARY_ORDER_ID,
        /**
         * Selected when its holder's OrderExecutedOptionalField is 42.
         */
        BROKER_PREF,
        /**
         * Selected when its holder's OrderExecutedOptionalField is 13.
         */
        PRINCIPAL_TRADE,
        /**
         * Selected when its holder's OrderExecutedOptionalField is 41.
         */
        WASH_TRADE,
        /**
         * Selected when its holder's OrderExecutedOptionalField is 36.
         */
        CUM_RATE,
        /**
         * Selected when its holder's OrderExecutedOptionalField names no case above: the bytes the wire states for it, kept whole.
         */
        UNKNOWN
    }

    private final UserRefIdx userRefIdx = new UserRefIdx();
    private final ExecuteMatch executeMatch = new ExecuteMatch();
    private final SecondaryOrderId secondaryOrderId = new SecondaryOrderId();
    private final BrokerPref brokerPref = new BrokerPref();
    private final PrincipalTrade principalTrade = new PrincipalTrade();
    private final WashTrade washTrade = new WashTrade();
    private final CumRate cumRate = new CumRate();
    private final RawRecord unknown = new RawRecord();
    private Case selected = Case.USER_REF_IDX;

    /**
     * Returns the case this branch holds: the one its rules selected, or the one last chosen.
     *
     * @return the selected case
     */
    public Case selected() {
        return selected;
    }

    /**
     * Chooses the case to encode. Its holder writes the OrderExecutedOptionalField that selects it, so its bytes select it again.
     *
     * @param value the case
     */
    public void select(Case value) {
        selected = Objects.requireNonNull(value, "value");
    }

    /**
     * Returns the case a OrderExecutedOptionalField selects, rules tried in order.
     *
     * @param orderExecutedOptionalField the field its holder read before this branch
     * @return the selected case, or null when it selects none
     */
    public static Case caseFor(OrderExecutedOptionalFieldField orderExecutedOptionalField) {
        if (orderExecutedOptionalField.value() == OrderExecutedOptionalField.USERREFIDX) {
            return Case.USER_REF_IDX;
        }
        if (orderExecutedOptionalField.value() == OrderExecutedOptionalField.EXECUTEMATCH) {
            return Case.EXECUTE_MATCH;
        }
        if (orderExecutedOptionalField.value() == OrderExecutedOptionalField.SECONDARYORDERID) {
            return Case.SECONDARY_ORDER_ID;
        }
        if (orderExecutedOptionalField.value() == OrderExecutedOptionalField.BROKERPREF) {
            return Case.BROKER_PREF;
        }
        if (orderExecutedOptionalField.value() == OrderExecutedOptionalField.PRINCIPALTRADE) {
            return Case.PRINCIPAL_TRADE;
        }
        if (orderExecutedOptionalField.value() == OrderExecutedOptionalField.WASHTRADE) {
            return Case.WASH_TRADE;
        }
        if (orderExecutedOptionalField.value() == OrderExecutedOptionalField.CUMRATE) {
            return Case.CUM_RATE;
        }
        return null;
    }

    /**
     * Writes the OrderExecutedOptionalField that selects the case this branch holds.
     *
     * @param orderExecutedOptionalField the field its holder writes before this branch
     */
    public void writeKey(OrderExecutedOptionalFieldField orderExecutedOptionalField) {
        switch (selected) {
            case USER_REF_IDX -> orderExecutedOptionalField.value(OrderExecutedOptionalField.USERREFIDX);
            case EXECUTE_MATCH -> orderExecutedOptionalField.value(OrderExecutedOptionalField.EXECUTEMATCH);
            case SECONDARY_ORDER_ID -> orderExecutedOptionalField.value(OrderExecutedOptionalField.SECONDARYORDERID);
            case BROKER_PREF -> orderExecutedOptionalField.value(OrderExecutedOptionalField.BROKERPREF);
            case PRINCIPAL_TRADE -> orderExecutedOptionalField.value(OrderExecutedOptionalField.PRINCIPALTRADE);
            case WASH_TRADE -> orderExecutedOptionalField.value(OrderExecutedOptionalField.WASHTRADE);
            case CUM_RATE -> orderExecutedOptionalField.value(OrderExecutedOptionalField.CUMRATE);
            case UNKNOWN -> { }
        }
    }

    /**
     * Decodes the case a OrderExecutedOptionalField selects.
     *
     * @param orderExecutedOptionalField the field its holder read before this branch
     * @param data   the buffer to decode from
     * @param offset the index of this branch's first byte
     * @param end    the index just past the last byte this branch may read
     * @return true when its record decoded; a key naming no declared case keeps the bytes the wire states
     */
    public boolean parseFrom(OrderExecutedOptionalFieldField orderExecutedOptionalField, byte[] data, int offset, int end) {
        clear();
        Case chosen = caseFor(orderExecutedOptionalField);
        if (chosen == null) {
            chosen = Case.UNKNOWN;
        }
        selected = chosen;
        return entry().parseFrom(data, offset, end);
    }

    /**
     * Returns the UserRefIdx case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public UserRefIdx userRefIdx() {
        return userRefIdx;
    }

    /**
     * Returns the ExecuteMatch case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ExecuteMatch executeMatch() {
        return executeMatch;
    }

    /**
     * Returns the SecondaryOrderId case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SecondaryOrderId secondaryOrderId() {
        return secondaryOrderId;
    }

    /**
     * Returns the BrokerPref case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BrokerPref brokerPref() {
        return brokerPref;
    }

    /**
     * Returns the PrincipalTrade case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PrincipalTrade principalTrade() {
        return principalTrade;
    }

    /**
     * Returns the WashTrade case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public WashTrade washTrade() {
        return washTrade;
    }

    /**
     * Returns the CumRate case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public CumRate cumRate() {
        return cumRate;
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
            case USER_REF_IDX -> userRefIdx;
            case EXECUTE_MATCH -> executeMatch;
            case SECONDARY_ORDER_ID -> secondaryOrderId;
            case BROKER_PREF -> brokerPref;
            case PRINCIPAL_TRADE -> principalTrade;
            case WASH_TRADE -> washTrade;
            case CUM_RATE -> cumRate;
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
        userRefIdx.clear();
        executeMatch.clear();
        secondaryOrderId.clear();
        brokerPref.clear();
        principalTrade.clear();
        washTrade.clear();
        cumRate.clear();
        unknown.clear();
        selected = Case.USER_REF_IDX;
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
        return other instanceof OrderExecutedOptionalValue branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof OrderExecutedOptionalValue branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
