package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.txse.txseequities.seed.rake.v1_0.fields.ClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrigClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceRejectedBitFieldsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceRejectedLocateBrokerField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceRejectedMaxFloorQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceRejectedOrderQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceRejectedPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceRejectedPriceField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceRejectedPriceSlideInstructionField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceRejectedReasonField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceRejectedReferencePriceTargetField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceRejectedSelfMatchInstructionField;
import omi.txse.txseequities.seed.rake.v1_0.fields.ReplaceRejectedSelfMatchScopeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the ReplaceRejectedMessage message from the Seed protocol.
 *
 * <p>The requested ReplaceOrder has been rejected.</p>
 */
public final class ReplaceRejectedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'K';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 29;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Replace Rejected Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final ReplaceRejectedPresenceBitsField replaceRejectedPresenceBits = new ReplaceRejectedPresenceBitsField();

    /**
     * Transaction time.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

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
    private final ReplaceRejectedBitFieldsField replaceRejectedBitFields = new ReplaceRejectedBitFieldsField();

    /**
     * Enum ReplaceRejectedReason.
     */
    private final ReplaceRejectedReasonField replaceRejectedReason = new ReplaceRejectedReasonField();

    /**
     * New limit price.
     */
    private final ReplaceRejectedPriceField replaceRejectedPrice = new ReplaceRejectedPriceField();

    /**
     * Quantity.
     */
    private final ReplaceRejectedOrderQtyField replaceRejectedOrderQty = new ReplaceRejectedOrderQtyField();

    /**
     * Quantity to be displayed at one time.
     */
    private final ReplaceRejectedMaxFloorQtyField replaceRejectedMaxFloorQty = new ReplaceRejectedMaxFloorQtyField();

    /**
     * Enum SelfMatchScope.
     */
    private final ReplaceRejectedSelfMatchScopeField replaceRejectedSelfMatchScope = new ReplaceRejectedSelfMatchScopeField();

    /**
     * Enum ReplaceRejectedSelfMatchInstruction.
     */
    private final ReplaceRejectedSelfMatchInstructionField replaceRejectedSelfMatchInstruction = new ReplaceRejectedSelfMatchInstructionField();

    /**
     * Enum ReplaceRejectedPriceSlideInstruction.
     */
    private final ReplaceRejectedPriceSlideInstructionField replaceRejectedPriceSlideInstruction = new ReplaceRejectedPriceSlideInstructionField();

    /**
     * Basis points relative to the NBBO spread.
     */
    private final ReplaceRejectedReferencePriceTargetField replaceRejectedReferencePriceTarget = new ReplaceRejectedReferencePriceTargetField();

    /**
     * Locate broker.
     */
    private final ReplaceRejectedLocateBrokerField replaceRejectedLocateBroker = new ReplaceRejectedLocateBrokerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(replaceRejectedPresenceBits, transactTime, clOrdId, origClOrdId, replaceRejectedBitFields, replaceRejectedReason, replaceRejectedPrice, replaceRejectedOrderQty, replaceRejectedMaxFloorQty, replaceRejectedSelfMatchScope, replaceRejectedSelfMatchInstruction, replaceRejectedPriceSlideInstruction, replaceRejectedReferencePriceTarget, replaceRejectedLocateBroker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the ReplaceRejectedPresenceBits field
     */
    public ReplaceRejectedPresenceBitsField replaceRejectedPresenceBits() {
        return replaceRejectedPresenceBits;
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
     * @return the ReplaceRejectedBitFields field
     */
    public ReplaceRejectedBitFieldsField replaceRejectedBitFields() {
        return replaceRejectedBitFields;
    }

    /**
     * Enum ReplaceRejectedReason.
     *
     * @return the ReplaceRejectedReason field
     */
    public ReplaceRejectedReasonField replaceRejectedReason() {
        return replaceRejectedReason;
    }

    /**
     * New limit price.
     *
     * @return the ReplaceRejectedPrice field
     */
    public ReplaceRejectedPriceField replaceRejectedPrice() {
        return replaceRejectedPrice;
    }

    /**
     * Quantity.
     *
     * @return the ReplaceRejectedOrderQty field
     */
    public ReplaceRejectedOrderQtyField replaceRejectedOrderQty() {
        return replaceRejectedOrderQty;
    }

    /**
     * Quantity to be displayed at one time.
     *
     * @return the ReplaceRejectedMaxFloorQty field
     */
    public ReplaceRejectedMaxFloorQtyField replaceRejectedMaxFloorQty() {
        return replaceRejectedMaxFloorQty;
    }

    /**
     * Enum SelfMatchScope.
     *
     * @return the ReplaceRejectedSelfMatchScope field
     */
    public ReplaceRejectedSelfMatchScopeField replaceRejectedSelfMatchScope() {
        return replaceRejectedSelfMatchScope;
    }

    /**
     * Enum ReplaceRejectedSelfMatchInstruction.
     *
     * @return the ReplaceRejectedSelfMatchInstruction field
     */
    public ReplaceRejectedSelfMatchInstructionField replaceRejectedSelfMatchInstruction() {
        return replaceRejectedSelfMatchInstruction;
    }

    /**
     * Enum ReplaceRejectedPriceSlideInstruction.
     *
     * @return the ReplaceRejectedPriceSlideInstruction field
     */
    public ReplaceRejectedPriceSlideInstructionField replaceRejectedPriceSlideInstruction() {
        return replaceRejectedPriceSlideInstruction;
    }

    /**
     * Basis points relative to the NBBO spread.
     *
     * @return the ReplaceRejectedReferencePriceTarget field
     */
    public ReplaceRejectedReferencePriceTargetField replaceRejectedReferencePriceTarget() {
        return replaceRejectedReferencePriceTarget;
    }

    /**
     * Locate broker.
     *
     * @return the ReplaceRejectedLocateBroker field
     */
    public ReplaceRejectedLocateBrokerField replaceRejectedLocateBroker() {
        return replaceRejectedLocateBroker;
    }

    /**
     * Returns whether the fields before the ReplaceRejectedPrice put it on the wire.
     *
     * <p>Decode reads the ReplaceRejectedPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReplaceRejectedPrice is on the wire
     */
    public boolean replaceRejectedPricePresent() {
        return replaceRejectedPresenceBits.hasReplaceRejectedPrice();
    }

    /**
     * Returns whether the fields before the ReplaceRejectedOrderQty put it on the wire.
     *
     * <p>Decode reads the ReplaceRejectedOrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReplaceRejectedOrderQty is on the wire
     */
    public boolean replaceRejectedOrderQtyPresent() {
        return replaceRejectedPresenceBits.hasReplaceRejectedOrderQty();
    }

    /**
     * Returns whether the fields before the ReplaceRejectedMaxFloorQty put it on the wire.
     *
     * <p>Decode reads the ReplaceRejectedMaxFloorQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReplaceRejectedMaxFloorQty is on the wire
     */
    public boolean replaceRejectedMaxFloorQtyPresent() {
        return replaceRejectedPresenceBits.hasReplaceRejectedMaxFloorQty();
    }

    /**
     * Returns whether the fields before the ReplaceRejectedSelfMatchScope put it on the wire.
     *
     * <p>Decode reads the ReplaceRejectedSelfMatchScope where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReplaceRejectedSelfMatchScope is on the wire
     */
    public boolean replaceRejectedSelfMatchScopePresent() {
        return replaceRejectedPresenceBits.hasReplaceRejectedSelfMatchScope();
    }

    /**
     * Returns whether the fields before the ReplaceRejectedSelfMatchInstruction put it on the wire.
     *
     * <p>Decode reads the ReplaceRejectedSelfMatchInstruction where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReplaceRejectedSelfMatchInstruction is on the wire
     */
    public boolean replaceRejectedSelfMatchInstructionPresent() {
        return replaceRejectedPresenceBits.hasReplaceRejectedSelfMatchInstruction();
    }

    /**
     * Returns whether the fields before the ReplaceRejectedPriceSlideInstruction put it on the wire.
     *
     * <p>Decode reads the ReplaceRejectedPriceSlideInstruction where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReplaceRejectedPriceSlideInstruction is on the wire
     */
    public boolean replaceRejectedPriceSlideInstructionPresent() {
        return replaceRejectedPresenceBits.hasReplaceRejectedPriceSlideInstruction();
    }

    /**
     * Returns whether the fields before the ReplaceRejectedReferencePriceTarget put it on the wire.
     *
     * <p>Decode reads the ReplaceRejectedReferencePriceTarget where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReplaceRejectedReferencePriceTarget is on the wire
     */
    public boolean replaceRejectedReferencePriceTargetPresent() {
        return replaceRejectedPresenceBits.hasReplaceRejectedReferencePriceTarget();
    }

    /**
     * Returns whether the fields before the ReplaceRejectedLocateBroker put it on the wire.
     *
     * <p>Decode reads the ReplaceRejectedLocateBroker where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReplaceRejectedLocateBroker is on the wire
     */
    public boolean replaceRejectedLocateBrokerPresent() {
        return replaceRejectedPresenceBits.hasReplaceRejectedLocateBroker();
    }

    private boolean onWire(Field field) {
        return (field != replaceRejectedPrice || replaceRejectedPricePresent()) && (field != replaceRejectedOrderQty || replaceRejectedOrderQtyPresent()) && (field != replaceRejectedMaxFloorQty || replaceRejectedMaxFloorQtyPresent()) && (field != replaceRejectedSelfMatchScope || replaceRejectedSelfMatchScopePresent()) && (field != replaceRejectedSelfMatchInstruction || replaceRejectedSelfMatchInstructionPresent()) && (field != replaceRejectedPriceSlideInstruction || replaceRejectedPriceSlideInstructionPresent()) && (field != replaceRejectedReferencePriceTarget || replaceRejectedReferencePriceTargetPresent()) && (field != replaceRejectedLocateBroker || replaceRejectedLocateBrokerPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (replaceRejectedPricePresent() ? ReplaceRejectedPriceField.BYTE_LENGTH : 0) + (replaceRejectedOrderQtyPresent() ? ReplaceRejectedOrderQtyField.BYTE_LENGTH : 0) + (replaceRejectedMaxFloorQtyPresent() ? ReplaceRejectedMaxFloorQtyField.BYTE_LENGTH : 0) + (replaceRejectedSelfMatchScopePresent() ? ReplaceRejectedSelfMatchScopeField.BYTE_LENGTH : 0) + (replaceRejectedSelfMatchInstructionPresent() ? ReplaceRejectedSelfMatchInstructionField.BYTE_LENGTH : 0) + (replaceRejectedPriceSlideInstructionPresent() ? ReplaceRejectedPriceSlideInstructionField.BYTE_LENGTH : 0) + (replaceRejectedReferencePriceTargetPresent() ? ReplaceRejectedReferencePriceTargetField.BYTE_LENGTH : 0) + (replaceRejectedLocateBrokerPresent() ? ReplaceRejectedLocateBrokerField.BYTE_LENGTH : 0);
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
        if (!replaceRejectedPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += ReplaceRejectedPresenceBitsField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!origClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClOrdIdField.BYTE_LENGTH;
        if (!replaceRejectedBitFields.parse(data, cursor)) {
            return false;
        }
        cursor += ReplaceRejectedBitFieldsField.BYTE_LENGTH;
        if (!replaceRejectedReason.parse(data, cursor)) {
            return false;
        }
        cursor += ReplaceRejectedReasonField.BYTE_LENGTH;
        if (replaceRejectedPricePresent()) {
            if (end - cursor < ReplaceRejectedPriceField.BYTE_LENGTH || !replaceRejectedPrice.parse(data, cursor)) {
                return false;
            }
            cursor += ReplaceRejectedPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (replaceRejectedOrderQtyPresent()) {
            if (end - cursor < ReplaceRejectedOrderQtyField.BYTE_LENGTH || !replaceRejectedOrderQty.parse(data, cursor)) {
                return false;
            }
            cursor += ReplaceRejectedOrderQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (replaceRejectedMaxFloorQtyPresent()) {
            if (end - cursor < ReplaceRejectedMaxFloorQtyField.BYTE_LENGTH || !replaceRejectedMaxFloorQty.parse(data, cursor)) {
                return false;
            }
            cursor += ReplaceRejectedMaxFloorQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (replaceRejectedSelfMatchScopePresent()) {
            if (end - cursor < ReplaceRejectedSelfMatchScopeField.BYTE_LENGTH || !replaceRejectedSelfMatchScope.parse(data, cursor)) {
                return false;
            }
            cursor += ReplaceRejectedSelfMatchScopeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (replaceRejectedSelfMatchInstructionPresent()) {
            if (end - cursor < ReplaceRejectedSelfMatchInstructionField.BYTE_LENGTH || !replaceRejectedSelfMatchInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += ReplaceRejectedSelfMatchInstructionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (replaceRejectedPriceSlideInstructionPresent()) {
            if (end - cursor < ReplaceRejectedPriceSlideInstructionField.BYTE_LENGTH || !replaceRejectedPriceSlideInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += ReplaceRejectedPriceSlideInstructionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (replaceRejectedReferencePriceTargetPresent()) {
            if (end - cursor < ReplaceRejectedReferencePriceTargetField.BYTE_LENGTH || !replaceRejectedReferencePriceTarget.parse(data, cursor)) {
                return false;
            }
            cursor += ReplaceRejectedReferencePriceTargetField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (replaceRejectedLocateBrokerPresent()) {
            if (end - cursor < ReplaceRejectedLocateBrokerField.BYTE_LENGTH || !replaceRejectedLocateBroker.parse(data, cursor)) {
                return false;
            }
            cursor += ReplaceRejectedLocateBrokerField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (replaceRejectedPricePresent() != replaceRejectedPrice.hasValue()) {
            throw new IllegalStateException(replaceRejectedPrice.hasValue() ? "replaceRejectedPrice holds a value the fields before it leave off the wire" : "replaceRejectedPrice holds no value, though the fields before it put it on the wire");
        }
        if (replaceRejectedOrderQtyPresent() != replaceRejectedOrderQty.hasValue()) {
            throw new IllegalStateException(replaceRejectedOrderQty.hasValue() ? "replaceRejectedOrderQty holds a value the fields before it leave off the wire" : "replaceRejectedOrderQty holds no value, though the fields before it put it on the wire");
        }
        if (replaceRejectedMaxFloorQtyPresent() != replaceRejectedMaxFloorQty.hasValue()) {
            throw new IllegalStateException(replaceRejectedMaxFloorQty.hasValue() ? "replaceRejectedMaxFloorQty holds a value the fields before it leave off the wire" : "replaceRejectedMaxFloorQty holds no value, though the fields before it put it on the wire");
        }
        if (replaceRejectedSelfMatchScopePresent() != replaceRejectedSelfMatchScope.hasValue()) {
            throw new IllegalStateException(replaceRejectedSelfMatchScope.hasValue() ? "replaceRejectedSelfMatchScope holds a value the fields before it leave off the wire" : "replaceRejectedSelfMatchScope holds no value, though the fields before it put it on the wire");
        }
        if (replaceRejectedSelfMatchInstructionPresent() != replaceRejectedSelfMatchInstruction.hasValue()) {
            throw new IllegalStateException(replaceRejectedSelfMatchInstruction.hasValue() ? "replaceRejectedSelfMatchInstruction holds a value the fields before it leave off the wire" : "replaceRejectedSelfMatchInstruction holds no value, though the fields before it put it on the wire");
        }
        if (replaceRejectedPriceSlideInstructionPresent() != replaceRejectedPriceSlideInstruction.hasValue()) {
            throw new IllegalStateException(replaceRejectedPriceSlideInstruction.hasValue() ? "replaceRejectedPriceSlideInstruction holds a value the fields before it leave off the wire" : "replaceRejectedPriceSlideInstruction holds no value, though the fields before it put it on the wire");
        }
        if (replaceRejectedReferencePriceTargetPresent() != replaceRejectedReferencePriceTarget.hasValue()) {
            throw new IllegalStateException(replaceRejectedReferencePriceTarget.hasValue() ? "replaceRejectedReferencePriceTarget holds a value the fields before it leave off the wire" : "replaceRejectedReferencePriceTarget holds no value, though the fields before it put it on the wire");
        }
        if (replaceRejectedLocateBrokerPresent() != replaceRejectedLocateBroker.hasValue()) {
            throw new IllegalStateException(replaceRejectedLocateBroker.hasValue() ? "replaceRejectedLocateBroker holds a value the fields before it leave off the wire" : "replaceRejectedLocateBroker holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = replaceRejectedPresenceBits.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = origClOrdId.encode(data, cursor);
        cursor = replaceRejectedBitFields.encode(data, cursor);
        cursor = replaceRejectedReason.encode(data, cursor);
        if (replaceRejectedPricePresent()) {
            cursor = replaceRejectedPrice.encode(data, cursor);
        }
        if (replaceRejectedOrderQtyPresent()) {
            cursor = replaceRejectedOrderQty.encode(data, cursor);
        }
        if (replaceRejectedMaxFloorQtyPresent()) {
            cursor = replaceRejectedMaxFloorQty.encode(data, cursor);
        }
        if (replaceRejectedSelfMatchScopePresent()) {
            cursor = replaceRejectedSelfMatchScope.encode(data, cursor);
        }
        if (replaceRejectedSelfMatchInstructionPresent()) {
            cursor = replaceRejectedSelfMatchInstruction.encode(data, cursor);
        }
        if (replaceRejectedPriceSlideInstructionPresent()) {
            cursor = replaceRejectedPriceSlideInstruction.encode(data, cursor);
        }
        if (replaceRejectedReferencePriceTargetPresent()) {
            cursor = replaceRejectedReferencePriceTarget.encode(data, cursor);
        }
        if (replaceRejectedLocateBrokerPresent()) {
            cursor = replaceRejectedLocateBroker.encode(data, cursor);
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
            case "ReplaceRejectedPresenceBits" -> Optional.of(replaceRejectedPresenceBits);
            case "TransactTime" -> Optional.of(transactTime);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrigClOrdId" -> Optional.of(origClOrdId);
            case "ReplaceRejectedBitFields" -> Optional.of(replaceRejectedBitFields);
            case "ReplaceRejectedReason" -> Optional.of(replaceRejectedReason);
            case "ReplaceRejectedPrice" -> Optional.of(replaceRejectedPrice);
            case "ReplaceRejectedOrderQty" -> Optional.of(replaceRejectedOrderQty);
            case "ReplaceRejectedMaxFloorQty" -> Optional.of(replaceRejectedMaxFloorQty);
            case "ReplaceRejectedSelfMatchScope" -> Optional.of(replaceRejectedSelfMatchScope);
            case "ReplaceRejectedSelfMatchInstruction" -> Optional.of(replaceRejectedSelfMatchInstruction);
            case "ReplaceRejectedPriceSlideInstruction" -> Optional.of(replaceRejectedPriceSlideInstruction);
            case "ReplaceRejectedReferencePriceTarget" -> Optional.of(replaceRejectedReferencePriceTarget);
            case "ReplaceRejectedLocateBroker" -> Optional.of(replaceRejectedLocateBroker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ReplaceRejectedMessage message)) {
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
        if (!(other instanceof ReplaceRejectedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
