package omi.cme.globex.ilink3.sbe.v8_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.cme.globex.ilink3.sbe.v8_5.fields.AutoQuoteRequestField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.CurrencyField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.DelayDurationField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.EndDateField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ExpirationCycleField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.FinancialInstrumentFullNameField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LocationField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ManualOrderIndicatorField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MaxNoOfSubstitutionsField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PartyDetailsListReqIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PossRetransFlagField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecurityGroupField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecurityIdOptionalField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecurityReqIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecurityResponseIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecurityResponseTypeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecurityTypeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SenderIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SendingTimeEpochField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SeqNumField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SourceRepoIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SplitMsgField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.StartDateField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SymbolField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TerminationTypeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TextField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.UuidField;
import omi.cme.globex.ilink3.sbe.v8_5.structs.MaturityMonthYear;
import omi.cme.globex.ilink3.sbe.v8_5.structs.ResponseLegsGroups;
import omi.cme.globex.ilink3.sbe.v8_5.types.Field;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;
import omi.cme.globex.ilink3.sbe.v8_5.types.PrintOptions;

/**
 * Represents the SecurityDefinitionResponse message from the iLink3 protocol.
 *
 * <p>This message is sent in response to an attempt to create a new security definition.</p>
 */
public final class SecurityDefinitionResponse implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 432;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Definition Response";

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
     * Long name of the instrument for TM Repo
     */
    private final FinancialInstrumentFullNameField financialInstrumentFullName = new FinancialInstrumentFullNameField();

    /**
     * Operator ID. Should be unique per Firm ID. Assigned value used to identify specific message originator. Represents last individual or team in charge of the system which modifies the order before submission to the Globex platform, or if not modified from initiator (party role=118), last individual or team in charge of the system, which submit the order to the Globex platform
     */
    private final SenderIdField senderId = new SenderIdField();

    /**
     * Instrument Short Name for TM Repo
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Refers to the ID of the related PartyDetailsDefinitionRequest message which will logically be tied to this message
     */
    private final PartyDetailsListReqIdField partyDetailsListReqId = new PartyDetailsListReqIdField();

    /**
     * Unique identifier for a security definition request. It is incumbent on the market participant to maintain uniqueness
     */
    private final SecurityReqIdField securityReqId = new SecurityReqIdField();

    /**
     * Unique ID of a SecurityDefinition message
     */
    private final SecurityResponseIdField securityResponseId = new SecurityResponseIdField();

    /**
     * Time when the message is sent. 64-bit integer expressing the number of nano seconds since midnight January 1, 1970.
     */
    private final SendingTimeEpochField sendingTimeEpoch = new SendingTimeEpochField();

    /**
     * Specifies the Product Group for which working orders should be cancelled. Conditionally required if MassActionScope="Product Group" (Tag1374=10). Will be ignored if present for any other criteria specified in MassActionScope besides Product Group
     */
    private final SecurityGroupField securityGroup = new SecurityGroupField();

    /**
     * Indicates type of security
     */
    private final SecurityTypeField securityType = new SecurityTypeField();

    /**
     * Text describing sender's location (i.e. geopraphic location and/or desk)
     */
    private final LocationField location = new LocationField();

    /**
     * Conditionally required if MassActionScope="Instrument" (Tag 1374=1). Will be ignored if present for any other criteria specified in MassActionScope besides Instrument
     */
    private final SecurityIdOptionalField securityIdOptional = new SecurityIdOptionalField();

    /**
     * Identifies the currency for the price
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Not being currently used
     */
    private final DelayDurationField delayDuration = new DelayDurationField();

    /**
     * Start date of a financing deal, i.e. the date the buyer pays the seller cash and takes control of the collateral
     */
    private final StartDateField startDate = new StartDateField();

    /**
     * End date of a financing deal, i.e. the date the seller reimburses the buyer and takes back control of the collateral
     */
    private final EndDateField endDate = new EndDateField();

    /**
     * Max number of substitutions allowed. The value of 0 indicates that substitutions are not allowed.
     */
    private final MaxNoOfSubstitutionsField maxNoOfSubstitutions = new MaxNoOfSubstitutionsField();

    /**
     * Represents the source repo instrument on which the new tailor made repo should be modeled on
     */
    private final SourceRepoIdField sourceRepoId = new SourceRepoIdField();

    /**
     * Represents the term code
     */
    private final TerminationTypeField terminationType = new TerminationTypeField();

    /**
     * Type of security definition message response.
     */
    private final SecurityResponseTypeField securityResponseType = new SecurityResponseTypeField();

    /**
     * For tag 827-ExpirationCycle=2, instrument expires as indicated in market data Security Definition (tag 35-MsgType=d) repeating block: Tag 865-EventType=7 (Last Eligible Trade Date) Tag 1145-EventTime
     */
    private final ExpirationCycleField expirationCycle = new ExpirationCycleField();

    /**
     * Indicates if the order was initially received manually (as opposed to electronically)
     */
    private final ManualOrderIndicatorField manualOrderIndicator = new ManualOrderIndicatorField();

    /**
     * Indicates whether a message was delayed as a result of being split among multiple packets (0) or if a message was delayed as a result of TCP re-transmission (1) or if a complete message was delayed due to a previously submitted split or out of order message (2). If absent then the message was not delayed and was neither split nor received out of order
     */
    private final SplitMsgField splitMsg = new SplitMsgField();

    /**
     * Boolean flag (0/1) to automatically send a quote request message following the security definition (35=d) message.
     */
    private final AutoQuoteRequestField autoQuoteRequest = new AutoQuoteRequestField();

    /**
     * Flags message as possible retransmission. This will convey whether a message is an original transmission or duplicate in response to RetransmissionRequest. This will become pertinent when original messages get interleaved with Retransmission responses
     */
    private final PossRetransFlagField possRetransFlag = new PossRetransFlagField();

    /**
     * SecurityDefinitionResponse
     */
    private final MaturityMonthYear maturityMonthYear = new MaturityMonthYear();

    /**
     * NoLegs Block
     */
    private final ResponseLegsGroups responseLegsGroups = new ResponseLegsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(seqNum), List.<Field>of(uuid), List.<Field>of(text), List.<Field>of(financialInstrumentFullName), List.<Field>of(senderId), List.<Field>of(symbol), List.<Field>of(partyDetailsListReqId), List.<Field>of(securityReqId), List.<Field>of(securityResponseId), List.<Field>of(sendingTimeEpoch), List.<Field>of(securityGroup), List.<Field>of(securityType), List.<Field>of(location), List.<Field>of(securityIdOptional), List.<Field>of(currency), maturityMonthYear.fields(), List.<Field>of(delayDuration), List.<Field>of(startDate), List.<Field>of(endDate), List.<Field>of(maxNoOfSubstitutions), List.<Field>of(sourceRepoId), List.<Field>of(terminationType), List.<Field>of(securityResponseType), List.<Field>of(expirationCycle), List.<Field>of(manualOrderIndicator), List.<Field>of(splitMsg), List.<Field>of(autoQuoteRequest), List.<Field>of(possRetransFlag)).flatMap(List::stream).toList();

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
     * Long name of the instrument for TM Repo
     *
     * @return the FinancialInstrumentFullName field
     */
    public FinancialInstrumentFullNameField financialInstrumentFullName() {
        return financialInstrumentFullName;
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
     * Instrument Short Name for TM Repo
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
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
     * Unique identifier for a security definition request. It is incumbent on the market participant to maintain uniqueness
     *
     * @return the SecurityReqId field
     */
    public SecurityReqIdField securityReqId() {
        return securityReqId;
    }

    /**
     * Unique ID of a SecurityDefinition message
     *
     * @return the SecurityResponseId field
     */
    public SecurityResponseIdField securityResponseId() {
        return securityResponseId;
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
     * Specifies the Product Group for which working orders should be cancelled. Conditionally required if MassActionScope="Product Group" (Tag1374=10). Will be ignored if present for any other criteria specified in MassActionScope besides Product Group
     *
     * @return the SecurityGroup field
     */
    public SecurityGroupField securityGroup() {
        return securityGroup;
    }

    /**
     * Indicates type of security
     *
     * @return the SecurityType field
     */
    public SecurityTypeField securityType() {
        return securityType;
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
     * Identifies the currency for the price
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
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
     * Start date of a financing deal, i.e. the date the buyer pays the seller cash and takes control of the collateral
     *
     * @return the StartDate field
     */
    public StartDateField startDate() {
        return startDate;
    }

    /**
     * End date of a financing deal, i.e. the date the seller reimburses the buyer and takes back control of the collateral
     *
     * @return the EndDate field
     */
    public EndDateField endDate() {
        return endDate;
    }

    /**
     * Max number of substitutions allowed. The value of 0 indicates that substitutions are not allowed.
     *
     * @return the MaxNoOfSubstitutions field
     */
    public MaxNoOfSubstitutionsField maxNoOfSubstitutions() {
        return maxNoOfSubstitutions;
    }

    /**
     * Represents the source repo instrument on which the new tailor made repo should be modeled on
     *
     * @return the SourceRepoId field
     */
    public SourceRepoIdField sourceRepoId() {
        return sourceRepoId;
    }

    /**
     * Represents the term code
     *
     * @return the TerminationType field
     */
    public TerminationTypeField terminationType() {
        return terminationType;
    }

    /**
     * Type of security definition message response.
     *
     * @return the SecurityResponseType field
     */
    public SecurityResponseTypeField securityResponseType() {
        return securityResponseType;
    }

    /**
     * For tag 827-ExpirationCycle=2, instrument expires as indicated in market data Security Definition (tag 35-MsgType=d) repeating block: Tag 865-EventType=7 (Last Eligible Trade Date) Tag 1145-EventTime
     *
     * @return the ExpirationCycle field
     */
    public ExpirationCycleField expirationCycle() {
        return expirationCycle;
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
     * Indicates whether a message was delayed as a result of being split among multiple packets (0) or if a message was delayed as a result of TCP re-transmission (1) or if a complete message was delayed due to a previously submitted split or out of order message (2). If absent then the message was not delayed and was neither split nor received out of order
     *
     * @return the SplitMsg field
     */
    public SplitMsgField splitMsg() {
        return splitMsg;
    }

    /**
     * Boolean flag (0/1) to automatically send a quote request message following the security definition (35=d) message.
     *
     * @return the AutoQuoteRequest field
     */
    public AutoQuoteRequestField autoQuoteRequest() {
        return autoQuoteRequest;
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
     * SecurityDefinitionResponse
     *
     * @return the MaturityMonthYear record
     */
    public MaturityMonthYear maturityMonthYear() {
        return maturityMonthYear;
    }

    /**
     * NoLegs Block
     *
     * @return the ResponseLegsGroups record
     */
    public ResponseLegsGroups responseLegsGroups() {
        return responseLegsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + responseLegsGroups.byteLength() - ResponseLegsGroups.MINIMUM_BYTE_LENGTH;
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
        cursor += 35;
        cursor += 20;
        cursor += 20;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 6;
        cursor += 6;
        cursor += 5;
        cursor += 4;
        cursor += 3;
        for (int[] run = MaturityMonthYear.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += MaturityMonthYear.BYTE_LENGTH;
        cursor += 2;
        cursor += 2;
        cursor += 2;
        cursor += 1;
        cursor += 4;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor = responseLegsGroups.padding(runs, cursor);
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
        if (!financialInstrumentFullName.parse(data, cursor)) {
            return false;
        }
        cursor += FinancialInstrumentFullNameField.BYTE_LENGTH;
        if (!senderId.parse(data, cursor)) {
            return false;
        }
        cursor += SenderIdField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!partyDetailsListReqId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyDetailsListReqIdField.BYTE_LENGTH;
        if (!securityReqId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityReqIdField.BYTE_LENGTH;
        if (!securityResponseId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityResponseIdField.BYTE_LENGTH;
        if (!sendingTimeEpoch.parse(data, cursor)) {
            return false;
        }
        cursor += SendingTimeEpochField.BYTE_LENGTH;
        if (!securityGroup.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityGroupField.BYTE_LENGTH;
        if (!securityType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityTypeField.BYTE_LENGTH;
        if (!location.parse(data, cursor)) {
            return false;
        }
        cursor += LocationField.BYTE_LENGTH;
        if (!securityIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdOptionalField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!maturityMonthYear.parseFrom(data, cursor, end - 28)) {
            return false;
        }
        cursor += maturityMonthYear.byteLength();
        if (!delayDuration.parse(data, cursor)) {
            return false;
        }
        cursor += DelayDurationField.BYTE_LENGTH;
        if (!startDate.parse(data, cursor)) {
            return false;
        }
        cursor += StartDateField.BYTE_LENGTH;
        if (!endDate.parse(data, cursor)) {
            return false;
        }
        cursor += EndDateField.BYTE_LENGTH;
        if (!maxNoOfSubstitutions.parse(data, cursor)) {
            return false;
        }
        cursor += MaxNoOfSubstitutionsField.BYTE_LENGTH;
        if (!sourceRepoId.parse(data, cursor)) {
            return false;
        }
        cursor += SourceRepoIdField.BYTE_LENGTH;
        if (!terminationType.parse(data, cursor)) {
            return false;
        }
        cursor += TerminationTypeField.BYTE_LENGTH;
        if (!securityResponseType.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityResponseTypeField.BYTE_LENGTH;
        if (!expirationCycle.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationCycleField.BYTE_LENGTH;
        if (!manualOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        if (!splitMsg.parse(data, cursor)) {
            return false;
        }
        cursor += SplitMsgField.BYTE_LENGTH;
        if (!autoQuoteRequest.parse(data, cursor)) {
            return false;
        }
        cursor += AutoQuoteRequestField.BYTE_LENGTH;
        if (!possRetransFlag.parse(data, cursor)) {
            return false;
        }
        cursor += PossRetransFlagField.BYTE_LENGTH;
        if (!responseLegsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += responseLegsGroups.byteLength();
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
        cursor = financialInstrumentFullName.encode(data, cursor);
        cursor = senderId.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = partyDetailsListReqId.encode(data, cursor);
        cursor = securityReqId.encode(data, cursor);
        cursor = securityResponseId.encode(data, cursor);
        cursor = sendingTimeEpoch.encode(data, cursor);
        cursor = securityGroup.encode(data, cursor);
        cursor = securityType.encode(data, cursor);
        cursor = location.encode(data, cursor);
        cursor = securityIdOptional.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = maturityMonthYear.encode(data, cursor);
        cursor = delayDuration.encode(data, cursor);
        cursor = startDate.encode(data, cursor);
        cursor = endDate.encode(data, cursor);
        cursor = maxNoOfSubstitutions.encode(data, cursor);
        cursor = sourceRepoId.encode(data, cursor);
        cursor = terminationType.encode(data, cursor);
        cursor = securityResponseType.encode(data, cursor);
        cursor = expirationCycle.encode(data, cursor);
        cursor = manualOrderIndicator.encode(data, cursor);
        cursor = splitMsg.encode(data, cursor);
        cursor = autoQuoteRequest.encode(data, cursor);
        cursor = possRetransFlag.encode(data, cursor);
        cursor = responseLegsGroups.encode(data, cursor);
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
        maturityMonthYear.clear();
        responseLegsGroups.clear();
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
        if (!responseLegsGroups.isRecognized()) {
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
        if (!responseLegsGroups.isValid()) {
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
        if (!financialInstrumentFullName.isDecoded()) {
            return Optional.of(financialInstrumentFullName);
        }
        if (!senderId.isDecoded()) {
            return Optional.of(senderId);
        }
        if (!symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (!partyDetailsListReqId.isDecoded()) {
            return Optional.of(partyDetailsListReqId);
        }
        if (!securityReqId.isDecoded()) {
            return Optional.of(securityReqId);
        }
        if (!securityResponseId.isDecoded()) {
            return Optional.of(securityResponseId);
        }
        if (!sendingTimeEpoch.isDecoded()) {
            return Optional.of(sendingTimeEpoch);
        }
        if (!securityGroup.isDecoded()) {
            return Optional.of(securityGroup);
        }
        if (!securityType.isDecoded()) {
            return Optional.of(securityType);
        }
        if (!location.isDecoded()) {
            return Optional.of(location);
        }
        if (!securityIdOptional.isDecoded()) {
            return Optional.of(securityIdOptional);
        }
        if (!currency.isDecoded()) {
            return Optional.of(currency);
        }
        if (!maturityMonthYear.isDecoded()) {
            return maturityMonthYear.failedAt();
        }
        if (!delayDuration.isDecoded()) {
            return Optional.of(delayDuration);
        }
        if (!startDate.isDecoded()) {
            return Optional.of(startDate);
        }
        if (!endDate.isDecoded()) {
            return Optional.of(endDate);
        }
        if (!maxNoOfSubstitutions.isDecoded()) {
            return Optional.of(maxNoOfSubstitutions);
        }
        if (!sourceRepoId.isDecoded()) {
            return Optional.of(sourceRepoId);
        }
        if (!terminationType.isDecoded()) {
            return Optional.of(terminationType);
        }
        if (!securityResponseType.isDecoded()) {
            return Optional.of(securityResponseType);
        }
        if (!expirationCycle.isDecoded()) {
            return Optional.of(expirationCycle);
        }
        if (!manualOrderIndicator.isDecoded()) {
            return Optional.of(manualOrderIndicator);
        }
        if (!splitMsg.isDecoded()) {
            return Optional.of(splitMsg);
        }
        if (!autoQuoteRequest.isDecoded()) {
            return Optional.of(autoQuoteRequest);
        }
        if (!possRetransFlag.isDecoded()) {
            return Optional.of(possRetransFlag);
        }
        if (!responseLegsGroups.isDecoded()) {
            return responseLegsGroups.failedAt();
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
            case "FinancialInstrumentFullName" -> Optional.of(financialInstrumentFullName);
            case "SenderId" -> Optional.of(senderId);
            case "Symbol" -> Optional.of(symbol);
            case "PartyDetailsListReqId" -> Optional.of(partyDetailsListReqId);
            case "SecurityReqId" -> Optional.of(securityReqId);
            case "SecurityResponseId" -> Optional.of(securityResponseId);
            case "SendingTimeEpoch" -> Optional.of(sendingTimeEpoch);
            case "SecurityGroup" -> Optional.of(securityGroup);
            case "SecurityType" -> Optional.of(securityType);
            case "Location" -> Optional.of(location);
            case "SecurityIdOptional" -> Optional.of(securityIdOptional);
            case "Currency" -> Optional.of(currency);
            case "DelayDuration" -> Optional.of(delayDuration);
            case "StartDate" -> Optional.of(startDate);
            case "EndDate" -> Optional.of(endDate);
            case "MaxNoOfSubstitutions" -> Optional.of(maxNoOfSubstitutions);
            case "SourceRepoId" -> Optional.of(sourceRepoId);
            case "TerminationType" -> Optional.of(terminationType);
            case "SecurityResponseType" -> Optional.of(securityResponseType);
            case "ExpirationCycle" -> Optional.of(expirationCycle);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "SplitMsg" -> Optional.of(splitMsg);
            case "AutoQuoteRequest" -> Optional.of(autoQuoteRequest);
            case "PossRetransFlag" -> Optional.of(possRetransFlag);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityDefinitionResponse message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(responseLegsGroups.diffFields(message.responseLegsGroups));
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
            responseLegsGroups.toFormattedString(builder, options);
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
        responseLegsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof SecurityDefinitionResponse message)) {
            return false;
        }
        return fields.equals(message.fields) && responseLegsGroups.equals(message.responseLegsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, responseLegsGroups);
    }
}
