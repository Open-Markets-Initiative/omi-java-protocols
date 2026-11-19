package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums.OrderReplacedOptionalField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.OrderReplacedOptionalFieldField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.AlgorithmId;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.AllowConditional;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.Anonymous;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.BrokerLei;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.CustomerAccount;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.CustomerLei;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.CxdConnect;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.DisplayRange;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.ExpireTime;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.HandlInst;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.MaxFloor;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.MaxRate;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.MinQty;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.MinQtyType;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.MinRate;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.NbboSetter;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.OrderOrigination;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.PegOffset;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.PegType;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.PureStreamConnect;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.RepriceReason;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.RoutingArrangementIndicator;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.TargetStrategy;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.UmirRegulationId;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.UserRefIdx;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.Field;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.GroupEntry;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.PrintOptions;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.RawRecord;

/**
 * The OrderReplacedOptionalValue branch: one of 25 records, each as wide as its own fields, chosen by the OrderReplacedOptionalField its holder reads before it.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class OrderReplacedOptionalValue implements GroupEntry {

    /**
     * The width of this branch's narrowest case: the least it occupies on the wire.
     */
    public static final int MINIMUM_BYTE_LENGTH = 0;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "OrderReplacedOptionalValue";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when its holder's OrderReplacedOptionalField is 37.
         */
        USER_REF_IDX,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 3.
         */
        MIN_QTY_TYPE,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 2.
         */
        PEG_TYPE,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 4.
         */
        MIN_QTY,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 5.
         */
        MAX_FLOOR,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 6.
         */
        EXPIRE_TIME,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 7.
         */
        PEG_OFFSET,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 8.
         */
        TARGET_STRATEGY,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 9.
         */
        ORDER_ORIGINATION,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 10.
         */
        ROUTING_ARRANGEMENT_INDICATOR,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 17.
         */
        UMIR_REGULATION_ID,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 16.
         */
        ANONYMOUS,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 24.
         */
        DISPLAY_RANGE,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 25.
         */
        CUSTOMER_ACCOUNT,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 26.
         */
        ALGORITHM_ID,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 27.
         */
        CUSTOMER_LEI,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 28.
         */
        BROKER_LEI,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 30.
         */
        ALLOW_CONDITIONAL,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 32.
         */
        CXD_CONNECT,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 33.
         */
        PURE_STREAM_CONNECT,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 34.
         */
        MIN_RATE,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 35.
         */
        MAX_RATE,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 43.
         */
        HANDL_INST,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 44.
         */
        REPRICE_REASON,
        /**
         * Selected when its holder's OrderReplacedOptionalField is 45.
         */
        NBBO_SETTER,
        /**
         * Selected when its holder's OrderReplacedOptionalField names no case above: the bytes the wire states for it, kept whole.
         */
        UNKNOWN
    }

    private final UserRefIdx userRefIdx = new UserRefIdx();
    private final MinQtyType minQtyType = new MinQtyType();
    private final PegType pegType = new PegType();
    private final MinQty minQty = new MinQty();
    private final MaxFloor maxFloor = new MaxFloor();
    private final ExpireTime expireTime = new ExpireTime();
    private final PegOffset pegOffset = new PegOffset();
    private final TargetStrategy targetStrategy = new TargetStrategy();
    private final OrderOrigination orderOrigination = new OrderOrigination();
    private final RoutingArrangementIndicator routingArrangementIndicator = new RoutingArrangementIndicator();
    private final UmirRegulationId umirRegulationId = new UmirRegulationId();
    private final Anonymous anonymous = new Anonymous();
    private final DisplayRange displayRange = new DisplayRange();
    private final CustomerAccount customerAccount = new CustomerAccount();
    private final AlgorithmId algorithmId = new AlgorithmId();
    private final CustomerLei customerLei = new CustomerLei();
    private final BrokerLei brokerLei = new BrokerLei();
    private final AllowConditional allowConditional = new AllowConditional();
    private final CxdConnect cxdConnect = new CxdConnect();
    private final PureStreamConnect pureStreamConnect = new PureStreamConnect();
    private final MinRate minRate = new MinRate();
    private final MaxRate maxRate = new MaxRate();
    private final HandlInst handlInst = new HandlInst();
    private final RepriceReason repriceReason = new RepriceReason();
    private final NbboSetter nbboSetter = new NbboSetter();
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
     * Chooses the case to encode. Its holder writes the OrderReplacedOptionalField that selects it, so its bytes select it again.
     *
     * @param value the case
     */
    public void select(Case value) {
        selected = Objects.requireNonNull(value, "value");
    }

    /**
     * Returns the case a OrderReplacedOptionalField selects, rules tried in order.
     *
     * @param orderReplacedOptionalField the field its holder read before this branch
     * @return the selected case, or null when it selects none
     */
    public static Case caseFor(OrderReplacedOptionalFieldField orderReplacedOptionalField) {
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.USERREFIDX) {
            return Case.USER_REF_IDX;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.MINQTYTYPE) {
            return Case.MIN_QTY_TYPE;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.PEGTYPE) {
            return Case.PEG_TYPE;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.MINQTY) {
            return Case.MIN_QTY;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.MAXFLOOR) {
            return Case.MAX_FLOOR;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.EXPIRETIME) {
            return Case.EXPIRE_TIME;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.PEGOFFSET) {
            return Case.PEG_OFFSET;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.TARGETSTRATEGY) {
            return Case.TARGET_STRATEGY;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.ORDERORIGINATION) {
            return Case.ORDER_ORIGINATION;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.ROUTINGARRANGEMENTINDICATOR) {
            return Case.ROUTING_ARRANGEMENT_INDICATOR;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.UMIRREGULATIONID) {
            return Case.UMIR_REGULATION_ID;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.ANONYMOUS) {
            return Case.ANONYMOUS;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.DISPLAYRANGE) {
            return Case.DISPLAY_RANGE;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.CUSTOMERACCOUNT) {
            return Case.CUSTOMER_ACCOUNT;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.ALGORITHMID) {
            return Case.ALGORITHM_ID;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.CUSTOMERLEI) {
            return Case.CUSTOMER_LEI;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.BROKERLEI) {
            return Case.BROKER_LEI;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.ALLOWCONDITIONAL) {
            return Case.ALLOW_CONDITIONAL;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.CXDCONNECT) {
            return Case.CXD_CONNECT;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.PURESTREAMCONNECT) {
            return Case.PURE_STREAM_CONNECT;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.MINRATE) {
            return Case.MIN_RATE;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.MAXRATE) {
            return Case.MAX_RATE;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.HANDLINST) {
            return Case.HANDL_INST;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.REPRICEREASON) {
            return Case.REPRICE_REASON;
        }
        if (orderReplacedOptionalField.value() == OrderReplacedOptionalField.NBBOSETTER) {
            return Case.NBBO_SETTER;
        }
        return null;
    }

    /**
     * Writes the OrderReplacedOptionalField that selects the case this branch holds.
     *
     * @param orderReplacedOptionalField the field its holder writes before this branch
     */
    public void writeKey(OrderReplacedOptionalFieldField orderReplacedOptionalField) {
        switch (selected) {
            case USER_REF_IDX -> orderReplacedOptionalField.value(OrderReplacedOptionalField.USERREFIDX);
            case MIN_QTY_TYPE -> orderReplacedOptionalField.value(OrderReplacedOptionalField.MINQTYTYPE);
            case PEG_TYPE -> orderReplacedOptionalField.value(OrderReplacedOptionalField.PEGTYPE);
            case MIN_QTY -> orderReplacedOptionalField.value(OrderReplacedOptionalField.MINQTY);
            case MAX_FLOOR -> orderReplacedOptionalField.value(OrderReplacedOptionalField.MAXFLOOR);
            case EXPIRE_TIME -> orderReplacedOptionalField.value(OrderReplacedOptionalField.EXPIRETIME);
            case PEG_OFFSET -> orderReplacedOptionalField.value(OrderReplacedOptionalField.PEGOFFSET);
            case TARGET_STRATEGY -> orderReplacedOptionalField.value(OrderReplacedOptionalField.TARGETSTRATEGY);
            case ORDER_ORIGINATION -> orderReplacedOptionalField.value(OrderReplacedOptionalField.ORDERORIGINATION);
            case ROUTING_ARRANGEMENT_INDICATOR -> orderReplacedOptionalField.value(OrderReplacedOptionalField.ROUTINGARRANGEMENTINDICATOR);
            case UMIR_REGULATION_ID -> orderReplacedOptionalField.value(OrderReplacedOptionalField.UMIRREGULATIONID);
            case ANONYMOUS -> orderReplacedOptionalField.value(OrderReplacedOptionalField.ANONYMOUS);
            case DISPLAY_RANGE -> orderReplacedOptionalField.value(OrderReplacedOptionalField.DISPLAYRANGE);
            case CUSTOMER_ACCOUNT -> orderReplacedOptionalField.value(OrderReplacedOptionalField.CUSTOMERACCOUNT);
            case ALGORITHM_ID -> orderReplacedOptionalField.value(OrderReplacedOptionalField.ALGORITHMID);
            case CUSTOMER_LEI -> orderReplacedOptionalField.value(OrderReplacedOptionalField.CUSTOMERLEI);
            case BROKER_LEI -> orderReplacedOptionalField.value(OrderReplacedOptionalField.BROKERLEI);
            case ALLOW_CONDITIONAL -> orderReplacedOptionalField.value(OrderReplacedOptionalField.ALLOWCONDITIONAL);
            case CXD_CONNECT -> orderReplacedOptionalField.value(OrderReplacedOptionalField.CXDCONNECT);
            case PURE_STREAM_CONNECT -> orderReplacedOptionalField.value(OrderReplacedOptionalField.PURESTREAMCONNECT);
            case MIN_RATE -> orderReplacedOptionalField.value(OrderReplacedOptionalField.MINRATE);
            case MAX_RATE -> orderReplacedOptionalField.value(OrderReplacedOptionalField.MAXRATE);
            case HANDL_INST -> orderReplacedOptionalField.value(OrderReplacedOptionalField.HANDLINST);
            case REPRICE_REASON -> orderReplacedOptionalField.value(OrderReplacedOptionalField.REPRICEREASON);
            case NBBO_SETTER -> orderReplacedOptionalField.value(OrderReplacedOptionalField.NBBOSETTER);
            case UNKNOWN -> { }
        }
    }

    /**
     * Decodes the case a OrderReplacedOptionalField selects.
     *
     * @param orderReplacedOptionalField the field its holder read before this branch
     * @param data   the buffer to decode from
     * @param offset the index of this branch's first byte
     * @param end    the index just past the last byte this branch may read
     * @return true when its record decoded; a key naming no declared case keeps the bytes the wire states
     */
    public boolean parseFrom(OrderReplacedOptionalFieldField orderReplacedOptionalField, byte[] data, int offset, int end) {
        clear();
        Case chosen = caseFor(orderReplacedOptionalField);
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
     * Returns the MinQtyType case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinQtyType minQtyType() {
        return minQtyType;
    }

    /**
     * Returns the PegType case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PegType pegType() {
        return pegType;
    }

    /**
     * Returns the MinQty case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinQty minQty() {
        return minQty;
    }

    /**
     * Returns the MaxFloor case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MaxFloor maxFloor() {
        return maxFloor;
    }

    /**
     * Returns the ExpireTime case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ExpireTime expireTime() {
        return expireTime;
    }

    /**
     * Returns the PegOffset case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PegOffset pegOffset() {
        return pegOffset;
    }

    /**
     * Returns the TargetStrategy case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TargetStrategy targetStrategy() {
        return targetStrategy;
    }

    /**
     * Returns the OrderOrigination case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public OrderOrigination orderOrigination() {
        return orderOrigination;
    }

    /**
     * Returns the RoutingArrangementIndicator case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public RoutingArrangementIndicator routingArrangementIndicator() {
        return routingArrangementIndicator;
    }

    /**
     * Returns the UmirRegulationId case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public UmirRegulationId umirRegulationId() {
        return umirRegulationId;
    }

    /**
     * Returns the Anonymous case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public Anonymous anonymous() {
        return anonymous;
    }

    /**
     * Returns the DisplayRange case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public DisplayRange displayRange() {
        return displayRange;
    }

    /**
     * Returns the CustomerAccount case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public CustomerAccount customerAccount() {
        return customerAccount;
    }

    /**
     * Returns the AlgorithmId case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AlgorithmId algorithmId() {
        return algorithmId;
    }

    /**
     * Returns the CustomerLei case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public CustomerLei customerLei() {
        return customerLei;
    }

    /**
     * Returns the BrokerLei case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BrokerLei brokerLei() {
        return brokerLei;
    }

    /**
     * Returns the AllowConditional case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AllowConditional allowConditional() {
        return allowConditional;
    }

    /**
     * Returns the CxdConnect case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public CxdConnect cxdConnect() {
        return cxdConnect;
    }

    /**
     * Returns the PureStreamConnect case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PureStreamConnect pureStreamConnect() {
        return pureStreamConnect;
    }

    /**
     * Returns the MinRate case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinRate minRate() {
        return minRate;
    }

    /**
     * Returns the MaxRate case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MaxRate maxRate() {
        return maxRate;
    }

    /**
     * Returns the HandlInst case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HandlInst handlInst() {
        return handlInst;
    }

    /**
     * Returns the RepriceReason case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public RepriceReason repriceReason() {
        return repriceReason;
    }

    /**
     * Returns the NbboSetter case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NbboSetter nbboSetter() {
        return nbboSetter;
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
            case MIN_QTY_TYPE -> minQtyType;
            case PEG_TYPE -> pegType;
            case MIN_QTY -> minQty;
            case MAX_FLOOR -> maxFloor;
            case EXPIRE_TIME -> expireTime;
            case PEG_OFFSET -> pegOffset;
            case TARGET_STRATEGY -> targetStrategy;
            case ORDER_ORIGINATION -> orderOrigination;
            case ROUTING_ARRANGEMENT_INDICATOR -> routingArrangementIndicator;
            case UMIR_REGULATION_ID -> umirRegulationId;
            case ANONYMOUS -> anonymous;
            case DISPLAY_RANGE -> displayRange;
            case CUSTOMER_ACCOUNT -> customerAccount;
            case ALGORITHM_ID -> algorithmId;
            case CUSTOMER_LEI -> customerLei;
            case BROKER_LEI -> brokerLei;
            case ALLOW_CONDITIONAL -> allowConditional;
            case CXD_CONNECT -> cxdConnect;
            case PURE_STREAM_CONNECT -> pureStreamConnect;
            case MIN_RATE -> minRate;
            case MAX_RATE -> maxRate;
            case HANDL_INST -> handlInst;
            case REPRICE_REASON -> repriceReason;
            case NBBO_SETTER -> nbboSetter;
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
        minQtyType.clear();
        pegType.clear();
        minQty.clear();
        maxFloor.clear();
        expireTime.clear();
        pegOffset.clear();
        targetStrategy.clear();
        orderOrigination.clear();
        routingArrangementIndicator.clear();
        umirRegulationId.clear();
        anonymous.clear();
        displayRange.clear();
        customerAccount.clear();
        algorithmId.clear();
        customerLei.clear();
        brokerLei.clear();
        allowConditional.clear();
        cxdConnect.clear();
        pureStreamConnect.clear();
        minRate.clear();
        maxRate.clear();
        handlInst.clear();
        repriceReason.clear();
        nbboSetter.clear();
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
        return other instanceof OrderReplacedOptionalValue branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof OrderReplacedOptionalValue branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
