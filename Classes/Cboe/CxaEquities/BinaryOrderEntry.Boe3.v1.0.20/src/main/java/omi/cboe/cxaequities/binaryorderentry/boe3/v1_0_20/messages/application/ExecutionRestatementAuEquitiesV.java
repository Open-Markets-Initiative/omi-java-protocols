package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.BaseLiquidityIndicatorField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ClOrdIdField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ContraParticipantIdField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ExecIdField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.ExecRestatementReasonField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.FeeCodeField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.LastPxField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.LastSharesField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.SideField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.SymbolField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.TradingParticipantIdField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.TransactIdField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.fields.TransactionTimeField;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.types.Field;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.types.Message;
import omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.types.PrintOptions;

/**
 * Represents the ExecutionRestatementAuEquitiesV message from the BinaryOrderEntry protocol.
 *
 * <p>Order Execution Restated messages will be issued for all (unbroken) fills of MOC orders after the closing price has been determined</p>
 */
public final class ExecutionRestatementAuEquitiesV implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 73;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Restatement Au Equities V";

    /**
     * The time the event occurred in the Matching Engine (not the time the message was sent)
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * The (4 digit) trading participant identifier
     */
    private final TradingParticipantIdField tradingParticipantId = new TradingParticipantIdField();

    /**
     * Unique Id chosen by the participant
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Execution Id. Unique across all matching units on a given day
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Price of this fill
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Executed quantity
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Side of the order
     */
    private final SideField side = new SideField();

    /**
     * Instrument symbol (upper case alphanumeric)
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Transaction Identifier as sent to CHESS for this order execution
     */
    private final TransactIdField transactId = new TransactIdField();

    /**
     * Indicates whether the trade added or removed liquidity
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Trading Participant Identifier (PID) of the counter party on a trade. 0 If unattributed
     */
    private final ContraParticipantIdField contraParticipantId = new ContraParticipantIdField();

    /**
     * Indicates fee associated with an execution
     */
    private final FeeCodeField feeCode = new FeeCodeField();

    /**
     * The reason for this Order Execution Restated message
     */
    private final ExecRestatementReasonField execRestatementReason = new ExecRestatementReasonField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, tradingParticipantId, clOrdId, execId, lastPx, lastShares, side, symbol, transactId, baseLiquidityIndicator, contraParticipantId, feeCode, execRestatementReason);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the Matching Engine (not the time the message was sent)
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * The (4 digit) trading participant identifier
     *
     * @return the TradingParticipantId field
     */
    public TradingParticipantIdField tradingParticipantId() {
        return tradingParticipantId;
    }

    /**
     * Unique Id chosen by the participant
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Execution Id. Unique across all matching units on a given day
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * Price of this fill
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Executed quantity
     *
     * @return the LastShares field
     */
    public LastSharesField lastShares() {
        return lastShares;
    }

    /**
     * Side of the order
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Instrument symbol (upper case alphanumeric)
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Transaction Identifier as sent to CHESS for this order execution
     *
     * @return the TransactId field
     */
    public TransactIdField transactId() {
        return transactId;
    }

    /**
     * Indicates whether the trade added or removed liquidity
     *
     * @return the BaseLiquidityIndicator field
     */
    public BaseLiquidityIndicatorField baseLiquidityIndicator() {
        return baseLiquidityIndicator;
    }

    /**
     * Trading Participant Identifier (PID) of the counter party on a trade. 0 If unattributed
     *
     * @return the ContraParticipantId field
     */
    public ContraParticipantIdField contraParticipantId() {
        return contraParticipantId;
    }

    /**
     * Indicates fee associated with an execution
     *
     * @return the FeeCode field
     */
    public FeeCodeField feeCode() {
        return feeCode;
    }

    /**
     * The reason for this Order Execution Restated message
     *
     * @return the ExecRestatementReason field
     */
    public ExecRestatementReasonField execRestatementReason() {
        return execRestatementReason;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(transactionTime.value());
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!tradingParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingParticipantIdField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!lastShares.parse(data, cursor)) {
            return false;
        }
        cursor += LastSharesField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!transactId.parse(data, cursor)) {
            return false;
        }
        cursor += TransactIdField.BYTE_LENGTH;
        if (!baseLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
        if (!contraParticipantId.parse(data, cursor)) {
            return false;
        }
        cursor += ContraParticipantIdField.BYTE_LENGTH;
        if (!feeCode.parse(data, cursor)) {
            return false;
        }
        cursor += FeeCodeField.BYTE_LENGTH;
        return execRestatementReason.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = tradingParticipantId.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = transactId.encode(data, cursor);
        cursor = baseLiquidityIndicator.encode(data, cursor);
        cursor = contraParticipantId.encode(data, cursor);
        cursor = feeCode.encode(data, cursor);
        cursor = execRestatementReason.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
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
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
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
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "TransactionTime" -> Optional.of(transactionTime);
            case "TradingParticipantId" -> Optional.of(tradingParticipantId);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "ExecId" -> Optional.of(execId);
            case "LastPx" -> Optional.of(lastPx);
            case "LastShares" -> Optional.of(lastShares);
            case "Side" -> Optional.of(side);
            case "Symbol" -> Optional.of(symbol);
            case "TransactId" -> Optional.of(transactId);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "ContraParticipantId" -> Optional.of(contraParticipantId);
            case "FeeCode" -> Optional.of(feeCode);
            case "ExecRestatementReason" -> Optional.of(execRestatementReason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionRestatementAuEquitiesV message)) {
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

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : fields) {
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
        if (!(other instanceof ExecutionRestatementAuEquitiesV message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
