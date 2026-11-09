package omi.cme.globex.ilink3.sbe.v8_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cme.globex.ilink3.sbe.v8_5.fields.AvgPxGroupIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.AvgPxIndicatorField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ClearingAccountTypeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ClearingTradePriceTypeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.CmtaGiveupCdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.CustOrderCapacityField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.CustOrderHandlingInstField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ExecutorField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.IdmShortCodeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ListUpdateActionField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MemoField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PartyDetailDefinitionStatusField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PartyDetailRequestStatusField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PartyDetailsListReqIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PossRetransFlagField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SelfMatchPreventionIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SelfMatchPreventionInstructionField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SendingTimeEpochField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SeqNumField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SplitMsgField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.UuidField;
import omi.cme.globex.ilink3.sbe.v8_5.structs.PartyDetailsGroups;
import omi.cme.globex.ilink3.sbe.v8_5.structs.TrdRegPublicationsGroups;
import omi.cme.globex.ilink3.sbe.v8_5.types.Field;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;
import omi.cme.globex.ilink3.sbe.v8_5.types.PrintOptions;

/**
 * Represents the PartyDetailsDefinitionRequestAck message from the iLink3 protocol.
 *
 * <p>Used to respond to the Party Details Definition Request message indicating whether the request has been accepted.</p>
 */
