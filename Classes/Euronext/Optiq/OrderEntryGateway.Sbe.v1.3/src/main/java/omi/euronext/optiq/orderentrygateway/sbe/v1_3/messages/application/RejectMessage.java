package omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.BookInOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.BookOutTimeOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClientOrderIdOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.EmmOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ErrorCodeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.FirmIdOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.MsgSeqNumField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OegInFromMeOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OegInFromMemberField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OegOutTimeToMeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OegOutToMemberOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrderIdOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.RejectedMessageField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.RejectedMessageIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SendingTimeOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SymbolIndexOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.structs.CollarFieldsGroups;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Field;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Message;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.PrintOptions;

/**
 * Represents the RejectMessage message from the OrderEntryGateway protocol.
 *
 * <p>RejectMessage</p>
 */
public final class RejectMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 96;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Reject Message";

    /**
     * msgSeqNum
     */
    private final MsgSeqNumField msgSeqNum = new MsgSeqNumField();

    /**
     * firmID
     */
    private final FirmIdOptionalField firmIdOptional = new FirmIdOptionalField();

    /**
     * sendingTime
     */
    private final SendingTimeOptionalField sendingTimeOptional = new SendingTimeOptionalField();

    /**
     * oEGINFromMember
     */
    private final OegInFromMemberField oegInFromMember = new OegInFromMemberField();

    /**
     * oEGOUTTimeToME
     */
    private final OegOutTimeToMeField oegOutTimeToMe = new OegOutTimeToMeField();

    /**
     * bookIn
     */
    private final BookInOptionalField bookInOptional = new BookInOptionalField();

    /**
     * bookOUTTime
     */
    private final BookOutTimeOptionalField bookOutTimeOptional = new BookOutTimeOptionalField();

    /**
     * oEGINFromME
     */
    private final OegInFromMeOptionalField oegInFromMeOptional = new OegInFromMeOptionalField();

    /**
     * oEGOUTToMember
     */
    private final OegOutToMemberOptionalField oegOutToMemberOptional = new OegOutToMemberOptionalField();

    /**
     * clientOrderID
     */
    private final ClientOrderIdOptionalField clientOrderIdOptional = new ClientOrderIdOptionalField();

    /**
     * orderID
     */
    private final OrderIdOptionalField orderIdOptional = new OrderIdOptionalField();

    /**
     * symbolIndex
     */
    private final SymbolIndexOptionalField symbolIndexOptional = new SymbolIndexOptionalField();

    /**
     * eMM
     */
    private final EmmOptionalField emmOptional = new EmmOptionalField();

    /**
     * rejectedMessage
     */
    private final RejectedMessageField rejectedMessage = new RejectedMessageField();

    /**
     * errorCode
     */
    private final ErrorCodeField errorCode = new ErrorCodeField();

    /**
     * rejectedMessageID
     */
    private final RejectedMessageIdField rejectedMessageId = new RejectedMessageIdField();

    /**
     * CollarFields Block
     */
    private final CollarFieldsGroups collarFieldsGroups = new CollarFieldsGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, firmIdOptional, sendingTimeOptional, oegInFromMember, oegOutTimeToMe, bookInOptional, bookOutTimeOptional, oegInFromMeOptional, oegOutToMemberOptional, clientOrderIdOptional, orderIdOptional, symbolIndexOptional, emmOptional, rejectedMessage, errorCode, rejectedMessageId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * msgSeqNum
     *
     * @return the MsgSeqNum field
     */
    public MsgSeqNumField msgSeqNum() {
        return msgSeqNum;
    }

    /**
     * firmID
     *
     * @return the FirmIdOptional field
     */
    public FirmIdOptionalField firmIdOptional() {
        return firmIdOptional;
    }

    /**
     * sendingTime
     *
     * @return the SendingTimeOptional field
     */
    public SendingTimeOptionalField sendingTimeOptional() {
        return sendingTimeOptional;
    }

    /**
     * oEGINFromMember
     *
     * @return the OegInFromMember field
     */
    public OegInFromMemberField oegInFromMember() {
        return oegInFromMember;
    }

    /**
     * oEGOUTTimeToME
     *
     * @return the OegOutTimeToMe field
     */
    public OegOutTimeToMeField oegOutTimeToMe() {
        return oegOutTimeToMe;
    }

    /**
     * bookIn
     *
     * @return the BookInOptional field
     */
    public BookInOptionalField bookInOptional() {
        return bookInOptional;
    }

    /**
     * bookOUTTime
     *
     * @return the BookOutTimeOptional field
     */
    public BookOutTimeOptionalField bookOutTimeOptional() {
        return bookOutTimeOptional;
    }

    /**
     * oEGINFromME
     *
     * @return the OegInFromMeOptional field
     */
    public OegInFromMeOptionalField oegInFromMeOptional() {
        return oegInFromMeOptional;
    }

    /**
     * oEGOUTToMember
     *
     * @return the OegOutToMemberOptional field
     */
    public OegOutToMemberOptionalField oegOutToMemberOptional() {
        return oegOutToMemberOptional;
    }

    /**
     * clientOrderID
     *
     * @return the ClientOrderIdOptional field
     */
    public ClientOrderIdOptionalField clientOrderIdOptional() {
        return clientOrderIdOptional;
    }

    /**
     * orderID
     *
     * @return the OrderIdOptional field
     */
    public OrderIdOptionalField orderIdOptional() {
        return orderIdOptional;
    }

    /**
     * symbolIndex
     *
     * @return the SymbolIndexOptional field
     */
    public SymbolIndexOptionalField symbolIndexOptional() {
        return symbolIndexOptional;
    }

    /**
     * eMM
     *
     * @return the EmmOptional field
     */
    public EmmOptionalField emmOptional() {
        return emmOptional;
    }

    /**
     * rejectedMessage
     *
     * @return the RejectedMessage field
     */
    public RejectedMessageField rejectedMessage() {
        return rejectedMessage;
    }

    /**
     * errorCode
     *
     * @return the ErrorCode field
     */
    public ErrorCodeField errorCode() {
        return errorCode;
    }

    /**
     * rejectedMessageID
     *
     * @return the RejectedMessageId field
     */
    public RejectedMessageIdField rejectedMessageId() {
        return rejectedMessageId;
    }

    /**
     * CollarFields Block
     *
     * @return the CollarFieldsGroups record
     */
    public CollarFieldsGroups collarFieldsGroups() {
        return collarFieldsGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + collarFieldsGroups.byteLength() - CollarFieldsGroups.MINIMUM_BYTE_LENGTH;
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
        return Optional.empty();
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
        if (!msgSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += MsgSeqNumField.BYTE_LENGTH;
        if (!firmIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdOptionalField.BYTE_LENGTH;
        if (!sendingTimeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SendingTimeOptionalField.BYTE_LENGTH;
        if (!oegInFromMember.parse(data, cursor)) {
            return false;
        }
        cursor += OegInFromMemberField.BYTE_LENGTH;
        if (!oegOutTimeToMe.parse(data, cursor)) {
            return false;
        }
        cursor += OegOutTimeToMeField.BYTE_LENGTH;
        if (!bookInOptional.parse(data, cursor)) {
            return false;
        }
        cursor += BookInOptionalField.BYTE_LENGTH;
        if (!bookOutTimeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += BookOutTimeOptionalField.BYTE_LENGTH;
        if (!oegInFromMeOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OegInFromMeOptionalField.BYTE_LENGTH;
        if (!oegOutToMemberOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OegOutToMemberOptionalField.BYTE_LENGTH;
        if (!clientOrderIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdOptionalField.BYTE_LENGTH;
        if (!orderIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdOptionalField.BYTE_LENGTH;
        if (!symbolIndexOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexOptionalField.BYTE_LENGTH;
        if (!emmOptional.parse(data, cursor)) {
            return false;
        }
        cursor += EmmOptionalField.BYTE_LENGTH;
        if (!rejectedMessage.parse(data, cursor)) {
            return false;
        }
        cursor += RejectedMessageField.BYTE_LENGTH;
        if (!errorCode.parse(data, cursor)) {
            return false;
        }
        cursor += ErrorCodeField.BYTE_LENGTH;
        if (!rejectedMessageId.parse(data, cursor)) {
            return false;
        }
        cursor += RejectedMessageIdField.BYTE_LENGTH;
        if (!collarFieldsGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += collarFieldsGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = msgSeqNum.encode(data, cursor);
        cursor = firmIdOptional.encode(data, cursor);
        cursor = sendingTimeOptional.encode(data, cursor);
        cursor = oegInFromMember.encode(data, cursor);
        cursor = oegOutTimeToMe.encode(data, cursor);
        cursor = bookInOptional.encode(data, cursor);
        cursor = bookOutTimeOptional.encode(data, cursor);
        cursor = oegInFromMeOptional.encode(data, cursor);
        cursor = oegOutToMemberOptional.encode(data, cursor);
        cursor = clientOrderIdOptional.encode(data, cursor);
        cursor = orderIdOptional.encode(data, cursor);
        cursor = symbolIndexOptional.encode(data, cursor);
        cursor = emmOptional.encode(data, cursor);
        cursor = rejectedMessage.encode(data, cursor);
        cursor = errorCode.encode(data, cursor);
        cursor = rejectedMessageId.encode(data, cursor);
        cursor = collarFieldsGroups.encode(data, cursor);
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
        collarFieldsGroups.clear();
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
        return collarFieldsGroups.isRecognized();
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
        if (!collarFieldsGroups.isValid()) {
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
        if (!msgSeqNum.isDecoded()) {
            return Optional.of(msgSeqNum);
        }
        if (!firmIdOptional.isDecoded()) {
            return Optional.of(firmIdOptional);
        }
        if (!sendingTimeOptional.isDecoded()) {
            return Optional.of(sendingTimeOptional);
        }
        if (!oegInFromMember.isDecoded()) {
            return Optional.of(oegInFromMember);
        }
        if (!oegOutTimeToMe.isDecoded()) {
            return Optional.of(oegOutTimeToMe);
        }
        if (!bookInOptional.isDecoded()) {
            return Optional.of(bookInOptional);
        }
        if (!bookOutTimeOptional.isDecoded()) {
            return Optional.of(bookOutTimeOptional);
        }
        if (!oegInFromMeOptional.isDecoded()) {
            return Optional.of(oegInFromMeOptional);
        }
        if (!oegOutToMemberOptional.isDecoded()) {
            return Optional.of(oegOutToMemberOptional);
        }
        if (!clientOrderIdOptional.isDecoded()) {
            return Optional.of(clientOrderIdOptional);
        }
        if (!orderIdOptional.isDecoded()) {
            return Optional.of(orderIdOptional);
        }
        if (!symbolIndexOptional.isDecoded()) {
            return Optional.of(symbolIndexOptional);
        }
        if (!emmOptional.isDecoded()) {
            return Optional.of(emmOptional);
        }
        if (!rejectedMessage.isDecoded()) {
            return Optional.of(rejectedMessage);
        }
        if (!errorCode.isDecoded()) {
            return Optional.of(errorCode);
        }
        if (!rejectedMessageId.isDecoded()) {
            return Optional.of(rejectedMessageId);
        }
        if (!collarFieldsGroups.isDecoded()) {
            return collarFieldsGroups.failedAt();
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
            case "MsgSeqNum" -> Optional.of(msgSeqNum);
            case "FirmIdOptional" -> Optional.of(firmIdOptional);
            case "SendingTimeOptional" -> Optional.of(sendingTimeOptional);
            case "OegInFromMember" -> Optional.of(oegInFromMember);
            case "OegOutTimeToMe" -> Optional.of(oegOutTimeToMe);
            case "BookInOptional" -> Optional.of(bookInOptional);
            case "BookOutTimeOptional" -> Optional.of(bookOutTimeOptional);
            case "OegInFromMeOptional" -> Optional.of(oegInFromMeOptional);
            case "OegOutToMemberOptional" -> Optional.of(oegOutToMemberOptional);
            case "ClientOrderIdOptional" -> Optional.of(clientOrderIdOptional);
            case "OrderIdOptional" -> Optional.of(orderIdOptional);
            case "SymbolIndexOptional" -> Optional.of(symbolIndexOptional);
            case "EmmOptional" -> Optional.of(emmOptional);
            case "RejectedMessage" -> Optional.of(rejectedMessage);
            case "ErrorCode" -> Optional.of(errorCode);
            case "RejectedMessageId" -> Optional.of(rejectedMessageId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof RejectMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(collarFieldsGroups.diffFields(message.collarFieldsGroups));
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
            collarFieldsGroups.toFormattedString(builder, options);
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
        collarFieldsGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof RejectMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && collarFieldsGroups.equals(message.collarFieldsGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, collarFieldsGroups);
    }
}
