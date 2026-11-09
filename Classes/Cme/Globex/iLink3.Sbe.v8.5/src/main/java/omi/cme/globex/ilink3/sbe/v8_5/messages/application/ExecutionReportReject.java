package omi.cme.globex.ilink3.sbe.v8_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ClordidField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.CrossIdOptionalField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.CrossTypeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.DelayDurationField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.DelayToTimeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.DisplayQtyField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ExecIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ExecInstField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ExecutionModeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ExpireDateField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.HostCrossIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LiquidityFlagField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LocationField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ManagedOrderField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ManualOrderIndicatorField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MinQtyField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrdRejReasonField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrdTypeOptionalField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrderIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrderQtyField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrderRequestIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PartyDetailsListReqIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PossRetransFlagField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PriceOptionalField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecurityIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SenderIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SendingTimeEpochField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SeqNumField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ShortSaleTypeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SideField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SplitMsgField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.StopPxField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TextField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TimeInForceField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TransactTimeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.UuidField;
import omi.cme.globex.ilink3.sbe.v8_5.types.Field;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;
import omi.cme.globex.ilink3.sbe.v8_5.types.PrintOptions;

/**
 * Represents the ExecutionReportReject message from the iLink3 protocol.
 *
 * <p>The Execution Report - Reject message notifies the client system of a rejected order.</p>
 */
