package omi.euronext.optiq.dropcopygateway.sbe.v5_36.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.AccountTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.BookInField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.BookOutTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.ClearingAccountField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.ClearingFirmIdOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.ClientOrderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.ConsumeTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.CrossOrderIndicatorField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.DeclarationEventTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.DeclarationIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.DeclarationStatusField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.EmmField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.EnteringCounterpartyField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.EventIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.FirmIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.FreeTextField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.GuaranteeFlagOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.InvestorIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.LogicalAccessIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.MessageSendingTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.MsgSeqNumField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.OePartitionIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.OeginFromMemberField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.OegoutTimeToMeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.OperationTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.PriceField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.PrincipalCodeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.ProduceTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.QuantityField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.SessionOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.SettlementFlagOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.SettlementPeriodOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.SideField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.SymbolIndexField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.TradeTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.TradeTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.fields.TraderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.types.Message;
import omi.euronext.optiq.dropcopygateway.sbe.v5_36.types.PrintOptions;

/**
 * Represents the DcShortDeclarationFillMessage message from the DropCopyGateway protocol.
 *
 * <p>DCShortDeclarationFillMessage</p>
 */
public final class DcShortDeclarationFillMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 228;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Dc Short Declaration Fill Message";

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
     * operationType
     */
    private final OperationTypeField operationType = new OperationTypeField();

    /**
     * declarationEventType
     */
    private final DeclarationEventTypeField declarationEventType = new DeclarationEventTypeField();

    /**
     * declarationStatus
     */
    private final DeclarationStatusField declarationStatus = new DeclarationStatusField();

    /**
     * eventId
     */
    private final EventIdField eventId = new EventIdField();

    /**
     * eMM
     */
    private final EmmField emm = new EmmField();

    /**
     * symbolIndex
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * declarationID
     */
    private final DeclarationIdField declarationId = new DeclarationIdField();

    /**
     * price
     */
    private final PriceField price = new PriceField();

    /**
     * quantity
     */
    private final QuantityField quantity = new QuantityField();

    /**
     * side
     */
    private final SideField side = new SideField();

    /**
     * crossOrderIndicator
     */
    private final CrossOrderIndicatorField crossOrderIndicator = new CrossOrderIndicatorField();

    /**
     * tradeTime
     */
    private final TradeTimeField tradeTime = new TradeTimeField();

    /**
     * enteringCounterparty
     */
    private final EnteringCounterpartyField enteringCounterparty = new EnteringCounterpartyField();

    /**
     * session
     */
    private final SessionOptionalField sessionOptional = new SessionOptionalField();

    /**
     * tradeType
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * firmID
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * oEPartitionID
     */
    private final OePartitionIdField oePartitionId = new OePartitionIdField();

    /**
     * logicalAccessID
     */
    private final LogicalAccessIdField logicalAccessId = new LogicalAccessIdField();

    /**
     * traderID
     */
    private final TraderIdField traderId = new TraderIdField();

    /**
     * investorID
     */
    private final InvestorIdField investorId = new InvestorIdField();

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
     * accountType
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * clientOrderID
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * freeText
     */
    private final FreeTextField freeText = new FreeTextField();

    /**
     * settlementPeriod
     */
    private final SettlementPeriodOptionalField settlementPeriodOptional = new SettlementPeriodOptionalField();

    /**
     * settlementFlag
     */
    private final SettlementFlagOptionalField settlementFlagOptional = new SettlementFlagOptionalField();

    /**
     * guaranteeFlag
     */
    private final GuaranteeFlagOptionalField guaranteeFlagOptional = new GuaranteeFlagOptionalField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, produceTime, consumeTime, messageSendingTime, bookIn, bookOutTime, oeginFromMember, oegoutTimeToMe, operationType, declarationEventType, declarationStatus, eventId, emm, symbolIndex, declarationId, price, quantity, side, crossOrderIndicator, tradeTime, enteringCounterparty, sessionOptional, tradeType, firmId, oePartitionId, logicalAccessId, traderId, investorId, principalCode, clearingFirmIdOptional, clearingAccount, accountType, clientOrderId, freeText, settlementPeriodOptional, settlementFlagOptional, guaranteeFlagOptional);

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
     * operationType
     *
     * @return the OperationType field
     */
    public OperationTypeField operationType() {
        return operationType;
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
     * declarationStatus
     *
     * @return the DeclarationStatus field
     */
    public DeclarationStatusField declarationStatus() {
        return declarationStatus;
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
     * eMM
     *
     * @return the Emm field
     */
    public EmmField emm() {
        return emm;
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
     * declarationID
     *
     * @return the DeclarationId field
     */
    public DeclarationIdField declarationId() {
        return declarationId;
    }

    /**
     * price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * quantity
     *
     * @return the Quantity field
     */
    public QuantityField quantity() {
        return quantity;
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
     * crossOrderIndicator
     *
     * @return the CrossOrderIndicator field
     */
    public CrossOrderIndicatorField crossOrderIndicator() {
        return crossOrderIndicator;
    }

    /**
     * tradeTime
     *
     * @return the TradeTime field
     */
    public TradeTimeField tradeTime() {
        return tradeTime;
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
     * session
     *
     * @return the SessionOptional field
     */
    public SessionOptionalField sessionOptional() {
        return sessionOptional;
    }

    /**
     * tradeType
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
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
     * oEPartitionID
     *
     * @return the OePartitionId field
     */
    public OePartitionIdField oePartitionId() {
        return oePartitionId;
    }

    /**
     * logicalAccessID
     *
     * @return the LogicalAccessId field
     */
    public LogicalAccessIdField logicalAccessId() {
        return logicalAccessId;
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
     * freeText
     *
     * @return the FreeText field
     */
    public FreeTextField freeText() {
        return freeText;
    }

    /**
     * settlementPeriod
     *
     * @return the SettlementPeriodOptional field
     */
    public SettlementPeriodOptionalField settlementPeriodOptional() {
        return settlementPeriodOptional;
    }

    /**
     * settlementFlag
     *
     * @return the SettlementFlagOptional field
     */
    public SettlementFlagOptionalField settlementFlagOptional() {
        return settlementFlagOptional;
    }

    /**
     * guaranteeFlag
     *
     * @return the GuaranteeFlagOptional field
     */
    public GuaranteeFlagOptionalField guaranteeFlagOptional() {
        return guaranteeFlagOptional;
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
        if (!operationType.parse(data, cursor)) {
            return false;
        }
        cursor += OperationTypeField.BYTE_LENGTH;
        if (!declarationEventType.parse(data, cursor)) {
            return false;
        }
        cursor += DeclarationEventTypeField.BYTE_LENGTH;
        if (!declarationStatus.parse(data, cursor)) {
            return false;
        }
        cursor += DeclarationStatusField.BYTE_LENGTH;
        if (!eventId.parse(data, cursor)) {
            return false;
        }
        cursor += EventIdField.BYTE_LENGTH;
        if (!emm.parse(data, cursor)) {
            return false;
        }
        cursor += EmmField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!declarationId.parse(data, cursor)) {
            return false;
        }
        cursor += DeclarationIdField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!quantity.parse(data, cursor)) {
            return false;
        }
        cursor += QuantityField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!crossOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += CrossOrderIndicatorField.BYTE_LENGTH;
        if (!tradeTime.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTimeField.BYTE_LENGTH;
        if (!enteringCounterparty.parse(data, cursor)) {
            return false;
        }
        cursor += EnteringCounterpartyField.BYTE_LENGTH;
        if (!sessionOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SessionOptionalField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!oePartitionId.parse(data, cursor)) {
            return false;
        }
        cursor += OePartitionIdField.BYTE_LENGTH;
        if (!logicalAccessId.parse(data, cursor)) {
            return false;
        }
        cursor += LogicalAccessIdField.BYTE_LENGTH;
        if (!traderId.parse(data, cursor)) {
            return false;
        }
        cursor += TraderIdField.BYTE_LENGTH;
        if (!investorId.parse(data, cursor)) {
            return false;
        }
        cursor += InvestorIdField.BYTE_LENGTH;
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
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!freeText.parse(data, cursor)) {
            return false;
        }
        cursor += FreeTextField.BYTE_LENGTH;
        if (!settlementPeriodOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPeriodOptionalField.BYTE_LENGTH;
        if (!settlementFlagOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementFlagOptionalField.BYTE_LENGTH;
        return guaranteeFlagOptional.parse(data, cursor);
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
        cursor = operationType.encode(data, cursor);
        cursor = declarationEventType.encode(data, cursor);
        cursor = declarationStatus.encode(data, cursor);
        cursor = eventId.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = declarationId.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = quantity.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = crossOrderIndicator.encode(data, cursor);
        cursor = tradeTime.encode(data, cursor);
        cursor = enteringCounterparty.encode(data, cursor);
        cursor = sessionOptional.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = oePartitionId.encode(data, cursor);
        cursor = logicalAccessId.encode(data, cursor);
        cursor = traderId.encode(data, cursor);
        cursor = investorId.encode(data, cursor);
        cursor = principalCode.encode(data, cursor);
        cursor = clearingFirmIdOptional.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = freeText.encode(data, cursor);
        cursor = settlementPeriodOptional.encode(data, cursor);
        cursor = settlementFlagOptional.encode(data, cursor);
        cursor = guaranteeFlagOptional.encode(data, cursor);
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
            case "OperationType" -> Optional.of(operationType);
            case "DeclarationEventType" -> Optional.of(declarationEventType);
            case "DeclarationStatus" -> Optional.of(declarationStatus);
            case "EventId" -> Optional.of(eventId);
            case "Emm" -> Optional.of(emm);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "DeclarationId" -> Optional.of(declarationId);
            case "Price" -> Optional.of(price);
            case "Quantity" -> Optional.of(quantity);
            case "Side" -> Optional.of(side);
            case "CrossOrderIndicator" -> Optional.of(crossOrderIndicator);
            case "TradeTime" -> Optional.of(tradeTime);
            case "EnteringCounterparty" -> Optional.of(enteringCounterparty);
            case "SessionOptional" -> Optional.of(sessionOptional);
            case "TradeType" -> Optional.of(tradeType);
            case "FirmId" -> Optional.of(firmId);
            case "OePartitionId" -> Optional.of(oePartitionId);
            case "LogicalAccessId" -> Optional.of(logicalAccessId);
            case "TraderId" -> Optional.of(traderId);
            case "InvestorId" -> Optional.of(investorId);
            case "PrincipalCode" -> Optional.of(principalCode);
            case "ClearingFirmIdOptional" -> Optional.of(clearingFirmIdOptional);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "AccountType" -> Optional.of(accountType);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "FreeText" -> Optional.of(freeText);
            case "SettlementPeriodOptional" -> Optional.of(settlementPeriodOptional);
            case "SettlementFlagOptional" -> Optional.of(settlementFlagOptional);
            case "GuaranteeFlagOptional" -> Optional.of(guaranteeFlagOptional);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DcShortDeclarationFillMessage message)) {
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
        if (!(other instanceof DcShortDeclarationFillMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
