package omi.cme.globex.ilink3.sbe.v8_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cme.globex.ilink3.sbe.v8_5.fields.DelayDurationField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.DelayToTimeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LastFragmentField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LiquidityFlagField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LocationField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ManualOrderIndicatorField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MarketSegmentIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MassActionOrdTypField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MassActionRejectReasonField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MassActionReportIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MassActionResponseField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MassActionScopeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MassCancelRequestTypeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MassCancelTifField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrderRequestIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PartyDetailsListReqIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PossRetransFlagField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecurityGroupField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecurityIdOptionalField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SenderIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SendingTimeEpochField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SeqNumField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SideOptionalField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SplitMsgField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TotalAffectedOrdersField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TransactTimeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.UuidField;
import omi.cme.globex.ilink3.sbe.v8_5.structs.AffectedOrdersGroups;
import omi.cme.globex.ilink3.sbe.v8_5.types.Field;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;
import omi.cme.globex.ilink3.sbe.v8_5.types.PrintOptions;

/**
 * Represents the OrderMassActionReport message from the iLink3 protocol.
 *
 * <p>An Order Mass Action Report is used to acknowledge an Order Mass Action Request.</p>
 */
public final class OrderMassActionReport implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 117;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Mass Action Report";

    /**
     * Sequence number as assigned to message
     */
    private final SeqNumField seqNum = new SeqNumField();

    /**
     * Session Identifier defined as type long (uInt64); recommended to use timestamp as number of microseconds since epoch (Jan 1, 1970)
     */
    private final UuidField uuid = new UuidField();

    /**
     * Operator ID. Should be unique per Firm ID. Assigned value used to identify specific message originator. Represents last individual or team in charge of the system which modifies the order before submission to the Globex platform, or if not modified from initiator (party role=118), last individual or team in charge of the system, which submit the order to the Globex platform
     */
    private final SenderIdField senderId = new SenderIdField();

    /**
     * Refers to the ID of the related PartyDetailsDefinitionRequest message which will logically be tied to this message
     */
    private final PartyDetailsListReqIdField partyDetailsListReqId = new PartyDetailsListReqIdField();

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
     * Unique ID of Order Mass Action Report as assigned by CME. If fragmented then all messages must have the same value.
     */
    private final MassActionReportIdField massActionReportId = new MassActionReportIdField();

    /**
     * Specifies the Product Group for which working orders should be cancelled. Conditionally required if MassActionScope="Product Group" (Tag1374=10). Will be ignored if present for any other criteria specified in MassActionScope besides Product Group
     */
    private final SecurityGroupField securityGroup = new SecurityGroupField();

    /**
     * Text describing sender's location (i.e. geopraphic location and/or desk)
     */
    private final LocationField location = new LocationField();

    /**
     * Conditionally required if MassActionScope="Instrument" (Tag 1374=1). Will be ignored if present for any other criteria specified in MassActionScope besides Instrument
     */
    private final SecurityIdOptionalField securityIdOptional = new SecurityIdOptionalField();

    /**
     * Not being currently used
     */
    private final DelayDurationField delayDuration = new DelayDurationField();

    /**
     * Specifies the action taken by CME when it received the Order Mass Action Request.
     */
    private final MassActionResponseField massActionResponse = new MassActionResponseField();

    /**
     * Indicates if the order was initially received manually (as opposed to electronically)
     */
    private final ManualOrderIndicatorField manualOrderIndicator = new ManualOrderIndicatorField();

    /**
     * Specifies the scope of the action
     */
    private final MassActionScopeField massActionScope = new MassActionScopeField();

    /**
     * Total number of orders affected by the Order Mass Action Request. Will be returned as zero for rejects or if request is accepted but no orders could be cancelled. If fragmented then this is the sum of NoAffectedOrders across all messages with the same MassActionReportID. Otherwise will have same value as NoAffectedOrders when one or more orders is cancelled.
     */
    private final TotalAffectedOrdersField totalAffectedOrders = new TotalAffectedOrdersField();

    /**
     * Indicates whether the message is the last message in a sequence of messages to support fragmentation
     */
    private final LastFragmentField lastFragment = new LastFragmentField();

    /**
     * Reason Order Mass Action Request was rejected. Required if Mass Action Response=0.
     */
    private final MassActionRejectReasonField massActionRejectReason = new MassActionRejectReasonField();

    /**
     * Specifies the market segment (physical match engine partition) for which working orders should be cancelled. Conditionally Required if MassActionScope="Market Segment" (Tag 1374=9). Will be ignored if present for any other criteria specified in MassActionScope besides Market Segment
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * If present — specifies the scope of the OrderMassActionRequest within the context of Session and Firm. If absent then all orders belonging to Session and Firm combination will be cancelled for specified MassActionScope
     */
    private final MassCancelRequestTypeField massCancelRequestType = new MassCancelRequestTypeField();

    /**
     * If provided then only orders belonging to one side will be cancelled. If absent then orders belonging to both sides will be cancelled
     */
    private final SideOptionalField sideOptional = new SideOptionalField();

    /**
     * If provided then only orders of this type will be cancelled. If absent then all order types will be cancelled
     */
    private final MassActionOrdTypField massActionOrdTyp = new MassActionOrdTypField();

    /**
     * If provided then only orders with this qualifier will be cancelled. If absent then all Day &amp; GT orders will be cancelled
     */
    private final MassCancelTifField massCancelTif = new MassCancelTifField();

    /**
     * Indicates whether a message was delayed as a result of being split among multiple packets (0) or if a message was delayed as a result of TCP re-transmission (1) or if a complete message was delayed due to a previously submitted split or out of order message (2). If absent then the message was not delayed and was neither split nor received out of order
     */
    private final SplitMsgField splitMsg = new SplitMsgField();

    /**
     * New field added to capture if an order was submitted for market making obligation or not. Applicable only for EU fixed income markets
     */
    private final LiquidityFlagField liquidityFlag = new LiquidityFlagField();

    /**
     * Flags message as possible retransmission. This will convey whether a message is an original transmission or duplicate in response to RetransmissionRequest. This will become pertinent when original messages get interleaved with Retransmission responses
     */
    private final PossRetransFlagField possRetransFlag = new PossRetransFlagField();

    /**
     * Indicates the amount of time that a message was delayed as a result of being split (9553=0) or as a result of being out of order due to TCP retransmission (9553=1) or as a result of being queued behind a split message (9553=2). Represented as number of nanoseconds in unix epoch format (since Jan 1, 1970). Subtracting this number from FIFO time will represent original received time of delayed message
     */
    private final DelayToTimeField delayToTime = new DelayToTimeField();

    /**
     * NoAffectedOrders Block
     */
    private final AffectedOrdersGroups affectedOrdersGroups = new AffectedOrdersGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(seqNum, uuid, senderId, partyDetailsListReqId, transactTime, sendingTimeEpoch, orderRequestId, massActionReportId, securityGroup, location, securityIdOptional, delayDuration, massActionResponse, manualOrderIndicator, massActionScope, totalAffectedOrders, lastFragment, massActionRejectReason, marketSegmentId, massCancelRequestType, sideOptional, massActionOrdTyp, massCancelTif, splitMsg, liquidityFlag, possRetransFlag, delayToTime);

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
     * Operator ID. Should be unique per Firm ID. Assigned value used to identify specific message originator. Represents last individual or team in charge of the system which modifies the order before submission to the Globex platform, or if not modified from initiator (party role=118), last individual or team in charge of the system, which submit the order to the Globex platform
     *
     * @return the SenderId field
     */
    public SenderIdField senderId() {
        return senderId;
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
     * Unique ID of Order Mass Action Report as assigned by CME. If fragmented then all messages must have the same value.
     *
     * @return the MassActionReportId field
     */
    public MassActionReportIdField massActionReportId() {
        return massActionReportId;
    }

    /**
     * Specifies the Product Group for which working orders should be cancelled. Conditionally required if MassActionScope="Product Group" (Tag1374=10). Will be ignored if present for any other criteria specified in MassActionScope besides Product Group
     *
     * @return the SecurityGroup field
     */
    public SecurityGroupField securityGroup() {
        return securityGroup;
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
     * Conditionally required if MassActionScope="Instrument" (Tag 1374=1). Will be ignored if present for any other criteria specified in MassActionScope besides Instrument
     *
     * @return the SecurityIdOptional field
     */
    public SecurityIdOptionalField securityIdOptional() {
        return securityIdOptional;
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
     * Specifies the action taken by CME when it received the Order Mass Action Request.
     *
     * @return the MassActionResponse field
     */
    public MassActionResponseField massActionResponse() {
        return massActionResponse;
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
     * Specifies the scope of the action
     *
     * @return the MassActionScope field
     */
    public MassActionScopeField massActionScope() {
        return massActionScope;
    }

    /**
     * Total number of orders affected by the Order Mass Action Request. Will be returned as zero for rejects or if request is accepted but no orders could be cancelled. If fragmented then this is the sum of NoAffectedOrders across all messages with the same MassActionReportID. Otherwise will have same value as NoAffectedOrders when one or more orders is cancelled.
     *
     * @return the TotalAffectedOrders field
     */
    public TotalAffectedOrdersField totalAffectedOrders() {
        return totalAffectedOrders;
    }

    /**
     * Indicates whether the message is the last message in a sequence of messages to support fragmentation
     *
     * @return the LastFragment field
     */
    public LastFragmentField lastFragment() {
        return lastFragment;
    }

    /**
     * Reason Order Mass Action Request was rejected. Required if Mass Action Response=0.
     *
     * @return the MassActionRejectReason field
     */
    public MassActionRejectReasonField massActionRejectReason() {
        return massActionRejectReason;
    }

    /**
     * Specifies the market segment (physical match engine partition) for which working orders should be cancelled. Conditionally Required if MassActionScope="Market Segment" (Tag 1374=9). Will be ignored if present for any other criteria specified in MassActionScope besides Market Segment
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * If present — specifies the scope of the OrderMassActionRequest within the context of Session and Firm. If absent then all orders belonging to Session and Firm combination will be cancelled for specified MassActionScope
     *
     * @return the MassCancelRequestType field
     */
    public MassCancelRequestTypeField massCancelRequestType() {
        return massCancelRequestType;
    }

    /**
     * If provided then only orders belonging to one side will be cancelled. If absent then orders belonging to both sides will be cancelled
     *
     * @return the SideOptional field
     */
    public SideOptionalField sideOptional() {
        return sideOptional;
    }

    /**
     * If provided then only orders of this type will be cancelled. If absent then all order types will be cancelled
     *
     * @return the MassActionOrdTyp field
     */
    public MassActionOrdTypField massActionOrdTyp() {
        return massActionOrdTyp;
    }

    /**
     * If provided then only orders with this qualifier will be cancelled. If absent then all Day &amp; GT orders will be cancelled
     *
     * @return the MassCancelTif field
     */
    public MassCancelTifField massCancelTif() {
        return massCancelTif;
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
     * New field added to capture if an order was submitted for market making obligation or not. Applicable only for EU fixed income markets
     *
     * @return the LiquidityFlag field
     */
    public LiquidityFlagField liquidityFlag() {
        return liquidityFlag;
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
     * Indicates the amount of time that a message was delayed as a result of being split (9553=0) or as a result of being out of order due to TCP retransmission (9553=1) or as a result of being queued behind a split message (9553=2). Represented as number of nanoseconds in unix epoch format (since Jan 1, 1970). Subtracting this number from FIFO time will represent original received time of delayed message
     *
     * @return the DelayToTime field
     */
    public DelayToTimeField delayToTime() {
        return delayToTime;
    }

    /**
     * NoAffectedOrders Block
     *
     * @return the AffectedOrdersGroups record
     */
    public AffectedOrdersGroups affectedOrdersGroups() {
        return affectedOrdersGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + affectedOrdersGroups.byteLength() - AffectedOrdersGroups.MINIMUM_BYTE_LENGTH;
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
        cursor += 20;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 6;
        cursor += 5;
        cursor += 4;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 4;
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
        cursor += 8;
        cursor = affectedOrdersGroups.padding(runs, cursor);
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
        if (!senderId.parse(data, cursor)) {
            return false;
        }
        cursor += SenderIdField.BYTE_LENGTH;
        if (!partyDetailsListReqId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyDetailsListReqIdField.BYTE_LENGTH;
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
        if (!massActionReportId.parse(data, cursor)) {
            return false;
        }
        cursor += MassActionReportIdField.BYTE_LENGTH;
        if (!securityGroup.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityGroupField.BYTE_LENGTH;
        if (!location.parse(data, cursor)) {
            return false;
        }
        cursor += LocationField.BYTE_LENGTH;
        if (!securityIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdOptionalField.BYTE_LENGTH;
        if (!delayDuration.parse(data, cursor)) {
            return false;
        }
        cursor += DelayDurationField.BYTE_LENGTH;
        if (!massActionResponse.parse(data, cursor)) {
            return false;
        }
        cursor += MassActionResponseField.BYTE_LENGTH;
        if (!manualOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        if (!massActionScope.parse(data, cursor)) {
            return false;
        }
        cursor += MassActionScopeField.BYTE_LENGTH;
        if (!totalAffectedOrders.parse(data, cursor)) {
            return false;
        }
        cursor += TotalAffectedOrdersField.BYTE_LENGTH;
        if (!lastFragment.parse(data, cursor)) {
            return false;
        }
        cursor += LastFragmentField.BYTE_LENGTH;
        if (!massActionRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += MassActionRejectReasonField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!massCancelRequestType.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelRequestTypeField.BYTE_LENGTH;
        if (!sideOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SideOptionalField.BYTE_LENGTH;
        if (!massActionOrdTyp.parse(data, cursor)) {
            return false;
        }
        cursor += MassActionOrdTypField.BYTE_LENGTH;
        if (!massCancelTif.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelTifField.BYTE_LENGTH;
        if (!splitMsg.parse(data, cursor)) {
            return false;
        }
        cursor += SplitMsgField.BYTE_LENGTH;
        if (!liquidityFlag.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityFlagField.BYTE_LENGTH;
        if (!possRetransFlag.parse(data, cursor)) {
            return false;
        }
        cursor += PossRetransFlagField.BYTE_LENGTH;
        if (!delayToTime.parse(data, cursor)) {
            return false;
        }
        cursor += DelayToTimeField.BYTE_LENGTH;
        if (!affectedOrdersGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += affectedOrdersGroups.byteLength();
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
        cursor = senderId.encode(data, cursor);
        cursor = partyDetailsListReqId.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = sendingTimeEpoch.encode(data, cursor);
        cursor = orderRequestId.encode(data, cursor);
        cursor = massActionReportId.encode(data, cursor);
        cursor = securityGroup.encode(data, cursor);
        cursor = location.encode(data, cursor);
        cursor = securityIdOptional.encode(data, cursor);
        cursor = delayDuration.encode(data, cursor);
        cursor = massActionResponse.encode(data, cursor);
        cursor = manualOrderIndicator.encode(data, cursor);
        cursor = massActionScope.encode(data, cursor);
        cursor = totalAffectedOrders.encode(data, cursor);
        cursor = lastFragment.encode(data, cursor);
        cursor = massActionRejectReason.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = massCancelRequestType.encode(data, cursor);
        cursor = sideOptional.encode(data, cursor);
        cursor = massActionOrdTyp.encode(data, cursor);
        cursor = massCancelTif.encode(data, cursor);
        cursor = splitMsg.encode(data, cursor);
        cursor = liquidityFlag.encode(data, cursor);
        cursor = possRetransFlag.encode(data, cursor);
        cursor = delayToTime.encode(data, cursor);
        cursor = affectedOrdersGroups.encode(data, cursor);
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
        affectedOrdersGroups.clear();
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
        if (!affectedOrdersGroups.isRecognized()) {
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
        if (!affectedOrdersGroups.isValid()) {
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
        if (!senderId.isDecoded()) {
            return Optional.of(senderId);
        }
        if (!partyDetailsListReqId.isDecoded()) {
            return Optional.of(partyDetailsListReqId);
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
        if (!massActionReportId.isDecoded()) {
            return Optional.of(massActionReportId);
        }
        if (!securityGroup.isDecoded()) {
            return Optional.of(securityGroup);
        }
        if (!location.isDecoded()) {
            return Optional.of(location);
        }
        if (!securityIdOptional.isDecoded()) {
            return Optional.of(securityIdOptional);
        }
        if (!delayDuration.isDecoded()) {
            return Optional.of(delayDuration);
        }
        if (!massActionResponse.isDecoded()) {
            return Optional.of(massActionResponse);
        }
        if (!manualOrderIndicator.isDecoded()) {
            return Optional.of(manualOrderIndicator);
        }
        if (!massActionScope.isDecoded()) {
            return Optional.of(massActionScope);
        }
        if (!totalAffectedOrders.isDecoded()) {
            return Optional.of(totalAffectedOrders);
        }
        if (!lastFragment.isDecoded()) {
            return Optional.of(lastFragment);
        }
        if (!massActionRejectReason.isDecoded()) {
            return Optional.of(massActionRejectReason);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!massCancelRequestType.isDecoded()) {
            return Optional.of(massCancelRequestType);
        }
        if (!sideOptional.isDecoded()) {
            return Optional.of(sideOptional);
        }
        if (!massActionOrdTyp.isDecoded()) {
            return Optional.of(massActionOrdTyp);
        }
        if (!massCancelTif.isDecoded()) {
            return Optional.of(massCancelTif);
        }
        if (!splitMsg.isDecoded()) {
            return Optional.of(splitMsg);
        }
        if (!liquidityFlag.isDecoded()) {
            return Optional.of(liquidityFlag);
        }
        if (!possRetransFlag.isDecoded()) {
            return Optional.of(possRetransFlag);
        }
        if (!delayToTime.isDecoded()) {
            return Optional.of(delayToTime);
        }
        if (!affectedOrdersGroups.isDecoded()) {
            return affectedOrdersGroups.failedAt();
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
            case "SenderId" -> Optional.of(senderId);
            case "PartyDetailsListReqId" -> Optional.of(partyDetailsListReqId);
            case "TransactTime" -> Optional.of(transactTime);
            case "SendingTimeEpoch" -> Optional.of(sendingTimeEpoch);
            case "OrderRequestId" -> Optional.of(orderRequestId);
            case "MassActionReportId" -> Optional.of(massActionReportId);
            case "SecurityGroup" -> Optional.of(securityGroup);
            case "Location" -> Optional.of(location);
            case "SecurityIdOptional" -> Optional.of(securityIdOptional);
            case "DelayDuration" -> Optional.of(delayDuration);
            case "MassActionResponse" -> Optional.of(massActionResponse);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "MassActionScope" -> Optional.of(massActionScope);
            case "TotalAffectedOrders" -> Optional.of(totalAffectedOrders);
            case "LastFragment" -> Optional.of(lastFragment);
            case "MassActionRejectReason" -> Optional.of(massActionRejectReason);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "MassCancelRequestType" -> Optional.of(massCancelRequestType);
            case "SideOptional" -> Optional.of(sideOptional);
            case "MassActionOrdTyp" -> Optional.of(massActionOrdTyp);
            case "MassCancelTif" -> Optional.of(massCancelTif);
            case "SplitMsg" -> Optional.of(splitMsg);
            case "LiquidityFlag" -> Optional.of(liquidityFlag);
            case "PossRetransFlag" -> Optional.of(possRetransFlag);
            case "DelayToTime" -> Optional.of(delayToTime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderMassActionReport message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(affectedOrdersGroups.diffFields(message.affectedOrdersGroups));
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
            affectedOrdersGroups.toFormattedString(builder, options);
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
        affectedOrdersGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof OrderMassActionReport message)) {
            return false;
        }
        return fields.equals(message.fields) && affectedOrdersGroups.equals(message.affectedOrdersGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, affectedOrdersGroups);
    }
}
