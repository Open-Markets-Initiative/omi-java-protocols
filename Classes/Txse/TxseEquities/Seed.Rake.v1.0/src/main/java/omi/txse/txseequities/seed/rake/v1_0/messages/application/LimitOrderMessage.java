package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.txse.txseequities.seed.rake.v1_0.fields.ClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderBitFieldsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderExpireTimeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderLocateBrokerField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderMaxFloorQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderMaxReplenishQtyRangeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderMaxReplenishTimeRangeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderMemberGroupField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderMinQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderMpidField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderPriceSlideInstructionField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderReferencePriceTargetField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderSelfMatchInstructionField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderSelfMatchScopeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderUserDataField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.PriceField;
import omi.txse.txseequities.seed.rake.v1_0.fields.SymbolIdField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the LimitOrderMessage message from the Seed protocol.
 *
 * <p>Client-specified limit order.</p>
 */
public final class LimitOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'L';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 30;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Limit Order Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final LimitOrderPresenceBitsField limitOrderPresenceBits = new LimitOrderPresenceBitsField();

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
    private final LimitOrderBitFieldsField limitOrderBitFields = new LimitOrderBitFieldsField();

    /**
     * Symbol identifier.
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Limit price.
     */
    private final PriceField price = new PriceField();

    /**
     * Enum SelfMatchScope. Determines the scope for self-match prevention.
     */
    private final LimitOrderSelfMatchScopeField limitOrderSelfMatchScope = new LimitOrderSelfMatchScopeField();

    /**
     * Enum LimitOrderSelfMatchInstruction. Determines the behavior when orders from the same entity would match.
     */
    private final LimitOrderSelfMatchInstructionField limitOrderSelfMatchInstruction = new LimitOrderSelfMatchInstructionField();

    /**
     * Enum LimitOrderPriceSlideInstruction.
     */
    private final LimitOrderPriceSlideInstructionField limitOrderPriceSlideInstruction = new LimitOrderPriceSlideInstructionField();

    /**
     * Number of shares that must be executed to execute any shares.
     */
    private final LimitOrderMinQtyField limitOrderMinQty = new LimitOrderMinQtyField();

    /**
     * Quantity to be displayed at one time with remaining quantity not displayed on the book.
     */
    private final LimitOrderMaxFloorQtyField limitOrderMaxFloorQty = new LimitOrderMaxFloorQtyField();

    /**
     * Defines the maximum range to be used when calculating a random refresh quantity.
     */
    private final LimitOrderMaxReplenishQtyRangeField limitOrderMaxReplenishQtyRange = new LimitOrderMaxReplenishQtyRangeField();

    /**
     * Defines the maximum range to be used when calculating a random refresh time, in nanoseconds.
     */
    private final LimitOrderMaxReplenishTimeRangeField limitOrderMaxReplenishTimeRange = new LimitOrderMaxReplenishTimeRangeField();

    /**
     * The target relative to the reference base price in basis points of the NBBO spread.
     */
    private final LimitOrderReferencePriceTargetField limitOrderReferencePriceTarget = new LimitOrderReferencePriceTargetField();

    /**
     * Timestamp at which the order's open quantity will be canceled, valid only with GTT time in force.
     */
    private final LimitOrderExpireTimeField limitOrderExpireTime = new LimitOrderExpireTimeField();

    /**
     * Pass-through field for use by clients, not used by the Exchange.
     */
    private final LimitOrderUserDataField limitOrderUserData = new LimitOrderUserDataField();

    /**
     * Market Participant Identifier. Upper-case alpha only.
     */
    private final LimitOrderMpidField limitOrderMpid = new LimitOrderMpidField();

    /**
     * Member supplied grouping.
     */
    private final LimitOrderMemberGroupField limitOrderMemberGroup = new LimitOrderMemberGroupField();

    /**
     * Identifies the broker that has loaned the stock to settle the short sale.
     */
    private final LimitOrderLocateBrokerField limitOrderLocateBroker = new LimitOrderLocateBrokerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(limitOrderPresenceBits, clOrdId, orderQty, limitOrderBitFields, symbolId, price, limitOrderSelfMatchScope, limitOrderSelfMatchInstruction, limitOrderPriceSlideInstruction, limitOrderMinQty, limitOrderMaxFloorQty, limitOrderMaxReplenishQtyRange, limitOrderMaxReplenishTimeRange, limitOrderReferencePriceTarget, limitOrderExpireTime, limitOrderUserData, limitOrderMpid, limitOrderMemberGroup, limitOrderLocateBroker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the LimitOrderPresenceBits field
     */
    public LimitOrderPresenceBitsField limitOrderPresenceBits() {
        return limitOrderPresenceBits;
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
     * @return the LimitOrderBitFields field
     */
    public LimitOrderBitFieldsField limitOrderBitFields() {
        return limitOrderBitFields;
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
     * Enum SelfMatchScope. Determines the scope for self-match prevention.
     *
     * @return the LimitOrderSelfMatchScope field
     */
    public LimitOrderSelfMatchScopeField limitOrderSelfMatchScope() {
        return limitOrderSelfMatchScope;
    }

    /**
     * Enum LimitOrderSelfMatchInstruction. Determines the behavior when orders from the same entity would match.
     *
     * @return the LimitOrderSelfMatchInstruction field
     */
    public LimitOrderSelfMatchInstructionField limitOrderSelfMatchInstruction() {
        return limitOrderSelfMatchInstruction;
    }

    /**
     * Enum LimitOrderPriceSlideInstruction.
     *
     * @return the LimitOrderPriceSlideInstruction field
     */
    public LimitOrderPriceSlideInstructionField limitOrderPriceSlideInstruction() {
        return limitOrderPriceSlideInstruction;
    }

    /**
     * Number of shares that must be executed to execute any shares.
     *
     * @return the LimitOrderMinQty field
     */
    public LimitOrderMinQtyField limitOrderMinQty() {
        return limitOrderMinQty;
    }

    /**
     * Quantity to be displayed at one time with remaining quantity not displayed on the book.
     *
     * @return the LimitOrderMaxFloorQty field
     */
    public LimitOrderMaxFloorQtyField limitOrderMaxFloorQty() {
        return limitOrderMaxFloorQty;
    }

    /**
     * Defines the maximum range to be used when calculating a random refresh quantity.
     *
     * @return the LimitOrderMaxReplenishQtyRange field
     */
    public LimitOrderMaxReplenishQtyRangeField limitOrderMaxReplenishQtyRange() {
        return limitOrderMaxReplenishQtyRange;
    }

    /**
     * Defines the maximum range to be used when calculating a random refresh time, in nanoseconds.
     *
     * @return the LimitOrderMaxReplenishTimeRange field
     */
    public LimitOrderMaxReplenishTimeRangeField limitOrderMaxReplenishTimeRange() {
        return limitOrderMaxReplenishTimeRange;
    }

    /**
     * The target relative to the reference base price in basis points of the NBBO spread.
     *
     * @return the LimitOrderReferencePriceTarget field
     */
    public LimitOrderReferencePriceTargetField limitOrderReferencePriceTarget() {
        return limitOrderReferencePriceTarget;
    }

    /**
     * Timestamp at which the order's open quantity will be canceled, valid only with GTT time in force.
     *
     * @return the LimitOrderExpireTime field
     */
    public LimitOrderExpireTimeField limitOrderExpireTime() {
        return limitOrderExpireTime;
    }

    /**
     * Pass-through field for use by clients, not used by the Exchange.
     *
     * @return the LimitOrderUserData field
     */
    public LimitOrderUserDataField limitOrderUserData() {
        return limitOrderUserData;
    }

    /**
     * Market Participant Identifier. Upper-case alpha only.
     *
     * @return the LimitOrderMpid field
     */
    public LimitOrderMpidField limitOrderMpid() {
        return limitOrderMpid;
    }

    /**
     * Member supplied grouping.
     *
     * @return the LimitOrderMemberGroup field
     */
    public LimitOrderMemberGroupField limitOrderMemberGroup() {
        return limitOrderMemberGroup;
    }

    /**
     * Identifies the broker that has loaned the stock to settle the short sale.
     *
     * @return the LimitOrderLocateBroker field
     */
    public LimitOrderLocateBrokerField limitOrderLocateBroker() {
        return limitOrderLocateBroker;
    }

    /**
     * Returns whether the fields before the LimitOrderSelfMatchScope put it on the wire.
     *
     * <p>Decode reads the LimitOrderSelfMatchScope where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderSelfMatchScope is on the wire
     */
    public boolean limitOrderSelfMatchScopePresent() {
        return limitOrderPresenceBits.hasLimitOrderSelfMatchScope();
    }

    /**
     * Returns whether the fields before the LimitOrderSelfMatchInstruction put it on the wire.
     *
     * <p>Decode reads the LimitOrderSelfMatchInstruction where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderSelfMatchInstruction is on the wire
     */
    public boolean limitOrderSelfMatchInstructionPresent() {
        return limitOrderPresenceBits.hasLimitOrderSelfMatchInstruction();
    }

    /**
     * Returns whether the fields before the LimitOrderPriceSlideInstruction put it on the wire.
     *
     * <p>Decode reads the LimitOrderPriceSlideInstruction where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderPriceSlideInstruction is on the wire
     */
    public boolean limitOrderPriceSlideInstructionPresent() {
        return limitOrderPresenceBits.hasLimitOrderPriceSlideInstruction();
    }

    /**
     * Returns whether the fields before the LimitOrderMinQty put it on the wire.
     *
     * <p>Decode reads the LimitOrderMinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderMinQty is on the wire
     */
    public boolean limitOrderMinQtyPresent() {
        return limitOrderPresenceBits.hasLimitOrderMinQty();
    }

    /**
     * Returns whether the fields before the LimitOrderMaxFloorQty put it on the wire.
     *
     * <p>Decode reads the LimitOrderMaxFloorQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderMaxFloorQty is on the wire
     */
    public boolean limitOrderMaxFloorQtyPresent() {
        return limitOrderPresenceBits.hasLimitOrderMaxFloorQty();
    }

    /**
     * Returns whether the fields before the LimitOrderMaxReplenishQtyRange put it on the wire.
     *
     * <p>Decode reads the LimitOrderMaxReplenishQtyRange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderMaxReplenishQtyRange is on the wire
     */
    public boolean limitOrderMaxReplenishQtyRangePresent() {
        return limitOrderPresenceBits.hasLimitOrderMaxReplenishQtyRange();
    }

    /**
     * Returns whether the fields before the LimitOrderMaxReplenishTimeRange put it on the wire.
     *
     * <p>Decode reads the LimitOrderMaxReplenishTimeRange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderMaxReplenishTimeRange is on the wire
     */
    public boolean limitOrderMaxReplenishTimeRangePresent() {
        return limitOrderPresenceBits.hasLimitOrderMaxReplenishTimeRange();
    }

    /**
     * Returns whether the fields before the LimitOrderReferencePriceTarget put it on the wire.
     *
     * <p>Decode reads the LimitOrderReferencePriceTarget where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderReferencePriceTarget is on the wire
     */
    public boolean limitOrderReferencePriceTargetPresent() {
        return limitOrderPresenceBits.hasLimitOrderReferencePriceTarget();
    }

    /**
     * Returns whether the fields before the LimitOrderExpireTime put it on the wire.
     *
     * <p>Decode reads the LimitOrderExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderExpireTime is on the wire
     */
    public boolean limitOrderExpireTimePresent() {
        return limitOrderPresenceBits.hasLimitOrderExpireTime();
    }

    /**
     * Returns whether the fields before the LimitOrderUserData put it on the wire.
     *
     * <p>Decode reads the LimitOrderUserData where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderUserData is on the wire
     */
    public boolean limitOrderUserDataPresent() {
        return limitOrderPresenceBits.hasLimitOrderUserData();
    }

    /**
     * Returns whether the fields before the LimitOrderMpid put it on the wire.
     *
     * <p>Decode reads the LimitOrderMpid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderMpid is on the wire
     */
    public boolean limitOrderMpidPresent() {
        return limitOrderPresenceBits.hasLimitOrderMpid();
    }

    /**
     * Returns whether the fields before the LimitOrderMemberGroup put it on the wire.
     *
     * <p>Decode reads the LimitOrderMemberGroup where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderMemberGroup is on the wire
     */
    public boolean limitOrderMemberGroupPresent() {
        return limitOrderPresenceBits.hasLimitOrderMemberGroup();
    }

    /**
     * Returns whether the fields before the LimitOrderLocateBroker put it on the wire.
     *
     * <p>Decode reads the LimitOrderLocateBroker where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderLocateBroker is on the wire
     */
    public boolean limitOrderLocateBrokerPresent() {
        return limitOrderPresenceBits.hasLimitOrderLocateBroker();
    }

    private boolean onWire(Field field) {
        return (field != limitOrderSelfMatchScope || limitOrderSelfMatchScopePresent()) && (field != limitOrderSelfMatchInstruction || limitOrderSelfMatchInstructionPresent()) && (field != limitOrderPriceSlideInstruction || limitOrderPriceSlideInstructionPresent()) && (field != limitOrderMinQty || limitOrderMinQtyPresent()) && (field != limitOrderMaxFloorQty || limitOrderMaxFloorQtyPresent()) && (field != limitOrderMaxReplenishQtyRange || limitOrderMaxReplenishQtyRangePresent()) && (field != limitOrderMaxReplenishTimeRange || limitOrderMaxReplenishTimeRangePresent()) && (field != limitOrderReferencePriceTarget || limitOrderReferencePriceTargetPresent()) && (field != limitOrderExpireTime || limitOrderExpireTimePresent()) && (field != limitOrderUserData || limitOrderUserDataPresent()) && (field != limitOrderMpid || limitOrderMpidPresent()) && (field != limitOrderMemberGroup || limitOrderMemberGroupPresent()) && (field != limitOrderLocateBroker || limitOrderLocateBrokerPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (limitOrderSelfMatchScopePresent() ? LimitOrderSelfMatchScopeField.BYTE_LENGTH : 0) + (limitOrderSelfMatchInstructionPresent() ? LimitOrderSelfMatchInstructionField.BYTE_LENGTH : 0) + (limitOrderPriceSlideInstructionPresent() ? LimitOrderPriceSlideInstructionField.BYTE_LENGTH : 0) + (limitOrderMinQtyPresent() ? LimitOrderMinQtyField.BYTE_LENGTH : 0) + (limitOrderMaxFloorQtyPresent() ? LimitOrderMaxFloorQtyField.BYTE_LENGTH : 0) + (limitOrderMaxReplenishQtyRangePresent() ? LimitOrderMaxReplenishQtyRangeField.BYTE_LENGTH : 0) + (limitOrderMaxReplenishTimeRangePresent() ? LimitOrderMaxReplenishTimeRangeField.BYTE_LENGTH : 0) + (limitOrderReferencePriceTargetPresent() ? LimitOrderReferencePriceTargetField.BYTE_LENGTH : 0) + (limitOrderExpireTimePresent() ? LimitOrderExpireTimeField.BYTE_LENGTH : 0) + (limitOrderUserDataPresent() ? LimitOrderUserDataField.BYTE_LENGTH : 0) + (limitOrderMpidPresent() ? LimitOrderMpidField.BYTE_LENGTH : 0) + (limitOrderMemberGroupPresent() ? LimitOrderMemberGroupField.BYTE_LENGTH : 0) + (limitOrderLocateBrokerPresent() ? LimitOrderLocateBrokerField.BYTE_LENGTH : 0);
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 4;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 2;
        cursor += 8;
        if (limitOrderSelfMatchScopePresent()) {
            cursor += 1;
        }
        if (limitOrderSelfMatchInstructionPresent()) {
            cursor += 1;
        }
        if (limitOrderPriceSlideInstructionPresent()) {
            cursor += 1;
        }
        if (limitOrderMinQtyPresent()) {
            cursor += 4;
        }
        if (limitOrderMaxFloorQtyPresent()) {
            cursor += 4;
        }
        if (limitOrderMaxReplenishQtyRangePresent()) {
            cursor += 4;
        }
        if (limitOrderMaxReplenishTimeRangePresent()) {
            cursor += 8;
        }
        if (limitOrderReferencePriceTargetPresent()) {
            cursor += 2;
        }
        if (limitOrderExpireTimePresent()) {
            cursor += 8;
        }
        if (limitOrderUserDataPresent()) {
            cursor += 8;
        }
        if (limitOrderMpidPresent()) {
            cursor += 4;
        }
        if (limitOrderMemberGroupPresent()) {
            cursor += 2;
        }
        if (limitOrderLocateBrokerPresent()) {
            cursor += 4;
        }
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(limitOrderExpireTime.value());
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
        if (!limitOrderPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += LimitOrderPresenceBitsField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!limitOrderBitFields.parse(data, cursor)) {
            return false;
        }
        cursor += LimitOrderBitFieldsField.BYTE_LENGTH;
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (limitOrderSelfMatchScopePresent()) {
            if (end - cursor < LimitOrderSelfMatchScopeField.BYTE_LENGTH || !limitOrderSelfMatchScope.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderSelfMatchScopeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderSelfMatchInstructionPresent()) {
            if (end - cursor < LimitOrderSelfMatchInstructionField.BYTE_LENGTH || !limitOrderSelfMatchInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderSelfMatchInstructionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderPriceSlideInstructionPresent()) {
            if (end - cursor < LimitOrderPriceSlideInstructionField.BYTE_LENGTH || !limitOrderPriceSlideInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderPriceSlideInstructionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderMinQtyPresent()) {
            if (end - cursor < LimitOrderMinQtyField.BYTE_LENGTH || !limitOrderMinQty.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderMinQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderMaxFloorQtyPresent()) {
            if (end - cursor < LimitOrderMaxFloorQtyField.BYTE_LENGTH || !limitOrderMaxFloorQty.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderMaxFloorQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderMaxReplenishQtyRangePresent()) {
            if (end - cursor < LimitOrderMaxReplenishQtyRangeField.BYTE_LENGTH || !limitOrderMaxReplenishQtyRange.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderMaxReplenishQtyRangeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderMaxReplenishTimeRangePresent()) {
            if (end - cursor < LimitOrderMaxReplenishTimeRangeField.BYTE_LENGTH || !limitOrderMaxReplenishTimeRange.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderMaxReplenishTimeRangeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderReferencePriceTargetPresent()) {
            if (end - cursor < LimitOrderReferencePriceTargetField.BYTE_LENGTH || !limitOrderReferencePriceTarget.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderReferencePriceTargetField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderExpireTimePresent()) {
            if (end - cursor < LimitOrderExpireTimeField.BYTE_LENGTH || !limitOrderExpireTime.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderExpireTimeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderUserDataPresent()) {
            if (end - cursor < LimitOrderUserDataField.BYTE_LENGTH || !limitOrderUserData.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderUserDataField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderMpidPresent()) {
            if (end - cursor < LimitOrderMpidField.BYTE_LENGTH || !limitOrderMpid.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderMpidField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderMemberGroupPresent()) {
            if (end - cursor < LimitOrderMemberGroupField.BYTE_LENGTH || !limitOrderMemberGroup.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderMemberGroupField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderLocateBrokerPresent()) {
            if (end - cursor < LimitOrderLocateBrokerField.BYTE_LENGTH || !limitOrderLocateBroker.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderLocateBrokerField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (limitOrderSelfMatchScopePresent() != limitOrderSelfMatchScope.hasValue()) {
            throw new IllegalStateException(limitOrderSelfMatchScope.hasValue() ? "limitOrderSelfMatchScope holds a value the fields before it leave off the wire" : "limitOrderSelfMatchScope holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderSelfMatchInstructionPresent() != limitOrderSelfMatchInstruction.hasValue()) {
            throw new IllegalStateException(limitOrderSelfMatchInstruction.hasValue() ? "limitOrderSelfMatchInstruction holds a value the fields before it leave off the wire" : "limitOrderSelfMatchInstruction holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderPriceSlideInstructionPresent() != limitOrderPriceSlideInstruction.hasValue()) {
            throw new IllegalStateException(limitOrderPriceSlideInstruction.hasValue() ? "limitOrderPriceSlideInstruction holds a value the fields before it leave off the wire" : "limitOrderPriceSlideInstruction holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderMinQtyPresent() != limitOrderMinQty.hasValue()) {
            throw new IllegalStateException(limitOrderMinQty.hasValue() ? "limitOrderMinQty holds a value the fields before it leave off the wire" : "limitOrderMinQty holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderMaxFloorQtyPresent() != limitOrderMaxFloorQty.hasValue()) {
            throw new IllegalStateException(limitOrderMaxFloorQty.hasValue() ? "limitOrderMaxFloorQty holds a value the fields before it leave off the wire" : "limitOrderMaxFloorQty holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderMaxReplenishQtyRangePresent() != limitOrderMaxReplenishQtyRange.hasValue()) {
            throw new IllegalStateException(limitOrderMaxReplenishQtyRange.hasValue() ? "limitOrderMaxReplenishQtyRange holds a value the fields before it leave off the wire" : "limitOrderMaxReplenishQtyRange holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderMaxReplenishTimeRangePresent() != limitOrderMaxReplenishTimeRange.hasValue()) {
            throw new IllegalStateException(limitOrderMaxReplenishTimeRange.hasValue() ? "limitOrderMaxReplenishTimeRange holds a value the fields before it leave off the wire" : "limitOrderMaxReplenishTimeRange holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderReferencePriceTargetPresent() != limitOrderReferencePriceTarget.hasValue()) {
            throw new IllegalStateException(limitOrderReferencePriceTarget.hasValue() ? "limitOrderReferencePriceTarget holds a value the fields before it leave off the wire" : "limitOrderReferencePriceTarget holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderExpireTimePresent() != limitOrderExpireTime.hasValue()) {
            throw new IllegalStateException(limitOrderExpireTime.hasValue() ? "limitOrderExpireTime holds a value the fields before it leave off the wire" : "limitOrderExpireTime holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderUserDataPresent() != limitOrderUserData.hasValue()) {
            throw new IllegalStateException(limitOrderUserData.hasValue() ? "limitOrderUserData holds a value the fields before it leave off the wire" : "limitOrderUserData holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderMpidPresent() != limitOrderMpid.hasValue()) {
            throw new IllegalStateException(limitOrderMpid.hasValue() ? "limitOrderMpid holds a value the fields before it leave off the wire" : "limitOrderMpid holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderMemberGroupPresent() != limitOrderMemberGroup.hasValue()) {
            throw new IllegalStateException(limitOrderMemberGroup.hasValue() ? "limitOrderMemberGroup holds a value the fields before it leave off the wire" : "limitOrderMemberGroup holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderLocateBrokerPresent() != limitOrderLocateBroker.hasValue()) {
            throw new IllegalStateException(limitOrderLocateBroker.hasValue() ? "limitOrderLocateBroker holds a value the fields before it leave off the wire" : "limitOrderLocateBroker holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = limitOrderPresenceBits.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = limitOrderBitFields.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        if (limitOrderSelfMatchScopePresent()) {
            cursor = limitOrderSelfMatchScope.encode(data, cursor);
        }
        if (limitOrderSelfMatchInstructionPresent()) {
            cursor = limitOrderSelfMatchInstruction.encode(data, cursor);
        }
        if (limitOrderPriceSlideInstructionPresent()) {
            cursor = limitOrderPriceSlideInstruction.encode(data, cursor);
        }
        if (limitOrderMinQtyPresent()) {
            cursor = limitOrderMinQty.encode(data, cursor);
        }
        if (limitOrderMaxFloorQtyPresent()) {
            cursor = limitOrderMaxFloorQty.encode(data, cursor);
        }
        if (limitOrderMaxReplenishQtyRangePresent()) {
            cursor = limitOrderMaxReplenishQtyRange.encode(data, cursor);
        }
        if (limitOrderMaxReplenishTimeRangePresent()) {
            cursor = limitOrderMaxReplenishTimeRange.encode(data, cursor);
        }
        if (limitOrderReferencePriceTargetPresent()) {
            cursor = limitOrderReferencePriceTarget.encode(data, cursor);
        }
        if (limitOrderExpireTimePresent()) {
            cursor = limitOrderExpireTime.encode(data, cursor);
        }
        if (limitOrderUserDataPresent()) {
            cursor = limitOrderUserData.encode(data, cursor);
        }
        if (limitOrderMpidPresent()) {
            cursor = limitOrderMpid.encode(data, cursor);
        }
        if (limitOrderMemberGroupPresent()) {
            cursor = limitOrderMemberGroup.encode(data, cursor);
        }
        if (limitOrderLocateBrokerPresent()) {
            cursor = limitOrderLocateBroker.encode(data, cursor);
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
            case "LimitOrderPresenceBits" -> Optional.of(limitOrderPresenceBits);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrderQty" -> Optional.of(orderQty);
            case "LimitOrderBitFields" -> Optional.of(limitOrderBitFields);
            case "SymbolId" -> Optional.of(symbolId);
            case "Price" -> Optional.of(price);
            case "LimitOrderSelfMatchScope" -> Optional.of(limitOrderSelfMatchScope);
            case "LimitOrderSelfMatchInstruction" -> Optional.of(limitOrderSelfMatchInstruction);
            case "LimitOrderPriceSlideInstruction" -> Optional.of(limitOrderPriceSlideInstruction);
            case "LimitOrderMinQty" -> Optional.of(limitOrderMinQty);
            case "LimitOrderMaxFloorQty" -> Optional.of(limitOrderMaxFloorQty);
            case "LimitOrderMaxReplenishQtyRange" -> Optional.of(limitOrderMaxReplenishQtyRange);
            case "LimitOrderMaxReplenishTimeRange" -> Optional.of(limitOrderMaxReplenishTimeRange);
            case "LimitOrderReferencePriceTarget" -> Optional.of(limitOrderReferencePriceTarget);
            case "LimitOrderExpireTime" -> Optional.of(limitOrderExpireTime);
            case "LimitOrderUserData" -> Optional.of(limitOrderUserData);
            case "LimitOrderMpid" -> Optional.of(limitOrderMpid);
            case "LimitOrderMemberGroup" -> Optional.of(limitOrderMemberGroup);
            case "LimitOrderLocateBroker" -> Optional.of(limitOrderLocateBroker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LimitOrderMessage message)) {
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
        if (!(other instanceof LimitOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
