package omi.euronext.optiq.dropcopygateway.sbe.v5_35.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.AccountNumberField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.AccountTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.BookInTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.BookOutTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ClearingAccountField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ClearingFirmIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ClearingInstructionOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ConsumeTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.CounterpartFirmIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.EmmField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.EventClientIdShortCodeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.EventExecWFirmShortCodeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ExecutionIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ExecutionPhaseField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.FirmIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.FreeTextField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.LastSharesField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.LastTradedPxField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.LisTransactionIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.LpRoleOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.MiFidIndicatorsField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.MsgSeqNumField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OeSessionIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OeginFromMemberField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OpenCloseField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OrderIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OrderSideField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OrderTypeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OriginalClientIdShortCodeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OriginalExecWFirmShortCodeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OriginalInvestDecisWFirmShortCodeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.OriginalNonExecBrokerShortCodeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ParentExecIdField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ParentSymbolIndexField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ParentTradeUniqueIdentifierField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.ProduceTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.SymbolIndexField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.TechnicalOriginField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.TimeInForceOptionalField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.TradeQualifierField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.TradeUniqueIdentifierField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.fields.TradingCapacityField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.TradeBustNotificationShortCodesDetailsModifiableGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.structs.TradeBustNotificationShortCodesDetailsNonModifiableGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.Message;
import omi.euronext.optiq.dropcopygateway.sbe.v5_35.types.PrintOptions;

/**
 * Represents the TradeBustNotificationMessage message from the DropCopyGateway protocol.
 *
 * <p>DCTradeBustNotificationMessage</p>
 */
