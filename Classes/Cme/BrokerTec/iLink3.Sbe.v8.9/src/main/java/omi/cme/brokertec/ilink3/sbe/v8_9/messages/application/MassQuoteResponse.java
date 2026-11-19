package omi.cme.brokertec.ilink3.sbe.v8_9.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.DelayToTimeField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.LiquidityFlagField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.LocationField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.ManualOrderIndicatorField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.MmProtectionResetField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.NoProcessedEntriesField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.PartyDetailsListReqIdField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.PossRetransFlagField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.QuoteAckStatusField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.QuoteEntryControlField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.QuoteEntryOpenField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.QuoteIdField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.QuoteRejectReasonField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.QuoteReqIdOptionalField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.SenderIdField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.SendingTimeEpochField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.SeqNumField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.ShortSaleTypeField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.SplitMsgField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.TextField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.TotNoQuoteEntriesOptionalField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.TransactTimeField;
import omi.cme.brokertec.ilink3.sbe.v8_9.fields.UuidField;
import omi.cme.brokertec.ilink3.sbe.v8_9.structs.MassQuoteResponseEntriesGroups;
import omi.cme.brokertec.ilink3.sbe.v8_9.types.Field;
import omi.cme.brokertec.ilink3.sbe.v8_9.types.Message;
import omi.cme.brokertec.ilink3.sbe.v8_9.types.PrintOptions;

/**
 * Represents the MassQuoteResponse message from the iLink3 protocol.
 *
 * <p>MassQuoteResponse</p>
 */
