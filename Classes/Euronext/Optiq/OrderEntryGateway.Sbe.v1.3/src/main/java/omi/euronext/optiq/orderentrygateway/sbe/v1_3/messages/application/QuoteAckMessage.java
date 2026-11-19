package omi.euronext.optiq.orderentrygateway.sbe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.AccountTypeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.BookInField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.BookOutTimeOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.ClientOrderIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.FirmIdField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.LpRoleField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.MsgSeqNumField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OegInFromMeOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OegInFromMemberField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OegOutTimeToMeField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.OegOutToMemberOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.fields.SendingTimeOptionalField;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.structs.QuoteAcksGroups;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Field;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.Message;
import omi.euronext.optiq.orderentrygateway.sbe.v1_3.types.PrintOptions;

/**
 * Represents the QuoteAckMessage message from the OrderEntryGateway protocol.
 *
 * <p>QuoteAckMessage</p>
 */
public final class QuoteAckMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 80;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Ack Message";

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
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * accountType
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * lPRole
     */
    private final LpRoleField lpRole = new LpRoleField();

    /**
     * QuoteAcks Block
     */
    private final QuoteAcksGroups quoteAcksGroups = new QuoteAcksGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, firmId, sendingTimeOptional, oegInFromMember, oegOutTimeToMe, bookIn, bookOutTimeOptional, oegInFromMeOptional, oegOutToMemberOptional, clientOrderId, accountType, lpRole);

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
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * accountType
     *
     * @return the AccountType field
     */
    public AccountTypeField accountType() {
        return accountType;
    }

    /**
     * lPRole
     *
     * @return the LpRole field
     */
    public LpRoleField lpRole() {
        return lpRole;
    }

    /**
     * QuoteAcks Block
     *
     * @return the QuoteAcksGroups record
     */
    public QuoteAcksGroups quoteAcksGroups() {
        return quoteAcksGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + quoteAcksGroups.byteLength() - QuoteAcksGroups.MINIMUM_BYTE_LENGTH;
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
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!lpRole.parse(data, cursor)) {
            return false;
        }
        cursor += LpRoleField.BYTE_LENGTH;
        if (!quoteAcksGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += quoteAcksGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
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
        cursor = clientOrderId.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = lpRole.encode(data, cursor);
        cursor = quoteAcksGroups.encode(data, cursor);
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
        quoteAcksGroups.clear();
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
        return quoteAcksGroups.isRecognized();
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
        if (!quoteAcksGroups.isValid()) {
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
        if (!firmId.isDecoded()) {
            return Optional.of(firmId);
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
        if (!bookIn.isDecoded()) {
            return Optional.of(bookIn);
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
        if (!clientOrderId.isDecoded()) {
            return Optional.of(clientOrderId);
        }
        if (!accountType.isDecoded()) {
            return Optional.of(accountType);
        }
        if (!lpRole.isDecoded()) {
            return Optional.of(lpRole);
        }
        if (!quoteAcksGroups.isDecoded()) {
            return quoteAcksGroups.failedAt();
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
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "AccountType" -> Optional.of(accountType);
            case "LpRole" -> Optional.of(lpRole);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteAckMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(quoteAcksGroups.diffFields(message.quoteAcksGroups));
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
            quoteAcksGroups.toFormattedString(builder, options);
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
        quoteAcksGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof QuoteAckMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && quoteAcksGroups.equals(message.quoteAcksGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, quoteAcksGroups);
    }
}
