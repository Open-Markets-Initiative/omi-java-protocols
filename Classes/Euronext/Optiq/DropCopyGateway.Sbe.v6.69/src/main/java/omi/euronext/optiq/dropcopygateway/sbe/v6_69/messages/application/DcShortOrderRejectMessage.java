package omi.euronext.optiq.dropcopygateway.sbe.v6_69.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.BookInField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.BookOutTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.BreachedCollarPriceField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.ClientOrderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.CollarRejTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.ConsumeTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.EmmField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.ErrorCodeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.EventIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.FirmIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.MiFidIndicatorsOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.MsgSeqNumField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.OeSessionIdOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.OeginFromMemberOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.OegoutTimeToMeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.OrderEventTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.OrderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.OrderSideOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.ProduceTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.RejectedMessageField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.SymbolIndexField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.TimeInForceOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.structs.DCShortOrderRejectMessageModifiableShortCodesGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.structs.DCShortOrderRejectMessageShortCodesDetailsModifiableGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.types.Message;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.types.PrintOptions;

/**
 * Represents the DcShortOrderRejectMessage message from the DropCopyGateway protocol.
 *
 * <p>DCShortOrderRejectMessage</p>
 */
public final class DcShortOrderRejectMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 117;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Dc Short Order Reject Message";

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
     * orderEventType
     */
    private final OrderEventTypeField orderEventType = new OrderEventTypeField();

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
     * eMM
     */
    private final EmmField emm = new EmmField();

    /**
     * eventId
     */
    private final EventIdField eventId = new EventIdField();

    /**
     * firmID
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * oEGINFromMember
     */
    private final OeginFromMemberOptionalField oeginFromMemberOptional = new OeginFromMemberOptionalField();

    /**
     * oEGOUTTimeToME
     */
    private final OegoutTimeToMeField oegoutTimeToMe = new OegoutTimeToMeField();

    /**
     * orderID
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * symbolIndex
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * breachedCollarPrice
     */
    private final BreachedCollarPriceField breachedCollarPrice = new BreachedCollarPriceField();

    /**
     * collarRejType
     */
    private final CollarRejTypeField collarRejType = new CollarRejTypeField();

    /**
     * rejectedMessage
     */
    private final RejectedMessageField rejectedMessage = new RejectedMessageField();

    /**
     * errorCode
     */
    private final ErrorCodeField errorCode = new ErrorCodeField();

    /**
     * MiFIDIndicators_set bit set
     */
    private final MiFidIndicatorsOptionalField miFidIndicatorsOptional = new MiFidIndicatorsOptionalField();

    /**
     * oESessionID
     */
    private final OeSessionIdOptionalField oeSessionIdOptional = new OeSessionIdOptionalField();

    /**
     * orderSide
     */
    private final OrderSideOptionalField orderSideOptional = new OrderSideOptionalField();

    /**
     * timeInForce
     */
    private final TimeInForceOptionalField timeInForceOptional = new TimeInForceOptionalField();

    /**
     * ModifiableShortCodes Block
     */
    private final DCShortOrderRejectMessageModifiableShortCodesGroups dCShortOrderRejectMessageModifiableShortCodesGroups = new DCShortOrderRejectMessageModifiableShortCodesGroups();

    /**
     * ShortCodesDetailsModifiable Block
     */
    private final DCShortOrderRejectMessageShortCodesDetailsModifiableGroups dCShortOrderRejectMessageShortCodesDetailsModifiableGroups = new DCShortOrderRejectMessageShortCodesDetailsModifiableGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, produceTime, consumeTime, orderEventType, bookIn, bookOutTime, clientOrderId, emm, eventId, firmId, oeginFromMemberOptional, oegoutTimeToMe, orderId, symbolIndex, breachedCollarPrice, collarRejType, rejectedMessage, errorCode, miFidIndicatorsOptional, oeSessionIdOptional, orderSideOptional, timeInForceOptional);

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
     * orderEventType
     *
     * @return the OrderEventType field
     */
    public OrderEventTypeField orderEventType() {
        return orderEventType;
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
     * eMM
     *
     * @return the Emm field
     */
    public EmmField emm() {
        return emm;
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
     * firmID
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * oEGINFromMember
     *
     * @return the OeginFromMemberOptional field
     */
    public OeginFromMemberOptionalField oeginFromMemberOptional() {
        return oeginFromMemberOptional;
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
     * symbolIndex
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * breachedCollarPrice
     *
     * @return the BreachedCollarPrice field
     */
    public BreachedCollarPriceField breachedCollarPrice() {
        return breachedCollarPrice;
    }

    /**
     * collarRejType
     *
     * @return the CollarRejType field
     */
    public CollarRejTypeField collarRejType() {
        return collarRejType;
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
     * MiFIDIndicators_set bit set
     *
     * @return the MiFidIndicatorsOptional field
     */
    public MiFidIndicatorsOptionalField miFidIndicatorsOptional() {
        return miFidIndicatorsOptional;
    }

    /**
     * oESessionID
     *
     * @return the OeSessionIdOptional field
     */
    public OeSessionIdOptionalField oeSessionIdOptional() {
        return oeSessionIdOptional;
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
     * timeInForce
     *
     * @return the TimeInForceOptional field
     */
    public TimeInForceOptionalField timeInForceOptional() {
        return timeInForceOptional;
    }

    /**
     * ModifiableShortCodes Block
     *
     * @return the DCShortOrderRejectMessageModifiableShortCodesGroups record
     */
    public DCShortOrderRejectMessageModifiableShortCodesGroups dCShortOrderRejectMessageModifiableShortCodesGroups() {
        return dCShortOrderRejectMessageModifiableShortCodesGroups;
    }

    /**
     * ShortCodesDetailsModifiable Block
     *
     * @return the DCShortOrderRejectMessageShortCodesDetailsModifiableGroups record
     */
    public DCShortOrderRejectMessageShortCodesDetailsModifiableGroups dCShortOrderRejectMessageShortCodesDetailsModifiableGroups() {
        return dCShortOrderRejectMessageShortCodesDetailsModifiableGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + dCShortOrderRejectMessageModifiableShortCodesGroups.byteLength() - DCShortOrderRejectMessageModifiableShortCodesGroups.MINIMUM_BYTE_LENGTH + dCShortOrderRejectMessageShortCodesDetailsModifiableGroups.byteLength() - DCShortOrderRejectMessageShortCodesDetailsModifiableGroups.MINIMUM_BYTE_LENGTH;
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
        if (!orderEventType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderEventTypeField.BYTE_LENGTH;
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
        if (!emm.parse(data, cursor)) {
            return false;
        }
        cursor += EmmField.BYTE_LENGTH;
        if (!eventId.parse(data, cursor)) {
            return false;
        }
        cursor += EventIdField.BYTE_LENGTH;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!oeginFromMemberOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OeginFromMemberOptionalField.BYTE_LENGTH;
        if (!oegoutTimeToMe.parse(data, cursor)) {
            return false;
        }
        cursor += OegoutTimeToMeField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!breachedCollarPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BreachedCollarPriceField.BYTE_LENGTH;
        if (!collarRejType.parse(data, cursor)) {
            return false;
        }
        cursor += CollarRejTypeField.BYTE_LENGTH;
        if (!rejectedMessage.parse(data, cursor)) {
            return false;
        }
        cursor += RejectedMessageField.BYTE_LENGTH;
        if (!errorCode.parse(data, cursor)) {
            return false;
        }
        cursor += ErrorCodeField.BYTE_LENGTH;
        if (!miFidIndicatorsOptional.parse(data, cursor)) {
            return false;
        }
        cursor += MiFidIndicatorsOptionalField.BYTE_LENGTH;
        if (!oeSessionIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OeSessionIdOptionalField.BYTE_LENGTH;
        if (!orderSideOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OrderSideOptionalField.BYTE_LENGTH;
        if (!timeInForceOptional.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceOptionalField.BYTE_LENGTH;
        if (!dCShortOrderRejectMessageModifiableShortCodesGroups.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += dCShortOrderRejectMessageModifiableShortCodesGroups.byteLength();
        if (end - cursor < 2) {
            return false;
        }
        if (!dCShortOrderRejectMessageShortCodesDetailsModifiableGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += dCShortOrderRejectMessageShortCodesDetailsModifiableGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = msgSeqNum.encode(data, cursor);
        cursor = produceTime.encode(data, cursor);
        cursor = consumeTime.encode(data, cursor);
        cursor = orderEventType.encode(data, cursor);
        cursor = bookIn.encode(data, cursor);
        cursor = bookOutTime.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = eventId.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = oeginFromMemberOptional.encode(data, cursor);
        cursor = oegoutTimeToMe.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = breachedCollarPrice.encode(data, cursor);
        cursor = collarRejType.encode(data, cursor);
        cursor = rejectedMessage.encode(data, cursor);
        cursor = errorCode.encode(data, cursor);
        cursor = miFidIndicatorsOptional.encode(data, cursor);
        cursor = oeSessionIdOptional.encode(data, cursor);
        cursor = orderSideOptional.encode(data, cursor);
        cursor = timeInForceOptional.encode(data, cursor);
        cursor = dCShortOrderRejectMessageModifiableShortCodesGroups.encode(data, cursor);
        cursor = dCShortOrderRejectMessageShortCodesDetailsModifiableGroups.encode(data, cursor);
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
        dCShortOrderRejectMessageModifiableShortCodesGroups.clear();
        dCShortOrderRejectMessageShortCodesDetailsModifiableGroups.clear();
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
        if (!dCShortOrderRejectMessageModifiableShortCodesGroups.isRecognized()) {
            return false;
        }
        return dCShortOrderRejectMessageShortCodesDetailsModifiableGroups.isRecognized();
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
        if (!dCShortOrderRejectMessageModifiableShortCodesGroups.isValid()) {
            return false;
        }
        if (!dCShortOrderRejectMessageShortCodesDetailsModifiableGroups.isValid()) {
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
        if (!orderEventType.isDecoded()) {
            return Optional.of(orderEventType);
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
        if (!emm.isDecoded()) {
            return Optional.of(emm);
        }
        if (!eventId.isDecoded()) {
            return Optional.of(eventId);
        }
        if (!firmId.isDecoded()) {
            return Optional.of(firmId);
        }
        if (!oeginFromMemberOptional.isDecoded()) {
            return Optional.of(oeginFromMemberOptional);
        }
        if (!oegoutTimeToMe.isDecoded()) {
            return Optional.of(oegoutTimeToMe);
        }
        if (!orderId.isDecoded()) {
            return Optional.of(orderId);
        }
        if (!symbolIndex.isDecoded()) {
            return Optional.of(symbolIndex);
        }
        if (!breachedCollarPrice.isDecoded()) {
            return Optional.of(breachedCollarPrice);
        }
        if (!collarRejType.isDecoded()) {
            return Optional.of(collarRejType);
        }
        if (!rejectedMessage.isDecoded()) {
            return Optional.of(rejectedMessage);
        }
        if (!errorCode.isDecoded()) {
            return Optional.of(errorCode);
        }
        if (!miFidIndicatorsOptional.isDecoded()) {
            return Optional.of(miFidIndicatorsOptional);
        }
        if (!oeSessionIdOptional.isDecoded()) {
            return Optional.of(oeSessionIdOptional);
        }
        if (!orderSideOptional.isDecoded()) {
            return Optional.of(orderSideOptional);
        }
        if (!timeInForceOptional.isDecoded()) {
            return Optional.of(timeInForceOptional);
        }
        if (!dCShortOrderRejectMessageModifiableShortCodesGroups.isDecoded()) {
            return dCShortOrderRejectMessageModifiableShortCodesGroups.failedAt();
        }
        if (!dCShortOrderRejectMessageShortCodesDetailsModifiableGroups.isDecoded()) {
            return dCShortOrderRejectMessageShortCodesDetailsModifiableGroups.failedAt();
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
            case "OrderEventType" -> Optional.of(orderEventType);
            case "BookIn" -> Optional.of(bookIn);
            case "BookOutTime" -> Optional.of(bookOutTime);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "Emm" -> Optional.of(emm);
            case "EventId" -> Optional.of(eventId);
            case "FirmId" -> Optional.of(firmId);
            case "OeginFromMemberOptional" -> Optional.of(oeginFromMemberOptional);
            case "OegoutTimeToMe" -> Optional.of(oegoutTimeToMe);
            case "OrderId" -> Optional.of(orderId);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "BreachedCollarPrice" -> Optional.of(breachedCollarPrice);
            case "CollarRejType" -> Optional.of(collarRejType);
            case "RejectedMessage" -> Optional.of(rejectedMessage);
            case "ErrorCode" -> Optional.of(errorCode);
            case "MiFidIndicatorsOptional" -> Optional.of(miFidIndicatorsOptional);
            case "OeSessionIdOptional" -> Optional.of(oeSessionIdOptional);
            case "OrderSideOptional" -> Optional.of(orderSideOptional);
            case "TimeInForceOptional" -> Optional.of(timeInForceOptional);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DcShortOrderRejectMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(dCShortOrderRejectMessageModifiableShortCodesGroups.diffFields(message.dCShortOrderRejectMessageModifiableShortCodesGroups));
        changed.addAll(dCShortOrderRejectMessageShortCodesDetailsModifiableGroups.diffFields(message.dCShortOrderRejectMessageShortCodesDetailsModifiableGroups));
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
            dCShortOrderRejectMessageModifiableShortCodesGroups.toFormattedString(builder, options);
            builder.append(", ");
            dCShortOrderRejectMessageShortCodesDetailsModifiableGroups.toFormattedString(builder, options);
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
        dCShortOrderRejectMessageModifiableShortCodesGroups.toFormattedString(builder, nested);
        dCShortOrderRejectMessageShortCodesDetailsModifiableGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof DcShortOrderRejectMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && dCShortOrderRejectMessageModifiableShortCodesGroups.equals(message.dCShortOrderRejectMessageModifiableShortCodesGroups) && dCShortOrderRejectMessageShortCodesDetailsModifiableGroups.equals(message.dCShortOrderRejectMessageShortCodesDetailsModifiableGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, dCShortOrderRejectMessageModifiableShortCodesGroups, dCShortOrderRejectMessageShortCodesDetailsModifiableGroups);
    }
}
