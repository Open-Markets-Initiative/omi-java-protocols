package omi.cme.globex.ilink3.sbe.v8_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ClordidField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ExecIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ExecInstField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ExecTypeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ExecutionModeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LastPxField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LastQtyField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LiquidityFlagField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LocationField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ManagedOrderField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ManualOrderIndicatorField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MdTradeEntryIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrdStatusTrdCxlField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrdTypeOptionalField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrderIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrigSecondaryExecutionIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrigSideTradeIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PartyDetailsListReqIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PossRetransFlagField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecExecIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecurityIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SenderIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SendingTimeEpochField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SeqNumField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ShortSaleTypeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SideField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SideTradeIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TotalNumSecuritiesField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TradeDateField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TransactTimeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.UuidField;
import omi.cme.globex.ilink3.sbe.v8_5.structs.FillsGroups;
import omi.cme.globex.ilink3.sbe.v8_5.structs.SpreadTradeEventsGroups;
import omi.cme.globex.ilink3.sbe.v8_5.structs.TradeAddendumLegsGroups;
import omi.cme.globex.ilink3.sbe.v8_5.types.Field;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;
import omi.cme.globex.ilink3.sbe.v8_5.types.PrintOptions;

/**
 * Represents the ExecutionReportTradeAddendumSpread message from the iLink3 protocol.
 *
 * <p>The Execution Report - Trade Addendum Spread message notifies client system of trade cancellation or correction for spreads.</p>
 */