public final class PartyDetailsDefinitionRequestAck implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 165;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Party Details Definition Request Ack";

    /**
     * Sequence number as assigned to message
     */
    private final SeqNumField seqNum = new SeqNumField();

    /**
     * Session Identifier defined as type long (uInt64); recommended to use timestamp as number of microseconds since epoch (Jan 1, 1970)
     */
    private final UuidField uuid = new UuidField();

    /**
     * This general purpose text field could be mapped from iLink to Clearing STP for trades. Not available for use with the short format where PartyDetailsListRequestID not equal to FFFFFFFF. Available for use only with the long format where PartyDetailsListRequestID=FFFFFFFF
     */
    private final MemoField memo = new MemoField();

    /**
     * Used by submitting firm to group trades being allocated into an average price group. The trades in average price group will be used to calculate an average price for the group
     */
    private final AvgPxGroupIdField avgPxGroupId = new AvgPxGroupIdField();

    /**
     * Refers to the ID of the related PartyDetailsDefinitionRequest message which will logically be tied to this message
     */
    private final PartyDetailsListReqIdField partyDetailsListReqId = new PartyDetailsListReqIdField();

    /**
     * Time when the message is sent. 64-bit integer expressing the number of nano seconds since midnight January 1, 1970.
     */
    private final SendingTimeEpochField sendingTimeEpoch = new SendingTimeEpochField();

    /**
     * Identifies an order or trade that should not be matched to an opposite order or trade if both buy and sell orders for the same asset contain the same SelfMatchPreventionID (2362) and submitted by the same firm
     */
    private final SelfMatchPreventionIdField selfMatchPreventionId = new SelfMatchPreventionIdField();

    /**
     * Status of party details definition request
     */
    private final PartyDetailRequestStatusField partyDetailRequestStatus = new PartyDetailRequestStatusField();

    /**
     * Capacity of customer placing the order. Used by futures exchanges to indicate the CTICode (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission)
     */
    private final CustOrderCapacityField custOrderCapacity = new CustOrderCapacityField();

    /**
     * Designates the account type to be used for the order when submitted to clearing
     */
    private final ClearingAccountTypeField clearingAccountType = new ClearingAccountTypeField();

    /**
     * Used to act upon the outcome when a self-match is detected and an order is prevented from trading against another order with the same SelfMatchPreventionID (Tag 2362). 1=Cancel newest signifies that incoming order is cancelled. 2=Cancel Oldest signifies that the resting order is cancelled. Absence of this field (with Tag 2362) is interpreted as cancel oldest
     */
    private final SelfMatchPreventionInstructionField selfMatchPreventionInstruction = new SelfMatchPreventionInstructionField();

    /**
     * Average pricing indicator
     */
    private final AvgPxIndicatorField avgPxIndicator = new AvgPxIndicatorField();

    /**
     * Indicates to recipient whether trade is clearing at execution prices LastPx (tag 31) or alternate clearing price (prior day settlement price)
     */
    private final ClearingTradePriceTypeField clearingTradePriceType = new ClearingTradePriceTypeField();

    /**
     * Indicates if the order is a give-up or SGX offset. Reject if greater than max length or not containing valid value.
     */
    private final CmtaGiveupCdField cmtaGiveupCd = new CmtaGiveupCdField();

    /**
     * Codes that apply special information that the Broker / Dealer needs to report, as specified by the customer. Defines source of the order
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

    /**
     * Indicates if all of the information sent in this message with a unique new PartyDetailsListRequestID is a new addition or deletion of existing information associated with an existing PartyDetailsListRequestID. For PartyDetailsListRequestID=FFFFFFFF this should always be set to "A"
     */
    private final ListUpdateActionField listUpdateAction = new ListUpdateActionField();

    /**
     * Status of party detail definition for one party
     */
    private final PartyDetailDefinitionStatusField partyDetailDefinitionStatus = new PartyDetailDefinitionStatusField();

    /**
     * Will be populated with a short code for the person or algo identified in FIX tag 5392 which will be mapped to National ID or Algo at reporting time. Applicable for EU fixed income markets only
     */
    private final ExecutorField executor = new ExecutorField();

    /**
     * Represents the Investment Decision Maker Short Code. Applicable for EU fixed income markets only
     */
    private final IdmShortCodeField idmShortCode = new IdmShortCodeField();

    /**
     * Flags message as possible retransmission. This will convey whether a message is an original transmission or duplicate in response to RetransmissionRequest. This will become pertinent when original messages get interleaved with Retransmission responses
     */
    private final PossRetransFlagField possRetransFlag = new PossRetransFlagField();

    /**
     * Indicates whether a message was delayed as a result of being split among multiple packets (0) or if a message was delayed as a result of TCP re-transmission (1) or if a complete message was delayed due to a previously submitted split or out of order message (2). If absent then the message was not delayed and was neither split nor received out of order
     */
    private final SplitMsgField splitMsg = new SplitMsgField();

    /**
     * NoPartyDetails Block
     */
    private final PartyDetailsGroups partyDetailsGroups = new PartyDetailsGroups();

    /**
     * NoTrdRegPublications Block
     */
    private final TrdRegPublicationsGroups trdRegPublicationsGroups = new TrdRegPublicationsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(seqNum, uuid, memo, avgPxGroupId, partyDetailsListReqId, sendingTimeEpoch, selfMatchPreventionId, partyDetailRequestStatus, custOrderCapacity, clearingAccountType, selfMatchPreventionInstruction, avgPxIndicator, clearingTradePriceType, cmtaGiveupCd, custOrderHandlingInst, listUpdateAction, partyDetailDefinitionStatus, executor, idmShortCode, possRetransFlag, splitMsg);

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
     * This general purpose text field could be mapped from iLink to Clearing STP for trades. Not available for use with the short format where PartyDetailsListRequestID not equal to FFFFFFFF. Available for use only with the long format where PartyDetailsListRequestID=FFFFFFFF
     *
     * @return the Memo field
     */
    public MemoField memo() {
        return memo;
    }

    /**
     * Used by submitting firm to group trades being allocated into an average price group. The trades in average price group will be used to calculate an average price for the group
     *
     * @return the AvgPxGroupId field
     */
    public AvgPxGroupIdField avgPxGroupId() {
        return avgPxGroupId;
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
     * Time when the message is sent. 64-bit integer expressing the number of nano seconds since midnight January 1, 1970.
     *
     * @return the SendingTimeEpoch field
     */
    public SendingTimeEpochField sendingTimeEpoch() {
        return sendingTimeEpoch;
    }

    /**
     * Identifies an order or trade that should not be matched to an opposite order or trade if both buy and sell orders for the same asset contain the same SelfMatchPreventionID (2362) and submitted by the same firm
     *
     * @return the SelfMatchPreventionId field
     */
    public SelfMatchPreventionIdField selfMatchPreventionId() {
        return selfMatchPreventionId;
    }

    /**
     * Status of party details definition request
     *
     * @return the PartyDetailRequestStatus field
     */
    public PartyDetailRequestStatusField partyDetailRequestStatus() {
        return partyDetailRequestStatus;
    }

    /**
     * Capacity of customer placing the order. Used by futures exchanges to indicate the CTICode (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission)
     *
     * @return the CustOrderCapacity field
     */
    public CustOrderCapacityField custOrderCapacity() {
        return custOrderCapacity;
    }

    /**
     * Designates the account type to be used for the order when submitted to clearing
     *
     * @return the ClearingAccountType field
     */
    public ClearingAccountTypeField clearingAccountType() {
        return clearingAccountType;
    }

    /**
     * Used to act upon the outcome when a self-match is detected and an order is prevented from trading against another order with the same SelfMatchPreventionID (Tag 2362). 1=Cancel newest signifies that incoming order is cancelled. 2=Cancel Oldest signifies that the resting order is cancelled. Absence of this field (with Tag 2362) is interpreted as cancel oldest
     *
     * @return the SelfMatchPreventionInstruction field
     */
    public SelfMatchPreventionInstructionField selfMatchPreventionInstruction() {
        return selfMatchPreventionInstruction;
    }

    /**
     * Average pricing indicator
     *
     * @return the AvgPxIndicator field
     */
    public AvgPxIndicatorField avgPxIndicator() {
        return avgPxIndicator;
    }

    /**
     * Indicates to recipient whether trade is clearing at execution prices LastPx (tag 31) or alternate clearing price (prior day settlement price)
     *
     * @return the ClearingTradePriceType field
     */
    public ClearingTradePriceTypeField clearingTradePriceType() {
        return clearingTradePriceType;
    }

    /**
     * Indicates if the order is a give-up or SGX offset. Reject if greater than max length or not containing valid value.
     *
     * @return the CmtaGiveupCd field
     */
    public CmtaGiveupCdField cmtaGiveupCd() {
        return cmtaGiveupCd;
    }

    /**
     * Codes that apply special information that the Broker / Dealer needs to report, as specified by the customer. Defines source of the order
     *
     * @return the CustOrderHandlingInst field
     */
    public CustOrderHandlingInstField custOrderHandlingInst() {
        return custOrderHandlingInst;
    }

    /**
     * Indicates if all of the information sent in this message with a unique new PartyDetailsListRequestID is a new addition or deletion of existing information associated with an existing PartyDetailsListRequestID. For PartyDetailsListRequestID=FFFFFFFF this should always be set to "A"
     *
     * @return the ListUpdateAction field
     */
    public ListUpdateActionField listUpdateAction() {
        return listUpdateAction;
    }

    /**
     * Status of party detail definition for one party
     *
     * @return the PartyDetailDefinitionStatus field
     */
    public PartyDetailDefinitionStatusField partyDetailDefinitionStatus() {
        return partyDetailDefinitionStatus;
    }

    /**
     * Will be populated with a short code for the person or algo identified in FIX tag 5392 which will be mapped to National ID or Algo at reporting time. Applicable for EU fixed income markets only
     *
     * @return the Executor field
     */
    public ExecutorField executor() {
        return executor;
    }

    /**
     * Represents the Investment Decision Maker Short Code. Applicable for EU fixed income markets only
     *
     * @return the IdmShortCode field
     */
    public IdmShortCodeField idmShortCode() {
        return idmShortCode;
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
     * NoPartyDetails Block
     *
     * @return the PartyDetailsGroups record
     */
    public PartyDetailsGroups partyDetailsGroups() {
        return partyDetailsGroups;
    }

    /**
     * NoTrdRegPublications Block
     *
     * @return the TrdRegPublicationsGroups record
     */
    public TrdRegPublicationsGroups trdRegPublicationsGroups() {
        return trdRegPublicationsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + partyDetailsGroups.byteLength() - PartyDetailsGroups.MINIMUM_BYTE_LENGTH + trdRegPublicationsGroups.byteLength() - TrdRegPublicationsGroups.MINIMUM_BYTE_LENGTH;
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
        cursor += 75;
        cursor += 20;
        cursor += 8;
        cursor += 8;
        cursor += 8;
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
        cursor += 8;
        cursor += 1;
        cursor += 1;
        cursor = partyDetailsGroups.padding(runs, cursor);
        cursor = trdRegPublicationsGroups.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(sendingTimeEpoch.value());
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
        if (!memo.parse(data, cursor)) {
            return false;
        }
        cursor += MemoField.BYTE_LENGTH;
        if (!avgPxGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += AvgPxGroupIdField.BYTE_LENGTH;
        if (!partyDetailsListReqId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyDetailsListReqIdField.BYTE_LENGTH;
        if (!sendingTimeEpoch.parse(data, cursor)) {
            return false;
        }
        cursor += SendingTimeEpochField.BYTE_LENGTH;
        if (!selfMatchPreventionId.parse(data, cursor)) {
            return false;
        }
        cursor += SelfMatchPreventionIdField.BYTE_LENGTH;
        if (!partyDetailRequestStatus.parse(data, cursor)) {
            return false;
        }
        cursor += PartyDetailRequestStatusField.BYTE_LENGTH;
        if (!custOrderCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += CustOrderCapacityField.BYTE_LENGTH;
        if (!clearingAccountType.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountTypeField.BYTE_LENGTH;
        if (!selfMatchPreventionInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += SelfMatchPreventionInstructionField.BYTE_LENGTH;
        if (!avgPxIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += AvgPxIndicatorField.BYTE_LENGTH;
        if (!clearingTradePriceType.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingTradePriceTypeField.BYTE_LENGTH;
        if (!cmtaGiveupCd.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaGiveupCdField.BYTE_LENGTH;
        if (!custOrderHandlingInst.parse(data, cursor)) {
            return false;
        }
        cursor += CustOrderHandlingInstField.BYTE_LENGTH;
        if (!listUpdateAction.parse(data, cursor)) {
            return false;
        }
        cursor += ListUpdateActionField.BYTE_LENGTH;
        if (!partyDetailDefinitionStatus.parse(data, cursor)) {
            return false;
        }
        cursor += PartyDetailDefinitionStatusField.BYTE_LENGTH;
        if (!executor.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutorField.BYTE_LENGTH;
        if (!idmShortCode.parse(data, cursor)) {
            return false;
        }
        cursor += IdmShortCodeField.BYTE_LENGTH;
        if (!possRetransFlag.parse(data, cursor)) {
            return false;
        }
        cursor += PossRetransFlagField.BYTE_LENGTH;
        if (!splitMsg.parse(data, cursor)) {
            return false;
        }
        cursor += SplitMsgField.BYTE_LENGTH;
        if (!partyDetailsGroups.parseFrom(data, cursor, end - 3)) {
            return false;
        }
        cursor += partyDetailsGroups.byteLength();
        if (end - cursor < 3) {
            return false;
        }
        if (!trdRegPublicationsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += trdRegPublicationsGroups.byteLength();
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
        cursor = memo.encode(data, cursor);
        cursor = avgPxGroupId.encode(data, cursor);
        cursor = partyDetailsListReqId.encode(data, cursor);
        cursor = sendingTimeEpoch.encode(data, cursor);
        cursor = selfMatchPreventionId.encode(data, cursor);
        cursor = partyDetailRequestStatus.encode(data, cursor);
        cursor = custOrderCapacity.encode(data, cursor);
        cursor = clearingAccountType.encode(data, cursor);
        cursor = selfMatchPreventionInstruction.encode(data, cursor);
        cursor = avgPxIndicator.encode(data, cursor);
        cursor = clearingTradePriceType.encode(data, cursor);
        cursor = cmtaGiveupCd.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = listUpdateAction.encode(data, cursor);
        cursor = partyDetailDefinitionStatus.encode(data, cursor);
        cursor = executor.encode(data, cursor);
        cursor = idmShortCode.encode(data, cursor);
        cursor = possRetransFlag.encode(data, cursor);
        cursor = splitMsg.encode(data, cursor);
        cursor = partyDetailsGroups.encode(data, cursor);
        cursor = trdRegPublicationsGroups.encode(data, cursor);
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
        partyDetailsGroups.clear();
        trdRegPublicationsGroups.clear();
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
        if (!partyDetailsGroups.isRecognized()) {
            return false;
        }
        if (!trdRegPublicationsGroups.isRecognized()) {
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
        if (!partyDetailsGroups.isValid()) {
            return false;
        }
        if (!trdRegPublicationsGroups.isValid()) {
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
        if (!memo.isDecoded()) {
            return Optional.of(memo);
        }
        if (!avgPxGroupId.isDecoded()) {
            return Optional.of(avgPxGroupId);
        }
        if (!partyDetailsListReqId.isDecoded()) {
            return Optional.of(partyDetailsListReqId);
        }
        if (!sendingTimeEpoch.isDecoded()) {
            return Optional.of(sendingTimeEpoch);
        }
        if (!selfMatchPreventionId.isDecoded()) {
            return Optional.of(selfMatchPreventionId);
        }
        if (!partyDetailRequestStatus.isDecoded()) {
            return Optional.of(partyDetailRequestStatus);
        }
        if (!custOrderCapacity.isDecoded()) {
            return Optional.of(custOrderCapacity);
        }
        if (!clearingAccountType.isDecoded()) {
            return Optional.of(clearingAccountType);
        }
        if (!selfMatchPreventionInstruction.isDecoded()) {
            return Optional.of(selfMatchPreventionInstruction);
        }
        if (!avgPxIndicator.isDecoded()) {
            return Optional.of(avgPxIndicator);
        }
        if (!clearingTradePriceType.isDecoded()) {
            return Optional.of(clearingTradePriceType);
        }
        if (!cmtaGiveupCd.isDecoded()) {
            return Optional.of(cmtaGiveupCd);
        }
        if (!custOrderHandlingInst.isDecoded()) {
            return Optional.of(custOrderHandlingInst);
        }
        if (!listUpdateAction.isDecoded()) {
            return Optional.of(listUpdateAction);
        }
        if (!partyDetailDefinitionStatus.isDecoded()) {
            return Optional.of(partyDetailDefinitionStatus);
        }
        if (!executor.isDecoded()) {
            return Optional.of(executor);
        }
        if (!idmShortCode.isDecoded()) {
            return Optional.of(idmShortCode);
        }
        if (!possRetransFlag.isDecoded()) {
            return Optional.of(possRetransFlag);
        }
        if (!splitMsg.isDecoded()) {
            return Optional.of(splitMsg);
        }
        if (!partyDetailsGroups.isDecoded()) {
            return partyDetailsGroups.failedAt();
        }
        if (!trdRegPublicationsGroups.isDecoded()) {
            return trdRegPublicationsGroups.failedAt();
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
            case "Memo" -> Optional.of(memo);
            case "AvgPxGroupId" -> Optional.of(avgPxGroupId);
            case "PartyDetailsListReqId" -> Optional.of(partyDetailsListReqId);
            case "SendingTimeEpoch" -> Optional.of(sendingTimeEpoch);
            case "SelfMatchPreventionId" -> Optional.of(selfMatchPreventionId);
            case "PartyDetailRequestStatus" -> Optional.of(partyDetailRequestStatus);
            case "CustOrderCapacity" -> Optional.of(custOrderCapacity);
            case "ClearingAccountType" -> Optional.of(clearingAccountType);
            case "SelfMatchPreventionInstruction" -> Optional.of(selfMatchPreventionInstruction);
            case "AvgPxIndicator" -> Optional.of(avgPxIndicator);
            case "ClearingTradePriceType" -> Optional.of(clearingTradePriceType);
            case "CmtaGiveupCd" -> Optional.of(cmtaGiveupCd);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "ListUpdateAction" -> Optional.of(listUpdateAction);
            case "PartyDetailDefinitionStatus" -> Optional.of(partyDetailDefinitionStatus);
            case "Executor" -> Optional.of(executor);
            case "IdmShortCode" -> Optional.of(idmShortCode);
            case "PossRetransFlag" -> Optional.of(possRetransFlag);
            case "SplitMsg" -> Optional.of(splitMsg);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PartyDetailsDefinitionRequestAck message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(partyDetailsGroups.diffFields(message.partyDetailsGroups));
        changed.addAll(trdRegPublicationsGroups.diffFields(message.trdRegPublicationsGroups));
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
            partyDetailsGroups.toFormattedString(builder, options);
            builder.append(", ");
            trdRegPublicationsGroups.toFormattedString(builder, options);
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
        partyDetailsGroups.toFormattedString(builder, nested);
        trdRegPublicationsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof PartyDetailsDefinitionRequestAck message)) {
            return false;
        }
        return fields.equals(message.fields) && partyDetailsGroups.equals(message.partyDetailsGroups) && trdRegPublicationsGroups.equals(message.trdRegPublicationsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, partyDetailsGroups, trdRegPublicationsGroups);
    }
}
