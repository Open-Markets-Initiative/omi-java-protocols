package omi.txse.txseequities.seed.rake.v1_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.txse.txseequities.seed.rake.v1_0.fields.ShortSaleRestrictionStateField;
import omi.txse.txseequities.seed.rake.v1_0.fields.SymbolIdField;
import omi.txse.txseequities.seed.rake.v1_0.fields.SymbolStatusOperationalHaltReasonField;
import omi.txse.txseequities.seed.rake.v1_0.fields.SymbolStatusPresenceBitsField;
import omi.txse.txseequities.seed.rake.v1_0.fields.SymbolStatusRegulatoryHaltReasonField;
import omi.txse.txseequities.seed.rake.v1_0.fields.SymbolTradingStateField;
import omi.txse.txseequities.seed.rake.v1_0.fields.TransactTimeField;
import omi.txse.txseequities.seed.rake.v1_0.types.Field;
import omi.txse.txseequities.seed.rake.v1_0.types.Message;
import omi.txse.txseequities.seed.rake.v1_0.types.PrintOptions;

/**
 * Represents the SymbolStatusMessage message from the Seed protocol.
 *
 * <p>Symbol-specific trading status representing the current state and restrictions for an individual security. A SymbolStatus is sent for every symbol, including those that open in the TRADING state. Clients must treat a symbol as operationally HALTED while awaiting the first SymbolStatus. Subsequent SymbolStatus messages are sent whenever the trading state or short-sale restriction changes.</p>
 */
