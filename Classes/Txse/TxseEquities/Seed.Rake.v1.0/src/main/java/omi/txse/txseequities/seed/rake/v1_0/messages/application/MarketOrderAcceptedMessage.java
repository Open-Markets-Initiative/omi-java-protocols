package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.txse.txseequities.seed.rake.v1_0.fields.ClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderAcceptedBitFieldsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderAcceptedLocateBrokerField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderAcceptedMemberGroupField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderAcceptedMpidField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderAcceptedPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderAcceptedSelfMatchInstructionField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderAcceptedSelfMatchScopeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderAcceptedUserDataField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.SymbolIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the MarketOrderAcceptedMessage message from the Seed protocol.
 *
 * <p>Acknowledges acceptance of a submitted MarketOrder.</p>
 */
public final class MarketOrderAcceptedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'D';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 34;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Market Order Accepted Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final MarketOrderAcceptedPresenceBitsField marketOrderAcceptedPresenceBits = new MarketOrderAcceptedPresenceBitsField();

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
     * Bitfield used in MarketOrder, MarketOrderAccepted, and MarketOrderRejected messages.
     */
    private final MarketOrderAcceptedBitFieldsField marketOrderAcceptedBitFields = new MarketOrderAcceptedBitFieldsField();

    /**
     * Symbol identifier.
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Enum SelfMatchScope.
     */
    private final MarketOrderAcceptedSelfMatchScopeField marketOrderAcceptedSelfMatchScope = new MarketOrderAcceptedSelfMatchScopeField();

    /**
     * Enum MarketOrderAcceptedSelfMatchInstruction.
     */
    private final MarketOrderAcceptedSelfMatchInstructionField marketOrderAcceptedSelfMatchInstruction = new MarketOrderAcceptedSelfMatchInstructionField();

    /**
     * Pass-through field.
     */
    private final MarketOrderAcceptedUserDataField marketOrderAcceptedUserData = new MarketOrderAcceptedUserDataField();

    /**
     * Market Participant Identifier.
     */
    private final MarketOrderAcceptedMpidField marketOrderAcceptedMpid = new MarketOrderAcceptedMpidField();

    /**
     * Member supplied grouping.
     */
    private final MarketOrderAcceptedMemberGroupField marketOrderAcceptedMemberGroup = new MarketOrderAcceptedMemberGroupField();

    /**
     * Locate broker.
     */
    private final MarketOrderAcceptedLocateBrokerField marketOrderAcceptedLocateBroker = new MarketOrderAcceptedLocateBrokerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketOrderAcceptedPresenceBits, transactTime, orderId, clOrdId, orderQty, marketOrderAcceptedBitFields, symbolId, marketOrderAcceptedSelfMatchScope, marketOrderAcceptedSelfMatchInstruction, marketOrderAcceptedUserData, marketOrderAcceptedMpid, marketOrderAcceptedMemberGroup, marketOrderAcceptedLocateBroker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the MarketOrderAcceptedPresenceBits field
     */
    public MarketOrderAcceptedPresenceBitsField marketOrderAcceptedPresenceBits() {
        return marketOrderAcceptedPresenceBits;
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
     * Bitfield used in MarketOrder, MarketOrderAccepted, and MarketOrderRejected messages.
     *
     * @return the MarketOrderAcceptedBitFields field
     */
    public MarketOrderAcceptedBitFieldsField marketOrderAcceptedBitFields() {
        return marketOrderAcceptedBitFields;
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
     * Enum SelfMatchScope.
     *
     * @return the MarketOrderAcceptedSelfMatchScope field
     */
    public MarketOrderAcceptedSelfMatchScopeField marketOrderAcceptedSelfMatchScope() {
        return marketOrderAcceptedSelfMatchScope;
    }

    /**
     * Enum MarketOrderAcceptedSelfMatchInstruction.
     *
     * @return the MarketOrderAcceptedSelfMatchInstruction field
     */
    public MarketOrderAcceptedSelfMatchInstructionField marketOrderAcceptedSelfMatchInstruction() {
        return marketOrderAcceptedSelfMatchInstruction;
    }

    /**
     * Pass-through field.
     *
     * @return the MarketOrderAcceptedUserData field
     */
    public MarketOrderAcceptedUserDataField marketOrderAcceptedUserData() {
        return marketOrderAcceptedUserData;
    }

    /**
     * Market Participant Identifier.
     *
     * @return the MarketOrderAcceptedMpid field
     */
    public MarketOrderAcceptedMpidField marketOrderAcceptedMpid() {
        return marketOrderAcceptedMpid;
    }

    /**
     * Member supplied grouping.
     *
     * @return the MarketOrderAcceptedMemberGroup field
     */
    public MarketOrderAcceptedMemberGroupField marketOrderAcceptedMemberGroup() {
        return marketOrderAcceptedMemberGroup;
    }

    /**
     * Locate broker.
     *
     * @return the MarketOrderAcceptedLocateBroker field
     */
    public MarketOrderAcceptedLocateBrokerField marketOrderAcceptedLocateBroker() {
        return marketOrderAcceptedLocateBroker;
    }

    /**
     * Returns whether the fields before the MarketOrderAcceptedSelfMatchScope put it on the wire.
     *
     * <p>Decode reads the MarketOrderAcceptedSelfMatchScope where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderAcceptedSelfMatchScope is on the wire
     */
    public boolean marketOrderAcceptedSelfMatchScopePresent() {
        return marketOrderAcceptedPresenceBits.hasMarketOrderAcceptedSelfMatchScope();
    }

    /**
     * Returns whether the fields before the MarketOrderAcceptedSelfMatchInstruction put it on the wire.
     *
     * <p>Decode reads the MarketOrderAcceptedSelfMatchInstruction where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderAcceptedSelfMatchInstruction is on the wire
     */
    public boolean marketOrderAcceptedSelfMatchInstructionPresent() {
        return marketOrderAcceptedPresenceBits.hasMarketOrderAcceptedSelfMatchInstruction();
    }

    /**
     * Returns whether the fields before the MarketOrderAcceptedUserData put it on the wire.
     *
     * <p>Decode reads the MarketOrderAcceptedUserData where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderAcceptedUserData is on the wire
     */
    public boolean marketOrderAcceptedUserDataPresent() {
        return marketOrderAcceptedPresenceBits.hasMarketOrderAcceptedUserData();
    }

    /**
     * Returns whether the fields before the MarketOrderAcceptedMpid put it on the wire.
     *
     * <p>Decode reads the MarketOrderAcceptedMpid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderAcceptedMpid is on the wire
     */
    public boolean marketOrderAcceptedMpidPresent() {
        return marketOrderAcceptedPresenceBits.hasMarketOrderAcceptedMpid();
    }

    /**
     * Returns whether the fields before the MarketOrderAcceptedMemberGroup put it on the wire.
     *
     * <p>Decode reads the MarketOrderAcceptedMemberGroup where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderAcceptedMemberGroup is on the wire
     */
    public boolean marketOrderAcceptedMemberGroupPresent() {
        return marketOrderAcceptedPresenceBits.hasMarketOrderAcceptedMemberGroup();
    }

    /**
     * Returns whether the fields before the MarketOrderAcceptedLocateBroker put it on the wire.
     *
     * <p>Decode reads the MarketOrderAcceptedLocateBroker where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderAcceptedLocateBroker is on the wire
     */
    public boolean marketOrderAcceptedLocateBrokerPresent() {
        return marketOrderAcceptedPresenceBits.hasMarketOrderAcceptedLocateBroker();
    }

    private boolean onWire(Field field) {
        return (field != marketOrderAcceptedSelfMatchScope || marketOrderAcceptedSelfMatchScopePresent()) && (field != marketOrderAcceptedSelfMatchInstruction || marketOrderAcceptedSelfMatchInstructionPresent()) && (field != marketOrderAcceptedUserData || marketOrderAcceptedUserDataPresent()) && (field != marketOrderAcceptedMpid || marketOrderAcceptedMpidPresent()) && (field != marketOrderAcceptedMemberGroup || marketOrderAcceptedMemberGroupPresent()) && (field != marketOrderAcceptedLocateBroker || marketOrderAcceptedLocateBrokerPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (marketOrderAcceptedSelfMatchScopePresent() ? MarketOrderAcceptedSelfMatchScopeField.BYTE_LENGTH : 0) + (marketOrderAcceptedSelfMatchInstructionPresent() ? MarketOrderAcceptedSelfMatchInstructionField.BYTE_LENGTH : 0) + (marketOrderAcceptedUserDataPresent() ? MarketOrderAcceptedUserDataField.BYTE_LENGTH : 0) + (marketOrderAcceptedMpidPresent() ? MarketOrderAcceptedMpidField.BYTE_LENGTH : 0) + (marketOrderAcceptedMemberGroupPresent() ? MarketOrderAcceptedMemberGroupField.BYTE_LENGTH : 0) + (marketOrderAcceptedLocateBrokerPresent() ? MarketOrderAcceptedLocateBrokerField.BYTE_LENGTH : 0);
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
        if (!marketOrderAcceptedPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += MarketOrderAcceptedPresenceBitsField.BYTE_LENGTH;
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
        if (!marketOrderAcceptedBitFields.parse(data, cursor)) {
            return false;
        }
        cursor += MarketOrderAcceptedBitFieldsField.BYTE_LENGTH;
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (marketOrderAcceptedSelfMatchScopePresent()) {
            if (end - cursor < MarketOrderAcceptedSelfMatchScopeField.BYTE_LENGTH || !marketOrderAcceptedSelfMatchScope.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderAcceptedSelfMatchScopeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (marketOrderAcceptedSelfMatchInstructionPresent()) {
            if (end - cursor < MarketOrderAcceptedSelfMatchInstructionField.BYTE_LENGTH || !marketOrderAcceptedSelfMatchInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderAcceptedSelfMatchInstructionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (marketOrderAcceptedUserDataPresent()) {
            if (end - cursor < MarketOrderAcceptedUserDataField.BYTE_LENGTH || !marketOrderAcceptedUserData.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderAcceptedUserDataField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (marketOrderAcceptedMpidPresent()) {
            if (end - cursor < MarketOrderAcceptedMpidField.BYTE_LENGTH || !marketOrderAcceptedMpid.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderAcceptedMpidField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (marketOrderAcceptedMemberGroupPresent()) {
            if (end - cursor < MarketOrderAcceptedMemberGroupField.BYTE_LENGTH || !marketOrderAcceptedMemberGroup.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderAcceptedMemberGroupField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (marketOrderAcceptedLocateBrokerPresent()) {
            if (end - cursor < MarketOrderAcceptedLocateBrokerField.BYTE_LENGTH || !marketOrderAcceptedLocateBroker.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderAcceptedLocateBrokerField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (marketOrderAcceptedSelfMatchScopePresent() != marketOrderAcceptedSelfMatchScope.hasValue()) {
            throw new IllegalStateException(marketOrderAcceptedSelfMatchScope.hasValue() ? "marketOrderAcceptedSelfMatchScope holds a value the fields before it leave off the wire" : "marketOrderAcceptedSelfMatchScope holds no value, though the fields before it put it on the wire");
        }
        if (marketOrderAcceptedSelfMatchInstructionPresent() != marketOrderAcceptedSelfMatchInstruction.hasValue()) {
            throw new IllegalStateException(marketOrderAcceptedSelfMatchInstruction.hasValue() ? "marketOrderAcceptedSelfMatchInstruction holds a value the fields before it leave off the wire" : "marketOrderAcceptedSelfMatchInstruction holds no value, though the fields before it put it on the wire");
        }
        if (marketOrderAcceptedUserDataPresent() != marketOrderAcceptedUserData.hasValue()) {
            throw new IllegalStateException(marketOrderAcceptedUserData.hasValue() ? "marketOrderAcceptedUserData holds a value the fields before it leave off the wire" : "marketOrderAcceptedUserData holds no value, though the fields before it put it on the wire");
        }
        if (marketOrderAcceptedMpidPresent() != marketOrderAcceptedMpid.hasValue()) {
            throw new IllegalStateException(marketOrderAcceptedMpid.hasValue() ? "marketOrderAcceptedMpid holds a value the fields before it leave off the wire" : "marketOrderAcceptedMpid holds no value, though the fields before it put it on the wire");
        }
        if (marketOrderAcceptedMemberGroupPresent() != marketOrderAcceptedMemberGroup.hasValue()) {
            throw new IllegalStateException(marketOrderAcceptedMemberGroup.hasValue() ? "marketOrderAcceptedMemberGroup holds a value the fields before it leave off the wire" : "marketOrderAcceptedMemberGroup holds no value, though the fields before it put it on the wire");
        }
        if (marketOrderAcceptedLocateBrokerPresent() != marketOrderAcceptedLocateBroker.hasValue()) {
            throw new IllegalStateException(marketOrderAcceptedLocateBroker.hasValue() ? "marketOrderAcceptedLocateBroker holds a value the fields before it leave off the wire" : "marketOrderAcceptedLocateBroker holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = marketOrderAcceptedPresenceBits.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = marketOrderAcceptedBitFields.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        if (marketOrderAcceptedSelfMatchScopePresent()) {
            cursor = marketOrderAcceptedSelfMatchScope.encode(data, cursor);
        }
        if (marketOrderAcceptedSelfMatchInstructionPresent()) {
            cursor = marketOrderAcceptedSelfMatchInstruction.encode(data, cursor);
        }
        if (marketOrderAcceptedUserDataPresent()) {
            cursor = marketOrderAcceptedUserData.encode(data, cursor);
        }
        if (marketOrderAcceptedMpidPresent()) {
            cursor = marketOrderAcceptedMpid.encode(data, cursor);
        }
        if (marketOrderAcceptedMemberGroupPresent()) {
            cursor = marketOrderAcceptedMemberGroup.encode(data, cursor);
        }
        if (marketOrderAcceptedLocateBrokerPresent()) {
            cursor = marketOrderAcceptedLocateBroker.encode(data, cursor);
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
            case "MarketOrderAcceptedPresenceBits" -> Optional.of(marketOrderAcceptedPresenceBits);
            case "TransactTime" -> Optional.of(transactTime);
            case "OrderId" -> Optional.of(orderId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrderQty" -> Optional.of(orderQty);
            case "MarketOrderAcceptedBitFields" -> Optional.of(marketOrderAcceptedBitFields);
            case "SymbolId" -> Optional.of(symbolId);
            case "MarketOrderAcceptedSelfMatchScope" -> Optional.of(marketOrderAcceptedSelfMatchScope);
            case "MarketOrderAcceptedSelfMatchInstruction" -> Optional.of(marketOrderAcceptedSelfMatchInstruction);
            case "MarketOrderAcceptedUserData" -> Optional.of(marketOrderAcceptedUserData);
            case "MarketOrderAcceptedMpid" -> Optional.of(marketOrderAcceptedMpid);
            case "MarketOrderAcceptedMemberGroup" -> Optional.of(marketOrderAcceptedMemberGroup);
            case "MarketOrderAcceptedLocateBroker" -> Optional.of(marketOrderAcceptedLocateBroker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MarketOrderAcceptedMessage message)) {
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
        if (!(other instanceof MarketOrderAcceptedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
