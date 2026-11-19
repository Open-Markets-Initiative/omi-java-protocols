package omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.AccountField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.BaseLiquidityIndicatorField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.CapacityField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.CashMarginField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.ClOrdIdField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.CompanyIdField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.ExpireTimeField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.MarginTransactionTypeField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.NoTradeFeatField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.NoTradeKeyField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.OrdTypeField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.OrderClassificationField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.OrderIdField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.OrderQtyField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.PostingInstructionField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.PriceField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.RiskGroupIdField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.SideField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.SymbolField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.TimeInForceField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.TradingFirmField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.fields.TransactionTimeField;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.types.Field;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.types.Message;
import omi.cboe.cxjequities.binaryorderentry.boe3.v1_0_12.types.PrintOptions;

/**
 * Represents the OrderAcknowledgementJpEquitiesV message from the BinaryOrderEntry protocol.
 *
 * <p>Order Acknowledgement messages are sent in response to a New Order message</p>
 */
public final class OrderAcknowledgementJpEquitiesV implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 104;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Acknowledgement Jp Equities V";

    /**
     * The time the event occurred in the Matching Engine (not the time the message was sent)
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Used by a trading participant to provide a broker cross reference
     */
    private final AccountField account = new AccountField();

    /**
     * The four-character identifier of the trading firm
     */
    private final TradingFirmField tradingFirm = new TradingFirmField();

    /**
     * Unique Id chosen by the participant
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Order identifier supplied by Cboe Japan
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Order quantity. System limit is 999,999,999
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Order type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Price must be an applicable minimum trading increment
     */
    private final PriceField price = new PriceField();

    /**
     * The capacity for the order. Required on all orders
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Side of the order
     */
    private final SideField side = new SideField();

    /**
     * Instrument symbol (QUICK symbology)
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Time in force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Required for GTD order (TimeInForce = 6), ExpireTime specifies the date-time (in UTC) when the order expires
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Indicates the type of cash or margin order
     */
    private final CashMarginField cashMargin = new CashMarginField();

    /**
     * Used to group orders for use in order purges where multiple orders can be cancelled by specifying a list of RiskGroupIDs
     */
    private final RiskGroupIdField riskGroupId = new RiskGroupIdField();

    /**
     * Ignored if NoTradeKey is not set. Declares the handling of self-trading
     */
    private final NoTradeFeatField noTradeFeat = new NoTradeFeatField();

    /**
     * Interactions of orders from the same participant with the same NoTradeKey value will be managed by the newer order's NoTradeFeat instruction
     */
    private final NoTradeKeyField noTradeKey = new NoTradeKeyField();

    /**
     * Posting instruction
     */
    private final PostingInstructionField postingInstruction = new PostingInstructionField();

    /**
     * Specify the order classification
     */
    private final OrderClassificationField orderClassification = new OrderClassificationField();

    /**
     * Specifies if a margin order is a Negotiable or a Standardized
     */
    private final MarginTransactionTypeField marginTransactionType = new MarginTransactionTypeField();

    /**
     * Indicates whether the trade added or removed liquidity
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Up to 4 alphanumeric characters to identify the order entry firm. This field is not validated
     */
    private final CompanyIdField companyId = new CompanyIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, account, tradingFirm, clOrdId, orderId, orderQty, ordType, price, capacity, side, symbol, timeInForce, expireTime, cashMargin, riskGroupId, noTradeFeat, noTradeKey, postingInstruction, orderClassification, marginTransactionType, baseLiquidityIndicator, companyId);

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
     * Used by a trading participant to provide a broker cross reference
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * The four-character identifier of the trading firm
     *
     * @return the TradingFirm field
     */
    public TradingFirmField tradingFirm() {
        return tradingFirm;
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
     * Order identifier supplied by Cboe Japan
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Order quantity. System limit is 999,999,999
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Order type
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * Price must be an applicable minimum trading increment
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The capacity for the order. Required on all orders
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
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
     * Instrument symbol (QUICK symbology)
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Time in force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Required for GTD order (TimeInForce = 6), ExpireTime specifies the date-time (in UTC) when the order expires
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
    }

    /**
     * Indicates the type of cash or margin order
     *
     * @return the CashMargin field
     */
    public CashMarginField cashMargin() {
        return cashMargin;
    }

    /**
     * Used to group orders for use in order purges where multiple orders can be cancelled by specifying a list of RiskGroupIDs
     *
     * @return the RiskGroupId field
     */
    public RiskGroupIdField riskGroupId() {
        return riskGroupId;
    }

    /**
     * Ignored if NoTradeKey is not set. Declares the handling of self-trading
     *
     * @return the NoTradeFeat field
     */
    public NoTradeFeatField noTradeFeat() {
        return noTradeFeat;
    }

    /**
     * Interactions of orders from the same participant with the same NoTradeKey value will be managed by the newer order's NoTradeFeat instruction
     *
     * @return the NoTradeKey field
     */
    public NoTradeKeyField noTradeKey() {
        return noTradeKey;
    }

    /**
     * Posting instruction
     *
     * @return the PostingInstruction field
     */
    public PostingInstructionField postingInstruction() {
        return postingInstruction;
    }

    /**
     * Specify the order classification
     *
     * @return the OrderClassification field
     */
    public OrderClassificationField orderClassification() {
        return orderClassification;
    }

    /**
     * Specifies if a margin order is a Negotiable or a Standardized
     *
     * @return the MarginTransactionType field
     */
    public MarginTransactionTypeField marginTransactionType() {
        return marginTransactionType;
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
     * Up to 4 alphanumeric characters to identify the order entry firm. This field is not validated
     *
     * @return the CompanyId field
     */
    public CompanyIdField companyId() {
        return companyId;
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
        if (!tradingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += TradingFirmField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!expireTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireTimeField.BYTE_LENGTH;
        if (!cashMargin.parse(data, cursor)) {
            return false;
        }
        cursor += CashMarginField.BYTE_LENGTH;
        if (!riskGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += RiskGroupIdField.BYTE_LENGTH;
        if (!noTradeFeat.parse(data, cursor)) {
            return false;
        }
        cursor += NoTradeFeatField.BYTE_LENGTH;
        if (!noTradeKey.parse(data, cursor)) {
            return false;
        }
        cursor += NoTradeKeyField.BYTE_LENGTH;
        if (!postingInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += PostingInstructionField.BYTE_LENGTH;
        if (!orderClassification.parse(data, cursor)) {
            return false;
        }
        cursor += OrderClassificationField.BYTE_LENGTH;
        if (!marginTransactionType.parse(data, cursor)) {
            return false;
        }
        cursor += MarginTransactionTypeField.BYTE_LENGTH;
        if (!baseLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
        return companyId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = tradingFirm.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = expireTime.encode(data, cursor);
        cursor = cashMargin.encode(data, cursor);
        cursor = riskGroupId.encode(data, cursor);
        cursor = noTradeFeat.encode(data, cursor);
        cursor = noTradeKey.encode(data, cursor);
        cursor = postingInstruction.encode(data, cursor);
        cursor = orderClassification.encode(data, cursor);
        cursor = marginTransactionType.encode(data, cursor);
        cursor = baseLiquidityIndicator.encode(data, cursor);
        cursor = companyId.encode(data, cursor);
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
            case "TradingFirm" -> Optional.of(tradingFirm);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrderId" -> Optional.of(orderId);
            case "OrderQty" -> Optional.of(orderQty);
            case "OrdType" -> Optional.of(ordType);
            case "Price" -> Optional.of(price);
            case "Capacity" -> Optional.of(capacity);
            case "Side" -> Optional.of(side);
            case "Symbol" -> Optional.of(symbol);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "ExpireTime" -> Optional.of(expireTime);
            case "CashMargin" -> Optional.of(cashMargin);
            case "RiskGroupId" -> Optional.of(riskGroupId);
            case "NoTradeFeat" -> Optional.of(noTradeFeat);
            case "NoTradeKey" -> Optional.of(noTradeKey);
            case "PostingInstruction" -> Optional.of(postingInstruction);
            case "OrderClassification" -> Optional.of(orderClassification);
            case "MarginTransactionType" -> Optional.of(marginTransactionType);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "CompanyId" -> Optional.of(companyId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderAcknowledgementJpEquitiesV message)) {
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
        if (!(other instanceof OrderAcknowledgementJpEquitiesV message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
