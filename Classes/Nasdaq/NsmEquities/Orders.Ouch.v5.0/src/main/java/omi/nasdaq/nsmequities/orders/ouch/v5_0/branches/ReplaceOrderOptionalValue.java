package omi.nasdaq.nsmequities.orders.ouch.v5_0.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.enums.ReplaceOrderOptionalField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.ReplaceOrderOptionalFieldField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.AiqGroupId;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.AiqStrategy;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.DiscretionPegOffset;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.DiscretionPrice;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.DiscretionPriceType;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.ExpireTime;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.HandleInst;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.LocateBroker;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.MaxFloor;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.MinQty;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.PegOffset;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.PostOnly;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.PriceType;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.RandomReserves;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.SharesLocated;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.Side;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.TradeNow;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.UserRefIdx;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Field;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.GroupEntry;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.PrintOptions;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.RawRecord;

/**
 * The ReplaceOrderOptionalValue branch: one of 18 records, each as wide as its own fields, chosen by the ReplaceOrderOptionalField its holder reads before it.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class ReplaceOrderOptionalValue implements GroupEntry {

    /**
     * The width of this branch's narrowest case: the least it occupies on the wire.
     */
    public static final int MINIMUM_BYTE_LENGTH = 0;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "ReplaceOrderOptionalValue";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 3.
         */
        MIN_QTY,
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 5.
         */
        MAX_FLOOR,
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 6.
         */
        PRICE_TYPE,
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 12.
         */
        POST_ONLY,
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 15.
         */
        EXPIRE_TIME,
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 16.
         */
        TRADE_NOW,
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 17.
         */
        HANDLE_INST,
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 13.
         */
        RANDOM_RESERVES,
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 7.
         */
        PEG_OFFSET,
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 9.
         */
        DISCRETION_PRICE,
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 10.
         */
        DISCRETION_PRICE_TYPE,
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 11.
         */
        DISCRETION_PEG_OFFSET,
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 25.
         */
        SHARES_LOCATED,
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 26.
         */
        LOCATE_BROKER,
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 28.
         */
        USER_REF_IDX,
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 27.
         */
        SIDE,
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 29.
         */
        AIQ_STRATEGY,
        /**
         * Selected when its holder's ReplaceOrderOptionalField is 30.
         */
        AIQ_GROUP_ID,
        /**
         * Selected when its holder's ReplaceOrderOptionalField names no case above: the bytes the wire states for it, kept whole.
         */
        UNKNOWN
    }

    private final MinQty minQty = new MinQty();
    private final MaxFloor maxFloor = new MaxFloor();
    private final PriceType priceType = new PriceType();
    private final PostOnly postOnly = new PostOnly();
    private final ExpireTime expireTime = new ExpireTime();
    private final TradeNow tradeNow = new TradeNow();
    private final HandleInst handleInst = new HandleInst();
    private final RandomReserves randomReserves = new RandomReserves();
    private final PegOffset pegOffset = new PegOffset();
    private final DiscretionPrice discretionPrice = new DiscretionPrice();
    private final DiscretionPriceType discretionPriceType = new DiscretionPriceType();
    private final DiscretionPegOffset discretionPegOffset = new DiscretionPegOffset();
    private final SharesLocated sharesLocated = new SharesLocated();
    private final LocateBroker locateBroker = new LocateBroker();
    private final UserRefIdx userRefIdx = new UserRefIdx();
    private final Side side = new Side();
    private final AiqStrategy aiqStrategy = new AiqStrategy();
    private final AiqGroupId aiqGroupId = new AiqGroupId();
    private final RawRecord unknown = new RawRecord();
    private Case selected = Case.MIN_QTY;

    /**
     * Returns the case this branch holds: the one its rules selected, or the one last chosen.
     *
     * @return the selected case
     */
    public Case selected() {
        return selected;
    }

    /**
     * Chooses the case to encode. Its holder writes the ReplaceOrderOptionalField that selects it, so its bytes select it again.
     *
     * @param value the case
     */
    public void select(Case value) {
        selected = Objects.requireNonNull(value, "value");
    }

    /**
     * Returns the case a ReplaceOrderOptionalField selects, rules tried in order.
     *
     * @param replaceOrderOptionalField the field its holder read before this branch
     * @return the selected case, or null when it selects none
     */
    public static Case caseFor(ReplaceOrderOptionalFieldField replaceOrderOptionalField) {
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.MINQTY) {
            return Case.MIN_QTY;
        }
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.MAXFLOOR) {
            return Case.MAX_FLOOR;
        }
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.PRICETYPE) {
            return Case.PRICE_TYPE;
        }
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.POSTONLY) {
            return Case.POST_ONLY;
        }
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.EXPIRETIME) {
            return Case.EXPIRE_TIME;
        }
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.TRADENOW) {
            return Case.TRADE_NOW;
        }
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.HANDLEINST) {
            return Case.HANDLE_INST;
        }
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.RANDOMRESERVES) {
            return Case.RANDOM_RESERVES;
        }
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.PEGOFFSET) {
            return Case.PEG_OFFSET;
        }
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.DISCRETIONPRICE) {
            return Case.DISCRETION_PRICE;
        }
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.DISCRETIONPRICETYPE) {
            return Case.DISCRETION_PRICE_TYPE;
        }
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.DISCRETIONPEGOFFSET) {
            return Case.DISCRETION_PEG_OFFSET;
        }
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.SHARES_LOCATED) {
            return Case.SHARES_LOCATED;
        }
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.LOCATE_BROKER) {
            return Case.LOCATE_BROKER;
        }
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.USERREFIDX) {
            return Case.USER_REF_IDX;
        }
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.SIDE) {
            return Case.SIDE;
        }
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.AIQ_STRATEGY) {
            return Case.AIQ_STRATEGY;
        }
        if (replaceOrderOptionalField.value() == ReplaceOrderOptionalField.AIQ_GROUP_ID) {
            return Case.AIQ_GROUP_ID;
        }
        return null;
    }

    /**
     * Writes the ReplaceOrderOptionalField that selects the case this branch holds.
     *
     * @param replaceOrderOptionalField the field its holder writes before this branch
     */
    public void writeKey(ReplaceOrderOptionalFieldField replaceOrderOptionalField) {
        switch (selected) {
            case MIN_QTY -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.MINQTY);
            case MAX_FLOOR -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.MAXFLOOR);
            case PRICE_TYPE -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.PRICETYPE);
            case POST_ONLY -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.POSTONLY);
            case EXPIRE_TIME -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.EXPIRETIME);
            case TRADE_NOW -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.TRADENOW);
            case HANDLE_INST -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.HANDLEINST);
            case RANDOM_RESERVES -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.RANDOMRESERVES);
            case PEG_OFFSET -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.PEGOFFSET);
            case DISCRETION_PRICE -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.DISCRETIONPRICE);
            case DISCRETION_PRICE_TYPE -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.DISCRETIONPRICETYPE);
            case DISCRETION_PEG_OFFSET -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.DISCRETIONPEGOFFSET);
            case SHARES_LOCATED -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.SHARES_LOCATED);
            case LOCATE_BROKER -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.LOCATE_BROKER);
            case USER_REF_IDX -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.USERREFIDX);
            case SIDE -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.SIDE);
            case AIQ_STRATEGY -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.AIQ_STRATEGY);
            case AIQ_GROUP_ID -> replaceOrderOptionalField.value(ReplaceOrderOptionalField.AIQ_GROUP_ID);
            case UNKNOWN -> { }
        }
    }

    /**
     * Decodes the case a ReplaceOrderOptionalField selects.
     *
     * @param replaceOrderOptionalField the field its holder read before this branch
     * @param data   the buffer to decode from
     * @param offset the index of this branch's first byte
     * @param end    the index just past the last byte this branch may read
     * @return true when its record decoded; a key naming no declared case keeps the bytes the wire states
     */
    public boolean parseFrom(ReplaceOrderOptionalFieldField replaceOrderOptionalField, byte[] data, int offset, int end) {
        clear();
        Case chosen = caseFor(replaceOrderOptionalField);
        if (chosen == null) {
            chosen = Case.UNKNOWN;
        }
        selected = chosen;
        return entry().parseFrom(data, offset, end);
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
     * Returns the PriceType case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public PriceType priceType() {
        return priceType;
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
     * Returns the RandomReserves case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public RandomReserves randomReserves() {
        return randomReserves;
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
     * Returns the Side case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public Side side() {
        return side;
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
            case MIN_QTY -> minQty;
            case MAX_FLOOR -> maxFloor;
            case PRICE_TYPE -> priceType;
            case POST_ONLY -> postOnly;
            case EXPIRE_TIME -> expireTime;
            case TRADE_NOW -> tradeNow;
            case HANDLE_INST -> handleInst;
            case RANDOM_RESERVES -> randomReserves;
            case PEG_OFFSET -> pegOffset;
            case DISCRETION_PRICE -> discretionPrice;
            case DISCRETION_PRICE_TYPE -> discretionPriceType;
            case DISCRETION_PEG_OFFSET -> discretionPegOffset;
            case SHARES_LOCATED -> sharesLocated;
            case LOCATE_BROKER -> locateBroker;
            case USER_REF_IDX -> userRefIdx;
            case SIDE -> side;
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
        minQty.clear();
        maxFloor.clear();
        priceType.clear();
        postOnly.clear();
        expireTime.clear();
        tradeNow.clear();
        handleInst.clear();
        randomReserves.clear();
        pegOffset.clear();
        discretionPrice.clear();
        discretionPriceType.clear();
        discretionPegOffset.clear();
        sharesLocated.clear();
        locateBroker.clear();
        userRefIdx.clear();
        side.clear();
        aiqStrategy.clear();
        aiqGroupId.clear();
        unknown.clear();
        selected = Case.MIN_QTY;
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
        return other instanceof ReplaceOrderOptionalValue branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof ReplaceOrderOptionalValue branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
