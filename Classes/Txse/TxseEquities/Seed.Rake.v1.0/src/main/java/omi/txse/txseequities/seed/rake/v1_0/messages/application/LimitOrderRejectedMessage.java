package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.txse.txseequities.seed.rake.v1_0.fields.ClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderRejectedBitFieldsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderRejectedExpireTimeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderRejectedLocateBrokerField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderRejectedMaxFloorQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderRejectedMaxReplenishQtyRangeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderRejectedMaxReplenishTimeRangeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderRejectedMemberGroupField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderRejectedMinQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderRejectedMpidField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderRejectedPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderRejectedPriceSlideInstructionField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderRejectedReasonField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderRejectedReferencePriceTargetField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderRejectedSelfMatchInstructionField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderRejectedSelfMatchScopeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LimitOrderRejectedUserDataField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.PriceField;
import omi.txse.txseequities.seed.rake.v1_0.fields.SymbolIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the LimitOrderRejectedMessage message from the Seed protocol.
 *
 * <p>The submitted limit order has been rejected by the Exchange.</p>
 */
public final class LimitOrderRejectedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'U';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 39;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Limit Order Rejected Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final LimitOrderRejectedPresenceBitsField limitOrderRejectedPresenceBits = new LimitOrderRejectedPresenceBitsField();

    /**
     * Transaction time.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

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
    private final LimitOrderRejectedBitFieldsField limitOrderRejectedBitFields = new LimitOrderRejectedBitFieldsField();

    /**
     * Symbol identifier.
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Limit price.
     */
    private final PriceField price = new PriceField();

    /**
     * Enum LimitOrderRejectedReason.
     */
    private final LimitOrderRejectedReasonField limitOrderRejectedReason = new LimitOrderRejectedReasonField();

    /**
     * Enum SelfMatchScope.
     */
    private final LimitOrderRejectedSelfMatchScopeField limitOrderRejectedSelfMatchScope = new LimitOrderRejectedSelfMatchScopeField();

    /**
     * Enum LimitOrderRejectedSelfMatchInstruction.
     */
    private final LimitOrderRejectedSelfMatchInstructionField limitOrderRejectedSelfMatchInstruction = new LimitOrderRejectedSelfMatchInstructionField();

    /**
     * Enum LimitOrderRejectedPriceSlideInstruction.
     */
    private final LimitOrderRejectedPriceSlideInstructionField limitOrderRejectedPriceSlideInstruction = new LimitOrderRejectedPriceSlideInstructionField();

    /**
     * Minimum quantity to execute.
     */
    private final LimitOrderRejectedMinQtyField limitOrderRejectedMinQty = new LimitOrderRejectedMinQtyField();

    /**
     * Quantity to be displayed at one time.
     */
    private final LimitOrderRejectedMaxFloorQtyField limitOrderRejectedMaxFloorQty = new LimitOrderRejectedMaxFloorQtyField();

    /**
     * Maximum range for random refresh quantity.
     */
    private final LimitOrderRejectedMaxReplenishQtyRangeField limitOrderRejectedMaxReplenishQtyRange = new LimitOrderRejectedMaxReplenishQtyRangeField();

    /**
     * Maximum range for random refresh time.
     */
    private final LimitOrderRejectedMaxReplenishTimeRangeField limitOrderRejectedMaxReplenishTimeRange = new LimitOrderRejectedMaxReplenishTimeRangeField();

    /**
     * Basis points relative to the NBBO spread.
     */
    private final LimitOrderRejectedReferencePriceTargetField limitOrderRejectedReferencePriceTarget = new LimitOrderRejectedReferencePriceTargetField();

    /**
     * Timestamp at which the order will be canceled.
     */
    private final LimitOrderRejectedExpireTimeField limitOrderRejectedExpireTime = new LimitOrderRejectedExpireTimeField();

    /**
     * Pass-through field.
     */
    private final LimitOrderRejectedUserDataField limitOrderRejectedUserData = new LimitOrderRejectedUserDataField();

    /**
     * Market Participant Identifier.
     */
    private final LimitOrderRejectedMpidField limitOrderRejectedMpid = new LimitOrderRejectedMpidField();

    /**
     * Member supplied grouping.
     */
    private final LimitOrderRejectedMemberGroupField limitOrderRejectedMemberGroup = new LimitOrderRejectedMemberGroupField();

    /**
     * Locate broker.
     */
    private final LimitOrderRejectedLocateBrokerField limitOrderRejectedLocateBroker = new LimitOrderRejectedLocateBrokerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(limitOrderRejectedPresenceBits, transactTime, clOrdId, orderQty, limitOrderRejectedBitFields, symbolId, price, limitOrderRejectedReason, limitOrderRejectedSelfMatchScope, limitOrderRejectedSelfMatchInstruction, limitOrderRejectedPriceSlideInstruction, limitOrderRejectedMinQty, limitOrderRejectedMaxFloorQty, limitOrderRejectedMaxReplenishQtyRange, limitOrderRejectedMaxReplenishTimeRange, limitOrderRejectedReferencePriceTarget, limitOrderRejectedExpireTime, limitOrderRejectedUserData, limitOrderRejectedMpid, limitOrderRejectedMemberGroup, limitOrderRejectedLocateBroker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the LimitOrderRejectedPresenceBits field
     */
    public LimitOrderRejectedPresenceBitsField limitOrderRejectedPresenceBits() {
        return limitOrderRejectedPresenceBits;
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
     * @return the LimitOrderRejectedBitFields field
     */
    public LimitOrderRejectedBitFieldsField limitOrderRejectedBitFields() {
        return limitOrderRejectedBitFields;
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
     * Enum LimitOrderRejectedReason.
     *
     * @return the LimitOrderRejectedReason field
     */
    public LimitOrderRejectedReasonField limitOrderRejectedReason() {
        return limitOrderRejectedReason;
    }

    /**
     * Enum SelfMatchScope.
     *
     * @return the LimitOrderRejectedSelfMatchScope field
     */
    public LimitOrderRejectedSelfMatchScopeField limitOrderRejectedSelfMatchScope() {
        return limitOrderRejectedSelfMatchScope;
    }

    /**
     * Enum LimitOrderRejectedSelfMatchInstruction.
     *
     * @return the LimitOrderRejectedSelfMatchInstruction field
     */
    public LimitOrderRejectedSelfMatchInstructionField limitOrderRejectedSelfMatchInstruction() {
        return limitOrderRejectedSelfMatchInstruction;
    }

    /**
     * Enum LimitOrderRejectedPriceSlideInstruction.
     *
     * @return the LimitOrderRejectedPriceSlideInstruction field
     */
    public LimitOrderRejectedPriceSlideInstructionField limitOrderRejectedPriceSlideInstruction() {
        return limitOrderRejectedPriceSlideInstruction;
    }

    /**
     * Minimum quantity to execute.
     *
     * @return the LimitOrderRejectedMinQty field
     */
    public LimitOrderRejectedMinQtyField limitOrderRejectedMinQty() {
        return limitOrderRejectedMinQty;
    }

    /**
     * Quantity to be displayed at one time.
     *
     * @return the LimitOrderRejectedMaxFloorQty field
     */
    public LimitOrderRejectedMaxFloorQtyField limitOrderRejectedMaxFloorQty() {
        return limitOrderRejectedMaxFloorQty;
    }

    /**
     * Maximum range for random refresh quantity.
     *
     * @return the LimitOrderRejectedMaxReplenishQtyRange field
     */
    public LimitOrderRejectedMaxReplenishQtyRangeField limitOrderRejectedMaxReplenishQtyRange() {
        return limitOrderRejectedMaxReplenishQtyRange;
    }

    /**
     * Maximum range for random refresh time.
     *
     * @return the LimitOrderRejectedMaxReplenishTimeRange field
     */
    public LimitOrderRejectedMaxReplenishTimeRangeField limitOrderRejectedMaxReplenishTimeRange() {
        return limitOrderRejectedMaxReplenishTimeRange;
    }

    /**
     * Basis points relative to the NBBO spread.
     *
     * @return the LimitOrderRejectedReferencePriceTarget field
     */
    public LimitOrderRejectedReferencePriceTargetField limitOrderRejectedReferencePriceTarget() {
        return limitOrderRejectedReferencePriceTarget;
    }

    /**
     * Timestamp at which the order will be canceled.
     *
     * @return the LimitOrderRejectedExpireTime field
     */
    public LimitOrderRejectedExpireTimeField limitOrderRejectedExpireTime() {
        return limitOrderRejectedExpireTime;
    }

    /**
     * Pass-through field.
     *
     * @return the LimitOrderRejectedUserData field
     */
    public LimitOrderRejectedUserDataField limitOrderRejectedUserData() {
        return limitOrderRejectedUserData;
    }

    /**
     * Market Participant Identifier.
     *
     * @return the LimitOrderRejectedMpid field
     */
    public LimitOrderRejectedMpidField limitOrderRejectedMpid() {
        return limitOrderRejectedMpid;
    }

    /**
     * Member supplied grouping.
     *
     * @return the LimitOrderRejectedMemberGroup field
     */
    public LimitOrderRejectedMemberGroupField limitOrderRejectedMemberGroup() {
        return limitOrderRejectedMemberGroup;
    }

    /**
     * Locate broker.
     *
     * @return the LimitOrderRejectedLocateBroker field
     */
    public LimitOrderRejectedLocateBrokerField limitOrderRejectedLocateBroker() {
        return limitOrderRejectedLocateBroker;
    }

    /**
     * Returns whether the fields before the LimitOrderRejectedSelfMatchScope put it on the wire.
     *
     * <p>Decode reads the LimitOrderRejectedSelfMatchScope where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderRejectedSelfMatchScope is on the wire
     */
    public boolean limitOrderRejectedSelfMatchScopePresent() {
        return limitOrderRejectedPresenceBits.hasLimitOrderRejectedSelfMatchScope();
    }

    /**
     * Returns whether the fields before the LimitOrderRejectedSelfMatchInstruction put it on the wire.
     *
     * <p>Decode reads the LimitOrderRejectedSelfMatchInstruction where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderRejectedSelfMatchInstruction is on the wire
     */
    public boolean limitOrderRejectedSelfMatchInstructionPresent() {
        return limitOrderRejectedPresenceBits.hasLimitOrderRejectedSelfMatchInstruction();
    }

    /**
     * Returns whether the fields before the LimitOrderRejectedPriceSlideInstruction put it on the wire.
     *
     * <p>Decode reads the LimitOrderRejectedPriceSlideInstruction where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderRejectedPriceSlideInstruction is on the wire
     */
    public boolean limitOrderRejectedPriceSlideInstructionPresent() {
        return limitOrderRejectedPresenceBits.hasLimitOrderRejectedPriceSlideInstruction();
    }

    /**
     * Returns whether the fields before the LimitOrderRejectedMinQty put it on the wire.
     *
     * <p>Decode reads the LimitOrderRejectedMinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderRejectedMinQty is on the wire
     */
    public boolean limitOrderRejectedMinQtyPresent() {
        return limitOrderRejectedPresenceBits.hasLimitOrderRejectedMinQty();
    }

    /**
     * Returns whether the fields before the LimitOrderRejectedMaxFloorQty put it on the wire.
     *
     * <p>Decode reads the LimitOrderRejectedMaxFloorQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderRejectedMaxFloorQty is on the wire
     */
    public boolean limitOrderRejectedMaxFloorQtyPresent() {
        return limitOrderRejectedPresenceBits.hasLimitOrderRejectedMaxFloorQty();
    }

    /**
     * Returns whether the fields before the LimitOrderRejectedMaxReplenishQtyRange put it on the wire.
     *
     * <p>Decode reads the LimitOrderRejectedMaxReplenishQtyRange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderRejectedMaxReplenishQtyRange is on the wire
     */
    public boolean limitOrderRejectedMaxReplenishQtyRangePresent() {
        return limitOrderRejectedPresenceBits.hasLimitOrderRejectedMaxReplenishQtyRange();
    }

    /**
     * Returns whether the fields before the LimitOrderRejectedMaxReplenishTimeRange put it on the wire.
     *
     * <p>Decode reads the LimitOrderRejectedMaxReplenishTimeRange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderRejectedMaxReplenishTimeRange is on the wire
     */
    public boolean limitOrderRejectedMaxReplenishTimeRangePresent() {
        return limitOrderRejectedPresenceBits.hasLimitOrderRejectedMaxReplenishTimeRange();
    }

    /**
     * Returns whether the fields before the LimitOrderRejectedReferencePriceTarget put it on the wire.
     *
     * <p>Decode reads the LimitOrderRejectedReferencePriceTarget where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderRejectedReferencePriceTarget is on the wire
     */
    public boolean limitOrderRejectedReferencePriceTargetPresent() {
        return limitOrderRejectedPresenceBits.hasLimitOrderRejectedReferencePriceTarget();
    }

    /**
     * Returns whether the fields before the LimitOrderRejectedExpireTime put it on the wire.
     *
     * <p>Decode reads the LimitOrderRejectedExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderRejectedExpireTime is on the wire
     */
    public boolean limitOrderRejectedExpireTimePresent() {
        return limitOrderRejectedPresenceBits.hasLimitOrderRejectedExpireTime();
    }

    /**
     * Returns whether the fields before the LimitOrderRejectedUserData put it on the wire.
     *
     * <p>Decode reads the LimitOrderRejectedUserData where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderRejectedUserData is on the wire
     */
    public boolean limitOrderRejectedUserDataPresent() {
        return limitOrderRejectedPresenceBits.hasLimitOrderRejectedUserData();
    }

    /**
     * Returns whether the fields before the LimitOrderRejectedMpid put it on the wire.
     *
     * <p>Decode reads the LimitOrderRejectedMpid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderRejectedMpid is on the wire
     */
    public boolean limitOrderRejectedMpidPresent() {
        return limitOrderRejectedPresenceBits.hasLimitOrderRejectedMpid();
    }

    /**
     * Returns whether the fields before the LimitOrderRejectedMemberGroup put it on the wire.
     *
     * <p>Decode reads the LimitOrderRejectedMemberGroup where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderRejectedMemberGroup is on the wire
     */
    public boolean limitOrderRejectedMemberGroupPresent() {
        return limitOrderRejectedPresenceBits.hasLimitOrderRejectedMemberGroup();
    }

    /**
     * Returns whether the fields before the LimitOrderRejectedLocateBroker put it on the wire.
     *
     * <p>Decode reads the LimitOrderRejectedLocateBroker where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LimitOrderRejectedLocateBroker is on the wire
     */
    public boolean limitOrderRejectedLocateBrokerPresent() {
        return limitOrderRejectedPresenceBits.hasLimitOrderRejectedLocateBroker();
    }

    private boolean onWire(Field field) {
        return (field != limitOrderRejectedSelfMatchScope || limitOrderRejectedSelfMatchScopePresent()) && (field != limitOrderRejectedSelfMatchInstruction || limitOrderRejectedSelfMatchInstructionPresent()) && (field != limitOrderRejectedPriceSlideInstruction || limitOrderRejectedPriceSlideInstructionPresent()) && (field != limitOrderRejectedMinQty || limitOrderRejectedMinQtyPresent()) && (field != limitOrderRejectedMaxFloorQty || limitOrderRejectedMaxFloorQtyPresent()) && (field != limitOrderRejectedMaxReplenishQtyRange || limitOrderRejectedMaxReplenishQtyRangePresent()) && (field != limitOrderRejectedMaxReplenishTimeRange || limitOrderRejectedMaxReplenishTimeRangePresent()) && (field != limitOrderRejectedReferencePriceTarget || limitOrderRejectedReferencePriceTargetPresent()) && (field != limitOrderRejectedExpireTime || limitOrderRejectedExpireTimePresent()) && (field != limitOrderRejectedUserData || limitOrderRejectedUserDataPresent()) && (field != limitOrderRejectedMpid || limitOrderRejectedMpidPresent()) && (field != limitOrderRejectedMemberGroup || limitOrderRejectedMemberGroupPresent()) && (field != limitOrderRejectedLocateBroker || limitOrderRejectedLocateBrokerPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (limitOrderRejectedSelfMatchScopePresent() ? LimitOrderRejectedSelfMatchScopeField.BYTE_LENGTH : 0) + (limitOrderRejectedSelfMatchInstructionPresent() ? LimitOrderRejectedSelfMatchInstructionField.BYTE_LENGTH : 0) + (limitOrderRejectedPriceSlideInstructionPresent() ? LimitOrderRejectedPriceSlideInstructionField.BYTE_LENGTH : 0) + (limitOrderRejectedMinQtyPresent() ? LimitOrderRejectedMinQtyField.BYTE_LENGTH : 0) + (limitOrderRejectedMaxFloorQtyPresent() ? LimitOrderRejectedMaxFloorQtyField.BYTE_LENGTH : 0) + (limitOrderRejectedMaxReplenishQtyRangePresent() ? LimitOrderRejectedMaxReplenishQtyRangeField.BYTE_LENGTH : 0) + (limitOrderRejectedMaxReplenishTimeRangePresent() ? LimitOrderRejectedMaxReplenishTimeRangeField.BYTE_LENGTH : 0) + (limitOrderRejectedReferencePriceTargetPresent() ? LimitOrderRejectedReferencePriceTargetField.BYTE_LENGTH : 0) + (limitOrderRejectedExpireTimePresent() ? LimitOrderRejectedExpireTimeField.BYTE_LENGTH : 0) + (limitOrderRejectedUserDataPresent() ? LimitOrderRejectedUserDataField.BYTE_LENGTH : 0) + (limitOrderRejectedMpidPresent() ? LimitOrderRejectedMpidField.BYTE_LENGTH : 0) + (limitOrderRejectedMemberGroupPresent() ? LimitOrderRejectedMemberGroupField.BYTE_LENGTH : 0) + (limitOrderRejectedLocateBrokerPresent() ? LimitOrderRejectedLocateBrokerField.BYTE_LENGTH : 0);
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
        if (!limitOrderRejectedPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += LimitOrderRejectedPresenceBitsField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!limitOrderRejectedBitFields.parse(data, cursor)) {
            return false;
        }
        cursor += LimitOrderRejectedBitFieldsField.BYTE_LENGTH;
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!limitOrderRejectedReason.parse(data, cursor)) {
            return false;
        }
        cursor += LimitOrderRejectedReasonField.BYTE_LENGTH;
        if (limitOrderRejectedSelfMatchScopePresent()) {
            if (end - cursor < LimitOrderRejectedSelfMatchScopeField.BYTE_LENGTH || !limitOrderRejectedSelfMatchScope.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderRejectedSelfMatchScopeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderRejectedSelfMatchInstructionPresent()) {
            if (end - cursor < LimitOrderRejectedSelfMatchInstructionField.BYTE_LENGTH || !limitOrderRejectedSelfMatchInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderRejectedSelfMatchInstructionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderRejectedPriceSlideInstructionPresent()) {
            if (end - cursor < LimitOrderRejectedPriceSlideInstructionField.BYTE_LENGTH || !limitOrderRejectedPriceSlideInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderRejectedPriceSlideInstructionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderRejectedMinQtyPresent()) {
            if (end - cursor < LimitOrderRejectedMinQtyField.BYTE_LENGTH || !limitOrderRejectedMinQty.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderRejectedMinQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderRejectedMaxFloorQtyPresent()) {
            if (end - cursor < LimitOrderRejectedMaxFloorQtyField.BYTE_LENGTH || !limitOrderRejectedMaxFloorQty.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderRejectedMaxFloorQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderRejectedMaxReplenishQtyRangePresent()) {
            if (end - cursor < LimitOrderRejectedMaxReplenishQtyRangeField.BYTE_LENGTH || !limitOrderRejectedMaxReplenishQtyRange.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderRejectedMaxReplenishQtyRangeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderRejectedMaxReplenishTimeRangePresent()) {
            if (end - cursor < LimitOrderRejectedMaxReplenishTimeRangeField.BYTE_LENGTH || !limitOrderRejectedMaxReplenishTimeRange.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderRejectedMaxReplenishTimeRangeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderRejectedReferencePriceTargetPresent()) {
            if (end - cursor < LimitOrderRejectedReferencePriceTargetField.BYTE_LENGTH || !limitOrderRejectedReferencePriceTarget.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderRejectedReferencePriceTargetField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderRejectedExpireTimePresent()) {
            if (end - cursor < LimitOrderRejectedExpireTimeField.BYTE_LENGTH || !limitOrderRejectedExpireTime.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderRejectedExpireTimeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderRejectedUserDataPresent()) {
            if (end - cursor < LimitOrderRejectedUserDataField.BYTE_LENGTH || !limitOrderRejectedUserData.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderRejectedUserDataField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderRejectedMpidPresent()) {
            if (end - cursor < LimitOrderRejectedMpidField.BYTE_LENGTH || !limitOrderRejectedMpid.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderRejectedMpidField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderRejectedMemberGroupPresent()) {
            if (end - cursor < LimitOrderRejectedMemberGroupField.BYTE_LENGTH || !limitOrderRejectedMemberGroup.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderRejectedMemberGroupField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (limitOrderRejectedLocateBrokerPresent()) {
            if (end - cursor < LimitOrderRejectedLocateBrokerField.BYTE_LENGTH || !limitOrderRejectedLocateBroker.parse(data, cursor)) {
                return false;
            }
            cursor += LimitOrderRejectedLocateBrokerField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (limitOrderRejectedSelfMatchScopePresent() != limitOrderRejectedSelfMatchScope.hasValue()) {
            throw new IllegalStateException(limitOrderRejectedSelfMatchScope.hasValue() ? "limitOrderRejectedSelfMatchScope holds a value the fields before it leave off the wire" : "limitOrderRejectedSelfMatchScope holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderRejectedSelfMatchInstructionPresent() != limitOrderRejectedSelfMatchInstruction.hasValue()) {
            throw new IllegalStateException(limitOrderRejectedSelfMatchInstruction.hasValue() ? "limitOrderRejectedSelfMatchInstruction holds a value the fields before it leave off the wire" : "limitOrderRejectedSelfMatchInstruction holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderRejectedPriceSlideInstructionPresent() != limitOrderRejectedPriceSlideInstruction.hasValue()) {
            throw new IllegalStateException(limitOrderRejectedPriceSlideInstruction.hasValue() ? "limitOrderRejectedPriceSlideInstruction holds a value the fields before it leave off the wire" : "limitOrderRejectedPriceSlideInstruction holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderRejectedMinQtyPresent() != limitOrderRejectedMinQty.hasValue()) {
            throw new IllegalStateException(limitOrderRejectedMinQty.hasValue() ? "limitOrderRejectedMinQty holds a value the fields before it leave off the wire" : "limitOrderRejectedMinQty holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderRejectedMaxFloorQtyPresent() != limitOrderRejectedMaxFloorQty.hasValue()) {
            throw new IllegalStateException(limitOrderRejectedMaxFloorQty.hasValue() ? "limitOrderRejectedMaxFloorQty holds a value the fields before it leave off the wire" : "limitOrderRejectedMaxFloorQty holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderRejectedMaxReplenishQtyRangePresent() != limitOrderRejectedMaxReplenishQtyRange.hasValue()) {
            throw new IllegalStateException(limitOrderRejectedMaxReplenishQtyRange.hasValue() ? "limitOrderRejectedMaxReplenishQtyRange holds a value the fields before it leave off the wire" : "limitOrderRejectedMaxReplenishQtyRange holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderRejectedMaxReplenishTimeRangePresent() != limitOrderRejectedMaxReplenishTimeRange.hasValue()) {
            throw new IllegalStateException(limitOrderRejectedMaxReplenishTimeRange.hasValue() ? "limitOrderRejectedMaxReplenishTimeRange holds a value the fields before it leave off the wire" : "limitOrderRejectedMaxReplenishTimeRange holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderRejectedReferencePriceTargetPresent() != limitOrderRejectedReferencePriceTarget.hasValue()) {
            throw new IllegalStateException(limitOrderRejectedReferencePriceTarget.hasValue() ? "limitOrderRejectedReferencePriceTarget holds a value the fields before it leave off the wire" : "limitOrderRejectedReferencePriceTarget holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderRejectedExpireTimePresent() != limitOrderRejectedExpireTime.hasValue()) {
            throw new IllegalStateException(limitOrderRejectedExpireTime.hasValue() ? "limitOrderRejectedExpireTime holds a value the fields before it leave off the wire" : "limitOrderRejectedExpireTime holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderRejectedUserDataPresent() != limitOrderRejectedUserData.hasValue()) {
            throw new IllegalStateException(limitOrderRejectedUserData.hasValue() ? "limitOrderRejectedUserData holds a value the fields before it leave off the wire" : "limitOrderRejectedUserData holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderRejectedMpidPresent() != limitOrderRejectedMpid.hasValue()) {
            throw new IllegalStateException(limitOrderRejectedMpid.hasValue() ? "limitOrderRejectedMpid holds a value the fields before it leave off the wire" : "limitOrderRejectedMpid holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderRejectedMemberGroupPresent() != limitOrderRejectedMemberGroup.hasValue()) {
            throw new IllegalStateException(limitOrderRejectedMemberGroup.hasValue() ? "limitOrderRejectedMemberGroup holds a value the fields before it leave off the wire" : "limitOrderRejectedMemberGroup holds no value, though the fields before it put it on the wire");
        }
        if (limitOrderRejectedLocateBrokerPresent() != limitOrderRejectedLocateBroker.hasValue()) {
            throw new IllegalStateException(limitOrderRejectedLocateBroker.hasValue() ? "limitOrderRejectedLocateBroker holds a value the fields before it leave off the wire" : "limitOrderRejectedLocateBroker holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = limitOrderRejectedPresenceBits.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = limitOrderRejectedBitFields.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = limitOrderRejectedReason.encode(data, cursor);
        if (limitOrderRejectedSelfMatchScopePresent()) {
            cursor = limitOrderRejectedSelfMatchScope.encode(data, cursor);
        }
        if (limitOrderRejectedSelfMatchInstructionPresent()) {
            cursor = limitOrderRejectedSelfMatchInstruction.encode(data, cursor);
        }
        if (limitOrderRejectedPriceSlideInstructionPresent()) {
            cursor = limitOrderRejectedPriceSlideInstruction.encode(data, cursor);
        }
        if (limitOrderRejectedMinQtyPresent()) {
            cursor = limitOrderRejectedMinQty.encode(data, cursor);
        }
        if (limitOrderRejectedMaxFloorQtyPresent()) {
            cursor = limitOrderRejectedMaxFloorQty.encode(data, cursor);
        }
        if (limitOrderRejectedMaxReplenishQtyRangePresent()) {
            cursor = limitOrderRejectedMaxReplenishQtyRange.encode(data, cursor);
        }
        if (limitOrderRejectedMaxReplenishTimeRangePresent()) {
            cursor = limitOrderRejectedMaxReplenishTimeRange.encode(data, cursor);
        }
        if (limitOrderRejectedReferencePriceTargetPresent()) {
            cursor = limitOrderRejectedReferencePriceTarget.encode(data, cursor);
        }
        if (limitOrderRejectedExpireTimePresent()) {
            cursor = limitOrderRejectedExpireTime.encode(data, cursor);
        }
        if (limitOrderRejectedUserDataPresent()) {
            cursor = limitOrderRejectedUserData.encode(data, cursor);
        }
        if (limitOrderRejectedMpidPresent()) {
            cursor = limitOrderRejectedMpid.encode(data, cursor);
        }
        if (limitOrderRejectedMemberGroupPresent()) {
            cursor = limitOrderRejectedMemberGroup.encode(data, cursor);
        }
        if (limitOrderRejectedLocateBrokerPresent()) {
            cursor = limitOrderRejectedLocateBroker.encode(data, cursor);
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
            case "LimitOrderRejectedPresenceBits" -> Optional.of(limitOrderRejectedPresenceBits);
            case "TransactTime" -> Optional.of(transactTime);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrderQty" -> Optional.of(orderQty);
            case "LimitOrderRejectedBitFields" -> Optional.of(limitOrderRejectedBitFields);
            case "SymbolId" -> Optional.of(symbolId);
            case "Price" -> Optional.of(price);
            case "LimitOrderRejectedReason" -> Optional.of(limitOrderRejectedReason);
            case "LimitOrderRejectedSelfMatchScope" -> Optional.of(limitOrderRejectedSelfMatchScope);
            case "LimitOrderRejectedSelfMatchInstruction" -> Optional.of(limitOrderRejectedSelfMatchInstruction);
            case "LimitOrderRejectedPriceSlideInstruction" -> Optional.of(limitOrderRejectedPriceSlideInstruction);
            case "LimitOrderRejectedMinQty" -> Optional.of(limitOrderRejectedMinQty);
            case "LimitOrderRejectedMaxFloorQty" -> Optional.of(limitOrderRejectedMaxFloorQty);
            case "LimitOrderRejectedMaxReplenishQtyRange" -> Optional.of(limitOrderRejectedMaxReplenishQtyRange);
            case "LimitOrderRejectedMaxReplenishTimeRange" -> Optional.of(limitOrderRejectedMaxReplenishTimeRange);
            case "LimitOrderRejectedReferencePriceTarget" -> Optional.of(limitOrderRejectedReferencePriceTarget);
            case "LimitOrderRejectedExpireTime" -> Optional.of(limitOrderRejectedExpireTime);
            case "LimitOrderRejectedUserData" -> Optional.of(limitOrderRejectedUserData);
            case "LimitOrderRejectedMpid" -> Optional.of(limitOrderRejectedMpid);
            case "LimitOrderRejectedMemberGroup" -> Optional.of(limitOrderRejectedMemberGroup);
            case "LimitOrderRejectedLocateBroker" -> Optional.of(limitOrderRejectedLocateBroker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof LimitOrderRejectedMessage message)) {
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
        if (!(other instanceof LimitOrderRejectedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
