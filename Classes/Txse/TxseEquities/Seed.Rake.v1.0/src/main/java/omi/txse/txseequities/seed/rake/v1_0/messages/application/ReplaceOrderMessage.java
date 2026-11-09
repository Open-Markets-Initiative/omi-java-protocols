package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.txse.txseequities.seed.rake.v1_0.fields.ClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrigClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceOrderBitFieldsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceOrderLocateBrokerField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceOrderMaxFloorQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceOrderOrderQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceOrderPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceOrderPriceField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceOrderPriceSlideInstructionField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceOrderReferencePriceTargetField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceOrderSelfMatchInstructionField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceOrderSelfMatchScopeField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the ReplaceOrderMessage message from the Seed protocol.
 *
 * <p>Replace an existing order with a new order, always losing priority.</p>
 */
public final class ReplaceOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'R';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 20;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Replace Order Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final ReplaceOrderPresenceBitsField replaceOrderPresenceBits = new ReplaceOrderPresenceBitsField();

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
    private final ReplaceOrderBitFieldsField replaceOrderBitFields = new ReplaceOrderBitFieldsField();

    /**
     * New limit price.
     */
    private final ReplaceOrderPriceField replaceOrderPrice = new ReplaceOrderPriceField();

    /**
     * Quantity can remain the same, decrease or increase.
     */
    private final ReplaceOrderOrderQtyField replaceOrderOrderQty = new ReplaceOrderOrderQtyField();

    /**
     * Quantity to be displayed at one time with remaining quantity not displayed on the book.
     */
    private final ReplaceOrderMaxFloorQtyField replaceOrderMaxFloorQty = new ReplaceOrderMaxFloorQtyField();

    /**
     * Enum SelfMatchScope.
     */
    private final ReplaceOrderSelfMatchScopeField replaceOrderSelfMatchScope = new ReplaceOrderSelfMatchScopeField();

    /**
     * Enum ReplaceOrderSelfMatchInstruction.
     */
    private final ReplaceOrderSelfMatchInstructionField replaceOrderSelfMatchInstruction = new ReplaceOrderSelfMatchInstructionField();

    /**
     * Enum ReplaceOrderPriceSlideInstruction.
     */
    private final ReplaceOrderPriceSlideInstructionField replaceOrderPriceSlideInstruction = new ReplaceOrderPriceSlideInstructionField();

    /**
     * The target relative to the reference base price in basis points of the NBBO spread.
     */
    private final ReplaceOrderReferencePriceTargetField replaceOrderReferencePriceTarget = new ReplaceOrderReferencePriceTargetField();

    /**
     * Identifies the broker that has loaned the stock to settle the short sale.
     */
    private final ReplaceOrderLocateBrokerField replaceOrderLocateBroker = new ReplaceOrderLocateBrokerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(replaceOrderPresenceBits, clOrdId, origClOrdId, replaceOrderBitFields, replaceOrderPrice, replaceOrderOrderQty, replaceOrderMaxFloorQty, replaceOrderSelfMatchScope, replaceOrderSelfMatchInstruction, replaceOrderPriceSlideInstruction, replaceOrderReferencePriceTarget, replaceOrderLocateBroker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the ReplaceOrderPresenceBits field
     */
    public ReplaceOrderPresenceBitsField replaceOrderPresenceBits() {
        return replaceOrderPresenceBits;
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
     * @return the ReplaceOrderBitFields field
     */
    public ReplaceOrderBitFieldsField replaceOrderBitFields() {
        return replaceOrderBitFields;
    }

    /**
     * New limit price.
     *
     * @return the ReplaceOrderPrice field
     */
    public ReplaceOrderPriceField replaceOrderPrice() {
        return replaceOrderPrice;
    }

    /**
     * Quantity can remain the same, decrease or increase.
     *
     * @return the ReplaceOrderOrderQty field
     */
    public ReplaceOrderOrderQtyField replaceOrderOrderQty() {
        return replaceOrderOrderQty;
    }

    /**
     * Quantity to be displayed at one time with remaining quantity not displayed on the book.
     *
     * @return the ReplaceOrderMaxFloorQty field
     */
    public ReplaceOrderMaxFloorQtyField replaceOrderMaxFloorQty() {
        return replaceOrderMaxFloorQty;
    }

    /**
     * Enum SelfMatchScope.
     *
     * @return the ReplaceOrderSelfMatchScope field
     */
    public ReplaceOrderSelfMatchScopeField replaceOrderSelfMatchScope() {
        return replaceOrderSelfMatchScope;
    }

    /**
     * Enum ReplaceOrderSelfMatchInstruction.
     *
     * @return the ReplaceOrderSelfMatchInstruction field
     */
    public ReplaceOrderSelfMatchInstructionField replaceOrderSelfMatchInstruction() {
        return replaceOrderSelfMatchInstruction;
    }

    /**
     * Enum ReplaceOrderPriceSlideInstruction.
     *
     * @return the ReplaceOrderPriceSlideInstruction field
     */
    public ReplaceOrderPriceSlideInstructionField replaceOrderPriceSlideInstruction() {
        return replaceOrderPriceSlideInstruction;
    }

    /**
     * The target relative to the reference base price in basis points of the NBBO spread.
     *
     * @return the ReplaceOrderReferencePriceTarget field
     */
    public ReplaceOrderReferencePriceTargetField replaceOrderReferencePriceTarget() {
        return replaceOrderReferencePriceTarget;
    }

    /**
     * Identifies the broker that has loaned the stock to settle the short sale.
     *
     * @return the ReplaceOrderLocateBroker field
     */
    public ReplaceOrderLocateBrokerField replaceOrderLocateBroker() {
        return replaceOrderLocateBroker;
    }

    /**
     * Returns whether the fields before the ReplaceOrderPrice put it on the wire.
     *
     * <p>Decode reads the ReplaceOrderPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReplaceOrderPrice is on the wire
     */
    public boolean replaceOrderPricePresent() {
        return replaceOrderPresenceBits.hasReplaceOrderPrice();
    }

    /**
     * Returns whether the fields before the ReplaceOrderOrderQty put it on the wire.
     *
     * <p>Decode reads the ReplaceOrderOrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReplaceOrderOrderQty is on the wire
     */
    public boolean replaceOrderOrderQtyPresent() {
        return replaceOrderPresenceBits.hasReplaceOrderOrderQty();
    }

    /**
     * Returns whether the fields before the ReplaceOrderMaxFloorQty put it on the wire.
     *
     * <p>Decode reads the ReplaceOrderMaxFloorQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReplaceOrderMaxFloorQty is on the wire
     */
    public boolean replaceOrderMaxFloorQtyPresent() {
        return replaceOrderPresenceBits.hasReplaceOrderMaxFloorQty();
    }

    /**
     * Returns whether the fields before the ReplaceOrderSelfMatchScope put it on the wire.
     *
     * <p>Decode reads the ReplaceOrderSelfMatchScope where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReplaceOrderSelfMatchScope is on the wire
     */
    public boolean replaceOrderSelfMatchScopePresent() {
        return replaceOrderPresenceBits.hasReplaceOrderSelfMatchScope();
    }

    /**
     * Returns whether the fields before the ReplaceOrderSelfMatchInstruction put it on the wire.
     *
     * <p>Decode reads the ReplaceOrderSelfMatchInstruction where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReplaceOrderSelfMatchInstruction is on the wire
     */
    public boolean replaceOrderSelfMatchInstructionPresent() {
        return replaceOrderPresenceBits.hasReplaceOrderSelfMatchInstruction();
    }

    /**
     * Returns whether the fields before the ReplaceOrderPriceSlideInstruction put it on the wire.
     *
     * <p>Decode reads the ReplaceOrderPriceSlideInstruction where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReplaceOrderPriceSlideInstruction is on the wire
     */
    public boolean replaceOrderPriceSlideInstructionPresent() {
        return replaceOrderPresenceBits.hasReplaceOrderPriceSlideInstruction();
    }

    /**
     * Returns whether the fields before the ReplaceOrderReferencePriceTarget put it on the wire.
     *
     * <p>Decode reads the ReplaceOrderReferencePriceTarget where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReplaceOrderReferencePriceTarget is on the wire
     */
    public boolean replaceOrderReferencePriceTargetPresent() {
        return replaceOrderPresenceBits.hasReplaceOrderReferencePriceTarget();
    }

    /**
     * Returns whether the fields before the ReplaceOrderLocateBroker put it on the wire.
     *
     * <p>Decode reads the ReplaceOrderLocateBroker where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReplaceOrderLocateBroker is on the wire
     */
    public boolean replaceOrderLocateBrokerPresent() {
        return replaceOrderPresenceBits.hasReplaceOrderLocateBroker();
    }

    private boolean onWire(Field field) {
        return (field != replaceOrderPrice || replaceOrderPricePresent()) && (field != replaceOrderOrderQty || replaceOrderOrderQtyPresent()) && (field != replaceOrderMaxFloorQty || replaceOrderMaxFloorQtyPresent()) && (field != replaceOrderSelfMatchScope || replaceOrderSelfMatchScopePresent()) && (field != replaceOrderSelfMatchInstruction || replaceOrderSelfMatchInstructionPresent()) && (field != replaceOrderPriceSlideInstruction || replaceOrderPriceSlideInstructionPresent()) && (field != replaceOrderReferencePriceTarget || replaceOrderReferencePriceTargetPresent()) && (field != replaceOrderLocateBroker || replaceOrderLocateBrokerPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (replaceOrderPricePresent() ? ReplaceOrderPriceField.BYTE_LENGTH : 0) + (replaceOrderOrderQtyPresent() ? ReplaceOrderOrderQtyField.BYTE_LENGTH : 0) + (replaceOrderMaxFloorQtyPresent() ? ReplaceOrderMaxFloorQtyField.BYTE_LENGTH : 0) + (replaceOrderSelfMatchScopePresent() ? ReplaceOrderSelfMatchScopeField.BYTE_LENGTH : 0) + (replaceOrderSelfMatchInstructionPresent() ? ReplaceOrderSelfMatchInstructionField.BYTE_LENGTH : 0) + (replaceOrderPriceSlideInstructionPresent() ? ReplaceOrderPriceSlideInstructionField.BYTE_LENGTH : 0) + (replaceOrderReferencePriceTargetPresent() ? ReplaceOrderReferencePriceTargetField.BYTE_LENGTH : 0) + (replaceOrderLocateBrokerPresent() ? ReplaceOrderLocateBrokerField.BYTE_LENGTH : 0);
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
        cursor += 2;
        if (replaceOrderPricePresent()) {
            cursor += 8;
        }
        if (replaceOrderOrderQtyPresent()) {
            cursor += 4;
        }
        if (replaceOrderMaxFloorQtyPresent()) {
            cursor += 4;
        }
        if (replaceOrderSelfMatchScopePresent()) {
            cursor += 1;
        }
        if (replaceOrderSelfMatchInstructionPresent()) {
            cursor += 1;
        }
        if (replaceOrderPriceSlideInstructionPresent()) {
            cursor += 1;
        }
        if (replaceOrderReferencePriceTargetPresent()) {
            cursor += 2;
        }
        if (replaceOrderLocateBrokerPresent()) {
            cursor += 4;
        }
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.empty();
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
        if (!replaceOrderPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += ReplaceOrderPresenceBitsField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!replaceOrderBitFields.parse(data, cursor)) {
            return false;
        }
        cursor += ReplaceOrderBitFieldsField.BYTE_LENGTH;
        if (replaceOrderPricePresent()) {
            if (end - cursor < ReplaceOrderPriceField.BYTE_LENGTH || !replaceOrderPrice.parse(data, cursor)) {
                return false;
            }
            cursor += ReplaceOrderPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (replaceOrderOrderQtyPresent()) {
            if (end - cursor < ReplaceOrderOrderQtyField.BYTE_LENGTH || !replaceOrderOrderQty.parse(data, cursor)) {
                return false;
            }
            cursor += ReplaceOrderOrderQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (replaceOrderMaxFloorQtyPresent()) {
            if (end - cursor < ReplaceOrderMaxFloorQtyField.BYTE_LENGTH || !replaceOrderMaxFloorQty.parse(data, cursor)) {
                return false;
            }
            cursor += ReplaceOrderMaxFloorQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (replaceOrderSelfMatchScopePresent()) {
            if (end - cursor < ReplaceOrderSelfMatchScopeField.BYTE_LENGTH || !replaceOrderSelfMatchScope.parse(data, cursor)) {
                return false;
            }
            cursor += ReplaceOrderSelfMatchScopeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (replaceOrderSelfMatchInstructionPresent()) {
            if (end - cursor < ReplaceOrderSelfMatchInstructionField.BYTE_LENGTH || !replaceOrderSelfMatchInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += ReplaceOrderSelfMatchInstructionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (replaceOrderPriceSlideInstructionPresent()) {
            if (end - cursor < ReplaceOrderPriceSlideInstructionField.BYTE_LENGTH || !replaceOrderPriceSlideInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += ReplaceOrderPriceSlideInstructionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (replaceOrderReferencePriceTargetPresent()) {
            if (end - cursor < ReplaceOrderReferencePriceTargetField.BYTE_LENGTH || !replaceOrderReferencePriceTarget.parse(data, cursor)) {
                return false;
            }
            cursor += ReplaceOrderReferencePriceTargetField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (replaceOrderLocateBrokerPresent()) {
            if (end - cursor < ReplaceOrderLocateBrokerField.BYTE_LENGTH || !replaceOrderLocateBroker.parse(data, cursor)) {
                return false;
            }
            cursor += ReplaceOrderLocateBrokerField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (replaceOrderPricePresent() != replaceOrderPrice.hasValue()) {
            throw new IllegalStateException(replaceOrderPrice.hasValue() ? "replaceOrderPrice holds a value the fields before it leave off the wire" : "replaceOrderPrice holds no value, though the fields before it put it on the wire");
        }
        if (replaceOrderOrderQtyPresent() != replaceOrderOrderQty.hasValue()) {
            throw new IllegalStateException(replaceOrderOrderQty.hasValue() ? "replaceOrderOrderQty holds a value the fields before it leave off the wire" : "replaceOrderOrderQty holds no value, though the fields before it put it on the wire");
        }
        if (replaceOrderMaxFloorQtyPresent() != replaceOrderMaxFloorQty.hasValue()) {
            throw new IllegalStateException(replaceOrderMaxFloorQty.hasValue() ? "replaceOrderMaxFloorQty holds a value the fields before it leave off the wire" : "replaceOrderMaxFloorQty holds no value, though the fields before it put it on the wire");
        }
        if (replaceOrderSelfMatchScopePresent() != replaceOrderSelfMatchScope.hasValue()) {
            throw new IllegalStateException(replaceOrderSelfMatchScope.hasValue() ? "replaceOrderSelfMatchScope holds a value the fields before it leave off the wire" : "replaceOrderSelfMatchScope holds no value, though the fields before it put it on the wire");
        }
        if (replaceOrderSelfMatchInstructionPresent() != replaceOrderSelfMatchInstruction.hasValue()) {
            throw new IllegalStateException(replaceOrderSelfMatchInstruction.hasValue() ? "replaceOrderSelfMatchInstruction holds a value the fields before it leave off the wire" : "replaceOrderSelfMatchInstruction holds no value, though the fields before it put it on the wire");
        }
        if (replaceOrderPriceSlideInstructionPresent() != replaceOrderPriceSlideInstruction.hasValue()) {
            throw new IllegalStateException(replaceOrderPriceSlideInstruction.hasValue() ? "replaceOrderPriceSlideInstruction holds a value the fields before it leave off the wire" : "replaceOrderPriceSlideInstruction holds no value, though the fields before it put it on the wire");
        }
        if (replaceOrderReferencePriceTargetPresent() != replaceOrderReferencePriceTarget.hasValue()) {
            throw new IllegalStateException(replaceOrderReferencePriceTarget.hasValue() ? "replaceOrderReferencePriceTarget holds a value the fields before it leave off the wire" : "replaceOrderReferencePriceTarget holds no value, though the fields before it put it on the wire");
        }
        if (replaceOrderLocateBrokerPresent() != replaceOrderLocateBroker.hasValue()) {
            throw new IllegalStateException(replaceOrderLocateBroker.hasValue() ? "replaceOrderLocateBroker holds a value the fields before it leave off the wire" : "replaceOrderLocateBroker holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = replaceOrderPresenceBits.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = replaceOrderBitFields.encode(data, cursor);
        if (replaceOrderPricePresent()) {
            cursor = replaceOrderPrice.encode(data, cursor);
        }
        if (replaceOrderOrderQtyPresent()) {
            cursor = replaceOrderOrderQty.encode(data, cursor);
        }
        if (replaceOrderMaxFloorQtyPresent()) {
            cursor = replaceOrderMaxFloorQty.encode(data, cursor);
        }
        if (replaceOrderSelfMatchScopePresent()) {
            cursor = replaceOrderSelfMatchScope.encode(data, cursor);
        }
        if (replaceOrderSelfMatchInstructionPresent()) {
            cursor = replaceOrderSelfMatchInstruction.encode(data, cursor);
        }
        if (replaceOrderPriceSlideInstructionPresent()) {
            cursor = replaceOrderPriceSlideInstruction.encode(data, cursor);
        }
        if (replaceOrderReferencePriceTargetPresent()) {
            cursor = replaceOrderReferencePriceTarget.encode(data, cursor);
        }
        if (replaceOrderLocateBrokerPresent()) {
            cursor = replaceOrderLocateBroker.encode(data, cursor);
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
            case "ReplaceOrderPresenceBits" -> Optional.of(replaceOrderPresenceBits);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "ReplaceOrderBitFields" -> Optional.of(replaceOrderBitFields);
            case "ReplaceOrderPrice" -> Optional.of(replaceOrderPrice);
            case "ReplaceOrderOrderQty" -> Optional.of(replaceOrderOrderQty);
            case "ReplaceOrderMaxFloorQty" -> Optional.of(replaceOrderMaxFloorQty);
            case "ReplaceOrderSelfMatchScope" -> Optional.of(replaceOrderSelfMatchScope);
            case "ReplaceOrderSelfMatchInstruction" -> Optional.of(replaceOrderSelfMatchInstruction);
            case "ReplaceOrderPriceSlideInstruction" -> Optional.of(replaceOrderPriceSlideInstruction);
            case "ReplaceOrderReferencePriceTarget" -> Optional.of(replaceOrderReferencePriceTarget);
            case "ReplaceOrderLocateBroker" -> Optional.of(replaceOrderLocateBroker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ReplaceOrderMessage message)) {
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
        if (!(other instanceof ReplaceOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
