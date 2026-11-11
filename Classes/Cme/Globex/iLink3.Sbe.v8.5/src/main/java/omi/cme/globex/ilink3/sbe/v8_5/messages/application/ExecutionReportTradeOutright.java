package omi.cme.globex.ilink3.sbe.v8_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.ilink3.sbe.v8_5.fields.AggressorIndicatorField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ClordidField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.CrossIdOptionalField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.CrossTypeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.CumQtyField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ExecIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ExecInstField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ExecutionModeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ExpireDateField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.HostCrossIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LastPxField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LastQtyField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LeavesQtyField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LiquidityFlagField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LocationField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ManagedOrderField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ManualOrderIndicatorField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MdTradeEntryIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrdStatusTrdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrdTypeOptionalField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrderIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrderQtyField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrderRequestIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OwnershipField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PartyDetailsListReqIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PossRetransFlagField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PriceField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecExecIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecurityIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SenderIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SendingTimeEpochField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SeqNumField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ShortSaleTypeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SideField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SideTradeIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.StopPxField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TimeInForceField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TradeDateField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TradeLinkIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TransactTimeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.UuidField;
import omi.cme.globex.ilink3.sbe.v8_5.structs.FillsGroups;
import omi.cme.globex.ilink3.sbe.v8_5.structs.OutrightOrderEventsGroups;
import omi.cme.globex.ilink3.sbe.v8_5.types.Field;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;
import omi.cme.globex.ilink3.sbe.v8_5.types.PrintOptions;

/**
 * Represents the ExecutionReportTradeOutright message from the iLink3 protocol.
 *
 * <p>The Execution Report - Trade Outright message is sent upon fill or partial fill of a client order for outright instruments.</p>
 */