public final class SymbolStatusMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'y';

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 13;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Symbol Status Message";

    /**
     * Presence bit flags for optional fields in the enclosing message.
     */
    private final SymbolStatusPresenceBitsField symbolStatusPresenceBits = new SymbolStatusPresenceBitsField();

    /**
     * Transaction time.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Symbol identifier.
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Enum SymbolTradingState.
     */
    private final SymbolTradingStateField symbolTradingState = new SymbolTradingStateField();

    /**
     * Enum ShortSaleRestrictionState.
     */
    private final ShortSaleRestrictionStateField shortSaleRestrictionState = new ShortSaleRestrictionStateField();

    /**
     * Enum SymbolStatusOperationalHaltReason.
     */
    private final SymbolStatusOperationalHaltReasonField symbolStatusOperationalHaltReason = new SymbolStatusOperationalHaltReasonField();

    /**
     * Enum SymbolStatusRegulatoryHaltReason.
     */
    private final SymbolStatusRegulatoryHaltReasonField symbolStatusRegulatoryHaltReason = new SymbolStatusRegulatoryHaltReasonField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(symbolStatusPresenceBits, transactTime, symbolId, symbolTradingState, shortSaleRestrictionState, symbolStatusOperationalHaltReason, symbolStatusRegulatoryHaltReason);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Presence bit flags for optional fields in the enclosing message.
     *
     * @return the SymbolStatusPresenceBits field
     */
    public SymbolStatusPresenceBitsField symbolStatusPresenceBits() {
        return symbolStatusPresenceBits;
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
     * Symbol identifier.
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
    }

    /**
     * Enum SymbolTradingState.
     *
     * @return the SymbolTradingState field
     */
    public SymbolTradingStateField symbolTradingState() {
        return symbolTradingState;
    }

    /**
     * Enum ShortSaleRestrictionState.
     *
     * @return the ShortSaleRestrictionState field
     */
    public ShortSaleRestrictionStateField shortSaleRestrictionState() {
        return shortSaleRestrictionState;
    }

    /**
     * Enum SymbolStatusOperationalHaltReason.
     *
     * @return the SymbolStatusOperationalHaltReason field
     */
    public SymbolStatusOperationalHaltReasonField symbolStatusOperationalHaltReason() {
        return symbolStatusOperationalHaltReason;
    }

    /**
     * Enum SymbolStatusRegulatoryHaltReason.
     *
     * @return the SymbolStatusRegulatoryHaltReason field
     */
    public SymbolStatusRegulatoryHaltReasonField symbolStatusRegulatoryHaltReason() {
        return symbolStatusRegulatoryHaltReason;
    }

    /**
     * Returns whether the fields before the SymbolStatusOperationalHaltReason put it on the wire.
     *
     * <p>Decode reads the SymbolStatusOperationalHaltReason where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolStatusOperationalHaltReason is on the wire
     */
    public boolean symbolStatusOperationalHaltReasonPresent() {
        return symbolStatusPresenceBits.hasSymbolStatusOperationalHaltReason();
    }

    /**
     * Returns whether the fields before the SymbolStatusRegulatoryHaltReason put it on the wire.
     *
     * <p>Decode reads the SymbolStatusRegulatoryHaltReason where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolStatusRegulatoryHaltReason is on the wire
     */
    public boolean symbolStatusRegulatoryHaltReasonPresent() {
        return symbolStatusPresenceBits.hasSymbolStatusRegulatoryHaltReason();
    }

    private boolean onWire(Field field) {
        return (field != symbolStatusOperationalHaltReason || symbolStatusOperationalHaltReasonPresent()) && (field != symbolStatusRegulatoryHaltReason || symbolStatusRegulatoryHaltReasonPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (symbolStatusOperationalHaltReasonPresent() ? SymbolStatusOperationalHaltReasonField.BYTE_LENGTH : 0) + (symbolStatusRegulatoryHaltReasonPresent() ? SymbolStatusRegulatoryHaltReasonField.BYTE_LENGTH : 0);
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
        if (!symbolStatusPresenceBits.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolStatusPresenceBitsField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!symbolTradingState.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolTradingStateField.BYTE_LENGTH;
        if (!shortSaleRestrictionState.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSaleRestrictionStateField.BYTE_LENGTH;
        if (symbolStatusOperationalHaltReasonPresent()) {
            if (end - cursor < SymbolStatusOperationalHaltReasonField.BYTE_LENGTH || !symbolStatusOperationalHaltReason.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolStatusOperationalHaltReasonField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (symbolStatusRegulatoryHaltReasonPresent()) {
            if (end - cursor < SymbolStatusRegulatoryHaltReasonField.BYTE_LENGTH || !symbolStatusRegulatoryHaltReason.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolStatusRegulatoryHaltReasonField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (symbolStatusOperationalHaltReasonPresent() != symbolStatusOperationalHaltReason.hasValue()) {
            throw new IllegalStateException(symbolStatusOperationalHaltReason.hasValue() ? "symbolStatusOperationalHaltReason holds a value the fields before it leave off the wire" : "symbolStatusOperationalHaltReason holds no value, though the fields before it put it on the wire");
        }
        if (symbolStatusRegulatoryHaltReasonPresent() != symbolStatusRegulatoryHaltReason.hasValue()) {
            throw new IllegalStateException(symbolStatusRegulatoryHaltReason.hasValue() ? "symbolStatusRegulatoryHaltReason holds a value the fields before it leave off the wire" : "symbolStatusRegulatoryHaltReason holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = symbolStatusPresenceBits.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = symbolTradingState.encode(data, cursor);
        cursor = shortSaleRestrictionState.encode(data, cursor);
        if (symbolStatusOperationalHaltReasonPresent()) {
            cursor = symbolStatusOperationalHaltReason.encode(data, cursor);
        }
        if (symbolStatusRegulatoryHaltReasonPresent()) {
            cursor = symbolStatusRegulatoryHaltReason.encode(data, cursor);
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
            case "SymbolStatusPresenceBits" -> Optional.of(symbolStatusPresenceBits);
            case "TransactTime" -> Optional.of(transactTime);
            case "SymbolId" -> Optional.of(symbolId);
            case "SymbolTradingState" -> Optional.of(symbolTradingState);
            case "ShortSaleRestrictionState" -> Optional.of(shortSaleRestrictionState);
            case "SymbolStatusOperationalHaltReason" -> Optional.of(symbolStatusOperationalHaltReason);
            case "SymbolStatusRegulatoryHaltReason" -> Optional.of(symbolStatusRegulatoryHaltReason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SymbolStatusMessage message)) {
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
        if (!(other instanceof SymbolStatusMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
