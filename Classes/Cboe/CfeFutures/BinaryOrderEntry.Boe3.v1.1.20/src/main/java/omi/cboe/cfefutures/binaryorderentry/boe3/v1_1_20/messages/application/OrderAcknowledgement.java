package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.AccountField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.BaseLiquidityIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.CapacityField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ClOrdIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ClearingAccountField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ClearingFirmField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.CmtaNumberField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.CtiCodeField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.CumQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.CustOrderHandlingInstField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ExpireTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.FrequentTraderIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.LeavesQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ManualOrderIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.MaturityDateField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.MinQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.OeoIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.OpenCloseField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.OrdTypeField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.OrderIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.OrderQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.PriceField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.RequestReceivedTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.SideField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.StopPxField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.SubLiquidityIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.SymbolField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.TimeInForceField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.TransactionTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.structs.PreventMatch;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.PrintOptions;

/**
 * Represents the OrderAcknowledgement message from the BinaryOrderEntry protocol.
 *
 * <p>Order Acknowledgement messages are sent in response to a new order message</p>
 */
public final class OrderAcknowledgement implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 161;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Acknowledgement";

    /**
     * The time the event occurred in the CFE Matching Engine (not the time the message was sent)
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Unique Id chosen by the client
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Order identifier supplied by CFE
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Limit price
     */
    private final PriceField price = new PriceField();

    /**
     * Order type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Time In Force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Minimum fill quantity for IOC orders
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * Simple Instruments can be specified by providing the mapped symbol format in the Symbol field or by providing the product name (e
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Unique account identifier associated with an order
     */
    private final AccountField account = new AccountField();

    /**
     * EFID that will clear the trade
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Supplemental identifier
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Order quantity
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * used to specify the expiration date of the symbol within the specified product class
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Indicates status of client position in a trade resulting from the order
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Quantity still open for further execution
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Indicates whether the trade added or removed liquidity
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Required for TimeInForce = 6 orders, specifies the date-time (in UTC) that the order expires
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Additional information about the liquidity of an order
     */
    private final SubLiquidityIndicatorField subLiquidityIndicator = new SubLiquidityIndicatorField();

    /**
     * Stop price
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * CMTA Number of the firm that will clear the trade
     */
    private final CmtaNumberField cmtaNumber = new CmtaNumberField();

    /**
     * CTI code
     */
    private final CtiCodeField ctiCode = new CtiCodeField();

    /**
     * Y=Manual order entry N =Automated order entry
     */
    private final ManualOrderIndicatorField manualOrderIndicator = new ManualOrderIndicatorField();

    /**
     * Identifies the Order Entry Operator responsible for this message
     */
    private final OeoIdField oeoId = new OeoIdField();

    /**
     * Total quantity filled
     */
    private final CumQtyField cumQty = new CumQtyField();

    /**
     * Supplemental customer identifier used for billing related programs
     */
    private final FrequentTraderIdField frequentTraderId = new FrequentTraderIdField();

    /**
     * Execution source code provided during order entry to describe broker service
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

    /**
     * The earliest timestamp, populated with nanosecond precision, recorded by CFE of the corresponding inbound message being acknowledged
     */
    private final RequestReceivedTimeField requestReceivedTime = new RequestReceivedTimeField();

    /**
     * Prevent Match
     */
    private final PreventMatch preventMatch = new PreventMatch();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(transactionTime), List.<Field>of(clOrdId), List.<Field>of(orderId), List.<Field>of(side), List.<Field>of(price), List.<Field>of(ordType), List.<Field>of(timeInForce), List.<Field>of(minQty), List.<Field>of(symbol), List.<Field>of(capacity), List.<Field>of(account), List.<Field>of(clearingFirm), List.<Field>of(clearingAccount), List.<Field>of(orderQty), preventMatch.fields(), List.<Field>of(maturityDate), List.<Field>of(openClose), List.<Field>of(leavesQty), List.<Field>of(baseLiquidityIndicator), List.<Field>of(expireTime), List.<Field>of(subLiquidityIndicator), List.<Field>of(stopPx), List.<Field>of(cmtaNumber), List.<Field>of(ctiCode), List.<Field>of(manualOrderIndicator), List.<Field>of(oeoId), List.<Field>of(cumQty), List.<Field>of(frequentTraderId), List.<Field>of(custOrderHandlingInst), List.<Field>of(requestReceivedTime)).flatMap(List::stream).toList();

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
     * Order identifier supplied by CFE
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
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
     * Limit price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
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
     * Time In Force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Minimum fill quantity for IOC orders
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
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
     * Capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Unique account identifier associated with an order
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
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
     * Supplemental identifier
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * Order quantity
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
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
     * Indicates status of client position in a trade resulting from the order
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
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
     * Required for TimeInForce = 6 orders, specifies the date-time (in UTC) that the order expires
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
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
     * Stop price
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * CMTA Number of the firm that will clear the trade
     *
     * @return the CmtaNumber field
     */
    public CmtaNumberField cmtaNumber() {
        return cmtaNumber;
    }

    /**
     * CTI code
     *
     * @return the CtiCode field
     */
    public CtiCodeField ctiCode() {
        return ctiCode;
    }

    /**
     * Y=Manual order entry N =Automated order entry
     *
     * @return the ManualOrderIndicator field
     */
    public ManualOrderIndicatorField manualOrderIndicator() {
        return manualOrderIndicator;
    }

    /**
     * Identifies the Order Entry Operator responsible for this message
     *
     * @return the OeoId field
     */
    public OeoIdField oeoId() {
        return oeoId;
    }

    /**
     * Total quantity filled
     *
     * @return the CumQty field
     */
    public CumQtyField cumQty() {
        return cumQty;
    }

    /**
     * Supplemental customer identifier used for billing related programs
     *
     * @return the FrequentTraderId field
     */
    public FrequentTraderIdField frequentTraderId() {
        return frequentTraderId;
    }

    /**
     * Execution source code provided during order entry to describe broker service
     *
     * @return the CustOrderHandlingInst field
     */
    public CustOrderHandlingInstField custOrderHandlingInst() {
        return custOrderHandlingInst;
    }

    /**
     * The earliest timestamp, populated with nanosecond precision, recorded by CFE of the corresponding inbound message being acknowledged
     *
     * @return the RequestReceivedTime field
     */
    public RequestReceivedTimeField requestReceivedTime() {
        return requestReceivedTime;
    }

    /**
     * Prevent Match
     *
     * @return the PreventMatch record
     */
    public PreventMatch preventMatch() {
        return preventMatch;
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
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!minQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinQtyField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!preventMatch.parseFrom(data, cursor, end - 70)) {
            return false;
        }
        cursor += preventMatch.byteLength();
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!baseLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
        if (!expireTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireTimeField.BYTE_LENGTH;
        if (!subLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SubLiquidityIndicatorField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
        if (!cmtaNumber.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaNumberField.BYTE_LENGTH;
        if (!ctiCode.parse(data, cursor)) {
            return false;
        }
        cursor += CtiCodeField.BYTE_LENGTH;
        if (!manualOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        if (!oeoId.parse(data, cursor)) {
            return false;
        }
        cursor += OeoIdField.BYTE_LENGTH;
        if (!cumQty.parse(data, cursor)) {
            return false;
        }
        cursor += CumQtyField.BYTE_LENGTH;
        if (!frequentTraderId.parse(data, cursor)) {
            return false;
        }
        cursor += FrequentTraderIdField.BYTE_LENGTH;
        if (!custOrderHandlingInst.parse(data, cursor)) {
            return false;
        }
        cursor += CustOrderHandlingInstField.BYTE_LENGTH;
        return requestReceivedTime.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = preventMatch.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = baseLiquidityIndicator.encode(data, cursor);
        cursor = expireTime.encode(data, cursor);
        cursor = subLiquidityIndicator.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = cmtaNumber.encode(data, cursor);
        cursor = ctiCode.encode(data, cursor);
        cursor = manualOrderIndicator.encode(data, cursor);
        cursor = oeoId.encode(data, cursor);
        cursor = cumQty.encode(data, cursor);
        cursor = frequentTraderId.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = requestReceivedTime.encode(data, cursor);
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
        preventMatch.clear();
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
            case "OrderId" -> Optional.of(orderId);
            case "Side" -> Optional.of(side);
            case "Price" -> Optional.of(price);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "Symbol" -> Optional.of(symbol);
            case "Capacity" -> Optional.of(capacity);
            case "Account" -> Optional.of(account);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "OrderQty" -> Optional.of(orderQty);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "OpenClose" -> Optional.of(openClose);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "ExpireTime" -> Optional.of(expireTime);
            case "SubLiquidityIndicator" -> Optional.of(subLiquidityIndicator);
            case "StopPx" -> Optional.of(stopPx);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "CtiCode" -> Optional.of(ctiCode);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "OeoId" -> Optional.of(oeoId);
            case "CumQty" -> Optional.of(cumQty);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "RequestReceivedTime" -> Optional.of(requestReceivedTime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderAcknowledgement message)) {
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
        if (!(other instanceof OrderAcknowledgement message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
