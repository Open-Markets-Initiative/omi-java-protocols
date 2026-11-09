package omi.nasdaq.nsmequities.orders.ouch.v5_0.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.enums.OrderAcceptedOptionalField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.OrderAcceptedOptionalFieldField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.AiqGroupId;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.AiqStrategy;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.BboWeightIndicator;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.CustomerType;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.DiscretionPegOffset;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.DiscretionPrice;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.DiscretionPriceType;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.ExpireTime;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.Firm;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.GroupId;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.HandleInst;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.MaxFloor;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.MinQty;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.PegOffset;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.PostOnly;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.PriceType;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.RandomReserves;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.Route;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.SharesLocated;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.TradeNow;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.UserRefIdx;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Field;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.GroupEntry;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.PrintOptions;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.RawRecord;

/**
 * The OrderAcceptedOptionalValue branch: one of 21 records, each as wide as its own fields, chosen by the OrderAcceptedOptionalField its holder reads before it.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class OrderAcceptedOptionalValue implements GroupEntry {

    /**
     * The width of this branch's narrowest case: the least it occupies on the wire.
     */
    public static final int MINIMUM_BYTE_LENGTH = 0;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "OrderAcceptedOptionalValue";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 2.
         */
        FIRM,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 3.
         */
        MIN_QTY,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 4.
         */
        CUSTOMER_TYPE,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 5.
         */
        MAX_FLOOR,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 6.
         */
        PRICE_TYPE,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 7.
         */
        PEG_OFFSET,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 9.
         */
        DISCRETION_PRICE,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 10.
         */
        DISCRETION_PRICE_TYPE,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 11.
         */
        DISCRETION_PEG_OFFSET,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 12.
         */
        POST_ONLY,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 13.
         */
        RANDOM_RESERVES,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 14.
         */
        ROUTE,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 15.
         */
        EXPIRE_TIME,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 16.
         */
        TRADE_NOW,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 17.
         */
        HANDLE_INST,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 18.
         */
        BBO_WEIGHT_INDICATOR,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 24.
         */
        GROUP_ID,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 25.
         */
        SHARES_LOCATED,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 28.
         */
        USER_REF_IDX,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 29.
         */
        AIQ_STRATEGY,
        /**
         * Selected when its holder's OrderAcceptedOptionalField is 30.
         */
        AIQ_GROUP_ID,
        /**
         * Selected when its holder's OrderAcceptedOptionalField names no case above: the bytes the wire states for it, kept whole.
         */
        UNKNOWN
    }

    private final Firm firm = new Firm();
    private final MinQty minQty = new MinQty();
    private final CustomerType customerType = new CustomerType();
    private final MaxFloor maxFloor = new MaxFloor();
    private final PriceType priceType = new PriceType();
    private final PegOffset pegOffset = new PegOffset();
    private final DiscretionPrice discretionPrice = new DiscretionPrice();
    private final DiscretionPriceType discretionPriceType = new DiscretionPriceType();
    private final DiscretionPegOffset discretionPegOffset = new DiscretionPegOffset();
    private final PostOnly postOnly = new PostOnly();
    private final RandomReserves randomReserves = new RandomReserves();
    private final Route route = new Route();
    private final ExpireTime expireTime = new ExpireTime();
    private final TradeNow tradeNow = new TradeNow();
    private final HandleInst handleInst = new HandleInst();
    private final BboWeightIndicator bboWeightIndicator = new BboWeightIndicator();
    private final GroupId groupId = new GroupId();
    private final SharesLocated sharesLocated = new SharesLocated();
    private final UserRefIdx userRefIdx = new UserRefIdx();
    private final AiqStrategy aiqStrategy = new AiqStrategy();
    private final AiqGroupId aiqGroupId = new AiqGroupId();
    private final RawRecord unknown = new RawRecord();
    private Case selected = Case.FIRM;

    /**
     * Returns the case this branch holds: the one its rules selected, or the one last chosen.
     *
     * @return the selected case
     */
    public Case selected() {
        return selected;
    }

    /**
     * Chooses the case to encode. Its holder writes the OrderAcceptedOptionalField that selects it, so its bytes select it again.
     *
     * @param value the case
     */
    public void select(Case value) {
        selected = Objects.requireNonNull(value, "value");
    }

    /**
     * Returns the case a OrderAcceptedOptionalField selects, rules tried in order.
     *
     * @param orderAcceptedOptionalField the field its holder read before this branch
     * @return the selected case, or null when it selects none
     */
    public static Case caseFor(OrderAcceptedOptionalFieldField orderAcceptedOptionalField) {
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.FIRM) {
            return Case.FIRM;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.MINQTY) {
            return Case.MIN_QTY;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.CUSTOMERTYPE) {
            return Case.CUSTOMER_TYPE;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.MAXFLOOR) {
            return Case.MAX_FLOOR;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.PRICETYPE) {
            return Case.PRICE_TYPE;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.PEGOFFSET) {
            return Case.PEG_OFFSET;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.DISCRETIONPRICE) {
            return Case.DISCRETION_PRICE;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.DISCRETIONPRICETYPE) {
            return Case.DISCRETION_PRICE_TYPE;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.DISCRETIONPEGOFFSET) {
            return Case.DISCRETION_PEG_OFFSET;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.POSTONLY) {
            return Case.POST_ONLY;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.RANDOMRESERVES) {
            return Case.RANDOM_RESERVES;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.ROUTE) {
            return Case.ROUTE;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.EXPIRETIME) {
            return Case.EXPIRE_TIME;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.TRADENOW) {
            return Case.TRADE_NOW;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.HANDLEINST) {
            return Case.HANDLE_INST;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.BBO_WEIGHT_INDICATOR) {
            return Case.BBO_WEIGHT_INDICATOR;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.GROUP_ID) {
            return Case.GROUP_ID;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.SHARES_LOCATED) {
            return Case.SHARES_LOCATED;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.USERREFIDX) {
            return Case.USER_REF_IDX;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.AIQ_STRATEGY) {
            return Case.AIQ_STRATEGY;
        }
        if (orderAcceptedOptionalField.value() == OrderAcceptedOptionalField.AIQ_GROUP_ID) {
            return Case.AIQ_GROUP_ID;
        }
        return null;
    }

    /**
     * Writes the OrderAcceptedOptionalField that selects the case this branch holds.
     *
     * @param orderAcceptedOptionalField the field its holder writes before this branch
     */
    public void writeKey(OrderAcceptedOptionalFieldField orderAcceptedOptionalField) {
        switch (selected) {
            case FIRM -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.FIRM);
            case MIN_QTY -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.MINQTY);
            case CUSTOMER_TYPE -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.CUSTOMERTYPE);
            case MAX_FLOOR -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.MAXFLOOR);
            case PRICE_TYPE -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.PRICETYPE);
            case PEG_OFFSET -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.PEGOFFSET);
            case DISCRETION_PRICE -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.DISCRETIONPRICE);
            case DISCRETION_PRICE_TYPE -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.DISCRETIONPRICETYPE);
            case DISCRETION_PEG_OFFSET -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.DISCRETIONPEGOFFSET);
            case POST_ONLY -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.POSTONLY);
            case RANDOM_RESERVES -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.RANDOMRESERVES);
            case ROUTE -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.ROUTE);
            case EXPIRE_TIME -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.EXPIRETIME);
            case TRADE_NOW -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.TRADENOW);
            case HANDLE_INST -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.HANDLEINST);
            case BBO_WEIGHT_INDICATOR -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.BBO_WEIGHT_INDICATOR);
            case GROUP_ID -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.GROUP_ID);
            case SHARES_LOCATED -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.SHARES_LOCATED);
            case USER_REF_IDX -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.USERREFIDX);
            case AIQ_STRATEGY -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.AIQ_STRATEGY);
            case AIQ_GROUP_ID -> orderAcceptedOptionalField.value(OrderAcceptedOptionalField.AIQ_GROUP_ID);
            case UNKNOWN -> { }
        }
    }

    /**
     * Decodes the case a OrderAcceptedOptionalField selects.
     *
     * @param orderAcceptedOptionalField the field its holder read before this branch
     * @param data   the buffer to decode from
     * @param offset the index of this branch's first byte
     * @param end    the index just past the last byte this branch may read
     * @return true when its record decoded; a key naming no declared case keeps the bytes the wire states
     */
    public boolean parseFrom(OrderAcceptedOptionalFieldField orderAcceptedOptionalField, byte[] data, int offset, int end) {
        clear();
        Case chosen = caseFor(orderAcceptedOptionalField);
        if (chosen == null) {
            chosen = Case.UNKNOWN;
        }
        selected = chosen;
        return entry().parseFrom(data, offset, end);
    }

    /**
     * Returns the Firm case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public Firm firm() {
        return firm;
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
     * Returns the CustomerType case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public CustomerType customerType() {
        return customerType;
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
     * Returns the PriceType case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceType priceType() {
        return priceType;
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
     * Returns the DiscretionPrice case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public DiscretionPrice discretionPrice() {
        return discretionPrice;
    }

    /**
     * Returns the DiscretionPriceType case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public DiscretionPriceType discretionPriceType() {
        return discretionPriceType;
    }

    /**
     * Returns the DiscretionPegOffset case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public DiscretionPegOffset discretionPegOffset() {
        return discretionPegOffset;
    }

    /**
     * Returns the PostOnly case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PostOnly postOnly() {
        return postOnly;
    }

    /**
     * Returns the RandomReserves case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public RandomReserves randomReserves() {
        return randomReserves;
    }

    /**
     * Returns the Route case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public Route route() {
        return route;
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
     * Returns the TradeNow case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public TradeNow tradeNow() {
        return tradeNow;
    }

    /**
     * Returns the HandleInst case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public HandleInst handleInst() {
        return handleInst;
    }

    /**
     * Returns the BboWeightIndicator case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BboWeightIndicator bboWeightIndicator() {
        return bboWeightIndicator;
    }

    /**
     * Returns the GroupId case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public GroupId groupId() {
        return groupId;
    }

    /**
     * Returns the SharesLocated case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public SharesLocated sharesLocated() {
        return sharesLocated;
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
     * Returns the AiqStrategy case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AiqStrategy aiqStrategy() {
        return aiqStrategy;
    }

    /**
     * Returns the AiqGroupId case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public AiqGroupId aiqGroupId() {
        return aiqGroupId;
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
            case FIRM -> firm;
            case MIN_QTY -> minQty;
            case CUSTOMER_TYPE -> customerType;
            case MAX_FLOOR -> maxFloor;
            case PRICE_TYPE -> priceType;
            case PEG_OFFSET -> pegOffset;
            case DISCRETION_PRICE -> discretionPrice;
            case DISCRETION_PRICE_TYPE -> discretionPriceType;
            case DISCRETION_PEG_OFFSET -> discretionPegOffset;
            case POST_ONLY -> postOnly;
            case RANDOM_RESERVES -> randomReserves;
            case ROUTE -> route;
            case EXPIRE_TIME -> expireTime;
            case TRADE_NOW -> tradeNow;
            case HANDLE_INST -> handleInst;
            case BBO_WEIGHT_INDICATOR -> bboWeightIndicator;
            case GROUP_ID -> groupId;
            case SHARES_LOCATED -> sharesLocated;
            case USER_REF_IDX -> userRefIdx;
            case AIQ_STRATEGY -> aiqStrategy;
            case AIQ_GROUP_ID -> aiqGroupId;
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
        firm.clear();
        minQty.clear();
        customerType.clear();
        maxFloor.clear();
        priceType.clear();
        pegOffset.clear();
        discretionPrice.clear();
        discretionPriceType.clear();
        discretionPegOffset.clear();
        postOnly.clear();
        randomReserves.clear();
        route.clear();
        expireTime.clear();
        tradeNow.clear();
        handleInst.clear();
        bboWeightIndicator.clear();
        groupId.clear();
        sharesLocated.clear();
        userRefIdx.clear();
        aiqStrategy.clear();
        aiqGroupId.clear();
        unknown.clear();
        selected = Case.FIRM;
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
        return other instanceof OrderAcceptedOptionalValue branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof OrderAcceptedOptionalValue branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
