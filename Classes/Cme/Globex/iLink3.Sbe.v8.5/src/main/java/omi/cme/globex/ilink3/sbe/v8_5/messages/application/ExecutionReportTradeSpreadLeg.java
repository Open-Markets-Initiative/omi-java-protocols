package omi.cme.globex.ilink3.sbe.v8_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ClordidField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.CumQtyField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ExecIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LastPxField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LastQtyField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LocationField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrdStatusTrdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrdTypeOptionalField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrderIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PartyDetailsListReqIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PossRetransFlagField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecExecIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecurityIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SenderIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SendingTimeEpochField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SeqNumField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SideField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SideTradeIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TradeDateField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TransactTimeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.UnderlyingPxField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.UuidField;
import omi.cme.globex.ilink3.sbe.v8_5.structs.FillsGroups;
import omi.cme.globex.ilink3.sbe.v8_5.structs.OptionDelta;
import omi.cme.globex.ilink3.sbe.v8_5.structs.RiskFreeRate;
import omi.cme.globex.ilink3.sbe.v8_5.structs.SpreadLegOrderEventsGroups;
import omi.cme.globex.ilink3.sbe.v8_5.structs.TimeToExpiration;
import omi.cme.globex.ilink3.sbe.v8_5.structs.Volatility;
import omi.cme.globex.ilink3.sbe.v8_5.types.Field;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;
import omi.cme.globex.ilink3.sbe.v8_5.types.PrintOptions;

/**
 * Represents the ExecutionReportTradeSpreadLeg message from the iLink3 protocol.
 *
 * <p>The Execution Report - Trade Spread Leg message is sent upon fill or partial fill of a client order for spread leg instruments.</p>
 */
