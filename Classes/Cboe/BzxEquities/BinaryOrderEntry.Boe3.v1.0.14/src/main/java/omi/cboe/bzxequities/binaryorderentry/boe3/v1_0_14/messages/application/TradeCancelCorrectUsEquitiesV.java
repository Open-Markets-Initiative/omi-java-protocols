package omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.BaseLiquidityIndicatorField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.CapacityField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.ClOrdIdField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.ClearingAccountField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.ClearingFirmField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.CorrectedPriceField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.ExecRefIdField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.InFlightField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.LastPxField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.LastSharesField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.OrderIdField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.OrigTimeField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.SideField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.SubLiquidityIndicatorField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.SymbolField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.fields.TransactionTimeField;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.types.Message;
import omi.cboe.bzxequities.binaryorderentry.boe3.v1_0_14.types.PrintOptions;

/**
 * Represents the TradeCancelCorrectUsEquitiesV message from the BinaryOrderEntry protocol.
 *
 * <p>Used to relay a trade which has been cancelled (busted) or corrected (price change only)</p>
 */
public final class TradeCancelCorrectUsEquitiesV implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 94;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Cancel Correct Us Equities V";

    /**
     * Total number of messages received by the order handler which have not yet been acknowledged by the matching engine
     */
    private final InFlightField inFlight = new InFlightField();

    /**
     * Transaction Time
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * ID chosen by the client
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Order identifier supplied by Cboe
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Refers to the ExecID of the fill being cancelled or corrected
     */
    private final ExecRefIdField execRefId = new ExecRefIdField();

    /**
     * Side of the order
     */
    private final SideField side = new SideField();

    /**
     * Indicates whether the trade added or removed liquidity
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Additional information about an execution
     */
    private final SubLiquidityIndicatorField subLiquidityIndicator = new SubLiquidityIndicatorField();

    /**
     * MPID that will clear the trade
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Supplemental identifier
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Executed share quantity
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Price of this fill
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * For trade corrections, this is the new trade price
     */
    private final CorrectedPriceField correctedPrice = new CorrectedPriceField();

    /**
     * The date and time of the original trade, in GMT
     */
    private final OrigTimeField origTime = new OrigTimeField();

    /**
     * Entire Cboe format
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Order capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(inFlight, transactionTime, clOrdId, orderId, execRefId, side, baseLiquidityIndicator, subLiquidityIndicator, clearingFirm, clearingAccount, lastShares, lastPx, correctedPrice, origTime, symbol, capacity);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Total number of messages received by the order handler which have not yet been acknowledged by the matching engine
     *
     * @return the InFlight field
     */
    public InFlightField inFlight() {
        return inFlight;
    }

    /**
     * Transaction Time
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * ID chosen by the client
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Order identifier supplied by Cboe
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Refers to the ExecID of the fill being cancelled or corrected
     *
     * @return the ExecRefId field
     */
    public ExecRefIdField execRefId() {
        return execRefId;
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
     * Indicates whether the trade added or removed liquidity
     *
     * @return the BaseLiquidityIndicator field
     */
    public BaseLiquidityIndicatorField baseLiquidityIndicator() {
        return baseLiquidityIndicator;
    }

    /**
     * Additional information about an execution
     *
     * @return the SubLiquidityIndicator field
     */
    public SubLiquidityIndicatorField subLiquidityIndicator() {
        return subLiquidityIndicator;
    }

    /**
     * MPID that will clear the trade
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Supplemental identifier
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * Executed share quantity
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
     * For trade corrections, this is the new trade price
     *
     * @return the CorrectedPrice field
     */
    public CorrectedPriceField correctedPrice() {
        return correctedPrice;
    }

    /**
     * The date and time of the original trade, in GMT
     *
     * @return the OrigTime field
     */
    public OrigTimeField origTime() {
        return origTime;
    }

    /**
     * Entire Cboe format
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Order capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
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
        if (!inFlight.parse(data, cursor)) {
            return false;
        }
        cursor += InFlightField.BYTE_LENGTH;
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!execRefId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecRefIdField.BYTE_LENGTH;
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
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!lastShares.parse(data, cursor)) {
            return false;
        }
        cursor += LastSharesField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!correctedPrice.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedPriceField.BYTE_LENGTH;
        if (!origTime.parse(data, cursor)) {
            return false;
        }
        cursor += OrigTimeField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        return capacity.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = inFlight.encode(data, cursor);
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = execRefId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = baseLiquidityIndicator.encode(data, cursor);
        cursor = subLiquidityIndicator.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = correctedPrice.encode(data, cursor);
        cursor = origTime.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
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
            case "InFlight" -> Optional.of(inFlight);
            case "TransactionTime" -> Optional.of(transactionTime);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrderId" -> Optional.of(orderId);
            case "ExecRefId" -> Optional.of(execRefId);
            case "Side" -> Optional.of(side);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "SubLiquidityIndicator" -> Optional.of(subLiquidityIndicator);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "LastShares" -> Optional.of(lastShares);
            case "LastPx" -> Optional.of(lastPx);
            case "CorrectedPrice" -> Optional.of(correctedPrice);
            case "OrigTime" -> Optional.of(origTime);
            case "Symbol" -> Optional.of(symbol);
            case "Capacity" -> Optional.of(capacity);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCancelCorrectUsEquitiesV message)) {
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
        if (!(other instanceof TradeCancelCorrectUsEquitiesV message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