public final class MassQuoteResponse implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 353;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Mass Quote Response";

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
     * Unique identifier for quote request being responded to
     */
    private final QuoteReqIdOptionalField quoteReqIdOptional = new QuoteReqIdOptionalField();

    /**
     * Text describing sender's location (i.e. geopraphic location and/or desk)
     */
    private final LocationField location = new LocationField();

    /**
     * Unique identifier for mass quote populated by the client system
     */
    private final QuoteIdField quoteId = new QuoteIdField();

    /**
     * Contains reason (error code) the corresponding MassQuote message has been rejected. When this tag is returned, all quotes in the corresponding Mass Quote message are rejected.
     */
    private final QuoteRejectReasonField quoteRejectReason = new QuoteRejectReasonField();

    /**
     * Identifies the status of the quote acknowledgement.
     */
    private final QuoteAckStatusField quoteAckStatus = new QuoteAckStatusField();

    /**
     * Indicates if the order was initially received manually (as opposed to electronically)
     */
    private final ManualOrderIndicatorField manualOrderIndicator = new ManualOrderIndicatorField();

    /**
     * Number of quotes that have been accepted from the corresponding inbound message
     */
    private final NoProcessedEntriesField noProcessedEntries = new NoProcessedEntriesField();

    /**
     * When market maker protection is triggered CME will not accept any new quotes from the market maker for that product group until it receives a mass quote message with the MMProtectionReset flag set to true
     */
    private final MmProtectionResetField mmProtectionReset = new MmProtectionResetField();

    /**
     * Indicates whether a message was delayed as a result of being split among multiple packets (0) or if a message was delayed as a result of TCP re-transmission (1) or if a complete message was delayed due to a previously submitted split or out of order message (2). If absent then the message was not delayed and was neither split nor received out of order
     */
    private final SplitMsgField splitMsg = new SplitMsgField();

    /**
     * Field added to capture if an order was submitted for market making obligation or not. Applicable only for EU BrokerTec and EBS MiFID regulated instruments
     */
    private final LiquidityFlagField liquidityFlag = new LiquidityFlagField();

    /**
     * Indicates the type of short sale. Will not be used for Buy orders but Sell orders should have this tag populated for MiFID
     */
    private final ShortSaleTypeField shortSaleType = new ShortSaleTypeField();

    /**
     * Total number of quotes for the quote set across all messages. Should be the sum of all NoQuoteEntries in each message that has repeating quotes that are part of the same quote set. Required if NoQuoteEntries is greater than 0. Since fragmentation is not supported in practice this will always be equal to the value of NoQuoteEntries.
     */
    private final TotNoQuoteEntriesOptionalField totNoQuoteEntriesOptional = new TotNoQuoteEntriesOptionalField();

    /**
     * Flags message as possible retransmission. This will convey whether a message is an original transmission or duplicate in response to RetransmissionRequest. This will become pertinent when original messages get interleaved with Retransmission responses
     */
    private final PossRetransFlagField possRetransFlag = new PossRetransFlagField();

    /**
     * Indicates the amount of time that a message was delayed as a result of being split (9553=0) or as a result of being out of order due to TCP retransmission (9553=1) or as a result of being queued behind a split message (9553=2). Represented as number of nanoseconds in unix epoch format (since Jan 1, 1970). Subtracting this number from FIFO time will represent original received time of delayed message
     */
    private final DelayToTimeField delayToTime = new DelayToTimeField();

    /**
     * A boolean value indicating if new quotes should be rejected for the sender comp for whom quotes are being cancelled on behalf; also to be used to reset such a block on mass quotes being sent by the blocked sender comp
     */
    private final QuoteEntryOpenField quoteEntryOpen = new QuoteEntryOpenField();

    /**
     * Optional field that allows market makers to block new entries or unblock previously set block. Value is echoed back from inbound customer request
     */
    private final QuoteEntryControlField quoteEntryControl = new QuoteEntryControlField();

    /**
     * NoQuoteEntries Block
     */
    private final MassQuoteResponseEntriesGroups massQuoteResponseEntriesGroups = new MassQuoteResponseEntriesGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(seqNum, uuid, text, senderId, partyDetailsListReqId, transactTime, sendingTimeEpoch, quoteReqIdOptional, location, quoteId, quoteRejectReason, quoteAckStatus, manualOrderIndicator, noProcessedEntries, mmProtectionReset, splitMsg, liquidityFlag, shortSaleType, totNoQuoteEntriesOptional, possRetransFlag, delayToTime, quoteEntryOpen, quoteEntryControl);

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
     * Unique identifier for quote request being responded to
     *
     * @return the QuoteReqIdOptional field
     */
    public QuoteReqIdOptionalField quoteReqIdOptional() {
        return quoteReqIdOptional;
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
     * Unique identifier for mass quote populated by the client system
     *
     * @return the QuoteId field
     */
    public QuoteIdField quoteId() {
        return quoteId;
    }

    /**
     * Contains reason (error code) the corresponding MassQuote message has been rejected. When this tag is returned, all quotes in the corresponding Mass Quote message are rejected.
     *
     * @return the QuoteRejectReason field
     */
    public QuoteRejectReasonField quoteRejectReason() {
        return quoteRejectReason;
    }

    /**
     * Identifies the status of the quote acknowledgement.
     *
     * @return the QuoteAckStatus field
     */
    public QuoteAckStatusField quoteAckStatus() {
        return quoteAckStatus;
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
     * Number of quotes that have been accepted from the corresponding inbound message
     *
     * @return the NoProcessedEntries field
     */
    public NoProcessedEntriesField noProcessedEntries() {
        return noProcessedEntries;
    }

    /**
     * When market maker protection is triggered CME will not accept any new quotes from the market maker for that product group until it receives a mass quote message with the MMProtectionReset flag set to true
     *
     * @return the MmProtectionReset field
     */
    public MmProtectionResetField mmProtectionReset() {
        return mmProtectionReset;
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
     * Field added to capture if an order was submitted for market making obligation or not. Applicable only for EU BrokerTec and EBS MiFID regulated instruments
     *
     * @return the LiquidityFlag field
     */
    public LiquidityFlagField liquidityFlag() {
        return liquidityFlag;
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
     * Total number of quotes for the quote set across all messages. Should be the sum of all NoQuoteEntries in each message that has repeating quotes that are part of the same quote set. Required if NoQuoteEntries is greater than 0. Since fragmentation is not supported in practice this will always be equal to the value of NoQuoteEntries.
     *
     * @return the TotNoQuoteEntriesOptional field
     */
    public TotNoQuoteEntriesOptionalField totNoQuoteEntriesOptional() {
        return totNoQuoteEntriesOptional;
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
     * A boolean value indicating if new quotes should be rejected for the sender comp for whom quotes are being cancelled on behalf; also to be used to reset such a block on mass quotes being sent by the blocked sender comp
     *
     * @return the QuoteEntryOpen field
     */
    public QuoteEntryOpenField quoteEntryOpen() {
        return quoteEntryOpen;
    }

    /**
     * Optional field that allows market makers to block new entries or unblock previously set block. Value is echoed back from inbound customer request
     *
     * @return the QuoteEntryControl field
     */
    public QuoteEntryControlField quoteEntryControl() {
        return quoteEntryControl;
    }

    /**
     * NoQuoteEntries Block
     *
     * @return the MassQuoteResponseEntriesGroups record
     */
    public MassQuoteResponseEntriesGroups massQuoteResponseEntriesGroups() {
        return massQuoteResponseEntriesGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + massQuoteResponseEntriesGroups.byteLength() - MassQuoteResponseEntriesGroups.MINIMUM_BYTE_LENGTH;
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
        if (!text.parse(data, cursor)) {
            return false;
        }
        cursor += TextField.BYTE_LENGTH;
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
        if (!quoteReqIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteReqIdOptionalField.BYTE_LENGTH;
        if (!location.parse(data, cursor)) {
            return false;
        }
        cursor += LocationField.BYTE_LENGTH;
        if (!quoteId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteIdField.BYTE_LENGTH;
        if (!quoteRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteRejectReasonField.BYTE_LENGTH;
        if (!quoteAckStatus.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteAckStatusField.BYTE_LENGTH;
        if (!manualOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        if (!noProcessedEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NoProcessedEntriesField.BYTE_LENGTH;
        if (!mmProtectionReset.parse(data, cursor)) {
            return false;
        }
        cursor += MmProtectionResetField.BYTE_LENGTH;
        if (!splitMsg.parse(data, cursor)) {
            return false;
        }
        cursor += SplitMsgField.BYTE_LENGTH;
        if (!liquidityFlag.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityFlagField.BYTE_LENGTH;
        if (!shortSaleType.parse(data, cursor)) {
            return false;
        }
        cursor += ShortSaleTypeField.BYTE_LENGTH;
        if (!totNoQuoteEntriesOptional.parse(data, cursor)) {
            return false;
        }
        cursor += TotNoQuoteEntriesOptionalField.BYTE_LENGTH;
        if (!possRetransFlag.parse(data, cursor)) {
            return false;
        }
        cursor += PossRetransFlagField.BYTE_LENGTH;
        if (!delayToTime.parse(data, cursor)) {
            return false;
        }
        cursor += DelayToTimeField.BYTE_LENGTH;
        if (!quoteEntryOpen.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteEntryOpenField.BYTE_LENGTH;
        if (!quoteEntryControl.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteEntryControlField.BYTE_LENGTH;
        if (!massQuoteResponseEntriesGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += massQuoteResponseEntriesGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = seqNum.encode(data, cursor);
        cursor = uuid.encode(data, cursor);
        cursor = text.encode(data, cursor);
        cursor = senderId.encode(data, cursor);
        cursor = partyDetailsListReqId.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = sendingTimeEpoch.encode(data, cursor);
        cursor = quoteReqIdOptional.encode(data, cursor);
        cursor = location.encode(data, cursor);
        cursor = quoteId.encode(data, cursor);
        cursor = quoteRejectReason.encode(data, cursor);
        cursor = quoteAckStatus.encode(data, cursor);
        cursor = manualOrderIndicator.encode(data, cursor);
        cursor = noProcessedEntries.encode(data, cursor);
        cursor = mmProtectionReset.encode(data, cursor);
        cursor = splitMsg.encode(data, cursor);
        cursor = liquidityFlag.encode(data, cursor);
        cursor = shortSaleType.encode(data, cursor);
        cursor = totNoQuoteEntriesOptional.encode(data, cursor);
        cursor = possRetransFlag.encode(data, cursor);
        cursor = delayToTime.encode(data, cursor);
        cursor = quoteEntryOpen.encode(data, cursor);
        cursor = quoteEntryControl.encode(data, cursor);
        cursor = massQuoteResponseEntriesGroups.encode(data, cursor);
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
        massQuoteResponseEntriesGroups.clear();
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
        return massQuoteResponseEntriesGroups.isRecognized();
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
        if (!massQuoteResponseEntriesGroups.isValid()) {
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
        if (!text.isDecoded()) {
            return Optional.of(text);
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
        if (!quoteReqIdOptional.isDecoded()) {
            return Optional.of(quoteReqIdOptional);
        }
        if (!location.isDecoded()) {
            return Optional.of(location);
        }
        if (!quoteId.isDecoded()) {
            return Optional.of(quoteId);
        }
        if (!quoteRejectReason.isDecoded()) {
            return Optional.of(quoteRejectReason);
        }
        if (!quoteAckStatus.isDecoded()) {
            return Optional.of(quoteAckStatus);
        }
        if (!manualOrderIndicator.isDecoded()) {
            return Optional.of(manualOrderIndicator);
        }
        if (!noProcessedEntries.isDecoded()) {
            return Optional.of(noProcessedEntries);
        }
        if (!mmProtectionReset.isDecoded()) {
            return Optional.of(mmProtectionReset);
        }
        if (!splitMsg.isDecoded()) {
            return Optional.of(splitMsg);
        }
        if (!liquidityFlag.isDecoded()) {
            return Optional.of(liquidityFlag);
        }
        if (!shortSaleType.isDecoded()) {
            return Optional.of(shortSaleType);
        }
        if (!totNoQuoteEntriesOptional.isDecoded()) {
            return Optional.of(totNoQuoteEntriesOptional);
        }
        if (!possRetransFlag.isDecoded()) {
            return Optional.of(possRetransFlag);
        }
        if (!delayToTime.isDecoded()) {
            return Optional.of(delayToTime);
        }
        if (!quoteEntryOpen.isDecoded()) {
            return Optional.of(quoteEntryOpen);
        }
        if (!quoteEntryControl.isDecoded()) {
            return Optional.of(quoteEntryControl);
        }
        if (!massQuoteResponseEntriesGroups.isDecoded()) {
            return massQuoteResponseEntriesGroups.failedAt();
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
            case "SenderId" -> Optional.of(senderId);
            case "PartyDetailsListReqId" -> Optional.of(partyDetailsListReqId);
            case "TransactTime" -> Optional.of(transactTime);
            case "SendingTimeEpoch" -> Optional.of(sendingTimeEpoch);
            case "QuoteReqIdOptional" -> Optional.of(quoteReqIdOptional);
            case "Location" -> Optional.of(location);
            case "QuoteId" -> Optional.of(quoteId);
            case "QuoteRejectReason" -> Optional.of(quoteRejectReason);
            case "QuoteAckStatus" -> Optional.of(quoteAckStatus);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "NoProcessedEntries" -> Optional.of(noProcessedEntries);
            case "MmProtectionReset" -> Optional.of(mmProtectionReset);
            case "SplitMsg" -> Optional.of(splitMsg);
            case "LiquidityFlag" -> Optional.of(liquidityFlag);
            case "ShortSaleType" -> Optional.of(shortSaleType);
            case "TotNoQuoteEntriesOptional" -> Optional.of(totNoQuoteEntriesOptional);
            case "PossRetransFlag" -> Optional.of(possRetransFlag);
            case "DelayToTime" -> Optional.of(delayToTime);
            case "QuoteEntryOpen" -> Optional.of(quoteEntryOpen);
            case "QuoteEntryControl" -> Optional.of(quoteEntryControl);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof MassQuoteResponse message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(massQuoteResponseEntriesGroups.diffFields(message.massQuoteResponseEntriesGroups));
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
            massQuoteResponseEntriesGroups.toFormattedString(builder, options);
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
        massQuoteResponseEntriesGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof MassQuoteResponse message)) {
            return false;
        }
        return fields.equals(message.fields) && massQuoteResponseEntriesGroups.equals(message.massQuoteResponseEntriesGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, massQuoteResponseEntriesGroups);
    }
}
