package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums.EnterOrderOptionalField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.fields.EnterOrderOptionalFieldField;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.Account;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.AlgorithmId;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.AllowConditional;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.Anonymous;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.BasketTrade;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.BrokerLei;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.Bypass;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.ConditionalOrder;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.CustomerAccount;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.CustomerLei;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.CxdConnect;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.DisplayRange;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.ExpireTime;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.FirmUpId;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.GefEligible;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.HandlInst;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.Jitney;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.MaxFloor;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.MaxRate;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.MinQty;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.MinQtyType;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.MinRate;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.NoTradeFeat;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.NoTradeKey;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.OrderOrigination;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.PegOffset;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.PegType;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.PoComment;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.ProgramTrade;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.PureStreamConnect;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.RoutingArrangementIndicator;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.RoutingStrategy;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.ShortMarkingExempt;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.TargetStrategy;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.Tsxncib;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.UmirRegulationId;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.structs.UserRefIdx;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.Field;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.GroupEntry;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.PrintOptions;
import omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.types.RawRecord;

/**
 * The EnterOrderOptionalValue branch: one of 37 records, each as wide as its own fields, chosen by the EnterOrderOptionalField its holder reads before it.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class EnterOrderOptionalValue implements GroupEntry {

    /**
     * The width of this branch's narrowest case: the least it occupies on the wire.
     */
    public static final int MINIMUM_BYTE_LENGTH = 0;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "EnterOrderOptionalValue";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when its holder's EnterOrderOptionalField is 37.
         */
        USER_REF_IDX,
        /**
         * Selected when its holder's EnterOrderOptionalField is 1.
         */
        ACCOUNT,
        /**
         * Selected when its holder's EnterOrderOptionalField is 2.
         */
        PEG_TYPE,
        /**
         * Selected when its holder's EnterOrderOptionalField is 3.
         */
        MIN_QTY_TYPE,
        /**
         * Selected when its holder's EnterOrderOptionalField is 4.
         */
        MIN_QTY,
        /**
         * Selected when its holder's EnterOrderOptionalField is 5.
         */
        MAX_FLOOR,
        /**
         * Selected when its holder's EnterOrderOptionalField is 6.
         */
        EXPIRE_TIME,
        /**
         * Selected when its holder's EnterOrderOptionalField is 7.
         */
        PEG_OFFSET,
        /**
         * Selected when its holder's EnterOrderOptionalField is 8.
         */
        TARGET_STRATEGY,
        /**
         * Selected when its holder's EnterOrderOptionalField is 9.
         */
        ORDER_ORIGINATION,
        /**
         * Selected when its holder's EnterOrderOptionalField is 10.
         */
        ROUTING_ARRANGEMENT_INDICATOR,
        /**
         * Selected when its holder's EnterOrderOptionalField is 11.
         */
        BASKET_TRADE,
        /**
         * Selected when its holder's EnterOrderOptionalField is 12.
         */
        PROGRAM_TRADE,
        /**
         * Selected when its holder's EnterOrderOptionalField is 14.
         */
        JITNEY,
        /**
         * Selected when its holder's EnterOrderOptionalField is 15.
         */
        GEF_ELIGIBLE,
        /**
         * Selected when its holder's EnterOrderOptionalField is 16.
         */
        ANONYMOUS,
        /**
         * Selected when its holder's EnterOrderOptionalField is 17.
         */
        UMIR_REGULATION_ID,
        /**
         * Selected when its holder's EnterOrderOptionalField is 18.
         */
        BYPASS,
        /**
         * Selected when its holder's EnterOrderOptionalField is 19.
         */
        TSXNCIB,
        /**
         * Selected when its holder's EnterOrderOptionalField is 20.
         */
        NO_TRADE_FEAT,
        /**
         * Selected when its holder's EnterOrderOptionalField is 21.
         */
        NO_TRADE_KEY,
        /**
         * Selected when its holder's EnterOrderOptionalField is 22.
         */
        SHORT_MARKING_EXEMPT,
        /**
         * Selected when its holder's EnterOrderOptionalField is 23.
         */
        PO_COMMENT,
        /**
         * Selected when its holder's EnterOrderOptionalField is 24.
         */
        DISPLAY_RANGE,
        /**
         * Selected when its holder's EnterOrderOptionalField is 25.
         */
        CUSTOMER_ACCOUNT,
        /**
         * Selected when its holder's EnterOrderOptionalField is 26.
         */
        ALGORITHM_ID,
        /**
         * Selected when its holder's EnterOrderOptionalField is 27.
         */
        CUSTOMER_LEI,
        /**
         * Selected when its holder's EnterOrderOptionalField is 28.
         */
        BROKER_LEI,
        /**
         * Selected when its holder's EnterOrderOptionalField is 29.
         */
        CONDITIONAL_ORDER,
        /**
         * Selected when its holder's EnterOrderOptionalField is 30.
         */
        ALLOW_CONDITIONAL,
        /**
         * Selected when its holder's EnterOrderOptionalField is 31.
         */
        FIRM_UP_ID,
        /**
         * Selected when its holder's EnterOrderOptionalField is 32.
         */
        CXD_CONNECT,
        /**
         * Selected when its holder's EnterOrderOptionalField is 33.
         */
        PURE_STREAM_CONNECT,
        /**
         * Selected when its holder's EnterOrderOptionalField is 34.
         */
        MIN_RATE,
        /**
         * Selected when its holder's EnterOrderOptionalField is 35.
         */
        MAX_RATE,
        /**
         * Selected when its holder's EnterOrderOptionalField is 39.
         */
        ROUTING_STRATEGY,
        /**
         * Selected when its holder's EnterOrderOptionalField is 43.
         */
        HANDL_INST,
        /**
         * Selected when its holder's EnterOrderOptionalField names no case above: the bytes the wire states for it, kept whole.
         */
        UNKNOWN
    }

    private final UserRefIdx userRefIdx = new UserRefIdx();
    private final Account account = new Account();
    private final PegType pegType = new PegType();
    private final MinQtyType minQtyType = new MinQtyType();
    private final MinQty minQty = new MinQty();
    private final MaxFloor maxFloor = new MaxFloor();
    private final ExpireTime expireTime = new ExpireTime();
    private final PegOffset pegOffset = new PegOffset();
    private final TargetStrategy targetStrategy = new TargetStrategy();
    private final OrderOrigination orderOrigination = new OrderOrigination();
    private final RoutingArrangementIndicator routingArrangementIndicator = new RoutingArrangementIndicator();
    private final BasketTrade basketTrade = new BasketTrade();
    private final ProgramTrade programTrade = new ProgramTrade();
    private final Jitney jitney = new Jitney();
    private final GefEligible gefEligible = new GefEligible();
    private final Anonymous anonymous = new Anonymous();
    private final UmirRegulationId umirRegulationId = new UmirRegulationId();
    private final Bypass bypass = new Bypass();
    private final Tsxncib tsxncib = new Tsxncib();
    private final NoTradeFeat noTradeFeat = new NoTradeFeat();
    private final NoTradeKey noTradeKey = new NoTradeKey();
    private final ShortMarkingExempt shortMarkingExempt = new ShortMarkingExempt();
    private final PoComment poComment = new PoComment();
    private final DisplayRange displayRange = new DisplayRange();
    private final CustomerAccount customerAccount = new CustomerAccount();
    private final AlgorithmId algorithmId = new AlgorithmId();
    private final CustomerLei customerLei = new CustomerLei();
    private final BrokerLei brokerLei = new BrokerLei();
    private final ConditionalOrder conditionalOrder = new ConditionalOrder();
    private final AllowConditional allowConditional = new AllowConditional();
    private final FirmUpId firmUpId = new FirmUpId();
    private final CxdConnect cxdConnect = new CxdConnect();
    private final PureStreamConnect pureStreamConnect = new PureStreamConnect();
    private final MinRate minRate = new MinRate();
    private final MaxRate maxRate = new MaxRate();
    private final RoutingStrategy routingStrategy = new RoutingStrategy();
    private final HandlInst handlInst = new HandlInst();
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
     * Chooses the case to encode. Its holder writes the EnterOrderOptionalField that selects it, so its bytes select it again.
     *
     * @param value the case
     */
    public void select(Case value) {
        selected = Objects.requireNonNull(value, "value");
    }

    /**
     * Returns the case a EnterOrderOptionalField selects, rules tried in order.
     *
     * @param enterOrderOptionalField the field its holder read before this branch
     * @return the selected case, or null when it selects none
     */
    public static Case caseFor(EnterOrderOptionalFieldField enterOrderOptionalField) {
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.USERREFIDX) {
            return Case.USER_REF_IDX;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.ACCOUNT) {
            return Case.ACCOUNT;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.PEGTYPE) {
            return Case.PEG_TYPE;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.MINQTYTYPE) {
            return Case.MIN_QTY_TYPE;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.MINQTY) {
            return Case.MIN_QTY;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.MAXFLOOR) {
            return Case.MAX_FLOOR;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.EXPIRETIME) {
            return Case.EXPIRE_TIME;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.PEGOFFSET) {
            return Case.PEG_OFFSET;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.TARGETSTRATEGY) {
            return Case.TARGET_STRATEGY;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.ORDERORIGINATION) {
            return Case.ORDER_ORIGINATION;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.ROUTINGARRANGEMENTINDICATOR) {
            return Case.ROUTING_ARRANGEMENT_INDICATOR;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.BASKETTRADE) {
            return Case.BASKET_TRADE;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.PROGRAMTRADE) {
            return Case.PROGRAM_TRADE;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.JITNEY) {
            return Case.JITNEY;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.GEFELIGIBLE) {
            return Case.GEF_ELIGIBLE;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.ANONYMOUS) {
            return Case.ANONYMOUS;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.UMIRREGULATIONID) {
            return Case.UMIR_REGULATION_ID;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.BYPASS) {
            return Case.BYPASS;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.TSXNCIB) {
            return Case.TSXNCIB;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.NOTRADEFEAT) {
            return Case.NO_TRADE_FEAT;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.NOTRADEKEY) {
            return Case.NO_TRADE_KEY;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.SHORTMARKINGEXEMPT) {
            return Case.SHORT_MARKING_EXEMPT;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.POCOMMENT) {
            return Case.PO_COMMENT;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.DISPLAYRANGE) {
            return Case.DISPLAY_RANGE;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.CUSTOMERACCOUNT) {
            return Case.CUSTOMER_ACCOUNT;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.ALGORITHMID) {
            return Case.ALGORITHM_ID;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.CUSTOMERLEI) {
            return Case.CUSTOMER_LEI;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.BROKERLEI) {
            return Case.BROKER_LEI;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.CONDITIONALORDER) {
            return Case.CONDITIONAL_ORDER;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.ALLOWCONDITIONAL) {
            return Case.ALLOW_CONDITIONAL;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.FIRMUPID) {
            return Case.FIRM_UP_ID;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.CXDCONNECT) {
            return Case.CXD_CONNECT;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.PURESTREAMCONNECT) {
            return Case.PURE_STREAM_CONNECT;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.MINRATE) {
            return Case.MIN_RATE;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.MAXRATE) {
            return Case.MAX_RATE;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.ROUTINGSTRATEGY) {
            return Case.ROUTING_STRATEGY;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.HANDLINST) {
            return Case.HANDL_INST;
        }
        return null;
    }

    /**
     * Writes the EnterOrderOptionalField that selects the case this branch holds.
     *
     * @param enterOrderOptionalField the field its holder writes before this branch
     */
    public void writeKey(EnterOrderOptionalFieldField enterOrderOptionalField) {
        switch (selected) {
            case USER_REF_IDX -> enterOrderOptionalField.value(EnterOrderOptionalField.USERREFIDX);
            case ACCOUNT -> enterOrderOptionalField.value(EnterOrderOptionalField.ACCOUNT);
            case PEG_TYPE -> enterOrderOptionalField.value(EnterOrderOptionalField.PEGTYPE);
            case MIN_QTY_TYPE -> enterOrderOptionalField.value(EnterOrderOptionalField.MINQTYTYPE);
            case MIN_QTY -> enterOrderOptionalField.value(EnterOrderOptionalField.MINQTY);
            case MAX_FLOOR -> enterOrderOptionalField.value(EnterOrderOptionalField.MAXFLOOR);
            case EXPIRE_TIME -> enterOrderOptionalField.value(EnterOrderOptionalField.EXPIRETIME);
            case PEG_OFFSET -> enterOrderOptionalField.value(EnterOrderOptionalField.PEGOFFSET);
            case TARGET_STRATEGY -> enterOrderOptionalField.value(EnterOrderOptionalField.TARGETSTRATEGY);
            case ORDER_ORIGINATION -> enterOrderOptionalField.value(EnterOrderOptionalField.ORDERORIGINATION);
            case ROUTING_ARRANGEMENT_INDICATOR -> enterOrderOptionalField.value(EnterOrderOptionalField.ROUTINGARRANGEMENTINDICATOR);
            case BASKET_TRADE -> enterOrderOptionalField.value(EnterOrderOptionalField.BASKETTRADE);
            case PROGRAM_TRADE -> enterOrderOptionalField.value(EnterOrderOptionalField.PROGRAMTRADE);
            case JITNEY -> enterOrderOptionalField.value(EnterOrderOptionalField.JITNEY);
            case GEF_ELIGIBLE -> enterOrderOptionalField.value(EnterOrderOptionalField.GEFELIGIBLE);
            case ANONYMOUS -> enterOrderOptionalField.value(EnterOrderOptionalField.ANONYMOUS);
            case UMIR_REGULATION_ID -> enterOrderOptionalField.value(EnterOrderOptionalField.UMIRREGULATIONID);
            case BYPASS -> enterOrderOptionalField.value(EnterOrderOptionalField.BYPASS);
            case TSXNCIB -> enterOrderOptionalField.value(EnterOrderOptionalField.TSXNCIB);
            case NO_TRADE_FEAT -> enterOrderOptionalField.value(EnterOrderOptionalField.NOTRADEFEAT);
            case NO_TRADE_KEY -> enterOrderOptionalField.value(EnterOrderOptionalField.NOTRADEKEY);
            case SHORT_MARKING_EXEMPT -> enterOrderOptionalField.value(EnterOrderOptionalField.SHORTMARKINGEXEMPT);
            case PO_COMMENT -> enterOrderOptionalField.value(EnterOrderOptionalField.POCOMMENT);
            case DISPLAY_RANGE -> enterOrderOptionalField.value(EnterOrderOptionalField.DISPLAYRANGE);
            case CUSTOMER_ACCOUNT -> enterOrderOptionalField.value(EnterOrderOptionalField.CUSTOMERACCOUNT);
            case ALGORITHM_ID -> enterOrderOptionalField.value(EnterOrderOptionalField.ALGORITHMID);
            case CUSTOMER_LEI -> enterOrderOptionalField.value(EnterOrderOptionalField.CUSTOMERLEI);
            case BROKER_LEI -> enterOrderOptionalField.value(EnterOrderOptionalField.BROKERLEI);
            case CONDITIONAL_ORDER -> enterOrderOptionalField.value(EnterOrderOptionalField.CONDITIONALORDER);
            case ALLOW_CONDITIONAL -> enterOrderOptionalField.value(EnterOrderOptionalField.ALLOWCONDITIONAL);
            case FIRM_UP_ID -> enterOrderOptionalField.value(EnterOrderOptionalField.FIRMUPID);
            case CXD_CONNECT -> enterOrderOptionalField.value(EnterOrderOptionalField.CXDCONNECT);
            case PURE_STREAM_CONNECT -> enterOrderOptionalField.value(EnterOrderOptionalField.PURESTREAMCONNECT);
            case MIN_RATE -> enterOrderOptionalField.value(EnterOrderOptionalField.MINRATE);
            case MAX_RATE -> enterOrderOptionalField.value(EnterOrderOptionalField.MAXRATE);
            case ROUTING_STRATEGY -> enterOrderOptionalField.value(EnterOrderOptionalField.ROUTINGSTRATEGY);
            case HANDL_INST -> enterOrderOptionalField.value(EnterOrderOptionalField.HANDLINST);
            case UNKNOWN -> { }
        }
    }

    /**
     * Decodes the case a EnterOrderOptionalField selects.
     *
     * @param enterOrderOptionalField the field its holder read before this branch
     * @param data   the buffer to decode from
     * @param offset the index of this branch's first byte
     * @param end    the index just past the last byte this branch may read
     * @return true when its record decoded; a key naming no declared case keeps the bytes the wire states
     */
    public boolean parseFrom(EnterOrderOptionalFieldField enterOrderOptionalField, byte[] data, int offset, int end) {
        clear();
        Case chosen = caseFor(enterOrderOptionalField);
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
     * Returns the Account case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public Account account() {
        return account;
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
     * Returns the MinQtyType case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public MinQtyType minQtyType() {
        return minQtyType;
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
     * Returns the BasketTrade case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BasketTrade basketTrade() {
        return basketTrade;
    }

    /**
     * Returns the ProgramTrade case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ProgramTrade programTrade() {
        return programTrade;
    }

    /**
     * Returns the Jitney case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public Jitney jitney() {
        return jitney;
    }

    /**
     * Returns the GefEligible case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public GefEligible gefEligible() {
        return gefEligible;
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
     * Returns the UmirRegulationId case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public UmirRegulationId umirRegulationId() {
        return umirRegulationId;
    }

    /**
     * Returns the Bypass case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public Bypass bypass() {
        return bypass;
    }

    /**
     * Returns the Tsxncib case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public Tsxncib tsxncib() {
        return tsxncib;
    }

    /**
     * Returns the NoTradeFeat case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NoTradeFeat noTradeFeat() {
        return noTradeFeat;
    }

    /**
     * Returns the NoTradeKey case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public NoTradeKey noTradeKey() {
        return noTradeKey;
    }

    /**
     * Returns the ShortMarkingExempt case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ShortMarkingExempt shortMarkingExempt() {
        return shortMarkingExempt;
    }

    /**
     * Returns the PoComment case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PoComment poComment() {
        return poComment;
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
     * Returns the ConditionalOrder case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public ConditionalOrder conditionalOrder() {
        return conditionalOrder;
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
     * Returns the FirmUpId case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public FirmUpId firmUpId() {
        return firmUpId;
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
     * Returns the RoutingStrategy case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public RoutingStrategy routingStrategy() {
        return routingStrategy;
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
            case ACCOUNT -> account;
            case PEG_TYPE -> pegType;
            case MIN_QTY_TYPE -> minQtyType;
            case MIN_QTY -> minQty;
            case MAX_FLOOR -> maxFloor;
            case EXPIRE_TIME -> expireTime;
            case PEG_OFFSET -> pegOffset;
            case TARGET_STRATEGY -> targetStrategy;
            case ORDER_ORIGINATION -> orderOrigination;
            case ROUTING_ARRANGEMENT_INDICATOR -> routingArrangementIndicator;
            case BASKET_TRADE -> basketTrade;
            case PROGRAM_TRADE -> programTrade;
            case JITNEY -> jitney;
            case GEF_ELIGIBLE -> gefEligible;
            case ANONYMOUS -> anonymous;
            case UMIR_REGULATION_ID -> umirRegulationId;
            case BYPASS -> bypass;
            case TSXNCIB -> tsxncib;
            case NO_TRADE_FEAT -> noTradeFeat;
            case NO_TRADE_KEY -> noTradeKey;
            case SHORT_MARKING_EXEMPT -> shortMarkingExempt;
            case PO_COMMENT -> poComment;
            case DISPLAY_RANGE -> displayRange;
            case CUSTOMER_ACCOUNT -> customerAccount;
            case ALGORITHM_ID -> algorithmId;
            case CUSTOMER_LEI -> customerLei;
            case BROKER_LEI -> brokerLei;
            case CONDITIONAL_ORDER -> conditionalOrder;
            case ALLOW_CONDITIONAL -> allowConditional;
            case FIRM_UP_ID -> firmUpId;
            case CXD_CONNECT -> cxdConnect;
            case PURE_STREAM_CONNECT -> pureStreamConnect;
            case MIN_RATE -> minRate;
            case MAX_RATE -> maxRate;
            case ROUTING_STRATEGY -> routingStrategy;
            case HANDL_INST -> handlInst;
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
        account.clear();
        pegType.clear();
        minQtyType.clear();
        minQty.clear();
        maxFloor.clear();
        expireTime.clear();
        pegOffset.clear();
        targetStrategy.clear();
        orderOrigination.clear();
        routingArrangementIndicator.clear();
        basketTrade.clear();
        programTrade.clear();
        jitney.clear();
        gefEligible.clear();
        anonymous.clear();
        umirRegulationId.clear();
        bypass.clear();
        tsxncib.clear();
        noTradeFeat.clear();
        noTradeKey.clear();
        shortMarkingExempt.clear();
        poComment.clear();
        displayRange.clear();
        customerAccount.clear();
        algorithmId.clear();
        customerLei.clear();
        brokerLei.clear();
        conditionalOrder.clear();
        allowConditional.clear();
        firmUpId.clear();
        cxdConnect.clear();
        pureStreamConnect.clear();
        minRate.clear();
        maxRate.clear();
        routingStrategy.clear();
        handlInst.clear();
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
        return other instanceof EnterOrderOptionalValue branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof EnterOrderOptionalValue branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
