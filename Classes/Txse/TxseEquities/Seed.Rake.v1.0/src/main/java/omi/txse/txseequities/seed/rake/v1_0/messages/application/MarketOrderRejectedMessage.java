package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.txse.txseequities.seed.rake.v1_0.fields.ClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderRejectedBitFieldsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderRejectedLocateBrokerField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderRejectedMemberGroupField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderRejectedMpidField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderRejectedPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderRejectedReasonField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderRejectedSelfMatchInstructionField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderRejectedSelfMatchScopeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderRejectedUserDataField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.SymbolIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the MarketOrderRejectedMessage message from the Seed protocol.
 *
 * <p>The submitted market order has been rejected by the Exchange.</p>
 */
public final class MarketOrderRejectedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'T';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 27;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Market Order Rejected Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final MarketOrderRejectedPresenceBitsField marketOrderRejectedPresenceBits = new MarketOrderRejectedPresenceBitsField();

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
     * Bitfield used in MarketOrder, MarketOrderAccepted, and MarketOrderRejected messages.
     */
    private final MarketOrderRejectedBitFieldsField marketOrderRejectedBitFields = new MarketOrderRejectedBitFieldsField();

    /**
     * Symbol identifier.
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Enum MarketOrderRejectedReason.
     */
    private final MarketOrderRejectedReasonField marketOrderRejectedReason = new MarketOrderRejectedReasonField();

    /**
     * Enum SelfMatchScope.
     */
    private final MarketOrderRejectedSelfMatchScopeField marketOrderRejectedSelfMatchScope = new MarketOrderRejectedSelfMatchScopeField();

    /**
     * Enum MarketOrderRejectedSelfMatchInstruction.
     */
    private final MarketOrderRejectedSelfMatchInstructionField marketOrderRejectedSelfMatchInstruction = new MarketOrderRejectedSelfMatchInstructionField();

    /**
     * Pass-through field.
     */
    private final MarketOrderRejectedUserDataField marketOrderRejectedUserData = new MarketOrderRejectedUserDataField();

    /**
     * Market Participant Identifier.
     */
    private final MarketOrderRejectedMpidField marketOrderRejectedMpid = new MarketOrderRejectedMpidField();

    /**
     * Member supplied grouping.
     */
    private final MarketOrderRejectedMemberGroupField marketOrderRejectedMemberGroup = new MarketOrderRejectedMemberGroupField();

    /**
     * Locate broker.
     */
    private final MarketOrderRejectedLocateBrokerField marketOrderRejectedLocateBroker = new MarketOrderRejectedLocateBrokerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketOrderRejectedPresenceBits, transactTime, clOrdId, orderQty, marketOrderRejectedBitFields, symbolId, marketOrderRejectedReason, marketOrderRejectedSelfMatchScope, marketOrderRejectedSelfMatchInstruction, marketOrderRejectedUserData, marketOrderRejectedMpid, marketOrderRejectedMemberGroup, marketOrderRejectedLocateBroker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the MarketOrderRejectedPresenceBits field
     */
    public MarketOrderRejectedPresenceBitsField marketOrderRejectedPresenceBits() {
        return marketOrderRejectedPresenceBits;
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
     * Bitfield used in MarketOrder, MarketOrderAccepted, and MarketOrderRejected messages.
     *
     * @return the MarketOrderRejectedBitFields field
     */
    public MarketOrderRejectedBitFieldsField marketOrderRejectedBitFields() {
        return marketOrderRejectedBitFields;
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
     * Enum MarketOrderRejectedReason.
     *
     * @return the MarketOrderRejectedReason field
     */
    public MarketOrderRejectedReasonField marketOrderRejectedReason() {
        return marketOrderRejectedReason;
    }

    /**
     * Enum SelfMatchScope.
     *
     * @return the MarketOrderRejectedSelfMatchScope field
     */
    public MarketOrderRejectedSelfMatchScopeField marketOrderRejectedSelfMatchScope() {
        return marketOrderRejectedSelfMatchScope;
    }

    /**
     * Enum MarketOrderRejectedSelfMatchInstruction.
     *
     * @return the MarketOrderRejectedSelfMatchInstruction field
     */
    public MarketOrderRejectedSelfMatchInstructionField marketOrderRejectedSelfMatchInstruction() {
        return marketOrderRejectedSelfMatchInstruction;
    }

    /**
     * Pass-through field.
     *
     * @return the MarketOrderRejectedUserData field
     */
    public MarketOrderRejectedUserDataField marketOrderRejectedUserData() {
        return marketOrderRejectedUserData;
    }

    /**
     * Market Participant Identifier.
     *
     * @return the MarketOrderRejectedMpid field
     */
    public MarketOrderRejectedMpidField marketOrderRejectedMpid() {
        return marketOrderRejectedMpid;
    }

    /**
     * Member supplied grouping.
     *
     * @return the MarketOrderRejectedMemberGroup field
     */
    public MarketOrderRejectedMemberGroupField marketOrderRejectedMemberGroup() {
        return marketOrderRejectedMemberGroup;
    }

    /**
     * Locate broker.
     *
     * @return the MarketOrderRejectedLocateBroker field
     */
    public MarketOrderRejectedLocateBrokerField marketOrderRejectedLocateBroker() {
        return marketOrderRejectedLocateBroker;
    }

    /**
     * Returns whether the fields before the MarketOrderRejectedSelfMatchScope put it on the wire.
     *
     * <p>Decode reads the MarketOrderRejectedSelfMatchScope where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderRejectedSelfMatchScope is on the wire
     */
    public boolean marketOrderRejectedSelfMatchScopePresent() {
        return marketOrderRejectedPresenceBits.hasMarketOrderRejectedSelfMatchScope();
    }

    /**
     * Returns whether the fields before the MarketOrderRejectedSelfMatchInstruction put it on the wire.
     *
     * <p>Decode reads the MarketOrderRejectedSelfMatchInstruction where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderRejectedSelfMatchInstruction is on the wire
     */
    public boolean marketOrderRejectedSelfMatchInstructionPresent() {
        return marketOrderRejectedPresenceBits.hasMarketOrderRejectedSelfMatchInstruction();
    }

    /**
     * Returns whether the fields before the MarketOrderRejectedUserData put it on the wire.
     *
     * <p>Decode reads the MarketOrderRejectedUserData where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderRejectedUserData is on the wire
     */
    public boolean marketOrderRejectedUserDataPresent() {
        return marketOrderRejectedPresenceBits.hasMarketOrderRejectedUserData();
    }

    /**
     * Returns whether the fields before the MarketOrderRejectedMpid put it on the wire.
     *
     * <p>Decode reads the MarketOrderRejectedMpid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderRejectedMpid is on the wire
     */
    public boolean marketOrderRejectedMpidPresent() {
        return marketOrderRejectedPresenceBits.hasMarketOrderRejectedMpid();
    }

    /**
     * Returns whether the fields before the MarketOrderRejectedMemberGroup put it on the wire.
     *
     * <p>Decode reads the MarketOrderRejectedMemberGroup where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderRejectedMemberGroup is on the wire
     */
    public boolean marketOrderRejectedMemberGroupPresent() {
        return marketOrderRejectedPresenceBits.hasMarketOrderRejectedMemberGroup();
    }

    /**
     * Returns whether the fields before the MarketOrderRejectedLocateBroker put it on the wire.
     *
     * <p>Decode reads the MarketOrderRejectedLocateBroker where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderRejectedLocateBroker is on the wire
     */
    public boolean marketOrderRejectedLocateBrokerPresent() {
        return marketOrderRejectedPresenceBits.hasMarketOrderRejectedLocateBroker();
    }

    private boolean onWire(Field field) {
        return (field != marketOrderRejectedSelfMatchScope || marketOrderRejectedSelfMatchScopePresent()) && (field != marketOrderRejectedSelfMatchInstruction || marketOrderRejectedSelfMatchInstructionPresent()) && (field != marketOrderRejectedUserData || marketOrderRejectedUserDataPresent()) && (field != marketOrderRejectedMpid || marketOrderRejectedMpidPresent()) && (field != marketOrderRejectedMemberGroup || marketOrderRejectedMemberGroupPresent()) && (field != marketOrderRejectedLocateBroker || marketOrderRejectedLocateBrokerPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (marketOrderRejectedSelfMatchScopePresent() ? MarketOrderRejectedSelfMatchScopeField.BYTE_LENGTH : 0) + (marketOrderRejectedSelfMatchInstructionPresent() ? MarketOrderRejectedSelfMatchInstructionField.BYTE_LENGTH : 0) + (marketOrderRejectedUserDataPresent() ? MarketOrderRejectedUserDataField.BYTE_LENGTH : 0) + (marketOrderRejectedMpidPresent() ? MarketOrderRejectedMpidField.BYTE_LENGTH : 0) + (marketOrderRejectedMemberGroupPresent() ? MarketOrderRejectedMemberGroupField.BYTE_LENGTH : 0) + (marketOrderRejectedLocateBrokerPresent() ? MarketOrderRejectedLocateBrokerField.BYTE_LENGTH : 0);
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
        if (!marketOrderRejectedPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += MarketOrderRejectedPresenceBitsField.BYTE_LENGTH;
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
        if (!marketOrderRejectedBitFields.parse(data, cursor)) {
            return false;
        }
        cursor += MarketOrderRejectedBitFieldsField.BYTE_LENGTH;
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!marketOrderRejectedReason.parse(data, cursor)) {
            return false;
        }
        cursor += MarketOrderRejectedReasonField.BYTE_LENGTH;
        if (marketOrderRejectedSelfMatchScopePresent()) {
            if (end - cursor < MarketOrderRejectedSelfMatchScopeField.BYTE_LENGTH || !marketOrderRejectedSelfMatchScope.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderRejectedSelfMatchScopeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (marketOrderRejectedSelfMatchInstructionPresent()) {
            if (end - cursor < MarketOrderRejectedSelfMatchInstructionField.BYTE_LENGTH || !marketOrderRejectedSelfMatchInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderRejectedSelfMatchInstructionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (marketOrderRejectedUserDataPresent()) {
            if (end - cursor < MarketOrderRejectedUserDataField.BYTE_LENGTH || !marketOrderRejectedUserData.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderRejectedUserDataField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (marketOrderRejectedMpidPresent()) {
            if (end - cursor < MarketOrderRejectedMpidField.BYTE_LENGTH || !marketOrderRejectedMpid.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderRejectedMpidField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (marketOrderRejectedMemberGroupPresent()) {
            if (end - cursor < MarketOrderRejectedMemberGroupField.BYTE_LENGTH || !marketOrderRejectedMemberGroup.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderRejectedMemberGroupField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (marketOrderRejectedLocateBrokerPresent()) {
            if (end - cursor < MarketOrderRejectedLocateBrokerField.BYTE_LENGTH || !marketOrderRejectedLocateBroker.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderRejectedLocateBrokerField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (marketOrderRejectedSelfMatchScopePresent() != marketOrderRejectedSelfMatchScope.hasValue()) {
            throw new IllegalStateException(marketOrderRejectedSelfMatchScope.hasValue() ? "marketOrderRejectedSelfMatchScope holds a value the fields before it leave off the wire" : "marketOrderRejectedSelfMatchScope holds no value, though the fields before it put it on the wire");
        }
        if (marketOrderRejectedSelfMatchInstructionPresent() != marketOrderRejectedSelfMatchInstruction.hasValue()) {
            throw new IllegalStateException(marketOrderRejectedSelfMatchInstruction.hasValue() ? "marketOrderRejectedSelfMatchInstruction holds a value the fields before it leave off the wire" : "marketOrderRejectedSelfMatchInstruction holds no value, though the fields before it put it on the wire");
        }
        if (marketOrderRejectedUserDataPresent() != marketOrderRejectedUserData.hasValue()) {
            throw new IllegalStateException(marketOrderRejectedUserData.hasValue() ? "marketOrderRejectedUserData holds a value the fields before it leave off the wire" : "marketOrderRejectedUserData holds no value, though the fields before it put it on the wire");
        }
        if (marketOrderRejectedMpidPresent() != marketOrderRejectedMpid.hasValue()) {
            throw new IllegalStateException(marketOrderRejectedMpid.hasValue() ? "marketOrderRejectedMpid holds a value the fields before it leave off the wire" : "marketOrderRejectedMpid holds no value, though the fields before it put it on the wire");
        }
        if (marketOrderRejectedMemberGroupPresent() != marketOrderRejectedMemberGroup.hasValue()) {
            throw new IllegalStateException(marketOrderRejectedMemberGroup.hasValue() ? "marketOrderRejectedMemberGroup holds a value the fields before it leave off the wire" : "marketOrderRejectedMemberGroup holds no value, though the fields before it put it on the wire");
        }
        if (marketOrderRejectedLocateBrokerPresent() != marketOrderRejectedLocateBroker.hasValue()) {
            throw new IllegalStateException(marketOrderRejectedLocateBroker.hasValue() ? "marketOrderRejectedLocateBroker holds a value the fields before it leave off the wire" : "marketOrderRejectedLocateBroker holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = marketOrderRejectedPresenceBits.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = marketOrderRejectedBitFields.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = marketOrderRejectedReason.encode(data, cursor);
        if (marketOrderRejectedSelfMatchScopePresent()) {
            cursor = marketOrderRejectedSelfMatchScope.encode(data, cursor);
        }
        if (marketOrderRejectedSelfMatchInstructionPresent()) {
            cursor = marketOrderRejectedSelfMatchInstruction.encode(data, cursor);
        }
        if (marketOrderRejectedUserDataPresent()) {
            cursor = marketOrderRejectedUserData.encode(data, cursor);
        }
        if (marketOrderRejectedMpidPresent()) {
            cursor = marketOrderRejectedMpid.encode(data, cursor);
        }
        if (marketOrderRejectedMemberGroupPresent()) {
            cursor = marketOrderRejectedMemberGroup.encode(data, cursor);
        }
        if (marketOrderRejectedLocateBrokerPresent()) {
            cursor = marketOrderRejectedLocateBroker.encode(data, cursor);
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
            case "MarketOrderRejectedPresenceBits" -> Optional.of(marketOrderRejectedPresenceBits);
            case "TransactTime" -> Optional.of(transactTime);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrderQty" -> Optional.of(orderQty);
            case "MarketOrderRejectedBitFields" -> Optional.of(marketOrderRejectedBitFields);
            case "SymbolId" -> Optional.of(symbolId);
            case "MarketOrderRejectedReason" -> Optional.of(marketOrderRejectedReason);
            case "MarketOrderRejectedSelfMatchScope" -> Optional.of(marketOrderRejectedSelfMatchScope);
            case "MarketOrderRejectedSelfMatchInstruction" -> Optional.of(marketOrderRejectedSelfMatchInstruction);
            case "MarketOrderRejectedUserData" -> Optional.of(marketOrderRejectedUserData);
            case "MarketOrderRejectedMpid" -> Optional.of(marketOrderRejectedMpid);
            case "MarketOrderRejectedMemberGroup" -> Optional.of(marketOrderRejectedMemberGroup);
            case "MarketOrderRejectedLocateBroker" -> Optional.of(marketOrderRejectedLocateBroker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MarketOrderRejectedMessage message)) {
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
        if (!(other instanceof MarketOrderRejectedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
