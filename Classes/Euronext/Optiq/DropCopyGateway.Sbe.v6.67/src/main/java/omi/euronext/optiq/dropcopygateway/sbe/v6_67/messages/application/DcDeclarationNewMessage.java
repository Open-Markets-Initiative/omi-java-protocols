package omi.euronext.optiq.dropcopygateway.sbe.v6_67.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.AccountTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.BookInField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.BookOutTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.ClearingAccountField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.ClearingFirmIdOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.ClientOrderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.ConsumeTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.CrossOrderIndicatorField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.DeclarationEventTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.DeclarationIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.DeclarationStatusField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.EmmField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.EnteringCounterpartyField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.EventIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.FirmIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.FreeTextField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.GuaranteeFlagField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.InvestorIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.MessageSendingTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.MsgSeqNumField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.OeSessionIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.OeginFromMemberField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.OegoutTimeToMeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.OperationTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.PriceOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.PrincipalCodeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.ProduceTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.QuantityOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.SettlementFlagField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.SettlementPeriodField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.SideField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.SymbolIndexField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.TraderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.fields.TransactionPriceTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.types.Message;
import omi.euronext.optiq.dropcopygateway.sbe.v6_67.types.PrintOptions;

/**
 * Represents the DcDeclarationNewMessage message from the DropCopyGateway protocol.
 *
 * <p>DCDeclarationNewMessage</p>
 */
