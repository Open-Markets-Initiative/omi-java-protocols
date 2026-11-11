package omi.cme.globex.ilink3.sbe.v8_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LocationField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ManualOrderIndicatorField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MarketSegmentIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MassStatusReqIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MassStatusReqTypeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.MassStatusTifField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrdStatusReqTypeField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PartyDetailsListReqIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecurityGroupField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecurityIdOptionalField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SenderIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SendingTimeEpochField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SeqNumField;
import omi.cme.globex.ilink3.sbe.v8_5.types.Field;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;
import omi.cme.globex.ilink3.sbe.v8_5.types.PrintOptions;

/**
 * Represents the OrderMassStatusRequest message from the iLink3 protocol.
 *
 * <p>The Order Mass Status Request message requests the status for orders matching criteria specified within the request.</p>
 */
public final class OrderMassStatusRequest implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 68;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Mass Status Request";

    /**
     * Refers to the ID of the related PartyDetailsDefinitionRequest message which will logically be tied to this message
     */
    private final PartyDetailsListReqIdField partyDetailsListReqId = new PartyDetailsListReqIdField();

    /**
     * Unique ID of OrderMassStatusRequest as assigned by the customer and present in Execution Report as well
     */
    private final MassStatusReqIdField massStatusReqId = new MassStatusReqIdField();

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
    private final SenderIdField senderId = new SenderIdField();

    /**
     * Time when the message is sent. 64-bit integer expressing the number of nano seconds since midnight January 1, 1970.
     */
    private final SendingTimeEpochField sendingTimeEpoch = new SendingTimeEpochField();

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
     * Specifies the scope of the OrderMassStatusRequest within the context of working orders only. Status will be returned for all orders matching the criteria specified here for Session and Firm
     */
    private final MassStatusReqTypeField massStatusReqType = new MassStatusReqTypeField();

    /**
     * If present — specifies the scope of the OrderMassStatusRequest within the context of MassStatusRequestType (585) and Session and Firm for working orders only. Status will be returned for all orders matching the criteria specified here for Session and Firm combination
     */
    private final OrdStatusReqTypeField ordStatusReqType = new OrdStatusReqTypeField();

    /**
     * Specifies the scope of the OrderMassStatusRequest within the context of MassStatusRequestType (585) if present. Absence of this field is interpreted as Day &amp; GTC &amp; GTD. FAK is excluded since scope is limited to working orders only
     */
    private final MassStatusTifField massStatusTif = new MassStatusTifField();

    /**
     * Specifies the market segment (physical match engine partition) for which working orders should be cancelled. Conditionally Required if MassActionScope="Market Segment" (Tag 1374=9). Will be ignored if present for any other criteria specified in MassActionScope besides Market Segment
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(partyDetailsListReqId, massStatusReqId, manualOrderIndicator, seqNum, senderId, sendingTimeEpoch, securityGroup, location, securityIdOptional, massStatusReqType, ordStatusReqType, massStatusTif, marketSegmentId);

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
     * Unique ID of OrderMassStatusRequest as assigned by the customer and present in Execution Report as well
     *
     * @return the MassStatusReqId field
     */
    public MassStatusReqIdField massStatusReqId() {
        return massStatusReqId;
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
     * @return the SenderId field
     */
    public SenderIdField senderId() {
        return senderId;
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
     * Specifies the scope of the OrderMassStatusRequest within the context of working orders only. Status will be returned for all orders matching the criteria specified here for Session and Firm
     *
     * @return the MassStatusReqType field
     */
    public MassStatusReqTypeField massStatusReqType() {
        return massStatusReqType;
    }

    /**
     * If present — specifies the scope of the OrderMassStatusRequest within the context of MassStatusRequestType (585) and Session and Firm for working orders only. Status will be returned for all orders matching the criteria specified here for Session and Firm combination
     *
     * @return the OrdStatusReqType field
     */
    public OrdStatusReqTypeField ordStatusReqType() {
        return ordStatusReqType;
    }

    /**
     * Specifies the scope of the OrderMassStatusRequest within the context of MassStatusRequestType (585) if present. Absence of this field is interpreted as Day &amp; GTC &amp; GTD. FAK is excluded since scope is limited to working orders only
     *
     * @return the MassStatusTif field
     */
    public MassStatusTifField massStatusTif() {
        return massStatusTif;
    }

    /**
     * Specifies the market segment (physical match engine partition) for which working orders should be cancelled. Conditionally Required if MassActionScope="Market Segment" (Tag 1374=9). Will be ignored if present for any other criteria specified in MassActionScope besides Market Segment
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!partyDetailsListReqId.parse(data, cursor)) {
            return false;
        }
        cursor += PartyDetailsListReqIdField.BYTE_LENGTH;
        if (!massStatusReqId.parse(data, cursor)) {
            return false;
        }
        cursor += MassStatusReqIdField.BYTE_LENGTH;
        if (!manualOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        if (!seqNum.parse(data, cursor)) {
            return false;
        }
        cursor += SeqNumField.BYTE_LENGTH;
        if (!senderId.parse(data, cursor)) {
            return false;
        }
        cursor += SenderIdField.BYTE_LENGTH;
        if (!sendingTimeEpoch.parse(data, cursor)) {
            return false;
        }
        cursor += SendingTimeEpochField.BYTE_LENGTH;
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
        if (!massStatusReqType.parse(data, cursor)) {
            return false;
        }
        cursor += MassStatusReqTypeField.BYTE_LENGTH;
        if (!ordStatusReqType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdStatusReqTypeField.BYTE_LENGTH;
        if (!massStatusTif.parse(data, cursor)) {
            return false;
        }
        cursor += MassStatusTifField.BYTE_LENGTH;
        return marketSegmentId.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = partyDetailsListReqId.encode(data, cursor);
        cursor = massStatusReqId.encode(data, cursor);
        cursor = manualOrderIndicator.encode(data, cursor);
        cursor = seqNum.encode(data, cursor);
        cursor = senderId.encode(data, cursor);
        cursor = sendingTimeEpoch.encode(data, cursor);
        cursor = securityGroup.encode(data, cursor);
        cursor = location.encode(data, cursor);
        cursor = securityIdOptional.encode(data, cursor);
        cursor = massStatusReqType.encode(data, cursor);
        cursor = ordStatusReqType.encode(data, cursor);
        cursor = massStatusTif.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
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
            case "PartyDetailsListReqId" -> Optional.of(partyDetailsListReqId);
            case "MassStatusReqId" -> Optional.of(massStatusReqId);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "SeqNum" -> Optional.of(seqNum);
            case "SenderId" -> Optional.of(senderId);
            case "SendingTimeEpoch" -> Optional.of(sendingTimeEpoch);
            case "SecurityGroup" -> Optional.of(securityGroup);
            case "Location" -> Optional.of(location);
            case "SecurityIdOptional" -> Optional.of(securityIdOptional);
            case "MassStatusReqType" -> Optional.of(massStatusReqType);
            case "OrdStatusReqType" -> Optional.of(ordStatusReqType);
            case "MassStatusTif" -> Optional.of(massStatusTif);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderMassStatusRequest message)) {
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
        if (!(other instanceof OrderMassStatusRequest message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