public final class ExecutionReportTradeSpreadLeg implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 205;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Execution Report Trade Spread Leg";

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
     * Underlying price associated with a derivative instrument. Price for the future used in calculating the conversion of vol. to premium for the option. Only applicable for vol quoted option trades.
     */
    private final UnderlyingPxField underlyingPx = new UnderlyingPxField();

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
     * Text describing sender's location (i.e. geopraphic location and/or desk)
     */
    private final LocationField location = new LocationField();

    /**
     * Security ID as defined by CME. For the security ID list, see the security definition messages
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Quantity of shares bought/sold on this (last) fill
     */
    private final LastQtyField lastQty = new LastQtyField();

    /**
     * Total quantity filled
     */
    private final CumQtyField cumQty = new CumQtyField();

    /**
     * The unique ID assigned to the trade once it is received or matched by the exchange
     */
    private final SideTradeIdField sideTradeId = new SideTradeIdField();

    /**
     * Indicates date of trading day (expressed in local time at place of trade).
     */
    private final TradeDateField tradeDate = new TradeDateField();

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
     * Flags message as possible retransmission. This will convey whether a message is an original transmission or duplicate in response to RetransmissionRequest. This will become pertinent when original messages get interleaved with Retransmission responses
     */
    private final PossRetransFlagField possRetransFlag = new PossRetransFlagField();

    /**
     * ExecutionReportTradeSpreadLeg
     */
    private final Volatility volatility = new Volatility();

    /**
     * ExecutionReportTradeSpreadLeg
     */
    private final OptionDelta optionDelta = new OptionDelta();

    /**
     * ExecutionReportTradeSpreadLeg
     */
    private final TimeToExpiration timeToExpiration = new TimeToExpiration();

    /**
     * ExecutionReportTradeSpreadLeg
     */
    private final RiskFreeRate riskFreeRate = new RiskFreeRate();

    /**
     * NoFills Block
     */
    private final FillsGroups fillsGroups = new FillsGroups();

    /**
     * NoOrderEvents Block
     */
    private final SpreadLegOrderEventsGroups spreadLegOrderEventsGroups = new SpreadLegOrderEventsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(seqNum), List.<Field>of(uuid), List.<Field>of(execId), List.<Field>of(senderId), List.<Field>of(clordid), volatility.fields(), List.<Field>of(partyDetailsListReqId), List.<Field>of(lastPx), List.<Field>of(orderId), List.<Field>of(underlyingPx), List.<Field>of(transactTime), List.<Field>of(sendingTimeEpoch), List.<Field>of(secExecId), List.<Field>of(location), optionDelta.fields(), timeToExpiration.fields(), riskFreeRate.fields(), List.<Field>of(securityId), List.<Field>of(lastQty), List.<Field>of(cumQty), List.<Field>of(sideTradeId), List.<Field>of(tradeDate), List.<Field>of(ordStatusTrd), List.<Field>of(ordTypeOptional), List.<Field>of(side), List.<Field>of(possRetransFlag)).flatMap(List::stream).toList();

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
     * Underlying price associated with a derivative instrument. Price for the future used in calculating the conversion of vol. to premium for the option. Only applicable for vol quoted option trades.
     *
     * @return the UnderlyingPx field
     */
    public UnderlyingPxField underlyingPx() {
        return underlyingPx;
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
     * The unique ID assigned to the trade once it is received or matched by the exchange
     *
     * @return the SideTradeId field
     */
    public SideTradeIdField sideTradeId() {
        return sideTradeId;
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
     * Flags message as possible retransmission. This will convey whether a message is an original transmission or duplicate in response to RetransmissionRequest. This will become pertinent when original messages get interleaved with Retransmission responses
     *
     * @return the PossRetransFlag field
     */
    public PossRetransFlagField possRetransFlag() {
        return possRetransFlag;
    }

    /**
     * ExecutionReportTradeSpreadLeg
     *
     * @return the Volatility record
     */
    public Volatility volatility() {
        return volatility;
    }

    /**
     * ExecutionReportTradeSpreadLeg
     *
     * @return the OptionDelta record
     */
    public OptionDelta optionDelta() {
        return optionDelta;
    }

    /**
     * ExecutionReportTradeSpreadLeg
     *
     * @return the TimeToExpiration record
     */
    public TimeToExpiration timeToExpiration() {
        return timeToExpiration;
    }

    /**
     * ExecutionReportTradeSpreadLeg
     *
     * @return the RiskFreeRate record
     */
    public RiskFreeRate riskFreeRate() {
        return riskFreeRate;
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
     * @return the SpreadLegOrderEventsGroups record
     */
    public SpreadLegOrderEventsGroups spreadLegOrderEventsGroups() {
        return spreadLegOrderEventsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + fillsGroups.byteLength() - FillsGroups.MINIMUM_BYTE_LENGTH + spreadLegOrderEventsGroups.byteLength() - SpreadLegOrderEventsGroups.MINIMUM_BYTE_LENGTH;
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
        for (int[] run = Volatility.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += Volatility.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 5;
        for (int[] run = OptionDelta.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += OptionDelta.BYTE_LENGTH;
        for (int[] run = TimeToExpiration.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += TimeToExpiration.BYTE_LENGTH;
        for (int[] run = RiskFreeRate.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RiskFreeRate.BYTE_LENGTH;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor = fillsGroups.padding(runs, cursor);
        cursor = spreadLegOrderEventsGroups.padding(runs, cursor);
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
        if (!volatility.parseFrom(data, cursor, end - 104)) {
            return false;
        }
        cursor += volatility.byteLength();
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
        if (!underlyingPx.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingPxField.BYTE_LENGTH;
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
        if (!location.parse(data, cursor)) {
            return false;
        }
        cursor += LocationField.BYTE_LENGTH;
        if (!optionDelta.parseFrom(data, cursor, end - 38)) {
            return false;
        }
        cursor += optionDelta.byteLength();
        if (!timeToExpiration.parseFrom(data, cursor, end - 33)) {
            return false;
        }
        cursor += timeToExpiration.byteLength();
        if (!riskFreeRate.parseFrom(data, cursor, end - 28)) {
            return false;
        }
        cursor += riskFreeRate.byteLength();
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!lastQty.parse(data, cursor)) {
            return false;
        }
        cursor += LastQtyField.BYTE_LENGTH;
        if (!cumQty.parse(data, cursor)) {
            return false;
        }
        cursor += CumQtyField.BYTE_LENGTH;
        if (!sideTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += SideTradeIdField.BYTE_LENGTH;
        if (!tradeDate.parse(data, cursor)) {
            return false;
        }
        cursor += TradeDateField.BYTE_LENGTH;
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
        if (!possRetransFlag.parse(data, cursor)) {
            return false;
        }
        cursor += PossRetransFlagField.BYTE_LENGTH;
        if (!fillsGroups.parseFrom(data, cursor, end - 3)) {
            return false;
        }
        cursor += fillsGroups.byteLength();
        if (end - cursor < 3) {
            return false;
        }
        if (!spreadLegOrderEventsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += spreadLegOrderEventsGroups.byteLength();
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
        cursor = volatility.encode(data, cursor);
        cursor = partyDetailsListReqId.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = underlyingPx.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = sendingTimeEpoch.encode(data, cursor);
        cursor = secExecId.encode(data, cursor);
        cursor = location.encode(data, cursor);
        cursor = optionDelta.encode(data, cursor);
        cursor = timeToExpiration.encode(data, cursor);
        cursor = riskFreeRate.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = lastQty.encode(data, cursor);
        cursor = cumQty.encode(data, cursor);
        cursor = sideTradeId.encode(data, cursor);
        cursor = tradeDate.encode(data, cursor);
        cursor = ordStatusTrd.encode(data, cursor);
        cursor = ordTypeOptional.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = possRetransFlag.encode(data, cursor);
        cursor = fillsGroups.encode(data, cursor);
        cursor = spreadLegOrderEventsGroups.encode(data, cursor);
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
        volatility.clear();
        optionDelta.clear();
        timeToExpiration.clear();
        riskFreeRate.clear();
        fillsGroups.clear();
        spreadLegOrderEventsGroups.clear();
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
        if (!spreadLegOrderEventsGroups.isRecognized()) {
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
        if (!spreadLegOrderEventsGroups.isValid()) {
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
        if (!volatility.isDecoded()) {
            return volatility.failedAt();
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
        if (!underlyingPx.isDecoded()) {
            return Optional.of(underlyingPx);
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
        if (!location.isDecoded()) {
            return Optional.of(location);
        }
        if (!optionDelta.isDecoded()) {
            return optionDelta.failedAt();
        }
        if (!timeToExpiration.isDecoded()) {
            return timeToExpiration.failedAt();
        }
        if (!riskFreeRate.isDecoded()) {
            return riskFreeRate.failedAt();
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!lastQty.isDecoded()) {
            return Optional.of(lastQty);
        }
        if (!cumQty.isDecoded()) {
            return Optional.of(cumQty);
        }
        if (!sideTradeId.isDecoded()) {
            return Optional.of(sideTradeId);
        }
        if (!tradeDate.isDecoded()) {
            return Optional.of(tradeDate);
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
        if (!possRetransFlag.isDecoded()) {
            return Optional.of(possRetransFlag);
        }
        if (!fillsGroups.isDecoded()) {
            return fillsGroups.failedAt();
        }
        if (!spreadLegOrderEventsGroups.isDecoded()) {
            return spreadLegOrderEventsGroups.failedAt();
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
            case "UnderlyingPx" -> Optional.of(underlyingPx);
            case "TransactTime" -> Optional.of(transactTime);
            case "SendingTimeEpoch" -> Optional.of(sendingTimeEpoch);
            case "SecExecId" -> Optional.of(secExecId);
            case "Location" -> Optional.of(location);
            case "SecurityId" -> Optional.of(securityId);
            case "LastQty" -> Optional.of(lastQty);
            case "CumQty" -> Optional.of(cumQty);
            case "SideTradeId" -> Optional.of(sideTradeId);
            case "TradeDate" -> Optional.of(tradeDate);
            case "OrdStatusTrd" -> Optional.of(ordStatusTrd);
            case "OrdTypeOptional" -> Optional.of(ordTypeOptional);
            case "Side" -> Optional.of(side);
            case "PossRetransFlag" -> Optional.of(possRetransFlag);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExecutionReportTradeSpreadLeg message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(fillsGroups.diffFields(message.fillsGroups));
        changed.addAll(spreadLegOrderEventsGroups.diffFields(message.spreadLegOrderEventsGroups));
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
            spreadLegOrderEventsGroups.toFormattedString(builder, options);
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
        spreadLegOrderEventsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof ExecutionReportTradeSpreadLeg message)) {
            return false;
        }
        return fields.equals(message.fields) && fillsGroups.equals(message.fillsGroups) && spreadLegOrderEventsGroups.equals(message.spreadLegOrderEventsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, fillsGroups, spreadLegOrderEventsGroups);
    }
}
