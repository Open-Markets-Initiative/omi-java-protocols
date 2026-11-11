package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.BaseLiquidityIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ClOrdIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ClearingFirmField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ClearingSizeField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ExecIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.FeeCodeField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.LastPxField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.LastSharesField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.LeavesQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.MaturityDateField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.MultilegReportingTypeField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.PendingStatusField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.SecondaryExecIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.SideField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.SubLiquidityIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.SymbolField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.TradeDateField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.TransactionTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.PrintOptions;

/**
 * Represents the OrderExecution message from the BinaryOrderEntry protocol.
 *
 * <p>AnOrder Executionis sent for each fill on an order</p>
 */
public final class OrderExecution implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 91;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Execution";

    /**
     * The time the event occurred in the CFE Matching Engine (not the time the message was sent)
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Unique Id chosen by the client
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Sent to the OCC in the Trade Id field
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Executed contracts quantity
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Price of this fill
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Quantity still open for further execution
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Indicates whether the trade added or removed liquidity
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Additional information about the liquidity of an order
     */
    private final SubLiquidityIndicatorField subLiquidityIndicator = new SubLiquidityIndicatorField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Simple Instruments can be specified by providing the mapped symbol format in the Symbol field or by providing the product name (e
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * EFID that will clear the trade
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * used to specify the expiration date of the symbol within the specified product class
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Indicates fee associated with an execution
     */
    private final FeeCodeField feeCode = new FeeCodeField();

    /**
     * Business date of the execution
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Size to clear with OCC
     */
    private final ClearingSizeField clearingSize = new ClearingSizeField();

    /**
     * Field is provided as a convenience to determine whether an Order Execution message is a preliminary notification representing a pending trade
     */
    private final PendingStatusField pendingStatus = new PendingStatusField();

    /**
     * Present on Order Execution and TAS Restatement messages representing either Spread orders or Simple orders that are part Spread execution
     */
    private final MultilegReportingTypeField multilegReportingType = new MultilegReportingTypeField();

    /**
     * Indicates whether an execution is a spread or a simple instrument execution that is part of a spread trade
     */
    private final SecondaryExecIdField secondaryExecId = new SecondaryExecIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, execId, lastShares, lastPx, leavesQty, baseLiquidityIndicator, subLiquidityIndicator, side, symbol, clearingFirm, maturityDate, feeCode, tradeDate, clearingSize, pendingStatus, multilegReportingType, secondaryExecId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the CFE Matching Engine (not the time the message was sent)
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Unique Id chosen by the client
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Sent to the OCC in the Trade Id field
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * Executed contracts quantity
     *
     * @return the LastShares field
     */
    public LastSharesField lastShares() {
        return lastShares;
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
     * Quantity still open for further execution
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
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
     * Additional information about the liquidity of an order
     *
     * @return the SubLiquidityIndicator field
     */
    public SubLiquidityIndicatorField subLiquidityIndicator() {
        return subLiquidityIndicator;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Simple Instruments can be specified by providing the mapped symbol format in the Symbol field or by providing the product name (e
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * EFID that will clear the trade
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * used to specify the expiration date of the symbol within the specified product class
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
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
     * Business date of the execution
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
    }

    /**
     * Size to clear with OCC
     *
     * @return the ClearingSize field
     */
    public ClearingSizeField clearingSize() {
        return clearingSize;
    }

    /**
     * Field is provided as a convenience to determine whether an Order Execution message is a preliminary notification representing a pending trade
     *
     * @return the PendingStatus field
     */
    public PendingStatusField pendingStatus() {
        return pendingStatus;
    }

    /**
     * Present on Order Execution and TAS Restatement messages representing either Spread orders or Simple orders that are part Spread execution
     *
     * @return the MultilegReportingType field
     */
    public MultilegReportingTypeField multilegReportingType() {
        return multilegReportingType;
    }

    /**
     * Indicates whether an execution is a spread or a simple instrument execution that is part of a spread trade
     *
     * @return the SecondaryExecId field
     */
    public SecondaryExecIdField secondaryExecId() {
        return secondaryExecId;
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
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!lastShares.parse(data, cursor)) {
            return false;
        }
        cursor += LastSharesField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!baseLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
        if (!subLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SubLiquidityIndicatorField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!feeCode.parse(data, cursor)) {
            return false;
        }
        cursor += FeeCodeField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!clearingSize.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingSizeField.BYTE_LENGTH;
        if (!pendingStatus.parse(data, cursor)) {
            return false;
        }
        cursor += PendingStatusField.BYTE_LENGTH;
        if (!multilegReportingType.parse(data, cursor)) {
            return false;
        }
        cursor += MultilegReportingTypeField.BYTE_LENGTH;
        return secondaryExecId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = baseLiquidityIndicator.encode(data, cursor);
        cursor = subLiquidityIndicator.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = feeCode.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = clearingSize.encode(data, cursor);
        cursor = pendingStatus.encode(data, cursor);
        cursor = multilegReportingType.encode(data, cursor);
        cursor = secondaryExecId.encode(data, cursor);
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
            case "ClOrdId" -> Optional.of(clOrdId);
            case "ExecId" -> Optional.of(execId);
            case "LastShares" -> Optional.of(lastShares);
            case "LastPx" -> Optional.of(lastPx);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "SubLiquidityIndicator" -> Optional.of(subLiquidityIndicator);
            case "Side" -> Optional.of(side);
            case "Symbol" -> Optional.of(symbol);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "FeeCode" -> Optional.of(feeCode);
            case "TradeDate" -> Optional.of(tradeDate);
            case "ClearingSize" -> Optional.of(clearingSize);
            case "PendingStatus" -> Optional.of(pendingStatus);
            case "MultilegReportingType" -> Optional.of(multilegReportingType);
            case "SecondaryExecId" -> Optional.of(secondaryExecId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderExecution message)) {
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
        if (!(other instanceof OrderExecution message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
