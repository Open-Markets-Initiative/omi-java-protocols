package omi.cme.globex.ilink3.sbe.v8_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.ilink3.sbe.v8_5.fields.EndDateField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LocationField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ManualOrderIndicatorField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MaxNoOfSubstitutionsField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PartyDetailsListReqIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecurityReqIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecuritySubTypeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SenderIdOptionalField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SendingTimeEpochField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SeqNumField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SourceRepoIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.StartDateField;
import omi.cme.globex.ilink3.sbe.v8_5.structs.RequestLegsGroups;
import omi.cme.globex.ilink3.sbe.v8_5.types.Field;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;
import omi.cme.globex.ilink3.sbe.v8_5.types.PrintOptions;

/**
 * Represents the SecurityDefinitionRequest message from the iLink3 protocol.
 *
 * <p>The Security Definition Request message creates a User Defined Spread (UDS) instrument.</p>
 */
public final class SecurityDefinitionRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 74;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Security Definition Request";

    /**
     * Refers to the ID of the related PartyDetailsDefinitionRequest message which will logically be tied to this message
     */
    private final PartyDetailsListReqIdField partyDetailsListReqId = new PartyDetailsListReqIdField();

    /**
     * Unique identifier for a security definition request. It is incumbent on the market participant to maintain uniqueness
     */
    private final SecurityReqIdField securityReqId = new SecurityReqIdField();

    /**
     * Indicates if the order was initially received manually (as opposed to electronically)
     */
    private final ManualOrderIndicatorField manualOrderIndicator = new ManualOrderIndicatorField();

    /**
     * Sequence number as assigned to message
     */
    private final SeqNumField seqNum = new SeqNumField();

    /**
     * Operator ID. Should be unique per Firm ID. Assigned value used to identify specific message originator. Represents last individual or team in charge of the system which modifies the order before submission to the Globex platform, or if not modified from initiator (party role=118), last individual or team in charge of the system, which submit the order to the Globex platform
     */
    private final SenderIdOptionalField senderIdOptional = new SenderIdOptionalField();

    /**
     * Time when the message is sent. 64-bit integer expressing the number of nano seconds since midnight January 1, 1970.
     */
    private final SendingTimeEpochField sendingTimeEpoch = new SendingTimeEpochField();

    /**
     * Identifies specific type of UDS; valid values are COMBO, COVERED and REPO
     */
    private final SecuritySubTypeField securitySubType = new SecuritySubTypeField();

    /**
     * Text describing sender's location (i.e. geopraphic location and/or desk)
     */
    private final LocationField location = new LocationField();

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
     * NoLegs Block
     */
    private final RequestLegsGroups requestLegsGroups = new RequestLegsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(partyDetailsListReqId, securityReqId, manualOrderIndicator, seqNum, senderIdOptional, sendingTimeEpoch, securitySubType, location, startDate, endDate, maxNoOfSubstitutions, sourceRepoId);

    private byte[] buffer;

    private boolean decoded;

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
     * Indicates if the order was initially received manually (as opposed to electronically)
     *
     * @return the ManualOrderIndicator field
     */
    public ManualOrderIndicatorField manualOrderIndicator() {
        return manualOrderIndicator;
    }

    /**
     * Sequence number as assigned to message
     *
     * @return the SeqNum field
     */
    public SeqNumField seqNum() {
        return seqNum;
    }

    /**
     * Operator ID. Should be unique per Firm ID. Assigned value used to identify specific message originator. Represents last individual or team in charge of the system which modifies the order before submission to the Globex platform, or if not modified from initiator (party role=118), last individual or team in charge of the system, which submit the order to the Globex platform
     *
     * @return the SenderIdOptional field
     */
    public SenderIdOptionalField senderIdOptional() {
        return senderIdOptional;
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
     * Identifies specific type of UDS; valid values are COMBO, COVERED and REPO
     *
     * @return the SecuritySubType field
     */
    public SecuritySubTypeField securitySubType() {
        return securitySubType;
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
     * NoLegs Block
     *
     * @return the RequestLegsGroups record
     */
    public RequestLegsGroups requestLegsGroups() {
        return requestLegsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + requestLegsGroups.byteLength() - RequestLegsGroups.MINIMUM_BYTE_LENGTH;
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
        if (!partyDetailsListReqId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyDetailsListReqIdField.BYTE_LENGTH;
        if (!securityReqId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityReqIdField.BYTE_LENGTH;
        if (!manualOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        if (!seqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SeqNumField.BYTE_LENGTH;
        if (!senderIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SenderIdOptionalField.BYTE_LENGTH;
        if (!sendingTimeEpoch.parse(data, cursor)) {
            return false;
        }
        cursor += SendingTimeEpochField.BYTE_LENGTH;
        if (!securitySubType.parse(data, cursor)) {
            return false;
        }
        cursor += SecuritySubTypeField.BYTE_LENGTH;
        if (!location.parse(data, cursor)) {
            return false;
        }
        cursor += LocationField.BYTE_LENGTH;
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
        if (!requestLegsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += requestLegsGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = partyDetailsListReqId.encode(data, cursor);
        cursor = securityReqId.encode(data, cursor);
        cursor = manualOrderIndicator.encode(data, cursor);
        cursor = seqNum.encode(data, cursor);
        cursor = senderIdOptional.encode(data, cursor);
        cursor = sendingTimeEpoch.encode(data, cursor);
        cursor = securitySubType.encode(data, cursor);
        cursor = location.encode(data, cursor);
        cursor = startDate.encode(data, cursor);
        cursor = endDate.encode(data, cursor);
        cursor = maxNoOfSubstitutions.encode(data, cursor);
        cursor = sourceRepoId.encode(data, cursor);
        cursor = requestLegsGroups.encode(data, cursor);
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
        requestLegsGroups.clear();
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
        return requestLegsGroups.isRecognized();
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
        if (!requestLegsGroups.isValid()) {
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
        if (!partyDetailsListReqId.isDecoded()) {
            return Optional.of(partyDetailsListReqId);
        }
        if (!securityReqId.isDecoded()) {
            return Optional.of(securityReqId);
        }
        if (!manualOrderIndicator.isDecoded()) {
            return Optional.of(manualOrderIndicator);
        }
        if (!seqNum.isDecoded()) {
            return Optional.of(seqNum);
        }
        if (!senderIdOptional.isDecoded()) {
            return Optional.of(senderIdOptional);
        }
        if (!sendingTimeEpoch.isDecoded()) {
            return Optional.of(sendingTimeEpoch);
        }
        if (!securitySubType.isDecoded()) {
            return Optional.of(securitySubType);
        }
        if (!location.isDecoded()) {
            return Optional.of(location);
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
        if (!requestLegsGroups.isDecoded()) {
            return requestLegsGroups.failedAt();
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
            case "PartyDetailsListReqId" -> Optional.of(partyDetailsListReqId);
            case "SecurityReqId" -> Optional.of(securityReqId);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "SeqNum" -> Optional.of(seqNum);
            case "SenderIdOptional" -> Optional.of(senderIdOptional);
            case "SendingTimeEpoch" -> Optional.of(sendingTimeEpoch);
            case "SecuritySubType" -> Optional.of(securitySubType);
            case "Location" -> Optional.of(location);
            case "StartDate" -> Optional.of(startDate);
            case "EndDate" -> Optional.of(endDate);
            case "MaxNoOfSubstitutions" -> Optional.of(maxNoOfSubstitutions);
            case "SourceRepoId" -> Optional.of(sourceRepoId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SecurityDefinitionRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(requestLegsGroups.diffFields(message.requestLegsGroups));
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
            requestLegsGroups.toFormattedString(builder, options);
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
        requestLegsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof SecurityDefinitionRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && requestLegsGroups.equals(message.requestLegsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, requestLegsGroups);
    }
}
