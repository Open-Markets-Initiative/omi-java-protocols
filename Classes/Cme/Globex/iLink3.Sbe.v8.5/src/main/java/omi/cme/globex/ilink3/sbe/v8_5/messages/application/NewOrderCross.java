package omi.cme.globex.ilink3.sbe.v8_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cme.globex.ilink3.sbe.v8_5.fields.CrossIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.LocationField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.ManualOrderIndicatorField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.OrderRequestIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.PriceField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SecurityIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SenderIdField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SendingTimeEpochField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.SeqNumField;
import omi.cme.globex.ilink3.sbe.v8_5.fields.TransBkdTimeField;
import omi.cme.globex.ilink3.sbe.v8_5.structs.SidesGroups;
import omi.cme.globex.ilink3.sbe.v8_5.types.Field;
import omi.cme.globex.ilink3.sbe.v8_5.types.Message;
import omi.cme.globex.ilink3.sbe.v8_5.types.PrintOptions;

/**
 * Represents the NewOrderCross message from the iLink3 protocol.
 *
 * <p>The New Order Cross message submits a Cross on CME Globex, a two-sided order submitted by a single party/broker at the same price and quantity.</p>
 */
public final class NewOrderCross implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 77;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Cross";

    /**
     * Identifier for a cross order. Must be unique during a given trading day
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * Use OrderRequestID to identify a request to enter, modify or delete an order and echo the value on the ExecutionReport representing the response
     */
    private final OrderRequestIdField orderRequestId = new OrderRequestIdField();

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
     * Price per share or contract
     */
    private final PriceField price = new PriceField();

    /**
     * For derivatives a date and time stamp to indicate when this order was booked with the agent prior to submission to the exchange. Indicates the time at which the order was finalized between the buyer and seller prior to submission. Expressed as nanoseconds since epoch time
     */
    private final TransBkdTimeField transBkdTime = new TransBkdTimeField();

    /**
     * Time when the message is sent. 64-bit integer expressing the number of nano seconds since midnight January 1, 1970.
     */
    private final SendingTimeEpochField sendingTimeEpoch = new SendingTimeEpochField();

    /**
     * Text describing sender's location (i.e. geopraphic location and/or desk)
     */
    private final LocationField location = new LocationField();

    /**
     * Security ID as defined by CME. For the security ID list, see the security definition messages
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * NoSides Block
     */
    private final SidesGroups sidesGroups = new SidesGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(crossId, orderRequestId, manualOrderIndicator, seqNum, senderId, price, transBkdTime, sendingTimeEpoch, location, securityId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Identifier for a cross order. Must be unique during a given trading day
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
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
     * Price per share or contract
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * For derivatives a date and time stamp to indicate when this order was booked with the agent prior to submission to the exchange. Indicates the time at which the order was finalized between the buyer and seller prior to submission. Expressed as nanoseconds since epoch time
     *
     * @return the TransBkdTime field
     */
    public TransBkdTimeField transBkdTime() {
        return transBkdTime;
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
     * NoSides Block
     *
     * @return the SidesGroups record
     */
    public SidesGroups sidesGroups() {
        return sidesGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + sidesGroups.byteLength() - SidesGroups.MINIMUM_BYTE_LENGTH;
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
        if (!crossId.parse(data, cursor)) {
            return false;
        }
        cursor += CrossIdField.BYTE_LENGTH;
        if (!orderRequestId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderRequestIdField.BYTE_LENGTH;
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
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!transBkdTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransBkdTimeField.BYTE_LENGTH;
        if (!sendingTimeEpoch.parse(data, cursor)) {
            return false;
        }
        cursor += SendingTimeEpochField.BYTE_LENGTH;
        if (!location.parse(data, cursor)) {
            return false;
        }
        cursor += LocationField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!sidesGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += sidesGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = crossId.encode(data, cursor);
        cursor = orderRequestId.encode(data, cursor);
        cursor = manualOrderIndicator.encode(data, cursor);
        cursor = seqNum.encode(data, cursor);
        cursor = senderId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = transBkdTime.encode(data, cursor);
        cursor = sendingTimeEpoch.encode(data, cursor);
        cursor = location.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = sidesGroups.encode(data, cursor);
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
        sidesGroups.clear();
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
        return sidesGroups.isRecognized();
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
        if (!sidesGroups.isValid()) {
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
        if (!crossId.isDecoded()) {
            return Optional.of(crossId);
        }
        if (!orderRequestId.isDecoded()) {
            return Optional.of(orderRequestId);
        }
        if (!manualOrderIndicator.isDecoded()) {
            return Optional.of(manualOrderIndicator);
        }
        if (!seqNum.isDecoded()) {
            return Optional.of(seqNum);
        }
        if (!senderId.isDecoded()) {
            return Optional.of(senderId);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!transBkdTime.isDecoded()) {
            return Optional.of(transBkdTime);
        }
        if (!sendingTimeEpoch.isDecoded()) {
            return Optional.of(sendingTimeEpoch);
        }
        if (!location.isDecoded()) {
            return Optional.of(location);
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!sidesGroups.isDecoded()) {
            return sidesGroups.failedAt();
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
            case "CrossId" -> Optional.of(crossId);
            case "OrderRequestId" -> Optional.of(orderRequestId);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "SeqNum" -> Optional.of(seqNum);
            case "SenderId" -> Optional.of(senderId);
            case "Price" -> Optional.of(price);
            case "TransBkdTime" -> Optional.of(transBkdTime);
            case "SendingTimeEpoch" -> Optional.of(sendingTimeEpoch);
            case "Location" -> Optional.of(location);
            case "SecurityId" -> Optional.of(securityId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderCross message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(sidesGroups.diffFields(message.sidesGroups));
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
            sidesGroups.toFormattedString(builder, options);
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
        sidesGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof NewOrderCross message)) {
            return false;
        }
        return fields.equals(message.fields) && sidesGroups.equals(message.sidesGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, sidesGroups);
    }
}
