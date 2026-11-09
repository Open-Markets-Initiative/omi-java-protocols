package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.txse.txseequities.seed.rake.v1_0.fields.ClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.LeavesQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderReplacedBitFieldsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderReplacedDisplayPriceField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderReplacedLocateBrokerField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderReplacedMaxFloorQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderReplacedOrderQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderReplacedPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderReplacedPriceField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderReplacedPriceSlideInstructionField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderReplacedRankPriceField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderReplacedReferencePriceTargetField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderReplacedSelfMatchInstructionField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderReplacedSelfMatchScopeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrigClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the OrderReplacedMessage message from the Seed protocol.
 *
 * <p>Replace an existing order with a new order.</p>
 */
public final class OrderReplacedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'J';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 40;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Replaced Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final OrderReplacedPresenceBitsField orderReplacedPresenceBits = new OrderReplacedPresenceBitsField();

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
     * The ClOrdId of the order to be canceled.
     */
    private final OrigClOrdIdField origClOrdId = new OrigClOrdIdField();

    /**
     * Bitfield used in ReplaceOrder, OrderReplaced, and ReplaceRejected messages.
     */
    private final OrderReplacedBitFieldsField orderReplacedBitFields = new OrderReplacedBitFieldsField();

    /**
     * Number of shares that were still available to execute after the modify.
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * New limit price.
     */
    private final OrderReplacedPriceField orderReplacedPrice = new OrderReplacedPriceField();

    /**
     * Quantity can remain the same, decrease or increase.
     */
    private final OrderReplacedOrderQtyField orderReplacedOrderQty = new OrderReplacedOrderQtyField();

    /**
     * Quantity to be displayed at one time.
     */
    private final OrderReplacedMaxFloorQtyField orderReplacedMaxFloorQty = new OrderReplacedMaxFloorQtyField();

    /**
     * Enum SelfMatchScope.
     */
    private final OrderReplacedSelfMatchScopeField orderReplacedSelfMatchScope = new OrderReplacedSelfMatchScopeField();

    /**
     * Enum OrderReplacedSelfMatchInstruction.
     */
    private final OrderReplacedSelfMatchInstructionField orderReplacedSelfMatchInstruction = new OrderReplacedSelfMatchInstructionField();

    /**
     * Enum OrderReplacedPriceSlideInstruction.
     */
    private final OrderReplacedPriceSlideInstructionField orderReplacedPriceSlideInstruction = new OrderReplacedPriceSlideInstructionField();

    /**
     * Basis points relative to the NBBO spread.
     */
    private final OrderReplacedReferencePriceTargetField orderReplacedReferencePriceTarget = new OrderReplacedReferencePriceTargetField();

    /**
     * Locate broker.
     */
    private final OrderReplacedLocateBrokerField orderReplacedLocateBroker = new OrderReplacedLocateBrokerField();

    /**
     * Optional rank price, when different from limit price.
     */
    private final OrderReplacedRankPriceField orderReplacedRankPrice = new OrderReplacedRankPriceField();

    /**
     * Optional display price, when different from limit price.
     */
    private final OrderReplacedDisplayPriceField orderReplacedDisplayPrice = new OrderReplacedDisplayPriceField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(orderReplacedPresenceBits, transactTime, orderId, clOrdId, origClOrdId, orderReplacedBitFields, leavesQty, orderReplacedPrice, orderReplacedOrderQty, orderReplacedMaxFloorQty, orderReplacedSelfMatchScope, orderReplacedSelfMatchInstruction, orderReplacedPriceSlideInstruction, orderReplacedReferencePriceTarget, orderReplacedLocateBroker, orderReplacedRankPrice, orderReplacedDisplayPrice);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the OrderReplacedPresenceBits field
     */
    public OrderReplacedPresenceBitsField orderReplacedPresenceBits() {
        return orderReplacedPresenceBits;
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
     * The ClOrdId of the order to be canceled.
     *
     * @return the OrigClOrdId field
     */
    public OrigClOrdIdField origClOrdId() {
        return origClOrdId;
    }

    /**
     * Bitfield used in ReplaceOrder, OrderReplaced, and ReplaceRejected messages.
     *
     * @return the OrderReplacedBitFields field
     */
    public OrderReplacedBitFieldsField orderReplacedBitFields() {
        return orderReplacedBitFields;
    }

    /**
     * Number of shares that were still available to execute after the modify.
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * New limit price.
     *
     * @return the OrderReplacedPrice field
     */
    public OrderReplacedPriceField orderReplacedPrice() {
        return orderReplacedPrice;
    }

    /**
     * Quantity can remain the same, decrease or increase.
     *
     * @return the OrderReplacedOrderQty field
     */
    public OrderReplacedOrderQtyField orderReplacedOrderQty() {
        return orderReplacedOrderQty;
    }

    /**
     * Quantity to be displayed at one time.
     *
     * @return the OrderReplacedMaxFloorQty field
     */
    public OrderReplacedMaxFloorQtyField orderReplacedMaxFloorQty() {
        return orderReplacedMaxFloorQty;
    }

    /**
     * Enum SelfMatchScope.
     *
     * @return the OrderReplacedSelfMatchScope field
     */
    public OrderReplacedSelfMatchScopeField orderReplacedSelfMatchScope() {
        return orderReplacedSelfMatchScope;
    }

    /**
     * Enum OrderReplacedSelfMatchInstruction.
     *
     * @return the OrderReplacedSelfMatchInstruction field
     */
    public OrderReplacedSelfMatchInstructionField orderReplacedSelfMatchInstruction() {
        return orderReplacedSelfMatchInstruction;
    }

    /**
     * Enum OrderReplacedPriceSlideInstruction.
     *
     * @return the OrderReplacedPriceSlideInstruction field
     */
    public OrderReplacedPriceSlideInstructionField orderReplacedPriceSlideInstruction() {
        return orderReplacedPriceSlideInstruction;
    }

    /**
     * Basis points relative to the NBBO spread.
     *
     * @return the OrderReplacedReferencePriceTarget field
     */
    public OrderReplacedReferencePriceTargetField orderReplacedReferencePriceTarget() {
        return orderReplacedReferencePriceTarget;
    }

    /**
     * Locate broker.
     *
     * @return the OrderReplacedLocateBroker field
     */
    public OrderReplacedLocateBrokerField orderReplacedLocateBroker() {
        return orderReplacedLocateBroker;
    }

    /**
     * Optional rank price, when different from limit price.
     *
     * @return the OrderReplacedRankPrice field
     */
    public OrderReplacedRankPriceField orderReplacedRankPrice() {
        return orderReplacedRankPrice;
    }

    /**
     * Optional display price, when different from limit price.
     *
     * @return the OrderReplacedDisplayPrice field
     */
    public OrderReplacedDisplayPriceField orderReplacedDisplayPrice() {
        return orderReplacedDisplayPrice;
    }

    /**
     * Returns whether the fields before the OrderReplacedPrice put it on the wire.
     *
     * <p>Decode reads the OrderReplacedPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderReplacedPrice is on the wire
     */
    public boolean orderReplacedPricePresent() {
        return orderReplacedPresenceBits.hasOrderReplacedPrice();
    }

    /**
     * Returns whether the fields before the OrderReplacedOrderQty put it on the wire.
     *
     * <p>Decode reads the OrderReplacedOrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderReplacedOrderQty is on the wire
     */
    public boolean orderReplacedOrderQtyPresent() {
        return orderReplacedPresenceBits.hasOrderReplacedOrderQty();
    }

    /**
     * Returns whether the fields before the OrderReplacedMaxFloorQty put it on the wire.
     *
     * <p>Decode reads the OrderReplacedMaxFloorQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderReplacedMaxFloorQty is on the wire
     */
    public boolean orderReplacedMaxFloorQtyPresent() {
        return orderReplacedPresenceBits.hasOrderReplacedMaxFloorQty();
    }

    /**
     * Returns whether the fields before the OrderReplacedSelfMatchScope put it on the wire.
     *
     * <p>Decode reads the OrderReplacedSelfMatchScope where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderReplacedSelfMatchScope is on the wire
     */
    public boolean orderReplacedSelfMatchScopePresent() {
        return orderReplacedPresenceBits.hasOrderReplacedSelfMatchScope();
    }

    /**
     * Returns whether the fields before the OrderReplacedSelfMatchInstruction put it on the wire.
     *
     * <p>Decode reads the OrderReplacedSelfMatchInstruction where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderReplacedSelfMatchInstruction is on the wire
     */
    public boolean orderReplacedSelfMatchInstructionPresent() {
        return orderReplacedPresenceBits.hasOrderReplacedSelfMatchInstruction();
    }

    /**
     * Returns whether the fields before the OrderReplacedPriceSlideInstruction put it on the wire.
     *
     * <p>Decode reads the OrderReplacedPriceSlideInstruction where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderReplacedPriceSlideInstruction is on the wire
     */
    public boolean orderReplacedPriceSlideInstructionPresent() {
        return orderReplacedPresenceBits.hasOrderReplacedPriceSlideInstruction();
    }

    /**
     * Returns whether the fields before the OrderReplacedReferencePriceTarget put it on the wire.
     *
     * <p>Decode reads the OrderReplacedReferencePriceTarget where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderReplacedReferencePriceTarget is on the wire
     */
    public boolean orderReplacedReferencePriceTargetPresent() {
        return orderReplacedPresenceBits.hasOrderReplacedReferencePriceTarget();
    }

    /**
     * Returns whether the fields before the OrderReplacedLocateBroker put it on the wire.
     *
     * <p>Decode reads the OrderReplacedLocateBroker where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderReplacedLocateBroker is on the wire
     */
    public boolean orderReplacedLocateBrokerPresent() {
        return orderReplacedPresenceBits.hasOrderReplacedLocateBroker();
    }

    /**
     * Returns whether the fields before the OrderReplacedRankPrice put it on the wire.
     *
     * <p>Decode reads the OrderReplacedRankPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderReplacedRankPrice is on the wire
     */
    public boolean orderReplacedRankPricePresent() {
        return orderReplacedPresenceBits.hasOrderReplacedRankPrice();
    }

    /**
     * Returns whether the fields before the OrderReplacedDisplayPrice put it on the wire.
     *
     * <p>Decode reads the OrderReplacedDisplayPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderReplacedDisplayPrice is on the wire
     */
    public boolean orderReplacedDisplayPricePresent() {
        return orderReplacedPresenceBits.hasOrderReplacedDisplayPrice();
    }

    private boolean onWire(Field field) {
        return (field != orderReplacedPrice || orderReplacedPricePresent()) && (field != orderReplacedOrderQty || orderReplacedOrderQtyPresent()) && (field != orderReplacedMaxFloorQty || orderReplacedMaxFloorQtyPresent()) && (field != orderReplacedSelfMatchScope || orderReplacedSelfMatchScopePresent()) && (field != orderReplacedSelfMatchInstruction || orderReplacedSelfMatchInstructionPresent()) && (field != orderReplacedPriceSlideInstruction || orderReplacedPriceSlideInstructionPresent()) && (field != orderReplacedReferencePriceTarget || orderReplacedReferencePriceTargetPresent()) && (field != orderReplacedLocateBroker || orderReplacedLocateBrokerPresent()) && (field != orderReplacedRankPrice || orderReplacedRankPricePresent()) && (field != orderReplacedDisplayPrice || orderReplacedDisplayPricePresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (orderReplacedPricePresent() ? OrderReplacedPriceField.BYTE_LENGTH : 0) + (orderReplacedOrderQtyPresent() ? OrderReplacedOrderQtyField.BYTE_LENGTH : 0) + (orderReplacedMaxFloorQtyPresent() ? OrderReplacedMaxFloorQtyField.BYTE_LENGTH : 0) + (orderReplacedSelfMatchScopePresent() ? OrderReplacedSelfMatchScopeField.BYTE_LENGTH : 0) + (orderReplacedSelfMatchInstructionPresent() ? OrderReplacedSelfMatchInstructionField.BYTE_LENGTH : 0) + (orderReplacedPriceSlideInstructionPresent() ? OrderReplacedPriceSlideInstructionField.BYTE_LENGTH : 0) + (orderReplacedReferencePriceTargetPresent() ? OrderReplacedReferencePriceTargetField.BYTE_LENGTH : 0) + (orderReplacedLocateBrokerPresent() ? OrderReplacedLocateBrokerField.BYTE_LENGTH : 0) + (orderReplacedRankPricePresent() ? OrderReplacedRankPriceField.BYTE_LENGTH : 0) + (orderReplacedDisplayPricePresent() ? OrderReplacedDisplayPriceField.BYTE_LENGTH : 0);
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
        cursor += 2;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 2;
        cursor += 4;
        if (orderReplacedPricePresent()) {
            cursor += 8;
        }
        if (orderReplacedOrderQtyPresent()) {
            cursor += 4;
        }
        if (orderReplacedMaxFloorQtyPresent()) {
            cursor += 4;
        }
        if (orderReplacedSelfMatchScopePresent()) {
            cursor += 1;
        }
        if (orderReplacedSelfMatchInstructionPresent()) {
            cursor += 1;
        }
        if (orderReplacedPriceSlideInstructionPresent()) {
            cursor += 1;
        }
        if (orderReplacedReferencePriceTargetPresent()) {
            cursor += 2;
        }
        if (orderReplacedLocateBrokerPresent()) {
            cursor += 4;
        }
        if (orderReplacedRankPricePresent()) {
            cursor += 8;
        }
        if (orderReplacedDisplayPricePresent()) {
            cursor += 8;
        }
        return cursor;
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
        if (!orderReplacedPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += OrderReplacedPresenceBitsField.BYTE_LENGTH;
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
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!orderReplacedBitFields.parse(data, cursor)) {
            return false;
        }
        cursor += OrderReplacedBitFieldsField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (orderReplacedPricePresent()) {
            if (end - cursor < OrderReplacedPriceField.BYTE_LENGTH || !orderReplacedPrice.parse(data, cursor)) {
                return false;
            }
            cursor += OrderReplacedPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderReplacedOrderQtyPresent()) {
            if (end - cursor < OrderReplacedOrderQtyField.BYTE_LENGTH || !orderReplacedOrderQty.parse(data, cursor)) {
                return false;
            }
            cursor += OrderReplacedOrderQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderReplacedMaxFloorQtyPresent()) {
            if (end - cursor < OrderReplacedMaxFloorQtyField.BYTE_LENGTH || !orderReplacedMaxFloorQty.parse(data, cursor)) {
                return false;
            }
            cursor += OrderReplacedMaxFloorQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderReplacedSelfMatchScopePresent()) {
            if (end - cursor < OrderReplacedSelfMatchScopeField.BYTE_LENGTH || !orderReplacedSelfMatchScope.parse(data, cursor)) {
                return false;
            }
            cursor += OrderReplacedSelfMatchScopeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderReplacedSelfMatchInstructionPresent()) {
            if (end - cursor < OrderReplacedSelfMatchInstructionField.BYTE_LENGTH || !orderReplacedSelfMatchInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += OrderReplacedSelfMatchInstructionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderReplacedPriceSlideInstructionPresent()) {
            if (end - cursor < OrderReplacedPriceSlideInstructionField.BYTE_LENGTH || !orderReplacedPriceSlideInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += OrderReplacedPriceSlideInstructionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderReplacedReferencePriceTargetPresent()) {
            if (end - cursor < OrderReplacedReferencePriceTargetField.BYTE_LENGTH || !orderReplacedReferencePriceTarget.parse(data, cursor)) {
                return false;
            }
            cursor += OrderReplacedReferencePriceTargetField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderReplacedLocateBrokerPresent()) {
            if (end - cursor < OrderReplacedLocateBrokerField.BYTE_LENGTH || !orderReplacedLocateBroker.parse(data, cursor)) {
                return false;
            }
            cursor += OrderReplacedLocateBrokerField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderReplacedRankPricePresent()) {
            if (end - cursor < OrderReplacedRankPriceField.BYTE_LENGTH || !orderReplacedRankPrice.parse(data, cursor)) {
                return false;
            }
            cursor += OrderReplacedRankPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (orderReplacedDisplayPricePresent()) {
            if (end - cursor < OrderReplacedDisplayPriceField.BYTE_LENGTH || !orderReplacedDisplayPrice.parse(data, cursor)) {
                return false;
            }
            cursor += OrderReplacedDisplayPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (orderReplacedPricePresent() != orderReplacedPrice.hasValue()) {
            throw new IllegalStateException(orderReplacedPrice.hasValue() ? "orderReplacedPrice holds a value the fields before it leave off the wire" : "orderReplacedPrice holds no value, though the fields before it put it on the wire");
        }
        if (orderReplacedOrderQtyPresent() != orderReplacedOrderQty.hasValue()) {
            throw new IllegalStateException(orderReplacedOrderQty.hasValue() ? "orderReplacedOrderQty holds a value the fields before it leave off the wire" : "orderReplacedOrderQty holds no value, though the fields before it put it on the wire");
        }
        if (orderReplacedMaxFloorQtyPresent() != orderReplacedMaxFloorQty.hasValue()) {
            throw new IllegalStateException(orderReplacedMaxFloorQty.hasValue() ? "orderReplacedMaxFloorQty holds a value the fields before it leave off the wire" : "orderReplacedMaxFloorQty holds no value, though the fields before it put it on the wire");
        }
        if (orderReplacedSelfMatchScopePresent() != orderReplacedSelfMatchScope.hasValue()) {
            throw new IllegalStateException(orderReplacedSelfMatchScope.hasValue() ? "orderReplacedSelfMatchScope holds a value the fields before it leave off the wire" : "orderReplacedSelfMatchScope holds no value, though the fields before it put it on the wire");
        }
        if (orderReplacedSelfMatchInstructionPresent() != orderReplacedSelfMatchInstruction.hasValue()) {
            throw new IllegalStateException(orderReplacedSelfMatchInstruction.hasValue() ? "orderReplacedSelfMatchInstruction holds a value the fields before it leave off the wire" : "orderReplacedSelfMatchInstruction holds no value, though the fields before it put it on the wire");
        }
        if (orderReplacedPriceSlideInstructionPresent() != orderReplacedPriceSlideInstruction.hasValue()) {
            throw new IllegalStateException(orderReplacedPriceSlideInstruction.hasValue() ? "orderReplacedPriceSlideInstruction holds a value the fields before it leave off the wire" : "orderReplacedPriceSlideInstruction holds no value, though the fields before it put it on the wire");
        }
        if (orderReplacedReferencePriceTargetPresent() != orderReplacedReferencePriceTarget.hasValue()) {
            throw new IllegalStateException(orderReplacedReferencePriceTarget.hasValue() ? "orderReplacedReferencePriceTarget holds a value the fields before it leave off the wire" : "orderReplacedReferencePriceTarget holds no value, though the fields before it put it on the wire");
        }
        if (orderReplacedLocateBrokerPresent() != orderReplacedLocateBroker.hasValue()) {
            throw new IllegalStateException(orderReplacedLocateBroker.hasValue() ? "orderReplacedLocateBroker holds a value the fields before it leave off the wire" : "orderReplacedLocateBroker holds no value, though the fields before it put it on the wire");
        }
        if (orderReplacedRankPricePresent() != orderReplacedRankPrice.hasValue()) {
            throw new IllegalStateException(orderReplacedRankPrice.hasValue() ? "orderReplacedRankPrice holds a value the fields before it leave off the wire" : "orderReplacedRankPrice holds no value, though the fields before it put it on the wire");
        }
        if (orderReplacedDisplayPricePresent() != orderReplacedDisplayPrice.hasValue()) {
            throw new IllegalStateException(orderReplacedDisplayPrice.hasValue() ? "orderReplacedDisplayPrice holds a value the fields before it leave off the wire" : "orderReplacedDisplayPrice holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = orderReplacedPresenceBits.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = orderReplacedBitFields.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        if (orderReplacedPricePresent()) {
            cursor = orderReplacedPrice.encode(data, cursor);
        }
        if (orderReplacedOrderQtyPresent()) {
            cursor = orderReplacedOrderQty.encode(data, cursor);
        }
        if (orderReplacedMaxFloorQtyPresent()) {
            cursor = orderReplacedMaxFloorQty.encode(data, cursor);
        }
        if (orderReplacedSelfMatchScopePresent()) {
            cursor = orderReplacedSelfMatchScope.encode(data, cursor);
        }
        if (orderReplacedSelfMatchInstructionPresent()) {
            cursor = orderReplacedSelfMatchInstruction.encode(data, cursor);
        }
        if (orderReplacedPriceSlideInstructionPresent()) {
            cursor = orderReplacedPriceSlideInstruction.encode(data, cursor);
        }
        if (orderReplacedReferencePriceTargetPresent()) {
            cursor = orderReplacedReferencePriceTarget.encode(data, cursor);
        }
        if (orderReplacedLocateBrokerPresent()) {
            cursor = orderReplacedLocateBroker.encode(data, cursor);
        }
        if (orderReplacedRankPricePresent()) {
            cursor = orderReplacedRankPrice.encode(data, cursor);
        }
        if (orderReplacedDisplayPricePresent()) {
            cursor = orderReplacedDisplayPrice.encode(data, cursor);
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
            case "OrderReplacedPresenceBits" -> Optional.of(orderReplacedPresenceBits);
            case "TransactTime" -> Optional.of(transactTime);
            case "OrderId" -> Optional.of(orderId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "OrderReplacedBitFields" -> Optional.of(orderReplacedBitFields);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "OrderReplacedPrice" -> Optional.of(orderReplacedPrice);
            case "OrderReplacedOrderQty" -> Optional.of(orderReplacedOrderQty);
            case "OrderReplacedMaxFloorQty" -> Optional.of(orderReplacedMaxFloorQty);
            case "OrderReplacedSelfMatchScope" -> Optional.of(orderReplacedSelfMatchScope);
            case "OrderReplacedSelfMatchInstruction" -> Optional.of(orderReplacedSelfMatchInstruction);
            case "OrderReplacedPriceSlideInstruction" -> Optional.of(orderReplacedPriceSlideInstruction);
            case "OrderReplacedReferencePriceTarget" -> Optional.of(orderReplacedReferencePriceTarget);
            case "OrderReplacedLocateBroker" -> Optional.of(orderReplacedLocateBroker);
            case "OrderReplacedRankPrice" -> Optional.of(orderReplacedRankPrice);
            case "OrderReplacedDisplayPrice" -> Optional.of(orderReplacedDisplayPrice);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderReplacedMessage message)) {
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
        if (!(other instanceof OrderReplacedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
