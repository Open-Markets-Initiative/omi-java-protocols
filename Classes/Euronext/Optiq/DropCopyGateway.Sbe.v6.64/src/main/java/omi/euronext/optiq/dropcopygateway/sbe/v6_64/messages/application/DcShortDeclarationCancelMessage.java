package omi.euronext.optiq.dropcopygateway.sbe.v6_64.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.BookInField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.BookOutTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.ClientOrderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.ConsumeTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.DeclarationEventTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.DeclarationIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.DeclarationKillReasonField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.EmmField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.EventIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.FirmIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.MessageSendingTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.MsgSeqNumField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.OeSessionIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.OeginFromMemberField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.OegoutTimeToMeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.ProduceTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.fields.SymbolIndexField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.types.Message;
import omi.euronext.optiq.dropcopygateway.sbe.v6_64.types.PrintOptions;

/**
 * Represents the DcShortDeclarationCancelMessage message from the DropCopyGateway protocol.
 *
 * <p>DCShortDeclarationCancelMessage</p>
 */
public final class DcShortDeclarationCancelMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 107;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Dc Short Declaration Cancel Message";

    /**
     * msgSeqNum
     */
    private final MsgSeqNumField msgSeqNum = new MsgSeqNumField();

    /**
     * produceTime
     */
    private final ProduceTimeField produceTime = new ProduceTimeField();

    /**
     * consumeTime
     */
    private final ConsumeTimeField consumeTime = new ConsumeTimeField();

    /**
     * messageSendingTime
     */
    private final MessageSendingTimeField messageSendingTime = new MessageSendingTimeField();

    /**
     * bookIn
     */
    private final BookInField bookIn = new BookInField();

    /**
     * bookOUTTime
     */
    private final BookOutTimeField bookOutTime = new BookOutTimeField();

    /**
     * oEGINFromMember
     */
    private final OeginFromMemberField oeginFromMember = new OeginFromMemberField();

    /**
     * oEGOUTTimeToME
     */
    private final OegoutTimeToMeField oegoutTimeToMe = new OegoutTimeToMeField();

    /**
     * eventId
     */
    private final EventIdField eventId = new EventIdField();

    /**
     * declarationEventType
     */
    private final DeclarationEventTypeField declarationEventType = new DeclarationEventTypeField();

    /**
     * firmID
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * oESessionID
     */
    private final OeSessionIdField oeSessionId = new OeSessionIdField();

    /**
     * clientOrderID
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * eMM
     */
    private final EmmField emm = new EmmField();

    /**
     * declarationID
     */
    private final DeclarationIdField declarationId = new DeclarationIdField();

    /**
     * symbolIndex
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * declarationKillReason
     */
    private final DeclarationKillReasonField declarationKillReason = new DeclarationKillReasonField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, produceTime, consumeTime, messageSendingTime, bookIn, bookOutTime, oeginFromMember, oegoutTimeToMe, eventId, declarationEventType, firmId, oeSessionId, clientOrderId, emm, declarationId, symbolIndex, declarationKillReason);

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
     * produceTime
     *
     * @return the ProduceTime field
     */
    public ProduceTimeField produceTime() {
        return produceTime;
    }

    /**
     * consumeTime
     *
     * @return the ConsumeTime field
     */
    public ConsumeTimeField consumeTime() {
        return consumeTime;
    }

    /**
     * messageSendingTime
     *
     * @return the MessageSendingTime field
     */
    public MessageSendingTimeField messageSendingTime() {
        return messageSendingTime;
    }

    /**
     * bookIn
     *
     * @return the BookIn field
     */
    public BookInField bookIn() {
        return bookIn;
    }

    /**
     * bookOUTTime
     *
     * @return the BookOutTime field
     */
    public BookOutTimeField bookOutTime() {
        return bookOutTime;
    }

    /**
     * oEGINFromMember
     *
     * @return the OeginFromMember field
     */
    public OeginFromMemberField oeginFromMember() {
        return oeginFromMember;
    }

    /**
     * oEGOUTTimeToME
     *
     * @return the OegoutTimeToMe field
     */
    public OegoutTimeToMeField oegoutTimeToMe() {
        return oegoutTimeToMe;
    }

    /**
     * eventId
     *
     * @return the EventId field
     */
    public EventIdField eventId() {
        return eventId;
    }

    /**
     * declarationEventType
     *
     * @return the DeclarationEventType field
     */
    public DeclarationEventTypeField declarationEventType() {
        return declarationEventType;
    }

    /**
     * firmID
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * oESessionID
     *
     * @return the OeSessionId field
     */
    public OeSessionIdField oeSessionId() {
        return oeSessionId;
    }

    /**
     * clientOrderID
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * eMM
     *
     * @return the Emm field
     */
    public EmmField emm() {
        return emm;
    }

    /**
     * declarationID
     *
     * @return the DeclarationId field
     */
    public DeclarationIdField declarationId() {
        return declarationId;
    }

    /**
     * symbolIndex
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * declarationKillReason
     *
     * @return the DeclarationKillReason field
     */
    public DeclarationKillReasonField declarationKillReason() {
        return declarationKillReason;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!msgSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += MsgSeqNumField.BYTE_LENGTH;
        if (!produceTime.parse(data, cursor)) {
            return false;
        }
        cursor += ProduceTimeField.BYTE_LENGTH;
        if (!consumeTime.parse(data, cursor)) {
            return false;
        }
        cursor += ConsumeTimeField.BYTE_LENGTH;
        if (!messageSendingTime.parse(data, cursor)) {
            return false;
        }
        cursor += MessageSendingTimeField.BYTE_LENGTH;
        if (!bookIn.parse(data, cursor)) {
            return false;
        }
        cursor += BookInField.BYTE_LENGTH;
        if (!bookOutTime.parse(data, cursor)) {
            return false;
        }
        cursor += BookOutTimeField.BYTE_LENGTH;
        if (!oeginFromMember.parse(data, cursor)) {
            return false;
        }
        cursor += OeginFromMemberField.BYTE_LENGTH;
        if (!oegoutTimeToMe.parse(data, cursor)) {
            return false;
        }
        cursor += OegoutTimeToMeField.BYTE_LENGTH;
        if (!eventId.parse(data, cursor)) {
            return false;
        }
        cursor += EventIdField.BYTE_LENGTH;
        if (!declarationEventType.parse(data, cursor)) {
            return false;
        }
        cursor += DeclarationEventTypeField.BYTE_LENGTH;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!oeSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += OeSessionIdField.BYTE_LENGTH;
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!emm.parse(data, cursor)) {
            return false;
        }
        cursor += EmmField.BYTE_LENGTH;
        if (!declarationId.parse(data, cursor)) {
            return false;
        }
        cursor += DeclarationIdField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        return declarationKillReason.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = msgSeqNum.encode(data, cursor);
        cursor = produceTime.encode(data, cursor);
        cursor = consumeTime.encode(data, cursor);
        cursor = messageSendingTime.encode(data, cursor);
        cursor = bookIn.encode(data, cursor);
        cursor = bookOutTime.encode(data, cursor);
        cursor = oeginFromMember.encode(data, cursor);
        cursor = oegoutTimeToMe.encode(data, cursor);
        cursor = eventId.encode(data, cursor);
        cursor = declarationEventType.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = oeSessionId.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = declarationId.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = declarationKillReason.encode(data, cursor);
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
            case "MsgSeqNum" -> Optional.of(msgSeqNum);
            case "ProduceTime" -> Optional.of(produceTime);
            case "ConsumeTime" -> Optional.of(consumeTime);
            case "MessageSendingTime" -> Optional.of(messageSendingTime);
            case "BookIn" -> Optional.of(bookIn);
            case "BookOutTime" -> Optional.of(bookOutTime);
            case "OeginFromMember" -> Optional.of(oeginFromMember);
            case "OegoutTimeToMe" -> Optional.of(oegoutTimeToMe);
            case "EventId" -> Optional.of(eventId);
            case "DeclarationEventType" -> Optional.of(declarationEventType);
            case "FirmId" -> Optional.of(firmId);
            case "OeSessionId" -> Optional.of(oeSessionId);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "Emm" -> Optional.of(emm);
            case "DeclarationId" -> Optional.of(declarationId);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "DeclarationKillReason" -> Optional.of(declarationKillReason);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DcShortDeclarationCancelMessage message)) {
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
        if (!(other instanceof DcShortDeclarationCancelMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
