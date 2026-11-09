package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.txse.txseequities.seed.rake.v1_0.fields.ClOrdIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderBitFieldsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderLocateBrokerField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderMemberGroupField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderMpidField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderSelfMatchInstructionField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderSelfMatchScopeField;
import omi.txse.txseequities.seed.rake.v1_0.fields.MarketOrderUserDataField;
import omi.txse.txseequities.seed.rake.v1_0.fields.OrderQtyField;
import omi.txse.txseequities.seed.rake.v1_0.fields.SymbolIdField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the MarketOrderMessage message from the Seed protocol.
 *
 * <p>Client-specified market order.</p>
 */
public final class MarketOrderMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'A';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 18;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Market Order Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final MarketOrderPresenceBitsField marketOrderPresenceBits = new MarketOrderPresenceBitsField();

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
    private final MarketOrderBitFieldsField marketOrderBitFields = new MarketOrderBitFieldsField();

    /**
     * Symbol identifier.
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Enum SelfMatchScope.
     */
    private final MarketOrderSelfMatchScopeField marketOrderSelfMatchScope = new MarketOrderSelfMatchScopeField();

    /**
     * Enum MarketOrderSelfMatchInstruction.
     */
    private final MarketOrderSelfMatchInstructionField marketOrderSelfMatchInstruction = new MarketOrderSelfMatchInstructionField();

    /**
     * Pass-through field for use by clients, not used by the Exchange.
     */
    private final MarketOrderUserDataField marketOrderUserData = new MarketOrderUserDataField();

    /**
     * Market Participant Identifier.
     */
    private final MarketOrderMpidField marketOrderMpid = new MarketOrderMpidField();

    /**
     * Member supplied grouping.
     */
    private final MarketOrderMemberGroupField marketOrderMemberGroup = new MarketOrderMemberGroupField();

    /**
     * Identifies the broker that has loaned the stock to settle the short sale.
     */
    private final MarketOrderLocateBrokerField marketOrderLocateBroker = new MarketOrderLocateBrokerField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(marketOrderPresenceBits, clOrdId, orderQty, marketOrderBitFields, symbolId, marketOrderSelfMatchScope, marketOrderSelfMatchInstruction, marketOrderUserData, marketOrderMpid, marketOrderMemberGroup, marketOrderLocateBroker);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the MarketOrderPresenceBits field
     */
    public MarketOrderPresenceBitsField marketOrderPresenceBits() {
        return marketOrderPresenceBits;
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
     * @return the MarketOrderBitFields field
     */
    public MarketOrderBitFieldsField marketOrderBitFields() {
        return marketOrderBitFields;
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
     * @return the MarketOrderSelfMatchScope field
     */
    public MarketOrderSelfMatchScopeField marketOrderSelfMatchScope() {
        return marketOrderSelfMatchScope;
    }

    /**
     * Enum MarketOrderSelfMatchInstruction.
     *
     * @return the MarketOrderSelfMatchInstruction field
     */
    public MarketOrderSelfMatchInstructionField marketOrderSelfMatchInstruction() {
        return marketOrderSelfMatchInstruction;
    }

    /**
     * Pass-through field for use by clients, not used by the Exchange.
     *
     * @return the MarketOrderUserData field
     */
    public MarketOrderUserDataField marketOrderUserData() {
        return marketOrderUserData;
    }

    /**
     * Market Participant Identifier.
     *
     * @return the MarketOrderMpid field
     */
    public MarketOrderMpidField marketOrderMpid() {
        return marketOrderMpid;
    }

    /**
     * Member supplied grouping.
     *
     * @return the MarketOrderMemberGroup field
     */
    public MarketOrderMemberGroupField marketOrderMemberGroup() {
        return marketOrderMemberGroup;
    }

    /**
     * Identifies the broker that has loaned the stock to settle the short sale.
     *
     * @return the MarketOrderLocateBroker field
     */
    public MarketOrderLocateBrokerField marketOrderLocateBroker() {
        return marketOrderLocateBroker;
    }

    /**
     * Returns whether the fields before the MarketOrderSelfMatchScope put it on the wire.
     *
     * <p>Decode reads the MarketOrderSelfMatchScope where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderSelfMatchScope is on the wire
     */
    public boolean marketOrderSelfMatchScopePresent() {
        return marketOrderPresenceBits.hasMarketOrderSelfMatchScope();
    }

    /**
     * Returns whether the fields before the MarketOrderSelfMatchInstruction put it on the wire.
     *
     * <p>Decode reads the MarketOrderSelfMatchInstruction where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderSelfMatchInstruction is on the wire
     */
    public boolean marketOrderSelfMatchInstructionPresent() {
        return marketOrderPresenceBits.hasMarketOrderSelfMatchInstruction();
    }

    /**
     * Returns whether the fields before the MarketOrderUserData put it on the wire.
     *
     * <p>Decode reads the MarketOrderUserData where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderUserData is on the wire
     */
    public boolean marketOrderUserDataPresent() {
        return marketOrderPresenceBits.hasMarketOrderUserData();
    }

    /**
     * Returns whether the fields before the MarketOrderMpid put it on the wire.
     *
     * <p>Decode reads the MarketOrderMpid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderMpid is on the wire
     */
    public boolean marketOrderMpidPresent() {
        return marketOrderPresenceBits.hasMarketOrderMpid();
    }

    /**
     * Returns whether the fields before the MarketOrderMemberGroup put it on the wire.
     *
     * <p>Decode reads the MarketOrderMemberGroup where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderMemberGroup is on the wire
     */
    public boolean marketOrderMemberGroupPresent() {
        return marketOrderPresenceBits.hasMarketOrderMemberGroup();
    }

    /**
     * Returns whether the fields before the MarketOrderLocateBroker put it on the wire.
     *
     * <p>Decode reads the MarketOrderLocateBroker where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MarketOrderLocateBroker is on the wire
     */
    public boolean marketOrderLocateBrokerPresent() {
        return marketOrderPresenceBits.hasMarketOrderLocateBroker();
    }

    private boolean onWire(Field field) {
        return (field != marketOrderSelfMatchScope || marketOrderSelfMatchScopePresent()) && (field != marketOrderSelfMatchInstruction || marketOrderSelfMatchInstructionPresent()) && (field != marketOrderUserData || marketOrderUserDataPresent()) && (field != marketOrderMpid || marketOrderMpidPresent()) && (field != marketOrderMemberGroup || marketOrderMemberGroupPresent()) && (field != marketOrderLocateBroker || marketOrderLocateBrokerPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (marketOrderSelfMatchScopePresent() ? MarketOrderSelfMatchScopeField.BYTE_LENGTH : 0) + (marketOrderSelfMatchInstructionPresent() ? MarketOrderSelfMatchInstructionField.BYTE_LENGTH : 0) + (marketOrderUserDataPresent() ? MarketOrderUserDataField.BYTE_LENGTH : 0) + (marketOrderMpidPresent() ? MarketOrderMpidField.BYTE_LENGTH : 0) + (marketOrderMemberGroupPresent() ? MarketOrderMemberGroupField.BYTE_LENGTH : 0) + (marketOrderLocateBrokerPresent() ? MarketOrderLocateBrokerField.BYTE_LENGTH : 0);
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
        cursor += 4;
        cursor += 2;
        cursor += 2;
        if (marketOrderSelfMatchScopePresent()) {
            cursor += 1;
        }
        if (marketOrderSelfMatchInstructionPresent()) {
            cursor += 1;
        }
        if (marketOrderUserDataPresent()) {
            cursor += 8;
        }
        if (marketOrderMpidPresent()) {
            cursor += 4;
        }
        if (marketOrderMemberGroupPresent()) {
            cursor += 2;
        }
        if (marketOrderLocateBrokerPresent()) {
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
        if (!marketOrderPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += MarketOrderPresenceBitsField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!marketOrderBitFields.parse(data, cursor)) {
            return false;
        }
        cursor += MarketOrderBitFieldsField.BYTE_LENGTH;
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (marketOrderSelfMatchScopePresent()) {
            if (end - cursor < MarketOrderSelfMatchScopeField.BYTE_LENGTH || !marketOrderSelfMatchScope.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderSelfMatchScopeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (marketOrderSelfMatchInstructionPresent()) {
            if (end - cursor < MarketOrderSelfMatchInstructionField.BYTE_LENGTH || !marketOrderSelfMatchInstruction.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderSelfMatchInstructionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (marketOrderUserDataPresent()) {
            if (end - cursor < MarketOrderUserDataField.BYTE_LENGTH || !marketOrderUserData.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderUserDataField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (marketOrderMpidPresent()) {
            if (end - cursor < MarketOrderMpidField.BYTE_LENGTH || !marketOrderMpid.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderMpidField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (marketOrderMemberGroupPresent()) {
            if (end - cursor < MarketOrderMemberGroupField.BYTE_LENGTH || !marketOrderMemberGroup.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderMemberGroupField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (marketOrderLocateBrokerPresent()) {
            if (end - cursor < MarketOrderLocateBrokerField.BYTE_LENGTH || !marketOrderLocateBroker.parse(data, cursor)) {
                return false;
            }
            cursor += MarketOrderLocateBrokerField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (marketOrderSelfMatchScopePresent() != marketOrderSelfMatchScope.hasValue()) {
            throw new IllegalStateException(marketOrderSelfMatchScope.hasValue() ? "marketOrderSelfMatchScope holds a value the fields before it leave off the wire" : "marketOrderSelfMatchScope holds no value, though the fields before it put it on the wire");
        }
        if (marketOrderSelfMatchInstructionPresent() != marketOrderSelfMatchInstruction.hasValue()) {
            throw new IllegalStateException(marketOrderSelfMatchInstruction.hasValue() ? "marketOrderSelfMatchInstruction holds a value the fields before it leave off the wire" : "marketOrderSelfMatchInstruction holds no value, though the fields before it put it on the wire");
        }
        if (marketOrderUserDataPresent() != marketOrderUserData.hasValue()) {
            throw new IllegalStateException(marketOrderUserData.hasValue() ? "marketOrderUserData holds a value the fields before it leave off the wire" : "marketOrderUserData holds no value, though the fields before it put it on the wire");
        }
        if (marketOrderMpidPresent() != marketOrderMpid.hasValue()) {
            throw new IllegalStateException(marketOrderMpid.hasValue() ? "marketOrderMpid holds a value the fields before it leave off the wire" : "marketOrderMpid holds no value, though the fields before it put it on the wire");
        }
        if (marketOrderMemberGroupPresent() != marketOrderMemberGroup.hasValue()) {
            throw new IllegalStateException(marketOrderMemberGroup.hasValue() ? "marketOrderMemberGroup holds a value the fields before it leave off the wire" : "marketOrderMemberGroup holds no value, though the fields before it put it on the wire");
        }
        if (marketOrderLocateBrokerPresent() != marketOrderLocateBroker.hasValue()) {
            throw new IllegalStateException(marketOrderLocateBroker.hasValue() ? "marketOrderLocateBroker holds a value the fields before it leave off the wire" : "marketOrderLocateBroker holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = marketOrderPresenceBits.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = marketOrderBitFields.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        if (marketOrderSelfMatchScopePresent()) {
            cursor = marketOrderSelfMatchScope.encode(data, cursor);
        }
        if (marketOrderSelfMatchInstructionPresent()) {
            cursor = marketOrderSelfMatchInstruction.encode(data, cursor);
        }
        if (marketOrderUserDataPresent()) {
            cursor = marketOrderUserData.encode(data, cursor);
        }
        if (marketOrderMpidPresent()) {
            cursor = marketOrderMpid.encode(data, cursor);
        }
        if (marketOrderMemberGroupPresent()) {
            cursor = marketOrderMemberGroup.encode(data, cursor);
        }
        if (marketOrderLocateBrokerPresent()) {
            cursor = marketOrderLocateBroker.encode(data, cursor);
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
            case "MarketOrderPresenceBits" -> Optional.of(marketOrderPresenceBits);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrderQty" -> Optional.of(orderQty);
            case "MarketOrderBitFields" -> Optional.of(marketOrderBitFields);
            case "SymbolId" -> Optional.of(symbolId);
            case "MarketOrderSelfMatchScope" -> Optional.of(marketOrderSelfMatchScope);
            case "MarketOrderSelfMatchInstruction" -> Optional.of(marketOrderSelfMatchInstruction);
            case "MarketOrderUserData" -> Optional.of(marketOrderUserData);
            case "MarketOrderMpid" -> Optional.of(marketOrderMpid);
            case "MarketOrderMemberGroup" -> Optional.of(marketOrderMemberGroup);
            case "MarketOrderLocateBroker" -> Optional.of(marketOrderLocateBroker);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MarketOrderMessage message)) {
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
        if (!(other instanceof MarketOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
