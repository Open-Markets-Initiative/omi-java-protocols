package omi.euronext.optiq.dropcopygateway.sbe.v6_69.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.AccountTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.BookInField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.BookOutTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.ClientOrderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.ConsumeTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.EmmField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.EventIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.ExecutionInstructionOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.FirmIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.LpRoleField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.MiFidIndicatorsField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.MsgSeqNumField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.ProduceTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.RfeAnswerField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.StpidField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.SymbolIndexField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.fields.TradingCapacityField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.structs.DCQuoteMessageBidQuoterepGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.structs.DCQuoteMessageClearingDatasetGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.structs.DCQuoteMessageModifiableShortCodesGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.structs.DCQuoteMessageNonModifiableShortCodesGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.structs.DCQuoteMessageOfferQuoterepGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.types.Message;
import omi.euronext.optiq.dropcopygateway.sbe.v6_69.types.PrintOptions;

/**
 * Represents the DcQuoteMessage message from the DropCopyGateway protocol.
 *
 * <p>DCQuoteMessage</p>
 */
public final class DcQuoteMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 83;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Dc Quote Message";

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
     * bookIn
     */
    private final BookInField bookIn = new BookInField();

    /**
     * bookOUTTime
     */
    private final BookOutTimeField bookOutTime = new BookOutTimeField();

    /**
     * symbolIndex
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * eMM
     */
    private final EmmField emm = new EmmField();

    /**
     * eventId
     */
    private final EventIdField eventId = new EventIdField();

    /**
     * clientOrderID
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * tradingCapacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * accountType
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * lPRole
     */
    private final LpRoleField lpRole = new LpRoleField();

    /**
     * MiFIDIndicators_set bit set
     */
    private final MiFidIndicatorsField miFidIndicators = new MiFidIndicatorsField();

    /**
     * rFEAnswer
     */
    private final RfeAnswerField rfeAnswer = new RfeAnswerField();

    /**
     * firmID
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * ExecutionInstruction_set bit set
     */
    private final ExecutionInstructionOptionalField executionInstructionOptional = new ExecutionInstructionOptionalField();

    /**
     * sTPID
     */
    private final StpidField stpid = new StpidField();

    /**
     * BidQuoterep Block
     */
    private final DCQuoteMessageBidQuoterepGroups dCQuoteMessageBidQuoterepGroups = new DCQuoteMessageBidQuoterepGroups();

    /**
     * OfferQuoterep Block
     */
    private final DCQuoteMessageOfferQuoterepGroups dCQuoteMessageOfferQuoterepGroups = new DCQuoteMessageOfferQuoterepGroups();

    /**
     * ClearingDataset Block
     */
    private final DCQuoteMessageClearingDatasetGroups dCQuoteMessageClearingDatasetGroups = new DCQuoteMessageClearingDatasetGroups();

    /**
     * NonModifiableShortCodes Block
     */
    private final DCQuoteMessageNonModifiableShortCodesGroups dCQuoteMessageNonModifiableShortCodesGroups = new DCQuoteMessageNonModifiableShortCodesGroups();

    /**
     * ModifiableShortCodes Block
     */
    private final DCQuoteMessageModifiableShortCodesGroups dCQuoteMessageModifiableShortCodesGroups = new DCQuoteMessageModifiableShortCodesGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, produceTime, consumeTime, bookIn, bookOutTime, symbolIndex, emm, eventId, clientOrderId, tradingCapacity, accountType, lpRole, miFidIndicators, rfeAnswer, firmId, executionInstructionOptional, stpid);

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
     * eventId
     *
     * @return the EventId field
     */
    public EventIdField eventId() {
        return eventId;
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
     * tradingCapacity
     *
     * @return the TradingCapacity field
     */
    public TradingCapacityField tradingCapacity() {
        return tradingCapacity;
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
     * MiFIDIndicators_set bit set
     *
     * @return the MiFidIndicators field
     */
    public MiFidIndicatorsField miFidIndicators() {
        return miFidIndicators;
    }

    /**
     * rFEAnswer
     *
     * @return the RfeAnswer field
     */
    public RfeAnswerField rfeAnswer() {
        return rfeAnswer;
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
     * ExecutionInstruction_set bit set
     *
     * @return the ExecutionInstructionOptional field
     */
    public ExecutionInstructionOptionalField executionInstructionOptional() {
        return executionInstructionOptional;
    }

    /**
     * sTPID
     *
     * @return the Stpid field
     */
    public StpidField stpid() {
        return stpid;
    }

    /**
     * BidQuoterep Block
     *
     * @return the DCQuoteMessageBidQuoterepGroups record
     */
    public DCQuoteMessageBidQuoterepGroups dCQuoteMessageBidQuoterepGroups() {
        return dCQuoteMessageBidQuoterepGroups;
    }

    /**
     * OfferQuoterep Block
     *
     * @return the DCQuoteMessageOfferQuoterepGroups record
     */
    public DCQuoteMessageOfferQuoterepGroups dCQuoteMessageOfferQuoterepGroups() {
        return dCQuoteMessageOfferQuoterepGroups;
    }

    /**
     * ClearingDataset Block
     *
     * @return the DCQuoteMessageClearingDatasetGroups record
     */
    public DCQuoteMessageClearingDatasetGroups dCQuoteMessageClearingDatasetGroups() {
        return dCQuoteMessageClearingDatasetGroups;
    }

    /**
     * NonModifiableShortCodes Block
     *
     * @return the DCQuoteMessageNonModifiableShortCodesGroups record
     */
    public DCQuoteMessageNonModifiableShortCodesGroups dCQuoteMessageNonModifiableShortCodesGroups() {
        return dCQuoteMessageNonModifiableShortCodesGroups;
    }

    /**
     * ModifiableShortCodes Block
     *
     * @return the DCQuoteMessageModifiableShortCodesGroups record
     */
    public DCQuoteMessageModifiableShortCodesGroups dCQuoteMessageModifiableShortCodesGroups() {
        return dCQuoteMessageModifiableShortCodesGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + dCQuoteMessageBidQuoterepGroups.byteLength() - DCQuoteMessageBidQuoterepGroups.MINIMUM_BYTE_LENGTH + dCQuoteMessageOfferQuoterepGroups.byteLength() - DCQuoteMessageOfferQuoterepGroups.MINIMUM_BYTE_LENGTH + dCQuoteMessageClearingDatasetGroups.byteLength() - DCQuoteMessageClearingDatasetGroups.MINIMUM_BYTE_LENGTH + dCQuoteMessageNonModifiableShortCodesGroups.byteLength() - DCQuoteMessageNonModifiableShortCodesGroups.MINIMUM_BYTE_LENGTH + dCQuoteMessageModifiableShortCodesGroups.byteLength() - DCQuoteMessageModifiableShortCodesGroups.MINIMUM_BYTE_LENGTH;
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
        if (!bookIn.parse(data, cursor)) {
            return false;
        }
        cursor += BookInField.BYTE_LENGTH;
        if (!bookOutTime.parse(data, cursor)) {
            return false;
        }
        cursor += BookOutTimeField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!emm.parse(data, cursor)) {
            return false;
        }
        cursor += EmmField.BYTE_LENGTH;
        if (!eventId.parse(data, cursor)) {
            return false;
        }
        cursor += EventIdField.BYTE_LENGTH;
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!lpRole.parse(data, cursor)) {
            return false;
        }
        cursor += LpRoleField.BYTE_LENGTH;
        if (!miFidIndicators.parse(data, cursor)) {
            return false;
        }
        cursor += MiFidIndicatorsField.BYTE_LENGTH;
        if (!rfeAnswer.parse(data, cursor)) {
            return false;
        }
        cursor += RfeAnswerField.BYTE_LENGTH;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!executionInstructionOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionInstructionOptionalField.BYTE_LENGTH;
        if (!stpid.parse(data, cursor)) {
            return false;
        }
        cursor += StpidField.BYTE_LENGTH;
        if (!dCQuoteMessageBidQuoterepGroups.parseFrom(data, cursor, end - 8)) {
            return false;
        }
        cursor += dCQuoteMessageBidQuoterepGroups.byteLength();
        if (end - cursor < 8) {
            return false;
        }
        if (!dCQuoteMessageOfferQuoterepGroups.parseFrom(data, cursor, end - 6)) {
            return false;
        }
        cursor += dCQuoteMessageOfferQuoterepGroups.byteLength();
        if (end - cursor < 6) {
            return false;
        }
        if (!dCQuoteMessageClearingDatasetGroups.parseFrom(data, cursor, end - 4)) {
            return false;
        }
        cursor += dCQuoteMessageClearingDatasetGroups.byteLength();
        if (end - cursor < 4) {
            return false;
        }
        if (!dCQuoteMessageNonModifiableShortCodesGroups.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += dCQuoteMessageNonModifiableShortCodesGroups.byteLength();
        if (end - cursor < 2) {
            return false;
        }
        if (!dCQuoteMessageModifiableShortCodesGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += dCQuoteMessageModifiableShortCodesGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = msgSeqNum.encode(data, cursor);
        cursor = produceTime.encode(data, cursor);
        cursor = consumeTime.encode(data, cursor);
        cursor = bookIn.encode(data, cursor);
        cursor = bookOutTime.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = eventId.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = lpRole.encode(data, cursor);
        cursor = miFidIndicators.encode(data, cursor);
        cursor = rfeAnswer.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = executionInstructionOptional.encode(data, cursor);
        cursor = stpid.encode(data, cursor);
        cursor = dCQuoteMessageBidQuoterepGroups.encode(data, cursor);
        cursor = dCQuoteMessageOfferQuoterepGroups.encode(data, cursor);
        cursor = dCQuoteMessageClearingDatasetGroups.encode(data, cursor);
        cursor = dCQuoteMessageNonModifiableShortCodesGroups.encode(data, cursor);
        cursor = dCQuoteMessageModifiableShortCodesGroups.encode(data, cursor);
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
        dCQuoteMessageBidQuoterepGroups.clear();
        dCQuoteMessageOfferQuoterepGroups.clear();
        dCQuoteMessageClearingDatasetGroups.clear();
        dCQuoteMessageNonModifiableShortCodesGroups.clear();
        dCQuoteMessageModifiableShortCodesGroups.clear();
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
        if (!dCQuoteMessageBidQuoterepGroups.isRecognized()) {
            return false;
        }
        if (!dCQuoteMessageOfferQuoterepGroups.isRecognized()) {
            return false;
        }
        if (!dCQuoteMessageClearingDatasetGroups.isRecognized()) {
            return false;
        }
        if (!dCQuoteMessageNonModifiableShortCodesGroups.isRecognized()) {
            return false;
        }
        return dCQuoteMessageModifiableShortCodesGroups.isRecognized();
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
        if (!dCQuoteMessageBidQuoterepGroups.isValid()) {
            return false;
        }
        if (!dCQuoteMessageOfferQuoterepGroups.isValid()) {
            return false;
        }
        if (!dCQuoteMessageClearingDatasetGroups.isValid()) {
            return false;
        }
        if (!dCQuoteMessageNonModifiableShortCodesGroups.isValid()) {
            return false;
        }
        if (!dCQuoteMessageModifiableShortCodesGroups.isValid()) {
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
        if (!bookIn.isDecoded()) {
            return Optional.of(bookIn);
        }
        if (!bookOutTime.isDecoded()) {
            return Optional.of(bookOutTime);
        }
        if (!symbolIndex.isDecoded()) {
            return Optional.of(symbolIndex);
        }
        if (!emm.isDecoded()) {
            return Optional.of(emm);
        }
        if (!eventId.isDecoded()) {
            return Optional.of(eventId);
        }
        if (!clientOrderId.isDecoded()) {
            return Optional.of(clientOrderId);
        }
        if (!tradingCapacity.isDecoded()) {
            return Optional.of(tradingCapacity);
        }
        if (!accountType.isDecoded()) {
            return Optional.of(accountType);
        }
        if (!lpRole.isDecoded()) {
            return Optional.of(lpRole);
        }
        if (!miFidIndicators.isDecoded()) {
            return Optional.of(miFidIndicators);
        }
        if (!rfeAnswer.isDecoded()) {
            return Optional.of(rfeAnswer);
        }
        if (!firmId.isDecoded()) {
            return Optional.of(firmId);
        }
        if (!executionInstructionOptional.isDecoded()) {
            return Optional.of(executionInstructionOptional);
        }
        if (!stpid.isDecoded()) {
            return Optional.of(stpid);
        }
        if (!dCQuoteMessageBidQuoterepGroups.isDecoded()) {
            return dCQuoteMessageBidQuoterepGroups.failedAt();
        }
        if (!dCQuoteMessageOfferQuoterepGroups.isDecoded()) {
            return dCQuoteMessageOfferQuoterepGroups.failedAt();
        }
        if (!dCQuoteMessageClearingDatasetGroups.isDecoded()) {
            return dCQuoteMessageClearingDatasetGroups.failedAt();
        }
        if (!dCQuoteMessageNonModifiableShortCodesGroups.isDecoded()) {
            return dCQuoteMessageNonModifiableShortCodesGroups.failedAt();
        }
        if (!dCQuoteMessageModifiableShortCodesGroups.isDecoded()) {
            return dCQuoteMessageModifiableShortCodesGroups.failedAt();
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
            case "BookIn" -> Optional.of(bookIn);
            case "BookOutTime" -> Optional.of(bookOutTime);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "Emm" -> Optional.of(emm);
            case "EventId" -> Optional.of(eventId);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "AccountType" -> Optional.of(accountType);
            case "LpRole" -> Optional.of(lpRole);
            case "MiFidIndicators" -> Optional.of(miFidIndicators);
            case "RfeAnswer" -> Optional.of(rfeAnswer);
            case "FirmId" -> Optional.of(firmId);
            case "ExecutionInstructionOptional" -> Optional.of(executionInstructionOptional);
            case "Stpid" -> Optional.of(stpid);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DcQuoteMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(dCQuoteMessageBidQuoterepGroups.diffFields(message.dCQuoteMessageBidQuoterepGroups));
        changed.addAll(dCQuoteMessageOfferQuoterepGroups.diffFields(message.dCQuoteMessageOfferQuoterepGroups));
        changed.addAll(dCQuoteMessageClearingDatasetGroups.diffFields(message.dCQuoteMessageClearingDatasetGroups));
        changed.addAll(dCQuoteMessageNonModifiableShortCodesGroups.diffFields(message.dCQuoteMessageNonModifiableShortCodesGroups));
        changed.addAll(dCQuoteMessageModifiableShortCodesGroups.diffFields(message.dCQuoteMessageModifiableShortCodesGroups));
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
            dCQuoteMessageBidQuoterepGroups.toFormattedString(builder, options);
            builder.append(", ");
            dCQuoteMessageOfferQuoterepGroups.toFormattedString(builder, options);
            builder.append(", ");
            dCQuoteMessageClearingDatasetGroups.toFormattedString(builder, options);
            builder.append(", ");
            dCQuoteMessageNonModifiableShortCodesGroups.toFormattedString(builder, options);
            builder.append(", ");
            dCQuoteMessageModifiableShortCodesGroups.toFormattedString(builder, options);
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
        dCQuoteMessageBidQuoterepGroups.toFormattedString(builder, nested);
        dCQuoteMessageOfferQuoterepGroups.toFormattedString(builder, nested);
        dCQuoteMessageClearingDatasetGroups.toFormattedString(builder, nested);
        dCQuoteMessageNonModifiableShortCodesGroups.toFormattedString(builder, nested);
        dCQuoteMessageModifiableShortCodesGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof DcQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && dCQuoteMessageBidQuoterepGroups.equals(message.dCQuoteMessageBidQuoterepGroups) && dCQuoteMessageOfferQuoterepGroups.equals(message.dCQuoteMessageOfferQuoterepGroups) && dCQuoteMessageClearingDatasetGroups.equals(message.dCQuoteMessageClearingDatasetGroups) && dCQuoteMessageNonModifiableShortCodesGroups.equals(message.dCQuoteMessageNonModifiableShortCodesGroups) && dCQuoteMessageModifiableShortCodesGroups.equals(message.dCQuoteMessageModifiableShortCodesGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, dCQuoteMessageBidQuoterepGroups, dCQuoteMessageOfferQuoterepGroups, dCQuoteMessageClearingDatasetGroups, dCQuoteMessageNonModifiableShortCodesGroups, dCQuoteMessageModifiableShortCodesGroups);
    }
}