public final class TradeBustNotificationMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 241;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Bust Notification Message";

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
     * firmID
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * oESessionID
     */
    private final OeSessionIdField oeSessionId = new OeSessionIdField();

    /**
     * orderSide
     */
    private final OrderSideField orderSide = new OrderSideField();

    /**
     * bookOUTTime
     */
    private final BookOutTimeField bookOutTime = new BookOutTimeField();

    /**
     * bookINTime
     */
    private final BookInTimeField bookInTime = new BookInTimeField();

    /**
     * symbolIndex
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * eMM
     */
    private final EmmField emm = new EmmField();

    /**
     * executionID
     */
    private final ExecutionIdField executionId = new ExecutionIdField();

    /**
     * lastShares
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * lastTradedPx
     */
    private final LastTradedPxField lastTradedPx = new LastTradedPxField();

    /**
     * orderID
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * MiFIDIndicators_set bit set
     */
    private final MiFidIndicatorsField miFidIndicators = new MiFidIndicatorsField();

    /**
     * clearingFirmID
     */
    private final ClearingFirmIdField clearingFirmId = new ClearingFirmIdField();

    /**
     * tradingCapacity
     */
    private final TradingCapacityField tradingCapacity = new TradingCapacityField();

    /**
     * oEGINFromMember
     */
    private final OeginFromMemberField oeginFromMember = new OeginFromMemberField();

    /**
     * executionPhase
     */
    private final ExecutionPhaseField executionPhase = new ExecutionPhaseField();

    /**
     * TradeQualifier_set bit set
     */
    private final TradeQualifierField tradeQualifier = new TradeQualifierField();

    /**
     * counterpartFirmID
     */
    private final CounterpartFirmIdField counterpartFirmId = new CounterpartFirmIdField();

    /**
     * orderType
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * timeInForce
     */
    private final TimeInForceOptionalField timeInForceOptional = new TimeInForceOptionalField();

    /**
     * clearingInstruction
     */
    private final ClearingInstructionOptionalField clearingInstructionOptional = new ClearingInstructionOptionalField();

    /**
     * technicalOrigin
     */
    private final TechnicalOriginField technicalOrigin = new TechnicalOriginField();

    /**
     * freeText
     */
    private final FreeTextField freeText = new FreeTextField();

    /**
     * accountNumber
     */
    private final AccountNumberField accountNumber = new AccountNumberField();

    /**
     * accountType
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * lPRole
     */
    private final LpRoleOptionalField lpRoleOptional = new LpRoleOptionalField();

    /**
     * OpenClose_set bit set
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * originalInvestDecisWFirmShortCode
     */
    private final OriginalInvestDecisWFirmShortCodeField originalInvestDecisWFirmShortCode = new OriginalInvestDecisWFirmShortCodeField();

    /**
     * originalNonExecBrokerShortCode
     */
    private final OriginalNonExecBrokerShortCodeField originalNonExecBrokerShortCode = new OriginalNonExecBrokerShortCodeField();

    /**
     * eventClientIDShortCode
     */
    private final EventClientIdShortCodeField eventClientIdShortCode = new EventClientIdShortCodeField();

    /**
     * eventExecWFirmShortCode
     */
    private final EventExecWFirmShortCodeField eventExecWFirmShortCode = new EventExecWFirmShortCodeField();

    /**
     * originalClientIDShortCode
     */
    private final OriginalClientIdShortCodeField originalClientIdShortCode = new OriginalClientIdShortCodeField();

    /**
     * originalExecWFirmShortCode
     */
    private final OriginalExecWFirmShortCodeField originalExecWFirmShortCode = new OriginalExecWFirmShortCodeField();

    /**
     * clearingAccount
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * lISTransactionID
     */
    private final LisTransactionIdField lisTransactionId = new LisTransactionIdField();

    /**
     * parentExecID
     */
    private final ParentExecIdField parentExecId = new ParentExecIdField();

    /**
     * parentSymbolIndex
     */
    private final ParentSymbolIndexField parentSymbolIndex = new ParentSymbolIndexField();

    /**
     * tradeUniqueIdentifier
     */
    private final TradeUniqueIdentifierField tradeUniqueIdentifier = new TradeUniqueIdentifierField();

    /**
     * parentTradeUniqueIdentifier
     */
    private final ParentTradeUniqueIdentifierField parentTradeUniqueIdentifier = new ParentTradeUniqueIdentifierField();

    /**
     * ShortCodesDetailsNonModifiable Block
     */
    private final TradeBustNotificationShortCodesDetailsNonModifiableGroups tradeBustNotificationShortCodesDetailsNonModifiableGroups = new TradeBustNotificationShortCodesDetailsNonModifiableGroups();

    /**
     * ShortCodesDetailsModifiable Block
     */
    private final TradeBustNotificationShortCodesDetailsModifiableGroups tradeBustNotificationShortCodesDetailsModifiableGroups = new TradeBustNotificationShortCodesDetailsModifiableGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, produceTime, consumeTime, firmId, oeSessionId, orderSide, bookOutTime, bookInTime, symbolIndex, emm, executionId, lastShares, lastTradedPx, orderId, miFidIndicators, clearingFirmId, tradingCapacity, oeginFromMember, executionPhase, tradeQualifier, counterpartFirmId, orderType, timeInForceOptional, clearingInstructionOptional, technicalOrigin, freeText, accountNumber, accountType, lpRoleOptional, openClose, originalInvestDecisWFirmShortCode, originalNonExecBrokerShortCode, eventClientIdShortCode, eventExecWFirmShortCode, originalClientIdShortCode, originalExecWFirmShortCode, clearingAccount, lisTransactionId, parentExecId, parentSymbolIndex, tradeUniqueIdentifier, parentTradeUniqueIdentifier);

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
     * orderSide
     *
     * @return the OrderSide field
     */
    public OrderSideField orderSide() {
        return orderSide;
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
     * bookINTime
     *
     * @return the BookInTime field
     */
    public BookInTimeField bookInTime() {
        return bookInTime;
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
     * executionID
     *
     * @return the ExecutionId field
     */
    public ExecutionIdField executionId() {
        return executionId;
    }

    /**
     * lastShares
     *
     * @return the LastShares field
     */
    public LastSharesField lastShares() {
        return lastShares;
    }

    /**
     * lastTradedPx
     *
     * @return the LastTradedPx field
     */
    public LastTradedPxField lastTradedPx() {
        return lastTradedPx;
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
     * MiFIDIndicators_set bit set
     *
     * @return the MiFidIndicators field
     */
    public MiFidIndicatorsField miFidIndicators() {
        return miFidIndicators;
    }

    /**
     * clearingFirmID
     *
     * @return the ClearingFirmId field
     */
    public ClearingFirmIdField clearingFirmId() {
        return clearingFirmId;
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
     * oEGINFromMember
     *
     * @return the OeginFromMember field
     */
    public OeginFromMemberField oeginFromMember() {
        return oeginFromMember;
    }

    /**
     * executionPhase
     *
     * @return the ExecutionPhase field
     */
    public ExecutionPhaseField executionPhase() {
        return executionPhase;
    }

    /**
     * TradeQualifier_set bit set
     *
     * @return the TradeQualifier field
     */
    public TradeQualifierField tradeQualifier() {
        return tradeQualifier;
    }

    /**
     * counterpartFirmID
     *
     * @return the CounterpartFirmId field
     */
    public CounterpartFirmIdField counterpartFirmId() {
        return counterpartFirmId;
    }

    /**
     * orderType
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
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
     * clearingInstruction
     *
     * @return the ClearingInstructionOptional field
     */
    public ClearingInstructionOptionalField clearingInstructionOptional() {
        return clearingInstructionOptional;
    }

    /**
     * technicalOrigin
     *
     * @return the TechnicalOrigin field
     */
    public TechnicalOriginField technicalOrigin() {
        return technicalOrigin;
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
     * accountNumber
     *
     * @return the AccountNumber field
     */
    public AccountNumberField accountNumber() {
        return accountNumber;
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
     * @return the LpRoleOptional field
     */
    public LpRoleOptionalField lpRoleOptional() {
        return lpRoleOptional;
    }

    /**
     * OpenClose_set bit set
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * originalInvestDecisWFirmShortCode
     *
     * @return the OriginalInvestDecisWFirmShortCode field
     */
    public OriginalInvestDecisWFirmShortCodeField originalInvestDecisWFirmShortCode() {
        return originalInvestDecisWFirmShortCode;
    }

    /**
     * originalNonExecBrokerShortCode
     *
     * @return the OriginalNonExecBrokerShortCode field
     */
    public OriginalNonExecBrokerShortCodeField originalNonExecBrokerShortCode() {
        return originalNonExecBrokerShortCode;
    }

    /**
     * eventClientIDShortCode
     *
     * @return the EventClientIdShortCode field
     */
    public EventClientIdShortCodeField eventClientIdShortCode() {
        return eventClientIdShortCode;
    }

    /**
     * eventExecWFirmShortCode
     *
     * @return the EventExecWFirmShortCode field
     */
    public EventExecWFirmShortCodeField eventExecWFirmShortCode() {
        return eventExecWFirmShortCode;
    }

    /**
     * originalClientIDShortCode
     *
     * @return the OriginalClientIdShortCode field
     */
    public OriginalClientIdShortCodeField originalClientIdShortCode() {
        return originalClientIdShortCode;
    }

    /**
     * originalExecWFirmShortCode
     *
     * @return the OriginalExecWFirmShortCode field
     */
    public OriginalExecWFirmShortCodeField originalExecWFirmShortCode() {
        return originalExecWFirmShortCode;
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
     * lISTransactionID
     *
     * @return the LisTransactionId field
     */
    public LisTransactionIdField lisTransactionId() {
        return lisTransactionId;
    }

    /**
     * parentExecID
     *
     * @return the ParentExecId field
     */
    public ParentExecIdField parentExecId() {
        return parentExecId;
    }

    /**
     * parentSymbolIndex
     *
     * @return the ParentSymbolIndex field
     */
    public ParentSymbolIndexField parentSymbolIndex() {
        return parentSymbolIndex;
    }

    /**
     * tradeUniqueIdentifier
     *
     * @return the TradeUniqueIdentifier field
     */
    public TradeUniqueIdentifierField tradeUniqueIdentifier() {
        return tradeUniqueIdentifier;
    }

    /**
     * parentTradeUniqueIdentifier
     *
     * @return the ParentTradeUniqueIdentifier field
     */
    public ParentTradeUniqueIdentifierField parentTradeUniqueIdentifier() {
        return parentTradeUniqueIdentifier;
    }

    /**
     * ShortCodesDetailsNonModifiable Block
     *
     * @return the TradeBustNotificationShortCodesDetailsNonModifiableGroups record
     */
    public TradeBustNotificationShortCodesDetailsNonModifiableGroups tradeBustNotificationShortCodesDetailsNonModifiableGroups() {
        return tradeBustNotificationShortCodesDetailsNonModifiableGroups;
    }

    /**
     * ShortCodesDetailsModifiable Block
     *
     * @return the TradeBustNotificationShortCodesDetailsModifiableGroups record
     */
    public TradeBustNotificationShortCodesDetailsModifiableGroups tradeBustNotificationShortCodesDetailsModifiableGroups() {
        return tradeBustNotificationShortCodesDetailsModifiableGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + tradeBustNotificationShortCodesDetailsNonModifiableGroups.byteLength() - TradeBustNotificationShortCodesDetailsNonModifiableGroups.MINIMUM_BYTE_LENGTH + tradeBustNotificationShortCodesDetailsModifiableGroups.byteLength() - TradeBustNotificationShortCodesDetailsModifiableGroups.MINIMUM_BYTE_LENGTH;
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
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!oeSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += OeSessionIdField.BYTE_LENGTH;
        if (!orderSide.parse(data, cursor)) {
            return false;
        }
        cursor += OrderSideField.BYTE_LENGTH;
        if (!bookOutTime.parse(data, cursor)) {
            return false;
        }
        cursor += BookOutTimeField.BYTE_LENGTH;
        if (!bookInTime.parse(data, cursor)) {
            return false;
        }
        cursor += BookInTimeField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!emm.parse(data, cursor)) {
            return false;
        }
        cursor += EmmField.BYTE_LENGTH;
        if (!executionId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionIdField.BYTE_LENGTH;
        if (!lastShares.parse(data, cursor)) {
            return false;
        }
        cursor += LastSharesField.BYTE_LENGTH;
        if (!lastTradedPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastTradedPxField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!miFidIndicators.parse(data, cursor)) {
            return false;
        }
        cursor += MiFidIndicatorsField.BYTE_LENGTH;
        if (!clearingFirmId.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmIdField.BYTE_LENGTH;
        if (!tradingCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += TradingCapacityField.BYTE_LENGTH;
        if (!oeginFromMember.parse(data, cursor)) {
            return false;
        }
        cursor += OeginFromMemberField.BYTE_LENGTH;
        if (!executionPhase.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutionPhaseField.BYTE_LENGTH;
        if (!tradeQualifier.parse(data, cursor)) {
            return false;
        }
        cursor += TradeQualifierField.BYTE_LENGTH;
        if (!counterpartFirmId.parse(data, cursor)) {
            return false;
        }
        cursor += CounterpartFirmIdField.BYTE_LENGTH;
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        if (!timeInForceOptional.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceOptionalField.BYTE_LENGTH;
        if (!clearingInstructionOptional.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingInstructionOptionalField.BYTE_LENGTH;
        if (!technicalOrigin.parse(data, cursor)) {
            return false;
        }
        cursor += TechnicalOriginField.BYTE_LENGTH;
        if (!freeText.parse(data, cursor)) {
            return false;
        }
        cursor += FreeTextField.BYTE_LENGTH;
        if (!accountNumber.parse(data, cursor)) {
            return false;
        }
        cursor += AccountNumberField.BYTE_LENGTH;
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!lpRoleOptional.parse(data, cursor)) {
            return false;
        }
        cursor += LpRoleOptionalField.BYTE_LENGTH;
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!originalInvestDecisWFirmShortCode.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalInvestDecisWFirmShortCodeField.BYTE_LENGTH;
        if (!originalNonExecBrokerShortCode.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalNonExecBrokerShortCodeField.BYTE_LENGTH;
        if (!eventClientIdShortCode.parse(data, cursor)) {
            return false;
        }
        cursor += EventClientIdShortCodeField.BYTE_LENGTH;
        if (!eventExecWFirmShortCode.parse(data, cursor)) {
            return false;
        }
        cursor += EventExecWFirmShortCodeField.BYTE_LENGTH;
        if (!originalClientIdShortCode.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalClientIdShortCodeField.BYTE_LENGTH;
        if (!originalExecWFirmShortCode.parse(data, cursor)) {
            return false;
        }
        cursor += OriginalExecWFirmShortCodeField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!lisTransactionId.parse(data, cursor)) {
            return false;
        }
        cursor += LisTransactionIdField.BYTE_LENGTH;
        if (!parentExecId.parse(data, cursor)) {
            return false;
        }
        cursor += ParentExecIdField.BYTE_LENGTH;
        if (!parentSymbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += ParentSymbolIndexField.BYTE_LENGTH;
        if (!tradeUniqueIdentifier.parse(data, cursor)) {
            return false;
        }
        cursor += TradeUniqueIdentifierField.BYTE_LENGTH;
        if (!parentTradeUniqueIdentifier.parse(data, cursor)) {
            return false;
        }
        cursor += ParentTradeUniqueIdentifierField.BYTE_LENGTH;
        if (!tradeBustNotificationShortCodesDetailsNonModifiableGroups.parseFrom(data, cursor, end - 2)) {
            return false;
        }
        cursor += tradeBustNotificationShortCodesDetailsNonModifiableGroups.byteLength();
        if (end - cursor < 2) {
            return false;
        }
        if (!tradeBustNotificationShortCodesDetailsModifiableGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += tradeBustNotificationShortCodesDetailsModifiableGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = msgSeqNum.encode(data, cursor);
        cursor = produceTime.encode(data, cursor);
        cursor = consumeTime.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = oeSessionId.encode(data, cursor);
        cursor = orderSide.encode(data, cursor);
        cursor = bookOutTime.encode(data, cursor);
        cursor = bookInTime.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = executionId.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = lastTradedPx.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = miFidIndicators.encode(data, cursor);
        cursor = clearingFirmId.encode(data, cursor);
        cursor = tradingCapacity.encode(data, cursor);
        cursor = oeginFromMember.encode(data, cursor);
        cursor = executionPhase.encode(data, cursor);
        cursor = tradeQualifier.encode(data, cursor);
        cursor = counterpartFirmId.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = timeInForceOptional.encode(data, cursor);
        cursor = clearingInstructionOptional.encode(data, cursor);
        cursor = technicalOrigin.encode(data, cursor);
        cursor = freeText.encode(data, cursor);
        cursor = accountNumber.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = lpRoleOptional.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = originalInvestDecisWFirmShortCode.encode(data, cursor);
        cursor = originalNonExecBrokerShortCode.encode(data, cursor);
        cursor = eventClientIdShortCode.encode(data, cursor);
        cursor = eventExecWFirmShortCode.encode(data, cursor);
        cursor = originalClientIdShortCode.encode(data, cursor);
        cursor = originalExecWFirmShortCode.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = lisTransactionId.encode(data, cursor);
        cursor = parentExecId.encode(data, cursor);
        cursor = parentSymbolIndex.encode(data, cursor);
        cursor = tradeUniqueIdentifier.encode(data, cursor);
        cursor = parentTradeUniqueIdentifier.encode(data, cursor);
        cursor = tradeBustNotificationShortCodesDetailsNonModifiableGroups.encode(data, cursor);
        cursor = tradeBustNotificationShortCodesDetailsModifiableGroups.encode(data, cursor);
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
        tradeBustNotificationShortCodesDetailsNonModifiableGroups.clear();
        tradeBustNotificationShortCodesDetailsModifiableGroups.clear();
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
        if (!tradeBustNotificationShortCodesDetailsNonModifiableGroups.isRecognized()) {
            return false;
        }
        return tradeBustNotificationShortCodesDetailsModifiableGroups.isRecognized();
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
        if (!tradeBustNotificationShortCodesDetailsNonModifiableGroups.isValid()) {
            return false;
        }
        if (!tradeBustNotificationShortCodesDetailsModifiableGroups.isValid()) {
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
        if (!firmId.isDecoded()) {
            return Optional.of(firmId);
        }
        if (!oeSessionId.isDecoded()) {
            return Optional.of(oeSessionId);
        }
        if (!orderSide.isDecoded()) {
            return Optional.of(orderSide);
        }
        if (!bookOutTime.isDecoded()) {
            return Optional.of(bookOutTime);
        }
        if (!bookInTime.isDecoded()) {
            return Optional.of(bookInTime);
        }
        if (!symbolIndex.isDecoded()) {
            return Optional.of(symbolIndex);
        }
        if (!emm.isDecoded()) {
            return Optional.of(emm);
        }
        if (!executionId.isDecoded()) {
            return Optional.of(executionId);
        }
        if (!lastShares.isDecoded()) {
            return Optional.of(lastShares);
        }
        if (!lastTradedPx.isDecoded()) {
            return Optional.of(lastTradedPx);
        }
        if (!orderId.isDecoded()) {
            return Optional.of(orderId);
        }
        if (!miFidIndicators.isDecoded()) {
            return Optional.of(miFidIndicators);
        }
        if (!clearingFirmId.isDecoded()) {
            return Optional.of(clearingFirmId);
        }
        if (!tradingCapacity.isDecoded()) {
            return Optional.of(tradingCapacity);
        }
        if (!oeginFromMember.isDecoded()) {
            return Optional.of(oeginFromMember);
        }
        if (!executionPhase.isDecoded()) {
            return Optional.of(executionPhase);
        }
        if (!tradeQualifier.isDecoded()) {
            return Optional.of(tradeQualifier);
        }
        if (!counterpartFirmId.isDecoded()) {
            return Optional.of(counterpartFirmId);
        }
        if (!orderType.isDecoded()) {
            return Optional.of(orderType);
        }
        if (!timeInForceOptional.isDecoded()) {
            return Optional.of(timeInForceOptional);
        }
        if (!clearingInstructionOptional.isDecoded()) {
            return Optional.of(clearingInstructionOptional);
        }
        if (!technicalOrigin.isDecoded()) {
            return Optional.of(technicalOrigin);
        }
        if (!freeText.isDecoded()) {
            return Optional.of(freeText);
        }
        if (!accountNumber.isDecoded()) {
            return Optional.of(accountNumber);
        }
        if (!accountType.isDecoded()) {
            return Optional.of(accountType);
        }
        if (!lpRoleOptional.isDecoded()) {
            return Optional.of(lpRoleOptional);
        }
        if (!openClose.isDecoded()) {
            return Optional.of(openClose);
        }
        if (!originalInvestDecisWFirmShortCode.isDecoded()) {
            return Optional.of(originalInvestDecisWFirmShortCode);
        }
        if (!originalNonExecBrokerShortCode.isDecoded()) {
            return Optional.of(originalNonExecBrokerShortCode);
        }
        if (!eventClientIdShortCode.isDecoded()) {
            return Optional.of(eventClientIdShortCode);
        }
        if (!eventExecWFirmShortCode.isDecoded()) {
            return Optional.of(eventExecWFirmShortCode);
        }
        if (!originalClientIdShortCode.isDecoded()) {
            return Optional.of(originalClientIdShortCode);
        }
        if (!originalExecWFirmShortCode.isDecoded()) {
            return Optional.of(originalExecWFirmShortCode);
        }
        if (!clearingAccount.isDecoded()) {
            return Optional.of(clearingAccount);
        }
        if (!lisTransactionId.isDecoded()) {
            return Optional.of(lisTransactionId);
        }
        if (!parentExecId.isDecoded()) {
            return Optional.of(parentExecId);
        }
        if (!parentSymbolIndex.isDecoded()) {
            return Optional.of(parentSymbolIndex);
        }
        if (!tradeUniqueIdentifier.isDecoded()) {
            return Optional.of(tradeUniqueIdentifier);
        }
        if (!parentTradeUniqueIdentifier.isDecoded()) {
            return Optional.of(parentTradeUniqueIdentifier);
        }
        if (!tradeBustNotificationShortCodesDetailsNonModifiableGroups.isDecoded()) {
            return tradeBustNotificationShortCodesDetailsNonModifiableGroups.failedAt();
        }
        if (!tradeBustNotificationShortCodesDetailsModifiableGroups.isDecoded()) {
            return tradeBustNotificationShortCodesDetailsModifiableGroups.failedAt();
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
            case "FirmId" -> Optional.of(firmId);
            case "OeSessionId" -> Optional.of(oeSessionId);
            case "OrderSide" -> Optional.of(orderSide);
            case "BookOutTime" -> Optional.of(bookOutTime);
            case "BookInTime" -> Optional.of(bookInTime);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "Emm" -> Optional.of(emm);
            case "ExecutionId" -> Optional.of(executionId);
            case "LastShares" -> Optional.of(lastShares);
            case "LastTradedPx" -> Optional.of(lastTradedPx);
            case "OrderId" -> Optional.of(orderId);
            case "MiFidIndicators" -> Optional.of(miFidIndicators);
            case "ClearingFirmId" -> Optional.of(clearingFirmId);
            case "TradingCapacity" -> Optional.of(tradingCapacity);
            case "OeginFromMember" -> Optional.of(oeginFromMember);
            case "ExecutionPhase" -> Optional.of(executionPhase);
            case "TradeQualifier" -> Optional.of(tradeQualifier);
            case "CounterpartFirmId" -> Optional.of(counterpartFirmId);
            case "OrderType" -> Optional.of(orderType);
            case "TimeInForceOptional" -> Optional.of(timeInForceOptional);
            case "ClearingInstructionOptional" -> Optional.of(clearingInstructionOptional);
            case "TechnicalOrigin" -> Optional.of(technicalOrigin);
            case "FreeText" -> Optional.of(freeText);
            case "AccountNumber" -> Optional.of(accountNumber);
            case "AccountType" -> Optional.of(accountType);
            case "LpRoleOptional" -> Optional.of(lpRoleOptional);
            case "OpenClose" -> Optional.of(openClose);
            case "OriginalInvestDecisWFirmShortCode" -> Optional.of(originalInvestDecisWFirmShortCode);
            case "OriginalNonExecBrokerShortCode" -> Optional.of(originalNonExecBrokerShortCode);
            case "EventClientIdShortCode" -> Optional.of(eventClientIdShortCode);
            case "EventExecWFirmShortCode" -> Optional.of(eventExecWFirmShortCode);
            case "OriginalClientIdShortCode" -> Optional.of(originalClientIdShortCode);
            case "OriginalExecWFirmShortCode" -> Optional.of(originalExecWFirmShortCode);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "LisTransactionId" -> Optional.of(lisTransactionId);
            case "ParentExecId" -> Optional.of(parentExecId);
            case "ParentSymbolIndex" -> Optional.of(parentSymbolIndex);
            case "TradeUniqueIdentifier" -> Optional.of(tradeUniqueIdentifier);
            case "ParentTradeUniqueIdentifier" -> Optional.of(parentTradeUniqueIdentifier);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeBustNotificationMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(tradeBustNotificationShortCodesDetailsNonModifiableGroups.diffFields(message.tradeBustNotificationShortCodesDetailsNonModifiableGroups));
        changed.addAll(tradeBustNotificationShortCodesDetailsModifiableGroups.diffFields(message.tradeBustNotificationShortCodesDetailsModifiableGroups));
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
            tradeBustNotificationShortCodesDetailsNonModifiableGroups.toFormattedString(builder, options);
            builder.append(", ");
            tradeBustNotificationShortCodesDetailsModifiableGroups.toFormattedString(builder, options);
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
        tradeBustNotificationShortCodesDetailsNonModifiableGroups.toFormattedString(builder, nested);
        tradeBustNotificationShortCodesDetailsModifiableGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof TradeBustNotificationMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && tradeBustNotificationShortCodesDetailsNonModifiableGroups.equals(message.tradeBustNotificationShortCodesDetailsNonModifiableGroups) && tradeBustNotificationShortCodesDetailsModifiableGroups.equals(message.tradeBustNotificationShortCodesDetailsModifiableGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, tradeBustNotificationShortCodesDetailsNonModifiableGroups, tradeBustNotificationShortCodesDetailsModifiableGroups);
    }
}