public final class DcDeclarationNewMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 221;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Dc Declaration New Message";

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
     * accountType
     */
    private final AccountTypeField accountType = new AccountTypeField();

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
     * declarationStatus
     */
    private final DeclarationStatusField declarationStatus = new DeclarationStatusField();

    /**
     * price
     */
    private final PriceOptionalField priceOptional = new PriceOptionalField();

    /**
     * quantity
     */
    private final QuantityOptionalField quantityOptional = new QuantityOptionalField();

    /**
     * side
     */
    private final SideField side = new SideField();

    /**
     * symbolIndex
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * operationType
     */
    private final OperationTypeField operationType = new OperationTypeField();

    /**
     * crossOrderIndicator
     */
    private final CrossOrderIndicatorField crossOrderIndicator = new CrossOrderIndicatorField();

    /**
     * enteringCounterparty
     */
    private final EnteringCounterpartyField enteringCounterparty = new EnteringCounterpartyField();

    /**
     * traderID
     */
    private final TraderIdField traderId = new TraderIdField();

    /**
     * investorID
     */
    private final InvestorIdField investorId = new InvestorIdField();

    /**
     * freeText
     */
    private final FreeTextField freeText = new FreeTextField();

    /**
     * principalCode
     */
    private final PrincipalCodeField principalCode = new PrincipalCodeField();

    /**
     * clearingFirmID
     */
    private final ClearingFirmIdOptionalField clearingFirmIdOptional = new ClearingFirmIdOptionalField();

    /**
     * clearingAccount
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * settlementPeriod
     */
    private final SettlementPeriodField settlementPeriod = new SettlementPeriodField();

    /**
     * settlementFlag
     */
    private final SettlementFlagField settlementFlag = new SettlementFlagField();

    /**
     * guaranteeFlag
     */
    private final GuaranteeFlagField guaranteeFlag = new GuaranteeFlagField();

    /**
     * transactionPriceType
     */
    private final TransactionPriceTypeField transactionPriceType = new TransactionPriceTypeField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, produceTime, consumeTime, messageSendingTime, bookIn, bookOutTime, oeginFromMember, oegoutTimeToMe, eventId, declarationEventType, firmId, oeSessionId, accountType, clientOrderId, emm, declarationId, declarationStatus, priceOptional, quantityOptional, side, symbolIndex, operationType, crossOrderIndicator, enteringCounterparty, traderId, investorId, freeText, principalCode, clearingFirmIdOptional, clearingAccount, settlementPeriod, settlementFlag, guaranteeFlag, transactionPriceType);

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
     * accountType
     *
     * @return the AccountType field
     */
    public AccountTypeField accountType() {
        return accountType;
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
     * declarationStatus
     *
     * @return the DeclarationStatus field
     */
    public DeclarationStatusField declarationStatus() {
        return declarationStatus;
    }

    /**
     * price
     *
     * @return the PriceOptional field
     */
    public PriceOptionalField priceOptional() {
        return priceOptional;
    }

    /**
     * quantity
     *
     * @return the QuantityOptional field
     */
    public QuantityOptionalField quantityOptional() {
        return quantityOptional;
    }

    /**
     * side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
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
     * operationType
     *
     * @return the OperationType field
     */
    public OperationTypeField operationType() {
        return operationType;
    }

    /**
     * crossOrderIndicator
     *
     * @return the CrossOrderIndicator field
     */
    public CrossOrderIndicatorField crossOrderIndicator() {
        return crossOrderIndicator;
    }

    /**
     * enteringCounterparty
     *
     * @return the EnteringCounterparty field
     */
    public EnteringCounterpartyField enteringCounterparty() {
        return enteringCounterparty;
    }

    /**
     * traderID
     *
     * @return the TraderId field
     */
    public TraderIdField traderId() {
        return traderId;
    }

    /**
     * investorID
     *
     * @return the InvestorId field
     */
    public InvestorIdField investorId() {
        return investorId;
    }

    /**
     * freeText
     *
     * @return the FreeText field
     */
    public FreeTextField freeText() {
        return freeText;
    }

    /**
     * principalCode
     *
     * @return the PrincipalCode field
     */
    public PrincipalCodeField principalCode() {
        return principalCode;
    }

    /**
     * clearingFirmID
     *
     * @return the ClearingFirmIdOptional field
     */
    public ClearingFirmIdOptionalField clearingFirmIdOptional() {
        return clearingFirmIdOptional;
    }

    /**
     * clearingAccount
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * settlementPeriod
     *
     * @return the SettlementPeriod field
     */
    public SettlementPeriodField settlementPeriod() {
        return settlementPeriod;
    }

    /**
     * settlementFlag
     *
     * @return the SettlementFlag field
     */
    public SettlementFlagField settlementFlag() {
        return settlementFlag;
    }

    /**
     * guaranteeFlag
     *
     * @return the GuaranteeFlag field
     */
    public GuaranteeFlagField guaranteeFlag() {
        return guaranteeFlag;
    }

    /**
     * transactionPriceType
     *
     * @return the TransactionPriceType field
     */
    public TransactionPriceTypeField transactionPriceType() {
        return transactionPriceType;
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
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
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
        if (!declarationStatus.parse(data, cursor)) {
            return false;
        }
        cursor += DeclarationStatusField.BYTE_LENGTH;
        if (!priceOptional.parse(data, cursor)) {
            return false;
        }
        cursor += PriceOptionalField.BYTE_LENGTH;
        if (!quantityOptional.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityOptionalField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!operationType.parse(data, cursor)) {
            return false;
        }
        cursor += OperationTypeField.BYTE_LENGTH;
        if (!crossOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CrossOrderIndicatorField.BYTE_LENGTH;
        if (!enteringCounterparty.parse(data, cursor)) {
            return false;
        }
        cursor += EnteringCounterpartyField.BYTE_LENGTH;
        if (!traderId.parse(data, cursor)) {
            return false;
        }
        cursor += TraderIdField.BYTE_LENGTH;
        if (!investorId.parse(data, cursor)) {
            return false;
        }
        cursor += InvestorIdField.BYTE_LENGTH;
        if (!freeText.parse(data, cursor)) {
            return false;
        }
        cursor += FreeTextField.BYTE_LENGTH;
        if (!principalCode.parse(data, cursor)) {
            return false;
        }
        cursor += PrincipalCodeField.BYTE_LENGTH;
        if (!clearingFirmIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmIdOptionalField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!settlementPeriod.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPeriodField.BYTE_LENGTH;
        if (!settlementFlag.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementFlagField.BYTE_LENGTH;
        if (!guaranteeFlag.parse(data, cursor)) {
            return false;
        }
        cursor += GuaranteeFlagField.BYTE_LENGTH;
        return transactionPriceType.parse(data, cursor);
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
        cursor = accountType.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = declarationId.encode(data, cursor);
        cursor = declarationStatus.encode(data, cursor);
        cursor = priceOptional.encode(data, cursor);
        cursor = quantityOptional.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = operationType.encode(data, cursor);
        cursor = crossOrderIndicator.encode(data, cursor);
        cursor = enteringCounterparty.encode(data, cursor);
        cursor = traderId.encode(data, cursor);
        cursor = investorId.encode(data, cursor);
        cursor = freeText.encode(data, cursor);
        cursor = principalCode.encode(data, cursor);
        cursor = clearingFirmIdOptional.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = settlementPeriod.encode(data, cursor);
        cursor = settlementFlag.encode(data, cursor);
        cursor = guaranteeFlag.encode(data, cursor);
        cursor = transactionPriceType.encode(data, cursor);
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
            case "AccountType" -> Optional.of(accountType);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "Emm" -> Optional.of(emm);
            case "DeclarationId" -> Optional.of(declarationId);
            case "DeclarationStatus" -> Optional.of(declarationStatus);
            case "PriceOptional" -> Optional.of(priceOptional);
            case "QuantityOptional" -> Optional.of(quantityOptional);
            case "Side" -> Optional.of(side);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "OperationType" -> Optional.of(operationType);
            case "CrossOrderIndicator" -> Optional.of(crossOrderIndicator);
            case "EnteringCounterparty" -> Optional.of(enteringCounterparty);
            case "TraderId" -> Optional.of(traderId);
            case "InvestorId" -> Optional.of(investorId);
            case "FreeText" -> Optional.of(freeText);
            case "PrincipalCode" -> Optional.of(principalCode);
            case "ClearingFirmIdOptional" -> Optional.of(clearingFirmIdOptional);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "SettlementPeriod" -> Optional.of(settlementPeriod);
            case "SettlementFlag" -> Optional.of(settlementFlag);
            case "GuaranteeFlag" -> Optional.of(guaranteeFlag);
            case "TransactionPriceType" -> Optional.of(transactionPriceType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DcDeclarationNewMessage message)) {
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
        if (!(other instanceof DcDeclarationNewMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
