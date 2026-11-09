package omi.cme.globex.ilink3.sbe.v8_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cme.globex.ilink3.sbe.v8_5.fields.CancelledSymbolField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.DelayDurationField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.DelayToTimeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LiquidityFlagField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LocationField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ManualOrderIndicatorField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MmProtectionResetField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.NoProcessedEntriesField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PartyDetailsListReqIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PossRetransFlagField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.QuoteCxlStatusField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.QuoteIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.QuoteRejectReasonField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.RequestTimeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SenderIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SendingTimeEpochField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SeqNumField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SplitMsgField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TextField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TotNoQuoteEntriesOptionalField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.UnsolicitedCancelTypeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.UuidField;
import omi.cme.globex.ilink3.sbe.v8_5.structs.QuoteCancelAckEntriesGroups;
import omi.cme.globex.ilink3.sbe.v8_5.structs.QuoteCancelAckSetsGroups;
import omi.cme.globex.ilink3.sbe.v8_5.types.Field;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;
import omi.cme.globex.ilink3.sbe.v8_5.types.PrintOptions;

/**
 * Represents the QuoteCancelAck message from the iLink3 protocol.
 *
 * <p>Quote Cancel Acknowledgment message is used in response to a Quote Cancel message to either accept it or reject it. This message can also be unsolicited in a scenario where CME Globex initiates the cancellation.</p>
 */