public final class ExecutionReportTradeOutright implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 241;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Report Trade Outright";

    /**
     * Sequence number as assigned to message
     */
    private final SeqNumField seqNum = new SeqNumField();

    /**
     * Session Identifier defined as type long (uInt64); recommended to use timestamp as number of microseconds since epoch (Jan 1, 1970)
     */
    private final UuidField uuid = new UuidField();

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
     * Price of this (last) fill
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * Unique identifier for order as assigned by the exchange. Uniqueness is guaranteed within a single trading day across all instruments.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Price per share or contract
     */
    private final PriceField price = new PriceField();

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
     * Unique identifier that allows linking id spread summary fill notice with leg fill notice and trade cancel messages
     */
    private final SecExecIdField secExecId = new SecExecIdField();

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
     * Quantity of shares bought/sold on this (last) fill
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Total quantity filled
     */
    private final CumQtyField cumQty = new CumQtyField();

    /**
     * Market Data Trade Entry ID. This identifier is assigned to all trades that take place for an instrument at a particular price level
     */
    private final MdTradeEntryIdField mdTradeEntryId = new MdTradeEntryIdField();

    /**
     * The unique ID assigned to the trade once it is received or matched by the exchange
     */
    private final SideTradeIdField sideTradeId = new SideTradeIdField();

    /**
     * Contains the workup ID; unique per instrument per day
     */
    private final TradeLinkIdField tradeLinkId = new TradeLinkIdField();

    /**
     * Quantity open for further execution; LeavesQty = OrderQty (38) - CumQty (14); Only present for outrights and spreads and not spread legs
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Indicates date of trading day (expressed in local time at place of trade).
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Date of order expiration (last day the order can trade), always expressed in terms of the local market date. Applicable only to GTD orders which expire at the end of the trading session specified. This has to be a future or current session date and cannot be in the past.
     */
    private final ExpireDateField expireDate = new ExpireDateField();

    /**
     * Identifies status of order as partially filled or completely filled
     */
    private final OrdStatusTrdField ordStatusTrd = new OrdStatusTrdField();

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
     * Indicates if order was incoming or resting for the match event
     */
    private final AggressorIndicatorField aggressorIndicator = new AggressorIndicatorField();

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
     * Specifies the owner of the work up private phase
     */
    private final OwnershipField ownership = new OwnershipField();

    /**
     * NoFills Block
     */
    private final FillsGroups fillsGroups = new FillsGroups();

    /**
     * NoOrderEvents Block
     */
    private final OutrightOrderEventsGroups outrightOrderEventsGroups = new OutrightOrderEventsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(seqNum, uuid, execId, senderId, clordid, partyDetailsListReqId, lastPx, orderId, price, stopPx, transactTime, sendingTimeEpoch, orderRequestId, secExecId, crossIdOptional, hostCrossId, location, securityId, orderQty, lastQty, cumQty, mdTradeEntryId, sideTradeId, tradeLinkId, leavesQty, tradeDate, expireDate, ordStatusTrd, ordTypeOptional, side, timeInForce, manualOrderIndicator, possRetransFlag, aggressorIndicator, crossType, execInst, executionMode, liquidityFlag, managedOrder, shortSaleType, ownership);

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
     * Price of this (last) fill
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
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
     * Price per share or contract
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
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
     * Unique identifier that allows linking id spread summary fill notice with leg fill notice and trade cancel messages
     *
     * @return the SecExecId field
     */
    public SecExecIdField secExecId() {
        return secExecId;
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
     * Quantity of shares bought/sold on this (last) fill
     *
     * @return the LastQty field
     */
    public LastQtyField lastQty() {
        return lastQty;
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
     * Market Data Trade Entry ID. This identifier is assigned to all trades that take place for an instrument at a particular price level
     *
     * @return the MdTradeEntryId field
     */
    public MdTradeEntryIdField mdTradeEntryId() {
        return mdTradeEntryId;
    }

    /**
     * The unique ID assigned to the trade once it is received or matched by the exchange
     *
     * @return the SideTradeId field
     */
    public SideTradeIdField sideTradeId() {
        return sideTradeId;
    }

    /**
     * Contains the workup ID; unique per instrument per day
     *
     * @return the TradeLinkId field
     */
    public TradeLinkIdField tradeLinkId() {
        return tradeLinkId;
    }

    /**
     * Quantity open for further execution; LeavesQty = OrderQty (38) - CumQty (14); Only present for outrights and spreads and not spread legs
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Indicates date of trading day (expressed in local time at place of trade).
     *
     * @return the TradeDate field
     */
    public TradeDateField tradeDate() {
        return tradeDate;
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
     * Identifies status of order as partially filled or completely filled
     *
     * @return the OrdStatusTrd field
     */
    public OrdStatusTrdField ordStatusTrd() {
        return ordStatusTrd;
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
     * Indicates if order was incoming or resting for the match event
     *
     * @return the AggressorIndicator field
     */
    public AggressorIndicatorField aggressorIndicator() {
        return aggressorIndicator;
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
     * Specifies the owner of the work up private phase
     *
     * @return the Ownership field
     */
    public OwnershipField ownership() {
        return ownership;
    }

    /**
     * NoFills Block
     *
     * @return the FillsGroups record
     */
    public FillsGroups fillsGroups() {
        return fillsGroups;
    }

    /**
     * NoOrderEvents Block
     *
     * @return the OutrightOrderEventsGroups record
     */
    public OutrightOrderEventsGroups outrightOrderEventsGroups() {
        return outrightOrderEventsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + fillsGroups.byteLength() - FillsGroups.MINIMUM_BYTE_LENGTH + outrightOrderEventsGroups.byteLength() - OutrightOrderEventsGroups.MINIMUM_BYTE_LENGTH;
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
        if (!seqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SeqNumField.BYTE_LENGTH;
        if (!uuid.parse(data, cursor)) {
            return false;
        }
        cursor += UuidField.BYTE_LENGTH;
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
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
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
        if (!secExecId.parse(data, cursor)) {
            return false;
        }
        cursor += SecExecIdField.BYTE_LENGTH;
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
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!cumQty.parse(data, cursor)) {
            return false;
        }
        cursor += CumQtyField.BYTE_LENGTH;
        if (!mdTradeEntryId.parse(data, cursor)) {
            return false;
        }
        cursor += MdTradeEntryIdField.BYTE_LENGTH;
        if (!sideTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += SideTradeIdField.BYTE_LENGTH;
        if (!tradeLinkId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeLinkIdField.BYTE_LENGTH;
        if (!leavesQty.parse(data, cursor)) {
            return false;
        }
        cursor += LeavesQtyField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!expireDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireDateField.BYTE_LENGTH;
        if (!ordStatusTrd.parse(data, cursor)) {
            return false;
        }
        cursor += OrdStatusTrdField.BYTE_LENGTH;
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
        if (!aggressorIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += AggressorIndicatorField.BYTE_LENGTH;
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
        if (!ownership.parse(data, cursor)) {
            return false;
        }
        cursor += OwnershipField.BYTE_LENGTH;
        if (!fillsGroups.parseFrom(data, cursor, end - 3)) {
            return false;
        }
        cursor += fillsGroups.byteLength();
        if (end - cursor < 3) {
            return false;
        }
        if (!outrightOrderEventsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += outrightOrderEventsGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = seqNum.encode(data, cursor);
        cursor = uuid.encode(data, cursor);
        cursor = execId.encode(data, cursor);
        cursor = senderId.encode(data, cursor);
        cursor = clordid.encode(data, cursor);
        cursor = partyDetailsListReqId.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = stopPx.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = sendingTimeEpoch.encode(data, cursor);
        cursor = orderRequestId.encode(data, cursor);
        cursor = secExecId.encode(data, cursor);
        cursor = crossIdOptional.encode(data, cursor);
        cursor = hostCrossId.encode(data, cursor);
        cursor = location.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = cumQty.encode(data, cursor);
        cursor = mdTradeEntryId.encode(data, cursor);
        cursor = sideTradeId.encode(data, cursor);
        cursor = tradeLinkId.encode(data, cursor);
        cursor = leavesQty.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = expireDate.encode(data, cursor);
        cursor = ordStatusTrd.encode(data, cursor);
        cursor = ordTypeOptional.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = manualOrderIndicator.encode(data, cursor);
        cursor = possRetransFlag.encode(data, cursor);
        cursor = aggressorIndicator.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = executionMode.encode(data, cursor);
        cursor = liquidityFlag.encode(data, cursor);
        cursor = managedOrder.encode(data, cursor);
        cursor = shortSaleType.encode(data, cursor);
        cursor = ownership.encode(data, cursor);
        cursor = fillsGroups.encode(data, cursor);
        cursor = outrightOrderEventsGroups.encode(data, cursor);
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
        fillsGroups.clear();
        outrightOrderEventsGroups.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        if (!fillsGroups.isRecognized()) {
            return false;
        }
        return outrightOrderEventsGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!fillsGroups.isValid()) {
            return false;
        }
        if (!outrightOrderEventsGroups.isValid()) {
            return false;
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
        if (!seqNum.isDecoded()) {
            return Optional.of(seqNum);
        }
        if (!uuid.isDecoded()) {
            return Optional.of(uuid);
        }
        if (!execId.isDecoded()) {
            return Optional.of(execId);
        }
        if (!senderId.isDecoded()) {
            return Optional.of(senderId);
        }
        if (!clordid.isDecoded()) {
            return Optional.of(clordid);
        }
        if (!partyDetailsListReqId.isDecoded()) {
            return Optional.of(partyDetailsListReqId);
        }
        if (!lastPx.isDecoded()) {
            return Optional.of(lastPx);
        }
        if (!orderId.isDecoded()) {
            return Optional.of(orderId);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!stopPx.isDecoded()) {
            return Optional.of(stopPx);
        }
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!sendingTimeEpoch.isDecoded()) {
            return Optional.of(sendingTimeEpoch);
        }
        if (!orderRequestId.isDecoded()) {
            return Optional.of(orderRequestId);
        }
        if (!secExecId.isDecoded()) {
            return Optional.of(secExecId);
        }
        if (!crossIdOptional.isDecoded()) {
            return Optional.of(crossIdOptional);
        }
        if (!hostCrossId.isDecoded()) {
            return Optional.of(hostCrossId);
        }
        if (!location.isDecoded()) {
            return Optional.of(location);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (!lastQty.isDecoded()) {
            return Optional.of(lastQty);
        }
        if (!cumQty.isDecoded()) {
            return Optional.of(cumQty);
        }
        if (!mdTradeEntryId.isDecoded()) {
            return Optional.of(mdTradeEntryId);
        }
        if (!sideTradeId.isDecoded()) {
            return Optional.of(sideTradeId);
        }
        if (!tradeLinkId.isDecoded()) {
            return Optional.of(tradeLinkId);
        }
        if (!leavesQty.isDecoded()) {
            return Optional.of(leavesQty);
        }
        if (!tradeDate.isDecoded()) {
            return Optional.of(tradeDate);
        }
        if (!expireDate.isDecoded()) {
            return Optional.of(expireDate);
        }
        if (!ordStatusTrd.isDecoded()) {
            return Optional.of(ordStatusTrd);
        }
        if (!ordTypeOptional.isDecoded()) {
            return Optional.of(ordTypeOptional);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!timeInForce.isDecoded()) {
            return Optional.of(timeInForce);
        }
        if (!manualOrderIndicator.isDecoded()) {
            return Optional.of(manualOrderIndicator);
        }
        if (!possRetransFlag.isDecoded()) {
            return Optional.of(possRetransFlag);
        }
        if (!aggressorIndicator.isDecoded()) {
            return Optional.of(aggressorIndicator);
        }
        if (!crossType.isDecoded()) {
            return Optional.of(crossType);
        }
        if (!execInst.isDecoded()) {
            return Optional.of(execInst);
        }
        if (!executionMode.isDecoded()) {
            return Optional.of(executionMode);
        }
        if (!liquidityFlag.isDecoded()) {
            return Optional.of(liquidityFlag);
        }
        if (!managedOrder.isDecoded()) {
            return Optional.of(managedOrder);
        }
        if (!shortSaleType.isDecoded()) {
            return Optional.of(shortSaleType);
        }
        if (!ownership.isDecoded()) {
            return Optional.of(ownership);
        }
        if (!fillsGroups.isDecoded()) {
            return fillsGroups.failedAt();
        }
        if (!outrightOrderEventsGroups.isDecoded()) {
            return outrightOrderEventsGroups.failedAt();
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
            case "ExecId" -> Optional.of(execId);
            case "SenderId" -> Optional.of(senderId);
            case "Clordid" -> Optional.of(clordid);
            case "PartyDetailsListReqId" -> Optional.of(partyDetailsListReqId);
            case "LastPx" -> Optional.of(lastPx);
            case "OrderId" -> Optional.of(orderId);
            case "Price" -> Optional.of(price);
            case "StopPx" -> Optional.of(stopPx);
            case "TransactTime" -> Optional.of(transactTime);
            case "SendingTimeEpoch" -> Optional.of(sendingTimeEpoch);
            case "OrderRequestId" -> Optional.of(orderRequestId);
            case "SecExecId" -> Optional.of(secExecId);
            case "CrossIdOptional" -> Optional.of(crossIdOptional);
            case "HostCrossId" -> Optional.of(hostCrossId);
            case "Location" -> Optional.of(location);
            case "SecurityId" -> Optional.of(securityId);
            case "OrderQty" -> Optional.of(orderQty);
            case "LastQty" -> Optional.of(lastQty);
            case "CumQty" -> Optional.of(cumQty);
            case "MdTradeEntryId" -> Optional.of(mdTradeEntryId);
            case "SideTradeId" -> Optional.of(sideTradeId);
            case "TradeLinkId" -> Optional.of(tradeLinkId);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "TradeDate" -> Optional.of(tradeDate);
            case "ExpireDate" -> Optional.of(expireDate);
            case "OrdStatusTrd" -> Optional.of(ordStatusTrd);
            case "OrdTypeOptional" -> Optional.of(ordTypeOptional);
            case "Side" -> Optional.of(side);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "PossRetransFlag" -> Optional.of(possRetransFlag);
            case "AggressorIndicator" -> Optional.of(aggressorIndicator);
            case "CrossType" -> Optional.of(crossType);
            case "ExecInst" -> Optional.of(execInst);
            case "ExecutionMode" -> Optional.of(executionMode);
            case "LiquidityFlag" -> Optional.of(liquidityFlag);
            case "ManagedOrder" -> Optional.of(managedOrder);
            case "ShortSaleType" -> Optional.of(shortSaleType);
            case "Ownership" -> Optional.of(ownership);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionReportTradeOutright message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(fillsGroups.diffFields(message.fillsGroups));
        changed.addAll(outrightOrderEventsGroups.diffFields(message.outrightOrderEventsGroups));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            fillsGroups.toFormattedString(builder, options);
            builder.append(", ");
            outrightOrderEventsGroups.toFormattedString(builder, options);
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
        fillsGroups.toFormattedString(builder, nested);
        outrightOrderEventsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof ExecutionReportTradeOutright message)) {
            return false;
        }
        return fields.equals(message.fields) && fillsGroups.equals(message.fillsGroups) && outrightOrderEventsGroups.equals(message.outrightOrderEventsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, fillsGroups, outrightOrderEventsGroups);
    }
}
