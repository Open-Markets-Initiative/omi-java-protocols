package omi.nasdaq.nsmequities.orders.ouch.v5_0.branches;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.enums.ReplacedMessageOptionalField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.fields.ReplacedMessageOptionalFieldField;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.AiqGroupId;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.AiqStrategy;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.BboWeightIndicator;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.ExpireTime;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.Firm;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.HandleInst;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.MaxFloor;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.MinQty;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.PostOnly;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.PriceType;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.TradeNow;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.structs.UserRefIdx;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.Field;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.GroupEntry;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.PrintOptions;
import omi.nasdaq.nsmequities.orders.ouch.v5_0.types.RawRecord;

/**
 * The ReplacedMessageOptionalValue branch: one of 12 records, each as wide as its own fields, chosen by the ReplacedMessageOptionalField its holder reads before it.
 *
 * <p>Branch</p>
 *
 * <p>A case's own rules, such as one scaling its digits, are not applied: each case holds its fields as they arrive.</p>
 */
public final class ReplacedMessageOptionalValue implements GroupEntry {

    /**
     * The width of this branch's narrowest case: the least it occupies on the wire.
     */
    public static final int MINIMUM_BYTE_LENGTH = 0;

    /**
     * This branch's declared name.
     */
    public static final String NAME = "ReplacedMessageOptionalValue";

    /**
     * The cases of this branch, in the order their rules are tried.
     */
    public enum Case {
        /**
         * Selected when its holder's ReplacedMessageOptionalField is 2.
         */
        FIRM,
        /**
         * Selected when its holder's ReplacedMessageOptionalField is 3.
         */
        MIN_QTY,
        /**
         * Selected when its holder's ReplacedMessageOptionalField is 5.
         */
        MAX_FLOOR,
        /**
         * Selected when its holder's ReplacedMessageOptionalField is 6.
         */
        PRICE_TYPE,
        /**
         * Selected when its holder's ReplacedMessageOptionalField is 12.
         */
        POST_ONLY,
        /**
         * Selected when its holder's ReplacedMessageOptionalField is 15.
         */
        EXPIRE_TIME,
        /**
         * Selected when its holder's ReplacedMessageOptionalField is 16.
         */
        TRADE_NOW,
        /**
         * Selected when its holder's ReplacedMessageOptionalField is 17.
         */
        HANDLE_INST,
        /**
         * Selected when its holder's ReplacedMessageOptionalField is 18.
         */
        BBO_WEIGHT_INDICATOR,
        /**
         * Selected when its holder's ReplacedMessageOptionalField is 28.
         */
        USER_REF_IDX,
        /**
         * Selected when its holder's ReplacedMessageOptionalField is 29.
         */
        AIQ_STRATEGY,
        /**
         * Selected when its holder's ReplacedMessageOptionalField is 30.
         */
        AIQ_GROUP_ID,
        /**
         * Selected when its holder's ReplacedMessageOptionalField names no case above: the bytes the wire states for it, kept whole.
         */
        UNKNOWN
    }

    private final Firm firm = new Firm();
    private final MinQty minQty = new MinQty();
    private final MaxFloor maxFloor = new MaxFloor();
    private final PriceType priceType = new PriceType();
    private final PostOnly postOnly = new PostOnly();
    private final ExpireTime expireTime = new ExpireTime();
    private final TradeNow tradeNow = new TradeNow();
    private final HandleInst handleInst = new HandleInst();
    private final BboWeightIndicator bboWeightIndicator = new BboWeightIndicator();
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
     * Chooses the case to encode. Its holder writes the ReplacedMessageOptionalField that selects it, so its bytes select it again.
     *
     * @param value the case
     */
    public void select(Case value) {
        selected = Objects.requireNonNull(value, "value");
    }

