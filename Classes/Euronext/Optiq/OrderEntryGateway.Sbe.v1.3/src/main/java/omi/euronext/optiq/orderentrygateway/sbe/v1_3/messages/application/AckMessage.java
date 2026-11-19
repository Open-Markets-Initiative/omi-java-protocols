package omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.AckPhaseField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.AckQualifiersField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.AckTypeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.BookInField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.BookOutTimeOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClientOrderIdOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.EmmField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.FirmIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.MsgSeqNumField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OegInFromMeOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OegInFromMemberField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OegOutTimeToMeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OegOutToMemberOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrderIdOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrderPriorityField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrderPxField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrderQtyOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OrigClientOrderIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SendingTimeOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SideOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SymbolIndexField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Field;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Message;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.PrintOptions;

/**
 * Represents the AckMessage message from the OrderEntryGateway protocol.
 *
 * <p>AckMessage</p>
 */
public final class AckMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 125;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Ack Message";

    /**
     * msgSeqNum
     */
    private final MsgSeqNumField msgSeqNum = new MsgSeqNumField();

    /**
     * firmID
     */
    private final FirmIdField firmId = new FirmIdField();

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
    private final BookInField bookIn = new BookInField();

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
     * origClientOrderID
     */
    private final OrigClientOrderIdField origClientOrderId = new OrigClientOrderIdField();

    /**
     * symbolIndex
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * eMM
     */
    private final EmmField emm = new EmmField();

    /**
     * side
     */
    private final SideOptionalField sideOptional = new SideOptionalField();

    /**
     * ackType
     */
    private final AckTypeField ackType = new AckTypeField();

    /**
     * ackPhase
     */
    private final AckPhaseField ackPhase = new AckPhaseField();

    /**
     * orderID
     */
    private final OrderIdOptionalField orderIdOptional = new OrderIdOptionalField();

    /**
     * orderPriority
     */
    private final OrderPriorityField orderPriority = new OrderPriorityField();

    /**
     * orderPx
     */
    private final OrderPxField orderPx = new OrderPxField();

    /**
     * orderQty
     */
    private final OrderQtyOptionalField orderQtyOptional = new OrderQtyOptionalField();

    /**
     * AckQualifiers_set bit set
     */
    private final AckQualifiersField ackQualifiers = new AckQualifiersField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, firmId, sendingTimeOptional, oegInFromMember, oegOutTimeToMe, bookIn, bookOutTimeOptional, oegInFromMeOptional, oegOutToMemberOptional, clientOrderIdOptional, origClientOrderId, symbolIndex, emm, sideOptional, ackType, ackPhase, orderIdOptional, orderPriority, orderPx, orderQtyOptional, ackQualifiers);

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
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
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
     * @return the BookIn field
     */
    public BookInField bookIn() {
        return bookIn;
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
     * origClientOrderID
     *
     * @return the OrigClientOrderId field
     */
    public OrigClientOrderIdField origClientOrderId() {
        return origClientOrderId;
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
     * eMM
     *
     * @return the Emm field
     */
    public EmmField emm() {
        return emm;
    }

    /**
     * side
     *
     * @return the SideOptional field
     */
    public SideOptionalField sideOptional() {
        return sideOptional;
    }

    /**
     * ackType
     *
     * @return the AckType field
     */
    public AckTypeField ackType() {
        return ackType;
    }

    /**
     * ackPhase
     *
     * @return the AckPhase field
     */
    public AckPhaseField ackPhase() {
        return ackPhase;
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
     * orderPriority
     *
     * @return the OrderPriority field
     */
    public OrderPriorityField orderPriority() {
        return orderPriority;
    }

    /**
     * orderPx
     *
     * @return the OrderPx field
     */
    public OrderPxField orderPx() {
        return orderPx;
    }

    /**
     * orderQty
     *
     * @return the OrderQtyOptional field
     */
    public OrderQtyOptionalField orderQtyOptional() {
        return orderQtyOptional;
    }

    /**
     * AckQualifiers_set bit set
     *
     * @return the AckQualifiers field
     */
    public AckQualifiersField ackQualifiers() {
        return ackQualifiers;
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
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
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
        if (!bookIn.parse(data, cursor)) {
            return false;
        }
        cursor += BookInField.BYTE_LENGTH;
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
        if (!origClientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrigClientOrderIdField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!emm.parse(data, cursor)) {
            return false;
        }
        cursor += EmmField.BYTE_LENGTH;
        if (!sideOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SideOptionalField.BYTE_LENGTH;
        if (!ackType.parse(data, cursor)) {
            return false;
        }
        cursor += AckTypeField.BYTE_LENGTH;
        if (!ackPhase.parse(data, cursor)) {
            return false;
        }
        cursor += AckPhaseField.BYTE_LENGTH;
        if (!orderIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdOptionalField.BYTE_LENGTH;
        if (!orderPriority.parse(data, cursor)) {
            return false;
        }
        cursor += OrderPriorityField.BYTE_LENGTH;
        if (!orderPx.parse(data, cursor)) {
            return false;
        }
        cursor += OrderPxField.BYTE_LENGTH;
        if (!orderQtyOptional.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyOptionalField.BYTE_LENGTH;
        return ackQualifiers.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = msgSeqNum.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = sendingTimeOptional.encode(data, cursor);
        cursor = oegInFromMember.encode(data, cursor);
        cursor = oegOutTimeToMe.encode(data, cursor);
        cursor = bookIn.encode(data, cursor);
        cursor = bookOutTimeOptional.encode(data, cursor);
        cursor = oegInFromMeOptional.encode(data, cursor);
        cursor = oegOutToMemberOptional.encode(data, cursor);
        cursor = clientOrderIdOptional.encode(data, cursor);
        cursor = origClientOrderId.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = sideOptional.encode(data, cursor);
        cursor = ackType.encode(data, cursor);
        cursor = ackPhase.encode(data, cursor);
        cursor = orderIdOptional.encode(data, cursor);
        cursor = orderPriority.encode(data, cursor);
        cursor = orderPx.encode(data, cursor);
        cursor = orderQtyOptional.encode(data, cursor);
        cursor = ackQualifiers.encode(data, cursor);
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
            case "FirmId" -> Optional.of(firmId);
            case "SendingTimeOptional" -> Optional.of(sendingTimeOptional);
            case "OegInFromMember" -> Optional.of(oegInFromMember);
            case "OegOutTimeToMe" -> Optional.of(oegOutTimeToMe);
            case "BookIn" -> Optional.of(bookIn);
            case "BookOutTimeOptional" -> Optional.of(bookOutTimeOptional);
            case "OegInFromMeOptional" -> Optional.of(oegInFromMeOptional);
            case "OegOutToMemberOptional" -> Optional.of(oegOutToMemberOptional);
            case "ClientOrderIdOptional" -> Optional.of(clientOrderIdOptional);
            case "OrigClientOrderId" -> Optional.of(origClientOrderId);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "Emm" -> Optional.of(emm);
            case "SideOptional" -> Optional.of(sideOptional);
            case "AckType" -> Optional.of(ackType);
            case "AckPhase" -> Optional.of(ackPhase);
            case "OrderIdOptional" -> Optional.of(orderIdOptional);
            case "OrderPriority" -> Optional.of(orderPriority);
            case "OrderPx" -> Optional.of(orderPx);
            case "OrderQtyOptional" -> Optional.of(orderQtyOptional);
            case "AckQualifiers" -> Optional.of(ackQualifiers);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AckMessage message)) {
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
        if (!(other instanceof AckMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