public final class QuoteCancelAck implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 357;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Cancel Ack";

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
     * Information carried on a response to convey the time (UTC) when the request was received by the MSGW application. UTC timestamps are sent in number of nanoseconds since the UNIX epoch with microsecond precision
     */
    private final RequestTimeField requestTime = new RequestTimeField();

    /**
     * Time when the message is sent. 64-bit integer expressing the number of nano seconds since midnight January 1, 1970.
     */
    private final SendingTimeEpochField sendingTimeEpoch = new SendingTimeEpochField();

    /**
     * Instrument Group cancelled for a Quote Cancel acknowledgement.
     */
    private final CancelledSymbolField cancelledSymbol = new CancelledSymbolField();

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
     * Not being currently used
     */
    private final DelayDurationField delayDuration = new DelayDurationField();

    /**
     * Indicates if the order was initially received manually (as opposed to electronically)
     */
    private final ManualOrderIndicatorField manualOrderIndicator = new ManualOrderIndicatorField();

    /**
     * Identifies the type of Quote Cancel. A working quote can be cancelled by providing either it's instrument, quote set, product group, or by cancelling all
     */
    private final QuoteCxlStatusField quoteCxlStatus = new QuoteCxlStatusField();

    /**
     * Number of quotes successfully cancelled (if in response to a Quote Cancel message)
     */
    private final NoProcessedEntriesField noProcessedEntries = new NoProcessedEntriesField();

    /**
     * When market maker protection is triggered CME will not accept any new quotes from the market maker for that product group until it receives a mass quote message with the MMProtectionReset flag set to true
     */
    private final MmProtectionResetField mmProtectionReset = new MmProtectionResetField();

    /**
     * Type of quote cancel generated by CME -- returned only for unsolicited quote cancels
     */
    private final UnsolicitedCancelTypeField unsolicitedCancelType = new UnsolicitedCancelTypeField();

    /**
     * Indicates whether a message was delayed as a result of being split among multiple packets (0) or if a message was delayed as a result of TCP re-transmission (1) or if a complete message was delayed due to a previously submitted split or out of order message (2). If absent then the message was not delayed and was neither split nor received out of order
     */
    private final SplitMsgField splitMsg = new SplitMsgField();

    /**
     * Total number of quotes for the quote set across all messages. Should be the sum of all NoQuoteEntries in each message that has repeating quotes that are part of the same quote set. Required if NoQuoteEntries &gt; 0. Since fragmentation is not supported in practice this will always be equal to the value of NoQuoteEntries.
     */
    private final TotNoQuoteEntriesOptionalField totNoQuoteEntriesOptional = new TotNoQuoteEntriesOptionalField();

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
     * NoQuoteEntries Block
     */
    private final QuoteCancelAckEntriesGroups quoteCancelAckEntriesGroups = new QuoteCancelAckEntriesGroups();

    /**
     * NoQuoteSets Block
     */
    private final QuoteCancelAckSetsGroups quoteCancelAckSetsGroups = new QuoteCancelAckSetsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(seqNum, uuid, text, senderId, partyDetailsListReqId, requestTime, sendingTimeEpoch, cancelledSymbol, location, quoteId, quoteRejectReason, delayDuration, manualOrderIndicator, quoteCxlStatus, noProcessedEntries, mmProtectionReset, unsolicitedCancelType, splitMsg, totNoQuoteEntriesOptional, liquidityFlag, possRetransFlag, delayToTime);

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
     * Information carried on a response to convey the time (UTC) when the request was received by the MSGW application. UTC timestamps are sent in number of nanoseconds since the UNIX epoch with microsecond precision
     *
     * @return the RequestTime field
     */
    public RequestTimeField requestTime() {
        return requestTime;
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
     * Instrument Group cancelled for a Quote Cancel acknowledgement.
     *
     * @return the CancelledSymbol field
     */
    public CancelledSymbolField cancelledSymbol() {
        return cancelledSymbol;
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
     * Not being currently used
     *
     * @return the DelayDuration field
     */
    public DelayDurationField delayDuration() {
        return delayDuration;
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
     * Identifies the type of Quote Cancel. A working quote can be cancelled by providing either it's instrument, quote set, product group, or by cancelling all
     *
     * @return the QuoteCxlStatus field
     */
    public QuoteCxlStatusField quoteCxlStatus() {
        return quoteCxlStatus;
    }

    /**
     * Number of quotes successfully cancelled (if in response to a Quote Cancel message)
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
     * Type of quote cancel generated by CME -- returned only for unsolicited quote cancels
     *
     * @return the UnsolicitedCancelType field
     */
    public UnsolicitedCancelTypeField unsolicitedCancelType() {
        return unsolicitedCancelType;
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
     * Total number of quotes for the quote set across all messages. Should be the sum of all NoQuoteEntries in each message that has repeating quotes that are part of the same quote set. Required if NoQuoteEntries &gt; 0. Since fragmentation is not supported in practice this will always be equal to the value of NoQuoteEntries.
     *
     * @return the TotNoQuoteEntriesOptional field
     */
    public TotNoQuoteEntriesOptionalField totNoQuoteEntriesOptional() {
        return totNoQuoteEntriesOptional;
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
     * NoQuoteEntries Block
     *
     * @return the QuoteCancelAckEntriesGroups record
     */
    public QuoteCancelAckEntriesGroups quoteCancelAckEntriesGroups() {
        return quoteCancelAckEntriesGroups;
    }

    /**
     * NoQuoteSets Block
     *
     * @return the QuoteCancelAckSetsGroups record
     */
    public QuoteCancelAckSetsGroups quoteCancelAckSetsGroups() {
        return quoteCancelAckSetsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + quoteCancelAckEntriesGroups.byteLength() - QuoteCancelAckEntriesGroups.MINIMUM_BYTE_LENGTH + quoteCancelAckSetsGroups.byteLength() - QuoteCancelAckSetsGroups.MINIMUM_BYTE_LENGTH;
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
        cursor += 256;
        cursor += 20;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 6;
        cursor += 5;
        cursor += 4;
        cursor += 2;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 8;
        cursor = quoteCancelAckEntriesGroups.padding(runs, cursor);
        cursor = quoteCancelAckSetsGroups.padding(runs, cursor);
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
        if (!requestTime.parse(data, cursor)) {
            return false;
        }
        cursor += RequestTimeField.BYTE_LENGTH;
        if (!sendingTimeEpoch.parse(data, cursor)) {
            return false;
        }
        cursor += SendingTimeEpochField.BYTE_LENGTH;
        if (!cancelledSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += CancelledSymbolField.BYTE_LENGTH;
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
        if (!delayDuration.parse(data, cursor)) {
            return false;
        }
        cursor += DelayDurationField.BYTE_LENGTH;
        if (!manualOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        if (!quoteCxlStatus.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteCxlStatusField.BYTE_LENGTH;
        if (!noProcessedEntries.parse(data, cursor)) {
            return false;
        }
        cursor += NoProcessedEntriesField.BYTE_LENGTH;
        if (!mmProtectionReset.parse(data, cursor)) {
            return false;
        }
        cursor += MmProtectionResetField.BYTE_LENGTH;
        if (!unsolicitedCancelType.parse(data, cursor)) {
            return false;
        }
        cursor += UnsolicitedCancelTypeField.BYTE_LENGTH;
        if (!splitMsg.parse(data, cursor)) {
            return false;
        }
        cursor += SplitMsgField.BYTE_LENGTH;
        if (!totNoQuoteEntriesOptional.parse(data, cursor)) {
            return false;
        }
        cursor += TotNoQuoteEntriesOptionalField.BYTE_LENGTH;
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
        if (!quoteCancelAckEntriesGroups.parseFrom(data, cursor, end - 3)) {
            return false;
        }
        cursor += quoteCancelAckEntriesGroups.byteLength();
        if (end - cursor < 3) {
            return false;
        }
        if (!quoteCancelAckSetsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += quoteCancelAckSetsGroups.byteLength();
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
        cursor = text.encode(data, cursor);
        cursor = senderId.encode(data, cursor);
        cursor = partyDetailsListReqId.encode(data, cursor);
        cursor = requestTime.encode(data, cursor);
        cursor = sendingTimeEpoch.encode(data, cursor);
        cursor = cancelledSymbol.encode(data, cursor);
        cursor = location.encode(data, cursor);
        cursor = quoteId.encode(data, cursor);
        cursor = quoteRejectReason.encode(data, cursor);
        cursor = delayDuration.encode(data, cursor);
        cursor = manualOrderIndicator.encode(data, cursor);
        cursor = quoteCxlStatus.encode(data, cursor);
        cursor = noProcessedEntries.encode(data, cursor);
        cursor = mmProtectionReset.encode(data, cursor);
        cursor = unsolicitedCancelType.encode(data, cursor);
        cursor = splitMsg.encode(data, cursor);
        cursor = totNoQuoteEntriesOptional.encode(data, cursor);
        cursor = liquidityFlag.encode(data, cursor);
        cursor = possRetransFlag.encode(data, cursor);
        cursor = delayToTime.encode(data, cursor);
        cursor = quoteCancelAckEntriesGroups.encode(data, cursor);
        cursor = quoteCancelAckSetsGroups.encode(data, cursor);
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
        quoteCancelAckEntriesGroups.clear();
        quoteCancelAckSetsGroups.clear();
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
        if (!quoteCancelAckEntriesGroups.isRecognized()) {
            return false;
        }
        if (!quoteCancelAckSetsGroups.isRecognized()) {
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
        if (!quoteCancelAckEntriesGroups.isValid()) {
            return false;
        }
        if (!quoteCancelAckSetsGroups.isValid()) {
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
        if (!requestTime.isDecoded()) {
            return Optional.of(requestTime);
        }
        if (!sendingTimeEpoch.isDecoded()) {
            return Optional.of(sendingTimeEpoch);
        }
        if (!cancelledSymbol.isDecoded()) {
            return Optional.of(cancelledSymbol);
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
        if (!delayDuration.isDecoded()) {
            return Optional.of(delayDuration);
        }
        if (!manualOrderIndicator.isDecoded()) {
            return Optional.of(manualOrderIndicator);
        }
        if (!quoteCxlStatus.isDecoded()) {
            return Optional.of(quoteCxlStatus);
        }
        if (!noProcessedEntries.isDecoded()) {
            return Optional.of(noProcessedEntries);
        }
        if (!mmProtectionReset.isDecoded()) {
            return Optional.of(mmProtectionReset);
        }
        if (!unsolicitedCancelType.isDecoded()) {
            return Optional.of(unsolicitedCancelType);
        }
        if (!splitMsg.isDecoded()) {
            return Optional.of(splitMsg);
        }
        if (!totNoQuoteEntriesOptional.isDecoded()) {
            return Optional.of(totNoQuoteEntriesOptional);
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
        if (!quoteCancelAckEntriesGroups.isDecoded()) {
            return quoteCancelAckEntriesGroups.failedAt();
        }
        if (!quoteCancelAckSetsGroups.isDecoded()) {
            return quoteCancelAckSetsGroups.failedAt();
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
            case "RequestTime" -> Optional.of(requestTime);
            case "SendingTimeEpoch" -> Optional.of(sendingTimeEpoch);
            case "CancelledSymbol" -> Optional.of(cancelledSymbol);
            case "Location" -> Optional.of(location);
            case "QuoteId" -> Optional.of(quoteId);
            case "QuoteRejectReason" -> Optional.of(quoteRejectReason);
            case "DelayDuration" -> Optional.of(delayDuration);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "QuoteCxlStatus" -> Optional.of(quoteCxlStatus);
            case "NoProcessedEntries" -> Optional.of(noProcessedEntries);
            case "MmProtectionReset" -> Optional.of(mmProtectionReset);
            case "UnsolicitedCancelType" -> Optional.of(unsolicitedCancelType);
            case "SplitMsg" -> Optional.of(splitMsg);
            case "TotNoQuoteEntriesOptional" -> Optional.of(totNoQuoteEntriesOptional);
            case "LiquidityFlag" -> Optional.of(liquidityFlag);
            case "PossRetransFlag" -> Optional.of(possRetransFlag);
            case "DelayToTime" -> Optional.of(delayToTime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteCancelAck message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(quoteCancelAckEntriesGroups.diffFields(message.quoteCancelAckEntriesGroups));
        changed.addAll(quoteCancelAckSetsGroups.diffFields(message.quoteCancelAckSetsGroups));
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
            quoteCancelAckEntriesGroups.toFormattedString(builder, options);
            builder.append(", ");
            quoteCancelAckSetsGroups.toFormattedString(builder, options);
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
        quoteCancelAckEntriesGroups.toFormattedString(builder, nested);
        quoteCancelAckSetsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof QuoteCancelAck message)) {
            return false;
        }
        return fields.equals(message.fields) && quoteCancelAckEntriesGroups.equals(message.quoteCancelAckEntriesGroups) && quoteCancelAckSetsGroups.equals(message.quoteCancelAckSetsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, quoteCancelAckEntriesGroups, quoteCancelAckSetsGroups);
    }
}
