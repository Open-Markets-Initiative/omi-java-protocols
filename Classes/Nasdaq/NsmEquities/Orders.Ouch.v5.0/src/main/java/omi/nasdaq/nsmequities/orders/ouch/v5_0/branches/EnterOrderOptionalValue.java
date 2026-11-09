package omi.nasdaq.nsmequities.orders.ouch.v5_0.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.enums.EnterOrderOptionalField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.EnterOrderOptionalFieldField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.AiqGroupId;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.AiqStrategy;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.CustomerType;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.DiscretionPegOffset;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.DiscretionPrice;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.DiscretionPriceType;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.ExpireTime;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.Firm;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.GroupId;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.HandleInst;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.LocateBroker;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.MaxFloor;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.MinQty;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.PegOffset;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.PostOnly;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.PriceType;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.RandomReserves;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.SharesLocated;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.TradeNow;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.UserRefIdx;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Field;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.GroupEntry;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.PrintOptions;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.RawRecord;

/**
 * The EnterOrderOptionalValue branch: one of 20 records, each as wide as its own fields, chosen by the EnterOrderOptionalField its holder reads before it.
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
         * Selected when its holder's EnterOrderOptionalField is 2.
         */
        FIRM,
        /**
         * Selected when its holder's EnterOrderOptionalField is 3.
         */
        MIN_QTY,
        /**
         * Selected when its holder's EnterOrderOptionalField is 4.
         */
        CUSTOMER_TYPE,
        /**
         * Selected when its holder's EnterOrderOptionalField is 5.
         */
        MAX_FLOOR,
        /**
         * Selected when its holder's EnterOrderOptionalField is 6.
         */
        PRICE_TYPE,
        /**
         * Selected when its holder's EnterOrderOptionalField is 7.
         */
        PEG_OFFSET,
        /**
         * Selected when its holder's EnterOrderOptionalField is 9.
         */
        DISCRETION_PRICE,
        /**
         * Selected when its holder's EnterOrderOptionalField is 10.
         */
        DISCRETION_PRICE_TYPE,
        /**
         * Selected when its holder's EnterOrderOptionalField is 11.
         */
        DISCRETION_PEG_OFFSET,
        /**
         * Selected when its holder's EnterOrderOptionalField is 12.
         */
        POST_ONLY,
        /**
         * Selected when its holder's EnterOrderOptionalField is 13.
         */
        RANDOM_RESERVES,
        /**
         * Selected when its holder's EnterOrderOptionalField is 15.
         */
        EXPIRE_TIME,
        /**
         * Selected when its holder's EnterOrderOptionalField is 16.
         */
        TRADE_NOW,
        /**
         * Selected when its holder's EnterOrderOptionalField is 17.
         */
        HANDLE_INST,
        /**
         * Selected when its holder's EnterOrderOptionalField is 24.
         */
        GROUP_ID,
        /**
         * Selected when its holder's EnterOrderOptionalField is 25.
         */
        SHARES_LOCATED,
        /**
         * Selected when its holder's EnterOrderOptionalField is 26.
         */
        LOCATE_BROKER,
        /**
         * Selected when its holder's EnterOrderOptionalField is 28.
         */
        USER_REF_IDX,
        /**
         * Selected when its holder's EnterOrderOptionalField is 29.
         */
        AIQ_STRATEGY,
        /**
         * Selected when its holder's EnterOrderOptionalField is 30.
         */
        AIQ_GROUP_ID,
        /**
         * Selected when its holder's EnterOrderOptionalField names no case above: the bytes the wire states for it, kept whole.
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
    private final ExpireTime expireTime = new ExpireTime();
    private final TradeNow tradeNow = new TradeNow();
    private final HandleInst handleInst = new HandleInst();
    private final GroupId groupId = new GroupId();
    private final SharesLocated sharesLocated = new SharesLocated();
    private final LocateBroker locateBroker = new LocateBroker();
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
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.FIRM) {
            return Case.FIRM;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.MINQTY) {
            return Case.MIN_QTY;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.CUSTOMERTYPE) {
            return Case.CUSTOMER_TYPE;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.MAXFLOOR) {
            return Case.MAX_FLOOR;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.PRICETYPE) {
            return Case.PRICE_TYPE;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.PEGOFFSET) {
            return Case.PEG_OFFSET;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.DISCRETIONPRICE) {
            return Case.DISCRETION_PRICE;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.DISCRETIONPRICETYPE) {
            return Case.DISCRETION_PRICE_TYPE;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.DISCRETIONPEGOFFSET) {
            return Case.DISCRETION_PEG_OFFSET;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.POSTONLY) {
            return Case.POST_ONLY;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.RANDOMRESERVES) {
            return Case.RANDOM_RESERVES;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.EXPIRETIME) {
            return Case.EXPIRE_TIME;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.TRADENOW) {
            return Case.TRADE_NOW;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.HANDLEINST) {
            return Case.HANDLE_INST;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.GROUP_ID) {
            return Case.GROUP_ID;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.SHARES_LOCATED) {
            return Case.SHARES_LOCATED;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.LOCATE_BROKER) {
            return Case.LOCATE_BROKER;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.USERREFIDX) {
            return Case.USER_REF_IDX;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.AIQ_STRATEGY) {
            return Case.AIQ_STRATEGY;
        }
        if (enterOrderOptionalField.value() == EnterOrderOptionalField.AIQ_GROUP_ID) {
            return Case.AIQ_GROUP_ID;
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
            case FIRM -> enterOrderOptionalField.value(EnterOrderOptionalField.FIRM);
            case MIN_QTY -> enterOrderOptionalField.value(EnterOrderOptionalField.MINQTY);
            case CUSTOMER_TYPE -> enterOrderOptionalField.value(EnterOrderOptionalField.CUSTOMERTYPE);
            case MAX_FLOOR -> enterOrderOptionalField.value(EnterOrderOptionalField.MAXFLOOR);
            case PRICE_TYPE -> enterOrderOptionalField.value(EnterOrderOptionalField.PRICETYPE);
            case PEG_OFFSET -> enterOrderOptionalField.value(EnterOrderOptionalField.PEGOFFSET);
            case DISCRETION_PRICE -> enterOrderOptionalField.value(EnterOrderOptionalField.DISCRETIONPRICE);
            case DISCRETION_PRICE_TYPE -> enterOrderOptionalField.value(EnterOrderOptionalField.DISCRETIONPRICETYPE);
            case DISCRETION_PEG_OFFSET -> enterOrderOptionalField.value(EnterOrderOptionalField.DISCRETIONPEGOFFSET);
            case POST_ONLY -> enterOrderOptionalField.value(EnterOrderOptionalField.POSTONLY);
            case RANDOM_RESERVES -> enterOrderOptionalField.value(EnterOrderOptionalField.RANDOMRESERVES);
            case EXPIRE_TIME -> enterOrderOptionalField.value(EnterOrderOptionalField.EXPIRETIME);
            case TRADE_NOW -> enterOrderOptionalField.value(EnterOrderOptionalField.TRADENOW);
            case HANDLE_INST -> enterOrderOptionalField.value(EnterOrderOptionalField.HANDLEINST);
            case GROUP_ID -> enterOrderOptionalField.value(EnterOrderOptionalField.GROUP_ID);
            case SHARES_LOCATED -> enterOrderOptionalField.value(EnterOrderOptionalField.SHARES_LOCATED);
            case LOCATE_BROKER -> enterOrderOptionalField.value(EnterOrderOptionalField.LOCATE_BROKER);
            case USER_REF_IDX -> enterOrderOptionalField.value(EnterOrderOptionalField.USERREFIDX);
            case AIQ_STRATEGY -> enterOrderOptionalField.value(EnterOrderOptionalField.AIQ_STRATEGY);
            case AIQ_GROUP_ID -> enterOrderOptionalField.value(EnterOrderOptionalField.AIQ_GROUP_ID);
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
     * Returns the LocateBroker case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public LocateBroker locateBroker() {
        return locateBroker;
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
            case EXPIRE_TIME -> expireTime;
            case TRADE_NOW -> tradeNow;
            case HANDLE_INST -> handleInst;
            case GROUP_ID -> groupId;
            case SHARES_LOCATED -> sharesLocated;
            case LOCATE_BROKER -> locateBroker;
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
        expireTime.clear();
        tradeNow.clear();
        handleInst.clear();
        groupId.clear();
        sharesLocated.clear();
        locateBroker.clear();
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