    /**
     * Returns the case a ReplacedMessageOptionalField selects, rules tried in order.
     *
     * @param replacedMessageOptionalField the field its holder read before this branch
     * @return the selected case, or null when it selects none
     */
    public static Case caseFor(ReplacedMessageOptionalFieldField replacedMessageOptionalField) {
        if (replacedMessageOptionalField.value() == ReplacedMessageOptionalField.FIRM) {
            return Case.FIRM;
        }
        if (replacedMessageOptionalField.value() == ReplacedMessageOptionalField.MINQTY) {
            return Case.MIN_QTY;
        }
        if (replacedMessageOptionalField.value() == ReplacedMessageOptionalField.MAXFLOOR) {
            return Case.MAX_FLOOR;
        }
        if (replacedMessageOptionalField.value() == ReplacedMessageOptionalField.PRICETYPE) {
            return Case.PRICE_TYPE;
        }
        if (replacedMessageOptionalField.value() == ReplacedMessageOptionalField.POSTONLY) {
            return Case.POST_ONLY;
        }
        if (replacedMessageOptionalField.value() == ReplacedMessageOptionalField.EXPIRETIME) {
            return Case.EXPIRE_TIME;
        }
        if (replacedMessageOptionalField.value() == ReplacedMessageOptionalField.TRADENOW) {
            return Case.TRADE_NOW;
        }
        if (replacedMessageOptionalField.value() == ReplacedMessageOptionalField.HANDLEINST) {
            return Case.HANDLE_INST;
        }
        if (replacedMessageOptionalField.value() == ReplacedMessageOptionalField.BBO_WEIGHT_INDICATOR) {
            return Case.BBO_WEIGHT_INDICATOR;
        }
        if (replacedMessageOptionalField.value() == ReplacedMessageOptionalField.USERREFIDX) {
            return Case.USER_REF_IDX;
        }
        if (replacedMessageOptionalField.value() == ReplacedMessageOptionalField.AIQ_STRATEGY) {
            return Case.AIQ_STRATEGY;
        }
        if (replacedMessageOptionalField.value() == ReplacedMessageOptionalField.AIQ_GROUP_ID) {
            return Case.AIQ_GROUP_ID;
        }
        return null;
    }

    /**
     * Writes the ReplacedMessageOptionalField that selects the case this branch holds.
     *
     * @param replacedMessageOptionalField the field its holder writes before this branch
     */
    public void writeKey(ReplacedMessageOptionalFieldField replacedMessageOptionalField) {
        switch (selected) {
            case FIRM -> replacedMessageOptionalField.value(ReplacedMessageOptionalField.FIRM);
            case MIN_QTY -> replacedMessageOptionalField.value(ReplacedMessageOptionalField.MINQTY);
            case MAX_FLOOR -> replacedMessageOptionalField.value(ReplacedMessageOptionalField.MAXFLOOR);
            case PRICE_TYPE -> replacedMessageOptionalField.value(ReplacedMessageOptionalField.PRICETYPE);
            case POST_ONLY -> replacedMessageOptionalField.value(ReplacedMessageOptionalField.POSTONLY);
            case EXPIRE_TIME -> replacedMessageOptionalField.value(ReplacedMessageOptionalField.EXPIRETIME);
            case TRADE_NOW -> replacedMessageOptionalField.value(ReplacedMessageOptionalField.TRADENOW);
            case HANDLE_INST -> replacedMessageOptionalField.value(ReplacedMessageOptionalField.HANDLEINST);
            case BBO_WEIGHT_INDICATOR -> replacedMessageOptionalField.value(ReplacedMessageOptionalField.BBO_WEIGHT_INDICATOR);
            case USER_REF_IDX -> replacedMessageOptionalField.value(ReplacedMessageOptionalField.USERREFIDX);
            case AIQ_STRATEGY -> replacedMessageOptionalField.value(ReplacedMessageOptionalField.AIQ_STRATEGY);
            case AIQ_GROUP_ID -> replacedMessageOptionalField.value(ReplacedMessageOptionalField.AIQ_GROUP_ID);
            case UNKNOWN -> { }
        }
    }

    /**
     * Decodes the case a ReplacedMessageOptionalField selects.
     *
     * @param replacedMessageOptionalField the field its holder read before this branch
     * @param data   the buffer to decode from
     * @param offset the index of this branch's first byte
     * @param end    the index just past the last byte this branch may read
     * @return true when its record decoded; a key naming no declared case keeps the bytes the wire states
     */
    public boolean parseFrom(ReplacedMessageOptionalFieldField replacedMessageOptionalField, byte[] data, int offset, int end) {
        clear();
        Case chosen = caseFor(replacedMessageOptionalField);
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
     * Returns the BboWeightIndicator case's record, which holds this branch's bytes when it is selected.
     *
     * @return the case's record
     */
    public BboWeightIndicator bboWeightIndicator() {
        return bboWeightIndicator;
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
            case MAX_FLOOR -> maxFloor;
            case PRICE_TYPE -> priceType;
            case POST_ONLY -> postOnly;
            case EXPIRE_TIME -> expireTime;
            case TRADE_NOW -> tradeNow;
            case HANDLE_INST -> handleInst;
            case BBO_WEIGHT_INDICATOR -> bboWeightIndicator;
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
        maxFloor.clear();
        priceType.clear();
        postOnly.clear();
        expireTime.clear();
        tradeNow.clear();
        handleInst.clear();
        bboWeightIndicator.clear();
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
        return other instanceof ReplacedMessageOptionalValue branch && branch.selected == selected ? entry().diffFields(branch.entry()) : fields();
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
        return this == other || other instanceof ReplacedMessageOptionalValue branch && branch.selected == selected && branch.entry().equals(entry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selected, entry());
    }
}
