package omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.AggressorIndicatorField2;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.AlgoFlagField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.BuyerBolsaCodeField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.CcpCodeField2;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.ClientDataIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.DesignationField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.DisplayQty2Field;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.DisplayQtyField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.EntryDate2Field;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.EntryDateField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.GrossTradeAmtField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.LastPxField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.LastQtyField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.MarketMechanismField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.MarketSegmentIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.OrdStatusField2;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.OrderIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.OrderQtyField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.Price2Field;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.PriceField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.Priority2Field;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.PriorityField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.RequestIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.RetailFlagField2;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.SecondaryExecIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.SecondaryOrderId2Field;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.SecondaryOrderIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.SecurityCodeField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.SequenceNumberField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.SettlDateField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.TradeTypeField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.TradingSessionIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.TransactionCategoryField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.TransactionDateAndTimeField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.fields.TrdMatchIdField;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.types.Field;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.types.Message;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.types.PrintOptions;

/**
 * Represents the ExecutionPrivateInformation1LegSellMarketOrderMessage message from the MarketAndOrder protocol.
 *
 * <p>Sent by the server to inform about a trade where the user is involved as Seller. In the order where the member is not involved, only the market information is sent, so that the application can update the books</p>
 */
public final class ExecutionPrivateInformation1LegSellMarketOrderMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 125;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Private Information 1 Leg Sell Market Order Message";

    /**
     * Message sequence number
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Instrument (or Book) code
     */
    private final SecurityCodeField securityCode = new SecurityCodeField();

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     */
    private final TransactionDateAndTimeField transactionDateAndTime = new TransactionDateAndTimeField();

    /**
     * Segment MIC Code
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Trading mode
     */
    private final TradingSessionIdField tradingSessionId = new TradingSessionIdField();

    /**
     * System Trade Number
     */
    private final TrdMatchIdField trdMatchId = new TrdMatchIdField();

    /**
     * Trade type
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * Trade price
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Current trade volume
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Premium / Trade amount
     */
    private final GrossTradeAmtField grossTradeAmt = new GrossTradeAmtField();

    /**
     * Trade situation
     */
    private final DesignationField designation = new DesignationField();

    /**
     * Market Mechanism
     */
    private final MarketMechanismField marketMechanism = new MarketMechanismField();

    /**
     * Algorithmic flag indicator
     */
    private final AlgoFlagField algoFlag = new AlgoFlagField();

    /**
     * Stock Exchange code of the buyer
     */
    private final BuyerBolsaCodeField buyerBolsaCode = new BuyerBolsaCodeField();

    /**
     * Settlement date
     */
    private final SettlDateField settlDate = new SettlDateField();

    /**
     * Transaction Category
     */
    private final TransactionCategoryField transactionCategory = new TransactionCategoryField();

    /**
     * System Order Number
     */
    private final SecondaryOrderIdField secondaryOrderId = new SecondaryOrderIdField();

    /**
     * System order entry date (when System Order Number was assigned)
     */
    private final EntryDateField entryDate = new EntryDateField();

    /**
     * Priority
     */
    private final PriorityField priority = new PriorityField();

    /**
     * Limit price
     */
    private final PriceField price = new PriceField();

    /**
     * Visible pending volume
     */
    private final DisplayQtyField displayQty = new DisplayQtyField();

    /**
     * Order/Quote only for retailers
     */
    private final RetailFlagField2 retailFlag = new RetailFlagField2();

    /**
     * System Order Number
     */
    private final SecondaryOrderId2Field secondaryOrderId2 = new SecondaryOrderId2Field();

    /**
     * System order entry date (when System Order Number was assigned)
     */
    private final EntryDate2Field entryDate2 = new EntryDate2Field();

    /**
     * Priority
     */
    private final Priority2Field priority2 = new Priority2Field();

    /**
     * Limit price
     */
    private final Price2Field price2 = new Price2Field();

    /**
     * Visible pending volume
     */
    private final DisplayQty2Field displayQty2 = new DisplayQty2Field();

    /**
     * Application Order ID (unique at security level)
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * History number
     */
    private final SecondaryExecIdField secondaryExecId = new SecondaryExecIdField();

    /**
     * Total order volume
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Order Status
     */
    private final OrdStatusField2 ordStatus = new OrdStatusField2();

    /**
     * CCP Code
     */
    private final CcpCodeField2 ccpCode = new CcpCodeField2();

    /**
     * Passive or aggressive indicator
     */
    private final AggressorIndicatorField2 aggressorIndicator = new AggressorIndicatorField2();

    /**
     * Request ID (for application feedback)
     */
    private final RequestIdField requestId = new RequestIdField();

    /**
     * Client Data ID (to be used as a shortcode in orders and quotes). Valid values: 1-65535 (in response messages, 0 means no ClientDataID used)
     */
    private final ClientDataIdField clientDataId = new ClientDataIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(sequenceNumber, securityCode, transactionDateAndTime, marketSegmentId, tradingSessionId, trdMatchId, tradeType, lastPx, lastQty, grossTradeAmt, designation, marketMechanism, algoFlag, buyerBolsaCode, settlDate, transactionCategory, secondaryOrderId, entryDate, priority, price, displayQty, retailFlag, secondaryOrderId2, entryDate2, priority2, price2, displayQty2, orderId, secondaryExecId, orderQty, ordStatus, ccpCode, aggressorIndicator, requestId, clientDataId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message sequence number
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Instrument (or Book) code
     *
     * @return the SecurityCode field
     */
    public SecurityCodeField securityCode() {
        return securityCode;
    }

    /**
     * Transaction Date and Time in nanoseconds since 1-jan-1970 UTC
     *
     * @return the TransactionDateAndTime field
     */
    public TransactionDateAndTimeField transactionDateAndTime() {
        return transactionDateAndTime;
    }

    /**
     * Segment MIC Code
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * Trading mode
     *
     * @return the TradingSessionId field
     */
    public TradingSessionIdField tradingSessionId() {
        return tradingSessionId;
    }

    /**
     * System Trade Number
     *
     * @return the TrdMatchId field
     */
    public TrdMatchIdField trdMatchId() {
        return trdMatchId;
    }

    /**
     * Trade type
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    /**
     * Trade price
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * Current trade volume
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
    }

    /**
     * Premium / Trade amount
     *
     * @return the GrossTradeAmt field
     */
    public GrossTradeAmtField grossTradeAmt() {
        return grossTradeAmt;
    }

    /**
     * Trade situation
     *
     * @return the Designation field
     */
    public DesignationField designation() {
        return designation;
    }

    /**
     * Market Mechanism
     *
     * @return the MarketMechanism field
     */
    public MarketMechanismField marketMechanism() {
        return marketMechanism;
    }

    /**
     * Algorithmic flag indicator
     *
     * @return the AlgoFlag field
     */
    public AlgoFlagField algoFlag() {
        return algoFlag;
    }

    /**
     * Stock Exchange code of the buyer
     *
     * @return the BuyerBolsaCode field
     */
    public BuyerBolsaCodeField buyerBolsaCode() {
        return buyerBolsaCode;
    }

    /**
     * Settlement date
     *
     * @return the SettlDate field
     */
    public SettlDateField settlDate() {
        return settlDate;
    }

    /**
     * Transaction Category
     *
     * @return the TransactionCategory field
     */
    public TransactionCategoryField transactionCategory() {
        return transactionCategory;
    }

    /**
     * System Order Number
     *
     * @return the SecondaryOrderId field
     */
    public SecondaryOrderIdField secondaryOrderId() {
        return secondaryOrderId;
    }

    /**
     * System order entry date (when System Order Number was assigned)
     *
     * @return the EntryDate field
     */
    public EntryDateField entryDate() {
        return entryDate;
    }

    /**
     * Priority
     *
     * @return the Priority field
     */
    public PriorityField priority() {
        return priority;
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
     * Visible pending volume
     *
     * @return the DisplayQty field
     */
    public DisplayQtyField displayQty() {
        return displayQty;
    }

    /**
     * Order/Quote only for retailers
     *
     * @return the RetailFlag field
     */
    public RetailFlagField2 retailFlag() {
        return retailFlag;
    }

    /**
     * System Order Number
     *
     * @return the SecondaryOrderId2 field
     */
    public SecondaryOrderId2Field secondaryOrderId2() {
        return secondaryOrderId2;
    }

    /**
     * System order entry date (when System Order Number was assigned)
     *
     * @return the EntryDate2 field
     */
    public EntryDate2Field entryDate2() {
        return entryDate2;
    }

    /**
     * Priority
     *
     * @return the Priority2 field
     */
    public Priority2Field priority2() {
        return priority2;
    }

    /**
     * Limit price
     *
     * @return the Price2 field
     */
    public Price2Field price2() {
        return price2;
    }

    /**
     * Visible pending volume
     *
     * @return the DisplayQty2 field
     */
    public DisplayQty2Field displayQty2() {
        return displayQty2;
    }

    /**
     * Application Order ID (unique at security level)
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * History number
     *
     * @return the SecondaryExecId field
     */
    public SecondaryExecIdField secondaryExecId() {
        return secondaryExecId;
    }

    /**
     * Total order volume
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Order Status
     *
     * @return the OrdStatus field
     */
    public OrdStatusField2 ordStatus() {
        return ordStatus;
    }

    /**
     * CCP Code
     *
     * @return the CcpCode field
     */
    public CcpCodeField2 ccpCode() {
        return ccpCode;
    }

    /**
     * Passive or aggressive indicator
     *
     * @return the AggressorIndicator field
     */
    public AggressorIndicatorField2 aggressorIndicator() {
        return aggressorIndicator;
    }

    /**
     * Request ID (for application feedback)
     *
     * @return the RequestId field
     */
    public RequestIdField requestId() {
        return requestId;
    }

    /**
     * Client Data ID (to be used as a shortcode in orders and quotes). Valid values: 1-65535 (in response messages, 0 means no ClientDataID used)
     *
     * @return the ClientDataId field
     */
    public ClientDataIdField clientDataId() {
        return clientDataId;
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
        return Optional.ofNullable(transactionDateAndTime.value());
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
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!securityCode.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityCodeField.BYTE_LENGTH;
        if (!transactionDateAndTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionDateAndTimeField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!tradingSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += TradingSessionIdField.BYTE_LENGTH;
        if (!trdMatchId.parse(data, cursor)) {
            return false;
        }
        cursor += TrdMatchIdField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!grossTradeAmt.parse(data, cursor)) {
            return false;
        }
        cursor += GrossTradeAmtField.BYTE_LENGTH;
        if (!designation.parse(data, cursor)) {
            return false;
        }
        cursor += DesignationField.BYTE_LENGTH;
        if (!marketMechanism.parse(data, cursor)) {
            return false;
        }
        cursor += MarketMechanismField.BYTE_LENGTH;
        if (!algoFlag.parse(data, cursor)) {
            return false;
        }
        cursor += AlgoFlagField.BYTE_LENGTH;
        if (!buyerBolsaCode.parse(data, cursor)) {
            return false;
        }
        cursor += BuyerBolsaCodeField.BYTE_LENGTH;
        if (!settlDate.parse(data, cursor)) {
            return false;
        }
        cursor += SettlDateField.BYTE_LENGTH;
        if (!transactionCategory.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionCategoryField.BYTE_LENGTH;
        if (!secondaryOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryOrderIdField.BYTE_LENGTH;
        if (!entryDate.parse(data, cursor)) {
            return false;
        }
        cursor += EntryDateField.BYTE_LENGTH;
        if (!priority.parse(data, cursor)) {
            return false;
        }
        cursor += PriorityField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!displayQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayQtyField.BYTE_LENGTH;
        if (!retailFlag.parse(data, cursor)) {
            return false;
        }
        cursor += RetailFlagField2.BYTE_LENGTH;
        if (!secondaryOrderId2.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryOrderId2Field.BYTE_LENGTH;
        if (!entryDate2.parse(data, cursor)) {
            return false;
        }
        cursor += EntryDate2Field.BYTE_LENGTH;
        if (!priority2.parse(data, cursor)) {
            return false;
        }
        cursor += Priority2Field.BYTE_LENGTH;
        if (!price2.parse(data, cursor)) {
            return false;
        }
        cursor += Price2Field.BYTE_LENGTH;
        if (!displayQty2.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayQty2Field.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!secondaryExecId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryExecIdField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!ordStatus.parse(data, cursor)) {
            return false;
        }
        cursor += OrdStatusField2.BYTE_LENGTH;
        if (!ccpCode.parse(data, cursor)) {
            return false;
        }
        cursor += CcpCodeField2.BYTE_LENGTH;
        if (!aggressorIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += AggressorIndicatorField2.BYTE_LENGTH;
        if (!requestId.parse(data, cursor)) {
            return false;
        }
        cursor += RequestIdField.BYTE_LENGTH;
        return clientDataId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = sequenceNumber.encode(data, cursor);
        cursor = securityCode.encode(data, cursor);
        cursor = transactionDateAndTime.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = tradingSessionId.encode(data, cursor);
        cursor = trdMatchId.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = grossTradeAmt.encode(data, cursor);
        cursor = designation.encode(data, cursor);
        cursor = marketMechanism.encode(data, cursor);
        cursor = algoFlag.encode(data, cursor);
        cursor = buyerBolsaCode.encode(data, cursor);
        cursor = settlDate.encode(data, cursor);
        cursor = transactionCategory.encode(data, cursor);
        cursor = secondaryOrderId.encode(data, cursor);
        cursor = entryDate.encode(data, cursor);
        cursor = priority.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = displayQty.encode(data, cursor);
        cursor = retailFlag.encode(data, cursor);
        cursor = secondaryOrderId2.encode(data, cursor);
        cursor = entryDate2.encode(data, cursor);
        cursor = priority2.encode(data, cursor);
        cursor = price2.encode(data, cursor);
        cursor = displayQty2.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = secondaryExecId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = ordStatus.encode(data, cursor);
        cursor = ccpCode.encode(data, cursor);
        cursor = aggressorIndicator.encode(data, cursor);
        cursor = requestId.encode(data, cursor);
        cursor = clientDataId.encode(data, cursor);
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
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "SecurityCode" -> Optional.of(securityCode);
            case "TransactionDateAndTime" -> Optional.of(transactionDateAndTime);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "TradingSessionId" -> Optional.of(tradingSessionId);
            case "TrdMatchId" -> Optional.of(trdMatchId);
            case "TradeType" -> Optional.of(tradeType);
            case "LastPx" -> Optional.of(lastPx);
            case "LastQty" -> Optional.of(lastQty);
            case "GrossTradeAmt" -> Optional.of(grossTradeAmt);
            case "Designation" -> Optional.of(designation);
            case "MarketMechanism" -> Optional.of(marketMechanism);
            case "AlgoFlag" -> Optional.of(algoFlag);
            case "BuyerBolsaCode" -> Optional.of(buyerBolsaCode);
            case "SettlDate" -> Optional.of(settlDate);
            case "TransactionCategory" -> Optional.of(transactionCategory);
            case "SecondaryOrderId" -> Optional.of(secondaryOrderId);
            case "EntryDate" -> Optional.of(entryDate);
            case "Priority" -> Optional.of(priority);
            case "Price" -> Optional.of(price);
            case "DisplayQty" -> Optional.of(displayQty);
            case "RetailFlag" -> Optional.of(retailFlag);
            case "SecondaryOrderId2" -> Optional.of(secondaryOrderId2);
            case "EntryDate2" -> Optional.of(entryDate2);
            case "Priority2" -> Optional.of(priority2);
            case "Price2" -> Optional.of(price2);
            case "DisplayQty2" -> Optional.of(displayQty2);
            case "OrderId" -> Optional.of(orderId);
            case "SecondaryExecId" -> Optional.of(secondaryExecId);
            case "OrderQty" -> Optional.of(orderQty);
            case "OrdStatus" -> Optional.of(ordStatus);
            case "CcpCode" -> Optional.of(ccpCode);
            case "AggressorIndicator" -> Optional.of(aggressorIndicator);
            case "RequestId" -> Optional.of(requestId);
            case "ClientDataId" -> Optional.of(clientDataId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionPrivateInformation1LegSellMarketOrderMessage message)) {
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
        if (!(other instanceof ExecutionPrivateInformation1LegSellMarketOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
