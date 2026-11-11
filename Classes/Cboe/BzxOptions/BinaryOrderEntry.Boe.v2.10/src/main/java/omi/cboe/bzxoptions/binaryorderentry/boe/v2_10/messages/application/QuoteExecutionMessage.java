package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.BaseLiquidityIndicatorField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ClearingFirmField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ContraCapacityField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ContraTraderField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.ExecIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.FeeCodeField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.LastPxField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.LastSharesField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.LeavesQtyField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.MarketingFeeCodeField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.OrderIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.QuoteUpdateIdField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.SideField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.SubLiquidityIndicatorField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.SymbolShortField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.fields.TransactionTimeField;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.Field;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.Message;
import omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.types.PrintOptions;

/**
 * Represents the QuoteExecutionMessage message from the BinaryOrderEntry protocol.
 *
 * <p>A Quote Execution message is used to indicate an execution has occurred on a resting quote.</p>
 */
public final class QuoteExecutionMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 78;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Execution Message";

    /**
     * The time the event occurred in the Cboe Matching Engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     */
    private final QuoteUpdateIdField quoteUpdateId = new QuoteUpdateIdField();

    /**
     * Order identifier supplied by Cboe. This Identifier corresponds to the identifiers used in Cboe market data products
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Execution ID. Unique across all matching units on a given day. Corresponds to ExecID (17) in Cboe FIX.
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Cboe native identifier
     */
    private final SymbolShortField symbolShort = new SymbolShortField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Last Shares
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Leaves Qty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Displays the EFID (ClearingFirm) of the contra side firm.
     */
    private final ContraTraderField contraTrader = new ContraTraderField();

    /**
     * Contra Capacity
     */
    private final ContraCapacityField contraCapacity = new ContraCapacityField();

    /**
     * Corresponds to Side (54) in Cboe FIX.
     */
    private final SideField side = new SideField();

    /**
     * Base Liquidity Indicator
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Sub Liquidity Indicator
     */
    private final SubLiquidityIndicatorField subLiquidityIndicator = new SubLiquidityIndicatorField();

    /**
     * Corresponds to FeeCode (9882) in Cboe FIX.
     */
    private final FeeCodeField feeCode = new FeeCodeField();

    /**
     * Corresponds to MarketingFeeCode (5937) in Cboe FIX.
     */
    private final MarketingFeeCodeField marketingFeeCode = new MarketingFeeCodeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, quoteUpdateId, orderId, execId, symbolShort, clearingFirm, lastShares, lastPx, leavesQty, contraTrader, contraCapacity, side, baseLiquidityIndicator, subLiquidityIndicator, feeCode, marketingFeeCode);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the Cboe Matching Engine (not the time the message was sent).
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     *
     * @return the QuoteUpdateId field
     */
    public QuoteUpdateIdField quoteUpdateId() {
        return quoteUpdateId;
    }

    /**
     * Order identifier supplied by Cboe. This Identifier corresponds to the identifiers used in Cboe market data products
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Execution ID. Unique across all matching units on a given day. Corresponds to ExecID (17) in Cboe FIX.
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * Cboe native identifier
     *
     * @return the SymbolShort field
     */
    public SymbolShortField symbolShort() {
        return symbolShort;
    }

    /**
     * Clearing Firm
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Last Shares
     *
     * @return the LastShares field
     */
    public LastSharesField lastShares() {
        return lastShares;
    }

    /**
     * Last Px
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Leaves Qty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Displays the EFID (ClearingFirm) of the contra side firm.
     *
     * @return the ContraTrader field
     */
    public ContraTraderField contraTrader() {
        return contraTrader;
    }

    /**
     * Contra Capacity
     *
     * @return the ContraCapacity field
     */
    public ContraCapacityField contraCapacity() {
        return contraCapacity;
    }

    /**
     * Corresponds to Side (54) in Cboe FIX.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Base Liquidity Indicator
     *
     * @return the BaseLiquidityIndicator field
     */
    public BaseLiquidityIndicatorField baseLiquidityIndicator() {
        return baseLiquidityIndicator;
    }

    /**
     * Sub Liquidity Indicator
     *
     * @return the SubLiquidityIndicator field
     */
    public SubLiquidityIndicatorField subLiquidityIndicator() {
        return subLiquidityIndicator;
    }

    /**
     * Corresponds to FeeCode (9882) in Cboe FIX.
     *
     * @return the FeeCode field
     */
    public FeeCodeField feeCode() {
        return feeCode;
    }

    /**
     * Corresponds to MarketingFeeCode (5937) in Cboe FIX.
     *
     * @return the MarketingFeeCode field
     */
    public MarketingFeeCodeField marketingFeeCode() {
        return marketingFeeCode;
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
        if (!quoteUpdateId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteUpdateIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!symbolShort.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolShortField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
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
        if (!contraTrader.parse(data, cursor)) {
            return false;
        }
        cursor += ContraTraderField.BYTE_LENGTH;
        if (!contraCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += ContraCapacityField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!baseLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
        if (!subLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SubLiquidityIndicatorField.BYTE_LENGTH;
        if (!feeCode.parse(data, cursor)) {
            return false;
        }
        cursor += FeeCodeField.BYTE_LENGTH;
        return marketingFeeCode.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = quoteUpdateId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = symbolShort.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = contraTrader.encode(data, cursor);
        cursor = contraCapacity.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = baseLiquidityIndicator.encode(data, cursor);
        cursor = subLiquidityIndicator.encode(data, cursor);
        cursor = feeCode.encode(data, cursor);
        cursor = marketingFeeCode.encode(data, cursor);
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
            case "QuoteUpdateId" -> Optional.of(quoteUpdateId);
            case "OrderId" -> Optional.of(orderId);
            case "ExecId" -> Optional.of(execId);
            case "SymbolShort" -> Optional.of(symbolShort);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "LastShares" -> Optional.of(lastShares);
            case "LastPx" -> Optional.of(lastPx);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "ContraTrader" -> Optional.of(contraTrader);
            case "ContraCapacity" -> Optional.of(contraCapacity);
            case "Side" -> Optional.of(side);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "SubLiquidityIndicator" -> Optional.of(subLiquidityIndicator);
            case "FeeCode" -> Optional.of(feeCode);
            case "MarketingFeeCode" -> Optional.of(marketingFeeCode);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteExecutionMessage message)) {
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
        if (!(other instanceof QuoteExecutionMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
