package omi.cboe.neoequities.orderentry.boe3.v1_0_19.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.AccountField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.BaseLiquidityIndicatorField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ClOrdIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.CorrectedPriceField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.CorrectedSizeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ExecIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.ExecRefIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.FeeCodeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.FutSettlDateField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.LastPxField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.LastSharesField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SettlementTypeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SideField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.SymbolField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.TransactionTimeField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.fields.UmirUserIdField;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.types.Field;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.types.Message;
import omi.cboe.neoequities.orderentry.boe3.v1_0_19.types.PrintOptions;

/**
 * Represents the TradeCancelCorrectCaEquitiesV message from the OrderEntry protocol.
 *
 * <p>Trade Cancel or Correct notification that a trade has been busted or corrected</p>
 */
public final class TradeCancelCorrectCaEquitiesV implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 119;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Cancel Correct Ca Equities V";

    /**
     * Time of the transaction
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Reflected back on Execution Reports associated with this order
     */
    private final AccountField account = new AccountField();

    /**
     * Client order identifier
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Day-unique id of execution message
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Refers to the ExecID of the message being cancelled or corrected
     */
    private final ExecRefIdField execRefId = new ExecRefIdField();

    /**
     * Price of this fill
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Quantity of shares on this fill
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Side of the order
     */
    private final SideField side = new SideField();

    /**
     * Symbol (upper case)
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Trade added or removed liquidity indicator
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Corrected size of a trade
     */
    private final CorrectedSizeField correctedSize = new CorrectedSizeField();

    /**
     * Identifies the trader responsible for the order, also known as Trader ID
     */
    private final UmirUserIdField umirUserId = new UmirUserIdField();

    /**
     * Corrected price of a trade
     */
    private final CorrectedPriceField correctedPrice = new CorrectedPriceField();

    /**
     * Fee code of the transaction
     */
    private final FeeCodeField feeCode = new FeeCodeField();

    /**
     * Indicates the settlement period
     */
    private final SettlementTypeField settlementType = new SettlementTypeField();

    /**
     * Specific date of trade settlement
     */
    private final FutSettlDateField futSettlDate = new FutSettlDateField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, account, clOrdId, execId, execRefId, lastPx, lastShares, side, symbol, baseLiquidityIndicator, correctedSize, umirUserId, correctedPrice, feeCode, settlementType, futSettlDate);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Time of the transaction
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Reflected back on Execution Reports associated with this order
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Client order identifier
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Day-unique id of execution message
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * Refers to the ExecID of the message being cancelled or corrected
     *
     * @return the ExecRefId field
     */
    public ExecRefIdField execRefId() {
        return execRefId;
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
     * Quantity of shares on this fill
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
     * Symbol (upper case)
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Trade added or removed liquidity indicator
     *
     * @return the BaseLiquidityIndicator field
     */
    public BaseLiquidityIndicatorField baseLiquidityIndicator() {
        return baseLiquidityIndicator;
    }

    /**
     * Corrected size of a trade
     *
     * @return the CorrectedSize field
     */
    public CorrectedSizeField correctedSize() {
        return correctedSize;
    }

    /**
     * Identifies the trader responsible for the order, also known as Trader ID
     *
     * @return the UmirUserId field
     */
    public UmirUserIdField umirUserId() {
        return umirUserId;
    }

    /**
     * Corrected price of a trade
     *
     * @return the CorrectedPrice field
     */
    public CorrectedPriceField correctedPrice() {
        return correctedPrice;
    }

    /**
     * Fee code of the transaction
     *
     * @return the FeeCode field
     */
    public FeeCodeField feeCode() {
        return feeCode;
    }

    /**
     * Indicates the settlement period
     *
     * @return the SettlementType field
     */
    public SettlementTypeField settlementType() {
        return settlementType;
    }

    /**
     * Specific date of trade settlement
     *
     * @return the FutSettlDate field
     */
    public FutSettlDateField futSettlDate() {
        return futSettlDate;
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
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!execRefId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecRefIdField.BYTE_LENGTH;
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
        if (!baseLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
        if (!correctedSize.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedSizeField.BYTE_LENGTH;
        if (!umirUserId.parse(data, cursor)) {
            return false;
        }
        cursor += UmirUserIdField.BYTE_LENGTH;
        if (!correctedPrice.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedPriceField.BYTE_LENGTH;
        if (!feeCode.parse(data, cursor)) {
            return false;
        }
        cursor += FeeCodeField.BYTE_LENGTH;
        if (!settlementType.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementTypeField.BYTE_LENGTH;
        return futSettlDate.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = execRefId.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = baseLiquidityIndicator.encode(data, cursor);
        cursor = correctedSize.encode(data, cursor);
        cursor = umirUserId.encode(data, cursor);
        cursor = correctedPrice.encode(data, cursor);
        cursor = feeCode.encode(data, cursor);
        cursor = settlementType.encode(data, cursor);
        cursor = futSettlDate.encode(data, cursor);
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
            case "Account" -> Optional.of(account);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "ExecId" -> Optional.of(execId);
            case "ExecRefId" -> Optional.of(execRefId);
            case "LastPx" -> Optional.of(lastPx);
            case "LastShares" -> Optional.of(lastShares);
            case "Side" -> Optional.of(side);
            case "Symbol" -> Optional.of(symbol);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "CorrectedSize" -> Optional.of(correctedSize);
            case "UmirUserId" -> Optional.of(umirUserId);
            case "CorrectedPrice" -> Optional.of(correctedPrice);
            case "FeeCode" -> Optional.of(feeCode);
            case "SettlementType" -> Optional.of(settlementType);
            case "FutSettlDate" -> Optional.of(futSettlDate);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCancelCorrectCaEquitiesV message)) {
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
        if (!(other instanceof TradeCancelCorrectCaEquitiesV message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
