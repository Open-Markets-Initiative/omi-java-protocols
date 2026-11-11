package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.txse.txseequities.seed.rake.v1_0.fields.ClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderAcceptedBitFieldsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderAcceptedDisplayPriceField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderAcceptedExpireTimeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderAcceptedLocateBrokerField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderAcceptedMaxFloorQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderAcceptedMaxReplenishQtyRangeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderAcceptedMaxReplenishTimeRangeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderAcceptedMemberGroupField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderAcceptedMinQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderAcceptedMpidField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderAcceptedPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderAcceptedPriceSlideInstructionField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderAcceptedRankPriceField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderAcceptedReferencePriceTargetField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderAcceptedSelfMatchInstructionField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderAcceptedSelfMatchScopeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderAcceptedUserDataField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.PriceField;
import omi.txse.txseequities.seed.rake.v1_0.fields.SymbolIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the LimitOrderAcceptedMessage message from the Seed protocol.
 *
 * <p>Acknowledges acceptance of a submitted LimitOrder.</p>
 */
public final class LimitOrderAcceptedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'I';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 46;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Limit Order Accepted Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final LimitOrderAcceptedPresenceBitsField limitOrderAcceptedPresenceBits = new LimitOrderAcceptedPresenceBitsField();

    /**
     * Transaction time.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Exchange-assigned order identifier.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Client-specified order identifier that must increase with each new order.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Order quantity.
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Bitfield used in LimitOrder, LimitOrderAccepted, and LimitOrderRejected messages.
     */
    private final LimitOrderAcceptedBitFieldsField limitOrderAcceptedBitFields = new LimitOrderAcceptedBitFieldsField();

    /**
     * Symbol identifier.
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Limit price.
     */
    private final PriceField price = new PriceField();

    /**
     * Enum SelfMatchScope.
     */
    private final LimitOrderAcceptedSelfMatchScopeField limitOrderAcceptedSelfMatchScope = new LimitOrderAcceptedSelfMatchScopeField();

    /**
     * Enum LimitOrderAcceptedSelfMatchInstruction.
     */
    private final LimitOrderAcceptedSelfMatchInstructionField limitOrderAcceptedSelfMatchInstruction = new LimitOrderAcceptedSelfMatchInstructionField();

    /**
     * Enum LimitOrderAcceptedPriceSlideInstruction.
     */
    private final LimitOrderAcceptedPriceSlideInstructionField limitOrderAcceptedPriceSlideInstruction = new LimitOrderAcceptedPriceSlideInstructionField();

    /**
     * Number of shares that must be executed to execute any shares.
     */
    private final LimitOrderAcceptedMinQtyField limitOrderAcceptedMinQty = new LimitOrderAcceptedMinQtyField();

    /**
     * Quantity to be displayed at one time with remaining quantity not displayed on the book.
     */
    private final LimitOrderAcceptedMaxFloorQtyField limitOrderAcceptedMaxFloorQty = new LimitOrderAcceptedMaxFloorQtyField();

    /**
     * Defines the maximum range to be used when calculating a random refresh quantity.
     */
    private final LimitOrderAcceptedMaxReplenishQtyRangeField limitOrderAcceptedMaxReplenishQtyRange = new LimitOrderAcceptedMaxReplenishQtyRangeField();

    /**
     * Defines the maximum range to be used when calculating a random refresh time, in nanoseconds.
     */
    private final LimitOrderAcceptedMaxReplenishTimeRangeField limitOrderAcceptedMaxReplenishTimeRange = new LimitOrderAcceptedMaxReplenishTimeRangeField();

    /**
     * The target relative to the reference base price in basis points of the NBBO spread.
     */
    private final LimitOrderAcceptedReferencePriceTargetField limitOrderAcceptedReferencePriceTarget = new LimitOrderAcceptedReferencePriceTargetField();

    /**
     * Timestamp at which the order's open quantity will be canceled, valid only with GTT time in force.
     */
    private final LimitOrderAcceptedExpireTimeField limitOrderAcceptedExpireTime = new LimitOrderAcceptedExpireTimeField();

    /**
     * Pass-through field for use by clients, not used by the Exchange.
     */
    private final LimitOrderAcceptedUserDataField limitOrderAcceptedUserData = new LimitOrderAcceptedUserDataField();

    /**
     * Market Participant Identifier.
     */
    private final LimitOrderAcceptedMpidField limitOrderAcceptedMpid = new LimitOrderAcceptedMpidField();

    /**
     * Member supplied grouping.
     */
    private final LimitOrderAcceptedMemberGroupField limitOrderAcceptedMemberGroup = new LimitOrderAcceptedMemberGroupField();

    /**
     * Identifies the broker that has loaned the stock to settle the short sale.
     */
    private final LimitOrderAcceptedLocateBrokerField limitOrderAcceptedLocateBroker = new LimitOrderAcceptedLocateBrokerField();

    /**
     * Optional rank price, when different from limit price.
     */
    private final LimitOrderAcceptedRankPriceField limitOrderAcceptedRankPrice = new LimitOrderAcceptedRankPriceField();

    /**
     * Optional display price, when different from limit price.
     */
    private final LimitOrderAcceptedDisplayPriceField limitOrderAcceptedDisplayPrice = new LimitOrderAcceptedDisplayPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(limitOrderAcceptedPresenceBits, transactTime, orderId, clOrdId, orderQty, limitOrderAcceptedBitFields, symbolId, price, limitOrderAcceptedSelfMatchScope, limitOrderAcceptedSelfMatchInstruction, limitOrderAcceptedPriceSlideInstruction, limitOrderAcceptedMinQty, limitOrderAcceptedMaxFloorQty, limitOrderAcceptedMaxReplenishQtyRange, limitOrderAcceptedMaxReplenishTimeRange, limitOrderAcceptedReferencePriceTarget, limitOrderAcceptedExpireTime, limitOrderAcceptedUserData, limitOrderAcceptedMpid, limitOrderAcceptedMemberGroup, limitOrderAcceptedLocateBroker, limitOrderAcceptedRankPrice, limitOrderAcceptedDisplayPrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the LimitOrderAcceptedPresenceBits field
     */
    public LimitOrderAcceptedPresenceBitsField limitOrderAcceptedPresenceBits() {
        return limitOrderAcceptedPresenceBits;
    }

    /**
     * Transaction time.
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Exchange-assigned order identifier.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Client-specified order identifier that must increase with each new order.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Order quantity.
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Bitfield used in LimitOrder, LimitOrderAccepted, and LimitOrderRejected messages.
     *
     * @return the LimitOrderAcceptedBitFields field
     */
    public LimitOrderAcceptedBitFieldsField limitOrderAcceptedBitFields() {
        return limitOrderAcceptedBitFields;
    }

    /**
     * Symbol identifier.
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
    }

    /**
     * Limit price.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Enum SelfMatchScope.
     *
     * @return the LimitOrderAcceptedSelfMatchScope field
     */
    public LimitOrderAcceptedSelfMatchScopeField limitOrderAcceptedSelfMatchScope() {
        return limitOrderAcceptedSelfMatchScope;
    }

    /**
     * Enum LimitOrderAcceptedSelfMatchInstruction.
     *
     * @return the LimitOrderAcceptedSelfMatchInstruction field
     */
    public LimitOrderAcceptedSelfMatchInstructionField limitOrderAcceptedSelfMatchInstruction() {
        return limitOrderAcceptedSelfMatchInstruction;
    }

    /**
     * Enum LimitOrderAcceptedPriceSlideInstruction.
     *
     * @return the LimitOrderAcceptedPriceSlideInstruction field
     */
    public LimitOrderAcceptedPriceSlideInstructionField limitOrderAcceptedPriceSlideInstruction() {
        return limitOrderAcceptedPriceSlideInstruction;
    }

    /**
     * Number of shares that must be executed to execute any shares.
     *
     * @return the LimitOrderAcceptedMinQty field
     */
    public LimitOrderAcceptedMinQtyField limitOrderAcceptedMinQty() {
        return limitOrderAcceptedMinQty;
    }

    /**
     * Quantity to be displayed at one time with remaining quantity not displayed on the book.
     *
     * @return the LimitOrderAcceptedMaxFloorQty field
     */
    public LimitOrderAcceptedMaxFloorQtyField limitOrderAcceptedMaxFloorQty() {
        return limitOrderAcceptedMaxFloorQty;
    }

    /**
     * Defines the maximum range to be used when calculating a random refresh quantity.
     *
     * @return the LimitOrderAcceptedMaxReplenishQtyRange field
     */
    public LimitOrderAcceptedMaxReplenishQtyRangeField limitOrderAcceptedMaxReplenishQtyRange() {
        return limitOrderAcceptedMaxReplenishQtyRange;
    }

    /**
     * Defines the maximum range to be used when calculating a random refresh time, in nanoseconds.
     *
     * @return the LimitOrderAcceptedMaxReplenishTimeRange field
     */
    public LimitOrderAcceptedMaxReplenishTimeRangeField limitOrderAcceptedMaxReplenishTimeRange() {
        return limitOrderAcceptedMaxReplenishTimeRange;
    }

    /**
     * The target relative to the reference base price in basis points of the NBBO spread.
     *
     * @return the LimitOrderAcceptedReferencePriceTarget field
     */
    public LimitOrderAcceptedReferencePriceTargetField limitOrderAcceptedReferencePriceTarget() {
        return limitOrderAcceptedReferencePriceTarget;
    }

    /**
     * Timestamp at which the order's open quantity will be canceled, valid only with GTT time in force.
     *
     * @return the LimitOrderAcceptedExpireTime field
     */
    public LimitOrderAcceptedExpireTimeField limitOrderAcceptedExpireTime() {
        return limitOrderAcceptedExpireTime;
    }

    /**
     * Pass-through field for use by clients, not used by the Exchange.
     *
     * @return the LimitOrderAcceptedUserData field
     */
    public LimitOrderAcceptedUserDataField limitOrderAcceptedUserData() {
        return limitOrderAcceptedUserData;
    }

    /**
     * Market Participant Identifier.
     *
     * @return the LimitOrderAcceptedMpid field
     */
    public LimitOrderAcceptedMpidField limitOrderAcceptedMpid() {
        return limitOrderAcceptedMpid;
    }

    /**
     * Member supplied grouping.
     *
     * @return the LimitOrderAcceptedMemberGroup field
     */
    public LimitOrderAcceptedMemberGroupField limitOrderAcceptedMemberGroup() {
        return limitOrderAcceptedMemberGroup;
    }

    /**
     * Identifies the broker that has loaned the stock to settle the short sale.
     *
     * @return the LimitOrderAcceptedLocateBroker field
     */
    public LimitOrderAcceptedLocateBrokerField limitOrderAcceptedLocateBroker() {
        return limitOrderAcceptedLocateBroker;
    }

    /**
     * Optional rank price, when different from limit price.
     *
     * @return the LimitOrderAcceptedRankPrice field
     */
    public LimitOrderAcceptedRankPriceField limitOrderAcceptedRankPrice() {
        return limitOrderAcceptedRankPrice;
    }

    /**
     * Optional display price, when different from limit price.
     *
     * @return the LimitOrderAcceptedDisplayPrice field
     */
    public LimitOrderAcceptedDisplayPriceField limitOrderAcceptedDisplayPrice() {
        return limitOrderAcceptedDisplayPrice;
    }

    /**
     * Returns whether the fields before the LimitOrderAcceptedSelfMatchScope put it on the wire.
     *
     * <p>Decode reads the LimitOrderAcceptedSelfMatchScope where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderAcceptedSelfMatchScope is on the wire
     */
    public boolean limitOrderAcceptedSelfMatchScopePresent() {
        return limitOrderAcceptedPresenceBits.hasLimitOrderAcceptedSelfMatchScope();
    }

    /**
     * Returns whether the fields before the LimitOrderAcceptedSelfMatchInstruction put it on the wire.
     *
     * <p>Decode reads the LimitOrderAcceptedSelfMatchInstruction where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderAcceptedSelfMatchInstruction is on the wire
     */
    public boolean limitOrderAcceptedSelfMatchInstructionPresent() {
        return limitOrderAcceptedPresenceBits.hasLimitOrderAcceptedSelfMatchInstruction();
    }

    /**
     * Returns whether the fields before the LimitOrderAcceptedPriceSlideInstruction put it on the wire.
     *
     * <p>Decode reads the LimitOrderAcceptedPriceSlideInstruction where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderAcceptedPriceSlideInstruction is on the wire
     */
    public boolean limitOrderAcceptedPriceSlideInstructionPresent() {
        return limitOrderAcceptedPresenceBits.hasLimitOrderAcceptedPriceSlideInstruction();
    }

    /**
     * Returns whether the fields before the LimitOrderAcceptedMinQty put it on the wire.
     *
     * <p>Decode reads the LimitOrderAcceptedMinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderAcceptedMinQty is on the wire
     */
    public boolean limitOrderAcceptedMinQtyPresent() {
        return limitOrderAcceptedPresenceBits.hasLimitOrderAcceptedMinQty();
    }

    /**
     * Returns whether the fields before the LimitOrderAcceptedMaxFloorQty put it on the wire.
     *
     * <p>Decode reads the LimitOrderAcceptedMaxFloorQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderAcceptedMaxFloorQty is on the wire
     */
    public boolean limitOrderAcceptedMaxFloorQtyPresent() {
        return limitOrderAcceptedPresenceBits.hasLimitOrderAcceptedMaxFloorQty();
    }

    /**
     * Returns whether the fields before the LimitOrderAcceptedMaxReplenishQtyRange put it on the wire.
     *
     * <p>Decode reads the LimitOrderAcceptedMaxReplenishQtyRange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderAcceptedMaxReplenishQtyRange is on the wire
     */
    public boolean limitOrderAcceptedMaxReplenishQtyRangePresent() {
        return limitOrderAcceptedPresenceBits.hasLimitOrderAcceptedMaxReplenishQtyRange();
    }

    /**
     * Returns whether the fields before the LimitOrderAcceptedMaxReplenishTimeRange put it on the wire.
     *
     * <p>Decode reads the LimitOrderAcceptedMaxReplenishTimeRange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderAcceptedMaxReplenishTimeRange is on the wire
     */
    public boolean limitOrderAcceptedMaxReplenishTimeRangePresent() {
        return limitOrderAcceptedPresenceBits.hasLimitOrderAcceptedMaxReplenishTimeRange();
    }

    /**
     * Returns whether the fields before the LimitOrderAcceptedReferencePriceTarget put it on the wire.
     *
     * <p>Decode reads the LimitOrderAcceptedReferencePriceTarget where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderAcceptedReferencePriceTarget is on the wire
     */
    public boolean limitOrderAcceptedReferencePriceTargetPresent() {
        return limitOrderAcceptedPresenceBits.hasLimitOrderAcceptedReferencePriceTarget();
    }

    /**
     * Returns whether the fields before the LimitOrderAcceptedExpireTime put it on the wire.
     *
     * <p>Decode reads the LimitOrderAcceptedExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderAcceptedExpireTime is on the wire
     */
    public boolean limitOrderAcceptedExpireTimePresent() {
        return limitOrderAcceptedPresenceBits.hasLimitOrderAcceptedExpireTime();
    }

    /**
     * Returns whether the fields before the LimitOrderAcceptedUserData put it on the wire.
     *
     * <p>Decode reads the LimitOrderAcceptedUserData where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderAcceptedUserData is on the wire
     */
    public boolean limitOrderAcceptedUserDataPresent() {
        return limitOrderAcceptedPresenceBits.hasLimitOrderAcceptedUserData();
    }

    /**
     * Returns whether the fields before the LimitOrderAcceptedMpid put it on the wire.
     *
     * <p>Decode reads the LimitOrderAcceptedMpid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderAcceptedMpid is on the wire
     */
    public boolean limitOrderAcceptedMpidPresent() {
        return limitOrderAcceptedPresenceBits.hasLimitOrderAcceptedMpid();
    }

    /**
     * Returns whether the fields before the LimitOrderAcceptedMemberGroup put it on the wire.
     *
     * <p>Decode reads the LimitOrderAcceptedMemberGroup where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderAcceptedMemberGroup is on the wire
     */
    public boolean limitOrderAcceptedMemberGroupPresent() {
        return limitOrderAcceptedPresenceBits.hasLimitOrderAcceptedMemberGroup();
    }

    /**
     * Returns whether the fields before the LimitOrderAcceptedLocateBroker put it on the wire.
     *
     * <p>Decode reads the LimitOrderAcceptedLocateBroker where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderAcceptedLocateBroker is on the wire
     */
    public boolean limitOrderAcceptedLocateBrokerPresent() {
        return limitOrderAcceptedPresenceBits.hasLimitOrderAcceptedLocateBroker();
    }

    /**
     * Returns whether the fields before the LimitOrderAcceptedRankPrice put it on the wire.
     *
     * <p>Decode reads the LimitOrderAcceptedRankPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderAcceptedRankPrice is on the wire
     */
    public boolean limitOrderAcceptedRankPricePresent() {
        return limitOrderAcceptedPresenceBits.hasLimitOrderAcceptedRankPrice();
    }

    /**
     * Returns whether the fields before the LimitOrderAcceptedDisplayPrice put it on the wire.
     *
     * <p>Decode reads the LimitOrderAcceptedDisplayPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderAcceptedDisplayPrice is on the wire
     */
    public boolean limitOrderAcceptedDisplayPricePresent() {
        return limitOrderAcceptedPresenceBits.hasLimitOrderAcceptedDisplayPrice();
    }

    private boolean onWire(Field field) {
        return (field != limitOrderAcceptedSelfMatchScope || limitOrderAcceptedSelfMatchScopePresent()) && (field != limitOrderAcceptedSelfMatchInstruction || limitOrderAcceptedSelfMatchInstructionPresent()) && (field != limitOrderAcceptedPriceSlideInstruction || limitOrderAcceptedPriceSlideInstructionPresent()) && (field != limitOrderAcceptedMinQty || limitOrderAcceptedMinQtyPresent()) && (field != limitOrderAcceptedMaxFloorQty || limitOrderAcceptedMaxFloorQtyPresent()) && (field != limitOrderAcceptedMaxReplenishQtyRange || limitOrderAcceptedMaxReplenishQtyRangePresent()) && (field != limitOrderAcceptedMaxReplenishTimeRange || limitOrderAcceptedMaxReplenishTimeRangePresent()) && (field != limitOrderAcceptedReferencePriceTarget || limitOrderAcceptedReferencePriceTargetPresent()) && (field != limitOrderAcceptedExpireTime || limitOrderAcceptedExpireTimePresent()) && (field != limitOrderAcceptedUserData || limitOrderAcceptedUserDataPresent()) && (field != limitOrderAcceptedMpid || limitOrderAcceptedMpidPresent()) && (field != limitOrderAcceptedMemberGroup || limitOrderAcceptedMemberGroupPresent()) && (field != limitOrderAcceptedLocateBroker || limitOrderAcceptedLocateBrokerPresent()) && (field != limitOrderAcceptedRankPrice || limitOrderAcceptedRankPricePresent()) && (field != limitOrderAcceptedDisplayPrice || limitOrderAcceptedDisplayPricePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (limitOrderAcceptedSelfMatchScopePresent() ? LimitOrderAcceptedSelfMatchScopeField.BYTE_LENGTH : 0) + (limitOrderAcceptedSelfMatchInstructionPresent() ? LimitOrderAcceptedSelfMatchInstructionField.BYTE_LENGTH : 0) + (limitOrderAcceptedPriceSlideInstructionPresent() ? LimitOrderAcceptedPriceSlideInstructionField.BYTE_LENGTH : 0) + (limitOrderAcceptedMinQtyPresent() ? LimitOrderAcceptedMinQtyField.BYTE_LENGTH : 0) + (limitOrderAcceptedMaxFloorQtyPresent() ? LimitOrderAcceptedMaxFloorQtyField.BYTE_LENGTH : 0) + (limitOrderAcceptedMaxReplenishQtyRangePresent() ? LimitOrderAcceptedMaxReplenishQtyRangeField.BYTE_LENGTH : 0) + (limitOrderAcceptedMaxReplenishTimeRangePresent() ? LimitOrderAcceptedMaxReplenishTimeRangeField.BYTE_LENGTH : 0) + (limitOrderAcceptedReferencePriceTargetPresent() ? LimitOrderAcceptedReferencePriceTargetField.BYTE_LENGTH : 0) + (limitOrderAcceptedExpireTimePresent() ? LimitOrderAcceptedExpireTimeField.BYTE_LENGTH : 0) + (limitOrderAcceptedUserDataPresent() ? LimitOrderAcceptedUserDataField.BYTE_LENGTH : 0) + (limitOrderAcceptedMpidPresent() ? LimitOrderAcceptedMpidField.BYTE_LENGTH : 0) + (limitOrderAcceptedMemberGroupPresent() ? LimitOrderAcceptedMemberGroupField.BYTE_LENGTH : 0) + (limitOrderAcceptedLocateBrokerPresent() ? LimitOrderAcceptedLocateBrokerField.BYTE_LENGTH : 0) + (limitOrderAcceptedRankPricePresent() ? LimitOrderAcceptedRankPriceField.BYTE_LENGTH : 0) + (limitOrderAcceptedDisplayPricePresent() ? LimitOrderAcceptedDisplayPriceField.BYTE_LENGTH : 0);
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(transactTime.value());
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!limitOrderAcceptedPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += LimitOrderAcceptedPresenceBitsField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!limitOrderAcceptedBitFields.parse(data, cursor)) {
            return false;
        }
        cursor += LimitOrderAcceptedBitFieldsField.BYTE_LENGTH;
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (limitOrderAcceptedSelfMatchScopePresent()) {
            if (end - cursor < LimitOrderAcceptedSelfMatchScopeField.BYTE_LENGTH || !limitOrderAcceptedSelfMatchScope.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderAcceptedSelfMatchScopeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderAcceptedSelfMatchInstructionPresent()) {
            if (end - cursor < LimitOrderAcceptedSelfMatchInstructionField.BYTE_LENGTH || !limitOrderAcceptedSelfMatchInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderAcceptedSelfMatchInstructionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderAcceptedPriceSlideInstructionPresent()) {
            if (end - cursor < LimitOrderAcceptedPriceSlideInstructionField.BYTE_LENGTH || !limitOrderAcceptedPriceSlideInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderAcceptedPriceSlideInstructionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderAcceptedMinQtyPresent()) {
            if (end - cursor < LimitOrderAcceptedMinQtyField.BYTE_LENGTH || !limitOrderAcceptedMinQty.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderAcceptedMinQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderAcceptedMaxFloorQtyPresent()) {
            if (end - cursor < LimitOrderAcceptedMaxFloorQtyField.BYTE_LENGTH || !limitOrderAcceptedMaxFloorQty.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderAcceptedMaxFloorQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderAcceptedMaxReplenishQtyRangePresent()) {
            if (end - cursor < LimitOrderAcceptedMaxReplenishQtyRangeField.BYTE_LENGTH || !limitOrderAcceptedMaxReplenishQtyRange.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderAcceptedMaxReplenishQtyRangeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderAcceptedMaxReplenishTimeRangePresent()) {
            if (end - cursor < LimitOrderAcceptedMaxReplenishTimeRangeField.BYTE_LENGTH || !limitOrderAcceptedMaxReplenishTimeRange.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderAcceptedMaxReplenishTimeRangeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderAcceptedReferencePriceTargetPresent()) {
            if (end - cursor < LimitOrderAcceptedReferencePriceTargetField.BYTE_LENGTH || !limitOrderAcceptedReferencePriceTarget.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderAcceptedReferencePriceTargetField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderAcceptedExpireTimePresent()) {
            if (end - cursor < LimitOrderAcceptedExpireTimeField.BYTE_LENGTH || !limitOrderAcceptedExpireTime.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderAcceptedExpireTimeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderAcceptedUserDataPresent()) {
            if (end - cursor < LimitOrderAcceptedUserDataField.BYTE_LENGTH || !limitOrderAcceptedUserData.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderAcceptedUserDataField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderAcceptedMpidPresent()) {
            if (end - cursor < LimitOrderAcceptedMpidField.BYTE_LENGTH || !limitOrderAcceptedMpid.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderAcceptedMpidField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderAcceptedMemberGroupPresent()) {
            if (end - cursor < LimitOrderAcceptedMemberGroupField.BYTE_LENGTH || !limitOrderAcceptedMemberGroup.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderAcceptedMemberGroupField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderAcceptedLocateBrokerPresent()) {
            if (end - cursor < LimitOrderAcceptedLocateBrokerField.BYTE_LENGTH || !limitOrderAcceptedLocateBroker.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderAcceptedLocateBrokerField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderAcceptedRankPricePresent()) {
            if (end - cursor < LimitOrderAcceptedRankPriceField.BYTE_LENGTH || !limitOrderAcceptedRankPrice.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderAcceptedRankPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderAcceptedDisplayPricePresent()) {
            if (end - cursor < LimitOrderAcceptedDisplayPriceField.BYTE_LENGTH || !limitOrderAcceptedDisplayPrice.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderAcceptedDisplayPriceField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (limitOrderAcceptedSelfMatchScopePresent() != limitOrderAcceptedSelfMatchScope.hasValue()) {
            throw new IllegalStateException(limitOrderAcceptedSelfMatchScope.hasValue() ? "limitOrderAcceptedSelfMatchScope holds a value the fields before it leave off the wire" : "limitOrderAcceptedSelfMatchScope holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderAcceptedSelfMatchInstructionPresent() != limitOrderAcceptedSelfMatchInstruction.hasValue()) {
            throw new IllegalStateException(limitOrderAcceptedSelfMatchInstruction.hasValue() ? "limitOrderAcceptedSelfMatchInstruction holds a value the fields before it leave off the wire" : "limitOrderAcceptedSelfMatchInstruction holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderAcceptedPriceSlideInstructionPresent() != limitOrderAcceptedPriceSlideInstruction.hasValue()) {
            throw new IllegalStateException(limitOrderAcceptedPriceSlideInstruction.hasValue() ? "limitOrderAcceptedPriceSlideInstruction holds a value the fields before it leave off the wire" : "limitOrderAcceptedPriceSlideInstruction holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderAcceptedMinQtyPresent() != limitOrderAcceptedMinQty.hasValue()) {
            throw new IllegalStateException(limitOrderAcceptedMinQty.hasValue() ? "limitOrderAcceptedMinQty holds a value the fields before it leave off the wire" : "limitOrderAcceptedMinQty holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderAcceptedMaxFloorQtyPresent() != limitOrderAcceptedMaxFloorQty.hasValue()) {
            throw new IllegalStateException(limitOrderAcceptedMaxFloorQty.hasValue() ? "limitOrderAcceptedMaxFloorQty holds a value the fields before it leave off the wire" : "limitOrderAcceptedMaxFloorQty holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderAcceptedMaxReplenishQtyRangePresent() != limitOrderAcceptedMaxReplenishQtyRange.hasValue()) {
            throw new IllegalStateException(limitOrderAcceptedMaxReplenishQtyRange.hasValue() ? "limitOrderAcceptedMaxReplenishQtyRange holds a value the fields before it leave off the wire" : "limitOrderAcceptedMaxReplenishQtyRange holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderAcceptedMaxReplenishTimeRangePresent() != limitOrderAcceptedMaxReplenishTimeRange.hasValue()) {
            throw new IllegalStateException(limitOrderAcceptedMaxReplenishTimeRange.hasValue() ? "limitOrderAcceptedMaxReplenishTimeRange holds a value the fields before it leave off the wire" : "limitOrderAcceptedMaxReplenishTimeRange holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderAcceptedReferencePriceTargetPresent() != limitOrderAcceptedReferencePriceTarget.hasValue()) {
            throw new IllegalStateException(limitOrderAcceptedReferencePriceTarget.hasValue() ? "limitOrderAcceptedReferencePriceTarget holds a value the fields before it leave off the wire" : "limitOrderAcceptedReferencePriceTarget holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderAcceptedExpireTimePresent() != limitOrderAcceptedExpireTime.hasValue()) {
            throw new IllegalStateException(limitOrderAcceptedExpireTime.hasValue() ? "limitOrderAcceptedExpireTime holds a value the fields before it leave off the wire" : "limitOrderAcceptedExpireTime holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderAcceptedUserDataPresent() != limitOrderAcceptedUserData.hasValue()) {
            throw new IllegalStateException(limitOrderAcceptedUserData.hasValue() ? "limitOrderAcceptedUserData holds a value the fields before it leave off the wire" : "limitOrderAcceptedUserData holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderAcceptedMpidPresent() != limitOrderAcceptedMpid.hasValue()) {
            throw new IllegalStateException(limitOrderAcceptedMpid.hasValue() ? "limitOrderAcceptedMpid holds a value the fields before it leave off the wire" : "limitOrderAcceptedMpid holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderAcceptedMemberGroupPresent() != limitOrderAcceptedMemberGroup.hasValue()) {
            throw new IllegalStateException(limitOrderAcceptedMemberGroup.hasValue() ? "limitOrderAcceptedMemberGroup holds a value the fields before it leave off the wire" : "limitOrderAcceptedMemberGroup holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderAcceptedLocateBrokerPresent() != limitOrderAcceptedLocateBroker.hasValue()) {
            throw new IllegalStateException(limitOrderAcceptedLocateBroker.hasValue() ? "limitOrderAcceptedLocateBroker holds a value the fields before it leave off the wire" : "limitOrderAcceptedLocateBroker holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderAcceptedRankPricePresent() != limitOrderAcceptedRankPrice.hasValue()) {
            throw new IllegalStateException(limitOrderAcceptedRankPrice.hasValue() ? "limitOrderAcceptedRankPrice holds a value the fields before it leave off the wire" : "limitOrderAcceptedRankPrice holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderAcceptedDisplayPricePresent() != limitOrderAcceptedDisplayPrice.hasValue()) {
            throw new IllegalStateException(limitOrderAcceptedDisplayPrice.hasValue() ? "limitOrderAcceptedDisplayPrice holds a value the fields before it leave off the wire" : "limitOrderAcceptedDisplayPrice holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = limitOrderAcceptedPresenceBits.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = limitOrderAcceptedBitFields.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        if (limitOrderAcceptedSelfMatchScopePresent()) {
            cursor = limitOrderAcceptedSelfMatchScope.encode(data, cursor);
        }
        if (limitOrderAcceptedSelfMatchInstructionPresent()) {
            cursor = limitOrderAcceptedSelfMatchInstruction.encode(data, cursor);
        }
        if (limitOrderAcceptedPriceSlideInstructionPresent()) {
            cursor = limitOrderAcceptedPriceSlideInstruction.encode(data, cursor);
        }
        if (limitOrderAcceptedMinQtyPresent()) {
            cursor = limitOrderAcceptedMinQty.encode(data, cursor);
        }
        if (limitOrderAcceptedMaxFloorQtyPresent()) {
            cursor = limitOrderAcceptedMaxFloorQty.encode(data, cursor);
        }
        if (limitOrderAcceptedMaxReplenishQtyRangePresent()) {
            cursor = limitOrderAcceptedMaxReplenishQtyRange.encode(data, cursor);
        }
        if (limitOrderAcceptedMaxReplenishTimeRangePresent()) {
            cursor = limitOrderAcceptedMaxReplenishTimeRange.encode(data, cursor);
        }
        if (limitOrderAcceptedReferencePriceTargetPresent()) {
            cursor = limitOrderAcceptedReferencePriceTarget.encode(data, cursor);
        }
        if (limitOrderAcceptedExpireTimePresent()) {
            cursor = limitOrderAcceptedExpireTime.encode(data, cursor);
        }
        if (limitOrderAcceptedUserDataPresent()) {
            cursor = limitOrderAcceptedUserData.encode(data, cursor);
        }
        if (limitOrderAcceptedMpidPresent()) {
            cursor = limitOrderAcceptedMpid.encode(data, cursor);
        }
        if (limitOrderAcceptedMemberGroupPresent()) {
            cursor = limitOrderAcceptedMemberGroup.encode(data, cursor);
        }
        if (limitOrderAcceptedLocateBrokerPresent()) {
            cursor = limitOrderAcceptedLocateBroker.encode(data, cursor);
        }
        if (limitOrderAcceptedRankPricePresent()) {
            cursor = limitOrderAcceptedRankPrice.encode(data, cursor);
        }
        if (limitOrderAcceptedDisplayPricePresent()) {
            cursor = limitOrderAcceptedDisplayPrice.encode(data, cursor);
        }
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields()) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields()) {
            if (!field.isValid()) {
                return false;
            }
        }
        return isRecognized();
    }

    /**
     * Returns a copy of the bytes this message was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the message bytes, or empty when no decode has been attempted
     */
    @Override
    public Optional<byte[]> raw() {
        if (buffer == null) {
            return Optional.empty();
        }
        return Optional.of(buffer.clone());
    }

    @Override
    public Optional<Field> failedAt() {
        if (buffer == null || decoded) {
            return Optional.empty();
        }
        for (Field field : fields) {
            if (!field.isDecoded()) {
                return Optional.of(field);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "LimitOrderAcceptedPresenceBits" -> Optional.of(limitOrderAcceptedPresenceBits);
            case "TransactTime" -> Optional.of(transactTime);
            case "OrderId" -> Optional.of(orderId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrderQty" -> Optional.of(orderQty);
            case "LimitOrderAcceptedBitFields" -> Optional.of(limitOrderAcceptedBitFields);
            case "SymbolId" -> Optional.of(symbolId);
            case "Price" -> Optional.of(price);
            case "LimitOrderAcceptedSelfMatchScope" -> Optional.of(limitOrderAcceptedSelfMatchScope);
            case "LimitOrderAcceptedSelfMatchInstruction" -> Optional.of(limitOrderAcceptedSelfMatchInstruction);
            case "LimitOrderAcceptedPriceSlideInstruction" -> Optional.of(limitOrderAcceptedPriceSlideInstruction);
            case "LimitOrderAcceptedMinQty" -> Optional.of(limitOrderAcceptedMinQty);
            case "LimitOrderAcceptedMaxFloorQty" -> Optional.of(limitOrderAcceptedMaxFloorQty);
            case "LimitOrderAcceptedMaxReplenishQtyRange" -> Optional.of(limitOrderAcceptedMaxReplenishQtyRange);
            case "LimitOrderAcceptedMaxReplenishTimeRange" -> Optional.of(limitOrderAcceptedMaxReplenishTimeRange);
            case "LimitOrderAcceptedReferencePriceTarget" -> Optional.of(limitOrderAcceptedReferencePriceTarget);
            case "LimitOrderAcceptedExpireTime" -> Optional.of(limitOrderAcceptedExpireTime);
            case "LimitOrderAcceptedUserData" -> Optional.of(limitOrderAcceptedUserData);
            case "LimitOrderAcceptedMpid" -> Optional.of(limitOrderAcceptedMpid);
            case "LimitOrderAcceptedMemberGroup" -> Optional.of(limitOrderAcceptedMemberGroup);
            case "LimitOrderAcceptedLocateBroker" -> Optional.of(limitOrderAcceptedLocateBroker);
            case "LimitOrderAcceptedRankPrice" -> Optional.of(limitOrderAcceptedRankPrice);
            case "LimitOrderAcceptedDisplayPrice" -> Optional.of(limitOrderAcceptedDisplayPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LimitOrderAcceptedMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        return changed;
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    /**
     * Appends this message's formatted representation.
     *
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
     *
     * @param builder the destination
     * @param options the display options
     */
    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.identifier()) {
            builder.append(NAME);
            return;
        }

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : onWire) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
    }

    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitOrderAcceptedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
