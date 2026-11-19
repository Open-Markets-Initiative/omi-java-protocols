package omi.euronext.optiq.dropcopygateway.sbe.v5_35.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.BookInField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.BookOutTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ClientOrderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ConsumeTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.DarkExecutionInstructionField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.EmmField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.EndClientField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.EventIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.FirmIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.FirmIdPublicationField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.MinOrderQtyField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.MsgSeqNumField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OeSessionIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OeginFromMemberField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OegoutTimeToMeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OrderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OrderQtyField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OrderSideOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ProduceTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.RfqStatusField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.SequenceTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.SymbolIndexField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.DCQuoteRequestMessageNonModifiableShortCodesGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.DCQuoteRequestMessageShortCodesDetailsNonModifiableGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.Message;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.PrintOptions;

/**
 * Represents the DcQuoteRequestMessage message from the DropCopyGateway protocol.
 *
 * <p>DCQuoteRequestMessage</p>
 */
public final class DcQuoteRequestMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 140;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Dc Quote Request Message";

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
     * eventId
     */
    private final EventIdField eventId = new EventIdField();

    /**
     * bookIn
     */
    private final BookInField bookIn = new BookInField();

    /**
     * bookOUTTime
     */
    private final BookOutTimeField bookOutTime = new BookOutTimeField();

    /**
     * clientOrderID
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * DarkExecutionInstruction_set bit set
     */
    private final DarkExecutionInstructionField darkExecutionInstruction = new DarkExecutionInstructionField();

    /**
     * eMM
     */
    private final EmmField emm = new EmmField();

    /**
     * endClient
     */
    private final EndClientField endClient = new EndClientField();

    /**
     * firmID
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * firmIDPublication
     */
    private final FirmIdPublicationField firmIdPublication = new FirmIdPublicationField();

    /**
     * oESessionID
     */
    private final OeSessionIdField oeSessionId = new OeSessionIdField();

    /**
     * oEGINFromMember
     */
    private final OeginFromMemberField oeginFromMember = new OeginFromMemberField();

    /**
     * oEGOUTTimeToME
     */
    private final OegoutTimeToMeField oegoutTimeToMe = new OegoutTimeToMeField();

    /**
     * orderID
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * orderQty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * orderSide
     */
    private final OrderSideOptionalField orderSideOptional = new OrderSideOptionalField();

    /**
     * rFQStatus
     */
    private final RfqStatusField rfqStatus = new RfqStatusField();

    /**
     * symbolIndex
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * minOrderQty
     */
    private final MinOrderQtyField minOrderQty = new MinOrderQtyField();

    /**
     * sequenceTime
     */
    private final SequenceTimeField sequenceTime = new SequenceTimeField();

    /**
     * NonModifiableShortCodes Block
     */
    private final DCQuoteRequestMessageNonModifiableShortCodesGroups dCQuoteRequestMessageNonModifiableShortCodesGroups = new DCQuoteRequestMessageNonModifiableShortCodesGroups();

    /**
     * ShortCodesDetailsNonModifiable Block
     */
    private final DCQuoteRequestMessageShortCodesDetailsNonModifiableGroups dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups = new DCQuoteRequestMessageShortCodesDetailsNonModifiableGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, produceTime, consumeTime, eventId, bookIn, bookOutTime, clientOrderId, darkExecutionInstruction, emm, endClient, firmId, firmIdPublication, oeSessionId, oeginFromMember, oegoutTimeToMe, orderId, orderQty, orderSideOptional, rfqStatus, symbolIndex, minOrderQty, sequenceTime);

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
     * eventId
     *
     * @return the EventId field
     */
    public EventIdField eventId() {
        return eventId;
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
     * clientOrderID
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * DarkExecutionInstruction_set bit set
     *
     * @return the DarkExecutionInstruction field
     */
    public DarkExecutionInstructionField darkExecutionInstruction() {
        return darkExecutionInstruction;
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
     * endClient
     *
     * @return the EndClient field
     */
    public EndClientField endClient() {
        return endClient;
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
     * firmIDPublication
     *
     * @return the FirmIdPublication field
     */
    public FirmIdPublicationField firmIdPublication() {
        return firmIdPublication;
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
     * orderID
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * orderQty
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * orderSide
     *
     * @return the OrderSideOptional field
     */
    public OrderSideOptionalField orderSideOptional() {
        return orderSideOptional;
    }

    /**
     * rFQStatus
     *
     * @return the RfqStatus field
     */
    public RfqStatusField rfqStatus() {
        return rfqStatus;
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
     * minOrderQty
     *
     * @return the MinOrderQty field
     */
    public MinOrderQtyField minOrderQty() {
        return minOrderQty;
    }

    /**
     * sequenceTime
     *
     * @return the SequenceTime field
     */
    public SequenceTimeField sequenceTime() {
        return sequenceTime;
    }

    /**
     * NonModifiableShortCodes Block
     *
     * @return the DCQuoteRequestMessageNonModifiableShortCodesGroups record
     */
    public DCQuoteRequestMessageNonModifiableShortCodesGroups dCQuoteRequestMessageNonModifiableShortCodesGroups() {
        return dCQuoteRequestMessageNonModifiableShortCodesGroups;
    }

    /**
     * ShortCodesDetailsNonModifiable Block
     *
     * @return the DCQuoteRequestMessageShortCodesDetailsNonModifiableGroups record
     */
    public DCQuoteRequestMessageShortCodesDetailsNonModifiableGroups dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups() {
        return dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + dCQuoteRequestMessageNonModifiableShortCodesGroups.byteLength() - DCQuoteRequestMessageNonModifiableShortCodesGroups.MINIMUM_BYTE_LENGTH + dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups.byteLength() - DCQuoteRequestMessageShortCodesDetailsNonModifiableGroups.MINIMUM_BYTE_LENGTH;
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
        if (!produceTime.parse(data, cursor)) {
            return false;
        }
        cursor += ProduceTimeField.BYTE_LENGTH;
        if (!consumeTime.parse(data, cursor)) {
            return false;
        }
        cursor += ConsumeTimeField.BYTE_LENGTH;
        if (!eventId.parse(data, cursor)) {
            return false;
        }
        cursor += EventIdField.BYTE_LENGTH;
        if (!bookIn.parse(data, cursor)) {
            return false;
        }
        cursor += BookInField.BYTE_LENGTH;
        if (!bookOutTime.parse(data, cursor)) {
            return false;
        }
        cursor += BookOutTimeField.BYTE_LENGTH;
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!darkExecutionInstruction.parse(data, cursor)) {
            return false;
        }
        cursor += DarkExecutionInstructionField.BYTE_LENGTH;
        if (!emm.parse(data, cursor)) {
            return false;
        }
        cursor += EmmField.BYTE_LENGTH;
        if (!endClient.parse(data, cursor)) {
            return false;
        }
        cursor += EndClientField.BYTE_LENGTH;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!firmIdPublication.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdPublicationField.BYTE_LENGTH;
        if (!oeSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += OeSessionIdField.BYTE_LENGTH;
        if (!oeginFromMember.parse(data, cursor)) {
            return false;
        }
        cursor += OeginFromMemberField.BYTE_LENGTH;
        if (!oegoutTimeToMe.parse(data, cursor)) {
            return false;
        }
        cursor += OegoutTimeToMeField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!orderSideOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OrderSideOptionalField.BYTE_LENGTH;
        if (!rfqStatus.parse(data, cursor)) {
            return false;
        }
        cursor += RfqStatusField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!minOrderQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinOrderQtyField.BYTE_LENGTH;
        if (!sequenceTime.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceTimeField.BYTE_LENGTH;
        if (!dCQuoteRequestMessageNonModifiableShortCodesGroups.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += dCQuoteRequestMessageNonModifiableShortCodesGroups.byteLength();
        if (end - cursor < 2) {
            return false;
        }
        if (!dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = msgSeqNum.encode(data, cursor);
        cursor = produceTime.encode(data, cursor);
        cursor = consumeTime.encode(data, cursor);
        cursor = eventId.encode(data, cursor);
        cursor = bookIn.encode(data, cursor);
        cursor = bookOutTime.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = darkExecutionInstruction.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = endClient.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = firmIdPublication.encode(data, cursor);
        cursor = oeSessionId.encode(data, cursor);
        cursor = oeginFromMember.encode(data, cursor);
        cursor = oegoutTimeToMe.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = orderSideOptional.encode(data, cursor);
        cursor = rfqStatus.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = minOrderQty.encode(data, cursor);
        cursor = sequenceTime.encode(data, cursor);
        cursor = dCQuoteRequestMessageNonModifiableShortCodesGroups.encode(data, cursor);
        cursor = dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups.encode(data, cursor);
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
        dCQuoteRequestMessageNonModifiableShortCodesGroups.clear();
        dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups.clear();
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
        if (!dCQuoteRequestMessageNonModifiableShortCodesGroups.isRecognized()) {
            return false;
        }
        return dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups.isRecognized();
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
        if (!dCQuoteRequestMessageNonModifiableShortCodesGroups.isValid()) {
            return false;
        }
        if (!dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups.isValid()) {
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
        if (!produceTime.isDecoded()) {
            return Optional.of(produceTime);
        }
        if (!consumeTime.isDecoded()) {
            return Optional.of(consumeTime);
        }
        if (!eventId.isDecoded()) {
            return Optional.of(eventId);
        }
        if (!bookIn.isDecoded()) {
            return Optional.of(bookIn);
        }
        if (!bookOutTime.isDecoded()) {
            return Optional.of(bookOutTime);
        }
        if (!clientOrderId.isDecoded()) {
            return Optional.of(clientOrderId);
        }
        if (!darkExecutionInstruction.isDecoded()) {
            return Optional.of(darkExecutionInstruction);
        }
        if (!emm.isDecoded()) {
            return Optional.of(emm);
        }
        if (!endClient.isDecoded()) {
            return Optional.of(endClient);
        }
        if (!firmId.isDecoded()) {
            return Optional.of(firmId);
        }
        if (!firmIdPublication.isDecoded()) {
            return Optional.of(firmIdPublication);
        }
        if (!oeSessionId.isDecoded()) {
            return Optional.of(oeSessionId);
        }
        if (!oeginFromMember.isDecoded()) {
            return Optional.of(oeginFromMember);
        }
        if (!oegoutTimeToMe.isDecoded()) {
            return Optional.of(oegoutTimeToMe);
        }
        if (!orderId.isDecoded()) {
            return Optional.of(orderId);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (!orderSideOptional.isDecoded()) {
            return Optional.of(orderSideOptional);
        }
        if (!rfqStatus.isDecoded()) {
            return Optional.of(rfqStatus);
        }
        if (!symbolIndex.isDecoded()) {
            return Optional.of(symbolIndex);
        }
        if (!minOrderQty.isDecoded()) {
            return Optional.of(minOrderQty);
        }
        if (!sequenceTime.isDecoded()) {
            return Optional.of(sequenceTime);
        }
        if (!dCQuoteRequestMessageNonModifiableShortCodesGroups.isDecoded()) {
            return dCQuoteRequestMessageNonModifiableShortCodesGroups.failedAt();
        }
        if (!dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups.isDecoded()) {
            return dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups.failedAt();
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
            case "EventId" -> Optional.of(eventId);
            case "BookIn" -> Optional.of(bookIn);
            case "BookOutTime" -> Optional.of(bookOutTime);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "DarkExecutionInstruction" -> Optional.of(darkExecutionInstruction);
            case "Emm" -> Optional.of(emm);
            case "EndClient" -> Optional.of(endClient);
            case "FirmId" -> Optional.of(firmId);
            case "FirmIdPublication" -> Optional.of(firmIdPublication);
            case "OeSessionId" -> Optional.of(oeSessionId);
            case "OeginFromMember" -> Optional.of(oeginFromMember);
            case "OegoutTimeToMe" -> Optional.of(oegoutTimeToMe);
            case "OrderId" -> Optional.of(orderId);
            case "OrderQty" -> Optional.of(orderQty);
            case "OrderSideOptional" -> Optional.of(orderSideOptional);
            case "RfqStatus" -> Optional.of(rfqStatus);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "MinOrderQty" -> Optional.of(minOrderQty);
            case "SequenceTime" -> Optional.of(sequenceTime);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DcQuoteRequestMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(dCQuoteRequestMessageNonModifiableShortCodesGroups.diffFields(message.dCQuoteRequestMessageNonModifiableShortCodesGroups));
        changed.addAll(dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups.diffFields(message.dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups));
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
            dCQuoteRequestMessageNonModifiableShortCodesGroups.toFormattedString(builder, options);
            builder.append(", ");
            dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups.toFormattedString(builder, options);
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
        dCQuoteRequestMessageNonModifiableShortCodesGroups.toFormattedString(builder, nested);
        dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof DcQuoteRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && dCQuoteRequestMessageNonModifiableShortCodesGroups.equals(message.dCQuoteRequestMessageNonModifiableShortCodesGroups) && dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups.equals(message.dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, dCQuoteRequestMessageNonModifiableShortCodesGroups, dCQuoteRequestMessageShortCodesDetailsNonModifiableGroups);
    }
}