public final class ExecutionReportTradeAddendumSpread implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 196;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Report Trade Addendum Spread";

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
     * Time the transaction represented by this ExecutionReport (35=8) occurred. Expressed as nanoseconds since epoch time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Time when the message is sent. 64-bit integer expressing the number of nano seconds since midnight January 1, 1970.
     */
    private final SendingTimeEpochField sendingTimeEpoch = new SendingTimeEpochField();

    /**
     * Unique identifier that allows linking id spread summary fill notice with leg fill notice and trade cancel messages
     */
    private final SecExecIdField secExecId = new SecExecIdField();

    /**
     * Unique identifier of the fill which is being corrected
     */
    private final OrigSecondaryExecutionIdField origSecondaryExecutionId = new OrigSecondaryExecutionIdField();

    /**
     * Text describing sender's location (i.e. geopraphic location and/or desk)
     */
    private final LocationField location = new LocationField();

    /**
     * Security ID as defined by CME. For the security ID list, see the security definition messages
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Market Data Trade Entry ID. This identifier is assigned to all trades that take place for an instrument at a particular price level
     */
    private final MdTradeEntryIdField mdTradeEntryId = new MdTradeEntryIdField();

    /**
     * Quantity of shares bought/sold on this (last) fill
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * The unique ID assigned to the trade once it is received or matched by the exchange
     */
    private final SideTradeIdField sideTradeId = new SideTradeIdField();

    /**
     * Refers back to the unique ID assigned to the corrected trade
     */
    private final OrigSideTradeIdField origSideTradeId = new OrigSideTradeIdField();

    /**
     * Indicates date of trading day (expressed in local time at place of trade).
     */
    private final TradeDateField tradeDate = new TradeDateField();

    /**
     * Identifies status of order as trade cancellation or correction
     */
    private final OrdStatusTrdCxlField ordStatusTrdCxl = new OrdStatusTrdCxlField();

    /**
     * Describes the specific ExecutionRpt as trade cancellation or correction
     */
    private final ExecTypeField execType = new ExecTypeField();

    /**
     * Order type.
     */
    private final OrdTypeOptionalField ordTypeOptional = new OrdTypeOptionalField();

    /**
     * Side of order
     */
    private final SideField side = new SideField();

    /**
     * Indicates if the order was initially received manually (as opposed to electronically)
     */
    private final ManualOrderIndicatorField manualOrderIndicator = new ManualOrderIndicatorField();

    /**
     * Flags message as possible retransmission. This will convey whether a message is an original transmission or duplicate in response to RetransmissionRequest. This will become pertinent when original messages get interleaved with Retransmission responses
     */
    private final PossRetransFlagField possRetransFlag = new PossRetransFlagField();

    /**
     * Indicates total number of leg fills for the spread; Will represent total number of ExecutionReportTradeSpreadLeg messages sent for the spread and will be set to 0 when spread leg fills are consolidated with spread fill
     */
    private final TotalNumSecuritiesField totalNumSecurities = new TotalNumSecuritiesField();

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
     * NoFills Block
     */
    private final FillsGroups fillsGroups = new FillsGroups();

    /**
     * NoLegs Block
     */
    private final TradeAddendumLegsGroups tradeAddendumLegsGroups = new TradeAddendumLegsGroups();

    /**
     * NoOrderEvents Block
     */
    private final SpreadTradeEventsGroups spreadTradeEventsGroups = new SpreadTradeEventsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(seqNum, uuid, execId, senderId, clordid, partyDetailsListReqId, lastPx, orderId, transactTime, sendingTimeEpoch, secExecId, origSecondaryExecutionId, location, securityId, mdTradeEntryId, lastQty, sideTradeId, origSideTradeId, tradeDate, ordStatusTrdCxl, execType, ordTypeOptional, side, manualOrderIndicator, possRetransFlag, totalNumSecurities, execInst, executionMode, liquidityFlag, managedOrder, shortSaleType);

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
     * Unique identifier that allows linking id spread summary fill notice with leg fill notice and trade cancel messages
     *
     * @return the SecExecId field
     */
    public SecExecIdField secExecId() {
        return secExecId;
    }

    /**
     * Unique identifier of the fill which is being corrected
     *
     * @return the OrigSecondaryExecutionId field
     */
    public OrigSecondaryExecutionIdField origSecondaryExecutionId() {
        return origSecondaryExecutionId;
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
     * Market Data Trade Entry ID. This identifier is assigned to all trades that take place for an instrument at a particular price level
     *
     * @return the MdTradeEntryId field
     */
    public MdTradeEntryIdField mdTradeEntryId() {
        return mdTradeEntryId;
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
     * The unique ID assigned to the trade once it is received or matched by the exchange
     *
     * @return the SideTradeId field
     */
    public SideTradeIdField sideTradeId() {
        return sideTradeId;
    }

    /**
     * Refers back to the unique ID assigned to the corrected trade
     *
     * @return the OrigSideTradeId field
     */
    public OrigSideTradeIdField origSideTradeId() {
        return origSideTradeId;
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
     * Identifies status of order as trade cancellation or correction
     *
     * @return the OrdStatusTrdCxl field
     */
    public OrdStatusTrdCxlField ordStatusTrdCxl() {
        return ordStatusTrdCxl;
    }

    /**
     * Describes the specific ExecutionRpt as trade cancellation or correction
     *
     * @return the ExecType field
     */
    public ExecTypeField execType() {
        return execType;
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
     * Indicates total number of leg fills for the spread; Will represent total number of ExecutionReportTradeSpreadLeg messages sent for the spread and will be set to 0 when spread leg fills are consolidated with spread fill
     *
     * @return the TotalNumSecurities field
     */
    public TotalNumSecuritiesField totalNumSecurities() {
        return totalNumSecurities;
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
     * NoFills Block
     *
     * @return the FillsGroups record
     */
    public FillsGroups fillsGroups() {
        return fillsGroups;
    }

    /**
     * NoLegs Block
     *
     * @return the TradeAddendumLegsGroups record
     */
    public TradeAddendumLegsGroups tradeAddendumLegsGroups() {
        return tradeAddendumLegsGroups;
    }

    /**
     * NoOrderEvents Block
     *
     * @return the SpreadTradeEventsGroups record
     */
    public SpreadTradeEventsGroups spreadTradeEventsGroups() {
        return spreadTradeEventsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + fillsGroups.byteLength() - FillsGroups.MINIMUM_BYTE_LENGTH + tradeAddendumLegsGroups.byteLength() - TradeAddendumLegsGroups.MINIMUM_BYTE_LENGTH + spreadTradeEventsGroups.byteLength() - SpreadTradeEventsGroups.MINIMUM_BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 4;
        cursor += 8;
        cursor += 40;
        cursor += 20;
        cursor += 20;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 5;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor = fillsGroups.padding(runs, cursor);
        cursor = tradeAddendumLegsGroups.padding(runs, cursor);
        cursor = spreadTradeEventsGroups.padding(runs, cursor);
        return cursor;
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
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!sendingTimeEpoch.parse(data, cursor)) {
            return false;
        }
        cursor += SendingTimeEpochField.BYTE_LENGTH;
        if (!secExecId.parse(data, cursor)) {
            return false;
        }
        cursor += SecExecIdField.BYTE_LENGTH;
        if (!origSecondaryExecutionId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigSecondaryExecutionIdField.BYTE_LENGTH;
        if (!location.parse(data, cursor)) {
            return false;
        }
        cursor += LocationField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!mdTradeEntryId.parse(data, cursor)) {
            return false;
        }
        cursor += MdTradeEntryIdField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!sideTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += SideTradeIdField.BYTE_LENGTH;
        if (!origSideTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigSideTradeIdField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
        if (!ordStatusTrdCxl.parse(data, cursor)) {
            return false;
        }
        cursor += OrdStatusTrdCxlField.BYTE_LENGTH;
        if (!execType.parse(data, cursor)) {
            return false;
        }
        cursor += ExecTypeField.BYTE_LENGTH;
        if (!ordTypeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeOptionalField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!manualOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        if (!possRetransFlag.parse(data, cursor)) {
            return false;
        }
        cursor += PossRetransFlagField.BYTE_LENGTH;
        if (!totalNumSecurities.parse(data, cursor)) {
            return false;
        }
        cursor += TotalNumSecuritiesField.BYTE_LENGTH;
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
        if (!fillsGroups.parseFrom(data, cursor, end - 6)) {
            return false;
        }
        cursor += fillsGroups.byteLength();
        if (end - cursor < 6) {
            return false;
        }
        if (!tradeAddendumLegsGroups.parseFrom(data, cursor, end - 3)) {
            return false;
        }
        cursor += tradeAddendumLegsGroups.byteLength();
        if (end - cursor < 3) {
            return false;
        }
        if (!spreadTradeEventsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += spreadTradeEventsGroups.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
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
        cursor = transactTime.encode(data, cursor);
        cursor = sendingTimeEpoch.encode(data, cursor);
        cursor = secExecId.encode(data, cursor);
        cursor = origSecondaryExecutionId.encode(data, cursor);
        cursor = location.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = mdTradeEntryId.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = sideTradeId.encode(data, cursor);
        cursor = origSideTradeId.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = ordStatusTrdCxl.encode(data, cursor);
        cursor = execType.encode(data, cursor);
        cursor = ordTypeOptional.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = manualOrderIndicator.encode(data, cursor);
        cursor = possRetransFlag.encode(data, cursor);
        cursor = totalNumSecurities.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = executionMode.encode(data, cursor);
        cursor = liquidityFlag.encode(data, cursor);
        cursor = managedOrder.encode(data, cursor);
        cursor = shortSaleType.encode(data, cursor);
        cursor = fillsGroups.encode(data, cursor);
        cursor = tradeAddendumLegsGroups.encode(data, cursor);
        cursor = spreadTradeEventsGroups.encode(data, cursor);
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
        tradeAddendumLegsGroups.clear();
        spreadTradeEventsGroups.clear();
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
        if (!tradeAddendumLegsGroups.isRecognized()) {
            return false;
        }
        if (!spreadTradeEventsGroups.isRecognized()) {
            return false;
        }
        return true;
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
        if (!tradeAddendumLegsGroups.isValid()) {
            return false;
        }
        if (!spreadTradeEventsGroups.isValid()) {
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
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!sendingTimeEpoch.isDecoded()) {
            return Optional.of(sendingTimeEpoch);
        }
        if (!secExecId.isDecoded()) {
            return Optional.of(secExecId);
        }
        if (!origSecondaryExecutionId.isDecoded()) {
            return Optional.of(origSecondaryExecutionId);
        }
        if (!location.isDecoded()) {
            return Optional.of(location);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!mdTradeEntryId.isDecoded()) {
            return Optional.of(mdTradeEntryId);
        }
        if (!lastQty.isDecoded()) {
            return Optional.of(lastQty);
        }
        if (!sideTradeId.isDecoded()) {
            return Optional.of(sideTradeId);
        }
        if (!origSideTradeId.isDecoded()) {
            return Optional.of(origSideTradeId);
        }
        if (!tradeDate.isDecoded()) {
            return Optional.of(tradeDate);
        }
        if (!ordStatusTrdCxl.isDecoded()) {
            return Optional.of(ordStatusTrdCxl);
        }
        if (!execType.isDecoded()) {
            return Optional.of(execType);
        }
        if (!ordTypeOptional.isDecoded()) {
            return Optional.of(ordTypeOptional);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!manualOrderIndicator.isDecoded()) {
            return Optional.of(manualOrderIndicator);
        }
        if (!possRetransFlag.isDecoded()) {
            return Optional.of(possRetransFlag);
        }
        if (!totalNumSecurities.isDecoded()) {
            return Optional.of(totalNumSecurities);
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
        if (!fillsGroups.isDecoded()) {
            return fillsGroups.failedAt();
        }
        if (!tradeAddendumLegsGroups.isDecoded()) {
            return tradeAddendumLegsGroups.failedAt();
        }
        if (!spreadTradeEventsGroups.isDecoded()) {
            return spreadTradeEventsGroups.failedAt();
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
            case "TransactTime" -> Optional.of(transactTime);
            case "SendingTimeEpoch" -> Optional.of(sendingTimeEpoch);
            case "SecExecId" -> Optional.of(secExecId);
            case "OrigSecondaryExecutionId" -> Optional.of(origSecondaryExecutionId);
            case "Location" -> Optional.of(location);
            case "SecurityId" -> Optional.of(securityId);
            case "MdTradeEntryId" -> Optional.of(mdTradeEntryId);
            case "LastQty" -> Optional.of(lastQty);
            case "SideTradeId" -> Optional.of(sideTradeId);
            case "OrigSideTradeId" -> Optional.of(origSideTradeId);
            case "TradeDate" -> Optional.of(tradeDate);
            case "OrdStatusTrdCxl" -> Optional.of(ordStatusTrdCxl);
            case "ExecType" -> Optional.of(execType);
            case "OrdTypeOptional" -> Optional.of(ordTypeOptional);
            case "Side" -> Optional.of(side);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "PossRetransFlag" -> Optional.of(possRetransFlag);
            case "TotalNumSecurities" -> Optional.of(totalNumSecurities);
            case "ExecInst" -> Optional.of(execInst);
            case "ExecutionMode" -> Optional.of(executionMode);
            case "LiquidityFlag" -> Optional.of(liquidityFlag);
            case "ManagedOrder" -> Optional.of(managedOrder);
            case "ShortSaleType" -> Optional.of(shortSaleType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionReportTradeAddendumSpread message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(fillsGroups.diffFields(message.fillsGroups));
        changed.addAll(tradeAddendumLegsGroups.diffFields(message.tradeAddendumLegsGroups));
        changed.addAll(spreadTradeEventsGroups.diffFields(message.spreadTradeEventsGroups));
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
            tradeAddendumLegsGroups.toFormattedString(builder, options);
            builder.append(", ");
            spreadTradeEventsGroups.toFormattedString(builder, options);
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
        tradeAddendumLegsGroups.toFormattedString(builder, nested);
        spreadTradeEventsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof ExecutionReportTradeAddendumSpread message)) {
            return false;
        }
        return fields.equals(message.fields) && fillsGroups.equals(message.fillsGroups) && tradeAddendumLegsGroups.equals(message.tradeAddendumLegsGroups) && spreadTradeEventsGroups.equals(message.spreadTradeEventsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, fillsGroups, tradeAddendumLegsGroups, spreadTradeEventsGroups);
    }
}