public final class ExecutionReportReject implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 467;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Report Reject";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Sequence number as assigned to message
     */
    private final SeqNumField seqNum = new SeqNumField();

    /**
     * Session Identifier defined as type long (uInt64); recommended to use timestamp as number of microseconds since epoch (Jan 1, 1970)
     */
    private final UuidField uuid = new UuidField();

    /**
     * Reject reason details. Will be used only for descriptive rejects
     */
    private final TextField text = new TextField();

    /**
     * Unique identifier of execution message as assigned by the exchange and is unique per day across all instruments and across all good till orders.
     */
    private final ExecIdField execId = new ExecIdField();

    /**
     * Operator ID. Should be unique per Firm ID. Assigned value used to identify specific message originator. Represents last individual or team in charge of the system which modifies the order before submission to the Globex platform, or if not modified from initiator (party role=118), last individual or team in charge of the system, which submit the order to the Globex platform
     */
    private final SenderIdField senderId = new SenderIdField();

    /**
     * Unique identifier for Order as assigned by the buy-side (institution, broker, intermediary etc.). Uniqueness must be guaranteed within a single trading day. Firms, particularly those which electronically submit multi-day orders, trade globally or throughout market close periods, should ensure uniqueness across days, for example by embedding a date within the ClOrdID field
     */
    private final ClordidField clordid = new ClordidField();

    /**
     * Refers to the ID of the related PartyDetailsDefinitionRequest message which will logically be tied to this message
     */
    private final PartyDetailsListReqIdField partyDetailsListReqId = new PartyDetailsListReqIdField();

    /**
     * Unique identifier for order as assigned by the exchange. Uniqueness is guaranteed within a single trading day across all instruments.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Price per share or contract. Conditionally required if the order type requires a price (not market orders)
     */
    private final PriceOptionalField priceOptional = new PriceOptionalField();

    /**
     * The stop price of a stop protect or stop limit order. (Conditionally required if OrdType = 3 or 4).
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Time the transaction represented by this ExecutionReport (35=8) occurred. Expressed as nanoseconds since epoch time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Time when the message is sent. 64-bit integer expressing the number of nano seconds since midnight January 1, 1970.
     */
    private final SendingTimeEpochField sendingTimeEpoch = new SendingTimeEpochField();

    /**
     * Use OrderRequestID to identify a request to enter, modify or delete an order and echo the value on the ExecutionReport representing the response
     */
    private final OrderRequestIdField orderRequestId = new OrderRequestIdField();

    /**
     * Identifier for a cross order. Will be present if execution report is in response to a cross order
     */
    private final CrossIdOptionalField crossIdOptional = new CrossIdOptionalField();

    /**
     * Host assigned entity ID that can be used to reference all components of a cross; sides + strategy + legs. The HostCrossID will also be used to link together components of the cross order. For example, each individual execution report associated with the order will carry HostCrossID in order to tie them back together to the original cross order.
     */
    private final HostCrossIdField hostCrossId = new HostCrossIdField();

    /**
     * Text describing sender's location (i.e. geopraphic location and/or desk)
     */
    private final LocationField location = new LocationField();

    /**
     * Security ID as defined by CME. For the security ID list, see the security definition messages
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Number of shares or contracts ordered
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Minimum quantity of an order to be executed
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * The quantity to be displayed . Required for iceberg orders. On orders specifies the qty to be displayed, on execution reports the currently displayed quantity
     */
    private final DisplayQtyField displayQty = new DisplayQtyField();

    /**
     * Code to identify reason for order rejection
     */
    private final OrdRejReasonField ordRejReason = new OrdRejReasonField();

    /**
     * Date of order expiration (last day the order can trade), always expressed in terms of the local market date. Applicable only to GTD orders which expire at the end of the trading session specified. This has to be a future or current session date and cannot be in the past.
     */
    private final ExpireDateField expireDate = new ExpireDateField();

    /**
     * Not being currently used
     */
    private final DelayDurationField delayDuration = new DelayDurationField();

    /**
     * Order type.
     */
    private final OrdTypeOptionalField ordTypeOptional = new OrdTypeOptionalField();

    /**
     * Side of order
     */
    private final SideField side = new SideField();

    /**
     * Specifies how long the order remains in effect
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Indicates if the order was initially received manually (as opposed to electronically)
     */
    private final ManualOrderIndicatorField manualOrderIndicator = new ManualOrderIndicatorField();

    /**
     * Flags message as possible retransmission. This will convey whether a message is an original transmission or duplicate in response to RetransmissionRequest. This will become pertinent when original messages get interleaved with Retransmission responses
     */
    private final PossRetransFlagField possRetransFlag = new PossRetransFlagField();

    /**
     * Indicates whether a message was delayed as a result of being split among multiple packets (0) or if a message was delayed as a result of TCP re-transmission (1) or if a complete message was delayed due to a previously submitted split or out of order message (2). If absent then the message was not delayed and was neither split nor received out of order
     */
    private final SplitMsgField splitMsg = new SplitMsgField();

    /**
     * ype of cross being submitted to a market. (if in response to a cross order)
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * ExecInst bit set
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Identifies whether the order should be treated as passive (will not match when entered) or aggressive (could match when entered); default behavior when absent is aggressive
     */
    private final ExecutionModeField executionMode = new ExecutionModeField();

    /**
     * New field added to capture if an order was submitted for market making obligation or not. Applicable only for EU fixed income markets
     */
    private final LiquidityFlagField liquidityFlag = new LiquidityFlagField();

    /**
     * Boolean: flags a managed order
     */
    private final ManagedOrderField managedOrder = new ManagedOrderField();

    /**
     * Indicates the type of short sale. Will not be used for Buy orders but Sell orders should have this tag populated for MiFID
     */
    private final ShortSaleTypeField shortSaleType = new ShortSaleTypeField();

    /**
     * Indicates the amount of time that a message was delayed as a result of being split (9553=0) or as a result of being out of order due to TCP retransmission (9553=1) or as a result of being queued behind a split message (9553=2). Represented as number of nanoseconds in unix epoch format (since Jan 1, 1970). Subtracting this number from FIFO time will represent original received time of delayed message
     */
    private final DelayToTimeField delayToTime = new DelayToTimeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(seqNum, uuid, text, execId, senderId, clordid, partyDetailsListReqId, orderId, priceOptional, stopPx, transactTime, sendingTimeEpoch, orderRequestId, crossIdOptional, hostCrossId, location, securityId, orderQty, minQty, displayQty, ordRejReason, expireDate, delayDuration, ordTypeOptional, side, timeInForce, manualOrderIndicator, possRetransFlag, splitMsg, crossType, execInst, executionMode, liquidityFlag, managedOrder, shortSaleType, delayToTime);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Sequence number as assigned to message
     *
     * @return the SeqNum field
     */
    public SeqNumField seqNum() {
        return seqNum;
    }

    /**
     * Session Identifier defined as type long (uInt64); recommended to use timestamp as number of microseconds since epoch (Jan 1, 1970)
     *
     * @return the Uuid field
     */
    public UuidField uuid() {
        return uuid;
    }

    /**
     * Reject reason details. Will be used only for descriptive rejects
     *
     * @return the Text field
     */
    public TextField text() {
        return text;
    }

    /**
     * Unique identifier of execution message as assigned by the exchange and is unique per day across all instruments and across all good till orders.
     *
     * @return the ExecId field
     */
    public ExecIdField execId() {
        return execId;
    }

    /**
     * Operator ID. Should be unique per Firm ID. Assigned value used to identify specific message originator. Represents last individual or team in charge of the system which modifies the order before submission to the Globex platform, or if not modified from initiator (party role=118), last individual or team in charge of the system, which submit the order to the Globex platform
     *
     * @return the SenderId field
     */
    public SenderIdField senderId() {
        return senderId;
    }

    /**
     * Unique identifier for Order as assigned by the buy-side (institution, broker, intermediary etc.). Uniqueness must be guaranteed within a single trading day. Firms, particularly those which electronically submit multi-day orders, trade globally or throughout market close periods, should ensure uniqueness across days, for example by embedding a date within the ClOrdID field
     *
     * @return the Clordid field
     */
    public ClordidField clordid() {
        return clordid;
    }

    /**
     * Refers to the ID of the related PartyDetailsDefinitionRequest message which will logically be tied to this message
     *
     * @return the PartyDetailsListReqId field
     */
    public PartyDetailsListReqIdField partyDetailsListReqId() {
        return partyDetailsListReqId;
    }

    /**
     * Unique identifier for order as assigned by the exchange. Uniqueness is guaranteed within a single trading day across all instruments.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Price per share or contract. Conditionally required if the order type requires a price (not market orders)
     *
     * @return the PriceOptional field
     */
    public PriceOptionalField priceOptional() {
        return priceOptional;
    }

    /**
     * The stop price of a stop protect or stop limit order. (Conditionally required if OrdType = 3 or 4).
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * Time the transaction represented by this ExecutionReport (35=8) occurred. Expressed as nanoseconds since epoch time
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Time when the message is sent. 64-bit integer expressing the number of nano seconds since midnight January 1, 1970.
     *
     * @return the SendingTimeEpoch field
     */
    public SendingTimeEpochField sendingTimeEpoch() {
        return sendingTimeEpoch;
    }

    /**
     * Use OrderRequestID to identify a request to enter, modify or delete an order and echo the value on the ExecutionReport representing the response
     *
     * @return the OrderRequestId field
     */
    public OrderRequestIdField orderRequestId() {
        return orderRequestId;
    }

    /**
     * Identifier for a cross order. Will be present if execution report is in response to a cross order
     *
     * @return the CrossIdOptional field
     */
    public CrossIdOptionalField crossIdOptional() {
        return crossIdOptional;
    }

    /**
     * Host assigned entity ID that can be used to reference all components of a cross; sides + strategy + legs. The HostCrossID will also be used to link together components of the cross order. For example, each individual execution report associated with the order will carry HostCrossID in order to tie them back together to the original cross order.
     *
     * @return the HostCrossId field
     */
    public HostCrossIdField hostCrossId() {
        return hostCrossId;
    }

    /**
     * Text describing sender's location (i.e. geopraphic location and/or desk)
     *
     * @return the Location field
     */
    public LocationField location() {
        return location;
    }

    /**
     * Security ID as defined by CME. For the security ID list, see the security definition messages
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Number of shares or contracts ordered
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Minimum quantity of an order to be executed
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
    }

    /**
     * The quantity to be displayed . Required for iceberg orders. On orders specifies the qty to be displayed, on execution reports the currently displayed quantity
     *
     * @return the DisplayQty field
     */
    public DisplayQtyField displayQty() {
        return displayQty;
    }

    /**
     * Code to identify reason for order rejection
     *
     * @return the OrdRejReason field
     */
    public OrdRejReasonField ordRejReason() {
        return ordRejReason;
    }

    /**
     * Date of order expiration (last day the order can trade), always expressed in terms of the local market date. Applicable only to GTD orders which expire at the end of the trading session specified. This has to be a future or current session date and cannot be in the past.
     *
     * @return the ExpireDate field
     */
    public ExpireDateField expireDate() {
        return expireDate;
    }

    /**
     * Not being currently used
     *
     * @return the DelayDuration field
     */
    public DelayDurationField delayDuration() {
        return delayDuration;
    }

    /**
     * Order type.
     *
     * @return the OrdTypeOptional field
     */
    public OrdTypeOptionalField ordTypeOptional() {
        return ordTypeOptional;
    }

    /**
     * Side of order
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Specifies how long the order remains in effect
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Indicates if the order was initially received manually (as opposed to electronically)
     *
     * @return the ManualOrderIndicator field
     */
    public ManualOrderIndicatorField manualOrderIndicator() {
        return manualOrderIndicator;
    }

    /**
     * Flags message as possible retransmission. This will convey whether a message is an original transmission or duplicate in response to RetransmissionRequest. This will become pertinent when original messages get interleaved with Retransmission responses
     *
     * @return the PossRetransFlag field
     */
    public PossRetransFlagField possRetransFlag() {
        return possRetransFlag;
    }

    /**
     * Indicates whether a message was delayed as a result of being split among multiple packets (0) or if a message was delayed as a result of TCP re-transmission (1) or if a complete message was delayed due to a previously submitted split or out of order message (2). If absent then the message was not delayed and was neither split nor received out of order
     *
     * @return the SplitMsg field
     */
    public SplitMsgField splitMsg() {
        return splitMsg;
    }

    /**
     * ype of cross being submitted to a market. (if in response to a cross order)
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * ExecInst bit set
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * Identifies whether the order should be treated as passive (will not match when entered) or aggressive (could match when entered); default behavior when absent is aggressive
     *
     * @return the ExecutionMode field
     */
    public ExecutionModeField executionMode() {
        return executionMode;
    }

    /**
     * New field added to capture if an order was submitted for market making obligation or not. Applicable only for EU fixed income markets
     *
     * @return the LiquidityFlag field
     */
    public LiquidityFlagField liquidityFlag() {
        return liquidityFlag;
    }

    /**
     * Boolean: flags a managed order
     *
     * @return the ManagedOrder field
     */
    public ManagedOrderField managedOrder() {
        return managedOrder;
    }

    /**
     * Indicates the type of short sale. Will not be used for Buy orders but Sell orders should have this tag populated for MiFID
     *
     * @return the ShortSaleType field
     */
    public ShortSaleTypeField shortSaleType() {
        return shortSaleType;
    }

    /**
     * Indicates the amount of time that a message was delayed as a result of being split (9553=0) or as a result of being out of order due to TCP retransmission (9553=1) or as a result of being queued behind a split message (9553=2). Represented as number of nanoseconds in unix epoch format (since Jan 1, 1970). Subtracting this number from FIFO time will represent original received time of delayed message
     *
     * @return the DelayToTime field
     */
    public DelayToTimeField delayToTime() {
        return delayToTime;
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
        return PADDING.clone();
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!seqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SeqNumField.BYTE_LENGTH;
        if (!uuid.parse(data, cursor)) {
            return false;
        }
        cursor += UuidField.BYTE_LENGTH;
        if (!text.parse(data, cursor)) {
            return false;
        }
        cursor += TextField.BYTE_LENGTH;
        if (!execId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecIdField.BYTE_LENGTH;
        if (!senderId.parse(data, cursor)) {
            return false;
        }
        cursor += SenderIdField.BYTE_LENGTH;
        if (!clordid.parse(data, cursor)) {
            return false;
        }
        cursor += ClordidField.BYTE_LENGTH;
        if (!partyDetailsListReqId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyDetailsListReqIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!priceOptional.parse(data, cursor)) {
            return false;
        }
        cursor += PriceOptionalField.BYTE_LENGTH;
        if (!stopPx.parse(data, cursor)) {
            return false;
        }
        cursor += StopPxField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!sendingTimeEpoch.parse(data, cursor)) {
            return false;
        }
        cursor += SendingTimeEpochField.BYTE_LENGTH;
        if (!orderRequestId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderRequestIdField.BYTE_LENGTH;
        if (!crossIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += CrossIdOptionalField.BYTE_LENGTH;
        if (!hostCrossId.parse(data, cursor)) {
            return false;
        }
        cursor += HostCrossIdField.BYTE_LENGTH;
        if (!location.parse(data, cursor)) {
            return false;
        }
        cursor += LocationField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!minQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinQtyField.BYTE_LENGTH;
        if (!displayQty.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayQtyField.BYTE_LENGTH;
        if (!ordRejReason.parse(data, cursor)) {
            return false;
        }
        cursor += OrdRejReasonField.BYTE_LENGTH;
        if (!expireDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireDateField.BYTE_LENGTH;
        if (!delayDuration.parse(data, cursor)) {
            return false;
        }
        cursor += DelayDurationField.BYTE_LENGTH;
        if (!ordTypeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeOptionalField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!manualOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        if (!possRetransFlag.parse(data, cursor)) {
            return false;
        }
        cursor += PossRetransFlagField.BYTE_LENGTH;
        if (!splitMsg.parse(data, cursor)) {
            return false;
        }
        cursor += SplitMsgField.BYTE_LENGTH;
        if (!crossType.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!executionMode.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionModeField.BYTE_LENGTH;
        if (!liquidityFlag.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityFlagField.BYTE_LENGTH;
        if (!managedOrder.parse(data, cursor)) {
            return false;
        }
        cursor += ManagedOrderField.BYTE_LENGTH;
        if (!shortSaleType.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSaleTypeField.BYTE_LENGTH;
        if (!delayToTime.parse(data, cursor)) {
            return false;
        }
        cursor += DelayToTimeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = seqNum.encode(data, cursor);
        cursor = uuid.encode(data, cursor);
        cursor = text.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = senderId.encode(data, cursor);
        cursor = clordid.encode(data, cursor);
        cursor = partyDetailsListReqId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = priceOptional.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = sendingTimeEpoch.encode(data, cursor);
        cursor = orderRequestId.encode(data, cursor);
        cursor = crossIdOptional.encode(data, cursor);
        cursor = hostCrossId.encode(data, cursor);
        cursor = location.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = displayQty.encode(data, cursor);
        cursor = ordRejReason.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
        cursor = delayDuration.encode(data, cursor);
        cursor = ordTypeOptional.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = manualOrderIndicator.encode(data, cursor);
        cursor = possRetransFlag.encode(data, cursor);
        cursor = splitMsg.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = executionMode.encode(data, cursor);
        cursor = liquidityFlag.encode(data, cursor);
        cursor = managedOrder.encode(data, cursor);
        cursor = shortSaleType.encode(data, cursor);
        cursor = delayToTime.encode(data, cursor);
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
            case "SeqNum" -> Optional.of(seqNum);
            case "Uuid" -> Optional.of(uuid);
            case "Text" -> Optional.of(text);
            case "ExecId" -> Optional.of(execId);
            case "SenderId" -> Optional.of(senderId);
            case "Clordid" -> Optional.of(clordid);
            case "PartyDetailsListReqId" -> Optional.of(partyDetailsListReqId);
            case "OrderId" -> Optional.of(orderId);
            case "PriceOptional" -> Optional.of(priceOptional);
            case "StopPx" -> Optional.of(stopPx);
            case "TransactTime" -> Optional.of(transactTime);
            case "SendingTimeEpoch" -> Optional.of(sendingTimeEpoch);
            case "OrderRequestId" -> Optional.of(orderRequestId);
            case "CrossIdOptional" -> Optional.of(crossIdOptional);
            case "HostCrossId" -> Optional.of(hostCrossId);
            case "Location" -> Optional.of(location);
            case "SecurityId" -> Optional.of(securityId);
            case "OrderQty" -> Optional.of(orderQty);
            case "MinQty" -> Optional.of(minQty);
            case "DisplayQty" -> Optional.of(displayQty);
            case "OrdRejReason" -> Optional.of(ordRejReason);
            case "ExpireDate" -> Optional.of(expireDate);
            case "DelayDuration" -> Optional.of(delayDuration);
            case "OrdTypeOptional" -> Optional.of(ordTypeOptional);
            case "Side" -> Optional.of(side);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "PossRetransFlag" -> Optional.of(possRetransFlag);
            case "SplitMsg" -> Optional.of(splitMsg);
            case "CrossType" -> Optional.of(crossType);
            case "ExecInst" -> Optional.of(execInst);
            case "ExecutionMode" -> Optional.of(executionMode);
            case "LiquidityFlag" -> Optional.of(liquidityFlag);
            case "ManagedOrder" -> Optional.of(managedOrder);
            case "ShortSaleType" -> Optional.of(shortSaleType);
            case "DelayToTime" -> Optional.of(delayToTime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionReportReject message)) {
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
        if (!(other instanceof ExecutionReportReject message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
